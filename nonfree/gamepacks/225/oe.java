public abstract class oe {
   static int av;
   static final int ae = -3407872;
   static short[][][] ag;

   oe() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "oe.<init>(" + ')');
      }
   }

   abstract byte[] at();

   public abstract void ag(byte[] var1, byte var2);

   abstract byte[] ae(int var1);

   static void ax(int var0, int var1) {
      try {
         de var2 = (de)de.ac.ac((long)var0);
         if (var2 == null) {
            if (var1 == 1150006943) {
               throw new IllegalStateException();
            }
         } else {
            for(int var3 = 0; var3 < var2.ae.length; ++var3) {
               if (var1 == 1150006943) {
                  return;
               }

               var2.ae[var3] = -1;
               var2.ag[var3] = 0;
            }

         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "oe.ax(" + ')');
      }
   }

   abstract byte[] aq();

   public static byte[] ax(Object var0, boolean var1) {
      if (var0 == null) {
         return null;
      } else if (var0 instanceof byte[]) {
         byte[] var6 = (byte[])((byte[])var0);
         if (var1) {
            int var4 = var6.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(var6, 0, var5, 0, var4);
            return var5;
         } else {
            return var6;
         }
      } else if (var0 instanceof oe) {
         oe var2 = (oe)var0;
         return var2.ae(1892327026);
      } else {
         throw new IllegalArgumentException();
      }
   }

   abstract byte[] af();

   public static byte[] am(Object var0, boolean var1) {
      if (var0 == null) {
         return null;
      } else if (var0 instanceof byte[]) {
         byte[] var6 = (byte[])((byte[])var0);
         if (var1) {
            int var4 = var6.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(var6, 0, var5, 0, var4);
            return var5;
         } else {
            return var6;
         }
      } else if (var0 instanceof oe) {
         oe var2 = (oe)var0;
         return var2.ae(754501465);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public abstract void ar(byte[] var1);

   public abstract void al(byte[] var1);

   public abstract void ad(byte[] var1);

   public abstract void ah(byte[] var1);

   static of hv(int var0, boolean var1, boolean var2, boolean var3, boolean var4, boolean var5, int var6) {
      try {
         sl var7 = null;
         if (null != il.ah) {
            if (var6 <= -1436784807) {
               throw new IllegalStateException();
            }

            var7 = new sl(var0, il.ah, ij.ab[var0], 1000000);
         }

         return new of(var7, ol.vx, tw.ve, var0, var1, var2, var3, var4, var5);
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "oe.hv(" + ')');
      }
   }

   abstract byte[] au();
}
