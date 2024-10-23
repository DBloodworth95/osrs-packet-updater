public class mx {
   public static final int ah = 2048;
   public static final mx ac = new mx(5);
   public static final mx am = new mx(7);
   public static final mx aq = new mx(6);
   public static final mx ax = new mx(4);
   public static final mx af = new mx(14);
   public static final mx ag = new mx(2);
   public static final mx at = new mx(20);
   public static final mx au = new mx(11);
   public static final mx ae = new mx(14);
   public static final mx al = new mx(4);
   static String gd;
   public static final int bm = 512;
   public static final mx ar = new mx(7);

   public static mx[] ag() {
      return new mx[]{ac, ae, ag, am, ax, aq, af, at, au, ar, al};
   }

   public static mx[] ae() {
      return new mx[]{ac, ae, ag, am, ax, aq, af, at, au, ar, al};
   }

   static void ht(da var0, int var1) {
      try {
         if (var0 == client.ek) {
            if (var1 <= 1737270868) {
               throw new IllegalStateException();
            }
         } else {
            client.ek = var0;
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "mx.ht(" + ')');
      }
   }

   public static mx[] am() {
      return new mx[]{ac, ae, ag, am, ax, aq, af, at, au, ar, al};
   }

   mx(int var1) {
      try {
         super();
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "mx.<init>(" + ')');
      }
   }

   static final void nl(ny[] var0, int var1, byte var2) {
      try {
         for(int var3 = 0; var3 < var0.length; ++var3) {
            if (var2 >= 8) {
               throw new IllegalStateException();
            }

            ny var4 = var0[var3];
            if (var4 != null) {
               if (0 == -1256894539 * var4.bf) {
                  if (var2 >= 8) {
                     return;
                  }

                  if (var4.gr != null) {
                     if (var2 >= 8) {
                        throw new IllegalStateException();
                     }

                     nl(var4.gr, var1, (byte)-82);
                  }

                  dj var5 = (dj)client.ol.ac((long)(-1565465557 * var4.bh));
                  if (null != var5) {
                     if (var2 >= 8) {
                        throw new IllegalStateException();
                     }

                     fd.nh(var5.ac * -1883588565, var1, 1981602002);
                  }
               }

               do var7;
               if (var1 == 0) {
                  if (var2 >= 8) {
                     throw new IllegalStateException();
                  }

                  if (var4.fl != null) {
                     var7 = new do();
                     var7.ag = var4;
                     var7.ac = var4.fl;
                     ij.ac(var7, -1976546521);
                  }
               }

               if (1 == var1) {
                  if (var2 >= 8) {
                     throw new IllegalStateException();
                  }

                  if (var4.ga != null) {
                     if (var2 >= 8) {
                        throw new IllegalStateException();
                     }

                     if (var4.bd * -1614754997 >= 0) {
                        if (var2 >= 8) {
                           throw new IllegalStateException();
                        }

                        ny var8 = ir.ep.ac(-1565465557 * var4.bh, -1931167440);
                        if (null == var8) {
                           continue;
                        }

                        if (var2 >= 8) {
                           throw new IllegalStateException();
                        }

                        if (var8.gr == null) {
                           continue;
                        }

                        if (var2 >= 8) {
                           throw new IllegalStateException();
                        }

                        if (var4.bd * -1614754997 >= var8.gr.length) {
                           continue;
                        }

                        if (var2 >= 8) {
                           throw new IllegalStateException();
                        }

                        if (var8.gr[-1614754997 * var4.bd] != var4) {
                           if (var2 >= 8) {
                              return;
                           }
                           continue;
                        }
                     }

                     var7 = new do();
                     var7.ag = var4;
                     var7.ac = var4.ga;
                     ij.ac(var7, -2072424437);
                  }
               }
            }
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "mx.nl(" + ')');
      }
   }
}
