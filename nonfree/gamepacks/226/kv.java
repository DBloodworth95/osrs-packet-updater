import java.util.Iterator;

public class kv {
   static final int bc = 42;
   static final int an = 9;
   public static final kv ak = new kv(0, 2, 0);
   final int aj;
   final int ai;
   final int ay;
   public static final kv aw = new kv(2, 1, 2);
   public static final kv ap = new kv(1, 0, 4);

   boolean ai(float var1) {
      return var1 >= (float)(this.ay * 935019347);
   }

   boolean ap(float var1, int var2) {
      try {
         boolean var10000;
         if (var1 >= (float)(this.ay * 935019347)) {
            if (var2 != -518406032) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "kv.ap(" + ')');
      }
   }

   static kv aw(int var0, int var1) {
      try {
         kv[] var2 = new kv[]{ak, aw, ap};
         kv[] var3 = var2;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            if (var1 >= -1304294671) {
               throw new IllegalStateException();
            }

            kv var5 = var3[var4];
            if (46521641 * var5.ai == var0) {
               if (var1 >= -1304294671) {
                  throw new IllegalStateException();
               }

               return var5;
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "kv.aw(" + ')');
      }
   }

   boolean ak(float var1) {
      return var1 >= (float)(this.ay * 935019347);
   }

   boolean aj(float var1) {
      return var1 >= (float)(this.ay * 472084883);
   }

   static void bj(int var0, String var1, int var2) {
      try {
         dq.aa = var1;
         dq.al = 1675855525 * var0;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "kv.bj(" + ')');
      }
   }

   boolean ay(float var1) {
      return var1 >= (float)(this.ay * 935019347);
   }

   static kv as(int var0) {
      kv[] var1 = new kv[]{ak, aw, ap};
      kv[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         kv var4 = var2[var3];
         if (46521641 * var4.ai == var0) {
            return var4;
         }
      }

      return null;
   }

   static boolean mz(int var0, int var1) {
      try {
         for(int var2 = 0; var2 < -1805330559 * client.sr; ++var2) {
            if (var1 <= 1826512132) {
               throw new IllegalStateException();
            }

            if (client.sg[var2] == var0) {
               if (var1 <= 1826512132) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "kv.mz(" + ')');
      }
   }

   static void ir(byte var0) {
      try {
         Iterator var1 = client.jv.iterator();

         while(var1.hasNext()) {
            if (var0 <= 25) {
               throw new IllegalStateException();
            }

            dn var2 = (dn)var1.next();

            for(int var3 = 0; var3 < -1234749921 * var2.az; ++var3) {
               if (var0 <= 25) {
                  return;
               }

               int var4 = var2.ag[var3];
               so var5 = var2.ab[var4];
               if (null != var5) {
                  if (var0 <= 25) {
                     throw new IllegalStateException();
                  }

                  var5.ac(client.dt * -330508271, 531003044);
               }
            }
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "kv.ir(" + ')');
      }
   }

   static String ln(String var0, ng var1, int var2) {
      try {
         if (var0.indexOf("%") != -1) {
            if (var2 != -622775175) {
               throw new IllegalStateException();
            }

            for(int var3 = 1; var3 <= 5; ++var3) {
               if (var2 != -622775175) {
                  throw new IllegalStateException();
               }

               while(true) {
                  int var4 = var0.indexOf("%" + var3);
                  if (-1 == var4) {
                     if (var2 != -622775175) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  String var5 = var0.substring(0, var4);
                  int var7 = fz.mm(var1, var3 - 1, -1915548617);
                  String var6;
                  if (var7 < 999999999) {
                     if (var2 != -622775175) {
                        throw new IllegalStateException();
                     }

                     var6 = Integer.toString(var7);
                  } else {
                     var6 = "*";
                  }

                  var0 = var5 + var6 + var0.substring(2 + var4);
               }
            }
         }

         return var0;
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "kv.ln(" + ')');
      }
   }

   kv(int var1, int var2, int var3) {
      try {
         super();
         this.aj = var1 * 294348155;
         this.ai = var2 * 737677081;
         this.ay = 712505563 * var3;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "kv.<init>(" + ')');
      }
   }
}
