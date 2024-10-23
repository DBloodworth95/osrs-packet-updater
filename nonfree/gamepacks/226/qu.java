import java.util.regex.Pattern;

@ns
public final class qu {
   static String bq(int var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= -920735293) {
         if (var2 && var0 >= 0) {
            int var3 = 2;

            for(int var4 = var0 / var1; 0 != var4; ++var3) {
               var4 /= var1;
            }

            char[] var5 = new char[var3];
            var5[0] = (char)1820718349;

            for(int var6 = var3 - 1; var6 > 0; --var6) {
               int var7 = var0;
               var0 /= var1;
               int var8 = var7 - var1 * var0;
               if (var8 >= 10) {
                  var5[var6] = (char)(1797133669 + var8);
               } else {
                  var5[var6] = (char)(var8 + -1022755345);
               }
            }

            return new String(var5);
         } else {
            return Integer.toString(var0, var1);
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   public static boolean br(char var0) {
      return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   public static String ag(CharSequence[] var0, int var1, int var2) {
      if (var2 == 0) {
         return "";
      } else if (1 == var2) {
         CharSequence var8 = var0[var1];
         return var8 == null ? "null" : var8.toString();
      } else {
         int var3 = var1 + var2;
         int var4 = 0;

         for(int var5 = var1; var5 < var3; ++var5) {
            CharSequence var6 = var0[var5];
            if (var6 == null) {
               var4 += 4;
            } else {
               var4 += var6.length();
            }
         }

         StringBuilder var9 = new StringBuilder(var4);

         for(int var10 = var1; var10 < var3; ++var10) {
            CharSequence var7 = var0[var10];
            if (var7 == null) {
               var9.append("null");
            } else {
               var9.append(var7);
            }
         }

         return var9.toString();
      }
   }

   qu() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "qu.<init>(" + ')');
      }
   }

   public static String ac(CharSequence[] var0, int var1, int var2) {
      if (var2 == 0) {
         return "";
      } else if (1 == var2) {
         CharSequence var8 = var0[var1];
         return var8 == null ? "null" : var8.toString();
      } else {
         int var3 = var1 + var2;
         int var4 = 0;

         for(int var5 = var1; var5 < var3; ++var5) {
            CharSequence var6 = var0[var5];
            if (var6 == null) {
               var4 += 4;
            } else {
               var4 += var6.length();
            }
         }

         StringBuilder var9 = new StringBuilder(var4);

         for(int var10 = var1; var10 < var3; ++var10) {
            CharSequence var7 = var0[var10];
            if (var7 == null) {
               var9.append("null");
            } else {
               var9.append(var7);
            }
         }

         return var9.toString();
      }
   }

   public static boolean av(CharSequence var0) {
      return at.ak(var0, 10, true, 1177143826);
   }

   public static int bi(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }

   public static int bc(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + var0.charAt(var3);
      }

      return var2;
   }

   public static int bg(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }

   static boolean aa(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7);
            if (0 == var7) {
               if ('-' == var8) {
                  var3 = true;
                  continue;
               }

               if (var8 == '+' && var2) {
                  continue;
               }
            }

            int var10;
            if (var8 >= '0' && var8 <= '9') {
               var10 = var8 - 48;
            } else if (var8 >= 'A' && var8 <= 'Z') {
               var10 = var8 - 55;
            } else {
               if (var8 < 'a' || var8 > 'z') {
                  return false;
               }

               var10 = var8 - 87;
            }

            if (var10 >= var1) {
               return false;
            }

            if (var3) {
               var10 = -var10;
            }

            int var9 = var10 + var5 * var1;
            if (var5 != var9 / var1) {
               return false;
            }

            var5 = var9;
            var4 = true;
         }

         return var4;
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   static {
      Pattern.compile("^\\D*(\\d+)\\D*$");
   }

   public static int bh(CharSequence var0) {
      return lx.ay(var0, 10, true, -1685470592);
   }

   public static boolean ax(CharSequence var0) {
      return at.ak(var0, 10, true, 1177143826);
   }

   public static int bv(CharSequence var0) {
      return lx.ay(var0, 10, true, -2025115263);
   }

   static boolean ah(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 1438709291) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7);
            if (0 == var7) {
               if (-1212983412 == var8) {
                  var3 = true;
                  continue;
               }

               if (var8 == '+' && var2) {
                  continue;
               }
            }

            int var10;
            if (var8 >= '0' && var8 <= -1983515525) {
               var10 = var8 - 48;
            } else if (var8 >= 'A' && var8 <= -1497191634) {
               var10 = var8 - 55;
            } else {
               if (var8 < 1077077675 || var8 > 'z') {
                  return false;
               }

               var10 = var8 - 87;
            }

            if (var10 >= var1) {
               return false;
            }

            if (var3) {
               var10 = -var10;
            }

            int var9 = var10 + var5 * var1;
            if (var5 != var9 / var1) {
               return false;
            }

            var5 = var9;
            var4 = true;
         }

         return var4;
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   static int bk(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= -1648082464) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7);
            if (0 == var7) {
               if (var8 == -1140631203) {
                  var3 = true;
                  continue;
               }

               if (var8 == -344971338 && var2) {
                  continue;
               }
            }

            int var10;
            if (var8 >= '0' && var8 <= '9') {
               var10 = var8 - 48;
            } else if (var8 >= -293737052 && var8 <= -2037193956) {
               var10 = var8 - 55;
            } else {
               if (var8 < 'a' || var8 > -1391983849) {
                  throw new NumberFormatException();
               }

               var10 = var8 - 87;
            }

            if (var10 >= var1) {
               throw new NumberFormatException();
            }

            if (var3) {
               var10 = -var10;
            }

            int var9 = var5 * var1 + var10;
            if (var9 / var1 != var5) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if (!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   public static String bb(int var0, boolean var1) {
      return var1 && var0 >= 0 ? us.ae(var0, 10, var1, 1191591001) : Integer.toString(var0);
   }

   public static int bj(CharSequence var0) {
      return lx.ay(var0, 10, true, 1990265504);
   }

   public static int bp(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + bm.ap(var0.charAt(var3), (byte)-35);
      }

      return var2;
   }

   public static int bz(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + var0.charAt(var3);
      }

      return var2;
   }

   public static int bx(CharSequence var0, int var1) {
      return lx.ay(var0, var1, true, 2141783986);
   }

   public static boolean by(char var0) {
      return var0 >= 'A' && var0 <= -1527485957 || var0 >= -451954137 && var0 <= 1990932242;
   }

   public static String ad(CharSequence[] var0, int var1, int var2) {
      if (var2 == 0) {
         return "";
      } else if (1 == var2) {
         CharSequence var8 = var0[var1];
         return var8 == null ? "null" : var8.toString();
      } else {
         int var3 = var1 + var2;
         int var4 = 0;

         for(int var5 = var1; var5 < var3; ++var5) {
            CharSequence var6 = var0[var5];
            if (var6 == null) {
               var4 += 4;
            } else {
               var4 += var6.length();
            }
         }

         StringBuilder var9 = new StringBuilder(var4);

         for(int var10 = var1; var10 < var3; ++var10) {
            CharSequence var7 = var0[var10];
            if (var7 == null) {
               var9.append("null");
            } else {
               var9.append(var7);
            }
         }

         return var9.toString();
      }
   }

   public static boolean bt(char var0) {
      return var0 >= 2000935115 && var0 <= 2083168447 || var0 >= 'A' && var0 <= 'Z' || var0 >= -427147946 && var0 <= 'z';
   }

   public static boolean bu(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   public static boolean aq(CharSequence var0) {
      return at.ak(var0, 10, true, 1177143826);
   }

   public static String bs(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for(int var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if (0 == var3) {
            var5 = Character.toLowerCase(var5);
         } else if (var3 == 2 || Character.isUpperCase(var5)) {
            var5 = aw.aj(var5, -516173990);
         }

         if (Character.isLetter(var5)) {
            var3 = 0;
         } else if ('.' != var5 && '?' != var5 && '!' != var5) {
            if (Character.isSpaceChar(var5)) {
               if (2 != var3) {
                  var3 = 1;
               }
            } else {
               var3 = 1;
            }
         } else {
            var3 = 2;
         }

         var2[var4] = var5;
      }

      return new String(var2);
   }

   public static String bm(CharSequence var0) {
      int var2 = var0.length();
      char[] var3 = new char[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = '*';
      }

      String var1 = new String(var3);
      return var1;
   }

   public static String bo(CharSequence var0) {
      int var2 = var0.length();
      char[] var3 = new char[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = (char)-1273455572;
      }

      String var1 = new String(var3);
      return var1;
   }

   public static String bd(CharSequence var0) {
      int var2 = var0.length();
      char[] var3 = new char[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = '*';
      }

      String var1 = new String(var3);
      return var1;
   }

   public static boolean ba(char var0) {
      if (var0 >= ' ' && var0 <= 20085012) {
         return true;
      } else if (var0 >= 2081717213 && var0 <= 255) {
         return true;
      } else {
         return var0 == 8364 || var0 == -631895954 || 1653777622 == var0 || var0 == 339 || 376 == var0;
      }
   }

   public static boolean bw(char var0) {
      if (var0 >= ' ' && var0 <= '~') {
         return true;
      } else if (var0 >= 160 && var0 <= 255) {
         return true;
      } else {
         return var0 == 8364 || var0 == 338 || 8212 == var0 || var0 == 339 || 376 == var0;
      }
   }

   public static boolean bn(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   public static boolean al(CharSequence var0) {
      return at.ak(var0, 10, true, 1177143826);
   }

   public static int bf(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }
}
