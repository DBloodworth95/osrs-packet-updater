import java.util.Iterator;

public final class um implements Iterable {
   tw aj;
   tw[] aw;
   int ap;
   tw ak;
   int ai = 0;

   public void ar() {
      for(int var1 = 0; var1 < this.ap; ++var1) {
         tw var2 = this.aw[var1];

         while(true) {
            tw var3 = var2.hf;
            if (var3 == var2) {
               break;
            }

            var3.kf();
         }
      }

      this.ak = null;
      this.aj = null;
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

   public um(int var1) {
      this.ap = var1;
      this.aw = new tw[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         tw var3 = this.aw[var2] = new tw();
         var3.hf = var3;
         var3.hn = var3;
      }

   }

   public void ak() {
      for(int var1 = 0; var1 < this.ap; ++var1) {
         tw var2 = this.aw[var1];

         while(true) {
            tw var3 = var2.hf;
            if (var3 == var2) {
               break;
            }

            var3.kf();
         }
      }

      this.ak = null;
      this.aj = null;
   }

   public tw aj() {
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

   public Iterator iterator() {
      return new up(this);
   }

   public Iterator bq() {
      return new up(this);
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

   public tw ax() {
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

   public void aw(tw var1, long var2) {
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

   public tw ae(long var1) {
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

   public tw am(long var1) {
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

   public void at(tw var1, long var2) {
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

   public void az() {
      for(int var1 = 0; var1 < this.ap; ++var1) {
         tw var2 = this.aw[var1];

         while(true) {
            tw var3 = var2.hf;
            if (var3 == var2) {
               break;
            }

            var3.kf();
         }
      }

      this.ak = null;
      this.aj = null;
   }

   public tw ag() {
      this.ai = 0;
      return this.ai();
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

   public void af(tw var1, long var2) {
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

   public void ab() {
      for(int var1 = 0; var1 < this.ap; ++var1) {
         tw var2 = this.aw[var1];

         while(true) {
            tw var3 = var2.hf;
            if (var3 == var2) {
               break;
            }

            var3.kf();
         }
      }

      this.ak = null;
      this.aj = null;
   }

   public Iterator bz() {
      return new up(this);
   }

   public Iterator bp() {
      return new up(this);
   }

   public tw ad() {
      this.ai = 0;
      return this.ai();
   }

   public tw ac() {
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

   public tw av() {
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
}
