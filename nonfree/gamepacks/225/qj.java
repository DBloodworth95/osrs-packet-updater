public final class qj {
   static long[] ae = new long[12];
   public static final char[] ac = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

   public static long am(CharSequence var0) {
      long var1 = 0L;
      int var3 = var0.length();

      for(int var4 = 0; var4 < var3; ++var4) {
         var1 *= 37L;
         char var5 = var0.charAt(var4);
         if (var5 >= 'A' && var5 <= 'Z') {
            var1 += (long)(1 + var5 - 65);
         } else if (var5 >= 'a' && var5 <= 'z') {
            var1 += (long)(var5 + 1 - 97);
         } else if (var5 >= '0' && var5 <= '9') {
            var1 += (long)(27 + var5 - 48);
         }

         if (var1 >= 177917621779460413L) {
            break;
         }
      }

      while(var1 % 37L == 0L && 0L != var1) {
         var1 /= 37L;
      }

      return var1;
   }

   qj() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "qj.<init>(" + ')');
      }
   }

   static {
      for(int var0 = 0; var0 < ae.length; ++var0) {
         ae[var0] = (long)Math.pow(37.0D, (double)var0);
      }

   }

   public static long ax(CharSequence var0) {
      long var1 = 0L;
      int var3 = var0.length();

      for(int var4 = 0; var4 < var3; ++var4) {
         var1 *= 37L;
         char var5 = var0.charAt(var4);
         if (var5 >= 'A' && var5 <= 'Z') {
            var1 += (long)(1 + var5 - 65);
         } else if (var5 >= 'a' && var5 <= 'z') {
            var1 += (long)(var5 + 1 - 97);
         } else if (var5 >= '0' && var5 <= '9') {
            var1 += (long)(27 + var5 - 48);
         }

         if (var1 >= 177917621779460413L) {
            break;
         }
      }

      while(var1 % 37L == 0L && 0L != var1) {
         var1 /= 37L;
      }

      return var1;
   }

   public static String aq(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (0L == var0 % 37L) {
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
               var8 = ac[(int)(var6 - var0 * 37L)];
               if ('_' == var8) {
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

   public static String af(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (0L == var0 % 37L) {
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
               var8 = ac[(int)(var6 - var0 * 37L)];
               if ('_' == var8) {
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

   static void jy(kp var0, short var1) {
      try {
         if (var0 != null) {
            if (var1 != 252) {
               return;
            }

            if (var0.aq != null) {
               if (var0.aq.bd * -1614754997 >= 0) {
                  if (var1 != 252) {
                     throw new IllegalStateException();
                  }

                  ny var2 = ir.ep.ac(-1678119623 * var0.aq.bt, -1625395878);
                  if (var2 == null) {
                     return;
                  }

                  if (var1 != 252) {
                     throw new IllegalStateException();
                  }

                  if (var2.gr == null) {
                     return;
                  }

                  if (var1 != 252) {
                     return;
                  }

                  if (var2.gr.length == 0) {
                     return;
                  }

                  if (var1 != 252) {
                     throw new IllegalStateException();
                  }

                  if (-1614754997 * var0.aq.bd >= var2.gr.length) {
                     return;
                  }

                  if (var1 != 252) {
                     return;
                  }

                  if (var2.gr[-1614754997 * var0.aq.bd] != var0.aq) {
                     if (var1 != 252) {
                        throw new IllegalStateException();
                     }

                     return;
                  }
               }

               if (-1256894539 * var0.aq.bf == 11) {
                  if (var1 != 252) {
                     throw new IllegalStateException();
                  }

                  if (var0.ax * -1852145887 == 0) {
                     if (var1 != 252) {
                        throw new IllegalStateException();
                     }

                     if (var0.aq.aw(var0.ag * -531861761, -984220335 * var0.am, 0, 0, 1832901773)) {
                        var0.aq.bm(-1412090681).ac(-699872601).ae(1, var0.aq.bm(-2119322950).ap(-1962957927), (byte)113);
                        switch(var0.aq.bh((byte)27)) {
                        case 0:
                           ia.ac(var0.aq.bx(1808380903), true, false, -1601898806);
                           return;
                        case 1:
                           int var3 = lj.oq(var0.aq, (byte)5);
                           boolean var8 = 0 != (var3 >> 22 & 1);
                           if (var8) {
                              if (var1 != 252) {
                                 return;
                              }

                              int[] var4 = var0.aq.bf(-1612634558);
                              if (var4 != null) {
                                 if (var1 != 252) {
                                    throw new IllegalStateException();
                                 }

                                 mq var5 = fs.ac(mz.da, client.ia.ax, (byte)-33);
                                 var5.ag.br(-1614754997 * var0.aq.bd, 1625888552);
                                 var5.ag.bv(var4[0], 385442990);
                                 var5.ag.eo(var4[1], 1998441249);
                                 var5.ag.bv(var0.aq.bh * -1565465557, 1786859519);
                                 var5.ag.bv(var4[2], 2031145323);
                                 var5.ag.eo(var0.aq.bd(-2137750575), 1973134004);
                                 client.ia.ag(var5, -232181924);
                              }

                              return;
                           }
                        }
                     }

                     return;
                  }
               }

               if (12 == var0.aq.bf * -1256894539) {
                  if (var1 != 252) {
                     throw new IllegalStateException();
                  }

                  nn var7 = var0.aq.bp(-694047179);
                  if (var7 != null) {
                     if (var1 != 252) {
                        throw new IllegalStateException();
                     }

                     if (var7.ch(1597991474)) {
                        if (var1 != 252) {
                           throw new IllegalStateException();
                        }

                        switch(-1852145887 * var0.ax) {
                        case 0:
                           client.se.ah(var0.aq, 1775715103);
                           var7.ae(true, -1628077642);
                           var7.bg(var0.ag * -531861761, -984220335 * var0.am, client.ss.aa(82, 1770128204), client.ss.aa(81, 1770128204), -2024643238);
                           break;
                        case 1:
                           var7.bl(-531861761 * var0.ag, var0.am * -984220335, (byte)84);
                        }
                     }
                  }
               }

               return;
            }

            if (var1 != 252) {
               return;
            }
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "qj.jy(" + ')');
      }
   }
}
