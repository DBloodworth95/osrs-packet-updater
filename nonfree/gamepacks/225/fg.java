public class fg implements ps {
   static final fg ax = new fg(4, 4, (String)null, 1);
   static final fg ac = new fg(0, 0, (String)null, 0);
   static final fg ag = new fg(2, 2, (String)null, 3);
   static final fg am = new fg(3, 3, (String)null, 6);
   static final fg ae = new fg(1, 1, (String)null, 9);
   static final fg aq = new fg(5, 5, (String)null, 3);
   final int af;
   final int at;
   final int au;
   static vt de;

   public int am() {
      return 1698258669 * this.at;
   }

   int ax(int var1) {
      try {
         return this.au * 454426023;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "fg.ax(" + ')');
      }
   }

   public int ac(int var1) {
      try {
         return 1698258669 * this.at;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "fg.ac(" + ')');
      }
   }

   int aq() {
      return this.au * 454426023;
   }

   public int ag() {
      return 1698258669 * this.at;
   }

   static int[] ae(int var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         int[] var6 = new int[256];

         int var7;
         for(var7 = 0; var7 < 64; ++var7) {
            var6[var7] = sg.ag(var0, var1, var7, 1457199540);
         }

         for(var7 = 0; var7 < 64; ++var7) {
            if (var5 != 1) {
               throw new IllegalStateException();
            }

            var6[64 + var7] = sg.ag(var1, var2, var7, 1457199540);
         }

         for(var7 = 0; var7 < 64; ++var7) {
            if (var5 != 1) {
               throw new IllegalStateException();
            }

            var6[128 + var7] = sg.ag(var2, var3, var7, 1457199540);
         }

         for(var7 = 0; var7 < 64; ++var7) {
            if (var5 != 1) {
               throw new IllegalStateException();
            }

            var6[var7 + 192] = sg.ag(var3, var4, var7, 1457199540);
         }

         return var6;
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "fg.ae(" + ')');
      }
   }

   fg(int var1, int var2, String var3, int var4) {
      try {
         super();
         this.af = var1 * -1611606087;
         this.at = var2 * -1414680859;
         this.au = var4 * 1837816343;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "fg.<init>(" + ')');
      }
   }

   int af() {
      return this.au * 454426023;
   }

   int at() {
      return this.au * 454426023;
   }

   public int ae() {
      return 306162686 * this.at;
   }
}
