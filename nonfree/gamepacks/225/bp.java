import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class bp {
   static final int bi = 1001;
   public static pr ac = new pr();
   static int og;

   public static int ae(int var0, short var1) {
      try {
         var0 = (var0 >>> 1 & 1431655765) + (var0 & 1431655765);
         var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
         var0 = var0 + (var0 >>> 4) & 252645135;
         var0 += var0 >>> 8;
         var0 += var0 >>> 16;
         return var0 & 255;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "bp.ae(" + ')');
      }
   }

   public static void am(va var0) {
      by var1 = (by)ac.ax();
      if (null != var1) {
         int var2 = -2105999289 * var0.au;
         var0.bv(var1.ac * -469336827, 864463290);

         for(int var3 = 0; var3 < var1.ae * -188310631; ++var3) {
            if (0 != var1.am[var3]) {
               var0.bu(var1.am[var3], (byte)38);
            } else {
               try {
                  int var4 = var1.ag[var3];
                  Field var5;
                  int var6;
                  if (var4 == 0) {
                     var5 = var1.ax[var3];
                     var6 = var5.getInt((Object)null);
                     var0.bu(0, (byte)-72);
                     var0.bv(var6, 463589589);
                  } else if (var4 == 1) {
                     var5 = var1.ax[var3];
                     var5.setInt((Object)null, var1.aq[var3]);
                     var0.bu(0, (byte)-20);
                  } else if (2 == var4) {
                     var5 = var1.ax[var3];
                     var6 = var5.getModifiers();
                     var0.bu(0, (byte)18);
                     var0.bv(var6, 1419524114);
                  }

                  Method var22;
                  if (3 != var4) {
                     if (var4 == 4) {
                        var22 = var1.af[var3];
                        var6 = var22.getModifiers();
                        var0.bu(0, (byte)-40);
                        var0.bv(var6, 1868780250);
                     }
                  } else {
                     var22 = var1.af[var3];
                     byte[][] var23 = var1.at[var3];
                     Object[] var7 = new Object[var23.length];

                     for(int var8 = 0; var8 < var23.length; ++var8) {
                        ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var23[var8]));
                        var7[var8] = var9.readObject();
                     }

                     Object var24 = var22.invoke((Object)null, var7);
                     if (var24 == null) {
                        var0.bu(0, (byte)42);
                     } else if (var24 instanceof Number) {
                        var0.bu(1, (byte)-97);
                        var0.bq(((Number)var24).longValue());
                     } else if (var24 instanceof String) {
                        var0.bu(2, (byte)24);
                        var0.bc((String)var24, -192603966);
                     } else {
                        var0.bu(4, (byte)-42);
                     }
                  }
               } catch (ClassNotFoundException var10) {
                  var0.bu(-122939984, (byte)-55);
               } catch (InvalidClassException var11) {
                  var0.bu(642176436, (byte)27);
               } catch (StreamCorruptedException var12) {
                  var0.bu(-12, (byte)-3);
               } catch (OptionalDataException var13) {
                  var0.bu(794326267, (byte)-1);
               } catch (IllegalAccessException var14) {
                  var0.bu(712704380, (byte)-1);
               } catch (IllegalArgumentException var15) {
                  var0.bu(-15, (byte)1);
               } catch (InvocationTargetException var16) {
                  var0.bu(-16, (byte)13);
               } catch (SecurityException var17) {
                  var0.bu(202096118, (byte)-65);
               } catch (IOException var18) {
                  var0.bu(-1592637078, (byte)32);
               } catch (NullPointerException var19) {
                  var0.bu(-607126734, (byte)4);
               } catch (Exception var20) {
                  var0.bu(-51577807, (byte)29);
               } catch (Throwable var21) {
                  var0.bu(-1500600447, (byte)87);
               }
            }
         }

         var0.dj(var2, -1790447025);
         var1.jb();
      }
   }

   public static void ax(va var0) {
      by var1 = (by)ac.ax();
      if (null != var1) {
         int var2 = -1027766515 * var0.au;
         var0.bv(var1.ac * -995482501, 1941103553);

         for(int var3 = 0; var3 < var1.ae * -188310631; ++var3) {
            if (0 != var1.am[var3]) {
               var0.bu(var1.am[var3], (byte)-75);
            } else {
               try {
                  int var4 = var1.ag[var3];
                  Field var5;
                  int var6;
                  if (var4 == 0) {
                     var5 = var1.ax[var3];
                     var6 = var5.getInt((Object)null);
                     var0.bu(0, (byte)8);
                     var0.bv(var6, 921094446);
                  } else if (var4 == 1) {
                     var5 = var1.ax[var3];
                     var5.setInt((Object)null, var1.aq[var3]);
                     var0.bu(0, (byte)110);
                  } else if (2 == var4) {
                     var5 = var1.ax[var3];
                     var6 = var5.getModifiers();
                     var0.bu(0, (byte)10);
                     var0.bv(var6, 1033356679);
                  }

                  Method var22;
                  if (3 != var4) {
                     if (var4 == 4) {
                        var22 = var1.af[var3];
                        var6 = var22.getModifiers();
                        var0.bu(0, (byte)-19);
                        var0.bv(var6, 1057947613);
                     }
                  } else {
                     var22 = var1.af[var3];
                     byte[][] var23 = var1.at[var3];
                     Object[] var7 = new Object[var23.length];

                     for(int var8 = 0; var8 < var23.length; ++var8) {
                        ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var23[var8]));
                        var7[var8] = var9.readObject();
                     }

                     Object var24 = var22.invoke((Object)null, var7);
                     if (var24 == null) {
                        var0.bu(0, (byte)-62);
                     } else if (var24 instanceof Number) {
                        var0.bu(1, (byte)86);
                        var0.bq(((Number)var24).longValue());
                     } else if (var24 instanceof String) {
                        var0.bu(2, (byte)-101);
                        var0.bc((String)var24, -423508029);
                     } else {
                        var0.bu(4, (byte)-18);
                     }
                  }
               } catch (ClassNotFoundException var10) {
                  var0.bu(-10, (byte)-19);
               } catch (InvalidClassException var11) {
                  var0.bu(-11, (byte)-54);
               } catch (StreamCorruptedException var12) {
                  var0.bu(-12, (byte)-12);
               } catch (OptionalDataException var13) {
                  var0.bu(-13, (byte)21);
               } catch (IllegalAccessException var14) {
                  var0.bu(-14, (byte)18);
               } catch (IllegalArgumentException var15) {
                  var0.bu(-15, (byte)-63);
               } catch (InvocationTargetException var16) {
                  var0.bu(-16, (byte)-36);
               } catch (SecurityException var17) {
                  var0.bu(-17, (byte)112);
               } catch (IOException var18) {
                  var0.bu(-18, (byte)11);
               } catch (NullPointerException var19) {
                  var0.bu(-19, (byte)-8);
               } catch (Exception var20) {
                  var0.bu(-20, (byte)70);
               } catch (Throwable var21) {
                  var0.bu(-21, (byte)65);
               }
            }
         }

         var0.dj(var2, -1449356545);
         var1.jb();
      }
   }

   public static void aq(vf var0, int var1) {
      by var2 = new by();
      var2.ae = var0.cv(952452697) * -867530583;
      var2.ac = var0.cz(-1734056172) * -776201549;
      var2.ag = new int[-188310631 * var2.ae];
      var2.am = new int[var2.ae * -188310631];
      var2.ax = new Field[var2.ae * -188310631];
      var2.aq = new int[-188310631 * var2.ae];
      var2.af = new Method[-188310631 * var2.ae];
      var2.at = new byte[var2.ae * -188310631][][];

      for(int var3 = 0; var3 < -188310631 * var2.ae; ++var3) {
         try {
            int var4 = var0.cv(952452697);
            String var5;
            String var6;
            int var7;
            if (0 != var4 && var4 != 1 && var4 != 2) {
               if (3 == var4 || var4 == 4) {
                  var5 = var0.cs(-956027143);
                  var6 = var0.cs(262310510);
                  var7 = var0.cv(952452697);
                  String[] var8 = new String[var7];

                  for(int var9 = 0; var9 < var7; ++var9) {
                     var8[var9] = var0.cs(-468912094);
                  }

                  String var25 = var0.cs(1742801271);
                  byte[][] var10 = new byte[var7][];
                  int var12;
                  if (var4 == 3) {
                     for(int var11 = 0; var11 < var7; ++var11) {
                        var12 = var0.cz(-1734056172);
                        var10[var11] = new byte[var12];
                        var0.cd(var10[var11], 0, var12, (byte)-19);
                     }
                  }

                  var2.ag[var3] = var4;
                  Class[] var26 = new Class[var7];

                  for(var12 = 0; var12 < var7; ++var12) {
                     var26[var12] = hr.ag(var8[var12], (byte)-10);
                  }

                  Class var27 = hr.ag(var25, (byte)-27);
                  if (hr.ag(var5, (byte)76).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = hr.ag(var5, (byte)-55).getDeclaredMethods();
                  Method[] var14 = var13;

                  for(int var15 = 0; var15 < var14.length; ++var15) {
                     Method var16 = var14[var15];
                     if (var16.getName().equals(var6)) {
                        Class[] var17 = var16.getParameterTypes();
                        if (var26.length == var17.length) {
                           boolean var18 = true;

                           for(int var19 = 0; var19 < var26.length; ++var19) {
                              if (var17[var19] != var26[var19]) {
                                 var18 = false;
                                 break;
                              }
                           }

                           if (var18 && var27 == var16.getReturnType()) {
                              var2.af[var3] = var16;
                           }
                        }
                     }
                  }

                  var2.at[var3] = var10;
               }
            } else {
               var5 = var0.cs(1554213892);
               var6 = var0.cs(1496744661);
               var7 = 0;
               if (1 == var4) {
                  var7 = var0.cz(-1734056172);
               }

               var2.ag[var3] = var4;
               var2.aq[var3] = var7;
               if (hr.ag(var5, (byte)-48).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.ax[var3] = hr.ag(var5, (byte)-76).getDeclaredField(var6);
            }
         } catch (ClassNotFoundException var20) {
            var2.am[var3] = -1;
         } catch (SecurityException var21) {
            var2.am[var3] = -2;
         } catch (NullPointerException var22) {
            var2.am[var3] = -3;
         } catch (Exception var23) {
            var2.am[var3] = -4;
         } catch (Throwable var24) {
            var2.am[var3] = -5;
         }
      }

      ac.ae(var2);
   }

   public static void af(vf var0, int var1) {
      by var2 = new by();
      var2.ae = var0.cv(952452697) * 1549208117;
      var2.ac = var0.cz(-1734056172) * 1345704914;
      var2.ag = new int[-1889210310 * var2.ae];
      var2.am = new int[var2.ae * -188310631];
      var2.ax = new Field[var2.ae * -188310631];
      var2.aq = new int[-188310631 * var2.ae];
      var2.af = new Method[-930129292 * var2.ae];
      var2.at = new byte[var2.ae * -188310631][][];

      for(int var3 = 0; var3 < -966269709 * var2.ae; ++var3) {
         try {
            int var4 = var0.cv(952452697);
            String var5;
            String var6;
            int var7;
            if (0 != var4 && var4 != 1 && var4 != 2) {
               if (3 == var4 || var4 == 4) {
                  var5 = var0.cs(247720157);
                  var6 = var0.cs(1119316555);
                  var7 = var0.cv(952452697);
                  String[] var8 = new String[var7];

                  for(int var9 = 0; var9 < var7; ++var9) {
                     var8[var9] = var0.cs(-691424368);
                  }

                  String var25 = var0.cs(1891403041);
                  byte[][] var10 = new byte[var7][];
                  int var12;
                  if (var4 == 3) {
                     for(int var11 = 0; var11 < var7; ++var11) {
                        var12 = var0.cz(-1734056172);
                        var10[var11] = new byte[var12];
                        var0.cd(var10[var11], 0, var12, (byte)-4);
                     }
                  }

                  var2.ag[var3] = var4;
                  Class[] var26 = new Class[var7];

                  for(var12 = 0; var12 < var7; ++var12) {
                     var26[var12] = hr.ag(var8[var12], (byte)24);
                  }

                  Class var27 = hr.ag(var25, (byte)15);
                  if (hr.ag(var5, (byte)82).getClassLoader() == null) {
                     throw new SecurityException();
                  }

                  Method[] var13 = hr.ag(var5, (byte)83).getDeclaredMethods();
                  Method[] var14 = var13;

                  for(int var15 = 0; var15 < var14.length; ++var15) {
                     Method var16 = var14[var15];
                     if (var16.getName().equals(var6)) {
                        Class[] var17 = var16.getParameterTypes();
                        if (var26.length == var17.length) {
                           boolean var18 = true;

                           for(int var19 = 0; var19 < var26.length; ++var19) {
                              if (var17[var19] != var26[var19]) {
                                 var18 = false;
                                 break;
                              }
                           }

                           if (var18 && var27 == var16.getReturnType()) {
                              var2.af[var3] = var16;
                           }
                        }
                     }
                  }

                  var2.at[var3] = var10;
               }
            } else {
               var5 = var0.cs(1535113282);
               var6 = var0.cs(-79852455);
               var7 = 0;
               if (1 == var4) {
                  var7 = var0.cz(-1734056172);
               }

               var2.ag[var3] = var4;
               var2.aq[var3] = var7;
               if (hr.ag(var5, (byte)88).getClassLoader() == null) {
                  throw new SecurityException();
               }

               var2.ax[var3] = hr.ag(var5, (byte)-19).getDeclaredField(var6);
            }
         } catch (ClassNotFoundException var20) {
            var2.am[var3] = -1;
         } catch (SecurityException var21) {
            var2.am[var3] = -2;
         } catch (NullPointerException var22) {
            var2.am[var3] = -3;
         } catch (Exception var23) {
            var2.am[var3] = -332638434;
         } catch (Throwable var24) {
            var2.am[var3] = -1595689009;
         }
      }

      ac.ae(var2);
   }

   static dm[] ax(byte var0) {
      try {
         return new dm[]{dm.am, dm.ac, dm.ae, dm.ag, dm.ax};
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "bp.ax(" + ')');
      }
   }

   static int bd(int var0, dt var1, boolean var2, byte var3) {
      try {
         int[] var10000;
         int var10001;
         byte var10002;
         int var4;
         if (3500 == var0) {
            if (var3 >= 12) {
               throw new IllegalStateException();
            } else {
               var4 = cs.at[(mp.au -= -1856457959) * 844691753];
               var10000 = cs.at;
               var10001 = (mp.au += -1856457959) * 844691753 - 1;
               if (client.ss.aa(var4, 1770128204)) {
                  if (var3 >= 12) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var10000[var10001] = var10002;
               return 1;
            }
         } else if (var0 == 3501) {
            var4 = cs.at[(mp.au -= -1856457959) * 844691753];
            cs.at[(mp.au += -1856457959) * 844691753 - 1] = client.ss.az(var4, 1238638734) ? 1 : 0;
            return 1;
         } else if (var0 == 3502) {
            if (var3 >= 12) {
               throw new IllegalStateException();
            } else {
               var4 = cs.at[(mp.au -= -1856457959) * 844691753];
               var10000 = cs.at;
               var10001 = (mp.au += -1856457959) * 844691753 - 1;
               if (client.ss.ai(var4, (byte)42)) {
                  if (var3 >= 12) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var10000[var10001] = var10002;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "bp.bd(" + ')');
      }
   }

   static void kc(dd var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         if (var1 >= 128) {
            if (var6 != -406414199) {
               throw new IllegalStateException();
            }

            if (13056 >= var1 && var2 >= 128) {
               if (var6 != -406414199) {
                  return;
               }

               if (13056 >= var2) {
                  int var7 = he.ki(var0, var3, var4, var0.am * 97097587, 1364598893) - var5;
                  var1 -= 2027923471 * lm.kl;
                  var7 -= dw.kv * 208440143;
                  var2 -= bw.ke * -53431137;
                  int var8 = jw.am[322327291 * rp.ko];
                  int var9 = jw.ax[322327291 * rp.ko];
                  int var10 = jw.am[-2112521381 * ki.kw];
                  int var11 = jw.ax[-2112521381 * ki.kw];
                  int var12 = var1 * var11 + var10 * var2 >> 16;
                  var2 = var11 * var2 - var1 * var10 >> 16;
                  var1 = var12;
                  var12 = var9 * var7 - var2 * var8 >> 16;
                  var2 = var2 * var9 + var8 * var7 >> 16;
                  if (var2 >= 50) {
                     if (var6 != -406414199) {
                        return;
                     }

                     client.mb = (-249064015 * client.vb / 2 + 491886171 * client.vq * var1 / var2) * -1280020919;
                     client.mg = (client.vg * -1451243729 / 2 + client.vq * 491886171 * var12 / var2) * 1040412135;
                  } else {
                     client.mb = 1280020919;
                     client.mg = -1040412135;
                  }

                  return;
               }

               if (var6 != -406414199) {
                  throw new IllegalStateException();
               }
            }
         }

         client.mb = 1280020919;
         client.mg = -1040412135;
      } catch (RuntimeException var13) {
         throw vk.ae(var13, "bp.kc(" + ')');
      }
   }

   bp() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "bp.<init>(" + ')');
      }
   }

   public static int ac(CharSequence var0, CharSequence var1, px var2, int var3) {
      try {
         int var4 = var0.length();
         int var5 = var1.length();
         int var6 = 0;
         int var7 = 0;
         byte var8 = 0;
         byte var9 = 0;

         while(true) {
            if (var6 - var8 >= var4) {
               if (var3 >= 1304493601) {
                  throw new IllegalStateException();
               }

               if (var7 - var9 >= var5) {
                  int var18 = Math.min(var4, var5);

                  int var19;
                  char var22;
                  for(var19 = 0; var19 < var18; ++var19) {
                     if (var3 >= 1304493601) {
                        throw new IllegalStateException();
                     }

                     if (px.ag == var2) {
                        if (var3 >= 1304493601) {
                           throw new IllegalStateException();
                        }

                        var6 = var4 - 1 - var19;
                        var7 = var5 - 1 - var19;
                     } else {
                        var7 = var19;
                        var6 = var19;
                     }

                     char var20 = var0.charAt(var6);
                     var22 = var1.charAt(var7);
                     if (var20 != var22) {
                        if (var3 >= 1304493601) {
                           throw new IllegalStateException();
                        }

                        if (Character.toUpperCase(var20) != Character.toUpperCase(var22)) {
                           if (var3 >= 1304493601) {
                              throw new IllegalStateException();
                           }

                           var20 = Character.toLowerCase(var20);
                           var22 = Character.toLowerCase(var22);
                           if (var22 != var20) {
                              if (var3 >= 1304493601) {
                                 throw new IllegalStateException();
                              }

                              return cs.ag(var20, var2, -559274097) - cs.ag(var22, var2, 1681854156);
                           }
                        }
                     }
                  }

                  var19 = var4 - var5;
                  if (var19 != 0) {
                     if (var3 >= 1304493601) {
                        throw new IllegalStateException();
                     }

                     return var19;
                  }

                  for(int var21 = 0; var21 < var18; ++var21) {
                     if (var3 >= 1304493601) {
                        throw new IllegalStateException();
                     }

                     var22 = var0.charAt(var21);
                     char var14 = var1.charAt(var21);
                     if (var22 != var14) {
                        return cs.ag(var22, var2, -573226465) - cs.ag(var14, var2, -927957746);
                     }
                  }

                  return 0;
               }
            }

            if (var6 - var8 >= var4) {
               if (var3 >= 1304493601) {
                  throw new IllegalStateException();
               }

               return -1;
            }

            if (var7 - var9 >= var5) {
               return 1;
            }

            char var10;
            if (var8 != 0) {
               if (var3 >= 1304493601) {
                  throw new IllegalStateException();
               }

               var10 = (char)var8;
               boolean var16 = false;
            } else {
               var10 = var0.charAt(var6++);
            }

            char var11;
            if (0 != var9) {
               if (var3 >= 1304493601) {
                  throw new IllegalStateException();
               }

               var11 = (char)var9;
               boolean var17 = false;
            } else {
               var11 = var1.charAt(var7++);
            }

            byte var12;
            if (var10 == 198) {
               var12 = 69;
            } else if (230 == var10) {
               var12 = 101;
            } else if (var10 == 223) {
               if (var3 >= 1304493601) {
                  throw new IllegalStateException();
               }

               var12 = 115;
            } else if (var10 == 338) {
               if (var3 >= 1304493601) {
                  throw new IllegalStateException();
               }

               var12 = 69;
            } else if (var10 == 339) {
               var12 = 101;
            } else {
               var12 = 0;
            }

            var8 = var12;
            byte var13;
            if (var11 == 198) {
               if (var3 >= 1304493601) {
                  throw new IllegalStateException();
               }

               var13 = 69;
            } else if (230 == var11) {
               if (var3 >= 1304493601) {
                  throw new IllegalStateException();
               }

               var13 = 101;
            } else if (223 == var11) {
               if (var3 >= 1304493601) {
                  throw new IllegalStateException();
               }

               var13 = 115;
            } else if (var11 == 338) {
               var13 = 69;
            } else if (339 == var11) {
               var13 = 101;
            } else {
               var13 = 0;
            }

            var9 = var13;
            var10 = gj.ae(var10, var2, (byte)111);
            var11 = gj.ae(var11, var2, (byte)74);
            if (var11 != var10) {
               if (var3 >= 1304493601) {
                  throw new IllegalStateException();
               }

               if (Character.toUpperCase(var10) != Character.toUpperCase(var11)) {
                  var10 = Character.toLowerCase(var10);
                  var11 = Character.toLowerCase(var11);
                  if (var10 != var11) {
                     if (var3 >= 1304493601) {
                        throw new IllegalStateException();
                     }

                     return cs.ag(var10, var2, 111743834) - cs.ag(var11, var2, -68378795);
                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw vk.ae(var15, "bp.ac(" + ')');
      }
   }

   public static int am(int var0, int var1) {
      try {
         return tl.af[var0 & 16383];
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "bp.am(" + ')');
      }
   }
}
