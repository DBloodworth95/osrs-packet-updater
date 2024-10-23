public class kd {
   static final int ax = 16;
   static final int am = 8;
   public static final int as = 18;
   static final int af = 64;
   public int bp;
   static final int az = 32768;
   int ba;
   int bj;
   static final int ab = 16384;
   static final int ae = 2;
   public int by;
   public int[][] bb;
   static tq vw;

   public void ab(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = 256;
      if (var5) {
         var6 += 131072;
      }

      var1 -= this.ba * 2006280683;
      var2 -= this.bj * 1444846889;

      for(int var7 = var1; var7 < var3 + var1; ++var7) {
         if (var7 >= 0 && var7 < 285692531 * this.bp) {
            for(int var8 = var2; var8 < var4 + var2; ++var8) {
               if (var8 >= 0 && var8 < 1488772615 * this.by) {
                  this.aq(var7, var8, var6, 1494904244);
               }
            }
         }
      }

   }

   public void ac(int var1) {
      try {
         for(int var2 = 0; var2 < 285692531 * this.bp; ++var2) {
            if (var1 >= 987935761) {
               throw new IllegalStateException();
            }

            for(int var3 = 0; var3 < 1488772615 * this.by; ++var3) {
               if (var1 >= 987935761) {
                  throw new IllegalStateException();
               }

               if (0 != var2) {
                  if (var1 >= 987935761) {
                     return;
                  }

                  if (var3 != 0 && var2 < 285692531 * this.bp - 5) {
                     if (var1 >= 987935761) {
                        throw new IllegalStateException();
                     }

                     if (var3 < this.by * 1488772615 - 5) {
                        this.bb[var2][var3] = 1073741824;
                        continue;
                     }

                     if (var1 >= 987935761) {
                        throw new IllegalStateException();
                     }
                  }
               }

               this.bb[var2][var3] = 16777215;
            }
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "kd.ac(" + ')');
      }
   }

   public void ae(int var1, int var2, int var3, int var4, boolean var5, byte var6) {
      try {
         var1 -= 2006280683 * this.ba;
         var2 -= 1444846889 * this.bj;
         if (0 == var3) {
            if (var6 == 64) {
               throw new IllegalStateException();
            }

            if (0 == var4) {
               if (var6 == 64) {
                  return;
               }

               this.aq(var1, var2, 128, -1352906622);
               this.aq(var1 - 1, var2, 8, 55474841);
            }

            if (1 == var4) {
               if (var6 == 64) {
                  throw new IllegalStateException();
               }

               this.aq(var1, var2, 2, -1474125338);
               this.aq(var1, var2 + 1, 32, 308033336);
            }

            if (var4 == 2) {
               if (var6 == 64) {
                  return;
               }

               this.aq(var1, var2, 8, 1934797280);
               this.aq(var1 + 1, var2, 128, -296542303);
            }

            if (3 == var4) {
               this.aq(var1, var2, 32, 540999744);
               this.aq(var1, var2 - 1, 2, 1793565746);
            }
         }

         label260: {
            if (1 != var3) {
               if (3 != var3) {
                  break label260;
               }

               if (var6 == 64) {
                  throw new IllegalStateException();
               }
            }

            if (0 == var4) {
               this.aq(var1, var2, 1, -1606673279);
               this.aq(var1 - 1, var2 + 1, 16, 483085253);
            }

            if (1 == var4) {
               if (var6 == 64) {
                  throw new IllegalStateException();
               }

               this.aq(var1, var2, 4, 1200723485);
               this.aq(var1 + 1, 1 + var2, 64, -737765721);
            }

            if (var4 == 2) {
               if (var6 == 64) {
                  return;
               }

               this.aq(var1, var2, 16, -116091062);
               this.aq(var1 + 1, var2 - 1, 1, 360108419);
            }

            if (var4 == 3) {
               if (var6 == 64) {
                  return;
               }

               this.aq(var1, var2, 64, -981081253);
               this.aq(var1 - 1, var2 - 1, 4, 1645628843);
            }
         }

         if (var3 == 2) {
            if (var6 == 64) {
               throw new IllegalStateException();
            }

            if (var4 == 0) {
               if (var6 == 64) {
                  throw new IllegalStateException();
               }

               this.aq(var1, var2, 130, 887411967);
               this.aq(var1 - 1, var2, 8, -193432417);
               this.aq(var1, var2 + 1, 32, 1933061720);
            }

            if (1 == var4) {
               this.aq(var1, var2, 10, 94811408);
               this.aq(var1, var2 + 1, 32, -181283071);
               this.aq(1 + var1, var2, 128, -39951464);
            }

            if (var4 == 2) {
               this.aq(var1, var2, 40, 651376258);
               this.aq(var1 + 1, var2, 128, -1317906644);
               this.aq(var1, var2 - 1, 2, 540021649);
            }

            if (var4 == 3) {
               if (var6 == 64) {
                  throw new IllegalStateException();
               }

               this.aq(var1, var2, 160, -675305695);
               this.aq(var1, var2 - 1, 2, 519220214);
               this.aq(var1 - 1, var2, 8, 1072398685);
            }
         }

         if (var5) {
            if (var6 == 64) {
               throw new IllegalStateException();
            }

            if (0 == var3) {
               if (var6 == 64) {
                  throw new IllegalStateException();
               }

               if (0 == var4) {
                  if (var6 == 64) {
                     throw new IllegalStateException();
                  }

                  this.aq(var1, var2, 65536, -1347631296);
                  this.aq(var1 - 1, var2, 4096, 1037770108);
               }

               if (var4 == 1) {
                  if (var6 == 64) {
                     throw new IllegalStateException();
                  }

                  this.aq(var1, var2, 1024, -1067591255);
                  this.aq(var1, var2 + 1, 16384, -551302514);
               }

               if (2 == var4) {
                  this.aq(var1, var2, 4096, 1317292749);
                  this.aq(1 + var1, var2, 65536, 236512339);
               }

               if (var4 == 3) {
                  if (var6 == 64) {
                     throw new IllegalStateException();
                  }

                  this.aq(var1, var2, 16384, -470761853);
                  this.aq(var1, var2 - 1, 1024, 128754695);
               }
            }

            label264: {
               if (var3 != 1) {
                  if (var6 == 64) {
                     throw new IllegalStateException();
                  }

                  if (var3 != 3) {
                     break label264;
                  }

                  if (var6 == 64) {
                     throw new IllegalStateException();
                  }
               }

               if (var4 == 0) {
                  if (var6 == 64) {
                     throw new IllegalStateException();
                  }

                  this.aq(var1, var2, 512, 1444840803);
                  this.aq(var1 - 1, var2 + 1, 8192, 1020596428);
               }

               if (1 == var4) {
                  if (var6 == 64) {
                     throw new IllegalStateException();
                  }

                  this.aq(var1, var2, 2048, 187715034);
                  this.aq(1 + var1, 1 + var2, 32768, -576991808);
               }

               if (2 == var4) {
                  if (var6 == 64) {
                     throw new IllegalStateException();
                  }

                  this.aq(var1, var2, 8192, 1352232048);
                  this.aq(var1 + 1, var2 - 1, 512, -1265443527);
               }

               if (var4 == 3) {
                  if (var6 == 64) {
                     throw new IllegalStateException();
                  }

                  this.aq(var1, var2, 32768, 310220840);
                  this.aq(var1 - 1, var2 - 1, 2048, -125462148);
               }
            }

            if (2 == var3) {
               if (var6 == 64) {
                  throw new IllegalStateException();
               }

               if (var4 == 0) {
                  if (var6 == 64) {
                     return;
                  }

                  this.aq(var1, var2, 66560, -1261871068);
                  this.aq(var1 - 1, var2, 4096, -48714258);
                  this.aq(var1, 1 + var2, 16384, -164820587);
               }

               if (1 == var4) {
                  if (var6 == 64) {
                     throw new IllegalStateException();
                  }

                  this.aq(var1, var2, 5120, -1270716722);
                  this.aq(var1, 1 + var2, 16384, 1618415531);
                  this.aq(var1 + 1, var2, 65536, 1361373874);
               }

               if (2 == var4) {
                  if (var6 == 64) {
                     throw new IllegalStateException();
                  }

                  this.aq(var1, var2, 20480, 1471121464);
                  this.aq(var1 + 1, var2, 65536, 850128866);
                  this.aq(var1, var2 - 1, 1024, 132056304);
               }

               if (var4 == 3) {
                  if (var6 == 64) {
                     return;
                  }

                  this.aq(var1, var2, 81920, 721336242);
                  this.aq(var1, var2 - 1, 1024, 1891910234);
                  this.aq(var1 - 1, var2, 4096, -836258173);
               }
            }
         }

      } catch (RuntimeException var7) {
         throw vk.ae(var7, "kd.ae(" + ')');
      }
   }

   public void ag(int var1, int var2, int var3, int var4, boolean var5, short var6) {
      try {
         int var7 = 256;
         if (var5) {
            if (var6 >= 339) {
               throw new IllegalStateException();
            }

            var7 += 131072;
         }

         var1 -= this.ba * 2006280683;
         var2 -= this.bj * 1444846889;

         for(int var8 = var1; var8 < var3 + var1; ++var8) {
            if (var6 >= 339) {
               throw new IllegalStateException();
            }

            if (var8 >= 0) {
               if (var6 >= 339) {
                  return;
               }

               if (var8 < 285692531 * this.bp) {
                  if (var6 >= 339) {
                     throw new IllegalStateException();
                  }

                  for(int var9 = var2; var9 < var4 + var2; ++var9) {
                     if (var6 >= 339) {
                        throw new IllegalStateException();
                     }

                     if (var9 >= 0) {
                        if (var6 >= 339) {
                           throw new IllegalStateException();
                        }

                        if (var9 < 1488772615 * this.by) {
                           if (var6 >= 339) {
                              throw new IllegalStateException();
                           }

                           this.aq(var8, var9, var7, 1628193881);
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var10) {
         throw vk.ae(var10, "kd.ag(" + ')');
      }
   }

   public void am(int var1, int var2, int var3) {
      try {
         var1 -= 2006280683 * this.ba;
         var2 -= 1444846889 * this.bj;
         int[] var10000 = this.bb[var1];
         var10000[var2] |= 2097152;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "kd.am(" + ')');
      }
   }

   public void ax(int var1, int var2, int var3) {
      try {
         var1 -= 2006280683 * this.ba;
         var2 -= this.bj * 1444846889;
         int[] var10000 = this.bb[var1];
         var10000[var2] |= 262144;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "kd.ax(" + ')');
      }
   }

   void aq(int var1, int var2, int var3, int var4) {
      try {
         int[] var10000 = this.bb[var1];
         var10000[var2] |= var3;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "kd.aq(" + ')');
      }
   }

   public void af(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      try {
         var1 -= this.ba * 2006280683;
         var2 -= this.bj * 1444846889;
         if (var3 == 0) {
            if (var6 >= 571012371) {
               throw new IllegalStateException();
            }

            if (var4 == 0) {
               if (var6 >= 571012371) {
                  return;
               }

               this.au(var1, var2, 128, (byte)7);
               this.au(var1 - 1, var2, 8, (byte)91);
            }

            if (1 == var4) {
               if (var6 >= 571012371) {
                  throw new IllegalStateException();
               }

               this.au(var1, var2, 2, (byte)46);
               this.au(var1, var2 + 1, 32, (byte)56);
            }

            if (2 == var4) {
               if (var6 >= 571012371) {
                  throw new IllegalStateException();
               }

               this.au(var1, var2, 8, (byte)42);
               this.au(1 + var1, var2, 128, (byte)18);
            }

            if (var4 == 3) {
               if (var6 >= 571012371) {
                  throw new IllegalStateException();
               }

               this.au(var1, var2, 32, (byte)3);
               this.au(var1, var2 - 1, 2, (byte)105);
            }
         }

         if (1 == var3 || 3 == var3) {
            if (var4 == 0) {
               this.au(var1, var2, 1, (byte)102);
               this.au(var1 - 1, var2 + 1, 16, (byte)55);
            }

            if (var4 == 1) {
               if (var6 >= 571012371) {
                  return;
               }

               this.au(var1, var2, 4, (byte)22);
               this.au(1 + var1, var2 + 1, 64, (byte)121);
            }

            if (2 == var4) {
               if (var6 >= 571012371) {
                  throw new IllegalStateException();
               }

               this.au(var1, var2, 16, (byte)70);
               this.au(var1 + 1, var2 - 1, 1, (byte)26);
            }

            if (3 == var4) {
               if (var6 >= 571012371) {
                  throw new IllegalStateException();
               }

               this.au(var1, var2, 64, (byte)9);
               this.au(var1 - 1, var2 - 1, 4, (byte)22);
            }
         }

         if (2 == var3) {
            if (var6 >= 571012371) {
               throw new IllegalStateException();
            }

            if (var4 == 0) {
               if (var6 >= 571012371) {
                  return;
               }

               this.au(var1, var2, 130, (byte)117);
               this.au(var1 - 1, var2, 8, (byte)81);
               this.au(var1, 1 + var2, 32, (byte)108);
            }

            if (1 == var4) {
               if (var6 >= 571012371) {
                  throw new IllegalStateException();
               }

               this.au(var1, var2, 10, (byte)79);
               this.au(var1, 1 + var2, 32, (byte)93);
               this.au(1 + var1, var2, 128, (byte)63);
            }

            if (2 == var4) {
               if (var6 >= 571012371) {
                  throw new IllegalStateException();
               }

               this.au(var1, var2, 40, (byte)58);
               this.au(var1 + 1, var2, 128, (byte)73);
               this.au(var1, var2 - 1, 2, (byte)120);
            }

            if (3 == var4) {
               if (var6 >= 571012371) {
                  throw new IllegalStateException();
               }

               this.au(var1, var2, 160, (byte)49);
               this.au(var1, var2 - 1, 2, (byte)56);
               this.au(var1 - 1, var2, 8, (byte)100);
            }
         }

         if (var5) {
            if (var6 >= 571012371) {
               throw new IllegalStateException();
            }

            if (0 == var3) {
               if (var6 >= 571012371) {
                  throw new IllegalStateException();
               }

               if (0 == var4) {
                  if (var6 >= 571012371) {
                     throw new IllegalStateException();
                  }

                  this.au(var1, var2, 65536, (byte)34);
                  this.au(var1 - 1, var2, 4096, (byte)22);
               }

               if (var4 == 1) {
                  if (var6 >= 571012371) {
                     throw new IllegalStateException();
                  }

                  this.au(var1, var2, 1024, (byte)91);
                  this.au(var1, var2 + 1, 16384, (byte)34);
               }

               if (var4 == 2) {
                  if (var6 >= 571012371) {
                     throw new IllegalStateException();
                  }

                  this.au(var1, var2, 4096, (byte)12);
                  this.au(var1 + 1, var2, 65536, (byte)67);
               }

               if (3 == var4) {
                  this.au(var1, var2, 16384, (byte)83);
                  this.au(var1, var2 - 1, 1024, (byte)8);
               }
            }

            label260: {
               if (1 != var3) {
                  if (3 != var3) {
                     break label260;
                  }

                  if (var6 >= 571012371) {
                     return;
                  }
               }

               if (0 == var4) {
                  if (var6 >= 571012371) {
                     throw new IllegalStateException();
                  }

                  this.au(var1, var2, 512, (byte)16);
                  this.au(var1 - 1, var2 + 1, 8192, (byte)7);
               }

               if (var4 == 1) {
                  if (var6 >= 571012371) {
                     return;
                  }

                  this.au(var1, var2, 2048, (byte)121);
                  this.au(1 + var1, var2 + 1, 32768, (byte)7);
               }

               if (2 == var4) {
                  this.au(var1, var2, 8192, (byte)121);
                  this.au(var1 + 1, var2 - 1, 512, (byte)7);
               }

               if (var4 == 3) {
                  if (var6 >= 571012371) {
                     throw new IllegalStateException();
                  }

                  this.au(var1, var2, 32768, (byte)94);
                  this.au(var1 - 1, var2 - 1, 2048, (byte)59);
               }
            }

            if (var3 == 2) {
               if (var4 == 0) {
                  if (var6 >= 571012371) {
                     return;
                  }

                  this.au(var1, var2, 66560, (byte)85);
                  this.au(var1 - 1, var2, 4096, (byte)40);
                  this.au(var1, var2 + 1, 16384, (byte)60);
               }

               if (var4 == 1) {
                  this.au(var1, var2, 5120, (byte)115);
                  this.au(var1, 1 + var2, 16384, (byte)106);
                  this.au(1 + var1, var2, 65536, (byte)20);
               }

               if (2 == var4) {
                  if (var6 >= 571012371) {
                     return;
                  }

                  this.au(var1, var2, 20480, (byte)29);
                  this.au(var1 + 1, var2, 65536, (byte)4);
                  this.au(var1, var2 - 1, 1024, (byte)118);
               }

               if (3 == var4) {
                  if (var6 >= 571012371) {
                     return;
                  }

                  this.au(var1, var2, 81920, (byte)93);
                  this.au(var1, var2 - 1, 1024, (byte)84);
                  this.au(var1 - 1, var2, 4096, (byte)34);
               }
            }
         }

      } catch (RuntimeException var7) {
         throw vk.ae(var7, "kd.af(" + ')');
      }
   }

   public void at(int var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      try {
         int var8 = 33554688;
         if (var6) {
            if (var7 == -606586204) {
               throw new IllegalStateException();
            }

            var8 += 131072;
         }

         int var9;
         label81: {
            var1 -= this.ba * 2006280683;
            var2 -= 1444846889 * this.bj;
            if (var5 != 1) {
               if (var7 == -606586204) {
                  return;
               }

               if (var5 != 3) {
                  break label81;
               }

               if (var7 == -606586204) {
                  return;
               }
            }

            var9 = var3;
            var3 = var4;
            var4 = var9;
         }

         for(var9 = var1; var9 < var1 + var3; ++var9) {
            if (var7 == -606586204) {
               return;
            }

            if (var9 >= 0 && var9 < this.bp * 285692531) {
               if (var7 == -606586204) {
                  throw new IllegalStateException();
               }

               for(int var10 = var2; var10 < var2 + var4; ++var10) {
                  if (var7 == -606586204) {
                     return;
                  }

                  if (var10 >= 0) {
                     if (var7 == -606586204) {
                        throw new IllegalStateException();
                     }

                     if (var10 < this.by * 1488772615) {
                        if (var7 == -606586204) {
                           throw new IllegalStateException();
                        }

                        this.au(var9, var10, var8, (byte)95);
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var11) {
         throw vk.ae(var11, "kd.at(" + ')');
      }
   }

   void au(int var1, int var2, int var3, byte var4) {
      try {
         int[] var10000 = this.bb[var1];
         var10000[var2] &= ~var3;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "kd.au(" + ')');
      }
   }

   public void ar(int var1, int var2, int var3) {
      try {
         var1 -= this.ba * 2006280683;
         var2 -= this.bj * 1444846889;
         int[] var10000 = this.bb[var1];
         var10000[var2] &= -262145;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "kd.ar(" + ')');
      }
   }

   public kd(int var1, int var2) {
      try {
         super();
         this.ba = 0;
         this.bj = 0;
         this.bp = -1407278405 * var1;
         this.by = var2 * -881446985;
         this.bb = new int[this.bp * 285692531][this.by * 1488772615];
         this.ac(-1750311315);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "kd.<init>(" + ')');
      }
   }

   static final void lw(dd var0, boolean var1, va var2, int var3) {
      try {
         while(true) {
            byte var4 = 16;
            int var5 = 1 << var4;
            if (var2.al(-735417501 * client.ia.at, -789660272) < 12 + var4) {
               if (var3 != -1492187932) {
                  throw new IllegalStateException();
               }
            } else {
               int var6 = var2.au(var4, (byte)-53);
               if (var6 != var5 - 1) {
                  int var7 = av.jm * -1515878711;
                  boolean var8 = false;
                  if (null == var0.ah[var6]) {
                     if (var3 != -1492187932) {
                        throw new IllegalStateException();
                     }

                     var0.ah[var6] = new ea();
                     var8 = true;
                  }

                  ea var9 = var0.ah[var6];
                  var9.ae = var7 * 1372741805;
                  var0.ab[(var0.ap += -1716007113) * -514517369 - 1] = var6;
                  var9.dj = client.do * 837308975;
                  int var13 = var2.au(1, (byte)15);
                  if (1 == var13) {
                     if (var3 != -1492187932) {
                        throw new IllegalStateException();
                     }

                     client.ho[(client.hx += -248649147) * 1014601869 - 1] = var6;
                  }

                  int var10 = var2.au(1, (byte)-43);
                  int var12;
                  if (var1) {
                     if (var3 != -1492187932) {
                        throw new IllegalStateException();
                     }

                     var12 = var2.au(8, (byte)-10);
                     if (var12 > 127) {
                        if (var3 != -1492187932) {
                           throw new IllegalStateException();
                        }

                        var12 -= 256;
                     }
                  } else {
                     var12 = var2.au(5, (byte)-12);
                     if (var12 > 15) {
                        if (var3 != -1492187932) {
                           throw new IllegalStateException();
                        }

                        var12 -= 32;
                     }
                  }

                  boolean var10000;
                  if (var2.au(1, (byte)27) == 1) {
                     if (var3 != -1492187932) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  boolean var14 = var10000;
                  if (var14) {
                     if (var3 != -1492187932) {
                        throw new IllegalStateException();
                     }

                     var2.au(32, (byte)-8);
                  }

                  var9.ac = gt.ac(var2.au(14, (byte)-39), (byte)-30);
                  int var15 = client.ni[var2.au(3, (byte)19)];
                  if (var8) {
                     if (var3 != -1492187932) {
                        return;
                     }

                     var9.dg = (var9.bs = var15 * 1120781393) * 1082692973;
                  }

                  int var11;
                  if (var1) {
                     var11 = var2.au(8, (byte)-112);
                     if (var11 > 127) {
                        var11 -= 256;
                     }
                  } else {
                     var11 = var2.au(5, (byte)85);
                     if (var11 > 15) {
                        if (var3 != -1492187932) {
                           return;
                        }

                        var11 -= 32;
                     }
                  }

                  tx.lg(var9, -348935090);
                  if (var9.dy * -695206717 == 0) {
                     if (var3 != -1492187932) {
                        return;
                     }

                     var9.bs = 0;
                  }

                  int var10001;
                  int var10002;
                  boolean var10003;
                  if (vc.ac * -95704915 >= 222) {
                     if (var3 != -1492187932) {
                        throw new IllegalStateException();
                     }

                     var10001 = 2042950949 * dd.nt + var11;
                     var10002 = client.nc * 1072013155 + var12;
                     if (var10 == 1) {
                        if (var3 != -1492187932) {
                           throw new IllegalStateException();
                        }

                        var10003 = true;
                     } else {
                        var10003 = false;
                     }

                     var9.ay(var10001, var10002, var10003, 2082581627);
                     continue;
                  }

                  var10001 = var11 + qm.mm.dn[0];
                  var10002 = var12 + qm.mm.du[0];
                  if (var10 == 1) {
                     if (var3 != -1492187932) {
                        throw new IllegalStateException();
                     }

                     var10003 = true;
                  } else {
                     var10003 = false;
                  }

                  var9.ay(var10001, var10002, var10003, 1453814424);
                  continue;
               }

               if (var3 != -1492187932) {
                  throw new IllegalStateException();
               }
            }

            var2.ar(-1075834002);
            return;
         }
      } catch (RuntimeException var16) {
         throw vk.ae(var16, "kd.lw(" + ')');
      }
   }

   public void ak(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 33554688;
      if (var6) {
         var7 += -1021872569;
      }

      var1 -= this.ba * 2006280683;
      var2 -= 1444846889 * this.bj;
      int var8;
      if (var5 == 1 || var5 == 3) {
         var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for(var8 = var1; var8 < var1 + var3; ++var8) {
         if (var8 >= 0 && var8 < this.bp * 1300233986) {
            for(int var9 = var2; var9 < var2 + var4; ++var9) {
               if (var9 >= 0 && var9 < this.by * 1344161324) {
                  this.au(var8, var9, var7, (byte)26);
               }
            }
         }
      }

   }

   public void ad() {
      for(int var1 = 0; var1 < 285692531 * this.bp; ++var1) {
         for(int var2 = 0; var2 < 1488772615 * this.by; ++var2) {
            if (0 != var1 && var2 != 0 && var1 < 285692531 * this.bp - 5 && var2 < this.by * 1488772615 - 5) {
               this.bb[var1][var2] = 1073741824;
            } else {
               this.bb[var1][var2] = 16777215;
            }
         }
      }

   }

   void bh(int var1, int var2, int var3) {
      int[] var10000 = this.bb[var1];
      var10000[var2] &= ~var3;
   }

   public void az(int var1, int var2) {
      var1 -= 2006280683 * this.ba;
      var2 -= -555727649 * this.bj;
      int[] var10000 = this.bb[var1];
      var10000[var2] |= 2097152;
   }

   public void aa(int var1, int var2) {
      var1 -= 2006280683 * this.ba;
      var2 -= 1444846889 * this.bj;
      int[] var10000 = this.bb[var1];
      var10000[var2] |= 2097152;
   }

   public void ai(int var1, int var2) {
      var1 -= 2006280683 * this.ba;
      var2 -= this.bj * 1228688052;
      int[] var10000 = this.bb[var1];
      var10000[var2] |= 1848992183;
   }

   public void ah(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= 2006280683 * this.ba;
      var2 -= 1444846889 * this.bj;
      if (0 == var3) {
         if (0 == var4) {
            this.aq(var1, var2, 128, -286700751);
            this.aq(var1 - 1, var2, 8, -1194994390);
         }

         if (1 == var4) {
            this.aq(var1, var2, 2, 1386009798);
            this.aq(var1, var2 + 1, 32, 959980514);
         }

         if (var4 == 2) {
            this.aq(var1, var2, 8, 1594440808);
            this.aq(var1 + 1, var2, 128, 2109047925);
         }

         if (3 == var4) {
            this.aq(var1, var2, 457145072, 1365260588);
            this.aq(var1, var2 - 1, 2, -1244491892);
         }
      }

      if (1 == var3 || 3 == var3) {
         if (0 == var4) {
            this.aq(var1, var2, 1, -1156996779);
            this.aq(var1 - 1, var2 + 1, 16, 1602127946);
         }

         if (1 == var4) {
            this.aq(var1, var2, 4, 791847850);
            this.aq(var1 + 1, 1 + var2, 1352855478, 764700889);
         }

         if (var4 == 2) {
            this.aq(var1, var2, 16, 560870615);
            this.aq(var1 + 1, var2 - 1, 1, -909009320);
         }

         if (var4 == 3) {
            this.aq(var1, var2, 64, -676848034);
            this.aq(var1 - 1, var2 - 1, 4, 1196310373);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.aq(var1, var2, 1393171236, -1077903013);
            this.aq(var1 - 1, var2, 8, -1561215449);
            this.aq(var1, var2 + 1, 32, -227613581);
         }

         if (1 == var4) {
            this.aq(var1, var2, 10, 1248691850);
            this.aq(var1, var2 + 1, 1852693455, 1892080137);
            this.aq(1 + var1, var2, 128, 831074701);
         }

         if (var4 == 2) {
            this.aq(var1, var2, 40, 467197105);
            this.aq(var1 + 1, var2, 128, 1531536038);
            this.aq(var1, var2 - 1, 2, 48907782);
         }

         if (var4 == 3) {
            this.aq(var1, var2, 160, -1564885306);
            this.aq(var1, var2 - 1, 2, 437384701);
            this.aq(var1 - 1, var2, 8, -1112757284);
         }
      }

      if (var5) {
         if (0 == var3) {
            if (0 == var4) {
               this.aq(var1, var2, 778868943, 1149591631);
               this.aq(var1 - 1, var2, 1888741090, -1199176854);
            }

            if (var4 == 1) {
               this.aq(var1, var2, -940162524, -1103568110);
               this.aq(var1, var2 + 1, 29607236, 1832966768);
            }

            if (2 == var4) {
               this.aq(var1, var2, 4096, -602133394);
               this.aq(1 + var1, var2, 65536, 139472357);
            }

            if (var4 == 3) {
               this.aq(var1, var2, 16384, 1685739674);
               this.aq(var1, var2 - 1, 92803097, -373711938);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
               this.aq(var1, var2, -2009190126, 1124484891);
               this.aq(var1 - 1, var2 + 1, 768584147, -643164809);
            }

            if (1 == var4) {
               this.aq(var1, var2, 414523539, -372982762);
               this.aq(1 + var1, 1 + var2, 32768, 1518337442);
            }

            if (2 == var4) {
               this.aq(var1, var2, 1514660617, -219221299);
               this.aq(var1 + 1, var2 - 1, 512, 858320520);
            }

            if (var4 == 3) {
               this.aq(var1, var2, 32768, 1741189274);
               this.aq(var1 - 1, var2 - 1, -494262657, 1218352496);
            }
         }

         if (2 == var3) {
            if (var4 == 0) {
               this.aq(var1, var2, 1471559495, -797043330);
               this.aq(var1 - 1, var2, 1418945051, -88978456);
               this.aq(var1, 1 + var2, 16384, 713347177);
            }

            if (1 == var4) {
               this.aq(var1, var2, 5120, -626631556);
               this.aq(var1, 1 + var2, -1159089112, 698448380);
               this.aq(var1 + 1, var2, 65536, 2100990395);
            }

            if (2 == var4) {
               this.aq(var1, var2, 20480, 1737698097);
               this.aq(var1 + 1, var2, -1356494185, -1151139123);
               this.aq(var1, var2 - 1, 1024, 516305380);
            }

            if (var4 == 3) {
               this.aq(var1, var2, -1235046425, 1510288303);
               this.aq(var1, var2 - 1, -1643314304, -871805667);
               this.aq(var1 - 1, var2, 1959692551, 1874422718);
            }
         }
      }

   }

   void as(int var1, int var2, int var3) {
      int[] var10000 = this.bb[var1];
      var10000[var2] |= var3;
   }

   void bd(int var1, int var2, int var3) {
      int[] var10000 = this.bb[var1];
      var10000[var2] &= ~var3;
   }

   public void aj(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.ba * 2006280683;
      var2 -= this.bj * 1444846889;
      if (var3 == 0) {
         if (var4 == 0) {
            this.au(var1, var2, 128, (byte)32);
            this.au(var1 - 1, var2, 8, (byte)12);
         }

         if (1 == var4) {
            this.au(var1, var2, 2, (byte)50);
            this.au(var1, var2 + 1, -665356979, (byte)69);
         }

         if (2 == var4) {
            this.au(var1, var2, 8, (byte)110);
            this.au(1 + var1, var2, 128, (byte)53);
         }

         if (var4 == 3) {
            this.au(var1, var2, 32, (byte)72);
            this.au(var1, var2 - 1, 2, (byte)72);
         }
      }

      if (1 == var3 || 3 == var3) {
         if (var4 == 0) {
            this.au(var1, var2, 1, (byte)16);
            this.au(var1 - 1, var2 + 1, 16, (byte)72);
         }

         if (var4 == 1) {
            this.au(var1, var2, 4, (byte)110);
            this.au(1 + var1, var2 + 1, -305926663, (byte)92);
         }

         if (2 == var4) {
            this.au(var1, var2, 16, (byte)121);
            this.au(var1 + 1, var2 - 1, 1, (byte)60);
         }

         if (3 == var4) {
            this.au(var1, var2, 64, (byte)85);
            this.au(var1 - 1, var2 - 1, 4, (byte)11);
         }
      }

      if (2 == var3) {
         if (var4 == 0) {
            this.au(var1, var2, 1417545486, (byte)16);
            this.au(var1 - 1, var2, 8, (byte)6);
            this.au(var1, 1 + var2, 32, (byte)37);
         }

         if (1 == var4) {
            this.au(var1, var2, 10, (byte)6);
            this.au(var1, 1 + var2, 32, (byte)55);
            this.au(1 + var1, var2, -1585171102, (byte)40);
         }

         if (2 == var4) {
            this.au(var1, var2, 40, (byte)45);
            this.au(var1 + 1, var2, 177506151, (byte)57);
            this.au(var1, var2 - 1, 2, (byte)108);
         }

         if (3 == var4) {
            this.au(var1, var2, 160, (byte)87);
            this.au(var1, var2 - 1, 2, (byte)108);
            this.au(var1 - 1, var2, 8, (byte)21);
         }
      }

      if (var5) {
         if (0 == var3) {
            if (0 == var4) {
               this.au(var1, var2, 745559736, (byte)94);
               this.au(var1 - 1, var2, -1591514476, (byte)105);
            }

            if (var4 == 1) {
               this.au(var1, var2, -225452022, (byte)30);
               this.au(var1, var2 + 1, 1190693857, (byte)16);
            }

            if (var4 == 2) {
               this.au(var1, var2, 4096, (byte)7);
               this.au(var1 + 1, var2, 65536, (byte)9);
            }

            if (3 == var4) {
               this.au(var1, var2, 1173146676, (byte)29);
               this.au(var1, var2 - 1, 1510023927, (byte)73);
            }
         }

         if (1 == var3 || 3 == var3) {
            if (0 == var4) {
               this.au(var1, var2, 377185404, (byte)17);
               this.au(var1 - 1, var2 + 1, -644091879, (byte)27);
            }

            if (var4 == 1) {
               this.au(var1, var2, -545908450, (byte)33);
               this.au(1 + var1, var2 + 1, 32768, (byte)120);
            }

            if (2 == var4) {
               this.au(var1, var2, 8192, (byte)117);
               this.au(var1 + 1, var2 - 1, 512, (byte)126);
            }

            if (var4 == 3) {
               this.au(var1, var2, 32768, (byte)11);
               this.au(var1 - 1, var2 - 1, -324422184, (byte)85);
            }
         }

         if (var3 == 2) {
            if (var4 == 0) {
               this.au(var1, var2, -621496024, (byte)92);
               this.au(var1 - 1, var2, 4096, (byte)64);
               this.au(var1, var2 + 1, 16384, (byte)110);
            }

            if (var4 == 1) {
               this.au(var1, var2, 5120, (byte)16);
               this.au(var1, 1 + var2, 2050775886, (byte)5);
               this.au(1 + var1, var2, 65536, (byte)17);
            }

            if (2 == var4) {
               this.au(var1, var2, 1142048151, (byte)72);
               this.au(var1 + 1, var2, 1557652120, (byte)114);
               this.au(var1, var2 - 1, -382373710, (byte)79);
            }

            if (3 == var4) {
               this.au(var1, var2, 797786457, (byte)23);
               this.au(var1, var2 - 1, 599795500, (byte)38);
               this.au(var1 - 1, var2, 4096, (byte)44);
            }
         }
      }

   }

   public void al() {
      for(int var1 = 0; var1 < 285692531 * this.bp; ++var1) {
         for(int var2 = 0; var2 < 781592840 * this.by; ++var2) {
            if (0 != var1 && var2 != 0 && var1 < 2041880037 * this.bp - 5 && var2 < this.by * -365371315 - 5) {
               this.bb[var1][var2] = 1073741824;
            } else {
               this.bb[var1][var2] = -1966271270;
            }
         }
      }

   }

   public void aw(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 33554688;
      if (var6) {
         var7 += 131072;
      }

      var1 -= this.ba * 2006280683;
      var2 -= 1444846889 * this.bj;
      int var8;
      if (var5 == 1 || var5 == 3) {
         var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for(var8 = var1; var8 < var1 + var3; ++var8) {
         if (var8 >= 0 && var8 < this.bp * 285692531) {
            for(int var9 = var2; var9 < var2 + var4; ++var9) {
               if (var9 >= 0 && var9 < this.by * 1488772615) {
                  this.au(var8, var9, var7, (byte)23);
               }
            }
         }
      }

   }

   public void an(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 33554688;
      if (var6) {
         var7 += 131072;
      }

      var1 -= this.ba * 2006280683;
      var2 -= 1444846889 * this.bj;
      int var8;
      if (var5 == 1 || var5 == 3) {
         var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for(var8 = var1; var8 < var1 + var3; ++var8) {
         if (var8 >= 0 && var8 < this.bp * 285692531) {
            for(int var9 = var2; var9 < var2 + var4; ++var9) {
               if (var9 >= 0 && var9 < this.by * 1488772615) {
                  this.au(var8, var9, var7, (byte)118);
               }
            }
         }
      }

   }

   void ao(int var1, int var2, int var3) {
      int[] var10000 = this.bb[var1];
      var10000[var2] |= var3;
   }

   void bn(int var1, int var2, int var3) {
      int[] var10000 = this.bb[var1];
      var10000[var2] &= ~var3;
   }

   public void av(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = -682127052;
      if (var6) {
         var7 += 131072;
      }

      var1 -= this.ba * 2006280683;
      var2 -= 1444846889 * this.bj;
      int var8;
      if (var5 == 1 || var5 == 3) {
         var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for(var8 = var1; var8 < var1 + var3; ++var8) {
         if (var8 >= 0 && var8 < this.bp * 2132079710) {
            for(int var9 = var2; var9 < var2 + var4; ++var9) {
               if (var9 >= 0 && var9 < this.by * 1488772615) {
                  this.au(var8, var9, var7, (byte)51);
               }
            }
         }
      }

   }

   public void ap(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= 1032208801 * this.ba;
      var2 -= 1444846889 * this.bj;
      if (0 == var3) {
         if (0 == var4) {
            this.aq(var1, var2, -1638927701, 363084863);
            this.aq(var1 - 1, var2, 8, 1626224729);
         }

         if (1 == var4) {
            this.aq(var1, var2, 2, 1429580541);
            this.aq(var1, var2 + 1, 32, -871102925);
         }

         if (var4 == 2) {
            this.aq(var1, var2, 8, -747162536);
            this.aq(var1 + 1, var2, 128, -149716714);
         }

         if (3 == var4) {
            this.aq(var1, var2, 32, 655266765);
            this.aq(var1, var2 - 1, 2, 773997201);
         }
      }

      if (1 == var3 || 3 == var3) {
         if (0 == var4) {
            this.aq(var1, var2, 1, 472306387);
            this.aq(var1 - 1, var2 + 1, 16, 1159066262);
         }

         if (1 == var4) {
            this.aq(var1, var2, 4, 1626807570);
            this.aq(var1 + 1, 1 + var2, 1679114933, 2123066247);
         }

         if (var4 == 2) {
            this.aq(var1, var2, 16, -571667279);
            this.aq(var1 + 1, var2 - 1, 1, -681475453);
         }

         if (var4 == 3) {
            this.aq(var1, var2, -991421416, -67683402);
            this.aq(var1 - 1, var2 - 1, 4, 538219391);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.aq(var1, var2, 130, -1071551447);
            this.aq(var1 - 1, var2, 8, -437330949);
            this.aq(var1, var2 + 1, 32, -1215542570);
         }

         if (1 == var4) {
            this.aq(var1, var2, 10, -1404425374);
            this.aq(var1, var2 + 1, -137777793, 554283749);
            this.aq(1 + var1, var2, 128, 1501682171);
         }

         if (var4 == 2) {
            this.aq(var1, var2, -1269422292, -646353811);
            this.aq(var1 + 1, var2, 128, 255589814);
            this.aq(var1, var2 - 1, 2, 1806651552);
         }

         if (var4 == 3) {
            this.aq(var1, var2, 160, -1348440217);
            this.aq(var1, var2 - 1, 2, -479024478);
            this.aq(var1 - 1, var2, 8, 486153810);
         }
      }

      if (var5) {
         if (0 == var3) {
            if (0 == var4) {
               this.aq(var1, var2, 65536, -1201798199);
               this.aq(var1 - 1, var2, 4096, -421887540);
            }

            if (var4 == 1) {
               this.aq(var1, var2, 1024, 975619811);
               this.aq(var1, var2 + 1, 16384, 1195981657);
            }

            if (2 == var4) {
               this.aq(var1, var2, -1588277093, 242774572);
               this.aq(1 + var1, var2, 65536, 841084465);
            }

            if (var4 == 3) {
               this.aq(var1, var2, 16384, 971547285);
               this.aq(var1, var2 - 1, 1024, -645591742);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
               this.aq(var1, var2, -17665530, -1289638654);
               this.aq(var1 - 1, var2 + 1, 8192, -334424870);
            }

            if (1 == var4) {
               this.aq(var1, var2, 1961668336, 611368423);
               this.aq(1 + var1, 1 + var2, -677679707, -781951404);
            }

            if (2 == var4) {
               this.aq(var1, var2, 1668439085, 1887583082);
               this.aq(var1 + 1, var2 - 1, -1734829915, 1353160990);
            }

            if (var4 == 3) {
               this.aq(var1, var2, 1920469524, 509843353);
               this.aq(var1 - 1, var2 - 1, 2048, 664371617);
            }
         }

         if (2 == var3) {
            if (var4 == 0) {
               this.aq(var1, var2, 66560, 1419870327);
               this.aq(var1 - 1, var2, -1686185460, 797573294);
               this.aq(var1, 1 + var2, 786207634, -814356517);
            }

            if (1 == var4) {
               this.aq(var1, var2, 500741703, 1209519661);
               this.aq(var1, 1 + var2, 16384, 491224164);
               this.aq(var1 + 1, var2, -867179486, 1223854566);
            }

            if (2 == var4) {
               this.aq(var1, var2, 751434798, 1446784827);
               this.aq(var1 + 1, var2, 65536, 417381696);
               this.aq(var1, var2 - 1, 2514676, 133030005);
            }

            if (var4 == 3) {
               this.aq(var1, var2, 81920, 1649029063);
               this.aq(var1, var2 - 1, 1024, -1571027304);
               this.aq(var1 - 1, var2, 4096, 292123741);
            }
         }
      }

   }

   public void bx(int var1, int var2) {
      var1 -= this.ba * 2006280683;
      var2 -= this.bj * 1444846889;
      int[] var10000 = this.bb[var1];
      var10000[var2] &= -262145;
   }

   public void bf(int var1, int var2) {
      var1 -= this.ba * 1137910935;
      var2 -= this.bj * 1444846889;
      int[] var10000 = this.bb[var1];
      var10000[var2] &= -262145;
   }

   public void bm(int var1, int var2) {
      var1 -= this.ba * -2078914920;
      var2 -= this.bj * 566666718;
      int[] var10000 = this.bb[var1];
      var10000[var2] &= 296492703;
   }

   public static int ae(int var0, int var1, int var2, int var3) {
      try {
         var2 &= 3;
         if (var2 == 0) {
            if (var3 != -292322430) {
               throw new IllegalStateException();
            } else {
               return var1;
            }
         } else if (var2 == 1) {
            if (var3 != -292322430) {
               throw new IllegalStateException();
            } else {
               return 7 - var0;
            }
         } else {
            return 2 == var2 ? 7 - var1 : var0;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "kd.ae(" + ')');
      }
   }

   public void ay(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.ba * 2006280683;
      var2 -= this.bj * 1444846889;
      if (var3 == 0) {
         if (var4 == 0) {
            this.au(var1, var2, 128, (byte)89);
            this.au(var1 - 1, var2, 8, (byte)119);
         }

         if (1 == var4) {
            this.au(var1, var2, 2, (byte)67);
            this.au(var1, var2 + 1, 32, (byte)93);
         }

         if (2 == var4) {
            this.au(var1, var2, 8, (byte)108);
            this.au(1 + var1, var2, 128, (byte)126);
         }

         if (var4 == 3) {
            this.au(var1, var2, 32, (byte)127);
            this.au(var1, var2 - 1, 2, (byte)29);
         }
      }

      if (1 == var3 || 3 == var3) {
         if (var4 == 0) {
            this.au(var1, var2, 1, (byte)55);
            this.au(var1 - 1, var2 + 1, 16, (byte)39);
         }

         if (var4 == 1) {
            this.au(var1, var2, 4, (byte)84);
            this.au(1 + var1, var2 + 1, 64, (byte)92);
         }

         if (2 == var4) {
            this.au(var1, var2, 16, (byte)121);
            this.au(var1 + 1, var2 - 1, 1, (byte)93);
         }

         if (3 == var4) {
            this.au(var1, var2, 64, (byte)85);
            this.au(var1 - 1, var2 - 1, 4, (byte)70);
         }
      }

      if (2 == var3) {
         if (var4 == 0) {
            this.au(var1, var2, 130, (byte)104);
            this.au(var1 - 1, var2, 8, (byte)76);
            this.au(var1, 1 + var2, 32, (byte)9);
         }

         if (1 == var4) {
            this.au(var1, var2, 10, (byte)34);
            this.au(var1, 1 + var2, 32, (byte)89);
            this.au(1 + var1, var2, 128, (byte)88);
         }

         if (2 == var4) {
            this.au(var1, var2, 40, (byte)19);
            this.au(var1 + 1, var2, 128, (byte)103);
            this.au(var1, var2 - 1, 2, (byte)106);
         }

         if (3 == var4) {
            this.au(var1, var2, 160, (byte)95);
            this.au(var1, var2 - 1, 2, (byte)85);
            this.au(var1 - 1, var2, 8, (byte)48);
         }
      }

      if (var5) {
         if (0 == var3) {
            if (0 == var4) {
               this.au(var1, var2, 65536, (byte)85);
               this.au(var1 - 1, var2, 4096, (byte)44);
            }

            if (var4 == 1) {
               this.au(var1, var2, 1024, (byte)101);
               this.au(var1, var2 + 1, 16384, (byte)12);
            }

            if (var4 == 2) {
               this.au(var1, var2, 4096, (byte)84);
               this.au(var1 + 1, var2, 65536, (byte)122);
            }

            if (3 == var4) {
               this.au(var1, var2, 16384, (byte)81);
               this.au(var1, var2 - 1, 1024, (byte)79);
            }
         }

         if (1 == var3 || 3 == var3) {
            if (0 == var4) {
               this.au(var1, var2, 512, (byte)42);
               this.au(var1 - 1, var2 + 1, 8192, (byte)113);
            }

            if (var4 == 1) {
               this.au(var1, var2, 2048, (byte)9);
               this.au(1 + var1, var2 + 1, 32768, (byte)58);
            }

            if (2 == var4) {
               this.au(var1, var2, 8192, (byte)39);
               this.au(var1 + 1, var2 - 1, 512, (byte)119);
            }

            if (var4 == 3) {
               this.au(var1, var2, 32768, (byte)78);
               this.au(var1 - 1, var2 - 1, 2048, (byte)46);
            }
         }

         if (var3 == 2) {
            if (var4 == 0) {
               this.au(var1, var2, 66560, (byte)16);
               this.au(var1 - 1, var2, 4096, (byte)32);
               this.au(var1, var2 + 1, 16384, (byte)86);
            }

            if (var4 == 1) {
               this.au(var1, var2, 5120, (byte)119);
               this.au(var1, 1 + var2, 16384, (byte)82);
               this.au(1 + var1, var2, 65536, (byte)107);
            }

            if (2 == var4) {
               this.au(var1, var2, 20480, (byte)16);
               this.au(var1 + 1, var2, 65536, (byte)91);
               this.au(var1, var2 - 1, 1024, (byte)75);
            }

            if (3 == var4) {
               this.au(var1, var2, 81920, (byte)117);
               this.au(var1, var2 - 1, 1024, (byte)27);
               this.au(var1 - 1, var2, 4096, (byte)44);
            }
         }
      }

   }
}
