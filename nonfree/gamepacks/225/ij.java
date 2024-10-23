public class ij extends iq {
   static String gy;
   public static ua[] ab;
   int ac;
   // $FF: synthetic field
   final iy this$0;
   static int cg;

   public int ag() {
      return 0;
   }

   public int ax() {
      return 204902821 * this.ac;
   }

   public int ae(int var1) {
      try {
         return 204902821 * this.ac;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ij.ae(" + ')');
      }
   }

   public int ac(byte var1) {
      try {
         return 0;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ij.ac(" + ')');
      }
   }

   public int am() {
      return 0;
   }

   static final void ol(int var0, int var1, int var2) {
      try {
         if (client.sl[var0] == null) {
            if (var2 <= 2048487173) {
               throw new IllegalStateException();
            }
         } else {
            if (var1 >= 0) {
               if (var2 <= 2048487173) {
                  throw new IllegalStateException();
               }

               if (var1 < client.sl[var0].am(2140733799)) {
                  fy var3 = (fy)client.sl[var0].ag.get(var1);
                  if (var3.ac != -1) {
                     if (var2 <= 2048487173) {
                        throw new IllegalStateException();
                     }

                     return;
                  }

                  mq var4 = fs.ac(mz.dr, client.ia.ax, (byte)-25);
                  var4.ag.bu(3 + uo.be(var3.ag.ac((byte)100), 90222943), (byte)20);
                  var4.ag.bu(var0, (byte)-76);
                  var4.ag.br(var1, 1625888552);
                  var4.ag.bc(var3.ag.ac((byte)100), -1215138333);
                  client.ia.ag(var4, 986710748);
                  return;
               }

               if (var2 <= 2048487173) {
                  return;
               }
            }

         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ij.ol(" + ')');
      }
   }

   public static void ac(do var0, int var1) {
      try {
         dj.ae(var0, 500000, 475000, 1977275131);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ij.ac(" + ')');
      }
   }

   ij(iy var1, String var2, int var3) {
      try {
         this.this$0 = var1;
         super(var1, var2);
         this.ac = 1630400045 * var3;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ij.<init>(" + ')');
      }
   }
}
