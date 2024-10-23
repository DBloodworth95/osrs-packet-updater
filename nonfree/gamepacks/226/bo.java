public class bo {
   int ai;
   int au;
   int[] ak = new int[2];
   int aj;
   int at;
   int ay;
   int[] aw = new int[2];
   int ae;
   int ap = 2;
   int as;
   int am;

   final void at(vl var1) {
      this.ap = var1.cy((short)-8578);
      this.aw = new int[this.ap];
      this.ak = new int[this.ap];

      for(int var2 = 0; var2 < this.ap; ++var2) {
         this.aw[var2] = var1.ce(385385371);
         this.ak[var2] = var1.ce(343790754);
      }

   }

   bo() {
      this.aw[0] = 0;
      this.aw[1] = 65535;
      this.ak[0] = 0;
      this.ak[1] = 65535;
   }

   final void aw(vl var1) {
      this.ap = var1.cy((short)-19022);
      this.aw = new int[this.ap];
      this.ak = new int[this.ap];

      for(int var2 = 0; var2 < this.ap; ++var2) {
         this.aw[var2] = var1.ce(676774903);
         this.ak[var2] = var1.ce(1974668750);
      }

   }

   final void ai(vl var1) {
      this.ay = var1.cy((short)-20614);
      this.aj = var1.ch(1203709469);
      this.ai = var1.ch(1203709469);
      this.aw(var1);
   }

   final void am(vl var1) {
      this.ap = var1.cy((short)-17424);
      this.aw = new int[this.ap];
      this.ak = new int[this.ap];

      for(int var2 = 0; var2 < this.ap; ++var2) {
         this.aw[var2] = var1.ce(485039389);
         this.ak[var2] = var1.ce(1822913542);
      }

   }

   final void ap(vl var1) {
      this.ay = var1.cy((short)-21964);
      this.aj = var1.ch(1203709469);
      this.ai = var1.ch(1203709469);
      this.aw(var1);
   }

   final void ay(vl var1) {
      this.ay = var1.cy((short)-12579);
      this.aj = var1.ch(1203709469);
      this.ai = var1.ch(1203709469);
      this.aw(var1);
   }

   final void as(vl var1) {
      this.ap = var1.cy((short)-22001);
      this.aw = new int[this.ap];
      this.ak = new int[this.ap];

      for(int var2 = 0; var2 < this.ap; ++var2) {
         this.aw[var2] = var1.ce(369613058);
         this.ak[var2] = var1.ce(2073058693);
      }

   }

   final void ae(vl var1) {
      this.ap = var1.cy((short)-6459);
      this.aw = new int[this.ap];
      this.ak = new int[this.ap];

      for(int var2 = 0; var2 < this.ap; ++var2) {
         this.aw[var2] = var1.ce(1671775526);
         this.ak[var2] = var1.ce(1204764218);
      }

   }

   final int aj(int var1) {
      if (this.au >= this.as) {
         this.at = this.ak[this.ae++] << 15;
         if (this.ae >= this.ap) {
            this.ae = this.ap - 1;
         }

         this.as = (int)((double)this.aw[this.ae] / 65536.0D * (double)var1);
         if (this.as > this.au) {
            this.am = ((this.ak[this.ae] << 15) - this.at) / (this.as - this.au);
         }
      }

      this.at += this.am;
      ++this.au;
      return this.at - this.am >> 15;
   }

   final int az(int var1) {
      if (this.au >= this.as) {
         this.at = this.ak[this.ae++] << 15;
         if (this.ae >= this.ap) {
            this.ae = this.ap - 1;
         }

         this.as = (int)((double)this.aw[this.ae] / 65536.0D * (double)var1);
         if (this.as > this.au) {
            this.am = ((this.ak[this.ae] << 15) - this.at) / (this.as - this.au);
         }
      }

      this.at += this.am;
      ++this.au;
      return this.at - this.am >> 15;
   }

   final void au(vl var1) {
      this.ap = var1.cy((short)-1571);
      this.aw = new int[this.ap];
      this.ak = new int[this.ap];

      for(int var2 = 0; var2 < this.ap; ++var2) {
         this.aw[var2] = var1.ce(323064730);
         this.ak[var2] = var1.ce(485653972);
      }

   }

   final void an() {
      this.as = 0;
      this.ae = 0;
      this.am = 0;
      this.at = 0;
      this.au = 0;
   }

   final void ao() {
      this.as = 0;
      this.ae = 0;
      this.am = 0;
      this.at = 0;
      this.au = 0;
   }

   final void ak() {
      this.as = 0;
      this.ae = 0;
      this.am = 0;
      this.at = 0;
      this.au = 0;
   }

   final void ar() {
      this.as = 0;
      this.ae = 0;
      this.am = 0;
      this.at = 0;
      this.au = 0;
   }

   final int ab(int var1) {
      if (this.au >= this.as) {
         this.at = this.ak[this.ae++] << 15;
         if (this.ae >= this.ap) {
            this.ae = this.ap - 1;
         }

         this.as = (int)((double)this.aw[this.ae] / 65536.0D * (double)var1);
         if (this.as > this.au) {
            this.am = ((this.ak[this.ae] << 15) - this.at) / (this.as - this.au);
         }
      }

      this.at += this.am;
      ++this.au;
      return this.at - this.am >> 15;
   }

   final void af() {
      this.as = 0;
      this.ae = 0;
      this.am = 0;
      this.at = 0;
      this.au = 0;
   }

   final int ag(int var1) {
      if (this.au >= this.as) {
         this.at = this.ak[this.ae++] << 15;
         if (this.ae >= this.ap) {
            this.ae = this.ap - 1;
         }

         this.as = (int)((double)this.aw[this.ae] / 65536.0D * (double)var1);
         if (this.as > this.au) {
            this.am = ((this.ak[this.ae] << 15) - this.at) / (this.as - this.au);
         }
      }

      this.at += this.am;
      ++this.au;
      return this.at - this.am >> 15;
   }

   final int ad(int var1) {
      if (this.au >= this.as) {
         this.at = this.ak[this.ae++] << 15;
         if (this.ae >= this.ap) {
            this.ae = this.ap - 1;
         }

         this.as = (int)((double)this.aw[this.ae] / 65536.0D * (double)var1);
         if (this.as > this.au) {
            this.am = ((this.ak[this.ae] << 15) - this.at) / (this.as - this.au);
         }
      }

      this.at += this.am;
      ++this.au;
      return this.at - this.am >> 15;
   }
}
