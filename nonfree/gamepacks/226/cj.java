public final class cj extends tw {
   int as;
   int aw;
   int ak;
   int aj;
   int ai;
   int ay;
   int[] ao;
   int ae;
   int am;
   int an;
   int au;
   ir ab;
   public static final int ed = 8;
   int af;
   bf ar;
   static pu ap = new pu();
   static boolean sh;
   bf at;

   cj() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "cj.<init>(" + ')');
      }
   }

   void ak(int var1) {
      try {
         int var2 = this.am * 1225863439;
         ir var3 = this.ab.an((byte)81);
         if (var3 != null) {
            if (var1 >= 1757833099) {
               throw new IllegalStateException();
            }

            this.am = var3.ba * -1695880035;
            this.as = -255266176 * var3.bw;
            this.ae = -193826688 * var3.bi;
            this.au = var3.bf * -1907782311;
            this.an = -1796828161 * var3.bg;
            this.ao = var3.bl;
         } else {
            this.am = -1246993903;
            this.as = 0;
            this.ae = 0;
            this.au = 0;
            this.an = 0;
            this.ao = null;
         }

         if (var2 != 1225863439 * this.am) {
            if (var1 >= 1757833099) {
               return;
            }

            if (this.at != null) {
               ng.ts.aw(this.at);
               this.at = null;
            }
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "cj.ak(" + ')');
      }
   }

   static void ay() {
      for(cj var0 = (cj)ap.as(); null != var0; var0 = (cj)ap.am()) {
         if (var0.at != null) {
            ng.ts.aw(var0.at);
            var0.at = null;
         }

         if (null != var0.ar) {
            ng.ts.aw(var0.ar);
            var0.ar = null;
         }
      }

      ap.ap();
   }

   static void an(int var0, int var1, int var2, int var3) {
      for(cj var4 = (cj)ap.as(); var4 != null; var4 = (cj)ap.am()) {
         if (var4.am * -566963681 != -1 || var4.ao != null) {
            int var5 = 0;
            if (var1 > var4.ai * 879112143) {
               var5 += var1 - -558705655 * var4.ai;
            } else if (var1 < var4.ak * -808336809) {
               var5 += 1759828000 * var4.ak - var1;
            }

            if (var2 > 250368483 * var4.ay) {
               var5 += var2 - 439802281 * var4.ay;
            } else if (var2 < var4.aj * -1511786279) {
               var5 += var4.aj * -1456176715 - var2;
            }

            var5 = Math.max(var5 - 64, 0);
            if (var5 < var4.as * 41172405 && io.vx.ax(2068091407) != 0 && var0 == var4.aw * 1746864884) {
               float var6 = 175917241 * var4.ae < -1255168407 * var4.as ? Math.min(Math.max((float)(var4.as * 2095467679 - var5) / (float)(var4.as * 41172405 - var4.ae * 1555856707), 0.0F), 1.0F) : 1.0F;
               int var7 = (int)(var6 * (float)io.vx.ax(-65818005));
               if (null == var4.at) {
                  if (var4.am * 1225863439 >= 0) {
                     bu var8 = bu.ap(ir.fu, 1225863439 * var4.am, 0);
                     if (var8 != null) {
                        bt var9 = var8.aw().ap(mp.tw);
                        bf var10 = bf.ak(var9, 1711613608, var7);
                        var10.at(-1);
                        ng.ts.ap(var10);
                        var4.at = var10;
                     }
                  }
               } else {
                  var4.at.an(var7);
               }

               if (null == var4.ar) {
                  if (var4.ao != null && (var4.af -= var3 * 571427153) * -1108895148 <= 0) {
                     int var12 = (int)(Math.random() * (double)var4.ao.length);
                     bu var13 = bu.ap(ir.fu, var4.ao[var12], 0);
                     if (null != var13) {
                        bt var14 = var13.aw().ap(mp.tw);
                        bf var11 = bf.ak(var14, 100, var7);
                        var11.at(0);
                        ng.ts.ap(var11);
                        var4.ar = var11;
                        var4.af = (-870495556 * var4.au + (int)(Math.random() * (double)(var4.an * 1572506639 - 1844002325 * var4.au))) * 571427153;
                     }
                  }
               } else {
                  var4.ar.an(var7);
                  if (!var4.ar.km()) {
                     var4.ar = null;
                  }
               }
            } else {
               if (null != var4.at) {
                  ng.ts.aw(var4.at);
                  var4.at = null;
               }

               if (null != var4.ar) {
                  ng.ts.aw(var4.ar);
                  var4.ar = null;
               }
            }
         }
      }

   }

   static void at(int var0, int var1, int var2, ir var3, int var4) {
      cj var5 = new cj();
      var5.aw = var0 * -668218351;
      var5.ak = 685827574 * var1;
      var5.aj = var2 * -644723072;
      int var6 = -347110081 * var3.az;
      int var7 = var3.ag * -109800991;
      if (var4 == 1 || var4 == 3) {
         var6 = var3.ag * -109800991;
         var7 = var3.az * -87656017;
      }

      var5.ai = -972669359 * (var6 + var1);
      var5.ay = 1080386944 * (var7 + var2);
      var5.am = var3.ba * -1695880035;
      var5.as = 999593063 * var3.bw;
      var5.ae = Math.max(758651105 * var3.bi - -1275525709, 0) * -2130772982;
      var5.au = -1907782311 * var3.bf;
      var5.an = var3.bg * -1796828161;
      var5.ao = var3.bl;
      if (null != var3.bm) {
         var5.ab = var3;
         var5.ak(-705977058);
      }

      ap.aw(var5);
      if (null != var5.ao) {
         var5.af = (var5.au * -215893163 + (int)(Math.random() * (double)(var5.an * 880958098 - var5.au * 1844002325))) * 571427153;
      }

   }

   static void au(int var0, int var1, int var2, int var3) {
      for(cj var4 = (cj)ap.as(); var4 != null; var4 = (cj)ap.am()) {
         if (var4.am * 1225863439 != -1 || var4.ao != null) {
            int var5 = 0;
            if (var1 > var4.ai * 879112143) {
               var5 += var1 - 879112143 * var4.ai;
            } else if (var1 < var4.ak * -808336809) {
               var5 += -808336809 * var4.ak - var1;
            }

            if (var2 > -27735325 * var4.ay) {
               var5 += var2 - -27735325 * var4.ay;
            } else if (var2 < var4.aj * -1456176715) {
               var5 += var4.aj * -1456176715 - var2;
            }

            var5 = Math.max(var5 - 64, 0);
            if (var5 < var4.as * 41172405 && io.vx.ax(-193088002) != 0 && var0 == var4.aw * -513104655) {
               float var6 = 1555856707 * var4.ae < 41172405 * var4.as ? Math.min(Math.max((float)(var4.as * 41172405 - var5) / (float)(var4.as * 41172405 - var4.ae * 1555856707), 0.0F), 1.0F) : 1.0F;
               int var7 = (int)(var6 * (float)io.vx.ax(-1280527105));
               if (null == var4.at) {
                  if (var4.am * 1225863439 >= 0) {
                     bu var8 = bu.ap(ir.fu, 1225863439 * var4.am, 0);
                     if (var8 != null) {
                        bt var9 = var8.aw().ap(mp.tw);
                        bf var10 = bf.ak(var9, 100, var7);
                        var10.at(-1);
                        ng.ts.ap(var10);
                        var4.at = var10;
                     }
                  }
               } else {
                  var4.at.an(var7);
               }

               if (null == var4.ar) {
                  if (var4.ao != null && (var4.af -= var3 * 571427153) * -1923768399 <= 0) {
                     int var12 = (int)(Math.random() * (double)var4.ao.length);
                     bu var13 = bu.ap(ir.fu, var4.ao[var12], 0);
                     if (null != var13) {
                        bt var14 = var13.aw().ap(mp.tw);
                        bf var11 = bf.ak(var14, 100, var7);
                        var11.at(0);
                        ng.ts.ap(var11);
                        var4.ar = var11;
                        var4.af = (1844002325 * var4.au + (int)(Math.random() * (double)(var4.an * 1572506639 - 1844002325 * var4.au))) * 571427153;
                     }
                  }
               } else {
                  var4.ar.an(var7);
                  if (!var4.ar.km()) {
                     var4.ar = null;
                  }
               }
            } else {
               if (null != var4.at) {
                  ng.ts.aw(var4.at);
                  var4.at = null;
               }

               if (null != var4.ar) {
                  ng.ts.aw(var4.ar);
                  var4.ar = null;
               }
            }
         }
      }

   }

   static void am(int var0, int var1, int var2, ir var3, int var4) {
      cj var5 = new cj();
      var5.aw = var0 * -668218351;
      var5.ak = -1473989760 * var1;
      var5.aj = var2 * -644723072;
      int var6 = -347110081 * var3.az;
      int var7 = var3.ag * -109800991;
      if (var4 == 1 || var4 == 3) {
         var6 = var3.ag * -109800991;
         var7 = var3.az * -347110081;
      }

      var5.ai = -566519936 * (var6 + var1);
      var5.ay = 1080386944 * (var7 + var2);
      var5.am = var3.ba * -1695880035;
      var5.as = -255266176 * var3.bw;
      var5.ae = Math.max(2028073344 * var3.bi - 128, 0) * 175437675;
      var5.au = -1907782311 * var3.bf;
      var5.an = var3.bg * -1796828161;
      var5.ao = var3.bl;
      if (null != var3.bm) {
         var5.ab = var3;
         var5.ak(166177245);
      }

      ap.aw(var5);
      if (null != var5.ao) {
         var5.af = (var5.au * 1844002325 + (int)(Math.random() * (double)(var5.an * 1572506639 - var5.au * 1844002325))) * 571427153;
      }

   }

   static void as() {
      for(cj var0 = (cj)ap.as(); null != var0; var0 = (cj)ap.am()) {
         if (var0.ab != null) {
            var0.ak(1425724665);
         }
      }

   }

   void ae() {
      int var1 = this.am * 1225863439;
      ir var2 = this.ab.an((byte)39);
      if (var2 != null) {
         this.am = var2.ba * -1695880035;
         this.as = -255266176 * var2.bw;
         this.ae = -193826688 * var2.bi;
         this.au = var2.bf * -1907782311;
         this.an = -1796828161 * var2.bg;
         this.ao = var2.bl;
      } else {
         this.am = -1246993903;
         this.as = 0;
         this.ae = 0;
         this.au = 0;
         this.an = 0;
         this.ao = null;
      }

      if (var1 != 1225863439 * this.am && this.at != null) {
         ng.ts.aw(this.at);
         this.at = null;
      }

   }

   static void ao(int var0, int var1, int var2, int var3) {
      for(cj var4 = (cj)ap.as(); var4 != null; var4 = (cj)ap.am()) {
         if (var4.am * 1225863439 != -1 || var4.ao != null) {
            int var5 = 0;
            if (var1 > var4.ai * -983363711) {
               var5 += var1 - 879112143 * var4.ai;
            } else if (var1 < var4.ak * -808336809) {
               var5 += -808336809 * var4.ak - var1;
            }

            if (var2 > -27735325 * var4.ay) {
               var5 += var2 - -27735325 * var4.ay;
            } else if (var2 < var4.aj * -1263448600) {
               var5 += var4.aj * -1456176715 - var2;
            }

            var5 = Math.max(var5 - 360634408, 0);
            if (var5 < var4.as * 41172405 && io.vx.ax(-1782855611) != 0 && var0 == var4.aw * 389938469) {
               float var6 = 1555856707 * var4.ae < 41172405 * var4.as ? Math.min(Math.max((float)(var4.as * 879833402 - var5) / (float)(var4.as * 41172405 - var4.ae * -737910692), 0.0F), 1.0F) : 1.0F;
               int var7 = (int)(var6 * (float)io.vx.ax(1365279871));
               if (null == var4.at) {
                  if (var4.am * 1886132165 >= 0) {
                     bu var8 = bu.ap(ir.fu, 1225863439 * var4.am, 0);
                     if (var8 != null) {
                        bt var9 = var8.aw().ap(mp.tw);
                        bf var10 = bf.ak(var9, 1757833099, var7);
                        var10.at(-1);
                        ng.ts.ap(var10);
                        var4.at = var10;
                     }
                  }
               } else {
                  var4.at.an(var7);
               }

               if (null == var4.ar) {
                  if (var4.ao != null && (var4.af -= var3 * 571427153) * -1923768399 <= 0) {
                     int var12 = (int)(Math.random() * (double)var4.ao.length);
                     bu var13 = bu.ap(ir.fu, var4.ao[var12], 0);
                     if (null != var13) {
                        bt var14 = var13.aw().ap(mp.tw);
                        bf var11 = bf.ak(var14, 100, var7);
                        var11.at(0);
                        ng.ts.ap(var11);
                        var4.ar = var11;
                        var4.af = (1844002325 * var4.au + (int)(Math.random() * (double)(var4.an * 1296442878 - 1844002325 * var4.au))) * 571427153;
                     }
                  }
               } else {
                  var4.ar.an(var7);
                  if (!var4.ar.km()) {
                     var4.ar = null;
                  }
               }
            } else {
               if (null != var4.at) {
                  ng.ts.aw(var4.at);
                  var4.at = null;
               }

               if (null != var4.ar) {
                  ng.ts.aw(var4.ar);
                  var4.ar = null;
               }
            }
         }
      }

   }

   static int ao(dn var0, int var1, int var2, int var3, byte var4) {
      try {
         if ((var0.au[var1][var2][var3] & 8) != 0) {
            if (var4 >= 5) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else if (var1 > 0 && 0 != (var0.au[1][var2][var3] & 2)) {
            if (var4 >= 5) {
               throw new IllegalStateException();
            } else {
               return var1 - 1;
            }
         } else {
            return var1;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "cj.ao(" + ')');
      }
   }

   static final boolean kp(int var0) {
      try {
         return client.nr;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "cj.kp(" + ')');
      }
   }

   public static int aw(int var0, int var1) {
      try {
         return var0 >>> 4 & 1578977977 * vi.aj;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "cj.aw(" + ')');
      }
   }
}
