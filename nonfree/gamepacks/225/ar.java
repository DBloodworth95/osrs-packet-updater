public class ar implements ps {
   static final ar am = new ar(3, "PATCH", false, true);
   public static final ar ae = new ar(1, "GET", true, false);
   public static final ar ac = new ar(0, "POST", true, true);
   static int uw;
   static final ar ax = new ar(4, "DELETE", false, true);
   int aq;
   String af;
   boolean at;
   boolean au;
   static final int an = 27;
   static final int ls = 16;
   static final int ah = 13;
   static final ar ag = new ar(2, "PUT", false, true);

   ar(int var1, String var2, boolean var3, boolean var4) {
      try {
         super();
         this.aq = 1540115535 * var1;
         this.af = var2;
         this.at = var3;
         this.au = var4;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ar.<init>(" + ')');
      }
   }

   public String aq(int var1) {
      try {
         return this.af;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ar.aq(" + ')');
      }
   }

   public int ac(int var1) {
      try {
         return -890811729 * this.aq;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ar.ac(" + ')');
      }
   }

   boolean ax(int var1) {
      try {
         return this.at;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ar.ax(" + ')');
      }
   }

   static void ag(String[] var0, int[] var1, int var2, int var3, byte var4) {
      try {
         if (var2 < var3) {
            if (var4 != 0) {
               throw new IllegalStateException();
            }

            int var5 = (var3 + var2) / 2;
            int var6 = var2;
            String var7 = var0[var5];
            var0[var5] = var0[var3];
            var0[var3] = var7;
            int var8 = var1[var5];
            var1[var5] = var1[var3];
            var1[var3] = var8;

            for(int var9 = var2; var9 < var3; ++var9) {
               if (null != var7) {
                  if (var4 != 0) {
                     throw new IllegalStateException();
                  }

                  if (var0[var9] == null) {
                     continue;
                  }

                  if (var4 != 0) {
                     throw new IllegalStateException();
                  }

                  if (var0[var9].compareTo(var7) >= (var9 & 1)) {
                     continue;
                  }

                  if (var4 != 0) {
                     return;
                  }
               }

               String var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               int var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }

            var0[var3] = var0[var6];
            var0[var6] = var7;
            var1[var3] = var1[var6];
            var1[var6] = var8;
            ag(var0, var1, var2, var6 - 1, (byte)0);
            ag(var0, var1, 1 + var6, var3, (byte)0);
         }

      } catch (RuntimeException var12) {
         throw vk.ae(var12, "ar.ag(" + ')');
      }
   }

   public int ae() {
      return -890811729 * this.aq;
   }

   public int ag() {
      return -890811729 * this.aq;
   }

   boolean af(short var1) {
      try {
         return this.au;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ar.af(" + ')');
      }
   }

   boolean at() {
      return this.at;
   }

   boolean au() {
      return this.at;
   }

   public String ar() {
      return this.af;
   }

   boolean al() {
      return this.au;
   }

   static String ae(int var0, int var1) {
      try {
         return "<col=" + Integer.toHexString(var0) + ">";
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ar.ae(" + ')');
      }
   }

   static void pl(int var0, int var1) {
      try {
         if var2 = ds.ae(var0, -683358200);
         if (!var2.ad(-1886359056)) {
            if (var1 == -258628319) {
               throw new IllegalStateException();
            }
         } else {
            if (et.ab(var2.al * -1824748027, (byte)-62) == 2) {
               if (var1 == -258628319) {
                  throw new IllegalStateException();
               }

               client.wo.add(-1824748027 * var2.al);
            }

         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ar.pl(" + ')');
      }
   }

   public int am() {
      return -890811729 * this.aq;
   }
}
