import java.util.Comparator;

class rg implements Comparator {
   static final int az = 11;
   static final int ap = 2;
   // $FF: synthetic field
   final rs this$0;

   rg(rs var1) {
      this.this$0 = var1;
   }

   int ap(rw var1, rw var2, int var3) {
      try {
         if (-7023941384732440211L * var1.ak > var2.ak * -7023941384732440211L) {
            if (var3 == -1533565796) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else {
            return -7023941384732440211L * var1.ak < -7023941384732440211L * var2.ak ? -1 : 0;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "rg.ap(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ap((rw)var1, (rw)var2, -1866086103);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "rg.compare(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "rg.equals(" + ')');
      }
   }

   public int ae(Object var1, Object var2) {
      return this.ap((rw)var1, (rw)var2, -2139676254);
   }

   public int as(Object var1, Object var2) {
      return this.ap((rw)var1, (rw)var2, -341974394);
   }

   public int am(Object var1, Object var2) {
      return this.ap((rw)var1, (rw)var2, 1188778979);
   }

   public int ay(Object var1, Object var2) {
      return this.ap((rw)var1, (rw)var2, 1250339470);
   }

   public int at(Object var1, Object var2) {
      return this.ap((rw)var1, (rw)var2, 1481181092);
   }

   int aj(rw var1, rw var2) {
      if (-7023941384732440211L * var1.ak > var2.ak * -7023941384732440211L) {
         return 1;
      } else {
         return -7023941384732440211L * var1.ak < -7023941384732440211L * var2.ak ? -1 : 0;
      }
   }

   int aw(rw var1, rw var2) {
      if (-7023941384732440211L * var1.ak > var2.ak * -7023941384732440211L) {
         return 1;
      } else {
         return -7023941384732440211L * var1.ak < -7023941384732440211L * var2.ak ? -1 : 0;
      }
   }

   int ak(rw var1, rw var2) {
      if (-7023941384732440211L * var1.ak > var2.ak * -7023941384732440211L) {
         return 1;
      } else {
         return -7023941384732440211L * var1.ak < -7023941384732440211L * var2.ak ? -1 : 0;
      }
   }

   public boolean gj(Object var1) {
      return super.equals(var1);
   }
}
