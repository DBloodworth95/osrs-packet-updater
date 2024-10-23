public class un extends tr {
   static final int an = 1076101390;
   public static ml ae = new ml(64);
   public Object[][] am;
   public int[][] ag;
   static final int ax = 5;
   public static po ac;

   void ae(vf var1, byte var2) {
      try {
         while(true) {
            int var3 = var1.cv(952452697);
            if (0 == var3) {
               if (var2 == 10) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.ag(var1, var3, 852231286);
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "un.ae(" + ')');
      }
   }

   void ag(vf var1, int var2, int var3) {
      try {
         if (var2 == 1) {
            int var4 = var1.cv(952452697);
            if (null == this.ag) {
               if (var3 == -639671278) {
                  throw new IllegalStateException();
               }

               this.ag = new int[var4][];
            }

            for(int var5 = var1.cv(952452697); 255 != var5; var5 = var1.cv(952452697)) {
               if (var3 == -639671278) {
                  return;
               }

               int var6 = var5 & 127;
               boolean var10000;
               if (0 != (var5 & 128)) {
                  if (var3 == -639671278) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var7 = var10000;
               int[] var8 = new int[var1.cv(952452697)];

               for(int var9 = 0; var9 < var8.length; ++var9) {
                  var8[var9] = var1.ck((byte)-11);
               }

               this.ag[var6] = var8;
               if (var7) {
                  if (var3 == -639671278) {
                     return;
                  }

                  if (this.am == null) {
                     if (var3 == -639671278) {
                        throw new IllegalStateException();
                     }

                     this.am = new Object[this.ag.length][];
                  }

                  this.am[var6] = mi.am(var1, var8, (byte)-59);
               }
            }
         }

      } catch (RuntimeException var10) {
         throw vk.ae(var10, "un.ag(" + ')');
      }
   }

   void am(int var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "un.am(" + ')');
      }
   }

   public static un aq(int var0) {
      un var1 = (un)ae.ac((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = ac.bt(39, var0, (byte)-50);
         var1 = new un();
         if (var2 != null) {
            var1.ae(new vf(var2), (byte)-119);
         }

         var1.am(-1056183933);
         ae.ag(var1, (long)var0);
         return var1;
      }
   }

   public static un ax(int var0) {
      un var1 = (un)ae.ac((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = ac.bt(39, var0, (byte)-30);
         var1 = new un();
         if (var2 != null) {
            var1.ae(new vf(var2), (byte)-1);
         }

         var1.am(-1056183933);
         ae.ag(var1, (long)var0);
         return var1;
      }
   }

   void ap() {
   }

   un() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "un.<init>(" + ')');
      }
   }

   void at(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (0 == var2) {
            return;
         }

         this.ag(var1, var2, -1168071899);
      }
   }

   void au(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (0 == var2) {
            return;
         }

         this.ag(var1, var2, 848612097);
      }
   }

   void ar(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (0 == var2) {
            return;
         }

         this.ag(var1, var2, 287331096);
      }
   }

   void al(vf var1, int var2) {
      if (var2 == 1) {
         int var3 = var1.cv(952452697);
         if (null == this.ag) {
            this.ag = new int[var3][];
         }

         for(int var4 = var1.cv(952452697); 255 != var4; var4 = var1.cv(952452697)) {
            int var5 = var4 & 127;
            boolean var6 = 0 != (var4 & 128);
            int[] var7 = new int[var1.cv(952452697)];

            for(int var8 = 0; var8 < var7.length; ++var8) {
               var7[var8] = var1.ck((byte)23);
            }

            this.ag[var5] = var7;
            if (var6) {
               if (this.am == null) {
                  this.am = new Object[this.ag.length][];
               }

               this.am[var5] = mi.am(var1, var7, (byte)-100);
            }
         }
      }

   }

   void ah() {
   }

   void ad() {
   }

   void af(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (0 == var2) {
            return;
         }

         this.ag(var1, var2, -676132566);
      }
   }
}
