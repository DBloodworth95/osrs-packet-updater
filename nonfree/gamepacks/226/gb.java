public class gb extends gj {
   static gw sd;
   int ap;
   static final int aa = 32;
   // $FF: synthetic field
   final gg this$0;
   public static final String jr = "";

   void ak(vl var1) {
      this.ap = var1.ce(1588742945) * 1563565553;
      var1.cy((short)-24387);
      if (var1.cy((short)-9471) != 255) {
         var1.am -= -725588083;
         var1.ct((byte)-52);
      }

   }

   gb(gg var1) {
      try {
         this.this$0 = var1;
         super();
         this.ap = -1563565553;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "gb.<init>(" + ')');
      }
   }

   void ap(vl var1, int var2) {
      try {
         this.ap = var1.ce(789965260) * 1563565553;
         var1.cy((short)-720);
         if (var1.cy((short)-5499) != 255) {
            if (var2 >= 505512799) {
               throw new IllegalStateException();
            }

            var1.am -= -725588083;
            var1.ct((byte)-41);
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "gb.ap(" + ')');
      }
   }

   void aw(gw var1, int var2) {
      try {
         var1.ak(503657233 * this.ap, 1087310747);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "gb.aw(" + ')');
      }
   }

   void aj(vl var1) {
      this.ap = var1.ce(1223226417) * 1563565553;
      var1.cy((short)-11280);
      if (var1.cy((short)-31912) != 255) {
         var1.am -= -725588083;
         var1.ct((byte)-10);
      }

   }

   void ai(gw var1) {
      var1.ak(503657233 * this.ap, 1087310747);
   }

   public static gq ap(int var0, short var1) {
      try {
         gq var2 = (gq)gq.aw.ap((long)var0);
         if (null != var2) {
            if (var1 <= 2048) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = gq.ap.bm(5, var0, 1640294901);
            var2 = new gq();
            if (var3 != null) {
               if (var1 <= 2048) {
                  throw new IllegalStateException();
               }

               var2.aw(new vl(var3), (short)3855);
            }

            gq.aw.ak(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "gb.ap(" + ')');
      }
   }
}
