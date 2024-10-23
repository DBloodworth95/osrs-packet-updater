import java.io.IOException;

public final class ec extends jv {
   static final int ad = 21;
   int aw;
   int ak;
   public static final int dc = 102;
   int ai;
   boolean ay;
   int ae;
   gz am;
   int ap;
   int aj;

   gz aj(int var1) {
      try {
         return this.am;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ec.aj(" + ')');
      }
   }

   void ap(int var1, int var2) {
      try {
         this.ae = 771233047 * var1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ec.ap(" + ')');
      }
   }

   void am(gz var1) {
      this.am = var1;
   }

   protected final jy au(int var1) {
      try {
         ip var2 = qg.aw(1119456901 * this.ap, 649869579);
         jy var10000;
         if (this.am == null) {
            if (var1 != 1885718735) {
               throw new IllegalStateException();
            }

            var10000 = var2.at(this.aw * -1423952523, 1409228859);
         } else {
            var10000 = var2.au(this.am, -1209961018);
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ec.au(" + ')');
      }
   }

   void ak(gz var1, byte var2) {
      try {
         this.am = var1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ec.ak(" + ')');
      }
   }

   boolean aw(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 <= -1598757207) {
               throw new IllegalStateException();
            }

            if (var1 <= 4) {
               if (var2 <= -1598757207) {
                  throw new IllegalStateException();
               }

               return (this.ae * 204108455 & 1 << var1) != 0;
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ec.aw(" + ')');
      }
   }

   void ai(int var1) {
      try {
         this.am = null;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ec.ai(" + ')');
      }
   }

   protected final jy an() {
      ip var1 = qg.aw(1119456901 * this.ap, 649869579);
      return this.am == null ? var1.at(this.aw * -1423952523, 1409228859) : var1.au(this.am, -2072908572);
   }

   protected final jy ao() {
      ip var1 = qg.aw(-350546977 * this.ap, 649869579);
      return this.am == null ? var1.at(this.aw * -1423952523, 1409228859) : var1.au(this.am, -1303898393);
   }

   void ay(int var1) {
      this.ae = 771233047 * var1;
   }

   ec() {
      try {
         super();
         this.ae = -1861579319;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ec.<init>(" + ')');
      }
   }

   boolean ae(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.ae * 204108455 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   void as(int var1) {
      this.ae = 771233047 * var1;
   }

   void at(gz var1) {
      this.am = var1;
   }

   gz af() {
      return this.am;
   }

   void ar() {
      this.am = null;
   }

   static void ai(fv var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      try {
         if (null != var0) {
            var0.as = var1;
            float var10 = var4 - var1;
            float var11 = var8 - var5;
            float var12 = var2 - var1;
            float var13 = 0.0F;
            float var14 = 0.0F;
            if (var12 != 0.0F) {
               if (var9 == 1371302933) {
                  throw new IllegalStateException();
               }

               var13 = (var6 - var5) / var12;
            }

            var12 = var4 - var3;
            if (var12 != 0.0F) {
               if (var9 == 1371302933) {
                  throw new IllegalStateException();
               }

               var14 = (var8 - var7) / var12;
            }

            float var15 = 1.0F / (var10 * var10);
            float var16 = var10 * var13;
            float var17 = var14 * var10;
            var0.am = (var17 + var16 - var11 - var11) * var15 / var10;
            var0.at = (var11 + var11 + var11 - var16 - var16 - var17) * var15;
            var0.au = var13;
            var0.an = var5;
         }
      } catch (RuntimeException var18) {
         throw tm.aw(var18, "ec.ai(" + ')');
      }
   }

   static final void jv(boolean var0, byte var1) {
      try {
         fx.hf(-796851132);
         ed var10000 = client.in;
         var10000.au += 1713233803;
         if (1309495331 * client.in.au < 50) {
            if (var1 == 1) {
               return;
            }

            if (!var0) {
               if (var1 == 1) {
                  throw new IllegalStateException();
               }

               return;
            }
         }

         client.in.au = 0;
         if (!client.ia) {
            if (var1 == 1) {
               throw new IllegalStateException();
            }

            if (client.in.as(-464100983) != null) {
               if (var1 == 1) {
                  return;
               }

               me var2 = ef.ap(mm.av, client.in.ai, (byte)81);
               client.in.ak(var2, (short)486);

               try {
                  client.in.aw(2093605467);
               } catch (IOException var4) {
                  client.ia = true;
               }
            }
         }

      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ec.jv(" + ')');
      }
   }

   static void ay(int var0, int var1) {
      try {
         dk var2 = (dk)dk.ap.ap((long)var0);
         if (var2 == null) {
            if (var1 == 470341851) {
               ;
            }
         } else {
            var2.kf();
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ec.ay(" + ')');
      }
   }
}
