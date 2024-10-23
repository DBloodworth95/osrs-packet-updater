public class gz {
   public jy an;
   public int as;
   public static final int aj = 8;
   public static final int ak = 4;
   public short[] ay;
   public short[] ai;
   public int ae;
   public int am;
   public int at;
   public int au;
   public static final int ap = 1;
   static final float ux = 325.949F;

   public boolean aj() {
      return this.ai != null;
   }

   public boolean ap(int var1) {
      try {
         boolean var10000;
         if (this.ai != null) {
            if (var1 == -565686909) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "gz.ap(" + ')');
      }
   }

   public boolean aw(int var1) {
      try {
         boolean var10000;
         if (null != this.ay) {
            if (var1 == -21434145) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "gz.aw(" + ')');
      }
   }

   public boolean ak() {
      return this.ai != null;
   }

   public gz(int var1) {
      try {
         super();
         this.as = -1512320823;
         this.ae = -1385907173;
         this.am = 597114803;
         this.at = 1296343471;
         ip var2 = qg.aw(var1, 649869579);
         if (var2.aq((byte)-92)) {
            this.ai = new short[var2.ac.length];
            System.arraycopy(var2.ac, 0, this.ai, 0, this.ai.length);
         }

         if (var2.al((byte)0)) {
            this.ay = new short[var2.ax.length];
            System.arraycopy(var2.ax, 0, this.ay, 0, this.ay.length);
         }

         this.au = 139535591 * var2.ab;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "gz.<init>(" + ')');
      }
   }

   public boolean ai() {
      return null != this.ay;
   }
}
