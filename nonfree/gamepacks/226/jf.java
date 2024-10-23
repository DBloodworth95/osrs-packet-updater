import java.util.ArrayList;
import java.util.Iterator;

public class jf {
   int aw;
   public static final int ae = 6;
   int ak;
   int ap;
   public static final int al = 22;
   static int am;

   static final void fi(byte var0) {
      try {
         ji.aw = false;
         client.cl = false;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "jf.fi(" + ')');
      }
   }

   public static void am(pe var0, int var1, int var2) {
      try {
         if (mp.as.isEmpty()) {
            if (var2 <= 2091672969) {
               throw new IllegalStateException();
            }
         } else {
            ArrayList var3 = new ArrayList();
            Iterator var4 = mp.as.iterator();

            while(var4.hasNext()) {
               no var5 = (no)var4.next();
               var5.ae = false;
               var5.as = false;
               var5.am = false;
               var5.at = false;
               var5.ap = var0;
               var5.aj = var1 * 1205448709;
               var5.ai = 0.0F;
               var3.add(var5);
            }

            hh.aw(var3, mp.at * -1912330687, mp.au * 402183881, -399918875 * mp.an, mp.ao * -1503766987, false, 637804300);
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "jf.am(" + ')');
      }
   }

   jf() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "jf.<init>(" + ')');
      }
   }

   static void ia(int var0) {
      try {
         if (ch.wx != null) {
            if (var0 == 1121072083) {
               throw new IllegalStateException();
            }

            ch.wx.an(hx.jf.aj * 86027145, (bz.mx.ap((byte)106) >> 7) + -2014668603 * hx.jf.as, (bz.mx.aw(1252351662) >> 7) + 1601580509 * hx.jf.ae, false, -1080856428);
            ch.wx.bv(-673141652);
         }

      } catch (RuntimeException var1) {
         throw tm.aw(var1, "jf.ia(" + ')');
      }
   }

   public static final qt at(qt var0, qt var1, int var2) {
      try {
         qt var3;
         synchronized(qt.ak) {
            if (0 == 937612641 * qt.ai) {
               if (var2 <= -2088806739) {
                  throw new IllegalStateException();
               }

               var3 = new qt(var0);
            } else {
               qt.ak[(qt.ai -= -847475039) * 937612641].ai(var0, 666245184);
               var3 = qt.ak[qt.ai * 937612641];
            }
         }

         var3.am(var1, -1203805015);
         return var3;
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "jf.at(" + ')');
      }
   }
}
