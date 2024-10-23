public class eq extends se {
   final boolean ac;
   public static final int bf = 31;
   static final int ar = 10;
   static qu iv;
   static of fd;

   public int aq(Object var1, Object var2) {
      return this.ac((sq)var1, (sq)var2, 771283933);
   }

   int ac(sq var1, sq var2, int var3) {
      try {
         if (914504241 * client.cn == var1.ax * -1744892407) {
            if (var3 != 771283933) {
               throw new IllegalStateException();
            }

            if (client.cn * 914504241 == var2.ax * -1744892407) {
               if (var3 != 771283933) {
                  throw new IllegalStateException();
               }

               int var10000;
               if (this.ac) {
                  if (var3 != 771283933) {
                     throw new IllegalStateException();
                  }

                  var10000 = var1.bh((byte)17).ax(var2.bh((byte)-16), -1401052224);
               } else {
                  var10000 = var2.bh((byte)17).ax(var1.bh((byte)-8), 211585010);
               }

               return var10000;
            }
         }

         return this.ar(var1, var2, (byte)-17);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "eq.ac(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ac((sq)var1, (sq)var2, 771283933);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "eq.compare(" + ')');
      }
   }

   public int ax(Object var1, Object var2) {
      return this.ac((sq)var1, (sq)var2, 771283933);
   }

   public eq(boolean var1) {
      try {
         super();
         this.ac = var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "eq.<init>(" + ')');
      }
   }

   public int af(Object var1, Object var2) {
      return this.ac((sq)var1, (sq)var2, 771283933);
   }

   static final void au(dd var0, byte[] var1, int var2, int var3, int var4) {
      try {
         vf var5 = new vf(var1);
         int var6 = -1;

         do {
            int var7 = var5.df(-1054010182);
            if (var7 == 0) {
               if (var4 >= -515103935) {
                  throw new IllegalStateException();
               }

               return;
            }

            var6 += var7;
            int var8 = 0;

            while(true) {
               int var9 = var5.ck((byte)14);
               if (var9 == 0) {
                  break;
               }

               var8 += var9 - 1;
               int var10 = var8 & 63;
               int var11 = var8 >> 6 & 63;
               int var12 = var8 >> 12;
               int var13 = var5.cv(952452697);
               int var14 = var13 >> 2;
               int var15 = var13 & 3;
               int var16 = var2 + var11;
               int var17 = var10 + var3;
               if (var16 > 0) {
                  if (var4 >= -515103935) {
                     throw new IllegalStateException();
                  }

                  if (var17 > 0) {
                     if (var4 >= -515103935) {
                        return;
                     }

                     if (var16 < var0.ar[0].length - 2) {
                        if (var4 >= -515103935) {
                           throw new IllegalStateException();
                        }

                        if (var17 < var0.ar[0][0].length - 2) {
                           if (var4 >= -515103935) {
                              throw new IllegalStateException();
                           }

                           int var18 = var12;
                           if (2 == (var0.al[1][var16][var17] & 2)) {
                              var18 = var12 - 1;
                           }

                           kd var19 = null;
                           if (var18 >= 0) {
                              if (var4 >= -515103935) {
                                 return;
                              }

                              if (var0.ag != null) {
                                 if (var4 >= -515103935) {
                                    throw new IllegalStateException();
                                 }

                                 var19 = var0.ag[var18];
                              }
                           }

                           or.al(var0, var12, var16, var17, var6, var15, var14, var19, 808196321);
                        }
                     }
                  }
               }
            }
         } while(var4 < -515103935);

         throw new IllegalStateException();
      } catch (RuntimeException var20) {
         throw vk.ae(var20, "eq.au(" + ')');
      }
   }

   static int ac(int var0, int var1, int var2, int var3) {
      try {
         if (var2 > 179) {
            if (var3 == -935978979) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         if (var2 > 192) {
            if (var3 == -935978979) {
               throw new IllegalStateException();
            }

            var1 /= 2;
         }

         if (var2 > 217) {
            var1 /= 2;
         }

         if (var2 > 243) {
            var1 /= 2;
         }

         int var4 = var2 / 2 + (var0 / 4 << 10) + (var1 / 32 << 7);
         return var4;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "eq.ac(" + ')');
      }
   }

   public static gy ae(int var0, int var1) {
      try {
         gy var2 = (gy)gy.ag.ac((long)var0);
         if (var2 != null) {
            if (var1 <= 1099195466) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = gy.ac.bt(16, var0, (byte)31);
            var2 = new gy();
            if (var3 != null) {
               if (var1 <= 1099195466) {
                  throw new IllegalStateException();
               }

               var2.ag(new vf(var3), 619255888);
            }

            gy.ag.ag(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "eq.ae(" + ')');
      }
   }
}
