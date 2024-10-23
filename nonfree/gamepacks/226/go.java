public class go extends gj {
   static final int am = 3;
   // $FF: synthetic field
   final gg this$0;
   byte ak;
   String ap;
   byte aw;
   public static final int bu = 63;

   void ak(vl var1) {
      this.ap = var1.cm(-1623110437);
      if (this.ap != null) {
         var1.cy((short)-20127);
         this.aw = var1.cu((byte)13);
         this.ak = var1.cu((byte)13);
      }

   }

   void ap(vl var1, int var2) {
      try {
         this.ap = var1.cm(-1395411005);
         if (this.ap != null) {
            if (var2 >= 505512799) {
               throw new IllegalStateException();
            }

            var1.cy((short)-11026);
            this.aw = var1.cu((byte)13);
            this.ak = var1.cu((byte)13);
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "go.ap(" + ')');
      }
   }

   void aw(gw var1, int var2) {
      try {
         var1.ay = this.ap;
         if (null != this.ap) {
            if (var2 <= -1195547301) {
               return;
            }

            var1.as = this.aw;
            var1.ae = this.ak;
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "go.aw(" + ')');
      }
   }

   static Object co(ui var0, int var1) {
      try {
         if (var0 == null) {
            if (var1 != -79340727) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException("popValueOfType() failure - null baseVarType");
            }
         } else {
            switch(-934598989 * var0.aj) {
            case 1:
               return cm.at[(ih.au -= 746573637) * -114988147];
            case 2:
               return cm.ae[(am -= -1450976103) * -158156887];
            default:
               throw new IllegalStateException("popValueOfType() failure - unsupported type");
            }
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "go.co(" + ')');
      }
   }

   void aj(vl var1) {
      this.ap = var1.cm(-1466933739);
      if (this.ap != null) {
         var1.cy((short)-11241);
         this.aw = var1.cu((byte)13);
         this.ak = var1.cu((byte)13);
      }

   }

   go(gg var1) {
      try {
         this.this$0 = var1;
         super();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "go.<init>(" + ')');
      }
   }

   void ai(gw var1) {
      var1.ay = this.ap;
      if (null != this.ap) {
         var1.as = this.aw;
         var1.ae = this.ak;
      }

   }
}
