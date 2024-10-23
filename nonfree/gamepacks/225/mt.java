import java.io.IOException;
import java.util.concurrent.ThreadFactory;

class mt implements ThreadFactory {
   static final int ag = 4;
   static boolean[] af;
   static final int bv = 25;
   // $FF: synthetic field
   final ms this$0;

   public Thread ae(Runnable var1) {
      return new Thread(var1, "OSRS WAV Load");
   }

   public Thread newThread(Runnable var1) {
      try {
         return new Thread(var1, "OSRS WAV Load");
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "mt.newThread(" + ')');
      }
   }

   public Thread ac(Runnable var1) {
      return new Thread(var1, "OSRS WAV Load");
   }

   public Thread ag(Runnable var1) {
      return new Thread(var1, "OSRS WAV Load");
   }

   mt(ms var1) {
      this.this$0 = var1;
   }

   static void hw(int var0) {
      try {
         client.dl = true;
         if (null != iu.qz) {
            if (var0 != 1886337145) {
               throw new IllegalStateException();
            }

            if (iu.qz.ad((byte)-92)) {
               if (var0 != 1886337145) {
                  throw new IllegalStateException();
               }

               iu.qz.au(1466513548);
            }
         }

         ky.if((byte)-14);
         tm.hx(612790951);
         if (dn.dq != null) {
            if (var0 != 1886337145) {
               return;
            }

            dn.dq.ac = false;
         }

         dn.dq = null;
         client.ia.ax(687174520);
         if (client.ac != null) {
            if (var0 != 1886337145) {
               throw new IllegalStateException();
            }

            try {
               client.ac.ac(1732796639);
            } catch (Exception var3) {
            }
         }

         client.ac = null;
         gn.ia((byte)-117);
         hi.hg((byte)27);
         client.ju.am((short)4096);
         ey.wv = null;
         ly.ax(0, 0, (byte)64);
         bo.ar((byte)-101);
         client.tm = false;
         ce.ac(-720268434);
         if (eg.ts != null) {
            if (var0 != 1886337145) {
               throw new IllegalStateException();
            }

            eg.ts.an(1032671876);
         }

         tw.ve.ar((byte)0);
         jq.am((byte)-75);
         if (null != ao.ir) {
            if (var0 != 1886337145) {
               throw new IllegalStateException();
            }

            ao.ir.aq((byte)55);
         }

         ec.am((byte)18);
         il.ah = null;
         il.ap = null;
         ij.ab = null;
         eo.ag(-76126880);
         ol.vx = null;
         client.wz.clear();
         client.wk = 0;
         tw.ve = new py();
         ao.ir = new eb(ae.be.gq, 225);

         try {
            ls.ac("oldschool", il.hf, lc.cf.ax, 0, 23, 1762039999);
         } catch (IOException var2) {
            throw new RuntimeException(var2);
         }

         ol.vx = new sl(255, il.ah, il.ap, 500000);
         client.ac = new ir();
         ae.be.an((byte)-36);
         mx.ht(da.ae, 1903614006);
         ry.hp(0, 912081526);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "mt.hw(" + ')');
      }
   }

   static final void ae(long var0) {
      try {
         try {
            Thread.sleep(var0);
         } catch (InterruptedException var3) {
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "mt.ae(" + ')');
      }
   }
}
