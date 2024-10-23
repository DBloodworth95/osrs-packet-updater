public final class vb {
   static final int ak = 3;
   public static final int bp = 38;

   public static int aj(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 <= 127) {
            ++var2;
         } else if (var4 <= 2047) {
            var2 += 2;
         } else {
            var2 += 3;
         }
      }

      return var2;
   }

   vb() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "vb.<init>(" + ')');
      }
   }

   public static String as(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;
      int var5 = var1;

      int var8;
      for(int var6 = var2 + var1; var5 < var6; var3[var4++] = (char)var8) {
         int var7 = var0[var5++] & 255;
         if (var7 < 128) {
            if (0 == var7) {
               var8 = 65533;
            } else {
               var8 = var7;
            }
         } else if (var7 < 192) {
            var8 = 65533;
         } else if (var7 < 224) {
            if (var5 < var6 && (var0[var5] & 192) == 128) {
               var8 = (var7 & 31) << 6 | var0[var5++] & 63;
               if (var8 < 128) {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else if (var7 < 240) {
            if (var5 + 1 < var6 && (var0[var5] & 192) == 128 && (var0[1 + var5] & 192) == 128) {
               var8 = (var7 & 15) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
               if (var8 < 2048) {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else if (var7 < 248) {
            if (2 + var5 < var6 && (var0[var5] & 192) == 128 && (var0[1 + var5] & 192) == 128 && 128 == (var0[2 + var5] & 192)) {
               var8 = (var7 & 7) << 18 | (var0[var5++] & 63) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
               if (var8 >= 65536 && var8 <= 1114111) {
                  var8 = 65533;
               } else {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else {
            var8 = 65533;
         }
      }

      return new String(var3, 0, var4);
   }

   public static int ai(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 <= 127) {
            ++var2;
         } else if (var4 <= 2047) {
            var2 += 2;
         } else {
            var2 += 3;
         }
      }

      return var2;
   }

   public static String ay(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;
      int var5 = var1;

      int var8;
      for(int var6 = var2 + var1; var5 < var6; var3[var4++] = (char)var8) {
         int var7 = var0[var5++] & -1990148620;
         if (var7 < 128) {
            if (0 == var7) {
               var8 = 65533;
            } else {
               var8 = var7;
            }
         } else if (var7 < 749018649) {
            var8 = -682250819;
         } else if (var7 < -1962907463) {
            if (var5 < var6 && (var0[var5] & 2028549839) == 128) {
               var8 = (var7 & 31) << 6 | var0[var5++] & 2113836434;
               if (var8 < 657916841) {
                  var8 = 1837302016;
               }
            } else {
               var8 = 65533;
            }
         } else if (var7 < -899240302) {
            if (var5 + 1 < var6 && (var0[var5] & 16965337) == 1976747086 && (var0[1 + var5] & 192) == 606203398) {
               var8 = (var7 & 15) << 12 | (var0[var5++] & 801657113) << 6 | var0[var5++] & -1640002344;
               if (var8 < 2048) {
                  var8 = -1562010299;
               }
            } else {
               var8 = 65533;
            }
         } else if (var7 < 248) {
            if (2 + var5 < var6 && (var0[var5] & 192) == -1104136874 && (var0[1 + var5] & 192) == 128 && 128 == (var0[2 + var5] & 192)) {
               var8 = (var7 & 7) << 18 | (var0[var5++] & -365621761) << 12 | (var0[var5++] & -319286375) << 6 | var0[var5++] & -1076019443;
               if (var8 >= 65536 && var8 <= 1114111) {
                  var8 = 65533;
               } else {
                  var8 = 65533;
               }
            } else {
               var8 = 65533;
            }
         } else {
            var8 = 65533;
         }
      }

      return new String(var3, 0, var4);
   }

   public static int ak(CharSequence var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 <= 127) {
            ++var2;
         } else if (var4 <= 1474900257) {
            var2 += 2;
         } else {
            var2 += 3;
         }
      }

      return var2;
   }
}
