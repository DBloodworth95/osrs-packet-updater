import java.math.BigInteger;

public class vl extends tw {
   public int am;
   public byte[] ae;
   static int[] at = new int[256];
   public static long[] an;
   static final long ao = -3932672073523589310L;
   public static final int ay = 10000;

   public void df(int[] var1, int var2) {
      try {
         int var3 = -1689308347 * this.am / 8;
         this.am = 0;

         for(int var4 = 0; var4 < var3; ++var4) {
            if (var2 >= -1090019306) {
               throw new IllegalStateException();
            }

            int var5 = this.ch(1203709469);
            int var6 = this.ch(1203709469);
            int var7 = 0;
            int var8 = -1640531527;

            for(int var9 = 32; var9-- > 0; var6 += (var5 << 4 ^ var5 >>> 5) + var5 ^ var1[var7 >>> 11 & 3] + var7) {
               if (var2 >= -1090019306) {
                  throw new IllegalStateException();
               }

               var5 += (var6 << 4 ^ var6 >>> 5) + var6 ^ var1[var7 & 3] + var7;
               var7 += var8;
            }

            this.am -= -1509737368;
            this.bw(var5, (byte)44);
            this.bw(var6, (byte)126);
         }

      } catch (RuntimeException var10) {
         throw tm.aw(var10, "vl.df(" + ')');
      }
   }

   public vl(int var1, boolean var2) {
      try {
         super();
         this.ae = rt.aw(var1, var2, 2064049435);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.<init>(" + ')');
      }
   }

   public vl(int var1) {
      try {
         super();
         byte[] var2 = rt.aw(var1, false, 535918245);
         this.ae = var2;
         this.am = 0;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.<init>(" + ')');
      }
   }

   public void ft(long var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)((int)(var1 >> 40));
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)((int)(var1 >> 32));
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)((int)(var1 >> 24));
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)((int)(var1 >> 16));
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)((int)(var1 >> 8));
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)((int)var1);
   }

   public void bo(int var1, int var2) {
      try {
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.bo(" + ')');
      }
   }

   public void eu(byte[] var1, int var2, int var3, int var4) {
      try {
         for(int var5 = var2 + var3 - 1; var5 >= var2; --var5) {
            if (var4 == -496694116) {
               throw new IllegalStateException();
            }

            var1[var5] = this.ae[(this.am += -725588083) * -1689308347 - 1];
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "vl.eu(" + ')');
      }
   }

   public void ba(int var1, int var2) {
      try {
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 16);
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.ba(" + ')');
      }
   }

   public void bw(int var1, byte var2) {
      try {
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 24);
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 16);
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.bw(" + ')');
      }
   }

   public boolean je() {
      this.am -= 1392614964;
      int var1 = hx.bs(this.ae, 0, -1689308347 * this.am, 710026895);
      int var2 = this.ch(1203709469);
      return var1 == var2;
   }

   public int nx() {
      this.am += -1970370234;
      return ((this.ae[this.am * -1872907088 - 3] & -1418239963) << 8) + ((this.ae[-1689308347 * this.am - 1] & 1276417173) << 24) + ((this.ae[this.am * -1825331420 - 2] & 357032701) << 16) + (this.ae[this.am * -1689308347 - 4] & 2119752295);
   }

   public void bg(boolean var1, int var2) {
      try {
         byte var10001;
         if (var1) {
            if (var2 != 1445337563) {
               throw new IllegalStateException();
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         this.bo(var10001, -123302158);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.bg(" + ')');
      }
   }

   public void be(String var1, byte var2) {
      try {
         int var3 = var1.indexOf(0);
         if (var3 >= 0) {
            if (var2 > 4) {
               throw new IllegalArgumentException("");
            }
         } else {
            this.am += pg.ay(var1, 0, var1.length(), this.ae, this.am * -1689308347, (byte)93) * -725588083;
            this.ae[(this.am += -725588083) * -1689308347 - 1] = 0;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "vl.be(" + ')');
      }
   }

   public int ke() {
      return this.ae[(this.am += 1707752383) * -1689308347 - 1] - -2003829232 & 255;
   }

   public void cd(CharSequence var1, int var2) {
      try {
         int var3 = fs.ap(var1, 290668091);
         this.ae[(this.am += -725588083) * -1689308347 - 1] = 0;
         this.cv(var3, 263036075);
         int var4 = this.am;
         byte[] var6 = this.ae;
         int var7 = -1689308347 * this.am;
         int var8 = var1.length();
         int var9 = var7;

         for(int var10 = 0; var10 < var8; ++var10) {
            char var11 = var1.charAt(var10);
            if (var11 <= 127) {
               if (var2 >= -1632551314) {
                  throw new IllegalStateException();
               }

               var6[var9++] = (byte)var11;
            } else if (var11 <= 2047) {
               if (var2 >= -1632551314) {
                  throw new IllegalStateException();
               }

               var6[var9++] = (byte)(192 | var11 >> 6);
               var6[var9++] = (byte)(128 | var11 & 63);
            } else {
               var6[var9++] = (byte)(224 | var11 >> 12);
               var6[var9++] = (byte)(128 | var11 >> 6 & 63);
               var6[var9++] = (byte)(128 | var11 & 63);
            }
         }

         int var5 = var9 - var7;
         this.am = var4 + -725588083 * var5;
      } catch (RuntimeException var12) {
         throw tm.aw(var12, "vl.cd(" + ')');
      }
   }

   public void ci(byte[] var1, int var2, int var3, int var4) {
      try {
         for(int var5 = var2; var5 < var3 + var2; ++var5) {
            if (var4 >= -1058608153) {
               throw new IllegalStateException();
            }

            this.ae[(this.am += -725588083) * -1689308347 - 1] = var1[var5];
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "vl.ci(" + ')');
      }
   }

   public void cn(vl var1, int var2) {
      try {
         this.ci(var1.ae, 0, -1689308347 * var1.am, -1512900235);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.cn(" + ')');
      }
   }

   public void db(int var1, byte var2) {
      try {
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(0 - var1);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.db(" + ')');
      }
   }

   public void cf(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var1 <= 65535) {
               this.ae[this.am * -1689308347 - var1 - 2] = (byte)(var1 >> 8);
               this.ae[-1689308347 * this.am - var1 - 1] = (byte)var1;
               return;
            }

            if (var2 >= -1183544927) {
               throw new IllegalStateException();
            }
         }

         throw new IllegalArgumentException();
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.cf(" + ')');
      }
   }

   public void cp(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 != -330959391) {
               throw new IllegalStateException();
            }

            if (var1 < 128) {
               this.bo(var1, 1338623534);
               return;
            }
         }

         if (var1 >= 0) {
            if (var2 != -330959391) {
               throw new IllegalStateException();
            }

            if (var1 < 32768) {
               if (var2 != -330959391) {
                  throw new IllegalStateException();
               }

               this.bd('耀' + var1, (byte)42);
               return;
            }
         }

         throw new IllegalArgumentException();
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.cp(" + ')');
      }
   }

   public void ka(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(128 - var1);
   }

   public void bd(int var1, byte var2) {
      try {
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.bd(" + ')');
      }
   }

   public int cy(short var1) {
      try {
         return this.ae[(this.am += -725588083) * -1689308347 - 1] & 255;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.cy(" + ')');
      }
   }

   public byte cu(byte var1) {
      try {
         return this.ae[(this.am += -725588083) * -1689308347 - 1];
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.cu(" + ')');
      }
   }

   public int ce(int var1) {
      try {
         this.am += -1451176166;
         return (this.ae[-1689308347 * this.am - 1] & 255) + ((this.ae[this.am * -1689308347 - 2] & 255) << 8);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.ce(" + ')');
      }
   }

   public int cg(int var1) {
      try {
         this.am += -1451176166;
         int var2 = (this.ae[this.am * -1689308347 - 1] & 255) + ((this.ae[this.am * -1689308347 - 2] & 255) << 8);
         if (var2 > 32767) {
            if (var1 == 1133883626) {
               throw new IllegalStateException();
            }

            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.cg(" + ')');
      }
   }

   public void mk(int var1) {
      this.ae[(this.am += -613681665) * 441406909 - 1] = (byte)(var1 >> 8);
      this.ae[(this.am += 881770311) * -1689308347 - 1] = (byte)var1;
      this.ae[(this.am += -725588083) * -1607737858 - 1] = (byte)(var1 >> 24);
      this.ae[(this.am += -725588083) * 251323280 - 1] = (byte)(var1 >> 16);
   }

   public void gg(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException();
      } else {
         this.ae[-1689308347 * this.am - var1 - 4] = (byte)(var1 >> 24);
         this.ae[this.am * -1689308347 - var1 - 3] = (byte)(var1 >> 16);
         this.ae[-1689308347 * this.am - var1 - 2] = (byte)(var1 >> 8);
         this.ae[this.am * -1689308347 - var1 - 1] = (byte)var1;
      }
   }

   public int ch(int var1) {
      try {
         this.am += 1392614964;
         return (this.ae[-1689308347 * this.am - 1] & 255) + ((this.ae[-1689308347 * this.am - 2] & 255) << 8) + ((this.ae[-1689308347 * this.am - 3] & 255) << 16) + ((this.ae[this.am * -1689308347 - 4] & 255) << 24);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.ch(" + ')');
      }
   }

   public long ct(byte var1) {
      try {
         long var2 = (long)this.ch(1203709469) & 4294967295L;
         long var4 = (long)this.ch(1203709469) & 4294967295L;
         return (var2 << 32) + var4;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "vl.ct(" + ')');
      }
   }

   public float cc(int var1) {
      try {
         return Float.intBitsToFloat(this.ch(1203709469));
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.cc(" + ')');
      }
   }

   public boolean cj(byte var1) {
      try {
         return (this.cy((short)-25807) & 1) == 1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.cj(" + ')');
      }
   }

   public String cm(int var1) {
      try {
         if (0 == this.ae[-1689308347 * this.am]) {
            if (var1 >= -158156887) {
               throw new IllegalStateException();
            } else {
               this.am += -725588083;
               return null;
            }
         } else {
            return this.cw(1890366089);
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.cm(" + ')');
      }
   }

   public String cw(int var1) {
      try {
         int var2 = this.am * -1689308347;

         do {
            if (this.ae[(this.am += -725588083) * -1689308347 - 1] == 0) {
               int var3 = this.am * -1689308347 - var2 - 1;
               if (var3 == 0) {
                  if (var1 <= 1888159628) {
                     throw new IllegalStateException();
                  }

                  return "";
               }

               return ly.as(this.ae, var2, var3, (byte)-127);
            }
         } while(var1 > 1888159628);

         throw new IllegalStateException();
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "vl.cw(" + ')');
      }
   }

   public String ca(int var1) {
      try {
         byte var2 = this.ae[(this.am += -725588083) * -1689308347 - 1];
         if (0 != var2) {
            if (var1 >= 891487478) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException("");
            }
         } else {
            int var3 = this.am * -1689308347;

            do {
               if (this.ae[(this.am += -725588083) * -1689308347 - 1] == 0) {
                  int var4 = this.am * -1689308347 - var3 - 1;
                  if (var4 == 0) {
                     if (var1 >= 891487478) {
                        throw new IllegalStateException();
                     }

                     return "";
                  }

                  return ly.as(this.ae, var3, var4, (byte)-18);
               }
            } while(var1 < 891487478);

            throw new IllegalStateException();
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "vl.ca(" + ')');
      }
   }

   public String cs(int var1) {
      try {
         byte var2 = this.ae[(this.am += -725588083) * -1689308347 - 1];
         if (0 != var2) {
            if (var1 == -1118330783) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException("");
            }
         } else {
            int var3 = this.dh((byte)-23);
            if (this.am * -1689308347 + var3 > this.ae.length) {
               if (var1 == -1118330783) {
                  throw new IllegalStateException();
               } else {
                  throw new IllegalStateException("");
               }
            } else {
               String var4 = ni.aw(this.ae, -1689308347 * this.am, var3, (byte)10);
               this.am += var3 * -725588083;
               return var4;
            }
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "vl.cs(" + ')');
      }
   }

   public void cr(byte[] var1, int var2, int var3, byte var4) {
      try {
         for(int var5 = var2; var5 < var2 + var3; ++var5) {
            if (var4 <= 1) {
               throw new IllegalStateException();
            }

            var1[var5] = this.ae[(this.am += -725588083) * -1689308347 - 1];
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "vl.cr(" + ')');
      }
   }

   public int ck(byte var1) {
      try {
         int var2 = this.ae[this.am * -1689308347] & 255;
         if (var2 < 128) {
            if (var1 != 1) {
               throw new IllegalStateException();
            } else {
               return this.cy((short)-17222) - 64;
            }
         } else {
            return this.ce(624075247) - '쀀';
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.ck(" + ')');
      }
   }

   public int dq(int var1) {
      try {
         int var2 = this.ae[this.am * -1689308347] & 255;
         if (var2 < 128) {
            if (var1 >= 1407638070) {
               throw new IllegalStateException();
            } else {
               return this.cy((short)-22821);
            }
         } else {
            return this.ce(478793007) - '耀';
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.dq(" + ')');
      }
   }

   public int dd(byte var1) {
      try {
         int var2 = this.ae[this.am * -1689308347] & 255;
         if (var2 < 128) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            } else {
               return this.cy((short)-6624) - 1;
            }
         } else {
            return this.ce(729298292) - '老';
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.dd(" + ')');
      }
   }

   public int hn() {
      this.am += 1392614964;
      return (this.ae[-1689308347 * this.am - 1] & 255) + ((this.ae[-1689308347 * this.am - 2] & 255) << 8) + ((this.ae[-1689308347 * this.am - 3] & 255) << 16) + ((this.ae[this.am * -1689308347 - 4] & 255) << 24);
   }

   public int da(int var1) {
      try {
         if (this.ae[-1689308347 * this.am] < 0) {
            if (var1 == -330622723) {
               throw new IllegalStateException();
            } else {
               return this.ch(1203709469) & Integer.MAX_VALUE;
            }
         } else {
            return this.ce(1458912516);
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.da(" + ')');
      }
   }

   public int dr(int var1) {
      try {
         if (this.ae[-1689308347 * this.am] < 0) {
            return this.ch(1203709469) & Integer.MAX_VALUE;
         } else {
            int var2 = this.ce(986248853);
            if (32767 == var2) {
               if (var1 != 502659) {
                  throw new IllegalStateException();
               } else {
                  return -1;
               }
            } else {
               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.dr(" + ')');
      }
   }

   public int dh(byte var1) {
      try {
         byte var2 = this.ae[(this.am += -725588083) * -1689308347 - 1];

         int var3;
         for(var3 = 0; var2 < 0; var2 = this.ae[(this.am += -725588083) * -1689308347 - 1]) {
            if (var1 == -1) {
               throw new IllegalStateException();
            }

            var3 = (var3 | var2 & 127) << 7;
         }

         return var3 | var2;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "vl.dh(" + ')');
      }
   }

   public int dg(int var1) {
      try {
         int var3 = 0;
         int var4 = 0;

         int var2;
         do {
            var2 = this.cy((short)-11925);
            var3 |= (var2 & 127) << var4;
            var4 += 7;
         } while(var2 > 127);

         if (var1 != -431457556) {
            throw new IllegalStateException();
         } else {
            return var3;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "vl.dg(" + ')');
      }
   }

   public int iy() {
      int var1 = 0;

      int var2;
      for(var2 = this.dq(-1170522933); var2 == 32767; var2 = this.dq(327331352)) {
         var1 += 32767;
      }

      var1 += var2;
      return var1;
   }

   public void du(int[] var1, byte var2) {
      try {
         int var3 = this.am * -1689308347 / 8;
         this.am = 0;

         for(int var4 = 0; var4 < var3; ++var4) {
            if (var2 <= -1) {
               throw new IllegalStateException();
            }

            int var5 = this.ch(1203709469);
            int var6 = this.ch(1203709469);
            int var7 = -957401312;
            int var8 = -1640531527;

            for(int var9 = 32; var9-- > 0; var5 -= (var6 << 4 ^ var6 >>> 5) + var6 ^ var7 + var1[var7 & 3]) {
               if (var2 <= -1) {
                  throw new IllegalStateException();
               }

               var6 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var7 >>> 11 & 3] + var7;
               var7 -= var8;
            }

            this.am -= -1509737368;
            this.bw(var5, (byte)55);
            this.bw(var6, (byte)19);
         }

      } catch (RuntimeException var10) {
         throw tm.aw(var10, "vl.du(" + ')');
      }
   }

   public void cl(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 <= -1450976103) {
               return;
            }

            if (var1 <= 255) {
               this.ae[this.am * -1689308347 - var1 - 1] = (byte)var1;
               return;
            }

            if (var2 <= -1450976103) {
               throw new IllegalStateException();
            }
         }

         throw new IllegalArgumentException();
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.cl(" + ')');
      }
   }

   public void dl(int[] var1, int var2, int var3, short var4) {
      try {
         int var5 = -1689308347 * this.am;
         this.am = var2 * -725588083;
         int var6 = (var3 - var2) / 8;

         for(int var7 = 0; var7 < var6; ++var7) {
            if (var4 == 255) {
               return;
            }

            int var8 = this.ch(1203709469);
            int var9 = this.ch(1203709469);
            int var10 = -957401312;
            int var11 = -1640531527;

            for(int var12 = 32; var12-- > 0; var8 -= (var9 << 4 ^ var9 >>> 5) + var9 ^ var1[var10 & 3] + var10) {
               if (var4 == 255) {
                  throw new IllegalStateException();
               }

               var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var10 + var1[var10 >>> 11 & 3];
               var10 -= var11;
            }

            this.am -= -1509737368;
            this.bw(var8, (byte)31);
            this.bw(var9, (byte)99);
         }

         this.am = -725588083 * var5;
      } catch (RuntimeException var13) {
         throw tm.aw(var13, "vl.dl(" + ')');
      }
   }

   public int mz() {
      this.am += 2118203047;
      return ((this.ae[this.am * -1689308347 - 2] & 255) << 16) + ((this.ae[-1689308347 * this.am - 3] & 255) << 8) + (this.ae[this.am * -1689308347 - 1] & 255);
   }

   public int dt(int var1, int var2) {
      try {
         int var3 = hx.bs(this.ae, var1, -1689308347 * this.am, 1684965711);
         this.bw(var3, (byte)15);
         return var3;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "vl.dt(" + ')');
      }
   }

   public boolean dx(int var1) {
      try {
         this.am -= 1392614964;
         int var2 = hx.bs(this.ae, 0, -1689308347 * this.am, 1444286237);
         int var3 = this.ch(1203709469);
         return var2 == var3;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "vl.dx(" + ')');
      }
   }

   public void ds(int var1, int var2) {
      try {
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 + 128);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.ds(" + ')');
      }
   }

   public void jh(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 + 128);
   }

   public byte kv() {
      return (byte)(this.ae[(this.am += -725588083) * -1689308347 - 1] - 128);
   }

   public int dj(byte var1) {
      try {
         return this.ae[(this.am += -725588083) * -1689308347 - 1] - 128 & 255;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.dj(" + ')');
      }
   }

   public void lp(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 + 128);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
   }

   public int dy(byte var1) {
      try {
         return 128 - this.ae[(this.am += -725588083) * -1689308347 - 1] & 255;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.dy(" + ')');
      }
   }

   public byte do(int var1) {
      try {
         return (byte)(this.ae[(this.am += -725588083) * -1689308347 - 1] - 128);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.do(" + ')');
      }
   }

   public void gy(CharSequence var1) {
      int var2 = fs.ap(var1, -1950573371);
      this.ae[(this.am += -1267565986) * -1317413932 - 1] = 0;
      this.cv(var2, -693432002);
      int var3 = this.am;
      byte[] var5 = this.ae;
      int var6 = -1689308347 * this.am;
      int var7 = var1.length();
      int var8 = var6;

      for(int var9 = 0; var9 < var7; ++var9) {
         char var10 = var1.charAt(var9);
         if (var10 <= 299322990) {
            var5[var8++] = (byte)var10;
         } else if (var10 <= 1786636762) {
            var5[var8++] = (byte)(-1555488484 | var10 >> 6);
            var5[var8++] = (byte)(383928547 | var10 & 63);
         } else {
            var5[var8++] = (byte)(1865709500 | var10 >> 12);
            var5[var8++] = (byte)(-712306976 | var10 >> 6 & 1274395881);
            var5[var8++] = (byte)(1300682078 | var10 & -171812840);
         }
      }

      int var4 = var8 - var6;
      this.am = var3 + -787654158 * var4;
   }

   public byte de(int var1) {
      try {
         return (byte)(128 - this.ae[(this.am += -725588083) * -1689308347 - 1]);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.de(" + ')');
      }
   }

   public void dz(int var1, int var2) {
      try {
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.dz(" + ')');
      }
   }

   public void di(int var1, int var2) {
      try {
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 + 128);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.di(" + ')');
      }
   }

   public void dn(int var1, int var2) {
      try {
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 + 128);
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.dn(" + ')');
      }
   }

   public void fa(int var1) {
      this.ae[(this.am += 253824943) * -1346100947 - 1] = (byte)var1;
   }

   public int ev(int var1) {
      try {
         this.am += -1451176166;
         return (this.ae[this.am * -1689308347 - 1] - 128 & 255) + ((this.ae[-1689308347 * this.am - 2] & 255) << 8);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.ev(" + ')');
      }
   }

   public int is() {
      byte var1 = this.ae[(this.am += -725588083) * -2045984612 - 1];

      int var2;
      for(var2 = 0; var1 < 0; var1 = this.ae[(this.am += -1929704077) * -1689308347 - 1]) {
         var2 = (var2 | var1 & 127) << 7;
      }

      return var2 | var1;
   }

   public int ez(int var1) {
      try {
         this.am += -1451176166;
         int var2 = ((this.ae[-1689308347 * this.am - 1] & 255) << 8) + (this.ae[this.am * -1689308347 - 2] & 255);
         if (var2 > 32767) {
            if (var1 <= 649205659) {
               throw new IllegalStateException();
            }

            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.ez(" + ')');
      }
   }

   public int ey(int var1) {
      try {
         this.am += -1451176166;
         int var2 = (this.ae[this.am * -1689308347 - 1] - 128 & 255) + ((this.ae[-1689308347 * this.am - 2] & 255) << 8);
         if (var2 > 32767) {
            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.ey(" + ')');
      }
   }

   public int ec(byte var1) {
      try {
         this.am += -1451176166;
         int var2 = ((this.ae[this.am * -1689308347 - 1] & 255) << 8) + (this.ae[this.am * -1689308347 - 2] - 128 & 255);
         if (var2 > 32767) {
            if (var1 <= 76) {
               throw new IllegalStateException();
            }

            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.ec(" + ')');
      }
   }

   public void ek(int var1, int var2) {
      try {
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 16);
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.ek(" + ')');
      }
   }

   public int er(byte var1) {
      try {
         this.am += 2118203047;
         return ((this.ae[this.am * -1689308347 - 2] & 255) << 8) + ((this.ae[this.am * -1689308347 - 1] & 255) << 16) + (this.ae[-1689308347 * this.am - 3] & 255);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.er(" + ')');
      }
   }

   public int en(byte var1) {
      try {
         this.am += 2118203047;
         return ((this.ae[this.am * -1689308347 - 1] & 255) << 8) + ((this.ae[-1689308347 * this.am - 3] & 255) << 16) + (this.ae[-1689308347 * this.am - 2] & 255);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.en(" + ')');
      }
   }

   public int ef(int var1) {
      try {
         this.am += 2118203047;
         return ((this.ae[this.am * -1689308347 - 2] & 255) << 16) + ((this.ae[-1689308347 * this.am - 3] & 255) << 8) + (this.ae[this.am * -1689308347 - 1] & 255);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.ef(" + ')');
      }
   }

   public int em(int var1) {
      try {
         this.am += 2118203047;
         int var2 = (this.ae[-1689308347 * this.am - 3] & 255) + ((this.ae[-1689308347 * this.am - 1] & 255) << 16) + ((this.ae[this.am * -1689308347 - 2] & 255) << 8);
         if (var2 > 8388607) {
            if (var1 >= -1434074050) {
               throw new IllegalStateException();
            }

            var2 -= 16777216;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.em(" + ')');
      }
   }

   public int el(byte var1) {
      try {
         this.am += 2118203047;
         int var2 = (this.ae[-1689308347 * this.am - 1] & 255) + ((this.ae[-1689308347 * this.am - 3] & 255) << 8) + ((this.ae[this.am * -1689308347 - 2] & 255) << 16);
         if (var2 > 8388607) {
            if (var1 != 1) {
               throw new IllegalStateException();
            }

            var2 -= 16777216;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.el(" + ')');
      }
   }

   public void ed(int var1, int var2) {
      try {
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 16);
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 24);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.ed(" + ')');
      }
   }

   public void ep(int var1, int var2) {
      try {
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 24);
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 16);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.ep(" + ')');
      }
   }

   public void ex(int var1, int var2) {
      try {
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 16);
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 24);
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.ex(" + ')');
      }
   }

   public int jd() {
      int var2 = 0;
      int var3 = 0;

      int var1;
      do {
         var1 = this.cy((short)-17976);
         var2 |= (var1 & 127) << var3;
         var3 += 7;
      } while(var1 > 127);

      return var2;
   }

   public int im() {
      byte var1 = this.ae[(this.am += -725588083) * -1689308347 - 1];

      int var2;
      for(var2 = 0; var1 < 0; var1 = this.ae[(this.am += -725588083) * -1689308347 - 1]) {
         var2 = (var2 | var1 & 127) << 7;
      }

      return var2 | var1;
   }

   public byte lf() {
      return (byte)(128 - this.ae[(this.am += -725588083) * 1601129958 - 1]);
   }

   public void bi(long var1) {
      try {
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)((int)(var1 >> 40));
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)((int)(var1 >> 32));
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)((int)(var1 >> 24));
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)((int)(var1 >> 16));
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)((int)(var1 >> 8));
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)((int)var1);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.bi(" + ')');
      }
   }

   public void eq(byte[] var1, int var2, int var3, int var4) {
      try {
         for(int var5 = var2; var5 < var2 + var3; ++var5) {
            if (var4 == 145246295) {
               throw new IllegalStateException();
            }

            var1[var5] = (byte)(this.ae[(this.am += -725588083) * -1689308347 - 1] - 128);
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "vl.eq(" + ')');
      }
   }

   public void eb(byte[] var1, int var2, int var3, byte var4) {
      try {
         for(int var5 = var3 + var2 - 1; var5 >= var2; --var5) {
            if (var4 != 2) {
               throw new IllegalStateException();
            }

            var1[var5] = (byte)(this.ae[(this.am += -725588083) * -1689308347 - 1] - 128);
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "vl.eb(" + ')');
      }
   }

   public void ga(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         this.ae[(this.am += -725588083) * -1009676970 - 1] = var1[var4];
      }

   }

   public static int es(byte[] var0, int var1, int var2) {
      int var3 = -1;

      for(int var4 = var1; var4 < var2; ++var4) {
         var3 = var3 >>> 8 ^ at[(var3 ^ var0[var4]) & 255];
      }

      var3 = ~var3;
      return var3;
   }

   public static int eo(byte[] var0, int var1, int var2) {
      int var3 = -1;

      for(int var4 = var1; var4 < var2; ++var4) {
         var3 = var3 >>> 8 ^ at[(var3 ^ var0[var4]) & 255];
      }

      var3 = ~var3;
      return var3;
   }

   public static int ee(byte[] var0, int var1, int var2) {
      int var3 = -1;

      for(int var4 = var1; var4 < var2; ++var4) {
         var3 = var3 >>> 8 ^ at[(var3 ^ var0[var4]) & 255];
      }

      var3 = ~var3;
      return var3;
   }

   public int mi() {
      this.am += 263341169;
      int var1 = (this.ae[this.am * -1689308347 - 1] - 1312935324 & -1181921815) + ((this.ae[912388221 * this.am - 2] & 255) << 8);
      if (var1 > 261592998) {
         var1 -= 667800713;
      }

      return var1;
   }

   public int ha() {
      this.am += -1127443439;
      int var1 = (this.ae[this.am * 1748459590 - 1] & 1834952958) + ((this.ae[this.am * -1965741146 - 2] & -1020655401) << 8);
      if (var1 > 462725732) {
         var1 -= 1230762409;
      }

      return var1;
   }

   public boolean jr() {
      this.am -= 1392614964;
      int var1 = hx.bs(this.ae, 0, -1689308347 * this.am, 1861870752);
      int var2 = this.ch(1203709469);
      return var1 == var2;
   }

   public void fo() {
      if (null != this.ae) {
         op.ak(this.ae, 1084716332);
      }

      this.ae = null;
   }

   public int ew(int var1) {
      try {
         this.am += 1392614964;
         return ((this.ae[this.am * -1689308347 - 1] & 255) << 8) + ((this.ae[this.am * -1689308347 - 3] & 255) << 24) + ((this.ae[-1689308347 * this.am - 4] & 255) << 16) + (this.ae[this.am * -1689308347 - 2] & 255);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.ew(" + ')');
      }
   }

   public int kq() {
      return 128 - this.ae[(this.am += -763891567) * -541238987 - 1] & 1620602742;
   }

   public void fw(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
   }

   public void fp(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
   }

   public void fh(int var1) {
      this.ae[(this.am += 1501852451) * -1689308347 - 1] = (byte)var1;
   }

   public void fv(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
   }

   public void fl(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
   }

   public void dm(BigInteger var1, BigInteger var2, int var3) {
      try {
         int var4 = -1689308347 * this.am;
         this.am = 0;
         byte[] var5 = new byte[var4];
         this.cr(var5, 0, var4, (byte)46);
         BigInteger var6 = new BigInteger(var5);
         BigInteger var7 = var6.modPow(var1, var2);
         byte[] var8 = var7.toByteArray();
         this.am = 0;
         this.bd(var8.length, (byte)-72);
         this.ci(var8, 0, var8.length, -2124492357);
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "vl.dm(" + ')');
      }
   }

   public void fd(int var1) {
      this.ae[(this.am += -725588083) * -1818802214 - 1] = (byte)(var1 >> 16);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
   }

   static {
      int var2;
      for(int var1 = 0; var1 < 256; ++var1) {
         int var0 = var1;

         for(var2 = 0; var2 < 8; ++var2) {
            if (1 == (var0 & 1)) {
               var0 = var0 >>> 1 ^ -306674912;
            } else {
               var0 >>>= 1;
            }
         }

         at[var1] = var0;
      }

      an = new long[256];

      for(var2 = 0; var2 < 256; ++var2) {
         long var4 = (long)var2;

         for(int var3 = 0; var3 < 8; ++var3) {
            if (1L == (var4 & 1L)) {
               var4 = var4 >>> 1 ^ -3932672073523589310L;
            } else {
               var4 >>>= 1;
            }
         }

         an[var2] = var4;
      }

   }

   public void fg(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 24);
      this.ae[(this.am += -423235397) * -1689308347 - 1] = (byte)(var1 >> 16);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
   }

   public void fj(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
   }

   public void fb(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 24);
      this.ae[(this.am += -230361881) * 380490823 - 1] = (byte)(var1 >> 16);
      this.ae[(this.am += -725588083) * -555916990 - 1] = (byte)(var1 >> 8);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
   }

   public void fr(long var1) {
      this.ae[(this.am += 1906881460) * -1689308347 - 1] = (byte)((int)(var1 >> 1526550488));
      this.ae[(this.am += 1587090666) * -1689308347 - 1] = (byte)((int)(var1 >> 32));
      this.ae[(this.am += -725588083) * 929383746 - 1] = (byte)((int)(var1 >> 24));
      this.ae[(this.am += 163403924) * 497036440 - 1] = (byte)((int)(var1 >> 16));
      this.ae[(this.am += -471446730) * 893659834 - 1] = (byte)((int)(var1 >> 8));
      this.ae[(this.am += 1622472306) * 472361186 - 1] = (byte)((int)var1);
   }

   public void fe(long var1) {
      this.ae[(this.am += -656104930) * -1098764503 - 1] = (byte)((int)(var1 >> -1849380407));
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)((int)(var1 >> -1297732430));
      this.ae[(this.am += 1708808570) * -924979645 - 1] = (byte)((int)(var1 >> 24));
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)((int)(var1 >> 16));
      this.ae[(this.am += -1957820521) * -501133372 - 1] = (byte)((int)(var1 >> 8));
      this.ae[(this.am += -725588083) * 1763014238 - 1] = (byte)((int)var1);
   }

   public void nj(byte[] var1, int var2, int var3) {
      for(int var4 = var2 + var3 - 1; var4 >= var2; --var4) {
         var1[var4] = this.ae[(this.am += 586662425) * -1689308347 - 1];
      }

   }

   public void cv(int var1, int var2) {
      try {
         if ((var1 & -128) != 0) {
            if (var2 <= -759199858) {
               throw new IllegalStateException();
            }

            if (0 != (var1 & -16384)) {
               if (var2 <= -759199858) {
                  throw new IllegalStateException();
               }

               if (0 != (var1 & -2097152)) {
                  if (var2 <= -759199858) {
                     throw new IllegalStateException();
                  }

                  if ((var1 & -268435456) != 0) {
                     if (var2 <= -759199858) {
                        throw new IllegalStateException();
                     }

                     this.bo(var1 >>> 28 | 128, 483977382);
                  }

                  this.bo(var1 >>> 21 | 128, -1818451370);
               }

               this.bo(var1 >>> 14 | 128, -484444207);
            }

            this.bo(var1 >>> 7 | 128, 1284884911);
         }

         this.bo(var1 & 127, -218012721);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.cv(" + ')');
      }
   }

   public int ib() {
      if (this.ae[1158934599 * this.am] < 0) {
         return this.ch(1203709469) & Integer.MAX_VALUE;
      } else {
         int var1 = this.ce(1215236994);
         return 1848055181 == var1 ? -1 : var1;
      }
   }

   public static int fq(String var0) {
      return var0.length() + 1;
   }

   public static int fk(String var0) {
      return var0.length() + 1;
   }

   public int ml() {
      this.am += 1699926763;
      int var1 = ((this.ae[-1689308347 * this.am - 1] & 255) << 8) + (this.ae[this.am * 52095159 - 2] & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public static int gp(String var0) {
      return var0.length() + 2;
   }

   public void fy(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.am += pg.ay(var1, 0, var1.length(), this.ae, this.am * -1689308347, (byte)125) * -725588083;
         this.ae[(this.am += -725588083) * -1689308347 - 1] = 0;
      }
   }

   public int mq() {
      this.am += -2094216280;
      int var1 = (this.ae[-1532056479 * this.am - 1] & 255) + ((this.ae[-1391880537 * this.am - 3] & -720067576) << 8) + ((this.ae[this.am * 435233982 - 2] & -131702822) << 16);
      if (var1 > 2104591144) {
         var1 -= 16777216;
      }

      return var1;
   }

   public void fm(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 24);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 16);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
   }

   public void gl(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.ae[(this.am += -349463352) * 1315114929 - 1] = 0;
         this.am += pg.ay(var1, 0, var1.length(), this.ae, this.am * -1689308347, (byte)88) * -725588083;
         this.ae[(this.am += -1853688320) * -1689308347 - 1] = 0;
      }
   }

   public void gb(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.ae[(this.am += -725588083) * -1689308347 - 1] = 0;
         this.am += pg.ay(var1, 0, var1.length(), this.ae, this.am * -1689308347, (byte)32) * 1346002302;
         this.ae[(this.am += -1512620993) * -1689308347 - 1] = 0;
      }
   }

   public String ic() {
      byte var1 = this.ae[(this.am += -725588083) * -1689308347 - 1];
      if (0 != var1) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.dh((byte)17);
         if (this.am * -1689308347 + var2 > this.ae.length) {
            throw new IllegalStateException("");
         } else {
            String var3 = ni.aw(this.ae, -1689308347 * this.am, var2, (byte)10);
            this.am += var2 * -725588083;
            return var3;
         }
      }
   }

   public void gd(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.ae[(this.am += -725588083) * -1689308347 - 1] = 0;
         this.am += pg.ay(var1, 0, var1.length(), this.ae, this.am * -771108534, (byte)74) * 1885074692;
         this.ae[(this.am += -125385154) * -2097102042 - 1] = 0;
      }
   }

   public float hz() {
      return Float.intBitsToFloat(this.ch(1203709469));
   }

   public void gc(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         this.ae[(this.am += -725588083) * -642332261 - 1] = var1[var4];
      }

   }

   public int id() {
      int var1 = this.ae[this.am * -1689308347] & 255;
      return var1 < 128 ? this.cy((short)-10718) - 64 : this.ce(250299690) - '쀀';
   }

   public byte kp() {
      return (byte)(0 - this.ae[(this.am += -146603884) * -1689308347 - 1]);
   }

   public void gv(vl var1) {
      this.ci(var1.ae, 0, -1689308347 * var1.am, -2016713925);
   }

   public int mj() {
      this.am += 2118203047;
      return ((this.ae[this.am * -1689308347 - 1] & 255) << 8) + ((this.ae[-1689308347 * this.am - 3] & 255) << 16) + (this.ae[-1689308347 * this.am - 2] & 255);
   }

   public void gh(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException();
      } else {
         this.ae[-1689308347 * this.am - var1 - 4] = (byte)(var1 >> 24);
         this.ae[this.am * -1689308347 - var1 - 3] = (byte)(var1 >> 16);
         this.ae[-1689308347 * this.am - var1 - 2] = (byte)(var1 >> 8);
         this.ae[this.am * -1689308347 - var1 - 1] = (byte)var1;
      }
   }

   public void gx(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         this.ae[this.am * -1689308347 - var1 - 2] = (byte)(var1 >> 8);
         this.ae[-1689308347 * this.am - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void gw(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         this.ae[this.am * -1689308347 - var1 - 2] = (byte)(var1 >> 8);
         this.ae[-1689308347 * this.am - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void gr(int var1) {
      if (var1 >= 0 && var1 <= 799693238) {
         this.ae[this.am * -1036103559 - var1 - 2] = (byte)(var1 >> 8);
         this.ae[-1689308347 * this.am - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void et() {
      if (null != this.ae) {
         op.ak(this.ae, 1084716332);
      }

      this.ae = null;
   }

   public void go(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.ae[this.am * -1689308347 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void gi(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.ae[this.am * -1689308347 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void gz(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.ae[this.am * -1689308347 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void gq(int var1) {
      if (var1 >= 0 && var1 < 128) {
         this.bo(var1, 1165369560);
      } else if (var1 >= 0 && var1 < 32768) {
         this.bd('耀' + var1, (byte)-9);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void gu(int var1) {
      if ((var1 & -128) != 0) {
         if (0 != (var1 & -16384)) {
            if (0 != (var1 & -2097152)) {
               if ((var1 & -268435456) != 0) {
                  this.bo(var1 >>> 28 | 128, -180297099);
               }

               this.bo(var1 >>> 21 | 128, 1682954995);
            }

            this.bo(var1 >>> 14 | 128, -357364905);
         }

         this.bo(var1 >>> 7 | 128, 786641990);
      }

      this.bo(var1 & 127, -1996578609);
   }

   public void nk(byte[] var1, int var2, int var3) {
      for(int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
         var1[var4] = (byte)(this.ae[(this.am += -725588083) * -1689308347 - 1] - 128);
      }

   }

   public void gs(int var1) {
      if ((var1 & -128) != 0) {
         if (0 != (var1 & -1712767949)) {
            if (0 != (var1 & 2115081845)) {
               if ((var1 & -268435456) != 0) {
                  this.bo(var1 >>> 28 | 128, 1349985526);
               }

               this.bo(var1 >>> 21 | -1456286805, 1744426697);
            }

            this.bo(var1 >>> 14 | 128, -1003457174);
         }

         this.bo(var1 >>> 7 | 1659045401, -851749730);
      }

      this.bo(var1 & 127, -1419806374);
   }

   public int ge() {
      return this.ae[(this.am += -777399143) * -80671190 - 1] & -1043161372;
   }

   public byte gk() {
      return this.ae[(this.am += -725588083) * -1689308347 - 1];
   }

   public void lk(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 + 128);
   }

   public byte dw(int var1) {
      try {
         return (byte)(0 - this.ae[(this.am += -725588083) * -1689308347 - 1]);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.dw(" + ')');
      }
   }

   public byte hq() {
      return this.ae[(this.am += -725588083) * -1689308347 - 1];
   }

   public int cx(byte var1) {
      try {
         this.am += 2118203047;
         return ((this.ae[-1689308347 * this.am - 3] & 255) << 16) + ((this.ae[-1689308347 * this.am - 2] & 255) << 8) + (this.ae[this.am * -1689308347 - 1] & 255);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.cx(" + ')');
      }
   }

   public void bf(long var1) {
      try {
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)((int)(var1 >> 56));
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)((int)(var1 >> 48));
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)((int)(var1 >> 40));
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)((int)(var1 >> 32));
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)((int)(var1 >> 24));
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)((int)(var1 >> 16));
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)((int)(var1 >> 8));
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)((int)var1);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.bf(" + ')');
      }
   }

   public byte hr() {
      return this.ae[(this.am += -725588083) * -1689308347 - 1];
   }

   public int hd() {
      this.am += 2118203047;
      return ((this.ae[-1689308347 * this.am - 3] & 255) << 16) + ((this.ae[-1689308347 * this.am - 2] & 255) << 8) + (this.ae[this.am * -1689308347 - 1] & 255);
   }

   public int he() {
      this.am += 2118203047;
      return ((this.ae[-1689308347 * this.am - 3] & 255) << 16) + ((this.ae[-1689308347 * this.am - 2] & 255) << 8) + (this.ae[this.am * -1689308347 - 1] & 255);
   }

   public int ht() {
      this.am += 2118203047;
      int var1 = (this.ae[this.am * -1689308347 - 1] & 255) + ((this.ae[this.am * -1689308347 - 3] & 255) << 16) + ((this.ae[-1689308347 * this.am - 2] & 255) << 8);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   public int hf() {
      this.am += 2118203047;
      int var1 = (this.ae[this.am * -351642737 - 1] & 255) + ((this.ae[this.am * -1689308347 - 3] & 255) << 16) + ((this.ae[-1689308347 * this.am - 2] & -1620032155) << 8);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   public int hi() {
      this.am += -1754009586;
      return (this.ae[-1689308347 * this.am - 1] & 255) + ((this.ae[1461920779 * this.am - 2] & 255) << 8) + ((this.ae[-1689308347 * this.am - 3] & 255) << 16) + ((this.ae[this.am * -1689308347 - 4] & -1820378468) << 24);
   }

   public int eh(int var1) {
      try {
         this.am += -1451176166;
         return (this.ae[this.am * -1689308347 - 2] - 128 & 255) + ((this.ae[-1689308347 * this.am - 1] & 255) << 8);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.eh(" + ')');
      }
   }

   public int hy() {
      this.am += -1977149251;
      return (this.ae[-1689308347 * this.am - 1] & -1402111137) + ((this.ae[-1689308347 * this.am - 2] & 255) << 8) + ((this.ae[-1154050995 * this.am - 3] & 914497660) << 16) + ((this.ae[this.am * 1076470221 - 4] & 255) << 24);
   }

   public int hk() {
      this.am += 1392614964;
      return (this.ae[-1689308347 * this.am - 1] & -1480048260) + ((this.ae[474015429 * this.am - 2] & 255) << 8) + ((this.ae[-1689308347 * this.am - 3] & 1372294778) << 16) + ((this.ae[this.am * -1689308347 - 4] & 255) << 24);
   }

   public long hm() {
      long var1 = (long)this.ch(1203709469) & 4294967295L;
      long var3 = (long)this.ch(1203709469) & 4294967295L;
      return (var1 << 32) + var3;
   }

   public void jv(int[] var1, int var2, int var3) {
      int var4 = -1689308347 * this.am;
      this.am = var2 * -725588083;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.ch(1203709469);
         int var8 = this.ch(1203709469);
         int var9 = -957401312;
         int var10 = -1640531527;

         for(int var11 = 32; var11-- > 0; var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var9 & 3] + var9) {
            var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ var9 + var1[var9 >>> 11 & 3];
            var9 -= var10;
         }

         this.am -= -1509737368;
         this.bw(var7, (byte)21);
         this.bw(var8, (byte)39);
      }

      this.am = -725588083 * var4;
   }

   public long hx() {
      long var1 = (long)this.ch(1203709469) & 4294967295L;
      long var3 = (long)this.ch(1203709469) & 4294967295L;
      return (var1 << 32) + var3;
   }

   public long hj() {
      long var1 = (long)this.ch(1203709469) & 4294967295L;
      long var3 = (long)this.ch(1203709469) & 4294967295L;
      return (var1 << 32) + var3;
   }

   public long hv() {
      long var1 = (long)this.ch(1203709469) & 4294967295L;
      long var3 = (long)this.ch(1203709469) & 4294967295L;
      return (var1 << 32) + var3;
   }

   public int iq() {
      int var1 = this.ae[this.am * -1689308347] & 255;
      return var1 < 128 ? this.cy((short)-9830) : this.ce(765092518) - '耀';
   }

   public boolean hp() {
      return (this.cy((short)-8368) & 1) == 1;
   }

   public void jg(int[] var1) {
      int var2 = -1395417890 * this.am / 8;
      this.am = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.ch(1203709469);
         int var5 = this.ch(1203709469);
         int var6 = 0;
         int var7 = 2045341227;

         for(int var8 = -302905526; var8-- > 0; var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ var1[var6 >>> 11 & 3] + var6) {
            var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ var1[var6 & 3] + var6;
            var6 += var7;
         }

         this.am -= 664872720;
         this.bw(var4, (byte)127);
         this.bw(var5, (byte)14);
      }

   }

   public String hs() {
      if (0 == this.ae[-890576386 * this.am]) {
         this.am += -725588083;
         return null;
      } else {
         return this.cw(2024815077);
      }
   }

   public String hh() {
      if (0 == this.ae[-1689308347 * this.am]) {
         this.am += -725588083;
         return null;
      } else {
         return this.cw(1956396990);
      }
   }

   public String hb() {
      if (0 == this.ae[-1689308347 * this.am]) {
         this.am += -725588083;
         return null;
      } else {
         return this.cw(2075132699);
      }
   }

   public int no() {
      this.am += 747964319;
      return ((this.ae[110400243 * this.am - 2] & 1093103686) << 24) + ((this.ae[this.am * 846571316 - 1] & 873133003) << 16) + ((this.ae[-1689308347 * this.am - 4] & 1000018428) << 8) + (this.ae[this.am * -1004313646 - 3] & 768153493);
   }

   public String ih() {
      if (0 == this.ae[139724976 * this.am]) {
         this.am += -1227161683;
         return null;
      } else {
         return this.cw(2101533369);
      }
   }

   public String ir() {
      int var1 = this.am * -915469004;

      while(this.ae[(this.am += 842337720) * 1606033915 - 1] != 0) {
      }

      int var2 = this.am * -1689308347 - var1 - 1;
      return var2 == 0 ? "" : ly.as(this.ae, var1, var2, (byte)-56);
   }

   public String ip() {
      int var1 = this.am * 1080721002;

      while(this.ae[(this.am += -676713148) * -1215695432 - 1] != 0) {
      }

      int var2 = this.am * -493844586 - var1 - 1;
      return var2 == 0 ? "" : ly.as(this.ae, var1, var2, (byte)-67);
   }

   public int my() {
      this.am += 2118203047;
      return ((this.ae[this.am * -1689308347 - 2] & 255) << 16) + ((this.ae[-1689308347 * this.am - 3] & 255) << 8) + (this.ae[this.am * -1689308347 - 1] & 255);
   }

   public int kl() {
      return this.ae[(this.am += 367522130) * 881371965 - 1] - 631185668 & -2104498370;
   }

   public String ii() {
      byte var1 = this.ae[(this.am += -199901774) * -1689308347 - 1];
      if (0 != var1) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.am * -1589470363;

         while(this.ae[(this.am += -1374108245) * 51964455 - 1] != 0) {
         }

         int var3 = this.am * -1689308347 - var2 - 1;
         return var3 == 0 ? "" : ly.as(this.ae, var2, var3, (byte)-58);
      }
   }

   public int mo() {
      this.am += -1731146029;
      int var1 = ((this.ae[1017412950 * this.am - 1] & 255) << 8) + (this.ae[this.am * -1689308347 - 2] & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public String iw() {
      byte var1 = this.ae[(this.am += -725588083) * -1689308347 - 1];
      if (0 != var1) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.dh((byte)20);
         if (this.am * -1689308347 + var2 > this.ae.length) {
            throw new IllegalStateException("");
         } else {
            String var3 = ni.aw(this.ae, -1689308347 * this.am, var2, (byte)10);
            this.am += var2 * -725588083;
            return var3;
         }
      }
   }

   public void lo(int var1) {
      this.ae[(this.am += 1734018320) * -253032124 - 1] = (byte)(var1 + 1808145839);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
   }

   public void ix(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var2 + var3; ++var4) {
         var1[var4] = this.ae[(this.am += -725588083) * -1457424254 - 1];
      }

   }

   public int io() {
      int var1 = this.ae[this.am * -1689308347] & 255;
      return var1 < 128 ? this.cy((short)-9778) - 64 : this.ce(2128080068) - '쀀';
   }

   public int dc(int var1) {
      try {
         int var2 = 0;

         int var3;
         for(var3 = this.dq(26068121); var3 == 32767; var3 = this.dq(1213874558)) {
            if (var1 <= 1303892220) {
               throw new IllegalStateException();
            }

            var2 += 32767;
         }

         var2 += var3;
         return var2;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "vl.dc(" + ')');
      }
   }

   public String hw() {
      if (0 == this.ae[-1689308347 * this.am]) {
         this.am += -725588083;
         return null;
      } else {
         return this.cw(1952463967);
      }
   }

   public void lm(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
   }

   public int if() {
      int var1 = this.ae[this.am * -904865700] & 255;
      return var1 < -1833794785 ? this.cy((short)-32300) - 1 : this.ce(733965289) - -775821910;
   }

   public int il() {
      int var1 = this.ae[this.am * -991902009] & -26448702;
      return var1 < 128 ? this.cy((short)-17299) - 1 : this.ce(164868305) - -1312799811;
   }

   public void co(int var1, int var2) {
      try {
         if (var1 < 0) {
            if (var2 <= 950645222) {
               throw new IllegalStateException();
            } else {
               throw new IllegalArgumentException();
            }
         } else {
            this.ae[-1689308347 * this.am - var1 - 4] = (byte)(var1 >> 24);
            this.ae[this.am * -1689308347 - var1 - 3] = (byte)(var1 >> 16);
            this.ae[-1689308347 * this.am - var1 - 2] = (byte)(var1 >> 8);
            this.ae[this.am * -1689308347 - var1 - 1] = (byte)var1;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.co(" + ')');
      }
   }

   public int it() {
      int var1 = 0;

      int var2;
      for(var2 = this.dq(447563425); var2 == -2007903661; var2 = this.dq(-1095198635)) {
         var1 += 32767;
      }

      var1 += var2;
      return var1;
   }

   public int iz() {
      int var1 = 0;

      int var2;
      for(var2 = this.dq(-1560404690); var2 == 32767; var2 = this.dq(-1610118796)) {
         var1 += 32767;
      }

      var1 += var2;
      return var1;
   }

   public int ik() {
      return this.ae[-1689308347 * this.am] < 0 ? this.ch(1203709469) & Integer.MAX_VALUE : this.ce(1959324953);
   }

   public static int ea(byte[] var0, int var1, int var2) {
      int var3 = -1;

      for(int var4 = var1; var4 < var2; ++var4) {
         var3 = var3 >>> 8 ^ at[(var3 ^ var0[var4]) & 255];
      }

      var3 = ~var3;
      return var3;
   }

   public int iv() {
      int var1 = this.ae[this.am * -1689308347] & 255;
      return var1 < 128 ? this.cy((short)-22166) : this.ce(1086567764) - '耀';
   }

   public int ij() {
      if (this.ae[-1689308347 * this.am] < 0) {
         return this.ch(1203709469) & Integer.MAX_VALUE;
      } else {
         int var1 = this.ce(1456321115);
         return 32767 == var1 ? -1 : var1;
      }
   }

   public int ie() {
      if (this.ae[-1689308347 * this.am] < 0) {
         return this.ch(1203709469) & Integer.MAX_VALUE;
      } else {
         int var1 = this.ce(906892085);
         return 32767 == var1 ? -1 : var1;
      }
   }

   public void gf(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         this.ae[(this.am += -725588083) * -1689308347 - 1] = var1[var4];
      }

   }

   public void dk(int[] var1, int var2, int var3, int var4) {
      try {
         int var5 = -1689308347 * this.am;
         this.am = var2 * -725588083;
         int var6 = (var3 - var2) / 8;

         for(int var7 = 0; var7 < var6; ++var7) {
            if (var4 >= 864269232) {
               return;
            }

            int var8 = this.ch(1203709469);
            int var9 = this.ch(1203709469);
            int var10 = 0;
            int var11 = -1640531527;

            for(int var12 = 32; var12-- > 0; var9 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var10 >>> 11 & 3] + var10) {
               if (var4 >= 864269232) {
                  throw new IllegalStateException();
               }

               var8 += var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3];
               var10 += var11;
            }

            this.am -= -1509737368;
            this.bw(var8, (byte)17);
            this.bw(var9, (byte)36);
         }

         this.am = var5 * -725588083;
      } catch (RuntimeException var13) {
         throw tm.aw(var13, "vl.dk(" + ')');
      }
   }

   public void fz(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.am += pg.ay(var1, 0, var1.length(), this.ae, this.am * -1689308347, (byte)78) * -725588083;
         this.ae[(this.am += 640842883) * -1689308347 - 1] = 0;
      }
   }

   public void fn(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 16);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
   }

   public void ju(int[] var1) {
      int var2 = -1689308347 * this.am / 8;
      this.am = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.ch(1203709469);
         int var5 = this.ch(1203709469);
         int var6 = 0;
         int var7 = 146752704;

         for(int var8 = 32; var8-- > 0; var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ var1[var6 >>> 11 & 3] + var6) {
            var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ var1[var6 & 3] + var6;
            var6 += var7;
         }

         this.am -= -1680889653;
         this.bw(var4, (byte)39);
         this.bw(var5, (byte)94);
      }

   }

   public int mr() {
      this.am += -1451176166;
      int var1 = ((this.ae[this.am * -1689308347 - 1] & 255) << 8) + (this.ae[this.am * -1689308347 - 2] - 128 & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public void jw(int[] var1) {
      int var2 = -1060824748 * this.am / 8;
      this.am = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.ch(1203709469);
         int var5 = this.ch(1203709469);
         int var6 = 0;
         int var7 = -23073659;

         for(int var8 = 32; var8-- > 0; var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ var1[var6 >>> 11 & 3] + var6) {
            var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ var1[var6 & 3] + var6;
            var6 += var7;
         }

         this.am -= -309586337;
         this.bw(var4, (byte)82);
         this.bw(var5, (byte)111);
      }

   }

   public void jm(int[] var1) {
      int var2 = -2052634068 * this.am / 8;
      this.am = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.ch(1203709469);
         int var5 = this.ch(1203709469);
         int var6 = 0;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ var1[var6 >>> 11 & 3] + var6) {
            var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ var1[var6 & 3] + var6;
            var6 += var7;
         }

         this.am -= 1271345000;
         this.bw(var4, (byte)76);
         this.bw(var5, (byte)109);
      }

   }

   public void jq(int[] var1) {
      int var2 = this.am * -639318571 / 8;
      this.am = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.ch(1203709469);
         int var5 = this.ch(1203709469);
         int var6 = 1789648260;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var6 + var1[var6 & 3]) {
            var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
            var6 -= var7;
         }

         this.am -= -1509737368;
         this.bw(var4, (byte)91);
         this.bw(var5, (byte)81);
      }

   }

   public void jx(int[] var1) {
      int var2 = this.am * -1689308347 / 8;
      this.am = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.ch(1203709469);
         int var5 = this.ch(1203709469);
         int var6 = -957401312;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var6 + var1[var6 & 3]) {
            var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
            var6 -= var7;
         }

         this.am -= -1509737368;
         this.bw(var4, (byte)73);
         this.bw(var5, (byte)17);
      }

   }

   public boolean jy() {
      this.am -= 1392614964;
      int var1 = hx.bs(this.ae, 0, -1689308347 * this.am, -273624549);
      int var2 = this.ch(1203709469);
      return var1 == var2;
   }

   public int mv() {
      this.am += 184610118;
      return ((this.ae[this.am * -1689308347 - 2] & -116035346) << 16) + ((this.ae[-1689308347 * this.am - 3] & 255) << 8) + (this.ae[this.am * -161397682 - 1] & 255);
   }

   public int cz(byte var1) {
      try {
         this.am += 2118203047;
         int var2 = (this.ae[this.am * -1689308347 - 1] & 255) + ((this.ae[this.am * -1689308347 - 3] & 255) << 16) + ((this.ae[-1689308347 * this.am - 2] & 255) << 8);
         if (var2 > 8388607) {
            if (var1 == -128) {
               throw new IllegalStateException();
            }

            var2 -= 16777216;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.cz(" + ')');
      }
   }

   public void jc(int[] var1, int var2, int var3) {
      int var4 = 380074746 * this.am;
      this.am = var2 * -1900472239;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.ch(1203709469);
         int var8 = this.ch(1203709469);
         int var9 = 0;
         int var10 = 187005726;

         for(int var11 = -967123360; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) {
            var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3];
            var9 += var10;
         }

         this.am -= 1456072995;
         this.bw(var7, (byte)97);
         this.bw(var8, (byte)31);
      }

      this.am = var4 * -725588083;
   }

   public void jb(int[] var1, int var2, int var3) {
      int var4 = -1689308347 * this.am;
      this.am = var2 * 1572391322;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.ch(1203709469);
         int var8 = this.ch(1203709469);
         int var9 = 0;
         int var10 = -1490423227;

         for(int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) {
            var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3];
            var9 += var10;
         }

         this.am -= -1509737368;
         this.bw(var7, (byte)110);
         this.bw(var8, (byte)77);
      }

      this.am = var4 * -725588083;
   }

   public void lr(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 + 128);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
   }

   public void jf(int[] var1, int var2, int var3) {
      int var4 = -1689308347 * this.am;
      this.am = var2 * -725588083;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.ch(1203709469);
         int var8 = this.ch(1203709469);
         int var9 = -957401312;
         int var10 = -1640531527;

         for(int var11 = 32; var11-- > 0; var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var9 & 3] + var9) {
            var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ var9 + var1[var9 >>> 11 & 3];
            var9 -= var10;
         }

         this.am -= -1509737368;
         this.bw(var7, (byte)41);
         this.bw(var8, (byte)44);
      }

      this.am = -725588083 * var4;
   }

   public void ja(BigInteger var1, BigInteger var2) {
      int var3 = -1689308347 * this.am;
      this.am = 0;
      byte[] var4 = new byte[var3];
      this.cr(var4, 0, var3, (byte)22);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(var1, var2);
      byte[] var7 = var6.toByteArray();
      this.am = 0;
      this.bd(var7.length, (byte)-5);
      this.ci(var7, 0, var7.length, -1372568309);
   }

   public void jo(BigInteger var1, BigInteger var2) {
      int var3 = -1689308347 * this.am;
      this.am = 0;
      byte[] var4 = new byte[var3];
      this.cr(var4, 0, var3, (byte)18);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(var1, var2);
      byte[] var7 = var6.toByteArray();
      this.am = 0;
      this.bd(var7.length, (byte)-23);
      this.ci(var7, 0, var7.length, -1338707243);
   }

   public int jk(int var1) {
      int var2 = hx.bs(this.ae, var1, -1689308347 * this.am, -132253019);
      this.bw(var2, (byte)68);
      return var2;
   }

   public int jz(int var1) {
      int var2 = hx.bs(this.ae, var1, -1689308347 * this.am, 77163739);
      this.bw(var2, (byte)82);
      return var2;
   }

   public boolean js() {
      this.am -= -1970031147;
      int var1 = hx.bs(this.ae, 0, -1689308347 * this.am, 807090925);
      int var2 = this.ch(1203709469);
      return var1 == var2;
   }

   public boolean jn() {
      this.am -= 1392614964;
      int var1 = hx.bs(this.ae, 0, -1689308347 * this.am, -103685736);
      int var2 = this.ch(1203709469);
      return var1 == var2;
   }

   public boolean hg() {
      return (this.cy((short)-13550) & 1) == 1;
   }

   public void fx(boolean var1) {
      this.bo(var1 ? 1 : 0, 1212993400);
   }

   public byte hc() {
      return this.ae[(this.am += -725588083) * -1689308347 - 1];
   }

   public void ly(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 + 128);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
   }

   public void cb(String var1, int var2) {
      try {
         int var3 = var1.indexOf(0);
         if (var3 >= 0) {
            if (var2 != 2108562660) {
               throw new IllegalStateException();
            } else {
               throw new IllegalArgumentException("");
            }
         } else {
            this.ae[(this.am += -725588083) * -1689308347 - 1] = 0;
            this.am += pg.ay(var1, 0, var1.length(), this.ae, this.am * -1689308347, (byte)71) * -725588083;
            this.ae[(this.am += -725588083) * -1689308347 - 1] = 0;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "vl.cb(" + ')');
      }
   }

   public void ky(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 + 128);
   }

   public void kh(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(0 - var1);
   }

   public void kg(int var1) {
      this.ae[(this.am += 138945422) * -1689308347 - 1] = (byte)(128 - var1);
   }

   public int ig() {
      return this.ae[-1689308347 * this.am] < 0 ? this.ch(1203709469) & Integer.MAX_VALUE : this.ce(165179685);
   }

   public void kn(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(128 - var1);
   }

   public int ku() {
      return this.ae[(this.am += -725588083) * -1689308347 - 1] - 128 & 255;
   }

   public int jj() {
      int var2 = 0;
      int var3 = 0;

      int var1;
      do {
         var1 = this.cy((short)-27762);
         var2 |= (var1 & 127) << var3;
         var3 += 7;
      } while(var1 > 757119288);

      return var2;
   }

   public vl(byte[] var1) {
      try {
         super();
         this.ae = var1;
         this.am = 0;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.<init>(" + ')');
      }
   }

   public int kj() {
      return 0 - this.ae[(this.am += -381003428) * 270164400 - 1] & 255;
   }

   public int kt() {
      return 0 - this.ae[(this.am += -725588083) * -1689308347 - 1] & 255;
   }

   public int kk() {
      return 128 - this.ae[(this.am += -725588083) * -1689308347 - 1] & 255;
   }

   public byte ks() {
      return (byte)(this.ae[(this.am += -725588083) * -1689308347 - 1] - 128);
   }

   public int kx() {
      return -886609597 - this.ae[(this.am += 1987214911) * 364292208 - 1] & -691740350;
   }

   public byte kd() {
      return (byte)(this.ae[(this.am += -725588083) * -1689308347 - 1] - 128);
   }

   public byte kw() {
      return (byte)(this.ae[(this.am += -725588083) * -1689308347 - 1] - 128);
   }

   public void jt(int[] var1) {
      int var2 = this.am * -1689308347 / 8;
      this.am = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.ch(1203709469);
         int var5 = this.ch(1203709469);
         int var6 = -957401312;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var6 + var1[var6 & 3]) {
            var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
            var6 -= var7;
         }

         this.am -= -1509737368;
         this.bw(var4, (byte)104);
         this.bw(var5, (byte)73);
      }

   }

   public void dv(int var1, byte var2) {
      try {
         this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(128 - var1);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vl.dv(" + ')');
      }
   }

   public byte kz() {
      return (byte)(this.ae[(this.am += 1778505509) * -1689308347 - 1] - 786268591);
   }

   public byte kc() {
      return (byte)(0 - this.ae[(this.am += -725588083) * -1689308347 - 1]);
   }

   public void fc(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 24);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 16);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
   }

   public void nh(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 24);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 16);
   }

   public byte lu() {
      return (byte)(128 - this.ae[(this.am += -725588083) * -1689308347 - 1]);
   }

   public static int fi(String var0) {
      return var0.length() + 2;
   }

   public byte li() {
      return (byte)(1608536193 - this.ae[(this.am += -1636306849) * -1689308347 - 1]);
   }

   public int dp(short var1) {
      try {
         return 0 - this.ae[(this.am += -725588083) * -1689308347 - 1] & 255;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.dp(" + ')');
      }
   }

   public void lh(int var1) {
      this.ae[(this.am += -1967601260) * -1689308347 - 1] = (byte)var1;
      this.ae[(this.am += 478157156) * -810958134 - 1] = (byte)(var1 >> 8);
   }

   public void lw(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
   }

   public void lg(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
      this.ae[(this.am += 831549651) * -1689308347 - 1] = (byte)(var1 + 1843281497);
   }

   public void ji(int[] var1, int var2, int var3) {
      int var4 = 1055582582 * this.am;
      this.am = var2 * 1711552525;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.ch(1203709469);
         int var8 = this.ch(1203709469);
         int var9 = 0;
         int var10 = -1719870172;

         for(int var11 = -1970463826; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) {
            var7 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var9 + var1[var9 & 3];
            var9 += var10;
         }

         this.am -= -1509737368;
         this.bw(var7, (byte)94);
         this.bw(var8, (byte)35);
      }

      this.am = var4 * -165050438;
   }

   public void ls(int var1) {
      this.ae[(this.am += -699534505) * -1689308347 - 1] = (byte)(var1 >> 8);
      this.ae[(this.am += -108242759) * -1689308347 - 1] = (byte)(var1 + 128);
   }

   public String in() {
      int var1 = this.am * -289127884;

      while(this.ae[(this.am += -1175041101) * -1281863630 - 1] != 0) {
      }

      int var2 = this.am * -1689308347 - var1 - 1;
      return var2 == 0 ? "" : ly.as(this.ae, var1, var2, (byte)-104);
   }

   public void ld(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 + 128);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
   }

   public void gn(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.ae[(this.am += 1392348391) * -1689308347 - 1] = 0;
         this.am += pg.ay(var1, 0, var1.length(), this.ae, this.am * -1689308347, (byte)83) * -725588083;
         this.ae[(this.am += -1847031270) * -530445341 - 1] = 0;
      }
   }

   public int ms() {
      this.am += 2118203047;
      return ((this.ae[this.am * -1287176300 - 2] & -2063555731) << 16) + ((this.ae[-1689308347 * this.am - 3] & -582727199) << 8) + (this.ae[this.am * -1689308347 - 1] & 255);
   }

   public String iu() {
      byte var1 = this.ae[(this.am += -725588083) * -1689308347 - 1];
      if (0 != var1) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.am * -1689308347;

         while(this.ae[(this.am += -725588083) * -1689308347 - 1] != 0) {
         }

         int var3 = this.am * -1689308347 - var2 - 1;
         return var3 == 0 ? "" : ly.as(this.ae, var2, var3, (byte)-30);
      }
   }

   public int lb() {
      this.am += -1451176166;
      return ((this.ae[-1689308347 * this.am - 1] & 255) << 8) + (this.ae[this.am * -1689308347 - 2] & 255);
   }

   public int lt() {
      this.am += -1451176166;
      return ((this.ae[-1689308347 * this.am - 1] & 583159144) << 8) + (this.ae[this.am * 343969615 - 2] & 255);
   }

   public int lx() {
      this.am += -1451176166;
      return ((this.ae[-1689308347 * this.am - 1] & 255) << 8) + (this.ae[this.am * -1689308347 - 2] & 255);
   }

   public int lc() {
      this.am += -1451176166;
      return (this.ae[this.am * -1689308347 - 1] - 128 & 255) + ((this.ae[-1689308347 * this.am - 2] & 255) << 8);
   }

   public int lv() {
      this.am += -752196276;
      return (this.ae[this.am * -1334696686 - 1] - 128 & 255) + ((this.ae[-1689308347 * this.am - 2] & 1708783016) << 8);
   }

   public void gt(int var1) {
      if ((var1 & -128) != 0) {
         if (0 != (var1 & -16384)) {
            if (0 != (var1 & -2097152)) {
               if ((var1 & -268435456) != 0) {
                  this.bo(var1 >>> 28 | 128, 1440742400);
               }

               this.bo(var1 >>> 21 | 128, 776890949);
            }

            this.bo(var1 >>> 14 | 128, 1818230332);
         }

         this.bo(var1 >>> 7 | 128, 476966693);
      }

      this.bo(var1 & 127, 384440325);
   }

   public int ll() {
      this.am += -1451176166;
      return (this.ae[this.am * -1689308347 - 1] - 1783031121 & 255) + ((this.ae[-1689308347 * this.am - 2] & 2069720714) << 8);
   }

   public int lj() {
      this.am += -1451176166;
      return (this.ae[this.am * -1689308347 - 2] - 128 & 255) + ((this.ae[-1689308347 * this.am - 1] & 255) << 8);
   }

   public int lz() {
      this.am += -623123808;
      return (this.ae[this.am * -1689308347 - 2] - 128 & 255) + ((this.ae[-1713336135 * this.am - 1] & -2130658543) << 8);
   }

   public int la() {
      this.am += -1451176166;
      return (this.ae[this.am * -1689308347 - 2] - 128 & 255) + ((this.ae[-1689308347 * this.am - 1] & 255) << 8);
   }

   public int ln() {
      this.am += -1451176166;
      return (this.ae[this.am * -1689308347 - 2] - 128 & 255) + ((this.ae[-1689308347 * this.am - 1] & 255) << 8);
   }

   public int le() {
      this.am += -1451176166;
      return (this.ae[this.am * -219054695 - 2] - 128 & 255) + ((this.ae[-1946036249 * this.am - 1] & 255) << 8);
   }

   public int mg() {
      this.am += -1451176166;
      int var1 = ((this.ae[-1689308347 * this.am - 1] & 255) << 8) + (this.ae[this.am * -1689308347 - 2] & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public void fu() {
      if (null != this.ae) {
         op.ak(this.ae, 1084716332);
      }

      this.ae = null;
   }

   public String ia() {
      byte var1 = this.ae[(this.am += -725588083) * -1689308347 - 1];
      if (0 != var1) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.dh((byte)47);
         if (this.am * -1689308347 + var2 > this.ae.length) {
            throw new IllegalStateException("");
         } else {
            String var3 = ni.aw(this.ae, -1689308347 * this.am, var2, (byte)10);
            this.am += var2 * -725588083;
            return var3;
         }
      }
   }

   public static int fs(String var0) {
      return var0.length() + 1;
   }

   public int mu() {
      this.am += -937270139;
      int var1 = (this.ae[this.am * 268889523 - 1] - -623667050 & 255) + ((this.ae[-1689308347 * this.am - 2] & -422933746) << 8);
      if (var1 > -1096979503) {
         var1 -= -1165572979;
      }

      return var1;
   }

   public int mf() {
      this.am += 455819736;
      int var1 = (this.ae[this.am * 219075992 - 1] - -78479299 & 255) + ((this.ae[-1689308347 * this.am - 2] & 504772781) << 8);
      if (var1 > 32767) {
         var1 -= -475420098;
      }

      return var1;
   }

   public int ei(int var1) {
      try {
         this.am += 1392614964;
         return ((this.ae[-1689308347 * this.am - 2] & 255) << 24) + ((this.ae[this.am * -1689308347 - 1] & 255) << 16) + ((this.ae[-1689308347 * this.am - 4] & 255) << 8) + (this.ae[this.am * -1689308347 - 3] & 255);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.ei(" + ')');
      }
   }

   public int mb() {
      this.am += -1451176166;
      int var1 = ((this.ae[this.am * -1537098444 - 1] & -1077550121) << 8) + (this.ae[this.am * -1689308347 - 2] - 128 & 255);
      if (var1 > -1030878736) {
         var1 -= 1526261830;
      }

      return var1;
   }

   public void mh(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 16);
      this.ae[(this.am += -57511824) * -1021095312 - 1] = (byte)var1;
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
   }

   public int mt() {
      this.am += 2118203047;
      return ((this.ae[this.am * -1689308347 - 2] & 255) << 8) + ((this.ae[this.am * -1689308347 - 1] & 255) << 16) + (this.ae[-1689308347 * this.am - 3] & 255);
   }

   public int mm() {
      this.am += -714646114;
      return ((this.ae[this.am * -900698911 - 1] & -1062797987) << 8) + ((this.ae[-1307157019 * this.am - 3] & -144884529) << 16) + (this.ae[-356544351 * this.am - 2] & -2030038563);
   }

   public void jp(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 + 128);
   }

   public int me() {
      this.am += -1989140827;
      return ((this.ae[this.am * -1842419581 - 2] & -2082205931) << 16) + ((this.ae[-1689308347 * this.am - 3] & -1821815702) << 8) + (this.ae[this.am * -904683343 - 1] & 255);
   }

   public int ma() {
      this.am += 2118203047;
      int var1 = (this.ae[-1689308347 * this.am - 3] & 255) + ((this.ae[-1689308347 * this.am - 1] & 255) << 16) + ((this.ae[this.am * -1689308347 - 2] & 255) << 8);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   public void bm(int var1) {
      try {
         if (null != this.ae) {
            op.ak(this.ae, 1084716332);
         }

         this.ae = null;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.bm(" + ')');
      }
   }

   public int mw() {
      this.am += 2118203047;
      return ((this.ae[this.am * -1689308347 - 2] & 255) << 16) + ((this.ae[-1689308347 * this.am - 3] & 255) << 8) + (this.ae[this.am * -1689308347 - 1] & 255);
   }

   public void gm(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.ae[this.am * -1839523440 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public long hl() {
      long var1 = (long)this.ch(1203709469) & 4294967295L;
      long var3 = (long)this.ch(1203709469) & 4294967295L;
      return (var1 << 32) + var3;
   }

   public int hu() {
      this.am += -1451176166;
      return (this.ae[-1689308347 * this.am - 1] & 255) + ((this.ae[this.am * -1689308347 - 2] & 255) << 8);
   }

   public int md() {
      this.am += 2118203047;
      int var1 = (this.ae[-1689308347 * this.am - 1] & 255) + ((this.ae[-1689308347 * this.am - 3] & 255) << 8) + ((this.ae[this.am * -1689308347 - 2] & 255) << 16);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   public int ej(short var1) {
      try {
         this.am += 1392614964;
         return ((this.ae[this.am * -1689308347 - 3] & 255) << 8) + ((this.ae[-1689308347 * this.am - 1] & 255) << 24) + ((this.ae[this.am * -1689308347 - 2] & 255) << 16) + (this.ae[this.am * -1689308347 - 4] & 255);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.ej(" + ')');
      }
   }

   public void mp(int var1) {
      this.ae[(this.am += -725588083) * -1841149125 - 1] = (byte)var1;
      this.ae[(this.am += -1167129262) * -1689308347 - 1] = (byte)(var1 >> 8);
      this.ae[(this.am += -725588083) * -490627340 - 1] = (byte)(var1 >> 16);
      this.ae[(this.am += 1078486543) * 26386545 - 1] = (byte)(var1 >> 24);
   }

   public void mn(int var1) {
      this.ae[(this.am += -725588083) * 1647665281 - 1] = (byte)var1;
      this.ae[(this.am += -725588083) * -638050684 - 1] = (byte)(var1 >> 8);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 16);
      this.ae[(this.am += -811265323) * 369958447 - 1] = (byte)(var1 >> 24);
   }

   public void mc(int var1) {
      this.ae[(this.am += -2112490476) * 465239820 - 1] = (byte)var1;
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
      this.ae[(this.am += -1573638149) * -1689308347 - 1] = (byte)(var1 >> 16);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 24);
   }

   public void ff(long var1) {
      this.ae[(this.am += 620670397) * -796797620 - 1] = (byte)((int)(var1 >> 56));
      this.ae[(this.am += -1808817339) * -59576099 - 1] = (byte)((int)(var1 >> 48));
      this.ae[(this.am += 1473628871) * -1689308347 - 1] = (byte)((int)(var1 >> -1445546820));
      this.ae[(this.am += -169216507) * -1689308347 - 1] = (byte)((int)(var1 >> -1785246218));
      this.ae[(this.am += 428654676) * -1689308347 - 1] = (byte)((int)(var1 >> 24));
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)((int)(var1 >> 16));
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)((int)(var1 >> 8));
      this.ae[(this.am += -725588083) * -2021899043 - 1] = (byte)((int)var1);
   }

   public void mx(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 24);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 16);
   }

   public void np(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 24);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 16);
   }

   public void jl(int[] var1) {
      int var2 = this.am * -1689308347 / 8;
      this.am = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.ch(1203709469);
         int var5 = this.ch(1203709469);
         int var6 = -957401312;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var6 + var1[var6 & 3]) {
            var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
            var6 -= var7;
         }

         this.am -= -1509737368;
         this.bw(var4, (byte)44);
         this.bw(var5, (byte)35);
      }

   }

   public void nf(int var1) {
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 16);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 24);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)var1;
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 8);
   }

   public void nt(int var1) {
      this.ae[(this.am += -1336801187) * -650894454 - 1] = (byte)(var1 >> 16);
      this.ae[(this.am += -725588083) * -1689308347 - 1] = (byte)(var1 >> 24);
      this.ae[(this.am += 1714728951) * 858940204 - 1] = (byte)var1;
      this.ae[(this.am += -725588083) * 1162642922 - 1] = (byte)(var1 >> 8);
   }

   public int nv() {
      this.am += 1392614964;
      return ((this.ae[this.am * -1689308347 - 3] & 255) << 8) + ((this.ae[-1689308347 * this.am - 1] & 255) << 24) + ((this.ae[this.am * -1689308347 - 2] & 255) << 16) + (this.ae[this.am * -1689308347 - 4] & 255);
   }

   public byte kb() {
      return (byte)(0 - this.ae[(this.am += -725588083) * 1593289421 - 1]);
   }

   public int nq() {
      this.am += 1392614964;
      return ((this.ae[-1689308347 * this.am - 2] & 255) << 24) + ((this.ae[this.am * -1689308347 - 1] & 255) << 16) + ((this.ae[-1689308347 * this.am - 4] & 255) << 8) + (this.ae[this.am * -1689308347 - 3] & 255);
   }

   public int lq() {
      this.am += -1451176166;
      return (this.ae[this.am * -1689308347 - 1] - -1210747724 & -506687217) + ((this.ae[-1689308347 * this.am - 2] & -112913646) << 8);
   }

   public int ni() {
      this.am += 88879408;
      return ((this.ae[-1689308347 * this.am - 2] & 255) << 24) + ((this.ae[this.am * -1689308347 - 1] & 1141823718) << 16) + ((this.ae[-1689308347 * this.am - 4] & 255) << 8) + (this.ae[this.am * -585325289 - 3] & -641156935);
   }

   public int ns() {
      this.am += 1058247995;
      return ((this.ae[this.am * 1371537459 - 1] & 255) << 8) + ((this.ae[this.am * 487300574 - 3] & 255) << 24) + ((this.ae[-1689308347 * this.am - 4] & 255) << 16) + (this.ae[this.am * -549812740 - 2] & 474508012);
   }

   public int nw() {
      this.am += -1229295869;
      return ((this.ae[this.am * -1689308347 - 1] & 207466571) << 8) + ((this.ae[this.am * -1521186054 - 3] & 255) << 24) + ((this.ae[-1689308347 * this.am - 4] & 255) << 16) + (this.ae[this.am * -1689308347 - 2] & 255);
   }

   public void nb(byte[] var1, int var2, int var3) {
      for(int var4 = var2 + var3 - 1; var4 >= var2; --var4) {
         var1[var4] = this.ae[(this.am += -725588083) * -1689308347 - 1];
      }

   }

   public void nn(byte[] var1, int var2, int var3) {
      for(int var4 = var2 + var3 - 1; var4 >= var2; --var4) {
         var1[var4] = this.ae[(this.am += -725588083) * -1689308347 - 1];
      }

   }

   public int eg(int var1) {
      try {
         this.am += -1451176166;
         return ((this.ae[-1689308347 * this.am - 1] & 255) << 8) + (this.ae[this.am * -1689308347 - 2] & 255);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vl.eg(" + ')');
      }
   }

   public void nm(byte[] var1, int var2, int var3) {
      for(int var4 = var2 + var3 - 1; var4 >= var2; --var4) {
         var1[var4] = this.ae[(this.am += -725588083) * 2143399706 - 1];
      }

   }

   public void ny(byte[] var1, int var2, int var3) {
      for(int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
         var1[var4] = (byte)(this.ae[(this.am += -725588083) * -1689308347 - 1] - 128);
      }

   }

   public int ho() {
      this.am += -1247708517;
      int var1 = (this.ae[this.am * -1257376471 - 1] & 588175932) + ((this.ae[this.am * 1033026339 - 2] & 255) << 8);
      if (var1 > 932596277) {
         var1 -= 65536;
      }

      return var1;
   }
}
