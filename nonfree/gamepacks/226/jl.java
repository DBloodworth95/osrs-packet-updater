public abstract class jl extends vz {
   static final float ai = 1.5F;
   boolean aw = false;
   static final int as = 14;
   static final int aj = 3500;
   static final int ay = 210;
   boolean ap = false;
   static final int ae = 3;
   static final int ak = 50;
   int[] am;
   ky at;
   static int au = 0;

   void ax(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
      var10 = aw(var10, var13, var14, var15, var16);
      var11 = aw(var11, var13, var14, var15, var16);
      var12 = aw(var12, var13, var14, var15, var16);
      this.ay(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   void ap(int[] var1, int var2, int var3, float[] var4) {
      dn(var1, var2, var3, var4);
   }

   static int ad(int var0, byte var1, byte var2, byte var3, byte var4) {
      int var5 = var0 >> 10 & -1905430291;
      int var6 = var0 >> 7 & 7;
      int var7 = var0 & 127;
      int var8 = var4 & -957540224;
      if (var1 != -1) {
         var5 += (var1 - var5) * var8 >> 7;
      }

      if (var2 != -1) {
         var6 += (var2 - var6) * var8 >> 7;
      }

      if (var3 != -1) {
         var7 += (var3 - var7) * var8 >> 7;
      }

      return (var5 << 10 | var6 << 7 | var7) & -2127064216;
   }

   static final int ak(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   void aj(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
      var10 = aw(var10, var13, var14, var15, var16);
      var11 = aw(var11, var13, var14, var15, var16);
      var12 = aw(var12, var13, var14, var15, var16);
      this.ay(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   void ai(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
      int var15 = aw(var10, var11, var12, var13, var14);
      var10 = this.am[var15];
      this.as(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   abstract void bc(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   abstract void as(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

   abstract void am(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   void aa(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
      int var15 = aw(var10, var11, var12, var13, var14);
      var10 = this.am[var15];
      this.as(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   abstract void bv(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

   static void au(int var0) {
      au = var0;
   }

   static void an(int var0) {
      int var1 = var0 * 210;
      au(var1);
   }

   abstract void bh(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

   void ao(int[] var1, int var2, int var3, float[] var4) {
      dn(var1, var2, var3, var4);
   }

   abstract void bz(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   void ar(int[] var1, int var2, int var3, float[] var4) {
      dn(var1, var2, var3, var4);
   }

   void ab(int[] var1, int var2, int var3, float[] var4) {
      dn(var1, var2, var3, var4);
   }

   void af(int[] var1, int var2, int var3, float[] var4) {
      dn(var1, var2, var3, var4);
   }

   static int ag(int var0, byte var1, byte var2, byte var3, byte var4) {
      int var5 = var0 >> 10 & 63;
      int var6 = var0 >> 7 & 7;
      int var7 = var0 & -1448580113;
      int var8 = var4 & 255;
      if (var1 != -1) {
         var5 += (var1 - var5) * var8 >> 7;
      }

      if (var2 != -1) {
         var6 += (var2 - var6) * var8 >> 7;
      }

      if (var3 != -1) {
         var7 += (var3 - var7) * var8 >> 7;
      }

      return (var5 << 10 | var6 << 7 | var7) & 766550471;
   }

   static final int ac(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   abstract void bk(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

   void av(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, byte var13, byte var14, byte var15, byte var16) {
      var10 = aw(var10, var13, var14, var15, var16);
      var11 = aw(var11, var13, var14, var15, var16);
      var12 = aw(var12, var13, var14, var15, var16);
      this.ay(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   static int aw(int var0, byte var1, byte var2, byte var3, byte var4) {
      int var5 = var0 >> 10 & 63;
      int var6 = var0 >> 7 & 7;
      int var7 = var0 & 127;
      int var8 = var4 & 255;
      if (var1 != -1) {
         var5 += (var1 - var5) * var8 >> 7;
      }

      if (var2 != -1) {
         var6 += (var2 - var6) * var8 >> 7;
      }

      if (var3 != -1) {
         var7 += (var3 - var7) * var8 >> 7;
      }

      return (var5 << 10 | var6 << 7 | var7) & '\uffff';
   }

   void aq(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
      int var15 = aw(var10, var11, var12, var13, var14);
      var10 = this.am[var15];
      this.as(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   void al(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, byte var11, byte var12, byte var13, byte var14) {
      int var15 = aw(var10, var11, var12, var13, var14);
      var10 = this.am[var15];
      this.as(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   abstract void ae(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   abstract void ah(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

   abstract void bp(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   abstract void bj(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

   static final int at() {
      return au;
   }

   abstract void bx(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

   static int az(int var0, byte var1, byte var2, byte var3, byte var4) {
      int var5 = var0 >> 10 & 63;
      int var6 = var0 >> 7 & 7;
      int var7 = var0 & 127;
      int var8 = var4 & 255;
      if (var1 != -1) {
         var5 += (var1 - var5) * var8 >> 7;
      }

      if (var2 != -1) {
         var6 += (var2 - var6) * var8 >> 7;
      }

      if (var3 != -1) {
         var7 += (var3 - var7) * var8 >> 7;
      }

      return (var5 << 10 | var6 << 7 | var7) & '\uffff';
   }

   abstract void bb(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

   abstract void bq(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10);

   abstract void ay(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12);

   abstract void br(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   abstract void by(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   jl(ky var1) {
      this.am = jm.ap;
      this.at = var1;
   }

   abstract void bn(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22);

   static final int bu() {
      return au;
   }

   static final int bt() {
      return au;
   }

   static void bs(int var0) {
      au = var0;
   }

   static void bm(int var0) {
      au = var0;
   }

   static void bo(int var0) {
      au = var0;
   }

   static void bd(int var0) {
      int var1 = var0 * 210;
      au(var1);
   }

   static void ba(int var0) {
      int var1 = var0 * 210;
      au(var1);
   }

   static void bw(int var0) {
      int var1 = var0 * 210;
      au(var1);
   }

   static void bi(int var0) {
      int var1 = var0 * 210;
      au(var1);
   }
}
