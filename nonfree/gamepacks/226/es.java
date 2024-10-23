public class es extends si {
   public static final int ah = 256;
   public static final int an = 10;
   static final int nu = 2000;
   final boolean ap;

   public int ay(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, -1726995287);
   }

   public es(boolean var1) {
      try {
         super();
         this.ap = var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "es.<init>(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ap((sv)var1, (sv)var2, 2088667477);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "es.compare(" + ')');
      }
   }

   public int am(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, -1875876603);
   }

   public int as(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, -1131468035);
   }

   public int ae(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, 1905758861);
   }

   int aw(sv var1, sv var2) {
      if (1511931945 * var1.ai != var2.ai * 292827445) {
         return this.ap ? -390473214 * var1.ai - 802989057 * var2.ai : 1315718614 * var2.ai - var1.ai * 1728413628;
      } else {
         return this.an(var1, var2, 1255277363);
      }
   }

   public int at(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, -446946740);
   }

   int ap(sv var1, sv var2, int var3) {
      try {
         if (1511931945 * var1.ai != var2.ai * 1511931945) {
            if (var3 == -1162504711) {
               throw new IllegalStateException();
            } else {
               int var10000;
               if (this.ap) {
                  if (var3 == -1162504711) {
                     throw new IllegalStateException();
                  }

                  var10000 = 1511931945 * var1.ai - 1511931945 * var2.ai;
               } else {
                  var10000 = 1511931945 * var2.ai - var1.ai * 1511931945;
               }

               return var10000;
            }
         } else {
            return this.an(var1, var2, 1255277363);
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "es.ap(" + ')');
      }
   }

   public static void aw(int var0) {
      try {
         hz.ap.aj();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "es.aw(" + ')');
      }
   }

   static void jr(int var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         pu var6 = nq.jn.ad[var0][var1][var2];
         if (var6 != null) {
            for(ec var7 = (ec)var6.as(); null != var7; var7 = (ec)var6.am()) {
               if (var5 != 2040296208) {
                  throw new IllegalStateException();
               }

               if (1119456901 * var7.ap == (var3 & 32767)) {
                  if (var5 != 2040296208) {
                     throw new IllegalStateException();
                  }

                  var7.ap(var4, 35877037);
                  break;
               }
            }
         }

      } catch (RuntimeException var8) {
         throw tm.aw(var8, "es.jr(" + ')');
      }
   }
}
