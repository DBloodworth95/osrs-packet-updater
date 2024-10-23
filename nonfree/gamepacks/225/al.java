import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class al {
   final HttpsURLConnection ac;
   boolean ax;
   final ar ag;
   final rf ae;
   tz am;
   boolean aq;
   int af;
   static final int bo = 56;
   static byte[][] jh;
   public static short[][] ap;

   boolean al() throws IOException {
      if (!this.ax) {
         this.ag(-1949015606);
      }

      this.ac.connect();
      return this.ac.getResponseCode() == -1;
   }

   void ag(int var1) throws ProtocolException {
      try {
         if (this.ax) {
            if (var1 >= -1573579646) {
               throw new IllegalStateException();
            }
         } else {
            this.ac.setRequestMethod(this.ag.aq(-2074778080));
            this.ae.ac(this.ac, (byte)-66);
            if (this.ag.af((short)30553) && null != this.am) {
               if (var1 >= -1573579646) {
                  throw new IllegalStateException();
               }

               this.ac.setDoOutput(true);
               ByteArrayOutputStream var2 = new ByteArrayOutputStream();

               try {
                  var2.write(this.am.ae(-115375452));
                  var2.writeTo(this.ac.getOutputStream());
               } catch (IOException var13) {
                  var13.printStackTrace();
               } finally {
                  try {
                     var2.close();
                  } catch (IOException var12) {
                     var12.printStackTrace();
                  }

               }
            }

            this.ac.setConnectTimeout(1517185483 * this.af);
            this.ac.setInstanceFollowRedirects(this.aq);
            this.ax = true;
         }
      } catch (RuntimeException var15) {
         throw vk.ae(var15, "al.ag(" + ')');
      }
   }

   public rf ac(int var1) {
      try {
         return this.ae;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "al.ac(" + ')');
      }
   }

   ay ax(byte var1) {
      try {
         try {
            label79: {
               if (this.ax) {
                  if (var1 >= 3) {
                     throw new IllegalStateException();
                  }

                  if (this.ac.getResponseCode() != -1) {
                     break label79;
                  }

                  if (var1 >= 3) {
                     throw new IllegalStateException();
                  }
               }

               return new ay("No REST response has been received yet.");
            }
         } catch (IOException var12) {
            this.ac.disconnect();
            return new ay("Error decoding REST response code: " + var12.getMessage());
         }

         ay var4;
         try {
            ay var2 = new ay(this.ac);
            return var2;
         } catch (IOException var10) {
            var4 = new ay("Error decoding REST response: " + var10.getMessage());
         } finally {
            this.ac.disconnect();
         }

         return var4;
      } catch (RuntimeException var13) {
         throw vk.ae(var13, "al.ax(" + ')');
      }
   }

   public al(URL var1, ar var2, boolean var3) throws IOException {
      try {
         this(var1, var2, new rf(), var3);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "al.<init>(" + ')');
      }
   }

   boolean am(int var1) throws IOException {
      try {
         if (!this.ax) {
            if (var1 >= -181899135) {
               throw new IllegalStateException();
            }

            this.ag(-1640640586);
         }

         this.ac.connect();
         boolean var10000;
         if (this.ac.getResponseCode() == -1) {
            if (var1 >= -181899135) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "al.am(" + ')');
      }
   }

   ay ah() {
      try {
         if (!this.ax || this.ac.getResponseCode() == -1) {
            return new ay("No REST response has been received yet.");
         }
      } catch (IOException var10) {
         this.ac.disconnect();
         return new ay("Error decoding REST response code: " + var10.getMessage());
      }

      ay var3;
      try {
         ay var1 = new ay(this.ac);
         return var1;
      } catch (IOException var8) {
         var3 = new ay("Error decoding REST response: " + var8.getMessage());
      } finally {
         this.ac.disconnect();
      }

      return var3;
   }

   public void aq(tz var1) {
      if (!this.ax) {
         if (null == var1) {
            this.ae.am("Content-Type", -1347557672);
            this.am = null;
         } else {
            this.am = var1;
            if (this.am.ac(-1838816060) != null) {
               this.ae.at(this.am.ac(-296219491), (short)13701);
            } else {
               this.ae.au((byte)-116);
            }

         }
      }
   }

   public void af(tz var1) {
      if (!this.ax) {
         if (null == var1) {
            this.ae.am("Content-Type", -1347557672);
            this.am = null;
         } else {
            this.am = var1;
            if (this.am.ac(-663534906) != null) {
               this.ae.at(this.am.ac(-2040582000), (short)31327);
            } else {
               this.ae.au((byte)-43);
            }

         }
      }
   }

   public void at(tz var1) {
      if (!this.ax) {
         if (null == var1) {
            this.ae.am("Content-Type", -1347557672);
            this.am = null;
         } else {
            this.am = var1;
            if (this.am.ac(-732596673) != null) {
               this.ae.at(this.am.ac(-1323130439), (short)14055);
            } else {
               this.ae.au((byte)-25);
            }

         }
      }
   }

   public al(URL var1, ar var2, rf var3, boolean var4) throws IOException {
      try {
         super();
         this.ax = false;
         this.aq = false;
         this.af = 465354656;
         if (!var2.ax(1331741957)) {
            throw new UnsupportedEncodingException("Unsupported request method used " + var2.aq(-1306397326));
         } else {
            this.ac = (HttpsURLConnection)var1.openConnection();
            if (!var4) {
               this.ac.setSSLSocketFactory(az.ac((short)16360));
            }

            this.ag = var2;
            this.ae = var3 != null ? var3 : new rf();
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "al.<init>(" + ')');
      }
   }

   boolean ar() throws IOException {
      if (!this.ax) {
         this.ag(-1884231843);
      }

      this.ac.connect();
      return this.ac.getResponseCode() == -1;
   }

   public void ae(tz var1, int var2) {
      try {
         if (this.ax) {
            if (var2 != -1074268483) {
               ;
            }
         } else if (null == var1) {
            if (var2 == -1074268483) {
               throw new IllegalStateException();
            } else {
               this.ae.am("Content-Type", -1347557672);
               this.am = null;
            }
         } else {
            this.am = var1;
            if (this.am.ac(-757803973) != null) {
               this.ae.at(this.am.ac(-531653985), (short)3905);
            } else {
               this.ae.au((byte)-90);
            }

         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "al.ae(" + ')');
      }
   }

   boolean ad() throws IOException {
      if (!this.ax) {
         this.ag(-1668929077);
      }

      this.ac.connect();
      return this.ac.getResponseCode() == -1;
   }

   void au() throws ProtocolException {
      if (!this.ax) {
         this.ac.setRequestMethod(this.ag.aq(-1943136517));
         this.ae.ac(this.ac, (byte)-3);
         if (this.ag.af((short)28181) && null != this.am) {
            this.ac.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();

            try {
               var1.write(this.am.ae(-115375452));
               var1.writeTo(this.ac.getOutputStream());
            } catch (IOException var11) {
               var11.printStackTrace();
            } finally {
               try {
                  var1.close();
               } catch (IOException var10) {
                  var10.printStackTrace();
               }

            }
         }

         this.ac.setConnectTimeout(1517185483 * this.af);
         this.ac.setInstanceFollowRedirects(this.aq);
         this.ax = true;
      }
   }

   ay ap() {
      try {
         if (!this.ax || this.ac.getResponseCode() == -1) {
            return new ay("No REST response has been received yet.");
         }
      } catch (IOException var10) {
         this.ac.disconnect();
         return new ay("Error decoding REST response code: " + var10.getMessage());
      }

      ay var3;
      try {
         ay var1 = new ay(this.ac);
         return var1;
      } catch (IOException var8) {
         var3 = new ay("Error decoding REST response: " + var8.getMessage());
      } finally {
         this.ac.disconnect();
      }

      return var3;
   }

   static void jo(int var0, byte var1) {
      try {
         client.ro = 0L;
         if (var0 >= 2) {
            if (var1 == 0) {
               return;
            }

            client.rw = true;
         } else {
            client.rw = false;
         }

         if (dt.jw((byte)11) == 1) {
            ae.be.aq(765, 503, 2124381855);
         } else {
            ae.be.aq(7680, 2160, 163408551);
         }

         if (client.dt * -941305067 >= 25) {
            if (var1 == 0) {
               throw new IllegalStateException();
            }

            if (client.ia != null) {
               if (null == client.ia.ax) {
                  if (var1 == 0) {
                     throw new IllegalStateException();
                  }
               } else {
                  mq var2 = fs.ac(mz.ah, client.ia.ax, (byte)-50);
                  var2.ag.bu(dt.jw((byte)7), (byte)-106);
                  var2.ag.br(-1991951399 * fa.aj, 1625888552);
                  var2.ag.br(en.av * 608173899, 1625888552);
                  client.ia.ag(var2, 1810676977);
               }
            }
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "al.jo(" + ')');
      }
   }
}
