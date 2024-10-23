import java.util.Iterator;

public class hj extends tr {
   static final int bm = 1076101438;
   static final int ax = 3;
   static ml ac = new ml(64);
   public static final int ap = 2;
   static final int bx = 36;

   public static void ae() {
      ac.am();
   }

   static int bg(int var0, int var1) {
      try {
         return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "hj.bg(" + ')');
      }
   }

   public static void ag() {
      ac.am();
   }

   public static void am() {
      ac.am();
   }

   hj() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "hj.<init>(" + ')');
      }
   }

   static int bi(int var0, dt var1, boolean var2, byte var3) {
      try {
         if (5630 == var0) {
            if (var3 >= 31) {
               throw new IllegalStateException();
            } else {
               client.ii = -1394689078;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "hj.bi(" + ')');
      }
   }

   public static final boolean ae(char var0, byte var1) {
      try {
         if (Character.isISOControl(var0)) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (fi.ar(var0, 16711935)) {
            return true;
         } else {
            char[] var2 = uq.ag;

            int var3;
            char var4;
            for(var3 = 0; var3 < var2.length; ++var3) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               var4 = var2[var3];
               if (var4 == var0) {
                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }

            var2 = uq.am;

            for(var3 = 0; var3 < var2.length; ++var3) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               var4 = var2[var3];
               if (var0 == var4) {
                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }

            return false;
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "hj.ae(" + ')');
      }
   }

   public static void ax() {
      ac.am();
   }

   static final void ig(byte var0) {
      try {
         int[] var1 = client.jl.au;
         Iterator var2 = client.ju.iterator();

         while(var2.hasNext()) {
            if (var0 == 6) {
               throw new IllegalStateException();
            }

            dd var3 = (dd)var2.next();

            int var4;
            for(var4 = 0; var4 < -396152079 * client.jl.at; ++var4) {
               if (var0 == 6) {
                  throw new IllegalStateException();
               }

               di var5 = var3.ad[var1[var4]];
               if (null != var5) {
                  if (var0 == 6) {
                     throw new IllegalStateException();
                  }

                  if (489867143 * var5.ch > 0) {
                     var5.ch -= 794054199;
                     if (var5.ch * 489867143 == 0) {
                        var5.be = null;
                     }
                  }
               }
            }

            for(var4 = 0; var4 < -514517369 * var3.ap; ++var4) {
               if (var0 == 6) {
                  throw new IllegalStateException();
               }

               int var8 = var3.ab[var4];
               ea var6 = var3.ah[var8];
               if (null != var6) {
                  if (var0 == 6) {
                     throw new IllegalStateException();
                  }

                  if (var6.ch * 489867143 > 0) {
                     var6.ch -= 794054199;
                     if (0 == var6.ch * 489867143) {
                        if (var0 == 6) {
                           throw new IllegalStateException();
                        }

                        var6.be = null;
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var7) {
         throw vk.ae(var7, "hj.ig(" + ')');
      }
   }
}
