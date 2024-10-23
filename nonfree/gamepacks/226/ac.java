import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

public class ac implements Callable {
   // $FF: synthetic field
   final ar this$0;
   static File aw;
   static final int cw = 91;
   public static int ax;
   static ng af;
   final au ap;
   static ul io;

   static void ay(float[] var0, int var1) {
      try {
         if (fj.aj + var0[0] < 1.3333334F) {
            if (var1 == 2084777749) {
               return;
            }

            float var2 = var0[0] - 2.0F;
            float var3 = var0[0] - 1.0F;
            float var4 = (float)Math.sqrt((double)(var2 * var2 - 4.0F * var3 * var3));
            float var5 = (var4 + -var2) * 0.5F;
            if (var0[1] + fj.aj > var5) {
               if (var1 == 2084777749) {
                  throw new IllegalStateException();
               }

               var0[1] = var5 - fj.aj;
            } else {
               var5 = (-var2 - var4) * 0.5F;
               if (var0[1] < var5 + fj.aj) {
                  if (var1 == 2084777749) {
                     return;
                  }

                  var0[1] = var5 + fj.aj;
               }
            }
         } else {
            var0[0] = 1.3333334F - fj.aj;
            var0[1] = 0.33333334F - fj.aj;
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "ac.ay(" + ')');
      }
   }

   public Object call() throws Exception {
      try {
         try {
            while(this.ap.aj(2007396320)) {
               ct.ap(10L);
            }
         } catch (IOException var2) {
            return new av("Error servicing REST query: " + var2.getMessage());
         }

         return this.ap.ai((byte)35);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ac.call(" + ')');
      }
   }

   public Object ap() throws Exception {
      try {
         while(this.ap.aj(2007396320)) {
            ct.ap(10L);
         }
      } catch (IOException var2) {
         return new av("Error servicing REST query: " + var2.getMessage());
      }

      return this.ap.ai((byte)49);
   }

   public Object aw() throws Exception {
      try {
         while(this.ap.aj(2007396320)) {
            ct.ap(10L);
         }
      } catch (IOException var2) {
         return new av("Error servicing REST query: " + var2.getMessage());
      }

      return this.ap.ai((byte)79);
   }

   ac(ar var1, au var2) {
      try {
         this.this$0 = var1;
         super();
         this.ap = var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ac.<init>(" + ')');
      }
   }

   public Object ak() throws Exception {
      try {
         while(this.ap.aj(2007396320)) {
            ct.ap(10L);
         }
      } catch (IOException var2) {
         return new av("Error servicing REST query: " + var2.getMessage());
      }

      return this.ap.ai((byte)60);
   }

   static int cb(int var0, da var1, boolean var2, byte var3) {
      try {
         if (var0 == 7900) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               int var4 = cm.ae[(dp.am -= -1450976103) * -158156887];
               client.wg = Math.max(var4, 0) * -443256233;
               return 1;
            }
         } else if (var0 == 7901) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            } else {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = client.wg * 680565095;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ac.cb(" + ')');
      }
   }

   public static int aw(int var0, int var1) {
      try {
         return tx.ay[var0 & 16383];
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ac.aw(" + ')');
      }
   }

   public static void ap(pe var0, int var1) {
      try {
         hb.ap = var0;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ac.ap(" + ')');
      }
   }

   public Object aj() throws Exception {
      try {
         while(this.ap.aj(2007396320)) {
            ct.ap(10L);
         }
      } catch (IOException var2) {
         return new av("Error servicing REST query: " + var2.getMessage());
      }

      return this.ap.ai((byte)127);
   }

   static final void hz(String var0, byte var1) {
      try {
         if (var0.equalsIgnoreCase("toggleroof")) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            }

            io.vx.aj(!io.vx.ai(1653574927), 537446135);
            if (io.vx.ai(-2030247803)) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               qc.aw(99, "", "Roofs are now all hidden", (byte)2);
            } else {
               qc.aw(99, "", "Roofs will only be removed selectively", (byte)94);
            }
         }

         boolean var10000;
         if (var0.startsWith("zbuf")) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            }

            if (bj.aj(var0.substring(5).trim(), -1481777132) == 1) {
               if (var1 >= 1) {
                  return;
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var2 = var10000;
            dd.bl.ac(var2, -1596611697);
            jm.ap(var2);
         }

         if (var0.equalsIgnoreCase("z")) {
            if (!client.er) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            client.er = var10000;
         }

         if (var0.equalsIgnoreCase("displayfps")) {
            if (var1 >= 1) {
               return;
            }

            io.vx.au(1663259455);
         }

         if (var0.equalsIgnoreCase("renderself")) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            }

            if (!client.nt) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            client.nt = var10000;
         }

         if (var0.equalsIgnoreCase("mouseovertext")) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            }

            if (!client.oe) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            client.oe = var10000;
         }

         int var3;
         String[] var7;
         if (var0.startsWith("setdrawdistance")) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            }

            var7 = var0.split(" ");

            try {
               var3 = Integer.parseInt(var7[1]);
               io.vx.bq(var3, 506630615);
            } catch (NumberFormatException var5) {
               qc.aw(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var7[1]), (byte)87);
            }
         }

         if (var0.startsWith("settilerendermode")) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            }

            var7 = var0.split(" ");

            try {
               var3 = Integer.parseInt(var7[1]);
               hx.jf.aw.bs(im.ap()[var3]);
            } catch (NumberFormatException var4) {
               qc.aw(99, "", String.format("Error setting tile render mode. settilerendermode should be in the format \"::settilerendermode X\" where X is a valid number from 0-1. 0=camera 1=target Value provided: %s", var7[1]), (byte)86);
            }
         }

         if (var0.equalsIgnoreCase("getdrawdistance")) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            }

            qc.aw(99, "", String.format("%d", io.vx.bp((byte)-52)), (byte)126);
         }

         if (client.pw * 1797447449 >= 2) {
            if (var1 >= 1) {
               return;
            }

            if (var0.equalsIgnoreCase("errortest")) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               throw new RuntimeException();
            }

            if (var0.equalsIgnoreCase("showcoord")) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               uc var9 = ch.wx;
               boolean var10001;
               if (!ch.wx.cl) {
                  if (var1 >= 1) {
                     return;
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               var9.cl = var10001;
            }

            if (var0.equalsIgnoreCase("fpson")) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               io.vx.at(true, 1603873848);
            }

            if (var0.equalsIgnoreCase("fpsoff")) {
               io.vx.at(false, 928083138);
            }

            if (var0.equalsIgnoreCase("gc")) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               System.gc();
            }

            if (var0.equalsIgnoreCase("clientdrop")) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               lg.he(-738679537);
            }

            if (var0.equalsIgnoreCase("clientreload")) {
               bm.ga(1640396411);
            }
         }

         me var8 = ef.ap(mm.bq, client.in.ai, (byte)28);
         var8.ak.bo(var0.length() + 1, -971156135);
         var8.ak.be(var0, (byte)101);
         client.in.ak(var8, (short)486);
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "ac.hz(" + ')');
      }
   }
}
