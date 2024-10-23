public class to {
   public to hd;
   public long hk;
   public to hy;

   public void jb() {
      if (this.hd != null) {
         this.hd.hy = this.hy;
         this.hy.hd = this.hd;
         this.hy = null;
         this.hd = null;
      }
   }

   public boolean jj() {
      return this.hd != null;
   }

   public void jm() {
      if (this.hd != null) {
         this.hd.hy = this.hy;
         this.hy.hd = this.hd;
         this.hy = null;
         this.hd = null;
      }
   }

   public void jy() {
      if (this.hd != null) {
         this.hd.hy = this.hy;
         this.hy.hd = this.hd;
         this.hy = null;
         this.hd = null;
      }
   }

   public boolean jc() {
      return this.hd != null;
   }

   public boolean jl() {
      return this.hd != null;
   }
}
