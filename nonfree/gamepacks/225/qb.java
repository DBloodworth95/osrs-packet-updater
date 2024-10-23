import java.io.IOException;
import java.net.Socket;

public class qb extends ri {
   static final int ca = 89;
   static final int bh = 29;

   public boolean ag() {
      if (mm.aq.size() > 1 && mm.aq.get(0) != null && ((ns)mm.aq.get(0)).al.ap(1891926304) && mm.aq.get(1) != null && ((ns)mm.aq.get(1)).al.ap(1891926304)) {
         ns var1 = (ns)mm.aq.get(0);
         mm.aq.set(0, mm.aq.get(1));
         mm.aq.set(1, var1);
      }

      return true;
   }

   public boolean ac(int var1) {
      try {
         if (mm.aq.size() > 1 && mm.aq.get(0) != null) {
            if (var1 != -1411718299) {
               throw new IllegalStateException();
            }

            if (((ns)mm.aq.get(0)).al.ap(1891926304)) {
               if (var1 != -1411718299) {
                  throw new IllegalStateException();
               }

               if (mm.aq.get(1) != null) {
                  if (var1 != -1411718299) {
                     throw new IllegalStateException();
                  }

                  if (((ns)mm.aq.get(1)).al.ap(1891926304)) {
                     if (var1 != -1411718299) {
                        throw new IllegalStateException();
                     }

                     ns var2 = (ns)mm.aq.get(0);
                     mm.aq.set(0, mm.aq.get(1));
                     mm.aq.set(1, var2);
                  }
               }
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "qb.ac(" + ')');
      }
   }

   public qb(ri var1) {
      try {
         super(var1);
         this.ax = "SwapSongTask";
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "qb.<init>(" + ')');
      }
   }

   public static sk ac(Socket var0, int var1, int var2, int var3) throws IOException {
      try {
         return new so(var0, var1, var2);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "qb.ac(" + ')');
      }
   }
}
