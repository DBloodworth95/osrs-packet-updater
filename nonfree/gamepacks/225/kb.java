public class kb {
   static final int hv = 16;
   public static final kb ae = new kb(1);
   public static final kb ac = new kb(-1);
   static final int az = 2340;
   static final int ap = 11;
   static final int sf = 128;

   static void ac(vv var0, int var1, int var2, int var3, int var4) {
      try {
         mh var5 = ld.ax;
         long var7 = (long)(var3 << 16 | var1 << 8 | var2);
         var5.ax(var0, var7, 4 * var0.ac.length);
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "kb.ac(" + ')');
      }
   }

   kb(int var1) {
      try {
         super();
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "kb.<init>(" + ')');
      }
   }

   static void je(di var0, int var1, int var2, int var3) {
      try {
         if (1036457443 * var0.cd == var1) {
            if (var3 != -583937703) {
               throw new IllegalStateException();
            }

            if (-1 != var1) {
               if (var3 != -583937703) {
                  throw new IllegalStateException();
               }

               int var4 = ds.ae(var1, -683358200).bx * -124286531;
               if (var4 == 1) {
                  var0.ce = 0;
                  var0.ck = 0;
                  var0.dp = var2 * -1278914835;
                  var0.df = 0;
               }

               if (var4 == 2) {
                  if (var3 != -583937703) {
                     throw new IllegalStateException();
                  }

                  var0.df = 0;
               }

               return;
            }
         }

         if (-1 != var1 && -1 != var0.cd * 1036457443) {
            if (var3 != -583937703) {
               return;
            }

            if (ds.ae(var1, -683358200).av * 977017053 < ds.ae(1036457443 * var0.cd, -683358200).av * 977017053) {
               return;
            }
         }

         var0.cd = -46082101 * var1;
         var0.ce = 0;
         var0.ck = 0;
         var0.dp = var2 * -1278914835;
         var0.df = 0;
         var0.ea = var0.ds * -78879915;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "kb.je(" + ')');
      }
   }
}
