public class jt {
   int aq = -1;
   static int[] ae = new int[500];
   jg ax = null;
   static int[] am = new int[500];
   int[] ar;
   boolean al = false;
   int[] af;
   int[] at;
   int[] au;
   static int[] ac = new int[500];
   static int[] ag = new int[500];

   jt(byte[] var1, jg var2) {
      this.ax = var2;
      vf var3 = new vf(var1);
      vf var4 = new vf(var1);
      var3.au = 566050698;
      int var5 = var3.cv(952452697);
      int var6 = -1;
      int var7 = 0;
      var4.au = (var3.au * -1027766515 + var5) * -1864458299;

      int var8;
      for(var8 = 0; var8 < var5; ++var8) {
         int var9 = var3.cv(952452697);
         if (var9 > 0) {
            if (this.ax.at[var8] != 0) {
               for(int var10 = var8 - 1; var10 > var6; --var10) {
                  if (this.ax.at[var10] == 0) {
                     ac[var7] = var10;
                     ae[var7] = 0;
                     ag[var7] = 0;
                     am[var7] = 0;
                     ++var7;
                     break;
                  }
               }
            }

            ac[var7] = var8;
            short var11 = 0;
            if (this.ax.at[var8] == 3) {
               var11 = 128;
            }

            if ((var9 & 1) != 0) {
               ae[var7] = var4.ce(1798944571);
            } else {
               ae[var7] = var11;
            }

            if ((var9 & 2) != 0) {
               ag[var7] = var4.ce(1287957913);
            } else {
               ag[var7] = var11;
            }

            if ((var9 & 4) != 0) {
               am[var7] = var4.ce(1525284838);
            } else {
               am[var7] = var11;
            }

            var6 = var8;
            ++var7;
            if (this.ax.at[var8] == 5) {
               this.al = true;
            }
         }
      }

      if (var4.au * -1027766515 != var1.length) {
         throw new RuntimeException();
      } else {
         this.aq = var7;
         this.af = new int[var7];
         this.at = new int[var7];
         this.au = new int[var7];
         this.ar = new int[var7];

         for(var8 = 0; var8 < var7; ++var8) {
            this.af[var8] = ac[var8];
            this.at[var8] = ae[var8];
            this.au[var8] = ag[var8];
            this.ar[var8] = am[var8];
         }

      }
   }
}
