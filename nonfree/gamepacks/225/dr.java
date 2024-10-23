public final class dr extends to {
   public static final int aj = 4;
   int ae;
   int ag;
   int ac;
   int ax;
   int aq;
   int af;
   int au;
   static of fk;
   int ar;
   int at;
   static final int ad = 31;
   int ah;
   int ap;
   int ab;
   static gm aa;
   int al;
   int am;

   void ac(int var1, int var2) {
      try {
         this.ah = 116367893 * var1;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "dr.ac(" + ')');
      }
   }

   dr() {
      try {
         super();
         this.ah = -687562613;
         this.ap = 0;
         this.ab = -226118735;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "dr.<init>(" + ')');
      }
   }

   boolean ae(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 >= -1661763989) {
               throw new IllegalStateException();
            }

            if (var1 <= 4) {
               boolean var10000;
               if ((-371057347 * this.ah & 1 << var1) != 0) {
                  if (var2 >= -1661763989) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               return var10000;
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "dr.ae(" + ')');
      }
   }

   void ag(int var1) {
      this.ah = 116367893 * var1;
   }

   boolean am(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (-371057347 * this.ah & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   boolean ax(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (272712472 * this.ah & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   public static boolean ps(int var0) {
      try {
         boolean var10000;
         if (null != client.pd) {
            if (var0 <= -1317426812) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "dr.ps(" + ')');
      }
   }
}
