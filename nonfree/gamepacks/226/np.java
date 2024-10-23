import java.util.ArrayList;
import java.util.BitSet;

public class np extends tw {
   int[] at;
   static final int aw = 8;
   int ap;
   short[] aj;
   byte[] ai;
   byte[] ay;
   mq[] as;
   byte[] ae;
   ArrayList am;
   cb[] ak;
   static final int au = 6;

   static int bf(int var0, da var1, boolean var2, byte var3) {
      try {
         return 2;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "np.bf(" + ')');
      }
   }

   boolean aw(ba var1, BitSet var2, short var3) {
      try {
         boolean var4 = true;
         int var5 = 0;
         cb var6 = new cb();

         int var8;
         for(int var7 = var2.nextSetBit(0); -1 != var7; var7 = var2.nextSetBit(var8)) {
            if (var3 >= 136) {
               throw new IllegalStateException();
            }

            var8 = var2.nextClearBit(var7);

            for(int var9 = var7; var9 < var8; ++var9) {
               if (var3 >= 136) {
                  throw new IllegalStateException();
               }

               if (var2.get(var9)) {
                  int var10 = this.at[var9];
                  if (0 != var10) {
                     if (var3 >= 136) {
                        throw new IllegalStateException();
                     }

                     if (var10 != var5) {
                        if (var3 >= 136) {
                           throw new IllegalStateException();
                        }

                        var5 = var10--;
                        if ((var10 & 1) == 0) {
                           if (var3 >= 136) {
                              throw new IllegalStateException();
                           }

                           var6 = new cb(var1.ai(var10 >> 2, (byte)108));
                        } else {
                           var6 = var1.aj(var10 >> 2, (byte)-1);
                        }

                        if (var6.ap(1329688603)) {
                           var4 = false;
                        } else {
                           this.am.add(this.am.size(), var6);
                        }
                     }

                     if (!var6.ap(1329688603)) {
                        this.ak[var9] = var6;
                        this.at[var9] = 0;
                     }
                  }
               }
            }
         }

         return var4;
      } catch (RuntimeException var11) {
         throw tm.aw(var11, "np.aw(" + ')');
      }
   }

   void ak(int var1) {
      try {
         this.at = null;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "np.ak(" + ')');
      }
   }

   void as() {
      this.at = null;
   }

   boolean ai(ba var1, BitSet var2) {
      boolean var3 = true;
      int var4 = 0;
      cb var5 = new cb();

      int var7;
      for(int var6 = var2.nextSetBit(0); -1 != var6; var6 = var2.nextSetBit(var7)) {
         var7 = var2.nextClearBit(var6);

         for(int var8 = var6; var8 < var7; ++var8) {
            if (var2.get(var8)) {
               int var9 = this.at[var8];
               if (0 != var9) {
                  if (var9 != var4) {
                     var4 = var9--;
                     if ((var9 & 1) == 0) {
                        var5 = new cb(var1.ai(var9 >> 2, (byte)-76));
                     } else {
                        var5 = var1.aj(var9 >> 2, (byte)61);
                     }

                     if (var5.ap(1329688603)) {
                        var3 = false;
                     } else {
                        this.am.add(this.am.size(), var5);
                     }
                  }

                  if (!var5.ap(1329688603)) {
                     this.ak[var8] = var5;
                     this.at[var8] = 0;
                  }
               }
            }
         }
      }

      return var3;
   }

   boolean ay(ba var1, BitSet var2) {
      boolean var3 = true;
      int var4 = 0;
      cb var5 = new cb();

      int var7;
      for(int var6 = var2.nextSetBit(0); -1 != var6; var6 = var2.nextSetBit(var7)) {
         var7 = var2.nextClearBit(var6);

         for(int var8 = var6; var8 < var7; ++var8) {
            if (var2.get(var8)) {
               int var9 = this.at[var8];
               if (0 != var9) {
                  if (var9 != var4) {
                     var4 = var9--;
                     if ((var9 & 1) == 0) {
                        var5 = new cb(var1.ai(var9 >> 2, (byte)54));
                     } else {
                        var5 = var1.aj(var9 >> 2, (byte)8);
                     }

                     if (var5.ap(1329688603)) {
                        var3 = false;
                     } else {
                        this.am.add(this.am.size(), var5);
                     }
                  }

                  if (!var5.ap(1329688603)) {
                     this.ak[var8] = var5;
                     this.at[var8] = 0;
                  }
               }
            }
         }
      }

      return var3;
   }

   np(byte[] var1) {
      try {
         super();
         this.am = new ArrayList(8);
         this.ak = new cb[128];
         this.aj = new short[128];
         this.ai = new byte[128];
         this.ay = new byte[128];
         this.as = new mq[128];
         this.ae = new byte[128];
         this.at = new int[128];
         vl var2 = new vl(var1);

         int var3;
         for(var3 = 0; var2.ae[var3 + var2.am * -1689308347] != 0; ++var3) {
         }

         byte[] var4 = new byte[var3];

         int var5;
         for(var5 = 0; var5 < var3; ++var5) {
            var4[var5] = var2.cu((byte)13);
         }

         var2.am += -725588083;
         ++var3;
         var5 = var2.am * -1689308347;
         var2.am += var3 * -725588083;

         int var6;
         for(var6 = 0; var2.ae[var2.am * -1689308347 + var6] != 0; ++var6) {
         }

         byte[] var7 = new byte[var6];

         int var8;
         for(var8 = 0; var8 < var6; ++var8) {
            var7[var8] = var2.cu((byte)13);
         }

         var2.am += -725588083;
         ++var6;
         var8 = var2.am * -1689308347;
         var2.am += -725588083 * var6;

         int var9;
         for(var9 = 0; var2.ae[var9 + var2.am * -1689308347] != 0; ++var9) {
         }

         byte[] var10 = new byte[var9];

         for(int var11 = 0; var11 < var9; ++var11) {
            var10[var11] = var2.cu((byte)13);
         }

         var2.am += -725588083;
         ++var9;
         byte[] var39 = new byte[var9];
         int var12;
         int var14;
         if (var9 > 1) {
            var39[1] = 1;
            int var13 = 1;
            var12 = 2;

            for(var14 = 2; var14 < var9; ++var14) {
               int var15 = var2.cy((short)-135);
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

         mq[] var40 = new mq[var12];

         mq var41;
         for(var14 = 0; var14 < var40.length; ++var14) {
            var41 = var40[var14] = new mq();
            int var16 = var2.cy((short)-1483);
            if (var16 > 0) {
               var41.ap = new byte[2 * var16];
            }

            var16 = var2.cy((short)-11488);
            if (var16 > 0) {
               var41.aw = new byte[2 * var16 + 2];
               var41.aw[1] = 64;
            }
         }

         var14 = var2.cy((short)-18921);
         byte[] var42 = var14 > 0 ? new byte[var14 * 2] : null;
         var14 = var2.cy((short)-22336);
         byte[] var43 = var14 > 0 ? new byte[var14 * 2] : null;

         int var17;
         for(var17 = 0; 0 != var2.ae[-1689308347 * var2.am + var17]; ++var17) {
         }

         byte[] var18 = new byte[var17];

         int var19;
         for(var19 = 0; var19 < var17; ++var19) {
            var18[var19] = var2.cu((byte)13);
         }

         var2.am += -725588083;
         ++var17;
         var19 = 0;

         int var20;
         for(var20 = 0; var20 < 128; ++var20) {
            var19 += var2.cy((short)-16711);
            this.aj[var20] = (short)var19;
         }

         var19 = 0;

         short[] var51;
         for(var20 = 0; var20 < 128; ++var20) {
            var19 += var2.cy((short)-9348);
            var51 = this.aj;
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

               var22 = var2.dh((byte)27);
            }

            var51 = this.aj;
            var51[var23] = (short)(var51[var23] + ((var22 - 1 & 2) << 14));
            this.at[var23] = var22;
            --var20;
         }

         var20 = 0;
         var21 = 0;
         var23 = 0;

         int var24;
         for(var24 = 0; var24 < 128; ++var24) {
            if (0 != this.at[var24]) {
               if (var20 == 0) {
                  if (var21 < var4.length) {
                     var20 = var4[var21++];
                  } else {
                     var20 = -1;
                  }

                  var23 = var2.ae[var5++] - 1;
               }

               this.ae[var24] = (byte)var23;
               --var20;
            }
         }

         var20 = 0;
         var21 = 0;
         var24 = 0;

         for(int var25 = 0; var25 < 128; ++var25) {
            if (0 != this.at[var25]) {
               if (var20 == 0) {
                  if (var21 < var7.length) {
                     var20 = var7[var21++];
                  } else {
                     var20 = -1;
                  }

                  var24 = var2.ae[var8++] + 16 << 2;
               }

               this.ay[var25] = (byte)var24;
               --var20;
            }
         }

         var20 = 0;
         var21 = 0;
         mq var45 = null;

         int var26;
         for(var26 = 0; var26 < 128; ++var26) {
            if (this.at[var26] != 0) {
               if (var20 == 0) {
                  var45 = var40[var39[var21]];
                  if (var21 < var10.length) {
                     var20 = var10[var21++];
                  } else {
                     var20 = -1;
                  }
               }

               this.as[var26] = var45;
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

               if (this.at[var27] > 0) {
                  var26 = var2.cy((short)-9532) + 1;
               }
            }

            this.ai[var27] = (byte)var26;
            --var20;
         }

         this.ap = (var2.cy((short)-15236) + 1) * -1491336779;

         mq var28;
         int var29;
         for(var27 = 0; var27 < var12; ++var27) {
            var28 = var40[var27];
            if (var28.ap != null) {
               for(var29 = 1; var29 < var28.ap.length; var29 += 2) {
                  var28.ap[var29] = var2.cu((byte)13);
               }
            }

            if (var28.aw != null) {
               for(var29 = 3; var29 < var28.aw.length - 2; var29 += 2) {
                  var28.aw[var29] = var2.cu((byte)13);
               }
            }
         }

         if (null != var42) {
            for(var27 = 1; var27 < var42.length; var27 += 2) {
               var42[var27] = var2.cu((byte)13);
            }
         }

         if (var43 != null) {
            for(var27 = 1; var27 < var43.length; var27 += 2) {
               var43[var27] = var2.cu((byte)13);
            }
         }

         for(var27 = 0; var27 < var12; ++var27) {
            var28 = var40[var27];
            if (null != var28.aw) {
               var19 = 0;

               for(var29 = 2; var29 < var28.aw.length; var29 += 2) {
                  var19 = var19 + 1 + var2.cy((short)-26630);
                  var28.aw[var29] = (byte)var19;
               }
            }
         }

         for(var27 = 0; var27 < var12; ++var27) {
            var28 = var40[var27];
            if (null != var28.ap) {
               var19 = 0;

               for(var29 = 2; var29 < var28.ap.length; var29 += 2) {
                  var19 = 1 + var19 + var2.cy((short)-2051);
                  var28.ap[var29] = (byte)var19;
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
            var19 = var2.cy((short)-22292);
            var42[0] = (byte)var19;

            for(var27 = 2; var27 < var42.length; var27 += 2) {
               var19 = var19 + 1 + var2.cy((short)-14854);
               var42[var27] = (byte)var19;
            }

            var50 = var42[0];
            byte var46 = var42[1];

            for(var29 = 0; var29 < var50; ++var29) {
               this.ai[var29] = (byte)(32 + this.ai[var29] * var46 >> 6);
            }

            for(var29 = 2; var29 < var42.length; var29 += 2) {
               var30 = var42[var29];
               byte var31 = var42[var29 + 1];
               var32 = var46 * (var30 - var50) + (var30 - var50) / 2;

               for(var33 = var50; var33 < var30; ++var33) {
                  var35 = var30 - var50;
                  var36 = var32 >>> 31;
                  var34 = (var32 + var36) / var35 - var36;
                  this.ai[var33] = (byte)(32 + var34 * this.ai[var33] >> 6);
                  var32 += var31 - var46;
               }

               var50 = var30;
               var46 = var31;
            }

            for(var48 = var50; var48 < 128; ++var48) {
               this.ai[var48] = (byte)(32 + this.ai[var48] * var46 >> 6);
            }

            var41 = null;
         }

         if (var43 != null) {
            var19 = var2.cy((short)-394);
            var43[0] = (byte)var19;

            for(var27 = 2; var27 < var43.length; var27 += 2) {
               var19 = 1 + var19 + var2.cy((short)-11664);
               var43[var27] = (byte)var19;
            }

            var50 = var43[0];
            int var47 = var43[1] << 1;

            for(var29 = 0; var29 < var50; ++var29) {
               var48 = var47 + (this.ay[var29] & 255);
               if (var48 < 0) {
                  var48 = 0;
               }

               if (var48 > 128) {
                  var48 = 128;
               }

               this.ay[var29] = (byte)var48;
            }

            int var49;
            for(var29 = 2; var29 < var43.length; var29 += 2) {
               var30 = var43[var29];
               var49 = var43[var29 + 1] << 1;
               var32 = (var30 - var50) / 2 + (var30 - var50) * var47;

               for(var33 = var50; var33 < var30; ++var33) {
                  var35 = var30 - var50;
                  var36 = var32 >>> 31;
                  var34 = (var32 + var36) / var35 - var36;
                  int var37 = (this.ay[var33] & 255) + var34;
                  if (var37 < 0) {
                     var37 = 0;
                  }

                  if (var37 > 128) {
                     var37 = 128;
                  }

                  this.ay[var33] = (byte)var37;
                  var32 += var49 - var47;
               }

               var50 = var30;
               var47 = var49;
            }

            for(var48 = var50; var48 < 128; ++var48) {
               var49 = (this.ay[var48] & 255) + var47;
               if (var49 < 0) {
                  var49 = 0;
               }

               if (var49 > 128) {
                  var49 = 128;
               }

               this.ay[var48] = (byte)var49;
            }

            Object var44 = null;
         }

         for(var27 = 0; var27 < var12; ++var27) {
            var40[var27].ak = var2.cy((short)-17142) * 565661663;
         }

         for(var27 = 0; var27 < var12; ++var27) {
            var28 = var40[var27];
            if (var28.ap != null) {
               var28.aj = var2.cy((short)-16742) * -5479415;
            }

            if (var28.aw != null) {
               var28.ai = var2.cy((short)-18467) * 1244109313;
            }

            if (-45274081 * var28.ak > 0) {
               var28.ay = var2.cy((short)-10613) * -106001503;
            }
         }

         for(var27 = 0; var27 < var12; ++var27) {
            var40[var27].ae = var2.cy((short)-23852) * 1488190223;
         }

         for(var27 = 0; var27 < var12; ++var27) {
            var28 = var40[var27];
            if (1749128175 * var28.ae > 0) {
               var28.as = var2.cy((short)-26193) * 2034941853;
            }
         }

         for(var27 = 0; var27 < var12; ++var27) {
            var28 = var40[var27];
            if (var28.as * -1464811851 > 0) {
               var28.am = var2.cy((short)-12724) * 1593250603;
            }
         }

      } catch (RuntimeException var38) {
         throw tm.aw(var38, "np.<init>(" + ')');
      }
   }

   void ae() {
      this.at = null;
   }

   void am() {
      this.at = null;
   }

   static np aj(pe var0, int var1) {
      byte[] var2 = var0.bf(var1, 501165674);
      return null == var2 ? null : new np(var2);
   }
}
