public class gi extends tr {
   public static ml ae = new ml(64);
   public static po ac;
   public int ag;

   static void mt(ny var0, int var1, int var2, int var3) {
      try {
         if (0 == var0.bw * 372547349) {
            if (var3 == -770057236) {
               throw new IllegalStateException();
            }

            var0.bl = 2018874065 * var0.by;
         } else if (1 == 372547349 * var0.bw) {
            if (var3 == -770057236) {
               return;
            }

            var0.bl = -384848233 * (var0.by * 515235543 + (var1 - -1339552805 * var0.bu) / 2);
         } else if (2 == 372547349 * var0.bw) {
            if (var3 == -770057236) {
               throw new IllegalStateException();
            }

            var0.bl = (var1 - var0.bu * -1339552805 - 515235543 * var0.by) * -384848233;
         } else if (372547349 * var0.bw == 3) {
            var0.bl = -384848233 * (var1 * 515235543 * var0.by >> 14);
         } else if (var0.bw * 372547349 == 4) {
            var0.bl = ((var1 * var0.by * 515235543 >> 14) + (var1 - var0.bu * -1339552805) / 2) * -384848233;
         } else {
            var0.bl = -384848233 * (var1 - -1339552805 * var0.bu - (var1 * 515235543 * var0.by >> 14));
         }

         if (-128670653 * var0.ba == 0) {
            if (var3 == -770057236) {
               return;
            }

            var0.bz = var0.bb * -93300891;
         } else if (-128670653 * var0.ba == 1) {
            if (var3 == -770057236) {
               return;
            }

            var0.bz = 1099667161 * ((var2 - 1036386215 * var0.br) / 2 + 1945757037 * var0.bb);
         } else if (2 == var0.ba * -128670653) {
            if (var3 == -770057236) {
               throw new IllegalStateException();
            }

            var0.bz = 1099667161 * (var2 - 1036386215 * var0.br - 1945757037 * var0.bb);
         } else if (-128670653 * var0.ba == 3) {
            if (var3 == -770057236) {
               throw new IllegalStateException();
            }

            var0.bz = 1099667161 * (var2 * var0.bb * 1945757037 >> 14);
         } else if (-128670653 * var0.ba == 4) {
            if (var3 == -770057236) {
               throw new IllegalStateException();
            }

            var0.bz = ((var2 * var0.bb * 1945757037 >> 14) + (var2 - 1036386215 * var0.br) / 2) * 1099667161;
         } else {
            var0.bz = 1099667161 * (var2 - var0.br * 1036386215 - (var0.bb * 1945757037 * var2 >> 14));
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "gi.mt(" + ')');
      }
   }

   void ae(vf var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cv(952452697);
            if (0 == var3) {
               if (var2 != -1786354781) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.ag(var1, var3, 1731411368);
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "gi.ae(" + ')');
      }
   }

   void ag(vf var1, int var2, int var3) {
      try {
         if (var2 == 2) {
            this.ag = var1.ct(-1363796227) * -549598727;
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "gi.ag(" + ')');
      }
   }

   gi() {
      try {
         super();
         this.ag = 0;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "gi.<init>(" + ')');
      }
   }

   void af(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (0 == var2) {
            return;
         }

         this.ag(var1, var2, 1731411368);
      }
   }

   public static gi ax(int var0) {
      gi var1 = (gi)ae.ac((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = ac.bt(5, var0, (byte)23);
         var1 = new gi();
         if (var2 != null) {
            var1.ae(new vf(var2), -1786354781);
         }

         ae.ag(var1, (long)var0);
         return var1;
      }
   }

   void aq(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (0 == var2) {
            return;
         }

         this.ag(var1, var2, 1731411368);
      }
   }

   public static gi am(int var0) {
      gi var1 = (gi)ae.ac((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = ac.bt(5, var0, (byte)67);
         var1 = new gi();
         if (var2 != null) {
            var1.ae(new vf(var2), -1786354781);
         }

         ae.ag(var1, (long)var0);
         return var1;
      }
   }

   void at(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (0 == var2) {
            return;
         }

         this.ag(var1, var2, 1731411368);
      }
   }

   void au(vf var1, int var2) {
      if (var2 == 2) {
         this.ag = var1.ct(-1466528558) * -549598727;
      }

   }
}
