public class km extends ji {
   static final void cs(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
      if (bk(var1[var3], var6)) {
         int var7 = var2[(var5 & 4032) + (var5 >>> 26)];
         var0[var3] = ((var7 & 16711935) * var4 & -16711936) + ((var7 & '\uff00') * var4 & 16711680) >> 8;
         var1[var3] = var6;
      }

   }

   void aq(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      int var13 = var5 - var4;
      int var14 = var2 - var1;
      int var15 = var6 - var4;
      int var16 = var3 - var1;
      int var17 = var11 - var10;
      int var18 = var12 - var10;
      float var19 = var8 - var7;
      float var20 = var9 - var7;
      int var21;
      if (var3 != var2) {
         var21 = (var6 - var5 << 14) / (var3 - var2);
      } else {
         var21 = 0;
      }

      int var22;
      if (var2 != var1) {
         var22 = (var13 << 14) / var14;
      } else {
         var22 = 0;
      }

      int var23;
      if (var3 != var1) {
         var23 = (var15 << 14) / var16;
      } else {
         var23 = 0;
      }

      int var24 = var13 * var16 - var15 * var14;
      if (var24 != 0) {
         int var25 = (var17 * var16 - var18 * var14 << 8) / var24;
         int var26 = (var18 * var13 - var17 * var15 << 8) / var24;
         float var27 = (var19 * (float)var16 - var20 * (float)var14) / (float)var24;
         float var28 = (var20 * (float)var13 - var19 * (float)var15) / (float)var24;
         int[] var29 = this.ar.ay;
         int var30 = this.ar.az;
         if (var1 <= var2 && var1 <= var3) {
            if (var1 < var30) {
               if (var2 > var30) {
                  var2 = var30;
               }

               if (var3 > var30) {
                  var3 = var30;
               }

               var10 = (var10 << 8) - var25 * var4 + var25;
               var7 = var7 - var27 * (float)var4 + var27;
               if (var2 < var3) {
                  var6 = var4 <<= 14;
                  if (var1 < 0) {
                     var6 -= var23 * var1;
                     var4 -= var22 * var1;
                     var10 -= var26 * var1;
                     var7 -= var28 * (float)var1;
                     var1 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var21 * var2;
                     var2 = 0;
                  }

                  if ((var1 == var2 || var23 >= var22) && (var1 != var2 || var23 <= var21)) {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var29[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bt(aw, var1, 0, 0, var5 >> 14, var6 >> 14, var10, var25, var7, var27);
                              var6 += var23;
                              var5 += var21;
                              var10 += var26;
                              var1 += an;
                              var7 += var28;
                           }
                        }

                        this.bt(aw, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var25, var7, var27);
                        var6 += var23;
                        var4 += var22;
                        var10 += var26;
                        var1 += an;
                        var7 += var28;
                     }
                  } else {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var29[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bt(aw, var1, 0, 0, var6 >> 14, var5 >> 14, var10, var25, var7, var27);
                              var6 += var23;
                              var5 += var21;
                              var10 += var26;
                              var1 += an;
                              var7 += var28;
                           }
                        }

                        this.bt(aw, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var25, var7, var27);
                        var6 += var23;
                        var4 += var22;
                        var10 += var26;
                        var1 += an;
                        var7 += var28;
                     }
                  }
               } else {
                  var5 = var4 <<= 14;
                  if (var1 < 0) {
                     var5 -= var23 * var1;
                     var4 -= var22 * var1;
                     var10 -= var26 * var1;
                     var7 -= var28 * (float)var1;
                     var1 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var21 * var3;
                     var3 = 0;
                  }

                  if (var1 != var3 && var23 < var22 || var1 == var3 && var21 > var22) {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var29[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bt(aw, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var25, var7, var27);
                              var6 += var21;
                              var4 += var22;
                              var10 += var26;
                              var1 += an;
                              var7 += var28;
                           }
                        }

                        this.bt(aw, var1, 0, 0, var5 >> 14, var4 >> 14, var10, var25, var7, var27);
                        var5 += var23;
                        var4 += var22;
                        var10 += var26;
                        var1 += an;
                        var7 += var28;
                     }
                  } else {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var29[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bt(aw, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var25, var7, var27);
                              var6 += var21;
                              var4 += var22;
                              var10 += var26;
                              var1 += an;
                              var7 += var28;
                           }
                        }

                        this.bt(aw, var1, 0, 0, var4 >> 14, var5 >> 14, var10, var25, var7, var27);
                        var5 += var23;
                        var4 += var22;
                        var10 += var26;
                        var1 += an;
                        var7 += var28;
                     }
                  }
               }
            }
         } else if (var2 <= var3) {
            if (var2 < var30) {
               if (var3 > var30) {
                  var3 = var30;
               }

               if (var1 > var30) {
                  var1 = var30;
               }

               var11 = (var11 << 8) - var25 * var5 + var25;
               var8 = var8 - var27 * (float)var5 + var27;
               if (var3 < var1) {
                  var4 = var5 <<= 14;
                  if (var2 < 0) {
                     var4 -= var22 * var2;
                     var5 -= var21 * var2;
                     var11 -= var26 * var2;
                     var8 -= var28 * (float)var2;
                     var2 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var23 * var3;
                     var3 = 0;
                  }

                  if ((var2 == var3 || var22 >= var21) && (var2 != var3 || var22 <= var23)) {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var29[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bt(aw, var2, 0, 0, var6 >> 14, var4 >> 14, var11, var25, var8, var27);
                              var4 += var22;
                              var6 += var23;
                              var11 += var26;
                              var2 += an;
                              var8 += var28;
                           }
                        }

                        this.bt(aw, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var25, var8, var27);
                        var4 += var22;
                        var5 += var21;
                        var11 += var26;
                        var2 += an;
                        var8 += var28;
                     }
                  } else {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var29[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bt(aw, var2, 0, 0, var4 >> 14, var6 >> 14, var11, var25, var8, var27);
                              var4 += var22;
                              var6 += var23;
                              var11 += var26;
                              var2 += an;
                              var8 += var28;
                           }
                        }

                        this.bt(aw, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var25, var8, var27);
                        var4 += var22;
                        var5 += var21;
                        var11 += var26;
                        var2 += an;
                        var8 += var28;
                     }
                  }
               } else {
                  var6 = var5 <<= 14;
                  if (var2 < 0) {
                     var6 -= var22 * var2;
                     var5 -= var21 * var2;
                     var11 -= var26 * var2;
                     var8 -= var28 * (float)var2;
                     var2 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var23 * var1;
                     var1 = 0;
                  }

                  if (var22 < var21) {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var29[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bt(aw, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var25, var8, var27);
                              var4 += var23;
                              var5 += var21;
                              var11 += var26;
                              var2 += an;
                              var8 += var28;
                           }
                        }

                        this.bt(aw, var2, 0, 0, var6 >> 14, var5 >> 14, var11, var25, var8, var27);
                        var6 += var22;
                        var5 += var21;
                        var11 += var26;
                        var2 += an;
                        var8 += var28;
                     }
                  } else {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var29[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bt(aw, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var25, var8, var27);
                              var4 += var23;
                              var5 += var21;
                              var11 += var26;
                              var2 += an;
                              var8 += var28;
                           }
                        }

                        this.bt(aw, var2, 0, 0, var5 >> 14, var6 >> 14, var11, var25, var8, var27);
                        var6 += var22;
                        var5 += var21;
                        var11 += var26;
                        var2 += an;
                        var8 += var28;
                     }
                  }
               }
            }
         } else if (var3 < var30) {
            if (var1 > var30) {
               var1 = var30;
            }

            if (var2 > var30) {
               var2 = var30;
            }

            var12 = (var12 << 8) - var25 * var6 + var25;
            var9 = var9 - var27 * (float)var6 + var27;
            if (var1 < var2) {
               var5 = var6 <<= 14;
               if (var3 < 0) {
                  var5 -= var21 * var3;
                  var6 -= var23 * var3;
                  var12 -= var26 * var3;
                  var9 -= var28 * (float)var3;
                  var3 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var22 * var1;
                  var1 = 0;
               }

               if (var21 < var23) {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var29[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bt(aw, var3, 0, 0, var5 >> 14, var4 >> 14, var12, var25, var9, var27);
                           var5 += var21;
                           var4 += var22;
                           var12 += var26;
                           var3 += an;
                           var9 += var28;
                        }
                     }

                     this.bt(aw, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var25, var9, var27);
                     var5 += var21;
                     var6 += var23;
                     var12 += var26;
                     var3 += an;
                     var9 += var28;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var29[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bt(aw, var3, 0, 0, var4 >> 14, var5 >> 14, var12, var25, var9, var27);
                           var5 += var21;
                           var4 += var22;
                           var12 += var26;
                           var3 += an;
                           var9 += var28;
                        }
                     }

                     this.bt(aw, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var25, var9, var27);
                     var5 += var21;
                     var6 += var23;
                     var12 += var26;
                     var3 += an;
                     var9 += var28;
                  }
               }
            } else {
               var4 = var6 <<= 14;
               if (var3 < 0) {
                  var4 -= var21 * var3;
                  var6 -= var23 * var3;
                  var12 -= var26 * var3;
                  var9 -= var28 * (float)var3;
                  var3 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var22 * var2;
                  var2 = 0;
               }

               if (var21 < var23) {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var29[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bt(aw, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var25, var9, var27);
                           var5 += var22;
                           var6 += var23;
                           var12 += var26;
                           var3 += an;
                           var9 += var28;
                        }
                     }

                     this.bt(aw, var3, 0, 0, var4 >> 14, var6 >> 14, var12, var25, var9, var27);
                     var4 += var21;
                     var6 += var23;
                     var12 += var26;
                     var3 += an;
                     var9 += var28;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var29[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bt(aw, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var25, var9, var27);
                           var5 += var22;
                           var6 += var23;
                           var12 += var26;
                           var3 += an;
                           var9 += var28;
                        }
                     }

                     this.bt(aw, var3, 0, 0, var6 >> 14, var4 >> 14, var12, var25, var9, var27);
                     var4 += var21;
                     var6 += var23;
                     var12 += var26;
                     var3 += an;
                     var9 += var28;
                  }
               }
            }
         }
      }
   }

   final void bu(int[] var1, float[] var2, int var3, int var4, float var5) {
      int var6 = bk(var2[var3], var5) ? 1 : 0;
      int var7 = 1 - var6;
      var1[var3] = var6 * var4 + var7 * var1[var3];
      var2[var3] = (float)var6 * var5 + (float)var7 * var2[var3];
   }

   final void cz(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
      if (this.ar.ac) {
         if (var6 > this.ar.ab) {
            var6 = this.ar.ab;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var4 = var6 - var5 >> 2;
         var7 += var8 * (float)var5;
         if (this.ar.ag != 0) {
            if (this.ar.ag == 254) {
               while(true) {
                  --var4;
                  if (var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if (var4 < 0) {
                           return;
                        }

                        var1[var2++] = var1[var2];
                     }
                  }

                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
               }
            } else {
               int var9 = this.ar.ag;
               int var10 = 256 - this.ar.ag;
               var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & 1799971009) * var10 >> 8 & '\uff00');

               while(true) {
                  --var4;
                  if (var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if (var4 < 0) {
                           return;
                        }

                        this.bo(var1, bn, var2, var3, var9, var7);
                        ++var2;
                        var7 += var8;
                     }
                  }

                  this.bo(var1, bn, var2, var3, var9, var7);
                  ++var2;
                  var7 += var8;
                  this.bo(var1, bn, var2, var3, var9, var7);
                  ++var2;
                  var7 += var8;
                  this.bo(var1, bn, var2, var3, var9, var7);
                  ++var2;
                  var7 += var8;
                  this.bo(var1, bn, var2, var3, var9, var7);
                  ++var2;
                  var7 += var8;
               }
            }
         } else {
            while(true) {
               --var4;
               if (var4 < 0) {
                  var4 = var6 - var5 & 3;

                  while(true) {
                     --var4;
                     if (var4 < 0) {
                        return;
                     }

                     this.bu(var1, bn, var2, var3, var7);
                     var7 += var8;
                     ++var2;
                  }
               }

               this.bu(var1, bn, var2, var3, var7);
               var7 += var8;
               ++var2;
               this.bu(var1, bn, var2, var3, var7);
               var7 += var8;
               ++var2;
               this.bu(var1, bn, var2, var3, var7);
               var7 += var8;
               ++var2;
               this.bu(var1, bn, var2, var3, var7);
               var7 += var8;
               ++var2;
            }
         }
      }
   }

   final void bo(int[] var1, float[] var2, int var3, int var4, int var5, float var6) {
      if (bk(var2[var3], var6)) {
         int var7 = var1[var3];
         var1[var3] = var4 + ((var7 & 16711935) * var5 >> 8 & 16711935) + ((var7 & '\uff00') * var5 >> 8 & '\uff00');
      }

   }

   final void bv(int[] var1, float[] var2, int var3, int var4, int var5, int var6, float var7) {
      if (bk(var2[var3], var7)) {
         int var8 = (var4 & (var4 >> 31 & 1) - 1) >> 8;
         int var9 = this.au[var8];
         var9 = ((var9 & 16711935) * var6 >> 8 & 16711935) + ((var9 & '\uff00') * var6 >> 8 & '\uff00');
         int var10 = var1[var3];
         var1[var3] = var9 + ((var10 & 16711935) * var5 >> 8 & 16711935) + ((var10 & '\uff00') * var5 >> 8 & '\uff00');
      }

   }

   final void bt(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, float var9, float var10) {
      if (this.ar.ac) {
         if (var6 > this.ar.ab) {
            var6 = this.ar.ab;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var7 += var8 * var5;
         var9 += var10 * (float)var5;
         int var11;
         int var12;
         if (this.ar.ae) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.ar.ag == 0) {
               if (var4 > 0) {
                  do {
                     var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.au[var11];
                     var7 += var8;
                     this.bu(var1, bn, var2, var3, var9);
                     var9 += var10;
                     ++var2;
                     this.bu(var1, bn, var2, var3, var9);
                     var9 += var10;
                     ++var2;
                     this.bu(var1, bn, var2, var3, var9);
                     var9 += var10;
                     ++var2;
                     this.bu(var1, bn, var2, var3, var9);
                     var9 += var10;
                     ++var2;
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.au[var11];

                  do {
                     this.bu(var1, bn, var2, var3, var9);
                     var9 += var10;
                     ++var2;
                     --var4;
                  } while(var4 > 0);
               }
            } else {
               var11 = this.ar.ag;
               var12 = 256 - this.ar.ag;
               int var13;
               if (var4 > 0) {
                  do {
                     var13 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.au[var13];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');
                     this.bo(var1, bn, var2, var3, var11, var9);
                     ++var2;
                     var9 += var10;
                     this.bo(var1, bn, var2, var3, var11, var9);
                     ++var2;
                     var9 += var10;
                     this.bo(var1, bn, var2, var3, var11, var9);
                     ++var2;
                     var9 += var10;
                     this.bo(var1, bn, var2, var3, var11, var9);
                     ++var2;
                     var9 += var10;
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var13 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.au[var13];
                  var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');

                  do {
                     this.bo(var1, bn, var2, var3, var11, var9);
                     ++var2;
                     var9 += var10;
                     --var4;
                  } while(var4 > 0);
               }
            }

         } else {
            var4 = var6 - var5;
            if (this.ar.ag == 0) {
               do {
                  this.br(var1, bn, var2, var7, var9);
                  var9 += var10;
                  ++var2;
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            } else {
               var11 = this.ar.ag;
               var12 = 256 - this.ar.ag;

               do {
                  this.bv(var1, bn, var2, var3, var11, var12, var9);
                  var9 += var10;
                  ++var2;
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            }

         }
      }
   }

   void af(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10) {
      int var11 = var5 - var4;
      int var12 = var2 - var1;
      int var13 = var6 - var4;
      int var14 = var3 - var1;
      float var15 = var8 - var7;
      float var16 = var9 - var7;
      int var17;
      if (var3 != var2) {
         var17 = (var6 - var5 << 14) / (var3 - var2);
      } else {
         var17 = 0;
      }

      int var18;
      if (var2 != var1) {
         var18 = (var11 << 14) / var12;
      } else {
         var18 = 0;
      }

      int var19;
      if (var3 != var1) {
         var19 = (var13 << 14) / var14;
      } else {
         var19 = 0;
      }

      int var20 = var11 * var14 - var13 * var12;
      if (var20 != 0) {
         float var21 = (var15 * (float)var14 - var16 * (float)var12) / (float)var20;
         float var22 = (var16 * (float)var11 - var15 * (float)var13) / (float)var20;
         int[] var23 = this.ar.ay;
         int var24 = this.ar.az;
         if (var1 <= var2 && var1 <= var3) {
            if (var1 < var24) {
               if (var2 > var24) {
                  var2 = var24;
               }

               if (var3 > var24) {
                  var3 = var24;
               }

               var7 = var7 - var21 * (float)var4 + var21;
               if (var2 < var3) {
                  var6 = var4 <<= 14;
                  if (var1 < 0) {
                     var6 -= var19 * var1;
                     var4 -= var18 * var1;
                     var7 -= var22 * (float)var1;
                     var1 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var17 * var2;
                     var2 = 0;
                  }

                  if (var1 != var2 && var19 < var18 || var1 == var2 && var19 > var17) {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var23[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bq(aw, var1, var10, 0, var6 >> 14, var5 >> 14, var7, var21);
                              var6 += var19;
                              var5 += var17;
                              var1 += an;
                              var7 += var22;
                           }
                        }

                        this.bq(aw, var1, var10, 0, var6 >> 14, var4 >> 14, var7, var21);
                        var6 += var19;
                        var4 += var18;
                        var1 += an;
                        var7 += var22;
                     }
                  } else {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var23[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bq(aw, var1, var10, 0, var5 >> 14, var6 >> 14, var7, var21);
                              var6 += var19;
                              var5 += var17;
                              var1 += an;
                              var7 += var22;
                           }
                        }

                        this.bq(aw, var1, var10, 0, var4 >> 14, var6 >> 14, var7, var21);
                        var6 += var19;
                        var4 += var18;
                        var1 += an;
                        var7 += var22;
                     }
                  }
               } else {
                  var5 = var4 <<= 14;
                  if (var1 < 0) {
                     var5 -= var19 * var1;
                     var4 -= var18 * var1;
                     var7 -= var22 * (float)var1;
                     var1 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var17 * var3;
                     var3 = 0;
                  }

                  if (var1 != var3 && var19 < var18 || var1 == var3 && var17 > var18) {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var23[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bq(aw, var1, var10, 0, var6 >> 14, var4 >> 14, var7, var21);
                              var6 += var17;
                              var4 += var18;
                              var1 += an;
                              var7 += var22;
                           }
                        }

                        this.bq(aw, var1, var10, 0, var5 >> 14, var4 >> 14, var7, var21);
                        var5 += var19;
                        var4 += var18;
                        var1 += an;
                        var7 += var22;
                     }
                  } else {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var23[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bq(aw, var1, var10, 0, var4 >> 14, var6 >> 14, var7, var21);
                              var6 += var17;
                              var4 += var18;
                              var1 += an;
                              var7 += var22;
                           }
                        }

                        this.bq(aw, var1, var10, 0, var4 >> 14, var5 >> 14, var7, var21);
                        var5 += var19;
                        var4 += var18;
                        var1 += an;
                        var7 += var22;
                     }
                  }
               }
            }
         } else if (var2 <= var3) {
            if (var2 < var24) {
               if (var3 > var24) {
                  var3 = var24;
               }

               if (var1 > var24) {
                  var1 = var24;
               }

               var8 = var8 - var21 * (float)var5 + var21;
               if (var3 < var1) {
                  var4 = var5 <<= 14;
                  if (var2 < 0) {
                     var4 -= var18 * var2;
                     var5 -= var17 * var2;
                     var8 -= var22 * (float)var2;
                     var2 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var19 * var3;
                     var3 = 0;
                  }

                  if ((var2 == var3 || var18 >= var17) && (var2 != var3 || var18 <= var19)) {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var23[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bq(aw, var2, var10, 0, var6 >> 14, var4 >> 14, var8, var21);
                              var4 += var18;
                              var6 += var19;
                              var2 += an;
                              var8 += var22;
                           }
                        }

                        this.bq(aw, var2, var10, 0, var5 >> 14, var4 >> 14, var8, var21);
                        var4 += var18;
                        var5 += var17;
                        var2 += an;
                        var8 += var22;
                     }
                  } else {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var23[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bq(aw, var2, var10, 0, var4 >> 14, var6 >> 14, var8, var21);
                              var4 += var18;
                              var6 += var19;
                              var2 += an;
                              var8 += var22;
                           }
                        }

                        this.bq(aw, var2, var10, 0, var4 >> 14, var5 >> 14, var8, var21);
                        var4 += var18;
                        var5 += var17;
                        var2 += an;
                        var8 += var22;
                     }
                  }
               } else {
                  var6 = var5 <<= 14;
                  if (var2 < 0) {
                     var6 -= var18 * var2;
                     var5 -= var17 * var2;
                     var8 -= var22 * (float)var2;
                     var2 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var19 * var1;
                     var1 = 0;
                  }

                  if (var18 < var17) {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var23[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bq(aw, var2, var10, 0, var4 >> 14, var5 >> 14, var8, var21);
                              var4 += var19;
                              var5 += var17;
                              var2 += an;
                              var8 += var22;
                           }
                        }

                        this.bq(aw, var2, var10, 0, var6 >> 14, var5 >> 14, var8, var21);
                        var6 += var18;
                        var5 += var17;
                        var2 += an;
                        var8 += var22;
                     }
                  } else {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var23[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bq(aw, var2, var10, 0, var5 >> 14, var4 >> 14, var8, var21);
                              var4 += var19;
                              var5 += var17;
                              var2 += an;
                              var8 += var22;
                           }
                        }

                        this.bq(aw, var2, var10, 0, var5 >> 14, var6 >> 14, var8, var21);
                        var6 += var18;
                        var5 += var17;
                        var2 += an;
                        var8 += var22;
                     }
                  }
               }
            }
         } else if (var3 < var24) {
            if (var1 > var24) {
               var1 = var24;
            }

            if (var2 > var24) {
               var2 = var24;
            }

            var9 = var9 - var21 * (float)var6 + var21;
            if (var1 < var2) {
               var5 = var6 <<= 14;
               if (var3 < 0) {
                  var5 -= var17 * var3;
                  var6 -= var19 * var3;
                  var9 -= var22 * (float)var3;
                  var3 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var18 * var1;
                  var1 = 0;
               }

               if (var17 < var19) {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var23[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bq(aw, var3, var10, 0, var5 >> 14, var4 >> 14, var9, var21);
                           var5 += var17;
                           var4 += var18;
                           var3 += an;
                           var9 += var22;
                        }
                     }

                     this.bq(aw, var3, var10, 0, var5 >> 14, var6 >> 14, var9, var21);
                     var5 += var17;
                     var6 += var19;
                     var3 += an;
                     var9 += var22;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var23[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bq(aw, var3, var10, 0, var4 >> 14, var5 >> 14, var9, var21);
                           var5 += var17;
                           var4 += var18;
                           var3 += an;
                           var9 += var22;
                        }
                     }

                     this.bq(aw, var3, var10, 0, var6 >> 14, var5 >> 14, var9, var21);
                     var5 += var17;
                     var6 += var19;
                     var3 += an;
                     var9 += var22;
                  }
               }
            } else {
               var4 = var6 <<= 14;
               if (var3 < 0) {
                  var4 -= var17 * var3;
                  var6 -= var19 * var3;
                  var9 -= var22 * (float)var3;
                  var3 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var18 * var2;
                  var2 = 0;
               }

               if (var17 < var19) {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var23[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bq(aw, var3, var10, 0, var5 >> 14, var6 >> 14, var9, var21);
                           var5 += var18;
                           var6 += var19;
                           var3 += an;
                           var9 += var22;
                        }
                     }

                     this.bq(aw, var3, var10, 0, var4 >> 14, var6 >> 14, var9, var21);
                     var4 += var17;
                     var6 += var19;
                     var3 += an;
                     var9 += var22;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var23[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bq(aw, var3, var10, 0, var6 >> 14, var5 >> 14, var9, var21);
                           var5 += var18;
                           var6 += var19;
                           var3 += an;
                           var9 += var22;
                        }
                     }

                     this.bq(aw, var3, var10, 0, var6 >> 14, var4 >> 14, var9, var21);
                     var4 += var17;
                     var6 += var19;
                     var3 += an;
                     var9 += var22;
                  }
               }
            }
         }
      }
   }

   final void bq(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
      if (this.ar.ac) {
         if (var6 > this.ar.ab) {
            var6 = this.ar.ab;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var4 = var6 - var5 >> 2;
         var7 += var8 * (float)var5;
         if (this.ar.ag != 0) {
            if (this.ar.ag == 254) {
               while(true) {
                  --var4;
                  if (var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if (var4 < 0) {
                           return;
                        }

                        var1[var2++] = var1[var2];
                     }
                  }

                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
               }
            } else {
               int var9 = this.ar.ag;
               int var10 = 256 - this.ar.ag;
               var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');

               while(true) {
                  --var4;
                  if (var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if (var4 < 0) {
                           return;
                        }

                        this.bo(var1, bn, var2, var3, var9, var7);
                        ++var2;
                        var7 += var8;
                     }
                  }

                  this.bo(var1, bn, var2, var3, var9, var7);
                  ++var2;
                  var7 += var8;
                  this.bo(var1, bn, var2, var3, var9, var7);
                  ++var2;
                  var7 += var8;
                  this.bo(var1, bn, var2, var3, var9, var7);
                  ++var2;
                  var7 += var8;
                  this.bo(var1, bn, var2, var3, var9, var7);
                  ++var2;
                  var7 += var8;
               }
            }
         } else {
            while(true) {
               --var4;
               if (var4 < 0) {
                  var4 = var6 - var5 & 3;

                  while(true) {
                     --var4;
                     if (var4 < 0) {
                        return;
                     }

                     this.bu(var1, bn, var2, var3, var7);
                     var7 += var8;
                     ++var2;
                  }
               }

               this.bu(var1, bn, var2, var3, var7);
               var7 += var8;
               ++var2;
               this.bu(var1, bn, var2, var3, var7);
               var7 += var8;
               ++var2;
               this.bu(var1, bn, var2, var3, var7);
               var7 += var8;
               ++var2;
               this.bu(var1, bn, var2, var3, var7);
               var7 += var8;
               ++var2;
            }
         }
      }
   }

   void at(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.ar.af.ag(var22, 1914744686);
      int var24;
      if (var23 == null) {
         var24 = this.ar.af.am(var22, -2042202017);
         this.aq(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var24, var10), ag(var24, var11), ag(var24, var12));
      } else {
         this.ae = this.ar.af.aq(var22, 1213207034);
         this.ac = this.ar.af.ax(var22, (byte)84);
         var24 = var5 - var4;
         int var25 = var2 - var1;
         int var26 = var6 - var4;
         int var27 = var3 - var1;
         int var28 = var11 - var10;
         int var29 = var12 - var10;
         int var30 = 0;
         if (var2 != var1) {
            var30 = (var5 - var4 << 14) / (var2 - var1);
         }

         int var31 = 0;
         if (var3 != var2) {
            var31 = (var6 - var5 << 14) / (var3 - var2);
         }

         int var32 = 0;
         if (var3 != var1) {
            var32 = (var4 - var6 << 14) / (var1 - var3);
         }

         int var33 = var24 * var27 - var26 * var25;
         if (var33 != 0) {
            int var34 = (var28 * var27 - var29 * var25 << 9) / var33;
            int var35 = (var29 * var24 - var28 * var26 << 9) / var33;
            float var36 = var8 - var7;
            float var37 = var9 - var7;
            float var38 = (var36 * (float)var27 - var37 * (float)var25) / (float)var33;
            float var39 = (var37 * (float)var24 - var36 * (float)var26) / (float)var33;
            int var40 = this.ar.aq;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var41 = var15 * var16 - var18 * var13 << 14;
            int var42 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / (long)var40);
            int var43 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var40);
            int var44 = var14 * var16 - var17 * var13 << 14;
            int var45 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / (long)var40);
            int var46 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var40);
            int var47 = var17 * var15 - var14 * var18 << 14;
            int var48 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / (long)var40);
            int var49 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var40);
            int[] var50 = this.ar.ay;
            int var51 = this.ar.az;
            int var52;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < var51) {
                  if (var2 > var51) {
                     var2 = var51;
                  }

                  if (var3 > var51) {
                     var3 = var51;
                  }

                  var10 = (var10 << 9) - var34 * var4 + var34;
                  var7 = var7 - var38 * (float)var4 + var38;
                  if (var2 < var3) {
                     var6 = var4 <<= 14;
                     if (var1 < 0) {
                        var6 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var7 -= var39 * (float)var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var31 * var2;
                        var2 = 0;
                     }

                     var52 = var1 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var1 != var2 && var32 < var30 || var1 == var2 && var32 > var31) {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var7 -= var39 * (float)var1;
                        var1 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var31 * var3;
                        var3 = 0;
                     }

                     var52 = var1 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if ((var1 == var3 || var32 >= var30) && (var1 != var3 || var31 <= var30)) {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < var51) {
                  if (var3 > var51) {
                     var3 = var51;
                  }

                  if (var1 > var51) {
                     var1 = var51;
                  }

                  var11 = (var11 << 9) - var34 * var5 + var34;
                  var8 = var8 - var38 * (float)var5 + var38;
                  if (var3 < var1) {
                     var4 = var5 <<= 14;
                     if (var2 < 0) {
                        var4 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var8 -= var39 * (float)var2;
                        var2 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var32 * var3;
                        var3 = 0;
                     }

                     var52 = var2 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var2 != var3 && var30 < var31 || var2 == var3 && var30 > var32) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     }
                  } else {
                     var6 = var5 <<= 14;
                     if (var2 < 0) {
                        var6 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var8 -= var39 * (float)var2;
                        var2 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var32 * var1;
                        var1 = 0;
                     }

                     var52 = var2 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var30 < var31) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     }
                  }
               }
            } else if (var3 < var51) {
               if (var1 > var51) {
                  var1 = var51;
               }

               if (var2 > var51) {
                  var2 = var51;
               }

               var12 = (var12 << 9) - var34 * var6 + var34;
               var9 = var9 - var38 * (float)var6 + var38;
               if (var1 < var2) {
                  var5 = var6 <<= 14;
                  if (var3 < 0) {
                     var5 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var9 -= var39 * (float)var3;
                     var3 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var30 * var1;
                     var1 = 0;
                  }

                  var52 = var3 - this.ar.ap;
                  var41 += var43 * var52;
                  var44 += var46 * var52;
                  var47 += var49 * var52;
                  if (var31 < var32) {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.cf(aw, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cf(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.cf(aw, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cf(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  }
               } else {
                  var4 = var6 <<= 14;
                  if (var3 < 0) {
                     var4 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var9 -= var39 * (float)var3;
                     var3 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var30 * var2;
                     var2 = 0;
                  }

                  var52 = var3 - this.ar.ap;
                  var41 += var43 * var52;
                  var44 += var46 * var52;
                  var47 += var49 * var52;
                  if (var31 < var32) {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.cf(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cf(aw, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.cf(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cf(aw, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  }
               }
            }
         }
      }
   }

   void ak(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      int var13 = var5 - var4;
      int var14 = var2 - var1;
      int var15 = var6 - var4;
      int var16 = var3 - var1;
      int var17 = var11 - var10;
      int var18 = var12 - var10;
      float var19 = var8 - var7;
      float var20 = var9 - var7;
      int var21;
      if (var3 != var2) {
         var21 = (var6 - var5 << 14) / (var3 - var2);
      } else {
         var21 = 0;
      }

      int var22;
      if (var2 != var1) {
         var22 = (var13 << 14) / var14;
      } else {
         var22 = 0;
      }

      int var23;
      if (var3 != var1) {
         var23 = (var15 << 14) / var16;
      } else {
         var23 = 0;
      }

      int var24 = var13 * var16 - var15 * var14;
      if (var24 != 0) {
         int var25 = (var17 * var16 - var18 * var14 << 8) / var24;
         int var26 = (var18 * var13 - var17 * var15 << 8) / var24;
         float var27 = (var19 * (float)var16 - var20 * (float)var14) / (float)var24;
         float var28 = (var20 * (float)var13 - var19 * (float)var15) / (float)var24;
         int[] var29 = this.ar.ay;
         int var30 = this.ar.az;
         if (var1 <= var2 && var1 <= var3) {
            if (var1 < var30) {
               if (var2 > var30) {
                  var2 = var30;
               }

               if (var3 > var30) {
                  var3 = var30;
               }

               var10 = (var10 << 8) - var25 * var4 + var25;
               var7 = var7 - var27 * (float)var4 + var27;
               if (var2 < var3) {
                  var6 = var4 <<= 14;
                  if (var1 < 0) {
                     var6 -= var23 * var1;
                     var4 -= var22 * var1;
                     var10 -= var26 * var1;
                     var7 -= var28 * (float)var1;
                     var1 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var21 * var2;
                     var2 = 0;
                  }

                  if (var1 != var2 && var23 < var22 || var1 == var2 && var23 > var21) {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var29[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bt(aw, var1, 0, 0, var6 >> 14, var5 >> 14, var10, var25, var7, var27);
                              var6 += var23;
                              var5 += var21;
                              var10 += var26;
                              var1 += an;
                              var7 += var28;
                           }
                        }

                        this.bt(aw, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var25, var7, var27);
                        var6 += var23;
                        var4 += var22;
                        var10 += var26;
                        var1 += an;
                        var7 += var28;
                     }
                  } else {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var29[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bt(aw, var1, 0, 0, var5 >> 14, var6 >> 14, var10, var25, var7, var27);
                              var6 += var23;
                              var5 += var21;
                              var10 += var26;
                              var1 += an;
                              var7 += var28;
                           }
                        }

                        this.bt(aw, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var25, var7, var27);
                        var6 += var23;
                        var4 += var22;
                        var10 += var26;
                        var1 += an;
                        var7 += var28;
                     }
                  }
               } else {
                  var5 = var4 <<= 14;
                  if (var1 < 0) {
                     var5 -= var23 * var1;
                     var4 -= var22 * var1;
                     var10 -= var26 * var1;
                     var7 -= var28 * (float)var1;
                     var1 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var21 * var3;
                     var3 = 0;
                  }

                  if (var1 != var3 && var23 < var22 || var1 == var3 && var21 > var22) {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var29[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bt(aw, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var25, var7, var27);
                              var6 += var21;
                              var4 += var22;
                              var10 += var26;
                              var1 += an;
                              var7 += var28;
                           }
                        }

                        this.bt(aw, var1, 0, 0, var5 >> 14, var4 >> 14, var10, var25, var7, var27);
                        var5 += var23;
                        var4 += var22;
                        var10 += var26;
                        var1 += an;
                        var7 += var28;
                     }
                  } else {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var29[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bt(aw, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var25, var7, var27);
                              var6 += var21;
                              var4 += var22;
                              var10 += var26;
                              var1 += an;
                              var7 += var28;
                           }
                        }

                        this.bt(aw, var1, 0, 0, var4 >> 14, var5 >> 14, var10, var25, var7, var27);
                        var5 += var23;
                        var4 += var22;
                        var10 += var26;
                        var1 += an;
                        var7 += var28;
                     }
                  }
               }
            }
         } else if (var2 <= var3) {
            if (var2 < var30) {
               if (var3 > var30) {
                  var3 = var30;
               }

               if (var1 > var30) {
                  var1 = var30;
               }

               var11 = (var11 << 8) - var25 * var5 + var25;
               var8 = var8 - var27 * (float)var5 + var27;
               if (var3 < var1) {
                  var4 = var5 <<= 14;
                  if (var2 < 0) {
                     var4 -= var22 * var2;
                     var5 -= var21 * var2;
                     var11 -= var26 * var2;
                     var8 -= var28 * (float)var2;
                     var2 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var23 * var3;
                     var3 = 0;
                  }

                  if (var2 != var3 && var22 < var21 || var2 == var3 && var22 > var23) {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var29[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bt(aw, var2, 0, 0, var4 >> 14, var6 >> 14, var11, var25, var8, var27);
                              var4 += var22;
                              var6 += var23;
                              var11 += var26;
                              var2 += an;
                              var8 += var28;
                           }
                        }

                        this.bt(aw, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var25, var8, var27);
                        var4 += var22;
                        var5 += var21;
                        var11 += var26;
                        var2 += an;
                        var8 += var28;
                     }
                  } else {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var29[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bt(aw, var2, 0, 0, var6 >> 14, var4 >> 14, var11, var25, var8, var27);
                              var4 += var22;
                              var6 += var23;
                              var11 += var26;
                              var2 += an;
                              var8 += var28;
                           }
                        }

                        this.bt(aw, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var25, var8, var27);
                        var4 += var22;
                        var5 += var21;
                        var11 += var26;
                        var2 += an;
                        var8 += var28;
                     }
                  }
               } else {
                  var6 = var5 <<= 14;
                  if (var2 < 0) {
                     var6 -= var22 * var2;
                     var5 -= var21 * var2;
                     var11 -= var26 * var2;
                     var8 -= var28 * (float)var2;
                     var2 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var23 * var1;
                     var1 = 0;
                  }

                  if (var22 < var21) {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var29[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bt(aw, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var25, var8, var27);
                              var4 += var23;
                              var5 += var21;
                              var11 += var26;
                              var2 += an;
                              var8 += var28;
                           }
                        }

                        this.bt(aw, var2, 0, 0, var6 >> 14, var5 >> 14, var11, var25, var8, var27);
                        var6 += var22;
                        var5 += var21;
                        var11 += var26;
                        var2 += an;
                        var8 += var28;
                     }
                  } else {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var29[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bt(aw, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var25, var8, var27);
                              var4 += var23;
                              var5 += var21;
                              var11 += var26;
                              var2 += an;
                              var8 += var28;
                           }
                        }

                        this.bt(aw, var2, 0, 0, var5 >> 14, var6 >> 14, var11, var25, var8, var27);
                        var6 += var22;
                        var5 += var21;
                        var11 += var26;
                        var2 += an;
                        var8 += var28;
                     }
                  }
               }
            }
         } else if (var3 < var30) {
            if (var1 > var30) {
               var1 = var30;
            }

            if (var2 > var30) {
               var2 = var30;
            }

            var12 = (var12 << 8) - var25 * var6 + var25;
            var9 = var9 - var27 * (float)var6 + var27;
            if (var1 < var2) {
               var5 = var6 <<= 14;
               if (var3 < 0) {
                  var5 -= var21 * var3;
                  var6 -= var23 * var3;
                  var12 -= var26 * var3;
                  var9 -= var28 * (float)var3;
                  var3 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var22 * var1;
                  var1 = 0;
               }

               if (var21 < var23) {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var29[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bt(aw, var3, 0, 0, var5 >> 14, var4 >> 14, var12, var25, var9, var27);
                           var5 += var21;
                           var4 += var22;
                           var12 += var26;
                           var3 += an;
                           var9 += var28;
                        }
                     }

                     this.bt(aw, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var25, var9, var27);
                     var5 += var21;
                     var6 += var23;
                     var12 += var26;
                     var3 += an;
                     var9 += var28;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var29[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bt(aw, var3, 0, 0, var4 >> 14, var5 >> 14, var12, var25, var9, var27);
                           var5 += var21;
                           var4 += var22;
                           var12 += var26;
                           var3 += an;
                           var9 += var28;
                        }
                     }

                     this.bt(aw, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var25, var9, var27);
                     var5 += var21;
                     var6 += var23;
                     var12 += var26;
                     var3 += an;
                     var9 += var28;
                  }
               }
            } else {
               var4 = var6 <<= 14;
               if (var3 < 0) {
                  var4 -= var21 * var3;
                  var6 -= var23 * var3;
                  var12 -= var26 * var3;
                  var9 -= var28 * (float)var3;
                  var3 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var22 * var2;
                  var2 = 0;
               }

               if (var21 < var23) {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var29[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bt(aw, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var25, var9, var27);
                           var5 += var22;
                           var6 += var23;
                           var12 += var26;
                           var3 += an;
                           var9 += var28;
                        }
                     }

                     this.bt(aw, var3, 0, 0, var4 >> 14, var6 >> 14, var12, var25, var9, var27);
                     var4 += var21;
                     var6 += var23;
                     var12 += var26;
                     var3 += an;
                     var9 += var28;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var29[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bt(aw, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var25, var9, var27);
                           var5 += var22;
                           var6 += var23;
                           var12 += var26;
                           var3 += an;
                           var9 += var28;
                        }
                     }

                     this.bt(aw, var3, 0, 0, var6 >> 14, var4 >> 14, var12, var25, var9, var27);
                     var4 += var21;
                     var6 += var23;
                     var12 += var26;
                     var3 += an;
                     var9 += var28;
                  }
               }
            }
         }
      }
   }

   static final void be(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
      if (bk(var1[var3], var6)) {
         int var7 = var2[(var5 & 4032) + (var5 >>> 26)];
         var0[var3] = ((var7 & 16711935) * var4 & -16711936) + ((var7 & '\uff00') * var4 & 16711680) >> 8;
         var1[var3] = var6;
      }

   }

   void bn(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      int var13 = var5 - var4;
      int var14 = var2 - var1;
      int var15 = var6 - var4;
      int var16 = var3 - var1;
      int var17 = var11 - var10;
      int var18 = var12 - var10;
      float var19 = var8 - var7;
      float var20 = var9 - var7;
      int var21;
      if (var3 != var2) {
         var21 = (var6 - var5 << 14) / (var3 - var2);
      } else {
         var21 = 0;
      }

      int var22;
      if (var2 != var1) {
         var22 = (var13 << 14) / var14;
      } else {
         var22 = 0;
      }

      int var23;
      if (var3 != var1) {
         var23 = (var15 << 14) / var16;
      } else {
         var23 = 0;
      }

      int var24 = var13 * var16 - var15 * var14;
      if (var24 != 0) {
         int var25 = (var17 * var16 - var18 * var14 << 8) / var24;
         int var26 = (var18 * var13 - var17 * var15 << 8) / var24;
         float var27 = (var19 * (float)var16 - var20 * (float)var14) / (float)var24;
         float var28 = (var20 * (float)var13 - var19 * (float)var15) / (float)var24;
         int[] var29 = this.ar.ay;
         int var30 = this.ar.az;
         if (var1 <= var2 && var1 <= var3) {
            if (var1 < var30) {
               if (var2 > var30) {
                  var2 = var30;
               }

               if (var3 > var30) {
                  var3 = var30;
               }

               var10 = (var10 << 8) - var25 * var4 + var25;
               var7 = var7 - var27 * (float)var4 + var27;
               if (var2 < var3) {
                  var6 = var4 <<= 14;
                  if (var1 < 0) {
                     var6 -= var23 * var1;
                     var4 -= var22 * var1;
                     var10 -= var26 * var1;
                     var7 -= var28 * (float)var1;
                     var1 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var21 * var2;
                     var2 = 0;
                  }

                  if (var1 != var2 && var23 < var22 || var1 == var2 && var23 > var21) {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var29[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bt(aw, var1, 0, 0, var6 >> 14, var5 >> 14, var10, var25, var7, var27);
                              var6 += var23;
                              var5 += var21;
                              var10 += var26;
                              var1 += an;
                              var7 += var28;
                           }
                        }

                        this.bt(aw, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var25, var7, var27);
                        var6 += var23;
                        var4 += var22;
                        var10 += var26;
                        var1 += an;
                        var7 += var28;
                     }
                  } else {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var29[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bt(aw, var1, 0, 0, var5 >> 14, var6 >> 14, var10, var25, var7, var27);
                              var6 += var23;
                              var5 += var21;
                              var10 += var26;
                              var1 += an;
                              var7 += var28;
                           }
                        }

                        this.bt(aw, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var25, var7, var27);
                        var6 += var23;
                        var4 += var22;
                        var10 += var26;
                        var1 += an;
                        var7 += var28;
                     }
                  }
               } else {
                  var5 = var4 <<= 14;
                  if (var1 < 0) {
                     var5 -= var23 * var1;
                     var4 -= var22 * var1;
                     var10 -= var26 * var1;
                     var7 -= var28 * (float)var1;
                     var1 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var21 * var3;
                     var3 = 0;
                  }

                  if (var1 != var3 && var23 < var22 || var1 == var3 && var21 > var22) {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var29[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bt(aw, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var25, var7, var27);
                              var6 += var21;
                              var4 += var22;
                              var10 += var26;
                              var1 += an;
                              var7 += var28;
                           }
                        }

                        this.bt(aw, var1, 0, 0, var5 >> 14, var4 >> 14, var10, var25, var7, var27);
                        var5 += var23;
                        var4 += var22;
                        var10 += var26;
                        var1 += an;
                        var7 += var28;
                     }
                  } else {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var29[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bt(aw, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var25, var7, var27);
                              var6 += var21;
                              var4 += var22;
                              var10 += var26;
                              var1 += an;
                              var7 += var28;
                           }
                        }

                        this.bt(aw, var1, 0, 0, var4 >> 14, var5 >> 14, var10, var25, var7, var27);
                        var5 += var23;
                        var4 += var22;
                        var10 += var26;
                        var1 += an;
                        var7 += var28;
                     }
                  }
               }
            }
         } else if (var2 <= var3) {
            if (var2 < var30) {
               if (var3 > var30) {
                  var3 = var30;
               }

               if (var1 > var30) {
                  var1 = var30;
               }

               var11 = (var11 << 8) - var25 * var5 + var25;
               var8 = var8 - var27 * (float)var5 + var27;
               if (var3 < var1) {
                  var4 = var5 <<= 14;
                  if (var2 < 0) {
                     var4 -= var22 * var2;
                     var5 -= var21 * var2;
                     var11 -= var26 * var2;
                     var8 -= var28 * (float)var2;
                     var2 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var23 * var3;
                     var3 = 0;
                  }

                  if ((var2 == var3 || var22 >= var21) && (var2 != var3 || var22 <= var23)) {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var29[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bt(aw, var2, 0, 0, var6 >> 14, var4 >> 14, var11, var25, var8, var27);
                              var4 += var22;
                              var6 += var23;
                              var11 += var26;
                              var2 += an;
                              var8 += var28;
                           }
                        }

                        this.bt(aw, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var25, var8, var27);
                        var4 += var22;
                        var5 += var21;
                        var11 += var26;
                        var2 += an;
                        var8 += var28;
                     }
                  } else {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var29[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bt(aw, var2, 0, 0, var4 >> 14, var6 >> 14, var11, var25, var8, var27);
                              var4 += var22;
                              var6 += var23;
                              var11 += var26;
                              var2 += an;
                              var8 += var28;
                           }
                        }

                        this.bt(aw, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var25, var8, var27);
                        var4 += var22;
                        var5 += var21;
                        var11 += var26;
                        var2 += an;
                        var8 += var28;
                     }
                  }
               } else {
                  var6 = var5 <<= 14;
                  if (var2 < 0) {
                     var6 -= var22 * var2;
                     var5 -= var21 * var2;
                     var11 -= var26 * var2;
                     var8 -= var28 * (float)var2;
                     var2 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var23 * var1;
                     var1 = 0;
                  }

                  if (var22 < var21) {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var29[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bt(aw, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var25, var8, var27);
                              var4 += var23;
                              var5 += var21;
                              var11 += var26;
                              var2 += an;
                              var8 += var28;
                           }
                        }

                        this.bt(aw, var2, 0, 0, var6 >> 14, var5 >> 14, var11, var25, var8, var27);
                        var6 += var22;
                        var5 += var21;
                        var11 += var26;
                        var2 += an;
                        var8 += var28;
                     }
                  } else {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var29[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bt(aw, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var25, var8, var27);
                              var4 += var23;
                              var5 += var21;
                              var11 += var26;
                              var2 += an;
                              var8 += var28;
                           }
                        }

                        this.bt(aw, var2, 0, 0, var5 >> 14, var6 >> 14, var11, var25, var8, var27);
                        var6 += var22;
                        var5 += var21;
                        var11 += var26;
                        var2 += an;
                        var8 += var28;
                     }
                  }
               }
            }
         } else if (var3 < var30) {
            if (var1 > var30) {
               var1 = var30;
            }

            if (var2 > var30) {
               var2 = var30;
            }

            var12 = (var12 << 8) - var25 * var6 + var25;
            var9 = var9 - var27 * (float)var6 + var27;
            if (var1 < var2) {
               var5 = var6 <<= 14;
               if (var3 < 0) {
                  var5 -= var21 * var3;
                  var6 -= var23 * var3;
                  var12 -= var26 * var3;
                  var9 -= var28 * (float)var3;
                  var3 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var22 * var1;
                  var1 = 0;
               }

               if (var21 < var23) {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var29[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bt(aw, var3, 0, 0, var5 >> 14, var4 >> 14, var12, var25, var9, var27);
                           var5 += var21;
                           var4 += var22;
                           var12 += var26;
                           var3 += an;
                           var9 += var28;
                        }
                     }

                     this.bt(aw, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var25, var9, var27);
                     var5 += var21;
                     var6 += var23;
                     var12 += var26;
                     var3 += an;
                     var9 += var28;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var29[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bt(aw, var3, 0, 0, var4 >> 14, var5 >> 14, var12, var25, var9, var27);
                           var5 += var21;
                           var4 += var22;
                           var12 += var26;
                           var3 += an;
                           var9 += var28;
                        }
                     }

                     this.bt(aw, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var25, var9, var27);
                     var5 += var21;
                     var6 += var23;
                     var12 += var26;
                     var3 += an;
                     var9 += var28;
                  }
               }
            } else {
               var4 = var6 <<= 14;
               if (var3 < 0) {
                  var4 -= var21 * var3;
                  var6 -= var23 * var3;
                  var12 -= var26 * var3;
                  var9 -= var28 * (float)var3;
                  var3 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var22 * var2;
                  var2 = 0;
               }

               if (var21 < var23) {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var29[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bt(aw, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var25, var9, var27);
                           var5 += var22;
                           var6 += var23;
                           var12 += var26;
                           var3 += an;
                           var9 += var28;
                        }
                     }

                     this.bt(aw, var3, 0, 0, var4 >> 14, var6 >> 14, var12, var25, var9, var27);
                     var4 += var21;
                     var6 += var23;
                     var12 += var26;
                     var3 += an;
                     var9 += var28;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var29[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bt(aw, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var25, var9, var27);
                           var5 += var22;
                           var6 += var23;
                           var12 += var26;
                           var3 += an;
                           var9 += var28;
                        }
                     }

                     this.bt(aw, var3, 0, 0, var6 >> 14, var4 >> 14, var12, var25, var9, var27);
                     var4 += var21;
                     var6 += var23;
                     var12 += var26;
                     var3 += an;
                     var9 += var28;
                  }
               }
            }
         }
      }
   }

   static final void cn(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
      if (bk(var1[var3], var6)) {
         int var7 = var2[(var5 & 16256) + (var5 >>> 25)];
         var0[var3] = ((var7 & 16711935) * var4 & -16711936) + ((var7 & '\uff00') * var4 & 16711680) >> 8;
         var1[var3] = var6;
      }

   }

   static final void ch(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
      int var7 = var2[(var5 & 16256) + (var5 >>> 25)];
      if (var7 != 0) {
         if (bk(var1[var3], var6)) {
            var0[var3] = ((var7 & 16711935) * var4 & -16711936) + ((var7 & '\uff00') * var4 & 16711680) >> 8;
            var1[var3] = var6;
         }

      }
   }

   final void cf(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float var10, float var11, int var12, int var13, int var14, int var15, int var16, int var17) {
      if (this.ar.ac) {
         if (var7 > this.ar.ab) {
            var7 = this.ar.ab;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         var10 += var11 * (float)var6;
         int var20 = var7 - var6;
         int var10000;
         int var18;
         int var19;
         int var21;
         int var22;
         int var23;
         int var24;
         int var25;
         int var26;
         if (this.ae) {
            var26 = var6 - this.ar.ah;
            var12 += (var15 >> 3) * var26;
            var13 += (var16 >> 3) * var26;
            var14 += (var17 >> 3) * var26;
            var25 = var14 >> 12;
            if (var25 != 0) {
               var21 = var12 / var25;
               var22 = var13 / var25;
               if (var21 < 0) {
                  var21 = 0;
               } else if (var21 > 4032) {
                  var21 = 4032;
               }
            } else {
               var21 = 0;
               var22 = 0;
            }

            var12 += var15;
            var13 += var16;
            var14 += var17;
            var25 = var14 >> 12;
            if (var25 != 0) {
               var23 = var12 / var25;
               var24 = var13 / var25;
               if (var23 < 0) {
                  var23 = 0;
               } else if (var23 > 4032) {
                  var23 = 4032;
               }
            } else {
               var23 = 0;
               var24 = 0;
            }

            var3 = (var21 << 20) + var22;
            var19 = (var23 - var21 >> 3 << 20) + (var24 - var22 >> 3);
            var20 >>= 3;
            var9 <<= 3;
            var18 = var8 >> 8;
            if (this.ac) {
               if (var20 > 0) {
                  do {
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var10000 = var3 + var19;
                     var10 += var11;
                     var21 = var23;
                     var22 = var24;
                     var12 += var15;
                     var13 += var16;
                     var14 += var17;
                     var25 = var14 >> 12;
                     if (var25 != 0) {
                        var23 = var12 / var25;
                        var24 = var13 / var25;
                        if (var23 < 0) {
                           var23 = 0;
                        } else if (var23 > 4032) {
                           var23 = 4032;
                        }
                     } else {
                        var23 = 0;
                        var24 = 0;
                     }

                     var3 = (var21 << 20) + var22;
                     var19 = (var23 - var21 >> 3 << 20) + (var24 - var22 >> 3);
                     var8 += var9;
                     var18 = var8 >> 8;
                     --var20;
                  } while(var20 > 0);
               }

               var20 = var7 - var6 & 7;
               if (var20 > 0) {
                  do {
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     --var20;
                  } while(var20 > 0);
               }
            } else {
               if (var20 > 0) {
                  do {
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var10000 = var3 + var19;
                     var10 += var11;
                     var21 = var23;
                     var22 = var24;
                     var12 += var15;
                     var13 += var16;
                     var14 += var17;
                     var25 = var14 >> 12;
                     if (var25 != 0) {
                        var23 = var12 / var25;
                        var24 = var13 / var25;
                        if (var23 < 0) {
                           var23 = 0;
                        } else if (var23 > 4032) {
                           var23 = 4032;
                        }
                     } else {
                        var23 = 0;
                        var24 = 0;
                     }

                     var3 = (var21 << 20) + var22;
                     var19 = (var23 - var21 >> 3 << 20) + (var24 - var22 >> 3);
                     var8 += var9;
                     var18 = var8 >> 8;
                     --var20;
                  } while(var20 > 0);
               }

               var20 = var7 - var6 & 7;
               if (var20 > 0) {
                  do {
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     --var20;
                  } while(var20 > 0);
               }
            }
         } else {
            var26 = var6 - this.ar.ah;
            var12 += (var15 >> 3) * var26;
            var13 += (var16 >> 3) * var26;
            var14 += (var17 >> 3) * var26;
            var25 = var14 >> 14;
            if (var25 != 0) {
               var21 = var12 / var25;
               var22 = var13 / var25;
               if (var21 < 0) {
                  var21 = 0;
               } else if (var21 > 16256) {
                  var21 = 16256;
               }
            } else {
               var21 = 0;
               var22 = 0;
            }

            var12 += var15;
            var13 += var16;
            var14 += var17;
            var25 = var14 >> 14;
            if (var25 != 0) {
               var23 = var12 / var25;
               var24 = var13 / var25;
               if (var23 < 0) {
                  var23 = 0;
               } else if (var23 > 16256) {
                  var23 = 16256;
               }
            } else {
               var23 = 0;
               var24 = 0;
            }

            var3 = (var21 << 18) + var22;
            var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
            var20 >>= 3;
            var9 <<= 3;
            var18 = var8 >> 8;
            if (this.ac) {
               if (var20 > 0) {
                  do {
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var10000 = var3 + var19;
                     var10 += var11;
                     var21 = var23;
                     var22 = var24;
                     var12 += var15;
                     var13 += var16;
                     var14 += var17;
                     var25 = var14 >> 14;
                     if (var25 != 0) {
                        var23 = var12 / var25;
                        var24 = var13 / var25;
                        if (var23 < 0) {
                           var23 = 0;
                        } else if (var23 > 16256) {
                           var23 = 16256;
                        }
                     } else {
                        var23 = 0;
                        var24 = 0;
                     }

                     var3 = (var21 << 18) + var22;
                     var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
                     var8 += var9;
                     var18 = var8 >> 8;
                     --var20;
                  } while(var20 > 0);
               }

               var20 = var7 - var6 & 7;
               if (var20 > 0) {
                  do {
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     --var20;
                  } while(var20 > 0);
               }
            } else {
               if (var20 > 0) {
                  do {
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var10000 = var3 + var19;
                     var10 += var11;
                     var21 = var23;
                     var22 = var24;
                     var12 += var15;
                     var13 += var16;
                     var14 += var17;
                     var25 = var14 >> 14;
                     if (var25 != 0) {
                        var23 = var12 / var25;
                        var24 = var13 / var25;
                        if (var23 < 0) {
                           var23 = 0;
                        } else if (var23 > 16256) {
                           var23 = 16256;
                        }
                     } else {
                        var23 = 0;
                        var24 = 0;
                     }

                     var3 = (var21 << 18) + var22;
                     var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
                     var8 += var9;
                     var18 = var8 >> 8;
                     --var20;
                  } while(var20 > 0);
               }

               var20 = var7 - var6 & 7;
               if (var20 > 0) {
                  do {
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     --var20;
                  } while(var20 > 0);
               }
            }
         }

      }
   }

   static final boolean cr(float var0, float var1) {
      return var1 > var0;
   }

   void bw(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.ar.af.ag(var22, -595868952);
      int var24;
      if (var23 == null) {
         var24 = this.ar.af.am(var22, -2089862107);
         this.aq(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var24, var10), ag(var24, var11), ag(var24, var12));
      } else {
         this.ae = this.ar.af.aq(var22, 711002632);
         this.ac = this.ar.af.ax(var22, (byte)-75);
         var24 = var5 - var4;
         int var25 = var2 - var1;
         int var26 = var6 - var4;
         int var27 = var3 - var1;
         int var28 = var11 - var10;
         int var29 = var12 - var10;
         int var30 = 0;
         if (var2 != var1) {
            var30 = (var5 - var4 << 14) / (var2 - var1);
         }

         int var31 = 0;
         if (var3 != var2) {
            var31 = (var6 - var5 << 14) / (var3 - var2);
         }

         int var32 = 0;
         if (var3 != var1) {
            var32 = (var4 - var6 << 14) / (var1 - var3);
         }

         int var33 = var24 * var27 - var26 * var25;
         if (var33 != 0) {
            int var34 = (var28 * var27 - var29 * var25 << 9) / var33;
            int var35 = (var29 * var24 - var28 * var26 << 9) / var33;
            float var36 = var8 - var7;
            float var37 = var9 - var7;
            float var38 = (var36 * (float)var27 - var37 * (float)var25) / (float)var33;
            float var39 = (var37 * (float)var24 - var36 * (float)var26) / (float)var33;
            int var40 = this.ar.aq;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var41 = var15 * var16 - var18 * var13 << 14;
            int var42 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / (long)var40);
            int var43 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var40);
            int var44 = var14 * var16 - var17 * var13 << 14;
            int var45 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / (long)var40);
            int var46 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var40);
            int var47 = var17 * var15 - var14 * var18 << 14;
            int var48 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / (long)var40);
            int var49 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var40);
            int[] var50 = this.ar.ay;
            int var51 = this.ar.az;
            int var52;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < var51) {
                  if (var2 > var51) {
                     var2 = var51;
                  }

                  if (var3 > var51) {
                     var3 = var51;
                  }

                  var10 = (var10 << 9) - var34 * var4 + var34;
                  var7 = var7 - var38 * (float)var4 + var38;
                  if (var2 < var3) {
                     var6 = var4 <<= 14;
                     if (var1 < 0) {
                        var6 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var7 -= var39 * (float)var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var31 * var2;
                        var2 = 0;
                     }

                     var52 = var1 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var1 != var2 && var32 < var30 || var1 == var2 && var32 > var31) {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var7 -= var39 * (float)var1;
                        var1 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var31 * var3;
                        var3 = 0;
                     }

                     var52 = var1 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var1 != var3 && var32 < var30 || var1 == var3 && var31 > var30) {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < var51) {
                  if (var3 > var51) {
                     var3 = var51;
                  }

                  if (var1 > var51) {
                     var1 = var51;
                  }

                  var11 = (var11 << 9) - var34 * var5 + var34;
                  var8 = var8 - var38 * (float)var5 + var38;
                  if (var3 < var1) {
                     var4 = var5 <<= 14;
                     if (var2 < 0) {
                        var4 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var8 -= var39 * (float)var2;
                        var2 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var32 * var3;
                        var3 = 0;
                     }

                     var52 = var2 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var2 != var3 && var30 < var31 || var2 == var3 && var30 > var32) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     }
                  } else {
                     var6 = var5 <<= 14;
                     if (var2 < 0) {
                        var6 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var8 -= var39 * (float)var2;
                        var2 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var32 * var1;
                        var1 = 0;
                     }

                     var52 = var2 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var30 < var31) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     }
                  }
               }
            } else if (var3 < var51) {
               if (var1 > var51) {
                  var1 = var51;
               }

               if (var2 > var51) {
                  var2 = var51;
               }

               var12 = (var12 << 9) - var34 * var6 + var34;
               var9 = var9 - var38 * (float)var6 + var38;
               if (var1 < var2) {
                  var5 = var6 <<= 14;
                  if (var3 < 0) {
                     var5 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var9 -= var39 * (float)var3;
                     var3 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var30 * var1;
                     var1 = 0;
                  }

                  var52 = var3 - this.ar.ap;
                  var41 += var43 * var52;
                  var44 += var46 * var52;
                  var47 += var49 * var52;
                  if (var31 < var32) {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.cf(aw, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cf(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.cf(aw, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cf(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  }
               } else {
                  var4 = var6 <<= 14;
                  if (var3 < 0) {
                     var4 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var9 -= var39 * (float)var3;
                     var3 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var30 * var2;
                     var2 = 0;
                  }

                  var52 = var3 - this.ar.ap;
                  var41 += var43 * var52;
                  var44 += var46 * var52;
                  var47 += var49 * var52;
                  if (var31 < var32) {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.cf(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cf(aw, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.cf(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cf(aw, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  }
               }
            }
         }
      }
   }

   static final void cp(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
      if (bk(var1[var3], var6)) {
         int var7 = var2[(var5 & 4032) + (var5 >>> 26)];
         var0[var3] = ((var7 & 16711935) * var4 & -16711936) + ((var7 & '\uff00') * var4 & 16711680) >> 8;
         var1[var3] = var6;
      }

   }

   final void dt(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float var10, float var11, int var12, int var13, int var14, int var15, int var16, int var17) {
      if (this.ar.ac) {
         if (var7 > this.ar.ab) {
            var7 = this.ar.ab;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         var10 += var11 * (float)var6;
         int var20 = var7 - var6;
         int var18;
         int var19;
         int var21;
         int var22;
         int var23;
         int var24;
         int var25;
         int var26;
         if (this.ae) {
            var26 = var6 - this.ar.ah;
            var12 += var15 * var26;
            var13 += var16 * var26;
            var14 += var17 * var26;
            var25 = var14 >> 12;
            if (var25 != 0) {
               var21 = var12 / var25;
               var22 = var13 / var25;
            } else {
               var21 = 0;
               var22 = 0;
            }

            var12 += var15 * var20;
            var13 += var16 * var20;
            var14 += var17 * var20;
            var25 = var14 >> 12;
            if (var25 != 0) {
               var23 = var12 / var25;
               var24 = var13 / var25;
            } else {
               var23 = 0;
               var24 = 0;
            }

            var3 = (var21 << 20) + var22;
            var19 = ((var23 - var21) / var20 << 20) + (var24 - var22) / var20;
            var20 >>= 3;
            var9 <<= 3;
            var18 = var8 >> 8;
            if (this.ac) {
               if (var20 > 0) {
                  do {
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     var8 += var9;
                     var18 = var8 >> 8;
                     --var20;
                  } while(var20 > 0);
               }

               var20 = var7 - var6 & 7;
               if (var20 > 0) {
                  do {
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     --var20;
                  } while(var20 > 0);
               }
            } else {
               if (var20 > 0) {
                  do {
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     var8 += var9;
                     var18 = var8 >> 8;
                     --var20;
                  } while(var20 > 0);
               }

               var20 = var7 - var6 & 7;
               if (var20 > 0) {
                  do {
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     --var20;
                  } while(var20 > 0);
               }
            }
         } else {
            var26 = var6 - this.ar.ah;
            var12 += var15 * var26;
            var13 += var16 * var26;
            var14 += var17 * var26;
            var25 = var14 >> 14;
            if (var25 != 0) {
               var21 = var12 / var25;
               var22 = var13 / var25;
            } else {
               var21 = 0;
               var22 = 0;
            }

            var12 += var15 * var20;
            var13 += var16 * var20;
            var14 += var17 * var20;
            var25 = var14 >> 14;
            if (var25 != 0) {
               var23 = var12 / var25;
               var24 = var13 / var25;
            } else {
               var23 = 0;
               var24 = 0;
            }

            var3 = (var21 << 18) + var22;
            var19 = ((var23 - var21) / var20 << 18) + (var24 - var22) / var20;
            var20 >>= 3;
            var9 <<= 3;
            var18 = var8 >> 8;
            if (this.ac) {
               if (var20 > 0) {
                  do {
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     var8 += var9;
                     var18 = var8 >> 8;
                     --var20;
                  } while(var20 > 0);
               }

               var20 = var7 - var6 & 7;
               if (var20 > 0) {
                  do {
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     --var20;
                  } while(var20 > 0);
               }
            } else {
               if (var20 > 0) {
                  do {
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     var8 += var9;
                     var18 = var8 >> 8;
                     --var20;
                  } while(var20 > 0);
               }

               var20 = var7 - var6 & 7;
               if (var20 > 0) {
                  do {
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     --var20;
                  } while(var20 > 0);
               }
            }
         }

      }
   }

   static final void df(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
      int var7 = var2[(var5 & 474923076) + (var5 >>> 25)];
      if (var7 != 0) {
         if (bk(var1[var3], var6)) {
            var0[var3] = ((var7 & 16711935) * var4 & -2078868137) + ((var7 & '\uff00') * var4 & 16711680) >> 8;
            var1[var3] = var6;
         }

      }
   }

   void bh(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10) {
      int var11 = var5 - var4;
      int var12 = var2 - var1;
      int var13 = var6 - var4;
      int var14 = var3 - var1;
      float var15 = var8 - var7;
      float var16 = var9 - var7;
      int var17;
      if (var3 != var2) {
         var17 = (var6 - var5 << 14) / (var3 - var2);
      } else {
         var17 = 0;
      }

      int var18;
      if (var2 != var1) {
         var18 = (var11 << 14) / var12;
      } else {
         var18 = 0;
      }

      int var19;
      if (var3 != var1) {
         var19 = (var13 << 14) / var14;
      } else {
         var19 = 0;
      }

      int var20 = var11 * var14 - var13 * var12;
      if (var20 != 0) {
         float var21 = (var15 * (float)var14 - var16 * (float)var12) / (float)var20;
         float var22 = (var16 * (float)var11 - var15 * (float)var13) / (float)var20;
         int[] var23 = this.ar.ay;
         int var24 = this.ar.az;
         if (var1 <= var2 && var1 <= var3) {
            if (var1 < var24) {
               if (var2 > var24) {
                  var2 = var24;
               }

               if (var3 > var24) {
                  var3 = var24;
               }

               var7 = var7 - var21 * (float)var4 + var21;
               if (var2 < var3) {
                  var6 = var4 <<= 14;
                  if (var1 < 0) {
                     var6 -= var19 * var1;
                     var4 -= var18 * var1;
                     var7 -= var22 * (float)var1;
                     var1 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var17 * var2;
                     var2 = 0;
                  }

                  if ((var1 == var2 || var19 >= var18) && (var1 != var2 || var19 <= var17)) {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var23[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bq(aw, var1, var10, 0, var5 >> 14, var6 >> 14, var7, var21);
                              var6 += var19;
                              var5 += var17;
                              var1 += an;
                              var7 += var22;
                           }
                        }

                        this.bq(aw, var1, var10, 0, var4 >> 14, var6 >> 14, var7, var21);
                        var6 += var19;
                        var4 += var18;
                        var1 += an;
                        var7 += var22;
                     }
                  } else {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var23[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bq(aw, var1, var10, 0, var6 >> 14, var5 >> 14, var7, var21);
                              var6 += var19;
                              var5 += var17;
                              var1 += an;
                              var7 += var22;
                           }
                        }

                        this.bq(aw, var1, var10, 0, var6 >> 14, var4 >> 14, var7, var21);
                        var6 += var19;
                        var4 += var18;
                        var1 += an;
                        var7 += var22;
                     }
                  }
               } else {
                  var5 = var4 <<= 14;
                  if (var1 < 0) {
                     var5 -= var19 * var1;
                     var4 -= var18 * var1;
                     var7 -= var22 * (float)var1;
                     var1 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var17 * var3;
                     var3 = 0;
                  }

                  if (var1 != var3 && var19 < var18 || var1 == var3 && var17 > var18) {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var23[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bq(aw, var1, var10, 0, var6 >> 14, var4 >> 14, var7, var21);
                              var6 += var17;
                              var4 += var18;
                              var1 += an;
                              var7 += var22;
                           }
                        }

                        this.bq(aw, var1, var10, 0, var5 >> 14, var4 >> 14, var7, var21);
                        var5 += var19;
                        var4 += var18;
                        var1 += an;
                        var7 += var22;
                     }
                  } else {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var23[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bq(aw, var1, var10, 0, var4 >> 14, var6 >> 14, var7, var21);
                              var6 += var17;
                              var4 += var18;
                              var1 += an;
                              var7 += var22;
                           }
                        }

                        this.bq(aw, var1, var10, 0, var4 >> 14, var5 >> 14, var7, var21);
                        var5 += var19;
                        var4 += var18;
                        var1 += an;
                        var7 += var22;
                     }
                  }
               }
            }
         } else if (var2 <= var3) {
            if (var2 < var24) {
               if (var3 > var24) {
                  var3 = var24;
               }

               if (var1 > var24) {
                  var1 = var24;
               }

               var8 = var8 - var21 * (float)var5 + var21;
               if (var3 < var1) {
                  var4 = var5 <<= 14;
                  if (var2 < 0) {
                     var4 -= var18 * var2;
                     var5 -= var17 * var2;
                     var8 -= var22 * (float)var2;
                     var2 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var19 * var3;
                     var3 = 0;
                  }

                  if ((var2 == var3 || var18 >= var17) && (var2 != var3 || var18 <= var19)) {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var23[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bq(aw, var2, var10, 0, var6 >> 14, var4 >> 14, var8, var21);
                              var4 += var18;
                              var6 += var19;
                              var2 += an;
                              var8 += var22;
                           }
                        }

                        this.bq(aw, var2, var10, 0, var5 >> 14, var4 >> 14, var8, var21);
                        var4 += var18;
                        var5 += var17;
                        var2 += an;
                        var8 += var22;
                     }
                  } else {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var23[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bq(aw, var2, var10, 0, var4 >> 14, var6 >> 14, var8, var21);
                              var4 += var18;
                              var6 += var19;
                              var2 += an;
                              var8 += var22;
                           }
                        }

                        this.bq(aw, var2, var10, 0, var4 >> 14, var5 >> 14, var8, var21);
                        var4 += var18;
                        var5 += var17;
                        var2 += an;
                        var8 += var22;
                     }
                  }
               } else {
                  var6 = var5 <<= 14;
                  if (var2 < 0) {
                     var6 -= var18 * var2;
                     var5 -= var17 * var2;
                     var8 -= var22 * (float)var2;
                     var2 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var19 * var1;
                     var1 = 0;
                  }

                  if (var18 < var17) {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var23[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bq(aw, var2, var10, 0, var4 >> 14, var5 >> 14, var8, var21);
                              var4 += var19;
                              var5 += var17;
                              var2 += an;
                              var8 += var22;
                           }
                        }

                        this.bq(aw, var2, var10, 0, var6 >> 14, var5 >> 14, var8, var21);
                        var6 += var18;
                        var5 += var17;
                        var2 += an;
                        var8 += var22;
                     }
                  } else {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var23[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bq(aw, var2, var10, 0, var5 >> 14, var4 >> 14, var8, var21);
                              var4 += var19;
                              var5 += var17;
                              var2 += an;
                              var8 += var22;
                           }
                        }

                        this.bq(aw, var2, var10, 0, var5 >> 14, var6 >> 14, var8, var21);
                        var6 += var18;
                        var5 += var17;
                        var2 += an;
                        var8 += var22;
                     }
                  }
               }
            }
         } else if (var3 < var24) {
            if (var1 > var24) {
               var1 = var24;
            }

            if (var2 > var24) {
               var2 = var24;
            }

            var9 = var9 - var21 * (float)var6 + var21;
            if (var1 < var2) {
               var5 = var6 <<= 14;
               if (var3 < 0) {
                  var5 -= var17 * var3;
                  var6 -= var19 * var3;
                  var9 -= var22 * (float)var3;
                  var3 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var18 * var1;
                  var1 = 0;
               }

               if (var17 < var19) {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var23[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bq(aw, var3, var10, 0, var5 >> 14, var4 >> 14, var9, var21);
                           var5 += var17;
                           var4 += var18;
                           var3 += an;
                           var9 += var22;
                        }
                     }

                     this.bq(aw, var3, var10, 0, var5 >> 14, var6 >> 14, var9, var21);
                     var5 += var17;
                     var6 += var19;
                     var3 += an;
                     var9 += var22;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var23[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bq(aw, var3, var10, 0, var4 >> 14, var5 >> 14, var9, var21);
                           var5 += var17;
                           var4 += var18;
                           var3 += an;
                           var9 += var22;
                        }
                     }

                     this.bq(aw, var3, var10, 0, var6 >> 14, var5 >> 14, var9, var21);
                     var5 += var17;
                     var6 += var19;
                     var3 += an;
                     var9 += var22;
                  }
               }
            } else {
               var4 = var6 <<= 14;
               if (var3 < 0) {
                  var4 -= var17 * var3;
                  var6 -= var19 * var3;
                  var9 -= var22 * (float)var3;
                  var3 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var18 * var2;
                  var2 = 0;
               }

               if (var17 < var19) {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var23[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bq(aw, var3, var10, 0, var5 >> 14, var6 >> 14, var9, var21);
                           var5 += var18;
                           var6 += var19;
                           var3 += an;
                           var9 += var22;
                        }
                     }

                     this.bq(aw, var3, var10, 0, var4 >> 14, var6 >> 14, var9, var21);
                     var4 += var17;
                     var6 += var19;
                     var3 += an;
                     var9 += var22;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var23[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bq(aw, var3, var10, 0, var6 >> 14, var5 >> 14, var9, var21);
                           var5 += var18;
                           var6 += var19;
                           var3 += an;
                           var9 += var22;
                        }
                     }

                     this.bq(aw, var3, var10, 0, var6 >> 14, var4 >> 14, var9, var21);
                     var4 += var17;
                     var6 += var19;
                     var3 += an;
                     var9 += var22;
                  }
               }
            }
         }
      }
   }

   void bd(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10) {
      int var11 = var5 - var4;
      int var12 = var2 - var1;
      int var13 = var6 - var4;
      int var14 = var3 - var1;
      float var15 = var8 - var7;
      float var16 = var9 - var7;
      int var17;
      if (var3 != var2) {
         var17 = (var6 - var5 << 14) / (var3 - var2);
      } else {
         var17 = 0;
      }

      int var18;
      if (var2 != var1) {
         var18 = (var11 << 14) / var12;
      } else {
         var18 = 0;
      }

      int var19;
      if (var3 != var1) {
         var19 = (var13 << 14) / var14;
      } else {
         var19 = 0;
      }

      int var20 = var11 * var14 - var13 * var12;
      if (var20 != 0) {
         float var21 = (var15 * (float)var14 - var16 * (float)var12) / (float)var20;
         float var22 = (var16 * (float)var11 - var15 * (float)var13) / (float)var20;
         int[] var23 = this.ar.ay;
         int var24 = this.ar.az;
         if (var1 <= var2 && var1 <= var3) {
            if (var1 < var24) {
               if (var2 > var24) {
                  var2 = var24;
               }

               if (var3 > var24) {
                  var3 = var24;
               }

               var7 = var7 - var21 * (float)var4 + var21;
               if (var2 < var3) {
                  var6 = var4 <<= 14;
                  if (var1 < 0) {
                     var6 -= var19 * var1;
                     var4 -= var18 * var1;
                     var7 -= var22 * (float)var1;
                     var1 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var17 * var2;
                     var2 = 0;
                  }

                  if (var1 != var2 && var19 < var18 || var1 == var2 && var19 > var17) {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var23[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bq(aw, var1, var10, 0, var6 >> 14, var5 >> 14, var7, var21);
                              var6 += var19;
                              var5 += var17;
                              var1 += an;
                              var7 += var22;
                           }
                        }

                        this.bq(aw, var1, var10, 0, var6 >> 14, var4 >> 14, var7, var21);
                        var6 += var19;
                        var4 += var18;
                        var1 += an;
                        var7 += var22;
                     }
                  } else {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var23[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bq(aw, var1, var10, 0, var5 >> 14, var6 >> 14, var7, var21);
                              var6 += var19;
                              var5 += var17;
                              var1 += an;
                              var7 += var22;
                           }
                        }

                        this.bq(aw, var1, var10, 0, var4 >> 14, var6 >> 14, var7, var21);
                        var6 += var19;
                        var4 += var18;
                        var1 += an;
                        var7 += var22;
                     }
                  }
               } else {
                  var5 = var4 <<= 14;
                  if (var1 < 0) {
                     var5 -= var19 * var1;
                     var4 -= var18 * var1;
                     var7 -= var22 * (float)var1;
                     var1 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var17 * var3;
                     var3 = 0;
                  }

                  if (var1 != var3 && var19 < var18 || var1 == var3 && var17 > var18) {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var23[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bq(aw, var1, var10, 0, var6 >> 14, var4 >> 14, var7, var21);
                              var6 += var17;
                              var4 += var18;
                              var1 += an;
                              var7 += var22;
                           }
                        }

                        this.bq(aw, var1, var10, 0, var5 >> 14, var4 >> 14, var7, var21);
                        var5 += var19;
                        var4 += var18;
                        var1 += an;
                        var7 += var22;
                     }
                  } else {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var23[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bq(aw, var1, var10, 0, var4 >> 14, var6 >> 14, var7, var21);
                              var6 += var17;
                              var4 += var18;
                              var1 += an;
                              var7 += var22;
                           }
                        }

                        this.bq(aw, var1, var10, 0, var4 >> 14, var5 >> 14, var7, var21);
                        var5 += var19;
                        var4 += var18;
                        var1 += an;
                        var7 += var22;
                     }
                  }
               }
            }
         } else if (var2 <= var3) {
            if (var2 < var24) {
               if (var3 > var24) {
                  var3 = var24;
               }

               if (var1 > var24) {
                  var1 = var24;
               }

               var8 = var8 - var21 * (float)var5 + var21;
               if (var3 < var1) {
                  var4 = var5 <<= 14;
                  if (var2 < 0) {
                     var4 -= var18 * var2;
                     var5 -= var17 * var2;
                     var8 -= var22 * (float)var2;
                     var2 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var19 * var3;
                     var3 = 0;
                  }

                  if (var2 != var3 && var18 < var17 || var2 == var3 && var18 > var19) {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var23[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bq(aw, var2, var10, 0, var4 >> 14, var6 >> 14, var8, var21);
                              var4 += var18;
                              var6 += var19;
                              var2 += an;
                              var8 += var22;
                           }
                        }

                        this.bq(aw, var2, var10, 0, var4 >> 14, var5 >> 14, var8, var21);
                        var4 += var18;
                        var5 += var17;
                        var2 += an;
                        var8 += var22;
                     }
                  } else {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var23[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bq(aw, var2, var10, 0, var6 >> 14, var4 >> 14, var8, var21);
                              var4 += var18;
                              var6 += var19;
                              var2 += an;
                              var8 += var22;
                           }
                        }

                        this.bq(aw, var2, var10, 0, var5 >> 14, var4 >> 14, var8, var21);
                        var4 += var18;
                        var5 += var17;
                        var2 += an;
                        var8 += var22;
                     }
                  }
               } else {
                  var6 = var5 <<= 14;
                  if (var2 < 0) {
                     var6 -= var18 * var2;
                     var5 -= var17 * var2;
                     var8 -= var22 * (float)var2;
                     var2 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var19 * var1;
                     var1 = 0;
                  }

                  if (var18 < var17) {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var23[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bq(aw, var2, var10, 0, var4 >> 14, var5 >> 14, var8, var21);
                              var4 += var19;
                              var5 += var17;
                              var2 += an;
                              var8 += var22;
                           }
                        }

                        this.bq(aw, var2, var10, 0, var6 >> 14, var5 >> 14, var8, var21);
                        var6 += var18;
                        var5 += var17;
                        var2 += an;
                        var8 += var22;
                     }
                  } else {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var23[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bq(aw, var2, var10, 0, var5 >> 14, var4 >> 14, var8, var21);
                              var4 += var19;
                              var5 += var17;
                              var2 += an;
                              var8 += var22;
                           }
                        }

                        this.bq(aw, var2, var10, 0, var5 >> 14, var6 >> 14, var8, var21);
                        var6 += var18;
                        var5 += var17;
                        var2 += an;
                        var8 += var22;
                     }
                  }
               }
            }
         } else if (var3 < var24) {
            if (var1 > var24) {
               var1 = var24;
            }

            if (var2 > var24) {
               var2 = var24;
            }

            var9 = var9 - var21 * (float)var6 + var21;
            if (var1 < var2) {
               var5 = var6 <<= 14;
               if (var3 < 0) {
                  var5 -= var17 * var3;
                  var6 -= var19 * var3;
                  var9 -= var22 * (float)var3;
                  var3 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var18 * var1;
                  var1 = 0;
               }

               if (var17 < var19) {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var23[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bq(aw, var3, var10, 0, var5 >> 14, var4 >> 14, var9, var21);
                           var5 += var17;
                           var4 += var18;
                           var3 += an;
                           var9 += var22;
                        }
                     }

                     this.bq(aw, var3, var10, 0, var5 >> 14, var6 >> 14, var9, var21);
                     var5 += var17;
                     var6 += var19;
                     var3 += an;
                     var9 += var22;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var23[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bq(aw, var3, var10, 0, var4 >> 14, var5 >> 14, var9, var21);
                           var5 += var17;
                           var4 += var18;
                           var3 += an;
                           var9 += var22;
                        }
                     }

                     this.bq(aw, var3, var10, 0, var6 >> 14, var5 >> 14, var9, var21);
                     var5 += var17;
                     var6 += var19;
                     var3 += an;
                     var9 += var22;
                  }
               }
            } else {
               var4 = var6 <<= 14;
               if (var3 < 0) {
                  var4 -= var17 * var3;
                  var6 -= var19 * var3;
                  var9 -= var22 * (float)var3;
                  var3 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var18 * var2;
                  var2 = 0;
               }

               if (var17 < var19) {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var23[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bq(aw, var3, var10, 0, var5 >> 14, var6 >> 14, var9, var21);
                           var5 += var18;
                           var6 += var19;
                           var3 += an;
                           var9 += var22;
                        }
                     }

                     this.bq(aw, var3, var10, 0, var4 >> 14, var6 >> 14, var9, var21);
                     var4 += var17;
                     var6 += var19;
                     var3 += an;
                     var9 += var22;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var23[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bq(aw, var3, var10, 0, var6 >> 14, var5 >> 14, var9, var21);
                           var5 += var18;
                           var6 += var19;
                           var3 += an;
                           var9 += var22;
                        }
                     }

                     this.bq(aw, var3, var10, 0, var6 >> 14, var4 >> 14, var9, var21);
                     var4 += var17;
                     var6 += var19;
                     var3 += an;
                     var9 += var22;
                  }
               }
            }
         }
      }
   }

   final void cy(int[] var1, float[] var2, int var3, int var4, int var5, int var6, float var7) {
      if (bk(var2[var3], var7)) {
         int var8 = (var4 & (var4 >> 31 & 1) - 1) >> 8;
         int var9 = this.au[var8];
         var9 = ((var9 & 16711935) * var6 >> 8 & 16711935) + ((var9 & '\uff00') * var6 >> 8 & '\uff00');
         int var10 = var1[var3];
         var1[var3] = var9 + ((var10 & 16711935) * var5 >> 8 & 16711935) + ((var10 & '\uff00') * var5 >> 8 & '\uff00');
      }

   }

   final void cu(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float var10, float var11, int var12, int var13, int var14, int var15, int var16, int var17) {
      if (this.ar.ac) {
         if (var7 > this.ar.ab) {
            var7 = this.ar.ab;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         var10 += var11 * (float)var6;
         int var20 = var7 - var6;
         int var18;
         int var19;
         int var21;
         int var22;
         int var23;
         int var24;
         int var25;
         int var26;
         if (this.ae) {
            var26 = var6 - this.ar.ah;
            var12 += var15 * var26;
            var13 += var16 * var26;
            var14 += var17 * var26;
            var25 = var14 >> 12;
            if (var25 != 0) {
               var21 = var12 / var25;
               var22 = var13 / var25;
            } else {
               var21 = 0;
               var22 = 0;
            }

            var12 += var15 * var20;
            var13 += var16 * var20;
            var14 += var17 * var20;
            var25 = var14 >> 12;
            if (var25 != 0) {
               var23 = var12 / var25;
               var24 = var13 / var25;
            } else {
               var23 = 0;
               var24 = 0;
            }

            var3 = (var21 << 20) + var22;
            var19 = ((var23 - var21) / var20 << 20) + (var24 - var22) / var20;
            var20 >>= 3;
            var9 <<= 3;
            var18 = var8 >> 8;
            if (this.ac) {
               if (var20 > 0) {
                  do {
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     var8 += var9;
                     var18 = var8 >> 8;
                     --var20;
                  } while(var20 > 0);
               }

               var20 = var7 - var6 & 7;
               if (var20 > 0) {
                  do {
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     --var20;
                  } while(var20 > 0);
               }
            } else {
               if (var20 > 0) {
                  do {
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     var8 += var9;
                     var18 = var8 >> 8;
                     --var20;
                  } while(var20 > 0);
               }

               var20 = var7 - var6 & 7;
               if (var20 > 0) {
                  do {
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     --var20;
                  } while(var20 > 0);
               }
            }
         } else {
            var26 = var6 - this.ar.ah;
            var12 += var15 * var26;
            var13 += var16 * var26;
            var14 += var17 * var26;
            var25 = var14 >> 14;
            if (var25 != 0) {
               var21 = var12 / var25;
               var22 = var13 / var25;
            } else {
               var21 = 0;
               var22 = 0;
            }

            var12 += var15 * var20;
            var13 += var16 * var20;
            var14 += var17 * var20;
            var25 = var14 >> 14;
            if (var25 != 0) {
               var23 = var12 / var25;
               var24 = var13 / var25;
            } else {
               var23 = 0;
               var24 = 0;
            }

            var3 = (var21 << 18) + var22;
            var19 = ((var23 - var21) / var20 << 18) + (var24 - var22) / var20;
            var20 >>= 3;
            var9 <<= 3;
            var18 = var8 >> 8;
            if (this.ac) {
               if (var20 > 0) {
                  do {
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     var8 += var9;
                     var18 = var8 >> 8;
                     --var20;
                  } while(var20 > 0);
               }

               var20 = var7 - var6 & 7;
               if (var20 > 0) {
                  do {
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     --var20;
                  } while(var20 > 0);
               }
            } else {
               if (var20 > 0) {
                  do {
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     var8 += var9;
                     var18 = var8 >> 8;
                     --var20;
                  } while(var20 > 0);
               }

               var20 = var7 - var6 & 7;
               if (var20 > 0) {
                  do {
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     --var20;
                  } while(var20 > 0);
               }
            }
         }

      }
   }

   void bm(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.ar.af.ag(var22, 1321004970);
      int var24;
      if (var23 == null) {
         var24 = this.ar.af.am(var22, -1996292948);
         this.aq(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var24, var10), ag(var24, var11), ag(var24, var12));
      } else {
         this.ae = this.ar.af.aq(var22, 1658988451);
         this.ac = this.ar.af.ax(var22, (byte)-55);
         var24 = var5 - var4;
         int var25 = var2 - var1;
         int var26 = var6 - var4;
         int var27 = var3 - var1;
         int var28 = var11 - var10;
         int var29 = var12 - var10;
         int var30 = 0;
         if (var2 != var1) {
            var30 = (var5 - var4 << 14) / (var2 - var1);
         }

         int var31 = 0;
         if (var3 != var2) {
            var31 = (var6 - var5 << 14) / (var3 - var2);
         }

         int var32 = 0;
         if (var3 != var1) {
            var32 = (var4 - var6 << 14) / (var1 - var3);
         }

         int var33 = var24 * var27 - var26 * var25;
         if (var33 != 0) {
            int var34 = (var28 * var27 - var29 * var25 << 9) / var33;
            int var35 = (var29 * var24 - var28 * var26 << 9) / var33;
            float var36 = var8 - var7;
            float var37 = var9 - var7;
            float var38 = (var36 * (float)var27 - var37 * (float)var25) / (float)var33;
            float var39 = (var37 * (float)var24 - var36 * (float)var26) / (float)var33;
            int var40 = this.ar.aq;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var41 = var15 * var16 - var18 * var13 << 14;
            int var42 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / (long)var40);
            int var43 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var40);
            int var44 = var14 * var16 - var17 * var13 << 14;
            int var45 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / (long)var40);
            int var46 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var40);
            int var47 = var17 * var15 - var14 * var18 << 14;
            int var48 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / (long)var40);
            int var49 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var40);
            int[] var50 = this.ar.ay;
            int var51 = this.ar.az;
            int var52;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < var51) {
                  if (var2 > var51) {
                     var2 = var51;
                  }

                  if (var3 > var51) {
                     var3 = var51;
                  }

                  var10 = (var10 << 9) - var34 * var4 + var34;
                  var7 = var7 - var38 * (float)var4 + var38;
                  if (var2 < var3) {
                     var6 = var4 <<= 14;
                     if (var1 < 0) {
                        var6 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var7 -= var39 * (float)var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var31 * var2;
                        var2 = 0;
                     }

                     var52 = var1 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var1 != var2 && var32 < var30 || var1 == var2 && var32 > var31) {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var7 -= var39 * (float)var1;
                        var1 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var31 * var3;
                        var3 = 0;
                     }

                     var52 = var1 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var1 != var3 && var32 < var30 || var1 == var3 && var31 > var30) {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < var51) {
                  if (var3 > var51) {
                     var3 = var51;
                  }

                  if (var1 > var51) {
                     var1 = var51;
                  }

                  var11 = (var11 << 9) - var34 * var5 + var34;
                  var8 = var8 - var38 * (float)var5 + var38;
                  if (var3 < var1) {
                     var4 = var5 <<= 14;
                     if (var2 < 0) {
                        var4 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var8 -= var39 * (float)var2;
                        var2 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var32 * var3;
                        var3 = 0;
                     }

                     var52 = var2 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var2 != var3 && var30 < var31 || var2 == var3 && var30 > var32) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     }
                  } else {
                     var6 = var5 <<= 14;
                     if (var2 < 0) {
                        var6 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var8 -= var39 * (float)var2;
                        var2 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var32 * var1;
                        var1 = 0;
                     }

                     var52 = var2 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var30 < var31) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     }
                  }
               }
            } else if (var3 < var51) {
               if (var1 > var51) {
                  var1 = var51;
               }

               if (var2 > var51) {
                  var2 = var51;
               }

               var12 = (var12 << 9) - var34 * var6 + var34;
               var9 = var9 - var38 * (float)var6 + var38;
               if (var1 < var2) {
                  var5 = var6 <<= 14;
                  if (var3 < 0) {
                     var5 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var9 -= var39 * (float)var3;
                     var3 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var30 * var1;
                     var1 = 0;
                  }

                  var52 = var3 - this.ar.ap;
                  var41 += var43 * var52;
                  var44 += var46 * var52;
                  var47 += var49 * var52;
                  if (var31 < var32) {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.cf(aw, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cf(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.cf(aw, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cf(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  }
               } else {
                  var4 = var6 <<= 14;
                  if (var3 < 0) {
                     var4 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var9 -= var39 * (float)var3;
                     var3 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var30 * var2;
                     var2 = 0;
                  }

                  var52 = var3 - this.ar.ap;
                  var41 += var43 * var52;
                  var44 += var46 * var52;
                  var47 += var49 * var52;
                  if (var31 < var32) {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.cf(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cf(aw, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.cf(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cf(aw, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  }
               }
            }
         }
      }
   }

   void bs(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.ar.af.ag(var22, -2089669300);
      int var24;
      if (var23 == null) {
         var24 = this.ar.af.am(var22, -1955407063);
         this.aq(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var24, var10), ag(var24, var11), ag(var24, var12));
      } else {
         this.ae = this.ar.af.aq(var22, 1325980296);
         this.ac = this.ar.af.ax(var22, (byte)-14);
         var24 = var5 - var4;
         int var25 = var2 - var1;
         int var26 = var6 - var4;
         int var27 = var3 - var1;
         int var28 = var11 - var10;
         int var29 = var12 - var10;
         int var30 = 0;
         if (var2 != var1) {
            var30 = (var5 - var4 << 14) / (var2 - var1);
         }

         int var31 = 0;
         if (var3 != var2) {
            var31 = (var6 - var5 << 14) / (var3 - var2);
         }

         int var32 = 0;
         if (var3 != var1) {
            var32 = (var4 - var6 << 14) / (var1 - var3);
         }

         int var33 = var24 * var27 - var26 * var25;
         if (var33 != 0) {
            int var34 = (var28 * var27 - var29 * var25 << 9) / var33;
            int var35 = (var29 * var24 - var28 * var26 << 9) / var33;
            float var36 = var8 - var7;
            float var37 = var9 - var7;
            float var38 = (var36 * (float)var27 - var37 * (float)var25) / (float)var33;
            float var39 = (var37 * (float)var24 - var36 * (float)var26) / (float)var33;
            int var40 = this.ar.aq;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var41 = var15 * var16 - var18 * var13 << 14;
            int var42 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / (long)var40);
            int var43 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var40);
            int var44 = var14 * var16 - var17 * var13 << 14;
            int var45 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / (long)var40);
            int var46 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var40);
            int var47 = var17 * var15 - var14 * var18 << 14;
            int var48 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / (long)var40);
            int var49 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var40);
            int[] var50 = this.ar.ay;
            int var51 = this.ar.az;
            int var52;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < var51) {
                  if (var2 > var51) {
                     var2 = var51;
                  }

                  if (var3 > var51) {
                     var3 = var51;
                  }

                  var10 = (var10 << 9) - var34 * var4 + var34;
                  var7 = var7 - var38 * (float)var4 + var38;
                  if (var2 < var3) {
                     var6 = var4 <<= 14;
                     if (var1 < 0) {
                        var6 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var7 -= var39 * (float)var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var31 * var2;
                        var2 = 0;
                     }

                     var52 = var1 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var1 != var2 && var32 < var30 || var1 == var2 && var32 > var31) {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var7 -= var39 * (float)var1;
                        var1 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var31 * var3;
                        var3 = 0;
                     }

                     var52 = var1 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if ((var1 == var3 || var32 >= var30) && (var1 != var3 || var31 <= var30)) {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < var51) {
                  if (var3 > var51) {
                     var3 = var51;
                  }

                  if (var1 > var51) {
                     var1 = var51;
                  }

                  var11 = (var11 << 9) - var34 * var5 + var34;
                  var8 = var8 - var38 * (float)var5 + var38;
                  if (var3 < var1) {
                     var4 = var5 <<= 14;
                     if (var2 < 0) {
                        var4 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var8 -= var39 * (float)var2;
                        var2 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var32 * var3;
                        var3 = 0;
                     }

                     var52 = var2 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var2 != var3 && var30 < var31 || var2 == var3 && var30 > var32) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     }
                  } else {
                     var6 = var5 <<= 14;
                     if (var2 < 0) {
                        var6 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var8 -= var39 * (float)var2;
                        var2 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var32 * var1;
                        var1 = 0;
                     }

                     var52 = var2 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var30 < var31) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cf(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cf(aw, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     }
                  }
               }
            } else if (var3 < var51) {
               if (var1 > var51) {
                  var1 = var51;
               }

               if (var2 > var51) {
                  var2 = var51;
               }

               var12 = (var12 << 9) - var34 * var6 + var34;
               var9 = var9 - var38 * (float)var6 + var38;
               if (var1 < var2) {
                  var5 = var6 <<= 14;
                  if (var3 < 0) {
                     var5 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var9 -= var39 * (float)var3;
                     var3 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var30 * var1;
                     var1 = 0;
                  }

                  var52 = var3 - this.ar.ap;
                  var41 += var43 * var52;
                  var44 += var46 * var52;
                  var47 += var49 * var52;
                  if (var31 < var32) {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.cf(aw, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cf(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.cf(aw, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cf(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  }
               } else {
                  var4 = var6 <<= 14;
                  if (var3 < 0) {
                     var4 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var9 -= var39 * (float)var3;
                     var3 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var30 * var2;
                     var2 = 0;
                  }

                  var52 = var3 - this.ar.ap;
                  var41 += var43 * var52;
                  var44 += var46 * var52;
                  var47 += var49 * var52;
                  if (var31 < var32) {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.cf(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cf(aw, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.cf(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cf(aw, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  }
               }
            }
         }
      }
   }

   void ba(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.ar.af.ag(var22, 90265009);
      int var24;
      if (var23 == null) {
         var24 = this.ar.af.am(var22, -1968759155);
         this.aq(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var24, var10), ag(var24, var11), ag(var24, var12));
      } else {
         this.ae = this.ar.af.aq(var22, 1203991819);
         this.ac = this.ar.af.ax(var22, (byte)100);
         var24 = var5 - var4;
         int var25 = var2 - var1;
         int var26 = var6 - var4;
         int var27 = var3 - var1;
         int var28 = var11 - var10;
         int var29 = var12 - var10;
         int var30 = 0;
         if (var2 != var1) {
            var30 = (var5 - var4 << 14) / (var2 - var1);
         }

         int var31 = 0;
         if (var3 != var2) {
            var31 = (var6 - var5 << 14) / (var3 - var2);
         }

         int var32 = 0;
         if (var3 != var1) {
            var32 = (var4 - var6 << 14) / (var1 - var3);
         }

         int var33 = var24 * var27 - var26 * var25;
         if (var33 != 0) {
            int var34 = (var28 * var27 - var29 * var25 << 9) / var33;
            int var35 = (var29 * var24 - var28 * var26 << 9) / var33;
            float var36 = var8 - var7;
            float var37 = var9 - var7;
            float var38 = (var36 * (float)var27 - var37 * (float)var25) / (float)var33;
            float var39 = (var37 * (float)var24 - var36 * (float)var26) / (float)var33;
            int var40 = this.ar.aq;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var41 = var15 * var16 - var18 * var13 << 14;
            int var42 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / (long)var40);
            int var43 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var40);
            int var44 = var14 * var16 - var17 * var13 << 14;
            int var45 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / (long)var40);
            int var46 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var40);
            int var47 = var17 * var15 - var14 * var18 << 14;
            int var48 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / (long)var40);
            int var49 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var40);
            int[] var50 = this.ar.ay;
            int var51 = this.ar.az;
            int var52;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < var51) {
                  if (var2 > var51) {
                     var2 = var51;
                  }

                  if (var3 > var51) {
                     var3 = var51;
                  }

                  var10 = (var10 << 9) - var34 * var4 + var34;
                  var7 = var7 - var38 * (float)var4 + var38;
                  if (var2 < var3) {
                     var6 = var4 <<= 14;
                     if (var1 < 0) {
                        var6 -= var32 * var1;
                        var4 -= var30 * var1;
                        var7 -= var39 * (float)var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var31 * var2;
                        var2 = 0;
                     }

                     var52 = var1 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var1 != var2 && var32 < var30 || var1 == var2 && var32 > var31) {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var32 * var1;
                        var4 -= var30 * var1;
                        var7 -= var39 * (float)var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var31 * var3;
                        var3 = 0;
                     }

                     var52 = var1 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var1 != var3 && var32 < var30 || var1 == var3 && var31 > var30) {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < var51) {
                  if (var3 > var51) {
                     var3 = var51;
                  }

                  if (var1 > var51) {
                     var1 = var51;
                  }

                  var11 = (var11 << 9) - var34 * var5 + var34;
                  var8 = var8 - var38 * (float)var5 + var38;
                  if (var3 < var1) {
                     var4 = var5 <<= 14;
                     if (var2 < 0) {
                        var4 -= var30 * var2;
                        var5 -= var31 * var2;
                        var8 -= var39 * (float)var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var32 * var3;
                        var3 = 0;
                     }

                     var52 = var2 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var2 != var3 && var30 < var31 || var2 == var3 && var30 > var32) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     }
                  } else {
                     var6 = var5 <<= 14;
                     if (var2 < 0) {
                        var6 -= var30 * var2;
                        var5 -= var31 * var2;
                        var8 -= var39 * (float)var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var32 * var1;
                        var1 = 0;
                     }

                     var52 = var2 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var30 < var31) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     }
                  }
               }
            } else if (var3 < var51) {
               if (var1 > var51) {
                  var1 = var51;
               }

               if (var2 > var51) {
                  var2 = var51;
               }

               var12 = (var12 << 9) - var34 * var6 + var34;
               var9 = var9 - var38 * (float)var6 + var38;
               if (var1 < var2) {
                  var5 = var6 <<= 14;
                  if (var3 < 0) {
                     var5 -= var31 * var3;
                     var6 -= var32 * var3;
                     var9 -= var39 * (float)var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var30 * var1;
                     var1 = 0;
                  }

                  var52 = var3 - this.ar.ap;
                  var41 += var43 * var52;
                  var44 += var46 * var52;
                  var47 += var49 * var52;
                  if (var31 < var32) {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.cu(aw, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cu(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.cu(aw, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cu(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  }
               } else {
                  var4 = var6 <<= 14;
                  if (var3 < 0) {
                     var4 -= var31 * var3;
                     var6 -= var32 * var3;
                     var9 -= var39 * (float)var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var30 * var2;
                     var2 = 0;
                  }

                  var52 = var3 - this.ar.ap;
                  var41 += var43 * var52;
                  var44 += var46 * var52;
                  var47 += var49 * var52;
                  if (var31 < var32) {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.cu(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cu(aw, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.cu(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cu(aw, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  }
               }
            }
         }
      }
   }

   static final void ce(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
      int var7 = var2[(var5 & 1167929400) + (var5 >>> 26)];
      if (var7 != 0) {
         if (bk(var1[var3], var6)) {
            var0[var3] = ((var7 & -1513701379) * var4 & -16711936) + ((var7 & '\uff00') * var4 & 16711680) >> 8;
            var1[var3] = var6;
         }

      }
   }

   static final void ca(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
      if (bk(var1[var3], var6)) {
         int var7 = var2[(var5 & -2122525567) + (var5 >>> 26)];
         var0[var3] = ((var7 & -1558951206) * var4 & -16711936) + ((var7 & '\uff00') * var4 & 375352102) >> 8;
         var1[var3] = var6;
      }

   }

   void bp(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.ar.af.ag(var22, -953904336);
      int var24;
      if (var23 == null) {
         var24 = this.ar.af.am(var22, -1952721988);
         this.aq(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var24, var10), ag(var24, var11), ag(var24, var12));
      } else {
         this.ae = this.ar.af.aq(var22, 1395828455);
         this.ac = this.ar.af.ax(var22, (byte)-98);
         var24 = var5 - var4;
         int var25 = var2 - var1;
         int var26 = var6 - var4;
         int var27 = var3 - var1;
         int var28 = var11 - var10;
         int var29 = var12 - var10;
         int var30 = 0;
         if (var2 != var1) {
            var30 = (var5 - var4 << 14) / (var2 - var1);
         }

         int var31 = 0;
         if (var3 != var2) {
            var31 = (var6 - var5 << 14) / (var3 - var2);
         }

         int var32 = 0;
         if (var3 != var1) {
            var32 = (var4 - var6 << 14) / (var1 - var3);
         }

         int var33 = var24 * var27 - var26 * var25;
         if (var33 != 0) {
            int var34 = (var28 * var27 - var29 * var25 << 9) / var33;
            int var35 = (var29 * var24 - var28 * var26 << 9) / var33;
            float var36 = var8 - var7;
            float var37 = var9 - var7;
            float var38 = (var36 * (float)var27 - var37 * (float)var25) / (float)var33;
            float var39 = (var37 * (float)var24 - var36 * (float)var26) / (float)var33;
            int var40 = this.ar.aq;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var41 = var15 * var16 - var18 * var13 << 14;
            int var42 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / (long)var40);
            int var43 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var40);
            int var44 = var14 * var16 - var17 * var13 << 14;
            int var45 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / (long)var40);
            int var46 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var40);
            int var47 = var17 * var15 - var14 * var18 << 14;
            int var48 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / (long)var40);
            int var49 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var40);
            int[] var50 = this.ar.ay;
            int var51 = this.ar.az;
            int var52;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < var51) {
                  if (var2 > var51) {
                     var2 = var51;
                  }

                  if (var3 > var51) {
                     var3 = var51;
                  }

                  var10 = (var10 << 9) - var34 * var4 + var34;
                  var7 = var7 - var38 * (float)var4 + var38;
                  if (var2 < var3) {
                     var6 = var4 <<= 14;
                     if (var1 < 0) {
                        var6 -= var32 * var1;
                        var4 -= var30 * var1;
                        var7 -= var39 * (float)var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var31 * var2;
                        var2 = 0;
                     }

                     var52 = var1 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var1 != var2 && var32 < var30 || var1 == var2 && var32 > var31) {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var32 * var1;
                        var4 -= var30 * var1;
                        var7 -= var39 * (float)var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var31 * var3;
                        var3 = 0;
                     }

                     var52 = var1 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if ((var1 == var3 || var32 >= var30) && (var1 != var3 || var31 <= var30)) {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < var51) {
                  if (var3 > var51) {
                     var3 = var51;
                  }

                  if (var1 > var51) {
                     var1 = var51;
                  }

                  var11 = (var11 << 9) - var34 * var5 + var34;
                  var8 = var8 - var38 * (float)var5 + var38;
                  if (var3 < var1) {
                     var4 = var5 <<= 14;
                     if (var2 < 0) {
                        var4 -= var30 * var2;
                        var5 -= var31 * var2;
                        var8 -= var39 * (float)var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var32 * var3;
                        var3 = 0;
                     }

                     var52 = var2 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var2 != var3 && var30 < var31 || var2 == var3 && var30 > var32) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     }
                  } else {
                     var6 = var5 <<= 14;
                     if (var2 < 0) {
                        var6 -= var30 * var2;
                        var5 -= var31 * var2;
                        var8 -= var39 * (float)var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var32 * var1;
                        var1 = 0;
                     }

                     var52 = var2 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var30 < var31) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     }
                  }
               }
            } else if (var3 < var51) {
               if (var1 > var51) {
                  var1 = var51;
               }

               if (var2 > var51) {
                  var2 = var51;
               }

               var12 = (var12 << 9) - var34 * var6 + var34;
               var9 = var9 - var38 * (float)var6 + var38;
               if (var1 < var2) {
                  var5 = var6 <<= 14;
                  if (var3 < 0) {
                     var5 -= var31 * var3;
                     var6 -= var32 * var3;
                     var9 -= var39 * (float)var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var30 * var1;
                     var1 = 0;
                  }

                  var52 = var3 - this.ar.ap;
                  var41 += var43 * var52;
                  var44 += var46 * var52;
                  var47 += var49 * var52;
                  if (var31 < var32) {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.cu(aw, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cu(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.cu(aw, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cu(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  }
               } else {
                  var4 = var6 <<= 14;
                  if (var3 < 0) {
                     var4 -= var31 * var3;
                     var6 -= var32 * var3;
                     var9 -= var39 * (float)var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var30 * var2;
                     var2 = 0;
                  }

                  var52 = var3 - this.ar.ap;
                  var41 += var43 * var52;
                  var44 += var46 * var52;
                  var47 += var49 * var52;
                  if (var31 < var32) {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.cu(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cu(aw, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.cu(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cu(aw, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  }
               }
            }
         }
      }
   }

   final void cm(int[] var1, float[] var2, int var3, int var4, float var5) {
      if (bk(var2[var3], var5)) {
         int var6 = (var4 & (var4 >> -572244132 & 1) - 1) >> 8;
         var1[var3] = this.au[var6];
         var2[var3] = var5;
      }

   }

   final void cj(int[] var1, float[] var2, int var3, int var4, float var5) {
      if (bk(var2[var3], var5)) {
         int var6 = (var4 & (var4 >> 31 & 1) - 1) >> 8;
         var1[var3] = this.au[var6];
         var2[var3] = var5;
      }

   }

   final void cx(int[] var1, float[] var2, int var3, int var4, int var5, float var6) {
      if (bk(var2[var3], var6)) {
         int var7 = var1[var3];
         var1[var3] = var4 + ((var7 & 386908900) * var5 >> 8 & 536294202) + ((var7 & '\uff00') * var5 >> 8 & '\uff00');
      }

   }

   final void ci(int[] var1, float[] var2, int var3, int var4, int var5, float var6) {
      if (bk(var2[var3], var6)) {
         int var7 = var1[var3];
         var1[var3] = var4 + ((var7 & 1541113320) * var5 >> 8 & 978075253) + ((var7 & -2043170132) * var5 >> 8 & -810477374);
      }

   }

   final void br(int[] var1, float[] var2, int var3, int var4, float var5) {
      if (bk(var2[var3], var5)) {
         int var6 = (var4 & (var4 >> 31 & 1) - 1) >> 8;
         var1[var3] = this.au[var6];
         var2[var3] = var5;
      }

   }

   final void co(int[] var1, float[] var2, int var3, int var4, int var5, int var6, float var7) {
      if (bk(var2[var3], var7)) {
         int var8 = (var4 & (var4 >> 1419185693 & 1) - 1) >> 8;
         int var9 = this.au[var8];
         var9 = ((var9 & 16711935) * var6 >> 8 & 147358959) + ((var9 & -977827066) * var6 >> 8 & 1570415701);
         int var10 = var1[var3];
         var1[var3] = var9 + ((var10 & 16711935) * var5 >> 8 & -1405686938) + ((var10 & '\uff00') * var5 >> 8 & '\uff00');
      }

   }

   final void cv(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, float var9, float var10) {
      if (this.ar.ac) {
         if (var6 > this.ar.ab) {
            var6 = this.ar.ab;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var7 += var8 * var5;
         var9 += var10 * (float)var5;
         int var11;
         int var12;
         if (this.ar.ae) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.ar.ag == 0) {
               if (var4 > 0) {
                  do {
                     var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.au[var11];
                     var7 += var8;
                     this.bu(var1, bn, var2, var3, var9);
                     var9 += var10;
                     ++var2;
                     this.bu(var1, bn, var2, var3, var9);
                     var9 += var10;
                     ++var2;
                     this.bu(var1, bn, var2, var3, var9);
                     var9 += var10;
                     ++var2;
                     this.bu(var1, bn, var2, var3, var9);
                     var9 += var10;
                     ++var2;
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.au[var11];

                  do {
                     this.bu(var1, bn, var2, var3, var9);
                     var9 += var10;
                     ++var2;
                     --var4;
                  } while(var4 > 0);
               }
            } else {
               var11 = this.ar.ag;
               var12 = 256 - this.ar.ag;
               int var13;
               if (var4 > 0) {
                  do {
                     var13 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.au[var13];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');
                     this.bo(var1, bn, var2, var3, var11, var9);
                     ++var2;
                     var9 += var10;
                     this.bo(var1, bn, var2, var3, var11, var9);
                     ++var2;
                     var9 += var10;
                     this.bo(var1, bn, var2, var3, var11, var9);
                     ++var2;
                     var9 += var10;
                     this.bo(var1, bn, var2, var3, var11, var9);
                     ++var2;
                     var9 += var10;
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var13 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.au[var13];
                  var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');

                  do {
                     this.bo(var1, bn, var2, var3, var11, var9);
                     ++var2;
                     var9 += var10;
                     --var4;
                  } while(var4 > 0);
               }
            }

         } else {
            var4 = var6 - var5;
            if (this.ar.ag == 0) {
               do {
                  this.br(var1, bn, var2, var7, var9);
                  var9 += var10;
                  ++var2;
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            } else {
               var11 = this.ar.ag;
               var12 = 256 - this.ar.ag;

               do {
                  this.bv(var1, bn, var2, var3, var11, var12, var9);
                  var9 += var10;
                  ++var2;
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            }

         }
      }
   }

   final void cg(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, float var9, float var10) {
      if (this.ar.ac) {
         if (var6 > this.ar.ab) {
            var6 = this.ar.ab;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var7 += var8 * var5;
         var9 += var10 * (float)var5;
         int var11;
         int var12;
         if (this.ar.ae) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.ar.ag == 0) {
               if (var4 > 0) {
                  do {
                     var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.au[var11];
                     var7 += var8;
                     this.bu(var1, bn, var2, var3, var9);
                     var9 += var10;
                     ++var2;
                     this.bu(var1, bn, var2, var3, var9);
                     var9 += var10;
                     ++var2;
                     this.bu(var1, bn, var2, var3, var9);
                     var9 += var10;
                     ++var2;
                     this.bu(var1, bn, var2, var3, var9);
                     var9 += var10;
                     ++var2;
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.au[var11];

                  do {
                     this.bu(var1, bn, var2, var3, var9);
                     var9 += var10;
                     ++var2;
                     --var4;
                  } while(var4 > 0);
               }
            } else {
               var11 = this.ar.ag;
               var12 = 256 - this.ar.ag;
               int var13;
               if (var4 > 0) {
                  do {
                     var13 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.au[var13];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');
                     this.bo(var1, bn, var2, var3, var11, var9);
                     ++var2;
                     var9 += var10;
                     this.bo(var1, bn, var2, var3, var11, var9);
                     ++var2;
                     var9 += var10;
                     this.bo(var1, bn, var2, var3, var11, var9);
                     ++var2;
                     var9 += var10;
                     this.bo(var1, bn, var2, var3, var11, var9);
                     ++var2;
                     var9 += var10;
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var13 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.au[var13];
                  var3 = ((var3 & 16711935) * var12 >> 8 & 16711935) + ((var3 & '\uff00') * var12 >> 8 & '\uff00');

                  do {
                     this.bo(var1, bn, var2, var3, var11, var9);
                     ++var2;
                     var9 += var10;
                     --var4;
                  } while(var4 > 0);
               }
            }

         } else {
            var4 = var6 - var5;
            if (this.ar.ag == 0) {
               do {
                  this.br(var1, bn, var2, var7, var9);
                  var9 += var10;
                  ++var2;
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            } else {
               var11 = this.ar.ag;
               var12 = 256 - this.ar.ag;

               do {
                  this.bv(var1, bn, var2, var3, var11, var12, var9);
                  var9 += var10;
                  ++var2;
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            }

         }
      }
   }

   final void ct(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, float var9, float var10) {
      if (this.ar.ac) {
         if (var6 > this.ar.ab) {
            var6 = this.ar.ab;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var7 += var8 * var5;
         var9 += var10 * (float)var5;
         int var11;
         int var12;
         if (this.ar.ae) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.ar.ag == 0) {
               if (var4 > 0) {
                  do {
                     var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.au[var11];
                     var7 += var8;
                     this.bu(var1, bn, var2, var3, var9);
                     var9 += var10;
                     ++var2;
                     this.bu(var1, bn, var2, var3, var9);
                     var9 += var10;
                     ++var2;
                     this.bu(var1, bn, var2, var3, var9);
                     var9 += var10;
                     ++var2;
                     this.bu(var1, bn, var2, var3, var9);
                     var9 += var10;
                     ++var2;
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.au[var11];

                  do {
                     this.bu(var1, bn, var2, var3, var9);
                     var9 += var10;
                     ++var2;
                     --var4;
                  } while(var4 > 0);
               }
            } else {
               var11 = this.ar.ag;
               var12 = 242820146 - this.ar.ag;
               int var13;
               if (var4 > 0) {
                  do {
                     var13 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.au[var13];
                     var7 += var8;
                     var3 = ((var3 & -1573752995) * var12 >> 8 & -1489739553) + ((var3 & -2086871803) * var12 >> 8 & -1858572142);
                     this.bo(var1, bn, var2, var3, var11, var9);
                     ++var2;
                     var9 += var10;
                     this.bo(var1, bn, var2, var3, var11, var9);
                     ++var2;
                     var9 += var10;
                     this.bo(var1, bn, var2, var3, var11, var9);
                     ++var2;
                     var9 += var10;
                     this.bo(var1, bn, var2, var3, var11, var9);
                     ++var2;
                     var9 += var10;
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var13 = (var7 & (var7 >> -563507743 & 1) - 1) >> 8;
                  var3 = this.au[var13];
                  var3 = ((var3 & -1351120373) * var12 >> 8 & 329162076) + ((var3 & -1459248725) * var12 >> 8 & -1781629689);

                  do {
                     this.bo(var1, bn, var2, var3, var11, var9);
                     ++var2;
                     var9 += var10;
                     --var4;
                  } while(var4 > 0);
               }
            }

         } else {
            var4 = var6 - var5;
            if (this.ar.ag == 0) {
               do {
                  this.br(var1, bn, var2, var7, var9);
                  var9 += var10;
                  ++var2;
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            } else {
               var11 = this.ar.ag;
               var12 = 256 - this.ar.ag;

               do {
                  this.bv(var1, bn, var2, var3, var11, var12, var9);
                  var9 += var10;
                  ++var2;
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            }

         }
      }
   }

   final void cq(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
      if (this.ar.ac) {
         if (var6 > this.ar.ab) {
            var6 = this.ar.ab;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var4 = var6 - var5 >> 2;
         var7 += var8 * (float)var5;
         if (this.ar.ag != 0) {
            if (this.ar.ag == 254) {
               while(true) {
                  --var4;
                  if (var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if (var4 < 0) {
                           return;
                        }

                        var1[var2++] = var1[var2];
                     }
                  }

                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
               }
            } else {
               int var9 = this.ar.ag;
               int var10 = 256 - this.ar.ag;
               var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');

               while(true) {
                  --var4;
                  if (var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if (var4 < 0) {
                           return;
                        }

                        this.bo(var1, bn, var2, var3, var9, var7);
                        ++var2;
                        var7 += var8;
                     }
                  }

                  this.bo(var1, bn, var2, var3, var9, var7);
                  ++var2;
                  var7 += var8;
                  this.bo(var1, bn, var2, var3, var9, var7);
                  ++var2;
                  var7 += var8;
                  this.bo(var1, bn, var2, var3, var9, var7);
                  ++var2;
                  var7 += var8;
                  this.bo(var1, bn, var2, var3, var9, var7);
                  ++var2;
                  var7 += var8;
               }
            }
         } else {
            while(true) {
               --var4;
               if (var4 < 0) {
                  var4 = var6 - var5 & 3;

                  while(true) {
                     --var4;
                     if (var4 < 0) {
                        return;
                     }

                     this.bu(var1, bn, var2, var3, var7);
                     var7 += var8;
                     ++var2;
                  }
               }

               this.bu(var1, bn, var2, var3, var7);
               var7 += var8;
               ++var2;
               this.bu(var1, bn, var2, var3, var7);
               var7 += var8;
               ++var2;
               this.bu(var1, bn, var2, var3, var7);
               var7 += var8;
               ++var2;
               this.bu(var1, bn, var2, var3, var7);
               var7 += var8;
               ++var2;
            }
         }
      }
   }

   final void cc(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
      if (this.ar.ac) {
         if (var6 > this.ar.ab) {
            var6 = this.ar.ab;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var4 = var6 - var5 >> 2;
         var7 += var8 * (float)var5;
         if (this.ar.ag != 0) {
            if (this.ar.ag == 254) {
               while(true) {
                  --var4;
                  if (var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if (var4 < 0) {
                           return;
                        }

                        var1[var2++] = var1[var2];
                     }
                  }

                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
               }
            } else {
               int var9 = this.ar.ag;
               int var10 = 99384433 - this.ar.ag;
               var3 = ((var3 & -484959488) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');

               while(true) {
                  --var4;
                  if (var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if (var4 < 0) {
                           return;
                        }

                        this.bo(var1, bn, var2, var3, var9, var7);
                        ++var2;
                        var7 += var8;
                     }
                  }

                  this.bo(var1, bn, var2, var3, var9, var7);
                  ++var2;
                  var7 += var8;
                  this.bo(var1, bn, var2, var3, var9, var7);
                  ++var2;
                  var7 += var8;
                  this.bo(var1, bn, var2, var3, var9, var7);
                  ++var2;
                  var7 += var8;
                  this.bo(var1, bn, var2, var3, var9, var7);
                  ++var2;
                  var7 += var8;
               }
            }
         } else {
            while(true) {
               --var4;
               if (var4 < 0) {
                  var4 = var6 - var5 & 3;

                  while(true) {
                     --var4;
                     if (var4 < 0) {
                        return;
                     }

                     this.bu(var1, bn, var2, var3, var7);
                     var7 += var8;
                     ++var2;
                  }
               }

               this.bu(var1, bn, var2, var3, var7);
               var7 += var8;
               ++var2;
               this.bu(var1, bn, var2, var3, var7);
               var7 += var8;
               ++var2;
               this.bu(var1, bn, var2, var3, var7);
               var7 += var8;
               ++var2;
               this.bu(var1, bn, var2, var3, var7);
               var7 += var8;
               ++var2;
            }
         }
      }
   }

   static final boolean bk(float var0, float var1) {
      return var1 > var0;
   }

   final void cw(int[] var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8) {
      if (this.ar.ac) {
         if (var6 > this.ar.ab) {
            var6 = this.ar.ab;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var4 = var6 - var5 >> 2;
         var7 += var8 * (float)var5;
         if (this.ar.ag != 0) {
            if (this.ar.ag == 254) {
               while(true) {
                  --var4;
                  if (var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if (var4 < 0) {
                           return;
                        }

                        var1[var2++] = var1[var2];
                     }
                  }

                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
                  var1[var2++] = var1[var2];
               }
            } else {
               int var9 = this.ar.ag;
               int var10 = -724813811 - this.ar.ag;
               var3 = ((var3 & 1972479357) * var10 >> 8 & 1749596182) + ((var3 & 602596176) * var10 >> 8 & -1245238769);

               while(true) {
                  --var4;
                  if (var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if (var4 < 0) {
                           return;
                        }

                        this.bo(var1, bn, var2, var3, var9, var7);
                        ++var2;
                        var7 += var8;
                     }
                  }

                  this.bo(var1, bn, var2, var3, var9, var7);
                  ++var2;
                  var7 += var8;
                  this.bo(var1, bn, var2, var3, var9, var7);
                  ++var2;
                  var7 += var8;
                  this.bo(var1, bn, var2, var3, var9, var7);
                  ++var2;
                  var7 += var8;
                  this.bo(var1, bn, var2, var3, var9, var7);
                  ++var2;
                  var7 += var8;
               }
            }
         } else {
            while(true) {
               --var4;
               if (var4 < 0) {
                  var4 = var6 - var5 & 3;

                  while(true) {
                     --var4;
                     if (var4 < 0) {
                        return;
                     }

                     this.bu(var1, bn, var2, var3, var7);
                     var7 += var8;
                     ++var2;
                  }
               }

               this.bu(var1, bn, var2, var3, var7);
               var7 += var8;
               ++var2;
               this.bu(var1, bn, var2, var3, var7);
               var7 += var8;
               ++var2;
               this.bu(var1, bn, var2, var3, var7);
               var7 += var8;
               ++var2;
               this.bu(var1, bn, var2, var3, var7);
               var7 += var8;
               ++var2;
            }
         }
      }
   }

   static final void dp(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
      int var7 = var2[(var5 & 16256) + (var5 >>> 25)];
      if (var7 != 0) {
         if (bk(var1[var3], var6)) {
            var0[var3] = ((var7 & 16711935) * var4 & -16711936) + ((var7 & '\uff00') * var4 & 16711680) >> 8;
            var1[var3] = var6;
         }

      }
   }

   static final boolean cl(float var0, float var1) {
      return var1 > var0;
   }

   static final void cd(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
      int var7 = var2[(var5 & 1481882093) + (var5 >>> 26)];
      if (var7 != 0) {
         if (bk(var1[var3], var6)) {
            var0[var3] = ((var7 & 1107154493) * var4 & -428017257) + ((var7 & '\uff00') * var4 & 1584134779) >> 8;
            var1[var3] = var6;
         }

      }
   }

   void bj(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.ar.af.ag(var22, 1008040115);
      int var24;
      if (var23 == null) {
         var24 = this.ar.af.am(var22, -2081292482);
         this.aq(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var24, var10), ag(var24, var11), ag(var24, var12));
      } else {
         this.ae = this.ar.af.aq(var22, 320415657);
         this.ac = this.ar.af.ax(var22, (byte)-3);
         var24 = var5 - var4;
         int var25 = var2 - var1;
         int var26 = var6 - var4;
         int var27 = var3 - var1;
         int var28 = var11 - var10;
         int var29 = var12 - var10;
         int var30 = 0;
         if (var2 != var1) {
            var30 = (var5 - var4 << 14) / (var2 - var1);
         }

         int var31 = 0;
         if (var3 != var2) {
            var31 = (var6 - var5 << 14) / (var3 - var2);
         }

         int var32 = 0;
         if (var3 != var1) {
            var32 = (var4 - var6 << 14) / (var1 - var3);
         }

         int var33 = var24 * var27 - var26 * var25;
         if (var33 != 0) {
            int var34 = (var28 * var27 - var29 * var25 << 9) / var33;
            int var35 = (var29 * var24 - var28 * var26 << 9) / var33;
            float var36 = var8 - var7;
            float var37 = var9 - var7;
            float var38 = (var36 * (float)var27 - var37 * (float)var25) / (float)var33;
            float var39 = (var37 * (float)var24 - var36 * (float)var26) / (float)var33;
            int var40 = this.ar.aq;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var41 = var15 * var16 - var18 * var13 << 14;
            int var42 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / (long)var40);
            int var43 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var40);
            int var44 = var14 * var16 - var17 * var13 << 14;
            int var45 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / (long)var40);
            int var46 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var40);
            int var47 = var17 * var15 - var14 * var18 << 14;
            int var48 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / (long)var40);
            int var49 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var40);
            int[] var50 = this.ar.ay;
            int var51 = this.ar.az;
            int var52;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < var51) {
                  if (var2 > var51) {
                     var2 = var51;
                  }

                  if (var3 > var51) {
                     var3 = var51;
                  }

                  var10 = (var10 << 9) - var34 * var4 + var34;
                  var7 = var7 - var38 * (float)var4 + var38;
                  if (var2 < var3) {
                     var6 = var4 <<= 14;
                     if (var1 < 0) {
                        var6 -= var32 * var1;
                        var4 -= var30 * var1;
                        var7 -= var39 * (float)var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var31 * var2;
                        var2 = 0;
                     }

                     var52 = var1 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var1 != var2 && var32 < var30 || var1 == var2 && var32 > var31) {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var32 * var1;
                        var4 -= var30 * var1;
                        var7 -= var39 * (float)var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var31 * var3;
                        var3 = 0;
                     }

                     var52 = var1 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if ((var1 == var3 || var32 >= var30) && (var1 != var3 || var31 <= var30)) {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < var51) {
                  if (var3 > var51) {
                     var3 = var51;
                  }

                  if (var1 > var51) {
                     var1 = var51;
                  }

                  var11 = (var11 << 9) - var34 * var5 + var34;
                  var8 = var8 - var38 * (float)var5 + var38;
                  if (var3 < var1) {
                     var4 = var5 <<= 14;
                     if (var2 < 0) {
                        var4 -= var30 * var2;
                        var5 -= var31 * var2;
                        var8 -= var39 * (float)var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var32 * var3;
                        var3 = 0;
                     }

                     var52 = var2 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var2 != var3 && var30 < var31 || var2 == var3 && var30 > var32) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     }
                  } else {
                     var6 = var5 <<= 14;
                     if (var2 < 0) {
                        var6 -= var30 * var2;
                        var5 -= var31 * var2;
                        var8 -= var39 * (float)var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var32 * var1;
                        var1 = 0;
                     }

                     var52 = var2 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var30 < var31) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     }
                  }
               }
            } else if (var3 < var51) {
               if (var1 > var51) {
                  var1 = var51;
               }

               if (var2 > var51) {
                  var2 = var51;
               }

               var12 = (var12 << 9) - var34 * var6 + var34;
               var9 = var9 - var38 * (float)var6 + var38;
               if (var1 < var2) {
                  var5 = var6 <<= 14;
                  if (var3 < 0) {
                     var5 -= var31 * var3;
                     var6 -= var32 * var3;
                     var9 -= var39 * (float)var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var30 * var1;
                     var1 = 0;
                  }

                  var52 = var3 - this.ar.ap;
                  var41 += var43 * var52;
                  var44 += var46 * var52;
                  var47 += var49 * var52;
                  if (var31 < var32) {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.cu(aw, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cu(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.cu(aw, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cu(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  }
               } else {
                  var4 = var6 <<= 14;
                  if (var3 < 0) {
                     var4 -= var31 * var3;
                     var6 -= var32 * var3;
                     var9 -= var39 * (float)var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var30 * var2;
                     var2 = 0;
                  }

                  var52 = var3 - this.ar.ap;
                  var41 += var43 * var52;
                  var44 += var46 * var52;
                  var47 += var49 * var52;
                  if (var31 < var32) {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.cu(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cu(aw, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.cu(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cu(aw, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  }
               }
            }
         }
      }
   }

   static final void bc(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
      int var7 = var2[(var5 & 4032) + (var5 >>> 26)];
      if (var7 != 0) {
         if (bk(var1[var3], var6)) {
            var0[var3] = ((var7 & 16711935) * var4 & -16711936) + ((var7 & '\uff00') * var4 & 16711680) >> 8;
            var1[var3] = var6;
         }

      }
   }

   static final void cb(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
      int var7 = var2[(var5 & -1902788198) + (var5 >>> 26)];
      if (var7 != 0) {
         if (bk(var1[var3], var6)) {
            var0[var3] = ((var7 & 16711935) * var4 & -16711936) + ((var7 & 663716435) * var4 & -1673220280) >> 8;
            var1[var3] = var6;
         }

      }
   }

   km(kr var1) {
      super(var1);
   }

   void bf(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10) {
      int var11 = var5 - var4;
      int var12 = var2 - var1;
      int var13 = var6 - var4;
      int var14 = var3 - var1;
      float var15 = var8 - var7;
      float var16 = var9 - var7;
      int var17;
      if (var3 != var2) {
         var17 = (var6 - var5 << 14) / (var3 - var2);
      } else {
         var17 = 0;
      }

      int var18;
      if (var2 != var1) {
         var18 = (var11 << 14) / var12;
      } else {
         var18 = 0;
      }

      int var19;
      if (var3 != var1) {
         var19 = (var13 << 14) / var14;
      } else {
         var19 = 0;
      }

      int var20 = var11 * var14 - var13 * var12;
      if (var20 != 0) {
         float var21 = (var15 * (float)var14 - var16 * (float)var12) / (float)var20;
         float var22 = (var16 * (float)var11 - var15 * (float)var13) / (float)var20;
         int[] var23 = this.ar.ay;
         int var24 = this.ar.az;
         if (var1 <= var2 && var1 <= var3) {
            if (var1 < var24) {
               if (var2 > var24) {
                  var2 = var24;
               }

               if (var3 > var24) {
                  var3 = var24;
               }

               var7 = var7 - var21 * (float)var4 + var21;
               if (var2 < var3) {
                  var6 = var4 <<= 14;
                  if (var1 < 0) {
                     var6 -= var19 * var1;
                     var4 -= var18 * var1;
                     var7 -= var22 * (float)var1;
                     var1 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var17 * var2;
                     var2 = 0;
                  }

                  if (var1 != var2 && var19 < var18 || var1 == var2 && var19 > var17) {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var23[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bq(aw, var1, var10, 0, var6 >> 14, var5 >> 14, var7, var21);
                              var6 += var19;
                              var5 += var17;
                              var1 += an;
                              var7 += var22;
                           }
                        }

                        this.bq(aw, var1, var10, 0, var6 >> 14, var4 >> 14, var7, var21);
                        var6 += var19;
                        var4 += var18;
                        var1 += an;
                        var7 += var22;
                     }
                  } else {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var23[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bq(aw, var1, var10, 0, var5 >> 14, var6 >> 14, var7, var21);
                              var6 += var19;
                              var5 += var17;
                              var1 += an;
                              var7 += var22;
                           }
                        }

                        this.bq(aw, var1, var10, 0, var4 >> 14, var6 >> 14, var7, var21);
                        var6 += var19;
                        var4 += var18;
                        var1 += an;
                        var7 += var22;
                     }
                  }
               } else {
                  var5 = var4 <<= 14;
                  if (var1 < 0) {
                     var5 -= var19 * var1;
                     var4 -= var18 * var1;
                     var7 -= var22 * (float)var1;
                     var1 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var17 * var3;
                     var3 = 0;
                  }

                  if ((var1 == var3 || var19 >= var18) && (var1 != var3 || var17 <= var18)) {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var23[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bq(aw, var1, var10, 0, var4 >> 14, var6 >> 14, var7, var21);
                              var6 += var17;
                              var4 += var18;
                              var1 += an;
                              var7 += var22;
                           }
                        }

                        this.bq(aw, var1, var10, 0, var4 >> 14, var5 >> 14, var7, var21);
                        var5 += var19;
                        var4 += var18;
                        var1 += an;
                        var7 += var22;
                     }
                  } else {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var23[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bq(aw, var1, var10, 0, var6 >> 14, var4 >> 14, var7, var21);
                              var6 += var17;
                              var4 += var18;
                              var1 += an;
                              var7 += var22;
                           }
                        }

                        this.bq(aw, var1, var10, 0, var5 >> 14, var4 >> 14, var7, var21);
                        var5 += var19;
                        var4 += var18;
                        var1 += an;
                        var7 += var22;
                     }
                  }
               }
            }
         } else if (var2 <= var3) {
            if (var2 < var24) {
               if (var3 > var24) {
                  var3 = var24;
               }

               if (var1 > var24) {
                  var1 = var24;
               }

               var8 = var8 - var21 * (float)var5 + var21;
               if (var3 < var1) {
                  var4 = var5 <<= 14;
                  if (var2 < 0) {
                     var4 -= var18 * var2;
                     var5 -= var17 * var2;
                     var8 -= var22 * (float)var2;
                     var2 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var19 * var3;
                     var3 = 0;
                  }

                  if (var2 != var3 && var18 < var17 || var2 == var3 && var18 > var19) {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var23[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bq(aw, var2, var10, 0, var4 >> 14, var6 >> 14, var8, var21);
                              var4 += var18;
                              var6 += var19;
                              var2 += an;
                              var8 += var22;
                           }
                        }

                        this.bq(aw, var2, var10, 0, var4 >> 14, var5 >> 14, var8, var21);
                        var4 += var18;
                        var5 += var17;
                        var2 += an;
                        var8 += var22;
                     }
                  } else {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var23[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bq(aw, var2, var10, 0, var6 >> 14, var4 >> 14, var8, var21);
                              var4 += var18;
                              var6 += var19;
                              var2 += an;
                              var8 += var22;
                           }
                        }

                        this.bq(aw, var2, var10, 0, var5 >> 14, var4 >> 14, var8, var21);
                        var4 += var18;
                        var5 += var17;
                        var2 += an;
                        var8 += var22;
                     }
                  }
               } else {
                  var6 = var5 <<= 14;
                  if (var2 < 0) {
                     var6 -= var18 * var2;
                     var5 -= var17 * var2;
                     var8 -= var22 * (float)var2;
                     var2 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var19 * var1;
                     var1 = 0;
                  }

                  if (var18 < var17) {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var23[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bq(aw, var2, var10, 0, var4 >> 14, var5 >> 14, var8, var21);
                              var4 += var19;
                              var5 += var17;
                              var2 += an;
                              var8 += var22;
                           }
                        }

                        this.bq(aw, var2, var10, 0, var6 >> 14, var5 >> 14, var8, var21);
                        var6 += var18;
                        var5 += var17;
                        var2 += an;
                        var8 += var22;
                     }
                  } else {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var23[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bq(aw, var2, var10, 0, var5 >> 14, var4 >> 14, var8, var21);
                              var4 += var19;
                              var5 += var17;
                              var2 += an;
                              var8 += var22;
                           }
                        }

                        this.bq(aw, var2, var10, 0, var5 >> 14, var6 >> 14, var8, var21);
                        var6 += var18;
                        var5 += var17;
                        var2 += an;
                        var8 += var22;
                     }
                  }
               }
            }
         } else if (var3 < var24) {
            if (var1 > var24) {
               var1 = var24;
            }

            if (var2 > var24) {
               var2 = var24;
            }

            var9 = var9 - var21 * (float)var6 + var21;
            if (var1 < var2) {
               var5 = var6 <<= 14;
               if (var3 < 0) {
                  var5 -= var17 * var3;
                  var6 -= var19 * var3;
                  var9 -= var22 * (float)var3;
                  var3 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var18 * var1;
                  var1 = 0;
               }

               if (var17 < var19) {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var23[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bq(aw, var3, var10, 0, var5 >> 14, var4 >> 14, var9, var21);
                           var5 += var17;
                           var4 += var18;
                           var3 += an;
                           var9 += var22;
                        }
                     }

                     this.bq(aw, var3, var10, 0, var5 >> 14, var6 >> 14, var9, var21);
                     var5 += var17;
                     var6 += var19;
                     var3 += an;
                     var9 += var22;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var23[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bq(aw, var3, var10, 0, var4 >> 14, var5 >> 14, var9, var21);
                           var5 += var17;
                           var4 += var18;
                           var3 += an;
                           var9 += var22;
                        }
                     }

                     this.bq(aw, var3, var10, 0, var6 >> 14, var5 >> 14, var9, var21);
                     var5 += var17;
                     var6 += var19;
                     var3 += an;
                     var9 += var22;
                  }
               }
            } else {
               var4 = var6 <<= 14;
               if (var3 < 0) {
                  var4 -= var17 * var3;
                  var6 -= var19 * var3;
                  var9 -= var22 * (float)var3;
                  var3 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var18 * var2;
                  var2 = 0;
               }

               if (var17 < var19) {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var23[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bq(aw, var3, var10, 0, var5 >> 14, var6 >> 14, var9, var21);
                           var5 += var18;
                           var6 += var19;
                           var3 += an;
                           var9 += var22;
                        }
                     }

                     this.bq(aw, var3, var10, 0, var4 >> 14, var6 >> 14, var9, var21);
                     var4 += var17;
                     var6 += var19;
                     var3 += an;
                     var9 += var22;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var23[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bq(aw, var3, var10, 0, var6 >> 14, var5 >> 14, var9, var21);
                           var5 += var18;
                           var6 += var19;
                           var3 += an;
                           var9 += var22;
                        }
                     }

                     this.bq(aw, var3, var10, 0, var6 >> 14, var4 >> 14, var9, var21);
                     var4 += var17;
                     var6 += var19;
                     var3 += an;
                     var9 += var22;
                  }
               }
            }
         }
      }
   }

   static final void ck(int[] var0, float[] var1, int[] var2, int var3, int var4, int var5, float var6) {
      if (bk(var1[var3], var6)) {
         int var7 = var2[(var5 & 16256) + (var5 >>> 25)];
         var0[var3] = ((var7 & 16711935) * var4 & -16711936) + ((var7 & '\uff00') * var4 & 16711680) >> 8;
         var1[var3] = var6;
      }

   }

   void bx(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10) {
      int var11 = var5 - var4;
      int var12 = var2 - var1;
      int var13 = var6 - var4;
      int var14 = var3 - var1;
      float var15 = var8 - var7;
      float var16 = var9 - var7;
      int var17;
      if (var3 != var2) {
         var17 = (var6 - var5 << 14) / (var3 - var2);
      } else {
         var17 = 0;
      }

      int var18;
      if (var2 != var1) {
         var18 = (var11 << 14) / var12;
      } else {
         var18 = 0;
      }

      int var19;
      if (var3 != var1) {
         var19 = (var13 << 14) / var14;
      } else {
         var19 = 0;
      }

      int var20 = var11 * var14 - var13 * var12;
      if (var20 != 0) {
         float var21 = (var15 * (float)var14 - var16 * (float)var12) / (float)var20;
         float var22 = (var16 * (float)var11 - var15 * (float)var13) / (float)var20;
         int[] var23 = this.ar.ay;
         int var24 = this.ar.az;
         if (var1 <= var2 && var1 <= var3) {
            if (var1 < var24) {
               if (var2 > var24) {
                  var2 = var24;
               }

               if (var3 > var24) {
                  var3 = var24;
               }

               var7 = var7 - var21 * (float)var4 + var21;
               if (var2 < var3) {
                  var6 = var4 <<= 14;
                  if (var1 < 0) {
                     var6 -= var19 * var1;
                     var4 -= var18 * var1;
                     var7 -= var22 * (float)var1;
                     var1 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var17 * var2;
                     var2 = 0;
                  }

                  if (var1 != var2 && var19 < var18 || var1 == var2 && var19 > var17) {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var23[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bq(aw, var1, var10, 0, var6 >> 14, var5 >> 14, var7, var21);
                              var6 += var19;
                              var5 += var17;
                              var1 += an;
                              var7 += var22;
                           }
                        }

                        this.bq(aw, var1, var10, 0, var6 >> 14, var4 >> 14, var7, var21);
                        var6 += var19;
                        var4 += var18;
                        var1 += an;
                        var7 += var22;
                     }
                  } else {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var23[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bq(aw, var1, var10, 0, var5 >> 14, var6 >> 14, var7, var21);
                              var6 += var19;
                              var5 += var17;
                              var1 += an;
                              var7 += var22;
                           }
                        }

                        this.bq(aw, var1, var10, 0, var4 >> 14, var6 >> 14, var7, var21);
                        var6 += var19;
                        var4 += var18;
                        var1 += an;
                        var7 += var22;
                     }
                  }
               } else {
                  var5 = var4 <<= 14;
                  if (var1 < 0) {
                     var5 -= var19 * var1;
                     var4 -= var18 * var1;
                     var7 -= var22 * (float)var1;
                     var1 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var17 * var3;
                     var3 = 0;
                  }

                  if (var1 != var3 && var19 < var18 || var1 == var3 && var17 > var18) {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var23[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bq(aw, var1, var10, 0, var6 >> 14, var4 >> 14, var7, var21);
                              var6 += var17;
                              var4 += var18;
                              var1 += an;
                              var7 += var22;
                           }
                        }

                        this.bq(aw, var1, var10, 0, var5 >> 14, var4 >> 14, var7, var21);
                        var5 += var19;
                        var4 += var18;
                        var1 += an;
                        var7 += var22;
                     }
                  } else {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var23[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bq(aw, var1, var10, 0, var4 >> 14, var6 >> 14, var7, var21);
                              var6 += var17;
                              var4 += var18;
                              var1 += an;
                              var7 += var22;
                           }
                        }

                        this.bq(aw, var1, var10, 0, var4 >> 14, var5 >> 14, var7, var21);
                        var5 += var19;
                        var4 += var18;
                        var1 += an;
                        var7 += var22;
                     }
                  }
               }
            }
         } else if (var2 <= var3) {
            if (var2 < var24) {
               if (var3 > var24) {
                  var3 = var24;
               }

               if (var1 > var24) {
                  var1 = var24;
               }

               var8 = var8 - var21 * (float)var5 + var21;
               if (var3 < var1) {
                  var4 = var5 <<= 14;
                  if (var2 < 0) {
                     var4 -= var18 * var2;
                     var5 -= var17 * var2;
                     var8 -= var22 * (float)var2;
                     var2 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var19 * var3;
                     var3 = 0;
                  }

                  if (var2 != var3 && var18 < var17 || var2 == var3 && var18 > var19) {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var23[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bq(aw, var2, var10, 0, var4 >> 14, var6 >> 14, var8, var21);
                              var4 += var18;
                              var6 += var19;
                              var2 += an;
                              var8 += var22;
                           }
                        }

                        this.bq(aw, var2, var10, 0, var4 >> 14, var5 >> 14, var8, var21);
                        var4 += var18;
                        var5 += var17;
                        var2 += an;
                        var8 += var22;
                     }
                  } else {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var23[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bq(aw, var2, var10, 0, var6 >> 14, var4 >> 14, var8, var21);
                              var4 += var18;
                              var6 += var19;
                              var2 += an;
                              var8 += var22;
                           }
                        }

                        this.bq(aw, var2, var10, 0, var5 >> 14, var4 >> 14, var8, var21);
                        var4 += var18;
                        var5 += var17;
                        var2 += an;
                        var8 += var22;
                     }
                  }
               } else {
                  var6 = var5 <<= 14;
                  if (var2 < 0) {
                     var6 -= var18 * var2;
                     var5 -= var17 * var2;
                     var8 -= var22 * (float)var2;
                     var2 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var19 * var1;
                     var1 = 0;
                  }

                  if (var18 < var17) {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var23[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bq(aw, var2, var10, 0, var4 >> 14, var5 >> 14, var8, var21);
                              var4 += var19;
                              var5 += var17;
                              var2 += an;
                              var8 += var22;
                           }
                        }

                        this.bq(aw, var2, var10, 0, var6 >> 14, var5 >> 14, var8, var21);
                        var6 += var18;
                        var5 += var17;
                        var2 += an;
                        var8 += var22;
                     }
                  } else {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var23[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bq(aw, var2, var10, 0, var5 >> 14, var4 >> 14, var8, var21);
                              var4 += var19;
                              var5 += var17;
                              var2 += an;
                              var8 += var22;
                           }
                        }

                        this.bq(aw, var2, var10, 0, var5 >> 14, var6 >> 14, var8, var21);
                        var6 += var18;
                        var5 += var17;
                        var2 += an;
                        var8 += var22;
                     }
                  }
               }
            }
         } else if (var3 < var24) {
            if (var1 > var24) {
               var1 = var24;
            }

            if (var2 > var24) {
               var2 = var24;
            }

            var9 = var9 - var21 * (float)var6 + var21;
            if (var1 < var2) {
               var5 = var6 <<= 14;
               if (var3 < 0) {
                  var5 -= var17 * var3;
                  var6 -= var19 * var3;
                  var9 -= var22 * (float)var3;
                  var3 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var18 * var1;
                  var1 = 0;
               }

               if (var17 < var19) {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var23[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bq(aw, var3, var10, 0, var5 >> 14, var4 >> 14, var9, var21);
                           var5 += var17;
                           var4 += var18;
                           var3 += an;
                           var9 += var22;
                        }
                     }

                     this.bq(aw, var3, var10, 0, var5 >> 14, var6 >> 14, var9, var21);
                     var5 += var17;
                     var6 += var19;
                     var3 += an;
                     var9 += var22;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var23[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bq(aw, var3, var10, 0, var4 >> 14, var5 >> 14, var9, var21);
                           var5 += var17;
                           var4 += var18;
                           var3 += an;
                           var9 += var22;
                        }
                     }

                     this.bq(aw, var3, var10, 0, var6 >> 14, var5 >> 14, var9, var21);
                     var5 += var17;
                     var6 += var19;
                     var3 += an;
                     var9 += var22;
                  }
               }
            } else {
               var4 = var6 <<= 14;
               if (var3 < 0) {
                  var4 -= var17 * var3;
                  var6 -= var19 * var3;
                  var9 -= var22 * (float)var3;
                  var3 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var18 * var2;
                  var2 = 0;
               }

               if (var17 < var19) {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var23[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bq(aw, var3, var10, 0, var5 >> 14, var6 >> 14, var9, var21);
                           var5 += var18;
                           var6 += var19;
                           var3 += an;
                           var9 += var22;
                        }
                     }

                     this.bq(aw, var3, var10, 0, var4 >> 14, var6 >> 14, var9, var21);
                     var4 += var17;
                     var6 += var19;
                     var3 += an;
                     var9 += var22;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var23[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bq(aw, var3, var10, 0, var6 >> 14, var5 >> 14, var9, var21);
                           var5 += var18;
                           var6 += var19;
                           var3 += an;
                           var9 += var22;
                        }
                     }

                     this.bq(aw, var3, var10, 0, var6 >> 14, var4 >> 14, var9, var21);
                     var4 += var17;
                     var6 += var19;
                     var3 += an;
                     var9 += var22;
                  }
               }
            }
         }
      }
   }

   void an(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      int var13 = var5 - var4;
      int var14 = var2 - var1;
      int var15 = var6 - var4;
      int var16 = var3 - var1;
      int var17 = var11 - var10;
      int var18 = var12 - var10;
      float var19 = var8 - var7;
      float var20 = var9 - var7;
      int var21;
      if (var3 != var2) {
         var21 = (var6 - var5 << 14) / (var3 - var2);
      } else {
         var21 = 0;
      }

      int var22;
      if (var2 != var1) {
         var22 = (var13 << 14) / var14;
      } else {
         var22 = 0;
      }

      int var23;
      if (var3 != var1) {
         var23 = (var15 << 14) / var16;
      } else {
         var23 = 0;
      }

      int var24 = var13 * var16 - var15 * var14;
      if (var24 != 0) {
         int var25 = (var17 * var16 - var18 * var14 << 8) / var24;
         int var26 = (var18 * var13 - var17 * var15 << 8) / var24;
         float var27 = (var19 * (float)var16 - var20 * (float)var14) / (float)var24;
         float var28 = (var20 * (float)var13 - var19 * (float)var15) / (float)var24;
         int[] var29 = this.ar.ay;
         int var30 = this.ar.az;
         if (var1 <= var2 && var1 <= var3) {
            if (var1 < var30) {
               if (var2 > var30) {
                  var2 = var30;
               }

               if (var3 > var30) {
                  var3 = var30;
               }

               var10 = (var10 << 8) - var25 * var4 + var25;
               var7 = var7 - var27 * (float)var4 + var27;
               if (var2 < var3) {
                  var6 = var4 <<= 14;
                  if (var1 < 0) {
                     var6 -= var23 * var1;
                     var4 -= var22 * var1;
                     var10 -= var26 * var1;
                     var7 -= var28 * (float)var1;
                     var1 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var21 * var2;
                     var2 = 0;
                  }

                  if (var1 != var2 && var23 < var22 || var1 == var2 && var23 > var21) {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var29[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bt(aw, var1, 0, 0, var6 >> 14, var5 >> 14, var10, var25, var7, var27);
                              var6 += var23;
                              var5 += var21;
                              var10 += var26;
                              var1 += an;
                              var7 += var28;
                           }
                        }

                        this.bt(aw, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var25, var7, var27);
                        var6 += var23;
                        var4 += var22;
                        var10 += var26;
                        var1 += an;
                        var7 += var28;
                     }
                  } else {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var29[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bt(aw, var1, 0, 0, var5 >> 14, var6 >> 14, var10, var25, var7, var27);
                              var6 += var23;
                              var5 += var21;
                              var10 += var26;
                              var1 += an;
                              var7 += var28;
                           }
                        }

                        this.bt(aw, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var25, var7, var27);
                        var6 += var23;
                        var4 += var22;
                        var10 += var26;
                        var1 += an;
                        var7 += var28;
                     }
                  }
               } else {
                  var5 = var4 <<= 14;
                  if (var1 < 0) {
                     var5 -= var23 * var1;
                     var4 -= var22 * var1;
                     var10 -= var26 * var1;
                     var7 -= var28 * (float)var1;
                     var1 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var21 * var3;
                     var3 = 0;
                  }

                  if ((var1 == var3 || var23 >= var22) && (var1 != var3 || var21 <= var22)) {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var29[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bt(aw, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var25, var7, var27);
                              var6 += var21;
                              var4 += var22;
                              var10 += var26;
                              var1 += an;
                              var7 += var28;
                           }
                        }

                        this.bt(aw, var1, 0, 0, var4 >> 14, var5 >> 14, var10, var25, var7, var27);
                        var5 += var23;
                        var4 += var22;
                        var10 += var26;
                        var1 += an;
                        var7 += var28;
                     }
                  } else {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var29[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bt(aw, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var25, var7, var27);
                              var6 += var21;
                              var4 += var22;
                              var10 += var26;
                              var1 += an;
                              var7 += var28;
                           }
                        }

                        this.bt(aw, var1, 0, 0, var5 >> 14, var4 >> 14, var10, var25, var7, var27);
                        var5 += var23;
                        var4 += var22;
                        var10 += var26;
                        var1 += an;
                        var7 += var28;
                     }
                  }
               }
            }
         } else if (var2 <= var3) {
            if (var2 < var30) {
               if (var3 > var30) {
                  var3 = var30;
               }

               if (var1 > var30) {
                  var1 = var30;
               }

               var11 = (var11 << 8) - var25 * var5 + var25;
               var8 = var8 - var27 * (float)var5 + var27;
               if (var3 < var1) {
                  var4 = var5 <<= 14;
                  if (var2 < 0) {
                     var4 -= var22 * var2;
                     var5 -= var21 * var2;
                     var11 -= var26 * var2;
                     var8 -= var28 * (float)var2;
                     var2 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var23 * var3;
                     var3 = 0;
                  }

                  if (var2 != var3 && var22 < var21 || var2 == var3 && var22 > var23) {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var29[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bt(aw, var2, 0, 0, var4 >> 14, var6 >> 14, var11, var25, var8, var27);
                              var4 += var22;
                              var6 += var23;
                              var11 += var26;
                              var2 += an;
                              var8 += var28;
                           }
                        }

                        this.bt(aw, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var25, var8, var27);
                        var4 += var22;
                        var5 += var21;
                        var11 += var26;
                        var2 += an;
                        var8 += var28;
                     }
                  } else {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var29[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bt(aw, var2, 0, 0, var6 >> 14, var4 >> 14, var11, var25, var8, var27);
                              var4 += var22;
                              var6 += var23;
                              var11 += var26;
                              var2 += an;
                              var8 += var28;
                           }
                        }

                        this.bt(aw, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var25, var8, var27);
                        var4 += var22;
                        var5 += var21;
                        var11 += var26;
                        var2 += an;
                        var8 += var28;
                     }
                  }
               } else {
                  var6 = var5 <<= 14;
                  if (var2 < 0) {
                     var6 -= var22 * var2;
                     var5 -= var21 * var2;
                     var11 -= var26 * var2;
                     var8 -= var28 * (float)var2;
                     var2 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var23 * var1;
                     var1 = 0;
                  }

                  if (var22 < var21) {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var29[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bt(aw, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var25, var8, var27);
                              var4 += var23;
                              var5 += var21;
                              var11 += var26;
                              var2 += an;
                              var8 += var28;
                           }
                        }

                        this.bt(aw, var2, 0, 0, var6 >> 14, var5 >> 14, var11, var25, var8, var27);
                        var6 += var22;
                        var5 += var21;
                        var11 += var26;
                        var2 += an;
                        var8 += var28;
                     }
                  } else {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var29[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bt(aw, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var25, var8, var27);
                              var4 += var23;
                              var5 += var21;
                              var11 += var26;
                              var2 += an;
                              var8 += var28;
                           }
                        }

                        this.bt(aw, var2, 0, 0, var5 >> 14, var6 >> 14, var11, var25, var8, var27);
                        var6 += var22;
                        var5 += var21;
                        var11 += var26;
                        var2 += an;
                        var8 += var28;
                     }
                  }
               }
            }
         } else if (var3 < var30) {
            if (var1 > var30) {
               var1 = var30;
            }

            if (var2 > var30) {
               var2 = var30;
            }

            var12 = (var12 << 8) - var25 * var6 + var25;
            var9 = var9 - var27 * (float)var6 + var27;
            if (var1 < var2) {
               var5 = var6 <<= 14;
               if (var3 < 0) {
                  var5 -= var21 * var3;
                  var6 -= var23 * var3;
                  var12 -= var26 * var3;
                  var9 -= var28 * (float)var3;
                  var3 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var22 * var1;
                  var1 = 0;
               }

               if (var21 < var23) {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var29[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bt(aw, var3, 0, 0, var5 >> 14, var4 >> 14, var12, var25, var9, var27);
                           var5 += var21;
                           var4 += var22;
                           var12 += var26;
                           var3 += an;
                           var9 += var28;
                        }
                     }

                     this.bt(aw, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var25, var9, var27);
                     var5 += var21;
                     var6 += var23;
                     var12 += var26;
                     var3 += an;
                     var9 += var28;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var29[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bt(aw, var3, 0, 0, var4 >> 14, var5 >> 14, var12, var25, var9, var27);
                           var5 += var21;
                           var4 += var22;
                           var12 += var26;
                           var3 += an;
                           var9 += var28;
                        }
                     }

                     this.bt(aw, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var25, var9, var27);
                     var5 += var21;
                     var6 += var23;
                     var12 += var26;
                     var3 += an;
                     var9 += var28;
                  }
               }
            } else {
               var4 = var6 <<= 14;
               if (var3 < 0) {
                  var4 -= var21 * var3;
                  var6 -= var23 * var3;
                  var12 -= var26 * var3;
                  var9 -= var28 * (float)var3;
                  var3 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var22 * var2;
                  var2 = 0;
               }

               if (var21 < var23) {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var29[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bt(aw, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var25, var9, var27);
                           var5 += var22;
                           var6 += var23;
                           var12 += var26;
                           var3 += an;
                           var9 += var28;
                        }
                     }

                     this.bt(aw, var3, 0, 0, var4 >> 14, var6 >> 14, var12, var25, var9, var27);
                     var4 += var21;
                     var6 += var23;
                     var12 += var26;
                     var3 += an;
                     var9 += var28;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var29[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bt(aw, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var25, var9, var27);
                           var5 += var22;
                           var6 += var23;
                           var12 += var26;
                           var3 += an;
                           var9 += var28;
                        }
                     }

                     this.bt(aw, var3, 0, 0, var6 >> 14, var4 >> 14, var12, var25, var9, var27);
                     var4 += var21;
                     var6 += var23;
                     var12 += var26;
                     var3 += an;
                     var9 += var28;
                  }
               }
            }
         }
      }
   }

   final void dv(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, float var10, float var11, int var12, int var13, int var14, int var15, int var16, int var17) {
      if (this.ar.ac) {
         if (var7 > this.ar.ab) {
            var7 = this.ar.ab;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         var10 += var11 * (float)var6;
         int var20 = var7 - var6;
         int var10000;
         int var18;
         int var19;
         int var21;
         int var22;
         int var23;
         int var24;
         int var25;
         int var26;
         if (this.ae) {
            var26 = var6 - this.ar.ah;
            var12 += (var15 >> 3) * var26;
            var13 += (var16 >> 3) * var26;
            var14 += (var17 >> 3) * var26;
            var25 = var14 >> 12;
            if (var25 != 0) {
               var21 = var12 / var25;
               var22 = var13 / var25;
               if (var21 < 0) {
                  var21 = 0;
               } else if (var21 > 4032) {
                  var21 = -1055569503;
               }
            } else {
               var21 = 0;
               var22 = 0;
            }

            var12 += var15;
            var13 += var16;
            var14 += var17;
            var25 = var14 >> 12;
            if (var25 != 0) {
               var23 = var12 / var25;
               var24 = var13 / var25;
               if (var23 < 0) {
                  var23 = 0;
               } else if (var23 > -970883523) {
                  var23 = 4032;
               }
            } else {
               var23 = 0;
               var24 = 0;
            }

            var3 = (var21 << 20) + var22;
            var19 = (var23 - var21 >> 3 << 20) + (var24 - var22 >> 3);
            var20 >>= 3;
            var9 <<= 3;
            var18 = var8 >> 8;
            if (this.ac) {
               if (var20 > 0) {
                  do {
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var10000 = var3 + var19;
                     var10 += var11;
                     var21 = var23;
                     var22 = var24;
                     var12 += var15;
                     var13 += var16;
                     var14 += var17;
                     var25 = var14 >> 12;
                     if (var25 != 0) {
                        var23 = var12 / var25;
                        var24 = var13 / var25;
                        if (var23 < 0) {
                           var23 = 0;
                        } else if (var23 > -231569026) {
                           var23 = 794218965;
                        }
                     } else {
                        var23 = 0;
                        var24 = 0;
                     }

                     var3 = (var21 << 20) + var22;
                     var19 = (var23 - var21 >> 3 << 20) + (var24 - var22 >> 3);
                     var8 += var9;
                     var18 = var8 >> 8;
                     --var20;
                  } while(var20 > 0);
               }

               var20 = var7 - var6 & 7;
               if (var20 > 0) {
                  do {
                     be(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     --var20;
                  } while(var20 > 0);
               }
            } else {
               if (var20 > 0) {
                  do {
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var10000 = var3 + var19;
                     var10 += var11;
                     var21 = var23;
                     var22 = var24;
                     var12 += var15;
                     var13 += var16;
                     var14 += var17;
                     var25 = var14 >> 12;
                     if (var25 != 0) {
                        var23 = var12 / var25;
                        var24 = var13 / var25;
                        if (var23 < 0) {
                           var23 = 0;
                        } else if (var23 > 4032) {
                           var23 = 4032;
                        }
                     } else {
                        var23 = 0;
                        var24 = 0;
                     }

                     var3 = (var21 << 20) + var22;
                     var19 = (var23 - var21 >> 3 << 20) + (var24 - var22 >> 3);
                     var8 += var9;
                     var18 = var8 >> 8;
                     --var20;
                  } while(var20 > 0);
               }

               var20 = var7 - var6 & 7;
               if (var20 > 0) {
                  do {
                     bc(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     --var20;
                  } while(var20 > 0);
               }
            }
         } else {
            var26 = var6 - this.ar.ah;
            var12 += (var15 >> 3) * var26;
            var13 += (var16 >> 3) * var26;
            var14 += (var17 >> 3) * var26;
            var25 = var14 >> 14;
            if (var25 != 0) {
               var21 = var12 / var25;
               var22 = var13 / var25;
               if (var21 < 0) {
                  var21 = 0;
               } else if (var21 > 16256) {
                  var21 = 1935725930;
               }
            } else {
               var21 = 0;
               var22 = 0;
            }

            var12 += var15;
            var13 += var16;
            var14 += var17;
            var25 = var14 >> 14;
            if (var25 != 0) {
               var23 = var12 / var25;
               var24 = var13 / var25;
               if (var23 < 0) {
                  var23 = 0;
               } else if (var23 > -1741492172) {
                  var23 = -1310978590;
               }
            } else {
               var23 = 0;
               var24 = 0;
            }

            var3 = (var21 << 18) + var22;
            var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
            var20 >>= 3;
            var9 <<= 3;
            var18 = var8 >> 8;
            if (this.ac) {
               if (var20 > 0) {
                  do {
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var10000 = var3 + var19;
                     var10 += var11;
                     var21 = var23;
                     var22 = var24;
                     var12 += var15;
                     var13 += var16;
                     var14 += var17;
                     var25 = var14 >> 14;
                     if (var25 != 0) {
                        var23 = var12 / var25;
                        var24 = var13 / var25;
                        if (var23 < 0) {
                           var23 = 0;
                        } else if (var23 > 16256) {
                           var23 = 16256;
                        }
                     } else {
                        var23 = 0;
                        var24 = 0;
                     }

                     var3 = (var21 << 18) + var22;
                     var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
                     var8 += var9;
                     var18 = var8 >> 8;
                     --var20;
                  } while(var20 > 0);
               }

               var20 = var7 - var6 & 7;
               if (var20 > 0) {
                  do {
                     cn(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     --var20;
                  } while(var20 > 0);
               }
            } else {
               if (var20 > 0) {
                  do {
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var10000 = var3 + var19;
                     var10 += var11;
                     var21 = var23;
                     var22 = var24;
                     var12 += var15;
                     var13 += var16;
                     var14 += var17;
                     var25 = var14 >> 14;
                     if (var25 != 0) {
                        var23 = var12 / var25;
                        var24 = var13 / var25;
                        if (var23 < 0) {
                           var23 = 0;
                        } else if (var23 > -1681982774) {
                           var23 = 16256;
                        }
                     } else {
                        var23 = 0;
                        var24 = 0;
                     }

                     var3 = (var21 << 18) + var22;
                     var19 = (var23 - var21 >> 3 << 18) + (var24 - var22 >> 3);
                     var8 += var9;
                     var18 = var8 >> 8;
                     --var20;
                  } while(var20 > 0);
               }

               var20 = var7 - var6 & 7;
               if (var20 > 0) {
                  do {
                     ch(var1, bn, var2, var5, var18, var3, var10);
                     ++var5;
                     var3 += var19;
                     var10 += var11;
                     --var20;
                  } while(var20 > 0);
               }
            }
         }

      }
   }

   void au(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.ar.af.ag(var22, 573791932);
      int var24;
      if (var23 == null) {
         var24 = this.ar.af.am(var22, -2009498990);
         this.aq(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var24, var10), ag(var24, var11), ag(var24, var12));
      } else {
         this.ae = this.ar.af.aq(var22, 1861009556);
         this.ac = this.ar.af.ax(var22, (byte)51);
         var24 = var5 - var4;
         int var25 = var2 - var1;
         int var26 = var6 - var4;
         int var27 = var3 - var1;
         int var28 = var11 - var10;
         int var29 = var12 - var10;
         int var30 = 0;
         if (var2 != var1) {
            var30 = (var5 - var4 << 14) / (var2 - var1);
         }

         int var31 = 0;
         if (var3 != var2) {
            var31 = (var6 - var5 << 14) / (var3 - var2);
         }

         int var32 = 0;
         if (var3 != var1) {
            var32 = (var4 - var6 << 14) / (var1 - var3);
         }

         int var33 = var24 * var27 - var26 * var25;
         if (var33 != 0) {
            int var34 = (var28 * var27 - var29 * var25 << 9) / var33;
            int var35 = (var29 * var24 - var28 * var26 << 9) / var33;
            float var36 = var8 - var7;
            float var37 = var9 - var7;
            float var38 = (var36 * (float)var27 - var37 * (float)var25) / (float)var33;
            float var39 = (var37 * (float)var24 - var36 * (float)var26) / (float)var33;
            int var40 = this.ar.aq;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var41 = var15 * var16 - var18 * var13 << 14;
            int var42 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / (long)var40);
            int var43 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var40);
            int var44 = var14 * var16 - var17 * var13 << 14;
            int var45 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / (long)var40);
            int var46 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var40);
            int var47 = var17 * var15 - var14 * var18 << 14;
            int var48 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / (long)var40);
            int var49 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var40);
            int[] var50 = this.ar.ay;
            int var51 = this.ar.az;
            int var52;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < var51) {
                  if (var2 > var51) {
                     var2 = var51;
                  }

                  if (var3 > var51) {
                     var3 = var51;
                  }

                  var10 = (var10 << 9) - var34 * var4 + var34;
                  var7 = var7 - var38 * (float)var4 + var38;
                  if (var2 < var3) {
                     var6 = var4 <<= 14;
                     if (var1 < 0) {
                        var6 -= var32 * var1;
                        var4 -= var30 * var1;
                        var7 -= var39 * (float)var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var31 * var2;
                        var2 = 0;
                     }

                     var52 = var1 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if ((var1 == var2 || var32 >= var30) && (var1 != var2 || var32 <= var31)) {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var32 * var1;
                        var4 -= var30 * var1;
                        var7 -= var39 * (float)var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var31 * var3;
                        var3 = 0;
                     }

                     var52 = var1 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var1 != var3 && var32 < var30 || var1 == var3 && var31 > var30) {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var50[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var7 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var7, var38, var41, var44, var47, var42, var45, var48);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var7 += var39;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < var51) {
                  if (var3 > var51) {
                     var3 = var51;
                  }

                  if (var1 > var51) {
                     var1 = var51;
                  }

                  var11 = (var11 << 9) - var34 * var5 + var34;
                  var8 = var8 - var38 * (float)var5 + var38;
                  if (var3 < var1) {
                     var4 = var5 <<= 14;
                     if (var2 < 0) {
                        var4 -= var30 * var2;
                        var5 -= var31 * var2;
                        var8 -= var39 * (float)var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var32 * var3;
                        var3 = 0;
                     }

                     var52 = var2 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if ((var2 == var3 || var30 >= var31) && (var2 != var3 || var30 <= var32)) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     }
                  } else {
                     var6 = var5 <<= 14;
                     if (var2 < 0) {
                        var6 -= var30 * var2;
                        var5 -= var31 * var2;
                        var8 -= var39 * (float)var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var32 * var1;
                        var1 = 0;
                     }

                     var52 = var2 - this.ar.ap;
                     var41 += var43 * var52;
                     var44 += var46 * var52;
                     var47 += var49 * var52;
                     if (var30 < var31) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var50[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.cu(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var41 += var43;
                                 var44 += var46;
                                 var47 += var49;
                                 var8 += var39;
                              }
                           }

                           this.cu(aw, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var8, var38, var41, var44, var47, var42, var45, var48);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
                           var41 += var43;
                           var44 += var46;
                           var47 += var49;
                           var8 += var39;
                        }
                     }
                  }
               }
            } else if (var3 < var51) {
               if (var1 > var51) {
                  var1 = var51;
               }

               if (var2 > var51) {
                  var2 = var51;
               }

               var12 = (var12 << 9) - var34 * var6 + var34;
               var9 = var9 - var38 * (float)var6 + var38;
               if (var1 < var2) {
                  var5 = var6 <<= 14;
                  if (var3 < 0) {
                     var5 -= var31 * var3;
                     var6 -= var32 * var3;
                     var9 -= var39 * (float)var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var30 * var1;
                     var1 = 0;
                  }

                  var52 = var3 - this.ar.ap;
                  var41 += var43 * var52;
                  var44 += var46 * var52;
                  var47 += var49 * var52;
                  if (var31 < var32) {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.cu(aw, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cu(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.cu(aw, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cu(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  }
               } else {
                  var4 = var6 <<= 14;
                  if (var3 < 0) {
                     var4 -= var31 * var3;
                     var6 -= var32 * var3;
                     var9 -= var39 * (float)var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var30 * var2;
                     var2 = 0;
                  }

                  var52 = var3 - this.ar.ap;
                  var41 += var43 * var52;
                  var44 += var46 * var52;
                  var47 += var49 * var52;
                  if (var31 < var32) {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.cu(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cu(aw, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var50[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.cu(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var41 += var43;
                              var44 += var46;
                              var47 += var49;
                              var9 += var39;
                           }
                        }

                        this.cu(aw, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var9, var38, var41, var44, var47, var42, var45, var48);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
                        var41 += var43;
                        var44 += var46;
                        var47 += var49;
                        var9 += var39;
                     }
                  }
               }
            }
         }
      }
   }
}
