public class rc extends ri {
   int ae;
   ns ac;

   public boolean ag() {
      if (this.ac != null && this.ac.al != null) {
         this.ac.au = true;

         try {
            if (this.ac.ax > 0.0F && this.ac.al.ap(1891926304)) {
               float var1 = 0 == this.ae * 1545354245 ? (float)(1545354245 * this.ae) : (float)(this.ac.am * -1733889231) / (float)(1545354245 * this.ae);
               ns var10000 = this.ac;
               var10000.ax -= 0.0F == var1 ? (float)(this.ac.am * -1733889231) : var1;
               if (this.ac.ax < 0.0F) {
                  this.ac.ax = 0.0F;
               }

               this.ac.al.ac((int)this.ac.ax, -1364314794);
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
                  if (this.ac.ax > 0.0F) {
                     if (var1 != -1411718299) {
                        throw new IllegalStateException();
                     }

                     if (this.ac.al.ap(1891926304)) {
                        if (var1 != -1411718299) {
                           throw new IllegalStateException();
                        }

                        float var10000;
                        if (0 == this.ae * 1545354245) {
                           if (var1 != -1411718299) {
                              throw new IllegalStateException();
                           }

                           var10000 = (float)(1545354245 * this.ae);
                        } else {
                           var10000 = (float)(this.ac.am * -1733889231) / (float)(1545354245 * this.ae);
                        }

                        float var2 = var10000;
                        ns var5 = this.ac;
                        float var10001 = var5.ax;
                        float var10002;
                        if (0.0F == var2) {
                           if (var1 != -1411718299) {
                              throw new IllegalStateException();
                           }

                           var10002 = (float)(this.ac.am * -1733889231);
                        } else {
                           var10002 = var2;
                        }

                        var5.ax = var10001 - var10002;
                        if (this.ac.ax < 0.0F) {
                           if (var1 != -1411718299) {
                              throw new IllegalStateException();
                           }

                           this.ac.ax = 0.0F;
                        }

                        this.ac.al.ac((int)this.ac.ax, -1279930584);
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
         throw vk.ae(var4, "rc.ac(" + ')');
      }
   }

   public rc(ri var1, int var2, boolean var3, int var4) {
      try {
         super(var1);
         this.ac = null;
         this.ae = 0;
         this.ax = "FadeOutTask";
         if (var2 >= 0) {
            if (var3 && var2 < mm.ax.size()) {
               this.ac = (ns)mm.ax.get(var2);
            } else if (!var3 && var2 < mm.aq.size()) {
               this.ac = (ns)mm.aq.get(var2);
            }

            this.ae = 1980182733 * var4;
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "rc.<init>(" + ')');
      }
   }
}
