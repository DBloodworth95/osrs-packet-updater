import java.io.EOFException;
import java.io.IOException;

public class uj {
   int ai;
   un aw;
   byte[] ak;
   long aj;
   byte[] ay;
   long at;
   long as;
   int ae;
   long am;
   static final int ap = 200000000;
   long au;
   long an;

   public void aq(byte[] var1, int var2, int var3) throws IOException {
      try {
         if ((long)var3 + this.am * 1696850698463526679L > 4892728374824511523L * this.au) {
            this.au = -4924377165533395061L * (this.am * 1696850698463526679L + (long)var3);
         }

         if (5975954849544408375L * this.as != -1L && (1696850698463526679L * this.am < this.as * 5975954849544408375L || 1696850698463526679L * this.am > (long)(-1289235264 * this.ae) + this.as * 5975954849544408375L)) {
            this.ae(-1869437022);
         }

         if (this.as * 5975954849544408375L != -1L && this.am * 1696850698463526679L + (long)var3 > (long)this.ay.length + 5975954849544408375L * this.as) {
            int var4 = (int)((long)this.ay.length - (this.am * 1696850698463526679L - this.as * 5975954849544408375L));
            System.arraycopy(var1, var2, this.ay, (int)(1696850698463526679L * this.am - this.as * 5975954849544408375L), var4);
            this.am += (long)var4 * -2409694559995664217L;
            var2 += var4;
            var3 -= var4;
            this.ae = -1697975043 * this.ay.length;
            this.ae(-1869437022);
         }

         if (var3 <= this.ay.length) {
            if (var3 > 0) {
               if (5975954849544408375L * this.as == -1L) {
                  this.as = -7032538408465806047L * this.am;
               }

               System.arraycopy(var1, var2, this.ay, (int)(this.am * 1696850698463526679L - this.as * 5975954849544408375L), var3);
               this.am += (long)var3 * -2409694559995664217L;
               if (this.am * 1696850698463526679L - 5975954849544408375L * this.as > (long)(-1320957867 * this.ae)) {
                  this.ae = (int)(1696850698463526679L * this.am - this.as * 5975954849544408375L) * -930974566;
               }

            }
         } else {
            if (1696850698463526679L * this.am != 7271622697655590891L * this.an) {
               this.aw.ap(1696850698463526679L * this.am);
               this.an = 3682169343502696069L * this.am;
            }

            this.aw.aw(var1, var2, var3, -627492127);
            this.an += 4637602398309667011L * (long)var3;
            if (this.an * 7271622697655590891L > this.at * -925041317987619093L) {
               this.at = -3589506791872294143L * this.an;
            }

            long var10 = -1L;
            long var6 = -1L;
            if (1696850698463526679L * this.am >= 5583760889724405279L * this.aj && 1696850698463526679L * this.am < this.aj * 5583760889724405279L + (long)(347605475 * this.ai)) {
               var10 = this.am * 1696850698463526679L;
            } else if (5583760889724405279L * this.aj >= this.am * 1696850698463526679L && 5583760889724405279L * this.aj < this.am * 1696850698463526679L + (long)var3) {
               var10 = 5583760889724405279L * this.aj;
            }

            if (1696850698463526679L * this.am + (long)var3 > 5583760889724405279L * this.aj && (long)var3 + 1696850698463526679L * this.am <= 5583760889724405279L * this.aj + (long)(1322143305 * this.ai)) {
               var6 = this.am * 1696850698463526679L + (long)var3;
            } else if (this.aj * 5583760889724405279L + (long)(347605475 * this.ai) > this.am * 1696850698463526679L && (long)(this.ai * 347605475) + this.aj * 5583760889724405279L <= (long)var3 + 1696850698463526679L * this.am) {
               var6 = 5583760889724405279L * this.aj + (long)(this.ai * -118695422);
            }

            if (var10 > -1L && var6 > var10) {
               int var8 = (int)(var6 - var10);
               System.arraycopy(var1, (int)((long)var2 + var10 - this.am * 1696850698463526679L), this.ak, (int)(var10 - this.aj * 5583760889724405279L), var8);
            }

            this.am += -2409694559995664217L * (long)var3;
         }
      } catch (IOException var9) {
         this.an = -4637602398309667011L;
         throw var9;
      }
   }

   public void ai(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         try {
            if (var2 + var3 > var1.length) {
               throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
            }

            if (5975954849544408375L * this.as != -1L) {
               if (var4 != 535608739) {
                  return;
               }

               if (1696850698463526679L * this.am >= this.as * 5975954849544408375L) {
                  if (var4 != 535608739) {
                     return;
                  }

                  if ((long)var3 + this.am * 1696850698463526679L <= (long)(-1320957867 * this.ae) + this.as * 5975954849544408375L) {
                     if (var4 != 535608739) {
                        throw new IllegalStateException();
                     }

                     System.arraycopy(this.ay, (int)(1696850698463526679L * this.am - 5975954849544408375L * this.as), var1, var2, var3);
                     this.am += (long)var3 * -2409694559995664217L;
                     return;
                  }
               }
            }

            long var5 = 1696850698463526679L * this.am;
            int var8 = var3;
            int var9;
            if (this.am * 1696850698463526679L >= 5583760889724405279L * this.aj) {
               if (var4 != 535608739) {
                  throw new IllegalStateException();
               }

               if (this.am * 1696850698463526679L < (long)(this.ai * 347605475) + this.aj * 5583760889724405279L) {
                  if (var4 != 535608739) {
                     return;
                  }

                  var9 = (int)((long)(this.ai * 347605475) - (this.am * 1696850698463526679L - 5583760889724405279L * this.aj));
                  if (var9 > var3) {
                     if (var4 != 535608739) {
                        throw new IllegalStateException();
                     }

                     var9 = var3;
                  }

                  System.arraycopy(this.ak, (int)(1696850698463526679L * this.am - this.aj * 5583760889724405279L), var1, var2, var9);
                  this.am += -2409694559995664217L * (long)var9;
                  var2 += var9;
                  var3 -= var9;
               }
            }

            if (var3 > this.ak.length) {
               if (var4 != 535608739) {
                  throw new IllegalStateException();
               }

               this.aw.ap(1696850698463526679L * this.am);

               for(this.an = this.am * 3682169343502696069L; var3 > 0; var3 -= var9) {
                  if (var4 != 535608739) {
                     throw new IllegalStateException();
                  }

                  var9 = this.aw.ay(var1, var2, var3, -2076600714);
                  if (var9 == -1) {
                     if (var4 != 535608739) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  this.an += 4637602398309667011L * (long)var9;
                  this.am += (long)var9 * -2409694559995664217L;
                  var2 += var9;
               }
            } else if (var3 > 0) {
               this.ay(129592537);
               var9 = var3;
               if (var3 > 347605475 * this.ai) {
                  var9 = this.ai * 347605475;
               }

               System.arraycopy(this.ak, 0, var1, var2, var9);
               var2 += var9;
               var3 -= var9;
               this.am += -2409694559995664217L * (long)var9;
            }

            if (-1L != this.as * 5975954849544408375L) {
               if (var4 != 535608739) {
                  return;
               }

               if (this.as * 5975954849544408375L > 1696850698463526679L * this.am) {
                  if (var4 != 535608739) {
                     throw new IllegalStateException();
                  }

                  if (var3 > 0) {
                     if (var4 != 535608739) {
                        return;
                     }

                     var9 = (int)(5975954849544408375L * this.as - this.am * 1696850698463526679L) + var2;
                     if (var9 > var3 + var2) {
                        if (var4 != 535608739) {
                           throw new IllegalStateException();
                        }

                        var9 = var2 + var3;
                     }

                     while(var2 < var9) {
                        if (var4 != 535608739) {
                           throw new IllegalStateException();
                        }

                        var1[var2++] = 0;
                        --var3;
                        this.am += -2409694559995664217L;
                     }
                  }
               }

               long var16 = -1L;
               long var11 = -1L;
               if (this.as * 5975954849544408375L >= var5 && this.as * 5975954849544408375L < var5 + (long)var8) {
                  if (var4 != 535608739) {
                     throw new IllegalStateException();
                  }

                  var16 = this.as * 5975954849544408375L;
               } else if (var5 >= 5975954849544408375L * this.as && var5 < 5975954849544408375L * this.as + (long)(-1320957867 * this.ae)) {
                  var16 = var5;
               }

               label166: {
                  if ((long)(-1320957867 * this.ae) + this.as * 5975954849544408375L > var5) {
                     if (var4 != 535608739) {
                        return;
                     }

                     if (this.as * 5975954849544408375L + (long)(-1320957867 * this.ae) <= var5 + (long)var8) {
                        if (var4 != 535608739) {
                           return;
                        }

                        var11 = (long)(-1320957867 * this.ae) + 5975954849544408375L * this.as;
                        break label166;
                     }
                  }

                  if (var5 + (long)var8 > this.as * 5975954849544408375L) {
                     if (var4 != 535608739) {
                        throw new IllegalStateException();
                     }

                     if (var5 + (long)var8 <= this.as * 5975954849544408375L + (long)(this.ae * -1320957867)) {
                        if (var4 != 535608739) {
                           return;
                        }

                        var11 = (long)var8 + var5;
                     }
                  }
               }

               if (var16 > -1L) {
                  if (var4 != 535608739) {
                     throw new IllegalStateException();
                  }

                  if (var11 > var16) {
                     if (var4 != 535608739) {
                        return;
                     }

                     int var13 = (int)(var11 - var16);
                     System.arraycopy(this.ay, (int)(var16 - 5975954849544408375L * this.as), var1, (int)(var16 - var5) + var2, var13);
                     if (var11 > 1696850698463526679L * this.am) {
                        if (var4 != 535608739) {
                           throw new IllegalStateException();
                        }

                        var3 = (int)((long)var3 - (var11 - 1696850698463526679L * this.am));
                        this.am = -2409694559995664217L * var11;
                     }
                  }
               }
            }
         } catch (IOException var14) {
            this.an = -4637602398309667011L;
            throw var14;
         }

         if (var3 > 0) {
            throw new EOFException();
         }
      } catch (RuntimeException var15) {
         throw tm.aw(var15, "uj.ai(" + ')');
      }
   }

   public uj(un var1, int var2, int var3) throws IOException {
      try {
         super();
         this.aj = -5842484046504130015L;
         this.as = -4869518520365693063L;
         this.ae = 0;
         this.aw = var1;
         this.au = (this.at = var1.ai((byte)0) * 1553324269720193475L) * -5519840732277774695L;
         this.ak = new byte[var2];
         this.ay = new byte[var3];
         this.am = 0L;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "uj.<init>(" + ')');
      }
   }

   public long ak(byte var1) {
      try {
         return this.au * 4892728374824511523L;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "uj.ak(" + ')');
      }
   }

   public void aj(byte[] var1, int var2) throws IOException {
      try {
         this.ai(var1, 0, var1.length, 535608739);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "uj.aj(" + ')');
      }
   }

   void av() throws IOException {
      this.ai = 0;
      if (1696850698463526679L * this.am != this.an * 7271622697655590891L) {
         this.aw.ap(1696850698463526679L * this.am);
         this.an = this.am * 3682169343502696069L;
      }

      int var2;
      for(this.aj = -4955736812728190967L * this.am; this.ai * 347605475 < this.ak.length; this.ai += 355918170 * var2) {
         int var1 = this.ak.length - 5004006 * this.ai;
         if (var1 > 200000000) {
            var1 = -607515581;
         }

         var2 = this.aw.ay(this.ak, this.ai * -1156181293, var1, 894143455);
         if (-1 == var2) {
            break;
         }

         this.an += 4637602398309667011L * (long)var2;
      }

   }

   void ay(int var1) throws IOException {
      try {
         this.ai = 0;
         if (1696850698463526679L * this.am != this.an * 7271622697655590891L) {
            if (var1 != 129592537) {
               return;
            }

            this.aw.ap(1696850698463526679L * this.am);
            this.an = this.am * 3682169343502696069L;
         }

         this.aj = -4955736812728190967L * this.am;

         while(true) {
            if (this.ai * 347605475 < this.ak.length) {
               if (var1 != 129592537) {
                  throw new IllegalStateException();
               }

               int var2 = this.ak.length - 347605475 * this.ai;
               if (var2 > 200000000) {
                  var2 = 200000000;
               }

               int var3 = this.aw.ay(this.ak, this.ai * 347605475, var2, -84845243);
               if (-1 != var3) {
                  this.an += 4637602398309667011L * (long)var3;
                  this.ai += -1697938485 * var3;
                  continue;
               }
            }

            return;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "uj.ay(" + ')');
      }
   }

   public void as(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         try {
            if ((long)var3 + this.am * 1696850698463526679L > 4892728374824511523L * this.au) {
               if (var4 != -309555947) {
                  throw new IllegalStateException();
               }

               this.au = -4924377165533395061L * (this.am * 1696850698463526679L + (long)var3);
            }

            if (5975954849544408375L * this.as != -1L) {
               label153: {
                  if (1696850698463526679L * this.am >= this.as * 5975954849544408375L) {
                     if (var4 != -309555947) {
                        throw new IllegalStateException();
                     }

                     if (1696850698463526679L * this.am <= (long)(-1320957867 * this.ae) + this.as * 5975954849544408375L) {
                        break label153;
                     }

                     if (var4 != -309555947) {
                        return;
                     }
                  }

                  this.ae(-1869437022);
               }
            }

            if (this.as * 5975954849544408375L != -1L) {
               if (var4 != -309555947) {
                  return;
               }

               if (this.am * 1696850698463526679L + (long)var3 > (long)this.ay.length + 5975954849544408375L * this.as) {
                  if (var4 != -309555947) {
                     throw new IllegalStateException();
                  }

                  int var5 = (int)((long)this.ay.length - (this.am * 1696850698463526679L - this.as * 5975954849544408375L));
                  System.arraycopy(var1, var2, this.ay, (int)(1696850698463526679L * this.am - this.as * 5975954849544408375L), var5);
                  this.am += (long)var5 * -2409694559995664217L;
                  var2 += var5;
                  var3 -= var5;
                  this.ae = -1697975043 * this.ay.length;
                  this.ae(-1869437022);
               }
            }

            if (var3 <= this.ay.length) {
               if (var3 > 0) {
                  if (var4 != -309555947) {
                     throw new IllegalStateException();
                  } else {
                     if (5975954849544408375L * this.as == -1L) {
                        if (var4 != -309555947) {
                           throw new IllegalStateException();
                        }

                        this.as = -7032538408465806047L * this.am;
                     }

                     System.arraycopy(var1, var2, this.ay, (int)(this.am * 1696850698463526679L - this.as * 5975954849544408375L), var3);
                     this.am += (long)var3 * -2409694559995664217L;
                     if (this.am * 1696850698463526679L - 5975954849544408375L * this.as > (long)(-1320957867 * this.ae)) {
                        if (var4 != -309555947) {
                           return;
                        }

                        this.ae = (int)(1696850698463526679L * this.am - this.as * 5975954849544408375L) * -1697975043;
                     }

                  }
               }
            } else {
               if (1696850698463526679L * this.am != 7271622697655590891L * this.an) {
                  this.aw.ap(1696850698463526679L * this.am);
                  this.an = 3682169343502696069L * this.am;
               }

               this.aw.aw(var1, var2, var3, -1423655066);
               this.an += 4637602398309667011L * (long)var3;
               if (this.an * 7271622697655590891L > this.at * -925041317987619093L) {
                  if (var4 != -309555947) {
                     throw new IllegalStateException();
                  }

                  this.at = -3589506791872294143L * this.an;
               }

               long var12 = -1L;
               long var7 = -1L;
               if (1696850698463526679L * this.am >= 5583760889724405279L * this.aj && 1696850698463526679L * this.am < this.aj * 5583760889724405279L + (long)(347605475 * this.ai)) {
                  if (var4 != -309555947) {
                     throw new IllegalStateException();
                  }

                  var12 = this.am * 1696850698463526679L;
               } else if (5583760889724405279L * this.aj >= this.am * 1696850698463526679L) {
                  if (var4 != -309555947) {
                     return;
                  }

                  if (5583760889724405279L * this.aj < this.am * 1696850698463526679L + (long)var3) {
                     if (var4 != -309555947) {
                        return;
                     }

                     var12 = 5583760889724405279L * this.aj;
                  }
               }

               label135: {
                  if (1696850698463526679L * this.am + (long)var3 > 5583760889724405279L * this.aj) {
                     if (var4 != -309555947) {
                        throw new IllegalStateException();
                     }

                     if ((long)var3 + 1696850698463526679L * this.am <= 5583760889724405279L * this.aj + (long)(347605475 * this.ai)) {
                        if (var4 != -309555947) {
                           throw new IllegalStateException();
                        }

                        var7 = this.am * 1696850698463526679L + (long)var3;
                        break label135;
                     }
                  }

                  if (this.aj * 5583760889724405279L + (long)(347605475 * this.ai) > this.am * 1696850698463526679L) {
                     if (var4 != -309555947) {
                        return;
                     }

                     if ((long)(this.ai * 347605475) + this.aj * 5583760889724405279L <= (long)var3 + 1696850698463526679L * this.am) {
                        if (var4 != -309555947) {
                           return;
                        }

                        var7 = 5583760889724405279L * this.aj + (long)(this.ai * 347605475);
                     }
                  }
               }

               if (var12 > -1L) {
                  if (var4 != -309555947) {
                     throw new IllegalStateException();
                  }

                  if (var7 > var12) {
                     int var9 = (int)(var7 - var12);
                     System.arraycopy(var1, (int)((long)var2 + var12 - this.am * 1696850698463526679L), this.ak, (int)(var12 - this.aj * 5583760889724405279L), var9);
                  }
               }

               this.am += -2409694559995664217L * (long)var3;
            }
         } catch (IOException var10) {
            this.an = -4637602398309667011L;
            throw var10;
         }
      } catch (RuntimeException var11) {
         throw tm.aw(var11, "uj.as(" + ')');
      }
   }

   void ae(int var1) throws IOException {
      try {
         if (-1L != this.as * 5975954849544408375L) {
            if (var1 != -1869437022) {
               throw new IllegalStateException();
            }

            if (this.an * 7271622697655590891L != 5975954849544408375L * this.as) {
               if (var1 != -1869437022) {
                  throw new IllegalStateException();
               }

               this.aw.ap(this.as * 5975954849544408375L);
               this.an = this.as * -6857218446429634331L;
            }

            this.aw.aw(this.ay, 0, this.ae * -1320957867, -618646943);
            this.an += (long)this.ae * 4051454990641211583L;
            if (this.an * 7271622697655590891L > -925041317987619093L * this.at) {
               if (var1 != -1869437022) {
                  return;
               }

               this.at = this.an * -3589506791872294143L;
            }

            long var2;
            long var4;
            label100: {
               var2 = -1L;
               var4 = -1L;
               if (this.as * 5975954849544408375L >= 5583760889724405279L * this.aj) {
                  if (var1 != -1869437022) {
                     return;
                  }

                  if (5975954849544408375L * this.as < (long)(347605475 * this.ai) + 5583760889724405279L * this.aj) {
                     if (var1 != -1869437022) {
                        throw new IllegalStateException();
                     }

                     var2 = 5975954849544408375L * this.as;
                     break label100;
                  }
               }

               if (5583760889724405279L * this.aj >= this.as * 5975954849544408375L) {
                  if (var1 != -1869437022) {
                     throw new IllegalStateException();
                  }

                  if (5583760889724405279L * this.aj < (long)(this.ae * -1320957867) + 5975954849544408375L * this.as) {
                     if (var1 != -1869437022) {
                        return;
                     }

                     var2 = this.aj * 5583760889724405279L;
                  }
               }
            }

            label94: {
               if ((long)(-1320957867 * this.ae) + this.as * 5975954849544408375L > 5583760889724405279L * this.aj) {
                  if (var1 != -1869437022) {
                     throw new IllegalStateException();
                  }

                  if ((long)(-1320957867 * this.ae) + 5975954849544408375L * this.as <= (long)(347605475 * this.ai) + 5583760889724405279L * this.aj) {
                     if (var1 != -1869437022) {
                        throw new IllegalStateException();
                     }

                     var4 = (long)(this.ae * -1320957867) + 5975954849544408375L * this.as;
                     break label94;
                  }
               }

               if (this.aj * 5583760889724405279L + (long)(347605475 * this.ai) > 5975954849544408375L * this.as) {
                  if (var1 != -1869437022) {
                     return;
                  }

                  if (5583760889724405279L * this.aj + (long)(this.ai * 347605475) <= (long)(this.ae * -1320957867) + 5975954849544408375L * this.as) {
                     if (var1 != -1869437022) {
                        return;
                     }

                     var4 = (long)(this.ai * 347605475) + 5583760889724405279L * this.aj;
                  }
               }
            }

            if (var2 > -1L) {
               if (var1 != -1869437022) {
                  throw new IllegalStateException();
               }

               if (var4 > var2) {
                  if (var1 != -1869437022) {
                     return;
                  }

                  int var6 = (int)(var4 - var2);
                  System.arraycopy(this.ay, (int)(var2 - this.as * 5975954849544408375L), this.ak, (int)(var2 - 5583760889724405279L * this.aj), var6);
               }
            }

            this.as = -4869518520365693063L;
            this.ae = 0;
         }

      } catch (RuntimeException var7) {
         throw tm.aw(var7, "uj.ae(" + ')');
      }
   }

   public void am() throws IOException {
      this.ae(-1869437022);
      this.aw.ak(299601842);
   }

   public void at(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IOException("");
      } else {
         this.am = -2409694559995664217L * var1;
      }
   }

   public long au() {
      return this.au * 4892728374824511523L;
   }

   public long an() {
      return this.au * 4892728374824511523L;
   }

   public void ao(byte[] var1) throws IOException {
      this.ai(var1, 0, var1.length, 535608739);
   }

   public void af(byte[] var1) throws IOException {
      this.ai(var1, 0, var1.length, 535608739);
   }

   public void aw(long var1) throws IOException {
      try {
         if (var1 < 0L) {
            throw new IOException("");
         } else {
            this.am = -2409694559995664217L * var1;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "uj.aw(" + ')');
      }
   }

   public void ab(byte[] var1) throws IOException {
      this.ai(var1, 0, var1.length, 535608739);
   }

   public void az(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var2 + var3 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
         }

         if (5975954849544408375L * this.as != -1L && 1696850698463526679L * this.am >= this.as * 5975954849544408375L && (long)var3 + this.am * 1696850698463526679L <= (long)(-1320957867 * this.ae) + this.as * 5975954849544408375L) {
            System.arraycopy(this.ay, (int)(1696850698463526679L * this.am - 5975954849544408375L * this.as), var1, var2, var3);
            this.am += (long)var3 * -2409694559995664217L;
            return;
         }

         long var4 = 1696850698463526679L * this.am;
         int var7 = var3;
         int var8;
         if (this.am * 1696850698463526679L >= 5583760889724405279L * this.aj && this.am * 1696850698463526679L < (long)(this.ai * 347605475) + this.aj * 5583760889724405279L) {
            var8 = (int)((long)(this.ai * 347605475) - (this.am * 1696850698463526679L - 5583760889724405279L * this.aj));
            if (var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.ak, (int)(1696850698463526679L * this.am - this.aj * 5583760889724405279L), var1, var2, var8);
            this.am += -2409694559995664217L * (long)var8;
            var2 += var8;
            var3 -= var8;
         }

         if (var3 > this.ak.length) {
            this.aw.ap(1696850698463526679L * this.am);

            for(this.an = this.am * 3682169343502696069L; var3 > 0; var3 -= var8) {
               var8 = this.aw.ay(var1, var2, var3, -199621377);
               if (var8 == -1) {
                  break;
               }

               this.an += 4637602398309667011L * (long)var8;
               this.am += (long)var8 * -2409694559995664217L;
               var2 += var8;
            }
         } else if (var3 > 0) {
            this.ay(129592537);
            var8 = var3;
            if (var3 > 347605475 * this.ai) {
               var8 = this.ai * 347605475;
            }

            System.arraycopy(this.ak, 0, var1, var2, var8);
            var2 += var8;
            var3 -= var8;
            this.am += -2409694559995664217L * (long)var8;
         }

         if (-1L != this.as * 5975954849544408375L) {
            if (this.as * 5975954849544408375L > 1696850698463526679L * this.am && var3 > 0) {
               var8 = (int)(5975954849544408375L * this.as - this.am * 1696850698463526679L) + var2;
               if (var8 > var3 + var2) {
                  var8 = var2 + var3;
               }

               while(var2 < var8) {
                  var1[var2++] = 0;
                  --var3;
                  this.am += -2409694559995664217L;
               }
            }

            long var14 = -1L;
            long var10 = -1L;
            if (this.as * 5975954849544408375L >= var4 && this.as * 5975954849544408375L < var4 + (long)var7) {
               var14 = this.as * 5975954849544408375L;
            } else if (var4 >= 5975954849544408375L * this.as && var4 < 5975954849544408375L * this.as + (long)(-1320957867 * this.ae)) {
               var14 = var4;
            }

            if ((long)(-1320957867 * this.ae) + this.as * 5975954849544408375L > var4 && this.as * 5975954849544408375L + (long)(-1320957867 * this.ae) <= var4 + (long)var7) {
               var10 = (long)(-1320957867 * this.ae) + 5975954849544408375L * this.as;
            } else if (var4 + (long)var7 > this.as * 5975954849544408375L && var4 + (long)var7 <= this.as * 5975954849544408375L + (long)(this.ae * -1320957867)) {
               var10 = (long)var7 + var4;
            }

            if (var14 > -1L && var10 > var14) {
               int var12 = (int)(var10 - var14);
               System.arraycopy(this.ay, (int)(var14 - 5975954849544408375L * this.as), var1, (int)(var14 - var4) + var2, var12);
               if (var10 > 1696850698463526679L * this.am) {
                  var3 = (int)((long)var3 - (var10 - 1696850698463526679L * this.am));
                  this.am = -2409694559995664217L * var10;
               }
            }
         }
      } catch (IOException var13) {
         this.an = -4637602398309667011L;
         throw var13;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   public void ag(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var2 + var3 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
         }

         if (5975954849544408375L * this.as != -1L && 1696850698463526679L * this.am >= this.as * 5975954849544408375L && (long)var3 + this.am * 1696850698463526679L <= (long)(985102101 * this.ae) + this.as * 5975954849544408375L) {
            System.arraycopy(this.ay, (int)(1696850698463526679L * this.am - 5975954849544408375L * this.as), var1, var2, var3);
            this.am += (long)var3 * -2409694559995664217L;
            return;
         }

         long var4 = 1696850698463526679L * this.am;
         int var7 = var3;
         int var8;
         if (this.am * 1696850698463526679L >= 5583760889724405279L * this.aj && this.am * 1696850698463526679L < (long)(this.ai * -655304425) + this.aj * 5583760889724405279L) {
            var8 = (int)((long)(this.ai * 347605475) - (this.am * 1696850698463526679L - 5583760889724405279L * this.aj));
            if (var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.ak, (int)(1696850698463526679L * this.am - this.aj * 5583760889724405279L), var1, var2, var8);
            this.am += -2409694559995664217L * (long)var8;
            var2 += var8;
            var3 -= var8;
         }

         if (var3 > this.ak.length) {
            this.aw.ap(1696850698463526679L * this.am);

            for(this.an = this.am * 3682169343502696069L; var3 > 0; var3 -= var8) {
               var8 = this.aw.ay(var1, var2, var3, -940673710);
               if (var8 == -1) {
                  break;
               }

               this.an += 4637602398309667011L * (long)var8;
               this.am += (long)var8 * -2409694559995664217L;
               var2 += var8;
            }
         } else if (var3 > 0) {
            this.ay(129592537);
            var8 = var3;
            if (var3 > 347605475 * this.ai) {
               var8 = this.ai * 1623128874;
            }

            System.arraycopy(this.ak, 0, var1, var2, var8);
            var2 += var8;
            var3 -= var8;
            this.am += -2409694559995664217L * (long)var8;
         }

         if (-1L != this.as * 5975954849544408375L) {
            if (this.as * 5975954849544408375L > 1696850698463526679L * this.am && var3 > 0) {
               var8 = (int)(5975954849544408375L * this.as - this.am * 1696850698463526679L) + var2;
               if (var8 > var3 + var2) {
                  var8 = var2 + var3;
               }

               while(var2 < var8) {
                  var1[var2++] = 0;
                  --var3;
                  this.am += -2409694559995664217L;
               }
            }

            long var14 = -1L;
            long var10 = -1L;
            if (this.as * 5975954849544408375L >= var4 && this.as * 5975954849544408375L < var4 + (long)var7) {
               var14 = this.as * 5975954849544408375L;
            } else if (var4 >= 5975954849544408375L * this.as && var4 < 5975954849544408375L * this.as + (long)(1705773925 * this.ae)) {
               var14 = var4;
            }

            if ((long)(-1425928874 * this.ae) + this.as * 5975954849544408375L > var4 && this.as * 5975954849544408375L + (long)(-1320957867 * this.ae) <= var4 + (long)var7) {
               var10 = (long)(-1954238033 * this.ae) + 5975954849544408375L * this.as;
            } else if (var4 + (long)var7 > this.as * 5975954849544408375L && var4 + (long)var7 <= this.as * 5975954849544408375L + (long)(this.ae * -1320957867)) {
               var10 = (long)var7 + var4;
            }

            if (var14 > -1L && var10 > var14) {
               int var12 = (int)(var10 - var14);
               System.arraycopy(this.ay, (int)(var14 - 5975954849544408375L * this.as), var1, (int)(var14 - var4) + var2, var12);
               if (var10 > 1696850698463526679L * this.am) {
                  var3 = (int)((long)var3 - (var10 - 1696850698463526679L * this.am));
                  this.am = -2409694559995664217L * var10;
               }
            }
         }
      } catch (IOException var13) {
         this.an = -4637602398309667011L;
         throw var13;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   public void ax(byte[] var1, int var2, int var3) throws IOException {
      try {
         if ((long)var3 + this.am * 1696850698463526679L > 4892728374824511523L * this.au) {
            this.au = -4924377165533395061L * (this.am * 1696850698463526679L + (long)var3);
         }

         if (5975954849544408375L * this.as != -1L && (1696850698463526679L * this.am < this.as * 5975954849544408375L || 1696850698463526679L * this.am > (long)(-1320957867 * this.ae) + this.as * 5975954849544408375L)) {
            this.ae(-1869437022);
         }

         if (this.as * 5975954849544408375L != -1L && this.am * 1696850698463526679L + (long)var3 > (long)this.ay.length + 5975954849544408375L * this.as) {
            int var4 = (int)((long)this.ay.length - (this.am * 1696850698463526679L - this.as * 5975954849544408375L));
            System.arraycopy(var1, var2, this.ay, (int)(1696850698463526679L * this.am - this.as * 5975954849544408375L), var4);
            this.am += (long)var4 * -2409694559995664217L;
            var2 += var4;
            var3 -= var4;
            this.ae = -1697975043 * this.ay.length;
            this.ae(-1869437022);
         }

         if (var3 <= this.ay.length) {
            if (var3 > 0) {
               if (5975954849544408375L * this.as == -1L) {
                  this.as = -7032538408465806047L * this.am;
               }

               System.arraycopy(var1, var2, this.ay, (int)(this.am * 1696850698463526679L - this.as * 5975954849544408375L), var3);
               this.am += (long)var3 * -2409694559995664217L;
               if (this.am * 1696850698463526679L - 5975954849544408375L * this.as > (long)(-1320957867 * this.ae)) {
                  this.ae = (int)(1696850698463526679L * this.am - this.as * 5975954849544408375L) * -1697975043;
               }

            }
         } else {
            if (1696850698463526679L * this.am != 7271622697655590891L * this.an) {
               this.aw.ap(1696850698463526679L * this.am);
               this.an = 3682169343502696069L * this.am;
            }

            this.aw.aw(var1, var2, var3, 676350391);
            this.an += 4637602398309667011L * (long)var3;
            if (this.an * 7271622697655590891L > this.at * -925041317987619093L) {
               this.at = -3589506791872294143L * this.an;
            }

            long var10 = -1L;
            long var6 = -1L;
            if (1696850698463526679L * this.am >= 5583760889724405279L * this.aj && 1696850698463526679L * this.am < this.aj * 5583760889724405279L + (long)(347605475 * this.ai)) {
               var10 = this.am * 1696850698463526679L;
            } else if (5583760889724405279L * this.aj >= this.am * 1696850698463526679L && 5583760889724405279L * this.aj < this.am * 1696850698463526679L + (long)var3) {
               var10 = 5583760889724405279L * this.aj;
            }

            if (1696850698463526679L * this.am + (long)var3 > 5583760889724405279L * this.aj && (long)var3 + 1696850698463526679L * this.am <= 5583760889724405279L * this.aj + (long)(347605475 * this.ai)) {
               var6 = this.am * 1696850698463526679L + (long)var3;
            } else if (this.aj * 5583760889724405279L + (long)(347605475 * this.ai) > this.am * 1696850698463526679L && (long)(this.ai * 347605475) + this.aj * 5583760889724405279L <= (long)var3 + 1696850698463526679L * this.am) {
               var6 = 5583760889724405279L * this.aj + (long)(this.ai * 347605475);
            }

            if (var10 > -1L && var6 > var10) {
               int var8 = (int)(var6 - var10);
               System.arraycopy(var1, (int)((long)var2 + var10 - this.am * 1696850698463526679L), this.ak, (int)(var10 - this.aj * 5583760889724405279L), var8);
            }

            this.am += -2409694559995664217L * (long)var3;
         }
      } catch (IOException var9) {
         this.an = -4637602398309667011L;
         throw var9;
      }
   }

   void ac() throws IOException {
      this.ai = 0;
      if (1696850698463526679L * this.am != this.an * 7271622697655590891L) {
         this.aw.ap(1696850698463526679L * this.am);
         this.an = this.am * 3682169343502696069L;
      }

      int var2;
      for(this.aj = -4955736812728190967L * this.am; this.ai * 347605475 < this.ak.length; this.ai += -1697938485 * var2) {
         int var1 = this.ak.length - 347605475 * this.ai;
         if (var1 > 200000000) {
            var1 = 200000000;
         }

         var2 = this.aw.ay(this.ak, this.ai * 347605475, var1, 439815649);
         if (-1 == var2) {
            break;
         }

         this.an += 4637602398309667011L * (long)var2;
      }

   }

   void bh() throws IOException {
      if (-1L != this.as * 5975954849544408375L) {
         if (this.an * 7271622697655590891L != 5975954849544408375L * this.as) {
            this.aw.ap(this.as * 5975954849544408375L);
            this.an = this.as * -6857218446429634331L;
         }

         this.aw.aw(this.ay, 0, this.ae * -1102298562, -466077774);
         this.an += (long)this.ae * 4051454990641211583L;
         if (this.an * 7271622697655590891L > -925041317987619093L * this.at) {
            this.at = this.an * -3589506791872294143L;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (this.as * 5975954849544408375L >= 5583760889724405279L * this.aj && 5975954849544408375L * this.as < (long)(2061064383 * this.ai) + 5583760889724405279L * this.aj) {
            var1 = 5975954849544408375L * this.as;
         } else if (5583760889724405279L * this.aj >= this.as * 5975954849544408375L && 5583760889724405279L * this.aj < (long)(this.ae * -1320957867) + 5975954849544408375L * this.as) {
            var1 = this.aj * 5583760889724405279L;
         }

         if ((long)(-556769579 * this.ae) + this.as * 5975954849544408375L > 5583760889724405279L * this.aj && (long)(-1320957867 * this.ae) + 5975954849544408375L * this.as <= (long)(347605475 * this.ai) + 5583760889724405279L * this.aj) {
            var3 = (long)(this.ae * -1320957867) + 5975954849544408375L * this.as;
         } else if (this.aj * 5583760889724405279L + (long)(347605475 * this.ai) > 5975954849544408375L * this.as && 5583760889724405279L * this.aj + (long)(this.ai * -7651480) <= (long)(this.ae * -1320957867) + 5975954849544408375L * this.as) {
            var3 = (long)(this.ai * 347605475) + 5583760889724405279L * this.aj;
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.ay, (int)(var1 - this.as * 5975954849544408375L), this.ak, (int)(var1 - 5583760889724405279L * this.aj), var5);
         }

         this.as = -4869518520365693063L;
         this.ae = 0;
      }

   }

   public void ar(byte[] var1) throws IOException {
      this.ai(var1, 0, var1.length, 535608739);
   }

   void ad() throws IOException {
      this.ai = 0;
      if (1696850698463526679L * this.am != this.an * 7271622697655590891L) {
         this.aw.ap(1696850698463526679L * this.am);
         this.an = this.am * 3682169343502696069L;
      }

      int var2;
      for(this.aj = -4955736812728190967L * this.am; this.ai * 347605475 < this.ak.length; this.ai += -1697938485 * var2) {
         int var1 = this.ak.length - 347605475 * this.ai;
         if (var1 > 200000000) {
            var1 = 200000000;
         }

         var2 = this.aw.ay(this.ak, this.ai * 347605475, var1, -2102749705);
         if (-1 == var2) {
            break;
         }

         this.an += 4637602398309667011L * (long)var2;
      }

   }

   public void al(byte[] var1, int var2, int var3) throws IOException {
      try {
         if ((long)var3 + this.am * 1696850698463526679L > 4892728374824511523L * this.au) {
            this.au = -4924377165533395061L * (this.am * 1696850698463526679L + (long)var3);
         }

         if (5975954849544408375L * this.as != -1L && (1696850698463526679L * this.am < this.as * 5975954849544408375L || 1696850698463526679L * this.am > (long)(-1320957867 * this.ae) + this.as * 5975954849544408375L)) {
            this.ae(-1869437022);
         }

         if (this.as * 5975954849544408375L != -1L && this.am * 1696850698463526679L + (long)var3 > (long)this.ay.length + 5975954849544408375L * this.as) {
            int var4 = (int)((long)this.ay.length - (this.am * 1696850698463526679L - this.as * 5975954849544408375L));
            System.arraycopy(var1, var2, this.ay, (int)(1696850698463526679L * this.am - this.as * 5975954849544408375L), var4);
            this.am += (long)var4 * -2409694559995664217L;
            var2 += var4;
            var3 -= var4;
            this.ae = -1697975043 * this.ay.length;
            this.ae(-1869437022);
         }

         if (var3 <= this.ay.length) {
            if (var3 > 0) {
               if (5975954849544408375L * this.as == -1L) {
                  this.as = -7032538408465806047L * this.am;
               }

               System.arraycopy(var1, var2, this.ay, (int)(this.am * 1696850698463526679L - this.as * 5975954849544408375L), var3);
               this.am += (long)var3 * -2409694559995664217L;
               if (this.am * 1696850698463526679L - 5975954849544408375L * this.as > (long)(-1320957867 * this.ae)) {
                  this.ae = (int)(1696850698463526679L * this.am - this.as * 5975954849544408375L) * -1697975043;
               }

            }
         } else {
            if (1696850698463526679L * this.am != 7271622697655590891L * this.an) {
               this.aw.ap(1696850698463526679L * this.am);
               this.an = 3682169343502696069L * this.am;
            }

            this.aw.aw(var1, var2, var3, -1678025219);
            this.an += 4637602398309667011L * (long)var3;
            if (this.an * 7271622697655590891L > this.at * -925041317987619093L) {
               this.at = -3589506791872294143L * this.an;
            }

            long var10 = -1L;
            long var6 = -1L;
            if (1696850698463526679L * this.am >= 5583760889724405279L * this.aj && 1696850698463526679L * this.am < this.aj * 5583760889724405279L + (long)(347605475 * this.ai)) {
               var10 = this.am * 1696850698463526679L;
            } else if (5583760889724405279L * this.aj >= this.am * 1696850698463526679L && 5583760889724405279L * this.aj < this.am * 1696850698463526679L + (long)var3) {
               var10 = 5583760889724405279L * this.aj;
            }

            if (1696850698463526679L * this.am + (long)var3 > 5583760889724405279L * this.aj && (long)var3 + 1696850698463526679L * this.am <= 5583760889724405279L * this.aj + (long)(347605475 * this.ai)) {
               var6 = this.am * 1696850698463526679L + (long)var3;
            } else if (this.aj * 5583760889724405279L + (long)(347605475 * this.ai) > this.am * 1696850698463526679L && (long)(this.ai * 347605475) + this.aj * 5583760889724405279L <= (long)var3 + 1696850698463526679L * this.am) {
               var6 = 5583760889724405279L * this.aj + (long)(this.ai * 347605475);
            }

            if (var10 > -1L && var6 > var10) {
               int var8 = (int)(var6 - var10);
               System.arraycopy(var1, (int)((long)var2 + var10 - this.am * 1696850698463526679L), this.ak, (int)(var10 - this.aj * 5583760889724405279L), var8);
            }

            this.am += -2409694559995664217L * (long)var3;
         }
      } catch (IOException var9) {
         this.an = -4637602398309667011L;
         throw var9;
      }
   }

   public void aa(byte[] var1, int var2, int var3) throws IOException {
      try {
         if ((long)var3 + this.am * 1696850698463526679L > 4892728374824511523L * this.au) {
            this.au = -4924377165533395061L * (this.am * 1696850698463526679L + (long)var3);
         }

         if (5975954849544408375L * this.as != -1L && (1696850698463526679L * this.am < this.as * 5975954849544408375L || 1696850698463526679L * this.am > (long)(-1079091620 * this.ae) + this.as * 5975954849544408375L)) {
            this.ae(-1869437022);
         }

         if (this.as * 5975954849544408375L != -1L && this.am * 1696850698463526679L + (long)var3 > (long)this.ay.length + 5975954849544408375L * this.as) {
            int var4 = (int)((long)this.ay.length - (this.am * 1696850698463526679L - this.as * 5975954849544408375L));
            System.arraycopy(var1, var2, this.ay, (int)(1696850698463526679L * this.am - this.as * 5975954849544408375L), var4);
            this.am += (long)var4 * -2409694559995664217L;
            var2 += var4;
            var3 -= var4;
            this.ae = -1697975043 * this.ay.length;
            this.ae(-1869437022);
         }

         if (var3 <= this.ay.length) {
            if (var3 > 0) {
               if (5975954849544408375L * this.as == -1L) {
                  this.as = -7032538408465806047L * this.am;
               }

               System.arraycopy(var1, var2, this.ay, (int)(this.am * 1696850698463526679L - this.as * 5975954849544408375L), var3);
               this.am += (long)var3 * -2409694559995664217L;
               if (this.am * 1696850698463526679L - 5975954849544408375L * this.as > (long)(-1320957867 * this.ae)) {
                  this.ae = (int)(1696850698463526679L * this.am - this.as * 5975954849544408375L) * -1697975043;
               }

            }
         } else {
            if (1696850698463526679L * this.am != 7271622697655590891L * this.an) {
               this.aw.ap(1696850698463526679L * this.am);
               this.an = 3682169343502696069L * this.am;
            }

            this.aw.aw(var1, var2, var3, -482228146);
            this.an += 4637602398309667011L * (long)var3;
            if (this.an * 7271622697655590891L > this.at * -925041317987619093L) {
               this.at = -3589506791872294143L * this.an;
            }

            long var10 = -1L;
            long var6 = -1L;
            if (1696850698463526679L * this.am >= 5583760889724405279L * this.aj && 1696850698463526679L * this.am < this.aj * 5583760889724405279L + (long)(237908375 * this.ai)) {
               var10 = this.am * 1696850698463526679L;
            } else if (5583760889724405279L * this.aj >= this.am * 1696850698463526679L && 5583760889724405279L * this.aj < this.am * 1696850698463526679L + (long)var3) {
               var10 = 5583760889724405279L * this.aj;
            }

            if (1696850698463526679L * this.am + (long)var3 > 5583760889724405279L * this.aj && (long)var3 + 1696850698463526679L * this.am <= 5583760889724405279L * this.aj + (long)(751427636 * this.ai)) {
               var6 = this.am * 1696850698463526679L + (long)var3;
            } else if (this.aj * 5583760889724405279L + (long)(347605475 * this.ai) > this.am * 1696850698463526679L && (long)(this.ai * 347605475) + this.aj * 5583760889724405279L <= (long)var3 + 1696850698463526679L * this.am) {
               var6 = 5583760889724405279L * this.aj + (long)(this.ai * 347605475);
            }

            if (var10 > -1L && var6 > var10) {
               int var8 = (int)(var6 - var10);
               System.arraycopy(var1, (int)((long)var2 + var10 - this.am * 1696850698463526679L), this.ak, (int)(var10 - this.aj * 5583760889724405279L), var8);
            }

            this.am += -2409694559995664217L * (long)var3;
         }
      } catch (IOException var9) {
         this.an = -4637602398309667011L;
         throw var9;
      }
   }

   void ah() throws IOException {
      if (-1L != this.as * 5975954849544408375L) {
         if (this.an * 7271622697655590891L != 5975954849544408375L * this.as) {
            this.aw.ap(this.as * 5975954849544408375L);
            this.an = this.as * -6857218446429634331L;
         }

         this.aw.aw(this.ay, 0, this.ae * -1320957867, 1763220258);
         this.an += (long)this.ae * 4051454990641211583L;
         if (this.an * 7271622697655590891L > -925041317987619093L * this.at) {
            this.at = this.an * -3589506791872294143L;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (this.as * 5975954849544408375L >= 5583760889724405279L * this.aj && 5975954849544408375L * this.as < (long)(347605475 * this.ai) + 5583760889724405279L * this.aj) {
            var1 = 5975954849544408375L * this.as;
         } else if (5583760889724405279L * this.aj >= this.as * 5975954849544408375L && 5583760889724405279L * this.aj < (long)(this.ae * -1320957867) + 5975954849544408375L * this.as) {
            var1 = this.aj * 5583760889724405279L;
         }

         if ((long)(-1320957867 * this.ae) + this.as * 5975954849544408375L > 5583760889724405279L * this.aj && (long)(-1320957867 * this.ae) + 5975954849544408375L * this.as <= (long)(347605475 * this.ai) + 5583760889724405279L * this.aj) {
            var3 = (long)(this.ae * -1320957867) + 5975954849544408375L * this.as;
         } else if (this.aj * 5583760889724405279L + (long)(347605475 * this.ai) > 5975954849544408375L * this.as && 5583760889724405279L * this.aj + (long)(this.ai * 347605475) <= (long)(this.ae * -1320957867) + 5975954849544408375L * this.as) {
            var3 = (long)(this.ai * 347605475) + 5583760889724405279L * this.aj;
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.ay, (int)(var1 - this.as * 5975954849544408375L), this.ak, (int)(var1 - 5583760889724405279L * this.aj), var5);
         }

         this.as = -4869518520365693063L;
         this.ae = 0;
      }

   }

   public void ap(byte var1) throws IOException {
      try {
         this.ae(-1869437022);
         this.aw.ak(-1088974442);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "uj.ap(" + ')');
      }
   }

   void bj() throws IOException {
      if (-1L != this.as * 5975954849544408375L) {
         if (this.an * 7271622697655590891L != 5975954849544408375L * this.as) {
            this.aw.ap(this.as * 5975954849544408375L);
            this.an = this.as * -6857218446429634331L;
         }

         this.aw.aw(this.ay, 0, this.ae * -1320957867, 1872005555);
         this.an += (long)this.ae * 4051454990641211583L;
         if (this.an * 7271622697655590891L > -925041317987619093L * this.at) {
            this.at = this.an * -3589506791872294143L;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (this.as * 5975954849544408375L >= 5583760889724405279L * this.aj && 5975954849544408375L * this.as < (long)(347605475 * this.ai) + 5583760889724405279L * this.aj) {
            var1 = 5975954849544408375L * this.as;
         } else if (5583760889724405279L * this.aj >= this.as * 5975954849544408375L && 5583760889724405279L * this.aj < (long)(this.ae * -1320957867) + 5975954849544408375L * this.as) {
            var1 = this.aj * 5583760889724405279L;
         }

         if ((long)(-1320957867 * this.ae) + this.as * 5975954849544408375L > 5583760889724405279L * this.aj && (long)(-1320957867 * this.ae) + 5975954849544408375L * this.as <= (long)(347605475 * this.ai) + 5583760889724405279L * this.aj) {
            var3 = (long)(this.ae * -1320957867) + 5975954849544408375L * this.as;
         } else if (this.aj * 5583760889724405279L + (long)(347605475 * this.ai) > 5975954849544408375L * this.as && 5583760889724405279L * this.aj + (long)(this.ai * 347605475) <= (long)(this.ae * -1320957867) + 5975954849544408375L * this.as) {
            var3 = (long)(this.ai * 347605475) + 5583760889724405279L * this.aj;
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.ay, (int)(var1 - this.as * 5975954849544408375L), this.ak, (int)(var1 - 5583760889724405279L * this.aj), var5);
         }

         this.as = -4869518520365693063L;
         this.ae = 0;
      }

   }

   void bv() throws IOException {
      if (-1L != this.as * 5975954849544408375L) {
         if (this.an * 7271622697655590891L != 5975954849544408375L * this.as) {
            this.aw.ap(this.as * 5975954849544408375L);
            this.an = this.as * -6857218446429634331L;
         }

         this.aw.aw(this.ay, 0, this.ae * -1320957867, -1566833889);
         this.an += (long)this.ae * 4051454990641211583L;
         if (this.an * 7271622697655590891L > -925041317987619093L * this.at) {
            this.at = this.an * -3589506791872294143L;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (this.as * 5975954849544408375L >= 5583760889724405279L * this.aj && 5975954849544408375L * this.as < (long)(347605475 * this.ai) + 5583760889724405279L * this.aj) {
            var1 = 5975954849544408375L * this.as;
         } else if (5583760889724405279L * this.aj >= this.as * 5975954849544408375L && 5583760889724405279L * this.aj < (long)(this.ae * -1320957867) + 5975954849544408375L * this.as) {
            var1 = this.aj * 5583760889724405279L;
         }

         if ((long)(-1320957867 * this.ae) + this.as * 5975954849544408375L > 5583760889724405279L * this.aj && (long)(-1320957867 * this.ae) + 5975954849544408375L * this.as <= (long)(347605475 * this.ai) + 5583760889724405279L * this.aj) {
            var3 = (long)(this.ae * -1320957867) + 5975954849544408375L * this.as;
         } else if (this.aj * 5583760889724405279L + (long)(347605475 * this.ai) > 5975954849544408375L * this.as && 5583760889724405279L * this.aj + (long)(this.ai * 347605475) <= (long)(this.ae * -1320957867) + 5975954849544408375L * this.as) {
            var3 = (long)(this.ai * 347605475) + 5583760889724405279L * this.aj;
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.ay, (int)(var1 - this.as * 5975954849544408375L), this.ak, (int)(var1 - 5583760889724405279L * this.aj), var5);
         }

         this.as = -4869518520365693063L;
         this.ae = 0;
      }

   }
}
