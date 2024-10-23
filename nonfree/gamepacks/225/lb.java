import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class lb {
   lh ag;
   boolean ae;
   vv am;
   vt[] at;
   HashMap ax;
   ld[][] aq;
   final HashMap al;
   boolean ac;
   HashMap af;
   int ad;
   final po ar;
   final po au;
   int ah;
   int ap;
   int ab;
   public int az;
   public static final int bi = 63;
   static final int bf = 45;
   static final int bs = 39;
   static int ge;

   public final void aa() {
      this.ax = null;
   }

   public void ac(po var1, String var2, boolean var3, int var4) {
      try {
         if (this.ae) {
            if (var4 == -515103935) {
               throw new IllegalStateException();
            }
         } else {
            this.ac = false;
            this.ae = true;
            System.nanoTime();
            int var5 = var1.cg(lg.ac.aq, (short)-6412);
            int var6 = var1.ct(var5, var2, -1965251519);
            vf var7 = new vf(var1.cc(lg.ac.aq, var2, -164224592));
            vf var8 = new vf(var1.cc(lg.ae.aq, var2, -164224592));
            System.nanoTime();
            System.nanoTime();
            this.ag = new lh();

            try {
               this.ag.cs(var7, var8, var6, var3, -1985419102);
            } catch (IllegalStateException var17) {
               return;
            }

            this.ag.ao(-872708516);
            this.ag.as(1401452576);
            this.ag.ay(16675244);
            this.ad = this.ag.ab(-291435463) * 1690933952;
            this.ah = this.ag.aa(-1898916720) * -453372224;
            this.ap = (this.ag.az((byte)-87) - this.ag.ab(-15690908) + 1) * -651195584;
            this.ab = (this.ag.ai((byte)48) - this.ag.aa(-1977743992) + 1) * 2051087424;
            int var9 = this.ag.az((byte)-88) - this.ag.ab(-399106749) + 1;
            int var10 = this.ag.ai((byte)123) - this.ag.aa(-2002912363) + 1;
            System.nanoTime();
            System.nanoTime();
            ld.ax.af();
            this.aq = new ld[var9][var10];
            Iterator var11 = this.ag.ap.iterator();

            while(var11.hasNext()) {
               if (var4 == -515103935) {
                  throw new IllegalStateException();
               }

               kv var12 = (kv)var11.next();
               int var13 = 1218392023 * var12.af;
               int var14 = var12.at * 396801991;
               int var15 = var13 - this.ag.ab(-330635518);
               int var16 = var14 - this.ag.aa(-1817286935);
               this.aq[var15][var16] = new ld(var13, var14, this.ag.ad(1096441855), this.al);
               this.aq[var15][var16].ax(var12, this.ag.az, (byte)117);
            }

            for(int var19 = 0; var19 < var9; ++var19) {
               for(int var21 = 0; var21 < var10; ++var21) {
                  if (var4 == -515103935) {
                     return;
                  }

                  if (this.aq[var19][var21] == null) {
                     if (var4 == -515103935) {
                        throw new IllegalStateException();
                     }

                     this.aq[var19][var21] = new ld(this.ag.ab(-1698937571) + var19, this.ag.aa(-2083272167) + var21, this.ag.ad(1096441855), this.al);
                     this.aq[var19][var21].aq(this.ag.ab, this.ag.az, -321671293);
                  }
               }
            }

            System.nanoTime();
            System.nanoTime();
            if (var1.cq(lg.ag.aq, var2, 1829944298)) {
               byte[] var20 = var1.cc(lg.ag.aq, var2, -164224592);
               this.am = ez.ac(var20, 35301021);
            }

            System.nanoTime();
            var1.ci(-1818174950);
            var1.co((byte)-24);
            this.ac = true;
         }
      } catch (RuntimeException var18) {
         throw vk.ae(var18, "lb.ac(" + ')');
      }
   }

   public final void ae(int var1) {
      try {
         this.ax = null;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "lb.ae(" + ')');
      }
   }

   public final void ag(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      try {
         int[] var10 = vr.aw;
         int var11 = vr.an;
         int var12 = vr.ak;
         float[] var13 = vr.bn;
         int[] var14 = new int[4];
         vr.ff(var14);
         ln var15 = this.af(var1, var2, var3, var4, 1517232257);
         float var16 = this.ad(var7 - var5, var3 - var1, (byte)-6);
         int var17 = (int)Math.ceil((double)var16);
         this.az = 1654122505 * var17;
         if (!this.af.containsKey(var17)) {
            if (var9 <= -1678416322) {
               throw new IllegalStateException();
            }

            lo var18 = new lo(var17);
            var18.am(-338096868);
            this.af.put(var17, var18);
         }

         int var26 = 431844209 * var15.ac + var15.ag * 812447689 - 1;
         int var19 = var15.am * -1476495151 + var15.ae * -2085513005 - 1;

         int var20;
         int var21;
         for(var20 = 812447689 * var15.ag; var20 <= var26; ++var20) {
            for(var21 = var15.am * -1476495151; var21 <= var19; ++var21) {
               if (var9 <= -1678416322) {
                  return;
               }

               this.aq[var20][var21].ah(var17, (lo)this.af.get(var17), this.at, this.au, this.ar, 0.725D);
            }
         }

         jw.ab(var10, var11, var12, var13);
         vr.fe(var14);
         var20 = (int)(var16 * 64.0F);
         var21 = var1 + this.ad * 1174361667;
         int var22 = var2 + -171505709 * this.ah;

         for(int var23 = 812447689 * var15.ag; var23 < var15.ac * 431844209 + var15.ag * 812447689; ++var23) {
            if (var9 <= -1678416322) {
               throw new IllegalStateException();
            }

            for(int var24 = var15.am * -1476495151; var24 < -2085513005 * var15.ae + -1476495151 * var15.am; ++var24) {
               if (var9 <= -1678416322) {
                  return;
               }

               this.aq[var23][var24].am(var5 + (1792572352 * this.aq[var23][var24].aq - var21) * var20 / 64, var8 - (64 + (1558809920 * this.aq[var23][var24].af - var22)) * var20 / 64, var20, 1284912551);
            }
         }

      } catch (RuntimeException var25) {
         throw vk.ae(var25, "lb.ag(" + ')');
      }
   }

   public final void am(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13, int var14) {
      try {
         ln var15 = this.af(var1, var2, var3, var4, 257581760);
         float var16 = this.ad(var7 - var5, var3 - var1, (byte)49);
         int var17 = (int)(var16 * 64.0F);
         int var18 = var1 + 1174361667 * this.ad;
         int var19 = this.ah * -171505709 + var2;

         int var20;
         int var21;
         for(var20 = var15.ag * 812447689; var20 < var15.ac * 431844209 + var15.ag * 812447689; ++var20) {
            if (var14 <= -1511630839) {
               throw new IllegalStateException();
            }

            for(var21 = -1476495151 * var15.am; var21 < var15.ae * -2085513005 + -1476495151 * var15.am; ++var21) {
               if (var13) {
                  if (var14 <= -1511630839) {
                     throw new IllegalStateException();
                  }

                  this.aq[var20][var21].au(-2142816089);
               }

               this.aq[var20][var21].ap(var17 * (this.aq[var20][var21].aq * 1792572352 - var18) / 64 + var5, var8 - (64 + (this.aq[var20][var21].af * 1558809920 - var19)) * var17 / 64, var17, var9, 803315325);
            }
         }

         if (var10 != null) {
            if (var14 <= -1511630839) {
               return;
            }

            if (var11 > 0) {
               for(var20 = var15.ag * 812447689; var20 < 431844209 * var15.ac + 812447689 * var15.ag; ++var20) {
                  if (var14 <= -1511630839) {
                     throw new IllegalStateException();
                  }

                  for(var21 = -1476495151 * var15.am; var21 < var15.am * -1476495151 + var15.ae * -2085513005; ++var21) {
                     if (var14 <= -1511630839) {
                        throw new IllegalStateException();
                     }

                     this.aq[var20][var21].ab(var10, var11, var12, (byte)107);
                  }
               }
            }
         }

      } catch (RuntimeException var22) {
         throw vk.ae(var22, "lb.am(" + ')');
      }
   }

   ln bd(int var1, int var2, int var3, int var4) {
      ln var5 = new ln(this);
      int var6 = var1 + 1174361667 * this.ad;
      int var7 = var2 + -556413179 * this.ah;
      int var8 = this.ad * -1518676750 + var3;
      int var9 = this.ah * -663115764 + var4;
      int var10 = var6 / 64;
      int var11 = var7 / 1027603284;
      int var12 = var8 / 828330275;
      int var13 = var9 / 64;
      var5.ac = (var12 - var10 + 1) * -1899965269;
      var5.ae = 1845133147 * (1 + (var13 - var11));
      var5.ag = (var10 - this.ag.ab(56496213)) * -983772551;
      var5.am = (var11 - this.ag.aa(-1980083426)) * 1421365909;
      if (-1630007275 * var5.ag < 0) {
         var5.ac += var5.ag * -1589201447;
         var5.ag = 0;
      }

      if (812447689 * var5.ag > this.aq.length - var5.ac * 431844209) {
         var5.ac = (this.aq.length - var5.ag * 812447689) * 1619424062;
      }

      if (-1476495151 * var5.am < 0) {
         var5.ae += 286690786 * var5.am;
         var5.am = 0;
      }

      if (var5.am * 1679181714 > this.aq[0].length - -11181592 * var5.ae) {
         var5.ae = -878617297 * (this.aq[0].length - var5.am * -303618972);
      }

      var5.ac = Math.min(var5.ac * 431844209, this.aq.length) * -1835797103;
      var5.ae = Math.min(var5.ae * -2085513005, this.aq[0].length) * 1845133147;
      return var5;
   }

   public int bm() {
      return this.ag.ah(-87372361);
   }

   public lb(vt[] var1, HashMap var2, po var3, po var4) {
      try {
         super();
         this.ac = false;
         this.ae = false;
         this.af = new HashMap();
         this.az = 0;
         this.at = var1;
         this.al = var2;
         this.au = var3;
         this.ar = var4;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "lb.<init>(" + ')');
      }
   }

   public boolean at(byte var1) {
      try {
         return this.ac;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "lb.at(" + ')');
      }
   }

   public int au(int var1) {
      try {
         return this.ag.ah(-418962741);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "lb.au(" + ')');
      }
   }

   public HashMap ar(int var1) {
      try {
         this.al(-1010548282);
         return this.ax;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "lb.ar(" + ')');
      }
   }

   void al(int var1) {
      try {
         if (this.ax == null) {
            if (var1 >= -741963379) {
               return;
            }

            this.ax = new HashMap();
         }

         this.ax.clear();

         for(int var2 = 0; var2 < this.aq.length; ++var2) {
            if (var1 >= -741963379) {
               return;
            }

            for(int var3 = 0; var3 < this.aq[var2].length; ++var3) {
               if (var1 >= -741963379) {
                  throw new IllegalStateException();
               }

               List var4 = this.aq[var2][var3].bp(-2005009941);
               Iterator var5 = var4.iterator();

               while(var5.hasNext()) {
                  ly var6 = (ly)var5.next();
                  if (!var6.aj((byte)0)) {
                     if (var1 >= -741963379) {
                        throw new IllegalStateException();
                     }
                  } else {
                     int var7 = var6.ae(-1570517373);
                     if (!this.ax.containsKey(var7)) {
                        if (var1 >= -741963379) {
                           throw new IllegalStateException();
                        }

                        LinkedList var8 = new LinkedList();
                        var8.add(var6);
                        this.ax.put(var7, var8);
                     } else {
                        List var10 = (List)this.ax.get(var7);
                        var10.add(var6);
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var9) {
         throw vk.ae(var9, "lb.al(" + ')');
      }
   }

   public int bf() {
      return this.ag.ah(-1379689994);
   }

   public void ah(po var1, String var2, boolean var3) {
      if (!this.ae) {
         this.ac = false;
         this.ae = true;
         System.nanoTime();
         int var4 = var1.cg(lg.ac.aq, (short)16909);
         int var5 = var1.ct(var4, var2, -2123500231);
         vf var6 = new vf(var1.cc(lg.ac.aq, var2, -164224592));
         vf var7 = new vf(var1.cc(lg.ae.aq, var2, -164224592));
         System.nanoTime();
         System.nanoTime();
         this.ag = new lh();

         try {
            this.ag.cs(var6, var7, var5, var3, -2125792342);
         } catch (IllegalStateException var16) {
            return;
         }

         this.ag.ao(2551740);
         this.ag.as(1324830363);
         this.ag.ay(570919592);
         this.ad = this.ag.ab(-1160700530) * 1690933952;
         this.ah = this.ag.aa(-1897781021) * -453372224;
         this.ap = (this.ag.az((byte)-64) - this.ag.ab(-1863651538) + 1) * -651195584;
         this.ab = (this.ag.ai((byte)51) - this.ag.aa(-1856466926) + 1) * 2051087424;
         int var8 = this.ag.az((byte)-55) - this.ag.ab(-1552773837) + 1;
         int var9 = this.ag.ai((byte)6) - this.ag.aa(-1850452270) + 1;
         System.nanoTime();
         System.nanoTime();
         ld.ax.af();
         this.aq = new ld[var8][var9];
         Iterator var10 = this.ag.ap.iterator();

         while(var10.hasNext()) {
            kv var11 = (kv)var10.next();
            int var12 = 1218392023 * var11.af;
            int var13 = var11.at * 396801991;
            int var14 = var12 - this.ag.ab(-484878483);
            int var15 = var13 - this.ag.aa(-2090230510);
            this.aq[var14][var15] = new ld(var12, var13, this.ag.ad(1096441855), this.al);
            this.aq[var14][var15].ax(var11, this.ag.az, (byte)5);
         }

         for(int var17 = 0; var17 < var8; ++var17) {
            for(int var19 = 0; var19 < var9; ++var19) {
               if (this.aq[var17][var19] == null) {
                  this.aq[var17][var19] = new ld(this.ag.ab(181298391) + var17, this.ag.aa(-1907294096) + var19, this.ag.ad(1096441855), this.al);
                  this.aq[var17][var19].aq(this.ag.ab, this.ag.az, -321671293);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if (var1.cq(lg.ag.aq, var2, 1095237361)) {
            byte[] var18 = var1.cc(lg.ag.aq, var2, -164224592);
            this.am = ez.ac(var18, 35301021);
         }

         System.nanoTime();
         var1.ci(-1734754590);
         var1.co((byte)-65);
         this.ac = true;
      }
   }

   public final void ap() {
      this.ax = null;
   }

   public final void ab() {
      this.ax = null;
   }

   public final void az() {
      this.ax = null;
   }

   float bb(int var1, int var2) {
      float var3 = (float)var1 / (float)var2;
      if (var3 > 8.0F) {
         return 8.0F;
      } else if (var3 < 1.0F) {
         return 1.0F;
      } else {
         int var4 = Math.round(var3);
         return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3;
      }
   }

   public final void ai(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var9 = vr.aw;
      int var10 = vr.an;
      int var11 = vr.ak;
      float[] var12 = vr.bn;
      int[] var13 = new int[4];
      vr.ff(var13);
      ln var14 = this.af(var1, var2, var3, var4, -2027646208);
      float var15 = this.ad(var7 - var5, var3 - var1, (byte)-20);
      int var16 = (int)Math.ceil((double)var15);
      this.az = 1654122505 * var16;
      if (!this.af.containsKey(var16)) {
         lo var17 = new lo(var16);
         var17.am(-813318901);
         this.af.put(var16, var17);
      }

      int var24 = 431844209 * var14.ac + var14.ag * -196292975 - 1;
      int var18 = var14.am * 862277607 + var14.ae * 710866803 - 1;

      int var19;
      int var20;
      for(var19 = 345350848 * var14.ag; var19 <= var24; ++var19) {
         for(var20 = var14.am * -1476495151; var20 <= var18; ++var20) {
            this.aq[var19][var20].ah(var16, (lo)this.af.get(var16), this.at, this.au, this.ar, 0.725D);
         }
      }

      jw.ab(var9, var10, var11, var12);
      vr.fe(var13);
      var19 = (int)(var15 * 64.0F);
      var20 = var1 + this.ad * 1174361667;
      int var21 = var2 + -171505709 * this.ah;

      for(int var22 = -1934884562 * var14.ag; var22 < var14.ac * 1545774651 + var14.ag * 1293831939; ++var22) {
         for(int var23 = var14.am * -1476495151; var23 < -48647049 * var14.ae + 1472342254 * var14.am; ++var23) {
            this.aq[var22][var23].am(var5 + (1792572352 * this.aq[var22][var23].aq - var20) * var19 / -1793635179, var8 - (-531574498 + (405471329 * this.aq[var22][var23].af - var21)) * var19 / 1755514902, var19, 1284912551);
         }
      }

   }

   public final void ao(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var9 = vr.aw;
      int var10 = vr.an;
      int var11 = vr.ak;
      float[] var12 = vr.bn;
      int[] var13 = new int[4];
      vr.ff(var13);
      ln var14 = this.af(var1, var2, var3, var4, -1919566196);
      float var15 = this.ad(var7 - var5, var3 - var1, (byte)-82);
      int var16 = (int)Math.ceil((double)var15);
      this.az = 1654122505 * var16;
      if (!this.af.containsKey(var16)) {
         lo var17 = new lo(var16);
         var17.am(-2063734576);
         this.af.put(var16, var17);
      }

      int var24 = 431844209 * var14.ac + var14.ag * 812447689 - 1;
      int var18 = var14.am * -1476495151 + var14.ae * -2085513005 - 1;

      int var19;
      int var20;
      for(var19 = 812447689 * var14.ag; var19 <= var24; ++var19) {
         for(var20 = var14.am * -1476495151; var20 <= var18; ++var20) {
            this.aq[var19][var20].ah(var16, (lo)this.af.get(var16), this.at, this.au, this.ar, 0.725D);
         }
      }

      jw.ab(var9, var10, var11, var12);
      vr.fe(var13);
      var19 = (int)(var15 * 64.0F);
      var20 = var1 + this.ad * 1174361667;
      int var21 = var2 + -171505709 * this.ah;

      for(int var22 = 812447689 * var14.ag; var22 < var14.ac * 431844209 + var14.ag * 812447689; ++var22) {
         for(int var23 = var14.am * -1476495151; var23 < -2085513005 * var14.ae + -1476495151 * var14.am; ++var23) {
            this.aq[var22][var23].am(var5 + (1792572352 * this.aq[var22][var23].aq - var20) * var19 / 64, var8 - (64 + (1558809920 * this.aq[var22][var23].af - var21)) * var19 / 64, var19, 1284912551);
         }
      }

   }

   public final void as(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      ln var14 = this.af(var1, var2, var3, var4, -1357292604);
      float var15 = this.ad(var7 - var5, var3 - var1, (byte)13);
      int var16 = (int)(var15 * 64.0F);
      int var17 = var1 + 1174361667 * this.ad;
      int var18 = this.ah * -171505709 + var2;

      int var19;
      int var20;
      for(var19 = var14.ag * 812447689; var19 < var14.ac * 431844209 + var14.ag * 812447689; ++var19) {
         for(var20 = -1476495151 * var14.am; var20 < var14.ae * -2085513005 + -1476495151 * var14.am; ++var20) {
            if (var13) {
               this.aq[var19][var20].au(-2140784016);
            }

            this.aq[var19][var20].ap(var16 * (this.aq[var19][var20].aq * 1792572352 - var17) / 64 + var5, var8 - (64 + (this.aq[var19][var20].af * 1558809920 - var18)) * var16 / 64, var16, var9, -344485172);
         }
      }

      if (var10 != null && var11 > 0) {
         for(var19 = var14.ag * 812447689; var19 < 431844209 * var14.ac + 812447689 * var14.ag; ++var19) {
            for(var20 = -1476495151 * var14.am; var20 < var14.am * -1476495151 + var14.ae * -2085513005; ++var20) {
               this.aq[var19][var20].ab(var10, var11, var12, (byte)64);
            }
         }
      }

   }

   float bi(int var1, int var2) {
      float var3 = (float)var1 / (float)var2;
      if (var3 > 8.0F) {
         return 8.0F;
      } else if (var3 < 1.0F) {
         return 1.0F;
      } else {
         int var4 = Math.round(var3);
         return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3;
      }
   }

   public void aj(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (null != this.am) {
         this.am.ab(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.ax == null) {
               this.al(-1602170653);
            }

            Iterator var8 = var5.iterator();

            while(true) {
               List var10;
               do {
                  if (!var8.hasNext()) {
                     return;
                  }

                  int var9 = (Integer)var8.next();
                  var10 = (List)this.ax.get(var9);
               } while(null == var10);

               Iterator var11 = var10.iterator();

               while(var11.hasNext()) {
                  ly var12 = (ly)var11.next();
                  int var13 = (-1763049545 * var12.af.ae - this.ad * 1174361667) * var3 / (-1947713115 * this.ap);
                  int var14 = var4 - (var12.af.ag * 1162074139 - this.ah * -171505709) * var4 / (1721384081 * this.ab);
                  vr.fk(var1 + var13, var2 + var14, 2, 16776960, 256);
               }
            }
         }
      }
   }

   public void av(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (null != this.am) {
         this.am.ab(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.ax == null) {
               this.al(-819974861);
            }

            Iterator var8 = var5.iterator();

            while(true) {
               List var10;
               do {
                  if (!var8.hasNext()) {
                     return;
                  }

                  int var9 = (Integer)var8.next();
                  var10 = (List)this.ax.get(var9);
               } while(null == var10);

               Iterator var11 = var10.iterator();

               while(var11.hasNext()) {
                  ly var12 = (ly)var11.next();
                  int var13 = (-1763049545 * var12.af.ae - this.ad * 1174361667) * var3 / (1127687596 * this.ap);
                  int var14 = var4 - (var12.af.ag * 1162074139 - this.ah * 1837416047) * var4 / (1721384081 * this.ab);
                  vr.fk(var1 + var13, var2 + var14, 2, 16776960, 256);
               }
            }
         }
      }
   }

   public void aw(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (null != this.am) {
         this.am.ab(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.ax == null) {
               this.al(-1094594808);
            }

            Iterator var8 = var5.iterator();

            while(true) {
               List var10;
               do {
                  if (!var8.hasNext()) {
                     return;
                  }

                  int var9 = (Integer)var8.next();
                  var10 = (List)this.ax.get(var9);
               } while(null == var10);

               Iterator var11 = var10.iterator();

               while(var11.hasNext()) {
                  ly var12 = (ly)var11.next();
                  int var13 = (-1763049545 * var12.af.ae - this.ad * 1174361667) * var3 / (-1947713115 * this.ap);
                  int var14 = var4 - (var12.af.ag * 1162074139 - this.ah * -171505709) * var4 / (1721384081 * this.ab);
                  vr.fk(var1 + var13, var2 + var14, 2, 16776960, 256);
               }
            }
         }
      }
   }

   public HashMap bw() {
      this.al(-1798452059);
      return this.ax;
   }

   public List ak(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var11 = new LinkedList();
      if (!this.ac) {
         return var11;
      } else {
         ln var12 = this.af(var1, var2, var3, var4, -1534781322);
         float var13 = this.ad(var7, var3 - var1, (byte)16);
         int var14 = (int)(var13 * 64.0F);
         int var15 = this.ad * 1174361667 + var1;
         int var16 = var2 + this.ah * -171505709;

         for(int var17 = 812447689 * var12.ag; var17 < 812447689 * var12.ag + 431844209 * var12.ac; ++var17) {
            for(int var18 = -1476495151 * var12.am; var18 < var12.ae * -2085513005 + var12.am * -1476495151; ++var18) {
               List var19 = this.aq[var17][var18].bj((this.aq[var17][var18].aq * 1792572352 - var15) * var14 / 64 + var5, var8 + var6 - (1558809920 * this.aq[var17][var18].af - var16 + 64) * var14 / 64, var14, var9, var10, (byte)1);
               if (!var19.isEmpty()) {
                  var11.addAll(var19);
               }
            }
         }

         return var11;
      }
   }

   public List bn(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var11 = new LinkedList();
      if (!this.ac) {
         return var11;
      } else {
         ln var12 = this.af(var1, var2, var3, var4, -1712134215);
         float var13 = this.ad(var7, var3 - var1, (byte)-12);
         int var14 = (int)(var13 * 64.0F);
         int var15 = this.ad * 1174361667 + var1;
         int var16 = var2 + this.ah * -171505709;

         for(int var17 = 812447689 * var12.ag; var17 < 812447689 * var12.ag + 431844209 * var12.ac; ++var17) {
            for(int var18 = -1476495151 * var12.am; var18 < var12.ae * -2085513005 + var12.am * -1476495151; ++var18) {
               List var19 = this.aq[var17][var18].bj((this.aq[var17][var18].aq * 1792572352 - var15) * var14 / 64 + var5, var8 + var6 - (1558809920 * this.aq[var17][var18].af - var16 + 64) * var14 / 64, var14, var9, var10, (byte)1);
               if (!var19.isEmpty()) {
                  var11.addAll(var19);
               }
            }
         }

         return var11;
      }
   }

   ln bh(int var1, int var2, int var3, int var4) {
      ln var5 = new ln(this);
      int var6 = var1 + 1174361667 * this.ad;
      int var7 = var2 + -171505709 * this.ah;
      int var8 = this.ad * -1910450558 + var3;
      int var9 = this.ah * -171505709 + var4;
      int var10 = var6 / 1423794427;
      int var11 = var7 / 109612074;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      var5.ac = (var12 - var10 + 1) * -1835797103;
      var5.ae = 1845133147 * (1 + (var13 - var11));
      var5.ag = (var10 - this.ag.ab(-1172230344)) * -1248710687;
      var5.am = (var11 - this.ag.aa(-1848571811)) * 1783947313;
      if (-1171514157 * var5.ag < 0) {
         var5.ac += var5.ag * -1589201447;
         var5.ag = 0;
      }

      if (-48159568 * var5.ag > this.aq.length - var5.ac * 431844209) {
         var5.ac = (this.aq.length - var5.ag * 812447689) * 1457757711;
      }

      if (-1476495151 * var5.am < 0) {
         var5.ae += -293691061 * var5.am;
         var5.am = 0;
      }

      if (var5.am * -1476495151 > this.aq[0].length - -1521121306 * var5.ae) {
         var5.ae = 1845133147 * (this.aq[0].length - var5.am * -2019585605);
      }

      var5.ac = Math.min(var5.ac * 431844209, this.aq.length) * -211166842;
      var5.ae = Math.min(var5.ae * 62733118, this.aq[0].length) * 596101095;
      return var5;
   }

   public void ax(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7, int var8) {
      try {
         if (null == this.am) {
            if (var8 <= 283189840) {
               throw new IllegalStateException();
            }
         } else {
            this.am.ab(var1, var2, var3, var4);
            if (var6 > 0) {
               if (var8 <= 283189840) {
                  throw new IllegalStateException();
               }

               if (var6 % var7 < var7 / 2) {
                  if (this.ax == null) {
                     if (var8 <= 283189840) {
                        throw new IllegalStateException();
                     }

                     this.al(-1107587897);
                  }

                  Iterator var9 = var5.iterator();

                  label65:
                  do {
                     while(var9.hasNext()) {
                        if (var8 <= 283189840) {
                           throw new IllegalStateException();
                        }

                        int var10 = (Integer)var9.next();
                        List var11 = (List)this.ax.get(var10);
                        if (null == var11) {
                           continue label65;
                        }

                        Iterator var12 = var11.iterator();

                        while(var12.hasNext()) {
                           if (var8 <= 283189840) {
                              throw new IllegalStateException();
                           }

                           ly var13 = (ly)var12.next();
                           int var14 = (-1763049545 * var13.af.ae - this.ad * 1174361667) * var3 / (-1947713115 * this.ap);
                           int var15 = var4 - (var13.af.ag * 1162074139 - this.ah * -171505709) * var4 / (1721384081 * this.ab);
                           vr.fk(var1 + var14, var2 + var15, 2, 16776960, 256);
                        }
                     }

                     return;
                  } while(var8 > 283189840);

                  throw new IllegalStateException();
               }

               if (var8 <= 283189840) {
                  throw new IllegalStateException();
               }
            }

         }
      } catch (RuntimeException var16) {
         throw vk.ae(var16, "lb.ax(" + ')');
      }
   }

   public boolean bx() {
      return this.ac;
   }

   public final void ay(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      ln var14 = this.af(var1, var2, var3, var4, -411307999);
      float var15 = this.ad(var7 - var5, var3 - var1, (byte)75);
      int var16 = (int)(var15 * 64.0F);
      int var17 = var1 + 1174361667 * this.ad;
      int var18 = this.ah * -171505709 + var2;

      int var19;
      int var20;
      for(var19 = var14.ag * 812447689; var19 < var14.ac * 431844209 + var14.ag * -449730116; ++var19) {
         for(var20 = -1476495151 * var14.am; var20 < var14.ae * -2021989045 + -1476495151 * var14.am; ++var20) {
            if (var13) {
               this.aq[var19][var20].au(-2095659724);
            }

            this.aq[var19][var20].ap(var16 * (this.aq[var19][var20].aq * 1792572352 - var17) / 64 + var5, var8 - (64 + (this.aq[var19][var20].af * -1752200156 - var18)) * var16 / 64, var16, var9, 778274141);
         }
      }

      if (var10 != null && var11 > 0) {
         for(var19 = var14.ag * 717240950; var19 < 431844209 * var14.ac + 812447689 * var14.ag; ++var19) {
            for(var20 = -1574914120 * var14.am; var20 < var14.am * -1476495151 + var14.ae * -1023881839; ++var20) {
               this.aq[var19][var20].ab(var10, var11, var12, (byte)71);
            }
         }
      }

   }

   void ba() {
      if (this.ax == null) {
         this.ax = new HashMap();
      }

      this.ax.clear();

      for(int var1 = 0; var1 < this.aq.length; ++var1) {
         for(int var2 = 0; var2 < this.aq[var1].length; ++var2) {
            List var3 = this.aq[var1][var2].bp(-2005009941);
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               ly var5 = (ly)var4.next();
               if (var5.aj((byte)-3)) {
                  int var6 = var5.ae(-1570517373);
                  if (!this.ax.containsKey(var6)) {
                     LinkedList var7 = new LinkedList();
                     var7.add(var5);
                     this.ax.put(var6, var7);
                  } else {
                     List var8 = (List)this.ax.get(var6);
                     var8.add(var5);
                  }
               }
            }
         }
      }

   }

   public int bs() {
      return this.ag.ah(1320588936);
   }

   public void an(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (null != this.am) {
         this.am.ab(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.ax == null) {
               this.al(-1155984976);
            }

            Iterator var8 = var5.iterator();

            while(true) {
               List var10;
               do {
                  if (!var8.hasNext()) {
                     return;
                  }

                  int var9 = (Integer)var8.next();
                  var10 = (List)this.ax.get(var9);
               } while(null == var10);

               Iterator var11 = var10.iterator();

               while(var11.hasNext()) {
                  ly var12 = (ly)var11.next();
                  int var13 = (-157660416 * var12.af.ae - this.ad * 1174361667) * var3 / (-1947713115 * this.ap);
                  int var14 = var4 - (var12.af.ag * -2136415881 - this.ah * -614343304) * var4 / (-644333583 * this.ab);
                  vr.fk(var1 + var13, var2 + var14, 2, 327570652, 616821362);
               }
            }
         }
      }
   }

   float ad(int var1, int var2, byte var3) {
      try {
         float var4 = (float)var1 / (float)var2;
         if (var4 > 8.0F) {
            return 8.0F;
         } else if (var4 < 1.0F) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return 1.0F;
            }
         } else {
            int var5 = Math.round(var4);
            if (Math.abs((float)var5 - var4) < 0.05F) {
               if (var3 == 1) {
                  throw new IllegalStateException();
               } else {
                  return (float)var5;
               }
            } else {
               return var4;
            }
         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "lb.ad(" + ')');
      }
   }

   void bj() {
      if (this.ax == null) {
         this.ax = new HashMap();
      }

      this.ax.clear();

      for(int var1 = 0; var1 < this.aq.length; ++var1) {
         for(int var2 = 0; var2 < this.aq[var1].length; ++var2) {
            List var3 = this.aq[var1][var2].bp(-2005009941);
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               ly var5 = (ly)var4.next();
               if (var5.aj((byte)15)) {
                  int var6 = var5.ae(-1570517373);
                  if (!this.ax.containsKey(var6)) {
                     LinkedList var7 = new LinkedList();
                     var7.add(var5);
                     this.ax.put(var6, var7);
                  } else {
                     List var8 = (List)this.ax.get(var6);
                     var8.add(var5);
                  }
               }
            }
         }
      }

   }

   void bp() {
      if (this.ax == null) {
         this.ax = new HashMap();
      }

      this.ax.clear();

      for(int var1 = 0; var1 < this.aq.length; ++var1) {
         for(int var2 = 0; var2 < this.aq[var1].length; ++var2) {
            List var3 = this.aq[var1][var2].bp(-2005009941);
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               ly var5 = (ly)var4.next();
               if (var5.aj((byte)100)) {
                  int var6 = var5.ae(-1570517373);
                  if (!this.ax.containsKey(var6)) {
                     LinkedList var7 = new LinkedList();
                     var7.add(var5);
                     this.ax.put(var6, var7);
                  } else {
                     List var8 = (List)this.ax.get(var6);
                     var8.add(var5);
                  }
               }
            }
         }
      }

   }

   float by(int var1, int var2) {
      float var3 = (float)var1 / (float)var2;
      if (var3 > 8.0F) {
         return 8.0F;
      } else if (var3 < 1.0F) {
         return 1.0F;
      } else {
         int var4 = Math.round(var3);
         return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3;
      }
   }

   ln af(int var1, int var2, int var3, int var4, int var5) {
      try {
         ln var6 = new ln(this);
         int var7 = var1 + 1174361667 * this.ad;
         int var8 = var2 + -171505709 * this.ah;
         int var9 = this.ad * 1174361667 + var3;
         int var10 = this.ah * -171505709 + var4;
         int var11 = var7 / 64;
         int var12 = var8 / 64;
         int var13 = var9 / 64;
         int var14 = var10 / 64;
         var6.ac = (var13 - var11 + 1) * -1835797103;
         var6.ae = 1845133147 * (1 + (var14 - var12));
         var6.ag = (var11 - this.ag.ab(-739518413)) * -983772551;
         var6.am = (var12 - this.ag.aa(-2023405417)) * 1783947313;
         if (812447689 * var6.ag < 0) {
            if (var5 >= 1571890200) {
               throw new IllegalStateException();
            }

            var6.ac += var6.ag * -1589201447;
            var6.ag = 0;
         }

         if (812447689 * var6.ag > this.aq.length - var6.ac * 431844209) {
            if (var5 >= 1571890200) {
               throw new IllegalStateException();
            }

            var6.ac = (this.aq.length - var6.ag * 812447689) * -1835797103;
         }

         if (-1476495151 * var6.am < 0) {
            if (var5 >= 1571890200) {
               throw new IllegalStateException();
            }

            var6.ae += -293691061 * var6.am;
            var6.am = 0;
         }

         if (var6.am * -1476495151 > this.aq[0].length - -2085513005 * var6.ae) {
            if (var5 >= 1571890200) {
               throw new IllegalStateException();
            }

            var6.ae = 1845133147 * (this.aq[0].length - var6.am * -1476495151);
         }

         var6.ac = Math.min(var6.ac * 431844209, this.aq.length) * -1835797103;
         var6.ae = Math.min(var6.ae * -2085513005, this.aq[0].length) * 1845133147;
         return var6;
      } catch (RuntimeException var15) {
         throw vk.ae(var15, "lb.af(" + ')');
      }
   }

   public List aq(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      try {
         LinkedList var12 = new LinkedList();
         if (!this.ac) {
            if (var11 <= -1461245079) {
               throw new IllegalStateException();
            } else {
               return var12;
            }
         } else {
            ln var13 = this.af(var1, var2, var3, var4, 730376433);
            float var14 = this.ad(var7, var3 - var1, (byte)2);
            int var15 = (int)(var14 * 64.0F);
            int var16 = this.ad * 1174361667 + var1;
            int var17 = var2 + this.ah * -171505709;

            for(int var18 = 812447689 * var13.ag; var18 < 812447689 * var13.ag + 431844209 * var13.ac; ++var18) {
               for(int var19 = -1476495151 * var13.am; var19 < var13.ae * -2085513005 + var13.am * -1476495151; ++var19) {
                  List var20 = this.aq[var18][var19].bj((this.aq[var18][var19].aq * 1792572352 - var16) * var15 / 64 + var5, var8 + var6 - (1558809920 * this.aq[var18][var19].af - var17 + 64) * var15 / 64, var15, var9, var10, (byte)1);
                  if (!var20.isEmpty()) {
                     var12.addAll(var20);
                  }
               }
            }

            return var12;
         }
      } catch (RuntimeException var21) {
         throw vk.ae(var21, "lb.aq(" + ')');
      }
   }
}
