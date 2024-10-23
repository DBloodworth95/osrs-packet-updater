import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class tu {
   nm cx = null;
   static final tw ar;
   final int[] cf = new int[]{1008, 1009, 1010, 1011, 1012};
   float ak;
   po at;
   int bi = -1968736091;
   lb as;
   static final tw al;
   static final tw ad;
   qu ah;
   HashMap ap;
   vt[] ab;
   HashMap az;
   ky aa;
   ky ai;
   ky ao;
   int bx = -2114117793;
   static final int ag = 8;
   int aj;
   static final int ac = -65536;
   int aw = 1208799441;
   int bm = -948203037;
   public boolean ci = false;
   int av;
   int bh = -497554139;
   int bd = 220865329;
   int cv = 207237605;
   int bf = -470944219;
   static final float am = 30.0F;
   float bn;
   tp ay;
   HashSet ba = null;
   int bj = -1386218243;
   int bp = -812189929;
   int by = -411251463;
   int bb = 2134450897;
   int cn = 0;
   po af;
   long bl;
   int bz;
   int bu;
   int bs = -210754146;
   HashSet bt = new HashSet();
   HashSet bq = new HashSet();
   HashSet bk = new HashSet();
   HashSet be = new HashSet();
   boolean bc = false;
   int bg = 324491685;
   static final int ch = 100;
   po au;
   List cu;
   Iterator cm;
   HashSet cj = new HashSet();
   int an = -623225461;
   boolean br = true;
   vv cy;
   int co;
   boolean bw = false;
   int cg = -89572507;
   int ct = -681426079;

   public void ad(int var1, int var2, int var3, boolean var4, int var5) {
      try {
         ky var6 = this.al(var1, var2, var3, 1189546801);
         if (null == var6) {
            if (!var4) {
               return;
            }

            if (var5 != -881657651) {
               throw new IllegalStateException();
            }

            var6 = this.aa;
         }

         boolean var7;
         label52: {
            var7 = false;
            if (var6 == this.ao) {
               if (var5 != -881657651) {
                  throw new IllegalStateException();
               }

               if (!var4) {
                  break label52;
               }

               if (var5 != -881657651) {
                  return;
               }
            }

            this.ao = var6;
            this.az(var6, 216931292);
            var7 = true;
         }

         if (!var7) {
            if (var5 != -881657651) {
               throw new IllegalStateException();
            }

            if (!var4) {
               return;
            }

            if (var5 != -881657651) {
               throw new IllegalStateException();
            }
         }

         this.ao(var1, var2, var3, 1513546936);
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "tu.ad(" + ')');
      }
   }

   void hw() {
      this.be.clear();
      this.be.addAll(this.bt);
      this.be.addAll(this.bk);
   }

   public void ae(int var1) {
      try {
         ax.ag(-252508775);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tu.ae(" + ')');
      }
   }

   public void ag(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         if (!this.ay.ag(-577540417)) {
            if (var8 >= 77127323) {
               throw new IllegalStateException();
            }
         } else {
            this.aq((byte)20);
            this.af(-126131204);
            if (var3) {
               int var9 = (int)Math.ceil((double)((float)var6 / this.ak));
               int var10 = (int)Math.ceil((double)((float)var7 / this.ak));
               List var11 = this.as.aq(1861568259 * this.aj - var9 / 2 - 1, this.av * 187491643 - var10 / 2 - 1, 1 + 1861568259 * this.aj + var9 / 2, 1 + var10 / 2 + 187491643 * this.av, var4, var5, var6, var7, var1, var2, -114134146);
               HashSet var12 = new HashSet();

               Iterator var13;
               ly var14;
               do var15;
               li var16;
               for(var13 = var11.iterator(); var13.hasNext(); ij.ac(var15, -1810601731)) {
                  if (var8 >= 77127323) {
                     throw new IllegalStateException();
                  }

                  var14 = (ly)var13.next();
                  var12.add(var14);
                  var15 = new do();
                  var16 = new li(var14.ae(-1570517373), var14.at, var14.af);
                  var15.ac(new Object[]{var16, var1, var2}, 549027875);
                  if (this.cj.contains(var14)) {
                     if (var8 >= 77127323) {
                        return;
                     }

                     var15.ae(17, -433923729);
                  } else {
                     var15.ae(15, -1444648796);
                  }
               }

               var13 = this.cj.iterator();

               while(var13.hasNext()) {
                  var14 = (ly)var13.next();
                  if (!var12.contains(var14)) {
                     if (var8 >= 77127323) {
                        throw new IllegalStateException();
                     }

                     var15 = new do();
                     var16 = new li(var14.ae(-1570517373), var14.at, var14.af);
                     var15.ac(new Object[]{var16, var1, var2}, 209200502);
                     var15.ae(16, 390142797);
                     ij.ac(var15, -2106960813);
                  }
               }

               this.cj = var12;
            }
         }
      } catch (RuntimeException var17) {
         throw vk.ae(var17, "tu.ag(" + ')');
      }
   }

   public void am(int var1, int var2, boolean var3, boolean var4, int var5) {
      try {
         long var6;
         label57: {
            var6 = hf.ac(-1598214665);
            this.ax(var1, var2, var4, var6);
            if (!this.ar(330108021)) {
               if (var5 <= 1148087439) {
                  return;
               }

               if ((var4 || var3) && !dr.ps(996593762)) {
                  if (var4) {
                     if (var5 <= 1148087439) {
                        return;
                     }

                     this.bi = 1968736091 * var1;
                     this.bg = var2 * -324491685;
                     this.by = -2073851371 * this.aj;
                     this.bb = -1698429739 * this.av;
                  }

                  if (this.by * 548784823 != -1) {
                     if (var5 <= 1148087439) {
                        throw new IllegalStateException();
                     }

                     int var8 = var1 - -1040953133 * this.bi;
                     int var9 = var2 - 1178606035 * this.bg;
                     this.at(548784823 * this.by - (int)((float)var8 / this.bn), this.bb * -683963953 + (int)((float)var9 / this.bn), false, (byte)-89);
                  }
                  break label57;
               }
            }

            this.au((byte)-50);
         }

         if (var4) {
            if (var5 <= 1148087439) {
               throw new IllegalStateException();
            }

            this.bl = var6 * 1337978693927236525L;
            this.bz = 826321101 * var1;
            this.bu = 1443880831 * var2;
         }

      } catch (RuntimeException var10) {
         throw vk.ae(var10, "tu.am(" + ')');
      }
   }

   public void ea(ky var1, nm var2, nm var3, boolean var4) {
      if (var1 != null) {
         if (this.ai == null || var1 != this.ai) {
            this.aa(var1, 1374935406);
         }

         if (!var4 && this.ai.ag(-1687269157 * var2.ac, var2.ae * -1763049545, var2.ag * 1162074139, -663440538)) {
            this.ao(-1687269157 * var2.ac, var2.ae * -1763049545, 1162074139 * var2.ag, 1513546936);
         } else {
            this.ao(-1687269157 * var3.ac, -1763049545 * var3.ae, var3.ag * 1162074139, 1513546936);
         }

      }
   }

   void aq(byte var1) {
      try {
         if (null != on.wp) {
            this.ak = this.bn;
         } else {
            if (this.ak < this.bn) {
               if (var1 != 20) {
                  throw new IllegalStateException();
               }

               this.ak = Math.min(this.bn, this.ak + this.ak / 30.0F);
            }

            if (this.ak > this.bn) {
               if (var1 != 20) {
                  return;
               }

               this.ak = Math.max(this.bn, this.ak - this.ak / 30.0F);
            }

         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tu.aq(" + ')');
      }
   }

   public void cj(int var1, int var2, nm var3, nm var4, int var5) {
      try {
         do var6 = new do();
         li var7 = new li(var2, var3, var4);
         var6.ac(new Object[]{var7}, 1710509453);
         switch(var1) {
         case 1008:
            var6.ae(10, -1842794602);
            break;
         case 1009:
            var6.ae(11, -1119484418);
            break;
         case 1010:
            var6.ae(12, -326581600);
            break;
         case 1011:
            var6.ae(13, 1028516151);
            break;
         case 1012:
            var6.ae(14, -1068924383);
         }

         ij.ac(var6, -2100092269);
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "tu.cj(" + ')');
      }
   }

   public nm fl() {
      return null == this.ai ? null : this.ai.aq(this.bj(571920431), this.bp(-1015439491), -2132539718);
   }

   final void au(byte var1) {
      try {
         this.bg = 324491685;
         this.bi = -1968736091;
         this.bb = 2134450897;
         this.by = -411251463;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tu.au(" + ')');
      }
   }

   boolean ar(int var1) {
      try {
         boolean var10000;
         if (-202213425 * this.aw != -1) {
            if (var1 != 330108021) {
               throw new IllegalStateException();
            }

            if (1593267677 * this.an != -1) {
               if (var1 != 330108021) {
                  throw new IllegalStateException();
               }

               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tu.ar(" + ')');
      }
   }

   public ky al(int var1, int var2, int var3, int var4) {
      try {
         Iterator var5 = this.az.values().iterator();

         ky var6;
         do {
            if (!var5.hasNext()) {
               return null;
            }

            if (var4 >= 1715968623) {
               throw new IllegalStateException();
            }

            var6 = (ky)var5.next();
         } while(!var6.ag(var1, var2, var3, -385738037));

         if (var4 >= 1715968623) {
            throw new IllegalStateException();
         } else {
            return var6;
         }
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "tu.al(" + ')');
      }
   }

   public void gt(int var1) {
      this.ba = new HashSet();
      this.bj = 0;
      this.bp = 0;

      for(int var2 = 0; var2 < rp.ag * -566466219; ++var2) {
         if (fq.ac(var2, 103923568) != null && fq.ac(var2, -2030695242).an * -1050328213 == var1) {
            this.ba.add(fq.ac(var2, 1341771957).ax * 1901462683);
         }
      }

   }

   void ex(int var1, int var2, int var3) {
      if (this.ai != null) {
         int[] var4 = this.ai.ax(var1, var2, var3, (short)180);
         if (null == var4) {
            var4 = this.ai.ax(this.ai.as(1308329458), this.ai.ao(1445365364), this.ai.ay(1427457177), (short)180);
         }

         this.at(var4[0] - this.ai.ab(-371450361) * 64, var4[1] - this.ai.aa(-1991824832) * 64, true, (byte)-30);
         this.aw = 1208799441;
         this.an = -623225461;
         this.ak = this.bn(this.ai.ap(1636319148), (byte)32);
         this.bn = this.ak;
         this.cu = null;
         this.cm = null;
         this.as.ae(911030233);
      }
   }

   public int ap(int var1) {
      try {
         return this.ai == null ? -1 : this.ai.at((byte)21);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tu.ap(" + ')');
      }
   }

   public ky ab(int var1) {
      try {
         return this.ai;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tu.ab(" + ')');
      }
   }

   public int fd() {
      return this.ai == null ? -1 : this.aj * 1861568259 + this.ai.ab(-1268806446) * 64;
   }

   void aa(ky var1, int var2) {
      try {
         this.ai = var1;
         this.as = new lb(this.ab, this.ap, this.at, this.au);
         tp var10000 = this.ay;
         String var10001;
         if (this.ai == null) {
            if (var2 == -1746373284) {
               throw new IllegalStateException();
            }

            var10001 = null;
         } else {
            var10001 = this.ai.ar(-1773552748);
         }

         var10000.ac(var10001, -1125889549);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "tu.aa(" + ')');
      }
   }

   public void hb(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.ay.ag(1721579818)) {
         int var7 = (int)Math.ceil((double)((float)var3 / this.ak));
         int var8 = (int)Math.ceil((double)((float)var4 / this.ak));
         List var9 = this.as.aq(1861568259 * this.aj - var7 / 2 - 1, 187491643 * this.av - var8 / 2 - 1, 1 + var7 / 2 + this.aj * 1861568259, 1 + var8 / 2 + 187491643 * this.av, var1, var2, var3, var4, var5, var6, 421582780);
         if (!var9.isEmpty()) {
            Iterator var10 = var9.iterator();

            boolean var13;
            do {
               if (!var10.hasNext()) {
                  return;
               }

               ly var11 = (ly)var10.next();
               hf var12 = fq.ac(var11.ae(-1570517373), 253724433);
               var13 = false;

               for(int var14 = this.cf.length - 1; var14 >= 0; --var14) {
                  if (var12.ap[var14] != null) {
                     jx.mg(var12.ap[var14], var12.ab, this.cf[var14], var11.ae(-1570517373), var11.at.ae((byte)85), var11.af.ae((byte)105), (byte)-83);
                     var13 = true;
                  }
               }
            } while(!var13);

         }
      }
   }

   public int bp(int var1) {
      try {
         if (null == this.ai) {
            if (var1 == -1553902872) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return this.av * 187491643 + this.ai.aa(-1888632059) * 64;
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tu.bp(" + ')');
      }
   }

   public void ht(int var1, int var2, nm var3, nm var4) {
      do var5 = new do();
      li var6 = new li(var2, var3, var4);
      var5.ac(new Object[]{var6}, 2088505373);
      switch(var1) {
      case 1008:
         var5.ae(10, -2040515080);
         break;
      case 1009:
         var5.ae(11, 345818228);
         break;
      case 1010:
         var5.ae(12, -341039894);
         break;
      case 1011:
         var5.ae(13, 2010717867);
         break;
      case 1012:
         var5.ae(14, -1752316003);
      }

      ij.ac(var5, -1785837451);
   }

   public void ay(int var1) {
      try {
         as.ae((byte)-104);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tu.ay(" + ')');
      }
   }

   boolean aj(int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      try {
         if (this.cy == null) {
            if (var7 == 74) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            if (var1 == this.cy.ae) {
               if (var7 == 74) {
                  throw new IllegalStateException();
               }

               if (var2 == this.cy.ag) {
                  if (1490822713 * this.as.az != this.co * -1600026175) {
                     if (var7 == 74) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }

                  if (this.ct * -796369057 != 1873696417 * client.wg) {
                     if (var7 == 74) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }

                  if (var3 <= 0) {
                     if (var7 == 74) {
                        throw new IllegalStateException();
                     }

                     if (var4 <= 0) {
                        if (var3 + var1 >= var5) {
                           if (var7 == 74) {
                              throw new IllegalStateException();
                           }

                           if (var2 + var4 >= var6) {
                              return false;
                           }
                        }

                        return true;
                     }

                     if (var7 == 74) {
                        throw new IllegalStateException();
                     }
                  }

                  return true;
               }
            }

            return true;
         }
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "tu.aj(" + ')');
      }
   }

   public boolean bc(int var1) {
      try {
         boolean var10000;
         if (!this.bc) {
            if (var1 == 1383258553) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tu.bc(" + ')');
      }
   }

   public ky dx(int var1, int var2, int var3) {
      Iterator var4 = this.az.values().iterator();

      ky var5;
      do {
         if (!var4.hasNext()) {
            return null;
         }

         var5 = (ky)var4.next();
      } while(!var5.ag(var1, var2, var3, -952996560));

      return var5;
   }

   void af(int var1) {
      try {
         if (!this.ar(330108021)) {
            if (var1 == -14397227) {
               throw new IllegalStateException();
            }
         } else {
            int var2 = this.aw * -202213425 - 1861568259 * this.aj;
            int var3 = this.an * 1593267677 - this.av * 187491643;
            if (var2 != 0) {
               if (var1 == -14397227) {
                  return;
               }

               var2 /= Math.min(8, Math.abs(var2));
            }

            if (0 != var3) {
               if (var1 == -14397227) {
                  throw new IllegalStateException();
               }

               var3 /= Math.min(8, Math.abs(var3));
            }

            this.at(var2 + this.aj * 1861568259, var3 + this.av * 187491643, true, (byte)-114);
            if (-202213425 * this.aw == this.aj * 1861568259) {
               if (var1 == -14397227) {
                  return;
               }

               if (this.an * 1593267677 == 187491643 * this.av) {
                  if (var1 == -14397227) {
                     throw new IllegalStateException();
                  }

                  this.aw = 1208799441;
                  this.an = -623225461;
               }
            }

         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "tu.af(" + ')');
      }
   }

   void ak(int var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         byte var7 = 20;
         int var8 = var3 / 2 + var1;
         int var9 = var4 / 2 + var2 - 18 - var7;
         vr.fr(var1, var2, var3, var4, -16777216);
         vr.fs(var8 - 152, var9, 304, 34, -65536);
         vr.fr(var8 - 150, var9 + 2, var5 * 3, 30, -65536);
         this.ah.ay(ok.mq, var8, var7 + var9, -1, -1);
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "tu.ak(" + ')');
      }
   }

   public void fg(int var1, int var2, int var3) {
      if (this.ai != null) {
         int[] var4 = this.ai.ax(var1, var2, var3, (short)180);
         if (null != var4) {
            this.bm(var4[0], var4[1], 421697312);
         }

      }
   }

   public int bh(int var1) {
      try {
         if ((double)this.bn == 1.0D) {
            if (var1 != 1753166261) {
               throw new IllegalStateException();
            } else {
               return 25;
            }
         } else if ((double)this.bn == 1.5D) {
            return 37;
         } else if (2.0D == (double)this.bn) {
            return 50;
         } else if (3.0D == (double)this.bn) {
            if (var1 != 1753166261) {
               throw new IllegalStateException();
            } else {
               return 75;
            }
         } else if ((double)this.bn == 4.0D) {
            if (var1 != 1753166261) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else {
            return 200;
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tu.bh(" + ')');
      }
   }

   public void bd(int var1) {
      try {
         this.ay.ae(-1311569229);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tu.bd(" + ')');
      }
   }

   public boolean bx(int var1) {
      try {
         return this.ay.ag(1571613143);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tu.bx(" + ')');
      }
   }

   public ky bf(int var1, int var2) {
      try {
         Iterator var3 = this.az.values().iterator();

         ky var4;
         do {
            if (!var3.hasNext()) {
               return null;
            }

            if (var2 <= -1975882559) {
               throw new IllegalStateException();
            }

            var4 = (ky)var3.next();
         } while(var4.at((byte)88) != var1);

         if (var2 <= -1975882559) {
            throw new IllegalStateException();
         } else {
            return var4;
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "tu.bf(" + ')');
      }
   }

   public void fo(int var1, int var2, int var3) {
      if (null != this.ai) {
         int[] var4 = this.ai.ax(var1, var2, var3, (short)180);
         if (null != var4) {
            this.bs(var4[0], var4[1], -52871423);
         }

      }
   }

   public void bs(int var1, int var2, int var3) {
      try {
         if (null == this.ai) {
            if (var3 != -52871423) {
               throw new IllegalStateException();
            }
         } else {
            this.at(var1 - this.ai.ab(-1837692291) * 64, var2 - this.ai.aa(-1928438165) * 64, true, (byte)-32);
            this.aw = 1208799441;
            this.an = -623225461;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "tu.bs(" + ')');
      }
   }

   public void bw(int var1, int var2, int var3, byte var4) {
      try {
         if (this.ai == null) {
            if (var4 != 14) {
               throw new IllegalStateException();
            }
         } else {
            int[] var5 = this.ai.ax(var1, var2, var3, (short)180);
            if (null != var5) {
               if (var4 != 14) {
                  return;
               }

               this.bm(var5[0], var5[1], 421697312);
            }

         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "tu.bw(" + ')');
      }
   }

   public void ba(int var1, int var2, int var3, byte var4) {
      try {
         if (null == this.ai) {
            if (var4 != 2) {
               throw new IllegalStateException();
            }
         } else {
            int[] var5 = this.ai.ax(var1, var2, var3, (short)180);
            if (null != var5) {
               this.bs(var5[0], var5[1], -52871423);
            }

         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "tu.ba(" + ')');
      }
   }

   public int bj(int var1) {
      try {
         if (this.ai == null) {
            if (var1 >= 1242334429) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return this.aj * 1861568259 + this.ai.ab(-341163060) * 64;
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tu.bj(" + ')');
      }
   }

   public void cs(int var1, int var2, boolean var3, boolean var4) {
      long var5 = hf.ac(-1598214665);
      this.ax(var1, var2, var4, var5);
      if (!this.ar(330108021) && (var4 || var3) && !dr.ps(635803633)) {
         if (var4) {
            this.bi = 1968736091 * var1;
            this.bg = var2 * -324491685;
            this.by = -2073851371 * this.aj;
            this.bb = -1698429739 * this.av;
         }

         if (this.by * 548784823 != -1) {
            int var7 = var1 - -1040953133 * this.bi;
            int var8 = var2 - 1178606035 * this.bg;
            this.at(548784823 * this.by - (int)((float)var7 / this.bn), this.bb * -683963953 + (int)((float)var8 / this.bn), false, (byte)-122);
         }
      } else {
         this.au((byte)-70);
      }

      if (var4) {
         this.bl = var5 * 1337978693927236525L;
         this.bz = 826321101 * var1;
         this.bu = 1443880831 * var2;
      }

   }

   public nm by(int var1) {
      try {
         if (null == this.ai) {
            if (var1 <= -474857979) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return this.ai.aq(this.bj(612232751), this.bp(25499801), -2120070809);
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tu.by(" + ')');
      }
   }

   public void cq() {
      ax.ag(66934519);
   }

   public int bi(short var1) {
      try {
         return this.bd * -1393186257;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tu.bi(" + ')');
      }
   }

   float eq(int var1) {
      if (25 == var1) {
         return 1.0F;
      } else if (37 == var1) {
         return 1.5F;
      } else if (50 == var1) {
         return 2.0F;
      } else if (var1 == 1750627280) {
         return 3.0F;
      } else {
         return var1 == 100 ? 4.0F : 8.0F;
      }
   }

   public void bl(short var1) {
      try {
         this.bm = -948203037;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tu.bl(" + ')');
      }
   }

   public void ac(po var1, po var2, po var3, qu var4, HashMap var5, vt[] var6, byte var7) {
      try {
         this.ab = var6;
         this.af = var1;
         this.at = var2;
         this.au = var3;
         this.ah = var4;
         this.ap = new HashMap();
         this.ap.put(ko.ac, var5.get(ar));
         this.ap.put(ko.ae, var5.get(al));
         this.ap.put(ko.ag, var5.get(ad));
         this.ay = new tp(var1);
         int var8 = this.af.cg(lg.ac.aq, (short)15004);
         int[] var9 = this.af.cm(var8, 530965364);
         int var10000;
         if (null == var9) {
            if (var7 == 7) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = var9.length;
         }

         int var10 = var10000;
         this.az = new HashMap(var10);

         for(int var11 = 0; var11 < var10; ++var11) {
            if (var7 == 7) {
               throw new IllegalStateException();
            }

            vf var12 = new vf(this.af.bt(var8, var9[var11], (byte)88));
            ky var13 = new ky();
            var13.ac(var12, var9[var11], (byte)41);
            this.az.put(var13.ar(-1773552748), var13);
            if (var13.au(-803098184)) {
               this.aa = var13;
            }
         }

         this.az(this.aa, 983058506);
         this.ao = null;
      } catch (RuntimeException var14) {
         throw vk.ae(var14, "tu.ac(" + ')');
      }
   }

   public void bu(byte var1) {
      try {
         this.bs = -210754146;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tu.bu(" + ')');
      }
   }

   public void br(boolean var1, int var2) {
      try {
         this.bw = var1;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "tu.br(" + ')');
      }
   }

   public void bo(int var1, short var2) {
      try {
         this.ba = new HashSet();
         this.ba.add(var1);
         this.bj = 0;
         this.bp = 0;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "tu.bo(" + ')');
      }
   }

   public void ct() {
      ax.ag(819136942);
   }

   public void bt(int var1) {
      try {
         this.ba = null;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tu.bt(" + ')');
      }
   }

   public void bq(boolean var1, byte var2) {
      try {
         boolean var10001;
         if (!var1) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.bc = var10001;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "tu.bq(" + ')');
      }
   }

   public void bk(int var1, boolean var2, int var3) {
      try {
         if (!var2) {
            if (var3 >= 1477631925) {
               throw new IllegalStateException();
            }

            this.bt.add(var1);
         } else {
            this.bt.remove(var1);
         }

         this.cf(-2013730532);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "tu.bk(" + ')');
      }
   }

   public void be(int var1, boolean var2, byte var3) {
      try {
         if (!var2) {
            this.bq.add(var1);
         } else {
            this.bq.remove(var1);
         }

         for(int var4 = 0; var4 < rp.ag * -566466219; ++var4) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            if (fq.ac(var4, -1744460247) == null) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }
            } else if (fq.ac(var4, -903766078).an * -1050328213 == var1) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               int var5 = fq.ac(var4, -1453889175).ax * 1901462683;
               if (!var2) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  this.bk.add(var5);
               } else {
                  this.bk.remove(var5);
               }
            }
         }

         this.cf(-1873067233);
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "tu.be(" + ')');
      }
   }

   public void hh(int var1, int var2, nm var3, nm var4) {
      do var5 = new do();
      li var6 = new li(var2, var3, var4);
      var5.ac(new Object[]{var6}, 694722004);
      switch(var1) {
      case 1008:
         var5.ae(10, -1295471681);
         break;
      case 1009:
         var5.ae(11, 1825767129);
         break;
      case 1010:
         var5.ae(12, 771736633);
         break;
      case 1011:
         var5.ae(13, 570532457);
         break;
      case 1012:
         var5.ae(14, 699861827);
      }

      ij.ac(var5, -1927494959);
   }

   public nm cm(int var1, nm var2, int var3) {
      try {
         if (!this.ay.ag(-779939367)) {
            if (var3 != 2105917750) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if (!this.as.at((byte)114)) {
            if (var3 != 2105917750) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if (!this.ai.am(var2.ae * -1763049545, var2.ag * 1162074139, (byte)0)) {
            if (var3 != 2105917750) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            HashMap var4 = this.as.ar(2125302651);
            List var5 = (List)var4.get(var1);
            if (null != var5) {
               if (var3 != 2105917750) {
                  throw new IllegalStateException();
               }

               if (!var5.isEmpty()) {
                  ly var6 = null;
                  int var7 = -1;
                  Iterator var8 = var5.iterator();

                  while(true) {
                     ly var9;
                     int var12;
                     while(true) {
                        if (!var8.hasNext()) {
                           return var6.af;
                        }

                        var9 = (ly)var8.next();
                        int var10 = var9.af.ae * -1763049545 - var2.ae * -1763049545;
                        int var11 = var9.af.ag * 1162074139 - 1162074139 * var2.ag;
                        var12 = var11 * var11 + var10 * var10;
                        if (var12 == 0) {
                           if (var3 != 2105917750) {
                              throw new IllegalStateException();
                           }

                           return var9.af;
                        }

                        if (var12 < var7) {
                           break;
                        }

                        if (var3 != 2105917750) {
                           throw new IllegalStateException();
                        }

                        if (var6 == null) {
                           if (var3 != 2105917750) {
                              throw new IllegalStateException();
                           }
                           break;
                        }
                     }

                     var6 = var9;
                     var7 = var12;
                  }
               }

               if (var3 != 2105917750) {
                  throw new IllegalStateException();
               }
            }

            return null;
         }
      } catch (RuntimeException var13) {
         throw vk.ae(var13, "tu.cm(" + ')');
      }
   }

   public boolean ch(int var1, int var2) {
      try {
         boolean var10000;
         if (!this.bq.contains(var1)) {
            if (var2 != 260969437) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "tu.ch(" + ')');
      }
   }

   void cf(int var1) {
      try {
         this.be.clear();
         this.be.addAll(this.bt);
         this.be.addAll(this.bk);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tu.cf(" + ')');
      }
   }

   public void cu(int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      try {
         if (this.ay.ag(633133973)) {
            int var8 = (int)Math.ceil((double)((float)var3 / this.ak));
            int var9 = (int)Math.ceil((double)((float)var4 / this.ak));
            List var10 = this.as.aq(1861568259 * this.aj - var8 / 2 - 1, 187491643 * this.av - var9 / 2 - 1, 1 + var8 / 2 + this.aj * 1861568259, 1 + var9 / 2 + 187491643 * this.av, var1, var2, var3, var4, var5, var6, 1887997434);
            if (var10.isEmpty()) {
               if (var7 <= 1) {
                  throw new IllegalStateException();
               }
            } else {
               Iterator var11 = var10.iterator();

               boolean var14;
               do {
                  if (!var11.hasNext()) {
                     return;
                  }

                  if (var7 <= 1) {
                     return;
                  }

                  ly var12 = (ly)var11.next();
                  hf var13 = fq.ac(var12.ae(-1570517373), -1792593235);
                  var14 = false;

                  for(int var15 = this.cf.length - 1; var15 >= 0; --var15) {
                     if (var7 <= 1) {
                        throw new IllegalStateException();
                     }

                     if (var13.ap[var15] != null) {
                        jx.mg(var13.ap[var15], var13.ab, this.cf[var15], var12.ae(-1570517373), var12.at.ae((byte)92), var12.af.ae((byte)78), (byte)-120);
                        var14 = true;
                     }
                  }
               } while(!var14);

               if (var7 <= 1) {
                  throw new IllegalStateException();
               }
            }
         }
      } catch (RuntimeException var16) {
         throw vk.ae(var16, "tu.cu(" + ')');
      }
   }

   public nm hm(int var1, nm var2) {
      if (!this.ay.ag(2049625152)) {
         return null;
      } else if (!this.as.at((byte)120)) {
         return null;
      } else if (!this.ai.am(var2.ae * -1491579063, var2.ag * -1455757833, (byte)0)) {
         return null;
      } else {
         HashMap var3 = this.as.ar(2048588681);
         List var4 = (List)var3.get(var1);
         if (null != var4 && !var4.isEmpty()) {
            ly var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();

            while(true) {
               ly var8;
               int var11;
               do {
                  if (!var7.hasNext()) {
                     return var5.af;
                  }

                  var8 = (ly)var7.next();
                  int var9 = var8.af.ae * -1610297774 - var2.ae * -878081918;
                  int var10 = var8.af.ag * -557594572 - 1629838769 * var2.ag;
                  var11 = var10 * var10 + var9 * var9;
                  if (var11 == 0) {
                     return var8.af;
                  }
               } while(var11 >= var6 && var5 != null);

               var5 = var8;
               var6 = var11;
            }
         } else {
            return null;
         }
      }
   }

   public void ai(ky var1, nm var2, nm var3, boolean var4, byte var5) {
      try {
         if (var1 == null) {
            if (var5 <= 4) {
               throw new IllegalStateException();
            }
         } else {
            label46: {
               if (this.ai != null) {
                  if (var5 <= 4) {
                     throw new IllegalStateException();
                  }

                  if (var1 == this.ai) {
                     break label46;
                  }

                  if (var5 <= 4) {
                     return;
                  }
               }

               this.aa(var1, 2123111350);
            }

            if (!var4) {
               if (var5 <= 4) {
                  return;
               }

               if (this.ai.ag(-1687269157 * var2.ac, var2.ae * -1763049545, var2.ag * 1162074139, -960488312)) {
                  this.ao(-1687269157 * var2.ac, var2.ae * -1763049545, 1162074139 * var2.ag, 1513546936);
                  return;
               }

               if (var5 <= 4) {
                  throw new IllegalStateException();
               }
            }

            this.ao(-1687269157 * var3.ac, -1763049545 * var3.ae, var3.ag * 1162074139, 1513546936);
         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "tu.ai(" + ')');
      }
   }

   public void fj(int var1, int var2, int var3) {
      if (this.ai != null) {
         int[] var4 = this.ai.ax(var1, var2, var3, (short)180);
         if (null != var4) {
            this.bm(var4[0], var4[1], 421697312);
         }

      }
   }

   public int bb(byte var1) {
      try {
         return 96966995 * this.bh;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tu.bb(" + ')');
      }
   }

   void ax(int var1, int var2, boolean var3, long var4) {
      try {
         if (this.ai != null) {
            int var6 = (int)((float)(1861568259 * this.aj) + ((float)(var1 - 669451105 * this.bx) - (float)this.bb((byte)12) * this.ak / 2.0F) / this.ak);
            int var7 = (int)((float)(this.av * 187491643) - ((float)(var2 - this.bf * -48182701) - (float)this.bi((short)-18226) * this.ak / 2.0F) / this.ak);
            this.cx = this.ai.aq(var6 + this.ai.ab(-1562551633) * 64, var7 + this.ai.aa(-2042161730) * 64, -2145796312);
            if (null != this.cx && var3) {
               kh var8 = client.ss;
               if (dj.ph(1483868129) && var8.aa(82, 1770128204) && var8.aa(81, 1770128204)) {
                  ux.pz(this.cx.ae * -1763049545, 1162074139 * this.cx.ag, this.cx.ac * -1687269157, false, (byte)-50);
               } else {
                  boolean var10 = true;
                  if (this.br) {
                     int var11 = var1 - -914390011 * this.bz;
                     int var12 = var2 - -1108352897 * this.bu;
                     if (var4 - 2331784597243095077L * this.bl > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
                        var10 = false;
                     }
                  }

                  if (var10) {
                     mq var14 = fs.ac(mz.di, client.ia.ax, (byte)-10);
                     var14.ag.bv(this.cx.ae((byte)88), 1978626690);
                     client.ia.ag(var14, 1797535183);
                     this.bl = 0L;
                  }
               }
            }
         } else {
            this.cx = null;
         }

      } catch (RuntimeException var13) {
         throw vk.ae(var13, "tu.ax(" + ')');
      }
   }

   static {
      ar = tw.am;
      al = tw.ax;
      ad = tw.aq;
   }

   void ew(int var1, int var2, int var3) {
      if (this.ai != null) {
         int[] var4 = this.ai.ax(var1, var2, var3, (short)180);
         if (null == var4) {
            var4 = this.ai.ax(this.ai.as(1241747507), this.ai.ao(562456890), this.ai.ay(-1369615349), (short)180);
         }

         this.at(var4[0] - this.ai.ab(-1601635710) * 64, var4[1] - this.ai.aa(-1927084639) * -2086253207, true, (byte)-1);
         this.aw = 173903759;
         this.an = -536794978;
         this.ak = this.bn(this.ai.ap(620261933), (byte)25);
         this.bn = this.ak;
         this.cu = null;
         this.cm = null;
         this.as.ae(960797974);
      }
   }

   public void cv(po var1, po var2, po var3, qu var4, HashMap var5, vt[] var6) {
      this.ab = var6;
      this.af = var1;
      this.at = var2;
      this.au = var3;
      this.ah = var4;
      this.ap = new HashMap();
      this.ap.put(ko.ac, var5.get(ar));
      this.ap.put(ko.ae, var5.get(al));
      this.ap.put(ko.ag, var5.get(ad));
      this.ay = new tp(var1);
      int var7 = this.af.cg(lg.ac.aq, (short)13352);
      int[] var8 = this.af.cm(var7, -630346084);
      int var9 = null == var8 ? 0 : var8.length;
      this.az = new HashMap(var9);

      for(int var10 = 0; var10 < var9; ++var10) {
         vf var11 = new vf(this.af.bt(var7, var8[var10], (byte)1));
         ky var12 = new ky();
         var12.ac(var11, var8[var10], (byte)58);
         this.az.put(var12.ar(-1773552748), var12);
         if (var12.au(-847344439)) {
            this.aa = var12;
         }
      }

      this.az(this.aa, -1734226441);
      this.ao = null;
   }

   final void dl(int var1, int var2, boolean var3) {
      this.aj = 1322179499 * var1;
      this.av = 976352195 * var2;
      hf.ac(-1598214665);
      if (var3) {
         this.au((byte)-62);
      }

   }

   public void bv(int var1, short var2) {
      try {
         this.ba = new HashSet();
         this.bj = 0;
         this.bp = 0;

         for(int var3 = 0; var3 < rp.ag * -566466219; ++var3) {
            if (var2 == 5000) {
               return;
            }

            if (fq.ac(var3, -1867337576) == null) {
               if (var2 == 5000) {
                  throw new IllegalStateException();
               }
            } else if (fq.ac(var3, -1041694532).an * -1050328213 == var1) {
               if (var2 == 5000) {
                  throw new IllegalStateException();
               }

               this.ba.add(fq.ac(var3, 2101538113).ax * 1901462683);
            }
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "tu.bv(" + ')');
      }
   }

   public nm hz(int var1, nm var2) {
      if (!this.ay.ag(1918957254)) {
         return null;
      } else if (!this.as.at((byte)118)) {
         return null;
      } else if (!this.ai.am(var2.ae * -582153405, var2.ag * 1162074139, (byte)0)) {
         return null;
      } else {
         HashMap var3 = this.as.ar(1975361395);
         List var4 = (List)var3.get(var1);
         if (null != var4 && !var4.isEmpty()) {
            ly var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();

            while(true) {
               ly var8;
               int var11;
               do {
                  if (!var7.hasNext()) {
                     return var5.af;
                  }

                  var8 = (ly)var7.next();
                  int var9 = var8.af.ae * -1763049545 - var2.ae * 136519630;
                  int var10 = var8.af.ag * 1162074139 - 2138057428 * var2.ag;
                  var11 = var10 * var10 + var9 * var9;
                  if (var11 == 0) {
                     return var8.af;
                  }
               } while(var11 >= var6 && var5 != null);

               var5 = var8;
               var6 = var11;
            }
         } else {
            return null;
         }
      }
   }

   public void co(po var1, po var2, po var3, qu var4, HashMap var5, vt[] var6) {
      this.ab = var6;
      this.af = var1;
      this.at = var2;
      this.au = var3;
      this.ah = var4;
      this.ap = new HashMap();
      this.ap.put(ko.ac, var5.get(ar));
      this.ap.put(ko.ae, var5.get(al));
      this.ap.put(ko.ag, var5.get(ad));
      this.ay = new tp(var1);
      int var7 = this.af.cg(lg.ac.aq, (short)1417);
      int[] var8 = this.af.cm(var7, 560020499);
      int var9 = null == var8 ? 0 : var8.length;
      this.az = new HashMap(var9);

      for(int var10 = 0; var10 < var9; ++var10) {
         vf var11 = new vf(this.af.bt(var7, var8[var10], (byte)-61));
         ky var12 = new ky();
         var12.ac(var11, var8[var10], (byte)9);
         this.az.put(var12.ar(-1773552748), var12);
         if (var12.au(-1449678202)) {
            this.aa = var12;
         }
      }

      this.az(this.aa, -2070390205);
      this.ao = null;
   }

   public void cz(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.ay.ag(-1206093557)) {
         this.aq((byte)20);
         this.af(2087319337);
         if (var3) {
            int var8 = (int)Math.ceil((double)((float)var6 / this.ak));
            int var9 = (int)Math.ceil((double)((float)var7 / this.ak));
            List var10 = this.as.aq(1861568259 * this.aj - var8 / 2 - 1, this.av * 187491643 - var9 / 2 - 1, 1 + 1861568259 * this.aj + var8 / 2, 1 + var9 / 2 + 187491643 * this.av, var4, var5, var6, var7, var1, var2, 1806458895);
            HashSet var11 = new HashSet();

            Iterator var12;
            ly var13;
            do var14;
            li var15;
            for(var12 = var10.iterator(); var12.hasNext(); ij.ac(var14, -1855656404)) {
               var13 = (ly)var12.next();
               var11.add(var13);
               var14 = new do();
               var15 = new li(var13.ae(-1570517373), var13.at, var13.af);
               var14.ac(new Object[]{var15, var1, var2}, 1531650149);
               if (this.cj.contains(var13)) {
                  var14.ae(17, -555465343);
               } else {
                  var14.ae(15, 22702724);
               }
            }

            var12 = this.cj.iterator();

            while(var12.hasNext()) {
               var13 = (ly)var12.next();
               if (!var11.contains(var13)) {
                  var14 = new do();
                  var15 = new li(var13.ae(-1570517373), var13.at, var13.af);
                  var14.ac(new Object[]{var15, var1, var2}, -326959841);
                  var14.ae(16, 714036286);
                  ij.ac(var14, -2049117774);
               }
            }

            this.cj = var11;
         }
      }
   }

   public void cw(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.ay.ag(1649403815)) {
         this.aq((byte)20);
         this.af(-245224734);
         if (var3) {
            int var8 = (int)Math.ceil((double)((float)var6 / this.ak));
            int var9 = (int)Math.ceil((double)((float)var7 / this.ak));
            List var10 = this.as.aq(1861568259 * this.aj - var8 / 2 - 1, this.av * 187491643 - var9 / 2 - 1, 1 + 1861568259 * this.aj + var8 / 2, 1 + var9 / 2 + 187491643 * this.av, var4, var5, var6, var7, var1, var2, 1678799602);
            HashSet var11 = new HashSet();

            Iterator var12;
            ly var13;
            do var14;
            li var15;
            for(var12 = var10.iterator(); var12.hasNext(); ij.ac(var14, -1749986270)) {
               var13 = (ly)var12.next();
               var11.add(var13);
               var14 = new do();
               var15 = new li(var13.ae(-1570517373), var13.at, var13.af);
               var14.ac(new Object[]{var15, var1, var2}, 1596093315);
               if (this.cj.contains(var13)) {
                  var14.ae(17, 2068250002);
               } else {
                  var14.ae(15, 837094459);
               }
            }

            var12 = this.cj.iterator();

            while(var12.hasNext()) {
               var13 = (ly)var12.next();
               if (!var11.contains(var13)) {
                  var14 = new do();
                  var15 = new li(var13.ae(-1570517373), var13.at, var13.af);
                  var14.ac(new Object[]{var15, var1, var2}, 1102794534);
                  var14.ae(16, -2065405923);
                  ij.ac(var14, -2010220912);
               }
            }

            this.cj = var11;
         }
      }
   }

   public void cr(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.ay.ag(1621351683)) {
         this.aq((byte)20);
         this.af(104142549);
         if (var3) {
            int var8 = (int)Math.ceil((double)((float)var6 / this.ak));
            int var9 = (int)Math.ceil((double)((float)var7 / this.ak));
            List var10 = this.as.aq(-783335757 * this.aj - var8 / 2 - 1, this.av * -1105928564 - var9 / 2 - 1, 1 + 1861568259 * this.aj + var8 / 2, 1 + var9 / 2 + 187491643 * this.av, var4, var5, var6, var7, var1, var2, -493781878);
            HashSet var11 = new HashSet();

            Iterator var12;
            ly var13;
            do var14;
            li var15;
            for(var12 = var10.iterator(); var12.hasNext(); ij.ac(var14, -1859873512)) {
               var13 = (ly)var12.next();
               var11.add(var13);
               var14 = new do();
               var15 = new li(var13.ae(-1570517373), var13.at, var13.af);
               var14.ac(new Object[]{var15, var1, var2}, -308053781);
               if (this.cj.contains(var13)) {
                  var14.ae(17, -1233261249);
               } else {
                  var14.ae(15, 2066402408);
               }
            }

            var12 = this.cj.iterator();

            while(var12.hasNext()) {
               var13 = (ly)var12.next();
               if (!var11.contains(var13)) {
                  var14 = new do();
                  var15 = new li(var13.ae(-1570517373), var13.at, var13.af);
                  var14.ac(new Object[]{var15, var1, var2}, 1362313871);
                  var14.ae(16, 76848029);
                  ij.ac(var14, -1766494945);
               }
            }

            this.cj = var11;
         }
      }
   }

   public void cl(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.ay.ag(849811295)) {
         this.aq((byte)20);
         this.af(71506455);
         if (var3) {
            int var8 = (int)Math.ceil((double)((float)var6 / this.ak));
            int var9 = (int)Math.ceil((double)((float)var7 / this.ak));
            List var10 = this.as.aq(-501850330 * this.aj - var8 / 2 - 1, this.av * 187491643 - var9 / 2 - 1, 1 + 1306900597 * this.aj + var8 / 2, 1 + var9 / 2 + 187491643 * this.av, var4, var5, var6, var7, var1, var2, 123370833);
            HashSet var11 = new HashSet();

            Iterator var12;
            ly var13;
            do var14;
            li var15;
            for(var12 = var10.iterator(); var12.hasNext(); ij.ac(var14, -2102439973)) {
               var13 = (ly)var12.next();
               var11.add(var13);
               var14 = new do();
               var15 = new li(var13.ae(-1570517373), var13.at, var13.af);
               var14.ac(new Object[]{var15, var1, var2}, 1558051585);
               if (this.cj.contains(var13)) {
                  var14.ae(17, -975123317);
               } else {
                  var14.ae(15, -1678476283);
               }
            }

            var12 = this.cj.iterator();

            while(var12.hasNext()) {
               var13 = (ly)var12.next();
               if (!var11.contains(var13)) {
                  var14 = new do();
                  var15 = new li(var13.ae(-1570517373), var13.at, var13.af);
                  var14.ac(new Object[]{var15, var1, var2}, 298090288);
                  var14.ae(16, 563057344);
                  ij.ac(var14, -1823682592);
               }
            }

            this.cj = var11;
         }
      }
   }

   public void ca(int var1, int var2, boolean var3, boolean var4) {
      long var5 = hf.ac(-1598214665);
      this.ax(var1, var2, var4, var5);
      if (!this.ar(330108021) && (var4 || var3) && !dr.ps(874781844)) {
         if (var4) {
            this.bi = 1968736091 * var1;
            this.bg = var2 * -344873812;
            this.by = -870928164 * this.aj;
            this.bb = 388462686 * this.av;
         }

         if (this.by * -713571112 != -1) {
            int var7 = var1 - -1040953133 * this.bi;
            int var8 = var2 - 1178606035 * this.bg;
            this.at(548784823 * this.by - (int)((float)var7 / this.bn), this.bb * -683963953 + (int)((float)var8 / this.bn), false, (byte)-29);
         }
      } else {
         this.au((byte)-95);
      }

      if (var4) {
         this.bl = var5 * 1337978693927236525L;
         this.bz = -1080092328 * var1;
         this.bu = 920494862 * var2;
      }

   }

   void hp() {
      this.be.clear();
      this.be.addAll(this.bt);
      this.be.addAll(this.bk);
   }

   public void cp(int var1, int var2, boolean var3, boolean var4) {
      long var5 = hf.ac(-1598214665);
      this.ax(var1, var2, var4, var5);
      if (!this.ar(330108021) && (var4 || var3) && !dr.ps(-1164976386)) {
         if (var4) {
            this.bi = 1968736091 * var1;
            this.bg = var2 * -324491685;
            this.by = -2073851371 * this.aj;
            this.bb = -1698429739 * this.av;
         }

         if (this.by * 548784823 != -1) {
            int var7 = var1 - -1040953133 * this.bi;
            int var8 = var2 - 1178606035 * this.bg;
            this.at(548784823 * this.by - (int)((float)var7 / this.bn), this.bb * -683963953 + (int)((float)var8 / this.bn), false, (byte)-20);
         }
      } else {
         this.au((byte)-36);
      }

      if (var4) {
         this.bl = var5 * 1337978693927236525L;
         this.bz = 826321101 * var1;
         this.bu = 1443880831 * var2;
      }

   }

   void cb(int var1, int var2, boolean var3, long var4) {
      if (this.ai != null) {
         int var6 = (int)((float)(1861568259 * this.aj) + ((float)(var1 - 669451105 * this.bx) - (float)this.bb((byte)12) * this.ak / 2.0F) / this.ak);
         int var7 = (int)((float)(this.av * 187491643) - ((float)(var2 - this.bf * -48182701) - (float)this.bi((short)-18353) * this.ak / 2.0F) / this.ak);
         this.cx = this.ai.aq(var6 + this.ai.ab(-529765902) * 64, var7 + this.ai.aa(-2032297683) * 64, -2124808777);
         if (null != this.cx && var3) {
            kh var8 = client.ss;
            if (dj.ph(1483868129) && var8.aa(82, 1770128204) && var8.aa(81, 1770128204)) {
               ux.pz(this.cx.ae * -1763049545, 1162074139 * this.cx.ag, this.cx.ac * -1687269157, false, (byte)-31);
            } else {
               boolean var10 = true;
               if (this.br) {
                  int var11 = var1 - -914390011 * this.bz;
                  int var12 = var2 - -1108352897 * this.bu;
                  if (var4 - 2331784597243095077L * this.bl > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
                     var10 = false;
                  }
               }

               if (var10) {
                  mq var13 = fs.ac(mz.di, client.ia.ax, (byte)-34);
                  var13.ag.bv(this.cx.ae((byte)86), 1417198009);
                  client.ia.ag(var13, 92511047);
                  this.bl = 0L;
               }
            }
         }
      } else {
         this.cx = null;
      }

   }

   void cd(int var1, int var2, boolean var3, long var4) {
      if (this.ai != null) {
         int var6 = (int)((float)(-1626923092 * this.aj) + ((float)(var1 - 489436509 * this.bx) - (float)this.bb((byte)12) * this.ak / 2.0F) / this.ak);
         int var7 = (int)((float)(this.av * 187491643) - ((float)(var2 - this.bf * -1032322821) - (float)this.bi((short)-27258) * this.ak / 2.0F) / this.ak);
         this.cx = this.ai.aq(var6 + this.ai.ab(-1054522770) * 1308061692, var7 + this.ai.aa(-1826769248) * 2000951712, -2139118033);
         if (null != this.cx && var3) {
            kh var8 = client.ss;
            if (dj.ph(1483868129) && var8.aa(558389117, 1770128204) && var8.aa(-748806697, 1770128204)) {
               ux.pz(this.cx.ae * 745710112, 1162074139 * this.cx.ag, this.cx.ac * -1238285307, false, (byte)-26);
            } else {
               boolean var10 = true;
               if (this.br) {
                  int var11 = var1 - 380187822 * this.bz;
                  int var12 = var2 - -770550426 * this.bu;
                  if (var4 - 2331784597243095077L * this.bl > 500L || var11 < -164086007 || var11 > 25 || var12 < -25 || var12 > 25) {
                     var10 = false;
                  }
               }

               if (var10) {
                  mq var13 = fs.ac(mz.di, client.ia.ax, (byte)0);
                  var13.ag.bv(this.cx.ae((byte)61), 814792010);
                  client.ia.ag(var13, -523460370);
                  this.bl = 0L;
               }
            }
         }
      } else {
         this.cx = null;
      }

   }

   void ce() {
      if (null != on.wp) {
         this.ak = this.bn;
      } else {
         if (this.ak < this.bn) {
            this.ak = Math.min(this.bn, this.ak + this.ak / 30.0F);
         }

         if (this.ak > this.bn) {
            this.ak = Math.max(this.bn, this.ak - this.ak / 30.0F);
         }

      }
   }

   void ck() {
      if (null != on.wp) {
         this.ak = this.bn;
      } else {
         if (this.ak < this.bn) {
            this.ak = Math.min(this.bn, this.ak + this.ak / 30.0F);
         }

         if (this.ak > this.bn) {
            this.ak = Math.max(this.bn, this.ak - this.ak / 30.0F);
         }

      }
   }

   void dp() {
      if (null != on.wp) {
         this.ak = this.bn;
      } else {
         if (this.ak < this.bn) {
            this.ak = Math.min(this.bn, this.ak + this.ak / 30.0F);
         }

         if (this.ak > this.bn) {
            this.ak = Math.max(this.bn, this.ak - this.ak / 30.0F);
         }

      }
   }

   final void at(int var1, int var2, boolean var3, byte var4) {
      try {
         this.aj = 1322179499 * var1;
         this.av = 1905044467 * var2;
         hf.ac(-1598214665);
         if (var3) {
            this.au((byte)-79);
         }

      } catch (RuntimeException var5) {
         throw vk.ae(var5, "tu.at(" + ')');
      }
   }

   void dv() {
      if (this.ar(330108021)) {
         int var1 = this.aw * -202213425 - 1861568259 * this.aj;
         int var2 = this.an * 1593267677 - this.av * 187491643;
         if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
         }

         if (0 != var2) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         this.at(var1 + this.aj * 1861568259, var2 + this.av * 187491643, true, (byte)-21);
         if (-202213425 * this.aw == this.aj * 1861568259 && this.an * 1593267677 == 187491643 * this.av) {
            this.aw = 1208799441;
            this.an = -623225461;
         }

      }
   }

   final void dt(int var1, int var2, boolean var3) {
      this.aj = -1330982814 * var1;
      this.av = 1905044467 * var2;
      hf.ac(-1598214665);
      if (var3) {
         this.au((byte)-36);
      }

   }

   final void dk(int var1, int var2, boolean var3) {
      this.aj = 1322179499 * var1;
      this.av = 1905044467 * var2;
      hf.ac(-1598214665);
      if (var3) {
         this.au((byte)-4);
      }

   }

   float bn(int var1, byte var2) {
      try {
         if (25 == var1) {
            if (var2 <= 5) {
               throw new IllegalStateException();
            } else {
               return 1.0F;
            }
         } else if (37 == var1) {
            if (var2 <= 5) {
               throw new IllegalStateException();
            } else {
               return 1.5F;
            }
         } else if (50 == var1) {
            if (var2 <= 5) {
               throw new IllegalStateException();
            } else {
               return 2.0F;
            }
         } else if (var1 == 75) {
            if (var2 <= 5) {
               throw new IllegalStateException();
            } else {
               return 3.0F;
            }
         } else {
            return var1 == 100 ? 4.0F : 8.0F;
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "tu.bn(" + ')');
      }
   }

   public int fx() {
      return null == this.ai ? -1 : this.av * 187491643 + this.ai.aa(-1990817642) * 64;
   }

   public void hc(int var1, boolean var2) {
      if (!var2) {
         this.bt.add(var1);
      } else {
         this.bt.remove(var1);
      }

      this.cf(-1648656021);
   }

   final void dw() {
      this.bg = 381183074;
      this.bi = -999720804;
      this.bb = 2134450897;
      this.by = -411251463;
   }

   void ey(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = 20;
      int var7 = var3 / 2 + var1;
      int var8 = var4 / 2 + var2 - 18 - var6;
      vr.fr(var1, var2, var3, var4, -16777216);
      vr.fs(var7 - 1446323358, var8, 304, 1045177157, -65536);
      vr.fr(var7 - 817776585, var8 + 2, var5 * 3, 30, -2055271265);
      this.ah.ay(ok.mq, var7, var6 + var8, -1, -1);
   }

   public void gs() {
      this.bs = -210754146;
   }

   public void dj(int var1, int var2, int var3, boolean var4) {
      ky var5 = this.al(var1, var2, var3, -1770090839);
      if (null == var5) {
         if (!var4) {
            return;
         }

         var5 = this.aa;
      }

      boolean var6 = false;
      if (var5 != this.ao || var4) {
         this.ao = var5;
         this.az(var5, -528287370);
         var6 = true;
      }

      if (var6 || var4) {
         this.ao(var1, var2, var3, 1513546936);
      }

   }

   public void do(int var1, int var2, int var3, boolean var4) {
      ky var5 = this.al(var1, var2, var3, -1011055539);
      if (null == var5) {
         if (!var4) {
            return;
         }

         var5 = this.aa;
      }

      boolean var6 = false;
      if (var5 != this.ao || var4) {
         this.ao = var5;
         this.az(var5, -397723583);
         var6 = true;
      }

      if (var6 || var4) {
         this.ao(var1, var2, var3, 1513546936);
      }

   }

   public void dh(int var1, int var2, int var3, boolean var4) {
      ky var5 = this.al(var1, var2, var3, 1323928640);
      if (null == var5) {
         if (!var4) {
            return;
         }

         var5 = this.aa;
      }

      boolean var6 = false;
      if (var5 != this.ao || var4) {
         this.ao = var5;
         this.az(var5, 1619313728);
         var6 = true;
      }

      if (var6 || var4) {
         this.ao(var1, var2, var3, 1513546936);
      }

   }

   public void dm(int var1) {
      ky var2 = this.bf(var1, -954890890);
      if (var2 != null) {
         this.az(var2, 1303203055);
      }

   }

   public int dq() {
      return this.ai == null ? -1 : this.ai.at((byte)37);
   }

   public int di() {
      return this.ai == null ? -1 : this.ai.at((byte)19);
   }

   public int da() {
      return this.ai == null ? -1 : this.ai.at((byte)42);
   }

   public int dz() {
      return this.ai == null ? -1 : this.ai.at((byte)127);
   }

   public ky dg() {
      return this.ai;
   }

   public ly ci(int var1) {
      try {
         if (null == this.cm) {
            return null;
         } else {
            ly var2;
            do {
               if (!this.cm.hasNext()) {
                  return null;
               }

               if (var1 != 1945530495) {
                  throw new IllegalStateException();
               }

               var2 = (ly)this.cm.next();
            } while(var2.ae(-1570517373) == -1);

            return var2;
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "tu.ci(" + ')');
      }
   }

   void dy(ky var1) {
      if (null == this.ai || this.ai != var1) {
         this.aa(var1, 474009865);
         this.ao(-1, -1, -1, 1513546936);
      }
   }

   void ds(ky var1) {
      if (null == this.ai || this.ai != var1) {
         this.aa(var1, -1163947304);
         this.ao(-1, -1, -1, 1513546936);
      }
   }

   public void aw(int var1, int var2, int var3, int var4, int var5) {
      try {
         if (!this.ay.ag(-1703362815)) {
            if (var5 <= 844691753) {
               throw new IllegalStateException();
            }
         } else {
            if (!this.as.at((byte)127)) {
               if (var5 <= 844691753) {
                  return;
               }

               this.as.ac(this.af, this.ai.ar(-1773552748), client.cx, -1105082601);
               if (!this.as.at((byte)120)) {
                  if (var5 <= 844691753) {
                     throw new IllegalStateException();
                  }

                  return;
               }
            }

            this.as.ax(var1, var2, var3, var4, this.ba, this.bp * 1583107929, this.bs * -1155622761, 624886417);
         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "tu.aw(" + ')');
      }
   }

   public void bg(int var1, int var2) {
      try {
         if (var1 >= 1) {
            if (var2 <= -1343734409) {
               return;
            }

            this.bm = -316067679 * var1;
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "tu.bg(" + ')');
      }
   }

   public int fy() {
      return null == this.ai ? -1 : this.av * 187491643 + this.ai.aa(-1887915249) * 64;
   }

   void eg(ky var1) {
      this.ai = var1;
      this.as = new lb(this.ab, this.ap, this.at, this.au);
      this.ay.ac(this.ai == null ? null : this.ai.ar(-1773552748), -1125889549);
   }

   void du(ky var1) {
      if (null == this.ai || this.ai != var1) {
         this.aa(var1, 235616528);
         this.ao(-1, -1, -1, 1513546936);
      }
   }

   public void ez(ky var1, nm var2, nm var3, boolean var4) {
      if (var1 != null) {
         if (this.ai == null || var1 != this.ai) {
            this.aa(var1, 786878834);
         }

         if (!var4 && this.ai.ag(-1687269157 * var2.ac, var2.ae * 27378467, var2.ag * -1772657747, -1839654378)) {
            this.ao(260211463 * var2.ac, var2.ae * -1763049545, -529689915 * var2.ag, 1513546936);
         } else {
            this.ao(-1821197448 * var3.ac, -1763049545 * var3.ae, var3.ag * 1162074139, 1513546936);
         }

      }
   }

   public void ah(int var1, int var2) {
      try {
         ky var3 = this.bf(var1, -1098665311);
         if (var3 != null) {
            if (var2 == 244628875) {
               return;
            }

            this.az(var3, 1120527628);
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "tu.ah(" + ')');
      }
   }

   public void ef(ky var1, nm var2, nm var3, boolean var4) {
      if (var1 != null) {
         if (this.ai == null || var1 != this.ai) {
            this.aa(var1, 711903631);
         }

         if (!var4 && this.ai.ag(-1687269157 * var2.ac, var2.ae * -1763049545, var2.ag * 1162074139, -1312346943)) {
            this.ao(-1687269157 * var2.ac, var2.ae * -1763049545, 1162074139 * var2.ag, 1513546936);
         } else {
            this.ao(-1687269157 * var3.ac, -1763049545 * var3.ae, var3.ag * 1162074139, 1513546936);
         }

      }
   }

   boolean de() {
      return 1033144839 * this.aw != -1 && 2029413612 * this.an != -1;
   }

   void ep(int var1, int var2, int var3) {
      if (this.ai != null) {
         int[] var4 = this.ai.ax(var1, var2, var3, (short)180);
         if (null == var4) {
            var4 = this.ai.ax(this.ai.as(1903446025), this.ai.ao(-1880603466), this.ai.ay(-1035224501), (short)180);
         }

         this.at(var4[0] - this.ai.ab(257946450) * 64, var4[1] - this.ai.aa(-1961787800) * 64, true, (byte)-12);
         this.aw = 1208799441;
         this.an = -623225461;
         this.ak = this.bn(this.ai.ap(756722116), (byte)9);
         this.bn = this.ak;
         this.cu = null;
         this.cm = null;
         this.as.ae(-519222126);
      }
   }

   public boolean hy(int var1) {
      return !this.bt.contains(var1);
   }

   public void eh(int var1, int var2, int var3, int var4, int var5, double var6) {
      int[] var8 = new int[4];
      vr.ff(var8);
      vr.et(var1, var2, var3 + var1, var4 + var2);
      int var9 = this.ay.am(-2140156848);
      if (var9 < 891104521) {
         this.ak(var1, var2, var3, var4, var9, -249064015);
      } else {
         if (!this.as.at((byte)122)) {
            this.as.ac(this.af, this.ai.ar(-1773552748), client.cx, 578119408);
            if (!this.as.at((byte)113)) {
               return;
            }
         }

         int var11 = this.as.au(-520454328);
         double var12 = (double)(var11 >> 16 & -103684011) / 256.0D;
         double var14 = (double)(var11 >> 8 & -1296518232) / 256.0D;
         double var16 = (double)(var11 & 255) / 256.0D;
         var12 = Math.pow(var12, var6);
         var14 = Math.pow(var14, var6);
         var16 = Math.pow(var16, var6);
         int var18 = (int)(var12 * 256.0D);
         int var19 = (int)(256.0D * var14);
         int var20 = (int)(256.0D * var16);
         int var10 = (var19 << 8) + (var18 << 16) + -1638998974 + var20;
         vr.fr(var1, var2, var3, var4, var10);
         if (this.ba != null) {
            this.bp += 812189929;
            if (0 == this.bp * -8855778 % (this.bs * -1155622761)) {
               this.bp = 0;
               this.bj += 1386218243;
            }

            if (this.bj * -2098705184 >= this.bm * -1846718283 && !this.bw) {
               this.ba = null;
            }
         }

         int var13 = (int)Math.ceil((double)((float)var3 / this.ak));
         int var21 = (int)Math.ceil((double)((float)var4 / this.ak));
         double var15 = jw.aq();
         this.as.ag(this.aj * 1861568259 - var13 / 2, -1515965751 * this.av - var21 / 2, var13 / 2 + this.aj * 1861568259, var21 / 2 + -30514817 * this.av, var1, var2, var1 + var3, var2 + var4, 21018538);
         if (!this.bc) {
            boolean var17 = false;
            if (var5 - this.cn * -1226341343 > -2042924986) {
               this.cn = 1692991457 * var5;
               var17 = true;
            }

            this.as.am(-1002908885 * this.aj - var13 / 2, 187491643 * this.av - var21 / 2, var13 / 2 + this.aj * 1861568259, this.av * -986561367 + var21 / 2, var1, var2, var1 + var3, var4 + var2, this.be, this.ba, 1583107929 * this.bp, -1155622761 * this.bs, var17, 1333250348);
         }

         this.av(var1, var2, var3, var4, var13, var21, (byte)68);
         if (dj.ph(1483868129) && this.ci && this.cx != null) {
            this.ah.ai("Coord: " + this.cx, 10 + vr.bf, 20 + vr.bd, 16776960, -1);
         }

         this.bh = var13 * 497554139;
         this.bd = -1685334948 * var21;
         this.bx = var1 * 2114117793;
         this.bf = 1894083166 * var2;
         vr.fe(var8);
         if (var15 != jw.aq()) {
            jw.ag(var15);
         }

      }
   }

   public void eu() {
      as.ae((byte)-32);
   }

   public void ei() {
      as.ae((byte)-75);
   }

   boolean eo(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.cy == null) {
         return true;
      } else if (var1 == this.cy.ae && var2 == this.cy.ag) {
         if (1326302436 * this.as.az != this.co * -1600026175) {
            return true;
         } else if (this.ct * -796369057 != 1873696417 * client.wg) {
            return true;
         } else if (var3 <= 0 && var4 <= 0) {
            return var3 + var1 < var5 || var2 + var4 < var6;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   void el(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (null != on.wp) {
         int var7 = -270455496 / (810124442 * this.as.az);
         int var8 = var3 + 512;
         int var9 = -213245599 + var4;
         float var10 = 1.0F;
         var8 = (int)((float)var8 / var10);
         var9 = (int)((float)var9 / var10);
         int var11 = this.bj(-958509085) - var5 / 2 - var7;
         int var12 = this.bp(1965350329) - var6 / 2 - var7;
         int var13 = var1 - 1490822713 * this.as.az * (var11 + var7 - -941597677 * this.cv);
         int var14 = var2 - (var7 - (var12 - 1397241066 * this.cg)) * -239523891 * this.as.az;
         if (this.aj(var8, var9, var13, var14, var3, var4, (byte)47)) {
            if (null != this.cy && this.cy.ae == var8 && this.cy.ag == var9) {
               Arrays.fill(this.cy.ac, 0);
            } else {
               this.cy = new vv(var8, var9);
            }

            this.cv = (this.bj(-1334299606) - var5 / 2 - var7) * 1889242435;
            this.cg = (this.bp(-831531549) - var6 / 2 - var7) * 89572507;
            this.co = this.as.az * -398423431;
            on.wp.aq(211179316 * this.cv, 73858540 * this.cg, this.cy, (float)(this.co * -1600026175) / var10, 1817188242);
            this.ct = -1381824001 * client.wg;
            var13 = var1 - -1427047389 * this.as.az * (var11 + var7 - -941597677 * this.cv);
            var14 = var2 - 1490822713 * this.as.az * (var7 - (var12 - -851043389 * this.cg));
         }

         vr.fp(var1, var2, var3, var4, 0, 128);
         if (1.0F == var10) {
            this.cy.av(var13, var14, 1696598991);
         } else {
            this.cy.ak(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), -2134881195);
         }
      }

   }

   void em(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (null != on.wp) {
         int var7 = -1871601775 / (-1313321870 * this.as.az);
         int var8 = var3 + -721357900;
         int var9 = 512 + var4;
         float var10 = 1.0F;
         var8 = (int)((float)var8 / var10);
         var9 = (int)((float)var9 / var10);
         int var11 = this.bj(-1276417552) - var5 / 2 - var7;
         int var12 = this.bp(-398237416) - var6 / 2 - var7;
         int var13 = var1 - 1490822713 * this.as.az * (var11 + var7 - -941597677 * this.cv);
         int var14 = var2 - (var7 - (var12 - 460495514 * this.cg)) * 1490822713 * this.as.az;
         if (this.aj(var8, var9, var13, var14, var3, var4, (byte)-90)) {
            if (null != this.cy && this.cy.ae == var8 && this.cy.ag == var9) {
               Arrays.fill(this.cy.ac, 0);
            } else {
               this.cy = new vv(var8, var9);
            }

            this.cv = (this.bj(-305061145) - var5 / 2 - var7) * 478112419;
            this.cg = (this.bp(1287822713) - var6 / 2 - var7) * -1021212447;
            this.co = this.as.az * -317738327;
            on.wp.aq(779972390 * this.cv, -1400798829 * this.cg, this.cy, (float)(this.co * -1600026175) / var10, 299272727);
            this.ct = -719522125 * client.wg;
            var13 = var1 - 1391601877 * this.as.az * (var11 + var7 - -941597677 * this.cv);
            var14 = var2 - 1490822713 * this.as.az * (var7 - (var12 - -1400798829 * this.cg));
         }

         vr.fp(var1, var2, var3, var4, 0, 128);
         if (1.0F == var10) {
            this.cy.av(var13, var14, 766885331);
         } else {
            this.cy.ak(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), -1254666252);
         }
      }

   }

   void ao(int var1, int var2, int var3, int var4) {
      try {
         if (this.ai != null) {
            int[] var5 = this.ai.ax(var1, var2, var3, (short)180);
            if (null == var5) {
               if (var4 != 1513546936) {
                  throw new IllegalStateException();
               }

               var5 = this.ai.ax(this.ai.as(1651695858), this.ai.ao(1553874689), this.ai.ay(1663017761), (short)180);
            }

            this.at(var5[0] - this.ai.ab(-1871768227) * 64, var5[1] - this.ai.aa(-2101679212) * 64, true, (byte)-45);
            this.aw = 1208799441;
            this.an = -623225461;
            this.ak = this.bn(this.ai.ap(214700293), (byte)27);
            this.bn = this.ak;
            this.cu = null;
            this.cm = null;
            this.as.ae(1494405301);
         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "tu.ao(" + ')');
      }
   }

   void eb(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (null != on.wp) {
         int var7 = 512 / (-1313321870 * this.as.az);
         int var8 = var3 + 512;
         int var9 = 512 + var4;
         float var10 = 1.0F;
         var8 = (int)((float)var8 / var10);
         var9 = (int)((float)var9 / var10);
         int var11 = this.bj(816941476) - var5 / 2 - var7;
         int var12 = this.bp(-10949634) - var6 / 2 - var7;
         int var13 = var1 - 1490822713 * this.as.az * (var11 + var7 - -941597677 * this.cv);
         int var14 = var2 - (var7 - (var12 - -1400798829 * this.cg)) * 1490822713 * this.as.az;
         if (this.aj(var8, var9, var13, var14, var3, var4, (byte)92)) {
            if (null != this.cy && this.cy.ae == var8 && this.cy.ag == var9) {
               Arrays.fill(this.cy.ac, 0);
            } else {
               this.cy = new vv(var8, var9);
            }

            this.cv = (this.bj(-1827617245) - var5 / 2 - var7) * -207237605;
            this.cg = (this.bp(964464481) - var6 / 2 - var7) * 89572507;
            this.co = this.as.az * -398423431;
            on.wp.aq(-941597677 * this.cv, -1400798829 * this.cg, this.cy, (float)(this.co * -1600026175) / var10, -923788826);
            this.ct = -1381824001 * client.wg;
            var13 = var1 - 1490822713 * this.as.az * (var11 + var7 - -941597677 * this.cv);
            var14 = var2 - 1490822713 * this.as.az * (var7 - (var12 - -1400798829 * this.cg));
         }

         vr.fp(var1, var2, var3, var4, 0, 128);
         if (1.0F == var10) {
            this.cy.av(var13, var14, 192);
         } else {
            this.cy.ak(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 192);
         }
      }

   }

   void ek(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (null != on.wp) {
         int var7 = 512 / (813065719 * this.as.az);
         int var8 = var3 + -838873669;
         int var9 = 908296226 + var4;
         float var10 = 1.0F;
         var8 = (int)((float)var8 / var10);
         var9 = (int)((float)var9 / var10);
         int var11 = this.bj(223295419) - var5 / 2 - var7;
         int var12 = this.bp(-214722802) - var6 / 2 - var7;
         int var13 = var1 - 1490822713 * this.as.az * (var11 + var7 - 1941486106 * this.cv);
         int var14 = var2 - (var7 - (var12 - 1644465498 * this.cg)) * -795707738 * this.as.az;
         if (this.aj(var8, var9, var13, var14, var3, var4, (byte)53)) {
            if (null != this.cy && this.cy.ae == var8 && this.cy.ag == var9) {
               Arrays.fill(this.cy.ac, 0);
            } else {
               this.cy = new vv(var8, var9);
            }

            this.cv = (this.bj(45610520) - var5 / 2 - var7) * -132691170;
            this.cg = (this.bp(-1268702466) - var6 / 2 - var7) * 254971941;
            this.co = this.as.az * -398423431;
            on.wp.aq(1861764399 * this.cv, -746464097 * this.cg, this.cy, (float)(this.co * 580164147) / var10, 584998961);
            this.ct = -1381824001 * client.wg;
            var13 = var1 - 1490822713 * this.as.az * (var11 + var7 - -941597677 * this.cv);
            var14 = var2 - 1490822713 * this.as.az * (var7 - (var12 - -1400798829 * this.cg));
         }

         vr.fp(var1, var2, var3, var4, 0, -366899527);
         if (1.0F == var10) {
            this.cy.av(var13, var14, 192);
         } else {
            this.cy.ak(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 452553274);
         }
      }

   }

   void av(int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      try {
         if (null != on.wp) {
            if (var7 <= 8) {
               throw new IllegalStateException();
            }

            int var8 = 512 / (-1313321870 * this.as.az);
            int var9 = var3 + 512;
            int var10 = 512 + var4;
            float var11 = 1.0F;
            var9 = (int)((float)var9 / var11);
            var10 = (int)((float)var10 / var11);
            int var12 = this.bj(625144728) - var5 / 2 - var8;
            int var13 = this.bp(1392968795) - var6 / 2 - var8;
            int var14 = var1 - 1490822713 * this.as.az * (var12 + var8 - -941597677 * this.cv);
            int var15 = var2 - (var8 - (var13 - -1400798829 * this.cg)) * 1490822713 * this.as.az;
            if (this.aj(var9, var10, var14, var15, var3, var4, (byte)-43)) {
               if (var7 <= 8) {
                  return;
               }

               label61: {
                  if (null != this.cy) {
                     if (var7 <= 8) {
                        return;
                     }

                     if (this.cy.ae == var9) {
                        if (var7 <= 8) {
                           throw new IllegalStateException();
                        }

                        if (this.cy.ag == var10) {
                           Arrays.fill(this.cy.ac, 0);
                           break label61;
                        }

                        if (var7 <= 8) {
                           return;
                        }
                     }
                  }

                  this.cy = new vv(var9, var10);
               }

               this.cv = (this.bj(203985345) - var5 / 2 - var8) * -207237605;
               this.cg = (this.bp(-1221197487) - var6 / 2 - var8) * 89572507;
               this.co = this.as.az * -398423431;
               on.wp.aq(-941597677 * this.cv, -1400798829 * this.cg, this.cy, (float)(this.co * -1600026175) / var11, 1897573936);
               this.ct = -1381824001 * client.wg;
               var14 = var1 - 1490822713 * this.as.az * (var12 + var8 - -941597677 * this.cv);
               var15 = var2 - 1490822713 * this.as.az * (var8 - (var13 - -1400798829 * this.cg));
            }

            vr.fp(var1, var2, var3, var4, 0, 128);
            if (1.0F == var11) {
               if (var7 <= 8) {
                  throw new IllegalStateException();
               }

               this.cy.av(var14, var15, 192);
            } else {
               this.cy.ak(var14, var15, (int)((float)var9 * var11), (int)((float)var10 * var11), 192);
            }
         }

      } catch (RuntimeException var16) {
         throw vk.ae(var16, "tu.av(" + ')');
      }
   }

   void en(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (null != on.wp) {
         int var7 = 512 / (-1313321870 * this.as.az);
         int var8 = var3 + 512;
         int var9 = 512 + var4;
         float var10 = 1.0F;
         var8 = (int)((float)var8 / var10);
         var9 = (int)((float)var9 / var10);
         int var11 = this.bj(-1774756131) - var5 / 2 - var7;
         int var12 = this.bp(-606670352) - var6 / 2 - var7;
         int var13 = var1 - 1490822713 * this.as.az * (var11 + var7 - -941597677 * this.cv);
         int var14 = var2 - (var7 - (var12 - -1400798829 * this.cg)) * 1490822713 * this.as.az;
         if (this.aj(var8, var9, var13, var14, var3, var4, (byte)111)) {
            if (null != this.cy && this.cy.ae == var8 && this.cy.ag == var9) {
               Arrays.fill(this.cy.ac, 0);
            } else {
               this.cy = new vv(var8, var9);
            }

            this.cv = (this.bj(-1715304594) - var5 / 2 - var7) * -207237605;
            this.cg = (this.bp(-1803320752) - var6 / 2 - var7) * 89572507;
            this.co = this.as.az * -398423431;
            on.wp.aq(-941597677 * this.cv, -1400798829 * this.cg, this.cy, (float)(this.co * -1600026175) / var10, -1266963204);
            this.ct = -1381824001 * client.wg;
            var13 = var1 - 1490822713 * this.as.az * (var11 + var7 - -941597677 * this.cv);
            var14 = var2 - 1490822713 * this.as.az * (var7 - (var12 - -1400798829 * this.cg));
         }

         vr.fp(var1, var2, var3, var4, 0, 128);
         if (1.0F == var10) {
            this.cy.av(var13, var14, 192);
         } else {
            this.cy.ak(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 192);
         }
      }

   }

   float ee(int var1) {
      if (25 == var1) {
         return 1.0F;
      } else if (37 == var1) {
         return 1.5F;
      } else if (50 == var1) {
         return 2.0F;
      } else if (var1 == 75) {
         return 3.0F;
      } else {
         return var1 == 100 ? 4.0F : 8.0F;
      }
   }

   float ed(int var1) {
      if (25 == var1) {
         return 1.0F;
      } else if (-923373215 == var1) {
         return 1.5F;
      } else if (-180306335 == var1) {
         return 2.0F;
      } else if (var1 == 1221045166) {
         return 3.0F;
      } else {
         return var1 == 100 ? 4.0F : 8.0F;
      }
   }

   public void cg() {
      ax.ag(-1582682515);
   }

   public ly cx(byte var1) {
      try {
         if (!this.ay.ag(1739161303)) {
            if (var1 != 14) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if (!this.as.at((byte)120)) {
            if (var1 != 14) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            HashMap var2 = this.as.ar(2098193334);
            this.cu = new LinkedList();
            Iterator var3 = var2.values().iterator();

            while(var3.hasNext()) {
               if (var1 != 14) {
                  throw new IllegalStateException();
               }

               List var4 = (List)var3.next();
               this.cu.addAll(var4);
            }

            this.cm = this.cu.iterator();
            return this.ci(1945530495);
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "tu.cx(" + ')');
      }
   }

   public int ej() {
      if ((double)this.bn == 1.0D) {
         return 25;
      } else if ((double)this.bn == 1.5D) {
         return 37;
      } else if (2.0D == (double)this.bn) {
         return 464025751;
      } else if (3.0D == (double)this.bn) {
         return 75;
      } else {
         return (double)this.bn == 4.0D ? 100 : -1409310362;
      }
   }

   public int ec() {
      if ((double)this.bn == 1.0D) {
         return 25;
      } else if ((double)this.bn == 1.5D) {
         return 282057628;
      } else if (2.0D == (double)this.bn) {
         return 50;
      } else if (3.0D == (double)this.bn) {
         return -1931772419;
      } else {
         return (double)this.bn == 4.0D ? 100 : 200;
      }
   }

   public void et() {
      this.ay.ae(-226404559);
   }

   public void fv() {
      this.ay.ae(-2118850764);
   }

   public void ff() {
      this.ay.ae(-562936733);
   }

   public boolean fe() {
      return this.ay.ag(290146033);
   }

   public boolean ft() {
      return this.ay.ag(222257423);
   }

   final void db(int var1, int var2, boolean var3) {
      this.aj = 1322179499 * var1;
      this.av = 1905044467 * var2;
      hf.ac(-1598214665);
      if (var3) {
         this.au((byte)-83);
      }

   }

   public void fk(int var1, int var2) {
      if (this.ai != null && this.ai.am(var1, var2, (byte)0)) {
         this.aw = (var1 - this.ai.ab(228264066) * 64) * -1208799441;
         this.an = (var2 - this.ai.aa(-1977348386) * 64) * 623225461;
      }
   }

   public void fp(int var1, int var2) {
      if (this.ai != null && this.ai.am(var1, var2, (byte)0)) {
         this.aw = (var1 - this.ai.ab(-1235239227) * 64) * -1208799441;
         this.an = (var2 - this.ai.aa(-1923368725) * 64) * 623225461;
      }
   }

   public void fr(int var1, int var2) {
      if (null != this.ai) {
         this.at(var1 - this.ai.ab(-1258342341) * 64, var2 - this.ai.aa(-1912859802) * 64, true, (byte)-41);
         this.aw = -2046094559;
         this.an = 51565423;
      }
   }

   public void ev(ky var1, nm var2, nm var3, boolean var4) {
      if (var1 != null) {
         if (this.ai == null || var1 != this.ai) {
            this.aa(var1, 204649850);
         }

         if (!var4 && this.ai.ag(-1687269157 * var2.ac, var2.ae * -1763049545, var2.ag * 1162074139, -1791274665)) {
            this.ao(-1687269157 * var2.ac, var2.ae * -1763049545, 1162074139 * var2.ag, 1513546936);
         } else {
            this.ao(-1687269157 * var3.ac, -1763049545 * var3.ae, var3.ag * 1162074139, 1513546936);
         }

      }
   }

   public void fu(int var1, int var2, int var3) {
      if (this.ai != null) {
         int[] var4 = this.ai.ax(var1, var2, var3, (short)180);
         if (null != var4) {
            this.bm(var4[0], var4[1], 421697312);
         }

      }
   }

   public void bz(int var1, int var2) {
      try {
         if (var1 >= 1) {
            if (var2 != -1980809295) {
               return;
            }

            this.bs = var1 * -2065799385;
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "tu.bz(" + ')');
      }
   }

   public void fs(int var1, int var2, int var3) {
      if (this.ai != null) {
         int[] var4 = this.ai.ax(var1, var2, var3, (short)180);
         if (null != var4) {
            this.bm(var4[0], var4[1], 421697312);
         }

      }
   }

   public void fq(int var1, int var2, int var3) {
      if (null != this.ai) {
         int[] var4 = this.ai.ax(var1, var2, var3, (short)180);
         if (null != var4) {
            this.bs(var4[0], var4[1], -52871423);
         }

      }
   }

   public void hf(int var1, boolean var2) {
      if (!var2) {
         this.bq.add(var1);
      } else {
         this.bq.remove(var1);
      }

      for(int var3 = 0; var3 < rp.ag * -566466219; ++var3) {
         if (fq.ac(var3, -450028313) != null && fq.ac(var3, 1709894606).an * -1050328213 == var1) {
            int var4 = fq.ac(var3, 1371127953).ax * 1901462683;
            if (!var2) {
               this.bk.add(var4);
            } else {
               this.bk.remove(var4);
            }
         }
      }

      this.cf(-1661630707);
   }

   public void fh(int var1, int var2, int var3) {
      if (null != this.ai) {
         int[] var4 = this.ai.ax(var1, var2, var3, (short)180);
         if (null != var4) {
            this.bs(var4[0], var4[1], -52871423);
         }

      }
   }

   public void fn(int var1, int var2, int var3) {
      if (null != this.ai) {
         int[] var4 = this.ai.ax(var1, var2, var3, (short)180);
         if (null != var4) {
            this.bs(var4[0], var4[1], -52871423);
         }

      }
   }

   public int fw() {
      return this.ai == null ? -1 : this.aj * 100852020 + this.ai.ab(203027186) * -289554919;
   }

   public void ge(int var1) {
      if (var1 >= 1) {
         this.bm = -610368385 * var1;
      }

   }

   public int fi() {
      return this.ai == null ? -1 : this.aj * 1861568259 + this.ai.ab(-705046281) * 64;
   }

   public int fc() {
      return null == this.ai ? -1 : this.av * -2142516215 + this.ai.aa(-2045939846) * 64;
   }

   public int fm() {
      return null == this.ai ? -1 : this.av * 187491643 + this.ai.aa(-1983777923) * 64;
   }

   public boolean cn(int var1, int var2) {
      try {
         return !this.bt.contains(var1);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "tu.cn(" + ')');
      }
   }

   void dn(ky var1) {
      if (null == this.ai || this.ai != var1) {
         this.aa(var1, 611439573);
         this.ao(-1, -1, -1, 1513546936);
      }
   }

   public nm fz() {
      return null == this.ai ? null : this.ai.aq(this.bj(1199655794), this.bp(1554365127), -2133470713);
   }

   final void dc() {
      this.bg = 324491685;
      this.bi = -1968736091;
      this.bb = 2134450897;
      this.by = -411251463;
   }

   void dd(ky var1) {
      this.ai = var1;
      this.as = new lb(this.ab, this.ap, this.at, this.au);
      this.ay.ac(this.ai == null ? null : this.ai.ar(-1773552748), -1125889549);
   }

   public int ga() {
      return -1569153121 * this.bh;
   }

   public void gl(int var1) {
      if (var1 >= 1) {
         this.bm = -316067679 * var1;
      }

   }

   public int gd() {
      return 96966995 * this.bh;
   }

   public void gb() {
      this.bm = -1404683930;
   }

   public void go() {
      this.bs = -1887239560;
   }

   public ky fb(int var1) {
      Iterator var2 = this.az.values().iterator();

      ky var3;
      do {
         if (!var2.hasNext()) {
            return null;
         }

         var3 = (ky)var2.next();
      } while(var3.at((byte)126) != var1);

      return var3;
   }

   public void gp() {
      this.bs = 1672977208;
   }

   public void gf(boolean var1) {
      this.bw = var1;
   }

   public void gx(int var1) {
      this.ba = new HashSet();
      this.ba.add(var1);
      this.bj = 0;
      this.bp = 0;
   }

   public void gu(int var1) {
      this.ba = new HashSet();
      this.ba.add(var1);
      this.bj = 0;
      this.bp = 0;
   }

   public void gj(int var1) {
      this.ba = new HashSet();
      this.ba.add(var1);
      this.bj = 0;
      this.bp = 0;
   }

   public nm fa() {
      return null == this.ai ? null : this.ai.aq(this.bj(997056887), this.bp(485207832), -2125408499);
   }

   public void gz(int var1) {
      this.ba = new HashSet();
      this.bj = 0;
      this.bp = 0;

      for(int var2 = 0; var2 < rp.ag * -566466219; ++var2) {
         if (fq.ac(var2, 550932932) != null && fq.ac(var2, -429029169).an * -1050328213 == var1) {
            this.ba.add(fq.ac(var2, 729294073).ax * 1901462683);
         }
      }

   }

   public void gm(int var1) {
      this.ba = new HashSet();
      this.bj = 0;
      this.bp = 0;

      for(int var2 = 0; var2 < rp.ag * -566466219; ++var2) {
         if (fq.ac(var2, -454947081) != null && fq.ac(var2, 2084977616).an * -1050328213 == var1) {
            this.ba.add(fq.ac(var2, -890816602).ax * 1901462683);
         }
      }

   }

   public void gc(int var1) {
      this.ba = new HashSet();
      this.bj = 0;
      this.bp = 0;

      for(int var2 = 0; var2 < rp.ag * -566466219; ++var2) {
         if (fq.ac(var2, 1491178015) != null && fq.ac(var2, -888766695).an * -1050328213 == var1) {
            this.ba.add(fq.ac(var2, 1866370865).ax * -1661279894);
         }
      }

   }

   public void gw() {
      this.ba = null;
   }

   public void gr() {
      this.ba = null;
   }

   public void gq() {
      this.ba = null;
   }

   void az(ky var1, int var2) {
      try {
         if (null != this.ai && this.ai == var1) {
            if (var2 == 1008223761) {
               throw new IllegalStateException();
            }
         } else {
            this.aa(var1, 1455133267);
            this.ao(-1, -1, -1, 1513546936);
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "tu.az(" + ')');
      }
   }

   public void gi(boolean var1) {
      this.bc = !var1;
   }

   public void gk(boolean var1) {
      this.bc = !var1;
   }

   public void gh(boolean var1) {
      this.bc = !var1;
   }

   public void gy(int var1, boolean var2) {
      if (!var2) {
         this.bt.add(var1);
      } else {
         this.bt.remove(var1);
      }

      this.cf(-1065892310);
   }

   public void as(int var1, int var2, int var3, int var4, int var5, double var6) {
      try {
         int[] var8 = new int[4];
         vr.ff(var8);
         vr.et(var1, var2, var3 + var1, var4 + var2);
         int var9 = this.ay.am(-2140156848);
         if (var9 < 100) {
            this.ak(var1, var2, var3, var4, var9, -249064015);
         } else {
            if (!this.as.at((byte)115)) {
               this.as.ac(this.af, this.ai.ar(-1773552748), client.cx, 1589232645);
               if (!this.as.at((byte)96)) {
                  return;
               }
            }

            int var11 = this.as.au(-1448315811);
            double var12 = (double)(var11 >> 16 & 255) / 256.0D;
            double var14 = (double)(var11 >> 8 & 255) / 256.0D;
            double var16 = (double)(var11 & 255) / 256.0D;
            var12 = Math.pow(var12, var6);
            var14 = Math.pow(var14, var6);
            var16 = Math.pow(var16, var6);
            int var18 = (int)(var12 * 256.0D);
            int var19 = (int)(256.0D * var14);
            int var20 = (int)(256.0D * var16);
            int var10 = (var19 << 8) + (var18 << 16) + -16777216 + var20;
            vr.fr(var1, var2, var3, var4, var10);
            if (this.ba != null) {
               this.bp += 812189929;
               if (0 == this.bp * 1583107929 % (this.bs * -1155622761)) {
                  this.bp = 0;
                  this.bj += 1386218243;
               }

               if (this.bj * 436928427 >= this.bm * -1478184095 && !this.bw) {
                  this.ba = null;
               }
            }

            int var13 = (int)Math.ceil((double)((float)var3 / this.ak));
            int var22 = (int)Math.ceil((double)((float)var4 / this.ak));
            double var15 = jw.aq();
            this.as.ag(this.aj * 1861568259 - var13 / 2, 187491643 * this.av - var22 / 2, var13 / 2 + this.aj * 1861568259, var22 / 2 + 187491643 * this.av, var1, var2, var1 + var3, var2 + var4, -531892073);
            if (!this.bc) {
               boolean var17 = false;
               if (var5 - this.cn * -1226341343 > 100) {
                  this.cn = 1692991457 * var5;
                  var17 = true;
               }

               this.as.am(1861568259 * this.aj - var13 / 2, 187491643 * this.av - var22 / 2, var13 / 2 + this.aj * 1861568259, this.av * 187491643 + var22 / 2, var1, var2, var1 + var3, var4 + var2, this.be, this.ba, 1583107929 * this.bp, -1155622761 * this.bs, var17, -990489598);
            }

            this.av(var1, var2, var3, var4, var13, var22, (byte)119);
            if (dj.ph(1483868129) && this.ci && this.cx != null) {
               this.ah.ai("Coord: " + this.cx, 10 + vr.bf, 20 + vr.bd, 16776960, -1);
            }

            this.bh = var13 * 497554139;
            this.bd = -220865329 * var22;
            this.bx = var1 * 2114117793;
            this.bf = 470944219 * var2;
            vr.fe(var8);
            if (var15 != jw.aq()) {
               jw.ag(var15);
            }

         }
      } catch (RuntimeException var21) {
         throw vk.ae(var21, "tu.as(" + ')');
      }
   }

   public boolean hd(int var1) {
      return !this.bq.contains(var1);
   }

   void er(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = 20;
      int var7 = var3 / 2 + var1;
      int var8 = var4 / 2 + var2 - 18 - var6;
      vr.fr(var1, var2, var3, var4, -16777216);
      vr.fs(var7 - 152, var8, 304, 34, -65536);
      vr.fr(var7 - 150, var8 + 2, var5 * 3, 30, -65536);
      this.ah.ay(ok.mq, var7, var6 + var8, -1, -1);
   }

   void df() {
      if (this.ar(330108021)) {
         int var1 = this.aw * -202213425 - 1861568259 * this.aj;
         int var2 = this.an * 1593267677 - this.av * 187491643;
         if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
         }

         if (0 != var2) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         this.at(var1 + this.aj * 1861568259, var2 + this.av * 187491643, true, (byte)-122);
         if (-202213425 * this.aw == this.aj * 1861568259 && this.an * 1593267677 == 187491643 * this.av) {
            this.aw = 1208799441;
            this.an = -623225461;
         }

      }
   }

   public boolean hk() {
      return !this.bc;
   }

   public boolean hi(int var1) {
      return !this.bt.contains(var1);
   }

   public void cy(po var1, po var2, po var3, qu var4, HashMap var5, vt[] var6) {
      this.ab = var6;
      this.af = var1;
      this.at = var2;
      this.au = var3;
      this.ah = var4;
      this.ap = new HashMap();
      this.ap.put(ko.ac, var5.get(ar));
      this.ap.put(ko.ae, var5.get(al));
      this.ap.put(ko.ag, var5.get(ad));
      this.ay = new tp(var1);
      int var7 = this.af.cg(lg.ac.aq, (short)-11143);
      int[] var8 = this.af.cm(var7, -1124419176);
      int var9 = null == var8 ? 0 : var8.length;
      this.az = new HashMap(var9);

      for(int var10 = 0; var10 < var9; ++var10) {
         vf var11 = new vf(this.af.bt(var7, var8[var10], (byte)33));
         ky var12 = new ky();
         var12.ac(var11, var8[var10], (byte)118);
         this.az.put(var12.ar(-1773552748), var12);
         if (var12.au(-2112643826)) {
            this.aa = var12;
         }
      }

      this.az(this.aa, -1439738819);
      this.ao = null;
   }

   public ky dr() {
      return this.ai;
   }

   public boolean hj(int var1) {
      return !this.bq.contains(var1);
   }

   public boolean he() {
      return !this.bc;
   }

   void hg() {
      this.be.clear();
      this.be.addAll(this.bt);
      this.be.addAll(this.bk);
   }

   public void bm(int var1, int var2, int var3) {
      try {
         if (this.ai != null) {
            if (var3 != 421697312) {
               throw new IllegalStateException();
            }

            if (this.ai.am(var1, var2, (byte)0)) {
               this.aw = (var1 - this.ai.ab(-1967198794) * 64) * -1208799441;
               this.an = (var2 - this.ai.aa(-2038382607) * 64) * 623225461;
               return;
            }

            if (var3 != 421697312) {
               throw new IllegalStateException();
            }
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "tu.bm(" + ')');
      }
   }

   public void hn(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.ay.ag(347131758)) {
         int var7 = (int)Math.ceil((double)((float)var3 / this.ak));
         int var8 = (int)Math.ceil((double)((float)var4 / this.ak));
         List var9 = this.as.aq(1303902326 * this.aj - var7 / 2 - 1, 187491643 * this.av - var8 / 2 - 1, 1 + var7 / 2 + this.aj * 1861568259, 1 + var8 / 2 + -535779067 * this.av, var1, var2, var3, var4, var5, var6, -1424970215);
         if (!var9.isEmpty()) {
            Iterator var10 = var9.iterator();

            boolean var13;
            do {
               if (!var10.hasNext()) {
                  return;
               }

               ly var11 = (ly)var10.next();
               hf var12 = fq.ac(var11.ae(-1570517373), 1141746002);
               var13 = false;

               for(int var14 = this.cf.length - 1; var14 >= 0; --var14) {
                  if (var12.ap[var14] != null) {
                     jx.mg(var12.ap[var14], var12.ab, this.cf[var14], var11.ae(-1570517373), var11.at.ae((byte)88), var11.af.ae((byte)77), (byte)-98);
                     var13 = true;
                  }
               }
            } while(!var13);

         }
      }
   }

   public void cc() {
      ax.ag(-2145424225);
   }

   public nm hq(int var1, nm var2) {
      if (!this.ay.ag(-1635166136)) {
         return null;
      } else if (!this.as.at((byte)112)) {
         return null;
      } else if (!this.ai.am(var2.ae * -1763049545, var2.ag * 1162074139, (byte)0)) {
         return null;
      } else {
         HashMap var3 = this.as.ar(2128624259);
         List var4 = (List)var3.get(var1);
         if (null != var4 && !var4.isEmpty()) {
            ly var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();

            while(true) {
               ly var8;
               int var11;
               do {
                  if (!var7.hasNext()) {
                     return var5.af;
                  }

                  var8 = (ly)var7.next();
                  int var9 = var8.af.ae * -1763049545 - var2.ae * 1429017392;
                  int var10 = var8.af.ag * 1162074139 - 1162074139 * var2.ag;
                  var11 = var10 * var10 + var9 * var9;
                  if (var11 == 0) {
                     return var8.af;
                  }
               } while(var11 >= var6 && var5 != null);

               var5 = var8;
               var6 = var11;
            }
         } else {
            return null;
         }
      }
   }

   public void gv() {
      this.ba = null;
   }

   public void an(int var1, byte var2) {
      try {
         this.bn = this.bn(var1, (byte)22);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "tu.an(" + ')');
      }
   }

   public void hu(int var1, int var2, nm var3, nm var4) {
      do var5 = new do();
      li var6 = new li(var2, var3, var4);
      var5.ac(new Object[]{var6}, 1763341835);
      switch(var1) {
      case 1008:
         var5.ae(10, -1249046854);
         break;
      case 1009:
         var5.ae(11, 288012271);
         break;
      case 1010:
         var5.ae(12, 1801731156);
         break;
      case 1011:
         var5.ae(13, -885739049);
         break;
      case 1012:
         var5.ae(14, 2134776162);
      }

      ij.ac(var5, -2133482896);
   }

   public void es(int var1) {
      this.bn = this.bn(var1, (byte)38);
   }

   public boolean hr() {
      return !this.bc;
   }

   public void hv(int var1, int var2, nm var3, nm var4) {
      do var5 = new do();
      li var6 = new li(var2, var3, var4);
      var5.ac(new Object[]{var6}, -535535261);
      switch(var1) {
      case 1008:
         var5.ae(10, 2029103);
         break;
      case 1009:
         var5.ae(11, 504251545);
         break;
      case 1010:
         var5.ae(12, -279370083);
         break;
      case 1011:
         var5.ae(13, 1657769165);
         break;
      case 1012:
         var5.ae(14, 1940510116);
      }

      ij.ac(var5, -1984566180);
   }

   public ly hl() {
      if (!this.ay.ag(1712287933)) {
         return null;
      } else if (!this.as.at((byte)93)) {
         return null;
      } else {
         HashMap var1 = this.as.ar(2098945348);
         this.cu = new LinkedList();
         Iterator var2 = var1.values().iterator();

         while(var2.hasNext()) {
            List var3 = (List)var2.next();
            this.cu.addAll(var3);
         }

         this.cm = this.cu.iterator();
         return this.ci(1945530495);
      }
   }

   public ly ha() {
      if (!this.ay.ag(-629821542)) {
         return null;
      } else if (!this.as.at((byte)114)) {
         return null;
      } else {
         HashMap var1 = this.as.ar(1954603989);
         this.cu = new LinkedList();
         Iterator var2 = var1.values().iterator();

         while(var2.hasNext()) {
            List var3 = (List)var2.next();
            this.cu.addAll(var3);
         }

         this.cm = this.cu.iterator();
         return this.ci(1945530495);
      }
   }

   public ly hx() {
      if (null == this.cm) {
         return null;
      } else {
         ly var1;
         do {
            if (!this.cm.hasNext()) {
               return null;
            }

            var1 = (ly)this.cm.next();
         } while(var1.ae(-1570517373) == -1);

         return var1;
      }
   }
}
