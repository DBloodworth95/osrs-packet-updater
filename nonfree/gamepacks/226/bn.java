public class bn extends bg {
   pu ap = new pu();
   pu aw = new pu();
   int ak = 0;
   int aj = -1;

   public final synchronized void ap(bg var1) {
      this.ap.ak(var1);
   }

   protected int bv() {
      return 0;
   }

   public final synchronized void aw(bg var1) {
      var1.kf();
   }

   void ag() {
      if (this.ak > 0) {
         for(cn var1 = (cn)this.aw.as(); var1 != null; var1 = (cn)this.aw.am()) {
            var1.ap -= this.ak;
         }

         this.aj -= this.ak;
         this.ak = 0;
      }

   }

   void aj(tw var1, cn var2) {
      while(var1 != this.aw.ap && ((cn)var1).ap <= var2.ap) {
         var1 = var1.hf;
      }

      pu.aj(var2, var1);
      this.aj = ((cn)this.aw.ap.hf).ap;
   }

   protected bg ah() {
      return (bg)this.ap.am();
   }

   protected bg ay() {
      return (bg)this.ap.as();
   }

   void ad() {
      if (this.ak > 0) {
         for(cn var1 = (cn)this.aw.as(); var1 != null; var1 = (cn)this.aw.am()) {
            var1.ap -= this.ak;
         }

         this.aj -= this.ak;
         this.ak = 0;
      }

   }

   protected int ae() {
      return 0;
   }

   public final synchronized void am(int[] var1, int var2, int var3) {
      do {
         if (this.aj < 0) {
            this.at(var1, var2, var3);
            return;
         }

         if (this.ak + var3 < this.aj) {
            this.ak += var3;
            this.at(var1, var2, var3);
            return;
         }

         int var4 = this.aj - this.ak;
         this.at(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.ak += var4;
         this.ak();
         cn var5 = (cn)this.aw.as();
         synchronized(var5) {
            int var7 = var5.aw(this);
            if (var7 < 0) {
               var5.ap = 0;
               this.ai(var5);
            } else {
               var5.ap = var7;
               this.aj(var5.hf, var5);
            }
         }
      } while(var3 != 0);

   }

   void at(int[] var1, int var2, int var3) {
      for(bg var4 = (bg)this.ap.as(); var4 != null; var4 = (bg)this.ap.am()) {
         var4.ga(var1, var2, var3);
      }

   }

   public final synchronized void au(int var1) {
      do {
         if (this.aj < 0) {
            this.an(var1);
            return;
         }

         if (this.ak + var1 < this.aj) {
            this.ak += var1;
            this.an(var1);
            return;
         }

         int var2 = this.aj - this.ak;
         this.an(var2);
         var1 -= var2;
         this.ak += var2;
         this.ak();
         cn var3 = (cn)this.aw.as();
         synchronized(var3) {
            int var5 = var3.aw(this);
            if (var5 < 0) {
               var3.ap = 0;
               this.ai(var3);
            } else {
               var3.ap = var5;
               this.aj(var3.hf, var3);
            }
         }
      } while(var1 != 0);

   }

   public final synchronized void ao(bg var1) {
      this.ap.ak(var1);
   }

   public final synchronized void af(bg var1) {
      this.ap.ak(var1);
   }

   protected bg bj() {
      return (bg)this.ap.am();
   }

   void by(int var1) {
      for(bg var2 = (bg)this.ap.as(); var2 != null; var2 = (bg)this.ap.am()) {
         var2.au(var1);
      }

   }

   public final synchronized void az(bg var1) {
      var1.kf();
   }

   void ai(cn var1) {
      var1.kf();
      var1.ap();
      tw var2 = this.aw.ap.hf;
      if (var2 == this.aw.ap) {
         this.aj = -1;
      } else {
         this.aj = ((cn)var2).ap;
      }

   }

   void ak() {
      if (this.ak > 0) {
         for(cn var1 = (cn)this.aw.as(); var1 != null; var1 = (cn)this.aw.am()) {
            var1.ap -= this.ak;
         }

         this.aj -= this.ak;
         this.ak = 0;
      }

   }

   void ac() {
      if (this.ak > 0) {
         for(cn var1 = (cn)this.aw.as(); var1 != null; var1 = (cn)this.aw.am()) {
            var1.ap -= this.ak;
         }

         this.aj -= this.ak;
         this.ak = 0;
      }

   }

   void av(tw var1, cn var2) {
      while(var1 != this.aw.ap && ((cn)var1).ap <= var2.ap) {
         var1 = var1.hf;
      }

      pu.aj(var2, var1);
      this.aj = ((cn)this.aw.ap.hf).ap;
   }

   void ax(cn var1) {
      var1.kf();
      var1.ap();
      tw var2 = this.aw.ap.hf;
      if (var2 == this.aw.ap) {
         this.aj = -1;
      } else {
         this.aj = ((cn)var2).ap;
      }

   }

   void aq(cn var1) {
      var1.kf();
      var1.ap();
      tw var2 = this.aw.ap.hf;
      if (var2 == this.aw.ap) {
         this.aj = -1;
      } else {
         this.aj = ((cn)var2).ap;
      }

   }

   void al(cn var1) {
      var1.kf();
      var1.ap();
      tw var2 = this.aw.ap.hf;
      if (var2 == this.aw.ap) {
         this.aj = -1;
      } else {
         this.aj = ((cn)var2).ap;
      }

   }

   protected bg aa() {
      return (bg)this.ap.as();
   }

   protected bg as() {
      return (bg)this.ap.am();
   }

   protected bg bh() {
      return (bg)this.ap.am();
   }

   void br(int var1) {
      for(bg var2 = (bg)this.ap.as(); var2 != null; var2 = (bg)this.ap.am()) {
         var2.au(var1);
      }

   }

   public final synchronized void ar(bg var1) {
      this.ap.ak(var1);
   }

   void bn(int var1) {
      for(bg var2 = (bg)this.ap.as(); var2 != null; var2 = (bg)this.ap.am()) {
         var2.au(var1);
      }

   }

   public final synchronized void bk(int[] var1, int var2, int var3) {
      do {
         if (this.aj < 0) {
            this.at(var1, var2, var3);
            return;
         }

         if (this.ak + var3 < this.aj) {
            this.ak += var3;
            this.at(var1, var2, var3);
            return;
         }

         int var4 = this.aj - this.ak;
         this.at(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.ak += var4;
         this.ak();
         cn var5 = (cn)this.aw.as();
         synchronized(var5) {
            int var7 = var5.aw(this);
            if (var7 < 0) {
               var5.ap = 0;
               this.ai(var5);
            } else {
               var5.ap = var7;
               this.aj(var5.hf, var5);
            }
         }
      } while(var3 != 0);

   }

   void an(int var1) {
      for(bg var2 = (bg)this.ap.as(); var2 != null; var2 = (bg)this.ap.am()) {
         var2.au(var1);
      }

   }

   void bq(int[] var1, int var2, int var3) {
      for(bg var4 = (bg)this.ap.as(); var4 != null; var4 = (bg)this.ap.am()) {
         var4.ga(var1, var2, var3);
      }

   }

   void bp(int[] var1, int var2, int var3) {
      for(bg var4 = (bg)this.ap.as(); var4 != null; var4 = (bg)this.ap.am()) {
         var4.ga(var1, var2, var3);
      }

   }

   public final synchronized void bx(int[] var1, int var2, int var3) {
      do {
         if (this.aj < 0) {
            this.at(var1, var2, var3);
            return;
         }

         if (this.ak + var3 < this.aj) {
            this.ak += var3;
            this.at(var1, var2, var3);
            return;
         }

         int var4 = this.aj - this.ak;
         this.at(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.ak += var4;
         this.ak();
         cn var5 = (cn)this.aw.as();
         synchronized(var5) {
            int var7 = var5.aw(this);
            if (var7 < 0) {
               var5.ap = 0;
               this.ai(var5);
            } else {
               var5.ap = var7;
               this.aj(var5.hf, var5);
            }
         }
      } while(var3 != 0);

   }

   public final synchronized void bc(int var1) {
      do {
         if (this.aj < 0) {
            this.an(var1);
            return;
         }

         if (this.ak + var1 < this.aj) {
            this.ak += var1;
            this.an(var1);
            return;
         }

         int var2 = this.aj - this.ak;
         this.an(var2);
         var1 -= var2;
         this.ak += var2;
         this.ak();
         cn var3 = (cn)this.aw.as();
         synchronized(var3) {
            int var5 = var3.aw(this);
            if (var5 < 0) {
               var3.ap = 0;
               this.ai(var3);
            } else {
               var3.ap = var5;
               this.aj(var3.hf, var3);
            }
         }
      } while(var1 != 0);

   }

   void bb(int[] var1, int var2, int var3) {
      for(bg var4 = (bg)this.ap.as(); var4 != null; var4 = (bg)this.ap.am()) {
         var4.ga(var1, var2, var3);
      }

   }

   public final synchronized void bz(int var1) {
      do {
         if (this.aj < 0) {
            this.an(var1);
            return;
         }

         if (this.ak + var1 < this.aj) {
            this.ak += var1;
            this.an(var1);
            return;
         }

         int var2 = this.aj - this.ak;
         this.an(var2);
         var1 -= var2;
         this.ak += var2;
         this.ak();
         cn var3 = (cn)this.aw.as();
         synchronized(var3) {
            int var5 = var3.aw(this);
            if (var5 < 0) {
               var3.ap = 0;
               this.ai(var3);
            } else {
               var3.ap = var5;
               this.aj(var3.hf, var3);
            }
         }
      } while(var1 != 0);

   }

   public final synchronized void ab(bg var1) {
      var1.kf();
   }

   void bu(int var1) {
      for(bg var2 = (bg)this.ap.as(); var2 != null; var2 = (bg)this.ap.am()) {
         var2.au(var1);
      }

   }
}
