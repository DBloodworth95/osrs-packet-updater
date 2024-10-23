public class he extends tr {
   static final int bw = 14;
   static ml ae = new ml(64);
   public boolean ag;
   static po ac;

   void au(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (var2 == 0) {
            return;
         }

         this.am(var1, var2, 188692396);
      }
   }

   he() {
      try {
         super();
         this.ag = false;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "he.<init>(" + ')');
      }
   }

   void am(vf var1, int var2, int var3) {
      try {
         if (var2 == 2) {
            if (var3 == 1630874049) {
               throw new IllegalStateException();
            }

            this.ag = true;
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "he.am(" + ')');
      }
   }

   public static void aq(po var0) {
      ac = var0;
   }

   void ag(vf var1, byte var2) {
      try {
         while(true) {
            int var3 = var1.cv(952452697);
            if (var3 == 0) {
               if (var2 != 74) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.am(var1, var3, -2038457994);
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "he.ag(" + ')');
      }
   }

   void ab(vf var1, int var2) {
      if (var2 == 2) {
         this.ag = true;
      }

   }

   public static void at(po var0) {
      ac = var0;
   }

   void ar(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (var2 == 0) {
            return;
         }

         this.am(var1, var2, -2024035846);
      }
   }

   void al(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (var2 == 0) {
            return;
         }

         this.am(var1, var2, -2070255306);
      }
   }

   void ad(vf var1, int var2) {
      if (var2 == 2) {
         this.ag = true;
      }

   }

   public static void af(po var0) {
      ac = var0;
   }

   void ap(vf var1, int var2) {
      if (var2 == 2) {
         this.ag = true;
      }

   }

   void ah(vf var1, int var2) {
      if (var2 == 2) {
         this.ag = true;
      }

   }

   public static void az() {
      ae.am();
   }

   public static void aa() {
      ae.am();
   }

   public static void ac(po var0, int var1) {
      try {
         hl.ac = var0;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "he.ac(" + ')');
      }
   }

   static final int ki(dd var0, int var1, int var2, int var3, int var4) {
      try {
         int var5 = var1 >> 7;
         int var6 = var2 >> 7;
         if (var5 >= 0) {
            if (var4 != 1364598893) {
               throw new IllegalStateException();
            }

            if (var6 >= 0) {
               if (var4 != 1364598893) {
                  throw new IllegalStateException();
               }

               if (var5 < var0.al[0].length) {
                  if (var4 != 1364598893) {
                     throw new IllegalStateException();
                  }

                  if (var6 < var0.al[0][0].length) {
                     int var7 = var3;
                     if (var3 < 3) {
                        if (var4 != 1364598893) {
                           throw new IllegalStateException();
                        }

                        if (2 == (var0.al[1][var5][var6] & 2)) {
                           if (var4 != 1364598893) {
                              throw new IllegalStateException();
                           }

                           var7 = var3 + 1;
                        }
                     }

                     int var8 = var1 & 127;
                     int var9 = var2 & 127;
                     int var10 = var8 * var0.ar[var7][var5 + 1][var6] + var0.ar[var7][var5][var6] * (128 - var8) >> 7;
                     int var11 = var0.ar[var7][var5 + 1][1 + var6] * var8 + (128 - var8) * var0.ar[var7][var5][1 + var6] >> 7;
                     return (128 - var9) * var10 + var11 * var9 >> 7;
                  }

                  if (var4 != 1364598893) {
                     throw new IllegalStateException();
                  }
               }
            }
         }

         return 0;
      } catch (RuntimeException var12) {
         throw vk.ae(var12, "he.ki(" + ')');
      }
   }

   public static hu ae(int var0, byte var1) {
      try {
         hu var2 = (hu)hu.ag.ac((long)var0);
         if (null != var2) {
            if (var1 == 13) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = hu.ac.bt(13, var0, (byte)-21);
            var2 = new hu();
            var2.ax = -1632855335 * var0;
            if (var3 != null) {
               if (var1 == 13) {
                  throw new IllegalStateException();
               }

               var2.ag(new vf(var3), (byte)122);
            }

            hu.ag.ag(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "he.ae(" + ')');
      }
   }
}
