public class vh {
   short[] ae;
   int[] ac;

   public vh(hn var1) {
      try {
         super();
         this.ac = new int[8];
         this.ae = new short[8];
         int var2 = 0;
         if (var1.ad((byte)1)) {
            var2 = var1.ah(-29295119).length;
            System.arraycopy(var1.ah(127656750), 0, this.ac, 0, var2);
            System.arraycopy(var1.ab(-1863765918), 0, this.ae, 0, var2);
         }

         for(int var3 = var2; var3 < 8; ++var3) {
            this.ac[var3] = -1;
            this.ae[var3] = -1;
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "vh.<init>(" + ')');
      }
   }

   public int[] ac(int var1) {
      try {
         return this.ac;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vh.ac(" + ')');
      }
   }

   public void ap(int var1, int var2, short var3) {
      this.ac[var1] = var2;
      this.ae[var1] = var3;
   }

   public void ag(int var1, int var2, short var3, int var4) {
      try {
         this.ac[var1] = var2;
         this.ae[var1] = var3;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "vh.ag(" + ')');
      }
   }

   public void am(int[] var1, short[] var2, int var3) {
      try {
         this.ac = var1;
         this.ae = var2;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "vh.am(" + ')');
      }
   }

   public int[] ax() {
      return this.ac;
   }

   public int[] aq() {
      return this.ac;
   }

   public void al(int var1, int var2, short var3) {
      this.ac[var1] = var2;
      this.ae[var1] = var3;
   }

   public short[] ae(byte var1) {
      try {
         return this.ae;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vh.ae(" + ')');
      }
   }

   public short[] au() {
      return this.ae;
   }

   public int[] af() {
      return this.ac;
   }

   public short[] ar() {
      return this.ae;
   }

   public void ad(int var1, int var2, short var3) {
      this.ac[var1] = var2;
      this.ae[var1] = var3;
   }

   public void ai(int[] var1, short[] var2) {
      this.ac = var1;
      this.ae = var2;
   }

   public void ah(int var1, int var2, short var3) {
      this.ac[var1] = var2;
      this.ae[var1] = var3;
   }

   public void ab(int var1, int var2, short var3) {
      this.ac[var1] = var2;
      this.ae[var1] = var3;
   }

   public void az(int[] var1, short[] var2) {
      this.ac = var1;
      this.ae = var2;
   }

   public void aa(int[] var1, short[] var2) {
      this.ac = var1;
      this.ae = var2;
   }

   public short[] at() {
      return this.ae;
   }

   public void ao(int[] var1, short[] var2) {
      this.ac = var1;
      this.ae = var2;
   }
}
