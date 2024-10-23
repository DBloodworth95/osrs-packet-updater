public final class ud {
   int ap;
   tw aj;
   tw ak;
   tw[] aw;
   int ai = 0;

   public void an(tw var1, long var2) {
      if (var1.hn != null) {
         var1.kf();
      }

      tw var4 = this.aw[(int)(var2 & (long)(this.ap - 1))];
      var1.hn = var4.hn;
      var1.hf = var4;
      var1.hn.hf = var1;
      var1.hf.hn = var1;
      var1.ht = var2;
   }

   public void au(tw var1, long var2) {
      if (var1.hn != null) {
         var1.kf();
      }

      tw var4 = this.aw[(int)(var2 & (long)(this.ap - 1))];
      var1.hn = var4.hn;
      var1.hf = var4;
      var1.hn.hf = var1;
      var1.hf.hn = var1;
      var1.ht = var2;
   }

   public int aw() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.ap; ++var2) {
         tw var3 = this.aw[var2];

         for(tw var4 = var3.hf; var4 != var3; var4 = var4.hf) {
            ++var1;
         }
      }

      return var1;
   }

   public ud(int var1) {
      this.ap = var1;
      this.aw = new tw[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         tw var3 = this.aw[var2] = new tw();
         var3.hf = var3;
         var3.hn = var3;
      }

   }

   public int ae() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.ap; ++var2) {
         tw var3 = this.aw[var2];

         for(tw var4 = var3.hf; var4 != var3; var4 = var4.hf) {
            ++var1;
         }
      }

      return var1;
   }

   public void ak(tw var1, long var2) {
      if (var1.hn != null) {
         var1.kf();
      }

      tw var4 = this.aw[(int)(var2 & (long)(this.ap - 1))];
      var1.hn = var4.hn;
      var1.hf = var4;
      var1.hn.hf = var1;
      var1.hf.hn = var1;
      var1.ht = var2;
   }

   public tw af() {
      this.ai = 0;
      return this.ai();
   }

   public tw as(long var1) {
      tw var3 = this.aw[(int)(var1 & (long)(this.ap - 1))];

      for(this.ak = var3.hf; this.ak != var3; this.ak = this.ak.hf) {
         if (this.ak.ht == var1) {
            tw var4 = this.ak;
            this.ak = this.ak.hf;
            return var4;
         }
      }

      this.ak = null;
      return null;
   }

   public tw ap(long var1) {
      tw var3 = this.aw[(int)(var1 & (long)(this.ap - 1))];

      for(this.ak = var3.hf; this.ak != var3; this.ak = this.ak.hf) {
         if (this.ak.ht == var1) {
            tw var4 = this.ak;
            this.ak = this.ak.hf;
            return var4;
         }
      }

      this.ak = null;
      return null;
   }

   public int am() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.ap; ++var2) {
         tw var3 = this.aw[var2];

         for(tw var4 = var3.hf; var4 != var3; var4 = var4.hf) {
            ++var1;
         }
      }

      return var1;
   }

   public int at() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.ap; ++var2) {
         tw var3 = this.aw[var2];

         for(tw var4 = var3.hf; var4 != var3; var4 = var4.hf) {
            ++var1;
         }
      }

      return var1;
   }

   public tw aj() {
      this.ai = 0;
      return this.ai();
   }

   public tw ay(long var1) {
      tw var3 = this.aw[(int)(var1 & (long)(this.ap - 1))];

      for(this.ak = var3.hf; this.ak != var3; this.ak = this.ak.hf) {
         if (this.ak.ht == var1) {
            tw var4 = this.ak;
            this.ak = this.ak.hf;
            return var4;
         }
      }

      this.ak = null;
      return null;
   }

   public void ao(tw var1, long var2) {
      if (var1.hn != null) {
         var1.kf();
      }

      tw var4 = this.aw[(int)(var2 & (long)(this.ap - 1))];
      var1.hn = var4.hn;
      var1.hf = var4;
      var1.hn.hf = var1;
      var1.hf.hn = var1;
      var1.ht = var2;
   }

   public tw ai() {
      tw var1;
      if (this.ai > 0 && this.aj != this.aw[this.ai - 1]) {
         var1 = this.aj;
         this.aj = var1.hf;
         return var1;
      } else {
         do {
            if (this.ai >= this.ap) {
               return null;
            }

            var1 = this.aw[this.ai++].hf;
         } while(var1 == this.aw[this.ai - 1]);

         this.aj = var1.hf;
         return var1;
      }
   }

   public tw ar() {
      tw var1;
      if (this.ai > 0 && this.aj != this.aw[this.ai - 1]) {
         var1 = this.aj;
         this.aj = var1.hf;
         return var1;
      } else {
         do {
            if (this.ai >= this.ap) {
               return null;
            }

            var1 = this.aw[this.ai++].hf;
         } while(var1 == this.aw[this.ai - 1]);

         this.aj = var1.hf;
         return var1;
      }
   }

   public tw ab() {
      tw var1;
      if (this.ai > 0 && this.aj != this.aw[this.ai - 1]) {
         var1 = this.aj;
         this.aj = var1.hf;
         return var1;
      } else {
         do {
            if (this.ai >= this.ap) {
               return null;
            }

            var1 = this.aw[this.ai++].hf;
         } while(var1 == this.aw[this.ai - 1]);

         this.aj = var1.hf;
         return var1;
      }
   }

   public tw az() {
      tw var1;
      if (this.ai > 0 && this.aj != this.aw[this.ai - 1]) {
         var1 = this.aj;
         this.aj = var1.hf;
         return var1;
      } else {
         do {
            if (this.ai >= this.ap) {
               return null;
            }

            var1 = this.aw[this.ai++].hf;
         } while(var1 == this.aw[this.ai - 1]);

         this.aj = var1.hf;
         return var1;
      }
   }
}
