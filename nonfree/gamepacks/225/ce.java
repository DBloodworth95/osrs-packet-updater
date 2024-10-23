public class ce {
   int aq;
   int ae;
   int ag;
   static final int bw = 48;
   int ax;
   int am;
   String af;
   String at;
   boolean au;
   public static final int db = 112;
   static final int bu = 54;
   static jq mj;
   int ac;

   public static hd ac(int var0, short var1) {
      try {
         hd var2 = (hd)hd.ae.ac((long)var0);
         if (null != var2) {
            if (var1 <= 937) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = hd.ac.bt(8, var0, (byte)63);
            var2 = new hd();
            if (null != var3) {
               if (var1 <= 937) {
                  throw new IllegalStateException();
               }

               var2.ae(new vf(var3), (byte)-52);
            }

            hd.ae.ag(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ce.ac(" + ')');
      }
   }

   static void ac(int var0) {
      try {
         for(ca var1 = (ca)ca.ac.af(); var1 != null; var1 = (ca)ca.ac.au()) {
            if (var0 >= 1834351572) {
               return;
            }

            if (null != var1.ar) {
               if (var0 >= 1834351572) {
                  throw new IllegalStateException();
               }

               ba.tr.ae(var1.ar);
               var1.ar = null;
            }

            if (var1.ab != null) {
               if (var0 >= 1834351572) {
                  throw new IllegalStateException();
               }

               ba.tr.ae(var1.ab);
               var1.ab = null;
            }
         }

         ca.ac.ac();
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ce.ac(" + ')');
      }
   }

   static boolean ae(long var0) {
      try {
         return nz.af(var0) == 2;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ce.ae(" + ')');
      }
   }

   ce() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ce.<init>(" + ')');
      }
   }

   static void it(int var0, int var1, int var2, byte var3) {
      try {
         if (re.vt.ay(2057221037) != 0 && 0 != var1) {
            if (var3 <= 8) {
               throw new IllegalStateException();
            }

            if (client.th * -613960017 < 50) {
               if (var3 <= 8) {
                  throw new IllegalStateException();
               }

               client.to[-613960017 * client.th] = var0;
               client.tx[client.th * -613960017] = var1;
               client.tq[client.th * -613960017] = var2;
               client.td[client.th * -613960017] = null;
               client.tg[-613960017 * client.th] = 0;
               client.ta[-613960017 * client.th] = 0;
               client.th += -2137825201;
            }
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ce.it(" + ')');
      }
   }

   static int at(int var0, dt var1, boolean var2, short var3) {
      try {
         ny var4;
         if (var0 >= 2000) {
            if (var3 <= 4032) {
               throw new IllegalStateException();
            }

            var0 -= 1000;
            var4 = ir.ep.ac(cs.at[(mp.au -= -1856457959) * 844691753], -2003579036);
         } else {
            var4 = var2 ? cs.ab : ry.ap;
         }

         dc.ni(var4, 667850230);
         boolean var10000;
         int var5;
         int var6;
         if (1200 != var0 && 1205 != var0 && var0 != 1212) {
            if (var0 == 1201) {
               if (var3 <= 4032) {
                  throw new IllegalStateException();
               } else {
                  var4.cs = 359243062;
                  var4.cp = cs.at[(mp.au -= -1856457959) * 844691753] * 1919793905;
                  return 1;
               }
            } else if (var0 == 1202) {
               if (var3 <= 4032) {
                  throw new IllegalStateException();
               } else {
                  var4.cs = 538864593;
                  var4.cp = qm.mm.ae.al((byte)-76) * 1919793905;
                  return 1;
               }
            } else if (1207 == var0) {
               if (cs.at[(mp.au -= -1856457959) * 844691753] == 1) {
                  if (var3 <= 4032) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var9 = var10000;
               var4.bz(qm.mm.ae, var9, (byte)110);
               return 1;
            } else if (var0 == 1208) {
               if (var3 <= 4032) {
                  throw new IllegalStateException();
               } else {
                  var5 = cs.at[(mp.au -= -1856457959) * 844691753];
                  if (var4.dw == null) {
                     if (var3 <= 4032) {
                        throw new IllegalStateException();
                     } else {
                        throw new RuntimeException("");
                     }
                  } else {
                     var4.dw.az(var5, -761158294);
                     return 1;
                  }
               }
            } else if (1209 == var0) {
               if (var3 <= 4032) {
                  throw new IllegalStateException();
               } else {
                  mp.au -= 582051378;
                  var5 = cs.at[mp.au * 844691753];
                  var6 = cs.at[844691753 * mp.au + 1];
                  if (null == var4.dw) {
                     if (var3 <= 4032) {
                        throw new IllegalStateException();
                     } else {
                        throw new RuntimeException("");
                     }
                  } else {
                     var4.dw.ab(var5, var6, 618435315);
                     return 1;
                  }
               }
            } else if (var0 == 1210) {
               var5 = cs.at[(mp.au -= -1856457959) * 844691753];
               if (var4.dw == null) {
                  if (var3 <= 4032) {
                     throw new IllegalStateException();
                  } else {
                     throw new RuntimeException("");
                  }
               } else {
                  var4.dw.ah(2024464609 * qm.mm.ae.ax, var5, -2030636546);
                  return 1;
               }
            } else {
               return 2;
            }
         } else {
            mp.au -= 582051378;
            var5 = cs.at[844691753 * mp.au];
            var6 = cs.at[1 + mp.au * 844691753];
            var4.gz = -193611161 * var5;
            var4.gm = var6 * -324307045;
            is var7 = dh.ac(var5, 2145655140);
            var4.dv = -1511032137 * var7.aw;
            var4.dt = -1796423339 * var7.an;
            var4.dk = 177165141 * var7.ak;
            var4.dp = var7.bn * 447177037;
            var4.df = 868143819 * var7.bh;
            var4.dl = var7.av * 547905761;
            if (1205 == var0) {
               if (var3 <= 4032) {
                  throw new IllegalStateException();
               }

               var4.dj = 0;
            } else {
               if (var0 == 1212) {
                  if (var3 <= 4032) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               if (var10000 | 1 == -8414531 * var7.bf) {
                  if (var3 <= 4032) {
                     throw new IllegalStateException();
                  }

                  var4.dj = 350192097;
               } else {
                  var4.dj = 700384194;
               }
            }

            if (var4.db * 1485045609 > 0) {
               if (var3 <= 4032) {
                  throw new IllegalStateException();
               }

               var4.dl = 556193713 * (174205472 * var4.dl / (1485045609 * var4.db));
            } else if (var4.bi * 1848455111 > 0) {
               if (var3 <= 4032) {
                  throw new IllegalStateException();
               }

               var4.dl = 556193713 * (var4.dl * 174205472 / (1848455111 * var4.bi));
            }

            return 1;
         }
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "ce.at(" + ')');
      }
   }
}
