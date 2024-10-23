import java.util.Iterator;

public class qi {
   static char[] ae;
   static char[] ac = new char[64];
   static char[] ag;
   static int[] am;

   static final void od(int var0) {
      try {
         Iterator var1 = eo.ae.iterator();

         while(var1.hasNext()) {
            if (var0 != -1352964695) {
               throw new IllegalStateException();
            }

            ct var2 = (ct)var1.next();
            var2.ax((byte)8);
         }

         if (gt.sc != null) {
            if (var0 != -1352964695) {
               throw new IllegalStateException();
            }

            gt.sc.ah((byte)-20);
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "qi.od(" + ')');
      }
   }

   static {
      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         ac[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         ac[var0] = (char)(97 + var0 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         ac[var0] = (char)(48 + var0 - 52);
      }

      ac[62] = '+';
      ac[63] = '/';
      ae = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         ae[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         ae[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         ae[var0] = (char)(48 + var0 - 52);
      }

      ae[62] = '*';
      ae[63] = '-';
      ag = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         ag[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         ag[var0] = (char)(97 + var0 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         ag[var0] = (char)(var0 + 48 - 52);
      }

      ag[62] = '-';
      ag[63] = '_';
      am = new int[128];

      for(var0 = 0; var0 < am.length; ++var0) {
         am[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         am[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         am[var0] = 26 + (var0 - 97);
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         am[var0] = 52 + (var0 - 48);
      }

      int[] var2 = am;
      am[43] = 62;
      var2[42] = 62;
      int[] var1 = am;
      am[47] = 63;
      var1[45] = 63;
   }

   public static int ag(int var0, int var1) {
      try {
         return (var0 & um.ag * -1184393861) - 1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "qi.ag(" + ')');
      }
   }

   public static String ae(byte[] var0) {
      int var2 = var0.length;
      StringBuilder var3 = new StringBuilder();

      for(int var4 = 0; var4 < var2 + 0; var4 += 3) {
         int var5 = var0[var4] & 255;
         var3.append(ac[var5 >>> 2]);
         if (var4 < var2 - 1) {
            int var6 = var0[1 + var4] & 255;
            var3.append(ac[(var5 & 3) << 4 | var6 >>> 4]);
            if (var4 < var2 - 2) {
               int var7 = var0[var4 + 2] & 255;
               var3.append(ac[(var6 & 15) << 2 | var7 >>> 6]).append(ac[var7 & 63]);
            } else {
               var3.append(ac[(var6 & 15) << 2]).append("=");
            }
         } else {
            var3.append(ac[(var5 & 3) << 4]).append("==");
         }
      }

      String var1 = var3.toString();
      return var1;
   }

   qi() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "qi.<init>(" + ')');
      }
   }
}
