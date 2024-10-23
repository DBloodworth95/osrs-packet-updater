import java.awt.FontMetrics;

public class fr {
   boolean aq;
   boolean ae;
   fk ag;
   fk am;
   fe[] ax;
   float ab;
   float af;
   float at;
   static FontMetrics bx;
   float ar;
   float al;
   float ad;
   float ah;
   float ap;
   float aj;
   boolean ac;
   boolean aa;
   int ai;
   float[] ao;
   int as;
   float au;
   float az;
   int ay;
   float av;

   int bn() {
      return this.ax(1336244442) - this.am(-926328084);
   }

   int ac(vf var1, int var2, int var3) {
      try {
         int var4 = var1.ct(-1930156464);
         int var5 = var1.cv(952452697);
         fw[] var6 = new fw[]{fw.ac, fw.ae, fw.ag, fw.am, fw.ax, fw.aq, fw.af, fw.at, fw.au};
         fw var7 = (fw)ox.ac(var6, var5, 842964038);
         if (null == var7) {
            var7 = fw.au;
         }

         int var14 = var1.cv(952452697);
         fk var8 = (fk)ox.ac(kp.ax(1313495960), var14, 1009132652);
         if (var8 == null) {
            if (var3 == 1095329286) {
               throw new IllegalStateException();
            }

            var8 = fk.ac;
         }

         this.ag = var8;
         int var9 = var1.cv(952452697);
         fk var10 = (fk)ox.ac(kp.ax(1266093532), var9, 1174007945);
         if (var10 == null) {
            if (var3 == 1095329286) {
               throw new IllegalStateException();
            }

            var10 = fk.ac;
         }

         this.am = var10;
         this.ac = var1.cv(952452697) != 0;
         this.ax = new fe[var4];
         fe var15 = null;

         for(int var11 = 0; var11 < var4; ++var11) {
            if (var3 == 1095329286) {
               throw new IllegalStateException();
            }

            fe var12 = new fe();
            var12.ac(var1, var2, -378304652);
            this.ax[var11] = var12;
            if (null != var15) {
               if (var3 == 1095329286) {
                  throw new IllegalStateException();
               }

               var15.af = var12;
            }

            var15 = var12;
         }

         return var4;
      } catch (RuntimeException var13) {
         throw vk.ae(var13, "fr.ac(" + ')');
      }
   }

   int bf() {
      return this.ax == null ? 0 : this.ax.length;
   }

   int ai() {
      return -2016018927 * this.as;
   }

   public float ag(int var1, int var2) {
      try {
         if (var1 < this.am(-926328084)) {
            return this.aj;
         } else if (var1 > this.ax(-1983248105)) {
            if (var2 == 293758900) {
               throw new IllegalStateException();
            } else {
               return this.av;
            }
         } else {
            return this.ao[var1 - this.am(-926328084)];
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "fr.ag(" + ')');
      }
   }

   int aw() {
      return this.ax(633815924) - this.am(-926328084);
   }

   int aq(int var1) {
      try {
         return this.ax(1271261989) - this.am(-926328084);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "fr.aq(" + ')');
      }
   }

   int af(float var1, int var2) {
      try {
         if (this.ai * -381938415 >= 0) {
            if (var2 <= 1564428673) {
               throw new IllegalStateException();
            }

            if ((float)(-1487779715 * this.ax[-381938415 * this.ai].ac) <= var1) {
               if (var2 <= 1564428673) {
                  throw new IllegalStateException();
               }

               if (this.ax[-381938415 * this.ai].af == null) {
                  return this.ai * -381938415;
               }

               if (var2 <= 1564428673) {
                  throw new IllegalStateException();
               }

               if ((float)(-1487779715 * this.ax[-381938415 * this.ai].af.ac) > var1) {
                  if (var2 <= 1564428673) {
                     throw new IllegalStateException();
                  }

                  return this.ai * -381938415;
               }
            }
         }

         if (!(var1 < (float)this.am(-926328084))) {
            if (var2 <= 1564428673) {
               throw new IllegalStateException();
            }

            if (!(var1 > (float)this.ax(-1933884767))) {
               int var3 = this.au((byte)40);
               int var4 = this.ai * -381938415;
               if (var3 > 0) {
                  if (var2 <= 1564428673) {
                     throw new IllegalStateException();
                  }

                  int var5 = 0;
                  int var6 = var3 - 1;

                  do {
                     int var7 = var5 + var6 >> 1;
                     if (var1 < (float)(this.ax[var7].ac * -1487779715)) {
                        if (var2 <= 1564428673) {
                           throw new IllegalStateException();
                        }

                        if (var1 > (float)(this.ax[var7 - 1].ac * -1487779715)) {
                           if (var2 <= 1564428673) {
                              throw new IllegalStateException();
                           }

                           var4 = var7 - 1;
                           break;
                        }

                        var6 = var7 - 1;
                     } else {
                        if (!(var1 > (float)(this.ax[var7].ac * -1487779715))) {
                           var4 = var7;
                           break;
                        }

                        if (var2 <= 1564428673) {
                           throw new IllegalStateException();
                        }

                        if (var1 < (float)(this.ax[var7 + 1].ac * -1487779715)) {
                           if (var2 <= 1564428673) {
                              throw new IllegalStateException();
                           }

                           var4 = var7;
                           break;
                        }

                        var5 = 1 + var7;
                     }
                  } while(var5 <= var6);
               }

               if (var4 != -381938415 * this.ai) {
                  if (var2 <= 1564428673) {
                     throw new IllegalStateException();
                  }

                  this.ai = -952009743 * var4;
                  this.aa = true;
               }

               return this.ai * -381938415;
            }
         }

         return -1;
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "fr.af(" + ')');
      }
   }

   fe at(float var1, int var2) {
      try {
         int var3 = this.af(var1, 2075280937);
         if (var3 >= 0 && var3 < this.ax.length) {
            if (var2 == 1507428828) {
               throw new IllegalStateException();
            } else {
               return this.ax[var3];
            }
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "fr.at(" + ')');
      }
   }

   int au(byte var1) {
      try {
         if (this.ax == null) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            return this.ax.length;
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "fr.au(" + ')');
      }
   }

   int ar(vf var1, int var2) {
      int var3 = var1.ct(-1708916352);
      int var4 = var1.cv(952452697);
      fw[] var5 = new fw[]{fw.ac, fw.ae, fw.ag, fw.am, fw.ax, fw.aq, fw.af, fw.at, fw.au};
      fw var6 = (fw)ox.ac(var5, var4, 227558667);
      if (null == var6) {
         var6 = fw.au;
      }

      int var12 = var1.cv(952452697);
      fk var7 = (fk)ox.ac(kp.ax(1603005344), var12, 678772739);
      if (var7 == null) {
         var7 = fk.ac;
      }

      this.ag = var7;
      int var8 = var1.cv(952452697);
      fk var9 = (fk)ox.ac(kp.ax(1929984474), var8, 1071227000);
      if (var9 == null) {
         var9 = fk.ac;
      }

      this.am = var9;
      this.ac = var1.cv(952452697) != 0;
      this.ax = new fe[var3];
      fe var13 = null;

      for(int var10 = 0; var10 < var3; ++var10) {
         fe var11 = new fe();
         var11.ac(var1, var2, -1194288986);
         this.ax[var10] = var11;
         if (null != var13) {
            var13.af = var11;
         }

         var13 = var11;
      }

      return var3;
   }

   void ae(int var1) {
      try {
         this.as = this.ax[0].ac * -722393171;
         this.ay = this.ax[this.au((byte)108) - 1].ac * -1996066135;
         this.ao = new float[this.aq(-768090856) + 1];

         for(int var2 = this.am(-926328084); var2 <= this.ax(-607611015); ++var2) {
            if (var1 != -432810519) {
               return;
            }

            this.ao[var2 - this.am(-926328084)] = dk.ac(this, (float)var2, (short)6575);
         }

         this.ax = null;
         this.aj = dk.ac(this, (float)(this.am(-926328084) - 1), (short)30655);
         this.av = dk.ac(this, (float)(this.ax(1697708192) + 1), (short)24880);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "fr.ae(" + ')');
      }
   }

   int ad(vf var1, int var2) {
      int var3 = var1.ct(-1873868173);
      int var4 = var1.cv(952452697);
      fw[] var5 = new fw[]{fw.ac, fw.ae, fw.ag, fw.am, fw.ax, fw.aq, fw.af, fw.at, fw.au};
      fw var6 = (fw)ox.ac(var5, var4, 1640554269);
      if (null == var6) {
         var6 = fw.au;
      }

      int var12 = var1.cv(952452697);
      fk var7 = (fk)ox.ac(kp.ax(1140524638), var12, 1440973448);
      if (var7 == null) {
         var7 = fk.ac;
      }

      this.ag = var7;
      int var8 = var1.cv(952452697);
      fk var9 = (fk)ox.ac(kp.ax(1044064347), var8, 1979892416);
      if (var9 == null) {
         var9 = fk.ac;
      }

      this.am = var9;
      this.ac = var1.cv(952452697) != 0;
      this.ax = new fe[var3];
      fe var13 = null;

      for(int var10 = 0; var10 < var3; ++var10) {
         fe var11 = new fe();
         var11.ac(var1, var2, -1448628332);
         this.ax[var10] = var11;
         if (null != var13) {
            var13.af = var11;
         }

         var13 = var11;
      }

      return var3;
   }

   void ah() {
      this.as = this.ax[0].ac * -722393171;
      this.ay = this.ax[this.au((byte)88) - 1].ac * -1996066135;
      this.ao = new float[this.aq(1419497321) + 1];

      for(int var1 = this.am(-926328084); var1 <= this.ax(-395350607); ++var1) {
         this.ao[var1 - this.am(-926328084)] = dk.ac(this, (float)var1, (short)24933);
      }

      this.ax = null;
      this.aj = dk.ac(this, (float)(this.am(-926328084) - 1), (short)10035);
      this.av = dk.ac(this, (float)(this.ax(-1854981143) + 1), (short)25645);
   }

   void ap() {
      this.as = this.ax[0].ac * -722393171;
      this.ay = this.ax[this.au((byte)98) - 1].ac * -1071738599;
      this.ao = new float[this.aq(779911141) + 1];

      for(int var1 = this.am(-926328084); var1 <= this.ax(-1312201610); ++var1) {
         this.ao[var1 - this.am(-926328084)] = dk.ac(this, (float)var1, (short)32045);
      }

      this.ax = null;
      this.aj = dk.ac(this, (float)(this.am(-926328084) - 1), (short)26547);
      this.av = dk.ac(this, (float)(this.ax(-1063879452) + 1), (short)27910);
   }

   fr() {
      try {
         super();
         this.aa = true;
         this.ai = 0;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "fr.<init>(" + ')');
      }
   }

   fe bx(float var1) {
      int var2 = this.af(var1, 1632971175);
      return var2 >= 0 && var2 < this.ax.length ? this.ax[var2] : null;
   }

   public float aa(int var1) {
      if (var1 < this.am(-926328084)) {
         return this.aj;
      } else {
         return var1 > this.ax(1683312070) ? this.av : this.ao[var1 - this.am(-926328084)];
      }
   }

   void ab() {
      this.as = this.ax[0].ac * -722393171;
      this.ay = this.ax[this.au((byte)118) - 1].ac * 1964411300;
      this.ao = new float[this.aq(-4090501) + 1];

      for(int var1 = this.am(-926328084); var1 <= this.ax(-732882129); ++var1) {
         this.ao[var1 - this.am(-926328084)] = dk.ac(this, (float)var1, (short)7876);
      }

      this.ax = null;
      this.aj = dk.ac(this, (float)(this.am(-926328084) - 1), (short)22700);
      this.av = dk.ac(this, (float)(this.ax(-775921994) + 1), (short)7426);
   }

   int ao() {
      return -2016018927 * this.as;
   }

   int as() {
      return -270363564 * this.as;
   }

   int ay() {
      return this.ay * 1477631925;
   }

   int aj() {
      return this.ay * 1154456752;
   }

   int av() {
      return this.ay * -905076679;
   }

   int am(int var1) {
      try {
         return -2016018927 * this.as;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "fr.am(" + ')');
      }
   }

   static final boolean ov(ny var0, short var1) {
      try {
         int var2 = var0.bs * 571012371;
         if (var2 == 205) {
            client.ii = -1394689078;
            return true;
         } else {
            nr var10000;
            boolean var10002;
            int var3;
            int var4;
            if (var2 >= 300) {
               if (var1 != 174) {
                  throw new IllegalStateException();
               }

               if (var2 <= 313) {
                  if (var1 != 174) {
                     throw new IllegalStateException();
                  }

                  var3 = (var2 - 300) / 2;
                  var4 = var2 & 1;
                  var10000 = client.vn;
                  if (var4 == 1) {
                     if (var1 != 174) {
                        throw new IllegalStateException();
                     }

                     var10002 = true;
                  } else {
                     var10002 = false;
                  }

                  var10000.am(var3, var10002, -1360021285);
               }
            }

            if (var2 >= 314) {
               if (var1 != 174) {
                  throw new IllegalStateException();
               }

               if (var2 <= 323) {
                  if (var1 != 174) {
                     throw new IllegalStateException();
                  }

                  var3 = (var2 - 314) / 2;
                  var4 = var2 & 1;
                  var10000 = client.vn;
                  if (1 == var4) {
                     if (var1 != 174) {
                        throw new IllegalStateException();
                     }

                     var10002 = true;
                  } else {
                     var10002 = false;
                  }

                  var10000.ax(var3, var10002, 1488978092);
               }
            }

            if (324 == var2) {
               if (var1 != 174) {
                  throw new IllegalStateException();
               }

               client.vn.aq(0, -1782937947);
            }

            if (var2 == 325) {
               if (var1 != 174) {
                  throw new IllegalStateException();
               }

               client.vn.aq(1, -1284154436);
            }

            if (326 == var2) {
               mq var6 = fs.ac(vc.ac * -95704915 >= 224 ? mz.de : mz.ba, client.ia.ax, (byte)-42);
               client.vn.af(var6.ag, (byte)-13);
               client.ia.ag(var6, -667639003);
               return true;
            } else {
               return false;
            }
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "fr.ov(" + ')');
      }
   }

   int ak() {
      return this.ax(-1507935438) - this.am(-926328084);
   }

   public float az(int var1) {
      if (var1 < this.am(-926328084)) {
         return this.aj;
      } else {
         return var1 > this.ax(-1334602577) ? this.av : this.ao[var1 - this.am(-926328084)];
      }
   }

   int bh(float var1) {
      if (this.ai * -381938415 < 0 || !((float)(571260356 * this.ax[-381938415 * this.ai].ac) <= var1) || this.ax[-381938415 * this.ai].af != null && !((float)(-1487779715 * this.ax[1803053259 * this.ai].af.ac) > var1)) {
         if (!(var1 < (float)this.am(-926328084)) && !(var1 > (float)this.ax(-563418265))) {
            int var2 = this.au((byte)8);
            int var3 = this.ai * -381938415;
            if (var2 > 0) {
               int var4 = 0;
               int var5 = var2 - 1;

               do {
                  int var6 = var4 + var5 >> 1;
                  if (var1 < (float)(this.ax[var6].ac * -1487779715)) {
                     if (var1 > (float)(this.ax[var6 - 1].ac * -1470063625)) {
                        var3 = var6 - 1;
                        break;
                     }

                     var5 = var6 - 1;
                  } else {
                     if (!(var1 > (float)(this.ax[var6].ac * -1555163675))) {
                        var3 = var6;
                        break;
                     }

                     if (var1 < (float)(this.ax[var6 + 1].ac * -312192158)) {
                        var3 = var6;
                        break;
                     }

                     var4 = 1 + var6;
                  }
               } while(var4 <= var5);
            }

            if (var3 != 1376683543 * this.ai) {
               this.ai = -952009743 * var3;
               this.aa = true;
            }

            return this.ai * -381938415;
         } else {
            return -1;
         }
      } else {
         return this.ai * -1403521703;
      }
   }

   int bd(float var1) {
      if (this.ai * -381938415 < 0 || !((float)(-1487779715 * this.ax[-381938415 * this.ai].ac) <= var1) || this.ax[-381938415 * this.ai].af != null && !((float)(-1487779715 * this.ax[-381938415 * this.ai].af.ac) > var1)) {
         if (!(var1 < (float)this.am(-926328084)) && !(var1 > (float)this.ax(-1010987392))) {
            int var2 = this.au((byte)44);
            int var3 = this.ai * -381938415;
            if (var2 > 0) {
               int var4 = 0;
               int var5 = var2 - 1;

               do {
                  int var6 = var4 + var5 >> 1;
                  if (var1 < (float)(this.ax[var6].ac * -1487779715)) {
                     if (var1 > (float)(this.ax[var6 - 1].ac * -1487779715)) {
                        var3 = var6 - 1;
                        break;
                     }

                     var5 = var6 - 1;
                  } else {
                     if (!(var1 > (float)(this.ax[var6].ac * -1487779715))) {
                        var3 = var6;
                        break;
                     }

                     if (var1 < (float)(this.ax[var6 + 1].ac * -1487779715)) {
                        var3 = var6;
                        break;
                     }

                     var4 = 1 + var6;
                  }
               } while(var4 <= var5);
            }

            if (var3 != -381938415 * this.ai) {
               this.ai = -952009743 * var3;
               this.aa = true;
            }

            return this.ai * -381938415;
         } else {
            return -1;
         }
      } else {
         return this.ai * -381938415;
      }
   }

   int al(vf var1, int var2) {
      int var3 = var1.ct(-1523878360);
      int var4 = var1.cv(952452697);
      fw[] var5 = new fw[]{fw.ac, fw.ae, fw.ag, fw.am, fw.ax, fw.aq, fw.af, fw.at, fw.au};
      fw var6 = (fw)ox.ac(var5, var4, 2124889244);
      if (null == var6) {
         var6 = fw.au;
      }

      int var12 = var1.cv(952452697);
      fk var7 = (fk)ox.ac(kp.ax(1279830340), var12, 1836569073);
      if (var7 == null) {
         var7 = fk.ac;
      }

      this.ag = var7;
      int var8 = var1.cv(952452697);
      fk var9 = (fk)ox.ac(kp.ax(2121700083), var8, 865908761);
      if (var9 == null) {
         var9 = fk.ac;
      }

      this.am = var9;
      this.ac = var1.cv(952452697) != 0;
      this.ax = new fe[var3];
      fe var13 = null;

      for(int var10 = 0; var10 < var3; ++var10) {
         fe var11 = new fe();
         var11.ac(var1, var2, -41004026);
         this.ax[var10] = var11;
         if (null != var13) {
            var13.af = var11;
         }

         var13 = var11;
      }

      return var3;
   }

   int bw() {
      return this.ax == null ? 0 : this.ax.length;
   }

   int bm() {
      return this.ax == null ? 0 : this.ax.length;
   }

   int bs() {
      return this.ax == null ? 0 : this.ax.length;
   }

   int an() {
      return this.ax(-1854333750) - this.am(-926328084);
   }

   int ax(int var1) {
      try {
         return this.ay * 1477631925;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "fr.ax(" + ')');
      }
   }
}
