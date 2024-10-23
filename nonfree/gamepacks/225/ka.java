import java.io.File;
import java.io.RandomAccessFile;

public class ka {
   int ac;
   public static final int bn = 25;

   public static byte[] ac(CharSequence var0, int var1) {
      try {
         int var2 = var0.length();
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < var2; ++var4) {
            if (var1 <= -808571172) {
               throw new IllegalStateException();
            }

            char var5 = var0.charAt(var4);
            if (var5 > 127) {
               if (var1 <= -808571172) {
                  throw new IllegalStateException();
               }

               var3[var4] = 63;
            } else {
               var3[var4] = (byte)var5;
            }
         }

         return var3;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ka.ac(" + ')');
      }
   }

   public int ac(int var1) {
      try {
         return this.ac * 1343333809;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ka.ac(" + ')');
      }
   }

   public int ae() {
      return this.ac * 1343333809;
   }

   static final int ac(int var0, int var1, int var2, int var3, int var4) {
      try {
         return var0 * var2 + var1 * var3 >> 16;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ka.ac(" + ')');
      }
   }

   public int am() {
      return this.ac * 1450273654;
   }

   public static int aq(int var0, byte var1) {
      try {
         return nz.af(jy.ab[var0]);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ka.aq(" + ')');
      }
   }

   static final String mq(int var0, int var1, int var2) {
      try {
         int var3 = var1 - var0;
         if (var3 < -9) {
            if (var2 != -484962039) {
               throw new IllegalStateException();
            } else {
               return ar.ae(16711680, 1016407746);
            }
         } else if (var3 < -6) {
            if (var2 != -484962039) {
               throw new IllegalStateException();
            } else {
               return ar.ae(16723968, 1893255904);
            }
         } else if (var3 < -3) {
            return ar.ae(16740352, 828311335);
         } else if (var3 < 0) {
            if (var2 != -484962039) {
               throw new IllegalStateException();
            } else {
               return ar.ae(16756736, 943423755);
            }
         } else if (var3 > 9) {
            if (var2 != -484962039) {
               throw new IllegalStateException();
            } else {
               return ar.ae(65280, 1796305885);
            }
         } else if (var3 > 6) {
            if (var2 != -484962039) {
               throw new IllegalStateException();
            } else {
               return ar.ae(4259584, 1897802320);
            }
         } else if (var3 > 3) {
            return ar.ae(8453888, 1568318528);
         } else if (var3 > 0) {
            if (var2 != -484962039) {
               throw new IllegalStateException();
            } else {
               return ar.ae(12648192, 1803612617);
            }
         } else {
            return ar.ae(16776960, 826206974);
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ka.mq(" + ')');
      }
   }

   static File ae(String var0, int var1) {
      try {
         if (!iv.ac) {
            if (var1 == -1895033578) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException("");
            }
         } else {
            File var2 = (File)iv.ag.get(var0);
            if (null != var2) {
               if (var1 == -1895033578) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               File var3 = new File(iv.ae, var0);
               RandomAccessFile var4 = null;

               try {
                  File var5 = new File(var3.getParent());
                  if (!var5.exists()) {
                     if (var1 == -1895033578) {
                        throw new IllegalStateException();
                     } else {
                        throw new RuntimeException("");
                     }
                  } else {
                     var4 = new RandomAccessFile(var3, "rw");
                     int var6 = var4.read();
                     var4.seek(0L);
                     var4.write(var6);
                     var4.seek(0L);
                     var4.close();
                     iv.ag.put(var0, var3);
                     return var3;
                  }
               } catch (Exception var8) {
                  try {
                     if (var4 != null) {
                        if (var1 == -1895033578) {
                           throw new IllegalStateException();
                        }

                        var4.close();
                        var4 = null;
                     }
                  } catch (Exception var7) {
                  }

                  throw new RuntimeException();
               }
            }
         }
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "ka.ae(" + ')');
      }
   }

   public int ag() {
      return this.ac * 1343333809;
   }

   public ka(kb var1, int var2) {
      try {
         super();
         this.ac = var2 * -672038063;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ka.<init>(" + ')');
      }
   }
}
