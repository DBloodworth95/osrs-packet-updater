public class nz {
   public static final int at = 768;
   public static final int bh = 26;
   static final int ae = 256;

   public static int aq(CharSequence var0, int var1, int var2, byte[] var3, int var4, int var5) {
      try {
         int var6 = var2 - var1;

         for(int var7 = 0; var7 < var6; ++var7) {
            if (var5 == 844691753) {
               throw new IllegalStateException();
            }

            char var8;
            label223: {
               var8 = var0.charAt(var7 + var1);
               if (var8 > 0) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  if (var8 < 128) {
                     break label223;
                  }
               }

               if (var8 >= 160) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  if (var8 <= 255) {
                     if (var5 == 844691753) {
                        throw new IllegalStateException();
                     }
                     break label223;
                  }
               }

               if (var8 == 8364) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -128;
               } else if (8218 == var8) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -126;
               } else if (402 == var8) {
                  var3[var4 + var7] = -125;
               } else if (8222 == var8) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -124;
               } else if (8230 == var8) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -123;
               } else if (8224 == var8) {
                  var3[var7 + var4] = -122;
               } else if (8225 == var8) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -121;
               } else if (var8 == 710) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -120;
               } else if (8240 == var8) {
                  var3[var4 + var7] = -119;
               } else if (var8 == 352) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -118;
               } else if (8249 == var8) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -117;
               } else if (338 == var8) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -116;
               } else if (var8 == 381) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -114;
               } else if (var8 == 8216) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -111;
               } else if (var8 == 8217) {
                  var3[var7 + var4] = -110;
               } else if (var8 == 8220) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -109;
               } else if (var8 == 8221) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -108;
               } else if (8226 == var8) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -107;
               } else if (8211 == var8) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -106;
               } else if (var8 == 8212) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -105;
               } else if (var8 == 732) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -104;
               } else if (var8 == 8482) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -103;
               } else if (353 == var8) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -102;
               } else if (8250 == var8) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -101;
               } else if (var8 == 339) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -100;
               } else if (var8 == 382) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -98;
               } else if (var8 == 376) {
                  if (var5 == 844691753) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -97;
               } else {
                  var3[var4 + var7] = 63;
               }
               continue;
            }

            var3[var4 + var7] = (byte)var8;
         }

         return var6;
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "nz.aq(" + ')');
      }
   }

   public static int at(int var0) {
      return var0 >> 17 & 7;
   }

   public static int am(int var0) {
      return var0 >> 11 & 63;
   }

   public static int aq(int var0) {
      return var0 >> 17 & 7;
   }

   public static int af(int var0) {
      return var0 >> 17 & 7;
   }

   nz() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "nz.<init>(" + ')');
      }
   }

   public static boolean au(int var0) {
      return 0 != (var0 >> 20 & 1);
   }

   static int af(long var0) {
      try {
         return (int)(var0 >>> 14 & 3L);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "nz.af(" + ')');
      }
   }

   public static boolean ar(int var0) {
      return 0 != (var0 >> 20 & 1);
   }

   public static int ax(int var0) {
      return var0 >> 11 & 1893520736;
   }

   static final void me(int var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         int var7 = var2 - var0;
         int var8 = var3 - var1;
         int var10000;
         if (var7 >= 0) {
            if (var6 <= 13) {
               return;
            }

            var10000 = var7;
         } else {
            var10000 = -var7;
         }

         int var9 = var10000;
         int var10 = var8 >= 0 ? var8 : -var8;
         int var11 = var9;
         if (var9 < var10) {
            if (var6 <= 13) {
               throw new IllegalStateException();
            }

            var11 = var10;
         }

         if (0 == var11) {
            if (var6 <= 13) {
               throw new IllegalStateException();
            }
         } else {
            int var12 = (var7 << 16) / var11;
            int var13 = (var8 << 16) / var11;
            if (var13 <= var12) {
               var12 = -var12;
            } else {
               var13 = -var13;
            }

            int var14 = var13 * var5 >> 17;
            int var15 = 1 + var5 * var13 >> 17;
            int var16 = var5 * var12 >> 17;
            int var17 = 1 + var12 * var5 >> 17;
            var0 -= vr.bf;
            var1 -= vr.bd;
            int var18 = var14 + var0;
            int var19 = var0 - var15;
            int var20 = var0 + var7 - var15;
            int var21 = var7 + var0 + var14;
            int var22 = var16 + var1;
            int var23 = var1 - var17;
            int var24 = var1 + var8 - var17;
            int var25 = var8 + var1 + var16;
            jw.as(var18, var19, var20);
            jw.aj(var22, var23, var24, var18, var19, var20, 0.0F, 0.0F, 0.0F, var4);
            jw.as(var18, var20, var21);
            jw.aj(var22, var24, var25, var18, var20, var21, 0.0F, 0.0F, 0.0F, var4);
         }
      } catch (RuntimeException var26) {
         throw vk.ae(var26, "nz.me(" + ')');
      }
   }
}
