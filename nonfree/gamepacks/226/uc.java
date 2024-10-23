import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class uc {
   static final us au;
   boolean be = false;
   static final float aj = 30.0F;
   lu ac;
   pe as;
   int bu = 376539793;
   pe am;
   static final us at;
   int bc = 239064697;
   static final us an;
   qi ao;
   public boolean cl = false;
   HashSet co = new HashSet();
   HashMap ab;
   kp az;
   kp ag;
   kp ad;
   int cy = 1447208069;
   HashMap af;
   int bb = 1628104785;
   int aq;
   int al = -987156127;
   boolean bd = true;
   float ah;
   float bh;
   int bj = 963453543;
   int aa = -1852671241;
   int bx = 964271037;
   vc[] ar;
   pe ae;
   int bq = 316969382;
   boolean bp = false;
   int bm;
   int by = 1365494677;
   HashSet bi = new HashSet();
   int br = -980739537;
   int bn = -1035378323;
   int bk = 690636601;
   int bt = 661611049;
   long bs;
   int bv = 651931339;
   HashSet bz = null;
   static final int ap = -65536;
   int bo;
   HashSet bf = new HashSet();
   HashSet bg = new HashSet();
   HashSet bl = new HashSet();
   static final int ak = 8;
   int cq = 0;
   final int[] cd = new int[]{1008, 1009, 1010, 1011, 1012};
   List ci;
   Iterator cn;
   int ax;
   nn cf = null;
   ub av;
   vv cp;
   int cv;
   static final int ai = 3;
   int cu = 517400203;
   int ce = 329795565;

   void eh(int var1, int var2, int var3) {
      if (this.ag != null) {
         int[] var4 = this.ag.ai(var1, var2, var3, 1526083161);
         if (null == var4) {
            var4 = this.ag.ai(this.ag.ac(-1214155751), this.ag.ad(-1186544128), this.ag.av(637831648), 1024588295);
         }

         this.ae(var4[0] - this.ag.ar((byte)30) * 627879973, var4[1] - this.ag.az((byte)0) * 64, true, -354899672);
         this.al = 59998679;
         this.aa = 835119889;
         this.ah = this.bh(this.ag.af(572659866), 662832897);
         this.bh = this.ah;
         this.ci = null;
         this.cn = null;
         this.ac.aw((byte)14);
      }
   }

   public void ap(pe var1, pe var2, pe var3, qi var4, HashMap var5, vc[] var6, int var7) {
      try {
         this.ar = var6;
         this.as = var1;
         this.ae = var2;
         this.am = var3;
         this.ao = var4;
         this.af = new HashMap();
         this.af.put(kv.ap, var5.get(at));
         this.af.put(kv.aw, var5.get(au));
         this.af.put(kv.ak, var5.get(an));
         this.av = new ub(var1);
         int var8 = this.as.cf(lc.ap.ay, (byte)87);
         int[] var9 = this.as.be(var8, 1355733526);
         int var10000;
         if (var9 == null) {
            if (var7 != 459258047) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = var9.length;
         }

         int var10 = var10000;
         this.ab = new HashMap(var10);

         for(int var11 = 0; var11 < var10; ++var11) {
            if (var7 != 459258047) {
               throw new IllegalStateException();
            }

            vl var12 = new vl(this.as.bm(var8, var9[var11], 1223117934));
            kp var13 = new kp();
            var13.ap(var12, var9[var11], 1088777293);
            this.ab.put(var13.at(350373346), var13);
            if (var13.am(1377577087)) {
               if (var7 != 459258047) {
                  throw new IllegalStateException();
               }

               this.az = var13;
            }
         }

         this.ab(this.az, (byte)61);
         this.ad = null;
      } catch (RuntimeException var14) {
         throw tm.aw(var14, "uc.ap(" + ')');
      }
   }

   public void aw(int var1) {
      try {
         eq.ak((byte)-26);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "uc.aw(" + ')');
      }
   }

   public void ak(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         if (!this.av.ak(1573407849)) {
            if (var8 == -1488836266) {
               throw new IllegalStateException();
            }
         } else {
            this.ay(-1073103093);
            this.as((byte)7);
            if (!var3) {
               if (var8 == -1488836266) {
                  throw new IllegalStateException();
               }
            } else {
               int var9 = (int)Math.ceil((double)((float)var6 / this.ah));
               int var10 = (int)Math.ceil((double)((float)var7 / this.ah));
               List var11 = this.ac.ay(-300773559 * this.ax - var9 / 2 - 1, this.aq * -506005999 - var10 / 2 - 1, 1 + var9 / 2 + this.ax * -300773559, this.aq * -506005999 + var10 / 2 + 1, var4, var5, var6, var7, var1, var2, -1830301298);
               HashSet var12 = new HashSet();

               Iterator var13;
               lx var14;
               dt var15;
               lj var16;
               for(var13 = var11.iterator(); var13.hasNext(); sr.ap(var15, -1980084734)) {
                  if (var8 == -1488836266) {
                     throw new IllegalStateException();
                  }

                  var14 = (lx)var13.next();
                  var12.add(var14);
                  var15 = new dt();
                  var16 = new lj(var14.aw(-755905144), var14.ae, var14.as);
                  var15.ap(new Object[]{var16, var1, var2}, 1334767346);
                  if (this.co.contains(var14)) {
                     if (var8 == -1488836266) {
                        throw new IllegalStateException();
                     }

                     var15.aw(17, (short)156);
                  } else {
                     var15.aw(15, (short)156);
                  }
               }

               var13 = this.co.iterator();

               while(var13.hasNext()) {
                  if (var8 == -1488836266) {
                     return;
                  }

                  var14 = (lx)var13.next();
                  if (!var12.contains(var14)) {
                     if (var8 == -1488836266) {
                        throw new IllegalStateException();
                     }

                     var15 = new dt();
                     var16 = new lj(var14.aw(2144664020), var14.ae, var14.as);
                     var15.ap(new Object[]{var16, var1, var2}, 1334767346);
                     var15.aw(16, (short)156);
                     sr.ap(var15, -864603099);
                  }
               }

               this.co = var12;
            }
         }
      } catch (RuntimeException var17) {
         throw tm.aw(var17, "uc.ak(" + ')');
      }
   }

   public void aj(int var1, int var2, boolean var3, boolean var4, int var5) {
      try {
         long var6;
         label73: {
            var6 = ck.ap(-1665967183);
            this.ai(var1, var2, var4, var6);
            if (!this.at(-1317141855)) {
               label77: {
                  if (var5 != -1971373809) {
                     throw new IllegalStateException();
                  }

                  if (!var4) {
                     if (var5 != -1971373809) {
                        throw new IllegalStateException();
                     }

                     if (!var3) {
                        break label77;
                     }

                     if (var5 != -1971373809) {
                        return;
                     }
                  }

                  boolean var10000;
                  if (null != client.pr) {
                     if (var5 != -1971373809) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  boolean var8 = var10000;
                  if (!var8) {
                     if (var5 != -1971373809) {
                        throw new IllegalStateException();
                     }

                     if (var4) {
                        if (var5 != -1971373809) {
                           throw new IllegalStateException();
                        }

                        this.bu = -376539793 * var1;
                        this.bt = var2 * -661611049;
                        this.br = 1852262297 * this.ax;
                        this.bn = 1466157507 * this.aq;
                     }

                     if (-1 != this.br * -1436970191) {
                        if (var5 != -1971373809) {
                           throw new IllegalStateException();
                        }

                        int var9 = var1 - this.bu * -89355889;
                        int var10 = var2 - 162178535 * this.bt;
                        this.ae(this.br * -1436970191 - (int)((float)var9 / this.bh), (int)((float)var10 / this.bh) + 1762340763 * this.bn, false, 104985008);
                     }
                     break label73;
                  }
               }
            }

            this.am(-2122351263);
         }

         if (var4) {
            if (var5 != -1971373809) {
               throw new IllegalStateException();
            }

            this.bs = var6 * -2883017199262852471L;
            this.bm = -1565270123 * var1;
            this.bo = -267480131 * var2;
         }

      } catch (RuntimeException var11) {
         throw tm.aw(var11, "uc.aj(" + ')');
      }
   }

   void ai(int var1, int var2, boolean var3, long var4) {
      try {
         if (this.ag != null) {
            int var6 = (int)((float)(-300773559 * this.ax) + ((float)(var1 - -1603925909 * this.bx) - (float)this.bn(-700346661) * this.ah / 2.0F) / this.ah);
            int var7 = (int)((float)(this.aq * -506005999) - ((float)(var2 - -1906865929 * this.bk) - (float)this.bu(1570471484) * this.ah / 2.0F) / this.ah);
            this.cf = this.ag.ay(var6 + this.ag.ar((byte)-29) * 64, var7 + this.ag.az((byte)0) * 64, -1903232127);
            if (this.cf != null && var3) {
               kr var8 = client.se;
               int var11;
               int var12;
               if (fp.ot(-1126245751) && var8.ag(82, 406853068) && var8.ag(81, -688573055)) {
                  int var15 = 1601399073 * this.cf.aw;
                  var11 = this.cf.ak * -1982010185;
                  var12 = this.cf.ap * 117039165;
                  me var13 = ef.ap(mm.dx, client.in.ai, (byte)80);
                  var13.ak.db(var12, (byte)-3);
                  var13.ak.ep(0, -1564682090);
                  var13.ak.dz(var11, -674146829);
                  var13.ak.dz(var15, -65718235);
                  client.in.ak(var13, (short)486);
               } else {
                  boolean var10 = true;
                  if (this.bd) {
                     var11 = var1 - this.bm * -1548454979;
                     var12 = var2 - 1410514837 * this.bo;
                     if (var4 - this.bs * 8565669029377014713L > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
                        var10 = false;
                     }
                  }

                  if (var10) {
                     me var16 = ef.ap(mm.bf, client.in.ai, (byte)25);
                     var16.ak.ex(this.cf.aw(-1936192270), -1695518849);
                     client.in.ak(var16, (short)486);
                     this.bs = 0L;
                  }
               }
            }
         } else {
            this.cf = null;
         }

      } catch (RuntimeException var14) {
         throw tm.aw(var14, "uc.ai(" + ')');
      }
   }

   public int ee() {
      if ((double)this.bh == 1.0D) {
         return 25;
      } else if (1.5D == (double)this.bh) {
         return 37;
      } else if ((double)this.bh == 2.0D) {
         return 50;
      } else if ((double)this.bh == 3.0D) {
         return 75;
      } else {
         return (double)this.bh == 4.0D ? 100 : -803048809;
      }
   }

   public void cz(int var1, int var2, boolean var3, boolean var4) {
      long var5;
      label42: {
         var5 = ck.ap(-1220164445);
         this.ai(var1, var2, var4, var5);
         if (!this.at(-958475555) && (var4 || var3)) {
            boolean var7 = null != client.pr;
            if (!var7) {
               if (var4) {
                  this.bu = -376539793 * var1;
                  this.bt = var2 * -661611049;
                  this.br = 774983893 * this.ax;
                  this.bn = -371085882 * this.aq;
               }

               if (-1 != this.br * -1436970191) {
                  int var8 = var1 - this.bu * -311332850;
                  int var9 = var2 - 162178535 * this.bt;
                  this.ae(this.br * 423482046 - (int)((float)var8 / this.bh), (int)((float)var9 / this.bh) + 1762340763 * this.bn, false, 1688790075);
               }
               break label42;
            }
         }

         this.am(-2035788452);
      }

      if (var4) {
         this.bs = var5 * -2883017199262852471L;
         this.bm = -1565270123 * var1;
         this.bo = -1774612891 * var2;
      }

   }

   final void ae(int var1, int var2, boolean var3, int var4) {
      try {
         this.ax = -379350279 * var1;
         this.aq = 372947697 * var2;
         ck.ap(-654010123);
         if (var3) {
            if (var4 <= -1069078946) {
               return;
            }

            this.am(92305365);
         }

      } catch (RuntimeException var5) {
         throw tm.aw(var5, "uc.ae(" + ')');
      }
   }

   final void am(int var1) {
      try {
         this.bt = 661611049;
         this.bu = 376539793;
         this.bn = -1035378323;
         this.br = -980739537;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "uc.am(" + ')');
      }
   }

   boolean at(int var1) {
      try {
         return -1 != this.al * 749522271 && this.aa * -1241278151 != -1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "uc.at(" + ')');
      }
   }

   public kp au(int var1, int var2, int var3, byte var4) {
      try {
         Iterator var5 = this.ab.values().iterator();

         kp var6;
         do {
            if (!var5.hasNext()) {
               return null;
            }

            if (var4 <= 0) {
               throw new IllegalStateException();
            }

            var6 = (kp)var5.next();
         } while(!var6.ak(var1, var2, var3, 6337596));

         if (var4 <= 0) {
            throw new IllegalStateException();
         } else {
            return var6;
         }
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "uc.au(" + ')');
      }
   }

   public nn hk(int var1, nn var2) {
      if (!this.av.ak(-76476217)) {
         return null;
      } else if (!this.ac.ae(1884518704)) {
         return null;
      } else if (!this.ag.aj(1601399073 * var2.aw, var2.ak * -1982010185, (byte)62)) {
         return null;
      } else {
         HashMap var3 = this.ac.at(1799326081);
         List var4 = (List)var3.get(var1);
         if (var4 != null && !var4.isEmpty()) {
            lx var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();

            while(true) {
               lx var8;
               int var11;
               do {
                  if (!var7.hasNext()) {
                     return var5.as;
                  }

                  var8 = (lx)var7.next();
                  int var9 = var8.as.aw * 1601399073 - 1601399073 * var2.aw;
                  int var10 = -1982010185 * var8.as.ak - -1982010185 * var2.ak;
                  var11 = var9 * var9 + var10 * var10;
                  if (var11 == 0) {
                     return var8.as;
                  }
               } while(var11 >= var6 && null != var5);

               var5 = var8;
               var6 = var11;
            }
         } else {
            return null;
         }
      }
   }

   public void gr() {
      this.bz = null;
   }

   public void ao(int var1, int var2) {
      try {
         kp var3 = this.bk(var1, -1467408401);
         if (var3 != null) {
            if (var2 >= 1288505953) {
               throw new IllegalStateException();
            }

            this.ab(var3, (byte)10);
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "uc.ao(" + ')');
      }
   }

   void as(byte var1) {
      try {
         if (!this.at(1285881483)) {
            if (var1 != 7) {
               throw new IllegalStateException();
            }
         } else {
            int var2 = 749522271 * this.al - -300773559 * this.ax;
            int var3 = -1241278151 * this.aa - this.aq * -506005999;
            if (0 != var2) {
               var2 /= Math.min(8, Math.abs(var2));
            }

            if (0 != var3) {
               if (var1 != 7) {
                  return;
               }

               var3 /= Math.min(8, Math.abs(var3));
            }

            this.ae(var2 + -300773559 * this.ax, -506005999 * this.aq + var3, true, -15666176);
            if (749522271 * this.al == this.ax * -300773559) {
               if (var1 != 7) {
                  throw new IllegalStateException();
               }

               if (this.aa * -1241278151 == -506005999 * this.aq) {
                  if (var1 != 7) {
                     return;
                  }

                  this.al = -987156127;
                  this.aa = -1852671241;
               }
            }

         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "uc.as(" + ')');
      }
   }

   public boolean cq(int var1, int var2) {
      try {
         boolean var10000;
         if (!this.bi.contains(var1)) {
            if (var2 <= 28972096) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "uc.cq(" + ')');
      }
   }

   void az(kp var1, byte var2) {
      try {
         this.ag = var1;
         this.ac = new lu(this.ar, this.af, this.ae, this.am);
         this.av.ap(this.ag == null ? null : this.ag.at(-676041639), 1887957461);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "uc.az(" + ')');
      }
   }

   public void ag(kp var1, nn var2, nn var3, boolean var4, byte var5) {
      try {
         if (null == var1) {
            if (var5 >= 0) {
               throw new IllegalStateException();
            }
         } else {
            label43: {
               if (null != this.ag) {
                  if (var5 >= 0) {
                     return;
                  }

                  if (this.ag == var1) {
                     break label43;
                  }

                  if (var5 >= 0) {
                     throw new IllegalStateException();
                  }
               }

               this.az(var1, (byte)14);
            }

            if (!var4) {
               if (this.ag.ak(var2.ap * 117039165, 1601399073 * var2.aw, var2.ak * -1982010185, -60541147)) {
                  this.ad(var2.ap * 117039165, 1601399073 * var2.aw, -1982010185 * var2.ak, 496791359);
                  return;
               }

               if (var5 >= 0) {
                  throw new IllegalStateException();
               }
            }

            this.ad(var3.ap * 117039165, var3.aw * 1601399073, var3.ak * -1982010185, -1332258188);
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "uc.ag(" + ')');
      }
   }

   public void gb() {
      this.bq = -2105748424;
   }

   public void ac(int var1, int var2, int var3, int var4, int var5, double var6) {
      try {
         int[] var8 = new int[4];
         vz.ez(var8);
         vz.ev(var1, var2, var1 + var3, var4 + var2);
         int var9 = this.av.aj(1817186387);
         if (var9 < 100) {
            this.ah(var1, var2, var3, var4, var9, (byte)7);
         } else {
            if (!this.ac.ae(-248632752)) {
               this.ac.ap(this.as, this.ag.at(-765906452), client.cf, -1267510795);
               if (!this.ac.ae(-1778949136)) {
                  return;
               }
            }

            int var10 = hf.ap(this.ac.am(-682097871), var6);
            vz.ef(var1, var2, var3, var4, var10);
            if (null != this.bz) {
               this.by += -1365494677;
               if (0 == 464312387 * this.by % (-488849437 * this.bq)) {
                  this.by = 0;
                  this.bc += -239064697;
               }

               if (507857975 * this.bc >= this.bb * 74850835 && !this.bp) {
                  this.bz = null;
               }
            }

            int var11 = (int)Math.ceil((double)((float)var3 / this.ah));
            int var12 = (int)Math.ceil((double)((float)var4 / this.ah));
            double var13 = jm.ay();
            this.ac.ak(this.ax * -300773559 - var11 / 2, this.aq * -506005999 - var12 / 2, this.ax * -300773559 + var11 / 2, var12 / 2 + this.aq * -506005999, var1, var2, var1 + var3, var4 + var2, -2002832664);
            if (!this.be) {
               boolean var15 = false;
               if (var5 - 33633383 * this.cq > 100) {
                  this.cq = 861448023 * var5;
                  var15 = true;
               }

               this.ac.aj(this.ax * -300773559 - var11 / 2, this.aq * -506005999 - var12 / 2, var11 / 2 + -300773559 * this.ax, -506005999 * this.aq + var12 / 2, var1, var2, var3 + var1, var4 + var2, this.bl, this.bz, 464312387 * this.by, this.bq * -488849437, var15, (byte)81);
            }

            this.aq(var1, var2, var3, var4, var11, var12, -51593668);
            if (fp.ot(-1193737944) && this.cl && null != this.cf) {
               this.ao.ab("Coord: " + this.cf, 10 + vz.bk, vz.bv + 20, 16776960, -1);
            }

            this.bj = var11 * -963453543;
            this.bv = var12 * -651931339;
            this.bx = var1 * -964271037;
            this.bk = var2 * -690636601;
            vz.ey(var8);
            if (var13 != jm.ay()) {
               jm.ak(var13);
            }

         }
      } catch (RuntimeException var16) {
         throw tm.aw(var16, "uc.ac(" + ')');
      }
   }

   boolean el(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.cp == null) {
         return true;
      } else if (var1 == this.cp.aw && var2 == this.cp.ak) {
         if (this.ac.ab * -1057141420 != this.cv * 1464878158) {
            return true;
         } else if (-1556032997 * this.ce != client.wp * -1558153682) {
            return true;
         } else if (var3 <= 0 && var4 <= 0) {
            return var1 + var3 < var5 || var4 + var2 < var6;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   boolean ax(int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      try {
         if (this.cp == null) {
            if (var7 != 9) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            if (var1 == this.cp.aw) {
               if (var7 != 9) {
                  throw new IllegalStateException();
               }

               if (var2 == this.cp.ak) {
                  if (this.ac.ab * 650460145 != this.cv * -2137785581) {
                     if (var7 != 9) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }

                  if (-1556032997 * this.ce != client.wp * -1918127199) {
                     if (var7 != 9) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }

                  if (var3 <= 0) {
                     if (var7 != 9) {
                        throw new IllegalStateException();
                     }

                     if (var4 <= 0) {
                        if (var1 + var3 >= var5) {
                           if (var7 != 9) {
                              throw new IllegalStateException();
                           }

                           if (var4 + var2 >= var6) {
                              return false;
                           }

                           if (var7 != 9) {
                              throw new IllegalStateException();
                           }
                        }

                        return true;
                     }

                     if (var7 != 9) {
                        throw new IllegalStateException();
                     }
                  }

                  return true;
               }

               if (var7 != 9) {
                  throw new IllegalStateException();
               }
            }

            return true;
         }
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "uc.ax(" + ')');
      }
   }

   void aq(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         if (null != ck.wo) {
            if (var7 != -51593668) {
               throw new IllegalStateException();
            }

            int var8 = 512 / (1300920290 * this.ac.ab);
            int var9 = 512 + var3;
            int var10 = var4 + 512;
            float var11 = 1.0F;
            var9 = (int)((float)var9 / var11);
            var10 = (int)((float)var10 / var11);
            int var12 = this.bc(-840982359) - var5 / 2 - var8;
            int var13 = this.by(-2107622542) - var6 / 2 - var8;
            int var14 = var1 - this.ac.ab * 650460145 * (var12 + var8 - -190559309 * this.cy);
            int var15 = var2 - this.ac.ab * 650460145 * (var8 - (var13 - 418000605 * this.cu));
            if (this.ax(var9, var10, var14, var15, var3, var4, (byte)9)) {
               if (var7 != -51593668) {
                  throw new IllegalStateException();
               }

               label52: {
                  if (this.cp != null) {
                     if (var7 != -51593668) {
                        throw new IllegalStateException();
                     }

                     if (var9 == this.cp.aw && var10 == this.cp.ak) {
                        Arrays.fill(this.cp.ap, 0);
                        break label52;
                     }
                  }

                  this.cp = new vv(var9, var10);
               }

               this.cy = (this.bc(-1284431472) - var5 / 2 - var8) * -1447208069;
               this.cu = (this.by(-179956742) - var6 / 2 - var8) * -517400203;
               this.cv = this.ac.ab * 1591601515;
               ck.wo.ai(this.cy * -190559309, 418000605 * this.cu, this.cp, (float)(this.cv * -2137785581) / var11, (byte)93);
               this.ce = 1687227635 * client.wp;
               var14 = var1 - (var12 + var8 - this.cy * -190559309) * 650460145 * this.ac.ab;
               var15 = var2 - (var8 - (var13 - this.cu * 418000605)) * this.ac.ab * 650460145;
            }

            vz.en(var1, var2, var3, var4, 0, 128);
            if (1.0F == var11) {
               if (var7 != -51593668) {
                  return;
               }

               this.cp.aq(var14, var15, 192);
            } else {
               this.cp.ah(var14, var15, (int)((float)var9 * var11), (int)((float)var10 * var11), 192);
            }
         }

      } catch (RuntimeException var16) {
         throw tm.aw(var16, "uc.aq(" + ')');
      }
   }

   public void al(int var1, int var2, int var3, int var4, int var5) {
      try {
         if (!this.av.ak(615850216)) {
            if (var5 == -437562981) {
               throw new IllegalStateException();
            }
         } else {
            if (!this.ac.ae(-1391587606)) {
               if (var5 == -437562981) {
                  throw new IllegalStateException();
               }

               this.ac.ap(this.as, this.ag.at(-913610044), client.cf, -1725286400);
               if (!this.ac.ae(-1791516462)) {
                  if (var5 == -437562981) {
                     return;
                  }

                  return;
               }
            }

            this.ac.ai(var1, var2, var3, var4, this.bz, this.by * 464312387, -488849437 * this.bq, 1859333113);
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "uc.al(" + ')');
      }
   }

   public void aa(int var1, byte var2) {
      try {
         this.bh = this.bh(var1, 185444212);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "uc.aa(" + ')');
      }
   }

   void ah(int var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         byte var7 = 20;
         int var8 = var1 + var3 / 2;
         int var9 = var2 + var4 / 2 - 18 - var7;
         vz.ef(var1, var2, var3, var4, -16777216);
         vz.ep(var8 - 152, var9, 304, 34, -65536);
         vz.ef(var8 - 150, var9 + 2, var5 * 3, 30, -65536);
         this.ao.ad(og.mv, var8, var9 + var7, -1, -1);
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "uc.ah(" + ')');
      }
   }

   float bh(int var1, int var2) {
      try {
         if (var1 == 25) {
            if (var2 <= -1325949376) {
               throw new IllegalStateException();
            } else {
               return 1.0F;
            }
         } else if (37 == var1) {
            if (var2 <= -1325949376) {
               throw new IllegalStateException();
            } else {
               return 1.5F;
            }
         } else if (50 == var1) {
            if (var2 <= -1325949376) {
               throw new IllegalStateException();
            } else {
               return 2.0F;
            }
         } else if (75 == var1) {
            if (var2 <= -1325949376) {
               throw new IllegalStateException();
            } else {
               return 3.0F;
            }
         } else if (var1 == 100) {
            if (var2 <= -1325949376) {
               throw new IllegalStateException();
            } else {
               return 4.0F;
            }
         } else {
            return 8.0F;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "uc.bh(" + ')');
      }
   }

   public int bj(short var1) {
      try {
         if ((double)this.bh == 1.0D) {
            if (var1 <= 1024) {
               throw new IllegalStateException();
            } else {
               return 25;
            }
         } else if (1.5D == (double)this.bh) {
            if (var1 <= 1024) {
               throw new IllegalStateException();
            } else {
               return 37;
            }
         } else if ((double)this.bh == 2.0D) {
            return 50;
         } else if ((double)this.bh == 3.0D) {
            if (var1 <= 1024) {
               throw new IllegalStateException();
            } else {
               return 75;
            }
         } else if ((double)this.bh == 4.0D) {
            if (var1 <= 1024) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else {
            return 200;
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "uc.bj(" + ')');
      }
   }

   public void bv(int var1) {
      try {
         this.av.aw(-2146176719);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "uc.bv(" + ')');
      }
   }

   public boolean bx(int var1) {
      try {
         return this.av.ak(-1676736563);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "uc.bx(" + ')');
      }
   }

   public kp bk(int var1, int var2) {
      try {
         Iterator var3 = this.ab.values().iterator();

         kp var4;
         do {
            if (!var3.hasNext()) {
               return null;
            }

            if (var2 >= -277047237) {
               throw new IllegalStateException();
            }

            var4 = (kp)var3.next();
         } while(var4.ae((short)13602) != var1);

         return var4;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "uc.bk(" + ')');
      }
   }

   public void bb(int var1, int var2, int var3) {
      try {
         if (null != this.ag) {
            if (var3 != 1105203222) {
               throw new IllegalStateException();
            }

            if (this.ag.aj(var1, var2, (byte)123)) {
               this.al = (var1 - this.ag.ar((byte)-25) * 64) * 987156127;
               this.aa = (var2 - this.ag.az((byte)0) * 64) * 1852671241;
               return;
            }
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "uc.bb(" + ')');
      }
   }

   public void bq(int var1, int var2, byte var3) {
      try {
         if (this.ag == null) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }
         } else {
            this.ae(var1 - this.ag.ar((byte)23) * 64, var2 - this.ag.az((byte)0) * 64, true, 1154091124);
            this.al = -987156127;
            this.aa = -1852671241;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "uc.bq(" + ')');
      }
   }

   public void hn(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.av.ak(-760971095)) {
         int var7 = (int)Math.ceil((double)((float)var3 / this.ah));
         int var8 = (int)Math.ceil((double)((float)var4 / this.ah));
         List var9 = this.ac.ay(472865701 * this.ax - var7 / 2 - 1, this.aq * -506005999 - var8 / 2 - 1, 1 + this.ax * -300773559 + var7 / 2, this.aq * 1676088392 + var8 / 2 + 1, var1, var2, var3, var4, var5, var6, -2136084350);
         if (!var9.isEmpty()) {
            Iterator var10 = var9.iterator();

            boolean var13;
            do {
               if (!var10.hasNext()) {
                  return;
               }

               lx var11 = (lx)var10.next();
               hc var12 = ar.aw(var11.aw(-1458262), 2092765104);
               var13 = false;

               for(int var14 = this.cd.length - 1; var14 >= 0; --var14) {
                  if (null != var12.af[var14]) {
                     on.lp(var12.af[var14], var12.ar, this.cd[var14], var11.aw(1843455556), var11.ae.aw(-1929426204), var11.as.aw(-1935565524), -1046126317);
                     var13 = true;
                  }
               }
            } while(!var13);

         }
      }
   }

   public void bz(int var1, int var2, int var3, int var4) {
      try {
         if (null != this.ag) {
            int[] var5 = this.ag.ai(var1, var2, var3, 442563208);
            if (null != var5) {
               if (var4 == 391200938) {
                  return;
               }

               this.bq(var5[0], var5[1], (byte)-69);
            }

         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "uc.bz(" + ')');
      }
   }

   void ay(int var1) {
      try {
         if (null != ck.wo) {
            if (var1 != -1073103093) {
               throw new IllegalStateException();
            } else {
               this.ah = this.bh;
            }
         } else {
            if (this.ah < this.bh) {
               if (var1 != -1073103093) {
                  throw new IllegalStateException();
               }

               this.ah = Math.min(this.bh, this.ah / 30.0F + this.ah);
            }

            if (this.ah > this.bh) {
               if (var1 != -1073103093) {
                  throw new IllegalStateException();
               }

               this.ah = Math.max(this.bh, this.ah - this.ah / 30.0F);
            }

         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "uc.ay(" + ')');
      }
   }

   public int by(int var1) {
      try {
         if (this.ag == null) {
            if (var1 >= 1857606834) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return -506005999 * this.aq + this.ag.az((byte)0) * 64;
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "uc.by(" + ')');
      }
   }

   public int fc() {
      return this.ag == null ? -1 : this.ax * -300773559 + this.ag.ar((byte)-13) * 64;
   }

   public int bn(int var1) {
      try {
         return 1606362793 * this.bj;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "uc.bn(" + ')');
      }
   }

   public lx hl() {
      if (this.cn == null) {
         return null;
      } else {
         lx var1;
         do {
            if (!this.cn.hasNext()) {
               return null;
            }

            var1 = (lx)this.cn.next();
         } while(var1.aw(1336081711) == -1);

         return var1;
      }
   }

   public void bt(int var1, int var2) {
      try {
         if (var1 >= 1) {
            if (var2 != 65535) {
               throw new IllegalStateException();
            }

            this.bb = var1 * 542701595;
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "uc.bt(" + ')');
      }
   }

   public void bs(byte var1) {
      try {
         this.bb = 1628104785;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "uc.bs(" + ')');
      }
   }

   public void cv(pe var1, pe var2, pe var3, qi var4, HashMap var5, vc[] var6) {
      this.ar = var6;
      this.as = var1;
      this.ae = var2;
      this.am = var3;
      this.ao = var4;
      this.af = new HashMap();
      this.af.put(kv.ap, var5.get(at));
      this.af.put(kv.aw, var5.get(au));
      this.af.put(kv.ak, var5.get(an));
      this.av = new ub(var1);
      int var7 = this.as.cf(lc.ap.ay, (byte)49);
      int[] var8 = this.as.be(var7, 1346508678);
      int var9 = var8 == null ? 0 : var8.length;
      this.ab = new HashMap(var9);

      for(int var10 = 0; var10 < var9; ++var10) {
         vl var11 = new vl(this.as.bm(var7, var8[var10], 2086778709));
         kp var12 = new kp();
         var12.ap(var11, var8[var10], 520697337);
         this.ab.put(var12.at(-103357506), var12);
         if (var12.am(1377577087)) {
            this.az = var12;
         }
      }

      this.ab(this.az, (byte)63);
      this.ad = null;
   }

   void ev(int var1, int var2, int var3) {
      if (this.ag != null) {
         int[] var4 = this.ag.ai(var1, var2, var3, 1834499088);
         if (null == var4) {
            var4 = this.ag.ai(this.ag.ac(-1293370121), this.ag.ad(-1260202593), this.ag.av(637831648), 384710825);
         }

         this.ae(var4[0] - this.ag.ar((byte)-54) * 64, var4[1] - this.ag.az((byte)0) * 64, true, -975451844);
         this.al = -987156127;
         this.aa = -1852671241;
         this.ah = this.bh(this.ag.af(-1731370095), 737155321);
         this.bh = this.ah;
         this.ci = null;
         this.cn = null;
         this.ac.aw((byte)14);
      }
   }

   public void fz() {
      this.bb = 1628104785;
   }

   public void ba(int var1, byte var2) {
      try {
         this.bz = new HashSet();
         this.bz.add(var1);
         this.bc = 0;
         this.by = 0;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "uc.ba(" + ')');
      }
   }

   public void bw(int var1, int var2) {
      try {
         this.bz = new HashSet();
         this.bc = 0;
         this.by = 0;

         for(int var3 = 0; var3 < -1191741605 * ni.ak; ++var3) {
            if (var2 != -1962755357) {
               throw new IllegalStateException();
            }

            if (ar.aw(var3, 1947717661) == null) {
               if (var2 != -1962755357) {
                  throw new IllegalStateException();
               }
            } else if (ar.aw(var3, 1639003234).aa * 1418002937 == var1) {
               if (var2 != -1962755357) {
                  return;
               }

               this.bz.add(ar.aw(var3, 1787009647).ai * -1268897243);
            }
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "uc.bw(" + ')');
      }
   }

   public void bi(int var1) {
      try {
         this.bz = null;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "uc.bi(" + ')');
      }
   }

   public void bd(boolean var1, int var2) {
      try {
         this.bp = var1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "uc.bd(" + ')');
      }
   }

   public void bg(int var1, boolean var2, int var3) {
      try {
         if (!var2) {
            if (var3 == -506195835) {
               return;
            }

            this.bi.add(var1);
         } else {
            this.bi.remove(var1);
         }

         this.cd(500907335);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "uc.bg(" + ')');
      }
   }

   public void bl(int var1, boolean var2, int var3) {
      try {
         if (!var2) {
            if (var3 != -2051740819) {
               throw new IllegalStateException();
            }

            this.bf.add(var1);
         } else {
            this.bf.remove(var1);
         }

         for(int var4 = 0; var4 < ni.ak * -1191741605; ++var4) {
            if (var3 != -2051740819) {
               throw new IllegalStateException();
            }

            if (ar.aw(var4, 2069404313) == null) {
               if (var3 != -2051740819) {
                  throw new IllegalStateException();
               }
            } else if (ar.aw(var4, 1778536574).aa * 1418002937 == var1) {
               if (var3 != -2051740819) {
                  throw new IllegalStateException();
               }

               int var5 = ar.aw(var4, 1766792123).ai * -1268897243;
               if (!var2) {
                  if (var3 != -2051740819) {
                     throw new IllegalStateException();
                  }

                  this.bg.add(var5);
               } else {
                  this.bg.remove(var5);
               }
            }
         }

         this.cd(912385208);
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "uc.bl(" + ')');
      }
   }

   public boolean be(int var1) {
      try {
         boolean var10000;
         if (!this.be) {
            if (var1 == -860056805) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "uc.be(" + ')');
      }
   }

   void do(kp var1) {
      if (null == this.ag || this.ag != var1) {
         this.az(var1, (byte)14);
         this.ad(-1, -1, -1, -2012806218);
      }
   }

   void dw(kp var1) {
      if (null == this.ag || this.ag != var1) {
         this.az(var1, (byte)14);
         this.ad(-1, -1, -1, 791083074);
      }
   }

   void cd(int var1) {
      try {
         this.bl.clear();
         this.bl.addAll(this.bi);
         this.bl.addAll(this.bg);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "uc.cd(" + ')');
      }
   }

   public void ci(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         if (!this.av.ak(1805406105)) {
            if (var7 != 1431228060) {
               ;
            }
         } else {
            int var8 = (int)Math.ceil((double)((float)var3 / this.ah));
            int var9 = (int)Math.ceil((double)((float)var4 / this.ah));
            List var10 = this.ac.ay(-300773559 * this.ax - var8 / 2 - 1, this.aq * -506005999 - var9 / 2 - 1, 1 + this.ax * -300773559 + var8 / 2, this.aq * -506005999 + var9 / 2 + 1, var1, var2, var3, var4, var5, var6, -2108303889);
            if (var10.isEmpty()) {
               if (var7 == 1431228060) {
                  throw new IllegalStateException();
               }
            } else {
               Iterator var11 = var10.iterator();

               boolean var14;
               do {
                  if (!var11.hasNext()) {
                     return;
                  }

                  if (var7 == 1431228060) {
                     return;
                  }

                  lx var12 = (lx)var11.next();
                  hc var13 = ar.aw(var12.aw(558181224), 2099244698);
                  var14 = false;

                  for(int var15 = this.cd.length - 1; var15 >= 0; --var15) {
                     if (var7 == 1431228060) {
                        throw new IllegalStateException();
                     }

                     if (null != var13.af[var15]) {
                        if (var7 == 1431228060) {
                           return;
                        }

                        on.lp(var13.af[var15], var13.ar, this.cd[var15], var12.aw(-93073936), var12.ae.aw(-1275236117), var12.as.aw(-1836579688), -1079189167);
                        var14 = true;
                     }
                  }
               } while(!var14);

               if (var7 != 1431228060) {
                  ;
               }
            }
         }
      } catch (RuntimeException var16) {
         throw tm.aw(var16, "uc.ci(" + ')');
      }
   }

   public kp df(int var1, int var2, int var3) {
      Iterator var4 = this.ab.values().iterator();

      kp var5;
      do {
         if (!var4.hasNext()) {
            return null;
         }

         var5 = (kp)var4.next();
      } while(!var5.ak(var1, var2, var3, 615774099));

      return var5;
   }

   public void co(int var1, int var2, nn var3, nn var4, int var5) {
      try {
         dt var6 = new dt();
         lj var7 = new lj(var2, var3, var4);
         var6.ap(new Object[]{var7}, 1334767346);
         switch(var1) {
         case 1008:
            var6.aw(10, (short)156);
            break;
         case 1009:
            var6.aw(11, (short)156);
            break;
         case 1010:
            var6.aw(12, (short)156);
            break;
         case 1011:
            var6.aw(13, (short)156);
            break;
         case 1012:
            var6.aw(14, (short)156);
         }

         sr.ap(var6, -1869579952);
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "uc.co(" + ')');
      }
   }

   public boolean hc(int var1) {
      return !this.bi.contains(var1);
   }

   public lx cl(int var1) {
      try {
         if (this.cn == null) {
            if (var1 >= 681460292) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            lx var2;
            do {
               if (!this.cn.hasNext()) {
                  return null;
               }

               var2 = (lx)this.cn.next();
            } while(var2.aw(-1576301858) == -1);

            if (var1 >= 681460292) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "uc.cl(" + ')');
      }
   }

   static {
      at = us.aj;
      au = us.ai;
      an = us.ay;
   }

   public void cp(pe var1, pe var2, pe var3, qi var4, HashMap var5, vc[] var6) {
      this.ar = var6;
      this.as = var1;
      this.ae = var2;
      this.am = var3;
      this.ao = var4;
      this.af = new HashMap();
      this.af.put(kv.ap, var5.get(at));
      this.af.put(kv.aw, var5.get(au));
      this.af.put(kv.ak, var5.get(an));
      this.av = new ub(var1);
      int var7 = this.as.cf(lc.ap.ay, (byte)92);
      int[] var8 = this.as.be(var7, 1875856116);
      int var9 = var8 == null ? 0 : var8.length;
      this.ab = new HashMap(var9);

      for(int var10 = 0; var10 < var9; ++var10) {
         vl var11 = new vl(this.as.bm(var7, var8[var10], 1968605213));
         kp var12 = new kp();
         var12.ap(var11, var8[var10], 2141129642);
         this.ab.put(var12.at(677487958), var12);
         if (var12.am(1377577087)) {
            this.az = var12;
         }
      }

      this.ab(this.az, (byte)74);
      this.ad = null;
   }

   public void cy(pe var1, pe var2, pe var3, qi var4, HashMap var5, vc[] var6) {
      this.ar = var6;
      this.as = var1;
      this.ae = var2;
      this.am = var3;
      this.ao = var4;
      this.af = new HashMap();
      this.af.put(kv.ap, var5.get(at));
      this.af.put(kv.aw, var5.get(au));
      this.af.put(kv.ak, var5.get(an));
      this.av = new ub(var1);
      int var7 = this.as.cf(lc.ap.ay, (byte)126);
      int[] var8 = this.as.be(var7, 1070420374);
      int var9 = var8 == null ? 0 : var8.length;
      this.ab = new HashMap(var9);

      for(int var10 = 0; var10 < var9; ++var10) {
         vl var11 = new vl(this.as.bm(var7, var8[var10], 1748062028));
         kp var12 = new kp();
         var12.ap(var11, var8[var10], 1687665896);
         this.ab.put(var12.at(1124377164), var12);
         if (var12.am(1377577087)) {
            this.az = var12;
         }
      }

      this.ab(this.az, (byte)96);
      this.ad = null;
   }

   public int af(int var1) {
      try {
         if (this.ag == null) {
            if (var1 == 1649954523) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return this.ag.ae((short)7553);
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "uc.af(" + ')');
      }
   }

   public void ce() {
      eq.ak((byte)-80);
   }

   boolean ef(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.cp == null) {
         return true;
      } else if (var1 == this.cp.aw && var2 == this.cp.ak) {
         if (this.ac.ab * 650460145 != this.cv * -2137785581) {
            return true;
         } else if (-99203591 * this.ce != client.wp * -1923736553) {
            return true;
         } else if (var3 <= 0 && var4 <= 0) {
            return var1 + var3 < var5 || var4 + var2 < var6;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public int ff() {
      return 89536797 * this.bv;
   }

   public void dz(kp var1, nn var2, nn var3, boolean var4) {
      if (null != var1) {
         if (null == this.ag || this.ag != var1) {
            this.az(var1, (byte)14);
         }

         if (!var4 && this.ag.ak(var2.ap * 117039165, 1601399073 * var2.aw, var2.ak * -1982010185, 1348265888)) {
            this.ad(var2.ap * 117039165, 1601399073 * var2.aw, -1982010185 * var2.ak, -1914937243);
         } else {
            this.ad(var3.ap * 117039165, var3.aw * 1601399073, var3.ak * -1982010185, -1448752978);
         }

      }
   }

   public void ew(int var1, int var2, int var3, int var4) {
      if (this.av.ak(-996308271)) {
         if (!this.ac.ae(1634070692)) {
            this.ac.ap(this.as, this.ag.at(-1062871957), client.cf, -1406263121);
            if (!this.ac.ae(-1110509480)) {
               return;
            }
         }

         this.ac.ai(var1, var2, var3, var4, this.bz, this.by * 464312387, -488849437 * this.bq, 1047267499);
      }
   }

   void ct(int var1, int var2, boolean var3, long var4) {
      if (this.ag != null) {
         int var6 = (int)((float)(-300773559 * this.ax) + ((float)(var1 - -1603925909 * this.bx) - (float)this.bn(-2122938628) * this.ah / 2.0F) / this.ah);
         int var7 = (int)((float)(this.aq * -506005999) - ((float)(var2 - -1906865929 * this.bk) - (float)this.bu(2117115961) * this.ah / 2.0F) / this.ah);
         this.cf = this.ag.ay(var6 + this.ag.ar((byte)3) * 64, var7 + this.ag.az((byte)0) * 64, -170118987);
         if (this.cf != null && var3) {
            kr var8 = client.se;
            int var11;
            int var12;
            if (fp.ot(-147163770) && var8.ag(82, -1644922770) && var8.ag(81, -1026324504)) {
               int var14 = 1601399073 * this.cf.aw;
               var11 = this.cf.ak * -1982010185;
               var12 = this.cf.ap * 117039165;
               me var13 = ef.ap(mm.dx, client.in.ai, (byte)54);
               var13.ak.db(var12, (byte)-11);
               var13.ak.ep(0, 475851950);
               var13.ak.dz(var11, -1575711288);
               var13.ak.dz(var14, 937169393);
               client.in.ak(var13, (short)486);
            } else {
               boolean var10 = true;
               if (this.bd) {
                  var11 = var1 - this.bm * -1548454979;
                  var12 = var2 - 1410514837 * this.bo;
                  if (var4 - this.bs * 8565669029377014713L > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
                     var10 = false;
                  }
               }

               if (var10) {
                  me var15 = ef.ap(mm.bf, client.in.ai, (byte)26);
                  var15.ak.ex(this.cf.aw(-1323247909), -2050159020);
                  client.in.ak(var15, (short)486);
                  this.bs = 0L;
               }
            }
         }
      } else {
         this.cf = null;
      }

   }

   void cc() {
      if (null != ck.wo) {
         this.ah = this.bh;
      } else {
         if (this.ah < this.bh) {
            this.ah = Math.min(this.bh, this.ah / 30.0F + this.ah);
         }

         if (this.ah > this.bh) {
            this.ah = Math.max(this.bh, this.ah - this.ah / 30.0F);
         }

      }
   }

   public void cx() {
      eq.ak((byte)-80);
   }

   void cm() {
      if (null != ck.wo) {
         this.ah = this.bh;
      } else {
         if (this.ah < this.bh) {
            this.ah = Math.min(this.bh, this.ah / 30.0F + this.ah);
         }

         if (this.ah > this.bh) {
            this.ah = Math.max(this.bh, this.ah - this.ah / 30.0F);
         }

      }
   }

   void ch(int var1, int var2, boolean var3, long var4) {
      if (this.ag != null) {
         int var6 = (int)((float)(-300773559 * this.ax) + ((float)(var1 - -1603925909 * this.bx) - (float)this.bn(-1849520800) * this.ah / 2.0F) / this.ah);
         int var7 = (int)((float)(this.aq * -506005999) - ((float)(var2 - -1906865929 * this.bk) - (float)this.bu(881946764) * this.ah / 2.0F) / this.ah);
         this.cf = this.ag.ay(var6 + this.ag.ar((byte)-10) * 64, var7 + this.ag.az((byte)0) * 64, 689163160);
         if (this.cf != null && var3) {
            kr var8 = client.se;
            int var11;
            int var12;
            if (fp.ot(-1174422589) && var8.ag(82, 1387867172) && var8.ag(81, -1459508970)) {
               int var14 = 1601399073 * this.cf.aw;
               var11 = this.cf.ak * -1982010185;
               var12 = this.cf.ap * 117039165;
               me var13 = ef.ap(mm.dx, client.in.ai, (byte)27);
               var13.ak.db(var12, (byte)-15);
               var13.ak.ep(0, 970934533);
               var13.ak.dz(var11, 524339438);
               var13.ak.dz(var14, 2040564103);
               client.in.ak(var13, (short)486);
            } else {
               boolean var10 = true;
               if (this.bd) {
                  var11 = var1 - this.bm * -1548454979;
                  var12 = var2 - 1410514837 * this.bo;
                  if (var4 - this.bs * 8565669029377014713L > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
                     var10 = false;
                  }
               }

               if (var10) {
                  me var15 = ef.ap(mm.bf, client.in.ai, (byte)41);
                  var15.ak.ex(this.cf.aw(-2097373003), -1693609979);
                  client.in.ak(var15, (short)486);
                  this.bs = 0L;
               }
            }
         }
      } else {
         this.cf = null;
      }

   }

   public lx hx() {
      if (this.cn == null) {
         return null;
      } else {
         lx var1;
         do {
            if (!this.cn.hasNext()) {
               return null;
            }

            var1 = (lx)this.cn.next();
         } while(var1.aw(2099646693) == -1);

         return var1;
      }
   }

   final void cs(int var1, int var2, boolean var3) {
      this.ax = -379350279 * var1;
      this.aq = 372947697 * var2;
      ck.ap(-1651067236);
      if (var3) {
         this.am(-204488824);
      }

   }

   final void cr(int var1, int var2, boolean var3) {
      this.ax = -379350279 * var1;
      this.aq = 1652213935 * var2;
      ck.ap(-903989248);
      if (var3) {
         this.am(345986634);
      }

   }

   final void ck(int var1, int var2, boolean var3) {
      this.ax = -379350279 * var1;
      this.aq = 372947697 * var2;
      ck.ap(-1820755282);
      if (var3) {
         this.am(-313478267);
      }

   }

   public nn br(int var1) {
      try {
         if (null == this.ag) {
            if (var1 != 669935203) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return this.ag.ay(this.bc(1833362193), this.by(770793), 127289094);
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "uc.br(" + ')');
      }
   }

   final void dd() {
      this.bt = 865207451;
      this.bu = 376539793;
      this.bn = -19747952;
      this.br = -980739537;
   }

   final void dc() {
      this.bt = -1505034296;
      this.bu = 656039086;
      this.bn = -1035378323;
      this.br = -980739537;
   }

   final void da() {
      this.bt = 661611049;
      this.bu = 376539793;
      this.bn = -1035378323;
      this.br = -980739537;
   }

   boolean dr() {
      return -1 != this.al * 749522271 && this.aa * -1241278151 != -1;
   }

   public kp dh(int var1, int var2, int var3) {
      Iterator var4 = this.ab.values().iterator();

      kp var5;
      do {
         if (!var4.hasNext()) {
            return null;
         }

         var5 = (kp)var4.next();
      } while(!var5.ak(var1, var2, var3, -1887690126));

      return var5;
   }

   public kp dg(int var1, int var2, int var3) {
      Iterator var4 = this.ab.values().iterator();

      kp var5;
      do {
         if (!var4.hasNext()) {
            return null;
         }

         var5 = (kp)var4.next();
      } while(!var5.ak(var1, var2, var3, 1940696697));

      return var5;
   }

   public void fv(int var1, int var2, int var3) {
      if (null != this.ag) {
         int[] var4 = this.ag.ai(var1, var2, var3, -1240297855);
         if (null != var4) {
            this.bb(var4[0], var4[1], 1105203222);
         }

      }
   }

   public boolean fo() {
      return this.av.ak(-932627748);
   }

   public void dk(int var1, int var2, int var3, boolean var4) {
      kp var5 = this.au(var1, var2, var3, (byte)88);
      if (var5 == null) {
         if (!var4) {
            return;
         }

         var5 = this.az;
      }

      boolean var6 = false;
      if (var5 != this.ad || var4) {
         this.ad = var5;
         this.ab(var5, (byte)61);
         var6 = true;
      }

      if (var6 || var4) {
         this.ad(var1, var2, var3, 392711328);
      }

   }

   public void dl(int var1) {
      kp var2 = this.bk(var1, -1759131298);
      if (var2 != null) {
         this.ab(var2, (byte)14);
      }

   }

   public void gq(int var1, boolean var2) {
      if (!var2) {
         this.bf.add(var1);
      } else {
         this.bf.remove(var1);
      }

      for(int var3 = 0; var3 < ni.ak * -1191741605; ++var3) {
         if (ar.aw(var3, 2124825890) != null && ar.aw(var3, 2031621501).aa * 1418002937 == var1) {
            int var4 = ar.aw(var3, 1823660615).ai * -467237183;
            if (!var2) {
               this.bg.add(var4);
            } else {
               this.bg.remove(var4);
            }
         }
      }

      this.cd(2001220795);
   }

   public void go(boolean var1) {
      this.be = !var1;
   }

   public lx hm() {
      if (!this.av.ak(-929509211)) {
         return null;
      } else if (!this.ac.ae(-422702907)) {
         return null;
      } else {
         HashMap var1 = this.ac.at(1545801752);
         this.ci = new LinkedList();
         Iterator var2 = var1.values().iterator();

         while(var2.hasNext()) {
            List var3 = (List)var2.next();
            this.ci.addAll(var3);
         }

         this.cn = this.ci.iterator();
         return this.cl(-518268932);
      }
   }

   public kp ds() {
      return this.ag;
   }

   public kp db() {
      return this.ag;
   }

   public kp dv() {
      return this.ag;
   }

   void dj(kp var1) {
      if (null == this.ag || this.ag != var1) {
         this.az(var1, (byte)14);
         this.ad(-1, -1, -1, 1902010430);
      }
   }

   void dp(kp var1) {
      if (null == this.ag || this.ag != var1) {
         this.az(var1, (byte)14);
         this.ad(-1, -1, -1, 1822995924);
      }
   }

   void dy(kp var1) {
      if (null == this.ag || this.ag != var1) {
         this.az(var1, (byte)14);
         this.ad(-1, -1, -1, 1835775757);
      }
   }

   void ca() {
      if (this.at(883200280)) {
         int var1 = 749522271 * this.al - -300773559 * this.ax;
         int var2 = -1241278151 * this.aa - this.aq * -506005999;
         if (0 != var1) {
            var1 /= Math.min(8, Math.abs(var1));
         }

         if (0 != var2) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         this.ae(var1 + -300773559 * this.ax, -506005999 * this.aq + var2, true, 795530252);
         if (749522271 * this.al == this.ax * -300773559 && this.aa * -1241278151 == -506005999 * this.aq) {
            this.al = -987156127;
            this.aa = -1852671241;
         }

      }
   }

   void ad(int var1, int var2, int var3, int var4) {
      try {
         if (this.ag == null) {
            if (var4 != 16777215) {
               ;
            }
         } else {
            int[] var5 = this.ag.ai(var1, var2, var3, 1713612942);
            if (null == var5) {
               if (var4 == 16777215) {
                  throw new IllegalStateException();
               }

               var5 = this.ag.ai(this.ag.ac(-1038932782), this.ag.ad(-632300594), this.ag.av(637831648), -1326566719);
            }

            this.ae(var5[0] - this.ag.ar((byte)13) * 64, var5[1] - this.ag.az((byte)0) * 64, true, 2119562774);
            this.al = -987156127;
            this.aa = -1852671241;
            this.ah = this.bh(this.ag.af(-1849347115), 1306083425);
            this.bh = this.ah;
            this.ci = null;
            this.cn = null;
            this.ac.aw((byte)14);
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "uc.ad(" + ')');
      }
   }

   void de(kp var1) {
      this.ag = var1;
      this.ac = new lu(this.ar, this.af, this.ae, this.am);
      this.av.ap(this.ag == null ? null : this.ag.at(1129267859), -632310909);
   }

   public void gc(boolean var1) {
      this.bp = var1;
   }

   public void di(kp var1, nn var2, nn var3, boolean var4) {
      if (null != var1) {
         if (null == this.ag || this.ag != var1) {
            this.az(var1, (byte)14);
         }

         if (!var4 && this.ag.ak(var2.ap * 117039165, 1601399073 * var2.aw, var2.ak * -1982010185, -1492128790)) {
            this.ad(var2.ap * 117039165, 1601399073 * var2.aw, -1982010185 * var2.ak, -1448623862);
         } else {
            this.ad(var3.ap * 117039165, var3.aw * 1601399073, var3.ak * -1982010185, -2030225206);
         }

      }
   }

   public void dn(kp var1, nn var2, nn var3, boolean var4) {
      if (null != var1) {
         if (null == this.ag || this.ag != var1) {
            this.az(var1, (byte)14);
         }

         if (!var4 && this.ag.ak(var2.ap * 117039165, 1601399073 * var2.aw, var2.ak * -1982010185, -2059900923)) {
            this.ad(var2.ap * 117039165, 1601399073 * var2.aw, -1982010185 * var2.ak, 1296574556);
         } else {
            this.ad(var3.ap * 117039165, var3.aw * 1601399073, var3.ak * -1982010185, 98304712);
         }

      }
   }

   void eg(int var1, int var2, int var3) {
      if (this.ag != null) {
         int[] var4 = this.ag.ai(var1, var2, var3, -1089597071);
         if (null == var4) {
            var4 = this.ag.ai(this.ag.ac(-1526458934), this.ag.ad(580127349), this.ag.av(637831648), 1519590991);
         }

         this.ae(var4[0] - this.ag.ar((byte)22) * -805021763, var4[1] - this.ag.az((byte)0) * 1154928854, true, -969776981);
         this.al = -987156127;
         this.aa = 920838668;
         this.ah = this.bh(this.ag.af(-1519357197), 991246663);
         this.bh = this.ah;
         this.ci = null;
         this.cn = null;
         this.ac.aw((byte)14);
      }
   }

   void cj() {
      if (null != ck.wo) {
         this.ah = this.bh;
      } else {
         if (this.ah < this.bh) {
            this.ah = Math.min(this.bh, this.ah / 30.0F + this.ah);
         }

         if (this.ah > this.bh) {
            this.ah = Math.max(this.bh, this.ah - this.ah / 30.0F);
         }

      }
   }

   void ab(kp var1, byte var2) {
      try {
         if (null != this.ag) {
            if (var2 <= 2) {
               return;
            }

            if (this.ag == var1) {
               return;
            }
         }

         this.az(var1, (byte)14);
         this.ad(-1, -1, -1, -1318586537);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "uc.ab(" + ')');
      }
   }

   public void bf(boolean var1, byte var2) {
      try {
         boolean var10001;
         if (!var1) {
            if (var2 != 2) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.be = var10001;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "uc.bf(" + ')');
      }
   }

   public void ey() {
      kb.ai.as();
   }

   public void ec() {
      kb.ai.as();
   }

   public void ek() {
      kb.ai.as();
   }

   public void er() {
      kb.ai.as();
   }

   boolean en(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.cp == null) {
         return true;
      } else if (var1 == this.cp.aw && var2 == this.cp.ak) {
         if (this.ac.ab * 793719358 != this.cv * -2137785581) {
            return true;
         } else if (-2131080304 * this.ce != client.wp * 1433632780) {
            return true;
         } else if (var3 <= 0 && var4 <= 0) {
            return var1 + var3 < var5 || var4 + var2 < var6;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public nn hy(int var1, nn var2) {
      if (!this.av.ak(535283375)) {
         return null;
      } else if (!this.ac.ae(-1590735708)) {
         return null;
      } else if (!this.ag.aj(1601399073 * var2.aw, var2.ak * -1982010185, (byte)77)) {
         return null;
      } else {
         HashMap var3 = this.ac.at(2112633388);
         List var4 = (List)var3.get(var1);
         if (var4 != null && !var4.isEmpty()) {
            lx var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();

            while(true) {
               lx var8;
               int var11;
               do {
                  if (!var7.hasNext()) {
                     return var5.as;
                  }

                  var8 = (lx)var7.next();
                  int var9 = var8.as.aw * 1601399073 - 1601399073 * var2.aw;
                  int var10 = -1982010185 * var8.as.ak - -1982010185 * var2.ak;
                  var11 = var9 * var9 + var10 * var10;
                  if (var11 == 0) {
                     return var8.as;
                  }
               } while(var11 >= var6 && null != var5);

               var5 = var8;
               var6 = var11;
            }
         } else {
            return null;
         }
      }
   }

   boolean em(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.cp == null) {
         return true;
      } else if (var1 == this.cp.aw && var2 == this.cp.ak) {
         if (this.ac.ab * 650460145 != this.cv * -2137785581) {
            return true;
         } else if (-1556032997 * this.ce != client.wp * -1918127199) {
            return true;
         } else if (var3 <= 0 && var4 <= 0) {
            return var1 + var3 < var5 || var4 + var2 < var6;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public int fb() {
      return this.ag == null ? -1 : -506005999 * this.aq + this.ag.az((byte)0) * 64;
   }

   void ed(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (null != ck.wo) {
         int var7 = 512 / (1300920290 * this.ac.ab);
         int var8 = 512 + var3;
         int var9 = var4 + 512;
         float var10 = 1.0F;
         var8 = (int)((float)var8 / var10);
         var9 = (int)((float)var9 / var10);
         int var11 = this.bc(314057691) - var5 / 2 - var7;
         int var12 = this.by(-763572333) - var6 / 2 - var7;
         int var13 = var1 - this.ac.ab * 650460145 * (var11 + var7 - -190559309 * this.cy);
         int var14 = var2 - this.ac.ab * 650460145 * (var7 - (var12 - 418000605 * this.cu));
         if (this.ax(var8, var9, var13, var14, var3, var4, (byte)9)) {
            if (this.cp != null && var8 == this.cp.aw && var9 == this.cp.ak) {
               Arrays.fill(this.cp.ap, 0);
            } else {
               this.cp = new vv(var8, var9);
            }

            this.cy = (this.bc(1980047737) - var5 / 2 - var7) * -1447208069;
            this.cu = (this.by(213718563) - var6 / 2 - var7) * -517400203;
            this.cv = this.ac.ab * 1591601515;
            ck.wo.ai(this.cy * -190559309, 418000605 * this.cu, this.cp, (float)(this.cv * -2137785581) / var10, (byte)75);
            this.ce = 1687227635 * client.wp;
            var13 = var1 - (var11 + var7 - this.cy * -190559309) * 650460145 * this.ac.ab;
            var14 = var2 - (var7 - (var12 - this.cu * 418000605)) * this.ac.ab * 650460145;
         }

         vz.en(var1, var2, var3, var4, 0, 128);
         if (1.0F == var10) {
            this.cp.aq(var13, var14, 192);
         } else {
            this.cp.ah(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 192);
         }
      }

   }

   public void cg() {
      eq.ak((byte)-78);
   }

   void ex(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (null != ck.wo) {
         int var7 = 512 / (1300920290 * this.ac.ab);
         int var8 = 512 + var3;
         int var9 = var4 + 512;
         float var10 = 1.0F;
         var8 = (int)((float)var8 / var10);
         var9 = (int)((float)var9 / var10);
         int var11 = this.bc(39569880) - var5 / 2 - var7;
         int var12 = this.by(333426566) - var6 / 2 - var7;
         int var13 = var1 - this.ac.ab * 650460145 * (var11 + var7 - -190559309 * this.cy);
         int var14 = var2 - this.ac.ab * 650460145 * (var7 - (var12 - 418000605 * this.cu));
         if (this.ax(var8, var9, var13, var14, var3, var4, (byte)9)) {
            if (this.cp != null && var8 == this.cp.aw && var9 == this.cp.ak) {
               Arrays.fill(this.cp.ap, 0);
            } else {
               this.cp = new vv(var8, var9);
            }

            this.cy = (this.bc(1213494996) - var5 / 2 - var7) * -1447208069;
            this.cu = (this.by(-184794881) - var6 / 2 - var7) * -517400203;
            this.cv = this.ac.ab * 1591601515;
            ck.wo.ai(this.cy * -190559309, 418000605 * this.cu, this.cp, (float)(this.cv * -2137785581) / var10, (byte)56);
            this.ce = 1687227635 * client.wp;
            var13 = var1 - (var11 + var7 - this.cy * -190559309) * 650460145 * this.ac.ab;
            var14 = var2 - (var7 - (var12 - this.cu * 418000605)) * this.ac.ab * 650460145;
         }

         vz.en(var1, var2, var3, var4, 0, 128);
         if (1.0F == var10) {
            this.cp.aq(var13, var14, 192);
         } else {
            this.cp.ah(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 192);
         }
      }

   }

   void ej(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (null != ck.wo) {
         int var7 = 512 / (1300920290 * this.ac.ab);
         int var8 = 512 + var3;
         int var9 = var4 + 512;
         float var10 = 1.0F;
         var8 = (int)((float)var8 / var10);
         var9 = (int)((float)var9 / var10);
         int var11 = this.bc(1121098877) - var5 / 2 - var7;
         int var12 = this.by(-1112388030) - var6 / 2 - var7;
         int var13 = var1 - this.ac.ab * 650460145 * (var11 + var7 - -190559309 * this.cy);
         int var14 = var2 - this.ac.ab * 650460145 * (var7 - (var12 - 418000605 * this.cu));
         if (this.ax(var8, var9, var13, var14, var3, var4, (byte)9)) {
            if (this.cp != null && var8 == this.cp.aw && var9 == this.cp.ak) {
               Arrays.fill(this.cp.ap, 0);
            } else {
               this.cp = new vv(var8, var9);
            }

            this.cy = (this.bc(-778813661) - var5 / 2 - var7) * -1447208069;
            this.cu = (this.by(-323569151) - var6 / 2 - var7) * -517400203;
            this.cv = this.ac.ab * 1591601515;
            ck.wo.ai(this.cy * -190559309, 418000605 * this.cu, this.cp, (float)(this.cv * -2137785581) / var10, (byte)95);
            this.ce = 1687227635 * client.wp;
            var13 = var1 - (var11 + var7 - this.cy * -190559309) * 650460145 * this.ac.ab;
            var14 = var2 - (var7 - (var12 - this.cu * 418000605)) * this.ac.ab * 650460145;
         }

         vz.en(var1, var2, var3, var4, 0, 128);
         if (1.0F == var10) {
            this.cp.aq(var13, var14, 192);
         } else {
            this.cp.ah(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 192);
         }
      }

   }

   public void ei(int var1, int var2, int var3, int var4) {
      if (this.av.ak(-1078389851)) {
         if (!this.ac.ae(-388518497)) {
            this.ac.ap(this.as, this.ag.at(-1286169533), client.cf, 283109033);
            if (!this.ac.ae(1495421635)) {
               return;
            }
         }

         this.ac.ai(var1, var2, var3, var4, this.bz, this.by * 464312387, -488849437 * this.bq, 2072648194);
      }
   }

   public void ez(int var1, int var2, int var3, int var4, int var5, double var6) {
      int[] var8 = new int[4];
      vz.ez(var8);
      vz.ev(var1, var2, var1 + var3, var4 + var2);
      int var9 = this.av.aj(1987611740);
      if (var9 < 100) {
         this.ah(var1, var2, var3, var4, var9, (byte)7);
      } else {
         if (!this.ac.ae(857746503)) {
            this.ac.ap(this.as, this.ag.at(-1715434545), client.cf, -561284744);
            if (!this.ac.ae(862899873)) {
               return;
            }
         }

         int var10 = hf.ap(this.ac.am(467216182), var6);
         vz.ef(var1, var2, var3, var4, var10);
         if (null != this.bz) {
            this.by += -1365494677;
            if (0 == 464312387 * this.by % (-488849437 * this.bq)) {
               this.by = 0;
               this.bc += -239064697;
            }

            if (507857975 * this.bc >= this.bb * 74850835 && !this.bp) {
               this.bz = null;
            }
         }

         int var11 = (int)Math.ceil((double)((float)var3 / this.ah));
         int var12 = (int)Math.ceil((double)((float)var4 / this.ah));
         double var13 = jm.ay();
         this.ac.ak(this.ax * -300773559 - var11 / 2, this.aq * -506005999 - var12 / 2, this.ax * -300773559 + var11 / 2, var12 / 2 + this.aq * -506005999, var1, var2, var1 + var3, var4 + var2, -1781961422);
         if (!this.be) {
            boolean var15 = false;
            if (var5 - 33633383 * this.cq > 100) {
               this.cq = 861448023 * var5;
               var15 = true;
            }

            this.ac.aj(this.ax * -300773559 - var11 / 2, this.aq * -506005999 - var12 / 2, var11 / 2 + -300773559 * this.ax, -506005999 * this.aq + var12 / 2, var1, var2, var3 + var1, var4 + var2, this.bl, this.bz, 464312387 * this.by, this.bq * -488849437, var15, (byte)52);
         }

         this.aq(var1, var2, var3, var4, var11, var12, -51593668);
         if (fp.ot(-1145265977) && this.cl && null != this.cf) {
            this.ao.ab("Coord: " + this.cf, 10 + vz.bk, vz.bv + 20, 16776960, -1);
         }

         this.bj = var11 * -963453543;
         this.bv = var12 * -651931339;
         this.bx = var1 * -964271037;
         this.bk = var2 * -690636601;
         vz.ey(var8);
         if (var13 != jm.ay()) {
            jm.ak(var13);
         }

      }
   }

   void eu(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = 20;
      int var7 = var1 + var3 / 2;
      int var8 = var2 + var4 / 2 - 18 - var6;
      vz.ef(var1, var2, var3, var4, -16777216);
      vz.ep(var7 - 152, var8, 94947365, 1321951255, 557958306);
      vz.ef(var7 - 150, var8 + 2, var5 * 3, 30, -1483889695);
      this.ao.ad(og.mv, var7, var8 + var6, -1, -1);
   }

   float eq(int var1) {
      if (var1 == 25) {
         return 1.0F;
      } else if (647074453 == var1) {
         return 1.5F;
      } else if (50 == var1) {
         return 2.0F;
      } else if (75 == var1) {
         return 3.0F;
      } else {
         return var1 == 100 ? 4.0F : 8.0F;
      }
   }

   float eb(int var1) {
      if (var1 == 25) {
         return 1.0F;
      } else if (785833437 == var1) {
         return 1.5F;
      } else if (50 == var1) {
         return 2.0F;
      } else if (620237817 == var1) {
         return 3.0F;
      } else {
         return var1 == 100 ? 4.0F : 8.0F;
      }
   }

   float es(int var1) {
      if (var1 == 25) {
         return 1.0F;
      } else if (37 == var1) {
         return 1.5F;
      } else if (50 == var1) {
         return 2.0F;
      } else if (75 == var1) {
         return 3.0F;
      } else {
         return var1 == 100 ? 4.0F : 8.0F;
      }
   }

   public void bp(int var1, int var2, int var3, byte var4) {
      try {
         if (null == this.ag) {
            if (var4 < 0) {
               ;
            }
         } else {
            int[] var5 = this.ag.ai(var1, var2, var3, -114759713);
            if (null != var5) {
               if (var4 >= 0) {
                  throw new IllegalStateException();
               }

               this.bb(var5[0], var5[1], 1105203222);
            }

         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "uc.bp(" + ')');
      }
   }

   void cw() {
      if (this.at(387365977)) {
         int var1 = 749522271 * this.al - -300773559 * this.ax;
         int var2 = -1241278151 * this.aa - this.aq * -506005999;
         if (0 != var1) {
            var1 /= Math.min(8, Math.abs(var1));
         }

         if (0 != var2) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         this.ae(var1 + -300773559 * this.ax, -506005999 * this.aq + var2, true, 1644537367);
         if (749522271 * this.al == this.ax * -300773559 && this.aa * -1241278151 == -506005999 * this.aq) {
            this.al = -987156127;
            this.aa = -1852671241;
         }

      }
   }

   public void ea() {
      this.av.aw(-2002442519);
   }

   void ep(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (null != ck.wo) {
         int var7 = 512 / (1300920290 * this.ac.ab);
         int var8 = 512 + var3;
         int var9 = var4 + 512;
         float var10 = 1.0F;
         var8 = (int)((float)var8 / var10);
         var9 = (int)((float)var9 / var10);
         int var11 = this.bc(-1235137393) - var5 / 2 - var7;
         int var12 = this.by(-1982386633) - var6 / 2 - var7;
         int var13 = var1 - this.ac.ab * 650460145 * (var11 + var7 - -190559309 * this.cy);
         int var14 = var2 - this.ac.ab * 650460145 * (var7 - (var12 - 418000605 * this.cu));
         if (this.ax(var8, var9, var13, var14, var3, var4, (byte)9)) {
            if (this.cp != null && var8 == this.cp.aw && var9 == this.cp.ak) {
               Arrays.fill(this.cp.ap, 0);
            } else {
               this.cp = new vv(var8, var9);
            }

            this.cy = (this.bc(-1394797905) - var5 / 2 - var7) * -1447208069;
            this.cu = (this.by(1345898327) - var6 / 2 - var7) * -517400203;
            this.cv = this.ac.ab * 1591601515;
            ck.wo.ai(this.cy * -190559309, 418000605 * this.cu, this.cp, (float)(this.cv * -2137785581) / var10, (byte)76);
            this.ce = 1687227635 * client.wp;
            var13 = var1 - (var11 + var7 - this.cy * -190559309) * 650460145 * this.ac.ab;
            var14 = var2 - (var7 - (var12 - this.cu * 418000605)) * this.ac.ab * 650460145;
         }

         vz.en(var1, var2, var3, var4, 0, 128);
         if (1.0F == var10) {
            this.cp.aq(var13, var14, 192);
         } else {
            this.cp.ah(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 192);
         }
      }

   }

   public void fu() {
      this.av.aw(-1994656441);
   }

   public void bo(int var1) {
      try {
         this.bq = 316969382;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "uc.bo(" + ')');
      }
   }

   public kp fa(int var1) {
      Iterator var2 = this.ab.values().iterator();

      kp var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (kp)var2.next();
      } while(var3.ae((short)13038) != var1);

      return var3;
   }

   public kp fj(int var1) {
      Iterator var2 = this.ab.values().iterator();

      kp var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (kp)var2.next();
      } while(var3.ae((short)2160) != var1);

      return var3;
   }

   public lx cf(int var1) {
      try {
         if (!this.av.ak(427055852)) {
            if (var1 == 50741400) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if (!this.ac.ae(1219870072)) {
            if (var1 == 50741400) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            HashMap var2 = this.ac.at(1616529188);
            this.ci = new LinkedList();
            Iterator var3 = var2.values().iterator();

            while(var3.hasNext()) {
               if (var1 == 50741400) {
                  throw new IllegalStateException();
               }

               List var4 = (List)var3.next();
               this.ci.addAll(var4);
            }

            this.cn = this.ci.iterator();
            return this.cl(172024900);
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "uc.cf(" + ')');
      }
   }

   public void fp(int var1, int var2) {
      if (null != this.ag && this.ag.aj(var1, var2, (byte)68)) {
         this.al = (var1 - this.ag.ar((byte)-49) * 64) * 987156127;
         this.aa = (var2 - this.ag.az((byte)0) * 64) * 1852671241;
      }
   }

   public void fh(int var1, int var2) {
      if (null != this.ag && this.ag.aj(var1, var2, (byte)98)) {
         this.al = (var1 - this.ag.ar((byte)7) * 64) * 987156127;
         this.aa = (var2 - this.ag.az((byte)0) * 64) * 1852671241;
      }
   }

   public void cu(pe var1, pe var2, pe var3, qi var4, HashMap var5, vc[] var6) {
      this.ar = var6;
      this.as = var1;
      this.ae = var2;
      this.am = var3;
      this.ao = var4;
      this.af = new HashMap();
      this.af.put(kv.ap, var5.get(at));
      this.af.put(kv.aw, var5.get(au));
      this.af.put(kv.ak, var5.get(an));
      this.av = new ub(var1);
      int var7 = this.as.cf(lc.ap.ay, (byte)95);
      int[] var8 = this.as.be(var7, 2099205880);
      int var9 = var8 == null ? 0 : var8.length;
      this.ab = new HashMap(var9);

      for(int var10 = 0; var10 < var9; ++var10) {
         vl var11 = new vl(this.as.bm(var7, var8[var10], 1832184071));
         kp var12 = new kp();
         var12.ap(var11, var8[var10], 352560029);
         this.ab.put(var12.at(-924398267), var12);
         if (var12.am(1377577087)) {
            this.az = var12;
         }
      }

      this.ab(this.az, (byte)114);
      this.ad = null;
   }

   public void fl(int var1, int var2, int var3) {
      if (null != this.ag) {
         int[] var4 = this.ag.ai(var1, var2, var3, 1715505219);
         if (null != var4) {
            this.bb(var4[0], var4[1], 1105203222);
         }

      }
   }

   public void fn(int var1, int var2, int var3) {
      if (null != this.ag) {
         int[] var4 = this.ag.ai(var1, var2, var3, -1017572095);
         if (null != var4) {
            this.bb(var4[0], var4[1], 1105203222);
         }

      }
   }

   public void fd(int var1, int var2, int var3) {
      if (null != this.ag) {
         int[] var4 = this.ag.ai(var1, var2, var3, 383401122);
         if (null != var4) {
            this.bb(var4[0], var4[1], 1105203222);
         }

      }
   }

   public void fm(int var1, int var2, int var3) {
      if (null != this.ag) {
         int[] var4 = this.ag.ai(var1, var2, var3, -939143751);
         if (null != var4) {
            this.bq(var4[0], var4[1], (byte)-107);
         }

      }
   }

   public boolean hq(int var1) {
      return !this.bi.contains(var1);
   }

   public void et() {
      this.av.aw(-2008772970);
   }

   public void bm(int var1, int var2) {
      try {
         if (var1 >= 1) {
            if (var2 == 1698804345) {
               throw new IllegalStateException();
            }

            this.bq = var1 * -1453949493;
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "uc.bm(" + ')');
      }
   }

   public nn fr() {
      return null == this.ag ? null : this.ag.ay(this.bc(-676656094), this.by(1695093223), -15213661);
   }

   public nn fe() {
      return null == this.ag ? null : this.ag.ay(this.bc(-909024571), this.by(264647910), -1138769432);
   }

   public int ft() {
      return 1606362793 * this.bj;
   }

   public void gl() {
      this.bq = 316969382;
   }

   public kp ar(int var1) {
      try {
         return this.ag;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "uc.ar(" + ')');
      }
   }

   public void fq(int var1) {
      if (var1 >= 1) {
         this.bb = var1 * 542701595;
      }

   }

   public void fk() {
      this.bb = 1628104785;
   }

   public void fs() {
      this.bb = 1628104785;
   }

   public int fx() {
      return 89536797 * this.bv;
   }

   public void fy() {
      this.bb = 733454846;
   }

   public void dt(int var1) {
      kp var2 = this.bk(var1, -1917083407);
      if (var2 != null) {
         this.ab(var2, (byte)68);
      }

   }

   public void gp(int var1) {
      if (var1 >= 1) {
         this.bq = var1 * -1453949493;
      }

   }

   final void dq() {
      this.bt = 661611049;
      this.bu = 376539793;
      this.bn = -1035378323;
      this.br = -980739537;
   }

   public nn cn(int var1, nn var2, int var3) {
      try {
         if (!this.av.ak(-1531185429)) {
            if (var3 == -744438532) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if (!this.ac.ae(1401289057)) {
            if (var3 == -744438532) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if (!this.ag.aj(1601399073 * var2.aw, var2.ak * -1982010185, (byte)104)) {
            if (var3 == -744438532) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            HashMap var4 = this.ac.at(1630427823);
            List var5 = (List)var4.get(var1);
            if (var5 != null) {
               if (var3 == -744438532) {
                  throw new IllegalStateException();
               }

               if (!var5.isEmpty()) {
                  lx var6 = null;
                  int var7 = -1;
                  Iterator var8 = var5.iterator();

                  while(var8.hasNext()) {
                     if (var3 == -744438532) {
                        throw new IllegalStateException();
                     }

                     lx var9 = (lx)var8.next();
                     int var10 = var9.as.aw * 1601399073 - 1601399073 * var2.aw;
                     int var11 = -1982010185 * var9.as.ak - -1982010185 * var2.ak;
                     int var12 = var10 * var10 + var11 * var11;
                     if (var12 == 0) {
                        if (var3 == -744438532) {
                           throw new IllegalStateException();
                        }

                        return var9.as;
                     }

                     if (var12 >= var7) {
                        if (var3 == -744438532) {
                           throw new IllegalStateException();
                        }

                        if (null != var6) {
                           continue;
                        }
                     }

                     var6 = var9;
                     var7 = var12;
                  }

                  return var6.as;
               }
            }

            return null;
         }
      } catch (RuntimeException var13) {
         throw tm.aw(var13, "uc.cn(" + ')');
      }
   }

   public void gn() {
      this.bq = 316969382;
   }

   public int dx() {
      return this.ag == null ? -1 : this.ag.ae((short)-3057);
   }

   public void gy(boolean var1) {
      this.bp = var1;
   }

   public void gm() {
      this.bz = null;
   }

   public void ga(boolean var1) {
      this.bp = var1;
   }

   public void gf(int var1) {
      this.bz = new HashSet();
      this.bz.add(var1);
      this.bc = 0;
      this.by = 0;
   }

   public void gv(int var1) {
      this.bz = new HashSet();
      this.bz.add(var1);
      this.bc = 0;
      this.by = 0;
   }

   public void fw(int var1, int var2) {
      if (null != this.ag && this.ag.aj(var1, var2, (byte)111)) {
         this.al = (var1 - this.ag.ar((byte)36) * 64) * 987156127;
         this.aa = (var2 - this.ag.az((byte)0) * -172921307) * -1083685506;
      }
   }

   public void gh(int var1) {
      this.bz = new HashSet();
      this.bc = 0;
      this.by = 0;

      for(int var2 = 0; var2 < 1120059971 * ni.ak; ++var2) {
         if (ar.aw(var2, 1773275210) != null && ar.aw(var2, 1664574309).aa * 1418002937 == var1) {
            this.bz.add(ar.aw(var2, 1938116524).ai * -1268897243);
         }
      }

   }

   public void gx() {
      this.bz = null;
   }

   public void gw() {
      this.bz = null;
   }

   public int bc(int var1) {
      try {
         return this.ag == null ? -1 : this.ax * -300773559 + this.ag.ar((byte)15) * 64;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "uc.bc(" + ')');
      }
   }

   public boolean cb(int var1, int var2) {
      try {
         return !this.bf.contains(var1);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "uc.cb(" + ')');
      }
   }

   public void gd() {
      this.bq = 316969382;
   }

   public void gi(boolean var1) {
      this.be = !var1;
   }

   public void gz(int var1, boolean var2) {
      if (!var2) {
         this.bi.add(var1);
      } else {
         this.bi.remove(var1);
      }

      this.cd(1073391696);
   }

   public void fg(int var1, int var2, int var3) {
      if (null != this.ag) {
         int[] var4 = this.ag.ai(var1, var2, var3, 1305977489);
         if (null != var4) {
            this.bq(var4[0], var4[1], (byte)-106);
         }

      }
   }

   public void gu(int var1, boolean var2) {
      if (!var2) {
         this.bf.add(var1);
      } else {
         this.bf.remove(var1);
      }

      for(int var3 = 0; var3 < ni.ak * -1191741605; ++var3) {
         if (ar.aw(var3, 1813881355) != null && ar.aw(var3, 1533732566).aa * 1418002937 == var1) {
            int var4 = ar.aw(var3, 2065197376).ai * -1268897243;
            if (!var2) {
               this.bg.add(var4);
            } else {
               this.bg.remove(var4);
            }
         }
      }

      this.cd(1207243547);
   }

   public void gt(int var1, boolean var2) {
      if (!var2) {
         this.bf.add(var1);
      } else {
         this.bf.remove(var1);
      }

      for(int var3 = 0; var3 < ni.ak * -1191741605; ++var3) {
         if (ar.aw(var3, 1543416734) != null && ar.aw(var3, 1985575363).aa * 357051026 == var1) {
            int var4 = ar.aw(var3, 1862113630).ai * -1268897243;
            if (!var2) {
               this.bg.add(var4);
            } else {
               this.bg.remove(var4);
            }
         }
      }

      this.cd(1865587069);
   }

   public boolean gs() {
      return !this.be;
   }

   public boolean ge() {
      return !this.be;
   }

   public boolean gk(int var1) {
      return !this.bi.contains(var1);
   }

   public boolean hr(int var1) {
      return !this.bi.contains(var1);
   }

   public void gg(int var1) {
      this.bz = new HashSet();
      this.bz.add(var1);
      this.bc = 0;
      this.by = 0;
   }

   public void fi(int var1) {
      if (var1 >= 1) {
         this.bq = var1 * -1453949493;
      }

   }

   public boolean hu(int var1) {
      return !this.bf.contains(var1);
   }

   public void av(byte var1) {
      try {
         kb.ai.as();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "uc.av(" + ')');
      }
   }

   public boolean ho(int var1) {
      return !this.bf.contains(var1);
   }

   public boolean hd(int var1) {
      return !this.bf.contains(var1);
   }

   public boolean he(int var1) {
      return !this.bf.contains(var1);
   }

   void ht() {
      this.bl.clear();
      this.bl.addAll(this.bi);
      this.bl.addAll(this.bg);
   }

   public void hf(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.av.ak(223038623)) {
         int var7 = (int)Math.ceil((double)((float)var3 / this.ah));
         int var8 = (int)Math.ceil((double)((float)var4 / this.ah));
         List var9 = this.ac.ay(1979890767 * this.ax - var7 / 2 - 1, this.aq * -200749199 - var8 / 2 - 1, 1 + this.ax * -300773559 + var7 / 2, this.aq * 480665201 + var8 / 2 + 1, var1, var2, var3, var4, var5, var6, -1639937944);
         if (!var9.isEmpty()) {
            Iterator var10 = var9.iterator();

            boolean var13;
            do {
               if (!var10.hasNext()) {
                  return;
               }

               lx var11 = (lx)var10.next();
               hc var12 = ar.aw(var11.aw(-886506330), 1987152862);
               var13 = false;

               for(int var14 = this.cd.length - 1; var14 >= 0; --var14) {
                  if (null != var12.af[var14]) {
                     on.lp(var12.af[var14], var12.ar, this.cd[var14], var11.aw(-838016288), var11.ae.aw(-1463581567), var11.as.aw(-1341485999), 1902073199);
                     var13 = true;
                  }
               }
            } while(!var13);

         }
      }
   }

   public void hi(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.av.ak(-1130382461)) {
         int var7 = (int)Math.ceil((double)((float)var3 / this.ah));
         int var8 = (int)Math.ceil((double)((float)var4 / this.ah));
         List var9 = this.ac.ay(-300773559 * this.ax - var7 / 2 - 1, this.aq * -506005999 - var8 / 2 - 1, 1 + this.ax * -300773559 + var7 / 2, this.aq * -506005999 + var8 / 2 + 1, var1, var2, var3, var4, var5, var6, -2136180934);
         if (!var9.isEmpty()) {
            Iterator var10 = var9.iterator();

            boolean var13;
            do {
               if (!var10.hasNext()) {
                  return;
               }

               lx var11 = (lx)var10.next();
               hc var12 = ar.aw(var11.aw(1919710543), 1628590062);
               var13 = false;

               for(int var14 = this.cd.length - 1; var14 >= 0; --var14) {
                  if (null != var12.af[var14]) {
                     on.lp(var12.af[var14], var12.ar, this.cd[var14], var11.aw(-61738751), var11.ae.aw(-1601688836), var11.as.aw(-1976967460), 641780165);
                     var13 = true;
                  }
               }
            } while(!var13);

         }
      }
   }

   public void dm(int var1) {
      kp var2 = this.bk(var1, -623605624);
      if (var2 != null) {
         this.ab(var2, (byte)97);
      }

   }

   public boolean ha(int var1) {
      return !this.bf.contains(var1);
   }

   public int bu(int var1) {
      try {
         return 89536797 * this.bv;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "uc.bu(" + ')');
      }
   }

   public void an(int var1, int var2, int var3, boolean var4, int var5) {
      try {
         kp var6 = this.au(var1, var2, var3, (byte)98);
         if (var6 == null) {
            if (var5 >= 274578077) {
               throw new IllegalStateException();
            }

            if (!var4) {
               return;
            }

            var6 = this.az;
         }

         boolean var7;
         label52: {
            var7 = false;
            if (var6 == this.ad) {
               if (var5 >= 274578077) {
                  throw new IllegalStateException();
               }

               if (!var4) {
                  break label52;
               }

               if (var5 >= 274578077) {
                  return;
               }
            }

            this.ad = var6;
            this.ab(var6, (byte)45);
            var7 = true;
         }

         if (!var7) {
            if (var5 >= 274578077) {
               throw new IllegalStateException();
            }

            if (!var4) {
               return;
            }

            if (var5 >= 274578077) {
               throw new IllegalStateException();
            }
         }

         this.ad(var1, var2, var3, 20100484);
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "uc.an(" + ')');
      }
   }

   public int eo() {
      if ((double)this.bh == 1.0D) {
         return 25;
      } else if (1.5D == (double)this.bh) {
         return 37;
      } else if ((double)this.bh == 2.0D) {
         return 50;
      } else if ((double)this.bh == 3.0D) {
         return 892542772;
      } else {
         return (double)this.bh == 4.0D ? -2138866440 : -150996509;
      }
   }

   public void du(int var1, int var2, int var3, boolean var4) {
      kp var5 = this.au(var1, var2, var3, (byte)94);
      if (var5 == null) {
         if (!var4) {
            return;
         }

         var5 = this.az;
      }

      boolean var6 = false;
      if (var5 != this.ad || var4) {
         this.ad = var5;
         this.ab(var5, (byte)88);
         var6 = true;
      }

      if (var6 || var4) {
         this.ad(var1, var2, var3, 957021634);
      }

   }

   public static vp[] ap(byte var0) {
      try {
         return new vp[]{vp.ap, vp.aw, vp.ak};
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "uc.ap(" + ')');
      }
   }
}
