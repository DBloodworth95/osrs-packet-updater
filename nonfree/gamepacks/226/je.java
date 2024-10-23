public class je {
   int ak;
   int ap;
   int aw;
   int aj;

   je(je var1) {
      try {
         super();
         this.ap = var1.ap * 1;
         this.aw = var1.aw * 1;
         this.ak = var1.ak * 1;
         this.aj = var1.aj * 1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "je.<init>(" + ')');
      }
   }

   static final boolean ak(char var0, int var1) {
      try {
         boolean var10000;
         if (160 != var0) {
            if (var1 >= -1436325062) {
               throw new IllegalStateException();
            }

            if (' ' != var0) {
               if (var1 >= -1436325062) {
                  throw new IllegalStateException();
               }

               if ('_' != var0) {
                  if (var1 >= -1436325062) {
                     throw new IllegalStateException();
                  }

                  if (var0 != '-') {
                     var10000 = false;
                     return var10000;
                  }

                  if (var1 >= -1436325062) {
                     throw new IllegalStateException();
                  }
               }
            }
         }

         var10000 = true;
         return var10000;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "je.ak(" + ')');
      }
   }

   je() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "je.<init>(" + ')');
      }
   }
}
