public class bf extends bg {
   int an;
   int aw;
   int ak;
   int at;
   int ap;
   int ay;
   int as;
   int ao;
   int am;
   boolean au;
   int ae;
   int af;
   int ai;
   int aj;
   int ar;

   static int fc(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, bf var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.ay += var9.af * (var6 - var3);
      var9.as += var9.ar * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      var9.ai = var4 >> 2;
      var9.ap = var2 << 8;
      return var3;
   }

   static int aw(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
   }

   static int eu(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, bf var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.ap = var3 << 8;
      return var4 >> 1;
   }

   bf(bt var1, int var2, int var3) {
      this.ag = var1;
      this.am = var1.ak;
      this.at = var1.aj;
      this.au = var1.ai;
      this.aw = var2;
      this.ak = var3;
      this.aj = 8192;
      this.ap = 0;
      this.ai();
   }

   bf(bt var1, int var2, int var3, int var4) {
      this.ag = var1;
      this.am = var1.ak;
      this.at = var1.aj;
      this.au = var1.ai;
      this.aw = var2;
      this.ak = var3;
      this.aj = var4;
      this.ap = 0;
      this.ai();
   }

   int bt() {
      int var1 = this.ai * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.ae == 0) {
         var1 -= var1 * this.ap / (((bt)this.ag).aw.length << 8);
      } else if (this.ae >= 0) {
         var1 -= var1 * this.am / ((bt)this.ag).aw.length;
      }

      return var1 > 255 ? 255 : var1;
   }

   public static bf aj(bt var0, int var1, int var2, int var3) {
      return var0.aw != null && var0.aw.length != 0 ? new bf(var0, var1, var2, var3) : null;
   }

   void ai() {
      this.ai = this.ak;
      this.ay = ap(this.ak, this.aj);
      this.as = aw(this.ak, this.aj);
   }

   public synchronized void at(int var1) {
      this.ae = var1;
   }

   public synchronized void an(int var1) {
      this.af(var1 << 6, this.ab());
   }

   synchronized void ao(int var1) {
      this.af(var1, this.ab());
   }

   synchronized void af(int var1, int var2) {
      this.ak = var1;
      this.aj = var2;
      this.an = 0;
      this.ai();
   }

   public synchronized int ek() {
      return this.aw < 0 ? -this.aw : this.aw;
   }

   public synchronized int ab() {
      return this.aj < 0 ? -1 : this.aj;
   }

   public static bf ct(bt var0, int var1, int var2, int var3) {
      return var0.aw != null && var0.aw.length != 0 ? new bf(var0, var1, var2, var3) : null;
   }

   public synchronized void dx(boolean var1) {
      this.aw = (this.aw ^ this.aw >> 31) + (this.aw >>> 31);
      if (var1) {
         this.aw = -this.aw;
      }

   }

   void ad() {
      if (this.an != 0) {
         if (this.ak == Integer.MIN_VALUE) {
            this.ak = 0;
         }

         this.an = 0;
         this.ai();
      }

   }

   public synchronized void ac(int var1, int var2) {
      this.av(var1, var2, this.ab());
   }

   public synchronized void av(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.af(var2, var3);
      } else {
         int var4 = ap(var2, var3);
         int var5 = aw(var2, var3);
         if (this.ay == var4 && this.as == var5) {
            this.an = 0;
         } else {
            int var6 = var2 - this.ai;
            if (this.ai - var2 > var6) {
               var6 = this.ai - var2;
            }

            if (var4 - this.ay > var6) {
               var6 = var4 - this.ay;
            }

            if (this.ay - var4 > var6) {
               var6 = this.ay - var4;
            }

            if (var5 - this.as > var6) {
               var6 = var5 - this.as;
            }

            if (this.as - var5 > var6) {
               var6 = this.as - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.an = var1;
            this.ak = var2;
            this.aj = var3;
            this.ao = (var2 - this.ai) / var1;
            this.af = (var4 - this.ay) / var1;
            this.ar = (var5 - this.as) / var1;
         }
      }
   }

   static int fg(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, bf var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.ay += var9.af * (var6 - var3);
      var9.as += var9.ar * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      var9.ai = var4 >> 2;
      var9.ap = var2 << 8;
      return var3;
   }

   public synchronized void az(int var1) {
      int var2 = ((bt)this.ag).aw.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.ap = var1;
   }

   static int fq(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, bf var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.ai += var12.ao * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.ay = var5 >> 2;
      var12.as = var6 >> 2;
      var12.ap = var3 << 8;
      return var4 >> 1;
   }

   public boolean bb() {
      return this.ap < 0 || this.ap >= ((bt)this.ag).aw.length << 8;
   }

   public boolean bq() {
      return this.an != 0;
   }

   protected bg ay() {
      return null;
   }

   public synchronized void bx(int[] var1, int var2, int var3) {
      if (this.ak == 0 && this.an == 0) {
         this.au(var3);
      } else {
         bt var4 = (bt)this.ag;
         int var5 = this.am << 8;
         int var6 = this.at << 8;
         int var7 = var4.aw.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.ae = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.ap < 0) {
            if (this.aw <= 0) {
               this.ad();
               this.kf();
               return;
            }

            this.ap = 0;
         }

         if (this.ap >= var7) {
            if (this.aw >= 0) {
               this.ad();
               this.kf();
               return;
            }

            this.ap = var7 - 1;
         }

         if (this.ae < 0) {
            if (this.au) {
               if (this.aw < 0) {
                  var9 = this.by(var1, var2, var5, var3, var4.aw[this.am]);
                  if (this.ap >= var5) {
                     return;
                  }

                  this.ap = var5 + var5 - 1 - this.ap;
                  this.aw = -this.aw;
               }

               while(true) {
                  var9 = this.bp(var1, var9, var6, var3, var4.aw[this.at - 1]);
                  if (this.ap < var6) {
                     return;
                  }

                  this.ap = var6 + var6 - 1 - this.ap;
                  this.aw = -this.aw;
                  var9 = this.by(var1, var9, var5, var3, var4.aw[this.am]);
                  if (this.ap >= var5) {
                     return;
                  }

                  this.ap = var5 + var5 - 1 - this.ap;
                  this.aw = -this.aw;
               }
            } else if (this.aw < 0) {
               while(true) {
                  var9 = this.by(var1, var9, var5, var3, var4.aw[this.at - 1]);
                  if (this.ap >= var5) {
                     return;
                  }

                  this.ap = var6 - 1 - (var6 - 1 - this.ap) % var8;
               }
            } else {
               while(true) {
                  var9 = this.bp(var1, var9, var6, var3, var4.aw[this.am]);
                  if (this.ap < var6) {
                     return;
                  }

                  this.ap = var5 + (this.ap - var5) % var8;
               }
            }
         } else {
            if (this.ae > 0) {
               if (this.au) {
                  label184: {
                     if (this.aw < 0) {
                        var9 = this.by(var1, var2, var5, var3, var4.aw[this.am]);
                        if (this.ap >= var5) {
                           return;
                        }

                        this.ap = var5 + var5 - 1 - this.ap;
                        this.aw = -this.aw;
                        if (--this.ae == 0) {
                           break label184;
                        }
                     }

                     do {
                        var9 = this.bp(var1, var9, var6, var3, var4.aw[this.at - 1]);
                        if (this.ap < var6) {
                           return;
                        }

                        this.ap = var6 + var6 - 1 - this.ap;
                        this.aw = -this.aw;
                        if (--this.ae == 0) {
                           break;
                        }

                        var9 = this.by(var1, var9, var5, var3, var4.aw[this.am]);
                        if (this.ap >= var5) {
                           return;
                        }

                        this.ap = var5 + var5 - 1 - this.ap;
                        this.aw = -this.aw;
                     } while(--this.ae != 0);
                  }
               } else {
                  int var10;
                  if (this.aw < 0) {
                     while(true) {
                        var9 = this.by(var1, var9, var5, var3, var4.aw[this.at - 1]);
                        if (this.ap >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.ap) / var8;
                        if (var10 >= this.ae) {
                           this.ap += var8 * this.ae;
                           this.ae = 0;
                           break;
                        }

                        this.ap += var8 * var10;
                        this.ae -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.bp(var1, var9, var6, var3, var4.aw[this.am]);
                        if (this.ap < var6) {
                           return;
                        }

                        var10 = (this.ap - var5) / var8;
                        if (var10 >= this.ae) {
                           this.ap -= var8 * this.ae;
                           this.ae = 0;
                           break;
                        }

                        this.ap -= var8 * var10;
                        this.ae -= var10;
                     }
                  }
               }
            }

            if (this.aw < 0) {
               this.by(var1, var9, 0, var3, 0);
               if (this.ap < 0) {
                  this.ap = -1;
                  this.ad();
                  this.kf();
               }
            } else {
               this.bp(var1, var9, var7, var3, 0);
               if (this.ap >= var7) {
                  this.ap = var7;
                  this.ad();
                  this.kf();
               }
            }

         }
      }
   }

   protected int ae() {
      return this.ak == 0 && this.an == 0 ? 0 : 1;
   }

   public synchronized void am(int[] var1, int var2, int var3) {
      if (this.ak == 0 && this.an == 0) {
         this.au(var3);
      } else {
         bt var4 = (bt)this.ag;
         int var5 = this.am << 8;
         int var6 = this.at << 8;
         int var7 = var4.aw.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.ae = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.ap < 0) {
            if (this.aw <= 0) {
               this.ad();
               this.kf();
               return;
            }

            this.ap = 0;
         }

         if (this.ap >= var7) {
            if (this.aw >= 0) {
               this.ad();
               this.kf();
               return;
            }

            this.ap = var7 - 1;
         }

         if (this.ae < 0) {
            if (this.au) {
               if (this.aw < 0) {
                  var9 = this.by(var1, var2, var5, var3, var4.aw[this.am]);
                  if (this.ap >= var5) {
                     return;
                  }

                  this.ap = var5 + var5 - 1 - this.ap;
                  this.aw = -this.aw;
               }

               while(true) {
                  var9 = this.bp(var1, var9, var6, var3, var4.aw[this.at - 1]);
                  if (this.ap < var6) {
                     return;
                  }

                  this.ap = var6 + var6 - 1 - this.ap;
                  this.aw = -this.aw;
                  var9 = this.by(var1, var9, var5, var3, var4.aw[this.am]);
                  if (this.ap >= var5) {
                     return;
                  }

                  this.ap = var5 + var5 - 1 - this.ap;
                  this.aw = -this.aw;
               }
            } else if (this.aw < 0) {
               while(true) {
                  var9 = this.by(var1, var9, var5, var3, var4.aw[this.at - 1]);
                  if (this.ap >= var5) {
                     return;
                  }

                  this.ap = var6 - 1 - (var6 - 1 - this.ap) % var8;
               }
            } else {
               while(true) {
                  var9 = this.bp(var1, var9, var6, var3, var4.aw[this.am]);
                  if (this.ap < var6) {
                     return;
                  }

                  this.ap = var5 + (this.ap - var5) % var8;
               }
            }
         } else {
            if (this.ae > 0) {
               if (this.au) {
                  label183: {
                     if (this.aw < 0) {
                        var9 = this.by(var1, var2, var5, var3, var4.aw[this.am]);
                        if (this.ap >= var5) {
                           return;
                        }

                        this.ap = var5 + var5 - 1 - this.ap;
                        this.aw = -this.aw;
                        if (--this.ae == 0) {
                           break label183;
                        }
                     }

                     do {
                        var9 = this.bp(var1, var9, var6, var3, var4.aw[this.at - 1]);
                        if (this.ap < var6) {
                           return;
                        }

                        this.ap = var6 + var6 - 1 - this.ap;
                        this.aw = -this.aw;
                        if (--this.ae == 0) {
                           break;
                        }

                        var9 = this.by(var1, var9, var5, var3, var4.aw[this.am]);
                        if (this.ap >= var5) {
                           return;
                        }

                        this.ap = var5 + var5 - 1 - this.ap;
                        this.aw = -this.aw;
                     } while(--this.ae != 0);
                  }
               } else {
                  int var10;
                  if (this.aw < 0) {
                     while(true) {
                        var9 = this.by(var1, var9, var5, var3, var4.aw[this.at - 1]);
                        if (this.ap >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.ap) / var8;
                        if (var10 >= this.ae) {
                           this.ap += var8 * this.ae;
                           this.ae = 0;
                           break;
                        }

                        this.ap += var8 * var10;
                        this.ae -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.bp(var1, var9, var6, var3, var4.aw[this.am]);
                        if (this.ap < var6) {
                           return;
                        }

                        var10 = (this.ap - var5) / var8;
                        if (var10 >= this.ae) {
                           this.ap -= var8 * this.ae;
                           this.ae = 0;
                           break;
                        }

                        this.ap -= var8 * var10;
                        this.ae -= var10;
                     }
                  }
               }
            }

            if (this.aw < 0) {
               this.by(var1, var9, 0, var3, 0);
               if (this.ap < 0) {
                  this.ap = -1;
                  this.ad();
                  this.kf();
               }
            } else {
               this.bp(var1, var9, var7, var3, 0);
               if (this.ap >= var7) {
                  this.ap = var7;
                  this.ad();
                  this.kf();
               }
            }

         }
      }
   }

   synchronized void dq(int var1) {
      this.af(var1, this.ab());
   }

   static int bu(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, bf var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.ap = var3 << 8;
      return var4 >> 1;
   }

   public synchronized void bk(int[] var1, int var2, int var3) {
      if (this.ak == 0 && this.an == 0) {
         this.au(var3);
      } else {
         bt var4 = (bt)this.ag;
         int var5 = this.am << 8;
         int var6 = this.at << 8;
         int var7 = var4.aw.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.ae = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.ap < 0) {
            if (this.aw <= 0) {
               this.ad();
               this.kf();
               return;
            }

            this.ap = 0;
         }

         if (this.ap >= var7) {
            if (this.aw >= 0) {
               this.ad();
               this.kf();
               return;
            }

            this.ap = var7 - 1;
         }

         if (this.ae < 0) {
            if (this.au) {
               if (this.aw < 0) {
                  var9 = this.by(var1, var2, var5, var3, var4.aw[this.am]);
                  if (this.ap >= var5) {
                     return;
                  }

                  this.ap = var5 + var5 - 1 - this.ap;
                  this.aw = -this.aw;
               }

               while(true) {
                  var9 = this.bp(var1, var9, var6, var3, var4.aw[this.at - 1]);
                  if (this.ap < var6) {
                     return;
                  }

                  this.ap = var6 + var6 - 1 - this.ap;
                  this.aw = -this.aw;
                  var9 = this.by(var1, var9, var5, var3, var4.aw[this.am]);
                  if (this.ap >= var5) {
                     return;
                  }

                  this.ap = var5 + var5 - 1 - this.ap;
                  this.aw = -this.aw;
               }
            } else if (this.aw < 0) {
               while(true) {
                  var9 = this.by(var1, var9, var5, var3, var4.aw[this.at - 1]);
                  if (this.ap >= var5) {
                     return;
                  }

                  this.ap = var6 - 1 - (var6 - 1 - this.ap) % var8;
               }
            } else {
               while(true) {
                  var9 = this.bp(var1, var9, var6, var3, var4.aw[this.am]);
                  if (this.ap < var6) {
                     return;
                  }

                  this.ap = var5 + (this.ap - var5) % var8;
               }
            }
         } else {
            if (this.ae > 0) {
               if (this.au) {
                  label190: {
                     if (this.aw < 0) {
                        var9 = this.by(var1, var2, var5, var3, var4.aw[this.am]);
                        if (this.ap >= var5) {
                           return;
                        }

                        this.ap = var5 + var5 - 1 - this.ap;
                        this.aw = -this.aw;
                        if (--this.ae == 0) {
                           break label190;
                        }
                     }

                     do {
                        var9 = this.bp(var1, var9, var6, var3, var4.aw[this.at - 1]);
                        if (this.ap < var6) {
                           return;
                        }

                        this.ap = var6 + var6 - 1 - this.ap;
                        this.aw = -this.aw;
                        if (--this.ae == 0) {
                           break;
                        }

                        var9 = this.by(var1, var9, var5, var3, var4.aw[this.am]);
                        if (this.ap >= var5) {
                           return;
                        }

                        this.ap = var5 + var5 - 1 - this.ap;
                        this.aw = -this.aw;
                     } while(--this.ae != 0);
                  }
               } else {
                  int var10;
                  if (this.aw < 0) {
                     while(true) {
                        var9 = this.by(var1, var9, var5, var3, var4.aw[this.at - 1]);
                        if (this.ap >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.ap) / var8;
                        if (var10 >= this.ae) {
                           this.ap += var8 * this.ae;
                           this.ae = 0;
                           break;
                        }

                        this.ap += var8 * var10;
                        this.ae -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.bp(var1, var9, var6, var3, var4.aw[this.am]);
                        if (this.ap < var6) {
                           return;
                        }

                        var10 = (this.ap - var5) / var8;
                        if (var10 >= this.ae) {
                           this.ap -= var8 * this.ae;
                           this.ae = 0;
                           break;
                        }

                        this.ap -= var8 * var10;
                        this.ae -= var10;
                     }
                  }
               }
            }

            if (this.aw < 0) {
               this.by(var1, var9, 0, var3, 0);
               if (this.ap < 0) {
                  this.ap = -1;
                  this.ad();
                  this.kf();
               }
            } else {
               this.bp(var1, var9, var7, var3, 0);
               if (this.ap >= var7) {
                  this.ap = var7;
                  this.ad();
                  this.kf();
               }
            }

         }
      }
   }

   boolean br() {
      int var1 = this.ak;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = ap(var1, this.aj);
         var3 = aw(var1, this.aj);
      }

      if (this.ai == var1 && this.ay == var2 && this.as == var3) {
         if (this.ak == Integer.MIN_VALUE) {
            this.ak = 0;
            this.as = 0;
            this.ay = 0;
            this.ai = 0;
            this.kf();
            return true;
         } else {
            this.ai();
            return false;
         }
      } else {
         if (this.ai < var1) {
            this.ao = 1;
            this.an = var1 - this.ai;
         } else if (this.ai > var1) {
            this.ao = -1;
            this.an = this.ai - var1;
         } else {
            this.ao = 0;
         }

         if (this.ay < var2) {
            this.af = 1;
            if (this.an == 0 || this.an > var2 - this.ay) {
               this.an = var2 - this.ay;
            }
         } else if (this.ay > var2) {
            this.af = -1;
            if (this.an == 0 || this.an > this.ay - var2) {
               this.an = this.ay - var2;
            }
         } else {
            this.af = 0;
         }

         if (this.as < var3) {
            this.ar = 1;
            if (this.an == 0 || this.an > var3 - this.as) {
               this.an = var3 - this.as;
            }
         } else if (this.as > var3) {
            this.ar = -1;
            if (this.an == 0 || this.an > this.as - var3) {
               this.an = this.as - var3;
            }
         } else {
            this.ar = 0;
         }

         return false;
      }
   }

   static int bn(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, bf var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.ap = var2 << 8;
      return var3;
   }

   public synchronized void ck(int var1) {
      this.af(var1 << 6, this.ab());
   }

   int bp(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.an > 0) {
            int var6 = var2 + this.an;
            if (var6 > var4) {
               var6 = var4;
            }

            this.an += var2;
            if (this.aw == 256 && (this.ap & 255) == 0) {
               if (vi.ay) {
                  var2 = bf(0, ((bt)this.ag).aw, var1, this.ap, var2, this.ay, this.as, this.af, this.ar, 0, var6, var3, this);
               } else {
                  var2 = bi(((bt)this.ag).aw, var1, this.ap, var2, this.ai, this.ao, 0, var6, var3, this);
               }
            } else if (vi.ay) {
               var2 = cq(0, 0, ((bt)this.ag).aw, var1, this.ap, var2, this.ay, this.as, this.af, this.ar, 0, var6, var3, this, this.aw, var5);
            } else {
               var2 = be(0, 0, ((bt)this.ag).aw, var1, this.ap, var2, this.ai, this.ao, 0, var6, var3, this, this.aw, var5);
            }

            this.an -= var2;
            if (this.an != 0) {
               return var2;
            }

            if (!this.br()) {
               continue;
            }

            return var4;
         }

         if (this.aw == 256 && (this.ap & 255) == 0) {
            if (vi.ay) {
               return bu(0, ((bt)this.ag).aw, var1, this.ap, var2, this.ay, this.as, 0, var4, var3, this);
            }

            return bn(((bt)this.ag).aw, var1, this.ap, var2, this.ai, 0, var4, var3, this);
         }

         if (vi.ay) {
            return bd(0, 0, ((bt)this.ag).aw, var1, this.ap, var2, this.ay, this.as, 0, var4, var3, this, this.aw, var5);
         }

         return bo(0, 0, ((bt)this.ag).aw, var1, this.ap, var2, this.ai, 0, var4, var3, this, this.aw, var5);
      }
   }

   static int bm(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, bf var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.ap = var3 << 8;
      return var4 >> 1;
   }

   protected bg as() {
      return null;
   }

   static int bd(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bf var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.ap = var4;
      return var5 >> 1;
   }

   static int ba(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, bf var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.ap = var4;
      return var5;
   }

   synchronized void dr(int var1, int var2) {
      this.ak = var1;
      this.aj = var2;
      this.an = 0;
      this.ai();
   }

   static int bi(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, bf var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.ay += var9.af * (var6 - var3);
      var9.as += var9.ar * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      var9.ai = var4 >> 2;
      var9.ap = var2 << 8;
      return var3;
   }

   protected bg bh() {
      return null;
   }

   static int bg(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, bf var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.ay += var9.af * (var6 - var3);
      var9.as += var9.ar * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.ai = var4 >> 2;
      var9.ap = var2 << 8;
      return var3;
   }

   static int bl(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, bf var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.ai += var12.ao * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.ay = var5 >> 2;
      var12.as = var6 >> 2;
      var12.ap = var3 << 8;
      return var4 >> 1;
   }

   static int be(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bf var11, int var12, int var13) {
      var11.ay -= var11.af * var5;
      var11.as -= var11.ar * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.ay += var11.af * var5;
      var11.as += var11.ar * var5;
      var11.ai = var6;
      var11.ap = var4;
      return var5;
   }

   public synchronized void dy(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.af(var2, var3);
      } else {
         int var4 = ap(var2, var3);
         int var5 = aw(var2, var3);
         if (this.ay == var4 && this.as == var5) {
            this.an = 0;
         } else {
            int var6 = var2 - this.ai;
            if (this.ai - var2 > var6) {
               var6 = this.ai - var2;
            }

            if (var4 - this.ay > var6) {
               var6 = var4 - this.ay;
            }

            if (this.ay - var4 > var6) {
               var6 = this.ay - var4;
            }

            if (var5 - this.as > var6) {
               var6 = var5 - this.as;
            }

            if (this.as - var5 > var6) {
               var6 = this.as - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.an = var1;
            this.ak = var2;
            this.aj = var3;
            this.ao = (var2 - this.ai) / var1;
            this.af = (var4 - this.ay) / var1;
            this.ar = (var5 - this.as) / var1;
         }
      }
   }

   static int cb(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bf var11, int var12, int var13) {
      var11.ay -= var11.af * var5;
      var11.as -= var11.ar * var5;
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.ay += var11.af * var5;
      var11.as += var11.ar * var5;
      var11.ai = var6;
      var11.ap = var4;
      return var5;
   }

   static int cd(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, bf var13, int var14, int var15) {
      var13.ai -= var13.ao * var5;
      if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         byte var16 = var2[var1 - 1];
         var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.ai += var13.ao * var5;
      var13.ay = var6;
      var13.as = var7;
      var13.ap = var4;
      return var5;
   }

   protected bg aa() {
      return null;
   }

   protected bg ah() {
      return null;
   }

   public synchronized void eg(int var1) {
      if (var1 == 0) {
         this.ao(0);
         this.kf();
      } else if (this.ay == 0 && this.as == 0) {
         this.an = 0;
         this.ak = 0;
         this.ai = 0;
         this.kf();
      } else {
         int var2 = -this.ai;
         if (this.ai > var2) {
            var2 = this.ai;
         }

         if (-this.ay > var2) {
            var2 = -this.ay;
         }

         if (this.ay > var2) {
            var2 = this.ay;
         }

         if (-this.as > var2) {
            var2 = -this.as;
         }

         if (this.as > var2) {
            var2 = this.as;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.an = var1;
         this.ak = Integer.MIN_VALUE;
         this.ao = -this.ai / var1;
         this.af = -this.ay / var1;
         this.ar = -this.as / var1;
      }
   }

   protected bg bj() {
      return null;
   }

   static int ft(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, bf var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.ay += var9.af * (var6 - var3);
      var9.as += var9.ar * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.ai = var4 >> 2;
      var9.ap = var2 << 8;
      return var3;
   }

   static int gc(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, bf var13, int var14, int var15) {
      var13.ai -= var13.ao * var5;
      if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         byte var16 = var2[var1 - 1];
         var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.ai += var13.ao * var5;
      var13.ay = var6;
      var13.as = var7;
      var13.ap = var4;
      return var5;
   }

   static int bw(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bf var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.ap = var4;
      return var5 >> 1;
   }

   static int fs(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bf var11, int var12, int var13) {
      var11.ay -= var11.af * var5;
      var11.as -= var11.ar * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.ay += var11.af * var5;
      var11.as += var11.ar * var5;
      var11.ai = var6;
      var11.ap = var4;
      return var5;
   }

   public synchronized void bc(int var1) {
      if (this.an > 0) {
         if (var1 >= this.an) {
            if (this.ak == Integer.MIN_VALUE) {
               this.ak = 0;
               this.as = 0;
               this.ay = 0;
               this.ai = 0;
               this.kf();
               var1 = this.an;
            }

            this.an = 0;
            this.ai();
         } else {
            this.ai += this.ao * var1;
            this.ay += this.af * var1;
            this.as += this.ar * var1;
            this.an -= var1;
         }
      }

      bt var2 = (bt)this.ag;
      int var3 = this.am << 8;
      int var4 = this.at << 8;
      int var5 = var2.aw.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.ae = 0;
      }

      if (this.ap < 0) {
         if (this.aw <= 0) {
            this.ad();
            this.kf();
            return;
         }

         this.ap = 0;
      }

      if (this.ap >= var5) {
         if (this.aw >= 0) {
            this.ad();
            this.kf();
            return;
         }

         this.ap = var5 - 1;
      }

      this.ap += this.aw * var1;
      if (this.ae < 0) {
         if (!this.au) {
            if (this.aw < 0) {
               if (this.ap >= var3) {
                  return;
               }

               this.ap = var4 - 1 - (var4 - 1 - this.ap) % var6;
            } else {
               if (this.ap < var4) {
                  return;
               }

               this.ap = var3 + (this.ap - var3) % var6;
            }

         } else {
            if (this.aw < 0) {
               if (this.ap >= var3) {
                  return;
               }

               this.ap = var3 + var3 - 1 - this.ap;
               this.aw = -this.aw;
            }

            while(this.ap >= var4) {
               this.ap = var4 + var4 - 1 - this.ap;
               this.aw = -this.aw;
               if (this.ap >= var3) {
                  return;
               }

               this.ap = var3 + var3 - 1 - this.ap;
               this.aw = -this.aw;
            }

         }
      } else {
         if (this.ae > 0) {
            if (this.au) {
               label167: {
                  if (this.aw < 0) {
                     if (this.ap >= var3) {
                        return;
                     }

                     this.ap = var3 + var3 - 1 - this.ap;
                     this.aw = -this.aw;
                     if (--this.ae == 0) {
                        break label167;
                     }
                  }

                  do {
                     if (this.ap < var4) {
                        return;
                     }

                     this.ap = var4 + var4 - 1 - this.ap;
                     this.aw = -this.aw;
                     if (--this.ae == 0) {
                        break;
                     }

                     if (this.ap >= var3) {
                        return;
                     }

                     this.ap = var3 + var3 - 1 - this.ap;
                     this.aw = -this.aw;
                  } while(--this.ae != 0);
               }
            } else {
               label199: {
                  int var7;
                  if (this.aw < 0) {
                     if (this.ap >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.ap) / var6;
                     if (var7 >= this.ae) {
                        this.ap += var6 * this.ae;
                        this.ae = 0;
                        break label199;
                     }

                     this.ap += var6 * var7;
                     this.ae -= var7;
                  } else {
                     if (this.ap < var4) {
                        return;
                     }

                     var7 = (this.ap - var3) / var6;
                     if (var7 >= this.ae) {
                        this.ap -= var6 * this.ae;
                        this.ae = 0;
                        break label199;
                     }

                     this.ap -= var6 * var7;
                     this.ae -= var7;
                  }

                  return;
               }
            }
         }

         if (this.aw < 0) {
            if (this.ap < 0) {
               this.ap = -1;
               this.ad();
               this.kf();
            }
         } else if (this.ap >= var5) {
            this.ap = var5;
            this.ad();
            this.kf();
         }

      }
   }

   static int ci(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
   }

   static int cn(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
   }

   static int fu(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, bf var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
         var7 = var8;
      }

      byte var13;
      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10.ap = var4;
      return var5;
   }

   static int cf(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
   }

   public static bf cj(bt var0, int var1, int var2, int var3) {
      return var0.aw != null && var0.aw.length != 0 ? new bf(var0, var1, var2, var3) : null;
   }

   static int cp(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
   }

   static int cv(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
   }

   static int cy(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
   }

   int cu() {
      int var1 = this.ai * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.ae == 0) {
         var1 -= var1 * this.ap / (((bt)this.ag).aw.length << 8);
      } else if (this.ae >= 0) {
         var1 -= var1 * this.am / ((bt)this.ag).aw.length;
      }

      return var1 > 255 ? 255 : var1;
   }

   int ce() {
      int var1 = this.ai * 3 >> 6;
      var1 = (var1 ^ var1 >> -1821887610) + (var1 >>> 250029771);
      if (this.ae == 0) {
         var1 -= var1 * this.ap / (((bt)this.ag).aw.length << 8);
      } else if (this.ae >= 0) {
         var1 -= var1 * this.am / ((bt)this.ag).aw.length;
      }

      return var1 > -1781170159 ? -921540418 : var1;
   }

   int cg() {
      int var1 = this.ai * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.ae == 0) {
         var1 -= var1 * this.ap / (((bt)this.ag).aw.length << 8);
      } else if (this.ae >= 0) {
         var1 -= var1 * this.am / ((bt)this.ag).aw.length;
      }

      return var1 > -1493312542 ? 900518593 : var1;
   }

   public static bf cx(bt var0, int var1, int var2) {
      return var0.aw != null && var0.aw.length != 0 ? new bf(var0, (int)((long)var0.ap * 256L * (long)var1 / (long)(du.ai * 664191268)), var2 << 6) : null;
   }

   public static bf cz(bt var0, int var1, int var2) {
      return var0.aw != null && var0.aw.length != 0 ? new bf(var0, (int)((long)var0.ap * 256L * (long)var1 / (long)(du.ai * 664191268)), var2 << 6) : null;
   }

   public static bf ch(bt var0, int var1, int var2) {
      return var0.aw != null && var0.aw.length != 0 ? new bf(var0, (int)((long)var0.ap * 256L * (long)var1 / (long)(du.ai * 664191268)), var2 << 6) : null;
   }

   public synchronized void bz(int var1) {
      if (this.an > 0) {
         if (var1 >= this.an) {
            if (this.ak == Integer.MIN_VALUE) {
               this.ak = 0;
               this.as = 0;
               this.ay = 0;
               this.ai = 0;
               this.kf();
               var1 = this.an;
            }

            this.an = 0;
            this.ai();
         } else {
            this.ai += this.ao * var1;
            this.ay += this.af * var1;
            this.as += this.ar * var1;
            this.an -= var1;
         }
      }

      bt var2 = (bt)this.ag;
      int var3 = this.am << 8;
      int var4 = this.at << 8;
      int var5 = var2.aw.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.ae = 0;
      }

      if (this.ap < 0) {
         if (this.aw <= 0) {
            this.ad();
            this.kf();
            return;
         }

         this.ap = 0;
      }

      if (this.ap >= var5) {
         if (this.aw >= 0) {
            this.ad();
            this.kf();
            return;
         }

         this.ap = var5 - 1;
      }

      this.ap += this.aw * var1;
      if (this.ae < 0) {
         if (!this.au) {
            if (this.aw < 0) {
               if (this.ap >= var3) {
                  return;
               }

               this.ap = var4 - 1 - (var4 - 1 - this.ap) % var6;
            } else {
               if (this.ap < var4) {
                  return;
               }

               this.ap = var3 + (this.ap - var3) % var6;
            }

         } else {
            if (this.aw < 0) {
               if (this.ap >= var3) {
                  return;
               }

               this.ap = var3 + var3 - 1 - this.ap;
               this.aw = -this.aw;
            }

            while(this.ap >= var4) {
               this.ap = var4 + var4 - 1 - this.ap;
               this.aw = -this.aw;
               if (this.ap >= var3) {
                  return;
               }

               this.ap = var3 + var3 - 1 - this.ap;
               this.aw = -this.aw;
            }

         }
      } else {
         if (this.ae > 0) {
            if (this.au) {
               label169: {
                  if (this.aw < 0) {
                     if (this.ap >= var3) {
                        return;
                     }

                     this.ap = var3 + var3 - 1 - this.ap;
                     this.aw = -this.aw;
                     if (--this.ae == 0) {
                        break label169;
                     }
                  }

                  do {
                     if (this.ap < var4) {
                        return;
                     }

                     this.ap = var4 + var4 - 1 - this.ap;
                     this.aw = -this.aw;
                     if (--this.ae == 0) {
                        break;
                     }

                     if (this.ap >= var3) {
                        return;
                     }

                     this.ap = var3 + var3 - 1 - this.ap;
                     this.aw = -this.aw;
                  } while(--this.ae != 0);
               }
            } else {
               int var7;
               if (this.aw < 0) {
                  if (this.ap >= var3) {
                     return;
                  }

                  var7 = (var4 - 1 - this.ap) / var6;
                  if (var7 < this.ae) {
                     this.ap += var6 * var7;
                     this.ae -= var7;
                     return;
                  }

                  this.ap += var6 * this.ae;
                  this.ae = 0;
               } else {
                  if (this.ap < var4) {
                     return;
                  }

                  var7 = (this.ap - var3) / var6;
                  if (var7 < this.ae) {
                     this.ap -= var6 * var7;
                     this.ae -= var7;
                     return;
                  }

                  this.ap -= var6 * this.ae;
                  this.ae = 0;
               }
            }
         }

         if (this.aw < 0) {
            if (this.ap < 0) {
               this.ap = -1;
               this.ad();
               this.kf();
            }
         } else if (this.ap >= var5) {
            this.ap = var5;
            this.ad();
            this.kf();
         }

      }
   }

   public static bf cc(bt var0, int var1, int var2, int var3) {
      return var0.aw != null && var0.aw.length != 0 ? new bf(var0, var1, var2, var3) : null;
   }

   void dj() {
      if (this.an != 0) {
         if (this.ak == Integer.MIN_VALUE) {
            this.ak = 0;
         }

         this.an = 0;
         this.ai();
      }

   }

   static int bo(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, bf var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
         var7 = var8;
      }

      byte var13;
      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10.ap = var4;
      return var5;
   }

   void cw() {
      this.ai = this.ak;
      this.ay = ap(this.ak, this.aj);
      this.as = aw(this.ak, this.aj);
   }

   public synchronized void au(int var1) {
      if (this.an > 0) {
         if (var1 >= this.an) {
            if (this.ak == Integer.MIN_VALUE) {
               this.ak = 0;
               this.as = 0;
               this.ay = 0;
               this.ai = 0;
               this.kf();
               var1 = this.an;
            }

            this.an = 0;
            this.ai();
         } else {
            this.ai += this.ao * var1;
            this.ay += this.af * var1;
            this.as += this.ar * var1;
            this.an -= var1;
         }
      }

      bt var2 = (bt)this.ag;
      int var3 = this.am << 8;
      int var4 = this.at << 8;
      int var5 = var2.aw.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.ae = 0;
      }

      if (this.ap < 0) {
         if (this.aw <= 0) {
            this.ad();
            this.kf();
            return;
         }

         this.ap = 0;
      }

      if (this.ap >= var5) {
         if (this.aw >= 0) {
            this.ad();
            this.kf();
            return;
         }

         this.ap = var5 - 1;
      }

      this.ap += this.aw * var1;
      if (this.ae < 0) {
         if (!this.au) {
            if (this.aw < 0) {
               if (this.ap >= var3) {
                  return;
               }

               this.ap = var4 - 1 - (var4 - 1 - this.ap) % var6;
            } else {
               if (this.ap < var4) {
                  return;
               }

               this.ap = var3 + (this.ap - var3) % var6;
            }

         } else {
            if (this.aw < 0) {
               if (this.ap >= var3) {
                  return;
               }

               this.ap = var3 + var3 - 1 - this.ap;
               this.aw = -this.aw;
            }

            while(this.ap >= var4) {
               this.ap = var4 + var4 - 1 - this.ap;
               this.aw = -this.aw;
               if (this.ap >= var3) {
                  return;
               }

               this.ap = var3 + var3 - 1 - this.ap;
               this.aw = -this.aw;
            }

         }
      } else {
         if (this.ae > 0) {
            if (this.au) {
               label167: {
                  if (this.aw < 0) {
                     if (this.ap >= var3) {
                        return;
                     }

                     this.ap = var3 + var3 - 1 - this.ap;
                     this.aw = -this.aw;
                     if (--this.ae == 0) {
                        break label167;
                     }
                  }

                  do {
                     if (this.ap < var4) {
                        return;
                     }

                     this.ap = var4 + var4 - 1 - this.ap;
                     this.aw = -this.aw;
                     if (--this.ae == 0) {
                        break;
                     }

                     if (this.ap >= var3) {
                        return;
                     }

                     this.ap = var3 + var3 - 1 - this.ap;
                     this.aw = -this.aw;
                  } while(--this.ae != 0);
               }
            } else {
               label199: {
                  int var7;
                  if (this.aw < 0) {
                     if (this.ap >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.ap) / var6;
                     if (var7 >= this.ae) {
                        this.ap += var6 * this.ae;
                        this.ae = 0;
                        break label199;
                     }

                     this.ap += var6 * var7;
                     this.ae -= var7;
                  } else {
                     if (this.ap < var4) {
                        return;
                     }

                     var7 = (this.ap - var3) / var6;
                     if (var7 >= this.ae) {
                        this.ap -= var6 * this.ae;
                        this.ae = 0;
                        break label199;
                     }

                     this.ap -= var6 * var7;
                     this.ae -= var7;
                  }

                  return;
               }
            }
         }

         if (this.aw < 0) {
            if (this.ap < 0) {
               this.ap = -1;
               this.ad();
               this.kf();
            }
         } else if (this.ap >= var5) {
            this.ap = var5;
            this.ad();
            this.kf();
         }

      }
   }

   public synchronized void cs(int var1) {
      this.af(var1 << 6, this.ab());
   }

   public synchronized void cr(int var1) {
      this.af(var1 << 6, this.ab());
   }

   public synchronized void ds(boolean var1) {
      this.aw = (this.aw ^ this.aw >> 31) + (this.aw >>> 31);
      if (var1) {
         this.aw = -this.aw;
      }

   }

   static int cl(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
   }

   synchronized void dd(int var1) {
      this.af(var1, this.ab());
   }

   synchronized void dc(int var1) {
      this.af(var1, this.ab());
   }

   synchronized void da(int var1, int var2) {
      this.ak = var1;
      this.aj = var2;
      this.an = 0;
      this.ai();
   }

   static int gp(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, bf var13, int var14, int var15) {
      var13.ai -= var13.ao * var5;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & -568895876);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.ai += var13.ao * var5;
      var13.ay = var6;
      var13.as = var7;
      var13.ap = var4;
      return var5;
   }

   public synchronized void de(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.af(var2, var3);
      } else {
         int var4 = ap(var2, var3);
         int var5 = aw(var2, var3);
         if (this.ay == var4 && this.as == var5) {
            this.an = 0;
         } else {
            int var6 = var2 - this.ai;
            if (this.ai - var2 > var6) {
               var6 = this.ai - var2;
            }

            if (var4 - this.ay > var6) {
               var6 = var4 - this.ay;
            }

            if (this.ay - var4 > var6) {
               var6 = this.ay - var4;
            }

            if (var5 - this.as > var6) {
               var6 = var5 - this.as;
            }

            if (this.as - var5 > var6) {
               var6 = this.as - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.an = var1;
            this.ak = var2;
            this.aj = var3;
            this.ao = (var2 - this.ai) / var1;
            this.af = (var4 - this.ay) / var1;
            this.ar = (var5 - this.as) / var1;
         }
      }
   }

   public synchronized int dg() {
      return this.ak == Integer.MIN_VALUE ? 0 : this.ak;
   }

   public synchronized int df() {
      return this.aj < 0 ? -1 : this.aj;
   }

   static int fo(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bf var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1644743686) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.ap = var4;
      return var5 >> 1;
   }

   public synchronized int dk() {
      return this.aj < 0 ? -1 : this.aj;
   }

   public synchronized int dl() {
      return this.aj < 0 ? -1 : this.aj;
   }

   public synchronized void dm(int var1) {
      int var2 = ((bt)this.ag).aw.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.ap = var1;
   }

   static int fl(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bf var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & -1068115374);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.ap = var4;
      return var5 >> 1;
   }

   public synchronized void ca(int var1) {
      this.af(var1 << 6, this.ab());
   }

   public synchronized void dt(int var1) {
      int var2 = ((bt)this.ag).aw.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.ap = var1;
   }

   void db() {
      if (this.an != 0) {
         if (this.ak == Integer.MIN_VALUE) {
            this.ak = 0;
         }

         this.an = 0;
         this.ai();
      }

   }

   void dv() {
      if (this.an != 0) {
         if (this.ak == 102632020) {
            this.ak = 0;
         }

         this.an = 0;
         this.ai();
      }

   }

   static int et(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, bf var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
         var7 = var8;
      }

      byte var13;
      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10.ap = var4;
      return var5;
   }

   public synchronized void dp(int var1, int var2) {
      this.av(var1, var2, this.ab());
   }

   public static bf ak(bt var0, int var1, int var2) {
      return var0.aw != null && var0.aw.length != 0 ? new bf(var0, (int)((long)var0.ap * 256L * (long)var1 / (long)(du.ai * 664191268)), var2 << 6) : null;
   }

   public synchronized void do(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.af(var2, var3);
      } else {
         int var4 = ap(var2, var3);
         int var5 = aw(var2, var3);
         if (this.ay == var4 && this.as == var5) {
            this.an = 0;
         } else {
            int var6 = var2 - this.ai;
            if (this.ai - var2 > var6) {
               var6 = this.ai - var2;
            }

            if (var4 - this.ay > var6) {
               var6 = var4 - this.ay;
            }

            if (this.ay - var4 > var6) {
               var6 = this.ay - var4;
            }

            if (var5 - this.as > var6) {
               var6 = var5 - this.as;
            }

            if (this.as - var5 > var6) {
               var6 = this.as - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.an = var1;
            this.ak = var2;
            this.aj = var3;
            this.ao = (var2 - this.ai) / var1;
            this.af = (var4 - this.ay) / var1;
            this.ar = (var5 - this.as) / var1;
         }
      }
   }

   public synchronized void dw(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.af(var2, var3);
      } else {
         int var4 = ap(var2, var3);
         int var5 = aw(var2, var3);
         if (this.ay == var4 && this.as == var5) {
            this.an = 0;
         } else {
            int var6 = var2 - this.ai;
            if (this.ai - var2 > var6) {
               var6 = this.ai - var2;
            }

            if (var4 - this.ay > var6) {
               var6 = var4 - this.ay;
            }

            if (this.ay - var4 > var6) {
               var6 = this.ay - var4;
            }

            if (var5 - this.as > var6) {
               var6 = var5 - this.as;
            }

            if (this.as - var5 > var6) {
               var6 = this.as - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.an = var1;
            this.ak = var2;
            this.aj = var3;
            this.ao = (var2 - this.ai) / var1;
            this.af = (var4 - this.ay) / var1;
            this.ar = (var5 - this.as) / var1;
         }
      }
   }

   static int co(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
   }

   public synchronized void dz(int var1) {
      if (var1 == 0) {
         this.ao(0);
         this.kf();
      } else if (this.ay == 0 && this.as == 0) {
         this.an = 0;
         this.ak = 0;
         this.ai = 0;
         this.kf();
      } else {
         int var2 = -this.ai;
         if (this.ai > var2) {
            var2 = this.ai;
         }

         if (-this.ay > var2) {
            var2 = -this.ay;
         }

         if (this.ay > var2) {
            var2 = this.ay;
         }

         if (-this.as > var2) {
            var2 = -this.as;
         }

         if (this.as > var2) {
            var2 = this.as;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.an = var1;
         this.ak = -1521523180;
         this.ao = -this.ai / var1;
         this.af = -this.ay / var1;
         this.ar = -this.as / var1;
      }
   }

   static int bf(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, bf var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.ai += var12.ao * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.ay = var5 >> 2;
      var12.as = var6 >> 2;
      var12.ap = var3 << 8;
      return var4 >> 1;
   }

   public synchronized int al() {
      return this.aw < 0 ? -this.aw : this.aw;
   }

   void cm() {
      this.ai = this.ak;
      this.ay = ap(this.ak, this.aj);
      this.as = aw(this.ak, this.aj);
   }

   public synchronized void ev(int var1) {
      if (var1 == 0) {
         this.ao(0);
         this.kf();
      } else if (this.ay == 0 && this.as == 0) {
         this.an = 0;
         this.ak = 0;
         this.ai = 0;
         this.kf();
      } else {
         int var2 = -this.ai;
         if (this.ai > var2) {
            var2 = this.ai;
         }

         if (-this.ay > var2) {
            var2 = -this.ay;
         }

         if (this.ay > var2) {
            var2 = this.ay;
         }

         if (-this.as > var2) {
            var2 = -this.as;
         }

         if (this.as > var2) {
            var2 = this.as;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.an = var1;
         this.ak = 1711446900;
         this.ao = -this.ai / var1;
         this.af = -this.ay / var1;
         this.ar = -this.as / var1;
      }
   }

   protected int bv() {
      return this.ak == 0 && this.an == 0 ? 0 : 1;
   }

   static int fa(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bf var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.ap = var4;
      return var5 >> 1;
   }

   public synchronized int ey() {
      return this.aw < 0 ? -this.aw : this.aw;
   }

   public synchronized int ec() {
      return this.aw < 0 ? -this.aw : this.aw;
   }

   static int ee(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, bf var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 2004249054) / var11) > var8) {
         var7 = var8;
      }

      byte var13;
      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & -143156067)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10.ap = var4;
      return var5;
   }

   public boolean er() {
      return this.ap < 0 || this.ap >= ((bt)this.ag).aw.length << 8;
   }

   static int fz(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bf var11, int var12, int var13) {
      var11.ay -= var11.af * var5;
      var11.as -= var11.ar * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 19669925) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & -47771769)) * var6 >> 6;
         var6 += var7;
      }

      var11.ay += var11.af * var5;
      var11.as += var11.ar * var5;
      var11.ai = var6;
      var11.ap = var4;
      return var5;
   }

   public boolean ef() {
      return this.an != 0;
   }

   int em(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.an > 0) {
            int var6 = var2 + this.an;
            if (var6 > var4) {
               var6 = var4;
            }

            this.an += var2;
            if (this.aw == 382977456 && (this.ap & 255) == 0) {
               if (vi.ay) {
                  var2 = bl(0, ((bt)this.ag).aw, var1, this.ap, var2, this.ay, this.as, this.af, this.ar, 0, var6, var3, this);
               } else {
                  var2 = bg(((bt)this.ag).aw, var1, this.ap, var2, this.ai, this.ao, 0, var6, var3, this);
               }
            } else if (vi.ay) {
               var2 = cd(0, 0, ((bt)this.ag).aw, var1, this.ap, var2, this.ay, this.as, this.af, this.ar, 0, var6, var3, this, this.aw, var5);
            } else {
               var2 = cb(0, 0, ((bt)this.ag).aw, var1, this.ap, var2, this.ai, this.ao, 0, var6, var3, this, this.aw, var5);
            }

            this.an -= var2;
            if (this.an != 0) {
               return var2;
            }

            if (!this.br()) {
               continue;
            }

            return var4;
         }

         if (this.aw == 1524046315 && (this.ap & -478138491) == 0) {
            if (vi.ay) {
               return bm(0, ((bt)this.ag).aw, var1, this.ap, var2, this.ay, this.as, 0, var4, var3, this);
            }

            return bs(((bt)this.ag).aw, var1, this.ap, var2, this.ai, 0, var4, var3, this);
         }

         if (vi.ay) {
            return bw(0, 0, ((bt)this.ag).aw, var1, this.ap, var2, this.ay, this.as, 0, var4, var3, this, this.aw, var5);
         }

         return ba(0, 0, ((bt)this.ag).aw, var1, this.ap, var2, this.ai, 0, var4, var3, this, this.aw, var5);
      }
   }

   int el(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.an > 0) {
            int var6 = var2 + this.an;
            if (var6 > var4) {
               var6 = var4;
            }

            this.an += var2;
            if (this.aw == -256 && (this.ap & 255) == 0) {
               if (vi.ay) {
                  var2 = bl(0, ((bt)this.ag).aw, var1, this.ap, var2, this.ay, this.as, this.af, this.ar, 0, var6, var3, this);
               } else {
                  var2 = bg(((bt)this.ag).aw, var1, this.ap, var2, this.ai, this.ao, 0, var6, var3, this);
               }
            } else if (vi.ay) {
               var2 = cd(0, 0, ((bt)this.ag).aw, var1, this.ap, var2, this.ay, this.as, this.af, this.ar, 0, var6, var3, this, this.aw, var5);
            } else {
               var2 = cb(0, 0, ((bt)this.ag).aw, var1, this.ap, var2, this.ai, this.ao, 0, var6, var3, this, this.aw, var5);
            }

            this.an -= var2;
            if (this.an != 0) {
               return var2;
            }

            if (!this.br()) {
               continue;
            }

            return var4;
         }

         if (this.aw == -256 && (this.ap & 255) == 0) {
            if (vi.ay) {
               return bm(0, ((bt)this.ag).aw, var1, this.ap, var2, this.ay, this.as, 0, var4, var3, this);
            }

            return bs(((bt)this.ag).aw, var1, this.ap, var2, this.ai, 0, var4, var3, this);
         }

         if (vi.ay) {
            return bw(0, 0, ((bt)this.ag).aw, var1, this.ap, var2, this.ay, this.as, 0, var4, var3, this, this.aw, var5);
         }

         return ba(0, 0, ((bt)this.ag).aw, var1, this.ap, var2, this.ai, 0, var4, var3, this, this.aw, var5);
      }
   }

   int ed(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.an > 0) {
            int var6 = var2 + this.an;
            if (var6 > var4) {
               var6 = var4;
            }

            this.an += var2;
            if (this.aw == -256 && (this.ap & 255) == 0) {
               if (vi.ay) {
                  var2 = bl(0, ((bt)this.ag).aw, var1, this.ap, var2, this.ay, this.as, this.af, this.ar, 0, var6, var3, this);
               } else {
                  var2 = bg(((bt)this.ag).aw, var1, this.ap, var2, this.ai, this.ao, 0, var6, var3, this);
               }
            } else if (vi.ay) {
               var2 = cd(0, 0, ((bt)this.ag).aw, var1, this.ap, var2, this.ay, this.as, this.af, this.ar, 0, var6, var3, this, this.aw, var5);
            } else {
               var2 = cb(0, 0, ((bt)this.ag).aw, var1, this.ap, var2, this.ai, this.ao, 0, var6, var3, this, this.aw, var5);
            }

            this.an -= var2;
            if (this.an != 0) {
               return var2;
            }

            if (!this.br()) {
               continue;
            }

            return var4;
         }

         if (this.aw == -256 && (this.ap & 255) == 0) {
            if (vi.ay) {
               return bm(0, ((bt)this.ag).aw, var1, this.ap, var2, this.ay, this.as, 0, var4, var3, this);
            }

            return bs(((bt)this.ag).aw, var1, this.ap, var2, this.ai, 0, var4, var3, this);
         }

         if (vi.ay) {
            return bw(0, 0, ((bt)this.ag).aw, var1, this.ap, var2, this.ay, this.as, 0, var4, var3, this, this.aw, var5);
         }

         return ba(0, 0, ((bt)this.ag).aw, var1, this.ap, var2, this.ai, 0, var4, var3, this, this.aw, var5);
      }
   }

   boolean ep() {
      int var1 = this.ak;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = ap(var1, this.aj);
         var3 = aw(var1, this.aj);
      }

      if (this.ai == var1 && this.ay == var2 && this.as == var3) {
         if (this.ak == Integer.MIN_VALUE) {
            this.ak = 0;
            this.as = 0;
            this.ay = 0;
            this.ai = 0;
            this.kf();
            return true;
         } else {
            this.ai();
            return false;
         }
      } else {
         if (this.ai < var1) {
            this.ao = 1;
            this.an = var1 - this.ai;
         } else if (this.ai > var1) {
            this.ao = -1;
            this.an = this.ai - var1;
         } else {
            this.ao = 0;
         }

         if (this.ay < var2) {
            this.af = 1;
            if (this.an == 0 || this.an > var2 - this.ay) {
               this.an = var2 - this.ay;
            }
         } else if (this.ay > var2) {
            this.af = -1;
            if (this.an == 0 || this.an > this.ay - var2) {
               this.an = this.ay - var2;
            }
         } else {
            this.af = 0;
         }

         if (this.as < var3) {
            this.ar = 1;
            if (this.an == 0 || this.an > var3 - this.as) {
               this.an = var3 - this.as;
            }
         } else if (this.as > var3) {
            this.ar = -1;
            if (this.an == 0 || this.an > this.as - var3) {
               this.an = this.as - var3;
            }
         } else {
            this.ar = 0;
         }

         return false;
      }
   }

   static int fr(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, bf var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.ai += var12.ao * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.ay = var5 >> 2;
      var12.as = var6 >> 2;
      var12.ap = var3 << 8;
      return var4 >> 1;
   }

   static int ej(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, bf var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.ap = var2 << 8;
      return var3;
   }

   static int ei(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, bf var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.ap = var2 << 8;
      return var3;
   }

   static int ew(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, bf var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.ap = var3 << 8;
      return var4 >> 1;
   }

   static int es(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, bf var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
      }

      var8.ap = var2 << 8;
      return var3;
   }

   public synchronized void dn(int var1) {
      if (var1 == 0) {
         this.ao(0);
         this.kf();
      } else if (this.ay == 0 && this.as == 0) {
         this.an = 0;
         this.ak = 0;
         this.ai = 0;
         this.kf();
      } else {
         int var2 = -this.ai;
         if (this.ai > var2) {
            var2 = this.ai;
         }

         if (-this.ay > var2) {
            var2 = -this.ay;
         }

         if (this.ay > var2) {
            var2 = this.ay;
         }

         if (-this.as > var2) {
            var2 = -this.as;
         }

         if (this.as > var2) {
            var2 = this.as;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.an = var1;
         this.ak = Integer.MIN_VALUE;
         this.ao = -this.ai / var1;
         this.af = -this.ay / var1;
         this.ar = -this.as / var1;
      }
   }

   static int eb(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, bf var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
      }

      var8.ap = var2 << 8;
      return var3;
   }

   public synchronized void aq(int var1) {
      if (this.aw < 0) {
         this.aw = -var1;
      } else {
         this.aw = var1;
      }

   }

   static int eo(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, bf var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.ap = var3 << 8;
      return var4 >> 1;
   }

   static int ea(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, bf var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
         var7 = var8;
      }

      byte var13;
      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10.ap = var4;
      return var5;
   }

   public synchronized void eh(int var1) {
      if (this.aw < 0) {
         this.aw = -var1;
      } else {
         this.aw = var1;
      }

   }

   static int ap(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
   }

   static int gn(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bf var11, int var12, int var13) {
      var11.ay -= var11.af * var5;
      var11.as -= var11.ar * var5;
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.ay += var11.af * var5;
      var11.as += var11.ar * var5;
      var11.ai = var6;
      var11.ap = var4;
      return var5;
   }

   public synchronized int ar() {
      return this.ak == Integer.MIN_VALUE ? 0 : this.ak;
   }

   static int cq(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, bf var13, int var14, int var15) {
      var13.ai -= var13.ao * var5;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.ai += var13.ao * var5;
      var13.ay = var6;
      var13.as = var7;
      var13.ap = var4;
      return var5;
   }

   int by(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.an > 0) {
            int var6 = var2 + this.an;
            if (var6 > var4) {
               var6 = var4;
            }

            this.an += var2;
            if (this.aw == -256 && (this.ap & 255) == 0) {
               if (vi.ay) {
                  var2 = bl(0, ((bt)this.ag).aw, var1, this.ap, var2, this.ay, this.as, this.af, this.ar, 0, var6, var3, this);
               } else {
                  var2 = bg(((bt)this.ag).aw, var1, this.ap, var2, this.ai, this.ao, 0, var6, var3, this);
               }
            } else if (vi.ay) {
               var2 = cd(0, 0, ((bt)this.ag).aw, var1, this.ap, var2, this.ay, this.as, this.af, this.ar, 0, var6, var3, this, this.aw, var5);
            } else {
               var2 = cb(0, 0, ((bt)this.ag).aw, var1, this.ap, var2, this.ai, this.ao, 0, var6, var3, this, this.aw, var5);
            }

            this.an -= var2;
            if (this.an != 0) {
               return var2;
            }

            if (!this.br()) {
               continue;
            }

            return var4;
         }

         if (this.aw == -256 && (this.ap & 255) == 0) {
            if (vi.ay) {
               return bm(0, ((bt)this.ag).aw, var1, this.ap, var2, this.ay, this.as, 0, var4, var3, this);
            }

            return bs(((bt)this.ag).aw, var1, this.ap, var2, this.ai, 0, var4, var3, this);
         }

         if (vi.ay) {
            return bw(0, 0, ((bt)this.ag).aw, var1, this.ap, var2, this.ay, this.as, 0, var4, var3, this, this.aw, var5);
         }

         return ba(0, 0, ((bt)this.ag).aw, var1, this.ap, var2, this.ai, 0, var4, var3, this, this.aw, var5);
      }
   }

   static int fw(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, bf var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.ap = var4;
      return var5;
   }

   static int fp(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, bf var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.ap = var4;
      return var5;
   }

   static int fh(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, bf var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.ap = var4;
      return var5;
   }

   static int fv(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bf var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & -1591407839);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.ap = var4;
      return var5 >> 1;
   }

   static int ex(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, bf var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.ap = var2 << 8;
      return var3;
   }

   static int fn(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bf var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 + 1175436547 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.ap = var4;
      return var5 >> 1;
   }

   static int fd(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bf var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.ap = var4;
      return var5 >> 1;
   }

   static int fm(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bf var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.ap = var4;
      return var5 >> 1;
   }

   public synchronized int du() {
      return this.aj < 0 ? -1 : this.aj;
   }

   public synchronized void ax(int var1) {
      if (var1 == 0) {
         this.ao(0);
         this.kf();
      } else if (this.ay == 0 && this.as == 0) {
         this.an = 0;
         this.ak = 0;
         this.ai = 0;
         this.kf();
      } else {
         int var2 = -this.ai;
         if (this.ai > var2) {
            var2 = this.ai;
         }

         if (-this.ay > var2) {
            var2 = -this.ay;
         }

         if (this.ay > var2) {
            var2 = this.ay;
         }

         if (-this.as > var2) {
            var2 = -this.as;
         }

         if (this.as > var2) {
            var2 = this.as;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.an = var1;
         this.ak = Integer.MIN_VALUE;
         this.ao = -this.ai / var1;
         this.af = -this.ay / var1;
         this.ar = -this.as / var1;
      }
   }

   static int fb(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, bf var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.ai += var12.ao * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.ay = var5 >> 2;
      var12.as = var6 >> 2;
      var12.ap = var3 << 8;
      return var4 >> 1;
   }

   static int bs(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, bf var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
      }

      var8.ap = var2 << 8;
      return var3;
   }

   static int fe(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, bf var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.ai += var12.ao * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.ay = var5 >> 2;
      var12.as = var6 >> 2;
      var12.ap = var3 << 8;
      return var4 >> 1;
   }

   static int gb(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, bf var13, int var14, int var15) {
      var13.ai -= var13.ao * var5;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - -1769016465) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 1160725610);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.ai += var13.ao * var5;
      var13.ay = var6;
      var13.as = var7;
      var13.ap = var4;
      return var5;
   }

   static int ff(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, bf var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.ay += var9.af * (var6 - var3);
      var9.as += var9.ar * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.ai = var4 >> 2;
      var9.ap = var2 << 8;
      return var3;
   }

   static int fx(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, bf var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.ay += var9.af * (var6 - var3);
      var9.as += var9.ar * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.ai = var4 >> 2;
      var9.ap = var2 << 8;
      return var3;
   }

   static int eq(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, bf var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.ap = var3 << 8;
      return var4 >> 1;
   }

   static int fk(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bf var11, int var12, int var13) {
      var11.ay -= var11.af * var5;
      var11.as -= var11.ar * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.ay += var11.af * var5;
      var11.as += var11.ar * var5;
      var11.ai = var6;
      var11.ap = var4;
      return var5;
   }

   public synchronized void ag(boolean var1) {
      this.aw = (this.aw ^ this.aw >> 31) + (this.aw >>> 31);
      if (var1) {
         this.aw = -this.aw;
      }

   }

   static int gy(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bf var11, int var12, int var13) {
      var11.ay -= var11.af * var5;
      var11.as -= var11.ar * var5;
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.ay += var11.af * var5;
      var11.as += var11.ar * var5;
      var11.ai = var6;
      var11.ap = var4;
      return var5;
   }

   static int fy(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bf var11, int var12, int var13) {
      var11.ay -= var11.af * var5;
      var11.as -= var11.ar * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.ay += var11.af * var5;
      var11.as += var11.ar * var5;
      var11.ai = var6;
      var11.ap = var4;
      return var5;
   }

   static int fi(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, bf var13, int var14, int var15) {
      var13.ai -= var13.ao * var5;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & -160224069);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 2007970566);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.ai += var13.ao * var5;
      var13.ay = var6;
      var13.as = var7;
      var13.ap = var4;
      return var5;
   }

   public synchronized void di(int var1) {
      if (var1 == 0) {
         this.ao(0);
         this.kf();
      } else if (this.ay == 0 && this.as == 0) {
         this.an = 0;
         this.ak = 0;
         this.ai = 0;
         this.kf();
      } else {
         int var2 = -this.ai;
         if (this.ai > var2) {
            var2 = this.ai;
         }

         if (-this.ay > var2) {
            var2 = -this.ay;
         }

         if (this.ay > var2) {
            var2 = this.ay;
         }

         if (-this.as > var2) {
            var2 = -this.as;
         }

         if (this.as > var2) {
            var2 = this.as;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.an = var1;
         this.ak = Integer.MIN_VALUE;
         this.ao = -this.ai / var1;
         this.af = -this.ay / var1;
         this.ar = -this.as / var1;
      }
   }

   static int gl(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, bf var13, int var14, int var15) {
      var13.ai -= var13.ao * var5;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.ai += var13.ao * var5;
      var13.ay = var6;
      var13.as = var7;
      var13.ap = var4;
      return var5;
   }

   public boolean en() {
      return this.an != 0;
   }

   synchronized void dh(int var1, int var2) {
      this.ak = var1;
      this.aj = var2;
      this.an = 0;
      this.ai();
   }

   static int gd(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bf var11, int var12, int var13) {
      var11.ay -= var11.af * var5;
      var11.as -= var11.ar * var5;
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.ay += var11.af * var5;
      var11.as += var11.ar * var5;
      var11.ai = var6;
      var11.ap = var4;
      return var5;
   }

   public synchronized void ez(int var1) {
      if (this.aw < 0) {
         this.aw = -var1;
      } else {
         this.aw = var1;
      }

   }

   static int fj(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, bf var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.ap = var4;
      return var5;
   }
}
