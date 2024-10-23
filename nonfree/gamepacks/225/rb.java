import java.util.Iterator;

public class rb extends ri {
   public static final int by = 48;
   static final int bf = 286331153;

   public boolean ac(int var1) {
      try {
         Iterator var2 = mm.aq.iterator();

         while(var2.hasNext()) {
            if (var1 != -1411718299) {
               throw new IllegalStateException();
            }

            ns var3 = (ns)var2.next();
            if (var3 != null && !var3.at) {
               if (var1 != -1411718299) {
                  throw new IllegalStateException();
               }

               if (var3.al == null) {
                  if (var1 != -1411718299) {
                     throw new IllegalStateException();
                  }
               } else {
                  try {
                     var3.al.ax((byte)1);
                     var3.al.ac(0, -306711318);
                     if (var3.ah != null) {
                        if (var1 != -1411718299) {
                           throw new IllegalStateException();
                        }

                        var3.al.ad(var3.ah, var3.aq, 1533324333);
                     }

                     var3.ah = null;
                     var3.ad = null;
                     var3.ac = null;
                     var3.at = true;
                  } catch (Exception var5) {
                     gc.ac((String)null, var5, (byte)-123);
                     this.al(var5.getMessage(), -65735155);
                     return true;
                  }
               }
            }
         }

         this.af = true;
         return true;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "rb.ac(" + ')');
      }
   }

   public rb(ri var1) {
      try {
         super(var1);
         this.ax = "StartSongTask";
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "rb.<init>(" + ')');
      }
   }

   public boolean ag() {
      Iterator var1 = mm.aq.iterator();

      while(var1.hasNext()) {
         ns var2 = (ns)var1.next();
         if (var2 != null && !var2.at && var2.al != null) {
            try {
               var2.al.ax((byte)1);
               var2.al.ac(0, -1596980002);
               if (var2.ah != null) {
                  var2.al.ad(var2.ah, var2.aq, 127549105);
               }

               var2.ah = null;
               var2.ad = null;
               var2.ac = null;
               var2.at = true;
            } catch (Exception var4) {
               gc.ac((String)null, var4, (byte)-91);
               this.al(var4.getMessage(), -65735155);
               return true;
            }
         }
      }

      this.af = true;
      return true;
   }
}
