public class ht extends tp {
   static mi ap = new mi(64);
   public static final String kg = "DD/MM/YYYY and is after 01/01/1900";
   public static short[][] an;
   static qi af;

   ht() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ht.<init>(" + ')');
      }
   }

   public static void aw() {
      ap.aj();
   }

   public static void ak() {
      ap.aj();
   }

   public static String aw(long var0) {
      try {
         if (var0 > 0L && var0 < 6582952005840035281L) {
            if (0L == var0 % 37L) {
               return null;
            } else {
               int var2 = 0;

               for(long var3 = var0; var3 != 0L; var3 /= 37L) {
                  ++var2;
               }

               StringBuilder var5 = new StringBuilder(var2);

               while(0L != var0) {
                  long var6 = var0;
                  var0 /= 37L;
                  var5.append(qo.ap[(int)(var6 - 37L * var0)]);
               }

               return var5.reverse().toString();
            }
         } else {
            return null;
         }
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "ht.aw(" + ')');
      }
   }

   public static void aj() {
      ap.aj();
   }

   static ja ao(int var0, byte var1) {
      try {
         ja var2 = (ja)iu.am.ap((long)var0);
         if (null != var2) {
            if (var1 != 2) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            var2 = qb.ap(id.ay, id.as, var0, false, -1873063381);
            if (null != var2) {
               if (var1 != 2) {
                  throw new IllegalStateException();
               }

               iu.am.ak(var2, (long)var0);
            }

            return var2;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ht.ao(" + ')');
      }
   }

   public static void ai() {
      ap.aj();
   }
}
