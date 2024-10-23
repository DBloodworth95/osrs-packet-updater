public class tk implements tf {
   public final ut ap;

   public int ap(int var1, int var2) {
      try {
         return this.ap.ap(var1, -996391250);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "tk.ap(" + ')');
      }
   }

   public tk(tl var1) {
      try {
         this(new uv(var1));
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "tk.<init>(" + ')');
      }
   }

   tk(uv var1) {
      try {
         super();
         this.ap = var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "tk.<init>(" + ')');
      }
   }

   public int aw(int var1) {
      return this.ap.ap(var1, -966988025);
   }

   public int ak(int var1) {
      return this.ap.ap(var1, -262122599);
   }

   public static boolean ap(int var0, int var1, int var2) {
      try {
         return 0 != (var0 >> var1 + 1 & 1);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "tk.ap(" + ')');
      }
   }

   public static vv aw(pe var0, int var1, int var2, byte var3) {
      try {
         if (!cb.am(var0, var1, var2, 1319610352)) {
            if (var3 <= 75) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            vv var5 = new vv();
            var5.ay = wk.aw * -1147402861;
            var5.as = -201283629 * wk.ak;
            var5.aj = wk.aj[0];
            var5.ai = tl.ai[0];
            var5.aw = ae.ay[0];
            var5.ak = wk.as[0];
            int var6 = var5.aw * var5.ak;
            byte[] var7 = ks.am[0];
            var5.ap = new int[var6];

            for(int var8 = 0; var8 < var6; ++var8) {
               var5.ap[var8] = wk.ae[var7[var8] & 255];
            }

            wk.aj = null;
            tl.ai = null;
            ae.ay = null;
            wk.as = null;
            wk.ae = null;
            ks.am = (byte[][])null;
            return var5;
         }
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "tk.aw(" + ')');
      }
   }

   public static int aw(vl var0, byte var1, int var2, byte var3) {
      try {
         int var4 = var1 >> var2 & 3;
         if (var4 == 3) {
            return var0.ch(1203709469);
         } else if (2 == var4) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               return var0.cg(-820932504);
            }
         } else if (1 == var4) {
            if (var3 != 0) {
               throw new IllegalStateException();
            } else {
               return var0.cu((byte)13);
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "tk.aw(" + ')');
      }
   }
}
