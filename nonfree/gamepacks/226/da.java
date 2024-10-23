public class da extends tp {
   String aw;
   int[] ak;
   int as;
   int[] aj;
   String[] ai;
   int ay;
   static mi ap = new mi(128);
   int ae;
   int am;
   um[] at;

   um[] ag(int var1) {
      return new um[var1];
   }

   um[] ai(int var1, short var2) {
      try {
         return new um[var1];
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "da.ai(" + ')');
      }
   }

   static da as(int var0) {
      da var1 = (da)ap.ap((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = aw.fl.bm(var0, 0, 879109136);
         if (null == var2) {
            return null;
         } else {
            var1 = dm.aj(var2, 1677839483);
            ap.ak(var1, (long)var0);
            return var1;
         }
      }
   }

   static da ae(int var0) {
      da var1 = (da)ap.ap((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = aw.fl.bm(var0, 0, 1833070078);
         if (null == var2) {
            return null;
         } else {
            var1 = dm.aj(var2, 1604419833);
            ap.ak(var1, (long)var0);
            return var1;
         }
      }
   }

   um[] ad(int var1) {
      return new um[var1];
   }

   public static String ak(long var0) {
      try {
         if (var0 > 0L && var0 < 6582952005840035281L) {
            if (var0 % 37L == 0L) {
               return null;
            } else {
               int var2 = 0;

               for(long var3 = var0; 0L != var3; var3 /= 37L) {
                  ++var2;
               }

               StringBuilder var5;
               char var8;
               for(var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
                  long var6 = var0;
                  var0 /= 37L;
                  var8 = qo.ap[(int)(var6 - var0 * 37L)];
                  if (var8 == '_') {
                     int var9 = var5.length() - 1;
                     var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                     var8 = 160;
                  }
               }

               var5.reverse();
               var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
               return var5.toString();
            }
         } else {
            return null;
         }
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "da.ak(" + ')');
      }
   }

   static da au(int var0, int var1, int var2) {
      int var3 = mr.ap(var1, var0, -1983951584);
      da var4 = ig.ak(var3, var0, 1822836190);
      if (var4 != null) {
         return var4;
      } else {
         var3 = ui.aw(var2, var0, (byte)-37);
         var4 = ig.ak(var3, var0, 1536518713);
         if (null != var4) {
            return var4;
         } else {
            var3 = dg.ak(var0, 612132244);
            var4 = ig.ak(var3, var0, 1982496073);
            return null != var4 ? var4 : null;
         }
      }
   }

   static da an(int var0, int var1) {
      da var2 = (da)ap.ap((long)(var0 << 16));
      if (null != var2) {
         return var2;
      } else {
         String var3 = String.valueOf(var0);
         int var4 = aw.fl.cf(var3, (byte)124);
         if (-1 == var4) {
            return null;
         } else {
            byte[] var5 = aw.fl.bf(var4, -598861087);
            if (null != var5) {
               if (var5.length <= 1) {
                  return null;
               }

               var2 = dm.aj(var5, 1759777576);
               if (null != var2) {
                  ap.ak(var2, (long)(var0 << 16));
                  return var2;
               }
            }

            return null;
         }
      }
   }

   static da at(int var0, int var1, int var2) {
      int var3 = mr.ap(var1, var0, -1983951584);
      da var4 = ig.ak(var3, var0, 1458507521);
      if (var4 != null) {
         return var4;
      } else {
         var3 = ui.aw(var2, var0, (byte)-21);
         var4 = ig.ak(var3, var0, 1940204220);
         if (null != var4) {
            return var4;
         } else {
            var3 = dg.ak(var0, 993044217);
            var4 = ig.ak(var3, var0, 1617336365);
            return null != var4 ? var4 : null;
         }
      }
   }

   static da af(int var0, int var1) {
      da var2 = (da)ap.ap((long)(var0 << 16));
      if (null != var2) {
         return var2;
      } else {
         String var3 = String.valueOf(var0);
         int var4 = aw.fl.cf(var3, (byte)109);
         if (-1 == var4) {
            return null;
         } else {
            byte[] var5 = aw.fl.bf(var4, 2105224946);
            if (null != var5) {
               if (var5.length <= 1) {
                  return null;
               }

               var2 = dm.aj(var5, 1834903797);
               if (null != var2) {
                  ap.ak(var2, (long)(var0 << 16));
                  return var2;
               }
            }

            return null;
         }
      }
   }

   static da ar(byte[] var0) {
      da var1 = new da();
      vl var2 = new vl(var0);
      var2.am = -725588083 * (var2.ae.length - 2);
      int var3 = var2.ce(1410334939);
      int var4 = var2.ae.length - 2 - var3 - 12;
      var2.am = var4 * -725588083;
      int var5 = var2.ch(1203709469);
      var1.ay = var2.ce(1638684315) * -218672893;
      var1.as = var2.ce(1441126874) * -886398039;
      var1.ae = var2.ce(1631486540) * -1151324501;
      var1.am = var2.ce(1464309441) * 427624333;
      int var6 = var2.cy((short)-23972);
      int var7;
      int var8;
      if (var6 > 0) {
         var1.at = var1.ai(var6, (short)8518);

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = var2.ce(640503054);
            um var9 = new um(var8 > 0 ? di.ay(var8, -1464365283) : 1);
            var1.at[var7] = var9;

            while(var8-- > 0) {
               int var10 = var2.ch(1203709469);
               int var11 = var2.ch(1203709469);
               var9.aw(new tb(var11), (long)var10);
            }
         }
      }

      var2.am = 0;
      var1.aw = var2.cm(-1273187003);
      var1.ak = new int[var5];
      var1.aj = new int[var5];
      var1.ai = new String[var5];

      for(var7 = 0; -1689308347 * var2.am < var4; var1.ak[var7++] = var8) {
         var8 = var2.ce(910783556);
         if (3 == var8) {
            var1.ai[var7] = var2.cw(2021933187);
         } else if (var8 < 100 && 21 != var8 && var8 != 38 && 39 != var8) {
            var1.aj[var7] = var2.ch(1203709469);
         } else {
            var1.aj[var7] = var2.cy((short)-11487);
         }
      }

      return var1;
   }

   static da ab(byte[] var0) {
      da var1 = new da();
      vl var2 = new vl(var0);
      var2.am = -725588083 * (var2.ae.length - 2);
      int var3 = var2.ce(393322959);
      int var4 = var2.ae.length - 2 - var3 - 12;
      var2.am = var4 * -725588083;
      int var5 = var2.ch(1203709469);
      var1.ay = var2.ce(807056719) * -218672893;
      var1.as = var2.ce(2122835479) * -886398039;
      var1.ae = var2.ce(1955166923) * -1151324501;
      var1.am = var2.ce(302917747) * 427624333;
      int var6 = var2.cy((short)-13263);
      int var7;
      int var8;
      if (var6 > 0) {
         var1.at = var1.ai(var6, (short)22369);

         for(var7 = 0; var7 < var6; ++var7) {
            var8 = var2.ce(2006952566);
            um var9 = new um(var8 > 0 ? di.ay(var8, -1933125692) : 1);
            var1.at[var7] = var9;

            while(var8-- > 0) {
               int var10 = var2.ch(1203709469);
               int var11 = var2.ch(1203709469);
               var9.aw(new tb(var11), (long)var10);
            }
         }
      }

      var2.am = 0;
      var1.aw = var2.cm(-349766928);
      var1.ak = new int[var5];
      var1.aj = new int[var5];
      var1.ai = new String[var5];

      for(var7 = 0; -1689308347 * var2.am < var4; var1.ak[var7++] = var8) {
         var8 = var2.ce(1261189963);
         if (3 == var8) {
            var1.ai[var7] = var2.cw(1961856889);
         } else if (var8 < 100 && 21 != var8 && var8 != 38 && 39 != var8) {
            var1.aj[var7] = var2.ch(1203709469);
         } else {
            var1.aj[var7] = var2.cy((short)-17583);
         }
      }

      return var1;
   }

   um[] az(int var1) {
      return new um[var1];
   }

   static da am(int var0, int var1, int var2) {
      int var3 = mr.ap(var1, var0, -1983951584);
      da var4 = ig.ak(var3, var0, 1904005904);
      if (var4 != null) {
         return var4;
      } else {
         var3 = ui.aw(var2, var0, (byte)-26);
         var4 = ig.ak(var3, var0, 1331006334);
         if (null != var4) {
            return var4;
         } else {
            var3 = dg.ak(var0, 1937805374);
            var4 = ig.ak(var3, var0, 1778973851);
            return null != var4 ? var4 : null;
         }
      }
   }

   da() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "da.<init>(" + ')');
      }
   }

   static void ac() {
      ap.aj();
   }

   static void av() {
      ap.aj();
   }

   static void ax() {
      ap.aj();
   }

   static da ao(int var0, int var1) {
      da var2 = (da)ap.ap((long)(var0 << 16));
      if (null != var2) {
         return var2;
      } else {
         String var3 = String.valueOf(var0);
         int var4 = aw.fl.cf(var3, (byte)68);
         if (-1 == var4) {
            return null;
         } else {
            byte[] var5 = aw.fl.bf(var4, 1447846850);
            if (null != var5) {
               if (var5.length <= 1) {
                  return null;
               }

               var2 = dm.aj(var5, 2098719252);
               if (null != var2) {
                  ap.ak(var2, (long)(var0 << 16));
                  return var2;
               }
            }

            return null;
         }
      }
   }

   static void or(boolean var0, int var1) {
      try {
         client.nz = var0;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "da.or(" + ')');
      }
   }
}
