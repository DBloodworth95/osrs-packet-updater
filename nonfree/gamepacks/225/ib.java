import java.io.IOException;
import java.net.URL;
import org.json.JSONObject;

public class ib {
   int ab;
   String ae;
   String ag;
   String am;
   long ax;
   ab aq;
   final int au;
   final int at;
   ao af;
   int ar;
   static final ib aa = new ib();
   String az;
   String ac;
   boolean ai;
   static final int ad = 7;

   public void ae(int var1, String var2, byte var3) {
      try {
         this.ab = var1 * -966956303;
         this.az = var2;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ib.ae(" + ')');
      }
   }

   ib() {
      try {
         super();
         this.ac = "";
         this.ae = "";
         this.ag = "";
         this.am = "";
         this.ax = 4105098798085958367L;
         this.at = 1;
         this.au = 2;
         this.ar = 555186829;
         this.ab = 0;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ib.<init>(" + ')');
      }
   }

   public void ag(boolean var1, byte var2) {
      try {
         this.ai = var1;
         this.aq = new ab("crmsession", 1, 1);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ib.ag(" + ')');
      }
   }

   void am(String var1, String var2, String var3, int var4) {
      try {
         if (this.ar * -476456891 == 2) {
            if (var4 <= 1021105473) {
               throw new IllegalStateException();
            }
         } else {
            this.ac = var1;
            this.ae = var2;
            this.ag = var3;
            if (!this.ac.endsWith("/")) {
               if (var4 <= 1021105473) {
                  throw new IllegalStateException();
               }

               this.ac = this.ac + "/";
            }

            if (!this.ae.equals("")) {
               String var5 = this.ac;
               var5 = var5 + "session/open/" + this.ae;
               if (this.ag.equals("") && var4 <= 1021105473) {
                  throw new IllegalStateException();
               } else {
                  var5 = var5 + "?userHash=" + this.ag;

                  try {
                     this.af = this.ar(var5, 1993081535);
                     this.ax = hf.ac(-1598214665) * -4105098798085958367L;
                  } catch (IOException var7) {
                     this.af = null;
                     this.ae = "";
                     this.ag = "";
                  }

               }
            }
         }
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "ib.am(" + ')');
      }
   }

   public void ax(byte var1) {
      try {
         if (this.af != null) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }
         } else {
            if (!this.am.isEmpty()) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               if (1 == -476456891 * this.ar) {
                  if (var1 >= 0) {
                     return;
                  }

                  long var2 = hf.ac(-1598214665);
                  long var4 = var2 - 1789175676779998945L * this.ax;
                  String var6 = this.ac;
                  var6 = var6 + "session/close/" + this.ae + "/" + this.am;
                  if (this.ag.isEmpty()) {
                     if (var1 >= 0) {
                        throw new IllegalStateException();
                     }

                     var6 = var6 + "?sessionDuration=" + var4;
                  } else {
                     var6 = var6 + "?userHash=" + this.ag + "&sessionDuration=" + var4;
                  }

                  try {
                     this.af = this.ar(var6, 338563285);
                  } catch (IOException var8) {
                     this.ar = 555186829;
                  }
               }
            }

         }
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "ib.ax(" + ')');
      }
   }

   public static ib al() {
      return aa;
   }

   void af(int var1) {
      try {
         if (this.am.isEmpty()) {
            if (var1 >= 1323596015) {
               throw new IllegalStateException();
            }
         } else {
            String var2 = "";
            switch(-1519499759 * this.ab) {
            case 1:
               var2 = "events/click";
               break;
            case 2:
               var2 = "events/dismissed";
               break;
            case 3:
               var2 = "events/impression";
            }

            if (this.az.isEmpty()) {
               if (var1 < 1323596015) {
                  ;
               }
            } else {
               String var3 = this.ac;
               var3 = var3 + var2 + "/" + this.ae + "/" + this.am + "/" + this.az + "?userHash=" + this.ag;

               try {
                  this.af = this.ar(var3, -6369778);
               } catch (IOException var5) {
                  this.ar = 555186829;
               }

               this.ar = 555186829;
               this.ab = 0;
            }
         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ib.af(" + ')');
      }
   }

   public static ib ad() {
      return aa;
   }

   public boolean au(String var1, byte var2) {
      try {
         this.ae(2, var1, (byte)98);
         return true;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ib.au(" + ')');
      }
   }

   ao ar(String var1, int var2) throws IOException {
      try {
         URL var3 = new URL(var1);
         al var4 = new al(var3, ar.ac, this.ai);

         try {
            JSONObject var5 = new JSONObject();
            var4.ae(new tb(var5), 2042743602);
         } catch (Exception var6) {
         }

         return this.aq.ae(var4, (byte)5);
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "ib.ar(" + ')');
      }
   }

   public void az(boolean var1) {
      this.ai = var1;
      this.aq = new ab("crmsession", 1, 1);
   }

   public static boolean ag(long var0) {
      try {
         boolean var2 = 0L != var0;
         if (var2) {
            boolean var3 = 1 == (int)(var0 >>> 16 & 1L);
            var2 = !var3;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ib.ag(" + ')');
      }
   }

   public static ib ah() {
      return aa;
   }

   public boolean bm(String var1) {
      this.ae(2, var1, (byte)79);
      return true;
   }

   void ao(String var1, String var2, String var3) {
      if (this.ar * -1116622381 != 2) {
         this.ac = var1;
         this.ae = var2;
         this.ag = var3;
         if (!this.ac.endsWith("/")) {
            this.ac = this.ac + "/";
         }

         if (!this.ae.equals("")) {
            String var4 = this.ac;
            var4 = var4 + "session/open/" + this.ae;
            if (this.ag.equals("")) {
            }

            var4 = var4 + "?userHash=" + this.ag;

            try {
               this.af = this.ar(var4, -820429767);
               this.ax = hf.ac(-1598214665) * -4105098798085958367L;
            } catch (IOException var6) {
               this.af = null;
               this.ae = "";
               this.ag = "";
            }

         }
      }
   }

   void as(String var1, String var2, String var3) {
      if (this.ar * -476456891 != 2) {
         this.ac = var1;
         this.ae = var2;
         this.ag = var3;
         if (!this.ac.endsWith("/")) {
            this.ac = this.ac + "/";
         }

         if (!this.ae.equals("")) {
            String var4 = this.ac;
            var4 = var4 + "session/open/" + this.ae;
            if (this.ag.equals("")) {
            }

            var4 = var4 + "?userHash=" + this.ag;

            try {
               this.af = this.ar(var4, 1967868537);
               this.ax = hf.ac(-1598214665) * -4105098798085958367L;
            } catch (IOException var6) {
               this.af = null;
               this.ae = "";
               this.ag = "";
            }

         }
      }
   }

   public boolean bf(String var1) {
      this.ae(2, var1, (byte)126);
      return true;
   }

   public void ai(boolean var1) {
      this.ai = var1;
      this.aq = new ab("crmsession", 1, 1);
   }

   public void ab(int var1, String var2) {
      this.ab = var1 * -966956303;
      this.az = var2;
   }

   public void aq(byte var1) {
      try {
         if (this.aq != null) {
            this.aq.ag(-1462499783);
         }

      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ib.aq(" + ')');
      }
   }

   public void ay() {
      if (this.af == null) {
         if (!this.am.isEmpty() && 1 == -476456891 * this.ar) {
            long var1 = hf.ac(-1598214665);
            long var3 = var1 - 1789175676779998945L * this.ax;
            String var5 = this.ac;
            var5 = var5 + "session/close/" + this.ae + "/" + this.am;
            if (this.ag.isEmpty()) {
               var5 = var5 + "?sessionDuration=" + var3;
            } else {
               var5 = var5 + "?userHash=" + this.ag + "&sessionDuration=" + var3;
            }

            try {
               this.af = this.ar(var5, 1557247395);
            } catch (IOException var7) {
               this.ar = 555186829;
            }
         }

      }
   }

   public void aj() {
      if (this.af == null) {
         if (!this.am.isEmpty() && 1 == -476456891 * this.ar) {
            long var1 = hf.ac(-1598214665);
            long var3 = var1 - 1789175676779998945L * this.ax;
            String var5 = this.ac;
            var5 = var5 + "session/close/" + this.ae + "/" + this.am;
            if (this.ag.isEmpty()) {
               var5 = var5 + "?sessionDuration=" + var3;
            } else {
               var5 = var5 + "?userHash=" + this.ag + "&sessionDuration=" + var3;
            }

            try {
               this.af = this.ar(var5, 1080389447);
            } catch (IOException var7) {
               this.ar = 555186829;
            }
         }

      }
   }

   public void av() {
      if (this.aq != null) {
         this.aq.ag(-1658798309);
      }

   }

   public void aw() {
      if (this.aq != null) {
         this.aq.ag(-1841174821);
      }

   }

   public void an() {
      if (this.aq != null) {
         this.aq.ag(-1591569560);
      }

   }

   public void ak() {
      if (this.aq != null) {
         this.aq.ag(-1778917770);
      }

   }

   public void bn() {
      if (this.aq != null) {
         this.aq.ag(-1770098040);
      }

   }

   void bh() {
      if (!this.am.isEmpty()) {
         String var1 = "";
         switch(287991135 * this.ab) {
         case 1:
            var1 = "events/click";
            break;
         case 2:
            var1 = "events/dismissed";
            break;
         case 3:
            var1 = "events/impression";
         }

         if (!this.az.isEmpty()) {
            String var2 = this.ac;
            var2 = var2 + var1 + "/" + this.ae + "/" + this.am + "/" + this.az + "?userHash=" + this.ag;

            try {
               this.af = this.ar(var2, 349305984);
            } catch (IOException var4) {
               this.ar = 555186829;
            }

            this.ar = 555186829;
            this.ab = 0;
         }
      }
   }

   public void bd() {
      if (this.af != null && this.af.am(-1822336398)) {
         if (this.af.am(-1448103455) && this.af.ax(1382662795).ac(203534834) == 200 && this.am.isEmpty()) {
            String var1 = this.af.ax(-408907460).ag(-1727143762);
            if (var1.isEmpty()) {
               return;
            }

            this.am = var1;
         }

         if (0 != this.ab * -28940394) {
            this.af(1243810314);
         }

      }
   }

   public void bx() {
      if (this.af != null && this.af.am(-1101985151)) {
         if (this.af.am(-1358872686) && this.af.ax(-488434422).ac(499420438) == 200 && this.am.isEmpty()) {
            String var1 = this.af.ax(310377859).ag(-1881958275);
            if (var1.isEmpty()) {
               return;
            }

            this.am = var1;
         }

         if (0 != this.ab * -1519499759) {
            this.af(775752573);
         }

      }
   }

   public void aa(boolean var1) {
      this.ai = var1;
      this.aq = new ab("crmsession", 1, 1);
   }

   public void at(byte var1) {
      try {
         if (this.af != null) {
            if (var1 <= 20) {
               return;
            }

            if (this.af.am(-1587096220)) {
               if (this.af.am(-1349919637)) {
                  if (var1 <= 20) {
                     throw new IllegalStateException();
                  }

                  if (this.af.ax(1885249680).ac(677299435) == 200) {
                     if (var1 <= 20) {
                        throw new IllegalStateException();
                     }

                     if (this.am.isEmpty()) {
                        if (var1 <= 20) {
                           throw new IllegalStateException();
                        }

                        String var2 = this.af.ax(4172336).ag(-1828351271);
                        if (var2.isEmpty()) {
                           if (var1 <= 20) {
                              return;
                           }

                           return;
                        }

                        this.am = var2;
                     }
                  }
               }

               if (0 != this.ab * -1519499759) {
                  if (var1 <= 20) {
                     throw new IllegalStateException();
                  }

                  this.af(755244946);
               }

               return;
            }

            if (var1 <= 20) {
               return;
            }
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ib.at(" + ')');
      }
   }

   ao bs(String var1) throws IOException {
      URL var2 = new URL(var1);
      al var3 = new al(var2, ar.ac, this.ai);

      try {
         JSONObject var4 = new JSONObject();
         var3.ae(new tb(var4), -392843603);
      } catch (Exception var5) {
      }

      return this.aq.ae(var3, (byte)5);
   }

   ao bw(String var1) throws IOException {
      URL var2 = new URL(var1);
      al var3 = new al(var2, ar.ac, this.ai);

      try {
         JSONObject var4 = new JSONObject();
         var3.ae(new tb(var4), 1993978765);
      } catch (Exception var5) {
      }

      return this.aq.ae(var3, (byte)5);
   }

   ao ba(String var1) throws IOException {
      URL var2 = new URL(var1);
      al var3 = new al(var2, ar.ac, this.ai);

      try {
         JSONObject var4 = new JSONObject();
         var3.ae(new tb(var4), -1520201784);
      } catch (Exception var5) {
      }

      return this.aq.ae(var3, (byte)5);
   }

   public void ap(int var1, String var2) {
      this.ab = var1 * -966956303;
      this.az = var2;
   }
}
