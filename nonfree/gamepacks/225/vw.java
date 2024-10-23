public abstract class vw {
   protected float[] aq;
   public int am;
   public int ax;
   public int[] ag;

   public abstract void au(int var1, int var2);

   public final void ap(int var1) {
      try {
         vr.ej(this.ag, this.am * 1441925673, this.ax * -551279691, this.aq);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vw.ap(" + ')');
      }
   }

   public final void aa(boolean var1) {
      this.aq = var1 ? new float[1 + this.ax * -551279691 * 1441925673 * this.am] : null;
   }

   public final void as(boolean var1) {
      this.aq = var1 ? new float[1 + this.ax * -551279691 * -312073363 * this.am] : null;
   }

   public final void ab(boolean var1, int var2) {
      try {
         float[] var10001;
         if (var1) {
            if (var2 >= -1659954279) {
               throw new IllegalStateException();
            }

            var10001 = new float[1 + this.ax * -551279691 * 1441925673 * this.am];
         } else {
            var10001 = null;
         }

         this.aq = var10001;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vw.ab(" + ')');
      }
   }

   public abstract void ag(int var1, int var2, int var3, int var4, int var5);

   public abstract void ar(int var1, int var2, int var3, int var4);

   protected vw() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "vw.<init>(" + ')');
      }
   }

   public final void az() {
      vr.ej(this.ag, this.am * 1441925673, this.ax * -1323611224, this.aq);
   }

   public abstract void al(int var1, int var2, int var3, int var4);

   public final void ai(boolean var1) {
      this.aq = var1 ? new float[1 + this.ax * -551279691 * 1171646337 * this.am] : null;
   }

   public final void ao(boolean var1) {
      this.aq = var1 ? new float[1 + this.ax * -551279691 * -461746760 * this.am] : null;
   }

   public abstract void ae(int var1, int var2, int var3);

   public final void ay(boolean var1) {
      this.aq = var1 ? new float[1 + this.ax * -1295301267 * 1441925673 * this.am] : null;
   }
}
