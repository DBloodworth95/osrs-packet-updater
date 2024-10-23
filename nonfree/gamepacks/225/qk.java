import java.util.Random;

public abstract class qk extends vr {
   int[] am;
   static final int ac = 256;
   int[] ag;
   static int as = 0;
   int[] ax;
   int[] aq;
   int[] af;
   public int at = 0;
   public int au;
   public int ar;
   static String[] av = new String[100];
   byte[] ad;
   static int ah = -1;
   static int ap = -1;
   static int ab = -1;
   static int az = -1;
   static int aa = 0;
   byte[][] ae = new byte[256][];
   static int ao = 256;
   static Random aj = new Random();
   static int ay = 0;
   static int ai = 0;
   public static vt[] al;

   public int cd(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      return this.av(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
   }

   static void bb(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

   static void el(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * an;
      int var7 = an - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if (var2 < bd) {
         var10 = bd - var2;
         var4 -= var10;
         var2 = bd;
         var9 += var10 * var3;
         var6 += var10 * an;
      }

      if (var2 + var4 > bx) {
         var4 -= var2 + var4 - bx;
      }

      if (var1 < bf) {
         var10 = bf - var1;
         var3 -= var10;
         var1 = bf;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if (var1 + var3 > bm) {
         var10 = var1 + var3 - bm;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if (var3 > 0 && var4 > 0) {
         bb(aw, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   public ue aw(qw var1, int var2, int var3, int var4, int var5, int var6) {
      if (!var1.ag(202322513)) {
         this.bs(var4, var5);
         var3 -= this.at;

         for(int var7 = 0; var7 < var1.am((byte)101); ++var7) {
            qe var8 = var1.at(var7, (byte)-96);
            if (var6 != -1 && var8.ag * -551300041 > var6) {
               return new ue(var8.ae * -1919488791, var8.ag * -551300041);
            }

            char var9 = var8.ac;
            if (var9 != '\n') {
               if (var1.ae(var7, -1693093212)) {
                  var9 = '*';
               }

               if (var9 != '\t') {
                  if (var9 == 160) {
                     var9 = ' ';
                  }

                  int var10 = var2 + var8.ae * -1919488791;
                  int var11 = var3 + var8.ag * -551300041;
                  int var12 = this.am[var9];
                  int var13 = this.ax[var9];
                  if (az != -1) {
                     this.ac(this.ae[var9], var10 + this.aq[var9] + 1, var11 + this.af[var9] + 1, var12, var13, az);
                  }

                  this.ac(this.ae[var9], var10 + this.aq[var9], var11 + this.af[var9], var12, var13, ai);
               }
            }
         }
      }

      return var1.af((byte)49);
   }

   public int al(char var1) {
      if (var1 == 160) {
         var1 = ' ';
      }

      return this.ag[il.ac(var1, 1169786355) & 255];
   }

   public int ad(String var1) {
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
                              int var8 = ir.ag(var7.substring(4), 1473180947);
                              var4 += al[var8].af;
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
                  var4 += this.ag[(char)(il.ac(var6, 1169786355) & 255)];
                  if (this.ad != null && var3 != -1) {
                     var4 += this.ad[(var3 << 8) + var6];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   public int ah(String var1, int[] var2, String[] var3) {
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
                     var4 += this.al('<');
                     if (this.ad != null && var11 != -1) {
                        var4 += this.ad[(var11 << 8) + 60];
                     }

                     var11 = '<';
                  } else if (var16.equals("gt")) {
                     var4 += this.al('>');
                     if (this.ad != null && var11 != -1) {
                        var4 += this.ad[(var11 << 8) + 62];
                     }

                     var11 = '>';
                  } else if (var16.startsWith("img=")) {
                     try {
                        int var17 = ir.ag(var16.substring(4), 1473180947);
                        var4 += al[var17].af;
                        var11 = 0;
                     } catch (Exception var18) {
                     }
                  }

                  var15 = 0;
               }

               if (var10 == -1) {
                  if (var15 != 0) {
                     var6.append(var15);
                     var4 += this.al(var15);
                     if (this.ad != null && var11 != -1) {
                        var4 += this.ad[(var11 << 8) + var15];
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

   void bl(byte[] var1) {
      this.ag = new int[256];
      int var2;
      if (var1.length == 257) {
         for(var2 = 0; var2 < this.ag.length; ++var2) {
            this.ag[var2] = var1[var2] & 255;
         }

         this.at = var1[256] & 255;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 256; ++var3) {
            this.ag[var3] = var1[var2++] & 255;
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

         this.ad = new byte[65536];

         for(var13 = 0; var13 < 256; ++var13) {
            if (var13 != 32 && var13 != 160) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if (var8 != 32 && var8 != 160) {
                     this.ad[(var13 << 8) + var8] = (byte)ar(var11, var12, var4, this.ag, var10, var13, var8);
                  }
               }
            }
         }

         this.at = var4[32] + var10[32];
      }

   }

   public int ab(String var1, int var2) {
      return this.ah(var1, new int[]{var2}, av);
   }

   public static String az(String var0) {
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

   public qy aa(int var1, int var2, String var3, int var4, int var5) {
      if (var3 != null && var3.length() >= var1 + var2) {
         int var6 = var4 - this.ad(var3) / 2;
         var6 += this.ad(var3.substring(0, var1));
         int var7 = var5 - this.au;
         int var8 = this.ad(var3.substring(var1, var1 + var2));
         int var9 = this.au + this.ar;
         return new qy(var6, var7, var8, var9);
      } else {
         return new qy(var4, var5, 0, 0);
      }
   }

   public void ai(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bs(var4, var5);
         this.bj(var1, var2, var3);
      }
   }

   void bw(String var1) {
      try {
         if (var1.startsWith("col=")) {
            ai = at.am(var1.substring(4), 16, -1045579467);
         } else if (var1.equals("/col")) {
            ai = aa;
         } else if (var1.startsWith("str=")) {
            ah = at.am(var1.substring(4), 16, -649785087);
         } else if (var1.equals("str")) {
            ah = 8388608;
         } else if (var1.equals("/str")) {
            ah = -1;
         } else if (var1.startsWith("u=")) {
            ap = at.am(var1.substring(2), 16, -854985657);
         } else if (var1.equals("u")) {
            ap = 0;
         } else if (var1.equals("/u")) {
            ap = -1;
         } else if (var1.startsWith("shad=")) {
            az = at.am(var1.substring(5), 16, 25930070);
         } else if (var1.equals("shad")) {
            az = 0;
         } else if (var1.equals("/shad")) {
            az = ab;
         } else if (var1.equals("br")) {
            this.bs(aa, ab);
         }
      } catch (Exception var3) {
      }

   }

   static void eo(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * an;
      int var7 = an - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if (var2 < bd) {
         var10 = bd - var2;
         var4 -= var10;
         var2 = bd;
         var9 += var10 * var3;
         var6 += var10 * an;
      }

      if (var2 + var4 > bx) {
         var4 -= var2 + var4 - bx;
      }

      if (var1 < bf) {
         var10 = bf - var1;
         var3 -= var10;
         var1 = bf;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if (var1 + var3 > bm) {
         var10 = var1 + var3 - bm;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if (var3 > 0 && var4 > 0) {
         bb(aw, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   abstract void ae(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public int aj(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      return this.av(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
   }

   qk(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      this.aq = var2;
      this.af = var3;
      this.am = var4;
      this.ax = var5;
      this.au(var1);
      this.ae = var7;
      int var8 = Integer.MAX_VALUE;
      int var9 = Integer.MIN_VALUE;

      for(int var10 = 0; var10 < 256; ++var10) {
         if (this.af[var10] < var8 && this.ax[var10] != 0) {
            var8 = this.af[var10];
         }

         if (this.af[var10] + this.ax[var10] > var9) {
            var9 = this.af[var10] + this.ax[var10];
         }
      }

      this.au = this.at - var8;
      this.ar = var9 - this.at;
   }

   void bz(byte[] var1) {
      this.ag = new int[256];
      int var2;
      if (var1.length == -431798986) {
         for(var2 = 0; var2 < this.ag.length; ++var2) {
            this.ag[var2] = var1[var2] & 255;
         }

         this.at = var1[785071795] & 255;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < -1462134963; ++var3) {
            this.ag[var3] = var1[var2++] & 255;
         }

         int[] var10 = new int[256];
         int[] var4 = new int[1104291847];

         int var5;
         for(var5 = 0; var5 < 857108605; ++var5) {
            var10[var5] = var1[var2++] & 255;
         }

         for(var5 = 0; var5 < 1609101386; ++var5) {
            var4[var5] = var1[var2++] & 255;
         }

         byte[][] var11 = new byte[256][];

         int var8;
         for(int var6 = 0; var6 < -1439180554; ++var6) {
            var11[var6] = new byte[var10[var6]];
            byte var7 = 0;

            for(var8 = 0; var8 < var11[var6].length; ++var8) {
               var7 += var1[var2++];
               var11[var6][var8] = var7;
            }
         }

         byte[][] var12 = new byte[-977868422][];

         int var13;
         for(var13 = 0; var13 < 256; ++var13) {
            var12[var13] = new byte[var10[var13]];
            byte var14 = 0;

            for(int var9 = 0; var9 < var12[var13].length; ++var9) {
               var14 += var1[var2++];
               var12[var13][var9] = var14;
            }
         }

         this.ad = new byte[65536];

         for(var13 = 0; var13 < -1464461645; ++var13) {
            if (var13 != -1885540647 && var13 != 1008459774) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if (var8 != 32 && var8 != -858188551) {
                     this.ad[(var13 << 8) + var8] = (byte)ar(var11, var12, var4, this.ag, var10, var13, var8);
                  }
               }
            }
         }

         this.at = var4[140017784] + var10[791497779];
      }

   }

   abstract void ax(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   static void em(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

   static void eb(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

   public void ds(int var1, int var2, int var3, int var4) {
      var3 -= this.at;
      int var5 = var1 & 255;
      if (var5 != 32) {
         this.ac(this.ae[var5], var2 + this.aq[var5], var3 + this.af[var5], this.am[var5], this.ax[var5], var4);
      }

   }

   public void bd(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         this.bs(var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.bx(var6, var1.length());
         }

         this.bp(var1, var2, var3, var7, (int[])null, (int[])null);
      }
   }

   int[] bx(int[] var1, int var2) {
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

   public void bf(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.bs(var4, var5);
         aj.setSeed((long)var6);
         ao = 192 + (aj.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = var8;
            if ((aj.nextInt() & 3) == 0) {
               ++var8;
            }
         }

         this.bp(var1, var2, var3, (int[])null, var7, (int[])null);
      }
   }

   public void bm(int var1, int var2, int var3, int var4) {
      var3 -= this.at;
      int var5 = var1 & 255;
      if (var5 != 32) {
         this.ac(this.ae[var5], var2 + this.aq[var5], var3 + this.af[var5], this.am[var5], this.ax[var5], var4);
      }

   }

   void bs(int var1, int var2) {
      ah = -1;
      ap = -1;
      ab = var2;
      az = var2;
      aa = var1;
      ai = var1;
      ao = 256;
      as = 0;
      ay = 0;
   }

   static void es(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * an;
      int var8 = an - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var2 < bd) {
         var11 = bd - var2;
         var4 -= var11;
         var2 = bd;
         var10 += var11 * var3;
         var7 += var11 * an;
      }

      if (var2 + var4 > bx) {
         var4 -= var2 + var4 - bx;
      }

      if (var1 < bf) {
         var11 = bf - var1;
         var3 -= var11;
         var1 = bf;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var1 + var3 > bm) {
         var11 = var1 + var3 - bm;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var3 > 0 && var4 > 0) {
         bg(aw, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   public void cz(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bs(var4, var5);
         this.bj(var1, var2 - this.ad(var1), var3);
      }
   }

   void bj(String var1, int var2, int var3) {
      var3 -= this.at;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if (var1.charAt(var6) != 0) {
            char var7 = (char)(il.ac(var1.charAt(var6), 1169786355) & 255);
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
                              var9 = ir.ag(var8.substring(4), 1473180947);
                              vt var13 = al[var9];
                              var13.ag(var2, var3 + this.at - var13.at);
                              var2 += var13.af;
                              var5 = -1;
                           } catch (Exception var11) {
                           }
                        } else {
                           this.bw(var8);
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
                  if (this.ad != null && var5 != -1) {
                     var2 += this.ad[(var5 << 8) + var7];
                  }

                  int var12 = this.am[var7];
                  var9 = this.ax[var7];
                  if (var7 != ' ') {
                     if (ao == 256) {
                        if (az != -1) {
                           by(this.ae[var7], var2 + this.aq[var7] + 1, var3 + this.af[var7] + 1, var12, var9, az);
                        }

                        this.ac(this.ae[var7], var2 + this.aq[var7], var3 + this.af[var7], var12, var9, ai);
                     } else {
                        if (az != -1) {
                           bi(this.ae[var7], var2 + this.aq[var7] + 1, var3 + this.af[var7] + 1, var12, var9, az, ao);
                        }

                        this.ae(this.ae[var7], var2 + this.aq[var7], var3 + this.af[var7], var12, var9, ai, ao);
                     }
                  } else if (as > 0) {
                     ay += as;
                     var2 += ay >> 8;
                     ay &= 255;
                  }

                  int var10 = this.ag[var7];
                  if (ah != -1) {
                     fn(var2, var3 + (int)((double)this.at * 0.7D), var10, ah);
                  }

                  if (ap != -1) {
                     fn(var2, var3 + this.at + 1, var10, ap);
                  }

                  var2 += var10;
                  var5 = var7;
               }
            }
         }
      }

   }

   void bp(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
      var3 -= this.at;
      int var7 = -1;
      int var8 = -1;
      int var9 = 0;

      for(int var10 = 0; var10 < var1.length(); ++var10) {
         if (var1.charAt(var10) != 0) {
            char var11 = (char)(il.ac(var1.charAt(var10), 1169786355) & 255);
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
                              var15 = ir.ag(var12.substring(4), 1473180947);
                              vt var20 = al[var15];
                              var20.ag(var2 + var13, var3 + this.at - var20.at + var14);
                              var2 += var20.af;
                              var8 = -1;
                           } catch (Exception var18) {
                           }
                        } else {
                           this.bw(var12);
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
                  if (this.ad != null && var8 != -1) {
                     var2 += this.ad[(var8 << 8) + var11];
                  }

                  int var19 = this.am[var11];
                  var13 = this.ax[var11];
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
                     var16 = ai;
                  }

                  ++var9;
                  if (var11 != ' ') {
                     if (ao == 256) {
                        if (az != -1) {
                           by(this.ae[var11], var2 + this.aq[var11] + 1 + var14, var3 + this.af[var11] + 1 + var15, var19, var13, az);
                        }

                        this.ac(this.ae[var11], var2 + this.aq[var11] + var14, var3 + this.af[var11] + var15, var19, var13, var16);
                     } else {
                        if (az != -1) {
                           bi(this.ae[var11], var2 + this.aq[var11] + 1 + var14, var3 + this.af[var11] + 1 + var15, var19, var13, az, ao);
                        }

                        this.ae(this.ae[var11], var2 + this.aq[var11] + var14, var3 + this.af[var11] + var15, var19, var13, var16, ao);
                     }
                  } else if (as > 0) {
                     ay += as;
                     var2 += ay >> 8;
                     ay &= 255;
                  }

                  int var17 = this.ag[var11];
                  if (ah != -1) {
                     fn(var2, var3 + (int)((double)this.at * 0.7D), var17, ah);
                  }

                  if (ap != -1) {
                     fn(var2, var3 + this.at, var17, ap);
                  }

                  var2 += var17;
                  var8 = var11;
               }
            }
         }
      }

   }

   void ei(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
      var3 -= this.at;
      int var7 = -1;
      int var8 = -1;
      int var9 = 0;

      for(int var10 = 0; var10 < var1.length(); ++var10) {
         if (var1.charAt(var10) != 0) {
            char var11 = (char)(il.ac(var1.charAt(var10), 1169786355) & 255);
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
                              var15 = ir.ag(var12.substring(4), 1473180947);
                              vt var20 = al[var15];
                              var20.ag(var2 + var13, var3 + this.at - var20.at + var14);
                              var2 += var20.af;
                              var8 = -1;
                           } catch (Exception var18) {
                           }
                        } else {
                           this.bw(var12);
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
                  if (this.ad != null && var8 != -1) {
                     var2 += this.ad[(var8 << 8) + var11];
                  }

                  int var19 = this.am[var11];
                  var13 = this.ax[var11];
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
                     var16 = ai;
                  }

                  ++var9;
                  if (var11 != ' ') {
                     if (ao == 256) {
                        if (az != -1) {
                           by(this.ae[var11], var2 + this.aq[var11] + 1 + var14, var3 + this.af[var11] + 1 + var15, var19, var13, az);
                        }

                        this.ac(this.ae[var11], var2 + this.aq[var11] + var14, var3 + this.af[var11] + var15, var19, var13, var16);
                     } else {
                        if (az != -1) {
                           bi(this.ae[var11], var2 + this.aq[var11] + 1 + var14, var3 + this.af[var11] + 1 + var15, var19, var13, az, ao);
                        }

                        this.ae(this.ae[var11], var2 + this.aq[var11] + var14, var3 + this.af[var11] + var15, var19, var13, var16, ao);
                     }
                  } else if (as > 0) {
                     ay += as;
                     var2 += ay >> 8;
                     ay &= 255;
                  }

                  int var17 = this.ag[var11];
                  if (ah != -1) {
                     fn(var2, var3 + (int)((double)this.at * 0.7D), var17, ah);
                  }

                  if (ap != -1) {
                     fn(var2, var3 + this.at, var17, ap);
                  }

                  var2 += var17;
                  var8 = var11;
               }
            }
         }
      }

   }

   public int av(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var1 == null) {
         return 0;
      } else {
         if (var8 == 255) {
            var8 = 256;
         }

         this.bs(var6, var7);
         ao = var8;
         if (var11 == 0) {
            var11 = this.at;
         }

         int[] var12 = new int[]{var4};
         if (var5 < this.au + this.ar + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = this.ah(var1, var12, av);
         if (var10 == 3 && var13 == 1) {
            var10 = 1;
         }

         int var14;
         int var15;
         if (var10 == 0) {
            var14 = var3 + this.au;
         } else if (var10 == 1) {
            var14 = var3 + this.au + (var5 - this.au - this.ar - (var13 - 1) * var11) / 2;
         } else if (var10 == 2) {
            var14 = var3 + var5 - this.ar - (var13 - 1) * var11;
         } else {
            var15 = (var5 - this.au - this.ar - (var13 - 1) * var11) / (var13 + 1);
            if (var15 < 0) {
               var15 = 0;
            }

            var14 = var3 + this.au + var15;
            var11 += var15;
         }

         for(var15 = 0; var15 < var13; ++var15) {
            if (var9 == 0) {
               this.bj(av[var15], var2, var14);
            } else if (var9 == 1) {
               this.bj(av[var15], var2 + (var4 - this.ad(av[var15])) / 2, var14);
            } else if (var9 == 2) {
               this.bj(av[var15], var2 + var4 - this.ad(av[var15]), var14);
            } else if (var15 == var13 - 1) {
               this.bj(av[var15], var2, var14);
            } else {
               this.ba(av[var15], var4);
               this.bj(av[var15], var2, var14);
               as = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   public int bq(String var1) {
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
                              int var8 = ir.ag(var7.substring(4), 1473180947);
                              var4 += al[var8].af;
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
                  var4 += this.ag[(char)(il.ac(var6, 1169786355) & 255)];
                  if (this.ad != null && var3 != -1) {
                     var4 += this.ad[(var3 << 8) + var6];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   public int cm(String var1, int var2) {
      int var3 = this.ah(var1, new int[]{var2}, av);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.ad(av[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   static void bi(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * an;
      int var8 = an - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var2 < bd) {
         var11 = bd - var2;
         var4 -= var11;
         var2 = bd;
         var10 += var11 * var3;
         var7 += var11 * an;
      }

      if (var2 + var4 > bx) {
         var4 -= var2 + var4 - bx;
      }

      if (var1 < bf) {
         var11 = bf - var1;
         var3 -= var11;
         var1 = bf;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var1 + var3 > bm) {
         var11 = var1 + var3 - bm;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var3 > 0 && var4 > 0) {
         bg(aw, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   static void bg(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
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

   abstract void ag(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   abstract void am(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   static void er(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * an;
      int var8 = an - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var2 < bd) {
         var11 = bd - var2;
         var4 -= var11;
         var2 = bd;
         var10 += var11 * var3;
         var7 += var11 * an;
      }

      if (var2 + var4 > bx) {
         var4 -= var2 + var4 - bx;
      }

      if (var1 < bf) {
         var11 = bf - var1;
         var3 -= var11;
         var1 = bf;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var1 + var3 > bm) {
         var11 = var1 + var3 - bm;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var3 > 0 && var4 > 0) {
         bg(aw, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   abstract void aq(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public int ap(String var1, int var2) {
      int var3 = this.ah(var1, new int[]{var2}, av);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.ad(av[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   void eh(String var1, int var2, int var3) {
      var3 -= this.at;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if (var1.charAt(var6) != 0) {
            char var7 = (char)(il.ac(var1.charAt(var6), 1169786355) & 255);
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
                              var9 = ir.ag(var8.substring(4), 1473180947);
                              vt var13 = al[var9];
                              var13.ag(var2, var3 + this.at - var13.at);
                              var2 += var13.af;
                              var5 = -1;
                           } catch (Exception var11) {
                           }
                        } else {
                           this.bw(var8);
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
                  if (this.ad != null && var5 != -1) {
                     var2 += this.ad[(var5 << 8) + var7];
                  }

                  int var12 = this.am[var7];
                  var9 = this.ax[var7];
                  if (var7 != ' ') {
                     if (ao == 256) {
                        if (az != -1) {
                           by(this.ae[var7], var2 + this.aq[var7] + 1, var3 + this.af[var7] + 1, var12, var9, az);
                        }

                        this.ac(this.ae[var7], var2 + this.aq[var7], var3 + this.af[var7], var12, var9, ai);
                     } else {
                        if (az != -1) {
                           bi(this.ae[var7], var2 + this.aq[var7] + 1, var3 + this.af[var7] + 1, var12, var9, az, ao);
                        }

                        this.ae(this.ae[var7], var2 + this.aq[var7], var3 + this.af[var7], var12, var9, ai, ao);
                     }
                  } else if (as > 0) {
                     ay += as;
                     var2 += ay >> 8;
                     ay &= 255;
                  }

                  int var10 = this.ag[var7];
                  if (ah != -1) {
                     fn(var2, var3 + (int)((double)this.at * 0.7D), var10, ah);
                  }

                  if (ap != -1) {
                     fn(var2, var3 + this.at + 1, var10, ap);
                  }

                  var2 += var10;
                  var5 = var7;
               }
            }
         }
      }

   }

   void au(byte[] var1) {
      this.ag = new int[256];
      int var2;
      if (var1.length == 257) {
         for(var2 = 0; var2 < this.ag.length; ++var2) {
            this.ag[var2] = var1[var2] & 255;
         }

         this.at = var1[256] & 255;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 256; ++var3) {
            this.ag[var3] = var1[var2++] & 255;
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

         this.ad = new byte[65536];

         for(var13 = 0; var13 < 256; ++var13) {
            if (var13 != 32 && var13 != 160) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if (var8 != 32 && var8 != 160) {
                     this.ad[(var13 << 8) + var8] = (byte)ar(var11, var12, var4, this.ag, var10, var13, var8);
                  }
               }
            }
         }

         this.at = var4[32] + var10[32];
      }

   }

   public void ao(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.bs(var4, var5);
         ao = var6;
         this.bj(var1, var2, var3);
      }
   }

   void bu(byte[] var1) {
      this.ag = new int[256];
      int var2;
      if (var1.length == 257) {
         for(var2 = 0; var2 < this.ag.length; ++var2) {
            this.ag[var2] = var1[var2] & -667862423;
         }

         this.at = var1[1328465553] & 255;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < -283486916; ++var3) {
            this.ag[var3] = var1[var2++] & 1449325943;
         }

         int[] var10 = new int[256];
         int[] var4 = new int[256];

         int var5;
         for(var5 = 0; var5 < 1212993851; ++var5) {
            var10[var5] = var1[var2++] & 255;
         }

         for(var5 = 0; var5 < 256; ++var5) {
            var4[var5] = var1[var2++] & 255;
         }

         byte[][] var11 = new byte[912148750][];

         int var8;
         for(int var6 = 0; var6 < -1978150326; ++var6) {
            var11[var6] = new byte[var10[var6]];
            byte var7 = 0;

            for(var8 = 0; var8 < var11[var6].length; ++var8) {
               var7 += var1[var2++];
               var11[var6][var8] = var7;
            }
         }

         byte[][] var12 = new byte[256][];

         int var13;
         for(var13 = 0; var13 < 655562450; ++var13) {
            var12[var13] = new byte[var10[var13]];
            byte var14 = 0;

            for(int var9 = 0; var9 < var12[var13].length; ++var9) {
               var14 += var1[var2++];
               var12[var13][var9] = var14;
            }
         }

         this.ad = new byte[65536];

         for(var13 = 0; var13 < 439117111; ++var13) {
            if (var13 != 424725903 && var13 != 160) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if (var8 != -1338702706 && var8 != 160) {
                     this.ad[(var13 << 8) + var8] = (byte)ar(var11, var12, var4, this.ag, var10, var13, var8);
                  }
               }
            }
         }

         this.at = var4[-206845141] + var10[32];
      }

   }

   static int br(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
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

   public void bh(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         this.bs(var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.bx(var6, var1.length());
         }

         this.bp(var1, var2 - this.ad(var1) / 2, var3, var7, (int[])null, (int[])null);
      }
   }

   public int bv(char var1) {
      if (var1 == 160) {
         var1 = ' ';
      }

      return this.ag[il.ac(var1, 1169786355) & 255];
   }

   public int bt(char var1) {
      if (var1 == 160) {
         var1 = ' ';
      }

      return this.ag[il.ac(var1, 1169786355) & -1730405633];
   }

   public void dy(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.bs(var4, var5);
         aj.setSeed((long)var6);
         ao = 192 + (aj.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = var8;
            if ((aj.nextInt() & 3) == 0) {
               ++var8;
            }
         }

         this.bp(var1, var2, var3, (int[])null, var7, (int[])null);
      }
   }

   public int bk(String var1, int[] var2, String[] var3) {
      if (var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(-1213707177);
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
               if (var15 == 1610350545 && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append((char)-1972296323);
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
                     var4 += this.al('<');
                     if (this.ad != null && var11 != -1) {
                        var4 += this.ad[(var11 << 8) + 2028289338];
                     }

                     var11 = 60;
                  } else if (var16.equals("gt")) {
                     var4 += this.al((char)-450430718);
                     if (this.ad != null && var11 != -1) {
                        var4 += this.ad[(var11 << 8) + -154111689];
                     }

                     var11 = 667222625;
                  } else if (var16.startsWith("img=")) {
                     try {
                        int var17 = ir.ag(var16.substring(4), 1473180947);
                        var4 += al[var17].af;
                        var11 = 0;
                     } catch (Exception var18) {
                     }
                  }

                  var15 = 0;
               }

               if (var10 == -1) {
                  if (var15 != 0) {
                     var6.append(var15);
                     var4 += this.al(var15);
                     if (this.ad != null && var11 != -1) {
                        var4 += this.ad[(var11 << 8) + var15];
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

                  if (var15 == -2103187364) {
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

   public int be(String var1, int[] var2, String[] var3) {
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
               if (var15 == '>' && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append((char)-931421541);
                  if (var16.equals("br")) {
                     var3[var12] = var6.toString().substring(var5, var6.length());
                     ++var12;
                     var5 = var6.length();
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if (var16.equals("lt")) {
                     var4 += this.al((char)-1275576060);
                     if (this.ad != null && var11 != -1) {
                        var4 += this.ad[(var11 << 8) + 60];
                     }

                     var11 = -1016211449;
                  } else if (var16.equals("gt")) {
                     var4 += this.al((char)319751712);
                     if (this.ad != null && var11 != -1) {
                        var4 += this.ad[(var11 << 8) + 62];
                     }

                     var11 = 62;
                  } else if (var16.startsWith("img=")) {
                     try {
                        int var17 = ir.ag(var16.substring(4), 1473180947);
                        var4 += al[var17].af;
                        var11 = 0;
                     } catch (Exception var18) {
                     }
                  }

                  var15 = 0;
               }

               if (var10 == -1) {
                  if (var15 != 0) {
                     var6.append(var15);
                     var4 += this.al(var15);
                     if (this.ad != null && var11 != -1) {
                        var4 += this.ad[(var11 << 8) + var15];
                     }

                     var11 = var15;
                  }

                  if (var15 == 1306707657) {
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

   public int bc(String var1, int[] var2, String[] var3) {
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
               if (var15 == 2012514921 && var10 != -1) {
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
                     var4 += this.al('<');
                     if (this.ad != null && var11 != -1) {
                        var4 += this.ad[(var11 << 8) + 60];
                     }

                     var11 = '<';
                  } else if (var16.equals("gt")) {
                     var4 += this.al((char)1517231446);
                     if (this.ad != null && var11 != -1) {
                        var4 += this.ad[(var11 << 8) + 62];
                     }

                     var11 = '>';
                  } else if (var16.startsWith("img=")) {
                     try {
                        int var17 = ir.ag(var16.substring(4), 1473180947);
                        var4 += al[var17].af;
                        var11 = 0;
                     } catch (Exception var18) {
                     }
                  }

                  var15 = 0;
               }

               if (var10 == -1) {
                  if (var15 != 0) {
                     var6.append(var15);
                     var4 += this.al(var15);
                     if (this.ad != null && var11 != -1) {
                        var4 += this.ad[(var11 << 8) + var15];
                     }

                     var11 = var15;
                  }

                  if (var15 == -1001570079) {
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

   public int cn(String var1, int[] var2, String[] var3) {
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
                     var4 += this.al('<');
                     if (this.ad != null && var11 != -1) {
                        var4 += this.ad[(var11 << 8) + 60];
                     }

                     var11 = '<';
                  } else if (var16.equals("gt")) {
                     var4 += this.al('>');
                     if (this.ad != null && var11 != -1) {
                        var4 += this.ad[(var11 << 8) + 62];
                     }

                     var11 = '>';
                  } else if (var16.startsWith("img=")) {
                     try {
                        int var17 = ir.ag(var16.substring(4), 1473180947);
                        var4 += al[var17].af;
                        var11 = 0;
                     } catch (Exception var18) {
                     }
                  }

                  var15 = 0;
               }

               if (var10 == -1) {
                  if (var15 != 0) {
                     var6.append(var15);
                     var4 += this.al(var15);
                     if (this.ad != null && var11 != -1) {
                        var4 += this.ad[(var11 << 8) + var15];
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

   abstract void at(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   public int cf(String var1, int var2) {
      int var3 = this.ah(var1, new int[]{var2}, av);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.ad(av[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   public int cu(String var1, int var2) {
      int var3 = this.ah(var1, new int[]{var2}, av);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.ad(av[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   void ba(String var1, int var2) {
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
         as = (var2 - this.ad(var1) << 8) / var3;
      }

   }

   public int cj(String var1, int var2) {
      int var3 = this.ah(var1, new int[]{var2}, av);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.ad(av[var5]);
         if (var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   public int cx(String var1, int var2) {
      return this.ah(var1, new int[]{var2}, av);
   }

   public void an(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         this.bs(var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.bx(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];

         for(int var10 = 0; var10 < var1.length(); ++var10) {
            var9[var10] = (int)(Math.sin((double)var10 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.bp(var1, var2 - this.ad(var1) / 2, var3, var8, (int[])null, var9);
      }
   }

   public void ca(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bs(var4, var5);
         this.bj(var1, var2 - this.ad(var1) / 2, var3);
      }
   }

   public static String co(String var0) {
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

   public qy cv(int var1, int var2, String var3, int var4, int var5) {
      if (var3 != null && var3.length() >= var1 + var2) {
         int var6 = var4 - this.ad(var3) / 2;
         var6 += this.ad(var3.substring(0, var1));
         int var7 = var5 - this.au;
         int var8 = this.ad(var3.substring(var1, var1 + var2));
         int var9 = this.au + this.ar;
         return new qy(var6, var7, var8, var9);
      } else {
         return new qy(var4, var5, 0, 0);
      }
   }

   static void by(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * an;
      int var7 = an - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if (var2 < bd) {
         var10 = bd - var2;
         var4 -= var10;
         var2 = bd;
         var9 += var10 * var3;
         var6 += var10 * an;
      }

      if (var2 + var4 > bx) {
         var4 -= var2 + var4 - bx;
      }

      if (var1 < bf) {
         var10 = bf - var1;
         var3 -= var10;
         var1 = bf;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if (var1 + var3 > bm) {
         var10 = var1 + var3 - bm;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if (var3 > 0 && var4 > 0) {
         bb(aw, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   public void ct(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bs(var4, var5);
         this.bj(var1, var2, var3);
      }
   }

   public void cq(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bs(var4, var5);
         this.bj(var1, var2, var3);
      }
   }

   public void cc(String var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 != null) {
         this.bs(var4, var5);
         ao = var6;
         this.bj(var1, var2, var3);
      }
   }

   static void en(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

   public void cw(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bs(var4, var5);
         this.bj(var1, var2 - this.ad(var1), var3);
      }
   }

   public void cr(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bs(var4, var5);
         this.bj(var1, var2 - this.ad(var1), var3);
      }
   }

   public void cl(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bs(var4, var5);
         this.bj(var1, var2 - this.ad(var1) / 2, var3);
      }
   }

   abstract void ac(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   public void cs(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bs(var4, var5);
         this.bj(var1, var2 - this.ad(var1) / 2, var3);
      }
   }

   public void cp(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bs(var4, var5);
         this.bj(var1, var2 - this.ad(var1) / 2, var3);
      }
   }

   public int cb(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      return this.av(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
   }

   int[] dg(int[] var1, int var2) {
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

   public int ce(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      return this.av(var1, var2, var3, var4, var5, var6, var7, -1476276571, var8, var9, var10);
   }

   public int ck(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      return this.av(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
   }

   public int dp(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var1 == null) {
         return 0;
      } else {
         if (var8 == 255) {
            var8 = 256;
         }

         this.bs(var6, var7);
         ao = var8;
         if (var11 == 0) {
            var11 = this.at;
         }

         int[] var12 = new int[]{var4};
         if (var5 < this.au + this.ar + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = this.ah(var1, var12, av);
         if (var10 == 3 && var13 == 1) {
            var10 = 1;
         }

         int var14;
         int var15;
         if (var10 == 0) {
            var14 = var3 + this.au;
         } else if (var10 == 1) {
            var14 = var3 + this.au + (var5 - this.au - this.ar - (var13 - 1) * var11) / 2;
         } else if (var10 == 2) {
            var14 = var3 + var5 - this.ar - (var13 - 1) * var11;
         } else {
            var15 = (var5 - this.au - this.ar - (var13 - 1) * var11) / (var13 + 1);
            if (var15 < 0) {
               var15 = 0;
            }

            var14 = var3 + this.au + var15;
            var11 += var15;
         }

         for(var15 = 0; var15 < var13; ++var15) {
            if (var9 == 0) {
               this.bj(av[var15], var2, var14);
            } else if (var9 == 1) {
               this.bj(av[var15], var2 + (var4 - this.ad(av[var15])) / 2, var14);
            } else if (var9 == 2) {
               this.bj(av[var15], var2 + var4 - this.ad(av[var15]), var14);
            } else if (var15 == var13 - 1) {
               this.bj(av[var15], var2, var14);
            } else {
               this.ba(av[var15], var4);
               this.bj(av[var15], var2, var14);
               as = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   public int df(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var1 == null) {
         return 0;
      } else {
         if (var8 == 962820771) {
            var8 = 444048412;
         }

         this.bs(var6, var7);
         ao = var8;
         if (var11 == 0) {
            var11 = this.at;
         }

         int[] var12 = new int[]{var4};
         if (var5 < this.au + this.ar + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = this.ah(var1, var12, av);
         if (var10 == 3 && var13 == 1) {
            var10 = 1;
         }

         int var14;
         int var15;
         if (var10 == 0) {
            var14 = var3 + this.au;
         } else if (var10 == 1) {
            var14 = var3 + this.au + (var5 - this.au - this.ar - (var13 - 1) * var11) / 2;
         } else if (var10 == 2) {
            var14 = var3 + var5 - this.ar - (var13 - 1) * var11;
         } else {
            var15 = (var5 - this.au - this.ar - (var13 - 1) * var11) / (var13 + 1);
            if (var15 < 0) {
               var15 = 0;
            }

            var14 = var3 + this.au + var15;
            var11 += var15;
         }

         for(var15 = 0; var15 < var13; ++var15) {
            if (var9 == 0) {
               this.bj(av[var15], var2, var14);
            } else if (var9 == 1) {
               this.bj(av[var15], var2 + (var4 - this.ad(av[var15])) / 2, var14);
            } else if (var9 == 2) {
               this.bj(av[var15], var2 + var4 - this.ad(av[var15]), var14);
            } else if (var15 == var13 - 1) {
               this.bj(av[var15], var2, var14);
            } else {
               this.ba(av[var15], var4);
               this.bj(av[var15], var2, var14);
               as = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   public int dv(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var1 == null) {
         return 0;
      } else {
         if (var8 == 1021419222) {
            var8 = 256;
         }

         this.bs(var6, var7);
         ao = var8;
         if (var11 == 0) {
            var11 = this.at;
         }

         int[] var12 = new int[]{var4};
         if (var5 < this.au + this.ar + var11 && var5 < var11 + var11) {
            var12 = null;
         }

         int var13 = this.ah(var1, var12, av);
         if (var10 == 3 && var13 == 1) {
            var10 = 1;
         }

         int var14;
         int var15;
         if (var10 == 0) {
            var14 = var3 + this.au;
         } else if (var10 == 1) {
            var14 = var3 + this.au + (var5 - this.au - this.ar - (var13 - 1) * var11) / 2;
         } else if (var10 == 2) {
            var14 = var3 + var5 - this.ar - (var13 - 1) * var11;
         } else {
            var15 = (var5 - this.au - this.ar - (var13 - 1) * var11) / (var13 + 1);
            if (var15 < 0) {
               var15 = 0;
            }

            var14 = var3 + this.au + var15;
            var11 += var15;
         }

         for(var15 = 0; var15 < var13; ++var15) {
            if (var9 == 0) {
               this.bj(av[var15], var2, var14);
            } else if (var9 == 1) {
               this.bj(av[var15], var2 + (var4 - this.ad(av[var15])) / 2, var14);
            } else if (var9 == 2) {
               this.bj(av[var15], var2 + var4 - this.ad(av[var15]), var14);
            } else if (var15 == var13 - 1) {
               this.bj(av[var15], var2, var14);
            } else {
               this.ba(av[var15], var4);
               this.bj(av[var15], var2, var14);
               as = 0;
            }

            var14 += var11;
         }

         return var13;
      }
   }

   public void dw(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         this.bs(var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.bx(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];
         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var9[var11] = (int)(Math.sin((double)var11 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var10[var11] = (int)(Math.sin((double)var11 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.bp(var1, var2 - this.ad(var1) / 2, var3, var8, var9, var10);
      }
   }

   public void dk(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         this.bs(var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.bx(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];

         for(int var10 = 0; var10 < var1.length(); ++var10) {
            var9[var10] = (int)(Math.sin((double)var10 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.bp(var1, var2 - this.ad(var1) / 2, var3, var8, (int[])null, var9);
      }
   }

   public void dl(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         this.bs(var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.bx(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];

         for(int var10 = 0; var10 < var1.length(); ++var10) {
            var9[var10] = (int)(Math.sin((double)var10 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.bp(var1, var2 - this.ad(var1) / 2, var3, var8, (int[])null, var9);
      }
   }

   public void db(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         this.bs(var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.bx(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];
         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var9[var11] = (int)(Math.sin((double)var11 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var10[var11] = (int)(Math.sin((double)var11 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.bp(var1, var2 - this.ad(var1) / 2, var3, var8, var9, var10);
      }
   }

   public void dc(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         this.bs(var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.bx(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];
         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var9[var11] = (int)(Math.sin((double)var11 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var10[var11] = (int)(Math.sin((double)var11 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.bp(var1, var2 - this.ad(var1) / 2, var3, var8, var9, var10);
      }
   }

   public void as(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bs(var4, var5);
         this.bj(var1, var2 - this.ad(var1), var3);
      }
   }

   public void de(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         this.bs(var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.bx(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];
         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var9[var11] = (int)(Math.sin((double)var11 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var10[var11] = (int)(Math.sin((double)var11 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.bp(var1, var2 - this.ad(var1) / 2, var3, var8, var9, var10);
      }
   }

   public void dx(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
      if (var1 != null) {
         this.bs(var4, var5);
         int[] var9 = null;
         if (var8 != null) {
            var9 = this.bx(var8, var1.length());
         }

         double var10 = 7.0D - (double)var7 / 8.0D;
         if (var10 < 0.0D) {
            var10 = 0.0D;
         }

         int[] var12 = new int[var1.length()];

         for(int var13 = 0; var13 < var1.length(); ++var13) {
            var12[var13] = (int)(Math.sin((double)var13 / 1.5D + (double)var6 / 1.0D) * var10);
         }

         this.bp(var1, var2 - this.ad(var1) / 2, var3, var9, (int[])null, var12);
      }
   }

   qk(byte[] var1) {
      this.au(var1);
   }

   public void do(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         this.bs(var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.bx(var6, var1.length());
         }

         this.bp(var1, var2 - this.ad(var1) / 2, var3, var7, (int[])null, (int[])null);
      }
   }

   public void bn(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
      if (var1 != null) {
         this.bs(var4, var5);
         int[] var9 = null;
         if (var8 != null) {
            var9 = this.bx(var8, var1.length());
         }

         double var10 = 7.0D - (double)var7 / 8.0D;
         if (var10 < 0.0D) {
            var10 = 0.0D;
         }

         int[] var12 = new int[var1.length()];

         for(int var13 = 0; var13 < var1.length(); ++var13) {
            var12[var13] = (int)(Math.sin((double)var13 / 1.5D + (double)var6 / 1.0D) * var10);
         }

         this.bp(var1, var2 - this.ad(var1) / 2, var3, var9, (int[])null, var12);
      }
   }

   public void dm(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         this.bs(var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.bx(var6, var1.length());
         }

         this.bp(var1, var2, var3, var7, (int[])null, (int[])null);
      }
   }

   public void dq(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         this.bs(var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.bx(var6, var1.length());
         }

         this.bp(var1, var2, var3, var7, (int[])null, (int[])null);
      }
   }

   public void di(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         this.bs(var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.bx(var6, var1.length());
         }

         this.bp(var1, var2, var3, var7, (int[])null, (int[])null);
      }
   }

   public void da(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         this.bs(var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.bx(var6, var1.length());
         }

         this.bp(var1, var2, var3, var7, (int[])null, (int[])null);
      }
   }

   public int bo(char var1) {
      if (var1 == 160) {
         var1 = ' ';
      }

      return this.ag[il.ac(var1, 1169786355) & 255];
   }

   abstract void af(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   int[] dr(int[] var1, int var2) {
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

   public int ch(String var1, int[] var2, String[] var3) {
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
            if (var15 == 885864072) {
               var10 = var14;
            } else {
               if (var15 == '>' && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append((char)-152509202);
                  if (var16.equals("br")) {
                     var3[var12] = var6.toString().substring(var5, var6.length());
                     ++var12;
                     var5 = var6.length();
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if (var16.equals("lt")) {
                     var4 += this.al((char)916312809);
                     if (this.ad != null && var11 != -1) {
                        var4 += this.ad[(var11 << 8) + 60];
                     }

                     var11 = '<';
                  } else if (var16.equals("gt")) {
                     var4 += this.al('>');
                     if (this.ad != null && var11 != -1) {
                        var4 += this.ad[(var11 << 8) + 278646153];
                     }

                     var11 = '>';
                  } else if (var16.startsWith("img=")) {
                     try {
                        int var17 = ir.ag(var16.substring(4), 1473180947);
                        var4 += al[var17].af;
                        var11 = 0;
                     } catch (Exception var18) {
                     }
                  }

                  var15 = 0;
               }

               if (var10 == -1) {
                  if (var15 != 0) {
                     var6.append(var15);
                     var4 += this.al(var15);
                     if (this.ad != null && var11 != -1) {
                        var4 += this.ad[(var11 << 8) + var15];
                     }

                     var11 = var15;
                  }

                  if (var15 == -1580592454) {
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

   static int ar(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
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

   public void dn(int var1, int var2, int var3, int var4) {
      var3 -= this.at;
      int var5 = var1 & 255;
      if (var5 != 32) {
         this.ac(this.ae[var5], var2 + this.aq[var5], var3 + this.af[var5], this.am[var5], this.ax[var5], var4);
      }

   }

   public void du(int var1, int var2, int var3, int var4) {
      var3 -= this.at;
      int var5 = var1 & 255;
      if (var5 != 32) {
         this.ac(this.ae[var5], var2 + this.aq[var5], var3 + this.af[var5], this.am[var5], this.ax[var5], var4);
      }

   }

   public void dd(int var1, int var2, int var3, int var4) {
      var3 -= this.at;
      int var5 = var1 & 255;
      if (var5 != 32) {
         this.ac(this.ae[var5], var2 + this.aq[var5], var3 + this.af[var5], this.am[var5], this.ax[var5], var4);
      }

   }

   void eg(int var1, int var2) {
      ah = -1;
      ap = -1;
      ab = var2;
      az = var2;
      aa = var1;
      ai = var1;
      ao = 256;
      as = 0;
      ay = 0;
   }

   void ea(int var1, int var2) {
      ah = -1;
      ap = -1;
      ab = var2;
      az = var2;
      aa = var1;
      ai = var1;
      ao = 256;
      as = 0;
      ay = 0;
   }

   void ez(int var1, int var2) {
      ah = -1;
      ap = -1;
      ab = var2;
      az = var2;
      aa = var1;
      ai = var1;
      ao = 256;
      as = 0;
      ay = 0;
   }

   void ev(String var1) {
      try {
         if (var1.startsWith("col=")) {
            ai = at.am(var1.substring(4), 16, -1274228411);
         } else if (var1.equals("/col")) {
            ai = aa;
         } else if (var1.startsWith("str=")) {
            ah = at.am(var1.substring(4), 16, -665700073);
         } else if (var1.equals("str")) {
            ah = 8388608;
         } else if (var1.equals("/str")) {
            ah = -1;
         } else if (var1.startsWith("u=")) {
            ap = at.am(var1.substring(2), 16, 68276284);
         } else if (var1.equals("u")) {
            ap = 0;
         } else if (var1.equals("/u")) {
            ap = -1;
         } else if (var1.startsWith("shad=")) {
            az = at.am(var1.substring(5), 16, -2012816108);
         } else if (var1.equals("shad")) {
            az = 0;
         } else if (var1.equals("/shad")) {
            az = ab;
         } else if (var1.equals("br")) {
            this.bs(aa, ab);
         }
      } catch (Exception var3) {
      }

   }

   void ef(String var1, int var2) {
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
         as = (var2 - this.ad(var1) << 8) / var3;
      }

   }

   void ew(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6 = var1.charAt(var5);
         if (var6 == -1303507390) {
            var4 = true;
         } else if (var6 == -435332181) {
            var4 = false;
         } else if (!var4 && var6 == 2090679214) {
            ++var3;
         }
      }

      if (var3 > 0) {
         as = (var2 - this.ad(var1) << 8) / var3;
      }

   }

   void ep(String var1, int var2) {
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
         as = (var2 - this.ad(var1) << 8) / var3;
      }

   }

   void ex(String var1, int var2, int var3) {
      var3 -= this.at;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if (var1.charAt(var6) != 0) {
            char var7 = (char)(il.ac(var1.charAt(var6), 1169786355) & 255);
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
                              var9 = ir.ag(var8.substring(4), 1473180947);
                              vt var13 = al[var9];
                              var13.ag(var2, var3 + this.at - var13.at);
                              var2 += var13.af;
                              var5 = -1;
                           } catch (Exception var11) {
                           }
                        } else {
                           this.bw(var8);
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
                  if (this.ad != null && var5 != -1) {
                     var2 += this.ad[(var5 << 8) + var7];
                  }

                  int var12 = this.am[var7];
                  var9 = this.ax[var7];
                  if (var7 != ' ') {
                     if (ao == 256) {
                        if (az != -1) {
                           by(this.ae[var7], var2 + this.aq[var7] + 1, var3 + this.af[var7] + 1, var12, var9, az);
                        }

                        this.ac(this.ae[var7], var2 + this.aq[var7], var3 + this.af[var7], var12, var9, ai);
                     } else {
                        if (az != -1) {
                           bi(this.ae[var7], var2 + this.aq[var7] + 1, var3 + this.af[var7] + 1, var12, var9, az, ao);
                        }

                        this.ae(this.ae[var7], var2 + this.aq[var7], var3 + this.af[var7], var12, var9, ai, ao);
                     }
                  } else if (as > 0) {
                     ay += as;
                     var2 += ay >> 8;
                     ay &= 255;
                  }

                  int var10 = this.ag[var7];
                  if (ah != -1) {
                     fn(var2, var3 + (int)((double)this.at * 0.7D), var10, ah);
                  }

                  if (ap != -1) {
                     fn(var2, var3 + this.at + 1, var10, ap);
                  }

                  var2 += var10;
                  var5 = var7;
               }
            }
         }
      }

   }

   public static String cy(String var0) {
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

   void eu(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
      var3 -= this.at;
      int var7 = -1;
      int var8 = -1;
      int var9 = 0;

      for(int var10 = 0; var10 < var1.length(); ++var10) {
         if (var1.charAt(var10) != 0) {
            int var11 = (char)(il.ac(var1.charAt(var10), 1169786355) & -675984908);
            if (var11 == -67856156) {
               var7 = var10;
            } else {
               int var13;
               int var14;
               int var15;
               if (var11 == -1498743054 && var7 != -1) {
                  String var12 = var1.substring(var7 + 1, var10);
                  var7 = -1;
                  if (var12.equals("lt")) {
                     var11 = -114632536;
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
                              var15 = ir.ag(var12.substring(4), 1473180947);
                              vt var20 = al[var15];
                              var20.ag(var2 + var13, var3 + this.at - var20.at + var14);
                              var2 += var20.af;
                              var8 = -1;
                           } catch (Exception var18) {
                           }
                        } else {
                           this.bw(var12);
                        }
                        continue;
                     }

                     var11 = 62;
                  }
               }

               if (var11 == -937951504) {
                  var11 = 32;
               }

               if (var7 == -1) {
                  if (this.ad != null && var8 != -1) {
                     var2 += this.ad[(var8 << 8) + var11];
                  }

                  int var19 = this.am[var11];
                  var13 = this.ax[var11];
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
                     var16 = ai;
                  }

                  ++var9;
                  if (var11 != 1259984897) {
                     if (ao == 256) {
                        if (az != -1) {
                           by(this.ae[var11], var2 + this.aq[var11] + 1 + var14, var3 + this.af[var11] + 1 + var15, var19, var13, az);
                        }

                        this.ac(this.ae[var11], var2 + this.aq[var11] + var14, var3 + this.af[var11] + var15, var19, var13, var16);
                     } else {
                        if (az != -1) {
                           bi(this.ae[var11], var2 + this.aq[var11] + 1 + var14, var3 + this.af[var11] + 1 + var15, var19, var13, az, ao);
                        }

                        this.ae(this.ae[var11], var2 + this.aq[var11] + var14, var3 + this.af[var11] + var15, var19, var13, var16, ao);
                     }
                  } else if (as > 0) {
                     ay += as;
                     var2 += ay >> 8;
                     ay &= -939276153;
                  }

                  int var17 = this.ag[var11];
                  if (ah != -1) {
                     fn(var2, var3 + (int)((double)this.at * 0.7D), var17, ah);
                  }

                  if (ap != -1) {
                     fn(var2, var3 + this.at, var17, ap);
                  }

                  var2 += var17;
                  var8 = var11;
               }
            }
         }
      }

   }

   public qy cg(int var1, int var2, String var3, int var4, int var5) {
      if (var3 != null && var3.length() >= var1 + var2) {
         int var6 = var4 - this.ad(var3) / 2;
         var6 += this.ad(var3.substring(0, var1));
         int var7 = var5 - this.au;
         int var8 = this.ad(var3.substring(var1, var1 + var2));
         int var9 = this.au + this.ar;
         return new qy(var6, var7, var8, var9);
      } else {
         return new qy(var4, var5, 0, 0);
      }
   }

   public void ay(String var1, int var2, int var3, int var4, int var5) {
      if (var1 != null) {
         this.bs(var4, var5);
         this.bj(var1, var2 - this.ad(var1) / 2, var3);
      }
   }

   public ue dt(qw var1, int var2, int var3, int var4, int var5, int var6) {
      if (!var1.ag(503954567)) {
         this.bs(var4, var5);
         var3 -= this.at;

         for(int var7 = 0; var7 < var1.am((byte)84); ++var7) {
            qe var8 = var1.at(var7, (byte)-32);
            if (var6 != -1 && var8.ag * -1966920452 > var6) {
               return new ue(var8.ae * 696150117, var8.ag * -1231882764);
            }

            int var9 = var8.ac;
            if (var9 != 10) {
               if (var1.ae(var7, -1687938411)) {
                  var9 = -1364167562;
               }

               if (var9 != 9) {
                  if (var9 == -2121002309) {
                     var9 = -803360004;
                  }

                  int var10 = var2 + var8.ae * -408989022;
                  int var11 = var3 + var8.ag * -551300041;
                  int var12 = this.am[var9];
                  int var13 = this.ax[var9];
                  if (az != -1) {
                     this.ac(this.ae[var9], var10 + this.aq[var9] + 1, var11 + this.af[var9] + 1, var12, var13, az);
                  }

                  this.ac(this.ae[var9], var10 + this.aq[var9], var11 + this.af[var9], var12, var13, ai);
               }
            }
         }
      }

      return var1.af((byte)45);
   }

   static void ed(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & -519513445) * var9 & -16711936) + ((var2 & -157603987) * var9 & 16711680) >> 8;
      var9 = 256 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & -1867012529) * var9 & -1479450846) + ((var12 & -324192790) * var9 & 16711680) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   public int ci(String var1, int var2) {
      return this.ah(var1, new int[]{var2}, av);
   }

   public void ak(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
      if (var1 != null) {
         this.bs(var4, var5);
         int[] var8 = null;
         if (var7 != null) {
            var8 = this.bx(var7, var1.length());
         }

         int[] var9 = new int[var1.length()];
         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var9[var11] = (int)(Math.sin((double)var11 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var10[var11] = (int)(Math.sin((double)var11 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.bp(var1, var2 - this.ad(var1) / 2, var3, var8, var9, var10);
      }
   }

   static void ek(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * an;
      int var8 = an - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var2 < bd) {
         var11 = bd - var2;
         var4 -= var11;
         var2 = bd;
         var10 += var11 * var3;
         var7 += var11 * an;
      }

      if (var2 + var4 > bx) {
         var4 -= var2 + var4 - bx;
      }

      if (var1 < bf) {
         var11 = bf - var1;
         var3 -= var11;
         var1 = bf;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var1 + var3 > bm) {
         var11 = var1 + var3 - bm;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var3 > 0 && var4 > 0) {
         bg(aw, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   int[] dz(int[] var1, int var2) {
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

   static void ey(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * an;
      int var8 = an - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var2 < bd) {
         var11 = bd - var2;
         var4 -= var11;
         var2 = bd;
         var10 += var11 * var3;
         var7 += var11 * an;
      }

      if (var2 + var4 > bx) {
         var4 -= var2 + var4 - bx;
      }

      if (var1 < bf) {
         var11 = bf - var1;
         var3 -= var11;
         var1 = bf;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var1 + var3 > bm) {
         var11 = var1 + var3 - bm;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var3 > 0 && var4 > 0) {
         bg(aw, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   public void dh(String var1, int var2, int var3, int var4, int var5, int[] var6) {
      if (var1 != null) {
         this.bs(var4, var5);
         int[] var7 = null;
         if (var6 != null) {
            var7 = this.bx(var6, var1.length());
         }

         this.bp(var1, var2, var3, var7, (int[])null, (int[])null);
      }
   }

   public void dj(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
      if (var1 != null) {
         this.bs(var4, var5);
         int[] var9 = null;
         if (var8 != null) {
            var9 = this.bx(var8, var1.length());
         }

         double var10 = 7.0D - (double)var7 / 8.0D;
         if (var10 < 0.0D) {
            var10 = 0.0D;
         }

         int[] var12 = new int[var1.length()];

         for(int var13 = 0; var13 < var1.length(); ++var13) {
            var12[var13] = (int)(Math.sin((double)var13 / 1.5D + (double)var6 / 1.0D) * var10);
         }

         this.bp(var1, var2 - this.ad(var1) / 2, var3, var9, (int[])null, var12);
      }
   }

   static void ee(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & 16711935) * var9 & 1316554255) + ((var2 & '\uff00') * var9 & 16711680) >> 8;
      var9 = 256 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & -1395376969) * var9 & -16711936) + ((var12 & -2014464407) * var9 & 16711680) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   static void eq(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & -1292777527) * var9 & -16711936) + ((var2 & '\uff00') * var9 & 16711680) >> 8;
      var9 = 1642933442 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if (var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & 16711935) * var9 & 1596144485) + ((var12 & '\uff00') * var9 & -1471411990) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }
}
