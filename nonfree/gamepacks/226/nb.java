public class nb {
   public static int[] aj;
   public static final int aw = 5000;
   public static int[] ak;
   static int[] ap = new int[32];

   public static void ay(int var0, int var1) {
      hg var3 = (hg)hg.aw.ap((long)var0);
      hg var2;
      if (var3 != null) {
         var2 = var3;
      } else {
         byte[] var4 = hg.ap.bm(14, var0, 1730637347);
         var3 = new hg();
         if (var4 != null) {
            var3.aw(new vl(var4), -1231273639);
         }

         hg.aw.ak(var3, (long)var0);
         var2 = var3;
      }

      int var8 = var2.ak * 3800026;
      int var5 = var2.aj * 346325327;
      int var6 = -1432610793 * var2.ai;
      int var7 = ap[var6 - var5];
      if (var1 < 0 || var1 > var7) {
         var1 = 0;
      }

      var7 <<= var5;
      aj[var8] = aj[var8] & ~var7 | var1 << var5 & var7;
   }

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         ap[var1] = var0 - 1;
         var0 += var0;
      }

      ak = new int[5000];
      aj = new int[5000];
   }

   public static int ak(int var0) {
      hg var2 = (hg)hg.aw.ap((long)var0);
      hg var1;
      if (null != var2) {
         var1 = var2;
      } else {
         byte[] var3 = hg.ap.bm(14, var0, 1524707903);
         var2 = new hg();
         if (null != var3) {
            var2.aw(new vl(var3), -1584153158);
         }

         hg.aw.ak(var2, (long)var0);
         var1 = var2;
      }

      int var7 = 201276445 * var1.ak;
      int var4 = 235411848 * var1.aj;
      int var5 = 521183991 * var1.ai;
      int var6 = ap[var5 - var4];
      return aj[var7] >> var4 & var6;
   }

   public static int aj(int var0) {
      hg var2 = (hg)hg.aw.ap((long)var0);
      hg var1;
      if (null != var2) {
         var1 = var2;
      } else {
         byte[] var3 = hg.ap.bm(14, var0, 1821088512);
         var2 = new hg();
         if (null != var3) {
            var2.aw(new vl(var3), -1842891557);
         }

         hg.aw.ak(var2, (long)var0);
         var1 = var2;
      }

      int var7 = 201276445 * var1.ak;
      int var4 = 346325327 * var1.aj;
      int var5 = -1432610793 * var1.ai;
      int var6 = ap[var5 - var4];
      return aj[var7] >> var4 & var6;
   }

   public static int ai(int var0) {
      hg var2 = (hg)hg.aw.ap((long)var0);
      hg var1;
      if (null != var2) {
         var1 = var2;
      } else {
         byte[] var3 = hg.ap.bm(14, var0, 702049925);
         var2 = new hg();
         if (null != var3) {
            var2.aw(new vl(var3), -1498796400);
         }

         hg.aw.ak(var2, (long)var0);
         var1 = var2;
      }

      int var7 = 201276445 * var1.ak;
      int var4 = 346325327 * var1.aj;
      int var5 = -1432610793 * var1.ai;
      int var6 = ap[var5 - var4];
      return aj[var7] >> var4 & var6;
   }

   public static void as(int var0, int var1) {
      hg var3 = (hg)hg.aw.ap((long)var0);
      hg var2;
      if (var3 != null) {
         var2 = var3;
      } else {
         byte[] var4 = hg.ap.bm(14, var0, 1572303410);
         var3 = new hg();
         if (var4 != null) {
            var3.aw(new vl(var4), -1375576027);
         }

         hg.aw.ak(var3, (long)var0);
         var2 = var3;
      }

      int var8 = var2.ak * 2077132615;
      int var5 = var2.aj * 346325327;
      int var6 = -1432610793 * var2.ai;
      int var7 = ap[var6 - var5];
      if (var1 < 0 || var1 > var7) {
         var1 = 0;
      }

      var7 <<= var5;
      aj[var8] = aj[var8] & ~var7 | var1 << var5 & var7;
   }

   nb() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "nb.<init>(" + ')');
      }
   }

   public static void ae(int var0, int var1) {
      hg var3 = (hg)hg.aw.ap((long)var0);
      hg var2;
      if (var3 != null) {
         var2 = var3;
      } else {
         byte[] var4 = hg.ap.bm(14, var0, 793553676);
         var3 = new hg();
         if (var4 != null) {
            var3.aw(new vl(var4), -2135125934);
         }

         hg.aw.ak(var3, (long)var0);
         var2 = var3;
      }

      int var8 = var2.ak * -207258428;
      int var5 = var2.aj * -1323001982;
      int var6 = -1432610793 * var2.ai;
      int var7 = ap[var6 - var5];
      if (var1 < 0 || var1 > var7) {
         var1 = 0;
      }

      var7 <<= var5;
      aj[var8] = aj[var8] & ~var7 | var1 << var5 & var7;
   }
}
