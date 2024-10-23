public class pg extends tp {
   byte ak;
   int aw;
   static final int ai = 768;
   static int ul;
   or ap;
   static int kc;
   static final int cs = 40;

   public static sx[] ap(int var0) {
      try {
         return new sx[]{sx.ap, sx.aw, sx.ak};
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "pg.ap(" + ')');
      }
   }

   pg() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "pg.<init>(" + ')');
      }
   }

   public static int ay(CharSequence var0, int var1, int var2, byte[] var3, int var4, byte var5) {
      try {
         int var6 = var2 - var1;

         for(int var7 = 0; var7 < var6; ++var7) {
            if (var5 <= 0) {
               throw new IllegalStateException();
            }

            char var8;
            label210: {
               var8 = var0.charAt(var1 + var7);
               if (var8 > 0) {
                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (var8 < 128) {
                     break label210;
                  }
               }

               if (var8 >= 160) {
                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (var8 <= 255) {
                     if (var5 <= 0) {
                        throw new IllegalStateException();
                     }
                     break label210;
                  }
               }

               if (8364 == var8) {
                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -128;
               } else if (var8 == 8218) {
                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -126;
               } else if (var8 == 402) {
                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -125;
               } else if (8222 == var8) {
                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -124;
               } else if (var8 == 8230) {
                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -123;
               } else if (8224 == var8) {
                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -122;
               } else if (8225 == var8) {
                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -121;
               } else if (710 == var8) {
                  var3[var4 + var7] = -120;
               } else if (8240 == var8) {
                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -119;
               } else if (352 == var8) {
                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -118;
               } else if (var8 == 8249) {
                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -117;
               } else if (var8 == 338) {
                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -116;
               } else if (var8 == 381) {
                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -114;
               } else if (var8 == 8216) {
                  var3[var7 + var4] = -111;
               } else if (var8 == 8217) {
                  var3[var4 + var7] = -110;
               } else if (8220 == var8) {
                  var3[var7 + var4] = -109;
               } else if (8221 == var8) {
                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -108;
               } else if (var8 == 8226) {
                  var3[var4 + var7] = -107;
               } else if (8211 == var8) {
                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -106;
               } else if (8212 == var8) {
                  var3[var7 + var4] = -105;
               } else if (var8 == 732) {
                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -104;
               } else if (var8 == 8482) {
                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -103;
               } else if (353 == var8) {
                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -102;
               } else if (var8 == 8250) {
                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  var3[var7 + var4] = -101;
               } else if (var8 == 339) {
                  var3[var4 + var7] = -100;
               } else if (382 == var8) {
                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  var3[var4 + var7] = -98;
               } else if (var8 == 376) {
                  var3[var4 + var7] = -97;
               } else {
                  var3[var4 + var7] = 63;
               }
               continue;
            }

            var3[var7 + var4] = (byte)var8;
         }

         return var6;
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "pg.ay(" + ')');
      }
   }
}
