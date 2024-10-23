public class dk extends tw {
   static final int ao = 13;
   int[] ak;
   int[] aw;
   public static final int cs = 97;
   public static final int ar = 12;
   static final int ax = 24;
   public static final int ad = 1;
   public static final int aq = 5;
   static final int ay = 3;
   public static final int as = 6;
   static final int bz = 14;
   public static cc vt;
   static ud ap = new ud(32);
   static final String ho = "game-session/v1/tokens";

   static int as(int var0, int var1) {
      dk var2 = (dk)ap.ap((long)var0);
      if (var2 == null) {
         return -1;
      } else {
         return var1 >= 0 && var1 < var2.aw.length ? var2.aw[var1] : -1;
      }
   }

   static int au(int var0, int var1) {
      dk var2 = (dk)ap.ap((long)var0);
      if (var2 == null) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var2.ak.length ? var2.ak[var1] : 0;
      }
   }

   static int ae(int var0, int var1) {
      dk var2 = (dk)ap.ap((long)var0);
      if (var2 == null) {
         return -1;
      } else {
         return var1 >= 0 && var1 < var2.aw.length ? var2.aw[var1] : -1;
      }
   }

   static int at(int var0, int var1) {
      dk var2 = (dk)ap.ap((long)var0);
      if (var2 == null) {
         return -1;
      } else {
         return var1 >= 0 && var1 < var2.aw.length ? var2.aw[var1] : -1;
      }
   }

   static int am(int var0, int var1) {
      dk var2 = (dk)ap.ap((long)var0);
      if (var2 == null) {
         return -1;
      } else {
         return var1 >= 0 && var1 < var2.aw.length ? var2.aw[var1] : -1;
      }
   }

   static void al(int var0) {
      dk var1 = (dk)ap.ap((long)var0);
      if (var1 != null) {
         var1.kf();
      }
   }

   static int an(int var0, int var1) {
      dk var2 = (dk)ap.ap((long)var0);
      if (var2 == null) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var2.ak.length ? var2.ak[var1] : 0;
      }
   }

   static int az(int var0, int var1) {
      dk var2 = (dk)ap.ap((long)var0);
      if (var2 == null) {
         return 0;
      } else if (-1 == var1) {
         return 0;
      } else {
         int var3 = 0;

         for(int var4 = 0; var4 < var2.ak.length; ++var4) {
            if (var1 == var2.aw[var4]) {
               var3 += var2.ak[var4];
            }
         }

         return var3;
      }
   }

   static void ac(int var0, int var1, int var2, int var3) {
      dk var4 = (dk)ap.ap((long)var0);
      if (var4 == null) {
         var4 = new dk();
         ap.ak(var4, (long)var0);
      }

      if (var4.aw.length <= var1) {
         int[] var5 = new int[1 + var1];
         int[] var6 = new int[var1 + 1];

         int var7;
         for(var7 = 0; var7 < var4.aw.length; ++var7) {
            var5[var7] = var4.aw[var7];
            var6[var7] = var4.ak[var7];
         }

         for(var7 = var4.aw.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.aw = var5;
         var4.ak = var6;
      }

      var4.aw[var1] = var2;
      var4.ak[var1] = var3;
   }

   static int ar(int var0, int var1) {
      dk var2 = (dk)ap.ap((long)var0);
      if (var2 == null) {
         return 0;
      } else if (-1 == var1) {
         return 0;
      } else {
         int var3 = 0;

         for(int var4 = 0; var4 < var2.ak.length; ++var4) {
            if (var1 == var2.aw[var4]) {
               var3 += var2.ak[var4];
            }
         }

         return var3;
      }
   }

   static int ab(int var0, int var1) {
      dk var2 = (dk)ap.ap((long)var0);
      if (var2 == null) {
         return 0;
      } else if (-1 == var1) {
         return 0;
      } else {
         int var3 = 0;

         for(int var4 = 0; var4 < var2.ak.length; ++var4) {
            if (var1 == var2.aw[var4]) {
               var3 += var2.ak[var4];
            }
         }

         return var3;
      }
   }

   dk() {
      try {
         super();
         this.aw = new int[]{-1};
         this.ak = new int[]{0};
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "dk.<init>(" + ')');
      }
   }

   static int ag(int var0, int var1) {
      dk var2 = (dk)ap.ap((long)var0);
      if (var2 == null) {
         return 0;
      } else if (-1 == var1) {
         return 0;
      } else {
         int var3 = 0;

         for(int var4 = 0; var4 < var2.ak.length; ++var4) {
            if (var1 == var2.aw[var4]) {
               var3 += var2.ak[var4];
            }
         }

         return var3;
      }
   }

   static void ad(int var0, int var1, int var2, int var3) {
      dk var4 = (dk)ap.ap((long)var0);
      if (var4 == null) {
         var4 = new dk();
         ap.ak(var4, (long)var0);
      }

      if (var4.aw.length <= var1) {
         int[] var5 = new int[1 + var1];
         int[] var6 = new int[var1 + 1];

         int var7;
         for(var7 = 0; var7 < var4.aw.length; ++var7) {
            var5[var7] = var4.aw[var7];
            var6[var7] = var4.ak[var7];
         }

         for(var7 = var4.aw.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.aw = var5;
         var4.ak = var6;
      }

      var4.aw[var1] = var2;
      var4.ak[var1] = var3;
   }

   static int ao(int var0, int var1) {
      dk var2 = (dk)ap.ap((long)var0);
      if (var2 == null) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var2.ak.length ? var2.ak[var1] : 0;
      }
   }

   static void av(int var0, int var1, int var2, int var3) {
      dk var4 = (dk)ap.ap((long)var0);
      if (var4 == null) {
         var4 = new dk();
         ap.ak(var4, (long)var0);
      }

      if (var4.aw.length <= var1) {
         int[] var5 = new int[1 + var1];
         int[] var6 = new int[var1 + 1];

         int var7;
         for(var7 = 0; var7 < var4.aw.length; ++var7) {
            var5[var7] = var4.aw[var7];
            var6[var7] = var4.ak[var7];
         }

         for(var7 = var4.aw.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.aw = var5;
         var4.ak = var6;
      }

      var4.aw[var1] = var2;
      var4.ak[var1] = var3;
   }

   static void ax(int var0) {
      dk var1 = (dk)ap.ap((long)var0);
      if (null != var1) {
         for(int var2 = 0; var2 < var1.aw.length; ++var2) {
            var1.aw[var2] = -1;
            var1.ak[var2] = 0;
         }

      }
   }

   static void aq(int var0) {
      dk var1 = (dk)ap.ap((long)var0);
      if (null != var1) {
         for(int var2 = 0; var2 < var1.aw.length; ++var2) {
            var1.aw[var2] = -1;
            var1.ak[var2] = 0;
         }

      }
   }

   static int af(int var0, int var1) {
      dk var2 = (dk)ap.ap((long)var0);
      if (var2 == null) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var2.ak.length ? var2.ak[var1] : 0;
      }
   }

   static void aa(int var0) {
      dk var1 = (dk)ap.ap((long)var0);
      if (var1 != null) {
         var1.kf();
      }
   }

   static void ah(int var0) {
      dk var1 = (dk)ap.ap((long)var0);
      if (var1 != null) {
         var1.kf();
      }
   }

   static final int ag(int var0, int var1, int var2) {
      try {
         if (var0 == -1) {
            if (var2 >= 1607314093) {
               throw new IllegalStateException();
            } else {
               return 12345678;
            }
         } else {
            var1 = var1 * (var0 & 127) / 128;
            if (var1 < 2) {
               if (var2 >= 1607314093) {
                  throw new IllegalStateException();
               }

               var1 = 2;
            } else if (var1 > 126) {
               if (var2 >= 1607314093) {
                  throw new IllegalStateException();
               }

               var1 = 126;
            }

            return (var0 & 'ﾀ') + var1;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "dk.ag(" + ')');
      }
   }

   public static boolean at(pe var0, int var1, int var2) {
      try {
         byte[] var3 = var0.bf(var1, 945062162);
         if (null == var3) {
            return false;
         } else {
            gw.au(var3, 1654748662);
            return true;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "dk.at(" + ')');
      }
   }
}
