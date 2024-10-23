import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class eb extends en {
   final boolean ax;

   void af(ek var1) throws IOException {
      URLConnection var2 = null;
      boolean var9 = false;

      label124: {
         HttpURLConnection var12;
         label125: {
            try {
               var9 = true;
               String var3 = var1.ac.getProtocol();
               if (var3.equals("http")) {
                  var2 = this.aw(var1, 1498120240);
               } else {
                  if (!var3.equals("https")) {
                     var1.am = -364946603 * ek.ag;
                     var9 = false;
                     break label124;
                  }

                  var2 = this.an(var1, 391501729);
               }

               this.am(var2, var1, -403045282);
               var9 = false;
               break label125;
            } catch (IOException var10) {
               var1.am = 1388686398 * ek.ag;
               var9 = false;
            } finally {
               if (var9) {
                  if (null != var2 && var2 instanceof HttpURLConnection) {
                     HttpURLConnection var6 = (HttpURLConnection)var2;
                     var6.disconnect();
                  }

               }
            }

            if (null != var2 && var2 instanceof HttpURLConnection) {
               var12 = (HttpURLConnection)var2;
               var12.disconnect();
            }

            return;
         }

         if (null != var2 && var2 instanceof HttpURLConnection) {
            var12 = (HttpURLConnection)var2;
            var12.disconnect();
         }

         return;
      }

      if (null != var2 && var2 instanceof HttpURLConnection) {
         HttpURLConnection var4 = (HttpURLConnection)var2;
         var4.disconnect();
      }

   }

   URLConnection aw(ek var1, int var2) throws IOException {
      try {
         URLConnection var3 = var1.ac.openConnection();
         this.ag(var3, 1861818621);
         return var3;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "eb.aw(" + ')');
      }
   }

   public eb(boolean var1, int var2) {
      try {
         super(var2);
         this.ax = var1;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "eb.<init>(" + ')');
      }
   }

   URLConnection an(ek var1, int var2) throws IOException {
      try {
         HttpsURLConnection var3 = (HttpsURLConnection)var1.ac.openConnection();
         if (!this.ax) {
            if (var2 >= 1580905911) {
               throw new IllegalStateException();
            }

            if (null == az.ae) {
               if (var2 >= 1580905911) {
                  throw new IllegalStateException();
               }

               az.ae = new az();
            }

            az var5 = az.ae;
            var3.setSSLSocketFactory(var5);
         }

         this.ag(var3, 1377027093);
         return var3;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "eb.an(" + ')');
      }
   }

   void ac(ek var1, int var2) throws IOException {
      try {
         URLConnection var3 = null;
         boolean var11 = false;

         HttpURLConnection var15;
         label193: {
            label201: {
               try {
                  var11 = true;
                  String var4 = var1.ac.getProtocol();
                  if (var4.equals("http")) {
                     if (var2 <= 2135199419) {
                        throw new IllegalStateException();
                     }

                     var3 = this.aw(var1, 373156715);
                  } else {
                     if (!var4.equals("https")) {
                        var1.am = -364946603 * ek.ag;
                        var11 = false;
                        break label201;
                     }

                     if (var2 <= 2135199419) {
                        throw new IllegalStateException();
                     }

                     var3 = this.an(var1, -1357287561);
                  }

                  this.am(var3, var1, -108104768);
                  var11 = false;
                  break label193;
               } catch (IOException var12) {
                  var1.am = -364946603 * ek.ag;
                  var11 = false;
               } finally {
                  if (var11) {
                     if (null != var3) {
                        if (var2 <= 2135199419) {
                           throw new IllegalStateException();
                        }

                        if (var3 instanceof HttpURLConnection) {
                           if (var2 <= 2135199419) {
                              throw new IllegalStateException();
                           }

                           HttpURLConnection var7 = (HttpURLConnection)var3;
                           var7.disconnect();
                        }
                     }

                  }
               }

               if (null != var3) {
                  if (var2 <= 2135199419) {
                     return;
                  }

                  if (var3 instanceof HttpURLConnection) {
                     var15 = (HttpURLConnection)var3;
                     var15.disconnect();
                     return;
                  }
               }

               return;
            }

            if (null != var3 && var3 instanceof HttpURLConnection) {
               if (var2 <= 2135199419) {
                  throw new IllegalStateException();
               }

               HttpURLConnection var5 = (HttpURLConnection)var3;
               var5.disconnect();
            }

            return;
         }

         if (null != var3) {
            if (var2 <= 2135199419) {
               throw new IllegalStateException();
            }

            if (var3 instanceof HttpURLConnection) {
               if (var2 <= 2135199419) {
                  throw new IllegalStateException();
               }

               var15 = (HttpURLConnection)var3;
               var15.disconnect();
            }
         }

      } catch (RuntimeException var14) {
         throw vk.ae(var14, "eb.ac(" + ')');
      }
   }

   static final int ax(int var0, int var1, int var2, int var3, int var4) {
      try {
         return var1 * var2 - var3 * var0 >> 16;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "eb.ax(" + ')');
      }
   }
}
