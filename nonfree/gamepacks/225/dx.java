public class dx {
   static final int ag = 3;
   static final int ae = 2;
   static final int ac = 1;
   static final int at = 8;
   static final int ad = 12;
   static final int av = 23;
   static final int ap = 14;
   static final int al = 6;
   static final int cp = 25;

   static final boolean ag(int var0) {
      return var0 == 14 || var0 == 15 || var0 >= 44 && var0 <= 51;
   }

   static final boolean ae(int var0) {
      return var0 == 14 || var0 == 15 || var0 >= 44 && var0 <= 51;
   }

   static final boolean am(int var0) {
      return var0 == 14 || var0 == 15 || var0 >= 44 && var0 <= 51;
   }

   dx() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "dx.<init>(" + ')');
      }
   }

   static tq gy(int var0) {
      try {
         return kd.vw;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "dx.gy(" + ')');
      }
   }

   public static void ac(po var0, po var1, po var2, int var3) {
      try {
         hs.ac = var0;
         hs.ae = var1;
         hs.ag = var2;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "dx.ac(" + ')');
      }
   }

   static byte[] ae(String var0, int var1) {
      try {
         boolean var2 = true;
         boolean var3 = true;
         int var4 = ok.hs.length();
         int var5 = 0;
         byte[] var6 = new byte[8];

         while(true) {
            int var7 = var5 + var4;
            if (var7 >= var0.length()) {
               if (var1 != 1118002659) {
                  throw new IllegalStateException();
               }

               return null;
            }

            char var8 = var0.charAt(var7);
            if (':' == var8) {
               if (var1 != 1118002659) {
                  throw new IllegalStateException();
               }

               if (var5 == 0) {
                  if (var1 != 1118002659) {
                     throw new IllegalStateException();
                  }

                  return null;
               }

               byte[] var10 = new byte[var5];
               System.arraycopy(var6, 0, var10, 0, var5);
               return var10;
            }

            if (var6.length == var5) {
               if (var1 != 1118002659) {
                  throw new IllegalStateException();
               }

               return null;
            }

            label87: {
               if (var8 >= '0') {
                  if (var1 != 1118002659) {
                     throw new IllegalStateException();
                  }

                  if (var8 <= '9') {
                     if (var1 != 1118002659) {
                        throw new IllegalStateException();
                     }

                     var8 = (char)(var8 - 48);
                     break label87;
                  }
               }

               if (var8 >= 'a') {
                  if (var1 != 1118002659) {
                     throw new IllegalStateException();
                  }

                  if (var8 <= 'z') {
                     if (var1 != 1118002659) {
                        throw new IllegalStateException();
                     }

                     var8 = (char)(var8 - 87);
                     break label87;
                  }
               }

               return null;
            }

            var6[var5++] = (byte)var8;
         }
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "dx.ae(" + ')');
      }
   }
}
