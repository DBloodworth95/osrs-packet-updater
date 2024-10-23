public class ia extends tr {
   public int af;
   public static ml ae = new ml(64);
   public static po ac;
   public int am = 1661660673;
   public boolean ax = true;
   public int aq = -1725175651;
   public int ag = 0;
   public int ar;
   public int au;
   public int at;
   public int al;
   public int ad;
   static final int cu = 71;
   static byte[][] jw;
   public static final int aj = 20;

   void ah(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0D;
      double var4 = (double)(var1 >> 8 & 255) / 256.0D;
      double var6 = (double)(var1 & 255) / 256.0D;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var10 + var8) / 2.0D;
      if (var10 != var8) {
         if (var16 < 0.5D) {
            var14 = (var10 - var8) / (var8 + var10);
         }

         if (var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if (var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = (var6 - var2) / (var10 - var8) + 2.0D;
         } else if (var10 == var6) {
            var12 = 4.0D + (var2 - var4) / (var10 - var8);
         }
      }

      var12 /= 6.0D;
      this.af = (int)(256.0D * var12) * -694040835;
      this.at = -218285200 * (int)(var14 * 256.0D);
      this.au = -1063994605 * (int)(256.0D * var16);
      if (this.at * 1155509615 < 0) {
         this.at = 0;
      } else if (1155509615 * this.at > 255) {
         this.at = 1000291697;
      }

      if (1570391835 * this.au < 0) {
         this.au = 0;
      } else if (this.au * -1847195586 > -1650104842) {
         this.au = -735684627;
      }

   }

   public void ac(int var1) {
      try {
         if (-1 != this.aq * -1193926069) {
            if (var1 <= 85454617) {
               return;
            }

            this.am(-1193926069 * this.aq, -1847580775);
            this.ar = this.af * -549746245;
            this.al = -66105795 * this.at;
            this.ad = this.au * 766374151;
         }

         this.am(this.ag * 1679504163, 686929054);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ia.ac(" + ')');
      }
   }

   public void aq() {
      if (-1 != this.aq * -596465838) {
         this.am(-1901988441 * this.aq, -1515276593);
         this.ar = this.af * 866557107;
         this.al = -66105795 * this.at;
         this.ad = this.au * 766374151;
      }

      this.am(this.ag * 1679504163, -1087534582);
   }

   void ag(vf var1, int var2, int var3, int var4) {
      try {
         if (var2 == 1) {
            if (var4 != -1187465059) {
               throw new IllegalStateException();
            }

            this.ag = var1.cc(-496961611) * -774269813;
         } else if (var2 == 2) {
            if (var4 != -1187465059) {
               return;
            }

            this.am = var1.cv(952452697) * -1661660673;
         } else if (5 == var2) {
            this.ax = false;
         } else if (7 == var2) {
            this.aq = var1.cc(-1165363795) * 1725175651;
         } else if (8 == var2) {
         }

      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ia.ag(" + ')');
      }
   }

   void am(int var1, int var2) {
      try {
         double var3 = (double)(var1 >> 16 & 255) / 256.0D;
         double var5 = (double)(var1 >> 8 & 255) / 256.0D;
         double var7 = (double)(var1 & 255) / 256.0D;
         double var9 = var3;
         if (var5 < var3) {
            if (var2 == -1024308874) {
               throw new IllegalStateException();
            }

            var9 = var5;
         }

         if (var7 < var9) {
            if (var2 == -1024308874) {
               throw new IllegalStateException();
            }

            var9 = var7;
         }

         double var11 = var3;
         if (var5 > var3) {
            if (var2 == -1024308874) {
               throw new IllegalStateException();
            }

            var11 = var5;
         }

         if (var7 > var11) {
            if (var2 == -1024308874) {
               throw new IllegalStateException();
            }

            var11 = var7;
         }

         double var13 = 0.0D;
         double var15 = 0.0D;
         double var17 = (var11 + var9) / 2.0D;
         if (var11 != var9) {
            if (var17 < 0.5D) {
               if (var2 == -1024308874) {
                  throw new IllegalStateException();
               }

               var15 = (var11 - var9) / (var9 + var11);
            }

            if (var17 >= 0.5D) {
               var15 = (var11 - var9) / (2.0D - var11 - var9);
            }

            if (var3 == var11) {
               if (var2 == -1024308874) {
                  throw new IllegalStateException();
               }

               var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
               if (var2 == -1024308874) {
                  throw new IllegalStateException();
               }

               var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var11 == var7) {
               if (var2 == -1024308874) {
                  throw new IllegalStateException();
               }

               var13 = 4.0D + (var3 - var5) / (var11 - var9);
            }
         }

         var13 /= 6.0D;
         this.af = (int)(256.0D * var13) * -694040835;
         this.at = 1991397775 * (int)(var15 * 256.0D);
         this.au = -1063994605 * (int)(256.0D * var17);
         if (this.at * 1155509615 < 0) {
            this.at = 0;
         } else if (1155509615 * this.at > 255) {
            if (var2 == -1024308874) {
               throw new IllegalStateException();
            }

            this.at = 1000291697;
         }

         if (1570391835 * this.au < 0) {
            if (var2 == -1024308874) {
               throw new IllegalStateException();
            }

            this.au = 0;
         } else if (this.au * 1570391835 > 255) {
            this.au = -735684627;
         }

      } catch (RuntimeException var19) {
         throw vk.ae(var19, "ia.am(" + ')');
      }
   }

   public void ax() {
      if (-1 != this.aq * -1930083880) {
         this.am(-1193926069 * this.aq, -122648595);
         this.ar = this.af * -524877809;
         this.al = 1407299890 * this.at;
         this.ad = this.au * -1359626206;
      }

      this.am(this.ag * 1679504163, 1646825438);
   }

   public void ar(vf var1, int var2) {
      while(true) {
         int var3 = var1.cv(952452697);
         if (var3 == 0) {
            return;
         }

         this.ag(var1, var3, var2, -1187465059);
      }
   }

   public void ae(vf var1, int var2, byte var3) {
      try {
         while(true) {
            int var4 = var1.cv(952452697);
            if (var4 == 0) {
               if (var3 != 0) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.ag(var1, var4, var2, -1187465059);
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ia.ae(" + ')');
      }
   }

   public void at() {
      if (-1 != this.aq * -1193926069) {
         this.am(-1193926069 * this.aq, -1137831932);
         this.ar = this.af * -549746245;
         this.al = -66105795 * this.at;
         this.ad = this.au * 766374151;
      }

      this.am(this.ag * 1679504163, 1404282560);
   }

   public void au(vf var1, int var2) {
      while(true) {
         int var3 = var1.cv(952452697);
         if (var3 == 0) {
            return;
         }

         this.ag(var1, var3, var2, -1187465059);
      }
   }

   public void af() {
      if (-1 != this.aq * -1193926069) {
         this.am(-1193926069 * this.aq, -3499398);
         this.ar = this.af * -549746245;
         this.al = -66105795 * this.at;
         this.ad = this.au * 766374151;
      }

      this.am(this.ag * 1679504163, -2018353826);
   }

   void al(vf var1, int var2, int var3) {
      if (var2 == 1) {
         this.ag = var1.cc(-2068756523) * -774269813;
      } else if (var2 == 2) {
         this.am = var1.cv(952452697) * -1661660673;
      } else if (5 == var2) {
         this.ax = false;
      } else if (7 == var2) {
         this.aq = var1.cc(-11717729) * 347984747;
      } else if (8 == var2) {
      }

   }

   void ad(vf var1, int var2, int var3) {
      if (var2 == 1) {
         this.ag = var1.cc(-1301724231) * 205743200;
      } else if (var2 == 2) {
         this.am = var1.cv(952452697) * -1661660673;
      } else if (5 == var2) {
         this.ax = false;
      } else if (7 == var2) {
         this.aq = var1.cc(-1802829597) * 1725175651;
      } else if (8 == var2) {
      }

   }

   static void po(byte[] var0, int var1, int var2) {
      try {
         if (null == client.hh) {
            client.hh = new byte[24];
         }

         rq.ac(var0, var1, client.hh, 0, 24);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ia.po(" + ')');
      }
   }

   void ap(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0D;
      double var4 = (double)(var1 >> 8 & 255) / 256.0D;
      double var6 = (double)(var1 & 255) / 256.0D;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var10 + var8) / 2.0D;
      if (var10 != var8) {
         if (var16 < 0.5D) {
            var14 = (var10 - var8) / (var8 + var10);
         }

         if (var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if (var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = (var6 - var2) / (var10 - var8) + 2.0D;
         } else if (var10 == var6) {
            var12 = 4.0D + (var2 - var4) / (var10 - var8);
         }
      }

      var12 /= 6.0D;
      this.af = (int)(256.0D * var12) * -694040835;
      this.at = 1991397775 * (int)(var14 * 256.0D);
      this.au = -1063994605 * (int)(256.0D * var16);
      if (this.at * 1155509615 < 0) {
         this.at = 0;
      } else if (1155509615 * this.at > 255) {
         this.at = 1000291697;
      }

      if (1570391835 * this.au < 0) {
         this.au = 0;
      } else if (this.au * 1570391835 > 255) {
         this.au = -735684627;
      }

   }

   public static void ac(String var0, boolean var1, boolean var2, int var3) {
      try {
         bo.ae(var0, var1, "openjs", var2, -709662873);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ia.ac(" + ')');
      }
   }

   static final void oa(int var0, int var1, int var2, int var3, vv var4, nl var5, int var6) {
      try {
         if (null != var4) {
            int var7 = 1933903023 * client.ky & 2047;
            int var8 = var2 * var2 + var3 * var3;
            if (var8 > 6400) {
               if (var6 >= -979270957) {
                  throw new IllegalStateException();
               }
            } else {
               int var9 = jw.am[var7];
               int var10 = jw.ax[var7];
               int var11 = var9 * var3 + var10 * var2 >> 16;
               int var12 = var10 * var3 - var2 * var9 >> 16;
               if (var8 > 2500) {
                  if (var6 >= -979270957) {
                     throw new IllegalStateException();
                  }

                  var4.bd(var5.ac * 1964693849 / 2 + var11 - var4.aq / 2, var5.ae * -1729230849 / 2 - var12 - var4.af / 2, var0, var1, 1964693849 * var5.ac, var5.ae * -1729230849, var5.am, var5.ag);
               } else {
                  var4.ah(var11 + 1964693849 * var5.ac / 2 + var0 - var4.aq / 2, var5.ae * -1729230849 / 2 + var1 - var12 - var4.af / 2);
               }

            }
         }
      } catch (RuntimeException var13) {
         throw vk.ae(var13, "ia.oa(" + ')');
      }
   }

   static double ap(int var0, int var1, int var2, int var3) {
      try {
         double var10000;
         if (var1 > 0) {
            if (var3 == -665072939) {
               throw new IllegalStateException();
            }

            var10000 = (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1));
         } else {
            var10000 = 1.0D;
         }

         double var4 = var10000;
         if (!(var4 <= 0.0D)) {
            if (var3 == -665072939) {
               throw new IllegalStateException();
            }

            if (!(var4 >= 1.0D)) {
               double var6;
               double var8;
               switch(var2) {
               case 0:
                  return var4;
               case 1:
                  return 1.0D - Math.cos(3.141592653589793D * var4 / 2.0D);
               case 2:
                  return Math.sin(var4 * 3.141592653589793D / 2.0D);
               case 3:
                  return -(Math.cos(var4 * 3.141592653589793D) - 1.0D) / 2.0D;
               case 4:
                  return var4 * var4;
               case 5:
                  return 1.0D - (1.0D - var4) * (1.0D - var4);
               case 6:
                  if (var4 < 0.5D) {
                     if (var3 == -665072939) {
                        throw new IllegalStateException();
                     }

                     var10000 = var4 * 2.0D * var4;
                  } else {
                     var10000 = 1.0D - Math.pow(2.0D + -2.0D * var4, 2.0D) / 2.0D;
                  }

                  return var10000;
               case 7:
                  return var4 * var4 * var4;
               case 8:
                  return 1.0D - Math.pow(1.0D - var4, 3.0D);
               case 9:
                  return var4 < 0.5D ? var4 * var4 * 4.0D * var4 : 1.0D - Math.pow(2.0D + -2.0D * var4, 3.0D) / 2.0D;
               case 10:
                  return var4 * var4 * var4 * var4;
               case 11:
                  return 1.0D - Math.pow(1.0D - var4, 4.0D);
               case 12:
                  if (var4 < 0.5D) {
                     if (var3 == -665072939) {
                        throw new IllegalStateException();
                     }

                     var10000 = var4 * 8.0D * var4 * var4 * var4;
                  } else {
                     var10000 = 1.0D - Math.pow(var4 * -2.0D + 2.0D, 4.0D) / 2.0D;
                  }

                  return var10000;
               case 13:
                  return var4 * var4 * var4 * var4 * var4;
               case 14:
                  return 1.0D - Math.pow(1.0D - var4, 5.0D);
               case 15:
                  if (var4 < 0.5D) {
                     if (var3 == -665072939) {
                        throw new IllegalStateException();
                     }

                     var10000 = var4 * var4 * 8.0D * var4 * var4 * var4;
                  } else {
                     var10000 = 1.0D - Math.pow(var4 * -2.0D + 2.0D, 5.0D) / 2.0D;
                  }

                  return var10000;
               case 16:
                  return Math.pow(2.0D, 10.0D * var4 - 10.0D);
               case 17:
                  return 1.0D - Math.pow(2.0D, var4 * -10.0D);
               case 18:
                  return var4 < 0.5D ? Math.pow(2.0D, 20.0D * var4 + 10.0D) / 2.0D : (2.0D - Math.pow(2.0D, var4 * -20.0D + 10.0D)) / 2.0D;
               case 19:
                  return 1.0D - Math.sqrt(1.0D - Math.pow(var4, 2.0D));
               case 20:
                  return Math.sqrt(1.0D - Math.pow(var4 - 1.0D, 2.0D));
               case 21:
                  if (var4 < 0.5D) {
                     if (var3 == -665072939) {
                        throw new IllegalStateException();
                     }

                     var10000 = (1.0D - Math.sqrt(1.0D - Math.pow(var4 * 2.0D, 2.0D))) / 2.0D;
                  } else {
                     var10000 = (Math.sqrt(1.0D - Math.pow(2.0D + var4 * -2.0D, 2.0D)) + 1.0D) / 2.0D;
                  }

                  return var10000;
               case 22:
                  var6 = 1.70158D;
                  var8 = 2.70158D;
                  return var4 * 2.70158D * var4 * var4 - var4 * 1.70158D * var4;
               case 23:
                  var6 = 1.70158D;
                  var8 = 2.70158D;
                  return 1.0D + 2.70158D * Math.pow(var4 - 1.0D, 3.0D) + 1.70158D * Math.pow(var4 - 1.0D, 2.0D);
               case 24:
                  var6 = 1.70158D;
                  var8 = 2.5949095D;
                  if (var4 < 0.5D) {
                     if (var3 == -665072939) {
                        throw new IllegalStateException();
                     }

                     var10000 = Math.pow(var4 * 2.0D, 2.0D) * (var4 * 7.189819D - 2.5949095D) / 2.0D;
                  } else {
                     var10000 = (Math.pow(var4 * 2.0D - 2.0D, 2.0D) * (2.5949095D + (var4 * 2.0D - 2.0D) * 3.5949095D) + 2.0D) / 2.0D;
                  }

                  return var10000;
               case 25:
                  var6 = 2.0943951023931953D;
                  return -Math.pow(2.0D, var4 * 10.0D - 10.0D) * Math.sin((10.0D * var4 - 10.75D) * 2.0943951023931953D);
               case 26:
                  var6 = 2.0943951023931953D;
                  return Math.pow(2.0D, -10.0D * var4) * Math.sin((10.0D * var4 - 0.75D) * 2.0943951023931953D) + 1.0D;
               case 27:
                  var6 = 1.3962634015954636D;
                  var8 = Math.sin((20.0D * var4 - 11.125D) * 1.3962634015954636D);
                  if (var4 < 0.5D) {
                     if (var3 == -665072939) {
                        throw new IllegalStateException();
                     }

                     var10000 = -(Math.pow(2.0D, var4 * 20.0D - 10.0D) * var8) / 2.0D;
                  } else {
                     var10000 = Math.pow(2.0D, 10.0D + var4 * -20.0D) * var8 / 2.0D + 1.0D;
                  }

                  return var10000;
               default:
                  return var4;
               }
            }

            if (var3 == -665072939) {
               throw new IllegalStateException();
            }
         }

         if (var4 <= 0.0D) {
            if (var3 == -665072939) {
               throw new IllegalStateException();
            }

            var10000 = 0.0D;
         } else {
            var10000 = 1.0D;
         }

         return var10000;
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "ia.ap(" + ')');
      }
   }
}
