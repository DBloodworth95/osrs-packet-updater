import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

public class fw implements ps {
   static int pr;
   static final fw ae = new fw(1, 1);
   static final fw ag = new fw(2, 2);
   static final fw af = new fw(6, 6);
   static final fw ax = new fw(4, 4);
   static final fw aq = new fw(5, 5);
   static final int ao = 19;
   static final fw at = new fw(7, 7);
   static final fw au = new fw(8, 8);
   final int ar;
   static final fw ac = new fw(0, 0);
   final int al;
   static final fw am = new fw(3, 3);

   public int ag() {
      return -1902373291 * this.al;
   }

   public int ae() {
      return 64151861 * this.al;
   }

   public int ac(int var1) {
      try {
         return 64151861 * this.al;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "fw.ac(" + ')');
      }
   }

   static final void jv(int var0) {
      try {
         Iterator var1 = client.ju.iterator();

         while(var1.hasNext()) {
            if (var0 == 760352263) {
               throw new IllegalStateException();
            }

            dd var2 = (dd)var1.next();

            for(int var3 = 0; var3 < var2.ap * -514517369; ++var3) {
               if (var0 == 760352263) {
                  throw new IllegalStateException();
               }

               int var4 = var2.ab[var3];
               ea var5 = var2.ah[var4];
               if (var5 != null) {
                  if (var0 == 760352263) {
                     throw new IllegalStateException();
                  }

                  qv.jr(var2, var5, -1842011545 * var5.ac.at, (byte)-19);
               }
            }
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "fw.jv(" + ')');
      }
   }

   public int am() {
      return 64151861 * this.al;
   }

   fw(int var1, int var2) {
      try {
         super();
         this.ar = -225876021 * var1;
         this.al = var2 * -1019270883;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "fw.<init>(" + ')');
      }
   }

   static boolean ar(int var0) {
      try {
         Date var1;
         try {
            SimpleDateFormat var3 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
            var3.setLenient(false);
            StringBuilder var4 = new StringBuilder();
            String[] var5 = dp.co;
            int var6 = 0;

            while(true) {
               Date var2;
               if (var6 < var5.length) {
                  String var7 = var5[var6];
                  if (var7 != null) {
                     var4.append(var7);
                     ++var6;
                     continue;
                  }

                  if (var0 == -1810351034) {
                     throw new IllegalStateException();
                  }

                  cw.ao(7, 1496040567);
                  dp.aa("Date not valid.", "Please ensure all characters are populated.", "", (byte)84);
                  var2 = null;
               } else {
                  var4.append("12");
                  var2 = var3.parse(var4.toString());
               }

               var1 = var2;
               break;
            }
         } catch (ParseException var8) {
            cw.ao(7, -187308311);
            dp.aa("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", (byte)66);
            return false;
         }

         if (var1 == null) {
            if (var0 == -1810351034) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            boolean var10 = hq.ad(var1, (byte)-50);
            Date var12 = ke.al(-1738541882);
            boolean var11 = var1.after(var12);
            if (!var11) {
               if (var0 == -1810351034) {
                  throw new IllegalStateException();
               } else {
                  cw.ao(7, 1496769741);
                  dp.aa("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900", (byte)-42);
                  return false;
               }
            } else {
               if (!var10) {
                  dt.ci = 1463919121;
               } else {
                  dt.ci = (int)(var1.getTime() / 86400000L - 11745L) * -1606525457;
               }

               return true;
            }
         }
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "fw.ar(" + ')');
      }
   }
}
