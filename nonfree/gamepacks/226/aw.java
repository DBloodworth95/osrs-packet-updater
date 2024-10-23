import java.io.IOException;
import java.util.concurrent.Callable;

public class aw implements Callable {
   static final int bz = 41;
   final aj aw;
   // $FF: synthetic field
   final ae this$0;
   static or fl;
   static final int ax = 22;
   final vl ap;
   static or fh;

   public static byte[] ai(byte var0) {
      try {
         byte[] var1 = new byte[24];

         try {
            iq.an.aw(0L);
            iq.an.aj(var1, -956130020);

            int var2;
            for(var2 = 0; var2 < 24; ++var2) {
               if (var0 != 0) {
                  throw new IllegalStateException();
               }

               if (var1[var2] != 0) {
                  if (var0 != 0) {
                     throw new IllegalStateException();
                  }
                  break;
               }
            }

            if (var2 >= 24) {
               throw new IOException();
            }
         } catch (Exception var4) {
            for(int var3 = 0; var3 < 24; ++var3) {
               var1[var3] = -1;
            }
         }

         return var1;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "aw.ai(" + ')');
      }
   }

   aw(ae var1, vl var2, aj var3) {
      try {
         this.this$0 = var1;
         super();
         this.ap = var2;
         this.aw = var3;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "aw.<init>(" + ')');
      }
   }

   public Object ap() {
      return this.aw.ap(this.ap);
   }

   public Object aw() {
      return this.aw.ap(this.ap);
   }

   public Object ak() {
      return this.aw.ap(this.ap);
   }

   public Object aj() {
      return this.aw.ap(this.ap);
   }

   public Object call() {
      try {
         return this.aw.ap(this.ap);
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "aw.call(" + ')');
      }
   }

   static void hn(int var0, int var1, int var2, int var3) {
      try {
         if (io.vx.ac(-1310811942) != 0) {
            if (var3 <= 1933823159) {
               return;
            }

            if (var1 != 0) {
               if (var3 <= 1933823159) {
                  throw new IllegalStateException();
               }

               if (client.ty * -230015913 < 50) {
                  client.tm[-230015913 * client.ty] = var0;
                  client.tn[client.ty * -230015913] = var1;
                  client.tp[-230015913 * client.ty] = var2;
                  client.tb[-230015913 * client.ty] = null;
                  client.tc[client.ty * -230015913] = 0;
                  client.td[-230015913 * client.ty] = 0;
                  client.ty += 1355312999;
               }
            }
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "aw.hn(" + ')');
      }
   }

   public static boolean ap(pe var0, pe var1, int var2) {
      try {
         hc.ap = var1;
         if (!var0.bi((byte)59)) {
            return false;
         } else {
            ni.ak = var0.cq(35, 2079742609) * -686038829;
            hc.aw = new hc[-1191741605 * ni.ak];

            for(int var3 = 0; var3 < -1191741605 * ni.ak; ++var3) {
               if (var2 != 1856505173) {
                  throw new IllegalStateException();
               }

               byte[] var4 = var0.bm(35, var3, 852208536);
               hc.aw[var3] = new hc(var3);
               if (null != var4) {
                  if (var2 != 1856505173) {
                     throw new IllegalStateException();
                  }

                  hc.aw[var3].ak(new vl(var4), -1927142328);
                  hc.aw[var3].ai(-1548392015);
               }
            }

            return true;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "aw.ap(" + ')');
      }
   }

   static final String le(int var0, byte var1) {
      try {
         String var2 = Integer.toString(var0);

         for(int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + eh.aw + var2.substring(var3);
         }

         if (var2.length() > 9) {
            if (var1 == 3) {
               throw new IllegalStateException();
            } else {
               return " " + hs.aw(65408, (byte)61) + var2.substring(0, var2.length() - 8) + og.ge + " " + eh.aj + var2 + eh.ai + eh.ae;
            }
         } else if (var2.length() > 6) {
            if (var1 == 3) {
               throw new IllegalStateException();
            } else {
               return " " + hs.aw(16777215, (byte)15) + var2.substring(0, var2.length() - 4) + og.hr + " " + eh.aj + var2 + eh.ai + eh.ae;
            }
         } else {
            return " " + hs.aw(16776960, (byte)41) + var2 + eh.ae;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "aw.le(" + ')');
      }
   }

   static final void aj(dn var0, byte[] var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         int var8;
         int var9;
         if (var0.ak != null) {
            if (var6 == 0) {
               throw new IllegalStateException();
            }

            for(int var7 = 0; var7 < 4; ++var7) {
               if (var6 == 0) {
                  throw new IllegalStateException();
               }

               for(var8 = 0; var8 < 64; ++var8) {
                  if (var6 == 0) {
                     throw new IllegalStateException();
                  }

                  for(var9 = 0; var9 < 64; ++var9) {
                     if (var6 == 0) {
                        throw new IllegalStateException();
                     }

                     if (var2 + var8 > 0) {
                        if (var6 == 0) {
                           throw new IllegalStateException();
                        }

                        if (var2 + var8 < var0.ak[var7].bn.length) {
                           if (var6 == 0) {
                              return;
                           }

                           if (var3 + var9 > 0) {
                              if (var6 == 0) {
                                 throw new IllegalStateException();
                              }

                              if (var3 + var9 < var0.ak[var7].bn[var2 + var8].length) {
                                 if (var6 == 0) {
                                    throw new IllegalStateException();
                                 }

                                 int[] var10000 = var0.ak[var7].bn[var2 + var8];
                                 var10000[var9 + var3] &= -1073741825;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         vl var14 = new vl(var1);

         for(var8 = 0; var8 < 4; ++var8) {
            for(var9 = 0; var9 < 64; ++var9) {
               if (var6 == 0) {
                  throw new IllegalStateException();
               }

               for(int var10 = 0; var10 < 64; ++var10) {
                  if (var6 == 0) {
                     throw new IllegalStateException();
                  }

                  int var11 = var2 + var9;
                  int var12 = var10 + var3;
                  ed.as(var0, var14, var8, var11, var12, var4 + var11, var5 + var12, 0, (byte)-73);
               }
            }
         }

      } catch (RuntimeException var13) {
         throw tm.aw(var13, "aw.aj(" + ')');
      }
   }

   static char aj(char var0, int var1) {
      try {
         if (var0 != 181) {
            if (var1 == 2010704535) {
               throw new IllegalStateException();
            }

            if (var0 != 402) {
               return Character.toTitleCase(var0);
            }

            if (var1 == 2010704535) {
               throw new IllegalStateException();
            }
         }

         return var0;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "aw.aj(" + ')');
      }
   }
}
