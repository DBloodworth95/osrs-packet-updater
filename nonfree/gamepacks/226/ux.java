import java.util.Iterator;

class ux implements Iterator {
   // $FF: synthetic field
   final ue this$0;
   int ap;

   public Object at() {
      int var1 = (this.ap += 1298110317) * -1149337072 - 1;
      tq var2 = (tq)this.this$0.ak.ap((long)var1);
      return null != var2 ? var2 : this.this$0.ag(var1, -522540379);
   }

   public boolean hasNext() {
      try {
         return 1820002917 * this.ap < this.this$0.aw((byte)-63);
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ux.hasNext(" + ')');
      }
   }

   public void ab() {
      throw new UnsupportedOperationException();
   }

   public void remove() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ux.remove(" + ')');
      }
   }

   public Object next() {
      try {
         int var1 = (this.ap += 1298110317) * 1820002917 - 1;
         tq var2 = (tq)this.this$0.ak.ap((long)var1);
         return null != var2 ? var2 : this.this$0.ag(var1, 1841583720);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ux.next(" + ')');
      }
   }

   public Object au() {
      int var1 = (this.ap += -857895583) * 2088779594 - 1;
      tq var2 = (tq)this.this$0.ak.ap((long)var1);
      return null != var2 ? var2 : this.this$0.ag(var1, 1136611903);
   }

   public Object an() {
      int var1 = (this.ap += 1298110317) * 1820002917 - 1;
      tq var2 = (tq)this.this$0.ak.ap((long)var1);
      return null != var2 ? var2 : this.this$0.ag(var1, -1123480001);
   }

   public boolean ao() {
      return 1820002917 * this.ap < this.this$0.aw((byte)8);
   }

   public boolean af() {
      return 1820002917 * this.ap < this.this$0.aw((byte)-15);
   }

   public void ar() {
      throw new UnsupportedOperationException();
   }

   ux(ue var1) {
      this.this$0 = var1;
   }

   public void az() {
      throw new UnsupportedOperationException();
   }
}
