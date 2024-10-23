import java.util.ArrayList;

public class gf extends fm {
   // $FF: synthetic field
   final fz this$0;
   int ac;
   static final int az = 16;

   void aq(go var1) {
      var1.al(this.ac * -1696521243, 1795529116);
   }

   void ac(vf var1, byte var2) {
      try {
         this.ac = var1.ct(-1358564714) * -1684328069;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "gf.ac(" + ')');
      }
   }

   void ae(go var1, byte var2) {
      try {
         var1.al(this.ac * 1409222067, 1495300006);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "gf.ae(" + ')');
      }
   }

   void ag(vf var1) {
      this.ac = var1.ct(-2010149253) * -1684328069;
   }

   gf(fz var1) {
      try {
         this.this$0 = var1;
         super();
         this.ac = 1684328069;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "gf.<init>(" + ')');
      }
   }

   void ax(vf var1) {
      this.ac = var1.ct(-1994518207) * -1684328069;
   }

   void au(go var1) {
      var1.al(this.ac * 1409222067, 950975119);
   }

   void at(go var1) {
      var1.al(this.ac * 1409222067, 1400787889);
   }

   void am(vf var1) {
      this.ac = var1.ct(-1557192080) * -1684328069;
   }

   void af(go var1) {
      var1.al(this.ac * 1409222067, 2011723894);
   }

   static final void om(int var0, int var1, int var2, int var3, vv var4, nl var5, byte var6) {
      try {
         int var7 = var2 * var2 + var3 * var3;
         if (var7 > 4225 && var7 < 90000) {
            if (var6 <= 31) {
               throw new IllegalStateException();
            }

            int var8 = 1933903023 * client.ky & 2047;
            int var9 = jw.am[var8];
            int var10 = jw.ax[var8];
            int var11 = var10 * var2 + var3 * var9 >> 16;
            int var12 = var3 * var10 - var2 * var9 >> 16;
            double var13 = Math.atan2((double)var11, (double)var12);
            int var15 = 1964693849 * var5.ac / 2 - 25;
            int var16 = (int)(Math.sin(var13) * (double)var15);
            int var17 = (int)(Math.cos(var13) * (double)var15);
            byte var18 = 20;
            go.km.bf(var16 + (var5.ac * 1964693849 / 2 + var0 - var18 / 2), var5.ae * -1729230849 / 2 + var1 - var18 / 2 - var17 - 10, var18, var18, 15, 15, var13, 256);
         } else {
            ia.oa(var0, var1, var2, var3, var4, var5, -2078176087);
         }

      } catch (RuntimeException var19) {
         throw vk.ae(var19, "gf.om(" + ')');
      }
   }

   public static void af(int var0, int var1, int var2, int var3, byte var4) {
      try {
         if (mm.aq.size() > 1) {
            if (var4 <= 8) {
               throw new IllegalStateException();
            }

            if (mm.aq.get(0) != null && ((ns)mm.aq.get(0)).al.ap(1891926304)) {
               if (var4 <= 8) {
                  throw new IllegalStateException();
               }

               if (mm.aq.get(1) != null) {
                  if (var4 <= 8) {
                     throw new IllegalStateException();
                  }

                  if (((ns)mm.aq.get(1)).al.ap(1891926304)) {
                     if (var4 <= 8) {
                        return;
                     }

                     qg.ah(var0, var1, var2, var3, -1742467805);
                     mm.at.add(new qb((ri)null));
                     ArrayList var5 = new ArrayList();
                     var5.add(new rh(new rj((ri)null, 1, false, mm.ah * 94191071), -1026592873 * mm.ad));
                     var5.add(new rh(new rc((ri)null, 0, false, -161512225 * mm.al), mm.ar * -1049602065));
                     mm.at.add(new ru((ri)null, var5));
                     if (mm.af.get(0) != null) {
                        if (var4 <= 8) {
                           return;
                        }

                        if (mm.af.get(1) != null) {
                           if (var4 <= 8) {
                              throw new IllegalStateException();
                           }

                           ns var6 = (ns)mm.af.get(0);
                           mm.af.set(0, mm.aq.get(1));
                           mm.af.set(1, var6);
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var7) {
         throw vk.ae(var7, "gf.af(" + ')');
      }
   }

   public static final void as(int var0, boolean var1, int var2, int var3) {
      try {
         if (var0 >= 8000) {
            if (var0 <= 48000) {
               bz.ax = var0 * 1330600083;
               bz.aq = var1;
               wc.au = var2 * -1365423451;
               return;
            }

            if (var3 <= -1766310987) {
               throw new IllegalStateException();
            }
         }

         throw new IllegalArgumentException();
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "gf.as(" + ')');
      }
   }
}
