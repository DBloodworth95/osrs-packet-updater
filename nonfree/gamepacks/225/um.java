public class um {
   static final int am = (int)(Math.pow(2.0D, 8.0D) - 1.0D) * -1022935247;
   static final int ac = 4;
   static final int ag = (int)(Math.pow(2.0D, 4.0D) - 1.0D) * 1239876019;

   public static int ad(int var0) {
      return var0 >>> 4 & am * -955692524;
   }

   public static int ax(int var0) {
      return var0 >>> 12;
   }

   public static int aq(int var0) {
      return var0 >>> 12;
   }

   public static int ar(int var0) {
      return var0 >>> 4 & am * 1415297489;
   }

   public static int at(int var0) {
      return var0 >>> 12;
   }

   public static int ah(int var0) {
      return (var0 & ag * -375592409) - 1;
   }

   um() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "um.<init>(" + ')');
      }
   }

   public static int al(int var0) {
      return var0 >>> 4 & am * 1415297489;
   }

   public static int ap(int var0) {
      return (var0 & ag * -1184393861) - 1;
   }

   public static int af(int var0) {
      return var0 >>> 12;
   }

   static Object[] aa(vf var0, int[] var1) {
      int var2 = var0.ck((byte)48);
      Object[] var3 = new Object[var2 * var1.length];

      for(int var4 = 0; var4 < var2; ++var4) {
         for(int var5 = 0; var5 < var1.length; ++var5) {
            int var6 = var5 + var1.length * var4;
            ux var7 = dn.ae(var1[var5], (byte)-45);
            var3[var6] = var7.at(var0, -1485146208);
         }
      }

      return var3;
   }

   public static int ab(int var0) {
      return (var0 & ag * 106498513) - 1;
   }

   public static int az(int var0) {
      return (var0 & ag * -1184393861) - 1;
   }

   public static int au(int var0) {
      return var0 >>> 4 & am * 1415297489;
   }

   static vv[] at(int var0) {
      try {
         vv[] var1 = new vv[1440067257 * vp.ac];

         for(int var2 = 0; var2 < vp.ac * 1440067257; ++var2) {
            if (var0 == 67250689) {
               throw new IllegalStateException();
            }

            vv var3 = var1[var2] = new vv();
            var3.aq = -1267556917 * vp.ae;
            var3.af = -1551354163 * vp.ag;
            var3.am = rg.am[var2];
            var3.ax = dp.ax[var2];
            var3.ae = pp.aq[var2];
            var3.ag = kj.af[var2];
            int var4 = var3.ag * var3.ae;
            byte[] var5 = nq.au[var2];
            var3.ac = new int[var4];

            for(int var6 = 0; var6 < var4; ++var6) {
               if (var0 == 67250689) {
                  throw new IllegalStateException();
               }

               var3.ac[var6] = vp.at[var5[var6] & 255];
            }
         }

         fx.al((byte)16);
         return var1;
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "um.at(" + ')');
      }
   }
}
