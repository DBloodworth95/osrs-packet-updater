public class jv extends ju {
   int bp;
   static final int ae = -2;
   static final int ag = -1;
   int am = 0;
   int[] ax;
   int[] aq;
   int[] an;
   int at = 0;
   int[] au;
   int[] ar;
   int[] al;
   int ao;
   byte[] ah;
   byte[] ap;
   byte[] ab;
   short[] av;
   byte ai = 0;
   static int[] br;
   short[] aa;
   byte[] as;
   short[] ay;
   short[] aj;
   static int[] bl = new int[10000];
   int by;
   int[] af;
   int[][] ak;
   int[][] bn;
   int[][] bh;
   int[][] bd;
   js[] bx;
   jc[] bf;
   jc[] bm;
   public short bs;
   public short bw;
   boolean ba = false;
   short[] az;
   int[] aw;
   int bj;
   int bb;
   int bi;
   static int[] bg = new int[10000];
   byte[] ad;
   static int bz = 0;
   static int[] bu;
   static final int ac = -3;

   void aw() {
      this.bf = null;
      this.bm = null;
      this.bx = null;
      this.ba = false;
   }

   jv(byte[] var1) {
      vf var2 = new vf(10);
      var2.br(-2, 1625888552);
      if (var1[var1.length - 1] == -3 && var1[var1.length - 2] == -1) {
         this.ae(var1);
      } else if (var1[var1.length - 1] == -2 && var1[var1.length - 2] == -1) {
         this.ag(var1);
      } else if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         this.am(var1);
      } else {
         this.ax(var1);
      }

   }

   public void bc() {
      for(int var1 = 0; var1 < this.am; ++var1) {
         int var2 = this.af[var1];
         this.af[var1] = this.ax[var1];
         this.ax[var1] = -var2;
      }

      this.aw();
   }

   void ae(byte[] var1) {
      vf var2 = new vf(var1);
      vf var3 = new vf(var1);
      vf var4 = new vf(var1);
      vf var5 = new vf(var1);
      vf var6 = new vf(var1);
      vf var7 = new vf(var1);
      vf var8 = new vf(var1);
      var2.au = (var1.length - 26) * -1864458299;
      int var9 = var2.ct(-1866232000);
      int var10 = var2.ct(-1550953239);
      int var11 = var2.cv(952452697);
      int var12 = var2.cv(952452697);
      int var13 = var2.cv(952452697);
      int var14 = var2.cv(952452697);
      int var15 = var2.cv(952452697);
      int var16 = var2.cv(952452697);
      int var17 = var2.cv(952452697);
      int var18 = var2.cv(952452697);
      int var19 = var2.ct(-2122562712);
      int var20 = var2.ct(-2040775578);
      int var21 = var2.ct(-2044779742);
      int var22 = var2.ct(-1518007601);
      int var23 = var2.ct(-1824227992);
      int var24 = var2.ct(-1527264926);
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28;
      if (var11 > 0) {
         this.as = new byte[var11];
         var2.au = 0;

         for(var28 = 0; var28 < var11; ++var28) {
            byte var29 = this.as[var28] = var2.cg((short)21313);
            if (var29 == 0) {
               ++var25;
            }

            if (var29 >= 1 && var29 <= 3) {
               ++var26;
            }

            if (var29 == 2) {
               ++var27;
            }
         }
      }

      var28 = var11 + var9;
      int var30 = var28;
      if (var12 == 1) {
         var28 += var10;
      }

      int var31 = var28;
      var28 += var10;
      int var32 = var28;
      if (var13 == 255) {
         var28 += var10;
      }

      int var33 = var28;
      if (var15 == 1) {
         var28 += var10;
      }

      int var34 = var28;
      var28 += var24;
      int var35 = var28;
      if (var14 == 1) {
         var28 += var10;
      }

      int var36 = var28;
      var28 += var22;
      int var37 = var28;
      if (var16 == 1) {
         var28 += var10 * 2;
      }

      int var38 = var28;
      var28 += var23;
      int var39 = var28;
      var28 += var10 * 2;
      int var40 = var28;
      var28 += var19;
      int var41 = var28;
      var28 += var20;
      int var42 = var28;
      var28 += var21;
      int var43 = var28;
      var28 += var25 * 6;
      int var44 = var28;
      var28 += var26 * 6;
      int var45 = var28;
      var28 += var26 * 6;
      int var46 = var28;
      var28 += var26 * 2;
      int var47 = var28;
      var28 += var26;
      int var48 = var28;
      var28 += var26 * 2 + var27 * 2;
      this.am = var9;
      this.at = var10;
      this.ao = var11;
      this.ax = new int[var9];
      this.aq = new int[var9];
      this.af = new int[var9];
      this.au = new int[var10];
      this.ar = new int[var10];
      this.al = new int[var10];
      if (var17 == 1) {
         this.aw = new int[var9];
      }

      if (var12 == 1) {
         this.ad = new byte[var10];
      }

      if (var13 == 255) {
         this.ah = new byte[var10];
      } else {
         this.ai = (byte)var13;
      }

      if (var14 == 1) {
         this.ap = new byte[var10];
      }

      if (var15 == 1) {
         this.an = new int[var10];
      }

      if (var16 == 1) {
         this.aa = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.ab = new byte[var10];
      }

      if (var18 == 1) {
         this.bh = new int[var9][];
         this.bd = new int[var9][];
      }

      this.az = new short[var10];
      if (var11 > 0) {
         this.ay = new short[var11];
         this.aj = new short[var11];
         this.av = new short[var11];
      }

      var2.au = var11 * -1864458299;
      var3.au = var40 * -1864458299;
      var4.au = var41 * -1864458299;
      var5.au = var42 * -1864458299;
      var6.au = var34 * -1864458299;
      int var50 = 0;
      int var51 = 0;
      int var52 = 0;

      int var53;
      int var54;
      int var55;
      int var56;
      int var57;
      for(var53 = 0; var53 < var9; ++var53) {
         var54 = var2.cv(952452697);
         var55 = 0;
         if ((var54 & 1) != 0) {
            var55 = var3.ce(425293042);
         }

         var56 = 0;
         if ((var54 & 2) != 0) {
            var56 = var4.ce(1114021220);
         }

         var57 = 0;
         if ((var54 & 4) != 0) {
            var57 = var5.ce(908261770);
         }

         this.ax[var53] = var50 + var55;
         this.aq[var53] = var51 + var56;
         this.af[var53] = var52 + var57;
         var50 = this.ax[var53];
         var51 = this.aq[var53];
         var52 = this.af[var53];
         if (var17 == 1) {
            this.aw[var53] = var6.cv(952452697);
         }
      }

      if (var18 == 1) {
         for(var53 = 0; var53 < var9; ++var53) {
            var54 = var6.cv(952452697);
            this.bh[var53] = new int[var54];
            this.bd[var53] = new int[var54];

            for(var55 = 0; var55 < var54; ++var55) {
               this.bh[var53][var55] = var6.cv(952452697);
               this.bd[var53][var55] = var6.cv(952452697);
            }
         }
      }

      var2.au = var39 * -1864458299;
      var3.au = var30 * -1864458299;
      var4.au = var32 * -1864458299;
      var5.au = var35 * -1864458299;
      var6.au = var33 * -1864458299;
      var7.au = var37 * -1864458299;
      var8.au = var38 * -1864458299;

      for(var53 = 0; var53 < var10; ++var53) {
         this.az[var53] = (short)var2.ct(-1402141997);
         if (var12 == 1) {
            this.ad[var53] = var3.cg((short)-54);
         }

         if (var13 == 255) {
            this.ah[var53] = var4.cg((short)-13938);
         }

         if (var14 == 1) {
            this.ap[var53] = var5.cg((short)-20400);
         }

         if (var15 == 1) {
            this.an[var53] = var6.cv(952452697);
         }

         if (var16 == 1) {
            this.aa[var53] = (short)(var7.ct(-2022711788) - 1);
         }

         if (this.ab != null && this.aa[var53] != -1) {
            this.ab[var53] = (byte)(var8.cv(952452697) - 1);
         }
      }

      var2.au = var36 * -1864458299;
      var3.au = var31 * -1864458299;
      var53 = 0;
      var54 = 0;
      var55 = 0;
      var56 = 0;

      int var58;
      for(var57 = 0; var57 < var10; ++var57) {
         var58 = var3.cv(952452697);
         if (var58 == 1) {
            var53 = var2.ce(812070431) + var56;
            var54 = var2.ce(145053413) + var53;
            var55 = var2.ce(737956460) + var54;
            var56 = var55;
            this.au[var57] = var53;
            this.ar[var57] = var54;
            this.al[var57] = var55;
         }

         if (var58 == 2) {
            var54 = var55;
            var55 = var2.ce(1100702092) + var56;
            var56 = var55;
            this.au[var57] = var53;
            this.ar[var57] = var54;
            this.al[var57] = var55;
         }

         if (var58 == 3) {
            var53 = var55;
            var55 = var2.ce(539904840) + var56;
            var56 = var55;
            this.au[var57] = var53;
            this.ar[var57] = var54;
            this.al[var57] = var55;
         }

         if (var58 == 4) {
            int var59 = var53;
            var53 = var54;
            var54 = var59;
            var55 = var2.ce(488890667) + var56;
            var56 = var55;
            this.au[var57] = var53;
            this.ar[var57] = var59;
            this.al[var57] = var55;
         }
      }

      var2.au = var43 * -1864458299;
      var3.au = var44 * -1864458299;
      var4.au = var45 * -1864458299;
      var5.au = var46 * -1864458299;
      var6.au = var47 * -1864458299;
      var7.au = var48 * -1864458299;

      for(var57 = 0; var57 < var11; ++var57) {
         var58 = this.as[var57] & 255;
         if (var58 == 0) {
            this.ay[var57] = (short)var2.ct(-1981206865);
            this.aj[var57] = (short)var2.ct(-2121654547);
            this.av[var57] = (short)var2.ct(-1528484523);
         }
      }

      var2.au = var28 * -1864458299;
      var57 = var2.cv(952452697);
      if (var57 != 0) {
         new kj();
         var2.ct(-2060905481);
         var2.ct(-1940096004);
         var2.ct(-1593968609);
         var2.cz(-1734056172);
      }

   }

   void ag(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      vf var4 = new vf(var1);
      vf var5 = new vf(var1);
      vf var6 = new vf(var1);
      vf var7 = new vf(var1);
      vf var8 = new vf(var1);
      var4.au = (var1.length - 23) * -1864458299;
      int var9 = var4.ct(-1432967166);
      int var10 = var4.ct(-1826222222);
      int var11 = var4.cv(952452697);
      int var12 = var4.cv(952452697);
      int var13 = var4.cv(952452697);
      int var14 = var4.cv(952452697);
      int var15 = var4.cv(952452697);
      int var16 = var4.cv(952452697);
      int var17 = var4.cv(952452697);
      int var18 = var4.ct(-1342669284);
      int var19 = var4.ct(-1505690498);
      int var20 = var4.ct(-1634248807);
      int var21 = var4.ct(-1882105749);
      int var22 = var4.ct(-1495551468);
      byte var23 = 0;
      int var47 = var23 + var9;
      int var25 = var47;
      var47 += var10;
      int var26 = var47;
      if (var13 == 255) {
         var47 += var10;
      }

      int var27 = var47;
      if (var15 == 1) {
         var47 += var10;
      }

      int var28 = var47;
      if (var12 == 1) {
         var47 += var10;
      }

      int var29 = var47;
      var47 += var22;
      int var30 = var47;
      if (var14 == 1) {
         var47 += var10;
      }

      int var31 = var47;
      var47 += var21;
      int var32 = var47;
      var47 += var10 * 2;
      int var33 = var47;
      var47 += var11 * 6;
      int var34 = var47;
      var47 += var18;
      int var35 = var47;
      var47 += var19;
      int var10000 = var47 + var20;
      this.am = var9;
      this.at = var10;
      this.ao = var11;
      this.ax = new int[var9];
      this.aq = new int[var9];
      this.af = new int[var9];
      this.au = new int[var10];
      this.ar = new int[var10];
      this.al = new int[var10];
      if (var11 > 0) {
         this.as = new byte[var11];
         this.ay = new short[var11];
         this.aj = new short[var11];
         this.av = new short[var11];
      }

      if (var16 == 1) {
         this.aw = new int[var9];
      }

      if (var12 == 1) {
         this.ad = new byte[var10];
         this.ab = new byte[var10];
         this.aa = new short[var10];
      }

      if (var13 == 255) {
         this.ah = new byte[var10];
      } else {
         this.ai = (byte)var13;
      }

      if (var14 == 1) {
         this.ap = new byte[var10];
      }

      if (var15 == 1) {
         this.an = new int[var10];
      }

      if (var17 == 1) {
         this.bh = new int[var9][];
         this.bd = new int[var9][];
      }

      this.az = new short[var10];
      var4.au = var23 * -1864458299;
      var5.au = var34 * -1864458299;
      var6.au = var35 * -1864458299;
      var7.au = var47 * -1864458299;
      var8.au = var29 * -1864458299;
      int var37 = 0;
      int var38 = 0;
      int var39 = 0;

      int var40;
      int var41;
      int var42;
      int var43;
      int var44;
      for(var40 = 0; var40 < var9; ++var40) {
         var41 = var4.cv(952452697);
         var42 = 0;
         if ((var41 & 1) != 0) {
            var42 = var5.ce(1546678835);
         }

         var43 = 0;
         if ((var41 & 2) != 0) {
            var43 = var6.ce(1734779162);
         }

         var44 = 0;
         if ((var41 & 4) != 0) {
            var44 = var7.ce(432982496);
         }

         this.ax[var40] = var37 + var42;
         this.aq[var40] = var38 + var43;
         this.af[var40] = var39 + var44;
         var37 = this.ax[var40];
         var38 = this.aq[var40];
         var39 = this.af[var40];
         if (var16 == 1) {
            this.aw[var40] = var8.cv(952452697);
         }
      }

      if (var17 == 1) {
         for(var40 = 0; var40 < var9; ++var40) {
            var41 = var8.cv(952452697);
            this.bh[var40] = new int[var41];
            this.bd[var40] = new int[var41];

            for(var42 = 0; var42 < var41; ++var42) {
               this.bh[var40][var42] = var8.cv(952452697);
               this.bd[var40][var42] = var8.cv(952452697);
            }
         }
      }

      var4.au = var32 * -1864458299;
      var5.au = var28 * -1864458299;
      var6.au = var26 * -1864458299;
      var7.au = var30 * -1864458299;
      var8.au = var27 * -1864458299;

      for(var40 = 0; var40 < var10; ++var40) {
         this.az[var40] = (short)var4.ct(-2108135556);
         if (var12 == 1) {
            var41 = var5.cv(952452697);
            if ((var41 & 1) == 1) {
               this.ad[var40] = 1;
               var2 = true;
            } else {
               this.ad[var40] = 0;
            }

            if ((var41 & 2) == 2) {
               this.ab[var40] = (byte)(var41 >> 2);
               this.aa[var40] = this.az[var40];
               this.az[var40] = 127;
               if (this.aa[var40] != -1) {
                  var3 = true;
               }
            } else {
               this.ab[var40] = -1;
               this.aa[var40] = -1;
            }
         }

         if (var13 == 255) {
            this.ah[var40] = var6.cg((short)2159);
         }

         if (var14 == 1) {
            this.ap[var40] = var7.cg((short)9208);
         }

         if (var15 == 1) {
            this.an[var40] = var8.cv(952452697);
         }
      }

      var4.au = var31 * -1864458299;
      var5.au = var25 * -1864458299;
      var40 = 0;
      var41 = 0;
      var42 = 0;
      var43 = 0;

      int var45;
      int var46;
      for(var44 = 0; var44 < var10; ++var44) {
         var45 = var5.cv(952452697);
         if (var45 == 1) {
            var40 = var4.ce(678959998) + var43;
            var41 = var4.ce(-158805571) + var40;
            var42 = var4.ce(-286702385) + var41;
            var43 = var42;
            this.au[var44] = var40;
            this.ar[var44] = var41;
            this.al[var44] = var42;
         }

         if (var45 == 2) {
            var41 = var42;
            var42 = var4.ce(902940027) + var43;
            var43 = var42;
            this.au[var44] = var40;
            this.ar[var44] = var41;
            this.al[var44] = var42;
         }

         if (var45 == 3) {
            var40 = var42;
            var42 = var4.ce(-304850033) + var43;
            var43 = var42;
            this.au[var44] = var40;
            this.ar[var44] = var41;
            this.al[var44] = var42;
         }

         if (var45 == 4) {
            var46 = var40;
            var40 = var41;
            var41 = var46;
            var42 = var4.ce(796310636) + var43;
            var43 = var42;
            this.au[var44] = var40;
            this.ar[var44] = var46;
            this.al[var44] = var42;
         }
      }

      var4.au = var33 * -1864458299;

      for(var44 = 0; var44 < var11; ++var44) {
         this.as[var44] = 0;
         this.ay[var44] = (short)var4.ct(-1517393239);
         this.aj[var44] = (short)var4.ct(-1882851387);
         this.av[var44] = (short)var4.ct(-2028503694);
      }

      if (this.ab != null) {
         boolean var48 = false;

         for(var45 = 0; var45 < var10; ++var45) {
            var46 = this.ab[var45] & 255;
            if (var46 != 255) {
               if ((this.ay[var46] & '\uffff') == this.au[var45] && (this.aj[var46] & '\uffff') == this.ar[var45] && (this.av[var46] & '\uffff') == this.al[var45]) {
                  this.ab[var45] = -1;
               } else {
                  var48 = true;
               }
            }
         }

         if (!var48) {
            this.ab = null;
         }
      }

      if (!var3) {
         this.aa = null;
      }

      if (!var2) {
         this.ad = null;
      }

   }

   void am(byte[] var1) {
      vf var2 = new vf(var1);
      vf var3 = new vf(var1);
      vf var4 = new vf(var1);
      vf var5 = new vf(var1);
      vf var6 = new vf(var1);
      vf var7 = new vf(var1);
      vf var8 = new vf(var1);
      var2.au = (var1.length - 23) * -1864458299;
      int var9 = var2.ct(-1360095751);
      int var10 = var2.ct(-1908483716);
      int var11 = var2.cv(952452697);
      int var12 = var2.cv(952452697);
      int var13 = var2.cv(952452697);
      int var14 = var2.cv(952452697);
      int var15 = var2.cv(952452697);
      int var16 = var2.cv(952452697);
      int var17 = var2.cv(952452697);
      int var18 = var2.ct(-2100467308);
      int var19 = var2.ct(-1677383754);
      int var20 = var2.ct(-1938924466);
      int var21 = var2.ct(-1640181265);
      int var22 = var2.ct(-1890960217);
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if (var11 > 0) {
         this.as = new byte[var11];
         var2.au = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.as[var26] = var2.cg((short)3543);
            if (var27 == 0) {
               ++var23;
            }

            if (var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if (var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if (var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if (var13 == 255) {
         var26 += var10;
      }

      int var31 = var26;
      if (var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if (var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if (var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if (var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.am = var9;
      this.at = var10;
      this.ao = var11;
      this.ax = new int[var9];
      this.aq = new int[var9];
      this.af = new int[var9];
      this.au = new int[var10];
      this.ar = new int[var10];
      this.al = new int[var10];
      if (var17 == 1) {
         this.aw = new int[var9];
      }

      if (var12 == 1) {
         this.ad = new byte[var10];
      }

      if (var13 == 255) {
         this.ah = new byte[var10];
      } else {
         this.ai = (byte)var13;
      }

      if (var14 == 1) {
         this.ap = new byte[var10];
      }

      if (var15 == 1) {
         this.an = new int[var10];
      }

      if (var16 == 1) {
         this.aa = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.ab = new byte[var10];
      }

      this.az = new short[var10];
      if (var11 > 0) {
         this.ay = new short[var11];
         this.aj = new short[var11];
         this.av = new short[var11];
      }

      var2.au = var11 * -1864458299;
      var3.au = var38 * -1864458299;
      var4.au = var39 * -1864458299;
      var5.au = var40 * -1864458299;
      var6.au = var32 * -1864458299;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.cv(952452697);
         var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.ce(1748770972);
         }

         var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.ce(1899861028);
         }

         var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.ce(854053858);
         }

         this.ax[var51] = var48 + var53;
         this.aq[var51] = var49 + var54;
         this.af[var51] = var50 + var55;
         var48 = this.ax[var51];
         var49 = this.aq[var51];
         var50 = this.af[var51];
         if (var17 == 1) {
            this.aw[var51] = var6.cv(952452697);
         }
      }

      var2.au = var37 * -1864458299;
      var3.au = var28 * -1864458299;
      var4.au = var30 * -1864458299;
      var5.au = var33 * -1864458299;
      var6.au = var31 * -1864458299;
      var7.au = var35 * -1864458299;
      var8.au = var36 * -1864458299;

      for(var51 = 0; var51 < var10; ++var51) {
         this.az[var51] = (short)var2.ct(-1756655243);
         if (var12 == 1) {
            this.ad[var51] = var3.cg((short)-14679);
         }

         if (var13 == 255) {
            this.ah[var51] = var4.cg((short)-10810);
         }

         if (var14 == 1) {
            this.ap[var51] = var5.cg((short)-27782);
         }

         if (var15 == 1) {
            this.an[var51] = var6.cv(952452697);
         }

         if (var16 == 1) {
            this.aa[var51] = (short)(var7.ct(-1421679847) - 1);
         }

         if (this.ab != null && this.aa[var51] != -1) {
            this.ab[var51] = (byte)(var8.cv(952452697) - 1);
         }
      }

      var2.au = var34 * -1864458299;
      var3.au = var29 * -1864458299;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.cv(952452697);
         if (var56 == 1) {
            var51 = var2.ce(593857049) + var54;
            var52 = var2.ce(1393406053) + var51;
            var53 = var2.ce(838808468) + var52;
            var54 = var53;
            this.au[var55] = var51;
            this.ar[var55] = var52;
            this.al[var55] = var53;
         }

         if (var56 == 2) {
            var52 = var53;
            var53 = var2.ce(1343945500) + var54;
            var54 = var53;
            this.au[var55] = var51;
            this.ar[var55] = var52;
            this.al[var55] = var53;
         }

         if (var56 == 3) {
            var51 = var53;
            var53 = var2.ce(1392549784) + var54;
            var54 = var53;
            this.au[var55] = var51;
            this.ar[var55] = var52;
            this.al[var55] = var53;
         }

         if (var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.ce(1151033086) + var54;
            var54 = var53;
            this.au[var55] = var51;
            this.ar[var55] = var57;
            this.al[var55] = var53;
         }
      }

      var2.au = var41 * -1864458299;
      var3.au = var42 * -1864458299;
      var4.au = var43 * -1864458299;
      var5.au = var44 * -1864458299;
      var6.au = var45 * -1864458299;
      var7.au = var46 * -1864458299;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.as[var55] & 255;
         if (var56 == 0) {
            this.ay[var55] = (short)var2.ct(-1724782014);
            this.aj[var55] = (short)var2.ct(-1358177310);
            this.av[var55] = (short)var2.ct(-1730701369);
         }
      }

      var2.au = var26 * -1864458299;
      var55 = var2.cv(952452697);
      if (var55 != 0) {
         new kj();
         var2.ct(-1853915363);
         var2.ct(-1502480173);
         var2.ct(-1845424230);
         var2.cz(-1734056172);
      }

   }

   void ax(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      vf var4 = new vf(var1);
      vf var5 = new vf(var1);
      vf var6 = new vf(var1);
      vf var7 = new vf(var1);
      vf var8 = new vf(var1);
      var4.au = (var1.length - 18) * -1864458299;
      int var9 = var4.ct(-1460813217);
      int var10 = var4.ct(-1551472333);
      int var11 = var4.cv(952452697);
      int var12 = var4.cv(952452697);
      int var13 = var4.cv(952452697);
      int var14 = var4.cv(952452697);
      int var15 = var4.cv(952452697);
      int var16 = var4.cv(952452697);
      int var17 = var4.ct(-1527770114);
      int var18 = var4.ct(-1542584416);
      int var19 = var4.ct(-2006603626);
      int var20 = var4.ct(-1479176444);
      byte var21 = 0;
      int var45 = var21 + var9;
      int var23 = var45;
      var45 += var10;
      int var24 = var45;
      if (var13 == 255) {
         var45 += var10;
      }

      int var25 = var45;
      if (var15 == 1) {
         var45 += var10;
      }

      int var26 = var45;
      if (var12 == 1) {
         var45 += var10;
      }

      int var27 = var45;
      if (var16 == 1) {
         var45 += var9;
      }

      int var28 = var45;
      if (var14 == 1) {
         var45 += var10;
      }

      int var29 = var45;
      var45 += var20;
      int var30 = var45;
      var45 += var10 * 2;
      int var31 = var45;
      var45 += var11 * 6;
      int var32 = var45;
      var45 += var17;
      int var33 = var45;
      var45 += var18;
      int var10000 = var45 + var19;
      this.am = var9;
      this.at = var10;
      this.ao = var11;
      this.ax = new int[var9];
      this.aq = new int[var9];
      this.af = new int[var9];
      this.au = new int[var10];
      this.ar = new int[var10];
      this.al = new int[var10];
      if (var11 > 0) {
         this.as = new byte[var11];
         this.ay = new short[var11];
         this.aj = new short[var11];
         this.av = new short[var11];
      }

      if (var16 == 1) {
         this.aw = new int[var9];
      }

      if (var12 == 1) {
         this.ad = new byte[var10];
         this.ab = new byte[var10];
         this.aa = new short[var10];
      }

      if (var13 == 255) {
         this.ah = new byte[var10];
      } else {
         this.ai = (byte)var13;
      }

      if (var14 == 1) {
         this.ap = new byte[var10];
      }

      if (var15 == 1) {
         this.an = new int[var10];
      }

      this.az = new short[var10];
      var4.au = var21 * -1864458299;
      var5.au = var32 * -1864458299;
      var6.au = var33 * -1864458299;
      var7.au = var45 * -1864458299;
      var8.au = var27 * -1864458299;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.cv(952452697);
         var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.ce(1632633548);
         }

         var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.ce(1207824625);
         }

         var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.ce(134826080);
         }

         this.ax[var38] = var35 + var40;
         this.aq[var38] = var36 + var41;
         this.af[var38] = var37 + var42;
         var35 = this.ax[var38];
         var36 = this.aq[var38];
         var37 = this.af[var38];
         if (var16 == 1) {
            this.aw[var38] = var8.cv(952452697);
         }
      }

      var4.au = var30 * -1864458299;
      var5.au = var26 * -1864458299;
      var6.au = var24 * -1864458299;
      var7.au = var28 * -1864458299;
      var8.au = var25 * -1864458299;

      for(var38 = 0; var38 < var10; ++var38) {
         this.az[var38] = (short)var4.ct(-1769402969);
         if (var12 == 1) {
            var39 = var5.cv(952452697);
            if ((var39 & 1) == 1) {
               this.ad[var38] = 1;
               var2 = true;
            } else {
               this.ad[var38] = 0;
            }

            if ((var39 & 2) == 2) {
               this.ab[var38] = (byte)(var39 >> 2);
               this.aa[var38] = this.az[var38];
               this.az[var38] = 127;
               if (this.aa[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.ab[var38] = -1;
               this.aa[var38] = -1;
            }
         }

         if (var13 == 255) {
            this.ah[var38] = var6.cg((short)-2959);
         }

         if (var14 == 1) {
            this.ap[var38] = var7.cg((short)7662);
         }

         if (var15 == 1) {
            this.an[var38] = var8.cv(952452697);
         }
      }

      var4.au = var29 * -1864458299;
      var5.au = var23 * -1864458299;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.cv(952452697);
         if (var43 == 1) {
            var38 = var4.ce(1055632768) + var41;
            var39 = var4.ce(984740887) + var38;
            var40 = var4.ce(-311721118) + var39;
            var41 = var40;
            this.au[var42] = var38;
            this.ar[var42] = var39;
            this.al[var42] = var40;
         }

         if (var43 == 2) {
            var39 = var40;
            var40 = var4.ce(839223973) + var41;
            var41 = var40;
            this.au[var42] = var38;
            this.ar[var42] = var39;
            this.al[var42] = var40;
         }

         if (var43 == 3) {
            var38 = var40;
            var40 = var4.ce(1459821499) + var41;
            var41 = var40;
            this.au[var42] = var38;
            this.ar[var42] = var39;
            this.al[var42] = var40;
         }

         if (var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.ce(1581547862) + var41;
            var41 = var40;
            this.au[var42] = var38;
            this.ar[var42] = var44;
            this.al[var42] = var40;
         }
      }

      var4.au = var31 * -1864458299;

      for(var42 = 0; var42 < var11; ++var42) {
         this.as[var42] = 0;
         this.ay[var42] = (short)var4.ct(-1911110803);
         this.aj[var42] = (short)var4.ct(-1844179839);
         this.av[var42] = (short)var4.ct(-1937598579);
      }

      if (this.ab != null) {
         boolean var46 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.ab[var43] & 255;
            if (var44 != 255) {
               if ((this.ay[var44] & '\uffff') == this.au[var43] && (this.aj[var44] & '\uffff') == this.ar[var43] && (this.av[var44] & '\uffff') == this.al[var43]) {
                  this.ab[var43] = -1;
               } else {
                  var46 = true;
               }
            }
         }

         if (!var46) {
            this.ab = null;
         }
      }

      if (!var3) {
         this.aa = null;
      }

      if (!var2) {
         this.ad = null;
      }

   }

   public jv(jv[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      this.am = 0;
      this.at = 0;
      this.ao = 0;
      this.ai = -1;

      int var10;
      jv var11;
      for(var10 = 0; var10 < var2; ++var10) {
         var11 = var1[var10];
         if (var11 != null) {
            this.am += var11.am;
            this.at += var11.at;
            this.ao += var11.ao;
            if (var11.ah != null) {
               var4 = true;
            } else {
               if (this.ai == -1) {
                  this.ai = var11.ai;
               }

               if (this.ai != var11.ai) {
                  var4 = true;
               }
            }

            var3 |= var11.ad != null;
            var5 |= var11.ap != null;
            var6 |= var11.an != null;
            var7 |= var11.aa != null;
            var8 |= var11.ab != null;
            var9 |= var11.bh != null;
         }
      }

      this.ax = new int[this.am];
      this.aq = new int[this.am];
      this.af = new int[this.am];
      this.aw = new int[this.am];
      this.au = new int[this.at];
      this.ar = new int[this.at];
      this.al = new int[this.at];
      if (var3) {
         this.ad = new byte[this.at];
      }

      if (var4) {
         this.ah = new byte[this.at];
      }

      if (var5) {
         this.ap = new byte[this.at];
      }

      if (var6) {
         this.an = new int[this.at];
      }

      if (var7) {
         this.aa = new short[this.at];
      }

      if (var8) {
         this.ab = new byte[this.at];
      }

      if (var9) {
         this.bh = new int[this.am][];
         this.bd = new int[this.am][];
      }

      this.az = new short[this.at];
      if (this.ao > 0) {
         this.as = new byte[this.ao];
         this.ay = new short[this.ao];
         this.aj = new short[this.ao];
         this.av = new short[this.ao];
      }

      this.am = 0;
      this.at = 0;
      this.ao = 0;

      for(var10 = 0; var10 < var2; ++var10) {
         var11 = var1[var10];
         if (var11 != null) {
            int var12;
            for(var12 = 0; var12 < var11.at; ++var12) {
               if (var3 && var11.ad != null) {
                  this.ad[this.at] = var11.ad[var12];
               }

               if (var4) {
                  if (var11.ah != null) {
                     this.ah[this.at] = var11.ah[var12];
                  } else {
                     this.ah[this.at] = var11.ai;
                  }
               }

               if (var5 && var11.ap != null) {
                  this.ap[this.at] = var11.ap[var12];
               }

               if (var6 && var11.an != null) {
                  this.an[this.at] = var11.an[var12];
               }

               if (var7) {
                  if (var11.aa != null) {
                     this.aa[this.at] = var11.aa[var12];
                  } else {
                     this.aa[this.at] = -1;
                  }
               }

               if (var8) {
                  if (var11.ab != null && var11.ab[var12] != -1) {
                     this.ab[this.at] = (byte)(var11.ab[var12] + this.ao);
                  } else {
                     this.ab[this.at] = -1;
                  }
               }

               this.az[this.at] = var11.az[var12];
               this.au[this.at] = this.aq(var11, var11.au[var12]);
               this.ar[this.at] = this.aq(var11, var11.ar[var12]);
               this.al[this.at] = this.aq(var11, var11.al[var12]);
               ++this.at;
            }

            for(var12 = 0; var12 < var11.ao; ++var12) {
               byte var13 = this.as[this.ao] = var11.as[var12];
               if (var13 == 0) {
                  this.ay[this.ao] = (short)this.aq(var11, var11.ay[var12]);
                  this.aj[this.ao] = (short)this.aq(var11, var11.aj[var12]);
                  this.av[this.ao] = (short)this.aq(var11, var11.av[var12]);
               }

               ++this.ao;
            }
         }
      }

   }

   public static jv bf(po var0, int var1, int var2) {
      byte[] var3 = var0.bt(var1, var2, (byte)-84);
      return var3 == null ? null : new jv(var3);
   }

   public void ai(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.am; ++var4) {
         int[] var10000 = this.ax;
         var10000[var4] += var1;
         var10000 = this.aq;
         var10000[var4] += var2;
         var10000 = this.af;
         var10000[var4] += var3;
      }

      this.aw();
   }

   static void cd(jv var0, jv var1, int var2, int var3, int var4, boolean var5) {
      var0.an();
      var0.av();
      var1.an();
      var1.av();
      ++bz;
      int var6 = 0;
      int[] var7 = var1.ax;
      int var8 = var1.am;

      int var9;
      for(var9 = 0; var9 < var0.am; ++var9) {
         jc var10 = var0.bf[var9];
         if (var10.am * -608243259 != 0) {
            int var11 = var0.aq[var9] - var3;
            if (var11 <= var1.bj) {
               int var12 = var0.ax[var9] - var2;
               if (var12 >= var1.bp && var12 <= var1.by) {
                  int var13 = var0.af[var9] - var4;
                  if (var13 >= var1.bi && var13 <= var1.bb) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        jc var15 = var1.bf[var14];
                        if (var12 == var7[var14] && var13 == var1.af[var14] && var11 == var1.aq[var14] && var15.am * -608243259 != 0) {
                           if (var0.bm == null) {
                              var0.bm = new jc[var0.am];
                           }

                           if (var1.bm == null) {
                              var1.bm = new jc[var8];
                           }

                           jc var16 = var0.bm[var9];
                           if (var16 == null) {
                              var16 = var0.bm[var9] = new jc(var10);
                           }

                           jc var17 = var1.bm[var14];
                           if (var17 == null) {
                              var17 = var1.bm[var14] = new jc(var15);
                           }

                           var16.ac += var15.ac * 1;
                           var16.ae += var15.ae * 1;
                           var16.ag += var15.ag * 1;
                           var16.am += var15.am * 1;
                           var17.ac += var10.ac * 1;
                           var17.ae += var10.ae * 1;
                           var17.ag += var10.ag * 1;
                           var17.am += var10.am * 1;
                           ++var6;
                           bg[var9] = bz;
                           bl[var14] = bz;
                        }
                     }
                  }
               }
            }
         }
      }

      if (var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.at; ++var9) {
            if (bg[var0.au[var9]] == bz && bg[var0.ar[var9]] == bz && bg[var0.al[var9]] == bz) {
               if (var0.ad == null) {
                  var0.ad = new byte[var0.at];
               }

               var0.ad[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.at; ++var9) {
            if (bl[var1.au[var9]] == bz && bl[var1.ar[var9]] == bz && bl[var1.al[var9]] == bz) {
               if (var1.ad == null) {
                  var1.ad = new byte[var1.at];
               }

               var1.ad[var9] = 2;
            }
         }

      }
   }

   void bb(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      vf var4 = new vf(var1);
      vf var5 = new vf(var1);
      vf var6 = new vf(var1);
      vf var7 = new vf(var1);
      vf var8 = new vf(var1);
      var4.au = (var1.length - 18) * -1607157041;
      int var9 = var4.ct(-1993313808);
      int var10 = var4.ct(-1330541407);
      int var11 = var4.cv(952452697);
      int var12 = var4.cv(952452697);
      int var13 = var4.cv(952452697);
      int var14 = var4.cv(952452697);
      int var15 = var4.cv(952452697);
      int var16 = var4.cv(952452697);
      int var17 = var4.ct(-1467292282);
      int var18 = var4.ct(-1768299187);
      int var19 = var4.ct(-1327702764);
      int var20 = var4.ct(-1617668979);
      byte var21 = 0;
      int var45 = var21 + var9;
      int var23 = var45;
      var45 += var10;
      int var24 = var45;
      if (var13 == -721907177) {
         var45 += var10;
      }

      int var25 = var45;
      if (var15 == 1) {
         var45 += var10;
      }

      int var26 = var45;
      if (var12 == 1) {
         var45 += var10;
      }

      int var27 = var45;
      if (var16 == 1) {
         var45 += var9;
      }

      int var28 = var45;
      if (var14 == 1) {
         var45 += var10;
      }

      int var29 = var45;
      var45 += var20;
      int var30 = var45;
      var45 += var10 * 2;
      int var31 = var45;
      var45 += var11 * 6;
      int var32 = var45;
      var45 += var17;
      int var33 = var45;
      var45 += var18;
      int var10000 = var45 + var19;
      this.am = var9;
      this.at = var10;
      this.ao = var11;
      this.ax = new int[var9];
      this.aq = new int[var9];
      this.af = new int[var9];
      this.au = new int[var10];
      this.ar = new int[var10];
      this.al = new int[var10];
      if (var11 > 0) {
         this.as = new byte[var11];
         this.ay = new short[var11];
         this.aj = new short[var11];
         this.av = new short[var11];
      }

      if (var16 == 1) {
         this.aw = new int[var9];
      }

      if (var12 == 1) {
         this.ad = new byte[var10];
         this.ab = new byte[var10];
         this.aa = new short[var10];
      }

      if (var13 == 255) {
         this.ah = new byte[var10];
      } else {
         this.ai = (byte)var13;
      }

      if (var14 == 1) {
         this.ap = new byte[var10];
      }

      if (var15 == 1) {
         this.an = new int[var10];
      }

      this.az = new short[var10];
      var4.au = var21 * -1421385228;
      var5.au = var32 * -1864458299;
      var6.au = var33 * 755036646;
      var7.au = var45 * -1864458299;
      var8.au = var27 * -1864458299;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.cv(952452697);
         var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.ce(789616263);
         }

         var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.ce(358904998);
         }

         var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.ce(1738221002);
         }

         this.ax[var38] = var35 + var40;
         this.aq[var38] = var36 + var41;
         this.af[var38] = var37 + var42;
         var35 = this.ax[var38];
         var36 = this.aq[var38];
         var37 = this.af[var38];
         if (var16 == 1) {
            this.aw[var38] = var8.cv(952452697);
         }
      }

      var4.au = var30 * -1864458299;
      var5.au = var26 * -1864458299;
      var6.au = var24 * -1864458299;
      var7.au = var28 * 648681662;
      var8.au = var25 * 1518623206;

      for(var38 = 0; var38 < var10; ++var38) {
         this.az[var38] = (short)var4.ct(-1510915034);
         if (var12 == 1) {
            var39 = var5.cv(952452697);
            if ((var39 & 1) == 1) {
               this.ad[var38] = 1;
               var2 = true;
            } else {
               this.ad[var38] = 0;
            }

            if ((var39 & 2) == 2) {
               this.ab[var38] = (byte)(var39 >> 2);
               this.aa[var38] = this.az[var38];
               this.az[var38] = 127;
               if (this.aa[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.ab[var38] = -1;
               this.aa[var38] = -1;
            }
         }

         if (var13 == -213955084) {
            this.ah[var38] = var6.cg((short)11097);
         }

         if (var14 == 1) {
            this.ap[var38] = var7.cg((short)-5353);
         }

         if (var15 == 1) {
            this.an[var38] = var8.cv(952452697);
         }
      }

      var4.au = var29 * -1864458299;
      var5.au = var23 * -1864458299;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.cv(952452697);
         if (var43 == 1) {
            var38 = var4.ce(136287894) + var41;
            var39 = var4.ce(1878669298) + var38;
            var40 = var4.ce(2076748966) + var39;
            var41 = var40;
            this.au[var42] = var38;
            this.ar[var42] = var39;
            this.al[var42] = var40;
         }

         if (var43 == 2) {
            var39 = var40;
            var40 = var4.ce(1702586357) + var41;
            var41 = var40;
            this.au[var42] = var38;
            this.ar[var42] = var39;
            this.al[var42] = var40;
         }

         if (var43 == 3) {
            var38 = var40;
            var40 = var4.ce(359486795) + var41;
            var41 = var40;
            this.au[var42] = var38;
            this.ar[var42] = var39;
            this.al[var42] = var40;
         }

         if (var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.ce(116483818) + var41;
            var41 = var40;
            this.au[var42] = var38;
            this.ar[var42] = var44;
            this.al[var42] = var40;
         }
      }

      var4.au = var31 * 2130838620;

      for(var42 = 0; var42 < var11; ++var42) {
         this.as[var42] = 0;
         this.ay[var42] = (short)var4.ct(-1893131029);
         this.aj[var42] = (short)var4.ct(-1867792747);
         this.av[var42] = (short)var4.ct(-1650617668);
      }

      if (this.ab != null) {
         boolean var46 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.ab[var43] & -233151610;
            if (var44 != 1740763285) {
               if ((this.ay[var44] & '\uffff') == this.au[var43] && (this.aj[var44] & '\uffff') == this.ar[var43] && (this.av[var44] & 2143061038) == this.al[var43]) {
                  this.ab[var43] = -1;
               } else {
                  var46 = true;
               }
            }
         }

         if (!var46) {
            this.ab = null;
         }
      }

      if (!var3) {
         this.aa = null;
      }

      if (!var2) {
         this.ad = null;
      }

   }

   void au() {
      int[] var1;
      int var2;
      int var10002;
      int var3;
      int var4;
      if (this.aw != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.am; ++var3) {
            var4 = this.aw[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.ak = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.ak[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.am; this.ak[var4][var1[var4]++] = var3++) {
            var4 = this.aw[var3];
         }

         this.aw = null;
      }

      if (this.an != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.at; ++var3) {
            var4 = this.an[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.bn = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.bn[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.at; this.bn[var4][var1[var4]++] = var3++) {
            var4 = this.an[var3];
         }

         this.an = null;
      }

   }

   public void ar() {
      for(int var1 = 0; var1 < this.am; ++var1) {
         int var2 = this.ax[var1];
         this.ax[var1] = this.af[var1];
         this.af[var1] = -var2;
      }

      this.aw();
   }

   public jv(jv var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.am = var1.am;
      this.at = var1.at;
      this.ao = var1.ao;
      int var6;
      if (var2) {
         this.ax = var1.ax;
         this.aq = var1.aq;
         this.af = var1.af;
      } else {
         this.ax = new int[this.am];
         this.aq = new int[this.am];
         this.af = new int[this.am];

         for(var6 = 0; var6 < this.am; ++var6) {
            this.ax[var6] = var1.ax[var6];
            this.aq[var6] = var1.aq[var6];
            this.af[var6] = var1.af[var6];
         }
      }

      if (var3) {
         this.az = var1.az;
      } else {
         this.az = new short[this.at];

         for(var6 = 0; var6 < this.at; ++var6) {
            this.az[var6] = var1.az[var6];
         }
      }

      if (!var4 && var1.aa != null) {
         this.aa = new short[this.at];

         for(var6 = 0; var6 < this.at; ++var6) {
            this.aa[var6] = var1.aa[var6];
         }
      } else {
         this.aa = var1.aa;
      }

      if (var5) {
         this.ap = var1.ap;
      } else {
         this.ap = new byte[this.at];
         if (var1.ap == null) {
            for(var6 = 0; var6 < this.at; ++var6) {
               this.ap[var6] = 0;
            }
         } else {
            for(var6 = 0; var6 < this.at; ++var6) {
               this.ap[var6] = var1.ap[var6];
            }
         }
      }

      this.au = var1.au;
      this.ar = var1.ar;
      this.al = var1.al;
      this.ad = var1.ad;
      this.ah = var1.ah;
      this.ab = var1.ab;
      this.ai = var1.ai;
      this.as = var1.as;
      this.ay = var1.ay;
      this.aj = var1.aj;
      this.av = var1.av;
      this.aw = var1.aw;
      this.an = var1.an;
      this.ak = var1.ak;
      this.bn = var1.bn;
      this.bf = var1.bf;
      this.bx = var1.bx;
      this.bm = var1.bm;
      this.bh = var1.bh;
      this.bd = var1.bd;
      this.bs = var1.bs;
      this.bw = var1.bw;
   }

   public void az() {
      for(int var1 = 0; var1 < this.am; ++var1) {
         int var2 = this.af[var1];
         this.af[var1] = this.ax[var1];
         this.ax[var1] = -var2;
      }

      this.aw();
   }

   public jv at(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.an();
      int var7 = var2 + this.bp;
      int var8 = var2 + this.by;
      int var9 = var4 + this.bi;
      int var10 = var4 + this.bb;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            jv var11;
            if (var5) {
               var11 = new jv();
               var11.am = this.am;
               var11.at = this.at;
               var11.ao = this.ao;
               var11.ax = this.ax;
               var11.af = this.af;
               var11.au = this.au;
               var11.ar = this.ar;
               var11.al = this.al;
               var11.ad = this.ad;
               var11.ah = this.ah;
               var11.ap = this.ap;
               var11.ab = this.ab;
               var11.az = this.az;
               var11.aa = this.aa;
               var11.ai = this.ai;
               var11.as = this.as;
               var11.ay = this.ay;
               var11.aj = this.aj;
               var11.av = this.av;
               var11.aw = this.aw;
               var11.an = this.an;
               var11.ak = this.ak;
               var11.bn = this.bn;
               var11.bs = this.bs;
               var11.bw = this.bw;
               var11.aq = new int[var11.am];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var6 == 0) {
               for(var12 = 0; var12 < var11.am; ++var12) {
                  var13 = this.ax[var12] + var2;
                  var14 = this.af[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.aq[var12] = this.aq[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.am; ++var12) {
                  var13 = (-this.aq[var12] << 16) / (this.ev * -1141910865);
                  if (var13 < var6) {
                     var14 = this.ax[var12] + var2;
                     var15 = this.af[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.aq[var12] = this.aq[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.aw();
            return var11;
         }
      } else {
         return this;
      }
   }

   static void cb(jv var0, jv var1, int var2, int var3, int var4, boolean var5) {
      var0.an();
      var0.av();
      var1.an();
      var1.av();
      ++bz;
      int var6 = 0;
      int[] var7 = var1.ax;
      int var8 = var1.am;

      int var9;
      for(var9 = 0; var9 < var0.am; ++var9) {
         jc var10 = var0.bf[var9];
         if (var10.am * -608243259 != 0) {
            int var11 = var0.aq[var9] - var3;
            if (var11 <= var1.bj) {
               int var12 = var0.ax[var9] - var2;
               if (var12 >= var1.bp && var12 <= var1.by) {
                  int var13 = var0.af[var9] - var4;
                  if (var13 >= var1.bi && var13 <= var1.bb) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        jc var15 = var1.bf[var14];
                        if (var12 == var7[var14] && var13 == var1.af[var14] && var11 == var1.aq[var14] && var15.am * -608243259 != 0) {
                           if (var0.bm == null) {
                              var0.bm = new jc[var0.am];
                           }

                           if (var1.bm == null) {
                              var1.bm = new jc[var8];
                           }

                           jc var16 = var0.bm[var9];
                           if (var16 == null) {
                              var16 = var0.bm[var9] = new jc(var10);
                           }

                           jc var17 = var1.bm[var14];
                           if (var17 == null) {
                              var17 = var1.bm[var14] = new jc(var15);
                           }

                           var16.ac += var15.ac * 1;
                           var16.ae += var15.ae * 1;
                           var16.ag += var15.ag * 1;
                           var16.am += var15.am * 1;
                           var17.ac += var10.ac * 1;
                           var17.ae += var10.ae * 1;
                           var17.ag += var10.ag * 1;
                           var17.am += var10.am * 1;
                           ++var6;
                           bg[var9] = bz;
                           bl[var14] = bz;
                        }
                     }
                  }
               }
            }
         }
      }

      if (var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.at; ++var9) {
            if (bg[var0.au[var9]] == bz && bg[var0.ar[var9]] == bz && bg[var0.al[var9]] == bz) {
               if (var0.ad == null) {
                  var0.ad = new byte[var0.at];
               }

               var0.ad[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.at; ++var9) {
            if (bl[var1.au[var9]] == bz && bl[var1.ar[var9]] == bz && bl[var1.al[var9]] == bz) {
               if (var1.ad == null) {
                  var1.ad = new byte[var1.at];
               }

               var1.ad[var9] = 2;
            }
         }

      }
   }

   public void ao(short var1, short var2) {
      for(int var3 = 0; var3 < this.at; ++var3) {
         if (this.az[var3] == var1) {
            this.az[var3] = var2;
         }
      }

   }

   public void cj(short var1, short var2) {
      if (this.aa != null) {
         for(int var3 = 0; var3 < this.at; ++var3) {
            if (this.aa[var3] == var1) {
               this.aa[var3] = var2;
            }
         }

      }
   }

   public void ay() {
      int var1;
      for(var1 = 0; var1 < this.am; ++var1) {
         this.af[var1] = -this.af[var1];
      }

      for(var1 = 0; var1 < this.at; ++var1) {
         int var2 = this.au[var1];
         this.au[var1] = this.al[var1];
         this.al[var1] = var2;
      }

      this.aw();
   }

   public void aj(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.am; ++var4) {
         this.ax[var4] = this.ax[var4] * var1 / 128;
         this.aq[var4] = this.aq[var4] * var2 / 128;
         this.af[var4] = this.af[var4] * var3 / 128;
      }

      this.aw();
   }

   public void av() {
      if (this.bf == null) {
         this.bf = new jc[this.am];

         int var1;
         for(var1 = 0; var1 < this.am; ++var1) {
            this.bf[var1] = new jc();
         }

         for(var1 = 0; var1 < this.at; ++var1) {
            int var2 = this.au[var1];
            int var3 = this.ar[var1];
            int var4 = this.al[var1];
            int var5 = this.ax[var3] - this.ax[var2];
            int var6 = this.aq[var3] - this.aq[var2];
            int var7 = this.af[var3] - this.af[var2];
            int var8 = this.ax[var4] - this.ax[var2];
            int var9 = this.aq[var4] - this.aq[var2];
            int var10 = this.af[var4] - this.af[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if (this.ad == null) {
               var15 = 0;
            } else {
               var15 = this.ad[var1];
            }

            if (var15 == 0) {
               jc var16 = this.bf[var2];
               var16.ac += var11 * -1490746749;
               var16.ae += var12 * 710137693;
               var16.ag += var13 * 1633223823;
               var16.am += 1341089037;
               var16 = this.bf[var3];
               var16.ac += var11 * -1490746749;
               var16.ae += var12 * 710137693;
               var16.ag += var13 * 1633223823;
               var16.am += 1341089037;
               var16 = this.bf[var4];
               var16.ac += var11 * -1490746749;
               var16.ae += var12 * 710137693;
               var16.ag += var13 * 1633223823;
               var16.am += 1341089037;
            } else if (var15 == 1) {
               if (this.bx == null) {
                  this.bx = new js[this.at];
               }

               js var17 = this.bx[var1] = new js();
               var17.ac = var11 * 1196111171;
               var17.ae = var12 * -30341993;
               var17.ag = var13 * -1000540781;
            }
         }

      }
   }

   public void as(short var1, short var2) {
      if (this.aa != null) {
         for(int var3 = 0; var3 < this.at; ++var3) {
            if (this.aa[var3] == var1) {
               this.aa[var3] = var2;
            }
         }

      }
   }

   void an() {
      if (!this.ba) {
         this.ev = 0;
         this.bj = 0;
         this.bp = 999999;
         this.by = -999999;
         this.bb = -99999;
         this.bi = 99999;

         for(int var1 = 0; var1 < this.am; ++var1) {
            int var2 = this.ax[var1];
            int var3 = this.aq[var1];
            int var4 = this.af[var1];
            if (var2 < this.bp) {
               this.bp = var2;
            }

            if (var2 > this.by) {
               this.by = var2;
            }

            if (var4 < this.bi) {
               this.bi = var4;
            }

            if (var4 > this.bb) {
               this.bb = var4;
            }

            if (-var3 > this.ev * -1141910865) {
               this.ev = -var3 * -2091858865;
            }

            if (var3 > this.bj) {
               this.bj = var3;
            }
         }

         this.ba = true;
      }
   }

   static void ak(jv var0, jv var1, int var2, int var3, int var4, boolean var5) {
      var0.an();
      var0.av();
      var1.an();
      var1.av();
      ++bz;
      int var6 = 0;
      int[] var7 = var1.ax;
      int var8 = var1.am;

      int var9;
      for(var9 = 0; var9 < var0.am; ++var9) {
         jc var10 = var0.bf[var9];
         if (var10.am * -608243259 != 0) {
            int var11 = var0.aq[var9] - var3;
            if (var11 <= var1.bj) {
               int var12 = var0.ax[var9] - var2;
               if (var12 >= var1.bp && var12 <= var1.by) {
                  int var13 = var0.af[var9] - var4;
                  if (var13 >= var1.bi && var13 <= var1.bb) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        jc var15 = var1.bf[var14];
                        if (var12 == var7[var14] && var13 == var1.af[var14] && var11 == var1.aq[var14] && var15.am * -608243259 != 0) {
                           if (var0.bm == null) {
                              var0.bm = new jc[var0.am];
                           }

                           if (var1.bm == null) {
                              var1.bm = new jc[var8];
                           }

                           jc var16 = var0.bm[var9];
                           if (var16 == null) {
                              var16 = var0.bm[var9] = new jc(var10);
                           }

                           jc var17 = var1.bm[var14];
                           if (var17 == null) {
                              var17 = var1.bm[var14] = new jc(var15);
                           }

                           var16.ac += var15.ac * 1;
                           var16.ae += var15.ae * 1;
                           var16.ag += var15.ag * 1;
                           var16.am += var15.am * 1;
                           var17.ac += var10.ac * 1;
                           var17.ae += var10.ae * 1;
                           var17.ag += var10.ag * 1;
                           var17.am += var10.am * 1;
                           ++var6;
                           bg[var9] = bz;
                           bl[var14] = bz;
                        }
                     }
                  }
               }
            }
         }
      }

      if (var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.at; ++var9) {
            if (bg[var0.au[var9]] == bz && bg[var0.ar[var9]] == bz && bg[var0.al[var9]] == bz) {
               if (var0.ad == null) {
                  var0.ad = new byte[var0.at];
               }

               var0.ad[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.at; ++var9) {
            if (bl[var1.au[var9]] == bz && bl[var1.ar[var9]] == bz && bl[var1.al[var9]] == bz) {
               if (var1.ad == null) {
                  var1.ad = new byte[var1.at];
               }

               var1.ad[var9] = 2;
            }
         }

      }
   }

   public jv br() {
      jv var1 = new jv();
      if (this.ad != null) {
         var1.ad = new byte[this.at];

         for(int var2 = 0; var2 < this.at; ++var2) {
            var1.ad[var2] = this.ad[var2];
         }
      }

      var1.am = this.am;
      var1.at = this.at;
      var1.ao = this.ao;
      var1.ax = this.ax;
      var1.aq = this.aq;
      var1.af = this.af;
      var1.au = this.au;
      var1.ar = this.ar;
      var1.al = this.al;
      var1.ah = this.ah;
      var1.ap = this.ap;
      var1.ab = this.ab;
      var1.az = this.az;
      var1.aa = this.aa;
      var1.ai = this.ai;
      var1.as = this.as;
      var1.ay = this.ay;
      var1.aj = this.aj;
      var1.av = this.av;
      var1.aw = this.aw;
      var1.an = this.an;
      var1.ak = this.ak;
      var1.bn = this.bn;
      var1.bf = this.bf;
      var1.bx = this.bx;
      var1.bs = this.bs;
      var1.bw = this.bw;
      return var1;
   }

   static final int bh(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   public static jv bx(po var0, int var1, int var2) {
      byte[] var3 = var0.bt(var1, var2, (byte)-77);
      return var3 == null ? null : new jv(var3);
   }

   public void cg(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.am; ++var4) {
         this.ax[var4] = this.ax[var4] * var1 / 128;
         this.aq[var4] = this.aq[var4] * var2 / -598053664;
         this.af[var4] = this.af[var4] * var3 / 128;
      }

      this.aw();
   }

   static {
      bu = jw.am;
      br = jw.ax;
   }

   public final jm bn(int var1, int var2, int var3, int var4, int var5) {
      this.av();
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var7 = var2 * var6 >> 8;
      jm var8 = new jm();
      var8.az = new int[this.at];
      var8.aa = new int[this.at];
      var8.ai = new int[this.at];
      if (this.ao > 0 && this.ab != null) {
         int[] var9 = new int[this.ao];

         int var10;
         for(var10 = 0; var10 < this.at; ++var10) {
            if (this.ab[var10] != -1) {
               ++var9[this.ab[var10] & 255];
            }
         }

         var8.aw = 0;

         for(var10 = 0; var10 < this.ao; ++var10) {
            if (var9[var10] > 0 && this.as[var10] == 0) {
               ++var8.aw;
            }
         }

         var8.an = new int[var8.aw];
         var8.ak = new int[var8.aw];
         var8.bn = new int[var8.aw];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.ao; ++var11) {
            if (var9[var11] > 0 && this.as[var11] == 0) {
               var8.an[var10] = this.ay[var11] & '\uffff';
               var8.ak[var10] = this.aj[var11] & '\uffff';
               var8.bn[var10] = this.av[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.ay = new byte[this.at];

         for(var11 = 0; var11 < this.at; ++var11) {
            if (this.ab[var11] != -1) {
               var8.ay[var11] = (byte)var9[this.ab[var11] & 255];
            } else {
               var8.ay[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.at; ++var16) {
         byte var17;
         if (this.ad == null) {
            var17 = 0;
         } else {
            var17 = this.ad[var16];
         }

         byte var18;
         if (this.ap == null) {
            var18 = 0;
         } else {
            var18 = this.ap[var16];
         }

         short var12;
         if (this.aa == null) {
            var12 = -1;
         } else {
            var12 = this.aa[var16];
         }

         if (var18 == -2) {
            var17 = 3;
         }

         if (var18 == -1) {
            var17 = 2;
         }

         jc var13;
         int var14;
         js var19;
         if (var12 == -1) {
            if (var17 != 0) {
               if (var17 == 1) {
                  var19 = this.bx[var16];
                  var14 = var1 + (var3 * var19.ac * 918683499 + var4 * var19.ae * -385696985 + var5 * var19.ag * 184381595) / (var7 + var7 / 2);
                  var8.az[var16] = bh(this.az[var16] & '\uffff', var14);
                  var8.ai[var16] = -1;
               } else if (var17 == 3) {
                  var8.az[var16] = 128;
                  var8.ai[var16] = -1;
               } else {
                  var8.ai[var16] = -2;
               }
            } else {
               int var15 = this.az[var16] & '\uffff';
               if (this.bm != null && this.bm[this.au[var16]] != null) {
                  var13 = this.bm[this.au[var16]];
               } else {
                  var13 = this.bf[this.au[var16]];
               }

               var14 = var1 + (var3 * var13.ac * -1528767445 + var4 * var13.ae * -1043057419 + var5 * var13.ag * 1715968623) / (var7 * var13.am * -608243259);
               var8.az[var16] = bh(var15, var14);
               if (this.bm != null && this.bm[this.ar[var16]] != null) {
                  var13 = this.bm[this.ar[var16]];
               } else {
                  var13 = this.bf[this.ar[var16]];
               }

               var14 = var1 + (var3 * var13.ac * -1528767445 + var4 * var13.ae * -1043057419 + var5 * var13.ag * 1715968623) / (var7 * var13.am * -608243259);
               var8.aa[var16] = bh(var15, var14);
               if (this.bm != null && this.bm[this.al[var16]] != null) {
                  var13 = this.bm[this.al[var16]];
               } else {
                  var13 = this.bf[this.al[var16]];
               }

               var14 = var1 + (var3 * var13.ac * -1528767445 + var4 * var13.ae * -1043057419 + var5 * var13.ag * 1715968623) / (var7 * var13.am * -608243259);
               var8.ai[var16] = bh(var15, var14);
            }
         } else if (var17 != 0) {
            if (var17 == 1) {
               var19 = this.bx[var16];
               var14 = var1 + (var3 * var19.ac * 918683499 + var4 * var19.ae * -385696985 + var5 * var19.ag * 184381595) / (var7 + var7 / 2);
               var8.az[var16] = bd(var14);
               var8.ai[var16] = -1;
            } else {
               var8.ai[var16] = -2;
            }
         } else {
            if (this.bm != null && this.bm[this.au[var16]] != null) {
               var13 = this.bm[this.au[var16]];
            } else {
               var13 = this.bf[this.au[var16]];
            }

            var14 = var1 + (var3 * var13.ac * -1528767445 + var4 * var13.ae * -1043057419 + var5 * var13.ag * 1715968623) / (var7 * var13.am * -608243259);
            var8.az[var16] = bd(var14);
            if (this.bm != null && this.bm[this.ar[var16]] != null) {
               var13 = this.bm[this.ar[var16]];
            } else {
               var13 = this.bf[this.ar[var16]];
            }

            var14 = var1 + (var3 * var13.ac * -1528767445 + var4 * var13.ae * -1043057419 + var5 * var13.ag * 1715968623) / (var7 * var13.am * -608243259);
            var8.aa[var16] = bd(var14);
            if (this.bm != null && this.bm[this.al[var16]] != null) {
               var13 = this.bm[this.al[var16]];
            } else {
               var13 = this.bf[this.al[var16]];
            }

            var14 = var1 + (var3 * var13.ac * -1528767445 + var4 * var13.ae * -1043057419 + var5 * var13.ag * 1715968623) / (var7 * var13.am * -608243259);
            var8.ai[var16] = bd(var14);
         }
      }

      this.au();
      var8.at = this.am;
      var8.au = this.ax;
      var8.ar = this.aq;
      var8.al = this.af;
      var8.ad = this.at;
      var8.ah = this.au;
      var8.ap = this.ar;
      var8.ab = this.al;
      var8.ao = this.ah;
      var8.as = this.ap;
      var8.av = this.ai;
      var8.bh = this.ak;
      var8.bd = this.bn;
      var8.aj = this.aa;
      var8.bx = this.bh;
      var8.bf = this.bd;
      return var8;
   }

   public static jv bm(po var0, int var1, int var2) {
      byte[] var3 = var0.bt(var1, var2, (byte)-17);
      return var3 == null ? null : new jv(var3);
   }

   public static jv bs(po var0, int var1, int var2) {
      byte[] var3 = var0.bt(var1, var2, (byte)66);
      return var3 == null ? null : new jv(var3);
   }

   public static jv bw(po var0, int var1, int var2) {
      byte[] var3 = var0.bt(var1, var2, (byte)21);
      return var3 == null ? null : new jv(var3);
   }

   void ba(byte[] var1) {
      vf var2 = new vf(var1);
      vf var3 = new vf(var1);
      vf var4 = new vf(var1);
      vf var5 = new vf(var1);
      vf var6 = new vf(var1);
      vf var7 = new vf(var1);
      vf var8 = new vf(var1);
      var2.au = (var1.length - 26) * 884817707;
      int var9 = var2.ct(-1382232339);
      int var10 = var2.ct(-1593232501);
      int var11 = var2.cv(952452697);
      int var12 = var2.cv(952452697);
      int var13 = var2.cv(952452697);
      int var14 = var2.cv(952452697);
      int var15 = var2.cv(952452697);
      int var16 = var2.cv(952452697);
      int var17 = var2.cv(952452697);
      int var18 = var2.cv(952452697);
      int var19 = var2.ct(-1424858053);
      int var20 = var2.ct(-1735585238);
      int var21 = var2.ct(-1447311134);
      int var22 = var2.ct(-1438346423);
      int var23 = var2.ct(-1344878694);
      int var24 = var2.ct(-2059911607);
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28;
      if (var11 > 0) {
         this.as = new byte[var11];
         var2.au = 0;

         for(var28 = 0; var28 < var11; ++var28) {
            byte var29 = this.as[var28] = var2.cg((short)-4940);
            if (var29 == 0) {
               ++var25;
            }

            if (var29 >= 1 && var29 <= 3) {
               ++var26;
            }

            if (var29 == 2) {
               ++var27;
            }
         }
      }

      var28 = var11 + var9;
      int var30 = var28;
      if (var12 == 1) {
         var28 += var10;
      }

      int var31 = var28;
      var28 += var10;
      int var32 = var28;
      if (var13 == 435918641) {
         var28 += var10;
      }

      int var33 = var28;
      if (var15 == 1) {
         var28 += var10;
      }

      int var34 = var28;
      var28 += var24;
      int var35 = var28;
      if (var14 == 1) {
         var28 += var10;
      }

      int var36 = var28;
      var28 += var22;
      int var37 = var28;
      if (var16 == 1) {
         var28 += var10 * 2;
      }

      int var38 = var28;
      var28 += var23;
      int var39 = var28;
      var28 += var10 * 2;
      int var40 = var28;
      var28 += var19;
      int var41 = var28;
      var28 += var20;
      int var42 = var28;
      var28 += var21;
      int var43 = var28;
      var28 += var25 * 6;
      int var44 = var28;
      var28 += var26 * 6;
      int var45 = var28;
      var28 += var26 * 6;
      int var46 = var28;
      var28 += var26 * 2;
      int var47 = var28;
      var28 += var26;
      int var48 = var28;
      var28 += var26 * 2 + var27 * 2;
      this.am = var9;
      this.at = var10;
      this.ao = var11;
      this.ax = new int[var9];
      this.aq = new int[var9];
      this.af = new int[var9];
      this.au = new int[var10];
      this.ar = new int[var10];
      this.al = new int[var10];
      if (var17 == 1) {
         this.aw = new int[var9];
      }

      if (var12 == 1) {
         this.ad = new byte[var10];
      }

      if (var13 == 255) {
         this.ah = new byte[var10];
      } else {
         this.ai = (byte)var13;
      }

      if (var14 == 1) {
         this.ap = new byte[var10];
      }

      if (var15 == 1) {
         this.an = new int[var10];
      }

      if (var16 == 1) {
         this.aa = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.ab = new byte[var10];
      }

      if (var18 == 1) {
         this.bh = new int[var9][];
         this.bd = new int[var9][];
      }

      this.az = new short[var10];
      if (var11 > 0) {
         this.ay = new short[var11];
         this.aj = new short[var11];
         this.av = new short[var11];
      }

      var2.au = var11 * -1864458299;
      var3.au = var40 * 1987346503;
      var4.au = var41 * -804049551;
      var5.au = var42 * 1703717961;
      var6.au = var34 * 88027843;
      int var50 = 0;
      int var51 = 0;
      int var52 = 0;

      int var53;
      int var54;
      int var55;
      int var56;
      int var57;
      for(var53 = 0; var53 < var9; ++var53) {
         var54 = var2.cv(952452697);
         var55 = 0;
         if ((var54 & 1) != 0) {
            var55 = var3.ce(547267578);
         }

         var56 = 0;
         if ((var54 & 2) != 0) {
            var56 = var4.ce(1319313075);
         }

         var57 = 0;
         if ((var54 & 4) != 0) {
            var57 = var5.ce(350170549);
         }

         this.ax[var53] = var50 + var55;
         this.aq[var53] = var51 + var56;
         this.af[var53] = var52 + var57;
         var50 = this.ax[var53];
         var51 = this.aq[var53];
         var52 = this.af[var53];
         if (var17 == 1) {
            this.aw[var53] = var6.cv(952452697);
         }
      }

      if (var18 == 1) {
         for(var53 = 0; var53 < var9; ++var53) {
            var54 = var6.cv(952452697);
            this.bh[var53] = new int[var54];
            this.bd[var53] = new int[var54];

            for(var55 = 0; var55 < var54; ++var55) {
               this.bh[var53][var55] = var6.cv(952452697);
               this.bd[var53][var55] = var6.cv(952452697);
            }
         }
      }

      var2.au = var39 * -1864458299;
      var3.au = var30 * -1282316503;
      var4.au = var32 * -1864458299;
      var5.au = var35 * 524987662;
      var6.au = var33 * -260004882;
      var7.au = var37 * -1081139919;
      var8.au = var38 * 1364059121;

      for(var53 = 0; var53 < var10; ++var53) {
         this.az[var53] = (short)var2.ct(-2103764167);
         if (var12 == 1) {
            this.ad[var53] = var3.cg((short)10105);
         }

         if (var13 == 255) {
            this.ah[var53] = var4.cg((short)26178);
         }

         if (var14 == 1) {
            this.ap[var53] = var5.cg((short)10695);
         }

         if (var15 == 1) {
            this.an[var53] = var6.cv(952452697);
         }

         if (var16 == 1) {
            this.aa[var53] = (short)(var7.ct(-2078430912) - 1);
         }

         if (this.ab != null && this.aa[var53] != -1) {
            this.ab[var53] = (byte)(var8.cv(952452697) - 1);
         }
      }

      var2.au = var36 * 1894445292;
      var3.au = var31 * -1241612144;
      var53 = 0;
      var54 = 0;
      var55 = 0;
      var56 = 0;

      int var58;
      for(var57 = 0; var57 < var10; ++var57) {
         var58 = var3.cv(952452697);
         if (var58 == 1) {
            var53 = var2.ce(-73898533) + var56;
            var54 = var2.ce(-348675664) + var53;
            var55 = var2.ce(-136852083) + var54;
            var56 = var55;
            this.au[var57] = var53;
            this.ar[var57] = var54;
            this.al[var57] = var55;
         }

         if (var58 == 2) {
            var54 = var55;
            var55 = var2.ce(1555715850) + var56;
            var56 = var55;
            this.au[var57] = var53;
            this.ar[var57] = var54;
            this.al[var57] = var55;
         }

         if (var58 == 3) {
            var53 = var55;
            var55 = var2.ce(-411477258) + var56;
            var56 = var55;
            this.au[var57] = var53;
            this.ar[var57] = var54;
            this.al[var57] = var55;
         }

         if (var58 == 4) {
            int var59 = var53;
            var53 = var54;
            var54 = var59;
            var55 = var2.ce(67749243) + var56;
            var56 = var55;
            this.au[var57] = var53;
            this.ar[var57] = var59;
            this.al[var57] = var55;
         }
      }

      var2.au = var43 * -1700062112;
      var3.au = var44 * 368417021;
      var4.au = var45 * -1864458299;
      var5.au = var46 * -1864458299;
      var6.au = var47 * -1864458299;
      var7.au = var48 * -1615273773;

      for(var57 = 0; var57 < var11; ++var57) {
         var58 = this.as[var57] & 255;
         if (var58 == 0) {
            this.ay[var57] = (short)var2.ct(-1840129513);
            this.aj[var57] = (short)var2.ct(-1553546987);
            this.av[var57] = (short)var2.ct(-1959534896);
         }
      }

      var2.au = var28 * -1864458299;
      var57 = var2.cv(952452697);
      if (var57 != 0) {
         new kj();
         var2.ct(-1851817488);
         var2.ct(-1671338239);
         var2.ct(-1643100888);
         var2.cz(-1734056172);
      }

   }

   void bj(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      vf var4 = new vf(var1);
      vf var5 = new vf(var1);
      vf var6 = new vf(var1);
      vf var7 = new vf(var1);
      vf var8 = new vf(var1);
      var4.au = (var1.length - 23) * -1864458299;
      int var9 = var4.ct(-1586789494);
      int var10 = var4.ct(-1508570823);
      int var11 = var4.cv(952452697);
      int var12 = var4.cv(952452697);
      int var13 = var4.cv(952452697);
      int var14 = var4.cv(952452697);
      int var15 = var4.cv(952452697);
      int var16 = var4.cv(952452697);
      int var17 = var4.cv(952452697);
      int var18 = var4.ct(-1705862375);
      int var19 = var4.ct(-1536260469);
      int var20 = var4.ct(-1715579268);
      int var21 = var4.ct(-1332968759);
      int var22 = var4.ct(-1952690346);
      byte var23 = 0;
      int var47 = var23 + var9;
      int var25 = var47;
      var47 += var10;
      int var26 = var47;
      if (var13 == 255) {
         var47 += var10;
      }

      int var27 = var47;
      if (var15 == 1) {
         var47 += var10;
      }

      int var28 = var47;
      if (var12 == 1) {
         var47 += var10;
      }

      int var29 = var47;
      var47 += var22;
      int var30 = var47;
      if (var14 == 1) {
         var47 += var10;
      }

      int var31 = var47;
      var47 += var21;
      int var32 = var47;
      var47 += var10 * 2;
      int var33 = var47;
      var47 += var11 * 6;
      int var34 = var47;
      var47 += var18;
      int var35 = var47;
      var47 += var19;
      int var10000 = var47 + var20;
      this.am = var9;
      this.at = var10;
      this.ao = var11;
      this.ax = new int[var9];
      this.aq = new int[var9];
      this.af = new int[var9];
      this.au = new int[var10];
      this.ar = new int[var10];
      this.al = new int[var10];
      if (var11 > 0) {
         this.as = new byte[var11];
         this.ay = new short[var11];
         this.aj = new short[var11];
         this.av = new short[var11];
      }

      if (var16 == 1) {
         this.aw = new int[var9];
      }

      if (var12 == 1) {
         this.ad = new byte[var10];
         this.ab = new byte[var10];
         this.aa = new short[var10];
      }

      if (var13 == 255) {
         this.ah = new byte[var10];
      } else {
         this.ai = (byte)var13;
      }

      if (var14 == 1) {
         this.ap = new byte[var10];
      }

      if (var15 == 1) {
         this.an = new int[var10];
      }

      if (var17 == 1) {
         this.bh = new int[var9][];
         this.bd = new int[var9][];
      }

      this.az = new short[var10];
      var4.au = var23 * -1864458299;
      var5.au = var34 * -1864458299;
      var6.au = var35 * -1864458299;
      var7.au = var47 * -1864458299;
      var8.au = var29 * -1864458299;
      int var37 = 0;
      int var38 = 0;
      int var39 = 0;

      int var40;
      int var41;
      int var42;
      int var43;
      int var44;
      for(var40 = 0; var40 < var9; ++var40) {
         var41 = var4.cv(952452697);
         var42 = 0;
         if ((var41 & 1) != 0) {
            var42 = var5.ce(1172197407);
         }

         var43 = 0;
         if ((var41 & 2) != 0) {
            var43 = var6.ce(1045240741);
         }

         var44 = 0;
         if ((var41 & 4) != 0) {
            var44 = var7.ce(204669580);
         }

         this.ax[var40] = var37 + var42;
         this.aq[var40] = var38 + var43;
         this.af[var40] = var39 + var44;
         var37 = this.ax[var40];
         var38 = this.aq[var40];
         var39 = this.af[var40];
         if (var16 == 1) {
            this.aw[var40] = var8.cv(952452697);
         }
      }

      if (var17 == 1) {
         for(var40 = 0; var40 < var9; ++var40) {
            var41 = var8.cv(952452697);
            this.bh[var40] = new int[var41];
            this.bd[var40] = new int[var41];

            for(var42 = 0; var42 < var41; ++var42) {
               this.bh[var40][var42] = var8.cv(952452697);
               this.bd[var40][var42] = var8.cv(952452697);
            }
         }
      }

      var4.au = var32 * -1864458299;
      var5.au = var28 * -1864458299;
      var6.au = var26 * -1864458299;
      var7.au = var30 * -1864458299;
      var8.au = var27 * -1864458299;

      for(var40 = 0; var40 < var10; ++var40) {
         this.az[var40] = (short)var4.ct(-1636302003);
         if (var12 == 1) {
            var41 = var5.cv(952452697);
            if ((var41 & 1) == 1) {
               this.ad[var40] = 1;
               var2 = true;
            } else {
               this.ad[var40] = 0;
            }

            if ((var41 & 2) == 2) {
               this.ab[var40] = (byte)(var41 >> 2);
               this.aa[var40] = this.az[var40];
               this.az[var40] = 127;
               if (this.aa[var40] != -1) {
                  var3 = true;
               }
            } else {
               this.ab[var40] = -1;
               this.aa[var40] = -1;
            }
         }

         if (var13 == 255) {
            this.ah[var40] = var6.cg((short)-3909);
         }

         if (var14 == 1) {
            this.ap[var40] = var7.cg((short)-20615);
         }

         if (var15 == 1) {
            this.an[var40] = var8.cv(952452697);
         }
      }

      var4.au = var31 * -1864458299;
      var5.au = var25 * -1864458299;
      var40 = 0;
      var41 = 0;
      var42 = 0;
      var43 = 0;

      int var45;
      int var46;
      for(var44 = 0; var44 < var10; ++var44) {
         var45 = var5.cv(952452697);
         if (var45 == 1) {
            var40 = var4.ce(58712866) + var43;
            var41 = var4.ce(1265116999) + var40;
            var42 = var4.ce(1247782652) + var41;
            var43 = var42;
            this.au[var44] = var40;
            this.ar[var44] = var41;
            this.al[var44] = var42;
         }

         if (var45 == 2) {
            var41 = var42;
            var42 = var4.ce(1533335556) + var43;
            var43 = var42;
            this.au[var44] = var40;
            this.ar[var44] = var41;
            this.al[var44] = var42;
         }

         if (var45 == 3) {
            var40 = var42;
            var42 = var4.ce(-89499485) + var43;
            var43 = var42;
            this.au[var44] = var40;
            this.ar[var44] = var41;
            this.al[var44] = var42;
         }

         if (var45 == 4) {
            var46 = var40;
            var40 = var41;
            var41 = var46;
            var42 = var4.ce(684448436) + var43;
            var43 = var42;
            this.au[var44] = var40;
            this.ar[var44] = var46;
            this.al[var44] = var42;
         }
      }

      var4.au = var33 * -1864458299;

      for(var44 = 0; var44 < var11; ++var44) {
         this.as[var44] = 0;
         this.ay[var44] = (short)var4.ct(-1983593101);
         this.aj[var44] = (short)var4.ct(-1674278651);
         this.av[var44] = (short)var4.ct(-1901756227);
      }

      if (this.ab != null) {
         boolean var48 = false;

         for(var45 = 0; var45 < var10; ++var45) {
            var46 = this.ab[var45] & 255;
            if (var46 != 255) {
               if ((this.ay[var46] & '\uffff') == this.au[var45] && (this.aj[var46] & '\uffff') == this.ar[var45] && (this.av[var46] & '\uffff') == this.al[var45]) {
                  this.ab[var45] = -1;
               } else {
                  var48 = true;
               }
            }
         }

         if (!var48) {
            this.ab = null;
         }
      }

      if (!var3) {
         this.aa = null;
      }

      if (!var2) {
         this.ad = null;
      }

   }

   void bp(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      vf var4 = new vf(var1);
      vf var5 = new vf(var1);
      vf var6 = new vf(var1);
      vf var7 = new vf(var1);
      vf var8 = new vf(var1);
      var4.au = (var1.length - 23) * -475426971;
      int var9 = var4.ct(-2128386280);
      int var10 = var4.ct(-2119938030);
      int var11 = var4.cv(952452697);
      int var12 = var4.cv(952452697);
      int var13 = var4.cv(952452697);
      int var14 = var4.cv(952452697);
      int var15 = var4.cv(952452697);
      int var16 = var4.cv(952452697);
      int var17 = var4.cv(952452697);
      int var18 = var4.ct(-1385886619);
      int var19 = var4.ct(-1360679928);
      int var20 = var4.ct(-1389300029);
      int var21 = var4.ct(-1670893436);
      int var22 = var4.ct(-1731328854);
      byte var23 = 0;
      int var47 = var23 + var9;
      int var25 = var47;
      var47 += var10;
      int var26 = var47;
      if (var13 == -1904567273) {
         var47 += var10;
      }

      int var27 = var47;
      if (var15 == 1) {
         var47 += var10;
      }

      int var28 = var47;
      if (var12 == 1) {
         var47 += var10;
      }

      int var29 = var47;
      var47 += var22;
      int var30 = var47;
      if (var14 == 1) {
         var47 += var10;
      }

      int var31 = var47;
      var47 += var21;
      int var32 = var47;
      var47 += var10 * 2;
      int var33 = var47;
      var47 += var11 * 6;
      int var34 = var47;
      var47 += var18;
      int var35 = var47;
      var47 += var19;
      int var10000 = var47 + var20;
      this.am = var9;
      this.at = var10;
      this.ao = var11;
      this.ax = new int[var9];
      this.aq = new int[var9];
      this.af = new int[var9];
      this.au = new int[var10];
      this.ar = new int[var10];
      this.al = new int[var10];
      if (var11 > 0) {
         this.as = new byte[var11];
         this.ay = new short[var11];
         this.aj = new short[var11];
         this.av = new short[var11];
      }

      if (var16 == 1) {
         this.aw = new int[var9];
      }

      if (var12 == 1) {
         this.ad = new byte[var10];
         this.ab = new byte[var10];
         this.aa = new short[var10];
      }

      if (var13 == 1372357064) {
         this.ah = new byte[var10];
      } else {
         this.ai = (byte)var13;
      }

      if (var14 == 1) {
         this.ap = new byte[var10];
      }

      if (var15 == 1) {
         this.an = new int[var10];
      }

      if (var17 == 1) {
         this.bh = new int[var9][];
         this.bd = new int[var9][];
      }

      this.az = new short[var10];
      var4.au = var23 * -667854163;
      var5.au = var34 * -747421349;
      var6.au = var35 * -1504621762;
      var7.au = var47 * 1808808970;
      var8.au = var29 * -1864458299;
      int var37 = 0;
      int var38 = 0;
      int var39 = 0;

      int var40;
      int var41;
      int var42;
      int var43;
      int var44;
      for(var40 = 0; var40 < var9; ++var40) {
         var41 = var4.cv(952452697);
         var42 = 0;
         if ((var41 & 1) != 0) {
            var42 = var5.ce(39125162);
         }

         var43 = 0;
         if ((var41 & 2) != 0) {
            var43 = var6.ce(1665207813);
         }

         var44 = 0;
         if ((var41 & 4) != 0) {
            var44 = var7.ce(-313172041);
         }

         this.ax[var40] = var37 + var42;
         this.aq[var40] = var38 + var43;
         this.af[var40] = var39 + var44;
         var37 = this.ax[var40];
         var38 = this.aq[var40];
         var39 = this.af[var40];
         if (var16 == 1) {
            this.aw[var40] = var8.cv(952452697);
         }
      }

      if (var17 == 1) {
         for(var40 = 0; var40 < var9; ++var40) {
            var41 = var8.cv(952452697);
            this.bh[var40] = new int[var41];
            this.bd[var40] = new int[var41];

            for(var42 = 0; var42 < var41; ++var42) {
               this.bh[var40][var42] = var8.cv(952452697);
               this.bd[var40][var42] = var8.cv(952452697);
            }
         }
      }

      var4.au = var32 * -1864458299;
      var5.au = var28 * -1359824998;
      var6.au = var26 * -1864458299;
      var7.au = var30 * -1864458299;
      var8.au = var27 * -1864458299;

      for(var40 = 0; var40 < var10; ++var40) {
         this.az[var40] = (short)var4.ct(-1552882871);
         if (var12 == 1) {
            var41 = var5.cv(952452697);
            if ((var41 & 1) == 1) {
               this.ad[var40] = 1;
               var2 = true;
            } else {
               this.ad[var40] = 0;
            }

            if ((var41 & 2) == 2) {
               this.ab[var40] = (byte)(var41 >> 2);
               this.aa[var40] = this.az[var40];
               this.az[var40] = 127;
               if (this.aa[var40] != -1) {
                  var3 = true;
               }
            } else {
               this.ab[var40] = -1;
               this.aa[var40] = -1;
            }
         }

         if (var13 == 255) {
            this.ah[var40] = var6.cg((short)8413);
         }

         if (var14 == 1) {
            this.ap[var40] = var7.cg((short)24400);
         }

         if (var15 == 1) {
            this.an[var40] = var8.cv(952452697);
         }
      }

      var4.au = var31 * -1864458299;
      var5.au = var25 * 1089976555;
      var40 = 0;
      var41 = 0;
      var42 = 0;
      var43 = 0;

      int var45;
      int var46;
      for(var44 = 0; var44 < var10; ++var44) {
         var45 = var5.cv(952452697);
         if (var45 == 1) {
            var40 = var4.ce(1564192605) + var43;
            var41 = var4.ce(2031615599) + var40;
            var42 = var4.ce(2042379372) + var41;
            var43 = var42;
            this.au[var44] = var40;
            this.ar[var44] = var41;
            this.al[var44] = var42;
         }

         if (var45 == 2) {
            var41 = var42;
            var42 = var4.ce(1254787717) + var43;
            var43 = var42;
            this.au[var44] = var40;
            this.ar[var44] = var41;
            this.al[var44] = var42;
         }

         if (var45 == 3) {
            var40 = var42;
            var42 = var4.ce(-306362027) + var43;
            var43 = var42;
            this.au[var44] = var40;
            this.ar[var44] = var41;
            this.al[var44] = var42;
         }

         if (var45 == 4) {
            var46 = var40;
            var40 = var41;
            var41 = var46;
            var42 = var4.ce(1844274123) + var43;
            var43 = var42;
            this.au[var44] = var40;
            this.ar[var44] = var46;
            this.al[var44] = var42;
         }
      }

      var4.au = var33 * -1864458299;

      for(var44 = 0; var44 < var11; ++var44) {
         this.as[var44] = 0;
         this.ay[var44] = (short)var4.ct(-1903639826);
         this.aj[var44] = (short)var4.ct(-1758937438);
         this.av[var44] = (short)var4.ct(-1999145231);
      }

      if (this.ab != null) {
         boolean var48 = false;

         for(var45 = 0; var45 < var10; ++var45) {
            var46 = this.ab[var45] & -67236924;
            if (var46 != -1061249184) {
               if ((this.ay[var46] & -1738956382) == this.au[var45] && (this.aj[var46] & -1752476158) == this.ar[var45] && (this.av[var46] & 535931377) == this.al[var45]) {
                  this.ab[var45] = -1;
               } else {
                  var48 = true;
               }
            }
         }

         if (!var48) {
            this.ab = null;
         }
      }

      if (!var3) {
         this.aa = null;
      }

      if (!var2) {
         this.ad = null;
      }

   }

   void by(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      vf var4 = new vf(var1);
      vf var5 = new vf(var1);
      vf var6 = new vf(var1);
      vf var7 = new vf(var1);
      vf var8 = new vf(var1);
      var4.au = (var1.length - 18) * -1864458299;
      int var9 = var4.ct(-1625520442);
      int var10 = var4.ct(-2101128074);
      int var11 = var4.cv(952452697);
      int var12 = var4.cv(952452697);
      int var13 = var4.cv(952452697);
      int var14 = var4.cv(952452697);
      int var15 = var4.cv(952452697);
      int var16 = var4.cv(952452697);
      int var17 = var4.ct(-1355767320);
      int var18 = var4.ct(-2056268993);
      int var19 = var4.ct(-2140331563);
      int var20 = var4.ct(-1377282729);
      byte var21 = 0;
      int var45 = var21 + var9;
      int var23 = var45;
      var45 += var10;
      int var24 = var45;
      if (var13 == 255) {
         var45 += var10;
      }

      int var25 = var45;
      if (var15 == 1) {
         var45 += var10;
      }

      int var26 = var45;
      if (var12 == 1) {
         var45 += var10;
      }

      int var27 = var45;
      if (var16 == 1) {
         var45 += var9;
      }

      int var28 = var45;
      if (var14 == 1) {
         var45 += var10;
      }

      int var29 = var45;
      var45 += var20;
      int var30 = var45;
      var45 += var10 * 2;
      int var31 = var45;
      var45 += var11 * 6;
      int var32 = var45;
      var45 += var17;
      int var33 = var45;
      var45 += var18;
      int var10000 = var45 + var19;
      this.am = var9;
      this.at = var10;
      this.ao = var11;
      this.ax = new int[var9];
      this.aq = new int[var9];
      this.af = new int[var9];
      this.au = new int[var10];
      this.ar = new int[var10];
      this.al = new int[var10];
      if (var11 > 0) {
         this.as = new byte[var11];
         this.ay = new short[var11];
         this.aj = new short[var11];
         this.av = new short[var11];
      }

      if (var16 == 1) {
         this.aw = new int[var9];
      }

      if (var12 == 1) {
         this.ad = new byte[var10];
         this.ab = new byte[var10];
         this.aa = new short[var10];
      }

      if (var13 == 2077659394) {
         this.ah = new byte[var10];
      } else {
         this.ai = (byte)var13;
      }

      if (var14 == 1) {
         this.ap = new byte[var10];
      }

      if (var15 == 1) {
         this.an = new int[var10];
      }

      this.az = new short[var10];
      var4.au = var21 * -1864458299;
      var5.au = var32 * -1864458299;
      var6.au = var33 * -1864458299;
      var7.au = var45 * -1864458299;
      var8.au = var27 * 1592605881;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.cv(952452697);
         var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.ce(1617788687);
         }

         var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.ce(773079109);
         }

         var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.ce(1536504494);
         }

         this.ax[var38] = var35 + var40;
         this.aq[var38] = var36 + var41;
         this.af[var38] = var37 + var42;
         var35 = this.ax[var38];
         var36 = this.aq[var38];
         var37 = this.af[var38];
         if (var16 == 1) {
            this.aw[var38] = var8.cv(952452697);
         }
      }

      var4.au = var30 * -2062511491;
      var5.au = var26 * -1864458299;
      var6.au = var24 * 1087746264;
      var7.au = var28 * 1015358320;
      var8.au = var25 * -1864458299;

      for(var38 = 0; var38 < var10; ++var38) {
         this.az[var38] = (short)var4.ct(-1787210531);
         if (var12 == 1) {
            var39 = var5.cv(952452697);
            if ((var39 & 1) == 1) {
               this.ad[var38] = 1;
               var2 = true;
            } else {
               this.ad[var38] = 0;
            }

            if ((var39 & 2) == 2) {
               this.ab[var38] = (byte)(var39 >> 2);
               this.aa[var38] = this.az[var38];
               this.az[var38] = 127;
               if (this.aa[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.ab[var38] = -1;
               this.aa[var38] = -1;
            }
         }

         if (var13 == 255) {
            this.ah[var38] = var6.cg((short)17594);
         }

         if (var14 == 1) {
            this.ap[var38] = var7.cg((short)-589);
         }

         if (var15 == 1) {
            this.an[var38] = var8.cv(952452697);
         }
      }

      var4.au = var29 * -475283102;
      var5.au = var23 * 1837430183;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.cv(952452697);
         if (var43 == 1) {
            var38 = var4.ce(525812611) + var41;
            var39 = var4.ce(88402883) + var38;
            var40 = var4.ce(1838235081) + var39;
            var41 = var40;
            this.au[var42] = var38;
            this.ar[var42] = var39;
            this.al[var42] = var40;
         }

         if (var43 == 2) {
            var39 = var40;
            var40 = var4.ce(687998345) + var41;
            var41 = var40;
            this.au[var42] = var38;
            this.ar[var42] = var39;
            this.al[var42] = var40;
         }

         if (var43 == 3) {
            var38 = var40;
            var40 = var4.ce(410204732) + var41;
            var41 = var40;
            this.au[var42] = var38;
            this.ar[var42] = var39;
            this.al[var42] = var40;
         }

         if (var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.ce(1260534419) + var41;
            var41 = var40;
            this.au[var42] = var38;
            this.ar[var42] = var44;
            this.al[var42] = var40;
         }
      }

      var4.au = var31 * 949312407;

      for(var42 = 0; var42 < var11; ++var42) {
         this.as[var42] = 0;
         this.ay[var42] = (short)var4.ct(-1757740893);
         this.aj[var42] = (short)var4.ct(-1490773750);
         this.av[var42] = (short)var4.ct(-1503567802);
      }

      if (this.ab != null) {
         boolean var46 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.ab[var43] & -961540662;
            if (var44 != 255) {
               if ((this.ay[var44] & 1609537083) == this.au[var43] && (this.aj[var44] & 1464107519) == this.ar[var43] && (this.av[var44] & '\uffff') == this.al[var43]) {
                  this.ab[var43] = -1;
               } else {
                  var46 = true;
               }
            }
         }

         if (!var46) {
            this.ab = null;
         }
      }

      if (!var3) {
         this.aa = null;
      }

      if (!var2) {
         this.ad = null;
      }

   }

   static final int bd(int var0) {
      if (var0 < 2) {
         var0 = 2;
      } else if (var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   void bi(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      vf var4 = new vf(var1);
      vf var5 = new vf(var1);
      vf var6 = new vf(var1);
      vf var7 = new vf(var1);
      vf var8 = new vf(var1);
      var4.au = (var1.length - 18) * -1864458299;
      int var9 = var4.ct(-2006900579);
      int var10 = var4.ct(-2041752203);
      int var11 = var4.cv(952452697);
      int var12 = var4.cv(952452697);
      int var13 = var4.cv(952452697);
      int var14 = var4.cv(952452697);
      int var15 = var4.cv(952452697);
      int var16 = var4.cv(952452697);
      int var17 = var4.ct(-1340756553);
      int var18 = var4.ct(-1716042962);
      int var19 = var4.ct(-1689457997);
      int var20 = var4.ct(-1945676820);
      byte var21 = 0;
      int var45 = var21 + var9;
      int var23 = var45;
      var45 += var10;
      int var24 = var45;
      if (var13 == 255) {
         var45 += var10;
      }

      int var25 = var45;
      if (var15 == 1) {
         var45 += var10;
      }

      int var26 = var45;
      if (var12 == 1) {
         var45 += var10;
      }

      int var27 = var45;
      if (var16 == 1) {
         var45 += var9;
      }

      int var28 = var45;
      if (var14 == 1) {
         var45 += var10;
      }

      int var29 = var45;
      var45 += var20;
      int var30 = var45;
      var45 += var10 * 2;
      int var31 = var45;
      var45 += var11 * 6;
      int var32 = var45;
      var45 += var17;
      int var33 = var45;
      var45 += var18;
      int var10000 = var45 + var19;
      this.am = var9;
      this.at = var10;
      this.ao = var11;
      this.ax = new int[var9];
      this.aq = new int[var9];
      this.af = new int[var9];
      this.au = new int[var10];
      this.ar = new int[var10];
      this.al = new int[var10];
      if (var11 > 0) {
         this.as = new byte[var11];
         this.ay = new short[var11];
         this.aj = new short[var11];
         this.av = new short[var11];
      }

      if (var16 == 1) {
         this.aw = new int[var9];
      }

      if (var12 == 1) {
         this.ad = new byte[var10];
         this.ab = new byte[var10];
         this.aa = new short[var10];
      }

      if (var13 == 1994388999) {
         this.ah = new byte[var10];
      } else {
         this.ai = (byte)var13;
      }

      if (var14 == 1) {
         this.ap = new byte[var10];
      }

      if (var15 == 1) {
         this.an = new int[var10];
      }

      this.az = new short[var10];
      var4.au = var21 * -1864458299;
      var5.au = var32 * -423225477;
      var6.au = var33 * -1864458299;
      var7.au = var45 * 1589408296;
      var8.au = var27 * 885358986;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.cv(952452697);
         var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.ce(751141070);
         }

         var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.ce(-171762777);
         }

         var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.ce(1833725803);
         }

         this.ax[var38] = var35 + var40;
         this.aq[var38] = var36 + var41;
         this.af[var38] = var37 + var42;
         var35 = this.ax[var38];
         var36 = this.aq[var38];
         var37 = this.af[var38];
         if (var16 == 1) {
            this.aw[var38] = var8.cv(952452697);
         }
      }

      var4.au = var30 * -1864458299;
      var5.au = var26 * -1864458299;
      var6.au = var24 * -1864458299;
      var7.au = var28 * -1864458299;
      var8.au = var25 * -1864458299;

      for(var38 = 0; var38 < var10; ++var38) {
         this.az[var38] = (short)var4.ct(-1641808477);
         if (var12 == 1) {
            var39 = var5.cv(952452697);
            if ((var39 & 1) == 1) {
               this.ad[var38] = 1;
               var2 = true;
            } else {
               this.ad[var38] = 0;
            }

            if ((var39 & 2) == 2) {
               this.ab[var38] = (byte)(var39 >> 2);
               this.aa[var38] = this.az[var38];
               this.az[var38] = (short)-982007550;
               if (this.aa[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.ab[var38] = -1;
               this.aa[var38] = -1;
            }
         }

         if (var13 == 1258728562) {
            this.ah[var38] = var6.cg((short)-6833);
         }

         if (var14 == 1) {
            this.ap[var38] = var7.cg((short)10484);
         }

         if (var15 == 1) {
            this.an[var38] = var8.cv(952452697);
         }
      }

      var4.au = var29 * -1864458299;
      var5.au = var23 * 892660423;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.cv(952452697);
         if (var43 == 1) {
            var38 = var4.ce(1828760325) + var41;
            var39 = var4.ce(888828171) + var38;
            var40 = var4.ce(1424472373) + var39;
            var41 = var40;
            this.au[var42] = var38;
            this.ar[var42] = var39;
            this.al[var42] = var40;
         }

         if (var43 == 2) {
            var39 = var40;
            var40 = var4.ce(1601739332) + var41;
            var41 = var40;
            this.au[var42] = var38;
            this.ar[var42] = var39;
            this.al[var42] = var40;
         }

         if (var43 == 3) {
            var38 = var40;
            var40 = var4.ce(-386040246) + var41;
            var41 = var40;
            this.au[var42] = var38;
            this.ar[var42] = var39;
            this.al[var42] = var40;
         }

         if (var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.ce(1458836818) + var41;
            var41 = var40;
            this.au[var42] = var38;
            this.ar[var42] = var44;
            this.al[var42] = var40;
         }
      }

      var4.au = var31 * -1864458299;

      for(var42 = 0; var42 < var11; ++var42) {
         this.as[var42] = 0;
         this.ay[var42] = (short)var4.ct(-1386068309);
         this.aj[var42] = (short)var4.ct(-1497593042);
         this.av[var42] = (short)var4.ct(-1505224717);
      }

      if (this.ab != null) {
         boolean var46 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.ab[var43] & 255;
            if (var44 != 255) {
               if ((this.ay[var44] & 709979889) == this.au[var43] && (this.aj[var44] & '\uffff') == this.ar[var43] && (this.av[var44] & 1384440506) == this.al[var43]) {
                  this.ab[var43] = -1;
               } else {
                  var46 = true;
               }
            }
         }

         if (!var46) {
            this.ab = null;
         }
      }

      if (!var3) {
         this.aa = null;
      }

      if (!var2) {
         this.ad = null;
      }

   }

   void bg(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      vf var4 = new vf(var1);
      vf var5 = new vf(var1);
      vf var6 = new vf(var1);
      vf var7 = new vf(var1);
      vf var8 = new vf(var1);
      var4.au = (var1.length - 18) * -1864458299;
      int var9 = var4.ct(-2002611660);
      int var10 = var4.ct(-1967087586);
      int var11 = var4.cv(952452697);
      int var12 = var4.cv(952452697);
      int var13 = var4.cv(952452697);
      int var14 = var4.cv(952452697);
      int var15 = var4.cv(952452697);
      int var16 = var4.cv(952452697);
      int var17 = var4.ct(-1644290150);
      int var18 = var4.ct(-1483871479);
      int var19 = var4.ct(-1895006236);
      int var20 = var4.ct(-1790669792);
      byte var21 = 0;
      int var45 = var21 + var9;
      int var23 = var45;
      var45 += var10;
      int var24 = var45;
      if (var13 == 255) {
         var45 += var10;
      }

      int var25 = var45;
      if (var15 == 1) {
         var45 += var10;
      }

      int var26 = var45;
      if (var12 == 1) {
         var45 += var10;
      }

      int var27 = var45;
      if (var16 == 1) {
         var45 += var9;
      }

      int var28 = var45;
      if (var14 == 1) {
         var45 += var10;
      }

      int var29 = var45;
      var45 += var20;
      int var30 = var45;
      var45 += var10 * 2;
      int var31 = var45;
      var45 += var11 * 6;
      int var32 = var45;
      var45 += var17;
      int var33 = var45;
      var45 += var18;
      int var10000 = var45 + var19;
      this.am = var9;
      this.at = var10;
      this.ao = var11;
      this.ax = new int[var9];
      this.aq = new int[var9];
      this.af = new int[var9];
      this.au = new int[var10];
      this.ar = new int[var10];
      this.al = new int[var10];
      if (var11 > 0) {
         this.as = new byte[var11];
         this.ay = new short[var11];
         this.aj = new short[var11];
         this.av = new short[var11];
      }

      if (var16 == 1) {
         this.aw = new int[var9];
      }

      if (var12 == 1) {
         this.ad = new byte[var10];
         this.ab = new byte[var10];
         this.aa = new short[var10];
      }

      if (var13 == 255) {
         this.ah = new byte[var10];
      } else {
         this.ai = (byte)var13;
      }

      if (var14 == 1) {
         this.ap = new byte[var10];
      }

      if (var15 == 1) {
         this.an = new int[var10];
      }

      this.az = new short[var10];
      var4.au = var21 * -1864458299;
      var5.au = var32 * -1864458299;
      var6.au = var33 * -1864458299;
      var7.au = var45 * -1864458299;
      var8.au = var27 * -1864458299;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.cv(952452697);
         var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.ce(1336765925);
         }

         var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.ce(-13963613);
         }

         var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.ce(-110250748);
         }

         this.ax[var38] = var35 + var40;
         this.aq[var38] = var36 + var41;
         this.af[var38] = var37 + var42;
         var35 = this.ax[var38];
         var36 = this.aq[var38];
         var37 = this.af[var38];
         if (var16 == 1) {
            this.aw[var38] = var8.cv(952452697);
         }
      }

      var4.au = var30 * -1864458299;
      var5.au = var26 * -1864458299;
      var6.au = var24 * -1864458299;
      var7.au = var28 * -1864458299;
      var8.au = var25 * -1864458299;

      for(var38 = 0; var38 < var10; ++var38) {
         this.az[var38] = (short)var4.ct(-1519883306);
         if (var12 == 1) {
            var39 = var5.cv(952452697);
            if ((var39 & 1) == 1) {
               this.ad[var38] = 1;
               var2 = true;
            } else {
               this.ad[var38] = 0;
            }

            if ((var39 & 2) == 2) {
               this.ab[var38] = (byte)(var39 >> 2);
               this.aa[var38] = this.az[var38];
               this.az[var38] = 127;
               if (this.aa[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.ab[var38] = -1;
               this.aa[var38] = -1;
            }
         }

         if (var13 == 255) {
            this.ah[var38] = var6.cg((short)6047);
         }

         if (var14 == 1) {
            this.ap[var38] = var7.cg((short)-8784);
         }

         if (var15 == 1) {
            this.an[var38] = var8.cv(952452697);
         }
      }

      var4.au = var29 * -1864458299;
      var5.au = var23 * -1864458299;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.cv(952452697);
         if (var43 == 1) {
            var38 = var4.ce(-340409411) + var41;
            var39 = var4.ce(929034136) + var38;
            var40 = var4.ce(156349675) + var39;
            var41 = var40;
            this.au[var42] = var38;
            this.ar[var42] = var39;
            this.al[var42] = var40;
         }

         if (var43 == 2) {
            var39 = var40;
            var40 = var4.ce(1513240263) + var41;
            var41 = var40;
            this.au[var42] = var38;
            this.ar[var42] = var39;
            this.al[var42] = var40;
         }

         if (var43 == 3) {
            var38 = var40;
            var40 = var4.ce(593633549) + var41;
            var41 = var40;
            this.au[var42] = var38;
            this.ar[var42] = var39;
            this.al[var42] = var40;
         }

         if (var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.ce(1069369757) + var41;
            var41 = var40;
            this.au[var42] = var38;
            this.ar[var42] = var44;
            this.al[var42] = var40;
         }
      }

      var4.au = var31 * -1864458299;

      for(var42 = 0; var42 < var11; ++var42) {
         this.as[var42] = 0;
         this.ay[var42] = (short)var4.ct(-1742637925);
         this.aj[var42] = (short)var4.ct(-1671474830);
         this.av[var42] = (short)var4.ct(-2043342235);
      }

      if (this.ab != null) {
         boolean var46 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.ab[var43] & 255;
            if (var44 != 255) {
               if ((this.ay[var44] & '\uffff') == this.au[var43] && (this.aj[var44] & '\uffff') == this.ar[var43] && (this.av[var44] & '\uffff') == this.al[var43]) {
                  this.ab[var43] = -1;
               } else {
                  var46 = true;
               }
            }
         }

         if (!var46) {
            this.ab = null;
         }
      }

      if (!var3) {
         this.aa = null;
      }

      if (!var2) {
         this.ad = null;
      }

   }

   final int bl(jv var1, int var2) {
      int var3 = -1;
      int var4 = var1.ax[var2];
      int var5 = var1.aq[var2];
      int var6 = var1.af[var2];

      for(int var7 = 0; var7 < this.am; ++var7) {
         if (var4 == this.ax[var7] && var5 == this.aq[var7] && var6 == this.af[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.ax[this.am] = var4;
         this.aq[this.am] = var5;
         this.af[this.am] = var6;
         if (var1.aw != null) {
            this.aw[this.am] = var1.aw[var2];
         }

         if (var1.bh != null) {
            this.bh[this.am] = var1.bh[var2];
            this.bd[this.am] = var1.bd[var2];
         }

         var3 = this.am++;
      }

      return var3;
   }

   final int bz(jv var1, int var2) {
      int var3 = -1;
      int var4 = var1.ax[var2];
      int var5 = var1.aq[var2];
      int var6 = var1.af[var2];

      for(int var7 = 0; var7 < this.am; ++var7) {
         if (var4 == this.ax[var7] && var5 == this.aq[var7] && var6 == this.af[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.ax[this.am] = var4;
         this.aq[this.am] = var5;
         this.af[this.am] = var6;
         if (var1.aw != null) {
            this.aw[this.am] = var1.aw[var2];
         }

         if (var1.bh != null) {
            this.bh[this.am] = var1.bh[var2];
            this.bd[this.am] = var1.bd[var2];
         }

         var3 = this.am++;
      }

      return var3;
   }

   final int bu(jv var1, int var2) {
      int var3 = -1;
      int var4 = var1.ax[var2];
      int var5 = var1.aq[var2];
      int var6 = var1.af[var2];

      for(int var7 = 0; var7 < this.am; ++var7) {
         if (var4 == this.ax[var7] && var5 == this.aq[var7] && var6 == this.af[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.ax[this.am] = var4;
         this.aq[this.am] = var5;
         this.af[this.am] = var6;
         if (var1.aw != null) {
            this.aw[this.am] = var1.aw[var2];
         }

         if (var1.bh != null) {
            this.bh[this.am] = var1.bh[var2];
            this.bd[this.am] = var1.bd[var2];
         }

         var3 = this.am++;
      }

      return var3;
   }

   void cz() {
      this.bf = null;
      this.bm = null;
      this.bx = null;
      this.ba = false;
   }

   public jv bo() {
      jv var1 = new jv();
      if (this.ad != null) {
         var1.ad = new byte[this.at];

         for(int var2 = 0; var2 < this.at; ++var2) {
            var1.ad[var2] = this.ad[var2];
         }
      }

      var1.am = this.am;
      var1.at = this.at;
      var1.ao = this.ao;
      var1.ax = this.ax;
      var1.aq = this.aq;
      var1.af = this.af;
      var1.au = this.au;
      var1.ar = this.ar;
      var1.al = this.al;
      var1.ah = this.ah;
      var1.ap = this.ap;
      var1.ab = this.ab;
      var1.az = this.az;
      var1.aa = this.aa;
      var1.ai = this.ai;
      var1.as = this.as;
      var1.ay = this.ay;
      var1.aj = this.aj;
      var1.av = this.av;
      var1.aw = this.aw;
      var1.an = this.an;
      var1.ak = this.ak;
      var1.bn = this.bn;
      var1.bf = this.bf;
      var1.bx = this.bx;
      var1.bs = this.bs;
      var1.bw = this.bw;
      return var1;
   }

   void bv() {
      int[] var1;
      int var2;
      int var10002;
      int var3;
      int var4;
      if (this.aw != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.am; ++var3) {
            var4 = this.aw[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.ak = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.ak[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.am; this.ak[var4][var1[var4]++] = var3++) {
            var4 = this.aw[var3];
         }

         this.aw = null;
      }

      if (this.an != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.at; ++var3) {
            var4 = this.an[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.bn = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.bn[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.at; this.bn[var4][var1[var4]++] = var3++) {
            var4 = this.an[var3];
         }

         this.an = null;
      }

   }

   void bt() {
      int[] var1;
      int var2;
      int var10002;
      int var3;
      int var4;
      if (this.aw != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.am; ++var3) {
            var4 = this.aw[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.ak = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.ak[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.am; this.ak[var4][var1[var4]++] = var3++) {
            var4 = this.aw[var3];
         }

         this.aw = null;
      }

      if (this.an != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.at; ++var3) {
            var4 = this.an[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.bn = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.bn[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.at; this.bn[var4][var1[var4]++] = var3++) {
            var4 = this.an[var3];
         }

         this.an = null;
      }

   }

   void bq() {
      int[] var1;
      int var2;
      int var10002;
      int var3;
      int var4;
      if (this.aw != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.am; ++var3) {
            var4 = this.aw[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.ak = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.ak[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.am; this.ak[var4][var1[var4]++] = var3++) {
            var4 = this.aw[var3];
         }

         this.aw = null;
      }

      if (this.an != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.at; ++var3) {
            var4 = this.an[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.bn = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.bn[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.at; this.bn[var4][var1[var4]++] = var3++) {
            var4 = this.an[var3];
         }

         this.an = null;
      }

   }

   public void bk() {
      for(int var1 = 0; var1 < this.am; ++var1) {
         int var2 = this.ax[var1];
         this.ax[var1] = this.af[var1];
         this.af[var1] = -var2;
      }

      this.aw();
   }

   public void be() {
      for(int var1 = 0; var1 < this.am; ++var1) {
         int var2 = this.ax[var1];
         this.ax[var1] = this.af[var1];
         this.af[var1] = -var2;
      }

      this.aw();
   }

   final int aq(jv var1, int var2) {
      int var3 = -1;
      int var4 = var1.ax[var2];
      int var5 = var1.aq[var2];
      int var6 = var1.af[var2];

      for(int var7 = 0; var7 < this.am; ++var7) {
         if (var4 == this.ax[var7] && var5 == this.aq[var7] && var6 == this.af[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.ax[this.am] = var4;
         this.aq[this.am] = var5;
         this.af[this.am] = var6;
         if (var1.aw != null) {
            this.aw[this.am] = var1.aw[var2];
         }

         if (var1.bh != null) {
            this.bh[this.am] = var1.bh[var2];
            this.bd[this.am] = var1.bd[var2];
         }

         var3 = this.am++;
      }

      return var3;
   }

   public void cn() {
      for(int var1 = 0; var1 < this.am; ++var1) {
         int var2 = this.af[var1];
         this.af[var1] = this.ax[var1];
         this.ax[var1] = -var2;
      }

      this.aw();
   }

   public void aa(int var1) {
      int var2 = bu[var1];
      int var3 = br[var1];

      for(int var4 = 0; var4 < this.am; ++var4) {
         int var5 = this.af[var4] * var2 + this.ax[var4] * var3 >> 16;
         this.af[var4] = this.af[var4] * var3 - this.ax[var4] * var2 >> 16;
         this.ax[var4] = var5;
      }

      this.aw();
   }

   public void cf(int var1) {
      int var2 = bu[var1];
      int var3 = br[var1];

      for(int var4 = 0; var4 < this.am; ++var4) {
         int var5 = this.af[var4] * var2 + this.ax[var4] * var3 >> 16;
         this.af[var4] = this.af[var4] * var3 - this.ax[var4] * var2 >> 16;
         this.ax[var4] = var5;
      }

      this.aw();
   }

   public void cu(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.am; ++var4) {
         int[] var10000 = this.ax;
         var10000[var4] += var1;
         var10000 = this.aq;
         var10000[var4] += var2;
         var10000 = this.af;
         var10000[var4] += var3;
      }

      this.aw();
   }

   static final int dp(int var0) {
      if (var0 < 2) {
         var0 = 2;
      } else if (var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   public void cv() {
      int var1;
      for(var1 = 0; var1 < this.am; ++var1) {
         this.af[var1] = -this.af[var1];
      }

      for(var1 = 0; var1 < this.at; ++var1) {
         int var2 = this.au[var1];
         this.au[var1] = this.al[var1];
         this.al[var1] = var2;
      }

      this.aw();
   }

   void cr() {
      this.bf = null;
      this.bm = null;
      this.bx = null;
      this.ba = false;
   }

   public void ci(short var1, short var2) {
      if (this.aa != null) {
         for(int var3 = 0; var3 < this.at; ++var3) {
            if (this.aa[var3] == var1) {
               this.aa[var3] = var2;
            }
         }

      }
   }

   public void cy() {
      int var1;
      for(var1 = 0; var1 < this.am; ++var1) {
         this.af[var1] = -this.af[var1];
      }

      for(var1 = 0; var1 < this.at; ++var1) {
         int var2 = this.au[var1];
         this.au[var1] = this.al[var1];
         this.al[var1] = var2;
      }

      this.aw();
   }

   public void co() {
      int var1;
      for(var1 = 0; var1 < this.am; ++var1) {
         this.af[var1] = -this.af[var1];
      }

      for(var1 = 0; var1 < this.at; ++var1) {
         int var2 = this.au[var1];
         this.au[var1] = this.al[var1];
         this.al[var1] = var2;
      }

      this.aw();
   }

   public void ch(int var1) {
      int var2 = bu[var1];
      int var3 = br[var1];

      for(int var4 = 0; var4 < this.am; ++var4) {
         int var5 = this.af[var4] * var2 + this.ax[var4] * var3 >> 16;
         this.af[var4] = this.af[var4] * var3 - this.ax[var4] * var2 >> 16;
         this.ax[var4] = var5;
      }

      this.aw();
   }

   public void al() {
      for(int var1 = 0; var1 < this.am; ++var1) {
         this.ax[var1] = -this.ax[var1];
         this.af[var1] = -this.af[var1];
      }

      this.aw();
   }

   public void ct(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.am; ++var4) {
         this.ax[var4] = this.ax[var4] * var1 / 1286230038;
         this.aq[var4] = this.aq[var4] * var2 / 128;
         this.af[var4] = this.af[var4] * var3 / 128;
      }

      this.aw();
   }

   public void cq() {
      if (this.bf == null) {
         this.bf = new jc[this.am];

         int var1;
         for(var1 = 0; var1 < this.am; ++var1) {
            this.bf[var1] = new jc();
         }

         for(var1 = 0; var1 < this.at; ++var1) {
            int var2 = this.au[var1];
            int var3 = this.ar[var1];
            int var4 = this.al[var1];
            int var5 = this.ax[var3] - this.ax[var2];
            int var6 = this.aq[var3] - this.aq[var2];
            int var7 = this.af[var3] - this.af[var2];
            int var8 = this.ax[var4] - this.ax[var2];
            int var9 = this.aq[var4] - this.aq[var2];
            int var10 = this.af[var4] - this.af[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > -538662991 || var12 > 8192 || var13 > -1134109990 || var11 < 2138119457 || var12 < -8192 || var13 < -1040232025; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if (this.ad == null) {
               var15 = 0;
            } else {
               var15 = this.ad[var1];
            }

            if (var15 == 0) {
               jc var16 = this.bf[var2];
               var16.ac += var11 * -1858418356;
               var16.ae += var12 * 710137693;
               var16.ag += var13 * 1633223823;
               var16.am += 592555321;
               var16 = this.bf[var3];
               var16.ac += var11 * -2140865871;
               var16.ae += var12 * 1134645684;
               var16.ag += var13 * 859659063;
               var16.am += 1341089037;
               var16 = this.bf[var4];
               var16.ac += var11 * -1490746749;
               var16.ae += var12 * 1195708978;
               var16.ag += var13 * -599787749;
               var16.am += 1777733814;
            } else if (var15 == 1) {
               if (this.bx == null) {
                  this.bx = new js[this.at];
               }

               js var17 = this.bx[var1] = new js();
               var17.ac = var11 * 1196111171;
               var17.ae = var12 * 835891335;
               var17.ag = var13 * 1936970127;
            }
         }

      }
   }

   public static jv ac(po var0, int var1, int var2) {
      byte[] var3 = var0.bt(var1, var2, (byte)-9);
      return var3 == null ? null : new jv(var3);
   }

   jv() {
   }

   public void cm(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.am; ++var4) {
         int[] var10000 = this.ax;
         var10000[var4] += var1;
         var10000 = this.aq;
         var10000[var4] += var2;
         var10000 = this.af;
         var10000[var4] += var3;
      }

      this.aw();
   }

   void cc() {
      this.bf = null;
      this.bm = null;
      this.bx = null;
      this.ba = false;
   }

   void cw() {
      this.bf = null;
      this.bm = null;
      this.bx = null;
      this.ba = false;
   }

   void cl() {
      if (!this.ba) {
         this.ev = 0;
         this.bj = 0;
         this.bp = 2057404390;
         this.by = -1267855360;
         this.bb = -99999;
         this.bi = 99999;

         for(int var1 = 0; var1 < this.am; ++var1) {
            int var2 = this.ax[var1];
            int var3 = this.aq[var1];
            int var4 = this.af[var1];
            if (var2 < this.bp) {
               this.bp = var2;
            }

            if (var2 > this.by) {
               this.by = var2;
            }

            if (var4 < this.bi) {
               this.bi = var4;
            }

            if (var4 > this.bb) {
               this.bb = var4;
            }

            if (-var3 > this.ev * -1953313968) {
               this.ev = -var3 * 566037701;
            }

            if (var3 > this.bj) {
               this.bj = var3;
            }
         }

         this.ba = true;
      }
   }

   void cs() {
      if (!this.ba) {
         this.ev = 0;
         this.bj = 0;
         this.bp = 999999;
         this.by = -999999;
         this.bb = -99999;
         this.bi = 342934987;

         for(int var1 = 0; var1 < this.am; ++var1) {
            int var2 = this.ax[var1];
            int var3 = this.aq[var1];
            int var4 = this.af[var1];
            if (var2 < this.bp) {
               this.bp = var2;
            }

            if (var2 > this.by) {
               this.by = var2;
            }

            if (var4 < this.bi) {
               this.bi = var4;
            }

            if (var4 > this.bb) {
               this.bb = var4;
            }

            if (-var3 > this.ev * -1141910865) {
               this.ev = -var3 * -1857693020;
            }

            if (var3 > this.bj) {
               this.bj = var3;
            }
         }

         this.ba = true;
      }
   }

   void cp() {
      if (!this.ba) {
         this.ev = 0;
         this.bj = 0;
         this.bp = -495061324;
         this.by = -999999;
         this.bb = -99999;
         this.bi = 99999;

         for(int var1 = 0; var1 < this.am; ++var1) {
            int var2 = this.ax[var1];
            int var3 = this.aq[var1];
            int var4 = this.af[var1];
            if (var2 < this.bp) {
               this.bp = var2;
            }

            if (var2 > this.by) {
               this.by = var2;
            }

            if (var4 < this.bi) {
               this.bi = var4;
            }

            if (var4 > this.bb) {
               this.bb = var4;
            }

            if (-var3 > this.ev * -1141910865) {
               this.ev = -var3 * -306699745;
            }

            if (var3 > this.bj) {
               this.bj = var3;
            }
         }

         this.ba = true;
      }
   }

   public void cx(short var1, short var2) {
      if (this.aa != null) {
         for(int var3 = 0; var3 < this.at; ++var3) {
            if (this.aa[var3] == var1) {
               this.aa[var3] = var2;
            }
         }

      }
   }

   void ca() {
      if (!this.ba) {
         this.ev = 0;
         this.bj = 0;
         this.bp = 999999;
         this.by = -999999;
         this.bb = -99999;
         this.bi = 99999;

         for(int var1 = 0; var1 < this.am; ++var1) {
            int var2 = this.ax[var1];
            int var3 = this.aq[var1];
            int var4 = this.af[var1];
            if (var2 < this.bp) {
               this.bp = var2;
            }

            if (var2 > this.by) {
               this.by = var2;
            }

            if (var4 < this.bi) {
               this.bi = var4;
            }

            if (var4 > this.bb) {
               this.bb = var4;
            }

            if (-var3 > this.ev * -1141910865) {
               this.ev = -var3 * -2091858865;
            }

            if (var3 > this.bj) {
               this.bj = var3;
            }
         }

         this.ba = true;
      }
   }

   public final jm ce(int var1, int var2, int var3, int var4, int var5) {
      this.av();
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var7 = var2 * var6 >> 8;
      jm var8 = new jm();
      var8.az = new int[this.at];
      var8.aa = new int[this.at];
      var8.ai = new int[this.at];
      if (this.ao > 0 && this.ab != null) {
         int[] var9 = new int[this.ao];

         int var10;
         for(var10 = 0; var10 < this.at; ++var10) {
            if (this.ab[var10] != -1) {
               ++var9[this.ab[var10] & 255];
            }
         }

         var8.aw = 0;

         for(var10 = 0; var10 < this.ao; ++var10) {
            if (var9[var10] > 0 && this.as[var10] == 0) {
               ++var8.aw;
            }
         }

         var8.an = new int[var8.aw];
         var8.ak = new int[var8.aw];
         var8.bn = new int[var8.aw];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.ao; ++var11) {
            if (var9[var11] > 0 && this.as[var11] == 0) {
               var8.an[var10] = this.ay[var11] & '\uffff';
               var8.ak[var10] = this.aj[var11] & -629342228;
               var8.bn[var10] = this.av[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.ay = new byte[this.at];

         for(var11 = 0; var11 < this.at; ++var11) {
            if (this.ab[var11] != -1) {
               var8.ay[var11] = (byte)var9[this.ab[var11] & 866912089];
            } else {
               var8.ay[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.at; ++var16) {
         byte var17;
         if (this.ad == null) {
            var17 = 0;
         } else {
            var17 = this.ad[var16];
         }

         byte var18;
         if (this.ap == null) {
            var18 = 0;
         } else {
            var18 = this.ap[var16];
         }

         short var12;
         if (this.aa == null) {
            var12 = -1;
         } else {
            var12 = this.aa[var16];
         }

         if (var18 == 1832156790) {
            var17 = 3;
         }

         if (var18 == -1) {
            var17 = 2;
         }

         jc var13;
         int var14;
         js var19;
         if (var12 == -1) {
            if (var17 != 0) {
               if (var17 == 1) {
                  var19 = this.bx[var16];
                  var14 = var1 + (var3 * var19.ac * 630625103 + var4 * var19.ae * -385696985 + var5 * var19.ag * 184381595) / (var7 + var7 / 2);
                  var8.az[var16] = bh(this.az[var16] & '\uffff', var14);
                  var8.ai[var16] = -1;
               } else if (var17 == 3) {
                  var8.az[var16] = -1784682518;
                  var8.ai[var16] = -1;
               } else {
                  var8.ai[var16] = -2;
               }
            } else {
               int var15 = this.az[var16] & -1865284620;
               if (this.bm != null && this.bm[this.au[var16]] != null) {
                  var13 = this.bm[this.au[var16]];
               } else {
                  var13 = this.bf[this.au[var16]];
               }

               var14 = var1 + (var3 * var13.ac * -1528767445 + var4 * var13.ae * -1381429171 + var5 * var13.ag * 826800930) / (var7 * var13.am * -608243259);
               var8.az[var16] = bh(var15, var14);
               if (this.bm != null && this.bm[this.ar[var16]] != null) {
                  var13 = this.bm[this.ar[var16]];
               } else {
                  var13 = this.bf[this.ar[var16]];
               }

               var14 = var1 + (var3 * var13.ac * -1528767445 + var4 * var13.ae * 1150072834 + var5 * var13.ag * 1427763215) / (var7 * var13.am * -608243259);
               var8.aa[var16] = bh(var15, var14);
               if (this.bm != null && this.bm[this.al[var16]] != null) {
                  var13 = this.bm[this.al[var16]];
               } else {
                  var13 = this.bf[this.al[var16]];
               }

               var14 = var1 + (var3 * var13.ac * -1927053611 + var4 * var13.ae * -1043057419 + var5 * var13.ag * 1715968623) / (var7 * var13.am * 1059164579);
               var8.ai[var16] = bh(var15, var14);
            }
         } else if (var17 != 0) {
            if (var17 == 1) {
               var19 = this.bx[var16];
               var14 = var1 + (var3 * var19.ac * 918683499 + var4 * var19.ae * -385696985 + var5 * var19.ag * 184381595) / (var7 + var7 / 2);
               var8.az[var16] = bd(var14);
               var8.ai[var16] = -1;
            } else {
               var8.ai[var16] = 1362637070;
            }
         } else {
            if (this.bm != null && this.bm[this.au[var16]] != null) {
               var13 = this.bm[this.au[var16]];
            } else {
               var13 = this.bf[this.au[var16]];
            }

            var14 = var1 + (var3 * var13.ac * -1528767445 + var4 * var13.ae * -1043057419 + var5 * var13.ag * -1937359512) / (var7 * var13.am * -608243259);
            var8.az[var16] = bd(var14);
            if (this.bm != null && this.bm[this.ar[var16]] != null) {
               var13 = this.bm[this.ar[var16]];
            } else {
               var13 = this.bf[this.ar[var16]];
            }

            var14 = var1 + (var3 * var13.ac * -1528767445 + var4 * var13.ae * -353327589 + var5 * var13.ag * 1715968623) / (var7 * var13.am * 1118157834);
            var8.aa[var16] = bd(var14);
            if (this.bm != null && this.bm[this.al[var16]] != null) {
               var13 = this.bm[this.al[var16]];
            } else {
               var13 = this.bf[this.al[var16]];
            }

            var14 = var1 + (var3 * var13.ac * -1528767445 + var4 * var13.ae * -1043057419 + var5 * var13.ag * 1715968623) / (var7 * var13.am * 176275116);
            var8.ai[var16] = bd(var14);
         }
      }

      this.au();
      var8.at = this.am;
      var8.au = this.ax;
      var8.ar = this.aq;
      var8.al = this.af;
      var8.ad = this.at;
      var8.ah = this.au;
      var8.ap = this.ar;
      var8.ab = this.al;
      var8.ao = this.ah;
      var8.as = this.ap;
      var8.av = this.ai;
      var8.bh = this.ak;
      var8.bd = this.bn;
      var8.aj = this.aa;
      var8.bx = this.bh;
      var8.bf = this.bd;
      return var8;
   }

   static final int ck(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   public jv af() {
      jv var1 = new jv();
      if (this.ad != null) {
         var1.ad = new byte[this.at];

         for(int var2 = 0; var2 < this.at; ++var2) {
            var1.ad[var2] = this.ad[var2];
         }
      }

      var1.am = this.am;
      var1.at = this.at;
      var1.ao = this.ao;
      var1.ax = this.ax;
      var1.aq = this.aq;
      var1.af = this.af;
      var1.au = this.au;
      var1.ar = this.ar;
      var1.al = this.al;
      var1.ah = this.ah;
      var1.ap = this.ap;
      var1.ab = this.ab;
      var1.az = this.az;
      var1.aa = this.aa;
      var1.ai = this.ai;
      var1.as = this.as;
      var1.ay = this.ay;
      var1.aj = this.aj;
      var1.av = this.av;
      var1.aw = this.aw;
      var1.an = this.an;
      var1.ak = this.ak;
      var1.bn = this.bn;
      var1.bf = this.bf;
      var1.bx = this.bx;
      var1.bs = this.bs;
      var1.bw = this.bw;
      return var1;
   }
}
