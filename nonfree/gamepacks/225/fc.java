public class fc extends fm {
   int ac;
   // $FF: synthetic field
   final fz this$0;
   public static final String kr = "Please ensure date follows the format";
   static final int ao = 0;

   void am(vf var1) {
      this.ac = var1.ct(-1523309152) * -394370447;
   }

   void ac(vf var1, byte var2) {
      try {
         this.ac = var1.ct(-1602573084) * -394370447;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "fc.ac(" + ')');
      }
   }

   fc(fz var1) {
      try {
         this.this$0 = var1;
         super();
         this.ac = 394370447;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "fc.<init>(" + ')');
      }
   }

   void ag(vf var1) {
      this.ac = var1.ct(-1554386053) * -394370447;
   }

   static boolean nv(int var0, int var1) {
      try {
         for(int var2 = 0; var2 < -114857575 * client.st; ++var2) {
            if (var1 <= -1128078675) {
               throw new IllegalStateException();
            }

            if (client.sy[var2] == var0) {
               return true;
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "fc.nv(" + ')');
      }
   }

   void ae(go var1, byte var2) {
      try {
         var1.at(1567694481 * this.ac, -620477369);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "fc.ae(" + ')');
      }
   }

   void ax(vf var1) {
      this.ac = var1.ct(-1611872239) * -394370447;
   }

   void af(go var1) {
      var1.at(1567694481 * this.ac, -620477369);
   }

   void at(go var1) {
      var1.at(1567694481 * this.ac, -620477369);
   }

   void au(go var1) {
      var1.at(1567694481 * this.ac, -620477369);
   }

   void aq(go var1) {
      var1.at(1567694481 * this.ac, -620477369);
   }

   public static int ae(int var0, byte var1) {
      try {
         return var0 >> 17 & 7;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "fc.ae(" + ')');
      }
   }

   static int ax(CharSequence var0, int var1, boolean var2, byte var3) {
      try {
         if (var1 >= 2) {
            if (var3 >= 41) {
               throw new IllegalStateException();
            }

            if (var1 <= 36) {
               boolean var4 = false;
               boolean var5 = false;
               int var6 = 0;
               int var7 = var0.length();

               for(int var8 = 0; var8 < var7; ++var8) {
                  if (var3 >= 41) {
                     throw new IllegalStateException();
                  }

                  char var9 = var0.charAt(var8);
                  if (var8 == 0) {
                     if (var3 >= 41) {
                        throw new IllegalStateException();
                     }

                     if (var9 == '-') {
                        var4 = true;
                        continue;
                     }

                     if ('+' == var9 && var2) {
                        if (var3 >= 41) {
                           throw new IllegalStateException();
                        }
                        continue;
                     }
                  }

                  int var12;
                  label137: {
                     if (var9 >= '0') {
                        if (var3 >= 41) {
                           throw new IllegalStateException();
                        }

                        if (var9 <= '9') {
                           if (var3 >= 41) {
                              throw new IllegalStateException();
                           }

                           var12 = var9 - 48;
                           break label137;
                        }
                     }

                     if (var9 >= 'A') {
                        if (var3 >= 41) {
                           throw new IllegalStateException();
                        }

                        if (var9 <= 'Z') {
                           if (var3 >= 41) {
                              throw new IllegalStateException();
                           }

                           var12 = var9 - 55;
                           break label137;
                        }
                     }

                     if (var9 < 'a' || var9 > 'z') {
                        throw new NumberFormatException();
                     }

                     if (var3 >= 41) {
                        throw new IllegalStateException();
                     }

                     var12 = var9 - 87;
                  }

                  if (var12 >= var1) {
                     throw new NumberFormatException();
                  }

                  if (var4) {
                     var12 = -var12;
                  }

                  int var10 = var6 * var1 + var12;
                  if (var6 != var10 / var1) {
                     if (var3 >= 41) {
                        throw new IllegalStateException();
                     }

                     throw new NumberFormatException();
                  }

                  var6 = var10;
                  var5 = true;
               }

               if (!var5) {
                  if (var3 >= 41) {
                     throw new IllegalStateException();
                  }

                  throw new NumberFormatException();
               }

               return var6;
            }

            if (var3 >= 41) {
               throw new IllegalStateException();
            }
         }

         throw new IllegalArgumentException("" + var1);
      } catch (RuntimeException var11) {
         throw vk.ae(var11, "fc.ax(" + ')');
      }
   }

   static final int nu(int var0) {
      try {
         float var1 = 200.0F * ((float)re.vt.aa(1940605885) - 0.5F);
         return 100 - Math.round(var1);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "fc.nu(" + ')');
      }
   }

   static void at(float var0, float var1, float var2, float var3, fr var4, short var5) {
      try {
         float var6 = var1 - var0;
         float var7 = var2 - var1;
         float var8 = var3 - var2;
         float var9 = var7 - var6;
         var4.az = var8 - var7 - var9;
         var4.ab = var9 + var9 + var9;
         var4.ap = var6 + var6 + var6;
         var4.ah = var0;
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "fc.at(" + ')');
      }
   }
}
