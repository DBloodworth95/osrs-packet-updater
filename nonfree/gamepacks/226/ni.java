import java.util.BitSet;

public class ni extends tw {
   static final int au = 1024;
   BitSet aw;
   public static int ak;
   int ap;
   static ch fk;

   public static String aw(byte[] var0, int var1, int var2, byte var3) {
      try {
         char[] var4 = new char[var2];
         int var5 = 0;
         int var6 = var1;

         int var9;
         for(int var7 = var2 + var1; var6 < var7; var4[var5++] = (char)var9) {
            if (var3 != 10) {
               throw new IllegalStateException();
            }

            int var8 = var0[var6++] & 255;
            if (var8 < 128) {
               if (var3 != 10) {
                  throw new IllegalStateException();
               }

               if (0 == var8) {
                  var9 = 65533;
               } else {
                  var9 = var8;
               }
            } else if (var8 < 192) {
               if (var3 != 10) {
                  throw new IllegalStateException();
               }

               var9 = 65533;
            } else if (var8 < 224) {
               if (var3 != 10) {
                  throw new IllegalStateException();
               }

               if (var6 < var7) {
                  if (var3 != 10) {
                     throw new IllegalStateException();
                  }

                  if ((var0[var6] & 192) == 128) {
                     if (var3 != 10) {
                        throw new IllegalStateException();
                     }

                     var9 = (var8 & 31) << 6 | var0[var6++] & 63;
                     if (var9 < 128) {
                        if (var3 != 10) {
                           throw new IllegalStateException();
                        }

                        var9 = 65533;
                     }
                     continue;
                  }
               }

               var9 = 65533;
            } else if (var8 < 240) {
               if (var3 != 10) {
                  throw new IllegalStateException();
               }

               if (var6 + 1 < var7) {
                  if (var3 != 10) {
                     throw new IllegalStateException();
                  }

                  if ((var0[var6] & 192) == 128) {
                     if (var3 != 10) {
                        throw new IllegalStateException();
                     }

                     if ((var0[1 + var6] & 192) == 128) {
                        if (var3 != 10) {
                           throw new IllegalStateException();
                        }

                        var9 = (var8 & 15) << 12 | (var0[var6++] & 63) << 6 | var0[var6++] & 63;
                        if (var9 < 2048) {
                           if (var3 != 10) {
                              throw new IllegalStateException();
                           }

                           var9 = 65533;
                        }
                        continue;
                     }
                  }
               }

               var9 = 65533;
            } else if (var8 < 248) {
               if (var3 != 10) {
                  throw new IllegalStateException();
               }

               if (2 + var6 < var7) {
                  if (var3 != 10) {
                     throw new IllegalStateException();
                  }

                  if ((var0[var6] & 192) == 128) {
                     if (var3 != 10) {
                        throw new IllegalStateException();
                     }

                     if ((var0[1 + var6] & 192) == 128) {
                        if (var3 != 10) {
                           throw new IllegalStateException();
                        }

                        if (128 == (var0[2 + var6] & 192)) {
                           if (var3 != 10) {
                              throw new IllegalStateException();
                           }

                           var9 = (var8 & 7) << 18 | (var0[var6++] & 63) << 12 | (var0[var6++] & 63) << 6 | var0[var6++] & 63;
                           if (var9 >= 65536) {
                              if (var3 != 10) {
                                 throw new IllegalStateException();
                              }

                              if (var9 <= 1114111) {
                                 var9 = 65533;
                                 continue;
                              }

                              if (var3 != 10) {
                                 throw new IllegalStateException();
                              }
                           }

                           var9 = 65533;
                           continue;
                        }
                     }
                  }
               }

               var9 = 65533;
            } else {
               var9 = 65533;
            }
         }

         return new String(var4, 0, var5);
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "ni.aw(" + ')');
      }
   }

   ni(int var1) {
      try {
         super();
         this.ap = -906235383 * var1;
         this.aw = new BitSet(128);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ni.<init>(" + ')');
      }
   }
}
