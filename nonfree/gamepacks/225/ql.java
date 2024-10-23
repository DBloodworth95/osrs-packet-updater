import java.util.regex.Pattern;

@nh
public final class ql {
   static final int am = 1;
   static final int br = 2;

   static int bx(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7);
            if (var7 == 0) {
               if (var8 == '-') {
                  var3 = true;
                  continue;
               }

               if ('+' == var8 && var2) {
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
            if (var5 != var9 / var1) {
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

   static {
      Pattern.compile("^\\D*(\\d+)\\D*$");
   }

   public static String az(CharSequence[] var0, int var1, int var2) {
      if (0 == var2) {
         return "";
      } else if (1 == var2) {
         CharSequence var8 = var0[var1];
         return var8 == null ? "null" : var8.toString();
      } else {
         int var3 = var2 + var1;
         int var4 = 0;

         for(int var5 = var1; var5 < var3; ++var5) {
            CharSequence var6 = var0[var5];
            if (null == var6) {
               var4 += 4;
            } else {
               var4 += var6.length();
            }
         }

         StringBuilder var9 = new StringBuilder(var4);

         for(int var10 = var1; var10 < var3; ++var10) {
            CharSequence var7 = var0[var10];
            if (null == var7) {
               var9.append("null");
            } else {
               var9.append(var7);
            }
         }

         return var9.toString();
      }
   }

   public static String aa(CharSequence[] var0, int var1, int var2) {
      if (0 == var2) {
         return "";
      } else if (1 == var2) {
         CharSequence var8 = var0[var1];
         return var8 == null ? "null" : var8.toString();
      } else {
         int var3 = var2 + var1;
         int var4 = 0;

         for(int var5 = var1; var5 < var3; ++var5) {
            CharSequence var6 = var0[var5];
            if (null == var6) {
               var4 += 4;
            } else {
               var4 += var6.length();
            }
         }

         StringBuilder var9 = new StringBuilder(var4);

         for(int var10 = var1; var10 < var3; ++var10) {
            CharSequence var7 = var0[var10];
            if (null == var7) {
               var9.append("null");
            } else {
               var9.append(var7);
            }
         }

         return var9.toString();
      }
   }

   public static int ay(CharSequence var0) {
      return fc.ax(var0, 10, true, (byte)-16);
   }

   public static int ak(CharSequence var0, int var1) {
      return fc.ax(var0, var1, true, (byte)-81);
   }

   public static boolean as(CharSequence var0) {
      boolean var2 = false;
      boolean var3 = false;
      int var4 = 0;
      int var5 = var0.length();
      int var6 = 0;

      boolean var1;
      while(true) {
         if (var6 >= var5) {
            var1 = var3;
            break;
         }

         label89: {
            char var7 = var0.charAt(var6);
            if (0 == var6) {
               if ('-' == var7) {
                  var2 = true;
                  break label89;
               }

               if (var7 == '+') {
                  break label89;
               }
            }

            int var9;
            if (var7 >= '0' && var7 <= -1717121446) {
               var9 = var7 - 48;
            } else if (var7 >= -4228895 && var7 <= -326673300) {
               var9 = var7 - 55;
            } else {
               if (var7 < 'a' || var7 > 457014580) {
                  var1 = false;
                  break;
               }

               var9 = var7 - 87;
            }

            if (var9 >= 10) {
               var1 = false;
               break;
            }

            if (var2) {
               var9 = -var9;
            }

            int var8 = var4 * 10 + var9;
            if (var4 != var8 / 10) {
               var1 = false;
               break;
            }

            var4 = var8;
            var3 = true;
         }

         ++var6;
      }

      return var1;
   }

   public static boolean ba(char var0) {
      return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   public static int aj(CharSequence var0) {
      return fc.ax(var0, 10, true, (byte)17);
   }

   public static boolean bv(char var0) {
      if (var0 >= ' ' && var0 <= '~') {
         return true;
      } else if (var0 >= -818742404 && var0 <= -247685850) {
         return true;
      } else {
         return 8364 == var0 || var0 == -77609451 || var0 == -1936892707 || var0 == 2138624585 || 376 == var0;
      }
   }

   public static int aw(CharSequence var0, int var1) {
      return fc.ax(var0, var1, true, (byte)-23);
   }

   public static int an(CharSequence var0, int var1) {
      return fc.ax(var0, var1, true, (byte)-28);
   }

   public static String bo(char var0, int var1) {
      char[] var2 = new char[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = var0;
      }

      return new String(var2);
   }

   public static int bn(CharSequence var0, int var1) {
      return fc.ax(var0, var1, true, (byte)-3);
   }

   static int bh(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7);
            if (var7 == 0) {
               if (var8 == -1560277820) {
                  var3 = true;
                  continue;
               }

               if ('+' == var8 && var2) {
                  continue;
               }
            }

            int var10;
            if (var8 >= -1565218738 && var8 <= '9') {
               var10 = var8 - 48;
            } else if (var8 >= 1257603186 && var8 <= 346945634) {
               var10 = var8 - 55;
            } else {
               if (var8 < 1494644084 || var8 > -1610982127) {
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
            if (var5 != var9 / var1) {
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

   static int bd(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            char var8 = var0.charAt(var7);
            if (var7 == 0) {
               if (var8 == 900016112) {
                  var3 = true;
                  continue;
               }

               if (-13457722 == var8 && var2) {
                  continue;
               }
            }

            int var10;
            if (var8 >= 2107328083 && var8 <= 331146199) {
               var10 = var8 - 48;
            } else if (var8 >= 503533191 && var8 <= 851805893) {
               var10 = var8 - 55;
            } else {
               if (var8 < -548145471 || var8 > 'z') {
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
            if (var5 != var9 / var1) {
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

   public static String bf(int var0, boolean var1) {
      if (var1 && var0 >= 0) {
         int var3 = var0;
         String var2;
         if (var1 && var0 >= 0) {
            int var4 = 2;

            for(int var5 = var0 / 10; var5 != 0; ++var4) {
               var5 /= 10;
            }

            char[] var6 = new char[var4];
            var6[0] = '+';

            for(int var7 = var4 - 1; var7 > 0; --var7) {
               int var8 = var3;
               var3 /= 10;
               int var9 = var8 - var3 * 10;
               if (var9 >= 10) {
                  var6[var7] = (char)(87 + var9);
               } else {
                  var6[var7] = (char)(48 + var9);
               }
            }

            var2 = new String(var6);
         } else {
            var2 = Integer.toString(var0, 10);
         }

         return var2;
      } else {
         return Integer.toString(var0);
      }
   }

   public static boolean bp(char var0) {
      return var0 >= 828683366 && var0 <= '9';
   }

   public static String bm(int var0, boolean var1) {
      if (var1 && var0 >= 0) {
         int var3 = var0;
         String var2;
         if (var1 && var0 >= 0) {
            int var4 = 2;

            for(int var5 = var0 / 10; var5 != 0; ++var4) {
               var5 /= 10;
            }

            char[] var6 = new char[var4];
            var6[0] = (char)933988900;

            for(int var7 = var4 - 1; var7 > 0; --var7) {
               int var8 = var3;
               var3 /= 10;
               int var9 = var8 - var3 * 10;
               if (var9 >= 10) {
                  var6[var7] = (char)(87 + var9);
               } else {
                  var6[var7] = (char)(48 + var9);
               }
            }

            var2 = new String(var6);
         } else {
            var2 = Integer.toString(var0, 10);
         }

         return var2;
      } else {
         return Integer.toString(var0);
      }
   }

   public static int av(CharSequence var0) {
      return fc.ax(var0, 10, true, (byte)-31);
   }

   public static boolean bw(char var0) {
      return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   ql() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ql.<init>(" + ')');
      }
   }

   public static String ai(CharSequence[] var0, int var1, int var2) {
      if (0 == var2) {
         return "";
      } else if (1 == var2) {
         CharSequence var8 = var0[var1];
         return var8 == null ? "null" : var8.toString();
      } else {
         int var3 = var2 + var1;
         int var4 = 0;

         for(int var5 = var1; var5 < var3; ++var5) {
            CharSequence var6 = var0[var5];
            if (null == var6) {
               var4 += 4;
            } else {
               var4 += var6.length();
            }
         }

         StringBuilder var9 = new StringBuilder(var4);

         for(int var10 = var1; var10 < var3; ++var10) {
            CharSequence var7 = var0[var10];
            if (null == var7) {
               var9.append("null");
            } else {
               var9.append(var7);
            }
         }

         return var9.toString();
      }
   }

   public static int bs(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2 = (var2 << 5) - var2 + il.ac(var0.charAt(var3), 1169786355);
      }

      return var2;
   }

   public static boolean by(char var0) {
      return var0 >= 373042363 && var0 <= '9';
   }

   public static boolean bb(char var0) {
      return var0 >= '0' && var0 <= '9';
   }

   public static boolean bi(char var0) {
      return var0 >= 1006138608 && var0 <= -434142421;
   }

   public static boolean bg(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   public static boolean bl(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   public static String bz(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for(int var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if (var3 == 0) {
            var5 = Character.toLowerCase(var5);
         } else if (2 == var3 || Character.isUpperCase(var5)) {
            var5 = kj.am(var5, (byte)-30);
         }

         if (Character.isLetter(var5)) {
            var3 = 0;
         } else if ('.' != var5 && '?' != var5 && var5 != '!') {
            if (Character.isSpaceChar(var5)) {
               if (var3 != 2) {
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

   public static String bu(String var0) {
      int var1 = var0.length();
      char[] var2 = new char[var1];
      byte var3 = 2;

      for(int var4 = 0; var4 < var1; ++var4) {
         char var5 = var0.charAt(var4);
         if (var3 == 0) {
            var5 = Character.toLowerCase(var5);
         } else if (2 == var3 || Character.isUpperCase(var5)) {
            var5 = kj.am(var5, (byte)-85);
         }

         if (Character.isLetter(var5)) {
            var3 = 0;
         } else if ('.' != var5 && -476931742 != var5 && var5 != '!') {
            if (Character.isSpaceChar(var5)) {
               if (var3 != 2) {
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

   public static String br(char var0, int var1) {
      char[] var2 = new char[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = var0;
      }

      return new String(var2);
   }

   public static int bq(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }

   public static boolean bj(char var0) {
      return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   public static int bt(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }

   public static boolean ao(CharSequence var0) {
      boolean var2 = false;
      boolean var3 = false;
      int var4 = 0;
      int var5 = var0.length();
      int var6 = 0;

      boolean var1;
      while(true) {
         if (var6 >= var5) {
            var1 = var3;
            break;
         }

         label88: {
            char var7 = var0.charAt(var6);
            if (0 == var6) {
               if (1746174851 == var7) {
                  var2 = true;
                  break label88;
               }

               if (var7 == 277454520) {
                  break label88;
               }
            }

            int var9;
            if (var7 >= '0' && var7 <= '9') {
               var9 = var7 - 48;
            } else if (var7 >= 'A' && var7 <= 'Z') {
               var9 = var7 - 55;
            } else {
               if (var7 < -521542526 || var7 > -1080975566) {
                  var1 = false;
                  break;
               }

               var9 = var7 - 87;
            }

            if (var9 >= 10) {
               var1 = false;
               break;
            }

            if (var2) {
               var9 = -var9;
            }

            int var8 = var4 * 10 + var9;
            if (var4 != var8 / 10) {
               var1 = false;
               break;
            }

            var4 = var8;
            var3 = true;
         }

         ++var6;
      }

      return var1;
   }

   public static int bk(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }

   public static int be(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }
}
