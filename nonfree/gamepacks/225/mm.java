import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class mm {
   static int al = 0;
   static po ae;
   public static ArrayList am = null;
   public static final int ew = 1;
   static po ac;
   static ArrayList af = new ArrayList(3);
   public static ArrayList at = new ArrayList();
   public static LinkedList ax = new LinkedList();
   static int ar = 0;
   public static final List au = new ArrayList();
   static int ad = 0;
   static int ah = 0;
   public static ArrayList aq = new ArrayList(3);

   public static void an(int var0, int var1) {
      qg.ah(var0, var1, 0, 0, -1350949084);
      af.clear();
      at.clear();
      if (!aq.isEmpty() && (var0 != 0 || 0 != var1)) {
         at.add(new rh((ri)null, ar * 1003329821));
         at.add(new rc((ri)null, 0, false, al * -1368761595));
         ArrayList var3 = new ArrayList();
         Iterator var4 = aq.iterator();

         while(var4.hasNext()) {
            ns var5 = (ns)var4.next();
            var3.add(var5);
         }

         at.add(new rl((ri)null, var3));
      } else {
         cy.ab(1870578311);
      }

   }

   public static boolean aa(po var0, po var1, po var2, ArrayList var3) {
      ac = var0;
      ae = var1;
      rw.ag = var2;
      am = var3;
      return true;
   }

   public static boolean ai(po var0, po var1, po var2, ArrayList var3) {
      ac = var0;
      ae = var1;
      rw.ag = var2;
      am = var3;
      return true;
   }

   public static void ao(ne var0) {
      if (!au.contains(var0)) {
         au.add(var0);
      }

   }

   public static void as(ne var0) {
      if (!au.contains(var0)) {
         au.add(var0);
      }

   }

   public static void ay(int var0, int var1) {
      Iterator var2 = au.iterator();

      while(var2.hasNext()) {
         ne var3 = (ne)var2.next();
         var3.io(var0, var1, 338596605);
      }

   }

   public static void bd(int var0, int var1, int var2, int var3) {
      if (aq.size() > 1 && aq.get(0) != null && ((ns)aq.get(0)).al.ap(1891926304) && aq.get(1) != null && ((ns)aq.get(1)).al.ap(1891926304)) {
         qg.ah(var0, var1, var2, var3, -1402197450);
         at.add(new qb((ri)null));
         ArrayList var4 = new ArrayList();
         var4.add(new rh(new rj((ri)null, 1, false, ah * 94191071), -1026592873 * ad));
         var4.add(new rh(new rc((ri)null, 0, false, -161512225 * al), ar * -1049602065));
         at.add(new ru((ri)null, var4));
         if (af.get(0) != null && af.get(1) != null) {
            ns var5 = (ns)af.get(0);
            af.set(0, aq.get(1));
            af.set(1, var5);
         }
      }

   }

   public static void be(ArrayList var0, int var1, int var2, int var3, int var4) {
      af.clear();
      af.addAll(var0);
      qg.ah(var1, var2, var3, var4, -1456735634);
   }

   public static void aw(int var0, int var1) {
      qg.ah(var0, var1, 0, 0, -1220171554);
      af.clear();
      at.clear();
      if (!aq.isEmpty() && (var0 != 0 || 0 != var1)) {
         at.add(new rh((ri)null, ar * 175164398));
         at.add(new rc((ri)null, 0, false, al * -161512225));
         ArrayList var3 = new ArrayList();
         Iterator var4 = aq.iterator();

         while(var4.hasNext()) {
            ns var5 = (ns)var4.next();
            var3.add(var5);
         }

         at.add(new rl((ri)null, var3));
      } else {
         cy.ab(1870578311);
      }

   }

   public static boolean bj() {
      return !af.isEmpty();
   }

   static void bt(int var0, int var1, int var2, int var3) {
      ar = var0 * -1771981041;
      al = var1 * -1132644577;
      ad = var2 * -1920335833;
      ah = var3 * -1892237793;
   }

   public static boolean bn() {
      if (!at.isEmpty()) {
         return true;
      } else {
         return !aq.isEmpty() && aq.get(0) != null && ((ns)aq.get(0)).al != null ? ((ns)aq.get(0)).al.ap(1891926304) : false;
      }
   }

   public static void bh(int var0, int var1, int var2, int var3) {
      if (aq.size() > 1 && aq.get(0) != null && ((ns)aq.get(0)).al.ap(1891926304) && aq.get(1) != null && ((ns)aq.get(1)).al.ap(1891926304)) {
         qg.ah(var0, var1, var2, var3, -809103449);
         at.add(new qb((ri)null));
         ArrayList var4 = new ArrayList();
         var4.add(new rh(new rj((ri)null, 1, false, ah * 102788028), -828131603 * ad));
         var4.add(new rh(new rc((ri)null, 0, false, -161512225 * al), ar * -1049602065));
         at.add(new ru((ri)null, var4));
         if (af.get(0) != null && af.get(1) != null) {
            ns var5 = (ns)af.get(0);
            af.set(0, aq.get(1));
            af.set(1, var5);
         }
      }

   }

   public static void ch(ArrayList var0, int var1, int var2, int var3, int var4) {
      af.clear();
      af.addAll(var0);
      qg.ah(var1, var2, var3, var4, -621956179);
   }

   public static boolean bx(int var0) {
      if (af.isEmpty()) {
         return false;
      } else {
         ns var1 = (ns)af.get(0);
         return null != var1 && var0 == 1710436281 * var1.ae;
      }
   }

   static void cx(boolean var0) {
      if (var0) {
         cy.ab(1870578311);
      } else {
         for(int var1 = 0; var1 < aq.size(); ++var1) {
            ns var2 = (ns)aq.get(var1);
            if (null == var2) {
               aq.remove(var1);
               --var1;
            } else if (var2.ar) {
               if (1813270399 * var2.al.bb > 0) {
                  ms var10000 = var2.al;
                  var10000.bb -= 1130066047;
               }

               var2.al.ah(1954111647);
               var2.al.ar((byte)60);
               var2.al.ac(0, -1331762839);
               aq.remove(var1);
               --var1;
            } else {
               var2.ar = true;
            }
         }
      }

   }

   public static boolean ba() {
      return !af.isEmpty();
   }

   public static void aj(int var0, int var1) {
      Iterator var2 = au.iterator();

      while(var2.hasNext()) {
         ne var3 = (ne)var2.next();
         var3.io(var0, var1, 338596605);
      }

   }

   public static boolean bw() {
      return !af.isEmpty();
   }

   public static void cf() {
      Iterator var0 = aq.iterator();

      while(var0.hasNext()) {
         ns var1 = (ns)var0.next();
         if (var1 != null) {
            var1.al.ah(-1881052214);
            var1.al.ar((byte)97);
            var1.al.ac(0, -1597402983);
            var1.al.bb = 0;
            ok.ag(1710436281 * var1.ae, 1578912913 * var1.ag, 226943482);
         }
      }

      aq.clear();
   }

   public static boolean bm(int var0) {
      if (af.isEmpty()) {
         return false;
      } else {
         ns var1 = (ns)af.get(0);
         return null != var1 && var0 == 1710436281 * var1.ae;
      }
   }

   public static void bp() {
      af.clear();
   }

   public static void by() {
      af.clear();
   }

   public static ho ac(int var0, byte var1) {
      try {
         ho var2 = (ho)ho.ae.ac((long)var0);
         if (null != var2) {
            return var2;
         } else {
            byte[] var3 = ho.ac.bt(34, var0, (byte)24);
            var2 = new ho();
            if (null != var3) {
               if (var1 <= 0) {
                  throw new IllegalStateException();
               }

               var2.ag(new vf(var3), 1232795812);
            }

            var2.ae(1258888832);
            ho.ae.ag(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "mm.ac(" + ')');
      }
   }

   public static void bi(po var0, int var1) {
      if (!af.isEmpty()) {
         ArrayList var2 = new ArrayList();
         Iterator var3 = af.iterator();

         while(var3.hasNext()) {
            ns var4 = (ns)var3.next();
            var4.at = false;
            var4.af = false;
            var4.au = false;
            var4.ar = false;
            var4.ac = var0;
            var4.am = -1538554415 * var1;
            var4.ax = 0.0F;
            var2.add(var4);
         }

         gg.am(var2, -1049602065 * ar, al * 950679854, -997451997 * ad, 94191071 * ah, false, (byte)10);
      }
   }

   public static void bg(po var0, int var1) {
      if (!af.isEmpty()) {
         ArrayList var2 = new ArrayList();
         Iterator var3 = af.iterator();

         while(var3.hasNext()) {
            ns var4 = (ns)var3.next();
            var4.at = false;
            var4.af = false;
            var4.au = false;
            var4.ar = false;
            var4.ac = var0;
            var4.am = -1538554415 * var1;
            var4.ax = 0.0F;
            var2.add(var4);
         }

         gg.am(var2, -1049602065 * ar, al * -161512225, -1026592873 * ad, 94191071 * ah, false, (byte)72);
      }
   }

   static void bl(ArrayList var0, boolean var1) {
      if (!var1) {
         af.clear();
      }

      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         ns var3 = (ns)var2.next();
         if (1710436281 * var3.ae != -1 && 1578912913 * var3.ag != -1) {
            if (!var1) {
               af.add(var3);
            }

            ax.add(var3);
         }
      }

   }

   public static void bb() {
      af.clear();
   }

   static void bu(ArrayList var0, boolean var1) {
      if (!var1) {
         af.clear();
      }

      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         ns var3 = (ns)var2.next();
         if (1710436281 * var3.ae != -1 && 1578912913 * var3.ag != -1) {
            if (!var1) {
               af.add(var3);
            }

            ax.add(var3);
         }
      }

   }

   static void br(ArrayList var0, boolean var1) {
      if (!var1) {
         af.clear();
      }

      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         ns var3 = (ns)var2.next();
         if (-2090190802 * var3.ae != -1 && 1578912913 * var3.ag != -1) {
            if (!var1) {
               af.add(var3);
            }

            ax.add(var3);
         }
      }

   }

   static void bo(ArrayList var0, boolean var1) {
      if (!var1) {
         af.clear();
      }

      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         ns var3 = (ns)var2.next();
         if (1710436281 * var3.ae != -1 && 1578912913 * var3.ag != -1) {
            if (!var1) {
               af.add(var3);
            }

            ax.add(var3);
         }
      }

   }

   static void bv(int var0, int var1, int var2, int var3) {
      ar = var0 * -424251066;
      al = var1 * 532688896;
      ad = var2 * 1415273519;
      ah = var3 * -1892237793;
   }

   mm() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "mm.<init>(" + ')');
      }
   }

   static void bz(ArrayList var0, boolean var1) {
      if (!var1) {
         af.clear();
      }

      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         ns var3 = (ns)var2.next();
         if (1710436281 * var3.ae != -1 && 1578912913 * var3.ag != -1) {
            if (!var1) {
               af.add(var3);
            }

            ax.add(var3);
         }
      }

   }

   static void bk(int var0, int var1, int var2, int var3) {
      ar = var0 * 98339646;
      al = var1 * 1929384120;
      ad = var2 * -1920335833;
      ah = var3 * 176601685;
   }

   public static void ak(int var0, int var1) {
      qg.ah(var0, var1, 0, 0, -623484478);
      af.clear();
      at.clear();
      if (!aq.isEmpty() && (var0 != 0 || 0 != var1)) {
         at.add(new rh((ri)null, ar * -628614681));
         at.add(new rc((ri)null, 0, false, al * -161512225));
         ArrayList var3 = new ArrayList();
         Iterator var4 = aq.iterator();

         while(var4.hasNext()) {
            ns var5 = (ns)var4.next();
            var3.add(var5);
         }

         at.add(new rl((ri)null, var3));
      } else {
         cy.ab(1870578311);
      }

   }

   public static void bc(ArrayList var0, int var1, int var2, int var3, int var4) {
      af.clear();
      af.addAll(var0);
      qg.ah(var1, var2, var3, var4, -357963036);
   }

   public static void cn(ArrayList var0, int var1, int var2, int var3, int var4) {
      af.clear();
      af.addAll(var0);
      qg.ah(var1, var2, var3, var4, -1527032806);
   }

   public static void av(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (!var0.isEmpty()) {
         ax.clear();
         at.clear();
         fx.az(var5, -4045494);
         ae.ad(var0, var5, 408900827);
         if (!ax.isEmpty()) {
            qg.ah(var1, var2, var3, var4, -1115573182);
            at.add(new qm((ri)null));
            at.add(new ra((ri)null, ac, ae, rw.ag));
            ArrayList var6 = new ArrayList();
            var6.add(new rb(new rj((ri)null, 0, true, 94191071 * ah)));
            if (!aq.isEmpty()) {
               ArrayList var7 = new ArrayList();
               var7.add(new rh(new ru((ri)null, var6), ad * -1026592873));
               ArrayList var9 = new ArrayList();
               Iterator var10 = aq.iterator();

               while(var10.hasNext()) {
                  ns var11 = (ns)var10.next();
                  var9.add(var11);
               }

               var7.add(new rh(new rc(new rl((ri)null, var9), 0, false, al * -161512225), ar * -1049602065));
               at.add(new ru((ri)null, var7));
            } else {
               at.add(new rh((ri)null, -1026592873 * ad));
               at.add(new ru((ri)null, var6));
            }

         }
      }
   }

   static void bq(int var0, int var1, int var2, int var3) {
      ar = var0 * -1771981041;
      al = var1 * -1132644577;
      ad = var2 * -393088823;
      ah = var3 * -817618896;
   }

   public static void cu() {
      Iterator var0 = aq.iterator();

      while(var0.hasNext()) {
         ns var1 = (ns)var0.next();
         if (var1 != null) {
            var1.al.ah(-998348196);
            var1.al.ar((byte)103);
            var1.al.ac(0, -1853019015);
            var1.al.bb = 0;
            ok.ag(1710436281 * var1.ae, 1578912913 * var1.ag, -761589212);
         }
      }

      aq.clear();
   }

   public static void cm() {
      Iterator var0 = aq.iterator();

      while(var0.hasNext()) {
         ns var1 = (ns)var0.next();
         if (var1 != null) {
            var1.al.ah(-446794649);
            var1.al.ar((byte)99);
            var1.al.ac(0, -614721510);
            var1.al.bb = 0;
            ok.ag(1710436281 * var1.ae, 1439219825 * var1.ag, -91984821);
         }
      }

      aq.clear();
   }

   static void cj(boolean var0) {
      if (var0) {
         cy.ab(1870578311);
      } else {
         for(int var1 = 0; var1 < aq.size(); ++var1) {
            ns var2 = (ns)aq.get(var1);
            if (null == var2) {
               aq.remove(var1);
               --var1;
            } else if (var2.ar) {
               if (1813270399 * var2.al.bb > 0) {
                  ms var10000 = var2.al;
                  var10000.bb -= 1130066047;
               }

               var2.al.ah(-678426871);
               var2.al.ar((byte)97);
               var2.al.ac(0, -1866013489);
               aq.remove(var1);
               --var1;
            } else {
               var2.ar = true;
            }
         }
      }

   }

   public static boolean bs() {
      return !af.isEmpty();
   }

   public static boolean bf(int var0) {
      if (af.isEmpty()) {
         return false;
      } else {
         ns var1 = (ns)af.get(0);
         return null != var1 && var0 == 734864821 * var1.ae;
      }
   }
}
