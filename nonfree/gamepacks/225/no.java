import java.util.Arrays;

public class no {
   public static final int bb = 49;
   public static int[] ag;
   static int[] ac = new int[32];
   public static int[] am;
   public static final int ah = 8;

   public static void at() {
      Arrays.fill(ag, 0);
      Arrays.fill(am, 0);
   }

   public static void au() {
      Arrays.fill(ag, 0);
      Arrays.fill(am, 0);
   }

   no() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "no.<init>(" + ')');
      }
   }

   public static void ax(int var0, int var1) {
      hl var3 = (hl)hl.ae.ac((long)var0);
      hl var2;
      if (null != var3) {
         var2 = var3;
      } else {
         byte[] var4 = hl.ac.bt(14, var0, (byte)-23);
         var3 = new hl();
         if (null != var4) {
            var3.ae(new vf(var4), 207523289);
         }

         hl.ae.ag(var3, (long)var0);
         var2 = var3;
      }

      int var8 = var2.ag * 143859779;
      int var5 = var2.am * -1870632745;
      int var6 = -833963677 * var2.ax;
      int var7 = ac[var6 - var5];
      if (var1 < 0 || var1 > var7) {
         var1 = 0;
      }

      var7 <<= var5;
      am[var8] = am[var8] & ~var7 | var1 << var5 & var7;
   }

   public static void aq(int var0, int var1) {
      hl var3 = (hl)hl.ae.ac((long)var0);
      hl var2;
      if (null != var3) {
         var2 = var3;
      } else {
         byte[] var4 = hl.ac.bt(14, var0, (byte)44);
         var3 = new hl();
         if (null != var4) {
            var3.ae(new vf(var4), -695887140);
         }

         hl.ae.ag(var3, (long)var0);
         var2 = var3;
      }

      int var8 = var2.ag * 143859779;
      int var5 = var2.am * -1870632745;
      int var6 = 618809152 * var2.ax;
      int var7 = ac[var6 - var5];
      if (var1 < 0 || var1 > var7) {
         var1 = 0;
      }

      var7 <<= var5;
      am[var8] = am[var8] & ~var7 | var1 << var5 & var7;
   }

   public static int am(int var0) {
      hl var2 = (hl)hl.ae.ac((long)var0);
      hl var1;
      if (null != var2) {
         var1 = var2;
      } else {
         byte[] var3 = hl.ac.bt(14, var0, (byte)-40);
         var2 = new hl();
         if (null != var3) {
            var2.ae(new vf(var3), -761960202);
         }

         hl.ae.ag(var2, (long)var0);
         var1 = var2;
      }

      int var7 = 143859779 * var1.ag;
      int var4 = var1.am * -687003205;
      int var5 = var1.ax * -1790142042;
      int var6 = ac[var5 - var4];
      return am[var7] >> var4 & var6;
   }

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         ac[var1] = var0 - 1;
         var0 += var0;
      }

      ag = new int[5000];
      am = new int[5000];
   }

   public static void af(int var0, int var1) {
      hl var3 = (hl)hl.ae.ac((long)var0);
      hl var2;
      if (null != var3) {
         var2 = var3;
      } else {
         byte[] var4 = hl.ac.bt(14, var0, (byte)66);
         var3 = new hl();
         if (null != var4) {
            var3.ae(new vf(var4), 1288584151);
         }

         hl.ae.ag(var3, (long)var0);
         var2 = var3;
      }

      int var8 = var2.ag * 1028444820;
      int var5 = var2.am * -901273940;
      int var6 = 1432891773 * var2.ax;
      int var7 = ac[var6 - var5];
      if (var1 < 0 || var1 > var7) {
         var1 = 0;
      }

      var7 <<= var5;
      am[var8] = am[var8] & ~var7 | var1 << var5 & var7;
   }

   public static void ar() {
      Arrays.fill(ag, 0);
      Arrays.fill(am, 0);
   }

   public static byte[] ac(Object var0, boolean var1, int var2) {
      try {
         if (var0 == null) {
            if (var2 >= 1546471188) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if (var0 instanceof byte[]) {
            if (var2 >= 1546471188) {
               throw new IllegalStateException();
            } else {
               byte[] var8 = (byte[])((byte[])var0);
               if (var1) {
                  if (var2 >= 1546471188) {
                     throw new IllegalStateException();
                  } else {
                     int var5 = var8.length;
                     byte[] var6 = new byte[var5];
                     System.arraycopy(var8, 0, var6, 0, var5);
                     return var6;
                  }
               } else {
                  return var8;
               }
            }
         } else if (var0 instanceof oe) {
            if (var2 >= 1546471188) {
               throw new IllegalStateException();
            } else {
               oe var3 = (oe)var0;
               return var3.ae(-63683089);
            }
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "no.ac(" + ')');
      }
   }

   public static float ac(int var0, short var1) {
      try {
         var0 &= 16383;
         return (float)((double)((float)var0) * 3.834951969714103E-4D);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "no.ac(" + ')');
      }
   }
}
