import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class pg {
   static final pg ac = new pg();
   static final pg ae = new pg();
   static final pg ag = new pg();
   static final int dp = 1000;
   static final pg am = new pg();
   static final int af = 5;
   static final int ah = 4096;

   pg() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "pg.<init>(" + ')');
      }
   }

   static final void ll(int var0) {
      try {
         for(dr var1 = (dr)du.js.as.af(); null != var1; var1 = (dr)du.js.as.au()) {
            if (var0 != 1564355311) {
               throw new IllegalStateException();
            }

            if (-1 == var1.ab * 1115245231) {
               if (var0 != 1564355311) {
                  return;
               }

               var1.ap = 0;
               jj.lq(du.js, var1, (short)2745);
            } else {
               var1.jb();
            }
         }

      } catch (RuntimeException var2) {
         throw vk.ae(var2, "pg.ll(" + ')');
      }
   }

   static final int ae(long var0, String var2, byte var3) {
      try {
         Random var4 = new Random();
         vf var5 = new vf(128);
         vf var6 = new vf(128);
         int[] var7 = new int[]{var4.nextInt(), var4.nextInt(), (int)(var0 >> 32), (int)var0};
         var5.bu(10, (byte)25);

         int var8;
         for(var8 = 0; var8 < 4; ++var8) {
            var5.bv(var4.nextInt(), 1258732767);
         }

         var5.bv(var7[0], 290925392);
         var5.bv(var7[1], 1136962951);
         var5.bq(var0);
         var5.bq(0L);

         for(var8 = 0; var8 < 4; ++var8) {
            if (var3 >= 99) {
               throw new IllegalStateException();
            }

            var5.bv(var4.nextInt(), 327340836);
         }

         var5.dx(cd.ax, cd.aq, -1207572354);
         var6.bu(10, (byte)-24);

         for(var8 = 0; var8 < 3; ++var8) {
            if (var3 >= 99) {
               throw new IllegalStateException();
            }

            var6.bv(var4.nextInt(), 521298938);
         }

         var6.bq(var4.nextLong());
         var6.bt(var4.nextLong());
         bh.pp(var6, 15728880);
         var6.bq(var4.nextLong());
         var6.dx(cd.ax, cd.aq, -1171113175);
         var8 = uo.be(var2, -321560987);
         if (var8 % 8 != 0) {
            if (var3 >= 99) {
               throw new IllegalStateException();
            }

            var8 += 8 - var8 % 8;
         }

         vf var9 = new vf(var8);
         var9.bc(var2, -157613091);
         var9.au = -1864458299 * var8;
         var9.db(var7, 1629523077);
         vf var10 = new vf(-1027766515 * var9.au + -1027766515 * var6.au + 5 + -1027766515 * var5.au);
         var10.bu(2, (byte)46);
         var10.bu(-1027766515 * var5.au, (byte)34);
         var10.cu(var5.at, 0, var5.au * -1027766515, 677587091);
         var10.bu(-1027766515 * var6.au, (byte)-29);
         var10.cu(var6.at, 0, var6.au * -1027766515, 1433688733);
         var10.br(var9.au * -1027766515, 1625888552);
         var10.cu(var9.at, 0, var9.au * -1027766515, -1361942774);
         String var11 = iv.ac(var10.at, 2102764691);

         try {
            URL var12 = new URL(ng.of("services", false, (byte)-20) + "m=accountappeal/login.ws");
            URLConnection var13 = var12.openConnection();
            var13.setDoInput(true);
            var13.setDoOutput(true);
            var13.setConnectTimeout(5000);
            OutputStreamWriter var14 = new OutputStreamWriter(var13.getOutputStream());
            var14.write("data2=" + kk.ac(var11, (byte)61) + "&dest=" + kk.ac("passwordchoice.ws", (byte)61));
            var14.flush();
            InputStream var15 = var13.getInputStream();
            var10 = new vf(new byte[1000]);

            do {
               int var16 = var15.read(var10.at, -1027766515 * var10.au, 1000 - var10.au * -1027766515);
               if (var16 == -1) {
                  if (var3 >= 99) {
                     throw new IllegalStateException();
                  } else {
                     var14.close();
                     var15.close();
                     String var22 = new String(var10.at);
                     if (var22.startsWith("OFFLINE")) {
                        if (var3 >= 99) {
                           throw new IllegalStateException();
                        } else {
                           return 4;
                        }
                     } else if (var22.startsWith("WRONG")) {
                        return 7;
                     } else if (var22.startsWith("RELOAD")) {
                        if (var3 >= 99) {
                           throw new IllegalStateException();
                        } else {
                           return 3;
                        }
                     } else if (var22.startsWith("Not permitted for social network accounts.")) {
                        if (var3 >= 99) {
                           throw new IllegalStateException();
                        } else {
                           return 6;
                        }
                     } else {
                        var10.dc(var7, (byte)5);

                        while(var10.au * -1027766515 > 0) {
                           if (var3 >= 99) {
                              throw new IllegalStateException();
                           }

                           if (var10.at[-1027766515 * var10.au - 1] != 0) {
                              break;
                           }

                           if (var3 >= 99) {
                              throw new IllegalStateException();
                           }

                           var10.au -= -1864458299;
                        }

                        var22 = new String(var10.at, 0, -1027766515 * var10.au);
                        boolean var17;
                        if (var22 == null) {
                           var17 = false;
                        } else {
                           label118: {
                              try {
                                 new URL(var22);
                              } catch (MalformedURLException var19) {
                                 var17 = false;
                                 break label118;
                              }

                              var17 = true;
                           }
                        }

                        if (var17) {
                           if (var3 >= 99) {
                              throw new IllegalStateException();
                           } else {
                              ia.ac(var22, true, false, -1047232931);
                              return 2;
                           }
                        } else {
                           return 5;
                        }
                     }
                  }
               }

               var10.au += -1864458299 * var16;
            } while(var10.au * -1027766515 < 1000);

            if (var3 >= 99) {
               throw new IllegalStateException();
            } else {
               return 5;
            }
         } catch (Throwable var20) {
            var20.printStackTrace();
            return 5;
         }
      } catch (RuntimeException var21) {
         throw vk.ae(var21, "pg.ae(" + ')');
      }
   }

   static boolean bs(id var0, int var1) {
      try {
         if (var0.bz != null) {
            if (var1 >= 2123502438) {
               throw new IllegalStateException();
            }

            int[] var2 = var0.bz;

            for(int var3 = 0; var3 < var2.length; ++var3) {
               if (var1 >= 2123502438) {
                  throw new IllegalStateException();
               }

               int var4 = var2[var3];
               id var5 = kf.ae(var4, (byte)107);
               if (var5.bx * 946905713 != -1) {
                  return true;
               }
            }
         } else if (-1 != var0.bx * 946905713) {
            if (var1 >= 2123502438) {
               throw new IllegalStateException();
            }

            return true;
         }

         return false;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "pg.bs(" + ')');
      }
   }
}
