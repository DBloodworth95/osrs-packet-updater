public final class qo {
   public static final int aj = 5;
   static long[] aw = new long[12];
   static final char[] ap = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

   public static long ai(CharSequence var0) {
      long var1 = 0L;
      int var3 = var0.length();

      for(int var4 = 0; var4 < var3; ++var4) {
         var1 *= 37L;
         char var5 = var0.charAt(var4);
         if (var5 >= 'A' && var5 <= 'Z') {
            var1 += (long)(var5 + 1 - 65);
         } else if (var5 >= 'a' && var5 <= 'z') {
            var1 += (long)(var5 + 1 - 97);
         } else if (var5 >= '0' && var5 <= '9') {
            var1 += (long)(var5 + 27 - 48);
         }

         if (var1 >= 177917621779460413L) {
            break;
         }
      }

      while(var1 % 37L == 0L && var1 != 0L) {
         var1 /= 37L;
      }

      return var1;
   }

   public static String ay(long var0) {
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
               var5.append(ap[(int)(var6 - 37L * var0)]);
            }

            return var5.reverse().toString();
         }
      } else {
         return null;
      }
   }

   public static long aj(CharSequence var0) {
      long var1 = 0L;
      int var3 = var0.length();

      for(int var4 = 0; var4 < var3; ++var4) {
         var1 *= 37L;
         char var5 = var0.charAt(var4);
         if (var5 >= 'A' && var5 <= -99661244) {
            var1 += (long)(var5 + 1 - 65);
         } else if (var5 >= 'a' && var5 <= 2107293277) {
            var1 += (long)(var5 + 1 - 97);
         } else if (var5 >= '0' && var5 <= -103978276) {
            var1 += (long)(var5 + 27 - 48);
         }

         if (var1 >= 177917621779460413L) {
            break;
         }
      }

      while(var1 % 37L == 0L && var1 != 0L) {
         var1 /= 37L;
      }

      return var1;
   }

   static final void nk(int var0, int var1, int var2, int var3, vv var4, nw var5, short var6) {
      try {
         if (var4 == null) {
            if (var6 > 255) {
               ;
            }
         } else {
            int var7 = client.kb * 1833510775 & 2047;
            int var8 = var2 * var2 + var3 * var3;
            if (var8 <= 6400) {
               int var9 = jm.aj[var7];
               int var10 = jm.ai[var7];
               int var11 = var2 * var10 + var9 * var3 >> 16;
               int var12 = var3 * var10 - var2 * var9 >> 16;
               if (var8 > 2500) {
                  if (var6 <= 255) {
                     return;
                  }

                  var4.bv(var11 + var5.ap * -210833969 / 2 - var4.ay / 2, var5.aw * 736216811 / 2 - var12 - var4.as / 2, var0, var1, var5.ap * -210833969, 736216811 * var5.aw, var5.aj, var5.ak);
               } else {
                  var4.ao(var11 + var0 + -210833969 * var5.ap / 2 - var4.ay / 2, var5.aw * 736216811 / 2 + var1 - var12 - var4.as / 2);
               }

            }
         }
      } catch (RuntimeException var13) {
         throw tm.aw(var13, "qo.nk(" + ')');
      }
   }

   qo() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "qo.<init>(" + ')');
      }
   }

   public static String as(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; 0L != var3; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            char var8;
            for(var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = ap[(int)(var6 - var0 * 37L)];
               if (var8 == '_') {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   public static String ae(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; 0L != var3; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            int var8;
            for(var5 = new StringBuilder(var2); var0 != 0L; var5.append((char)var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = ap[(int)(var6 - var0 * 37L)];
               if (var8 == 704339534) {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = -399178872;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   public static String am(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; 0L != var3; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            char var8;
            for(var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = ap[(int)(var6 - var0 * 37L)];
               if (var8 == '_') {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   static final void nb(dm var0, boolean var1, int var2) {
      try {
         int var3 = var0.ap * -1759747861;
         int var4 = (int)var0.ht;
         var0.kf();
         if (var1) {
            if (var2 <= -977240651) {
               throw new IllegalStateException();
            }

            qk.ek.aj(var3, (byte)12);
         }

         for(tb var5 = (tb)client.ry.aj(); null != var5; var5 = (tb)client.ry.ai()) {
            if (var2 <= -977240651) {
               return;
            }

            if ((long)var3 == (var5.ht >> 48 & 65535L)) {
               var5.kf();
            }
         }

         ng var7 = qk.ek.ap(var4, 455543890);
         if (null != var7) {
            if (var2 <= -977240651) {
               throw new IllegalStateException();
            }

            ek.mp(var7, 1347113565);
         }

         if (1832668233 * client.og != -1) {
            if (var2 <= -977240651) {
               throw new IllegalStateException();
            }

            si.my(1832668233 * client.og, 1, (short)6646);
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "qo.nb(" + ')');
      }
   }

   static void aj(int var0, boolean var1, int var2, boolean var3, int var4) {
      try {
         if (null != ct.ai) {
            if (var4 <= -1908196411) {
               throw new IllegalStateException();
            }

            ch.ai(0, ct.ai.length - 1, var0, var1, var2, var3, (short)-25518);
         }

      } catch (RuntimeException var5) {
         throw tm.aw(var5, "qo.aj(" + ')');
      }
   }

   public static String ap(CharSequence var0, int var1) {
      try {
         int var2 = var0.length();
         StringBuilder var3 = new StringBuilder(var2);

         for(int var4 = 0; var4 < var2; ++var4) {
            if (var1 == -311316118) {
               throw new IllegalStateException();
            }

            char var5;
            label118: {
               var5 = var0.charAt(var4);
               if (var5 >= 'a') {
                  if (var1 == -311316118) {
                     throw new IllegalStateException();
                  }

                  if (var5 <= 'z') {
                     break label118;
                  }

                  if (var1 == -311316118) {
                     throw new IllegalStateException();
                  }
               }

               if (var5 >= 'A') {
                  if (var5 <= 'Z') {
                     break label118;
                  }

                  if (var1 == -311316118) {
                     throw new IllegalStateException();
                  }
               }

               if (var5 >= '0') {
                  if (var1 == -311316118) {
                     throw new IllegalStateException();
                  }

                  if (var5 <= '9') {
                     break label118;
                  }

                  if (var1 == -311316118) {
                     throw new IllegalStateException();
                  }
               }

               if (var5 != '.') {
                  if (var1 == -311316118) {
                     throw new IllegalStateException();
                  }

                  if ('-' != var5) {
                     if (var1 == -311316118) {
                        throw new IllegalStateException();
                     }

                     if (var5 != '*') {
                        if (var1 == -311316118) {
                           throw new IllegalStateException();
                        }

                        if ('_' != var5) {
                           if (' ' == var5) {
                              if (var1 == -311316118) {
                                 throw new IllegalStateException();
                              }

                              var3.append('+');
                           } else {
                              byte var6 = bm.ap(var5, (byte)-30);
                              var3.append('%');
                              int var7 = var6 >> 4 & 15;
                              if (var7 >= 10) {
                                 if (var1 == -311316118) {
                                    throw new IllegalStateException();
                                 }

                                 var3.append((char)(var7 + 55));
                              } else {
                                 var3.append((char)(var7 + 48));
                              }

                              var7 = var6 & 15;
                              if (var7 >= 10) {
                                 if (var1 == -311316118) {
                                    throw new IllegalStateException();
                                 }

                                 var3.append((char)(55 + var7));
                              } else {
                                 var3.append((char)(48 + var7));
                              }
                           }
                           continue;
                        }

                        if (var1 == -311316118) {
                           throw new IllegalStateException();
                        }
                     }
                  }
               }
            }

            var3.append(var5);
         }

         return var3.toString();
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "qo.ap(" + ')');
      }
   }

   static {
      for(int var0 = 0; var0 < aw.length; ++var0) {
         aw[var0] = (long)Math.pow(37.0D, (double)var0);
      }

   }
}
