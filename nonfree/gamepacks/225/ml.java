public final class ml {
   tr ac = new tr();
   int ae;
   int ag;
   pq ax = new pq();
   ui am;

   public void ae(long var1) {
      tr var3 = (tr)this.am.ac(var1);
      if (var3 != null) {
         var3.jb();
         var3.jz();
         ++this.ag;
      }

   }

   public tr ac(long var1) {
      tr var3 = (tr)this.am.ac(var1);
      if (var3 != null) {
         this.ax.ae(var3);
      }

      return var3;
   }

   public void af(long var1) {
      tr var3 = (tr)this.am.ac(var1);
      if (var3 != null) {
         var3.jb();
         var3.jz();
         ++this.ag;
      }

   }

   public void ag(tr var1, long var2) {
      if (this.ag == 0) {
         tr var4 = this.ax.am();
         var4.jb();
         var4.jz();
         if (var4 == this.ac) {
            var4 = this.ax.am();
            var4.jb();
            var4.jz();
         }
      } else {
         --this.ag;
      }

      this.am.ae(var1, var2);
      this.ax.ae(var1);
   }

   public void am() {
      this.ax.ac();
      this.am.ag();
      this.ac = new tr();
      this.ag = this.ae;
   }

   public tr ax(long var1) {
      tr var3 = (tr)this.am.ac(var1);
      if (var3 != null) {
         this.ax.ae(var3);
      }

      return var3;
   }

   public tr aq(long var1) {
      tr var3 = (tr)this.am.ac(var1);
      if (var3 != null) {
         this.ax.ae(var3);
      }

      return var3;
   }

   public void al() {
      this.ax.ac();
      this.am.ag();
      this.ac = new tr();
      this.ag = this.ae;
   }

   public void at(long var1) {
      tr var3 = (tr)this.am.ac(var1);
      if (var3 != null) {
         var3.jb();
         var3.jz();
         ++this.ag;
      }

   }

   public ml(int var1) {
      this.ae = var1;
      this.ag = var1;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
      }

      this.am = new ui(var2);
   }

   public void ar(tr var1, long var2) {
      if (this.ag == 0) {
         tr var4 = this.ax.am();
         var4.jb();
         var4.jz();
         if (var4 == this.ac) {
            var4 = this.ax.am();
            var4.jb();
            var4.jz();
         }
      } else {
         --this.ag;
      }

      this.am.ae(var1, var2);
      this.ax.ae(var1);
   }

   public void au(tr var1, long var2) {
      if (this.ag == 0) {
         tr var4 = this.ax.am();
         var4.jb();
         var4.jz();
         if (var4 == this.ac) {
            var4 = this.ax.am();
            var4.jb();
            var4.jz();
         }
      } else {
         --this.ag;
      }

      this.am.ae(var1, var2);
      this.ax.ae(var1);
   }

   public void ad() {
      this.ax.ac();
      this.am.ag();
      this.ac = new tr();
      this.ag = this.ae;
   }
}
