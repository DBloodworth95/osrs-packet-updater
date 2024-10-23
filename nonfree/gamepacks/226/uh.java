public class uh {
   static final char[] aj = new char[]{'[', ']', '#'};
   static final int ap = 1;
   static final char[] ak = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
   static final int aw = 12;

   static final int as(ur var0) {
      if (var0 == null) {
         return 12;
      } else {
         switch(var0.at * -588432431) {
         case 7:
            return 20;
         default:
            return 12;
         }
      }
   }

   uh() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "uh.<init>(" + ')');
      }
   }

   static final int ay(ur var0) {
      if (var0 == null) {
         return 12;
      } else {
         switch(var0.at * -806929568) {
         case 7:
            return 20;
         default:
            return 12;
         }
      }
   }

   static final boolean at(char var0) {
      return 160 == var0 || ' ' == var0 || '_' == var0 || var0 == '-';
   }

   static final boolean am(char var0) {
      if (Character.isISOControl(var0)) {
         return false;
      } else if (pv.ao(var0, -1469144052)) {
         return true;
      } else {
         char[] var1 = ak;

         int var2;
         char var3;
         for(var2 = 0; var2 < var1.length; ++var2) {
            var3 = var1[var2];
            if (var0 == var3) {
               return true;
            }
         }

         var1 = aj;

         for(var2 = 0; var2 < var1.length; ++var2) {
            var3 = var1[var2];
            if (var3 == var0) {
               return true;
            }
         }

         return false;
      }
   }

   static final int ae(ur var0) {
      if (var0 == null) {
         return 12;
      } else {
         switch(var0.at * -588432431) {
         case 7:
            return 20;
         default:
            return 12;
         }
      }
   }

   static final boolean au(char var0) {
      return 160 == var0 || ' ' == var0 || '_' == var0 || var0 == '-';
   }

   public static String af(CharSequence var0, ur var1) {
      if (null == var0) {
         return null;
      } else {
         int var2 = 0;

         int var3;
         for(var3 = var0.length(); var2 < var3 && je.ak(var0.charAt(var2), -1908321284); ++var2) {
         }

         while(var3 > var2 && je.ak(var0.charAt(var3 - 1), -2147436651)) {
            --var3;
         }

         int var4 = var3 - var2;
         if (var4 >= 1 && var4 <= ke.ap(var1, (byte)0)) {
            StringBuilder var5 = new StringBuilder(var4);

            for(int var6 = var2; var6 < var3; ++var6) {
               char var7 = var0.charAt(var6);
               if (nt.aw(var7, 451824596)) {
                  char var8;
                  switch(var7) {
                  case ' ':
                  case '-':
                  case '_':
                  case ' ':
                     var8 = '_';
                     break;
                  case '#':
                  case '[':
                  case ']':
                     var8 = var7;
                     break;
                  case 'À':
                  case 'Á':
                  case 'Â':
                  case 'Ã':
                  case 'Ä':
                  case 'à':
                  case 'á':
                  case 'â':
                  case 'ã':
                  case 'ä':
                     var8 = 'a';
                     break;
                  case 'Ç':
                  case 'ç':
                     var8 = 'c';
                     break;
                  case 'È':
                  case 'É':
                  case 'Ê':
                  case 'Ë':
                  case 'è':
                  case 'é':
                  case 'ê':
                  case 'ë':
                     var8 = 'e';
                     break;
                  case 'Í':
                  case 'Î':
                  case 'Ï':
                  case 'í':
                  case 'î':
                  case 'ï':
                     var8 = 'i';
                     break;
                  case 'Ñ':
                  case 'ñ':
                     var8 = 'n';
                     break;
                  case 'Ò':
                  case 'Ó':
                  case 'Ô':
                  case 'Õ':
                  case 'Ö':
                  case 'ò':
                  case 'ó':
                  case 'ô':
                  case 'õ':
                  case 'ö':
                     var8 = 'o';
                     break;
                  case 'Ù':
                  case 'Ú':
                  case 'Û':
                  case 'Ü':
                  case 'ù':
                  case 'ú':
                  case 'û':
                  case 'ü':
                     var8 = 'u';
                     break;
                  case 'ß':
                     var8 = 'b';
                     break;
                  case 'ÿ':
                  case 'Ÿ':
                     var8 = 'y';
                     break;
                  default:
                     var8 = Character.toLowerCase(var7);
                  }

                  if (0 != var8) {
                     var5.append(var8);
                  }
               }
            }

            if (var5.length() == 0) {
               return null;
            } else {
               return var5.toString();
            }
         } else {
            return null;
         }
      }
   }

   public static String ao(CharSequence var0, ur var1) {
      if (null == var0) {
         return null;
      } else {
         int var2 = 0;

         int var3;
         for(var3 = var0.length(); var2 < var3 && je.ak(var0.charAt(var2), -2108161549); ++var2) {
         }

         while(var3 > var2 && je.ak(var0.charAt(var3 - 1), -1946325153)) {
            --var3;
         }

         int var4 = var3 - var2;
         if (var4 >= 1 && var4 <= ke.ap(var1, (byte)0)) {
            StringBuilder var5 = new StringBuilder(var4);

            for(int var6 = var2; var6 < var3; ++var6) {
               char var7 = var0.charAt(var6);
               if (nt.aw(var7, 320276823)) {
                  int var8;
                  switch(var7) {
                  case ' ':
                  case '-':
                  case '_':
                  case ' ':
                     var8 = 95;
                     break;
                  case '#':
                  case '[':
                  case ']':
                     var8 = var7;
                     break;
                  case 'À':
                  case 'Á':
                  case 'Â':
                  case 'Ã':
                  case 'Ä':
                  case 'à':
                  case 'á':
                  case 'â':
                  case 'ã':
                  case 'ä':
                     var8 = 1362759353;
                     break;
                  case 'Ç':
                  case 'ç':
                     var8 = 99;
                     break;
                  case 'È':
                  case 'É':
                  case 'Ê':
                  case 'Ë':
                  case 'è':
                  case 'é':
                  case 'ê':
                  case 'ë':
                     var8 = 101;
                     break;
                  case 'Í':
                  case 'Î':
                  case 'Ï':
                  case 'í':
                  case 'î':
                  case 'ï':
                     var8 = 105;
                     break;
                  case 'Ñ':
                  case 'ñ':
                     var8 = -1506569476;
                     break;
                  case 'Ò':
                  case 'Ó':
                  case 'Ô':
                  case 'Õ':
                  case 'Ö':
                  case 'ò':
                  case 'ó':
                  case 'ô':
                  case 'õ':
                  case 'ö':
                     var8 = 111;
                     break;
                  case 'Ù':
                  case 'Ú':
                  case 'Û':
                  case 'Ü':
                  case 'ù':
                  case 'ú':
                  case 'û':
                  case 'ü':
                     var8 = 117;
                     break;
                  case 'ß':
                     var8 = -752653100;
                     break;
                  case 'ÿ':
                  case 'Ÿ':
                     var8 = 121;
                     break;
                  default:
                     var8 = Character.toLowerCase(var7);
                  }

                  if (0 != var8) {
                     var5.append((char)var8);
                  }
               }
            }

            if (var5.length() == 0) {
               return null;
            } else {
               return var5.toString();
            }
         } else {
            return null;
         }
      }
   }

   static final boolean an(char var0) {
      return 2066786212 == var0 || 1251837555 == var0 || '_' == var0 || var0 == '-';
   }

   public static String ar(String var0) {
      return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
   }

   public static String ab(String var0) {
      return var0 != null && !var0.isEmpty() && var0.charAt(0) != 1587887347 ? var0 : "";
   }

   public static String az(String var0) {
      return var0 != null && !var0.isEmpty() && var0.charAt(0) != '#' ? var0 : "";
   }
}
