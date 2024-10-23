public final class ca extends to {
   bq ar;
   int ae;
   int ag;
   int am;
   int[] ah;
   int au;
   int af;
   static pk ac = new pk();
   int ax;
   int ap;
   int al;
   int ad;
   int aq;
   int at;
   bq ab;
   id az;
   public static final int bk = 65;
   static final int cw = 0;

   static void ah(int var0, int var1, int var2, int var3) {
      for(ca var4 = (ca)ac.af(); null != var4; var4 = (ca)ac.au()) {
         if (-1 != -394161421 * var4.au || null != var4.ah) {
            int var5 = 0;
            if (var1 > -172191635 * var4.ax) {
               var5 += var1 - -172191635 * var4.ax;
            } else if (var1 < var4.ag * 475277647) {
               var5 += var4.ag * 475277647 - var1;
            }

            if (var2 > -1015866851 * var4.aq) {
               var5 += var2 - -1015866851 * var4.aq;
            } else if (var2 < 1834590545 * var4.am) {
               var5 += var4.am * 1834590545 - var2;
            }

            var5 = Math.max(var5 - 64, 0);
            if (var5 < var4.af * 1410128111 && re.vt.av((byte)90) != 0 && var0 == -1014282793 * var4.ae) {
               float var6 = var4.at * 11649375 < var4.af * 1410128111 ? Math.min(Math.max((float)(1410128111 * var4.af - var5) / (float)(1410128111 * var4.af - 11649375 * var4.at), 0.0F), 1.0F) : 1.0F;
               int var7 = (int)(var6 * (float)re.vt.av((byte)61));
               if (null == var4.ar) {
                  if (-394161421 * var4.au >= 0) {
                     bi var8 = bi.ac(cy.fv, var4.au * -394161421, 0);
                     if (var8 != null) {
                        bg var9 = var8.ae().ac(av.ty);
                        bq var10 = bq.ag(var9, 100, var7);
                        var10.ar(-1);
                        ba.tr.ac(var10);
                        var4.ar = var10;
                     }
                  }
               } else {
                  var4.ar.ad(var7);
               }

               if (null == var4.ab) {
                  if (var4.ah != null && (var4.ap -= var3 * 1490311151) * -8538353 <= 0) {
                     int var12 = (int)(Math.random() * (double)var4.ah.length);
                     bi var13 = bi.ac(cy.fv, var4.ah[var12], 0);
                     if (null != var13) {
                        bg var14 = var13.ae().ac(av.ty);
                        bq var11 = bq.ag(var14, 100, var7);
                        var11.ar(0);
                        ba.tr.ac(var11);
                        var4.ab = var11;
                        var4.ap = (-2023795085 * var4.al + (int)(Math.random() * (double)(770681291 * var4.ad - -2023795085 * var4.al))) * 1490311151;
                     }
                  }
               } else {
                  var4.ab.ad(var7);
                  if (!var4.ab.jj()) {
                     var4.ab = null;
                  }
               }
            } else {
               if (var4.ar != null) {
                  ba.tr.ae(var4.ar);
                  var4.ar = null;
               }

               if (var4.ab != null) {
                  ba.tr.ae(var4.ab);
                  var4.ab = null;
               }
            }
         }
      }

   }

   void ae(int var1) {
      try {
         int var2 = this.au * -394161421;
         id var3 = this.az.ad(-333541035);
         if (null != var3) {
            if (var1 == 732184269) {
               throw new IllegalStateException();
            }

            this.au = var3.bo * 1269558455;
            this.af = -724891520 * var3.bv;
            this.at = var3.bt * 1258888832;
            this.al = 22202303 * var3.bq;
            this.ad = var3.bk * 2064203903;
            this.ah = var3.be;
         } else {
            this.au = -1552209467;
            this.af = 0;
            this.at = 0;
            this.al = 0;
            this.ad = 0;
            this.ah = null;
         }

         if (var2 != this.au * -394161421) {
            if (var1 == 732184269) {
               return;
            }

            if (this.ar != null) {
               if (var1 == 732184269) {
                  throw new IllegalStateException();
               }

               ba.tr.ae(this.ar);
               this.ar = null;
            }
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ca.ae(" + ')');
      }
   }

   static void aq() {
      for(ca var0 = (ca)ac.af(); var0 != null; var0 = (ca)ac.au()) {
         if (null != var0.ar) {
            ba.tr.ae(var0.ar);
            var0.ar = null;
         }

         if (var0.ab != null) {
            ba.tr.ae(var0.ab);
            var0.ab = null;
         }
      }

      ac.ac();
   }

   static void af() {
      for(ca var0 = (ca)ac.af(); var0 != null; var0 = (ca)ac.au()) {
         if (null != var0.ar) {
            ba.tr.ae(var0.ar);
            var0.ar = null;
         }

         if (var0.ab != null) {
            ba.tr.ae(var0.ab);
            var0.ab = null;
         }
      }

      ac.ac();
   }

   void at() {
      int var1 = this.au * -394161421;
      id var2 = this.az.ad(-774676304);
      if (null != var2) {
         this.au = var2.bo * 1269558455;
         this.af = -724891520 * var2.bv;
         this.at = var2.bt * 1258888832;
         this.al = 22202303 * var2.bq;
         this.ad = var2.bk * 2064203903;
         this.ah = var2.be;
      } else {
         this.au = -1552209467;
         this.af = 0;
         this.at = 0;
         this.al = 0;
         this.ad = 0;
         this.ah = null;
      }

      if (var1 != this.au * -394161421 && this.ar != null) {
         ba.tr.ae(this.ar);
         this.ar = null;
      }

   }

   void au() {
      int var1 = this.au * -394161421;
      id var2 = this.az.ad(-343877019);
      if (null != var2) {
         this.au = var2.bo * 1269558455;
         this.af = -724891520 * var2.bv;
         this.at = var2.bt * 1258888832;
         this.al = 22202303 * var2.bq;
         this.ad = var2.bk * 2064203903;
         this.ah = var2.be;
      } else {
         this.au = -1552209467;
         this.af = 0;
         this.at = 0;
         this.al = 0;
         this.ad = 0;
         this.ah = null;
      }

      if (var1 != this.au * -394161421 && this.ar != null) {
         ba.tr.ae(this.ar);
         this.ar = null;
      }

   }

   static void ad(int var0, int var1, int var2, int var3) {
      for(ca var4 = (ca)ac.af(); null != var4; var4 = (ca)ac.au()) {
         if (-1 != 1342245910 * var4.au || null != var4.ah) {
            int var5 = 0;
            if (var1 > -172191635 * var4.ax) {
               var5 += var1 - 1075571371 * var4.ax;
            } else if (var1 < var4.ag * 347253749) {
               var5 += var4.ag * 475277647 - var1;
            }

            if (var2 > 2034609099 * var4.aq) {
               var5 += var2 - 1147184549 * var4.aq;
            } else if (var2 < 1834590545 * var4.am) {
               var5 += var4.am * -1532113972 - var2;
            }

            var5 = Math.max(var5 - 779588735, 0);
            if (var5 < var4.af * 1410128111 && re.vt.av((byte)119) != 0 && var0 == -1014282793 * var4.ae) {
               float var6 = var4.at * 11649375 < var4.af * 1410128111 ? Math.min(Math.max((float)(1410128111 * var4.af - var5) / (float)(1410128111 * var4.af - 11649375 * var4.at), 0.0F), 1.0F) : 1.0F;
               int var7 = (int)(var6 * (float)re.vt.av((byte)98));
               if (null == var4.ar) {
                  if (1698032487 * var4.au >= 0) {
                     bi var8 = bi.ac(cy.fv, var4.au * -394161421, 0);
                     if (var8 != null) {
                        bg var9 = var8.ae().ac(av.ty);
                        bq var10 = bq.ag(var9, -1477702322, var7);
                        var10.ar(-1);
                        ba.tr.ac(var10);
                        var4.ar = var10;
                     }
                  }
               } else {
                  var4.ar.ad(var7);
               }

               if (null == var4.ab) {
                  if (var4.ah != null && (var4.ap -= var3 * 83220403) * -8538353 <= 0) {
                     int var12 = (int)(Math.random() * (double)var4.ah.length);
                     bi var13 = bi.ac(cy.fv, var4.ah[var12], 0);
                     if (null != var13) {
                        bg var14 = var13.ae().ac(av.ty);
                        bq var11 = bq.ag(var14, 100, var7);
                        var11.ar(0);
                        ba.tr.ac(var11);
                        var4.ab = var11;
                        var4.ap = (-2023795085 * var4.al + (int)(Math.random() * (double)(770681291 * var4.ad - -2023795085 * var4.al))) * -225652187;
                     }
                  }
               } else {
                  var4.ab.ad(var7);
                  if (!var4.ab.jj()) {
                     var4.ab = null;
                  }
               }
            } else {
               if (var4.ar != null) {
                  ba.tr.ae(var4.ar);
                  var4.ar = null;
               }

               if (var4.ab != null) {
                  ba.tr.ae(var4.ab);
                  var4.ab = null;
               }
            }
         }
      }

   }

   ca() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ca.<init>(" + ')');
      }
   }

   static void al(int var0, int var1, int var2, int var3) {
      for(ca var4 = (ca)ac.af(); null != var4; var4 = (ca)ac.au()) {
         if (-1 != -394161421 * var4.au || null != var4.ah) {
            int var5 = 0;
            if (var1 > -172191635 * var4.ax) {
               var5 += var1 - -172191635 * var4.ax;
            } else if (var1 < var4.ag * 475277647) {
               var5 += var4.ag * 475277647 - var1;
            }

            if (var2 > -1015866851 * var4.aq) {
               var5 += var2 - -1015866851 * var4.aq;
            } else if (var2 < 1834590545 * var4.am) {
               var5 += var4.am * 1834590545 - var2;
            }

            var5 = Math.max(var5 - 64, 0);
            if (var5 < var4.af * 1410128111 && re.vt.av((byte)80) != 0 && var0 == -1014282793 * var4.ae) {
               float var6 = var4.at * 11649375 < var4.af * 1410128111 ? Math.min(Math.max((float)(1410128111 * var4.af - var5) / (float)(1410128111 * var4.af - 11649375 * var4.at), 0.0F), 1.0F) : 1.0F;
               int var7 = (int)(var6 * (float)re.vt.av((byte)103));
               if (null == var4.ar) {
                  if (-394161421 * var4.au >= 0) {
                     bi var8 = bi.ac(cy.fv, var4.au * -394161421, 0);
                     if (var8 != null) {
                        bg var9 = var8.ae().ac(av.ty);
                        bq var10 = bq.ag(var9, 100, var7);
                        var10.ar(-1);
                        ba.tr.ac(var10);
                        var4.ar = var10;
                     }
                  }
               } else {
                  var4.ar.ad(var7);
               }

               if (null == var4.ab) {
                  if (var4.ah != null && (var4.ap -= var3 * 1490311151) * -8538353 <= 0) {
                     int var12 = (int)(Math.random() * (double)var4.ah.length);
                     bi var13 = bi.ac(cy.fv, var4.ah[var12], 0);
                     if (null != var13) {
                        bg var14 = var13.ae().ac(av.ty);
                        bq var11 = bq.ag(var14, 100, var7);
                        var11.ar(0);
                        ba.tr.ac(var11);
                        var4.ab = var11;
                        var4.ap = (-2023795085 * var4.al + (int)(Math.random() * (double)(770681291 * var4.ad - -2023795085 * var4.al))) * 1490311151;
                     }
                  }
               } else {
                  var4.ab.ad(var7);
                  if (!var4.ab.jj()) {
                     var4.ab = null;
                  }
               }
            } else {
               if (var4.ar != null) {
                  ba.tr.ae(var4.ar);
                  var4.ar = null;
               }

               if (var4.ab != null) {
                  ba.tr.ae(var4.ab);
                  var4.ab = null;
               }
            }
         }
      }

   }

   void ar() {
      int var1 = this.au * -394161421;
      id var2 = this.az.ad(793055512);
      if (null != var2) {
         this.au = var2.bo * 1269558455;
         this.af = -724891520 * var2.bv;
         this.at = var2.bt * 1258888832;
         this.al = 22202303 * var2.bq;
         this.ad = var2.bk * 2064203903;
         this.ah = var2.be;
      } else {
         this.au = -1552209467;
         this.af = 0;
         this.at = 0;
         this.al = 0;
         this.ad = 0;
         this.ah = null;
      }

      if (var1 != this.au * -394161421 && this.ar != null) {
         ba.tr.ae(this.ar);
         this.ar = null;
      }

   }
}
