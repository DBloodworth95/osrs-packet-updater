public class qd {
   int ap;

   public int aw() {
      return 1501095833 * this.ap;
   }

   public int ap(int var1) {
      try {
         return 1501095833 * this.ap;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "qd.ap(" + ')');
      }
   }

   static final void nv(int var0, byte var1) {
      try {
         var0 = Math.min(Math.max(var0, 0), 255);
         if (var0 != io.vx.ag((byte)-33)) {
            if (var1 == 1) {
               throw new IllegalStateException();
            }

            label44: {
               if (io.vx.ag((byte)16) == 0) {
                  boolean var10000;
                  if (!mp.as.isEmpty()) {
                     if (var1 == 1) {
                        return;
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  boolean var2 = var10000;
                  if (var2) {
                     if (var1 == 1) {
                        throw new IllegalStateException();
                     }

                     jf.am(bc.fa, var0, 2119965459);
                     client.tz = false;
                     break label44;
                  }
               }

               if (0 == var0) {
                  if (var1 == 1) {
                     return;
                  }

                  gg.aj(0, 0, -1493117234);
                  client.tz = false;
               } else {
                  az.ak(var0, -1330856186);
               }
            }

            io.vx.az(var0, 1751991591);
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qd.nv(" + ')');
      }
   }

   public int ak() {
      return 1501095833 * this.ap;
   }

   public int aj() {
      return 1501095833 * this.ap;
   }

   qd(int var1, boolean var2) {
      try {
         super();
         this.ap = 866745513 * var1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qd.<init>(" + ')');
      }
   }

   static ng on(ng var0, int var1) {
      try {
         int var2 = ex.ak(gr.oa(var0, 58754017), 1839611801);
         if (0 == var2) {
            if (var1 != 50179034) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            for(int var3 = 0; var3 < var2; ++var3) {
               if (var1 != 50179034) {
                  throw new IllegalStateException();
               }

               var0 = qk.ek.ap(var0.bi * 53502319, -1527508860);
               if (var0 == null) {
                  if (var1 != 50179034) {
                     throw new IllegalStateException();
                  }

                  return null;
               }
            }

            return var0;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "qd.on(" + ')');
      }
   }
}
