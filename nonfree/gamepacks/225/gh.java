public class gh extends tr {
   static vt dx;
   public static ml ac = new ml(64);
   static final int ao = 21;

   gh() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "gh.<init>(" + ')');
      }
   }

   static final void iy(String var0, int var1) {
      try {
         if (var0.equalsIgnoreCase("toggleroof")) {
            if (var1 == 1621624597) {
               return;
            }

            du var10000 = re.vt;
            boolean var10001;
            if (!re.vt.aq(1488734456)) {
               if (var1 == 1621624597) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            var10000.ax(var10001, 2024241434);
            if (re.vt.aq(1488734456)) {
               if (var1 == 1621624597) {
                  throw new IllegalStateException();
               }

               ho.ae(99, "", "Roofs are now all hidden", (byte)6);
            } else {
               ho.ae(99, "", "Roofs will only be removed selectively", (byte)-62);
            }
         }

         boolean var9;
         if (var0.startsWith("zbuf")) {
            if (var1 == 1621624597) {
               throw new IllegalStateException();
            }

            if (ir.ag(var0.substring(5).trim(), 1473180947) == 1) {
               if (var1 == 1621624597) {
                  throw new IllegalStateException();
               }

               var9 = true;
            } else {
               var9 = false;
            }

            boolean var2 = var9;
            ae.be.aj(var2, 2023339617);
            jw.ac(var2);
         }

         if (var0.equalsIgnoreCase("z")) {
            if (var1 == 1621624597) {
               return;
            }

            if (!client.ex) {
               if (var1 == 1621624597) {
                  return;
               }

               var9 = true;
            } else {
               var9 = false;
            }

            client.ex = var9;
         }

         if (var0.equalsIgnoreCase("displayfps")) {
            re.vt.ad(-1522117799);
         }

         if (var0.equalsIgnoreCase("renderself")) {
            if (var1 == 1621624597) {
               throw new IllegalStateException();
            }

            if (!client.ne) {
               if (var1 == 1621624597) {
                  throw new IllegalStateException();
               }

               var9 = true;
            } else {
               var9 = false;
            }

            client.ne = var9;
         }

         if (var0.equalsIgnoreCase("mouseovertext")) {
            if (var1 == 1621624597) {
               throw new IllegalStateException();
            }

            if (!client.oc) {
               if (var1 == 1621624597) {
                  throw new IllegalStateException();
               }

               var9 = true;
            } else {
               var9 = false;
            }

            client.oc = var9;
         }

         int var3;
         String[] var7;
         if (var0.startsWith("setdrawdistance")) {
            if (var1 == 1621624597) {
               throw new IllegalStateException();
            }

            var7 = var0.split(" ");

            try {
               var3 = Integer.parseInt(var7[1]);
               re.vt.bw(var3, -966519693);
            } catch (NumberFormatException var5) {
               ho.ae(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var7[1]), (byte)101);
            }
         }

         if (var0.startsWith("settilerendermode")) {
            var7 = var0.split(" ");

            try {
               var3 = Integer.parseInt(var7[1]);
               du.js.ae.bz(in.ac()[var3]);
            } catch (NumberFormatException var4) {
               ho.ae(99, "", String.format("Error setting tile render mode. settilerendermode should be in the format \"::settilerendermode X\" where X is a valid number from 0-1. 0=camera 1=target Value provided: %s", var7[1]), (byte)-29);
            }
         }

         if (var0.equalsIgnoreCase("getdrawdistance")) {
            ho.ae(99, "", String.format("%d", re.vt.ba((byte)10)), (byte)-31);
         }

         if (703902891 * client.pe >= 2) {
            if (var1 == 1621624597) {
               return;
            }

            if (var0.equalsIgnoreCase("errortest")) {
               if (var1 == 1621624597) {
                  return;
               }

               throw new RuntimeException();
            }

            if (var0.equalsIgnoreCase("showcoord")) {
               if (var1 == 1621624597) {
                  throw new IllegalStateException();
               }

               ey.wv.ci = !ey.wv.ci;
            }

            if (var0.equalsIgnoreCase("fpson")) {
               re.vt.al(true, (byte)-79);
            }

            if (var0.equalsIgnoreCase("fpsoff")) {
               if (var1 == 1621624597) {
                  throw new IllegalStateException();
               }

               re.vt.al(false, (byte)-78);
            }

            if (var0.equalsIgnoreCase("gc")) {
               System.gc();
            }

            if (var0.equalsIgnoreCase("clientdrop")) {
               if (var1 == 1621624597) {
                  throw new IllegalStateException();
               }

               og.ii(-1905719585);
            }

            if (var0.equalsIgnoreCase("clientreload")) {
               if (var1 == 1621624597) {
                  throw new IllegalStateException();
               }

               mt.hw(1886337145);
            }
         }

         mq var8 = fs.ac(mz.dv, client.ia.ax, (byte)-18);
         var8.ag.bu(var0.length() + 1, (byte)92);
         var8.ag.bc(var0, -1094843695);
         client.ia.ag(var8, 1786269735);
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "gh.iy(" + ')');
      }
   }

   public static void am(int var0) {
      try {
         hl.ae.am();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "gh.am(" + ')');
      }
   }

   public static long af(int var0, int var1) {
      try {
         if (var0 > 63) {
            if (var1 != -578688127) {
               throw new IllegalStateException();
            } else {
               throw new qp("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
            }
         } else {
            return (long)Math.pow(2.0D, (double)var0) - 1L;
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "gh.af(" + ')');
      }
   }
}
