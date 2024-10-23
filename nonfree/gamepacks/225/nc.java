import java.util.ArrayList;
import java.util.BitSet;

public class nc extends to {
   short[] am;
   static final int ae = 8;
   int[] ar;
   ch[] ag;
   byte[] ax;
   byte[] aq;
   mv[] af;
   byte[] at;
   int ac;
   static of fr;
   ArrayList au;

   void ae(byte var1) {
      try {
         this.ar = null;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "nc.ae(" + ')');
      }
   }

   boolean ac(bo var1, BitSet var2, int var3) {
      try {
         boolean var4 = true;
         int var5 = 0;
         ch var6 = new ch();

         int var8;
         for(int var7 = var2.nextSetBit(0); var7 != -1; var7 = var2.nextSetBit(var8)) {
            if (var3 == 1011295482) {
               throw new IllegalStateException();
            }

            var8 = var2.nextClearBit(var7);

            for(int var9 = var7; var9 < var8; ++var9) {
               if (var3 == 1011295482) {
                  throw new IllegalStateException();
               }

               if (var2.get(var9)) {
                  if (var3 == 1011295482) {
                     throw new IllegalStateException();
                  }

                  int var10 = this.ar[var9];
                  if (var10 != 0) {
                     if (var3 == 1011295482) {
                        throw new IllegalStateException();
                     }

                     if (var10 != var5) {
                        if (var3 == 1011295482) {
                           throw new IllegalStateException();
                        }

                        var5 = var10--;
                        if ((var10 & 1) == 0) {
                           if (var3 == 1011295482) {
                              throw new IllegalStateException();
                           }

                           var6 = new ch(var1.ax(var10 >> 2, -1316673194));
                        } else {
                           var6 = var1.am(var10 >> 2, 2050895161);
                        }

                        if (var6.ac(-1724018812)) {
                           if (var3 == 1011295482) {
                              throw new IllegalStateException();
                           }

                           var4 = false;
                        } else {
                           this.au.add(this.au.size(), var6);
                        }
                     }

                     if (!var6.ac(-1724018812)) {
                        if (var3 == 1011295482) {
                           throw new IllegalStateException();
                        }

                        this.ag[var9] = var6;
                        this.ar[var9] = 0;
                     }
                  }
               }
            }
         }

         return var4;
      } catch (RuntimeException var11) {
         throw vk.ae(var11, "nc.ac(" + ')');
      }
   }

   boolean ag(bo var1, BitSet var2) {
      boolean var3 = true;
      int var4 = 0;
      ch var5 = new ch();

      int var7;
      for(int var6 = var2.nextSetBit(0); var6 != -1; var6 = var2.nextSetBit(var7)) {
         var7 = var2.nextClearBit(var6);

         for(int var8 = var6; var8 < var7; ++var8) {
            if (var2.get(var8)) {
               int var9 = this.ar[var8];
               if (var9 != 0) {
                  if (var9 != var4) {
                     var4 = var9--;
                     if ((var9 & 1) == 0) {
                        var5 = new ch(var1.ax(var9 >> 2, -1316673194));
                     } else {
                        var5 = var1.am(var9 >> 2, 1837997711);
                     }

                     if (var5.ac(-1724018812)) {
                        var3 = false;
                     } else {
                        this.au.add(this.au.size(), var5);
                     }
                  }

                  if (!var5.ac(-1724018812)) {
                     this.ag[var8] = var5;
                     this.ar[var8] = 0;
                  }
               }
            }
         }
      }

      return var3;
   }

   void af() {
      this.ar = null;
   }

   boolean am(bo var1, BitSet var2) {
      boolean var3 = true;
      int var4 = 0;
      ch var5 = new ch();

      int var7;
      for(int var6 = var2.nextSetBit(0); var6 != -1; var6 = var2.nextSetBit(var7)) {
         var7 = var2.nextClearBit(var6);

         for(int var8 = var6; var8 < var7; ++var8) {
            if (var2.get(var8)) {
               int var9 = this.ar[var8];
               if (var9 != 0) {
                  if (var9 != var4) {
                     var4 = var9--;
                     if ((var9 & 1) == 0) {
                        var5 = new ch(var1.ax(var9 >> 2, -1316673194));
                     } else {
                        var5 = var1.am(var9 >> 2, 1149038753);
                     }

                     if (var5.ac(-1724018812)) {
                        var3 = false;
                     } else {
                        this.au.add(this.au.size(), var5);
                     }
                  }

                  if (!var5.ac(-1724018812)) {
                     this.ag[var8] = var5;
                     this.ar[var8] = 0;
                  }
               }
            }
         }
      }

      return var3;
   }

   boolean ax(bo var1, BitSet var2) {
      boolean var3 = true;
      int var4 = 0;
      ch var5 = new ch();

      int var7;
      for(int var6 = var2.nextSetBit(0); var6 != -1; var6 = var2.nextSetBit(var7)) {
         var7 = var2.nextClearBit(var6);

         for(int var8 = var6; var8 < var7; ++var8) {
            if (var2.get(var8)) {
               int var9 = this.ar[var8];
               if (var9 != 0) {
                  if (var9 != var4) {
                     var4 = var9--;
                     if ((var9 & 1) == 0) {
                        var5 = new ch(var1.ax(var9 >> 2, -1316673194));
                     } else {
                        var5 = var1.am(var9 >> 2, 926827918);
                     }

                     if (var5.ac(-1724018812)) {
                        var3 = false;
                     } else {
                        this.au.add(this.au.size(), var5);
                     }
                  }

                  if (!var5.ac(-1724018812)) {
                     this.ag[var8] = var5;
                     this.ar[var8] = 0;
                  }
               }
            }
         }
      }

      return var3;
   }

   boolean aq(bo var1, BitSet var2) {
      boolean var3 = true;
      int var4 = 0;
      ch var5 = new ch();

      int var7;
      for(int var6 = var2.nextSetBit(0); var6 != -1; var6 = var2.nextSetBit(var7)) {
         var7 = var2.nextClearBit(var6);

         for(int var8 = var6; var8 < var7; ++var8) {
            if (var2.get(var8)) {
               int var9 = this.ar[var8];
               if (var9 != 0) {
                  if (var9 != var4) {
                     var4 = var9--;
                     if ((var9 & 1) == 0) {
                        var5 = new ch(var1.ax(var9 >> 2, -1316673194));
                     } else {
                        var5 = var1.am(var9 >> 2, 1879892639);
                     }

                     if (var5.ac(-1724018812)) {
                        var3 = false;
                     } else {
                        this.au.add(this.au.size(), var5);
                     }
                  }

                  if (!var5.ac(-1724018812)) {
                     this.ag[var8] = var5;
                     this.ar[var8] = 0;
                  }
               }
            }
         }
      }

      return var3;
   }

   static int bh(int var0, dt var1, boolean var2, int var3) {
      try {
         int var4;
         int var5;
         int var7;
         if (3400 == var0) {
            if (var3 == 1162074139) {
               throw new IllegalStateException();
            } else {
               mp.au -= 582051378;
               var4 = cs.at[844691753 * mp.au];
               var5 = cs.at[844691753 * mp.au + 1];
               hd var12 = ce.ac(var4, (short)4196);
               if ('s' != var12.am) {
               }

               for(var7 = 0; var7 < -968558963 * var12.af; ++var7) {
                  if (var3 == 1162074139) {
                     throw new IllegalStateException();
                  }

                  if (var12.at[var7] == var5) {
                     cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var12.ar[var7];
                     var12 = null;
                     break;
                  }
               }

               if (var12 != null) {
                  cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var12.ax;
               }

               return 1;
            }
         } else if (var0 != 3408) {
            if (3411 == var0) {
               if (var3 == 1162074139) {
                  throw new IllegalStateException();
               } else {
                  var4 = cs.at[(mp.au -= -1856457959) * 844691753];
                  hd var11 = ce.ac(var4, (short)24116);
                  cs.at[(mp.au += -1856457959) * 844691753 - 1] = var11.am((byte)91);
                  return 1;
               }
            } else {
               return 2;
            }
         } else {
            mp.au -= 1164102756;
            var4 = cs.at[mp.au * 844691753];
            var5 = cs.at[1 + 844691753 * mp.au];
            int var6 = cs.at[mp.au * 844691753 + 2];
            var7 = cs.at[844691753 * mp.au + 3];
            hd var8 = ce.ac(var6, (short)30608);
            if (var8.ag == var4) {
               if (var3 == 1162074139) {
                  throw new IllegalStateException();
               }

               if (var8.am == var5) {
                  for(int var9 = 0; var9 < var8.af * -968558963; ++var9) {
                     if (var3 == 1162074139) {
                        throw new IllegalStateException();
                     }

                     if (var7 == var8.at[var9]) {
                        if (var3 == 1162074139) {
                           throw new IllegalStateException();
                        }

                        if (115 == var5) {
                           if (var3 == 1162074139) {
                              throw new IllegalStateException();
                           }

                           cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var8.ar[var9];
                        } else {
                           cs.at[(mp.au += -1856457959) * 844691753 - 1] = var8.au[var9];
                        }

                        var8 = null;
                        break;
                     }
                  }

                  if (var8 != null) {
                     if (var3 == 1162074139) {
                        throw new IllegalStateException();
                     }

                     if (115 == var5) {
                        if (var3 == 1162074139) {
                           throw new IllegalStateException();
                        }

                        cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var8.ax;
                     } else {
                        cs.at[(mp.au += -1856457959) * 844691753 - 1] = -304270849 * var8.aq;
                     }
                  }

                  return 1;
               }

               if (var3 == 1162074139) {
                  throw new IllegalStateException();
               }
            }

            if (var5 == 115) {
               if (var3 == 1162074139) {
                  throw new IllegalStateException();
               }

               cs.ar[(rt.al += -1975882559) * -515103935 - 1] = ok.al;
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
            }

            return 1;
         }
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "nc.bh(" + ')');
      }
   }

   void at() {
      this.ar = null;
   }

   nc(byte[] var1) {
      try {
         super();
         this.au = new ArrayList(8);
         this.ag = new ch[128];
         this.am = new short[128];
         this.ax = new byte[128];
         this.aq = new byte[128];
         this.af = new mv[128];
         this.at = new byte[128];
         this.ar = new int[128];
         vf var2 = new vf(var1);

         int var3;
         for(var3 = 0; 0 != var2.at[var3 + var2.au * -1027766515]; ++var3) {
         }

         byte[] var4 = new byte[var3];

         int var5;
         for(var5 = 0; var5 < var3; ++var5) {
            var4[var5] = var2.cg((short)-4757);
         }

         var2.au += -1864458299;
         ++var3;
         var5 = var2.au * -1027766515;
         var2.au += var3 * -1864458299;

         int var6;
         for(var6 = 0; 0 != var2.at[var2.au * -1027766515 + var6]; ++var6) {
         }

         byte[] var7 = new byte[var6];

         int var8;
         for(var8 = 0; var8 < var6; ++var8) {
            var7[var8] = var2.cg((short)-4115);
         }

         var2.au += -1864458299;
         ++var6;
         var8 = -1027766515 * var2.au;
         var2.au += var6 * -1864458299;

         int var9;
         for(var9 = 0; var2.at[var9 + -1027766515 * var2.au] != 0; ++var9) {
         }

         byte[] var10 = new byte[var9];

         for(int var11 = 0; var11 < var9; ++var11) {
            var10[var11] = var2.cg((short)-129);
         }

         var2.au += -1864458299;
         ++var9;
         byte[] var39 = new byte[var9];
         int var12;
         int var14;
         if (var9 > 1) {
            var39[1] = 1;
            int var13 = 1;
            var12 = 2;

            for(var14 = 2; var14 < var9; ++var14) {
               int var15 = var2.cv(952452697);
               if (var15 == 0) {
                  var13 = var12++;
               } else {
                  if (var15 <= var13) {
                     --var15;
                  }

                  var13 = var15;
               }

               var39[var14] = (byte)var13;
            }
         } else {
            var12 = var9;
         }

         mv[] var40 = new mv[var12];

         mv var41;
         for(var14 = 0; var14 < var40.length; ++var14) {
            var41 = var40[var14] = new mv();
            int var16 = var2.cv(952452697);
            if (var16 > 0) {
               var41.ac = new byte[2 * var16];
            }

            var16 = var2.cv(952452697);
            if (var16 > 0) {
               var41.ae = new byte[var16 * 2 + 2];
               var41.ae[1] = 64;
            }
         }

         var14 = var2.cv(952452697);
         byte[] var42 = var14 > 0 ? new byte[2 * var14] : null;
         var14 = var2.cv(952452697);
         byte[] var43 = var14 > 0 ? new byte[var14 * 2] : null;

         int var17;
         for(var17 = 0; var2.at[var17 + var2.au * -1027766515] != 0; ++var17) {
         }

         byte[] var18 = new byte[var17];

         int var19;
         for(var19 = 0; var19 < var17; ++var19) {
            var18[var19] = var2.cg((short)10641);
         }

         var2.au += -1864458299;
         ++var17;
         var19 = 0;

         int var20;
         for(var20 = 0; var20 < 128; ++var20) {
            var19 += var2.cv(952452697);
            this.am[var20] = (short)var19;
         }

         var19 = 0;

         short[] var51;
         for(var20 = 0; var20 < 128; ++var20) {
            var19 += var2.cv(952452697);
            var51 = this.am;
            var51[var20] = (short)(var51[var20] + (var19 << 8));
         }

         var20 = 0;
         int var21 = 0;
         int var22 = 0;

         int var23;
         for(var23 = 0; var23 < 128; ++var23) {
            if (0 == var20) {
               if (var21 < var18.length) {
                  var20 = var18[var21++];
               } else {
                  var20 = -1;
               }

               var22 = var2.dk((byte)16);
            }

            var51 = this.am;
            var51[var23] = (short)(var51[var23] + ((var22 - 1 & 2) << 14));
            this.ar[var23] = var22;
            --var20;
         }

         var20 = 0;
         var21 = 0;
         var23 = 0;

         int var24;
         for(var24 = 0; var24 < 128; ++var24) {
            if (0 != this.ar[var24]) {
               if (var20 == 0) {
                  if (var21 < var4.length) {
                     var20 = var4[var21++];
                  } else {
                     var20 = -1;
                  }

                  var23 = var2.at[var5++] - 1;
               }

               this.at[var24] = (byte)var23;
               --var20;
            }
         }

         var20 = 0;
         var21 = 0;
         var24 = 0;

         for(int var25 = 0; var25 < 128; ++var25) {
            if (this.ar[var25] != 0) {
               if (var20 == 0) {
                  if (var21 < var7.length) {
                     var20 = var7[var21++];
                  } else {
                     var20 = -1;
                  }

                  var24 = var2.at[var8++] + 16 << 2;
               }

               this.aq[var25] = (byte)var24;
               --var20;
            }
         }

         var20 = 0;
         var21 = 0;
         mv var45 = null;

         int var26;
         for(var26 = 0; var26 < 128; ++var26) {
            if (this.ar[var26] != 0) {
               if (var20 == 0) {
                  var45 = var40[var39[var21]];
                  if (var21 < var10.length) {
                     var20 = var10[var21++];
                  } else {
                     var20 = -1;
                  }
               }

               this.af[var26] = var45;
               --var20;
            }
         }

         var20 = 0;
         var21 = 0;
         var26 = 0;

         int var27;
         for(var27 = 0; var27 < 128; ++var27) {
            if (var20 == 0) {
               if (var21 < var18.length) {
                  var20 = var18[var21++];
               } else {
                  var20 = -1;
               }

               if (this.ar[var27] > 0) {
                  var26 = var2.cv(952452697) + 1;
               }
            }

            this.ax[var27] = (byte)var26;
            --var20;
         }

         this.ac = (var2.cv(952452697) + 1) * 1781634379;

         mv var28;
         int var29;
         for(var27 = 0; var27 < var12; ++var27) {
            var28 = var40[var27];
            if (null != var28.ac) {
               for(var29 = 1; var29 < var28.ac.length; var29 += 2) {
                  var28.ac[var29] = var2.cg((short)1937);
               }
            }

            if (null != var28.ae) {
               for(var29 = 3; var29 < var28.ae.length - 2; var29 += 2) {
                  var28.ae[var29] = var2.cg((short)-16423);
               }
            }
         }

         if (null != var42) {
            for(var27 = 1; var27 < var42.length; var27 += 2) {
               var42[var27] = var2.cg((short)12872);
            }
         }

         if (var43 != null) {
            for(var27 = 1; var27 < var43.length; var27 += 2) {
               var43[var27] = var2.cg((short)19524);
            }
         }

         for(var27 = 0; var27 < var12; ++var27) {
            var28 = var40[var27];
            if (var28.ae != null) {
               var19 = 0;

               for(var29 = 2; var29 < var28.ae.length; var29 += 2) {
                  var19 = 1 + var19 + var2.cv(952452697);
                  var28.ae[var29] = (byte)var19;
               }
            }
         }

         for(var27 = 0; var27 < var12; ++var27) {
            var28 = var40[var27];
            if (var28.ac != null) {
               var19 = 0;

               for(var29 = 2; var29 < var28.ac.length; var29 += 2) {
                  var19 = 1 + var19 + var2.cv(952452697);
                  var28.ac[var29] = (byte)var19;
               }
            }
         }

         byte var30;
         int var32;
         int var33;
         int var34;
         int var35;
         int var36;
         int var48;
         byte var50;
         if (null != var42) {
            var19 = var2.cv(952452697);
            var42[0] = (byte)var19;

            for(var27 = 2; var27 < var42.length; var27 += 2) {
               var19 = 1 + var19 + var2.cv(952452697);
               var42[var27] = (byte)var19;
            }

            var50 = var42[0];
            byte var46 = var42[1];

            for(var29 = 0; var29 < var50; ++var29) {
               this.ax[var29] = (byte)(var46 * this.ax[var29] + 32 >> 6);
            }

            for(var29 = 2; var29 < var42.length; var29 += 2) {
               var30 = var42[var29];
               byte var31 = var42[1 + var29];
               var32 = (var30 - var50) / 2 + var46 * (var30 - var50);

               for(var33 = var50; var33 < var30; ++var33) {
                  var35 = var30 - var50;
                  var36 = var32 >>> 31;
                  var34 = (var32 + var36) / var35 - var36;
                  this.ax[var33] = (byte)(var34 * this.ax[var33] + 32 >> 6);
                  var32 += var31 - var46;
               }

               var50 = var30;
               var46 = var31;
            }

            for(var48 = var50; var48 < 128; ++var48) {
               this.ax[var48] = (byte)(var46 * this.ax[var48] + 32 >> 6);
            }

            var41 = null;
         }

         if (null != var43) {
            var19 = var2.cv(952452697);
            var43[0] = (byte)var19;

            for(var27 = 2; var27 < var43.length; var27 += 2) {
               var19 = 1 + var19 + var2.cv(952452697);
               var43[var27] = (byte)var19;
            }

            var50 = var43[0];
            int var47 = var43[1] << 1;

            for(var29 = 0; var29 < var50; ++var29) {
               var48 = var47 + (this.aq[var29] & 255);
               if (var48 < 0) {
                  var48 = 0;
               }

               if (var48 > 128) {
                  var48 = 128;
               }

               this.aq[var29] = (byte)var48;
            }

            int var49;
            for(var29 = 2; var29 < var43.length; var29 += 2) {
               var30 = var43[var29];
               var49 = var43[1 + var29] << 1;
               var32 = (var30 - var50) / 2 + var47 * (var30 - var50);

               for(var33 = var50; var33 < var30; ++var33) {
                  var35 = var30 - var50;
                  var36 = var32 >>> 31;
                  var34 = (var36 + var32) / var35 - var36;
                  int var37 = (this.aq[var33] & 255) + var34;
                  if (var37 < 0) {
                     var37 = 0;
                  }

                  if (var37 > 128) {
                     var37 = 128;
                  }

                  this.aq[var33] = (byte)var37;
                  var32 += var49 - var47;
               }

               var50 = var30;
               var47 = var49;
            }

            for(var48 = var50; var48 < 128; ++var48) {
               var49 = var47 + (this.aq[var48] & 255);
               if (var49 < 0) {
                  var49 = 0;
               }

               if (var49 > 128) {
                  var49 = 128;
               }

               this.aq[var48] = (byte)var49;
            }

            Object var44 = null;
         }

         for(var27 = 0; var27 < var12; ++var27) {
            var40[var27].ag = var2.cv(952452697) * -153126375;
         }

         for(var27 = 0; var27 < var12; ++var27) {
            var28 = var40[var27];
            if (null != var28.ac) {
               var28.am = var2.cv(952452697) * 1098217755;
            }

            if (var28.ae != null) {
               var28.ax = var2.cv(952452697) * -1288439301;
            }

            if (var28.ag * -336379351 > 0) {
               var28.aq = var2.cv(952452697) * 953804235;
            }
         }

         for(var27 = 0; var27 < var12; ++var27) {
            var40[var27].at = var2.cv(952452697) * 314559967;
         }

         for(var27 = 0; var27 < var12; ++var27) {
            var28 = var40[var27];
            if (624438815 * var28.at > 0) {
               var28.af = var2.cv(952452697) * -79251297;
            }
         }

         for(var27 = 0; var27 < var12; ++var27) {
            var28 = var40[var27];
            if (var28.af * -282827937 > 0) {
               var28.au = var2.cv(952452697) * -721162847;
            }
         }

      } catch (RuntimeException var38) {
         throw vk.ae(var38, "nc.<init>(" + ')');
      }
   }

   static int bq(int var0, dt var1, boolean var2, byte var3) {
      try {
         return 2;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "nc.bq(" + ')');
      }
   }
}
