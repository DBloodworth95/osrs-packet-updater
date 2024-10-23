public abstract class vq {
   public int[] ak;
   protected float[] ay;
   public int ai;
   public int aj;

   public abstract void ae(int var1, int var2);

   public final void az(byte var1) {
      try {
         vz.dn(this.ak, 488852221 * this.aj, 168694077 * this.ai, this.ay);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vq.az(" + ')');
      }
   }

   public final void ax() {
      vz.dn(this.ak, 488852221 * this.aj, 168694077 * this.ai, this.ay);
   }

   public final void ag(boolean var1, int var2) {
      try {
         float[] var10001;
         if (var1) {
            if (var2 <= 171186151) {
               throw new IllegalStateException();
            }

            var10001 = new float[1 + this.aj * 488852221 * this.ai * 168694077];
         } else {
            var10001 = null;
         }

         this.ay = var10001;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vq.ag(" + ')');
      }
   }

   public abstract void at(int var1, int var2, int var3, int var4);

   public abstract void aw(int var1, int var2, int var3);

   public abstract void am(int var1, int var2);

   public abstract void ak(int var1, int var2, int var3, int var4, int var5);

   public final void ad() {
      vz.dn(this.ak, 488852221 * this.aj, 168694077 * this.ai, this.ay);
   }

   public final void ac() {
      vz.dn(this.ak, 333910764 * this.aj, -285517356 * this.ai, this.ay);
   }

   public final void av() {
      vz.dn(this.ak, 488852221 * this.aj, 168694077 * this.ai, this.ay);
   }

   public final void al(boolean var1) {
      this.ay = var1 ? new float[1 + this.aj * 488852221 * this.ai * 168694077] : null;
   }

   public final void aq() {
      vz.dn(this.ak, 488852221 * this.aj, 168694077 * this.ai, this.ay);
   }

   protected vq() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "vq.<init>(" + ')');
      }
   }

   public final void aa(boolean var1) {
      this.ay = var1 ? new float[1 + this.aj * 488852221 * this.ai * 168694077] : null;
   }

   public final void ah(boolean var1) {
      this.ay = var1 ? new float[1 + this.aj * 488852221 * this.ai * 283943158] : null;
   }
}
