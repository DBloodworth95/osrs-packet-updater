public class hp {
   static final hp aw = new hp(1);
   static jk mw;
   static final hp ak = new hp(2);
   static final hp ap = new hp(0);
   static final hp ai = new hp(4);
   static String[] ag;
   static final hp aj = new hp(3);
   static final int bj = 2;
   static iz ew;

   static int bn(int var0, da var1, boolean var2, byte var3) {
      try {
         int var4;
         if (var0 == 5504) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               dp.am -= 1393015090;
               var4 = cm.ae[dp.am * -158156887];
               int var5 = cm.ae[-158156887 * dp.am + 1];
               if (!client.to) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  client.kp = var4 * 664926079;
                  client.kb = var5 * -1730551225;
               }

               return 1;
            }
         } else if (var0 == 5505) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = client.kp * 1882572927;
               return 1;
            }
         } else if (var0 == 5506) {
            cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 1833510775 * client.kb;
            return 1;
         } else if (var0 == 5530) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               var4 = cm.ae[(dp.am -= -1450976103) * -158156887];
               if (var4 < 0) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  var4 = 0;
               }

               client.lw = 1478792379 * var4;
               return 1;
            }
         } else if (var0 == 5531) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = client.lw * -1321693069;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "hp.bn(" + ')');
      }
   }

   static final int ad(int var0, int var1, short var2) {
      try {
         if (var0 == -2) {
            if (var2 >= 4124) {
               throw new IllegalStateException();
            } else {
               return 12345678;
            }
         } else if (var0 == -1) {
            if (var2 >= 4124) {
               throw new IllegalStateException();
            } else {
               if (var1 < 2) {
                  if (var2 >= 4124) {
                     throw new IllegalStateException();
                  }

                  var1 = 2;
               } else if (var1 > 126) {
                  if (var2 >= 4124) {
                     throw new IllegalStateException();
                  }

                  var1 = 126;
               }

               return var1;
            }
         } else {
            var1 = (var0 & 127) * var1 / 128;
            if (var1 < 2) {
               if (var2 >= 4124) {
                  throw new IllegalStateException();
               }

               var1 = 2;
            } else if (var1 > 126) {
               if (var2 >= 4124) {
                  throw new IllegalStateException();
               }

               var1 = 126;
            }

            return var1 + (var0 & 'ﾀ');
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "hp.ad(" + ')');
      }
   }

   hp(int var1) {
      try {
         super();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "hp.<init>(" + ')');
      }
   }

   static final do km(dn var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         for(do var6 = (do)var0.ac.as(); var6 != null; var6 = (do)var0.ac.am()) {
            if (var5 != 1181991581) {
               throw new IllegalStateException();
            }

            if (var1 == var6.ap * 1321466283 && var2 == -440355905 * var6.ak && var3 == var6.aj * 1462658139) {
               if (var5 != 1181991581) {
                  throw new IllegalStateException();
               }

               if (1704766835 * var6.aw == var4) {
                  if (var5 != 1181991581) {
                     throw new IllegalStateException();
                  }

                  return var6;
               }
            }
         }

         return null;
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "hp.km(" + ')');
      }
   }
}
