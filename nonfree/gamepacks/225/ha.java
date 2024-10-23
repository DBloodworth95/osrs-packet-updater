import java.util.Iterator;

public class ha extends tr {
   public static final int ag = 1;
   static ml ac = new ml(64);
   static final int ap = 8192;

   ha() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ha.<init>(" + ')');
      }
   }

   public static void ae() {
      ac.am();
   }

   public static void ag() {
      ac.am();
   }

   public static void am() {
      ac.am();
   }

   static final void nn(int var0, int var1) {
      try {
         var0 = Math.min(Math.max(var0, 0), 255);
         if (var0 != re.vt.ao(-2064596543)) {
            if (var1 >= 5197647) {
               return;
            }

            label92: {
               if (re.vt.ao(-2037283572) == 0) {
                  if (var1 >= 5197647) {
                     return;
                  }

                  if (iv.au((byte)1)) {
                     if (var1 >= 5197647) {
                        return;
                     }

                     fe.al(hg.fe, var0, -949517220);
                     client.tm = false;
                     break label92;
                  }
               }

               if (var0 == 0) {
                  if (var1 >= 5197647) {
                     throw new IllegalStateException();
                  }

                  ly.ax(0, 0, (byte)64);
                  client.tm = false;
               } else if (!mm.aq.isEmpty()) {
                  Iterator var2 = mm.aq.iterator();

                  while(var2.hasNext()) {
                     if (var1 >= 5197647) {
                        return;
                     }

                     ns var3 = (ns)var2.next();
                     if (null != var3) {
                        var3.am = var0 * -1538554415;
                     }
                  }

                  ns var5 = (ns)mm.aq.get(0);
                  if (var5 != null) {
                     if (var1 >= 5197647) {
                        throw new IllegalStateException();
                     }

                     if (var5.al != null) {
                        if (var1 >= 5197647) {
                           return;
                        }

                        if (var5.al.ap(1891926304)) {
                           if (var1 >= 5197647) {
                              throw new IllegalStateException();
                           }

                           if (!var5.au) {
                              if (var1 >= 5197647) {
                                 throw new IllegalStateException();
                              }

                              var5.al.ac(var0, -1620732737);
                              var5.ax = (float)var0;
                           }
                        }
                     }
                  }
               }
            }

            re.vt.ai(var0, 293561954);
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ha.nn(" + ')');
      }
   }
}
