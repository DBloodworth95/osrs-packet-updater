public class gp extends gj {
   // $FF: synthetic field
   final gg this$0;
   byte aw;
   int ap;
   String aj;
   static String gl;
   static final int ar = 16384;
   static or fj;
   public static final int ay = 15;
   int ak;

   void aw(gw var1, int var2) {
      try {
         fs var3 = (fs)var1.ak.get(1461970157 * this.ap);
         var3.ap = this.aw;
         var3.aw = -935073917 * this.ak;
         var3.ak = new wx(this.aj);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "gp.aw(" + ')');
      }
   }

   void ai(gw var1) {
      fs var2 = (fs)var1.ak.get(1461970157 * this.ap);
      var2.ap = this.aw;
      var2.aw = -935073917 * this.ak;
      var2.ak = new wx(this.aj);
   }

   void ap(vl var1, int var2) {
      try {
         this.ap = var1.ce(1076770074) * 1030101221;
         this.aw = var1.cu((byte)13);
         this.ak = var1.ce(349449637) * 2031678971;
         var1.ct((byte)-78);
         this.aj = var1.cw(2015710075);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "gp.ap(" + ')');
      }
   }

   void ak(vl var1) {
      this.ap = var1.ce(1356232627) * 1030101221;
      this.aw = var1.cu((byte)13);
      this.ak = var1.ce(851331506) * 819798569;
      var1.ct((byte)-113);
      this.aj = var1.cw(1960182982);
   }

   void aj(vl var1) {
      this.ap = var1.ce(1333330936) * 1030101221;
      this.aw = var1.cu((byte)13);
      this.ak = var1.ce(620474564) * 2031678971;
      var1.ct((byte)-48);
      this.aj = var1.cw(2018353681);
   }

   gp(gg var1) {
      try {
         this.this$0 = var1;
         super();
         this.ap = -1030101221;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "gp.<init>(" + ')');
      }
   }

   static final int hg(int var0, byte var1) {
      try {
         if (Math.abs(var0 - pg.kc * 1625945013) > 1024) {
            byte var10002;
            if (var0 < 1625945013 * pg.kc) {
               if (var1 <= 10) {
                  throw new IllegalStateException();
               }

               var10002 = 1;
            } else {
               var10002 = -1;
            }

            return var0 + 2048 * var10002;
         } else {
            return var0;
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "gp.hg(" + ')');
      }
   }
}
