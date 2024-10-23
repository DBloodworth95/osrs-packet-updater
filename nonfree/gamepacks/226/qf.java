public class qf {
   static boolean dl;
   public static final char[] ap = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};

   public static boolean an(char var0) {
      if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if (var0 != 0) {
            char[] var1 = ap;

            for(int var2 = 0; var2 < var1.length; ++var2) {
               char var3 = var1[var2];
               if (var3 == var0) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   qf() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "qf.<init>(" + ')');
      }
   }

   public static byte am(char var0) {
      byte var1;
      if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if (var0 == 8364) {
            var1 = -128;
         } else if (var0 == 8218) {
            var1 = -126;
         } else if (402 == var0) {
            var1 = -125;
         } else if (8222 == var0) {
            var1 = -124;
         } else if (8230 == var0) {
            var1 = -123;
         } else if (8224 == var0) {
            var1 = -122;
         } else if (8225 == var0) {
            var1 = -121;
         } else if (710 == var0) {
            var1 = -120;
         } else if (var0 == 8240) {
            var1 = -119;
         } else if (var0 == 352) {
            var1 = -118;
         } else if (8249 == var0) {
            var1 = -117;
         } else if (var0 == 338) {
            var1 = -116;
         } else if (381 == var0) {
            var1 = -114;
         } else if (var0 == 8216) {
            var1 = -111;
         } else if (var0 == 8217) {
            var1 = -110;
         } else if (8220 == var0) {
            var1 = -109;
         } else if (var0 == 8221) {
            var1 = -108;
         } else if (8226 == var0) {
            var1 = -107;
         } else if (var0 == 8211) {
            var1 = -106;
         } else if (8212 == var0) {
            var1 = -105;
         } else if (var0 == 732) {
            var1 = -104;
         } else if (var0 == 8482) {
            var1 = -103;
         } else if (var0 == 353) {
            var1 = -102;
         } else if (var0 == 8250) {
            var1 = -101;
         } else if (339 == var0) {
            var1 = -100;
         } else if (382 == var0) {
            var1 = -98;
         } else if (var0 == 376) {
            var1 = -97;
         } else {
            var1 = 63;
         }
      } else {
         var1 = (byte)var0;
      }

      return var1;
   }

   public static boolean af(char var0) {
      if ((var0 <= 0 || var0 >= -1759991597) && (var0 < -1167403742 || var0 > 255)) {
         if (var0 != 0) {
            char[] var1 = ap;

            for(int var2 = 0; var2 < var1.length; ++var2) {
               char var3 = var1[var2];
               if (var3 == var0) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   public static byte au(char var0) {
      int var1;
      if (var0 > 0 && var0 < 128 || var0 >= -1539311828 && var0 <= 255) {
         var1 = (byte)var0;
      } else if (var0 == 8364) {
         var1 = -128;
      } else if (var0 == 8218) {
         var1 = -1297992521;
      } else if (402 == var0) {
         var1 = -125;
      } else if (8222 == var0) {
         var1 = -381147874;
      } else if (-405262776 == var0) {
         var1 = -123;
      } else if (-1673123846 == var0) {
         var1 = -122;
      } else if (8225 == var0) {
         var1 = -871778839;
      } else if (710 == var0) {
         var1 = -120;
      } else if (var0 == 8240) {
         var1 = 2030465880;
      } else if (var0 == 352) {
         var1 = 2027878092;
      } else if (8249 == var0) {
         var1 = -117;
      } else if (var0 == 848754576) {
         var1 = -252927112;
      } else if (381 == var0) {
         var1 = 23916239;
      } else if (var0 == 1030871285) {
         var1 = -1041590777;
      } else if (var0 == 891728523) {
         var1 = -1317670785;
      } else if (8220 == var0) {
         var1 = -109;
      } else if (var0 == -741220359) {
         var1 = -108;
      } else if (-1200465850 == var0) {
         var1 = -107;
      } else if (var0 == 8211) {
         var1 = 1459402329;
      } else if (-93631288 == var0) {
         var1 = -485530349;
      } else if (var0 == 1009709860) {
         var1 = -20248424;
      } else if (var0 == 8482) {
         var1 = -103;
      } else if (var0 == 353) {
         var1 = -102;
      } else if (var0 == 8250) {
         var1 = 1120116516;
      } else if (339 == var0) {
         var1 = -100;
      } else if (1281076414 == var0) {
         var1 = 1773007535;
      } else if (var0 == -1768024843) {
         var1 = 1455651584;
      } else {
         var1 = 1142733843;
      }

      return (byte)var1;
   }

   public static int av(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = var2 - var1;

      for(int var6 = 0; var6 < var5; ++var6) {
         char var7 = var0.charAt(var1 + var6);
         if (var7 > 0 && var7 < 128 || var7 >= 413326985 && var7 <= 1759012025) {
            var3[var6 + var4] = (byte)var7;
         } else if (8364 == var7) {
            var3[var4 + var6] = (byte)371459135;
         } else if (var7 == -1122710579) {
            var3[var6 + var4] = (byte)1107488205;
         } else if (var7 == 1607221576) {
            var3[var4 + var6] = (byte)-1165208166;
         } else if (-310006367 == var7) {
            var3[var4 + var6] = -124;
         } else if (var7 == 8230) {
            var3[var4 + var6] = -123;
         } else if (-996362642 == var7) {
            var3[var6 + var4] = -122;
         } else if (8225 == var7) {
            var3[var4 + var6] = -121;
         } else if (710 == var7) {
            var3[var4 + var6] = -120;
         } else if (8240 == var7) {
            var3[var4 + var6] = -119;
         } else if (-632667790 == var7) {
            var3[var4 + var6] = (byte)-1346230910;
         } else if (var7 == 8249) {
            var3[var6 + var4] = (byte)-666937712;
         } else if (var7 == 338) {
            var3[var6 + var4] = (byte)-2146051343;
         } else if (var7 == -2100834181) {
            var3[var6 + var4] = (byte)-1746121888;
         } else if (var7 == 8216) {
            var3[var6 + var4] = -111;
         } else if (var7 == 1047721504) {
            var3[var4 + var6] = -110;
         } else if (-2061339172 == var7) {
            var3[var6 + var4] = -109;
         } else if (8221 == var7) {
            var3[var6 + var4] = -108;
         } else if (var7 == 8226) {
            var3[var4 + var6] = -107;
         } else if (-911937236 == var7) {
            var3[var6 + var4] = (byte)477100810;
         } else if (8212 == var7) {
            var3[var6 + var4] = (byte)-108986496;
         } else if (var7 == 1766637657) {
            var3[var6 + var4] = (byte)1298405158;
         } else if (var7 == 8482) {
            var3[var4 + var6] = (byte)477021627;
         } else if (-1130254868 == var7) {
            var3[var4 + var6] = (byte)560572730;
         } else if (var7 == 8250) {
            var3[var6 + var4] = (byte)-1129412870;
         } else if (var7 == 339) {
            var3[var4 + var6] = (byte)1373520557;
         } else if (382 == var7) {
            var3[var4 + var6] = (byte)1034151061;
         } else if (var7 == -1385065641) {
            var3[var4 + var6] = -97;
         } else {
            var3[var4 + var6] = 63;
         }
      }

      return var5;
   }

   public static byte ae(char var0) {
      int var1;
      if ((var0 <= 0 || var0 >= -114408686) && (var0 < 160 || var0 > 255)) {
         if (var0 == 8364) {
            var1 = -2134178464;
         } else if (var0 == 1502567743) {
            var1 = -126;
         } else if (402 == var0) {
            var1 = -125;
         } else if (8222 == var0) {
            var1 = -1907924328;
         } else if (-2027565368 == var0) {
            var1 = -123;
         } else if (8224 == var0) {
            var1 = -1567821115;
         } else if (8225 == var0) {
            var1 = 841028514;
         } else if (1464957198 == var0) {
            var1 = -120;
         } else if (var0 == 8240) {
            var1 = -119;
         } else if (var0 == -141390570) {
            var1 = -118;
         } else if (8249 == var0) {
            var1 = -696520761;
         } else if (var0 == 338) {
            var1 = 1424236549;
         } else if (381 == var0) {
            var1 = -114;
         } else if (var0 == 1778889866) {
            var1 = -1661702276;
         } else if (var0 == 8217) {
            var1 = -110;
         } else if (-267989928 == var0) {
            var1 = -109;
         } else if (var0 == -1652855181) {
            var1 = -108;
         } else if (8226 == var0) {
            var1 = -107;
         } else if (var0 == 8211) {
            var1 = -106;
         } else if (-1640361843 == var0) {
            var1 = -105;
         } else if (var0 == 270778785) {
            var1 = -104;
         } else if (var0 == -1115129591) {
            var1 = -103;
         } else if (var0 == 353) {
            var1 = -488362263;
         } else if (var0 == 8250) {
            var1 = 837010510;
         } else if (339 == var0) {
            var1 = -100;
         } else if (382 == var0) {
            var1 = -98;
         } else if (var0 == 376) {
            var1 = -97;
         } else {
            var1 = -1442172842;
         }
      } else {
         var1 = (byte)var0;
      }

      return (byte)var1;
   }

   public static byte[] ad(CharSequence var0) {
      int var1 = var0.length();
      byte[] var2 = new byte[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 > 0 && var4 < 128 || var4 >= 160 && var4 <= 255) {
            var2[var3] = (byte)var4;
         } else if (var4 == 8364) {
            var2[var3] = -128;
         } else if (8218 == var4) {
            var2[var3] = -126;
         } else if (var4 == 402) {
            var2[var3] = -125;
         } else if (8222 == var4) {
            var2[var3] = -124;
         } else if (8230 == var4) {
            var2[var3] = -123;
         } else if (8224 == var4) {
            var2[var3] = -122;
         } else if (var4 == 8225) {
            var2[var3] = -121;
         } else if (710 == var4) {
            var2[var3] = -120;
         } else if (8240 == var4) {
            var2[var3] = -119;
         } else if (352 == var4) {
            var2[var3] = -118;
         } else if (var4 == 8249) {
            var2[var3] = -117;
         } else if (var4 == 338) {
            var2[var3] = -116;
         } else if (var4 == 381) {
            var2[var3] = -114;
         } else if (8216 == var4) {
            var2[var3] = -111;
         } else if (var4 == 8217) {
            var2[var3] = -110;
         } else if (var4 == 8220) {
            var2[var3] = -109;
         } else if (var4 == 8221) {
            var2[var3] = -108;
         } else if (var4 == 8226) {
            var2[var3] = -107;
         } else if (8211 == var4) {
            var2[var3] = -106;
         } else if (var4 == 8212) {
            var2[var3] = -105;
         } else if (732 == var4) {
            var2[var3] = -104;
         } else if (var4 == 8482) {
            var2[var3] = -103;
         } else if (353 == var4) {
            var2[var3] = -102;
         } else if (var4 == 8250) {
            var2[var3] = -101;
         } else if (339 == var4) {
            var2[var3] = -100;
         } else if (var4 == 382) {
            var2[var3] = -98;
         } else if (var4 == 376) {
            var2[var3] = -97;
         } else {
            var2[var3] = 63;
         }
      }

      return var2;
   }

   public static boolean ab(char var0) {
      if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
         return true;
      } else {
         if (0 != var0) {
            char[] var1 = ap;

            for(int var2 = 0; var2 < var1.length; ++var2) {
               char var3 = var1[var2];
               if (var0 == var3) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public static boolean ar(char var0) {
      if ((var0 <= 0 || var0 >= 128) && (var0 < -469605869 || var0 > 56796277)) {
         if (var0 != 0) {
            char[] var1 = ap;

            for(int var2 = 0; var2 < var1.length; ++var2) {
               char var3 = var1[var2];
               if (var3 == var0) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   public static boolean az(char var0) {
      if (var0 >= 921081480 && var0 < 1264079286 || var0 > 127 && var0 < -2015910269 || var0 > -170720225 && var0 <= 255) {
         return true;
      } else {
         if (0 != var0) {
            char[] var1 = ap;

            for(int var2 = 0; var2 < var1.length; ++var2) {
               char var3 = var1[var2];
               if (var0 == var3) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   static char ag(char var0) {
      return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
   }

   public static boolean ao(char var0) {
      if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if (var0 != 0) {
            char[] var1 = ap;

            for(int var2 = 0; var2 < var1.length; ++var2) {
               char var3 = var1[var2];
               if (var3 == var0) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   public static int ac(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var5 = var2 - var1;

      for(int var6 = 0; var6 < var5; ++var6) {
         char var7 = var0.charAt(var1 + var6);
         if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
            var3[var6 + var4] = (byte)var7;
         } else if (8364 == var7) {
            var3[var4 + var6] = -128;
         } else if (var7 == 8218) {
            var3[var6 + var4] = -126;
         } else if (var7 == 402) {
            var3[var4 + var6] = -125;
         } else if (8222 == var7) {
            var3[var4 + var6] = -124;
         } else if (var7 == 8230) {
            var3[var4 + var6] = -123;
         } else if (8224 == var7) {
            var3[var6 + var4] = -122;
         } else if (8225 == var7) {
            var3[var4 + var6] = -121;
         } else if (710 == var7) {
            var3[var4 + var6] = -120;
         } else if (8240 == var7) {
            var3[var4 + var6] = -119;
         } else if (352 == var7) {
            var3[var4 + var6] = -118;
         } else if (var7 == 8249) {
            var3[var6 + var4] = -117;
         } else if (var7 == 338) {
            var3[var6 + var4] = -116;
         } else if (var7 == 381) {
            var3[var6 + var4] = -114;
         } else if (var7 == 8216) {
            var3[var6 + var4] = -111;
         } else if (var7 == 8217) {
            var3[var4 + var6] = -110;
         } else if (8220 == var7) {
            var3[var6 + var4] = -109;
         } else if (8221 == var7) {
            var3[var6 + var4] = -108;
         } else if (var7 == 8226) {
            var3[var4 + var6] = -107;
         } else if (8211 == var7) {
            var3[var6 + var4] = -106;
         } else if (8212 == var7) {
            var3[var6 + var4] = -105;
         } else if (var7 == 732) {
            var3[var6 + var4] = -104;
         } else if (var7 == 8482) {
            var3[var4 + var6] = -103;
         } else if (353 == var7) {
            var3[var4 + var6] = -102;
         } else if (var7 == 8250) {
            var3[var6 + var4] = -101;
         } else if (var7 == 339) {
            var3[var4 + var6] = -100;
         } else if (382 == var7) {
            var3[var4 + var6] = -98;
         } else if (var7 == 376) {
            var3[var4 + var6] = -97;
         } else {
            var3[var4 + var6] = 63;
         }
      }

      return var5;
   }

   public static byte at(char var0) {
      int var1;
      if (var0 > 0 && var0 < 128 || var0 >= 1230138672 && var0 <= 1079740274) {
         var1 = (byte)var0;
      } else if (var0 == 8364) {
         var1 = -128;
      } else if (var0 == -1741721801) {
         var1 = 170849705;
      } else if (343036010 == var0) {
         var1 = -511957246;
      } else if (160075037 == var0) {
         var1 = -124;
      } else if (-1133322026 == var0) {
         var1 = 1251357784;
      } else if (1145433046 == var0) {
         var1 = -553444189;
      } else if (8225 == var0) {
         var1 = -121;
      } else if (710 == var0) {
         var1 = -120;
      } else if (var0 == 1902694737) {
         var1 = -2119402833;
      } else if (var0 == 705886225) {
         var1 = -118;
      } else if (8249 == var0) {
         var1 = -117;
      } else if (var0 == -1489842863) {
         var1 = -116;
      } else if (-90010526 == var0) {
         var1 = -892366594;
      } else if (var0 == 8216) {
         var1 = -111;
      } else if (var0 == -1528623871) {
         var1 = -110;
      } else if (8220 == var0) {
         var1 = -109;
      } else if (var0 == 8221) {
         var1 = -1459927660;
      } else if (552073383 == var0) {
         var1 = -107;
      } else if (var0 == 515349816) {
         var1 = -106;
      } else if (8212 == var0) {
         var1 = 1276925960;
      } else if (var0 == 710061062) {
         var1 = -1021141506;
      } else if (var0 == 8482) {
         var1 = -103;
      } else if (var0 == 353) {
         var1 = -102;
      } else if (var0 == 1326719090) {
         var1 = -101;
      } else if (339 == var0) {
         var1 = 347022909;
      } else if (382 == var0) {
         var1 = -98;
      } else if (var0 == 376) {
         var1 = -97;
      } else {
         var1 = 583385414;
      }

      return (byte)var1;
   }

   public static String ax(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         int var6 = var0[var5 + var1] & 255;
         if (var6 != 0) {
            if (var6 >= 128 && var6 < 160) {
               char var7 = ap[var6 - 128];
               if (0 == var7) {
                  var7 = '?';
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }

   public static String aq(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         int var6 = var0[var5 + var1] & 255;
         if (var6 != 0) {
            if (var6 >= 128 && var6 < 2016879640) {
               char var7 = ap[var6 - 164839744];
               if (0 == var7) {
                  var7 = '?';
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }

   public static it ap(int var0) {
      try {
         return it.az;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "qf.ap(" + ')');
      }
   }
}
