import java.util.Comparator;

public abstract class si implements Comparator {
   Comparator aw;
   static final int aj = 1024;
   static final int bp = 48;

   static final void jw(byte var0) {
      try {
         client.mv = 0;
         int var1 = (-1517174943 * nw.mc.bk >> 7) + hx.jf.as * -2014668603;
         int var2 = (nw.mc.bb * 669935203 >> 7) + hx.jf.ae * 1601580509;
         if (var1 >= 3053) {
            if (var0 == 65) {
               throw new IllegalStateException();
            }

            if (var1 <= 3156) {
               if (var0 == 65) {
                  throw new IllegalStateException();
               }

               if (var2 >= 3056) {
                  if (var0 == 65) {
                     throw new IllegalStateException();
                  }

                  if (var2 <= 3136) {
                     if (var0 == 65) {
                        throw new IllegalStateException();
                     }

                     client.mv = -1328686535;
                  }
               }
            }
         }

         if (var1 >= 3072) {
            if (var0 == 65) {
               return;
            }

            if (var1 <= 3118) {
               if (var0 == 65) {
                  return;
               }

               if (var2 >= 9492) {
                  if (var0 == 65) {
                     throw new IllegalStateException();
                  }

                  if (var2 <= 9535) {
                     client.mv = -1328686535;
                  }
               }
            }
         }

         if (client.mv * -17959927 == 1) {
            if (var0 == 65) {
               throw new IllegalStateException();
            }

            if (var1 >= 3139) {
               if (var0 == 65) {
                  throw new IllegalStateException();
               }

               if (var1 <= 3199) {
                  if (var0 == 65) {
                     throw new IllegalStateException();
                  }

                  if (var2 >= 3008) {
                     if (var0 == 65) {
                        throw new IllegalStateException();
                     }

                     if (var2 <= 3062) {
                        if (var0 == 65) {
                           throw new IllegalStateException();
                        }

                        client.mv = 0;
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "si.jw(" + ')');
      }
   }

   final void ao(Comparator var1) {
      if (this.aw == null) {
         this.aw = var1;
      } else if (this.aw instanceof si) {
         ((si)this.aw).au(var1, 714389614);
      }

   }

   protected final int an(se var1, se var2, int var3) {
      try {
         if (null == this.aw) {
            if (var3 != 1255277363) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            return this.aw.compare(var1, var2);
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "si.an(" + ')');
      }
   }

   final void au(Comparator var1, int var2) {
      try {
         if (this.aw == null) {
            if (var2 >= 1947949031) {
               throw new IllegalStateException();
            }

            this.aw = var1;
         } else if (this.aw instanceof si) {
            ((si)this.aw).au(var1, -1007639658);
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "si.au(" + ')');
      }
   }

   public boolean gj(Object var1) {
      return super.equals(var1);
   }

   protected si() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "si.<init>(" + ')');
      }
   }

   protected final int af(se var1, se var2) {
      return null == this.aw ? 0 : this.aw.compare(var1, var2);
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "si.equals(" + ')');
      }
   }

   static final void my(int var0, int var1, short var2) {
      try {
         if (!qk.ek.ak(var0, -282033647)) {
            if (var2 > 3332) {
               ;
            }
         } else {
            dw.ma(qk.ek.ay[var0], var1, 1993562781);
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "si.my(" + ')');
      }
   }

   protected final int ar(se var1, se var2) {
      return null == this.aw ? 0 : this.aw.compare(var1, var2);
   }
}
