import java.util.HashMap;

public class pn {
   int[] am;
   qy ae;
   int ax;
   int[] ag;
   final HashMap ac;
   static final int ch = 69;

   void ap(int var1) {
      int var2 = 1 + var1 * 2;
      double[] var3 = cy.ag(0.0D, (double)((float)var1 / 3.0F), var1, -1685141075);
      double var4 = var3[var1] * var3[var1];
      int[] var6 = new int[var2 * var2];
      boolean var7 = false;

      for(int var8 = 0; var8 < var2; ++var8) {
         for(int var9 = 0; var9 < var2; ++var9) {
            int var10 = var6[var2 * var8 + var9] = (int)(var3[var9] * var3[var8] / var4 * 256.0D);
            if (!var7 && var10 > 0) {
               var7 = true;
            }
         }
      }

      vv var11 = new vv(var6, var2, var2);
      this.ac.put(var1, var11);
   }

   void ae(int var1, byte var2) {
      try {
         int var3 = 1 + var1 * 2;
         double[] var4 = cy.ag(0.0D, (double)((float)var1 / 3.0F), var1, 532814007);
         double var5 = var4[var1] * var4[var1];
         int[] var7 = new int[var3 * var3];
         boolean var8 = false;

         for(int var9 = 0; var9 < var3; ++var9) {
            if (var2 >= -1) {
               return;
            }

            for(int var10 = 0; var10 < var3; ++var10) {
               if (var2 >= -1) {
                  throw new IllegalStateException();
               }

               int var11 = var7[var3 * var9 + var10] = (int)(var4[var10] * var4[var9] / var5 * 256.0D);
               if (!var8) {
                  if (var2 >= -1) {
                     throw new IllegalStateException();
                  }

                  if (var11 > 0) {
                     if (var2 >= -1) {
                        throw new IllegalStateException();
                     }

                     var8 = true;
                  }
               }
            }
         }

         vv var13 = new vv(var7, var3, var3);
         this.ac.put(var1, var13);
      } catch (RuntimeException var12) {
         throw vk.ae(var12, "pn.ae(" + ')');
      }
   }

   static void au() {
      kj.au = new int[2000];
      int var0 = 0;
      int var1 = 240;

      int var3;
      for(byte var2 = 12; var0 < 16; var1 -= var2) {
         var3 = bt.ac((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.075F + (float)var0 * 0.425F / 16.0F));
         kj.au[var0] = var3;
         ++var0;
      }

      var1 = 48;

      for(int var5 = var1 / 6; var0 < kj.au.length; var1 -= var5) {
         var3 = 2 * var0;

         for(int var4 = bt.ac((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < kj.au.length; ++var0) {
            kj.au[var0] = var4;
         }
      }

   }

   public final void am(int var1, int var2, byte var3) {
      try {
         if (this.ax * -1092937495 >= this.ag.length) {
            if (var3 != 0) {
               throw new IllegalStateException();
            }
         } else {
            this.ag[-1092937495 * this.ax] = var1;
            this.am[-1092937495 * this.ax] = var2;
            this.ax += -180666535;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "pn.am(" + ')');
      }
   }

   public final void ax(int var1) {
      try {
         this.ax = 0;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "pn.ax(" + ')');
      }
   }

   vv aa(int var1) {
      if (!this.ac.containsKey(var1)) {
         this.ae(var1, (byte)-123);
      }

      return (vv)this.ac.get(var1);
   }

   static void at() {
      kj.au = new int[2000];
      int var0 = 0;
      int var1 = 240;

      int var3;
      for(byte var2 = 12; var0 < 16; var1 -= var2) {
         var3 = bt.ac((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.075F + (float)var0 * 0.425F / 16.0F));
         kj.au[var0] = var3;
         ++var0;
      }

      var1 = 48;

      for(int var5 = var1 / 6; var0 < kj.au.length; var1 -= var5) {
         var3 = 2 * var0;

         for(int var4 = bt.ac((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < kj.au.length; ++var0) {
            kj.au[var0] = var4;
         }
      }

   }

   vv az(int var1) {
      if (!this.ac.containsKey(var1)) {
         this.ae(var1, (byte)-97);
      }

      return (vv)this.ac.get(var1);
   }

   vv ag(int var1, byte var2) {
      try {
         if (!this.ac.containsKey(var1)) {
            if (var2 != 0) {
               throw new IllegalStateException();
            }

            this.ae(var1, (byte)-45);
         }

         return (vv)this.ac.get(var1);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "pn.ag(" + ')');
      }
   }

   static void ar() {
      kj.au = new int[-865395405];
      int var0 = 0;
      int var1 = -197759757;

      int var3;
      for(byte var2 = 12; var0 < 16; var1 -= var2) {
         var3 = bt.ac((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)(0.075F + (float)var0 * 0.425F / 16.0F));
         kj.au[var0] = var3;
         ++var0;
      }

      var1 = -2063923721;

      for(int var5 = var1 / 6; var0 < kj.au.length; var1 -= var5) {
         var3 = 2 * var0;

         for(int var4 = bt.ac((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < kj.au.length; ++var0) {
            kj.au[var0] = var4;
         }
      }

   }

   void al(int var1) {
      int var2 = 1 + var1 * 2;
      double[] var3 = cy.ag(0.0D, (double)((float)var1 / 3.0F), var1, 401241306);
      double var4 = var3[var1] * var3[var1];
      int[] var6 = new int[var2 * var2];
      boolean var7 = false;

      for(int var8 = 0; var8 < var2; ++var8) {
         for(int var9 = 0; var9 < var2; ++var9) {
            int var10 = var6[var2 * var8 + var9] = (int)(var3[var9] * var3[var8] / var4 * 256.0D);
            if (!var7 && var10 > 0) {
               var7 = true;
            }
         }
      }

      vv var11 = new vv(var6, var2, var2);
      this.ac.put(var1, var11);
   }

   void ad(int var1) {
      int var2 = 1 + var1 * 2;
      double[] var3 = cy.ag(0.0D, (double)((float)var1 / 3.0F), var1, -2098977256);
      double var4 = var3[var1] * var3[var1];
      int[] var6 = new int[var2 * var2];
      boolean var7 = false;

      for(int var8 = 0; var8 < var2; ++var8) {
         for(int var9 = 0; var9 < var2; ++var9) {
            int var10 = var6[var2 * var8 + var9] = (int)(var3[var9] * var3[var8] / var4 * 256.0D);
            if (!var7 && var10 > 0) {
               var7 = true;
            }
         }
      }

      vv var11 = new vv(var6, var2, var2);
      this.ac.put(var1, var11);
   }

   void ah(int var1) {
      int var2 = 1 + var1 * 2;
      double[] var3 = cy.ag(0.0D, (double)((float)var1 / 3.0F), var1, 299476103);
      double var4 = var3[var1] * var3[var1];
      int[] var6 = new int[var2 * var2];
      boolean var7 = false;

      for(int var8 = 0; var8 < var2; ++var8) {
         for(int var9 = 0; var9 < var2; ++var9) {
            int var10 = var6[var2 * var8 + var9] = (int)(var3[var9] * var3[var8] / var4 * 256.0D);
            if (!var7 && var10 > 0) {
               var7 = true;
            }
         }
      }

      vv var11 = new vv(var6, var2, var2);
      this.ac.put(var1, var11);
   }

   public pn() {
      try {
         super();
         this.ac = new HashMap();
         this.ae = new qy(0, 0);
         this.ag = new int[2048];
         this.am = new int[2048];
         this.ax = 0;
         gc.ac(294720589);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "pn.<init>(" + ')');
      }
   }

   vv ab(int var1) {
      if (!this.ac.containsKey(var1)) {
         this.ae(var1, (byte)-23);
      }

      return (vv)this.ac.get(var1);
   }

   void af(vv var1, vv var2, qy var3, int var4) {
      try {
         if (392803297 * var3.ag != 0) {
            if (var4 <= 1943108661) {
               throw new IllegalStateException();
            }

            if (-1728093045 * var3.am != 0) {
               int var5 = 0;
               int var6 = 0;
               if (1553874907 * var3.ac == 0) {
                  if (var4 <= 1943108661) {
                     throw new IllegalStateException();
                  }

                  var5 = var1.ae - 392803297 * var3.ag;
               }

               if (-711240997 * var3.ae == 0) {
                  if (var4 <= 1943108661) {
                     return;
                  }

                  var6 = var1.ag - var3.am * -1728093045;
               }

               int var7 = var1.ae * var6 + var5;
               int var8 = 1553874907 * var3.ac + -711240997 * var3.ae * var2.ae;

               for(int var9 = 0; var9 < var3.am * -1728093045; ++var9) {
                  if (var4 <= 1943108661) {
                     return;
                  }

                  for(int var10 = 0; var10 < 392803297 * var3.ag; ++var10) {
                     if (var4 <= 1943108661) {
                        return;
                     }

                     int[] var10000 = var2.ac;
                     int var10001 = var8++;
                     var10000[var10001] += var1.ac[var7++];
                  }

                  var7 += var1.ae - 392803297 * var3.ag;
                  var8 += var2.ae - 392803297 * var3.ag;
               }

               return;
            }

            if (var4 <= 1943108661) {
               throw new IllegalStateException();
            }
         }

      } catch (RuntimeException var11) {
         throw vk.ae(var11, "pn.af(" + ')');
      }
   }

   public final void aq(int var1, int var2, vv var3, float var4, int var5) {
      try {
         int var6 = (int)(18.0F * var4);
         vv var7 = this.ag(var6, (byte)0);
         int var8 = 1 + var6 * 2;
         qy var9 = new qy(0, 0, var3.ae, var3.ag);
         qy var10 = new qy(0, 0);
         this.ae.ae(var8, var8, (byte)-33);
         System.nanoTime();

         int var11;
         int var12;
         int var13;
         for(var11 = 0; var11 < -1092937495 * this.ax; ++var11) {
            if (var5 <= -1864458299) {
               throw new IllegalStateException();
            }

            var12 = this.ag[var11];
            var13 = this.am[var11];
            int var14 = (int)(var4 * (float)(var12 - var1)) - var6;
            int var15 = (int)((float)var3.ag - var4 * (float)(var13 - var2)) - var6;
            this.ae.ac(var14, var15, 1531960179);
            this.ae.am(var9, var10, -1584820076);
            this.af(var7, var3, var10, 2069124842);
         }

         System.nanoTime();
         System.nanoTime();

         for(var11 = 0; var11 < var3.ac.length; ++var11) {
            if (var5 <= -1864458299) {
               throw new IllegalStateException();
            }

            if (var3.ac[var11] == 0) {
               if (var5 <= -1864458299) {
                  throw new IllegalStateException();
               }

               var3.ac[var11] = -16777216;
            } else {
               var12 = (64 + var3.ac[var11] - 1) / 256;
               if (var12 <= 0) {
                  if (var5 <= -1864458299) {
                     throw new IllegalStateException();
                  }

                  var3.ac[var11] = -16777216;
               } else {
                  if (var12 > kj.au.length) {
                     if (var5 <= -1864458299) {
                        throw new IllegalStateException();
                     }

                     var12 = kj.au.length;
                  }

                  var13 = kj.au[var12 - 1];
                  var3.ac[var11] = -16777216 | var13;
               }
            }
         }

         System.nanoTime();
      } catch (RuntimeException var16) {
         throw vk.ae(var16, "pn.aq(" + ')');
      }
   }

   public final void ai(int var1, int var2) {
      if (this.ax * -1092937495 < this.ag.length) {
         this.ag[-1092937495 * this.ax] = var1;
         this.am[-1092937495 * this.ax] = var2;
         this.ax += -180666535;
      }
   }

   public final void ao() {
      this.ax = 0;
   }

   public final void as(int var1, int var2, vv var3, float var4) {
      int var5 = (int)(18.0F * var4);
      vv var6 = this.ag(var5, (byte)0);
      int var7 = 1 + var5 * 2;
      qy var8 = new qy(0, 0, var3.ae, var3.ag);
      qy var9 = new qy(0, 0);
      this.ae.ae(var7, var7, (byte)-13);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < -1092937495 * this.ax; ++var10) {
         var11 = this.ag[var10];
         var12 = this.am[var10];
         int var13 = (int)(var4 * (float)(var11 - var1)) - var5;
         int var14 = (int)((float)var3.ag - var4 * (float)(var12 - var2)) - var5;
         this.ae.ac(var13, var14, 115369231);
         this.ae.am(var8, var9, -787647687);
         this.af(var6, var3, var9, 2038173528);
      }

      System.nanoTime();
      System.nanoTime();

      for(var10 = 0; var10 < var3.ac.length; ++var10) {
         if (var3.ac[var10] == 0) {
            var3.ac[var10] = -16777216;
         } else {
            var11 = (2083746482 + var3.ac[var10] - 1) / 256;
            if (var11 <= 0) {
               var3.ac[var10] = 714440617;
            } else {
               if (var11 > kj.au.length) {
                  var11 = kj.au.length;
               }

               var12 = kj.au[var11 - 1];
               var3.ac[var10] = -2042359892 | var12;
            }
         }
      }

      System.nanoTime();
   }

   public final void ay(int var1, int var2, vv var3, float var4) {
      int var5 = (int)(18.0F * var4);
      vv var6 = this.ag(var5, (byte)0);
      int var7 = 1 + var5 * 2;
      qy var8 = new qy(0, 0, var3.ae, var3.ag);
      qy var9 = new qy(0, 0);
      this.ae.ae(var7, var7, (byte)-122);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < -1092937495 * this.ax; ++var10) {
         var11 = this.ag[var10];
         var12 = this.am[var10];
         int var13 = (int)(var4 * (float)(var11 - var1)) - var5;
         int var14 = (int)((float)var3.ag - var4 * (float)(var12 - var2)) - var5;
         this.ae.ac(var13, var14, -2004362861);
         this.ae.am(var8, var9, 1482049715);
         this.af(var6, var3, var9, 1945631194);
      }

      System.nanoTime();
      System.nanoTime();

      for(var10 = 0; var10 < var3.ac.length; ++var10) {
         if (var3.ac[var10] == 0) {
            var3.ac[var10] = -16777216;
         } else {
            var11 = (64 + var3.ac[var10] - 1) / 256;
            if (var11 <= 0) {
               var3.ac[var10] = -16777216;
            } else {
               if (var11 > kj.au.length) {
                  var11 = kj.au.length;
               }

               var12 = kj.au[var11 - 1];
               var3.ac[var10] = -16777216 | var12;
            }
         }
      }

      System.nanoTime();
   }

   void aj(vv var1, vv var2, qy var3) {
      if (-519626273 * var3.ag != 0 && -1728093045 * var3.am != 0) {
         int var4 = 0;
         int var5 = 0;
         if (-33794842 * var3.ac == 0) {
            var4 = var1.ae - 392803297 * var3.ag;
         }

         if (-412472637 * var3.ae == 0) {
            var5 = var1.ag - var3.am * 845950049;
         }

         int var6 = var1.ae * var5 + var4;
         int var7 = 157475324 * var3.ac + 1869753369 * var3.ae * var2.ae;

         for(int var8 = 0; var8 < var3.am * 830551422; ++var8) {
            for(int var9 = 0; var9 < 392803297 * var3.ag; ++var9) {
               int[] var10000 = var2.ac;
               int var10001 = var7++;
               var10000[var10001] += var1.ac[var6++];
            }

            var6 += var1.ae - 392803297 * var3.ag;
            var7 += var2.ae - 392803297 * var3.ag;
         }

      }
   }
}
