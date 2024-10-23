public class gv {
   public static final int ae = 2;
   public static final int ac = 1;
   public short[] ag;
   public short[] am;
   static final int aq = 32;
   static int go;

   public gv(int var1) {
      try {
         super();
         is var2 = dh.ac(var1, 2084562506);
         if (var2.aj((byte)-124)) {
            this.ag = new short[var2.as.length];
            System.arraycopy(var2.as, 0, this.ag, 0, this.ag.length);
         }

         if (var2.av(-1511918523)) {
            this.am = new short[var2.aj.length];
            System.arraycopy(var2.aj, 0, this.am, 0, this.am.length);
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "gv.<init>(" + ')');
      }
   }

   static dt ae(int var0, int var1, int var2, short var3) {
      try {
         int var4 = var0 + (var1 << 8);
         dt var6 = fp.ag(var4, var0, (byte)1);
         if (null != var6) {
            if (var3 == 249) {
               throw new IllegalStateException();
            } else {
               return var6;
            }
         } else {
            int var5 = bd.ac(var2, var0, -1353077859);
            var6 = fp.ag(var5, var0, (byte)1);
            if (null != var6) {
               return var6;
            } else {
               int var7 = -512 + var0;
               var6 = fp.ag(var7, var0, (byte)1);
               if (null != var6) {
                  if (var3 == 249) {
                     throw new IllegalStateException();
                  } else {
                     return var6;
                  }
               } else {
                  return null;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "gv.ae(" + ')');
      }
   }
}
