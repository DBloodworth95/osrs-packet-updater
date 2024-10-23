import java.util.ArrayList;

public class de extends to {
   public static final int dl = 105;
   int[] ae;
   int[] ag;
   public static final int al = 0;
   static uu ac = new uu(32);
   public static final int cq = 87;

   static int ar(int var0, int var1) {
      de var2 = (de)ac.ac((long)var0);
      if (var2 == null) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var2.ag.length ? var2.ag[var1] : 0;
      }
   }

   static int au(int var0, int var1) {
      de var2 = (de)ac.ac((long)var0);
      if (var2 == null) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var2.ag.length ? var2.ag[var1] : 0;
      }
   }

   de() {
      try {
         super();
         this.ae = new int[]{-1};
         this.ag = new int[]{0};
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "de.<init>(" + ')');
      }
   }

   static int at(int var0, int var1) {
      de var2 = (de)ac.ac((long)var0);
      if (null == var2) {
         return -1;
      } else {
         return var1 >= 0 && var1 < var2.ae.length ? var2.ae[var1] : -1;
      }
   }

   static void aj(int var0) {
      de var1 = (de)ac.ac((long)var0);
      if (null != var1) {
         var1.jb();
      }
   }

   static int af(int var0, int var1) {
      de var2 = (de)ac.ac((long)var0);
      if (null == var2) {
         return -1;
      } else {
         return var1 >= 0 && var1 < var2.ae.length ? var2.ae[var1] : -1;
      }
   }

   static void av(int var0) {
      de var1 = (de)ac.ac((long)var0);
      if (null != var1) {
         var1.jb();
      }
   }

   static int ad(int var0, int var1) {
      de var2 = (de)ac.ac((long)var0);
      if (var2 == null) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var2.ag.length ? var2.ag[var1] : 0;
      }
   }

   static int ah(int var0, int var1) {
      de var2 = (de)ac.ac((long)var0);
      if (var2 == null) {
         return 0;
      } else if (-1 == var1) {
         return 0;
      } else {
         int var3 = 0;

         for(int var4 = 0; var4 < var2.ag.length; ++var4) {
            if (var2.ae[var4] == var1) {
               var3 += var2.ag[var4];
            }
         }

         return var3;
      }
   }

   static int ap(int var0, int var1) {
      de var2 = (de)ac.ac((long)var0);
      if (var2 == null) {
         return 0;
      } else if (-1 == var1) {
         return 0;
      } else {
         int var3 = 0;

         for(int var4 = 0; var4 < var2.ag.length; ++var4) {
            if (var2.ae[var4] == var1) {
               var3 += var2.ag[var4];
            }
         }

         return var3;
      }
   }

   static void ab(int var0, int var1, int var2, int var3) {
      de var4 = (de)ac.ac((long)var0);
      if (null == var4) {
         var4 = new de();
         ac.ag(var4, (long)var0);
      }

      if (var4.ae.length <= var1) {
         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[var1 + 1];

         int var7;
         for(var7 = 0; var7 < var4.ae.length; ++var7) {
            var5[var7] = var4.ae[var7];
            var6[var7] = var4.ag[var7];
         }

         for(var7 = var4.ae.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.ae = var5;
         var4.ag = var6;
      }

      var4.ae[var1] = var2;
      var4.ag[var1] = var3;
   }

   static void az(int var0, int var1, int var2, int var3) {
      de var4 = (de)ac.ac((long)var0);
      if (null == var4) {
         var4 = new de();
         ac.ag(var4, (long)var0);
      }

      if (var4.ae.length <= var1) {
         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[var1 + 1];

         int var7;
         for(var7 = 0; var7 < var4.ae.length; ++var7) {
            var5[var7] = var4.ae[var7];
            var6[var7] = var4.ag[var7];
         }

         for(var7 = var4.ae.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.ae = var5;
         var4.ag = var6;
      }

      var4.ae[var1] = var2;
      var4.ag[var1] = var3;
   }

   static void aa(int var0, int var1, int var2, int var3) {
      de var4 = (de)ac.ac((long)var0);
      if (null == var4) {
         var4 = new de();
         ac.ag(var4, (long)var0);
      }

      if (var4.ae.length <= var1) {
         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[var1 + 1];

         int var7;
         for(var7 = 0; var7 < var4.ae.length; ++var7) {
            var5[var7] = var4.ae[var7];
            var6[var7] = var4.ag[var7];
         }

         for(var7 = var4.ae.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.ae = var5;
         var4.ag = var6;
      }

      var4.ae[var1] = var2;
      var4.ag[var1] = var3;
   }

   static void ao(int var0, int var1, int var2, int var3) {
      de var4 = (de)ac.ac((long)var0);
      if (null == var4) {
         var4 = new de();
         ac.ag(var4, (long)var0);
      }

      if (var4.ae.length <= var1) {
         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[var1 + 1];

         int var7;
         for(var7 = 0; var7 < var4.ae.length; ++var7) {
            var5[var7] = var4.ae[var7];
            var6[var7] = var4.ag[var7];
         }

         for(var7 = var4.ae.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.ae = var5;
         var4.ag = var6;
      }

      var4.ae[var1] = var2;
      var4.ag[var1] = var3;
   }

   static int al(int var0, int var1) {
      de var2 = (de)ac.ac((long)var0);
      if (var2 == null) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var2.ag.length ? var2.ag[var1] : 0;
      }
   }

   static void ay(int var0) {
      de var1 = (de)ac.ac((long)var0);
      if (null != var1) {
         var1.jb();
      }
   }

   static void as(int var0) {
      de var1 = (de)ac.ac((long)var0);
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.ae.length; ++var2) {
            var1.ae[var2] = -1;
            var1.ag[var2] = 0;
         }

      }
   }

   static void ai(int var0, int var1, int var2, int var3) {
      de var4 = (de)ac.ac((long)var0);
      if (null == var4) {
         var4 = new de();
         ac.ag(var4, (long)var0);
      }

      if (var4.ae.length <= var1) {
         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[var1 + 1];

         int var7;
         for(var7 = 0; var7 < var4.ae.length; ++var7) {
            var5[var7] = var4.ae[var7];
            var6[var7] = var4.ag[var7];
         }

         for(var7 = var4.ae.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.ae = var5;
         var4.ag = var6;
      }

      var4.ae[var1] = var2;
      var4.ag[var1] = var3;
   }

   static int ac(int var0, int var1, byte var2) {
      try {
         de var3 = (de)ac.ac((long)var0);
         if (null == var3) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            if (var1 >= 0) {
               if (var2 <= 0) {
                  throw new IllegalStateException();
               }

               if (var1 < var3.ae.length) {
                  return var3.ae[var1];
               }

               if (var2 <= 0) {
                  throw new IllegalStateException();
               }
            }

            return -1;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "de.ac(" + ')');
      }
   }

   static void iw(ArrayList var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         if (var0.isEmpty()) {
            if (var5 <= 969990531) {
               throw new IllegalStateException();
            }
         } else {
            int var6 = (Integer)var0.get(0);
            if (var6 == -1 && !client.tm) {
               if (var5 <= 969990531) {
                  throw new IllegalStateException();
               }

               ly.ax(0, 0, (byte)64);
            } else if (var6 != -1) {
               if (var5 <= 969990531) {
                  throw new IllegalStateException();
               }

               if (!ht.at(var6, (byte)95)) {
                  if (var5 <= 969990531) {
                     return;
                  }

                  if (re.vt.ao(-2051174136) != 0) {
                     if (var5 <= 969990531) {
                        throw new IllegalStateException();
                     }

                     ArrayList var7 = new ArrayList();

                     for(int var8 = 0; var8 < var0.size(); ++var8) {
                        if (var5 <= 969990531) {
                           throw new IllegalStateException();
                        }

                        var7.add(new ns(hg.fe, (Integer)var0.get(var8), 0, re.vt.ao(-2112701148), false));
                     }

                     if (client.tm) {
                        if (var5 <= 969990531) {
                           throw new IllegalStateException();
                        }

                        kw.ap(var7, var1, var2, var3, var4, (byte)-120);
                     } else {
                        gg.am(var7, var1, var2, var3, var4, false, (byte)-4);
                     }
                  }
               }
            }

         }
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "de.iw(" + ')');
      }
   }

   static void ae(po var0, po var1, sn var2, boolean var3, int var4, byte var5) {
      try {
         if (dp.ae) {
            if (var4 == 4) {
               if (var5 == 89) {
                  return;
               }

               cw.ao(4, -328790176);
            }

         } else {
            if (var4 == 0) {
               if (var5 == 89) {
                  throw new IllegalStateException();
               }

               fm.ap(var3, -1910269676);
            } else {
               cw.ao(var4, -219897803);
            }

            vr.ft();
            byte[] var6 = var0.cc("title.jpg", "", -164224592);
            ma.au = ez.ac(var6, 35301021);
            lg.ar = ma.au.ac();
            hg.ax(var1, client.ch * 12039691, -1750051372);
            gl.ax = sq.ax(var1, "titlebox", "", 1845979668);
            dp.aq = sq.ax(var1, "titlebutton", "", 1336451592);
            dp.af = sq.ax(var1, "titlebutton_large", "", 1262784045);
            dp.at = sq.ax(var1, "play_now_text", "", 1596465569);
            sq.ax(var1, "titlebutton_wide42,1", "", 2087767835);
            dp.am = it.am(var1, "runes", "", (byte)47);
            fv.ad = it.am(var1, "title_mute", "", (byte)45);
            gq.ah = sq.ax(var1, "options_radio_buttons,0", "", 835239398);
            cc.ap = sq.ax(var1, "options_radio_buttons,4", "", 572446759);
            qf.ab = sq.ax(var1, "options_radio_buttons,2", "", 1653713001);
            at.az = sq.ax(var1, "options_radio_buttons,6", "", 534034423);
            ci.ca = 503732347 * gq.ah.ag;
            mq.cs = -1459503965 * gq.ah.am;
            kp.aa = new dn(dp.am, var2.aa);
            if (var3) {
               if (var5 == 89) {
                  return;
               }

               dp.cj = "";
               dp.cx = "";
               dp.co = new String[8];
               dp.cy = 0;
            }

            ch.cd = 0;
            px.ce = "";
            dp.ck = true;
            dp.dk = false;
            if (!re.vt.ar((byte)1)) {
               if (var5 == 89) {
                  throw new IllegalStateException();
               }

               ArrayList var7 = new ArrayList();
               var7.add(new ns(hg.fe, "scape main", "", 255, false));
               gg.am(var7, 0, 0, 0, 100, false, (byte)-55);
            } else {
               ly.ax(0, 0, (byte)64);
            }

            bo.ar((byte)-77);
            py var9 = tw.ve;
            var9.ae(false, 1176406268);
            dp.ae = true;
            dp.ag = (fa.aj * -1991951399 - 765) / 2 * -31524639;
            dp.aj = -1947126146 + -1517185997 * dp.ag;
            oe.av = 1953755884 + 1707252733 * dp.aj;
            ma.au.al(dp.ag * -1776792799, 0);
            lg.ar.al(dp.ag * -1776792799 + 382, 0);
            ey.al.ag(-1776792799 * dp.ag + 382 - ey.al.ag / 2, 18);
         }
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "de.ae(" + ')');
      }
   }
}
