import java.util.Arrays;

public class me {
   public static final int ae = 2;
   static int[] at;
   static final byte af = 1;

   public static final boolean ag(char var0, int var1) {
      try {
         boolean var10000;
         if (160 != var0) {
            if (var1 != -2098954033) {
               throw new IllegalStateException();
            }

            if (var0 != ' ') {
               if (var1 != -2098954033) {
                  throw new IllegalStateException();
               }

               if ('_' != var0) {
                  if (var1 != -2098954033) {
                     throw new IllegalStateException();
                  }

                  if ('-' != var0) {
                     var10000 = false;
                     return var10000;
                  }

                  if (var1 != -2098954033) {
                     throw new IllegalStateException();
                  }
               }
            }
         }

         var10000 = true;
         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "me.ag(" + ')');
      }
   }

   public static void ag(int var0) {
      try {
         Arrays.fill(no.ag, 0);
         Arrays.fill(no.am, 0);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "me.ag(" + ')');
      }
   }

   static final void jg(String var0, boolean var1, byte var2) {
      try {
         if (!client.mk) {
            if (var2 >= 98) {
               throw new IllegalStateException();
            }
         } else {
            byte var3 = 4;
            int var4 = 6 + var3;
            int var5 = 6 + var3;
            int var6 = eq.iv.ap(var0, 250);
            int var7 = eq.iv.ab(var0, 250) * 13;
            vr.fr(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var7 + var3, 0);
            vr.fs(var4 - var3, var5 - var3, var6 + var3 + var3, var7 + var3 + var3, 16777215);
            eq.iv.aj(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
            int var8 = var4 - var3;
            int var9 = var5 - var3;
            int var10 = var3 + var3 + var6;
            int var11 = var3 + var7 + var3;

            for(int var12 = 0; var12 < -1513272411 * client.rc; ++var12) {
               if (client.rq[var12] + client.rv[var12] > var8) {
                  if (var2 >= 98) {
                     throw new IllegalStateException();
                  }

                  if (client.rq[var12] < var10 + var8) {
                     if (var2 >= 98) {
                        throw new IllegalStateException();
                     }

                     if (client.rx[var12] + client.rn[var12] > var9) {
                        if (var2 >= 98) {
                           throw new IllegalStateException();
                        }

                        if (client.rx[var12] < var11 + var9) {
                           if (var2 >= 98) {
                              return;
                           }

                           client.ri[var12] = true;
                        }
                     }
                  }
               }
            }

            if (var1) {
               lj.bi.ae(0, 0, 131201232);
            } else {
               bm.lt(var4, var5, var6, var7, (byte)-45);
            }

         }
      } catch (RuntimeException var13) {
         throw vk.ae(var13, "me.jg(" + ')');
      }
   }

   public static int cn(String var0, int var1) {
      try {
         return var0.length() + 2;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "me.cn(" + ')');
      }
   }

   me() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "me.<init>(" + ')');
      }
   }
}
