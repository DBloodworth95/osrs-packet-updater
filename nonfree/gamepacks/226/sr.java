public class sr extends se {
   int ap;
   static short[] wl;

   public int at(se var1) {
      return this.ap((sr)((sr)var1), (byte)124);
   }

   static String of(ng var0, int var1, short var2) {
      try {
         if (!tk.ap(gr.oa(var0, 1490307430), var1, -1695241558)) {
            if (var2 >= 8211) {
               throw new IllegalStateException();
            }

            if (null == var0.ft) {
               if (var2 >= 8211) {
                  throw new IllegalStateException();
               }

               return null;
            }
         }

         if (null != var0.ej && var0.ej.length > var1) {
            if (var2 >= 8211) {
               throw new IllegalStateException();
            }

            if (var0.ej[var1] != null) {
               if (var2 >= 8211) {
                  throw new IllegalStateException();
               }

               if (var0.ej[var1].trim().length() != 0) {
                  return var0.ej[var1];
               }

               if (var2 >= 8211) {
                  throw new IllegalStateException();
               }
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "sr.of(" + ')');
      }
   }

   public int aw(se var1, short var2) {
      try {
         return this.ap((sr)((sr)var1), (byte)120);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "sr.aw(" + ')');
      }
   }

   public int compareTo(Object var1) {
      try {
         return this.ap((sr)((sr)var1), (byte)62);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "sr.compareTo(" + ')');
      }
   }

   int ak(sr var1) {
      return this.ap * 1626478363 - var1.ap * 1626478363;
   }

   public int ae(se var1) {
      return this.ap((sr)((sr)var1), (byte)61);
   }

   int ap(sr var1, byte var2) {
      try {
         return this.ap * 1626478363 - var1.ap * 1626478363;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "sr.ap(" + ')');
      }
   }

   public int ay(Object var1) {
      return this.ap((sr)((sr)var1), (byte)65);
   }

   sr() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "sr.<init>(" + ')');
      }
   }

   int aj(sr var1) {
      return this.ap * 480956677 - var1.ap * -1521246998;
   }

   public int am(se var1) {
      return this.ap((sr)((sr)var1), (byte)104);
   }

   public static void ap(dt var0, int var1) {
      try {
         ca.aw(var0, 500000, 475000, -2113529759);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "sr.ap(" + ')');
      }
   }
}
