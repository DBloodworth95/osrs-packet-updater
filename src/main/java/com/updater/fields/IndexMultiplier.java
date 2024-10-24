package com.updater.fields;

import com.updater.PatternSearcher;
import com.updater.SearchContext;
import spoon.Launcher;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;

import java.io.File;

/*
 * Steps to find are as follows:
 * 1. Search for a class which instantiates an array of itself with a size of 300, this is the packet buffer node class.
 * 2. Search for methods which have 3 or more else if blocks.
 * 3. Those else if's will be trying to assign the same variable, e.g: var2.x = new y(20);
 * 4. Extract x, this is the PacketBufferNodeFieldName.
 * 5. Once PacketBufferNodeFieldName is found, look back to the class properties to find its type.
 * 6. Find what the type extends.
 * 7. Once found, find a method which tries to assign a value to the same array more than 3 times consecutively.
 * 8. Once found, find the second int on that line, that is out index multiplier.
 */
public class IndexMultiplier implements PatternSearcher {
    private String indexMultiplier = "Unknown";

    @Override
    public boolean matches(File file, String content, SearchContext context) {
        String packetBufferNodeClassName = context.getResolvedName("packetBufferNodeClassName");
        if (packetBufferNodeClassName == null || packetBufferNodeClassName.equalsIgnoreCase("unknown")) {
            return false;
        }

        try {
            Launcher launcher = new Launcher();
            launcher.addInputResource(file.getPath());
            launcher.buildModel();

            CtClass<?> packetBufferNodeClass = findPacketBufferNodeClass(launcher, context);
            if (packetBufferNodeClass == null) {
                return false;
            }

            CtMethod<?> methodWithElseIfs = findMethodWithElseIfs(packetBufferNodeClass);
            if (methodWithElseIfs == null) {
                return false;
            }

            String packetBufferNodeFieldName = findPacketBufferNodeFieldName(methodWithElseIfs);
            if (packetBufferNodeFieldName == null) {
                return false;
            }

            String fieldType = findFieldType(packetBufferNodeClass, packetBufferNodeFieldName);
            if (fieldType == null) {
                return false;
            }

            String extendedClass = getExtendedClass(fieldType, file.getParent());
            if (extendedClass != null) {
                indexMultiplier = findIndexMultiplier(extendedClass, file.getParent());
                return !indexMultiplier.equals("Unknown");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public String getObfuscatedName() {
        return indexMultiplier;
    }

    @Override
    public String getDescription() {
        return "indexMultiplier";
    }

    private CtClass<?> findPacketBufferNodeClass(Launcher launcher, SearchContext context) {
        String packetBufferNodeClassName = context.getResolvedName("packetBufferNodeClassName");
        return launcher.getFactory().Class().get(packetBufferNodeClassName);
    }

    private CtMethod<?> findMethodWithElseIfs(CtClass<?> ctClass) {
        return ctClass.getMethods().stream()
                .filter(method -> {
                    long elseIfCount = method.getBody()
                            .getElements(new TypeFilter<>(CtIf.class))
                            .stream()
                            .filter(ctIf -> ctIf.getElseStatement() != null)
                            .count();
                    return elseIfCount >= 3;
                })
                .findFirst()
                .orElse(null);
    }

    private String findPacketBufferNodeFieldName(CtMethod<?> method) {
        for (CtIf ctIf : method.getBody().getElements(new TypeFilter<>(CtIf.class))) {
            String thenPart = ctIf.getThenStatement().toString();
            if (thenPart.contains("=")) {
                String fieldName = thenPart.split("=")[0].trim();
                if (fieldName.contains(".")) {
                    return fieldName.split("\\.")[1].trim();
                }
            }
        }
        return null;
    }

    private String findFieldType(CtClass<?> ctClass, String fieldName) {
        for (CtFieldReference<?> field : ctClass.getDeclaredFields()) {
            if (field.getSimpleName().equals(fieldName)) {
                return field.getType().getSimpleName();
            }
        }
        return null;
    }

    private String getExtendedClass(String fieldType, String sourceDirectory) {
        try {
            Launcher fieldLauncher = new Launcher();
            String classFilePath = sourceDirectory + "/" + fieldType + ".java";
            fieldLauncher.addInputResource(classFilePath);
            fieldLauncher.buildModel();

            CtClass<?> fieldClass = fieldLauncher.getFactory().Class().get(fieldType);
            if (fieldClass == null) {
                System.out.println("Failed to resolve the class for field type: " + fieldType);
                return null;
            }

            CtTypeReference<?> superClassReference = fieldClass.getSuperclass();
            if (superClassReference == null) {
                System.out.println("No superclass found for field class: " + fieldClass.getSimpleName());
                return null;
            }

            return superClassReference.getSimpleName();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private String findIndexMultiplier(String extendedClassName, String path) {
        try {
            Launcher fieldLauncher = new Launcher();
            String classFilePath = path + "/" + extendedClassName + ".java";
            fieldLauncher.addInputResource(classFilePath);
            fieldLauncher.buildModel();

            CtClass<?> extendedClass = fieldLauncher.getFactory().Class().get(extendedClassName);
            if (extendedClass == null) {
                System.out.println("Failed to resolve the class: " + extendedClassName);
                return "Unknown";
            }

            for (CtMethod<?> method : extendedClass.getMethods()) {
                int consecutiveAssignments = 0;
                String lastArrayName = null;
                if (method.getBody() != null) {
                    for (CtStatement statement : method.getBody().getStatements()) {
                        String statementStr = statement.toString().trim();
                        if (statementStr.contains("[") && statementStr.contains("]") && statementStr.contains("=")) {
                            String arrayName = statementStr.substring(0, statementStr.indexOf('[')).trim();
                            if (arrayName.startsWith("this.")) {
                                arrayName = arrayName.substring(5);
                            }

                            if (lastArrayName != null && lastArrayName.equals(arrayName)) {
                                consecutiveAssignments++;
                            } else {
                                consecutiveAssignments = 1;
                            }
                            lastArrayName = arrayName;

                            if (consecutiveAssignments >= 3) {
                                String[] parts = statementStr.split("\\s+");
                                int foundNumbers = 0;
                                for (String part : parts) {
                                    part = part.replaceAll("[^\\d-]", "");
                                    try {
                                        int number = Integer.parseInt(part);
                                        if (Math.abs(number) > 9) {
                                            foundNumbers++;
                                            if (foundNumbers == 2) {
                                                return String.valueOf(number);
                                            }
                                        }
                                    } catch (NumberFormatException ignored) {
                                    }
                                }
                            }
                        } else {
                            lastArrayName = null;
                            consecutiveAssignments = 0;
                        }
                    }
                }
            }
            return "Unknown";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
