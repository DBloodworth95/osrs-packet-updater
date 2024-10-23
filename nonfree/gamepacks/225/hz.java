public class hz {
   static final hz ag = new hz(2);
   static final hz aq = new hz(5);
   static final hz ac = new hz(0);
   static final hz am = new hz(3);
   static final hz ax = new hz(4);
   static final int bp = 49;
   static final hz af = new hz(6);
   public static final int at = 7;
   final int au;
   public static int[] ar = null;
   static final hz ae = new hz(1);
   static final int me = 2048;
   public static final int bv = 1009;
   public static final int bj = 56;
   static final int ab = 17;

   public static void ac(byte var0) {
      try {
         ar = new int[7];
         ar[ac.au * 1305619521] = ii.au.az * 541927411;
         ar[1305619521 * ae.au] = ii.ad.az * 541927411;
         ar[1305619521 * ag.au] = ii.ax.az * 541927411;
         ar[am.au * 1305619521] = 541927411 * ii.af.az;
         ar[1305619521 * ax.au] = 541927411 * ii.ar.az;
         ar[aq.au * 1305619521] = ii.at.az * 541927411;
         ar[1305619521 * af.au] = ii.al.az * 541927411;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "hz.ac(" + ')');
      }
   }

   hz(int var1) {
      try {
         super();
         this.au = var1 * 2140136385;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "hz.<init>(" + ')');
      }
   }

   public static void ae() {
      ar = new int[7];
      ar[ac.au * 1305619521] = ii.au.az * 541927411;
      ar[1305619521 * ae.au] = ii.ad.az * 541927411;
      ar[1305619521 * ag.au] = ii.ax.az * 541927411;
      ar[am.au * 1305619521] = 541927411 * ii.af.az;
      ar[1305619521 * ax.au] = 541927411 * ii.ar.az;
      ar[aq.au * 1305619521] = ii.at.az * 541927411;
      ar[1305619521 * af.au] = ii.al.az * 541927411;
   }

   static final void am(dd var0, byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      try {
         int var8;
         int var9;
         if (null != var0.ag) {
            if (var6 >= -248474948) {
               return;
            }

            for(int var7 = 0; var7 < 4; ++var7) {
               for(var8 = 0; var8 < 64; ++var8) {
                  if (var6 >= -248474948) {
                     throw new IllegalStateException();
                  }

                  for(var9 = 0; var9 < 64; ++var9) {
                     if (var6 >= -248474948) {
                        return;
                     }

                     if (var2 + var8 > 0) {
                        if (var6 >= -248474948) {
                           throw new IllegalStateException();
                        }

                        if (var2 + var8 < var0.ag[var7].bb.length) {
                           if (var6 >= -248474948) {
                              throw new IllegalStateException();
                           }

                           if (var3 + var9 > 0) {
                              if (var6 >= -248474948) {
                                 return;
                              }

                              if (var3 + var9 < var0.ag[var7].bb[var8 + var2].length) {
                                 if (var6 >= -248474948) {
                                    throw new IllegalStateException();
                                 }

                                 int[] var10000 = var0.ag[var7].bb[var8 + var2];
                                 var10000[var9 + var3] &= -1073741825;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         vf var14 = new vf(var1);

         for(var8 = 0; var8 < 4; ++var8) {
            for(var9 = 0; var9 < 64; ++var9) {
               if (var6 >= -248474948) {
                  throw new IllegalStateException();
               }

               for(int var10 = 0; var10 < 64; ++var10) {
                  if (var6 >= -248474948) {
                     throw new IllegalStateException();
                  }

                  int var11 = var9 + var2;
                  int var12 = var3 + var10;
                  ux.af(var0, var14, var8, var11, var12, var4 + var11, var12 + var5, 0, 780012615);
               }
            }
         }

      } catch (RuntimeException var13) {
         throw vk.ae(var13, "hz.am(" + ')');
      }
   }

   static dq[] ax(int var0) {
      try {
         return new dq[]{dq.ax, dq.aq, dq.ag, dq.ae, dq.am, dq.ac};
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "hz.ax(" + ')');
      }
   }
}
