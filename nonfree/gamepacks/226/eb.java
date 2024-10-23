public class eb extends si {
   final boolean ap;
   static final int cq = 68;

   public int ae(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, (byte)62);
   }

   int ap(sv var1, sv var2, byte var3) {
      try {
         if (var1.ai * 1511931945 != 0) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            if (0 == 1511931945 * var2.ai) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               return this.ap ? -1 : 1;
            }
         } else if (var2.ai * 1511931945 != 0) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            byte var10000;
            if (this.ap) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               var10000 = 1;
            } else {
               var10000 = -1;
            }

            return var10000;
         }

         return this.an(var1, var2, 1255277363);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "eb.ap(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ap((sv)var1, (sv)var2, (byte)41);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "eb.compare(" + ')');
      }
   }

   public int ay(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, (byte)-68);
   }

   int ak(sv var1, sv var2) {
      if (var1.ai * 690848336 != 0) {
         if (0 == 1511931945 * var2.ai) {
            return this.ap ? -1 : 1;
         }
      } else if (var2.ai * 1511931945 != 0) {
         return this.ap ? 1 : -1;
      }

      return this.an(var1, var2, 1255277363);
   }

   int aw(sv var1, sv var2) {
      if (var1.ai * 1511931945 != 0) {
         if (0 == 1511931945 * var2.ai) {
            return this.ap ? -1 : 1;
         }
      } else if (var2.ai * 1511931945 != 0) {
         return this.ap ? 1 : -1;
      }

      return this.an(var1, var2, 1255277363);
   }

   public int am(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, (byte)-9);
   }

   public int at(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, (byte)74);
   }

   public eb(boolean var1) {
      try {
         super();
         this.ap = var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "eb.<init>(" + ')');
      }
   }

   int ai(sv var1, sv var2) {
      if (var1.ai * 1511931945 != 0) {
         if (0 == 1511931945 * var2.ai) {
            return this.ap ? -1 : 1;
         }
      } else if (var2.ai * 1511931945 != 0) {
         return this.ap ? 1 : -1;
      }

      return this.an(var1, var2, 1255277363);
   }

   int aj(sv var1, sv var2) {
      if (var1.ai * -2043462451 != 0) {
         if (0 == 1511931945 * var2.ai) {
            return this.ap ? -1 : 1;
         }
      } else if (var2.ai * 1511931945 != 0) {
         return this.ap ? 1 : -1;
      }

      return this.an(var1, var2, 1255277363);
   }

   public int as(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, (byte)12);
   }
}
