import java.io.IOException;
import java.util.concurrent.Callable;

public class as implements Callable {
   // $FF: synthetic field
   final ab this$0;
   final al ac;
   static vt[] db;
   public static final int ad = 43;
   static cw fx;

   public static int ab(int var0, byte var1) {
      try {
         if (var0 > 0) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else {
            return var0 < 0 ? -1 : 0;
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "as.ab(" + ')');
      }
   }

   public Object call() throws Exception {
      try {
         try {
            while(this.ac.am(-844240803)) {
               iv.ac(10L);
            }
         } catch (IOException var2) {
            return new ay("Error servicing REST query: " + var2.getMessage());
         }

         return this.ac.ax((byte)-127);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "as.call(" + ')');
      }
   }

   public static boolean ag(int var0, byte var1) {
      try {
         boolean var10000;
         if (0 != (var0 >> 20 & 1)) {
            if (var1 >= 4) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "as.ag(" + ')');
      }
   }

   public Object ac() throws Exception {
      try {
         while(this.ac.am(-606073110)) {
            iv.ac(10L);
         }
      } catch (IOException var2) {
         return new ay("Error servicing REST query: " + var2.getMessage());
      }

      return this.ac.ax((byte)-32);
   }

   public Object ag() throws Exception {
      try {
         while(this.ac.am(-251340665)) {
            iv.ac(10L);
         }
      } catch (IOException var2) {
         return new ay("Error servicing REST query: " + var2.getMessage());
      }

      return this.ac.ax((byte)-27);
   }

   static final int ab(int var0, int var1, int var2) {
      try {
         int var3 = hb.az(var0 - 1, var1 - 1, 1833985701) + hb.az(var0 + 1, var1 - 1, 2086319204) + hb.az(var0 - 1, var1 + 1, 2074654357) + hb.az(var0 + 1, 1 + var1, 2109586949);
         int var4 = hb.az(var0 - 1, var1, 2038243060) + hb.az(var0 + 1, var1, 1757645202) + hb.az(var0, var1 - 1, 1585560522) + hb.az(var0, var1 + 1, 1972957646);
         int var5 = hb.az(var0, var1, 2005620048);
         return var5 / 4 + var4 / 8 + var3 / 16;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "as.ab(" + ')');
      }
   }

   public static void ae(byte var0) {
      try {
         ld.ax.af();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "as.ae(" + ')');
      }
   }

   as(ab var1, al var2) {
      try {
         this.this$0 = var1;
         super();
         this.ac = var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "as.<init>(" + ')');
      }
   }

   static void ag(int var0, sl var1, of var2, int var3) {
      try {
         byte[] var4 = null;
         synchronized(oo.ac) {
            for(ox var6 = (ox)oo.ac.af(); null != var6; var6 = (ox)oo.ac.au()) {
               if (var3 >= -28972283) {
                  throw new IllegalStateException();
               }

               if ((long)var0 == var6.hk) {
                  if (var3 >= -28972283) {
                     throw new IllegalStateException();
                  }

                  if (var1 == var6.ag) {
                     if (var3 >= -28972283) {
                        throw new IllegalStateException();
                     }

                     if (0 == var6.ac * -138543647) {
                        var4 = var6.ae;
                        break;
                     }
                  }
               }
            }
         }

         if (var4 != null) {
            if (var3 >= -28972283) {
               throw new IllegalStateException();
            } else {
               var2.at(var1, var0, var4, true, 1745258360);
            }
         } else {
            byte[] var5 = var1.ac(var0, (short)-16574);
            var2.at(var1, var0, var5, true, 1786049361);
         }
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "as.ag(" + ')');
      }
   }

   public Object ae() throws Exception {
      try {
         while(this.ac.am(-914223739)) {
            iv.ac(10L);
         }
      } catch (IOException var2) {
         return new ay("Error servicing REST query: " + var2.getMessage());
      }

      return this.ac.ax((byte)-37);
   }
}
