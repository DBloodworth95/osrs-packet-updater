import java.util.HashSet;
import java.util.Set;

public class pa implements ph {
   static final pa au;
   static final pa aw;
   final Set ar;
   static final pa aj;
   static final pa as;
   static final pa ay;
   static final pa ai;
   static final pa ae;
   static final pa am;
   static final pa at;
   static final pa ak;
   static final pa an;
   static final pa ao;
   final int af;
   public static final int bf = 74;
   static final int hg = 65536;
   static or fp;
   static final pa ap;
   static final int bq = 47;

   pa(String var1, int var2, px[] var3) {
      try {
         super();
         this.ar = new HashSet();
         this.af = var2 * 365800055;
         px[] var4 = var3;

         for(int var5 = 0; var5 < var4.length; ++var5) {
            px var6 = var4[var5];
            this.ar.add(var6);
         }

      } catch (RuntimeException var7) {
         throw tm.aw(var7, "pa.<init>(" + ')');
      }
   }

   pa(String var1, int var2) {
      try {
         super();
         this.ar = new HashSet();
         this.af = var2 * 365800055;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "pa.<init>(" + ')');
      }
   }

   public int as() {
      return this.af * -1841475769;
   }

   public int aw(int var1) {
      try {
         return this.af * -1841475769;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "pa.aw(" + ')');
      }
   }

   static pa[] ap(int var0) {
      try {
         return new pa[]{ay, ai, at, ae, ao, an, as, aw, ap, au, ak, aj, am};
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "pa.ap(" + ')');
      }
   }

   static {
      ap = new pa("", 0, new px[]{px.aj, px.ap});
      aw = new pa("", 1, new px[]{px.ak, px.aj, px.ap});
      ak = new pa("", 2, new px[]{px.ak, px.aw, px.aj});
      aj = new pa("", 3, new px[]{px.ak});
      ai = new pa("", 4);
      ay = new pa("", 5, new px[]{px.ak, px.aj});
      as = new pa("", 6, new px[]{px.aj});
      ae = new pa("", 8, new px[]{px.ak, px.aj});
      am = new pa("", 9, new px[]{px.ak, px.aw});
      at = new pa("", 10, new px[]{px.ak});
      au = new pa("", 11, new px[]{px.ak});
      an = new pa("", 12, new px[]{px.ak, px.aj});
      ao = new pa("", 13, new px[]{px.ak});
      ap(-1051850);
   }

   static pa[] ak() {
      return new pa[]{ay, ai, at, ae, ao, an, as, aw, ap, au, ak, aj, am};
   }

   static void lk(int var0) {
      try {
         if (client.os) {
            ng var1 = qk.ek.aw(sq.oc * 781583631, 353908141 * client.oy, (byte)-108);
            if (var1 != null) {
               if (var0 != -707051104) {
                  return;
               }

               if (var1.fn != null) {
                  if (var0 != -707051104) {
                     return;
                  }

                  dt var2 = new dt();
                  var2.ak = var1;
                  var2.ap = var1.fn;
                  sr.ap(var2, -1600415627);
               }
            }

            client.ot = 669592405;
            client.os = false;
            ek.mp(var1, 1368964513);
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "pa.lk(" + ')');
      }
   }
}
