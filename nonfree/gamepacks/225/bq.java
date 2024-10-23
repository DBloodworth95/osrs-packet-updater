public class bq extends bk {
   int ah;
   int ax;
   int ae;
   int am;
   int au;
   int aq;
   int af;
   int ag;
   int ac;
   int ar;
   boolean al;
   int ad;
   int at;
   int ap;
   int ab;

   static int ct(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
   }

   static int ae(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
   }

   static int fx(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bq var11, int var12, int var13) {
      var11.aq -= var11.ap * var5;
      var11.af -= var11.ab * var5;
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

      var11.aq += var11.ap * var5;
      var11.af += var11.ab * var5;
      var11.ax = var6;
      var11.ac = var4;
      return var5;
   }

   bq(bg var1, int var2, int var3) {
      this.ai = var1;
      this.au = var1.ag;
      this.ar = var1.am;
      this.al = var1.ax;
      this.ae = var2;
      this.ag = var3;
      this.am = 8192;
      this.ac = 0;
      this.ax();
   }

   public synchronized void bp(int[] var1, int var2, int var3) {
      if (this.ag == 0 && this.ad == 0) {
         this.al(var3);
      } else {
         bg var4 = (bg)this.ai;
         int var5 = this.au << 8;
         int var6 = this.ar << 8;
         int var7 = var4.ae.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.at = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.ac < 0) {
            if (this.ae <= 0) {
               this.ao();
               this.jb();
               return;
            }

            this.ac = 0;
         }

         if (this.ac >= var7) {
            if (this.ae >= 0) {
               this.ao();
               this.jb();
               return;
            }

            this.ac = var7 - 1;
         }

         if (this.at < 0) {
            if (this.al) {
               if (this.ae < 0) {
                  var9 = this.bg(var1, var2, var5, var3, var4.ae[this.au]);
                  if (this.ac >= var5) {
                     return;
                  }

                  this.ac = var5 + var5 - 1 - this.ac;
                  this.ae = -this.ae;
               }

               while(true) {
                  var9 = this.bi(var1, var9, var6, var3, var4.ae[this.ar - 1]);
                  if (this.ac < var6) {
                     return;
                  }

                  this.ac = var6 + var6 - 1 - this.ac;
                  this.ae = -this.ae;
                  var9 = this.bg(var1, var9, var5, var3, var4.ae[this.au]);
                  if (this.ac >= var5) {
                     return;
                  }

                  this.ac = var5 + var5 - 1 - this.ac;
                  this.ae = -this.ae;
               }
            } else if (this.ae < 0) {
               while(true) {
                  var9 = this.bg(var1, var9, var5, var3, var4.ae[this.ar - 1]);
                  if (this.ac >= var5) {
                     return;
                  }

                  this.ac = var6 - 1 - (var6 - 1 - this.ac) % var8;
               }
            } else {
               while(true) {
                  var9 = this.bi(var1, var9, var6, var3, var4.ae[this.au]);
                  if (this.ac < var6) {
                     return;
                  }

                  this.ac = var5 + (this.ac - var5) % var8;
               }
            }
         } else {
            if (this.at > 0) {
               if (this.al) {
                  label180: {
                     if (this.ae < 0) {
                        var9 = this.bg(var1, var2, var5, var3, var4.ae[this.au]);
                        if (this.ac >= var5) {
                           return;
                        }

                        this.ac = var5 + var5 - 1 - this.ac;
                        this.ae = -this.ae;
                        if (--this.at == 0) {
                           break label180;
                        }
                     }

                     do {
                        var9 = this.bi(var1, var9, var6, var3, var4.ae[this.ar - 1]);
                        if (this.ac < var6) {
                           return;
                        }

                        this.ac = var6 + var6 - 1 - this.ac;
                        this.ae = -this.ae;
                        if (--this.at == 0) {
                           break;
                        }

                        var9 = this.bg(var1, var9, var5, var3, var4.ae[this.au]);
                        if (this.ac >= var5) {
                           return;
                        }

                        this.ac = var5 + var5 - 1 - this.ac;
                        this.ae = -this.ae;
                     } while(--this.at != 0);
                  }
               } else {
                  int var10;
                  if (this.ae < 0) {
                     while(true) {
                        var9 = this.bg(var1, var9, var5, var3, var4.ae[this.ar - 1]);
                        if (this.ac >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.ac) / var8;
                        if (var10 >= this.at) {
                           this.ac += var8 * this.at;
                           this.at = 0;
                           break;
                        }

                        this.ac += var8 * var10;
                        this.at -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.bi(var1, var9, var6, var3, var4.ae[this.au]);
                        if (this.ac < var6) {
                           return;
                        }

                        var10 = (this.ac - var5) / var8;
                        if (var10 >= this.at) {
                           this.ac -= var8 * this.at;
                           this.at = 0;
                           break;
                        }

                        this.ac -= var8 * var10;
                        this.at -= var10;
                     }
                  }
               }
            }

            if (this.ae < 0) {
               this.bg(var1, var9, 0, var3, 0);
               if (this.ac < 0) {
                  this.ac = -1;
                  this.ao();
                  this.jb();
               }
            } else {
               this.bi(var1, var9, var7, var3, 0);
               if (this.ac >= var7) {
                  this.ac = var7;
                  this.ao();
                  this.jb();
               }
            }

         }
      }
   }

   public static bq ag(bg var0, int var1, int var2) {
      return var0.ae != null && var0.ae.length != 0 ? new bq(var0, (int)((long)var0.ac * 256L * (long)var1 / (long)(bz.ax * 1073754252)), var2 << 6) : null;
   }

   static int cm(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, bq var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.aq += var9.ap * (var6 - var3);
      var9.af += var9.ab * (var6 - var3);

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

      var9.ax = var4 >> 2;
      var9.ac = var2 << 8;
      return var3;
   }

   void ax() {
      this.ax = this.ag;
      this.aq = ac(this.ag, this.am);
      this.af = ae(this.ag, this.am);
   }

   static int ac(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
   }

   public synchronized void ad(int var1) {
      this.ap(var1 << 6, this.az());
   }

   synchronized void ah(int var1) {
      this.ap(var1, this.az());
   }

   int eu(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.ad > 0) {
            int var6 = var2 + this.ad;
            if (var6 > var4) {
               var6 = var4;
            }

            this.ad += var2;
            if (this.ae == 1699321246 && (this.ac & 255) == 0) {
               if (bz.aq) {
                  var2 = cu(0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, this.ap, this.ab, 0, var6, var3, this);
               } else {
                  var2 = cf(((bg)this.ai).ae, var1, this.ac, var2, this.ax, this.ah, 0, var6, var3, this);
               }
            } else if (bz.aq) {
               var2 = ci(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, this.ap, this.ab, 0, var6, var3, this, this.ae, var5);
            } else {
               var2 = cx(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.ax, this.ah, 0, var6, var3, this, this.ae, var5);
            }

            this.ad -= var2;
            if (this.ad != 0) {
               return var2;
            }

            if (!this.br()) {
               continue;
            }

            return var4;
         }

         if (this.ae == 256 && (this.ac & 252088754) == 0) {
            if (bz.aq) {
               return bv(0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, 0, var4, var3, this);
            }

            return bo(((bg)this.ai).ae, var1, this.ac, var2, this.ax, 0, var4, var3, this);
         }

         if (bz.aq) {
            return bc(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, 0, var4, var3, this, this.ae, var5);
         }

         return be(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.ax, 0, var4, var3, this, this.ae, var5);
      }
   }

   public synchronized int ab() {
      return this.ag == Integer.MIN_VALUE ? 0 : this.ag;
   }

   public synchronized int ea() {
      return this.ae < 0 ? -this.ae : this.ae;
   }

   public synchronized void aa(int var1) {
      int var2 = ((bg)this.ai).ae.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.ac = var1;
   }

   public synchronized void ai(boolean var1) {
      this.ae = (this.ae ^ this.ae >> 31) + (this.ae >>> 31);
      if (var1) {
         this.ae = -this.ae;
      }

   }

   void ao() {
      if (this.ad != 0) {
         if (this.ag == Integer.MIN_VALUE) {
            this.ag = 0;
         }

         this.ad = 0;
         this.ax();
      }

   }

   static int fg(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, bq var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.aq += var9.ap * (var6 - var3);
      var9.af += var9.ab * (var6 - var3);

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

      var9.ax = var4 >> 2;
      var9.ac = var2 << 8;
      return var3;
   }

   public synchronized void ar(int var1) {
      this.at = var1;
   }

   public synchronized void dh(int var1) {
      int var2 = ((bg)this.ai).ae.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.ac = var1;
   }

   static int ci(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, bq var13, int var14, int var15) {
      var13.ax -= var13.ah * var5;
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
      var13.ax += var13.ah * var5;
      var13.aq = var6;
      var13.af = var7;
      var13.ac = var4;
      return var5;
   }

   public synchronized int aw() {
      return this.ae < 0 ? -this.ae : this.ae;
   }

   public boolean by() {
      return this.ac < 0 || this.ac >= ((bg)this.ai).ae.length << 8;
   }

   public boolean bb() {
      return this.ad != 0;
   }

   static int fu(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, bq var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.aq += var9.ap * (var6 - var3);
      var9.af += var9.ab * (var6 - var3);

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

      var9.ax = var4 >> 2;
      var9.ac = var2 << 8;
      return var3;
   }

   protected bk af() {
      return null;
   }

   protected int at() {
      return this.ag == 0 && this.ad == 0 ? 0 : 1;
   }

   public synchronized void au(int[] var1, int var2, int var3) {
      if (this.ag == 0 && this.ad == 0) {
         this.al(var3);
      } else {
         bg var4 = (bg)this.ai;
         int var5 = this.au << 8;
         int var6 = this.ar << 8;
         int var7 = var4.ae.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.at = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.ac < 0) {
            if (this.ae <= 0) {
               this.ao();
               this.jb();
               return;
            }

            this.ac = 0;
         }

         if (this.ac >= var7) {
            if (this.ae >= 0) {
               this.ao();
               this.jb();
               return;
            }

            this.ac = var7 - 1;
         }

         if (this.at < 0) {
            if (this.al) {
               if (this.ae < 0) {
                  var9 = this.bg(var1, var2, var5, var3, var4.ae[this.au]);
                  if (this.ac >= var5) {
                     return;
                  }

                  this.ac = var5 + var5 - 1 - this.ac;
                  this.ae = -this.ae;
               }

               while(true) {
                  var9 = this.bi(var1, var9, var6, var3, var4.ae[this.ar - 1]);
                  if (this.ac < var6) {
                     return;
                  }

                  this.ac = var6 + var6 - 1 - this.ac;
                  this.ae = -this.ae;
                  var9 = this.bg(var1, var9, var5, var3, var4.ae[this.au]);
                  if (this.ac >= var5) {
                     return;
                  }

                  this.ac = var5 + var5 - 1 - this.ac;
                  this.ae = -this.ae;
               }
            } else if (this.ae < 0) {
               while(true) {
                  var9 = this.bg(var1, var9, var5, var3, var4.ae[this.ar - 1]);
                  if (this.ac >= var5) {
                     return;
                  }

                  this.ac = var6 - 1 - (var6 - 1 - this.ac) % var8;
               }
            } else {
               while(true) {
                  var9 = this.bi(var1, var9, var6, var3, var4.ae[this.au]);
                  if (this.ac < var6) {
                     return;
                  }

                  this.ac = var5 + (this.ac - var5) % var8;
               }
            }
         } else {
            if (this.at > 0) {
               if (this.al) {
                  label186: {
                     if (this.ae < 0) {
                        var9 = this.bg(var1, var2, var5, var3, var4.ae[this.au]);
                        if (this.ac >= var5) {
                           return;
                        }

                        this.ac = var5 + var5 - 1 - this.ac;
                        this.ae = -this.ae;
                        if (--this.at == 0) {
                           break label186;
                        }
                     }

                     do {
                        var9 = this.bi(var1, var9, var6, var3, var4.ae[this.ar - 1]);
                        if (this.ac < var6) {
                           return;
                        }

                        this.ac = var6 + var6 - 1 - this.ac;
                        this.ae = -this.ae;
                        if (--this.at == 0) {
                           break;
                        }

                        var9 = this.bg(var1, var9, var5, var3, var4.ae[this.au]);
                        if (this.ac >= var5) {
                           return;
                        }

                        this.ac = var5 + var5 - 1 - this.ac;
                        this.ae = -this.ae;
                     } while(--this.at != 0);
                  }
               } else {
                  int var10;
                  if (this.ae < 0) {
                     while(true) {
                        var9 = this.bg(var1, var9, var5, var3, var4.ae[this.ar - 1]);
                        if (this.ac >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.ac) / var8;
                        if (var10 >= this.at) {
                           this.ac += var8 * this.at;
                           this.at = 0;
                           break;
                        }

                        this.ac += var8 * var10;
                        this.at -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.bi(var1, var9, var6, var3, var4.ae[this.au]);
                        if (this.ac < var6) {
                           return;
                        }

                        var10 = (this.ac - var5) / var8;
                        if (var10 >= this.at) {
                           this.ac -= var8 * this.at;
                           this.at = 0;
                           break;
                        }

                        this.ac -= var8 * var10;
                        this.at -= var10;
                     }
                  }
               }
            }

            if (this.ae < 0) {
               this.bg(var1, var9, 0, var3, 0);
               if (this.ac < 0) {
                  this.ac = -1;
                  this.ao();
                  this.jb();
               }
            } else {
               this.bi(var1, var9, var7, var3, 0);
               if (this.ac >= var7) {
                  this.ac = var7;
                  this.ao();
                  this.jb();
               }
            }

         }
      }
   }

   public synchronized void al(int var1) {
      if (this.ad > 0) {
         if (var1 >= this.ad) {
            if (this.ag == Integer.MIN_VALUE) {
               this.ag = 0;
               this.af = 0;
               this.aq = 0;
               this.ax = 0;
               this.jb();
               var1 = this.ad;
            }

            this.ad = 0;
            this.ax();
         } else {
            this.ax += this.ah * var1;
            this.aq += this.ap * var1;
            this.af += this.ab * var1;
            this.ad -= var1;
         }
      }

      bg var2 = (bg)this.ai;
      int var3 = this.au << 8;
      int var4 = this.ar << 8;
      int var5 = var2.ae.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.at = 0;
      }

      if (this.ac < 0) {
         if (this.ae <= 0) {
            this.ao();
            this.jb();
            return;
         }

         this.ac = 0;
      }

      if (this.ac >= var5) {
         if (this.ae >= 0) {
            this.ao();
            this.jb();
            return;
         }

         this.ac = var5 - 1;
      }

      this.ac += this.ae * var1;
      if (this.at < 0) {
         if (!this.al) {
            if (this.ae < 0) {
               if (this.ac >= var3) {
                  return;
               }

               this.ac = var4 - 1 - (var4 - 1 - this.ac) % var6;
            } else {
               if (this.ac < var4) {
                  return;
               }

               this.ac = var3 + (this.ac - var3) % var6;
            }

         } else {
            if (this.ae < 0) {
               if (this.ac >= var3) {
                  return;
               }

               this.ac = var3 + var3 - 1 - this.ac;
               this.ae = -this.ae;
            }

            while(this.ac >= var4) {
               this.ac = var4 + var4 - 1 - this.ac;
               this.ae = -this.ae;
               if (this.ac >= var3) {
                  return;
               }

               this.ac = var3 + var3 - 1 - this.ac;
               this.ae = -this.ae;
            }

         }
      } else {
         if (this.at > 0) {
            if (this.al) {
               label175: {
                  if (this.ae < 0) {
                     if (this.ac >= var3) {
                        return;
                     }

                     this.ac = var3 + var3 - 1 - this.ac;
                     this.ae = -this.ae;
                     if (--this.at == 0) {
                        break label175;
                     }
                  }

                  do {
                     if (this.ac < var4) {
                        return;
                     }

                     this.ac = var4 + var4 - 1 - this.ac;
                     this.ae = -this.ae;
                     if (--this.at == 0) {
                        break;
                     }

                     if (this.ac >= var3) {
                        return;
                     }

                     this.ac = var3 + var3 - 1 - this.ac;
                     this.ae = -this.ae;
                  } while(--this.at != 0);
               }
            } else {
               int var7;
               if (this.ae < 0) {
                  if (this.ac >= var3) {
                     return;
                  }

                  var7 = (var4 - 1 - this.ac) / var6;
                  if (var7 < this.at) {
                     this.ac += var6 * var7;
                     this.at -= var7;
                     return;
                  }

                  this.ac += var6 * this.at;
                  this.at = 0;
               } else {
                  if (this.ac < var4) {
                     return;
                  }

                  var7 = (this.ac - var3) / var6;
                  if (var7 < this.at) {
                     this.ac -= var6 * var7;
                     this.at -= var7;
                     return;
                  }

                  this.ac -= var6 * this.at;
                  this.at = 0;
               }
            }
         }

         if (this.ae < 0) {
            if (this.ac < 0) {
               this.ac = -1;
               this.ao();
               this.jb();
            }
         } else if (this.ac >= var5) {
            this.ac = var5;
            this.ao();
            this.jb();
         }

      }
   }

   bq(bg var1, int var2, int var3, int var4) {
      this.ai = var1;
      this.au = var1.ag;
      this.ar = var1.am;
      this.al = var1.ax;
      this.ae = var2;
      this.ag = var3;
      this.am = var4;
      this.ac = 0;
      this.ax();
   }

   int bg(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.ad > 0) {
            int var6 = var2 + this.ad;
            if (var6 > var4) {
               var6 = var4;
            }

            this.ad += var2;
            if (this.ae == -256 && (this.ac & 255) == 0) {
               if (bz.aq) {
                  var2 = cj(0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, this.ap, this.ab, 0, var6, var3, this);
               } else {
                  var2 = cm(((bg)this.ai).ae, var1, this.ac, var2, this.ax, this.ah, 0, var6, var3, this);
               }
            } else if (bz.aq) {
               var2 = co(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, this.ap, this.ab, 0, var6, var3, this, this.ae, var5);
            } else {
               var2 = cy(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.ax, this.ah, 0, var6, var3, this, this.ae, var5);
            }

            this.ad -= var2;
            if (this.ad != 0) {
               return var2;
            }

            if (!this.br()) {
               continue;
            }

            return var4;
         }

         if (this.ae == -256 && (this.ac & 255) == 0) {
            if (bz.aq) {
               return bk(0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, 0, var4, var3, this);
            }

            return bq(((bg)this.ai).ae, var1, this.ac, var2, this.ax, 0, var4, var3, this);
         }

         if (bz.aq) {
            return ch(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, 0, var4, var3, this, this.ae, var5);
         }

         return cn(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.ax, 0, var4, var3, this, this.ae, var5);
      }
   }

   boolean br() {
      int var1 = this.ag;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = ac(var1, this.am);
         var3 = ae(var1, this.am);
      }

      if (this.ax == var1 && this.aq == var2 && this.af == var3) {
         if (this.ag == Integer.MIN_VALUE) {
            this.ag = 0;
            this.af = 0;
            this.aq = 0;
            this.ax = 0;
            this.jb();
            return true;
         } else {
            this.ax();
            return false;
         }
      } else {
         if (this.ax < var1) {
            this.ah = 1;
            this.ad = var1 - this.ax;
         } else if (this.ax > var1) {
            this.ah = -1;
            this.ad = this.ax - var1;
         } else {
            this.ah = 0;
         }

         if (this.aq < var2) {
            this.ap = 1;
            if (this.ad == 0 || this.ad > var2 - this.aq) {
               this.ad = var2 - this.aq;
            }
         } else if (this.aq > var2) {
            this.ap = -1;
            if (this.ad == 0 || this.ad > this.aq - var2) {
               this.ad = this.aq - var2;
            }
         } else {
            this.ap = 0;
         }

         if (this.af < var3) {
            this.ab = 1;
            if (this.ad == 0 || this.ad > var3 - this.af) {
               this.ad = var3 - this.af;
            }
         } else if (this.af > var3) {
            this.ab = -1;
            if (this.ad == 0 || this.ad > this.af - var3) {
               this.ad = this.af - var3;
            }
         } else {
            this.ab = 0;
         }

         return false;
      }
   }

   static int bo(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, bq var8) {
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

      var8.ac = var2 << 8;
      return var3;
   }

   int bi(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.ad > 0) {
            int var6 = var2 + this.ad;
            if (var6 > var4) {
               var6 = var4;
            }

            this.ad += var2;
            if (this.ae == 256 && (this.ac & 255) == 0) {
               if (bz.aq) {
                  var2 = cu(0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, this.ap, this.ab, 0, var6, var3, this);
               } else {
                  var2 = cf(((bg)this.ai).ae, var1, this.ac, var2, this.ax, this.ah, 0, var6, var3, this);
               }
            } else if (bz.aq) {
               var2 = ci(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, this.ap, this.ab, 0, var6, var3, this, this.ae, var5);
            } else {
               var2 = cx(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.ax, this.ah, 0, var6, var3, this, this.ae, var5);
            }

            this.ad -= var2;
            if (this.ad != 0) {
               return var2;
            }

            if (!this.br()) {
               continue;
            }

            return var4;
         }

         if (this.ae == 256 && (this.ac & 255) == 0) {
            if (bz.aq) {
               return bv(0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, 0, var4, var3, this);
            }

            return bo(((bg)this.ai).ae, var1, this.ac, var2, this.ax, 0, var4, var3, this);
         }

         if (bz.aq) {
            return bc(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, 0, var4, var3, this, this.ae, var5);
         }

         return be(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.ax, 0, var4, var3, this, this.ae, var5);
      }
   }

   public boolean ef() {
      return this.ac < 0 || this.ac >= ((bg)this.ai).ae.length << 8;
   }

   static int bk(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, bq var10) {
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

      var10.ac = var3 << 8;
      return var4 >> 1;
   }

   static int be(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, bq var10, int var11, int var12) {
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

      var10.ac = var4;
      return var5;
   }

   static int bc(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bq var11, int var12, int var13) {
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

      var11.ac = var4;
      return var5 >> 1;
   }

   static int fk(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, bq var10, int var11, int var12) {
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

      var10.ac = var4;
      return var5;
   }

   static int ch(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bq var11, int var12, int var13) {
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

      var11.ac = var4;
      return var5 >> 1;
   }

   public synchronized void dz(int var1, int var2) {
      this.ay(var1, var2, this.az());
   }

   static int cu(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, bq var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.ax += var12.ah * (var9 - var4);
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

      var12.aq = var5 >> 2;
      var12.af = var6 >> 2;
      var12.ac = var3 << 8;
      return var4 >> 1;
   }

   static int fa(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, bq var13, int var14, int var15) {
      var13.ax -= var13.ah * var5;
      if (var14 == 0 || (var10 = var5 + (var12 + 769667234 - var4 + var14) / var14) > var11) {
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
      var13.ax += var13.ah * var5;
      var13.aq = var6;
      var13.af = var7;
      var13.ac = var4;
      return var5;
   }

   static int cj(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, bq var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.ax += var12.ah * (var9 - var4);
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

      var12.aq = var5 >> 2;
      var12.af = var6 >> 2;
      var12.ac = var3 << 8;
      return var4 >> 1;
   }

   static int cx(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bq var11, int var12, int var13) {
      var11.aq -= var11.ap * var5;
      var11.af -= var11.ab * var5;
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

      var11.aq += var11.ap * var5;
      var11.af += var11.ab * var5;
      var11.ax = var6;
      var11.ac = var4;
      return var5;
   }

   int en(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.ad > 0) {
            int var6 = var2 + this.ad;
            if (var6 > var4) {
               var6 = var4;
            }

            this.ad += var2;
            if (this.ae == -256 && (this.ac & 255) == 0) {
               if (bz.aq) {
                  var2 = cj(0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, this.ap, this.ab, 0, var6, var3, this);
               } else {
                  var2 = cm(((bg)this.ai).ae, var1, this.ac, var2, this.ax, this.ah, 0, var6, var3, this);
               }
            } else if (bz.aq) {
               var2 = co(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, this.ap, this.ab, 0, var6, var3, this, this.ae, var5);
            } else {
               var2 = cy(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.ax, this.ah, 0, var6, var3, this, this.ae, var5);
            }

            this.ad -= var2;
            if (this.ad != 0) {
               return var2;
            }

            if (!this.br()) {
               continue;
            }

            return var4;
         }

         if (this.ae == -256 && (this.ac & 255) == 0) {
            if (bz.aq) {
               return bk(0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, 0, var4, var3, this);
            }

            return bq(((bg)this.ai).ae, var1, this.ac, var2, this.ax, 0, var4, var3, this);
         }

         if (bz.aq) {
            return ch(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, 0, var4, var3, this, this.ae, var5);
         }

         return cn(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.ax, 0, var4, var3, this, this.ae, var5);
      }
   }

   static int cy(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bq var11, int var12, int var13) {
      var11.aq -= var11.ap * var5;
      var11.af -= var11.ab * var5;
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

      var11.aq += var11.ap * var5;
      var11.af += var11.ab * var5;
      var11.ax = var6;
      var11.ac = var4;
      return var5;
   }

   static int co(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, bq var13, int var14, int var15) {
      var13.ax -= var13.ah * var5;
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
      var13.ax += var13.ah * var5;
      var13.aq = var6;
      var13.af = var7;
      var13.ac = var4;
      return var5;
   }

   protected bk an() {
      return null;
   }

   protected bk ak() {
      return null;
   }

   protected bk bn() {
      return null;
   }

   protected bk bh() {
      return null;
   }

   protected bk bd() {
      return null;
   }

   int bt() {
      int var1 = this.ax * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.at == 0) {
         var1 -= var1 * this.ac / (((bg)this.ai).ae.length << 8);
      } else if (this.at >= 0) {
         var1 -= var1 * this.au / ((bg)this.ai).ae.length;
      }

      return var1 > 255 ? 255 : var1;
   }

   protected bk bf() {
      return null;
   }

   synchronized void dk(int var1) {
      this.ap(var1, this.az());
   }

   public synchronized void bs(int[] var1, int var2, int var3) {
      if (this.ag == 0 && this.ad == 0) {
         this.al(var3);
      } else {
         bg var4 = (bg)this.ai;
         int var5 = this.au << 8;
         int var6 = this.ar << 8;
         int var7 = var4.ae.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.at = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.ac < 0) {
            if (this.ae <= 0) {
               this.ao();
               this.jb();
               return;
            }

            this.ac = 0;
         }

         if (this.ac >= var7) {
            if (this.ae >= 0) {
               this.ao();
               this.jb();
               return;
            }

            this.ac = var7 - 1;
         }

         if (this.at < 0) {
            if (this.al) {
               if (this.ae < 0) {
                  var9 = this.bg(var1, var2, var5, var3, var4.ae[this.au]);
                  if (this.ac >= var5) {
                     return;
                  }

                  this.ac = var5 + var5 - 1 - this.ac;
                  this.ae = -this.ae;
               }

               while(true) {
                  var9 = this.bi(var1, var9, var6, var3, var4.ae[this.ar - 1]);
                  if (this.ac < var6) {
                     return;
                  }

                  this.ac = var6 + var6 - 1 - this.ac;
                  this.ae = -this.ae;
                  var9 = this.bg(var1, var9, var5, var3, var4.ae[this.au]);
                  if (this.ac >= var5) {
                     return;
                  }

                  this.ac = var5 + var5 - 1 - this.ac;
                  this.ae = -this.ae;
               }
            } else if (this.ae < 0) {
               while(true) {
                  var9 = this.bg(var1, var9, var5, var3, var4.ae[this.ar - 1]);
                  if (this.ac >= var5) {
                     return;
                  }

                  this.ac = var6 - 1 - (var6 - 1 - this.ac) % var8;
               }
            } else {
               while(true) {
                  var9 = this.bi(var1, var9, var6, var3, var4.ae[this.au]);
                  if (this.ac < var6) {
                     return;
                  }

                  this.ac = var5 + (this.ac - var5) % var8;
               }
            }
         } else {
            if (this.at > 0) {
               if (this.al) {
                  label176: {
                     if (this.ae < 0) {
                        var9 = this.bg(var1, var2, var5, var3, var4.ae[this.au]);
                        if (this.ac >= var5) {
                           return;
                        }

                        this.ac = var5 + var5 - 1 - this.ac;
                        this.ae = -this.ae;
                        if (--this.at == 0) {
                           break label176;
                        }
                     }

                     do {
                        var9 = this.bi(var1, var9, var6, var3, var4.ae[this.ar - 1]);
                        if (this.ac < var6) {
                           return;
                        }

                        this.ac = var6 + var6 - 1 - this.ac;
                        this.ae = -this.ae;
                        if (--this.at == 0) {
                           break;
                        }

                        var9 = this.bg(var1, var9, var5, var3, var4.ae[this.au]);
                        if (this.ac >= var5) {
                           return;
                        }

                        this.ac = var5 + var5 - 1 - this.ac;
                        this.ae = -this.ae;
                     } while(--this.at != 0);
                  }
               } else {
                  int var10;
                  if (this.ae < 0) {
                     while(true) {
                        var9 = this.bg(var1, var9, var5, var3, var4.ae[this.ar - 1]);
                        if (this.ac >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.ac) / var8;
                        if (var10 >= this.at) {
                           this.ac += var8 * this.at;
                           this.at = 0;
                           break;
                        }

                        this.ac += var8 * var10;
                        this.at -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.bi(var1, var9, var6, var3, var4.ae[this.au]);
                        if (this.ac < var6) {
                           return;
                        }

                        var10 = (this.ac - var5) / var8;
                        if (var10 >= this.at) {
                           this.ac -= var8 * this.at;
                           this.at = 0;
                           break;
                        }

                        this.ac -= var8 * var10;
                        this.at -= var10;
                     }
                  }
               }
            }

            if (this.ae < 0) {
               this.bg(var1, var9, 0, var3, 0);
               if (this.ac < 0) {
                  this.ac = -1;
                  this.ao();
                  this.jb();
               }
            } else {
               this.bi(var1, var9, var7, var3, 0);
               if (this.ac >= var7) {
                  this.ac = var7;
                  this.ao();
                  this.jb();
               }
            }

         }
      }
   }

   public synchronized void bw(int[] var1, int var2, int var3) {
      if (this.ag == 0 && this.ad == 0) {
         this.al(var3);
      } else {
         bg var4 = (bg)this.ai;
         int var5 = this.au << 8;
         int var6 = this.ar << 8;
         int var7 = var4.ae.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.at = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.ac < 0) {
            if (this.ae <= 0) {
               this.ao();
               this.jb();
               return;
            }

            this.ac = 0;
         }

         if (this.ac >= var7) {
            if (this.ae >= 0) {
               this.ao();
               this.jb();
               return;
            }

            this.ac = var7 - 1;
         }

         if (this.at < 0) {
            if (this.al) {
               if (this.ae < 0) {
                  var9 = this.bg(var1, var2, var5, var3, var4.ae[this.au]);
                  if (this.ac >= var5) {
                     return;
                  }

                  this.ac = var5 + var5 - 1 - this.ac;
                  this.ae = -this.ae;
               }

               while(true) {
                  var9 = this.bi(var1, var9, var6, var3, var4.ae[this.ar - 1]);
                  if (this.ac < var6) {
                     return;
                  }

                  this.ac = var6 + var6 - 1 - this.ac;
                  this.ae = -this.ae;
                  var9 = this.bg(var1, var9, var5, var3, var4.ae[this.au]);
                  if (this.ac >= var5) {
                     return;
                  }

                  this.ac = var5 + var5 - 1 - this.ac;
                  this.ae = -this.ae;
               }
            } else if (this.ae < 0) {
               while(true) {
                  var9 = this.bg(var1, var9, var5, var3, var4.ae[this.ar - 1]);
                  if (this.ac >= var5) {
                     return;
                  }

                  this.ac = var6 - 1 - (var6 - 1 - this.ac) % var8;
               }
            } else {
               while(true) {
                  var9 = this.bi(var1, var9, var6, var3, var4.ae[this.au]);
                  if (this.ac < var6) {
                     return;
                  }

                  this.ac = var5 + (this.ac - var5) % var8;
               }
            }
         } else {
            if (this.at > 0) {
               if (this.al) {
                  label182: {
                     if (this.ae < 0) {
                        var9 = this.bg(var1, var2, var5, var3, var4.ae[this.au]);
                        if (this.ac >= var5) {
                           return;
                        }

                        this.ac = var5 + var5 - 1 - this.ac;
                        this.ae = -this.ae;
                        if (--this.at == 0) {
                           break label182;
                        }
                     }

                     do {
                        var9 = this.bi(var1, var9, var6, var3, var4.ae[this.ar - 1]);
                        if (this.ac < var6) {
                           return;
                        }

                        this.ac = var6 + var6 - 1 - this.ac;
                        this.ae = -this.ae;
                        if (--this.at == 0) {
                           break;
                        }

                        var9 = this.bg(var1, var9, var5, var3, var4.ae[this.au]);
                        if (this.ac >= var5) {
                           return;
                        }

                        this.ac = var5 + var5 - 1 - this.ac;
                        this.ae = -this.ae;
                     } while(--this.at != 0);
                  }
               } else {
                  int var10;
                  if (this.ae < 0) {
                     while(true) {
                        var9 = this.bg(var1, var9, var5, var3, var4.ae[this.ar - 1]);
                        if (this.ac >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.ac) / var8;
                        if (var10 >= this.at) {
                           this.ac += var8 * this.at;
                           this.at = 0;
                           break;
                        }

                        this.ac += var8 * var10;
                        this.at -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.bi(var1, var9, var6, var3, var4.ae[this.au]);
                        if (this.ac < var6) {
                           return;
                        }

                        var10 = (this.ac - var5) / var8;
                        if (var10 >= this.at) {
                           this.ac -= var8 * this.at;
                           this.at = 0;
                           break;
                        }

                        this.ac -= var8 * var10;
                        this.at -= var10;
                     }
                  }
               }
            }

            if (this.ae < 0) {
               this.bg(var1, var9, 0, var3, 0);
               if (this.ac < 0) {
                  this.ac = -1;
                  this.ao();
                  this.jb();
               }
            } else {
               this.bi(var1, var9, var7, var3, 0);
               if (this.ac >= var7) {
                  this.ac = var7;
                  this.ao();
                  this.jb();
               }
            }

         }
      }
   }

   static int bv(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, bq var10) {
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

      var10.ac = var3 << 8;
      return var4 >> 1;
   }

   public synchronized void bj(int[] var1, int var2, int var3) {
      if (this.ag == 0 && this.ad == 0) {
         this.al(var3);
      } else {
         bg var4 = (bg)this.ai;
         int var5 = this.au << 8;
         int var6 = this.ar << 8;
         int var7 = var4.ae.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.at = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.ac < 0) {
            if (this.ae <= 0) {
               this.ao();
               this.jb();
               return;
            }

            this.ac = 0;
         }

         if (this.ac >= var7) {
            if (this.ae >= 0) {
               this.ao();
               this.jb();
               return;
            }

            this.ac = var7 - 1;
         }

         if (this.at < 0) {
            if (this.al) {
               if (this.ae < 0) {
                  var9 = this.bg(var1, var2, var5, var3, var4.ae[this.au]);
                  if (this.ac >= var5) {
                     return;
                  }

                  this.ac = var5 + var5 - 1 - this.ac;
                  this.ae = -this.ae;
               }

               while(true) {
                  var9 = this.bi(var1, var9, var6, var3, var4.ae[this.ar - 1]);
                  if (this.ac < var6) {
                     return;
                  }

                  this.ac = var6 + var6 - 1 - this.ac;
                  this.ae = -this.ae;
                  var9 = this.bg(var1, var9, var5, var3, var4.ae[this.au]);
                  if (this.ac >= var5) {
                     return;
                  }

                  this.ac = var5 + var5 - 1 - this.ac;
                  this.ae = -this.ae;
               }
            } else if (this.ae < 0) {
               while(true) {
                  var9 = this.bg(var1, var9, var5, var3, var4.ae[this.ar - 1]);
                  if (this.ac >= var5) {
                     return;
                  }

                  this.ac = var6 - 1 - (var6 - 1 - this.ac) % var8;
               }
            } else {
               while(true) {
                  var9 = this.bi(var1, var9, var6, var3, var4.ae[this.au]);
                  if (this.ac < var6) {
                     return;
                  }

                  this.ac = var5 + (this.ac - var5) % var8;
               }
            }
         } else {
            if (this.at > 0) {
               if (this.al) {
                  label188: {
                     if (this.ae < 0) {
                        var9 = this.bg(var1, var2, var5, var3, var4.ae[this.au]);
                        if (this.ac >= var5) {
                           return;
                        }

                        this.ac = var5 + var5 - 1 - this.ac;
                        this.ae = -this.ae;
                        if (--this.at == 0) {
                           break label188;
                        }
                     }

                     do {
                        var9 = this.bi(var1, var9, var6, var3, var4.ae[this.ar - 1]);
                        if (this.ac < var6) {
                           return;
                        }

                        this.ac = var6 + var6 - 1 - this.ac;
                        this.ae = -this.ae;
                        if (--this.at == 0) {
                           break;
                        }

                        var9 = this.bg(var1, var9, var5, var3, var4.ae[this.au]);
                        if (this.ac >= var5) {
                           return;
                        }

                        this.ac = var5 + var5 - 1 - this.ac;
                        this.ae = -this.ae;
                     } while(--this.at != 0);
                  }
               } else {
                  int var10;
                  if (this.ae < 0) {
                     while(true) {
                        var9 = this.bg(var1, var9, var5, var3, var4.ae[this.ar - 1]);
                        if (this.ac >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.ac) / var8;
                        if (var10 >= this.at) {
                           this.ac += var8 * this.at;
                           this.at = 0;
                           break;
                        }

                        this.ac += var8 * var10;
                        this.at -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.bi(var1, var9, var6, var3, var4.ae[this.au]);
                        if (this.ac < var6) {
                           return;
                        }

                        var10 = (this.ac - var5) / var8;
                        if (var10 >= this.at) {
                           this.ac -= var8 * this.at;
                           this.at = 0;
                           break;
                        }

                        this.ac -= var8 * var10;
                        this.at -= var10;
                     }
                  }
               }
            }

            if (this.ae < 0) {
               this.bg(var1, var9, 0, var3, 0);
               if (this.ac < 0) {
                  this.ac = -1;
                  this.ao();
                  this.jb();
               }
            } else {
               this.bi(var1, var9, var7, var3, 0);
               if (this.ac >= var7) {
                  this.ac = var7;
                  this.ao();
                  this.jb();
               }
            }

         }
      }
   }

   public synchronized void bu(int var1) {
      if (this.ad > 0) {
         if (var1 >= this.ad) {
            if (this.ag == Integer.MIN_VALUE) {
               this.ag = 0;
               this.af = 0;
               this.aq = 0;
               this.ax = 0;
               this.jb();
               var1 = this.ad;
            }

            this.ad = 0;
            this.ax();
         } else {
            this.ax += this.ah * var1;
            this.aq += this.ap * var1;
            this.af += this.ab * var1;
            this.ad -= var1;
         }
      }

      bg var2 = (bg)this.ai;
      int var3 = this.au << 8;
      int var4 = this.ar << 8;
      int var5 = var2.ae.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.at = 0;
      }

      if (this.ac < 0) {
         if (this.ae <= 0) {
            this.ao();
            this.jb();
            return;
         }

         this.ac = 0;
      }

      if (this.ac >= var5) {
         if (this.ae >= 0) {
            this.ao();
            this.jb();
            return;
         }

         this.ac = var5 - 1;
      }

      this.ac += this.ae * var1;
      if (this.at < 0) {
         if (!this.al) {
            if (this.ae < 0) {
               if (this.ac >= var3) {
                  return;
               }

               this.ac = var4 - 1 - (var4 - 1 - this.ac) % var6;
            } else {
               if (this.ac < var4) {
                  return;
               }

               this.ac = var3 + (this.ac - var3) % var6;
            }

         } else {
            if (this.ae < 0) {
               if (this.ac >= var3) {
                  return;
               }

               this.ac = var3 + var3 - 1 - this.ac;
               this.ae = -this.ae;
            }

            while(this.ac >= var4) {
               this.ac = var4 + var4 - 1 - this.ac;
               this.ae = -this.ae;
               if (this.ac >= var3) {
                  return;
               }

               this.ac = var3 + var3 - 1 - this.ac;
               this.ae = -this.ae;
            }

         }
      } else {
         if (this.at > 0) {
            if (this.al) {
               label169: {
                  if (this.ae < 0) {
                     if (this.ac >= var3) {
                        return;
                     }

                     this.ac = var3 + var3 - 1 - this.ac;
                     this.ae = -this.ae;
                     if (--this.at == 0) {
                        break label169;
                     }
                  }

                  do {
                     if (this.ac < var4) {
                        return;
                     }

                     this.ac = var4 + var4 - 1 - this.ac;
                     this.ae = -this.ae;
                     if (--this.at == 0) {
                        break;
                     }

                     if (this.ac >= var3) {
                        return;
                     }

                     this.ac = var3 + var3 - 1 - this.ac;
                     this.ae = -this.ae;
                  } while(--this.at != 0);
               }
            } else {
               label201: {
                  int var7;
                  if (this.ae < 0) {
                     if (this.ac >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.ac) / var6;
                     if (var7 >= this.at) {
                        this.ac += var6 * this.at;
                        this.at = 0;
                        break label201;
                     }

                     this.ac += var6 * var7;
                     this.at -= var7;
                  } else {
                     if (this.ac < var4) {
                        return;
                     }

                     var7 = (this.ac - var3) / var6;
                     if (var7 >= this.at) {
                        this.ac -= var6 * this.at;
                        this.at = 0;
                        break label201;
                     }

                     this.ac -= var6 * var7;
                     this.at -= var7;
                  }

                  return;
               }
            }
         }

         if (this.ae < 0) {
            if (this.ac < 0) {
               this.ac = -1;
               this.ao();
               this.jb();
            }
         } else if (this.ac >= var5) {
            this.ac = var5;
            this.ao();
            this.jb();
         }

      }
   }

   public synchronized void bl(int var1) {
      if (this.ad > 0) {
         if (var1 >= this.ad) {
            if (this.ag == Integer.MIN_VALUE) {
               this.ag = 0;
               this.af = 0;
               this.aq = 0;
               this.ax = 0;
               this.jb();
               var1 = this.ad;
            }

            this.ad = 0;
            this.ax();
         } else {
            this.ax += this.ah * var1;
            this.aq += this.ap * var1;
            this.af += this.ab * var1;
            this.ad -= var1;
         }
      }

      bg var2 = (bg)this.ai;
      int var3 = this.au << 8;
      int var4 = this.ar << 8;
      int var5 = var2.ae.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.at = 0;
      }

      if (this.ac < 0) {
         if (this.ae <= 0) {
            this.ao();
            this.jb();
            return;
         }

         this.ac = 0;
      }

      if (this.ac >= var5) {
         if (this.ae >= 0) {
            this.ao();
            this.jb();
            return;
         }

         this.ac = var5 - 1;
      }

      this.ac += this.ae * var1;
      if (this.at < 0) {
         if (!this.al) {
            if (this.ae < 0) {
               if (this.ac >= var3) {
                  return;
               }

               this.ac = var4 - 1 - (var4 - 1 - this.ac) % var6;
            } else {
               if (this.ac < var4) {
                  return;
               }

               this.ac = var3 + (this.ac - var3) % var6;
            }

         } else {
            if (this.ae < 0) {
               if (this.ac >= var3) {
                  return;
               }

               this.ac = var3 + var3 - 1 - this.ac;
               this.ae = -this.ae;
            }

            while(this.ac >= var4) {
               this.ac = var4 + var4 - 1 - this.ac;
               this.ae = -this.ae;
               if (this.ac >= var3) {
                  return;
               }

               this.ac = var3 + var3 - 1 - this.ac;
               this.ae = -this.ae;
            }

         }
      } else {
         if (this.at > 0) {
            if (this.al) {
               label172: {
                  if (this.ae < 0) {
                     if (this.ac >= var3) {
                        return;
                     }

                     this.ac = var3 + var3 - 1 - this.ac;
                     this.ae = -this.ae;
                     if (--this.at == 0) {
                        break label172;
                     }
                  }

                  do {
                     if (this.ac < var4) {
                        return;
                     }

                     this.ac = var4 + var4 - 1 - this.ac;
                     this.ae = -this.ae;
                     if (--this.at == 0) {
                        break;
                     }

                     if (this.ac >= var3) {
                        return;
                     }

                     this.ac = var3 + var3 - 1 - this.ac;
                     this.ae = -this.ae;
                  } while(--this.at != 0);
               }
            } else {
               label204: {
                  int var7;
                  if (this.ae < 0) {
                     if (this.ac >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.ac) / var6;
                     if (var7 >= this.at) {
                        this.ac += var6 * this.at;
                        this.at = 0;
                        break label204;
                     }

                     this.ac += var6 * var7;
                     this.at -= var7;
                  } else {
                     if (this.ac < var4) {
                        return;
                     }

                     var7 = (this.ac - var3) / var6;
                     if (var7 >= this.at) {
                        this.ac -= var6 * this.at;
                        this.at = 0;
                        break label204;
                     }

                     this.ac -= var6 * var7;
                     this.at -= var7;
                  }

                  return;
               }
            }
         }

         if (this.ae < 0) {
            if (this.ac < 0) {
               this.ac = -1;
               this.ao();
               this.jb();
            }
         } else if (this.ac >= var5) {
            this.ac = var5;
            this.ao();
            this.jb();
         }

      }
   }

   public synchronized void bz(int var1) {
      if (this.ad > 0) {
         if (var1 >= this.ad) {
            if (this.ag == Integer.MIN_VALUE) {
               this.ag = 0;
               this.af = 0;
               this.aq = 0;
               this.ax = 0;
               this.jb();
               var1 = this.ad;
            }

            this.ad = 0;
            this.ax();
         } else {
            this.ax += this.ah * var1;
            this.aq += this.ap * var1;
            this.af += this.ab * var1;
            this.ad -= var1;
         }
      }

      bg var2 = (bg)this.ai;
      int var3 = this.au << 8;
      int var4 = this.ar << 8;
      int var5 = var2.ae.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.at = 0;
      }

      if (this.ac < 0) {
         if (this.ae <= 0) {
            this.ao();
            this.jb();
            return;
         }

         this.ac = 0;
      }

      if (this.ac >= var5) {
         if (this.ae >= 0) {
            this.ao();
            this.jb();
            return;
         }

         this.ac = var5 - 1;
      }

      this.ac += this.ae * var1;
      if (this.at < 0) {
         if (!this.al) {
            if (this.ae < 0) {
               if (this.ac >= var3) {
                  return;
               }

               this.ac = var4 - 1 - (var4 - 1 - this.ac) % var6;
            } else {
               if (this.ac < var4) {
                  return;
               }

               this.ac = var3 + (this.ac - var3) % var6;
            }

         } else {
            if (this.ae < 0) {
               if (this.ac >= var3) {
                  return;
               }

               this.ac = var3 + var3 - 1 - this.ac;
               this.ae = -this.ae;
            }

            while(this.ac >= var4) {
               this.ac = var4 + var4 - 1 - this.ac;
               this.ae = -this.ae;
               if (this.ac >= var3) {
                  return;
               }

               this.ac = var3 + var3 - 1 - this.ac;
               this.ae = -this.ae;
            }

         }
      } else {
         if (this.at > 0) {
            if (this.al) {
               label174: {
                  if (this.ae < 0) {
                     if (this.ac >= var3) {
                        return;
                     }

                     this.ac = var3 + var3 - 1 - this.ac;
                     this.ae = -this.ae;
                     if (--this.at == 0) {
                        break label174;
                     }
                  }

                  do {
                     if (this.ac < var4) {
                        return;
                     }

                     this.ac = var4 + var4 - 1 - this.ac;
                     this.ae = -this.ae;
                     if (--this.at == 0) {
                        break;
                     }

                     if (this.ac >= var3) {
                        return;
                     }

                     this.ac = var3 + var3 - 1 - this.ac;
                     this.ae = -this.ae;
                  } while(--this.at != 0);
               }
            } else {
               int var7;
               if (this.ae < 0) {
                  if (this.ac >= var3) {
                     return;
                  }

                  var7 = (var4 - 1 - this.ac) / var6;
                  if (var7 < this.at) {
                     this.ac += var6 * var7;
                     this.at -= var7;
                     return;
                  }

                  this.ac += var6 * this.at;
                  this.at = 0;
               } else {
                  if (this.ac < var4) {
                     return;
                  }

                  var7 = (this.ac - var3) / var6;
                  if (var7 < this.at) {
                     this.ac -= var6 * var7;
                     this.at -= var7;
                     return;
                  }

                  this.ac -= var6 * this.at;
                  this.at = 0;
               }
            }
         }

         if (this.ae < 0) {
            if (this.ac < 0) {
               this.ac = -1;
               this.ao();
               this.jb();
            }
         } else if (this.ac >= var5) {
            this.ac = var5;
            this.ao();
            this.jb();
         }

      }
   }

   static int fi(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bq var11, int var12, int var13) {
      var11.aq -= var11.ap * var5;
      var11.af -= var11.ab * var5;
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

      var11.aq += var11.ap * var5;
      var11.af += var11.ab * var5;
      var11.ax = var6;
      var11.ac = var4;
      return var5;
   }

   static int cv(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(-507582468 - var1) * 1.220703125E-4D) + 0.5D);
   }

   static int cg(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
   }

   static int es(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, bq var10) {
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

      var10.ac = var3 << 8;
      return var4 >> 1;
   }

   static int cq(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
   }

   int cc() {
      int var1 = this.ax * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.at == 0) {
         var1 -= var1 * this.ac / (((bg)this.ai).ae.length << 8);
      } else if (this.at >= 0) {
         var1 -= var1 * this.au / ((bg)this.ai).ae.length;
      }

      return var1 > -2046728758 ? 255 : var1;
   }

   public static bq cz(bg var0, int var1, int var2) {
      return var0.ae != null && var0.ae.length != 0 ? new bq(var0, (int)((long)var0.ac * 256L * (long)var1 / (long)(bz.ax * 1073754252)), var2 << 6) : null;
   }

   protected bk bx() {
      return null;
   }

   public static bq cr(bg var0, int var1, int var2) {
      return var0.ae != null && var0.ae.length != 0 ? new bq(var0, (int)((long)var0.ac * 256L * (long)var1 / (long)(bz.ax * 1073754252)), var2 << 6) : null;
   }

   synchronized void df(int var1) {
      this.ap(var1, this.az());
   }

   public synchronized void do(int var1) {
      int var2 = ((bg)this.ai).ae.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.ac = var1;
   }

   void cs() {
      this.ax = this.ag;
      this.aq = ac(this.ag, this.am);
      this.af = ae(this.ag, this.am);
   }

   void cp() {
      this.ax = this.ag;
      this.aq = ac(this.ag, this.am);
      this.af = ae(this.ag, this.am);
   }

   void cb() {
      this.ax = this.ag;
      this.aq = ac(this.ag, this.am);
      this.af = ae(this.ag, this.am);
   }

   public synchronized void cd(int var1) {
      this.at = var1;
   }

   int el(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.ad > 0) {
            int var6 = var2 + this.ad;
            if (var6 > var4) {
               var6 = var4;
            }

            this.ad += var2;
            if (this.ae == -256 && (this.ac & 255) == 0) {
               if (bz.aq) {
                  var2 = cj(0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, this.ap, this.ab, 0, var6, var3, this);
               } else {
                  var2 = cm(((bg)this.ai).ae, var1, this.ac, var2, this.ax, this.ah, 0, var6, var3, this);
               }
            } else if (bz.aq) {
               var2 = co(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, this.ap, this.ab, 0, var6, var3, this, this.ae, var5);
            } else {
               var2 = cy(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.ax, this.ah, 0, var6, var3, this, this.ae, var5);
            }

            this.ad -= var2;
            if (this.ad != 0) {
               return var2;
            }

            if (!this.br()) {
               continue;
            }

            return var4;
         }

         if (this.ae == -256 && (this.ac & 255) == 0) {
            if (bz.aq) {
               return bk(0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, 0, var4, var3, this);
            }

            return bq(((bg)this.ai).ae, var1, this.ac, var2, this.ax, 0, var4, var3, this);
         }

         if (bz.aq) {
            return ch(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, 0, var4, var3, this, this.ae, var5);
         }

         return cn(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.ax, 0, var4, var3, this, this.ae, var5);
      }
   }

   public synchronized void ck(int var1) {
      this.ap(var1 << 6, this.az());
   }

   int ep(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.ad > 0) {
            int var6 = var2 + this.ad;
            if (var6 > var4) {
               var6 = var4;
            }

            this.ad += var2;
            if (this.ae == 256 && (this.ac & 255) == 0) {
               if (bz.aq) {
                  var2 = cu(0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, this.ap, this.ab, 0, var6, var3, this);
               } else {
                  var2 = cf(((bg)this.ai).ae, var1, this.ac, var2, this.ax, this.ah, 0, var6, var3, this);
               }
            } else if (bz.aq) {
               var2 = ci(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, this.ap, this.ab, 0, var6, var3, this, this.ae, var5);
            } else {
               var2 = cx(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.ax, this.ah, 0, var6, var3, this, this.ae, var5);
            }

            this.ad -= var2;
            if (this.ad != 0) {
               return var2;
            }

            if (!this.br()) {
               continue;
            }

            return var4;
         }

         if (this.ae == 256 && (this.ac & 255) == 0) {
            if (bz.aq) {
               return bv(0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, 0, var4, var3, this);
            }

            return bo(((bg)this.ai).ae, var1, this.ac, var2, this.ax, 0, var4, var3, this);
         }

         if (bz.aq) {
            return bc(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, 0, var4, var3, this, this.ae, var5);
         }

         return be(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.ax, 0, var4, var3, this, this.ae, var5);
      }
   }

   static int ey(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, bq var10) {
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

      var10.ac = var3 << 8;
      return var4 >> 1;
   }

   synchronized void dv(int var1) {
      this.ap(var1, this.az());
   }

   synchronized void dt(int var1) {
      this.ap(var1, this.az());
   }

   public synchronized void ba(int[] var1, int var2, int var3) {
      if (this.ag == 0 && this.ad == 0) {
         this.al(var3);
      } else {
         bg var4 = (bg)this.ai;
         int var5 = this.au << 8;
         int var6 = this.ar << 8;
         int var7 = var4.ae.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.at = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.ac < 0) {
            if (this.ae <= 0) {
               this.ao();
               this.jb();
               return;
            }

            this.ac = 0;
         }

         if (this.ac >= var7) {
            if (this.ae >= 0) {
               this.ao();
               this.jb();
               return;
            }

            this.ac = var7 - 1;
         }

         if (this.at < 0) {
            if (this.al) {
               if (this.ae < 0) {
                  var9 = this.bg(var1, var2, var5, var3, var4.ae[this.au]);
                  if (this.ac >= var5) {
                     return;
                  }

                  this.ac = var5 + var5 - 1 - this.ac;
                  this.ae = -this.ae;
               }

               while(true) {
                  var9 = this.bi(var1, var9, var6, var3, var4.ae[this.ar - 1]);
                  if (this.ac < var6) {
                     return;
                  }

                  this.ac = var6 + var6 - 1 - this.ac;
                  this.ae = -this.ae;
                  var9 = this.bg(var1, var9, var5, var3, var4.ae[this.au]);
                  if (this.ac >= var5) {
                     return;
                  }

                  this.ac = var5 + var5 - 1 - this.ac;
                  this.ae = -this.ae;
               }
            } else if (this.ae < 0) {
               while(true) {
                  var9 = this.bg(var1, var9, var5, var3, var4.ae[this.ar - 1]);
                  if (this.ac >= var5) {
                     return;
                  }

                  this.ac = var6 - 1 - (var6 - 1 - this.ac) % var8;
               }
            } else {
               while(true) {
                  var9 = this.bi(var1, var9, var6, var3, var4.ae[this.au]);
                  if (this.ac < var6) {
                     return;
                  }

                  this.ac = var5 + (this.ac - var5) % var8;
               }
            }
         } else {
            if (this.at > 0) {
               if (this.al) {
                  label176: {
                     if (this.ae < 0) {
                        var9 = this.bg(var1, var2, var5, var3, var4.ae[this.au]);
                        if (this.ac >= var5) {
                           return;
                        }

                        this.ac = var5 + var5 - 1 - this.ac;
                        this.ae = -this.ae;
                        if (--this.at == 0) {
                           break label176;
                        }
                     }

                     do {
                        var9 = this.bi(var1, var9, var6, var3, var4.ae[this.ar - 1]);
                        if (this.ac < var6) {
                           return;
                        }

                        this.ac = var6 + var6 - 1 - this.ac;
                        this.ae = -this.ae;
                        if (--this.at == 0) {
                           break;
                        }

                        var9 = this.bg(var1, var9, var5, var3, var4.ae[this.au]);
                        if (this.ac >= var5) {
                           return;
                        }

                        this.ac = var5 + var5 - 1 - this.ac;
                        this.ae = -this.ae;
                     } while(--this.at != 0);
                  }
               } else {
                  int var10;
                  if (this.ae < 0) {
                     while(true) {
                        var9 = this.bg(var1, var9, var5, var3, var4.ae[this.ar - 1]);
                        if (this.ac >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.ac) / var8;
                        if (var10 >= this.at) {
                           this.ac += var8 * this.at;
                           this.at = 0;
                           break;
                        }

                        this.ac += var8 * var10;
                        this.at -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.bi(var1, var9, var6, var3, var4.ae[this.au]);
                        if (this.ac < var6) {
                           return;
                        }

                        var10 = (this.ac - var5) / var8;
                        if (var10 >= this.at) {
                           this.ac -= var8 * this.at;
                           this.at = 0;
                           break;
                        }

                        this.ac -= var8 * var10;
                        this.at -= var10;
                     }
                  }
               }
            }

            if (this.ae < 0) {
               this.bg(var1, var9, 0, var3, 0);
               if (this.ac < 0) {
                  this.ac = -1;
                  this.ao();
                  this.jb();
               }
            } else {
               this.bi(var1, var9, var7, var3, 0);
               if (this.ac >= var7) {
                  this.ac = var7;
                  this.ao();
                  this.jb();
               }
            }

         }
      }
   }

   synchronized void dl(int var1, int var2) {
      this.ag = var1;
      this.am = var2;
      this.ad = 0;
      this.ax();
   }

   synchronized void db(int var1, int var2) {
      this.ag = var1;
      this.am = var2;
      this.ad = 0;
      this.ax();
   }

   public synchronized int dc() {
      return this.ag == Integer.MIN_VALUE ? 0 : this.ag;
   }

   public synchronized int dw() {
      return this.ag == 330973377 ? 0 : this.ag;
   }

   public synchronized int de() {
      return this.ag == -633664953 ? 0 : this.ag;
   }

   static int ej(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, bq var10) {
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

      var10.ac = var3 << 8;
      return var4 >> 1;
   }

   public synchronized int dj() {
      return this.am < 0 ? -1 : this.am;
   }

   static int ed(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, bq var8) {
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

      var8.ac = var2 << 8;
      return var3;
   }

   public boolean ev() {
      return this.ac < 0 || this.ac >= ((bg)this.ai).ae.length << 8;
   }

   public synchronized void dm(boolean var1) {
      this.ae = (this.ae ^ this.ae >> 31) + (this.ae >>> 31);
      if (var1) {
         this.ae = -this.ae;
      }

   }

   void dq() {
      if (this.ad != 0) {
         if (this.ag == Integer.MIN_VALUE) {
            this.ag = 0;
         }

         this.ad = 0;
         this.ax();
      }

   }

   public synchronized void ay(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.ap(var2, var3);
      } else {
         int var4 = ac(var2, var3);
         int var5 = ae(var2, var3);
         if (this.aq == var4 && this.af == var5) {
            this.ad = 0;
         } else {
            int var6 = var2 - this.ax;
            if (this.ax - var2 > var6) {
               var6 = this.ax - var2;
            }

            if (var4 - this.aq > var6) {
               var6 = var4 - this.aq;
            }

            if (this.aq - var4 > var6) {
               var6 = this.aq - var4;
            }

            if (var5 - this.af > var6) {
               var6 = var5 - this.af;
            }

            if (this.af - var5 > var6) {
               var6 = this.af - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.ad = var1;
            this.ag = var2;
            this.am = var3;
            this.ah = (var2 - this.ax) / var1;
            this.ap = (var4 - this.aq) / var1;
            this.ab = (var5 - this.af) / var1;
         }
      }
   }

   void da() {
      if (this.ad != 0) {
         if (this.ag == Integer.MIN_VALUE) {
            this.ag = 0;
         }

         this.ad = 0;
         this.ax();
      }

   }

   public synchronized void as(int var1, int var2) {
      this.ay(var1, var2, this.az());
   }

   public synchronized void dg(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.ap(var2, var3);
      } else {
         int var4 = ac(var2, var3);
         int var5 = ae(var2, var3);
         if (this.aq == var4 && this.af == var5) {
            this.ad = 0;
         } else {
            int var6 = var2 - this.ax;
            if (this.ax - var2 > var6) {
               var6 = this.ax - var2;
            }

            if (var4 - this.aq > var6) {
               var6 = var4 - this.aq;
            }

            if (this.aq - var4 > var6) {
               var6 = this.aq - var4;
            }

            if (var5 - this.af > var6) {
               var6 = var5 - this.af;
            }

            if (this.af - var5 > var6) {
               var6 = this.af - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.ad = var1;
            this.ag = var2;
            this.am = var3;
            this.ah = (var2 - this.ax) / var1;
            this.ap = (var4 - this.aq) / var1;
            this.ab = (var5 - this.af) / var1;
         }
      }
   }

   static int ec(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, bq var10, int var11, int var12) {
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

      var10.ac = var4;
      return var5;
   }

   synchronized void ap(int var1, int var2) {
      this.ag = var1;
      this.am = var2;
      this.ad = 0;
      this.ax();
   }

   public synchronized void ds(int var1) {
      if (var1 == 0) {
         this.ah(0);
         this.jb();
      } else if (this.aq == 0 && this.af == 0) {
         this.ad = 0;
         this.ag = 0;
         this.ax = 0;
         this.jb();
      } else {
         int var2 = -this.ax;
         if (this.ax > var2) {
            var2 = this.ax;
         }

         if (-this.aq > var2) {
            var2 = -this.aq;
         }

         if (this.aq > var2) {
            var2 = this.aq;
         }

         if (-this.af > var2) {
            var2 = -this.af;
         }

         if (this.af > var2) {
            var2 = this.af;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.ad = var1;
         this.ag = Integer.MIN_VALUE;
         this.ah = -this.ax / var1;
         this.ap = -this.aq / var1;
         this.ab = -this.af / var1;
      }
   }

   public synchronized void dn(int var1) {
      if (var1 == 0) {
         this.ah(0);
         this.jb();
      } else if (this.aq == 0 && this.af == 0) {
         this.ad = 0;
         this.ag = 0;
         this.ax = 0;
         this.jb();
      } else {
         int var2 = -this.ax;
         if (this.ax > var2) {
            var2 = this.ax;
         }

         if (-this.aq > var2) {
            var2 = -this.aq;
         }

         if (this.aq > var2) {
            var2 = this.aq;
         }

         if (-this.af > var2) {
            var2 = -this.af;
         }

         if (this.af > var2) {
            var2 = this.af;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.ad = var1;
         this.ag = Integer.MIN_VALUE;
         this.ah = -this.ax / var1;
         this.ap = -this.aq / var1;
         this.ab = -this.af / var1;
      }
   }

   public synchronized void du(int var1) {
      if (var1 == 0) {
         this.ah(0);
         this.jb();
      } else if (this.aq == 0 && this.af == 0) {
         this.ad = 0;
         this.ag = 0;
         this.ax = 0;
         this.jb();
      } else {
         int var2 = -this.ax;
         if (this.ax > var2) {
            var2 = this.ax;
         }

         if (-this.aq > var2) {
            var2 = -this.aq;
         }

         if (this.aq > var2) {
            var2 = this.aq;
         }

         if (-this.af > var2) {
            var2 = -this.af;
         }

         if (this.af > var2) {
            var2 = this.af;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.ad = var1;
         this.ag = 1488181245;
         this.ah = -this.ax / var1;
         this.ap = -this.aq / var1;
         this.ab = -this.af / var1;
      }
   }

   public synchronized void dd(int var1) {
      if (var1 == 0) {
         this.ah(0);
         this.jb();
      } else if (this.aq == 0 && this.af == 0) {
         this.ad = 0;
         this.ag = 0;
         this.ax = 0;
         this.jb();
      } else {
         int var2 = -this.ax;
         if (this.ax > var2) {
            var2 = this.ax;
         }

         if (-this.aq > var2) {
            var2 = -this.aq;
         }

         if (this.aq > var2) {
            var2 = this.aq;
         }

         if (-this.af > var2) {
            var2 = -this.af;
         }

         if (this.af > var2) {
            var2 = this.af;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.ad = var1;
         this.ag = Integer.MIN_VALUE;
         this.ah = -this.ax / var1;
         this.ap = -this.aq / var1;
         this.ab = -this.af / var1;
      }
   }

   public synchronized void eg(int var1) {
      if (this.ae < 0) {
         this.ae = -var1;
      } else {
         this.ae = var1;
      }

   }

   void ca() {
      this.ax = this.ag;
      this.aq = ac(this.ag, this.am);
      this.af = ae(this.ag, this.am);
   }

   public boolean ez() {
      return this.ac < 0 || this.ac >= ((bg)this.ai).ae.length << 8;
   }

   static int cn(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, bq var10, int var11, int var12) {
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

      var10.ac = var4;
      return var5;
   }

   public synchronized void dr(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.ap(var2, var3);
      } else {
         int var4 = ac(var2, var3);
         int var5 = ae(var2, var3);
         if (this.aq == var4 && this.af == var5) {
            this.ad = 0;
         } else {
            int var6 = var2 - this.ax;
            if (this.ax - var2 > var6) {
               var6 = this.ax - var2;
            }

            if (var4 - this.aq > var6) {
               var6 = var4 - this.aq;
            }

            if (this.aq - var4 > var6) {
               var6 = this.aq - var4;
            }

            if (var5 - this.af > var6) {
               var6 = var5 - this.af;
            }

            if (this.af - var5 > var6) {
               var6 = this.af - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.ad = var1;
            this.ag = var2;
            this.am = var3;
            this.ah = (var2 - this.ax) / var1;
            this.ap = (var4 - this.aq) / var1;
            this.ab = (var5 - this.af) / var1;
         }
      }
   }

   static int bq(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, bq var8) {
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

      var8.ac = var2 << 8;
      return var3;
   }

   public static bq am(bg var0, int var1, int var2, int var3) {
      return var0.ae != null && var0.ae.length != 0 ? new bq(var0, var1, var2, var3) : null;
   }

   int ex(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.ad > 0) {
            int var6 = var2 + this.ad;
            if (var6 > var4) {
               var6 = var4;
            }

            this.ad += var2;
            if (this.ae == -1507903296 && (this.ac & 255) == 0) {
               if (bz.aq) {
                  var2 = cu(0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, this.ap, this.ab, 0, var6, var3, this);
               } else {
                  var2 = cf(((bg)this.ai).ae, var1, this.ac, var2, this.ax, this.ah, 0, var6, var3, this);
               }
            } else if (bz.aq) {
               var2 = ci(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, this.ap, this.ab, 0, var6, var3, this, this.ae, var5);
            } else {
               var2 = cx(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.ax, this.ah, 0, var6, var3, this, this.ae, var5);
            }

            this.ad -= var2;
            if (this.ad != 0) {
               return var2;
            }

            if (!this.br()) {
               continue;
            }

            return var4;
         }

         if (this.ae == 256 && (this.ac & 758297535) == 0) {
            if (bz.aq) {
               return bv(0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, 0, var4, var3, this);
            }

            return bo(((bg)this.ai).ae, var1, this.ac, var2, this.ax, 0, var4, var3, this);
         }

         if (bz.aq) {
            return bc(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, 0, var4, var3, this, this.ae, var5);
         }

         return be(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.ax, 0, var4, var3, this, this.ae, var5);
      }
   }

   int eh(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.ad > 0) {
            int var6 = var2 + this.ad;
            if (var6 > var4) {
               var6 = var4;
            }

            this.ad += var2;
            if (this.ae == 256 && (this.ac & -453355448) == 0) {
               if (bz.aq) {
                  var2 = cu(0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, this.ap, this.ab, 0, var6, var3, this);
               } else {
                  var2 = cf(((bg)this.ai).ae, var1, this.ac, var2, this.ax, this.ah, 0, var6, var3, this);
               }
            } else if (bz.aq) {
               var2 = ci(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, this.ap, this.ab, 0, var6, var3, this, this.ae, var5);
            } else {
               var2 = cx(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.ax, this.ah, 0, var6, var3, this, this.ae, var5);
            }

            this.ad -= var2;
            if (this.ad != 0) {
               return var2;
            }

            if (!this.br()) {
               continue;
            }

            return var4;
         }

         if (this.ae == -1348545101 && (this.ac & 255) == 0) {
            if (bz.aq) {
               return bv(0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, 0, var4, var3, this);
            }

            return bo(((bg)this.ai).ae, var1, this.ac, var2, this.ax, 0, var4, var3, this);
         }

         if (bz.aq) {
            return bc(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, 0, var4, var3, this, this.ae, var5);
         }

         return be(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.ax, 0, var4, var3, this, this.ae, var5);
      }
   }

   int ei(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.ad > 0) {
            int var6 = var2 + this.ad;
            if (var6 > var4) {
               var6 = var4;
            }

            this.ad += var2;
            if (this.ae == 256 && (this.ac & 255) == 0) {
               if (bz.aq) {
                  var2 = cu(0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, this.ap, this.ab, 0, var6, var3, this);
               } else {
                  var2 = cf(((bg)this.ai).ae, var1, this.ac, var2, this.ax, this.ah, 0, var6, var3, this);
               }
            } else if (bz.aq) {
               var2 = ci(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, this.ap, this.ab, 0, var6, var3, this, this.ae, var5);
            } else {
               var2 = cx(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.ax, this.ah, 0, var6, var3, this, this.ae, var5);
            }

            this.ad -= var2;
            if (this.ad != 0) {
               return var2;
            }

            if (!this.br()) {
               continue;
            }

            return var4;
         }

         if (this.ae == 256 && (this.ac & 255) == 0) {
            if (bz.aq) {
               return bv(0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, 0, var4, var3, this);
            }

            return bo(((bg)this.ai).ae, var1, this.ac, var2, this.ax, 0, var4, var3, this);
         }

         if (bz.aq) {
            return bc(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, 0, var4, var3, this, this.ae, var5);
         }

         return be(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.ax, 0, var4, var3, this, this.ae, var5);
      }
   }

   public static bq cw(bg var0, int var1, int var2) {
      return var0.ae != null && var0.ae.length != 0 ? new bq(var0, (int)((long)var0.ac * 256L * (long)var1 / (long)(bz.ax * 1073754252)), var2 << 6) : null;
   }

   int eo(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.ad > 0) {
            int var6 = var2 + this.ad;
            if (var6 > var4) {
               var6 = var4;
            }

            this.ad += var2;
            if (this.ae == -256 && (this.ac & 255) == 0) {
               if (bz.aq) {
                  var2 = cj(0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, this.ap, this.ab, 0, var6, var3, this);
               } else {
                  var2 = cm(((bg)this.ai).ae, var1, this.ac, var2, this.ax, this.ah, 0, var6, var3, this);
               }
            } else if (bz.aq) {
               var2 = co(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, this.ap, this.ab, 0, var6, var3, this, this.ae, var5);
            } else {
               var2 = cy(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.ax, this.ah, 0, var6, var3, this, this.ae, var5);
            }

            this.ad -= var2;
            if (this.ad != 0) {
               return var2;
            }

            if (!this.br()) {
               continue;
            }

            return var4;
         }

         if (this.ae == -256 && (this.ac & 255) == 0) {
            if (bz.aq) {
               return bk(0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, 0, var4, var3, this);
            }

            return bq(((bg)this.ai).ae, var1, this.ac, var2, this.ax, 0, var4, var3, this);
         }

         if (bz.aq) {
            return ch(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, 0, var4, var3, this, this.ae, var5);
         }

         return cn(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.ax, 0, var4, var3, this, this.ae, var5);
      }
   }

   public synchronized void ce(int var1) {
      this.ap(var1 << 6, this.az());
   }

   int em(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.ad > 0) {
            int var6 = var2 + this.ad;
            if (var6 > var4) {
               var6 = var4;
            }

            this.ad += var2;
            if (this.ae == 839219047 && (this.ac & 255) == 0) {
               if (bz.aq) {
                  var2 = cj(0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, this.ap, this.ab, 0, var6, var3, this);
               } else {
                  var2 = cm(((bg)this.ai).ae, var1, this.ac, var2, this.ax, this.ah, 0, var6, var3, this);
               }
            } else if (bz.aq) {
               var2 = co(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, this.ap, this.ab, 0, var6, var3, this, this.ae, var5);
            } else {
               var2 = cy(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.ax, this.ah, 0, var6, var3, this, this.ae, var5);
            }

            this.ad -= var2;
            if (this.ad != 0) {
               return var2;
            }

            if (!this.br()) {
               continue;
            }

            return var4;
         }

         if (this.ae == 636204610 && (this.ac & 255) == 0) {
            if (bz.aq) {
               return bk(0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, 0, var4, var3, this);
            }

            return bq(((bg)this.ai).ae, var1, this.ac, var2, this.ax, 0, var4, var3, this);
         }

         if (bz.aq) {
            return ch(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.aq, this.af, 0, var4, var3, this, this.ae, var5);
         }

         return cn(0, 0, ((bg)this.ai).ae, var1, this.ac, var2, this.ax, 0, var4, var3, this, this.ae, var5);
      }
   }

   static int fm(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, bq var13, int var14, int var15) {
      var13.ax -= var13.ah * var5;
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
      var13.ax += var13.ah * var5;
      var13.aq = var6;
      var13.af = var7;
      var13.ac = var4;
      return var5;
   }

   static int eb(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, bq var8) {
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

      var8.ac = var2 << 8;
      return var3;
   }

   public boolean ew() {
      return this.ad != 0;
   }

   protected bk aq() {
      return null;
   }

   public synchronized int dx() {
      return this.am < 0 ? -1 : this.am;
   }

   void di() {
      if (this.ad != 0) {
         if (this.ag == Integer.MIN_VALUE) {
            this.ag = 0;
         }

         this.ad = 0;
         this.ax();
      }

   }

   protected int bm() {
      return this.ag == 0 && this.ad == 0 ? 0 : 1;
   }

   static int ee(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, bq var8) {
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

      var8.ac = var2 << 8;
      return var3;
   }

   static int eq(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, bq var8) {
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

      var8.ac = var2 << 8;
      return var3;
   }

   public static bq cl(bg var0, int var1, int var2, int var3) {
      return var0.ae != null && var0.ae.length != 0 ? new bq(var0, var1, var2, var3) : null;
   }

   public synchronized void dp(int var1) {
      this.ap(var1 << 6, this.az());
   }

   static int et(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, bq var10, int var11, int var12) {
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

      var10.ac = var4;
      return var5;
   }

   static int fv(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, bq var10, int var11, int var12) {
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
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & -2125890201)) * var6 >> 6;
      }

      var10.ac = var4;
      return var5;
   }

   static int ff(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, bq var10, int var11, int var12) {
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

      var10.ac = var4;
      return var5;
   }

   static int fe(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, bq var10, int var11, int var12) {
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

      var10.ac = var4;
      return var5;
   }

   static int ft(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bq var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 543119754) / var12) > var9) {
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

      var11.ac = var4;
      return var5 >> 1;
   }

   static int fb(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bq var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - -1335034693) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & -1140787627);
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

      var11.ac = var4;
      return var5 >> 1;
   }

   static int fj(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, bq var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.ax += var12.ah * (var9 - var4);
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

      var12.aq = var5 >> 2;
      var12.af = var6 >> 2;
      var12.ac = var3 << 8;
      return var4 >> 1;
   }

   static int fp(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, bq var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var9 + -747040705 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 462983376)) * var6 >> 6;
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

      var10.ac = var4;
      return var5;
   }

   static int fr(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, bq var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.aq += var9.ap * (var6 - var3);
      var9.af += var9.ab * (var6 - var3);

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

      var9.ax = var4 >> 2;
      var9.ac = var2 << 8;
      return var3;
   }

   static int er(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, bq var10) {
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

      var10.ac = var3 << 8;
      return var4 >> 1;
   }

   static int fd(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bq var11, int var12, int var13) {
      var11.aq -= var11.ap * var5;
      var11.af -= var11.ab * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 981537750)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & -1743208167)) * var6 >> 6;
         var6 += var7;
      }

      var11.aq += var11.ap * var5;
      var11.af += var11.ab * var5;
      var11.ax = var6;
      var11.ac = var4;
      return var5;
   }

   public synchronized void av(int var1) {
      if (this.ae < 0) {
         this.ae = -var1;
      } else {
         this.ae = var1;
      }

   }

   static int fs(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, bq var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.ax += var12.ah * (var9 - var4);
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

      var12.aq = var5 >> 2;
      var12.af = var6 >> 2;
      var12.ac = var3 << 8;
      return var4 >> 1;
   }

   static int fq(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, bq var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.aq += var9.ap * (var6 - var3);
      var9.af += var9.ab * (var6 - var3);

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

      var9.ax = var4 >> 2;
      var9.ac = var2 << 8;
      return var3;
   }

   static int fn(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, bq var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.aq += var9.ap * (var6 - var3);
      var9.af += var9.ab * (var6 - var3);

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

      var9.ax = var4 >> 2;
      var9.ac = var2 << 8;
      return var3;
   }

   static int fh(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, bq var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.ax += var12.ah * (var9 - var4);
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

      var12.aq = var5 >> 2;
      var12.af = var6 >> 2;
      var12.ac = var3 << 8;
      return var4 >> 1;
   }

   static int fo(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, bq var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.ax += var12.ah * (var9 - var4);
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

      var12.aq = var5 >> 2;
      var12.af = var6 >> 2;
      var12.ac = var3 << 8;
      return var4 >> 1;
   }

   static int fw(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bq var11, int var12, int var13) {
      var11.aq -= var11.ap * var5;
      var11.af -= var11.ab * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 392310869) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 686483387)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & -1685758377)) * var6 >> 6;
         var6 += var7;
      }

      var11.aq += var11.ap * var5;
      var11.af += var11.ab * var5;
      var11.ax = var6;
      var11.ac = var4;
      return var5;
   }

   public synchronized int az() {
      return this.am < 0 ? -1 : this.am;
   }

   public synchronized void aj(int var1) {
      if (var1 == 0) {
         this.ah(0);
         this.jb();
      } else if (this.aq == 0 && this.af == 0) {
         this.ad = 0;
         this.ag = 0;
         this.ax = 0;
         this.jb();
      } else {
         int var2 = -this.ax;
         if (this.ax > var2) {
            var2 = this.ax;
         }

         if (-this.aq > var2) {
            var2 = -this.aq;
         }

         if (this.aq > var2) {
            var2 = this.aq;
         }

         if (-this.af > var2) {
            var2 = -this.af;
         }

         if (this.af > var2) {
            var2 = this.af;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.ad = var1;
         this.ag = Integer.MIN_VALUE;
         this.ah = -this.ax / var1;
         this.ap = -this.aq / var1;
         this.ab = -this.af / var1;
      }
   }

   static int fc(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, bq var13, int var14, int var15) {
      var13.ax -= var13.ah * var5;
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
      var13.ax += var13.ah * var5;
      var13.aq = var6;
      var13.af = var7;
      var13.ac = var4;
      return var5;
   }

   public synchronized void dy(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.ap(var2, var3);
      } else {
         int var4 = ac(var2, var3);
         int var5 = ae(var2, var3);
         if (this.aq == var4 && this.af == var5) {
            this.ad = 0;
         } else {
            int var6 = var2 - this.ax;
            if (this.ax - var2 > var6) {
               var6 = this.ax - var2;
            }

            if (var4 - this.aq > var6) {
               var6 = var4 - this.aq;
            }

            if (this.aq - var4 > var6) {
               var6 = this.aq - var4;
            }

            if (var5 - this.af > var6) {
               var6 = var5 - this.af;
            }

            if (this.af - var5 > var6) {
               var6 = this.af - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.ad = var1;
            this.ag = var2;
            this.am = var3;
            this.ah = (var2 - this.ax) / var1;
            this.ap = (var4 - this.aq) / var1;
            this.ab = (var5 - this.af) / var1;
         }
      }
   }

   static int ek(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, bq var8) {
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

      var8.ac = var2 << 8;
      return var3;
   }

   static int fy(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, bq var11, int var12, int var13) {
      var11.aq -= var11.ap * var5;
      var11.af -= var11.ab * var5;
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 2083069377)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 1497898045)) * var6 >> 6;
         var6 += var7;
      }

      var11.aq += var11.ap * var5;
      var11.af += var11.ab * var5;
      var11.ax = var6;
      var11.ac = var4;
      return var5;
   }

   static int fz(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, bq var13, int var14, int var15) {
      var13.ax -= var13.ah * var5;
      if (var14 == 0 || (var10 = var5 + (var12 + 1144883675 - var4 + var14) / var14) > var11) {
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
      var13.ax += var13.ah * var5;
      var13.aq = var6;
      var13.af = var7;
      var13.ac = var4;
      return var5;
   }

   static int cf(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, bq var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.aq += var9.ap * (var6 - var3);
      var9.af += var9.ab * (var6 - var3);

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

      var9.ax = var4 >> 2;
      var9.ac = var2 << 8;
      return var3;
   }

   static int fl(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, bq var13, int var14, int var15) {
      var13.ax -= var13.ah * var5;
      if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         byte var16 = var2[var1 - 1];
         var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & -1997917114);
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
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 1977023021);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.ax += var13.ah * var5;
      var13.aq = var6;
      var13.af = var7;
      var13.ac = var4;
      return var5;
   }
}
