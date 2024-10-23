public class iy extends ij {
   String ap;
   // $FF: synthetic field
   final ik this$0;
   static qi id;

   public int aj() {
      return 1;
   }

   iy(ik var1, String var2, String var3) {
      try {
         this.this$0 = var1;
         super(var1, var2);
         this.ap = var3;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "iy.<init>(" + ')');
      }
   }

   public String am(byte var1) {
      try {
         return this.ap;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "iy.am(" + ')');
      }
   }

   public int ak() {
      return 1;
   }

   public int ap(int var1) {
      try {
         return 1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "iy.ap(" + ')');
      }
   }

   public int ai() {
      return 1;
   }

   public int ay() {
      return 1;
   }

   public String at() {
      return this.ap;
   }

   public String au() {
      return this.ap;
   }

   static final void kj(dn var0, int var1, int var2, int var3, int var4) {
      try {
         pu var5 = var0.ad[var1][var2][var3];
         if (var5 == null) {
            if (var4 >= 421929324) {
               throw new IllegalStateException();
            } else {
               var0.aw.aa(var1, var2, var3);
            }
         } else {
            long var6 = -99999999L;
            ec var8 = null;

            ec var9;
            for(var9 = (ec)var5.as(); var9 != null; var9 = (ec)var5.am()) {
               if (var4 >= 421929324) {
                  throw new IllegalStateException();
               }

               ip var10 = qg.aw(var9.ap * 1119456901, 649869579);
               long var11 = (long)(2044853295 * var10.bb);
               if (var10.bk * 1382901153 == 1) {
                  if (var4 >= 421929324) {
                     return;
                  }

                  long var10001;
                  if (var9.aw * -1423952523 < Integer.MAX_VALUE) {
                     if (var4 >= 421929324) {
                        throw new IllegalStateException();
                     }

                     var10001 = (long)(1 + var9.aw * -1423952523);
                  } else {
                     var10001 = (long)(var9.aw * -1423952523);
                  }

                  var11 *= var10001;
               }

               if (var11 > var6) {
                  if (var4 >= 421929324) {
                     throw new IllegalStateException();
                  }

                  var6 = var11;
                  var8 = var9;
               }
            }

            if (null == var8) {
               if (var4 >= 421929324) {
                  throw new IllegalStateException();
               } else {
                  var0.aw.aa(var1, var2, var3);
               }
            } else {
               var5.ak(var8);
               ec var15 = null;
               ec var16 = null;

               for(var9 = (ec)var5.as(); var9 != null; var9 = (ec)var5.am()) {
                  if (var4 >= 421929324) {
                     throw new IllegalStateException();
                  }

                  if (1119456901 * var9.ap != 1119456901 * var8.ap) {
                     if (var4 >= 421929324) {
                        throw new IllegalStateException();
                     }

                     if (null == var15) {
                        if (var4 >= 421929324) {
                           return;
                        }

                        var15 = var9;
                     }

                     if (1119456901 * var15.ap != 1119456901 * var9.ap) {
                        if (var4 >= 421929324) {
                           throw new IllegalStateException();
                        }

                        if (var16 == null) {
                           if (var4 >= 421929324) {
                              throw new IllegalStateException();
                           }

                           var16 = var9;
                        }
                     }
                  }
               }

               long var12 = fd.at(var2, var3, 3, false, 0, -1948824391 * var0.ap, (byte)-61);
               var0.aw.ae(var1, var2, var3, cu.jl(var0, nn.ao(var2, -111975170), nn.ao(var3, 1014808262), var1, -334125856), var8, var12, var15, var16);
            }
         }
      } catch (RuntimeException var14) {
         throw tm.aw(var14, "iy.kj(" + ')');
      }
   }
}
