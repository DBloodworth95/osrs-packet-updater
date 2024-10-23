import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Comparator;

final class pc implements Comparator {
   static int un;

   public int compare(Object var1, Object var2) {
      try {
         return this.ap((pv)var1, (pv)var2, -410808225);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "pc.compare(" + ')');
      }
   }

   int ap(pv var1, pv var2, int var3) {
      try {
         byte var10000;
         if (var1.aw * -1509005580254558405L < -1509005580254558405L * var2.aw) {
            if (var3 >= 674051365) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else if (-1509005580254558405L * var2.aw == -1509005580254558405L * var1.aw) {
            if (var3 >= 674051365) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = 1;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "pc.ap(" + ')');
      }
   }

   public static void ap(String var0, boolean var1, boolean var2, byte var3) {
      try {
         if (var1) {
            if (var3 <= 16) {
               throw new IllegalStateException();
            }

            if (!var2) {
               if (var3 <= 16) {
                  return;
               }

               if (Desktop.isDesktopSupported()) {
                  if (var3 <= 16) {
                     throw new IllegalStateException();
                  }

                  if (Desktop.getDesktop().isSupported(Action.BROWSE)) {
                     if (var3 <= 16) {
                        throw new IllegalStateException();
                     }

                     try {
                        Desktop.getDesktop().browse(new URI(var0));
                        return;
                     } catch (Exception var5) {
                     }
                  }
               }
            }

            if (bb.aw.startsWith("win")) {
               if (var3 <= 16) {
                  return;
               }

               if (!var2) {
                  if (var3 <= 16) {
                     throw new IllegalStateException();
                  }

                  ds.aw(var0, 0, (byte)14);
                  return;
               }
            }

            if (bb.aw.startsWith("mac")) {
               if (var3 <= 16) {
                  throw new IllegalStateException();
               }

               ad.ak(var0, 1, "openjs", -1381696483);
            } else {
               ds.aw(var0, 2, (byte)14);
            }
         } else {
            ds.aw(var0, 3, (byte)14);
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "pc.ap(" + ')');
      }
   }

   public int am(Object var1, Object var2) {
      return this.ap((pv)var1, (pv)var2, -1832019087);
   }

   public int ay(Object var1, Object var2) {
      return this.ap((pv)var1, (pv)var2, -267740140);
   }

   public int as(Object var1, Object var2) {
      return this.ap((pv)var1, (pv)var2, -188831468);
   }

   public int ae(Object var1, Object var2) {
      return this.ap((pv)var1, (pv)var2, -734240767);
   }

   int ak(pv var1, pv var2) {
      return var1.aw * -1509005580254558405L < -1509005580254558405L * var2.aw ? -1 : (-1509005580254558405L * var2.aw == -1509005580254558405L * var1.aw ? 0 : 1);
   }

   public int at(Object var1, Object var2) {
      return this.ap((pv)var1, (pv)var2, -1921903255);
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "pc.equals(" + ')');
      }
   }

   int aw(pv var1, pv var2) {
      return var1.aw * -1509005580254558405L < -1509005580254558405L * var2.aw ? -1 : (-1509005580254558405L * var2.aw == -1509005580254558405L * var1.aw ? 0 : 1);
   }

   int aj(pv var1, pv var2) {
      return var1.aw * -1509005580254558405L < -1509005580254558405L * var2.aw ? -1 : (-1509005580254558405L * var2.aw == -1509005580254558405L * var1.aw ? 0 : 1);
   }

   public boolean gj(Object var1) {
      return super.equals(var1);
   }
}
