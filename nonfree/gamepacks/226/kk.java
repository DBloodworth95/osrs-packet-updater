public class kk implements ph {
   public static final kk aw = new kk((byte)0, 0.5F);
   public static final kk am = new kk((byte)7, 4.0F);
   public static final kk ak = new kk((byte)1, 1.0F);
   public static final kk as = new kk((byte)5, 3.0F);
   public static final kk ai = new kk((byte)3, 1.5F);
   public static final kk ay = new kk((byte)4, 2.5F);
   public static final kk ap = new kk((byte)-1, 0.0F);
   public static final kk ae = new kk((byte)6, 3.5F);
   static int[] jj;
   final byte at;
   static kk[] au;
   public static final kk aj = new kk((byte)2, 2.0F);
   public static final int aq = 54;

   kk(byte var1, float var2) {
      try {
         super();
         this.at = var1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "kk.<init>(" + ')');
      }
   }

   public int aw(int var1) {
      try {
         return this.at;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "kk.aw(" + ')');
      }
   }

   static final void lb(int var0, String var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      try {
         if (client.nr) {
            if (var9 == 1846465855) {
               throw new IllegalStateException();
            }
         } else if (!co.lt(var8, var3, (byte)-123)) {
            if (var9 != 1846465855) {
               ;
            }
         } else {
            if (var0 >= 0) {
               if (var9 == 1846465855) {
                  return;
               }

               if (var0 < client.ng.au.length) {
                  if (null == client.ng.au[var0]) {
                     if (var9 == 1846465855) {
                        throw new IllegalStateException();
                     }

                     client.ng.au[var0] = new ww(false);
                  }

                  client.ng.au[var0].an(var1, var2, var3, var4, var5, var6, var7, false, var8, 1067925022);
                  return;
               }

               if (var9 == 1846465855) {
                  throw new IllegalStateException();
               }
            }

         }
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "kk.lb(" + ')');
      }
   }

   public int as() {
      return this.at;
   }

   static {
      kk[] var0 = new kk[]{aj, aw, ay, as, ap, ae, am, ak, ai};
      au = var0;
      StringBuilder var4 = new StringBuilder();
      kk[] var1 = au;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         kk var3 = var1[var2];
         var4.append(var3.at);
         var4.append(", ");
      }

      String var5 = var4.toString();
      var5.substring(0, var5.length() - 2);
   }

   public static boolean ap(int var0, int var1) {
      try {
         boolean var10000;
         if (var0 != 10) {
            if (var1 >= 1625945013) {
               throw new IllegalStateException();
            }

            if (var0 != 11) {
               if (var1 >= 1625945013) {
                  throw new IllegalStateException();
               }

               if (12 != var0 && 13 != var0 && var0 != 14) {
                  if (var1 >= 1625945013) {
                     throw new IllegalStateException();
                  }

                  if (15 != var0) {
                     if (var1 >= 1625945013) {
                        throw new IllegalStateException();
                     }

                     if (var0 != 16) {
                        if (var1 >= 1625945013) {
                           throw new IllegalStateException();
                        }

                        if (17 != var0) {
                           var10000 = false;
                           return var10000;
                        }

                        if (var1 >= 1625945013) {
                           throw new IllegalStateException();
                        }
                     }
                  }
               }
            }
         }

         var10000 = true;
         return var10000;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "kk.ap(" + ')');
      }
   }
}
