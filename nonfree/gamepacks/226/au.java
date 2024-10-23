import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class au {
   static final String hf = "JX_CHARACTER_ID";
   final rl aw;
   final at ak;
   static ng[] pz;
   tg aj;
   boolean ay;
   int as;
   boolean ai;
   final HttpsURLConnection ap;
   static final String ha = "shield/oauth/token";
   static final int ab = 18;

   public au(URL var1, at var2, boolean var3) throws IOException {
      try {
         this(var1, var2, new rl(), var3);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "au.<init>(" + ')');
      }
   }

   void af() throws ProtocolException {
      if (!this.ai) {
         this.ap.setRequestMethod(this.ak.ak((short)4007));
         this.aw.ap(this.ap, -44354789);
         if (this.ak.aj(-857189261) && this.aj != null) {
            this.ap.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();

            try {
               var1.write(this.aj.aw((byte)14));
               var1.writeTo(this.ap.getOutputStream());
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

         this.ap.setConnectTimeout(this.as * -65348313);
         this.ap.setInstanceFollowRedirects(this.ay);
         this.ai = true;
      }
   }

   public rl ap(int var1) {
      try {
         return this.aw;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "au.ap(" + ')');
      }
   }

   public void aw(tg var1, byte var2) {
      try {
         if (this.ai) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }
         } else if (var1 == null) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            } else {
               this.aw.aj("Content-Type", -1129403788);
               this.aj = null;
            }
         } else {
            this.aj = var1;
            if (this.aj.ap(1116588540) != null) {
               if (var2 >= 1) {
                  throw new IllegalStateException();
               }

               this.aw.ae(this.aj.ap(1116588540), -1056588868);
            } else {
               this.aw.am(-1619689195);
            }

         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "au.aw(" + ')');
      }
   }

   public void ao(tg var1) {
      if (!this.ai) {
         if (var1 == null) {
            this.aw.aj("Content-Type", -1129403788);
            this.aj = null;
         } else {
            this.aj = var1;
            if (this.aj.ap(1116588540) != null) {
               this.aw.ae(this.aj.ap(1116588540), -595502778);
            } else {
               this.aw.am(-94079775);
            }

         }
      }
   }

   boolean aj(int var1) throws IOException {
      try {
         if (!this.ai) {
            this.ak(769257561);
         }

         this.ap.connect();
         boolean var10000;
         if (this.ap.getResponseCode() == -1) {
            if (var1 != 2007396320) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "au.aj(" + ')');
      }
   }

   av ai(byte var1) {
      try {
         try {
            label70: {
               if (this.ai) {
                  if (var1 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (this.ap.getResponseCode() != -1) {
                     break label70;
                  }
               }

               return new av("No REST response has been received yet.");
            }
         } catch (IOException var12) {
            this.ap.disconnect();
            return new av("Error decoding REST response code: " + var12.getMessage());
         }

         av var4;
         try {
            av var2 = new av(this.ap);
            return var2;
         } catch (IOException var10) {
            var4 = new av("Error decoding REST response: " + var10.getMessage());
         } finally {
            this.ap.disconnect();
         }

         return var4;
      } catch (RuntimeException var13) {
         throw tm.aw(var13, "au.ai(" + ')');
      }
   }

   public rl ay() {
      return this.aw;
   }

   public rl as() {
      return this.aw;
   }

   public void at(tg var1) {
      if (!this.ai) {
         if (var1 == null) {
            this.aw.aj("Content-Type", -1129403788);
            this.aj = null;
         } else {
            this.aj = var1;
            if (this.aj.ap(1116588540) != null) {
               this.aw.ae(this.aj.ap(1116588540), 697837854);
            } else {
               this.aw.am(-566477472);
            }

         }
      }
   }

   public void am(tg var1) {
      if (!this.ai) {
         if (var1 == null) {
            this.aw.aj("Content-Type", -1129403788);
            this.aj = null;
         } else {
            this.aj = var1;
            if (this.aj.ap(1116588540) != null) {
               this.aw.ae(this.aj.ap(1116588540), -1745903298);
            } else {
               this.aw.am(107490955);
            }

         }
      }
   }

   public rl ae() {
      return this.aw;
   }

   public void au(tg var1) {
      if (!this.ai) {
         if (var1 == null) {
            this.aw.aj("Content-Type", -1129403788);
            this.aj = null;
         } else {
            this.aj = var1;
            if (this.aj.ap(1116588540) != null) {
               this.aw.ae(this.aj.ap(1116588540), 200849140);
            } else {
               this.aw.am(-743633651);
            }

         }
      }
   }

   public void an(tg var1) {
      if (!this.ai) {
         if (var1 == null) {
            this.aw.aj("Content-Type", -1129403788);
            this.aj = null;
         } else {
            this.aj = var1;
            if (this.aj.ap(1116588540) != null) {
               this.aw.ae(this.aj.ap(1116588540), -523123735);
            } else {
               this.aw.am(-1464791433);
            }

         }
      }
   }

   public au(URL var1, at var2, rl var3, boolean var4) throws IOException {
      try {
         super();
         this.ai = false;
         this.ay = false;
         this.as = 1745652832;
         if (!var2.ap(-1934732865)) {
            throw new UnsupportedEncodingException("Unsupported request method used " + var2.ak((short)4007));
         } else {
            this.ap = (HttpsURLConnection)var1.openConnection();
            if (!var4) {
               HttpsURLConnection var5 = this.ap;
               if (ab.aw == null) {
                  ab.aw = new ab();
               }

               ab var6 = ab.aw;
               var5.setSSLSocketFactory(var6);
            }

            this.ak = var2;
            this.aw = var3 != null ? var3 : new rl();
         }
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "au.<init>(" + ')');
      }
   }

   boolean az() throws IOException {
      if (!this.ai) {
         this.ak(1361145629);
      }

      this.ap.connect();
      return this.ap.getResponseCode() == -1;
   }

   void ar() throws ProtocolException {
      if (!this.ai) {
         this.ap.setRequestMethod(this.ak.ak((short)4007));
         this.aw.ap(this.ap, -2125481623);
         if (this.ak.aj(695740273) && this.aj != null) {
            this.ap.setDoOutput(true);
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();

            try {
               var1.write(this.aj.aw((byte)64));
               var1.writeTo(this.ap.getOutputStream());
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

         this.ap.setConnectTimeout(this.as * 398957973);
         this.ap.setInstanceFollowRedirects(this.ay);
         this.ai = true;
      }
   }

   boolean ab() throws IOException {
      if (!this.ai) {
         this.ak(586425902);
      }

      this.ap.connect();
      return this.ap.getResponseCode() == -1;
   }

   boolean ad() throws IOException {
      if (!this.ai) {
         this.ak(745278870);
      }

      this.ap.connect();
      return this.ap.getResponseCode() == -1;
   }

   boolean ag() throws IOException {
      if (!this.ai) {
         this.ak(155645049);
      }

      this.ap.connect();
      return this.ap.getResponseCode() == -1;
   }

   void ak(int var1) throws ProtocolException {
      try {
         if (this.ai) {
            if (var1 <= -612098975) {
               throw new IllegalStateException();
            }
         } else {
            this.ap.setRequestMethod(this.ak.ak((short)4007));
            this.aw.ap(this.ap, -1882659798);
            if (this.ak.aj(-1313325334)) {
               if (var1 <= -612098975) {
                  throw new IllegalStateException();
               }

               if (this.aj != null) {
                  this.ap.setDoOutput(true);
                  ByteArrayOutputStream var2 = new ByteArrayOutputStream();

                  try {
                     var2.write(this.aj.aw((byte)60));
                     var2.writeTo(this.ap.getOutputStream());
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
            }

            this.ap.setConnectTimeout(this.as * 398957973);
            this.ap.setInstanceFollowRedirects(this.ay);
            this.ai = true;
         }
      } catch (RuntimeException var15) {
         throw tm.aw(var15, "au.ak(" + ')');
      }
   }

   av ac() {
      try {
         if (!this.ai || this.ap.getResponseCode() == -1) {
            return new av("No REST response has been received yet.");
         }
      } catch (IOException var10) {
         this.ap.disconnect();
         return new av("Error decoding REST response code: " + var10.getMessage());
      }

      av var3;
      try {
         av var1 = new av(this.ap);
         return var1;
      } catch (IOException var8) {
         var3 = new av("Error decoding REST response: " + var8.getMessage());
      } finally {
         this.ap.disconnect();
      }

      return var3;
   }

   av av() {
      try {
         if (!this.ai || this.ap.getResponseCode() == -1) {
            return new av("No REST response has been received yet.");
         }
      } catch (IOException var10) {
         this.ap.disconnect();
         return new av("Error decoding REST response code: " + var10.getMessage());
      }

      av var3;
      try {
         av var1 = new av(this.ap);
         return var1;
      } catch (IOException var8) {
         var3 = new av("Error decoding REST response: " + var8.getMessage());
      } finally {
         this.ap.disconnect();
      }

      return var3;
   }
}
