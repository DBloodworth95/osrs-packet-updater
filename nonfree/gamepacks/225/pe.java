import java.util.Comparator;

final class pe implements Comparator {
   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "pe.equals(" + ')');
      }
   }

   int ac(pv var1, pv var2, int var3) {
      try {
         byte var10000;
         if (var1.ag.am * -198478463 < -198478463 * var2.ag.am) {
            if (var3 >= -65837053) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else if (-198478463 * var2.ag.am == var1.ag.am * -198478463) {
            if (var3 >= -65837053) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = 1;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "pe.ac(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ac((pv)var1, (pv)var2, -837520499);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "pe.compare(" + ')');
      }
   }

   public int ax(Object var1, Object var2) {
      return this.ac((pv)var1, (pv)var2, -79097709);
   }

   public int aq(Object var1, Object var2) {
      return this.ac((pv)var1, (pv)var2, -1143002333);
   }

   public int af(Object var1, Object var2) {
      return this.ac((pv)var1, (pv)var2, -973184488);
   }

   public boolean gn(Object var1) {
      return super.equals(var1);
   }

   public boolean gg(Object var1) {
      return super.equals(var1);
   }

   int ae(pv var1, pv var2) {
      return var1.ag.am * -198478463 < -198478463 * var2.ag.am ? -1 : (-198478463 * var2.ag.am == var1.ag.am * -198478463 ? 0 : 1);
   }

   int ag(pv var1, pv var2) {
      return var1.ag.am * -198478463 < -198478463 * var2.ag.am ? -1 : (-198478463 * var2.ag.am == var1.ag.am * -198478463 ? 0 : 1);
   }

   int am(pv var1, pv var2) {
      return var1.ag.am * -198478463 < -198478463 * var2.ag.am ? -1 : (-198478463 * var2.ag.am == var1.ag.am * -198478463 ? 0 : 1);
   }

   int at(pv var1, pv var2) {
      return var1.ag.am * -198478463 < -198478463 * var2.ag.am ? -1 : (-198478463 * var2.ag.am == var1.ag.am * -198478463 ? 0 : 1);
   }

   static void na(int var0) {
      try {
         for(dj var1 = (dj)client.ol.am(); null != var1; var1 = (dj)client.ol.ax()) {
            if (var0 >= -1543186188) {
               throw new IllegalStateException();
            }

            int var2 = var1.ac * -1883588565;
            if (ir.ep.ag(var2, (byte)32)) {
               if (var0 >= -1543186188) {
                  throw new IllegalStateException();
               }

               boolean var3 = true;
               ny[] var4 = ir.ep.aq[var2];

               int var5;
               for(var5 = 0; var5 < var4.length; ++var5) {
                  if (var0 >= -1543186188) {
                     throw new IllegalStateException();
                  }

                  if (null != var4[var5]) {
                     var3 = var4[var5].bn;
                     break;
                  }
               }

               if (!var3) {
                  if (var0 >= -1543186188) {
                     return;
                  }

                  var5 = (int)var1.hk;
                  ny var6 = ir.ep.ac(var5, -1466397107);
                  if (var6 != null) {
                     if (var0 >= -1543186188) {
                        throw new IllegalStateException();
                     }

                     dc.ni(var6, 667850230);
                  }
               }
            }
         }

      } catch (RuntimeException var7) {
         throw vk.ae(var7, "pe.na(" + ')');
      }
   }
}
