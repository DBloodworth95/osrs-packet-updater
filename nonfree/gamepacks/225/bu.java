public class bu {
   int ac = 2;
   int af;
   int[] ag = new int[2];
   int am;
   int ax;
   int[] ae = new int[2];
   int ar;
   int at;
   int au;
   int al;
   int aq;

   final void aq(vf var1) {
      this.aq = var1.cv(952452697);
      this.am = var1.cz(-1734056172);
      this.ax = var1.cz(-1734056172);
      this.ae(var1);
   }

   final void ac(vf var1) {
      this.aq = var1.cv(952452697);
      this.am = var1.cz(-1734056172);
      this.ax = var1.cz(-1734056172);
      this.ae(var1);
   }

   final void af(vf var1) {
      this.aq = var1.cv(952452697);
      this.am = var1.cz(-1734056172);
      this.ax = var1.cz(-1734056172);
      this.ae(var1);
   }

   final void ag() {
      this.af = 0;
      this.at = 0;
      this.au = 0;
      this.ar = 0;
      this.al = 0;
   }

   final void ar(vf var1) {
      this.ac = var1.cv(952452697);
      this.ae = new int[this.ac];
      this.ag = new int[this.ac];

      for(int var2 = 0; var2 < this.ac; ++var2) {
         this.ae[var2] = var1.ct(-1502765890);
         this.ag[var2] = var1.ct(-1505068434);
      }

   }

   final void ax(vf var1) {
      this.aq = var1.cv(952452697);
      this.am = var1.cz(-1734056172);
      this.ax = var1.cz(-1734056172);
      this.ae(var1);
   }

   final int aa(int var1) {
      if (this.al >= this.af) {
         this.ar = this.ag[this.at++] << 15;
         if (this.at >= this.ac) {
            this.at = this.ac - 1;
         }

         this.af = (int)((double)this.ae[this.at] / 65536.0D * (double)var1);
         if (this.af > this.al) {
            this.au = ((this.ag[this.at] << 15) - this.ar) / (this.af - this.al);
         }
      }

      this.ar += this.au;
      ++this.al;
      return this.ar - this.au >> 15;
   }

   final void at(vf var1) {
      this.ac = var1.cv(952452697);
      this.ae = new int[this.ac];
      this.ag = new int[this.ac];

      for(int var2 = 0; var2 < this.ac; ++var2) {
         this.ae[var2] = var1.ct(-2078243062);
         this.ag[var2] = var1.ct(-2015928950);
      }

   }

   final int am(int var1) {
      if (this.al >= this.af) {
         this.ar = this.ag[this.at++] << 15;
         if (this.at >= this.ac) {
            this.at = this.ac - 1;
         }

         this.af = (int)((double)this.ae[this.at] / 65536.0D * (double)var1);
         if (this.af > this.al) {
            this.au = ((this.ag[this.at] << 15) - this.ar) / (this.af - this.al);
         }
      }

      this.ar += this.au;
      ++this.al;
      return this.ar - this.au >> 15;
   }

   final void au(vf var1) {
      this.ac = var1.cv(952452697);
      this.ae = new int[this.ac];
      this.ag = new int[this.ac];

      for(int var2 = 0; var2 < this.ac; ++var2) {
         this.ae[var2] = var1.ct(-1681779153);
         this.ag[var2] = var1.ct(-1546064458);
      }

   }

   final void al() {
      this.af = 0;
      this.at = 0;
      this.au = 0;
      this.ar = 0;
      this.al = 0;
   }

   bu() {
      this.ae[0] = 0;
      this.ae[1] = 65535;
      this.ag[0] = 0;
      this.ag[1] = 65535;
   }

   final void ad() {
      this.af = 0;
      this.at = 0;
      this.au = 0;
      this.ar = 0;
      this.al = 0;
   }

   final void ah() {
      this.af = 0;
      this.at = 0;
      this.au = 0;
      this.ar = 0;
      this.al = 0;
   }

   final void ap() {
      this.af = 0;
      this.at = 0;
      this.au = 0;
      this.ar = 0;
      this.al = 0;
   }

   final int ab(int var1) {
      if (this.al >= this.af) {
         this.ar = this.ag[this.at++] << 15;
         if (this.at >= this.ac) {
            this.at = this.ac - 1;
         }

         this.af = (int)((double)this.ae[this.at] / 65536.0D * (double)var1);
         if (this.af > this.al) {
            this.au = ((this.ag[this.at] << 15) - this.ar) / (this.af - this.al);
         }
      }

      this.ar += this.au;
      ++this.al;
      return this.ar - this.au >> 15;
   }

   final int az(int var1) {
      if (this.al >= this.af) {
         this.ar = this.ag[this.at++] << 15;
         if (this.at >= this.ac) {
            this.at = this.ac - 1;
         }

         this.af = (int)((double)this.ae[this.at] / 65536.0D * (double)var1);
         if (this.af > this.al) {
            this.au = ((this.ag[this.at] << 15) - this.ar) / (this.af - this.al);
         }
      }

      this.ar += this.au;
      ++this.al;
      return this.ar - this.au >> 15;
   }

   final void ae(vf var1) {
      this.ac = var1.cv(952452697);
      this.ae = new int[this.ac];
      this.ag = new int[this.ac];

      for(int var2 = 0; var2 < this.ac; ++var2) {
         this.ae[var2] = var1.ct(-1831752835);
         this.ag[var2] = var1.ct(-1639730140);
      }

   }
}
