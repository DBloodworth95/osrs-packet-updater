import java.io.EOFException;
import java.io.IOException;

public class ua {
   byte[] aq;
   ud ae;
   byte[] ag;
   long am;
   int ax;
   static final int ac = 200000000;
   long af;
   int at;
   long au;
   long ar;
   long al;
   long ad;

   public void bn(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (-7409537766690830883L * this.au + (long)var3 > 446602842106707619L * this.al) {
            this.al = ((long)var3 + -7409537766690830883L * this.au) * 3378376527307760907L;
         }

         if (6390274326456513839L * this.af != -1L && (this.au * -7409537766690830883L < this.af * 6390274326456513839L || -7409537766690830883L * this.au > (long)(this.at * 962373833) + 6390274326456513839L * this.af)) {
            this.at(-1760814253);
         }

         if (6390274326456513839L * this.af != -1L && this.au * -7409537766690830883L + (long)var3 > (long)this.aq.length + 6390274326456513839L * this.af) {
            int var4 = (int)((long)this.aq.length - (-7409537766690830883L * this.au - this.af * 6390274326456513839L));
            System.arraycopy(var1, var2, this.aq, (int)(this.au * -7409537766690830883L - 6390274326456513839L * this.af), var4);
            this.au += 7776694461556800117L * (long)var4;
            var2 += var4;
            var3 -= var4;
            this.at = 362912086 * this.aq.length;
            this.at(-1760814253);
         }

         if (var3 <= this.aq.length) {
            if (var3 > 0) {
               if (6390274326456513839L * this.af == -1L) {
                  this.af = -6640930313548150093L * this.au;
               }

               System.arraycopy(var1, var2, this.aq, (int)(-7409537766690830883L * this.au - 6390274326456513839L * this.af), var3);
               this.au += 7776694461556800117L * (long)var3;
               if (this.au * -7409537766690830883L - 6390274326456513839L * this.af > (long)(2063833813 * this.at)) {
                  this.at = 1069926701 * (int)(-7409537766690830883L * this.au - 6390274326456513839L * this.af);
               }

            }
         } else {
            if (-1038774745980389049L * this.ad != this.au * -7409537766690830883L) {
               this.ae.ac(-7409537766690830883L * this.au);
               this.ad = 4648986970804689339L * this.au;
            }

            this.ae.ae(var1, var2, var3, 990152545);
            this.ad += (long)var3 * -4739793993026592649L;
            if (-1038774745980389049L * this.ad > this.ar * 8366871520021484299L) {
               this.ar = this.ad * 1869481321574389813L;
            }

            long var10 = -1L;
            long var6 = -1L;
            if (-7409537766690830883L * this.au >= this.am * -4478279998810493323L && this.au * -7409537766690830883L < (long)(-1700709017 * this.ax) + this.am * -4478279998810493323L) {
               var10 = -7409537766690830883L * this.au;
            } else if (this.am * -4478279998810493323L >= -7409537766690830883L * this.au && -4478279998810493323L * this.am < -7409537766690830883L * this.au + (long)var3) {
               var10 = this.am * -4478279998810493323L;
            }

            if ((long)var3 + -7409537766690830883L * this.au > -4478279998810493323L * this.am && -7409537766690830883L * this.au + (long)var3 <= this.am * -4478279998810493323L + (long)(-2099804209 * this.ax)) {
               var6 = -7409537766690830883L * this.au + (long)var3;
            } else if ((long)(this.ax * -1402858359) + this.am * -4478279998810493323L > -7409537766690830883L * this.au && this.am * -4478279998810493323L + (long)(-1700709017 * this.ax) <= (long)var3 + this.au * -7409537766690830883L) {
               var6 = -4478279998810493323L * this.am + (long)(this.ax * -1700709017);
            }

            if (var10 > -1L && var6 > var10) {
               int var8 = (int)(var6 - var10);
               System.arraycopy(var1, (int)((long)var2 + var10 - -7409537766690830883L * this.au), this.ag, (int)(var10 - this.am * -4478279998810493323L), var8);
            }

            this.au += (long)var3 * 7776694461556800117L;
         }
      } catch (IOException var9) {
         this.ad = 4739793993026592649L;
         throw var9;
      }
   }

   public ua(ud var1, int var2, int var3) throws IOException {
      try {
         super();
         this.am = -6071210995763507677L;
         this.af = 2258472368250015281L;
         this.at = 0;
         this.ae = var1;
         this.al = (this.ar = var1.ax(2072939053) * 8579860644939767971L) * -4831263185681930119L;
         this.ag = new byte[var2];
         this.aq = new byte[var3];
         this.au = 0L;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ua.<init>(" + ')');
      }
   }

   public void az(byte[] var1) throws IOException {
      this.ax(var1, 0, var1.length, (byte)74);
   }

   public long ag(int var1) {
      try {
         return 446602842106707619L * this.al;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ua.ag(" + ')');
      }
   }

   public void ae(long var1) throws IOException {
      try {
         if (var1 < 0L) {
            throw new IOException("");
         } else {
            this.au = 7776694461556800117L * var1;
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ua.ae(" + ')');
      }
   }

   public void ax(byte[] var1, int var2, int var3, byte var4) throws IOException {
      try {
         try {
            if (var3 + var2 > var1.length) {
               if (var4 <= 8) {
                  throw new IllegalStateException();
               }

               throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
            }

            if (this.af * 6390274326456513839L != -1L) {
               if (var4 <= 8) {
                  throw new IllegalStateException();
               }

               if (-7409537766690830883L * this.au >= this.af * 6390274326456513839L && (long)var3 + this.au * -7409537766690830883L <= (long)(962373833 * this.at) + 6390274326456513839L * this.af) {
                  if (var4 <= 8) {
                     throw new IllegalStateException();
                  }

                  System.arraycopy(this.aq, (int)(-7409537766690830883L * this.au - 6390274326456513839L * this.af), var1, var2, var3);
                  this.au += 7776694461556800117L * (long)var3;
                  return;
               }
            }

            long var5 = this.au * -7409537766690830883L;
            int var8 = var3;
            int var9;
            if (this.au * -7409537766690830883L >= this.am * -4478279998810493323L && -7409537766690830883L * this.au < this.am * -4478279998810493323L + (long)(-1700709017 * this.ax)) {
               if (var4 <= 8) {
                  throw new IllegalStateException();
               }

               var9 = (int)((long)(-1700709017 * this.ax) - (-7409537766690830883L * this.au - this.am * -4478279998810493323L));
               if (var9 > var3) {
                  if (var4 <= 8) {
                     return;
                  }

                  var9 = var3;
               }

               System.arraycopy(this.ag, (int)(this.au * -7409537766690830883L - -4478279998810493323L * this.am), var1, var2, var9);
               this.au += 7776694461556800117L * (long)var9;
               var2 += var9;
               var3 -= var9;
            }

            if (var3 > this.ag.length) {
               this.ae.ac(-7409537766690830883L * this.au);

               for(this.ad = 4648986970804689339L * this.au; var3 > 0; var3 -= var9) {
                  if (var4 <= 8) {
                     return;
                  }

                  var9 = this.ae.aq(var1, var2, var3, (byte)0);
                  if (-1 == var9) {
                     if (var4 <= 8) {
                        throw new IllegalStateException();
                     }
                     break;
                  }

                  this.ad += -4739793993026592649L * (long)var9;
                  this.au += 7776694461556800117L * (long)var9;
                  var2 += var9;
               }
            } else if (var3 > 0) {
               if (var4 <= 8) {
                  throw new IllegalStateException();
               }

               this.aq(-897972772);
               var9 = var3;
               if (var3 > -1700709017 * this.ax) {
                  var9 = this.ax * -1700709017;
               }

               System.arraycopy(this.ag, 0, var1, var2, var9);
               var2 += var9;
               var3 -= var9;
               this.au += (long)var9 * 7776694461556800117L;
            }

            if (-1L != this.af * 6390274326456513839L) {
               if (6390274326456513839L * this.af > this.au * -7409537766690830883L && var3 > 0) {
                  if (var4 <= 8) {
                     throw new IllegalStateException();
                  }

                  var9 = (int)(6390274326456513839L * this.af - -7409537766690830883L * this.au) + var2;
                  if (var9 > var2 + var3) {
                     if (var4 <= 8) {
                        throw new IllegalStateException();
                     }

                     var9 = var3 + var2;
                  }

                  while(var2 < var9) {
                     var1[var2++] = 0;
                     --var3;
                     this.au += 7776694461556800117L;
                  }
               }

               long var11;
               long var16;
               label173: {
                  var16 = -1L;
                  var11 = -1L;
                  if (this.af * 6390274326456513839L >= var5) {
                     if (var4 <= 8) {
                        throw new IllegalStateException();
                     }

                     if (6390274326456513839L * this.af < var5 + (long)var8) {
                        if (var4 <= 8) {
                           throw new IllegalStateException();
                        }

                        var16 = this.af * 6390274326456513839L;
                        break label173;
                     }
                  }

                  if (var5 >= this.af * 6390274326456513839L) {
                     if (var4 <= 8) {
                        throw new IllegalStateException();
                     }

                     if (var5 < this.af * 6390274326456513839L + (long)(962373833 * this.at)) {
                        if (var4 <= 8) {
                           throw new IllegalStateException();
                        }

                        var16 = var5;
                     }
                  }
               }

               label167: {
                  if ((long)(this.at * 962373833) + this.af * 6390274326456513839L > var5) {
                     if (var4 <= 8) {
                        throw new IllegalStateException();
                     }

                     if (6390274326456513839L * this.af + (long)(this.at * 962373833) <= var5 + (long)var8) {
                        if (var4 <= 8) {
                           throw new IllegalStateException();
                        }

                        var11 = (long)(this.at * 962373833) + this.af * 6390274326456513839L;
                        break label167;
                     }
                  }

                  if (var5 + (long)var8 > 6390274326456513839L * this.af) {
                     if (var4 <= 8) {
                        throw new IllegalStateException();
                     }

                     if ((long)var8 + var5 <= (long)(this.at * 962373833) + this.af * 6390274326456513839L) {
                        if (var4 <= 8) {
                           throw new IllegalStateException();
                        }

                        var11 = var5 + (long)var8;
                     }
                  }
               }

               if (var16 > -1L) {
                  if (var4 <= 8) {
                     throw new IllegalStateException();
                  }

                  if (var11 > var16) {
                     if (var4 <= 8) {
                        throw new IllegalStateException();
                     }

                     int var13 = (int)(var11 - var16);
                     System.arraycopy(this.aq, (int)(var16 - 6390274326456513839L * this.af), var1, (int)(var16 - var5) + var2, var13);
                     if (var11 > -7409537766690830883L * this.au) {
                        if (var4 <= 8) {
                           throw new IllegalStateException();
                        }

                        var3 = (int)((long)var3 - (var11 - this.au * -7409537766690830883L));
                        this.au = var11 * 7776694461556800117L;
                     }
                  }
               }
            }
         } catch (IOException var14) {
            this.ad = 4739793993026592649L;
            throw var14;
         }

         if (var3 > 0) {
            if (var4 > 8) {
               throw new EOFException();
            }
         }
      } catch (RuntimeException var15) {
         throw vk.ae(var15, "ua.ax(" + ')');
      }
   }

   void aq(int var1) throws IOException {
      try {
         this.ax = 0;
         if (this.ad * -1038774745980389049L != this.au * -7409537766690830883L) {
            if (var1 >= 520048146) {
               throw new IllegalStateException();
            }

            this.ae.ac(this.au * -7409537766690830883L);
            this.ad = 4648986970804689339L * this.au;
         }

         int var3;
         for(this.am = -5844902066986459959L * this.au; -1700709017 * this.ax < this.ag.length; this.ax += -1751937449 * var3) {
            int var2 = this.ag.length - this.ax * -1700709017;
            if (var2 > 200000000) {
               var2 = 200000000;
            }

            var3 = this.ae.aq(this.ag, this.ax * -1700709017, var2, (byte)0);
            if (var3 == -1) {
               break;
            }

            this.ad += (long)var3 * -4739793993026592649L;
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ua.aq(" + ')');
      }
   }

   public void bh(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (-7409537766690830883L * this.au + (long)var3 > 446602842106707619L * this.al) {
            this.al = ((long)var3 + -7409537766690830883L * this.au) * 3378376527307760907L;
         }

         if (6390274326456513839L * this.af != -1L && (this.au * -7409537766690830883L < this.af * 6390274326456513839L || -7409537766690830883L * this.au > (long)(this.at * 962373833) + 6390274326456513839L * this.af)) {
            this.at(-1760814253);
         }

         if (6390274326456513839L * this.af != -1L && this.au * -7409537766690830883L + (long)var3 > (long)this.aq.length + 6390274326456513839L * this.af) {
            int var4 = (int)((long)this.aq.length - (-7409537766690830883L * this.au - this.af * 6390274326456513839L));
            System.arraycopy(var1, var2, this.aq, (int)(this.au * -7409537766690830883L - 6390274326456513839L * this.af), var4);
            this.au += 7776694461556800117L * (long)var4;
            var2 += var4;
            var3 -= var4;
            this.at = -329780871 * this.aq.length;
            this.at(-1760814253);
         }

         if (var3 <= this.aq.length) {
            if (var3 > 0) {
               if (6390274326456513839L * this.af == -1L) {
                  this.af = -6640930313548150093L * this.au;
               }

               System.arraycopy(var1, var2, this.aq, (int)(-7409537766690830883L * this.au - 6390274326456513839L * this.af), var3);
               this.au += 7776694461556800117L * (long)var3;
               if (this.au * -7409537766690830883L - 6390274326456513839L * this.af > (long)(962373833 * this.at)) {
                  this.at = -329780871 * (int)(-7409537766690830883L * this.au - 6390274326456513839L * this.af);
               }

            }
         } else {
            if (-1038774745980389049L * this.ad != this.au * -7409537766690830883L) {
               this.ae.ac(-7409537766690830883L * this.au);
               this.ad = 4648986970804689339L * this.au;
            }

            this.ae.ae(var1, var2, var3, 942855193);
            this.ad += (long)var3 * -4739793993026592649L;
            if (-1038774745980389049L * this.ad > this.ar * 8366871520021484299L) {
               this.ar = this.ad * 1869481321574389813L;
            }

            long var10 = -1L;
            long var6 = -1L;
            if (-7409537766690830883L * this.au >= this.am * -4478279998810493323L && this.au * -7409537766690830883L < (long)(-1700709017 * this.ax) + this.am * -4478279998810493323L) {
               var10 = -7409537766690830883L * this.au;
            } else if (this.am * -4478279998810493323L >= -7409537766690830883L * this.au && -4478279998810493323L * this.am < -7409537766690830883L * this.au + (long)var3) {
               var10 = this.am * -4478279998810493323L;
            }

            if ((long)var3 + -7409537766690830883L * this.au > -4478279998810493323L * this.am && -7409537766690830883L * this.au + (long)var3 <= this.am * -4478279998810493323L + (long)(-1700709017 * this.ax)) {
               var6 = -7409537766690830883L * this.au + (long)var3;
            } else if ((long)(this.ax * -1700709017) + this.am * -4478279998810493323L > -7409537766690830883L * this.au && this.am * -4478279998810493323L + (long)(-1700709017 * this.ax) <= (long)var3 + this.au * -7409537766690830883L) {
               var6 = -4478279998810493323L * this.am + (long)(this.ax * -1700709017);
            }

            if (var10 > -1L && var6 > var10) {
               int var8 = (int)(var6 - var10);
               System.arraycopy(var1, (int)((long)var2 + var10 - -7409537766690830883L * this.au), this.ag, (int)(var10 - this.am * -4478279998810493323L), var8);
            }

            this.au += (long)var3 * 7776694461556800117L;
         }
      } catch (IOException var9) {
         this.ad = 4739793993026592649L;
         throw var9;
      }
   }

   void at(int var1) throws IOException {
      try {
         if (this.af * 6390274326456513839L != -1L) {
            if (var1 != -1760814253) {
               throw new IllegalStateException();
            }

            if (this.af * 6390274326456513839L != -1038774745980389049L * this.ad) {
               this.ae.ac(6390274326456513839L * this.af);
               this.ad = -2486322471004596007L * this.af;
            }

            this.ae.ae(this.aq, 0, this.at * 962373833, 1449309877);
            this.ad += -4612363740843731601L * (long)this.at;
            if (this.ad * -1038774745980389049L > this.ar * 8366871520021484299L) {
               this.ar = 1869481321574389813L * this.ad;
            }

            long var2;
            long var4;
            label79: {
               var2 = -1L;
               var4 = -1L;
               if (this.af * 6390274326456513839L >= -4478279998810493323L * this.am) {
                  if (var1 != -1760814253) {
                     throw new IllegalStateException();
                  }

                  if (6390274326456513839L * this.af < this.am * -4478279998810493323L + (long)(-1700709017 * this.ax)) {
                     var2 = 6390274326456513839L * this.af;
                     break label79;
                  }
               }

               if (this.am * -4478279998810493323L >= 6390274326456513839L * this.af) {
                  if (var1 != -1760814253) {
                     return;
                  }

                  if (-4478279998810493323L * this.am < 6390274326456513839L * this.af + (long)(this.at * 962373833)) {
                     var2 = -4478279998810493323L * this.am;
                  }
               }
            }

            label73: {
               if (6390274326456513839L * this.af + (long)(962373833 * this.at) > this.am * -4478279998810493323L) {
                  if (var1 != -1760814253) {
                     throw new IllegalStateException();
                  }

                  if (this.af * 6390274326456513839L + (long)(962373833 * this.at) <= -4478279998810493323L * this.am + (long)(-1700709017 * this.ax)) {
                     var4 = this.af * 6390274326456513839L + (long)(this.at * 962373833);
                     break label73;
                  }
               }

               if (this.am * -4478279998810493323L + (long)(-1700709017 * this.ax) > this.af * 6390274326456513839L && (long)(this.ax * -1700709017) + this.am * -4478279998810493323L <= 6390274326456513839L * this.af + (long)(this.at * 962373833)) {
                  if (var1 != -1760814253) {
                     throw new IllegalStateException();
                  }

                  var4 = this.am * -4478279998810493323L + (long)(-1700709017 * this.ax);
               }
            }

            if (var2 > -1L) {
               if (var1 != -1760814253) {
                  throw new IllegalStateException();
               }

               if (var4 > var2) {
                  if (var1 != -1760814253) {
                     throw new IllegalStateException();
                  }

                  int var6 = (int)(var4 - var2);
                  System.arraycopy(this.aq, (int)(var2 - 6390274326456513839L * this.af), this.ag, (int)(var2 - -4478279998810493323L * this.am), var6);
               }
            }

            this.af = 2258472368250015281L;
            this.at = 0;
         }

      } catch (RuntimeException var7) {
         throw vk.ae(var7, "ua.at(" + ')');
      }
   }

   public void au() throws IOException {
      this.at(-1760814253);
      this.ae.ag((byte)-126);
   }

   public void ar() throws IOException {
      this.at(-1760814253);
      this.ae.ag((byte)-115);
   }

   public void al(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IOException("");
      } else {
         this.au = 7776694461556800117L * var1;
      }
   }

   public void ad(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IOException("");
      } else {
         this.au = 7776694461556800117L * var1;
      }
   }

   public long ah() {
      return 446602842106707619L * this.al;
   }

   public long ap() {
      return 446602842106707619L * this.al;
   }

   public long ab() {
      return 446602842106707619L * this.al;
   }

   void av() throws IOException {
      this.ax = 0;
      if (this.ad * -1038774745980389049L != this.au * -7409537766690830883L) {
         this.ae.ac(this.au * -7409537766690830883L);
         this.ad = 4648986970804689339L * this.au;
      }

      int var2;
      for(this.am = -5844902066986459959L * this.au; 323308852 * this.ax < this.ag.length; this.ax += 220363807 * var2) {
         int var1 = this.ag.length - this.ax * -1700709017;
         if (var1 > -6149057) {
            var1 = 200000000;
         }

         var2 = this.ae.aq(this.ag, this.ax * -1700709017, var1, (byte)0);
         if (var2 == -1) {
            break;
         }

         this.ad += (long)var2 * -4739793993026592649L;
      }

   }

   public void an(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (-7409537766690830883L * this.au + (long)var3 > 446602842106707619L * this.al) {
            this.al = ((long)var3 + -7409537766690830883L * this.au) * 3378376527307760907L;
         }

         if (6390274326456513839L * this.af != -1L && (this.au * -7409537766690830883L < this.af * 6390274326456513839L || -7409537766690830883L * this.au > (long)(this.at * 962373833) + 6390274326456513839L * this.af)) {
            this.at(-1760814253);
         }

         if (6390274326456513839L * this.af != -1L && this.au * -7409537766690830883L + (long)var3 > (long)this.aq.length + 6390274326456513839L * this.af) {
            int var4 = (int)((long)this.aq.length - (-7409537766690830883L * this.au - this.af * 6390274326456513839L));
            System.arraycopy(var1, var2, this.aq, (int)(this.au * -7409537766690830883L - 6390274326456513839L * this.af), var4);
            this.au += 7776694461556800117L * (long)var4;
            var2 += var4;
            var3 -= var4;
            this.at = -329780871 * this.aq.length;
            this.at(-1760814253);
         }

         if (var3 <= this.aq.length) {
            if (var3 > 0) {
               if (6390274326456513839L * this.af == -1L) {
                  this.af = -6640930313548150093L * this.au;
               }

               System.arraycopy(var1, var2, this.aq, (int)(-7409537766690830883L * this.au - 6390274326456513839L * this.af), var3);
               this.au += 7776694461556800117L * (long)var3;
               if (this.au * -7409537766690830883L - 6390274326456513839L * this.af > (long)(962373833 * this.at)) {
                  this.at = -329780871 * (int)(-7409537766690830883L * this.au - 6390274326456513839L * this.af);
               }

            }
         } else {
            if (-1038774745980389049L * this.ad != this.au * -7409537766690830883L) {
               this.ae.ac(-7409537766690830883L * this.au);
               this.ad = 4648986970804689339L * this.au;
            }

            this.ae.ae(var1, var2, var3, 1922815357);
            this.ad += (long)var3 * -4739793993026592649L;
            if (-1038774745980389049L * this.ad > this.ar * 8366871520021484299L) {
               this.ar = this.ad * 1869481321574389813L;
            }

            long var10 = -1L;
            long var6 = -1L;
            if (-7409537766690830883L * this.au >= this.am * -4478279998810493323L && this.au * -7409537766690830883L < (long)(-1700709017 * this.ax) + this.am * -4478279998810493323L) {
               var10 = -7409537766690830883L * this.au;
            } else if (this.am * -4478279998810493323L >= -7409537766690830883L * this.au && -4478279998810493323L * this.am < -7409537766690830883L * this.au + (long)var3) {
               var10 = this.am * -4478279998810493323L;
            }

            if ((long)var3 + -7409537766690830883L * this.au > -4478279998810493323L * this.am && -7409537766690830883L * this.au + (long)var3 <= this.am * -4478279998810493323L + (long)(-1700709017 * this.ax)) {
               var6 = -7409537766690830883L * this.au + (long)var3;
            } else if ((long)(this.ax * -1700709017) + this.am * -4478279998810493323L > -7409537766690830883L * this.au && this.am * -4478279998810493323L + (long)(-1700709017 * this.ax) <= (long)var3 + this.au * -7409537766690830883L) {
               var6 = -4478279998810493323L * this.am + (long)(this.ax * -1700709017);
            }

            if (var10 > -1L && var6 > var10) {
               int var8 = (int)(var6 - var10);
               System.arraycopy(var1, (int)((long)var2 + var10 - -7409537766690830883L * this.au), this.ag, (int)(var10 - this.am * -4478279998810493323L), var8);
            }

            this.au += (long)var3 * 7776694461556800117L;
         }
      } catch (IOException var9) {
         this.ad = 4739793993026592649L;
         throw var9;
      }
   }

   public void ai(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var3 + var2 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
         }

         if (this.af * 6390274326456513839L != -1L && -7409537766690830883L * this.au >= this.af * 6390274326456513839L && (long)var3 + this.au * -7409537766690830883L <= (long)(962373833 * this.at) + 6390274326456513839L * this.af) {
            System.arraycopy(this.aq, (int)(-7409537766690830883L * this.au - 6390274326456513839L * this.af), var1, var2, var3);
            this.au += 7776694461556800117L * (long)var3;
            return;
         }

         long var4 = this.au * -7409537766690830883L;
         int var7 = var3;
         int var8;
         if (this.au * -7409537766690830883L >= this.am * -4478279998810493323L && -7409537766690830883L * this.au < this.am * -4478279998810493323L + (long)(-1700709017 * this.ax)) {
            var8 = (int)((long)(-1700709017 * this.ax) - (-7409537766690830883L * this.au - this.am * -4478279998810493323L));
            if (var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.ag, (int)(this.au * -7409537766690830883L - -4478279998810493323L * this.am), var1, var2, var8);
            this.au += 7776694461556800117L * (long)var8;
            var2 += var8;
            var3 -= var8;
         }

         if (var3 > this.ag.length) {
            this.ae.ac(-7409537766690830883L * this.au);

            for(this.ad = 4648986970804689339L * this.au; var3 > 0; var3 -= var8) {
               var8 = this.ae.aq(var1, var2, var3, (byte)0);
               if (-1 == var8) {
                  break;
               }

               this.ad += -4739793993026592649L * (long)var8;
               this.au += 7776694461556800117L * (long)var8;
               var2 += var8;
            }
         } else if (var3 > 0) {
            this.aq(-457985101);
            var8 = var3;
            if (var3 > -1700709017 * this.ax) {
               var8 = this.ax * -1700709017;
            }

            System.arraycopy(this.ag, 0, var1, var2, var8);
            var2 += var8;
            var3 -= var8;
            this.au += (long)var8 * 7776694461556800117L;
         }

         if (-1L != this.af * 6390274326456513839L) {
            if (6390274326456513839L * this.af > this.au * -7409537766690830883L && var3 > 0) {
               var8 = (int)(6390274326456513839L * this.af - -7409537766690830883L * this.au) + var2;
               if (var8 > var2 + var3) {
                  var8 = var3 + var2;
               }

               while(var2 < var8) {
                  var1[var2++] = 0;
                  --var3;
                  this.au += 7776694461556800117L;
               }
            }

            long var14 = -1L;
            long var10 = -1L;
            if (this.af * 6390274326456513839L >= var4 && 6390274326456513839L * this.af < var4 + (long)var7) {
               var14 = this.af * 6390274326456513839L;
            } else if (var4 >= this.af * 6390274326456513839L && var4 < this.af * 6390274326456513839L + (long)(962373833 * this.at)) {
               var14 = var4;
            }

            if ((long)(this.at * 962373833) + this.af * 6390274326456513839L > var4 && 6390274326456513839L * this.af + (long)(this.at * 962373833) <= var4 + (long)var7) {
               var10 = (long)(this.at * 962373833) + this.af * 6390274326456513839L;
            } else if (var4 + (long)var7 > 6390274326456513839L * this.af && (long)var7 + var4 <= (long)(this.at * 962373833) + this.af * 6390274326456513839L) {
               var10 = var4 + (long)var7;
            }

            if (var14 > -1L && var10 > var14) {
               int var12 = (int)(var10 - var14);
               System.arraycopy(this.aq, (int)(var14 - 6390274326456513839L * this.af), var1, (int)(var14 - var4) + var2, var12);
               if (var10 > -7409537766690830883L * this.au) {
                  var3 = (int)((long)var3 - (var10 - this.au * -7409537766690830883L));
                  this.au = var10 * 7776694461556800117L;
               }
            }
         }
      } catch (IOException var13) {
         this.ad = 4739793993026592649L;
         throw var13;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   public void ao(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var3 + var2 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
         }

         if (this.af * 6390274326456513839L != -1L && -7409537766690830883L * this.au >= this.af * 6390274326456513839L && (long)var3 + this.au * -7409537766690830883L <= (long)(-1800869915 * this.at) + 6390274326456513839L * this.af) {
            System.arraycopy(this.aq, (int)(-7409537766690830883L * this.au - 6390274326456513839L * this.af), var1, var2, var3);
            this.au += 7776694461556800117L * (long)var3;
            return;
         }

         long var4 = this.au * -7409537766690830883L;
         int var7 = var3;
         int var8;
         if (this.au * -7409537766690830883L >= this.am * -4478279998810493323L && -7409537766690830883L * this.au < this.am * -4478279998810493323L + (long)(-1700709017 * this.ax)) {
            var8 = (int)((long)(-1700709017 * this.ax) - (-7409537766690830883L * this.au - this.am * -4478279998810493323L));
            if (var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.ag, (int)(this.au * -7409537766690830883L - -4478279998810493323L * this.am), var1, var2, var8);
            this.au += 7776694461556800117L * (long)var8;
            var2 += var8;
            var3 -= var8;
         }

         if (var3 > this.ag.length) {
            this.ae.ac(-7409537766690830883L * this.au);

            for(this.ad = 4648986970804689339L * this.au; var3 > 0; var3 -= var8) {
               var8 = this.ae.aq(var1, var2, var3, (byte)0);
               if (-1 == var8) {
                  break;
               }

               this.ad += -4739793993026592649L * (long)var8;
               this.au += 7776694461556800117L * (long)var8;
               var2 += var8;
            }
         } else if (var3 > 0) {
            this.aq(-697043490);
            var8 = var3;
            if (var3 > -1700709017 * this.ax) {
               var8 = this.ax * -941415827;
            }

            System.arraycopy(this.ag, 0, var1, var2, var8);
            var2 += var8;
            var3 -= var8;
            this.au += (long)var8 * 7776694461556800117L;
         }

         if (-1L != this.af * 6390274326456513839L) {
            if (6390274326456513839L * this.af > this.au * -7409537766690830883L && var3 > 0) {
               var8 = (int)(6390274326456513839L * this.af - -7409537766690830883L * this.au) + var2;
               if (var8 > var2 + var3) {
                  var8 = var3 + var2;
               }

               while(var2 < var8) {
                  var1[var2++] = 0;
                  --var3;
                  this.au += 7776694461556800117L;
               }
            }

            long var14 = -1L;
            long var10 = -1L;
            if (this.af * 6390274326456513839L >= var4 && 6390274326456513839L * this.af < var4 + (long)var7) {
               var14 = this.af * 6390274326456513839L;
            } else if (var4 >= this.af * 6390274326456513839L && var4 < this.af * 6390274326456513839L + (long)(1028346530 * this.at)) {
               var14 = var4;
            }

            if ((long)(this.at * 962373833) + this.af * 6390274326456513839L > var4 && 6390274326456513839L * this.af + (long)(this.at * -943014916) <= var4 + (long)var7) {
               var10 = (long)(this.at * -608296729) + this.af * 6390274326456513839L;
            } else if (var4 + (long)var7 > 6390274326456513839L * this.af && (long)var7 + var4 <= (long)(this.at * -485722317) + this.af * 6390274326456513839L) {
               var10 = var4 + (long)var7;
            }

            if (var14 > -1L && var10 > var14) {
               int var12 = (int)(var10 - var14);
               System.arraycopy(this.aq, (int)(var14 - 6390274326456513839L * this.af), var1, (int)(var14 - var4) + var2, var12);
               if (var10 > -7409537766690830883L * this.au) {
                  var3 = (int)((long)var3 - (var10 - this.au * -7409537766690830883L));
                  this.au = var10 * 7776694461556800117L;
               }
            }
         }
      } catch (IOException var13) {
         this.ad = 4739793993026592649L;
         throw var13;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   public void as(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var3 + var2 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
         }

         if (this.af * 6390274326456513839L != -1L && -7409537766690830883L * this.au >= this.af * 6390274326456513839L && (long)var3 + this.au * -7409537766690830883L <= (long)(962373833 * this.at) + 6390274326456513839L * this.af) {
            System.arraycopy(this.aq, (int)(-7409537766690830883L * this.au - 6390274326456513839L * this.af), var1, var2, var3);
            this.au += 7776694461556800117L * (long)var3;
            return;
         }

         long var4 = this.au * -7409537766690830883L;
         int var7 = var3;
         int var8;
         if (this.au * -7409537766690830883L >= this.am * -4478279998810493323L && -7409537766690830883L * this.au < this.am * -4478279998810493323L + (long)(-1700709017 * this.ax)) {
            var8 = (int)((long)(-1700709017 * this.ax) - (-7409537766690830883L * this.au - this.am * -4478279998810493323L));
            if (var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.ag, (int)(this.au * -7409537766690830883L - -4478279998810493323L * this.am), var1, var2, var8);
            this.au += 7776694461556800117L * (long)var8;
            var2 += var8;
            var3 -= var8;
         }

         if (var3 > this.ag.length) {
            this.ae.ac(-7409537766690830883L * this.au);

            for(this.ad = 4648986970804689339L * this.au; var3 > 0; var3 -= var8) {
               var8 = this.ae.aq(var1, var2, var3, (byte)0);
               if (-1 == var8) {
                  break;
               }

               this.ad += -4739793993026592649L * (long)var8;
               this.au += 7776694461556800117L * (long)var8;
               var2 += var8;
            }
         } else if (var3 > 0) {
            this.aq(371069911);
            var8 = var3;
            if (var3 > -1700709017 * this.ax) {
               var8 = this.ax * -1700709017;
            }

            System.arraycopy(this.ag, 0, var1, var2, var8);
            var2 += var8;
            var3 -= var8;
            this.au += (long)var8 * 7776694461556800117L;
         }

         if (-1L != this.af * 6390274326456513839L) {
            if (6390274326456513839L * this.af > this.au * -7409537766690830883L && var3 > 0) {
               var8 = (int)(6390274326456513839L * this.af - -7409537766690830883L * this.au) + var2;
               if (var8 > var2 + var3) {
                  var8 = var3 + var2;
               }

               while(var2 < var8) {
                  var1[var2++] = 0;
                  --var3;
                  this.au += 7776694461556800117L;
               }
            }

            long var14 = -1L;
            long var10 = -1L;
            if (this.af * 6390274326456513839L >= var4 && 6390274326456513839L * this.af < var4 + (long)var7) {
               var14 = this.af * 6390274326456513839L;
            } else if (var4 >= this.af * 6390274326456513839L && var4 < this.af * 6390274326456513839L + (long)(962373833 * this.at)) {
               var14 = var4;
            }

            if ((long)(this.at * 962373833) + this.af * 6390274326456513839L > var4 && 6390274326456513839L * this.af + (long)(this.at * 962373833) <= var4 + (long)var7) {
               var10 = (long)(this.at * 962373833) + this.af * 6390274326456513839L;
            } else if (var4 + (long)var7 > 6390274326456513839L * this.af && (long)var7 + var4 <= (long)(this.at * 962373833) + this.af * 6390274326456513839L) {
               var10 = var4 + (long)var7;
            }

            if (var14 > -1L && var10 > var14) {
               int var12 = (int)(var10 - var14);
               System.arraycopy(this.aq, (int)(var14 - 6390274326456513839L * this.af), var1, (int)(var14 - var4) + var2, var12);
               if (var10 > -7409537766690830883L * this.au) {
                  var3 = (int)((long)var3 - (var10 - this.au * -7409537766690830883L));
                  this.au = var10 * 7776694461556800117L;
               }
            }
         }
      } catch (IOException var13) {
         this.ad = 4739793993026592649L;
         throw var13;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   public void af(byte[] var1, int var2, int var3, byte var4) throws IOException {
      try {
         try {
            if (-7409537766690830883L * this.au + (long)var3 > 446602842106707619L * this.al) {
               if (var4 != 1) {
                  throw new IllegalStateException();
               }

               this.al = ((long)var3 + -7409537766690830883L * this.au) * 3378376527307760907L;
            }

            if (6390274326456513839L * this.af != -1L) {
               label168: {
                  if (var4 != 1) {
                     throw new IllegalStateException();
                  }

                  if (this.au * -7409537766690830883L >= this.af * 6390274326456513839L) {
                     if (var4 != 1) {
                        return;
                     }

                     if (-7409537766690830883L * this.au <= (long)(this.at * 962373833) + 6390274326456513839L * this.af) {
                        break label168;
                     }

                     if (var4 != 1) {
                        throw new IllegalStateException();
                     }
                  }

                  this.at(-1760814253);
               }
            }

            if (6390274326456513839L * this.af != -1L) {
               if (var4 != 1) {
                  throw new IllegalStateException();
               }

               if (this.au * -7409537766690830883L + (long)var3 > (long)this.aq.length + 6390274326456513839L * this.af) {
                  if (var4 != 1) {
                     throw new IllegalStateException();
                  }

                  int var5 = (int)((long)this.aq.length - (-7409537766690830883L * this.au - this.af * 6390274326456513839L));
                  System.arraycopy(var1, var2, this.aq, (int)(this.au * -7409537766690830883L - 6390274326456513839L * this.af), var5);
                  this.au += 7776694461556800117L * (long)var5;
                  var2 += var5;
                  var3 -= var5;
                  this.at = -329780871 * this.aq.length;
                  this.at(-1760814253);
               }
            }

            if (var3 > this.aq.length) {
               if (var4 == 1) {
                  if (-1038774745980389049L * this.ad != this.au * -7409537766690830883L) {
                     if (var4 != 1) {
                        throw new IllegalStateException();
                     }

                     this.ae.ac(-7409537766690830883L * this.au);
                     this.ad = 4648986970804689339L * this.au;
                  }

                  this.ae.ae(var1, var2, var3, 77429827);
                  this.ad += (long)var3 * -4739793993026592649L;
                  if (-1038774745980389049L * this.ad > this.ar * 8366871520021484299L) {
                     if (var4 != 1) {
                        return;
                     }

                     this.ar = this.ad * 1869481321574389813L;
                  }

                  long var7;
                  long var12;
                  label146: {
                     var12 = -1L;
                     var7 = -1L;
                     if (-7409537766690830883L * this.au >= this.am * -4478279998810493323L) {
                        if (var4 != 1) {
                           throw new IllegalStateException();
                        }

                        if (this.au * -7409537766690830883L < (long)(-1700709017 * this.ax) + this.am * -4478279998810493323L) {
                           if (var4 != 1) {
                              throw new IllegalStateException();
                           }

                           var12 = -7409537766690830883L * this.au;
                           break label146;
                        }
                     }

                     if (this.am * -4478279998810493323L >= -7409537766690830883L * this.au) {
                        if (var4 != 1) {
                           throw new IllegalStateException();
                        }

                        if (-4478279998810493323L * this.am < -7409537766690830883L * this.au + (long)var3) {
                           var12 = this.am * -4478279998810493323L;
                        }
                     }
                  }

                  label140: {
                     if ((long)var3 + -7409537766690830883L * this.au > -4478279998810493323L * this.am) {
                        if (var4 != 1) {
                           throw new IllegalStateException();
                        }

                        if (-7409537766690830883L * this.au + (long)var3 <= this.am * -4478279998810493323L + (long)(-1700709017 * this.ax)) {
                           if (var4 != 1) {
                              throw new IllegalStateException();
                           }

                           var7 = -7409537766690830883L * this.au + (long)var3;
                           break label140;
                        }
                     }

                     if ((long)(this.ax * -1700709017) + this.am * -4478279998810493323L > -7409537766690830883L * this.au && this.am * -4478279998810493323L + (long)(-1700709017 * this.ax) <= (long)var3 + this.au * -7409537766690830883L) {
                        if (var4 != 1) {
                           return;
                        }

                        var7 = -4478279998810493323L * this.am + (long)(this.ax * -1700709017);
                     }
                  }

                  if (var12 > -1L) {
                     if (var4 != 1) {
                        throw new IllegalStateException();
                     }

                     if (var7 > var12) {
                        if (var4 != 1) {
                           return;
                        }

                        int var9 = (int)(var7 - var12);
                        System.arraycopy(var1, (int)((long)var2 + var12 - -7409537766690830883L * this.au), this.ag, (int)(var12 - this.am * -4478279998810493323L), var9);
                     }
                  }

                  this.au += (long)var3 * 7776694461556800117L;
               }
            } else if (var3 > 0) {
               if (var4 != 1) {
                  throw new IllegalStateException();
               } else {
                  if (6390274326456513839L * this.af == -1L) {
                     if (var4 != 1) {
                        return;
                     }

                     this.af = -6640930313548150093L * this.au;
                  }

                  System.arraycopy(var1, var2, this.aq, (int)(-7409537766690830883L * this.au - 6390274326456513839L * this.af), var3);
                  this.au += 7776694461556800117L * (long)var3;
                  if (this.au * -7409537766690830883L - 6390274326456513839L * this.af > (long)(962373833 * this.at)) {
                     this.at = -329780871 * (int)(-7409537766690830883L * this.au - 6390274326456513839L * this.af);
                  }

               }
            }
         } catch (IOException var10) {
            this.ad = 4739793993026592649L;
            throw var10;
         }
      } catch (RuntimeException var11) {
         throw vk.ae(var11, "ua.af(" + ')');
      }
   }

   void aj() throws IOException {
      this.ax = 0;
      if (this.ad * -1038774745980389049L != this.au * -7409537766690830883L) {
         this.ae.ac(this.au * -7409537766690830883L);
         this.ad = 4648986970804689339L * this.au;
      }

      int var2;
      for(this.am = -5844902066986459959L * this.au; -1700709017 * this.ax < this.ag.length; this.ax += -1751937449 * var2) {
         int var1 = this.ag.length - this.ax * -1700709017;
         if (var1 > 200000000) {
            var1 = 200000000;
         }

         var2 = this.ae.aq(this.ag, this.ax * -1700709017, var1, (byte)0);
         if (var2 == -1) {
            break;
         }

         this.ad += (long)var2 * -4739793993026592649L;
      }

   }

   void bx() throws IOException {
      if (this.af * 6390274326456513839L != -1L) {
         if (this.af * 6390274326456513839L != -1038774745980389049L * this.ad) {
            this.ae.ac(6390274326456513839L * this.af);
            this.ad = -2486322471004596007L * this.af;
         }

         this.ae.ae(this.aq, 0, this.at * 962373833, 822645996);
         this.ad += -4612363740843731601L * (long)this.at;
         if (this.ad * -1038774745980389049L > this.ar * 8366871520021484299L) {
            this.ar = 1869481321574389813L * this.ad;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (this.af * 6390274326456513839L >= -4478279998810493323L * this.am && 6390274326456513839L * this.af < this.am * -4478279998810493323L + (long)(-1700709017 * this.ax)) {
            var1 = 6390274326456513839L * this.af;
         } else if (this.am * -4478279998810493323L >= 6390274326456513839L * this.af && -4478279998810493323L * this.am < 6390274326456513839L * this.af + (long)(this.at * 962373833)) {
            var1 = -4478279998810493323L * this.am;
         }

         if (6390274326456513839L * this.af + (long)(962373833 * this.at) > this.am * -4478279998810493323L && this.af * 6390274326456513839L + (long)(962373833 * this.at) <= -4478279998810493323L * this.am + (long)(-1700709017 * this.ax)) {
            var3 = this.af * 6390274326456513839L + (long)(this.at * 962373833);
         } else if (this.am * -4478279998810493323L + (long)(-1700709017 * this.ax) > this.af * 6390274326456513839L && (long)(this.ax * -1700709017) + this.am * -4478279998810493323L <= 6390274326456513839L * this.af + (long)(this.at * 962373833)) {
            var3 = this.am * -4478279998810493323L + (long)(-1700709017 * this.ax);
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.aq, (int)(var1 - 6390274326456513839L * this.af), this.ag, (int)(var1 - -4478279998810493323L * this.am), var5);
         }

         this.af = 2258472368250015281L;
         this.at = 0;
      }

   }

   void aw() throws IOException {
      this.ax = 0;
      if (this.ad * -1038774745980389049L != this.au * -7409537766690830883L) {
         this.ae.ac(this.au * -7409537766690830883L);
         this.ad = 4648986970804689339L * this.au;
      }

      int var2;
      for(this.am = -5844902066986459959L * this.au; -1700709017 * this.ax < this.ag.length; this.ax += -1751937449 * var2) {
         int var1 = this.ag.length - this.ax * -1700709017;
         if (var1 > 200000000) {
            var1 = 200000000;
         }

         var2 = this.ae.aq(this.ag, this.ax * -1700709017, var1, (byte)0);
         if (var2 == -1) {
            break;
         }

         this.ad += (long)var2 * -4739793993026592649L;
      }

   }

   public void ac(byte var1) throws IOException {
      try {
         this.at(-1760814253);
         this.ae.ag((byte)11);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ua.ac(" + ')');
      }
   }

   public void aa(byte[] var1) throws IOException {
      this.ax(var1, 0, var1.length, (byte)96);
   }

   public void ay(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var3 + var2 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var2 + var3 - var1.length);
         }

         if (this.af * 6390274326456513839L != -1L && -7409537766690830883L * this.au >= this.af * 6390274326456513839L && (long)var3 + this.au * -7409537766690830883L <= (long)(-789705188 * this.at) + 6390274326456513839L * this.af) {
            System.arraycopy(this.aq, (int)(-7409537766690830883L * this.au - 6390274326456513839L * this.af), var1, var2, var3);
            this.au += 7776694461556800117L * (long)var3;
            return;
         }

         long var4 = this.au * -7409537766690830883L;
         int var7 = var3;
         int var8;
         if (this.au * -7409537766690830883L >= this.am * -4478279998810493323L && -7409537766690830883L * this.au < this.am * -4478279998810493323L + (long)(-1700709017 * this.ax)) {
            var8 = (int)((long)(1260725202 * this.ax) - (-7409537766690830883L * this.au - this.am * -4478279998810493323L));
            if (var8 > var3) {
               var8 = var3;
            }

            System.arraycopy(this.ag, (int)(this.au * -7409537766690830883L - -4478279998810493323L * this.am), var1, var2, var8);
            this.au += 7776694461556800117L * (long)var8;
            var2 += var8;
            var3 -= var8;
         }

         if (var3 > this.ag.length) {
            this.ae.ac(-7409537766690830883L * this.au);

            for(this.ad = 4648986970804689339L * this.au; var3 > 0; var3 -= var8) {
               var8 = this.ae.aq(var1, var2, var3, (byte)0);
               if (-1 == var8) {
                  break;
               }

               this.ad += -4739793993026592649L * (long)var8;
               this.au += 7776694461556800117L * (long)var8;
               var2 += var8;
            }
         } else if (var3 > 0) {
            this.aq(-423958806);
            var8 = var3;
            if (var3 > -1700709017 * this.ax) {
               var8 = this.ax * -1646014144;
            }

            System.arraycopy(this.ag, 0, var1, var2, var8);
            var2 += var8;
            var3 -= var8;
            this.au += (long)var8 * 7776694461556800117L;
         }

         if (-1L != this.af * 6390274326456513839L) {
            if (6390274326456513839L * this.af > this.au * -7409537766690830883L && var3 > 0) {
               var8 = (int)(6390274326456513839L * this.af - -7409537766690830883L * this.au) + var2;
               if (var8 > var2 + var3) {
                  var8 = var3 + var2;
               }

               while(var2 < var8) {
                  var1[var2++] = 0;
                  --var3;
                  this.au += 7776694461556800117L;
               }
            }

            long var14 = -1L;
            long var10 = -1L;
            if (this.af * 6390274326456513839L >= var4 && 6390274326456513839L * this.af < var4 + (long)var7) {
               var14 = this.af * 6390274326456513839L;
            } else if (var4 >= this.af * 6390274326456513839L && var4 < this.af * 6390274326456513839L + (long)(962373833 * this.at)) {
               var14 = var4;
            }

            if ((long)(this.at * 1351116797) + this.af * 6390274326456513839L > var4 && 6390274326456513839L * this.af + (long)(this.at * -1292999116) <= var4 + (long)var7) {
               var10 = (long)(this.at * -697242343) + this.af * 6390274326456513839L;
            } else if (var4 + (long)var7 > 6390274326456513839L * this.af && (long)var7 + var4 <= (long)(this.at * 962373833) + this.af * 6390274326456513839L) {
               var10 = var4 + (long)var7;
            }

            if (var14 > -1L && var10 > var14) {
               int var12 = (int)(var10 - var14);
               System.arraycopy(this.aq, (int)(var14 - 6390274326456513839L * this.af), var1, (int)(var14 - var4) + var2, var12);
               if (var10 > -7409537766690830883L * this.au) {
                  var3 = (int)((long)var3 - (var10 - this.au * -7409537766690830883L));
                  this.au = var10 * 7776694461556800117L;
               }
            }
         }
      } catch (IOException var13) {
         this.ad = 4739793993026592649L;
         throw var13;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   void bm() throws IOException {
      if (this.af * 6390274326456513839L != -1L) {
         if (this.af * 6390274326456513839L != -1038774745980389049L * this.ad) {
            this.ae.ac(6390274326456513839L * this.af);
            this.ad = -2486322471004596007L * this.af;
         }

         this.ae.ae(this.aq, 0, this.at * 962373833, -249934364);
         this.ad += -4612363740843731601L * (long)this.at;
         if (this.ad * -1038774745980389049L > this.ar * 8366871520021484299L) {
            this.ar = 1869481321574389813L * this.ad;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (this.af * 6390274326456513839L >= -4478279998810493323L * this.am && 6390274326456513839L * this.af < this.am * -4478279998810493323L + (long)(-1700709017 * this.ax)) {
            var1 = 6390274326456513839L * this.af;
         } else if (this.am * -4478279998810493323L >= 6390274326456513839L * this.af && -4478279998810493323L * this.am < 6390274326456513839L * this.af + (long)(this.at * 962373833)) {
            var1 = -4478279998810493323L * this.am;
         }

         if (6390274326456513839L * this.af + (long)(962373833 * this.at) > this.am * -4478279998810493323L && this.af * 6390274326456513839L + (long)(962373833 * this.at) <= -4478279998810493323L * this.am + (long)(-1700709017 * this.ax)) {
            var3 = this.af * 6390274326456513839L + (long)(this.at * 962373833);
         } else if (this.am * -4478279998810493323L + (long)(-1700709017 * this.ax) > this.af * 6390274326456513839L && (long)(this.ax * -1700709017) + this.am * -4478279998810493323L <= 6390274326456513839L * this.af + (long)(this.at * 962373833)) {
            var3 = this.am * -4478279998810493323L + (long)(-1700709017 * this.ax);
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.aq, (int)(var1 - 6390274326456513839L * this.af), this.ag, (int)(var1 - -4478279998810493323L * this.am), var5);
         }

         this.af = 2258472368250015281L;
         this.at = 0;
      }

   }

   void bd() throws IOException {
      if (this.af * 6390274326456513839L != -1L) {
         if (this.af * 6390274326456513839L != -1038774745980389049L * this.ad) {
            this.ae.ac(6390274326456513839L * this.af);
            this.ad = -2486322471004596007L * this.af;
         }

         this.ae.ae(this.aq, 0, this.at * 962373833, 1595115664);
         this.ad += -4612363740843731601L * (long)this.at;
         if (this.ad * -1038774745980389049L > this.ar * 8366871520021484299L) {
            this.ar = 1869481321574389813L * this.ad;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (this.af * 6390274326456513839L >= -4478279998810493323L * this.am && 6390274326456513839L * this.af < this.am * -4478279998810493323L + (long)(-1700709017 * this.ax)) {
            var1 = 6390274326456513839L * this.af;
         } else if (this.am * -4478279998810493323L >= 6390274326456513839L * this.af && -4478279998810493323L * this.am < 6390274326456513839L * this.af + (long)(this.at * -258696714)) {
            var1 = -4478279998810493323L * this.am;
         }

         if (6390274326456513839L * this.af + (long)(1722480522 * this.at) > this.am * -4478279998810493323L && this.af * 6390274326456513839L + (long)(974173387 * this.at) <= -4478279998810493323L * this.am + (long)(1086710565 * this.ax)) {
            var3 = this.af * 6390274326456513839L + (long)(this.at * -407599616);
         } else if (this.am * -4478279998810493323L + (long)(-1700709017 * this.ax) > this.af * 6390274326456513839L && (long)(this.ax * -1700709017) + this.am * -4478279998810493323L <= 6390274326456513839L * this.af + (long)(this.at * 962373833)) {
            var3 = this.am * -4478279998810493323L + (long)(-1505131062 * this.ax);
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.aq, (int)(var1 - 6390274326456513839L * this.af), this.ag, (int)(var1 - -4478279998810493323L * this.am), var5);
         }

         this.af = 2258472368250015281L;
         this.at = 0;
      }

   }

   public void ak(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (-7409537766690830883L * this.au + (long)var3 > 446602842106707619L * this.al) {
            this.al = ((long)var3 + -7409537766690830883L * this.au) * 3378376527307760907L;
         }

         if (6390274326456513839L * this.af != -1L && (this.au * -7409537766690830883L < this.af * 6390274326456513839L || -7409537766690830883L * this.au > (long)(this.at * 962373833) + 6390274326456513839L * this.af)) {
            this.at(-1760814253);
         }

         if (6390274326456513839L * this.af != -1L && this.au * -7409537766690830883L + (long)var3 > (long)this.aq.length + 6390274326456513839L * this.af) {
            int var4 = (int)((long)this.aq.length - (-7409537766690830883L * this.au - this.af * 6390274326456513839L));
            System.arraycopy(var1, var2, this.aq, (int)(this.au * -7409537766690830883L - 6390274326456513839L * this.af), var4);
            this.au += 7776694461556800117L * (long)var4;
            var2 += var4;
            var3 -= var4;
            this.at = -329780871 * this.aq.length;
            this.at(-1760814253);
         }

         if (var3 <= this.aq.length) {
            if (var3 > 0) {
               if (6390274326456513839L * this.af == -1L) {
                  this.af = -6640930313548150093L * this.au;
               }

               System.arraycopy(var1, var2, this.aq, (int)(-7409537766690830883L * this.au - 6390274326456513839L * this.af), var3);
               this.au += 7776694461556800117L * (long)var3;
               if (this.au * -7409537766690830883L - 6390274326456513839L * this.af > (long)(962373833 * this.at)) {
                  this.at = -329780871 * (int)(-7409537766690830883L * this.au - 6390274326456513839L * this.af);
               }

            }
         } else {
            if (-1038774745980389049L * this.ad != this.au * -7409537766690830883L) {
               this.ae.ac(-7409537766690830883L * this.au);
               this.ad = 4648986970804689339L * this.au;
            }

            this.ae.ae(var1, var2, var3, -26844379);
            this.ad += (long)var3 * -4739793993026592649L;
            if (-1038774745980389049L * this.ad > this.ar * 8366871520021484299L) {
               this.ar = this.ad * 1869481321574389813L;
            }

            long var10 = -1L;
            long var6 = -1L;
            if (-7409537766690830883L * this.au >= this.am * -4478279998810493323L && this.au * -7409537766690830883L < (long)(-1700709017 * this.ax) + this.am * -4478279998810493323L) {
               var10 = -7409537766690830883L * this.au;
            } else if (this.am * -4478279998810493323L >= -7409537766690830883L * this.au && -4478279998810493323L * this.am < -7409537766690830883L * this.au + (long)var3) {
               var10 = this.am * -4478279998810493323L;
            }

            if ((long)var3 + -7409537766690830883L * this.au > -4478279998810493323L * this.am && -7409537766690830883L * this.au + (long)var3 <= this.am * -4478279998810493323L + (long)(-1700709017 * this.ax)) {
               var6 = -7409537766690830883L * this.au + (long)var3;
            } else if ((long)(this.ax * -1700709017) + this.am * -4478279998810493323L > -7409537766690830883L * this.au && this.am * -4478279998810493323L + (long)(-1700709017 * this.ax) <= (long)var3 + this.au * -7409537766690830883L) {
               var6 = -4478279998810493323L * this.am + (long)(this.ax * -1700709017);
            }

            if (var10 > -1L && var6 > var10) {
               int var8 = (int)(var6 - var10);
               System.arraycopy(var1, (int)((long)var2 + var10 - -7409537766690830883L * this.au), this.ag, (int)(var10 - this.am * -4478279998810493323L), var8);
            }

            this.au += (long)var3 * 7776694461556800117L;
         }
      } catch (IOException var9) {
         this.ad = 4739793993026592649L;
         throw var9;
      }
   }

   void bf() throws IOException {
      if (this.af * 6390274326456513839L != -1L) {
         if (this.af * 6390274326456513839L != -1038774745980389049L * this.ad) {
            this.ae.ac(6390274326456513839L * this.af);
            this.ad = -2486322471004596007L * this.af;
         }

         this.ae.ae(this.aq, 0, this.at * 432418993, 1780281097);
         this.ad += -4612363740843731601L * (long)this.at;
         if (this.ad * -1038774745980389049L > this.ar * 8366871520021484299L) {
            this.ar = 1869481321574389813L * this.ad;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (this.af * 6390274326456513839L >= -4478279998810493323L * this.am && 6390274326456513839L * this.af < this.am * -4478279998810493323L + (long)(-767021397 * this.ax)) {
            var1 = 6390274326456513839L * this.af;
         } else if (this.am * -4478279998810493323L >= 6390274326456513839L * this.af && -4478279998810493323L * this.am < 6390274326456513839L * this.af + (long)(this.at * 1831576581)) {
            var1 = -4478279998810493323L * this.am;
         }

         if (6390274326456513839L * this.af + (long)(-420304351 * this.at) > this.am * -4478279998810493323L && this.af * 6390274326456513839L + (long)(962373833 * this.at) <= -4478279998810493323L * this.am + (long)(-1700709017 * this.ax)) {
            var3 = this.af * 6390274326456513839L + (long)(this.at * 962373833);
         } else if (this.am * -4478279998810493323L + (long)(-1700709017 * this.ax) > this.af * 6390274326456513839L && (long)(this.ax * -1700709017) + this.am * -4478279998810493323L <= 6390274326456513839L * this.af + (long)(this.at * 603901844)) {
            var3 = this.am * -4478279998810493323L + (long)(1329022526 * this.ax);
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.aq, (int)(var1 - 6390274326456513839L * this.af), this.ag, (int)(var1 - -4478279998810493323L * this.am), var5);
         }

         this.af = 2258472368250015281L;
         this.at = 0;
      }

   }

   public void am(byte[] var1, int var2) throws IOException {
      try {
         this.ax(var1, 0, var1.length, (byte)32);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ua.am(" + ')');
      }
   }
}
