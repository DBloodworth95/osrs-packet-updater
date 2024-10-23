import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class ms extends bk {
   int[] aw;
   int ae;
   nb[][] ak;
   int[] ad;
   int[] ar;
   int[] aq;
   int[] af;
   int[] at;
   int[] au;
   bz ba;
   public int bb;
   static ThreadPoolExecutor by = null;
   uu ac;
   int[] as;
   int[] ay;
   int[] aj;
   int[] av;
   int ag;
   int[] an;
   int[] al;
   nb[][] bn;
   my bh;
   boolean bd;
   int bx;
   int bf;
   long bm;
   long bs;
   nq bw;
   int[] am;
   PriorityQueue bj;
   static AtomicBoolean bp = null;
   int[] ax;
   static final int ap = 2;
   static final int ah = 1;

   public int cx() {
      return this.ae * 386047148;
   }

   public void ac(int var1, int var2) {
      try {
         synchronized(this.ba) {
            this.ae = var1 * -1336600621;
         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ms.ac(" + ')');
      }
   }

   public int ae(int var1) {
      try {
         return this.ae * -1104127909;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ms.ae(" + ')');
      }
   }

   static final boolean li(int var0) {
      try {
         return client.nr;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ms.li(" + ')');
      }
   }

   public void am(byte var1) {
      try {
         if (null != this.bj) {
            if (bp != null) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               bp.set(true);
            }

            bp = new AtomicBoolean(false);
            AtomicBoolean var2 = bp;
            if (null == by) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               int var3 = Runtime.getRuntime().availableProcessors();
               by = new ThreadPoolExecutor(0, var3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new mt(this));
            }

            by.submit(new nw(this, var2));
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ms.am(" + ')');
      }
   }

   public void ax(byte var1) {
      try {
         synchronized(this.ba) {
            for(nc var3 = (nc)this.ac.am(); null != var3; var3 = (nc)this.ac.ax()) {
               if (var1 != 1) {
                  throw new IllegalStateException();
               }

               var3.ae((byte)1);
            }

         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ms.ax(" + ')');
      }
   }

   public void ar(byte var1) {
      try {
         synchronized(this.ba) {
            for(nc var3 = (nc)this.ac.am(); var3 != null; var3 = (nc)this.ac.ax()) {
               var3.jb();
            }

         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ms.ar(" + ')');
      }
   }

   public void ad(nk var1, boolean var2, int var3) {
      try {
         synchronized(this.ba) {
            this.ah(606519566);
            this.bh.ac(var1.ae);
            this.bd = var2;
            this.bm = 0L;
            int var5 = this.bh.am();

            for(int var6 = 0; var6 < var5; ++var6) {
               this.bh.ax(var6);
               this.bh.at(var6);
               this.bh.aq(var6);
            }

            this.bx = this.bh.ah() * -890875117;
            this.bf = -1396156939 * this.bh.ax[462450459 * this.bx];
            this.bs = this.bh.ad(-1112281507 * this.bf) * 6591107080710570813L;
         }
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "ms.ad(" + ')');
      }
   }

   protected void al(int var1) {
      try {
         if (this.bh.ag()) {
            int var2 = this.bh.ae * -1318576595 * this.ag / (-1578400357 * bz.ax);

            do {
               long var3 = this.bm * -1172391544945565461L + (long)var1 * (long)var2;
               if (1055179931651124245L * this.bs - var3 >= 0L) {
                  this.bm = -1909301745175984189L * var3;
                  break;
               }

               int var5 = (int)((1055179931651124245L * this.bs - -1172391544945565461L * this.bm + (long)var2 - 1L) / (long)var2);
               this.bm += -1909301745175984189L * (long)var5 * (long)var2;
               this.bw.al(var5);
               var1 -= var5;
               this.cn(-1660420066);
            } while(this.bh.ag());
         }

         this.bw.al(var1);
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ms.al(" + ')');
      }
   }

   public boolean ap(int var1) {
      try {
         synchronized(this.ba) {
            return this.bh.ag();
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ms.ap(" + ')');
      }
   }

   void ds(int var1, int var2, int var3) {
   }

   public void az(int var1, int var2, int var3) {
      try {
         synchronized(this.ba) {
            this.aa(var1, var2, -1823323916);
         }
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "ms.az(" + ')');
      }
   }

   void aa(int var1, int var2, int var3) {
      try {
         this.af[var1] = var2;
         this.au[var1] = var2 & -128;
         this.ai(var1, var2, (byte)3);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ms.aa(" + ')');
      }
   }

   protected void bs(int[] var1, int var2, int var3) {
      if (this.bh.ag()) {
         int var4 = this.bh.ae * this.ag * -1318576595 / (bz.ax * -1578400357);

         do {
            long var5 = (long)var3 * (long)var4 + this.bm * -1172391544945565461L;
            if (this.bs * 1055179931651124245L - var5 >= 0L) {
               this.bm = -1909301745175984189L * var5;
               break;
            }

            int var7 = (int)((this.bs * 1055179931651124245L - -1172391544945565461L * this.bm + (long)var4 - 1L) / (long)var4);
            this.bm += -1909301745175984189L * (long)var7 * (long)var4;
            this.bw.au(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.cn(-1660420066);
         } while(this.bh.ag());
      }

      this.bw.au(var1, var2, var3);
   }

   void ai(int var1, int var2, byte var3) {
      try {
         if (this.at[var1] != var2) {
            if (var3 != 3) {
               return;
            }

            this.at[var1] = var2;

            for(int var4 = 0; var4 < 128; ++var4) {
               if (var3 != 3) {
                  throw new IllegalStateException();
               }

               this.bn[var1][var4] = null;
            }
         }

      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ms.ai(" + ')');
      }
   }

   void el() {
      this.by(-1, (byte)0);
      this.bb(-1, 299228203);

      int var1;
      for(var1 = 0; var1 < 16; ++var1) {
         this.at[var1] = this.af[var1];
      }

      for(var1 = 0; var1 < 16; ++var1) {
         this.au[var1] = this.af[var1] & -128;
      }

   }

   void ay(int var1, int var2, int var3, int var4) {
      try {
         nb var5 = this.ak[var1][var2];
         if (var5 == null) {
            if (var4 < -499269120) {
               ;
            }
         } else {
            this.ak[var1][var2] = null;
            if ((this.as[var1] & 2) != 0) {
               if (var4 >= -499269120) {
                  throw new IllegalStateException();
               }

               for(nb var6 = (nb)this.bw.ae.af(); null != var6; var6 = (nb)this.bw.ae.au()) {
                  if (var4 >= -499269120) {
                     throw new IllegalStateException();
                  }

                  if (var5.ac * 1383258553 == var6.ac * 1383258553) {
                     if (var4 >= -499269120) {
                        throw new IllegalStateException();
                     }

                     if (-1783172009 * var6.ab < 0 && var5 != var6) {
                        if (var4 >= -499269120) {
                           throw new IllegalStateException();
                        }

                        var5.ab = 0;
                        break;
                     }
                  }
               }
            } else {
               var5.ab = 0;
            }

         }
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "ms.ay(" + ')');
      }
   }

   void aj(int var1, int var2, int var3, int var4) {
      try {
         ;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ms.aj(" + ')');
      }
   }

   void av(int var1, int var2, int var3) {
      try {
         ;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ms.av(" + ')');
      }
   }

   void aw(int var1, int var2, byte var3) {
      try {
         this.ar[var1] = var2;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ms.aw(" + ')');
      }
   }

   void by(int var1, byte var2) {
      try {
         for(nb var3 = (nb)this.bw.ae.af(); var3 != null; var3 = (nb)this.bw.ae.au()) {
            if (var2 != 0) {
               throw new IllegalStateException();
            }

            if (var1 >= 0) {
               if (var2 != 0) {
                  throw new IllegalStateException();
               }

               if (1383258553 * var3.ac != var1) {
                  continue;
               }

               if (var2 != 0) {
                  throw new IllegalStateException();
               }
            }

            if (var3.ao != null) {
               if (var2 != 0) {
                  return;
               }

               var3.ao.aj(bz.ax * -1578400357 / 100);
               if (var3.ao.bb()) {
                  if (var2 != 0) {
                     return;
                  }

                  this.bw.ag.ac(var3.ao);
               }

               var3.ac(-1113329963);
            }

            if (var3.ab * -1783172009 < 0) {
               if (var2 != 0) {
                  throw new IllegalStateException();
               }

               this.ak[1383258553 * var3.ac][528717609 * var3.aq] = null;
            }

            var3.jb();
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ms.by(" + ')');
      }
   }

   void as(nb var1, boolean var2, int var3) {
      try {
         int var5;
         label34: {
            int var4 = var1.ag.ae.length;
            if (var2) {
               if (var3 == -1403105949) {
                  throw new IllegalStateException();
               }

               if (var1.ag.ax) {
                  if (var3 == -1403105949) {
                     return;
                  }

                  int var6 = var4 + var4 - var1.ag.ag;
                  var5 = (int)((long)this.av[1383258553 * var1.ac] * (long)var6 >> 6);
                  var4 <<= 8;
                  if (var5 >= var4) {
                     if (var3 == -1403105949) {
                        throw new IllegalStateException();
                     }

                     var5 = var4 + var4 - 1 - var5;
                     var1.ao.ai(true);
                  }
                  break label34;
               }
            }

            var5 = (int)((long)this.av[1383258553 * var1.ac] * (long)var4 >> 6);
         }

         var1.ao.aa(var5);
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "ms.as(" + ')');
      }
   }

   void bi(int var1, int var2) {
      try {
         for(nb var3 = (nb)this.bw.ae.af(); null != var3; var3 = (nb)this.bw.ae.au()) {
            if (var1 >= 0) {
               if (var2 == 552265817) {
                  throw new IllegalStateException();
               }

               if (var3.ac * 1383258553 != var1) {
                  continue;
               }

               if (var2 == 552265817) {
                  return;
               }
            }

            if (var3.ab * -1783172009 < 0) {
               if (var2 == 552265817) {
                  return;
               }

               this.ak[1383258553 * var3.ac][528717609 * var3.aq] = null;
               var3.ab = 0;
            }
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ms.bi(" + ')');
      }
   }

   void bg(int var1) {
      try {
         this.by(-1, (byte)0);
         this.bb(-1, 853244495);

         int var2;
         for(var2 = 0; var2 < 16; ++var2) {
            if (var1 == -533333979) {
               throw new IllegalStateException();
            }

            this.at[var2] = this.af[var2];
         }

         for(var2 = 0; var2 < 16; ++var2) {
            this.au[var2] = this.af[var2] & -128;
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ms.bg(" + ')');
      }
   }

   void br(int var1, int var2) {
      try {
         if (0 != (this.as[var1] & 2)) {
            if (var2 >= 681453618) {
               throw new IllegalStateException();
            }

            for(nb var3 = (nb)this.bw.ae.af(); null != var3; var3 = (nb)this.bw.ae.au()) {
               if (var2 >= 681453618) {
                  return;
               }

               if (1383258553 * var3.ac == var1 && this.ak[var1][528717609 * var3.aq] == null && var3.ab * -1783172009 < 0) {
                  if (var2 >= 681453618) {
                     throw new IllegalStateException();
                  }

                  var3.ab = 0;
               }
            }
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ms.br(" + ')');
      }
   }

   void bo(int var1, int var2) {
      try {
         if ((this.as[var1] & 4) != 0) {
            for(nb var3 = (nb)this.bw.ae.af(); null != var3; var3 = (nb)this.bw.ae.au()) {
               if (var2 <= 532380330) {
                  return;
               }

               if (1383258553 * var3.ac == var1) {
                  if (var2 <= 532380330) {
                     return;
                  }

                  var3.aj = 0;
               }
            }
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ms.bo(" + ')');
      }
   }

   void bv(int var1, int var2) {
      try {
         int var3 = var1 & 240;
         int var4;
         int var5;
         int var6;
         if (var3 == 128) {
            if (var2 != -1856457959) {
               throw new IllegalStateException();
            } else {
               var4 = var1 & 15;
               var5 = var1 >> 8 & 127;
               var6 = var1 >> 16 & 127;
               this.ay(var4, var5, var6, -1239035602);
            }
         } else if (144 == var3) {
            var4 = var1 & 15;
            var5 = var1 >> 8 & 127;
            var6 = var1 >> 16 & 127;
            if (var6 > 0) {
               if (var2 != -1856457959) {
                  throw new IllegalStateException();
               }

               this.ao(var4, var5, var6, (byte)47);
            } else {
               this.ay(var4, var5, 64, -1809374644);
            }

         } else if (var3 == 160) {
            var4 = var1 & 15;
            var5 = var1 >> 8 & 127;
            var6 = var1 >> 16 & 127;
            this.aj(var4, var5, var6, 1991246083);
         } else if (176 == var3) {
            if (var2 == -1856457959) {
               var4 = var1 & 15;
               var5 = var1 >> 8 & 127;
               var6 = var1 >> 16 & 127;
               if (var5 == 0) {
                  if (var2 != -1856457959) {
                     return;
                  }

                  this.au[var4] = (this.au[var4] & -2080769) + (var6 << 14);
               }

               if (var5 == 32) {
                  if (var2 != -1856457959) {
                     throw new IllegalStateException();
                  }

                  this.au[var4] = (this.au[var4] & -16257) + (var6 << 7);
               }

               if (var5 == 1) {
                  if (var2 != -1856457959) {
                     return;
                  }

                  this.al[var4] = (this.al[var4] & -16257) + (var6 << 7);
               }

               if (var5 == 33) {
                  if (var2 != -1856457959) {
                     return;
                  }

                  this.al[var4] = var6 + (this.al[var4] & -128);
               }

               if (5 == var5) {
                  this.ad[var4] = (this.ad[var4] & -16257) + (var6 << 7);
               }

               if (var5 == 37) {
                  if (var2 != -1856457959) {
                     throw new IllegalStateException();
                  }

                  this.ad[var4] = var6 + (this.ad[var4] & -128);
               }

               if (7 == var5) {
                  if (var2 != -1856457959) {
                     throw new IllegalStateException();
                  }

                  this.am[var4] = (this.am[var4] & -16257) + (var6 << 7);
               }

               if (39 == var5) {
                  if (var2 != -1856457959) {
                     throw new IllegalStateException();
                  }

                  this.am[var4] = (this.am[var4] & -128) + var6;
               }

               if (var5 == 10) {
                  this.ax[var4] = (this.ax[var4] & -16257) + (var6 << 7);
               }

               if (var5 == 42) {
                  this.ax[var4] = (this.ax[var4] & -128) + var6;
               }

               if (11 == var5) {
                  if (var2 != -1856457959) {
                     throw new IllegalStateException();
                  }

                  this.aq[var4] = (this.aq[var4] & -16257) + (var6 << 7);
               }

               if (43 == var5) {
                  this.aq[var4] = var6 + (this.aq[var4] & -128);
               }

               int[] var10000;
               if (var5 == 64) {
                  if (var6 >= 64) {
                     if (var2 != -1856457959) {
                        throw new IllegalStateException();
                     }

                     var10000 = this.as;
                     var10000[var4] |= 1;
                  } else {
                     var10000 = this.as;
                     var10000[var4] &= -2;
                  }
               }

               if (var5 == 65) {
                  if (var2 != -1856457959) {
                     throw new IllegalStateException();
                  }

                  if (var6 >= 64) {
                     if (var2 != -1856457959) {
                        throw new IllegalStateException();
                     }

                     var10000 = this.as;
                     var10000[var4] |= 2;
                  } else {
                     this.br(var4, 74877614);
                     var10000 = this.as;
                     var10000[var4] &= -3;
                  }
               }

               if (var5 == 99) {
                  this.ay[var4] = (var6 << 7) + (this.ay[var4] & 127);
               }

               if (var5 == 98) {
                  this.ay[var4] = (this.ay[var4] & 16256) + var6;
               }

               if (var5 == 101) {
                  if (var2 != -1856457959) {
                     throw new IllegalStateException();
                  }

                  this.ay[var4] = (this.ay[var4] & 127) + 16384 + (var6 << 7);
               }

               if (var5 == 100) {
                  this.ay[var4] = (this.ay[var4] & 16256) + 16384 + var6;
               }

               if (120 == var5) {
                  if (var2 != -1856457959) {
                     return;
                  }

                  this.by(var4, (byte)0);
               }

               if (var5 == 121) {
                  this.bb(var4, -339291);
               }

               if (var5 == 123) {
                  if (var2 != -1856457959) {
                     throw new IllegalStateException();
                  }

                  this.bi(var4, -1918382963);
               }

               int var7;
               if (var5 == 6) {
                  var7 = this.ay[var4];
                  if (16384 == var7) {
                     if (var2 != -1856457959) {
                        throw new IllegalStateException();
                     }

                     this.aj[var4] = (var6 << 7) + (this.aj[var4] & -16257);
                  }
               }

               if (38 == var5) {
                  if (var2 != -1856457959) {
                     throw new IllegalStateException();
                  }

                  var7 = this.ay[var4];
                  if (16384 == var7) {
                     if (var2 != -1856457959) {
                        throw new IllegalStateException();
                     }

                     this.aj[var4] = var6 + (this.aj[var4] & -128);
                  }
               }

               if (16 == var5) {
                  if (var2 != -1856457959) {
                     throw new IllegalStateException();
                  }

                  this.av[var4] = (this.av[var4] & -16257) + (var6 << 7);
               }

               if (var5 == 48) {
                  if (var2 != -1856457959) {
                     throw new IllegalStateException();
                  }

                  this.av[var4] = (this.av[var4] & -128) + var6;
               }

               if (81 == var5) {
                  if (var2 != -1856457959) {
                     throw new IllegalStateException();
                  }

                  if (var6 >= 64) {
                     if (var2 != -1856457959) {
                        throw new IllegalStateException();
                     }

                     var10000 = this.as;
                     var10000[var4] |= 4;
                  } else {
                     this.bo(var4, 683002864);
                     var10000 = this.as;
                     var10000[var4] &= -5;
                  }
               }

               if (var5 == 17) {
                  this.bq(var4, (var6 << 7) + (this.aw[var4] & -16257), -378404734);
               }

               if (var5 == 49) {
                  if (var2 != -1856457959) {
                     throw new IllegalStateException();
                  }

                  this.bq(var4, var6 + (this.aw[var4] & -128), -2124716811);
               }

            }
         } else if (192 == var3) {
            if (var2 != -1856457959) {
               throw new IllegalStateException();
            } else {
               var4 = var1 & 15;
               var5 = var1 >> 8 & 127;
               this.ai(var4, var5 + this.au[var4], (byte)3);
            }
         } else if (208 == var3) {
            if (var2 != -1856457959) {
               throw new IllegalStateException();
            } else {
               var4 = var1 & 15;
               var5 = var1 >> 8 & 127;
               this.av(var4, var5, 42305589);
            }
         } else if (224 == var3) {
            if (var2 != -1856457959) {
               throw new IllegalStateException();
            } else {
               var4 = var1 & 15;
               var5 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
               this.aw(var4, var5, (byte)-111);
            }
         } else {
            var3 = var1 & 255;
            if (var3 == 255) {
               if (var2 != -1856457959) {
                  throw new IllegalStateException();
               } else {
                  this.bg(817105677);
               }
            }
         }
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "ms.bv(" + ')');
      }
   }

   void dy(int var1, int var2, int var3) {
   }

   void dk(int var1, int var2) {
      this.af[var1] = var2;
      this.au[var1] = var2 & 181466564;
      this.ai(var1, var2, (byte)3);
   }

   void dn(int var1, int var2, int var3) {
   }

   void eg(int var1, int var2) {
      this.ar[var1] = var2;
   }

   protected bk aq() {
      try {
         return this.bw;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ms.aq(" + ')');
      }
   }

   void ex(int var1) {
      if (var1 >= 0) {
         this.am[var1] = 12800;
         this.ax[var1] = 8192;
         this.aq[var1] = 16383;
         this.ar[var1] = 8192;
         this.al[var1] = 0;
         this.ad[var1] = 8192;
         this.br(var1, -611264384);
         this.bo(var1, 1118581951);
         this.as[var1] = 0;
         this.ay[var1] = 32767;
         this.aj[var1] = 256;
         this.av[var1] = 0;
         this.bq(var1, 8192, 1564039056);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.bb(var1, 437943855);
         }

      }
   }

   protected int at() {
      try {
         return 0;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ms.at(" + ')');
      }
   }

   protected void au(int[] var1, int var2, int var3) {
      try {
         if (this.bh.ag()) {
            int var4 = this.bh.ae * this.ag * -1318576595 / (bz.ax * -1578400357);

            do {
               long var5 = (long)var3 * (long)var4 + this.bm * -1172391544945565461L;
               if (this.bs * 1055179931651124245L - var5 >= 0L) {
                  this.bm = -1909301745175984189L * var5;
                  break;
               }

               int var7 = (int)((this.bs * 1055179931651124245L - -1172391544945565461L * this.bm + (long)var4 - 1L) / (long)var4);
               this.bm += -1909301745175984189L * (long)var7 * (long)var4;
               this.bw.au(var1, var2, var7);
               var2 += var7;
               var3 -= var7;
               this.cn(-1660420066);
            } while(this.bh.ag());
         }

         this.bw.au(var1, var2, var3);
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "ms.au(" + ')');
      }
   }

   public boolean ag(nk var1, po var2, bo var3, int var4) {
      try {
         synchronized(this.ba) {
            boolean var6 = true;
            synchronized(this.bj) {
               this.bj.clear();
            }

            for(nv var7 = (nv)var1.ac.am(); var7 != null; var7 = (nv)var1.ac.ax()) {
               if (var4 == 943518577) {
                  throw new IllegalStateException();
               }

               int var8 = (int)var7.hk;
               nc var9 = (nc)this.ac.ac((long)var8);
               if (var9 == null) {
                  if (var4 == 943518577) {
                     throw new IllegalStateException();
                  }

                  byte[] var11 = var2.ch(var8, (byte)19);
                  nc var10;
                  if (var11 == null) {
                     if (var4 == 943518577) {
                        throw new IllegalStateException();
                     }

                     var10 = null;
                  } else {
                     var10 = new nc(var11);
                  }

                  var9 = var10;
                  if (null == var10) {
                     var6 = false;
                     continue;
                  }

                  this.ac.ag(var10, (long)var8);
               }

               if (!var9.ac(var3, var7.ae, -1530677878)) {
                  if (var4 == 943518577) {
                     throw new IllegalStateException();
                  }

                  var6 = false;
               } else if (this.bj != null) {
                  if (var4 == 943518577) {
                     throw new IllegalStateException();
                  }

                  synchronized(this.bj) {
                     Iterator var19 = var9.au.iterator();

                     while(var19.hasNext()) {
                        if (var4 == 943518577) {
                           throw new IllegalStateException();
                        }

                        ch var12 = (ch)var19.next();
                        this.bj.add(new nt(-327851605 * var7.ac, var12));
                     }
                  }
               }
            }

            return var6;
         }
      } catch (RuntimeException var18) {
         throw vk.ae(var18, "ms.ag(" + ')');
      }
   }

   void dz(int var1, int var2, int var3) {
      nb var4 = this.ak[var1][var2];
      if (var4 != null) {
         this.ak[var1][var2] = null;
         if ((this.as[var1] & 2) != 0) {
            for(nb var5 = (nb)this.bw.ae.af(); null != var5; var5 = (nb)this.bw.ae.au()) {
               if (var4.ac * 1383258553 == var5.ac * 1383258553 && -1783172009 * var5.ab < 0 && var4 != var5) {
                  var4.ab = 0;
                  break;
               }
            }
         } else {
            var4.ab = 0;
         }

      }
   }

   boolean ch(nb var1, byte var2) {
      try {
         if (var1.ao == null) {
            if (var1.ab * -1783172009 >= 0) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               var1.jb();
               if (var1.ax * 107915439 > 0) {
                  if (var2 == 0) {
                     throw new IllegalStateException();
                  }

                  if (var1 == this.bn[var1.ac * 1383258553][var1.ax * 107915439]) {
                     if (var2 == 0) {
                        throw new IllegalStateException();
                     }

                     this.bn[1383258553 * var1.ac][var1.ax * 107915439] = null;
                  }
               }
            }

            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ms.ch(" + ')');
      }
   }

   boolean cf(nb var1, int[] var2, int var3, int var4, int var5) {
      try {
         var1.as = -1578400357 * bz.ax / 100 * -1003286197;
         if (-1783172009 * var1.ab >= 0) {
            if (var5 == 1899276239) {
               throw new IllegalStateException();
            }

            if (null == var1.ao || var1.ao.by()) {
               var1.ac(-1113329963);
               var1.jb();
               if (var1.ax * 107915439 > 0) {
                  if (var5 == 1899276239) {
                     throw new IllegalStateException();
                  }

                  if (this.bn[var1.ac * 1383258553][107915439 * var1.ax] == var1) {
                     this.bn[var1.ac * 1383258553][var1.ax * 107915439] = null;
                  }
               }

               return true;
            }
         }

         int var6 = var1.al * 693097243;
         if (var6 > 0) {
            var6 -= (int)(16.0D * Math.pow(2.0D, (double)this.ad[var1.ac * 1383258553] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
               if (var5 == 1899276239) {
                  throw new IllegalStateException();
               }

               var6 = 0;
            }

            var1.al = 665472787 * var6;
         }

         var1.ao.av(this.bk(var1, -95203169));
         mv var7 = var1.am;
         boolean var8 = false;
         var1.aa += -1063289553;
         var1.ai += var7.at * 143402229;
         double var9 = 5.086263020833333E-6D * (double)((var1.al * 693097243 * -1635351087 * var1.ar >> 12) + (528717609 * var1.aq - 60 << 8));
         if (var7.ag * -336379351 > 0) {
            if (var5 == 1899276239) {
               throw new IllegalStateException();
            }

            if (var7.aq * 82581475 > 0) {
               if (var5 == 1899276239) {
                  throw new IllegalStateException();
               }

               var1.ad += (int)(128.0D * Math.pow(2.0D, (double)(82581475 * var7.aq) * var9) + 0.5D) * 945059509;
            } else {
               var1.ad += 708532864;
            }
         }

         if (var7.ac != null) {
            if (var5 == 1899276239) {
               throw new IllegalStateException();
            }

            if (-1023198957 * var7.am > 0) {
               var1.ah += (int)(128.0D * Math.pow(2.0D, var9 * (double)(-1023198957 * var7.am)) + 0.5D) * 363360543;
            } else {
               var1.ah += -734490752;
            }

            while(var1.ap * 1324390209 < var7.ac.length - 2 && 127781599 * var1.ah > (var7.ac[2 + 1324390209 * var1.ap] & 255) << 8) {
               if (var5 == 1899276239) {
                  throw new IllegalStateException();
               }

               var1.ap += -2035289726;
            }

            if (1324390209 * var1.ap == var7.ac.length - 2) {
               if (var5 == 1899276239) {
                  throw new IllegalStateException();
               }

               if (0 == var7.ac[1 + 1324390209 * var1.ap]) {
                  if (var5 == 1899276239) {
                     throw new IllegalStateException();
                  }

                  var8 = true;
               }
            }
         }

         if (-1783172009 * var1.ab >= 0 && var7.ae != null && (this.as[var1.ac * 1383258553] & 1) == 0) {
            label212: {
               if (var1.ax * 107915439 >= 0) {
                  if (var5 == 1899276239) {
                     throw new IllegalStateException();
                  }

                  if (this.bn[var1.ac * 1383258553][var1.ax * 107915439] == var1) {
                     break label212;
                  }

                  if (var5 == 1899276239) {
                     throw new IllegalStateException();
                  }
               }

               if (var7.ax * -1240192717 > 0) {
                  if (var5 == 1899276239) {
                     throw new IllegalStateException();
                  }

                  var1.ab += (int)(128.0D * Math.pow(2.0D, var9 * (double)(-1240192717 * var7.ax)) + 0.5D) * 992163687;
               } else {
                  var1.ab += -1852066944;
               }

               while(var1.az * -184078825 < var7.ae.length - 2) {
                  if (var5 == 1899276239) {
                     throw new IllegalStateException();
                  }

                  if (var1.ab * -1783172009 <= (var7.ae[-184078825 * var1.az + 2] & 255) << 8) {
                     break;
                  }

                  var1.az += 145085262;
               }

               if (var7.ae.length - 2 == var1.az * -184078825) {
                  if (var5 == 1899276239) {
                     throw new IllegalStateException();
                  }

                  var8 = true;
               }
            }
         }

         if (var8) {
            var1.ao.aj(601813091 * var1.as);
            if (null != var2) {
               var1.ao.au(var2, var3, var4);
            } else {
               var1.ao.al(var4);
            }

            if (var1.ao.bb()) {
               if (var5 == 1899276239) {
                  throw new IllegalStateException();
               }

               this.bw.ag.ac(var1.ao);
            }

            var1.ac(-1113329963);
            if (var1.ab * -1783172009 >= 0) {
               if (var5 == 1899276239) {
                  throw new IllegalStateException();
               }

               var1.jb();
               if (107915439 * var1.ax > 0) {
                  if (var5 == 1899276239) {
                     throw new IllegalStateException();
                  }

                  if (var1 == this.bn[1383258553 * var1.ac][107915439 * var1.ax]) {
                     if (var5 == 1899276239) {
                        throw new IllegalStateException();
                     }

                     this.bn[var1.ac * 1383258553][107915439 * var1.ax] = null;
                  }
               }
            }

            return true;
         } else {
            var1.ao.ay(var1.as * 601813091, this.be(var1, -1232918609), this.bc(var1, (byte)-78));
            return false;
         }
      } catch (RuntimeException var11) {
         throw vk.ae(var11, "ms.cf(" + ')');
      }
   }

   public boolean ab(int var1) {
      try {
         synchronized(this.ba) {
            boolean var10000;
            if (this.ac.ae() > 0) {
               if (var1 == 244191263) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ms.ab(" + ')');
      }
   }

   protected bk an() {
      return this.bw;
   }

   protected bk ak() {
      return this.bw;
   }

   void ft() {
      int var1 = 462450459 * this.bx;
      int var2 = -1112281507 * this.bf;

      long var3;
      for(var3 = this.bs * 1055179931651124245L; -1112281507 * this.bf == var2; var3 = this.bh.ad(var2)) {
         while(this.bh.ax[var1] == var2) {
            this.bh.ax(var1);
            int var5 = this.bh.au(var1);
            if (1 == var5) {
               this.bh.af();
               this.bh.aq(var1);
               if (this.bh.ap()) {
                  if (!this.bd || 0 == var2) {
                     this.bg(762287461);
                     this.bh.ae();
                     return;
                  }

                  this.bh.ab(var3);
               }
               break;
            }

            if ((var5 & 128) != 0) {
               this.bv(var5, -1856457959);
            }

            this.bh.at(var1);
            this.bh.aq(var1);
         }

         var1 = this.bh.ah();
         var2 = this.bh.ax[var1];
      }

      this.bx = -890875117 * var1;
      this.bf = var2 * -1396156939;
      this.bs = var3 * 6591107080710570813L;
   }

   protected bk bh() {
      return this.bw;
   }

   protected bk bd() {
      return this.bw;
   }

   protected bk bx() {
      return this.bw;
   }

   protected bk bf() {
      return null;
   }

   protected int bm() {
      return 0;
   }

   void en(int var1) {
      if (0 != (this.as[var1] & 2)) {
         for(nb var2 = (nb)this.bw.ae.af(); null != var2; var2 = (nb)this.bw.ae.au()) {
            if (416753141 * var2.ac == var1 && this.ak[var1][528717609 * var2.aq] == null && var2.ab * -1783172009 < 0) {
               var2.ab = 0;
            }
         }
      }

   }

   void de(int var1, int var2) {
      if (this.at[var1] != var2) {
         this.at[var1] = var2;

         for(int var3 = 0; var3 < 128; ++var3) {
            this.bn[var1][var3] = null;
         }
      }

   }

   protected void ba(int[] var1, int var2, int var3) {
      if (this.bh.ag()) {
         int var4 = this.bh.ae * this.ag * -450506427 / (bz.ax * -1346898832);

         do {
            long var5 = (long)var3 * (long)var4 + this.bm * -1172391544945565461L;
            if (this.bs * 1055179931651124245L - var5 >= 0L) {
               this.bm = -1909301745175984189L * var5;
               break;
            }

            int var7 = (int)((this.bs * 1055179931651124245L - -1172391544945565461L * this.bm + (long)var4 - 1L) / (long)var4);
            this.bm += -1909301745175984189L * (long)var7 * (long)var4;
            this.bw.au(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.cn(-1660420066);
         } while(this.bh.ag());
      }

      this.bw.au(var1, var2, var3);
   }

   public boolean ce() {
      synchronized(this.ba) {
         return this.bh.ag();
      }
   }

   protected void bp(int[] var1, int var2, int var3) {
      if (this.bh.ag()) {
         int var4 = this.bh.ae * this.ag * -1318576595 / (bz.ax * -1578400357);

         do {
            long var5 = (long)var3 * (long)var4 + this.bm * -1172391544945565461L;
            if (this.bs * 1055179931651124245L - var5 >= 0L) {
               this.bm = -1909301745175984189L * var5;
               break;
            }

            int var7 = (int)((this.bs * 1055179931651124245L - -1172391544945565461L * this.bm + (long)var4 - 1L) / (long)var4);
            this.bm += -1909301745175984189L * (long)var7 * (long)var4;
            this.bw.au(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.cn(-1660420066);
         } while(this.bh.ag());
      }

      this.bw.au(var1, var2, var3);
   }

   protected void bl(int var1) {
      if (this.bh.ag()) {
         int var2 = this.bh.ae * -1318576595 * this.ag / (-1578400357 * bz.ax);

         do {
            long var3 = this.bm * -1172391544945565461L + (long)var1 * (long)var2;
            if (1055179931651124245L * this.bs - var3 >= 0L) {
               this.bm = -1909301745175984189L * var3;
               break;
            }

            int var5 = (int)((1055179931651124245L * this.bs - -1172391544945565461L * this.bm + (long)var2 - 1L) / (long)var2);
            this.bm += -1909301745175984189L * (long)var5 * (long)var2;
            this.bw.al(var5);
            var1 -= var5;
            this.cn(-1660420066);
         } while(this.bh.ag());
      }

      this.bw.al(var1);
   }

   protected void bz(int var1) {
      if (this.bh.ag()) {
         int var2 = this.bh.ae * -1318576595 * this.ag / (-1578400357 * bz.ax);

         do {
            long var3 = this.bm * -1172391544945565461L + (long)var1 * (long)var2;
            if (1055179931651124245L * this.bs - var3 >= 0L) {
               this.bm = -1909301745175984189L * var3;
               break;
            }

            int var5 = (int)((1055179931651124245L * this.bs - -1172391544945565461L * this.bm + (long)var2 - 1L) / (long)var2);
            this.bm += -1909301745175984189L * (long)var5 * (long)var2;
            this.bw.al(var5);
            var1 -= var5;
            this.cn(-1660420066);
         } while(this.bh.ag());
      }

      this.bw.al(var1);
   }

   public void cm(int var1) {
      synchronized(this.ba) {
         this.ae = var1 * -1336600621;
      }
   }

   public void cu(int var1) {
      synchronized(this.ba) {
         this.ae = var1 * -536428916;
      }
   }

   boolean fg(nb var1, int[] var2, int var3, int var4) {
      var1.as = -1578400357 * bz.ax / 100 * -1003286197;
      if (-1783172009 * var1.ab < 0 || null != var1.ao && !var1.ao.by()) {
         int var5 = var1.al * 2032790304;
         if (var5 > 0) {
            var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.ad[var1.ac * -1940759595] * 4.921259842519685E-4D) + 0.5D);
            if (var5 < 0) {
               var5 = 0;
            }

            var1.al = -1888821880 * var5;
         }

         var1.ao.av(this.bk(var1, -95203169));
         mv var6 = var1.am;
         boolean var7 = false;
         var1.aa += -1063289553;
         var1.ai += var6.at * 143402229;
         double var8 = 5.086263020833333E-6D * (double)((var1.al * 1372697750 * -864386336 * var1.ar >> 12) + (1890269881 * var1.aq - -238372113 << 8));
         if (var6.ag * 386568511 > 0) {
            if (var6.aq * -1187728452 > 0) {
               var1.ad += (int)(128.0D * Math.pow(2.0D, (double)(-453355093 * var6.aq) * var8) + 0.5D) * 1870484991;
            } else {
               var1.ad += 708532864;
            }
         }

         if (var6.ac != null) {
            if (-1545541543 * var6.am > 0) {
               var1.ah += (int)(128.0D * Math.pow(2.0D, var8 * (double)(-1023198957 * var6.am)) + 0.5D) * 814564763;
            } else {
               var1.ah += 1274845899;
            }

            while(var1.ap * 1324390209 < var6.ac.length - 2 && -723438027 * var1.ah > (var6.ac[2 + 1324390209 * var1.ap] & -2054611138) << 8) {
               var1.ap += -2035289726;
            }

            if (1324390209 * var1.ap == var6.ac.length - 2 && 0 == var6.ac[1 + 1324390209 * var1.ap]) {
               var7 = true;
            }
         }

         if (-1783172009 * var1.ab >= 0 && var6.ae != null && (this.as[var1.ac * -837380337] & 1) == 0 && (var1.ax * 807209312 < 0 || this.bn[var1.ac * -1613455720][var1.ax * 107915439] != var1)) {
            if (var6.ax * -1240192717 > 0) {
               var1.ab += (int)(128.0D * Math.pow(2.0D, var8 * (double)(-1057618649 * var6.ax)) + 0.5D) * -1452971547;
            } else {
               var1.ab += -1852066944;
            }

            while(var1.az * -184078825 < var6.ae.length - 2 && var1.ab * -379281630 > (var6.ae[-184078825 * var1.az + 2] & 255) << 8) {
               var1.az += 145085262;
            }

            if (var6.ae.length - 2 == var1.az * -184078825) {
               var7 = true;
            }
         }

         if (var7) {
            var1.ao.aj(601813091 * var1.as);
            if (null != var2) {
               var1.ao.au(var2, var3, var4);
            } else {
               var1.ao.al(var4);
            }

            if (var1.ao.bb()) {
               this.bw.ag.ac(var1.ao);
            }

            var1.ac(-1113329963);
            if (var1.ab * -1783172009 >= 0) {
               var1.jb();
               if (-2146015630 * var1.ax > 0 && var1 == this.bn[1383258553 * var1.ac][107915439 * var1.ax]) {
                  this.bn[var1.ac * 1383258553][-501248197 * var1.ax] = null;
               }
            }

            return true;
         } else {
            var1.ao.ay(var1.as * 601813091, this.be(var1, -1291276223), this.bc(var1, (byte)-124));
            return false;
         }
      } else {
         var1.ac(-1113329963);
         var1.jb();
         if (var1.ax * -1035587635 > 0 && this.bn[var1.ac * 461084489][107915439 * var1.ax] == var1) {
            this.bn[var1.ac * 932168657][var1.ax * -346162996] = null;
         }

         return true;
      }
   }

   public int cj() {
      return this.ae * -1104127909;
   }

   void bq(int var1, int var2, int var3) {
      try {
         this.aw[var1] = var2;
         this.an[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ms.bq(" + ')');
      }
   }

   int be(nb var1, int var2) {
      try {
         mv var3 = var1.am;
         int var4 = this.am[1383258553 * var1.ac] * this.aq[var1.ac * 1383258553] + 4096 >> 13;
         var4 = 16384 + var4 * var4 >> 15;
         var4 = 16384 + var4 * var1.af * 76825659 >> 15;
         var4 = var4 * -1104127909 * this.ae + 128 >> 8;
         if (-336379351 * var3.ag > 0) {
            if (var2 == -691127954) {
               throw new IllegalStateException();
            }

            var4 = (int)((double)var4 * Math.pow(0.5D, (double)(var1.ad * 663439261) * 1.953125E-5D * (double)(-336379351 * var3.ag)) + 0.5D);
         }

         int var5;
         int var6;
         int var7;
         int var8;
         if (var3.ac != null) {
            if (var2 == -691127954) {
               throw new IllegalStateException();
            }

            var5 = var1.ah * 127781599;
            var6 = var3.ac[1324390209 * var1.ap + 1];
            if (var1.ap * 1324390209 < var3.ac.length - 2) {
               if (var2 == -691127954) {
                  throw new IllegalStateException();
               }

               var7 = (var3.ac[1324390209 * var1.ap] & 255) << 8;
               var8 = (var3.ac[1324390209 * var1.ap + 2] & 255) << 8;
               var6 += (var5 - var7) * (var3.ac[3 + var1.ap * 1324390209] - var6) / (var8 - var7);
            }

            var4 = var6 * var4 + 32 >> 6;
         }

         if (var1.ab * -1783172009 > 0) {
            if (var2 == -691127954) {
               throw new IllegalStateException();
            }

            if (var3.ae != null) {
               if (var2 == -691127954) {
                  throw new IllegalStateException();
               }

               var5 = -1783172009 * var1.ab;
               var6 = var3.ae[-184078825 * var1.az + 1];
               if (var1.az * -184078825 < var3.ae.length - 2) {
                  var7 = (var3.ae[var1.az * -184078825] & 255) << 8;
                  var8 = (var3.ae[2 + var1.az * -184078825] & 255) << 8;
                  var6 += (var3.ae[3 + -184078825 * var1.az] - var6) * (var5 - var7) / (var8 - var7);
               }

               var4 = 32 + var4 * var6 >> 6;
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "ms.be(" + ')');
      }
   }

   public boolean cy(nk var1, po var2, bo var3) {
      synchronized(this.ba) {
         boolean var5 = true;
         synchronized(this.bj) {
            this.bj.clear();
         }

         for(nv var6 = (nv)var1.ac.am(); var6 != null; var6 = (nv)var1.ac.ax()) {
            int var7 = (int)var6.hk;
            nc var8 = (nc)this.ac.ac((long)var7);
            if (var8 == null) {
               byte[] var10 = var2.ch(var7, (byte)-36);
               nc var9;
               if (var10 == null) {
                  var9 = null;
               } else {
                  var9 = new nc(var10);
               }

               var8 = var9;
               if (null == var9) {
                  var5 = false;
                  continue;
               }

               this.ac.ag(var9, (long)var7);
            }

            if (!var8.ac(var3, var6.ae, 1846338276)) {
               var5 = false;
            } else if (this.bj != null) {
               synchronized(this.bj) {
                  Iterator var17 = var8.au.iterator();

                  while(var17.hasNext()) {
                     ch var11 = (ch)var17.next();
                     this.bj.add(new nt(648016565 * var6.ac, var11));
                  }
               }
            }
         }

         return var5;
      }
   }

   public boolean co(nk var1, po var2, bo var3) {
      synchronized(this.ba) {
         boolean var5 = true;
         synchronized(this.bj) {
            this.bj.clear();
         }

         for(nv var6 = (nv)var1.ac.am(); var6 != null; var6 = (nv)var1.ac.ax()) {
            int var7 = (int)var6.hk;
            nc var8 = (nc)this.ac.ac((long)var7);
            if (var8 == null) {
               byte[] var10 = var2.ch(var7, (byte)-46);
               nc var9;
               if (var10 == null) {
                  var9 = null;
               } else {
                  var9 = new nc(var10);
               }

               var8 = var9;
               if (null == var9) {
                  var5 = false;
                  continue;
               }

               this.ac.ag(var9, (long)var7);
            }

            if (!var8.ac(var3, var6.ae, 1851480813)) {
               var5 = false;
            } else if (this.bj != null) {
               synchronized(this.bj) {
                  Iterator var17 = var8.au.iterator();

                  while(var17.hasNext()) {
                     ch var11 = (ch)var17.next();
                     this.bj.add(new nt(-327851605 * var6.ac, var11));
                  }
               }
            }
         }

         return var5;
      }
   }

   public void cv() {
      if (null != this.bj) {
         if (bp != null) {
            bp.set(true);
         }

         bp = new AtomicBoolean(false);
         AtomicBoolean var1 = bp;
         if (null == by) {
            int var2 = Runtime.getRuntime().availableProcessors();
            by = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new mt(this));
         }

         by.submit(new nw(this, var1));
      }
   }

   public void cg() {
      if (null != this.bj) {
         if (bp != null) {
            bp.set(true);
         }

         bp = new AtomicBoolean(false);
         AtomicBoolean var1 = bp;
         if (null == by) {
            int var2 = Runtime.getRuntime().availableProcessors();
            by = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new mt(this));
         }

         by.submit(new nw(this, var1));
      }
   }

   void fb() {
      int var1 = -1643326378 * this.bx;
      int var2 = -1112281507 * this.bf;

      long var3;
      for(var3 = this.bs * 1055179931651124245L; 1575728733 * this.bf == var2; var3 = this.bh.ad(var2)) {
         while(this.bh.ax[var1] == var2) {
            this.bh.ax(var1);
            int var5 = this.bh.au(var1);
            if (1 == var5) {
               this.bh.af();
               this.bh.aq(var1);
               if (this.bh.ap()) {
                  if (!this.bd || 0 == var2) {
                     this.bg(-374691570);
                     this.bh.ae();
                     return;
                  }

                  this.bh.ab(var3);
               }
               break;
            }

            if ((var5 & 1678676984) != 0) {
               this.bv(var5, -1856457959);
            }

            this.bh.at(var1);
            this.bh.aq(var1);
         }

         var1 = this.bh.ah();
         var2 = this.bh.ax[var1];
      }

      this.bx = -890875117 * var1;
      this.bf = var2 * -463488345;
      this.bs = var3 * 6591107080710570813L;
   }

   public void cq() {
      synchronized(this.ba) {
         for(nc var2 = (nc)this.ac.am(); null != var2; var2 = (nc)this.ac.ax()) {
            var2.ae((byte)1);
         }

      }
   }

   public ms(bz var1) {
      try {
         super();
         this.ae = 1427624704;
         this.ag = -137366720;
         this.am = new int[16];
         this.ax = new int[16];
         this.aq = new int[16];
         this.af = new int[16];
         this.at = new int[16];
         this.au = new int[16];
         this.ar = new int[16];
         this.al = new int[16];
         this.ad = new int[16];
         this.as = new int[16];
         this.ay = new int[16];
         this.aj = new int[16];
         this.av = new int[16];
         this.aw = new int[16];
         this.an = new int[16];
         this.ak = new nb[16][128];
         this.bn = new nb[16][128];
         this.bh = new my();
         this.bw = new nq(this);
         this.ba = null;
         this.bj = new PriorityQueue(5, new np());
         this.bb = 0;
         this.ba = var1;
         this.ac = new uu(128);
         this.bg(-677518807);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ms.<init>(" + ')');
      }
   }

   public void cw() {
      synchronized(this.ba) {
         for(nc var2 = (nc)this.ac.am(); null != var2; var2 = (nc)this.ac.ax()) {
            var2.ae((byte)1);
         }

      }
   }

   public void cr() {
      synchronized(this.ba) {
         for(nc var2 = (nc)this.ac.am(); var2 != null; var2 = (nc)this.ac.ax()) {
            var2.jb();
         }

      }
   }

   public void cl(nk var1, boolean var2) {
      synchronized(this.ba) {
         this.ah(2102080928);
         this.bh.ac(var1.ae);
         this.bd = var2;
         this.bm = 0L;
         int var4 = this.bh.am();

         for(int var5 = 0; var5 < var4; ++var5) {
            this.bh.ax(var5);
            this.bh.at(var5);
            this.bh.aq(var5);
         }

         this.bx = this.bh.ah() * -890875117;
         this.bf = -1252544492 * this.bh.ax[-765337940 * this.bx];
         this.bs = this.bh.ad(2039327848 * this.bf) * 6591107080710570813L;
      }
   }

   public void ca(nk var1, boolean var2) {
      synchronized(this.ba) {
         this.ah(-781520236);
         this.bh.ac(var1.ae);
         this.bd = var2;
         this.bm = 0L;
         int var4 = this.bh.am();

         for(int var5 = 0; var5 < var4; ++var5) {
            this.bh.ax(var5);
            this.bh.at(var5);
            this.bh.aq(var5);
         }

         this.bx = this.bh.ah() * -890875117;
         this.bf = -1396156939 * this.bh.ax[462450459 * this.bx];
         this.bs = this.bh.ad(-1112281507 * this.bf) * 6591107080710570813L;
      }
   }

   public void cs(nk var1, boolean var2) {
      synchronized(this.ba) {
         this.ah(1306233102);
         this.bh.ac(var1.ae);
         this.bd = var2;
         this.bm = 0L;
         int var4 = this.bh.am();

         for(int var5 = 0; var5 < var4; ++var5) {
            this.bh.ax(var5);
            this.bh.at(var5);
            this.bh.aq(var5);
         }

         this.bx = this.bh.ah() * -890875117;
         this.bf = -1396156939 * this.bh.ax[462450459 * this.bx];
         this.bs = this.bh.ad(-1112281507 * this.bf) * 6591107080710570813L;
      }
   }

   public void cp(nk var1, boolean var2) {
      synchronized(this.ba) {
         this.ah(-1177246049);
         this.bh.ac(var1.ae);
         this.bd = var2;
         this.bm = 0L;
         int var4 = this.bh.am();

         for(int var5 = 0; var5 < var4; ++var5) {
            this.bh.ax(var5);
            this.bh.at(var5);
            this.bh.aq(var5);
         }

         this.bx = this.bh.ah() * -890875117;
         this.bf = -1396156939 * this.bh.ax[462450459 * this.bx];
         this.bs = this.bh.ad(-1112281507 * this.bf) * 6591107080710570813L;
      }
   }

   public void cb() {
      synchronized(this.ba) {
         this.bh.ae();
         this.bg(1862622368);
      }
   }

   public boolean ci(nk var1, po var2, bo var3) {
      synchronized(this.ba) {
         boolean var5 = true;
         synchronized(this.bj) {
            this.bj.clear();
         }

         for(nv var6 = (nv)var1.ac.am(); var6 != null; var6 = (nv)var1.ac.ax()) {
            int var7 = (int)var6.hk;
            nc var8 = (nc)this.ac.ac((long)var7);
            if (var8 == null) {
               byte[] var10 = var2.ch(var7, (byte)-11);
               nc var9;
               if (var10 == null) {
                  var9 = null;
               } else {
                  var9 = new nc(var10);
               }

               var8 = var9;
               if (null == var9) {
                  var5 = false;
                  continue;
               }

               this.ac.ag(var9, (long)var7);
            }

            if (!var8.ac(var3, var6.ae, 1587904989)) {
               var5 = false;
            } else if (this.bj != null) {
               synchronized(this.bj) {
                  Iterator var17 = var8.au.iterator();

                  while(var17.hasNext()) {
                     ch var11 = (ch)var17.next();
                     this.bj.add(new nt(193117257 * var6.ac, var11));
                  }
               }
            }
         }

         return var5;
      }
   }

   public void cz() {
      synchronized(this.ba) {
         for(nc var2 = (nc)this.ac.am(); null != var2; var2 = (nc)this.ac.ax()) {
            var2.ae((byte)1);
         }

      }
   }

   public boolean ck() {
      synchronized(this.ba) {
         return this.bh.ag();
      }
   }

   boolean fp(nb var1, int[] var2, int var3, int var4) {
      var1.as = -1578400357 * bz.ax / 1455166919 * -1023665343;
      if (-1783172009 * var1.ab < 0 || null != var1.ao && !var1.ao.by()) {
         int var5 = var1.al * -848112642;
         if (var5 > 0) {
            var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.ad[var1.ac * -408125774] * 4.921259842519685E-4D) + 0.5D);
            if (var5 < 0) {
               var5 = 0;
            }

            var1.al = -1728629246 * var5;
         }

         var1.ao.av(this.bk(var1, -95203169));
         mv var6 = var1.am;
         boolean var7 = false;
         var1.aa += 351761221;
         var1.ai += var6.at * -1666391658;
         double var8 = 5.086263020833333E-6D * (double)((var1.al * 693097243 * -1635351087 * var1.ar >> 12) + (-1320068798 * var1.aq - 447762124 << 8));
         if (var6.ag * 1266069049 > 0) {
            if (var6.aq * 82581475 > 0) {
               var1.ad += (int)(128.0D * Math.pow(2.0D, (double)(1378787823 * var6.aq) * var8) + 0.5D) * 945059509;
            } else {
               var1.ad += 1065155775;
            }
         }

         if (var6.ac != null) {
            if (-1023198957 * var6.am > 0) {
               var1.ah += (int)(128.0D * Math.pow(2.0D, var8 * (double)(-1023198957 * var6.am)) + 0.5D) * 730837757;
            } else {
               var1.ah += -734490752;
            }

            while(var1.ap * -1963289066 < var6.ac.length - 2 && 1795715395 * var1.ah > (var6.ac[2 + 1755902743 * var1.ap] & -498913882) << 8) {
               var1.ap += -1317571889;
            }

            if (-1443616075 * var1.ap == var6.ac.length - 2 && 0 == var6.ac[1 + 2047776885 * var1.ap]) {
               var7 = true;
            }
         }

         if (-1783172009 * var1.ab >= 0 && var6.ae != null && (this.as[var1.ac * -1953078051] & 1) == 0 && (var1.ax * 1639948901 < 0 || this.bn[var1.ac * 1383258553][var1.ax * -1233102939] != var1)) {
            if (var6.ax * -2061214374 > 0) {
               var1.ab += (int)(128.0D * Math.pow(2.0D, var8 * (double)(1560114920 * var6.ax)) + 0.5D) * 992163687;
            } else {
               var1.ab += -1852066944;
            }

            while(var1.az * -1534011301 < var6.ae.length - 2 && var1.ab * -1848613124 > (var6.ae[-184078825 * var1.az + 2] & 877267515) << 8) {
               var1.az += 145085262;
            }

            if (var6.ae.length - 2 == var1.az * -184078825) {
               var7 = true;
            }
         }

         if (var7) {
            var1.ao.aj(601813091 * var1.as);
            if (null != var2) {
               var1.ao.au(var2, var3, var4);
            } else {
               var1.ao.al(var4);
            }

            if (var1.ao.bb()) {
               this.bw.ag.ac(var1.ao);
            }

            var1.ac(-1113329963);
            if (var1.ab * -1783172009 >= 0) {
               var1.jb();
               if (107915439 * var1.ax > 0 && var1 == this.bn[699672219 * var1.ac][107915439 * var1.ax]) {
                  this.bn[var1.ac * 1383258553][32119370 * var1.ax] = null;
               }
            }

            return true;
         } else {
            var1.ao.ay(var1.as * 601813091, this.be(var1, -761209979), this.bc(var1, (byte)-71));
            return false;
         }
      } else {
         var1.ac(-1113329963);
         var1.jb();
         if (var1.ax * 1780216483 > 0 && this.bn[var1.ac * -860983805][1738449372 * var1.ax] == var1) {
            this.bn[var1.ac * 1383258553][var1.ax * 493152162] = null;
         }

         return true;
      }
   }

   public boolean df() {
      synchronized(this.ba) {
         return this.ac.ae() > 0;
      }
   }

   public void dv(int var1, int var2) {
      synchronized(this.ba) {
         this.aa(var1, var2, -1552461332);
      }
   }

   void dt(int var1, int var2) {
      this.af[var1] = var2;
      this.au[var1] = var2 & -128;
      this.ai(var1, var2, (byte)3);
   }

   protected bk bn() {
      return this.bw;
   }

   void dl(int var1, int var2) {
      this.af[var1] = var2;
      this.au[var1] = var2 & -128;
      this.ai(var1, var2, (byte)3);
   }

   void cn(int var1) {
      try {
         int var2 = 462450459 * this.bx;
         int var3 = -1112281507 * this.bf;
         long var4 = this.bs * 1055179931651124245L;

         label79:
         while(true) {
            if (-1112281507 * this.bf != var3) {
               this.bx = -890875117 * var2;
               this.bf = var3 * -1396156939;
               this.bs = var4 * 6591107080710570813L;
               return;
            }

            if (var1 != -1660420066) {
               return;
            }

            while(this.bh.ax[var2] == var3) {
               if (var1 != -1660420066) {
                  throw new IllegalStateException();
               }

               this.bh.ax(var2);
               int var6 = this.bh.au(var2);
               if (1 == var6) {
                  if (var1 != -1660420066) {
                     throw new IllegalStateException();
                  }

                  this.bh.af();
                  this.bh.aq(var2);
                  if (!this.bh.ap()) {
                     if (var1 != -1660420066) {
                        return;
                     }
                  } else {
                     if (!this.bd) {
                        break label79;
                     }

                     if (var1 != -1660420066) {
                        throw new IllegalStateException();
                     }

                     if (0 == var3) {
                        break label79;
                     }

                     if (var1 != -1660420066) {
                        throw new IllegalStateException();
                     }

                     this.bh.ab(var4);
                  }
                  break;
               }

               if ((var6 & 128) != 0) {
                  if (var1 != -1660420066) {
                     throw new IllegalStateException();
                  }

                  this.bv(var6, -1856457959);
               }

               this.bh.at(var2);
               this.bh.aq(var2);
            }

            var2 = this.bh.ah();
            var3 = this.bh.ax[var2];
            var4 = this.bh.ad(var3);
         }

         this.bg(-838542528);
         this.bh.ae();
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "ms.cn(" + ')');
      }
   }

   void dc(int var1, int var2) {
      if (this.at[var1] != var2) {
         this.at[var1] = var2;

         for(int var3 = 0; var3 < 128; ++var3) {
            this.bn[var1][var3] = null;
         }
      }

   }

   void dw(int var1, int var2) {
      if (this.at[var1] != var2) {
         this.at[var1] = var2;

         for(int var3 = 0; var3 < 128; ++var3) {
            this.bn[var1][var3] = null;
         }
      }

   }

   void db(int var1, int var2) {
      this.af[var1] = var2;
      this.au[var1] = var2 & -128;
      this.ai(var1, var2, (byte)3);
   }

   void dx(int var1, int var2, int var3) {
      this.ay(var1, var2, 64, -1085634046);
      if ((this.as[var1] & 2) != 0) {
         for(nb var4 = (nb)this.bw.ae.at(); null != var4; var4 = (nb)this.bw.ae.ar()) {
            if (var4.ac * 1383258553 == var1 && -1783172009 * var4.ab < 0) {
               this.ak[var1][528717609 * var4.aq] = null;
               this.ak[var1][var2] = var4;
               int var5 = 1533372179 * var4.au + (var4.ar * -1635351087 * var4.al * 693097243 >> 12);
               var4.au += 1578662683 * (var2 - 528717609 * var4.aq << 8);
               var4.ar = 1397486385 * (var5 - var4.au * 1533372179);
               var4.al = -1527697408;
               var4.aq = var2 * 1411183897;
               return;
            }
         }
      }

      nc var8 = (nc)this.ac.ac((long)this.at[var1]);
      if (var8 != null) {
         if (null != var8.ag[var2]) {
            bg var9 = var8.ag[var2].ag(-125907077);
            if (var9 != null) {
               nb var6 = new nb();
               var6.ac = -2044502903 * var1;
               var6.ae = var8;
               var6.ag = var9;
               var6.am = var8.af[var2];
               var6.ax = -54677937 * var8.at[var2];
               var6.aq = var2 * 1411183897;
               var6.af = (1024 + 1608731747 * var8.ac * var3 * var3 * var8.ax[var2] >> 11) * 369226995;
               var6.at = -1976614343 * (var8.aq[var2] & 255);
               var6.au = 1578662683 * ((var2 << 8) - (var8.am[var2] & 32767));
               var6.ad = 0;
               var6.ah = 0;
               var6.ap = 0;
               var6.ab = -992163687;
               var6.az = 0;
               if (0 == this.av[var1]) {
                  var6.ao = bq.am(var9, this.bk(var6, -95203169), this.be(var6, -1491007443), this.bc(var6, (byte)-116));
               } else {
                  var6.ao = bq.am(var9, this.bk(var6, -95203169), 0, this.bc(var6, (byte)-101));
                  this.as(var6, var8.am[var2] < 0, -183382586);
               }

               if (var8.am[var2] < 0) {
                  var6.ao.ar(-1);
               }

               if (var6.ax * 107915439 >= 0) {
                  nb var7 = this.bn[var1][var6.ax * 107915439];
                  if (null != var7 && var7.ab * -1783172009 < 0) {
                     this.ak[var1][var7.aq * 528717609] = null;
                     var7.ab = 0;
                  }

                  this.bn[var1][107915439 * var6.ax] = var6;
               }

               this.bw.ae.ae(var6);
               this.ak[var1][var2] = var6;
            }
         }
      }
   }

   void dj(int var1, int var2, int var3) {
      this.ay(var1, var2, 64, -889249261);
      if ((this.as[var1] & 2) != 0) {
         for(nb var4 = (nb)this.bw.ae.at(); null != var4; var4 = (nb)this.bw.ae.ar()) {
            if (var4.ac * 1383258553 == var1 && -1783172009 * var4.ab < 0) {
               this.ak[var1][528717609 * var4.aq] = null;
               this.ak[var1][var2] = var4;
               int var5 = 1533372179 * var4.au + (var4.ar * -1635351087 * var4.al * 693097243 >> 12);
               var4.au += 1578662683 * (var2 - 528717609 * var4.aq << 8);
               var4.ar = 1397486385 * (var5 - var4.au * 1533372179);
               var4.al = -1527697408;
               var4.aq = var2 * 1411183897;
               return;
            }
         }
      }

      nc var8 = (nc)this.ac.ac((long)this.at[var1]);
      if (var8 != null) {
         if (null != var8.ag[var2]) {
            bg var9 = var8.ag[var2].ag(-653349460);
            if (var9 != null) {
               nb var6 = new nb();
               var6.ac = -2044502903 * var1;
               var6.ae = var8;
               var6.ag = var9;
               var6.am = var8.af[var2];
               var6.ax = -54677937 * var8.at[var2];
               var6.aq = var2 * 1411183897;
               var6.af = (1024 + 1608731747 * var8.ac * var3 * var3 * var8.ax[var2] >> 11) * 369226995;
               var6.at = -1976614343 * (var8.aq[var2] & 255);
               var6.au = 1578662683 * ((var2 << 8) - (var8.am[var2] & 32767));
               var6.ad = 0;
               var6.ah = 0;
               var6.ap = 0;
               var6.ab = -992163687;
               var6.az = 0;
               if (0 == this.av[var1]) {
                  var6.ao = bq.am(var9, this.bk(var6, -95203169), this.be(var6, -922359559), this.bc(var6, (byte)-13));
               } else {
                  var6.ao = bq.am(var9, this.bk(var6, -95203169), 0, this.bc(var6, (byte)-123));
                  this.as(var6, var8.am[var2] < 0, -1028926679);
               }

               if (var8.am[var2] < 0) {
                  var6.ao.ar(-1);
               }

               if (var6.ax * 107915439 >= 0) {
                  nb var7 = this.bn[var1][var6.ax * 107915439];
                  if (null != var7 && var7.ab * -1783172009 < 0) {
                     this.ak[var1][var7.aq * 528717609] = null;
                     var7.ab = 0;
                  }

                  this.bn[var1][107915439 * var6.ax] = var6;
               }

               this.bw.ae.ae(var6);
               this.ak[var1][var2] = var6;
            }
         }
      }
   }

   void do(nb var1, boolean var2) {
      int var3 = var1.ag.ae.length;
      int var4;
      if (var2 && var1.ag.ax) {
         int var5 = var3 + var3 - var1.ag.ag;
         var4 = (int)((long)this.av[1685470409 * var1.ac] * (long)var5 >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.ao.ai(true);
         }
      } else {
         var4 = (int)((long)this.av[-1405894810 * var1.ac] * (long)var3 >> 6);
      }

      var1.ao.aa(var4);
   }

   void dh(nb var1, boolean var2) {
      int var3 = var1.ag.ae.length;
      int var4;
      if (var2 && var1.ag.ax) {
         int var5 = var3 + var3 - var1.ag.ag;
         var4 = (int)((long)this.av[1383258553 * var1.ac] * (long)var5 >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.ao.ai(true);
         }
      } else {
         var4 = (int)((long)this.av[1383258553 * var1.ac] * (long)var3 >> 6);
      }

      var1.ao.aa(var4);
   }

   void dm(nb var1, boolean var2) {
      int var3 = var1.ag.ae.length;
      int var4;
      if (var2 && var1.ag.ax) {
         int var5 = var3 + var3 - var1.ag.ag;
         var4 = (int)((long)this.av[872848117 * var1.ac] * (long)var5 >> 6);
         var3 <<= 8;
         if (var4 >= var3) {
            var4 = var3 + var3 - 1 - var4;
            var1.ao.ai(true);
         }
      } else {
         var4 = (int)((long)this.av[1383258553 * var1.ac] * (long)var3 >> 6);
      }

      var1.ao.aa(var4);
   }

   void dq(int var1, int var2, int var3) {
      nb var4 = this.ak[var1][var2];
      if (var4 != null) {
         this.ak[var1][var2] = null;
         if ((this.as[var1] & 2) != 0) {
            for(nb var5 = (nb)this.bw.ae.af(); null != var5; var5 = (nb)this.bw.ae.au()) {
               if (var4.ac * -419124226 == var5.ac * 1383258553 && -1831345629 * var5.ab < 0 && var4 != var5) {
                  var4.ab = 0;
                  break;
               }
            }
         } else {
            var4.ab = 0;
         }

      }
   }

   void di(int var1, int var2, int var3) {
      nb var4 = this.ak[var1][var2];
      if (var4 != null) {
         this.ak[var1][var2] = null;
         if ((this.as[var1] & 2) != 0) {
            for(nb var5 = (nb)this.bw.ae.af(); null != var5; var5 = (nb)this.bw.ae.au()) {
               if (var4.ac * 1383258553 == var5.ac * 1383258553 && -1783172009 * var5.ab < 0 && var4 != var5) {
                  var4.ab = 0;
                  break;
               }
            }
         } else {
            var4.ab = 0;
         }

      }
   }

   void da(int var1, int var2, int var3) {
      nb var4 = this.ak[var1][var2];
      if (var4 != null) {
         this.ak[var1][var2] = null;
         if ((this.as[var1] & 2) != 0) {
            for(nb var5 = (nb)this.bw.ae.af(); null != var5; var5 = (nb)this.bw.ae.au()) {
               if (var4.ac * 2087876960 == var5.ac * 1383258553 && -111013640 * var5.ab < 0 && var4 != var5) {
                  var4.ab = 0;
                  break;
               }
            }
         } else {
            var4.ab = 0;
         }

      }
   }

   public void ah(int var1) {
      try {
         synchronized(this.ba) {
            this.bh.ae();
            this.bg(419017179);
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ms.ah(" + ')');
      }
   }

   protected bk af() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ms.af(" + ')');
      }
   }

   void em() {
      this.by(-1, (byte)0);
      this.bb(-1, -1622543042);

      int var1;
      for(var1 = 0; var1 < 16; ++var1) {
         this.at[var1] = this.af[var1];
      }

      for(var1 = 0; var1 < 16; ++var1) {
         this.au[var1] = this.af[var1] & -128;
      }

   }

   int bk(nb var1, int var2) {
      try {
         int var3 = (var1.al * 693097243 * var1.ar * -1635351087 >> 12) + var1.au * 1533372179;
         var3 += this.aj[var1.ac * 1383258553] * (this.ar[var1.ac * 1383258553] - 8192) >> 12;
         mv var4 = var1.am;
         int var5;
         if (624438815 * var4.at > 0) {
            label49: {
               if (-282827937 * var4.af <= 0) {
                  if (var2 != -95203169) {
                     throw new IllegalStateException();
                  }

                  if (this.al[1383258553 * var1.ac] <= 0) {
                     break label49;
                  }
               }

               var5 = -282827937 * var4.af << 2;
               int var6 = var4.au * 1552103009 << 1;
               if (-1996035633 * var1.aa < var6) {
                  if (var2 != -95203169) {
                     throw new IllegalStateException();
                  }

                  var5 = var5 * var1.aa * -1996035633 / var6;
               }

               var5 += this.al[1383258553 * var1.ac] >> 7;
               double var7 = Math.sin(0.01227184630308513D * (double)(-459326909 * var1.ai & 511));
               var3 += (int)(var7 * (double)var5);
            }
         }

         var5 = (int)((double)(256 * var1.ag.ac) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var3) / (double)(bz.ax * -1578400357) + 0.5D);
         int var10000;
         if (var5 < 1) {
            if (var2 != -95203169) {
               throw new IllegalStateException();
            }

            var10000 = 1;
         } else {
            var10000 = var5;
         }

         return var10000;
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "ms.bk(" + ')');
      }
   }

   void ed(int var1, int var2) {
      this.aw[var1] = var2;
      this.an[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
   }

   void du(int var1, int var2) {
   }

   void dd(int var1, int var2) {
      this.ar[var1] = var2;
   }

   public void ct() {
      if (null != this.bj) {
         if (bp != null) {
            bp.set(true);
         }

         bp = new AtomicBoolean(false);
         AtomicBoolean var1 = bp;
         if (null == by) {
            int var2 = Runtime.getRuntime().availableProcessors();
            by = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new mt(this));
         }

         by.submit(new nw(this, var1));
      }
   }

   void ea(int var1, int var2) {
      this.ar[var1] = var2;
   }

   void ez(int var1, int var2) {
      this.ar[var1] = var2;
   }

   void ev(int var1) {
      for(nb var2 = (nb)this.bw.ae.af(); var2 != null; var2 = (nb)this.bw.ae.au()) {
         if (var1 < 0 || 1383258553 * var2.ac == var1) {
            if (var2.ao != null) {
               var2.ao.aj(bz.ax * -1578400357 / 100);
               if (var2.ao.bb()) {
                  this.bw.ag.ac(var2.ao);
               }

               var2.ac(-1113329963);
            }

            if (var2.ab * -1783172009 < 0) {
               this.ak[1383258553 * var2.ac][528717609 * var2.aq] = null;
            }

            var2.jb();
         }
      }

   }

   void ef(int var1) {
      for(nb var2 = (nb)this.bw.ae.af(); var2 != null; var2 = (nb)this.bw.ae.au()) {
         if (var1 < 0 || 1383258553 * var2.ac == var1) {
            if (var2.ao != null) {
               var2.ao.aj(bz.ax * -1578400357 / 100);
               if (var2.ao.bb()) {
                  this.bw.ag.ac(var2.ao);
               }

               var2.ac(-1113329963);
            }

            if (var2.ab * -1783172009 < 0) {
               this.ak[1383258553 * var2.ac][528717609 * var2.aq] = null;
            }

            var2.jb();
         }
      }

   }

   public void cd() {
      synchronized(this.ba) {
         this.bh.ae();
         this.bg(-429136657);
      }
   }

   protected void bw(int[] var1, int var2, int var3) {
      if (this.bh.ag()) {
         int var4 = this.bh.ae * this.ag * 1390563194 / (bz.ax * 1010317537);

         do {
            long var5 = (long)var3 * (long)var4 + this.bm * -1172391544945565461L;
            if (this.bs * 1055179931651124245L - var5 >= 0L) {
               this.bm = -1909301745175984189L * var5;
               break;
            }

            int var7 = (int)((this.bs * 1055179931651124245L - -1172391544945565461L * this.bm + (long)var4 - 1L) / (long)var4);
            this.bm += -1909301745175984189L * (long)var7 * (long)var4;
            this.bw.au(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.cn(-1660420066);
         } while(this.bh.ag());
      }

      this.bw.au(var1, var2, var3);
   }

   protected void bu(int var1) {
      if (this.bh.ag()) {
         int var2 = this.bh.ae * 88875042 * this.ag / (-1578400357 * bz.ax);

         do {
            long var3 = this.bm * -1172391544945565461L + (long)var1 * (long)var2;
            if (1055179931651124245L * this.bs - var3 >= 0L) {
               this.bm = -1909301745175984189L * var3;
               break;
            }

            int var5 = (int)((1055179931651124245L * this.bs - -1172391544945565461L * this.bm + (long)var2 - 1L) / (long)var2);
            this.bm += -1909301745175984189L * (long)var5 * (long)var2;
            this.bw.al(var5);
            var1 -= var5;
            this.cn(-1660420066);
         } while(this.bh.ag());
      }

      this.bw.al(var1);
   }

   void eh(int var1) {
      if (var1 >= 0) {
         this.am[var1] = -774699442;
         this.ax[var1] = 8192;
         this.aq[var1] = 16383;
         this.ar[var1] = -926401976;
         this.al[var1] = 0;
         this.ad[var1] = 1290741432;
         this.br(var1, -1880327269);
         this.bo(var1, 688186631);
         this.as[var1] = 0;
         this.ay[var1] = 32767;
         this.aj[var1] = -1720190379;
         this.av[var1] = 0;
         this.bq(var1, 8192, -1082190752);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.bb(var1, 589168227);
         }

      }
   }

   void eu(int var1) {
      if (var1 >= 0) {
         this.am[var1] = -1412922297;
         this.ax[var1] = 1935941067;
         this.aq[var1] = 1471419645;
         this.ar[var1] = 8192;
         this.al[var1] = 0;
         this.ad[var1] = 8192;
         this.br(var1, -1999253999);
         this.bo(var1, 1045416122);
         this.as[var1] = 0;
         this.ay[var1] = 32767;
         this.aj[var1] = -440022304;
         this.av[var1] = 0;
         this.bq(var1, 8192, 779850495);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.bb(var1, -1779183268);
         }

      }
   }

   void ei(int var1) {
      for(nb var2 = (nb)this.bw.ae.af(); null != var2; var2 = (nb)this.bw.ae.au()) {
         if ((var1 < 0 || var2.ac * 1383258553 == var1) && var2.ab * -1783172009 < 0) {
            this.ak[1383258553 * var2.ac][528717609 * var2.aq] = null;
            var2.ab = 0;
         }
      }

   }

   void eo() {
      this.by(-1, (byte)0);
      this.bb(-1, -583035761);

      int var1;
      for(var1 = 0; var1 < 16; ++var1) {
         this.at[var1] = this.af[var1];
      }

      for(var1 = 0; var1 < 16; ++var1) {
         this.au[var1] = this.af[var1] & -128;
      }

   }

   int bc(nb var1, byte var2) {
      try {
         int var3 = this.ax[var1.ac * 1383258553];
         if (var3 < 8192) {
            if (var2 >= -1) {
               throw new IllegalStateException();
            } else {
               return 32 + var3 * var1.at * 656149513 >> 6;
            }
         } else {
            return 16384 - (32 + (128 - var1.at * 656149513) * (16384 - var3) >> 6);
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ms.bc(" + ')');
      }
   }

   void dg(int var1, int var2, int var3) {
   }

   void ao(int var1, int var2, int var3, byte var4) {
      try {
         this.ay(var1, var2, 64, -1395140614);
         if ((this.as[var1] & 2) != 0) {
            for(nb var5 = (nb)this.bw.ae.at(); null != var5; var5 = (nb)this.bw.ae.ar()) {
               if (var5.ac * 1383258553 == var1) {
                  if (var4 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (-1783172009 * var5.ab < 0) {
                     if (var4 <= 1) {
                        throw new IllegalStateException();
                     }

                     this.ak[var1][528717609 * var5.aq] = null;
                     this.ak[var1][var2] = var5;
                     int var6 = 1533372179 * var5.au + (var5.ar * -1635351087 * var5.al * 693097243 >> 12);
                     var5.au += 1578662683 * (var2 - 528717609 * var5.aq << 8);
                     var5.ar = 1397486385 * (var6 - var5.au * 1533372179);
                     var5.al = -1527697408;
                     var5.aq = var2 * 1411183897;
                     return;
                  }
               }
            }
         }

         nc var10 = (nc)this.ac.ac((long)this.at[var1]);
         if (var10 == null) {
            if (var4 <= 1) {
               throw new IllegalStateException();
            }
         } else if (null == var10.ag[var2]) {
            if (var4 <= 1) {
               throw new IllegalStateException();
            }
         } else {
            bg var11 = var10.ag[var2].ag(1280396132);
            if (var11 == null) {
               if (var4 <= 1) {
                  throw new IllegalStateException();
               }
            } else {
               nb var7 = new nb();
               var7.ac = -2044502903 * var1;
               var7.ae = var10;
               var7.ag = var11;
               var7.am = var10.af[var2];
               var7.ax = -54677937 * var10.at[var2];
               var7.aq = var2 * 1411183897;
               var7.af = (1024 + 1608731747 * var10.ac * var3 * var3 * var10.ax[var2] >> 11) * 369226995;
               var7.at = -1976614343 * (var10.aq[var2] & 255);
               var7.au = 1578662683 * ((var2 << 8) - (var10.am[var2] & 32767));
               var7.ad = 0;
               var7.ah = 0;
               var7.ap = 0;
               var7.ab = -992163687;
               var7.az = 0;
               if (0 == this.av[var1]) {
                  if (var4 <= 1) {
                     throw new IllegalStateException();
                  }

                  var7.ao = bq.am(var11, this.bk(var7, -95203169), this.be(var7, 1768265426), this.bc(var7, (byte)-50));
               } else {
                  var7.ao = bq.am(var11, this.bk(var7, -95203169), 0, this.bc(var7, (byte)-6));
                  boolean var10002;
                  if (var10.am[var2] < 0) {
                     if (var4 <= 1) {
                        return;
                     }

                     var10002 = true;
                  } else {
                     var10002 = false;
                  }

                  this.as(var7, var10002, 694387070);
               }

               if (var10.am[var2] < 0) {
                  if (var4 <= 1) {
                     return;
                  }

                  var7.ao.ar(-1);
               }

               if (var7.ax * 107915439 >= 0) {
                  if (var4 <= 1) {
                     throw new IllegalStateException();
                  }

                  nb var8 = this.bn[var1][var7.ax * 107915439];
                  if (null != var8) {
                     if (var4 <= 1) {
                        throw new IllegalStateException();
                     }

                     if (var8.ab * -1783172009 < 0) {
                        if (var4 <= 1) {
                           throw new IllegalStateException();
                        }

                        this.ak[var1][var8.aq * 528717609] = null;
                        var8.ab = 0;
                     }
                  }

                  this.bn[var1][107915439 * var7.ax] = var7;
               }

               this.bw.ae.ae(var7);
               this.ak[var1][var2] = var7;
            }
         }
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "ms.ao(" + ')');
      }
   }

   void eb(int var1) {
      if ((this.as[var1] & 4) != 0) {
         for(nb var2 = (nb)this.bw.ae.af(); null != var2; var2 = (nb)this.bw.ae.au()) {
            if (1383258553 * var2.ac == var1) {
               var2.aj = 0;
            }
         }
      }

   }

   void ek(int var1) {
      if ((this.as[var1] & 4) != 0) {
         for(nb var2 = (nb)this.bw.ae.af(); null != var2; var2 = (nb)this.bw.ae.au()) {
            if (1383258553 * var2.ac == var1) {
               var2.aj = 0;
            }
         }
      }

   }

   void es(int var1) {
      if ((this.as[var1] & 4) != 0) {
         for(nb var2 = (nb)this.bw.ae.af(); null != var2; var2 = (nb)this.bw.ae.au()) {
            if (1383258553 * var2.ac == var1) {
               var2.aj = 0;
            }
         }
      }

   }

   void ey(int var1) {
      int var2 = var1 & 240;
      int var3;
      int var4;
      int var5;
      if (var2 == 128) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.ay(var3, var4, var5, -806605394);
      } else if (144 == var2) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if (var5 > 0) {
            this.ao(var3, var4, var5, (byte)87);
         } else {
            this.ay(var3, var4, 64, -1556379955);
         }

      } else if (var2 == 160) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         this.aj(var3, var4, var5, 600582607);
      } else if (176 == var2) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         var5 = var1 >> 16 & 127;
         if (var4 == 0) {
            this.au[var3] = (this.au[var3] & -2080769) + (var5 << 14);
         }

         if (var4 == 32) {
            this.au[var3] = (this.au[var3] & -16257) + (var5 << 7);
         }

         if (var4 == 1) {
            this.al[var3] = (this.al[var3] & -16257) + (var5 << 7);
         }

         if (var4 == 33) {
            this.al[var3] = var5 + (this.al[var3] & -128);
         }

         if (5 == var4) {
            this.ad[var3] = (this.ad[var3] & -16257) + (var5 << 7);
         }

         if (var4 == 37) {
            this.ad[var3] = var5 + (this.ad[var3] & -128);
         }

         if (7 == var4) {
            this.am[var3] = (this.am[var3] & -16257) + (var5 << 7);
         }

         if (39 == var4) {
            this.am[var3] = (this.am[var3] & -128) + var5;
         }

         if (var4 == 10) {
            this.ax[var3] = (this.ax[var3] & -16257) + (var5 << 7);
         }

         if (var4 == 42) {
            this.ax[var3] = (this.ax[var3] & -128) + var5;
         }

         if (11 == var4) {
            this.aq[var3] = (this.aq[var3] & -16257) + (var5 << 7);
         }

         if (43 == var4) {
            this.aq[var3] = var5 + (this.aq[var3] & -128);
         }

         int[] var10000;
         if (var4 == 64) {
            if (var5 >= 64) {
               var10000 = this.as;
               var10000[var3] |= 1;
            } else {
               var10000 = this.as;
               var10000[var3] &= -2;
            }
         }

         if (var4 == 65) {
            if (var5 >= 64) {
               var10000 = this.as;
               var10000[var3] |= 2;
            } else {
               this.br(var3, -1404005550);
               var10000 = this.as;
               var10000[var3] &= -3;
            }
         }

         if (var4 == 99) {
            this.ay[var3] = (var5 << 7) + (this.ay[var3] & 127);
         }

         if (var4 == 98) {
            this.ay[var3] = (this.ay[var3] & 16256) + var5;
         }

         if (var4 == 101) {
            this.ay[var3] = (this.ay[var3] & 127) + 16384 + (var5 << 7);
         }

         if (var4 == 100) {
            this.ay[var3] = (this.ay[var3] & 16256) + 16384 + var5;
         }

         if (120 == var4) {
            this.by(var3, (byte)0);
         }

         if (var4 == 121) {
            this.bb(var3, -349577276);
         }

         if (var4 == 123) {
            this.bi(var3, -217580625);
         }

         int var6;
         if (var4 == 6) {
            var6 = this.ay[var3];
            if (16384 == var6) {
               this.aj[var3] = (var5 << 7) + (this.aj[var3] & -16257);
            }
         }

         if (38 == var4) {
            var6 = this.ay[var3];
            if (16384 == var6) {
               this.aj[var3] = var5 + (this.aj[var3] & -128);
            }
         }

         if (16 == var4) {
            this.av[var3] = (this.av[var3] & -16257) + (var5 << 7);
         }

         if (var4 == 48) {
            this.av[var3] = (this.av[var3] & -128) + var5;
         }

         if (81 == var4) {
            if (var5 >= 64) {
               var10000 = this.as;
               var10000[var3] |= 4;
            } else {
               this.bo(var3, 1789857536);
               var10000 = this.as;
               var10000[var3] &= -5;
            }
         }

         if (var4 == 17) {
            this.bq(var3, (var5 << 7) + (this.aw[var3] & -16257), 66395205);
         }

         if (var4 == 49) {
            this.bq(var3, var5 + (this.aw[var3] & -128), 1132511455);
         }

      } else if (192 == var2) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.ai(var3, var4 + this.au[var3], (byte)3);
      } else if (208 == var2) {
         var3 = var1 & 15;
         var4 = var1 >> 8 & 127;
         this.av(var3, var4, -1926856633);
      } else if (224 == var2) {
         var3 = var1 & 15;
         var4 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
         this.aw(var3, var4, (byte)10);
      } else {
         var2 = var1 & 255;
         if (var2 == 255) {
            this.bg(93908145);
         }
      }
   }

   void er(int var1, int var2) {
      this.aw[var1] = var2;
      this.an[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
   }

   void ep(int var1) {
      if (var1 >= 0) {
         this.am[var1] = 12800;
         this.ax[var1] = 8192;
         this.aq[var1] = 16383;
         this.ar[var1] = 8192;
         this.al[var1] = 0;
         this.ad[var1] = 8192;
         this.br(var1, 473296488);
         this.bo(var1, 1445608301);
         this.as[var1] = 0;
         this.ay[var1] = 32767;
         this.aj[var1] = 256;
         this.av[var1] = 0;
         this.bq(var1, 8192, 1859918123);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.bb(var1, 1875747075);
         }

      }
   }

   int ee(nb var1) {
      int var2 = (var1.al * 693097243 * var1.ar * -1635351087 >> 12) + var1.au * 1533372179;
      var2 += this.aj[var1.ac * 1383258553] * (this.ar[var1.ac * 1383258553] - 8192) >> 12;
      mv var3 = var1.am;
      int var4;
      if (624438815 * var3.at > 0 && (-282827937 * var3.af > 0 || this.al[1383258553 * var1.ac] > 0)) {
         var4 = -282827937 * var3.af << 2;
         int var5 = var3.au * 1552103009 << 1;
         if (-1996035633 * var1.aa < var5) {
            var4 = var4 * var1.aa * -1996035633 / var5;
         }

         var4 += this.al[1383258553 * var1.ac] >> 7;
         double var6 = Math.sin(0.01227184630308513D * (double)(-459326909 * var1.ai & 511));
         var2 += (int)(var6 * (double)var4);
      }

      var4 = (int)((double)(256 * var1.ag.ac) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)(bz.ax * -1578400357) + 0.5D);
      return var4 < 1 ? 1 : var4;
   }

   int eq(nb var1) {
      int var2 = (var1.al * 693097243 * var1.ar * -574736896 >> 12) + var1.au * 1533372179;
      var2 += this.aj[var1.ac * 1383258553] * (this.ar[var1.ac * 1383258553] - 1227982003) >> 12;
      mv var3 = var1.am;
      int var4;
      if (-510848227 * var3.at > 0 && (-282827937 * var3.af > 0 || this.al[1383258553 * var1.ac] > 0)) {
         var4 = -2074805053 * var3.af << 2;
         int var5 = var3.au * 1552103009 << 1;
         if (-1722685991 * var1.aa < var5) {
            var4 = var4 * var1.aa * -1388631885 / var5;
         }

         var4 += this.al[-2048207546 * var1.ac] >> 7;
         double var6 = Math.sin(0.01227184630308513D * (double)(-459326909 * var1.ai & -1302477479));
         var2 += (int)(var6 * (double)var4);
      }

      var4 = (int)((double)(-208565991 * var1.ag.ac) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)(bz.ax * -1578400357) + 0.5D);
      return var4 < 1 ? 1 : var4;
   }

   int ej(nb var1) {
      int var2 = (var1.al * 693097243 * var1.ar * -1635351087 >> 12) + var1.au * -448761103;
      var2 += this.aj[var1.ac * 1383258553] * (this.ar[var1.ac * 1383258553] - 1314516595) >> 12;
      mv var3 = var1.am;
      int var4;
      if (624438815 * var3.at > 0 && (-282827937 * var3.af > 0 || this.al[988418164 * var1.ac] > 0)) {
         var4 = 1600664655 * var3.af << 2;
         int var5 = var3.au * -508020742 << 1;
         if (-1996035633 * var1.aa < var5) {
            var4 = var4 * var1.aa * 1864124390 / var5;
         }

         var4 += this.al[1383258553 * var1.ac] >> 7;
         double var6 = Math.sin(0.01227184630308513D * (double)(-459326909 * var1.ai & 2145039861));
         var2 += (int)(var6 * (double)var4);
      }

      var4 = (int)((double)(-636116470 * var1.ag.ac) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)(bz.ax * -1578400357) + 0.5D);
      return var4 < 1 ? 1 : var4;
   }

   int ec(nb var1) {
      int var2 = (var1.al * 693097243 * var1.ar * -1635351087 >> 12) + var1.au * 1533372179;
      var2 += this.aj[var1.ac * 1383258553] * (this.ar[var1.ac * 1383258553] - 8192) >> 12;
      mv var3 = var1.am;
      int var4;
      if (624438815 * var3.at > 0 && (-282827937 * var3.af > 0 || this.al[1383258553 * var1.ac] > 0)) {
         var4 = -282827937 * var3.af << 2;
         int var5 = var3.au * 1552103009 << 1;
         if (-1996035633 * var1.aa < var5) {
            var4 = var4 * var1.aa * -1996035633 / var5;
         }

         var4 += this.al[1383258553 * var1.ac] >> 7;
         double var6 = Math.sin(0.01227184630308513D * (double)(-459326909 * var1.ai & 511));
         var2 += (int)(var6 * (double)var4);
      }

      var4 = (int)((double)(256 * var1.ag.ac) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var2) / (double)(bz.ax * -1578400357) + 0.5D);
      return var4 < 1 ? 1 : var4;
   }

   int et(nb var1) {
      mv var2 = var1.am;
      int var3 = this.am[1383258553 * var1.ac] * this.aq[var1.ac * 1431475655] + -2029862822 >> 13;
      var3 = 348867219 + var3 * var3 >> 15;
      var3 = 16384 + var3 * var1.af * -1077726292 >> 15;
      var3 = var3 * 1648802820 * this.ae + 128 >> 8;
      if (29979475 * var2.ag > 0) {
         var3 = (int)((double)var3 * Math.pow(0.5D, (double)(var1.ad * 663439261) * 1.953125E-5D * (double)(1969612082 * var2.ag)) + 0.5D);
      }

      int var4;
      int var5;
      int var6;
      int var7;
      if (var2.ac != null) {
         var4 = var1.ah * 331338172;
         var5 = var2.ac[1292782419 * var1.ap + 1];
         if (var1.ap * 1357882412 < var2.ac.length - 2) {
            var6 = (var2.ac[1922424143 * var1.ap] & 255) << 8;
            var7 = (var2.ac[-28448321 * var1.ap + 2] & -79581928) << 8;
            var5 += (var4 - var6) * (var2.ac[3 + var1.ap * -424830720] - var5) / (var7 - var6);
         }

         var3 = var5 * var3 + 32 >> 6;
      }

      if (var1.ab * 895628618 > 0 && var2.ae != null) {
         var4 = 1472557012 * var1.ab;
         var5 = var2.ae[-652943166 * var1.az + 1];
         if (var1.az * -184078825 < var2.ae.length - 2) {
            var6 = (var2.ae[var1.az * -184078825] & 255) << 8;
            var7 = (var2.ae[2 + var1.az * 9122063] & 255) << 8;
            var5 += (var2.ae[3 + 867140680 * var1.az] - var5) * (var4 - var6) / (var7 - var6);
         }

         var3 = 32 + var3 * var5 >> 6;
      }

      return var3;
   }

   int fv(nb var1) {
      int var2 = this.ax[var1.ac * 1383258553];
      return var2 < 8192 ? 32 + var2 * var1.at * 656149513 >> 6 : 16384 - (32 + (128 - var1.at * 656149513) * (16384 - var2) >> 6);
   }

   int ff(nb var1) {
      int var2 = this.ax[var1.ac * 1383258553];
      return var2 < 8192 ? 32 + var2 * var1.at * 656149513 >> 6 : 16384 - (32 + (128 - var1.at * 656149513) * (16384 - var2) >> 6);
   }

   void ew(int var1) {
      for(nb var2 = (nb)this.bw.ae.af(); var2 != null; var2 = (nb)this.bw.ae.au()) {
         if (var1 < 0 || 1383258553 * var2.ac == var1) {
            if (var2.ao != null) {
               var2.ao.aj(bz.ax * 1444826971 / 100);
               if (var2.ao.bb()) {
                  this.bw.ag.ac(var2.ao);
               }

               var2.ac(-1113329963);
            }

            if (var2.ab * -1378779092 < 0) {
               this.ak[-1088019758 * var2.ac][528717609 * var2.aq] = null;
            }

            var2.jb();
         }
      }

   }

   protected void bj(int[] var1, int var2, int var3) {
      if (this.bh.ag()) {
         int var4 = this.bh.ae * this.ag * -1318576595 / (bz.ax * -1578400357);

         do {
            long var5 = (long)var3 * (long)var4 + this.bm * -1172391544945565461L;
            if (this.bs * 1055179931651124245L - var5 >= 0L) {
               this.bm = -1909301745175984189L * var5;
               break;
            }

            int var7 = (int)((this.bs * 1055179931651124245L - -1172391544945565461L * this.bm + (long)var4 - 1L) / (long)var4);
            this.bm += -1909301745175984189L * (long)var7 * (long)var4;
            this.bw.au(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.cn(-1660420066);
         } while(this.bh.ag());
      }

      this.bw.au(var1, var2, var3);
   }

   public boolean dp() {
      synchronized(this.ba) {
         return this.ac.ae() > 0;
      }
   }

   boolean fk(nb var1) {
      if (var1.ao == null) {
         if (var1.ab * -1783172009 >= 0) {
            var1.jb();
            if (var1.ax * 107915439 > 0 && var1 == this.bn[var1.ac * 1383258553][var1.ax * 107915439]) {
               this.bn[1383258553 * var1.ac][var1.ax * 107915439] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   void bb(int var1, int var2) {
      try {
         if (var1 < 0) {
            for(var1 = 0; var1 < 16; ++var1) {
               if (var2 <= -1856457959) {
                  throw new IllegalStateException();
               }

               this.bb(var1, -589715968);
            }

         } else {
            this.am[var1] = 12800;
            this.ax[var1] = 8192;
            this.aq[var1] = 16383;
            this.ar[var1] = 8192;
            this.al[var1] = 0;
            this.ad[var1] = 8192;
            this.br(var1, -1265411974);
            this.bo(var1, 892678703);
            this.as[var1] = 0;
            this.ay[var1] = 32767;
            this.aj[var1] = 256;
            this.av[var1] = 0;
            this.bq(var1, 8192, 1155991728);
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ms.bb(" + ')');
      }
   }

   boolean fr(nb var1, int[] var2, int var3, int var4) {
      var1.as = -1578400357 * bz.ax / -1406446550 * -1700292217;
      if (-1308231782 * var1.ab < 0 || null != var1.ao && !var1.ao.by()) {
         int var5 = var1.al * -388155459;
         if (var5 > 0) {
            var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.ad[var1.ac * 1383258553] * 4.921259842519685E-4D) + 0.5D);
            if (var5 < 0) {
               var5 = 0;
            }

            var1.al = 665472787 * var5;
         }

         var1.ao.av(this.bk(var1, -95203169));
         mv var6 = var1.am;
         boolean var7 = false;
         var1.aa += -315759429;
         var1.ai += var6.at * -1473182475;
         double var8 = 5.086263020833333E-6D * (double)((var1.al * 693097243 * -1635351087 * var1.ar >> 12) + (-86488451 * var1.aq - -456701682 << 8));
         if (var6.ag * -336379351 > 0) {
            if (var6.aq * 82581475 > 0) {
               var1.ad += (int)(128.0D * Math.pow(2.0D, (double)(82581475 * var6.aq) * var8) + 0.5D) * -945550256;
            } else {
               var1.ad += 171842568;
            }
         }

         if (var6.ac != null) {
            if (-1023198957 * var6.am > 0) {
               var1.ah += (int)(128.0D * Math.pow(2.0D, var8 * (double)(-1023198957 * var6.am)) + 0.5D) * 363360543;
            } else {
               var1.ah += -1572767039;
            }

            while(var1.ap * 1324390209 < var6.ac.length - 2 && 127781599 * var1.ah > (var6.ac[2 + -8549885 * var1.ap] & 255) << 8) {
               var1.ap += -2035289726;
            }

            if (1324390209 * var1.ap == var6.ac.length - 2 && 0 == var6.ac[1 + 73029136 * var1.ap]) {
               var7 = true;
            }
         }

         if (-1783172009 * var1.ab >= 0 && var6.ae != null && (this.as[var1.ac * 1383258553] & 1) == 0 && (var1.ax * -613800099 < 0 || this.bn[var1.ac * 425729228][var1.ax * 1892666998] != var1)) {
            if (var6.ax * 1201663774 > 0) {
               var1.ab += (int)(128.0D * Math.pow(2.0D, var8 * (double)(623362033 * var6.ax)) + 0.5D) * 765789899;
            } else {
               var1.ab += 594156003;
            }

            while(var1.az * -184078825 < var6.ae.length - 2 && var1.ab * -443890897 > (var6.ae[-184078825 * var1.az + 2] & 255) << 8) {
               var1.az += 1912876608;
            }

            if (var6.ae.length - 2 == var1.az * -184078825) {
               var7 = true;
            }
         }

         if (var7) {
            var1.ao.aj(601813091 * var1.as);
            if (null != var2) {
               var1.ao.au(var2, var3, var4);
            } else {
               var1.ao.al(var4);
            }

            if (var1.ao.bb()) {
               this.bw.ag.ac(var1.ao);
            }

            var1.ac(-1113329963);
            if (var1.ab * -1184178108 >= 0) {
               var1.jb();
               if (107915439 * var1.ax > 0 && var1 == this.bn[-780913941 * var1.ac][-2041509192 * var1.ax]) {
                  this.bn[var1.ac * 1383258553][-419280388 * var1.ax] = null;
               }
            }

            return true;
         } else {
            var1.ao.ay(var1.as * 2144404841, this.be(var1, 1756243419), this.bc(var1, (byte)-79));
            return false;
         }
      } else {
         var1.ac(-1113329963);
         var1.jb();
         if (var1.ax * 107915439 > 0 && this.bn[var1.ac * 1383258553][107915439 * var1.ax] == var1) {
            this.bn[var1.ac * 1383258553][var1.ax * 107915439] = null;
         }

         return true;
      }
   }

   void fe() {
      int var1 = 462450459 * this.bx;
      int var2 = -1112281507 * this.bf;

      long var3;
      for(var3 = this.bs * 1055179931651124245L; -1112281507 * this.bf == var2; var3 = this.bh.ad(var2)) {
         while(this.bh.ax[var1] == var2) {
            this.bh.ax(var1);
            int var5 = this.bh.au(var1);
            if (1 == var5) {
               this.bh.af();
               this.bh.aq(var1);
               if (this.bh.ap()) {
                  if (!this.bd || 0 == var2) {
                     this.bg(1101451840);
                     this.bh.ae();
                     return;
                  }

                  this.bh.ab(var3);
               }
               break;
            }

            if ((var5 & 128) != 0) {
               this.bv(var5, -1856457959);
            }

            this.bh.at(var1);
            this.bh.aq(var1);
         }

         var1 = this.bh.ah();
         var2 = this.bh.ax[var1];
      }

      this.bx = -890875117 * var1;
      this.bf = var2 * -1396156939;
      this.bs = var3 * 6591107080710570813L;
   }

   boolean fu(nb var1, int[] var2, int var3, int var4) {
      var1.as = -1578400357 * bz.ax / 100 * -1003286197;
      if (-1783172009 * var1.ab < 0 || null != var1.ao && !var1.ao.by()) {
         int var5 = var1.al * 693097243;
         if (var5 > 0) {
            var5 -= (int)(16.0D * Math.pow(2.0D, (double)this.ad[var1.ac * 1383258553] * 4.921259842519685E-4D) + 0.5D);
            if (var5 < 0) {
               var5 = 0;
            }

            var1.al = 665472787 * var5;
         }

         var1.ao.av(this.bk(var1, -95203169));
         mv var6 = var1.am;
         boolean var7 = false;
         var1.aa += -1063289553;
         var1.ai += var6.at * 143402229;
         double var8 = 5.086263020833333E-6D * (double)((var1.al * 693097243 * -1635351087 * var1.ar >> 12) + (528717609 * var1.aq - 60 << 8));
         if (var6.ag * -336379351 > 0) {
            if (var6.aq * 82581475 > 0) {
               var1.ad += (int)(128.0D * Math.pow(2.0D, (double)(82581475 * var6.aq) * var8) + 0.5D) * 945059509;
            } else {
               var1.ad += 708532864;
            }
         }

         if (var6.ac != null) {
            if (-1023198957 * var6.am > 0) {
               var1.ah += (int)(128.0D * Math.pow(2.0D, var8 * (double)(-1023198957 * var6.am)) + 0.5D) * 363360543;
            } else {
               var1.ah += -734490752;
            }

            while(var1.ap * 1324390209 < var6.ac.length - 2 && 127781599 * var1.ah > (var6.ac[2 + 1324390209 * var1.ap] & 255) << 8) {
               var1.ap += -2035289726;
            }

            if (1324390209 * var1.ap == var6.ac.length - 2 && 0 == var6.ac[1 + 1324390209 * var1.ap]) {
               var7 = true;
            }
         }

         if (-1783172009 * var1.ab >= 0 && var6.ae != null && (this.as[var1.ac * 1383258553] & 1) == 0 && (var1.ax * 107915439 < 0 || this.bn[var1.ac * 1383258553][var1.ax * 107915439] != var1)) {
            if (var6.ax * -1240192717 > 0) {
               var1.ab += (int)(128.0D * Math.pow(2.0D, var8 * (double)(-1240192717 * var6.ax)) + 0.5D) * 992163687;
            } else {
               var1.ab += -1852066944;
            }

            while(var1.az * -184078825 < var6.ae.length - 2 && var1.ab * -1783172009 > (var6.ae[-184078825 * var1.az + 2] & 255) << 8) {
               var1.az += 145085262;
            }

            if (var6.ae.length - 2 == var1.az * -184078825) {
               var7 = true;
            }
         }

         if (var7) {
            var1.ao.aj(601813091 * var1.as);
            if (null != var2) {
               var1.ao.au(var2, var3, var4);
            } else {
               var1.ao.al(var4);
            }

            if (var1.ao.bb()) {
               this.bw.ag.ac(var1.ao);
            }

            var1.ac(-1113329963);
            if (var1.ab * -1783172009 >= 0) {
               var1.jb();
               if (107915439 * var1.ax > 0 && var1 == this.bn[1383258553 * var1.ac][107915439 * var1.ax]) {
                  this.bn[var1.ac * 1383258553][107915439 * var1.ax] = null;
               }
            }

            return true;
         } else {
            var1.ao.ay(var1.as * 601813091, this.be(var1, 575155253), this.bc(var1, (byte)-87));
            return false;
         }
      } else {
         var1.ac(-1113329963);
         var1.jb();
         if (var1.ax * 107915439 > 0 && this.bn[var1.ac * 1383258553][107915439 * var1.ax] == var1) {
            this.bn[var1.ac * 1383258553][var1.ax * 107915439] = null;
         }

         return true;
      }
   }

   void dr(int var1, int var2, int var3) {
   }
}
