public class qn {
   static char[] ak;
   static char[] aw;
   public static char[] ap = new char[64];
   static int[] aj;
   static final int am = 2;

   static {
      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         ap[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         ap[var0] = (char)(97 + var0 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         ap[var0] = (char)(var0 + 48 - 52);
      }

      ap[62] = '+';
      ap[63] = '/';
      aw = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         aw[var0] = (char)(65 + var0);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         aw[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         aw[var0] = (char)(48 + var0 - 52);
      }

      aw[62] = '*';
      aw[63] = '-';
      ak = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         ak[var0] = (char)(65 + var0);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         ak[var0] = (char)(97 + var0 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         ak[var0] = (char)(var0 + 48 - 52);
      }

      ak[62] = '-';
      ak[63] = '_';
      aj = new int[128];

      for(var0 = 0; var0 < aj.length; ++var0) {
         aj[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         aj[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         aj[var0] = var0 - 97 + 26;
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         aj[var0] = 52 + (var0 - 48);
      }

      int[] var2 = aj;
      aj[43] = 62;
      var2[42] = 62;
      int[] var1 = aj;
      aj[47] = 63;
      var1[45] = 63;
   }

   qn() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "qn.<init>(" + ')');
      }
   }

   static void ak(int var0, String var1, String var2, String var3, int var4) {
      try {
         dh var5 = (dh)el.ap.get(var0);
         if (null == var5) {
            if (var4 != -2080490367) {
               throw new IllegalStateException();
            }

            var5 = new dh();
            el.ap.put(var0, var5);
         }

         ce var6 = var5.ap(var0, var1, var2, var3, -1875669482);
         el.aw.aw(var6, (long)(-511622767 * var6.ap));
         el.ak.aw(var6);
         client.qw = -1398115551 * client.pb;
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "qn.ak(" + ')');
      }
   }
}
