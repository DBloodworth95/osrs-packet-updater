public class ko {
   public static final int ab = 1024;
   public static final ko ae = new ko(0, 1, 2);
   public static final ko ag = new ko(2, 2, 0);
   final int am;
   final int aq;
   public static final ko ac = new ko(1, 0, 4);
   static final int ha = 14;
   final int ax;

   ko(int var1, int var2, int var3) {
      try {
         super();
         this.am = var1 * 2065901327;
         this.ax = var2 * -427190661;
         this.aq = -1982430123 * var3;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ko.<init>(" + ')');
      }
   }

   boolean ae(float var1, int var2) {
      try {
         boolean var10000;
         if (var1 >= (float)(360339709 * this.aq)) {
            if (var2 == 1104027228) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ko.ae(" + ')');
      }
   }

   boolean aq(float var1) {
      return var1 >= (float)(-1726419450 * this.aq);
   }

   static ko[] ag() {
      return new ko[]{ac, ag, ae};
   }

   static ko[] am() {
      return new ko[]{ac, ag, ae};
   }

   static ko[] ax() {
      return new ko[]{ac, ag, ae};
   }

   static ko[] ac(int var0) {
      try {
         return new ko[]{ac, ag, ae};
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ko.ac(" + ')');
      }
   }

   boolean af(float var1) {
      return var1 >= (float)(360339709 * this.aq);
   }

   static final void ok(int var0, int var1, byte var2) {
      try {
         gm var10000;
         if (var0 >= 0) {
            if (var2 != 1) {
               return;
            }

            var10000 = client.sl[var0];
         } else {
            var10000 = gu.sm;
         }

         gm var3 = var10000;
         if (var3 != null) {
            if (var2 != 1) {
               return;
            }

            if (var1 >= 0) {
               if (var2 != 1) {
                  throw new IllegalStateException();
               }

               if (var1 < var3.am(-71034791)) {
                  fy var4 = (fy)var3.ag.get(var1);
                  if (var4.ac != -1) {
                     if (var2 != 1) {
                        return;
                     }

                     return;
                  }

                  String var5 = var4.ag.ac((byte)100);
                  mq var6 = fs.ac(mz.dk, client.ia.ax, (byte)-124);
                  var6.ag.bu(3 + uo.be(var5, 2588604), (byte)50);
                  var6.ag.bu(var0, (byte)19);
                  var6.ag.br(var1, 1625888552);
                  var6.ag.bc(var5, -728552095);
                  client.ia.ag(var6, 2138180566);
                  return;
               }

               if (var2 != 1) {
                  throw new IllegalStateException();
               }
            }
         }

      } catch (RuntimeException var7) {
         throw vk.ae(var7, "ko.ok(" + ')');
      }
   }
}
