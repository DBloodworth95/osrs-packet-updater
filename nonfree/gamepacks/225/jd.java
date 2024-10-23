public class jd extends ji {
   void an(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
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
         int[] var25 = this.ar.ay;
         int var26 = this.ar.az;
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

                              this.bu(aw, var1, 0, 0, var5 >> 14, var6 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += an;
                           }
                        }

                        this.bu(aw, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += an;
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

                              this.bu(aw, var1, 0, 0, var6 >> 14, var5 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += an;
                           }
                        }

                        this.bu(aw, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += an;
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

                              this.bu(aw, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += an;
                           }
                        }

                        this.bu(aw, var1, 0, 0, var5 >> 14, var4 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += an;
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

                              this.bu(aw, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += an;
                           }
                        }

                        this.bu(aw, var1, 0, 0, var4 >> 14, var5 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += an;
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

                              this.bu(aw, var2, 0, 0, var6 >> 14, var4 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += an;
                           }
                        }

                        this.bu(aw, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += an;
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

                              this.bu(aw, var2, 0, 0, var4 >> 14, var6 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += an;
                           }
                        }

                        this.bu(aw, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += an;
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

                              this.bu(aw, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += an;
                           }
                        }

                        this.bu(aw, var2, 0, 0, var6 >> 14, var5 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += an;
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

                              this.bu(aw, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += an;
                           }
                        }

                        this.bu(aw, var2, 0, 0, var5 >> 14, var6 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += an;
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

                           this.bu(aw, var3, 0, 0, var5 >> 14, var4 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += an;
                        }
                     }

                     this.bu(aw, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += an;
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

                           this.bu(aw, var3, 0, 0, var4 >> 14, var5 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += an;
                        }
                     }

                     this.bu(aw, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += an;
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

                           this.bu(aw, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += an;
                        }
                     }

                     this.bu(aw, var3, 0, 0, var4 >> 14, var6 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += an;
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

                           this.bu(aw, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += an;
                        }
                     }

                     this.bu(aw, var3, 0, 0, var6 >> 14, var4 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += an;
                  }
               }
            }
         }
      }
   }

   void ba(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.ar.af.ag(var22, 1087060001);
      int var24;
      if (var23 == null) {
         var24 = this.ar.af.am(var22, -2101092121);
         this.aq(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var24, var10), ag(var24, var11), ag(var24, var12));
      } else {
         this.ae = this.ar.af.aq(var22, 240669206);
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
            int var36 = this.ar.aq;
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
            int[] var46 = this.ar.ay;
            int var47 = this.ar.az;
            int var48 = this.ar.ap;
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

                                 this.bv(aw, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                                 this.bv(aw, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                                 this.bv(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                                 this.bv(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                                 this.bv(aw, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                                 this.bv(aw, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                                 this.bv(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                                 this.bv(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                              this.bv(aw, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bv(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

                              this.bv(aw, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bv(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

                              this.bv(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bv(aw, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

                              this.bv(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bv(aw, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

   final void bu(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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
         int var9;
         int var10;
         int var11;
         int var12;
         if (this.ar.ae) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.ar.ag == 0) {
               if (var4 > 0) {
                  do {
                     var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.au[var9];
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
                  var3 = this.au[var9];

                  do {
                     var1[var2++] = var3;
                     --var4;
                  } while(var4 > 0);
               }
            } else {
               var9 = this.ar.ag;
               var10 = 256 - this.ar.ag;
               if (var4 > 0) {
                  do {
                     var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.au[var11];
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
                  var3 = this.au[var11];
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
            if (this.ar.ag == 0) {
               do {
                  var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var1[var2++] = this.au[var9];
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            } else {
               var9 = this.ar.ag;
               var10 = 256 - this.ar.ag;

               do {
                  var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.au[var11];
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

   void af(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10) {
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

      int[] var14 = this.ar.ay;
      int var15 = this.ar.az;
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

                           this.br(aw, var1, var10, 0, var6 >> 14, var5 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += an;
                        }
                     }

                     this.br(aw, var1, var10, 0, var6 >> 14, var4 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += an;
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

                           this.br(aw, var1, var10, 0, var5 >> 14, var6 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += an;
                        }
                     }

                     this.br(aw, var1, var10, 0, var4 >> 14, var6 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += an;
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

                           this.br(aw, var1, var10, 0, var4 >> 14, var6 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += an;
                        }
                     }

                     this.br(aw, var1, var10, 0, var4 >> 14, var5 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += an;
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

                           this.br(aw, var1, var10, 0, var6 >> 14, var4 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += an;
                        }
                     }

                     this.br(aw, var1, var10, 0, var5 >> 14, var4 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += an;
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

                           this.br(aw, var2, var10, 0, var4 >> 14, var6 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += an;
                        }
                     }

                     this.br(aw, var2, var10, 0, var4 >> 14, var5 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += an;
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

                           this.br(aw, var2, var10, 0, var6 >> 14, var4 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += an;
                        }
                     }

                     this.br(aw, var2, var10, 0, var5 >> 14, var4 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += an;
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

                           this.br(aw, var2, var10, 0, var4 >> 14, var5 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += an;
                        }
                     }

                     this.br(aw, var2, var10, 0, var6 >> 14, var5 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += an;
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

                           this.br(aw, var2, var10, 0, var5 >> 14, var4 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += an;
                        }
                     }

                     this.br(aw, var2, var10, 0, var5 >> 14, var6 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += an;
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

                        this.br(aw, var3, var10, 0, var5 >> 14, var4 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += an;
                     }
                  }

                  this.br(aw, var3, var10, 0, var5 >> 14, var6 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += an;
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

                        this.br(aw, var3, var10, 0, var4 >> 14, var5 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += an;
                     }
                  }

                  this.br(aw, var3, var10, 0, var6 >> 14, var5 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += an;
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

                        this.br(aw, var3, var10, 0, var5 >> 14, var6 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += an;
                     }
                  }

                  this.br(aw, var3, var10, 0, var4 >> 14, var6 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += an;
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

                        this.br(aw, var3, var10, 0, var6 >> 14, var5 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += an;
                     }
                  }

                  this.br(aw, var3, var10, 0, var6 >> 14, var4 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += an;
               }
            }
         }
      }
   }

   void br(int[] var1, int var2, int var3, int var4, int var5, int var6) {
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
               int var7 = this.ar.ag;
               int var8 = 256 - this.ar.ag;
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

   void at(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.ar.af.ag(var22, -498953168);
      int var24;
      if (var23 == null) {
         var24 = this.ar.af.am(var22, -2055180858);
         this.aq(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var24, var10), ag(var24, var11), ag(var24, var12));
      } else {
         this.ae = this.ar.af.aq(var22, 170548880);
         this.ac = this.ar.af.ax(var22, (byte)-10);
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
            int var36 = this.ar.aq;
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
            int[] var46 = this.ar.ay;
            int var47 = this.ar.az;
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

                     var48 = var1 - this.ar.ap;
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

                                 this.bo(aw, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                                 this.bo(aw, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                     var48 = var1 - this.ar.ap;
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

                                 this.bo(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                                 this.bo(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                     var48 = var2 - this.ar.ap;
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

                                 this.bo(aw, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                                 this.bo(aw, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                     var48 = var2 - this.ar.ap;
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

                                 this.bo(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                                 this.bo(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                  var48 = var3 - this.ar.ap;
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

                              this.bo(aw, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bo(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

                              this.bo(aw, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bo(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

                  var48 = var3 - this.ar.ap;
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

                              this.bo(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bo(aw, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

                              this.bo(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bo(aw, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

   void bo(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
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
         if (this.ae) {
            var24 = var6 - this.ar.ah;
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
            if (this.ac) {
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
            var24 = var6 - this.ar.ah;
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
            if (this.ac) {
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

   void au(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.ar.af.ag(var22, 1008392273);
      int var24;
      if (var23 == null) {
         var24 = this.ar.af.am(var22, -1924424843);
         this.aq(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var24, var10), ag(var24, var11), ag(var24, var12));
      } else {
         this.ae = this.ar.af.aq(var22, 479826642);
         this.ac = this.ar.af.ax(var22, (byte)118);
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
            int var36 = this.ar.aq;
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
            int[] var46 = this.ar.ay;
            int var47 = this.ar.az;
            int var48 = this.ar.ap;
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

                                 this.bv(aw, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                                 this.bv(aw, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                                 this.bv(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                                 this.bv(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                                 this.bv(aw, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                                 this.bv(aw, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                                 this.bv(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                                 this.bv(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                              this.bv(aw, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bv(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

                              this.bv(aw, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bv(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

                              this.bv(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bv(aw, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

                              this.bv(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bv(aw, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

   void bh(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10) {
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

      int[] var14 = this.ar.ay;
      int var15 = this.ar.az;
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

                           this.br(aw, var1, var10, 0, var6 >> 14, var5 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += an;
                        }
                     }

                     this.br(aw, var1, var10, 0, var6 >> 14, var4 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += an;
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

                           this.br(aw, var1, var10, 0, var5 >> 14, var6 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += an;
                        }
                     }

                     this.br(aw, var1, var10, 0, var4 >> 14, var6 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += an;
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

                           this.br(aw, var1, var10, 0, var4 >> 14, var6 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += an;
                        }
                     }

                     this.br(aw, var1, var10, 0, var4 >> 14, var5 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += an;
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

                           this.br(aw, var1, var10, 0, var6 >> 14, var4 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += an;
                        }
                     }

                     this.br(aw, var1, var10, 0, var5 >> 14, var4 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += an;
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

                           this.br(aw, var2, var10, 0, var4 >> 14, var6 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += an;
                        }
                     }

                     this.br(aw, var2, var10, 0, var4 >> 14, var5 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += an;
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

                           this.br(aw, var2, var10, 0, var6 >> 14, var4 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += an;
                        }
                     }

                     this.br(aw, var2, var10, 0, var5 >> 14, var4 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += an;
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

                           this.br(aw, var2, var10, 0, var4 >> 14, var5 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += an;
                        }
                     }

                     this.br(aw, var2, var10, 0, var6 >> 14, var5 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += an;
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

                           this.br(aw, var2, var10, 0, var5 >> 14, var4 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += an;
                        }
                     }

                     this.br(aw, var2, var10, 0, var5 >> 14, var6 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += an;
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

                        this.br(aw, var3, var10, 0, var5 >> 14, var4 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += an;
                     }
                  }

                  this.br(aw, var3, var10, 0, var5 >> 14, var6 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += an;
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

                        this.br(aw, var3, var10, 0, var4 >> 14, var5 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += an;
                     }
                  }

                  this.br(aw, var3, var10, 0, var6 >> 14, var5 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += an;
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

                        this.br(aw, var3, var10, 0, var5 >> 14, var6 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += an;
                     }
                  }

                  this.br(aw, var3, var10, 0, var4 >> 14, var6 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += an;
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

                        this.br(aw, var3, var10, 0, var6 >> 14, var5 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += an;
                     }
                  }

                  this.br(aw, var3, var10, 0, var6 >> 14, var4 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += an;
               }
            }
         }
      }
   }

   void bs(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.ar.af.ag(var22, 2036467972);
      int var24;
      if (var23 == null) {
         var24 = this.ar.af.am(var22, -1993656100);
         this.aq(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var24, var10), ag(var24, var11), ag(var24, var12));
      } else {
         this.ae = this.ar.af.aq(var22, 2142729146);
         this.ac = this.ar.af.ax(var22, (byte)52);
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
            int var36 = this.ar.aq;
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
            int[] var46 = this.ar.ay;
            int var47 = this.ar.az;
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

                     var48 = var1 - this.ar.ap;
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

                                 this.bo(aw, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                                 this.bo(aw, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                     var48 = var1 - this.ar.ap;
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

                                 this.bo(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                                 this.bo(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                     var48 = var2 - this.ar.ap;
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

                                 this.bo(aw, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                                 this.bo(aw, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                     var48 = var2 - this.ar.ap;
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

                                 this.bo(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                                 this.bo(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                  var48 = var3 - this.ar.ap;
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

                              this.bo(aw, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bo(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

                              this.bo(aw, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bo(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

                  var48 = var3 - this.ar.ap;
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

                              this.bo(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bo(aw, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

                              this.bo(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bo(aw, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

   void ak(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
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
         int[] var25 = this.ar.ay;
         int var26 = this.ar.az;
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

                              this.bu(aw, var1, 0, 0, var5 >> 14, var6 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += an;
                           }
                        }

                        this.bu(aw, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += an;
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

                              this.bu(aw, var1, 0, 0, var6 >> 14, var5 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += an;
                           }
                        }

                        this.bu(aw, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += an;
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

                              this.bu(aw, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += an;
                           }
                        }

                        this.bu(aw, var1, 0, 0, var5 >> 14, var4 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += an;
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

                              this.bu(aw, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += an;
                           }
                        }

                        this.bu(aw, var1, 0, 0, var4 >> 14, var5 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += an;
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

                              this.bu(aw, var2, 0, 0, var6 >> 14, var4 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += an;
                           }
                        }

                        this.bu(aw, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += an;
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

                              this.bu(aw, var2, 0, 0, var4 >> 14, var6 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += an;
                           }
                        }

                        this.bu(aw, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += an;
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

                              this.bu(aw, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += an;
                           }
                        }

                        this.bu(aw, var2, 0, 0, var6 >> 14, var5 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += an;
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

                              this.bu(aw, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += an;
                           }
                        }

                        this.bu(aw, var2, 0, 0, var5 >> 14, var6 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += an;
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

                           this.bu(aw, var3, 0, 0, var5 >> 14, var4 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += an;
                        }
                     }

                     this.bu(aw, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += an;
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

                           this.bu(aw, var3, 0, 0, var4 >> 14, var5 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += an;
                        }
                     }

                     this.bu(aw, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += an;
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

                           this.bu(aw, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += an;
                        }
                     }

                     this.bu(aw, var3, 0, 0, var4 >> 14, var6 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += an;
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

                           this.bu(aw, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += an;
                        }
                     }

                     this.bu(aw, var3, 0, 0, var6 >> 14, var4 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += an;
                  }
               }
            }
         }
      }
   }

   void bn(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
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
         int[] var25 = this.ar.ay;
         int var26 = this.ar.az;
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

                              this.bu(aw, var1, 0, 0, var5 >> 14, var6 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += an;
                           }
                        }

                        this.bu(aw, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += an;
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

                              this.bu(aw, var1, 0, 0, var6 >> 14, var5 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += an;
                           }
                        }

                        this.bu(aw, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += an;
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

                              this.bu(aw, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += an;
                           }
                        }

                        this.bu(aw, var1, 0, 0, var5 >> 14, var4 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += an;
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

                              this.bu(aw, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += an;
                           }
                        }

                        this.bu(aw, var1, 0, 0, var4 >> 14, var5 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += an;
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

                              this.bu(aw, var2, 0, 0, var6 >> 14, var4 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += an;
                           }
                        }

                        this.bu(aw, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += an;
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

                              this.bu(aw, var2, 0, 0, var4 >> 14, var6 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += an;
                           }
                        }

                        this.bu(aw, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += an;
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

                              this.bu(aw, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += an;
                           }
                        }

                        this.bu(aw, var2, 0, 0, var6 >> 14, var5 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += an;
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

                              this.bu(aw, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += an;
                           }
                        }

                        this.bu(aw, var2, 0, 0, var5 >> 14, var6 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += an;
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

                           this.bu(aw, var3, 0, 0, var5 >> 14, var4 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += an;
                        }
                     }

                     this.bu(aw, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += an;
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

                           this.bu(aw, var3, 0, 0, var4 >> 14, var5 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += an;
                        }
                     }

                     this.bu(aw, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += an;
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

                           this.bu(aw, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += an;
                        }
                     }

                     this.bu(aw, var3, 0, 0, var4 >> 14, var6 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += an;
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

                           this.bu(aw, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += an;
                        }
                     }

                     this.bu(aw, var3, 0, 0, var6 >> 14, var4 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += an;
                  }
               }
            }
         }
      }
   }

   void cm(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
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
         int var18 = var7 - var6;
         int var16;
         int var17;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var24;
         if (this.ae) {
            var24 = var6 - this.ar.ah;
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
            if (this.ac) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & -518100908) * var16 & -16711936) + ((var4 & 1549327113) * var16 & -1107363602) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 2106152984) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & -900849688) * var16 & 2028300817) + ((var4 & -1257246565) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -1482525445) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 243860901) * var16 & -190924765) + ((var4 & -229454447) * var16 & 2057498457) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 1133281839) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -1759833759) + ((var4 & -946995518) * var16 & 864522216) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -1005988852) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -2122237212) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & 60317569) + ((var4 & -8016881) * var16 & -2137772517) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -1353221684) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 2028815984) * var16 & -442124181) + ((var4 & -1011757155) * var16 & 1438766035) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -836042884) + ((var4 & 1411232480) * var16 & -2101865614) >> 8;
                     var3 += var17;
                     var8 += var9;
                     var16 = var8 >> 8;
                     --var18;
                  } while(var18 > 0);
               }

               var18 = var7 - var6 & 7;
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 613009191) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & 215226459) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -1754218222) + ((var4 & 2078023252) * var16 & -1652005978) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & -1566434865) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -1231916148) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 746424679) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 1411491840) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 1013913254) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & -1556631348) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & -1540375222) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 1039474718) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & -1448810498) * var16 & -1904427975) + ((var4 & 933509790) * var16 & 16711680) >> 8;
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
                     if ((var4 = var2[(var3 & -258438642) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 1550708020) * var16 & -16711936) + ((var4 & 1761689144) * var16 & -1563992818) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         } else {
            var24 = var6 - this.ar.ah;
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
            if (this.ac) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -1254099765) + ((var4 & -1511127623) * var16 & -312602913) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -1380941156) * var16 & -2063620428) + ((var4 & -886259788) * var16 & 945628730) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -247050727) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 169395553) * var16 & -1861098869) + ((var4 & -1879475965) * var16 & -960410206) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & 283093755) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -1171478602) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -183398943) * var16 & -692778084) + ((var4 & '\uff00') * var16 & 993618126) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 447024449) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & -667573406) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 1060931981) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -1983866366) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 1384037364) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 1915301421) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 446700324) * var16 & 1592114751) + ((var4 & -48728313) * var16 & -2075236107) >> 8;
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
                     var1[var5++] = ((var4 & 1202790037) * var16 & -16711936) + ((var4 & -1251713869) * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & -154764991) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & -1676541355) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 2079492610) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & -109306480) * var16 & -16711936) + ((var4 & '\uff00') * var16 & -1157964005) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 186525406) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & -94943775) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 1623395999) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & -999392736) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & -1842554936) * var16 & 678408874) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & -1109595136) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 1974835777) * var16 & -16711936) + ((var4 & -860888104) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & -2004509638) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
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
                     if ((var4 = var2[(var3 & -148116818) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -1624912686) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
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

   void bd(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10) {
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

      int[] var14 = this.ar.ay;
      int var15 = this.ar.az;
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

                           this.br(aw, var1, var10, 0, var5 >> 14, var6 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += an;
                        }
                     }

                     this.br(aw, var1, var10, 0, var4 >> 14, var6 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += an;
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

                           this.br(aw, var1, var10, 0, var6 >> 14, var5 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += an;
                        }
                     }

                     this.br(aw, var1, var10, 0, var6 >> 14, var4 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += an;
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

                           this.br(aw, var1, var10, 0, var6 >> 14, var4 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += an;
                        }
                     }

                     this.br(aw, var1, var10, 0, var5 >> 14, var4 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += an;
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

                           this.br(aw, var1, var10, 0, var4 >> 14, var6 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += an;
                        }
                     }

                     this.br(aw, var1, var10, 0, var4 >> 14, var5 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += an;
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

                           this.br(aw, var2, var10, 0, var6 >> 14, var4 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += an;
                        }
                     }

                     this.br(aw, var2, var10, 0, var5 >> 14, var4 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += an;
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

                           this.br(aw, var2, var10, 0, var4 >> 14, var6 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += an;
                        }
                     }

                     this.br(aw, var2, var10, 0, var4 >> 14, var5 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += an;
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

                           this.br(aw, var2, var10, 0, var4 >> 14, var5 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += an;
                        }
                     }

                     this.br(aw, var2, var10, 0, var6 >> 14, var5 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += an;
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

                           this.br(aw, var2, var10, 0, var5 >> 14, var4 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += an;
                        }
                     }

                     this.br(aw, var2, var10, 0, var5 >> 14, var6 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += an;
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

                        this.br(aw, var3, var10, 0, var5 >> 14, var4 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += an;
                     }
                  }

                  this.br(aw, var3, var10, 0, var5 >> 14, var6 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += an;
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

                        this.br(aw, var3, var10, 0, var4 >> 14, var5 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += an;
                     }
                  }

                  this.br(aw, var3, var10, 0, var6 >> 14, var5 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += an;
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

                        this.br(aw, var3, var10, 0, var5 >> 14, var6 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += an;
                     }
                  }

                  this.br(aw, var3, var10, 0, var4 >> 14, var6 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += an;
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

                        this.br(aw, var3, var10, 0, var6 >> 14, var5 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += an;
                     }
                  }

                  this.br(aw, var3, var10, 0, var6 >> 14, var4 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += an;
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

      int[] var14 = this.ar.ay;
      int var15 = this.ar.az;
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

                           this.br(aw, var1, var10, 0, var5 >> 14, var6 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += an;
                        }
                     }

                     this.br(aw, var1, var10, 0, var4 >> 14, var6 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += an;
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

                           this.br(aw, var1, var10, 0, var6 >> 14, var5 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += an;
                        }
                     }

                     this.br(aw, var1, var10, 0, var6 >> 14, var4 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += an;
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

                           this.br(aw, var1, var10, 0, var6 >> 14, var4 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += an;
                        }
                     }

                     this.br(aw, var1, var10, 0, var5 >> 14, var4 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += an;
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

                           this.br(aw, var1, var10, 0, var4 >> 14, var6 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += an;
                        }
                     }

                     this.br(aw, var1, var10, 0, var4 >> 14, var5 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += an;
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

                           this.br(aw, var2, var10, 0, var6 >> 14, var4 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += an;
                        }
                     }

                     this.br(aw, var2, var10, 0, var5 >> 14, var4 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += an;
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

                           this.br(aw, var2, var10, 0, var4 >> 14, var6 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += an;
                        }
                     }

                     this.br(aw, var2, var10, 0, var4 >> 14, var5 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += an;
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

                           this.br(aw, var2, var10, 0, var4 >> 14, var5 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += an;
                        }
                     }

                     this.br(aw, var2, var10, 0, var6 >> 14, var5 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += an;
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

                           this.br(aw, var2, var10, 0, var5 >> 14, var4 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += an;
                        }
                     }

                     this.br(aw, var2, var10, 0, var5 >> 14, var6 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += an;
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

                        this.br(aw, var3, var10, 0, var5 >> 14, var4 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += an;
                     }
                  }

                  this.br(aw, var3, var10, 0, var5 >> 14, var6 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += an;
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

                        this.br(aw, var3, var10, 0, var4 >> 14, var5 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += an;
                     }
                  }

                  this.br(aw, var3, var10, 0, var6 >> 14, var5 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += an;
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

                        this.br(aw, var3, var10, 0, var5 >> 14, var6 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += an;
                     }
                  }

                  this.br(aw, var3, var10, 0, var4 >> 14, var6 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += an;
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

                        this.br(aw, var3, var10, 0, var6 >> 14, var5 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += an;
                     }
                  }

                  this.br(aw, var3, var10, 0, var6 >> 14, var4 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += an;
               }
            }
         }
      }
   }

   void bf(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10) {
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

      int[] var14 = this.ar.ay;
      int var15 = this.ar.az;
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

                           this.br(aw, var1, var10, 0, var6 >> 14, var5 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += an;
                        }
                     }

                     this.br(aw, var1, var10, 0, var6 >> 14, var4 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += an;
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

                           this.br(aw, var1, var10, 0, var5 >> 14, var6 >> 14);
                           var6 += var13;
                           var5 += var12;
                           var1 += an;
                        }
                     }

                     this.br(aw, var1, var10, 0, var4 >> 14, var6 >> 14);
                     var6 += var13;
                     var4 += var11;
                     var1 += an;
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

                           this.br(aw, var1, var10, 0, var4 >> 14, var6 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += an;
                        }
                     }

                     this.br(aw, var1, var10, 0, var4 >> 14, var5 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += an;
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

                           this.br(aw, var1, var10, 0, var6 >> 14, var4 >> 14);
                           var6 += var12;
                           var4 += var11;
                           var1 += an;
                        }
                     }

                     this.br(aw, var1, var10, 0, var5 >> 14, var4 >> 14);
                     var5 += var13;
                     var4 += var11;
                     var1 += an;
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

                           this.br(aw, var2, var10, 0, var4 >> 14, var6 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += an;
                        }
                     }

                     this.br(aw, var2, var10, 0, var4 >> 14, var5 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += an;
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

                           this.br(aw, var2, var10, 0, var6 >> 14, var4 >> 14);
                           var4 += var11;
                           var6 += var13;
                           var2 += an;
                        }
                     }

                     this.br(aw, var2, var10, 0, var5 >> 14, var4 >> 14);
                     var4 += var11;
                     var5 += var12;
                     var2 += an;
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

                           this.br(aw, var2, var10, 0, var4 >> 14, var5 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += an;
                        }
                     }

                     this.br(aw, var2, var10, 0, var6 >> 14, var5 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += an;
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

                           this.br(aw, var2, var10, 0, var5 >> 14, var4 >> 14);
                           var4 += var13;
                           var5 += var12;
                           var2 += an;
                        }
                     }

                     this.br(aw, var2, var10, 0, var5 >> 14, var6 >> 14);
                     var6 += var11;
                     var5 += var12;
                     var2 += an;
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

                        this.br(aw, var3, var10, 0, var5 >> 14, var4 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += an;
                     }
                  }

                  this.br(aw, var3, var10, 0, var5 >> 14, var6 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += an;
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

                        this.br(aw, var3, var10, 0, var4 >> 14, var5 >> 14);
                        var5 += var12;
                        var4 += var11;
                        var3 += an;
                     }
                  }

                  this.br(aw, var3, var10, 0, var6 >> 14, var5 >> 14);
                  var5 += var12;
                  var6 += var13;
                  var3 += an;
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

                        this.br(aw, var3, var10, 0, var5 >> 14, var6 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += an;
                     }
                  }

                  this.br(aw, var3, var10, 0, var4 >> 14, var6 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += an;
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

                        this.br(aw, var3, var10, 0, var6 >> 14, var5 >> 14);
                        var5 += var11;
                        var6 += var13;
                        var3 += an;
                     }
                  }

                  this.br(aw, var3, var10, 0, var6 >> 14, var4 >> 14);
                  var4 += var12;
                  var6 += var13;
                  var3 += an;
               }
            }
         }
      }
   }

   void bm(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.ar.af.ag(var22, -710622676);
      int var24;
      if (var23 == null) {
         var24 = this.ar.af.am(var22, -2020889002);
         this.aq(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var24, var10), ag(var24, var11), ag(var24, var12));
      } else {
         this.ae = this.ar.af.aq(var22, 715472455);
         this.ac = this.ar.af.ax(var22, (byte)70);
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
            int var36 = this.ar.aq;
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
            int[] var46 = this.ar.ay;
            int var47 = this.ar.az;
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

                     var48 = var1 - this.ar.ap;
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

                                 this.bo(aw, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                                 this.bo(aw, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                     var48 = var1 - this.ar.ap;
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

                                 this.bo(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                                 this.bo(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                     var48 = var2 - this.ar.ap;
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

                                 this.bo(aw, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                                 this.bo(aw, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                     var48 = var2 - this.ar.ap;
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

                                 this.bo(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                                 this.bo(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                  var48 = var3 - this.ar.ap;
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

                              this.bo(aw, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bo(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

                              this.bo(aw, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bo(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

                  var48 = var3 - this.ar.ap;
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

                              this.bo(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bo(aw, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

                              this.bo(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bo(aw, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

   void bj(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.ar.af.ag(var22, -1928939955);
      int var24;
      if (var23 == null) {
         var24 = this.ar.af.am(var22, -2096298486);
         this.aq(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var24, var10), ag(var24, var11), ag(var24, var12));
      } else {
         this.ae = this.ar.af.aq(var22, 2134708098);
         this.ac = this.ar.af.ax(var22, (byte)50);
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
            int var36 = this.ar.aq;
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
            int[] var46 = this.ar.ay;
            int var47 = this.ar.az;
            int var48 = this.ar.ap;
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

                                 this.bv(aw, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                                 this.bv(aw, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                                 this.bv(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                                 this.bv(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                                 this.bv(aw, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                                 this.bv(aw, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                                 this.bv(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                                 this.bv(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                              this.bv(aw, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bv(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

                              this.bv(aw, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bv(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

                              this.bv(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bv(aw, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

                              this.bv(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bv(aw, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

   void bw(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.ar.af.ag(var22, 475670192);
      int var24;
      if (var23 == null) {
         var24 = this.ar.af.am(var22, -1893873626);
         this.aq(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var24, var10), ag(var24, var11), ag(var24, var12));
      } else {
         this.ae = this.ar.af.aq(var22, 2080493660);
         this.ac = this.ar.af.ax(var22, (byte)104);
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
            int var36 = this.ar.aq;
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
            int[] var46 = this.ar.ay;
            int var47 = this.ar.az;
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

                     var48 = var1 - this.ar.ap;
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

                                 this.bo(aw, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                                 this.bo(aw, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                     var48 = var1 - this.ar.ap;
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

                                 this.bo(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                                 this.bo(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                     var48 = var2 - this.ar.ap;
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

                                 this.bo(aw, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                                 this.bo(aw, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                     var48 = var2 - this.ar.ap;
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

                                 this.bo(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                                 this.bo(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bo(aw, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                  var48 = var3 - this.ar.ap;
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

                              this.bo(aw, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bo(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

                              this.bo(aw, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bo(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

                  var48 = var3 - this.ar.ap;
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

                              this.bo(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bo(aw, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

                              this.bo(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bo(aw, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

   void bv(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
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
         int var18 = var7 - var6;
         int var16;
         int var17;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var24;
         if (this.ae) {
            var24 = var6 - this.ar.ah;
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
            if (this.ac) {
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
            var24 = var6 - this.ar.ah;
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
            if (this.ac) {
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

   void aq(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12) {
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
         int[] var25 = this.ar.ay;
         int var26 = this.ar.az;
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

                              this.bu(aw, var1, 0, 0, var5 >> 14, var6 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += an;
                           }
                        }

                        this.bu(aw, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += an;
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

                              this.bu(aw, var1, 0, 0, var6 >> 14, var5 >> 14, var10, var23);
                              var6 += var21;
                              var5 += var19;
                              var10 += var24;
                              var1 += an;
                           }
                        }

                        this.bu(aw, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                        var6 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += an;
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

                              this.bu(aw, var1, 0, 0, var6 >> 14, var4 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += an;
                           }
                        }

                        this.bu(aw, var1, 0, 0, var5 >> 14, var4 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += an;
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

                              this.bu(aw, var1, 0, 0, var4 >> 14, var6 >> 14, var10, var23);
                              var6 += var19;
                              var4 += var20;
                              var10 += var24;
                              var1 += an;
                           }
                        }

                        this.bu(aw, var1, 0, 0, var4 >> 14, var5 >> 14, var10, var23);
                        var5 += var21;
                        var4 += var20;
                        var10 += var24;
                        var1 += an;
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

                              this.bu(aw, var2, 0, 0, var6 >> 14, var4 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += an;
                           }
                        }

                        this.bu(aw, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += an;
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

                              this.bu(aw, var2, 0, 0, var4 >> 14, var6 >> 14, var11, var23);
                              var4 += var20;
                              var6 += var21;
                              var11 += var24;
                              var2 += an;
                           }
                        }

                        this.bu(aw, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                        var4 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += an;
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

                              this.bu(aw, var2, 0, 0, var4 >> 14, var5 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += an;
                           }
                        }

                        this.bu(aw, var2, 0, 0, var6 >> 14, var5 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += an;
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

                              this.bu(aw, var2, 0, 0, var5 >> 14, var4 >> 14, var11, var23);
                              var4 += var21;
                              var5 += var19;
                              var11 += var24;
                              var2 += an;
                           }
                        }

                        this.bu(aw, var2, 0, 0, var5 >> 14, var6 >> 14, var11, var23);
                        var6 += var20;
                        var5 += var19;
                        var11 += var24;
                        var2 += an;
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

                           this.bu(aw, var3, 0, 0, var5 >> 14, var4 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += an;
                        }
                     }

                     this.bu(aw, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += an;
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

                           this.bu(aw, var3, 0, 0, var4 >> 14, var5 >> 14, var12, var23);
                           var5 += var19;
                           var4 += var20;
                           var12 += var24;
                           var3 += an;
                        }
                     }

                     this.bu(aw, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                     var5 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += an;
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

                           this.bu(aw, var3, 0, 0, var5 >> 14, var6 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += an;
                        }
                     }

                     this.bu(aw, var3, 0, 0, var4 >> 14, var6 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += an;
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

                           this.bu(aw, var3, 0, 0, var6 >> 14, var5 >> 14, var12, var23);
                           var5 += var20;
                           var6 += var21;
                           var12 += var24;
                           var3 += an;
                        }
                     }

                     this.bu(aw, var3, 0, 0, var6 >> 14, var4 >> 14, var12, var23);
                     var4 += var19;
                     var6 += var21;
                     var12 += var24;
                     var3 += an;
                  }
               }
            }
         }
      }
   }

   void bp(int var1, int var2, int var3, int var4, int var5, int var6, float var7, float var8, float var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21, int var22) {
      int[] var23 = this.ar.af.ag(var22, 667830575);
      int var24;
      if (var23 == null) {
         var24 = this.ar.af.am(var22, -1901592999);
         this.aq(var1, var2, var3, var4, var5, var6, var7, var8, var9, ag(var24, var10), ag(var24, var11), ag(var24, var12));
      } else {
         this.ae = this.ar.af.aq(var22, 1069535798);
         this.ac = this.ar.af.ax(var22, (byte)-23);
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
            int var36 = this.ar.aq;
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
            int[] var46 = this.ar.ay;
            int var47 = this.ar.az;
            int var48 = this.ar.ap;
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

                                 this.bv(aw, var23, 0, 0, var1, var6 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                                 this.bv(aw, var23, 0, 0, var1, var5 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var32;
                                 var5 += var31;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                                 this.bv(aw, var23, 0, 0, var1, var6 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var1, var5 >> 14, var4 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                                 this.bv(aw, var23, 0, 0, var1, var4 >> 14, var6 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                                 var6 += var31;
                                 var4 += var30;
                                 var10 += var35;
                                 var1 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var1, var4 >> 14, var5 >> 14, var10, var34, var37, var40, var43, var38, var41, var44);
                           var5 += var32;
                           var4 += var30;
                           var10 += var35;
                           var1 += an;
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

                                 this.bv(aw, var23, 0, 0, var2, var4 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                                 this.bv(aw, var23, 0, 0, var2, var6 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var30;
                                 var6 += var32;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var4 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                                 this.bv(aw, var23, 0, 0, var2, var4 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var2, var6 >> 14, var5 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                                 this.bv(aw, var23, 0, 0, var2, var5 >> 14, var4 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                                 var4 += var32;
                                 var5 += var31;
                                 var11 += var35;
                                 var2 += an;
                                 var37 += var39;
                                 var40 += var42;
                                 var43 += var45;
                              }
                           }

                           this.bv(aw, var23, 0, 0, var2, var5 >> 14, var6 >> 14, var11, var34, var37, var40, var43, var38, var41, var44);
                           var6 += var30;
                           var5 += var31;
                           var11 += var35;
                           var2 += an;
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

                              this.bv(aw, var23, 0, 0, var3, var5 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bv(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

                              this.bv(aw, var23, 0, 0, var3, var4 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var31;
                              var4 += var30;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bv(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var5 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

                              this.bv(aw, var23, 0, 0, var3, var5 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bv(aw, var23, 0, 0, var3, var4 >> 14, var6 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

                              this.bv(aw, var23, 0, 0, var3, var6 >> 14, var5 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                              var5 += var30;
                              var6 += var32;
                              var12 += var35;
                              var3 += an;
                              var37 += var39;
                              var40 += var42;
                              var43 += var45;
                           }
                        }

                        this.bv(aw, var23, 0, 0, var3, var6 >> 14, var4 >> 14, var12, var34, var37, var40, var43, var38, var41, var44);
                        var4 += var31;
                        var6 += var32;
                        var12 += var35;
                        var3 += an;
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

   void cx(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
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
         int var18 = var7 - var6;
         int var16;
         int var17;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var24;
         if (this.ae) {
            var24 = var6 - this.ar.ah;
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
            if (this.ac) {
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
            var24 = var6 - this.ar.ah;
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
            if (this.ac) {
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

   void cn(int[] var1, int var2, int var3, int var4, int var5, int var6) {
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
               int var7 = this.ar.ag;
               int var8 = 256 - this.ar.ag;
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

   final void bk(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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
         int var9;
         int var10;
         int var11;
         int var12;
         if (this.ar.ae) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.ar.ag == 0) {
               if (var4 > 0) {
                  do {
                     var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.au[var9];
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
                  var9 = (var7 & (var7 >> -1254662033 & 1) - 1) >> 8;
                  var3 = this.au[var9];

                  do {
                     var1[var2++] = var3;
                     --var4;
                  } while(var4 > 0);
               }
            } else {
               var9 = this.ar.ag;
               var10 = 428379719 - this.ar.ag;
               if (var4 > 0) {
                  do {
                     var11 = (var7 & (var7 >> -1419403753 & 1) - 1) >> 8;
                     var3 = this.au[var11];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & -121405665) * var9 >> 8 & -1336735955) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & 1511874247);
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 1034801358) * var9 >> 8 & 1213034690);
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.au[var11];
                  var3 = ((var3 & -661482394) * var10 >> 8 & 16711935) + ((var3 & '\uff00') * var10 >> 8 & 640521676);

                  do {
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 1246708955) * var9 >> 8 & 16711935) + ((var12 & 103862687) * var9 >> 8 & '\uff00');
                     --var4;
                  } while(var4 > 0);
               }
            }

         } else {
            var4 = var6 - var5;
            if (this.ar.ag == 0) {
               do {
                  var9 = (var7 & (var7 >> -737573474 & 1) - 1) >> 8;
                  var1[var2++] = this.au[var9];
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            } else {
               var9 = this.ar.ag;
               var10 = 256 - this.ar.ag;

               do {
                  var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.au[var11];
                  var7 += var8;
                  var3 = ((var3 & 16711935) * var10 >> 8 & -1386803028) + ((var3 & -128419133) * var10 >> 8 & '\uff00');
                  var12 = var1[var2];
                  var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & -1795898481) + ((var12 & 1311476529) * var9 >> 8 & '\uff00');
                  --var4;
               } while(var4 > 0);
            }

         }
      }
   }

   final void be(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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
         int var9;
         int var10;
         int var11;
         int var12;
         if (this.ar.ae) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.ar.ag == 0) {
               if (var4 > 0) {
                  do {
                     var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.au[var9];
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
                  var3 = this.au[var9];

                  do {
                     var1[var2++] = var3;
                     --var4;
                  } while(var4 > 0);
               }
            } else {
               var9 = this.ar.ag;
               var10 = 256 - this.ar.ag;
               if (var4 > 0) {
                  do {
                     var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.au[var11];
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
                  var3 = this.au[var11];
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
            if (this.ar.ag == 0) {
               do {
                  var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var1[var2++] = this.au[var9];
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            } else {
               var9 = this.ar.ag;
               var10 = 256 - this.ar.ag;

               do {
                  var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.au[var11];
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

   void bc(int[] var1, int var2, int var3, int var4, int var5, int var6) {
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
               int var7 = this.ar.ag;
               int var8 = 256 - this.ar.ag;
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

   final void bt(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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
         int var9;
         int var10;
         int var11;
         int var12;
         if (this.ar.ae) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.ar.ag == 0) {
               if (var4 > 0) {
                  do {
                     var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.au[var9];
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
                  var3 = this.au[var9];

                  do {
                     var1[var2++] = var3;
                     --var4;
                  } while(var4 > 0);
               }
            } else {
               var9 = this.ar.ag;
               var10 = 751379018 - this.ar.ag;
               if (var4 > 0) {
                  do {
                     var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.au[var11];
                     var7 += var8;
                     var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & 858575483) * var10 >> 8 & 821610249);
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & -577796649) * var9 >> 8 & 16711935) + ((var12 & 1290546982) * var9 >> 8 & '\uff00');
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 494050964) + ((var12 & 1488275031) * var9 >> 8 & 575935978);
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 2016106574) * var9 >> 8 & -773191073) + ((var12 & -1642536833) * var9 >> 8 & 400617339);
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & '\uff00') * var9 >> 8 & -1445519189);
                     --var4;
                  } while(var4 > 0);
               }

               var4 = var6 - var5 & 3;
               if (var4 > 0) {
                  var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.au[var11];
                  var3 = ((var3 & 1887821596) * var10 >> 8 & -2090422747) + ((var3 & -465910643) * var10 >> 8 & '\uff00');

                  do {
                     var12 = var1[var2];
                     var1[var2++] = var3 + ((var12 & 560571979) * var9 >> 8 & 16711935) + ((var12 & -863388884) * var9 >> 8 & 812910514);
                     --var4;
                  } while(var4 > 0);
               }
            }

         } else {
            var4 = var6 - var5;
            if (this.ar.ag == 0) {
               do {
                  var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var1[var2++] = this.au[var9];
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            } else {
               var9 = this.ar.ag;
               var10 = -1599983457 - this.ar.ag;

               do {
                  var11 = (var7 & (var7 >> -386977585 & 1) - 1) >> 8;
                  var3 = this.au[var11];
                  var7 += var8;
                  var3 = ((var3 & 16711935) * var10 >> 8 & 16711935) + ((var3 & 1789884073) * var10 >> 8 & '\uff00');
                  var12 = var1[var2];
                  var1[var2++] = var3 + ((var12 & -2080745158) * var9 >> 8 & 1917762107) + ((var12 & '\uff00') * var9 >> 8 & 83190576);
                  --var4;
               } while(var4 > 0);
            }

         }
      }
   }

   void ch(int[] var1, int var2, int var3, int var4, int var5, int var6) {
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
         if (this.ar.ag != 0) {
            if (this.ar.ag == -1311077043) {
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
               int var7 = this.ar.ag;
               int var8 = 939892319 - this.ar.ag;
               var3 = ((var3 & 16711935) * var8 >> 8 & 869903440) + ((var3 & '\uff00') * var8 >> 8 & '\uff00');

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
                        var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & -1883969734) + ((var9 & '\uff00') * var7 >> 8 & '\uff00');
                     }
                  }

                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & '\uff00') * var7 >> 8 & 1305974031);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 78209753) * var7 >> 8 & 1133036058) + ((var9 & -1945311187) * var7 >> 8 & -1534928728);
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & -892244711) * var7 >> 8 & 16711935) + ((var9 & 449868544) * var7 >> 8 & '\uff00');
                  var9 = var1[var2];
                  var1[var2++] = var3 + ((var9 & 16711935) * var7 >> 8 & 16711935) + ((var9 & -1674104279) * var7 >> 8 & '\uff00');
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

   void cf(int[] var1, int var2, int var3, int var4, int var5, int var6) {
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
               int var7 = this.ar.ag;
               int var8 = 256 - this.ar.ag;
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

   void cu(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
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
         if (this.ae) {
            var24 = var6 - this.ar.ah;
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
                  var19 = 1231371706;
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
                  var21 = -1577678662;
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
            if (this.ac) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 508684201) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & 1636493814) + ((var4 & 1978362070) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & 348379993) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & 16558989) + ((var4 & -1230109528) * var16 & -1784317197) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 172299083) * var16 & -16711936) + ((var4 & '\uff00') * var16 & -51103444) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 134548466) * var16 & -16711936) + ((var4 & -85266423) * var16 & -1989041093) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 383672391) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 1276611437) * var16 & -16711936) + ((var4 & 23689069) * var16 & 305390398) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -1859363633) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & 1239136126) + ((var4 & -239180242) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 4032) + (var3 >>> 26)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -1868276587) + ((var4 & '\uff00') * var16 & -113334967) >> 8;
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
                           var21 = -1910445344;
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
                     var1[var5++] = ((var4 & -1870828188) * var16 & 1992118620) + ((var4 & 520516394) * var16 & 16711680) >> 8;
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
                        var1[var5] = ((var4 & -479203438) * var16 & -16711936) + ((var4 & '\uff00') * var16 & -1580258154) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & -950386155) * var16 & -1946152005) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & -2032299297) * var16 & -1753716713) + ((var4 & -1877844403) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & -1134745613) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & 339063802) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & -677952579) * var16 & -298947293) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & 1136300229) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 4032) + (var3 >>> 26)]) != 0) {
                        var1[var5] = ((var4 & -1953536709) * var16 & -1940248660) + ((var4 & 1487934976) * var16 & -1792433147) >> 8;
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
                           var21 = -499107153;
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
                        var1[var5] = ((var4 & 740171146) * var16 & 572184882) + ((var4 & -1115674961) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            }
         } else {
            var24 = var6 - this.ar.ah;
            var10 += (var13 >> 3) * var24;
            var11 += (var14 >> 3) * var24;
            var12 += (var15 >> 3) * var24;
            var23 = var12 >> 14;
            if (var23 != 0) {
               var19 = var10 / var23;
               var20 = var11 / var23;
               if (var19 < 0) {
                  var19 = 0;
               } else if (var19 > 1974811319) {
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
            if (this.ac) {
               if (var18 > 0) {
                  do {
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 144305877) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -302211635) * var16 & -16711936) + ((var4 & 1992066460) * var16 & -917291545) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 2085573397) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -134042732) * var16 & -16711936) + ((var4 & 1831354725) * var16 & -233557600) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -2054769192) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -1548012197) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 208294426) * var16 & -267642999) + ((var4 & 1628321253) * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 16256) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & -949268801) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & -1362817215) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & -591333839) * var16 & -1972625258) + ((var4 & 1109332976) * var16 & 2030763492) >> 8;
                     var3 += var17;
                     var4 = var2[(var3 & 166255582) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & 892660714) + ((var4 & '\uff00') * var16 & 1946480765) >> 8;
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
                           var21 = 1412044274;
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
                     var4 = var2[(var3 & 1252746400) + (var3 >>> 25)];
                     var1[var5++] = ((var4 & 16711935) * var16 & 1237758084) + ((var4 & 40320182) * var16 & 16711680) >> 8;
                     var3 += var17;
                     --var18;
                  } while(var18 > 0);
               }
            } else {
               if (var18 > 0) {
                  do {
                     if ((var4 = var2[(var3 & -216408415) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & -1276031932) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 1275163428) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & -896023462) * var16 & 2119557057) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & -254997924) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & -196713788) * var16 & 496263768) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & -2103610363) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & -1633162063) * var16 & 16711680) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & -1006991088) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & -1529942558) * var16 & -16711936) + ((var4 & '\uff00') * var16 & -1417756132) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 1435762309) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & -368386903) * var16 & 1213591705) + ((var4 & -1828629015) * var16 & 164928987) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 1663646039) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & 105719364) + ((var4 & -1888259897) * var16 & 2130424395) >> 8;
                     }

                     ++var5;
                     var3 += var17;
                     if ((var4 = var2[(var3 & 16256) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & 16711935) * var16 & -16711936) + ((var4 & '\uff00') * var16 & -2102822251) >> 8;
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
                        } else if (var21 > -52949279) {
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
                     if ((var4 = var2[(var3 & -180251273) + (var3 >>> 25)]) != 0) {
                        var1[var5] = ((var4 & -287080772) * var16 & -16711936) + ((var4 & '\uff00') * var16 & 16711680) >> 8;
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

   jd(kr var1) {
      super(var1);
   }

   void cj(int[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
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
         int var18 = var7 - var6;
         int var16;
         int var17;
         int var19;
         int var20;
         int var21;
         int var22;
         int var23;
         int var24;
         if (this.ae) {
            var24 = var6 - this.ar.ah;
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
            if (this.ac) {
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
            var24 = var6 - this.ar.ah;
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
            if (this.ac) {
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

   final void bq(int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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
         int var9;
         int var10;
         int var11;
         int var12;
         if (this.ar.ae) {
            var4 = var6 - var5 >> 2;
            var8 <<= 2;
            if (this.ar.ag == 0) {
               if (var4 > 0) {
                  do {
                     var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.au[var9];
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
                  var3 = this.au[var9];

                  do {
                     var1[var2++] = var3;
                     --var4;
                  } while(var4 > 0);
               }
            } else {
               var9 = this.ar.ag;
               var10 = 256 - this.ar.ag;
               if (var4 > 0) {
                  do {
                     var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                     var3 = this.au[var11];
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
                  var3 = this.au[var11];
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
            if (this.ar.ag == 0) {
               do {
                  var9 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var1[var2++] = this.au[var9];
                  var7 += var8;
                  --var4;
               } while(var4 > 0);
            } else {
               var9 = this.ar.ag;
               var10 = 256 - this.ar.ag;

               do {
                  var11 = (var7 & (var7 >> 31 & 1) - 1) >> 8;
                  var3 = this.au[var11];
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
}
