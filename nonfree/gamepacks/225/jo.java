public class jo extends jx {
   int am;
   int ae;
   int ag;
   int al;
   int ax;
   int aq;
   int au;
   int at;
   int ar;
   static final int by = 57;
   int ac;
   int af;

   void ag(jh var1, jb var2, int var3, int var4, int var5) {
      try {
         int var6 = var2.ac.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            if (var5 >= -480883950) {
               return;
            }

            int var8 = var2.ac[var7] - this.ac * 601615717;
            int var9 = var2.ae[var7] - 1166442155 * this.ae;
            int var10 = var2.ag[var7] - this.ag * 6992325;
            int var11 = var8 * -1140423205 * this.au + var10 * this.at * -1316946351 >> 16;
            var10 = var10 * -1140423205 * this.au - this.at * -1316946351 * var8 >> 16;
            var8 = var11;
            var11 = var9 * this.af * -1417086073 - var10 * this.aq * 1644366977 >> 16;
            var10 = this.af * -1417086073 * var10 + 1644366977 * this.aq * var9 >> 16;
            if (var10 < 50) {
               if (var5 >= -480883950) {
                  throw new IllegalStateException();
               }

               return;
            }

            if (var2.ar != null) {
               jb.ao[var7] = var8;
               jb.as[var7] = var11;
               jb.ay[var7] = var10;
            }

            jb.az[var7] = jw.af() + var8 * jw.ah() / var10;
            jb.aa[var7] = jw.at() + var11 * jw.ah() / var10;
            jb.ai[var7] = fq.aq(var10, 1552517184);
         }

         this.ar(var1, var2, var3, var4, (byte)73);
      } catch (RuntimeException var12) {
         throw vk.ae(var12, "jo.ag(" + ')');
      }
   }

   void ac(ju var1, int var2, int var3, int var4, int var5, long var6) {
      try {
         var1.eo(var2, this.am * -2021146927, this.ax * 340793353, var3, var4, var5, this.ac * 601615717, this.ae * 1166442155, 6992325 * this.ag, var6, -1357898515 * this.ar, this.al * 1145269919, false);
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "jo.ac(" + ')');
      }
   }

   void ae(jh var1, jl var2, int var3, int var4, int var5, int var6) {
      try {
         int var7;
         int var8 = var7 = (var4 << 7) - 601615717 * this.ac;
         int var9;
         int var10 = var9 = (var5 << 7) - this.ag * 6992325;
         int var11;
         int var12 = var11 = 128 + var8;
         int var13;
         int var14 = var13 = 128 + var10;
         int var15 = var1.af[var3][var4][var5] - 1166442155 * this.ae;
         int var16 = var1.af[var3][1 + var4][var5] - 1166442155 * this.ae;
         int var17 = var1.af[var3][var4 + 1][1 + var5] - this.ae * 1166442155;
         int var18 = var1.af[var3][var4][var5 + 1] - 1166442155 * this.ae;
         int var19 = var8 * -1140423205 * this.au + var10 * this.at * -1316946351 >> 16;
         var10 = this.au * -1140423205 * var10 - var8 * -1316946351 * this.at >> 16;
         var8 = var19;
         var19 = this.af * -1417086073 * var15 - 1644366977 * this.aq * var10 >> 16;
         var10 = -1417086073 * this.af * var10 + this.aq * 1644366977 * var15 >> 16;
         var15 = var19;
         if (var10 < 50) {
            if (var6 <= 695022261) {
               throw new IllegalStateException();
            }
         } else {
            var19 = var12 * -1140423205 * this.au + var9 * this.at * -1316946351 >> 16;
            var9 = this.au * -1140423205 * var9 - var12 * this.at * -1316946351 >> 16;
            var12 = var19;
            var19 = var16 * -1417086073 * this.af - this.aq * 1644366977 * var9 >> 16;
            var9 = var16 * this.aq * 1644366977 + var9 * -1417086073 * this.af >> 16;
            var16 = var19;
            if (var9 >= 50) {
               var19 = -1316946351 * this.at * var14 + var11 * -1140423205 * this.au >> 16;
               var14 = this.au * -1140423205 * var14 - var11 * -1316946351 * this.at >> 16;
               var11 = var19;
               var19 = -1417086073 * this.af * var17 - 1644366977 * this.aq * var14 >> 16;
               var14 = var14 * this.af * -1417086073 + var17 * this.aq * 1644366977 >> 16;
               var17 = var19;
               if (var14 >= 50) {
                  var19 = var13 * -1316946351 * this.at + var7 * -1140423205 * this.au >> 16;
                  var13 = -1140423205 * this.au * var13 - -1316946351 * this.at * var7 >> 16;
                  var7 = var19;
                  var19 = var18 * this.af * -1417086073 - var13 * 1644366977 * this.aq >> 16;
                  var13 = 1644366977 * this.aq * var18 + var13 * this.af * -1417086073 >> 16;
                  if (var13 < 50) {
                     if (var6 <= 695022261) {
                        throw new IllegalStateException();
                     }
                  } else {
                     this.au(var1, var2, var4, var5, var8, var12, var11, var7, var15, var16, var17, var19, var10, var9, var14, var13, 1329653403);
                  }
               }
            }
         }
      } catch (RuntimeException var20) {
         throw vk.ae(var20, "jo.ae(" + ')');
      }
   }

   jo(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         super();
         this.ac = 1349745773 * var1;
         this.ae = 980782083 * var2;
         this.ag = var3 * 1661838605;
         this.am = var4 * 2025806385;
         this.ax = 2063791673 * var5;
         this.aq = 410596225 * jw.am[var4];
         this.af = -136848841 * jw.ax[var4];
         this.at = jw.am[var5] * 814811825;
         this.au = -308023725 * jw.ax[var5];
         this.ar = var6 * -666197787;
         this.al = var7 * 1249389919;
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "jo.<init>(" + ')');
      }
   }

   void af(jh var1, jl var2, int var3, int var4, int var5) {
      int var6;
      int var7 = var6 = (var4 << 7) - 601615717 * this.ac;
      int var8;
      int var9 = var8 = (var5 << 7) - this.ag * 6992325;
      int var10;
      int var11 = var10 = 128 + var7;
      int var12;
      int var13 = var12 = 128 + var9;
      int var14 = var1.af[var3][var4][var5] - 1166442155 * this.ae;
      int var15 = var1.af[var3][1 + var4][var5] - 1166442155 * this.ae;
      int var16 = var1.af[var3][var4 + 1][1 + var5] - this.ae * 1166442155;
      int var17 = var1.af[var3][var4][var5 + 1] - 1166442155 * this.ae;
      int var18 = var7 * -1140423205 * this.au + var9 * this.at * -1316946351 >> 16;
      var9 = this.au * -1140423205 * var9 - var7 * -1316946351 * this.at >> 16;
      var7 = var18;
      var18 = this.af * -1417086073 * var14 - 1644366977 * this.aq * var9 >> 16;
      var9 = -1417086073 * this.af * var9 + this.aq * 1644366977 * var14 >> 16;
      var14 = var18;
      if (var9 >= 50) {
         var18 = var11 * -1140423205 * this.au + var8 * this.at * -1316946351 >> 16;
         var8 = this.au * -1140423205 * var8 - var11 * this.at * -1316946351 >> 16;
         var11 = var18;
         var18 = var15 * -1417086073 * this.af - this.aq * 1644366977 * var8 >> 16;
         var8 = var15 * this.aq * 1644366977 + var8 * -1417086073 * this.af >> 16;
         var15 = var18;
         if (var8 >= 50) {
            var18 = -1316946351 * this.at * var13 + var10 * -1140423205 * this.au >> 16;
            var13 = this.au * -1140423205 * var13 - var10 * -1316946351 * this.at >> 16;
            var10 = var18;
            var18 = -1417086073 * this.af * var16 - 1644366977 * this.aq * var13 >> 16;
            var13 = var13 * this.af * -1417086073 + var16 * this.aq * 1644366977 >> 16;
            var16 = var18;
            if (var13 >= 50) {
               var18 = var12 * -1316946351 * this.at + var6 * -1140423205 * this.au >> 16;
               var12 = -1140423205 * this.au * var12 - -1316946351 * this.at * var6 >> 16;
               var6 = var18;
               var18 = var17 * this.af * -1417086073 - var12 * 1644366977 * this.aq >> 16;
               var12 = 1644366977 * this.aq * var17 + var12 * this.af * -1417086073 >> 16;
               if (var12 >= 50) {
                  this.au(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var18, var9, var8, var13, var12, 918252473);
               }
            }
         }
      }
   }

   void ax(ju var1, int var2, int var3, int var4, int var5, long var6) {
      var1.eo(var2, this.am * -2021146927, this.ax * 340793353, var3, var4, var5, this.ac * 601615717, this.ae * 1166442155, 6992325 * this.ag, var6, -1357898515 * this.ar, this.al * 1145269919, false);
   }

   void aq(ju var1, int var2, int var3, int var4, int var5, long var6) {
      var1.eo(var2, this.am * -2021146927, this.ax * 340793353, var3, var4, var5, this.ac * 601615717, this.ae * 1166442155, 6992325 * this.ag, var6, -1357898515 * this.ar, this.al * 1145269919, false);
   }

   void am(ju var1, int var2, int var3, int var4, int var5, long var6) {
      var1.eo(var2, this.am * -2021146927, this.ax * 340793353, var3, var4, var5, this.ac * 479793560, this.ae * 1166442155, -449623317 * this.ag, var6, -1335892746 * this.ar, this.al * 1145269919, false);
   }

   void at(jh var1, jb var2, int var3, int var4) {
      int var5 = var2.ac.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = var2.ac[var6] - this.ac * 601615717;
         int var8 = var2.ae[var6] - 1166442155 * this.ae;
         int var9 = var2.ag[var6] - this.ag * 6992325;
         int var10 = var7 * -1140423205 * this.au + var9 * this.at * -1316946351 >> 16;
         var9 = var9 * -1140423205 * this.au - this.at * -1316946351 * var7 >> 16;
         var7 = var10;
         var10 = var8 * this.af * -1417086073 - var9 * this.aq * 1644366977 >> 16;
         var9 = this.af * -1417086073 * var9 + 1644366977 * this.aq * var8 >> 16;
         if (var9 < 50) {
            return;
         }

         if (var2.ar != null) {
            jb.ao[var6] = var7;
            jb.as[var6] = var10;
            jb.ay[var6] = var9;
         }

         jb.az[var6] = jw.af() + var7 * jw.ah() / var9;
         jb.aa[var6] = jw.at() + var10 * jw.ah() / var9;
         jb.ai[var6] = fq.aq(var9, 536249355);
      }

      this.ar(var1, var2, var3, var4, (byte)24);
   }
}
