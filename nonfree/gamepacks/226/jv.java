public abstract class jv extends tp {
   public int ez;

   void jh(int var1, qs var2, int var3, int var4, int var5, long var6) {
      jy var8 = this.au(1885718735);
      if (null != var8) {
         this.ez = 1 * var8.ez;
         var8.jp(var1, var2, var3, var4, var5, var6);
      }

   }

   protected jy ao() {
      return null;
   }

   void jp(int var1, qs var2, int var3, int var4, int var5, long var6) {
      try {
         jy var8 = this.au(1885718735);
         if (null != var8) {
            this.ez = 1 * var8.ez;
            var8.jp(var1, var2, var3, var4, var5, var6);
         }

      } catch (RuntimeException var9) {
         throw tm.aw(var9, "jv.jp(" + ')');
      }
   }

   protected jy au(int var1) {
      try {
         return null;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "jv.au(" + ')');
      }
   }

   protected jy an() {
      return null;
   }

   void el(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      try {
         jy var15 = this.au(1885718735);
         if (null != var15) {
            this.ez = var15.ez * 1;
            int var16 = jm.aj[var2];
            int var17 = jm.ai[var2];
            int var18 = jm.aj[var3];
            int var19 = jm.ai[var3];
            var15.bb(var1, var16, var17, var18, var19, var4 - var7, var5 - var8, var6 - var9, var10);
         }

      } catch (RuntimeException var20) {
         throw tm.aw(var20, "jv.el(" + ')');
      }
   }

   static boolean bq(ir var0, byte var1) {
      try {
         if (var0.bm != null) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            int[] var2 = var0.bm;

            for(int var3 = 0; var3 < var2.length; ++var3) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               int var4 = var2[var3];
               ir var5 = ei.aw(var4, 888461382);
               if (339746203 * var5.bx != -1) {
                  if (var1 <= 0) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         } else if (-1 != var0.bx * 339746203) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            return true;
         }

         return false;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "jv.bq(" + ')');
      }
   }

   void jy(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      jy var15 = this.au(1885718735);
      if (null != var15) {
         this.ez = var15.ez * 1;
         int var16 = jm.aj[var2];
         int var17 = jm.ai[var2];
         int var18 = jm.aj[var3];
         int var19 = jm.ai[var3];
         var15.bb(var1, var16, var17, var18, var19, var4 - var7, var5 - var8, var6 - var9, var10);
      }

   }

   void je(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      jy var15 = this.au(1885718735);
      if (null != var15) {
         this.ez = var15.ez * 1;
         int var16 = jm.aj[var2];
         int var17 = jm.ai[var2];
         int var18 = jm.aj[var3];
         int var19 = jm.ai[var3];
         var15.bb(var1, var16, var17, var18, var19, var4 - var7, var5 - var8, var6 - var9, var10);
      }

   }

   void jr(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, int var12, int var13, boolean var14) {
      jy var15 = this.au(1885718735);
      if (null != var15) {
         this.ez = var15.ez * 1;
         int var16 = jm.aj[var2];
         int var17 = jm.ai[var2];
         int var18 = jm.aj[var3];
         int var19 = jm.ai[var3];
         var15.bb(var1, var16, var17, var18, var19, var4 - var7, var5 - var8, var6 - var9, var10);
      }

   }

   void ky(int var1, qs var2, int var3, int var4, int var5, long var6) {
      jy var8 = this.au(1885718735);
      if (null != var8) {
         this.ez = 1 * var8.ez;
         var8.jp(var1, var2, var3, var4, var5, var6);
      }

   }

   void kh(int var1, qs var2, int var3, int var4, int var5, long var6) {
      jy var8 = this.au(1885718735);
      if (null != var8) {
         this.ez = 1 * var8.ez;
         var8.jp(var1, var2, var3, var4, var5, var6);
      }

   }

   static final int ap(int var0, int var1, int var2, int var3, int var4) {
      try {
         return var2 * var0 + var1 * var3 >> 16;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "jv.ap(" + ')');
      }
   }

   protected jv() {
      try {
         super();
         this.ez = 1803062184;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "jv.<init>(" + ')');
      }
   }
}
