public class rj extends ri {
   public static final int al = 1536;
   int ae;
   ns ac;

   public boolean ag() {
      if (this.ac != null && this.ac.al != null) {
         this.ac.au = true;

         try {
            if (this.ac.ax < (float)(-1733889231 * this.ac.am) && this.ac.al.ap(1891926304)) {
               float var1 = 0 == -1879131809 * this.ae ? (float)(-1879131809 * this.ae) : (float)(this.ac.am * -1733889231) / (float)(this.ae * -1879131809);
               ns var10000 = this.ac;
               var10000.ax += var1 == 0.0F ? (float)(-1733889231 * this.ac.am) : var1;
               if (this.ac.ax > (float)(-1733889231 * this.ac.am)) {
                  this.ac.ax = (float)(-1733889231 * this.ac.am);
               }

               this.ac.al.ac((int)this.ac.ax, 509374649);
               return false;
            }
         } catch (Exception var2) {
            this.al(var2.getMessage(), -65735155);
            return true;
         }

         this.ac.au = false;
         return true;
      } else {
         return true;
      }
   }

   public boolean ac(int var1) {
      try {
         if (this.ac != null) {
            if (var1 != -1411718299) {
               throw new IllegalStateException();
            }

            if (this.ac.al != null) {
               this.ac.au = true;

               try {
                  if (this.ac.ax < (float)(-1733889231 * this.ac.am)) {
                     if (var1 != -1411718299) {
                        throw new IllegalStateException();
                     }

                     if (this.ac.al.ap(1891926304)) {
                        float var10000;
                        if (0 == -1879131809 * this.ae) {
                           if (var1 != -1411718299) {
                              throw new IllegalStateException();
                           }

                           var10000 = (float)(-1879131809 * this.ae);
                        } else {
                           var10000 = (float)(this.ac.am * -1733889231) / (float)(this.ae * -1879131809);
                        }

                        float var2 = var10000;
                        ns var5 = this.ac;
                        float var10001 = var5.ax;
                        float var10002;
                        if (var2 == 0.0F) {
                           if (var1 != -1411718299) {
                              throw new IllegalStateException();
                           }

                           var10002 = (float)(-1733889231 * this.ac.am);
                        } else {
                           var10002 = var2;
                        }

                        var5.ax = var10001 + var10002;
                        if (this.ac.ax > (float)(-1733889231 * this.ac.am)) {
                           this.ac.ax = (float)(-1733889231 * this.ac.am);
                        }

                        this.ac.al.ac((int)this.ac.ax, 314282543);
                        return false;
                     }
                  }
               } catch (Exception var3) {
                  this.al(var3.getMessage(), -65735155);
                  return true;
               }

               this.ac.au = false;
               return true;
            }

            if (var1 != -1411718299) {
               throw new IllegalStateException();
            }
         }

         return true;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "rj.ac(" + ')');
      }
   }

   public rj(ri var1, int var2, boolean var3, int var4) {
      try {
         super(var1);
         this.ac = null;
         this.ae = 0;
         this.ax = "FadeInTask";
         if (var2 >= 0) {
            if (var3 && var2 < mm.ax.size()) {
               this.ac = (ns)mm.ax.get(var2);
            } else if (!var3 && var2 < mm.aq.size()) {
               this.ac = (ns)mm.aq.get(var2);
            }

            this.ae = -1342446945 * var4;
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "rj.<init>(" + ')');
      }
   }
}
