public class vt {
   short[] aw;
   int[] ap;

   public short[] aw(byte var1) {
      try {
         return this.aw;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vt.aw(" + ')');
      }
   }

   public vt(hy var1) {
      try {
         super();
         this.ap = new int[8];
         this.aw = new short[8];
         int var2 = 0;
         if (var1.ao(787111131)) {
            var2 = var1.af(1963942209).length;
            System.arraycopy(var1.af(2063276864), 0, this.ap, 0, var2);
            System.arraycopy(var1.ab((byte)-65), 0, this.aw, 0, var2);
         }

         for(int var3 = var2; var3 < 8; ++var3) {
            this.ap[var3] = -1;
            this.aw[var3] = -1;
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "vt.<init>(" + ')');
      }
   }

   public void as(int var1, int var2, short var3) {
      this.ap[var1] = var2;
      this.aw[var1] = var3;
   }

   public void ak(int var1, int var2, short var3, byte var4) {
      try {
         this.ap[var1] = var2;
         this.aw[var1] = var3;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "vt.ak(" + ')');
      }
   }

   public void aj(int[] var1, short[] var2, int var3) {
      try {
         this.ap = var1;
         this.aw = var2;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "vt.aj(" + ')');
      }
   }

   public short[] ai() {
      return this.aw;
   }

   public void ay(int var1, int var2, short var3) {
      this.ap[var1] = var2;
      this.aw[var1] = var3;
   }

   public int[] ap(byte var1) {
      try {
         return this.ap;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vt.ap(" + ')');
      }
   }

   public void ae(int var1, int var2, short var3) {
      this.ap[var1] = var2;
      this.aw[var1] = var3;
   }

   public void am(int var1, int var2, short var3) {
      this.ap[var1] = var2;
      this.aw[var1] = var3;
   }

   public void at(int[] var1, short[] var2) {
      this.ap = var1;
      this.aw = var2;
   }

   public void au(int[] var1, short[] var2) {
      this.ap = var1;
      this.aw = var2;
   }
}
