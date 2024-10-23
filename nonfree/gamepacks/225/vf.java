import java.math.BigInteger;

public class vf extends to {
   public byte[] at;
   public static long[] ad;
   public int au;
   static int[] ar = new int[256];
   static final int al = -306674912;
   public static final int am = 100;

   public int cv(int var1) {
      try {
         return this.at[(this.au += -1864458299) * -1027766515 - 1] & 255;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.cv(" + ')');
      }
   }

   public vf(int var1, boolean var2) {
      try {
         super();
         this.at = gm.ac(var1, var2, -2040252775);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.<init>(" + ')');
      }
   }

   public vf(byte[] var1) {
      try {
         super();
         this.at = var1;
         this.au = 0;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.<init>(" + ')');
      }
   }

   public int kx() {
      this.au += -1024308874;
      return (this.at[-1027766515 * this.au - 2] & 255) + ((this.at[-1027766515 * this.au - 1] & -430041021) << 8);
   }

   public int ce(int var1) {
      try {
         int var2 = this.at[this.au * -1027766515] & 255;
         if (var2 < 128) {
            if (var1 <= -437395969) {
               throw new IllegalStateException();
            } else {
               return this.cv(952452697) - 64;
            }
         } else {
            return this.ct(-1646678409) - '쀀';
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.ce(" + ')');
      }
   }

   public void br(int var1, int var2) {
      try {
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.br(" + ')');
      }
   }

   public int ks() {
      this.au += -1248085566;
      return ((this.at[-1027766515 * this.au - 1] & 255) << 8) + (this.at[this.au * 1454026204 - 2] - -308501610 & 255);
   }

   public void bv(int var1, int var2) {
      try {
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 24);
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 16);
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.bv(" + ')');
      }
   }

   public void bt(long var1) {
      try {
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)((int)(var1 >> 40));
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)((int)(var1 >> 32));
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)((int)(var1 >> 24));
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)((int)(var1 >> 16));
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)((int)(var1 >> 8));
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)((int)var1);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.bt(" + ')');
      }
   }

   public void bq(long var1) {
      try {
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)((int)(var1 >> 56));
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)((int)(var1 >> 48));
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)((int)(var1 >> 40));
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)((int)(var1 >> 32));
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)((int)(var1 >> 24));
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)((int)(var1 >> 16));
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)((int)(var1 >> 8));
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)((int)var1);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.bq(" + ')');
      }
   }

   public void fv(int var1) {
      this.at[(this.au += -1864458299) * 1824478931 - 1] = (byte)(var1 >> 24);
      this.at[(this.au += -1295945990) * -1027766515 - 1] = (byte)(var1 >> 16);
      this.at[(this.au += 1354469692) * -1497917836 - 1] = (byte)(var1 >> 8);
      this.at[(this.au += 2069940989) * -1027766515 - 1] = (byte)var1;
   }

   public void bc(String var1, int var2) {
      try {
         int var3 = var1.indexOf(0);
         if (var3 >= 0) {
            throw new IllegalArgumentException("");
         } else {
            this.au += nz.aq(var1, 0, var1.length(), this.at, this.au * -1027766515, -964317539) * -1864458299;
            this.at[(this.au += -1864458299) * -1027766515 - 1] = 0;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "vf.bc(" + ')');
      }
   }

   public void ch(String var1, int var2) {
      try {
         int var3 = var1.indexOf(0);
         if (var3 >= 0) {
            if (var2 != 1636334574) {
               throw new IllegalStateException();
            } else {
               throw new IllegalArgumentException("");
            }
         } else {
            this.at[(this.au += -1864458299) * -1027766515 - 1] = 0;
            this.au += nz.aq(var1, 0, var1.length(), this.at, this.au * -1027766515, 2081055996) * -1864458299;
            this.at[(this.au += -1864458299) * -1027766515 - 1] = 0;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "vf.ch(" + ')');
      }
   }

   public void ft(long var1) {
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)((int)(var1 >> 56));
      this.at[(this.au += -1333577093) * -1278403841 - 1] = (byte)((int)(var1 >> 48));
      this.at[(this.au += -1864458299) * 1609713405 - 1] = (byte)((int)(var1 >> 40));
      this.at[(this.au += -1864458299) * 1042060772 - 1] = (byte)((int)(var1 >> -1851613252));
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)((int)(var1 >> 24));
      this.at[(this.au += -1864458299) * 732942722 - 1] = (byte)((int)(var1 >> 16));
      this.at[(this.au += -1641772664) * 486907041 - 1] = (byte)((int)(var1 >> 8));
      this.at[(this.au += -583777726) * -1027766515 - 1] = (byte)((int)var1);
   }

   public void cu(byte[] var1, int var2, int var3, int var4) {
      try {
         for(int var5 = var2; var5 < var3 + var2; ++var5) {
            this.at[(this.au += -1864458299) * -1027766515 - 1] = var1[var5];
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "vf.cu(" + ')');
      }
   }

   public void cm(vf var1, int var2) {
      try {
         this.cu(var1.at, 0, var1.au * -1027766515, 195461796);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.cm(" + ')');
      }
   }

   public void cj(int var1, int var2) {
      try {
         if (var1 < 0) {
            throw new IllegalArgumentException();
         } else {
            this.at[this.au * -1027766515 - var1 - 4] = (byte)(var1 >> 24);
            this.at[-1027766515 * this.au - var1 - 3] = (byte)(var1 >> 16);
            this.at[this.au * -1027766515 - var1 - 2] = (byte)(var1 >> 8);
            this.at[-1027766515 * this.au - var1 - 1] = (byte)var1;
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.cj(" + ')');
      }
   }

   public void cx(int var1, byte var2) {
      try {
         if (var1 >= 0) {
            if (var2 == 8) {
               throw new IllegalStateException();
            }

            if (var1 <= 65535) {
               this.at[this.au * -1027766515 - var1 - 2] = (byte)(var1 >> 8);
               this.at[this.au * -1027766515 - var1 - 1] = (byte)var1;
               return;
            }

            if (var2 == 8) {
               throw new IllegalStateException();
            }
         }

         throw new IllegalArgumentException();
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.cx(" + ')');
      }
   }

   public void ci(int var1, byte var2) {
      try {
         if (var1 >= 0 && var1 <= 255) {
            this.at[-1027766515 * this.au - var1 - 1] = (byte)var1;
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.ci(" + ')');
      }
   }

   public void cy(int var1, int var2) {
      try {
         if (var1 >= 0 && var1 < 128) {
            if (var2 != 1036386215) {
               this.bu(var1, (byte)-34);
            }
         } else {
            if (var1 >= 0) {
               if (var2 == 1036386215) {
                  throw new IllegalStateException();
               }

               if (var1 < 32768) {
                  if (var2 == 1036386215) {
                     throw new IllegalStateException();
                  }

                  this.br(var1 + '耀', 1625888552);
                  return;
               }
            }

            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.cy(" + ')');
      }
   }

   public void fu(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.au += nz.aq(var1, 0, var1.length(), this.at, this.au * -1027766515, -2099190368) * -1864458299;
         this.at[(this.au += -1864458299) * -1027766515 - 1] = 0;
      }
   }

   public int im(int var1) {
      byte[] var3 = this.at;
      int var4 = this.au * -1027766515;
      int var5 = -1;

      for(int var6 = var1; var6 < var4; ++var6) {
         var5 = var5 >>> 8 ^ ar[(var5 ^ var3[var6]) & 255];
      }

      var5 = ~var5;
      this.bv(var5, 487544079);
      return var5;
   }

   public byte cg(short var1) {
      try {
         return this.at[(this.au += -1864458299) * -1027766515 - 1];
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.cg(" + ')');
      }
   }

   public String hg() {
      if (0 == this.at[-1027766515 * this.au]) {
         this.au += -1864458299;
         return null;
      } else {
         return this.cs(2096455743);
      }
   }

   public int cq(int var1) {
      try {
         this.au += 566050698;
         int var2 = (this.at[this.au * -1027766515 - 1] & 255) + ((this.at[-1027766515 * this.au - 2] & 255) << 8);
         if (var2 > 32767) {
            if (var1 <= -1821740113) {
               throw new IllegalStateException();
            }

            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.cq(" + ')');
      }
   }

   public int cc(int var1) {
      try {
         this.au += -1298407601;
         return (this.at[this.au * -1027766515 - 1] & 255) + ((this.at[this.au * -1027766515 - 3] & 255) << 16) + ((this.at[-1027766515 * this.au - 2] & 255) << 8);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.cc(" + ')');
      }
   }

   public int ea(int var1) {
      try {
         this.au += 566050698;
         return ((this.at[-1027766515 * this.au - 1] & 255) << 8) + (this.at[this.au * -1027766515 - 2] - 128 & 255);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.ea(" + ')');
      }
   }

   public long cw(int var1) {
      try {
         long var2 = (long)this.cz(-1734056172) & 4294967295L;
         long var4 = (long)this.cz(-1734056172) & 4294967295L;
         return (var2 << 32) + var4;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "vf.cw(" + ')');
      }
   }

   public float cr(int var1) {
      try {
         return Float.intBitsToFloat(this.cz(-1734056172));
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.cr(" + ')');
      }
   }

   public boolean cl(byte var1) {
      try {
         boolean var10000;
         if ((this.cv(952452697) & 1) == 1) {
            if (var1 == 88) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.cl(" + ')');
      }
   }

   public int hc() {
      this.au += -1298407601;
      return (this.at[this.au * -1027766515 - 1] & 255) + ((this.at[this.au * -1027766515 - 3] & 255) << 16) + ((this.at[-1027766515 * this.au - 2] & 255) << 8);
   }

   public void cf(CharSequence var1, int var2) {
      try {
         int var4 = var1.length();
         int var5 = 0;

         int var6;
         for(var6 = 0; var6 < var4; ++var6) {
            if (var2 == -593772667) {
               throw new IllegalStateException();
            }

            char var7 = var1.charAt(var6);
            if (var7 <= 127) {
               if (var2 == -593772667) {
                  throw new IllegalStateException();
               }

               ++var5;
            } else if (var7 <= 2047) {
               if (var2 == -593772667) {
                  throw new IllegalStateException();
               }

               var5 += 2;
            } else {
               var5 += 3;
            }
         }

         this.at[(this.au += -1864458299) * -1027766515 - 1] = 0;
         this.co(var5, (byte)65);
         var5 = this.au;
         byte[] var14 = this.at;
         int var8 = -1027766515 * this.au;
         int var9 = var1.length();
         int var10 = var8;

         for(int var11 = 0; var11 < var9; ++var11) {
            if (var2 == -593772667) {
               throw new IllegalStateException();
            }

            char var12 = var1.charAt(var11);
            if (var12 <= 127) {
               var14[var10++] = (byte)var12;
            } else if (var12 <= 2047) {
               if (var2 == -593772667) {
                  throw new IllegalStateException();
               }

               var14[var10++] = (byte)(192 | var12 >> 6);
               var14[var10++] = (byte)(128 | var12 & 63);
            } else {
               var14[var10++] = (byte)(224 | var12 >> 12);
               var14[var10++] = (byte)(128 | var12 >> 6 & 63);
               var14[var10++] = (byte)(128 | var12 & 63);
            }
         }

         var6 = var10 - var8;
         this.au = var5 + var6 * -1864458299;
      } catch (RuntimeException var13) {
         throw vk.ae(var13, "vf.cf(" + ')');
      }
   }

   public String cp(int var1) {
      try {
         byte var2 = this.at[(this.au += -1864458299) * -1027766515 - 1];
         if (0 != var2) {
            throw new IllegalStateException("");
         } else {
            int var3 = this.au * -1027766515;

            do {
               if (this.at[(this.au += -1864458299) * -1027766515 - 1] == 0) {
                  int var4 = -1027766515 * this.au - var3 - 1;
                  if (var4 == 0) {
                     if (var1 != -1147019783) {
                        throw new IllegalStateException();
                     }

                     return "";
                  }

                  return gq.af(this.at, var3, var4, -1246181277);
               }
            } while(var1 == -1147019783);

            throw new IllegalStateException();
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "vf.cp(" + ')');
      }
   }

   public String cb(byte var1) {
      try {
         byte var2 = this.at[(this.au += -1864458299) * -1027766515 - 1];
         if (var2 != 0) {
            if (var1 >= 54) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException("");
            }
         } else {
            int var3 = this.dk((byte)16);
            if (-1027766515 * this.au + var3 > this.at.length) {
               if (var1 >= 54) {
                  throw new IllegalStateException();
               } else {
                  throw new IllegalStateException("");
               }
            } else {
               String var4 = nd.ac(this.at, -1027766515 * this.au, var3, (byte)38);
               this.au += var3 * -1864458299;
               return var4;
            }
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "vf.cb(" + ')');
      }
   }

   public String ca(int var1) {
      try {
         if (0 == this.at[-1027766515 * this.au]) {
            if (var1 >= 1393991234) {
               throw new IllegalStateException();
            } else {
               this.au += -1864458299;
               return null;
            }
         } else {
            return this.cs(715046850);
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.ca(" + ')');
      }
   }

   public void gl(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.at[-1027766515 * this.au - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public int ck(byte var1) {
      try {
         int var2 = this.at[-1027766515 * this.au] & 255;
         if (var2 < 128) {
            if (var1 == 5) {
               throw new IllegalStateException();
            } else {
               return this.cv(952452697);
            }
         } else {
            return this.ct(-1795779190) - '耀';
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.ck(" + ')');
      }
   }

   public int dp(byte var1) {
      try {
         int var2 = this.at[this.au * -1027766515] & 255;
         if (var2 < 128) {
            if (var1 <= 31) {
               throw new IllegalStateException();
            } else {
               return this.cv(952452697) - 1;
            }
         } else {
            return this.ct(-2105844850) - '老';
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.dp(" + ')');
      }
   }

   public int df(int var1) {
      try {
         int var2 = 0;

         int var3;
         for(var3 = this.ck((byte)3); var3 == 32767; var3 = this.ck((byte)56)) {
            if (var1 != -1054010182) {
               throw new IllegalStateException();
            }

            var2 += 32767;
         }

         var2 += var3;
         return var2;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "vf.df(" + ')');
      }
   }

   public int dv(int var1) {
      try {
         if (this.at[this.au * -1027766515] < 0) {
            if (var1 >= 2024692169) {
               throw new IllegalStateException();
            } else {
               return this.cz(-1734056172) & Integer.MAX_VALUE;
            }
         } else {
            return this.ct(-1475377156);
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.dv(" + ')');
      }
   }

   public byte dg(int var1) {
      try {
         return (byte)(this.at[(this.au += -1864458299) * -1027766515 - 1] - 128);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.dg(" + ')');
      }
   }

   public int dk(byte var1) {
      try {
         byte var2 = this.at[(this.au += -1864458299) * -1027766515 - 1];

         int var3;
         for(var3 = 0; var2 < 0; var2 = this.at[(this.au += -1864458299) * -1027766515 - 1]) {
            if (var1 != 16) {
               throw new IllegalStateException();
            }

            var3 = (var3 | var2 & 127) << 7;
         }

         return var3 | var2;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "vf.dk(" + ')');
      }
   }

   public int dl(int var1) {
      try {
         int var3 = 0;
         int var4 = 0;

         int var2;
         do {
            var2 = this.cv(952452697);
            var3 |= (var2 & 127) << var4;
            var4 += 7;
         } while(var2 > 127);

         if (var1 >= -681674115) {
            throw new IllegalStateException();
         } else {
            return var3;
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "vf.dl(" + ')');
      }
   }

   public void fl(int var1) {
      if (var1 >= 0 && var1 <= 409944744) {
         this.at[this.au * -1027766515 - var1 - 2] = (byte)(var1 >> 8);
         this.at[this.au * -1027766515 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void dc(int[] var1, byte var2) {
      try {
         int var3 = this.au * -1027766515 / 8;
         this.au = 0;

         for(int var4 = 0; var4 < var3; ++var4) {
            int var5 = this.cz(-1734056172);
            int var6 = this.cz(-1734056172);
            int var7 = -957401312;
            int var8 = -1640531527;

            for(int var9 = 32; var9-- > 0; var5 -= (var6 << 4 ^ var6 >>> 5) + var6 ^ var1[var7 & 3] + var7) {
               var6 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var7 >>> 11 & 3] + var7;
               var7 -= var8;
            }

            this.au -= -2030764504;
            this.bv(var5, 886670683);
            this.bv(var6, 854167627);
         }

      } catch (RuntimeException var10) {
         throw vk.ae(var10, "vf.dc(" + ')');
      }
   }

   public void dw(int[] var1, int var2, int var3, int var4) {
      try {
         int var5 = -1027766515 * this.au;
         this.au = var2 * -1864458299;
         int var6 = (var3 - var2) / 8;

         for(int var7 = 0; var7 < var6; ++var7) {
            if (var4 == -1804121658) {
               return;
            }

            int var8 = this.cz(-1734056172);
            int var9 = this.cz(-1734056172);
            int var10 = 0;
            int var11 = -1640531527;

            for(int var12 = 32; var12-- > 0; var9 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var10 >>> 11 & 3] + var10) {
               if (var4 == -1804121658) {
                  throw new IllegalStateException();
               }

               var8 += (var9 << 4 ^ var9 >>> 5) + var9 ^ var10 + var1[var10 & 3];
               var10 += var11;
            }

            this.au -= -2030764504;
            this.bv(var8, 1219417494);
            this.bv(var9, 265748362);
         }

         this.au = var5 * -1864458299;
      } catch (RuntimeException var13) {
         throw vk.ae(var13, "vf.dw(" + ')');
      }
   }

   public int gk() {
      this.au += -1298407601;
      return (this.at[this.au * -1027766515 - 1] & 255) + ((this.at[this.au * -1027766515 - 3] & 255) << 16) + ((this.at[-1027766515 * this.au - 2] & 255) << 8);
   }

   public void dx(BigInteger var1, BigInteger var2, int var3) {
      try {
         int var4 = this.au * -1027766515;
         this.au = 0;
         byte[] var5 = new byte[var4];
         this.cd(var5, 0, var4, (byte)-21);
         BigInteger var6 = new BigInteger(var5);
         BigInteger var7 = var6.modPow(var1, var2);
         byte[] var8 = var7.toByteArray();
         this.au = 0;
         this.br(var8.length, 1625888552);
         this.cu(var8, 0, var8.length, -1411346771);
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "vf.dx(" + ')');
      }
   }

   public int dj(int var1, int var2) {
      try {
         byte[] var4 = this.at;
         int var5 = this.au * -1027766515;
         int var6 = -1;

         for(int var7 = var1; var7 < var5; ++var7) {
            if (var2 >= -1340257472) {
               throw new IllegalStateException();
            }

            var6 = var6 >>> 8 ^ ar[(var6 ^ var4[var7]) & 255];
         }

         var6 = ~var6;
         this.bv(var6, 892826805);
         return var6;
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "vf.dj(" + ')');
      }
   }

   public boolean do(byte var1) {
      try {
         this.au -= 1132101396;
         byte[] var3 = this.at;
         int var4 = -1027766515 * this.au;
         int var5 = -1;

         int var6;
         for(var6 = 0; var6 < var4; ++var6) {
            if (var1 != 75) {
               throw new IllegalStateException();
            }

            var5 = var5 >>> 8 ^ ar[(var5 ^ var3[var6]) & 255];
         }

         var5 = ~var5;
         var6 = this.cz(-1734056172);
         if (var6 == var5) {
            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "vf.do(" + ')');
      }
   }

   public int he() {
      this.au += 1132101396;
      return ((this.at[-1027766515 * this.au - 3] & 255) << 16) + ((this.at[-1027766515 * this.au - 4] & 255) << 24) + ((this.at[-1027766515 * this.au - 2] & 255) << 8) + (this.at[this.au * -1027766515 - 1] & 255);
   }

   public void ik(int[] var1, int var2, int var3) {
      int var4 = -1027766515 * this.au;
      this.au = var2 * -1864458299;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.cz(-1734056172);
         int var8 = this.cz(-1734056172);
         int var9 = 0;
         int var10 = -1640531527;

         for(int var11 = 32; var11-- > 0; var8 += var7 + (var7 << 4 ^ var7 >>> 5) ^ var1[var9 >>> 11 & 3] + var9) {
            var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ var9 + var1[var9 & 3];
            var9 += var10;
         }

         this.au -= -2030764504;
         this.bv(var7, 2141929688);
         this.bv(var8, 611299509);
      }

      this.au = var4 * -1864458299;
   }

   public void dq(int var1, int var2) {
      try {
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(128 - var1);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.dq(" + ')');
      }
   }

   public void fy(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException();
      } else {
         this.at[this.au * -1027766515 - var1 - 4] = (byte)(var1 >> 24);
         this.at[-1027766515 * this.au - var1 - 3] = (byte)(var1 >> 16);
         this.at[this.au * -1027766515 - var1 - 2] = (byte)(var1 >> 8);
         this.at[-1027766515 * this.au - var1 - 1] = (byte)var1;
      }
   }

   public static int ed(byte[] var0, int var1) {
      int var3 = -1;

      for(int var4 = 0; var4 < var1; ++var4) {
         var3 = var3 >>> 8 ^ ar[(var3 ^ var0[var4]) & 1066220024];
      }

      var3 = ~var3;
      return var3;
   }

   public void lr(int var1) {
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)var1;
      this.at[(this.au += -65600184) * -1027766515 - 1] = (byte)(var1 >> 8);
      this.at[(this.au += -548624026) * -1206276444 - 1] = (byte)(var1 >> 16);
      this.at[(this.au += 409154416) * -1027766515 - 1] = (byte)(var1 >> 24);
   }

   public int hf() {
      this.au += 1132101396;
      return ((this.at[-1027766515 * this.au - 3] & 255) << 16) + ((this.at[-1027766515 * this.au - 4] & 581678518) << 24) + ((this.at[-1027766515 * this.au - 2] & 864136711) << 8) + (this.at[this.au * 1921098773 - 1] & 526754340);
   }

   public byte dr(int var1) {
      try {
         return (byte)(0 - this.at[(this.au += -1864458299) * -1027766515 - 1]);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.dr(" + ')');
      }
   }

   public byte dy(int var1) {
      try {
         return (byte)(128 - this.at[(this.au += -1864458299) * -1027766515 - 1]);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.dy(" + ')');
      }
   }

   public void ds(int var1, int var2) {
      try {
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)var1;
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.ds(" + ')');
      }
   }

   public void el(int var1, int var2) {
      try {
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)var1;
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 24);
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 16);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.el(" + ')');
      }
   }

   public void jg(int var1) {
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(-1081038004 - var1);
   }

   public int dd(int var1) {
      try {
         this.au += 566050698;
         return (this.at[-1027766515 * this.au - 2] & 255) + ((this.at[-1027766515 * this.au - 1] & 255) << 8);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.dd(" + ')');
      }
   }

   public int ll() {
      this.au += 197462137;
      return ((this.at[628614424 * this.au - 3] & 255) << 8) + ((this.at[this.au * -1168473016 - 2] & 1891700059) << 16) + (this.at[this.au * -229796667 - 1] & 255);
   }

   public boolean hw() {
      return (this.cv(952452697) & 1) == 1;
   }

   public int ez(int var1) {
      try {
         this.au += 566050698;
         int var2 = (this.at[this.au * -1027766515 - 2] & 255) + ((this.at[-1027766515 * this.au - 1] & 255) << 8);
         if (var2 > 32767) {
            if (var1 <= 77782606) {
               throw new IllegalStateException();
            }

            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.ez(" + ')');
      }
   }

   public int ev(int var1) {
      try {
         this.au += 566050698;
         int var2 = ((this.at[this.au * -1027766515 - 2] & 255) << 8) + (this.at[this.au * -1027766515 - 1] - 128 & 255);
         if (var2 > 32767) {
            if (var1 != 552059702) {
               throw new IllegalStateException();
            }

            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.ev(" + ')');
      }
   }

   public int ef(short var1) {
      try {
         this.au += 566050698;
         int var2 = (this.at[this.au * -1027766515 - 2] - 128 & 255) + ((this.at[this.au * -1027766515 - 1] & 255) << 8);
         if (var2 > 32767) {
            if (var1 <= 217) {
               throw new IllegalStateException();
            }

            var2 -= 65536;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.ef(" + ')');
      }
   }

   public void lf(int var1) {
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 16);
      this.at[(this.au += -1864458299) * -1558955299 - 1] = (byte)(var1 >> 24);
      this.at[(this.au += -1027051257) * 138818506 - 1] = (byte)var1;
      this.at[(this.au += 1203086489) * -1027766515 - 1] = (byte)(var1 >> 8);
   }

   public void bu(int var1, byte var2) {
      try {
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.bu(" + ')');
      }
   }

   public int ex(int var1) {
      try {
         this.au += -1298407601;
         return ((this.at[this.au * -1027766515 - 1] & 255) << 8) + ((this.at[this.au * -1027766515 - 3] & 255) << 16) + (this.at[-1027766515 * this.au - 2] & 255);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.ex(" + ')');
      }
   }

   public int di(int var1) {
      try {
         return this.at[(this.au += -1864458299) * -1027766515 - 1] - 128 & 255;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.di(" + ')');
      }
   }

   public void ht(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         var1[var4] = this.at[(this.au += -1141199821) * -1310163834 - 1];
      }

   }

   public int ei(int var1) {
      try {
         this.au += -1298407601;
         int var2 = ((this.at[-1027766515 * this.au - 3] & 255) << 16) + ((this.at[this.au * -1027766515 - 1] & 255) << 8) + (this.at[-1027766515 * this.au - 2] & 255);
         if (var2 > 8388607) {
            if (var1 == 735655709) {
               throw new IllegalStateException();
            }

            var2 -= 16777216;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.ei(" + ')');
      }
   }

   public void eo(int var1, int var2) {
      try {
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)var1;
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 16);
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 24);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.eo(" + ')');
      }
   }

   public void bz(int var1) {
      try {
         if (this.at != null) {
            dq.ag(this.at, 841584675);
         }

         this.at = null;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.bz(" + ')');
      }
   }

   public void em(int var1, int var2) {
      try {
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 16);
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 24);
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)var1;
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.em(" + ')');
      }
   }

   public int en(int var1) {
      try {
         this.au += 1132101396;
         return (this.at[-1027766515 * this.au - 4] & 255) + ((this.at[-1027766515 * this.au - 1] & 255) << 24) + ((this.at[-1027766515 * this.au - 2] & 255) << 16) + ((this.at[this.au * -1027766515 - 3] & 255) << 8);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.en(" + ')');
      }
   }

   public int eb(int var1) {
      try {
         this.au += 1132101396;
         return (this.at[-1027766515 * this.au - 3] & 255) + ((this.at[-1027766515 * this.au - 1] & 255) << 16) + ((this.at[this.au * -1027766515 - 2] & 255) << 24) + ((this.at[this.au * -1027766515 - 4] & 255) << 8);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.eb(" + ')');
      }
   }

   public int ek(int var1) {
      try {
         this.au += 1132101396;
         return (this.at[-1027766515 * this.au - 2] & 255) + ((this.at[this.au * -1027766515 - 3] & 255) << 24) + ((this.at[this.au * -1027766515 - 4] & 255) << 16) + ((this.at[this.au * -1027766515 - 1] & 255) << 8);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.ek(" + ')');
      }
   }

   public void il(int[] var1) {
      int var2 = -1027766515 * this.au / 8;
      this.au = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.cz(-1734056172);
         int var5 = this.cz(-1734056172);
         int var6 = 0;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) {
            var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var6 & 3] + var6;
            var6 += var7;
         }

         this.au -= -2030764504;
         this.bv(var4, 1347009401);
         this.bv(var5, 605068366);
      }

   }

   public void ey(byte[] var1, int var2, int var3, int var4) {
      try {
         for(int var5 = var3 + var2 - 1; var5 >= var2; --var5) {
            if (var4 >= -1102458592) {
               throw new IllegalStateException();
            }

            var1[var5] = (byte)(this.at[(this.au += -1864458299) * -1027766515 - 1] - 128);
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "vf.ey(" + ')');
      }
   }

   static {
      int var2;
      for(int var1 = 0; var1 < 256; ++var1) {
         int var0 = var1;

         for(var2 = 0; var2 < 8; ++var2) {
            if ((var0 & 1) == 1) {
               var0 = var0 >>> 1 ^ -306674912;
            } else {
               var0 >>>= 1;
            }
         }

         ar[var1] = var0;
      }

      ad = new long[256];

      for(var2 = 0; var2 < 256; ++var2) {
         long var4 = (long)var2;

         for(int var3 = 0; var3 < 8; ++var3) {
            if ((var4 & 1L) == 1L) {
               var4 = var4 >>> 1 ^ -3932672073523589310L;
            } else {
               var4 >>>= 1;
            }
         }

         ad[var2] = var4;
      }

   }

   public static int er(byte[] var0, int var1) {
      int var3 = -1;

      for(int var4 = 0; var4 < var1; ++var4) {
         var3 = var3 >>> 8 ^ ar[(var3 ^ var0[var4]) & 843740081];
      }

      var3 = ~var3;
      return var3;
   }

   public void fb(boolean var1) {
      this.bu(var1 ? 1 : 0, (byte)56);
   }

   public void ee() {
      if (this.at != null) {
         dq.ag(this.at, 2147118836);
      }

      this.at = null;
   }

   public void eq() {
      if (this.at != null) {
         dq.ag(this.at, -1349377172);
      }

      this.at = null;
   }

   public int ip() {
      byte var1 = this.at[(this.au += -1864458299) * -1027766515 - 1];

      int var2;
      for(var2 = 0; var1 < 0; var1 = this.at[(this.au += -1864458299) * -1027766515 - 1]) {
         var2 = (var2 | var1 & 127) << 7;
      }

      return var2 | var1;
   }

   public void ec(int var1) {
      this.at[(this.au += -1864458299) * 1686209732 - 1] = (byte)var1;
   }

   public void et(int var1) {
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 24);
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 16);
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)var1;
   }

   public long hi() {
      long var1 = (long)this.cz(-1734056172) & 4294967295L;
      long var3 = (long)this.cz(-1734056172) & 4294967295L;
      return (var1 << 114233694) + var3;
   }

   public int lq() {
      this.au += 1216390636;
      return ((this.at[-1027766515 * this.au - 3] & -598175938) << 8) + ((this.at[this.au * 1304800693 - 2] & 255) << 16) + (this.at[this.au * -1027766515 - 1] & 795013553);
   }

   public void fe(long var1) {
      this.at[(this.au += -791080988) * -1452566625 - 1] = (byte)((int)(var1 >> -1462081084));
      this.at[(this.au += 1786020187) * 1612502940 - 1] = (byte)((int)(var1 >> 32));
      this.at[(this.au += -437145175) * -235658575 - 1] = (byte)((int)(var1 >> 24));
      this.at[(this.au += -1109234542) * -1027766515 - 1] = (byte)((int)(var1 >> 16));
      this.at[(this.au += -1864458299) * -966313040 - 1] = (byte)((int)(var1 >> 8));
      this.at[(this.au += -1864458299) * 1955265300 - 1] = (byte)((int)var1);
   }

   public boolean hj() {
      return (this.cv(952452697) & 1) == 1;
   }

   public static int fk(String var0) {
      return var0.length() + 1;
   }

   public void ki(int var1) {
      this.at[(this.au += 2083557611) * 309265281 - 1] = (byte)(var1 >> 8);
      this.at[(this.au += -1864458299) * 1023124265 - 1] = (byte)(var1 + -1215205104);
   }

   public static int fp(String var0) {
      return var0.length() + 1;
   }

   public static int fr(String var0) {
      return var0.length() + 1;
   }

   public void fg(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.au += nz.aq(var1, 0, var1.length(), this.at, this.au * -1027766515, -17973580) * -1864458299;
         this.at[(this.au += -1864458299) * -1027766515 - 1] = 0;
      }
   }

   public int id() {
      int var1 = 0;

      int var2;
      for(var2 = this.ck((byte)-60); var2 == 32767; var2 = this.ck((byte)120)) {
         var1 += 32767;
      }

      var1 += var2;
      return var1;
   }

   public void fj(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.au += nz.aq(var1, 0, var1.length(), this.at, this.au * 266506142, 1988909103) * -1864458299;
         this.at[(this.au += -1036794199) * -556067541 - 1] = 0;
      }
   }

   public static int fs(String var0) {
      return var0.length() + 2;
   }

   public static int fq(String var0) {
      return var0.length() + 2;
   }

   public static int fn(String var0) {
      return var0.length() + 2;
   }

   public void iu(BigInteger var1, BigInteger var2) {
      int var3 = this.au * -1027766515;
      this.au = 0;
      byte[] var4 = new byte[var3];
      this.cd(var4, 0, var3, (byte)-112);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(var1, var2);
      byte[] var7 = var6.toByteArray();
      this.au = 0;
      this.br(var7.length, 1625888552);
      this.cu(var7, 0, var7.length, 986662903);
   }

   public void fh(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.at[(this.au += -1864458299) * -1027766515 - 1] = 0;
         this.au += nz.aq(var1, 0, var1.length(), this.at, this.au * -1027766515, -199356883) * -1384069076;
         this.at[(this.au += 1490035115) * -1027766515 - 1] = 0;
      }
   }

   public void fw(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.at[(this.au += -1808476905) * 74616575 - 1] = 0;
         this.au += nz.aq(var1, 0, var1.length(), this.at, this.au * -1027766515, 81513761) * -1864458299;
         this.at[(this.au += -507499163) * -1027766515 - 1] = 0;
      }
   }

   public int dz(int var1) {
      try {
         return 128 - this.at[(this.au += -1864458299) * -1027766515 - 1] & 255;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.dz(" + ')');
      }
   }

   public void fi(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         this.at[(this.au += -455412689) * -1027766515 - 1] = var1[var4];
      }

   }

   public int gr() {
      this.au += 566050698;
      return ((this.at[this.au * -1027766515 - 2] & 255) << 8) + (this.at[this.au * -1027766515 - 1] & 255);
   }

   public void kp(int var1) {
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 + 128);
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
   }

   public int it() {
      int var2 = 0;
      int var3 = 0;

      int var1;
      do {
         var1 = this.cv(952452697);
         var2 |= (var1 & 127) << var3;
         var3 += 7;
      } while(var1 > 127);

      return var2;
   }

   public void ej(int var1) {
      this.at[(this.au += -1864458299) * 57981648 - 1] = (byte)var1;
   }

   public void fz(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException();
      } else {
         this.at[this.au * -1027766515 - var1 - 4] = (byte)(var1 >> 24);
         this.at[-1027766515 * this.au - var1 - 3] = (byte)(var1 >> 16);
         this.at[this.au * -1027766515 - var1 - 2] = (byte)(var1 >> 8);
         this.at[-1027766515 * this.au - var1 - 1] = (byte)var1;
      }
   }

   public void fa(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         this.at[this.au * -1027766515 - var1 - 2] = (byte)(var1 >> 8);
         this.at[this.au * -1027766515 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void md(byte[] var1, int var2, int var3) {
      for(int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
         var1[var4] = (byte)(this.at[(this.au += -1864458299) * -1027766515 - 1] - 128);
      }

   }

   public void ga(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.at[788502482 * this.au - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void dh(int var1, int var2) {
      try {
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(128 + var1);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.dh(" + ')');
      }
   }

   public void kd(int var1) {
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 + 128);
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
   }

   public void ge(int var1) {
      if (var1 >= 0 && var1 < 128) {
         this.bu(var1, (byte)-75);
      } else if (var1 >= 0 && var1 < 32768) {
         this.br(var1 + '耀', 1625888552);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public int ja() {
      return 0 - this.at[(this.au += -1864458299) * -1027766515 - 1] & 255;
   }

   public void dm(int var1, byte var2) {
      try {
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(0 - var1);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.dm(" + ')');
      }
   }

   public void gs(int var1) {
      if (0 != (var1 & 1860156077)) {
         if ((var1 & -16384) != 0) {
            if (0 != (var1 & 654306102)) {
               if (0 != (var1 & 1076320277)) {
                  this.bu(var1 >>> 28 | 128, (byte)61);
               }

               this.bu(var1 >>> 21 | 128, (byte)0);
            }

            this.bu(var1 >>> 14 | 66972070, (byte)5);
         }

         this.bu(var1 >>> 7 | 128, (byte)-88);
      }

      this.bu(var1 & 127, (byte)-47);
   }

   public void gp(int var1) {
      if (0 != (var1 & -128)) {
         if ((var1 & 824776401) != 0) {
            if (0 != (var1 & -2097152)) {
               if (0 != (var1 & -268435456)) {
                  this.bu(var1 >>> 28 | 573496930, (byte)-14);
               }

               this.bu(var1 >>> 21 | 128, (byte)-62);
            }

            this.bu(var1 >>> 14 | 1370831461, (byte)79);
         }

         this.bu(var1 >>> 7 | 1001960029, (byte)-39);
      }

      this.bu(var1 & 127, (byte)62);
   }

   public int gf() {
      return this.at[(this.au += -1864458299) * -1027766515 - 1] & 2118105582;
   }

   public int gx() {
      return this.at[(this.au += -1864458299) * 686132603 - 1] & -1207706282;
   }

   public byte jz() {
      return (byte)(this.at[(this.au += -1864458299) * -1027766515 - 1] - 128);
   }

   public int gj() {
      return this.at[(this.au += -1864458299) * -1027766515 - 1] & 255;
   }

   public int gt() {
      return this.at[(this.au += -1864458299) * -1027766515 - 1] & 1962265310;
   }

   public byte gz() {
      return this.at[(this.au += -1864458299) * -1027766515 - 1];
   }

   public int gm() {
      this.au += 566050698;
      return ((this.at[this.au * -1652960195 - 2] & 1522731172) << 8) + (this.at[this.au * 281886777 - 1] & 255);
   }

   public int gc() {
      this.au += 566050698;
      return ((this.at[this.au * -1050687429 - 2] & 466856909) << 8) + (this.at[this.au * -1027766515 - 1] & 255);
   }

   public int gw() {
      this.au += 1693205583;
      return ((this.at[this.au * -1027766515 - 2] & 255) << 8) + (this.at[this.au * 524206136 - 1] & 255);
   }

   public void go(int var1) {
      if (0 != (var1 & -128)) {
         if ((var1 & -16384) != 0) {
            if (0 != (var1 & -2097152)) {
               if (0 != (var1 & -268435456)) {
                  this.bu(var1 >>> 28 | 128, (byte)-2);
               }

               this.bu(var1 >>> 21 | 128, (byte)13);
            }

            this.bu(var1 >>> 14 | 128, (byte)16);
         }

         this.bu(var1 >>> 7 | 128, (byte)51);
      }

      this.bu(var1 & 127, (byte)-10);
   }

   public int gq() {
      this.au += 566050698;
      return ((this.at[this.au * -1027766515 - 2] & 255) << 8) + (this.at[this.au * -1027766515 - 1] & 255);
   }

   public int gv() {
      this.au += 566050698;
      int var1 = (this.at[this.au * -1027766515 - 1] & 255) + ((this.at[-1027766515 * this.au - 2] & 255) << 8);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public int eh(short var1) {
      try {
         this.au += -1298407601;
         return ((this.at[-1027766515 * this.au - 3] & 255) << 8) + ((this.at[this.au * -1027766515 - 2] & 255) << 16) + (this.at[this.au * -1027766515 - 1] & 255);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.eh(" + ')');
      }
   }

   public void fm(vf var1) {
      this.cu(var1.at, 0, var1.au * -1027766515, 1322785025);
   }

   public int jh() {
      return this.at[(this.au += -1864458299) * -1027766515 - 1] - 128 & 255;
   }

   public int gy() {
      this.au += -2032363752;
      return (this.at[this.au * 524995327 - 1] & 255) + ((this.at[this.au * 879384605 - 3] & 255) << 16) + ((this.at[-1027766515 * this.au - 2] & 255) << 8);
   }

   public int eu(int var1) {
      try {
         this.au += -1298407601;
         int var2 = (this.at[-1027766515 * this.au - 3] & 255) + ((this.at[this.au * -1027766515 - 2] & 255) << 8) + ((this.at[-1027766515 * this.au - 1] & 255) << 16);
         if (var2 > 8388607) {
            if (var1 <= 2144161012) {
               throw new IllegalStateException();
            }

            var2 -= 16777216;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.eu(" + ')');
      }
   }

   public void jr(int var1) {
      this.at[(this.au += -1864458299) * -567898047 - 1] = (byte)(128 + var1);
   }

   public int jn() {
      return 0 - this.at[(this.au += 518740926) * -1027766515 - 1] & 255;
   }

   public int hr() {
      this.au += 1132101396;
      return ((this.at[1247451168 * this.au - 3] & 255) << 16) + ((this.at[510812892 * this.au - 4] & 255) << 24) + ((this.at[-1027766515 * this.au - 2] & -660485218) << 8) + (this.at[this.au * -1027766515 - 1] & 255);
   }

   public long hk() {
      long var1 = (long)this.cz(-1734056172) & 4294967295L;
      long var3 = (long)this.cz(-1734056172) & 4294967295L;
      return (var1 << 32) + var3;
   }

   public int lu() {
      this.au += -1298407601;
      return ((this.at[this.au * -1027766515 - 1] & 255) << 8) + ((this.at[this.au * -1027766515 - 3] & -1864531853) << 16) + (this.at[345008425 * this.au - 2] & 2133308084);
   }

   public long hy() {
      long var1 = (long)this.cz(-1734056172) & 4294967295L;
      long var3 = (long)this.cz(-1734056172) & 4294967295L;
      return (var1 << 32) + var3;
   }

   public float hd() {
      return Float.intBitsToFloat(this.cz(-1734056172));
   }

   public void bk(boolean var1, int var2) {
      try {
         byte var10001;
         if (var1) {
            if (var2 == -1473149712) {
               throw new IllegalStateException();
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         this.bu(var10001, (byte)-35);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.bk(" + ')');
      }
   }

   public void jo(int var1) {
      this.at[(this.au += -1864458299) * 575410098 - 1] = (byte)(0 - var1);
   }

   public int kb() {
      this.au += 566050698;
      int var1 = (this.at[this.au * -1027766515 - 2] & 255) + ((this.at[-1027766515 * this.au - 1] & 255) << 8);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public String hp() {
      if (0 == this.at[-1088300867 * this.au]) {
         this.au += -1864458299;
         return null;
      } else {
         return this.cs(1025157123);
      }
   }

   public String hn() {
      int var1 = -1027766515 * this.au;

      while(this.at[(this.au += -1864458299) * -1027766515 - 1] != 0) {
      }

      int var2 = this.au * -1027766515 - var1 - 1;
      return 0 == var2 ? "" : gq.af(this.at, var1, var2, -1854531950);
   }

   public void fd(CharSequence var1) {
      int var3 = var1.length();
      int var4 = 0;

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         char var6 = var1.charAt(var5);
         if (var6 <= -1566327275) {
            ++var4;
         } else if (var6 <= 2047) {
            var4 += 2;
         } else {
            var4 += 3;
         }
      }

      this.at[(this.au += -1864458299) * -1027766515 - 1] = 0;
      this.co(var4, (byte)-34);
      var4 = this.au;
      byte[] var12 = this.at;
      int var7 = -1027766515 * this.au;
      int var8 = var1.length();
      int var9 = var7;

      for(int var10 = 0; var10 < var8; ++var10) {
         char var11 = var1.charAt(var10);
         if (var11 <= 127) {
            var12[var9++] = (byte)var11;
         } else if (var11 <= 2047) {
            var12[var9++] = (byte)(192 | var11 >> 6);
            var12[var9++] = (byte)(128 | var11 & 65484257);
         } else {
            var12[var9++] = (byte)(224 | var11 >> 12);
            var12[var9++] = (byte)(334874600 | var11 >> 6 & -571044109);
            var12[var9++] = (byte)(-400590420 | var11 & 729082917);
         }
      }

      var5 = var9 - var7;
      this.au = var4 + var5 * -2027983712;
   }

   public String hq() {
      byte var1 = this.at[(this.au += 1449207068) * 732161121 - 1];
      if (0 != var1) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.au * -1027766515;

         while(this.at[(this.au += -160601015) * -1027766515 - 1] != 0) {
         }

         int var3 = 931960995 * this.au - var2 - 1;
         return var3 == 0 ? "" : gq.af(this.at, var2, var3, 1973476133);
      }
   }

   public String hm() {
      byte var1 = this.at[(this.au += -1864458299) * -1027766515 - 1];
      if (0 != var1) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.au * -1027766515;

         while(this.at[(this.au += -1864458299) * -1027766515 - 1] != 0) {
         }

         int var3 = -1027766515 * this.au - var2 - 1;
         return var3 == 0 ? "" : gq.af(this.at, var2, var3, 326290610);
      }
   }

   public String hb() {
      int var1 = -1027766515 * this.au;

      while(this.at[(this.au += -1864458299) * -1027766515 - 1] != 0) {
      }

      int var2 = this.au * -1027766515 - var1 - 1;
      return 0 == var2 ? "" : gq.af(this.at, var1, var2, -1523938379);
   }

   public String hu() {
      byte var1 = this.at[(this.au += -1864458299) * 155866770 - 1];
      if (var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.dk((byte)16);
         if (-1027766515 * this.au + var2 > this.at.length) {
            throw new IllegalStateException("");
         } else {
            String var3 = nd.ac(this.at, -1027766515 * this.au, var2, (byte)38);
            this.au += var2 * -1279464014;
            return var3;
         }
      }
   }

   public int cz(int var1) {
      try {
         this.au += 1132101396;
         return ((this.at[-1027766515 * this.au - 3] & 255) << 16) + ((this.at[-1027766515 * this.au - 4] & 255) << 24) + ((this.at[-1027766515 * this.au - 2] & 255) << 8) + (this.at[this.au * -1027766515 - 1] & 255);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.cz(" + ')');
      }
   }

   public void hh(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         var1[var4] = this.at[(this.au += -1864458299) * 1001034281 - 1];
      }

   }

   public int hv() {
      int var1 = this.at[this.au * -1027766515] & 255;
      return var1 < 128 ? this.cv(952452697) - 64 : this.ct(-1627805169) - '쀀';
   }

   public int hl() {
      int var1 = this.at[this.au * -1027766515] & 255;
      return var1 < 128 ? this.cv(952452697) - 64 : this.ct(-1864912018) - '쀀';
   }

   public int ha() {
      int var1 = this.at[this.au * 319092674] & 255;
      return var1 < 128 ? this.cv(952452697) - -1789618816 : this.ct(-1772786361) - -1536171352;
   }

   public int hx() {
      int var1 = this.at[-1027766515 * this.au] & 255;
      return var1 < 128 ? this.cv(952452697) : this.ct(-1423544640) - '耀';
   }

   public int ho() {
      int var1 = this.at[this.au * -1027766515] & 255;
      return var1 < 128 ? this.cv(952452697) - 1 : this.ct(-1836942217) - '老';
   }

   public int hs() {
      int var1 = this.at[this.au * -1141443143] & 255;
      return var1 < 128 ? this.cv(952452697) - 1 : this.ct(-1504696060) - -2076236171;
   }

   public int ie() {
      int var1 = this.at[this.au * -1027766515] & 255;
      return var1 < 128 ? this.cv(952452697) - 1 : this.ct(-2016464423) - '老';
   }

   public int ct(int var1) {
      try {
         this.au += 566050698;
         return ((this.at[this.au * -1027766515 - 2] & 255) << 8) + (this.at[this.au * -1027766515 - 1] & 255);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.ct(" + ')');
      }
   }

   public int ic(int var1) {
      byte[] var3 = this.at;
      int var4 = this.au * -1027766515;
      int var5 = -1;

      for(int var6 = var1; var6 < var4; ++var6) {
         var5 = var5 >>> 8 ^ ar[(var5 ^ var3[var6]) & 255];
      }

      var5 = ~var5;
      this.bv(var5, 1693058369);
      return var5;
   }

   public int ia() {
      return this.at[this.au * -1027766515] < 0 ? this.cz(-1734056172) & Integer.MAX_VALUE : this.ct(-1918992765);
   }

   public int if() {
      if (this.at[this.au * -1027766515] < 0) {
         return this.cz(-1734056172) & Integer.MAX_VALUE;
      } else {
         int var1 = this.ct(-2137929432);
         return 32767 == var1 ? -1 : var1;
      }
   }

   public int ii() {
      if (this.at[this.au * 1113468083] < 0) {
         return this.cz(-1734056172) & Integer.MAX_VALUE;
      } else {
         int var1 = this.ct(-1874437370);
         return 281733379 == var1 ? -1 : var1;
      }
   }

   public int iz() {
      byte var1 = this.at[(this.au += -1864458299) * -1027766515 - 1];

      int var2;
      for(var2 = 0; var1 < 0; var1 = this.at[(this.au += -1864458299) * -1027766515 - 1]) {
         var2 = (var2 | var1 & 127) << 7;
      }

      return var2 | var1;
   }

   public int ij() {
      byte var1 = this.at[(this.au += -1864458299) * -1027766515 - 1];

      int var2;
      for(var2 = 0; var1 < 0; var1 = this.at[(this.au += -1864458299) * -1027766515 - 1]) {
         var2 = (var2 | var1 & 127) << 7;
      }

      return var2 | var1;
   }

   public int gi() {
      this.au += 566050698;
      int var1 = (this.at[this.au * -1027766515 - 1] & 255) + ((this.at[-1027766515 * this.au - 2] & 255) << 8);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public int ix() {
      byte var1 = this.at[(this.au += -1864458299) * -1027766515 - 1];

      int var2;
      for(var2 = 0; var1 < 0; var1 = this.at[(this.au += -1864458299) * -1027766515 - 1]) {
         var2 = (var2 | var1 & 127) << 7;
      }

      return var2 | var1;
   }

   public int ir() {
      int var2 = 0;
      int var3 = 0;

      int var1;
      do {
         var1 = this.cv(952452697);
         var2 |= (var1 & 127) << var3;
         var3 += 7;
      } while(var1 > 127);

      return var2;
   }

   public void gd(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.at[1023237428 * this.au - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public vf(int var1) {
      try {
         super();
         this.at = pd.ae(var1, -2129547212);
         this.au = 0;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.<init>(" + ')');
      }
   }

   public void iw(int[] var1) {
      int var2 = -402469171 * this.au / 8;
      this.au = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.cz(-1734056172);
         int var5 = this.cz(-1734056172);
         int var6 = 0;
         int var7 = -1997473518;

         for(int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) {
            var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var6 & 3] + var6;
            var6 += var7;
         }

         this.au -= -2030764504;
         this.bv(var4, 1320114109);
         this.bv(var5, 1169679279);
      }

   }

   public void iv(int[] var1) {
      int var2 = -1027766515 * this.au / 8;
      this.au = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.cz(-1734056172);
         int var5 = this.cz(-1734056172);
         int var6 = 0;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var5 += var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6) {
            var4 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var6 & 3] + var6;
            var6 += var7;
         }

         this.au -= -2030764504;
         this.bv(var4, 926669114);
         this.bv(var5, 711699165);
      }

   }

   public void gb(int var1) {
      if (var1 >= 0 && var1 < -1803555169) {
         this.bu(var1, (byte)33);
      } else if (var1 >= 0 && var1 < 32768) {
         this.br(var1 + '耀', 1625888552);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public byte km() {
      return (byte)(128 - this.at[(this.au += -1864458299) * -1479787070 - 1]);
   }

   public void ib(int[] var1, int var2, int var3) {
      int var4 = this.au * -1027766515;
      this.au = -1864458299 * var2;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.cz(-1734056172);
         int var8 = this.cz(-1734056172);
         int var9 = -957401312;
         int var10 = -1640531527;

         for(int var11 = 32; var11-- > 0; var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var9 + var1[var9 & 3]) {
            var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ var1[var9 >>> 11 & 3] + var9;
            var9 -= var10;
         }

         this.au -= -2030764504;
         this.bv(var7, 867736742);
         this.bv(var8, 1884295339);
      }

      this.au = -1864458299 * var4;
   }

   public void ig(int[] var1, int var2, int var3) {
      int var4 = this.au * -1027766515;
      this.au = -1864458299 * var2;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.cz(-1734056172);
         int var8 = this.cz(-1734056172);
         int var9 = -957401312;
         int var10 = -1640531527;

         for(int var11 = 32; var11-- > 0; var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var9 + var1[var9 & 3]) {
            var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ var1[var9 >>> 11 & 3] + var9;
            var9 -= var10;
         }

         this.au -= -2030764504;
         this.bv(var7, 1148537970);
         this.bv(var8, 1738076238);
      }

      this.au = -1864458299 * var4;
   }

   public void iy(int[] var1, int var2, int var3) {
      int var4 = this.au * -1027766515;
      this.au = -1864458299 * var2;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.cz(-1734056172);
         int var8 = this.cz(-1734056172);
         int var9 = 733143817;
         int var10 = -1640531527;

         for(int var11 = -1795443269; var11-- > 0; var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var9 + var1[var9 & 3]) {
            var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ var1[var9 >>> 11 & 3] + var9;
            var9 -= var10;
         }

         this.au -= -1309426949;
         this.bv(var7, 2044545413);
         this.bv(var8, 518587073);
      }

      this.au = -1864458299 * var4;
   }

   public void ih(int[] var1, int var2, int var3) {
      int var4 = this.au * 497898427;
      this.au = -1864458299 * var2;
      int var5 = (var3 - var2) / 8;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = this.cz(-1734056172);
         int var8 = this.cz(-1734056172);
         int var9 = -957401312;
         int var10 = -1640531527;

         for(int var11 = 32; var11-- > 0; var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var9 + var1[var9 & 3]) {
            var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ var1[var9 >>> 11 & 3] + var9;
            var9 -= var10;
         }

         this.au -= -2030764504;
         this.bv(var7, 609722371);
         this.bv(var8, 1424659417);
      }

      this.au = -1864458299 * var4;
   }

   public int is() {
      return this.at[this.au * -1027766515] < 0 ? this.cz(-1734056172) & Integer.MAX_VALUE : this.ct(-2025999892);
   }

   public void iq(BigInteger var1, BigInteger var2) {
      int var3 = this.au * -1027766515;
      this.au = 0;
      byte[] var4 = new byte[var3];
      this.cd(var4, 0, var3, (byte)-7);
      BigInteger var5 = new BigInteger(var4);
      BigInteger var6 = var5.modPow(var1, var2);
      byte[] var7 = var6.toByteArray();
      this.au = 0;
      this.br(var7.length, 1625888552);
      this.cu(var7, 0, var7.length, 406268829);
   }

   public void lx(int var1) {
      this.at[(this.au += 421863005) * 705246315 - 1] = (byte)var1;
      this.at[(this.au += -1864458299) * -1262376046 - 1] = (byte)(var1 >> 8);
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 16);
      this.at[(this.au += -1864458299) * -796741537 - 1] = (byte)(var1 >> 24);
   }

   public int in(int var1) {
      byte[] var3 = this.at;
      int var4 = this.au * 259529428;
      int var5 = -1;

      for(int var6 = var1; var6 < var4; ++var6) {
         var5 = var5 >>> 8 ^ ar[(var5 ^ var3[var6]) & 1973203398];
      }

      var5 = ~var5;
      this.bv(var5, 1545865977);
      return var5;
   }

   public void jp(int var1) {
      this.at[(this.au += -1864458299) * 1455403390 - 1] = (byte)(1055134248 - var1);
   }

   public String hz() {
      byte var1 = this.at[(this.au += -1864458299) * -1027766515 - 1];
      if (var1 != 0) {
         throw new IllegalStateException("");
      } else {
         int var2 = this.dk((byte)16);
         if (-1027766515 * this.au + var2 > this.at.length) {
            throw new IllegalStateException("");
         } else {
            String var3 = nd.ac(this.at, -1027766515 * this.au, var2, (byte)38);
            this.au += var2 * -1864458299;
            return var3;
         }
      }
   }

   public void jf(int var1) {
      this.at[(this.au += 552141962) * -1027766515 - 1] = (byte)(375657826 + var1);
   }

   public int eg(int var1) {
      try {
         this.au += 566050698;
         return ((this.at[-1027766515 * this.au - 2] & 255) << 8) + (this.at[this.au * -1027766515 - 1] - 128 & 255);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.eg(" + ')');
      }
   }

   public void jt(int var1) {
      this.at[(this.au += -1864458299) * -1764525585 - 1] = (byte)(-1777658362 + var1);
   }

   public void je(int var1) {
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(128 + var1);
   }

   public void jw(int var1) {
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(0 - var1);
   }

   public int gu() {
      return this.at[(this.au += -1864458299) * -1027766515 - 1] & 255;
   }

   public void io(int[] var1) {
      int var2 = this.au * -1027766515 / 8;
      this.au = 0;

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = this.cz(-1734056172);
         int var5 = this.cz(-1734056172);
         int var6 = -957401312;
         int var7 = -1640531527;

         for(int var8 = 32; var8-- > 0; var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var1[var6 & 3] + var6) {
            var5 -= var4 + (var4 << 4 ^ var4 >>> 5) ^ var1[var6 >>> 11 & 3] + var6;
            var6 -= var7;
         }

         this.au -= -2030764504;
         this.bv(var4, 1359905890);
         this.bv(var5, 592696016);
      }

   }

   public void ji(int var1) {
      this.at[(this.au += -451431257) * -1027766515 - 1] = (byte)(-1659072030 - var1);
   }

   public void ff(int var1) {
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 24);
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 16);
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)var1;
   }

   public void ew(int var1, int var2) {
      try {
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 16);
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)var1;
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.ew(" + ')');
      }
   }

   public void de(int[] var1, int var2, int var3, int var4) {
      try {
         int var5 = this.au * -1027766515;
         this.au = -1864458299 * var2;
         int var6 = (var3 - var2) / 8;

         for(int var7 = 0; var7 < var6; ++var7) {
            if (var4 <= -959934118) {
               throw new IllegalStateException();
            }

            int var8 = this.cz(-1734056172);
            int var9 = this.cz(-1734056172);
            int var10 = -957401312;
            int var11 = -1640531527;

            for(int var12 = 32; var12-- > 0; var8 -= (var9 << 4 ^ var9 >>> 5) + var9 ^ var10 + var1[var10 & 3]) {
               if (var4 <= -959934118) {
                  throw new IllegalStateException();
               }

               var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10;
               var10 -= var11;
            }

            this.au -= -2030764504;
            this.bv(var8, 2030725487);
            this.bv(var9, 2055241933);
         }

         this.au = -1864458299 * var5;
      } catch (RuntimeException var13) {
         throw vk.ae(var13, "vf.de(" + ')');
      }
   }

   public void fo(String var1) {
      int var2 = var1.indexOf(0);
      if (var2 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.at[(this.au += -1864458299) * -1027766515 - 1] = 0;
         this.au += nz.aq(var1, 0, var1.length(), this.at, this.au * -1027766515, -713666778) * -1864458299;
         this.at[(this.au += -1864458299) * -1027766515 - 1] = 0;
      }
   }

   public int ju() {
      return -374015674 - this.at[(this.au += -1864458299) * 819638510 - 1] & -1122916062;
   }

   public int js() {
      return 128 - this.at[(this.au += -1864458299) * -1027766515 - 1] & 255;
   }

   public byte jk() {
      return (byte)(this.at[(this.au += -1864458299) * -2906970 - 1] - 128);
   }

   public void co(int var1, byte var2) {
      try {
         if (0 != (var1 & -128)) {
            if (var2 == 8) {
               throw new IllegalStateException();
            }

            if ((var1 & -16384) != 0) {
               if (var2 == 8) {
                  throw new IllegalStateException();
               }

               if (0 != (var1 & -2097152)) {
                  if (var2 == 8) {
                     return;
                  }

                  if (0 != (var1 & -268435456)) {
                     if (var2 == 8) {
                        return;
                     }

                     this.bu(var1 >>> 28 | 128, (byte)84);
                  }

                  this.bu(var1 >>> 21 | 128, (byte)-9);
               }

               this.bu(var1 >>> 14 | 128, (byte)27);
            }

            this.bu(var1 >>> 7 | 128, (byte)-22);
         }

         this.bu(var1 & 127, (byte)31);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.co(" + ')');
      }
   }

   public byte jq() {
      return (byte)(0 - this.at[(this.au += -1864458299) * -71106605 - 1]);
   }

   public byte jx() {
      return (byte)(0 - this.at[(this.au += -1317292084) * -1027766515 - 1]);
   }

   public byte jd() {
      return (byte)(128 - this.at[(this.au += -1864458299) * -1027766515 - 1]);
   }

   public byte kr() {
      return (byte)(128 - this.at[(this.au += -1864458299) * -1027766515 - 1]);
   }

   public void ko(int var1) {
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 16);
      this.at[(this.au += 1824253064) * -1027766515 - 1] = (byte)var1;
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
   }

   public void kj(int var1) {
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)var1;
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
   }

   public String cs(int var1) {
      try {
         int var2 = -1027766515 * this.au;

         do {
            if (this.at[(this.au += -1864458299) * -1027766515 - 1] == 0) {
               int var3 = this.au * -1027766515 - var2 - 1;
               if (0 == var3) {
                  if (var1 == -1407589755) {
                     throw new IllegalStateException();
                  }

                  return "";
               }

               return gq.af(this.at, var2, var3, 1538758838);
            }
         } while(var1 != -1407589755);

         throw new IllegalStateException();
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "vf.cs(" + ')');
      }
   }

   public void kn(int var1) {
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)var1;
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
   }

   public void kg(int var1) {
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 + 128);
   }

   public void kc(int var1) {
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 + 128);
   }

   public void cd(byte[] var1, int var2, int var3, byte var4) {
      try {
         for(int var5 = var2; var5 < var3 + var2; ++var5) {
            var1[var5] = this.at[(this.au += -1864458299) * -1027766515 - 1];
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "vf.cd(" + ')');
      }
   }

   public int le() {
      this.au += -1298407601;
      int var1 = (this.at[-1027766515 * this.au - 3] & 255) + ((this.at[this.au * -1027766515 - 2] & 255) << 8) + ((this.at[-1027766515 * this.au - 1] & -648070214) << 16);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   public void kh(int var1) {
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 + 128);
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
   }

   public void dn(int var1, int var2) {
      try {
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 + 128);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.dn(" + ')');
      }
   }

   public void db(int[] var1, int var2) {
      try {
         int var3 = -1027766515 * this.au / 8;
         this.au = 0;

         for(int var4 = 0; var4 < var3; ++var4) {
            int var5 = this.cz(-1734056172);
            int var6 = this.cz(-1734056172);
            int var7 = 0;
            int var8 = -1640531527;

            for(int var9 = 32; var9-- > 0; var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var7 >>> 11 & 3] + var7) {
               if (var2 == 741006763) {
                  throw new IllegalStateException();
               }

               var5 += var6 + (var6 << 4 ^ var6 >>> 5) ^ var1[var7 & 3] + var7;
               var7 += var8;
            }

            this.au -= -2030764504;
            this.bv(var5, 1953116450);
            this.bv(var6, 592009040);
         }

      } catch (RuntimeException var10) {
         throw vk.ae(var10, "vf.db(" + ')');
      }
   }

   public int ka() {
      this.au += -1024962196;
      return ((this.at[-1027766515 * this.au - 2] & 1628731021) << 8) + (this.at[this.au * -1027766515 - 1] - -2088901179 & 255);
   }

   public boolean jv() {
      this.au -= 1132101396;
      byte[] var2 = this.at;
      int var3 = -1027766515 * this.au;
      int var4 = -1;

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         var4 = var4 >>> 8 ^ ar[(var4 ^ var2[var5]) & 255];
      }

      var4 = ~var4;
      var5 = this.cz(-1734056172);
      return var5 == var4;
   }

   public int lv() {
      this.au += -1298407601;
      return ((this.at[this.au * -833454560 - 1] & 255) << 8) + ((this.at[this.au * 979369776 - 3] & -777031213) << 16) + (this.at[-1027766515 * this.au - 2] & 255);
   }

   public int kt() {
      this.au += 566050698;
      return ((this.at[-1027766515 * this.au - 1] & 255) << 8) + (this.at[this.au * -1027766515 - 2] - 128 & 255);
   }

   public void ku(int var1) {
      this.at[(this.au += 981074431) * -1027766515 - 1] = (byte)var1;
      this.at[(this.au += -1864458299) * -881657651 - 1] = (byte)(var1 >> 8);
   }

   public void es(byte[] var1, int var2, int var3, int var4) {
      try {
         for(int var5 = var2; var5 < var3 + var2; ++var5) {
            if (var4 >= -2076192554) {
               throw new IllegalStateException();
            }

            var1[var5] = (byte)(this.at[(this.au += -1864458299) * -1027766515 - 1] - 128);
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "vf.es(" + ')');
      }
   }

   public int kz() {
      this.au += 566050698;
      int var1 = ((this.at[this.au * -1027766515 - 2] & 255) << 8) + (this.at[this.au * -1027766515 - 1] - 128 & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public int kl() {
      this.au += 566050698;
      int var1 = ((this.at[this.au * -1027766515 - 2] & 255) << 8) + (this.at[this.au * -1027766515 - 1] - 128 & 255);
      if (var1 > 32767) {
         var1 -= 65536;
      }

      return var1;
   }

   public int kv() {
      this.au += 566050698;
      int var1 = (this.at[this.au * 1599905538 - 2] - -1220971584 & -659163780) + ((this.at[this.au * -1027766515 - 1] & 255) << 8);
      if (var1 > 32767) {
         var1 -= 1113551856;
      }

      return var1;
   }

   public void ke(int var1) {
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 16);
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)var1;
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
   }

   public int kk() {
      this.au += 566050698;
      return ((this.at[-1027766515 * this.au - 1] & 255) << 8) + (this.at[this.au * -1027766515 - 2] - 128 & 255);
   }

   public void kw(int var1) {
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 16);
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)var1;
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
   }

   public void kq(int var1) {
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 16);
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)var1;
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
   }

   public int ky() {
      this.au += -516210626;
      return (this.at[-1027766515 * this.au - 3] & 255) + ((this.at[-1027766515 * this.au - 1] & 255) << 16) + ((this.at[-1037381747 * this.au - 2] & 255) << 8);
   }

   public int ld() {
      this.au += -1298407601;
      return (this.at[-1027766515 * this.au - 3] & 255) + ((this.at[-1027766515 * this.au - 1] & 255) << 16) + ((this.at[-1027766515 * this.au - 2] & 255) << 8);
   }

   public int lb() {
      this.au += -1298407601;
      return (this.at[-1175033931 * this.au - 3] & 255) + ((this.at[2074199480 * this.au - 1] & -325752490) << 16) + ((this.at[-1027766515 * this.au - 2] & 255) << 8);
   }

   public int da(byte var1) {
      try {
         return 0 - this.at[(this.au += -1864458299) * -1027766515 - 1] & 255;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.da(" + ')');
      }
   }

   public int ln() {
      this.au += 602275537;
      int var1 = (this.at[-1027766515 * this.au - 3] & 255) + ((this.at[this.au * 1565205144 - 2] & 255) << 8) + ((this.at[-1027766515 * this.au - 1] & 1435675515) << 16);
      if (var1 > 1034828089) {
         var1 -= 16777216;
      }

      return var1;
   }

   public int lz() {
      this.au += -1298407601;
      return ((this.at[this.au * -1027766515 - 1] & 255) << 8) + ((this.at[this.au * -1027766515 - 3] & 255) << 16) + (this.at[-1027766515 * this.au - 2] & 255);
   }

   public void lw(int var1) {
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 16);
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 24);
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)var1;
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
   }

   public int kf() {
      this.au += 566050698;
      return ((this.at[-1859745820 * this.au - 2] & -1434430443) << 8) + (this.at[this.au * -1027766515 - 1] - 128 & 255);
   }

   public void bo(int var1, int var2) {
      try {
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 16);
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)var1;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.bo(" + ')');
      }
   }

   public int la() {
      this.au += 282866917;
      int var1 = (this.at[-1027766515 * this.au - 3] & 906103844) + ((this.at[this.au * 974908364 - 2] & 255) << 8) + ((this.at[-1027766515 * this.au - 1] & 255) << 16);
      if (var1 > 1948576412) {
         var1 -= -306686197;
      }

      return var1;
   }

   public void du(int var1, int var2) {
      try {
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 + 128);
         this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.du(" + ')');
      }
   }

   public int lp() {
      this.au += -1298407601;
      int var1 = ((this.at[-1027766515 * this.au - 3] & 255) << 16) + ((this.at[this.au * -1027766515 - 1] & 255) << 8) + (this.at[-1027766515 * this.au - 2] & 255);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   public int lc() {
      this.au += -1298407601;
      int var1 = ((this.at[-1027766515 * this.au - 3] & 255) << 16) + ((this.at[this.au * -1027766515 - 1] & 255) << 8) + (this.at[-1027766515 * this.au - 2] & 255);
      if (var1 > 8388607) {
         var1 -= 16777216;
      }

      return var1;
   }

   public int ls() {
      this.au += 110797203;
      int var1 = ((this.at[-1027766515 * this.au - 3] & 1156249003) << 16) + ((this.at[this.au * -1027766515 - 1] & 2043000793) << 8) + (this.at[-1169018592 * this.au - 2] & 255);
      if (var1 > -1813664376) {
         var1 -= 1812140362;
      }

      return var1;
   }

   public int gh() {
      this.au += -1298407601;
      return (this.at[this.au * -1027766515 - 1] & 255) + ((this.at[this.au * -1027766515 - 3] & 255) << 16) + ((this.at[-1027766515 * this.au - 2] & 255) << 8);
   }

   public void fx(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException();
      } else {
         this.at[this.au * -1027766515 - var1 - 4] = (byte)(var1 >> 24);
         this.at[-1027766515 * this.au - var1 - 3] = (byte)(var1 >> 16);
         this.at[this.au * -1027766515 - var1 - 2] = (byte)(var1 >> 8);
         this.at[-1027766515 * this.au - var1 - 1] = (byte)var1;
      }
   }

   public void lm(int var1) {
      this.at[(this.au += -231677792) * -1027766515 - 1] = (byte)(var1 >> 8);
      this.at[(this.au += 2130699401) * -1027766515 - 1] = (byte)var1;
      this.at[(this.au += -1864458299) * 175935229 - 1] = (byte)(var1 >> 24);
      this.at[(this.au += -1864458299) * 422848713 - 1] = (byte)(var1 >> 16);
   }

   public int dt(int var1) {
      try {
         if (this.at[this.au * -1027766515] < 0) {
            if (var1 == 2048396591) {
               throw new IllegalStateException();
            } else {
               return this.cz(-1734056172) & Integer.MAX_VALUE;
            }
         } else {
            int var2 = this.ct(-1743204496);
            if (32767 == var2) {
               if (var1 == 2048396591) {
                  throw new IllegalStateException();
               } else {
                  return -1;
               }
            } else {
               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "vf.dt(" + ')');
      }
   }

   public void ly(int var1) {
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 16);
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 24);
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)var1;
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
   }

   public void lg(int var1) {
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 16);
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 24);
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)var1;
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 8);
   }

   public void fc(vf var1) {
      this.cu(var1.at, 0, var1.au * -1027766515, -1396630511);
   }

   public void lh(int var1) {
      this.at[(this.au += -1864458299) * -1027766515 - 1] = (byte)(var1 >> 16);
      this.at[(this.au += 614491210) * -1027766515 - 1] = (byte)(var1 >> 24);
      this.at[(this.au += -1418248978) * -1027766515 - 1] = (byte)var1;
      this.at[(this.au += 325864776) * -1027766515 - 1] = (byte)(var1 >> 8);
   }

   public int lo() {
      this.au += 1132101396;
      return (this.at[-1027766515 * this.au - 4] & 255) + ((this.at[-1027766515 * this.au - 1] & 255) << 24) + ((this.at[-1027766515 * this.au - 2] & 255) << 16) + ((this.at[this.au * -1027766515 - 3] & 255) << 8);
   }

   public int li() {
      this.au += 1132101396;
      return (this.at[-1027766515 * this.au - 4] & 255) + ((this.at[-1027766515 * this.au - 1] & 255) << 24) + ((this.at[-1027766515 * this.au - 2] & 255) << 16) + ((this.at[this.au * -1027766515 - 3] & 255) << 8);
   }

   public int lt() {
      this.au += 1132101396;
      return (this.at[-1027766515 * this.au - 3] & 255) + ((this.at[-1027766515 * this.au - 1] & 255) << 16) + ((this.at[this.au * -1027766515 - 2] & 255) << 24) + ((this.at[this.au * -1027766515 - 4] & 255) << 8);
   }

   public int lj() {
      this.au += 1132101396;
      return (this.at[-1027766515 * this.au - 2] & 255) + ((this.at[this.au * -1027766515 - 3] & 255) << 24) + ((this.at[this.au * -1027766515 - 4] & 255) << 16) + ((this.at[this.au * -1027766515 - 1] & 255) << 8);
   }

   public int lk() {
      this.au += 1132101396;
      return (this.at[-1027766515 * this.au - 2] & 255) + ((this.at[this.au * -1027766515 - 3] & 255) << 24) + ((this.at[this.au * -1027766515 - 4] & 255) << 16) + ((this.at[this.au * -1027766515 - 1] & 255) << 8);
   }

   public void mu(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         var1[var4] = (byte)(this.at[(this.au += -1864458299) * -1027766515 - 1] - 128);
      }

   }

   public void mo(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         var1[var4] = (byte)(this.at[(this.au += -1864458299) * -1027766515 - 1] - 128);
      }

   }

   public void mh(byte[] var1, int var2, int var3) {
      for(int var4 = var2; var4 < var3 + var2; ++var4) {
         var1[var4] = (byte)(this.at[(this.au += -1864458299) * -1027766515 - 1] - 128);
      }

   }

   public int ep(int var1) {
      try {
         this.au += -1298407601;
         return (this.at[-1027766515 * this.au - 3] & 255) + ((this.at[-1027766515 * this.au - 1] & 255) << 16) + ((this.at[-1027766515 * this.au - 2] & 255) << 8);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "vf.ep(" + ')');
      }
   }

   public void ml(byte[] var1, int var2, int var3) {
      for(int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
         var1[var4] = (byte)(this.at[(this.au += -1864458299) * -1027766515 - 1] - 128);
      }

   }

   public void mc(byte[] var1, int var2, int var3) {
      for(int var4 = var3 + var2 - 1; var4 >= var2; --var4) {
         var1[var4] = (byte)(this.at[(this.au += 1595578480) * -1027766515 - 1] - 128);
      }

   }
}
