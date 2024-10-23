public class sq extends sy {
   int aj;
   final kt aw;
   final kt ak;
   int ai;
   static int oc;
   static final int ap;

   boolean aw(kt var1, int var2, int var3, byte var4) {
      try {
         if (this.aj * 902707401 >= -350558985 * this.ai) {
            var1.as(this.ak, 2108851747);
            return true;
         } else {
            float var5 = so.aj(var2, this.aj * 902707401, this.ai * -350558985, 1541571974);
            qc.ar(this.aw, this.ak, var5, var1, 396921514);
            boolean var10000;
            if (var5 >= 1.0F) {
               if (var4 == 0) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "sq.aw(" + ')');
      }
   }

   void ap(kt var1, sb var2, int var3, int var4) {
      try {
         this.aw.as(var1, 1160214261);
         this.ak.as(var2.ap, 1155111196);
         this.aj = 577462649 * (var3 - 1);
         this.ai = var2.aw * 1122379833 + ap * -1488037983;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "sq.ap(" + ')');
      }
   }

   sq() {
      try {
         super();
         this.aw = new kt();
         this.ak = new kt();
         this.aj = 0;
         this.ai = 0;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "sq.<init>(" + ')');
      }
   }

   void ak(int var1, int var2, int var3) {
      try {
         this.aw.an(var1, var2, 454729497);
         this.ak.an(var1, var2, 1335522857);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "sq.ak(" + ')');
      }
   }

   void au(int var1, int var2) {
      this.aw.an(var1, var2, 1012403346);
      this.ak.an(var1, var2, 1281683595);
   }

   void ai(kt var1, sb var2, int var3) {
      this.aw.as(var1, 1531483285);
      this.ak.as(var2.ap, 409739522);
      this.aj = -350052766 * (var3 - 1);
      this.ai = var2.aw * -1038705519 + ap * 2067052574;
   }

   static {
      ap = -1637617099 + -1086819183 * client.rs;
   }

   void as(kt var1, sb var2, int var3) {
      this.aw.as(var1, 1406097261);
      this.ak.as(var2.ap, 385956542);
      this.aj = 577462649 * (var3 - 1);
      this.ai = var2.aw * -1407568210 + ap * -1785037004;
   }

   boolean ae(kt var1, int var2, int var3) {
      if (this.aj * 800768338 >= -1557599180 * this.ai) {
         var1.as(this.ak, 1642315109);
         return true;
      } else {
         float var4 = so.aj(var2, this.aj * 902707401, this.ai * -2053941529, 1541571974);
         qc.ar(this.aw, this.ak, var4, var1, 213569621);
         return var4 >= 1.0F;
      }
   }

   boolean am(kt var1, int var2, int var3) {
      if (this.aj * -1292869360 >= -350558985 * this.ai) {
         var1.as(this.ak, 1900228468);
         return true;
      } else {
         float var4 = so.aj(var2, this.aj * -1294978339, this.ai * 116779795, 1541571974);
         qc.ar(this.aw, this.ak, var4, var1, -270795360);
         return var4 >= 1.0F;
      }
   }

   boolean at(kt var1, int var2, int var3) {
      if (this.aj * 902707401 >= -350558985 * this.ai) {
         var1.as(this.ak, 1452859025);
         return true;
      } else {
         float var4 = so.aj(var2, this.aj * 902707401, this.ai * -350558985, 1541571974);
         qc.ar(this.aw, this.ak, var4, var1, 109416428);
         return var4 >= 1.0F;
      }
   }

   void ay(kt var1, sb var2, int var3) {
      this.aw.as(var1, 726339660);
      this.ak.as(var2.ap, 1955332713);
      this.aj = 577462649 * (var3 - 1);
      this.ai = var2.aw * 1122379833 + ap * -1488037983;
   }

   void an(int var1, int var2) {
      this.aw.an(var1, var2, 1558121295);
      this.ak.an(var1, var2, 955694463);
   }

   static void ab(kt var0, kt var1, float var2, kt var3) {
      var2 = cx.am(0.0F, 1.0F, var2, -458428281);
      int var4 = var1.ap(227427987) - var0.ap(227427987);
      int var5 = var1.ak(-488158644) - var0.ak(-488158644);
      var4 = (int)((float)var4 * var2);
      var5 = (int)(var2 * (float)var5);
      var3.ae(var0.ap(227427987) + var4, var0.ak(-488158644) + var5, 1268495425);
      int var6 = kr.ai(var0.ay(1968948418), var1.ay(2092727757), (short)-9687);
      var6 = (int)((float)var6 * var2);
      var3.at(var0.ay(2131859754) + var6, (byte)103);
   }
}
