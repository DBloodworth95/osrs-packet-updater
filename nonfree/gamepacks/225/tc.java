import java.util.HashMap;
import java.util.concurrent.ThreadPoolExecutor;

public class tc {
   HashMap ag;
   po ae;
   po ac;
   static ThreadPoolExecutor at;
   public static final int av = 5;

   public tc(po var1, po var2) {
      try {
         super();
         this.ac = var1;
         this.ae = var2;
         this.ag = new HashMap();
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "tc.<init>(" + ')');
      }
   }

   public HashMap ae(tw[] var1) {
      HashMap var2 = new HashMap();
      tw[] var3 = var1;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         tw var5 = var3[var4];
         if (this.ag.containsKey(var5)) {
            var2.put(var5, this.ag.get(var5));
         } else {
            po var7 = this.ac;
            po var8 = this.ae;
            String var9 = var5.af;
            qu var6;
            if (!var7.cq(var9, "", -356937809)) {
               var6 = null;
            } else {
               int var10 = var7.cg(var9, (short)-24193);
               int var11 = var7.ct(var10, "", -1996685931);
               qu var12;
               if (!tb.au(var7, var10, var11, (short)180)) {
                  var12 = null;
               } else {
                  byte[] var14 = var8.bt(var10, var11, (byte)-5);
                  qu var13;
                  if (null == var14) {
                     var13 = null;
                  } else {
                     qu var15 = new qu(var14, rg.am, dp.ax, pp.aq, kj.af, vp.at, nq.au);
                     fx.al((byte)16);
                     var13 = var15;
                  }

                  var12 = var13;
               }

               var6 = var12;
            }

            if (null != var6) {
               this.ag.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }

   public HashMap ac(tw[] var1, byte var2) {
      try {
         HashMap var3 = new HashMap();
         tw[] var4 = var1;

         for(int var5 = 0; var5 < var4.length; ++var5) {
            if (var2 != 1) {
               throw new IllegalStateException();
            }

            tw var6 = var4[var5];
            if (this.ag.containsKey(var6)) {
               if (var2 != 1) {
                  throw new IllegalStateException();
               }

               var3.put(var6, this.ag.get(var6));
            } else {
               po var8 = this.ac;
               po var9 = this.ae;
               String var10 = var6.af;
               qu var7;
               if (!var8.cq(var10, "", 1065570711)) {
                  if (var2 != 1) {
                     throw new IllegalStateException();
                  }

                  var7 = null;
               } else {
                  int var11 = var8.cg(var10, (short)-14283);
                  int var12 = var8.ct(var11, "", -2056945678);
                  qu var13;
                  if (!tb.au(var8, var11, var12, (short)180)) {
                     if (var2 != 1) {
                        throw new IllegalStateException();
                     }

                     var13 = null;
                  } else {
                     byte[] var15 = var9.bt(var11, var12, (byte)-16);
                     qu var14;
                     if (null == var15) {
                        if (var2 != 1) {
                           throw new IllegalStateException();
                        }

                        var14 = null;
                     } else {
                        qu var16 = new qu(var15, rg.am, dp.ax, pp.aq, kj.af, vp.at, nq.au);
                        fx.al((byte)16);
                        var14 = var16;
                     }

                     var13 = var14;
                  }

                  var7 = var13;
               }

               if (null != var7) {
                  if (var2 != 1) {
                     throw new IllegalStateException();
                  }

                  this.ag.put(var6, var7);
                  var3.put(var6, var7);
               }
            }
         }

         return var3;
      } catch (RuntimeException var17) {
         throw vk.ae(var17, "tc.ac(" + ')');
      }
   }

   public HashMap ag(tw[] var1) {
      HashMap var2 = new HashMap();
      tw[] var3 = var1;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         tw var5 = var3[var4];
         if (this.ag.containsKey(var5)) {
            var2.put(var5, this.ag.get(var5));
         } else {
            po var7 = this.ac;
            po var8 = this.ae;
            String var9 = var5.af;
            qu var6;
            if (!var7.cq(var9, "", 1274638906)) {
               var6 = null;
            } else {
               int var10 = var7.cg(var9, (short)-7284);
               int var11 = var7.ct(var10, "", -2090523356);
               qu var12;
               if (!tb.au(var7, var10, var11, (short)180)) {
                  var12 = null;
               } else {
                  byte[] var14 = var8.bt(var10, var11, (byte)-51);
                  qu var13;
                  if (null == var14) {
                     var13 = null;
                  } else {
                     qu var15 = new qu(var14, rg.am, dp.ax, pp.aq, kj.af, vp.at, nq.au);
                     fx.al((byte)16);
                     var13 = var15;
                  }

                  var12 = var13;
               }

               var6 = var12;
            }

            if (null != var6) {
               this.ag.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }

   public HashMap am(tw[] var1) {
      HashMap var2 = new HashMap();
      tw[] var3 = var1;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         tw var5 = var3[var4];
         if (this.ag.containsKey(var5)) {
            var2.put(var5, this.ag.get(var5));
         } else {
            po var7 = this.ac;
            po var8 = this.ae;
            String var9 = var5.af;
            qu var6;
            if (!var7.cq(var9, "", 421572926)) {
               var6 = null;
            } else {
               int var10 = var7.cg(var9, (short)-235);
               int var11 = var7.ct(var10, "", -2091694319);
               qu var12;
               if (!tb.au(var7, var10, var11, (short)180)) {
                  var12 = null;
               } else {
                  byte[] var14 = var8.bt(var10, var11, (byte)35);
                  qu var13;
                  if (null == var14) {
                     var13 = null;
                  } else {
                     qu var15 = new qu(var14, rg.am, dp.ax, pp.aq, kj.af, vp.at, nq.au);
                     fx.al((byte)16);
                     var13 = var15;
                  }

                  var12 = var13;
               }

               var6 = var12;
            }

            if (null != var6) {
               this.ag.put(var5, var6);
               var2.put(var5, var6);
            }
         }
      }

      return var2;
   }
}
