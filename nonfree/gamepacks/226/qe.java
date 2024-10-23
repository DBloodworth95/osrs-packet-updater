import java.util.Iterator;

public class qe extends ra {
   static final int an = 31;
   public static final int dr = 104;

   mn ay() {
      mn var1 = null;
      Iterator var2 = mp.aj.iterator();

      while(true) {
         mn var3;
         do {
            do {
               if (!var2.hasNext()) {
                  if (var1 != null) {
                     var1.bn += -1835888291;
                     if (var1.aw(-1982107168) == 0 && var1.af(985692293)) {
                        var1.ao(-1119990143);
                        var1.at(1750458947);
                        var1.ap(0, (short)-21944);
                     }
                  }

                  return var1;
               }

               var3 = (mn)var2.next();
            } while(null == var3);
         } while(null != var1 && -1070668843 * var1.bn <= 1601939030 * var3.bn && (var3.aw(-741377349) != 0 || !var3.af(673775592)));

         var1 = var3;
      }
   }

   public boolean ap(int var1) {
      try {
         while(!mp.ai.isEmpty()) {
            if (var1 != 343486624) {
               throw new IllegalStateException();
            }

            no var2 = (no)mp.ai.peek();
            if (null == var2) {
               if (var1 != 343486624) {
                  throw new IllegalStateException();
               }

               mp.ai.pop();
            } else {
               var2.au = this.aw(2099352601);
               mp.ay.add(var2);
               mp.ai.pop();
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qe.ap(" + ')');
      }
   }

   public boolean ak() {
      while(!mp.ai.isEmpty()) {
         no var1 = (no)mp.ai.peek();
         if (null == var1) {
            mp.ai.pop();
         } else {
            var1.au = this.aw(2020713896);
            mp.ay.add(var1);
            mp.ai.pop();
         }
      }

      return true;
   }

   public boolean aj() {
      while(!mp.ai.isEmpty()) {
         no var1 = (no)mp.ai.peek();
         if (null == var1) {
            mp.ai.pop();
         } else {
            var1.au = this.aw(2145446545);
            mp.ay.add(var1);
            mp.ai.pop();
         }
      }

      return true;
   }

   public qe(ra var1) {
      try {
         super(var1);
         this.ai = "AddRequestTask";
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "qe.<init>(" + ')');
      }
   }

   mn ai() {
      mn var1 = null;
      Iterator var2 = mp.aj.iterator();

      while(true) {
         mn var3;
         do {
            do {
               if (!var2.hasNext()) {
                  if (var1 != null) {
                     var1.bn += -1835888291;
                     if (var1.aw(-1434796238) == 0 && var1.af(328863924)) {
                        var1.ao(-1615198684);
                        var1.at(2005683664);
                        var1.ap(0, (short)-5549);
                     }
                  }

                  return var1;
               }

               var3 = (mn)var2.next();
            } while(null == var3);
         } while(null != var1 && 1630423797 * var1.bn <= 1630423797 * var3.bn && (var3.aw(1314184161) != 0 || !var3.af(553675646)));

         var1 = var3;
      }
   }

   mn aw(int var1) {
      try {
         mn var2 = null;
         Iterator var3 = mp.aj.iterator();

         while(true) {
            mn var4;
            while(true) {
               do {
                  if (!var3.hasNext()) {
                     if (var2 != null) {
                        if (var1 <= 1876637385) {
                           throw new IllegalStateException();
                        }

                        var2.bn += -1835888291;
                        if (var2.aw(-1552853757) == 0) {
                           if (var1 <= 1876637385) {
                              throw new IllegalStateException();
                           }

                           if (var2.af(310013182)) {
                              if (var1 <= 1876637385) {
                                 throw new IllegalStateException();
                              }

                              var2.ao(-871833376);
                              var2.at(1610800301);
                              var2.ap(0, (short)-11005);
                           }
                        }
                     }

                     return var2;
                  }

                  if (var1 <= 1876637385) {
                     throw new IllegalStateException();
                  }

                  var4 = (mn)var3.next();
               } while(null == var4);

               if (null == var2 || 1630423797 * var2.bn > 1630423797 * var4.bn) {
                  break;
               }

               if (var4.aw(310552653) == 0) {
                  if (var1 <= 1876637385) {
                     throw new IllegalStateException();
                  }

                  if (var4.af(84165637)) {
                     if (var1 <= 1876637385) {
                        throw new IllegalStateException();
                     }
                     break;
                  }
               }
            }

            var2 = var4;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "qe.aw(" + ')');
      }
   }
}
