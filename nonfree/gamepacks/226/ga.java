public class ga extends gj {
   int ap;
   byte aw;
   int ak;
   String aj;
   // $FF: synthetic field
   final gg this$0;
   static final int ar = 1170;
   static vc[] df;
   public static final int bq = 262144;
   static final int rz = 2;
   public static final String js = "";

   void ap(vl var1, int var2) {
      try {
         var1.cy((short)-18329);
         this.ap = var1.ce(1815968711) * -2037989207;
         this.aw = var1.cu((byte)13);
         this.ak = var1.ce(1154429640) * -368729189;
         var1.ct((byte)-93);
         this.aj = var1.cw(1967142582);
         var1.cy((short)-8179);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ga.ap(" + ')');
      }
   }

   void aj(vl var1) {
      var1.cy((short)-15473);
      this.ap = var1.ce(100323387) * -2037989207;
      this.aw = var1.cu((byte)13);
      this.ak = var1.ce(586627374) * 1597504457;
      var1.ct((byte)-46);
      this.aj = var1.cw(2004112992);
      var1.cy((short)-11664);
   }

   ga(gg var1) {
      try {
         this.this$0 = var1;
         super();
         this.ap = 2037989207;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ga.<init>(" + ')');
      }
   }

   void ak(vl var1) {
      var1.cy((short)-8799);
      this.ap = var1.ce(1152296961) * -2037989207;
      this.aw = var1.cu((byte)13);
      this.ak = var1.ce(2072788230) * -368729189;
      var1.ct((byte)-69);
      this.aj = var1.cw(2132366214);
      var1.cy((short)-28149);
   }

   void aw(gw var1, int var2) {
      try {
         fs var3 = (fs)var1.ak.get(-549854311 * this.ap);
         var3.ap = this.aw;
         var3.aw = this.ak * 1142062819;
         var3.ak = new wx(this.aj);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ga.aw(" + ')');
      }
   }

   void ai(gw var1) {
      fs var2 = (fs)var1.ak.get(1918592322 * this.ap);
      var2.ap = this.aw;
      var2.aw = this.ak * 1142062819;
      var2.ak = new wx(this.aj);
   }

   public static void an(int var0) {
      try {
         hy.aj.aj();
         hy.ai.aj();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ga.an(" + ')');
      }
   }

   static void mu(ng[] var0, int var1, int var2, int var3, boolean var4, int var5) {
      try {
         for(int var6 = 0; var6 < var0.length; ++var6) {
            if (var5 == -1347039238) {
               throw new IllegalStateException();
            }

            ng var7 = var0[var6];
            if (null == var7) {
               if (var5 == -1347039238) {
                  return;
               }
            } else if (var1 == 53502319 * var7.bi) {
               fr.mf(var7, var2, var3, var4, 760262054);
               mb.mr(var7, var2, var3, (byte)0);
               if (336181451 * var7.bg > -1378813425 * var7.be - 2013768333 * var7.bo) {
                  if (var5 == -1347039238) {
                     throw new IllegalStateException();
                  }

                  var7.bg = -475951283 * var7.be - -1389349113 * var7.bo;
               }

               if (var7.bg * 336181451 < 0) {
                  var7.bg = 0;
               }

               if (var7.bl * -291221237 > 1283703355 * var7.cq - -1662542495 * var7.bd) {
                  if (var5 == -1347039238) {
                     throw new IllegalStateException();
                  }

                  var7.bl = var7.cq * 1887728017 - var7.bd * -1349851453;
               }

               if (var7.bl * -291221237 < 0) {
                  var7.bl = 0;
               }

               if (var7.bk * -1973680119 == 0) {
                  if (var5 == -1347039238) {
                     throw new IllegalStateException();
                  }

                  ba.mo(var0, var7, var4, (byte)-60);
               }
            }
         }

      } catch (RuntimeException var8) {
         throw tm.aw(var8, "ga.mu(" + ')');
      }
   }

   static double an(int var0, int var1, int var2, int var3) {
      try {
         double var10000;
         if (var1 > 0) {
            if (var3 <= 2123532045) {
               throw new IllegalStateException();
            }

            var10000 = (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1));
         } else {
            var10000 = 1.0D;
         }

         double var4 = var10000;
         if (!(var4 <= 0.0D)) {
            if (var3 <= 2123532045) {
               throw new IllegalStateException();
            }

            if (!(var4 >= 1.0D)) {
               double var6;
               double var8;
               switch(var2) {
               case 0:
                  return var4;
               case 1:
                  return 1.0D - Math.cos(var4 * 3.141592653589793D / 2.0D);
               case 2:
                  return Math.sin(var4 * 3.141592653589793D / 2.0D);
               case 3:
                  return -(Math.cos(var4 * 3.141592653589793D) - 1.0D) / 2.0D;
               case 4:
                  return var4 * var4;
               case 5:
                  return 1.0D - (1.0D - var4) * (1.0D - var4);
               case 6:
                  if (var4 < 0.5D) {
                     if (var3 <= 2123532045) {
                        throw new IllegalStateException();
                     }

                     var10000 = var4 * 2.0D * var4;
                  } else {
                     var10000 = 1.0D - Math.pow(-2.0D * var4 + 2.0D, 2.0D) / 2.0D;
                  }

                  return var10000;
               case 7:
                  return var4 * var4 * var4;
               case 8:
                  return 1.0D - Math.pow(1.0D - var4, 3.0D);
               case 9:
                  if (var4 < 0.5D) {
                     if (var3 <= 2123532045) {
                        throw new IllegalStateException();
                     }

                     var10000 = var4 * var4 * 4.0D * var4;
                  } else {
                     var10000 = 1.0D - Math.pow(2.0D + -2.0D * var4, 3.0D) / 2.0D;
                  }

                  return var10000;
               case 10:
                  return var4 * var4 * var4 * var4;
               case 11:
                  return 1.0D - Math.pow(1.0D - var4, 4.0D);
               case 12:
                  return var4 < 0.5D ? var4 * var4 * var4 * var4 * 8.0D : 1.0D - Math.pow(var4 * -2.0D + 2.0D, 4.0D) / 2.0D;
               case 13:
                  return var4 * var4 * var4 * var4 * var4;
               case 14:
                  return 1.0D - Math.pow(1.0D - var4, 5.0D);
               case 15:
                  if (var4 < 0.5D) {
                     if (var3 <= 2123532045) {
                        throw new IllegalStateException();
                     }

                     var10000 = var4 * var4 * var4 * 8.0D * var4 * var4;
                  } else {
                     var10000 = 1.0D - Math.pow(var4 * -2.0D + 2.0D, 5.0D) / 2.0D;
                  }

                  return var10000;
               case 16:
                  return Math.pow(2.0D, 10.0D * var4 - 10.0D);
               case 17:
                  return 1.0D - Math.pow(2.0D, var4 * -10.0D);
               case 18:
                  if (var4 < 0.5D) {
                     if (var3 <= 2123532045) {
                        throw new IllegalStateException();
                     }

                     var10000 = Math.pow(2.0D, 20.0D * var4 + 10.0D) / 2.0D;
                  } else {
                     var10000 = (2.0D - Math.pow(2.0D, var4 * -20.0D + 10.0D)) / 2.0D;
                  }

                  return var10000;
               case 19:
                  return 1.0D - Math.sqrt(1.0D - Math.pow(var4, 2.0D));
               case 20:
                  return Math.sqrt(1.0D - Math.pow(var4 - 1.0D, 2.0D));
               case 21:
                  if (var4 < 0.5D) {
                     if (var3 <= 2123532045) {
                        throw new IllegalStateException();
                     }

                     var10000 = (1.0D - Math.sqrt(1.0D - Math.pow(2.0D * var4, 2.0D))) / 2.0D;
                  } else {
                     var10000 = (Math.sqrt(1.0D - Math.pow(var4 * -2.0D + 2.0D, 2.0D)) + 1.0D) / 2.0D;
                  }

                  return var10000;
               case 22:
                  var6 = 1.70158D;
                  var8 = 2.70158D;
                  return var4 * var4 * 2.70158D * var4 - var4 * 1.70158D * var4;
               case 23:
                  var6 = 1.70158D;
                  var8 = 2.70158D;
                  return 1.0D + 2.70158D * Math.pow(var4 - 1.0D, 3.0D) + 1.70158D * Math.pow(var4 - 1.0D, 2.0D);
               case 24:
                  var6 = 1.70158D;
                  var8 = 2.5949095D;
                  return var4 < 0.5D ? Math.pow(var4 * 2.0D, 2.0D) * (var4 * 7.189819D - 2.5949095D) / 2.0D : (Math.pow(var4 * 2.0D - 2.0D, 2.0D) * (3.5949095D * (2.0D * var4 - 2.0D) + 2.5949095D) + 2.0D) / 2.0D;
               case 25:
                  var6 = 2.0943951023931953D;
                  return -Math.pow(2.0D, var4 * 10.0D - 10.0D) * Math.sin((var4 * 10.0D - 10.75D) * 2.0943951023931953D);
               case 26:
                  var6 = 2.0943951023931953D;
                  return Math.pow(2.0D, var4 * -10.0D) * Math.sin((10.0D * var4 - 0.75D) * 2.0943951023931953D) + 1.0D;
               case 27:
                  var6 = 1.3962634015954636D;
                  var8 = Math.sin(1.3962634015954636D * (20.0D * var4 - 11.125D));
                  if (var4 < 0.5D) {
                     if (var3 <= 2123532045) {
                        throw new IllegalStateException();
                     }

                     var10000 = -(Math.pow(2.0D, var4 * 20.0D - 10.0D) * var8) / 2.0D;
                  } else {
                     var10000 = Math.pow(2.0D, var4 * -20.0D + 10.0D) * var8 / 2.0D + 1.0D;
                  }

                  return var10000;
               default:
                  return var4;
               }
            }
         }

         return var4 <= 0.0D ? 0.0D : 1.0D;
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "ga.an(" + ')');
      }
   }
}
