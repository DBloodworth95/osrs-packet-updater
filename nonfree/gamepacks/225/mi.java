public final class mi {
   static long ac;
   static long ae;
   public static final int ah = 11;

   public static void aq(int var0) {
      try {
         uj.ae.am();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "mi.aq(" + ')');
      }
   }

   public static final synchronized long ae() {
      long var0 = System.currentTimeMillis();
      if (var0 < ac * 8085800780495672759L) {
         ae += (8085800780495672759L * ac - var0) * 8270228839489505047L;
      }

      ac = 1185967563150628871L * var0;
      return var0 + 4340951857660502183L * ae;
   }

   public static final synchronized long ag() {
      long var0 = System.currentTimeMillis();
      if (var0 < ac * 8085800780495672759L) {
         ae += (8085800780495672759L * ac - var0) * 8270228839489505047L;
      }

      ac = 1185967563150628871L * var0;
      return var0 + 4340951857660502183L * ae;
   }

   mi() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "mi.<init>(" + ')');
      }
   }

   static Object[] am(vf var0, int[] var1, byte var2) {
      try {
         int var3 = var0.ck((byte)54);
         Object[] var4 = new Object[var3 * var1.length];

         for(int var5 = 0; var5 < var3; ++var5) {
            if (var2 == 32) {
               throw new IllegalStateException();
            }

            for(int var6 = 0; var6 < var1.length; ++var6) {
               int var7 = var6 + var1.length * var5;
               ux var8 = dn.ae(var1[var6], (byte)-47);
               var4[var7] = var8.at(var0, -1529792146);
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "mi.am(" + ')');
      }
   }

   static final void le(dd var0, int var1) {
      try {
         for(dr var2 = (dr)var0.as.af(); null != var2; var2 = (dr)var0.as.au()) {
            if (var1 == -1975882559) {
               throw new IllegalStateException();
            }

            if (1115245231 * var2.ab > 0) {
               if (var1 == -1975882559) {
                  throw new IllegalStateException();
               }

               var2.ab -= 226118735;
            }

            if (var2.ab * 1115245231 == 0) {
               if (var1 == -1975882559) {
                  throw new IllegalStateException();
               }

               if (753760443 * var2.ax >= 0) {
                  if (!fq.as(var2.ax * 753760443, var2.af * 1767652333, (byte)-128)) {
                     continue;
                  }

                  if (var1 == -1975882559) {
                     return;
                  }
               }

               qt.la(var0, 1988317559 * var2.ac, 80105317 * var2.ae, 119580921 * var2.ag, var2.am * -1436696995, 753760443 * var2.ax, 127055519 * var2.aq, 1767652333 * var2.af, -828917415 * var2.al, -35039602);
               var2.jb();
            } else {
               if (var2.ap * 205361541 > 0) {
                  var2.ap -= 1242939213;
               }

               if (var2.ap * 205361541 == 0) {
                  if (var1 == -1975882559) {
                     throw new IllegalStateException();
                  }

                  if (var2.ag * 119580921 >= 1) {
                     if (var1 == -1975882559) {
                        throw new IllegalStateException();
                     }

                     if (var2.am * -1436696995 >= 1) {
                        if (var1 == -1975882559) {
                           throw new IllegalStateException();
                        }

                        if (119580921 * var2.ag <= 102) {
                           if (var1 == -1975882559) {
                              throw new IllegalStateException();
                           }

                           if (-1436696995 * var2.am <= 102) {
                              if (var1 == -1975882559) {
                                 return;
                              }

                              if (1729618773 * var2.at < 0 || fq.as(var2.at * 1729618773, var2.ar * -1642492447, (byte)-108)) {
                                 qt.la(var0, var2.ac * 1988317559, 80105317 * var2.ae, 119580921 * var2.ag, var2.am * -1436696995, var2.at * 1729618773, var2.au * -646332557, -1642492447 * var2.ar, -828917415 * var2.al, -35039602);
                                 var2.ap = -1242939213;
                                 if (1729618773 * var2.at == 753760443 * var2.ax) {
                                    if (var1 == -1975882559) {
                                       throw new IllegalStateException();
                                    }

                                    if (-1 == 753760443 * var2.ax) {
                                       if (var1 == -1975882559) {
                                          throw new IllegalStateException();
                                       }

                                       var2.jb();
                                       continue;
                                    }
                                 }

                                 if (753760443 * var2.ax == 1729618773 * var2.at) {
                                    if (var1 == -1975882559) {
                                       throw new IllegalStateException();
                                    }

                                    if (-646332557 * var2.au == 127055519 * var2.aq) {
                                       if (var1 == -1975882559) {
                                          throw new IllegalStateException();
                                       }

                                       if (var2.af * 1767652333 == var2.ar * -1642492447) {
                                          if (var1 == -1975882559) {
                                             return;
                                          }

                                          var2.jb();
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "mi.le(" + ')');
      }
   }
}
