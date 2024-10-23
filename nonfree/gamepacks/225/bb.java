public class bb extends bk {
   int am = -1;
   pk ae = new pk();
   pk ac = new pk();
   int ag = 0;

   void am(to var1, cu var2) {
      while(var1 != this.ae.ac && ((cu)var1).ac <= var2.ac) {
         var1 = var1.hy;
      }

      pk.am(var2, var1);
      this.am = ((cu)this.ae.ac.hy).ac;
   }

   public final synchronized void ac(bk var1) {
      this.ac.ag(var1);
   }

   public final synchronized void ae(bk var1) {
      var1.jb();
   }

   void ag() {
      if (this.ag > 0) {
         for(cu var1 = (cu)this.ae.af(); var1 != null; var1 = (cu)this.ae.au()) {
            var1.ac -= this.ag;
         }

         this.am -= this.ag;
         this.ag = 0;
      }

   }

   void bi(int[] var1, int var2, int var3) {
      for(bk var4 = (bk)this.ac.af(); var4 != null; var4 = (bk)this.ac.au()) {
         var4.ga(var1, var2, var3);
      }

   }

   protected bk aq() {
      return (bk)this.ac.af();
   }

   protected bk af() {
      return (bk)this.ac.au();
   }

   protected int at() {
      return 0;
   }

   public final synchronized void au(int[] var1, int var2, int var3) {
      do {
         if (this.am < 0) {
            this.ar(var1, var2, var3);
            return;
         }

         if (this.ag + var3 < this.am) {
            this.ag += var3;
            this.ar(var1, var2, var3);
            return;
         }

         int var4 = this.am - this.ag;
         this.ar(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.ag += var4;
         this.ag();
         cu var5 = (cu)this.ae.af();
         synchronized(var5) {
            int var7 = var5.ae(this);
            if (var7 < 0) {
               var5.ac = 0;
               this.ax(var5);
            } else {
               var5.ac = var7;
               this.am(var5.hy, var5);
            }
         }
      } while(var3 != 0);

   }

   void ar(int[] var1, int var2, int var3) {
      for(bk var4 = (bk)this.ac.af(); var4 != null; var4 = (bk)this.ac.au()) {
         var4.ga(var1, var2, var3);
      }

   }

   public final synchronized void bz(int var1) {
      do {
         if (this.am < 0) {
            this.ad(var1);
            return;
         }

         if (this.ag + var1 < this.am) {
            this.ag += var1;
            this.ad(var1);
            return;
         }

         int var2 = this.am - this.ag;
         this.ad(var2);
         var1 -= var2;
         this.ag += var2;
         this.ag();
         cu var3 = (cu)this.ae.af();
         synchronized(var3) {
            int var5 = var3.ae(this);
            if (var5 < 0) {
               var3.ac = 0;
               this.ax(var3);
            } else {
               var3.ac = var5;
               this.am(var3.hy, var3);
            }
         }
      } while(var1 != 0);

   }

   void ad(int var1) {
      for(bk var2 = (bk)this.ac.af(); var2 != null; var2 = (bk)this.ac.au()) {
         var2.al(var1);
      }

   }

   public final synchronized void al(int var1) {
      do {
         if (this.am < 0) {
            this.ad(var1);
            return;
         }

         if (this.ag + var1 < this.am) {
            this.ag += var1;
            this.ad(var1);
            return;
         }

         int var2 = this.am - this.ag;
         this.ad(var2);
         var1 -= var2;
         this.ag += var2;
         this.ag();
         cu var3 = (cu)this.ae.af();
         synchronized(var3) {
            int var5 = var3.ae(this);
            if (var5 < 0) {
               var3.ac = 0;
               this.ax(var3);
            } else {
               var3.ac = var5;
               this.am(var3.hy, var3);
            }
         }
      } while(var1 != 0);

   }

   public final synchronized void ab(bk var1) {
      var1.jb();
   }

   void ax(cu var1) {
      var1.jb();
      var1.ac();
      to var2 = this.ae.ac.hy;
      if (var2 == this.ae.ac) {
         this.am = -1;
      } else {
         this.am = ((cu)var2).ac;
      }

   }

   public final synchronized void az(bk var1) {
      var1.jb();
   }

   void aa() {
      if (this.ag > 0) {
         for(cu var1 = (cu)this.ae.af(); var1 != null; var1 = (cu)this.ae.au()) {
            var1.ac -= this.ag;
         }

         this.am -= this.ag;
         this.ag = 0;
      }

   }

   void ai(to var1, cu var2) {
      while(var1 != this.ae.ac && ((cu)var1).ac <= var2.ac) {
         var1 = var1.hy;
      }

      pk.am(var2, var1);
      this.am = ((cu)this.ae.ac.hy).ac;
   }

   void ao(to var1, cu var2) {
      while(var1 != this.ae.ac && ((cu)var1).ac <= var2.ac) {
         var1 = var1.hy;
      }

      pk.am(var2, var1);
      this.am = ((cu)this.ae.ac.hy).ac;
   }

   void as(to var1, cu var2) {
      while(var1 != this.ae.ac && ((cu)var1).ac <= var2.ac) {
         var1 = var1.hy;
      }

      pk.am(var2, var1);
      this.am = ((cu)this.ae.ac.hy).ac;
   }

   void ay(to var1, cu var2) {
      while(var1 != this.ae.ac && ((cu)var1).ac <= var2.ac) {
         var1 = var1.hy;
      }

      pk.am(var2, var1);
      this.am = ((cu)this.ae.ac.hy).ac;
   }

   protected int bm() {
      return 0;
   }

   void av(cu var1) {
      var1.jb();
      var1.ac();
      to var2 = this.ae.ac.hy;
      if (var2 == this.ae.ac) {
         this.am = -1;
      } else {
         this.am = ((cu)var2).ac;
      }

   }

   protected bk an() {
      return (bk)this.ac.af();
   }

   void bv(int var1) {
      for(bk var2 = (bk)this.ac.af(); var2 != null; var2 = (bk)this.ac.au()) {
         var2.al(var1);
      }

   }

   protected bk ak() {
      return (bk)this.ac.af();
   }

   protected bk bn() {
      return (bk)this.ac.af();
   }

   protected bk bh() {
      return (bk)this.ac.af();
   }

   protected bk bd() {
      return (bk)this.ac.af();
   }

   public final synchronized void ap(bk var1) {
      var1.jb();
   }

   public final synchronized void bs(int[] var1, int var2, int var3) {
      do {
         if (this.am < 0) {
            this.ar(var1, var2, var3);
            return;
         }

         if (this.ag + var3 < this.am) {
            this.ag += var3;
            this.ar(var1, var2, var3);
            return;
         }

         int var4 = this.am - this.ag;
         this.ar(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.ag += var4;
         this.ag();
         cu var5 = (cu)this.ae.af();
         synchronized(var5) {
            int var7 = var5.ae(this);
            if (var7 < 0) {
               var5.ac = 0;
               this.ax(var5);
            } else {
               var5.ac = var7;
               this.am(var5.hy, var5);
            }
         }
      } while(var3 != 0);

   }

   void bb(int[] var1, int var2, int var3) {
      for(bk var4 = (bk)this.ac.af(); var4 != null; var4 = (bk)this.ac.au()) {
         var4.ga(var1, var2, var3);
      }

   }

   void aw(cu var1) {
      var1.jb();
      var1.ac();
      to var2 = this.ae.ac.hy;
      if (var2 == this.ae.ac) {
         this.am = -1;
      } else {
         this.am = ((cu)var2).ac;
      }

   }

   public final synchronized void bw(int[] var1, int var2, int var3) {
      do {
         if (this.am < 0) {
            this.ar(var1, var2, var3);
            return;
         }

         if (this.ag + var3 < this.am) {
            this.ag += var3;
            this.ar(var1, var2, var3);
            return;
         }

         int var4 = this.am - this.ag;
         this.ar(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.ag += var4;
         this.ag();
         cu var5 = (cu)this.ae.af();
         synchronized(var5) {
            int var7 = var5.ae(this);
            if (var7 < 0) {
               var5.ac = 0;
               this.ax(var5);
            } else {
               var5.ac = var7;
               this.am(var5.hy, var5);
            }
         }
      } while(var3 != 0);

   }

   public final synchronized void ba(int[] var1, int var2, int var3) {
      do {
         if (this.am < 0) {
            this.ar(var1, var2, var3);
            return;
         }

         if (this.ag + var3 < this.am) {
            this.ag += var3;
            this.ar(var1, var2, var3);
            return;
         }

         int var4 = this.am - this.ag;
         this.ar(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.ag += var4;
         this.ag();
         cu var5 = (cu)this.ae.af();
         synchronized(var5) {
            int var7 = var5.ae(this);
            if (var7 < 0) {
               var5.ac = 0;
               this.ax(var5);
            } else {
               var5.ac = var7;
               this.am(var5.hy, var5);
            }
         }
      } while(var3 != 0);

   }

   public final synchronized void bj(int[] var1, int var2, int var3) {
      do {
         if (this.am < 0) {
            this.ar(var1, var2, var3);
            return;
         }

         if (this.ag + var3 < this.am) {
            this.ag += var3;
            this.ar(var1, var2, var3);
            return;
         }

         int var4 = this.am - this.ag;
         this.ar(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.ag += var4;
         this.ag();
         cu var5 = (cu)this.ae.af();
         synchronized(var5) {
            int var7 = var5.ae(this);
            if (var7 < 0) {
               var5.ac = 0;
               this.ax(var5);
            } else {
               var5.ac = var7;
               this.am(var5.hy, var5);
            }
         }
      } while(var3 != 0);

   }

   public final synchronized void bp(int[] var1, int var2, int var3) {
      do {
         if (this.am < 0) {
            this.ar(var1, var2, var3);
            return;
         }

         if (this.ag + var3 < this.am) {
            this.ag += var3;
            this.ar(var1, var2, var3);
            return;
         }

         int var4 = this.am - this.ag;
         this.ar(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.ag += var4;
         this.ag();
         cu var5 = (cu)this.ae.af();
         synchronized(var5) {
            int var7 = var5.ae(this);
            if (var7 < 0) {
               var5.ac = 0;
               this.ax(var5);
            } else {
               var5.ac = var7;
               this.am(var5.hy, var5);
            }
         }
      } while(var3 != 0);

   }

   void by(int[] var1, int var2, int var3) {
      for(bk var4 = (bk)this.ac.af(); var4 != null; var4 = (bk)this.ac.au()) {
         var4.ga(var1, var2, var3);
      }

   }

   public final synchronized void bu(int var1) {
      do {
         if (this.am < 0) {
            this.ad(var1);
            return;
         }

         if (this.ag + var1 < this.am) {
            this.ag += var1;
            this.ad(var1);
            return;
         }

         int var2 = this.am - this.ag;
         this.ad(var2);
         var1 -= var2;
         this.ag += var2;
         this.ag();
         cu var3 = (cu)this.ae.af();
         synchronized(var3) {
            int var5 = var3.ae(this);
            if (var5 < 0) {
               var3.ac = 0;
               this.ax(var3);
            } else {
               var3.ac = var5;
               this.am(var3.hy, var3);
            }
         }
      } while(var1 != 0);

   }

   protected bk bf() {
      return (bk)this.ac.au();
   }

   void aj(cu var1) {
      var1.jb();
      var1.ac();
      to var2 = this.ae.ac.hy;
      if (var2 == this.ae.ac) {
         this.am = -1;
      } else {
         this.am = ((cu)var2).ac;
      }

   }

   public final synchronized void bl(int var1) {
      do {
         if (this.am < 0) {
            this.ad(var1);
            return;
         }

         if (this.ag + var1 < this.am) {
            this.ag += var1;
            this.ad(var1);
            return;
         }

         int var2 = this.am - this.ag;
         this.ad(var2);
         var1 -= var2;
         this.ag += var2;
         this.ag();
         cu var3 = (cu)this.ae.af();
         synchronized(var3) {
            int var5 = var3.ae(this);
            if (var5 < 0) {
               var3.ac = 0;
               this.ax(var3);
            } else {
               var3.ac = var5;
               this.am(var3.hy, var3);
            }
         }
      } while(var1 != 0);

   }

   protected bk bx() {
      return (bk)this.ac.af();
   }

   void bg(int[] var1, int var2, int var3) {
      for(bk var4 = (bk)this.ac.af(); var4 != null; var4 = (bk)this.ac.au()) {
         var4.ga(var1, var2, var3);
      }

   }

   public final synchronized void ah(bk var1) {
      this.ac.ag(var1);
   }

   void bo(int var1) {
      for(bk var2 = (bk)this.ac.af(); var2 != null; var2 = (bk)this.ac.au()) {
         var2.al(var1);
      }

   }

   void br(int var1) {
      for(bk var2 = (bk)this.ac.af(); var2 != null; var2 = (bk)this.ac.au()) {
         var2.al(var1);
      }

   }
}
