public class co {
   static vv tj;
   int[][] ay;
   int ai;
   static final int bo = 54;
   static final int ce = 40;
   int aj;
   static final int as = 1;
   static final int by = 17;
   static final int aw = 7;
   static final int ap = -3355444;
   public static final int az = 64;

   byte[] ay(byte[] var1) {
      if (null != this.ay) {
         int var2 = (int)((long)var1.length * (long)(212193755 * this.ai) / (long)(1572442445 * this.aj)) + 14;
         int[] var3 = new int[var2];
         int var4 = 0;
         int var5 = 0;

         int var6;
         for(var6 = 0; var6 < var1.length; ++var6) {
            byte var7 = var1[var6];
            int[] var8 = this.ay[var5];

            int var9;
            for(var9 = 0; var9 < 14; ++var9) {
               var3[var9 + var4] += var8[var9] * var7;
            }

            var5 += this.ai * 212193755;
            var9 = var5 / (1572442445 * this.aj);
            var4 += var9;
            var5 -= var9 * this.aj * 1572442445;
         }

         var1 = new byte[var2];

         for(var6 = 0; var6 < var2; ++var6) {
            int var10 = '耀' + var3[var6] >> 16;
            if (var10 < -128) {
               var1[var6] = -128;
            } else if (var10 > 127) {
               var1[var6] = 127;
            } else {
               var1[var6] = (byte)var10;
            }
         }
      }

      return var1;
   }

   byte[] ap(byte[] var1, byte var2) {
      try {
         if (null != this.ay) {
            int var3 = (int)((long)var1.length * (long)(212193755 * this.ai) / (long)(1572442445 * this.aj)) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;

            int var7;
            for(var7 = 0; var7 < var1.length; ++var7) {
               if (var2 != 1) {
                  throw new IllegalStateException();
               }

               byte var8 = var1[var7];
               int[] var9 = this.ay[var6];

               int var10;
               for(var10 = 0; var10 < 14; ++var10) {
                  var4[var10 + var5] += var9[var10] * var8;
               }

               var6 += this.ai * 212193755;
               var10 = var6 / (1572442445 * this.aj);
               var5 += var10;
               var6 -= var10 * this.aj * 1572442445;
            }

            var1 = new byte[var3];

            for(var7 = 0; var7 < var3; ++var7) {
               if (var2 != 1) {
                  throw new IllegalStateException();
               }

               int var12 = '耀' + var4[var7] >> 16;
               if (var12 < -128) {
                  var1[var7] = -128;
               } else if (var12 > 127) {
                  if (var2 != 1) {
                     throw new IllegalStateException();
                  }

                  var1[var7] = 127;
               } else {
                  var1[var7] = (byte)var12;
               }
            }
         }

         return var1;
      } catch (RuntimeException var11) {
         throw tm.aw(var11, "co.ap(" + ')');
      }
   }

   int aw(int var1, int var2) {
      try {
         if (null != this.ay) {
            var1 = (int)((long)var1 * (long)(this.ai * 212193755) / (long)(1572442445 * this.aj));
         }

         return var1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "co.aw(" + ')');
      }
   }

   public co(int var1, int var2) {
      try {
         super();
         if (var2 != var1) {
            int var4 = var1;
            int var5 = var2;
            if (var2 > var1) {
               var4 = var2;
               var5 = var1;
            }

            while(var5 != 0) {
               int var6 = var4 % var5;
               var4 = var5;
               var5 = var6;
            }

            var1 /= var4;
            var2 /= var4;
            this.aj = -513536123 * var1;
            this.ai = var2 * 36684371;
            this.ay = new int[var1][14];

            for(int var7 = 0; var7 < var1; ++var7) {
               int[] var8 = this.ay[var7];
               double var9 = 6.0D + (double)var7 / (double)var1;
               int var11 = (int)Math.floor(1.0D + (var9 - 7.0D));
               if (var11 < 0) {
                  var11 = 0;
               }

               int var12 = (int)Math.ceil(var9 + 7.0D);
               if (var12 > 14) {
                  var12 = 14;
               }

               for(double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) {
                  double var15 = ((double)var11 - var9) * 3.141592653589793D;
                  double var17 = var13;
                  if (var15 < -1.0E-4D || var15 > 1.0E-4D) {
                     var17 = var13 * (Math.sin(var15) / var15);
                  }

                  var17 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var11 - var9));
                  var8[var11] = (int)Math.floor(var17 * 65536.0D + 0.5D);
               }
            }

         }
      } catch (RuntimeException var19) {
         throw tm.aw(var19, "co.<init>(" + ')');
      }
   }

   byte[] aj(byte[] var1) {
      if (null != this.ay) {
         int var2 = (int)((long)var1.length * (long)(212193755 * this.ai) / (long)(1572442445 * this.aj)) + 14;
         int[] var3 = new int[var2];
         int var4 = 0;
         int var5 = 0;

         int var6;
         for(var6 = 0; var6 < var1.length; ++var6) {
            byte var7 = var1[var6];
            int[] var8 = this.ay[var5];

            int var9;
            for(var9 = 0; var9 < 14; ++var9) {
               var3[var9 + var4] += var8[var9] * var7;
            }

            var5 += this.ai * 212193755;
            var9 = var5 / (1572442445 * this.aj);
            var4 += var9;
            var5 -= var9 * this.aj * 1572442445;
         }

         var1 = new byte[var2];

         for(var6 = 0; var6 < var2; ++var6) {
            int var10 = '耀' + var3[var6] >> 16;
            if (var10 < -128) {
               var1[var6] = -128;
            } else if (var10 > 127) {
               var1[var6] = 127;
            } else {
               var1[var6] = (byte)var10;
            }
         }
      }

      return var1;
   }

   byte[] ai(byte[] var1) {
      if (null != this.ay) {
         int var2 = (int)((long)var1.length * (long)(212193755 * this.ai) / (long)(308047335 * this.aj)) + 14;
         int[] var3 = new int[var2];
         int var4 = 0;
         int var5 = 0;

         int var6;
         for(var6 = 0; var6 < var1.length; ++var6) {
            byte var7 = var1[var6];
            int[] var8 = this.ay[var5];

            int var9;
            for(var9 = 0; var9 < 14; ++var9) {
               var3[var9 + var4] += var8[var9] * var7;
            }

            var5 += this.ai * -587705005;
            var9 = var5 / (1572442445 * this.aj);
            var4 += var9;
            var5 -= var9 * this.aj * 1572442445;
         }

         var1 = new byte[var2];

         for(var6 = 0; var6 < var2; ++var6) {
            int var10 = -1882653543 + var3[var6] >> 16;
            if (var10 < -128) {
               var1[var6] = (byte)-1864615258;
            } else if (var10 > 127) {
               var1[var6] = (byte)-1167289347;
            } else {
               var1[var6] = (byte)var10;
            }
         }
      }

      return var1;
   }

   int ak(int var1, int var2) {
      try {
         if (null != this.ay) {
            if (var2 <= 581064793) {
               throw new IllegalStateException();
            }

            var1 = 6 + (int)((long)var1 * (long)(212193755 * this.ai) / (long)(1572442445 * this.aj));
         }

         return var1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "co.ak(" + ')');
      }
   }

   byte[] as(byte[] var1) {
      if (null != this.ay) {
         int var2 = (int)((long)var1.length * (long)(212193755 * this.ai) / (long)(1572442445 * this.aj)) + 14;
         int[] var3 = new int[var2];
         int var4 = 0;
         int var5 = 0;

         int var6;
         for(var6 = 0; var6 < var1.length; ++var6) {
            byte var7 = var1[var6];
            int[] var8 = this.ay[var5];

            int var9;
            for(var9 = 0; var9 < 14; ++var9) {
               var3[var9 + var4] += var8[var9] * var7;
            }

            var5 += this.ai * 212193755;
            var9 = var5 / (1572442445 * this.aj);
            var4 += var9;
            var5 -= var9 * this.aj * 1572442445;
         }

         var1 = new byte[var2];

         for(var6 = 0; var6 < var2; ++var6) {
            int var10 = '耀' + var3[var6] >> 16;
            if (var10 < -128) {
               var1[var6] = -128;
            } else if (var10 > 127) {
               var1[var6] = 127;
            } else {
               var1[var6] = (byte)var10;
            }
         }
      }

      return var1;
   }

   int ae(int var1) {
      if (null != this.ay) {
         var1 = (int)((long)var1 * (long)(this.ai * 200810646) / (long)(1572442445 * this.aj));
      }

      return var1;
   }

   int am(int var1) {
      if (null != this.ay) {
         var1 = 6 + (int)((long)var1 * (long)(212193755 * this.ai) / (long)(1572442445 * this.aj));
      }

      return var1;
   }

   int at(int var1) {
      if (null != this.ay) {
         var1 = 6 + (int)((long)var1 * (long)(212193755 * this.ai) / (long)(1572442445 * this.aj));
      }

      return var1;
   }

   static int bp(int var0, da var1, boolean var2, int var3) {
      try {
         int var5;
         int var11;
         if (var0 == 4000) {
            if (var3 == 178772449) {
               throw new IllegalStateException();
            } else {
               dp.am -= 1393015090;
               var11 = cm.ae[dp.am * -158156887];
               var5 = cm.ae[-158156887 * dp.am + 1];
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var11 + var5;
               return 1;
            }
         } else if (4001 == var0) {
            if (var3 == 178772449) {
               throw new IllegalStateException();
            } else {
               dp.am -= 1393015090;
               var11 = cm.ae[dp.am * -158156887];
               var5 = cm.ae[dp.am * -158156887 + 1];
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var11 - var5;
               return 1;
            }
         } else if (var0 == 4002) {
            dp.am -= 1393015090;
            var11 = cm.ae[dp.am * -158156887];
            var5 = cm.ae[1 + dp.am * -158156887];
            cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var11 * var5;
            return 1;
         } else if (var0 == 4003) {
            if (var3 == 178772449) {
               throw new IllegalStateException();
            } else {
               dp.am -= 1393015090;
               var11 = cm.ae[dp.am * -158156887];
               var5 = cm.ae[1 + dp.am * -158156887];
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var11 / var5;
               return 1;
            }
         } else if (4004 == var0) {
            if (var3 == 178772449) {
               throw new IllegalStateException();
            } else {
               var11 = cm.ae[(dp.am -= -1450976103) * -158156887];
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = (int)(Math.random() * (double)var11);
               return 1;
            }
         } else if (var0 == 4005) {
            if (var3 == 178772449) {
               throw new IllegalStateException();
            } else {
               var11 = cm.ae[(dp.am -= -1450976103) * -158156887];
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = (int)(Math.random() * (double)(1 + var11));
               return 1;
            }
         } else {
            int var6;
            int var7;
            int var8;
            if (var0 == 4006) {
               if (var3 == 178772449) {
                  throw new IllegalStateException();
               } else {
                  dp.am -= 1335054077;
                  var11 = cm.ae[dp.am * -158156887];
                  var5 = cm.ae[1 + dp.am * -158156887];
                  var6 = cm.ae[2 + -158156887 * dp.am];
                  var7 = cm.ae[-158156887 * dp.am + 3];
                  var8 = cm.ae[4 + dp.am * -158156887];
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = (var5 - var11) * (var8 - var6) / (var7 - var6) + var11;
                  return 1;
               }
            } else if (4007 == var0) {
               if (var3 == 178772449) {
                  throw new IllegalStateException();
               } else {
                  dp.am -= 1393015090;
                  var11 = cm.ae[dp.am * -158156887];
                  var5 = cm.ae[dp.am * -158156887 + 1];
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var11 + var11 * var5 / 100;
                  return 1;
               }
            } else if (4008 == var0) {
               if (var3 == 178772449) {
                  throw new IllegalStateException();
               } else {
                  dp.am -= 1393015090;
                  var11 = cm.ae[dp.am * -158156887];
                  var5 = cm.ae[1 + -158156887 * dp.am];
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var11 | 1 << var5;
                  return 1;
               }
            } else if (var0 == 4009) {
               dp.am -= 1393015090;
               var11 = cm.ae[dp.am * -158156887];
               var5 = cm.ae[1 + dp.am * -158156887];
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var11 & -1 - (1 << var5);
               return 1;
            } else {
               int[] var10000;
               int var10001;
               if (4010 == var0) {
                  if (var3 == 178772449) {
                     throw new IllegalStateException();
                  } else {
                     dp.am -= 1393015090;
                     var11 = cm.ae[dp.am * -158156887];
                     var5 = cm.ae[dp.am * -158156887 + 1];
                     var10000 = cm.ae;
                     var10001 = (dp.am += -1450976103) * -158156887 - 1;
                     byte var15;
                     if ((var11 & 1 << var5) != 0) {
                        if (var3 == 178772449) {
                           throw new IllegalStateException();
                        }

                        var15 = 1;
                     } else {
                        var15 = 0;
                     }

                     var10000[var10001] = var15;
                     return 1;
                  }
               } else if (var0 == 4011) {
                  if (var3 == 178772449) {
                     throw new IllegalStateException();
                  } else {
                     dp.am -= 1393015090;
                     var11 = cm.ae[-158156887 * dp.am];
                     var5 = cm.ae[-158156887 * dp.am + 1];
                     cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var11 % var5;
                     return 1;
                  }
               } else if (4012 == var0) {
                  dp.am -= 1393015090;
                  var11 = cm.ae[dp.am * -158156887];
                  var5 = cm.ae[-158156887 * dp.am + 1];
                  if (var11 == 0) {
                     if (var3 == 178772449) {
                        throw new IllegalStateException();
                     }

                     cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 0;
                  } else {
                     cm.ae[(dp.am += -1450976103) * -158156887 - 1] = (int)Math.pow((double)var11, (double)var5);
                  }

                  return 1;
               } else if (var0 == 4013) {
                  if (var3 == 178772449) {
                     throw new IllegalStateException();
                  } else {
                     dp.am -= 1393015090;
                     var11 = cm.ae[dp.am * -158156887];
                     var5 = cm.ae[dp.am * -158156887 + 1];
                     if (var11 == 0) {
                        if (var3 == 178772449) {
                           throw new IllegalStateException();
                        } else {
                           cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 0;
                           return 1;
                        }
                     } else {
                        switch(var5) {
                        case 0:
                           cm.ae[(dp.am += -1450976103) * -158156887 - 1] = Integer.MAX_VALUE;
                           break;
                        case 1:
                           cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var11;
                           break;
                        case 2:
                           cm.ae[(dp.am += -1450976103) * -158156887 - 1] = (int)Math.sqrt((double)var11);
                           break;
                        case 3:
                           cm.ae[(dp.am += -1450976103) * -158156887 - 1] = (int)Math.cbrt((double)var11);
                           break;
                        case 4:
                           cm.ae[(dp.am += -1450976103) * -158156887 - 1] = (int)Math.sqrt(Math.sqrt((double)var11));
                           break;
                        default:
                           cm.ae[(dp.am += -1450976103) * -158156887 - 1] = (int)Math.pow((double)var11, 1.0D / (double)var5);
                        }

                        return 1;
                     }
                  }
               } else if (var0 == 4014) {
                  if (var3 == 178772449) {
                     throw new IllegalStateException();
                  } else {
                     dp.am -= 1393015090;
                     var11 = cm.ae[-158156887 * dp.am];
                     var5 = cm.ae[1 + -158156887 * dp.am];
                     cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var11 & var5;
                     return 1;
                  }
               } else if (4015 == var0) {
                  if (var3 == 178772449) {
                     throw new IllegalStateException();
                  } else {
                     dp.am -= 1393015090;
                     var11 = cm.ae[dp.am * -158156887];
                     var5 = cm.ae[1 + dp.am * -158156887];
                     cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var11 | var5;
                     return 1;
                  }
               } else if (var0 == 4016) {
                  if (var3 == 178772449) {
                     throw new IllegalStateException();
                  } else {
                     dp.am -= 1393015090;
                     var11 = cm.ae[dp.am * -158156887];
                     var5 = cm.ae[dp.am * -158156887 + 1];
                     var10000 = cm.ae;
                     var10001 = (dp.am += -1450976103) * -158156887 - 1;
                     int var10002;
                     if (var11 < var5) {
                        if (var3 == 178772449) {
                           throw new IllegalStateException();
                        }

                        var10002 = var11;
                     } else {
                        var10002 = var5;
                     }

                     var10000[var10001] = var10002;
                     return 1;
                  }
               } else if (var0 == 4017) {
                  if (var3 == 178772449) {
                     throw new IllegalStateException();
                  } else {
                     dp.am -= 1393015090;
                     var11 = cm.ae[-158156887 * dp.am];
                     var5 = cm.ae[1 + dp.am * -158156887];
                     cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var11 > var5 ? var11 : var5;
                     return 1;
                  }
               } else if (var0 == 4018) {
                  dp.am -= -57961013;
                  long var12 = (long)cm.ae[-158156887 * dp.am];
                  long var13 = (long)cm.ae[1 + dp.am * -158156887];
                  long var14 = (long)cm.ae[2 + dp.am * -158156887];
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = (int)(var14 * var12 / var13);
                  return 1;
               } else if (4025 == var0) {
                  if (var3 == 178772449) {
                     throw new IllegalStateException();
                  } else {
                     var11 = qj.ak(cm.ae[(dp.am -= -1450976103) * -158156887], (byte)2);
                     cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var11;
                     return 1;
                  }
               } else if (var0 == 4026) {
                  if (var3 == 178772449) {
                     throw new IllegalStateException();
                  } else {
                     dp.am -= 1393015090;
                     var11 = cm.ae[dp.am * -158156887];
                     var5 = cm.ae[1 + -158156887 * dp.am];
                     cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var11 ^ 1 << var5;
                     return 1;
                  }
               } else if (var0 == 4027) {
                  if (var3 == 178772449) {
                     throw new IllegalStateException();
                  } else {
                     dp.am -= -57961013;
                     var11 = cm.ae[dp.am * -158156887];
                     var5 = cm.ae[-158156887 * dp.am + 1];
                     var6 = cm.ae[-158156887 * dp.am + 2];
                     cm.ae[(dp.am += -1450976103) * -158156887 - 1] = mr.ai(var11, var5, var6, -1811628521);
                     return 1;
                  }
               } else if (var0 == 4028) {
                  if (var3 == 178772449) {
                     throw new IllegalStateException();
                  } else {
                     dp.am -= -57961013;
                     var11 = cm.ae[dp.am * -158156887];
                     var5 = cm.ae[dp.am * -158156887 + 1];
                     var6 = cm.ae[dp.am * -158156887 + 2];
                     cm.ae[(dp.am += -1450976103) * -158156887 - 1] = gx.aj(var11, var5, var6, (byte)10);
                     return 1;
                  }
               } else if (var0 == 4029) {
                  dp.am -= -57961013;
                  var11 = cm.ae[dp.am * -158156887];
                  var5 = cm.ae[dp.am * -158156887 + 1];
                  var6 = cm.ae[2 + dp.am * -158156887];
                  var7 = 31 - var6;
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var11 << var7 >>> var7 + var5;
                  return 1;
               } else if (var0 == 4030) {
                  if (var3 == 178772449) {
                     throw new IllegalStateException();
                  } else {
                     dp.am -= -1508937116;
                     var11 = cm.ae[-158156887 * dp.am];
                     var5 = cm.ae[1 + -158156887 * dp.am];
                     var6 = cm.ae[2 + -158156887 * dp.am];
                     var7 = cm.ae[3 + -158156887 * dp.am];
                     var11 = gx.aj(var11, var6, var7, (byte)38);
                     var8 = cr.aw(var7 - var6 + 1, 107021418);
                     if (var5 > var8) {
                        if (var3 == 178772449) {
                           throw new IllegalStateException();
                        }

                        var5 = var8;
                     }

                     cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var11 | var5 << var6;
                     return 1;
                  }
               } else if (var0 == 4032) {
                  if (var3 == 178772449) {
                     throw new IllegalStateException();
                  } else {
                     cm.ae[-158156887 * dp.am - 1] = ac.aw(cm.ae[-158156887 * dp.am - 1], 1647584111);
                     return 1;
                  }
               } else if (var0 == 4033) {
                  if (var3 == 178772449) {
                     throw new IllegalStateException();
                  } else {
                     cm.ae[-158156887 * dp.am - 1] = sk.ak(cm.ae[dp.am * -158156887 - 1], -1283890349);
                     return 1;
                  }
               } else if (4034 == var0) {
                  if (var3 == 178772449) {
                     throw new IllegalStateException();
                  } else {
                     dp.am -= 1393015090;
                     var11 = cm.ae[-158156887 * dp.am];
                     var5 = cm.ae[-158156887 * dp.am + 1];
                     var6 = kb.ap(var11, var5, 1338401443);
                     cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var6;
                     return 1;
                  }
               } else if (var0 == 4035) {
                  if (var3 == 178772449) {
                     throw new IllegalStateException();
                  } else {
                     cm.ae[dp.am * -158156887 - 1] = Math.abs(cm.ae[dp.am * -158156887 - 1]);
                     return 1;
                  }
               } else if (var0 == 4036) {
                  if (var3 == 178772449) {
                     throw new IllegalStateException();
                  } else {
                     String var4 = cm.at[(ih.au -= 746573637) * -114988147];
                     var5 = -1;
                     if (ly.aw(var4, -1763722820)) {
                        if (var3 == 178772449) {
                           throw new IllegalStateException();
                        }

                        var5 = bj.aj(var4, -1481777132);
                     }

                     cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var5;
                     return 1;
                  }
               } else {
                  return 2;
               }
            }
         }
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "co.bp(" + ')');
      }
   }

   static final void am(int var0) {
      try {
         og var10000 = (og)null;
         String var1 = og.hu;
         qc.aw(30, "", var1, (byte)99);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "co.am(" + ')');
      }
   }

   static boolean lt(int var0, int var1, byte var2) {
      try {
         int var4 = var1;
         if (var1 >= 2000) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            var4 = var1 - 2000;
         }

         boolean var10000;
         label372: {
            if (ib.mk * 718657319 != var0) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               if (-1 != var0) {
                  var10000 = false;
                  break label372;
               }

               if (var2 >= 0) {
                  throw new IllegalStateException();
               }
            }

            var10000 = true;
         }

         boolean var5 = var10000;
         boolean var6;
         if (!var5) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            label362: {
               if (var4 != 2) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (var4 != 8 && 25 != var4) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (17 != var4) {
                        if (25 != var4) {
                           var10000 = false;
                           break label362;
                        }

                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }
                     }
                  }
               }

               var10000 = true;
            }

            var6 = var10000;
            var5 = var6;
         }

         var6 = var5;
         boolean var7;
         if (!var5) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            label402: {
               if (14 != var4) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (var4 != 15) {
                     label394: {
                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }

                        if (var4 >= 44) {
                           if (var2 >= 0) {
                              throw new IllegalStateException();
                           }

                           if (var4 <= 51) {
                              if (var2 >= 0) {
                                 throw new IllegalStateException();
                              }
                              break label394;
                           }
                        }

                        var10000 = false;
                        break label402;
                     }
                  }
               }

               var10000 = true;
            }

            var7 = var10000;
            var6 = var7;
         }

         var7 = var6;
         boolean var8;
         if (!var6) {
            label332: {
               if (1002 != var4) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (1003 != var4) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (var4 != 1004) {
                        var10000 = false;
                        break label332;
                     }

                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }
                  }
               }

               var10000 = true;
            }

            var8 = var10000;
            var7 = var8;
         }

         if (!var7) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            label403: {
               if (var1 != 14) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (15 != var1) {
                     label397: {
                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }

                        if (var1 >= 44) {
                           if (var2 >= 0) {
                              throw new IllegalStateException();
                           }

                           if (var1 <= 51) {
                              if (var2 >= 0) {
                                 throw new IllegalStateException();
                              }
                              break label397;
                           }
                        }

                        var10000 = false;
                        break label403;
                     }
                  }
               }

               var10000 = true;
            }

            var6 = var10000;
            var7 = var6;
            if (!var6) {
               label306: {
                  if (var1 != 1) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (var1 != 2) {
                        label383: {
                           if (var2 >= 0) {
                              throw new IllegalStateException();
                           }

                           if (var1 >= 3) {
                              if (var2 >= 0) {
                                 throw new IllegalStateException();
                              }

                              if (var1 <= 6) {
                                 break label383;
                              }

                              if (var2 >= 0) {
                                 throw new IllegalStateException();
                              }
                           }

                           if (var1 != 1001) {
                              var10000 = false;
                              break label306;
                           }
                        }
                     }
                  }

                  var10000 = true;
               }

               var8 = var10000;
               var7 = var8;
            }

            var8 = var7;
            boolean var9;
            if (!var7) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               label404: {
                  if (var1 != 7) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (8 != var1) {
                        label399: {
                           if (var2 >= 0) {
                              throw new IllegalStateException();
                           }

                           if (var1 >= 9) {
                              if (var2 >= 0) {
                                 throw new IllegalStateException();
                              }

                              if (var1 <= 13) {
                                 if (var2 >= 0) {
                                    throw new IllegalStateException();
                                 }
                                 break label399;
                              }
                           }

                           var10000 = false;
                           break label404;
                        }
                     }
                  }

                  var10000 = true;
               }

               var9 = var10000;
               var8 = var9;
            }

            var9 = var8;
            boolean var10;
            if (!var8) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               label405: {
                  if (var1 != 16) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (var1 != 17) {
                        label401: {
                           if (var1 >= 18) {
                              if (var2 >= 0) {
                                 throw new IllegalStateException();
                              }

                              if (var1 <= 22) {
                                 break label401;
                              }
                           }

                           var10000 = false;
                           break label405;
                        }
                     }
                  }

                  var10000 = true;
               }

               var10 = var10000;
               var9 = var10;
            }

            var10 = var9;
            if (!var9) {
               label257: {
                  if (1002 != var1) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (1003 != var1) {
                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }

                        if (1004 != var1) {
                           var10000 = false;
                           break label257;
                        }

                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }
                     }
                  }

                  var10000 = true;
               }

               boolean var11 = var10000;
               var10 = var11;
            }

            if (var10) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               sf var13 = client.jv.at(var0, (byte)44);
               if (var13 == sf.ap) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  return false;
               }

               if (sf.ak == var13) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  label241: {
                     if (1002 != var1 && var1 != 1003) {
                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }

                        if (1004 != var1) {
                           var10000 = false;
                           break label241;
                        }

                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }
                     }

                     var10000 = true;
                  }

                  var7 = var10000;
                  if (!var7) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }
               }
            }

            return true;
         }
      } catch (RuntimeException var12) {
         throw tm.aw(var12, "co.lt(" + ')');
      }
   }

   static int aq(int var0, da var1, boolean var2, int var3) {
      try {
         ng var4;
         if (2700 == var0) {
            if (var3 != 829360175) {
               throw new IllegalStateException();
            } else {
               var4 = qk.ek.ap(cm.ae[(dp.am -= -1450976103) * -158156887], -522821362);
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = -2104795295 * var4.go;
               return 1;
            }
         } else if (2701 == var0) {
            if (var3 != 829360175) {
               throw new IllegalStateException();
            } else {
               var4 = qk.ek.ap(cm.ae[(dp.am -= -1450976103) * -158156887], 851703028);
               if (var4.go * -2104795295 != -1) {
                  if (var3 != 829360175) {
                     throw new IllegalStateException();
                  }

                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = -77256189 * var4.gi;
               } else {
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 0;
               }

               return 1;
            }
         } else if (var0 == 2702) {
            if (var3 != 829360175) {
               throw new IllegalStateException();
            } else {
               int var7 = cm.ae[(dp.am -= -1450976103) * -158156887];
               dm var5 = (dm)client.om.ap((long)var7);
               if (null != var5) {
                  if (var3 != 829360175) {
                     throw new IllegalStateException();
                  }

                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 1;
               } else {
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 0;
               }

               return 1;
            }
         } else if (var0 == 2706) {
            if (var3 != 829360175) {
               throw new IllegalStateException();
            } else {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 1832668233 * client.og;
               return 1;
            }
         } else if (2707 == var0) {
            if (var3 != 829360175) {
               throw new IllegalStateException();
            } else {
               var4 = qk.ek.ap(cm.ae[(dp.am -= -1450976103) * -158156887], 426575727);
               int[] var10000 = cm.ae;
               int var10001 = (dp.am += -1450976103) * -158156887 - 1;
               byte var10002;
               if (var4.bh(-1094784837)) {
                  if (var3 != 829360175) {
                     throw new IllegalStateException();
                  }

                  var10002 = 1;
               } else {
                  var10002 = 0;
               }

               var10000[var10001] = var10002;
               return 1;
            }
         } else if (var0 == 2708) {
            if (var3 != 829360175) {
               throw new IllegalStateException();
            } else {
               var4 = qk.ek.ap(cm.ae[(dp.am -= -1450976103) * -158156887], -1513598545);
               return dr.az(var4, 1013973938);
            }
         } else if (var0 == 2709) {
            if (var3 != 829360175) {
               throw new IllegalStateException();
            } else {
               var4 = qk.ek.ap(cm.ae[(dp.am -= -1450976103) * -158156887], 793533967);
               return df.ag(var4, 2038175006);
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "co.aq(" + ')');
      }
   }
}
