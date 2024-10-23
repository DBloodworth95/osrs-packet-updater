public class kz {
   kt[] ac;
   static final int ah = 1;

   public void ar() {
      this.ac = new kt[1];
      kx var1 = kx.ag;
      this.ac[0] = new kt(-1458469399 * var1.au, 756967091 * var1.ar);
   }

   public void ac(int var1) {
      try {
         this.ac = new kt[1];
         kx var2 = kx.ag;
         this.ac[0] = new kt(-1458469399 * var2.au, 756967091 * var2.ar);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "kz.ac(" + ')');
      }
   }

   public int ae(int var1, int var2, int var3, ks var4, kd var5, boolean var6, int[] var7, int[] var8, int var9) {
      try {
         return this.ag(var1, var2, var3, var4, var5, var6, var7, var8, this.ac[0], -461299189);
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "kz.ae(" + ')');
      }
   }

   int ag(int var1, int var2, int var3, ks var4, kd var5, boolean var6, int[] var7, int[] var8, kt var9, int var10) {
      try {
         var9.ac(-898085861);
         int var11 = var9.ax(225302376);
         int var12 = var9.aq(1675403856);
         int[][] var13 = var9.at(2059272330);
         int[][] var14 = var9.af(-1327112640);
         int[] var15 = var9.au((byte)-15);
         int[] var16 = var9.ar(-96698690);
         boolean var17;
         if (var3 == 1) {
            if (var10 != -461299189) {
               throw new IllegalStateException();
            }

            var17 = this.am(var1, var2, var4, var5, var9, 1884266838);
         } else if (2 == var3) {
            if (var10 != -461299189) {
               throw new IllegalStateException();
            }

            var17 = this.ax(var1, var2, var4, var5, var9, -1529842740);
         } else {
            var17 = this.aq(var1, var2, var3, var4, var5, var9, (byte)-69);
         }

         int var18 = var1 - (var11 >> 1);
         int var19 = var2 - (var12 >> 1);
         int var20 = var9.ag((byte)-116);
         int var21 = var9.am(2122306889);
         int var22;
         int var23;
         int var25;
         if (!var17) {
            if (var10 != -461299189) {
               throw new IllegalStateException();
            }

            if (!var6) {
               return -1;
            }

            if (var10 != -461299189) {
               throw new IllegalStateException();
            }

            var22 = Integer.MAX_VALUE;
            var23 = Integer.MAX_VALUE;
            byte var24 = 10;
            var25 = var4.ac * -1408432575;
            int var26 = var4.ae * 1063216623;
            int var27 = -1949965163 * var4.ag;
            int var28 = var4.am * -364970793;

            for(int var29 = var25 - var24; var29 <= var24 + var25; ++var29) {
               if (var10 != -461299189) {
                  throw new IllegalStateException();
               }

               for(int var30 = var26 - var24; var30 <= var26 + var24; ++var30) {
                  if (var10 != -461299189) {
                     throw new IllegalStateException();
                  }

                  int var31 = var29 - var18;
                  int var32 = var30 - var19;
                  if (var31 >= 0) {
                     if (var10 != -461299189) {
                        throw new IllegalStateException();
                     }

                     if (var32 >= 0) {
                        if (var10 != -461299189) {
                           throw new IllegalStateException();
                        }

                        if (var31 < var11) {
                           if (var10 != -461299189) {
                              throw new IllegalStateException();
                           }

                           if (var32 < var12) {
                              if (var10 != -461299189) {
                                 throw new IllegalStateException();
                              }

                              if (var13[var31][var32] < 100) {
                                 int var33 = 0;
                                 if (var29 < var25) {
                                    if (var10 != -461299189) {
                                       throw new IllegalStateException();
                                    }

                                    var33 = var25 - var29;
                                 } else if (var29 > var27 + var25 - 1) {
                                    var33 = var29 - (var25 + var27 - 1);
                                 }

                                 int var34 = 0;
                                 if (var30 < var26) {
                                    if (var10 != -461299189) {
                                       throw new IllegalStateException();
                                    }

                                    var34 = var26 - var30;
                                 } else if (var30 > var28 + var26 - 1) {
                                    if (var10 != -461299189) {
                                       throw new IllegalStateException();
                                    }

                                    var34 = var30 - (var26 + var28 - 1);
                                 }

                                 int var35 = var33 * var33 + var34 * var34;
                                 if (var35 >= var22) {
                                    if (var10 != -461299189) {
                                       throw new IllegalStateException();
                                    }

                                    if (var22 != var35) {
                                       continue;
                                    }

                                    if (var10 != -461299189) {
                                       throw new IllegalStateException();
                                    }

                                    if (var13[var31][var32] >= var23) {
                                       continue;
                                    }

                                    if (var10 != -461299189) {
                                       throw new IllegalStateException();
                                    }
                                 }

                                 var22 = var35;
                                 var23 = var13[var31][var32];
                                 var20 = var29;
                                 var21 = var30;
                              }
                           }
                        }
                     }
                  }
               }
            }

            if (Integer.MAX_VALUE == var22) {
               if (var10 != -461299189) {
                  throw new IllegalStateException();
               }

               return -1;
            }
         }

         if (var20 == var1) {
            if (var10 != -461299189) {
               throw new IllegalStateException();
            }

            if (var2 == var21) {
               if (var10 != -461299189) {
                  throw new IllegalStateException();
               }

               var7[0] = var20;
               var8[0] = var21;
               return 0;
            }
         }

         byte var38 = 0;
         var15[var38] = var20;
         var22 = var38 + 1;
         var16[var38] = var21;
         int var39;
         var23 = var39 = var14[var20 - var18][var21 - var19];

         while(true) {
            if (var20 == var1) {
               if (var10 != -461299189) {
                  throw new IllegalStateException();
               }

               if (var2 == var21) {
                  var25 = 0;

                  while(var22-- > 0) {
                     if (var10 != -461299189) {
                        throw new IllegalStateException();
                     }

                     var7[var25] = var15[var22];
                     var8[var25++] = var16[var22];
                     if (var25 >= var7.length) {
                        if (var10 != -461299189) {
                           throw new IllegalStateException();
                        }
                        break;
                     }
                  }

                  return var25;
               }

               if (var10 != -461299189) {
                  throw new IllegalStateException();
               }
            }

            if (var23 != var39) {
               var39 = var23;
               var15[var22] = var20;
               var16[var22++] = var21;
            }

            if (0 != (var23 & 2)) {
               if (var10 != -461299189) {
                  throw new IllegalStateException();
               }

               ++var20;
            } else if ((var23 & 8) != 0) {
               if (var10 != -461299189) {
                  throw new IllegalStateException();
               }

               --var20;
            }

            if (0 != (var23 & 1)) {
               if (var10 != -461299189) {
                  throw new IllegalStateException();
               }

               ++var21;
            } else if (0 != (var23 & 4)) {
               --var21;
            }

            var23 = var14[var20 - var18][var21 - var19];
         }
      } catch (RuntimeException var36) {
         throw vk.ae(var36, "kz.ag(" + ')');
      }
   }

   final boolean am(int var1, int var2, ks var3, kd var4, kt var5, int var6) {
      try {
         int var7 = var5.ax(1864415612);
         int var8 = var5.aq(1675403856);
         int[][] var9 = var5.at(1786446371);
         int[][] var10 = var5.af(-1327112640);
         int[] var11 = var5.au((byte)-32);
         int[] var12 = var5.ar(-96698690);
         int var13 = var5.al(1518127528);
         int var14 = var1;
         int var15 = var2;
         int var16 = var7 >> 1;
         int var17 = var8 >> 1;
         int var18 = var1 - var16;
         int var19 = var2 - var17;
         var10[var16][var17] = 99;
         var9[var16][var17] = 0;
         byte var20 = 0;
         int var21 = 0;
         var11[var20] = var1;
         byte var10001 = var20;
         int var27 = var20 + 1;
         var12[var10001] = var2;
         int[][] var22 = var4.bb;

         while(var27 != var21) {
            if (var6 <= 1192770066) {
               throw new IllegalStateException();
            }

            var14 = var11[var21];
            var15 = var12[var21];
            var21 = var21 + 1 & var13;
            var16 = var14 - var18;
            var17 = var15 - var19;
            int var23 = var14 - 2006280683 * var4.ba;
            int var24 = var15 - var4.bj * 1444846889;
            if (var3.ac(1, var14, var15, var4, -1508153235)) {
               if (var6 <= 1192770066) {
                  throw new IllegalStateException();
               }

               var5.ae(var14, var15, -1915298381);
               return true;
            }

            int var25 = 1 + var9[var16][var17];
            if (var16 > 0) {
               if (var6 <= 1192770066) {
                  throw new IllegalStateException();
               }

               if (var10[var16 - 1][var17] == 0) {
                  if (var6 <= 1192770066) {
                     throw new IllegalStateException();
                  }

                  if ((var22[var23 - 1][var24] & 1076101384) == 0) {
                     var11[var27] = var14 - 1;
                     var12[var27] = var15;
                     var27 = 1 + var27 & var13;
                     var10[var16 - 1][var17] = 2;
                     var9[var16 - 1][var17] = var25;
                  }
               }
            }

            if (var16 < var7 - 1 && 0 == var10[1 + var16][var17]) {
               if (var6 <= 1192770066) {
                  throw new IllegalStateException();
               }

               if ((var22[var23 + 1][var24] & 1076101504) == 0) {
                  if (var6 <= 1192770066) {
                     throw new IllegalStateException();
                  }

                  var11[var27] = var14 + 1;
                  var12[var27] = var15;
                  var27 = var27 + 1 & var13;
                  var10[1 + var16][var17] = 8;
                  var9[1 + var16][var17] = var25;
               }
            }

            if (var17 > 0) {
               if (var6 <= 1192770066) {
                  throw new IllegalStateException();
               }

               if (var10[var16][var17 - 1] == 0 && 0 == (var22[var23][var24 - 1] & 1076101378)) {
                  var11[var27] = var14;
                  var12[var27] = var15 - 1;
                  var27 = var27 + 1 & var13;
                  var10[var16][var17 - 1] = 1;
                  var9[var16][var17 - 1] = var25;
               }
            }

            if (var17 < var8 - 1) {
               if (var6 <= 1192770066) {
                  throw new IllegalStateException();
               }

               if (var10[var16][1 + var17] == 0) {
                  if (var6 <= 1192770066) {
                     throw new IllegalStateException();
                  }

                  if ((var22[var23][var24 + 1] & 1076101408) == 0) {
                     if (var6 <= 1192770066) {
                        throw new IllegalStateException();
                     }

                     var11[var27] = var14;
                     var12[var27] = 1 + var15;
                     var27 = 1 + var27 & var13;
                     var10[var16][1 + var17] = 4;
                     var9[var16][1 + var17] = var25;
                  }
               }
            }

            if (var16 > 0) {
               if (var6 <= 1192770066) {
                  throw new IllegalStateException();
               }

               if (var17 > 0) {
                  if (var6 <= 1192770066) {
                     throw new IllegalStateException();
                  }

                  if (0 == var10[var16 - 1][var17 - 1] && (var22[var23 - 1][var24 - 1] & 1076101390) == 0) {
                     if (var6 <= 1192770066) {
                        throw new IllegalStateException();
                     }

                     if (0 == (var22[var23 - 1][var24] & 1076101384)) {
                        if (var6 <= 1192770066) {
                           throw new IllegalStateException();
                        }

                        if (0 == (var22[var23][var24 - 1] & 1076101378)) {
                           if (var6 <= 1192770066) {
                              throw new IllegalStateException();
                           }

                           var11[var27] = var14 - 1;
                           var12[var27] = var15 - 1;
                           var27 = var27 + 1 & var13;
                           var10[var16 - 1][var17 - 1] = 3;
                           var9[var16 - 1][var17 - 1] = var25;
                        }
                     }
                  }
               }
            }

            if (var16 < var7 - 1) {
               if (var6 <= 1192770066) {
                  throw new IllegalStateException();
               }

               if (var17 > 0 && 0 == var10[var16 + 1][var17 - 1] && (var22[1 + var23][var24 - 1] & 1076101507) == 0) {
                  if (var6 <= 1192770066) {
                     throw new IllegalStateException();
                  }

                  if (0 == (var22[1 + var23][var24] & 1076101504)) {
                     if (var6 <= 1192770066) {
                        throw new IllegalStateException();
                     }

                     if ((var22[var23][var24 - 1] & 1076101378) == 0) {
                        if (var6 <= 1192770066) {
                           throw new IllegalStateException();
                        }

                        var11[var27] = var14 + 1;
                        var12[var27] = var15 - 1;
                        var27 = var27 + 1 & var13;
                        var10[var16 + 1][var17 - 1] = 9;
                        var9[var16 + 1][var17 - 1] = var25;
                     }
                  }
               }
            }

            if (var16 > 0) {
               if (var6 <= 1192770066) {
                  throw new IllegalStateException();
               }

               if (var17 < var8 - 1 && 0 == var10[var16 - 1][1 + var17]) {
                  if (var6 <= 1192770066) {
                     throw new IllegalStateException();
                  }

                  if ((var22[var23 - 1][1 + var24] & 1076101432) == 0) {
                     if (var6 <= 1192770066) {
                        throw new IllegalStateException();
                     }

                     if ((var22[var23 - 1][var24] & 1076101384) == 0 && (var22[var23][1 + var24] & 1076101408) == 0) {
                        if (var6 <= 1192770066) {
                           throw new IllegalStateException();
                        }

                        var11[var27] = var14 - 1;
                        var12[var27] = var15 + 1;
                        var27 = 1 + var27 & var13;
                        var10[var16 - 1][1 + var17] = 6;
                        var9[var16 - 1][var17 + 1] = var25;
                     }
                  }
               }
            }

            if (var16 < var7 - 1) {
               if (var6 <= 1192770066) {
                  throw new IllegalStateException();
               }

               if (var17 < var8 - 1) {
                  if (var6 <= 1192770066) {
                     throw new IllegalStateException();
                  }

                  if (var10[1 + var16][1 + var17] == 0) {
                     if (var6 <= 1192770066) {
                        throw new IllegalStateException();
                     }

                     if ((var22[var23 + 1][var24 + 1] & 1076101600) == 0) {
                        if (var6 <= 1192770066) {
                           throw new IllegalStateException();
                        }

                        if ((var22[1 + var23][var24] & 1076101504) == 0) {
                           if (var6 <= 1192770066) {
                              throw new IllegalStateException();
                           }

                           if ((var22[var23][1 + var24] & 1076101408) == 0) {
                              if (var6 <= 1192770066) {
                                 throw new IllegalStateException();
                              }

                              var11[var27] = 1 + var14;
                              var12[var27] = var15 + 1;
                              var27 = var27 + 1 & var13;
                              var10[1 + var16][1 + var17] = 12;
                              var9[1 + var16][1 + var17] = var25;
                           }
                        }
                     }
                  }
               }
            }
         }

         var5.ae(var14, var15, -1837644987);
         return false;
      } catch (RuntimeException var26) {
         throw vk.ae(var26, "kz.am(" + ')');
      }
   }

   final boolean az(int var1, int var2, ks var3, kd var4, kt var5) {
      int var6 = var5.ax(573030189);
      int var7 = var5.aq(1675403856);
      int[][] var8 = var5.at(1653357234);
      int[][] var9 = var5.af(-1327112640);
      int[] var10 = var5.au((byte)-80);
      int[] var11 = var5.ar(-96698690);
      int var12 = var5.al(1955736477);
      int var13 = var1;
      int var14 = var2;
      int var15 = var6 >> 1;
      int var16 = var7 >> 1;
      int var17 = var1 - var15;
      int var18 = var2 - var16;
      var9[var15][var16] = 99;
      var8[var15][var16] = 0;
      byte var19 = 0;
      int var20 = 0;
      var10[var19] = var1;
      byte var10001 = var19;
      int var25 = var19 + 1;
      var11[var10001] = var2;
      int[][] var21 = var4.bb;

      while(var25 != var20) {
         var13 = var10[var20];
         var14 = var11[var20];
         var20 = 1 + var20 & var12;
         var15 = var13 - var17;
         var16 = var14 - var18;
         int var22 = var13 - var4.ba * 2006280683;
         int var23 = var14 - var4.bj * 1389477570;
         if (var3.ac(2, var13, var14, var4, -1508153235)) {
            var5.ae(var13, var14, -1738402586);
            return true;
         }

         int var24 = var8[var15][var16] + 1;
         if (var15 > 0 && var9[var15 - 1][var16] == 0 && 0 == (var21[var22 - 1][var23] & 637294548) && (var21[var22 - 1][var23 + 1] & 1076101432) == 0) {
            var10[var25] = var13 - 1;
            var11[var25] = var14;
            var25 = var25 + 1 & var12;
            var9[var15 - 1][var16] = 2;
            var8[var15 - 1][var16] = var24;
         }

         if (var15 < var6 - 2 && 0 == var9[var15 + 1][var16] && 0 == (var21[var22 + 2][var23] & -1262703456) && 0 == (var21[var22 + 2][var23 + 1] & 1076101600)) {
            var10[var25] = 1 + var13;
            var11[var25] = var14;
            var25 = 1 + var25 & var12;
            var9[1 + var15][var16] = 8;
            var8[var15 + 1][var16] = var24;
         }

         if (var16 > 0 && var9[var15][var16 - 1] == 0 && 0 == (var21[var22][var23 - 1] & 1076101390) && 0 == (var21[var22 + 1][var23 - 1] & 735898355)) {
            var10[var25] = var13;
            var11[var25] = var14 - 1;
            var25 = var25 + 1 & var12;
            var9[var15][var16 - 1] = 1;
            var8[var15][var16 - 1] = var24;
         }

         if (var16 < var7 - 2 && var9[var15][var16 + 1] == 0 && 0 == (var21[var22][2 + var23] & 338594738) && (var21[var22 + 1][2 + var23] & -232319028) == 0) {
            var10[var25] = var13;
            var11[var25] = var14 + 1;
            var25 = 1 + var25 & var12;
            var9[var15][1 + var16] = 4;
            var8[var15][var16 + 1] = var24;
         }

         if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && (var21[var22 - 1][var23] & 1076101438) == 0 && 0 == (var21[var22 - 1][var23 - 1] & 1076101390) && (var21[var22][var23 - 1] & 1076101519) == 0) {
            var10[var25] = var13 - 1;
            var11[var25] = var14 - 1;
            var25 = 1 + var25 & var12;
            var9[var15 - 1][var16 - 1] = 3;
            var8[var15 - 1][var16 - 1] = var24;
         }

         if (var15 < var6 - 2 && var16 > 0 && 0 == var9[var15 + 1][var16 - 1] && 0 == (var21[var22 + 1][var23 - 1] & 483476553) && (var21[var22 + 2][var23 - 1] & 1076101507) == 0 && (var21[var22 + 2][var23] & 1076101603) == 0) {
            var10[var25] = 1 + var13;
            var11[var25] = var14 - 1;
            var25 = 1 + var25 & var12;
            var9[1 + var15][var16 - 1] = 9;
            var8[1 + var15][var16 - 1] = var24;
         }

         if (var15 > 0 && var16 < var7 - 2 && 0 == var9[var15 - 1][var16 + 1] && (var21[var22 - 1][1 + var23] & 1076101438) == 0 && (var21[var22 - 1][var23 + 2] & 1076101432) == 0 && 0 == (var21[var22][var23 + 2] & -1413976414)) {
            var10[var25] = var13 - 1;
            var11[var25] = 1 + var14;
            var25 = 1 + var25 & var12;
            var9[var15 - 1][1 + var16] = 6;
            var8[var15 - 1][var16 + 1] = var24;
         }

         if (var15 < var6 - 2 && var16 < var7 - 2 && var9[var15 + 1][var16 + 1] == 0 && 0 == (var21[1 + var22][var23 + 2] & -580286623) && (var21[var22 + 2][var23 + 2] & 1076101600) == 0 && (var21[2 + var22][var23 + 1] & 345789407) == 0) {
            var10[var25] = var13 + 1;
            var11[var25] = 1 + var14;
            var25 = var25 + 1 & var12;
            var9[1 + var15][var16 + 1] = 12;
            var8[1 + var15][1 + var16] = var24;
         }
      }

      var5.ae(var13, var14, -1548474278);
      return false;
   }

   int ap(int var1, int var2, int var3, ks var4, kd var5, boolean var6, int[] var7, int[] var8, kt var9) {
      var9.ac(-878417132);
      int var10 = var9.ax(1632359456);
      int var11 = var9.aq(1675403856);
      int[][] var12 = var9.at(-56885542);
      int[][] var13 = var9.af(-1327112640);
      int[] var14 = var9.au((byte)7);
      int[] var15 = var9.ar(-96698690);
      boolean var16;
      if (var3 == 1) {
         var16 = this.am(var1, var2, var4, var5, var9, 1437506886);
      } else if (2 == var3) {
         var16 = this.ax(var1, var2, var4, var5, var9, -1529842740);
      } else {
         var16 = this.aq(var1, var2, var3, var4, var5, var9, (byte)-75);
      }

      int var17 = var1 - (var10 >> 1);
      int var18 = var2 - (var11 >> 1);
      int var19 = var9.ag((byte)-4);
      int var20 = var9.am(2076583608);
      int var21;
      int var22;
      int var24;
      if (!var16) {
         if (!var6) {
            return -1;
         }

         var21 = 996134405;
         var22 = Integer.MAX_VALUE;
         byte var23 = 10;
         var24 = var4.ac * -1408432575;
         int var25 = var4.ae * -1789292501;
         int var26 = -1949965163 * var4.ag;
         int var27 = var4.am * 843919552;

         for(int var28 = var24 - var23; var28 <= var23 + var24; ++var28) {
            for(int var29 = var25 - var23; var29 <= var25 + var23; ++var29) {
               int var30 = var28 - var17;
               int var31 = var29 - var18;
               if (var30 >= 0 && var31 >= 0 && var30 < var10 && var31 < var11 && var12[var30][var31] < 1334046048) {
                  int var32 = 0;
                  if (var28 < var24) {
                     var32 = var24 - var28;
                  } else if (var28 > var26 + var24 - 1) {
                     var32 = var28 - (var24 + var26 - 1);
                  }

                  int var33 = 0;
                  if (var29 < var25) {
                     var33 = var25 - var29;
                  } else if (var29 > var27 + var25 - 1) {
                     var33 = var29 - (var25 + var27 - 1);
                  }

                  int var34 = var32 * var32 + var33 * var33;
                  if (var34 < var21 || var21 == var34 && var12[var30][var31] < var22) {
                     var21 = var34;
                     var22 = var12[var30][var31];
                     var19 = var28;
                     var20 = var29;
                  }
               }
            }
         }

         if (1199839304 == var21) {
            return -1;
         }
      }

      if (var19 == var1 && var2 == var20) {
         var7[0] = var19;
         var8[0] = var20;
         return 0;
      } else {
         byte var36 = 0;
         var14[var36] = var19;
         var21 = var36 + 1;
         var15[var36] = var20;

         int var37;
         for(var22 = var37 = var13[var19 - var17][var20 - var18]; var19 != var1 || var2 != var20; var22 = var13[var19 - var17][var20 - var18]) {
            if (var22 != var37) {
               var37 = var22;
               var14[var21] = var19;
               var15[var21++] = var20;
            }

            if (0 != (var22 & 2)) {
               ++var19;
            } else if ((var22 & 8) != 0) {
               --var19;
            }

            if (0 != (var22 & 1)) {
               ++var20;
            } else if (0 != (var22 & 4)) {
               --var20;
            }
         }

         var24 = 0;

         while(var21-- > 0) {
            var7[var24] = var14[var21];
            var8[var24++] = var15[var21];
            if (var24 >= var7.length) {
               break;
            }
         }

         return var24;
      }
   }

   public void af() {
      this.ac = new kt[1];
      kx var1 = kx.ag;
      this.ac[0] = new kt(740831676 * var1.au, 756967091 * var1.ar);
   }

   public void au() {
      this.ac = new kt[1];
      kx var1 = kx.ag;
      this.ac[0] = new kt(-1458469399 * var1.au, 756967091 * var1.ar);
   }

   final boolean aq(int var1, int var2, int var3, ks var4, kd var5, kt var6, byte var7) {
      try {
         int var8 = var6.ax(762768351);
         int var9 = var6.aq(1675403856);
         int[][] var10 = var6.at(2092433841);
         int[][] var11 = var6.af(-1327112640);
         int[] var12 = var6.au((byte)-8);
         int[] var13 = var6.ar(-96698690);
         int var14 = var6.al(2058836134);
         int var15 = var1;
         int var16 = var2;
         int var17 = var8 >> 1;
         int var18 = var9 >> 1;
         int var19 = var1 - var17;
         int var20 = var2 - var18;
         var11[var17][var18] = 99;
         var10[var17][var18] = 0;
         byte var21 = 0;
         int var22 = 0;
         var12[var21] = var1;
         int var29 = var21 + 1;
         var13[var21] = var2;
         int[][] var23 = var5.bb;

         label446:
         while(var29 != var22) {
            if (var7 >= 0) {
               throw new IllegalStateException();
            }

            var15 = var12[var22];
            var16 = var13[var22];
            var22 = var22 + 1 & var14;
            var17 = var15 - var19;
            var18 = var16 - var20;
            int var24 = var15 - 2006280683 * var5.ba;
            int var25 = var16 - var5.bj * 1444846889;
            if (var4.ac(var3, var15, var16, var5, -1508153235)) {
               if (var7 >= 0) {
                  throw new IllegalStateException();
               }

               var6.ae(var15, var16, -2051305416);
               return true;
            }

            int var26 = 1 + var10[var17][var18];
            int var27;
            if (var17 > 0) {
               if (var7 >= 0) {
                  throw new IllegalStateException();
               }

               if (var11[var17 - 1][var18] != 0) {
                  if (var7 >= 0) {
                     throw new IllegalStateException();
                  }
               } else if ((var23[var24 - 1][var25] & 1076101390) == 0) {
                  if ((var23[var24 - 1][var25 + var3 - 1] & 1076101432) != 0) {
                     if (var7 >= 0) {
                        throw new IllegalStateException();
                     }
                  } else {
                     label452: {
                        for(var27 = 1; var27 < var3 - 1; ++var27) {
                           if (var7 >= 0) {
                              throw new IllegalStateException();
                           }

                           if (0 != (var23[var24 - 1][var25 + var27] & 1076101438)) {
                              if (var7 >= 0) {
                                 throw new IllegalStateException();
                              }
                              break label452;
                           }
                        }

                        var12[var29] = var15 - 1;
                        var13[var29] = var16;
                        var29 = 1 + var29 & var14;
                        var11[var17 - 1][var18] = 2;
                        var10[var17 - 1][var18] = var26;
                     }
                  }
               }
            }

            if (var17 < var8 - var3) {
               if (var7 >= 0) {
                  throw new IllegalStateException();
               }

               if (var11[var17 + 1][var18] != 0) {
                  if (var7 >= 0) {
                     throw new IllegalStateException();
                  }
               } else if (0 != (var23[var3 + var24][var25] & 1076101507)) {
                  if (var7 >= 0) {
                     throw new IllegalStateException();
                  }
               } else if (0 != (var23[var24 + var3][var25 + var3 - 1] & 1076101600)) {
                  if (var7 >= 0) {
                     throw new IllegalStateException();
                  }
               } else {
                  label454: {
                     for(var27 = 1; var27 < var3 - 1; ++var27) {
                        if (var7 >= 0) {
                           throw new IllegalStateException();
                        }

                        if ((var23[var3 + var24][var27 + var25] & 1076101603) != 0) {
                           break label454;
                        }
                     }

                     var12[var29] = 1 + var15;
                     var13[var29] = var16;
                     var29 = var29 + 1 & var14;
                     var11[var17 + 1][var18] = 8;
                     var10[var17 + 1][var18] = var26;
                  }
               }
            }

            if (var18 > 0) {
               if (var7 >= 0) {
                  throw new IllegalStateException();
               }

               if (0 != var11[var17][var18 - 1]) {
                  if (var7 >= 0) {
                     throw new IllegalStateException();
                  }
               } else if ((var23[var24][var25 - 1] & 1076101390) != 0) {
                  if (var7 >= 0) {
                     throw new IllegalStateException();
                  }
               } else if ((var23[var24 + var3 - 1][var25 - 1] & 1076101507) != 0) {
                  if (var7 >= 0) {
                     throw new IllegalStateException();
                  }
               } else {
                  label456: {
                     for(var27 = 1; var27 < var3 - 1; ++var27) {
                        if (var7 >= 0) {
                           throw new IllegalStateException();
                        }

                        if ((var23[var27 + var24][var25 - 1] & 1076101519) != 0) {
                           if (var7 >= 0) {
                              throw new IllegalStateException();
                           }
                           break label456;
                        }
                     }

                     var12[var29] = var15;
                     var13[var29] = var16 - 1;
                     var29 = 1 + var29 & var14;
                     var11[var17][var18 - 1] = 1;
                     var10[var17][var18 - 1] = var26;
                  }
               }
            }

            if (var18 < var9 - var3) {
               if (0 != var11[var17][var18 + 1]) {
                  if (var7 >= 0) {
                     throw new IllegalStateException();
                  }
               } else if (0 != (var23[var24][var25 + var3] & 1076101432)) {
                  if (var7 >= 0) {
                     throw new IllegalStateException();
                  }
               } else if ((var23[var24 + var3 - 1][var3 + var25] & 1076101600) != 0) {
                  if (var7 >= 0) {
                     throw new IllegalStateException();
                  }
               } else {
                  label458: {
                     for(var27 = 1; var27 < var3 - 1; ++var27) {
                        if (var7 >= 0) {
                           throw new IllegalStateException();
                        }

                        if (0 != (var23[var24 + var27][var25 + var3] & 1076101624)) {
                           if (var7 >= 0) {
                              throw new IllegalStateException();
                           }
                           break label458;
                        }
                     }

                     var12[var29] = var15;
                     var13[var29] = 1 + var16;
                     var29 = var29 + 1 & var14;
                     var11[var17][1 + var18] = 4;
                     var10[var17][var18 + 1] = var26;
                  }
               }
            }

            if (var17 > 0) {
               if (var7 >= 0) {
                  throw new IllegalStateException();
               }

               if (var18 > 0) {
                  if (var11[var17 - 1][var18 - 1] != 0) {
                     if (var7 >= 0) {
                        throw new IllegalStateException();
                     }
                  } else if (0 != (var23[var24 - 1][var25 - 1] & 1076101390)) {
                     if (var7 >= 0) {
                        throw new IllegalStateException();
                     }
                  } else {
                     var27 = 1;

                     while(true) {
                        if (var27 >= var3) {
                           var12[var29] = var15 - 1;
                           var13[var29] = var16 - 1;
                           var29 = var29 + 1 & var14;
                           var11[var17 - 1][var18 - 1] = 3;
                           var10[var17 - 1][var18 - 1] = var26;
                           break;
                        }

                        if (0 != (var23[var24 - 1][var27 + (var25 - 1)] & 1076101438)) {
                           break;
                        }

                        if (0 != (var23[var24 - 1 + var27][var25 - 1] & 1076101519)) {
                           if (var7 >= 0) {
                              throw new IllegalStateException();
                           }
                           break;
                        }

                        ++var27;
                     }
                  }
               }
            }

            if (var17 < var8 - var3 && var18 > 0) {
               if (var7 >= 0) {
                  throw new IllegalStateException();
               }

               if (0 != var11[1 + var17][var18 - 1]) {
                  if (var7 >= 0) {
                     throw new IllegalStateException();
                  }
               } else if ((var23[var24 + var3][var25 - 1] & 1076101507) != 0) {
                  if (var7 >= 0) {
                     throw new IllegalStateException();
                  }
               } else {
                  label461: {
                     for(var27 = 1; var27 < var3; ++var27) {
                        if (var7 >= 0) {
                           throw new IllegalStateException();
                        }

                        if ((var23[var3 + var24][var25 - 1 + var27] & 1076101603) != 0) {
                           if (var7 >= 0) {
                              throw new IllegalStateException();
                           }
                           break label461;
                        }

                        if (0 != (var23[var24 + var27][var25 - 1] & 1076101519)) {
                           if (var7 >= 0) {
                              throw new IllegalStateException();
                           }
                           break label461;
                        }
                     }

                     var12[var29] = var15 + 1;
                     var13[var29] = var16 - 1;
                     var29 = var29 + 1 & var14;
                     var11[1 + var17][var18 - 1] = 9;
                     var10[var17 + 1][var18 - 1] = var26;
                  }
               }
            }

            if (var17 > 0) {
               if (var7 >= 0) {
                  throw new IllegalStateException();
               }

               if (var18 < var9 - var3) {
                  if (var7 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (0 == var11[var17 - 1][var18 + 1] && (var23[var24 - 1][var25 + var3] & 1076101432) == 0) {
                     label463: {
                        for(var27 = 1; var27 < var3; ++var27) {
                           if (var7 >= 0) {
                              throw new IllegalStateException();
                           }

                           if (0 != (var23[var24 - 1][var27 + var25] & 1076101438)) {
                              if (var7 >= 0) {
                                 throw new IllegalStateException();
                              }
                              break label463;
                           }

                           if (0 != (var23[var24 - 1 + var27][var3 + var25] & 1076101624)) {
                              if (var7 >= 0) {
                                 throw new IllegalStateException();
                              }
                              break label463;
                           }
                        }

                        var12[var29] = var15 - 1;
                        var13[var29] = var16 + 1;
                        var29 = var29 + 1 & var14;
                        var11[var17 - 1][1 + var18] = 6;
                        var10[var17 - 1][var18 + 1] = var26;
                     }
                  }
               }
            }

            if (var17 < var8 - var3) {
               if (var7 >= 0) {
                  throw new IllegalStateException();
               }

               if (var18 < var9 - var3) {
                  if (var7 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (var11[var17 + 1][1 + var18] == 0) {
                     if (0 != (var23[var24 + var3][var3 + var25] & 1076101600)) {
                        if (var7 >= 0) {
                           throw new IllegalStateException();
                        }
                     } else {
                        for(var27 = 1; var27 < var3; ++var27) {
                           if (var7 >= 0) {
                              throw new IllegalStateException();
                           }

                           if ((var23[var24 + var27][var25 + var3] & 1076101624) != 0) {
                              if (var7 >= 0) {
                                 throw new IllegalStateException();
                              }
                              continue label446;
                           }

                           if ((var23[var3 + var24][var25 + var27] & 1076101603) != 0) {
                              if (var7 >= 0) {
                                 throw new IllegalStateException();
                              }
                              continue label446;
                           }
                        }

                        var12[var29] = 1 + var15;
                        var13[var29] = var16 + 1;
                        var29 = 1 + var29 & var14;
                        var11[var17 + 1][1 + var18] = 12;
                        var10[var17 + 1][1 + var18] = var26;
                     }
                  }
               }
            }
         }

         var6.ae(var15, var16, -1906847717);
         return false;
      } catch (RuntimeException var28) {
         throw vk.ae(var28, "kz.aq(" + ')');
      }
   }

   public int al(int var1, int var2, int var3, ks var4, kd var5, boolean var6, int[] var7, int[] var8) {
      return this.ag(var1, var2, var3, var4, var5, var6, var7, var8, this.ac[0], -461299189);
   }

   public int ad(int var1, int var2, int var3, ks var4, kd var5, boolean var6, int[] var7, int[] var8) {
      return this.ag(var1, var2, var3, var4, var5, var6, var7, var8, this.ac[0], -461299189);
   }

   int ah(int var1, int var2, int var3, ks var4, kd var5, boolean var6, int[] var7, int[] var8, kt var9) {
      var9.ac(-583499560);
      int var10 = var9.ax(1847705576);
      int var11 = var9.aq(1675403856);
      int[][] var12 = var9.at(123953058);
      int[][] var13 = var9.af(-1327112640);
      int[] var14 = var9.au((byte)49);
      int[] var15 = var9.ar(-96698690);
      boolean var16;
      if (var3 == 1) {
         var16 = this.am(var1, var2, var4, var5, var9, 1611702405);
      } else if (2 == var3) {
         var16 = this.ax(var1, var2, var4, var5, var9, -1529842740);
      } else {
         var16 = this.aq(var1, var2, var3, var4, var5, var9, (byte)-75);
      }

      int var17 = var1 - (var10 >> 1);
      int var18 = var2 - (var11 >> 1);
      int var19 = var9.ag((byte)-117);
      int var20 = var9.am(1993707559);
      int var21;
      int var22;
      int var24;
      if (!var16) {
         if (!var6) {
            return -1;
         }

         var21 = Integer.MAX_VALUE;
         var22 = Integer.MAX_VALUE;
         byte var23 = 10;
         var24 = var4.ac * -1584948049;
         int var25 = var4.ae * -1705190523;
         int var26 = 1276684756 * var4.ag;
         int var27 = var4.am * -918476910;

         for(int var28 = var24 - var23; var28 <= var23 + var24; ++var28) {
            for(int var29 = var25 - var23; var29 <= var25 + var23; ++var29) {
               int var30 = var28 - var17;
               int var31 = var29 - var18;
               if (var30 >= 0 && var31 >= 0 && var30 < var10 && var31 < var11 && var12[var30][var31] < 100) {
                  int var32 = 0;
                  if (var28 < var24) {
                     var32 = var24 - var28;
                  } else if (var28 > var26 + var24 - 1) {
                     var32 = var28 - (var24 + var26 - 1);
                  }

                  int var33 = 0;
                  if (var29 < var25) {
                     var33 = var25 - var29;
                  } else if (var29 > var27 + var25 - 1) {
                     var33 = var29 - (var25 + var27 - 1);
                  }

                  int var34 = var32 * var32 + var33 * var33;
                  if (var34 < var21 || var21 == var34 && var12[var30][var31] < var22) {
                     var21 = var34;
                     var22 = var12[var30][var31];
                     var19 = var28;
                     var20 = var29;
                  }
               }
            }
         }

         if (-992263942 == var21) {
            return -1;
         }
      }

      if (var19 == var1 && var2 == var20) {
         var7[0] = var19;
         var8[0] = var20;
         return 0;
      } else {
         byte var36 = 0;
         var14[var36] = var19;
         var21 = var36 + 1;
         var15[var36] = var20;

         int var37;
         for(var22 = var37 = var13[var19 - var17][var20 - var18]; var19 != var1 || var2 != var20; var22 = var13[var19 - var17][var20 - var18]) {
            if (var22 != var37) {
               var37 = var22;
               var14[var21] = var19;
               var15[var21++] = var20;
            }

            if (0 != (var22 & 2)) {
               ++var19;
            } else if ((var22 & 8) != 0) {
               --var19;
            }

            if (0 != (var22 & 1)) {
               ++var20;
            } else if (0 != (var22 & 4)) {
               --var20;
            }
         }

         var24 = 0;

         while(var21-- > 0) {
            var7[var24] = var14[var21];
            var8[var24++] = var15[var21];
            if (var24 >= var7.length) {
               break;
            }
         }

         return var24;
      }
   }

   public void at() {
      this.ac = new kt[1];
      kx var1 = kx.ag;
      this.ac[0] = new kt(-1458469399 * var1.au, 756967091 * var1.ar);
   }

   final boolean ab(int var1, int var2, ks var3, kd var4, kt var5) {
      int var6 = var5.ax(1550940590);
      int var7 = var5.aq(1675403856);
      int[][] var8 = var5.at(837520653);
      int[][] var9 = var5.af(-1327112640);
      int[] var10 = var5.au((byte)-123);
      int[] var11 = var5.ar(-96698690);
      int var12 = var5.al(2095407908);
      int var13 = var1;
      int var14 = var2;
      int var15 = var6 >> 1;
      int var16 = var7 >> 1;
      int var17 = var1 - var15;
      int var18 = var2 - var16;
      var9[var15][var16] = 99;
      var8[var15][var16] = 0;
      byte var19 = 0;
      int var20 = 0;
      var10[var19] = var1;
      byte var10001 = var19;
      int var25 = var19 + 1;
      var11[var10001] = var2;
      int[][] var21 = var4.bb;

      while(var25 != var20) {
         var13 = var10[var20];
         var14 = var11[var20];
         var20 = 1 + var20 & var12;
         var15 = var13 - var17;
         var16 = var14 - var18;
         int var22 = var13 - var4.ba * 2006280683;
         int var23 = var14 - var4.bj * 1444846889;
         if (var3.ac(2, var13, var14, var4, -1508153235)) {
            var5.ae(var13, var14, -1687728504);
            return true;
         }

         int var24 = var8[var15][var16] + 1;
         if (var15 > 0 && var9[var15 - 1][var16] == 0 && 0 == (var21[var22 - 1][var23] & 1076101390) && (var21[var22 - 1][var23 + 1] & 1076101432) == 0) {
            var10[var25] = var13 - 1;
            var11[var25] = var14;
            var25 = var25 + 1 & var12;
            var9[var15 - 1][var16] = 2;
            var8[var15 - 1][var16] = var24;
         }

         if (var15 < var6 - 2 && 0 == var9[var15 + 1][var16] && 0 == (var21[var22 + 2][var23] & 1076101507) && 0 == (var21[var22 + 2][var23 + 1] & 1076101600)) {
            var10[var25] = 1 + var13;
            var11[var25] = var14;
            var25 = 1 + var25 & var12;
            var9[1 + var15][var16] = 8;
            var8[var15 + 1][var16] = var24;
         }

         if (var16 > 0 && var9[var15][var16 - 1] == 0 && 0 == (var21[var22][var23 - 1] & 1076101390) && 0 == (var21[var22 + 1][var23 - 1] & 1076101507)) {
            var10[var25] = var13;
            var11[var25] = var14 - 1;
            var25 = var25 + 1 & var12;
            var9[var15][var16 - 1] = 1;
            var8[var15][var16 - 1] = var24;
         }

         if (var16 < var7 - 2 && var9[var15][var16 + 1] == 0 && 0 == (var21[var22][2 + var23] & 1076101432) && (var21[var22 + 1][2 + var23] & 1076101600) == 0) {
            var10[var25] = var13;
            var11[var25] = var14 + 1;
            var25 = 1 + var25 & var12;
            var9[var15][1 + var16] = 4;
            var8[var15][var16 + 1] = var24;
         }

         if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && (var21[var22 - 1][var23] & 1076101438) == 0 && 0 == (var21[var22 - 1][var23 - 1] & 1076101390) && (var21[var22][var23 - 1] & 1076101519) == 0) {
            var10[var25] = var13 - 1;
            var11[var25] = var14 - 1;
            var25 = 1 + var25 & var12;
            var9[var15 - 1][var16 - 1] = 3;
            var8[var15 - 1][var16 - 1] = var24;
         }

         if (var15 < var6 - 2 && var16 > 0 && 0 == var9[var15 + 1][var16 - 1] && 0 == (var21[var22 + 1][var23 - 1] & 1076101519) && (var21[var22 + 2][var23 - 1] & 1076101507) == 0 && (var21[var22 + 2][var23] & 1076101603) == 0) {
            var10[var25] = 1 + var13;
            var11[var25] = var14 - 1;
            var25 = 1 + var25 & var12;
            var9[1 + var15][var16 - 1] = 9;
            var8[1 + var15][var16 - 1] = var24;
         }

         if (var15 > 0 && var16 < var7 - 2 && 0 == var9[var15 - 1][var16 + 1] && (var21[var22 - 1][1 + var23] & 1076101438) == 0 && (var21[var22 - 1][var23 + 2] & 1076101432) == 0 && 0 == (var21[var22][var23 + 2] & 1076101624)) {
            var10[var25] = var13 - 1;
            var11[var25] = 1 + var14;
            var25 = 1 + var25 & var12;
            var9[var15 - 1][1 + var16] = 6;
            var8[var15 - 1][var16 + 1] = var24;
         }

         if (var15 < var6 - 2 && var16 < var7 - 2 && var9[var15 + 1][var16 + 1] == 0 && 0 == (var21[1 + var22][var23 + 2] & 1076101624) && (var21[var22 + 2][var23 + 2] & 1076101600) == 0 && (var21[2 + var22][var23 + 1] & 1076101603) == 0) {
            var10[var25] = var13 + 1;
            var11[var25] = 1 + var14;
            var25 = var25 + 1 & var12;
            var9[1 + var15][var16 + 1] = 12;
            var8[1 + var15][1 + var16] = var24;
         }
      }

      var5.ae(var13, var14, -1620421502);
      return false;
   }

   final boolean ax(int var1, int var2, ks var3, kd var4, kt var5, int var6) {
      try {
         int var7 = var5.ax(563348180);
         int var8 = var5.aq(1675403856);
         int[][] var9 = var5.at(585310382);
         int[][] var10 = var5.af(-1327112640);
         int[] var11 = var5.au((byte)37);
         int[] var12 = var5.ar(-96698690);
         int var13 = var5.al(2094087894);
         int var14 = var1;
         int var15 = var2;
         int var16 = var7 >> 1;
         int var17 = var8 >> 1;
         int var18 = var1 - var16;
         int var19 = var2 - var17;
         var10[var16][var17] = 99;
         var9[var16][var17] = 0;
         byte var20 = 0;
         int var21 = 0;
         var11[var20] = var1;
         byte var10001 = var20;
         int var27 = var20 + 1;
         var12[var10001] = var2;
         int[][] var22 = var4.bb;

         while(var27 != var21) {
            var14 = var11[var21];
            var15 = var12[var21];
            var21 = 1 + var21 & var13;
            var16 = var14 - var18;
            var17 = var15 - var19;
            int var23 = var14 - var4.ba * 2006280683;
            int var24 = var15 - var4.bj * 1444846889;
            if (var3.ac(2, var14, var15, var4, -1508153235)) {
               if (var6 != -1529842740) {
                  throw new IllegalStateException();
               }

               var5.ae(var14, var15, -1767259516);
               return true;
            }

            int var25 = var9[var16][var17] + 1;
            if (var16 > 0) {
               if (var6 != -1529842740) {
                  throw new IllegalStateException();
               }

               if (var10[var16 - 1][var17] != 0) {
                  if (var6 != -1529842740) {
                     throw new IllegalStateException();
                  }
               } else if (0 == (var22[var23 - 1][var24] & 1076101390)) {
                  if ((var22[var23 - 1][var24 + 1] & 1076101432) != 0) {
                     if (var6 != -1529842740) {
                        throw new IllegalStateException();
                     }
                  } else {
                     var11[var27] = var14 - 1;
                     var12[var27] = var15;
                     var27 = var27 + 1 & var13;
                     var10[var16 - 1][var17] = 2;
                     var9[var16 - 1][var17] = var25;
                  }
               }
            }

            if (var16 < var7 - 2) {
               if (var6 != -1529842740) {
                  throw new IllegalStateException();
               }

               if (0 != var10[var16 + 1][var17]) {
                  if (var6 != -1529842740) {
                     throw new IllegalStateException();
                  }
               } else if (0 != (var22[var23 + 2][var24] & 1076101507)) {
                  if (var6 != -1529842740) {
                     throw new IllegalStateException();
                  }
               } else if (0 != (var22[var23 + 2][var24 + 1] & 1076101600)) {
                  if (var6 != -1529842740) {
                     throw new IllegalStateException();
                  }
               } else {
                  var11[var27] = 1 + var14;
                  var12[var27] = var15;
                  var27 = 1 + var27 & var13;
                  var10[1 + var16][var17] = 8;
                  var9[var16 + 1][var17] = var25;
               }
            }

            if (var17 > 0) {
               if (var6 != -1529842740) {
                  throw new IllegalStateException();
               }

               if (var10[var16][var17 - 1] != 0) {
                  if (var6 != -1529842740) {
                     throw new IllegalStateException();
                  }
               } else if (0 == (var22[var23][var24 - 1] & 1076101390)) {
                  if (0 != (var22[var23 + 1][var24 - 1] & 1076101507)) {
                     if (var6 != -1529842740) {
                        throw new IllegalStateException();
                     }
                  } else {
                     var11[var27] = var14;
                     var12[var27] = var15 - 1;
                     var27 = var27 + 1 & var13;
                     var10[var16][var17 - 1] = 1;
                     var9[var16][var17 - 1] = var25;
                  }
               }
            }

            if (var17 < var8 - 2) {
               if (var10[var16][var17 + 1] != 0) {
                  if (var6 != -1529842740) {
                     throw new IllegalStateException();
                  }
               } else if (0 != (var22[var23][2 + var24] & 1076101432)) {
                  if (var6 != -1529842740) {
                     throw new IllegalStateException();
                  }
               } else if ((var22[var23 + 1][2 + var24] & 1076101600) != 0) {
                  if (var6 != -1529842740) {
                     throw new IllegalStateException();
                  }
               } else {
                  var11[var27] = var14;
                  var12[var27] = var15 + 1;
                  var27 = 1 + var27 & var13;
                  var10[var16][1 + var17] = 4;
                  var9[var16][var17 + 1] = var25;
               }
            }

            if (var16 > 0) {
               if (var6 != -1529842740) {
                  throw new IllegalStateException();
               }

               if (var17 > 0) {
                  if (var6 != -1529842740) {
                     throw new IllegalStateException();
                  }

                  if (var10[var16 - 1][var17 - 1] != 0) {
                     if (var6 != -1529842740) {
                        throw new IllegalStateException();
                     }
                  } else if ((var22[var23 - 1][var24] & 1076101438) != 0) {
                     if (var6 != -1529842740) {
                        throw new IllegalStateException();
                     }
                  } else if (0 == (var22[var23 - 1][var24 - 1] & 1076101390)) {
                     if ((var22[var23][var24 - 1] & 1076101519) != 0) {
                        if (var6 != -1529842740) {
                           throw new IllegalStateException();
                        }
                     } else {
                        var11[var27] = var14 - 1;
                        var12[var27] = var15 - 1;
                        var27 = 1 + var27 & var13;
                        var10[var16 - 1][var17 - 1] = 3;
                        var9[var16 - 1][var17 - 1] = var25;
                     }
                  }
               }
            }

            if (var16 < var7 - 2) {
               if (var6 != -1529842740) {
                  throw new IllegalStateException();
               }

               if (var17 > 0) {
                  if (var6 != -1529842740) {
                     throw new IllegalStateException();
                  }

                  if (0 != var10[var16 + 1][var17 - 1]) {
                     if (var6 != -1529842740) {
                        throw new IllegalStateException();
                     }
                  } else if (0 != (var22[var23 + 1][var24 - 1] & 1076101519)) {
                     if (var6 != -1529842740) {
                        throw new IllegalStateException();
                     }
                  } else if ((var22[var23 + 2][var24 - 1] & 1076101507) != 0) {
                     if (var6 != -1529842740) {
                        throw new IllegalStateException();
                     }
                  } else if ((var22[var23 + 2][var24] & 1076101603) != 0) {
                     if (var6 != -1529842740) {
                        throw new IllegalStateException();
                     }
                  } else {
                     var11[var27] = 1 + var14;
                     var12[var27] = var15 - 1;
                     var27 = 1 + var27 & var13;
                     var10[1 + var16][var17 - 1] = 9;
                     var9[1 + var16][var17 - 1] = var25;
                  }
               }
            }

            if (var16 > 0) {
               if (var6 != -1529842740) {
                  throw new IllegalStateException();
               }

               if (var17 < var8 - 2 && 0 == var10[var16 - 1][var17 + 1]) {
                  if ((var22[var23 - 1][1 + var24] & 1076101438) != 0) {
                     if (var6 != -1529842740) {
                        throw new IllegalStateException();
                     }
                  } else if ((var22[var23 - 1][var24 + 2] & 1076101432) != 0) {
                     if (var6 != -1529842740) {
                        throw new IllegalStateException();
                     }
                  } else if (0 == (var22[var23][var24 + 2] & 1076101624)) {
                     var11[var27] = var14 - 1;
                     var12[var27] = 1 + var15;
                     var27 = 1 + var27 & var13;
                     var10[var16 - 1][1 + var17] = 6;
                     var9[var16 - 1][var17 + 1] = var25;
                  }
               }
            }

            if (var16 < var7 - 2) {
               if (var6 != -1529842740) {
                  throw new IllegalStateException();
               }

               if (var17 < var8 - 2 && var10[var16 + 1][var17 + 1] == 0) {
                  if (0 != (var22[1 + var23][var24 + 2] & 1076101624)) {
                     if (var6 != -1529842740) {
                        throw new IllegalStateException();
                     }
                  } else if ((var22[var23 + 2][var24 + 2] & 1076101600) != 0) {
                     if (var6 != -1529842740) {
                        throw new IllegalStateException();
                     }
                  } else if ((var22[2 + var23][var24 + 1] & 1076101603) != 0) {
                     if (var6 != -1529842740) {
                        throw new IllegalStateException();
                     }
                  } else {
                     var11[var27] = var14 + 1;
                     var12[var27] = 1 + var15;
                     var27 = var27 + 1 & var13;
                     var10[1 + var16][var17 + 1] = 12;
                     var9[1 + var16][1 + var17] = var25;
                  }
               }
            }
         }

         var5.ae(var14, var15, -1900822731);
         return false;
      } catch (RuntimeException var26) {
         throw vk.ae(var26, "kz.ax(" + ')');
      }
   }
}
