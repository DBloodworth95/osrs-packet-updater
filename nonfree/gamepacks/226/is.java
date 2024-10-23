public final class is {
   long as;
   int aw;
   int ak;
   public static final int cf = 80;
   jv ai;
   jv aj;
   jv ay;
   int ae;
   static int jz;
   int ap;
   static final int ah = 32;
   static final int ao = 25;

   public static boolean at(int var0) {
      try {
         boolean var1 = false;
         boolean var2 = false;
         if (!mp.ae.isEmpty()) {
            if (var0 >= 378227608) {
               throw new IllegalStateException();
            }

            ra var3 = (ra)mp.ae.get(0);
            if (null == var3) {
               if (var0 >= 378227608) {
                  throw new IllegalStateException();
               }

               mp.ae.remove(0);
            } else if (var3.ap(343486624)) {
               if (var3.as(1816225167)) {
                  System.out.println("Error in midimanager.service: " + var3.am(-561476633));
                  var1 = true;
               } else {
                  if (var3.at(1364477332) != null) {
                     if (var0 >= 378227608) {
                        throw new IllegalStateException();
                     }

                     mp.ae.add(1, var3.at(2052018234));
                  }

                  var2 = var3.ae((byte)-57);
               }

               mp.ae.remove(0);
            } else {
               var2 = var3.ae((byte)51);
            }
         }

         if (var1) {
            if (var0 >= 378227608) {
               throw new IllegalStateException();
            }

            mp.ae.clear();
            dw.an(-69860981);
         }

         return var2;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "is.at(" + ')');
      }
   }

   is() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "is.<init>(" + ')');
      }
   }
}
