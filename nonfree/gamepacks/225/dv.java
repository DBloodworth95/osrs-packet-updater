import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class dv {
   static int gp;
   Future ae;
   public static final int aj = 1073741824;
   static final int kb = 334;
   ExecutorService ac;
   public static final int at = 1;

   void ax() {
      this.ac.shutdown();
      this.ac = null;
   }

   void ac(int var1) {
      try {
         this.ac.shutdown();
         this.ac = null;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "dv.ac(" + ')');
      }
   }

   dv() {
      try {
         super();
         this.ac = Executors.newSingleThreadExecutor();
         this.ae = this.ac.submit(new dc());
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "dv.<init>(" + ')');
      }
   }

   SecureRandom ag(int var1) {
      try {
         try {
            return (SecureRandom)this.ae.get();
         } catch (Exception var5) {
            SecureRandom var4 = new SecureRandom();
            var4.nextInt();
            return var4;
         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "dv.ag(" + ')');
      }
   }

   void am() {
      this.ac.shutdown();
      this.ac = null;
   }

   void af() {
      this.ac.shutdown();
      this.ac = null;
   }

   void aq() {
      this.ac.shutdown();
      this.ac = null;
   }

   static void am(int var0, boolean var1, int var2, boolean var3, int var4) {
      try {
         if (null != br.ax) {
            if (var4 == -654324996) {
               throw new IllegalStateException();
            }

            mw.ax(0, br.ax.length - 1, var0, var1, var2, var3, 1674298401);
         }

      } catch (RuntimeException var5) {
         throw vk.ae(var5, "dv.am(" + ')');
      }
   }

   boolean at() {
      return this.ae.isDone();
   }

   SecureRandom ah() {
      try {
         return (SecureRandom)this.ae.get();
      } catch (Exception var4) {
         SecureRandom var3 = new SecureRandom();
         var3.nextInt();
         return var3;
      }
   }

   SecureRandom ar() {
      try {
         return (SecureRandom)this.ae.get();
      } catch (Exception var4) {
         SecureRandom var3 = new SecureRandom();
         var3.nextInt();
         return var3;
      }
   }

   SecureRandom al() {
      try {
         return (SecureRandom)this.ae.get();
      } catch (Exception var4) {
         SecureRandom var3 = new SecureRandom();
         var3.nextInt();
         return var3;
      }
   }

   SecureRandom ad() {
      try {
         return (SecureRandom)this.ae.get();
      } catch (Exception var4) {
         SecureRandom var3 = new SecureRandom();
         var3.nextInt();
         return var3;
      }
   }

   boolean ae(int var1) {
      try {
         return this.ae.isDone();
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "dv.ae(" + ')');
      }
   }

   boolean au() {
      return this.ae.isDone();
   }

   static void jz(dd var0, int var1) {
      try {
         int var2 = 0;

         for(int var3 = 0; var3 < var0.aa * -557899353; ++var3) {
            if (var1 == -1205048158) {
               return;
            }

            su var4 = var0.az[var0.ai[var3]];
            if (null != var4) {
               if (var1 == -1205048158) {
                  throw new IllegalStateException();
               }

               boolean var10000;
               if (var4.ar.ac * 1011931441 == ds.ms * -809297581) {
                  if (var1 == -1205048158) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var5 = var10000;
               if (!var5) {
                  if (var1 == -1205048158) {
                     return;
                  }

                  if (var2 < client.wj * -1220676765) {
                     if (var1 == -1205048158) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  boolean var6 = var10000;
                  if (!var6) {
                     continue;
                  }

                  if (var1 == -1205048158) {
                     return;
                  }

                  ++var2;
               }

               var4.af = he.ki(var0, -962238781 * var4.aq, -1958743463 * var4.at, var0.am * 97097587, 1364598893) * 234934829;
               var4.ar.ae.ag = 1472813913 * client.do;
               var4.ad((byte)-92);
               var0.ae.az(var0.am * 97097587, -962238781 * var4.aq, -1958743463 * var4.at, -1729802843 * var4.af, 60, var4.ar.ae, 1295026153 * var4.au, 0L, false);
               rz.ju(var4.ar, -1256671564);
               dd var12 = var4.ar;
               if (client.na * -1884548229 >= 0) {
                  if (var1 == -1205048158) {
                     throw new IllegalStateException();
                  }

                  if (null != var12.ad[client.na * -1884548229]) {
                     if (var1 == -1205048158) {
                        throw new IllegalStateException();
                     }

                     cj.js(var12, -1884548229 * client.na, false, (short)-29553);
                  }
               }

               fe.jk(var4.ar, true, 212880289);
               dd var7 = var4.ar;
               int var8 = client.jl.at * -396152079;
               int[] var9 = client.jl.au;

               for(int var10 = 0; var10 < var8; ++var10) {
                  if (var1 == -1205048158) {
                     throw new IllegalStateException();
                  }

                  if (var9[var10] != -1884548229 * client.na) {
                     if (var1 == -1205048158) {
                        return;
                     }

                     if (-797776089 * client.mf == var9[var10]) {
                        if (var1 == -1205048158) {
                           throw new IllegalStateException();
                        }
                     } else {
                        cj.js(var7, var9[var10], true, (short)411);
                     }
                  }
               }

               fe.jk(var4.ar, false, 85274608);
               at.jq(var4.ar, (byte)29);
               dd var13 = var4.ar;

               for(cb var14 = (cb)var13.aj.af(); var14 != null; var14 = (cb)var13.aj.au()) {
                  if (var1 == -1205048158) {
                     throw new IllegalStateException();
                  }

                  if (var14.ag * -902188015 == 97097587 * var13.am) {
                     if (var1 == -1205048158) {
                        throw new IllegalStateException();
                     }

                     if (!var14.ar) {
                        if (1472813913 * client.do >= 507163851 * var14.ae) {
                           if (var1 == -1205048158) {
                              throw new IllegalStateException();
                           }

                           var14.ac(-766676153 * client.jd, (byte)0);
                           if (var14.ar) {
                              var14.jb();
                           } else {
                              var13.ae.az(var14.ag * -902188015, -480323063 * var14.am, -1984574171 * var14.ax, var14.aq * -2074291457, 60, var14, 0, -1L, false);
                           }
                        }
                        continue;
                     }

                     if (var1 == -1205048158) {
                        throw new IllegalStateException();
                     }
                  }

                  var14.jb();
               }
            }
         }

      } catch (RuntimeException var11) {
         throw vk.ae(var11, "dv.jz(" + ')');
      }
   }
}
