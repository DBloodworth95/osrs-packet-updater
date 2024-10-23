public class jg extends to {
   public static final int ac = 1;
   public static final int ae = 2;
   public static final int ag = 3;
   public static final int am = 5;
   int aq;
   int[] at;
   static final int cs = 20;
   int[][] au;
   jp ar;
   public static final String jx = "";
   int af;
   static final int as = 22;

   public int ag() {
      return this.af * -1566987631;
   }

   public int ax() {
      return this.af * 1213891965;
   }

   public jp ae(int var1) {
      try {
         return this.ar;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "jg.ae(" + ')');
      }
   }

   public jg(int var1, byte[] var2) {
      try {
         super();
         this.aq = -1550335849 * var1;
         vf var3 = new vf(var2);
         this.af = var3.cv(952452697) * -486417451;
         this.at = new int[1213891965 * this.af];
         this.au = new int[this.af * 1213891965][];

         int var4;
         for(var4 = 0; var4 < this.af * 1213891965; ++var4) {
            this.at[var4] = var3.cv(952452697);
         }

         for(var4 = 0; var4 < 1213891965 * this.af; ++var4) {
            this.au[var4] = new int[var3.cv(952452697)];
         }

         for(var4 = 0; var4 < this.af * 1213891965; ++var4) {
            for(int var5 = 0; var5 < this.au[var4].length; ++var5) {
               this.au[var4][var5] = var3.cv(952452697);
            }
         }

         if (var3.au * -1027766515 < var3.at.length) {
            var4 = var3.ct(-1412221311);
            if (var4 > 0) {
               this.ar = new jp(var3, var4);
            }
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "jg.<init>(" + ')');
      }
   }

   public int am() {
      return this.af * 1213891965;
   }

   public int ac(int var1) {
      try {
         return this.af * 1213891965;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "jg.ac(" + ')');
      }
   }

   public jp aq() {
      return this.ar;
   }

   public jp af() {
      return this.ar;
   }
}
