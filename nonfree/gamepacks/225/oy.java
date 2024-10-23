public class oy {
   public static final oy ap = new oy(12);
   public static final oy az = new oy(14);
   public static final oy ag = new oy(1);
   public static final oy am = new oy(2);
   public static final oy ae = new oy(0);
   public static final oy ax = new oy(3);
   public static final oy af = new oy(5);
   public static final oy aa = new oy(15);
   public static final oy au = new oy(7);
   public static final oy ar = new oy(8);
   public static final oy al = new oy(9);
   public static final oy ad = new oy(10);
   public static final oy av = new oy(22);
   public static final oy aq = new oy(4);
   public static final oy ab = new oy(13);
   public static final oy at = new oy(6);
   public static final oy ai = new oy(17);
   static final oy ac = new oy(255);
   public static final oy ao = new oy(18);
   public static final oy as = new oy(19);
   public static final oy ay = new oy(20);
   public static final oy aj = new oy(21);
   public static final oy ah = new oy(11);
   public final int aw;

   oy(int var1) {
      try {
         super();
         this.aw = -1089882497 * var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "oy.<init>(" + ')');
      }
   }

   static void pu(boolean var0, int var1) {
      try {
         client.nu = var0;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "oy.pu(" + ')');
      }
   }

   static uv pc(int var0, byte var1) {
      try {
         uv var2 = (uv)client.wq.ac((long)var0);
         if (var2 == null) {
            if (var1 == 89) {
               throw new IllegalStateException();
            }

            var2 = new uv(ga.fw, var0);
         }

         return var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "oy.pc(" + ')');
      }
   }

   static float ae(float[] var0, int var1, float var2, byte var3) {
      try {
         float var4 = var0[var1];

         for(int var5 = var1 - 1; var5 >= 0; --var5) {
            if (var3 == 1) {
               throw new IllegalStateException();
            }

            var4 = var0[var5] + var2 * var4;
         }

         return var4;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "oy.ae(" + ')');
      }
   }
}
