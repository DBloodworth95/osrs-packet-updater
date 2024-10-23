public class ly {
   static final ly ap = new ly(0);
   static final ly aw = new ly(1);
   static int ls;
   final int ak;

   static da ap(int var0, short var1) {
      try {
         da var2 = (da)da.ap.ap((long)var0);
         if (null != var2) {
            if (var1 != 2047) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = aw.fl.bm(var0, 0, 1578871757);
            if (null == var3) {
               if (var1 != 2047) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               var2 = dm.aj(var3, 2014828171);
               da.ap.ak(var2, (long)var0);
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ly.ap(" + ')');
      }
   }

   ly(int var1) {
      try {
         super();
         this.ak = var1 * 505153041;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ly.<init>(" + ')');
      }
   }

   public static boolean aw(CharSequence var0, int var1) {
      try {
         return at.ak(var0, 10, true, 1177143826);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ly.aw(" + ')');
      }
   }

   public static boolean aw(char var0, int var1) {
      try {
         if (var0 > 0) {
            if (var1 <= -1402468015) {
               throw new IllegalStateException();
            }

            if (var0 < 128) {
               return true;
            }

            if (var1 <= -1402468015) {
               throw new IllegalStateException();
            }
         }

         if (var0 >= 160) {
            if (var1 <= -1402468015) {
               throw new IllegalStateException();
            }

            if (var0 <= 255) {
               if (var1 <= -1402468015) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         if (var0 != 0) {
            if (var1 <= -1402468015) {
               throw new IllegalStateException();
            }

            char[] var2 = qf.ap;

            for(int var3 = 0; var3 < var2.length; ++var3) {
               if (var1 <= -1402468015) {
                  throw new IllegalStateException();
               }

               char var4 = var2[var3];
               if (var4 == var0) {
                  if (var1 <= -1402468015) {
                     throw new IllegalStateException();
                  }

                  return true;
               }
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ly.aw(" + ')');
      }
   }

   public static String as(byte[] var0, int var1, int var2, byte var3) {
      try {
         char[] var4 = new char[var2];
         int var5 = 0;

         for(int var6 = 0; var6 < var2; ++var6) {
            int var7 = var0[var6 + var1] & 255;
            if (var7 == 0) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }
            } else {
               if (var7 >= 128 && var7 < 160) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  char var8 = qf.ap[var7 - 128];
                  if (0 == var8) {
                     var8 = '?';
                  }

                  var7 = var8;
               }

               var4[var5++] = (char)var7;
            }
         }

         return new String(var4, 0, var5);
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "ly.as(" + ')');
      }
   }

   static String ak(um var0, int var1, String var2, int var3) {
      try {
         if (null == var0) {
            if (var3 >= 1439123802) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            tc var4 = (tc)var0.ap((long)var1);
            if (var4 == null) {
               if (var3 >= 1439123802) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               return (String)var4.ap;
            }
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ly.ak(" + ')');
      }
   }

   public static void ap(pe var0, pe var1, byte var2) {
      try {
         pq.ap = var0;
         pw.aw = var1;
         ak = pq.ap.cq(3, 1772302120) * -1981438965;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ly.ap(" + ')');
      }
   }
}
