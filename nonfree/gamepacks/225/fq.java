import java.util.concurrent.ThreadFactory;

final class fq implements ThreadFactory {
   static int[] jo;
   static final int cr = 106;
   public static po ac;

   public static hf ac(int var0, int var1) {
      try {
         if (var0 >= 0) {
            if (var1 == -1351012196) {
               throw new IllegalStateException();
            }

            if (var0 < hf.ae.length) {
               if (var1 == -1351012196) {
                  throw new IllegalStateException();
               }

               if (hf.ae[var0] != null) {
                  if (var1 == -1351012196) {
                     throw new IllegalStateException();
                  }

                  return hf.ae[var0];
               }
            }
         }

         return new hf(var0);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "fq.ac(" + ')');
      }
   }

   public Thread newThread(Runnable var1) {
      try {
         return new Thread(var1, "OSRS Maya Anim Load");
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "fq.newThread(" + ')');
      }
   }

   static void aq(int var0) {
      try {
         dt.ac.am();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "fq.aq(" + ')');
      }
   }

   public Thread ae(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }

   public Thread ag(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }

   static final float aq(int var0, int var1) {
      try {
         float var2 = 10075.0F - (float)var0;
         return (var2 * 1.0075567F - 75.56675F) / var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "fq.aq(" + ')');
      }
   }

   public Thread ac(Runnable var1) {
      return new Thread(var1, "OSRS Maya Anim Load");
   }

   static final boolean as(int var0, int var1, byte var2) {
      try {
         id var3 = kf.ae(var0, (byte)97);
         if (11 == var1) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            var1 = 10;
         }

         if (var1 >= 5) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            if (var1 <= 8) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               var1 = 4;
            }
         }

         return var3.aq(var1, (byte)-110);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "fq.as(" + ')');
      }
   }
}
