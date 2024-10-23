import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class mn extends bg {
   int ak;
   ud ap;
   static final int ao = 1;
   int[] aj;
   int[] ai;
   int[] ay;
   int[] as;
   int bx;
   static AtomicBoolean by = null;
   public int bn;
   int[] au;
   int[] al;
   int[] aa;
   static final int af = 2;
   int[] ac;
   int[] av;
   int[] ax;
   int[] aq;
   long bq;
   int[] an;
   nx[][] ah;
   nx[][] bh;
   mc bj;
   boolean bv;
   int[] am;
   int bk;
   long bb;
   int[] at;
   nt bp;
   int aw;
   PriorityQueue bc;
   bm bz;
   static ThreadPoolExecutor br = null;
   int[] ae;
   static final int ue = 5;

   protected void bz(int var1) {
      if (this.bj.ak()) {
         int var2 = this.bj.aw * 1106659065 * this.ak / (du.ai * -336955471);

         do {
            long var3 = -6156239428887658301L * this.bb + (long)var2 * (long)var1;
            if (this.bq * 3261477869149819139L - var3 >= 0L) {
               this.bb = 4193716940502921195L * var3;
               break;
            }

            int var5 = (int)((this.bq * 3261477869149819139L - this.bb * -6156239428887658301L + (long)var2 - 1L) / (long)var2);
            this.bb += (long)var2 * (long)var5 * 4193716940502921195L;
            this.bp.au(var5);
            var1 -= var5;
            this.ba((byte)-41);
         } while(this.bj.ak());
      }

      this.bp.au(var1);
   }

   void dm(int var1, int var2, int var3) {
   }

   public int aw(int var1) {
      try {
         return 83352073 * this.aw;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "mn.aw(" + ')');
      }
   }

   public boolean ak(nv var1, pe var2, ba var3, int var4) {
      try {
         synchronized(this.bz) {
            boolean var6 = true;
            synchronized(this.bc) {
               this.bc.clear();
            }

            for(ni var7 = (ni)var1.ap.aj(); null != var7; var7 = (ni)var1.ap.ai()) {
               if (var4 <= -1571468601) {
                  throw new IllegalStateException();
               }

               int var8 = (int)var7.ht;
               np var9 = (np)this.ap.ap((long)var8);
               if (var9 == null) {
                  if (var4 <= -1571468601) {
                     throw new IllegalStateException();
                  }

                  var9 = kt.ap(var2, var8, 1623881027);
                  if (var9 == null) {
                     var6 = false;
                     continue;
                  }

                  this.ap.ak(var9, (long)var8);
               }

               if (!var9.aw(var3, var7.aw, (short)-2912)) {
                  if (var4 <= -1571468601) {
                     throw new IllegalStateException();
                  }

                  var6 = false;
               } else if (null != this.bc) {
                  if (var4 <= -1571468601) {
                     throw new IllegalStateException();
                  }

                  synchronized(this.bc) {
                     Iterator var11 = var9.am.iterator();

                     while(var11.hasNext()) {
                        if (var4 <= -1571468601) {
                           throw new IllegalStateException();
                        }

                        cb var12 = (cb)var11.next();
                        this.bc.add(new mx(1074084921 * var7.ap, var12));
                     }
                  }
               }
            }

            return var6;
         }
      } catch (RuntimeException var18) {
         throw tm.aw(var18, "mn.ak(" + ')');
      }
   }

   public void aj(byte var1) {
      try {
         if (null == this.bc) {
            if (var1 > 14) {
               ;
            }
         } else {
            if (by != null) {
               by.set(true);
            }

            by = new AtomicBoolean(false);
            AtomicBoolean var2 = by;
            if (null == br) {
               if (var1 <= 14) {
                  throw new IllegalStateException();
               }

               int var3 = Runtime.getRuntime().availableProcessors();
               br = new ThreadPoolExecutor(0, var3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new mk(this));
            }

            br.submit(new nf(this, var2));
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "mn.aj(" + ')');
      }
   }

   public void ai(byte var1) {
      try {
         synchronized(this.bz) {
            for(np var3 = (np)this.ap.aj(); null != var3; var3 = (np)this.ap.ai()) {
               if (var1 != 1) {
                  return;
               }

               var3.ak(-670942562);
            }

         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "mn.ai(" + ')');
      }
   }

   public void at(int var1) {
      try {
         synchronized(this.bz) {
            for(np var3 = (np)this.ap.aj(); var3 != null; var3 = (np)this.ap.ai()) {
               if (var1 <= 1376308389) {
                  throw new IllegalStateException();
               }

               var3.kf();
            }

         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "mn.at(" + ')');
      }
   }

   public void an(nv var1, boolean var2, int var3) {
      try {
         synchronized(this.bz) {
            this.ao(-673246971);
            this.bj.ap(var1.aw);
            this.bv = var2;
            this.bb = 0L;
            int var5 = this.bj.aj();

            for(int var6 = 0; var6 < var5; ++var6) {
               this.bj.ai(var6);
               this.bj.ae(var6);
               this.bj.ay(var6);
            }

            this.bx = this.bj.ao() * -1191384473;
            this.bk = 1660854805 * this.bj.ai[1467519319 * this.bx];
            this.bq = this.bj.an(-2049237699 * this.bk) * 3282389020956090795L;
         }
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "mn.an(" + ')');
      }
   }

   int ej(nx var1) {
      mq var2 = var1.aj;
      int var3 = this.ay[448138691 * var1.ap] * this.aj[-1722499432 * var1.ap] + 4096 >> 13;
      var3 = 16384 + var3 * var3 >> 15;
      var3 = var3 * 419118984 * var1.as + 1253560972 >> 15;
      var3 = var3 * this.aw * -1624571069 + 128 >> 8;
      if (var2.ak * -1364179056 > 0) {
         var3 = (int)((double)var3 * Math.pow(0.5D, 1.953125E-5D * (double)(613388073 * var1.an) * (double)(-45274081 * var2.ak)) + 0.5D);
      }

      int var4;
      int var5;
      int var6;
      int var7;
      if (null != var2.ap) {
         var4 = var1.ao * 2080811300;
         var5 = var2.ap[var1.af * 624990819 + 1];
         if (-1328840178 * var1.af < var2.ap.length - 2) {
            var6 = (var2.ap[var1.af * -817688123] & 255) << 8;
            var7 = (var2.ap[2 + -1501648015 * var1.af] & -480602739) << 8;
            var5 += (var2.ap[var1.af * -817688123 + 3] - var5) * (var4 - var6) / (var7 - var6);
         }

         var3 = var3 * var5 + -2048437812 >> 6;
      }

      if (var1.ar * -643665026 > 0 && null != var2.aw) {
         var4 = 1024908896 * var1.ar;
         var5 = var2.aw[1 + 1162998657 * var1.ab];
         if (-1510705435 * var1.ab < var2.aw.length - 2) {
            var6 = (var2.aw[var1.ab * -1510705435] & 663162937) << 8;
            var7 = (var2.aw[2 + -73428551 * var1.ab] & 493656603) << 8;
            var5 += (var4 - var6) * (var2.aw[-1846501645 * var1.ab + 3] - var5) / (var7 - var6);
         }

         var3 = var5 * var3 + 32 >> 6;
      }

      return var3;
   }

   public boolean af(int var1) {
      try {
         synchronized(this.bz) {
            return this.bj.ak();
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "mn.af(" + ')');
      }
   }

   void db(int var1, int var2) {
      this.at[var1] = var2;
   }

   public void ab(int var1, int var2, int var3) {
      try {
         synchronized(this.bz) {
            this.az(var1, var2, -1898445767);
         }
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "mn.ab(" + ')');
      }
   }

   int ep(nx var1) {
      int var2 = (var1.at * 1377577087 * 1088488079 * var1.au >> 12) + var1.am * 1804670005;
      var2 += this.ax[31873403 * var1.ap] * (this.at[31873403 * var1.ap] - 8192) >> 12;
      mq var3 = var1.aj;
      int var4;
      if (var3.ae * 1749128175 > 0 && (-1464811851 * var3.as > 0 || this.au[31873403 * var1.ap] > 0)) {
         var4 = -1464811851 * var3.as << 2;
         int var5 = var3.am * -2064706685 << 1;
         if (442245821 * var1.az < var5) {
            var4 = var4 * var1.az * 442245821 / var5;
         }

         var4 += this.au[31873403 * var1.ap] >> 7;
         double var6 = Math.sin(0.01227184630308513D * (double)(2042615503 * var1.ag & 511));
         var2 += (int)((double)var4 * var6);
      }

      var4 = (int)((double)(256 * var1.ak.ap) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)(du.ai * -336955471) + 0.5D);
      return var4 < 1 ? 1 : var4;
   }

   void ey(int var1) {
      if (0 != (this.ac[var1] & 2)) {
         for(nx var2 = (nx)this.bp.aw.as(); var2 != null; var2 = (nx)this.bp.aw.am()) {
            if (var2.ap * 31873403 == var1 && this.ah[var1][var2.ay * 986016383] == null && var2.ar * -1980728553 < 0) {
               var2.ar = 0;
            }
         }
      }

   }

   void ad(int var1, int var2, int var3, int var4) {
      try {
         this.av(var1, var2, 64, -519596745);
         if ((this.ac[var1] & 2) != 0) {
            if (var4 >= 131616625) {
               throw new IllegalStateException();
            }

            for(nx var5 = (nx)this.bp.aw.ae(); var5 != null; var5 = (nx)this.bp.aw.at()) {
               if (var4 >= 131616625) {
                  throw new IllegalStateException();
               }

               if (var1 == 31873403 * var5.ap) {
                  if (var4 >= 131616625) {
                     throw new IllegalStateException();
                  }

                  if (-1980728553 * var5.ar < 0) {
                     if (var4 >= 131616625) {
                        throw new IllegalStateException();
                     }

                     this.ah[var1][986016383 * var5.ay] = null;
                     this.ah[var1][var2] = var5;
                     int var6 = (1377577087 * var5.at * var5.au * 1088488079 >> 12) + 1804670005 * var5.am;
                     var5.am += -1061642723 * (var2 - 986016383 * var5.ay << 8);
                     var5.at = 1029412735 * (var6 - var5.am * 1804670005);
                     var5.au = 1036447744;
                     var5.ay = 1380734335 * var2;
                     return;
                  }
               }
            }
         }

         np var10 = (np)this.ap.ap((long)this.ae[var1]);
         if (null == var10) {
            if (var4 < 131616625) {
               ;
            }
         } else if (var10.ak[var2] == null) {
            if (var4 >= 131616625) {
               throw new IllegalStateException();
            }
         } else {
            bt var11 = var10.ak[var2].ak(490766395);
            if (null == var11) {
               if (var4 >= 131616625) {
                  throw new IllegalStateException();
               }
            } else {
               nx var7 = new nx();
               var7.ap = var1 * 1115528627;
               var7.aw = var10;
               var7.ak = var11;
               var7.aj = var10.as[var2];
               var7.ai = 1809336903 * var10.ae[var2];
               var7.ay = 1380734335 * var2;
               var7.as = 593975739 * (1024 + var10.ap * -928013155 * var3 * var3 * var10.ai[var2] >> 11);
               var7.ae = -706433871 * (var10.ay[var2] & 255);
               var7.am = -1061642723 * ((var2 << 8) - (var10.aj[var2] & 32767));
               var7.an = 0;
               var7.ao = 0;
               var7.af = 0;
               var7.ar = -681471143;
               var7.ab = 0;
               if (this.aq[var1] == 0) {
                  if (var4 >= 131616625) {
                     return;
                  }

                  var7.ad = bf.aj(var11, this.bm(var7, -204837054), this.bo(var7, 24865926), this.bd(var7, 580659465));
               } else {
                  var7.ad = bf.aj(var11, this.bm(var7, 698345010), 0, this.bd(var7, 1400378666));
                  boolean var10002;
                  if (var10.aj[var2] < 0) {
                     if (var4 >= 131616625) {
                        throw new IllegalStateException();
                     }

                     var10002 = true;
                  } else {
                     var10002 = false;
                  }

                  this.ac(var7, var10002, -562722358);
               }

               if (var10.aj[var2] < 0) {
                  if (var4 >= 131616625) {
                     throw new IllegalStateException();
                  }

                  var7.ad.at(-1);
               }

               if (-1553842313 * var7.ai >= 0) {
                  if (var4 >= 131616625) {
                     throw new IllegalStateException();
                  }

                  nx var8 = this.bh[var1][var7.ai * -1553842313];
                  if (null != var8) {
                     if (var4 >= 131616625) {
                        throw new IllegalStateException();
                     }

                     if (-1980728553 * var8.ar < 0) {
                        if (var4 >= 131616625) {
                           throw new IllegalStateException();
                        }

                        this.ah[var1][986016383 * var8.ay] = null;
                        var8.ar = 0;
                     }
                  }

                  this.bh[var1][var7.ai * -1553842313] = var7;
               }

               this.bp.aw.aw(var7);
               this.ah[var1][var2] = var7;
            }
         }
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "mn.ad(" + ')');
      }
   }

   public boolean ar(int var1) {
      try {
         synchronized(this.bz) {
            boolean var10000;
            if (this.ap.aw() > 0) {
               if (var1 == -1888831561) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "mn.ar(" + ')');
      }
   }

   void dv(int var1, int var2) {
      this.at[var1] = var2;
   }

   void ax(int var1, int var2, int var3, int var4) {
      try {
         ;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "mn.ax(" + ')');
      }
   }

   void aq(int var1, int var2, short var3) {
      try {
         ;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "mn.aq(" + ')');
      }
   }

   void ba(byte var1) {
      try {
         int var2 = this.bx * 1467519319;
         int var3 = -2049237699 * this.bk;
         long var4 = this.bq * 3261477869149819139L;

         label66:
         while(true) {
            if (-2049237699 * this.bk != var3) {
               this.bx = var2 * -1191384473;
               this.bk = var3 * 1660854805;
               this.bq = 3282389020956090795L * var4;
               return;
            }

            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            while(var3 == this.bj.ai[var2]) {
               this.bj.ai(var2);
               int var6 = this.bj.am(var2);
               if (1 == var6) {
                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  this.bj.as();
                  this.bj.ay(var2);
                  if (!this.bj.af()) {
                     if (var1 >= 0) {
                        throw new IllegalStateException();
                     }
                  } else {
                     if (!this.bv) {
                        break label66;
                     }

                     if (var1 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (0 == var3) {
                        break label66;
                     }

                     this.bj.ar(var4);
                  }
                  break;
               }

               if ((var6 & 128) != 0) {
                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  this.bu(var6, 1270663531);
               }

               this.bj.ae(var2);
               this.bj.ay(var2);
            }

            var2 = this.bj.ao();
            var3 = this.bj.ai[var2];
            var4 = this.bj.an(var3);
         }

         this.by(1731203197);
         this.bj.aw();
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "mn.ba(" + ')');
      }
   }

   void bb(int var1, int var2) {
      try {
         for(nx var3 = (nx)this.bp.aw.as(); var3 != null; var3 = (nx)this.bp.aw.am()) {
            if (var2 == -740229470) {
               throw new IllegalStateException();
            }

            if (var1 >= 0) {
               if (var3.ap * 31873403 != var1) {
                  continue;
               }

               if (var2 == -740229470) {
                  throw new IllegalStateException();
               }
            }

            if (null != var3.ad) {
               if (var2 == -740229470) {
                  throw new IllegalStateException();
               }

               var3.ad.ax(du.ai * -336955471 / 100);
               if (var3.ad.bq()) {
                  if (var2 == -740229470) {
                     throw new IllegalStateException();
                  }

                  this.bp.ak.ap(var3.ad);
               }

               var3.ap(-2069963453);
            }

            if (-1980728553 * var3.ar < 0) {
               if (var2 == -740229470) {
                  throw new IllegalStateException();
               }

               this.ah[31873403 * var3.ap][986016383 * var3.ay] = null;
            }

            var3.kf();
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "mn.bb(" + ')');
      }
   }

   void bq(int var1, int var2) {
      try {
         if (var1 < 0) {
            if (var2 == -257007612) {
               throw new IllegalStateException();
            } else {
               for(var1 = 0; var1 < 16; ++var1) {
                  if (var2 == -257007612) {
                     throw new IllegalStateException();
                  }

                  this.bq(var1, -507110964);
               }

            }
         } else {
            this.aj[var1] = 12800;
            this.ai[var1] = 8192;
            this.ay[var1] = 16383;
            this.at[var1] = 8192;
            this.au[var1] = 0;
            this.an[var1] = 8192;
            this.br(var1, (byte)-70);
            this.bn(var1, -1561583095);
            this.ac[var1] = 0;
            this.av[var1] = 32767;
            this.ax[var1] = 256;
            this.aq[var1] = 0;
            this.bs(var1, 8192, 1527811169);
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "mn.bq(" + ')');
      }
   }

   void dl(int var1, int var2, int var3) {
   }

   void by(int var1) {
      try {
         this.bb(-1, 1730903437);
         this.bq(-1, -1707744212);

         int var2;
         for(var2 = 0; var2 < 16; ++var2) {
            if (var1 >= 1934777915) {
               throw new IllegalStateException();
            }

            this.ae[var2] = this.as[var2];
         }

         for(var2 = 0; var2 < 16; ++var2) {
            if (var1 >= 1934777915) {
               throw new IllegalStateException();
            }

            this.am[var2] = this.as[var2] & -128;
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "mn.by(" + ')');
      }
   }

   void br(int var1, byte var2) {
      try {
         if (0 != (this.ac[var1] & 2)) {
            if (var2 == 45) {
               throw new IllegalStateException();
            }

            for(nx var3 = (nx)this.bp.aw.as(); var3 != null; var3 = (nx)this.bp.aw.am()) {
               if (var2 == 45) {
                  throw new IllegalStateException();
               }

               if (var3.ap * 31873403 == var1) {
                  if (var2 == 45) {
                     throw new IllegalStateException();
                  }

                  if (this.ah[var1][var3.ay * 986016383] == null) {
                     if (var2 == 45) {
                        return;
                     }

                     if (var3.ar * -1980728553 < 0) {
                        if (var2 == 45) {
                           throw new IllegalStateException();
                        }

                        var3.ar = 0;
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "mn.br(" + ')');
      }
   }

   boolean bw(nx var1, int var2) {
      try {
         if (var1.ad == null) {
            if (var2 <= 1601399073) {
               throw new IllegalStateException();
            } else {
               if (-1980728553 * var1.ar >= 0) {
                  var1.kf();
                  if (-1553842313 * var1.ai > 0) {
                     if (var2 <= 1601399073) {
                        throw new IllegalStateException();
                     }

                     if (this.bh[var1.ap * 31873403][-1553842313 * var1.ai] == var1) {
                        if (var2 <= 1601399073) {
                           throw new IllegalStateException();
                        }

                        this.bh[31873403 * var1.ap][-1553842313 * var1.ai] = null;
                     }
                  }
               }

               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "mn.bw(" + ')');
      }
   }

   void bu(int var1, int var2) {
      try {
         int var3 = var1 & 240;
         int var4;
         int var5;
         int var6;
         if (128 == var3) {
            if (var2 <= -563508364) {
               throw new IllegalStateException();
            } else {
               var4 = var1 & 15;
               var5 = var1 >> 8 & 127;
               var6 = var1 >> 16 & 127;
               this.av(var4, var5, var6, -519596745);
            }
         } else if (var3 == 144) {
            if (var2 <= -563508364) {
               throw new IllegalStateException();
            } else {
               var4 = var1 & 15;
               var5 = var1 >> 8 & 127;
               var6 = var1 >> 16 & 127;
               if (var6 > 0) {
                  if (var2 <= -563508364) {
                     throw new IllegalStateException();
                  }

                  this.ad(var4, var5, var6, -2071266374);
               } else {
                  this.av(var4, var5, 64, -519596745);
               }

            }
         } else if (var3 == 160) {
            if (var2 <= -563508364) {
               throw new IllegalStateException();
            } else {
               var4 = var1 & 15;
               var5 = var1 >> 8 & 127;
               var6 = var1 >> 16 & 127;
               this.ax(var4, var5, var6, 684495753);
            }
         } else if (var3 == 176) {
            if (var2 <= -563508364) {
               throw new IllegalStateException();
            } else {
               var4 = var1 & 15;
               var5 = var1 >> 8 & 127;
               var6 = var1 >> 16 & 127;
               if (var5 == 0) {
                  if (var2 <= -563508364) {
                     throw new IllegalStateException();
                  }

                  this.am[var4] = (this.am[var4] & -2080769) + (var6 << 14);
               }

               if (var5 == 32) {
                  if (var2 <= -563508364) {
                     throw new IllegalStateException();
                  }

                  this.am[var4] = (var6 << 7) + (this.am[var4] & -16257);
               }

               if (1 == var5) {
                  if (var2 <= -563508364) {
                     throw new IllegalStateException();
                  }

                  this.au[var4] = (var6 << 7) + (this.au[var4] & -16257);
               }

               if (var5 == 33) {
                  if (var2 <= -563508364) {
                     return;
                  }

                  this.au[var4] = var6 + (this.au[var4] & -128);
               }

               if (5 == var5) {
                  if (var2 <= -563508364) {
                     throw new IllegalStateException();
                  }

                  this.an[var4] = (this.an[var4] & -16257) + (var6 << 7);
               }

               if (37 == var5) {
                  if (var2 <= -563508364) {
                     return;
                  }

                  this.an[var4] = var6 + (this.an[var4] & -128);
               }

               if (7 == var5) {
                  if (var2 <= -563508364) {
                     throw new IllegalStateException();
                  }

                  this.aj[var4] = (this.aj[var4] & -16257) + (var6 << 7);
               }

               if (var5 == 39) {
                  this.aj[var4] = (this.aj[var4] & -128) + var6;
               }

               if (var5 == 10) {
                  if (var2 <= -563508364) {
                     throw new IllegalStateException();
                  }

                  this.ai[var4] = (var6 << 7) + (this.ai[var4] & -16257);
               }

               if (var5 == 42) {
                  if (var2 <= -563508364) {
                     throw new IllegalStateException();
                  }

                  this.ai[var4] = var6 + (this.ai[var4] & -128);
               }

               if (var5 == 11) {
                  this.ay[var4] = (this.ay[var4] & -16257) + (var6 << 7);
               }

               if (43 == var5) {
                  if (var2 <= -563508364) {
                     throw new IllegalStateException();
                  }

                  this.ay[var4] = (this.ay[var4] & -128) + var6;
               }

               int[] var10000;
               if (64 == var5) {
                  if (var2 <= -563508364) {
                     throw new IllegalStateException();
                  }

                  if (var6 >= 64) {
                     if (var2 <= -563508364) {
                        return;
                     }

                     var10000 = this.ac;
                     var10000[var4] |= 1;
                  } else {
                     var10000 = this.ac;
                     var10000[var4] &= -2;
                  }
               }

               if (var5 == 65) {
                  if (var2 <= -563508364) {
                     throw new IllegalStateException();
                  }

                  if (var6 >= 64) {
                     if (var2 <= -563508364) {
                        throw new IllegalStateException();
                     }

                     var10000 = this.ac;
                     var10000[var4] |= 2;
                  } else {
                     this.br(var4, (byte)-15);
                     var10000 = this.ac;
                     var10000[var4] &= -3;
                  }
               }

               if (99 == var5) {
                  if (var2 <= -563508364) {
                     throw new IllegalStateException();
                  }

                  this.av[var4] = (var6 << 7) + (this.av[var4] & 127);
               }

               if (98 == var5) {
                  if (var2 <= -563508364) {
                     return;
                  }

                  this.av[var4] = (this.av[var4] & 16256) + var6;
               }

               if (101 == var5) {
                  if (var2 <= -563508364) {
                     return;
                  }

                  this.av[var4] = (this.av[var4] & 127) + 16384 + (var6 << 7);
               }

               if (100 == var5) {
                  if (var2 <= -563508364) {
                     throw new IllegalStateException();
                  }

                  this.av[var4] = (this.av[var4] & 16256) + 16384 + var6;
               }

               if (120 == var5) {
                  if (var2 <= -563508364) {
                     return;
                  }

                  this.bb(var4, -2120447552);
               }

               if (var5 == 121) {
                  if (var2 <= -563508364) {
                     throw new IllegalStateException();
                  }

                  this.bq(var4, 98174804);
               }

               if (var5 == 123) {
                  if (var2 <= -563508364) {
                     return;
                  }

                  this.bp(var4, -1883690382);
               }

               int var7;
               if (6 == var5) {
                  if (var2 <= -563508364) {
                     throw new IllegalStateException();
                  }

                  var7 = this.av[var4];
                  if (var7 == 16384) {
                     if (var2 <= -563508364) {
                        throw new IllegalStateException();
                     }

                     this.ax[var4] = (var6 << 7) + (this.ax[var4] & -16257);
                  }
               }

               if (var5 == 38) {
                  var7 = this.av[var4];
                  if (var7 == 16384) {
                     if (var2 <= -563508364) {
                        throw new IllegalStateException();
                     }

                     this.ax[var4] = var6 + (this.ax[var4] & -128);
                  }
               }

               if (16 == var5) {
                  if (var2 <= -563508364) {
                     throw new IllegalStateException();
                  }

                  this.aq[var4] = (this.aq[var4] & -16257) + (var6 << 7);
               }

               if (var5 == 48) {
                  if (var2 <= -563508364) {
                     return;
                  }

                  this.aq[var4] = var6 + (this.aq[var4] & -128);
               }

               if (81 == var5) {
                  if (var2 <= -563508364) {
                     throw new IllegalStateException();
                  }

                  if (var6 >= 64) {
                     if (var2 <= -563508364) {
                        throw new IllegalStateException();
                     }

                     var10000 = this.ac;
                     var10000[var4] |= 4;
                  } else {
                     this.bn(var4, -1561583095);
                     var10000 = this.ac;
                     var10000[var4] &= -5;
                  }
               }

               if (17 == var5) {
                  if (var2 <= -563508364) {
                     return;
                  }

                  this.bs(var4, (this.al[var4] & -16257) + (var6 << 7), 1109718682);
               }

               if (49 == var5) {
                  if (var2 <= -563508364) {
                     throw new IllegalStateException();
                  }

                  this.bs(var4, var6 + (this.al[var4] & -128), 126708469);
               }

            }
         } else if (192 == var3) {
            if (var2 <= -563508364) {
               throw new IllegalStateException();
            } else {
               var4 = var1 & 15;
               var5 = var1 >> 8 & 127;
               this.ag(var4, this.am[var4] + var5, -2104607190);
            }
         } else if (var3 == 208) {
            var4 = var1 & 15;
            var5 = var1 >> 8 & 127;
            this.aq(var4, var5, (short)236);
         } else if (224 == var3) {
            var4 = var1 & 15;
            var5 = (var1 >> 9 & 16256) + (var1 >> 8 & 127);
            this.al(var4, var5, 690438202);
         } else {
            var3 = var1 & 255;
            if (255 == var3) {
               if (var2 > -563508364) {
                  this.by(-232127251);
               }
            }
         }
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "mn.bu(" + ')');
      }
   }

   void bs(int var1, int var2, int var3) {
      try {
         this.al[var1] = var2;
         this.aa[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "mn.bs(" + ')');
      }
   }

   int bm(nx var1, int var2) {
      try {
         int var3 = (var1.at * 1377577087 * 1088488079 * var1.au >> 12) + var1.am * 1804670005;
         var3 += this.ax[31873403 * var1.ap] * (this.at[31873403 * var1.ap] - 8192) >> 12;
         mq var4 = var1.aj;
         int var5;
         if (var4.ae * 1749128175 > 0) {
            label53: {
               if (-1464811851 * var4.as <= 0) {
                  if (var2 == -1188814955) {
                     throw new IllegalStateException();
                  }

                  if (this.au[31873403 * var1.ap] <= 0) {
                     break label53;
                  }

                  if (var2 == -1188814955) {
                     throw new IllegalStateException();
                  }
               }

               var5 = -1464811851 * var4.as << 2;
               int var6 = var4.am * -2064706685 << 1;
               if (442245821 * var1.az < var6) {
                  if (var2 == -1188814955) {
                     throw new IllegalStateException();
                  }

                  var5 = var5 * var1.az * 442245821 / var6;
               }

               var5 += this.au[31873403 * var1.ap] >> 7;
               double var7 = Math.sin(0.01227184630308513D * (double)(2042615503 * var1.ag & 511));
               var3 += (int)((double)var5 * var7);
            }
         }

         var5 = (int)((double)(256 * var1.ak.ap) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var3) / (double)(du.ai * -336955471) + 0.5D);
         int var10000;
         if (var5 < 1) {
            if (var2 == -1188814955) {
               throw new IllegalStateException();
            }

            var10000 = 1;
         } else {
            var10000 = var5;
         }

         return var10000;
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "mn.bm(" + ')');
      }
   }

   int bo(nx var1, int var2) {
      try {
         mq var3 = var1.aj;
         int var4 = this.ay[31873403 * var1.ap] * this.aj[31873403 * var1.ap] + 4096 >> 13;
         var4 = 16384 + var4 * var4 >> 15;
         var4 = var4 * 309887859 * var1.as + 16384 >> 15;
         var4 = var4 * this.aw * 83352073 + 128 >> 8;
         if (var3.ak * -45274081 > 0) {
            var4 = (int)((double)var4 * Math.pow(0.5D, 1.953125E-5D * (double)(613388073 * var1.an) * (double)(-45274081 * var3.ak)) + 0.5D);
         }

         int var5;
         int var6;
         int var7;
         int var8;
         if (null != var3.ap) {
            if (var2 != 24865926) {
               throw new IllegalStateException();
            }

            var5 = var1.ao * -1191073049;
            var6 = var3.ap[var1.af * -817688123 + 1];
            if (-817688123 * var1.af < var3.ap.length - 2) {
               var7 = (var3.ap[var1.af * -817688123] & 255) << 8;
               var8 = (var3.ap[2 + -817688123 * var1.af] & 255) << 8;
               var6 += (var3.ap[var1.af * -817688123 + 3] - var6) * (var5 - var7) / (var8 - var7);
            }

            var4 = var4 * var6 + 32 >> 6;
         }

         if (var1.ar * -1980728553 > 0 && null != var3.aw) {
            if (var2 != 24865926) {
               throw new IllegalStateException();
            }

            var5 = -1980728553 * var1.ar;
            var6 = var3.aw[1 + -1510705435 * var1.ab];
            if (-1510705435 * var1.ab < var3.aw.length - 2) {
               if (var2 != 24865926) {
                  throw new IllegalStateException();
               }

               var7 = (var3.aw[var1.ab * -1510705435] & 255) << 8;
               var8 = (var3.aw[2 + -1510705435 * var1.ab] & 255) << 8;
               var6 += (var5 - var7) * (var3.aw[-1510705435 * var1.ab + 3] - var6) / (var8 - var7);
            }

            var4 = var6 * var4 + 32 >> 6;
         }

         return var4;
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "mn.bo(" + ')');
      }
   }

   void da(int var1, int var2) {
      if (this.ae[var1] != var2) {
         this.ae[var1] = var2;

         for(int var3 = 0; var3 < 128; ++var3) {
            this.bh[var1][var3] = null;
         }
      }

   }

   protected bg ay() {
      try {
         return this.bp;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "mn.ay(" + ')');
      }
   }

   void ek(int var1) {
      if ((this.ac[var1] & 4) != 0) {
         for(nx var2 = (nx)this.bp.aw.as(); null != var2; var2 = (nx)this.bp.aw.am()) {
            if (var1 == 31873403 * var2.ap) {
               var2.ax = 0;
            }
         }
      }

   }

   protected int ae() {
      try {
         return 0;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "mn.ae(" + ')');
      }
   }

   public mn(bm var1) {
      try {
         super();
         this.aw = 2043951360;
         this.ak = -2001296320;
         this.aj = new int[16];
         this.ai = new int[16];
         this.ay = new int[16];
         this.as = new int[16];
         this.ae = new int[16];
         this.am = new int[16];
         this.at = new int[16];
         this.au = new int[16];
         this.an = new int[16];
         this.ac = new int[16];
         this.av = new int[16];
         this.ax = new int[16];
         this.aq = new int[16];
         this.al = new int[16];
         this.aa = new int[16];
         this.ah = new nx[16][128];
         this.bh = new nx[16][128];
         this.bj = new mc();
         this.bp = new nt(this);
         this.bz = null;
         this.bc = new PriorityQueue(5, new nq());
         this.bn = 0;
         this.bz = var1;
         this.ap = new ud(128);
         this.by(1554633082);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "mn.<init>(" + ')');
      }
   }

   protected void au(int var1) {
      try {
         if (this.bj.ak()) {
            int var2 = this.bj.aw * 1106659065 * this.ak / (du.ai * -336955471);

            do {
               long var3 = -6156239428887658301L * this.bb + (long)var2 * (long)var1;
               if (this.bq * 3261477869149819139L - var3 >= 0L) {
                  this.bb = 4193716940502921195L * var3;
                  break;
               }

               int var5 = (int)((this.bq * 3261477869149819139L - this.bb * -6156239428887658301L + (long)var2 - 1L) / (long)var2);
               this.bb += (long)var2 * (long)var5 * 4193716940502921195L;
               this.bp.au(var5);
               var1 -= var5;
               this.ba((byte)-19);
            } while(this.bj.ak());
         }

         this.bp.au(var1);
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "mn.au(" + ')');
      }
   }

   protected bg bj() {
      return null;
   }

   void dy(int var1) {
      if (var1 >= 0) {
         this.aj[var1] = 12800;
         this.ai[var1] = -1483767732;
         this.ay[var1] = 1475716224;
         this.at[var1] = 103257893;
         this.au[var1] = 0;
         this.an[var1] = 8192;
         this.br(var1, (byte)-33);
         this.bn(var1, -1561583095);
         this.ac[var1] = 0;
         this.av[var1] = 32767;
         this.ax[var1] = -2107332681;
         this.aq[var1] = 0;
         this.bs(var1, 1835882048, 2065726697);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.bq(var1, 692362739);
         }

      }
   }

   boolean bi(nx var1, int[] var2, int var3, int var4, int var5) {
      try {
         var1.ac = du.ai * -336955471 / 100 * 999135057;
         if (-1980728553 * var1.ar >= 0) {
            label235: {
               if (var5 == -288070343) {
                  throw new IllegalStateException();
               }

               if (var1.ad != null) {
                  if (var5 == -288070343) {
                     throw new IllegalStateException();
                  }

                  if (!var1.ad.bb()) {
                     break label235;
                  }

                  if (var5 == -288070343) {
                     throw new IllegalStateException();
                  }
               }

               var1.ap(-1882757236);
               var1.kf();
               if (var1.ai * -1553842313 > 0) {
                  if (var5 == -288070343) {
                     throw new IllegalStateException();
                  }

                  if (this.bh[var1.ap * 31873403][-1553842313 * var1.ai] == var1) {
                     if (var5 == -288070343) {
                        throw new IllegalStateException();
                     }

                     this.bh[31873403 * var1.ap][-1553842313 * var1.ai] = null;
                  }
               }

               return true;
            }
         }

         int var6 = 1088488079 * var1.au;
         if (var6 > 0) {
            if (var5 == -288070343) {
               throw new IllegalStateException();
            }

            var6 -= (int)(16.0D * Math.pow(2.0D, (double)this.an[31873403 * var1.ap] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
               var6 = 0;
            }

            var1.au = 108256367 * var6;
         }

         var1.ad.aq(this.bm(var1, 660763607));
         mq var7 = var1.aj;
         boolean var8 = false;
         var1.az += 553609365;
         var1.ag += -1209026335 * var7.ae;
         double var9 = (double)((1088488079 * var1.au * var1.at * 1377577087 >> 12) + (var1.ay * 986016383 - 60 << 8)) * 5.086263020833333E-6D;
         if (var7.ak * -45274081 > 0) {
            if (var5 == -288070343) {
               throw new IllegalStateException();
            }

            if (-2113529759 * var7.ay > 0) {
               if (var5 == -288070343) {
                  throw new IllegalStateException();
               }

               var1.an += (int)(128.0D * Math.pow(2.0D, var9 * (double)(-2113529759 * var7.ay)) + 0.5D) * 318012697;
            } else {
               var1.an += 2050919552;
            }
         }

         if (var7.ap != null) {
            if (var5 == -288070343) {
               throw new IllegalStateException();
            }

            if (var7.aj * 673344057 > 0) {
               if (var5 == -288070343) {
                  throw new IllegalStateException();
               }

               var1.ao += (int)(128.0D * Math.pow(2.0D, var9 * (double)(673344057 * var7.aj)) + 0.5D) * 1470351575;
            } else {
               var1.ao += -773559424;
            }

            while(var1.af * -817688123 < var7.ap.length - 2 && -1191073049 * var1.ao > (var7.ap[2 + var1.af * -817688123] & 255) << 8) {
               if (var5 == -288070343) {
                  throw new IllegalStateException();
               }

               var1.af += 1659669018;
            }

            if (var7.ap.length - 2 == var1.af * -817688123) {
               if (var5 == -288070343) {
                  throw new IllegalStateException();
               }

               if (var7.ap[var1.af * -817688123 + 1] == 0) {
                  if (var5 == -288070343) {
                     throw new IllegalStateException();
                  }

                  var8 = true;
               }
            }
         }

         if (var1.ar * -1980728553 >= 0) {
            if (var5 == -288070343) {
               throw new IllegalStateException();
            }

            if (null != var7.aw) {
               if (var5 == -288070343) {
                  throw new IllegalStateException();
               }

               if ((this.ac[var1.ap * 31873403] & 1) == 0) {
                  label232: {
                     if (var5 == -288070343) {
                        throw new IllegalStateException();
                     }

                     if (var1.ai * -1553842313 >= 0) {
                        if (var1 == this.bh[var1.ap * 31873403][var1.ai * -1553842313]) {
                           break label232;
                        }

                        if (var5 == -288070343) {
                           throw new IllegalStateException();
                        }
                     }

                     if (1450993153 * var7.ai > 0) {
                        if (var5 == -288070343) {
                           throw new IllegalStateException();
                        }

                        var1.ar += (int)(128.0D * Math.pow(2.0D, var9 * (double)(1450993153 * var7.ai)) + 0.5D) * 681471143;
                     } else {
                        var1.ar += 1328960384;
                     }

                     while(-1510705435 * var1.ab < var7.aw.length - 2) {
                        if (var5 == -288070343) {
                           throw new IllegalStateException();
                        }

                        if (-1980728553 * var1.ar <= (var7.aw[-1510705435 * var1.ab + 2] & 255) << 8) {
                           break;
                        }

                        if (var5 == -288070343) {
                           throw new IllegalStateException();
                        }

                        var1.ab += 1911729626;
                     }

                     if (var7.aw.length - 2 == -1510705435 * var1.ab) {
                        if (var5 == -288070343) {
                           throw new IllegalStateException();
                        }

                        var8 = true;
                     }
                  }
               }
            }
         }

         if (var8) {
            if (var5 == -288070343) {
               throw new IllegalStateException();
            } else {
               var1.ad.ax(var1.ac * -1548873295);
               if (var2 != null) {
                  var1.ad.am(var2, var3, var4);
               } else {
                  var1.ad.au(var4);
               }

               if (var1.ad.bq()) {
                  if (var5 == -288070343) {
                     throw new IllegalStateException();
                  }

                  this.bp.ak.ap(var1.ad);
               }

               var1.ap(-2081531765);
               if (var1.ar * -1980728553 >= 0) {
                  if (var5 == -288070343) {
                     throw new IllegalStateException();
                  }

                  var1.kf();
                  if (-1553842313 * var1.ai > 0 && this.bh[var1.ap * 31873403][-1553842313 * var1.ai] == var1) {
                     this.bh[var1.ap * 31873403][-1553842313 * var1.ai] = null;
                  }
               }

               return true;
            }
         } else {
            var1.ad.av(var1.ac * -1548873295, this.bo(var1, 24865926), this.bd(var1, 1887173733));
            return false;
         }
      } catch (RuntimeException var11) {
         throw tm.aw(var11, "mn.bi(" + ')');
      }
   }

   void ds(int var1, int var2) {
      this.at[var1] = var2;
   }

   void ed(int var1, int var2) {
      this.al[var1] = var2;
      this.aa[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
   }

   protected bg ah() {
      return null;
   }

   protected bg bh() {
      return null;
   }

   void ef(int var1) {
      int var2 = var1 & 227828966;
      int var3;
      int var4;
      int var5;
      if (-829635235 == var2) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & -962644708;
         var5 = var1 >> 16 & -1004647115;
         this.av(var3, var4, var5, -519596745);
      } else if (var2 == 825747616) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 1442242106;
         var5 = var1 >> 16 & 127;
         if (var5 > 0) {
            this.ad(var3, var4, var5, -2126179089);
         } else {
            this.av(var3, var4, 64, -519596745);
         }

      } else if (var2 == 160) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & -1840285787;
         this.ax(var3, var4, var5, 684495753);
      } else if (var2 == 176) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 1205784262;
         var5 = var1 >> 16 & 127;
         if (var4 == 0) {
            this.am[var3] = (this.am[var3] & 88658098) + (var5 << 14);
         }

         if (var4 == 1681042651) {
            this.am[var3] = (var5 << 7) + (this.am[var3] & -16257);
         }

         if (1 == var4) {
            this.au[var3] = (var5 << 7) + (this.au[var3] & -16257);
         }

         if (var4 == 33) {
            this.au[var3] = var5 + (this.au[var3] & -1051700969);
         }

         if (5 == var4) {
            this.an[var3] = (this.an[var3] & -16257) + (var5 << 7);
         }

         if (37 == var4) {
            this.an[var3] = var5 + (this.an[var3] & -128);
         }

         if (7 == var4) {
            this.aj[var3] = (this.aj[var3] & -16257) + (var5 << 7);
         }

         if (var4 == 39) {
            this.aj[var3] = (this.aj[var3] & -128) + var5;
         }

         if (var4 == 10) {
            this.ai[var3] = (var5 << 7) + (this.ai[var3] & -708662050);
         }

         if (var4 == 496351543) {
            this.ai[var3] = var5 + (this.ai[var3] & 403389319);
         }

         if (var4 == 11) {
            this.ay[var3] = (this.ay[var3] & 1206428485) + (var5 << 7);
         }

         if (-1834417412 == var4) {
            this.ay[var3] = (this.ay[var3] & 1393136599) + var5;
         }

         int[] var10000;
         if (64 == var4) {
            if (var5 >= -2103047616) {
               var10000 = this.ac;
               var10000[var3] |= 1;
            } else {
               var10000 = this.ac;
               var10000[var3] &= -865807434;
            }
         }

         if (var4 == 1875743806) {
            if (var5 >= 1608441661) {
               var10000 = this.ac;
               var10000[var3] |= 2;
            } else {
               this.br(var3, (byte)-112);
               var10000 = this.ac;
               var10000[var3] &= -3;
            }
         }

         if (99 == var4) {
            this.av[var3] = (var5 << 7) + (this.av[var3] & 1810311613);
         }

         if (98 == var4) {
            this.av[var3] = (this.av[var3] & -278281963) + var5;
         }

         if (-846406350 == var4) {
            this.av[var3] = (this.av[var3] & 127) + 1218242487 + (var5 << 7);
         }

         if (100 == var4) {
            this.av[var3] = (this.av[var3] & 565668771) + 16384 + var5;
         }

         if (120 == var4) {
            this.bb(var3, 2044797314);
         }

         if (var4 == 121) {
            this.bq(var3, -78872651);
         }

         if (var4 == -365645565) {
            this.bp(var3, -692966935);
         }

         int var6;
         if (6 == var4) {
            var6 = this.av[var3];
            if (var6 == 91620330) {
               this.ax[var3] = (var5 << 7) + (this.ax[var3] & -16257);
            }
         }

         if (var4 == -1015545720) {
            var6 = this.av[var3];
            if (var6 == 16384) {
               this.ax[var3] = var5 + (this.ax[var3] & -128);
            }
         }

         if (16 == var4) {
            this.aq[var3] = (this.aq[var3] & -16257) + (var5 << 7);
         }

         if (var4 == 48) {
            this.aq[var3] = var5 + (this.aq[var3] & -128);
         }

         if (1366559708 == var4) {
            if (var5 >= 1703209385) {
               var10000 = this.ac;
               var10000[var3] |= 4;
            } else {
               this.bn(var3, -1561583095);
               var10000 = this.ac;
               var10000[var3] &= -1523029988;
            }
         }

         if (17 == var4) {
            this.bs(var3, (this.al[var3] & -16257) + (var5 << 7), 1610775287);
         }

         if (878126066 == var4) {
            this.bs(var3, var5 + (this.al[var3] & -1667123547), 257900431);
         }

      } else if (192 == var2) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.ag(var3, this.am[var3] + var4, -1728933263);
      } else if (var2 == 208) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.aq(var3, var4, (short)236);
      } else if (1558805380 == var2) {
         var3 = var1 & 15;
         var4 = (var1 >> 9 & 16256) + (var1 >> 8 & -2128911321);
         this.al(var3, var4, -322933207);
      } else {
         var2 = var1 & 1826976282;
         if (255 == var2) {
            this.by(-421920184);
         }
      }
   }

   protected int bv() {
      return 0;
   }

   protected void bx(int[] var1, int var2, int var3) {
      if (this.bj.ak()) {
         int var4 = this.bj.aw * 1527317877 * this.ak / (1508473375 * du.ai);

         do {
            long var5 = -6156239428887658301L * this.bb + (long)var3 * (long)var4;
            if (3261477869149819139L * this.bq - var5 >= 0L) {
               this.bb = var5 * 4193716940502921195L;
               break;
            }

            int var7 = (int)(((long)var4 + (this.bq * 3261477869149819139L - this.bb * -6156239428887658301L) - 1L) / (long)var4);
            this.bb += (long)var4 * (long)var7 * 4193716940502921195L;
            this.bp.am(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.ba((byte)-10);
         } while(this.bj.ak());
      }

      this.bp.am(var1, var2, var3);
   }

   int ex(nx var1) {
      int var2 = (var1.at * 1377577087 * 1715246469 * var1.au >> 12) + var1.am * 740751144;
      var2 += this.ax[1365376587 * var1.ap] * (this.at[31873403 * var1.ap] - 8192) >> 12;
      mq var3 = var1.aj;
      int var4;
      if (var3.ae * 1749128175 > 0 && (-230887100 * var3.as > 0 || this.au[31873403 * var1.ap] > 0)) {
         var4 = 1934440754 * var3.as << 2;
         int var5 = var3.am * -2064706685 << 1;
         if (21312557 * var1.az < var5) {
            var4 = var4 * var1.az * 1117605802 / var5;
         }

         var4 += this.au[31873403 * var1.ap] >> 7;
         double var6 = Math.sin(0.01227184630308513D * (double)(682281967 * var1.ag & 511));
         var2 += (int)((double)var4 * var6);
      }

      var4 = (int)((double)(-424000769 * var1.ak.ap) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)(du.ai * -1359709913) + 0.5D);
      return var4 < 1 ? 1 : var4;
   }

   void dh(nx var1, boolean var2) {
      int var3 = var1.ak.aw.length;
      int var4;
      if (var2 && var1.ak.ai) {
         int var5 = var3 + var3 - var1.ak.ak;
         var4 = (int)((long)this.aq[var1.ap * 31873403] * (long)var5 >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.ad.ag(true);
         }
      } else {
         var4 = (int)((long)var3 * (long)this.aq[31873403 * var1.ap] >> 6);
      }

      var1.ad.az(var4);
   }

   protected void bk(int[] var1, int var2, int var3) {
      if (this.bj.ak()) {
         int var4 = this.bj.aw * 1106659065 * this.ak / (-336955471 * du.ai);

         do {
            long var5 = -6156239428887658301L * this.bb + (long)var3 * (long)var4;
            if (3261477869149819139L * this.bq - var5 >= 0L) {
               this.bb = var5 * 4193716940502921195L;
               break;
            }

            int var7 = (int)(((long)var4 + (this.bq * 3261477869149819139L - this.bb * -6156239428887658301L) - 1L) / (long)var4);
            this.bb += (long)var4 * (long)var7 * 4193716940502921195L;
            this.bp.am(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.ba((byte)-24);
         } while(this.bj.ak());
      }

      this.bp.am(var1, var2, var3);
   }

   public void bf(int var1) {
      synchronized(this.bz) {
         this.aw = var1 * 1719260217;
      }
   }

   public int bg() {
      return 83352073 * this.aw;
   }

   public int bl() {
      return 562992540 * this.aw;
   }

   public int be() {
      return 83352073 * this.aw;
   }

   public boolean cq(nv var1, pe var2, ba var3) {
      synchronized(this.bz) {
         boolean var5 = true;
         synchronized(this.bc) {
            this.bc.clear();
         }

         for(ni var6 = (ni)var1.ap.aj(); null != var6; var6 = (ni)var1.ap.ai()) {
            int var7 = (int)var6.ht;
            np var8 = (np)this.ap.ap((long)var7);
            if (var8 == null) {
               var8 = kt.ap(var2, var7, -530676126);
               if (var8 == null) {
                  var5 = false;
                  continue;
               }

               this.ap.ak(var8, (long)var7);
            }

            if (!var8.aw(var3, var6.aw, (short)-24369)) {
               var5 = false;
            } else if (null != this.bc) {
               synchronized(this.bc) {
                  Iterator var10 = var8.am.iterator();

                  while(var10.hasNext()) {
                     cb var11 = (cb)var10.next();
                     this.bc.add(new mx(1074084921 * var6.ap, var11));
                  }
               }
            }
         }

         return var5;
      }
   }

   public boolean cb(nv var1, pe var2, ba var3) {
      synchronized(this.bz) {
         boolean var5 = true;
         synchronized(this.bc) {
            this.bc.clear();
         }

         for(ni var6 = (ni)var1.ap.aj(); null != var6; var6 = (ni)var1.ap.ai()) {
            int var7 = (int)var6.ht;
            np var8 = (np)this.ap.ap((long)var7);
            if (var8 == null) {
               var8 = kt.ap(var2, var7, -867992331);
               if (var8 == null) {
                  var5 = false;
                  continue;
               }

               this.ap.ak(var8, (long)var7);
            }

            if (!var8.aw(var3, var6.aw, (short)-20534)) {
               var5 = false;
            } else if (null != this.bc) {
               synchronized(this.bc) {
                  Iterator var10 = var8.am.iterator();

                  while(var10.hasNext()) {
                     cb var11 = (cb)var10.next();
                     this.bc.add(new mx(1074084921 * var6.ap, var11));
                  }
               }
            }
         }

         return var5;
      }
   }

   public boolean cd(nv var1, pe var2, ba var3) {
      synchronized(this.bz) {
         boolean var5 = true;
         synchronized(this.bc) {
            this.bc.clear();
         }

         for(ni var6 = (ni)var1.ap.aj(); null != var6; var6 = (ni)var1.ap.ai()) {
            int var7 = (int)var6.ht;
            np var8 = (np)this.ap.ap((long)var7);
            if (var8 == null) {
               var8 = kt.ap(var2, var7, 753757219);
               if (var8 == null) {
                  var5 = false;
                  continue;
               }

               this.ap.ak(var8, (long)var7);
            }

            if (!var8.aw(var3, var6.aw, (short)-3623)) {
               var5 = false;
            } else if (null != this.bc) {
               synchronized(this.bc) {
                  Iterator var10 = var8.am.iterator();

                  while(var10.hasNext()) {
                     cb var11 = (cb)var10.next();
                     this.bc.add(new mx(1074084921 * var6.ap, var11));
                  }
               }
            }
         }

         return var5;
      }
   }

   public void ci() {
      if (null != this.bc) {
         if (by != null) {
            by.set(true);
         }

         by = new AtomicBoolean(false);
         AtomicBoolean var1 = by;
         if (null == br) {
            int var2 = Runtime.getRuntime().availableProcessors();
            br = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new mk(this));
         }

         br.submit(new nf(this, var1));
      }
   }

   void en(int var1) {
      int var2 = var1 & 240;
      int var3;
      int var4;
      int var5;
      if (128 == var2) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.av(var3, var4, var5, -519596745);
      } else if (var2 == 144) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if (var5 > 0) {
            this.ad(var3, var4, var5, -789792248);
         } else {
            this.av(var3, var4, 64, -519596745);
         }

      } else if (var2 == 160) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.ax(var3, var4, var5, 684495753);
      } else if (var2 == 176) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if (var4 == 0) {
            this.am[var3] = (this.am[var3] & -2080769) + (var5 << 14);
         }

         if (var4 == 32) {
            this.am[var3] = (var5 << 7) + (this.am[var3] & -16257);
         }

         if (1 == var4) {
            this.au[var3] = (var5 << 7) + (this.au[var3] & -16257);
         }

         if (var4 == 33) {
            this.au[var3] = var5 + (this.au[var3] & -128);
         }

         if (5 == var4) {
            this.an[var3] = (this.an[var3] & -16257) + (var5 << 7);
         }

         if (37 == var4) {
            this.an[var3] = var5 + (this.an[var3] & -128);
         }

         if (7 == var4) {
            this.aj[var3] = (this.aj[var3] & -16257) + (var5 << 7);
         }

         if (var4 == 39) {
            this.aj[var3] = (this.aj[var3] & -128) + var5;
         }

         if (var4 == 10) {
            this.ai[var3] = (var5 << 7) + (this.ai[var3] & -16257);
         }

         if (var4 == 42) {
            this.ai[var3] = var5 + (this.ai[var3] & -128);
         }

         if (var4 == 11) {
            this.ay[var3] = (this.ay[var3] & -16257) + (var5 << 7);
         }

         if (43 == var4) {
            this.ay[var3] = (this.ay[var3] & -128) + var5;
         }

         int[] var10000;
         if (64 == var4) {
            if (var5 >= 64) {
               var10000 = this.ac;
               var10000[var3] |= 1;
            } else {
               var10000 = this.ac;
               var10000[var3] &= -2;
            }
         }

         if (var4 == 65) {
            if (var5 >= 64) {
               var10000 = this.ac;
               var10000[var3] |= 2;
            } else {
               this.br(var3, (byte)-35);
               var10000 = this.ac;
               var10000[var3] &= -3;
            }
         }

         if (99 == var4) {
            this.av[var3] = (var5 << 7) + (this.av[var3] & 127);
         }

         if (98 == var4) {
            this.av[var3] = (this.av[var3] & 16256) + var5;
         }

         if (101 == var4) {
            this.av[var3] = (this.av[var3] & 127) + 16384 + (var5 << 7);
         }

         if (100 == var4) {
            this.av[var3] = (this.av[var3] & 16256) + 16384 + var5;
         }

         if (120 == var4) {
            this.bb(var3, 1636448383);
         }

         if (var4 == 121) {
            this.bq(var3, -978592287);
         }

         if (var4 == 123) {
            this.bp(var3, 846645457);
         }

         int var6;
         if (6 == var4) {
            var6 = this.av[var3];
            if (var6 == 16384) {
               this.ax[var3] = (var5 << 7) + (this.ax[var3] & -16257);
            }
         }

         if (var4 == 38) {
            var6 = this.av[var3];
            if (var6 == 16384) {
               this.ax[var3] = var5 + (this.ax[var3] & -128);
            }
         }

         if (16 == var4) {
            this.aq[var3] = (this.aq[var3] & -16257) + (var5 << 7);
         }

         if (var4 == 48) {
            this.aq[var3] = var5 + (this.aq[var3] & -128);
         }

         if (81 == var4) {
            if (var5 >= 64) {
               var10000 = this.ac;
               var10000[var3] |= 4;
            } else {
               this.bn(var3, -1561583095);
               var10000 = this.ac;
               var10000[var3] &= -5;
            }
         }

         if (17 == var4) {
            this.bs(var3, (this.al[var3] & -16257) + (var5 << 7), 808951991);
         }

         if (49 == var4) {
            this.bs(var3, var5 + (this.al[var3] & -128), 104846591);
         }

      } else if (192 == var2) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.ag(var3, this.am[var3] + var4, -1912017428);
      } else if (var2 == 208) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.aq(var3, var4, (short)236);
      } else if (224 == var2) {
         var3 = var1 & 15;
         var4 = (var1 >> 9 & 16256) + (var1 >> 8 & 127);
         this.al(var3, var4, 941583809);
      } else {
         var2 = var1 & 255;
         if (255 == var2) {
            this.by(-1409177267);
         }
      }
   }

   public void co() {
      synchronized(this.bz) {
         for(np var2 = (np)this.ap.aj(); null != var2; var2 = (np)this.ap.ai()) {
            var2.ak(2119937327);
         }

      }
   }

   public void cf() {
      synchronized(this.bz) {
         for(np var2 = (np)this.ap.aj(); null != var2; var2 = (np)this.ap.ai()) {
            var2.ak(2010154630);
         }

      }
   }

   public void cl() {
      synchronized(this.bz) {
         for(np var2 = (np)this.ap.aj(); null != var2; var2 = (np)this.ap.ai()) {
            var2.ak(-1361994816);
         }

      }
   }

   public void cp() {
      synchronized(this.bz) {
         for(np var2 = (np)this.ap.aj(); null != var2; var2 = (np)this.ap.ai()) {
            var2.ak(2028778074);
         }

      }
   }

   public void cv() {
      synchronized(this.bz) {
         for(np var2 = (np)this.ap.aj(); var2 != null; var2 = (np)this.ap.ai()) {
            var2.kf();
         }

      }
   }

   public void cy() {
      synchronized(this.bz) {
         for(np var2 = (np)this.ap.aj(); var2 != null; var2 = (np)this.ap.ai()) {
            var2.kf();
         }

      }
   }

   public void cx() {
      synchronized(this.bz) {
         for(np var2 = (np)this.ap.aj(); var2 != null; var2 = (np)this.ap.ai()) {
            var2.kf();
         }

      }
   }

   protected void am(int[] var1, int var2, int var3) {
      try {
         if (this.bj.ak()) {
            int var4 = this.bj.aw * 1106659065 * this.ak / (-336955471 * du.ai);

            do {
               long var5 = -6156239428887658301L * this.bb + (long)var3 * (long)var4;
               if (3261477869149819139L * this.bq - var5 >= 0L) {
                  this.bb = var5 * 4193716940502921195L;
                  break;
               }

               int var7 = (int)(((long)var4 + (this.bq * 3261477869149819139L - this.bb * -6156239428887658301L) - 1L) / (long)var4);
               this.bb += (long)var4 * (long)var7 * 4193716940502921195L;
               this.bp.am(var1, var2, var7);
               var2 += var7;
               var3 -= var7;
               this.ba((byte)-50);
            } while(this.bj.ak());
         }

         this.bp.am(var1, var2, var3);
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "mn.am(" + ')');
      }
   }

   public void ch(nv var1, boolean var2) {
      synchronized(this.bz) {
         this.ao(678883944);
         this.bj.ap(var1.aw);
         this.bv = var2;
         this.bb = 0L;
         int var4 = this.bj.aj();

         for(int var5 = 0; var5 < var4; ++var5) {
            this.bj.ai(var5);
            this.bj.ae(var5);
            this.bj.ay(var5);
         }

         this.bx = this.bj.ao() * -1191384473;
         this.bk = 1660854805 * this.bj.ai[1467519319 * this.bx];
         this.bq = this.bj.an(-2049237699 * this.bk) * 3282389020956090795L;
      }
   }

   public void ap(int var1, short var2) {
      try {
         synchronized(this.bz) {
            this.aw = var1 * 1719260217;
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "mn.ap(" + ')');
      }
   }

   void de(int var1) {
      for(nx var2 = (nx)this.bp.aw.as(); null != var2; var2 = (nx)this.bp.aw.am()) {
         if ((var1 < 0 || 31873403 * var2.ap == var1) && -1980728553 * var2.ar < 0) {
            this.ah[31873403 * var2.ap][var2.ay * 986016383] = null;
            var2.ar = 0;
         }
      }

   }

   public void cj() {
      synchronized(this.bz) {
         this.bj.aw();
         this.by(-1097318906);
      }
   }

   public boolean cm() {
      synchronized(this.bz) {
         return this.ap.aw() > 0;
      }
   }

   public void cw(int var1, int var2) {
      synchronized(this.bz) {
         this.az(var1, var2, -1898445767);
      }
   }

   public void ca(int var1, int var2) {
      synchronized(this.bz) {
         this.az(var1, var2, -1898445767);
      }
   }

   int bd(nx var1, int var2) {
      try {
         int var3 = this.ai[var1.ap * 31873403];
         return var3 < 8192 ? 32 + var1.ae * 1952586833 * var3 >> 6 : 16384 - (32 + (16384 - var3) * (128 - 1952586833 * var1.ae) >> 6);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "mn.bd(" + ')');
      }
   }

   void cr(int var1, int var2) {
      this.as[var1] = var2;
      this.am[var1] = var2 & -128;
      this.ag(var1, var2, -1705054130);
   }

   void ck(int var1, int var2) {
      this.as[var1] = var2;
      this.am[var1] = var2 & -128;
      this.ag(var1, var2, -1203311451);
   }

   void dq(int var1, int var2) {
      this.as[var1] = var2;
      this.am[var1] = var2 & -128;
      this.ag(var1, var2, -1917185136);
   }

   void dd(int var1, int var2) {
      if (this.ae[var1] != var2) {
         this.ae[var1] = var2;

         for(int var3 = 0; var3 < 128; ++var3) {
            this.bh[var1][var3] = null;
         }
      }

   }

   void dc(int var1, int var2) {
      if (this.ae[var1] != var2) {
         this.ae[var1] = var2;

         for(int var3 = 0; var3 < 128; ++var3) {
            this.bh[var1][var3] = null;
         }
      }

   }

   int eu(nx var1) {
      int var2 = this.ai[var1.ap * 31873403];
      return var2 < 8192 ? 32 + var1.ae * 1952586833 * var2 >> 6 : 16384 - (32 + (16384 - var2) * (128 - 1952586833 * var1.ae) >> 6);
   }

   void bn(int var1, int var2) {
      try {
         if ((this.ac[var1] & 4) != 0) {
            if (var2 != -1561583095) {
               throw new IllegalStateException();
            }

            for(nx var3 = (nx)this.bp.aw.as(); null != var3; var3 = (nx)this.bp.aw.am()) {
               if (var2 != -1561583095) {
                  return;
               }

               if (var1 == 31873403 * var3.ap) {
                  var3.ax = 0;
               }
            }
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "mn.bn(" + ')');
      }
   }

   void dg(nx var1, boolean var2) {
      int var3 = var1.ak.aw.length;
      int var4;
      if (var2 && var1.ak.ai) {
         int var5 = var3 + var3 - var1.ak.ak;
         var4 = (int)((long)this.aq[var1.ap * 31873403] * (long)var5 >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.ad.ag(true);
         }
      } else {
         var4 = (int)((long)var3 * (long)this.aq[31873403 * var1.ap] >> 6);
      }

      var1.ad.az(var4);
   }

   protected void bc(int var1) {
      if (this.bj.ak()) {
         int var2 = this.bj.aw * 1106659065 * this.ak / (du.ai * -1176028459);

         do {
            long var3 = -6156239428887658301L * this.bb + (long)var2 * (long)var1;
            if (this.bq * 3261477869149819139L - var3 >= 0L) {
               this.bb = 4193716940502921195L * var3;
               break;
            }

            int var5 = (int)((this.bq * 3261477869149819139L - this.bb * -6156239428887658301L + (long)var2 - 1L) / (long)var2);
            this.bb += (long)var2 * (long)var5 * 4193716940502921195L;
            this.bp.au(var5);
            var1 -= var5;
            this.ba((byte)-16);
         } while(this.bj.ak());
      }

      this.bp.au(var1);
   }

   void bp(int var1, int var2) {
      try {
         for(nx var3 = (nx)this.bp.aw.as(); null != var3; var3 = (nx)this.bp.aw.am()) {
            if (var2 == -1091980265) {
               throw new IllegalStateException();
            }

            if (var1 >= 0) {
               if (var2 == -1091980265) {
                  throw new IllegalStateException();
               }

               if (31873403 * var3.ap != var1) {
                  continue;
               }
            }

            if (-1980728553 * var3.ar < 0) {
               if (var2 == -1091980265) {
                  throw new IllegalStateException();
               }

               this.ah[31873403 * var3.ap][var3.ay * 986016383] = null;
               var3.ar = 0;
            }
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "mn.bp(" + ')');
      }
   }

   void du(int var1, int var2, int var3) {
      nx var4 = this.ah[var1][var2];
      if (var4 != null) {
         this.ah[var1][var2] = null;
         if (0 != (this.ac[var1] & 2)) {
            for(nx var5 = (nx)this.bp.aw.as(); var5 != null; var5 = (nx)this.bp.aw.am()) {
               if (31873403 * var5.ap == var4.ap * 31873403 && var5.ar * -1980728553 < 0 && var5 != var4) {
                  var4.ar = 0;
                  break;
               }
            }
         } else {
            var4.ar = 0;
         }

      }
   }

   void dk(int var1, int var2, int var3) {
      nx var4 = this.ah[var1][var2];
      if (var4 != null) {
         this.ah[var1][var2] = null;
         if (0 != (this.ac[var1] & 2)) {
            for(nx var5 = (nx)this.bp.aw.as(); var5 != null; var5 = (nx)this.bp.aw.am()) {
               if (-379607295 * var5.ap == var4.ap * -1632370095 && var5.ar * 1158203618 < 0 && var5 != var4) {
                  var4.ar = 0;
                  break;
               }
            }
         } else {
            var4.ar = 0;
         }

      }
   }

   public void cz() {
      synchronized(this.bz) {
         for(np var2 = (np)this.ap.aj(); var2 != null; var2 = (np)this.ap.ai()) {
            var2.kf();
         }

      }
   }

   void dx(int var1, int var2) {
   }

   void dt(int var1, int var2, int var3) {
   }

   void ag(int var1, int var2, int var3) {
      try {
         if (this.ae[var1] != var2) {
            if (var3 >= -1158911195) {
               throw new IllegalStateException();
            }

            this.ae[var1] = var2;

            for(int var4 = 0; var4 < 128; ++var4) {
               if (var3 >= -1158911195) {
                  return;
               }

               this.bh[var1][var4] = null;
            }
         }

      } catch (RuntimeException var5) {
         throw tm.aw(var5, "mn.ag(" + ')');
      }
   }

   protected bg aa() {
      return this.bp;
   }

   public void ct(nv var1, boolean var2) {
      synchronized(this.bz) {
         this.ao(264470652);
         this.bj.ap(var1.aw);
         this.bv = var2;
         this.bb = 0L;
         int var4 = this.bj.aj();

         for(int var5 = 0; var5 < var4; ++var5) {
            this.bj.ai(var5);
            this.bj.ae(var5);
            this.bj.ay(var5);
         }

         this.bx = this.bj.ao() * -1191384473;
         this.bk = 1660854805 * this.bj.ai[1467519319 * this.bx];
         this.bq = this.bj.an(-2049237699 * this.bk) * 3282389020956090795L;
      }
   }

   void ac(nx var1, boolean var2, int var3) {
      try {
         int var5;
         label36: {
            int var4 = var1.ak.aw.length;
            if (var2) {
               if (var3 == -1928010918) {
                  throw new IllegalStateException();
               }

               if (var1.ak.ai) {
                  if (var3 == -1928010918) {
                     throw new IllegalStateException();
                  }

                  int var6 = var4 + var4 - var1.ak.ak;
                  var5 = (int)((long)this.aq[var1.ap * 31873403] * (long)var6 >> 6);
                  var4 <<= 8;
                  if (var5 >= var4) {
                     if (var3 == -1928010918) {
                        throw new IllegalStateException();
                     }

                     var5 = var4 + var4 - 1 - var5;
                     var1.ad.ag(true);
                  }
                  break label36;
               }
            }

            var5 = (int)((long)var4 * (long)this.aq[31873403 * var1.ap] >> 6);
         }

         var1.ad.az(var5);
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "mn.ac(" + ')');
      }
   }

   void dj(int var1) {
      for(nx var2 = (nx)this.bp.aw.as(); var2 != null; var2 = (nx)this.bp.aw.am()) {
         if (var1 < 0 || var2.ap * -1522200740 == var1) {
            if (null != var2.ad) {
               var2.ad.ax(du.ai * 692921161 / 100);
               if (var2.ad.bq()) {
                  this.bp.ak.ap(var2.ad);
               }

               var2.ap(-1785762908);
            }

            if (1551571859 * var2.ar < 0) {
               this.ah[31873403 * var2.ap][986016383 * var2.ay] = null;
            }

            var2.kf();
         }
      }

   }

   void dp(int var1) {
      for(nx var2 = (nx)this.bp.aw.as(); var2 != null; var2 = (nx)this.bp.aw.am()) {
         if (var1 < 0 || var2.ap * 31873403 == var1) {
            if (null != var2.ad) {
               var2.ad.ax(du.ai * -336955471 / 100);
               if (var2.ad.bq()) {
                  this.bp.ak.ap(var2.ad);
               }

               var2.ap(-1845264436);
            }

            if (-1980728553 * var2.ar < 0) {
               this.ah[31873403 * var2.ap][986016383 * var2.ay] = null;
            }

            var2.kf();
         }
      }

   }

   void av(int var1, int var2, int var3, int var4) {
      try {
         nx var5 = this.ah[var1][var2];
         if (var5 == null) {
            if (var4 != -519596745) {
               throw new IllegalStateException();
            }
         } else {
            this.ah[var1][var2] = null;
            if (0 != (this.ac[var1] & 2)) {
               for(nx var6 = (nx)this.bp.aw.as(); var6 != null; var6 = (nx)this.bp.aw.am()) {
                  if (var4 != -519596745) {
                     throw new IllegalStateException();
                  }

                  if (31873403 * var6.ap == var5.ap * 31873403) {
                     if (var4 != -519596745) {
                        throw new IllegalStateException();
                     }

                     if (var6.ar * -1980728553 < 0) {
                        if (var4 != -519596745) {
                           throw new IllegalStateException();
                        }

                        if (var6 != var5) {
                           var5.ar = 0;
                           break;
                        }
                     }
                  }
               }
            } else {
               var5.ar = 0;
            }

         }
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "mn.av(" + ')');
      }
   }

   void do(int var1) {
      if (var1 >= 0) {
         this.aj[var1] = 12800;
         this.ai[var1] = 8192;
         this.ay[var1] = 16383;
         this.at[var1] = 8192;
         this.au[var1] = 0;
         this.an[var1] = 8192;
         this.br(var1, (byte)-4);
         this.bn(var1, -1561583095);
         this.ac[var1] = 0;
         this.av[var1] = 32767;
         this.ax[var1] = 256;
         this.aq[var1] = 0;
         this.bs(var1, 8192, 1045759360);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.bq(var1, -962318863);
         }

      }
   }

   void dw(int var1) {
      for(nx var2 = (nx)this.bp.aw.as(); null != var2; var2 = (nx)this.bp.aw.am()) {
         if ((var1 < 0 || 31873403 * var2.ap == var1) && -1980728553 * var2.ar < 0) {
            this.ah[31873403 * var2.ap][var2.ay * 986016383] = null;
            var2.ar = 0;
         }
      }

   }

   public void cn() {
      if (null != this.bc) {
         if (by != null) {
            by.set(true);
         }

         by = new AtomicBoolean(false);
         AtomicBoolean var1 = by;
         if (null == br) {
            int var2 = Runtime.getRuntime().availableProcessors();
            br = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new mk(this));
         }

         br.submit(new nf(this, var1));
      }
   }

   void dz(int var1) {
      for(nx var2 = (nx)this.bp.aw.as(); null != var2; var2 = (nx)this.bp.aw.am()) {
         if ((var1 < 0 || 31873403 * var2.ap == var1) && -1980728553 * var2.ar < 0) {
            this.ah[31873403 * var2.ap][var2.ay * 986016383] = null;
            var2.ar = 0;
         }
      }

   }

   void di() {
      this.bb(-1, 193197349);
      this.bq(-1, 54359256);

      int var1;
      for(var1 = 0; var1 < 16; ++var1) {
         this.ae[var1] = this.as[var1];
      }

      for(var1 = 0; var1 < 16; ++var1) {
         this.am[var1] = this.as[var1] & -128;
      }

   }

   void dn() {
      this.bb(-1, -2055923376);
      this.bq(-1, 697062320);

      int var1;
      for(var1 = 0; var1 < 16; ++var1) {
         this.ae[var1] = this.as[var1];
      }

      for(var1 = 0; var1 < 16; ++var1) {
         this.am[var1] = this.as[var1] & -128;
      }

   }

   void eg() {
      this.bb(-1, 746211433);
      this.bq(-1, 246098289);

      int var1;
      for(var1 = 0; var1 < 16; ++var1) {
         this.ae[var1] = this.as[var1];
      }

      for(var1 = 0; var1 < 16; ++var1) {
         this.am[var1] = this.as[var1] & -128;
      }

   }

   void ev() {
      this.bb(-1, -562205979);
      this.bq(-1, -1217441755);

      int var1;
      for(var1 = 0; var1 < 16; ++var1) {
         this.ae[var1] = this.as[var1];
      }

      for(var1 = 0; var1 < 16; ++var1) {
         this.am[var1] = this.as[var1] & -128;
      }

   }

   void eh(int var1) {
      if (0 != (this.ac[var1] & 2)) {
         for(nx var2 = (nx)this.bp.aw.as(); var2 != null; var2 = (nx)this.bp.aw.am()) {
            if (var2.ap * 31873403 == var1 && this.ah[var1][var2.ay * 1359509382] == null && var2.ar * -1649526827 < 0) {
               var2.ar = 0;
            }
         }
      }

   }

   void ez(int var1) {
      if (0 != (this.ac[var1] & 2)) {
         for(nx var2 = (nx)this.bp.aw.as(); var2 != null; var2 = (nx)this.bp.aw.am()) {
            if (var2.ap * 31873403 == var1 && this.ah[var1][var2.ay * 986016383] == null && var2.ar * -1980728553 < 0) {
               var2.ar = 0;
            }
         }
      }

   }

   void ec(int var1) {
      if ((this.ac[var1] & 4) != 0) {
         for(nx var2 = (nx)this.bp.aw.as(); null != var2; var2 = (nx)this.bp.aw.am()) {
            if (var1 == -747189418 * var2.ap) {
               var2.ax = 0;
            }
         }
      }

   }

   boolean ee(nx var1, int[] var2, int var3, int var4) {
      var1.ac = du.ai * -336955471 / 100 * 999135057;
      if (-1980728553 * var1.ar < 0 || var1.ad != null && !var1.ad.bb()) {
         int var5 = 1088488079 * var1.au;
         if (var5 > 0) {
            var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.an[31873403 * var1.ap] * 4.921259842519685E-4D) + 0.5D);
            if (var5 < 0) {
               var5 = 0;
            }

            var1.au = 108256367 * var5;
         }

         var1.ad.aq(this.bm(var1, -504218918));
         mq var6 = var1.aj;
         boolean var7 = false;
         var1.az += 553609365;
         var1.ag += -1209026335 * var6.ae;
         double var8 = (double)((1088488079 * var1.au * var1.at * 1377577087 >> 12) + (var1.ay * 986016383 - 60 << 8)) * 5.086263020833333E-6D;
         if (var6.ak * -45274081 > 0) {
            if (-2113529759 * var6.ay > 0) {
               var1.an += (int)(128.0D * Math.pow(2.0D, var8 * (double)(-2113529759 * var6.ay)) + 0.5D) * 318012697;
            } else {
               var1.an += 2050919552;
            }
         }

         if (var6.ap != null) {
            if (var6.aj * 673344057 > 0) {
               var1.ao += (int)(128.0D * Math.pow(2.0D, var8 * (double)(673344057 * var6.aj)) + 0.5D) * 1470351575;
            } else {
               var1.ao += -773559424;
            }

            while(var1.af * -817688123 < var6.ap.length - 2 && -1191073049 * var1.ao > (var6.ap[2 + var1.af * -817688123] & 255) << 8) {
               var1.af += 1659669018;
            }

            if (var6.ap.length - 2 == var1.af * -817688123 && var6.ap[var1.af * -817688123 + 1] == 0) {
               var7 = true;
            }
         }

         if (var1.ar * -1980728553 >= 0 && null != var6.aw && (this.ac[var1.ap * 31873403] & 1) == 0 && (var1.ai * -1553842313 < 0 || var1 != this.bh[var1.ap * 31873403][var1.ai * -1553842313])) {
            if (1450993153 * var6.ai > 0) {
               var1.ar += (int)(128.0D * Math.pow(2.0D, var8 * (double)(1450993153 * var6.ai)) + 0.5D) * 681471143;
            } else {
               var1.ar += 1328960384;
            }

            while(-1510705435 * var1.ab < var6.aw.length - 2 && -1980728553 * var1.ar > (var6.aw[-1510705435 * var1.ab + 2] & 255) << 8) {
               var1.ab += 1911729626;
            }

            if (var6.aw.length - 2 == -1510705435 * var1.ab) {
               var7 = true;
            }
         }

         if (var7) {
            var1.ad.ax(var1.ac * -1548873295);
            if (var2 != null) {
               var1.ad.am(var2, var3, var4);
            } else {
               var1.ad.au(var4);
            }

            if (var1.ad.bq()) {
               this.bp.ak.ap(var1.ad);
            }

            var1.ap(-2125687306);
            if (var1.ar * -1980728553 >= 0) {
               var1.kf();
               if (-1553842313 * var1.ai > 0 && this.bh[var1.ap * 31873403][-1553842313 * var1.ai] == var1) {
                  this.bh[var1.ap * 31873403][-1553842313 * var1.ai] = null;
               }
            }

            return true;
         } else {
            var1.ad.av(var1.ac * -1548873295, this.bo(var1, 24865926), this.bd(var1, 718297750));
            return false;
         }
      } else {
         var1.ap(-1810060414);
         var1.kf();
         if (var1.ai * -1553842313 > 0 && this.bh[var1.ap * 31873403][-1553842313 * var1.ai] == var1) {
            this.bh[31873403 * var1.ap][-1553842313 * var1.ai] = null;
         }

         return true;
      }
   }

   void er(int var1) {
      if ((this.ac[var1] & 4) != 0) {
         for(nx var2 = (nx)this.bp.aw.as(); null != var2; var2 = (nx)this.bp.aw.am()) {
            if (var1 == 31873403 * var2.ap) {
               var2.ax = 0;
            }
         }
      }

   }

   public void cs(int var1, int var2) {
      synchronized(this.bz) {
         this.az(var1, var2, -1898445767);
      }
   }

   void df(nx var1, boolean var2) {
      int var3 = var1.ak.aw.length;
      int var4;
      if (var2 && var1.ak.ai) {
         int var5 = var3 + var3 - var1.ak.ak;
         var4 = (int)((long)this.aq[var1.ap * 794045542] * (long)var5 >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.ad.ag(true);
         }
      } else {
         var4 = (int)((long)var3 * (long)this.aq[-71004136 * var1.ap] >> 6);
      }

      var1.ad.az(var4);
   }

   void em(int var1, int var2) {
      this.al[var1] = var2;
      this.aa[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
   }

   void el(int var1, int var2) {
      this.al[var1] = var2;
      this.aa[var1] = (int)(2097152.0D * Math.pow(2.0D, 5.4931640625E-4D * (double)var2) + 0.5D);
   }

   public void ao(int var1) {
      try {
         synchronized(this.bz) {
            this.bj.aw();
            this.by(-1630565182);
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "mn.ao(" + ')');
      }
   }

   void dr(nx var1, boolean var2) {
      int var3 = var1.ak.aw.length;
      int var4;
      if (var2 && var1.ak.ai) {
         int var5 = var3 + var3 - var1.ak.ak;
         var4 = (int)((long)this.aq[var1.ap * 313328430] * (long)var5 >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.ad.ag(true);
         }
      } else {
         var4 = (int)((long)var3 * (long)this.aq[31873403 * var1.ap] >> 6);
      }

      var1.ad.az(var4);
   }

   void al(int var1, int var2, int var3) {
      try {
         this.at[var1] = var2;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "mn.al(" + ')');
      }
   }

   public void cc(nv var1, boolean var2) {
      synchronized(this.bz) {
         this.ao(272460983);
         this.bj.ap(var1.aw);
         this.bv = var2;
         this.bb = 0L;
         int var4 = this.bj.aj();

         for(int var5 = 0; var5 < var4; ++var5) {
            this.bj.ai(var5);
            this.bj.ae(var5);
            this.bj.ay(var5);
         }

         this.bx = this.bj.ao() * -1191384473;
         this.bk = 1660854805 * this.bj.ai[1467519319 * this.bx];
         this.bq = this.bj.an(-2049237699 * this.bk) * 3282389020956090795L;
      }
   }

   int ei(nx var1) {
      int var2 = this.ai[var1.ap * 1632440475];
      return var2 < 8192 ? 32 + var1.ae * 2058515463 * var2 >> 6 : 16384 - (32 + (16384 - var2) * (1043748350 - 1952586833 * var1.ae) >> 6);
   }

   int ew(nx var1) {
      int var2 = this.ai[var1.ap * 31873403];
      return var2 < -1231490699 ? -1526706689 + var1.ae * -1647928036 * var2 >> 6 : 1987330580 - (-752769781 + (-1478262257 - var2) * (128 - 1952586833 * var1.ae) >> 6);
   }

   protected bg as() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "mn.as(" + ')');
      }
   }

   void eq() {
      int var1 = this.bx * 1467519319;
      int var2 = -2049237699 * this.bk;

      long var3;
      for(var3 = this.bq * 3261477869149819139L; -1251519195 * this.bk == var2; var3 = this.bj.an(var2)) {
         while(var2 == this.bj.ai[var1]) {
            this.bj.ai(var1);
            int var5 = this.bj.am(var1);
            if (1 == var5) {
               this.bj.as();
               this.bj.ay(var1);
               if (this.bj.af()) {
                  if (!this.bv || 0 == var2) {
                     this.by(-1231547758);
                     this.bj.aw();
                     return;
                  }

                  this.bj.ar(var3);
               }
               break;
            }

            if ((var5 & -1043821220) != 0) {
               this.bu(var5, -268078063);
            }

            this.bj.ae(var1);
            this.bj.ay(var1);
         }

         var1 = this.bj.ao();
         var2 = this.bj.ai[var1];
      }

      this.bx = var1 * -1191384473;
      this.bk = var2 * 1373345738;
      this.bq = 3282389020956090795L * var3;
   }

   void eb() {
      int var1 = this.bx * 1467519319;
      int var2 = -2049237699 * this.bk;

      long var3;
      for(var3 = this.bq * 3261477869149819139L; -2049237699 * this.bk == var2; var3 = this.bj.an(var2)) {
         while(var2 == this.bj.ai[var1]) {
            this.bj.ai(var1);
            int var5 = this.bj.am(var1);
            if (1 == var5) {
               this.bj.as();
               this.bj.ay(var1);
               if (this.bj.af()) {
                  if (!this.bv || 0 == var2) {
                     this.by(1410796915);
                     this.bj.aw();
                     return;
                  }

                  this.bj.ar(var3);
               }
               break;
            }

            if ((var5 & 128) != 0) {
               this.bu(var5, 1120136559);
            }

            this.bj.ae(var1);
            this.bj.ay(var1);
         }

         var1 = this.bj.ao();
         var2 = this.bj.ai[var1];
      }

      this.bx = var1 * -1191384473;
      this.bk = var2 * 1660854805;
      this.bq = 3282389020956090795L * var3;
   }

   boolean es(nx var1) {
      if (var1.ad == null) {
         if (1941824245 * var1.ar >= 0) {
            var1.kf();
            if (-28914082 * var1.ai > 0 && this.bh[var1.ap * 856891749][-1229779231 * var1.ai] == var1) {
               this.bh[31873403 * var1.ap][1953315546 * var1.ai] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   boolean eo(nx var1, int[] var2, int var3, int var4) {
      var1.ac = du.ai * -336955471 / 100 * 999135057;
      if (-1980728553 * var1.ar < 0 || var1.ad != null && !var1.ad.bb()) {
         int var5 = 1088488079 * var1.au;
         if (var5 > 0) {
            var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.an[31873403 * var1.ap] * 4.921259842519685E-4D) + 0.5D);
            if (var5 < 0) {
               var5 = 0;
            }

            var1.au = 108256367 * var5;
         }

         var1.ad.aq(this.bm(var1, 742061911));
         mq var6 = var1.aj;
         boolean var7 = false;
         var1.az += 553609365;
         var1.ag += -1209026335 * var6.ae;
         double var8 = (double)((1088488079 * var1.au * var1.at * 1377577087 >> 12) + (var1.ay * 986016383 - 60 << 8)) * 5.086263020833333E-6D;
         if (var6.ak * -45274081 > 0) {
            if (-2113529759 * var6.ay > 0) {
               var1.an += (int)(128.0D * Math.pow(2.0D, var8 * (double)(-2113529759 * var6.ay)) + 0.5D) * 318012697;
            } else {
               var1.an += 2050919552;
            }
         }

         if (var6.ap != null) {
            if (var6.aj * 673344057 > 0) {
               var1.ao += (int)(128.0D * Math.pow(2.0D, var8 * (double)(673344057 * var6.aj)) + 0.5D) * 1470351575;
            } else {
               var1.ao += -773559424;
            }

            while(var1.af * -817688123 < var6.ap.length - 2 && -1191073049 * var1.ao > (var6.ap[2 + var1.af * -817688123] & 255) << 8) {
               var1.af += 1659669018;
            }

            if (var6.ap.length - 2 == var1.af * -817688123 && var6.ap[var1.af * -817688123 + 1] == 0) {
               var7 = true;
            }
         }

         if (var1.ar * -1980728553 >= 0 && null != var6.aw && (this.ac[var1.ap * 31873403] & 1) == 0 && (var1.ai * -1553842313 < 0 || var1 != this.bh[var1.ap * 31873403][var1.ai * -1553842313])) {
            if (1450993153 * var6.ai > 0) {
               var1.ar += (int)(128.0D * Math.pow(2.0D, var8 * (double)(1450993153 * var6.ai)) + 0.5D) * 681471143;
            } else {
               var1.ar += 1328960384;
            }

            while(-1510705435 * var1.ab < var6.aw.length - 2 && -1980728553 * var1.ar > (var6.aw[-1510705435 * var1.ab + 2] & 255) << 8) {
               var1.ab += 1911729626;
            }

            if (var6.aw.length - 2 == -1510705435 * var1.ab) {
               var7 = true;
            }
         }

         if (var7) {
            var1.ad.ax(var1.ac * -1548873295);
            if (var2 != null) {
               var1.ad.am(var2, var3, var4);
            } else {
               var1.ad.au(var4);
            }

            if (var1.ad.bq()) {
               this.bp.ak.ap(var1.ad);
            }

            var1.ap(-1933195755);
            if (var1.ar * -1980728553 >= 0) {
               var1.kf();
               if (-1553842313 * var1.ai > 0 && this.bh[var1.ap * 31873403][-1553842313 * var1.ai] == var1) {
                  this.bh[var1.ap * 31873403][-1553842313 * var1.ai] = null;
               }
            }

            return true;
         } else {
            var1.ad.av(var1.ac * -1548873295, this.bo(var1, 24865926), this.bd(var1, 727865906));
            return false;
         }
      } else {
         var1.ap(-1905073527);
         var1.kf();
         if (var1.ai * -1553842313 > 0 && this.bh[var1.ap * 31873403][-1553842313 * var1.ai] == var1) {
            this.bh[31873403 * var1.ap][-1553842313 * var1.ai] = null;
         }

         return true;
      }
   }

   void az(int var1, int var2, int var3) {
      try {
         this.as[var1] = var2;
         this.am[var1] = var2 & -128;
         this.ag(var1, var2, -1475650366);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "mn.az(" + ')');
      }
   }

   boolean ea(nx var1, int[] var2, int var3, int var4) {
      var1.ac = du.ai * -336955471 / 100 * 999135057;
      if (-1980728553 * var1.ar < 0 || var1.ad != null && !var1.ad.bb()) {
         int var5 = 1088488079 * var1.au;
         if (var5 > 0) {
            var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.an[31873403 * var1.ap] * 4.921259842519685E-4D) + 0.5D);
            if (var5 < 0) {
               var5 = 0;
            }

            var1.au = 108256367 * var5;
         }

         var1.ad.aq(this.bm(var1, -1104386314));
         mq var6 = var1.aj;
         boolean var7 = false;
         var1.az += 553609365;
         var1.ag += -1209026335 * var6.ae;
         double var8 = (double)((1088488079 * var1.au * var1.at * 1377577087 >> 12) + (var1.ay * 986016383 - 60 << 8)) * 5.086263020833333E-6D;
         if (var6.ak * -45274081 > 0) {
            if (-2113529759 * var6.ay > 0) {
               var1.an += (int)(128.0D * Math.pow(2.0D, var8 * (double)(-2113529759 * var6.ay)) + 0.5D) * 318012697;
            } else {
               var1.an += 2050919552;
            }
         }

         if (var6.ap != null) {
            if (var6.aj * 673344057 > 0) {
               var1.ao += (int)(128.0D * Math.pow(2.0D, var8 * (double)(673344057 * var6.aj)) + 0.5D) * 1470351575;
            } else {
               var1.ao += -773559424;
            }

            while(var1.af * -817688123 < var6.ap.length - 2 && -1191073049 * var1.ao > (var6.ap[2 + var1.af * -817688123] & 255) << 8) {
               var1.af += 1659669018;
            }

            if (var6.ap.length - 2 == var1.af * -817688123 && var6.ap[var1.af * -817688123 + 1] == 0) {
               var7 = true;
            }
         }

         if (var1.ar * -1980728553 >= 0 && null != var6.aw && (this.ac[var1.ap * 31873403] & 1) == 0 && (var1.ai * -1553842313 < 0 || var1 != this.bh[var1.ap * 31873403][var1.ai * -1553842313])) {
            if (1450993153 * var6.ai > 0) {
               var1.ar += (int)(128.0D * Math.pow(2.0D, var8 * (double)(1450993153 * var6.ai)) + 0.5D) * 681471143;
            } else {
               var1.ar += 1328960384;
            }

            while(-1510705435 * var1.ab < var6.aw.length - 2 && -1980728553 * var1.ar > (var6.aw[-1510705435 * var1.ab + 2] & 255) << 8) {
               var1.ab += 1911729626;
            }

            if (var6.aw.length - 2 == -1510705435 * var1.ab) {
               var7 = true;
            }
         }

         if (var7) {
            var1.ad.ax(var1.ac * -1548873295);
            if (var2 != null) {
               var1.ad.am(var2, var3, var4);
            } else {
               var1.ad.au(var4);
            }

            if (var1.ad.bq()) {
               this.bp.ak.ap(var1.ad);
            }

            var1.ap(-2126206370);
            if (var1.ar * -1980728553 >= 0) {
               var1.kf();
               if (-1553842313 * var1.ai > 0 && this.bh[var1.ap * 31873403][-1553842313 * var1.ai] == var1) {
                  this.bh[var1.ap * 31873403][-1553842313 * var1.ai] = null;
               }
            }

            return true;
         } else {
            var1.ad.av(var1.ac * -1548873295, this.bo(var1, 24865926), this.bd(var1, 767811509));
            return false;
         }
      } else {
         var1.ap(-1757557456);
         var1.kf();
         if (var1.ai * -1553842313 > 0 && this.bh[var1.ap * 31873403][-1553842313 * var1.ai] == var1) {
            this.bh[31873403 * var1.ap][-1553842313 * var1.ai] = null;
         }

         return true;
      }
   }

   static void kd(ev var0, int var1) {
      try {
         var0.bp = 414050137 * var0.ap.ae;
         var0.dw = -1815365891 * var0.ap.br;
         var0.bn = 398704121 * var0.ap.af;
         var0.bu = 1765735787 * var0.ap.ar;
         var0.bt = 921479639 * var0.ap.ab;
         var0.bs = 1212253211 * var0.ap.az;
         var0.bc = var0.ap.au * -73376629;
         var0.by = 828511971 * var0.ap.an;
         var0.br = var0.ap.ao * 880776893;
         var0.bm = 206223373 * var0.ap.ag;
         var0.bo = var0.ap.ad * 1100745463;
         var0.bd = -1461802859 * var0.ap.ac;
         var0.ba = var0.ap.av * 1552600345;
         var0.bw = var0.ap.ax * -1178874693;
         var0.bi = 1341788925 * var0.ap.aq;
         var0.bf = -148634429 * var0.ap.al;
         var0.bg = var0.ap.aa * -1724845741;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "mn.kd(" + ')');
      }
   }
}
