public class jh extends jl {
   void as(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10) {
      int var11 = 0;
      if (var2 != var1) {
         var11 = (var5 - var4 << 14) / (var2 - var1);
      }

      int var12 = 0;
      if (var3 != var2) {
         var12 = (var6 - var5 << 14) / (var3 - var2);
      }

      int var13 = 0;
      if (var3 != var1) {
         var13 = (var4 - var6 << 14) / (var1 - var3);
      }

      int[] var14 = this.at.av;
      int var15 = this.at.ab;
      if (var1 <= var2 && var1 <= var3) {
         if (var1 < var15) {
            if (var2 > var15) {
               var2 = var15;
            }

            if (var3 > var15) {
               var3 = var15;
            }

            if (var2 < var3) {
               var6 = var4 <<= 14;
               if (var1 < 0) {
                  var6 -= var13 * var1;
                  var4 -= var11 * var1;
                  var1 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var12 * var2;
                  var2 = 0;
               }

               if (var1 != var2 && var13 < var11 || var1 == var2 && var13 > var12) {
                  var3 -= var2;
                  var2 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bg(al, var1, var10, 0, var6 >> 14, var5 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += aa;
                        }
                     }

                     this.bg(al, var1, var10, 0, var6 >> 14, var4 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += aa;
                  }
               } else {
                  var3 -= var2;
                  var2 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bg(al, var1, var10, 0, var5 >> 14, var6 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += aa;
                        }
                     }

                     this.bg(al, var1, var10, 0, var4 >> 14, var6 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += aa;
                  }
               }
            } else {
               var5 = var4 <<= 14;
               if (var1 < 0) {
                  var5 -= var13 * var1;
                  var4 -= var11 * var1;
                  var1 = 0;
               }

               var6 <<= 14;
               if (var3 < 0) {
                  var6 -= var12 * var3;
                  var3 = 0;
               }

               if ((var1 == var3 || var13 >= var11) && (var1 != var3 || var12 <= var11)) {
                  var2 -= var3;
                  var3 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bg(al, var1, var10, 0, var4 >> 14, var6 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += aa;
                        }
                     }

                     this.bg(al, var1, var10, 0, var4 >> 14, var5 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += aa;
                  }
               } else {
                  var2 -= var3;
                  var3 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bg(al, var1, var10, 0, var6 >> 14, var4 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += aa;
                        }
                     }

                     this.bg(al, var1, var10, 0, var5 >> 14, var4 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += aa;
                  }
               }
            }
         }
      } else if (var2 <= var3) {
         if (var2 < var15) {
            if (var3 > var15) {
               var3 = var15;
            }

            if (var1 > var15) {
               var1 = var15;
            }

            if (var3 < var1) {
               var4 = var5 <<= 14;
               if (var2 < 0) {
                  var4 -= var11 * var2;
                  var5 -= var12 * var2;
                  var2 = 0;
               }

               var6 <<= 14;
               if (var3 < 0) {
                  var6 -= var13 * var3;
                  var3 = 0;
               }

               if (var2 != var3 && var11 < var12 || var2 == var3 && var11 > var13) {
                  var1 -= var3;
                  var3 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bg(al, var2, var10, 0, var4 >> 14, var6 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += aa;
                        }
                     }

                     this.bg(al, var2, var10, 0, var4 >> 14, var5 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += aa;
                  }
               } else {
                  var1 -= var3;
                  var3 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bg(al, var2, var10, 0, var6 >> 14, var4 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += aa;
                        }
                     }

                     this.bg(al, var2, var10, 0, var5 >> 14, var4 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += aa;
                  }
               }
            } else {
               var6 = var5 <<= 14;
               if (var2 < 0) {
                  var6 -= var11 * var2;
                  var5 -= var12 * var2;
                  var2 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var13 * var1;
                  var1 = 0;
               }

               if (var11 < var12) {
                  var3 -= var1;
                  var1 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bg(al, var2, var10, 0, var4 >> 14, var5 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += aa;
                        }
                     }

                     this.bg(al, var2, var10, 0, var6 >> 14, var5 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += aa;
                  }
               } else {
                  var3 -= var1;
                  var1 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bg(al, var2, var10, 0, var5 >> 14, var4 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += aa;
                        }
                     }

                     this.bg(al, var2, var10, 0, var5 >> 14, var6 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += aa;
                  }
               }
            }
         }
      } else if (var3 < var15) {
         if (var1 > var15) {
            var1 = var15;
         }

         if (var2 > var15) {
            var2 = var15;
         }

         if (var1 < var2) {
            var5 = var6 <<= 14;
            if (var3 < 0) {
               var5 -= var12 * var3;
               var6 -= var13 * var3;
               var3 = 0;
            }

            var4 <<= 14;
            if (var1 < 0) {
               var4 -= var11 * var1;
               var1 = 0;
            }

            if (var12 < var13) {
               var2 -= var1;
               var1 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        this.bg(al, var3, var10, 0, var5 >> 14, var4 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += aa;
                     }
                  }

                  this.bg(al, var3, var10, 0, var5 >> 14, var6 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += aa;
               }
            } else {
               var2 -= var1;
               var1 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        this.bg(al, var3, var10, 0, var4 >> 14, var5 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += aa;
                     }
                  }

                  this.bg(al, var3, var10, 0, var6 >> 14, var5 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += aa;
               }
            }
         } else {
            var4 = var6 <<= 14;
            if (var3 < 0) {
               var4 -= var12 * var3;
               var6 -= var13 * var3;
               var3 = 0;
            }

            var5 <<= 14;
            if (var2 < 0) {
               var5 -= var11 * var2;
               var2 = 0;
            }

            if (var12 < var13) {
               var1 -= var2;
               var2 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        this.bg(al, var3, var10, 0, var5 >> 14, var6 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += aa;
                     }
                  }

                  this.bg(al, var3, var10, 0, var4 >> 14, var6 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += aa;
               }
            } else {
               var1 -= var2;
               var2 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        this.bg(al, var3, var10, 0, var6 >> 14, var5 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += aa;
                     }
                  }

                  this.bg(al, var3, var10, 0, var6 >> 14, var4 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += aa;
               }
            }
         }
      }
   }

   jh(ky var1) {
      super(var1);
   }

   final void bf(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.at.ap) {
         if (var6 > this.at.ar) {
            var6 = this.at.ar;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var7 += var8 * var5;
         int var9;
         int var10;
         int var11;
         int var12;
         if (this.at.aw) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.at.ak == 0) {
               if (var4 > 0) {
                  do {
                     var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.am[var9];
                     var7 += var8;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.am[var9];

                  do {
                     var1[var2++] = var3;
                     --var4;
                  } while(var4 > 0);
               }
            } else {
               var9 = this.at.ak;
               var10 = 256 - this.at.ak;
               if (var4 > 0) {
                  do {
                     var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.am[var11];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.am[var11];
                  var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');

                  do {
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     --var4;
                  } while(var4 > 0);
               }
            }

         } else {
            var4 = var6 - var5;
            if (this.at.ak == 0) {
               do {
                  var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var1[var2++] = this.am[var9];
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            } else {
               var9 = this.at.ak;
               var10 = 256 - this.at.ak;

               do {
                  var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.am[var11];
                  var7 += var8;
                  var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');
                  var12 = var1[var2];
                  var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                  --var4;
               } while(var4 > 0);
            }

         }
      }
   }

   void ci(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.at.ap) {
         if (var6 > this.at.ar) {
            var6 = this.at.ar;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var4 = var6 - var5 >> 2;
         if (this.at.ak != 0) {
            if (this.at.ak == 254) {
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
               int var7 = this.at.ak;
               int var8 = 256 - this.at.ak;
               var3 = ((var3 & 16711935) * var8 >> 8 & 16711935) + ((var3 & '\uff00') * var8 >> 8 & '\uff00');

               while(true) {
                  --var4;
                  int var9;
                  if (var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if (var4 < 0) {
                           return;
                        }

                        var9 = var1[var2];
                        var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & '\uff00') * var7 >> 8 & '\uff00');
                     }
                  }

                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & '\uff00') * var7 >> 8 & '\uff00');
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & '\uff00') * var7 >> 8 & '\uff00');
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & '\uff00') * var7 >> 8 & '\uff00');
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & '\uff00') * var7 >> 8 & '\uff00');
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

                     var1[var2++] = var3;
                  }
               }

               var1[var2++] = var3;
               var1[var2++] = var3;
               var1[var2++] = var3;
               var1[var2++] = var3;
            }
         }
      }
   }

   void ay(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      int var13 = var5 - var4;
      int var14 = var2 - var1;
      int var15 = var6 - var4;
      int var16 = var3 - var1;
      int var17 = var11 - var10;
      int var18 = var12 - var10;
      int var19;
      if (var3 != var2) {
         var19 = (var6 - var5 << 14) / (var3 - var2);
      } else {
         var19 = 0;
      }

      int var20;
      if (var2 != var1) {
         var20 = (var13 << 14) / var14;
      } else {
         var20 = 0;
      }

      int var21;
      if (var3 != var1) {
         var21 = (var15 << 14) / var16;
      } else {
         var21 = 0;
      }

      int var22 = var13 * var16 - var15 * var14;
      if (var22 != 0) {
         int var23 = (var17 * var16 - var18 * var14 << 8) / var22;
         int var24 = (var18 * var13 - var17 * var15 << 8) / var22;
         int[] var25 = this.at.av;
         int var26 = this.at.ab;
         if (var1 <= var2 && var1 <= var3) {
            if (var1 < var26) {
               if (var2 > var26) {
                  var2 = var26;
               }

               if (var3 > var26) {
                  var3 = var26;
               }

               var10 = (var10 << 8) - var23 * var4 + var23;
               if (var2 < var3) {
                  var6 = var4 <<= 14;
                  if (var1 < 0) {
                     var6 -= var21 * var1;
                     var4 -= var20 * var1;
                     var10 -= var24 * var1;
                     var1 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var19 * var2;
                     var2 = 0;
                  }

                  if (var1 != var2 && var21 < var20 || var1 == var2 && var21 > var19) {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bf(al, var1, 0, 0, var6 >> 14, var5 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += aa;
                           }
                        }

                        this.bf(al, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += aa;
                     }
                  } else {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bf(al, var1, 0, 0, var5 >> 14, var6 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += aa;
                           }
                        }

                        this.bf(al, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += aa;
                     }
                  }
               } else {
                  var5 = var4 <<= 14;
                  if (var1 < 0) {
                     var5 -= var21 * var1;
                     var4 -= var20 * var1;
                     var10 -= var24 * var1;
                     var1 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var19 * var3;
                     var3 = 0;
                  }

                  if ((var1 == var3 || var21 >= var20) && (var1 != var3 || var19 <= var20)) {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bf(al, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += aa;
                           }
                        }

                        this.bf(al, var1, 0, 0, var4 >> 14, var5 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += aa;
                     }
                  } else {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bf(al, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += aa;
                           }
                        }

                        this.bf(al, var1, 0, 0, var5 >> 14, var4 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += aa;
                     }
                  }
               }
            }
         } else if (var2 <= var3) {
            if (var2 < var26) {
               if (var3 > var26) {
                  var3 = var26;
               }

               if (var1 > var26) {
                  var1 = var26;
               }

               var11 = (var11 << 8) - var23 * var5 + var23;
               if (var3 < var1) {
                  var4 = var5 <<= 14;
                  if (var2 < 0) {
                     var4 -= var20 * var2;
                     var5 -= var19 * var2;
                     var11 -= var24 * var2;
                     var2 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var21 * var3;
                     var3 = 0;
                  }

                  if (var2 != var3 && var20 < var19 || var2 == var3 && var20 > var21) {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bf(al, var2, 0, 0, var4 >> 14, var6 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += aa;
                           }
                        }

                        this.bf(al, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += aa;
                     }
                  } else {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bf(al, var2, 0, 0, var6 >> 14, var4 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += aa;
                           }
                        }

                        this.bf(al, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += aa;
                     }
                  }
               } else {
                  var6 = var5 <<= 14;
                  if (var2 < 0) {
                     var6 -= var20 * var2;
                     var5 -= var19 * var2;
                     var11 -= var24 * var2;
                     var2 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var21 * var1;
                     var1 = 0;
                  }

                  if (var20 < var19) {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bf(al, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += aa;
                           }
                        }

                        this.bf(al, var2, 0, 0, var6 >> 14, var5 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += aa;
                     }
                  } else {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bf(al, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += aa;
                           }
                        }

                        this.bf(al, var2, 0, 0, var5 >> 14, var6 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += aa;
                     }
                  }
               }
            }
         } else if (var3 < var26) {
            if (var1 > var26) {
               var1 = var26;
            }

            if (var2 > var26) {
               var2 = var26;
            }

            var12 = (var12 << 8) - var23 * var6 + var23;
            if (var1 < var2) {
               var5 = var6 <<= 14;
               if (var3 < 0) {
                  var5 -= var19 * var3;
                  var6 -= var21 * var3;
                  var12 -= var24 * var3;
                  var3 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var20 * var1;
                  var1 = 0;
               }

               if (var19 < var21) {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bf(al, var3, 0, 0, var5 >> 14, var4 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += aa;
                        }
                     }

                     this.bf(al, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += aa;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bf(al, var3, 0, 0, var4 >> 14, var5 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += aa;
                        }
                     }

                     this.bf(al, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += aa;
                  }
               }
            } else {
               var4 = var6 <<= 14;
               if (var3 < 0) {
                  var4 -= var19 * var3;
                  var6 -= var21 * var3;
                  var12 -= var24 * var3;
                  var3 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var20 * var2;
                  var2 = 0;
               }

               if (var19 < var21) {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bf(al, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += aa;
                        }
                     }

                     this.bf(al, var3, 0, 0, var4 >> 14, var6 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += aa;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bf(al, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += aa;
                        }
                     }

                     this.bf(al, var3, 0, 0, var6 >> 14, var4 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += aa;
                  }
               }
            }
         }
      }
   }

   void ae(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.at.as.ak(var22, (byte)-22);
      int var24;
      if (var23 == null) {
         var24 = this.at.as.aj(var22, (byte)-39);
         this.ay(var1, var2, var3, var4, var5, var6, var7, var8, var9, ak(var24, var10), ak(var24, var11), ak(var24, var12));
      } else {
         this.aw = this.at.as.ay(var22, (byte)23);
         this.ap = this.at.as.ai(var22, (byte)33);
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
            int var36 = this.at.ay;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var37 = var15 * var16 - var18 * var13 << 14;
            int var38 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / (long)var36);
            int var39 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var36);
            int var40 = var14 * var16 - var17 * var13 << 14;
            int var41 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / (long)var36);
            int var42 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var36);
            int var43 = var17 * var15 - var14 * var18 << 14;
            int var44 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / (long)var36);
            int var45 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var36);
            int[] var46 = this.at.av;
            int var47 = this.at.ab;
            int var48;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < var47) {
                  if (var2 > var47) {
                     var2 = var47;
                  }

                  if (var3 > var47) {
                     var3 = var47;
                  }

                  var10 = (var10 << 9) - var34 * var4 + var34;
                  if (var2 < var3) {
                     var6 = var4 <<= 14;
                     if (var1 < 0) {
                        var6 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var31 * var2;
                        var2 = 0;
                     }

                     var48 = var1 - this.at.af;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var1 != var2 && var32 < var30 || var1 == var2 && var32 > var31) {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var31 * var3;
                        var3 = 0;
                     }

                     var48 = var1 - this.at.af;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if ((var1 == var3 || var32 >= var30) && (var1 != var3 || var31 <= var30)) {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < var47) {
                  if (var3 > var47) {
                     var3 = var47;
                  }

                  if (var1 > var47) {
                     var1 = var47;
                  }

                  var11 = (var11 << 9) - var34 * var5 + var34;
                  if (var3 < var1) {
                     var4 = var5 <<= 14;
                     if (var2 < 0) {
                        var4 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var32 * var3;
                        var3 = 0;
                     }

                     var48 = var2 - this.at.af;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var2 != var3 && var30 < var31 || var2 == var3 && var30 > var32) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var6 = var5 <<= 14;
                     if (var2 < 0) {
                        var6 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var32 * var1;
                        var1 = 0;
                     }

                     var48 = var2 - this.at.af;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var30 < var31) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var3 < var47) {
               if (var1 > var47) {
                  var1 = var47;
               }

               if (var2 > var47) {
                  var2 = var47;
               }

               var12 = (var12 << 9) - var34 * var6 + var34;
               if (var1 < var2) {
                  var5 = var6 <<= 14;
                  if (var3 < 0) {
                     var5 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var30 * var1;
                     var1 = 0;
                  }

                  var48 = var3 - this.at.af;
                  var37 += var39 * var48;
                  var40 += var42 * var48;
                  var43 += var45 * var48;
                  if (var31 < var32) {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bl(al, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bl(al, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bl(al, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bl(al, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               } else {
                  var4 = var6 <<= 14;
                  if (var3 < 0) {
                     var4 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var30 * var2;
                     var2 = 0;
                  }

                  var48 = var3 - this.at.af;
                  var37 += var39 * var48;
                  var40 += var42 * var48;
                  var43 += var45 * var48;
                  if (var31 < var32) {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bl(al, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bl(al, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bl(al, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bl(al, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               }
            }
         }
      }
   }

   void cp(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      if (this.at.ap) {
         if (var7 > this.at.ar) {
            var7 = this.at.ar;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var16;
         int var17;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var24;
         if (this.aw) {
            var24 = var6 - this.at.ao;
            var10 += var13 * var24;
            var11 += var14 * var24;
            var12 += var15 * var24;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13 * var18;
            var11 += var14 * var18;
            var12 += var15 * var18;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 20) + var20;
            var17 = ((var21 - var19) / var18 << 20) + (var22 - var20) / var18;
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.ap) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         } else {
            var24 = var6 - this.at.ao;
            var10 += var13 * var24;
            var11 += var14 * var24;
            var12 += var15 * var24;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13 * var18;
            var11 += var14 * var18;
            var12 += var15 * var18;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 18) + var20;
            var17 = ((var21 - var19) / var18 << 18) + (var22 - var20) / var18;
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.ap) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         }

      }
   }

   void am(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.at.as.ak(var22, (byte)26);
      int var24;
      if (var23 == null) {
         var24 = this.at.as.aj(var22, (byte)-10);
         this.ay(var1, var2, var3, var4, var5, var6, var7, var8, var9, ak(var24, var10), ak(var24, var11), ak(var24, var12));
      } else {
         this.aw = this.at.as.ay(var22, (byte)23);
         this.ap = this.at.as.ai(var22, (byte)3);
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
            int var36 = this.at.ay;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var37 = var15 * var16 - var18 * var13 << 14;
            int var38 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / (long)var36);
            int var39 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var36);
            int var40 = var14 * var16 - var17 * var13 << 14;
            int var41 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / (long)var36);
            int var42 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var36);
            int var43 = var17 * var15 - var14 * var18 << 14;
            int var44 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / (long)var36);
            int var45 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var36);
            int[] var46 = this.at.av;
            int var47 = this.at.ab;
            int var48 = this.at.af;
            int var49;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < var47) {
                  if (var2 > var47) {
                     var2 = var47;
                  }

                  if (var3 > var47) {
                     var3 = var47;
                  }

                  var10 = (var10 << 9) - var34 * var4 + var34;
                  if (var2 < var3) {
                     var6 = var4 <<= 14;
                     if (var1 < 0) {
                        var6 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var31 * var2;
                        var2 = 0;
                     }

                     var49 = var1 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if (var1 != var2 && var32 < var30 || var1 == var2 && var32 > var31) {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var31 * var3;
                        var3 = 0;
                     }

                     var49 = var1 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if ((var1 == var3 || var32 >= var30) && (var1 != var3 || var31 <= var30)) {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < var47) {
                  if (var3 > var47) {
                     var3 = var47;
                  }

                  if (var1 > var47) {
                     var1 = var47;
                  }

                  var11 = (var11 << 9) - var34 * var5 + var34;
                  if (var3 < var1) {
                     var4 = var5 <<= 14;
                     if (var2 < 0) {
                        var4 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var32 * var3;
                        var3 = 0;
                     }

                     var49 = var2 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if (var2 != var3 && var30 < var31 || var2 == var3 && var30 > var32) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var6 = var5 <<= 14;
                     if (var2 < 0) {
                        var6 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var32 * var1;
                        var1 = 0;
                     }

                     var49 = var2 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if (var30 < var31) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var3 < var47) {
               if (var1 > var47) {
                  var1 = var47;
               }

               if (var2 > var47) {
                  var2 = var47;
               }

               var12 = (var12 << 9) - var34 * var6 + var34;
               if (var1 < var2) {
                  var5 = var6 <<= 14;
                  if (var3 < 0) {
                     var5 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var30 * var1;
                     var1 = 0;
                  }

                  var49 = var3 - var48;
                  var37 += var39 * var49;
                  var40 += var42 * var49;
                  var43 += var45 * var49;
                  if (var31 < var32) {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.be(al, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.be(al, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.be(al, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.be(al, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               } else {
                  var4 = var6 <<= 14;
                  if (var3 < 0) {
                     var4 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var30 * var2;
                     var2 = 0;
                  }

                  var49 = var3 - var48;
                  var37 += var39 * var49;
                  var40 += var42 * var49;
                  var43 += var45 * var49;
                  if (var31 < var32) {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.be(al, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.be(al, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.be(al, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.be(al, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               }
            }
         }
      }
   }

   void be(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      if (this.at.ap) {
         if (var7 > this.at.ar) {
            var7 = this.at.ar;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var16;
         int var17;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var24;
         if (this.aw) {
            var24 = var6 - this.at.ao;
            var10 += var13 * var24;
            var11 += var14 * var24;
            var12 += var15 * var24;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13 * var18;
            var11 += var14 * var18;
            var12 += var15 * var18;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 20) + var20;
            var17 = ((var21 - var19) / var18 << 20) + (var22 - var20) / var18;
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.ap) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         } else {
            var24 = var6 - this.at.ao;
            var10 += var13 * var24;
            var11 += var14 * var24;
            var12 += var15 * var24;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13 * var18;
            var11 += var14 * var18;
            var12 += var15 * var18;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 18) + var20;
            var17 = ((var21 - var19) / var18 << 18) + (var22 - var20) / var18;
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.ap) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         }

      }
   }

   void cv(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      if (this.at.ap) {
         if (var7 > this.at.ar) {
            var7 = this.at.ar;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var16;
         int var17;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var24;
         if (this.aw) {
            var24 = var6 - this.at.ao;
            var10 += var13 * var24;
            var11 += var14 * var24;
            var12 += var15 * var24;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13 * var18;
            var11 += var14 * var18;
            var12 += var15 * var18;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 20) + var20;
            var17 = ((var21 - var19) / var18 << 20) + (var22 - var20) / var18;
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.ap) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & 24305212) + ((var4 & -440847940) * var16 & -1784853516) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 39706786) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & -1725490473) * var16 & -16711936) + ((var4 & 1589736073) * var16 & 2139106084) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & -1197304859) * var16 & 1437179730) + ((var4 & 1293014790) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 1162787598) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -1183940596) + ((var4 & '\uff00') * var16 & 59846917) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & -1520751362) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & 1078499598) + ((var4 & -1924162617) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & -402396805) * var16 & 1818125178) + ((var4 & 422002725) * var16 & 218763167) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 1546030605) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -1977616855) + ((var4 & -878467314) * var16 & -234179185) >> 8;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & -328661686) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & -712914586) * var16 & -121853632) + ((var4 & '\uff00') * var16 & 1328627303) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 1427580351) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & -1278781933) * var16 & -16711936) + ((var4 & 2138242665) * var16 & 1069586476) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & -1569512045) * var16 & -16711936) + ((var4 & 775087992) * var16 & -1343159407) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & -369360824) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & -1974839183) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & -1682673328) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 649882682) * var16 & 1824187844) + ((var4 & -544414035) * var16 & 1471032874) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & -1482833183) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 576736623) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 771170833) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 1960200439) * var16 & 588107524) + ((var4 & -1313739654) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & -1260619449) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & -1630550560) * var16 & -16711936) + ((var4 & '\uff00') * var16 & -818378856) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         } else {
            var24 = var6 - this.at.ao;
            var10 += var13 * var24;
            var11 += var14 * var24;
            var12 += var15 * var24;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13 * var18;
            var11 += var14 * var18;
            var12 += var15 * var18;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 18) + var20;
            var17 = ((var21 - var19) / var18 << 18) + (var22 - var20) / var18;
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.ap) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 1109398356) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -249835272) * var16 & -16711936) + ((var4 & -967304271) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 474287671) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -1760177203) + ((var4 & -906463872) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -1809424542) + ((var4 & '\uff00') * var16 & 658942413) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 1143994531) * var16 & 812283942) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -476516831) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & 284654328) + ((var4 & '\uff00') * var16 & -1890643915) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -1817611961) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -1991361532) * var16 & -368366372) + ((var4 & 1479597792) * var16 & 2060508767) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 1032922212) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -486068200) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -1431722576) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -1927295312) * var16 & -16711936) + ((var4 & 1616095164) * var16 & 1518613589) >> 8;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & -2126866113) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -1839095268) + ((var4 & -1912329557) * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & -1893309930) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & -1751199875) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & -1994303588) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 1642786463) * var16 & 568626532) + ((var4 & 771428008) * var16 & 1488079402) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 1296729555) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 1282936339) * var16 & 604661063) + ((var4 & -555722414) * var16 & -888144548) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 843016860) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & -281284041) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & -604771391) * var16 & -16711936) + ((var4 & -1581128014) * var16 & -250799455) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & -1110803617) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 804191646) * var16 & -787395178) + ((var4 & 1883465665) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & -300263539) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & -836232423) * var16 & 1104384426) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 134778729) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 1204664094) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 406575968) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 1347487755) * var16 & 1366036062) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         }

      }
   }

   void bh(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      int var13 = var5 - var4;
      int var14 = var2 - var1;
      int var15 = var6 - var4;
      int var16 = var3 - var1;
      int var17 = var11 - var10;
      int var18 = var12 - var10;
      int var19;
      if (var3 != var2) {
         var19 = (var6 - var5 << 14) / (var3 - var2);
      } else {
         var19 = 0;
      }

      int var20;
      if (var2 != var1) {
         var20 = (var13 << 14) / var14;
      } else {
         var20 = 0;
      }

      int var21;
      if (var3 != var1) {
         var21 = (var15 << 14) / var16;
      } else {
         var21 = 0;
      }

      int var22 = var13 * var16 - var15 * var14;
      if (var22 != 0) {
         int var23 = (var17 * var16 - var18 * var14 << 8) / var22;
         int var24 = (var18 * var13 - var17 * var15 << 8) / var22;
         int[] var25 = this.at.av;
         int var26 = this.at.ab;
         if (var1 <= var2 && var1 <= var3) {
            if (var1 < var26) {
               if (var2 > var26) {
                  var2 = var26;
               }

               if (var3 > var26) {
                  var3 = var26;
               }

               var10 = (var10 << 8) - var23 * var4 + var23;
               if (var2 < var3) {
                  var6 = var4 <<= 14;
                  if (var1 < 0) {
                     var6 -= var21 * var1;
                     var4 -= var20 * var1;
                     var10 -= var24 * var1;
                     var1 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var19 * var2;
                     var2 = 0;
                  }

                  if ((var1 == var2 || var21 >= var20) && (var1 != var2 || var21 <= var19)) {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bf(al, var1, 0, 0, var5 >> 14, var6 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += aa;
                           }
                        }

                        this.bf(al, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += aa;
                     }
                  } else {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bf(al, var1, 0, 0, var6 >> 14, var5 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += aa;
                           }
                        }

                        this.bf(al, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += aa;
                     }
                  }
               } else {
                  var5 = var4 <<= 14;
                  if (var1 < 0) {
                     var5 -= var21 * var1;
                     var4 -= var20 * var1;
                     var10 -= var24 * var1;
                     var1 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var19 * var3;
                     var3 = 0;
                  }

                  if (var1 != var3 && var21 < var20 || var1 == var3 && var19 > var20) {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bf(al, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += aa;
                           }
                        }

                        this.bf(al, var1, 0, 0, var5 >> 14, var4 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += aa;
                     }
                  } else {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bf(al, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += aa;
                           }
                        }

                        this.bf(al, var1, 0, 0, var4 >> 14, var5 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += aa;
                     }
                  }
               }
            }
         } else if (var2 <= var3) {
            if (var2 < var26) {
               if (var3 > var26) {
                  var3 = var26;
               }

               if (var1 > var26) {
                  var1 = var26;
               }

               var11 = (var11 << 8) - var23 * var5 + var23;
               if (var3 < var1) {
                  var4 = var5 <<= 14;
                  if (var2 < 0) {
                     var4 -= var20 * var2;
                     var5 -= var19 * var2;
                     var11 -= var24 * var2;
                     var2 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var21 * var3;
                     var3 = 0;
                  }

                  if ((var2 == var3 || var20 >= var19) && (var2 != var3 || var20 <= var21)) {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bf(al, var2, 0, 0, var6 >> 14, var4 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += aa;
                           }
                        }

                        this.bf(al, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += aa;
                     }
                  } else {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bf(al, var2, 0, 0, var4 >> 14, var6 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += aa;
                           }
                        }

                        this.bf(al, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += aa;
                     }
                  }
               } else {
                  var6 = var5 <<= 14;
                  if (var2 < 0) {
                     var6 -= var20 * var2;
                     var5 -= var19 * var2;
                     var11 -= var24 * var2;
                     var2 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var21 * var1;
                     var1 = 0;
                  }

                  if (var20 < var19) {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bf(al, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += aa;
                           }
                        }

                        this.bf(al, var2, 0, 0, var6 >> 14, var5 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += aa;
                     }
                  } else {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bf(al, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += aa;
                           }
                        }

                        this.bf(al, var2, 0, 0, var5 >> 14, var6 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += aa;
                     }
                  }
               }
            }
         } else if (var3 < var26) {
            if (var1 > var26) {
               var1 = var26;
            }

            if (var2 > var26) {
               var2 = var26;
            }

            var12 = (var12 << 8) - var23 * var6 + var23;
            if (var1 < var2) {
               var5 = var6 <<= 14;
               if (var3 < 0) {
                  var5 -= var19 * var3;
                  var6 -= var21 * var3;
                  var12 -= var24 * var3;
                  var3 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var20 * var1;
                  var1 = 0;
               }

               if (var19 < var21) {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bf(al, var3, 0, 0, var5 >> 14, var4 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += aa;
                        }
                     }

                     this.bf(al, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += aa;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bf(al, var3, 0, 0, var4 >> 14, var5 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += aa;
                        }
                     }

                     this.bf(al, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += aa;
                  }
               }
            } else {
               var4 = var6 <<= 14;
               if (var3 < 0) {
                  var4 -= var19 * var3;
                  var6 -= var21 * var3;
                  var12 -= var24 * var3;
                  var3 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var20 * var2;
                  var2 = 0;
               }

               if (var19 < var21) {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bf(al, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += aa;
                        }
                     }

                     this.bf(al, var3, 0, 0, var4 >> 14, var6 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += aa;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bf(al, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += aa;
                        }
                     }

                     this.bf(al, var3, 0, 0, var6 >> 14, var4 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += aa;
                  }
               }
            }
         }
      }
   }

   void bj(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      int var13 = var5 - var4;
      int var14 = var2 - var1;
      int var15 = var6 - var4;
      int var16 = var3 - var1;
      int var17 = var11 - var10;
      int var18 = var12 - var10;
      int var19;
      if (var3 != var2) {
         var19 = (var6 - var5 << 14) / (var3 - var2);
      } else {
         var19 = 0;
      }

      int var20;
      if (var2 != var1) {
         var20 = (var13 << 14) / var14;
      } else {
         var20 = 0;
      }

      int var21;
      if (var3 != var1) {
         var21 = (var15 << 14) / var16;
      } else {
         var21 = 0;
      }

      int var22 = var13 * var16 - var15 * var14;
      if (var22 != 0) {
         int var23 = (var17 * var16 - var18 * var14 << 8) / var22;
         int var24 = (var18 * var13 - var17 * var15 << 8) / var22;
         int[] var25 = this.at.av;
         int var26 = this.at.ab;
         if (var1 <= var2 && var1 <= var3) {
            if (var1 < var26) {
               if (var2 > var26) {
                  var2 = var26;
               }

               if (var3 > var26) {
                  var3 = var26;
               }

               var10 = (var10 << 8) - var23 * var4 + var23;
               if (var2 < var3) {
                  var6 = var4 <<= 14;
                  if (var1 < 0) {
                     var6 -= var21 * var1;
                     var4 -= var20 * var1;
                     var10 -= var24 * var1;
                     var1 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var19 * var2;
                     var2 = 0;
                  }

                  if ((var1 == var2 || var21 >= var20) && (var1 != var2 || var21 <= var19)) {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bf(al, var1, 0, 0, var5 >> 14, var6 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += aa;
                           }
                        }

                        this.bf(al, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += aa;
                     }
                  } else {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bf(al, var1, 0, 0, var6 >> 14, var5 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += aa;
                           }
                        }

                        this.bf(al, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += aa;
                     }
                  }
               } else {
                  var5 = var4 <<= 14;
                  if (var1 < 0) {
                     var5 -= var21 * var1;
                     var4 -= var20 * var1;
                     var10 -= var24 * var1;
                     var1 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var19 * var3;
                     var3 = 0;
                  }

                  if (var1 != var3 && var21 < var20 || var1 == var3 && var19 > var20) {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bf(al, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += aa;
                           }
                        }

                        this.bf(al, var1, 0, 0, var5 >> 14, var4 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += aa;
                     }
                  } else {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bf(al, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += aa;
                           }
                        }

                        this.bf(al, var1, 0, 0, var4 >> 14, var5 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += aa;
                     }
                  }
               }
            }
         } else if (var2 <= var3) {
            if (var2 < var26) {
               if (var3 > var26) {
                  var3 = var26;
               }

               if (var1 > var26) {
                  var1 = var26;
               }

               var11 = (var11 << 8) - var23 * var5 + var23;
               if (var3 < var1) {
                  var4 = var5 <<= 14;
                  if (var2 < 0) {
                     var4 -= var20 * var2;
                     var5 -= var19 * var2;
                     var11 -= var24 * var2;
                     var2 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var21 * var3;
                     var3 = 0;
                  }

                  if ((var2 == var3 || var20 >= var19) && (var2 != var3 || var20 <= var21)) {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bf(al, var2, 0, 0, var6 >> 14, var4 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += aa;
                           }
                        }

                        this.bf(al, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += aa;
                     }
                  } else {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bf(al, var2, 0, 0, var4 >> 14, var6 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += aa;
                           }
                        }

                        this.bf(al, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += aa;
                     }
                  }
               } else {
                  var6 = var5 <<= 14;
                  if (var2 < 0) {
                     var6 -= var20 * var2;
                     var5 -= var19 * var2;
                     var11 -= var24 * var2;
                     var2 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var21 * var1;
                     var1 = 0;
                  }

                  if (var20 < var19) {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bf(al, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += aa;
                           }
                        }

                        this.bf(al, var2, 0, 0, var6 >> 14, var5 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += aa;
                     }
                  } else {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bf(al, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += aa;
                           }
                        }

                        this.bf(al, var2, 0, 0, var5 >> 14, var6 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += aa;
                     }
                  }
               }
            }
         } else if (var3 < var26) {
            if (var1 > var26) {
               var1 = var26;
            }

            if (var2 > var26) {
               var2 = var26;
            }

            var12 = (var12 << 8) - var23 * var6 + var23;
            if (var1 < var2) {
               var5 = var6 <<= 14;
               if (var3 < 0) {
                  var5 -= var19 * var3;
                  var6 -= var21 * var3;
                  var12 -= var24 * var3;
                  var3 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var20 * var1;
                  var1 = 0;
               }

               if (var19 < var21) {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bf(al, var3, 0, 0, var5 >> 14, var4 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += aa;
                        }
                     }

                     this.bf(al, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += aa;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bf(al, var3, 0, 0, var4 >> 14, var5 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += aa;
                        }
                     }

                     this.bf(al, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += aa;
                  }
               }
            } else {
               var4 = var6 <<= 14;
               if (var3 < 0) {
                  var4 -= var19 * var3;
                  var6 -= var21 * var3;
                  var12 -= var24 * var3;
                  var3 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var20 * var2;
                  var2 = 0;
               }

               if (var19 < var21) {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bf(al, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += aa;
                        }
                     }

                     this.bf(al, var3, 0, 0, var4 >> 14, var6 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += aa;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bf(al, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += aa;
                        }
                     }

                     this.bf(al, var3, 0, 0, var6 >> 14, var4 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += aa;
                  }
               }
            }
         }
      }
   }

   void bv(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      int var13 = var5 - var4;
      int var14 = var2 - var1;
      int var15 = var6 - var4;
      int var16 = var3 - var1;
      int var17 = var11 - var10;
      int var18 = var12 - var10;
      int var19;
      if (var3 != var2) {
         var19 = (var6 - var5 << 14) / (var3 - var2);
      } else {
         var19 = 0;
      }

      int var20;
      if (var2 != var1) {
         var20 = (var13 << 14) / var14;
      } else {
         var20 = 0;
      }

      int var21;
      if (var3 != var1) {
         var21 = (var15 << 14) / var16;
      } else {
         var21 = 0;
      }

      int var22 = var13 * var16 - var15 * var14;
      if (var22 != 0) {
         int var23 = (var17 * var16 - var18 * var14 << 8) / var22;
         int var24 = (var18 * var13 - var17 * var15 << 8) / var22;
         int[] var25 = this.at.av;
         int var26 = this.at.ab;
         if (var1 <= var2 && var1 <= var3) {
            if (var1 < var26) {
               if (var2 > var26) {
                  var2 = var26;
               }

               if (var3 > var26) {
                  var3 = var26;
               }

               var10 = (var10 << 8) - var23 * var4 + var23;
               if (var2 < var3) {
                  var6 = var4 <<= 14;
                  if (var1 < 0) {
                     var6 -= var21 * var1;
                     var4 -= var20 * var1;
                     var10 -= var24 * var1;
                     var1 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var19 * var2;
                     var2 = 0;
                  }

                  if ((var1 == var2 || var21 >= var20) && (var1 != var2 || var21 <= var19)) {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bf(al, var1, 0, 0, var5 >> 14, var6 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += aa;
                           }
                        }

                        this.bf(al, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += aa;
                     }
                  } else {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bf(al, var1, 0, 0, var6 >> 14, var5 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += aa;
                           }
                        }

                        this.bf(al, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += aa;
                     }
                  }
               } else {
                  var5 = var4 <<= 14;
                  if (var1 < 0) {
                     var5 -= var21 * var1;
                     var4 -= var20 * var1;
                     var10 -= var24 * var1;
                     var1 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var19 * var3;
                     var3 = 0;
                  }

                  if (var1 != var3 && var21 < var20 || var1 == var3 && var19 > var20) {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bf(al, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += aa;
                           }
                        }

                        this.bf(al, var1, 0, 0, var5 >> 14, var4 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += aa;
                     }
                  } else {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bf(al, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += aa;
                           }
                        }

                        this.bf(al, var1, 0, 0, var4 >> 14, var5 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += aa;
                     }
                  }
               }
            }
         } else if (var2 <= var3) {
            if (var2 < var26) {
               if (var3 > var26) {
                  var3 = var26;
               }

               if (var1 > var26) {
                  var1 = var26;
               }

               var11 = (var11 << 8) - var23 * var5 + var23;
               if (var3 < var1) {
                  var4 = var5 <<= 14;
                  if (var2 < 0) {
                     var4 -= var20 * var2;
                     var5 -= var19 * var2;
                     var11 -= var24 * var2;
                     var2 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var21 * var3;
                     var3 = 0;
                  }

                  if ((var2 == var3 || var20 >= var19) && (var2 != var3 || var20 <= var21)) {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bf(al, var2, 0, 0, var6 >> 14, var4 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += aa;
                           }
                        }

                        this.bf(al, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += aa;
                     }
                  } else {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bf(al, var2, 0, 0, var4 >> 14, var6 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += aa;
                           }
                        }

                        this.bf(al, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += aa;
                     }
                  }
               } else {
                  var6 = var5 <<= 14;
                  if (var2 < 0) {
                     var6 -= var20 * var2;
                     var5 -= var19 * var2;
                     var11 -= var24 * var2;
                     var2 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var21 * var1;
                     var1 = 0;
                  }

                  if (var20 < var19) {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bf(al, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += aa;
                           }
                        }

                        this.bf(al, var2, 0, 0, var6 >> 14, var5 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += aa;
                     }
                  } else {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bf(al, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += aa;
                           }
                        }

                        this.bf(al, var2, 0, 0, var5 >> 14, var6 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += aa;
                     }
                  }
               }
            }
         } else if (var3 < var26) {
            if (var1 > var26) {
               var1 = var26;
            }

            if (var2 > var26) {
               var2 = var26;
            }

            var12 = (var12 << 8) - var23 * var6 + var23;
            if (var1 < var2) {
               var5 = var6 <<= 14;
               if (var3 < 0) {
                  var5 -= var19 * var3;
                  var6 -= var21 * var3;
                  var12 -= var24 * var3;
                  var3 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var20 * var1;
                  var1 = 0;
               }

               if (var19 < var21) {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bf(al, var3, 0, 0, var5 >> 14, var4 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += aa;
                        }
                     }

                     this.bf(al, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += aa;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bf(al, var3, 0, 0, var4 >> 14, var5 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += aa;
                        }
                     }

                     this.bf(al, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += aa;
                  }
               }
            } else {
               var4 = var6 <<= 14;
               if (var3 < 0) {
                  var4 -= var19 * var3;
                  var6 -= var21 * var3;
                  var12 -= var24 * var3;
                  var3 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var20 * var2;
                  var2 = 0;
               }

               if (var19 < var21) {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bf(al, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += aa;
                        }
                     }

                     this.bf(al, var3, 0, 0, var4 >> 14, var6 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += aa;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bf(al, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += aa;
                        }
                     }

                     this.bf(al, var3, 0, 0, var6 >> 14, var4 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += aa;
                  }
               }
            }
         }
      }
   }

   void bk(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10) {
      int var11 = 0;
      if (var2 != var1) {
         var11 = (var5 - var4 << 14) / (var2 - var1);
      }

      int var12 = 0;
      if (var3 != var2) {
         var12 = (var6 - var5 << 14) / (var3 - var2);
      }

      int var13 = 0;
      if (var3 != var1) {
         var13 = (var4 - var6 << 14) / (var1 - var3);
      }

      int[] var14 = this.at.av;
      int var15 = this.at.ab;
      if (var1 <= var2 && var1 <= var3) {
         if (var1 < var15) {
            if (var2 > var15) {
               var2 = var15;
            }

            if (var3 > var15) {
               var3 = var15;
            }

            if (var2 < var3) {
               var6 = var4 <<= 14;
               if (var1 < 0) {
                  var6 -= var13 * var1;
                  var4 -= var11 * var1;
                  var1 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var12 * var2;
                  var2 = 0;
               }

               if ((var1 == var2 || var13 >= var11) && (var1 != var2 || var13 <= var12)) {
                  var3 -= var2;
                  var2 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bg(al, var1, var10, 0, var5 >> 14, var6 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += aa;
                        }
                     }

                     this.bg(al, var1, var10, 0, var4 >> 14, var6 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += aa;
                  }
               } else {
                  var3 -= var2;
                  var2 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bg(al, var1, var10, 0, var6 >> 14, var5 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += aa;
                        }
                     }

                     this.bg(al, var1, var10, 0, var6 >> 14, var4 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += aa;
                  }
               }
            } else {
               var5 = var4 <<= 14;
               if (var1 < 0) {
                  var5 -= var13 * var1;
                  var4 -= var11 * var1;
                  var1 = 0;
               }

               var6 <<= 14;
               if (var3 < 0) {
                  var6 -= var12 * var3;
                  var3 = 0;
               }

               if (var1 != var3 && var13 < var11 || var1 == var3 && var12 > var11) {
                  var2 -= var3;
                  var3 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bg(al, var1, var10, 0, var6 >> 14, var4 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += aa;
                        }
                     }

                     this.bg(al, var1, var10, 0, var5 >> 14, var4 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += aa;
                  }
               } else {
                  var2 -= var3;
                  var3 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bg(al, var1, var10, 0, var4 >> 14, var6 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += aa;
                        }
                     }

                     this.bg(al, var1, var10, 0, var4 >> 14, var5 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += aa;
                  }
               }
            }
         }
      } else if (var2 <= var3) {
         if (var2 < var15) {
            if (var3 > var15) {
               var3 = var15;
            }

            if (var1 > var15) {
               var1 = var15;
            }

            if (var3 < var1) {
               var4 = var5 <<= 14;
               if (var2 < 0) {
                  var4 -= var11 * var2;
                  var5 -= var12 * var2;
                  var2 = 0;
               }

               var6 <<= 14;
               if (var3 < 0) {
                  var6 -= var13 * var3;
                  var3 = 0;
               }

               if ((var2 == var3 || var11 >= var12) && (var2 != var3 || var11 <= var13)) {
                  var1 -= var3;
                  var3 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bg(al, var2, var10, 0, var6 >> 14, var4 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += aa;
                        }
                     }

                     this.bg(al, var2, var10, 0, var5 >> 14, var4 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += aa;
                  }
               } else {
                  var1 -= var3;
                  var3 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bg(al, var2, var10, 0, var4 >> 14, var6 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += aa;
                        }
                     }

                     this.bg(al, var2, var10, 0, var4 >> 14, var5 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += aa;
                  }
               }
            } else {
               var6 = var5 <<= 14;
               if (var2 < 0) {
                  var6 -= var11 * var2;
                  var5 -= var12 * var2;
                  var2 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var13 * var1;
                  var1 = 0;
               }

               if (var11 < var12) {
                  var3 -= var1;
                  var1 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bg(al, var2, var10, 0, var4 >> 14, var5 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += aa;
                        }
                     }

                     this.bg(al, var2, var10, 0, var6 >> 14, var5 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += aa;
                  }
               } else {
                  var3 -= var1;
                  var1 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bg(al, var2, var10, 0, var5 >> 14, var4 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += aa;
                        }
                     }

                     this.bg(al, var2, var10, 0, var5 >> 14, var6 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += aa;
                  }
               }
            }
         }
      } else if (var3 < var15) {
         if (var1 > var15) {
            var1 = var15;
         }

         if (var2 > var15) {
            var2 = var15;
         }

         if (var1 < var2) {
            var5 = var6 <<= 14;
            if (var3 < 0) {
               var5 -= var12 * var3;
               var6 -= var13 * var3;
               var3 = 0;
            }

            var4 <<= 14;
            if (var1 < 0) {
               var4 -= var11 * var1;
               var1 = 0;
            }

            if (var12 < var13) {
               var2 -= var1;
               var1 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        this.bg(al, var3, var10, 0, var5 >> 14, var4 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += aa;
                     }
                  }

                  this.bg(al, var3, var10, 0, var5 >> 14, var6 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += aa;
               }
            } else {
               var2 -= var1;
               var1 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        this.bg(al, var3, var10, 0, var4 >> 14, var5 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += aa;
                     }
                  }

                  this.bg(al, var3, var10, 0, var6 >> 14, var5 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += aa;
               }
            }
         } else {
            var4 = var6 <<= 14;
            if (var3 < 0) {
               var4 -= var12 * var3;
               var6 -= var13 * var3;
               var3 = 0;
            }

            var5 <<= 14;
            if (var2 < 0) {
               var5 -= var11 * var2;
               var2 = 0;
            }

            if (var12 < var13) {
               var1 -= var2;
               var2 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        this.bg(al, var3, var10, 0, var5 >> 14, var6 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += aa;
                     }
                  }

                  this.bg(al, var3, var10, 0, var4 >> 14, var6 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += aa;
               }
            } else {
               var1 -= var2;
               var2 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        this.bg(al, var3, var10, 0, var6 >> 14, var5 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += aa;
                     }
                  }

                  this.bg(al, var3, var10, 0, var6 >> 14, var4 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += aa;
               }
            }
         }
      }
   }

   void bg(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.at.ap) {
         if (var6 > this.at.ar) {
            var6 = this.at.ar;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var4 = var6 - var5 >> 2;
         if (this.at.ak != 0) {
            if (this.at.ak == 254) {
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
               int var7 = this.at.ak;
               int var8 = 256 - this.at.ak;
               var3 = ((var3 & 16711935) * var8 >> 8 & 16711935) + ((var3 & '\uff00') * var8 >> 8 & '\uff00');

               while(true) {
                  --var4;
                  int var9;
                  if (var4 < 0) {
                     var4 = var6 - var5 & 3;

                     while(true) {
                        --var4;
                        if (var4 < 0) {
                           return;
                        }

                        var9 = var1[var2];
                        var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & '\uff00') * var7 >> 8 & '\uff00');
                     }
                  }

                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & '\uff00') * var7 >> 8 & '\uff00');
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & '\uff00') * var7 >> 8 & '\uff00');
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & '\uff00') * var7 >> 8 & '\uff00');
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & '\uff00') * var7 >> 8 & '\uff00');
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

                     var1[var2++] = var3;
                  }
               }

               var1[var2++] = var3;
               var1[var2++] = var3;
               var1[var2++] = var3;
               var1[var2++] = var3;
            }
         }
      }
   }

   void bb(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10) {
      int var11 = 0;
      if (var2 != var1) {
         var11 = (var5 - var4 << 14) / (var2 - var1);
      }

      int var12 = 0;
      if (var3 != var2) {
         var12 = (var6 - var5 << 14) / (var3 - var2);
      }

      int var13 = 0;
      if (var3 != var1) {
         var13 = (var4 - var6 << 14) / (var1 - var3);
      }

      int[] var14 = this.at.av;
      int var15 = this.at.ab;
      if (var1 <= var2 && var1 <= var3) {
         if (var1 < var15) {
            if (var2 > var15) {
               var2 = var15;
            }

            if (var3 > var15) {
               var3 = var15;
            }

            if (var2 < var3) {
               var6 = var4 <<= 14;
               if (var1 < 0) {
                  var6 -= var13 * var1;
                  var4 -= var11 * var1;
                  var1 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var12 * var2;
                  var2 = 0;
               }

               if (var1 != var2 && var13 < var11 || var1 == var2 && var13 > var12) {
                  var3 -= var2;
                  var2 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bg(al, var1, var10, 0, var6 >> 14, var5 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += aa;
                        }
                     }

                     this.bg(al, var1, var10, 0, var6 >> 14, var4 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += aa;
                  }
               } else {
                  var3 -= var2;
                  var2 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bg(al, var1, var10, 0, var5 >> 14, var6 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += aa;
                        }
                     }

                     this.bg(al, var1, var10, 0, var4 >> 14, var6 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += aa;
                  }
               }
            } else {
               var5 = var4 <<= 14;
               if (var1 < 0) {
                  var5 -= var13 * var1;
                  var4 -= var11 * var1;
                  var1 = 0;
               }

               var6 <<= 14;
               if (var3 < 0) {
                  var6 -= var12 * var3;
                  var3 = 0;
               }

               if ((var1 == var3 || var13 >= var11) && (var1 != var3 || var12 <= var11)) {
                  var2 -= var3;
                  var3 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bg(al, var1, var10, 0, var4 >> 14, var6 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += aa;
                        }
                     }

                     this.bg(al, var1, var10, 0, var4 >> 14, var5 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += aa;
                  }
               } else {
                  var2 -= var3;
                  var3 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bg(al, var1, var10, 0, var6 >> 14, var4 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += aa;
                        }
                     }

                     this.bg(al, var1, var10, 0, var5 >> 14, var4 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += aa;
                  }
               }
            }
         }
      } else if (var2 <= var3) {
         if (var2 < var15) {
            if (var3 > var15) {
               var3 = var15;
            }

            if (var1 > var15) {
               var1 = var15;
            }

            if (var3 < var1) {
               var4 = var5 <<= 14;
               if (var2 < 0) {
                  var4 -= var11 * var2;
                  var5 -= var12 * var2;
                  var2 = 0;
               }

               var6 <<= 14;
               if (var3 < 0) {
                  var6 -= var13 * var3;
                  var3 = 0;
               }

               if (var2 != var3 && var11 < var12 || var2 == var3 && var11 > var13) {
                  var1 -= var3;
                  var3 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bg(al, var2, var10, 0, var4 >> 14, var6 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += aa;
                        }
                     }

                     this.bg(al, var2, var10, 0, var4 >> 14, var5 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += aa;
                  }
               } else {
                  var1 -= var3;
                  var3 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bg(al, var2, var10, 0, var6 >> 14, var4 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += aa;
                        }
                     }

                     this.bg(al, var2, var10, 0, var5 >> 14, var4 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += aa;
                  }
               }
            } else {
               var6 = var5 <<= 14;
               if (var2 < 0) {
                  var6 -= var11 * var2;
                  var5 -= var12 * var2;
                  var2 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var13 * var1;
                  var1 = 0;
               }

               if (var11 < var12) {
                  var3 -= var1;
                  var1 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bg(al, var2, var10, 0, var4 >> 14, var5 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += aa;
                        }
                     }

                     this.bg(al, var2, var10, 0, var6 >> 14, var5 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += aa;
                  }
               } else {
                  var3 -= var1;
                  var1 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bg(al, var2, var10, 0, var5 >> 14, var4 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += aa;
                        }
                     }

                     this.bg(al, var2, var10, 0, var5 >> 14, var6 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += aa;
                  }
               }
            }
         }
      } else if (var3 < var15) {
         if (var1 > var15) {
            var1 = var15;
         }

         if (var2 > var15) {
            var2 = var15;
         }

         if (var1 < var2) {
            var5 = var6 <<= 14;
            if (var3 < 0) {
               var5 -= var12 * var3;
               var6 -= var13 * var3;
               var3 = 0;
            }

            var4 <<= 14;
            if (var1 < 0) {
               var4 -= var11 * var1;
               var1 = 0;
            }

            if (var12 < var13) {
               var2 -= var1;
               var1 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        this.bg(al, var3, var10, 0, var5 >> 14, var4 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += aa;
                     }
                  }

                  this.bg(al, var3, var10, 0, var5 >> 14, var6 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += aa;
               }
            } else {
               var2 -= var1;
               var1 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        this.bg(al, var3, var10, 0, var4 >> 14, var5 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += aa;
                     }
                  }

                  this.bg(al, var3, var10, 0, var6 >> 14, var5 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += aa;
               }
            }
         } else {
            var4 = var6 <<= 14;
            if (var3 < 0) {
               var4 -= var12 * var3;
               var6 -= var13 * var3;
               var3 = 0;
            }

            var5 <<= 14;
            if (var2 < 0) {
               var5 -= var11 * var2;
               var2 = 0;
            }

            if (var12 < var13) {
               var1 -= var2;
               var2 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        this.bg(al, var3, var10, 0, var5 >> 14, var6 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += aa;
                     }
                  }

                  this.bg(al, var3, var10, 0, var4 >> 14, var6 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += aa;
               }
            } else {
               var1 -= var2;
               var2 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        this.bg(al, var3, var10, 0, var6 >> 14, var5 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += aa;
                     }
                  }

                  this.bg(al, var3, var10, 0, var6 >> 14, var4 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += aa;
               }
            }
         }
      }
   }

   void bq(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10) {
      int var11 = 0;
      if (var2 != var1) {
         var11 = (var5 - var4 << 14) / (var2 - var1);
      }

      int var12 = 0;
      if (var3 != var2) {
         var12 = (var6 - var5 << 14) / (var3 - var2);
      }

      int var13 = 0;
      if (var3 != var1) {
         var13 = (var4 - var6 << 14) / (var1 - var3);
      }

      int[] var14 = this.at.av;
      int var15 = this.at.ab;
      if (var1 <= var2 && var1 <= var3) {
         if (var1 < var15) {
            if (var2 > var15) {
               var2 = var15;
            }

            if (var3 > var15) {
               var3 = var15;
            }

            if (var2 < var3) {
               var6 = var4 <<= 14;
               if (var1 < 0) {
                  var6 -= var13 * var1;
                  var4 -= var11 * var1;
                  var1 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var12 * var2;
                  var2 = 0;
               }

               if (var1 != var2 && var13 < var11 || var1 == var2 && var13 > var12) {
                  var3 -= var2;
                  var2 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bg(al, var1, var10, 0, var6 >> 14, var5 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += aa;
                        }
                     }

                     this.bg(al, var1, var10, 0, var6 >> 14, var4 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += aa;
                  }
               } else {
                  var3 -= var2;
                  var2 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bg(al, var1, var10, 0, var5 >> 14, var6 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += aa;
                        }
                     }

                     this.bg(al, var1, var10, 0, var4 >> 14, var6 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += aa;
                  }
               }
            } else {
               var5 = var4 <<= 14;
               if (var1 < 0) {
                  var5 -= var13 * var1;
                  var4 -= var11 * var1;
                  var1 = 0;
               }

               var6 <<= 14;
               if (var3 < 0) {
                  var6 -= var12 * var3;
                  var3 = 0;
               }

               if ((var1 == var3 || var13 >= var11) && (var1 != var3 || var12 <= var11)) {
                  var2 -= var3;
                  var3 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bg(al, var1, var10, 0, var4 >> 14, var6 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += aa;
                        }
                     }

                     this.bg(al, var1, var10, 0, var4 >> 14, var5 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += aa;
                  }
               } else {
                  var2 -= var3;
                  var3 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bg(al, var1, var10, 0, var6 >> 14, var4 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += aa;
                        }
                     }

                     this.bg(al, var1, var10, 0, var5 >> 14, var4 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += aa;
                  }
               }
            }
         }
      } else if (var2 <= var3) {
         if (var2 < var15) {
            if (var3 > var15) {
               var3 = var15;
            }

            if (var1 > var15) {
               var1 = var15;
            }

            if (var3 < var1) {
               var4 = var5 <<= 14;
               if (var2 < 0) {
                  var4 -= var11 * var2;
                  var5 -= var12 * var2;
                  var2 = 0;
               }

               var6 <<= 14;
               if (var3 < 0) {
                  var6 -= var13 * var3;
                  var3 = 0;
               }

               if (var2 != var3 && var11 < var12 || var2 == var3 && var11 > var13) {
                  var1 -= var3;
                  var3 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bg(al, var2, var10, 0, var4 >> 14, var6 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += aa;
                        }
                     }

                     this.bg(al, var2, var10, 0, var4 >> 14, var5 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += aa;
                  }
               } else {
                  var1 -= var3;
                  var3 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bg(al, var2, var10, 0, var6 >> 14, var4 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += aa;
                        }
                     }

                     this.bg(al, var2, var10, 0, var5 >> 14, var4 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += aa;
                  }
               }
            } else {
               var6 = var5 <<= 14;
               if (var2 < 0) {
                  var6 -= var11 * var2;
                  var5 -= var12 * var2;
                  var2 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var13 * var1;
                  var1 = 0;
               }

               if (var11 < var12) {
                  var3 -= var1;
                  var1 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bg(al, var2, var10, 0, var4 >> 14, var5 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += aa;
                        }
                     }

                     this.bg(al, var2, var10, 0, var6 >> 14, var5 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += aa;
                  }
               } else {
                  var3 -= var1;
                  var1 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bg(al, var2, var10, 0, var5 >> 14, var4 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += aa;
                        }
                     }

                     this.bg(al, var2, var10, 0, var5 >> 14, var6 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += aa;
                  }
               }
            }
         }
      } else if (var3 < var15) {
         if (var1 > var15) {
            var1 = var15;
         }

         if (var2 > var15) {
            var2 = var15;
         }

         if (var1 < var2) {
            var5 = var6 <<= 14;
            if (var3 < 0) {
               var5 -= var12 * var3;
               var6 -= var13 * var3;
               var3 = 0;
            }

            var4 <<= 14;
            if (var1 < 0) {
               var4 -= var11 * var1;
               var1 = 0;
            }

            if (var12 < var13) {
               var2 -= var1;
               var1 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        this.bg(al, var3, var10, 0, var5 >> 14, var4 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += aa;
                     }
                  }

                  this.bg(al, var3, var10, 0, var5 >> 14, var6 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += aa;
               }
            } else {
               var2 -= var1;
               var1 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        this.bg(al, var3, var10, 0, var4 >> 14, var5 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += aa;
                     }
                  }

                  this.bg(al, var3, var10, 0, var6 >> 14, var5 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += aa;
               }
            }
         } else {
            var4 = var6 <<= 14;
            if (var3 < 0) {
               var4 -= var12 * var3;
               var6 -= var13 * var3;
               var3 = 0;
            }

            var5 <<= 14;
            if (var2 < 0) {
               var5 -= var11 * var2;
               var2 = 0;
            }

            if (var12 < var13) {
               var1 -= var2;
               var2 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        this.bg(al, var3, var10, 0, var5 >> 14, var6 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += aa;
                     }
                  }

                  this.bg(al, var3, var10, 0, var4 >> 14, var6 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += aa;
               }
            } else {
               var1 -= var2;
               var2 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        this.bg(al, var3, var10, 0, var6 >> 14, var5 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += aa;
                     }
                  }

                  this.bg(al, var3, var10, 0, var6 >> 14, var4 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += aa;
               }
            }
         }
      }
   }

   void bp(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.at.as.ak(var22, (byte)19);
      int var24;
      if (var23 == null) {
         var24 = this.at.as.aj(var22, (byte)-30);
         this.ay(var1, var2, var3, var4, var5, var6, var7, var8, var9, ak(var24, var10), ak(var24, var11), ak(var24, var12));
      } else {
         this.aw = this.at.as.ay(var22, (byte)23);
         this.ap = this.at.as.ai(var22, (byte)28);
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
            int var36 = this.at.ay;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var37 = var15 * var16 - var18 * var13 << 14;
            int var38 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / (long)var36);
            int var39 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var36);
            int var40 = var14 * var16 - var17 * var13 << 14;
            int var41 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / (long)var36);
            int var42 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var36);
            int var43 = var17 * var15 - var14 * var18 << 14;
            int var44 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / (long)var36);
            int var45 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var36);
            int[] var46 = this.at.av;
            int var47 = this.at.ab;
            int var48;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < var47) {
                  if (var2 > var47) {
                     var2 = var47;
                  }

                  if (var3 > var47) {
                     var3 = var47;
                  }

                  var10 = (var10 << 9) - var34 * var4 + var34;
                  if (var2 < var3) {
                     var6 = var4 <<= 14;
                     if (var1 < 0) {
                        var6 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var31 * var2;
                        var2 = 0;
                     }

                     var48 = var1 - this.at.af;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var1 != var2 && var32 < var30 || var1 == var2 && var32 > var31) {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var31 * var3;
                        var3 = 0;
                     }

                     var48 = var1 - this.at.af;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if ((var1 == var3 || var32 >= var30) && (var1 != var3 || var31 <= var30)) {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < var47) {
                  if (var3 > var47) {
                     var3 = var47;
                  }

                  if (var1 > var47) {
                     var1 = var47;
                  }

                  var11 = (var11 << 9) - var34 * var5 + var34;
                  if (var3 < var1) {
                     var4 = var5 <<= 14;
                     if (var2 < 0) {
                        var4 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var32 * var3;
                        var3 = 0;
                     }

                     var48 = var2 - this.at.af;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var2 != var3 && var30 < var31 || var2 == var3 && var30 > var32) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var6 = var5 <<= 14;
                     if (var2 < 0) {
                        var6 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var32 * var1;
                        var1 = 0;
                     }

                     var48 = var2 - this.at.af;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var30 < var31) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var3 < var47) {
               if (var1 > var47) {
                  var1 = var47;
               }

               if (var2 > var47) {
                  var2 = var47;
               }

               var12 = (var12 << 9) - var34 * var6 + var34;
               if (var1 < var2) {
                  var5 = var6 <<= 14;
                  if (var3 < 0) {
                     var5 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var30 * var1;
                     var1 = 0;
                  }

                  var48 = var3 - this.at.af;
                  var37 += var39 * var48;
                  var40 += var42 * var48;
                  var43 += var45 * var48;
                  if (var31 < var32) {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bl(al, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bl(al, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bl(al, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bl(al, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               } else {
                  var4 = var6 <<= 14;
                  if (var3 < 0) {
                     var4 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var30 * var2;
                     var2 = 0;
                  }

                  var48 = var3 - this.at.af;
                  var37 += var39 * var48;
                  var40 += var42 * var48;
                  var43 += var45 * var48;
                  if (var31 < var32) {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bl(al, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bl(al, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bl(al, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bl(al, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               }
            }
         }
      }
   }

   void bz(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.at.as.ak(var22, (byte)-33);
      int var24;
      if (var23 == null) {
         var24 = this.at.as.aj(var22, (byte)-9);
         this.ay(var1, var2, var3, var4, var5, var6, var7, var8, var9, ak(var24, var10), ak(var24, var11), ak(var24, var12));
      } else {
         this.aw = this.at.as.ay(var22, (byte)23);
         this.ap = this.at.as.ai(var22, (byte)17);
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
            int var36 = this.at.ay;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var37 = var15 * var16 - var18 * var13 << 14;
            int var38 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / (long)var36);
            int var39 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var36);
            int var40 = var14 * var16 - var17 * var13 << 14;
            int var41 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / (long)var36);
            int var42 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var36);
            int var43 = var17 * var15 - var14 * var18 << 14;
            int var44 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / (long)var36);
            int var45 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var36);
            int[] var46 = this.at.av;
            int var47 = this.at.ab;
            int var48;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < var47) {
                  if (var2 > var47) {
                     var2 = var47;
                  }

                  if (var3 > var47) {
                     var3 = var47;
                  }

                  var10 = (var10 << 9) - var34 * var4 + var34;
                  if (var2 < var3) {
                     var6 = var4 <<= 14;
                     if (var1 < 0) {
                        var6 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var31 * var2;
                        var2 = 0;
                     }

                     var48 = var1 - this.at.af;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var1 != var2 && var32 < var30 || var1 == var2 && var32 > var31) {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var31 * var3;
                        var3 = 0;
                     }

                     var48 = var1 - this.at.af;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if ((var1 == var3 || var32 >= var30) && (var1 != var3 || var31 <= var30)) {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < var47) {
                  if (var3 > var47) {
                     var3 = var47;
                  }

                  if (var1 > var47) {
                     var1 = var47;
                  }

                  var11 = (var11 << 9) - var34 * var5 + var34;
                  if (var3 < var1) {
                     var4 = var5 <<= 14;
                     if (var2 < 0) {
                        var4 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var32 * var3;
                        var3 = 0;
                     }

                     var48 = var2 - this.at.af;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var2 != var3 && var30 < var31 || var2 == var3 && var30 > var32) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var6 = var5 <<= 14;
                     if (var2 < 0) {
                        var6 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var32 * var1;
                        var1 = 0;
                     }

                     var48 = var2 - this.at.af;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var30 < var31) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var3 < var47) {
               if (var1 > var47) {
                  var1 = var47;
               }

               if (var2 > var47) {
                  var2 = var47;
               }

               var12 = (var12 << 9) - var34 * var6 + var34;
               if (var1 < var2) {
                  var5 = var6 <<= 14;
                  if (var3 < 0) {
                     var5 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var30 * var1;
                     var1 = 0;
                  }

                  var48 = var3 - this.at.af;
                  var37 += var39 * var48;
                  var40 += var42 * var48;
                  var43 += var45 * var48;
                  if (var31 < var32) {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bl(al, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bl(al, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bl(al, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bl(al, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               } else {
                  var4 = var6 <<= 14;
                  if (var3 < 0) {
                     var4 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var30 * var2;
                     var2 = 0;
                  }

                  var48 = var3 - this.at.af;
                  var37 += var39 * var48;
                  var40 += var42 * var48;
                  var43 += var45 * var48;
                  if (var31 < var32) {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bl(al, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bl(al, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bl(al, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bl(al, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               }
            }
         }
      }
   }

   void bc(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.at.as.ak(var22, (byte)47);
      int var24;
      if (var23 == null) {
         var24 = this.at.as.aj(var22, (byte)-120);
         this.ay(var1, var2, var3, var4, var5, var6, var7, var8, var9, ak(var24, var10), ak(var24, var11), ak(var24, var12));
      } else {
         this.aw = this.at.as.ay(var22, (byte)23);
         this.ap = this.at.as.ai(var22, (byte)17);
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
            int var36 = this.at.ay;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var37 = var15 * var16 - var18 * var13 << 14;
            int var38 = (int)(((long)(var18 * var19 - var21 * var16) << 3 << 14) / (long)var36);
            int var39 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var36);
            int var40 = var14 * var16 - var17 * var13 << 14;
            int var41 = (int)(((long)(var17 * var19 - var20 * var16) << 3 << 14) / (long)var36);
            int var42 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var36);
            int var43 = var17 * var15 - var14 * var18 << 14;
            int var44 = (int)(((long)(var20 * var18 - var17 * var21) << 3 << 14) / (long)var36);
            int var45 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var36);
            int[] var46 = this.at.av;
            int var47 = this.at.ab;
            int var48;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < var47) {
                  if (var2 > var47) {
                     var2 = var47;
                  }

                  if (var3 > var47) {
                     var3 = var47;
                  }

                  var10 = (var10 << 9) - var34 * var4 + var34;
                  if (var2 < var3) {
                     var6 = var4 <<= 14;
                     if (var1 < 0) {
                        var6 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var31 * var2;
                        var2 = 0;
                     }

                     var48 = var1 - this.at.af;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if ((var1 == var2 || var32 >= var30) && (var1 != var2 || var32 <= var31)) {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var31 * var3;
                        var3 = 0;
                     }

                     var48 = var1 - this.at.af;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var1 != var3 && var32 < var30 || var1 == var3 && var31 > var30) {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < var47) {
                  if (var3 > var47) {
                     var3 = var47;
                  }

                  if (var1 > var47) {
                     var1 = var47;
                  }

                  var11 = (var11 << 9) - var34 * var5 + var34;
                  if (var3 < var1) {
                     var4 = var5 <<= 14;
                     if (var2 < 0) {
                        var4 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var32 * var3;
                        var3 = 0;
                     }

                     var48 = var2 - this.at.af;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if ((var2 == var3 || var30 >= var31) && (var2 != var3 || var30 <= var32)) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var6 = var5 <<= 14;
                     if (var2 < 0) {
                        var6 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var32 * var1;
                        var1 = 0;
                     }

                     var48 = var2 - this.at.af;
                     var37 += var39 * var48;
                     var40 += var42 * var48;
                     var43 += var45 * var48;
                     if (var30 < var31) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.bl(al, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bl(al, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var3 < var47) {
               if (var1 > var47) {
                  var1 = var47;
               }

               if (var2 > var47) {
                  var2 = var47;
               }

               var12 = (var12 << 9) - var34 * var6 + var34;
               if (var1 < var2) {
                  var5 = var6 <<= 14;
                  if (var3 < 0) {
                     var5 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var30 * var1;
                     var1 = 0;
                  }

                  var48 = var3 - this.at.af;
                  var37 += var39 * var48;
                  var40 += var42 * var48;
                  var43 += var45 * var48;
                  if (var31 < var32) {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bl(al, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bl(al, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bl(al, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bl(al, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               } else {
                  var4 = var6 <<= 14;
                  if (var3 < 0) {
                     var4 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var30 * var2;
                     var2 = 0;
                  }

                  var48 = var3 - this.at.af;
                  var37 += var39 * var48;
                  var40 += var42 * var48;
                  var43 += var45 * var48;
                  if (var31 < var32) {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bl(al, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bl(al, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bl(al, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bl(al, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               }
            }
         }
      }
   }

   void by(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.at.as.ak(var22, (byte)-94);
      int var24;
      if (var23 == null) {
         var24 = this.at.as.aj(var22, (byte)-123);
         this.ay(var1, var2, var3, var4, var5, var6, var7, var8, var9, ak(var24, var10), ak(var24, var11), ak(var24, var12));
      } else {
         this.aw = this.at.as.ay(var22, (byte)23);
         this.ap = this.at.as.ai(var22, (byte)-16);
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
            int var36 = this.at.ay;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var37 = var15 * var16 - var18 * var13 << 14;
            int var38 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / (long)var36);
            int var39 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var36);
            int var40 = var14 * var16 - var17 * var13 << 14;
            int var41 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / (long)var36);
            int var42 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var36);
            int var43 = var17 * var15 - var14 * var18 << 14;
            int var44 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / (long)var36);
            int var45 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var36);
            int[] var46 = this.at.av;
            int var47 = this.at.ab;
            int var48 = this.at.af;
            int var49;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < var47) {
                  if (var2 > var47) {
                     var2 = var47;
                  }

                  if (var3 > var47) {
                     var3 = var47;
                  }

                  var10 = (var10 << 9) - var34 * var4 + var34;
                  if (var2 < var3) {
                     var6 = var4 <<= 14;
                     if (var1 < 0) {
                        var6 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var31 * var2;
                        var2 = 0;
                     }

                     var49 = var1 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if (var1 != var2 && var32 < var30 || var1 == var2 && var32 > var31) {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var31 * var3;
                        var3 = 0;
                     }

                     var49 = var1 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if ((var1 == var3 || var32 >= var30) && (var1 != var3 || var31 <= var30)) {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < var47) {
                  if (var3 > var47) {
                     var3 = var47;
                  }

                  if (var1 > var47) {
                     var1 = var47;
                  }

                  var11 = (var11 << 9) - var34 * var5 + var34;
                  if (var3 < var1) {
                     var4 = var5 <<= 14;
                     if (var2 < 0) {
                        var4 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var32 * var3;
                        var3 = 0;
                     }

                     var49 = var2 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if (var2 != var3 && var30 < var31 || var2 == var3 && var30 > var32) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var6 = var5 <<= 14;
                     if (var2 < 0) {
                        var6 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var32 * var1;
                        var1 = 0;
                     }

                     var49 = var2 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if (var30 < var31) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var3 < var47) {
               if (var1 > var47) {
                  var1 = var47;
               }

               if (var2 > var47) {
                  var2 = var47;
               }

               var12 = (var12 << 9) - var34 * var6 + var34;
               if (var1 < var2) {
                  var5 = var6 <<= 14;
                  if (var3 < 0) {
                     var5 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var30 * var1;
                     var1 = 0;
                  }

                  var49 = var3 - var48;
                  var37 += var39 * var49;
                  var40 += var42 * var49;
                  var43 += var45 * var49;
                  if (var31 < var32) {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.be(al, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.be(al, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.be(al, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.be(al, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               } else {
                  var4 = var6 <<= 14;
                  if (var3 < 0) {
                     var4 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var30 * var2;
                     var2 = 0;
                  }

                  var49 = var3 - var48;
                  var37 += var39 * var49;
                  var40 += var42 * var49;
                  var43 += var45 * var49;
                  if (var31 < var32) {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.be(al, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.be(al, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.be(al, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.be(al, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               }
            }
         }
      }
   }

   void bx(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10) {
      int var11 = 0;
      if (var2 != var1) {
         var11 = (var5 - var4 << 14) / (var2 - var1);
      }

      int var12 = 0;
      if (var3 != var2) {
         var12 = (var6 - var5 << 14) / (var3 - var2);
      }

      int var13 = 0;
      if (var3 != var1) {
         var13 = (var4 - var6 << 14) / (var1 - var3);
      }

      int[] var14 = this.at.av;
      int var15 = this.at.ab;
      if (var1 <= var2 && var1 <= var3) {
         if (var1 < var15) {
            if (var2 > var15) {
               var2 = var15;
            }

            if (var3 > var15) {
               var3 = var15;
            }

            if (var2 < var3) {
               var6 = var4 <<= 14;
               if (var1 < 0) {
                  var6 -= var13 * var1;
                  var4 -= var11 * var1;
                  var1 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var12 * var2;
                  var2 = 0;
               }

               if (var1 != var2 && var13 < var11 || var1 == var2 && var13 > var12) {
                  var3 -= var2;
                  var2 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bg(al, var1, var10, 0, var6 >> 14, var5 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += aa;
                        }
                     }

                     this.bg(al, var1, var10, 0, var6 >> 14, var4 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += aa;
                  }
               } else {
                  var3 -= var2;
                  var2 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bg(al, var1, var10, 0, var5 >> 14, var6 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += aa;
                        }
                     }

                     this.bg(al, var1, var10, 0, var4 >> 14, var6 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += aa;
                  }
               }
            } else {
               var5 = var4 <<= 14;
               if (var1 < 0) {
                  var5 -= var13 * var1;
                  var4 -= var11 * var1;
                  var1 = 0;
               }

               var6 <<= 14;
               if (var3 < 0) {
                  var6 -= var12 * var3;
                  var3 = 0;
               }

               if ((var1 == var3 || var13 >= var11) && (var1 != var3 || var12 <= var11)) {
                  var2 -= var3;
                  var3 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bg(al, var1, var10, 0, var4 >> 14, var6 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += aa;
                        }
                     }

                     this.bg(al, var1, var10, 0, var4 >> 14, var5 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += aa;
                  }
               } else {
                  var2 -= var3;
                  var3 -= var1;
                  var1 = var14[var1];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bg(al, var1, var10, 0, var6 >> 14, var4 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += aa;
                        }
                     }

                     this.bg(al, var1, var10, 0, var5 >> 14, var4 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += aa;
                  }
               }
            }
         }
      } else if (var2 <= var3) {
         if (var2 < var15) {
            if (var3 > var15) {
               var3 = var15;
            }

            if (var1 > var15) {
               var1 = var15;
            }

            if (var3 < var1) {
               var4 = var5 <<= 14;
               if (var2 < 0) {
                  var4 -= var11 * var2;
                  var5 -= var12 * var2;
                  var2 = 0;
               }

               var6 <<= 14;
               if (var3 < 0) {
                  var6 -= var13 * var3;
                  var3 = 0;
               }

               if (var2 != var3 && var11 < var12 || var2 == var3 && var11 > var13) {
                  var1 -= var3;
                  var3 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bg(al, var2, var10, 0, var4 >> 14, var6 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += aa;
                        }
                     }

                     this.bg(al, var2, var10, 0, var4 >> 14, var5 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += aa;
                  }
               } else {
                  var1 -= var3;
                  var3 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var3;
                     if (var3 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bg(al, var2, var10, 0, var6 >> 14, var4 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += aa;
                        }
                     }

                     this.bg(al, var2, var10, 0, var5 >> 14, var4 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += aa;
                  }
               }
            } else {
               var6 = var5 <<= 14;
               if (var2 < 0) {
                  var6 -= var11 * var2;
                  var5 -= var12 * var2;
                  var2 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var13 * var1;
                  var1 = 0;
               }

               if (var11 < var12) {
                  var3 -= var1;
                  var1 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bg(al, var2, var10, 0, var4 >> 14, var5 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += aa;
                        }
                     }

                     this.bg(al, var2, var10, 0, var6 >> 14, var5 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += aa;
                  }
               } else {
                  var3 -= var1;
                  var1 -= var2;
                  var2 = var14[var2];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              return;
                           }

                           this.bg(al, var2, var10, 0, var5 >> 14, var4 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += aa;
                        }
                     }

                     this.bg(al, var2, var10, 0, var5 >> 14, var6 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += aa;
                  }
               }
            }
         }
      } else if (var3 < var15) {
         if (var1 > var15) {
            var1 = var15;
         }

         if (var2 > var15) {
            var2 = var15;
         }

         if (var1 < var2) {
            var5 = var6 <<= 14;
            if (var3 < 0) {
               var5 -= var12 * var3;
               var6 -= var13 * var3;
               var3 = 0;
            }

            var4 <<= 14;
            if (var1 < 0) {
               var4 -= var11 * var1;
               var1 = 0;
            }

            if (var12 < var13) {
               var2 -= var1;
               var1 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        this.bg(al, var3, var10, 0, var5 >> 14, var4 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += aa;
                     }
                  }

                  this.bg(al, var3, var10, 0, var5 >> 14, var6 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += aa;
               }
            } else {
               var2 -= var1;
               var1 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var1;
                  if (var1 < 0) {
                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           return;
                        }

                        this.bg(al, var3, var10, 0, var4 >> 14, var5 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += aa;
                     }
                  }

                  this.bg(al, var3, var10, 0, var6 >> 14, var5 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += aa;
               }
            }
         } else {
            var4 = var6 <<= 14;
            if (var3 < 0) {
               var4 -= var12 * var3;
               var6 -= var13 * var3;
               var3 = 0;
            }

            var5 <<= 14;
            if (var2 < 0) {
               var5 -= var11 * var2;
               var2 = 0;
            }

            if (var12 < var13) {
               var1 -= var2;
               var2 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        this.bg(al, var3, var10, 0, var5 >> 14, var6 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += aa;
                     }
                  }

                  this.bg(al, var3, var10, 0, var4 >> 14, var6 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += aa;
               }
            } else {
               var1 -= var2;
               var2 -= var3;
               var3 = var14[var3];

               while(true) {
                  --var2;
                  if (var2 < 0) {
                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           return;
                        }

                        this.bg(al, var3, var10, 0, var6 >> 14, var5 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += aa;
                     }
                  }

                  this.bg(al, var3, var10, 0, var6 >> 14, var4 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += aa;
               }
            }
         }
      }
   }

   void bn(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.at.as.ak(var22, (byte)-50);
      int var24;
      if (var23 == null) {
         var24 = this.at.as.aj(var22, (byte)-74);
         this.ay(var1, var2, var3, var4, var5, var6, var7, var8, var9, ak(var24, var10), ak(var24, var11), ak(var24, var12));
      } else {
         this.aw = this.at.as.ay(var22, (byte)23);
         this.ap = this.at.as.ai(var22, (byte)38);
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
            int var36 = this.at.ay;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var37 = var15 * var16 - var18 * var13 << 14;
            int var38 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / (long)var36);
            int var39 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var36);
            int var40 = var14 * var16 - var17 * var13 << 14;
            int var41 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / (long)var36);
            int var42 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var36);
            int var43 = var17 * var15 - var14 * var18 << 14;
            int var44 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / (long)var36);
            int var45 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var36);
            int[] var46 = this.at.av;
            int var47 = this.at.ab;
            int var48 = this.at.af;
            int var49;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < var47) {
                  if (var2 > var47) {
                     var2 = var47;
                  }

                  if (var3 > var47) {
                     var3 = var47;
                  }

                  var10 = (var10 << 9) - var34 * var4 + var34;
                  if (var2 < var3) {
                     var6 = var4 <<= 14;
                     if (var1 < 0) {
                        var6 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var31 * var2;
                        var2 = 0;
                     }

                     var49 = var1 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if ((var1 == var2 || var32 >= var30) && (var1 != var2 || var32 <= var31)) {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var31 * var3;
                        var3 = 0;
                     }

                     var49 = var1 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if (var1 != var3 && var32 < var30 || var1 == var3 && var31 > var30) {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < var47) {
                  if (var3 > var47) {
                     var3 = var47;
                  }

                  if (var1 > var47) {
                     var1 = var47;
                  }

                  var11 = (var11 << 9) - var34 * var5 + var34;
                  if (var3 < var1) {
                     var4 = var5 <<= 14;
                     if (var2 < 0) {
                        var4 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var32 * var3;
                        var3 = 0;
                     }

                     var49 = var2 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if ((var2 == var3 || var30 >= var31) && (var2 != var3 || var30 <= var32)) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var6 = var5 <<= 14;
                     if (var2 < 0) {
                        var6 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var32 * var1;
                        var1 = 0;
                     }

                     var49 = var2 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if (var30 < var31) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var3 < var47) {
               if (var1 > var47) {
                  var1 = var47;
               }

               if (var2 > var47) {
                  var2 = var47;
               }

               var12 = (var12 << 9) - var34 * var6 + var34;
               if (var1 < var2) {
                  var5 = var6 <<= 14;
                  if (var3 < 0) {
                     var5 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var30 * var1;
                     var1 = 0;
                  }

                  var49 = var3 - var48;
                  var37 += var39 * var49;
                  var40 += var42 * var49;
                  var43 += var45 * var49;
                  if (var31 < var32) {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.be(al, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.be(al, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.be(al, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.be(al, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               } else {
                  var4 = var6 <<= 14;
                  if (var3 < 0) {
                     var4 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var30 * var2;
                     var2 = 0;
                  }

                  var49 = var3 - var48;
                  var37 += var39 * var49;
                  var40 += var42 * var49;
                  var43 += var45 * var49;
                  if (var31 < var32) {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.be(al, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.be(al, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.be(al, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.be(al, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               }
            }
         }
      }
   }

   final void cq(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.at.ap) {
         if (var6 > this.at.ar) {
            var6 = this.at.ar;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var7 += var8 * var5;
         int var9;
         int var10;
         int var11;
         int var12;
         if (this.at.aw) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.at.ak == 0) {
               if (var4 > 0) {
                  do {
                     var9 = (var7 & (var7 >> 1147254268 & 1) - 1) >> 8;
                     var3 = this.am[var9];
                     var7 += var8;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.am[var9];

                  do {
                     var1[var2++] = var3;
                     --var4;
                  } while(var4 > 0);
               }
            } else {
               var9 = this.at.ak;
               var10 = -1182409300 - this.at.ak;
               if (var4 > 0) {
                  do {
                     var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.am[var11];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & -1161859645) * var10 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 1558339968) * var9 >> 8 & -486686645) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & -1974375196) * var9 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 1705209483) + ((var12 & '\uff00') * var9 >> 8 & 2070101775);
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var11 = (var7 & (var7 >> -671740621 & 1) - 1) >> 8;
                  var3 = this.am[var11];
                  var3 = ((var3 & 16711935) * var10 >> 8 & 1164447590) + ((var3 & -960529587) * var10 >> 8 & 1085468999);

                  do {
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & -1244699842) * var9 >> 8 & -211847215) + ((var12 & -58325655) * var9 >> 8 & '\uff00');
                     --var4;
                  } while(var4 > 0);
               }
            }

         } else {
            var4 = var6 - var5;
            if (this.at.ak == 0) {
               do {
                  var9 = (var7 & (var7 >> -2117365417 & 1) - 1) >> 8;
                  var1[var2++] = this.am[var9];
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            } else {
               var9 = this.at.ak;
               var10 = 256 - this.at.ak;

               do {
                  var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.am[var11];
                  var7 += var8;
                  var3 = ((var3 & 176670765) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & -1671001974);
                  var12 = var1[var2];
                  var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 1442526022) * var9 >> 8 & '\uff00');
                  --var4;
               } while(var4 > 0);
            }

         }
      }
   }

   final void cb(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.at.ap) {
         if (var6 > this.at.ar) {
            var6 = this.at.ar;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var7 += var8 * var5;
         int var9;
         int var10;
         int var11;
         int var12;
         if (this.at.aw) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.at.ak == 0) {
               if (var4 > 0) {
                  do {
                     var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.am[var9];
                     var7 += var8;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.am[var9];

                  do {
                     var1[var2++] = var3;
                     --var4;
                  } while(var4 > 0);
               }
            } else {
               var9 = this.at.ak;
               var10 = -1531981310 - this.at.ak;
               if (var4 > 0) {
                  do {
                     var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.am[var11];
                     var7 += var8;
                     var3 = ((var3 & -1831399624) * var10 >> 8 & 16711935) + ((var3 & -1524470221) * var10 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & -763171647) * var9 >> 8 & 1537923455) + ((var12 & -160162381) * var9 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & 1023832706);
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & -1383926012) + ((var12 & -1465159600) * var9 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 1549357893) + ((var12 & '\uff00') * var9 >> 8 & 1948982283);
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var11 = (var7 & (var7 >> -610419459 & 1) - 1) >> 8;
                  var3 = this.am[var11];
                  var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & 541000542);

                  do {
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 750053603) + ((var12 & '\uff00') * var9 >> 8 & -1769942280);
                     --var4;
                  } while(var4 > 0);
               }
            }

         } else {
            var4 = var6 - var5;
            if (this.at.ak == 0) {
               do {
                  var9 = (var7 & (var7 >> 38490759 & 1) - 1) >> 8;
                  var1[var2++] = this.am[var9];
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            } else {
               var9 = this.at.ak;
               var10 = 256 - this.at.ak;

               do {
                  var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.am[var11];
                  var7 += var8;
                  var3 = ((var3 & 16711935) * var10 >> 8 & -390345274) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');
                  var12 = var1[var2];
                  var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & -284303509) + ((var12 & 1053542204) * var9 >> 8 & -977087084);
                  --var4;
               } while(var4 > 0);
            }

         }
      }
   }

   final void cd(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (this.at.ap) {
         if (var6 > this.at.ar) {
            var6 = this.at.ar;
         }

         if (var5 < 0) {
            var5 = 0;
         }
      }

      if (var5 < var6) {
         var2 += var5;
         var7 += var8 * var5;
         int var9;
         int var10;
         int var11;
         int var12;
         if (this.at.aw) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.at.ak == 0) {
               if (var4 > 0) {
                  do {
                     var9 = (var7 & (var7 >> -1336499692 & 1) - 1) >> 8;
                     var3 = this.am[var9];
                     var7 += var8;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     var1[var2++] = var3;
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.am[var9];

                  do {
                     var1[var2++] = var3;
                     --var4;
                  } while(var4 > 0);
               }
            } else {
               var9 = this.at.ak;
               var10 = 647941442 - this.at.ak;
               if (var4 > 0) {
                  do {
                     var11 = (var7 & (var7 >> 418416042 & 1) - 1) >> 8;
                     var3 = this.am[var11];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var10 >> 8 & -569709708) + ((var3 & 82631481) * var10 >> 8 & -1468720793);
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & -2116783617);
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & -23460486) + ((var12 & -1012766278) * var9 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 1452159651) * var9 >> 8 & 16711935) + ((var12 & -167664427) * var9 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 1354419881) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & 1306075693);
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var11 = (var7 & (var7 >> -1266009732 & 1) - 1) >> 8;
                  var3 = this.am[var11];
                  var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & -1812168705) * var10 >> 8 & '\uff00');

                  do {
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & -1864300073) + ((var12 & 1149588334) * var9 >> 8 & '\uff00');
                     --var4;
                  } while(var4 > 0);
               }
            }

         } else {
            var4 = var6 - var5;
            if (this.at.ak == 0) {
               do {
                  var9 = (var7 & (var7 >> 1431715503 & 1) - 1) >> 8;
                  var1[var2++] = this.am[var9];
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            } else {
               var9 = this.at.ak;
               var10 = 256 - this.at.ak;

               do {
                  var11 = (var7 & (var7 >> 264240036 & 1) - 1) >> 8;
                  var3 = this.am[var11];
                  var7 += var8;
                  var3 = ((var3 & 684686956) * var10 >> 8 & 1704794076) + ((var3 & 1834337385) * var10 >> 8 & '\uff00');
                  var12 = var1[var2];
                  var1[var2++] = var3 + ((var12 & 1067711935) * var9 >> 8 & -1091478730) + ((var12 & -593292127) * var9 >> 8 & '\uff00');
                  --var4;
               } while(var4 > 0);
            }

         }
      }
   }

   void bl(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      if (this.at.ap) {
         if (var7 > this.at.ar) {
            var7 = this.at.ar;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var16;
         int var10000;
         int var17;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var24;
         if (this.aw) {
            var24 = var6 - this.at.ao;
            var10 += (var13 >> 3) * var24;
            var11 += (var14 >> 3) * var24;
            var12 += (var15 >> 3) * var24;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
               if (var19 < 0) {
                  var19 = 0;
               } else if (var19 > 4032) {
                  var19 = 4032;
               }
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13;
            var11 += var14;
            var12 += var15;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
               if (var21 < 0) {
                  var21 = 0;
               } else if (var21 > 4032) {
                  var21 = 4032;
               }
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 20) + var20;
            var17 = (var21 - var19 >> 3 << 20) + (var22 - var20 >> 3);
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.ap) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var10000 = var3 + var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 12;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 4032) {
                           var21 = 4032;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 20) + var20;
                     var17 = (var21 - var19 >> 3 << 20) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var10000 = var3 + var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 12;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 4032) {
                           var21 = 4032;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 20) + var20;
                     var17 = (var21 - var19 >> 3 << 20) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         } else {
            var24 = var6 - this.at.ao;
            var10 += (var13 >> 3) * var24;
            var11 += (var14 >> 3) * var24;
            var12 += (var15 >> 3) * var24;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
               if (var19 < 0) {
                  var19 = 0;
               } else if (var19 > 16256) {
                  var19 = 16256;
               }
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13;
            var11 += var14;
            var12 += var15;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
               if (var21 < 0) {
                  var21 = 0;
               } else if (var21 > 16256) {
                  var21 = 16256;
               }
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 18) + var20;
            var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.ap) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var10000 = var3 + var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 16256) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var10000 = var3 + var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 16256) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         }

      }
   }

   void cn(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      if (this.at.ap) {
         if (var7 > this.at.ar) {
            var7 = this.at.ar;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var16;
         int var10000;
         int var17;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var24;
         if (this.aw) {
            var24 = var6 - this.at.ao;
            var10 += (var13 >> 3) * var24;
            var11 += (var14 >> 3) * var24;
            var12 += (var15 >> 3) * var24;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
               if (var19 < 0) {
                  var19 = 0;
               } else if (var19 > 1515201844) {
                  var19 = -1242541213;
               }
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13;
            var11 += var14;
            var12 += var15;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
               if (var21 < 0) {
                  var21 = 0;
               } else if (var21 > 4032) {
                  var21 = -1214579850;
               }
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 20) + var20;
            var17 = (var21 - var19 >> 3 << 20) + (var22 - var20 >> 3);
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.ap) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & -432449780) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & 52833691) + ((var4 & 1255662345) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 1830897516) * var16 & 1825593527) + ((var4 & -1557128103) * var16 & 1985286421) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 2091672969) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -1492021736) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 1626873705) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & -189871912) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 1245278526) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 1307465904) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -625104131) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 1720530598) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 1684239487) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 1334086758) * var16 & 771015715) + ((var4 & -1297198453) * var16 & 521025338) >> 8;
                     var10000 = var3 + var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 12;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 4032) {
                           var21 = 1721387523;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 20) + var20;
                     var17 = (var21 - var19 >> 3 << 20) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & -920803289) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & -1941569219) * var16 & -16711936) + ((var4 & 892232957) * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & 674889115) + ((var4 & -1487574096) * var16 & 1885504363) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & -219699375) * var16 & 1494353956) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 1460934550) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & -635267068) * var16 & 1891118668) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 357447668) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & -2129745076) * var16 & 888920300) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & -1852916904) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 2144731244) * var16 & 323867379) >> 8;
                     }

                     ++var5;
                     var10000 = var3 + var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 12;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 4032) {
                           var21 = 4032;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 20) + var20;
                     var17 = (var21 - var19 >> 3 << 20) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & -1677747217) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 167982438) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 1768222420) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         } else {
            var24 = var6 - this.at.ao;
            var10 += (var13 >> 3) * var24;
            var11 += (var14 >> 3) * var24;
            var12 += (var15 >> 3) * var24;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
               if (var19 < 0) {
                  var19 = 0;
               } else if (var19 > 16256) {
                  var19 = 16256;
               }
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13;
            var11 += var14;
            var12 += var15;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
               if (var21 < 0) {
                  var21 = 0;
               } else if (var21 > 16256) {
                  var21 = 745811904;
               }
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 18) + var20;
            var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.ap) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 709096819) * var16 & -16711936) + ((var4 & 817731763) * var16 & 187682557) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 212359113) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 221522223) * var16 & -16711936) + ((var4 & -336191792) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 2092161347) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 1391104616) * var16 & -16711936) + ((var4 & '\uff00') * var16 & -590387200) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -694570892) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -1733095859) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -841157089) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -1270261935) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -704293706) * var16 & 663188911) + ((var4 & -1739436402) * var16 & -713931506) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -1407718608) * var16 & -710855108) + ((var4 & -1207604975) * var16 & -21196638) >> 8;
                     var10000 = var3 + var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 16256) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 1629796135) * var16 & 1335323864) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & -1672166480) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & -1862248288) * var16 & -1923422411) + ((var4 & -587862198) * var16 & -1111285390) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 284619292) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -839115085) + ((var4 & 1915548438) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 71564701) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & -713382507) * var16 & 1971181687) + ((var4 & '\uff00') * var16 & 1619948500) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -2095464805) + ((var4 & -244965162) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 1925132593) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & -1936613893) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & -928445959) * var16 & -16711936) + ((var4 & -1011231623) * var16 & -579834546) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -588601290) + ((var4 & 619735955) * var16 & 1359841744) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 1683095019) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & 1653362411) + ((var4 & -10822341) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var10000 = var3 + var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 316763913) {
                           var21 = -918576946;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & -903936130) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 769143544) * var16 & -16711936) + ((var4 & '\uff00') * var16 & -301818656) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         }

      }
   }

   void co(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      if (this.at.ap) {
         if (var7 > this.at.ar) {
            var7 = this.at.ar;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var16;
         int var10000;
         int var17;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var24;
         if (this.aw) {
            var24 = var6 - this.at.ao;
            var10 += (var13 >> 3) * var24;
            var11 += (var14 >> 3) * var24;
            var12 += (var15 >> 3) * var24;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
               if (var19 < 0) {
                  var19 = 0;
               } else if (var19 > 4032) {
                  var19 = 4032;
               }
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13;
            var11 += var14;
            var12 += var15;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
               if (var21 < 0) {
                  var21 = 0;
               } else if (var21 > 4032) {
                  var21 = 4032;
               }
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 20) + var20;
            var17 = (var21 - var19 >> 3 << 20) + (var22 - var20 >> 3);
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.ap) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var10000 = var3 + var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 12;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 4032) {
                           var21 = 4032;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 20) + var20;
                     var17 = (var21 - var19 >> 3 << 20) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var10000 = var3 + var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 12;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 4032) {
                           var21 = 4032;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 20) + var20;
                     var17 = (var21 - var19 >> 3 << 20) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         } else {
            var24 = var6 - this.at.ao;
            var10 += (var13 >> 3) * var24;
            var11 += (var14 >> 3) * var24;
            var12 += (var15 >> 3) * var24;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
               if (var19 < 0) {
                  var19 = 0;
               } else if (var19 > 16256) {
                  var19 = 16256;
               }
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13;
            var11 += var14;
            var12 += var15;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
               if (var21 < 0) {
                  var21 = 0;
               } else if (var21 > 16256) {
                  var21 = 16256;
               }
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 18) + var20;
            var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.ap) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var10000 = var3 + var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 16256) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var10000 = var3 + var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 16256) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         }

      }
   }

   void cf(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      if (this.at.ap) {
         if (var7 > this.at.ar) {
            var7 = this.at.ar;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var16;
         int var10000;
         int var17;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var24;
         if (this.aw) {
            var24 = var6 - this.at.ao;
            var10 += (var13 >> 3) * var24;
            var11 += (var14 >> 3) * var24;
            var12 += (var15 >> 3) * var24;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
               if (var19 < 0) {
                  var19 = 0;
               } else if (var19 > 357007719) {
                  var19 = 4032;
               }
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13;
            var11 += var14;
            var12 += var15;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
               if (var21 < 0) {
                  var21 = 0;
               } else if (var21 > -1583134957) {
                  var21 = 4032;
               }
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 20) + var20;
            var17 = (var21 - var19 >> 3 << 20) + (var22 - var20 >> 3);
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.ap) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & -540110276) * var16 & -1372817051) + ((var4 & '\uff00') * var16 & -862366792) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & -1484133141) * var16 & -16711936) + ((var4 & 988966241) * var16 & 2069729382) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 402682141) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 563625634) * var16 & 379159429) + ((var4 & -721010919) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 305798271) * var16 & -669457832) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & -594544831) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -1028123919) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & -587545961) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 1567999595) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 952428794) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 1479759196) * var16 & -16711936) + ((var4 & 148873985) * var16 & -1526669622) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -1884092884) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & -2123692010) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 211749695) >> 8;
                     var10000 = var3 + var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 12;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > -2038382471) {
                           var21 = 1720956719;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 20) + var20;
                     var17 = (var21 - var19 >> 3 << 20) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 1715965797) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 975886423) * var16 & -16711936) + ((var4 & 923420023) * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 1499632624) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & -232421587) * var16 & -16711936) + ((var4 & 314262891) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 2111785872) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 1515681321) * var16 & 466797272) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 50935777) * var16 & 1897820309) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 1813402223) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & -1854766281) * var16 & -1399552356) + ((var4 & -579615297) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 1325976793) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & -1322521985) * var16 & 1013515879) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 180305198) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & -867448473) * var16 & -917152263) + ((var4 & -893879433) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -1436669693) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var10000 = var3 + var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 12;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > -635321890) {
                           var21 = 823529584;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 20) + var20;
                     var17 = (var21 - var19 >> 3 << 20) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 674334131) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -1694602747) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         } else {
            var24 = var6 - this.at.ao;
            var10 += (var13 >> 3) * var24;
            var11 += (var14 >> 3) * var24;
            var12 += (var15 >> 3) * var24;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
               if (var19 < 0) {
                  var19 = 0;
               } else if (var19 > 16256) {
                  var19 = 751872306;
               }
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13;
            var11 += var14;
            var12 += var15;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
               if (var21 < 0) {
                  var21 = 0;
               } else if (var21 > 16256) {
                  var21 = 16256;
               }
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 18) + var20;
            var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.ap) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 1477006988) * var16 & -16711936) + ((var4 & -728881227) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 1872911780) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 1220071283) * var16 & -1919112235) + ((var4 & 95213531) * var16 & 1710422644) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 669229443) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -401453033) * var16 & -1205251626) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 391294072) * var16 & -16711936) + ((var4 & '\uff00') * var16 & -621344833) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -915103945) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 1460615246) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 738714263) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 93716638) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -928756413) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 1970532536) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -1956261320) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 2092054324) * var16 & 1230452176) >> 8;
                     var10000 = var3 + var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 16256) {
                           var21 = -1228189192;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 1486465107) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -359940795) * var16 & -16711936) + ((var4 & -793089521) * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & -1531263422) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & -64960233) * var16 & 691925212) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 385790701) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 2079552070) * var16 & -16711936) + ((var4 & -364594194) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 482861567) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & 506773779) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -1779671333) + ((var4 & '\uff00') * var16 & -1110264499) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 1567347442) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & 898475204) + ((var4 & 400765306) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & -1849738400) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 854511595) * var16 & 1537165388) + ((var4 & 1973601010) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 1647422015) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & -28626202) * var16 & -16711936) + ((var4 & 931387317) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var10000 = var3 + var17;
                     var19 = var21;
                     var20 = var22;
                     var10 += var13;
                     var11 += var14;
                     var12 += var15;
                     var23 = var12 >> 14;
                     if (var23 != 0) {
                        var21 = var10 / var23;
                        var22 = var11 / var23;
                        if (var21 < 0) {
                           var21 = 0;
                        } else if (var21 > 91488087) {
                           var21 = 16256;
                        }
                     } else {
                        var21 = 0;
                        var22 = 0;
                     }

                     var3 = (var19 << 18) + var20;
                     var17 = (var21 - var19 >> 3 << 18) + (var22 - var20 >> 3);
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & -1193036342) * var16 & -1806490213) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         }

      }
   }

   void cl(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
      if (this.at.ap) {
         if (var7 > this.at.ar) {
            var7 = this.at.ar;
         }

         if (var6 < 0) {
            var6 = 0;
         }
      }

      if (var6 < var7) {
         var5 += var6;
         var8 += var9 * var6;
         int var18 = var7 - var6;
         int var16;
         int var17;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var24;
         if (this.aw) {
            var24 = var6 - this.at.ao;
            var10 += var13 * var24;
            var11 += var14 * var24;
            var12 += var15 * var24;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13 * var18;
            var11 += var14 * var18;
            var12 += var15 * var18;
            var23 = var12 >> 12;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 20) + var20;
            var17 = ((var21 - var19) / var18 << 20) + (var22 - var20) / var18;
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.ap) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         } else {
            var24 = var6 - this.at.ao;
            var10 += var13 * var24;
            var11 += var14 * var24;
            var12 += var15 * var24;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
            } else {
               var19 = 0;
               var20 = 0;
            }

            var10 += var13 * var18;
            var11 += var14 * var18;
            var12 += var15 * var18;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var21 = var10 / var23;
               var22 = var11 / var23;
            } else {
               var21 = 0;
               var22 = 0;
            }

            var3 = (var19 << 18) + var20;
            var17 = ((var21 - var19) / var18 << 18) + (var22 - var20) / var18;
            var18 >>= 3;
            var9 <<= 3;
            var16 = var8 >> 8;
            if (this.ap) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         }

      }
   }

   void br(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.at.as.ak(var22, (byte)50);
      int var24;
      if (var23 == null) {
         var24 = this.at.as.aj(var22, (byte)-70);
         this.ay(var1, var2, var3, var4, var5, var6, var7, var8, var9, ak(var24, var10), ak(var24, var11), ak(var24, var12));
      } else {
         this.aw = this.at.as.ay(var22, (byte)23);
         this.ap = this.at.as.ai(var22, (byte)-66);
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
            int var36 = this.at.ay;
            var14 = var13 - var14;
            var17 = var16 - var17;
            var20 = var19 - var20;
            var15 -= var13;
            var18 -= var16;
            var21 -= var19;
            int var37 = var15 * var16 - var18 * var13 << 14;
            int var38 = (int)(((long)(var18 * var19 - var21 * var16) << 14) / (long)var36);
            int var39 = (int)(((long)(var21 * var13 - var15 * var19) << 14) / (long)var36);
            int var40 = var14 * var16 - var17 * var13 << 14;
            int var41 = (int)(((long)(var17 * var19 - var20 * var16) << 14) / (long)var36);
            int var42 = (int)(((long)(var20 * var13 - var14 * var19) << 14) / (long)var36);
            int var43 = var17 * var15 - var14 * var18 << 14;
            int var44 = (int)(((long)(var20 * var18 - var17 * var21) << 14) / (long)var36);
            int var45 = (int)(((long)(var14 * var21 - var20 * var15) << 14) / (long)var36);
            int[] var46 = this.at.av;
            int var47 = this.at.ab;
            int var48 = this.at.af;
            int var49;
            if (var1 <= var2 && var1 <= var3) {
               if (var1 < var47) {
                  if (var2 > var47) {
                     var2 = var47;
                  }

                  if (var3 > var47) {
                     var3 = var47;
                  }

                  var10 = (var10 << 9) - var34 * var4 + var34;
                  if (var2 < var3) {
                     var6 = var4 <<= 14;
                     if (var1 < 0) {
                        var6 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var5 <<= 14;
                     if (var2 < 0) {
                        var5 -= var31 * var2;
                        var2 = 0;
                     }

                     var49 = var1 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if (var1 != var2 && var32 < var30 || var1 == var2 && var32 > var31) {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var2;
                        var2 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var5 = var4 <<= 14;
                     if (var1 < 0) {
                        var5 -= var32 * var1;
                        var4 -= var30 * var1;
                        var10 -= var35 * var1;
                        var1 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var31 * var3;
                        var3 = 0;
                     }

                     var49 = var1 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if (var1 != var3 && var32 < var30 || var1 == var3 && var31 > var30) {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var2 -= var3;
                        var3 -= var1;
                        var1 = var46[var1];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var2;
                                 if (var2 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var2 <= var3) {
               if (var2 < var47) {
                  if (var3 > var47) {
                     var3 = var47;
                  }

                  if (var1 > var47) {
                     var1 = var47;
                  }

                  var11 = (var11 << 9) - var34 * var5 + var34;
                  if (var3 < var1) {
                     var4 = var5 <<= 14;
                     if (var2 < 0) {
                        var4 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var6 <<= 14;
                     if (var3 < 0) {
                        var6 -= var32 * var3;
                        var3 = 0;
                     }

                     var49 = var2 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if (var2 != var3 && var30 < var31 || var2 == var3 && var30 > var32) {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var1 -= var3;
                        var3 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var3;
                           if (var3 < 0) {
                              while(true) {
                                 --var1;
                                 if (var1 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  } else {
                     var6 = var5 <<= 14;
                     if (var2 < 0) {
                        var6 -= var30 * var2;
                        var5 -= var31 * var2;
                        var11 -= var35 * var2;
                        var2 = 0;
                     }

                     var4 <<= 14;
                     if (var1 < 0) {
                        var4 -= var32 * var1;
                        var1 = 0;
                     }

                     var49 = var2 - var48;
                     var37 += var39 * var49;
                     var40 += var42 * var49;
                     var43 += var45 * var49;
                     if (var30 < var31) {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     } else {
                        var3 -= var1;
                        var1 -= var2;
                        var2 = var46[var2];

                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              while(true) {
                                 --var3;
                                 if (var3 < 0) {
                                    return;
                                 }

                                 this.be(al, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += aa;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.be(al, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += aa;
                           var37 += var39;
                           var40 += var42;
                           var43 += var45;
                        }
                     }
                  }
               }
            } else if (var3 < var47) {
               if (var1 > var47) {
                  var1 = var47;
               }

               if (var2 > var47) {
                  var2 = var47;
               }

               var12 = (var12 << 9) - var34 * var6 + var34;
               if (var1 < var2) {
                  var5 = var6 <<= 14;
                  if (var3 < 0) {
                     var5 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var30 * var1;
                     var1 = 0;
                  }

                  var49 = var3 - var48;
                  var37 += var39 * var49;
                  var40 += var42 * var49;
                  var43 += var45 * var49;
                  if (var31 < var32) {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.be(al, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.be(al, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var2 -= var1;
                     var1 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.be(al, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.be(al, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               } else {
                  var4 = var6 <<= 14;
                  if (var3 < 0) {
                     var4 -= var31 * var3;
                     var6 -= var32 * var3;
                     var12 -= var35 * var3;
                     var3 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var30 * var2;
                     var2 = 0;
                  }

                  var49 = var3 - var48;
                  var37 += var39 * var49;
                  var40 += var42 * var49;
                  var43 += var45 * var49;
                  if (var31 < var32) {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.be(al, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.be(al, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  } else {
                     var1 -= var2;
                     var2 -= var3;
                     var3 = var46[var3];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.be(al, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += aa;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.be(al, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += aa;
                        var37 += var39;
                        var40 += var42;
                        var43 += var45;
                     }
                  }
               }
            }
         }
      }
   }

   void ah(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
      int var13 = var5 - var4;
      int var14 = var2 - var1;
      int var15 = var6 - var4;
      int var16 = var3 - var1;
      int var17 = var11 - var10;
      int var18 = var12 - var10;
      int var19;
      if (var3 != var2) {
         var19 = (var6 - var5 << 14) / (var3 - var2);
      } else {
         var19 = 0;
      }

      int var20;
      if (var2 != var1) {
         var20 = (var13 << 14) / var14;
      } else {
         var20 = 0;
      }

      int var21;
      if (var3 != var1) {
         var21 = (var15 << 14) / var16;
      } else {
         var21 = 0;
      }

      int var22 = var13 * var16 - var15 * var14;
      if (var22 != 0) {
         int var23 = (var17 * var16 - var18 * var14 << 8) / var22;
         int var24 = (var18 * var13 - var17 * var15 << 8) / var22;
         int[] var25 = this.at.av;
         int var26 = this.at.ab;
         if (var1 <= var2 && var1 <= var3) {
            if (var1 < var26) {
               if (var2 > var26) {
                  var2 = var26;
               }

               if (var3 > var26) {
                  var3 = var26;
               }

               var10 = (var10 << 8) - var23 * var4 + var23;
               if (var2 < var3) {
                  var6 = var4 <<= 14;
                  if (var1 < 0) {
                     var6 -= var21 * var1;
                     var4 -= var20 * var1;
                     var10 -= var24 * var1;
                     var1 = 0;
                  }

                  var5 <<= 14;
                  if (var2 < 0) {
                     var5 -= var19 * var2;
                     var2 = 0;
                  }

                  if (var1 != var2 && var21 < var20 || var1 == var2 && var21 > var19) {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bf(al, var1, 0, 0, var6 >> 14, var5 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += aa;
                           }
                        }

                        this.bf(al, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += aa;
                     }
                  } else {
                     var3 -= var2;
                     var2 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var2;
                        if (var2 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bf(al, var1, 0, 0, var5 >> 14, var6 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += aa;
                           }
                        }

                        this.bf(al, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += aa;
                     }
                  }
               } else {
                  var5 = var4 <<= 14;
                  if (var1 < 0) {
                     var5 -= var21 * var1;
                     var4 -= var20 * var1;
                     var10 -= var24 * var1;
                     var1 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var19 * var3;
                     var3 = 0;
                  }

                  if (var1 != var3 && var21 < var20 || var1 == var3 && var19 > var20) {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bf(al, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += aa;
                           }
                        }

                        this.bf(al, var1, 0, 0, var5 >> 14, var4 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += aa;
                     }
                  } else {
                     var2 -= var3;
                     var3 -= var1;
                     var1 = var25[var1];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var2;
                              if (var2 < 0) {
                                 return;
                              }

                              this.bf(al, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += aa;
                           }
                        }

                        this.bf(al, var1, 0, 0, var4 >> 14, var5 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += aa;
                     }
                  }
               }
            }
         } else if (var2 <= var3) {
            if (var2 < var26) {
               if (var3 > var26) {
                  var3 = var26;
               }

               if (var1 > var26) {
                  var1 = var26;
               }

               var11 = (var11 << 8) - var23 * var5 + var23;
               if (var3 < var1) {
                  var4 = var5 <<= 14;
                  if (var2 < 0) {
                     var4 -= var20 * var2;
                     var5 -= var19 * var2;
                     var11 -= var24 * var2;
                     var2 = 0;
                  }

                  var6 <<= 14;
                  if (var3 < 0) {
                     var6 -= var21 * var3;
                     var3 = 0;
                  }

                  if (var2 != var3 && var20 < var19 || var2 == var3 && var20 > var21) {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bf(al, var2, 0, 0, var4 >> 14, var6 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += aa;
                           }
                        }

                        this.bf(al, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += aa;
                     }
                  } else {
                     var1 -= var3;
                     var3 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var3;
                        if (var3 < 0) {
                           while(true) {
                              --var1;
                              if (var1 < 0) {
                                 return;
                              }

                              this.bf(al, var2, 0, 0, var6 >> 14, var4 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += aa;
                           }
                        }

                        this.bf(al, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += aa;
                     }
                  }
               } else {
                  var6 = var5 <<= 14;
                  if (var2 < 0) {
                     var6 -= var20 * var2;
                     var5 -= var19 * var2;
                     var11 -= var24 * var2;
                     var2 = 0;
                  }

                  var4 <<= 14;
                  if (var1 < 0) {
                     var4 -= var21 * var1;
                     var1 = 0;
                  }

                  if (var20 < var19) {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bf(al, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += aa;
                           }
                        }

                        this.bf(al, var2, 0, 0, var6 >> 14, var5 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += aa;
                     }
                  } else {
                     var3 -= var1;
                     var1 -= var2;
                     var2 = var25[var2];

                     while(true) {
                        --var1;
                        if (var1 < 0) {
                           while(true) {
                              --var3;
                              if (var3 < 0) {
                                 return;
                              }

                              this.bf(al, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += aa;
                           }
                        }

                        this.bf(al, var2, 0, 0, var5 >> 14, var6 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += aa;
                     }
                  }
               }
            }
         } else if (var3 < var26) {
            if (var1 > var26) {
               var1 = var26;
            }

            if (var2 > var26) {
               var2 = var26;
            }

            var12 = (var12 << 8) - var23 * var6 + var23;
            if (var1 < var2) {
               var5 = var6 <<= 14;
               if (var3 < 0) {
                  var5 -= var19 * var3;
                  var6 -= var21 * var3;
                  var12 -= var24 * var3;
                  var3 = 0;
               }

               var4 <<= 14;
               if (var1 < 0) {
                  var4 -= var20 * var1;
                  var1 = 0;
               }

               if (var19 < var21) {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bf(al, var3, 0, 0, var5 >> 14, var4 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += aa;
                        }
                     }

                     this.bf(al, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += aa;
                  }
               } else {
                  var2 -= var1;
                  var1 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var1;
                     if (var1 < 0) {
                        while(true) {
                           --var2;
                           if (var2 < 0) {
                              return;
                           }

                           this.bf(al, var3, 0, 0, var4 >> 14, var5 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += aa;
                        }
                     }

                     this.bf(al, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += aa;
                  }
               }
            } else {
               var4 = var6 <<= 14;
               if (var3 < 0) {
                  var4 -= var19 * var3;
                  var6 -= var21 * var3;
                  var12 -= var24 * var3;
                  var3 = 0;
               }

               var5 <<= 14;
               if (var2 < 0) {
                  var5 -= var20 * var2;
                  var2 = 0;
               }

               if (var19 < var21) {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bf(al, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += aa;
                        }
                     }

                     this.bf(al, var3, 0, 0, var4 >> 14, var6 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += aa;
                  }
               } else {
                  var1 -= var2;
                  var2 -= var3;
                  var3 = var25[var3];

                  while(true) {
                     --var2;
                     if (var2 < 0) {
                        while(true) {
                           --var1;
                           if (var1 < 0) {
                              return;
                           }

                           this.bf(al, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += aa;
                        }
                     }

                     this.bf(al, var3, 0, 0, var6 >> 14, var4 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += aa;
                  }
               }
            }
         }
      }
   }
}
