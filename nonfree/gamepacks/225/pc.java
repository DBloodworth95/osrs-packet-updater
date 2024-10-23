import java.util.HashSet;
import java.util.Set;

public class pc implements ps {
   static final pc am;
   static final pc at;
   static final pc ae;
   static final pc ac;
   static final pc ax;
   static final pc aq;
   static final pc af;
   static final pc ag;
   static final pc au;
   static final pc ar;
   static final pc al;
   static final pc ad;
   static final pc ah;
   final int ap;
   final Set ab;
   static vt[] kd;

   static boolean lb(int var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         return cb.lu(gs.jj.am * 97097587, var0, var1, var2, var3, var4, var5, 799068640);
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "pc.lb(" + ')');
      }
   }

   pc(String var1, int var2, pg[] var3) {
      try {
         super();
         this.ab = new HashSet();
         this.ap = -1413376101 * var2;
         pg[] var4 = var3;

         for(int var5 = 0; var5 < var4.length; ++var5) {
            pg var6 = var4[var5];
            this.ab.add(var6);
         }

      } catch (RuntimeException var7) {
         throw vk.ae(var7, "pc.<init>(" + ')');
      }
   }

   public int ac(int var1) {
      try {
         return this.ap * 409335443;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "pc.ac(" + ')');
      }
   }

   static {
      ac = new pc("", 0, new pg[]{pg.am, pg.ac});
      ae = new pc("", 1, new pg[]{pg.ag, pg.am, pg.ac});
      ag = new pc("", 2, new pg[]{pg.ag, pg.ae, pg.am});
      am = new pc("", 3, new pg[]{pg.ag});
      ax = new pc("", 4);
      aq = new pc("", 5, new pg[]{pg.ag, pg.am});
      af = new pc("", 6, new pg[]{pg.am});
      at = new pc("", 8, new pg[]{pg.ag, pg.am});
      au = new pc("", 9, new pg[]{pg.ag, pg.ae});
      ar = new pc("", 10, new pg[]{pg.ag});
      al = new pc("", 11, new pg[]{pg.ag});
      ad = new pc("", 12, new pg[]{pg.ag, pg.am});
      ah = new pc("", 13, new pg[]{pg.ag});
   }

   public int ae() {
      return this.ap * 409335443;
   }

   public int ag() {
      return this.ap * -529741855;
   }

   public static int ag(int var0, byte var1) {
      try {
         return tl.aq[var0 & 16383];
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "pc.ag(" + ')');
      }
   }

   public int am() {
      return this.ap * 409335443;
   }

   pc(String var1, int var2) {
      try {
         super();
         this.ab = new HashSet();
         this.ap = var2 * -1413376101;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "pc.<init>(" + ')');
      }
   }
}
