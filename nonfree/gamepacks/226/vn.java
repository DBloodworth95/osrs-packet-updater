public class vn extends tp {
   public Object[][] aj;
   public int[][] ak;
   static pe ap;
   public static mi aw = new mi(64);
   static vc[] an;
   public static int[] ag;

   void an() {
   }

   vn() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "vn.<init>(" + ')');
      }
   }

   public static vn am(int var0) {
      vn var1 = (vn)aw.ap((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = ap.bm(39, var0, 1056070265);
         var1 = new vn();
         if (null != var2) {
            var1.ak(new vl(var2), (byte)-75);
         }

         var1.ai((byte)7);
         aw.ak(var1, (long)var0);
         return var1;
      }
   }

   void ai(byte var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vn.ai(" + ')');
      }
   }

   public static void ay(pe var0) {
      ap = var0;
   }

   public static void as(pe var0) {
      ap = var0;
   }

   public static vn ae(int var0) {
      vn var1 = (vn)aw.ap((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = ap.bm(39, var0, 1543164960);
         var1 = new vn();
         if (null != var2) {
            var1.ak(new vl(var2), (byte)-55);
         }

         var1.ai((byte)-11);
         aw.ak(var1, (long)var0);
         return var1;
      }
   }

   void ak(vl var1, byte var2) {
      try {
         while(true) {
            int var3 = var1.cy((short)-6328);
            if (0 == var3) {
               if (var2 >= 4) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.aj(var1, var3, 1158183631);
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "vn.ak(" + ')');
      }
   }

   void at(vl var1) {
      while(true) {
         int var2 = var1.cy((short)-3859);
         if (0 == var2) {
            return;
         }

         this.aj(var1, var2, 854142812);
      }
   }

   void au(vl var1, int var2) {
      if (var2 == 1) {
         int var3 = var1.cy((short)-26029);
         if (null == this.ak) {
            this.ak = new int[var3][];
         }

         for(int var4 = var1.cy((short)-20817); var4 != 255; var4 = var1.cy((short)-18768)) {
            int var5 = var4 & 127;
            boolean var6 = (var4 & 128) != 0;
            int[] var7 = new int[var1.cy((short)-32401)];

            for(int var8 = 0; var8 < var7.length; ++var8) {
               var7[var8] = var1.dq(-2005938779);
            }

            this.ak[var5] = var7;
            if (var6) {
               if (this.aj == null) {
                  this.aj = new Object[this.ak.length][];
               }

               this.aj[var5] = bk.aj(var1, var7, 767532376);
            }
         }
      }

   }

   void aj(vl var1, int var2, int var3) {
      try {
         if (var2 == 1) {
            int var4 = var1.cy((short)-18053);
            if (null == this.ak) {
               if (var3 >= 1795351698) {
                  throw new IllegalStateException();
               }

               this.ak = new int[var4][];
            }

            for(int var5 = var1.cy((short)-2280); var5 != 255; var5 = var1.cy((short)-4880)) {
               int var6 = var5 & 127;
               boolean var10000;
               if ((var5 & 128) != 0) {
                  if (var3 >= 1795351698) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var7 = var10000;
               int[] var8 = new int[var1.cy((short)-20939)];

               for(int var9 = 0; var9 < var8.length; ++var9) {
                  if (var3 >= 1795351698) {
                     throw new IllegalStateException();
                  }

                  var8[var9] = var1.dq(484008960);
               }

               this.ak[var6] = var8;
               if (var7) {
                  if (var3 >= 1795351698) {
                     return;
                  }

                  if (this.aj == null) {
                     if (var3 >= 1795351698) {
                        throw new IllegalStateException();
                     }

                     this.aj = new Object[this.ak.length][];
                  }

                  this.aj[var6] = bk.aj(var1, var8, 767532376);
               }
            }
         }

      } catch (RuntimeException var10) {
         throw tm.aw(var10, "vn.aj(" + ')');
      }
   }
}
