public class dt extends tr {
   int af;
   String ae;
   static final int ba = 16;
   int[] am;
   static ml ac = new ml(128);
   int aq;
   int au;
   int at;
   int[] ag;
   static final int ao = 21;
   public static final int bc = 67;
   String[] ax;
   static int ci;
   ui[] ar;

   static dt ad(int var0, int var1, int var2) {
      int var3 = var0 + (var1 << 8);
      dt var5 = fp.ag(var3, var0, (byte)1);
      if (null != var5) {
         return var5;
      } else {
         int var4 = bd.ac(var2, var0, 603512528);
         var5 = fp.ag(var4, var0, (byte)1);
         if (null != var5) {
            return var5;
         } else {
            int var6 = -512 + var0;
            var5 = fp.ag(var6, var0, (byte)1);
            return null != var5 ? var5 : null;
         }
      }
   }

   dt() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "dt.<init>(" + ')');
      }
   }

   ui[] ax(int var1, int var2) {
      try {
         return new ui[var1];
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "dt.ax(" + ')');
      }
   }

   static dt al(int var0, int var1, int var2) {
      int var3 = var0 + (var1 << 8);
      dt var5 = fp.ag(var3, var0, (byte)1);
      if (null != var5) {
         return var5;
      } else {
         int var4 = bd.ac(var2, var0, -230425281);
         var5 = fp.ag(var4, var0, (byte)1);
         if (null != var5) {
            return var5;
         } else {
            int var6 = -512 + var0;
            var5 = fp.ag(var6, var0, (byte)1);
            return null != var5 ? var5 : null;
         }
      }
   }

   static dt au(int var0, int var1, int var2) {
      int var3 = var0 + (var1 << 8);
      dt var5 = fp.ag(var3, var0, (byte)1);
      if (null != var5) {
         return var5;
      } else {
         int var4 = bd.ac(var2, var0, 1758337047);
         var5 = fp.ag(var4, var0, (byte)1);
         if (null != var5) {
            return var5;
         } else {
            int var6 = -512 + var0;
            var5 = fp.ag(var6, var0, (byte)1);
            return null != var5 ? var5 : null;
         }
      }
   }

   static dt ar(int var0, int var1, int var2) {
      int var3 = var0 + (var1 << 8);
      dt var5 = fp.ag(var3, var0, (byte)1);
      if (null != var5) {
         return var5;
      } else {
         int var4 = bd.ac(var2, var0, -1806144661);
         var5 = fp.ag(var4, var0, (byte)1);
         if (null != var5) {
            return var5;
         } else {
            int var6 = -512 + var0;
            var5 = fp.ag(var6, var0, (byte)1);
            return null != var5 ? var5 : null;
         }
      }
   }

   static dt ap(int var0, int var1) {
      dt var2 = (dt)ac.ac((long)(var0 << 16));
      if (var2 != null) {
         return var2;
      } else {
         String var3 = String.valueOf(var0);
         int var4 = hi.fg.cg(var3, (short)25115);
         if (var4 == -1) {
            return null;
         } else {
            byte[] var5 = hi.fg.ch(var4, (byte)-50);
            if (var5 != null) {
               if (var5.length <= 1) {
                  return null;
               }

               var2 = gb.am(var5, -1937519156);
               if (var2 != null) {
                  ac.ag(var2, (long)(var0 << 16));
                  return var2;
               }
            }

            return null;
         }
      }
   }

   ui[] ai(int var1) {
      return new ui[var1];
   }

   static dt ah(int var0, int var1) {
      dt var2 = (dt)ac.ac((long)(var0 << 16));
      if (var2 != null) {
         return var2;
      } else {
         String var3 = String.valueOf(var0);
         int var4 = hi.fg.cg(var3, (short)-10418);
         if (var4 == -1) {
            return null;
         } else {
            byte[] var5 = hi.fg.ch(var4, (byte)-6);
            if (var5 != null) {
               if (var5.length <= 1) {
                  return null;
               }

               var2 = gb.am(var5, -1983060635);
               if (var2 != null) {
                  ac.ag(var2, (long)(var0 << 16));
                  return var2;
               }
            }

            return null;
         }
      }
   }

   static dt ab(byte[] var0) {
      dt var1 = new dt();
      vf var2 = new vf(var0);
      var2.au = -1864458299 * (var2.at.length - 2);
      int var3 = var2.ct(-1619966057);
      int var4 = var2.at.length - 2 - var3 - 12;
      var2.au = -1864458299 * var4;
      int var5 = var2.cz(-1734056172);
      var1.aq = var2.ct(-1969876560) * -1179519133;
      var1.af = var2.ct(-2052739186) * 976022541;
      var1.at = var2.ct(-2027309433) * -1765451081;
      var1.au = var2.ct(-1708072335) * 467334413;
      int var6 = var2.cv(952452697);
      int var7;
      int var8;
      if (var6 > 0) {
         var1.ar = var1.ax(var6, -862236728);

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = var2.ct(-1713864133);
            ui var9 = new ui(var8 > 0 ? at.ax(var8, 2091449114) : 1);
            var1.ar[var7] = var9;

            while(var8-- > 0) {
               int var10 = var2.cz(-1734056172);
               int var11 = var2.cz(-1734056172);
               var9.ae(new th(var11), (long)var10);
            }
         }
      }

      var2.au = 0;
      var1.ae = var2.ca(-1741758726);
      var1.ag = new int[var5];
      var1.am = new int[var5];
      var1.ax = new String[var5];

      for(var7 = 0; var2.au * -1027766515 < var4; var1.ag[var7++] = var8) {
         var8 = var2.ct(-1438749603);
         if (var8 == 3) {
            var1.ax[var7] = var2.cs(1207876531);
         } else if (var8 < 100 && var8 != 21 && 38 != var8 && var8 != 39) {
            var1.am[var7] = var2.cz(-1734056172);
         } else {
            var1.am[var7] = var2.cv(952452697);
         }
      }

      return var1;
   }

   static dt at(int var0) {
      dt var1 = (dt)ac.ac((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = hi.fg.bt(var0, 0, (byte)93);
         if (var2 == null) {
            return null;
         } else {
            var1 = gb.am(var2, -2006062947);
            ac.ag(var1, (long)var0);
            return var1;
         }
      }
   }

   static dt az(byte[] var0) {
      dt var1 = new dt();
      vf var2 = new vf(var0);
      var2.au = -1864458299 * (var2.at.length - 2);
      int var3 = var2.ct(-2093584245);
      int var4 = var2.at.length - 2 - var3 - 12;
      var2.au = -1864458299 * var4;
      int var5 = var2.cz(-1734056172);
      var1.aq = var2.ct(-1361742030) * -1179519133;
      var1.af = var2.ct(-1638675413) * 976022541;
      var1.at = var2.ct(-2120406873) * -1765451081;
      var1.au = var2.ct(-1724421665) * 467334413;
      int var6 = var2.cv(952452697);
      int var7;
      int var8;
      if (var6 > 0) {
         var1.ar = var1.ax(var6, -862236728);

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = var2.ct(-1897985079);
            ui var9 = new ui(var8 > 0 ? at.ax(var8, 1774036427) : 1);
            var1.ar[var7] = var9;

            while(var8-- > 0) {
               int var10 = var2.cz(-1734056172);
               int var11 = var2.cz(-1734056172);
               var9.ae(new th(var11), (long)var10);
            }
         }
      }

      var2.au = 0;
      var1.ae = var2.ca(-760009348);
      var1.ag = new int[var5];
      var1.am = new int[var5];
      var1.ax = new String[var5];

      for(var7 = 0; var2.au * -1027766515 < var4; var1.ag[var7++] = var8) {
         var8 = var2.ct(-1342726677);
         if (var8 == 3) {
            var1.ax[var7] = var2.cs(1791611623);
         } else if (var8 < 100 && var8 != 21 && 38 != var8 && var8 != 39) {
            var1.am[var7] = var2.cz(-1734056172);
         } else {
            var1.am[var7] = var2.cv(952452697);
         }
      }

      return var1;
   }

   ui[] aa(int var1) {
      return new ui[var1];
   }

   static dt af(int var0) {
      dt var1 = (dt)ac.ac((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = hi.fg.bt(var0, 0, (byte)60);
         if (var2 == null) {
            return null;
         } else {
            var1 = gb.am(var2, -2099319891);
            ac.ag(var1, (long)var0);
            return var1;
         }
      }
   }

   static void ao() {
      ac.am();
   }

   static void as() {
      ac.am();
   }

   static void jm(byte var0) {
      try {
         for(kp var1 = (kp)client.rl.af(); var1 != null; var1 = (kp)client.rl.au()) {
            if (var0 == 31) {
               return;
            }

            var1.jb();
         }

      } catch (RuntimeException var2) {
         throw vk.ae(var2, "dt.jm(" + ')');
      }
   }

   static int jw(byte var0) {
      try {
         byte var10000;
         if (client.rw) {
            if (var0 == 1) {
               throw new IllegalStateException();
            }

            var10000 = 2;
         } else {
            var10000 = 1;
         }

         return var10000;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "dt.jw(" + ')');
      }
   }
}
