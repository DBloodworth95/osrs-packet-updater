public class br implements Runnable {
   static cr[] ax;
   static boolean fm;
   static int[][][] ah;
   static final int br = 55;
   public static final int ae = 1;
   public volatile bz[] ac = new bz[2];
   static long ee;

   public static boolean ap(char var0, int var1) {
      try {
         if (var0 >= ' ') {
            if (var1 >= -1298270997) {
               throw new IllegalStateException();
            }

            if (var0 <= '~') {
               if (var1 >= -1298270997) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         if (var0 >= 160) {
            if (var1 >= -1298270997) {
               throw new IllegalStateException();
            }

            if (var0 <= 255) {
               if (var1 >= -1298270997) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         if (8364 != var0) {
            if (var1 >= -1298270997) {
               throw new IllegalStateException();
            }

            if (var0 != 338) {
               if (var1 >= -1298270997) {
                  throw new IllegalStateException();
               }

               if (var0 != 8212) {
                  if (var1 >= -1298270997) {
                     throw new IllegalStateException();
                  }

                  if (var0 != 339) {
                     if (var1 >= -1298270997) {
                        throw new IllegalStateException();
                     }

                     if (376 != var0) {
                        return false;
                     }

                     if (var1 >= -1298270997) {
                        throw new IllegalStateException();
                     }
                  }
               }
            }
         }

         return true;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "br.ap(" + ')');
      }
   }

   public void run() {
      try {
         try {
            for(int var1 = 0; var1 < 2; ++var1) {
               bz var2 = this.ac[var1];
               if (var2 != null) {
                  var2.aj((byte)5);
               }
            }
         } catch (Exception var3) {
            gc.ac((String)null, var3, (byte)-87);
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "br.run(" + ')');
      }
   }

   public void da() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            bz var2 = this.ac[var1];
            if (var2 != null) {
               var2.aj((byte)19);
            }
         }
      } catch (Exception var3) {
         gc.ac((String)null, var3, (byte)-58);
      }

   }

   public void dz() {
      try {
         for(int var1 = 0; var1 < 2; ++var1) {
            bz var2 = this.ac[var1];
            if (var2 != null) {
               var2.aj((byte)20);
            }
         }
      } catch (Exception var3) {
         gc.ac((String)null, var3, (byte)-1);
      }

   }
}
