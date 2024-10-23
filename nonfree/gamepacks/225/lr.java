public class lr {
   static final lr ac = new lr(0);
   static final int bf = 1076101603;
   final int ag;
   static final lr ae = new lr(1);
   static final int aq = 4;

   lr(int var1) {
      try {
         super();
         this.ag = 1975684393 * var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "lr.<init>(" + ')');
      }
   }

   static final void ag(dd var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         int[][][] var6 = var0.ar;
         int var7 = 754660757 * var0.ax - 1;
         int var8 = var0.aq * -1090907831 - 1;

         for(int var9 = var2; var9 <= var4 + var2; ++var9) {
            if (var5 <= 1612502940) {
               return;
            }

            for(int var10 = var1; var10 <= var3 + var1; ++var10) {
               if (var5 <= 1612502940) {
                  throw new IllegalStateException();
               }

               if (var10 >= 0 && var10 < var6[0].length - 1) {
                  if (var5 <= 1612502940) {
                     throw new IllegalStateException();
                  }

                  if (var9 >= 0) {
                     if (var5 <= 1612502940) {
                        throw new IllegalStateException();
                     }

                     if (var9 < var6[0][0].length - 1) {
                        if (var5 <= 1612502940) {
                           throw new IllegalStateException();
                        }

                        sy.aq[0][var10][var9] = 127;
                        if (var1 == var10) {
                           if (var5 <= 1612502940) {
                              throw new IllegalStateException();
                           }

                           if (var10 > 0) {
                              if (var5 <= 1612502940) {
                                 return;
                              }

                              var6[0][var10][var9] = var6[0][var10 - 1][var9];
                           }
                        }

                        if (var3 + var1 == var10) {
                           if (var5 <= 1612502940) {
                              throw new IllegalStateException();
                           }

                           if (var10 < var7) {
                              if (var5 <= 1612502940) {
                                 throw new IllegalStateException();
                              }

                              var6[0][var10][var9] = var6[0][var10 + 1][var9];
                           }
                        }

                        if (var2 == var9) {
                           if (var5 <= 1612502940) {
                              throw new IllegalStateException();
                           }

                           if (var9 > 0) {
                              if (var5 <= 1612502940) {
                                 throw new IllegalStateException();
                              }

                              var6[0][var10][var9] = var6[0][var10][var9 - 1];
                           }
                        }

                        if (var9 == var4 + var2 && var9 < var8) {
                           var6[0][var10][var9] = var6[0][var10][1 + var9];
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var11) {
         throw vk.ae(var11, "lr.ag(" + ')');
      }
   }
}
