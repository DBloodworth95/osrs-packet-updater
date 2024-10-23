public class mq extends to {
   public mz ac;
   public int ae;
   public va ag;
   static int cs;
   public static mq[] ax = new mq[300];
   public static int aq = 0;
   public static final int af = 260;
   public static final int at = 10000;
   public int am;
   public static final int au = 20;

   public void ae(int var1) {
      try {
         if (aq * -2143578739 >= ax.length) {
            if (var1 == -973395814) {
               throw new IllegalStateException();
            }
         } else {
            ax[(aq += 486847813) * -2143578739 - 1] = this;
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "mq.ae(" + ')');
      }
   }

   public void ax() {
      if (aq * -2143578739 < ax.length) {
         ax[(aq += 486847813) * -2143578739 - 1] = this;
      }
   }

   public mq() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "mq.<init>(" + ')');
      }
   }

   public static mq ag(mz var0, vd var1) {
      mq var2;
      if (aq * -2143578739 == 0) {
         var2 = new mq();
      } else {
         var2 = ax[(aq -= 486847813) * -2143578739];
      }

      var2.ac = var0;
      var2.ae = var0.dn * 1777682993;
      if (-1 == 2020497499 * var2.ae) {
         var2.ag = new va(260);
      } else if (-2 == 2020497499 * var2.ae) {
         var2.ag = new va(10000);
      } else if (var2.ae * 2020497499 <= 18) {
         var2.ag = new va(20);
      } else if (2020497499 * var2.ae <= 98) {
         var2.ag = new va(100);
      } else {
         var2.ag = new va(260);
      }

      var2.ag.ae(var1, -252822959);
      var2.ag.ag(497668497 * var2.ac.ds, (byte)0);
      var2.am = 0;
      return var2;
   }

   public static mq am(mz var0, vd var1) {
      mq var2;
      if (aq * -2143578739 == 0) {
         var2 = new mq();
      } else {
         var2 = ax[(aq -= 486847813) * -2143578739];
      }

      var2.ac = var0;
      var2.ae = var0.dn * 1777682993;
      if (-1 == 2020497499 * var2.ae) {
         var2.ag = new va(260);
      } else if (-2 == 2020497499 * var2.ae) {
         var2.ag = new va(10000);
      } else if (var2.ae * 2020497499 <= 18) {
         var2.ag = new va(20);
      } else if (2020497499 * var2.ae <= 98) {
         var2.ag = new va(100);
      } else {
         var2.ag = new va(260);
      }

      var2.ag.ae(var1, -252822959);
      var2.ag.ag(497668497 * var2.ac.ds, (byte)-106);
      var2.am = 0;
      return var2;
   }

   public void aq() {
      if (aq * 2111239055 < ax.length) {
         ax[(aq += -753364209) * -1301549392 - 1] = this;
      }
   }
}
