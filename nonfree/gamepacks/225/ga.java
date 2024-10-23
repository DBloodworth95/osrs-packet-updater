public class ga extends gu {
   int ag;
   byte ae;
   // $FF: synthetic field
   final gj this$0;
   String am;
   int ac;
   public static final int bk = 1012;
   static final int bp = 43;
   static of fw;

   void ae(gm var1, int var2) {
      try {
         fy var3 = (fy)var1.ag.get(-1124362201 * this.ac);
         var3.ac = this.ae;
         var3.ae = this.ag * -1573610671;
         var3.ag = new wf(this.am);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ga.ae(" + ')');
      }
   }

   void ac(vf var1, byte var2) {
      try {
         this.ac = var1.ct(-1750813934) * -1938008169;
         this.ae = var1.cg((short)5320);
         this.ag = var1.ct(-1618715720) * -42707269;
         var1.cw(1131318323);
         this.am = var1.cs(-495924562);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ga.ac(" + ')');
      }
   }

   ga(gj var1) {
      try {
         this.this$0 = var1;
         super();
         this.ac = 1938008169;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ga.<init>(" + ')');
      }
   }

   void ag(gm var1) {
      fy var2 = (fy)var1.ag.get(-1124362201 * this.ac);
      var2.ac = this.ae;
      var2.ae = this.ag * -1573610671;
      var2.ag = new wf(this.am);
   }

   void am(gm var1) {
      fy var2 = (fy)var1.ag.get(-1124362201 * this.ac);
      var2.ac = this.ae;
      var2.ae = this.ag * -1573610671;
      var2.ag = new wf(this.am);
   }

   void ax(gm var1) {
      fy var2 = (fy)var1.ag.get(-1124362201 * this.ac);
      var2.ac = this.ae;
      var2.ae = this.ag * -1573610671;
      var2.ag = new wf(this.am);
   }

   void aq(gm var1) {
      fy var2 = (fy)var1.ag.get(-1124362201 * this.ac);
      var2.ac = this.ae;
      var2.ae = this.ag * -1573610671;
      var2.ag = new wf(this.am);
   }

   public static void ae(int var0, int var1, byte var2) {
      try {
         hl var4 = (hl)hl.ae.ac((long)var0);
         hl var3;
         if (null != var4) {
            if (var2 == 0) {
               return;
            }

            var3 = var4;
         } else {
            byte[] var5 = hl.ac.bt(14, var0, (byte)47);
            var4 = new hl();
            if (null != var5) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               var4.ae(new vf(var5), 531372435);
            }

            hl.ae.ag(var4, (long)var0);
            var3 = var4;
         }

         int var6;
         int var8;
         int var10;
         label47: {
            var10 = var3.ag * 143859779;
            var6 = var3.am * -1870632745;
            int var7 = -833963677 * var3.ax;
            var8 = no.ac[var7 - var6];
            if (var1 >= 0) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               if (var1 <= var8) {
                  break label47;
               }

               if (var2 == 0) {
                  throw new IllegalStateException();
               }
            }

            var1 = 0;
         }

         var8 <<= var6;
         no.am[var10] = no.am[var10] & ~var8 | var1 << var6 & var8;
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "ga.ae(" + ')');
      }
   }

   void at(vf var1) {
      this.ac = var1.ct(-1651210715) * -1938008169;
      this.ae = var1.cg((short)6711);
      this.ag = var1.ct(-1673570366) * -42707269;
      var1.cw(1380926237);
      this.am = var1.cs(137232961);
   }

   void af(gm var1) {
      fy var2 = (fy)var1.ag.get(-1124362201 * this.ac);
      var2.ac = this.ae;
      var2.ae = this.ag * -1573610671;
      var2.ag = new wf(this.am);
   }
}
