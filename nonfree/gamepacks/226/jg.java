public class jg {
   int ay = -1;
   jt ai = null;
   static int[] ap = new int[500];
   static int[] aj = new int[500];
   int[] ae;
   static int[] aw = new int[500];
   int[] as;
   static int[] ak = new int[500];
   int[] am;
   int[] at;
   boolean au = false;

   jg(byte[] var1, jt var2) {
      this.ai = var2;
      vl var3 = new vl(var1);
      vl var4 = new vl(var1);
      var3.am = -1451176166;
      int var5 = var3.cy((short)-26183);
      int var6 = -1;
      int var7 = 0;
      var4.am = (var3.am * -1689308347 + var5) * -725588083;

      int var8;
      for(var8 = 0; var8 < var5; ++var8) {
         int var9 = var3.cy((short)-2721);
         if (var9 > 0) {
            if (this.ai.ae[var8] != 0) {
               for(int var10 = var8 - 1; var10 > var6; --var10) {
                  if (this.ai.ae[var10] == 0) {
                     ap[var7] = var10;
                     aw[var7] = 0;
                     ak[var7] = 0;
                     aj[var7] = 0;
                     ++var7;
                     break;
                  }
               }
            }

            ap[var7] = var8;
            short var11 = 0;
            if (this.ai.ae[var8] == 3) {
               var11 = 128;
            }

            if ((var9 & 1) != 0) {
               aw[var7] = var4.ck((byte)1);
            } else {
               aw[var7] = var11;
            }

            if ((var9 & 2) != 0) {
               ak[var7] = var4.ck((byte)1);
            } else {
               ak[var7] = var11;
            }

            if ((var9 & 4) != 0) {
               aj[var7] = var4.ck((byte)1);
            } else {
               aj[var7] = var11;
            }

            var6 = var8;
            ++var7;
            if (this.ai.ae[var8] == 5) {
               this.au = true;
            }
         }
      }

      if (var4.am * -1689308347 != var1.length) {
         throw new RuntimeException();
      } else {
         this.ay = var7;
         this.as = new int[var7];
         this.ae = new int[var7];
         this.am = new int[var7];
         this.at = new int[var7];

         for(var8 = 0; var8 < var7; ++var8) {
            this.as[var8] = ap[var8];
            this.ae[var8] = aw[var8];
            this.am[var8] = ak[var8];
            this.at[var8] = aj[var8];
         }

      }
   }
}
