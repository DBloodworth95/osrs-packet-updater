public class jc extends jz {
   static final int bd = 1006;
   float[] aw;
   static int[] jl;
   static final int al = 26;
   qs ap;

   void ae(ji var1, js var2, int var3, int var4) {
      int var5 = var2.ap.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = var2.ap[var6];
         int var8 = var2.aw[var6];
         int var9 = var2.ak[var6];
         this.ap.ac((float)var7, (float)var8, (float)var9, this.aw, (byte)80);
         var7 = (int)this.aw[0];
         var8 = (int)this.aw[1];
         var9 = (int)this.aw[2];
         if (null != var2.at) {
            js.ad[var6] = var7;
            js.ac[var6] = var8;
            js.av[var6] = var9;
         }

         var9 |= 1;
         js.ab[var6] = jm.as() + var7 * jm.ao() / var9;
         js.az[var6] = jm.ae() + var8 * jm.ao() / var9;
         js.ag[var6] = hl.ak(var9, 1261288518);
      }

      this.ao(var1, var2, var3, var4, 2141763262);
   }

   void aj(jv var1, int var2, int var3, int var4, int var5, long var6) {
      var1.jp(var2, this.ap, var3, var4, var5, var6);
   }

   void aw(ji var1, jp var2, int var3, int var4, int var5, int var6) {
      try {
         int var7;
         int var8 = var7 = var4 << 7;
         int var9;
         int var10 = var9 = var5 << 7;
         int var11;
         int var12 = var11 = var8 + 128;
         int var13;
         int var14 = var13 = 128 + var10;
         int var15 = var1.as[var3][var4][var5];
         int var16 = var1.as[var3][1 + var4][var5];
         int var17 = var1.as[var3][var4 + 1][var5 + 1];
         int var18 = var1.as[var3][var4][var5 + 1];
         this.ap.ac((float)var8, (float)var15, (float)var10, this.aw, (byte)118);
         var8 = (int)this.aw[0];
         var15 = (int)this.aw[1];
         var10 = (int)this.aw[2] | 1;
         this.ap.ac((float)var12, (float)var16, (float)var9, this.aw, (byte)111);
         var12 = (int)this.aw[0];
         var16 = (int)this.aw[1];
         var9 = (int)this.aw[2] | 1;
         this.ap.ac((float)var11, (float)var17, (float)var14, this.aw, (byte)61);
         var11 = (int)this.aw[0];
         var17 = (int)this.aw[1];
         var14 = (int)this.aw[2] | 1;
         this.ap.ac((float)var7, (float)var18, (float)var13, this.aw, (byte)18);
         var7 = (int)this.aw[0];
         var18 = (int)this.aw[1];
         var13 = (int)this.aw[2] | 1;
         this.an(var1, var2, var4, var5, var8, var12, var11, var7, var15, var16, var17, var18, var10, var9, var14, var13, 2007550789);
      } catch (RuntimeException var19) {
         throw tm.aw(var19, "jc.aw(" + ')');
      }
   }

   void at(ji var1, js var2, int var3, int var4) {
      int var5 = var2.ap.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = var2.ap[var6];
         int var8 = var2.aw[var6];
         int var9 = var2.ak[var6];
         this.ap.ac((float)var7, (float)var8, (float)var9, this.aw, (byte)5);
         var7 = (int)this.aw[0];
         var8 = (int)this.aw[1];
         var9 = (int)this.aw[2];
         if (null != var2.at) {
            js.ad[var6] = var7;
            js.ac[var6] = var8;
            js.av[var6] = var9;
         }

         var9 |= 1;
         js.ab[var6] = jm.as() + var7 * jm.ao() / var9;
         js.az[var6] = jm.ae() + var8 * jm.ao() / var9;
         js.ag[var6] = hl.ak(var9, 1261288518);
      }

      this.ao(var1, var2, var3, var4, 728230711);
   }

   jc(qs var1) {
      try {
         super();
         this.aw = new float[3];
         this.ap = var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "jc.<init>(" + ')');
      }
   }

   void ai(jv var1, int var2, int var3, int var4, int var5, long var6) {
      var1.jp(var2, this.ap, var3, var4, var5, var6);
   }

   void ay(ji var1, jp var2, int var3, int var4, int var5) {
      int var6;
      int var7 = var6 = var4 << 7;
      int var8;
      int var9 = var8 = var5 << 7;
      int var10;
      int var11 = var10 = var7 + 128;
      int var12;
      int var13 = var12 = 128 + var9;
      int var14 = var1.as[var3][var4][var5];
      int var15 = var1.as[var3][1 + var4][var5];
      int var16 = var1.as[var3][var4 + 1][var5 + 1];
      int var17 = var1.as[var3][var4][var5 + 1];
      this.ap.ac((float)var7, (float)var14, (float)var9, this.aw, (byte)124);
      var7 = (int)this.aw[0];
      var14 = (int)this.aw[1];
      var9 = (int)this.aw[2] | 1;
      this.ap.ac((float)var11, (float)var15, (float)var8, this.aw, (byte)72);
      var11 = (int)this.aw[0];
      var15 = (int)this.aw[1];
      var8 = (int)this.aw[2] | 1;
      this.ap.ac((float)var10, (float)var16, (float)var13, this.aw, (byte)35);
      var10 = (int)this.aw[0];
      var16 = (int)this.aw[1];
      var13 = (int)this.aw[2] | 1;
      this.ap.ac((float)var6, (float)var17, (float)var12, this.aw, (byte)102);
      var6 = (int)this.aw[0];
      var17 = (int)this.aw[1];
      var12 = (int)this.aw[2] | 1;
      this.an(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var17, var9, var8, var13, var12, 1177188147);
   }

   void as(ji var1, jp var2, int var3, int var4, int var5) {
      int var6;
      int var7 = var6 = var4 << 7;
      int var8;
      int var9 = var8 = var5 << 7;
      int var10;
      int var11 = var10 = var7 + -291117529;
      int var12;
      int var13 = var12 = 128 + var9;
      int var14 = var1.as[var3][var4][var5];
      int var15 = var1.as[var3][1 + var4][var5];
      int var16 = var1.as[var3][var4 + 1][var5 + 1];
      int var17 = var1.as[var3][var4][var5 + 1];
      this.ap.ac((float)var7, (float)var14, (float)var9, this.aw, (byte)67);
      var7 = (int)this.aw[0];
      var14 = (int)this.aw[1];
      var9 = (int)this.aw[2] | 1;
      this.ap.ac((float)var11, (float)var15, (float)var8, this.aw, (byte)65);
      var11 = (int)this.aw[0];
      var15 = (int)this.aw[1];
      var8 = (int)this.aw[2] | 1;
      this.ap.ac((float)var10, (float)var16, (float)var13, this.aw, (byte)52);
      var10 = (int)this.aw[0];
      var16 = (int)this.aw[1];
      var13 = (int)this.aw[2] | 1;
      this.ap.ac((float)var6, (float)var17, (float)var12, this.aw, (byte)21);
      var6 = (int)this.aw[0];
      var17 = (int)this.aw[1];
      var12 = (int)this.aw[2] | 1;
      this.an(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var17, var9, var8, var13, var12, 69654501);
   }

   void ak(ji var1, js var2, int var3, int var4, byte var5) {
      try {
         int var6 = var2.ap.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            if (var5 <= 75) {
               throw new IllegalStateException();
            }

            int var8 = var2.ap[var7];
            int var9 = var2.aw[var7];
            int var10 = var2.ak[var7];
            this.ap.ac((float)var8, (float)var9, (float)var10, this.aw, (byte)46);
            var8 = (int)this.aw[0];
            var9 = (int)this.aw[1];
            var10 = (int)this.aw[2];
            if (null != var2.at) {
               js.ad[var7] = var8;
               js.ac[var7] = var9;
               js.av[var7] = var10;
            }

            var10 |= 1;
            js.ab[var7] = jm.as() + var8 * jm.ao() / var10;
            js.az[var7] = jm.ae() + var9 * jm.ao() / var10;
            js.ag[var7] = hl.ak(var10, 1261288518);
         }

         this.ao(var1, var2, var3, var4, 740333413);
      } catch (RuntimeException var11) {
         throw tm.aw(var11, "jc.ak(" + ')');
      }
   }

   void am(ji var1, js var2, int var3, int var4) {
      int var5 = var2.ap.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = var2.ap[var6];
         int var8 = var2.aw[var6];
         int var9 = var2.ak[var6];
         this.ap.ac((float)var7, (float)var8, (float)var9, this.aw, (byte)57);
         var7 = (int)this.aw[0];
         var8 = (int)this.aw[1];
         var9 = (int)this.aw[2];
         if (null != var2.at) {
            js.ad[var6] = var7;
            js.ac[var6] = var8;
            js.av[var6] = var9;
         }

         var9 |= 1;
         js.ab[var6] = jm.as() + var7 * jm.ao() / var9;
         js.az[var6] = jm.ae() + var8 * jm.ao() / var9;
         js.ag[var6] = hl.ak(var9, 1261288518);
      }

      this.ao(var1, var2, var3, var4, -2056256398);
   }

   void ap(jv var1, int var2, int var3, int var4, int var5, long var6) {
      try {
         var1.jp(var2, this.ap, var3, var4, var5, var6);
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "jc.ap(" + ')');
      }
   }

   void au(ji var1, js var2, int var3, int var4) {
      int var5 = var2.ap.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = var2.ap[var6];
         int var8 = var2.aw[var6];
         int var9 = var2.ak[var6];
         this.ap.ac((float)var7, (float)var8, (float)var9, this.aw, (byte)114);
         var7 = (int)this.aw[0];
         var8 = (int)this.aw[1];
         var9 = (int)this.aw[2];
         if (null != var2.at) {
            js.ad[var6] = var7;
            js.ac[var6] = var8;
            js.av[var6] = var9;
         }

         var9 |= 1;
         js.ab[var6] = jm.as() + var7 * jm.ao() / var9;
         js.az[var6] = jm.ae() + var8 * jm.ao() / var9;
         js.ag[var6] = hl.ak(var9, 1261288518);
      }

      this.ao(var1, var2, var3, var4, 789717396);
   }
}
