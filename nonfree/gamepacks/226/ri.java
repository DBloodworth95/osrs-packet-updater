public class ri extends ra {
   int aw;
   no ap;

   public boolean ak() {
      if (this.ap != null && this.ap.au != null) {
         this.ap.am = true;

         try {
            if (this.ap.ai < (float)(this.ap.aj * 1286577357) && this.ap.au.af(1886797752)) {
               float var1 = 0 == this.aw * 218428418 ? (float)(this.aw * -168594113) : (float)(this.ap.aj * -1360576067) / (float)(this.aw * -168594113);
               no var10000 = this.ap;
               var10000.ai += 0.0F == var1 ? (float)(this.ap.aj * -2116837335) : var1;
               if (this.ap.ai > (float)(1286577357 * this.ap.aj)) {
                  this.ap.ai = (float)(-673492523 * this.ap.aj);
               }

               this.ap.au.ap((int)this.ap.ai, (short)-15319);
               return false;
            }
         } catch (Exception var2) {
            this.au(var2.getMessage(), 634133961);
            return true;
         }

         this.ap.am = false;
         return true;
      } else {
         return true;
      }
   }

   public ri(ra var1, int var2, boolean var3, int var4) {
      try {
         super(var1);
         this.ap = null;
         this.aw = 0;
         this.ai = "FadeInTask";
         if (var2 >= 0) {
            if (var3 && var2 < mp.ai.size()) {
               this.ap = (no)mp.ai.get(var2);
            } else if (!var3 && var2 < mp.ay.size()) {
               this.ap = (no)mp.ay.get(var2);
            }

            this.aw = 1042610879 * var4;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ri.<init>(" + ')');
      }
   }

   public boolean ap(int var1) {
      try {
         if (this.ap != null) {
            if (var1 != 343486624) {
               throw new IllegalStateException();
            }

            if (this.ap.au != null) {
               this.ap.am = true;

               try {
                  if (this.ap.ai < (float)(this.ap.aj * 1286577357)) {
                     if (var1 != 343486624) {
                        throw new IllegalStateException();
                     }

                     if (this.ap.au.af(771942543)) {
                        float var10000;
                        if (0 == this.aw * -168594113) {
                           if (var1 != 343486624) {
                              throw new IllegalStateException();
                           }

                           var10000 = (float)(this.aw * -168594113);
                        } else {
                           var10000 = (float)(this.ap.aj * 1286577357) / (float)(this.aw * -168594113);
                        }

                        float var2 = var10000;
                        no var5 = this.ap;
                        float var10001 = var5.ai;
                        float var10002;
                        if (0.0F == var2) {
                           if (var1 != 343486624) {
                              throw new IllegalStateException();
                           }

                           var10002 = (float)(this.ap.aj * 1286577357);
                        } else {
                           var10002 = var2;
                        }

                        var5.ai = var10001 + var10002;
                        if (this.ap.ai > (float)(1286577357 * this.ap.aj)) {
                           if (var1 != 343486624) {
                              throw new IllegalStateException();
                           }

                           this.ap.ai = (float)(1286577357 * this.ap.aj);
                        }

                        this.ap.au.ap((int)this.ap.ai, (short)-6070);
                        return false;
                     }
                  }
               } catch (Exception var3) {
                  this.au(var3.getMessage(), 634133961);
                  return true;
               }

               this.ap.am = false;
               return true;
            }

            if (var1 != 343486624) {
               throw new IllegalStateException();
            }
         }

         return true;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ri.ap(" + ')');
      }
   }

   public boolean aj() {
      if (this.ap != null && this.ap.au != null) {
         this.ap.am = true;

         try {
            if (this.ap.ai < (float)(this.ap.aj * 1286577357) && this.ap.au.af(2099284332)) {
               float var1 = 0 == this.aw * -168594113 ? (float)(this.aw * -168594113) : (float)(this.ap.aj * 1286577357) / (float)(this.aw * -168594113);
               no var10000 = this.ap;
               var10000.ai += 0.0F == var1 ? (float)(this.ap.aj * 1286577357) : var1;
               if (this.ap.ai > (float)(1286577357 * this.ap.aj)) {
                  this.ap.ai = (float)(1286577357 * this.ap.aj);
               }

               this.ap.au.ap((int)this.ap.ai, (short)8127);
               return false;
            }
         } catch (Exception var2) {
            this.au(var2.getMessage(), 634133961);
            return true;
         }

         this.ap.am = false;
         return true;
      } else {
         return true;
      }
   }
}
