import java.io.IOException;
import java.net.URL;
import org.json.JSONObject;

public class it {
   String ak;
   String aw;
   int at;
   String aj;
   long ai;
   static final int au = 0;
   ad as;
   ar ay;
   final int am;
   String ap;
   String ab;
   int ar;
   final int ae;
   static final it az = new it();
   boolean ag;
   public static final int av = 3;

   public void ab(int var1, String var2) {
      this.ar = var1 * -576465351;
      this.ab = var2;
   }

   public void aw(int var1, String var2, byte var3) {
      try {
         this.ar = var1 * -576465351;
         this.ab = var2;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "it.aw(" + ')');
      }
   }

   void ad(String var1, String var2, String var3) {
      if (2 != 251311377 * this.at) {
         this.ap = var1;
         this.aw = var2;
         this.ak = var3;
         if (!this.ap.endsWith("/")) {
            this.ap = this.ap + "/";
         }

         if (!this.aw.equals("")) {
            String var4 = this.ap;
            var4 = var4 + "session/open/" + this.aw;
            if (this.ak.equals("")) {
            }

            var4 = var4 + "?userHash=" + this.ak;

            try {
               this.as = this.at(var4, 89908203);
               this.ai = ck.ap(-1271829024) * 4803948777144796413L;
            } catch (IOException var6) {
               this.as = null;
               this.aw = "";
               this.ak = "";
            }

         }
      }
   }

   void aj(String var1, String var2, String var3, int var4) {
      try {
         if (2 != 251311377 * this.at) {
            this.ap = var1;
            this.aw = var2;
            this.ak = var3;
            if (!this.ap.endsWith("/")) {
               if (var4 == -961759120) {
                  return;
               }

               this.ap = this.ap + "/";
            }

            if (this.aw.equals("")) {
               if (var4 == -961759120) {
                  throw new IllegalStateException();
               }
            } else {
               String var5 = this.ap;
               var5 = var5 + "session/open/" + this.aw;
               if (this.ak.equals("") && var4 == -961759120) {
                  throw new IllegalStateException();
               } else {
                  var5 = var5 + "?userHash=" + this.ak;

                  try {
                     this.as = this.at(var5, 138502365);
                     this.ai = ck.ap(-641614475) * 4803948777144796413L;
                  } catch (IOException var7) {
                     this.as = null;
                     this.aw = "";
                     this.ak = "";
                  }

               }
            }
         }
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "it.aj(" + ')');
      }
   }

   void ac(String var1, String var2, String var3) {
      if (2 != 251311377 * this.at) {
         this.ap = var1;
         this.aw = var2;
         this.ak = var3;
         if (!this.ap.endsWith("/")) {
            this.ap = this.ap + "/";
         }

         if (!this.aw.equals("")) {
            String var4 = this.ap;
            var4 = var4 + "session/open/" + this.aw;
            if (this.ak.equals("")) {
            }

            var4 = var4 + "?userHash=" + this.ak;

            try {
               this.as = this.at(var4, -542189817);
               this.ai = ck.ap(-1562124126) * 4803948777144796413L;
            } catch (IOException var6) {
               this.as = null;
               this.aw = "";
               this.ak = "";
            }

         }
      }
   }

   public void ay(int var1) {
      try {
         if (null != this.ay) {
            this.ay.ak(715259532);
         }

      } catch (RuntimeException var2) {
         throw tm.aw(var2, "it.ay(" + ')');
      }
   }

   public void aq() {
      if (null != this.ay) {
         this.ay.ak(715259532);
      }

   }

   public void ae(byte var1) {
      try {
         if (this.as != null) {
            if (var1 != 2) {
               throw new IllegalStateException();
            }

            if (this.as.aj((byte)42)) {
               if (this.as.aj((byte)14)) {
                  if (var1 != 2) {
                     throw new IllegalStateException();
                  }

                  if (this.as.ai((byte)86).ap(1003580978) == 200) {
                     if (var1 != 2) {
                        throw new IllegalStateException();
                     }

                     if (this.aj.isEmpty()) {
                        if (var1 != 2) {
                           throw new IllegalStateException();
                        }

                        String var2 = this.as.ai((byte)68).aj((byte)-102);
                        if (var2.isEmpty()) {
                           if (var1 != 2) {
                              return;
                           }

                           return;
                        }

                        this.aj = var2;
                     }
                  }
               }

               if (this.ar * -1989593079 != 0) {
                  this.as(1931360034);
               }

               return;
            }
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "it.ae(" + ')');
      }
   }

   public boolean am(String var1, int var2) {
      try {
         this.aw(2, var1, (byte)-3);
         return true;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "it.am(" + ')');
      }
   }

   ad at(String var1, int var2) throws IOException {
      try {
         URL var3 = new URL(var1);
         au var4 = new au(var3, at.ap, this.ag);

         try {
            JSONObject var5 = new JSONObject();
            var4.aw(new ts(var5), (byte)-119);
         } catch (Exception var6) {
         }

         return this.ay.aw(var4, (byte)-41);
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "it.at(" + ')');
      }
   }

   public static it au() {
      return az;
   }

   public static it an() {
      return az;
   }

   public void ai(int var1) {
      try {
         if (null != this.as) {
            if (var1 >= -800864489) {
               throw new IllegalStateException();
            }
         } else {
            if (!this.aj.isEmpty()) {
               if (var1 >= -800864489) {
                  return;
               }

               if (this.at * 251311377 == 1) {
                  if (var1 >= -800864489) {
                     throw new IllegalStateException();
                  }

                  long var2 = ck.ap(-1678956367);
                  long var4 = var2 - -2107600156133558187L * this.ai;
                  String var6 = this.ap;
                  var6 = var6 + "session/close/" + this.aw + "/" + this.aj;
                  if (this.ak.isEmpty()) {
                     if (var1 >= -800864489) {
                        throw new IllegalStateException();
                     }

                     var6 = var6 + "?sessionDuration=" + var4;
                  } else {
                     var6 = var6 + "?userHash=" + this.ak + "&sessionDuration=" + var4;
                  }

                  try {
                     this.as = this.at(var6, -823744555);
                  } catch (IOException var8) {
                     this.at = -2085168143;
                  }
               }
            }

         }
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "it.ai(" + ')');
      }
   }

   public void af(int var1, String var2) {
      this.ar = var1 * 415823790;
      this.ab = var2;
   }

   public void ar(int var1, String var2) {
      this.ar = var1 * -576465351;
      this.ab = var2;
   }

   ad bk(String var1) throws IOException {
      URL var2 = new URL(var1);
      au var3 = new au(var2, at.ap, this.ag);

      try {
         JSONObject var4 = new JSONObject();
         var3.aw(new ts(var4), (byte)-65);
      } catch (Exception var5) {
      }

      return this.ay.aw(var3, (byte)-11);
   }

   public void az(boolean var1) {
      this.ag = var1;
      this.ay = new ar("crmsession", 1, 1);
   }

   void ag(String var1, String var2, String var3) {
      if (2 != 251311377 * this.at) {
         this.ap = var1;
         this.aw = var2;
         this.ak = var3;
         if (!this.ap.endsWith("/")) {
            this.ap = this.ap + "/";
         }

         if (!this.aw.equals("")) {
            String var4 = this.ap;
            var4 = var4 + "session/open/" + this.aw;
            if (this.ak.equals("")) {
            }

            var4 = var4 + "?userHash=" + this.ak;

            try {
               this.as = this.at(var4, 1358318302);
               this.ai = ck.ap(-1087031583) * 4803948777144796413L;
            } catch (IOException var6) {
               this.as = null;
               this.aw = "";
               this.ak = "";
            }

         }
      }
   }

   public void ao(int var1, String var2) {
      this.ar = var1 * -576465351;
      this.ab = var2;
   }

   public boolean bx(String var1) {
      this.aw(2, var1, (byte)-29);
      return true;
   }

   public void av() {
      if (null != this.ay) {
         this.ay.ak(715259532);
      }

   }

   public void ax() {
      if (null != this.ay) {
         this.ay.ak(715259532);
      }

   }

   void as(int var1) {
      try {
         if (this.aj.isEmpty()) {
            if (var1 <= -1673705288) {
               throw new IllegalStateException();
            }
         } else {
            String var2 = "";
            switch(this.ar * -1989593079) {
            case 1:
               var2 = "events/click";
               break;
            case 2:
               var2 = "events/dismissed";
               break;
            case 3:
               var2 = "events/impression";
            }

            if (this.ab.isEmpty()) {
               if (var1 <= -1673705288) {
                  throw new IllegalStateException();
               }
            } else {
               String var3 = this.ap;
               var3 = var3 + var2 + "/" + this.aw + "/" + this.aj + "/" + this.ab + "?userHash=" + this.ak;

               try {
                  this.as = this.at(var3, -100585374);
               } catch (IOException var5) {
                  this.at = -2085168143;
               }

               this.at = -2085168143;
               this.ar = 0;
            }
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "it.as(" + ')');
      }
   }

   void al() {
      if (!this.aj.isEmpty()) {
         String var1 = "";
         switch(this.ar * -1989593079) {
         case 1:
            var1 = "events/click";
            break;
         case 2:
            var1 = "events/dismissed";
            break;
         case 3:
            var1 = "events/impression";
         }

         if (!this.ab.isEmpty()) {
            String var2 = this.ap;
            var2 = var2 + var1 + "/" + this.aw + "/" + this.aj + "/" + this.ab + "?userHash=" + this.ak;

            try {
               this.as = this.at(var2, 699809069);
            } catch (IOException var4) {
               this.at = -2085168143;
            }

            this.at = -2085168143;
            this.ar = 0;
         }
      }
   }

   void aa() {
      if (!this.aj.isEmpty()) {
         String var1 = "";
         switch(this.ar * -1989593079) {
         case 1:
            var1 = "events/click";
            break;
         case 2:
            var1 = "events/dismissed";
            break;
         case 3:
            var1 = "events/impression";
         }

         if (!this.ab.isEmpty()) {
            String var2 = this.ap;
            var2 = var2 + var1 + "/" + this.aw + "/" + this.aj + "/" + this.ab + "?userHash=" + this.ak;

            try {
               this.as = this.at(var2, 1169245063);
            } catch (IOException var4) {
               this.at = -2085168143;
            }

            this.at = -2085168143;
            this.ar = 0;
         }
      }
   }

   public void ah() {
      if (this.as != null && this.as.aj((byte)22)) {
         if (this.as.aj((byte)47) && this.as.ai((byte)112).ap(1345343528) == 335264101 && this.aj.isEmpty()) {
            String var1 = this.as.ai((byte)28).aj((byte)-82);
            if (var1.isEmpty()) {
               return;
            }

            this.aj = var1;
         }

         if (this.ar * -1989593079 != 0) {
            this.as(754529525);
         }

      }
   }

   public void bh() {
      if (this.as != null && this.as.aj((byte)-80)) {
         if (this.as.aj((byte)-103) && this.as.ai((byte)109).ap(-1550508356) == 200 && this.aj.isEmpty()) {
            String var1 = this.as.ai((byte)68).aj((byte)-127);
            if (var1.isEmpty()) {
               return;
            }

            this.aj = var1;
         }

         if (this.ar * -1989593079 != 0) {
            this.as(-134864579);
         }

      }
   }

   public boolean bj(String var1) {
      this.aw(2, var1, (byte)-123);
      return true;
   }

   public boolean bv(String var1) {
      this.aw(2, var1, (byte)-51);
      return true;
   }

   public void ak(boolean var1, int var2) {
      try {
         this.ag = var1;
         this.ay = new ar("crmsession", 1, 1);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "it.ak(" + ')');
      }
   }

   it() {
      try {
         super();
         this.ap = "";
         this.aw = "";
         this.ak = "";
         this.aj = "";
         this.ai = -4803948777144796413L;
         this.ae = 1;
         this.am = 2;
         this.at = -2085168143;
         this.ar = 0;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "it.<init>(" + ')');
      }
   }
}
