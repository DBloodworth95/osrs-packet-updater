import java.util.Arrays;
import java.util.Locale;

@pd
@ns
public class pn implements ph {
   final String ae;
   public static final pn ay;
   public static final pn ak;
   static final pn aj;
   final String am;
   public static final pn ap;
   final int at;
   static final int ad = 262144;
   static final pn aw;
   static final pn ai;
   static final pn[] au;
   static or ft;
   static final pn as;
   static final int hp = 16;

   String ay() {
      return this.am;
   }

   pn(String var1, String var2, String var3, pa var4, int var5, String var6) {
      try {
         super();
         this.ae = var1;
         this.am = var2;
         this.at = var5 * 1244571939;
         if (null != var6) {
            new Locale(var2.substring(0, 2), var6);
         } else {
            new Locale(var2.substring(0, 2));
         }

      } catch (RuntimeException var7) {
         throw tm.aw(var7, "pn.<init>(" + ')');
      }
   }

   public static pn an(int var0) {
      return var0 >= 0 && var0 < au.length ? au[var0] : null;
   }

   public int aw(int var1) {
      try {
         return this.at * 305188491;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "pn.aw(" + ')');
      }
   }

   public static pn aj(int var0, byte var1) {
      try {
         if (var0 >= 0) {
            if (var1 != 2) {
               throw new IllegalStateException();
            }

            if (var0 < au.length) {
               return au[var0];
            }
         }

         return null;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "pn.aj(" + ')');
      }
   }

   public static pn am(int var0) {
      return var0 >= 0 && var0 < au.length ? au[var0] : null;
   }

   String ak(int var1) {
      try {
         return this.am;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "pn.ak(" + ')');
      }
   }

   public int as() {
      return this.at * 305188491;
   }

   public String amw() {
      return this.ak(1045352172).toLowerCase(Locale.ENGLISH);
   }

   public String toString() {
      try {
         return this.ak(2131621832).toLowerCase(Locale.ENGLISH);
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "pn.toString(" + ')');
      }
   }

   String ai() {
      return this.am;
   }

   public String amu() {
      return this.ak(2139814101).toLowerCase(Locale.ENGLISH);
   }

   String ae() {
      return this.am;
   }

   public static pn au(int var0) {
      return var0 >= 0 && var0 < au.length ? au[var0] : null;
   }

   public static pn at(int var0) {
      return var0 >= 0 && var0 < au.length ? au[var0] : null;
   }

   static {
      ap = new pn("EN", "en", "English", pa.ap, 0, "GB");
      aw = new pn("DE", "de", "German", pa.ap, 1, "DE");
      ak = new pn("FR", "fr", "French", pa.ap, 2, "FR");
      aj = new pn("PT", "pt", "Portuguese", pa.ap, 3, "BR");
      ai = new pn("NL", "nl", "Dutch", pa.aj, 4, "NL");
      ay = new pn("ES", "es", "Spanish", pa.aj, 5, "ES");
      as = new pn("ES_MX", "es-mx", "Spanish (Latin American)", pa.ap, 6, "MX");
      pn[] var0 = ap(1289095481);
      au = new pn[var0.length];
      pn[] var1 = var0;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         pn var3 = var1[var2];
         if (null != au[var3.at * 305188491]) {
            throw new IllegalStateException();
         }

         au[var3.at * 305188491] = var3;
      }

   }

   static pn[] ap(int var0) {
      try {
         return new pn[]{ai, ak, aw, aj, ay, ap, as};
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "pn.ap(" + ')');
      }
   }

   static int af(int var0, da var1, boolean var2, int var3) {
      try {
         ng var10000;
         if (var2) {
            if (var3 != 1791002298) {
               throw new IllegalStateException();
            }

            var10000 = vx.ar;
         } else {
            var10000 = ac.af;
         }

         ng var4 = var10000;
         if (var0 == 1500) {
            cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var4.bs * -1305260519;
            return 1;
         } else if (var0 == 1501) {
            if (var3 != 1791002298) {
               throw new IllegalStateException();
            } else {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var4.bm * 2100532037;
               return 1;
            }
         } else if (1502 == var0) {
            if (var3 != 1791002298) {
               throw new IllegalStateException();
            } else {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var4.bo * 2013768333;
               return 1;
            }
         } else if (1503 == var0) {
            if (var3 != 1791002298) {
               throw new IllegalStateException();
            } else {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var4.bd * -1662542495;
               return 1;
            }
         } else if (var0 == 1504) {
            if (var3 != 1791002298) {
               throw new IllegalStateException();
            } else {
               int[] var6 = cm.ae;
               int var10001 = (dp.am += -1450976103) * -158156887 - 1;
               byte var10002;
               if (var4.bf) {
                  if (var3 != 1791002298) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var6[var10001] = var10002;
               return 1;
            }
         } else if (var0 == 1505) {
            cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 53502319 * var4.bi;
            return 1;
         } else {
            return 2;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "pn.af(" + ')');
      }
   }

   static void gk(int var0) {
      try {
         client.ds = 715314765384381311L;
         if (null != rr.db) {
            if (var0 == 973865543) {
               return;
            }

            rr.db.ak = 0;
         }

         lj.bd = true;
         client.dy = true;
         client.so = -265892098653125663L;
         az.ap((byte)-24);
         client.in.ap((byte)49);
         client.in.ay.am = 0;
         client.in.as = null;
         client.in.an = null;
         client.in.ao = null;
         client.in.af = null;
         client.in.ae = 0;
         client.in.at = 0;
         client.do = 0;
         client.ii = 0;
         client.dw = 0;
         ai.kv((byte)87);
         bc.ai = 0;
         el.ap.clear();
         el.aw.ak();
         el.ak.ap();
         el.aj = 0;
         client.oq = 0;
         client.os = false;
         client.ty = 0;
         client.kb = 0;
         client.lh = 0;
         ck.wo = null;
         client.tf = 0;
         client.sm = 1823659459;
         client.sa = 0;
         client.tt = 0;
         client.ey = ey.aj;
         client.ec = ey.aj;
         client.jv.au(-1550738967);
         client.jp.an(-1711003386);
         dk.vt.ai(-1459371402);
         if (kg.aw * -1230678575 <= 5000 || var0 != 973865543) {
            int var1;
            if (client.dh) {
               Arrays.fill(nb.ak, 0);
               Arrays.fill(nb.aj, 0);
            } else {
               for(var1 = 0; var1 < kg.aw * -1230678575; ++var1) {
                  if (var0 == 973865543) {
                     throw new IllegalStateException();
                  }

                  gk var2 = br.aw(var1, (byte)115);
                  if (null != var2) {
                     if (var0 == 973865543) {
                        return;
                     }

                     nb.ak[var1] = 0;
                     nb.aj[var1] = 0;
                  }
               }
            }

            if (tm.qz != null) {
               if (var0 == 973865543) {
                  return;
               }

               tm.qz.as(1337875578);
            }

            client.pq = 268012657;
            if (client.og * 1832668233 != -1) {
               if (var0 == 973865543) {
                  throw new IllegalStateException();
               }

               qk.ek.aj(client.og * 1832668233, (byte)36);
            }

            for(dm var4 = (dm)client.om.aj(); var4 != null; var4 = (dm)client.om.ai()) {
               if (var0 == 973865543) {
                  throw new IllegalStateException();
               }

               qo.nb(var4, true, 1411607235);
            }

            client.og = -708404729;
            client.om = new ud(8);
            client.pe = null;
            ai.kv((byte)10);
            client.vk.aw((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1, 918728909);

            for(var1 = 0; var1 < 8; ++var1) {
               if (var0 == 973865543) {
                  throw new IllegalStateException();
               }

               client.nj[var1] = null;
               client.nm[var1] = false;
            }

            dk.ap = new ud(32);
            client.dm = true;

            for(var1 = 0; var1 < 100; ++var1) {
               if (var0 == 973865543) {
                  throw new IllegalStateException();
               }

               client.ra[var1] = true;
            }

            if (null != client.in) {
               if (null == client.in.ai) {
                  if (var0 == 973865543) {
                     return;
                  }
               } else {
                  me var5 = ef.ap(mm.aa, client.in.ai, (byte)118);
                  var5.ak.bo(ff.ic(-1610967298), -1696186621);
                  var5.ak.bd(ac.ax * 1816225167, (byte)-77);
                  var5.ak.bd(-121992435 * ki.aq, (byte)19);
                  client.in.ak(var5, (short)486);
               }
            }

            do.sb = null;
            client.sq = null;
            Arrays.fill(client.sc, (Object)null);
            gb.sd = null;
            Arrays.fill(client.sw, (Object)null);

            for(var1 = 0; var1 < 8; ++var1) {
               if (var0 == 973865543) {
                  throw new IllegalStateException();
               }

               client.vj[var1] = new pj();
            }

            no.va = null;
            client.vu = 0;
            client.vr = 0;
            client.vw = 0;
            client.vm = 0;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "pn.gk(" + ')');
      }
   }
}
