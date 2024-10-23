import java.util.Comparator;

class rp implements Comparator {
   static final int bo = 500;
   static final int ac = 500000;
   static int ko;
   public static int ag;
   static final int am = 100;
   // $FF: synthetic field
   final ry this$0;

   public int aq(Object var1, Object var2) {
      return this.ac((rt)var1, (rt)var2, 547884984);
   }

   rp(ry var1) {
      this.this$0 = var1;
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ac((rt)var1, (rt)var2, -1828216664);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "rp.compare(" + ')');
      }
   }

   int ag(rt var1, rt var2) {
      if (-7450097952003953423L * var1.ag > var2.ag * -7450097952003953423L) {
         return 1;
      } else {
         return -7450097952003953423L * var1.ag < var2.ag * -7450097952003953423L ? -1 : 0;
      }
   }

   public int ax(Object var1, Object var2) {
      return this.ac((rt)var1, (rt)var2, -1917336871);
   }

   int ac(rt var1, rt var2, int var3) {
      try {
         if (-7450097952003953423L * var1.ag > var2.ag * -7450097952003953423L) {
            if (var3 == 999861974) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else if (-7450097952003953423L * var1.ag < var2.ag * -7450097952003953423L) {
            if (var3 == 999861974) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "rp.ac(" + ')');
      }
   }

   public int af(Object var1, Object var2) {
      return this.ac((rt)var1, (rt)var2, -1602358133);
   }

   public boolean gn(Object var1) {
      return super.equals(var1);
   }

   public boolean gg(Object var1) {
      return super.equals(var1);
   }

   int ae(rt var1, rt var2) {
      if (-7450097952003953423L * var1.ag > var2.ag * -7450097952003953423L) {
         return 1;
      } else {
         return -7450097952003953423L * var1.ag < var2.ag * -7450097952003953423L ? -1 : 0;
      }
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "rp.equals(" + ')');
      }
   }

   int am(rt var1, rt var2) {
      if (-7450097952003953423L * var1.ag > var2.ag * -7450097952003953423L) {
         return 1;
      } else {
         return -7450097952003953423L * var1.ag < var2.ag * -7450097952003953423L ? -1 : 0;
      }
   }
}
