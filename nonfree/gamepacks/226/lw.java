import java.util.ArrayList;
import java.util.Iterator;

public class lw implements lv {
   int ap;
   int as;
   int ak;
   int am;
   int ai;
   int ay;
   int aj;
   int aw;
   int ae;
   int at;
   int au;
   int an;
   int ao;
   int af;

   public void al(vl var1) {
      this.ap = var1.cy((short)-15582) * 2069019993;
      this.aw = var1.cy((short)-9882) * -1268226855;
      this.ak = var1.ce(1824663202) * 872107593;
      this.as = var1.cy((short)-22788) * 429337445;
      this.am = var1.cy((short)-28815) * 154339091;
      this.aj = var1.ce(1918984806) * 1057760891;
      this.ae = var1.cy((short)-9366) * -809739563;
      this.at = var1.cy((short)-18270) * 1918480021;
      this.ai = var1.ce(1034463254) * -752586273;
      this.au = var1.cy((short)-23003) * 1541018289;
      this.ao = var1.cy((short)-16161) * -225362817;
      this.ay = var1.ce(156287050) * -340269311;
      this.an = var1.cy((short)-6096) * 1488906845;
      this.af = var1.cy((short)-31103) * -1014643381;
      this.as(-605233635);
   }

   public void ap(kp var1, int var2) {
      try {
         if (var1.ae * 1204722533 > this.ai * 1699514911) {
            var1.ae = this.ai * -1214484173;
         }

         if (var1.am * 1248469631 < 1699514911 * this.ai) {
            var1.am = -1975613343 * this.ai;
         }

         if (-1455208789 * var1.at > this.ay * 800659713) {
            if (var2 >= -813620077) {
               return;
            }

            var1.at = 358731523 * this.ay;
         }

         if (-1829665407 * var1.au < this.ay * 800659713) {
            if (var2 >= -813620077) {
               return;
            }

            var1.au = this.ay * 1270633345;
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "lw.ap(" + ')');
      }
   }

   public boolean aw(int var1, int var2, int var3, int var4) {
      try {
         if (var1 >= -432555287 * this.ap) {
            if (var4 >= 1414077602) {
               throw new IllegalStateException();
            }

            if (var1 < -432555287 * this.ap + this.aw * -1265509527) {
               boolean var10000;
               if (var2 >= (561382393 * this.ak << 6) + (this.as * -460910995 << 3)) {
                  if (var4 >= 1414077602) {
                     throw new IllegalStateException();
                  }

                  if (var2 <= 7 + (978049819 * this.am << 3) + (this.ak * 561382393 << 6)) {
                     if (var4 >= 1414077602) {
                        throw new IllegalStateException();
                     }

                     if (var3 >= (this.aj * 453232819 << 6) + (this.ae * 466620029 << 3)) {
                        if (var4 >= 1414077602) {
                           throw new IllegalStateException();
                        }

                        if (var3 <= (-1895387971 * this.at << 3) + (this.aj * 453232819 << 6) + 7) {
                           if (var4 >= 1414077602) {
                              throw new IllegalStateException();
                           }

                           var10000 = true;
                           return var10000;
                        }
                     }
                  }
               }

               var10000 = false;
               return var10000;
            }

            if (var4 >= 1414077602) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "lw.aw(" + ')');
      }
   }

   public boolean ak(int var1, int var2, byte var3) {
      try {
         boolean var10000;
         if (var1 >= (this.au * -1591019951 << 3) + (this.ai * 1699514911 << 6) && var1 <= 7 + (this.ao * -1593670785 << 3) + (this.ai * 1699514911 << 6)) {
            if (var3 >= 4) {
               throw new IllegalStateException();
            }

            if (var2 >= (this.ay * 800659713 << 6) + (this.an * -136889867 << 3)) {
               if (var3 >= 4) {
                  throw new IllegalStateException();
               }

               if (var2 <= (800659713 * this.ay << 6) + (this.af * -180249501 << 3) + 7) {
                  if (var3 >= 4) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
                  return var10000;
               }
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "lw.ak(" + ')');
      }
   }

   public int[] aj(int var1, int var2, int var3, byte var4) {
      try {
         if (!this.aw(var1, var2, var3, -1160671965)) {
            return null;
         } else {
            int[] var5 = new int[]{156742280 * this.au - 607679336 * this.as + this.ai * 1394771904 - this.ak * 1568734784 + var2, this.ay * -297385920 - this.aj * -1057870656 + var3 + (this.an * -1095118936 - this.ae * -562007064)};
            return var5;
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "lw.aj(" + ')');
      }
   }

   static void hi(iu var0, int var1, int var2, int var3, boolean var4, byte var5) {
      try {
         if (client.ty * -230015913 >= 50) {
            if (var5 != 1) {
               throw new IllegalStateException();
            }
         } else {
            if (var0.an != null) {
               if (var5 != 1) {
                  throw new IllegalStateException();
               }

               if (var0.an.containsKey(var1)) {
                  ArrayList var6 = (ArrayList)var0.an.get(var1);
                  if (var6.isEmpty()) {
                     return;
                  }

                  int var7 = 0;
                  int var9;
                  if (var6.size() > 1) {
                     if (var5 != 1) {
                        throw new IllegalStateException();
                     }

                     int var8 = 1 + (int)(Math.random() * 100.0D);
                     var9 = 0;

                     for(Iterator var10 = var6.iterator(); var10.hasNext(); ++var7) {
                        if (var5 != 1) {
                           throw new IllegalStateException();
                        }

                        ih var11 = (ih)var10.next();
                        int var12 = var9;
                        var9 += var11.aw * 2126449793;
                        if (var12 <= var8 && var8 < var9) {
                           if (var5 != 1) {
                              throw new IllegalStateException();
                           }
                           break;
                        }
                     }

                     if (var7 >= var6.size()) {
                        return;
                     }
                  }

                  ih var17 = (ih)var6.get(var7);
                  var9 = -990836461 * var17.aj & 31;
                  if (var9 > 0) {
                     if (var5 != 1) {
                        throw new IllegalStateException();
                     }

                     if (io.vx.ax(-286628425) == 0) {
                        return;
                     }
                  }

                  if (0 == var9) {
                     if (var5 != 1) {
                        throw new IllegalStateException();
                     }

                     if (io.vx.ac(73717927) == 0) {
                        if (var5 != 1) {
                           throw new IllegalStateException();
                        }

                        return;
                     }
                  }

                  if (null != var17) {
                     if (var17.aj * -990836461 == 0) {
                        if (var5 != 1) {
                           throw new IllegalStateException();
                        }

                        if (!var4) {
                           return;
                        }

                        client.tc[-230015913 * client.ty] = 0;
                     } else {
                        int var14 = (var2 - 64) / 128;
                        int var15 = (var3 - 64) / 128;
                        client.tc[-230015913 * client.ty] = (var15 << 8) + (var14 << 16) + -990836461 * var17.aj;
                     }

                     client.tm[client.ty * -230015913] = var17.ap * -1433508117;
                     client.tn[-230015913 * client.ty] = 889749475 * var17.ak;
                     client.tp[-230015913 * client.ty] = 0;
                     client.tb[client.ty * -230015913] = null;
                     client.td[-230015913 * client.ty] = 1484326055 * var17.ai;
                     client.ty += 1355312999;
                  }

                  return;
               }
            }

         }
      } catch (RuntimeException var16) {
         throw tm.aw(var16, "lw.hi(" + ')');
      }
   }

   public void ay(vl var1, int var2) {
      try {
         this.ap = var1.cy((short)-26195) * 2069019993;
         this.aw = var1.cy((short)-1015) * -1268226855;
         this.ak = var1.ce(1571818292) * 872107593;
         this.as = var1.cy((short)-25540) * 429337445;
         this.am = var1.cy((short)-16817) * 154339091;
         this.aj = var1.ce(153395346) * 1057760891;
         this.ae = var1.cy((short)-15002) * -809739563;
         this.at = var1.cy((short)-17323) * 1918480021;
         this.ai = var1.ce(1022602839) * -752586273;
         this.au = var1.cy((short)-7328) * 1541018289;
         this.ao = var1.cy((short)-31284) * -225362817;
         this.ay = var1.ce(1565898984) * -340269311;
         this.an = var1.cy((short)-28793) * 1488906845;
         this.af = var1.cy((short)-25035) * -1014643381;
         this.as(-1587677171);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "lw.ay(" + ')');
      }
   }

   public boolean au(int var1, int var2, int var3) {
      if (var1 >= -432555287 * this.ap && var1 < -432555287 * this.ap + this.aw * -1265509527) {
         return var2 >= (561382393 * this.ak << 6) + (this.as * -460910995 << 3) && var2 <= 7 + (978049819 * this.am << 3) + (this.ak * 561382393 << 6) && var3 >= (this.aj * 453232819 << 6) + (this.ae * 466620029 << 3) && var3 <= (-1895387971 * this.at << 3) + (this.aj * 453232819 << 6) + 7;
      } else {
         return false;
      }
   }

   public nn ai(int var1, int var2, int var3) {
      try {
         if (!this.ak(var1, var2, (byte)-125)) {
            if (var3 != -246633808) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var4 = 607679336 * this.as - 156742280 * this.au + 1568734784 * this.ak - 1394771904 * this.ai + var1;
            int var5 = -1057870656 * this.aj - this.ay * -297385920 + var2 + (this.ae * -562007064 - -1095118936 * this.an);
            return new nn(this.ap * -432555287, var4, var5);
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "lw.ai(" + ')');
      }
   }

   public void am(kp var1) {
      if (var1.ae * 735119506 > this.ai * -1209496786) {
         var1.ae = this.ai * 1249230081;
      }

      if (var1.am * -1479987673 < 1699514911 * this.ai) {
         var1.am = 217322323 * this.ai;
      }

      if (-1455208789 * var1.at > this.ay * -895422869) {
         var1.at = 358731523 * this.ay;
      }

      if (-1829665407 * var1.au < this.ay * 800659713) {
         var1.au = this.ay * 1270633345;
      }

   }

   public void at(kp var1) {
      if (var1.ae * 1204722533 > this.ai * 1699514911) {
         var1.ae = this.ai * -1358947707;
      }

      if (var1.am * 1248469631 < 1699514911 * this.ai) {
         var1.am = -1975613343 * this.ai;
      }

      if (566764904 * var1.at > this.ay * 985166319) {
         var1.at = 1929989726 * this.ay;
      }

      if (1331478110 * var1.au < this.ay * 800659713) {
         var1.au = this.ay * 1270633345;
      }

   }

   static final void jm(int var0, int var1, int var2, int var3, int var4) {
      try {
         si.jw((byte)107);
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "lw.jm(" + ')');
      }
   }

   lw() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "lw.<init>(" + ')');
      }
   }

   public boolean ao(int var1, int var2, int var3) {
      if (var1 >= -432555287 * this.ap && var1 < 909818845 * this.ap + this.aw * 820869427) {
         return var2 >= (561382393 * this.ak << 6) + (this.as * -1058891562 << 3) && var2 <= 7 + (1934975528 * this.am << 3) + (this.ak * 1013742229 << 6) && var3 >= (this.aj * 453232819 << 6) + (this.ae * 1694357656 << 3) && var3 <= (-1895387971 * this.at << 3) + (this.aj * 453232819 << 6) + 7;
      } else {
         return false;
      }
   }

   public nn ax(int var1, int var2) {
      if (!this.ak(var1, var2, (byte)-42)) {
         return null;
      } else {
         int var3 = 607679336 * this.as - 156742280 * this.au + 1568734784 * this.ak - 1394771904 * this.ai + var1;
         int var4 = 2068056311 * this.aj - this.ay * -1233405319 + var2 + (this.ae * 84828395 - 238235400 * this.an);
         return new nn(this.ap * -806589182, var3, var4);
      }
   }

   public boolean ar(int var1, int var2) {
      return var1 >= (this.au * -1240769759 << 3) + (this.ai * 1699514911 << 6) && var1 <= 7 + (this.ao * -404579705 << 3) + (this.ai * 1699514911 << 6) && var2 >= (this.ay * 800659713 << 6) + (this.an * -1101740758 << 3) && var2 <= (800659713 * this.ay << 6) + (this.af * 872068955 << 3) + 7;
   }

   public int[] ab(int var1, int var2, int var3) {
      if (!this.aw(var1, var2, var3, 215298568)) {
         return null;
      } else {
         int[] var4 = new int[]{156742280 * this.au - 607679336 * this.as + this.ai * 1394771904 - this.ak * 1568734784 + var2, this.ay * -297385920 - this.aj * -1057870656 + var3 + (this.an * -1095118936 - this.ae * -562007064)};
         return var4;
      }
   }

   public void ae(kp var1) {
      if (var1.ae * 1204722533 > this.ai * 1699514911) {
         var1.ae = this.ai * -166652282;
      }

      if (var1.am * 824361766 < 1001757886 * this.ai) {
         var1.am = -1039360186 * this.ai;
      }

      if (-657626062 * var1.at > this.ay * 1858210108) {
         var1.at = 358731523 * this.ay;
      }

      if (1205817593 * var1.au < this.ay * 895274647) {
         var1.au = this.ay * 1270633345;
      }

   }

   public int[] ag(int var1, int var2, int var3) {
      if (!this.aw(var1, var2, var3, -1143711748)) {
         return null;
      } else {
         int[] var4 = new int[]{720382805 * this.au - -427988413 * this.as + this.ai * 1394771904 - this.ak * -2024961272 + var2, this.ay * -297385920 - this.aj * -316267302 + var3 + (this.an * -599922336 - this.ae * -562007064)};
         return var4;
      }
   }

   public nn ad(int var1, int var2) {
      if (!this.ak(var1, var2, (byte)-6)) {
         return null;
      } else {
         int var3 = 607679336 * this.as - 156742280 * this.au + 1568734784 * this.ak - 1394771904 * this.ai + var1;
         int var4 = -1057870656 * this.aj - this.ay * -297385920 + var2 + (this.ae * -562007064 - -1095118936 * this.an);
         return new nn(this.ap * -432555287, var3, var4);
      }
   }

   public nn ac(int var1, int var2) {
      if (!this.ak(var1, var2, (byte)-80)) {
         return null;
      } else {
         int var3 = 607679336 * this.as - 1067105 * this.au + 1568734784 * this.ak - 1394771904 * this.ai + var1;
         int var4 = 184204650 * this.aj - this.ay * -297385920 + var2 + (this.ae * -562007064 - 474038846 * this.an);
         return new nn(this.ap * 1950736858, var3, var4);
      }
   }

   public int[] az(int var1, int var2, int var3) {
      if (!this.aw(var1, var2, var3, -1675518295)) {
         return null;
      } else {
         int[] var4 = new int[]{-1779283746 * this.au - 1386234168 * this.as + this.ai * 1822746894 - this.ak * 1568734784 + var2, this.ay * -297385920 - this.aj * -1057870656 + var3 + (this.an * -1095118936 - this.ae * -673815774)};
         return var4;
      }
   }

   public boolean af(int var1, int var2) {
      return var1 >= (this.au * 812493248 << 3) + (this.ai * 1218123894 << 6) && var1 <= 7 + (this.ao * 588319982 << 3) + (this.ai * 1699514911 << 6) && var2 >= (this.ay * -1347930666 << 6) + (this.an * -1900238591 << 3) && var2 <= (800659713 * this.ay << 6) + (this.af * -1862406577 << 3) + 7;
   }

   public nn aq(int var1, int var2) {
      if (!this.ak(var1, var2, (byte)-126)) {
         return null;
      } else {
         int var3 = 607679336 * this.as - 156742280 * this.au + 1568734784 * this.ak - 1394771904 * this.ai + var1;
         int var4 = -1057870656 * this.aj - this.ay * -297385920 + var2 + (this.ae * -562007064 - -1095118936 * this.an);
         return new nn(this.ap * -432555287, var3, var4);
      }
   }

   void as(int var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "lw.as(" + ')');
      }
   }

   void aa() {
   }

   static void cl(ng var0, int var1) {
      try {
         var0.br((byte)46);
         var0.bn(-1919645375).bf(new ek(var0), (short)-16967);
         var0.bn(-1919645375).bi(new er(var0), -821306554);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "lw.cl(" + ')');
      }
   }

   public boolean an(int var1, int var2, int var3) {
      if (var1 >= -432555287 * this.ap && var1 < -432555287 * this.ap + this.aw * -1265509527) {
         return var2 >= (561382393 * this.ak << 6) + (this.as * -460910995 << 3) && var2 <= 7 + (978049819 * this.am << 3) + (this.ak * 561382393 << 6) && var3 >= (this.aj * 453232819 << 6) + (this.ae * 466620029 << 3) && var3 <= (-1895387971 * this.at << 3) + (this.aj * 453232819 << 6) + 7;
      } else {
         return false;
      }
   }

   void ah() {
   }

   public nn av(int var1, int var2) {
      if (!this.ak(var1, var2, (byte)-41)) {
         return null;
      } else {
         int var3 = -1294801871 * this.as - 156742280 * this.au + 87965285 * this.ak - 186855772 * this.ai + var1;
         int var4 = -1057870656 * this.aj - this.ay * -297385920 + var2 + (this.ae * -562007064 - -1095118936 * this.an);
         return new nn(this.ap * -432555287, var3, var4);
      }
   }
}
