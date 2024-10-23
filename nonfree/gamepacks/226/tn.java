public class tn {
   public tn aj;
   public tn ai;

   public void ap() {
      if (this.ai != null) {
         this.ai.aj = this.aj;
         this.aj.ai = this.ai;
         this.aj = null;
         this.ai = null;
      }
   }
}
