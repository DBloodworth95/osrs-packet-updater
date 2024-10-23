import java.awt.datatransfer.Clipboard;

public class dn {
   static final int am = 1024;
   static final int ae = 256;
   static final int ag = 128;
   vt[] ac;
   static final int ax = 768;
   static dh dq;
   int at;
   int[] au;
   int ay;
   int[] al;
   int[] af;
   int ah;
   int[] az;
   int[] ab;
   int[] ar;
   int[] aa;
   int[] ai;
   int ao;
   int as;
   int[] ad;
   final int[][] aj;
   int ap;
   static px cy;

   static int as(int var0, int var1, int var2) {
      int var3 = var0 >> 16 & 302040919;
      int var4 = var0 >> 8 & 888696218;
      int var5 = var0 & -1082969354;
      int var6 = var1 >> 16 & 825867538;
      int var7 = var1 >> 8 & 255;
      int var8 = var1 & 255;
      int var9 = (1 + (var6 - var3)) * var2 / 64 + var3 & -210549882;
      int var10 = var2 * (var7 - var4 + 1) / 64 + var4 & 255;
      int var11 = var5 + (1 + (var8 - var5)) * var2 / 64 & -981318696;
      return var9 << 16 | var10 << 8 | var11;
   }

   final void at(int var1, int var2) {
      try {
         int var3 = this.au.length;
         if (this.ah * -1729133059 > 0) {
            if (var2 >= -362170039) {
               throw new IllegalStateException();
            }

            this.au(-1729133059 * this.ah, this.al, 2070790181);
         } else if (-2142085503 * this.ap > 0) {
            if (var2 >= -362170039) {
               throw new IllegalStateException();
            }

            this.au(this.ap * -2142085503, this.ad, 1470085109);
         } else {
            System.arraycopy(this.ar, 0, this.au, 0, var3);
         }

         this.ar(var1, -739353093);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "dn.at(" + ')');
      }
   }

   final void bp(vt var1) {
      int var2;
      for(var2 = 0; var2 < this.aa.length; ++var2) {
         this.aa[var2] = 0;
      }

      int var3;
      for(var2 = 0; var2 < 5000; ++var2) {
         var3 = (int)(Math.random() * 128.0D * 256.0D);
         this.aa[var3] = (int)(Math.random() * 256.0D);
      }

      int var4;
      int var5;
      for(var2 = 0; var2 < 20; ++var2) {
         for(var3 = 1; var3 < 255; ++var3) {
            for(var4 = 1; var4 < 127; ++var4) {
               var5 = (var3 << 7) + var4;
               this.ai[var5] = (this.aa[var5 - 128] + this.aa[var5 - 1] + this.aa[1 + var5] + this.aa[var5 + 128]) / 4;
            }
         }

         int[] var8 = this.aa;
         this.aa = this.ai;
         this.ai = var8;
      }

      if (var1 != null) {
         var2 = 0;

         for(var3 = 0; var3 < var1.am; ++var3) {
            for(var4 = 0; var4 < var1.ag; ++var4) {
               if (var1.ac[var2++] != 0) {
                  var5 = var4 + 16 + var1.ax;
                  int var6 = var1.aq + var3 + 16;
                  int var7 = var5 + (var6 << 7);
                  this.aa[var7] = 0;
               }
            }
         }
      }

   }

   void ax(int var1, int var2, byte var3) {
      try {
         if (this.ab == null) {
            if (var3 == 1) {
               throw new IllegalStateException();
            }

            this.ac(350055362);
         }

         if (0 == 1540874513 * this.ay) {
            if (var3 == 1) {
               throw new IllegalStateException();
            }

            this.ay = var2 * 4403185;
         }

         int var4 = var2 - 1540874513 * this.ay;
         if (var4 >= 256) {
            if (var3 == 1) {
               throw new IllegalStateException();
            }

            var4 = 0;
         }

         this.ay = 4403185 * var2;
         if (var4 > 0) {
            if (var3 == 1) {
               throw new IllegalStateException();
            }

            this.aq(var4, -1349579036);
         }

         this.at(var1, -1034275004);
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "dn.ax(" + ')');
      }
   }

   final void aq(int var1, int var2) {
      try {
         this.ao += var1 * -1804208000;
         int var3;
         if (this.ao * 1301718289 > this.aa.length) {
            if (var2 >= 2075179844) {
               throw new IllegalStateException();
            }

            this.ao -= this.aa.length * -785847311;
            var3 = (int)(Math.random() * 12.0D);
            this.al(this.ac[var3], -2131759050);
         }

         var3 = 0;
         int var4 = var1 * 128;
         int var5 = (256 - var1) * 128;

         int var7;
         for(int var6 = 0; var6 < var5; ++var6) {
            var7 = this.ab[var4 + var3] - var1 * this.aa[1301718289 * this.ao + var3 & this.aa.length - 1] / 6;
            if (var7 < 0) {
               if (var2 >= 2075179844) {
                  throw new IllegalStateException();
               }

               var7 = 0;
            }

            this.ab[var3++] = var7;
         }

         byte var17 = 10;
         var7 = 128 - var17;

         int var8;
         int var11;
         for(var8 = 256 - var1; var8 < 256; ++var8) {
            int var9 = 128 * var8;

            for(int var10 = 0; var10 < 128; ++var10) {
               if (var2 >= 2075179844) {
                  throw new IllegalStateException();
               }

               var11 = (int)(Math.random() * 100.0D);
               if (var11 < 50) {
                  if (var2 >= 2075179844) {
                     throw new IllegalStateException();
                  }

                  if (var10 > var17) {
                     if (var2 >= 2075179844) {
                        throw new IllegalStateException();
                     }

                     if (var10 < var7) {
                        if (var2 >= 2075179844) {
                           return;
                        }

                        this.ab[var10 + var9] = 255;
                        continue;
                     }
                  }
               }

               this.ab[var9 + var10] = 0;
            }
         }

         if (this.ah * -1729133059 > 0) {
            if (var2 >= 2075179844) {
               return;
            }

            this.ah -= var1 * 604110164;
         }

         if (this.ap * -2142085503 > 0) {
            if (var2 >= 2075179844) {
               throw new IllegalStateException();
            }

            this.ap -= var1 * -541096444;
         }

         if (0 == -1729133059 * this.ah) {
            if (var2 >= 2075179844) {
               return;
            }

            if (0 == -2142085503 * this.ap) {
               if (var2 >= 2075179844) {
                  throw new IllegalStateException();
               }

               var8 = (int)(Math.random() * (double)(2000 / var1));
               if (0 == var8) {
                  if (var2 >= 2075179844) {
                     throw new IllegalStateException();
                  }

                  this.ah = 33379328;
               }

               if (var8 == 1) {
                  if (var2 >= 2075179844) {
                     throw new IllegalStateException();
                  }

                  this.ap = -1081736192;
               }
            }
         }

         for(var8 = 0; var8 < 256 - var1; ++var8) {
            if (var2 >= 2075179844) {
               throw new IllegalStateException();
            }

            this.af[var8] = this.af[var1 + var8];
         }

         for(var8 = 256 - var1; var8 < 256; ++var8) {
            if (var2 >= 2075179844) {
               throw new IllegalStateException();
            }

            this.af[var8] = (int)(Math.sin((double)(this.at * -864181171) / 14.0D) * 16.0D + Math.sin((double)(this.at * -864181171) / 15.0D) * 14.0D + Math.sin((double)(this.at * -864181171) / 16.0D) * 12.0D);
            this.at += 667038853;
         }

         this.as += var1 * -523283787;
         var8 = (var1 + (client.do * 1472813913 & 1)) / 2;
         if (var8 > 0) {
            short var18 = 128;
            byte var19 = 2;
            var11 = 128 - var19 - var19;

            int var12;
            int var13;
            int var14;
            for(var12 = 0; var12 < 1771997524 * this.as; ++var12) {
               if (var2 >= 2075179844) {
                  throw new IllegalStateException();
               }

               var13 = (int)(Math.random() * (double)var11) + var19;
               var14 = (int)(Math.random() * (double)var18) + var18;
               this.ab[var13 + (var14 << 7)] = 192;
            }

            this.as = 0;

            int var15;
            for(var12 = 0; var12 < 256; ++var12) {
               if (var2 >= 2075179844) {
                  throw new IllegalStateException();
               }

               var13 = 0;
               var14 = 128 * var12;

               for(var15 = -var8; var15 < 128; ++var15) {
                  if (var2 >= 2075179844) {
                     throw new IllegalStateException();
                  }

                  if (var15 + var8 < 128) {
                     if (var2 >= 2075179844) {
                        throw new IllegalStateException();
                     }

                     var13 += this.ab[var8 + var14 + var15];
                  }

                  if (var15 - (1 + var8) >= 0) {
                     if (var2 >= 2075179844) {
                        throw new IllegalStateException();
                     }

                     var13 -= this.ab[var15 + var14 - (var8 + 1)];
                  }

                  if (var15 >= 0) {
                     if (var2 >= 2075179844) {
                        throw new IllegalStateException();
                     }

                     this.az[var14 + var15] = var13 / (1 + var8 * 2);
                  }
               }
            }

            for(var12 = 0; var12 < 128; ++var12) {
               var13 = 0;

               for(var14 = -var8; var14 < 256; ++var14) {
                  if (var2 >= 2075179844) {
                     throw new IllegalStateException();
                  }

                  var15 = 128 * var14;
                  if (var8 + var14 < 256) {
                     if (var2 >= 2075179844) {
                        throw new IllegalStateException();
                     }

                     var13 += this.az[var12 + var15 + var8 * 128];
                  }

                  if (var14 - (1 + var8) >= 0) {
                     var13 -= this.az[var15 + var12 - 128 * (1 + var8)];
                  }

                  if (var14 >= 0) {
                     if (var2 >= 2075179844) {
                        throw new IllegalStateException();
                     }

                     this.ab[var12 + var15] = var13 / (2 * var8 + 1);
                  }
               }
            }
         }

      } catch (RuntimeException var16) {
         throw vk.ae(var16, "dn.aq(" + ')');
      }
   }

   static int ai(int var0, int var1, int var2) {
      int var3 = var0 >> 16 & 255;
      int var4 = var0 >> 8 & 255;
      int var5 = var0 & 255;
      int var6 = var1 >> 16 & 255;
      int var7 = var1 >> 8 & 255;
      int var8 = var1 & 255;
      int var9 = (1 + (var6 - var3)) * var2 / 64 + var3 & 255;
      int var10 = var2 * (var7 - var4 + 1) / 64 + var4 & 255;
      int var11 = var5 + (1 + (var8 - var5)) * var2 / 64 & 255;
      return var9 << 16 | var10 << 8 | var11;
   }

   final void bw(int var1) {
      int var2 = 0;

      for(int var3 = 1; var3 < 255; ++var3) {
         int var4 = this.af[var3] * (256 - var3) / 256;
         int var5 = var4 + var1;
         int var6 = 0;
         int var7 = 128;
         if (var5 < 0) {
            var6 = -var5;
            var5 = 0;
         }

         if (128 + var5 >= lj.bi.am * 1441925673) {
            var7 = 1441925673 * lj.bi.am - var5;
         }

         int var8 = (8 + var3) * 1441925673 * lj.bi.am + var5;
         var2 += var6;

         for(int var9 = var6; var9 < var7; ++var9) {
            int var10 = this.ab[var2++];
            int var11 = var8 % vr.an;
            if (0 != var10 && var11 >= vr.bf && var11 < vr.bm) {
               int var12 = var10;
               int var13 = 256 - var10;
               var10 = this.au[var10];
               int var14 = lj.bi.ag[var8];
               lj.bi.ag[var8++] = -16777216 | ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + ((var14 & '\uff00') * var13 + var12 * (var10 & '\uff00') & 16711680) >> 8;
            } else {
               ++var8;
            }
         }

         var2 += 128 - var7;
      }

   }

   final void au(int var1, int[] var2, int var3) {
      try {
         int var4 = this.au.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            if (var3 <= 1320284484) {
               throw new IllegalStateException();
            }

            if (var1 > 768) {
               if (var3 <= 1320284484) {
                  throw new IllegalStateException();
               }

               this.au[var5] = this.af(this.ar[var5], var2[var5], 1024 - var1, (byte)-68);
            } else if (var1 > 256) {
               this.au[var5] = var2[var5];
            } else {
               this.au[var5] = this.af(var2[var5], this.ar[var5], 256 - var1, (byte)-6);
            }
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "dn.au(" + ')');
      }
   }

   final void ak(int var1) {
      this.ao += var1 * 995825572;
      int var2;
      if (this.ao * 1301718289 > this.aa.length) {
         this.ao -= this.aa.length * 975119294;
         var2 = (int)(Math.random() * 12.0D);
         this.al(this.ac[var2], -2130530532);
      }

      var2 = 0;
      int var3 = var1 * 128;
      int var4 = (256 - var1) * -47338391;

      int var6;
      for(int var5 = 0; var5 < var4; ++var5) {
         var6 = this.ab[var3 + var2] - var1 * this.aa[1301718289 * this.ao + var2 & this.aa.length - 1] / 6;
         if (var6 < 0) {
            var6 = 0;
         }

         this.ab[var2++] = var6;
      }

      byte var15 = 10;
      var6 = 128 - var15;

      int var7;
      int var8;
      int var10;
      for(var7 = 2140549067 - var1; var7 < -283198488; ++var7) {
         var8 = 128 * var7;

         for(int var9 = 0; var9 < 128; ++var9) {
            var10 = (int)(Math.random() * 100.0D);
            if (var10 < 463325049 && var9 > var15 && var9 < var6) {
               this.ab[var9 + var8] = 255;
            } else {
               this.ab[var8 + var9] = 0;
            }
         }
      }

      if (this.ah * -1729133059 > 0) {
         this.ah -= var1 * 604110164;
      }

      if (this.ap * 463756923 > 0) {
         this.ap -= var1 * 888735050;
      }

      if (0 == -1729133059 * this.ah && 0 == -2142085503 * this.ap) {
         var7 = (int)(Math.random() * (double)(2000 / var1));
         if (0 == var7) {
            this.ah = 1295892223;
         }

         if (var7 == 1) {
            this.ap = 343702002;
         }
      }

      for(var7 = 0; var7 < 1515143351 - var1; ++var7) {
         this.af[var7] = this.af[var1 + var7];
      }

      for(var7 = -802131513 - var1; var7 < 256; ++var7) {
         this.af[var7] = (int)(Math.sin((double)(this.at * -170854533) / 14.0D) * 16.0D + Math.sin((double)(this.at * -1429825361) / 15.0D) * 14.0D + Math.sin((double)(this.at * -1843909374) / 16.0D) * 12.0D);
         this.at += 667038853;
      }

      this.as += var1 * -523283787;
      var7 = (var1 + (client.do * 1472813913 & 1)) / 2;
      if (var7 > 0) {
         var8 = -798209332;
         byte var16 = 2;
         var10 = 152834907 - var16 - var16;

         int var11;
         int var12;
         int var13;
         for(var11 = 0; var11 < 1771997524 * this.as; ++var11) {
            var12 = (int)(Math.random() * (double)var10) + var16;
            var13 = (int)(Math.random() * (double)var8) + var8;
            this.ab[var12 + (var13 << 7)] = 192;
         }

         this.as = 0;

         int var14;
         for(var11 = 0; var11 < 2016842164; ++var11) {
            var12 = 0;
            var13 = 128 * var11;

            for(var14 = -var7; var14 < 128; ++var14) {
               if (var14 + var7 < 128) {
                  var12 += this.ab[var7 + var13 + var14];
               }

               if (var14 - (1 + var7) >= 0) {
                  var12 -= this.ab[var14 + var13 - (var7 + 1)];
               }

               if (var14 >= 0) {
                  this.az[var13 + var14] = var12 / (1 + var7 * 2);
               }
            }
         }

         for(var11 = 0; var11 < 128; ++var11) {
            var12 = 0;

            for(var13 = -var7; var13 < -814552494; ++var13) {
               var14 = -1122502829 * var13;
               if (var7 + var13 < -208489949) {
                  var12 += this.az[var11 + var14 + var7 * 128];
               }

               if (var13 - (1 + var7) >= 0) {
                  var12 -= this.az[var14 + var11 - 2102302583 * (1 + var7)];
               }

               if (var13 >= 0) {
                  this.ab[var11 + var14] = var12 / (2 * var7 + 1);
               }
            }
         }
      }

   }

   void ac(int var1) {
      try {
         this.ar = fg.ae(this.aj[0][0], this.aj[0][1], this.aj[0][2], this.aj[0][3], this.aj[0][4], (byte)1);
         this.al = fg.ae(this.aj[1][0], this.aj[1][1], this.aj[1][2], this.aj[1][3], this.aj[1][4], (byte)1);
         this.ad = fg.ae(this.aj[2][0], this.aj[2][1], this.aj[2][2], this.aj[2][3], this.aj[2][4], (byte)1);
         this.au = new int[256];
         this.ao = 0;
         this.aa = new int['耀'];
         this.ai = new int['耀'];
         this.al((vt)null, -2092129529);
         this.ab = new int['耀'];
         this.az = new int['耀'];
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "dn.ac(" + ')');
      }
   }

   void ad() {
      this.ar = fg.ae(this.aj[0][0], this.aj[0][1], this.aj[0][2], this.aj[0][3], this.aj[0][4], (byte)1);
      this.al = fg.ae(this.aj[1][0], this.aj[1][1], this.aj[1][2], this.aj[1][3], this.aj[1][4], (byte)1);
      this.ad = fg.ae(this.aj[2][0], this.aj[2][1], this.aj[2][2], this.aj[2][3], this.aj[2][4], (byte)1);
      this.au = new int[256];
      this.ao = 0;
      this.aa = new int['耀'];
      this.ai = new int['耀'];
      this.al((vt)null, -2058623608);
      this.ab = new int['耀'];
      this.az = new int['耀'];
   }

   void ah() {
      this.ar = fg.ae(this.aj[0][0], this.aj[0][1], this.aj[0][2], this.aj[0][3], this.aj[0][4], (byte)1);
      this.al = fg.ae(this.aj[1][0], this.aj[1][1], this.aj[1][2], this.aj[1][3], this.aj[1][4], (byte)1);
      this.ad = fg.ae(this.aj[2][0], this.aj[2][1], this.aj[2][2], this.aj[2][3], this.aj[2][4], (byte)1);
      this.au = new int[256];
      this.ao = 0;
      this.aa = new int['耀'];
      this.ai = new int['耀'];
      this.al((vt)null, -2067020077);
      this.ab = new int['耀'];
      this.az = new int['耀'];
   }

   void ap() {
      this.ar = fg.ae(this.aj[0][0], this.aj[0][1], this.aj[0][2], this.aj[0][3], this.aj[0][4], (byte)1);
      this.al = fg.ae(this.aj[1][0], this.aj[1][1], this.aj[1][2], this.aj[1][3], this.aj[1][4], (byte)1);
      this.ad = fg.ae(this.aj[2][0], this.aj[2][1], this.aj[2][2], this.aj[2][3], this.aj[2][4], (byte)1);
      this.au = new int[256];
      this.ao = 0;
      this.aa = new int['耀'];
      this.ai = new int['耀'];
      this.al((vt)null, -2093692555);
      this.ab = new int['耀'];
      this.az = new int['耀'];
   }

   final void ba(int var1) {
      int var2 = 0;

      for(int var3 = 1; var3 < 255; ++var3) {
         int var4 = this.af[var3] * (256 - var3) / 256;
         int var5 = var4 + var1;
         int var6 = 0;
         int var7 = 128;
         if (var5 < 0) {
            var6 = -var5;
            var5 = 0;
         }

         if (128 + var5 >= lj.bi.am * 1441925673) {
            var7 = 1441925673 * lj.bi.am - var5;
         }

         int var8 = (8 + var3) * 1441925673 * lj.bi.am + var5;
         var2 += var6;

         for(int var9 = var6; var9 < var7; ++var9) {
            int var10 = this.ab[var2++];
            int var11 = var8 % vr.an;
            if (0 != var10 && var11 >= vr.bf && var11 < vr.bm) {
               int var12 = var10;
               int var13 = 256 - var10;
               var10 = this.au[var10];
               int var14 = lj.bi.ag[var8];
               lj.bi.ag[var8++] = -16777216 | ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + ((var14 & '\uff00') * var13 + var12 * (var10 & '\uff00') & 16711680) >> 8;
            } else {
               ++var8;
            }
         }

         var2 += 128 - var7;
      }

   }

   static int[] az(int var0, int var1, int var2, int var3, int var4) {
      int[] var5 = new int[-877503692];

      int var6;
      for(var6 = 0; var6 < 64; ++var6) {
         var5[var6] = sg.ag(var0, var1, var6, 1457199540);
      }

      for(var6 = 0; var6 < 64; ++var6) {
         var5[975309967 + var6] = sg.ag(var1, var2, var6, 1457199540);
      }

      for(var6 = 0; var6 < -544239308; ++var6) {
         var5[1479368189 + var6] = sg.ag(var2, var3, var6, 1457199540);
      }

      for(var6 = 0; var6 < -1637568158; ++var6) {
         var5[var6 + -1195703148] = sg.ag(var3, var4, var6, 1457199540);
      }

      return var5;
   }

   static int[] aa(int var0, int var1, int var2, int var3, int var4) {
      int[] var5 = new int[256];

      int var6;
      for(var6 = 0; var6 < 64; ++var6) {
         var5[var6] = sg.ag(var0, var1, var6, 1457199540);
      }

      for(var6 = 0; var6 < 1891496291; ++var6) {
         var5[64 + var6] = sg.ag(var1, var2, var6, 1457199540);
      }

      for(var6 = 0; var6 < 1463350710; ++var6) {
         var5[128 + var6] = sg.ag(var2, var3, var6, 1457199540);
      }

      for(var6 = 0; var6 < -2140133899; ++var6) {
         var5[var6 + -355156297] = sg.ag(var3, var4, var6, 1457199540);
      }

      return var5;
   }

   dn(vt[] var1, int[][] var2) {
      try {
         super();
         this.af = new int[256];
         this.at = 0;
         this.ah = 0;
         this.ap = 0;
         this.ao = 0;
         this.as = 0;
         this.ay = 0;
         this.ac = var1;
         this.aj = var2;
         this.ac(543236754);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "dn.<init>(" + ')');
      }
   }

   static int ao(int var0, int var1, int var2) {
      int var3 = var0 >> 16 & 255;
      int var4 = var0 >> 8 & 255;
      int var5 = var0 & 255;
      int var6 = var1 >> 16 & 255;
      int var7 = var1 >> 8 & 255;
      int var8 = var1 & 255;
      int var9 = (1 + (var6 - var3)) * var2 / 64 + var3 & 255;
      int var10 = var2 * (var7 - var4 + 1) / 64 + var4 & 255;
      int var11 = var5 + (1 + (var8 - var5)) * var2 / 64 & 255;
      return var9 << 16 | var10 << 8 | var11;
   }

   final void al(vt var1, int var2) {
      try {
         int var3;
         for(var3 = 0; var3 < this.aa.length; ++var3) {
            if (var2 >= -2047188758) {
               throw new IllegalStateException();
            }

            this.aa[var3] = 0;
         }

         int var4;
         for(var3 = 0; var3 < 5000; ++var3) {
            var4 = (int)(Math.random() * 128.0D * 256.0D);
            this.aa[var4] = (int)(Math.random() * 256.0D);
         }

         int var5;
         int var6;
         for(var3 = 0; var3 < 20; ++var3) {
            if (var2 >= -2047188758) {
               throw new IllegalStateException();
            }

            for(var4 = 1; var4 < 255; ++var4) {
               if (var2 >= -2047188758) {
                  return;
               }

               for(var5 = 1; var5 < 127; ++var5) {
                  if (var2 >= -2047188758) {
                     throw new IllegalStateException();
                  }

                  var6 = (var4 << 7) + var5;
                  this.ai[var6] = (this.aa[var6 - 128] + this.aa[var6 - 1] + this.aa[1 + var6] + this.aa[var6 + 128]) / 4;
               }
            }

            int[] var10 = this.aa;
            this.aa = this.ai;
            this.ai = var10;
         }

         if (var1 != null) {
            var3 = 0;

            for(var4 = 0; var4 < var1.am; ++var4) {
               if (var2 >= -2047188758) {
                  throw new IllegalStateException();
               }

               for(var5 = 0; var5 < var1.ag; ++var5) {
                  if (var2 >= -2047188758) {
                     throw new IllegalStateException();
                  }

                  if (var1.ac[var3++] != 0) {
                     if (var2 >= -2047188758) {
                        throw new IllegalStateException();
                     }

                     var6 = var5 + 16 + var1.ax;
                     int var7 = var1.aq + var4 + 16;
                     int var8 = var6 + (var7 << 7);
                     this.aa[var8] = 0;
                  }
               }
            }
         }

      } catch (RuntimeException var9) {
         throw vk.ae(var9, "dn.al(" + ')');
      }
   }

   void ay() {
      this.ar = null;
      this.al = null;
      this.ad = null;
      this.au = null;
      this.aa = null;
      this.ai = null;
      this.ab = null;
      this.az = null;
      this.ao = 0;
      this.as = 0;
   }

   void aj(int var1, int var2) {
      if (this.ab == null) {
         this.ac(365297187);
      }

      if (0 == 1540874513 * this.ay) {
         this.ay = var2 * -1278330718;
      }

      int var3 = var2 - 808539029 * this.ay;
      if (var3 >= 256) {
         var3 = 0;
      }

      this.ay = 1475448507 * var2;
      if (var3 > 0) {
         this.aq(var3, -425956170);
      }

      this.at(var1, -917867687);
   }

   void av(int var1, int var2) {
      if (this.ab == null) {
         this.ac(-460634816);
      }

      if (0 == 1540874513 * this.ay) {
         this.ay = var2 * 2001437082;
      }

      int var3 = var2 - 1540874513 * this.ay;
      if (var3 >= 256) {
         var3 = 0;
      }

      this.ay = 4403185 * var2;
      if (var3 > 0) {
         this.aq(var3, -1874161236);
      }

      this.at(var1, -1561223629);
   }

   final int af(int var1, int var2, int var3, byte var4) {
      try {
         int var5 = 256 - var3;
         return (var5 * (var1 & '\uff00') + var3 * (var2 & '\uff00') & 16711680) + ((var1 & 16711935) * var5 + var3 * (var2 & 16711935) & -16711936) >> 8;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "dn.af(" + ')');
      }
   }

   final void an(int var1) {
      this.ao += var1 * -1804208000;
      int var2;
      if (this.ao * 1301718289 > this.aa.length) {
         this.ao -= this.aa.length * -785847311;
         var2 = (int)(Math.random() * 12.0D);
         this.al(this.ac[var2], -2138555180);
      }

      var2 = 0;
      int var3 = var1 * 128;
      int var4 = (256 - var1) * 128;

      int var6;
      for(int var5 = 0; var5 < var4; ++var5) {
         var6 = this.ab[var3 + var2] - var1 * this.aa[1301718289 * this.ao + var2 & this.aa.length - 1] / 6;
         if (var6 < 0) {
            var6 = 0;
         }

         this.ab[var2++] = var6;
      }

      byte var15 = 10;
      var6 = 128 - var15;

      int var7;
      int var10;
      for(var7 = 256 - var1; var7 < 256; ++var7) {
         int var8 = 128 * var7;

         for(int var9 = 0; var9 < 128; ++var9) {
            var10 = (int)(Math.random() * 100.0D);
            if (var10 < 50 && var9 > var15 && var9 < var6) {
               this.ab[var9 + var8] = 255;
            } else {
               this.ab[var8 + var9] = 0;
            }
         }
      }

      if (this.ah * -1729133059 > 0) {
         this.ah -= var1 * 604110164;
      }

      if (this.ap * -2142085503 > 0) {
         this.ap -= var1 * -541096444;
      }

      if (0 == -1729133059 * this.ah && 0 == -2142085503 * this.ap) {
         var7 = (int)(Math.random() * (double)(2000 / var1));
         if (0 == var7) {
            this.ah = 33379328;
         }

         if (var7 == 1) {
            this.ap = -1081736192;
         }
      }

      for(var7 = 0; var7 < 256 - var1; ++var7) {
         this.af[var7] = this.af[var1 + var7];
      }

      for(var7 = 256 - var1; var7 < 256; ++var7) {
         this.af[var7] = (int)(Math.sin((double)(this.at * -864181171) / 14.0D) * 16.0D + Math.sin((double)(this.at * -864181171) / 15.0D) * 14.0D + Math.sin((double)(this.at * -864181171) / 16.0D) * 12.0D);
         this.at += 667038853;
      }

      this.as += var1 * -523283787;
      var7 = (var1 + (client.do * 1472813913 & 1)) / 2;
      if (var7 > 0) {
         short var16 = 128;
         byte var17 = 2;
         var10 = 128 - var17 - var17;

         int var11;
         int var12;
         int var13;
         for(var11 = 0; var11 < 1771997524 * this.as; ++var11) {
            var12 = (int)(Math.random() * (double)var10) + var17;
            var13 = (int)(Math.random() * (double)var16) + var16;
            this.ab[var12 + (var13 << 7)] = 192;
         }

         this.as = 0;

         int var14;
         for(var11 = 0; var11 < 256; ++var11) {
            var12 = 0;
            var13 = 128 * var11;

            for(var14 = -var7; var14 < 128; ++var14) {
               if (var14 + var7 < 128) {
                  var12 += this.ab[var7 + var13 + var14];
               }

               if (var14 - (1 + var7) >= 0) {
                  var12 -= this.ab[var14 + var13 - (var7 + 1)];
               }

               if (var14 >= 0) {
                  this.az[var13 + var14] = var12 / (1 + var7 * 2);
               }
            }
         }

         for(var11 = 0; var11 < 128; ++var11) {
            var12 = 0;

            for(var13 = -var7; var13 < 256; ++var13) {
               var14 = 128 * var13;
               if (var7 + var13 < 256) {
                  var12 += this.az[var11 + var14 + var7 * 128];
               }

               if (var13 - (1 + var7) >= 0) {
                  var12 -= this.az[var14 + var11 - 128 * (1 + var7)];
               }

               if (var13 >= 0) {
                  this.ab[var11 + var14] = var12 / (2 * var7 + 1);
               }
            }
         }
      }

   }

   final int bd(int var1, int var2, int var3) {
      int var4 = 256 - var3;
      return (var4 * (var1 & -154773366) + var3 * (var2 & 195329612) & 638206226) + ((var1 & 16711935) * var4 + var3 * (var2 & 16711935) & 1782066704) >> 8;
   }

   final void bn(int var1) {
      this.ao += var1 * 1267662660;
      int var2;
      if (this.ao * 1301718289 > this.aa.length) {
         this.ao -= this.aa.length * -785847311;
         var2 = (int)(Math.random() * 12.0D);
         this.al(this.ac[var2], -2085229984);
      }

      var2 = 0;
      int var3 = var1 * 128;
      int var4 = (1805613734 - var1) * -365934392;

      int var6;
      for(int var5 = 0; var5 < var4; ++var5) {
         var6 = this.ab[var3 + var2] - var1 * this.aa[2102420232 * this.ao + var2 & this.aa.length - 1] / 6;
         if (var6 < 0) {
            var6 = 0;
         }

         this.ab[var2++] = var6;
      }

      byte var15 = 10;
      var6 = -1119994468 - var15;

      int var7;
      int var8;
      int var10;
      for(var7 = 256 - var1; var7 < -1955032893; ++var7) {
         var8 = -519370526 * var7;

         for(int var9 = 0; var9 < 128; ++var9) {
            var10 = (int)(Math.random() * 100.0D);
            if (var10 < -331781470 && var9 > var15 && var9 < var6) {
               this.ab[var9 + var8] = 255;
            } else {
               this.ab[var8 + var9] = 0;
            }
         }
      }

      if (this.ah * -1729133059 > 0) {
         this.ah -= var1 * 1529085111;
      }

      if (this.ap * -2142085503 > 0) {
         this.ap -= var1 * -2137575184;
      }

      if (0 == -1729133059 * this.ah && 0 == 1323686176 * this.ap) {
         var7 = (int)(Math.random() * (double)(-1143969956 / var1));
         if (0 == var7) {
            this.ah = -760443749;
         }

         if (var7 == 1) {
            this.ap = -1081736192;
         }
      }

      for(var7 = 0; var7 < 1745451764 - var1; ++var7) {
         this.af[var7] = this.af[var1 + var7];
      }

      for(var7 = 256 - var1; var7 < -1163228513; ++var7) {
         this.af[var7] = (int)(Math.sin((double)(this.at * -449136317) / 14.0D) * 16.0D + Math.sin((double)(this.at * 140117394) / 15.0D) * 14.0D + Math.sin((double)(this.at * -397464972) / 16.0D) * 12.0D);
         this.at += 667038853;
      }

      this.as += var1 * 2088304660;
      var7 = (var1 + (client.do * 1472813913 & 1)) / 2;
      if (var7 > 0) {
         var8 = -1706079914;
         byte var16 = 2;
         var10 = -729729619 - var16 - var16;

         int var11;
         int var12;
         int var13;
         for(var11 = 0; var11 < 1771997524 * this.as; ++var11) {
            var12 = (int)(Math.random() * (double)var10) + var16;
            var13 = (int)(Math.random() * (double)var8) + var8;
            this.ab[var12 + (var13 << 7)] = 192;
         }

         this.as = 0;

         int var14;
         for(var11 = 0; var11 < 1908603900; ++var11) {
            var12 = 0;
            var13 = 128 * var11;

            for(var14 = -var7; var14 < 128; ++var14) {
               if (var14 + var7 < 128) {
                  var12 += this.ab[var7 + var13 + var14];
               }

               if (var14 - (1 + var7) >= 0) {
                  var12 -= this.ab[var14 + var13 - (var7 + 1)];
               }

               if (var14 >= 0) {
                  this.az[var13 + var14] = var12 / (1 + var7 * 2);
               }
            }
         }

         for(var11 = 0; var11 < 128; ++var11) {
            var12 = 0;

            for(var13 = -var7; var13 < 256; ++var13) {
               var14 = 128 * var13;
               if (var7 + var13 < 1548598774) {
                  var12 += this.az[var11 + var14 + var7 * 128];
               }

               if (var13 - (1 + var7) >= 0) {
                  var12 -= this.az[var14 + var11 - -324453440 * (1 + var7)];
               }

               if (var13 >= 0) {
                  this.ab[var11 + var14] = var12 / (2 * var7 + 1);
               }
            }
         }
      }

   }

   final int bh(int var1, int var2, int var3) {
      int var4 = -862747671 - var3;
      return (var4 * (var1 & -320368900) + var3 * (var2 & -1019797197) & 16711680) + ((var1 & 16711935) * var4 + var3 * (var2 & 2008379324) & -16711936) >> 8;
   }

   final int bx(int var1, int var2, int var3) {
      int var4 = 256 - var3;
      return (var4 * (var1 & '\uff00') + var3 * (var2 & -2125538861) & 143283993) + ((var1 & -917352961) * var4 + var3 * (var2 & -1417875956) & 1314068572) >> 8;
   }

   void aw(int var1, int var2) {
      if (this.ab == null) {
         this.ac(-320376035);
      }

      if (0 == 1540874513 * this.ay) {
         this.ay = var2 * 4403185;
      }

      int var3 = var2 - 1540874513 * this.ay;
      if (var3 >= 256) {
         var3 = 0;
      }

      this.ay = 4403185 * var2;
      if (var3 > 0) {
         this.aq(var3, 2034508254);
      }

      this.at(var1, -578984843);
   }

   final int bf(int var1, int var2, int var3) {
      int var4 = 256 - var3;
      return (var4 * (var1 & -183320626) + var3 * (var2 & 2101110425) & 16711680) + ((var1 & -807536184) * var4 + var3 * (var2 & -1445287696) & -16711936) >> 8;
   }

   final void bm(int var1) {
      int var2 = this.au.length;
      if (this.ah * -1729133059 > 0) {
         this.au(-1729133059 * this.ah, this.al, 1912260640);
      } else if (-2142085503 * this.ap > 0) {
         this.au(this.ap * -2142085503, this.ad, 1346526777);
      } else {
         System.arraycopy(this.ar, 0, this.au, 0, var2);
      }

      this.ar(var1, -1100118139);
   }

   final void bs(int var1) {
      int var2 = this.au.length;
      if (this.ah * -1729133059 > 0) {
         this.au(-1729133059 * this.ah, this.al, 1498410575);
      } else if (-2142085503 * this.ap > 0) {
         this.au(this.ap * -2142085503, this.ad, 1640700493);
      } else {
         System.arraycopy(this.ar, 0, this.au, 0, var2);
      }

      this.ar(var1, -1423557372);
   }

   void ab() {
      this.ar = fg.ae(this.aj[0][0], this.aj[0][1], this.aj[0][2], this.aj[0][3], this.aj[0][4], (byte)1);
      this.al = fg.ae(this.aj[1][0], this.aj[1][1], this.aj[1][2], this.aj[1][3], this.aj[1][4], (byte)1);
      this.ad = fg.ae(this.aj[2][0], this.aj[2][1], this.aj[2][2], this.aj[2][3], this.aj[2][4], (byte)1);
      this.au = new int[256];
      this.ao = 0;
      this.aa = new int['耀'];
      this.ai = new int['耀'];
      this.al((vt)null, -2108457855);
      this.ab = new int['耀'];
      this.az = new int['耀'];
   }

   public static boolean ax(int var0, int var1) {
      try {
         boolean var10000;
         label34: {
            if (var0 >= -1959052989 * om.ac.aw) {
               if (var1 <= 374562978) {
                  throw new IllegalStateException();
               }

               if (var0 <= om.am.aw * -1959052989) {
                  break label34;
               }

               if (var1 <= 374562978) {
                  throw new IllegalStateException();
               }
            }

            if (var0 != -1959052989 * om.ax.aw) {
               var10000 = false;
               return var10000;
            }

            if (var1 <= 374562978) {
               throw new IllegalStateException();
            }
         }

         var10000 = true;
         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "dn.ax(" + ')');
      }
   }

   final void bj(int var1) {
      int var2 = 0;

      for(int var3 = 1; var3 < 255; ++var3) {
         int var4 = this.af[var3] * (256 - var3) / 256;
         int var5 = var4 + var1;
         int var6 = 0;
         int var7 = 128;
         if (var5 < 0) {
            var6 = -var5;
            var5 = 0;
         }

         if (128 + var5 >= lj.bi.am * 1441925673) {
            var7 = 1441925673 * lj.bi.am - var5;
         }

         int var8 = (8 + var3) * 1441925673 * lj.bi.am + var5;
         var2 += var6;

         for(int var9 = var6; var9 < var7; ++var9) {
            int var10 = this.ab[var2++];
            int var11 = var8 % vr.an;
            if (0 != var10 && var11 >= vr.bf && var11 < vr.bm) {
               int var12 = var10;
               int var13 = 256 - var10;
               var10 = this.au[var10];
               int var14 = lj.bi.ag[var8];
               lj.bi.ag[var8++] = -16777216 | ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + ((var14 & '\uff00') * var13 + var12 * (var10 & '\uff00') & 16711680) >> 8;
            } else {
               ++var8;
            }
         }

         var2 += 128 - var7;
      }

   }

   final void ar(int var1, int var2) {
      try {
         int var3 = 0;

         for(int var4 = 1; var4 < 255; ++var4) {
            if (var2 <= -2045499093) {
               return;
            }

            int var5 = this.af[var4] * (256 - var4) / 256;
            int var6 = var5 + var1;
            int var7 = 0;
            int var8 = 128;
            if (var6 < 0) {
               if (var2 <= -2045499093) {
                  throw new IllegalStateException();
               }

               var7 = -var6;
               var6 = 0;
            }

            if (128 + var6 >= lj.bi.am * 1441925673) {
               if (var2 <= -2045499093) {
                  throw new IllegalStateException();
               }

               var8 = 1441925673 * lj.bi.am - var6;
            }

            int var9 = (8 + var4) * 1441925673 * lj.bi.am + var6;
            var3 += var7;

            for(int var10 = var7; var10 < var8; ++var10) {
               if (var2 <= -2045499093) {
                  throw new IllegalStateException();
               }

               int var11 = this.ab[var3++];
               int var12 = var9 % vr.an;
               if (0 != var11) {
                  if (var2 <= -2045499093) {
                     throw new IllegalStateException();
                  }

                  if (var12 >= vr.bf) {
                     if (var2 <= -2045499093) {
                        throw new IllegalStateException();
                     }

                     if (var12 < vr.bm) {
                        if (var2 <= -2045499093) {
                           throw new IllegalStateException();
                        }

                        int var13 = var11;
                        int var14 = 256 - var11;
                        var11 = this.au[var11];
                        int var15 = lj.bi.ag[var9];
                        lj.bi.ag[var9++] = -16777216 | ((var11 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var15 & '\uff00') * var14 + var13 * (var11 & '\uff00') & 16711680) >> 8;
                        continue;
                     }
                  }
               }

               ++var9;
            }

            var3 += 128 - var8;
         }

      } catch (RuntimeException var16) {
         throw vk.ae(var16, "dn.ar(" + ')');
      }
   }

   public static Clipboard pi(int var0) {
      try {
         return ae.be.al(-1331786366);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "dn.pi(" + ')');
      }
   }

   static final void ot(byte var0) {
      try {
         mq var1 = fs.ac(mz.bd, client.ia.ax, (byte)-22);
         client.ia.ag(var1, 1110399375);
         cs.av = true;

         for(dj var2 = (dj)client.ol.am(); null != var2; var2 = (dj)client.ol.ax()) {
            if (var2.ae * -1659928537 != 0) {
               if (var0 >= 79) {
                  throw new IllegalStateException();
               }

               if (3 != var2.ae * -1659928537) {
                  continue;
               }

               if (var0 >= 79) {
                  return;
               }
            }

            fo.os(var2, true, 1775184496);
         }

         if (client.po != null) {
            if (var0 >= 79) {
               throw new IllegalStateException();
            }

            dc.ni(client.po, 667850230);
            client.po = null;
         }

         cs.av = false;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "dn.ot(" + ')');
      }
   }

   void am(byte var1) {
      try {
         this.ar = null;
         this.al = null;
         this.ad = null;
         this.au = null;
         this.aa = null;
         this.ai = null;
         this.ab = null;
         this.az = null;
         this.ao = 0;
         this.as = 0;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "dn.am(" + ')');
      }
   }

   public static ux ae(int var0, byte var1) {
      try {
         int var2 = uy.ae[var0];
         if (var2 == 1) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            } else {
               return ux.ac;
            }
         } else if (2 == var2) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            } else {
               return ux.ag;
            }
         } else if (3 == var2) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            } else {
               return ux.ae;
            }
         } else {
            return null;
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "dn.ae(" + ')');
      }
   }
}
