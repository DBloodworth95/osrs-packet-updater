import java.util.Comparator;
import java.util.Map.Entry;

class rp implements Comparator {
   static final int ad = 171;
   static final int cl = 36;
   // $FF: synthetic field
   final rl this$0;

   int ap(Entry var1, Entry var2, int var3) {
      try {
         return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "rp.ap(" + ')');
      }
   }

   static int av(int var0, da var1, boolean var2, byte var3) {
      try {
         ng var4 = qk.ek.ap(cm.ae[(dp.am -= -1450976103) * -158156887], 1678337910);
         if (2500 == var0) {
            if (var3 != 80) {
               throw new IllegalStateException();
            } else {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = -1305260519 * var4.bs;
               return 1;
            }
         } else if (var0 == 2501) {
            if (var3 != 80) {
               throw new IllegalStateException();
            } else {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 2100532037 * var4.bm;
               return 1;
            }
         } else if (2502 == var0) {
            if (var3 != 80) {
               throw new IllegalStateException();
            } else {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 2013768333 * var4.bo;
               return 1;
            }
         } else if (2503 == var0) {
            if (var3 != 80) {
               throw new IllegalStateException();
            } else {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var4.bd * -1662542495;
               return 1;
            }
         } else if (2504 == var0) {
            if (var3 != 80) {
               throw new IllegalStateException();
            } else {
               int[] var10000 = cm.ae;
               int var10001 = (dp.am += -1450976103) * -158156887 - 1;
               byte var10002;
               if (var4.bf) {
                  if (var3 != 80) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var10000[var10001] = var10002;
               return 1;
            }
         } else if (var0 == 2505) {
            if (var3 != 80) {
               throw new IllegalStateException();
            } else {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var4.bi * 53502319;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "rp.av(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ap((Entry)var1, (Entry)var2, -839535060);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "rp.compare(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "rp.equals(" + ')');
      }
   }

   public int ay(Object var1, Object var2) {
      return this.ap((Entry)var1, (Entry)var2, -839535060);
   }

   public int as(Object var1, Object var2) {
      return this.ap((Entry)var1, (Entry)var2, -839535060);
   }

   public int ae(Object var1, Object var2) {
      return this.ap((Entry)var1, (Entry)var2, -839535060);
   }

   public int am(Object var1, Object var2) {
      return this.ap((Entry)var1, (Entry)var2, -839535060);
   }

   public int at(Object var1, Object var2) {
      return this.ap((Entry)var1, (Entry)var2, -839535060);
   }

   public boolean gj(Object var1) {
      return super.equals(var1);
   }

   int aw(Entry var1, Entry var2) {
      return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
   }

   int ak(Entry var1, Entry var2) {
      return ((Float)var2.getValue()).compareTo((Float)var1.getValue());
   }

   rp(rl var1) {
      this.this$0 = var1;
   }
}
