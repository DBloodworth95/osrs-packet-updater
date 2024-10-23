import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class by {
   public static final int cu = 85;
   static ps ap = new ps();
   static final int ob = 0;

   public static void an(vm var0) {
      br var1 = (br)ap.ai();
      if (var1 != null) {
         int var2 = -1689308347 * var0.am;
         var0.bw(var1.ap * 2051507171, (byte)112);

         for(int var3 = 0; var3 < var1.aw * -50998507; ++var3) {
            if (var1.aj[var3] != 0) {
               var0.bo(var1.aj[var3], 1742020694);
            } else {
               try {
                  int var4 = var1.ak[var3];
                  Field var5;
                  int var6;
                  if (var4 == 0) {
                     var5 = var1.ai[var3];
                     var6 = var5.getInt((Object)null);
                     var0.bo(0, 920813076);
                     var0.bw(var6, (byte)25);
                  } else if (1 == var4) {
                     var5 = var1.ai[var3];
                     var5.setInt((Object)null, var1.ay[var3]);
                     var0.bo(0, -1775542221);
                  } else if (var4 == 2) {
                     var5 = var1.ai[var3];
                     var6 = var5.getModifiers();
                     var0.bo(0, -768448899);
                     var0.bw(var6, (byte)92);
                  }

                  Method var22;
                  if (3 != var4) {
                     if (4 == var4) {
                        var22 = var1.as[var3];
                        var6 = var22.getModifiers();
                        var0.bo(0, 226413907);
                        var0.bw(var6, (byte)95);
                     }
                  } else {
                     var22 = var1.as[var3];
                     byte[][] var23 = var1.ae[var3];
                     Object[] var7 = new Object[var23.length];

                     for(int var8 = 0; var8 < var23.length; ++var8) {
                        ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var23[var8]));
                        var7[var8] = var9.readObject();
                     }

                     Object var24 = var22.invoke((Object)null, var7);
                     if (var24 == null) {
                        var0.bo(0, -86079840);
                     } else if (var24 instanceof Number) {
                        var0.bo(1, 1803192843);
                        var0.bf(((Number)var24).longValue());
                     } else if (var24 instanceof String) {
                        var0.bo(2, -514297171);
                        var0.be((String)var24, (byte)90);
                     } else {
                        var0.bo(4, 306660209);
                     }
                  }
               } catch (ClassNotFoundException var10) {
                  var0.bo(-10, 959290624);
               } catch (InvalidClassException var11) {
                  var0.bo(-11, -1248182573);
               } catch (StreamCorruptedException var12) {
                  var0.bo(-12, 447318577);
               } catch (OptionalDataException var13) {
                  var0.bo(-13, 810961423);
               } catch (IllegalAccessException var14) {
                  var0.bo(-14, 1365663473);
               } catch (IllegalArgumentException var15) {
                  var0.bo(-15, 1017498917);
               } catch (InvocationTargetException var16) {
                  var0.bo(-16, -849453337);
               } catch (SecurityException var17) {
                  var0.bo(-17, -1076416522);
               } catch (IOException var18) {
                  var0.bo(-18, -510508474);
               } catch (NullPointerException var19) {
                  var0.bo(-19, 1821233493);
               } catch (Exception var20) {
                  var0.bo(-20, 1852212686);
               } catch (Throwable var21) {
                  var0.bo(-21, -782867053);
               }
            }
         }

         var0.dt(var2, -121992435);
         var1.kf();
      }
   }

   public static void ay() {
      ap = new ps();
   }

   public static void as() {
      ap = new ps();
   }

   by() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "by.<init>(" + ')');
      }
   }

   public static void am() {
      ap = new ps();
   }

   public static boolean at() {
      br var0 = (br)ap.ai();
      return null != var0;
   }

   public static void az(vl var0, int var1) {
      br var2 = new br();
      var2.aw = var0.cy((short)-1985) * -147397571;
      var2.ap = var0.ch(1203709469) * 431348171;
      var2.ak = new int[-50998507 * var2.aw];
      var2.aj = new int[var2.aw * -50998507];
      var2.ai = new Field[var2.aw * -50998507];
      var2.ay = new int[var2.aw * -50998507];
      var2.as = new Method[-50998507 * var2.aw];
      var2.ae = new byte[-50998507 * var2.aw][][];

      for(int var3 = 0; var3 < -50998507 * var2.aw; ++var3) {
         try {
            int var4 = var0.cy((short)-6611);
            String var5;
            String var6;
            int var7;
            if (0 != var4 && var4 != 1 && 2 != var4) {
               if (var4 == 3 || var4 == 4) {
                  var5 = var0.cw(1955660596);
                  var6 = var0.cw(2052452414);
                  var7 = var0.cy((short)-31418);
                  String[] var8 = new String[var7];

                  for(int var9 = 0; var9 < var7; ++var9) {
                     var8[var9] = var0.cw(1995099603);
                  }

                  String var25 = var0.cw(2117978675);
                  byte[][] var10 = new byte[var7][];
                  int var12;
                  if (3 == var4) {
                     for(int var11 = 0; var11 < var7; ++var11) {
                        var12 = var0.ch(1203709469);
                        var10[var11] = new byte[var12];
                        var0.cr(var10[var11], 0, var12, (byte)13);
                     }
                  }

                  var2.ak[var3] = var4;
                  Class[] var26 = new Class[var7];

                  for(var12 = 0; var12 < var7; ++var12) {
                     var26[var12] = nc.ai(var8[var12], (byte)99);
                  }

                  Class var27 = nc.ai(var25, (byte)64);
                  if (nc.ai(var5, (byte)42).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = nc.ai(var5, (byte)-53).getDeclaredMethods();
                  Method[] var14 = var13;

                  for(int var15 = 0; var15 < var14.length; ++var15) {
                     Method var16 = var14[var15];
                     if (var16.getName().equals(var6)) {
                        Class[] var17 = var16.getParameterTypes();
                        if (var26.length == var17.length) {
                           boolean var18 = true;

                           for(int var19 = 0; var19 < var26.length; ++var19) {
                              if (var26[var19] != var17[var19]) {
                                 var18 = false;
                                 break;
                              }
                           }

                           if (var18 && var27 == var16.getReturnType()) {
                              var2.as[var3] = var16;
                           }
                        }
                     }
                  }

                  var2.ae[var3] = var10;
               }
            } else {
               var5 = var0.cw(1922545834);
               var6 = var0.cw(2110733372);
               var7 = 0;
               if (var4 == 1) {
                  var7 = var0.ch(1203709469);
               }

               var2.ak[var3] = var4;
               var2.ay[var3] = var7;
               if (nc.ai(var5, (byte)47).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.ai[var3] = nc.ai(var5, (byte)25).getDeclaredField(var6);
            }
         } catch (ClassNotFoundException var20) {
            var2.aj[var3] = -1;
         } catch (SecurityException var21) {
            var2.aj[var3] = -2;
         } catch (NullPointerException var22) {
            var2.aj[var3] = -3;
         } catch (Exception var23) {
            var2.aj[var3] = -4;
         } catch (Throwable var24) {
            var2.aj[var3] = -5;
         }
      }

      ap.aw(var2);
   }

   static ta fs(int var0) {
      try {
         return fu.ve;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "by.fs(" + ')');
      }
   }

   public static void ao(vm var0) {
      br var1 = (br)ap.ai();
      if (var1 != null) {
         int var2 = -1689308347 * var0.am;
         var0.bw(var1.ap * 2051507171, (byte)111);

         for(int var3 = 0; var3 < var1.aw * -50998507; ++var3) {
            if (var1.aj[var3] != 0) {
               var0.bo(var1.aj[var3], 544597744);
            } else {
               try {
                  int var4 = var1.ak[var3];
                  Field var5;
                  int var6;
                  if (var4 == 0) {
                     var5 = var1.ai[var3];
                     var6 = var5.getInt((Object)null);
                     var0.bo(0, 555183308);
                     var0.bw(var6, (byte)13);
                  } else if (1 == var4) {
                     var5 = var1.ai[var3];
                     var5.setInt((Object)null, var1.ay[var3]);
                     var0.bo(0, 862567669);
                  } else if (var4 == 2) {
                     var5 = var1.ai[var3];
                     var6 = var5.getModifiers();
                     var0.bo(0, -261366308);
                     var0.bw(var6, (byte)106);
                  }

                  Method var22;
                  if (3 != var4) {
                     if (4 == var4) {
                        var22 = var1.as[var3];
                        var6 = var22.getModifiers();
                        var0.bo(0, 832666931);
                        var0.bw(var6, (byte)53);
                     }
                  } else {
                     var22 = var1.as[var3];
                     byte[][] var23 = var1.ae[var3];
                     Object[] var7 = new Object[var23.length];

                     for(int var8 = 0; var8 < var23.length; ++var8) {
                        ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var23[var8]));
                        var7[var8] = var9.readObject();
                     }

                     Object var24 = var22.invoke((Object)null, var7);
                     if (var24 == null) {
                        var0.bo(0, -432231557);
                     } else if (var24 instanceof Number) {
                        var0.bo(1, -1336096306);
                        var0.bf(((Number)var24).longValue());
                     } else if (var24 instanceof String) {
                        var0.bo(2, 1860917129);
                        var0.be((String)var24, (byte)93);
                     } else {
                        var0.bo(4, 1182873965);
                     }
                  }
               } catch (ClassNotFoundException var10) {
                  var0.bo(-10, 1872142219);
               } catch (InvalidClassException var11) {
                  var0.bo(-11, 1265048605);
               } catch (StreamCorruptedException var12) {
                  var0.bo(-12, 1247003711);
               } catch (OptionalDataException var13) {
                  var0.bo(-13, 657293052);
               } catch (IllegalAccessException var14) {
                  var0.bo(-14, -400251836);
               } catch (IllegalArgumentException var15) {
                  var0.bo(-15, 1355357131);
               } catch (InvocationTargetException var16) {
                  var0.bo(-16, -1192501021);
               } catch (SecurityException var17) {
                  var0.bo(-17, -959344480);
               } catch (IOException var18) {
                  var0.bo(-18, 1489903532);
               } catch (NullPointerException var19) {
                  var0.bo(-19, -1359286654);
               } catch (Exception var20) {
                  var0.bo(-20, -1288912333);
               } catch (Throwable var21) {
                  var0.bo(-21, 1672298452);
               }
            }
         }

         var0.dt(var2, -121992435);
         var1.kf();
      }
   }

   static Class ac(String var0) throws ClassNotFoundException {
      if (var0.equals("B")) {
         return Byte.TYPE;
      } else if (var0.equals("I")) {
         return Integer.TYPE;
      } else if (var0.equals("S")) {
         return Short.TYPE;
      } else if (var0.equals("J")) {
         return Long.TYPE;
      } else if (var0.equals("Z")) {
         return Boolean.TYPE;
      } else if (var0.equals("F")) {
         return Float.TYPE;
      } else if (var0.equals("D")) {
         return Double.TYPE;
      } else if (var0.equals("C")) {
         return Character.TYPE;
      } else {
         return var0.equals("void") ? Void.TYPE : Class.forName(var0);
      }
   }

   public static void ar(vl var0, int var1) {
      br var2 = new br();
      var2.aw = var0.cy((short)-6104) * -147397571;
      var2.ap = var0.ch(1203709469) * 431348171;
      var2.ak = new int[-50998507 * var2.aw];
      var2.aj = new int[var2.aw * -2146727464];
      var2.ai = new Field[var2.aw * 1272752086];
      var2.ay = new int[var2.aw * -1714428026];
      var2.as = new Method[-900476608 * var2.aw];
      var2.ae = new byte[-592450912 * var2.aw][][];

      for(int var3 = 0; var3 < 70786162 * var2.aw; ++var3) {
         try {
            int var4 = var0.cy((short)-26023);
            String var5;
            String var6;
            int var7;
            if (0 != var4 && var4 != 1 && 2 != var4) {
               if (var4 == 3 || var4 == 4) {
                  var5 = var0.cw(2109116485);
                  var6 = var0.cw(2012449603);
                  var7 = var0.cy((short)-15061);
                  String[] var8 = new String[var7];

                  for(int var9 = 0; var9 < var7; ++var9) {
                     var8[var9] = var0.cw(2023406480);
                  }

                  String var25 = var0.cw(2038393191);
                  byte[][] var10 = new byte[var7][];
                  int var12;
                  if (3 == var4) {
                     for(int var11 = 0; var11 < var7; ++var11) {
                        var12 = var0.ch(1203709469);
                        var10[var11] = new byte[var12];
                        var0.cr(var10[var11], 0, var12, (byte)18);
                     }
                  }

                  var2.ak[var3] = var4;
                  Class[] var26 = new Class[var7];

                  for(var12 = 0; var12 < var7; ++var12) {
                     var26[var12] = nc.ai(var8[var12], (byte)14);
                  }

                  Class var27 = nc.ai(var25, (byte)-111);
                  if (nc.ai(var5, (byte)-35).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = nc.ai(var5, (byte)6).getDeclaredMethods();
                  Method[] var14 = var13;

                  for(int var15 = 0; var15 < var14.length; ++var15) {
                     Method var16 = var14[var15];
                     if (var16.getName().equals(var6)) {
                        Class[] var17 = var16.getParameterTypes();
                        if (var26.length == var17.length) {
                           boolean var18 = true;

                           for(int var19 = 0; var19 < var26.length; ++var19) {
                              if (var26[var19] != var17[var19]) {
                                 var18 = false;
                                 break;
                              }
                           }

                           if (var18 && var27 == var16.getReturnType()) {
                              var2.as[var3] = var16;
                           }
                        }
                     }
                  }

                  var2.ae[var3] = var10;
               }
            } else {
               var5 = var0.cw(2008625260);
               var6 = var0.cw(1917405475);
               var7 = 0;
               if (var4 == 1) {
                  var7 = var0.ch(1203709469);
               }

               var2.ak[var3] = var4;
               var2.ay[var3] = var7;
               if (nc.ai(var5, (byte)-3).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.ai[var3] = nc.ai(var5, (byte)-110).getDeclaredField(var6);
            }
         } catch (ClassNotFoundException var20) {
            var2.aj[var3] = -1;
         } catch (SecurityException var21) {
            var2.aj[var3] = -2;
         } catch (NullPointerException var22) {
            var2.aj[var3] = -3;
         } catch (Exception var23) {
            var2.aj[var3] = -636729555;
         } catch (Throwable var24) {
            var2.aj[var3] = -5;
         }
      }

      ap.aw(var2);
   }

   public static void ab(vl var0, int var1) {
      br var2 = new br();
      var2.aw = var0.cy((short)-5429) * -147397571;
      var2.ap = var0.ch(1203709469) * 2118924090;
      var2.ak = new int[-1405383407 * var2.aw];
      var2.aj = new int[var2.aw * -50998507];
      var2.ai = new Field[var2.aw * -50998507];
      var2.ay = new int[var2.aw * 1117729157];
      var2.as = new Method[-975223327 * var2.aw];
      var2.ae = new byte[-1535996724 * var2.aw][][];

      for(int var3 = 0; var3 < -1438941170 * var2.aw; ++var3) {
         try {
            int var4 = var0.cy((short)-31227);
            String var5;
            String var6;
            int var7;
            if (0 != var4 && var4 != 1 && 2 != var4) {
               if (var4 == 3 || var4 == 4) {
                  var5 = var0.cw(2069964707);
                  var6 = var0.cw(2075282411);
                  var7 = var0.cy((short)-25569);
                  String[] var8 = new String[var7];

                  for(int var9 = 0; var9 < var7; ++var9) {
                     var8[var9] = var0.cw(2069548196);
                  }

                  String var25 = var0.cw(2102488378);
                  byte[][] var10 = new byte[var7][];
                  int var12;
                  if (3 == var4) {
                     for(int var11 = 0; var11 < var7; ++var11) {
                        var12 = var0.ch(1203709469);
                        var10[var11] = new byte[var12];
                        var0.cr(var10[var11], 0, var12, (byte)80);
                     }
                  }

                  var2.ak[var3] = var4;
                  Class[] var26 = new Class[var7];

                  for(var12 = 0; var12 < var7; ++var12) {
                     var26[var12] = nc.ai(var8[var12], (byte)9);
                  }

                  Class var27 = nc.ai(var25, (byte)-1);
                  if (nc.ai(var5, (byte)83).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = nc.ai(var5, (byte)-4).getDeclaredMethods();
                  Method[] var14 = var13;

                  for(int var15 = 0; var15 < var14.length; ++var15) {
                     Method var16 = var14[var15];
                     if (var16.getName().equals(var6)) {
                        Class[] var17 = var16.getParameterTypes();
                        if (var26.length == var17.length) {
                           boolean var18 = true;

                           for(int var19 = 0; var19 < var26.length; ++var19) {
                              if (var26[var19] != var17[var19]) {
                                 var18 = false;
                                 break;
                              }
                           }

                           if (var18 && var27 == var16.getReturnType()) {
                              var2.as[var3] = var16;
                           }
                        }
                     }
                  }

                  var2.ae[var3] = var10;
               }
            } else {
               var5 = var0.cw(2088039072);
               var6 = var0.cw(2056395047);
               var7 = 0;
               if (var4 == 1) {
                  var7 = var0.ch(1203709469);
               }

               var2.ak[var3] = var4;
               var2.ay[var3] = var7;
               if (nc.ai(var5, (byte)68).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.ai[var3] = nc.ai(var5, (byte)-53).getDeclaredField(var6);
            }
         } catch (ClassNotFoundException var20) {
            var2.aj[var3] = -1;
         } catch (SecurityException var21) {
            var2.aj[var3] = -2;
         } catch (NullPointerException var22) {
            var2.aj[var3] = -1699979397;
         } catch (Exception var23) {
            var2.aj[var3] = -1080372384;
         } catch (Throwable var24) {
            var2.aj[var3] = -5;
         }
      }

      ap.aw(var2);
   }

   public static void af(vm var0) {
      br var1 = (br)ap.ai();
      if (var1 != null) {
         int var2 = -1689308347 * var0.am;
         var0.bw(var1.ap * 2051507171, (byte)82);

         for(int var3 = 0; var3 < var1.aw * -50998507; ++var3) {
            if (var1.aj[var3] != 0) {
               var0.bo(var1.aj[var3], 256253258);
            } else {
               try {
                  int var4 = var1.ak[var3];
                  Field var5;
                  int var6;
                  if (var4 == 0) {
                     var5 = var1.ai[var3];
                     var6 = var5.getInt((Object)null);
                     var0.bo(0, -1160782882);
                     var0.bw(var6, (byte)69);
                  } else if (1 == var4) {
                     var5 = var1.ai[var3];
                     var5.setInt((Object)null, var1.ay[var3]);
                     var0.bo(0, 982259811);
                  } else if (var4 == 2) {
                     var5 = var1.ai[var3];
                     var6 = var5.getModifiers();
                     var0.bo(0, 1060945034);
                     var0.bw(var6, (byte)47);
                  }

                  Method var22;
                  if (3 != var4) {
                     if (4 == var4) {
                        var22 = var1.as[var3];
                        var6 = var22.getModifiers();
                        var0.bo(0, 1675186390);
                        var0.bw(var6, (byte)86);
                     }
                  } else {
                     var22 = var1.as[var3];
                     byte[][] var23 = var1.ae[var3];
                     Object[] var7 = new Object[var23.length];

                     for(int var8 = 0; var8 < var23.length; ++var8) {
                        ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var23[var8]));
                        var7[var8] = var9.readObject();
                     }

                     Object var24 = var22.invoke((Object)null, var7);
                     if (var24 == null) {
                        var0.bo(0, -2048185964);
                     } else if (var24 instanceof Number) {
                        var0.bo(1, -101510702);
                        var0.bf(((Number)var24).longValue());
                     } else if (var24 instanceof String) {
                        var0.bo(2, -1173677313);
                        var0.be((String)var24, (byte)116);
                     } else {
                        var0.bo(4, 1327689445);
                     }
                  }
               } catch (ClassNotFoundException var10) {
                  var0.bo(-10, 561605568);
               } catch (InvalidClassException var11) {
                  var0.bo(-11, -1049111365);
               } catch (StreamCorruptedException var12) {
                  var0.bo(-12, -763791194);
               } catch (OptionalDataException var13) {
                  var0.bo(-13, -2111515130);
               } catch (IllegalAccessException var14) {
                  var0.bo(-14, -1143830275);
               } catch (IllegalArgumentException var15) {
                  var0.bo(-15, -1059428373);
               } catch (InvocationTargetException var16) {
                  var0.bo(-16, -1225091633);
               } catch (SecurityException var17) {
                  var0.bo(-17, 1309573706);
               } catch (IOException var18) {
                  var0.bo(-18, 1412148907);
               } catch (NullPointerException var19) {
                  var0.bo(-19, -1557097710);
               } catch (Exception var20) {
                  var0.bo(-20, -672069304);
               } catch (Throwable var21) {
                  var0.bo(-21, -1733409698);
               }
            }
         }

         var0.dt(var2, -121992435);
         var1.kf();
      }
   }

   public static void ae() {
      ap = new ps();
   }

   static Class ad(String var0) throws ClassNotFoundException {
      if (var0.equals("B")) {
         return Byte.TYPE;
      } else if (var0.equals("I")) {
         return Integer.TYPE;
      } else if (var0.equals("S")) {
         return Short.TYPE;
      } else if (var0.equals("J")) {
         return Long.TYPE;
      } else if (var0.equals("Z")) {
         return Boolean.TYPE;
      } else if (var0.equals("F")) {
         return Float.TYPE;
      } else if (var0.equals("D")) {
         return Double.TYPE;
      } else if (var0.equals("C")) {
         return Character.TYPE;
      } else {
         return var0.equals("void") ? Void.TYPE : Class.forName(var0);
      }
   }

   public static boolean au() {
      br var0 = (br)ap.ai();
      return null != var0;
   }

   public static void ag(vl var0, int var1) {
      br var2 = new br();
      var2.aw = var0.cy((short)-20594) * -210525183;
      var2.ap = var0.ch(1203709469) * 431348171;
      var2.ak = new int[-50998507 * var2.aw];
      var2.aj = new int[var2.aw * -50998507];
      var2.ai = new Field[var2.aw * -50998507];
      var2.ay = new int[var2.aw * -50998507];
      var2.as = new Method[-50998507 * var2.aw];
      var2.ae = new byte[403978459 * var2.aw][][];

      for(int var3 = 0; var3 < -50998507 * var2.aw; ++var3) {
         try {
            int var4 = var0.cy((short)-10850);
            String var5;
            String var6;
            int var7;
            if (0 != var4 && var4 != 1 && 2 != var4) {
               if (var4 == 3 || var4 == 4) {
                  var5 = var0.cw(1969407204);
                  var6 = var0.cw(1919541393);
                  var7 = var0.cy((short)-15313);
                  String[] var8 = new String[var7];

                  for(int var9 = 0; var9 < var7; ++var9) {
                     var8[var9] = var0.cw(1941706938);
                  }

                  String var25 = var0.cw(2121390424);
                  byte[][] var10 = new byte[var7][];
                  int var12;
                  if (3 == var4) {
                     for(int var11 = 0; var11 < var7; ++var11) {
                        var12 = var0.ch(1203709469);
                        var10[var11] = new byte[var12];
                        var0.cr(var10[var11], 0, var12, (byte)120);
                     }
                  }

                  var2.ak[var3] = var4;
                  Class[] var26 = new Class[var7];

                  for(var12 = 0; var12 < var7; ++var12) {
                     var26[var12] = nc.ai(var8[var12], (byte)39);
                  }

                  Class var27 = nc.ai(var25, (byte)24);
                  if (nc.ai(var5, (byte)-93).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = nc.ai(var5, (byte)-42).getDeclaredMethods();
                  Method[] var14 = var13;

                  for(int var15 = 0; var15 < var14.length; ++var15) {
                     Method var16 = var14[var15];
                     if (var16.getName().equals(var6)) {
                        Class[] var17 = var16.getParameterTypes();
                        if (var26.length == var17.length) {
                           boolean var18 = true;

                           for(int var19 = 0; var19 < var26.length; ++var19) {
                              if (var26[var19] != var17[var19]) {
                                 var18 = false;
                                 break;
                              }
                           }

                           if (var18 && var27 == var16.getReturnType()) {
                              var2.as[var3] = var16;
                           }
                        }
                     }
                  }

                  var2.ae[var3] = var10;
               }
            } else {
               var5 = var0.cw(1959290312);
               var6 = var0.cw(1903840868);
               var7 = 0;
               if (var4 == 1) {
                  var7 = var0.ch(1203709469);
               }

               var2.ak[var3] = var4;
               var2.ay[var3] = var7;
               if (nc.ai(var5, (byte)39).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.ai[var3] = nc.ai(var5, (byte)26).getDeclaredField(var6);
            }
         } catch (ClassNotFoundException var20) {
            var2.aj[var3] = -1;
         } catch (SecurityException var21) {
            var2.aj[var3] = -1557613257;
         } catch (NullPointerException var22) {
            var2.aj[var3] = -3;
         } catch (Exception var23) {
            var2.aj[var3] = -4;
         } catch (Throwable var24) {
            var2.aj[var3] = -5;
         }
      }

      ap.aw(var2);
   }

   static final void in(dw var0, int var1) {
      try {
         int var2 = Math.max(1, var0.du * -1375768957 - -330508271 * client.dt);
         int var3 = -1977652096 * var0.dr + -423465920 * var0.bp;
         int var4 = -423465920 * var0.bp + var0.dg * -592373120;
         var0.bk += -124967775 * ((var3 - var0.bk * -1517174943) / var2);
         var0.bb += (var4 - 669935203 * var0.bb) / var2 * 1443056459;
         var0.eg = 0;
         var0.dy = var0.dl * -880529299;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "by.in(" + ')');
      }
   }
}
