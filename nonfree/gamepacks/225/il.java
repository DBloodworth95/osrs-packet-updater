import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class il {
   static String bk;
   static String hf;
   static final int ac = 1048576000;
   static final String ar = "random.dat";
   public static ua ad = null;
   public static ua ah = null;
   public static ua ap = null;
   static final int as = 1;
   static String av;
   static boolean dc;
   static File am;
   static final int ae = 1048576;
   static final int at = 2;
   static vt[] kh;

   static final void ap(byte var0) {
      try {
         qa.au(ok.hk, (byte)20);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "il.ap(" + ')');
      }
   }

   static int ad(String var0, int var1) {
      try {
         if (var0.equals("centre")) {
            if (var1 >= 1987090600) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else {
            if (!var0.equals("bottom")) {
               if (var1 >= 1987090600) {
                  throw new IllegalStateException();
               }

               if (!var0.equals("right")) {
                  return 0;
               }

               if (var1 >= 1987090600) {
                  throw new IllegalStateException();
               }
            }

            return 2;
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "il.ad(" + ')');
      }
   }

   public static void ax(String var0, String var1, String var2, int var3, int var4) throws IOException {
      if (null != var1 && !var1.isEmpty()) {
         var0 = var0 + "-" + var1;
      }

      gn.aq = var4 * -1857496749;
      sb.az = var3 * -1693620107;

      try {
         ip.aj = System.getProperty("os.name");
      } catch (Exception var26) {
         ip.aj = "Unknown";
      }

      hr.ay = ip.aj.toLowerCase();
      av = null;

      try {
         av = System.getProperty("jagex.userhome");
      } catch (Exception var25) {
      }

      if (av == null) {
         try {
            av = System.getProperty("user.home");
         } catch (Exception var24) {
         }
      }

      if (av != null) {
         av = av + "/";
      }

      try {
         if (hr.ay.startsWith("win")) {
            if (av == null) {
               av = System.getenv("USERPROFILE");
            }
         } else if (av == null) {
            av = System.getenv("HOME");
         }

         if (null != av) {
            av = av + "/";
         }
      } catch (Exception var23) {
      }

      if (null == av) {
         av = "~/";
      }

      ie.aa = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", av, "/tmp/", ""};
      vo.ai = new String[]{".jagex_cache_" + -669571107 * sb.az, ".file_store_" + 1045127685 * sb.az};
      int var5 = 0;

      label297:
      while(var5 < 4) {
         String var7 = 0 == var5 ? "" : "" + var5;
         am = new File(av, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat");
         String var8 = null;
         String var9 = null;
         boolean var10 = false;
         vf var12;
         int var13;
         int var15;
         File var39;
         if (am.exists()) {
            try {
               ud var11 = new ud(am, "rw", 10000L);

               for(var12 = new vf((int)var11.ax(1318728242)); -1027766515 * var12.au < var12.at.length; var12.au += -1864458299 * var13) {
                  var13 = var11.aq(var12.at, -1825184951 * var12.au, var12.at.length - var12.au * 910401354, (byte)0);
                  if (-1 == var13) {
                     throw new IOException();
                  }
               }

               var12.au = 0;
               var13 = var12.cv(952452697);
               if (var13 < 1 || var13 > 3) {
                  throw new IOException("" + var13);
               }

               int var14 = 0;
               if (var13 > 1) {
                  var14 = var12.cv(952452697);
               }

               if (var13 <= 2) {
                  var8 = var12.cp(-1147019783);
                  if (var14 == 1) {
                     var9 = var12.cp(-1147019783);
                  }
               } else {
                  var8 = var12.cb((byte)53);
                  if (1 == var14) {
                     var9 = var12.cb((byte)-37);
                  }
               }

               var11.ag((byte)-83);
            } catch (IOException var29) {
               var29.printStackTrace();
            }

            if (var8 != null) {
               var39 = new File(var8);
               if (!var39.exists()) {
                  var8 = null;
               }
            }

            if (var8 != null) {
               var39 = new File(var8, "test.dat");

               boolean var44;
               try {
                  RandomAccessFile var48 = new RandomAccessFile(var39, "rw");
                  var15 = var48.read();
                  var48.seek(0L);
                  var48.write(var15);
                  var48.seek(0L);
                  var48.close();
                  var39.delete();
                  var44 = true;
               } catch (Exception var22) {
                  var44 = false;
               }

               if (!var44) {
                  var8 = null;
               }
            }
         }

         if (var8 == null && var5 == 0) {
            label271:
            for(int var36 = 0; var36 < vo.ai.length; ++var36) {
               for(int var42 = 0; var42 < ie.aa.length; ++var42) {
                  File var46 = new File(ie.aa[var42] + vo.ai[var36] + File.separatorChar + var0 + File.separatorChar);
                  if (var46.exists()) {
                     File var49 = new File(var46, "test.dat");

                     boolean var51;
                     try {
                        RandomAccessFile var16 = new RandomAccessFile(var49, "rw");
                        int var17 = var16.read();
                        var16.seek(0L);
                        var16.write(var17);
                        var16.seek(0L);
                        var16.close();
                        var49.delete();
                        var51 = true;
                     } catch (Exception var21) {
                        var51 = false;
                     }

                     if (var51) {
                        var8 = var46.toString();
                        var10 = true;
                        break label271;
                     }
                  }
               }
            }
         }

         if (null == var8) {
            var8 = av + File.separatorChar + "jagexcache" + var7 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
            var10 = true;
         }

         File var38;
         if (null != var9) {
            var38 = new File(var9);
            var39 = new File(var8);

            try {
               File[] var47 = var38.listFiles();
               File[] var53 = var47;

               for(var15 = 0; var15 < var53.length; ++var15) {
                  File var52 = var53[var15];
                  File var55 = new File(var39, var52.getName());
                  boolean var18 = var52.renameTo(var55);
                  if (!var18) {
                     throw new IOException();
                  }
               }
            } catch (Exception var28) {
               var28.printStackTrace();
            }

            var10 = true;
         }

         if (var10) {
            var38 = new File(var8);
            var12 = null;

            try {
               ud var50 = new ud(am, "rw", 10000L);
               vf var54 = new vf(500);
               var54.bu(3, (byte)-28);
               var54.bu(var12 != null ? 1 : 0, (byte)-19);
               var54.cf(var38.getPath(), -1828890850);
               if (null != var12) {
                  var54.cf(var12.getPath(), -534026783);
               }

               var50.ae(var54.at, 0, -1027766515 * var54.au, 924382461);
               var50.ag((byte)2);
            } catch (IOException var20) {
               var20.printStackTrace();
            }
         }

         File var6 = new File(var8);
         gk.ax = var6;
         if (!gk.ax.exists()) {
            gk.ax.mkdirs();
         }

         File[] var33 = gk.ax.listFiles();
         if (null != var33) {
            File[] var40 = var33;

            for(int var35 = 0; var35 < var40.length; ++var35) {
               File var37 = var40[var35];

               boolean var41;
               try {
                  RandomAccessFile var45 = new RandomAccessFile(var37, "rw");
                  var13 = var45.read();
                  var45.seek(0L);
                  var45.write(var13);
                  var45.seek(0L);
                  var45.close();
                  var41 = true;
               } catch (Exception var19) {
                  var41 = false;
               }

               if (!var41) {
                  ++var5;
                  continue label297;
               }
            }
         }
         break;
      }

      aa.ac(gk.ax, 526344);

      try {
         File var30 = new File(av, "random.dat");
         int var34;
         if (var30.exists()) {
            ad = new ua(new ud(var30, "rw", 25L), 24, 0);
         } else {
            label222:
            for(int var31 = 0; var31 < vo.ai.length; ++var31) {
               for(var34 = 0; var34 < ie.aa.length; ++var34) {
                  File var43 = new File(ie.aa[var34] + vo.ai[var31] + File.separatorChar + "random.dat");
                  if (var43.exists()) {
                     ad = new ua(new ud(var43, "rw", 25L), 24, 0);
                     break label222;
                  }
               }
            }
         }

         if (null == ad) {
            RandomAccessFile var32 = new RandomAccessFile(var30, "rw");
            var34 = var32.read();
            var32.seek(0L);
            var32.write(var34);
            var32.seek(0L);
            var32.close();
            ad = new ua(new ud(var30, "rw", 25L), 24, 0);
         }
      } catch (IOException var27) {
      }

      ah = new ua(new ud(ka.ae("main_file_cache.dat2", 1182562556), "rw", 1048576000L), 5200, 0);
      ap = new ua(new ud(ka.ae("main_file_cache.idx255", 106839683), "rw", 1048576L), 6000, 0);
      ij.ab = new ua[gn.aq * -1494001662];

      for(var5 = 0; var5 < gn.aq * 1066245782; ++var5) {
         ij.ab[var5] = new ua(new ud(ka.ae("main_file_cache.idx" + var5, -1067330988), "rw", 1048576L), 947480201, 0);
      }

   }

   public static void aq(String var0, String var1, String var2, int var3, int var4) throws IOException {
      if (null != var1 && !var1.isEmpty()) {
         var0 = var0 + "-" + var1;
      }

      gn.aq = var4 * -1857496749;
      sb.az = var3 * -1693620107;

      try {
         ip.aj = System.getProperty("os.name");
      } catch (Exception var26) {
         ip.aj = "Unknown";
      }

      hr.ay = ip.aj.toLowerCase();
      av = null;

      try {
         av = System.getProperty("jagex.userhome");
      } catch (Exception var25) {
      }

      if (av == null) {
         try {
            av = System.getProperty("user.home");
         } catch (Exception var24) {
         }
      }

      if (av != null) {
         av = av + "/";
      }

      try {
         if (hr.ay.startsWith("win")) {
            if (av == null) {
               av = System.getenv("USERPROFILE");
            }
         } else if (av == null) {
            av = System.getenv("HOME");
         }

         if (null != av) {
            av = av + "/";
         }
      } catch (Exception var23) {
      }

      if (null == av) {
         av = "~/";
      }

      ie.aa = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", av, "/tmp/", ""};
      vo.ai = new String[]{".jagex_cache_" + -669571107 * sb.az, ".file_store_" + -669571107 * sb.az};
      int var5 = 0;

      label297:
      while(var5 < 4) {
         String var7 = 0 == var5 ? "" : "" + var5;
         am = new File(av, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat");
         String var8 = null;
         String var9 = null;
         boolean var10 = false;
         vf var12;
         int var13;
         int var15;
         File var39;
         if (am.exists()) {
            try {
               ud var11 = new ud(am, "rw", 10000L);

               for(var12 = new vf((int)var11.ax(407179346)); -1027766515 * var12.au < var12.at.length; var12.au += -1864458299 * var13) {
                  var13 = var11.aq(var12.at, -1027766515 * var12.au, var12.at.length - var12.au * -1027766515, (byte)0);
                  if (-1 == var13) {
                     throw new IOException();
                  }
               }

               var12.au = 0;
               var13 = var12.cv(952452697);
               if (var13 < 1 || var13 > 3) {
                  throw new IOException("" + var13);
               }

               int var14 = 0;
               if (var13 > 1) {
                  var14 = var12.cv(952452697);
               }

               if (var13 <= 2) {
                  var8 = var12.cp(-1147019783);
                  if (var14 == 1) {
                     var9 = var12.cp(-1147019783);
                  }
               } else {
                  var8 = var12.cb((byte)-90);
                  if (1 == var14) {
                     var9 = var12.cb((byte)-82);
                  }
               }

               var11.ag((byte)-88);
            } catch (IOException var29) {
               var29.printStackTrace();
            }

            if (var8 != null) {
               var39 = new File(var8);
               if (!var39.exists()) {
                  var8 = null;
               }
            }

            if (var8 != null) {
               var39 = new File(var8, "test.dat");

               boolean var44;
               try {
                  RandomAccessFile var48 = new RandomAccessFile(var39, "rw");
                  var15 = var48.read();
                  var48.seek(0L);
                  var48.write(var15);
                  var48.seek(0L);
                  var48.close();
                  var39.delete();
                  var44 = true;
               } catch (Exception var22) {
                  var44 = false;
               }

               if (!var44) {
                  var8 = null;
               }
            }
         }

         if (var8 == null && var5 == 0) {
            label271:
            for(int var36 = 0; var36 < vo.ai.length; ++var36) {
               for(int var42 = 0; var42 < ie.aa.length; ++var42) {
                  File var46 = new File(ie.aa[var42] + vo.ai[var36] + File.separatorChar + var0 + File.separatorChar);
                  if (var46.exists()) {
                     File var49 = new File(var46, "test.dat");

                     boolean var51;
                     try {
                        RandomAccessFile var16 = new RandomAccessFile(var49, "rw");
                        int var17 = var16.read();
                        var16.seek(0L);
                        var16.write(var17);
                        var16.seek(0L);
                        var16.close();
                        var49.delete();
                        var51 = true;
                     } catch (Exception var21) {
                        var51 = false;
                     }

                     if (var51) {
                        var8 = var46.toString();
                        var10 = true;
                        break label271;
                     }
                  }
               }
            }
         }

         if (null == var8) {
            var8 = av + File.separatorChar + "jagexcache" + var7 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
            var10 = true;
         }

         File var38;
         if (null != var9) {
            var38 = new File(var9);
            var39 = new File(var8);

            try {
               File[] var47 = var38.listFiles();
               File[] var53 = var47;

               for(var15 = 0; var15 < var53.length; ++var15) {
                  File var52 = var53[var15];
                  File var55 = new File(var39, var52.getName());
                  boolean var18 = var52.renameTo(var55);
                  if (!var18) {
                     throw new IOException();
                  }
               }
            } catch (Exception var28) {
               var28.printStackTrace();
            }

            var10 = true;
         }

         if (var10) {
            var38 = new File(var8);
            var12 = null;

            try {
               ud var50 = new ud(am, "rw", 10000L);
               vf var54 = new vf(500);
               var54.bu(3, (byte)90);
               var54.bu(var12 != null ? 1 : 0, (byte)-54);
               var54.cf(var38.getPath(), 1147176279);
               if (null != var12) {
                  var54.cf(var12.getPath(), -865235694);
               }

               var50.ae(var54.at, 0, -1027766515 * var54.au, -432771392);
               var50.ag((byte)-5);
            } catch (IOException var20) {
               var20.printStackTrace();
            }
         }

         File var6 = new File(var8);
         gk.ax = var6;
         if (!gk.ax.exists()) {
            gk.ax.mkdirs();
         }

         File[] var33 = gk.ax.listFiles();
         if (null != var33) {
            File[] var40 = var33;

            for(int var35 = 0; var35 < var40.length; ++var35) {
               File var37 = var40[var35];

               boolean var41;
               try {
                  RandomAccessFile var45 = new RandomAccessFile(var37, "rw");
                  var13 = var45.read();
                  var45.seek(0L);
                  var45.write(var13);
                  var45.seek(0L);
                  var45.close();
                  var41 = true;
               } catch (Exception var19) {
                  var41 = false;
               }

               if (!var41) {
                  ++var5;
                  continue label297;
               }
            }
         }
         break;
      }

      aa.ac(gk.ax, 526344);

      try {
         File var30 = new File(av, "random.dat");
         int var34;
         if (var30.exists()) {
            ad = new ua(new ud(var30, "rw", 25L), 24, 0);
         } else {
            label222:
            for(int var31 = 0; var31 < vo.ai.length; ++var31) {
               for(var34 = 0; var34 < ie.aa.length; ++var34) {
                  File var43 = new File(ie.aa[var34] + vo.ai[var31] + File.separatorChar + "random.dat");
                  if (var43.exists()) {
                     ad = new ua(new ud(var43, "rw", 25L), 24, 0);
                     break label222;
                  }
               }
            }
         }

         if (null == ad) {
            RandomAccessFile var32 = new RandomAccessFile(var30, "rw");
            var34 = var32.read();
            var32.seek(0L);
            var32.write(var34);
            var32.seek(0L);
            var32.close();
            ad = new ua(new ud(var30, "rw", 25L), 24, 0);
         }
      } catch (IOException var27) {
      }

      ah = new ua(new ud(ka.ae("main_file_cache.dat2", -475111047), "rw", 1048576000L), 5200, 0);
      ap = new ua(new ud(ka.ae("main_file_cache.idx255", -380073027), "rw", 1048576L), 6000, 0);
      ij.ab = new ua[gn.aq * 1694028507];

      for(var5 = 0; var5 < gn.aq * 1694028507; ++var5) {
         ij.ab[var5] = new ua(new ud(ka.ae("main_file_cache.idx" + var5, -719162038), "rw", 1048576L), 6000, 0);
      }

   }

   public static ud af(String var0, String var1, boolean var2) {
      File var3 = new File(gk.ax, "preferences" + var0 + ".dat");
      if (var3.exists()) {
         try {
            ud var10 = new ud(var3, "rw", 10000L);
            return var10;
         } catch (IOException var9) {
         }
      }

      String var4 = "";
      if (312370817 == 934464102 * sb.az) {
         var4 = "_rc";
      } else if (sb.az * -2112882246 == 43624422) {
         var4 = "_wip";
      }

      File var5 = new File(av, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
      ud var6;
      if (!var2 && var5.exists()) {
         try {
            var6 = new ud(var5, "rw", 10000L);
            return var6;
         } catch (IOException var8) {
         }
      }

      try {
         var6 = new ud(var3, "rw", 10000L);
         return var6;
      } catch (IOException var7) {
         throw new RuntimeException();
      }
   }

   public static void at(vf var0, int var1) {
      if (null != ad) {
         try {
            ad.ae(0L);
            ad.af(var0.at, var1, 24, (byte)1);
         } catch (Exception var3) {
         }
      }

   }

   public static void al() {
      try {
         ah.ac((byte)1);

         for(int var0 = 0; var0 < gn.aq * 1694028507; ++var0) {
            ij.ab[var0].ac((byte)1);
         }

         ap.ac((byte)1);
         ad.ac((byte)1);
      } catch (Exception var1) {
      }

   }

   public static void ar(vf var0, int var1) {
      if (null != ad) {
         try {
            ad.ae(0L);
            ad.af(var0.at, var1, 24, (byte)1);
         } catch (Exception var3) {
         }
      }

   }

   il() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "il.<init>(" + ')');
      }
   }

   public static void ad() {
      try {
         ah.ac((byte)1);

         for(int var0 = 0; var0 < gn.aq * 1694028507; ++var0) {
            ij.ab[var0].ac((byte)1);
         }

         ap.ac((byte)1);
         ad.ac((byte)1);
      } catch (Exception var1) {
      }

   }

   public static void ah() {
      try {
         ah.ac((byte)1);

         for(int var0 = 0; var0 < gn.aq * 1694028507; ++var0) {
            ij.ab[var0].ac((byte)1);
         }

         ap.ac((byte)1);
         ad.ac((byte)1);
      } catch (Exception var1) {
      }

   }

   public static void au(vf var0, int var1) {
      if (null != ad) {
         try {
            ad.ae(0L);
            ad.af(var0.at, var1, 24, (byte)1);
         } catch (Exception var3) {
         }
      }

   }

   public static byte ac(char var0, int var1) {
      try {
         byte var2;
         label240: {
            label235: {
               if (var0 > 0) {
                  if (var0 < 128) {
                     break label235;
                  }

                  if (var1 != 1169786355) {
                     throw new IllegalStateException();
                  }
               }

               if (var0 < 160) {
                  break label240;
               }

               if (var1 != 1169786355) {
                  throw new IllegalStateException();
               }

               if (var0 > 255) {
                  break label240;
               }

               if (var1 != 1169786355) {
                  throw new IllegalStateException();
               }
            }

            var2 = (byte)var0;
            return var2;
         }

         if (var0 == 8364) {
            if (var1 != 1169786355) {
               throw new IllegalStateException();
            }

            var2 = -128;
         } else if (var0 == 8218) {
            if (var1 != 1169786355) {
               throw new IllegalStateException();
            }

            var2 = -126;
         } else if (var0 == 402) {
            if (var1 != 1169786355) {
               throw new IllegalStateException();
            }

            var2 = -125;
         } else if (var0 == 8222) {
            var2 = -124;
         } else if (8230 == var0) {
            if (var1 != 1169786355) {
               throw new IllegalStateException();
            }

            var2 = -123;
         } else if (8224 == var0) {
            if (var1 != 1169786355) {
               throw new IllegalStateException();
            }

            var2 = -122;
         } else if (var0 == 8225) {
            if (var1 != 1169786355) {
               throw new IllegalStateException();
            }

            var2 = -121;
         } else if (710 == var0) {
            if (var1 != 1169786355) {
               throw new IllegalStateException();
            }

            var2 = -120;
         } else if (8240 == var0) {
            if (var1 != 1169786355) {
               throw new IllegalStateException();
            }

            var2 = -119;
         } else if (var0 == 352) {
            if (var1 != 1169786355) {
               throw new IllegalStateException();
            }

            var2 = -118;
         } else if (var0 == 8249) {
            if (var1 != 1169786355) {
               throw new IllegalStateException();
            }

            var2 = -117;
         } else if (338 == var0) {
            var2 = -116;
         } else if (var0 == 381) {
            if (var1 != 1169786355) {
               throw new IllegalStateException();
            }

            var2 = -114;
         } else if (var0 == 8216) {
            if (var1 != 1169786355) {
               throw new IllegalStateException();
            }

            var2 = -111;
         } else if (var0 == 8217) {
            if (var1 != 1169786355) {
               throw new IllegalStateException();
            }

            var2 = -110;
         } else if (8220 == var0) {
            var2 = -109;
         } else if (var0 == 8221) {
            if (var1 != 1169786355) {
               throw new IllegalStateException();
            }

            var2 = -108;
         } else if (var0 == 8226) {
            if (var1 != 1169786355) {
               throw new IllegalStateException();
            }

            var2 = -107;
         } else if (var0 == 8211) {
            if (var1 != 1169786355) {
               throw new IllegalStateException();
            }

            var2 = -106;
         } else if (8212 == var0) {
            if (var1 != 1169786355) {
               throw new IllegalStateException();
            }

            var2 = -105;
         } else if (732 == var0) {
            if (var1 != 1169786355) {
               throw new IllegalStateException();
            }

            var2 = -104;
         } else if (var0 == 8482) {
            if (var1 != 1169786355) {
               throw new IllegalStateException();
            }

            var2 = -103;
         } else if (var0 == 353) {
            if (var1 != 1169786355) {
               throw new IllegalStateException();
            }

            var2 = -102;
         } else if (var0 == 8250) {
            if (var1 != 1169786355) {
               throw new IllegalStateException();
            }

            var2 = -101;
         } else if (var0 == 339) {
            if (var1 != 1169786355) {
               throw new IllegalStateException();
            }

            var2 = -100;
         } else if (var0 == 382) {
            if (var1 != 1169786355) {
               throw new IllegalStateException();
            }

            var2 = -98;
         } else if (376 == var0) {
            if (var1 != 1169786355) {
               throw new IllegalStateException();
            }

            var2 = -97;
         } else {
            var2 = 63;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "il.ac(" + ')');
      }
   }

   public static hr ac(int var0, byte var1) {
      try {
         hr var2 = (hr)hr.am.ac((long)var0);
         if (var2 != null) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else if (null == hr.ac) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            byte[] var3 = hr.ac.bt(3, var0, (byte)-7);
            var2 = new hr();
            if (var3 != null) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               var2.ae(new vf(var3), 919408233);
            }

            hr.am.ag(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "il.ac(" + ')');
      }
   }

   public static void ac(po var0, int var1) {
      try {
         he.ac = var0;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "il.ac(" + ')');
      }
   }
}
