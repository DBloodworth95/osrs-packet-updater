import java.util.Arrays;

public class kl {
   static final kl aj = new kl(0, 48, 48);
   static final kl ai = new kl(5, 64, 64);
   static final kl ak = new kl(2, 32, 32);
   protected static String bn;
   static final kl as = new kl(6, 128, 128);
   static final kl ay = new kl(3, 96, 96);
   static final kl[] au;
   final int ae;
   final int am;
   final int at;
   static final kl aw = new kl(4, 16, 16);
   static final kl ap = new kl(1, 8, 8);

   kl(int var1, int var2, int var3) {
      try {
         super();
         this.ae = -1642808171 * var1;
         this.am = var2 * 224555161;
         this.at = 1336672299 * var3;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "kl.<init>(" + ')');
      }
   }

   int ap(byte var1) {
      try {
         return this.am * 17621929 * 1855241859 * this.at;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "kl.ap(" + ')');
      }
   }

   int aw() {
      return this.am * 17621929 * 1855241859 * this.at;
   }

   public static void ak(int[] var0, int[] var1, int var2, int var3, int var4) {
      try {
         if (var2 < var3) {
            int var5 = (var3 + var2) / 2;
            int var6 = var2;
            int var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            int var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;
            byte var10000;
            if (Integer.MAX_VALUE == var7) {
               if (var4 <= -399734145) {
                  return;
               }

               var10000 = 0;
            } else {
               var10000 = 1;
            }

            byte var9 = var10000;

            for(int var10 = var2; var10 < var3; ++var10) {
               if (var4 <= -399734145) {
                  return;
               }

               if (var0[var10] < (var10 & var9) + var7) {
                  if (var4 <= -399734145) {
                     throw new IllegalStateException();
                  }

                  int var11 = var0[var10];
                  var0[var10] = var0[var6];
                  var0[var6] = var11;
                  int var12 = var1[var10];
                  var1[var10] = var1[var6];
                  var1[var6++] = var12;
               }
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            ak(var0, var1, var2, var6 - 1, 345112893);
            ak(var0, var1, var6 + 1, var3, 1615554084);
         }

      } catch (RuntimeException var13) {
         throw tm.aw(var13, "kl.ak(" + ')');
      }
   }

   int ak() {
      return this.am * 17621929 * 1855241859 * this.at;
   }

   int aj() {
      return this.am * 17621929 * 1855241859 * this.at;
   }

   static final void mi(int var0, int var1, int var2, boolean var3, byte var4) {
      try {
         if (!qk.ek.ak(var0, 1754599176)) {
            if (var4 <= 0) {
               throw new IllegalStateException();
            }
         } else {
            ga.mu(qk.ek.ay[var0], -1, var1, var2, var3, -873242019);
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "kl.mi(" + ')');
      }
   }

   static {
      kl[] var0 = new kl[]{aj, ap, ak, ay, aw, ai, as};
      au = var0;
      Arrays.sort(au, new kd());
   }
}
