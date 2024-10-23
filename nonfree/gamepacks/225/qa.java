import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class qa {
   public static final String jd = "Date not valid.";
   public static final int ae = 1338;

   static int au(char var0, px var1) {
      int var2 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = 1 + (var0 << 4);
      }

      if (var0 == -2049352399 && px.aq == var1) {
         var2 = 1762;
      }

      return var2;
   }

   public static int am(CharSequence var0, CharSequence var1, px var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      byte var7 = 0;
      byte var8 = 0;

      while(var5 - var7 < var3 || var6 - var8 < var4) {
         if (var5 - var7 >= var3) {
            return -1;
         }

         if (var6 - var8 >= var4) {
            return 1;
         }

         char var9;
         if (var7 != 0) {
            var9 = (char)var7;
            boolean var14 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         char var10;
         if (0 != var8) {
            var10 = (char)var8;
            boolean var15 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         byte var11;
         if (var9 == 198) {
            var11 = 69;
         } else if (230 == var9) {
            var11 = 101;
         } else if (var9 == 223) {
            var11 = 115;
         } else if (var9 == 338) {
            var11 = 69;
         } else if (var9 == 339) {
            var11 = 101;
         } else {
            var11 = 0;
         }

         var7 = var11;
         byte var12;
         if (var10 == 198) {
            var12 = 69;
         } else if (230 == var10) {
            var12 = 101;
         } else if (223 == var10) {
            var12 = 115;
         } else if (var10 == 338) {
            var12 = 69;
         } else if (339 == var10) {
            var12 = 101;
         } else {
            var12 = 0;
         }

         var8 = var12;
         var9 = gj.ae(var9, var2, (byte)63);
         var10 = gj.ae(var10, var2, (byte)53);
         if (var10 != var9 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
            var9 = Character.toLowerCase(var9);
            var10 = Character.toLowerCase(var10);
            if (var9 != var10) {
               return cs.ag(var9, var2, 976791947) - cs.ag(var10, var2, 1328214498);
            }
         }
      }

      int var16 = Math.min(var3, var4);

      int var17;
      char var20;
      for(var17 = 0; var17 < var16; ++var17) {
         if (px.ag == var2) {
            var5 = var3 - 1 - var17;
            var6 = var4 - 1 - var17;
         } else {
            var6 = var17;
            var5 = var17;
         }

         char var18 = var0.charAt(var5);
         var20 = var1.charAt(var6);
         if (var18 != var20 && Character.toUpperCase(var18) != Character.toUpperCase(var20)) {
            var18 = Character.toLowerCase(var18);
            var20 = Character.toLowerCase(var20);
            if (var20 != var18) {
               return cs.ag(var18, var2, -1273145420) - cs.ag(var20, var2, -1047680972);
            }
         }
      }

      var17 = var3 - var4;
      if (var17 != 0) {
         return var17;
      } else {
         for(int var19 = 0; var19 < var16; ++var19) {
            var20 = var0.charAt(var19);
            char var13 = var1.charAt(var19);
            if (var20 != var13) {
               return cs.ag(var20, var2, 289256103) - cs.ag(var13, var2, -933823642);
            }
         }

         return 0;
      }
   }

   public static int ax(CharSequence var0, CharSequence var1, px var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      byte var7 = 0;
      byte var8 = 0;

      while(var5 - var7 < var3 || var6 - var8 < var4) {
         if (var5 - var7 >= var3) {
            return -1;
         }

         if (var6 - var8 >= var4) {
            return 1;
         }

         char var9;
         if (var7 != 0) {
            var9 = (char)var7;
            boolean var14 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         char var10;
         if (0 != var8) {
            var10 = (char)var8;
            boolean var15 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         byte var11;
         if (var9 == 198) {
            var11 = 69;
         } else if (230 == var9) {
            var11 = 101;
         } else if (var9 == 223) {
            var11 = 115;
         } else if (var9 == 338) {
            var11 = 69;
         } else if (var9 == 339) {
            var11 = 101;
         } else {
            var11 = 0;
         }

         var7 = var11;
         byte var12;
         if (var10 == 198) {
            var12 = 69;
         } else if (230 == var10) {
            var12 = 101;
         } else if (223 == var10) {
            var12 = 115;
         } else if (var10 == 338) {
            var12 = 69;
         } else if (339 == var10) {
            var12 = 101;
         } else {
            var12 = 0;
         }

         var8 = var12;
         var9 = gj.ae(var9, var2, (byte)47);
         var10 = gj.ae(var10, var2, (byte)28);
         if (var10 != var9 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) {
            var9 = Character.toLowerCase(var9);
            var10 = Character.toLowerCase(var10);
            if (var9 != var10) {
               return cs.ag(var9, var2, 230490733) - cs.ag(var10, var2, -658646626);
            }
         }
      }

      int var16 = Math.min(var3, var4);

      int var17;
      char var20;
      for(var17 = 0; var17 < var16; ++var17) {
         if (px.ag == var2) {
            var5 = var3 - 1 - var17;
            var6 = var4 - 1 - var17;
         } else {
            var6 = var17;
            var5 = var17;
         }

         char var18 = var0.charAt(var5);
         var20 = var1.charAt(var6);
         if (var18 != var20 && Character.toUpperCase(var18) != Character.toUpperCase(var20)) {
            var18 = Character.toLowerCase(var18);
            var20 = Character.toLowerCase(var20);
            if (var20 != var18) {
               return cs.ag(var18, var2, 554595292) - cs.ag(var20, var2, 1267600151);
            }
         }
      }

      var17 = var3 - var4;
      if (var17 != 0) {
         return var17;
      } else {
         for(int var19 = 0; var19 < var16; ++var19) {
            var20 = var0.charAt(var19);
            char var13 = var1.charAt(var19);
            if (var20 != var13) {
               return cs.ag(var20, var2, 1998026858) - cs.ag(var13, var2, 301964914);
            }
         }

         return 0;
      }
   }

   static int al(char var0, px var1) {
      int var2 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = 1 + (var0 << 4);
      }

      if (var0 == 241 && px.aq == var1) {
         var2 = 1965059659;
      }

      return var2;
   }

   static char af(char var0, px var1) {
      if (var0 >= 192 && var0 <= 255) {
         if (var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if (var0 == 199) {
            return 'C';
         }

         if (var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if (var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if (var0 == 209 && px.aq != var1) {
            return 'N';
         }

         if (var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if (var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if (221 == var0) {
            return 'Y';
         }

         if (223 == var0) {
            return 's';
         }

         if (var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if (var0 == 231) {
            return 'c';
         }

         if (var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if (var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if (var0 == 241 && px.aq != var1) {
            return 'n';
         }

         if (var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if (var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if (253 == var0 || var0 == 255) {
            return 'y';
         }
      }

      if (var0 == 338) {
         return 'O';
      } else if (var0 == 339) {
         return 'o';
      } else if (376 == var0) {
         return 'Y';
      } else {
         return var0;
      }
   }

   static int at(char var0, px var1) {
      int var2 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = 1 + (var0 << 4);
      }

      if (var0 == 241 && px.aq == var1) {
         var2 = 1762;
      }

      return var2;
   }

   static int ar(char var0, px var1) {
      int var2 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = 1 + (var0 << 4);
      }

      if (var0 == 241 && px.aq == var1) {
         var2 = 1762;
      }

      return var2;
   }

   qa() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "qa.<init>(" + ')');
      }
   }

   static char aq(char var0, px var1) {
      if (var0 >= 192 && var0 <= 255) {
         if (var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if (var0 == 199) {
            return 'C';
         }

         if (var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if (var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if (var0 == 209 && px.aq != var1) {
            return 'N';
         }

         if (var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if (var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if (221 == var0) {
            return 'Y';
         }

         if (223 == var0) {
            return 's';
         }

         if (var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if (var0 == 231) {
            return 'c';
         }

         if (var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if (var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if (var0 == 241 && px.aq != var1) {
            return 'n';
         }

         if (var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if (var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if (253 == var0 || var0 == 255) {
            return 'y';
         }
      }

      if (var0 == 338) {
         return 'O';
      } else if (var0 == 339) {
         return 'o';
      } else if (376 == var0) {
         return 'Y';
      } else {
         return var0;
      }
   }

   public static void ac(va var0, byte var1) {
      try {
         by var2 = (by)bp.ac.ax();
         if (null == var2) {
            if (var1 >= 14) {
               throw new IllegalStateException();
            }
         } else {
            int var3 = -1027766515 * var0.au;
            var0.bv(var2.ac * -995482501, 1291040808);

            for(int var4 = 0; var4 < var2.ae * -188310631; ++var4) {
               if (var1 >= 14) {
                  throw new IllegalStateException();
               }

               if (0 != var2.am[var4]) {
                  if (var1 >= 14) {
                     throw new IllegalStateException();
                  }

                  var0.bu(var2.am[var4], (byte)-81);
               } else {
                  try {
                     int var5 = var2.ag[var4];
                     Field var6;
                     int var7;
                     if (var5 == 0) {
                        var6 = var2.ax[var4];
                        var7 = var6.getInt((Object)null);
                        var0.bu(0, (byte)29);
                        var0.bv(var7, 729206414);
                     } else if (var5 == 1) {
                        if (var1 >= 14) {
                           throw new IllegalStateException();
                        }

                        var6 = var2.ax[var4];
                        var6.setInt((Object)null, var2.aq[var4]);
                        var0.bu(0, (byte)82);
                     } else if (2 == var5) {
                        if (var1 >= 14) {
                           throw new IllegalStateException();
                        }

                        var6 = var2.ax[var4];
                        var7 = var6.getModifiers();
                        var0.bu(0, (byte)-36);
                        var0.bv(var7, 1277937714);
                     }

                     Method var24;
                     if (3 != var5) {
                        if (var5 == 4) {
                           var24 = var2.af[var4];
                           var7 = var24.getModifiers();
                           var0.bu(0, (byte)17);
                           var0.bv(var7, 1330244361);
                        }
                     } else {
                        if (var1 >= 14) {
                           throw new IllegalStateException();
                        }

                        var24 = var2.af[var4];
                        byte[][] var25 = var2.at[var4];
                        Object[] var8 = new Object[var25.length];

                        for(int var9 = 0; var9 < var25.length; ++var9) {
                           if (var1 >= 14) {
                              throw new IllegalStateException();
                           }

                           ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var25[var9]));
                           var8[var9] = var10.readObject();
                        }

                        Object var26 = var24.invoke((Object)null, var8);
                        if (var26 == null) {
                           if (var1 >= 14) {
                              throw new IllegalStateException();
                           }

                           var0.bu(0, (byte)-109);
                        } else if (var26 instanceof Number) {
                           if (var1 >= 14) {
                              throw new IllegalStateException();
                           }

                           var0.bu(1, (byte)30);
                           var0.bq(((Number)var26).longValue());
                        } else if (var26 instanceof String) {
                           var0.bu(2, (byte)45);
                           var0.bc((String)var26, -2046399628);
                        } else {
                           var0.bu(4, (byte)72);
                        }
                     }
                  } catch (ClassNotFoundException var11) {
                     var0.bu(-10, (byte)-9);
                  } catch (InvalidClassException var12) {
                     var0.bu(-11, (byte)78);
                  } catch (StreamCorruptedException var13) {
                     var0.bu(-12, (byte)56);
                  } catch (OptionalDataException var14) {
                     var0.bu(-13, (byte)-2);
                  } catch (IllegalAccessException var15) {
                     var0.bu(-14, (byte)-34);
                  } catch (IllegalArgumentException var16) {
                     var0.bu(-15, (byte)-22);
                  } catch (InvocationTargetException var17) {
                     var0.bu(-16, (byte)-23);
                  } catch (SecurityException var18) {
                     var0.bu(-17, (byte)39);
                  } catch (IOException var19) {
                     var0.bu(-18, (byte)-46);
                  } catch (NullPointerException var20) {
                     var0.bu(-19, (byte)23);
                  } catch (Exception var21) {
                     var0.bu(-20, (byte)-27);
                  } catch (Throwable var22) {
                     var0.bu(-21, (byte)75);
                  }
               }
            }

            var0.dj(var3, -1415553584);
            var2.jb();
         }
      } catch (RuntimeException var23) {
         throw vk.ae(var23, "qa.ac(" + ')');
      }
   }

   static final void au(String var0, byte var1) {
      try {
         ho.ae(30, "", var0, (byte)-10);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "qa.au(" + ')');
      }
   }
}
