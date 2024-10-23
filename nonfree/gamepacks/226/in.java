public class in extends tp {
   public int an;
   public static mi aw = new mi(64);
   public static pe ap;
   public int aj = -302907593;
   public int as;
   public int ay = -1433106881;
   static int ks;
   public int ae;
   public int ak = 0;
   public int at;
   public boolean ai = true;
   public int au;
   public int am;

   public void ae() {
      if (-1 != this.ay * -1742760383) {
         this.ai(this.ay * -1742760383, 1564324409);
         this.at = -1632409695 * this.as;
         this.au = this.ae * 1701142949;
         this.an = this.am * 96093283;
      }

      this.ai(this.ak * -265762545, 1026849287);
   }

   public void aw(byte var1) {
      try {
         if (-1 != this.ay * -1742760383) {
            this.ai(this.ay * -1742760383, 1873491953);
            this.at = -1632409695 * this.as;
            this.au = this.ae * 1701142949;
            this.an = this.am * 96093283;
         }

         this.ai(this.ak * -265762545, 127561946);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "in.aw(" + ')');
      }
   }

   public void af(vl var1, int var2) {
      while(true) {
         int var3 = var1.cy((short)-5519);
         if (var3 == 0) {
            return;
         }

         this.aj(var1, var3, var2, (byte)84);
      }
   }

   void ai(int var1, int var2) {
      try {
         double var3 = (double)(var1 >> 16 & 255) / 256.0D;
         double var5 = (double)(var1 >> 8 & 255) / 256.0D;
         double var7 = (double)(var1 & 255) / 256.0D;
         double var9 = var3;
         if (var5 < var3) {
            if (var2 <= -93727946) {
               throw new IllegalStateException();
            }

            var9 = var5;
         }

         if (var7 < var9) {
            var9 = var7;
         }

         double var11 = var3;
         if (var5 > var3) {
            var11 = var5;
         }

         if (var7 > var11) {
            var11 = var7;
         }

         double var13 = 0.0D;
         double var15 = 0.0D;
         double var17 = (var9 + var11) / 2.0D;
         if (var9 != var11) {
            if (var2 <= -93727946) {
               return;
            }

            if (var17 < 0.5D) {
               if (var2 <= -93727946) {
                  return;
               }

               var15 = (var11 - var9) / (var11 + var9);
            }

            if (var17 >= 0.5D) {
               if (var2 <= -93727946) {
                  throw new IllegalStateException();
               }

               var15 = (var11 - var9) / (2.0D - var11 - var9);
            }

            if (var3 == var11) {
               if (var2 <= -93727946) {
                  throw new IllegalStateException();
               }

               var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
               if (var2 <= -93727946) {
                  return;
               }

               var13 = 2.0D + (var7 - var3) / (var11 - var9);
            } else if (var7 == var11) {
               if (var2 <= -93727946) {
                  return;
               }

               var13 = 4.0D + (var3 - var5) / (var11 - var9);
            }
         }

         var13 /= 6.0D;
         this.as = (int)(var13 * 256.0D) * -2113144573;
         this.ae = 1580012017 * (int)(var15 * 256.0D);
         this.am = 2046660571 * (int)(var17 * 256.0D);
         if (this.ae * -1450197231 < 0) {
            this.ae = 0;
         } else if (this.ae * -1450197231 > 255) {
            if (var2 <= -93727946) {
               throw new IllegalStateException();
            }

            this.ae = -823861489;
         }

         if (this.am * -1077160877 < 0) {
            this.am = 0;
         } else if (-1077160877 * this.am > 255) {
            if (var2 <= -93727946) {
               throw new IllegalStateException();
            }

            this.am = -2087564507;
         }

      } catch (RuntimeException var19) {
         throw tm.aw(var19, "in.ai(" + ')');
      }
   }

   void ag(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0D;
      double var4 = (double)(var1 >> 8 & 255) / 256.0D;
      double var6 = (double)(var1 & 255) / 256.0D;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var8 + var10) / 2.0D;
      if (var8 != var10) {
         if (var16 < 0.5D) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if (var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if (var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = 2.0D + (var6 - var2) / (var10 - var8);
         } else if (var6 == var10) {
            var12 = 4.0D + (var2 - var4) / (var10 - var8);
         }
      }

      var12 /= 6.0D;
      this.as = (int)(var12 * 256.0D) * -2113144573;
      this.ae = 1580012017 * (int)(var14 * 256.0D);
      this.am = 2046660571 * (int)(var16 * 256.0D);
      if (this.ae * -1450197231 < 0) {
         this.ae = 0;
      } else if (this.ae * -1450197231 > 255) {
         this.ae = -823861489;
      }

      if (this.am * -1077160877 < 0) {
         this.am = 0;
      } else if (-1077160877 * this.am > 255) {
         this.am = -2087564507;
      }

   }

   public static void as(pe var0) {
      ap = var0;
   }

   void aj(vl var1, int var2, int var3, byte var4) {
      try {
         if (var2 == 1) {
            this.ak = var1.cx((byte)-17) * 470877679;
         } else if (2 == var2) {
            if (var4 == 0) {
               throw new IllegalStateException();
            }

            this.aj = var1.cy((short)-4502) * 302907593;
         } else if (var2 == 5) {
            this.ai = false;
         } else if (var2 == 7) {
            if (var4 == 0) {
               throw new IllegalStateException();
            }

            this.ay = var1.cx((byte)-65) * 1433106881;
         } else if (8 == var2 && var4 == 0) {
            return;
         }

      } catch (RuntimeException var5) {
         throw tm.aw(var5, "in.aj(" + ')');
      }
   }

   public void ak(vl var1, int var2, byte var3) {
      try {
         while(true) {
            int var4 = var1.cy((short)-7349);
            if (var4 == 0) {
               if (var3 >= 1) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.aj(var1, var4, var2, (byte)24);
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "in.ak(" + ')');
      }
   }

   public static void av() {
      aw.aj();
   }

   public void au(vl var1, int var2) {
      while(true) {
         int var3 = var1.cy((short)-16455);
         if (var3 == 0) {
            return;
         }

         this.aj(var1, var3, var2, (byte)-102);
      }
   }

   public void an(vl var1, int var2) {
      while(true) {
         int var3 = var1.cy((short)-11046);
         if (var3 == 0) {
            return;
         }

         this.aj(var1, var3, var2, (byte)-33);
      }
   }

   public void ao(vl var1, int var2) {
      while(true) {
         int var3 = var1.cy((short)-10135);
         if (var3 == 0) {
            return;
         }

         this.aj(var1, var3, var2, (byte)111);
      }
   }

   public void am() {
      if (-1 != this.ay * -1742760383) {
         this.ai(this.ay * -1742760383, 1847834346);
         this.at = -1632409695 * this.as;
         this.au = this.ae * 1701142949;
         this.an = this.am * 96093283;
      }

      this.ai(this.ak * -265762545, 543669872);
   }

   void ar(vl var1, int var2, int var3) {
      if (var2 == 1) {
         this.ak = var1.cx((byte)-53) * 648831498;
      } else if (2 == var2) {
         this.aj = var1.cy((short)-10751) * 1598712838;
      } else if (var2 == 5) {
         this.ai = false;
      } else if (var2 == 7) {
         this.ay = var1.cx((byte)-99) * -344051410;
      } else if (8 == var2) {
      }

   }

   void ab(vl var1, int var2, int var3) {
      if (var2 == 1) {
         this.ak = var1.cx((byte)-70) * 470877679;
      } else if (2 == var2) {
         this.aj = var1.cy((short)-28009) * 302907593;
      } else if (var2 == 5) {
         this.ai = false;
      } else if (var2 == 7) {
         this.ay = var1.cx((byte)-36) * 1433106881;
      } else if (8 == var2) {
      }

   }

   public void at() {
      if (-1 != this.ay * -1742760383) {
         this.ai(this.ay * 716451539, 764143474);
         this.at = 1442772223 * this.as;
         this.au = this.ae * -827465572;
         this.an = this.am * 96093283;
      }

      this.ai(this.ak * -265762545, 2547101);
   }

   void az(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0D;
      double var4 = (double)(var1 >> 8 & -946007599) / 256.0D;
      double var6 = (double)(var1 & 255) / 256.0D;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var8 + var10) / 2.0D;
      if (var8 != var10) {
         if (var16 < 0.5D) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if (var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if (var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = 2.0D + (var6 - var2) / (var10 - var8);
         } else if (var6 == var10) {
            var12 = 4.0D + (var2 - var4) / (var10 - var8);
         }
      }

      var12 /= 6.0D;
      this.as = (int)(var12 * 256.0D) * -2113144573;
      this.ae = 994045925 * (int)(var14 * 256.0D);
      this.am = 1718920794 * (int)(var16 * 256.0D);
      if (this.ae * -1450197231 < 0) {
         this.ae = 0;
      } else if (this.ae * 447936819 > 255) {
         this.ae = 269983804;
      }

      if (this.am * -1077160877 < 0) {
         this.am = 0;
      } else if (-1077160877 * this.am > 255) {
         this.am = -2087564507;
      }

   }

   static final void hh(int var0, int var1, int var2, int var3) {
      try {
         if (-678007887 * ad.kw < var0) {
            if (var3 != 1463567568) {
               throw new IllegalStateException();
            }

            ad.kw += (-307852697 * av.uq * (var0 - ad.kw * -678007887) / 1000 + ce.ti * 110214667) * -2128937647;
            if (ad.kw * -678007887 > var0) {
               if (var3 != 1463567568) {
                  throw new IllegalStateException();
               }

               ad.kw = -2128937647 * var0;
            }
         }

         if (ad.kw * -678007887 > var0) {
            if (var3 != 1463567568) {
               throw new IllegalStateException();
            }

            ad.kw -= -2128937647 * (110214667 * ce.ti + (-678007887 * ad.kw - var0) * av.uq * -307852697 / 1000);
            if (-678007887 * ad.kw < var0) {
               if (var3 != 1463567568) {
                  throw new IllegalStateException();
               }

               ad.kw = -2128937647 * var0;
            }
         }

         if (ks * 2138486231 < var1) {
            if (var3 != 1463567568) {
               throw new IllegalStateException();
            }

            ks += 801770983 * ((var1 - 2138486231 * ks) * -307852697 * av.uq / 1000 + ce.ti * 110214667);
            if (2138486231 * ks > var1) {
               if (var3 != 1463567568) {
                  throw new IllegalStateException();
               }

               ks = 801770983 * var1;
            }
         }

         if (ks * 2138486231 > var1) {
            if (var3 != 1463567568) {
               throw new IllegalStateException();
            }

            ks -= ((ks * 2138486231 - var1) * -307852697 * av.uq / 1000 + 110214667 * ce.ti) * 801770983;
            if (ks * 2138486231 < var1) {
               if (var3 != 1463567568) {
                  throw new IllegalStateException();
               }

               ks = var1 * 801770983;
            }
         }

         if (oo.kv * -892337617 < var2) {
            if (var3 != 1463567568) {
               return;
            }

            oo.kv += -2068675377 * ((var2 - -892337617 * oo.kv) * -307852697 * av.uq / 1000 + 110214667 * ce.ti);
            if (oo.kv * -892337617 > var2) {
               if (var3 != 1463567568) {
                  throw new IllegalStateException();
               }

               oo.kv = var2 * -2068675377;
            }
         }

         if (oo.kv * -892337617 > var2) {
            if (var3 != 1463567568) {
               throw new IllegalStateException();
            }

            oo.kv -= ((oo.kv * -892337617 - var2) * av.uq * -307852697 / 1000 + 110214667 * ce.ti) * -2068675377;
            if (oo.kv * -892337617 < var2) {
               if (var3 != 1463567568) {
                  throw new IllegalStateException();
               }

               oo.kv = -2068675377 * var2;
            }
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "in.hh(" + ')');
      }
   }

   public static void ac() {
      aw.aj();
   }

   void ad(int var1) {
      double var2 = (double)(var1 >> 16 & 255) / 256.0D;
      double var4 = (double)(var1 >> 8 & 255) / 256.0D;
      double var6 = (double)(var1 & 255) / 256.0D;
      double var8 = var2;
      if (var4 < var2) {
         var8 = var4;
      }

      if (var6 < var8) {
         var8 = var6;
      }

      double var10 = var2;
      if (var4 > var2) {
         var10 = var4;
      }

      if (var6 > var10) {
         var10 = var6;
      }

      double var12 = 0.0D;
      double var14 = 0.0D;
      double var16 = (var8 + var10) / 2.0D;
      if (var8 != var10) {
         if (var16 < 0.5D) {
            var14 = (var10 - var8) / (var10 + var8);
         }

         if (var16 >= 0.5D) {
            var14 = (var10 - var8) / (2.0D - var10 - var8);
         }

         if (var2 == var10) {
            var12 = (var4 - var6) / (var10 - var8);
         } else if (var4 == var10) {
            var12 = 2.0D + (var6 - var2) / (var10 - var8);
         } else if (var6 == var10) {
            var12 = 4.0D + (var2 - var4) / (var10 - var8);
         }
      }

      var12 /= 6.0D;
      this.as = (int)(var12 * 256.0D) * -2113144573;
      this.ae = 1580012017 * (int)(var14 * 256.0D);
      this.am = 2046660571 * (int)(var16 * 256.0D);
      if (this.ae * -1450197231 < 0) {
         this.ae = 0;
      } else if (this.ae * -1450197231 > 255) {
         this.ae = -823861489;
      }

      if (this.am * -1077160877 < 0) {
         this.am = 0;
      } else if (-1077160877 * this.am > 255) {
         this.am = -2087564507;
      }

   }
}
