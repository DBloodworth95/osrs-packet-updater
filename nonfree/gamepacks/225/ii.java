public class ii {
   public static final ii am = new ii(3);
   static final ii ae = new ii(1);
   static final ii ar = new ii(9);
   static final ii al = new ii(10);
   static final ii ax = new ii(4);
   public static final ii aq = new ii(5);
   static final ii ac = new ii(0);
   static final ii af = new ii(6);
   static final ii au = new ii(8);
   static final ii ag = new ii(2);
   static final ii at = new ii(7);
   public static final ii ad = new ii(11);
   static final ii ah = new ii(12);
   static final ii ap = new ii(13);
   public final int az;

   public static int at(long var0) {
      try {
         return (int)(var0 >>> 17 & 4294967295L);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ii.at(" + ')');
      }
   }

   public static boolean ae(CharSequence var0, int var1) {
      try {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();
         int var7 = 0;

         boolean var2;
         while(true) {
            if (var7 >= var6) {
               var2 = var4;
               break;
            }

            if (var1 <= -690634519) {
               throw new IllegalStateException();
            }

            label127: {
               char var8 = var0.charAt(var7);
               if (0 == var7) {
                  if (var1 <= -690634519) {
                     throw new IllegalStateException();
                  }

                  if ('-' == var8) {
                     if (var1 <= -690634519) {
                        throw new IllegalStateException();
                     }

                     var3 = true;
                     break label127;
                  }

                  if (var8 == '+') {
                     if (var1 <= -690634519) {
                        throw new IllegalStateException();
                     }
                     break label127;
                  }
               }

               label129: {
                  int var11;
                  label130: {
                     if (var8 >= '0') {
                        if (var1 <= -690634519) {
                           throw new IllegalStateException();
                        }

                        if (var8 <= '9') {
                           if (var1 <= -690634519) {
                              throw new IllegalStateException();
                           }

                           var11 = var8 - 48;
                           break label130;
                        }
                     }

                     if (var8 >= 'A') {
                        if (var1 <= -690634519) {
                           throw new IllegalStateException();
                        }

                        if (var8 <= 'Z') {
                           if (var1 <= -690634519) {
                              throw new IllegalStateException();
                           }

                           var11 = var8 - 55;
                           break label130;
                        }
                     }

                     if (var8 < 'a') {
                        break label129;
                     }

                     if (var1 <= -690634519) {
                        throw new IllegalStateException();
                     }

                     if (var8 > 'z') {
                        break label129;
                     }

                     if (var1 <= -690634519) {
                        throw new IllegalStateException();
                     }

                     var11 = var8 - 87;
                  }

                  if (var11 >= 10) {
                     if (var1 <= -690634519) {
                        throw new IllegalStateException();
                     }

                     var2 = false;
                     break;
                  }

                  if (var3) {
                     if (var1 <= -690634519) {
                        throw new IllegalStateException();
                     }

                     var11 = -var11;
                  }

                  int var9 = var5 * 10 + var11;
                  if (var5 != var9 / 10) {
                     var2 = false;
                     break;
                  }

                  var5 = var9;
                  var4 = true;
                  break label127;
               }

               var2 = false;
               break;
            }

            ++var7;
         }

         return var2;
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "ii.ae(" + ')');
      }
   }

   ii(int var1) {
      try {
         super();
         this.az = var1 * -1086404293;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ii.<init>(" + ')');
      }
   }
}
