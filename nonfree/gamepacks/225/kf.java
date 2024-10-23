public class kf {
   static final int ac = 0;
   static final int aq = 70;
   public static final int af = 512;
   static final int ab = 9;

   kf() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "kf.<init>(" + ')');
      }
   }

   public static id ae(int var0, byte var1) {
      try {
         id var2 = (id)id.am.ac((long)var0);
         if (null != var2) {
            if (var1 <= 2) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = id.ae.bt(6, var0, (byte)-2);
            var2 = new id();
            var2.au = var0 * -347760831;
            if (null != var3) {
               if (var1 <= 2) {
                  throw new IllegalStateException();
               }

               var2.am(new vf(var3), 1441228174);
            }

            var2.ag(-1886367928);
            if (var2.bg) {
               if (var1 <= 2) {
                  throw new IllegalStateException();
               }

               var2.ao = 0;
               var2.as = false;
            }

            id.am.ag(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "kf.ae(" + ')');
      }
   }

   public static long ar(int var0, int var1, int var2, boolean var3, int var4, int var5, byte var6) {
      try {
         long var7 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17 | ((long)var5 & 2047L) << 49;
         if (var3) {
            if (var6 == 0) {
               throw new IllegalStateException();
            }

            var7 |= 65536L;
         }

         return var7;
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "kf.ar(" + ')');
      }
   }
}
