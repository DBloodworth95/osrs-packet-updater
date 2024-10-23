import java.util.ArrayList;

public final class df extends ju {
   int bd;
   int ae;
   int ag;
   int am;
   int ax;
   int aq;
   int at;
   double as;
   int au;
   public static final int bs = 65536;
   int al;
   int af;
   int ah;
   boolean az;
   int ab;
   int ac;
   double aa;
   double ai;
   double ao;
   int ad;
   double ay;
   double aj;
   double av;
   double aw;
   int an;
   int bh;
   if bn;
   int ar;
   int ap;
   int ak;
   public static final int cb = 96;

   df(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      try {
         this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
         this.ap = -994443845 * var10;
      } catch (RuntimeException var13) {
         throw vk.ae(var13, "df.<init>(" + ')');
      }
   }

   df(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      try {
         super();
         this.az = false;
         this.bh = 0;
         this.bd = 0;
         this.ac = var1 * -883876159;
         this.ae = -786194185 * var2;
         this.ag = var3 * -1001584335;
         this.am = 1339976845 * var4;
         this.ax = 894065889 * var5;
         this.ar = 631181811 * var6;
         this.al = var7 * -204624825;
         this.ad = 2132596017 * var8;
         this.ah = 1703485953 * var9;
         this.ab = -824362243 * var10;
         this.aq = 2077121473 * var11;
         this.az = false;
         int var12 = he.ae(this.ac * -1697353407, (byte)-41).af * -617652759;
         if (-1 != var12) {
            this.bn = ds.ae(var12, -683358200);
         } else {
            this.bn = null;
         }

      } catch (RuntimeException var13) {
         throw vk.ae(var13, "df.<init>(" + ')');
      }
   }

   final void ac(int var1, int var2, int var3, int var4, int var5) {
      try {
         this.af = var1 * -42153919;
         this.at = var2 * 382063495;
         this.au = -197353247 * var3;
         double var6;
         if (!this.az) {
            var6 = (double)(this.af * -928823359 - this.ag * 1816375249);
            double var8 = (double)(this.at * 1485013559 - this.am * -1971112379);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.aa = (double)(this.ag * 1816375249) + (double)(2063261185 * this.ah) * var6 / var10;
            this.ai = var8 * (double)(this.ah * 2063261185) / var10 + (double)(this.am * -1971112379);
            this.ao = (double)(this.ax * -671357151);
         }

         var6 = (double)(this.al * -1343734409 + 1 - var4);
         this.as = ((double)(this.af * -928823359) - this.aa) / var6;
         this.ay = ((double)(this.at * 1485013559) - this.ai) / var6;
         this.aj = Math.sqrt(this.ay * this.ay + this.as * this.as);
         if (!this.az) {
            if (var5 <= -685622465) {
               throw new IllegalStateException();
            }

            this.av = -this.aj * Math.tan((double)(306471889 * this.ad) * 0.02454369D);
         }

         this.aw = ((double)(this.au * 1640014625) - this.ao - this.av * var6) * 2.0D / (var6 * var6);
      } catch (RuntimeException var12) {
         throw vk.ae(var12, "df.ac(" + ')');
      }
   }

   protected final jm ah() {
      hu var1 = he.ae(this.ac * -1697353407, (byte)45);
      jm var2 = var1.ax(1339653213 * this.bh, 959627427);
      if (null == var2) {
         return null;
      } else {
         var2.bh(this.ak * -1408010841);
         return var2;
      }
   }

   protected final jm ad(byte var1) {
      try {
         hu var2 = he.ae(this.ac * -1697353407, (byte)59);
         jm var3 = var2.ax(1339653213 * this.bh, -1552725923);
         if (null == var3) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            var3.bh(this.ak * -1408010841);
            return var3;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "df.ad(" + ')');
      }
   }

   final void ae(int var1, byte var2) {
      try {
         this.az = true;
         this.aa += (double)var1 * this.as;
         this.ai += (double)var1 * this.ay;
         this.ao += (double)var1 * this.aw * 0.5D * (double)var1 + this.av * (double)var1;
         this.av += this.aw * (double)var1;
         this.an = ((int)(Math.atan2(this.as, this.ay) * 325.949D) + 1024 & 2047) * 43294659;
         this.ak = ((int)(Math.atan2(this.av, this.aj) * 325.949D) & 2047) * -1293557225;
         if (this.bn != null) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }

            if (!this.bn.ad(-1710803939)) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               this.bd += 1552374259 * var1;

               while(true) {
                  do {
                     do {
                        if (-271784133 * this.bd <= this.bn.aa[this.bh * 1339653213]) {
                           return;
                        }

                        if (var2 == 0) {
                           throw new IllegalStateException();
                        }

                        this.bd -= this.bn.aa[1339653213 * this.bh] * 1552374259;
                        this.bh += 1970550773;
                     } while(1339653213 * this.bh < this.bn.ab.length);

                     if (var2 == 0) {
                        throw new IllegalStateException();
                     }

                     this.bh -= -816685761 * this.bn.ao;
                     if (1339653213 * this.bh < 0) {
                        break;
                     }

                     if (var2 == 0) {
                        throw new IllegalStateException();
                     }
                  } while(this.bh * 1339653213 < this.bn.ab.length);

                  this.bh = 0;
               }
            } else {
               this.bh += 1970550773 * var1;
               int var3 = this.bn.ah(147374633);
               if (this.bh * 1339653213 >= var3) {
                  this.bh = 1970550773 * (var3 - -1317182493 * this.bn.ao);
               }
            }
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "df.ae(" + ')');
      }
   }

   protected final jm ap() {
      hu var1 = he.ae(this.ac * -623329762, (byte)20);
      jm var2 = var1.ax(1339653213 * this.bh, 481349890);
      if (null == var2) {
         return null;
      } else {
         var2.bh(this.ak * -817881827);
         return var2;
      }
   }

   protected final jm ab() {
      hu var1 = he.ae(this.ac * -1498326611, (byte)84);
      jm var2 = var1.ax(1339653213 * this.bh, 1982236312);
      if (null == var2) {
         return null;
      } else {
         var2.bh(this.ak * -1408010841);
         return var2;
      }
   }

   final void ag(int var1, int var2, int var3, int var4) {
      this.af = var1 * 1676040565;
      this.at = var2 * 382063495;
      this.au = -197353247 * var3;
      double var5;
      if (!this.az) {
         var5 = (double)(this.af * -928823359 - this.ag * -871534943);
         double var7 = (double)(this.at * 1989085986 - this.am * 1496941037);
         double var9 = Math.sqrt(var5 * var5 + var7 * var7);
         this.aa = (double)(this.ag * -700157002) + (double)(-1065485518 * this.ah) * var5 / var9;
         this.ai = var7 * (double)(this.ah * 2063261185) / var9 + (double)(this.am * -1971112379);
         this.ao = (double)(this.ax * -671357151);
      }

      var5 = (double)(this.al * -1343734409 + 1 - var4);
      this.as = ((double)(this.af * -2038128217) - this.aa) / var5;
      this.ay = ((double)(this.at * 1464658460) - this.ai) / var5;
      this.aj = Math.sqrt(this.ay * this.ay + this.as * this.as);
      if (!this.az) {
         this.av = -this.aj * Math.tan((double)(-423295848 * this.ad) * 0.02454369D);
      }

      this.aw = ((double)(this.au * 1640014625) - this.ao - this.av * var5) * 2.0D / (var5 * var5);
   }

   final void am(int var1, int var2, int var3, int var4) {
      this.af = var1 * -42153919;
      this.at = var2 * 382063495;
      this.au = -197353247 * var3;
      double var5;
      if (!this.az) {
         var5 = (double)(this.af * -928823359 - this.ag * 1816375249);
         double var7 = (double)(this.at * 1485013559 - this.am * -1971112379);
         double var9 = Math.sqrt(var5 * var5 + var7 * var7);
         this.aa = (double)(this.ag * 1816375249) + (double)(2063261185 * this.ah) * var5 / var9;
         this.ai = var7 * (double)(this.ah * 2063261185) / var9 + (double)(this.am * -1971112379);
         this.ao = (double)(this.ax * -671357151);
      }

      var5 = (double)(this.al * -1343734409 + 1 - var4);
      this.as = ((double)(this.af * -928823359) - this.aa) / var5;
      this.ay = ((double)(this.at * 1485013559) - this.ai) / var5;
      this.aj = Math.sqrt(this.ay * this.ay + this.as * this.as);
      if (!this.az) {
         this.av = -this.aj * Math.tan((double)(306471889 * this.ad) * 0.02454369D);
      }

      this.aw = ((double)(this.au * 1640014625) - this.ao - this.av * var5) * 2.0D / (var5 * var5);
   }

   final void ax(int var1) {
      this.az = true;
      this.aa += (double)var1 * this.as;
      this.ai += (double)var1 * this.ay;
      this.ao += (double)var1 * this.aw * 0.5D * (double)var1 + this.av * (double)var1;
      this.av += this.aw * (double)var1;
      this.an = ((int)(Math.atan2(this.as, this.ay) * 325.949D) + 1024 & 2047) * 43294659;
      this.ak = ((int)(Math.atan2(this.av, this.aj) * 325.949D) & 2047) * -1293557225;
      if (this.bn != null) {
         if (!this.bn.ad(-2093226802)) {
            this.bd += 1552374259 * var1;

            while(true) {
               do {
                  do {
                     if (-271784133 * this.bd <= this.bn.aa[this.bh * 1339653213]) {
                        return;
                     }

                     this.bd -= this.bn.aa[1339653213 * this.bh] * 1552374259;
                     this.bh += 1970550773;
                  } while(1339653213 * this.bh < this.bn.ab.length);

                  this.bh -= -816685761 * this.bn.ao;
               } while(1339653213 * this.bh >= 0 && this.bh * 1339653213 < this.bn.ab.length);

               this.bh = 0;
            }
         } else {
            this.bh += 1970550773 * var1;
            int var2 = this.bn.ah(-2092071425);
            if (this.bh * 1339653213 >= var2) {
               this.bh = 1970550773 * (var2 - -1317182493 * this.bn.ao);
            }
         }
      }

   }

   final void aq(int var1) {
      this.az = true;
      this.aa += (double)var1 * this.as;
      this.ai += (double)var1 * this.ay;
      this.ao += (double)var1 * this.aw * 0.5D * (double)var1 + this.av * (double)var1;
      this.av += this.aw * (double)var1;
      this.an = ((int)(Math.atan2(this.as, this.ay) * 325.949D) + 1024 & 2047) * 43294659;
      this.ak = ((int)(Math.atan2(this.av, this.aj) * 325.949D) & 2047) * -1293557225;
      if (this.bn != null) {
         if (!this.bn.ad(-1437066741)) {
            this.bd += 1552374259 * var1;

            while(true) {
               do {
                  do {
                     if (-271784133 * this.bd <= this.bn.aa[this.bh * 1339653213]) {
                        return;
                     }

                     this.bd -= this.bn.aa[1339653213 * this.bh] * 1552374259;
                     this.bh += 1970550773;
                  } while(1339653213 * this.bh < this.bn.ab.length);

                  this.bh -= -816685761 * this.bn.ao;
               } while(1339653213 * this.bh >= 0 && this.bh * 1339653213 < this.bn.ab.length);

               this.bh = 0;
            }
         } else {
            this.bh += 1970550773 * var1;
            int var2 = this.bn.ah(86239211);
            if (this.bh * 1339653213 >= var2) {
               this.bh = 1970550773 * (var2 - -1317182493 * this.bn.ao);
            }
         }
      }

   }

   static void iv(int var0, int var1, byte var2) {
      try {
         if (re.vt.ao(-2021007607) != 0) {
            if (var2 == 6) {
               throw new IllegalStateException();
            }

            if (-1 != var0) {
               if (var2 == 6) {
                  throw new IllegalStateException();
               }

               ArrayList var3 = new ArrayList();
               var3.add(new ns(nc.fr, var0, 0, re.vt.ao(-2104790979), false));
               gg.am(var3, 0, 0, 0, 0, true, (byte)95);
               client.tm = true;
            }
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "df.iv(" + ')');
      }
   }

   static void my(ny var0, int var1, int var2, boolean var3, byte var4) {
      try {
         int var5 = var0.bu * -1339552805;
         int var6 = var0.br * 1036386215;
         if (0 == var0.bj * 1444043925) {
            if (var4 != 3) {
               throw new IllegalStateException();
            }

            var0.bu = var0.bi * 1620526469;
         } else if (1 == var0.bj * 1444043925) {
            if (var4 != 3) {
               throw new IllegalStateException();
            }

            var0.bu = 1629026387 * (var1 - var0.bi * 1848455111);
         } else if (2 == 1444043925 * var0.bj) {
            var0.bu = 1629026387 * (1848455111 * var0.bi * var1 >> 14);
         }

         if (var0.bp * -616720447 == 0) {
            if (var4 != 3) {
               throw new IllegalStateException();
            }

            var0.br = var0.bg * 1434778079;
         } else if (-616720447 * var0.bp == 1) {
            if (var4 != 3) {
               throw new IllegalStateException();
            }

            var0.br = -6637545 * (var2 - var0.bg * -1438703239);
         } else if (2 == var0.bp * -616720447) {
            var0.br = -6637545 * (var2 * -1438703239 * var0.bg >> 14);
         }

         if (var0.bj * 1444043925 == 4) {
            if (var4 != 3) {
               throw new IllegalStateException();
            }

            var0.bu = var0.bo * 1118128065 * var0.br * 1036386215 / (var0.bv * 94521325) * 1629026387;
         }

         if (4 == var0.bp * -616720447) {
            if (var4 != 3) {
               throw new IllegalStateException();
            }

            var0.br = -6637545 * (-1339552805 * var0.bu * 94521325 * var0.bv / (var0.bo * 1118128065));
         }

         if (1337 == var0.bs * 571012371) {
            if (var4 != 3) {
               return;
            }

            client.pb = var0;
         }

         if (-1256894539 * var0.bf == 12) {
            if (var4 != 3) {
               return;
            }

            var0.bp(1041179081).af(-1339552805 * var0.bu, 1036386215 * var0.br, (byte)48);
         }

         if (var3) {
            if (var4 != 3) {
               throw new IllegalStateException();
            }

            if (var0.gd != null) {
               if (var4 != 3) {
                  throw new IllegalStateException();
               }

               if (var5 != -1339552805 * var0.bu || var6 != 1036386215 * var0.br) {
                  do var7 = new do();
                  var7.ag = var0;
                  var7.ac = var0.gd;
                  client.qw.ae(var7);
               }
            }
         }

      } catch (RuntimeException var8) {
         throw vk.ae(var8, "df.my(" + ')');
      }
   }
}
