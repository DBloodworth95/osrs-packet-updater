import java.util.ArrayList;
import java.util.Iterator;

public class rk extends ra {
   ArrayList ap;
   public static final int bh = 33;

   public rk(ra var1, ArrayList var2) {
      try {
         super(var1);
         this.ai = "ClearRequestTask";
         this.ap = var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "rk.<init>(" + ')');
      }
   }

   public boolean ap(int var1) {
      try {
         if (this.ap.isEmpty()) {
            return true;
         } else {
            Iterator var2 = this.ap.iterator();

            while(var2.hasNext()) {
               no var3 = (no)var2.next();

               try {
                  if (mp.ay.contains(var3)) {
                     if (var1 != 343486624) {
                        throw new IllegalStateException();
                     }

                     if (null == var3) {
                        if (var1 != 343486624) {
                           throw new IllegalStateException();
                        }

                        mp.ay.remove(var3);
                     } else {
                        if (var3.au.bn * 1630423797 > 0) {
                           if (var1 != 343486624) {
                              throw new IllegalStateException();
                           }

                           mn var10000 = var3.au;
                           var10000.bn -= -1835888291;
                        }

                        if (1630423797 * var3.au.bn == 0) {
                           var3.au.ao(-1478776319);
                           var3.au.at(2138814194);
                           var3.au.ap(0, (short)-31866);
                        }

                        int var4 = -893316127 * var3.aw;
                        int var5 = var3.ak * 380940733;
                        Iterator var6 = mp.am.iterator();

                        while(var6.hasNext()) {
                           if (var1 != 343486624) {
                              throw new IllegalStateException();
                           }

                           nh var7 = (nh)var6.next();
                           var7.hl(var4, var5, -2145419124);
                        }

                        mp.ay.remove(var3);
                     }
                  }
               } catch (Exception var8) {
                  rl.ap((String)null, var8, (byte)-38);
                  this.au(var8.getMessage(), 634133961);
                  mp.ay.clear();
                  return true;
               }
            }

            return true;
         }
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "rk.ap(" + ')');
      }
   }

   public boolean ak() {
      if (this.ap.isEmpty()) {
         return true;
      } else {
         Iterator var1 = this.ap.iterator();

         while(var1.hasNext()) {
            no var2 = (no)var1.next();

            try {
               if (mp.ay.contains(var2)) {
                  if (null == var2) {
                     mp.ay.remove(var2);
                  } else {
                     if (var2.au.bn * -601589938 > 0) {
                        mn var10000 = var2.au;
                        var10000.bn -= -1766454854;
                     }

                     if (1630423797 * var2.au.bn == 0) {
                        var2.au.ao(-547254149);
                        var2.au.at(1689066252);
                        var2.au.ap(0, (short)-31617);
                     }

                     int var3 = -893316127 * var2.aw;
                     int var4 = var2.ak * 519840525;
                     Iterator var5 = mp.am.iterator();

                     while(var5.hasNext()) {
                        nh var6 = (nh)var5.next();
                        var6.hl(var3, var4, -1993035201);
                     }

                     mp.ay.remove(var2);
                  }
               }
            } catch (Exception var7) {
               rl.ap((String)null, var7, (byte)-35);
               this.au(var7.getMessage(), 634133961);
               mp.ay.clear();
               return true;
            }
         }

         return true;
      }
   }

   public boolean aj() {
      if (this.ap.isEmpty()) {
         return true;
      } else {
         Iterator var1 = this.ap.iterator();

         while(var1.hasNext()) {
            no var2 = (no)var1.next();

            try {
               if (mp.ay.contains(var2)) {
                  if (null == var2) {
                     mp.ay.remove(var2);
                  } else {
                     if (var2.au.bn * 1630423797 > 0) {
                        mn var10000 = var2.au;
                        var10000.bn -= -1835888291;
                     }

                     if (140887383 * var2.au.bn == 0) {
                        var2.au.ao(307256408);
                        var2.au.at(1782726430);
                        var2.au.ap(0, (short)-27737);
                     }

                     int var3 = 1848897772 * var2.aw;
                     int var4 = var2.ak * -1651000171;
                     Iterator var5 = mp.am.iterator();

                     while(var5.hasNext()) {
                        nh var6 = (nh)var5.next();
                        var6.hl(var3, var4, -2011766305);
                     }

                     mp.ay.remove(var2);
                  }
               }
            } catch (Exception var7) {
               rl.ap((String)null, var7, (byte)-30);
               this.au(var7.getMessage(), 634133961);
               mp.ay.clear();
               return true;
            }
         }

         return true;
      }
   }

   static int an(String var0, int var1) {
      try {
         if (var0.equals("centre")) {
            if (var1 != 2023971881) {
               throw new IllegalStateException();
            } else {
               return 1;
            }
         } else {
            if (!var0.equals("bottom")) {
               if (var1 != 2023971881) {
                  throw new IllegalStateException();
               }

               if (!var0.equals("right")) {
                  return 0;
               }

               if (var1 != 2023971881) {
                  throw new IllegalStateException();
               }
            }

            return 2;
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "rk.an(" + ')');
      }
   }
}
