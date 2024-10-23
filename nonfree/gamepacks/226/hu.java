public class hu extends tp {
   public static final int be = 67;
   public static mi aj = new mi(64);
   int ai = -2123884239;
   public static int ak;
   public boolean an = false;
   short[] ae;
   short[] am;
   static final int by = 43;
   int[] au = new int[]{-1, -1, -1, -1, -1};
   int[] ay;
   static final int aw = 1;
   short[] at;
   short[] as;

   public static void an(pe var0, pe var1) {
      pq.ap = var0;
      pw.aw = var1;
      ak = pq.ap.cq(3, 397970427) * -1981438965;
   }

   public void ak(vl var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cy((short)-3129);
            if (var3 == 0) {
               if (var2 != 286456945) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.aj(var1, var3, -1327597668);
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "hu.ak(" + ')');
      }
   }

   void aj(vl var1, int var2, int var3) {
      try {
         if (var2 == 1) {
            if (var3 >= 56923103) {
               return;
            }

            this.ai = var1.cy((short)-23488) * 2123884239;
         } else {
            int var4;
            int var5;
            if (2 == var2) {
               var4 = var1.cy((short)-16323);
               this.ay = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 >= 56923103) {
                     throw new IllegalStateException();
                  }

                  this.ay[var5] = var1.ce(1774593463);
               }
            } else if (3 == var2) {
               this.an = true;
            } else if (var2 == 40) {
               var4 = var1.cy((short)-22245);
               this.as = new short[var4];
               this.ae = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 >= 56923103) {
                     throw new IllegalStateException();
                  }

                  this.as[var5] = (short)var1.ce(180329972);
                  this.ae[var5] = (short)var1.ce(945363151);
               }
            } else if (41 == var2) {
               if (var3 >= 56923103) {
                  throw new IllegalStateException();
               }

               var4 = var1.cy((short)-27993);
               this.am = new short[var4];
               this.at = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 >= 56923103) {
                     return;
                  }

                  this.am[var5] = (short)var1.ce(1585808367);
                  this.at[var5] = (short)var1.ce(350474792);
               }
            } else if (var2 >= 60) {
               if (var3 >= 56923103) {
                  return;
               }

               if (var2 < 70) {
                  if (var3 >= 56923103) {
                     throw new IllegalStateException();
                  }

                  this.au[var2 - 60] = var1.ce(1487731513);
               }
            }
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "hu.aj(" + ')');
      }
   }

   public boolean ai(int var1, int var2, int var3) {
      try {
         if (1 == var2) {
            if (var3 <= 326450201) {
               throw new IllegalStateException();
            } else {
               return 7 + var1 == -12492753 * this.ai;
            }
         } else {
            boolean var10000;
            if (var1 == -12492753 * this.ai) {
               if (var3 <= 326450201) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "hu.ai(" + ')');
      }
   }

   public void ab(vl var1) {
      while(true) {
         int var2 = var1.cy((short)-4967);
         if (var2 == 0) {
            return;
         }

         this.aj(var1, var2, -470508659);
      }
   }

   public boolean ae(int var1) {
      try {
         boolean var2 = true;

         for(int var3 = 0; var3 < 5; ++var3) {
            if (this.au[var3] != -1) {
               if (var1 >= 2083336342) {
                  throw new IllegalStateException();
               }

               if (!pw.aw.bd(this.au[var3], 0, -2094056493)) {
                  var2 = false;
               }
            }
         }

         return var2;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "hu.ae(" + ')');
      }
   }

   public jj am(byte var1) {
      try {
         jj[] var2 = new jj[5];
         int var3 = 0;

         for(int var4 = 0; var4 < 5; ++var4) {
            if (var1 >= 5) {
               throw new IllegalStateException();
            }

            if (this.au[var4] != -1) {
               if (var1 >= 5) {
                  throw new IllegalStateException();
               }

               var2[var3++] = jj.ap(pw.aw, this.au[var4], 0);
            }
         }

         jj var7 = new jj(var2, var3);
         int var5;
         if (null != this.as) {
            if (var1 >= 5) {
               throw new IllegalStateException();
            }

            for(var5 = 0; var5 < this.as.length; ++var5) {
               if (var1 >= 5) {
                  throw new IllegalStateException();
               }

               var7.ac(this.as[var5], this.ae[var5]);
            }
         }

         if (this.am != null) {
            for(var5 = 0; var5 < this.am.length; ++var5) {
               var7.av(this.am[var5], this.at[var5]);
            }
         }

         return var7;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "hu.am(" + ')');
      }
   }

   public boolean al() {
      if (this.ay == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.ay.length; ++var2) {
            if (!pw.aw.bd(this.ay[var2], 0, -2094056493)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   public static void at(pe var0, pe var1) {
      pq.ap = var0;
      pw.aw = var1;
      ak = pq.ap.cq(3, 1282107862) * -1981438965;
   }

   public static void au(pe var0, pe var1) {
      pq.ap = var0;
      pw.aw = var1;
      ak = pq.ap.cq(3, 547371985) * -1981438965;
   }

   public static hu ao(int var0) {
      hu var1 = (hu)aj.ap((long)var0);
      if (null != var1) {
         return var1;
      } else if (pq.ap == null) {
         return null;
      } else {
         byte[] var2 = pq.ap.bm(3, var0, 993803109);
         var1 = new hu();
         if (null != var2) {
            var1.ak(new vl(var2), 286456945);
         }

         aj.ak(var1, (long)var0);
         return var1;
      }
   }

   public static hu af(int var0) {
      hu var1 = (hu)aj.ap((long)var0);
      if (null != var1) {
         return var1;
      } else if (pq.ap == null) {
         return null;
      } else {
         byte[] var2 = pq.ap.bm(3, var0, 1116185069);
         var1 = new hu();
         if (null != var2) {
            var1.ak(new vl(var2), 286456945);
         }

         aj.ak(var1, (long)var0);
         return var1;
      }
   }

   public boolean ax() {
      if (this.ay == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.ay.length; ++var2) {
            if (!pw.aw.bd(this.ay[var2], 0, -2094056493)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   public jj bv() {
      jj[] var1 = new jj[5];
      int var2 = 0;

      for(int var3 = 0; var3 < 5; ++var3) {
         if (this.au[var3] != -1) {
            var1[var2++] = jj.ap(pw.aw, this.au[var3], 0);
         }
      }

      jj var5 = new jj(var1, var2);
      int var4;
      if (null != this.as) {
         for(var4 = 0; var4 < this.as.length; ++var4) {
            var5.ac(this.as[var4], this.ae[var4]);
         }
      }

      if (this.am != null) {
         for(var4 = 0; var4 < this.am.length; ++var4) {
            var5.av(this.am[var4], this.at[var4]);
         }
      }

      return var5;
   }

   void az(vl var1, int var2) {
      if (var2 == 1) {
         this.ai = var1.cy((short)-7004) * 2123884239;
      } else {
         int var3;
         int var4;
         if (2 == var2) {
            var3 = var1.cy((short)-12906);
            this.ay = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.ay[var4] = var1.ce(125173554);
            }
         } else if (3 == var2) {
            this.an = true;
         } else if (var2 == 40) {
            var3 = var1.cy((short)40);
            this.as = new short[var3];
            this.ae = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.as[var4] = (short)var1.ce(134659551);
               this.ae[var4] = (short)var1.ce(1901970994);
            }
         } else if (41 == var2) {
            var3 = var1.cy((short)-3145);
            this.am = new short[var3];
            this.at = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.am[var4] = (short)var1.ce(107877928);
               this.at[var4] = (short)var1.ce(671124480);
            }
         } else if (var2 >= 60 && var2 < 70) {
            this.au[var2 - 60] = var1.ce(1031603550);
         }
      }

   }

   void ag(vl var1, int var2) {
      if (var2 == 1) {
         this.ai = var1.cy((short)-6261) * 2123884239;
      } else {
         int var3;
         int var4;
         if (2 == var2) {
            var3 = var1.cy((short)-8336);
            this.ay = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.ay[var4] = var1.ce(649470286);
            }
         } else if (3 == var2) {
            this.an = true;
         } else if (var2 == 40) {
            var3 = var1.cy((short)-11396);
            this.as = new short[var3];
            this.ae = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.as[var4] = (short)var1.ce(1188287065);
               this.ae[var4] = (short)var1.ce(122816750);
            }
         } else if (41 == var2) {
            var3 = var1.cy((short)-10306);
            this.am = new short[var3];
            this.at = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.am[var4] = (short)var1.ce(563962071);
               this.at[var4] = (short)var1.ce(834431196);
            }
         } else if (var2 >= 60 && var2 < 70) {
            this.au[var2 - 60] = var1.ce(800523907);
         }
      }

   }

   public boolean ad(int var1, int var2) {
      if (1 == var2) {
         return 7 + var1 == -12492753 * this.ai;
      } else {
         return var1 == 650314405 * this.ai;
      }
   }

   public boolean ac(int var1, int var2) {
      if (1 == var2) {
         return 7 + var1 == 58939869 * this.ai;
      } else {
         return var1 == -12492753 * this.ai;
      }
   }

   public jj as(int var1) {
      try {
         if (null == this.ay) {
            return null;
         } else {
            jj[] var2 = new jj[this.ay.length];

            for(int var3 = 0; var3 < this.ay.length; ++var3) {
               if (var1 != 1107673543) {
                  throw new IllegalStateException();
               }

               var2[var3] = jj.ap(pw.aw, this.ay[var3], 0);
            }

            jj var6;
            if (var2.length == 1) {
               if (var1 != 1107673543) {
                  throw new IllegalStateException();
               }

               var6 = var2[0];
            } else {
               var6 = new jj(var2, var2.length);
            }

            int var4;
            if (null != this.as) {
               if (var1 != 1107673543) {
                  throw new IllegalStateException();
               }

               for(var4 = 0; var4 < this.as.length; ++var4) {
                  if (var1 != 1107673543) {
                     throw new IllegalStateException();
                  }

                  var6.ac(this.as[var4], this.ae[var4]);
               }
            }

            if (null != this.am) {
               if (var1 != 1107673543) {
                  throw new IllegalStateException();
               }

               for(var4 = 0; var4 < this.am.length; ++var4) {
                  if (var1 != 1107673543) {
                     throw new IllegalStateException();
                  }

                  var6.av(this.am[var4], this.at[var4]);
               }
            }

            return var6;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "hu.as(" + ')');
      }
   }

   public static hu ar(int var0) {
      hu var1 = (hu)aj.ap((long)var0);
      if (null != var1) {
         return var1;
      } else if (pq.ap == null) {
         return null;
      } else {
         byte[] var2 = pq.ap.bm(3, var0, 1944305905);
         var1 = new hu();
         if (null != var2) {
            var1.ak(new vl(var2), 286456945);
         }

         aj.ak(var1, (long)var0);
         return var1;
      }
   }

   public boolean aq() {
      if (this.ay == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.ay.length; ++var2) {
            if (!pw.aw.bd(this.ay[var2], 0, -2094056493)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   public boolean av() {
      if (this.ay == null) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.ay.length; ++var2) {
            if (!pw.aw.bd(this.ay[var2], 0, -2094056493)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   public jj aa() {
      if (null == this.ay) {
         return null;
      } else {
         jj[] var1 = new jj[this.ay.length];

         for(int var2 = 0; var2 < this.ay.length; ++var2) {
            var1[var2] = jj.ap(pw.aw, this.ay[var2], 0);
         }

         jj var4;
         if (var1.length == 1) {
            var4 = var1[0];
         } else {
            var4 = new jj(var1, var1.length);
         }

         int var3;
         if (null != this.as) {
            for(var3 = 0; var3 < this.as.length; ++var3) {
               var4.ac(this.as[var3], this.ae[var3]);
            }
         }

         if (null != this.am) {
            for(var3 = 0; var3 < this.am.length; ++var3) {
               var4.av(this.am[var3], this.at[var3]);
            }
         }

         return var4;
      }
   }

   public boolean ah() {
      boolean var1 = true;

      for(int var2 = 0; var2 < 5; ++var2) {
         if (this.au[var2] != -1 && !pw.aw.bd(this.au[var2], 0, -2094056493)) {
            var1 = false;
         }
      }

      return var1;
   }

   public boolean bh() {
      boolean var1 = true;

      for(int var2 = 0; var2 < 5; ++var2) {
         if (this.au[var2] != -1 && !pw.aw.bd(this.au[var2], 0, -2094056493)) {
            var1 = false;
         }
      }

      return var1;
   }

   public jj bj() {
      jj[] var1 = new jj[5];
      int var2 = 0;

      for(int var3 = 0; var3 < 5; ++var3) {
         if (this.au[var3] != -1) {
            var1[var2++] = jj.ap(pw.aw, this.au[var3], 0);
         }
      }

      jj var5 = new jj(var1, var2);
      int var4;
      if (null != this.as) {
         for(var4 = 0; var4 < this.as.length; ++var4) {
            var5.ac(this.as[var4], this.ae[var4]);
         }
      }

      if (this.am != null) {
         for(var4 = 0; var4 < this.am.length; ++var4) {
            var5.av(this.am[var4], this.at[var4]);
         }
      }

      return var5;
   }

   public boolean ay(int var1) {
      try {
         if (this.ay == null) {
            if (var1 != -1126698365) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            boolean var2 = true;

            for(int var3 = 0; var3 < this.ay.length; ++var3) {
               if (!pw.aw.bd(this.ay[var3], 0, -2094056493)) {
                  var2 = false;
               }
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "hu.ay(" + ')');
      }
   }

   static final void la(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         int var7 = var2 - var0;
         int var8 = var3 - var1;
         int var10000;
         if (var7 >= 0) {
            if (var6 == -659297213) {
               throw new IllegalStateException();
            }

            var10000 = var7;
         } else {
            var10000 = -var7;
         }

         int var9 = var10000;
         int var10 = var8 >= 0 ? var8 : -var8;
         int var11 = var9;
         if (var9 < var10) {
            var11 = var10;
         }

         if (0 == var11) {
            if (var6 == -659297213) {
               throw new IllegalStateException();
            }
         } else {
            int var12 = (var7 << 16) / var11;
            int var13 = (var8 << 16) / var11;
            if (var13 <= var12) {
               var12 = -var12;
            } else {
               var13 = -var13;
            }

            int var14 = var5 * var13 >> 17;
            int var15 = var5 * var13 + 1 >> 17;
            int var16 = var12 * var5 >> 17;
            int var17 = 1 + var5 * var12 >> 17;
            var0 -= vz.bk;
            var1 -= vz.bv;
            int var18 = var0 + var14;
            int var19 = var0 - var15;
            int var20 = var0 + var7 - var15;
            int var21 = var14 + var7 + var0;
            int var22 = var16 + var1;
            int var23 = var1 - var17;
            int var24 = var1 + var8 - var17;
            int var25 = var8 + var1 + var16;
            jm.ac(var18, var19, var20);
            jm.ax(var22, var23, var24, var18, var19, var20, 0.0F, 0.0F, 0.0F, var4);
            jm.ac(var18, var20, var21);
            jm.ax(var22, var24, var25, var18, var20, var21, 0.0F, 0.0F, 0.0F, var4);
         }
      } catch (RuntimeException var26) {
         throw tm.aw(var26, "hu.la(" + ')');
      }
   }
}
