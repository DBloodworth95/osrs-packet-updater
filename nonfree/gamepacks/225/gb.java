public class gb extends fm {
   static ve rm;
   String ae;
   // $FF: synthetic field
   final fz this$0;
   int ac;
   static vv[] kc;

   void au(go var1) {
      var1.ao(this.ac * -1732495333, this.ae, 1360347130);
   }

   gb(fz var1) {
      try {
         this.this$0 = var1;
         super();
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "gb.<init>(" + ')');
      }
   }

   void ae(go var1, byte var2) {
      try {
         var1.ao(this.ac * -1732495333, this.ae, 1360347130);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "gb.ae(" + ')');
      }
   }

   void ag(vf var1) {
      this.ac = var1.cz(-1734056172) * -1988042221;
      this.ae = var1.cs(1433187330);
   }

   void am(vf var1) {
      this.ac = var1.cz(-1734056172) * 1198440253;
      this.ae = var1.cs(2140112363);
   }

   void ax(vf var1) {
      this.ac = var1.cz(-1734056172) * -1988042221;
      this.ae = var1.cs(434160137);
   }

   void aq(go var1) {
      var1.ao(this.ac * 867867259, this.ae, 1360347130);
   }

   static dt am(byte[] var0, int var1) {
      try {
         dt var2 = new dt();
         vf var3 = new vf(var0);
         var3.au = -1864458299 * (var3.at.length - 2);
         int var4 = var3.ct(-1652942054);
         int var5 = var3.at.length - 2 - var4 - 12;
         var3.au = -1864458299 * var5;
         int var6 = var3.cz(-1734056172);
         var2.aq = var3.ct(-1561467154) * -1179519133;
         var2.af = var3.ct(-1639739691) * 976022541;
         var2.at = var3.ct(-2033488991) * -1765451081;
         var2.au = var3.ct(-1534280573) * 467334413;
         int var7 = var3.cv(952452697);
         int var8;
         int var9;
         if (var7 > 0) {
            if (var1 >= -1856457959) {
               throw new IllegalStateException();
            }

            var2.ar = var2.ax(var7, -862236728);

            for(var8 = 0; var8 < var7; ++var8) {
               if (var1 >= -1856457959) {
                  throw new IllegalStateException();
               }

               var9 = var3.ct(-1350673483);
               ui var10 = new ui(var9 > 0 ? at.ax(var9, 861912472) : 1);
               var2.ar[var8] = var10;

               while(var9-- > 0) {
                  if (var1 >= -1856457959) {
                     throw new IllegalStateException();
                  }

                  int var11 = var3.cz(-1734056172);
                  int var12 = var3.cz(-1734056172);
                  var10.ae(new th(var12), (long)var11);
               }
            }
         }

         var3.au = 0;
         var2.ae = var3.ca(-1713664184);
         var2.ag = new int[var6];
         var2.am = new int[var6];
         var2.ax = new String[var6];

         for(var8 = 0; var3.au * -1027766515 < var5; var2.ag[var8++] = var9) {
            if (var1 >= -1856457959) {
               throw new IllegalStateException();
            }

            var9 = var3.ct(-1589960389);
            if (var9 == 3) {
               if (var1 >= -1856457959) {
                  throw new IllegalStateException();
               }

               var2.ax[var8] = var3.cs(-417435814);
            } else {
               if (var9 < 100) {
                  if (var1 >= -1856457959) {
                     throw new IllegalStateException();
                  }

                  if (var9 != 21) {
                     if (var1 >= -1856457959) {
                        throw new IllegalStateException();
                     }

                     if (38 != var9) {
                        if (var1 >= -1856457959) {
                           throw new IllegalStateException();
                        }

                        if (var9 != 39) {
                           if (var1 >= -1856457959) {
                              throw new IllegalStateException();
                           }

                           var2.am[var8] = var3.cz(-1734056172);
                           continue;
                        }
                     }
                  }
               }

               var2.am[var8] = var3.cv(952452697);
            }
         }

         return var2;
      } catch (RuntimeException var13) {
         throw vk.ae(var13, "gb.am(" + ')');
      }
   }

   void at(go var1) {
      var1.ao(this.ac * -1732495333, this.ae, 1360347130);
   }

   void ac(vf var1, byte var2) {
      try {
         this.ac = var1.cz(-1734056172) * -1988042221;
         this.ae = var1.cs(-1512698494);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "gb.ac(" + ')');
      }
   }

   static jk ap(int var0, int var1) {
      try {
         jk var2 = (jk)if.au.ac((long)var0);
         if (null != var2) {
            if (var1 != -830039348) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            po var4 = gl.aq;
            po var5 = hi.af;
            boolean var6 = true;
            int[] var7 = var4.cm(var0, 814813756);

            for(int var8 = 0; var8 < var7.length; ++var8) {
               if (var1 != -830039348) {
                  throw new IllegalStateException();
               }

               byte[] var9 = var4.cf(var0, var7[var8], (byte)1);
               if (var9 == null) {
                  if (var1 != -830039348) {
                     throw new IllegalStateException();
                  }

                  var6 = false;
               } else {
                  int var10 = (var9[0] & 255) << 8 | var9[1] & 255;
                  byte[] var11 = var5.cf(var10, 0, (byte)1);
                  if (var11 == null) {
                     if (var1 != -830039348) {
                        throw new IllegalStateException();
                     }

                     var6 = false;
                  }
               }
            }

            jk var3;
            if (!var6) {
               if (var1 != -830039348) {
                  throw new IllegalStateException();
               }

               var3 = null;
            } else {
               try {
                  var3 = new jk(var4, var5, var0, false);
               } catch (Exception var12) {
                  var3 = null;
               }
            }

            if (null != var3) {
               if (var1 != -830039348) {
                  throw new IllegalStateException();
               }

               if.au.ag(var3, (long)var0);
            }

            return var3;
         }
      } catch (RuntimeException var13) {
         throw vk.ae(var13, "gb.ap(" + ')');
      }
   }

   void af(go var1) {
      var1.ao(this.ac * 392023190, this.ae, 1360347130);
   }
}
