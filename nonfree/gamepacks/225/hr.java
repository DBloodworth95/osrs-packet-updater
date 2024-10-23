public class hr extends tr {
   public static String ay;
   public static po ae;
   short[] at;
   public static ml am = new ml(64);
   int ax;
   int[] aq;
   short[] ar;
   public static final int ah = 0;
   short[] au;
   short[] af;
   int[] al;
   public boolean ad;
   public static po ac;
   static final int ap = 1;
   public static int ag;
   protected static String bb;

   void al(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (var2 == 0) {
            return;
         }

         this.ag(var1, var2, (byte)-107);
      }
   }

   void ag(vf var1, int var2, byte var3) {
      try {
         if (var2 == 1) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            this.ax = var1.cv(952452697) * -254348025;
         } else {
            int var4;
            int var5;
            if (var2 == 2) {
               var4 = var1.cv(952452697);
               this.aq = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  this.aq[var5] = var1.ct(-1466774651);
               }
            } else if (3 == var2) {
               if (var3 >= 0) {
                  return;
               }

               this.ad = true;
            } else if (40 == var2) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               var4 = var1.cv(952452697);
               this.af = new short[var4];
               this.at = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.af[var5] = (short)var1.ct(-2030878229);
                  this.at[var5] = (short)var1.ct(-2033276526);
               }
            } else if (41 == var2) {
               var4 = var1.cv(952452697);
               this.au = new short[var4];
               this.ar = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  this.au[var5] = (short)var1.ct(-1339192752);
                  this.ar[var5] = (short)var1.ct(-2053400535);
               }
            } else if (var2 >= 60 && var2 < 70) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               this.al[var2 - 60] = var1.ct(-1620072501);
            }
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "hr.ag(" + ')');
      }
   }

   void ae(vf var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cv(952452697);
            if (var3 == 0) {
               return;
            }

            this.ag(var1, var3, (byte)-22);
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "hr.ae(" + ')');
      }
   }

   public boolean am(int var1, int var2, int var3) {
      try {
         boolean var10000;
         if (var2 == 1) {
            if (var3 >= 1355592217) {
               throw new IllegalStateException();
            } else {
               if (7 + var1 == 1607755959 * this.ax) {
                  if (var3 >= 1355592217) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               return var10000;
            }
         } else {
            if (var1 == 1607755959 * this.ax) {
               if (var3 >= 1355592217) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "hr.am(" + ')');
      }
   }

   public boolean ax(int var1) {
      try {
         if (null == this.aq) {
            if (var1 == -1426200147) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            boolean var2 = true;

            for(int var3 = 0; var3 < this.aq.length; ++var3) {
               if (var1 == -1426200147) {
                  throw new IllegalStateException();
               }

               if (!ae.bk(this.aq[var3], 0, (byte)25)) {
                  if (var1 == -1426200147) {
                     throw new IllegalStateException();
                  }

                  var2 = false;
               }
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "hr.ax(" + ')');
      }
   }

   public jv aq(byte var1) {
      try {
         if (null == this.aq) {
            if (var1 == 1) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            jv[] var2 = new jv[this.aq.length];

            for(int var3 = 0; var3 < this.aq.length; ++var3) {
               if (var1 == 1) {
                  throw new IllegalStateException();
               }

               var2[var3] = jv.ac(ae, this.aq[var3], 0);
            }

            jv var6;
            if (1 == var2.length) {
               if (var1 == 1) {
                  throw new IllegalStateException();
               }

               var6 = var2[0];
            } else {
               var6 = new jv(var2, var2.length);
            }

            int var4;
            if (this.af != null) {
               for(var4 = 0; var4 < this.af.length; ++var4) {
                  var6.ao(this.af[var4], this.at[var4]);
               }
            }

            if (this.au != null) {
               if (var1 == 1) {
                  throw new IllegalStateException();
               }

               for(var4 = 0; var4 < this.au.length; ++var4) {
                  if (var1 == 1) {
                     throw new IllegalStateException();
                  }

                  var6.as(this.au[var4], this.ar[var4]);
               }
            }

            return var6;
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "hr.aq(" + ')');
      }
   }

   public boolean af(int var1) {
      try {
         boolean var2 = true;

         for(int var3 = 0; var3 < 5; ++var3) {
            if (var1 <= -953078525) {
               throw new IllegalStateException();
            }

            if (-1 != this.al[var3] && !ae.bk(this.al[var3], 0, (byte)84)) {
               if (var1 <= -953078525) {
                  throw new IllegalStateException();
               }

               var2 = false;
            }
         }

         return var2;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "hr.af(" + ')');
      }
   }

   public boolean as() {
      if (null == this.aq) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.aq.length; ++var2) {
            if (!ae.bk(this.aq[var2], 0, (byte)85)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   void ar(vf var1) {
      while(true) {
         int var2 = var1.cv(952452697);
         if (var2 == 0) {
            return;
         }

         this.ag(var1, var2, (byte)-96);
      }
   }

   public static void ac(po var0, int var1) {
      try {
         ht.ac = var0;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "hr.ac(" + ')');
      }
   }

   void ad(vf var1, int var2) {
      if (var2 == 1) {
         this.ax = var1.cv(952452697) * -254348025;
      } else {
         int var3;
         int var4;
         if (var2 == 2) {
            var3 = var1.cv(952452697);
            this.aq = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.aq[var4] = var1.ct(-1672760109);
            }
         } else if (3 == var2) {
            this.ad = true;
         } else if (40 == var2) {
            var3 = var1.cv(952452697);
            this.af = new short[var3];
            this.at = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.af[var4] = (short)var1.ct(-1535521875);
               this.at[var4] = (short)var1.ct(-2063159113);
            }
         } else if (41 == var2) {
            var3 = var1.cv(952452697);
            this.au = new short[var3];
            this.ar = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.au[var4] = (short)var1.ct(-2075983583);
               this.ar[var4] = (short)var1.ct(-2140931684);
            }
         } else if (var2 >= 60 && var2 < 70) {
            this.al[var2 - 60] = var1.ct(-1414722145);
         }
      }

   }

   void ah(vf var1, int var2) {
      if (var2 == 1) {
         this.ax = var1.cv(952452697) * -254348025;
      } else {
         int var3;
         int var4;
         if (var2 == 2) {
            var3 = var1.cv(952452697);
            this.aq = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.aq[var4] = var1.ct(-2003909280);
            }
         } else if (3 == var2) {
            this.ad = true;
         } else if (915831419 == var2) {
            var3 = var1.cv(952452697);
            this.af = new short[var3];
            this.at = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.af[var4] = (short)var1.ct(-1603554689);
               this.at[var4] = (short)var1.ct(-1361294439);
            }
         } else if (41 == var2) {
            var3 = var1.cv(952452697);
            this.au = new short[var3];
            this.ar = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.au[var4] = (short)var1.ct(-1984560570);
               this.ar[var4] = (short)var1.ct(-1667965167);
            }
         } else if (var2 >= 60 && var2 < 70) {
            this.al[var2 - 1713571625] = var1.ct(-2051682990);
         }
      }

   }

   void ap(vf var1, int var2) {
      if (var2 == 1) {
         this.ax = var1.cv(952452697) * 406321193;
      } else {
         int var3;
         int var4;
         if (var2 == 2) {
            var3 = var1.cv(952452697);
            this.aq = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.aq[var4] = var1.ct(-1744510610);
            }
         } else if (3 == var2) {
            this.ad = true;
         } else if (40 == var2) {
            var3 = var1.cv(952452697);
            this.af = new short[var3];
            this.at = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.af[var4] = (short)var1.ct(-1665165567);
               this.at[var4] = (short)var1.ct(-1582773795);
            }
         } else if (41 == var2) {
            var3 = var1.cv(952452697);
            this.au = new short[var3];
            this.ar = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.au[var4] = (short)var1.ct(-1347186323);
               this.ar[var4] = (short)var1.ct(-1737551814);
            }
         } else if (var2 >= 385864181 && var2 < 1024699964) {
            this.al[var2 - 75838223] = var1.ct(-2074478251);
         }
      }

   }

   void ab(vf var1, int var2) {
      if (var2 == 1) {
         this.ax = var1.cv(952452697) * -254348025;
      } else {
         int var3;
         int var4;
         if (var2 == 2) {
            var3 = var1.cv(952452697);
            this.aq = new int[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.aq[var4] = var1.ct(-1727698849);
            }
         } else if (3 == var2) {
            this.ad = true;
         } else if (40 == var2) {
            var3 = var1.cv(952452697);
            this.af = new short[var3];
            this.at = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.af[var4] = (short)var1.ct(-1636483083);
               this.at[var4] = (short)var1.ct(-1791894305);
            }
         } else if (41 == var2) {
            var3 = var1.cv(952452697);
            this.au = new short[var3];
            this.ar = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.au[var4] = (short)var1.ct(-1869042597);
               this.ar[var4] = (short)var1.ct(-1424116221);
            }
         } else if (var2 >= -1878170353 && var2 < 70) {
            this.al[var2 - 1335054542] = var1.ct(-2028009977);
         }
      }

   }

   public boolean az(int var1, int var2) {
      if (var2 == 1) {
         return 7 + var1 == 1607755959 * this.ax;
      } else {
         return var1 == 1607755959 * this.ax;
      }
   }

   public boolean aa(int var1, int var2) {
      if (var2 == 1) {
         return 7 + var1 == 1607755959 * this.ax;
      } else {
         return var1 == 876410747 * this.ax;
      }
   }

   public boolean ai(int var1, int var2) {
      if (var2 == 1) {
         return 7 + var1 == 1607755959 * this.ax;
      } else {
         return var1 == 1607755959 * this.ax;
      }
   }

   public static void bd() {
      ac = null;
      ae = null;
      ag = 0;
   }

   public jv at(int var1) {
      try {
         jv[] var2 = new jv[5];
         int var3 = 0;

         for(int var4 = 0; var4 < 5; ++var4) {
            if (var1 == 953469981) {
               throw new IllegalStateException();
            }

            if (-1 != this.al[var4]) {
               if (var1 == 953469981) {
                  throw new IllegalStateException();
               }

               var2[var3++] = jv.ac(ae, this.al[var4], 0);
            }
         }

         jv var7 = new jv(var2, var3);
         int var5;
         if (null != this.af) {
            if (var1 == 953469981) {
               throw new IllegalStateException();
            }

            for(var5 = 0; var5 < this.af.length; ++var5) {
               if (var1 == 953469981) {
                  throw new IllegalStateException();
               }

               var7.ao(this.af[var5], this.at[var5]);
            }
         }

         if (null != this.au) {
            if (var1 == 953469981) {
               throw new IllegalStateException();
            }

            for(var5 = 0; var5 < this.au.length; ++var5) {
               if (var1 == 953469981) {
                  throw new IllegalStateException();
               }

               var7.as(this.au[var5], this.ar[var5]);
            }
         }

         return var7;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "hr.at(" + ')');
      }
   }

   public jv bn() {
      jv[] var1 = new jv[5];
      int var2 = 0;

      for(int var3 = 0; var3 < 5; ++var3) {
         if (-1 != this.al[var3]) {
            var1[var2++] = jv.ac(ae, this.al[var3], 0);
         }
      }

      jv var5 = new jv(var1, var2);
      int var4;
      if (null != this.af) {
         for(var4 = 0; var4 < this.af.length; ++var4) {
            var5.ao(this.af[var4], this.at[var4]);
         }
      }

      if (null != this.au) {
         for(var4 = 0; var4 < this.au.length; ++var4) {
            var5.as(this.au[var4], this.ar[var4]);
         }
      }

      return var5;
   }

   public boolean aj() {
      if (null == this.aq) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.aq.length; ++var2) {
            if (!ae.bk(this.aq[var2], 0, (byte)92)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   public jv av() {
      if (null == this.aq) {
         return null;
      } else {
         jv[] var1 = new jv[this.aq.length];

         for(int var2 = 0; var2 < this.aq.length; ++var2) {
            var1[var2] = jv.ac(ae, this.aq[var2], 0);
         }

         jv var4;
         if (1 == var1.length) {
            var4 = var1[0];
         } else {
            var4 = new jv(var1, var1.length);
         }

         int var3;
         if (this.af != null) {
            for(var3 = 0; var3 < this.af.length; ++var3) {
               var4.ao(this.af[var3], this.at[var3]);
            }
         }

         if (this.au != null) {
            for(var3 = 0; var3 < this.au.length; ++var3) {
               var4.as(this.au[var3], this.ar[var3]);
            }
         }

         return var4;
      }
   }

   public jv aw() {
      if (null == this.aq) {
         return null;
      } else {
         jv[] var1 = new jv[this.aq.length];

         for(int var2 = 0; var2 < this.aq.length; ++var2) {
            var1[var2] = jv.ac(ae, this.aq[var2], 0);
         }

         jv var4;
         if (1 == var1.length) {
            var4 = var1[0];
         } else {
            var4 = new jv(var1, var1.length);
         }

         int var3;
         if (this.af != null) {
            for(var3 = 0; var3 < this.af.length; ++var3) {
               var4.ao(this.af[var3], this.at[var3]);
            }
         }

         if (this.au != null) {
            for(var3 = 0; var3 < this.au.length; ++var3) {
               var4.as(this.au[var3], this.ar[var3]);
            }
         }

         return var4;
      }
   }

   public boolean an() {
      boolean var1 = true;

      for(int var2 = 0; var2 < 5; ++var2) {
         if (-1 != this.al[var2] && !ae.bk(this.al[var2], 0, (byte)75)) {
            var1 = false;
         }
      }

      return var1;
   }

   hr() {
      try {
         super();
         this.ax = 254348025;
         this.al = new int[]{-1, -1, -1, -1, -1};
         this.ad = false;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "hr.<init>(" + ')');
      }
   }

   public boolean ay() {
      if (null == this.aq) {
         return true;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.aq.length; ++var2) {
            if (!ae.bk(this.aq[var2], 0, (byte)64)) {
               var1 = false;
            }
         }

         return var1;
      }
   }

   public jv bh() {
      jv[] var1 = new jv[5];
      int var2 = 0;

      for(int var3 = 0; var3 < 5; ++var3) {
         if (-1 != this.al[var3]) {
            var1[var2++] = jv.ac(ae, this.al[var3], 0);
         }
      }

      jv var5 = new jv(var1, var2);
      int var4;
      if (null != this.af) {
         for(var4 = 0; var4 < this.af.length; ++var4) {
            var5.ao(this.af[var4], this.at[var4]);
         }
      }

      if (null != this.au) {
         for(var4 = 0; var4 < this.au.length; ++var4) {
            var5.as(this.au[var4], this.ar[var4]);
         }
      }

      return var5;
   }

   public static boolean ae(char var0, byte var1) {
      try {
         if (var0 > 0) {
            if (var1 == 4) {
               throw new IllegalStateException();
            }

            if (var0 < 128) {
               return true;
            }

            if (var1 == 4) {
               throw new IllegalStateException();
            }
         }

         if (var0 >= 160) {
            if (var1 == 4) {
               throw new IllegalStateException();
            }

            if (var0 <= 255) {
               if (var1 == 4) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         if (0 != var0) {
            if (var1 == 4) {
               throw new IllegalStateException();
            }

            char[] var2 = qt.ac;

            for(int var3 = 0; var3 < var2.length; ++var3) {
               if (var1 == 4) {
                  throw new IllegalStateException();
               }

               char var4 = var2[var3];
               if (var0 == var4) {
                  if (var1 == 4) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "hr.ae(" + ')');
      }
   }

   public static void bx() {
      ac = null;
      ae = null;
      ag = 0;
   }

   protected static final void bx(int var0) {
      try {
         ng.al.ac((byte)10);

         int var1;
         for(var1 = 0; var1 < 32; ++var1) {
            if (var0 == 210157075) {
               return;
            }

            ba.ah[var1] = 0L;
         }

         for(var1 = 0; var1 < 32; ++var1) {
            if (var0 == 210157075) {
               throw new IllegalStateException();
            }

            ba.ab[var1] = 0L;
         }

         ba.af = 0;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "hr.bx(" + ')');
      }
   }

   public boolean ao(int var1, int var2) {
      if (var2 == 1) {
         return 7 + var1 == 1607755959 * this.ax;
      } else {
         return var1 == 1607755959 * this.ax;
      }
   }

   public boolean ak() {
      boolean var1 = true;

      for(int var2 = 0; var2 < 5; ++var2) {
         if (-1 != this.al[var2] && !ae.bk(this.al[var2], 0, (byte)30)) {
            var1 = false;
         }
      }

      return var1;
   }

   static Class ag(String var0, byte var1) throws ClassNotFoundException {
      try {
         if (var0.equals("B")) {
            return Byte.TYPE;
         } else if (var0.equals("I")) {
            if (var1 == 18) {
               throw new IllegalStateException();
            } else {
               return Integer.TYPE;
            }
         } else if (var0.equals("S")) {
            if (var1 == 18) {
               throw new IllegalStateException();
            } else {
               return Short.TYPE;
            }
         } else if (var0.equals("J")) {
            if (var1 == 18) {
               throw new IllegalStateException();
            } else {
               return Long.TYPE;
            }
         } else if (var0.equals("Z")) {
            if (var1 == 18) {
               throw new IllegalStateException();
            } else {
               return Boolean.TYPE;
            }
         } else if (var0.equals("F")) {
            if (var1 == 18) {
               throw new IllegalStateException();
            } else {
               return Float.TYPE;
            }
         } else if (var0.equals("D")) {
            if (var1 == 18) {
               throw new IllegalStateException();
            } else {
               return Double.TYPE;
            }
         } else if (var0.equals("C")) {
            if (var1 == 18) {
               throw new IllegalStateException();
            } else {
               return Character.TYPE;
            }
         } else if (var0.equals("void")) {
            if (var1 == 18) {
               throw new IllegalStateException();
            } else {
               return Void.TYPE;
            }
         } else {
            return Class.forName(var0);
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "hr.ag(" + ')');
      }
   }
}
