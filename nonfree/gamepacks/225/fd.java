public class fd extends fm {
   int am;
   int ac;
   int ag;
   int ae;
   // $FF: synthetic field
   final fz this$0;
   static final int bp = 12;
   static int le;

   static final void nh(int var0, int var1, int var2) {
      try {
         if (!ir.ep.ag(var0, (byte)32)) {
            if (var2 <= 1594080377) {
               throw new IllegalStateException();
            }
         } else {
            mx.nl(ir.ep.aq[var0], var1, (byte)-114);
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "fd.nh(" + ')');
      }
   }

   void ac(vf var1, byte var2) {
      try {
         this.ac = var1.ct(-1606372595) * -954200711;
         this.ae = var1.cz(-1734056172) * 481760019;
         this.ag = var1.cv(952452697) * 2002194621;
         this.am = var1.cv(952452697) * -1095152717;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "fd.ac(" + ')');
      }
   }

   void ae(go var1, byte var2) {
      try {
         var1.ab(this.ac * -996029239, 1620946715 * this.ae, this.ag * -842437995, -1129292933 * this.am, (byte)-33);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "fd.ae(" + ')');
      }
   }

   void ag(vf var1) {
      this.ac = var1.ct(-1601365623) * 992262740;
      this.ae = var1.cz(-1734056172) * 481760019;
      this.ag = var1.cv(952452697) * 2002194621;
      this.am = var1.cv(952452697) * -317605393;
   }

   void am(vf var1) {
      this.ac = var1.ct(-2088908176) * -954200711;
      this.ae = var1.cz(-1734056172) * 481760019;
      this.ag = var1.cv(952452697) * 2002194621;
      this.am = var1.cv(952452697) * -1095152717;
   }

   void ax(vf var1) {
      this.ac = var1.ct(-1770370952) * -954200711;
      this.ae = var1.cz(-1734056172) * 1355367234;
      this.ag = var1.cv(952452697) * 2002194621;
      this.am = var1.cv(952452697) * -1095152717;
   }

   void au(go var1) {
      var1.ab(this.ac * -1073687533, 1620946715 * this.ae, this.ag * 2024262075, 34139476 * this.am, (byte)-92);
   }

   static boolean jl(int var0) {
      try {
         boolean var10000;
         if ((client.np * 1716697315 & 1) != 0) {
            if (var0 >= -1504197949) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "fd.jl(" + ')');
      }
   }

   void at(go var1) {
      var1.ab(this.ac * -996029239, 1620946715 * this.ae, this.ag * -842437995, -1129292933 * this.am, (byte)-99);
   }

   void af(go var1) {
      var1.ab(this.ac * -996029239, 1620946715 * this.ae, this.ag * -842437995, -1129292933 * this.am, (byte)-14);
   }

   static tu hc(byte var0) {
      try {
         return ey.wv;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "fd.hc(" + ')');
      }
   }

   void aq(go var1) {
      var1.ab(this.ac * -996029239, 1620946715 * this.ae, this.ag * -842437995, -1129292933 * this.am, (byte)-4);
   }

   fd(fz var1) {
      try {
         this.this$0 = var1;
         super();
         this.ac = 954200711;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "fd.<init>(" + ')');
      }
   }
}
