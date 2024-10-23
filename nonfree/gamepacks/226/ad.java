import java.applet.Applet;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.Future;
import netscape.javascript.JSObject;

public class ad {
   static int kw;
   Future ap;
   static ue qr;
   String aw;
   public static final int an = 6;
   static final int cr = 45;
   static final int bj = 1076101408;

   void ap(String var1, int var2) {
      try {
         if (null == var1) {
            var1 = "";
         }

         this.aw = var1;
         if (this.ap != null) {
            this.ap.cancel(true);
            this.ap = null;
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ad.ap(" + ')');
      }
   }

   public final String at() {
      return this.aw;
   }

   public final boolean az() {
      return this.ak(-2118597400) ? true : this.ap.isDone();
   }

   public final String aw(short var1) {
      try {
         return this.aw;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ad.aw(" + ')');
      }
   }

   void as(String var1) {
      if (null == var1) {
         var1 = "";
      }

      this.aw = var1;
      if (this.ap != null) {
         this.ap.cancel(true);
         this.ap = null;
      }

   }

   public final av ag() {
      if (this.ak(-2120496985)) {
         return new av(this.aw);
      } else if (!this.aj((byte)57)) {
         return null;
      } else {
         try {
            return (av)this.ap.get();
         } catch (Exception var3) {
            String var2 = "Error retrieving REST request reply";
            System.err.println(var2 + "\r\n" + var3);
            this.ap(var2, -1287508834);
            return new av(var2);
         }
      }
   }

   public final av ai(byte var1) {
      try {
         if (this.ak(-2146234508)) {
            return new av(this.aw);
         } else if (!this.aj((byte)74)) {
            if (var1 <= 4) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            try {
               return (av)this.ap.get();
            } catch (Exception var4) {
               String var3 = "Error retrieving REST request reply";
               System.err.println(var3 + "\r\n" + var4);
               this.ap(var3, 94141695);
               return new av(var3);
            }
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ad.ai(" + ')');
      }
   }

   void ay(String var1) {
      if (null == var1) {
         var1 = "";
      }

      this.aw = var1;
      if (this.ap != null) {
         this.ap.cancel(true);
         this.ap = null;
      }

   }

   public final boolean aj(byte var1) {
      try {
         if (this.ak(-2126519852)) {
            if (var1 == 1) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            return this.ap.isDone();
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ad.aj(" + ')');
      }
   }

   static void oq(String var0, int var1) {
      try {
         fr.cy = var0;

         try {
            String var2 = dd.bl.getParameter(Integer.toString(18));
            String var3 = dd.bl.getParameter(Integer.toString(13));
            String var4 = var2 + "settings=" + var0 + "; version=1; path=/; domain=" + var3;
            String var6;
            if (var0.length() == 0) {
               var4 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
               String var5 = var4 + "; Expires=";
               long var7 = ck.ap(-595060046) + 94608000000L;
               ox.ak.setTime(new Date(var7));
               int var9 = ox.ak.get(7);
               int var10 = ox.ak.get(5);
               int var11 = ox.ak.get(2);
               int var12 = ox.ak.get(1);
               int var13 = ox.ak.get(11);
               int var14 = ox.ak.get(12);
               int var15 = ox.ak.get(13);
               var6 = ox.aw[var9 - 1] + ", " + var10 / 10 + var10 % 10 + "-" + ox.ap[0][var11] + "-" + var12 + " " + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + ":" + var15 / 10 + var15 % 10 + " GMT";
               var4 = var5 + var6 + "; Max-Age=" + 94608000L;
            }

            client var18 = dd.bl;
            var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var18).eval(var6);
         } catch (Throwable var16) {
         }

      } catch (RuntimeException var17) {
         throw tm.aw(var17, "ad.oq(" + ')');
      }
   }

   void am(String var1) {
      if (null == var1) {
         var1 = "";
      }

      this.aw = var1;
      if (this.ap != null) {
         this.ap.cancel(true);
         this.ap = null;
      }

   }

   ad(String var1) {
      try {
         super();
         this.ap(var1, -940088210);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ad.<init>(" + ')');
      }
   }

   ad(Future var1) {
      try {
         super();
         this.ap = var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ad.<init>(" + ')');
      }
   }

   public final String an() {
      return this.aw;
   }

   public final String ao() {
      return this.aw;
   }

   public final String af() {
      return this.aw;
   }

   void ae(String var1) {
      if (null == var1) {
         var1 = "";
      }

      this.aw = var1;
      if (this.ap != null) {
         this.ap.cancel(true);
         this.ap = null;
      }

   }

   public boolean ab() {
      return this.aw != null || null == this.ap;
   }

   public boolean ar() {
      return this.aw != null || null == this.ap;
   }

   public boolean ak(int var1) {
      try {
         boolean var10000;
         if (this.aw == null) {
            if (null != this.ap) {
               var10000 = false;
               return var10000;
            }

            if (var1 >= -2084677377) {
               throw new IllegalStateException();
            }
         }

         var10000 = true;
         return var10000;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ad.ak(" + ')');
      }
   }

   public final av ad() {
      if (this.ak(-2117265489)) {
         return new av(this.aw);
      } else if (!this.aj((byte)-7)) {
         return null;
      } else {
         try {
            return (av)this.ap.get();
         } catch (Exception var3) {
            String var2 = "Error retrieving REST request reply";
            System.err.println(var2 + "\r\n" + var3);
            this.ap(var2, 2113951941);
            return new av(var2);
         }
      }
   }

   static boolean ak(String var0, int var1, String var2, int var3) {
      try {
         if (0 == var1) {
            if (var3 != -1381696483) {
               throw new IllegalStateException();
            } else {
               try {
                  if (!bb.aw.startsWith("win")) {
                     if (var3 != -1381696483) {
                        throw new IllegalStateException();
                     } else {
                        throw new Exception();
                     }
                  } else {
                     if (!var0.startsWith("http://")) {
                        if (var3 != -1381696483) {
                           throw new IllegalStateException();
                        }

                        if (!var0.startsWith("https://")) {
                           if (var3 != -1381696483) {
                              throw new IllegalStateException();
                           }

                           throw new Exception();
                        }
                     }

                     String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

                     for(int var5 = 0; var5 < var0.length(); ++var5) {
                        if (var13.indexOf(var0.charAt(var5)) == -1) {
                           if (var3 != -1381696483) {
                              throw new IllegalStateException();
                           }

                           throw new Exception();
                        }
                     }

                     Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
                     return true;
                  }
               } catch (Throwable var6) {
                  return false;
               }
            }
         } else if (1 == var1) {
            if (var3 != -1381696483) {
               throw new IllegalStateException();
            } else {
               try {
                  Object var12 = bh.aw(bb.ap, var2, new Object[]{(new URL(bb.ap.getCodeBase(), var0)).toString()}, -1596452808);
                  boolean var10000;
                  if (var12 != null) {
                     if (var3 != -1381696483) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  return var10000;
               } catch (Throwable var7) {
                  return false;
               }
            }
         } else if (var1 == 2) {
            if (var3 != -1381696483) {
               throw new IllegalStateException();
            } else {
               try {
                  bb.ap.getAppletContext().showDocument(new URL(bb.ap.getCodeBase(), var0), "_blank");
                  return true;
               } catch (Exception var8) {
                  return false;
               }
            }
         } else if (3 == var1) {
            if (var3 != -1381696483) {
               throw new IllegalStateException();
            } else {
               try {
                  Applet var4 = bb.ap;
                  JSObject.getWindow(var4).call("loggedout", (Object[])null);
               } catch (Throwable var10) {
               }

               try {
                  bb.ap.getAppletContext().showDocument(new URL(bb.ap.getCodeBase(), var0), "_top");
                  return true;
               } catch (Exception var9) {
                  return false;
               }
            }
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var11) {
         throw tm.aw(var11, "ad.ak(" + ')');
      }
   }

   public static oy[] ap(int var0) {
      try {
         return new oy[]{oy.aj, oy.ap, oy.ak, oy.ai, oy.aw, oy.ay};
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ad.ap(" + ')');
      }
   }

   static void gs(me var0, int var1) {
      try {
         var0.ak.ed(bc.fa.bq * -417265355, 16623059);
         var0.ak.bw(-417265355 * rc.fw.bq, (byte)79);
         var0.ak.bw(aw.fl.bq * -417265355, (byte)62);
         var0.ak.ex(dq.fn.bq * -417265355, -2043022909);
         var0.ak.ex(gl.fc.bq * -417265355, -1947760959);
         var0.ak.bw(0, (byte)95);
         var0.ak.bw(hk.fr.bq * -417265355, (byte)122);
         var0.ak.ed(he.fo.bq * -417265355, -988215711);
         var0.ak.ex(aw.fh.bq * -417265355, -2133373552);
         var0.ak.ed(gp.fj.bq * -417265355, -524091616);
         var0.ak.bw(ex.fg.bq * -417265355, (byte)50);
         var0.ak.ep(mb.fm.bq * -417265355, -1738111296);
         var0.ak.ed(-417265355 * if.eo.bq, -1839185823);
         var0.ak.ed(ne.fv.bq * -417265355, -1114269937);
         var0.ak.bw(-417265355 * ir.fu.bq, (byte)105);
         var0.ak.bw(-417265355 * cl.ea.bq, (byte)29);
         var0.ak.ep(pa.fp.bq * -417265355, -1459201936);
         var0.ak.ep(-417265355 * gr.ee.bq, 1441201344);
         var0.ak.bw(ie.fb.bq * -417265355, (byte)17);
         var0.ak.bw(kb.et.bq * -417265355, (byte)85);
         var0.ak.ep(-417265355 * fg.fd.bq, -212502545);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ad.gs(" + ')');
      }
   }

   public final String au() {
      return this.aw;
   }

   public static sw ap(Socket var0, int var1, int var2, int var3) throws IOException {
      try {
         return new sh(var0, var1, var2);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ad.ap(" + ')');
      }
   }
}
