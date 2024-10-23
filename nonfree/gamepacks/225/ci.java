public class ci {
   bl ac;
   static int[] an;
   int[] ag;
   boolean ae;
   int[] am;
   static int ca;
   static final int pq = 32;
   static pp vp;
   boolean[] ax;

   boolean aq() {
      return this.ae;
   }

   void ac(float[] var1, int var2, int var3) {
      try {
         int var4 = this.ac.ag.length;
         bl var10000 = this.ac;
         int var5 = bl.ac[this.ac.am - 1];
         boolean[] var6 = this.ax;
         this.ax[1] = true;
         var6[0] = true;

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         for(var7 = 2; var7 < var4; ++var7) {
            if (var3 != -1689790489) {
               throw new IllegalStateException();
            }

            var8 = this.ac.ac(this.ag, var7);
            var9 = this.ac.ae(this.ag, var7);
            var10 = this.ac.ag(this.ag[var8], this.am[var8], this.ag[var9], this.am[var9], this.ag[var7]);
            var11 = this.am[var7];
            int var12 = var5 - var10;
            int var19;
            if (var12 < var10) {
               if (var3 != -1689790489) {
                  throw new IllegalStateException();
               }

               var19 = var12;
            } else {
               var19 = var10;
            }

            int var14 = var19 << 1;
            if (0 != var11) {
               if (var3 != -1689790489) {
                  throw new IllegalStateException();
               }

               boolean[] var15 = this.ax;
               this.ax[var9] = true;
               var15[var8] = true;
               this.ax[var7] = true;
               int var10002;
               int[] var20;
               if (var11 >= var14) {
                  var20 = this.am;
                  if (var12 > var10) {
                     if (var3 != -1689790489) {
                        throw new IllegalStateException();
                     }

                     var10002 = var10 + (var11 - var10);
                  } else {
                     var10002 = var12 + (var10 - var11) - 1;
                  }

                  var20[var7] = var10002;
               } else {
                  var20 = this.am;
                  if (0 != (var11 & 1)) {
                     if (var3 != -1689790489) {
                        throw new IllegalStateException();
                     }

                     var10002 = var10 - (1 + var11) / 2;
                  } else {
                     var10002 = var10 + var11 / 2;
                  }

                  var20[var7] = var10002;
               }
            } else {
               this.ax[var7] = false;
               this.am[var7] = var10;
            }
         }

         this.ag(0, var4 - 1, 1910531481);
         var7 = 0;
         var8 = this.am[0] * this.ac.am;

         for(var9 = 1; var9 < var4; ++var9) {
            if (this.ax[var9]) {
               var10 = this.ag[var9];
               var11 = this.am[var9] * this.ac.am;
               this.ac.am(var7, var8, var10, var11, var1, var2);
               if (var10 >= var2) {
                  if (var3 != -1689790489) {
                     throw new IllegalStateException();
                  }

                  return;
               }

               var7 = var10;
               var8 = var11;
            }
         }

         var10000 = this.ac;
         float var18 = bl.ae[var8];

         for(var10 = var7; var10 < var2; ++var10) {
            var1[var10] *= var18;
         }

      } catch (RuntimeException var17) {
         throw vk.ae(var17, "ci.ac(" + ')');
      }
   }

   boolean ae(int var1) {
      try {
         return this.ae;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ci.ae(" + ')');
      }
   }

   void al(int var1, int var2) {
      if (var1 < var2) {
         int var3 = var1;
         int var4 = this.ag[var1];
         int var5 = this.am[var1];
         boolean var6 = this.ax[var1];

         for(int var7 = 1 + var1; var7 <= var2; ++var7) {
            int var8 = this.ag[var7];
            if (var8 < var4) {
               this.ag[var3] = var8;
               this.am[var3] = this.am[var7];
               this.ax[var3] = this.ax[var7];
               ++var3;
               this.ag[var7] = this.ag[var3];
               this.am[var7] = this.am[var3];
               this.ax[var7] = this.ax[var3];
            }
         }

         this.ag[var3] = var4;
         this.am[var3] = var5;
         this.ax[var3] = var6;
         this.ag(var1, var3 - 1, 1956206064);
         this.ag(var3 + 1, var2, 888091163);
      }
   }

   void am(float[] var1, int var2) {
      int var3 = this.ac.ag.length;
      bl var10000 = this.ac;
      int var4 = bl.ac[this.ac.am - 1];
      boolean[] var5 = this.ax;
      this.ax[1] = true;
      var5[0] = true;

      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      for(var6 = 2; var6 < var3; ++var6) {
         var7 = this.ac.ac(this.ag, var6);
         var8 = this.ac.ae(this.ag, var6);
         var9 = this.ac.ag(this.ag[var7], this.am[var7], this.ag[var8], this.am[var8], this.ag[var6]);
         var10 = this.am[var6];
         int var11 = var4 - var9;
         int var13 = (var11 < var9 ? var11 : var9) << 1;
         if (0 != var10) {
            boolean[] var14 = this.ax;
            this.ax[var8] = true;
            var14[var7] = true;
            this.ax[var6] = true;
            if (var10 >= var13) {
               this.am[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
            } else {
               this.am[var6] = 0 != (var10 & 1) ? var9 - (1 + var10) / 2 : var9 + var10 / 2;
            }
         } else {
            this.ax[var6] = false;
            this.am[var6] = var9;
         }
      }

      this.ag(0, var3 - 1, 1693465877);
      var6 = 0;
      var7 = this.am[0] * this.ac.am;

      for(var8 = 1; var8 < var3; ++var8) {
         if (this.ax[var8]) {
            var9 = this.ag[var8];
            var10 = this.am[var8] * this.ac.am;
            this.ac.am(var6, var7, var9, var10, var1, var2);
            if (var9 >= var2) {
               return;
            }

            var6 = var9;
            var7 = var10;
         }
      }

      var10000 = this.ac;
      float var16 = bl.ae[var7];

      for(var9 = var6; var9 < var2; ++var9) {
         var1[var9] *= var16;
      }

   }

   static boolean ag(int var0, byte var1) {
      try {
         boolean var10000;
         if ((var0 & 128) != 0) {
            if (var1 == 1) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ci.ag(" + ')');
      }
   }

   void ar(int var1, int var2) {
      if (var1 < var2) {
         int var3 = var1;
         int var4 = this.ag[var1];
         int var5 = this.am[var1];
         boolean var6 = this.ax[var1];

         for(int var7 = 1 + var1; var7 <= var2; ++var7) {
            int var8 = this.ag[var7];
            if (var8 < var4) {
               this.ag[var3] = var8;
               this.am[var3] = this.am[var7];
               this.ax[var3] = this.ax[var7];
               ++var3;
               this.ag[var7] = this.ag[var3];
               this.am[var7] = this.am[var3];
               this.ax[var7] = this.ax[var3];
            }
         }

         this.ag[var3] = var4;
         this.am[var3] = var5;
         this.ax[var3] = var6;
         this.ag(var1, var3 - 1, 1636217483);
         this.ag(var3 + 1, var2, 128311226);
      }
   }

   boolean af() {
      return this.ae;
   }

   void at(int var1, int var2) {
      if (var1 < var2) {
         int var3 = var1;
         int var4 = this.ag[var1];
         int var5 = this.am[var1];
         boolean var6 = this.ax[var1];

         for(int var7 = 1 + var1; var7 <= var2; ++var7) {
            int var8 = this.ag[var7];
            if (var8 < var4) {
               this.ag[var3] = var8;
               this.am[var3] = this.am[var7];
               this.ax[var3] = this.ax[var7];
               ++var3;
               this.ag[var7] = this.ag[var3];
               this.am[var7] = this.am[var3];
               this.ax[var7] = this.ax[var3];
            }
         }

         this.ag[var3] = var4;
         this.am[var3] = var5;
         this.ax[var3] = var6;
         this.ag(var1, var3 - 1, 487798787);
         this.ag(var3 + 1, var2, 788337948);
      }
   }

   void au(int var1, int var2) {
      if (var1 < var2) {
         int var3 = var1;
         int var4 = this.ag[var1];
         int var5 = this.am[var1];
         boolean var6 = this.ax[var1];

         for(int var7 = 1 + var1; var7 <= var2; ++var7) {
            int var8 = this.ag[var7];
            if (var8 < var4) {
               this.ag[var3] = var8;
               this.am[var3] = this.am[var7];
               this.ax[var3] = this.ax[var7];
               ++var3;
               this.ag[var7] = this.ag[var3];
               this.am[var7] = this.am[var3];
               this.ax[var7] = this.ax[var3];
            }
         }

         this.ag[var3] = var4;
         this.am[var3] = var5;
         this.ax[var3] = var6;
         this.ag(var1, var3 - 1, -105379954);
         this.ag(var3 + 1, var2, 394770063);
      }
   }

   void ag(int var1, int var2, int var3) {
      try {
         if (var1 < var2) {
            int var4 = var1;
            int var5 = this.ag[var1];
            int var6 = this.am[var1];
            boolean var7 = this.ax[var1];

            for(int var8 = 1 + var1; var8 <= var2; ++var8) {
               int var9 = this.ag[var8];
               if (var9 < var5) {
                  if (var3 <= -320077588) {
                     return;
                  }

                  this.ag[var4] = var9;
                  this.am[var4] = this.am[var8];
                  this.ax[var4] = this.ax[var8];
                  ++var4;
                  this.ag[var8] = this.ag[var4];
                  this.am[var8] = this.am[var4];
                  this.ax[var8] = this.ax[var4];
               }
            }

            this.ag[var4] = var5;
            this.am[var4] = var6;
            this.ax[var4] = var7;
            this.ag(var1, var4 - 1, 576005095);
            this.ag(var4 + 1, var2, 1749168614);
         }
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "ci.ag(" + ')');
      }
   }

   void ax(float[] var1, int var2) {
      int var3 = this.ac.ag.length;
      bl var10000 = this.ac;
      int var4 = bl.ac[this.ac.am - 1];
      boolean[] var5 = this.ax;
      this.ax[1] = true;
      var5[0] = true;

      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      for(var6 = 2; var6 < var3; ++var6) {
         var7 = this.ac.ac(this.ag, var6);
         var8 = this.ac.ae(this.ag, var6);
         var9 = this.ac.ag(this.ag[var7], this.am[var7], this.ag[var8], this.am[var8], this.ag[var6]);
         var10 = this.am[var6];
         int var11 = var4 - var9;
         int var13 = (var11 < var9 ? var11 : var9) << 1;
         if (0 != var10) {
            boolean[] var14 = this.ax;
            this.ax[var8] = true;
            var14[var7] = true;
            this.ax[var6] = true;
            if (var10 >= var13) {
               this.am[var6] = var11 > var9 ? var9 + (var10 - var9) : var11 + (var9 - var10) - 1;
            } else {
               this.am[var6] = 0 != (var10 & 1) ? var9 - (1 + var10) / 2 : var9 + var10 / 2;
            }
         } else {
            this.ax[var6] = false;
            this.am[var6] = var9;
         }
      }

      this.ag(0, var3 - 1, 1481113323);
      var6 = 0;
      var7 = this.am[0] * this.ac.am;

      for(var8 = 1; var8 < var3; ++var8) {
         if (this.ax[var8]) {
            var9 = this.ag[var8];
            var10 = this.am[var8] * this.ac.am;
            this.ac.am(var6, var7, var9, var10, var1, var2);
            if (var9 >= var2) {
               return;
            }

            var6 = var9;
            var7 = var10;
         }
      }

      var10000 = this.ac;
      float var16 = bl.ae[var7];

      for(var9 = var6; var9 < var2; ++var9) {
         var1[var9] *= var16;
      }

   }

   static void aq(int var0, int var1) {
      try {
         de var2 = (de)de.ac.ac((long)var0);
         if (null != var2) {
            var2.jb();
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ci.aq(" + ')');
      }
   }

   ci(bl var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
      try {
         super();
         this.ac = var1;
         this.ae = var2;
         this.ag = var3;
         this.am = var4;
         this.ax = var5;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ci.<init>(" + ')');
      }
   }
}
