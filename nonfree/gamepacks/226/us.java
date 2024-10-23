public class us {
   public static final us ap = new us("p11_full");
   public static final us aw = new us("p12_full");
   public static final us ak = new us("b12_full");
   public static final us aj = new us("verdana_11pt_regular");
   public static final us ai = new us("verdana_13pt_regular");
   public static final us ay = new us("verdana_15pt_regular");
   String as;
   static final int en = 0;
   static final int av = 23;
   static int ao;

   us(String var1) {
      try {
         super();
         this.as = var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "us.<init>(" + ')');
      }
   }

   static final void ng(String var0, short var1) {
      try {
         if (do.sb == null) {
            if (var1 <= 237) {
               throw new IllegalStateException();
            }
         } else {
            me var2 = ef.ap(mm.dt, client.in.ai, (byte)4);
            var2.ak.bo(ct.bl(var0, 487956541), -1301204325);
            var2.ak.be(var0, (byte)112);
            client.in.ak(var2, (short)486);
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "us.ng(" + ')');
      }
   }

   static void ar(boolean var0, int var1) {
      try {
         if (!dd.bl.gl((byte)0)) {
            if (var1 != -7998461) {
               return;
            }

            if (!dd.bl.gn(270739447)) {
               if (var1 != -7998461) {
                  throw new IllegalStateException();
               }

               if (!dd.bl.gb((short)-975)) {
                  dq.cd = og.iw;
                  dq.ci = og.ic;
                  dq.cn = og.ix;
                  as.aa(2, (byte)1);
                  if (var0) {
                     if (var1 != -7998461) {
                        throw new IllegalStateException();
                     }

                     dq.cf = "";
                  }

                  nl.ai((byte)73);
                  dp.as(1242328794);
                  return;
               }
            }
         }

         as.aa(10, (byte)1);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "us.ar(" + ')');
      }
   }

   static String ae(int var0, int var1, boolean var2, int var3) {
      try {
         if (var1 >= 2) {
            if (var3 == 386220518) {
               throw new IllegalStateException();
            }

            if (var1 <= 36) {
               if (var2) {
                  if (var3 == 386220518) {
                     throw new IllegalStateException();
                  }

                  if (var0 >= 0) {
                     int var4 = 2;

                     for(int var5 = var0 / var1; 0 != var5; ++var4) {
                        if (var3 == 386220518) {
                           throw new IllegalStateException();
                        }

                        var5 /= var1;
                     }

                     char[] var6 = new char[var4];
                     var6[0] = '+';

                     for(int var7 = var4 - 1; var7 > 0; --var7) {
                        if (var3 == 386220518) {
                           throw new IllegalStateException();
                        }

                        int var8 = var0;
                        var0 /= var1;
                        int var9 = var8 - var1 * var0;
                        if (var9 >= 10) {
                           if (var3 == 386220518) {
                              throw new IllegalStateException();
                           }

                           var6[var7] = (char)(87 + var9);
                        } else {
                           var6[var7] = (char)(var9 + 48);
                        }
                     }

                     return new String(var6);
                  }
               }

               return Integer.toString(var0, var1);
            }

            if (var3 == 386220518) {
               throw new IllegalStateException();
            }
         }

         throw new IllegalArgumentException("" + var1);
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "us.ae(" + ')');
      }
   }

   static da aw(int var0, int var1, int var2, int var3) {
      try {
         int var4 = mr.ap(var1, var0, -1983951584);
         da var5 = ig.ak(var4, var0, 2047714853);
         if (var5 != null) {
            if (var3 != 1570207647) {
               throw new IllegalStateException();
            } else {
               return var5;
            }
         } else {
            var4 = ui.aw(var2, var0, (byte)-17);
            var5 = ig.ak(var4, var0, 1366834672);
            if (null != var5) {
               if (var3 != 1570207647) {
                  throw new IllegalStateException();
               } else {
                  return var5;
               }
            } else {
               var4 = dg.ak(var0, 1374973643);
               var5 = ig.ak(var4, var0, 1388345990);
               if (null != var5) {
                  if (var3 != 1570207647) {
                     throw new IllegalStateException();
                  } else {
                     return var5;
                  }
               } else {
                  return null;
               }
            }
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "us.aw(" + ')');
      }
   }
}
