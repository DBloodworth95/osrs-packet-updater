public class at implements ph {
   static final int ab = 16;
   static final at ai = new at(4, "DELETE", false, true);
   public static final at ap = new at(0, "POST", true, true);
   static final at aj = new at(3, "PATCH", false, true);
   static final at ak = new at(2, "PUT", false, true);
   public static final at aw = new at(1, "GET", true, false);
   String as;
   boolean ae;
   boolean am;
   static int ur;
   int ay;
   static vv ky;

   public String an() {
      return this.as;
   }

   boolean at() {
      return this.ae;
   }

   public String ak(short var1) {
      try {
         return this.as;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "at.ak(" + ')');
      }
   }

   boolean ap(int var1) {
      try {
         return this.ae;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "at.ap(" + ')');
      }
   }

   public int aw(int var1) {
      try {
         return this.ay * -1041997149;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "at.aw(" + ')');
      }
   }

   public String au() {
      return this.as;
   }

   public int as() {
      return this.ay * -1041997149;
   }

   boolean ai() {
      return this.ae;
   }

   boolean ae() {
      return this.ae;
   }

   boolean am() {
      return this.ae;
   }

   boolean aj(int var1) {
      try {
         return this.am;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "at.aj(" + ')');
      }
   }

   at(int var1, String var2, boolean var3, boolean var4) {
      try {
         super();
         this.ay = var1 * 1139826955;
         this.as = var2;
         this.ae = var3;
         this.am = var4;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "at.<init>(" + ')');
      }
   }

   boolean ay() {
      return this.ae;
   }

   public String ao() {
      return this.as;
   }

   boolean af() {
      return this.am;
   }

   boolean ar() {
      return this.am;
   }

   boolean ab() {
      return this.am;
   }

   static boolean ak(CharSequence var0, int var1, boolean var2, int var3) {
      try {
         if (var1 >= 2 && var1 <= 36) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = var0.length();
            int var8 = 0;

            while(true) {
               if (var8 >= var7) {
                  return var5;
               }

               if (var3 != 1177143826) {
                  throw new IllegalStateException();
               }

               label125: {
                  char var9 = var0.charAt(var8);
                  if (0 == var8) {
                     if (var3 != 1177143826) {
                        throw new IllegalStateException();
                     }

                     if ('-' == var9) {
                        var4 = true;
                        break label125;
                     }

                     if (var9 == '+') {
                        if (var3 != 1177143826) {
                           throw new IllegalStateException();
                        }

                        if (var2) {
                           if (var3 != 1177143826) {
                              throw new IllegalStateException();
                           }
                           break label125;
                        }
                     }
                  }

                  int var12;
                  label127: {
                     if (var9 >= '0') {
                        if (var3 != 1177143826) {
                           throw new IllegalStateException();
                        }

                        if (var9 <= '9') {
                           if (var3 != 1177143826) {
                              throw new IllegalStateException();
                           }

                           var12 = var9 - 48;
                           break label127;
                        }
                     }

                     if (var9 >= 'A' && var9 <= 'Z') {
                        if (var3 != 1177143826) {
                           throw new IllegalStateException();
                        }

                        var12 = var9 - 55;
                     } else {
                        if (var9 < 'a') {
                           break;
                        }

                        if (var3 != 1177143826) {
                           throw new IllegalStateException();
                        }

                        if (var9 > 'z') {
                           break;
                        }

                        var12 = var9 - 87;
                     }
                  }

                  if (var12 >= var1) {
                     return false;
                  }

                  if (var4) {
                     if (var3 != 1177143826) {
                        throw new IllegalStateException();
                     }

                     var12 = -var12;
                  }

                  int var10 = var12 + var6 * var1;
                  if (var6 != var10 / var1) {
                     if (var3 != 1177143826) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }

                  var6 = var10;
                  var5 = true;
               }

               ++var8;
            }

            return false;
         } else {
            throw new IllegalArgumentException("" + var1);
         }
      } catch (RuntimeException var11) {
         throw tm.aw(var11, "at.ak(" + ')');
      }
   }
}
