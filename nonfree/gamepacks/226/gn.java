public class gn extends fq {
   static final int af = 11;
   static int[] jd;
   static final char ay = 'À';
   static iv qd;
   // $FF: synthetic field
   final fz this$0;
   String ap;

   void aw(gy var1, int var2) {
      try {
         var1.ay = this.ap;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "gn.aw(" + ')');
      }
   }

   void ai(gy var1) {
      var1.ay = this.ap;
   }

   void ap(vl var1, int var2) {
      try {
         this.ap = var1.cw(2040395538);
         var1.ch(1203709469);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "gn.ap(" + ')');
      }
   }

   gn(fz var1) {
      try {
         this.this$0 = var1;
         super();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "gn.<init>(" + ')');
      }
   }

   void aj(vl var1) {
      this.ap = var1.cw(2019350250);
      var1.ch(1203709469);
   }

   void ak(vl var1) {
      this.ap = var1.cw(2070785951);
      var1.ch(1203709469);
   }

   void ay(gy var1) {
      var1.ay = this.ap;
   }

   static void au(int var0) {
      try {
         if ((1202199295 * client.cb & vo.ah.aw(1837624059)) != 0) {
            if (var0 != -1450976103) {
               throw new IllegalStateException();
            }

            dq.cb = "";
            dq.cd = og.ig;
            dq.ci = og.ib;
            dq.cn = og.ij;
            as.aa(1, (byte)1);
            dp.as(-46922287);
         } else if ((client.cb * 1202199295 & vo.ak.aw(1837624059)) != 0) {
            if (var0 != -1450976103) {
               throw new IllegalStateException();
            }

            if ((1202199295 * client.cb & vo.au.aw(1837624059)) != 0) {
               if (var0 != -1450976103) {
                  throw new IllegalStateException();
               }

               dq.cd = og.it;
               dq.ci = og.iz;
               dq.cn = og.ik;
            } else {
               dq.cd = og.id;
               dq.ci = og.iq;
               dq.cn = og.iv;
            }

            dq.cb = og.io;
            as.aa(1, (byte)1);
            dp.as(1854897937);
         } else if ((client.cb * 1202199295 & vo.au.aw(1837624059)) != 0) {
            dq.cd = og.if;
            dq.ci = og.il;
            dq.cn = og.iy;
            dq.cb = og.io;
            as.aa(1, (byte)1);
            dp.as(998283158);
         } else {
            us.ar(false, -7998461);
         }

      } catch (RuntimeException var1) {
         throw tm.aw(var1, "gn.au(" + ')');
      }
   }

   static final void nr(int var0) {
      try {
         client.qs = client.pb * -882875593;
         cj.sh = true;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "gn.nr(" + ')');
      }
   }
}
