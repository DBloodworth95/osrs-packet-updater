import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class al extends Canvas {
   Component ap;
   static final float ex = 200.0F;
   static final int rm = 2160;

   static final void aw(long var0) {
      try {
         try {
            Thread.sleep(var0);
         } catch (InterruptedException var3) {
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "al.aw(" + ')');
      }
   }

   public final void update(Graphics var1) {
      try {
         this.ap.update(var1);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "al.update(" + ')');
      }
   }

   static final void nl(String var0, int var1) {
      try {
         if (var0.equals("")) {
            if (var1 >= 762659825) {
               throw new IllegalStateException();
            }
         } else {
            me var2 = ef.ap(mm.cy, client.in.ai, (byte)74);
            var2.ak.bo(ct.bl(var0, 277965979), 613974636);
            var2.ak.be(var0, (byte)25);
            client.in.ak(var2, (short)486);
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "al.nl(" + ')');
      }
   }

   al(Component var1) {
      try {
         super();
         this.ap = var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "al.<init>(" + ')');
      }
   }

   public final void aw(Graphics var1) {
      this.ap.paint(var1);
   }

   public final void ak(Graphics var1) {
      this.ap.paint(var1);
   }

   static final void an(String var0, int var1) {
      try {
         me var2 = ef.ap(mm.dh, client.in.ai, (byte)42);
         var2.ak.bo(ct.bl(var0, -965274317), -1544817673);
         var2.ak.be(var0, (byte)87);
         client.in.ak(var2, (short)486);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "al.an(" + ')');
      }
   }

   static int cq(int var0, da var1, boolean var2, int var3) {
      try {
         return 2;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "al.cq(" + ')');
      }
   }

   public final void ap(Graphics var1) {
      this.ap.update(var1);
   }

   public final void paint(Graphics var1) {
      try {
         this.ap.paint(var1);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "al.paint(" + ')');
      }
   }

   public static int aw(float var0, int var1) {
      try {
         return (int)(2048.0D * ((double)var0 / 6.283185307179586D)) & 2047;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "al.aw(" + ')');
      }
   }

   static float aw(fv var0, float var1, byte var2) {
      try {
         if (var0 == null) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            } else {
               return 0.0F;
            }
         } else {
            float var3;
            if (var0.as == var1) {
               if (var2 <= 0) {
                  throw new IllegalStateException();
               }

               var3 = 0.0F;
            } else if (var0.ae == var1) {
               if (var2 <= 0) {
                  throw new IllegalStateException();
               }

               var3 = 1.0F;
            } else {
               var3 = (var1 - var0.as) / (var0.ae - var0.as);
            }

            float var4;
            if (var0.ay) {
               var4 = var3;
            } else {
               float[] var5 = new float[]{var0.am - var3, var0.at, var0.au, var0.an};
               float[] var6 = new float[5];
               int var7 = jq.ap(var5, 3, 0.0F, true, 1.0F, true, var6, 1350563286);
               if (var7 == 1) {
                  var4 = var6[0];
               } else {
                  var4 = 0.0F;
               }
            }

            return (var4 * (var0.ar + var0.ab * var4) + var0.af) * var4 + var0.ao;
         }
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "al.aw(" + ')');
      }
   }
}
