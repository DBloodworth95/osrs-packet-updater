public class ej extends se {
   static final int cs = 90;
   static final int av = 1076101507;
   final boolean ac;
   static final int ax = 4;

   public int af(Object var1, Object var2) {
      return this.ac((sq)var1, (sq)var2, (byte)37);
   }

   int ac(sq var1, sq var2, byte var3) {
      try {
         if (-1744892407 * var1.ax == client.cn * 914504241) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            }

            if (client.cn * 914504241 == -1744892407 * var2.ax) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }

               int var10000;
               if (this.ac) {
                  if (var3 <= 1) {
                     throw new IllegalStateException();
                  }

                  var10000 = var1.aq * -59694769 - var2.aq * -59694769;
               } else {
                  var10000 = var2.aq * -59694769 - var1.aq * -59694769;
               }

               return var10000;
            }
         }

         return this.ar(var1, var2, (byte)-47);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ej.ac(" + ')');
      }
   }

   public int aq(Object var1, Object var2) {
      return this.ac((sq)var1, (sq)var2, (byte)124);
   }

   public ej(boolean var1) {
      try {
         super();
         this.ac = var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ej.<init>(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ac((sq)var1, (sq)var2, (byte)122);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ej.compare(" + ')');
      }
   }

   static final dj oe(int var0, int var1, int var2, int var3) {
      try {
         dj var4 = new dj();
         var4.ac = 1263027843 * var1;
         var4.ae = var2 * 1584525207;
         client.ol.ag(var4, (long)var0);
         hu.nx(var1, (byte)2);
         ny var5 = ir.ep.ac(var0, -1765530687);
         dc.ni(var5, 667850230);
         if (null != client.po) {
            if (var3 <= -2023519509) {
               throw new IllegalStateException();
            }

            dc.ni(client.po, 667850230);
            client.po = null;
         }

         ao.mv(ir.ep.aq[var0 >> 16], var5, false, 392960591);
         li.cu(var1, 2134601140);
         if (-1 != 250910895 * client.ok) {
            if (var3 <= -2023519509) {
               throw new IllegalStateException();
            }

            fd.nh(client.ok * 250910895, 1, 1820360788);
         }

         return var4;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ej.oe(" + ')');
      }
   }

   int ae(sq var1, sq var2) {
      if (-1744892407 * var1.ax == client.cn * 914504241 && client.cn * 914504241 == -1744892407 * var2.ax) {
         return this.ac ? var1.aq * -59694769 - var2.aq * -59694769 : var2.aq * -459923530 - var1.aq * -59694769;
      } else {
         return this.ar(var1, var2, (byte)8);
      }
   }

   public static void ax(int var0) {
      try {
         he.ae.am();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ej.ax(" + ')');
      }
   }

   static final void lo(int var0, int var1, byte var2) {
      try {
         if (client.nn.ae * 2098117423 < 2) {
            if (var2 >= 15) {
               throw new IllegalStateException();
            }

            if (0 == client.oa * -1780236987 && !client.od) {
               if (var2 >= 15) {
                  throw new IllegalStateException();
               }

               return;
            }
         }

         if (!client.oc) {
            if (var2 >= 15) {
               throw new IllegalStateException();
            }
         } else {
            String var4;
            label76: {
               int var3 = ux.mn((byte)80);
               if (-1780236987 * client.oa == 1) {
                  if (var2 >= 15) {
                     throw new IllegalStateException();
                  }

                  if (client.nn.ae * 2098117423 < 2) {
                     if (var2 >= 15) {
                        throw new IllegalStateException();
                     }

                     var4 = ok.gt + ok.gh + client.it + " " + ez.aq;
                     break label76;
                  }
               }

               if (client.od) {
                  if (var2 >= 15) {
                     throw new IllegalStateException();
                  }

                  if (2098117423 * client.nn.ae < 2) {
                     if (var2 >= 15) {
                        throw new IllegalStateException();
                     }

                     var4 = client.ou + ok.gh + client.op + " " + ez.aq;
                     break label76;
                  }
               }

               var4 = client.nn.ac(var3, 16776960);
            }

            if (2098117423 * client.nn.ae > 2) {
               if (var2 >= 15) {
                  throw new IllegalStateException();
               }

               var4 = var4 + ar.ae(16777215, 1078900873) + " " + '/' + " " + (client.nn.ae * 2098117423 - 2) + ok.gw;
            }

            bw.io.bf(var4, var0 + 4, 15 + var1, 16777215, 0, client.do * 1472813913 / 1000);
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ej.lo(" + ')');
      }
   }

   public int ax(Object var1, Object var2) {
      return this.ac((sq)var1, (sq)var2, (byte)11);
   }
}
