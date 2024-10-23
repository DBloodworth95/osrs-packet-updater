import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class gw extends tw {
   public List ak;
   public long ai;
   boolean aw;
   int[] aj;
   public String ay;
   public static final int ac = 38;
   public byte as;
   boolean ap;
   static int ta;
   static int we;
   public byte ae;

   public int aj(int var1) {
      try {
         return this.ak.size();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "gw.aj(" + ')');
      }
   }

   public int[] ap(int var1) {
      try {
         if (null == this.aj) {
            if (var1 != 1590781633) {
               throw new IllegalStateException();
            }

            String[] var2 = new String[this.ak.size()];
            this.aj = new int[this.ak.size()];

            for(int var3 = 0; var3 < this.ak.size(); this.aj[var3] = var3++) {
               var2[var3] = ((fs)this.ak.get(var3)).ak.aw((byte)69);
            }

            int[] var5 = this.aj;
            dc.aw(var2, var5, 0, var2.length - 1, 183303858);
         }

         return this.aj;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "gw.ap(" + ')');
      }
   }

   void ak(int var1, int var2) {
      try {
         this.ak.remove(var1);
         this.aj = null;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "gw.ak(" + ')');
      }
   }

   void ag(vl var1) {
      int var2 = var1.cy((short)-1933);
      if ((var2 & 1) != 0) {
         this.ap = true;
      }

      if (0 != (var2 & 2)) {
         this.aw = true;
      }

      int var3 = 2;
      if (0 != (var2 & 4)) {
         var3 = var1.cy((short)-28029);
      }

      this.ht = var1.ct((byte)-19);
      this.ai = var1.ct((byte)-36) * -7042024253228633937L;
      this.ay = var1.cw(1967388234);
      var1.cj((byte)0);
      this.ae = var1.cu((byte)13);
      this.as = var1.cu((byte)13);
      int var4 = var1.ce(1020907651);
      if (var4 > 0) {
         this.ak = new ArrayList(var4);

         for(int var5 = 0; var5 < var4; ++var5) {
            fs var6 = new fs();
            if (this.ap) {
               var1.ct((byte)-127);
            }

            if (this.aw) {
               var6.ak = new wx(var1.cw(2086723291));
            }

            var6.ap = var1.cu((byte)13);
            var6.aw = var1.ce(1645760292) * -160670607;
            if (var3 >= 3) {
               var1.cj((byte)0);
            }

            this.ak.add(var5, var6);
         }
      }

   }

   public int af() {
      return this.ak.size();
   }

   public int ai(String var1, int var2) {
      try {
         if (!this.aw) {
            if (var2 == 863322687) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException("Displaynames not available");
            }
         } else {
            for(int var3 = 0; var3 < this.ak.size(); ++var3) {
               if (var2 == 863322687) {
                  throw new IllegalStateException();
               }

               if (((fs)this.ak.get(var3)).ak.ap(-1034352502).equalsIgnoreCase(var1)) {
                  if (var2 == 863322687) {
                     throw new IllegalStateException();
                  }

                  return var3;
               }
            }

            return -1;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "gw.ai(" + ')');
      }
   }

   void ay(vl var1, byte var2) {
      try {
         int var3 = var1.cy((short)-9384);
         if ((var3 & 1) != 0) {
            if (var2 == 0) {
               return;
            }

            this.ap = true;
         }

         if (0 != (var3 & 2)) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }

            this.aw = true;
         }

         int var4 = 2;
         if (0 != (var3 & 4)) {
            if (var2 == 0) {
               return;
            }

            var4 = var1.cy((short)-7463);
         }

         this.ht = var1.ct((byte)-122);
         this.ai = var1.ct((byte)-64) * -7042024253228633937L;
         this.ay = var1.cw(2117125584);
         var1.cj((byte)0);
         this.ae = var1.cu((byte)13);
         this.as = var1.cu((byte)13);
         int var5 = var1.ce(1254140398);
         if (var5 > 0) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }

            this.ak = new ArrayList(var5);

            for(int var6 = 0; var6 < var5; ++var6) {
               if (var2 == 0) {
                  return;
               }

               fs var7 = new fs();
               if (this.ap) {
                  if (var2 == 0) {
                     return;
                  }

                  var1.ct((byte)-30);
               }

               if (this.aw) {
                  if (var2 == 0) {
                     throw new IllegalStateException();
                  }

                  var7.ak = new wx(var1.cw(1982645601));
               }

               var7.ap = var1.cu((byte)13);
               var7.aw = var1.ce(1105476601) * -160670607;
               if (var4 >= 3) {
                  if (var2 == 0) {
                     throw new IllegalStateException();
                  }

                  var1.cj((byte)0);
               }

               this.ak.add(var6, var7);
            }
         }

      } catch (RuntimeException var8) {
         throw tm.aw(var8, "gw.ay(" + ')');
      }
   }

   static {
      new BitSet(65536);
   }

   public int[] as() {
      if (null == this.aj) {
         String[] var1 = new String[this.ak.size()];
         this.aj = new int[this.ak.size()];

         for(int var2 = 0; var2 < this.ak.size(); this.aj[var2] = var2++) {
            var1[var2] = ((fs)this.ak.get(var2)).ak.aw((byte)21);
         }

         int[] var3 = this.aj;
         dc.aw(var1, var3, 0, var1.length - 1, -47974168);
      }

      return this.aj;
   }

   void am(fs var1) {
      this.ak.add(var1);
      this.aj = null;
   }

   public gw(vl var1) {
      try {
         super();
         this.aw = true;
         this.ay = null;
         this.ay(var1, (byte)-6);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "gw.<init>(" + ')');
      }
   }

   void at(fs var1) {
      this.ak.add(var1);
      this.aj = null;
   }

   public int au() {
      return this.ak.size();
   }

   public int an() {
      return this.ak.size();
   }

   public int ao() {
      return this.ak.size();
   }

   void ae(fs var1) {
      this.ak.add(var1);
      this.aj = null;
   }

   public int ar() {
      return this.ak.size();
   }

   public int ab(String var1) {
      if (!this.aw) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for(int var2 = 0; var2 < this.ak.size(); ++var2) {
            if (((fs)this.ak.get(var2)).ak.ap(-808005621).equalsIgnoreCase(var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   public int az(String var1) {
      if (!this.aw) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for(int var2 = 0; var2 < this.ak.size(); ++var2) {
            if (((fs)this.ak.get(var2)).ak.ap(-1068582742).equalsIgnoreCase(var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   void aw(fs var1, int var2) {
      try {
         this.ak.add(var1);
         this.aj = null;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "gw.aw(" + ')');
      }
   }

   static void au(byte[] var0, int var1) {
      try {
         vl var2 = new vl(var0);
         var2.am = (var0.length - 2) * -725588083;
         wk.ap = var2.ce(917228322) * -1009276905;
         wk.aj = new int[wk.ap * 1934102439];
         tl.ai = new int[wk.ap * 1934102439];
         ae.ay = new int[1934102439 * wk.ap];
         wk.as = new int[1934102439 * wk.ap];
         ks.am = new byte[wk.ap * 1934102439][];
         var2.am = -725588083 * (var0.length - 7 - wk.ap * -1707049672);
         wk.aw = var2.ce(1247445518) * -692526949;
         wk.ak = var2.ce(195799759) * 395003995;
         int var3 = (var2.cy((short)-21633) & 255) + 1;

         int var4;
         for(var4 = 0; var4 < wk.ap * 1934102439; ++var4) {
            wk.aj[var4] = var2.ce(357684852);
         }

         for(var4 = 0; var4 < 1934102439 * wk.ap; ++var4) {
            if (var1 <= 1272836222) {
               return;
            }

            tl.ai[var4] = var2.ce(1890456805);
         }

         for(var4 = 0; var4 < wk.ap * 1934102439; ++var4) {
            if (var1 <= 1272836222) {
               throw new IllegalStateException();
            }

            ae.ay[var4] = var2.ce(55717751);
         }

         for(var4 = 0; var4 < 1934102439 * wk.ap; ++var4) {
            if (var1 <= 1272836222) {
               throw new IllegalStateException();
            }

            wk.as[var4] = var2.ce(595013282);
         }

         var2.am = -725588083 * (var0.length - 7 - wk.ap * -1707049672 - 3 * (var3 - 1));
         wk.ae = new int[var3];

         for(var4 = 1; var4 < var3; ++var4) {
            if (var1 <= 1272836222) {
               throw new IllegalStateException();
            }

            wk.ae[var4] = var2.cx((byte)-55);
            if (0 == wk.ae[var4]) {
               wk.ae[var4] = 1;
            }
         }

         var2.am = 0;

         for(var4 = 0; var4 < wk.ap * 1934102439; ++var4) {
            int var5 = ae.ay[var4];
            int var6 = wk.as[var4];
            int var7 = var5 * var6;
            byte[] var8 = new byte[var7];
            ks.am[var4] = var8;
            int var9 = var2.cy((short)-27397);
            int var10;
            if (0 == var9) {
               if (var1 <= 1272836222) {
                  throw new IllegalStateException();
               }

               for(var10 = 0; var10 < var7; ++var10) {
                  if (var1 <= 1272836222) {
                     throw new IllegalStateException();
                  }

                  var8[var10] = var2.cu((byte)13);
               }
            } else if (1 == var9) {
               if (var1 <= 1272836222) {
                  throw new IllegalStateException();
               }

               for(var10 = 0; var10 < var5; ++var10) {
                  if (var1 <= 1272836222) {
                     throw new IllegalStateException();
                  }

                  for(int var11 = 0; var11 < var6; ++var11) {
                     if (var1 <= 1272836222) {
                        return;
                     }

                     var8[var10 + var5 * var11] = var2.cu((byte)13);
                  }
               }
            }
         }

      } catch (RuntimeException var12) {
         throw tm.aw(var12, "gw.au(" + ')');
      }
   }

   static vd oz(int var0, int var1) {
      try {
         vd var2 = (vd)client.wk.ap((long)var0);
         if (null == var2) {
            if (var1 <= 1314249942) {
               throw new IllegalStateException();
            }

            var2 = new vd(gd.fe, ul.ap(var0, 1013163462), cj.aw(var0, 1101002526));
            client.wk.ak(var2, (long)var0);
         }

         return var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "gw.oz(" + ')');
      }
   }

   protected static final void bp(byte var0) {
      try {
         bz.au.ap(555753729);

         int var1;
         for(var1 = 0; var1 < 32; ++var1) {
            if (var0 != 1) {
               throw new IllegalStateException();
            }

            bz.ao[var1] = 0L;
         }

         for(var1 = 0; var1 < 32; ++var1) {
            bz.ar[var1] = 0L;
         }

         jb.as = 0;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "gw.bp(" + ')');
      }
   }
}
