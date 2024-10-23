import java.util.ArrayList;
import java.util.Iterator;

public class rl extends ri {
   public static final int aj = 47;
   ArrayList ac;
   static short[][][] ae;

   public boolean ag() {
      if (this.ac.isEmpty()) {
         return true;
      } else {
         Iterator var1 = this.ac.iterator();

         while(var1.hasNext()) {
            ns var2 = (ns)var1.next();

            try {
               if (mm.aq.contains(var2)) {
                  if (var2 == null) {
                     mm.aq.remove(var2);
                  } else {
                     if (1813270399 * var2.al.bb > 0) {
                        ms var10000 = var2.al;
                        var10000.bb -= 1130066047;
                     }

                     if (var2.al.bb * 1813270399 == 0) {
                        var2.al.ah(-1914935979);
                        var2.al.ar((byte)118);
                        var2.al.ac(0, -798462839);
                     }

                     ok.ag(1710436281 * var2.ae, 1578912913 * var2.ag, -554068617);
                     mm.aq.remove(var2);
                  }
               }
            } catch (Exception var4) {
               gc.ac((String)null, var4, (byte)-71);
               this.al(var4.getMessage(), -65735155);
               mm.aq.clear();
               return true;
            }
         }

         return true;
      }
   }

   public boolean ac(int var1) {
      try {
         if (this.ac.isEmpty()) {
            if (var1 != -1411718299) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            Iterator var2 = this.ac.iterator();

            while(var2.hasNext()) {
               if (var1 != -1411718299) {
                  throw new IllegalStateException();
               }

               ns var3 = (ns)var2.next();

               try {
                  if (mm.aq.contains(var3)) {
                     if (var1 != -1411718299) {
                        throw new IllegalStateException();
                     }

                     if (var3 == null) {
                        if (var1 != -1411718299) {
                           throw new IllegalStateException();
                        }

                        mm.aq.remove(var3);
                     } else {
                        if (1813270399 * var3.al.bb > 0) {
                           if (var1 != -1411718299) {
                              throw new IllegalStateException();
                           }

                           ms var10000 = var3.al;
                           var10000.bb -= 1130066047;
                        }

                        if (var3.al.bb * 1813270399 == 0) {
                           if (var1 != -1411718299) {
                              throw new IllegalStateException();
                           }

                           var3.al.ah(-449016933);
                           var3.al.ar((byte)86);
                           var3.al.ac(0, -1232880613);
                        }

                        ok.ag(1710436281 * var3.ae, 1578912913 * var3.ag, -1390267908);
                        mm.aq.remove(var3);
                     }
                  }
               } catch (Exception var5) {
                  gc.ac((String)null, var5, (byte)-68);
                  this.al(var5.getMessage(), -65735155);
                  mm.aq.clear();
                  return true;
               }
            }

            return true;
         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "rl.ac(" + ')');
      }
   }

   public rl(ri var1, ArrayList var2) {
      try {
         super(var1);
         this.ax = "ClearRequestTask";
         this.ac = var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "rl.<init>(" + ')');
      }
   }
}
