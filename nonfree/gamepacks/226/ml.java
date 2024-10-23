public final class ml {
   int ap;
   int aw;
   um ak;
   pf aj;
   mg ai;

   void an(mf var1) {
      if (var1 != null) {
         var1.kf();
         var1.kg();
         this.aw += var1.aw;
      }

   }

   public ml(int var1) {
      this(var1, var1);
   }

   public Object ap(long var1) {
      mf var3 = (mf)this.ak.ap(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.ap();
         if (var4 == null) {
            var3.kf();
            var3.kg();
            this.aw += var3.aw;
            return null;
         } else {
            if (var3.aw()) {
               mu var5 = new mu(var4, var3.aw);
               this.ak.aw(var5, var3.ht);
               this.aj.aw(var5);
               var5.ey = 0L;
               var3.kf();
               var3.kg();
            } else {
               this.aj.aw(var3);
               var3.ey = 0L;
            }

            return var4;
         }
      }
   }

   void aw(long var1) {
      mf var3 = (mf)this.ak.ap(var1);
      this.ak(var3);
   }

   void ak(mf var1) {
      if (var1 != null) {
         var1.kf();
         var1.kg();
         this.aw += var1.aw;
      }

   }

   public void aj(Object var1, long var2) {
      this.ai(var1, var2, 1);
   }

   public void ai(Object var1, long var2, int var4) {
      if (var4 > this.ap) {
         throw new IllegalStateException();
      } else {
         this.aw(var2);
         this.aw -= var4;

         while(this.aw < 0) {
            mf var5 = (mf)this.aj.aj();
            if (var5 == null) {
               throw new RuntimeException("");
            }

            if (!var5.aw()) {
            }

            this.ak(var5);
            if (this.ai != null) {
               this.ai.ap(var5.ap());
            }
         }

         mu var6 = new mu(var1, var4);
         this.ak.aw(var6, var2);
         this.aj.aw(var6);
         var6.ey = 0L;
      }
   }

   public void ay(int var1) {
      for(mf var2 = (mf)this.aj.ai(); var2 != null; var2 = (mf)this.aj.as()) {
         if (var2.aw()) {
            if (var2.ap() == null) {
               var2.kf();
               var2.kg();
               this.aw += var2.aw;
            }
         } else if (++var2.ey > (long)var1) {
            mo var3 = new mo(var2.ap(), var2.aw);
            this.ak.aw(var3, var2.ht);
            pf.ak(var3, var2);
            var2.kf();
            var2.kg();
         }
      }

   }

   public void as() {
      this.aj.ap();
      this.ak.ak();
      this.aw = this.ap;
   }

   void af(mf var1) {
      if (var1 != null) {
         var1.kf();
         var1.kg();
         this.aw += var1.aw;
      }

   }

   public Object am(long var1) {
      mf var3 = (mf)this.ak.ap(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.ap();
         if (var4 == null) {
            var3.kf();
            var3.kg();
            this.aw += var3.aw;
            return null;
         } else {
            if (var3.aw()) {
               mu var5 = new mu(var4, var3.aw);
               this.ak.aw(var5, var3.ht);
               this.aj.aw(var5);
               var5.ey = 0L;
               var3.kf();
               var3.kg();
            } else {
               this.aj.aw(var3);
               var3.ey = 0L;
            }

            return var4;
         }
      }
   }

   void at(long var1) {
      mf var3 = (mf)this.ak.ap(var1);
      this.ak(var3);
   }

   void au(mf var1) {
      if (var1 != null) {
         var1.kf();
         var1.kg();
         this.aw += var1.aw;
      }

   }

   public Object ae(long var1) {
      mf var3 = (mf)this.ak.ap(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.ap();
         if (var4 == null) {
            var3.kf();
            var3.kg();
            this.aw += var3.aw;
            return null;
         } else {
            if (var3.aw()) {
               mu var5 = new mu(var4, var3.aw);
               this.ak.aw(var5, var3.ht);
               this.aj.aw(var5);
               var5.ey = 0L;
               var3.kf();
               var3.kg();
            } else {
               this.aj.aw(var3);
               var3.ey = 0L;
            }

            return var4;
         }
      }
   }

   void ao(mf var1) {
      if (var1 != null) {
         var1.kf();
         var1.kg();
         this.aw += var1.aw;
      }

   }

   void ar(mf var1) {
      if (var1 != null) {
         var1.kf();
         var1.kg();
         this.aw += var1.aw;
      }

   }

   public ml(int var1, int var2) {
      this.aj = new pf();
      this.ap = var1;
      this.aw = var1;

      int var3;
      for(var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
      }

      this.ak = new um(var3);
   }

   public void ab(Object var1, long var2, int var4) {
      if (var4 > this.ap) {
         throw new IllegalStateException();
      } else {
         this.aw(var2);
         this.aw -= var4;

         while(this.aw < 0) {
            mf var5 = (mf)this.aj.aj();
            if (var5 == null) {
               throw new RuntimeException("");
            }

            if (!var5.aw()) {
            }

            this.ak(var5);
            if (this.ai != null) {
               this.ai.ap(var5.ap());
            }
         }

         mu var6 = new mu(var1, var4);
         this.ak.aw(var6, var2);
         this.aj.aw(var6);
         var6.ey = 0L;
      }
   }

   public void az(Object var1, long var2, int var4) {
      if (var4 > this.ap) {
         throw new IllegalStateException();
      } else {
         this.aw(var2);
         this.aw -= var4;

         while(this.aw < 0) {
            mf var5 = (mf)this.aj.aj();
            if (var5 == null) {
               throw new RuntimeException("");
            }

            if (!var5.aw()) {
            }

            this.ak(var5);
            if (this.ai != null) {
               this.ai.ap(var5.ap());
            }
         }

         mu var6 = new mu(var1, var4);
         this.ak.aw(var6, var2);
         this.aj.aw(var6);
         var6.ey = 0L;
      }
   }

   public void ag(int var1) {
      for(mf var2 = (mf)this.aj.ai(); var2 != null; var2 = (mf)this.aj.as()) {
         if (var2.aw()) {
            if (var2.ap() == null) {
               var2.kf();
               var2.kg();
               this.aw += var2.aw;
            }
         } else if (++var2.ey > (long)var1) {
            mo var3 = new mo(var2.ap(), var2.aw);
            this.ak.aw(var3, var2.ht);
            pf.ak(var3, var2);
            var2.kf();
            var2.kg();
         }
      }

   }

   public void ad() {
      this.aj.ap();
      this.ak.ak();
      this.aw = this.ap;
   }

   public void ac() {
      this.aj.ap();
      this.ak.ak();
      this.aw = this.ap;
   }
}
