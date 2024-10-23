public class io extends im {
   int aq;
   int ae;
   long am;
   int ag;
   int ax;
   public static final int aa = 22;
   static final int al = 0;
   long[] ac;

   public io() {
      try {
         super();
         this.ac = new long[10];
         this.ae = -237306112;
         this.ag = -1446680071;
         this.ax = 0;
         this.am = hf.ac(-1598214665) * -2756096634417965707L;

         for(int var1 = 0; var1 < 10; ++var1) {
            this.ac[var1] = this.am * 2021572333076501213L;
         }

      } catch (RuntimeException var2) {
         throw vk.ae(var2, "io.<init>(" + ')');
      }
   }

   public int ae(int var1, int var2, int var3) {
      try {
         int var4 = 1085613311 * this.ae;
         int var5 = this.ag * -942864311;
         this.ae = -747855148;
         this.ag = -1446680071;
         this.am = hf.ac(-1598214665) * -2756096634417965707L;
         if (0L == this.ac[this.aq * -1838318811]) {
            if (var3 <= -1792390542) {
               throw new IllegalStateException();
            }

            this.ae = var4 * -1963861249;
            this.ag = var5 * -1446680071;
         } else if (this.am * 2021572333076501213L > this.ac[this.aq * -1838318811]) {
            if (var3 <= -1792390542) {
               throw new IllegalStateException();
            }

            this.ae = -1963861249 * (int)((long)(var1 * 2560) / (2021572333076501213L * this.am - this.ac[this.aq * -1838318811]));
         }

         if (1085613311 * this.ae < 25) {
            if (var3 <= -1792390542) {
               throw new IllegalStateException();
            }

            this.ae = -1851890969;
         }

         if (this.ae * 1085613311 > 256) {
            if (var3 <= -1792390542) {
               throw new IllegalStateException();
            }

            this.ae = -237306112;
            this.ag = -1446680071 * (int)((long)var1 - (this.am * 2021572333076501213L - this.ac[this.aq * -1838318811]) / 10L);
         }

         if (this.ag * -942864311 > var1) {
            this.ag = -1446680071 * var1;
         }

         this.ac[this.aq * -1838318811] = 2021572333076501213L * this.am;
         this.aq = (this.aq * -1838318811 + 1) % 10 * -1513215827;
         int var6;
         if (-942864311 * this.ag > 1) {
            if (var3 <= -1792390542) {
               throw new IllegalStateException();
            }

            for(var6 = 0; var6 < 10; ++var6) {
               if (var3 <= -1792390542) {
                  throw new IllegalStateException();
               }

               if (0L != this.ac[var6]) {
                  this.ac[var6] += (long)(-942864311 * this.ag);
               }
            }
         }

         if (this.ag * -942864311 < var2) {
            if (var3 <= -1792390542) {
               throw new IllegalStateException();
            }

            this.ag = var2 * -1446680071;
         }

         iv.ac((long)(-942864311 * this.ag));

         for(var6 = 0; this.ax * -76961179 < 256; this.ax += this.ae * 1607715219) {
            if (var3 <= -1792390542) {
               throw new IllegalStateException();
            }

            ++var6;
         }

         this.ax = -822085779 * (-76961179 * this.ax & 255);
         return var6;
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "io.ae(" + ')');
      }
   }

   public void ac(byte var1) {
      try {
         for(int var2 = 0; var2 < 10; ++var2) {
            this.ac[var2] = 0L;
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "io.ac(" + ')');
      }
   }

   public void ag() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.ac[var1] = 0L;
      }

   }

   public void am() {
      for(int var1 = 0; var1 < 10; ++var1) {
         this.ac[var1] = 0L;
      }

   }

   public int ax(int var1, int var2) {
      int var3 = 1085613311 * this.ae;
      int var4 = this.ag * -942864311;
      this.ae = -747855148;
      this.ag = -1446680071;
      this.am = hf.ac(-1598214665) * -2756096634417965707L;
      if (0L == this.ac[this.aq * -1838318811]) {
         this.ae = var3 * -1963861249;
         this.ag = var4 * -1446680071;
      } else if (this.am * 2021572333076501213L > this.ac[this.aq * -1838318811]) {
         this.ae = -1963861249 * (int)((long)(var1 * 2560) / (2021572333076501213L * this.am - this.ac[this.aq * -1838318811]));
      }

      if (1085613311 * this.ae < 25) {
         this.ae = -1851890969;
      }

      if (this.ae * 1085613311 > 256) {
         this.ae = -237306112;
         this.ag = -1446680071 * (int)((long)var1 - (this.am * 2021572333076501213L - this.ac[this.aq * -1838318811]) / 10L);
      }

      if (this.ag * -942864311 > var1) {
         this.ag = -1446680071 * var1;
      }

      this.ac[this.aq * -1838318811] = 2021572333076501213L * this.am;
      this.aq = (this.aq * -1838318811 + 1) % 10 * -1513215827;
      int var5;
      if (-942864311 * this.ag > 1) {
         for(var5 = 0; var5 < 10; ++var5) {
            if (0L != this.ac[var5]) {
               this.ac[var5] += (long)(-942864311 * this.ag);
            }
         }
      }

      if (this.ag * -942864311 < var2) {
         this.ag = var2 * -1446680071;
      }

      iv.ac((long)(-942864311 * this.ag));

      for(var5 = 0; this.ax * -76961179 < 256; this.ax += this.ae * 1607715219) {
         ++var5;
      }

      this.ax = -822085779 * (-76961179 * this.ax & 255);
      return var5;
   }

   public int aq(int var1, int var2) {
      int var3 = 1085613311 * this.ae;
      int var4 = this.ag * -942864311;
      this.ae = -747855148;
      this.ag = -1446680071;
      this.am = hf.ac(-1598214665) * -2756096634417965707L;
      if (0L == this.ac[this.aq * -1838318811]) {
         this.ae = var3 * -1963861249;
         this.ag = var4 * -1446680071;
      } else if (this.am * 2021572333076501213L > this.ac[this.aq * -1838318811]) {
         this.ae = -1963861249 * (int)((long)(var1 * 2560) / (2021572333076501213L * this.am - this.ac[this.aq * -1838318811]));
      }

      if (1085613311 * this.ae < 25) {
         this.ae = -1851890969;
      }

      if (this.ae * 1085613311 > 256) {
         this.ae = -237306112;
         this.ag = -1446680071 * (int)((long)var1 - (this.am * 2021572333076501213L - this.ac[this.aq * -1838318811]) / 10L);
      }

      if (this.ag * -942864311 > var1) {
         this.ag = -1446680071 * var1;
      }

      this.ac[this.aq * -1838318811] = 2021572333076501213L * this.am;
      this.aq = (this.aq * -1838318811 + 1) % 10 * -1513215827;
      int var5;
      if (-942864311 * this.ag > 1) {
         for(var5 = 0; var5 < 10; ++var5) {
            if (0L != this.ac[var5]) {
               this.ac[var5] += (long)(-942864311 * this.ag);
            }
         }
      }

      if (this.ag * -942864311 < var2) {
         this.ag = var2 * -1446680071;
      }

      iv.ac((long)(-942864311 * this.ag));

      for(var5 = 0; this.ax * -76961179 < 256; this.ax += this.ae * 1607715219) {
         ++var5;
      }

      this.ax = -822085779 * (-76961179 * this.ax & 255);
      return var5;
   }

   public int af(int var1, int var2) {
      int var3 = 1085613311 * this.ae;
      int var4 = this.ag * -942864311;
      this.ae = -747855148;
      this.ag = -1446680071;
      this.am = hf.ac(-1598214665) * -2756096634417965707L;
      if (0L == this.ac[this.aq * -1838318811]) {
         this.ae = var3 * -1963861249;
         this.ag = var4 * -1446680071;
      } else if (this.am * 2021572333076501213L > this.ac[this.aq * -1838318811]) {
         this.ae = -1963861249 * (int)((long)(var1 * 2560) / (2021572333076501213L * this.am - this.ac[this.aq * -1838318811]));
      }

      if (1085613311 * this.ae < 25) {
         this.ae = -1851890969;
      }

      if (this.ae * 1085613311 > 256) {
         this.ae = -237306112;
         this.ag = -1446680071 * (int)((long)var1 - (this.am * 2021572333076501213L - this.ac[this.aq * -1838318811]) / 10L);
      }

      if (this.ag * -942864311 > var1) {
         this.ag = -1446680071 * var1;
      }

      this.ac[this.aq * -1838318811] = 2021572333076501213L * this.am;
      this.aq = (this.aq * -1838318811 + 1) % 10 * -1513215827;
      int var5;
      if (-942864311 * this.ag > 1) {
         for(var5 = 0; var5 < 10; ++var5) {
            if (0L != this.ac[var5]) {
               this.ac[var5] += (long)(-942864311 * this.ag);
            }
         }
      }

      if (this.ag * -942864311 < var2) {
         this.ag = var2 * -1446680071;
      }

      iv.ac((long)(-942864311 * this.ag));

      for(var5 = 0; this.ax * -76961179 < 256; this.ax += this.ae * 1607715219) {
         ++var5;
      }

      this.ax = -822085779 * (-76961179 * this.ax & 255);
      return var5;
   }

   static final void ib(ny var0, int var1, int var2, byte var3) {
      try {
         if (0 != client.ti * 1860751979) {
            if (var3 == -1) {
               return;
            }

            if (3 != 1860751979 * client.ti) {
               return;
            }
         }

         if (!client.nr) {
            if (var3 == -1) {
               throw new IllegalStateException();
            }

            if (2144731811 * bj.ai != 1) {
               if (var3 == -1) {
                  throw new IllegalStateException();
               }

               if (ei.ev) {
                  return;
               }

               if (var3 == -1) {
                  return;
               }

               if (bj.ai * 2144731811 != 4) {
                  return;
               }

               if (var3 == -1) {
                  throw new IllegalStateException();
               }
            }

            nl var4 = var0.ah(ir.ep, true, -625336255);
            if (null == var4) {
               if (var3 == -1) {
                  return;
               }

               return;
            }

            int var5 = bj.ao * 1898873515 - var1;
            int var6 = -1909429297 * bj.as - var2;
            if (var4.ac(var5, var6, -137163805)) {
               if (var3 == -1) {
                  throw new IllegalStateException();
               }

               var5 -= 1964693849 * var4.ac / 2;
               var6 -= -1729230849 * var4.ae / 2;
               int var7 = 1933903023 * client.ky & 2047;
               int var8 = jw.am[var7];
               int var9 = jw.ax[var7];
               int var10 = var6 * var8 + var5 * var9 >> 11;
               int var11 = var6 * var9 - var8 * var5 >> 11;
               int var12 = go.my.ac(2084253353) + var10 >> 7;
               int var13 = go.my.ae((short)30059) - var11 >> 7;
               mq var14 = fs.ac(mz.dz, client.ia.ax, (byte)-59);
               var14.ag.bu(18, (byte)-39);
               var14.ag.br(var13 + 1001606641 * du.js.at, 1625888552);
               va var10000 = var14.ag;
               byte var10001;
               if (client.ss.aa(82, 1770128204)) {
                  if (client.ss.aa(81, 1770128204)) {
                     if (var3 == -1) {
                        throw new IllegalStateException();
                     }

                     var10001 = 2;
                  } else {
                     var10001 = 1;
                  }
               } else {
                  var10001 = 0;
               }

               var10000.dq(var10001, -1046258995);
               var14.ag.du(var12 + du.js.af * 2072219689, -2010295355);
               var14.ag.bu(var5, (byte)1);
               var14.ag.bu(var6, (byte)49);
               var14.ag.br(client.ky * 1933903023, 1625888552);
               var14.ag.bu(57, (byte)-72);
               var14.ag.bu(0, (byte)-56);
               var14.ag.bu(0, (byte)-19);
               var14.ag.bu(89, (byte)27);
               var14.ag.br(-1125889549 * qm.mm.bf, 1625888552);
               var14.ag.br(-1650600853 * qm.mm.bm, 1625888552);
               var14.ag.bu(63, (byte)-57);
               client.ia.ag(var14, -40259270);
               client.sz = -1646001847 * var12;
               client.si = -95203169 * var13;
            }
         }

      } catch (RuntimeException var15) {
         throw vk.ae(var15, "io.ib(" + ')');
      }
   }
}
