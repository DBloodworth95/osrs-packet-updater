import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class do extends tw {
   int ak;
   int aw;
   int ae;
   int aj;
   int ay;
   public static final String ky = "Date not valid.";
   int as;
   int ap;
   int am;
   int at;
   int ai;
   int ao;
   int af;
   int ar;
   static final int ci = 71;
   public static final int bw = 72;
   int au;
   static st sb;

   void ap(int var1, int var2) {
      try {
         this.ao = var1 * 747120319;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "do.ap(" + ')');
      }
   }

   boolean am(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return 0 != (655247679 * this.ao & 1 << var1);
      } else {
         return true;
      }
   }

   boolean aw(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 <= -597496126) {
               throw new IllegalStateException();
            }

            if (var1 <= 4) {
               if (var2 <= -597496126) {
                  throw new IllegalStateException();
               }

               boolean var10000;
               if (0 != (655247679 * this.ao & 1 << var1)) {
                  if (var2 <= -597496126) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               return var10000;
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "do.aw(" + ')');
      }
   }

   void ak(int var1) {
      this.ao = var1 * 700997061;
   }

   boolean at(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return 0 != (655247679 * this.ao & 1 << var1);
      } else {
         return true;
      }
   }

   void ai(int var1) {
      this.ao = var1 * -1422159371;
   }

   void ay(int var1) {
      this.ao = var1 * -876544798;
   }

   boolean as(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return 0 != (655247679 * this.ao & 1 << var1);
      } else {
         return true;
      }
   }

   boolean ae(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return 0 != (655247679 * this.ao & 1 << var1);
      } else {
         return true;
      }
   }

   do() {
      try {
         super();
         this.ao = 1685893409;
         this.af = 0;
         this.ar = 1983821095;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "do.<init>(" + ')');
      }
   }

   void aj(int var1) {
      this.ao = var1 * 248657634;
   }

   public static void ap(String var0, String var1, String var2, int var3, int var4, int var5) throws IOException {
      try {
         if (null != var1) {
            if (var5 <= -985328474) {
               return;
            }

            if (!var1.isEmpty()) {
               if (var5 <= -985328474) {
                  throw new IllegalStateException();
               }

               var0 = var0 + "-" + var1;
            }
         }

         iq.ay = -985843749 * var4;
         hl.ab = 1686458197 * var3;

         try {
            mp.ax = System.getProperty("os.name");
         } catch (Exception var26) {
            mp.ax = "Unknown";
         }

         hg.av = mp.ax.toLowerCase();
         hd.aq = null;

         try {
            hd.aq = System.getProperty("jagex.userhome");
         } catch (Exception var25) {
         }

         if (null == hd.aq) {
            if (var5 <= -985328474) {
               return;
            }

            try {
               hd.aq = System.getProperty("user.home");
            } catch (Exception var24) {
            }
         }

         if (null != hd.aq) {
            if (var5 <= -985328474) {
               throw new IllegalStateException();
            }

            hd.aq = hd.aq + "/";
         }

         try {
            if (hg.av.startsWith("win")) {
               if (hd.aq == null) {
                  if (var5 <= -985328474) {
                     throw new IllegalStateException();
                  }

                  hd.aq = System.getenv("USERPROFILE");
               }
            } else if (null == hd.aq) {
               if (var5 <= -985328474) {
                  throw new IllegalStateException();
               }

               hd.aq = System.getenv("HOME");
            }

            if (hd.aq != null) {
               if (var5 <= -985328474) {
                  throw new IllegalStateException();
               }

               hd.aq = hd.aq + "/";
            }
         } catch (Exception var23) {
         }

         if (hd.aq == null) {
            if (var5 <= -985328474) {
               throw new IllegalStateException();
            }

            hd.aq = "~/";
         }

         gl.az = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", hd.aq, "/tmp/", ""};
         hp.ag = new String[]{".jagex_cache_" + -1954269699 * hl.ab, ".file_store_" + -1954269699 * hl.ab};
         int var6 = 0;

         label370:
         while(var6 < 4) {
            String var10000;
            if (0 == var6) {
               if (var5 <= -985328474) {
                  throw new IllegalStateException();
               }

               var10000 = "";
            } else {
               var10000 = "" + var6;
            }

            String var8 = var10000;
            fk.aj = new File(hd.aq, "jagex_cl_" + var0 + "_" + var2 + var8 + ".dat");
            String var9 = null;
            String var10 = null;
            boolean var11 = false;
            int var14;
            int var16;
            File var35;
            if (fk.aj.exists()) {
               if (var5 <= -985328474) {
                  throw new IllegalStateException();
               }

               try {
                  label378: {
                     un var12 = new un(fk.aj, "rw", 10000L);

                     vl var13;
                     for(var13 = new vl((int)var12.ai((byte)0)); -1689308347 * var13.am < var13.ae.length; var13.am += var14 * -725588083) {
                        var14 = var12.ay(var13.ae, -1689308347 * var13.am, var13.ae.length - var13.am * -1689308347, -1240738936);
                        if (-1 == var14) {
                           if (var5 <= -985328474) {
                              throw new IllegalStateException();
                           }

                           throw new IOException();
                        }
                     }

                     var13.am = 0;
                     var14 = var13.cy((short)-18265);
                     if (var14 >= 1) {
                        if (var5 <= -985328474) {
                           throw new IllegalStateException();
                        }

                        if (var14 <= 3) {
                           int var15 = 0;
                           if (var14 > 1) {
                              if (var5 <= -985328474) {
                                 throw new IllegalStateException();
                              }

                              var15 = var13.cy((short)-16121);
                           }

                           if (var14 <= 2) {
                              if (var5 <= -985328474) {
                                 throw new IllegalStateException();
                              }

                              var9 = var13.ca(788558980);
                              if (var15 == 1) {
                                 if (var5 <= -985328474) {
                                    return;
                                 }

                                 var10 = var13.ca(-247075507);
                              }
                           } else {
                              var9 = var13.cs(-76576624);
                              if (1 == var15) {
                                 if (var5 <= -985328474) {
                                    return;
                                 }

                                 var10 = var13.cs(1836512190);
                              }
                           }

                           var12.ak(-539560248);
                           break label378;
                        }

                        if (var5 <= -985328474) {
                           throw new IllegalStateException();
                        }
                     }

                     throw new IOException("" + var14);
                  }
               } catch (IOException var28) {
                  var28.printStackTrace();
               }

               if (var9 != null) {
                  if (var5 <= -985328474) {
                     throw new IllegalStateException();
                  }

                  var35 = new File(var9);
                  if (!var35.exists()) {
                     var9 = null;
                  }
               }

               if (null != var9) {
                  if (var5 <= -985328474) {
                     throw new IllegalStateException();
                  }

                  var35 = new File(var9, "test.dat");

                  boolean var39;
                  try {
                     RandomAccessFile var43 = new RandomAccessFile(var35, "rw");
                     var16 = var43.read();
                     var43.seek(0L);
                     var43.write(var16);
                     var43.seek(0L);
                     var43.close();
                     var35.delete();
                     var39 = true;
                  } catch (Exception var22) {
                     var39 = false;
                  }

                  if (!var39) {
                     if (var5 <= -985328474) {
                        throw new IllegalStateException();
                     }

                     var9 = null;
                  }
               }
            }

            if (var9 == null) {
               if (var5 <= -985328474) {
                  throw new IllegalStateException();
               }

               if (var6 == 0) {
                  if (var5 <= -985328474) {
                     throw new IllegalStateException();
                  }

                  label342:
                  for(int var32 = 0; var32 < hp.ag.length; ++var32) {
                     for(int var38 = 0; var38 < gl.az.length; ++var38) {
                        if (var5 <= -985328474) {
                           throw new IllegalStateException();
                        }

                        File var41 = new File(gl.az[var38] + hp.ag[var32] + File.separatorChar + var0 + File.separatorChar);
                        if (var41.exists()) {
                           if (var5 <= -985328474) {
                              throw new IllegalStateException();
                           }

                           File var44 = new File(var41, "test.dat");

                           boolean var45;
                           try {
                              RandomAccessFile var17 = new RandomAccessFile(var44, "rw");
                              int var18 = var17.read();
                              var17.seek(0L);
                              var17.write(var18);
                              var17.seek(0L);
                              var17.close();
                              var44.delete();
                              var45 = true;
                           } catch (Exception var21) {
                              var45 = false;
                           }

                           if (var45) {
                              if (var5 <= -985328474) {
                                 throw new IllegalStateException();
                              }

                              var9 = var41.toString();
                              var11 = true;
                              break label342;
                           }
                        }
                     }
                  }
               }
            }

            if (var9 == null) {
               var9 = hd.aq + File.separatorChar + "jagexcache" + var8 + File.separatorChar + var0 + File.separatorChar + var2 + File.separatorChar;
               var11 = true;
            }

            if (null != var10) {
               if (var5 <= -985328474) {
                  throw new IllegalStateException();
               }

               File var34 = new File(var10);
               var35 = new File(var9);

               try {
                  File[] var42 = var34.listFiles();
                  File[] var47 = var42;

                  for(var16 = 0; var16 < var47.length; ++var16) {
                     File var46 = var47[var16];
                     File var48 = new File(var35, var46.getName());
                     boolean var19 = var46.renameTo(var48);
                     if (!var19) {
                        if (var5 <= -985328474) {
                           throw new IllegalStateException();
                        }

                        throw new IOException();
                     }
                  }
               } catch (Exception var27) {
                  var27.printStackTrace();
               }

               var11 = true;
            }

            if (var11) {
               de.aw(new File(var9), (File)null, -1837779746);
            }

            File var7 = new File(var9);
            iq.ai = var7;
            if (!iq.ai.exists()) {
               if (var5 <= -985328474) {
                  throw new IllegalStateException();
               }

               iq.ai.mkdirs();
            }

            File[] var30 = iq.ai.listFiles();
            if (null != var30) {
               if (var5 <= -985328474) {
                  throw new IllegalStateException();
               }

               File[] var37 = var30;

               for(int var31 = 0; var31 < var37.length; ++var31) {
                  if (var5 <= -985328474) {
                     throw new IllegalStateException();
                  }

                  File var33 = var37[var31];

                  boolean var36;
                  try {
                     RandomAccessFile var40 = new RandomAccessFile(var33, "rw");
                     var14 = var40.read();
                     var40.seek(0L);
                     var40.write(var14);
                     var40.seek(0L);
                     var40.close();
                     var36 = true;
                  } catch (Exception var20) {
                     var36 = false;
                  }

                  if (!var36) {
                     ++var6;
                     continue label370;
                  }
               }
            }
            break;
         }

         mw.ap(iq.ai, -808073802);
         ae.aj(1854978968);
         iq.ao = new uj(new un(dv.aw("main_file_cache.dat2", 2076481411), "rw", 1048576000L), 5200, 0);
         iq.af = new uj(new un(dv.aw("main_file_cache.idx255", 1267692263), "rw", 1048576L), 6000, 0);
         et.ar = new uj[-372511661 * iq.ay];

         for(var6 = 0; var6 < -372511661 * iq.ay; ++var6) {
            if (var5 <= -985328474) {
               throw new IllegalStateException();
            }

            et.ar[var6] = new uj(new un(dv.aw("main_file_cache.idx" + var6, 17760229), "rw", 1048576L), 6000, 0);
         }

      } catch (RuntimeException var29) {
         throw tm.aw(var29, "do.ap(" + ')');
      }
   }

   public static byte[] ai(CharSequence var0, int var1) {
      try {
         int var2 = var0.length();
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < var2; ++var4) {
            char var5;
            label217: {
               var5 = var0.charAt(var4);
               if (var5 > 0) {
                  if (var1 != 1454210871) {
                     throw new IllegalStateException();
                  }

                  if (var5 < 128) {
                     break label217;
                  }

                  if (var1 != 1454210871) {
                     throw new IllegalStateException();
                  }
               }

               if (var5 >= 160) {
                  if (var1 != 1454210871) {
                     throw new IllegalStateException();
                  }

                  if (var5 <= 255) {
                     break label217;
                  }
               }

               if (var5 == 8364) {
                  if (var1 != 1454210871) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -128;
               } else if (8218 == var5) {
                  if (var1 != 1454210871) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -126;
               } else if (var5 == 402) {
                  if (var1 != 1454210871) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -125;
               } else if (8222 == var5) {
                  if (var1 != 1454210871) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -124;
               } else if (8230 == var5) {
                  if (var1 != 1454210871) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -123;
               } else if (8224 == var5) {
                  var3[var4] = -122;
               } else if (var5 == 8225) {
                  if (var1 != 1454210871) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -121;
               } else if (710 == var5) {
                  if (var1 != 1454210871) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -120;
               } else if (8240 == var5) {
                  if (var1 != 1454210871) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -119;
               } else if (352 == var5) {
                  var3[var4] = -118;
               } else if (var5 == 8249) {
                  if (var1 != 1454210871) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -117;
               } else if (var5 == 338) {
                  var3[var4] = -116;
               } else if (var5 == 381) {
                  if (var1 != 1454210871) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -114;
               } else if (8216 == var5) {
                  var3[var4] = -111;
               } else if (var5 == 8217) {
                  var3[var4] = -110;
               } else if (var5 == 8220) {
                  if (var1 != 1454210871) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -109;
               } else if (var5 == 8221) {
                  if (var1 != 1454210871) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -108;
               } else if (var5 == 8226) {
                  var3[var4] = -107;
               } else if (8211 == var5) {
                  if (var1 != 1454210871) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -106;
               } else if (var5 == 8212) {
                  if (var1 != 1454210871) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -105;
               } else if (732 == var5) {
                  if (var1 != 1454210871) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -104;
               } else if (var5 == 8482) {
                  if (var1 != 1454210871) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -103;
               } else if (353 == var5) {
                  if (var1 != 1454210871) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -102;
               } else if (var5 == 8250) {
                  if (var1 != 1454210871) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -101;
               } else if (339 == var5) {
                  if (var1 != 1454210871) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -100;
               } else if (var5 == 382) {
                  if (var1 != 1454210871) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -98;
               } else if (var5 == 376) {
                  if (var1 != 1454210871) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -97;
               } else {
                  var3[var4] = 63;
               }
               continue;
            }

            var3[var4] = (byte)var5;
         }

         return var3;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "do.ai(" + ')');
      }
   }
}
