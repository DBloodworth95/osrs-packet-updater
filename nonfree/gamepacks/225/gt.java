public class gt extends fm {
   // $FF: synthetic field
   final fz this$0;
   int ae;
   static final int ei = 2;
   public static final int bd = 35;
   static sp sc;
   public static final int aw = 32;
   int ac;
   public static final int ah = 32768;

   void ae(go var1, byte var2) {
      try {
         var1.az(this.ac * 2028913985, -460746531 * this.ae, 1056520738);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "gt.ae(" + ')');
      }
   }

   gt(fz var1) {
      try {
         this.this$0 = var1;
         super();
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "gt.<init>(" + ')');
      }
   }

   public static hn ac(int var0, byte var1) {
      try {
         hn var2 = (hn)hn.am.ac((long)var0);
         if (null != var2) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = hn.ae.bt(9, var0, (byte)62);
            var2 = new hn();
            var2.aq = var0 * 1644404875;
            if (var3 != null) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               var2.ag(new vf(var3), (byte)39);
            }

            var2.ae(-212678786);
            hn.am.ag(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "gt.ac(" + ')');
      }
   }

   void ag(vf var1) {
      this.ac = var1.cz(-1734056172) * 509135553;
      this.ae = var1.cz(-1734056172) * 1623836533;
   }

   void am(vf var1) {
      this.ac = var1.cz(-1734056172) * 509135553;
      this.ae = var1.cz(-1734056172) * 1623836533;
   }

   void ax(vf var1) {
      this.ac = var1.cz(-1734056172) * 509135553;
      this.ae = var1.cz(-1734056172) * 1623836533;
   }

   void aq(go var1) {
      var1.az(this.ac * 2028913985, -460746531 * this.ae, -1810655927);
   }

   void af(go var1) {
      var1.az(this.ac * 2028913985, -460746531 * this.ae, -778269980);
   }

   void at(go var1) {
      var1.az(this.ac * 425196540, -460746531 * this.ae, -1137215871);
   }

   void ac(vf var1, byte var2) {
      try {
         this.ac = var1.cz(-1734056172) * 509135553;
         this.ae = var1.cz(-1734056172) * 1623836533;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "gt.ac(" + ')');
      }
   }

   void au(go var1) {
      var1.az(this.ac * 2028913985, -460746531 * this.ae, 1666333244);
   }
}
