public class kk implements ps {
   public static final kk ag = new kk((byte)1, 1.0F);
   public static final kk ae = new kk((byte)0, 0.5F);
   public static final kk ac = new kk((byte)-1, 0.0F);
   public static final kk am = new kk((byte)2, 2.0F);
   public static final kk aq = new kk((byte)4, 2.5F);
   public static final kk at = new kk((byte)6, 3.5F);
   public static final kk af = new kk((byte)5, 3.0F);
   public static kk[] ad;
   public static final kk au = new kk((byte)7, 4.0F);
   public final byte ar;
   public final float al;
   public static final kk ax = new kk((byte)3, 1.5F);
   public static final int bt = 1010;
   public static final int eh = 8;
   static final int as = 2097152;

   static String at() {
      StringBuilder var0 = new StringBuilder();
      kk[] var1 = ad;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         kk var3 = var1[var2];
         var0.append(var3.ar);
         var0.append(", ");
      }

      String var4 = var0.toString();
      return var4.substring(0, var4.length() - 2);
   }

   public int ac(int var1) {
      try {
         return this.ar;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "kk.ac(" + ')');
      }
   }

   static {
      kk[] var0 = new kk[]{ag, aq, ax, ac, au, af, am, at, ae};
      ad = var0;
      es.ax(-1087825615);
   }

   public static String ac(CharSequence var0, byte var1) {
      try {
         int var2 = var0.length();
         StringBuilder var3 = new StringBuilder(var2);

         for(int var4 = 0; var4 < var2; ++var4) {
            if (var1 != 61) {
               throw new IllegalStateException();
            }

            char var5;
            label115: {
               var5 = var0.charAt(var4);
               if (var5 >= 'a') {
                  if (var1 != 61) {
                     throw new IllegalStateException();
                  }

                  if (var5 <= 'z') {
                     break label115;
                  }

                  if (var1 != 61) {
                     throw new IllegalStateException();
                  }
               }

               if (var5 >= 'A') {
                  if (var5 <= 'Z') {
                     break label115;
                  }

                  if (var1 != 61) {
                     throw new IllegalStateException();
                  }
               }

               if (var5 >= '0') {
                  if (var1 != 61) {
                     throw new IllegalStateException();
                  }

                  if (var5 <= '9') {
                     break label115;
                  }

                  if (var1 != 61) {
                     throw new IllegalStateException();
                  }
               }

               if (var5 != '.') {
                  if (var1 != 61) {
                     throw new IllegalStateException();
                  }

                  if (var5 != '-') {
                     if (var1 != 61) {
                        throw new IllegalStateException();
                     }

                     if (var5 != '*') {
                        if (var1 != 61) {
                           throw new IllegalStateException();
                        }

                        if (var5 != '_') {
                           if (' ' == var5) {
                              if (var1 != 61) {
                                 throw new IllegalStateException();
                              }

                              var3.append('+');
                           } else {
                              byte var6 = il.ac(var5, 1169786355);
                              var3.append('%');
                              int var7 = var6 >> 4 & 15;
                              if (var7 >= 10) {
                                 if (var1 != 61) {
                                    throw new IllegalStateException();
                                 }

                                 var3.append((char)(var7 + 55));
                              } else {
                                 var3.append((char)(var7 + 48));
                              }

                              var7 = var6 & 15;
                              if (var7 >= 10) {
                                 if (var1 != 61) {
                                    throw new IllegalStateException();
                                 }

                                 var3.append((char)(55 + var7));
                              } else {
                                 var3.append((char)(var7 + 48));
                              }
                           }
                           continue;
                        }
                     }
                  }
               }
            }

            var3.append(var5);
         }

         return var3.toString();
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "kk.ac(" + ')');
      }
   }

   kk(byte var1, float var2) {
      try {
         super();
         this.ar = var1;
         this.al = var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "kk.<init>(" + ')');
      }
   }

   public int am() {
      return this.ar;
   }

   static String aq() {
      StringBuilder var0 = new StringBuilder();
      kk[] var1 = ad;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         kk var3 = var1[var2];
         var0.append(var3.ar);
         var0.append(", ");
      }

      String var4 = var0.toString();
      return var4.substring(0, var4.length() - 2);
   }

   static String af() {
      StringBuilder var0 = new StringBuilder();
      kk[] var1 = ad;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         kk var3 = var1[var2];
         var0.append(var3.ar);
         var0.append(", ");
      }

      String var4 = var0.toString();
      return var4.substring(0, var4.length() - 2);
   }

   public int ag() {
      return this.ar;
   }

   public int ae() {
      return this.ar;
   }
}
