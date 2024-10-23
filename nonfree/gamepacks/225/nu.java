public class nu {
   ng ae;
   public Object[] aq;
   public nn ac;
   public Object[] am;
   public Object[] ax;
   public Object[] af;
   bh ag;
   static of ft;

   nu() {
      try {
         super();
         this.ac = new nn();
         this.ae = new ng();
         this.ag = new bh();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "nu.<init>(" + ')');
      }
   }

   static String mf(String var0, ny var1, byte var2) {
      try {
         if (var0.indexOf("%") != -1) {
            if (var2 != 42) {
               throw new IllegalStateException();
            }

            for(int var3 = 1; var3 <= 5; ++var3) {
               if (var2 != 42) {
                  throw new IllegalStateException();
               }

               while(true) {
                  int var4 = var0.indexOf("%" + var3);
                  if (-1 == var4) {
                     break;
                  }

                  String var5 = var0.substring(0, var4);
                  int var7 = du.nw(var1, var3 - 1, (byte)40);
                  String var6;
                  if (var7 < 999999999) {
                     if (var2 != 42) {
                        throw new IllegalStateException();
                     }

                     var6 = Integer.toString(var7);
                  } else {
                     var6 = "*";
                  }

                  var0 = var5 + var6 + var0.substring(var4 + 2);
               }
            }
         }

         return var0;
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "nu.mf(" + ')');
      }
   }
}
