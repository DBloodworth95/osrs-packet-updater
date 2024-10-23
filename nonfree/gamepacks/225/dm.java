public class dm implements ps {
   static final dm ax = new dm(4, 9);
   static final dm ae = new dm(1, 1);
   static final dm ag = new dm(2, 7);
   static final dm am = new dm(3, 8);
   static final dm ac = new dm(0, -1);
   final int aq;
   final int af;
   static final int bv = 1;

   static dm[] at() {
      return new dm[]{am, ac, ae, ag, ax};
   }

   static final void al(ny var0, int var1, int var2, int var3, int var4) {
      try {
         if (var0.ev == null) {
            throw new RuntimeException();
         } else {
            var0.ev[var1] = var2;
            var0.ef[var1] = var3;
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "dm.al(" + ')');
      }
   }

   public int ae() {
      return 133580385 * this.af;
   }

   public int ag() {
      return 133580385 * this.af;
   }

   dm(int var1, int var2) {
      try {
         super();
         this.aq = var1 * 18406195;
         this.af = var2 * -388178527;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "dm.<init>(" + ')');
      }
   }

   static dm[] aq() {
      return new dm[]{am, ac, ae, ag, ax};
   }

   static dm[] af() {
      return new dm[]{am, ac, ae, ag, ax};
   }

   public int am() {
      return -1467088260 * this.af;
   }

   static dm[] au() {
      return new dm[]{am, ac, ae, ag, ax};
   }

   public int ac(int var1) {
      try {
         return 133580385 * this.af;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "dm.ac(" + ')');
      }
   }

   static of hh(int var0, boolean var1, boolean var2, boolean var3, boolean var4, int var5) {
      try {
         sl var6 = null;
         if (il.ah != null) {
            var6 = new sl(var0, il.ah, ij.ab[var0], 1000000);
         }

         return new of(var6, ol.vx, tw.ve, var0, var1, var2, var3, var4, false);
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "dm.hh(" + ')');
      }
   }

   public static int bl(byte[] var0, int var1, int var2) {
      try {
         int var4 = -1;

         for(int var5 = 0; var5 < var1; ++var5) {
            if (var2 != 537493253) {
               throw new IllegalStateException();
            }

            var4 = var4 >>> 8 ^ vf.ar[(var4 ^ var0[var5]) & 255];
         }

         var4 = ~var4;
         return var4;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "dm.bl(" + ')');
      }
   }
}
