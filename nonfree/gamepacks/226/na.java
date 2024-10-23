import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class na {
   public Object[] aj;
   ny aw;
   bj ak;
   public Object[] ay;
   public Object[] ai;
   static int ik;
   public Object[] as;
   public nz ap;

   na() {
      try {
         super();
         this.ap = new nz();
         this.aw = new ny();
         this.ak = new bj();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "na.<init>(" + ')');
      }
   }

   static final int aw(long var0, String var2, int var3) {
      try {
         Random var4 = new Random();
         vl var5 = new vl(128);
         vl var6 = new vl(128);
         int[] var7 = new int[]{var4.nextInt(), var4.nextInt(), (int)(var0 >> 32), (int)var0};
         var5.bo(10, -590905671);

         int var8;
         for(var8 = 0; var8 < 4; ++var8) {
            if (var3 == -1665201436) {
               throw new IllegalStateException();
            }

            var5.bw(var4.nextInt(), (byte)86);
         }

         var5.bw(var7[0], (byte)30);
         var5.bw(var7[1], (byte)39);
         var5.bf(var0);
         var5.bf(0L);

         for(var8 = 0; var8 < 4; ++var8) {
            if (var3 == -1665201436) {
               throw new IllegalStateException();
            }

            var5.bw(var4.nextInt(), (byte)97);
         }

         var5.dm(cs.ai, cs.ay, -621998661);
         var6.bo(10, 767941389);

         for(var8 = 0; var8 < 3; ++var8) {
            if (var3 == -1665201436) {
               throw new IllegalStateException();
            }

            var6.bw(var4.nextInt(), (byte)50);
         }

         var6.bf(var4.nextLong());
         var6.bi(var4.nextLong());
         if (null != client.hz) {
            if (var3 == -1665201436) {
               throw new IllegalStateException();
            }

            var6.ci(client.hz, 0, client.hz.length, -1224141723);
         } else {
            byte[] var22 = aw.ai((byte)0);
            var6.ci(var22, 0, var22.length, -1926613217);
         }

         var6.bf(var4.nextLong());
         var6.dm(cs.ai, cs.ay, 1702569045);
         var8 = ct.bl(var2, 1711129930);
         if (var8 % 8 != 0) {
            var8 += 8 - var8 % 8;
         }

         vl var9 = new vl(var8);
         var9.be(var2, (byte)114);
         var9.am = var8 * -725588083;
         var9.df(var7, -1982843705);
         vl var10 = new vl(-1689308347 * var6.am + 5 + var5.am * -1689308347 + -1689308347 * var9.am);
         var10.bo(2, 374908284);
         var10.bo(var5.am * -1689308347, -2081242573);
         var10.ci(var5.ae, 0, -1689308347 * var5.am, -1136835302);
         var10.bo(var6.am * -1689308347, -521214762);
         var10.ci(var6.ae, 0, -1689308347 * var6.am, -1544586946);
         var10.bd(var9.am * -1689308347, (byte)17);
         var10.ci(var9.ae, 0, -1689308347 * var9.am, -1753280217);
         byte[] var12 = var10.ae;
         int var14 = var12.length;
         StringBuilder var15 = new StringBuilder();

         int var18;
         for(int var16 = 0; var16 < var14 + 0; var16 += 3) {
            if (var3 == -1665201436) {
               throw new IllegalStateException();
            }

            int var17 = var12[var16] & 255;
            var15.append(qn.ap[var17 >>> 2]);
            if (var16 < var14 - 1) {
               if (var3 == -1665201436) {
                  throw new IllegalStateException();
               }

               var18 = var12[var16 + 1] & 255;
               var15.append(qn.ap[(var17 & 3) << 4 | var18 >>> 4]);
               if (var16 < var14 - 2) {
                  if (var3 == -1665201436) {
                     throw new IllegalStateException();
                  }

                  int var19 = var12[var16 + 2] & 255;
                  var15.append(qn.ap[(var18 & 15) << 2 | var19 >>> 6]).append(qn.ap[var19 & 63]);
               } else {
                  var15.append(qn.ap[(var18 & 15) << 2]).append("=");
               }
            } else {
               var15.append(qn.ap[(var17 & 3) << 4]).append("==");
            }
         }

         String var13 = var15.toString();
         var13 = var13;

         try {
            URL var23 = new URL(el.ov("services", false, -1997109042) + "m=accountappeal/login.ws");
            URLConnection var24 = var23.openConnection();
            var24.setDoInput(true);
            var24.setDoOutput(true);
            var24.setConnectTimeout(5000);
            OutputStreamWriter var25 = new OutputStreamWriter(var24.getOutputStream());
            var25.write("data2=" + qo.ap(var13, -771669917) + "&dest=" + qo.ap("passwordchoice.ws", 1314668672));
            var25.flush();
            InputStream var26 = var24.getInputStream();
            var10 = new vl(new byte[1000]);

            do {
               var18 = var26.read(var10.ae, var10.am * -1689308347, 1000 - -1689308347 * var10.am);
               if (var18 == -1) {
                  if (var3 == -1665201436) {
                     throw new IllegalStateException();
                  } else {
                     var25.close();
                     var26.close();
                     String var27 = new String(var10.ae);
                     if (var27.startsWith("OFFLINE")) {
                        if (var3 == -1665201436) {
                           throw new IllegalStateException();
                        } else {
                           return 4;
                        }
                     } else if (var27.startsWith("WRONG")) {
                        return 7;
                     } else if (var27.startsWith("RELOAD")) {
                        if (var3 == -1665201436) {
                           throw new IllegalStateException();
                        } else {
                           return 3;
                        }
                     } else if (var27.startsWith("Not permitted for social network accounts.")) {
                        if (var3 == -1665201436) {
                           throw new IllegalStateException();
                        } else {
                           return 6;
                        }
                     } else {
                        var10.du(var7, (byte)19);

                        while(var10.am * -1689308347 > 0) {
                           if (var3 == -1665201436) {
                              throw new IllegalStateException();
                           }

                           if (var10.ae[var10.am * -1689308347 - 1] != 0) {
                              break;
                           }

                           if (var3 == -1665201436) {
                              throw new IllegalStateException();
                           }

                           var10.am -= -725588083;
                        }

                        var27 = new String(var10.ae, 0, -1689308347 * var10.am);
                        if (ej.ak(var27, -1935189221)) {
                           if (var3 == -1665201436) {
                              throw new IllegalStateException();
                           } else {
                              pc.ap(var27, true, false, (byte)79);
                              return 2;
                           }
                        } else {
                           return 5;
                        }
                     }
                  }
               }

               var10.am += var18 * -725588083;
            } while(-1689308347 * var10.am < 1000);

            if (var3 == -1665201436) {
               throw new IllegalStateException();
            } else {
               return 5;
            }
         } catch (Throwable var20) {
            var20.printStackTrace();
            return 5;
         }
      } catch (RuntimeException var21) {
         throw tm.aw(var21, "na.aw(" + ')');
      }
   }

   static void at(byte var0) {
      try {
         dq.co = dq.co.trim();
         if (dq.co.length() == 0) {
            if (var0 != 0) {
               fa.ad(og.eu, og.eq, og.eb, -1059127340);
            }
         } else if (dq.cf.length() == 0) {
            fa.ad(og.es, og.eo, og.ee, -1059127340);
         } else {
            fa.ad(og.im, og.is, og.jj, -1059127340);
            client.fi = io.vx.bx(dq.co, 145293273) ? fu.ap : fu.ak;
            ea.gv(20, 2027013533);
         }
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "na.at(" + ')');
      }
   }
}
