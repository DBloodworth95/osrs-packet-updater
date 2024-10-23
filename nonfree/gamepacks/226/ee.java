public class ee extends si {
   final boolean ap;
   static int uu;

   public ee(boolean var1) {
      try {
         super();
         this.ap = var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ee.<init>(" + ')');
      }
   }

   public int ae(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, 1111539717);
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ap((sv)var1, (sv)var2, -1983961875);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ee.compare(" + ')');
      }
   }

   public int ay(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, 121450693);
   }

   int ap(sv var1, sv var2, int var3) {
      try {
         if (1511931945 * var1.ai == client.cq * 769068277) {
            if (var3 == -1276576339) {
               throw new IllegalStateException();
            }

            if (client.cq * 769068277 == var2.ai * 1511931945) {
               if (var3 == -1276576339) {
                  throw new IllegalStateException();
               }

               int var10000;
               if (this.ap) {
                  if (var3 == -1276576339) {
                     throw new IllegalStateException();
                  }

                  var10000 = var1.ay * -1071937363 - var2.ay * -1071937363;
               } else {
                  var10000 = -1071937363 * var2.ay - var1.ay * -1071937363;
               }

               return var10000;
            }
         }

         return this.an(var1, var2, 1255277363);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ee.ap(" + ')');
      }
   }

   public int as(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, 1123859557);
   }

   public int am(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, 606201476);
   }

   public int at(Object var1, Object var2) {
      return this.ap((sv)var1, (sv)var2, 1842861096);
   }

   int aw(sv var1, sv var2) {
      if (443229594 * var1.ai == client.cq * 769068277 && client.cq * 769068277 == var2.ai * 1511931945) {
         return this.ap ? var1.ay * -1071937363 - var2.ay * -1071937363 : 1340137817 * var2.ay - var1.ay * -1071937363;
      } else {
         return this.an(var1, var2, 1255277363);
      }
   }

   static void ae(float var0, float var1, float var2, float var3, fv var4, int var5) {
      try {
         float var6 = var1 - var0;
         float var7 = var2 - var1;
         float var8 = var3 - var2;
         float var9 = var7 - var6;
         var4.ab = var8 - var7 - var9;
         var4.ar = var9 + var9 + var9;
         var4.af = var6 + var6 + var6;
         var4.ao = var0;
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "ee.ae(" + ')');
      }
   }

   static final void kc(int var0, int var1, int var2) {
      try {
         if (-1577732637 * client.ng.aw < 2) {
            if (var2 <= -529205844) {
               throw new IllegalStateException();
            }

            if (client.oq * 392309539 == 0) {
               if (var2 <= -529205844) {
                  throw new IllegalStateException();
               }

               if (!client.os) {
                  return;
               }
            }
         }

         if (!client.oe) {
            if (var2 <= -529205844) {
               throw new IllegalStateException();
            }
         } else {
            int var3 = nt.lx(614997679);
            String var4;
            if (392309539 * client.oq == 1 && client.ng.aw * -1577732637 < 2) {
               if (var2 <= -529205844) {
                  return;
               }

               var4 = og.gh + og.gs + client.it + " " + eh.ay;
            } else if (client.os && client.ng.aw * -1577732637 < 2) {
               if (var2 <= -529205844) {
                  throw new IllegalStateException();
               }

               var4 = client.oj + og.gs + client.ou + " " + eh.ay;
            } else {
               var4 = client.ng.ap(var3, 1128570449);
            }

            if (client.ng.aw * -1577732637 > 2) {
               if (var2 <= -529205844) {
                  return;
               }

               var4 = var4 + hs.aw(16777215, (byte)-40) + " " + '/' + " " + (-1577732637 * client.ng.aw - 2) + og.gm;
            }

            ox.iv.bv(var4, 4 + var0, 15 + var1, 16777215, 0, -330508271 * client.dt / 1000);
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ee.kc(" + ')');
      }
   }
}
