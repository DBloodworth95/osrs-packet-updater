import java.util.ArrayList;

public class ny {
   static final int ay = 4;
   public int aw;
   public int ap;
   public int ak;
   public static final int ac = 2;
   static final int wj = -2;

   static void hy(int var0, byte var1) {
      try {
         if (-1 == var0 && !client.tz) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            gg.aj(0, 0, -621511661);
         } else if (var0 != -1) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            if (!ja.as(var0, -606271217)) {
               if (var1 != 0) {
                  throw new IllegalStateException();
               }

               if (io.vx.ag((byte)6) != 0) {
                  if (var1 != 0) {
                     throw new IllegalStateException();
                  }

                  ArrayList var2 = new ArrayList();
                  var2.add(new no(bc.fa, var0, 0, io.vx.ag((byte)-79), false));
                  if (client.tz) {
                     if (var1 != 0) {
                        throw new IllegalStateException();
                     }

                     jn.au(var2, 0, 100, 100, 0, (short)-9751);
                  } else {
                     hh.aw(var2, 0, 100, 100, 0, false, 223356082);
                  }
               }
            }
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ny.hy(" + ')');
      }
   }

   ny() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ny.<init>(" + ')');
      }
   }
}
