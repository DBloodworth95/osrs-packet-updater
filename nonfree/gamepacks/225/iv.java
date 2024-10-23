import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class iv {
   static File ae;
   static final int oz = 0;
   static Hashtable ag = new Hashtable(16);
   static boolean ac = false;
   static final String hw = "JX_CHARACTER_ID";

   static File at(String var0) {
      if (!ac) {
         throw new RuntimeException("");
      } else {
         File var1 = (File)ag.get(var0);
         if (null != var1) {
            return var1;
         } else {
            File var2 = new File(ae, var0);
            RandomAccessFile var3 = null;

            try {
               File var4 = new File(var2.getParent());
               if (!var4.exists()) {
                  throw new RuntimeException("");
               } else {
                  var3 = new RandomAccessFile(var2, "rw");
                  int var5 = var3.read();
                  var3.seek(0L);
                  var3.write(var5);
                  var3.seek(0L);
                  var3.close();
                  ag.put(var0, var2);
                  return var2;
               }
            } catch (Exception var7) {
               try {
                  if (var3 != null) {
                     var3.close();
                     var3 = null;
                  }
               } catch (Exception var6) {
               }

               throw new RuntimeException();
            }
         }
      }
   }

   iv() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "iv.<init>(" + ')');
      }
   }

   static void ax(File var0) {
      ae = var0;
      if (!ae.exists()) {
         throw new RuntimeException("");
      } else {
         ac = true;
      }
   }

   static void aq(File var0) {
      ae = var0;
      if (!ae.exists()) {
         throw new RuntimeException("");
      } else {
         ac = true;
      }
   }

   static void am(File var0) {
      ae = var0;
      if (!ae.exists()) {
         throw new RuntimeException("");
      } else {
         ac = true;
      }
   }

   public static boolean au(byte var0) {
      try {
         return !mm.af.isEmpty();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "iv.au(" + ')');
      }
   }

   public static void au() {
      ag.clear();
   }

   public static void ar() {
      ag.clear();
   }

   public static void al() {
      ag.clear();
   }

   static void af(File var0) {
      ae = var0;
      if (!ae.exists()) {
         throw new RuntimeException("");
      } else {
         ac = true;
      }
   }

   public static final void ac(long var0) {
      try {
         if (var0 > 0L) {
            if (var0 % 10L == 0L) {
               mt.ae(var0 - 1L);
               mt.ae(1L);
            } else {
               mt.ae(var0);
            }

         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "iv.ac(" + ')');
      }
   }

   static int aa(ny var0, int var1) {
      try {
         if (-1256894539 * var0.bf != 11) {
            rt.al -= -1975882559;
            cs.at[(mp.au += -1856457959) * 844691753 - 1] = -1;
            return 1;
         } else {
            String var2 = cs.ar[(rt.al -= -1975882559) * -515103935];
            cs.at[(mp.au += -1856457959) * 844691753 - 1] = var0.ak(var2, (byte)21);
            return 1;
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "iv.aa(" + ')');
      }
   }

   public static String ac(byte[] var0, int var1) {
      try {
         int var3 = var0.length;
         StringBuilder var4 = new StringBuilder();

         for(int var5 = 0; var5 < var3 + 0; var5 += 3) {
            int var6 = var0[var5] & 255;
            var4.append(qi.ac[var6 >>> 2]);
            if (var5 < var3 - 1) {
               if (var1 <= 1949033823) {
                  throw new IllegalStateException();
               }

               int var7 = var0[1 + var5] & 255;
               var4.append(qi.ac[(var6 & 3) << 4 | var7 >>> 4]);
               if (var5 < var3 - 2) {
                  if (var1 <= 1949033823) {
                     throw new IllegalStateException();
                  }

                  int var8 = var0[var5 + 2] & 255;
                  var4.append(qi.ac[(var7 & 15) << 2 | var8 >>> 6]).append(qi.ac[var8 & 63]);
               } else {
                  var4.append(qi.ac[(var7 & 15) << 2]).append("=");
               }
            } else {
               var4.append(qi.ac[(var6 & 3) << 4]).append("==");
            }
         }

         String var2 = var4.toString();
         return var2;
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "iv.ac(" + ')');
      }
   }
}
