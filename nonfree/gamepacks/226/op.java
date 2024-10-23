public class op extends tw {
   public byte[] aw;
   static final int as = 3;
   public sl ak;
   public or aj;
   static final int by = 0;
   int ap;

   op() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "op.<init>(" + ')');
      }
   }

   public static void ak(byte[] var0, int var1) {
      try {
         synchronized(ru.ai) {
            if (var0.length == 100) {
               if (var1 != 1084716332) {
                  throw new IllegalStateException();
               }

               if (-927879311 * ru.ay < -1032568373 * ru.at) {
                  if (var1 != 1084716332) {
                     return;
                  }

                  ru.af[(ru.ay += -675860079) * -927879311 - 1] = var0;
                  return;
               }
            }

            if (var0.length == 5000) {
               if (var1 != 1084716332) {
                  throw new IllegalStateException();
               }

               if (ru.as * -440753185 < 442556591 * ru.au) {
                  ru.ar[(as += -2145462241) * -440753185 - 1] = var0;
                  return;
               }
            }

            if (var0.length == 10000) {
               if (var1 != 1084716332) {
                  return;
               }

               if (-578695597 * ru.ae < -1277306163 * ru.an) {
                  if (var1 != 1084716332) {
                     throw new IllegalStateException();
                  }

                  ru.ab[(ru.ae += 1057203675) * -578695597 - 1] = var0;
                  return;
               }
            }

            if (var0.length == 30000 && ru.am * 2134664353 < -1642211417 * ru.ao) {
               ru.az[(ru.am += 888307553) * 2134664353 - 1] = var0;
            } else {
               if (ru.ac != null) {
                  if (var1 != 1084716332) {
                     return;
                  }

                  for(int var3 = 0; var3 < vn.ag.length; ++var3) {
                     if (var1 != 1084716332) {
                        throw new IllegalStateException();
                     }

                     if (vn.ag[var3] == var0.length && av.ad[var3] < ru.ac[var3].length) {
                        if (var1 != 1084716332) {
                           throw new IllegalStateException();
                        }

                        ru.ac[var3][av.ad[var3]++] = var0;
                        return;
                     }
                  }
               }

            }
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "op.ak(" + ')');
      }
   }
}
