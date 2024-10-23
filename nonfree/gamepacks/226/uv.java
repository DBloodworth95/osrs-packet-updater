import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class uv implements ut {
   Map ap;
   final vj aw;

   public Iterator bq() {
      return this.ap == null ? Collections.emptyList().iterator() : this.ap.values().iterator();
   }

   public int ap(int var1, int var2) {
      try {
         if (this.ap != null) {
            if (var2 == -652066099) {
               throw new IllegalStateException();
            }

            va var3 = (va)this.ap.get(var1);
            if (var3 != null) {
               if (var2 == -652066099) {
                  throw new IllegalStateException();
               }

               return (Integer)var3.aw;
            }
         }

         return (Integer)this.aw.ak(var1, (byte)-18);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "uv.ap(" + ')');
      }
   }

   public void ay(int var1, Object var2) {
      if (this.ap == null) {
         this.ap = new HashMap();
         this.ap.put(var1, new va(var1, var2));
      } else {
         va var3 = (va)this.ap.get(var1);
         if (var3 == null) {
            this.ap.put(var1, new va(var1, var2));
         } else {
            var3.aw = var2;
         }
      }

   }

   public Iterator iterator() {
      try {
         return this.ap == null ? Collections.emptyList().iterator() : this.ap.values().iterator();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "uv.iterator(" + ')');
      }
   }

   public Iterator bp() {
      return this.ap == null ? Collections.emptyList().iterator() : this.ap.values().iterator();
   }

   static void kk(dn var0, vm var1, byte var2) {
      try {
         int var3 = var1.ce(178728890);
         so var4 = var0.ab[var3];
         dn var5 = var4.ak;
         var5.as = var1.ce(1112372927) * 693446157;
         var5.ae = var1.ce(1759579404) * 861508213;
         int var6 = 1587254913 * var5.ai / 8;
         int var7 = -1000264093 * var5.ay / 8;
         int var8 = var1.ce(26751808);
         var1.ae(527445275);

         int var9;
         int var10;
         int var11;
         int var12;
         for(var9 = 0; var9 < 4; ++var9) {
            for(var10 = 0; var10 < var6; ++var10) {
               if (var2 != 2) {
                  throw new IllegalStateException();
               }

               for(var11 = 0; var11 < var7; ++var11) {
                  if (var2 != 2) {
                     throw new IllegalStateException();
                  }

                  var12 = var1.am(1, -1790043131);
                  if (1 == var12) {
                     if (var2 != 2) {
                        throw new IllegalStateException();
                     }

                     client.jb[var9][var10][var11] = var1.am(26, -1559425278);
                  } else {
                     client.jb[var9][var10][var11] = -1;
                  }
               }
            }
         }

         var1.at(-1548028387);
         nt.jt = new int[var8][4];

         for(var9 = 0; var9 < var8; ++var9) {
            if (var2 != 2) {
               return;
            }

            for(var10 = 0; var10 < 4; ++var10) {
               if (var2 != 2) {
                  return;
               }

               nt.jt[var9][var10] = var1.ch(1203709469);
            }
         }

         ev.jq = new int[var8];
         hg.jx = new int[var8];
         jc.jl = new int[var8];
         nt.ji = new byte[var8][];
         ma.jc = new byte[var8][];
         var8 = 0;

         for(var9 = 0; var9 < 4; ++var9) {
            if (var2 != 2) {
               throw new IllegalStateException();
            }

            for(var10 = 0; var10 < var6; ++var10) {
               for(var11 = 0; var11 < var7; ++var11) {
                  if (var2 != 2) {
                     throw new IllegalStateException();
                  }

                  var12 = client.jb[var9][var10][var11];
                  if (-1 != var12) {
                     if (var2 != 2) {
                        throw new IllegalStateException();
                     }

                     int var13 = var12 >> 14 & 1023;
                     int var14 = var12 >> 3 & 2047;
                     int var15 = var14 / 8 + (var13 / 8 << 8);

                     int var16;
                     for(var16 = 0; var16 < var8; ++var16) {
                        if (var2 != 2) {
                           return;
                        }

                        if (ev.jq[var16] == var15) {
                           if (var2 != 2) {
                              throw new IllegalStateException();
                           }

                           var15 = -1;
                           break;
                        }
                     }

                     if (-1 != var15) {
                        if (var2 != 2) {
                           throw new IllegalStateException();
                        }

                        ev.jq[var8] = var15;
                        var16 = var15 >> 8 & 255;
                        int var17 = var15 & 255;
                        hg.jx[var8] = he.fo.cf("m" + var16 + "_" + var17, (byte)87);
                        jc.jl[var8] = he.fo.cf("l" + var16 + "_" + var17, (byte)98);
                        ++var8;
                     }
                  }
               }
            }
         }

         ea.gv(25, 2027013533);
         client.dc = true;
         hg.jr = var5;
         dl.ja(var5, (byte)-102);
      } catch (RuntimeException var18) {
         throw tm.aw(var18, "uv.kk(" + ')');
      }
   }

   public Iterator bz() {
      return this.ap == null ? Collections.emptyList().iterator() : this.ap.values().iterator();
   }

   public int ak(int var1) {
      if (this.ap != null) {
         va var2 = (va)this.ap.get(var1);
         if (var2 != null) {
            return (Integer)var2.aw;
         }
      }

      return (Integer)this.aw.ak(var1, (byte)49);
   }

   public int aj(int var1) {
      if (this.ap != null) {
         va var2 = (va)this.ap.get(var1);
         if (var2 != null) {
            return (Integer)var2.aw;
         }
      }

      return (Integer)this.aw.ak(var1, (byte)-92);
   }

   public int ai(int var1) {
      if (this.ap != null) {
         va var2 = (va)this.ap.get(var1);
         if (var2 != null) {
            return (Integer)var2.aw;
         }
      }

      return (Integer)this.aw.ak(var1, (byte)113);
   }

   public uv(vj var1) {
      try {
         super();
         this.aw = var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "uv.<init>(" + ')');
      }
   }

   public void aw(int var1, Object var2, int var3) {
      try {
         if (this.ap == null) {
            this.ap = new HashMap();
            this.ap.put(var1, new va(var1, var2));
         } else {
            va var4 = (va)this.ap.get(var1);
            if (var4 == null) {
               if (var3 <= 1295689757) {
                  throw new IllegalStateException();
               }

               this.ap.put(var1, new va(var1, var2));
            } else {
               var4.aw = var2;
            }
         }

      } catch (RuntimeException var5) {
         throw tm.aw(var5, "uv.aw(" + ')');
      }
   }
}
