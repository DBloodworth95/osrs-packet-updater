public class lp {
   public static final int ao = 17;
   final int ae;
   final int ag;
   public static int am;
   public static final String jl = "persists, please contact Jagex Support.";
   final int ac;

   static float ag(qo var0, float var1, float var2, float var3, byte var4) {
      try {
         float var5 = oy.ae(var0.ac, 492698401 * var0.ae, var1, (byte)54);
         if (Math.abs(var5) < ft.am) {
            if (var4 <= 0) {
               throw new IllegalStateException();
            } else {
               return var1;
            }
         } else {
            float var6 = oy.ae(var0.ac, var0.ae * 492698401, var2, (byte)42);
            if (Math.abs(var6) < ft.am) {
               if (var4 <= 0) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               float var7 = 0.0F;
               float var8 = 0.0F;
               float var9 = 0.0F;
               float var14 = 0.0F;
               boolean var15 = true;
               boolean var16 = false;

               do {
                  var16 = false;
                  if (var15) {
                     if (var4 <= 0) {
                        throw new IllegalStateException();
                     }

                     var7 = var1;
                     var14 = var5;
                     var8 = var2 - var1;
                     var9 = var8;
                     var15 = false;
                  }

                  if (Math.abs(var14) < Math.abs(var6)) {
                     if (var4 <= 0) {
                        throw new IllegalStateException();
                     }

                     var1 = var2;
                     var2 = var7;
                     var7 = var1;
                     var5 = var6;
                     var6 = var14;
                     var14 = var5;
                  }

                  boolean var10000;
                  float var17;
                  float var18;
                  label136: {
                     var17 = ft.ax * Math.abs(var2) + var3 * 0.5F;
                     var18 = 0.5F * (var7 - var2);
                     if (Math.abs(var18) > var17) {
                        if (var4 <= 0) {
                           throw new IllegalStateException();
                        }

                        if (0.0F != var6) {
                           if (var4 <= 0) {
                              throw new IllegalStateException();
                           }

                           var10000 = true;
                           break label136;
                        }
                     }

                     var10000 = false;
                  }

                  boolean var19 = var10000;
                  if (var19) {
                     label152: {
                        if (!(Math.abs(var9) < var17)) {
                           if (var4 <= 0) {
                              throw new IllegalStateException();
                           }

                           if (!(Math.abs(var5) <= Math.abs(var6))) {
                              float var13 = var6 / var5;
                              float var10;
                              float var11;
                              if (var7 == var1) {
                                 if (var4 <= 0) {
                                    throw new IllegalStateException();
                                 }

                                 var10 = var13 * 2.0F * var18;
                                 var11 = 1.0F - var13;
                              } else {
                                 var11 = var5 / var14;
                                 float var12 = var6 / var14;
                                 var10 = var13 * (2.0F * var18 * var11 * (var11 - var12) - (var12 - 1.0F) * (var2 - var1));
                                 var11 = (var11 - 1.0F) * (var12 - 1.0F) * (var13 - 1.0F);
                              }

                              if ((double)var10 > 0.0D) {
                                 if (var4 <= 0) {
                                    throw new IllegalStateException();
                                 }

                                 var11 = -var11;
                              } else {
                                 var10 = -var10;
                              }

                              var13 = var9;
                              var9 = var8;
                              if (2.0F * var10 < var11 * var18 * 3.0F - Math.abs(var17 * var11)) {
                                 if (var4 <= 0) {
                                    throw new IllegalStateException();
                                 }

                                 if (var10 < Math.abs(0.5F * var13 * var11)) {
                                    if (var4 <= 0) {
                                       throw new IllegalStateException();
                                    }

                                    var8 = var10 / var11;
                                    break label152;
                                 }
                              }

                              var8 = var18;
                              var9 = var18;
                              break label152;
                           }

                           if (var4 <= 0) {
                              throw new IllegalStateException();
                           }
                        }

                        var8 = var18;
                        var9 = var18;
                     }

                     var1 = var2;
                     var5 = var6;
                     if (Math.abs(var8) > var17) {
                        if (var4 <= 0) {
                           throw new IllegalStateException();
                        }

                        var2 += var8;
                     } else if ((double)var18 > 0.0D) {
                        if (var4 <= 0) {
                           throw new IllegalStateException();
                        }

                        var2 += var17;
                     } else {
                        var2 -= var17;
                     }

                     var6 = oy.ae(var0.ac, 492698401 * var0.ae, var2, (byte)82);
                     if ((double)(var6 * (var14 / Math.abs(var14))) > 0.0D) {
                        if (var4 <= 0) {
                           throw new IllegalStateException();
                        }

                        var15 = true;
                        var16 = true;
                     } else {
                        var16 = true;
                     }
                  }
               } while(var16);

               return var2;
            }
         }
      } catch (RuntimeException var20) {
         throw vk.ae(var20, "lp.ag(" + ')');
      }
   }

   lp(int var1, int var2, int var3) {
      try {
         super();
         this.ac = 595734327 * var1;
         this.ae = var2 * 601480083;
         this.ag = var3 * -938427987;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "lp.<init>(" + ')');
      }
   }

   static int bf(int var0, dt var1, boolean var2, int var3) {
      try {
         return 2;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "lp.bf(" + ')');
      }
   }
}
