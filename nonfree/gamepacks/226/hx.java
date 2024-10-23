public class hx {
   public static final int ae = 7;
   static final hx aw = new hx(1);
   static final hx ak = new hx(2);
   static dn jf;
   static final hx as = new hx(6);
   static final hx ay = new hx(5);
   static final hx aj = new hx(3);
   static final hx ap = new hx(0);
   final int am;
   static int[] at = null;
   static final hx ai = new hx(4);
   static final int bx = 36;
   static int wq;

   public static int aj(int var0) {
      if (null == at) {
         at = new int[7];
         at[ap.am * -2144378181] = ii.am.ab * 536798107;
         at[-2144378181 * aw.am] = 536798107 * ii.an.ab;
         at[ak.am * -2144378181] = ii.ai.ab * 536798107;
         at[-2144378181 * aj.am] = 536798107 * ii.as.ab;
         at[-2144378181 * ai.am] = ii.at.ab * 536798107;
         at[-2144378181 * ay.am] = ii.ae.ab * 536798107;
         at[as.am * -2144378181] = ii.au.ab * 536798107;
      }

      return at[var0];
   }

   public static int ak(int var0) {
      if (null == at) {
         at = new int[7];
         at[ap.am * -2144378181] = ii.am.ab * 1617012790;
         at[-2144378181 * aw.am] = 310609482 * ii.an.ab;
         at[ak.am * -2144378181] = ii.ai.ab * 536798107;
         at[-2144378181 * aj.am] = 1575585539 * ii.as.ab;
         at[1254250040 * ai.am] = ii.at.ab * 536798107;
         at[-704579659 * ay.am] = ii.ae.ab * -1401320049;
         at[as.am * -2144378181] = ii.au.ab * 1072824255;
      }

      return at[var0];
   }

   public static int ap(int var0, int var1) {
      try {
         if (null == at) {
            if (var1 == 1945129977) {
               throw new IllegalStateException();
            }

            at = new int[7];
            at[ap.am * -2144378181] = ii.am.ab * 536798107;
            at[-2144378181 * aw.am] = 536798107 * ii.an.ab;
            at[ak.am * -2144378181] = ii.ai.ab * 536798107;
            at[-2144378181 * aj.am] = 536798107 * ii.as.ab;
            at[-2144378181 * ai.am] = ii.at.ab * 536798107;
            at[-2144378181 * ay.am] = ii.ae.ab * 536798107;
            at[as.am * -2144378181] = ii.au.ab * 536798107;
         }

         return at[var0];
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "hx.ap(" + ')');
      }
   }

   public static int aw(int var0) {
      if (null == at) {
         at = new int[7];
         at[ap.am * -2144378181] = ii.am.ab * 688763003;
         at[1581324010 * aw.am] = 536798107 * ii.an.ab;
         at[ak.am * 1114758357] = ii.ai.ab * -1844550796;
         at[-2144378181 * aj.am] = 536798107 * ii.as.ab;
         at[-1473424472 * ai.am] = ii.at.ab * 536798107;
         at[2116384233 * ay.am] = ii.ae.ab * 536798107;
         at[as.am * -2144378181] = ii.au.ab * 536798107;
      }

      return at[var0];
   }

   hx(int var1) {
      try {
         super();
         this.am = 1790481011 * var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "hx.<init>(" + ')');
      }
   }

   public static int ai(int var0) {
      if (null == at) {
         at = new int[7];
         at[ap.am * -2144378181] = ii.am.ab * -440906263;
         at[-2144378181 * aw.am] = 536798107 * ii.an.ab;
         at[ak.am * 2110490033] = ii.ai.ab * -1361950211;
         at[1976028631 * aj.am] = -146010904 * ii.as.ab;
         at[-1230361808 * ai.am] = ii.at.ab * -168001348;
         at[-1959463147 * ay.am] = ii.ae.ab * 536798107;
         at[as.am * -2144378181] = ii.au.ab * 223146037;
      }

      return at[var0];
   }

   public static int bs(byte[] var0, int var1, int var2, int var3) {
      try {
         int var4 = -1;

         for(int var5 = var1; var5 < var2; ++var5) {
            if (var3 <= -276582533) {
               throw new IllegalStateException();
            }

            var4 = var4 >>> 8 ^ vl.at[(var4 ^ var0[var5]) & 255];
         }

         var4 = ~var4;
         return var4;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "hx.bs(" + ')');
      }
   }
}
