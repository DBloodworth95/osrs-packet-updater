public final class dd extends jv {
   static int lk;
   int aw;
   int ak;
   int aj;
   int ai;
   int ay;
   int as;
   int ae;
   int am;
   double az;
   double ac;
   double al;
   int ao;
   int af;
   int ar;
   iu bh;
   double av;
   double ag;
   double ad;
   boolean ab;
   int an;
   double ax;
   double aq;
   int aa;
   int at;
   int ah;
   int au;
   int bj;
   int ap;
   static client bl;
   int bv;

   final void ak(int var1, int var2, int var3, int var4) {
      this.as = var1 * -1351657911;
      this.ae = 1857689961 * var2;
      this.am = 1446678692 * var3;
      double var5;
      if (!this.ab) {
         var5 = (double)(this.as * -1493153007 - this.ak * -38969467);
         double var7 = (double)(-1817068095 * this.ae - 1274637855 * this.aj);
         double var9 = Math.sqrt(var7 * var7 + var5 * var5);
         this.az = (double)(this.ak * 636722271) + (double)(327814629 * this.ao) * var5 / var9;
         this.ag = (double)(-861562017 * this.aj) + var7 * (double)(327814629 * this.ao) / var9;
         this.ad = (double)(461313794 * this.ai);
      }

      var5 = (double)(this.au * -1102312395 + 1 - var4);
      this.ac = ((double)(1224680215 * this.as) - this.az) / var5;
      this.av = ((double)(this.ae * -536951462) - this.ag) / var5;
      this.ax = Math.sqrt(this.av * this.av + this.ac * this.ac);
      if (!this.ab) {
         this.aq = -this.ax * Math.tan(0.02454369D * (double)(-1879788943 * this.an));
      }

      this.al = ((double)(this.am * 417805808) - this.ad - var5 * this.aq) * 2.0D / (var5 * var5);
   }

   dd(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      try {
         this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12);
         this.af = 602774377 * var10;
      } catch (RuntimeException var13) {
         throw tm.aw(var13, "dd.<init>(" + ')');
      }
   }

   final void ap(int var1, int var2, int var3, int var4, int var5) {
      try {
         this.as = var1 * -551418383;
         this.ae = 1857689961 * var2;
         this.am = -1212059207 * var3;
         double var6;
         if (!this.ab) {
            if (var5 == 1379901813) {
               throw new IllegalStateException();
            }

            var6 = (double)(this.as * -1493153007 - this.ak * -925787213);
            double var8 = (double)(761792217 * this.ae - -778995635 * this.aj);
            double var10 = Math.sqrt(var8 * var8 + var6 * var6);
            this.az = (double)(this.ak * -925787213) + (double)(327814629 * this.ao) * var6 / var10;
            this.ag = (double)(-778995635 * this.aj) + var8 * (double)(327814629 * this.ao) / var10;
            this.ad = (double)(839071003 * this.ai);
         }

         var6 = (double)(this.au * -1102312395 + 1 - var4);
         this.ac = ((double)(-1493153007 * this.as) - this.az) / var6;
         this.av = ((double)(this.ae * 761792217) - this.ag) / var6;
         this.ax = Math.sqrt(this.av * this.av + this.ac * this.ac);
         if (!this.ab) {
            if (var5 == 1379901813) {
               throw new IllegalStateException();
            }

            this.aq = -this.ax * Math.tan(0.02454369D * (double)(-1879788943 * this.an));
         }

         this.al = ((double)(this.am * 2012038281) - this.ad - var6 * this.aq) * 2.0D / (var6 * var6);
      } catch (RuntimeException var12) {
         throw tm.aw(var12, "dd.ap(" + ')');
      }
   }

   final void ae(int var1) {
      this.ab = true;
      this.az += this.ac * (double)var1;
      this.ag += this.av * (double)var1;
      this.ad += this.aq * (double)var1 + this.al * 0.5D * (double)var1 * (double)var1;
      this.aq += (double)var1 * this.al;
      this.aa = ((int)(Math.atan2(this.ac, this.av) * 325.949D) + -1236877594 & 2075633982) * -363285945;
      this.ah = ((int)(Math.atan2(this.aq, this.ax) * 325.949D) & 2047) * -872474025;
      if (null != this.bh) {
         if (!this.bh.au((byte)94)) {
            this.bv += var1 * 1682677933;

            while(true) {
               do {
                  do {
                     if (this.bv * -1138310363 <= this.bh.az[this.bj * -882070064]) {
                        return;
                     }

                     this.bv -= this.bh.az[1367552883 * this.bj] * 1682677933;
                     this.bj += 56895931;
                  } while(1367552883 * this.bj < this.bh.ar.length);

                  this.bj -= this.bh.ag * -141147522;
               } while(this.bj * 1367552883 >= 0 && this.bj * -948515358 < this.bh.ar.length);

               this.bj = 0;
            }
         } else {
            this.bj += var1 * 56895931;
            int var2 = this.bh.an((byte)112);
            if (1367552883 * this.bj >= var2) {
               this.bj = (var2 - 775058351 * this.bh.ag) * 61098996;
            }
         }
      }

   }

   protected final jy au(int var1) {
      try {
         hj var2 = nl.ap(1334017385 * this.ap, -1528800221);
         jy var3 = var2.aj(this.bj * 1367552883, 2077891985);
         if (var3 == null) {
            if (var1 != 1885718735) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            var3.bh(-559648409 * this.ah);
            return var3;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "dd.au(" + ')');
      }
   }

   protected final jy an() {
      hj var1 = nl.ap(1334017385 * this.ap, -1023855330);
      jy var2 = var1.aj(this.bj * 1367552883, 1840788550);
      if (var2 == null) {
         return null;
      } else {
         var2.bh(-559648409 * this.ah);
         return var2;
      }
   }

   protected final jy ao() {
      hj var1 = nl.ap(1334017385 * this.ap, -1666657292);
      jy var2 = var1.aj(this.bj * 1367552883, -748570629);
      if (var2 == null) {
         return null;
      } else {
         var2.bh(-559648409 * this.ah);
         return var2;
      }
   }

   final void ay(int var1) {
      this.ab = true;
      this.az += this.ac * (double)var1;
      this.ag += this.av * (double)var1;
      this.ad += this.aq * (double)var1 + this.al * 0.5D * (double)var1 * (double)var1;
      this.aq += (double)var1 * this.al;
      this.aa = ((int)(Math.atan2(this.ac, this.av) * 325.949D) + 1024 & 2047) * 1944414971;
      this.ah = ((int)(Math.atan2(this.aq, this.ax) * 325.949D) & 2047) * -872474025;
      if (null != this.bh) {
         if (!this.bh.au((byte)103)) {
            this.bv += var1 * 1682677933;

            while(true) {
               do {
                  do {
                     if (this.bv * -1138310363 <= this.bh.az[this.bj * 1367552883]) {
                        return;
                     }

                     this.bv -= this.bh.az[1367552883 * this.bj] * 1682677933;
                     this.bj += 56895931;
                  } while(1367552883 * this.bj < this.bh.ar.length);

                  this.bj -= this.bh.ag * -966798307;
               } while(this.bj * 1367552883 >= 0 && this.bj * 1367552883 < this.bh.ar.length);

               this.bj = 0;
            }
         } else {
            this.bj += var1 * 56895931;
            int var2 = this.bh.an((byte)32);
            if (1367552883 * this.bj >= var2) {
               this.bj = (var2 - -333115385 * this.bh.ag) * 56895931;
            }
         }
      }

   }

   dd(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      try {
         super();
         this.ab = false;
         this.bj = 0;
         this.bv = 0;
         this.ap = var1 * -1078664487;
         this.aw = var2 * 1938423111;
         this.ak = -1656714373 * var3;
         this.aj = -1822523259 * var4;
         this.ai = 892149011 * var5;
         this.at = 740282227 * var6;
         this.au = -1809848803 * var7;
         this.an = 1137757841 * var8;
         this.ao = var9 * -1651349523;
         this.ar = 1657498705 * var10;
         this.ay = var11 * 1728199483;
         this.ab = false;
         int var12 = nl.ap(1334017385 * this.ap, -652637005).as * -347425453;
         if (-1 != var12) {
            this.bh = ng.ap(var12, (short)-24884);
         } else {
            this.bh = null;
         }

      } catch (RuntimeException var13) {
         throw tm.aw(var13, "dd.<init>(" + ')');
      }
   }

   final void aw(int var1, byte var2) {
      try {
         this.ab = true;
         this.az += this.ac * (double)var1;
         this.ag += this.av * (double)var1;
         this.ad += this.aq * (double)var1 + this.al * 0.5D * (double)var1 * (double)var1;
         this.aq += (double)var1 * this.al;
         this.aa = ((int)(Math.atan2(this.ac, this.av) * 325.949D) + 1024 & 2047) * 1944414971;
         this.ah = ((int)(Math.atan2(this.aq, this.ax) * 325.949D) & 2047) * -872474025;
         if (null != this.bh) {
            if (!this.bh.au((byte)95)) {
               if (var2 <= 24) {
                  throw new IllegalStateException();
               }

               this.bv += var1 * 1682677933;

               while(true) {
                  while(true) {
                     do {
                        if (this.bv * -1138310363 <= this.bh.az[this.bj * 1367552883]) {
                           return;
                        }

                        if (var2 <= 24) {
                           throw new IllegalStateException();
                        }

                        this.bv -= this.bh.az[1367552883 * this.bj] * 1682677933;
                        this.bj += 56895931;
                     } while(1367552883 * this.bj < this.bh.ar.length);

                     if (var2 <= 24) {
                        throw new IllegalStateException();
                     }

                     this.bj -= this.bh.ag * -966798307;
                     if (this.bj * 1367552883 < 0) {
                        break;
                     }

                     if (var2 <= 24) {
                        throw new IllegalStateException();
                     }

                     if (this.bj * 1367552883 >= this.bh.ar.length) {
                        if (var2 <= 24) {
                           throw new IllegalStateException();
                        }
                        break;
                     }
                  }

                  this.bj = 0;
               }
            } else {
               this.bj += var1 * 56895931;
               int var3 = this.bh.an((byte)72);
               if (1367552883 * this.bj >= var3) {
                  if (var2 <= 24) {
                     return;
                  }

                  this.bj = (var3 - -333115385 * this.bh.ag) * 56895931;
               }
            }
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "dd.aw(" + ')');
      }
   }

   final void aj(int var1, int var2, int var3, int var4) {
      this.as = var1 * -551418383;
      this.ae = 1706906223 * var2;
      this.am = -1212059207 * var3;
      double var5;
      if (!this.ab) {
         var5 = (double)(this.as * -1166152671 - this.ak * -925787213);
         double var7 = (double)(761792217 * this.ae - -778995635 * this.aj);
         double var9 = Math.sqrt(var7 * var7 + var5 * var5);
         this.az = (double)(this.ak * -1768036046) + (double)(2124892660 * this.ao) * var5 / var9;
         this.ag = (double)(-778995635 * this.aj) + var7 * (double)(-807717403 * this.ao) / var9;
         this.ad = (double)(-197885522 * this.ai);
      }

      var5 = (double)(this.au * 969804331 + 1 - var4);
      this.ac = ((double)(-1493153007 * this.as) - this.az) / var5;
      this.av = ((double)(this.ae * 761792217) - this.ag) / var5;
      this.ax = Math.sqrt(this.av * this.av + this.ac * this.ac);
      if (!this.ab) {
         this.aq = -this.ax * Math.tan(0.02454369D * (double)(-1941286828 * this.an));
      }

      this.al = ((double)(this.am * 2012038281) - this.ad - var5 * this.aq) * 2.0D / (var5 * var5);
   }

   final void as(int var1) {
      this.ab = true;
      this.az += this.ac * (double)var1;
      this.ag += this.av * (double)var1;
      this.ad += this.aq * (double)var1 + this.al * 0.5D * (double)var1 * (double)var1;
      this.aq += (double)var1 * this.al;
      this.aa = ((int)(Math.atan2(this.ac, this.av) * 325.949D) + 1024 & 1912973870) * -449101203;
      this.ah = ((int)(Math.atan2(this.aq, this.ax) * 325.949D) & 2047) * -872474025;
      if (null != this.bh) {
         if (!this.bh.au((byte)55)) {
            this.bv += var1 * -1898377417;

            while(true) {
               do {
                  do {
                     if (this.bv * 186186799 <= this.bh.az[this.bj * -811194814]) {
                        return;
                     }

                     this.bv -= this.bh.az[1546700321 * this.bj] * 2125328157;
                     this.bj += 56895931;
                  } while(1647806192 * this.bj < this.bh.ar.length);

                  this.bj -= this.bh.ag * -966798307;
               } while(this.bj * -797679194 >= 0 && this.bj * -2122123089 < this.bh.ar.length);

               this.bj = 0;
            }
         } else {
            this.bj += var1 * -2114677511;
            int var2 = this.bh.an((byte)26);
            if (1367552883 * this.bj >= var2) {
               this.bj = (var2 - 276147008 * this.bh.ag) * 56895931;
            }
         }
      }

   }

   final void ai(int var1, int var2, int var3, int var4) {
      this.as = var1 * -551418383;
      this.ae = 1857689961 * var2;
      this.am = -1212059207 * var3;
      double var5;
      if (!this.ab) {
         var5 = (double)(this.as * -1493153007 - this.ak * -925787213);
         double var7 = (double)(761792217 * this.ae - -778995635 * this.aj);
         double var9 = Math.sqrt(var7 * var7 + var5 * var5);
         this.az = (double)(this.ak * -925787213) + (double)(327814629 * this.ao) * var5 / var9;
         this.ag = (double)(-778995635 * this.aj) + var7 * (double)(327814629 * this.ao) / var9;
         this.ad = (double)(839071003 * this.ai);
      }

      var5 = (double)(this.au * -1102312395 + 1 - var4);
      this.ac = ((double)(-1493153007 * this.as) - this.az) / var5;
      this.av = ((double)(this.ae * 761792217) - this.ag) / var5;
      this.ax = Math.sqrt(this.av * this.av + this.ac * this.ac);
      if (!this.ab) {
         this.aq = -this.ax * Math.tan(0.02454369D * (double)(-1879788943 * this.an));
      }

      this.al = ((double)(this.am * 2012038281) - this.ad - var5 * this.aq) * 2.0D / (var5 * var5);
   }

   public static int ap(int var0, byte var1) {
      try {
         hg var3 = (hg)hg.aw.ap((long)var0);
         hg var2;
         if (null != var3) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            }

            var2 = var3;
         } else {
            byte[] var4 = hg.ap.bm(14, var0, 2065282355);
            var3 = new hg();
            if (null != var4) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               var3.aw(new vl(var4), -879152973);
            }

            hg.aw.ak(var3, (long)var0);
            var2 = var3;
         }

         int var9 = 201276445 * var2.ak;
         int var5 = 346325327 * var2.aj;
         int var6 = -1432610793 * var2.ai;
         int var7 = nb.ap[var6 - var5];
         return nb.aj[var9] >> var5 & var7;
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "dd.ap(" + ')');
      }
   }
}
