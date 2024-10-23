public class cl {
   boolean[] ai;
   boolean aw;
   int[] aj;
   bs ap;
   int[] ak;
   static or ea;
   static ue qi;
   public static final int at = 256;
   public static final int ao = 8;

   boolean aw(int var1) {
      try {
         return this.aw;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "cl.aw(" + ')');
      }
   }

   void ap(float[] var1, int var2, int var3) {
      try {
         int var4 = this.ap.ak.length;
         bs var10000 = this.ap;
         int var5 = bs.ap[this.ap.aj - 1];
         boolean[] var6 = this.ai;
         this.ai[1] = true;
         var6[0] = true;

         int var7;
         int var8;
         int var9;
         int var10;
         int var11;
         for(var7 = 2; var7 < var4; ++var7) {
            var8 = this.ap.ap(this.ak, var7);
            var9 = this.ap.aw(this.ak, var7);
            var10 = this.ap.ak(this.ak[var8], this.aj[var8], this.ak[var9], this.aj[var9], this.ak[var7]);
            var11 = this.aj[var7];
            int var12 = var5 - var10;
            int var19;
            if (var12 < var10) {
               if (var3 == -33891026) {
                  return;
               }

               var19 = var12;
            } else {
               var19 = var10;
            }

            int var14 = var19 << 1;
            if (var11 != 0) {
               if (var3 == -33891026) {
                  throw new IllegalStateException();
               }

               boolean[] var15 = this.ai;
               this.ai[var9] = true;
               var15[var8] = true;
               this.ai[var7] = true;
               int var10002;
               int[] var20;
               if (var11 >= var14) {
                  if (var3 == -33891026) {
                     throw new IllegalStateException();
                  }

                  var20 = this.aj;
                  if (var12 > var10) {
                     if (var3 == -33891026) {
                        throw new IllegalStateException();
                     }

                     var10002 = var11 - var10 + var10;
                  } else {
                     var10002 = var10 - var11 + var12 - 1;
                  }

                  var20[var7] = var10002;
               } else {
                  var20 = this.aj;
                  if (0 != (var11 & 1)) {
                     if (var3 == -33891026) {
                        throw new IllegalStateException();
                     }

                     var10002 = var10 - (1 + var11) / 2;
                  } else {
                     var10002 = var11 / 2 + var10;
                  }

                  var20[var7] = var10002;
               }
            } else {
               this.ai[var7] = false;
               this.aj[var7] = var10;
            }
         }

         this.ak(0, var4 - 1, -785867388);
         var7 = 0;
         var8 = this.aj[0] * this.ap.aj;

         for(var9 = 1; var9 < var4; ++var9) {
            if (this.ai[var9]) {
               if (var3 == -33891026) {
                  return;
               }

               var10 = this.ak[var9];
               var11 = this.aj[var9] * this.ap.aj;
               this.ap.aj(var7, var8, var10, var11, var1, var2);
               if (var10 >= var2) {
                  return;
               }

               var7 = var10;
               var8 = var11;
            }
         }

         var10000 = this.ap;
         float var18 = bs.aw[var8];

         for(var10 = var7; var10 < var2; ++var10) {
            if (var3 == -33891026) {
               throw new IllegalStateException();
            }

            var1[var10] *= var18;
         }

      } catch (RuntimeException var17) {
         throw tm.aw(var17, "cl.ap(" + ')');
      }
   }

   void ak(int var1, int var2, int var3) {
      try {
         if (var1 >= var2) {
            if (var3 != -785867388) {
               throw new IllegalStateException();
            }
         } else {
            int var4 = var1;
            int var5 = this.ak[var1];
            int var6 = this.aj[var1];
            boolean var7 = this.ai[var1];

            for(int var8 = var1 + 1; var8 <= var2; ++var8) {
               if (var3 != -785867388) {
                  return;
               }

               int var9 = this.ak[var8];
               if (var9 < var5) {
                  if (var3 != -785867388) {
                     throw new IllegalStateException();
                  }

                  this.ak[var4] = var9;
                  this.aj[var4] = this.aj[var8];
                  this.ai[var4] = this.ai[var8];
                  ++var4;
                  this.ak[var8] = this.ak[var4];
                  this.aj[var8] = this.aj[var4];
                  this.ai[var8] = this.ai[var4];
               }
            }

            this.ak[var4] = var5;
            this.aj[var4] = var6;
            this.ai[var4] = var7;
            this.ak(var1, var4 - 1, -785867388);
            this.ak(var4 + 1, var2, -785867388);
         }
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "cl.ak(" + ')');
      }
   }

   void aj(float[] var1, int var2) {
      int var3 = this.ap.ak.length;
      bs var10000 = this.ap;
      int var4 = bs.ap[this.ap.aj - 1];
      boolean[] var5 = this.ai;
      this.ai[1] = true;
      var5[0] = true;

      int var6;
      int var7;
      int var8;
      int var9;
      int var10;
      for(var6 = 2; var6 < var3; ++var6) {
         var7 = this.ap.ap(this.ak, var6);
         var8 = this.ap.aw(this.ak, var6);
         var9 = this.ap.ak(this.ak[var7], this.aj[var7], this.ak[var8], this.aj[var8], this.ak[var6]);
         var10 = this.aj[var6];
         int var11 = var4 - var9;
         int var13 = (var11 < var9 ? var11 : var9) << 1;
         if (var10 != 0) {
            boolean[] var14 = this.ai;
            this.ai[var8] = true;
            var14[var7] = true;
            this.ai[var6] = true;
            if (var10 >= var13) {
               this.aj[var6] = var11 > var9 ? var10 - var9 + var9 : var9 - var10 + var11 - 1;
            } else {
               this.aj[var6] = 0 != (var10 & 1) ? var9 - (1 + var10) / 2 : var10 / 2 + var9;
            }
         } else {
            this.ai[var6] = false;
            this.aj[var6] = var9;
         }
      }

      this.ak(0, var3 - 1, -785867388);
      var6 = 0;
      var7 = this.aj[0] * this.ap.aj;

      for(var8 = 1; var8 < var3; ++var8) {
         if (this.ai[var8]) {
            var9 = this.ak[var8];
            var10 = this.aj[var8] * this.ap.aj;
            this.ap.aj(var6, var7, var9, var10, var1, var2);
            if (var9 >= var2) {
               return;
            }

            var6 = var9;
            var7 = var10;
         }
      }

      var10000 = this.ap;
      float var16 = bs.aw[var7];

      for(var9 = var6; var9 < var2; ++var9) {
         var1[var9] *= var16;
      }

   }

   cl(bs var1, boolean var2, int[] var3, int[] var4, boolean[] var5) {
      try {
         super();
         this.ap = var1;
         this.aw = var2;
         this.ak = var3;
         this.aj = var4;
         this.ai = var5;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "cl.<init>(" + ')');
      }
   }

   void ai(int var1, int var2) {
      if (var1 < var2) {
         int var3 = var1;
         int var4 = this.ak[var1];
         int var5 = this.aj[var1];
         boolean var6 = this.ai[var1];

         for(int var7 = var1 + 1; var7 <= var2; ++var7) {
            int var8 = this.ak[var7];
            if (var8 < var4) {
               this.ak[var3] = var8;
               this.aj[var3] = this.aj[var7];
               this.ai[var3] = this.ai[var7];
               ++var3;
               this.ak[var7] = this.ak[var3];
               this.aj[var7] = this.aj[var3];
               this.ai[var7] = this.ai[var3];
            }
         }

         this.ak[var3] = var4;
         this.aj[var3] = var5;
         this.ai[var3] = var6;
         this.ak(var1, var3 - 1, -785867388);
         this.ak(var3 + 1, var2, -785867388);
      }
   }

   void ay(int var1, int var2) {
      if (var1 < var2) {
         int var3 = var1;
         int var4 = this.ak[var1];
         int var5 = this.aj[var1];
         boolean var6 = this.ai[var1];

         for(int var7 = var1 + 1; var7 <= var2; ++var7) {
            int var8 = this.ak[var7];
            if (var8 < var4) {
               this.ak[var3] = var8;
               this.aj[var3] = this.aj[var7];
               this.ai[var3] = this.ai[var7];
               ++var3;
               this.ak[var7] = this.ak[var3];
               this.aj[var7] = this.aj[var3];
               this.ai[var7] = this.ai[var3];
            }
         }

         this.ak[var3] = var4;
         this.aj[var3] = var5;
         this.ai[var3] = var6;
         this.ak(var1, var3 - 1, -785867388);
         this.ak(var3 + 1, var2, -785867388);
      }
   }
}
