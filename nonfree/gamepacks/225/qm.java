import java.util.Iterator;

public class qm extends ri {
   static di mm;
   static final int bm = 5;

   ms ae(int var1) {
      try {
         ms var2 = null;
         Iterator var3 = mm.am.iterator();

         while(true) {
            ms var4;
            while(true) {
               do {
                  if (!var3.hasNext()) {
                     if (var2 != null) {
                        if (var1 == 766032576) {
                           throw new IllegalStateException();
                        }

                        var2.bb += 1130066047;
                        if (var2.ae(-1053361649) == 0) {
                           if (var1 == 766032576) {
                              throw new IllegalStateException();
                           }

                           if (var2.ap(1891926304)) {
                              if (var1 == 766032576) {
                                 throw new IllegalStateException();
                              }

                              var2.ah(-1346276401);
                              var2.ar((byte)103);
                              var2.ac(0, -2061860603);
                           }
                        }
                     }

                     return var2;
                  }

                  if (var1 == 766032576) {
                     throw new IllegalStateException();
                  }

                  var4 = (ms)var3.next();
               } while(var4 == null);

               if (var1 == 766032576) {
                  throw new IllegalStateException();
               }

               if (null == var2 || 1813270399 * var2.bb > 1813270399 * var4.bb) {
                  break;
               }

               if (var1 == 766032576) {
                  throw new IllegalStateException();
               }

               if (var4.ae(-498747792) == 0) {
                  if (var1 == 766032576) {
                     throw new IllegalStateException();
                  }

                  if (var4.ap(1891926304)) {
                     if (var1 == 766032576) {
                        throw new IllegalStateException();
                     }
                     break;
                  }
               }
            }

            var2 = var4;
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "qm.ae(" + ')');
      }
   }

   public qm(ri var1) {
      try {
         super(var1);
         this.ax = "AddRequestTask";
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "qm.<init>(" + ')');
      }
   }

   ms am() {
      ms var1 = null;
      Iterator var2 = mm.am.iterator();

      while(true) {
         ms var3;
         do {
            do {
               if (!var2.hasNext()) {
                  if (var1 != null) {
                     var1.bb += 1130066047;
                     if (var1.ae(1613248790) == 0 && var1.ap(1891926304)) {
                        var1.ah(-1018560554);
                        var1.ar((byte)9);
                        var1.ac(0, -203721743);
                     }
                  }

                  return var1;
               }

               var3 = (ms)var2.next();
            } while(var3 == null);
         } while(null != var1 && 1813270399 * var1.bb <= 1813270399 * var3.bb && (var3.ae(1096424880) != 0 || !var3.ap(1891926304)));

         var1 = var3;
      }
   }

   public boolean ag() {
      while(!mm.ax.isEmpty()) {
         ns var1 = (ns)mm.ax.peek();
         if (var1 == null) {
            mm.ax.pop();
         } else {
            var1.al = this.ae(666269506);
            mm.aq.add(var1);
            mm.ax.pop();
         }
      }

      return true;
   }

   public boolean ac(int var1) {
      try {
         while(!mm.ax.isEmpty()) {
            if (var1 != -1411718299) {
               throw new IllegalStateException();
            }

            ns var2 = (ns)mm.ax.peek();
            if (var2 == null) {
               if (var1 != -1411718299) {
                  throw new IllegalStateException();
               }

               mm.ax.pop();
            } else {
               var2.al = this.ae(-1178517341);
               mm.aq.add(var2);
               mm.ax.pop();
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "qm.ac(" + ')');
      }
   }

   ms ax() {
      ms var1 = null;
      Iterator var2 = mm.am.iterator();

      while(true) {
         ms var3;
         do {
            do {
               if (!var2.hasNext()) {
                  if (var1 != null) {
                     var1.bb += 939539868;
                     if (var1.ae(1906371068) == 0 && var1.ap(1891926304)) {
                        var1.ah(1294375355);
                        var1.ar((byte)50);
                        var1.ac(0, 555031159);
                     }
                  }

                  return var1;
               }

               var3 = (ms)var2.next();
            } while(var3 == null);
         } while(null != var1 && 1322987831 * var1.bb <= 1813270399 * var3.bb && (var3.ae(1255562650) != 0 || !var3.ap(1891926304)));

         var1 = var3;
      }
   }

   ms aq() {
      ms var1 = null;
      Iterator var2 = mm.am.iterator();

      while(true) {
         ms var3;
         do {
            do {
               if (!var2.hasNext()) {
                  if (var1 != null) {
                     var1.bb += 1130066047;
                     if (var1.ae(262764474) == 0 && var1.ap(1891926304)) {
                        var1.ah(893086470);
                        var1.ar((byte)108);
                        var1.ac(0, 102816511);
                     }
                  }

                  return var1;
               }

               var3 = (ms)var2.next();
            } while(var3 == null);
         } while(null != var1 && 1813270399 * var1.bb <= 1813270399 * var3.bb && (var3.ae(-1717115332) != 0 || !var3.ap(1891926304)));

         var1 = var3;
      }
   }
}
