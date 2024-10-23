public class gd extends fm {
   byte ax;
   byte ae;
   byte ag;
   static final int aj = 24;
   static final int aq = 5;
   boolean ac;
   // $FF: synthetic field
   final fz this$0;
   static final int af = 24;
   public static final int at = 8;
   byte am;

   void aq(go var1) {
      var1.at = this.ac;
      var1.au = this.ae;
      var1.ar = this.ag;
      var1.al = this.am;
      var1.ad = this.ax;
   }

   void ac(vf var1, byte var2) {
      try {
         this.ac = var1.cv(952452697) == 1;
         this.ae = var1.cg((short)-27491);
         this.ag = var1.cg((short)-23420);
         this.am = var1.cg((short)20763);
         this.ax = var1.cg((short)-17514);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "gd.ac(" + ')');
      }
   }

   void ae(go var1, byte var2) {
      try {
         var1.at = this.ac;
         var1.au = this.ae;
         var1.ar = this.ag;
         var1.al = this.am;
         var1.ad = this.ax;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "gd.ae(" + ')');
      }
   }

   void ag(vf var1) {
      this.ac = var1.cv(952452697) == 1;
      this.ae = var1.cg((short)-17134);
      this.ag = var1.cg((short)5170);
      this.am = var1.cg((short)-27901);
      this.ax = var1.cg((short)-13890);
   }

   gd(fz var1) {
      try {
         this.this$0 = var1;
         super();
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "gd.<init>(" + ')');
      }
   }

   void ax(vf var1) {
      this.ac = var1.cv(952452697) == 1;
      this.ae = var1.cg((short)18655);
      this.ag = var1.cg((short)18592);
      this.am = var1.cg((short)1162);
      this.ax = var1.cg((short)11336);
   }

   void au(go var1) {
      var1.at = this.ac;
      var1.au = this.ae;
      var1.ar = this.ag;
      var1.al = this.am;
      var1.ad = this.ax;
   }

   void af(go var1) {
      var1.at = this.ac;
      var1.au = this.ae;
      var1.ar = this.ag;
      var1.al = this.am;
      var1.ad = this.ax;
   }

   void am(vf var1) {
      this.ac = var1.cv(952452697) == 1;
      this.ae = var1.cg((short)-15346);
      this.ag = var1.cg((short)-7052);
      this.am = var1.cg((short)-30373);
      this.ax = var1.cg((short)15503);
   }

   void at(go var1) {
      var1.at = this.ac;
      var1.au = this.ae;
      var1.ar = this.ag;
      var1.al = this.am;
      var1.ad = this.ax;
   }

   public static qd ac(int var0) {
      try {
         synchronized(qd.ac) {
            if (-1298270997 * qd.ag == 0) {
               if (var0 == -1432218579) {
                  throw new IllegalStateException();
               } else {
                  return new qd();
               }
            } else {
               qd.ac[(qd.ag -= -1656548413) * -1298270997].aq(783933342);
               return qd.ac[qd.ag * -1298270997];
            }
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "gd.ac(" + ')');
      }
   }
}
