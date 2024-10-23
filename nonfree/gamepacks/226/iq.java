import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class iq {
   static final String am = "main_file_cache.idx255";
   static final String ae = "main_file_cache.idx";
   static File ai;
   static int ay;
   static uj an = null;
   static final String ak = "rw";
   public static final int au = 24;
   static final int ap = 1048576000;
   public static uj ao = null;
   public static uj af = null;

   public static byte[] ad() {
      byte[] var0 = new byte[24];

      try {
         an.aw(0L);
         an.aj(var0, -1799211298);

         int var1;
         for(var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) {
         }

         if (var1 >= 24) {
            throw new IOException();
         }
      } catch (Exception var3) {
         for(int var2 = 0; var2 < 24; ++var2) {
            var0[var2] = -1;
         }
      }

      return var0;
   }

   public static un ao(String var0, String var1, boolean var2) {
      File var3 = new File(ai, "preferences" + var0 + ".dat");
      if (var3.exists()) {
         try {
            un var10 = new un(var3, "rw", 10000L);
            return var10;
         } catch (IOException var9) {
         }
      }

      String var4 = "";
      if (hl.ab * -1954269699 == 33) {
         var4 = "_rc";
      } else if (34 == hl.ab * -1954269699) {
         var4 = "_wip";
      }

      File var5 = new File(hd.aq, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
      un var6;
      if (!var2 && var5.exists()) {
         try {
            var6 = new un(var5, "rw", 10000L);
            return var6;
         } catch (IOException var8) {
         }
      }

      try {
         var6 = new un(var3, "rw", 10000L);
         return var6;
      } catch (IOException var7) {
         throw new RuntimeException();
      }
   }

   static void au(File var0, File var1) {
      try {
         un var2 = new un(fk.aj, "rw", 10000L);
         vl var3 = new vl(500);
         var3.bo(3, -1529409454);
         var3.bo(var1 != null ? 1 : 0, 1039029367);
         var3.cd(var0.getPath(), -1949236148);
         if (null != var1) {
            var3.cd(var1.getPath(), -1666057699);
         }

         var2.aw(var3.ae, 0, -1689308347 * var3.am, 1819222448);
         var2.ak(-1371779961);
      } catch (IOException var4) {
         var4.printStackTrace();
      }

   }

   public static void at(String var0, String var1, String var2, int var3, int var4) throws IOException {
      if (null != var1 && !var1.isEmpty()) {
         var0 = var0 + "-" + var1;
      }

      ay = -985843749 * var4;
      hl.ab = 1686458197 * var3;

      try {
         mp.ax = System.getProperty("os.name");
      } catch (Exception var25) {
         mp.ax = "Unknown";
      }

      hg.av = mp.ax.toLowerCase();
      hd.aq = null;

      try {
         hd.aq = System.getProperty("jagex.userhome");
      } catch (Exception var24) {
      }

      if (null == hd.aq) {
         try {
            hd.aq = System.getProperty("user.home");
         } catch (Exception var23) {
         }
      }

      if (null != hd.aq) {
         hd.aq = hd.aq + "/";
      }

      try {
         if (hg.av.startsWith("win")) {
            if (hd.aq == null) {
               hd.aq = System.getenv("USERPROFILE");
            }
         } else if (null == hd.aq) {
            hd.aq = System.getenv("HOME");
         }

         if (hd.aq != null) {
            hd.aq = hd.aq + "/";
         }
      } catch (Exception var22) {
      }

      if (hd.aq == null) {
         hd.aq = "~/";
      }

      gl.az = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", hd.aq, "/tmp/", ""};
      hp.ag = new String[]{".jagex_cache_" + -1954269699 * hl.ab, ".file_store_" + -1954269699 * hl.ab};
      int var5 = 0;

      label246:
      while(var5 < 4) {
         String var7 = 0 == var5 ? "" : "" + var5;
         fk.aj = new File(hd.aq, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat");
         String var8 = null;
         String var9 = null;
         boolean var10 = false;
         int var13;
         int var15;
         File var33;
         if (fk.aj.exists()) {
            try {
               un var11 = new un(fk.aj, "rw", 10000L);

               vl var12;
               for(var12 = new vl((int)var11.ai((byte)0)); -1689308347 * var12.am < var12.ae.length; var12.am += var13 * -725588083) {
                  var13 = var11.ay(var12.ae, -1689308347 * var12.am, var12.ae.length - var12.am * -1689308347, -149442735);
                  if (-1 == var13) {
                     throw new IOException();
                  }
               }

               var12.am = 0;
               var13 = var12.cy((short)-14471);
               if (var13 < 1 || var13 > 3) {
                  throw new IOException("" + var13);
               }

               int var14 = 0;
               if (var13 > 1) {
                  var14 = var12.cy((short)-20597);
               }

               if (var13 <= 2) {
                  var8 = var12.ca(-1000420204);
                  if (var14 == 1) {
                     var9 = var12.ca(-14629429);
                  }
               } else {
                  var8 = var12.cs(-1405605838);
                  if (1 == var14) {
                     var9 = var12.cs(713488320);
                  }
               }

               var11.ak(-1196722724);
            } catch (IOException var27) {
               var27.printStackTrace();
            }

            if (var8 != null) {
               var33 = new File(var8);
               if (!var33.exists()) {
                  var8 = null;
               }
            }

            if (null != var8) {
               var33 = new File(var8, "test.dat");

               boolean var37;
               try {
                  RandomAccessFile var41 = new RandomAccessFile(var33, "rw");
                  var15 = var41.read();
                  var41.seek(0L);
                  var41.write(var15);
                  var41.seek(0L);
                  var41.close();
                  var33.delete();
                  var37 = true;
               } catch (Exception var21) {
                  var37 = false;
               }

               if (!var37) {
                  var8 = null;
               }
            }
         }

         if (var8 == null && var5 == 0) {
            label220:
            for(int var30 = 0; var30 < hp.ag.length; ++var30) {
               for(int var36 = 0; var36 < gl.az.length; ++var36) {
                  File var39 = new File(gl.az[var36] + hp.ag[var30] + File.separatorChar + var0 + File.separatorChar);
                  if (var39.exists()) {
                     File var42 = new File(var39, "test.dat");

                     boolean var43;
                     try {
                        RandomAccessFile var16 = new RandomAccessFile(var42, "rw");
                        int var17 = var16.read();
                        var16.seek(0L);
                        var16.write(var17);
                        var16.seek(0L);
                        var16.close();
                        var42.delete();
                        var43 = true;
                     } catch (Exception var20) {
                        var43 = false;
                     }

                     if (var43) {
                        var8 = var39.toString();
                        var10 = true;
                        break label220;
                     }
                  }
               }
            }
         }

         if (var8 == null) {
            var8 = hd.aq + File.separatorChar + "jagexcache" + var7 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
            var10 = true;
         }

         if (null != var9) {
            File var32 = new File(var9);
            var33 = new File(var8);

            try {
               File[] var40 = var32.listFiles();
               File[] var45 = var40;

               for(var15 = 0; var15 < var45.length; ++var15) {
                  File var44 = var45[var15];
                  File var46 = new File(var33, var44.getName());
                  boolean var18 = var44.renameTo(var46);
                  if (!var18) {
                     throw new IOException();
                  }
               }
            } catch (Exception var26) {
               var26.printStackTrace();
            }

            var10 = true;
         }

         if (var10) {
            de.aw(new File(var8), (File)null, -1335254868);
         }

         File var6 = new File(var8);
         ai = var6;
         if (!ai.exists()) {
            ai.mkdirs();
         }

         File[] var28 = ai.listFiles();
         if (null != var28) {
            File[] var35 = var28;

            for(int var29 = 0; var29 < var35.length; ++var29) {
               File var31 = var35[var29];

               boolean var34;
               try {
                  RandomAccessFile var38 = new RandomAccessFile(var31, "rw");
                  var13 = var38.read();
                  var38.seek(0L);
                  var38.write(var13);
                  var38.seek(0L);
                  var38.close();
                  var34 = true;
               } catch (Exception var19) {
                  var34 = false;
               }

               if (!var34) {
                  ++var5;
                  continue label246;
               }
            }
         }
         break;
      }

      mw.ap(ai, -1222107614);
      ae.aj(1839289898);
      ao = new uj(new un(dv.aw("main_file_cache.dat2", 115607862), "rw", 1048576000L), 5200, 0);
      af = new uj(new un(dv.aw("main_file_cache.idx255", 1647809795), "rw", 1048576L), 6000, 0);
      et.ar = new uj[-372511661 * ay];

      for(var5 = 0; var5 < -372511661 * ay; ++var5) {
         et.ar[var5] = new uj(new un(dv.aw("main_file_cache.idx" + var5, 1744002539), "rw", 1048576L), 6000, 0);
      }

   }

   public static ui aw(int var0, byte var1) {
      try {
         int var2 = uz.aw[var0];
         if (1 == var2) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            } else {
               return ui.ap;
            }
         } else if (2 == var2) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            } else {
               return ui.ak;
            }
         } else if (var2 == 3) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            } else {
               return ui.aw;
            }
         } else {
            return null;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "iq.aw(" + ')');
      }
   }

   static void an(File var0, File var1) {
      try {
         un var2 = new un(fk.aj, "rw", 10000L);
         vl var3 = new vl(1444413556);
         var3.bo(3, 873248946);
         var3.bo(var1 != null ? 1 : 0, -1570047087);
         var3.cd(var0.getPath(), -1972895878);
         if (null != var1) {
            var3.cd(var1.getPath(), -1655614290);
         }

         var2.aw(var3.ae, 0, -1689308347 * var3.am, -1279680451);
         var2.ak(1141215945);
      } catch (IOException var4) {
         var4.printStackTrace();
      }

   }

   iq() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "iq.<init>(" + ')');
      }
   }

   static void af() {
      try {
         File var0 = new File(hd.aq, "random.dat");
         int var2;
         if (var0.exists()) {
            an = new uj(new un(var0, "rw", 25L), 24, 0);
         } else {
            label34:
            for(int var1 = 0; var1 < hp.ag.length; ++var1) {
               for(var2 = 0; var2 < gl.az.length; ++var2) {
                  File var3 = new File(gl.az[var2] + hp.ag[var1] + File.separatorChar + "random.dat");
                  if (var3.exists()) {
                     an = new uj(new un(var3, "rw", 25L), 24, 0);
                     break label34;
                  }
               }
            }
         }

         if (an == null) {
            RandomAccessFile var5 = new RandomAccessFile(var0, "rw");
            var2 = var5.read();
            var5.seek(0L);
            var5.write(var2);
            var5.seek(0L);
            var5.close();
            an = new uj(new un(var0, "rw", 25L), 24, 0);
         }
      } catch (IOException var4) {
      }

   }

   static void ar() {
      try {
         File var0 = new File(hd.aq, "random.dat");
         int var2;
         if (var0.exists()) {
            an = new uj(new un(var0, "rw", 25L), 24, 0);
         } else {
            label34:
            for(int var1 = 0; var1 < hp.ag.length; ++var1) {
               for(var2 = 0; var2 < gl.az.length; ++var2) {
                  File var3 = new File(gl.az[var2] + hp.ag[var1] + File.separatorChar + "random.dat");
                  if (var3.exists()) {
                     an = new uj(new un(var3, "rw", 25L), 24, 0);
                     break label34;
                  }
               }
            }
         }

         if (an == null) {
            RandomAccessFile var5 = new RandomAccessFile(var0, "rw");
            var2 = var5.read();
            var5.seek(0L);
            var5.write(var2);
            var5.seek(0L);
            var5.close();
            an = new uj(new un(var0, "rw", 25L), 24, 0);
         }
      } catch (IOException var4) {
      }

   }

   public static void am(String var0, String var1, String var2, int var3, int var4) throws IOException {
      if (null != var1 && !var1.isEmpty()) {
         var0 = var0 + "-" + var1;
      }

      ay = -985843749 * var4;
      hl.ab = 1686458197 * var3;

      try {
         mp.ax = System.getProperty("os.name");
      } catch (Exception var25) {
         mp.ax = "Unknown";
      }

      hg.av = mp.ax.toLowerCase();
      hd.aq = null;

      try {
         hd.aq = System.getProperty("jagex.userhome");
      } catch (Exception var24) {
      }

      if (null == hd.aq) {
         try {
            hd.aq = System.getProperty("user.home");
         } catch (Exception var23) {
         }
      }

      if (null != hd.aq) {
         hd.aq = hd.aq + "/";
      }

      try {
         if (hg.av.startsWith("win")) {
            if (hd.aq == null) {
               hd.aq = System.getenv("USERPROFILE");
            }
         } else if (null == hd.aq) {
            hd.aq = System.getenv("HOME");
         }

         if (hd.aq != null) {
            hd.aq = hd.aq + "/";
         }
      } catch (Exception var22) {
      }

      if (hd.aq == null) {
         hd.aq = "~/";
      }

      gl.az = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", hd.aq, "/tmp/", ""};
      hp.ag = new String[]{".jagex_cache_" + -1954269699 * hl.ab, ".file_store_" + -1954269699 * hl.ab};
      int var5 = 0;

      label246:
      while(var5 < 4) {
         String var7 = 0 == var5 ? "" : "" + var5;
         fk.aj = new File(hd.aq, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat");
         String var8 = null;
         String var9 = null;
         boolean var10 = false;
         int var13;
         int var15;
         File var33;
         if (fk.aj.exists()) {
            try {
               un var11 = new un(fk.aj, "rw", 10000L);

               vl var12;
               for(var12 = new vl((int)var11.ai((byte)0)); -1689308347 * var12.am < var12.ae.length; var12.am += var13 * -725588083) {
                  var13 = var11.ay(var12.ae, -1689308347 * var12.am, var12.ae.length - var12.am * -1689308347, 306767939);
                  if (-1 == var13) {
                     throw new IOException();
                  }
               }

               var12.am = 0;
               var13 = var12.cy((short)-25472);
               if (var13 < 1 || var13 > 3) {
                  throw new IOException("" + var13);
               }

               int var14 = 0;
               if (var13 > 1) {
                  var14 = var12.cy((short)-1562);
               }

               if (var13 <= 2) {
                  var8 = var12.ca(-1817983979);
                  if (var14 == 1) {
                     var9 = var12.ca(-254824255);
                  }
               } else {
                  var8 = var12.cs(-183204593);
                  if (1 == var14) {
                     var9 = var12.cs(-1983756279);
                  }
               }

               var11.ak(-2137397004);
            } catch (IOException var27) {
               var27.printStackTrace();
            }

            if (var8 != null) {
               var33 = new File(var8);
               if (!var33.exists()) {
                  var8 = null;
               }
            }

            if (null != var8) {
               var33 = new File(var8, "test.dat");

               boolean var37;
               try {
                  RandomAccessFile var41 = new RandomAccessFile(var33, "rw");
                  var15 = var41.read();
                  var41.seek(0L);
                  var41.write(var15);
                  var41.seek(0L);
                  var41.close();
                  var33.delete();
                  var37 = true;
               } catch (Exception var21) {
                  var37 = false;
               }

               if (!var37) {
                  var8 = null;
               }
            }
         }

         if (var8 == null && var5 == 0) {
            label220:
            for(int var30 = 0; var30 < hp.ag.length; ++var30) {
               for(int var36 = 0; var36 < gl.az.length; ++var36) {
                  File var39 = new File(gl.az[var36] + hp.ag[var30] + File.separatorChar + var0 + File.separatorChar);
                  if (var39.exists()) {
                     File var42 = new File(var39, "test.dat");

                     boolean var43;
                     try {
                        RandomAccessFile var16 = new RandomAccessFile(var42, "rw");
                        int var17 = var16.read();
                        var16.seek(0L);
                        var16.write(var17);
                        var16.seek(0L);
                        var16.close();
                        var42.delete();
                        var43 = true;
                     } catch (Exception var20) {
                        var43 = false;
                     }

                     if (var43) {
                        var8 = var39.toString();
                        var10 = true;
                        break label220;
                     }
                  }
               }
            }
         }

         if (var8 == null) {
            var8 = hd.aq + File.separatorChar + "jagexcache" + var7 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
            var10 = true;
         }

         if (null != var9) {
            File var32 = new File(var9);
            var33 = new File(var8);

            try {
               File[] var40 = var32.listFiles();
               File[] var45 = var40;

               for(var15 = 0; var15 < var45.length; ++var15) {
                  File var44 = var45[var15];
                  File var46 = new File(var33, var44.getName());
                  boolean var18 = var44.renameTo(var46);
                  if (!var18) {
                     throw new IOException();
                  }
               }
            } catch (Exception var26) {
               var26.printStackTrace();
            }

            var10 = true;
         }

         if (var10) {
            de.aw(new File(var8), (File)null, -820353458);
         }

         File var6 = new File(var8);
         ai = var6;
         if (!ai.exists()) {
            ai.mkdirs();
         }

         File[] var28 = ai.listFiles();
         if (null != var28) {
            File[] var35 = var28;

            for(int var29 = 0; var29 < var35.length; ++var29) {
               File var31 = var35[var29];

               boolean var34;
               try {
                  RandomAccessFile var38 = new RandomAccessFile(var31, "rw");
                  var13 = var38.read();
                  var38.seek(0L);
                  var38.write(var13);
                  var38.seek(0L);
                  var38.close();
                  var34 = true;
               } catch (Exception var19) {
                  var34 = false;
               }

               if (!var34) {
                  ++var5;
                  continue label246;
               }
            }
         }
         break;
      }

      mw.ap(ai, 1664220264);
      ae.aj(1047121267);
      ao = new uj(new un(dv.aw("main_file_cache.dat2", 355085053), "rw", 1048576000L), 5200, 0);
      af = new uj(new un(dv.aw("main_file_cache.idx255", 1417740185), "rw", 1048576L), 6000, 0);
      et.ar = new uj[-372511661 * ay];

      for(var5 = 0; var5 < -372511661 * ay; ++var5) {
         et.ar[var5] = new uj(new un(dv.aw("main_file_cache.idx" + var5, 1432984139), "rw", 1048576L), 6000, 0);
      }

   }

   public static byte[] az() {
      byte[] var0 = new byte[24];

      try {
         an.aw(0L);
         an.aj(var0, -1069823759);

         int var1;
         for(var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) {
         }

         if (var1 >= 24) {
            throw new IOException();
         }
      } catch (Exception var3) {
         for(int var2 = 0; var2 < 24; ++var2) {
            var0[var2] = -1;
         }
      }

      return var0;
   }

   public static byte[] ag() {
      byte[] var0 = new byte[24];

      try {
         an.aw(0L);
         an.aj(var0, -926969688);

         int var1;
         for(var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) {
         }

         if (var1 >= 24) {
            throw new IOException();
         }
      } catch (Exception var3) {
         for(int var2 = 0; var2 < 24; ++var2) {
            var0[var2] = -1;
         }
      }

      return var0;
   }

   public static void ae(String var0, String var1, String var2, int var3, int var4) throws IOException {
      if (null != var1 && !var1.isEmpty()) {
         var0 = var0 + "-" + var1;
      }

      ay = -985843749 * var4;
      hl.ab = -763048478 * var3;

      try {
         mp.ax = System.getProperty("os.name");
      } catch (Exception var25) {
         mp.ax = "Unknown";
      }

      hg.av = mp.ax.toLowerCase();
      hd.aq = null;

      try {
         hd.aq = System.getProperty("jagex.userhome");
      } catch (Exception var24) {
      }

      if (null == hd.aq) {
         try {
            hd.aq = System.getProperty("user.home");
         } catch (Exception var23) {
         }
      }

      if (null != hd.aq) {
         hd.aq = hd.aq + "/";
      }

      try {
         if (hg.av.startsWith("win")) {
            if (hd.aq == null) {
               hd.aq = System.getenv("USERPROFILE");
            }
         } else if (null == hd.aq) {
            hd.aq = System.getenv("HOME");
         }

         if (hd.aq != null) {
            hd.aq = hd.aq + "/";
         }
      } catch (Exception var22) {
      }

      if (hd.aq == null) {
         hd.aq = "~/";
      }

      gl.az = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", hd.aq, "/tmp/", ""};
      hp.ag = new String[]{".jagex_cache_" + -1954269699 * hl.ab, ".file_store_" + -1954269699 * hl.ab};
      int var5 = 0;

      label246:
      while(var5 < 4) {
         String var7 = 0 == var5 ? "" : "" + var5;
         fk.aj = new File(hd.aq, "jagex_cl_" + var0 + "_" + var2 + var7 + ".dat");
         String var8 = null;
         String var9 = null;
         boolean var10 = false;
         int var13;
         int var15;
         File var33;
         if (fk.aj.exists()) {
            try {
               un var11 = new un(fk.aj, "rw", 10000L);

               vl var12;
               for(var12 = new vl((int)var11.ai((byte)0)); 741186139 * var12.am < var12.ae.length; var12.am += var13 * -725588083) {
                  var13 = var11.ay(var12.ae, 1423290027 * var12.am, var12.ae.length - var12.am * -1689308347, 594213193);
                  if (-1 == var13) {
                     throw new IOException();
                  }
               }

               var12.am = 0;
               var13 = var12.cy((short)-15356);
               if (var13 < 1 || var13 > 3) {
                  throw new IOException("" + var13);
               }

               int var14 = 0;
               if (var13 > 1) {
                  var14 = var12.cy((short)-8941);
               }

               if (var13 <= 2) {
                  var8 = var12.ca(289637171);
                  if (var14 == 1) {
                     var9 = var12.ca(788353636);
                  }
               } else {
                  var8 = var12.cs(1730806057);
                  if (1 == var14) {
                     var9 = var12.cs(1317999765);
                  }
               }

               var11.ak(796976329);
            } catch (IOException var27) {
               var27.printStackTrace();
            }

            if (var8 != null) {
               var33 = new File(var8);
               if (!var33.exists()) {
                  var8 = null;
               }
            }

            if (null != var8) {
               var33 = new File(var8, "test.dat");

               boolean var37;
               try {
                  RandomAccessFile var41 = new RandomAccessFile(var33, "rw");
                  var15 = var41.read();
                  var41.seek(0L);
                  var41.write(var15);
                  var41.seek(0L);
                  var41.close();
                  var33.delete();
                  var37 = true;
               } catch (Exception var21) {
                  var37 = false;
               }

               if (!var37) {
                  var8 = null;
               }
            }
         }

         if (var8 == null && var5 == 0) {
            label220:
            for(int var30 = 0; var30 < hp.ag.length; ++var30) {
               for(int var36 = 0; var36 < gl.az.length; ++var36) {
                  File var39 = new File(gl.az[var36] + hp.ag[var30] + File.separatorChar + var0 + File.separatorChar);
                  if (var39.exists()) {
                     File var42 = new File(var39, "test.dat");

                     boolean var43;
                     try {
                        RandomAccessFile var16 = new RandomAccessFile(var42, "rw");
                        int var17 = var16.read();
                        var16.seek(0L);
                        var16.write(var17);
                        var16.seek(0L);
                        var16.close();
                        var42.delete();
                        var43 = true;
                     } catch (Exception var20) {
                        var43 = false;
                     }

                     if (var43) {
                        var8 = var39.toString();
                        var10 = true;
                        break label220;
                     }
                  }
               }
            }
         }

         if (var8 == null) {
            var8 = hd.aq + File.separatorChar + "jagexcache" + var7 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
            var10 = true;
         }

         if (null != var9) {
            File var32 = new File(var9);
            var33 = new File(var8);

            try {
               File[] var40 = var32.listFiles();
               File[] var45 = var40;

               for(var15 = 0; var15 < var45.length; ++var15) {
                  File var44 = var45[var15];
                  File var46 = new File(var33, var44.getName());
                  boolean var18 = var44.renameTo(var46);
                  if (!var18) {
                     throw new IOException();
                  }
               }
            } catch (Exception var26) {
               var26.printStackTrace();
            }

            var10 = true;
         }

         if (var10) {
            de.aw(new File(var8), (File)null, -908449368);
         }

         File var6 = new File(var8);
         ai = var6;
         if (!ai.exists()) {
            ai.mkdirs();
         }

         File[] var28 = ai.listFiles();
         if (null != var28) {
            File[] var35 = var28;

            for(int var29 = 0; var29 < var35.length; ++var29) {
               File var31 = var35[var29];

               boolean var34;
               try {
                  RandomAccessFile var38 = new RandomAccessFile(var31, "rw");
                  var13 = var38.read();
                  var38.seek(0L);
                  var38.write(var13);
                  var38.seek(0L);
                  var38.close();
                  var34 = true;
               } catch (Exception var19) {
                  var34 = false;
               }

               if (!var34) {
                  ++var5;
                  continue label246;
               }
            }
         }
         break;
      }

      mw.ap(ai, -862587659);
      ae.aj(1481115502);
      ao = new uj(new un(dv.aw("main_file_cache.dat2", -815593248), "rw", 1048576000L), 1591562974, 0);
      af = new uj(new un(dv.aw("main_file_cache.idx255", 1358423674), "rw", 1048576L), -1521921137, 0);
      et.ar = new uj[404242466 * ay];

      for(var5 = 0; var5 < -372511661 * ay; ++var5) {
         et.ar[var5] = new uj(new un(dv.aw("main_file_cache.idx" + var5, -128059821), "rw", 1048576L), -904226041, 0);
      }

   }

   public static byte[] ac() {
      byte[] var0 = new byte[24];

      try {
         an.aw(0L);
         an.aj(var0, -1536789317);

         int var1;
         for(var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) {
         }

         if (var1 >= 24) {
            throw new IOException();
         }
      } catch (Exception var3) {
         for(int var2 = 0; var2 < 24; ++var2) {
            var0[var2] = -1;
         }
      }

      return var0;
   }

   public static void av(vl var0, int var1) {
      if (an != null) {
         try {
            an.aw(0L);
            an.as(var0.ae, var1, 24, -309555947);
         } catch (Exception var3) {
         }
      }

   }

   public static void ax(vl var0, int var1) {
      if (an != null) {
         try {
            an.aw(0L);
            an.as(var0.ae, var1, 24, -309555947);
         } catch (Exception var3) {
         }
      }

   }

   public static void aq() {
      try {
         ao.ap((byte)36);

         for(int var0 = 0; var0 < ay * -372511661; ++var0) {
            et.ar[var0].ap((byte)42);
         }

         af.ap((byte)58);
         an.ap((byte)-58);
      } catch (Exception var1) {
      }

   }

   public static void al() {
      try {
         ao.ap((byte)-12);

         for(int var0 = 0; var0 < ay * -372511661; ++var0) {
            et.ar[var0].ap((byte)-5);
         }

         af.ap((byte)-88);
         an.ap((byte)-80);
      } catch (Exception var1) {
      }

   }

   public static void aa() {
      try {
         ao.ap((byte)-120);

         for(int var0 = 0; var0 < ay * -372511661; ++var0) {
            et.ar[var0].ap((byte)-70);
         }

         af.ap((byte)28);
         an.ap((byte)25);
      } catch (Exception var1) {
      }

   }

   static void ab() {
      try {
         File var0 = new File(hd.aq, "random.dat");
         int var2;
         if (var0.exists()) {
            an = new uj(new un(var0, "rw", 25L), 24, 0);
         } else {
            label34:
            for(int var1 = 0; var1 < hp.ag.length; ++var1) {
               for(var2 = 0; var2 < gl.az.length; ++var2) {
                  File var3 = new File(gl.az[var2] + hp.ag[var1] + File.separatorChar + "random.dat");
                  if (var3.exists()) {
                     an = new uj(new un(var3, "rw", 25L), 24, 0);
                     break label34;
                  }
               }
            }
         }

         if (an == null) {
            RandomAccessFile var5 = new RandomAccessFile(var0, "rw");
            var2 = var5.read();
            var5.seek(0L);
            var5.write(var2);
            var5.seek(0L);
            var5.close();
            an = new uj(new un(var0, "rw", 25L), 24, 0);
         }
      } catch (IOException var4) {
      }

   }
}
