public class cq {
   int[] ay;
   int aw;
   int[] ak;
   int[] aj;
   float[][] ai;
   int ap;

   void au() {
      int[] var1 = new int[this.aw];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.aw; ++var3) {
         var4 = this.ak[var3];
         if (var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var9;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var9 = var2[var8];
                  if (var9 != var6) {
                     break;
                  }

                  var10 = 1 << 32 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var9 = var2[var8];
               if (var9 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.ay = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.aw; ++var3) {
         var4 = this.ak[var3];
         if (var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if ((var5 & var8) != 0) {
                  if (this.ay[var6] == 0) {
                     this.ay[var6] = var11;
                  }

                  var6 = this.ay[var6];
               } else {
                  ++var6;
               }

               if (var6 >= this.ay.length) {
                  int[] var12 = new int[this.ay.length * 2];

                  for(var10 = 0; var10 < this.ay.length; ++var10) {
                     var12[var10] = this.ay[var10];
                  }

                  this.ay = var12;
               }

               var8 >>>= 1;
            }

            this.ay[var6] = ~var3;
            if (var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   cq() {
      cp var1 = cd.as;
      var1.ap(24, (byte)60);
      this.ap = var1.ap(16, (byte)43);
      this.aw = var1.ap(24, (byte)102);
      this.ak = new int[this.aw];
      boolean var2 = var1.aw(1363520411) != 0;
      int var3;
      int var4;
      int var6;
      if (var2) {
         var3 = 0;

         for(var4 = var1.ap(5, (byte)-11) + 1; var3 < this.aw; ++var4) {
            int var5 = var1.ap(cg.as(this.aw - var3, 107834954), (byte)-34);

            for(var6 = 0; var6 < var5; ++var6) {
               this.ak[var3++] = var4;
            }
         }
      } else {
         boolean var15 = var1.aw(-989261761) != 0;

         for(var4 = 0; var4 < this.aw; ++var4) {
            if (var15 && var1.aw(882258603) == 0) {
               this.ak[var4] = 0;
            } else {
               this.ak[var4] = var1.ap(5, (byte)-49) + 1;
            }
         }
      }

      this.aw();
      var3 = var1.ap(4, (byte)40);
      if (var3 > 0) {
         float var16 = cd.ap(var1.ap(32, (byte)7));
         float var17 = cd.ap(var1.ap(32, (byte)80));
         var6 = var1.ap(4, (byte)-38) + 1;
         boolean var7 = var1.aw(-1252062625) != 0;
         int var8;
         if (var3 == 1) {
            var8 = ap(this.aw, this.ap);
         } else {
            var8 = this.aw * this.ap;
         }

         this.aj = new int[var8];

         int var9;
         for(var9 = 0; var9 < var8; ++var9) {
            this.aj[var9] = var1.ap(var6, (byte)-76);
         }

         this.ai = new float[this.aw][this.ap];
         float var10;
         int var11;
         int var12;
         if (var3 == 1) {
            for(var9 = 0; var9 < this.aw; ++var9) {
               var10 = 0.0F;
               var11 = 1;

               for(var12 = 0; var12 < this.ap; ++var12) {
                  int var13 = var9 / var11 % var8;
                  float var14 = (float)this.aj[var13] * var17 + var16 + var10;
                  this.ai[var9][var12] = var14;
                  if (var7) {
                     var10 = var14;
                  }

                  var11 *= var8;
               }
            }
         } else {
            for(var9 = 0; var9 < this.aw; ++var9) {
               var10 = 0.0F;
               var11 = var9 * this.ap;

               for(var12 = 0; var12 < this.ap; ++var12) {
                  float var18 = (float)this.aj[var11] * var17 + var16 + var10;
                  this.ai[var9][var12] = var18;
                  if (var7) {
                     var10 = var18;
                  }

                  ++var11;
               }
            }
         }
      }

   }

   void aw() {
      int[] var1 = new int[this.aw];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.aw; ++var3) {
         var4 = this.ak[var3];
         if (var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var9;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var9 = var2[var8];
                  if (var9 != var6) {
                     break;
                  }

                  var10 = 1 << 32 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var9 = var2[var8];
               if (var9 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.ay = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.aw; ++var3) {
         var4 = this.ak[var3];
         if (var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if ((var5 & var8) != 0) {
                  if (this.ay[var6] == 0) {
                     this.ay[var6] = var11;
                  }

                  var6 = this.ay[var6];
               } else {
                  ++var6;
               }

               if (var6 >= this.ay.length) {
                  int[] var12 = new int[this.ay.length * 2];

                  for(var10 = 0; var10 < this.ay.length; ++var10) {
                     var12[var10] = this.ay[var10];
                  }

                  this.ay = var12;
               }

               var8 >>>= 1;
            }

            this.ay[var6] = ~var3;
            if (var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   int ak(cp var1) {
      int var2;
      for(var2 = 0; this.ay[var2] >= 0; var2 = var1.aw(1568597586) != 0 ? this.ay[var2] : var2 + 1) {
      }

      return ~this.ay[var2];
   }

   float[] aj(cp var1) {
      return this.ai[this.ak(var1)];
   }

   static int ai(int var0, int var1) {
      int var2;
      for(var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1; df.ap(var2, var1, -1871777228) > var0; --var2) {
      }

      return var2;
   }

   static int ay(int var0, int var1) {
      int var2;
      for(var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1; df.ap(var2, var1, -1690594540) > var0; --var2) {
      }

      return var2;
   }

   static int as(int var0, int var1) {
      int var2;
      for(var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1; df.ap(var2, var1, -563561139) > var0; --var2) {
      }

      return var2;
   }

   void ae() {
      int[] var1 = new int[this.aw];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.aw; ++var3) {
         var4 = this.ak[var3];
         if (var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var9;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var9 = var2[var8];
                  if (var9 != var6) {
                     break;
                  }

                  var10 = 1 << 1018059170 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var9 = var2[var8];
               if (var9 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.ay = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.aw; ++var3) {
         var4 = this.ak[var3];
         if (var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if ((var5 & var8) != 0) {
                  if (this.ay[var6] == 0) {
                     this.ay[var6] = var11;
                  }

                  var6 = this.ay[var6];
               } else {
                  ++var6;
               }

               if (var6 >= this.ay.length) {
                  int[] var12 = new int[this.ay.length * 2];

                  for(var10 = 0; var10 < this.ay.length; ++var10) {
                     var12[var10] = this.ay[var10];
                  }

                  this.ay = var12;
               }

               var8 >>>= 1;
            }

            this.ay[var6] = ~var3;
            if (var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   void am() {
      int[] var1 = new int[this.aw];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.aw; ++var3) {
         var4 = this.ak[var3];
         if (var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var9;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var9 = var2[var8];
                  if (var9 != var6) {
                     break;
                  }

                  var10 = 1 << -1896372177 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 772927545; ++var8) {
               var9 = var2[var8];
               if (var9 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.ay = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.aw; ++var3) {
         var4 = this.ak[var3];
         if (var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = 1580767768 >>> var7;
               if ((var5 & var8) != 0) {
                  if (this.ay[var6] == 0) {
                     this.ay[var6] = var11;
                  }

                  var6 = this.ay[var6];
               } else {
                  ++var6;
               }

               if (var6 >= this.ay.length) {
                  int[] var12 = new int[this.ay.length * 2];

                  for(var10 = 0; var10 < this.ay.length; ++var10) {
                     var12[var10] = this.ay[var10];
                  }

                  this.ay = var12;
               }

               var8 >>>= 1;
            }

            this.ay[var6] = ~var3;
            if (var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   void at() {
      int[] var1 = new int[this.aw];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.aw; ++var3) {
         var4 = this.ak[var3];
         if (var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var9;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var9 = var2[var8];
                  if (var9 != var6) {
                     break;
                  }

                  var10 = 1 << 32 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var9 = var2[var8];
               if (var9 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.ay = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.aw; ++var3) {
         var4 = this.ak[var3];
         if (var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if ((var5 & var8) != 0) {
                  if (this.ay[var6] == 0) {
                     this.ay[var6] = var11;
                  }

                  var6 = this.ay[var6];
               } else {
                  ++var6;
               }

               if (var6 >= this.ay.length) {
                  int[] var12 = new int[this.ay.length * 2];

                  for(var10 = 0; var10 < this.ay.length; ++var10) {
                     var12[var10] = this.ay[var10];
                  }

                  this.ay = var12;
               }

               var8 >>>= 1;
            }

            this.ay[var6] = ~var3;
            if (var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   float[] ar(cp var1) {
      return this.ai[this.ak(var1)];
   }

   int ao(cp var1) {
      int var2;
      for(var2 = 0; this.ay[var2] >= 0; var2 = var1.aw(-427066837) != 0 ? this.ay[var2] : var2 + 1) {
      }

      return ~this.ay[var2];
   }

   int an(cp var1) {
      int var2;
      for(var2 = 0; this.ay[var2] >= 0; var2 = var1.aw(1336317630) != 0 ? this.ay[var2] : var2 + 1) {
      }

      return ~this.ay[var2];
   }

   int af(cp var1) {
      int var2;
      for(var2 = 0; this.ay[var2] >= 0; var2 = var1.aw(-211392158) != 0 ? this.ay[var2] : var2 + 1) {
      }

      return ~this.ay[var2];
   }

   static int ap(int var0, int var1) {
      int var2;
      for(var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1; df.ap(var2, var1, -593584825) > var0; --var2) {
      }

      return var2;
   }

   float[] ab(cp var1) {
      return this.ai[this.ak(var1)];
   }
}
