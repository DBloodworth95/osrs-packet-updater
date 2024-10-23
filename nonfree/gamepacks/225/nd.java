import java.net.MalformedURLException;
import java.net.URL;

public class nd {
   ek ac;
   vv ae;
   static final int hl = 65536;
   static int gs;

   vv ac(int var1) {
      try {
         if (this.ae == null) {
            if (var1 != -1398609474) {
               throw new IllegalStateException();
            }

            if (null != this.ac) {
               if (var1 != -1398609474) {
                  throw new IllegalStateException();
               }

               if (this.ac.ac(-342876042)) {
                  if (var1 != -1398609474) {
                     throw new IllegalStateException();
                  }

                  if (this.ac.ae(1516593414) != null) {
                     if (var1 != -1398609474) {
                        throw new IllegalStateException();
                     }

                     this.ae = ez.ac(this.ac.ae(1516593414), 35301021);
                  }

                  this.ac = null;
               }
            }
         }

         return this.ae;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "nd.ac(" + ')');
      }
   }

   nd(ek var1) {
      try {
         super();
         this.ac = var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "nd.<init>(" + ')');
      }
   }

   public static String ac(byte[] var0, int var1, int var2, byte var3) {
      try {
         char[] var4 = new char[var2];
         int var5 = 0;
         int var6 = var1;

         int var9;
         for(int var7 = var1 + var2; var6 < var7; var4[var5++] = (char)var9) {
            if (var3 != 38) {
               throw new IllegalStateException();
            }

            int var8 = var0[var6++] & 255;
            if (var8 < 128) {
               if (var3 != 38) {
                  throw new IllegalStateException();
               }

               if (0 == var8) {
                  if (var3 != 38) {
                     throw new IllegalStateException();
                  }

                  var9 = 65533;
               } else {
                  var9 = var8;
               }
            } else if (var8 < 192) {
               if (var3 != 38) {
                  throw new IllegalStateException();
               }

               var9 = 65533;
            } else if (var8 < 224) {
               if (var3 != 38) {
                  throw new IllegalStateException();
               }

               if (var6 < var7 && 128 == (var0[var6] & 192)) {
                  if (var3 != 38) {
                     throw new IllegalStateException();
                  }

                  var9 = (var8 & 31) << 6 | var0[var6++] & 63;
                  if (var9 < 128) {
                     if (var3 != 38) {
                        throw new IllegalStateException();
                     }

                     var9 = 65533;
                  }
               } else {
                  var9 = 65533;
               }
            } else if (var8 < 240) {
               if (var3 != 38) {
                  throw new IllegalStateException();
               }

               if (var6 + 1 < var7) {
                  if (var3 != 38) {
                     throw new IllegalStateException();
                  }

                  if ((var0[var6] & 192) == 128) {
                     if (var3 != 38) {
                        throw new IllegalStateException();
                     }

                     if (128 == (var0[1 + var6] & 192)) {
                        if (var3 != 38) {
                           throw new IllegalStateException();
                        }

                        var9 = (var8 & 15) << 12 | (var0[var6++] & 63) << 6 | var0[var6++] & 63;
                        if (var9 < 2048) {
                           if (var3 != 38) {
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
               if (var3 != 38) {
                  throw new IllegalStateException();
               }

               if (2 + var6 < var7) {
                  if (var3 != 38) {
                     throw new IllegalStateException();
                  }

                  if (128 == (var0[var6] & 192)) {
                     if (var3 != 38) {
                        throw new IllegalStateException();
                     }

                     if (128 == (var0[1 + var6] & 192)) {
                        if (var3 != 38) {
                           throw new IllegalStateException();
                        }

                        if (128 == (var0[var6 + 2] & 192)) {
                           var9 = (var8 & 7) << 18 | (var0[var6++] & 63) << 12 | (var0[var6++] & 63) << 6 | var0[var6++] & 63;
                           if (var9 >= 65536) {
                              if (var3 != 38) {
                                 throw new IllegalStateException();
                              }

                              if (var9 <= 1114111) {
                                 var9 = 65533;
                                 continue;
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
         throw vk.ae(var10, "nd.ac(" + ')');
      }
   }

   vv ag() {
      if (this.ae == null && null != this.ac && this.ac.ac(-342876042)) {
         if (this.ac.ae(1516593414) != null) {
            this.ae = ez.ac(this.ac.ae(1516593414), 35301021);
         }

         this.ac = null;
      }

      return this.ae;
   }

   nd(String var1, en var2) {
      try {
         super();

         try {
            this.ac = var2.ax(new URL(var1), -981749421);
         } catch (MalformedURLException var4) {
            this.ac = null;
         }

      } catch (RuntimeException var5) {
         throw vk.ae(var5, "nd.<init>(" + ')');
      }
   }

   vv ae() {
      if (this.ae == null && null != this.ac && this.ac.ac(-342876042)) {
         if (this.ac.ae(1516593414) != null) {
            this.ae = ez.ac(this.ac.ae(1516593414), 35301021);
         }

         this.ac = null;
      }

      return this.ae;
   }

   static float ae(fr var0, float var1, byte var2) {
      try {
         if (null == var0) {
            if (var2 == 0) {
               throw new IllegalStateException();
            } else {
               return 0.0F;
            }
         } else {
            float var3;
            if (var0.af == var1) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               var3 = 0.0F;
            } else if (var0.at == var1) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               var3 = 1.0F;
            } else {
               var3 = (var1 - var0.af) / (var0.at - var0.af);
            }

            float var4;
            if (var0.aq) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               var4 = var3;
            } else {
               float[] var5 = new float[]{var0.au - var3, var0.ar, var0.al, var0.ad};
               float[] var6 = new float[5];
               int var7 = of.ac(var5, 3, 0.0F, true, 1.0F, true, var6, (byte)-93);
               if (var7 == 1) {
                  if (var2 == 0) {
                     throw new IllegalStateException();
                  }

                  var4 = var6[0];
               } else {
                  var4 = 0.0F;
               }
            }

            return var0.ah + var4 * ((var0.az * var4 + var0.ab) * var4 + var0.ap);
         }
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "nd.ae(" + ')');
      }
   }
}
