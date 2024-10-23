import java.util.zip.Inflater;

public class wq {
   Inflater ap;

   public void aw(vl var1, byte[] var2) {
      if (31 == var1.ae[var1.am * -1689308347] && -117 == var1.ae[1 + var1.am * -1689308347]) {
         if (this.ap == null) {
            this.ap = new Inflater(true);
         }

         try {
            this.ap.setInput(var1.ae, 10 + var1.am * -1689308347, var1.ae.length - (var1.am * -1689308347 + 10 + 8));
            this.ap.inflate(var2);
         } catch (Exception var4) {
            this.ap.reset();
            throw new RuntimeException("");
         }

         this.ap.reset();
      } else {
         throw new RuntimeException("");
      }
   }

   wq(int var1, int var2, int var3) {
      try {
         super();
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "wq.<init>(" + ')');
      }
   }

   public void ap(vl var1, byte[] var2, byte var3) {
      try {
         if (31 == var1.ae[var1.am * -1689308347]) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            }

            if (-117 == var1.ae[1 + var1.am * -1689308347]) {
               if (this.ap == null) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  this.ap = new Inflater(true);
               }

               try {
                  this.ap.setInput(var1.ae, 10 + var1.am * -1689308347, var1.ae.length - (var1.am * -1689308347 + 10 + 8));
                  this.ap.inflate(var2);
               } catch (Exception var5) {
                  this.ap.reset();
                  throw new RuntimeException("");
               }

               this.ap.reset();
               return;
            }

            if (var3 <= 1) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "wq.ap(" + ')');
      }
   }

   public void aj(vl var1, byte[] var2) {
      if (-116423505 == var1.ae[var1.am * -1689308347] && -1039382814 == var1.ae[1 + var1.am * -1689308347]) {
         if (this.ap == null) {
            this.ap = new Inflater(true);
         }

         try {
            this.ap.setInput(var1.ae, 10 + var1.am * -427100221, var1.ae.length - (var1.am * -1689308347 + 10 + 8));
            this.ap.inflate(var2);
         } catch (Exception var4) {
            this.ap.reset();
            throw new RuntimeException("");
         }

         this.ap.reset();
      } else {
         throw new RuntimeException("");
      }
   }

   public void ak(vl var1, byte[] var2) {
      if (31 == var1.ae[var1.am * -1689308347] && -1798170298 == var1.ae[1 + var1.am * -1689308347]) {
         if (this.ap == null) {
            this.ap = new Inflater(true);
         }

         try {
            this.ap.setInput(var1.ae, 10 + var1.am * -1731297510, var1.ae.length - (var1.am * -1689308347 + 10 + 8));
            this.ap.inflate(var2);
         } catch (Exception var4) {
            this.ap.reset();
            throw new RuntimeException("");
         }

         this.ap.reset();
      } else {
         throw new RuntimeException("");
      }
   }

   public wq() {
      try {
         this(-1, 1000000, 1000000);
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "wq.<init>(" + ')');
      }
   }
}
