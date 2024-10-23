public class kj {
   static final int aq = 6;
   static int[] au;
   public static int[] af;

   static char am(char var0, byte var1) {
      try {
         if (var0 != 181) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            if (var0 != 402) {
               return Character.toTitleCase(var0);
            }
         }

         return var0;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "kj.am(" + ')');
      }
   }

   kj() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "kj.<init>(" + ')');
      }
   }

   public static char am(char var0, int var1) {
      try {
         switch(var0) {
         case ' ':
         case '-':
         case '_':
         case ' ':
            return '_';
         case '#':
         case '[':
         case ']':
            return var0;
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
            return 'a';
         case 'Ç':
         case 'ç':
            return 'c';
         case 'È':
         case 'É':
         case 'Ê':
         case 'Ë':
         case 'è':
         case 'é':
         case 'ê':
         case 'ë':
            return 'e';
         case 'Í':
         case 'Î':
         case 'Ï':
         case 'í':
         case 'î':
         case 'ï':
            return 'i';
         case 'Ñ':
         case 'ñ':
            return 'n';
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
            return 'o';
         case 'Ù':
         case 'Ú':
         case 'Û':
         case 'Ü':
         case 'ù':
         case 'ú':
         case 'û':
         case 'ü':
            return 'u';
         case 'ß':
            return 'b';
         case 'ÿ':
         case 'Ÿ':
            return 'y';
         default:
            return Character.toLowerCase(var0);
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "kj.am(" + ')');
      }
   }
}
