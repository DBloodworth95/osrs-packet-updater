public class kx {
   kj[] ap;

   final boolean ah(int var1, int var2, int var3, ke var4, ko var5, kj var6) {
      int var7 = var6.ai((byte)112);
      int var8 = var6.ay((short)-24261);
      int[][] var9 = var6.ae(1495159176);
      int[][] var10 = var6.as(2024621420);
      int[] var11 = var6.am(-902234805);
      int[] var12 = var6.at(302908949);
      int var13 = var6.au((byte)19);
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
      int var27 = var20 + 1;
      var12[var20] = var2;
      int[][] var22 = var5.bn;

      while(true) {
         label336:
         while(true) {
            int var23;
            int var24;
            int var25;
            int var26;
            do {
               do {
                  do {
                     label313:
                     do {
                        if (var21 == var27) {
                           var6.aw(var14, var15, 1755130751);
                           return false;
                        }

                        var14 = var11[var21];
                        var15 = var12[var21];
                        var21 = var21 + 1 & var13;
                        var16 = var14 - var18;
                        var17 = var15 - var19;
                        var23 = var14 - 321668887 * var5.bz;
                        var24 = var15 - -346318203 * var5.bc;
                        if (var4.ap(var3, var14, var15, var5, 1947951630)) {
                           var6.aw(var14, var15, 831061694);
                           return true;
                        }

                        var25 = var9[var16][var17] + 1;
                        if (var16 > 0 && var10[var16 - 1][var17] == 0 && (var22[var23 - 1][var24] & 1076101390) == 0 && (var22[var23 - 1][var24 + var3 - 1] & 1076101432) == 0) {
                           var26 = 1;

                           while(true) {
                              if (var26 >= var3 - 1) {
                                 var11[var27] = var14 - 1;
                                 var12[var27] = var15;
                                 var27 = 1 + var27 & var13;
                                 var10[var16 - 1][var17] = 2;
                                 var9[var16 - 1][var17] = var25;
                                 break;
                              }

                              if ((var22[var23 - 1][var24 + var26] & 1076101438) != 0) {
                                 break;
                              }

                              ++var26;
                           }
                        }

                        if (var16 < var7 - var3 && 0 == var10[var16 + 1][var17] && 0 == (var22[var23 + var3][var24] & 1076101507) && 0 == (var22[var23 + var3][var24 + var3 - 1] & 1076101600)) {
                           var26 = 1;

                           while(true) {
                              if (var26 >= var3 - 1) {
                                 var11[var27] = 1 + var14;
                                 var12[var27] = var15;
                                 var27 = var27 + 1 & var13;
                                 var10[var16 + 1][var17] = 8;
                                 var9[var16 + 1][var17] = var25;
                                 break;
                              }

                              if (0 != (var22[var23 + var3][var26 + var24] & 1076101603)) {
                                 break;
                              }

                              ++var26;
                           }
                        }

                        if (var17 > 0 && 0 == var10[var16][var17 - 1] && 0 == (var22[var23][var24 - 1] & 1076101390) && (var22[var3 + var23 - 1][var24 - 1] & 1076101507) == 0) {
                           var26 = 1;

                           while(true) {
                              if (var26 >= var3 - 1) {
                                 var11[var27] = var14;
                                 var12[var27] = var15 - 1;
                                 var27 = var27 + 1 & var13;
                                 var10[var16][var17 - 1] = 1;
                                 var9[var16][var17 - 1] = var25;
                                 break;
                              }

                              if ((var22[var26 + var23][var24 - 1] & 1076101519) != 0) {
                                 break;
                              }

                              ++var26;
                           }
                        }

                        if (var17 < var8 - var3 && 0 == var10[var16][var17 + 1] && (var22[var23][var24 + var3] & 1076101432) == 0 && (var22[var23 + var3 - 1][var24 + var3] & 1076101600) == 0) {
                           var26 = 1;

                           while(true) {
                              if (var26 >= var3 - 1) {
                                 var11[var27] = var14;
                                 var12[var27] = 1 + var15;
                                 var27 = 1 + var27 & var13;
                                 var10[var16][1 + var17] = 4;
                                 var9[var16][1 + var17] = var25;
                                 break;
                              }

                              if (0 != (var22[var23 + var26][var24 + var3] & 1076101624)) {
                                 break;
                              }

                              ++var26;
                           }
                        }

                        if (var16 > 0 && var17 > 0 && 0 == var10[var16 - 1][var17 - 1] && (var22[var23 - 1][var24 - 1] & 1076101390) == 0) {
                           var26 = 1;

                           while(true) {
                              if (var26 >= var3) {
                                 var11[var27] = var14 - 1;
                                 var12[var27] = var15 - 1;
                                 var27 = var27 + 1 & var13;
                                 var10[var16 - 1][var17 - 1] = 3;
                                 var9[var16 - 1][var17 - 1] = var25;
                                 break;
                              }

                              if ((var22[var23 - 1][var24 - 1 + var26] & 1076101438) != 0 || 0 != (var22[var26 + (var23 - 1)][var24 - 1] & 1076101519)) {
                                 break;
                              }

                              ++var26;
                           }
                        }

                        if (var16 < var7 - var3 && var17 > 0 && var10[var16 + 1][var17 - 1] == 0 && (var22[var3 + var23][var24 - 1] & 1076101507) == 0) {
                           var26 = 1;

                           while(true) {
                              if (var26 >= var3) {
                                 var11[var27] = 1 + var14;
                                 var12[var27] = var15 - 1;
                                 var27 = 1 + var27 & var13;
                                 var10[var16 + 1][var17 - 1] = 9;
                                 var9[var16 + 1][var17 - 1] = var25;
                                 break;
                              }

                              if (0 != (var22[var23 + var3][var24 - 1 + var26] & 1076101603) || (var22[var26 + var23][var24 - 1] & 1076101519) != 0) {
                                 break;
                              }

                              ++var26;
                           }
                        }

                        if (var16 > 0 && var17 < var8 - var3 && 0 == var10[var16 - 1][1 + var17] && 0 == (var22[var23 - 1][var24 + var3] & 1076101432)) {
                           for(var26 = 1; var26 < var3; ++var26) {
                              if (0 != (var22[var23 - 1][var26 + var24] & 1076101438) || 0 != (var22[var26 + (var23 - 1)][var24 + var3] & 1076101624)) {
                                 continue label313;
                              }
                           }

                           var11[var27] = var14 - 1;
                           var12[var27] = var15 + 1;
                           var27 = 1 + var27 & var13;
                           var10[var16 - 1][1 + var17] = 6;
                           var9[var16 - 1][1 + var17] = var25;
                        }
                     } while(var16 >= var7 - var3);
                  } while(var17 >= var8 - var3);
               } while(0 != var10[1 + var16][var17 + 1]);
            } while(0 != (var22[var23 + var3][var3 + var24] & 1076101600));

            for(var26 = 1; var26 < var3; ++var26) {
               if ((var22[var23 + var26][var24 + var3] & 1076101624) != 0 || (var22[var23 + var3][var26 + var24] & 1076101603) != 0) {
                  continue label336;
               }
            }

            var11[var27] = 1 + var14;
            var12[var27] = var15 + 1;
            var27 = 1 + var27 & var13;
            var10[1 + var16][var17 + 1] = 12;
            var9[1 + var16][1 + var17] = var25;
         }
      }
   }

   public void ap(int var1) {
      try {
         this.ap = new kj[1];
         kl var2 = kl.ak;
         this.ap[0] = new kj(17621929 * var2.am, 1855241859 * var2.at);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "kx.ap(" + ')');
      }
   }

   final boolean al(int var1, int var2, int var3, ke var4, ko var5, kj var6) {
      int var7 = var6.ai((byte)82);
      int var8 = var6.ay((short)-28223);
      int[][] var9 = var6.ae(1685815524);
      int[][] var10 = var6.as(1475017842);
      int[] var11 = var6.am(26943750);
      int[] var12 = var6.at(1668406614);
      int var13 = var6.au((byte)19);
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
      int var27 = var20 + 1;
      var12[var20] = var2;
      int[][] var22 = var5.bn;

      while(true) {
         label336:
         while(true) {
            int var23;
            int var24;
            int var25;
            int var26;
            do {
               do {
                  do {
                     label313:
                     do {
                        if (var21 == var27) {
                           var6.aw(var14, var15, 1459858848);
                           return false;
                        }

                        var14 = var11[var21];
                        var15 = var12[var21];
                        var21 = var21 + 1 & var13;
                        var16 = var14 - var18;
                        var17 = var15 - var19;
                        var23 = var14 - 321668887 * var5.bz;
                        var24 = var15 - -346318203 * var5.bc;
                        if (var4.ap(var3, var14, var15, var5, 1947951630)) {
                           var6.aw(var14, var15, -1489796043);
                           return true;
                        }

                        var25 = var9[var16][var17] + 1;
                        if (var16 > 0 && var10[var16 - 1][var17] == 0 && (var22[var23 - 1][var24] & 1076101390) == 0 && (var22[var23 - 1][var24 + var3 - 1] & 1076101432) == 0) {
                           var26 = 1;

                           while(true) {
                              if (var26 >= var3 - 1) {
                                 var11[var27] = var14 - 1;
                                 var12[var27] = var15;
                                 var27 = 1 + var27 & var13;
                                 var10[var16 - 1][var17] = 2;
                                 var9[var16 - 1][var17] = var25;
                                 break;
                              }

                              if ((var22[var23 - 1][var24 + var26] & 1076101438) != 0) {
                                 break;
                              }

                              ++var26;
                           }
                        }

                        if (var16 < var7 - var3 && 0 == var10[var16 + 1][var17] && 0 == (var22[var23 + var3][var24] & 1076101507) && 0 == (var22[var23 + var3][var24 + var3 - 1] & 1076101600)) {
                           var26 = 1;

                           while(true) {
                              if (var26 >= var3 - 1) {
                                 var11[var27] = 1 + var14;
                                 var12[var27] = var15;
                                 var27 = var27 + 1 & var13;
                                 var10[var16 + 1][var17] = 8;
                                 var9[var16 + 1][var17] = var25;
                                 break;
                              }

                              if (0 != (var22[var23 + var3][var26 + var24] & 1076101603)) {
                                 break;
                              }

                              ++var26;
                           }
                        }

                        if (var17 > 0 && 0 == var10[var16][var17 - 1] && 0 == (var22[var23][var24 - 1] & 1076101390) && (var22[var3 + var23 - 1][var24 - 1] & 1076101507) == 0) {
                           var26 = 1;

                           while(true) {
                              if (var26 >= var3 - 1) {
                                 var11[var27] = var14;
                                 var12[var27] = var15 - 1;
                                 var27 = var27 + 1 & var13;
                                 var10[var16][var17 - 1] = 1;
                                 var9[var16][var17 - 1] = var25;
                                 break;
                              }

                              if ((var22[var26 + var23][var24 - 1] & 1076101519) != 0) {
                                 break;
                              }

                              ++var26;
                           }
                        }

                        if (var17 < var8 - var3 && 0 == var10[var16][var17 + 1] && (var22[var23][var24 + var3] & 1076101432) == 0 && (var22[var23 + var3 - 1][var24 + var3] & 1076101600) == 0) {
                           var26 = 1;

                           while(true) {
                              if (var26 >= var3 - 1) {
                                 var11[var27] = var14;
                                 var12[var27] = 1 + var15;
                                 var27 = 1 + var27 & var13;
                                 var10[var16][1 + var17] = 4;
                                 var9[var16][1 + var17] = var25;
                                 break;
                              }

                              if (0 != (var22[var23 + var26][var24 + var3] & 1076101624)) {
                                 break;
                              }

                              ++var26;
                           }
                        }

                        if (var16 > 0 && var17 > 0 && 0 == var10[var16 - 1][var17 - 1] && (var22[var23 - 1][var24 - 1] & 1076101390) == 0) {
                           var26 = 1;

                           while(true) {
                              if (var26 >= var3) {
                                 var11[var27] = var14 - 1;
                                 var12[var27] = var15 - 1;
                                 var27 = var27 + 1 & var13;
                                 var10[var16 - 1][var17 - 1] = 3;
                                 var9[var16 - 1][var17 - 1] = var25;
                                 break;
                              }

                              if ((var22[var23 - 1][var24 - 1 + var26] & 1076101438) != 0 || 0 != (var22[var26 + (var23 - 1)][var24 - 1] & 1076101519)) {
                                 break;
                              }

                              ++var26;
                           }
                        }

                        if (var16 < var7 - var3 && var17 > 0 && var10[var16 + 1][var17 - 1] == 0 && (var22[var3 + var23][var24 - 1] & 1076101507) == 0) {
                           var26 = 1;

                           while(true) {
                              if (var26 >= var3) {
                                 var11[var27] = 1 + var14;
                                 var12[var27] = var15 - 1;
                                 var27 = 1 + var27 & var13;
                                 var10[var16 + 1][var17 - 1] = 9;
                                 var9[var16 + 1][var17 - 1] = var25;
                                 break;
                              }

                              if (0 != (var22[var23 + var3][var24 - 1 + var26] & 1076101603) || (var22[var26 + var23][var24 - 1] & 1076101519) != 0) {
                                 break;
                              }

                              ++var26;
                           }
                        }

                        if (var16 > 0 && var17 < var8 - var3 && 0 == var10[var16 - 1][1 + var17] && 0 == (var22[var23 - 1][var24 + var3] & 1076101432)) {
                           for(var26 = 1; var26 < var3; ++var26) {
                              if (0 != (var22[var23 - 1][var26 + var24] & 1076101438) || 0 != (var22[var26 + (var23 - 1)][var24 + var3] & 1076101624)) {
                                 continue label313;
                              }
                           }

                           var11[var27] = var14 - 1;
                           var12[var27] = var15 + 1;
                           var27 = 1 + var27 & var13;
                           var10[var16 - 1][1 + var17] = 6;
                           var9[var16 - 1][1 + var17] = var25;
                        }
                     } while(var16 >= var7 - var3);
                  } while(var17 >= var8 - var3);
               } while(0 != var10[1 + var16][var17 + 1]);
            } while(0 != (var22[var23 + var3][var3 + var24] & 1076101600));

            for(var26 = 1; var26 < var3; ++var26) {
               if ((var22[var23 + var26][var24 + var3] & 1076101624) != 0 || (var22[var23 + var3][var26 + var24] & 1076101603) != 0) {
                  continue label336;
               }
            }

            var11[var27] = 1 + var14;
            var12[var27] = var15 + 1;
            var27 = 1 + var27 & var13;
            var10[1 + var16][var17 + 1] = 12;
            var9[1 + var16][1 + var17] = var25;
         }
      }
   }

   int ak(int var1, int var2, int var3, ke var4, ko var5, boolean var6, int[] var7, int[] var8, kj var9, int var10) {
      try {
         var9.ap((byte)124);
         int var11 = var9.ai((byte)83);
         int var12 = var9.ay((short)-8741);
         int[][] var13 = var9.ae(735112624);
         int[][] var14 = var9.as(2037559208);
         int[] var15 = var9.am(2078856697);
         int[] var16 = var9.at(-56736632);
         boolean var17;
         if (1 == var3) {
            if (var10 >= -1780662800) {
               throw new IllegalStateException();
            }

            var17 = this.aj(var1, var2, var4, var5, var9, -1668443226);
         } else if (var3 == 2) {
            var17 = this.ai(var1, var2, var4, var5, var9, (byte)0);
         } else {
            var17 = this.ay(var1, var2, var3, var4, var5, var9, (byte)-11);
         }

         int var18 = var1 - (var11 >> 1);
         int var19 = var2 - (var12 >> 1);
         int var20 = var9.ak(-676966193);
         int var21 = var9.aj((byte)22);
         int var22;
         int var23;
         int var25;
         if (!var17) {
            if (var10 >= -1780662800) {
               throw new IllegalStateException();
            }

            if (!var6) {
               return -1;
            }

            if (var10 >= -1780662800) {
               throw new IllegalStateException();
            }

            var22 = Integer.MAX_VALUE;
            var23 = Integer.MAX_VALUE;
            byte var24 = 10;
            var25 = -362162455 * var4.ap;
            int var26 = var4.aw * -1731708745;
            int var27 = var4.ak * 220941055;
            int var28 = -558872821 * var4.aj;
            int var29 = var25 - var24;

            while(true) {
               if (var29 > var25 + var24) {
                  if (var22 == Integer.MAX_VALUE) {
                     if (var10 >= -1780662800) {
                        throw new IllegalStateException();
                     }

                     return -1;
                  }
                  break;
               }

               if (var10 >= -1780662800) {
                  throw new IllegalStateException();
               }

               for(int var30 = var26 - var24; var30 <= var24 + var26; ++var30) {
                  if (var10 >= -1780662800) {
                     throw new IllegalStateException();
                  }

                  int var31 = var29 - var18;
                  int var32 = var30 - var19;
                  if (var31 >= 0) {
                     if (var10 >= -1780662800) {
                        throw new IllegalStateException();
                     }

                     if (var32 >= 0) {
                        if (var10 >= -1780662800) {
                           throw new IllegalStateException();
                        }

                        if (var31 < var11) {
                           if (var10 >= -1780662800) {
                              throw new IllegalStateException();
                           }

                           if (var32 < var12) {
                              if (var10 >= -1780662800) {
                                 throw new IllegalStateException();
                              }

                              if (var13[var31][var32] < 100) {
                                 if (var10 >= -1780662800) {
                                    throw new IllegalStateException();
                                 }

                                 int var33 = 0;
                                 if (var29 < var25) {
                                    if (var10 >= -1780662800) {
                                       throw new IllegalStateException();
                                    }

                                    var33 = var25 - var29;
                                 } else if (var29 > var27 + var25 - 1) {
                                    if (var10 >= -1780662800) {
                                       throw new IllegalStateException();
                                    }

                                    var33 = var29 - (var25 + var27 - 1);
                                 }

                                 int var34 = 0;
                                 if (var30 < var26) {
                                    if (var10 >= -1780662800) {
                                       throw new IllegalStateException();
                                    }

                                    var34 = var26 - var30;
                                 } else if (var30 > var26 + var28 - 1) {
                                    if (var10 >= -1780662800) {
                                       throw new IllegalStateException();
                                    }

                                    var34 = var30 - (var28 + var26 - 1);
                                 }

                                 int var35 = var34 * var34 + var33 * var33;
                                 if (var35 >= var22) {
                                    if (var35 != var22) {
                                       continue;
                                    }

                                    if (var10 >= -1780662800) {
                                       throw new IllegalStateException();
                                    }

                                    if (var13[var31][var32] >= var23) {
                                       continue;
                                    }

                                    if (var10 >= -1780662800) {
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

               ++var29;
            }
         }

         if (var20 == var1) {
            if (var10 >= -1780662800) {
               throw new IllegalStateException();
            }

            if (var2 == var21) {
               if (var10 >= -1780662800) {
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
            if (var1 == var20) {
               if (var10 >= -1780662800) {
                  throw new IllegalStateException();
               }

               if (var2 == var21) {
                  var25 = 0;

                  while(var22-- > 0) {
                     if (var10 >= -1780662800) {
                        throw new IllegalStateException();
                     }

                     var7[var25] = var15[var22];
                     var8[var25++] = var16[var22];
                     if (var25 >= var7.length) {
                        if (var10 >= -1780662800) {
                           throw new IllegalStateException();
                        }
                        break;
                     }
                  }

                  return var25;
               }

               if (var10 >= -1780662800) {
                  throw new IllegalStateException();
               }
            }

            if (var23 != var39) {
               if (var10 >= -1780662800) {
                  throw new IllegalStateException();
               }

               var39 = var23;
               var15[var22] = var20;
               var16[var22++] = var21;
            }

            if (0 != (var23 & 2)) {
               ++var20;
            } else if ((var23 & 8) != 0) {
               if (var10 >= -1780662800) {
                  throw new IllegalStateException();
               }

               --var20;
            }

            if ((var23 & 1) != 0) {
               if (var10 >= -1780662800) {
                  throw new IllegalStateException();
               }

               ++var21;
            } else if (0 != (var23 & 4)) {
               --var21;
            }

            var23 = var14[var20 - var18][var21 - var19];
         }
      } catch (RuntimeException var36) {
         throw tm.aw(var36, "kx.ak(" + ')');
      }
   }

   final boolean aj(int var1, int var2, ke var3, ko var4, kj var5, int var6) {
      try {
         int var7 = var5.ai((byte)105);
         int var8 = var5.ay((short)-19493);
         int[][] var9 = var5.ae(18215725);
         int[][] var10 = var5.as(1729171063);
         int[] var11 = var5.am(-810788857);
         int[] var12 = var5.at(-1190830252);
         int var13 = var5.au((byte)19);
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
         int[][] var22 = var4.bn;

         while(var21 != var27) {
            if (var6 >= -705925151) {
               throw new IllegalStateException();
            }

            var14 = var11[var21];
            var15 = var12[var21];
            var21 = 1 + var21 & var13;
            var16 = var14 - var18;
            var17 = var15 - var19;
            int var23 = var14 - 321668887 * var4.bz;
            int var24 = var15 - -346318203 * var4.bc;
            if (var3.ap(1, var14, var15, var4, 1947951630)) {
               if (var6 >= -705925151) {
                  throw new IllegalStateException();
               }

               var5.aw(var14, var15, -1610299533);
               return true;
            }

            int var25 = var9[var16][var17] + 1;
            if (var16 > 0) {
               if (var6 >= -705925151) {
                  throw new IllegalStateException();
               }

               if (var10[var16 - 1][var17] == 0 && 0 == (var22[var23 - 1][var24] & 1076101384)) {
                  var11[var27] = var14 - 1;
                  var12[var27] = var15;
                  var27 = 1 + var27 & var13;
                  var10[var16 - 1][var17] = 2;
                  var9[var16 - 1][var17] = var25;
               }
            }

            if (var16 < var7 - 1) {
               if (var6 >= -705925151) {
                  throw new IllegalStateException();
               }

               if (0 == var10[1 + var16][var17]) {
                  if (var6 >= -705925151) {
                     throw new IllegalStateException();
                  }

                  if ((var22[1 + var23][var24] & 1076101504) == 0) {
                     if (var6 >= -705925151) {
                        throw new IllegalStateException();
                     }

                     var11[var27] = var14 + 1;
                     var12[var27] = var15;
                     var27 = 1 + var27 & var13;
                     var10[var16 + 1][var17] = 8;
                     var9[var16 + 1][var17] = var25;
                  }
               }
            }

            if (var17 > 0) {
               if (var6 >= -705925151) {
                  throw new IllegalStateException();
               }

               if (0 == var10[var16][var17 - 1]) {
                  if (var6 >= -705925151) {
                     throw new IllegalStateException();
                  }

                  if (0 == (var22[var23][var24 - 1] & 1076101378)) {
                     if (var6 >= -705925151) {
                        throw new IllegalStateException();
                     }

                     var11[var27] = var14;
                     var12[var27] = var15 - 1;
                     var27 = var27 + 1 & var13;
                     var10[var16][var17 - 1] = 1;
                     var9[var16][var17 - 1] = var25;
                  }
               }
            }

            if (var17 < var8 - 1) {
               if (var6 >= -705925151) {
                  throw new IllegalStateException();
               }

               if (0 == var10[var16][1 + var17]) {
                  if (var6 >= -705925151) {
                     throw new IllegalStateException();
                  }

                  if (0 == (var22[var23][var24 + 1] & 1076101408)) {
                     var11[var27] = var14;
                     var12[var27] = 1 + var15;
                     var27 = 1 + var27 & var13;
                     var10[var16][var17 + 1] = 4;
                     var9[var16][1 + var17] = var25;
                  }
               }
            }

            if (var16 > 0) {
               if (var6 >= -705925151) {
                  throw new IllegalStateException();
               }

               if (var17 > 0) {
                  if (var6 >= -705925151) {
                     throw new IllegalStateException();
                  }

                  if (var10[var16 - 1][var17 - 1] == 0 && (var22[var23 - 1][var24 - 1] & 1076101390) == 0 && (var22[var23 - 1][var24] & 1076101384) == 0) {
                     if (var6 >= -705925151) {
                        throw new IllegalStateException();
                     }

                     if (0 == (var22[var23][var24 - 1] & 1076101378)) {
                        if (var6 >= -705925151) {
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

            if (var16 < var7 - 1) {
               if (var6 >= -705925151) {
                  throw new IllegalStateException();
               }

               if (var17 > 0) {
                  if (var6 >= -705925151) {
                     throw new IllegalStateException();
                  }

                  if (var10[1 + var16][var17 - 1] == 0) {
                     if (var6 >= -705925151) {
                        throw new IllegalStateException();
                     }

                     if (0 == (var22[var23 + 1][var24 - 1] & 1076101507)) {
                        if (var6 >= -705925151) {
                           throw new IllegalStateException();
                        }

                        if (0 == (var22[var23 + 1][var24] & 1076101504)) {
                           if (var6 >= -705925151) {
                              throw new IllegalStateException();
                           }

                           if ((var22[var23][var24 - 1] & 1076101378) == 0) {
                              if (var6 >= -705925151) {
                                 throw new IllegalStateException();
                              }

                              var11[var27] = 1 + var14;
                              var12[var27] = var15 - 1;
                              var27 = 1 + var27 & var13;
                              var10[var16 + 1][var17 - 1] = 9;
                              var9[var16 + 1][var17 - 1] = var25;
                           }
                        }
                     }
                  }
               }
            }

            if (var16 > 0) {
               if (var6 >= -705925151) {
                  throw new IllegalStateException();
               }

               if (var17 < var8 - 1) {
                  if (var6 >= -705925151) {
                     throw new IllegalStateException();
                  }

                  if (0 == var10[var16 - 1][var17 + 1]) {
                     if (var6 >= -705925151) {
                        throw new IllegalStateException();
                     }

                     if ((var22[var23 - 1][var24 + 1] & 1076101432) == 0) {
                        if (var6 >= -705925151) {
                           throw new IllegalStateException();
                        }

                        if ((var22[var23 - 1][var24] & 1076101384) == 0 && 0 == (var22[var23][1 + var24] & 1076101408)) {
                           if (var6 >= -705925151) {
                              throw new IllegalStateException();
                           }

                           var11[var27] = var14 - 1;
                           var12[var27] = var15 + 1;
                           var27 = var27 + 1 & var13;
                           var10[var16 - 1][var17 + 1] = 6;
                           var9[var16 - 1][var17 + 1] = var25;
                        }
                     }
                  }
               }
            }

            if (var16 < var7 - 1 && var17 < var8 - 1) {
               if (var6 >= -705925151) {
                  throw new IllegalStateException();
               }

               if (0 == var10[1 + var16][var17 + 1] && 0 == (var22[var23 + 1][var24 + 1] & 1076101600)) {
                  if (var6 >= -705925151) {
                     throw new IllegalStateException();
                  }

                  if (0 == (var22[var23 + 1][var24] & 1076101504)) {
                     if (var6 >= -705925151) {
                        throw new IllegalStateException();
                     }

                     if ((var22[var23][1 + var24] & 1076101408) == 0) {
                        if (var6 >= -705925151) {
                           throw new IllegalStateException();
                        }

                        var11[var27] = 1 + var14;
                        var12[var27] = var15 + 1;
                        var27 = var27 + 1 & var13;
                        var10[1 + var16][var17 + 1] = 12;
                        var9[1 + var16][var17 + 1] = var25;
                     }
                  }
               }
            }
         }

         var5.aw(var14, var15, -138805317);
         return false;
      } catch (RuntimeException var26) {
         throw tm.aw(var26, "kx.aj(" + ')');
      }
   }

   public int aw(int var1, int var2, int var3, ke var4, ko var5, boolean var6, int[] var7, int[] var8, int var9) {
      try {
         return this.ak(var1, var2, var3, var4, var5, var6, var7, var8, this.ap[0], -1879814329);
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "kx.aw(" + ')');
      }
   }

   final boolean ay(int var1, int var2, int var3, ke var4, ko var5, kj var6, byte var7) {
      try {
         int var8 = var6.ai((byte)12);
         int var9 = var6.ay((short)-12958);
         int[][] var10 = var6.ae(1751524946);
         int[][] var11 = var6.as(1980902507);
         int[] var12 = var6.am(-589833107);
         int[] var13 = var6.at(1884724663);
         int var14 = var6.au((byte)19);
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
         int[][] var23 = var5.bn;

         label433:
         while(var22 != var29) {
            if (var7 >= -1) {
               throw new IllegalStateException();
            }

            var15 = var12[var22];
            var16 = var13[var22];
            var22 = var22 + 1 & var14;
            var17 = var15 - var19;
            var18 = var16 - var20;
            int var24 = var15 - 321668887 * var5.bz;
            int var25 = var16 - -346318203 * var5.bc;
            if (var4.ap(var3, var15, var16, var5, 1947951630)) {
               if (var7 >= -1) {
                  throw new IllegalStateException();
               }

               var6.aw(var15, var16, 361822051);
               return true;
            }

            int var26 = var10[var17][var18] + 1;
            int var27;
            if (var17 > 0) {
               if (var7 >= -1) {
                  throw new IllegalStateException();
               }

               if (var11[var17 - 1][var18] != 0) {
                  if (var7 >= -1) {
                     throw new IllegalStateException();
                  }
               } else if ((var23[var24 - 1][var25] & 1076101390) != 0) {
                  if (var7 >= -1) {
                     throw new IllegalStateException();
                  }
               } else if ((var23[var24 - 1][var25 + var3 - 1] & 1076101432) == 0) {
                  label439: {
                     for(var27 = 1; var27 < var3 - 1; ++var27) {
                        if (var7 >= -1) {
                           throw new IllegalStateException();
                        }

                        if ((var23[var24 - 1][var25 + var27] & 1076101438) != 0) {
                           if (var7 >= -1) {
                              throw new IllegalStateException();
                           }
                           break label439;
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

            if (var17 < var8 - var3) {
               if (var7 >= -1) {
                  throw new IllegalStateException();
               }

               if (0 != var11[var17 + 1][var18]) {
                  if (var7 >= -1) {
                     throw new IllegalStateException();
                  }
               } else if (0 == (var23[var24 + var3][var25] & 1076101507)) {
                  if (0 != (var23[var24 + var3][var25 + var3 - 1] & 1076101600)) {
                     if (var7 >= -1) {
                        throw new IllegalStateException();
                     }
                  } else {
                     label441: {
                        for(var27 = 1; var27 < var3 - 1; ++var27) {
                           if (var7 >= -1) {
                              throw new IllegalStateException();
                           }

                           if (0 != (var23[var24 + var3][var27 + var25] & 1076101603)) {
                              if (var7 >= -1) {
                                 throw new IllegalStateException();
                              }
                              break label441;
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
            }

            if (var18 > 0) {
               if (var7 >= -1) {
                  throw new IllegalStateException();
               }

               if (0 != var11[var17][var18 - 1]) {
                  if (var7 >= -1) {
                     throw new IllegalStateException();
                  }
               } else if (0 == (var23[var24][var25 - 1] & 1076101390)) {
                  if ((var23[var3 + var24 - 1][var25 - 1] & 1076101507) != 0) {
                     if (var7 >= -1) {
                        throw new IllegalStateException();
                     }
                  } else {
                     var27 = 1;

                     while(true) {
                        if (var27 >= var3 - 1) {
                           var12[var29] = var15;
                           var13[var29] = var16 - 1;
                           var29 = var29 + 1 & var14;
                           var11[var17][var18 - 1] = 1;
                           var10[var17][var18 - 1] = var26;
                           break;
                        }

                        if ((var23[var27 + var24][var25 - 1] & 1076101519) != 0) {
                           break;
                        }

                        ++var27;
                     }
                  }
               }
            }

            if (var18 < var9 - var3) {
               if (var7 >= -1) {
                  throw new IllegalStateException();
               }

               if (0 != var11[var17][var18 + 1]) {
                  if (var7 >= -1) {
                     throw new IllegalStateException();
                  }
               } else if ((var23[var24][var25 + var3] & 1076101432) != 0) {
                  if (var7 >= -1) {
                     throw new IllegalStateException();
                  }
               } else if ((var23[var24 + var3 - 1][var25 + var3] & 1076101600) != 0) {
                  if (var7 >= -1) {
                     throw new IllegalStateException();
                  }
               } else {
                  label444: {
                     for(var27 = 1; var27 < var3 - 1; ++var27) {
                        if (var7 >= -1) {
                           throw new IllegalStateException();
                        }

                        if (0 != (var23[var24 + var27][var25 + var3] & 1076101624)) {
                           if (var7 >= -1) {
                              throw new IllegalStateException();
                           }
                           break label444;
                        }
                     }

                     var12[var29] = var15;
                     var13[var29] = 1 + var16;
                     var29 = 1 + var29 & var14;
                     var11[var17][1 + var18] = 4;
                     var10[var17][1 + var18] = var26;
                  }
               }
            }

            if (var17 > 0) {
               if (var7 >= -1) {
                  throw new IllegalStateException();
               }

               if (var18 > 0 && 0 == var11[var17 - 1][var18 - 1]) {
                  if ((var23[var24 - 1][var25 - 1] & 1076101390) != 0) {
                     if (var7 >= -1) {
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

                        if ((var23[var24 - 1][var25 - 1 + var27] & 1076101438) != 0) {
                           if (var7 >= -1) {
                              throw new IllegalStateException();
                           }
                           break;
                        }

                        if (0 != (var23[var27 + (var24 - 1)][var25 - 1] & 1076101519)) {
                           break;
                        }

                        ++var27;
                     }
                  }
               }
            }

            if (var17 < var8 - var3) {
               if (var7 >= -1) {
                  throw new IllegalStateException();
               }

               if (var18 > 0) {
                  if (var7 >= -1) {
                     throw new IllegalStateException();
                  }

                  if (var11[var17 + 1][var18 - 1] == 0) {
                     if ((var23[var3 + var24][var25 - 1] & 1076101507) != 0) {
                        if (var7 >= -1) {
                           throw new IllegalStateException();
                        }
                     } else {
                        label447: {
                           for(var27 = 1; var27 < var3; ++var27) {
                              if (var7 >= -1) {
                                 throw new IllegalStateException();
                              }

                              if (0 != (var23[var24 + var3][var25 - 1 + var27] & 1076101603)) {
                                 if (var7 >= -1) {
                                    throw new IllegalStateException();
                                 }
                                 break label447;
                              }

                              if ((var23[var27 + var24][var25 - 1] & 1076101519) != 0) {
                                 if (var7 >= -1) {
                                    throw new IllegalStateException();
                                 }
                                 break label447;
                              }
                           }

                           var12[var29] = 1 + var15;
                           var13[var29] = var16 - 1;
                           var29 = 1 + var29 & var14;
                           var11[var17 + 1][var18 - 1] = 9;
                           var10[var17 + 1][var18 - 1] = var26;
                        }
                     }
                  }
               }
            }

            if (var17 > 0) {
               if (var7 >= -1) {
                  throw new IllegalStateException();
               }

               if (var18 < var9 - var3) {
                  if (0 != var11[var17 - 1][1 + var18]) {
                     if (var7 >= -1) {
                        throw new IllegalStateException();
                     }
                  } else if (0 != (var23[var24 - 1][var25 + var3] & 1076101432)) {
                     if (var7 >= -1) {
                        throw new IllegalStateException();
                     }
                  } else {
                     var27 = 1;

                     while(true) {
                        if (var27 >= var3) {
                           var12[var29] = var15 - 1;
                           var13[var29] = var16 + 1;
                           var29 = 1 + var29 & var14;
                           var11[var17 - 1][1 + var18] = 6;
                           var10[var17 - 1][1 + var18] = var26;
                           break;
                        }

                        if (0 != (var23[var24 - 1][var27 + var25] & 1076101438)) {
                           if (var7 >= -1) {
                              throw new IllegalStateException();
                           }
                           break;
                        }

                        if (0 != (var23[var27 + (var24 - 1)][var25 + var3] & 1076101624)) {
                           if (var7 >= -1) {
                              throw new IllegalStateException();
                           }
                           break;
                        }

                        ++var27;
                     }
                  }
               }
            }

            if (var17 < var8 - var3) {
               if (var7 >= -1) {
                  throw new IllegalStateException();
               }

               if (var18 < var9 - var3) {
                  if (var7 >= -1) {
                     throw new IllegalStateException();
                  }

                  if (0 == var11[1 + var17][var18 + 1]) {
                     if (0 != (var23[var24 + var3][var3 + var25] & 1076101600)) {
                        if (var7 >= -1) {
                           throw new IllegalStateException();
                        }
                     } else {
                        for(var27 = 1; var27 < var3; ++var27) {
                           if (var7 >= -1) {
                              throw new IllegalStateException();
                           }

                           if ((var23[var24 + var27][var25 + var3] & 1076101624) != 0) {
                              continue label433;
                           }

                           if ((var23[var24 + var3][var27 + var25] & 1076101603) != 0) {
                              if (var7 >= -1) {
                                 throw new IllegalStateException();
                              }
                              continue label433;
                           }
                        }

                        var12[var29] = 1 + var15;
                        var13[var29] = var16 + 1;
                        var29 = 1 + var29 & var14;
                        var11[1 + var17][var18 + 1] = 12;
                        var10[1 + var17][1 + var18] = var26;
                     }
                  }
               }
            }
         }

         var6.aw(var15, var16, 1886301242);
         return false;
      } catch (RuntimeException var28) {
         throw tm.aw(var28, "kx.ay(" + ')');
      }
   }

   final boolean az(int var1, int var2, ke var3, ko var4, kj var5) {
      int var6 = var5.ai((byte)72);
      int var7 = var5.ay((short)-23085);
      int[][] var8 = var5.ae(1486911326);
      int[][] var9 = var5.as(1864388332);
      int[] var10 = var5.am(608098824);
      int[] var11 = var5.at(-1772771786);
      int var12 = var5.au((byte)19);
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
      int[][] var21 = var4.bn;

      while(var20 != var25) {
         var13 = var10[var20];
         var14 = var11[var20];
         var20 = 1 + var20 & var12;
         var15 = var13 - var17;
         var16 = var14 - var18;
         int var22 = var13 - 937675120 * var4.bz;
         int var23 = var14 - -1481245357 * var4.bc;
         if (var3.ap(1, var13, var14, var4, 1947951630)) {
            var5.aw(var13, var14, -1391912608);
            return true;
         }

         int var24 = var8[var15][var16] + 1;
         if (var15 > 0 && var9[var15 - 1][var16] == 0 && 0 == (var21[var22 - 1][var23] & 1688293368)) {
            var10[var25] = var13 - 1;
            var11[var25] = var14;
            var25 = 1 + var25 & var12;
            var9[var15 - 1][var16] = 2;
            var8[var15 - 1][var16] = var24;
         }

         if (var15 < var6 - 1 && 0 == var9[1 + var15][var16] && (var21[1 + var22][var23] & 947227213) == 0) {
            var10[var25] = var13 + 1;
            var11[var25] = var14;
            var25 = 1 + var25 & var12;
            var9[var15 + 1][var16] = 8;
            var8[var15 + 1][var16] = var24;
         }

         if (var16 > 0 && 0 == var9[var15][var16 - 1] && 0 == (var21[var22][var23 - 1] & 1076101378)) {
            var10[var25] = var13;
            var11[var25] = var14 - 1;
            var25 = var25 + 1 & var12;
            var9[var15][var16 - 1] = 1;
            var8[var15][var16 - 1] = var24;
         }

         if (var16 < var7 - 1 && 0 == var9[var15][1 + var16] && 0 == (var21[var22][var23 + 1] & 1076101408)) {
            var10[var25] = var13;
            var11[var25] = 1 + var14;
            var25 = 1 + var25 & var12;
            var9[var15][var16 + 1] = 4;
            var8[var15][1 + var16] = var24;
         }

         if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && (var21[var22 - 1][var23 - 1] & -1063034758) == 0 && (var21[var22 - 1][var23] & 1076101384) == 0 && 0 == (var21[var22][var23 - 1] & 1076101378)) {
            var10[var25] = var13 - 1;
            var11[var25] = var14 - 1;
            var25 = var25 + 1 & var12;
            var9[var15 - 1][var16 - 1] = 3;
            var8[var15 - 1][var16 - 1] = var24;
         }

         if (var15 < var6 - 1 && var16 > 0 && var9[1 + var15][var16 - 1] == 0 && 0 == (var21[var22 + 1][var23 - 1] & -399034016) && 0 == (var21[var22 + 1][var23] & 1076101504) && (var21[var22][var23 - 1] & 1076101378) == 0) {
            var10[var25] = 1 + var13;
            var11[var25] = var14 - 1;
            var25 = 1 + var25 & var12;
            var9[var15 + 1][var16 - 1] = 9;
            var8[var15 + 1][var16 - 1] = var24;
         }

         if (var15 > 0 && var16 < var7 - 1 && 0 == var9[var15 - 1][var16 + 1] && (var21[var22 - 1][var23 + 1] & -1713975692) == 0 && (var21[var22 - 1][var23] & 1076101384) == 0 && 0 == (var21[var22][1 + var23] & 1863335487)) {
            var10[var25] = var13 - 1;
            var11[var25] = var14 + 1;
            var25 = var25 + 1 & var12;
            var9[var15 - 1][var16 + 1] = 6;
            var8[var15 - 1][var16 + 1] = var24;
         }

         if (var15 < var6 - 1 && var16 < var7 - 1 && 0 == var9[1 + var15][var16 + 1] && 0 == (var21[var22 + 1][var23 + 1] & 1688549818) && 0 == (var21[var22 + 1][var23] & 1076101504) && (var21[var22][1 + var23] & 1076101408) == 0) {
            var10[var25] = 1 + var13;
            var11[var25] = var14 + 1;
            var25 = var25 + 1 & var12;
            var9[1 + var15][var16 + 1] = 12;
            var8[1 + var15][var16 + 1] = var24;
         }
      }

      var5.aw(var13, var14, -856319882);
      return false;
   }

   final boolean ai(int var1, int var2, ke var3, ko var4, kj var5, byte var6) {
      try {
         int var7 = var5.ai((byte)116);
         int var8 = var5.ay((short)-3376);
         int[][] var9 = var5.ae(1085292196);
         int[][] var10 = var5.as(1989889725);
         int[] var11 = var5.am(-697230626);
         int[] var12 = var5.at(-903880001);
         int var13 = var5.au((byte)19);
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
         int[][] var22 = var4.bn;

         while(var21 != var27) {
            if (var6 != 0) {
               throw new IllegalStateException();
            }

            var14 = var11[var21];
            var15 = var12[var21];
            var21 = 1 + var21 & var13;
            var16 = var14 - var18;
            var17 = var15 - var19;
            int var23 = var14 - 321668887 * var4.bz;
            int var24 = var15 - -346318203 * var4.bc;
            if (var3.ap(2, var14, var15, var4, 1947951630)) {
               if (var6 != 0) {
                  throw new IllegalStateException();
               }

               var5.aw(var14, var15, 660960374);
               return true;
            }

            int var25 = var9[var16][var17] + 1;
            if (var16 > 0) {
               if (0 != var10[var16 - 1][var17]) {
                  if (var6 != 0) {
                     throw new IllegalStateException();
                  }
               } else if ((var22[var23 - 1][var24] & 1076101390) != 0) {
                  if (var6 != 0) {
                     throw new IllegalStateException();
                  }
               } else if ((var22[var23 - 1][var24 + 1] & 1076101432) != 0) {
                  if (var6 != 0) {
                     throw new IllegalStateException();
                  }
               } else {
                  var11[var27] = var14 - 1;
                  var12[var27] = var15;
                  var27 = 1 + var27 & var13;
                  var10[var16 - 1][var17] = 2;
                  var9[var16 - 1][var17] = var25;
               }
            }

            if (var16 < var7 - 2) {
               if (var10[var16 + 1][var17] != 0) {
                  if (var6 != 0) {
                     throw new IllegalStateException();
                  }
               } else if ((var22[var23 + 2][var24] & 1076101507) != 0) {
                  if (var6 != 0) {
                     throw new IllegalStateException();
                  }
               } else if (0 != (var22[2 + var23][1 + var24] & 1076101600)) {
                  if (var6 != 0) {
                     throw new IllegalStateException();
                  }
               } else {
                  var11[var27] = 1 + var14;
                  var12[var27] = var15;
                  var27 = var27 + 1 & var13;
                  var10[1 + var16][var17] = 8;
                  var9[var16 + 1][var17] = var25;
               }
            }

            if (var17 > 0) {
               if (var6 != 0) {
                  throw new IllegalStateException();
               }

               if (var10[var16][var17 - 1] != 0) {
                  if (var6 != 0) {
                     throw new IllegalStateException();
                  }
               } else if (0 != (var22[var23][var24 - 1] & 1076101390)) {
                  if (var6 != 0) {
                     throw new IllegalStateException();
                  }
               } else if (0 != (var22[var23 + 1][var24 - 1] & 1076101507)) {
                  if (var6 != 0) {
                     throw new IllegalStateException();
                  }
               } else {
                  var11[var27] = var14;
                  var12[var27] = var15 - 1;
                  var27 = 1 + var27 & var13;
                  var10[var16][var17 - 1] = 1;
                  var9[var16][var17 - 1] = var25;
               }
            }

            if (var17 < var8 - 2) {
               if (var6 != 0) {
                  throw new IllegalStateException();
               }

               if (var10[var16][var17 + 1] != 0) {
                  if (var6 != 0) {
                     throw new IllegalStateException();
                  }
               } else if ((var22[var23][var24 + 2] & 1076101432) != 0) {
                  if (var6 != 0) {
                     throw new IllegalStateException();
                  }
               } else if ((var22[var23 + 1][2 + var24] & 1076101600) != 0) {
                  if (var6 != 0) {
                     throw new IllegalStateException();
                  }
               } else {
                  var11[var27] = var14;
                  var12[var27] = 1 + var15;
                  var27 = var27 + 1 & var13;
                  var10[var16][var17 + 1] = 4;
                  var9[var16][1 + var17] = var25;
               }
            }

            if (var16 > 0) {
               if (var6 != 0) {
                  throw new IllegalStateException();
               }

               if (var17 > 0) {
                  if (0 != var10[var16 - 1][var17 - 1]) {
                     if (var6 != 0) {
                        throw new IllegalStateException();
                     }
                  } else if ((var22[var23 - 1][var24] & 1076101438) == 0 && (var22[var23 - 1][var24 - 1] & 1076101390) == 0) {
                     if ((var22[var23][var24 - 1] & 1076101519) != 0) {
                        if (var6 != 0) {
                           throw new IllegalStateException();
                        }
                     } else {
                        var11[var27] = var14 - 1;
                        var12[var27] = var15 - 1;
                        var27 = var27 + 1 & var13;
                        var10[var16 - 1][var17 - 1] = 3;
                        var9[var16 - 1][var17 - 1] = var25;
                     }
                  }
               }
            }

            if (var16 < var7 - 2) {
               if (var6 != 0) {
                  throw new IllegalStateException();
               }

               if (var17 > 0) {
                  if (var6 != 0) {
                     throw new IllegalStateException();
                  }

                  if (var10[var16 + 1][var17 - 1] != 0) {
                     if (var6 != 0) {
                        throw new IllegalStateException();
                     }
                  } else if (0 != (var22[1 + var23][var24 - 1] & 1076101519)) {
                     if (var6 != 0) {
                        throw new IllegalStateException();
                     }
                  } else if ((var22[2 + var23][var24 - 1] & 1076101507) == 0) {
                     if (0 != (var22[var23 + 2][var24] & 1076101603)) {
                        if (var6 != 0) {
                           throw new IllegalStateException();
                        }
                     } else {
                        var11[var27] = 1 + var14;
                        var12[var27] = var15 - 1;
                        var27 = 1 + var27 & var13;
                        var10[var16 + 1][var17 - 1] = 9;
                        var9[1 + var16][var17 - 1] = var25;
                     }
                  }
               }
            }

            if (var16 > 0) {
               if (var6 != 0) {
                  throw new IllegalStateException();
               }

               if (var17 < var8 - 2) {
                  if (var6 != 0) {
                     throw new IllegalStateException();
                  }

                  if (var10[var16 - 1][var17 + 1] != 0) {
                     if (var6 != 0) {
                        throw new IllegalStateException();
                     }
                  } else if ((var22[var23 - 1][1 + var24] & 1076101438) != 0) {
                     if (var6 != 0) {
                        throw new IllegalStateException();
                     }
                  } else if ((var22[var23 - 1][2 + var24] & 1076101432) == 0) {
                     if (0 != (var22[var23][2 + var24] & 1076101624)) {
                        if (var6 != 0) {
                           throw new IllegalStateException();
                        }
                     } else {
                        var11[var27] = var14 - 1;
                        var12[var27] = var15 + 1;
                        var27 = var27 + 1 & var13;
                        var10[var16 - 1][1 + var17] = 6;
                        var9[var16 - 1][1 + var17] = var25;
                     }
                  }
               }
            }

            if (var16 < var7 - 2) {
               if (var6 != 0) {
                  throw new IllegalStateException();
               }

               if (var17 < var8 - 2) {
                  if (var6 != 0) {
                     throw new IllegalStateException();
                  }

                  if (var10[1 + var16][1 + var17] != 0) {
                     if (var6 != 0) {
                        throw new IllegalStateException();
                     }
                  } else if (0 != (var22[1 + var23][2 + var24] & 1076101624)) {
                     if (var6 != 0) {
                        throw new IllegalStateException();
                     }
                  } else if ((var22[2 + var23][var24 + 2] & 1076101600) == 0) {
                     if (0 != (var22[2 + var23][1 + var24] & 1076101603)) {
                        if (var6 != 0) {
                           throw new IllegalStateException();
                        }
                     } else {
                        var11[var27] = 1 + var14;
                        var12[var27] = 1 + var15;
                        var27 = 1 + var27 & var13;
                        var10[1 + var16][var17 + 1] = 12;
                        var9[1 + var16][1 + var17] = var25;
                     }
                  }
               }
            }
         }

         var5.aw(var14, var15, -167383576);
         return false;
      } catch (RuntimeException var26) {
         throw tm.aw(var26, "kx.ai(" + ')');
      }
   }

   public int am(int var1, int var2, int var3, ke var4, ko var5, boolean var6, int[] var7, int[] var8) {
      return this.ak(var1, var2, var3, var4, var5, var6, var7, var8, this.ap[0], -1994184718);
   }

   public int at(int var1, int var2, int var3, ke var4, ko var5, boolean var6, int[] var7, int[] var8) {
      return this.ak(var1, var2, var3, var4, var5, var6, var7, var8, this.ap[0], -1928415854);
   }

   public int au(int var1, int var2, int var3, ke var4, ko var5, boolean var6, int[] var7, int[] var8) {
      return this.ak(var1, var2, var3, var4, var5, var6, var7, var8, this.ap[0], -1785777027);
   }

   int an(int var1, int var2, int var3, ke var4, ko var5, boolean var6, int[] var7, int[] var8, kj var9) {
      var9.ap((byte)5);
      int var10 = var9.ai((byte)77);
      int var11 = var9.ay((short)-13541);
      int[][] var12 = var9.ae(567614773);
      int[][] var13 = var9.as(1602396698);
      int[] var14 = var9.am(852187706);
      int[] var15 = var9.at(1161132622);
      boolean var16;
      if (1 == var3) {
         var16 = this.aj(var1, var2, var4, var5, var9, -2091999221);
      } else if (var3 == 2) {
         var16 = this.ai(var1, var2, var4, var5, var9, (byte)0);
      } else {
         var16 = this.ay(var1, var2, var3, var4, var5, var9, (byte)-26);
      }

      int var17 = var1 - (var10 >> 1);
      int var18 = var2 - (var11 >> 1);
      int var19 = var9.ak(-676966193);
      int var20 = var9.aj((byte)114);
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
         var24 = -362162455 * var4.ap;
         int var25 = var4.aw * -1731708745;
         int var26 = var4.ak * 220941055;
         int var27 = -558872821 * var4.aj;

         for(int var28 = var24 - var23; var28 <= var24 + var23; ++var28) {
            for(int var29 = var25 - var23; var29 <= var23 + var25; ++var29) {
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
                  } else if (var29 > var25 + var27 - 1) {
                     var33 = var29 - (var27 + var25 - 1);
                  }

                  int var34 = var33 * var33 + var32 * var32;
                  if (var34 < var21 || var34 == var21 && var12[var30][var31] < var22) {
                     var21 = var34;
                     var22 = var12[var30][var31];
                     var19 = var28;
                     var20 = var29;
                  }
               }
            }
         }

         if (var21 == Integer.MAX_VALUE) {
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
         for(var22 = var37 = var13[var19 - var17][var20 - var18]; var1 != var19 || var2 != var20; var22 = var13[var19 - var17][var20 - var18]) {
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

            if ((var22 & 1) != 0) {
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

   int ao(int var1, int var2, int var3, ke var4, ko var5, boolean var6, int[] var7, int[] var8, kj var9) {
      var9.ap((byte)30);
      int var10 = var9.ai((byte)63);
      int var11 = var9.ay((short)-11433);
      int[][] var12 = var9.ae(912054537);
      int[][] var13 = var9.as(1788579570);
      int[] var14 = var9.am(-450900737);
      int[] var15 = var9.at(-1280052682);
      boolean var16;
      if (1 == var3) {
         var16 = this.aj(var1, var2, var4, var5, var9, -1326142647);
      } else if (var3 == 2) {
         var16 = this.ai(var1, var2, var4, var5, var9, (byte)0);
      } else {
         var16 = this.ay(var1, var2, var3, var4, var5, var9, (byte)-108);
      }

      int var17 = var1 - (var10 >> 1);
      int var18 = var2 - (var11 >> 1);
      int var19 = var9.ak(-676966193);
      int var20 = var9.aj((byte)43);
      int var21;
      int var22;
      int var24;
      if (!var16) {
         if (!var6) {
            return -1;
         }

         var21 = 1941904492;
         var22 = -539655198;
         byte var23 = 10;
         var24 = -362162455 * var4.ap;
         int var25 = var4.aw * -1731708745;
         int var26 = var4.ak * 220941055;
         int var27 = -558872821 * var4.aj;

         for(int var28 = var24 - var23; var28 <= var24 + var23; ++var28) {
            for(int var29 = var25 - var23; var29 <= var23 + var25; ++var29) {
               int var30 = var28 - var17;
               int var31 = var29 - var18;
               if (var30 >= 0 && var31 >= 0 && var30 < var10 && var31 < var11 && var12[var30][var31] < 1357439126) {
                  int var32 = 0;
                  if (var28 < var24) {
                     var32 = var24 - var28;
                  } else if (var28 > var26 + var24 - 1) {
                     var32 = var28 - (var24 + var26 - 1);
                  }

                  int var33 = 0;
                  if (var29 < var25) {
                     var33 = var25 - var29;
                  } else if (var29 > var25 + var27 - 1) {
                     var33 = var29 - (var27 + var25 - 1);
                  }

                  int var34 = var33 * var33 + var32 * var32;
                  if (var34 < var21 || var34 == var21 && var12[var30][var31] < var22) {
                     var21 = var34;
                     var22 = var12[var30][var31];
                     var19 = var28;
                     var20 = var29;
                  }
               }
            }
         }

         if (var21 == -1920230010) {
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
         for(var22 = var37 = var13[var19 - var17][var20 - var18]; var1 != var19 || var2 != var20; var22 = var13[var19 - var17][var20 - var18]) {
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

            if ((var22 & 1) != 0) {
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

   int af(int var1, int var2, int var3, ke var4, ko var5, boolean var6, int[] var7, int[] var8, kj var9) {
      var9.ap((byte)61);
      int var10 = var9.ai((byte)67);
      int var11 = var9.ay((short)-29948);
      int[][] var12 = var9.ae(1940301512);
      int[][] var13 = var9.as(2097636681);
      int[] var14 = var9.am(378945401);
      int[] var15 = var9.at(-227959299);
      boolean var16;
      if (1 == var3) {
         var16 = this.aj(var1, var2, var4, var5, var9, -1568610811);
      } else if (var3 == 2) {
         var16 = this.ai(var1, var2, var4, var5, var9, (byte)0);
      } else {
         var16 = this.ay(var1, var2, var3, var4, var5, var9, (byte)-76);
      }

      int var17 = var1 - (var10 >> 1);
      int var18 = var2 - (var11 >> 1);
      int var19 = var9.ak(-676966193);
      int var20 = var9.aj((byte)68);
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
         var24 = -362162455 * var4.ap;
         int var25 = var4.aw * -1731708745;
         int var26 = var4.ak * 220941055;
         int var27 = -558872821 * var4.aj;

         for(int var28 = var24 - var23; var28 <= var24 + var23; ++var28) {
            for(int var29 = var25 - var23; var29 <= var23 + var25; ++var29) {
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
                  } else if (var29 > var25 + var27 - 1) {
                     var33 = var29 - (var27 + var25 - 1);
                  }

                  int var34 = var33 * var33 + var32 * var32;
                  if (var34 < var21 || var34 == var21 && var12[var30][var31] < var22) {
                     var21 = var34;
                     var22 = var12[var30][var31];
                     var19 = var28;
                     var20 = var29;
                  }
               }
            }
         }

         if (var21 == Integer.MAX_VALUE) {
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
         for(var22 = var37 = var13[var19 - var17][var20 - var18]; var1 != var19 || var2 != var20; var22 = var13[var19 - var17][var20 - var18]) {
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

            if ((var22 & 1) != 0) {
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

   int ar(int var1, int var2, int var3, ke var4, ko var5, boolean var6, int[] var7, int[] var8, kj var9) {
      var9.ap((byte)14);
      int var10 = var9.ai((byte)30);
      int var11 = var9.ay((short)-13916);
      int[][] var12 = var9.ae(366330685);
      int[][] var13 = var9.as(1874058911);
      int[] var14 = var9.am(1181477416);
      int[] var15 = var9.at(1512400564);
      boolean var16;
      if (1 == var3) {
         var16 = this.aj(var1, var2, var4, var5, var9, -2043093602);
      } else if (var3 == 2) {
         var16 = this.ai(var1, var2, var4, var5, var9, (byte)0);
      } else {
         var16 = this.ay(var1, var2, var3, var4, var5, var9, (byte)-106);
      }

      int var17 = var1 - (var10 >> 1);
      int var18 = var2 - (var11 >> 1);
      int var19 = var9.ak(-676966193);
      int var20 = var9.aj((byte)37);
      int var21;
      int var22;
      int var24;
      if (!var16) {
         if (!var6) {
            return -1;
         }

         var21 = -1520445299;
         var22 = -733170931;
         byte var23 = 10;
         var24 = -362162455 * var4.ap;
         int var25 = var4.aw * -1731708745;
         int var26 = var4.ak * 220941055;
         int var27 = -558872821 * var4.aj;

         for(int var28 = var24 - var23; var28 <= var24 + var23; ++var28) {
            for(int var29 = var25 - var23; var29 <= var23 + var25; ++var29) {
               int var30 = var28 - var17;
               int var31 = var29 - var18;
               if (var30 >= 0 && var31 >= 0 && var30 < var10 && var31 < var11 && var12[var30][var31] < -638094528) {
                  int var32 = 0;
                  if (var28 < var24) {
                     var32 = var24 - var28;
                  } else if (var28 > var26 + var24 - 1) {
                     var32 = var28 - (var24 + var26 - 1);
                  }

                  int var33 = 0;
                  if (var29 < var25) {
                     var33 = var25 - var29;
                  } else if (var29 > var25 + var27 - 1) {
                     var33 = var29 - (var27 + var25 - 1);
                  }

                  int var34 = var33 * var33 + var32 * var32;
                  if (var34 < var21 || var34 == var21 && var12[var30][var31] < var22) {
                     var21 = var34;
                     var22 = var12[var30][var31];
                     var19 = var28;
                     var20 = var29;
                  }
               }
            }
         }

         if (var21 == Integer.MAX_VALUE) {
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
         for(var22 = var37 = var13[var19 - var17][var20 - var18]; var1 != var19 || var2 != var20; var22 = var13[var19 - var17][var20 - var18]) {
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

            if ((var22 & 1) != 0) {
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

   final boolean ab(int var1, int var2, ke var3, ko var4, kj var5) {
      int var6 = var5.ai((byte)50);
      int var7 = var5.ay((short)-25787);
      int[][] var8 = var5.ae(1087317072);
      int[][] var9 = var5.as(1989900192);
      int[] var10 = var5.am(1299855750);
      int[] var11 = var5.at(-1328465265);
      int var12 = var5.au((byte)19);
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
      int[][] var21 = var4.bn;

      while(var20 != var25) {
         var13 = var10[var20];
         var14 = var11[var20];
         var20 = 1 + var20 & var12;
         var15 = var13 - var17;
         var16 = var14 - var18;
         int var22 = var13 - 321668887 * var4.bz;
         int var23 = var14 - -346318203 * var4.bc;
         if (var3.ap(1, var13, var14, var4, 1947951630)) {
            var5.aw(var13, var14, -1150145697);
            return true;
         }

         int var24 = var8[var15][var16] + 1;
         if (var15 > 0 && var9[var15 - 1][var16] == 0 && 0 == (var21[var22 - 1][var23] & 1076101384)) {
            var10[var25] = var13 - 1;
            var11[var25] = var14;
            var25 = 1 + var25 & var12;
            var9[var15 - 1][var16] = 2;
            var8[var15 - 1][var16] = var24;
         }

         if (var15 < var6 - 1 && 0 == var9[1 + var15][var16] && (var21[1 + var22][var23] & 1076101504) == 0) {
            var10[var25] = var13 + 1;
            var11[var25] = var14;
            var25 = 1 + var25 & var12;
            var9[var15 + 1][var16] = 8;
            var8[var15 + 1][var16] = var24;
         }

         if (var16 > 0 && 0 == var9[var15][var16 - 1] && 0 == (var21[var22][var23 - 1] & 1076101378)) {
            var10[var25] = var13;
            var11[var25] = var14 - 1;
            var25 = var25 + 1 & var12;
            var9[var15][var16 - 1] = 1;
            var8[var15][var16 - 1] = var24;
         }

         if (var16 < var7 - 1 && 0 == var9[var15][1 + var16] && 0 == (var21[var22][var23 + 1] & 1076101408)) {
            var10[var25] = var13;
            var11[var25] = 1 + var14;
            var25 = 1 + var25 & var12;
            var9[var15][var16 + 1] = 4;
            var8[var15][1 + var16] = var24;
         }

         if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && (var21[var22 - 1][var23 - 1] & 1076101390) == 0 && (var21[var22 - 1][var23] & 1076101384) == 0 && 0 == (var21[var22][var23 - 1] & 1076101378)) {
            var10[var25] = var13 - 1;
            var11[var25] = var14 - 1;
            var25 = var25 + 1 & var12;
            var9[var15 - 1][var16 - 1] = 3;
            var8[var15 - 1][var16 - 1] = var24;
         }

         if (var15 < var6 - 1 && var16 > 0 && var9[1 + var15][var16 - 1] == 0 && 0 == (var21[var22 + 1][var23 - 1] & 1076101507) && 0 == (var21[var22 + 1][var23] & 1076101504) && (var21[var22][var23 - 1] & 1076101378) == 0) {
            var10[var25] = 1 + var13;
            var11[var25] = var14 - 1;
            var25 = 1 + var25 & var12;
            var9[var15 + 1][var16 - 1] = 9;
            var8[var15 + 1][var16 - 1] = var24;
         }

         if (var15 > 0 && var16 < var7 - 1 && 0 == var9[var15 - 1][var16 + 1] && (var21[var22 - 1][var23 + 1] & 1076101432) == 0 && (var21[var22 - 1][var23] & 1076101384) == 0 && 0 == (var21[var22][1 + var23] & 1076101408)) {
            var10[var25] = var13 - 1;
            var11[var25] = var14 + 1;
            var25 = var25 + 1 & var12;
            var9[var15 - 1][var16 + 1] = 6;
            var8[var15 - 1][var16 + 1] = var24;
         }

         if (var15 < var6 - 1 && var16 < var7 - 1 && 0 == var9[1 + var15][var16 + 1] && 0 == (var21[var22 + 1][var23 + 1] & 1076101600) && 0 == (var21[var22 + 1][var23] & 1076101504) && (var21[var22][1 + var23] & 1076101408) == 0) {
            var10[var25] = 1 + var13;
            var11[var25] = var14 + 1;
            var25 = var25 + 1 & var12;
            var9[1 + var15][var16 + 1] = 12;
            var8[1 + var15][var16 + 1] = var24;
         }
      }

      var5.aw(var13, var14, 284521188);
      return false;
   }

   final boolean aq(int var1, int var2, ke var3, ko var4, kj var5) {
      int var6 = var5.ai((byte)109);
      int var7 = var5.ay((short)-12212);
      int[][] var8 = var5.ae(-346609895);
      int[][] var9 = var5.as(2103016155);
      int[] var10 = var5.am(1555141909);
      int[] var11 = var5.at(171049782);
      int var12 = var5.au((byte)19);
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
      int[][] var21 = var4.bn;

      while(var20 != var25) {
         var13 = var10[var20];
         var14 = var11[var20];
         var20 = 1 + var20 & var12;
         var15 = var13 - var17;
         var16 = var14 - var18;
         int var22 = var13 - 321668887 * var4.bz;
         int var23 = var14 - -346318203 * var4.bc;
         if (var3.ap(2, var13, var14, var4, 1947951630)) {
            var5.aw(var13, var14, -1081598592);
            return true;
         }

         int var24 = var8[var15][var16] + 1;
         if (var15 > 0 && 0 == var9[var15 - 1][var16] && (var21[var22 - 1][var23] & 1076101390) == 0 && (var21[var22 - 1][var23 + 1] & 1076101432) == 0) {
            var10[var25] = var13 - 1;
            var11[var25] = var14;
            var25 = 1 + var25 & var12;
            var9[var15 - 1][var16] = 2;
            var8[var15 - 1][var16] = var24;
         }

         if (var15 < var6 - 2 && var9[var15 + 1][var16] == 0 && (var21[var22 + 2][var23] & 1076101507) == 0 && 0 == (var21[2 + var22][1 + var23] & 1076101600)) {
            var10[var25] = 1 + var13;
            var11[var25] = var14;
            var25 = var25 + 1 & var12;
            var9[1 + var15][var16] = 8;
            var8[var15 + 1][var16] = var24;
         }

         if (var16 > 0 && var9[var15][var16 - 1] == 0 && 0 == (var21[var22][var23 - 1] & 1076101390) && 0 == (var21[var22 + 1][var23 - 1] & 1076101507)) {
            var10[var25] = var13;
            var11[var25] = var14 - 1;
            var25 = 1 + var25 & var12;
            var9[var15][var16 - 1] = 1;
            var8[var15][var16 - 1] = var24;
         }

         if (var16 < var7 - 2 && var9[var15][var16 + 1] == 0 && (var21[var22][var23 + 2] & 1076101432) == 0 && (var21[var22 + 1][2 + var23] & 1076101600) == 0) {
            var10[var25] = var13;
            var11[var25] = 1 + var14;
            var25 = var25 + 1 & var12;
            var9[var15][var16 + 1] = 4;
            var8[var15][1 + var16] = var24;
         }

         if (var15 > 0 && var16 > 0 && 0 == var9[var15 - 1][var16 - 1] && (var21[var22 - 1][var23] & 1076101438) == 0 && (var21[var22 - 1][var23 - 1] & 1076101390) == 0 && (var21[var22][var23 - 1] & 1076101519) == 0) {
            var10[var25] = var13 - 1;
            var11[var25] = var14 - 1;
            var25 = var25 + 1 & var12;
            var9[var15 - 1][var16 - 1] = 3;
            var8[var15 - 1][var16 - 1] = var24;
         }

         if (var15 < var6 - 2 && var16 > 0 && var9[var15 + 1][var16 - 1] == 0 && 0 == (var21[1 + var22][var23 - 1] & 1076101519) && (var21[2 + var22][var23 - 1] & 1076101507) == 0 && 0 == (var21[var22 + 2][var23] & 1076101603)) {
            var10[var25] = 1 + var13;
            var11[var25] = var14 - 1;
            var25 = 1 + var25 & var12;
            var9[var15 + 1][var16 - 1] = 9;
            var8[1 + var15][var16 - 1] = var24;
         }

         if (var15 > 0 && var16 < var7 - 2 && var9[var15 - 1][var16 + 1] == 0 && (var21[var22 - 1][1 + var23] & 1076101438) == 0 && (var21[var22 - 1][2 + var23] & 1076101432) == 0 && 0 == (var21[var22][2 + var23] & 1076101624)) {
            var10[var25] = var13 - 1;
            var11[var25] = var14 + 1;
            var25 = var25 + 1 & var12;
            var9[var15 - 1][1 + var16] = 6;
            var8[var15 - 1][1 + var16] = var24;
         }

         if (var15 < var6 - 2 && var16 < var7 - 2 && var9[1 + var15][1 + var16] == 0 && 0 == (var21[1 + var22][2 + var23] & 1076101624) && (var21[2 + var22][var23 + 2] & 1076101600) == 0 && 0 == (var21[2 + var22][1 + var23] & 1076101603)) {
            var10[var25] = 1 + var13;
            var11[var25] = 1 + var14;
            var25 = 1 + var25 & var12;
            var9[1 + var15][var16 + 1] = 12;
            var8[1 + var15][1 + var16] = var24;
         }
      }

      var5.aw(var13, var14, 1911282395);
      return false;
   }

   final boolean ag(int var1, int var2, ke var3, ko var4, kj var5) {
      int var6 = var5.ai((byte)21);
      int var7 = var5.ay((short)-1371);
      int[][] var8 = var5.ae(1356319228);
      int[][] var9 = var5.as(1994926095);
      int[] var10 = var5.am(286782348);
      int[] var11 = var5.at(-270492338);
      int var12 = var5.au((byte)19);
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
      int[][] var21 = var4.bn;

      while(var20 != var25) {
         var13 = var10[var20];
         var14 = var11[var20];
         var20 = 1 + var20 & var12;
         var15 = var13 - var17;
         var16 = var14 - var18;
         int var22 = var13 - 321668887 * var4.bz;
         int var23 = var14 - -346318203 * var4.bc;
         if (var3.ap(1, var13, var14, var4, 1947951630)) {
            var5.aw(var13, var14, -1302601597);
            return true;
         }

         int var24 = var8[var15][var16] + 1;
         if (var15 > 0 && var9[var15 - 1][var16] == 0 && 0 == (var21[var22 - 1][var23] & 1076101384)) {
            var10[var25] = var13 - 1;
            var11[var25] = var14;
            var25 = 1 + var25 & var12;
            var9[var15 - 1][var16] = 2;
            var8[var15 - 1][var16] = var24;
         }

         if (var15 < var6 - 1 && 0 == var9[1 + var15][var16] && (var21[1 + var22][var23] & 1076101504) == 0) {
            var10[var25] = var13 + 1;
            var11[var25] = var14;
            var25 = 1 + var25 & var12;
            var9[var15 + 1][var16] = 8;
            var8[var15 + 1][var16] = var24;
         }

         if (var16 > 0 && 0 == var9[var15][var16 - 1] && 0 == (var21[var22][var23 - 1] & 1076101378)) {
            var10[var25] = var13;
            var11[var25] = var14 - 1;
            var25 = var25 + 1 & var12;
            var9[var15][var16 - 1] = 1;
            var8[var15][var16 - 1] = var24;
         }

         if (var16 < var7 - 1 && 0 == var9[var15][1 + var16] && 0 == (var21[var22][var23 + 1] & 1076101408)) {
            var10[var25] = var13;
            var11[var25] = 1 + var14;
            var25 = 1 + var25 & var12;
            var9[var15][var16 + 1] = 4;
            var8[var15][1 + var16] = var24;
         }

         if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && (var21[var22 - 1][var23 - 1] & 1076101390) == 0 && (var21[var22 - 1][var23] & 1076101384) == 0 && 0 == (var21[var22][var23 - 1] & 1076101378)) {
            var10[var25] = var13 - 1;
            var11[var25] = var14 - 1;
            var25 = var25 + 1 & var12;
            var9[var15 - 1][var16 - 1] = 3;
            var8[var15 - 1][var16 - 1] = var24;
         }

         if (var15 < var6 - 1 && var16 > 0 && var9[1 + var15][var16 - 1] == 0 && 0 == (var21[var22 + 1][var23 - 1] & 1076101507) && 0 == (var21[var22 + 1][var23] & 1076101504) && (var21[var22][var23 - 1] & 1076101378) == 0) {
            var10[var25] = 1 + var13;
            var11[var25] = var14 - 1;
            var25 = 1 + var25 & var12;
            var9[var15 + 1][var16 - 1] = 9;
            var8[var15 + 1][var16 - 1] = var24;
         }

         if (var15 > 0 && var16 < var7 - 1 && 0 == var9[var15 - 1][var16 + 1] && (var21[var22 - 1][var23 + 1] & 1076101432) == 0 && (var21[var22 - 1][var23] & 1076101384) == 0 && 0 == (var21[var22][1 + var23] & 1076101408)) {
            var10[var25] = var13 - 1;
            var11[var25] = var14 + 1;
            var25 = var25 + 1 & var12;
            var9[var15 - 1][var16 + 1] = 6;
            var8[var15 - 1][var16 + 1] = var24;
         }

         if (var15 < var6 - 1 && var16 < var7 - 1 && 0 == var9[1 + var15][var16 + 1] && 0 == (var21[var22 + 1][var23 + 1] & 1076101600) && 0 == (var21[var22 + 1][var23] & 1076101504) && (var21[var22][1 + var23] & 1076101408) == 0) {
            var10[var25] = 1 + var13;
            var11[var25] = var14 + 1;
            var25 = var25 + 1 & var12;
            var9[1 + var15][var16 + 1] = 12;
            var8[1 + var15][var16 + 1] = var24;
         }
      }

      var5.aw(var13, var14, 2131163820);
      return false;
   }

   public void as() {
      this.ap = new kj[1];
      kl var1 = kl.ak;
      this.ap[0] = new kj(-1259042073 * var1.am, 1555198019 * var1.at);
   }

   final boolean av(int var1, int var2, ke var3, ko var4, kj var5) {
      int var6 = var5.ai((byte)114);
      int var7 = var5.ay((short)-25405);
      int[][] var8 = var5.ae(1545067900);
      int[][] var9 = var5.as(1627595334);
      int[] var10 = var5.am(1995662961);
      int[] var11 = var5.at(377241433);
      int var12 = var5.au((byte)19);
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
      int[][] var21 = var4.bn;

      while(var20 != var25) {
         var13 = var10[var20];
         var14 = var11[var20];
         var20 = 1 + var20 & var12;
         var15 = var13 - var17;
         var16 = var14 - var18;
         int var22 = var13 - -1738119662 * var4.bz;
         int var23 = var14 - -346318203 * var4.bc;
         if (var3.ap(2, var13, var14, var4, 1947951630)) {
            var5.aw(var13, var14, -1147917688);
            return true;
         }

         int var24 = var8[var15][var16] + 1;
         if (var15 > 0 && 0 == var9[var15 - 1][var16] && (var21[var22 - 1][var23] & 728294905) == 0 && (var21[var22 - 1][var23 + 1] & -815623197) == 0) {
            var10[var25] = var13 - 1;
            var11[var25] = var14;
            var25 = 1 + var25 & var12;
            var9[var15 - 1][var16] = 2;
            var8[var15 - 1][var16] = var24;
         }

         if (var15 < var6 - 2 && var9[var15 + 1][var16] == 0 && (var21[var22 + 2][var23] & -868703030) == 0 && 0 == (var21[2 + var22][1 + var23] & 1076101600)) {
            var10[var25] = 1 + var13;
            var11[var25] = var14;
            var25 = var25 + 1 & var12;
            var9[1 + var15][var16] = 8;
            var8[var15 + 1][var16] = var24;
         }

         if (var16 > 0 && var9[var15][var16 - 1] == 0 && 0 == (var21[var22][var23 - 1] & 1344517610) && 0 == (var21[var22 + 1][var23 - 1] & 602875147)) {
            var10[var25] = var13;
            var11[var25] = var14 - 1;
            var25 = 1 + var25 & var12;
            var9[var15][var16 - 1] = 1;
            var8[var15][var16 - 1] = var24;
         }

         if (var16 < var7 - 2 && var9[var15][var16 + 1] == 0 && (var21[var22][var23 + 2] & -1945840803) == 0 && (var21[var22 + 1][2 + var23] & 1076101600) == 0) {
            var10[var25] = var13;
            var11[var25] = 1 + var14;
            var25 = var25 + 1 & var12;
            var9[var15][var16 + 1] = 4;
            var8[var15][1 + var16] = var24;
         }

         if (var15 > 0 && var16 > 0 && 0 == var9[var15 - 1][var16 - 1] && (var21[var22 - 1][var23] & 1076101438) == 0 && (var21[var22 - 1][var23 - 1] & -1942756039) == 0 && (var21[var22][var23 - 1] & 791280314) == 0) {
            var10[var25] = var13 - 1;
            var11[var25] = var14 - 1;
            var25 = var25 + 1 & var12;
            var9[var15 - 1][var16 - 1] = 3;
            var8[var15 - 1][var16 - 1] = var24;
         }

         if (var15 < var6 - 2 && var16 > 0 && var9[var15 + 1][var16 - 1] == 0 && 0 == (var21[1 + var22][var23 - 1] & 1076101519) && (var21[2 + var22][var23 - 1] & -2033944611) == 0 && 0 == (var21[var22 + 2][var23] & 1076101603)) {
            var10[var25] = 1 + var13;
            var11[var25] = var14 - 1;
            var25 = 1 + var25 & var12;
            var9[var15 + 1][var16 - 1] = 9;
            var8[1 + var15][var16 - 1] = var24;
         }

         if (var15 > 0 && var16 < var7 - 2 && var9[var15 - 1][var16 + 1] == 0 && (var21[var22 - 1][1 + var23] & 1076101438) == 0 && (var21[var22 - 1][2 + var23] & 1076101432) == 0 && 0 == (var21[var22][2 + var23] & 1076101624)) {
            var10[var25] = var13 - 1;
            var11[var25] = var14 + 1;
            var25 = var25 + 1 & var12;
            var9[var15 - 1][1 + var16] = 6;
            var8[var15 - 1][1 + var16] = var24;
         }

         if (var15 < var6 - 2 && var16 < var7 - 2 && var9[1 + var15][1 + var16] == 0 && 0 == (var21[1 + var22][2 + var23] & -1488075272) && (var21[2 + var22][var23 + 2] & 1076101600) == 0 && 0 == (var21[2 + var22][1 + var23] & 1217395846)) {
            var10[var25] = 1 + var13;
            var11[var25] = 1 + var14;
            var25 = 1 + var25 & var12;
            var9[1 + var15][var16 + 1] = 12;
            var8[1 + var15][1 + var16] = var24;
         }
      }

      var5.aw(var13, var14, 1007413051);
      return false;
   }

   public void ae() {
      this.ap = new kj[1];
      kl var1 = kl.ak;
      this.ap[0] = new kj(17621929 * var1.am, 1809161601 * var1.at);
   }

   final boolean ax(int var1, int var2, ke var3, ko var4, kj var5) {
      int var6 = var5.ai((byte)56);
      int var7 = var5.ay((short)-32052);
      int[][] var8 = var5.ae(611892401);
      int[][] var9 = var5.as(1550198538);
      int[] var10 = var5.am(1231583691);
      int[] var11 = var5.at(-1733921911);
      int var12 = var5.au((byte)19);
      int var13 = var1;
      int var14 = var2;
      int var15 = var6 >> 1;
      int var16 = var7 >> 1;
      int var17 = var1 - var15;
      int var18 = var2 - var16;
      var9[var15][var16] = 1356315994;
      var8[var15][var16] = 0;
      byte var19 = 0;
      int var20 = 0;
      var10[var19] = var1;
      byte var10001 = var19;
      int var25 = var19 + 1;
      var11[var10001] = var2;
      int[][] var21 = var4.bn;

      while(var20 != var25) {
         var13 = var10[var20];
         var14 = var11[var20];
         var20 = 1 + var20 & var12;
         var15 = var13 - var17;
         var16 = var14 - var18;
         int var22 = var13 - -1790541103 * var4.bz;
         int var23 = var14 - -346318203 * var4.bc;
         if (var3.ap(2, var13, var14, var4, 1947951630)) {
            var5.aw(var13, var14, -1049533665);
            return true;
         }

         int var24 = var8[var15][var16] + 1;
         if (var15 > 0 && 0 == var9[var15 - 1][var16] && (var21[var22 - 1][var23] & 1724814213) == 0 && (var21[var22 - 1][var23 + 1] & 1076101432) == 0) {
            var10[var25] = var13 - 1;
            var11[var25] = var14;
            var25 = 1 + var25 & var12;
            var9[var15 - 1][var16] = 2;
            var8[var15 - 1][var16] = var24;
         }

         if (var15 < var6 - 2 && var9[var15 + 1][var16] == 0 && (var21[var22 + 2][var23] & -705957121) == 0 && 0 == (var21[2 + var22][1 + var23] & 1076101600)) {
            var10[var25] = 1 + var13;
            var11[var25] = var14;
            var25 = var25 + 1 & var12;
            var9[1 + var15][var16] = 8;
            var8[var15 + 1][var16] = var24;
         }

         if (var16 > 0 && var9[var15][var16 - 1] == 0 && 0 == (var21[var22][var23 - 1] & 1076101390) && 0 == (var21[var22 + 1][var23 - 1] & 1066268876)) {
            var10[var25] = var13;
            var11[var25] = var14 - 1;
            var25 = 1 + var25 & var12;
            var9[var15][var16 - 1] = 1;
            var8[var15][var16 - 1] = var24;
         }

         if (var16 < var7 - 2 && var9[var15][var16 + 1] == 0 && (var21[var22][var23 + 2] & 494765940) == 0 && (var21[var22 + 1][2 + var23] & -1206064216) == 0) {
            var10[var25] = var13;
            var11[var25] = 1 + var14;
            var25 = var25 + 1 & var12;
            var9[var15][var16 + 1] = 4;
            var8[var15][1 + var16] = var24;
         }

         if (var15 > 0 && var16 > 0 && 0 == var9[var15 - 1][var16 - 1] && (var21[var22 - 1][var23] & 1076101438) == 0 && (var21[var22 - 1][var23 - 1] & 207727209) == 0 && (var21[var22][var23 - 1] & 1076101519) == 0) {
            var10[var25] = var13 - 1;
            var11[var25] = var14 - 1;
            var25 = var25 + 1 & var12;
            var9[var15 - 1][var16 - 1] = 3;
            var8[var15 - 1][var16 - 1] = var24;
         }

         if (var15 < var6 - 2 && var16 > 0 && var9[var15 + 1][var16 - 1] == 0 && 0 == (var21[1 + var22][var23 - 1] & -2080592737) && (var21[2 + var22][var23 - 1] & 1076101507) == 0 && 0 == (var21[var22 + 2][var23] & 1076101603)) {
            var10[var25] = 1 + var13;
            var11[var25] = var14 - 1;
            var25 = 1 + var25 & var12;
            var9[var15 + 1][var16 - 1] = 9;
            var8[1 + var15][var16 - 1] = var24;
         }

         if (var15 > 0 && var16 < var7 - 2 && var9[var15 - 1][var16 + 1] == 0 && (var21[var22 - 1][1 + var23] & 1076101438) == 0 && (var21[var22 - 1][2 + var23] & -1866942149) == 0 && 0 == (var21[var22][2 + var23] & 1076101624)) {
            var10[var25] = var13 - 1;
            var11[var25] = var14 + 1;
            var25 = var25 + 1 & var12;
            var9[var15 - 1][1 + var16] = 6;
            var8[var15 - 1][1 + var16] = var24;
         }

         if (var15 < var6 - 2 && var16 < var7 - 2 && var9[1 + var15][1 + var16] == 0 && 0 == (var21[1 + var22][2 + var23] & 1076101624) && (var21[2 + var22][var23 + 2] & 1076101600) == 0 && 0 == (var21[2 + var22][1 + var23] & 1076101603)) {
            var10[var25] = 1 + var13;
            var11[var25] = 1 + var14;
            var25 = 1 + var25 & var12;
            var9[1 + var15][var16 + 1] = 12;
            var8[1 + var15][1 + var16] = var24;
         }
      }

      var5.aw(var13, var14, -1448615593);
      return false;
   }

   final boolean ad(int var1, int var2, ke var3, ko var4, kj var5) {
      int var6 = var5.ai((byte)33);
      int var7 = var5.ay((short)-28242);
      int[][] var8 = var5.ae(1839212160);
      int[][] var9 = var5.as(1993301669);
      int[] var10 = var5.am(944688374);
      int[] var11 = var5.at(322129392);
      int var12 = var5.au((byte)19);
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
      int[][] var21 = var4.bn;

      while(var20 != var25) {
         var13 = var10[var20];
         var14 = var11[var20];
         var20 = 1 + var20 & var12;
         var15 = var13 - var17;
         var16 = var14 - var18;
         int var22 = var13 - 321668887 * var4.bz;
         int var23 = var14 - -346318203 * var4.bc;
         if (var3.ap(1, var13, var14, var4, 1947951630)) {
            var5.aw(var13, var14, 1265357656);
            return true;
         }

         int var24 = var8[var15][var16] + 1;
         if (var15 > 0 && var9[var15 - 1][var16] == 0 && 0 == (var21[var22 - 1][var23] & -1100400385)) {
            var10[var25] = var13 - 1;
            var11[var25] = var14;
            var25 = 1 + var25 & var12;
            var9[var15 - 1][var16] = 2;
            var8[var15 - 1][var16] = var24;
         }

         if (var15 < var6 - 1 && 0 == var9[1 + var15][var16] && (var21[1 + var22][var23] & 1076101504) == 0) {
            var10[var25] = var13 + 1;
            var11[var25] = var14;
            var25 = 1 + var25 & var12;
            var9[var15 + 1][var16] = 8;
            var8[var15 + 1][var16] = var24;
         }

         if (var16 > 0 && 0 == var9[var15][var16 - 1] && 0 == (var21[var22][var23 - 1] & 151431481)) {
            var10[var25] = var13;
            var11[var25] = var14 - 1;
            var25 = var25 + 1 & var12;
            var9[var15][var16 - 1] = 1;
            var8[var15][var16 - 1] = var24;
         }

         if (var16 < var7 - 1 && 0 == var9[var15][1 + var16] && 0 == (var21[var22][var23 + 1] & 1076101408)) {
            var10[var25] = var13;
            var11[var25] = 1 + var14;
            var25 = 1 + var25 & var12;
            var9[var15][var16 + 1] = 4;
            var8[var15][1 + var16] = var24;
         }

         if (var15 > 0 && var16 > 0 && var9[var15 - 1][var16 - 1] == 0 && (var21[var22 - 1][var23 - 1] & 1076101390) == 0 && (var21[var22 - 1][var23] & 1076101384) == 0 && 0 == (var21[var22][var23 - 1] & 1076101378)) {
            var10[var25] = var13 - 1;
            var11[var25] = var14 - 1;
            var25 = var25 + 1 & var12;
            var9[var15 - 1][var16 - 1] = 3;
            var8[var15 - 1][var16 - 1] = var24;
         }

         if (var15 < var6 - 1 && var16 > 0 && var9[1 + var15][var16 - 1] == 0 && 0 == (var21[var22 + 1][var23 - 1] & 1076101507) && 0 == (var21[var22 + 1][var23] & 1076101504) && (var21[var22][var23 - 1] & -689478062) == 0) {
            var10[var25] = 1 + var13;
            var11[var25] = var14 - 1;
            var25 = 1 + var25 & var12;
            var9[var15 + 1][var16 - 1] = 9;
            var8[var15 + 1][var16 - 1] = var24;
         }

         if (var15 > 0 && var16 < var7 - 1 && 0 == var9[var15 - 1][var16 + 1] && (var21[var22 - 1][var23 + 1] & 1076101432) == 0 && (var21[var22 - 1][var23] & 1246686049) == 0 && 0 == (var21[var22][1 + var23] & 1076101408)) {
            var10[var25] = var13 - 1;
            var11[var25] = var14 + 1;
            var25 = var25 + 1 & var12;
            var9[var15 - 1][var16 + 1] = 6;
            var8[var15 - 1][var16 + 1] = var24;
         }

         if (var15 < var6 - 1 && var16 < var7 - 1 && 0 == var9[1 + var15][var16 + 1] && 0 == (var21[var22 + 1][var23 + 1] & 1076101600) && 0 == (var21[var22 + 1][var23] & -457985690) && (var21[var22][1 + var23] & 6478863) == 0) {
            var10[var25] = 1 + var13;
            var11[var25] = var14 + 1;
            var25 = var25 + 1 & var12;
            var9[1 + var15][var16 + 1] = 12;
            var8[1 + var15][var16 + 1] = var24;
         }
      }

      var5.aw(var13, var14, -676584384);
      return false;
   }

   final boolean aa(int var1, int var2, int var3, ke var4, ko var5, kj var6) {
      int var7 = var6.ai((byte)107);
      int var8 = var6.ay((short)-22909);
      int[][] var9 = var6.ae(1656906284);
      int[][] var10 = var6.as(1492328543);
      int[] var11 = var6.am(1753617284);
      int[] var12 = var6.at(1154960818);
      int var13 = var6.au((byte)19);
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
      int var27 = var20 + 1;
      var12[var20] = var2;
      int[][] var22 = var5.bn;

      while(true) {
         label332:
         while(true) {
            int var23;
            int var24;
            int var25;
            int var26;
            do {
               do {
                  do {
                     label309:
                     do {
                        if (var21 == var27) {
                           var6.aw(var14, var15, -1677933472);
                           return false;
                        }

                        var14 = var11[var21];
                        var15 = var12[var21];
                        var21 = var21 + 1 & var13;
                        var16 = var14 - var18;
                        var17 = var15 - var19;
                        var23 = var14 - 321668887 * var5.bz;
                        var24 = var15 - -346318203 * var5.bc;
                        if (var4.ap(var3, var14, var15, var5, 1947951630)) {
                           var6.aw(var14, var15, 1598062110);
                           return true;
                        }

                        var25 = var9[var16][var17] + 1;
                        if (var16 > 0 && var10[var16 - 1][var17] == 0 && (var22[var23 - 1][var24] & 1076101390) == 0 && (var22[var23 - 1][var24 + var3 - 1] & 1076101432) == 0) {
                           var26 = 1;

                           while(true) {
                              if (var26 >= var3 - 1) {
                                 var11[var27] = var14 - 1;
                                 var12[var27] = var15;
                                 var27 = 1 + var27 & var13;
                                 var10[var16 - 1][var17] = 2;
                                 var9[var16 - 1][var17] = var25;
                                 break;
                              }

                              if ((var22[var23 - 1][var24 + var26] & 1076101438) != 0) {
                                 break;
                              }

                              ++var26;
                           }
                        }

                        if (var16 < var7 - var3 && 0 == var10[var16 + 1][var17] && 0 == (var22[var23 + var3][var24] & 1076101507) && 0 == (var22[var23 + var3][var24 + var3 - 1] & 1076101600)) {
                           var26 = 1;

                           while(true) {
                              if (var26 >= var3 - 1) {
                                 var11[var27] = 1 + var14;
                                 var12[var27] = var15;
                                 var27 = var27 + 1 & var13;
                                 var10[var16 + 1][var17] = 8;
                                 var9[var16 + 1][var17] = var25;
                                 break;
                              }

                              if (0 != (var22[var23 + var3][var26 + var24] & 1076101603)) {
                                 break;
                              }

                              ++var26;
                           }
                        }

                        if (var17 > 0 && 0 == var10[var16][var17 - 1] && 0 == (var22[var23][var24 - 1] & 1076101390) && (var22[var3 + var23 - 1][var24 - 1] & 1076101507) == 0) {
                           var26 = 1;

                           while(true) {
                              if (var26 >= var3 - 1) {
                                 var11[var27] = var14;
                                 var12[var27] = var15 - 1;
                                 var27 = var27 + 1 & var13;
                                 var10[var16][var17 - 1] = 1;
                                 var9[var16][var17 - 1] = var25;
                                 break;
                              }

                              if ((var22[var26 + var23][var24 - 1] & 1076101519) != 0) {
                                 break;
                              }

                              ++var26;
                           }
                        }

                        if (var17 < var8 - var3 && 0 == var10[var16][var17 + 1] && (var22[var23][var24 + var3] & 1076101432) == 0 && (var22[var23 + var3 - 1][var24 + var3] & 1076101600) == 0) {
                           var26 = 1;

                           while(true) {
                              if (var26 >= var3 - 1) {
                                 var11[var27] = var14;
                                 var12[var27] = 1 + var15;
                                 var27 = 1 + var27 & var13;
                                 var10[var16][1 + var17] = 4;
                                 var9[var16][1 + var17] = var25;
                                 break;
                              }

                              if (0 != (var22[var23 + var26][var24 + var3] & 1076101624)) {
                                 break;
                              }

                              ++var26;
                           }
                        }

                        if (var16 > 0 && var17 > 0 && 0 == var10[var16 - 1][var17 - 1] && (var22[var23 - 1][var24 - 1] & 1076101390) == 0) {
                           var26 = 1;

                           while(true) {
                              if (var26 >= var3) {
                                 var11[var27] = var14 - 1;
                                 var12[var27] = var15 - 1;
                                 var27 = var27 + 1 & var13;
                                 var10[var16 - 1][var17 - 1] = 3;
                                 var9[var16 - 1][var17 - 1] = var25;
                                 break;
                              }

                              if ((var22[var23 - 1][var24 - 1 + var26] & 1076101438) != 0 || 0 != (var22[var26 + (var23 - 1)][var24 - 1] & 1076101519)) {
                                 break;
                              }

                              ++var26;
                           }
                        }

                        if (var16 < var7 - var3 && var17 > 0 && var10[var16 + 1][var17 - 1] == 0 && (var22[var3 + var23][var24 - 1] & 1076101507) == 0) {
                           var26 = 1;

                           while(true) {
                              if (var26 >= var3) {
                                 var11[var27] = 1 + var14;
                                 var12[var27] = var15 - 1;
                                 var27 = 1 + var27 & var13;
                                 var10[var16 + 1][var17 - 1] = 9;
                                 var9[var16 + 1][var17 - 1] = var25;
                                 break;
                              }

                              if (0 != (var22[var23 + var3][var24 - 1 + var26] & 1076101603) || (var22[var26 + var23][var24 - 1] & 1076101519) != 0) {
                                 break;
                              }

                              ++var26;
                           }
                        }

                        if (var16 > 0 && var17 < var8 - var3 && 0 == var10[var16 - 1][1 + var17] && 0 == (var22[var23 - 1][var24 + var3] & 1076101432)) {
                           for(var26 = 1; var26 < var3; ++var26) {
                              if (0 != (var22[var23 - 1][var26 + var24] & 1076101438) || 0 != (var22[var26 + (var23 - 1)][var24 + var3] & 1076101624)) {
                                 continue label309;
                              }
                           }

                           var11[var27] = var14 - 1;
                           var12[var27] = var15 + 1;
                           var27 = 1 + var27 & var13;
                           var10[var16 - 1][1 + var17] = 6;
                           var9[var16 - 1][1 + var17] = var25;
                        }
                     } while(var16 >= var7 - var3);
                  } while(var17 >= var8 - var3);
               } while(0 != var10[1 + var16][var17 + 1]);
            } while(0 != (var22[var23 + var3][var3 + var24] & 1076101600));

            for(var26 = 1; var26 < var3; ++var26) {
               if ((var22[var23 + var26][var24 + var3] & 1076101624) != 0 || (var22[var23 + var3][var26 + var24] & 1076101603) != 0) {
                  continue label332;
               }
            }

            var11[var27] = 1 + var14;
            var12[var27] = var15 + 1;
            var27 = 1 + var27 & var13;
            var10[1 + var16][var17 + 1] = 12;
            var9[1 + var16][1 + var17] = var25;
         }
      }
   }

   final boolean ac(int var1, int var2, ke var3, ko var4, kj var5) {
      int var6 = var5.ai((byte)121);
      int var7 = var5.ay((short)-7095);
      int[][] var8 = var5.ae(1087395176);
      int[][] var9 = var5.as(2100867601);
      int[] var10 = var5.am(175690696);
      int[] var11 = var5.at(1623217052);
      int var12 = var5.au((byte)19);
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
      int[][] var21 = var4.bn;

      while(var20 != var25) {
         var13 = var10[var20];
         var14 = var11[var20];
         var20 = 1 + var20 & var12;
         var15 = var13 - var17;
         var16 = var14 - var18;
         int var22 = var13 - 321668887 * var4.bz;
         int var23 = var14 - -346318203 * var4.bc;
         if (var3.ap(2, var13, var14, var4, 1947951630)) {
            var5.aw(var13, var14, -1558373834);
            return true;
         }

         int var24 = var8[var15][var16] + 1;
         if (var15 > 0 && 0 == var9[var15 - 1][var16] && (var21[var22 - 1][var23] & 1076101390) == 0 && (var21[var22 - 1][var23 + 1] & 1076101432) == 0) {
            var10[var25] = var13 - 1;
            var11[var25] = var14;
            var25 = 1 + var25 & var12;
            var9[var15 - 1][var16] = 2;
            var8[var15 - 1][var16] = var24;
         }

         if (var15 < var6 - 2 && var9[var15 + 1][var16] == 0 && (var21[var22 + 2][var23] & 1076101507) == 0 && 0 == (var21[2 + var22][1 + var23] & 1076101600)) {
            var10[var25] = 1 + var13;
            var11[var25] = var14;
            var25 = var25 + 1 & var12;
            var9[1 + var15][var16] = 8;
            var8[var15 + 1][var16] = var24;
         }

         if (var16 > 0 && var9[var15][var16 - 1] == 0 && 0 == (var21[var22][var23 - 1] & 1076101390) && 0 == (var21[var22 + 1][var23 - 1] & 1076101507)) {
            var10[var25] = var13;
            var11[var25] = var14 - 1;
            var25 = 1 + var25 & var12;
            var9[var15][var16 - 1] = 1;
            var8[var15][var16 - 1] = var24;
         }

         if (var16 < var7 - 2 && var9[var15][var16 + 1] == 0 && (var21[var22][var23 + 2] & 1076101432) == 0 && (var21[var22 + 1][2 + var23] & 1076101600) == 0) {
            var10[var25] = var13;
            var11[var25] = 1 + var14;
            var25 = var25 + 1 & var12;
            var9[var15][var16 + 1] = 4;
            var8[var15][1 + var16] = var24;
         }

         if (var15 > 0 && var16 > 0 && 0 == var9[var15 - 1][var16 - 1] && (var21[var22 - 1][var23] & 1076101438) == 0 && (var21[var22 - 1][var23 - 1] & 1076101390) == 0 && (var21[var22][var23 - 1] & 1076101519) == 0) {
            var10[var25] = var13 - 1;
            var11[var25] = var14 - 1;
            var25 = var25 + 1 & var12;
            var9[var15 - 1][var16 - 1] = 3;
            var8[var15 - 1][var16 - 1] = var24;
         }

         if (var15 < var6 - 2 && var16 > 0 && var9[var15 + 1][var16 - 1] == 0 && 0 == (var21[1 + var22][var23 - 1] & 1076101519) && (var21[2 + var22][var23 - 1] & 1076101507) == 0 && 0 == (var21[var22 + 2][var23] & 1076101603)) {
            var10[var25] = 1 + var13;
            var11[var25] = var14 - 1;
            var25 = 1 + var25 & var12;
            var9[var15 + 1][var16 - 1] = 9;
            var8[1 + var15][var16 - 1] = var24;
         }

         if (var15 > 0 && var16 < var7 - 2 && var9[var15 - 1][var16 + 1] == 0 && (var21[var22 - 1][1 + var23] & 1076101438) == 0 && (var21[var22 - 1][2 + var23] & 1076101432) == 0 && 0 == (var21[var22][2 + var23] & 1076101624)) {
            var10[var25] = var13 - 1;
            var11[var25] = var14 + 1;
            var25 = var25 + 1 & var12;
            var9[var15 - 1][1 + var16] = 6;
            var8[var15 - 1][1 + var16] = var24;
         }

         if (var15 < var6 - 2 && var16 < var7 - 2 && var9[1 + var15][1 + var16] == 0 && 0 == (var21[1 + var22][2 + var23] & 1076101624) && (var21[2 + var22][var23 + 2] & 1076101600) == 0 && 0 == (var21[2 + var22][1 + var23] & 1076101603)) {
            var10[var25] = 1 + var13;
            var11[var25] = 1 + var14;
            var25 = 1 + var25 & var12;
            var9[1 + var15][var16 + 1] = 12;
            var8[1 + var15][1 + var16] = var24;
         }
      }

      var5.aw(var13, var14, 682295225);
      return false;
   }
}
