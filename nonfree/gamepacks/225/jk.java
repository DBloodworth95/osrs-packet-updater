public class jk extends tr {
   jt[] ac;
   static final int ag = 6;
   public static final int be = 66;

   public static final float af(float var0, int var1) {
      try {
         float var2 = 75.0F;
         float var3 = 10000.0F;
         float var4 = 750000.0F / (10000.0F - 9925.0F * var0);
         return (var4 - 75.0F) / 9925.0F;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "jk.af(" + ')');
      }
   }

   public boolean ac(int var1, int var2) {
      try {
         return this.ac[var1].al;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "jk.ac(" + ')');
      }
   }

   public jk(po var1, po var2, int var3, boolean var4) {
      try {
         super();
         pk var5 = new pk();
         int var6 = var1.cj(var3, (byte)117);
         this.ac = new jt[var6];
         int[] var7 = var1.cm(var3, -1863768119);

         for(int var8 = 0; var8 < var7.length; ++var8) {
            byte[] var9 = var1.bt(var3, var7[var8], (byte)75);
            jg var10 = null;
            int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

            for(jg var12 = (jg)var5.af(); var12 != null; var12 = (jg)var5.au()) {
               if (var11 == -210256089 * var12.aq) {
                  var10 = var12;
                  break;
               }
            }

            if (null == var10) {
               byte[] var13;
               if (var4) {
                  var13 = var2.cf(0, var11, (byte)1);
               } else {
                  var13 = var2.cf(var11, 0, (byte)1);
               }

               var10 = new jg(var11, var13);
               var5.ae(var10);
            }

            this.ac[var7[var8]] = new jt(var9, var10);
         }

      } catch (RuntimeException var14) {
         throw vk.ae(var14, "jk.<init>(" + ')');
      }
   }

   public boolean ag(int var1) {
      return this.ac[var1].al;
   }

   public boolean ae(int var1) {
      return this.ac[var1].al;
   }

   static final void oc(ny var0, int var1) {
      try {
         int var2 = var0.bs * 571012371;
         if (var2 == 324) {
            if (var1 >= -608329485) {
               throw new IllegalStateException();
            } else {
               if (client.vu * 421605065 == -1) {
                  if (var1 >= -608329485) {
                     throw new IllegalStateException();
                  }

                  client.vu = var0.cg * -266125129;
                  client.vr = var0.ct * -1111642585;
               }

               if (1 == 2024464609 * client.vn.ax) {
                  var0.cg = 1198497031 * client.vu;
               } else {
                  var0.cg = client.vr * -1459834821;
               }

            }
         } else if (var2 == 325) {
            if (var1 >= -608329485) {
               throw new IllegalStateException();
            } else {
               if (-1 == 421605065 * client.vu) {
                  if (var1 >= -608329485) {
                     return;
                  }

                  client.vu = -266125129 * var0.cg;
                  client.vr = var0.ct * -1111642585;
               }

               if (client.vn.ax * 2024464609 == 1) {
                  if (var1 >= -608329485) {
                     throw new IllegalStateException();
                  }

                  var0.cg = -1459834821 * client.vr;
               } else {
                  var0.cg = client.vu * 1198497031;
               }

            }
         } else if (327 == var2) {
            if (var1 >= -608329485) {
               throw new IllegalStateException();
            } else {
               var0.dv = -257568418;
               var0.dt = ((int)(Math.sin((double)(client.do * 1472813913) / 40.0D) * 256.0D) & 2047) * -1395996679;
               var0.cs = 898107655;
               var0.cp = 0;
            }
         } else if (var2 == 328) {
            if (var1 >= -608329485) {
               throw new IllegalStateException();
            } else {
               var0.dv = -257568418;
               var0.dt = ((int)(Math.sin((double)(client.do * 1472813913) / 40.0D) * 256.0D) & 2047) * -1395996679;
               var0.cs = 898107655;
               var0.cp = 1919793905;
            }
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "jk.oc(" + ')');
      }
   }
}
