import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.Iterator;

public class tm {
   static int[] aq = new int['耀'];
   public static int[] af;
   static final int ag = 7;
   public static final int am = 64;
   public static final int ax = 896;
   public static final int ac = 10;
   static final int ay = 200;
   static final int ae = 7;

   static {
      for(int var0 = 0; var0 < 32768; ++var0) {
         aq[var0] = ac(var0, 1104143551);
      }

      if (af == null) {
         af = new int[65536];
         double var25 = 0.949999988079071D;

         for(int var2 = 0; var2 < 65536; ++var2) {
            double var3 = (double)(var2 >> 10 & 63) / 64.0D + 0.0078125D;
            double var5 = (double)(var2 >> 7 & 7) / 8.0D + 0.0625D;
            double var7 = (double)(var2 & 127) / 128.0D;
            double var9 = var7;
            double var11 = var7;
            double var13 = var7;
            if (var5 != 0.0D) {
               double var15;
               if (var7 < 0.5D) {
                  var15 = var7 * (1.0D + var5);
               } else {
                  var15 = var7 + var5 - var7 * var5;
               }

               double var17 = 2.0D * var7 - var15;
               double var19 = 0.3333333333333333D + var3;
               if (var19 > 1.0D) {
                  --var19;
               }

               double var23 = var3 - 0.3333333333333333D;
               if (var23 < 0.0D) {
                  ++var23;
               }

               if (6.0D * var19 < 1.0D) {
                  var9 = (var15 - var17) * 6.0D * var19 + var17;
               } else if (var19 * 2.0D < 1.0D) {
                  var9 = var15;
               } else if (var19 * 3.0D < 2.0D) {
                  var9 = var17 + 6.0D * (0.6666666666666666D - var19) * (var15 - var17);
               } else {
                  var9 = var17;
               }

               if (6.0D * var3 < 1.0D) {
                  var11 = var17 + (var15 - var17) * 6.0D * var3;
               } else if (var3 * 2.0D < 1.0D) {
                  var11 = var15;
               } else if (3.0D * var3 < 2.0D) {
                  var11 = 6.0D * (var15 - var17) * (0.6666666666666666D - var3) + var17;
               } else {
                  var11 = var17;
               }

               if (6.0D * var23 < 1.0D) {
                  var13 = var23 * (var15 - var17) * 6.0D + var17;
               } else if (var23 * 2.0D < 1.0D) {
                  var13 = var15;
               } else if (3.0D * var23 < 2.0D) {
                  var13 = var17 + 6.0D * (0.6666666666666666D - var23) * (var15 - var17);
               } else {
                  var13 = var17;
               }
            }

            var9 = Math.pow(var9, var25);
            var11 = Math.pow(var11, var25);
            var13 = Math.pow(var13, var25);
            int var26 = (int)(256.0D * var9);
            int var16 = (int)(var11 * 256.0D);
            int var27 = (int)(256.0D * var13);
            int var18 = var27 + (var26 << 16) + (var16 << 8);
            af[var2] = var18 & 16777215;
         }
      }

   }

   static final int ac(int var0, int var1) {
      try {
         double var2 = (double)(var0 >> 10 & 31) / 31.0D;
         double var4 = (double)(var0 >> 5 & 31) / 31.0D;
         double var6 = (double)(var0 & 31) / 31.0D;
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
            if (var1 <= 182211842) {
               throw new IllegalStateException();
            }

            var10 = var6;
         }

         double var12 = 0.0D;
         double var14 = 0.0D;
         double var16 = (var8 + var10) / 2.0D;
         if (var8 != var10) {
            if (var1 <= 182211842) {
               throw new IllegalStateException();
            }

            if (var16 < 0.5D) {
               if (var1 <= 182211842) {
                  throw new IllegalStateException();
               }

               var14 = (var10 - var8) / (var10 + var8);
            }

            if (var16 >= 0.5D) {
               if (var1 <= 182211842) {
                  throw new IllegalStateException();
               }

               var14 = (var10 - var8) / (2.0D - var10 - var8);
            }

            if (var10 == var2) {
               if (var1 <= 182211842) {
                  throw new IllegalStateException();
               }

               var12 = (var4 - var6) / (var10 - var8);
            } else if (var10 == var4) {
               if (var1 <= 182211842) {
                  throw new IllegalStateException();
               }

               var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
               if (var1 <= 182211842) {
                  throw new IllegalStateException();
               }

               var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
         }

         int var18 = (int)(var12 * 256.0D / 6.0D);
         var18 &= 255;
         double var19 = 256.0D * var14;
         if (var19 < 0.0D) {
            if (var1 <= 182211842) {
               throw new IllegalStateException();
            }

            var19 = 0.0D;
         } else if (var19 > 255.0D) {
            if (var1 <= 182211842) {
               throw new IllegalStateException();
            }

            var19 = 255.0D;
         }

         if (var16 > 0.7D) {
            if (var1 <= 182211842) {
               throw new IllegalStateException();
            }

            var19 /= 2.0D;
            var19 = Math.floor(var19);
         }

         if (var16 > 0.75D) {
            if (var1 <= 182211842) {
               throw new IllegalStateException();
            }

            var19 /= 2.0D;
            var19 = Math.floor(var19);
         }

         if (var16 > 0.85D) {
            if (var1 <= 182211842) {
               throw new IllegalStateException();
            }

            var19 /= 2.0D;
            var19 = Math.floor(var19);
         }

         if (var16 > 0.95D) {
            if (var1 <= 182211842) {
               throw new IllegalStateException();
            }

            var19 /= 2.0D;
            var19 = Math.floor(var19);
         }

         if (var16 > 0.995D) {
            if (var1 <= 182211842) {
               throw new IllegalStateException();
            }

            var16 = 0.995D;
         }

         int var21 = (int)((double)(8 * (var18 / 4)) + var19 / 32.0D);
         return (int)(var16 * 128.0D) + (var21 << 7);
      } catch (RuntimeException var22) {
         throw vk.ae(var22, "tm.ac(" + ')');
      }
   }

   public static int ae(int var0, int var1) {
      try {
         return 255 - (var0 & 255);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tm.ae(" + ')');
      }
   }

   static void hx(int var0) {
      try {
         client.dm = 4999417489642730425L;
         if (dn.dq != null) {
            if (var0 >= 2016267409) {
               return;
            }

            dn.dq.ag = 0;
         }

         gk.br = true;
         client.dg = true;
         client.su = -753154742347519225L;
         bp.ac = new pr();
         client.ia.ac(718621574);
         client.ia.aq.au = 0;
         client.ia.af = null;
         client.ia.ad = null;
         client.ia.ah = null;
         client.ia.ap = null;
         client.ia.at = 0;
         client.ia.ar = 0;
         client.dr = 0;
         client.ii = 0;
         client.dy = 0;
         client.nn.ae = 0;
         client.nr = false;
         ux.ag(0, (byte)-39);
         nt.af((byte)125);
         client.oa = 0;
         client.od = false;
         client.th = 0;
         client.ky = 0;
         client.lz = 0;
         on.wp = null;
         client.ti = 0;
         client.sn = 1400076551;
         client.sz = 0;
         client.si = 0;
         client.ef = ef.am;
         client.ew = ef.am;
         client.ju.am((short)4096);
         client.jl.ad((byte)1);
         qv.vj.ax(-378558);
         if (gy.ae * -232527639 > 5000 && var0 >= 2016267409) {
            throw new IllegalStateException();
         } else {
            int var1;
            if (client.dl) {
               if (var0 >= 2016267409) {
                  throw new IllegalStateException();
               }

               me.ag(-2143935274);
            } else {
               for(var1 = 0; var1 < -232527639 * gy.ae; ++var1) {
                  if (var0 >= 2016267409) {
                     return;
                  }

                  gy var2 = eq.ae(var1, 1169705407);
                  if (null != var2) {
                     if (var0 >= 2016267409) {
                        return;
                     }

                     no.ag[var1] = 0;
                     no.am[var1] = 0;
                  }
               }
            }

            if (null != iu.qz) {
               if (var0 >= 2016267409) {
                  throw new IllegalStateException();
               }

               iu.qz.af(-1909264951);
            }

            client.pz = 2028987837;
            if (250910895 * client.ok != -1) {
               if (var0 >= 2016267409) {
                  return;
               }

               ir.ep.am(250910895 * client.ok, (byte)58);
            }

            for(dj var4 = (dj)client.ol.am(); var4 != null; var4 = (dj)client.ol.ax()) {
               if (var0 >= 2016267409) {
                  throw new IllegalStateException();
               }

               fo.os(var4, true, 1775184496);
            }

            client.ok = 524435889;
            client.ol = new uu(8);
            client.po = null;
            client.nn.ae = 0;
            client.nr = false;
            client.vn.ae((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1, (byte)-118);

            for(var1 = 0; var1 < 8; ++var1) {
               if (var0 >= 2016267409) {
                  return;
               }

               client.no[var1] = null;
               client.nm[var1] = false;
            }

            de.ac = new uu(32);
            client.dj = true;

            for(var1 = 0; var1 < 100; ++var1) {
               if (var0 >= 2016267409) {
                  throw new IllegalStateException();
               }

               client.ri[var1] = true;
            }

            if (null != client.ia) {
               if (var0 >= 2016267409) {
                  throw new IllegalStateException();
               }

               if (null == client.ia.ax) {
                  if (var0 >= 2016267409) {
                     throw new IllegalStateException();
                  }
               } else {
                  mq var5 = fs.ac(mz.ah, client.ia.ax, (byte)-74);
                  var5.ag.bu(dt.jw((byte)66), (byte)108);
                  var5.ag.br(-1991951399 * fa.aj, 1625888552);
                  var5.ag.br(608173899 * en.av, 1625888552);
                  client.ia.ag(var5, -119158507);
               }
            }

            gt.sc = null;
            le.so = null;
            Arrays.fill(client.sg, (Object)null);
            gu.sm = null;
            Arrays.fill(client.sl, (Object)null);

            for(var1 = 0; var1 < 8; ++var1) {
               if (var0 >= 2016267409) {
                  return;
               }

               client.vv[var1] = new pj();
            }

            ci.vp = null;
            client.vz = 0;
            client.vi = 0;
            client.vb = 0;
            client.vg = 0;
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "tm.hx(" + ')');
      }
   }

   static final int am(int var0) {
      double var1 = (double)(var0 >> 10 & 31) / 31.0D;
      double var3 = (double)(var0 >> 5 & 31) / 31.0D;
      double var5 = (double)(var0 & 31) / 31.0D;
      double var7 = var1;
      if (var3 < var1) {
         var7 = var3;
      }

      if (var5 < var7) {
         var7 = var5;
      }

      double var9 = var1;
      if (var3 > var1) {
         var9 = var3;
      }

      if (var5 > var9) {
         var9 = var5;
      }

      double var11 = 0.0D;
      double var13 = 0.0D;
      double var15 = (var7 + var9) / 2.0D;
      if (var7 != var9) {
         if (var15 < 0.5D) {
            var13 = (var9 - var7) / (var9 + var7);
         }

         if (var15 >= 0.5D) {
            var13 = (var9 - var7) / (2.0D - var9 - var7);
         }

         if (var9 == var1) {
            var11 = (var3 - var5) / (var9 - var7);
         } else if (var9 == var3) {
            var11 = (var5 - var1) / (var9 - var7) + 2.0D;
         } else if (var5 == var9) {
            var11 = (var1 - var3) / (var9 - var7) + 4.0D;
         }
      }

      int var17 = (int)(var11 * 256.0D / 6.0D);
      var17 &= 255;
      double var18 = 256.0D * var13;
      if (var18 < 0.0D) {
         var18 = 0.0D;
      } else if (var18 > 255.0D) {
         var18 = 255.0D;
      }

      if (var15 > 0.7D) {
         var18 /= 2.0D;
         var18 = Math.floor(var18);
      }

      if (var15 > 0.75D) {
         var18 /= 2.0D;
         var18 = Math.floor(var18);
      }

      if (var15 > 0.85D) {
         var18 /= 2.0D;
         var18 = Math.floor(var18);
      }

      if (var15 > 0.95D) {
         var18 /= 2.0D;
         var18 = Math.floor(var18);
      }

      if (var15 > 0.995D) {
         var15 = 0.995D;
      }

      int var20 = (int)((double)(8 * (var17 / 4)) + var18 / 32.0D);
      return (int)(var15 * 128.0D) + (var20 << 7);
   }

   public static void ac(po var0, byte var1) {
      try {
         gy.ac = var0;
         ae = gy.ac.cj(16, (byte)40) * -1628475559;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tm.ac(" + ')');
      }
   }

   static final int ax(int var0) {
      double var1 = (double)(var0 >> 10 & 31) / 31.0D;
      double var3 = (double)(var0 >> 5 & 31) / 31.0D;
      double var5 = (double)(var0 & 31) / 31.0D;
      double var7 = var1;
      if (var3 < var1) {
         var7 = var3;
      }

      if (var5 < var7) {
         var7 = var5;
      }

      double var9 = var1;
      if (var3 > var1) {
         var9 = var3;
      }

      if (var5 > var9) {
         var9 = var5;
      }

      double var11 = 0.0D;
      double var13 = 0.0D;
      double var15 = (var7 + var9) / 2.0D;
      if (var7 != var9) {
         if (var15 < 0.5D) {
            var13 = (var9 - var7) / (var9 + var7);
         }

         if (var15 >= 0.5D) {
            var13 = (var9 - var7) / (2.0D - var9 - var7);
         }

         if (var9 == var1) {
            var11 = (var3 - var5) / (var9 - var7);
         } else if (var9 == var3) {
            var11 = (var5 - var1) / (var9 - var7) + 2.0D;
         } else if (var5 == var9) {
            var11 = (var1 - var3) / (var9 - var7) + 4.0D;
         }
      }

      int var17 = (int)(var11 * 256.0D / 6.0D);
      var17 &= 255;
      double var18 = 256.0D * var13;
      if (var18 < 0.0D) {
         var18 = 0.0D;
      } else if (var18 > 255.0D) {
         var18 = 255.0D;
      }

      if (var15 > 0.7D) {
         var18 /= 2.0D;
         var18 = Math.floor(var18);
      }

      if (var15 > 0.75D) {
         var18 /= 2.0D;
         var18 = Math.floor(var18);
      }

      if (var15 > 0.85D) {
         var18 /= 2.0D;
         var18 = Math.floor(var18);
      }

      if (var15 > 0.95D) {
         var18 /= 2.0D;
         var18 = Math.floor(var18);
      }

      if (var15 > 0.995D) {
         var15 = 0.995D;
      }

      int var20 = (int)((double)(8 * (var17 / 4)) + var18 / 32.0D);
      return (int)(var15 * 128.0D) + (var20 << 7);
   }

   public static int aq(int var0) {
      return 255 - (var0 & -1683663154);
   }

   public static int af(int var0) {
      return 255 - (var0 & 255);
   }

   public static int at(int var0) {
      return 255 - (var0 & 255);
   }

   static final int ag(int var0) {
      double var1 = (double)(var0 >> 10 & 31) / 31.0D;
      double var3 = (double)(var0 >> 5 & 31) / 31.0D;
      double var5 = (double)(var0 & 31) / 31.0D;
      double var7 = var1;
      if (var3 < var1) {
         var7 = var3;
      }

      if (var5 < var7) {
         var7 = var5;
      }

      double var9 = var1;
      if (var3 > var1) {
         var9 = var3;
      }

      if (var5 > var9) {
         var9 = var5;
      }

      double var11 = 0.0D;
      double var13 = 0.0D;
      double var15 = (var7 + var9) / 2.0D;
      if (var7 != var9) {
         if (var15 < 0.5D) {
            var13 = (var9 - var7) / (var9 + var7);
         }

         if (var15 >= 0.5D) {
            var13 = (var9 - var7) / (2.0D - var9 - var7);
         }

         if (var9 == var1) {
            var11 = (var3 - var5) / (var9 - var7);
         } else if (var9 == var3) {
            var11 = (var5 - var1) / (var9 - var7) + 2.0D;
         } else if (var5 == var9) {
            var11 = (var1 - var3) / (var9 - var7) + 4.0D;
         }
      }

      int var17 = (int)(var11 * 256.0D / 6.0D);
      var17 &= 255;
      double var18 = 256.0D * var13;
      if (var18 < 0.0D) {
         var18 = 0.0D;
      } else if (var18 > 255.0D) {
         var18 = 255.0D;
      }

      if (var15 > 0.7D) {
         var18 /= 2.0D;
         var18 = Math.floor(var18);
      }

      if (var15 > 0.75D) {
         var18 /= 2.0D;
         var18 = Math.floor(var18);
      }

      if (var15 > 0.85D) {
         var18 /= 2.0D;
         var18 = Math.floor(var18);
      }

      if (var15 > 0.95D) {
         var18 /= 2.0D;
         var18 = Math.floor(var18);
      }

      if (var15 > 0.995D) {
         var15 = 0.995D;
      }

      int var20 = (int)((double)(8 * (var17 / 4)) + var18 / 32.0D);
      return (int)(var15 * 128.0D) + (var20 << 7);
   }

   static final void ar(byte var0) {
      try {
         qa.au(ok.he, (byte)-28);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "tm.ar(" + ')');
      }
   }

   tm() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "tm.<init>(" + ')');
      }
   }

   public static String ag(vf var0, int var1) {
      try {
         return aa.am(var0, 32767, (short)10273);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "tm.ag(" + ')');
      }
   }

   protected static int br(int var0) {
      try {
         int var1;
         label58: {
            var1 = 0;
            if (null != dh.bv) {
               if (var0 != -1223770531) {
                  throw new IllegalStateException();
               }

               if (dh.bv.isValid()) {
                  break label58;
               }

               if (var0 != -1223770531) {
                  throw new IllegalStateException();
               }
            }

            try {
               Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

               while(var2.hasNext()) {
                  if (var0 != -1223770531) {
                     throw new IllegalStateException();
                  }

                  GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)var2.next();
                  if (var3.isValid()) {
                     if (var0 != -1223770531) {
                        throw new IllegalStateException();
                     }

                     dh.bv = var3;
                     ba.bq = -6745007813743822991L;
                     ba.bt = 3695766873395466925L;
                  }
               }
            } catch (Throwable var10) {
            }
         }

         if (null != dh.bv) {
            if (var0 != -1223770531) {
               throw new IllegalStateException();
            }

            long var12 = hf.ac(-1598214665);
            long var4 = dh.bv.getCollectionTime();
            if (-1L != ba.bt * 3153517625685270235L) {
               long var6 = var4 - 3153517625685270235L * ba.bt;
               long var8 = var12 - 3270838277370336879L * ba.bq;
               if (0L != var8) {
                  var1 = (int)(var6 * 100L / var8);
               }
            }

            ba.bt = var4 * -3695766873395466925L;
            ba.bq = 6745007813743822991L * var12;
         }

         return var1;
      } catch (RuntimeException var11) {
         throw vk.ae(var11, "tm.br(" + ')');
      }
   }
}
