public class uj extends tr {
   Object[][] ag;
   static ml ae = new ml(64);
   public static po ac;
   int[][] am;
   public int ax;

   void ax(byte var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "uj.ax(" + ')');
      }
   }

   void ai() {
   }

   public Object[] ag(int var1, int var2) {
      try {
         return null == this.ag ? null : this.ag[var1];
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "uj.ag(" + ')');
      }
   }

   public static uj ar(int var0) {
      uj var1 = (uj)ae.ac((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = ac.bt(38, var0, (byte)60);
         var1 = new uj();
         if (var2 != null) {
            var1.ae(new vf(var2), -1027346321);
         }

         var1.ax((byte)-81);
         ae.ag(var1, (long)var0);
         return var1;
      }
   }

   public static void aj() {
      ae.am();
   }

   public static uj af(int var0) {
      uj var1 = (uj)ae.ac((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = ac.bt(38, var0, (byte)30);
         var1 = new uj();
         if (var2 != null) {
            var1.ae(new vf(var2), -1027346321);
         }

         var1.ax((byte)-5);
         ae.ag(var1, (long)var0);
         return var1;
      }
   }

   public static uj at(int var0) {
      uj var1 = (uj)ae.ac((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = ac.bt(38, var0, (byte)30);
         var1 = new uj();
         if (var2 != null) {
            var1.ae(new vf(var2), -1027346321);
         }

         var1.ax((byte)-77);
         ae.ag(var1, (long)var0);
         return var1;
      }
   }

   public static uj au(int var0) {
      uj var1 = (uj)ae.ac((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = ac.bt(38, var0, (byte)-2);
         var1 = new uj();
         if (var2 != null) {
            var1.ae(new vf(var2), -1027346321);
         }

         var1.ax((byte)-58);
         ae.ag(var1, (long)var0);
         return var1;
      }
   }

   void ae(vf var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cv(952452697);
            if (var3 == 0) {
               if (var2 != -1027346321) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.am(var1, var3, (byte)1);
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "uj.ae(" + ')');
      }
   }

   uj() {
      try {
         super();
         this.ax = 1044461381;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "uj.<init>(" + ')');
      }
   }

   void ad(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (var2 == 0) {
            return;
         }

         this.am(var1, var2, (byte)1);
      }
   }

   void ah(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (var2 == 0) {
            return;
         }

         this.am(var1, var2, (byte)1);
      }
   }

   public Object[] ap(int var1) {
      return null == this.ag ? null : this.ag[var1];
   }

   void ab(vf var1, int var2) {
      if (var2 == 3) {
         int var3 = var1.cv(952452697);
         if (null == this.ag) {
            this.ag = new Object[var3][];
            this.am = new int[var3][];
         }

         for(int var4 = var1.cv(952452697); -146818424 != var4; var4 = var1.cv(952452697)) {
            int var5 = var1.cv(952452697);
            int[] var6 = new int[var5];

            for(int var7 = 0; var7 < var5; ++var7) {
               var6[var7] = var1.ck((byte)0);
            }

            this.ag[var4] = mi.am(var1, var6, (byte)-40);
            this.am[var4] = var6;
         }
      } else if (var2 == 4) {
         this.ax = var1.dl(-1227250718) * -1044461381;
      }

   }

   void al(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (var2 == 0) {
            return;
         }

         this.am(var1, var2, (byte)1);
      }
   }

   void aa(vf var1, int var2) {
      if (var2 == 3) {
         int var3 = var1.cv(952452697);
         if (null == this.ag) {
            this.ag = new Object[var3][];
            this.am = new int[var3][];
         }

         for(int var4 = var1.cv(952452697); 255 != var4; var4 = var1.cv(952452697)) {
            int var5 = var1.cv(952452697);
            int[] var6 = new int[var5];

            for(int var7 = 0; var7 < var5; ++var7) {
               var6[var7] = var1.ck((byte)64);
            }

            this.ag[var4] = mi.am(var1, var6, (byte)-29);
            this.am[var4] = var6;
         }
      } else if (var2 == 4) {
         this.ax = var1.dl(-1929988529) * 1007279707;
      }

   }

   void am(vf var1, int var2, byte var3) {
      try {
         if (var2 == 3) {
            int var4 = var1.cv(952452697);
            if (null == this.ag) {
               if (var3 != 1) {
                  throw new IllegalStateException();
               }

               this.ag = new Object[var4][];
               this.am = new int[var4][];
            }

            for(int var5 = var1.cv(952452697); 255 != var5; var5 = var1.cv(952452697)) {
               if (var3 != 1) {
                  return;
               }

               int var6 = var1.cv(952452697);
               int[] var7 = new int[var6];

               for(int var8 = 0; var8 < var6; ++var8) {
                  if (var3 != 1) {
                     throw new IllegalStateException();
                  }

                  var7[var8] = var1.ck((byte)31);
               }

               this.ag[var5] = mi.am(var1, var7, (byte)-20);
               this.am[var5] = var7;
            }
         } else if (var2 == 4) {
            if (var3 != 1) {
               return;
            }

            this.ax = var1.dl(-801441399) * -1044461381;
         }

      } catch (RuntimeException var9) {
         throw vk.ae(var9, "uj.am(" + ')');
      }
   }

   void ao() {
   }

   void as() {
   }

   void ay() {
   }

   void az(vf var1, int var2) {
      if (var2 == 3) {
         int var3 = var1.cv(952452697);
         if (null == this.ag) {
            this.ag = new Object[var3][];
            this.am = new int[var3][];
         }

         for(int var4 = var1.cv(952452697); 255 != var4; var4 = var1.cv(952452697)) {
            int var5 = var1.cv(952452697);
            int[] var6 = new int[var5];

            for(int var7 = 0; var7 < var5; ++var7) {
               var6[var7] = var1.ck((byte)-102);
            }

            this.ag[var4] = mi.am(var1, var6, (byte)9);
            this.am[var4] = var6;
         }
      } else if (var2 == 4) {
         this.ax = var1.dl(-1056359866) * -1044461381;
      }

   }

   public static void av() {
      ae.am();
   }

   public static void aw() {
      ae.am();
   }
}
