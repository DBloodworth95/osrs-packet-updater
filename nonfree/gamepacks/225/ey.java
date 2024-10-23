public class ey extends se {
   static vt al;
   static final int bz = 53;
   static byte[][] ja;
   static tu wv;
   final boolean ac;

   public int ax(Object var1, Object var2) {
      return this.ac((sq)var1, (sq)var2, 884753178);
   }

   public int aq(Object var1, Object var2) {
      return this.ac((sq)var1, (sq)var2, -1545253246);
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ac((sq)var1, (sq)var2, 1738260536);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ey.compare(" + ')');
      }
   }

   public ey(boolean var1) {
      try {
         super();
         this.ac = var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ey.<init>(" + ')');
      }
   }

   public int af(Object var1, Object var2) {
      return this.ac((sq)var1, (sq)var2, -1091104120);
   }

   int ac(sq var1, sq var2, int var3) {
      try {
         byte var10000;
         if (-1744892407 * var1.ax == 914504241 * client.cn) {
            if (var3 <= -1685097594) {
               throw new IllegalStateException();
            }

            if (914504241 * client.cn != var2.ax * -1744892407) {
               if (this.ac) {
                  if (var3 <= -1685097594) {
                     throw new IllegalStateException();
                  }

                  var10000 = -1;
               } else {
                  var10000 = 1;
               }

               return var10000;
            }
         } else if (client.cn * 914504241 == -1744892407 * var2.ax) {
            if (var3 <= -1685097594) {
               throw new IllegalStateException();
            }

            if (this.ac) {
               if (var3 <= -1685097594) {
                  throw new IllegalStateException();
               }

               var10000 = 1;
            } else {
               var10000 = -1;
            }

            return var10000;
         }

         return this.ar(var1, var2, (byte)-12);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ey.ac(" + ')');
      }
   }

   int ae(sq var1, sq var2) {
      if (-1744892407 * var1.ax == 914504241 * client.cn) {
         if (914504241 * client.cn != var2.ax * -1744892407) {
            return this.ac ? -1 : 1;
         }
      } else if (client.cn * 914504241 == -1744892407 * var2.ax) {
         return this.ac ? 1 : -1;
      }

      return this.ar(var1, var2, (byte)-106);
   }

   int ag(sq var1, sq var2) {
      if (-1744892407 * var1.ax == 914504241 * client.cn) {
         if (914504241 * client.cn != var2.ax * -1744892407) {
            return this.ac ? -1 : 1;
         }
      } else if (client.cn * 914504241 == -1744892407 * var2.ax) {
         return this.ac ? 1 : -1;
      }

      return this.ar(var1, var2, (byte)-93);
   }

   static void kw(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, di var13, int var14) {
      try {
         id var15;
         int var16;
         int var17;
         label60: {
            var15 = kf.ae(var6, (byte)115);
            if (var4 != 1) {
               if (var14 >= 1683219623) {
                  throw new IllegalStateException();
               }

               if (var4 != 3) {
                  var16 = -1298730649 * var15.aa;
                  var17 = -1257293157 * var15.ai;
                  break label60;
               }

               if (var14 >= 1683219623) {
                  throw new IllegalStateException();
               }
            }

            var16 = -1257293157 * var15.ai;
            var17 = var15.aa * -1298730649;
         }

         int var18 = var1 + (var16 >> 1);
         int var19 = var1 + (1 + var16 >> 1);
         int var20 = (var17 >> 1) + var2;
         int var21 = (var17 + 1 >> 1) + var2;
         int[][] var22 = gs.jj.ar[var0];
         int var23 = var22[var18][var21] + var22[var19][var20] + var22[var18][var20] + var22[var19][var21] >> 2;
         int var24 = (var16 << 6) + (var1 << 7);
         int var25 = (var2 << 7) + (var17 << 6);
         jm var26 = var15.au(var3, var4, var22, var24, var23, var25, (byte)1);
         if (null != var26) {
            if (var14 >= 1683219623) {
               throw new IllegalStateException();
            }

            gx.lv(gs.jj, var0, var1, var2, var5, -1, 0, 0, 31, var7 + 1, var8 + 1, -1869735390);
            var13.ar = (client.do * 1472813913 + var7) * -1508461619;
            var13.al = 1044634931 * (var8 + 1472813913 * client.do);
            var13.ab = var26;
            var13.ad = var16 * -861806784 + var1 * -1723613568;
            var13.ap = -1730305984 * var17 + var2 * 834355328;
            var13.ah = var23 * -539220649;
            int var27;
            if (var9 > var11) {
               var27 = var9;
               var9 = var11;
               var11 = var27;
            }

            if (var10 > var12) {
               var27 = var10;
               var10 = var12;
               var12 = var27;
            }

            var13.az = (var1 + var9) * -2087549703;
            var13.ai = 1295715109 * (var1 + var11);
            var13.aa = 1431727999 * (var10 + var2);
            var13.ao = (var2 + var12) * 941331611;
         }

      } catch (RuntimeException var28) {
         throw vk.ae(var28, "ey.kw(" + ')');
      }
   }

   static final void ao(String var0, int var1, int var2) {
      try {
         mq var3 = fs.ac(mz.ar, client.ia.ax, (byte)-63);
         var3.ag.bu(uo.be(var0, -1637263606) + 1, (byte)-58);
         var3.ag.bc(var0, -588891491);
         var3.ag.dh(var1, -2073164966);
         client.ia.ag(var3, -615778532);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ey.ao(" + ')');
      }
   }
}
