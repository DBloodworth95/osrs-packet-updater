import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ls {
   String ac;
   int ae;
   int ag;
   public static final int ad = 10;
   public static final int cg = 85;
   ko am;

   ls(String var1, int var2, int var3, ko var4) {
      try {
         super();
         this.ac = var1;
         this.ae = -1564649399 * var2;
         this.ag = -455600591 * var3;
         this.am = var4;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ls.<init>(" + ')');
      }
   }

   public static void ac(String var0, String var1, String var2, int var3, int var4, int var5) throws IOException {
      try {
         if (null != var1) {
            if (var5 == 705280997) {
               return;
            }

            if (!var1.isEmpty()) {
               if (var5 == 705280997) {
                  return;
               }

               var0 = var0 + "-" + var1;
            }
         }

         gn.aq = var4 * -1857496749;
         sb.az = var3 * -1693620107;

         try {
            ip.aj = System.getProperty("os.name");
         } catch (Exception var27) {
            ip.aj = "Unknown";
         }

         hr.ay = ip.aj.toLowerCase();
         il.av = null;

         try {
            il.av = System.getProperty("jagex.userhome");
         } catch (Exception var26) {
         }

         if (il.av == null) {
            try {
               il.av = System.getProperty("user.home");
            } catch (Exception var25) {
            }
         }

         if (il.av != null) {
            if (var5 == 705280997) {
               return;
            }

            il.av = il.av + "/";
         }

         try {
            if (hr.ay.startsWith("win")) {
               if (il.av == null) {
                  if (var5 == 705280997) {
                     throw new IllegalStateException();
                  }

                  il.av = System.getenv("USERPROFILE");
               }
            } else if (il.av == null) {
               if (var5 == 705280997) {
                  throw new IllegalStateException();
               }

               il.av = System.getenv("HOME");
            }

            if (null != il.av) {
               if (var5 == 705280997) {
                  throw new IllegalStateException();
               }

               il.av = il.av + "/";
            }
         } catch (Exception var24) {
         }

         if (null == il.av) {
            il.av = "~/";
         }

         ie.aa = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", il.av, "/tmp/", ""};
         vo.ai = new String[]{".jagex_cache_" + -669571107 * sb.az, ".file_store_" + -669571107 * sb.az};
         int var6 = 0;

         label449:
         while(var6 < 4) {
            if (var5 == 705280997) {
               throw new IllegalStateException();
            }

            String var10000;
            if (0 == var6) {
               if (var5 == 705280997) {
                  throw new IllegalStateException();
               }

               var10000 = "";
            } else {
               var10000 = "" + var6;
            }

            String var8 = var10000;
            il.am = new File(il.av, "jagex_cl_" + var0 + "_" + var2 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            vf var13;
            int var14;
            int var16;
            File var41;
            if (il.am.exists()) {
               try {
                  label489: {
                     ud var12 = new ud(il.am, "rw", 10000L);

                     for(var13 = new vf((int)var12.ax(1999234021)); -1027766515 * var13.au < var13.at.length; var13.au += -1864458299 * var14) {
                        var14 = var12.aq(var13.at, -1027766515 * var13.au, var13.at.length - var13.au * -1027766515, (byte)0);
                        if (-1 == var14) {
                           if (var5 == 705280997) {
                              throw new IllegalStateException();
                           }

                           throw new IOException();
                        }
                     }

                     var13.au = 0;
                     var14 = var13.cv(952452697);
                     if (var14 >= 1) {
                        if (var5 == 705280997) {
                           throw new IllegalStateException();
                        }

                        if (var14 <= 3) {
                           int var15 = 0;
                           if (var14 > 1) {
                              var15 = var13.cv(952452697);
                           }

                           if (var14 <= 2) {
                              if (var5 == 705280997) {
                                 throw new IllegalStateException();
                              }

                              var9 = var13.cp(-1147019783);
                              if (var15 == 1) {
                                 if (var5 == 705280997) {
                                    throw new IllegalStateException();
                                 }

                                 var10 = var13.cp(-1147019783);
                              }
                           } else {
                              var9 = var13.cb((byte)-94);
                              if (1 == var15) {
                                 if (var5 == 705280997) {
                                    throw new IllegalStateException();
                                 }

                                 var10 = var13.cb((byte)-3);
                              }
                           }

                           var12.ag((byte)-58);
                           break label489;
                        }
                     }

                     throw new IOException("" + var14);
                  }
               } catch (IOException var30) {
                  var30.printStackTrace();
               }

               if (var9 != null) {
                  if (var5 == 705280997) {
                     return;
                  }

                  var41 = new File(var9);
                  if (!var41.exists()) {
                     if (var5 == 705280997) {
                        throw new IllegalStateException();
                     }

                     var9 = null;
                  }
               }

               if (var9 != null) {
                  if (var5 == 705280997) {
                     throw new IllegalStateException();
                  }

                  var41 = new File(var9, "test.dat");

                  boolean var46;
                  try {
                     RandomAccessFile var50 = new RandomAccessFile(var41, "rw");
                     var16 = var50.read();
                     var50.seek(0L);
                     var50.write(var16);
                     var50.seek(0L);
                     var50.close();
                     var41.delete();
                     var46 = true;
                  } catch (Exception var23) {
                     var46 = false;
                  }

                  if (!var46) {
                     if (var5 == 705280997) {
                        return;
                     }

                     var9 = null;
                  }
               }
            }

            if (var9 == null) {
               if (var5 == 705280997) {
                  throw new IllegalStateException();
               }

               if (var6 == 0) {
                  label422:
                  for(int var38 = 0; var38 < vo.ai.length; ++var38) {
                     if (var5 == 705280997) {
                        throw new IllegalStateException();
                     }

                     for(int var45 = 0; var45 < ie.aa.length; ++var45) {
                        if (var5 == 705280997) {
                           throw new IllegalStateException();
                        }

                        File var48 = new File(ie.aa[var45] + vo.ai[var38] + File.separatorChar + var0 + File.separatorChar);
                        if (var48.exists()) {
                           if (var5 == 705280997) {
                              return;
                           }

                           File var52 = new File(var48, "test.dat");

                           boolean var53;
                           try {
                              RandomAccessFile var17 = new RandomAccessFile(var52, "rw");
                              int var18 = var17.read();
                              var17.seek(0L);
                              var17.write(var18);
                              var17.seek(0L);
                              var17.close();
                              var52.delete();
                              var53 = true;
                           } catch (Exception var22) {
                              var53 = false;
                           }

                           if (var53) {
                              if (var5 == 705280997) {
                                 throw new IllegalStateException();
                              }

                              var9 = var48.toString();
                              var11 = true;
                              break label422;
                           }
                        }
                     }
                  }
               }
            }

            if (null == var9) {
               if (var5 == 705280997) {
                  throw new IllegalStateException();
               }

               var9 = il.av + File.separatorChar + "jagexcache" + var8 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
               var11 = true;
            }

            File var40;
            if (null != var10) {
               if (var5 == 705280997) {
                  throw new IllegalStateException();
               }

               var40 = new File(var10);
               var41 = new File(var9);

               try {
                  File[] var49 = var40.listFiles();
                  File[] var55 = var49;

                  for(var16 = 0; var16 < var55.length; ++var16) {
                     if (var5 == 705280997) {
                        return;
                     }

                     File var54 = var55[var16];
                     File var57 = new File(var41, var54.getName());
                     boolean var19 = var54.renameTo(var57);
                     if (!var19) {
                        if (var5 == 705280997) {
                           throw new IllegalStateException();
                        }

                        throw new IOException();
                     }
                  }
               } catch (Exception var29) {
                  var29.printStackTrace();
               }

               var11 = true;
            }

            if (var11) {
               if (var5 == 705280997) {
                  throw new IllegalStateException();
               }

               var40 = new File(var9);
               var13 = null;

               try {
                  ud var51 = new ud(il.am, "rw", 10000L);
                  vf var56 = new vf(500);
                  var56.bu(3, (byte)43);
                  byte var10001;
                  if (var13 != null) {
                     if (var5 == 705280997) {
                        throw new IllegalStateException();
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 0;
                  }

                  var56.bu(var10001, (byte)1);
                  var56.cf(var40.getPath(), 280073312);
                  if (null != var13) {
                     var56.cf(var13.getPath(), -611680615);
                  }

                  var51.ae(var56.at, 0, -1027766515 * var56.au, -26786729);
                  var51.ag((byte)-31);
               } catch (IOException var21) {
                  var21.printStackTrace();
               }
            }

            File var7 = new File(var9);
            gk.ax = var7;
            if (!gk.ax.exists()) {
               if (var5 == 705280997) {
                  return;
               }

               gk.ax.mkdirs();
            }

            File[] var35 = gk.ax.listFiles();
            if (null != var35) {
               if (var5 == 705280997) {
                  throw new IllegalStateException();
               }

               File[] var42 = var35;

               for(int var37 = 0; var37 < var42.length; ++var37) {
                  if (var5 == 705280997) {
                     return;
                  }

                  File var39 = var42[var37];

                  boolean var43;
                  try {
                     RandomAccessFile var47 = new RandomAccessFile(var39, "rw");
                     var14 = var47.read();
                     var47.seek(0L);
                     var47.write(var14);
                     var47.seek(0L);
                     var47.close();
                     var43 = true;
                  } catch (Exception var20) {
                     var43 = false;
                  }

                  if (!var43) {
                     if (var5 == 705280997) {
                        return;
                     }

                     ++var6;
                     continue label449;
                  }
               }
            }
            break;
         }

         aa.ac(gk.ax, 526344);

         try {
            File var32 = new File(il.av, "random.dat");
            int var36;
            if (var32.exists()) {
               if (var5 == 705280997) {
                  throw new IllegalStateException();
               }

               il.ad = new ua(new ud(var32, "rw", 25L), 24, 0);
            } else {
               label363:
               for(int var33 = 0; var33 < vo.ai.length; ++var33) {
                  if (var5 == 705280997) {
                     throw new IllegalStateException();
                  }

                  for(var36 = 0; var36 < ie.aa.length; ++var36) {
                     if (var5 == 705280997) {
                        throw new IllegalStateException();
                     }

                     File var44 = new File(ie.aa[var36] + vo.ai[var33] + File.separatorChar + "random.dat");
                     if (var44.exists()) {
                        if (var5 == 705280997) {
                           return;
                        }

                        il.ad = new ua(new ud(var44, "rw", 25L), 24, 0);
                        break label363;
                     }
                  }
               }
            }

            if (null == il.ad) {
               if (var5 == 705280997) {
                  throw new IllegalStateException();
               }

               RandomAccessFile var34 = new RandomAccessFile(var32, "rw");
               var36 = var34.read();
               var34.seek(0L);
               var34.write(var36);
               var34.seek(0L);
               var34.close();
               il.ad = new ua(new ud(var32, "rw", 25L), 24, 0);
            }
         } catch (IOException var28) {
         }

         il.ah = new ua(new ud(ka.ae("main_file_cache.dat2", -886717922), "rw", 1048576000L), 5200, 0);
         il.ap = new ua(new ud(ka.ae("main_file_cache.idx255", -1881734321), "rw", 1048576L), 6000, 0);
         ij.ab = new ua[gn.aq * 1694028507];

         for(var6 = 0; var6 < gn.aq * 1694028507; ++var6) {
            if (var5 == 705280997) {
               throw new IllegalStateException();
            }

            ij.ab[var6] = new ua(new ud(ka.ae("main_file_cache.idx" + var6, 419171459), "rw", 1048576L), 6000, 0);
         }

      } catch (RuntimeException var31) {
         throw vk.ae(var31, "ls.ac(" + ')');
      }
   }
}
