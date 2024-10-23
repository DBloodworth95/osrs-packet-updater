import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class if {
   static boolean ap = false;
   public static final int ax = 4;
   static or eo;
   static Hashtable ak = new Hashtable(16);

   public static void am() {
      ak.clear();
   }

   static File as(String var0) {
      if (!ap) {
         throw new RuntimeException("");
      } else {
         File var1 = (File)ak.get(var0);
         if (var1 != null) {
            return var1;
         } else {
            File var2 = new File(ac.aw, var0);
            RandomAccessFile var3 = null;

            try {
               File var4 = new File(var2.getParent());
               if (!var4.exists()) {
                  throw new RuntimeException("");
               } else {
                  var3 = new RandomAccessFile(var2, "rw");
                  int var5 = var3.read();
                  var3.seek(0L);
                  var3.write(var5);
                  var3.seek(0L);
                  var3.close();
                  ak.put(var0, var2);
                  return var2;
               }
            } catch (Exception var7) {
               try {
                  if (null != var3) {
                     var3.close();
                     var3 = null;
                  }
               } catch (Exception var6) {
               }

               throw new RuntimeException();
            }
         }
      }
   }

   static void aj(File var0) {
      ac.aw = var0;
      if (!ac.aw.exists()) {
         throw new RuntimeException("");
      } else {
         ap = true;
      }
   }

   static void ai(File var0) {
      ac.aw = var0;
      if (!ac.aw.exists()) {
         throw new RuntimeException("");
      } else {
         ap = true;
      }
   }

   static void ay(File var0) {
      ac.aw = var0;
      if (!ac.aw.exists()) {
         throw new RuntimeException("");
      } else {
         ap = true;
      }
   }

   static ih ab(vl var0, byte var1) {
      try {
         if (null != var0) {
            boolean var2 = false;
            int var3 = -1;
            boolean var4 = false;
            boolean var5 = false;
            boolean var6 = false;
            int var8 = var0.ce(2013291518);
            if (vw.ap * -1964001905 >= 226) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               var3 = var0.cy((short)-8049);
            }

            int var9 = var0.cy((short)-11179);
            int var10 = var0.cy((short)-18337);
            int var11 = var0.cy((short)-14616);
            if (var8 >= 1) {
               if (var1 <= 1) {
                  throw new IllegalStateException();
               }

               if (var9 >= 1) {
                  if (var1 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (var10 >= 0) {
                     if (var1 <= 1) {
                        throw new IllegalStateException();
                     }

                     if (var11 >= 0) {
                        return new ih(var8, var3, var9, var10, var11);
                     }
                  }
               }
            }
         }

         return null;
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "if.ab(" + ')');
      }
   }

   public static void ae() {
      ak.clear();
   }

   if() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "if.<init>(" + ')');
      }
   }

   public static void at() {
      ak.clear();
   }

   public static void au() {
      ak.clear();
   }

   public static void an() {
      ak.clear();
   }

   public static String af(String var0, int var1) {
      try {
         int var2 = var0.length();
         char[] var3 = new char[var2];
         byte var4 = 2;

         for(int var5 = 0; var5 < var2; ++var5) {
            if (var1 == 73413862) {
               throw new IllegalStateException();
            }

            char var6 = var0.charAt(var5);
            if (0 == var4) {
               if (var1 == 73413862) {
                  throw new IllegalStateException();
               }

               var6 = Character.toLowerCase(var6);
            } else {
               label97: {
                  if (var4 != 2) {
                     if (var1 == 73413862) {
                        throw new IllegalStateException();
                     }

                     if (!Character.isUpperCase(var6)) {
                        break label97;
                     }

                     if (var1 == 73413862) {
                        throw new IllegalStateException();
                     }
                  }

                  var6 = aw.aj(var6, 872304592);
               }
            }

            if (Character.isLetter(var6)) {
               if (var1 == 73413862) {
                  throw new IllegalStateException();
               }

               var4 = 0;
            } else {
               label98: {
                  if ('.' != var6) {
                     if (var1 == 73413862) {
                        throw new IllegalStateException();
                     }

                     if ('?' != var6) {
                        if (var1 == 73413862) {
                           throw new IllegalStateException();
                        }

                        if ('!' != var6) {
                           if (Character.isSpaceChar(var6)) {
                              if (var1 == 73413862) {
                                 throw new IllegalStateException();
                              }

                              if (2 != var4) {
                                 if (var1 == 73413862) {
                                    throw new IllegalStateException();
                                 }

                                 var4 = 1;
                              }
                           } else {
                              var4 = 1;
                           }
                           break label98;
                        }

                        if (var1 == 73413862) {
                           throw new IllegalStateException();
                        }
                     }
                  }

                  var4 = 2;
               }
            }

            var3[var5] = var6;
         }

         return new String(var3);
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "if.af(" + ')');
      }
   }
}
