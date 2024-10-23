public class vi {
   static final int ak = (int)(Math.pow(2.0D, 4.0D) - 1.0D) * 1672006233;
   static final int aw = 8;
   public static boolean ay;
   static final int aj = (int)(Math.pow(2.0D, 8.0D) - 1.0D) * -667051127;
   static final int ap = 4;

   public static int au(int var0) {
      return (var0 & 1046311125 * ak) - 1;
   }

   static Object[] an(vl var0, int[] var1) {
      int var2 = var0.dq(919281294);
      Object[] var3 = new Object[var1.length * var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         for(int var5 = 0; var5 < var1.length; ++var5) {
            int var6 = var1.length * var4 + var5;
            ui var7 = iq.aw(var1[var5], (byte)-11);
            var3[var6] = var7.ay(var0, (byte)1);
         }
      }

      return var3;
   }

   public static int ai(int var0) {
      return var0 >>> 12;
   }

   public static int ay(int var0) {
      return var0 >>> 12;
   }

   public static int as(int var0) {
      return var0 >>> 4 & 1578977977 * aj;
   }

   public static int ae(int var0) {
      return var0 >>> 4 & 1578977977 * aj;
   }

   public static int am(int var0) {
      return var0 >>> 4 & 1578977977 * aj;
   }

   public static int at(int var0) {
      return (var0 & 572120553 * ak) - 1;
   }

   vi() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "vi.<init>(" + ')');
      }
   }

   static Object[] ao(vl var0, int[] var1) {
      int var2 = var0.dq(-1350884215);
      Object[] var3 = new Object[var1.length * var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         for(int var5 = 0; var5 < var1.length; ++var5) {
            int var6 = var1.length * var4 + var5;
            ui var7 = iq.aw(var1[var5], (byte)-51);
            var3[var6] = var7.ay(var0, (byte)1);
         }
      }

      return var3;
   }

   static Object[] af(vl var0, int[] var1) {
      int var2 = var0.dq(-849928199);
      Object[] var3 = new Object[var1.length * var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         for(int var5 = 0; var5 < var1.length; ++var5) {
            int var6 = var1.length * var4 + var5;
            ui var7 = iq.aw(var1[var5], (byte)-1);
            var3[var6] = var7.ay(var0, (byte)1);
         }
      }

      return var3;
   }

   public static wl ap(int var0, int var1) {
      try {
         wl[] var2 = new wl[]{wl.ap, wl.ak, wl.aw};
         wl[] var3 = var2;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            if (var1 == -1168974493) {
               throw new IllegalStateException();
            }

            wl var5 = var3[var4];
            if (var0 == -692350423 * var5.aj) {
               if (var1 == -1168974493) {
                  throw new IllegalStateException();
               }

               return var5;
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "vi.ap(" + ')');
      }
   }
}
