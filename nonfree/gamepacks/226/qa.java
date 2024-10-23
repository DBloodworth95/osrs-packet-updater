import java.util.Random;

public abstract class qa extends vz {
   public int am;
   byte[][] aw = new byte[256][];
   int[] ak;
   static int ac = 0;
   int[] ai;
   int[] ay;
   int[] as;
   static final int ap = 256;
   public int ae = 0;
   public int at;
   int[] aj;
   byte[] an;
   static int ao = -1;
   static int af = -1;
   static int ar = -1;
   static int ab = -1;
   static int az = 0;
   static int ag = 0;
   static int ad = 256;
   public static vc[] au;
   static int av = 0;
   static Random ax = new Random();
   static String[] aq = new String[100];

   static int ae(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if (var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if (var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if (var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for(int var18 = var11; var18 < var12; ++var18) {
         int var19 = var14[var16++] + var15[var17++];
         if (var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   qa(byte[] var1) {
      this.as(var1);
   }

   void as(byte[] var1) {
      this.ak = new int[256];
      int var2;
      if (var1.length == 257) {
         for(var2 = 0; var2 < this.ak.length; ++var2) {
            this.ak[var2] = var1[var2] & 255;
         }

         this.ae = var1[256] & 255;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 256; ++var3) {
            this.ak[var3] = var1[var2++] & 255;
         }

         int[] var10 = new int[256];
         int[] var4 = new int[256];

         int var5;
         for(var5 = 0; var5 < 256; ++var5) {
            var10[var5] = var1[var2++] & 255;
         }

         for(var5 = 0; var5 < 256; ++var5) {
            var4[var5] = var1[var2++] & 255;
         }

         byte[][] var11 = new byte[256][];

         int var8;
         for(int var6 = 0; var6 < 256; ++var6) {
            var11[var6] = new byte[var10[var6]];
            byte var7 = 0;

            for(var8 = 0; var8 < var11[var6].length; ++var8) {
               var7 += var1[var2++];
               var11[var6][var8] = var7;
            }
         }

         byte[][] var12 = new byte[256][];

         int var13;
         for(var13 = 0; var13 < 256; ++var13) {
            var12[var13] = new byte[var10[var13]];
            byte var14 = 0;

            for(int var9 = 0; var9 < var12[var13].length; ++var9) {
               var14 += var1[var2++];
               var12[var13][var9] = var14;
            }
         }

         this.an = new byte[65536];

         for(var13 = 0; var13 < 256; ++var13) {
            if (var13 != 32 && var13 != 160) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if (var8 != 32 && var8 != 160) {
                     this.an[(var13 << 8) + var8] = (byte)ae(var11, var12, var4, this.ak, var10, var13, var8);
                  }
               }
            }
         }

         this.ae = var4[32] + var10[32];
      }

   }

   void dx(String var1, int var2, int var3) {
      var3 -= this.ae;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if (var1.charAt(var6) != 0) {
            char var7 = (char)(bm.ap(var1.charAt(var6), (byte)-55) & 255);
            if (var7 == '<') {
               var4 = var6;
            } else {
               int var9;
               if (var7 == '>' && var4 != -1) {
                  String var8 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if (var8.equals("lt")) {
                     var7 = '<';
                  } else {
                     if (!var8.equals("gt")) {
                        if (var8.startsWith("img=")) {
                           try {
                              var9 = bj.aj(var8.substring(4), -1481777132);
                              vc var13 = au[var9];
                              var13.ak(var2, var3 + this.ae - var13.ae);
                              var2 += var13.as;
                              var5 = -1;
                           } catch (Exception var11) {
                           }
                        } else {
                           this.bb(var8);
                        }
                        continue;
                     }

                     var7 = '>';
                  }
               }

               if (var7 == 160) {
                  var7 = ' ';
               }

               if (var4 == -1) {
                  if (this.an != null && var5 != -1) {
                     var2 += this.an[(var5 << 8) + var7];
                  }

                  int var12 = this.aj[var7];
                  var9 = this.ai[var7];
                  if (var7 != ' ') {
                     if (ad == 256) {
                        if (ab != -1) {
                           bc(this.aw[var7], var2 + this.ay[var7] + 1, var3 + this.as[var7] + 1, var12, var9, ab);
                        }

                        this.ap(this.aw[var7], var2 + this.ay[var7], var3 + this.as[var7], var12, var9, ag);
                     } else {
                        if (ab != -1) {
                           br(this.aw[var7], var2 + this.ay[var7] + 1, var3 + this.as[var7] + 1, var12, var9, ab, ad);
                        }

                        this.aw(this.aw[var7], var2 + this.ay[var7], var3 + this.as[var7], var12, var9, ag, ad);
                     }
                  } else if (ac > 0) {
                     av += ac;
                     var2 += av >> 8;
                     av &= 255;
                  }

                  int var10 = this.ak[var7];
                  if (ao != -1) {
                     ej(var2, var3 + (int)((double)this.ae * 0.7D), var10, ao);
                  }

                  if (af != -1) {
                     ej(var2, var3 + this.ae + 1, var10, af);
                  }

                  var2 += var10;
                  var5 = var7;
               }
            }
         }
      }

   }

   public void cl(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bk(var4, var5);
         this.bp(var1, var2 - this.at(var1), var3);
      }
   }

   public void az(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.bk(var4, var5);
         ad = var6;
         this.bp(var1, var2, var3);
      }
   }

   public int au(String var1, int[] var2, String[] var3) {
      if (var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(100);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         int var10 = -1;
         char var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for(int var14 = 0; var14 < var13; ++var14) {
            char var15 = var1.charAt(var14);
            if (var15 == '<') {
               var10 = var14;
            } else {
               if (var15 == '>' && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append('>');
                  if (var16.equals("br")) {
                     var3[var12] = var6.toString().substring(var5, var6.length());
                     ++var12;
                     var5 = var6.length();
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if (var16.equals("lt")) {
                     var4 += this.am('<');
                     if (this.an != null && var11 != -1) {
                        var4 += this.an[(var11 << 8) + 60];
                     }

                     var11 = '<';
                  } else if (var16.equals("gt")) {
                     var4 += this.am('>');
                     if (this.an != null && var11 != -1) {
                        var4 += this.an[(var11 << 8) + 62];
                     }

                     var11 = '>';
                  } else if (var16.startsWith("img=")) {
                     try {
                        int var17 = bj.aj(var16.substring(4), -1481777132);
                        var4 += au[var17].as;
                        var11 = 0;
                     } catch (Exception var18) {
                     }
                  }

                  var15 = 0;
               }

               if (var10 == -1) {
                  if (var15 != 0) {
                     var6.append(var15);
                     var4 += this.am(var15);
                     if (this.an != null && var11 != -1) {
                        var4 += this.an[(var11 << 8) + var15];
                     }

                     var11 = var15;
                  }

                  if (var15 == ' ') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                  }

                  if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
                     var3[var12] = var6.toString().substring(var5, var7 - var9);
                     ++var12;
                     var5 = var7;
                     var7 = -1;
                     var4 -= var8;
                     var11 = 0;
                  }

                  if (var15 == '-') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                  }
               }
            }
         }

         String var19 = var6.toString();
         if (var19.length() > var5) {
            var3[var12++] = var19.substring(var5, var19.length());
         }

         return var12;
      }
   }

   public int an(String var1, int var2) {
      int var3 = this.au(var1, new int[]{var2}, aq);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.at(aq[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   public int am(char var1) {
      if (var1 == 160) {
         var1 = ' ';
      }

      return this.ak[bm.ap(var1, (byte)15) & 255];
   }

   public static String af(String var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 == '<' || var4 == '>') {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for(int var7 = 0; var7 < var1; ++var7) {
         char var5 = var0.charAt(var7);
         if (var5 == '<') {
            var6.append("<lt>");
         } else if (var5 == '>') {
            var6.append("<gt>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }

   public int ao(String var1, int var2) {
      return this.au(var1, new int[]{var2}, aq);
   }

   public void ab(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bk(var4, var5);
         this.bp(var1, var2, var3);
      }
   }

   public int at(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for(int var5 = 0; var5 < var1.length(); ++var5) {
            char var6 = var1.charAt(var5);
            if (var6 == '<') {
               var2 = var5;
            } else {
               if (var6 == '>' && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var5);
                  var2 = -1;
                  if (var7.equals("lt")) {
                     var6 = '<';
                  } else {
                     if (!var7.equals("gt")) {
                        if (var7.startsWith("img=")) {
                           try {
                              int var8 = bj.aj(var7.substring(4), -1481777132);
                              var4 += au[var8].as;
                              var3 = -1;
                           } catch (Exception var9) {
                           }
                        }
                        continue;
                     }

                     var6 = '>';
                  }
               }

               if (var6 == 160) {
                  var6 = ' ';
               }

               if (var2 == -1) {
                  var4 += this.ak[(char)(bm.ap(var6, (byte)25) & 255)];
                  if (this.an != null && var3 != -1) {
                     var4 += this.an[(var3 << 8) + var6];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   public void ag(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bk(var4, var5);
         this.bp(var1, var2 - this.at(var1), var3);
      }
   }

   public void ad(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bk(var4, var5);
         this.bp(var1, var2 - this.at(var1) / 2, var3);
      }
   }

   public void cv(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bk(var4, var5);
         this.bp(var1, var2 - this.at(var1), var3);
      }
   }

   public int bf(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for(int var5 = 0; var5 < var1.length(); ++var5) {
            char var6 = var1.charAt(var5);
            if (var6 == '<') {
               var2 = var5;
            } else {
               if (var6 == '>' && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var5);
                  var2 = -1;
                  if (var7.equals("lt")) {
                     var6 = '<';
                  } else {
                     if (!var7.equals("gt")) {
                        if (var7.startsWith("img=")) {
                           try {
                              int var8 = bj.aj(var7.substring(4), -1481777132);
                              var4 += au[var8].as;
                              var3 = -1;
                           } catch (Exception var9) {
                           }
                        }
                        continue;
                     }

                     var6 = '>';
                  }
               }

               if (var6 == 160) {
                  var6 = ' ';
               }

               if (var2 == -1) {
                  var4 += this.ak[(char)(bm.ap(var6, (byte)-21) & 255)];
                  if (this.an != null && var3 != -1) {
                     var4 += this.an[(var3 << 8) + var6];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   public uy ax(qb var1, int var2, int var3, int var4, int var5, int var6) {
      if (!var1.ak((byte)1)) {
         this.bk(var4, var5);
         var3 -= this.ae;

         for(int var7 = 0; var7 < var1.aj((byte)0); ++var7) {
            qm var8 = var1.ae(var7, (byte)-53);
            if (var6 != -1 && var8.ak * 1818523521 > var6) {
               return new uy(var8.aw * 217408337, var8.ak * 1818523521);
            }

            char var9 = var8.ap;
            if (var9 != '\n') {
               if (var1.aw(var7, -83720937)) {
                  var9 = '*';
               }

               if (var9 != '\t') {
                  if (var9 == 160) {
                     var9 = ' ';
                  }

                  int var10 = var2 + var8.aw * 217408337;
                  int var11 = var3 + var8.ak * 1818523521;
                  int var12 = this.aj[var9];
                  int var13 = this.ai[var9];
                  if (ab != -1) {
                     this.ap(this.aw[var9], var10 + this.ay[var9] + 1, var11 + this.as[var9] + 1, var12, var13, ab);
                  }

                  this.ap(this.aw[var9], var10 + this.ay[var9], var11 + this.as[var9], var12, var13, ag);
               }
            }
         }
      }

      return var1.as((byte)82);
   }

   void bb(String var1) {
      try {
         if (var1.startsWith("col=")) {
            ag = lj.ai(var1.substring(4), 16, (byte)1);
         } else if (var1.equals("/col")) {
            ag = az;
         } else if (var1.startsWith("str=")) {
            ao = lj.ai(var1.substring(4), 16, (byte)1);
         } else if (var1.equals("str")) {
            ao = 8388608;
         } else if (var1.equals("/str")) {
            ao = -1;
         } else if (var1.startsWith("u=")) {
            af = lj.ai(var1.substring(2), 16, (byte)1);
         } else if (var1.equals("u")) {
            af = 0;
         } else if (var1.equals("/u")) {
            af = -1;
         } else if (var1.startsWith("shad=")) {
            ab = lj.ai(var1.substring(5), 16, (byte)1);
         } else if (var1.equals("shad")) {
            ab = 0;
         } else if (var1.equals("/shad")) {
            ab = ar;
         } else if (var1.equals("br")) {
            this.bk(az, ar);
         }
      } catch (Exception var3) {
      }

   }

   public void al(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         this.bk(var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.bj(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];
         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var9[var11] = (int)(Math.sin((double)var11 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var10[var11] = (int)(Math.sin((double)var11 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.bz(var1, var2 - this.at(var1) / 2, var3, var8, var9, var10);
      }
   }

   public void aa(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
      if (var1 != null) {
         this.bk(var4, var5);
         int[] var9 = null;
         if (var8 != null) {
            var9 = this.bj(var8, var1.length());
         }

         double var10 = 7.0D - (double)var7 / 8.0D;
         if (var10 < 0.0D) {
            var10 = 0.0D;
         }

         int[] var12 = new int[var1.length()];

         for(int var13 = 0; var13 < var1.length(); ++var13) {
            var12[var13] = (int)(Math.sin((double)var13 / 1.5D + (double)var6 / 1.0D) * var10);
         }

         this.bz(var1, var2 - this.at(var1) / 2, var3, var9, (int[])null, var12);
      }
   }

   static void dj(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * aa;
      int var7 = aa - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if (var2 < bv) {
         var10 = bv - var2;
         var4 -= var10;
         var2 = bv;
         var9 += var10 * var3;
         var6 += var10 * aa;
      }

      if (var2 + var4 > bx) {
         var4 -= var2 + var4 - bx;
      }

      if (var1 < bk) {
         var10 = bk - var1;
         var3 -= var10;
         var1 = bk;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if (var1 + var3 > bb) {
         var10 = var1 + var3 - bb;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if (var3 > 0 && var4 > 0) {
         by(al, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   public void bh(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         this.bk(var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.bj(var6, var1.length());
         }

         this.bz(var1, var2, var3, var7, (int[])null, (int[])null);
      }
   }

   int[] bj(int[] var1, int var2) {
      if (var2 == 0) {
         return null;
      } else {
         int[] var3 = new int[var2];
         float var4 = (float)var1.length / (float)var2;

         for(int var5 = 0; var5 < var2; ++var5) {
            var3[var5] = var1[(int)((float)var5 * var4)];
         }

         return var3;
      }
   }

   public void bv(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.bk(var4, var5);
         ax.setSeed((long)var6);
         ad = 192 + (ax.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = var8;
            if ((ax.nextInt() & 3) == 0) {
               ++var8;
            }
         }

         this.bz(var1, var2, var3, (int[])null, var7, (int[])null);
      }
   }

   public void bx(int var1, int var2, int var3, int var4) {
      var3 -= this.ae;
      int var5 = var1 & 255;
      if (var5 != 32) {
         this.ap(this.aw[var5], var2 + this.ay[var5], var3 + this.as[var5], this.aj[var5], this.ai[var5], var4);
      }

   }

   public void dc(int var1, int var2, int var3, int var4) {
      var3 -= this.ae;
      int var5 = var1 & -1648792025;
      if (var5 != 32) {
         this.ap(this.aw[var5], var2 + this.ay[var5], var3 + this.as[var5], this.aj[var5], this.ai[var5], var4);
      }

   }

   public int bl(String var1, int[] var2, String[] var3) {
      if (var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(100);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         int var10 = -1;
         char var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for(int var14 = 0; var14 < var13; ++var14) {
            char var15 = var1.charAt(var14);
            if (var15 == '<') {
               var10 = var14;
            } else {
               if (var15 == '>' && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append('>');
                  if (var16.equals("br")) {
                     var3[var12] = var6.toString().substring(var5, var6.length());
                     ++var12;
                     var5 = var6.length();
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if (var16.equals("lt")) {
                     var4 += this.am('<');
                     if (this.an != null && var11 != -1) {
                        var4 += this.an[(var11 << 8) + -2123445669];
                     }

                     var11 = '<';
                  } else if (var16.equals("gt")) {
                     var4 += this.am((char)-1953866029);
                     if (this.an != null && var11 != -1) {
                        var4 += this.an[(var11 << 8) + 62];
                     }

                     var11 = '>';
                  } else if (var16.startsWith("img=")) {
                     try {
                        int var17 = bj.aj(var16.substring(4), -1481777132);
                        var4 += au[var17].as;
                        var11 = 0;
                     } catch (Exception var18) {
                     }
                  }

                  var15 = 0;
               }

               if (var10 == -1) {
                  if (var15 != 0) {
                     var6.append(var15);
                     var4 += this.am(var15);
                     if (this.an != null && var11 != -1) {
                        var4 += this.an[(var11 << 8) + var15];
                     }

                     var11 = var15;
                  }

                  if (var15 == ' ') {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                  }

                  if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
                     var3[var12] = var6.toString().substring(var5, var7 - var9);
                     ++var12;
                     var5 = var7;
                     var7 = -1;
                     var4 -= var8;
                     var11 = 0;
                  }

                  if (var15 == -274068527) {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                  }
               }
            }
         }

         String var19 = var6.toString();
         if (var19.length() > var5) {
            var3[var12++] = var19.substring(var5, var19.length());
         }

         return var12;
      }
   }

   void bq(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6 = var1.charAt(var5);
         if (var6 == '<') {
            var4 = true;
         } else if (var6 == '>') {
            var4 = false;
         } else if (!var4 && var6 == ' ') {
            ++var3;
         }
      }

      if (var3 > 0) {
         ac = (var2 - this.at(var1) << 8) / var3;
      }

   }

   public int bg(String var1, int[] var2, String[] var3) {
      if (var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(100);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         int var10 = -1;
         int var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for(int var14 = 0; var14 < var13; ++var14) {
            char var15 = var1.charAt(var14);
            if (var15 == '<') {
               var10 = var14;
            } else {
               if (var15 == -105263612 && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append((char)1376277132);
                  var6.append(var16);
                  var6.append((char)-58326864);
                  if (var16.equals("br")) {
                     var3[var12] = var6.toString().substring(var5, var6.length());
                     ++var12;
                     var5 = var6.length();
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if (var16.equals("lt")) {
                     var4 += this.am('<');
                     if (this.an != null && var11 != -1) {
                        var4 += this.an[(var11 << 8) + 2102014172];
                     }

                     var11 = 2681883;
                  } else if (var16.equals("gt")) {
                     var4 += this.am((char)2133658822);
                     if (this.an != null && var11 != -1) {
                        var4 += this.an[(var11 << 8) + 1939994063];
                     }

                     var11 = 62;
                  } else if (var16.startsWith("img=")) {
                     try {
                        int var17 = bj.aj(var16.substring(4), -1481777132);
                        var4 += au[var17].as;
                        var11 = 0;
                     } catch (Exception var18) {
                     }
                  }

                  var15 = 0;
               }

               if (var10 == -1) {
                  if (var15 != 0) {
                     var6.append(var15);
                     var4 += this.am(var15);
                     if (this.an != null && var11 != -1) {
                        var4 += this.an[(var11 << 8) + var15];
                     }

                     var11 = var15;
                  }

                  if (var15 == 390685024) {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                  }

                  if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
                     var3[var12] = var6.toString().substring(var5, var7 - var9);
                     ++var12;
                     var5 = var7;
                     var7 = -1;
                     var4 -= var8;
                     var11 = 0;
                  }

                  if (var15 == 1662805343) {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                  }
               }
            }
         }

         String var19 = var6.toString();
         if (var19.length() > var5) {
            var3[var12++] = var19.substring(var5, var19.length());
         }

         return var12;
      }
   }

   void bz(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
      var3 -= this.ae;
      int var7 = -1;
      int var8 = -1;
      int var9 = 0;

      for(int var10 = 0; var10 < var1.length(); ++var10) {
         if (var1.charAt(var10) != 0) {
            char var11 = (char)(bm.ap(var1.charAt(var10), (byte)5) & 255);
            if (var11 == '<') {
               var7 = var10;
            } else {
               int var13;
               int var14;
               int var15;
               if (var11 == '>' && var7 != -1) {
                  String var12 = var1.substring(var7 + 1, var10);
                  var7 = -1;
                  if (var12.equals("lt")) {
                     var11 = '<';
                  } else {
                     if (!var12.equals("gt")) {
                        if (var12.startsWith("img=")) {
                           try {
                              if (var5 != null) {
                                 var13 = var5[var9];
                              } else {
                                 var13 = 0;
                              }

                              if (var6 != null) {
                                 var14 = var6[var9];
                              } else {
                                 var14 = 0;
                              }

                              ++var9;
                              var15 = bj.aj(var12.substring(4), -1481777132);
                              vc var20 = au[var15];
                              var20.ak(var2 + var13, var3 + this.ae - var20.ae + var14);
                              var2 += var20.as;
                              var8 = -1;
                           } catch (Exception var18) {
                           }
                        } else {
                           this.bb(var12);
                        }
                        continue;
                     }

                     var11 = '>';
                  }
               }

               if (var11 == 160) {
                  var11 = ' ';
               }

               if (var7 == -1) {
                  if (this.an != null && var8 != -1) {
                     var2 += this.an[(var8 << 8) + var11];
                  }

                  int var19 = this.aj[var11];
                  var13 = this.ai[var11];
                  if (var5 != null) {
                     var14 = var5[var9];
                  } else {
                     var14 = 0;
                  }

                  if (var6 != null) {
                     var15 = var6[var9];
                  } else {
                     var15 = 0;
                  }

                  int var16;
                  if (var4 != null) {
                     var16 = var4[var9];
                  } else {
                     var16 = ag;
                  }

                  ++var9;
                  if (var11 != ' ') {
                     if (ad == 256) {
                        if (ab != -1) {
                           bc(this.aw[var11], var2 + this.ay[var11] + 1 + var14, var3 + this.as[var11] + 1 + var15, var19, var13, ab);
                        }

                        this.ap(this.aw[var11], var2 + this.ay[var11] + var14, var3 + this.as[var11] + var15, var19, var13, var16);
                     } else {
                        if (ab != -1) {
                           br(this.aw[var11], var2 + this.ay[var11] + 1 + var14, var3 + this.as[var11] + 1 + var15, var19, var13, ab, ad);
                        }

                        this.aw(this.aw[var11], var2 + this.ay[var11] + var14, var3 + this.as[var11] + var15, var19, var13, var16, ad);
                     }
                  } else if (ac > 0) {
                     av += ac;
                     var2 += av >> 8;
                     av &= 255;
                  }

                  int var17 = this.ak[var11];
                  if (ao != -1) {
                     ej(var2, var3 + (int)((double)this.ae * 0.7D), var17, ao);
                  }

                  if (af != -1) {
                     ej(var2, var3 + this.ae, var17, af);
                  }

                  var2 += var17;
                  var8 = var11;
               }
            }
         }
      }

   }

   abstract void ap(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   abstract void aw(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   static void bc(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * aa;
      int var7 = aa - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if (var2 < bv) {
         var10 = bv - var2;
         var4 -= var10;
         var2 = bv;
         var9 += var10 * var3;
         var6 += var10 * aa;
      }

      if (var2 + var4 > bx) {
         var4 -= var2 + var4 - bx;
      }

      if (var1 < bk) {
         var10 = bk - var1;
         var3 -= var10;
         var1 = bk;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if (var1 + var3 > bb) {
         var10 = var1 + var3 - bb;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if (var3 > 0 && var4 > 0) {
         by(al, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   static void by(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void br(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * aa;
      int var8 = aa - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var2 < bv) {
         var11 = bv - var2;
         var4 -= var11;
         var2 = bv;
         var10 += var11 * var3;
         var7 += var11 * aa;
      }

      if (var2 + var4 > bx) {
         var4 -= var2 + var4 - bx;
      }

      if (var1 < bk) {
         var11 = bk - var1;
         var3 -= var11;
         var1 = bk;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var1 + var3 > bb) {
         var11 = var1 + var3 - bb;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var3 > 0 && var4 > 0) {
         bn(al, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   static void bn(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & '\uff00') * var9 & 16711680) >> 8;
      var9 = 256 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & '\uff00') * var9 & 16711680) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   void dt(String var1, int var2, int var3) {
      var3 -= this.ae;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if (var1.charAt(var6) != 0) {
            char var7 = (char)(bm.ap(var1.charAt(var6), (byte)32) & 255);
            if (var7 == '<') {
               var4 = var6;
            } else {
               int var9;
               if (var7 == '>' && var4 != -1) {
                  String var8 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if (var8.equals("lt")) {
                     var7 = '<';
                  } else {
                     if (!var8.equals("gt")) {
                        if (var8.startsWith("img=")) {
                           try {
                              var9 = bj.aj(var8.substring(4), -1481777132);
                              vc var13 = au[var9];
                              var13.ak(var2, var3 + this.ae - var13.ae);
                              var2 += var13.as;
                              var5 = -1;
                           } catch (Exception var11) {
                           }
                        } else {
                           this.bb(var8);
                        }
                        continue;
                     }

                     var7 = '>';
                  }
               }

               if (var7 == 160) {
                  var7 = ' ';
               }

               if (var4 == -1) {
                  if (this.an != null && var5 != -1) {
                     var2 += this.an[(var5 << 8) + var7];
                  }

                  int var12 = this.aj[var7];
                  var9 = this.ai[var7];
                  if (var7 != ' ') {
                     if (ad == 256) {
                        if (ab != -1) {
                           bc(this.aw[var7], var2 + this.ay[var7] + 1, var3 + this.as[var7] + 1, var12, var9, ab);
                        }

                        this.ap(this.aw[var7], var2 + this.ay[var7], var3 + this.as[var7], var12, var9, ag);
                     } else {
                        if (ab != -1) {
                           br(this.aw[var7], var2 + this.ay[var7] + 1, var3 + this.as[var7] + 1, var12, var9, ab, ad);
                        }

                        this.aw(this.aw[var7], var2 + this.ay[var7], var3 + this.as[var7], var12, var9, ag, ad);
                     }
                  } else if (ac > 0) {
                     av += ac;
                     var2 += av >> 8;
                     av &= 255;
                  }

                  int var10 = this.ak[var7];
                  if (ao != -1) {
                     ej(var2, var3 + (int)((double)this.ae * 0.7D), var10, ao);
                  }

                  if (af != -1) {
                     ej(var2, var3 + this.ae + 1, var10, af);
                  }

                  var2 += var10;
                  var5 = var7;
               }
            }
         }
      }

   }

   abstract void aj(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   abstract void ai(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   abstract void ay(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   void bu(byte[] var1) {
      this.ak = new int[1704551514];
      int var2;
      if (var1.length == 257) {
         for(var2 = 0; var2 < this.ak.length; ++var2) {
            this.ak[var2] = var1[var2] & -1394010079;
         }

         this.ae = var1[256] & 750037018;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 2145591664; ++var3) {
            this.ak[var3] = var1[var2++] & 255;
         }

         int[] var10 = new int[221373614];
         int[] var4 = new int[-785471109];

         int var5;
         for(var5 = 0; var5 < 256; ++var5) {
            var10[var5] = var1[var2++] & 255;
         }

         for(var5 = 0; var5 < 256; ++var5) {
            var4[var5] = var1[var2++] & 1003940325;
         }

         byte[][] var11 = new byte[256][];

         int var8;
         for(int var6 = 0; var6 < 256; ++var6) {
            var11[var6] = new byte[var10[var6]];
            byte var7 = 0;

            for(var8 = 0; var8 < var11[var6].length; ++var8) {
               var7 += var1[var2++];
               var11[var6][var8] = var7;
            }
         }

         byte[][] var12 = new byte[256][];

         int var13;
         for(var13 = 0; var13 < 256; ++var13) {
            var12[var13] = new byte[var10[var13]];
            byte var14 = 0;

            for(int var9 = 0; var9 < var12[var13].length; ++var9) {
               var14 += var1[var2++];
               var12[var13][var9] = var14;
            }
         }

         this.an = new byte[65536];

         for(var13 = 0; var13 < 1381590945; ++var13) {
            if (var13 != 32 && var13 != 160) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if (var8 != -1250652270 && var8 != 160) {
                     this.an[(var13 << 8) + var8] = (byte)ae(var11, var12, var4, this.ak, var10, var13, var8);
                  }
               }
            }
         }

         this.ae = var4[32] + var10[-1953563494];
      }

   }

   void bt(byte[] var1) {
      this.ak = new int[1640474481];
      int var2;
      if (var1.length == -1308024355) {
         for(var2 = 0; var2 < this.ak.length; ++var2) {
            this.ak[var2] = var1[var2] & 255;
         }

         this.ae = var1[256] & -1721288800;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 1456120289; ++var3) {
            this.ak[var3] = var1[var2++] & 255;
         }

         int[] var10 = new int[256];
         int[] var4 = new int[422826409];

         int var5;
         for(var5 = 0; var5 < 284611000; ++var5) {
            var10[var5] = var1[var2++] & 255;
         }

         for(var5 = 0; var5 < 256; ++var5) {
            var4[var5] = var1[var2++] & 255;
         }

         byte[][] var11 = new byte[-2030218093][];

         int var8;
         for(int var6 = 0; var6 < -1618700716; ++var6) {
            var11[var6] = new byte[var10[var6]];
            byte var7 = 0;

            for(var8 = 0; var8 < var11[var6].length; ++var8) {
               var7 += var1[var2++];
               var11[var6][var8] = var7;
            }
         }

         byte[][] var12 = new byte[256][];

         int var13;
         for(var13 = 0; var13 < 256; ++var13) {
            var12[var13] = new byte[var10[var13]];
            byte var14 = 0;

            for(int var9 = 0; var9 < var12[var13].length; ++var9) {
               var14 += var1[var2++];
               var12[var13][var9] = var14;
            }
         }

         this.an = new byte[65536];

         for(var13 = 0; var13 < 256; ++var13) {
            if (var13 != -528659875 && var13 != 160) {
               for(var8 = 0; var8 < 1792771512; ++var8) {
                  if (var8 != -1874233184 && var8 != 160) {
                     this.an[(var13 << 8) + var8] = (byte)ae(var11, var12, var4, this.ak, var10, var13, var8);
                  }
               }
            }
         }

         this.ae = var4[16227642] + var10[-1442954305];
      }

   }

   public qg ar(int var1, int var2, String var3, int var4, int var5) {
      if (var3 != null && var3.length() >= var1 + var2) {
         int var6 = var4 - this.at(var3) / 2;
         var6 += this.at(var3.substring(0, var1));
         int var7 = var5 - this.am;
         int var8 = this.at(var3.substring(var1, var1 + var2));
         int var9 = this.am + this.at;
         return new qg(var6, var7, var8, var9);
      } else {
         return new qg(var4, var5, 0, 0);
      }
   }

   static int bm(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if (var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if (var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if (var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for(int var18 = var11; var18 < var12; ++var18) {
         int var19 = var14[var16++] + var15[var17++];
         if (var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   void db(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
      var3 -= this.ae;
      int var7 = -1;
      int var8 = -1;
      int var9 = 0;

      for(int var10 = 0; var10 < var1.length(); ++var10) {
         if (var1.charAt(var10) != 0) {
            char var11 = (char)(bm.ap(var1.charAt(var10), (byte)-6) & 255);
            if (var11 == '<') {
               var7 = var10;
            } else {
               int var13;
               int var14;
               int var15;
               if (var11 == '>' && var7 != -1) {
                  String var12 = var1.substring(var7 + 1, var10);
                  var7 = -1;
                  if (var12.equals("lt")) {
                     var11 = '<';
                  } else {
                     if (!var12.equals("gt")) {
                        if (var12.startsWith("img=")) {
                           try {
                              if (var5 != null) {
                                 var13 = var5[var9];
                              } else {
                                 var13 = 0;
                              }

                              if (var6 != null) {
                                 var14 = var6[var9];
                              } else {
                                 var14 = 0;
                              }

                              ++var9;
                              var15 = bj.aj(var12.substring(4), -1481777132);
                              vc var20 = au[var15];
                              var20.ak(var2 + var13, var3 + this.ae - var20.ae + var14);
                              var2 += var20.as;
                              var8 = -1;
                           } catch (Exception var18) {
                           }
                        } else {
                           this.bb(var12);
                        }
                        continue;
                     }

                     var11 = '>';
                  }
               }

               if (var11 == 160) {
                  var11 = ' ';
               }

               if (var7 == -1) {
                  if (this.an != null && var8 != -1) {
                     var2 += this.an[(var8 << 8) + var11];
                  }

                  int var19 = this.aj[var11];
                  var13 = this.ai[var11];
                  if (var5 != null) {
                     var14 = var5[var9];
                  } else {
                     var14 = 0;
                  }

                  if (var6 != null) {
                     var15 = var6[var9];
                  } else {
                     var15 = 0;
                  }

                  int var16;
                  if (var4 != null) {
                     var16 = var4[var9];
                  } else {
                     var16 = ag;
                  }

                  ++var9;
                  if (var11 != ' ') {
                     if (ad == 256) {
                        if (ab != -1) {
                           bc(this.aw[var11], var2 + this.ay[var11] + 1 + var14, var3 + this.as[var11] + 1 + var15, var19, var13, ab);
                        }

                        this.ap(this.aw[var11], var2 + this.ay[var11] + var14, var3 + this.as[var11] + var15, var19, var13, var16);
                     } else {
                        if (ab != -1) {
                           br(this.aw[var11], var2 + this.ay[var11] + 1 + var14, var3 + this.as[var11] + 1 + var15, var19, var13, ab, ad);
                        }

                        this.aw(this.aw[var11], var2 + this.ay[var11] + var14, var3 + this.as[var11] + var15, var19, var13, var16, ad);
                     }
                  } else if (ac > 0) {
                     av += ac;
                     var2 += av >> 8;
                     av &= 255;
                  }

                  int var17 = this.ak[var11];
                  if (ao != -1) {
                     ej(var2, var3 + (int)((double)this.ae * 0.7D), var17, ao);
                  }

                  if (af != -1) {
                     ej(var2, var3 + this.ae, var17, af);
                  }

                  var2 += var17;
                  var8 = var11;
               }
            }
         }
      }

   }

   void bk(int var1, int var2) {
      ao = -1;
      af = -1;
      ar = var2;
      ab = var2;
      az = var1;
      ag = var1;
      ad = 256;
      ac = 0;
      av = 0;
   }

   void dm(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6 = var1.charAt(var5);
         if (var6 == '<') {
            var4 = true;
         } else if (var6 == '>') {
            var4 = false;
         } else if (!var4 && var6 == ' ') {
            ++var3;
         }
      }

      if (var3 > 0) {
         ac = (var2 - this.at(var1) << 8) / var3;
      }

   }

   public int bw(char var1) {
      if (var1 == 160) {
         var1 = ' ';
      }

      return this.ak[bm.ap(var1, (byte)38) & 255];
   }

   public int bi(String var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for(int var5 = 0; var5 < var1.length(); ++var5) {
            int var6 = var1.charAt(var5);
            if (var6 == 1136928364) {
               var2 = var5;
            } else {
               if (var6 == 62 && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var5);
                  var2 = -1;
                  if (var7.equals("lt")) {
                     var6 = 60;
                  } else {
                     if (!var7.equals("gt")) {
                        if (var7.startsWith("img=")) {
                           try {
                              int var8 = bj.aj(var7.substring(4), -1481777132);
                              var4 += au[var8].as;
                              var3 = -1;
                           } catch (Exception var9) {
                           }
                        }
                        continue;
                     }

                     var6 = 1372894649;
                  }
               }

               if (var6 == 160) {
                  var6 = 32;
               }

               if (var2 == -1) {
                  var4 += this.ak[(char)(bm.ap((char)var6, (byte)38) & 255)];
                  if (this.an != null && var3 != -1) {
                     var4 += this.an[(var3 << 8) + var6];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   static void dp(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * aa;
      int var7 = aa - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if (var2 < bv) {
         var10 = bv - var2;
         var4 -= var10;
         var2 = bv;
         var9 += var10 * var3;
         var6 += var10 * aa;
      }

      if (var2 + var4 > bx) {
         var4 -= var2 + var4 - bx;
      }

      if (var1 < bk) {
         var10 = bk - var1;
         var3 -= var10;
         var1 = bk;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if (var1 + var3 > bb) {
         var10 = var1 + var3 - bb;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if (var3 > 0 && var4 > 0) {
         by(al, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   public void ah(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         this.bk(var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.bj(var6, var1.length());
         }

         this.bz(var1, var2 - this.at(var1) / 2, var3, var7, (int[])null, (int[])null);
      }
   }

   public int bd(char var1) {
      if (var1 == -891382254) {
         var1 = 84674313;
      }

      return this.ak[bm.ap((char)var1, (byte)-63) & 1050353472];
   }

   public int be(String var1, int var2) {
      int var3 = this.au(var1, new int[]{var2}, aq);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.at(aq[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   public int cq(String var1, int var2) {
      return this.au(var1, new int[]{var2}, aq);
   }

   public static String cb(String var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 == '<' || var4 == '>') {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for(int var7 = 0; var7 < var1; ++var7) {
         char var5 = var0.charAt(var7);
         if (var5 == '<') {
            var6.append("<lt>");
         } else if (var5 == '>') {
            var6.append("<gt>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }

   public qg cd(int var1, int var2, String var3, int var4, int var5) {
      if (var3 != null && var3.length() >= var1 + var2) {
         int var6 = var4 - this.at(var3) / 2;
         var6 += this.at(var3.substring(0, var1));
         int var7 = var5 - this.am;
         int var8 = this.at(var3.substring(var1, var1 + var2));
         int var9 = this.am + this.at;
         return new qg(var6, var7, var8, var9);
      } else {
         return new qg(var4, var5, 0, 0);
      }
   }

   public void ci(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bk(var4, var5);
         this.bp(var1, var2, var3);
      }
   }

   public void cn(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.bk(var4, var5);
         ad = var6;
         this.bp(var1, var2, var3);
      }
   }

   public void co(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.bk(var4, var5);
         ad = var6;
         this.bp(var1, var2, var3);
      }
   }

   public void cf(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.bk(var4, var5);
         ad = var6;
         this.bp(var1, var2, var3);
      }
   }

   static void de(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * aa;
      int var8 = aa - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var2 < bv) {
         var11 = bv - var2;
         var4 -= var11;
         var2 = bv;
         var10 += var11 * var3;
         var7 += var11 * aa;
      }

      if (var2 + var4 > bx) {
         var4 -= var2 + var4 - bx;
      }

      if (var1 < bk) {
         var11 = bk - var1;
         var3 -= var11;
         var1 = bk;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var1 + var3 > bb) {
         var11 = var1 + var3 - bb;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var3 > 0 && var4 > 0) {
         bn(al, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   public uy cg(qb var1, int var2, int var3, int var4, int var5, int var6) {
      if (!var1.ak((byte)1)) {
         this.bk(var4, var5);
         var3 -= this.ae;

         for(int var7 = 0; var7 < var1.aj((byte)0); ++var7) {
            qm var8 = var1.ae(var7, (byte)-16);
            if (var6 != -1 && var8.ak * 1818523521 > var6) {
               return new uy(var8.aw * 1773645758, var8.ak * 514229158);
            }

            int var9 = var8.ap;
            if (var9 != 10) {
               if (var1.aw(var7, 999442347)) {
                  var9 = -696730146;
               }

               if (var9 != 9) {
                  if (var9 == 1053615026) {
                     var9 = 32;
                  }

                  int var10 = var2 + var8.aw * 217408337;
                  int var11 = var3 + var8.ak * 1818523521;
                  int var12 = this.aj[var9];
                  int var13 = this.ai[var9];
                  if (ab != -1) {
                     this.ap(this.aw[var9], var10 + this.ay[var9] + 1, var11 + this.as[var9] + 1, var12, var13, ab);
                  }

                  this.ap(this.aw[var9], var10 + this.ay[var9], var11 + this.as[var9], var12, var13, ag);
               }
            }
         }
      }

      return var1.as((byte)60);
   }

   public void cw(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
      if (var1 != null) {
         this.bk(var4, var5);
         int[] var9 = null;
         if (var8 != null) {
            var9 = this.bj(var8, var1.length());
         }

         double var10 = 7.0D - (double)var7 / 8.0D;
         if (var10 < 0.0D) {
            var10 = 0.0D;
         }

         int[] var12 = new int[var1.length()];

         for(int var13 = 0; var13 < var1.length(); ++var13) {
            var12[var13] = (int)(Math.sin((double)var13 / 1.5D + (double)var6 / 1.0D) * var10);
         }

         this.bz(var1, var2 - this.at(var1) / 2, var3, var9, (int[])null, var12);
      }
   }

   public int cy(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      return this.av(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
   }

   public int cu(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      return this.av(var1, var2, var3, var4, var5, var6, var7, -811880747, var8, var9, var10);
   }

   public int ce(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var1 == null) {
         return 0;
      } else {
         if (var8 == -409560574) {
            var8 = 256;
         }

         this.bk(var6, var7);
         ad = var8;
         if (var11 == 0) {
            var11 = this.ae;
         }

         int[] var12 = new int[]{var4};
         if (var5 < this.am + this.at + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = this.au(var1, var12, aq);
         if (var10 == 3 && var13 == 1) {
            var10 = 1;
         }

         int var14;
         int var15;
         if (var10 == 0) {
            var14 = var3 + this.am;
         } else if (var10 == 1) {
            var14 = var3 + this.am + (var5 - this.am - this.at - (var13 - 1) * var11) / 2;
         } else if (var10 == 2) {
            var14 = var3 + var5 - this.at - (var13 - 1) * var11;
         } else {
            var15 = (var5 - this.am - this.at - (var13 - 1) * var11) / (var13 + 1);
            if (var15 < 0) {
               var15 = 0;
            }

            var14 = var3 + this.am + var15;
            var11 += var15;
         }

         for(var15 = 0; var15 < var13; ++var15) {
            if (var9 == 0) {
               this.bp(aq[var15], var2, var14);
            } else if (var9 == 1) {
               this.bp(aq[var15], var2 + (var4 - this.at(aq[var15])) / 2, var14);
            } else if (var9 == 2) {
               this.bp(aq[var15], var2 + var4 - this.at(aq[var15]), var14);
            } else if (var15 == var13 - 1) {
               this.bp(aq[var15], var2, var14);
            } else {
               this.bq(aq[var15], var4);
               this.bp(aq[var15], var2, var14);
               ac = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   abstract void ak(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   public uy cx(qb var1, int var2, int var3, int var4, int var5, int var6) {
      if (!var1.ak((byte)1)) {
         this.bk(var4, var5);
         var3 -= this.ae;

         for(int var7 = 0; var7 < var1.aj((byte)0); ++var7) {
            qm var8 = var1.ae(var7, (byte)-91);
            if (var6 != -1 && var8.ak * 1818523521 > var6) {
               return new uy(var8.aw * 217408337, var8.ak * 1818523521);
            }

            int var9 = var8.ap;
            if (var9 != 10) {
               if (var1.aw(var7, -824549011)) {
                  var9 = -1985661139;
               }

               if (var9 != 9) {
                  if (var9 == 160) {
                     var9 = 32;
                  }

                  int var10 = var2 + var8.aw * 948970970;
                  int var11 = var3 + var8.ak * -966792722;
                  int var12 = this.aj[var9];
                  int var13 = this.ai[var9];
                  if (ab != -1) {
                     this.ap(this.aw[var9], var10 + this.ay[var9] + 1, var11 + this.as[var9] + 1, var12, var13, ab);
                  }

                  this.ap(this.aw[var9], var10 + this.ay[var9], var11 + this.as[var9], var12, var13, ag);
               }
            }
         }
      }

      return var1.as((byte)86);
   }

   void dk(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6 = var1.charAt(var5);
         if (var6 == '<') {
            var4 = true;
         } else if (var6 == 2080497688) {
            var4 = false;
         } else if (!var4 && var6 == 1596236840) {
            ++var3;
         }
      }

      if (var3 > 0) {
         ac = (var2 - this.at(var1) << 8) / var3;
      }

   }

   public void ch(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         this.bk(var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.bj(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];

         for(int var10 = 0; var10 < var1.length(); ++var10) {
            var9[var10] = (int)(Math.sin((double)var10 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.bz(var1, var2 - this.at(var1) / 2, var3, var8, (int[])null, var9);
      }
   }

   static int bo(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if (var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if (var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if (var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for(int var18 = var11; var18 < var12; ++var18) {
         int var19 = var14[var16++] + var15[var17++];
         if (var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   public void cc(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         this.bk(var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.bj(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];
         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var9[var11] = (int)(Math.sin((double)var11 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var10[var11] = (int)(Math.sin((double)var11 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.bz(var1, var2 - this.at(var1) / 2, var3, var8, var9, var10);
      }
   }

   public void cj(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         this.bk(var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.bj(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];
         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var9[var11] = (int)(Math.sin((double)var11 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var10[var11] = (int)(Math.sin((double)var11 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.bz(var1, var2 - this.at(var1) / 2, var3, var8, var9, var10);
      }
   }

   public void cm(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
      if (var1 != null) {
         this.bk(var4, var5);
         int[] var9 = null;
         if (var8 != null) {
            var9 = this.bj(var8, var1.length());
         }

         double var10 = 7.0D - (double)var7 / 8.0D;
         if (var10 < 0.0D) {
            var10 = 0.0D;
         }

         int[] var12 = new int[var1.length()];

         for(int var13 = 0; var13 < var1.length(); ++var13) {
            var12[var13] = (int)(Math.sin((double)var13 / 1.5D + (double)var6 / 1.0D) * var10);
         }

         this.bz(var1, var2 - this.at(var1) / 2, var3, var9, (int[])null, var12);
      }
   }

   static void di(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & '\uff00') * var9 & 16711680) >> 8;
      var9 = 256 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & '\uff00') * var9 & 16711680) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void ca(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         this.bk(var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.bj(var6, var1.length());
         }

         this.bz(var1, var2 - this.at(var1) / 2, var3, var7, (int[])null, (int[])null);
      }
   }

   public void cs(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         this.bk(var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.bj(var6, var1.length());
         }

         this.bz(var1, var2 - this.at(var1) / 2, var3, var7, (int[])null, (int[])null);
      }
   }

   public void cr(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         this.bk(var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.bj(var6, var1.length());
         }

         this.bz(var1, var2, var3, var7, (int[])null, (int[])null);
      }
   }

   public int av(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var1 == null) {
         return 0;
      } else {
         if (var8 == 255) {
            var8 = 256;
         }

         this.bk(var6, var7);
         ad = var8;
         if (var11 == 0) {
            var11 = this.ae;
         }

         int[] var12 = new int[]{var4};
         if (var5 < this.am + this.at + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = this.au(var1, var12, aq);
         if (var10 == 3 && var13 == 1) {
            var10 = 1;
         }

         int var14;
         int var15;
         if (var10 == 0) {
            var14 = var3 + this.am;
         } else if (var10 == 1) {
            var14 = var3 + this.am + (var5 - this.am - this.at - (var13 - 1) * var11) / 2;
         } else if (var10 == 2) {
            var14 = var3 + var5 - this.at - (var13 - 1) * var11;
         } else {
            var15 = (var5 - this.am - this.at - (var13 - 1) * var11) / (var13 + 1);
            if (var15 < 0) {
               var15 = 0;
            }

            var14 = var3 + this.am + var15;
            var11 += var15;
         }

         for(var15 = 0; var15 < var13; ++var15) {
            if (var9 == 0) {
               this.bp(aq[var15], var2, var14);
            } else if (var9 == 1) {
               this.bp(aq[var15], var2 + (var4 - this.at(aq[var15])) / 2, var14);
            } else if (var9 == 2) {
               this.bp(aq[var15], var2 + var4 - this.at(aq[var15]), var14);
            } else if (var15 == var13 - 1) {
               this.bp(aq[var15], var2, var14);
            } else {
               this.bq(aq[var15], var4);
               this.bp(aq[var15], var2, var14);
               ac = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   public void dq(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         this.bk(var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.bj(var6, var1.length());
         }

         this.bz(var1, var2, var3, var7, (int[])null, (int[])null);
      }
   }

   public void dd(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.bk(var4, var5);
         ax.setSeed((long)var6);
         ad = 192 + (ax.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = var8;
            if ((ax.nextInt() & 3) == 0) {
               ++var8;
            }
         }

         this.bz(var1, var2, var3, (int[])null, var7, (int[])null);
      }
   }

   static void dy(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public void da(int var1, int var2, int var3, int var4) {
      var3 -= this.ae;
      int var5 = var1 & 255;
      if (var5 != 1868773687) {
         this.ap(this.aw[var5], var2 + this.ay[var5], var3 + this.as[var5], this.aj[var5], this.ai[var5], var4);
      }

   }

   void dr(int var1, int var2) {
      ao = -1;
      af = -1;
      ar = var2;
      ab = var2;
      az = var1;
      ag = var1;
      ad = 256;
      ac = 0;
      av = 0;
   }

   void dh(String var1) {
      try {
         if (var1.startsWith("col=")) {
            ag = lj.ai(var1.substring(4), 16, (byte)1);
         } else if (var1.equals("/col")) {
            ag = az;
         } else if (var1.startsWith("str=")) {
            ao = lj.ai(var1.substring(4), 16, (byte)1);
         } else if (var1.equals("str")) {
            ao = -2079778905;
         } else if (var1.equals("/str")) {
            ao = -1;
         } else if (var1.startsWith("u=")) {
            af = lj.ai(var1.substring(2), 16, (byte)1);
         } else if (var1.equals("u")) {
            af = 0;
         } else if (var1.equals("/u")) {
            af = -1;
         } else if (var1.startsWith("shad=")) {
            ab = lj.ai(var1.substring(5), 16, (byte)1);
         } else if (var1.equals("shad")) {
            ab = 0;
         } else if (var1.equals("/shad")) {
            ab = ar;
         } else if (var1.equals("br")) {
            this.bk(az, ar);
         }
      } catch (Exception var3) {
      }

   }

   public void ct(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         this.bk(var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.bj(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];

         for(int var10 = 0; var10 < var1.length(); ++var10) {
            var9[var10] = (int)(Math.sin((double)var10 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.bz(var1, var2 - this.at(var1) / 2, var3, var8, (int[])null, var9);
      }
   }

   void df(String var1) {
      try {
         if (var1.startsWith("col=")) {
            ag = lj.ai(var1.substring(4), 16, (byte)1);
         } else if (var1.equals("/col")) {
            ag = az;
         } else if (var1.startsWith("str=")) {
            ao = lj.ai(var1.substring(4), 16, (byte)1);
         } else if (var1.equals("str")) {
            ao = 8388608;
         } else if (var1.equals("/str")) {
            ao = -1;
         } else if (var1.startsWith("u=")) {
            af = lj.ai(var1.substring(2), 16, (byte)1);
         } else if (var1.equals("u")) {
            af = 0;
         } else if (var1.equals("/u")) {
            af = -1;
         } else if (var1.startsWith("shad=")) {
            ab = lj.ai(var1.substring(5), 16, (byte)1);
         } else if (var1.equals("shad")) {
            ab = 0;
         } else if (var1.equals("/shad")) {
            ab = ar;
         } else if (var1.equals("br")) {
            this.bk(az, ar);
         }
      } catch (Exception var3) {
      }

   }

   void du(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6 = var1.charAt(var5);
         if (var6 == '<') {
            var4 = true;
         } else if (var6 == '>') {
            var4 = false;
         } else if (!var4 && var6 == ' ') {
            ++var3;
         }
      }

      if (var3 > 0) {
         ac = (var2 - this.at(var1) << 8) / var3;
      }

   }

   public void ck(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         this.bk(var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.bj(var6, var1.length());
         }

         this.bz(var1, var2, var3, var7, (int[])null, (int[])null);
      }
   }

   void dl(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6 = var1.charAt(var5);
         if (var6 == '<') {
            var4 = true;
         } else if (var6 == '>') {
            var4 = false;
         } else if (!var4 && var6 == ' ') {
            ++var3;
         }
      }

      if (var3 > 0) {
         ac = (var2 - this.at(var1) << 8) / var3;
      }

   }

   void bs(byte[] var1) {
      this.ak = new int[256];
      int var2;
      if (var1.length == 257) {
         for(var2 = 0; var2 < this.ak.length; ++var2) {
            this.ak[var2] = var1[var2] & 255;
         }

         this.ae = var1[256] & 255;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 256; ++var3) {
            this.ak[var3] = var1[var2++] & 255;
         }

         int[] var10 = new int[256];
         int[] var4 = new int[256];

         int var5;
         for(var5 = 0; var5 < 256; ++var5) {
            var10[var5] = var1[var2++] & 255;
         }

         for(var5 = 0; var5 < 256; ++var5) {
            var4[var5] = var1[var2++] & 255;
         }

         byte[][] var11 = new byte[256][];

         int var8;
         for(int var6 = 0; var6 < 256; ++var6) {
            var11[var6] = new byte[var10[var6]];
            byte var7 = 0;

            for(var8 = 0; var8 < var11[var6].length; ++var8) {
               var7 += var1[var2++];
               var11[var6][var8] = var7;
            }
         }

         byte[][] var12 = new byte[256][];

         int var13;
         for(var13 = 0; var13 < 256; ++var13) {
            var12[var13] = new byte[var10[var13]];
            byte var14 = 0;

            for(int var9 = 0; var9 < var12[var13].length; ++var9) {
               var14 += var1[var2++];
               var12[var13][var9] = var14;
            }
         }

         this.an = new byte[65536];

         for(var13 = 0; var13 < 256; ++var13) {
            if (var13 != 32 && var13 != 160) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if (var8 != 32 && var8 != 160) {
                     this.an[(var13 << 8) + var8] = (byte)ae(var11, var12, var4, this.ak, var10, var13, var8);
                  }
               }
            }
         }

         this.ae = var4[32] + var10[32];
      }

   }

   qa(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, byte[][] var6) {
      this.ay = var2;
      this.as = var3;
      this.aj = var4;
      this.ai = var5;
      this.as(var1);
      this.aw = var6;
      int var7 = Integer.MAX_VALUE;
      int var8 = Integer.MIN_VALUE;

      for(int var9 = 0; var9 < 256; ++var9) {
         if (this.as[var9] < var7 && this.ai[var9] != 0) {
            var7 = this.as[var9];
         }

         if (this.as[var9] + this.ai[var9] > var8) {
            var8 = this.as[var9] + this.ai[var9];
         }
      }

      this.am = this.ae - var7;
      this.at = var8 - this.ae;
   }

   public void cp(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bk(var4, var5);
         this.bp(var1, var2 - this.at(var1), var3);
      }
   }

   void ds(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
      var3 -= this.ae;
      int var7 = -1;
      int var8 = -1;
      int var9 = 0;

      for(int var10 = 0; var10 < var1.length(); ++var10) {
         if (var1.charAt(var10) != 0) {
            int var11 = (char)(bm.ap(var1.charAt(var10), (byte)54) & -1432429637);
            if (var11 == 1031033282) {
               var7 = var10;
            } else {
               int var13;
               int var14;
               int var15;
               if (var11 == 62 && var7 != -1) {
                  String var12 = var1.substring(var7 + 1, var10);
                  var7 = -1;
                  if (var12.equals("lt")) {
                     var11 = -165324627;
                  } else {
                     if (!var12.equals("gt")) {
                        if (var12.startsWith("img=")) {
                           try {
                              if (var5 != null) {
                                 var13 = var5[var9];
                              } else {
                                 var13 = 0;
                              }

                              if (var6 != null) {
                                 var14 = var6[var9];
                              } else {
                                 var14 = 0;
                              }

                              ++var9;
                              var15 = bj.aj(var12.substring(4), -1481777132);
                              vc var20 = au[var15];
                              var20.ak(var2 + var13, var3 + this.ae - var20.ae + var14);
                              var2 += var20.as;
                              var8 = -1;
                           } catch (Exception var18) {
                           }
                        } else {
                           this.bb(var12);
                        }
                        continue;
                     }

                     var11 = 62;
                  }
               }

               if (var11 == 160) {
                  var11 = 1443239326;
               }

               if (var7 == -1) {
                  if (this.an != null && var8 != -1) {
                     var2 += this.an[(var8 << 8) + var11];
                  }

                  int var19 = this.aj[var11];
                  var13 = this.ai[var11];
                  if (var5 != null) {
                     var14 = var5[var9];
                  } else {
                     var14 = 0;
                  }

                  if (var6 != null) {
                     var15 = var6[var9];
                  } else {
                     var15 = 0;
                  }

                  int var16;
                  if (var4 != null) {
                     var16 = var4[var9];
                  } else {
                     var16 = ag;
                  }

                  ++var9;
                  if (var11 != 1360312214) {
                     if (ad == 1882669891) {
                        if (ab != -1) {
                           bc(this.aw[var11], var2 + this.ay[var11] + 1 + var14, var3 + this.as[var11] + 1 + var15, var19, var13, ab);
                        }

                        this.ap(this.aw[var11], var2 + this.ay[var11] + var14, var3 + this.as[var11] + var15, var19, var13, var16);
                     } else {
                        if (ab != -1) {
                           br(this.aw[var11], var2 + this.ay[var11] + 1 + var14, var3 + this.as[var11] + 1 + var15, var19, var13, ab, ad);
                        }

                        this.aw(this.aw[var11], var2 + this.ay[var11] + var14, var3 + this.as[var11] + var15, var19, var13, var16, ad);
                     }
                  } else if (ac > 0) {
                     av += ac;
                     var2 += av >> 8;
                     av &= 1607602290;
                  }

                  int var17 = this.ak[var11];
                  if (ao != -1) {
                     ej(var2, var3 + (int)((double)this.ae * 0.7D), var17, ao);
                  }

                  if (af != -1) {
                     ej(var2, var3 + this.ae, var17, af);
                  }

                  var2 += var17;
                  var8 = var11;
               }
            }
         }
      }

   }

   public int ac(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      return this.av(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
   }

   void bp(String var1, int var2, int var3) {
      var3 -= this.ae;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if (var1.charAt(var6) != 0) {
            char var7 = (char)(bm.ap(var1.charAt(var6), (byte)-9) & 255);
            if (var7 == '<') {
               var4 = var6;
            } else {
               int var9;
               if (var7 == '>' && var4 != -1) {
                  String var8 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if (var8.equals("lt")) {
                     var7 = '<';
                  } else {
                     if (!var8.equals("gt")) {
                        if (var8.startsWith("img=")) {
                           try {
                              var9 = bj.aj(var8.substring(4), -1481777132);
                              vc var13 = au[var9];
                              var13.ak(var2, var3 + this.ae - var13.ae);
                              var2 += var13.as;
                              var5 = -1;
                           } catch (Exception var11) {
                           }
                        } else {
                           this.bb(var8);
                        }
                        continue;
                     }

                     var7 = '>';
                  }
               }

               if (var7 == 160) {
                  var7 = ' ';
               }

               if (var4 == -1) {
                  if (this.an != null && var5 != -1) {
                     var2 += this.an[(var5 << 8) + var7];
                  }

                  int var12 = this.aj[var7];
                  var9 = this.ai[var7];
                  if (var7 != ' ') {
                     if (ad == 256) {
                        if (ab != -1) {
                           bc(this.aw[var7], var2 + this.ay[var7] + 1, var3 + this.as[var7] + 1, var12, var9, ab);
                        }

                        this.ap(this.aw[var7], var2 + this.ay[var7], var3 + this.as[var7], var12, var9, ag);
                     } else {
                        if (ab != -1) {
                           br(this.aw[var7], var2 + this.ay[var7] + 1, var3 + this.as[var7] + 1, var12, var9, ab, ad);
                        }

                        this.aw(this.aw[var7], var2 + this.ay[var7], var3 + this.as[var7], var12, var9, ag, ad);
                     }
                  } else if (ac > 0) {
                     av += ac;
                     var2 += av >> 8;
                     av &= 255;
                  }

                  int var10 = this.ak[var7];
                  if (ao != -1) {
                     ej(var2, var3 + (int)((double)this.ae * 0.7D), var10, ao);
                  }

                  if (af != -1) {
                     ej(var2, var3 + this.ae + 1, var10, af);
                  }

                  var2 += var10;
                  var5 = var7;
               }
            }
         }
      }

   }

   void dv(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
      var3 -= this.ae;
      int var7 = -1;
      int var8 = -1;
      int var9 = 0;

      for(int var10 = 0; var10 < var1.length(); ++var10) {
         if (var1.charAt(var10) != 0) {
            int var11 = (char)(bm.ap(var1.charAt(var10), (byte)99) & -1480384741);
            if (var11 == 60) {
               var7 = var10;
            } else {
               int var13;
               int var14;
               int var15;
               if (var11 == 62 && var7 != -1) {
                  String var12 = var1.substring(var7 + 1, var10);
                  var7 = -1;
                  if (var12.equals("lt")) {
                     var11 = 1047867039;
                  } else {
                     if (!var12.equals("gt")) {
                        if (var12.startsWith("img=")) {
                           try {
                              if (var5 != null) {
                                 var13 = var5[var9];
                              } else {
                                 var13 = 0;
                              }

                              if (var6 != null) {
                                 var14 = var6[var9];
                              } else {
                                 var14 = 0;
                              }

                              ++var9;
                              var15 = bj.aj(var12.substring(4), -1481777132);
                              vc var20 = au[var15];
                              var20.ak(var2 + var13, var3 + this.ae - var20.ae + var14);
                              var2 += var20.as;
                              var8 = -1;
                           } catch (Exception var18) {
                           }
                        } else {
                           this.bb(var12);
                        }
                        continue;
                     }

                     var11 = 676820952;
                  }
               }

               if (var11 == -1941620207) {
                  var11 = 32;
               }

               if (var7 == -1) {
                  if (this.an != null && var8 != -1) {
                     var2 += this.an[(var8 << 8) + var11];
                  }

                  int var19 = this.aj[var11];
                  var13 = this.ai[var11];
                  if (var5 != null) {
                     var14 = var5[var9];
                  } else {
                     var14 = 0;
                  }

                  if (var6 != null) {
                     var15 = var6[var9];
                  } else {
                     var15 = 0;
                  }

                  int var16;
                  if (var4 != null) {
                     var16 = var4[var9];
                  } else {
                     var16 = ag;
                  }

                  ++var9;
                  if (var11 != -960155404) {
                     if (ad == -780938669) {
                        if (ab != -1) {
                           bc(this.aw[var11], var2 + this.ay[var11] + 1 + var14, var3 + this.as[var11] + 1 + var15, var19, var13, ab);
                        }

                        this.ap(this.aw[var11], var2 + this.ay[var11] + var14, var3 + this.as[var11] + var15, var19, var13, var16);
                     } else {
                        if (ab != -1) {
                           br(this.aw[var11], var2 + this.ay[var11] + 1 + var14, var3 + this.as[var11] + 1 + var15, var19, var13, ab, ad);
                        }

                        this.aw(this.aw[var11], var2 + this.ay[var11] + var14, var3 + this.as[var11] + var15, var19, var13, var16, ad);
                     }
                  } else if (ac > 0) {
                     av += ac;
                     var2 += av >> 8;
                     av &= -2114775219;
                  }

                  int var17 = this.ak[var11];
                  if (ao != -1) {
                     ej(var2, var3 + (int)((double)this.ae * 0.7D), var17, ao);
                  }

                  if (af != -1) {
                     ej(var2, var3 + this.ae, var17, af);
                  }

                  var2 += var17;
                  var8 = var11;
               }
            }
         }
      }

   }

   void dg(String var1) {
      try {
         if (var1.startsWith("col=")) {
            ag = lj.ai(var1.substring(4), 16, (byte)1);
         } else if (var1.equals("/col")) {
            ag = az;
         } else if (var1.startsWith("str=")) {
            ao = lj.ai(var1.substring(4), 16, (byte)1);
         } else if (var1.equals("str")) {
            ao = -1836849639;
         } else if (var1.equals("/str")) {
            ao = -1;
         } else if (var1.startsWith("u=")) {
            af = lj.ai(var1.substring(2), 16, (byte)1);
         } else if (var1.equals("u")) {
            af = 0;
         } else if (var1.equals("/u")) {
            af = -1;
         } else if (var1.startsWith("shad=")) {
            ab = lj.ai(var1.substring(5), 16, (byte)1);
         } else if (var1.equals("shad")) {
            ab = 0;
         } else if (var1.equals("/shad")) {
            ab = ar;
         } else if (var1.equals("br")) {
            this.bk(az, ar);
         }
      } catch (Exception var3) {
      }

   }

   public uy cz(qb var1, int var2, int var3, int var4, int var5, int var6) {
      if (!var1.ak((byte)1)) {
         this.bk(var4, var5);
         var3 -= this.ae;

         for(int var7 = 0; var7 < var1.aj((byte)0); ++var7) {
            qm var8 = var1.ae(var7, (byte)-72);
            if (var6 != -1 && var8.ak * -1760758661 > var6) {
               return new uy(var8.aw * -2084263277, var8.ak * -10133348);
            }

            char var9 = var8.ap;
            if (var9 != '\n') {
               if (var1.aw(var7, 682071843)) {
                  var9 = '*';
               }

               if (var9 != '\t') {
                  if (var9 == 160) {
                     var9 = ' ';
                  }

                  int var10 = var2 + var8.aw * 217408337;
                  int var11 = var3 + var8.ak * 1818523521;
                  int var12 = this.aj[var9];
                  int var13 = this.ai[var9];
                  if (ab != -1) {
                     this.ap(this.aw[var9], var10 + this.ay[var9] + 1, var11 + this.as[var9] + 1, var12, var13, ab);
                  }

                  this.ap(this.aw[var9], var10 + this.ay[var9], var11 + this.as[var9], var12, var13, ag);
               }
            }
         }
      }

      return var1.as((byte)122);
   }

   static void do(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * aa;
      int var8 = aa - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var2 < bv) {
         var11 = bv - var2;
         var4 -= var11;
         var2 = bv;
         var10 += var11 * var3;
         var7 += var11 * aa;
      }

      if (var2 + var4 > bx) {
         var4 -= var2 + var4 - bx;
      }

      if (var1 < bk) {
         var11 = bk - var1;
         var3 -= var11;
         var1 = bk;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var1 + var3 > bb) {
         var11 = var1 + var3 - bb;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var3 > 0 && var4 > 0) {
         bn(al, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   static void dw(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * aa;
      int var8 = aa - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var2 < bv) {
         var11 = bv - var2;
         var4 -= var11;
         var2 = bv;
         var10 += var11 * var3;
         var7 += var11 * aa;
      }

      if (var2 + var4 > bx) {
         var4 -= var2 + var4 - bx;
      }

      if (var1 < bk) {
         var11 = bk - var1;
         var3 -= var11;
         var1 = bk;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var1 + var3 > bb) {
         var11 = var1 + var3 - bb;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var3 > 0 && var4 > 0) {
         bn(al, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   public int ba(char var1) {
      if (var1 == 160) {
         var1 = ' ';
      }

      return this.ak[bm.ap(var1, (byte)88) & 255];
   }

   static void dz(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * aa;
      int var8 = aa - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var2 < bv) {
         var11 = bv - var2;
         var4 -= var11;
         var2 = bv;
         var10 += var11 * var3;
         var7 += var11 * aa;
      }

      if (var2 + var4 > bx) {
         var4 -= var2 + var4 - bx;
      }

      if (var1 < bk) {
         var11 = bk - var1;
         var3 -= var11;
         var1 = bk;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var1 + var3 > bb) {
         var11 = var1 + var3 - bb;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var3 > 0 && var4 > 0) {
         bn(al, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   public void aq(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         this.bk(var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.bj(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];

         for(int var10 = 0; var10 < var1.length(); ++var10) {
            var9[var10] = (int)(Math.sin((double)var10 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.bz(var1, var2 - this.at(var1) / 2, var3, var8, (int[])null, var9);
      }
   }
}
