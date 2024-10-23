import java.util.ArrayList;
import java.util.Iterator;

public class hh extends tp {
   public static pe ap;
   static mi aw = new mi(64);
   char ak;
   public int aj;
   boolean ay;
   public String ai;
   public static final int bw = 1008;

   public static hh as(int var0) {
      hh var1 = (hh)aw.ap((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = ap.bm(11, var0, 1720470779);
         var1 = new hh();
         if (var2 != null) {
            var1.ak(new vl(var2), 341059525);
         }

         var1.aw(-1083318459);
         aw.ak(var1, (long)var0);
         return var1;
      }
   }

   public static void az() {
      aw.aj();
   }

   void ak(vl var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cy((short)-24531);
            if (var3 == 0) {
               if (var2 <= -1558552043) {
                  return;
               }

               return;
            }

            this.aj(var1, var3, (byte)1);
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "hh.ak(" + ')');
      }
   }

   void aj(vl var1, int var2, byte var3) {
      try {
         if (1 == var2) {
            if (var3 != 1) {
               throw new IllegalStateException();
            }

            byte var5 = var1.cu((byte)13);
            int var6 = var5 & 255;
            if (0 == var6) {
               if (var3 != 1) {
                  throw new IllegalStateException();
               }

               throw new IllegalArgumentException("" + Integer.toString(var6, 16));
            }

            if (var6 >= 128) {
               if (var3 != 1) {
                  throw new IllegalStateException();
               }

               if (var6 < 160) {
                  if (var3 != 1) {
                     throw new IllegalStateException();
                  }

                  char var7 = qf.ap[var6 - 128];
                  if (var7 == 0) {
                     if (var3 != 1) {
                        throw new IllegalStateException();
                     }

                     var7 = '?';
                  }

                  var6 = var7;
               }
            }

            char var4 = (char)var6;
            this.ak = var4;
         } else if (2 == var2) {
            if (var3 != 1) {
               throw new IllegalStateException();
            }

            this.aj = var1.ch(1203709469) * 1360664581;
         } else if (var2 == 4) {
            this.ay = false;
         } else if (5 == var2) {
            if (var3 != 1) {
               throw new IllegalStateException();
            }

            this.ai = var1.cw(1974191719);
         }

      } catch (RuntimeException var8) {
         throw tm.aw(var8, "hh.aj(" + ')');
      }
   }

   public boolean ai(int var1) {
      try {
         return this.ak == 's';
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "hh.ai(" + ')');
      }
   }

   void an(vl var1) {
      while(true) {
         int var2 = var1.cy((short)-7340);
         if (var2 == 0) {
            return;
         }

         this.aj(var1, var2, (byte)1);
      }
   }

   public static hh ae(int var0) {
      hh var1 = (hh)aw.ap((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = ap.bm(11, var0, 1333147455);
         var1 = new hh();
         if (var2 != null) {
            var1.ak(new vl(var2), 1090965818);
         }

         var1.aw(-134620755);
         aw.ak(var1, (long)var0);
         return var1;
      }
   }

   void am(vl var1) {
      while(true) {
         int var2 = var1.cy((short)-12714);
         if (var2 == 0) {
            return;
         }

         this.aj(var1, var2, (byte)1);
      }
   }

   public static void ag() {
      aw.aj();
   }

   hh() {
      try {
         super();
         this.ay = true;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "hh.<init>(" + ')');
      }
   }

   void aw(int var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "hh.aw(" + ')');
      }
   }

   void ao(vl var1, int var2) {
      if (1 == var2) {
         byte var4 = var1.cu((byte)13);
         int var5 = var4 & 255;
         if (0 == var5) {
            throw new IllegalArgumentException("" + Integer.toString(var5, 16));
         }

         if (var5 >= 128 && var5 < 160) {
            char var6 = qf.ap[var5 - 128];
            if (var6 == 0) {
               var6 = '?';
            }

            var5 = var6;
         }

         char var3 = (char)var5;
         this.ak = var3;
      } else if (2 == var2) {
         this.aj = var1.ch(1203709469) * 1360664581;
      } else if (var2 == 4) {
         this.ay = false;
      } else if (5 == var2) {
         this.ai = var1.cw(1981011148);
      }

   }

   void af(vl var1, int var2) {
      if (1 == var2) {
         byte var4 = var1.cu((byte)13);
         int var5 = var4 & 255;
         if (0 == var5) {
            throw new IllegalArgumentException("" + Integer.toString(var5, 16));
         }

         if (var5 >= 128 && var5 < 160) {
            char var6 = qf.ap[var5 - 128];
            if (var6 == 0) {
               var6 = '?';
            }

            var5 = var6;
         }

         char var3 = (char)var5;
         this.ak = var3;
      } else if (2 == var2) {
         this.aj = var1.ch(1203709469) * 1360664581;
      } else if (var2 == 4) {
         this.ay = false;
      } else if (5 == var2) {
         this.ai = var1.cw(1935429853);
      }

   }

   void ar(vl var1, int var2) {
      if (1 == var2) {
         byte var4 = var1.cu((byte)13);
         int var5 = var4 & 255;
         if (0 == var5) {
            throw new IllegalArgumentException("" + Integer.toString(var5, 16));
         }

         if (var5 >= 128 && var5 < 160) {
            char var6 = qf.ap[var5 - 128];
            if (var6 == 0) {
               var6 = '?';
            }

            var5 = var6;
         }

         char var3 = (char)var5;
         this.ak = var3;
      } else if (2 == var2) {
         this.aj = var1.ch(1203709469) * 1360664581;
      } else if (var2 == 4) {
         this.ay = false;
      } else if (5 == var2) {
         this.ai = var1.cw(1936114271);
      }

   }

   public static void ab() {
      aw.aj();
   }

   void at(vl var1) {
      while(true) {
         int var2 = var1.cy((short)-17097);
         if (var2 == 0) {
            return;
         }

         this.aj(var1, var2, (byte)1);
      }
   }

   void au(vl var1) {
      while(true) {
         int var2 = var1.cy((short)-2389);
         if (var2 == 0) {
            return;
         }

         this.aj(var1, var2, (byte)1);
      }
   }

   public static void ad() {
      aw.aj();
   }

   public static void aw(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5, int var6) {
      try {
         if (var0.isEmpty()) {
            if (var6 >= 1798325243) {
               throw new IllegalStateException();
            }
         } else {
            mp.ai.clear();
            mp.ae.clear();
            no var8;
            if (var5) {
               if (var6 >= 1798325243) {
                  throw new IllegalStateException();
               }

               dw.an(312500552);
            } else {
               for(int var7 = 0; var7 < mp.ay.size(); ++var7) {
                  var8 = (no)mp.ay.get(var7);
                  if (null == var8) {
                     if (var6 >= 1798325243) {
                        throw new IllegalStateException();
                     }

                     mp.ay.remove(var7);
                     --var7;
                  } else if (var8.at) {
                     if (var6 >= 1798325243) {
                        throw new IllegalStateException();
                     }

                     if (var8.au.bn * 1630423797 > 0) {
                        if (var6 >= 1798325243) {
                           throw new IllegalStateException();
                        }

                        mn var10000 = var8.au;
                        var10000.bn -= -1835888291;
                     }

                     var8.au.ao(-570815646);
                     var8.au.at(1822879562);
                     var8.au.ap(0, (short)629);
                     mp.ay.remove(var7);
                     --var7;
                  } else {
                     var8.at = true;
                  }
               }
            }

            if (!var5) {
               if (var6 >= 1798325243) {
                  throw new IllegalStateException();
               }

               mp.as.clear();
            }

            Iterator var14 = var0.iterator();

            while(var14.hasNext()) {
               if (var6 >= 1798325243) {
                  return;
               }

               var8 = (no)var14.next();
               if (-893316127 * var8.aw != -1) {
                  if (var6 >= 1798325243) {
                     throw new IllegalStateException();
                  }

                  if (380940733 * var8.ak == -1) {
                     if (var6 >= 1798325243) {
                        return;
                     }
                  } else {
                     if (!var5) {
                        if (var6 >= 1798325243) {
                           throw new IllegalStateException();
                        }

                        mp.as.add(var8);
                     }

                     mp.ai.add(var8);
                  }
               }
            }

            if (!mp.ai.isEmpty()) {
               mp.at = -259069503 * var1;
               mp.au = var2 * 660415353;
               mp.an = var3 * 1443316973;
               mp.ao = var4 * 1273416733;
               mp.ae.add(new qe((ra)null));
               mp.ae.add(new rc((ra)null, mp.ap, mb.aw, mp.ak));
               ArrayList var16 = new ArrayList();
               var16.add(new rq(new ri((ra)null, 0, true, -1503766987 * mp.ao)));
               if (!mp.ay.isEmpty()) {
                  if (var6 >= 1798325243) {
                     throw new IllegalStateException();
                  }

                  ArrayList var15 = new ArrayList();
                  var15.add(new ry(new rd((ra)null, var16), mp.an * -399918875));
                  ArrayList var10 = new ArrayList();
                  Iterator var11 = mp.ay.iterator();

                  while(var11.hasNext()) {
                     if (var6 >= 1798325243) {
                        throw new IllegalStateException();
                     }

                     no var12 = (no)var11.next();
                     var10.add(var12);
                  }

                  var15.add(new ry(new rt(new rk((ra)null, var10), 0, false, 402183881 * mp.au), mp.at * -1912330687));
                  mp.ae.add(new rd((ra)null, var15));
               } else {
                  mp.ae.add(new ry((ra)null, -399918875 * mp.an));
                  mp.ae.add(new rd((ra)null, var16));
               }

            }
         }
      } catch (RuntimeException var13) {
         throw tm.aw(var13, "hh.aw(" + ')');
      }
   }
}
