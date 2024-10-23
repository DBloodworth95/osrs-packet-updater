import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public final class aw extends Canvas {
   Component ac;
   public static final int cx = 80;
   public static final int ai = 16;
   static final int ap = 2;

   public final void ax(Graphics var1) {
      this.ac.paint(var1);
   }

   public final void update(Graphics var1) {
      try {
         this.ac.update(var1);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "aw.update(" + ')');
      }
   }

   public final void am(Graphics var1) {
      this.ac.paint(var1);
   }

   public final void ac(Graphics var1) {
      this.ac.update(var1);
   }

   public final void ae(Graphics var1) {
      this.ac.update(var1);
   }

   public final void paint(Graphics var1) {
      try {
         this.ac.paint(var1);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "aw.paint(" + ')');
      }
   }

   public final void ag(Graphics var1) {
      this.ac.paint(var1);
   }

   aw(Component var1) {
      try {
         super();
         this.ac = var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "aw.<init>(" + ')');
      }
   }

   static void ir(if var0, int var1, int var2, int var3, boolean var4, int var5) {
      try {
         if (client.th * -613960017 >= 50) {
            if (var5 == -1983110784) {
               throw new IllegalStateException();
            }
         } else {
            if (null != var0.ad) {
               if (var5 == -1983110784) {
                  return;
               }

               if (var0.ad.containsKey(var1)) {
                  ie var6 = (ie)var0.ad.get(var1);
                  if (var6 == null) {
                     if (var5 == -1983110784) {
                        throw new IllegalStateException();
                     }

                     return;
                  }

                  int var7 = var6.ag * 341204635 & 31;
                  if (var7 > 0) {
                     if (var5 == -1983110784) {
                        throw new IllegalStateException();
                     }

                     if (re.vt.av((byte)4) == 0) {
                        return;
                     }

                     if (var5 == -1983110784) {
                        throw new IllegalStateException();
                     }
                  }

                  if (0 != var7 || re.vt.ay(1834140281) != 0) {
                     if (var6 == null) {
                        if (var5 == -1983110784) {
                           throw new IllegalStateException();
                        }
                     } else {
                        if (341204635 * var6.ag == 0) {
                           if (var5 == -1983110784) {
                              return;
                           }

                           if (!var4) {
                              if (var5 == -1983110784) {
                                 throw new IllegalStateException();
                              }

                              return;
                           }

                           client.tg[client.th * -613960017] = 0;
                        } else {
                           int var12 = (var2 - 64) / 128;
                           int var13 = (var3 - 64) / 128;
                           client.tg[-613960017 * client.th] = (var13 << 8) + (var12 << 16) + var6.ag * 341204635;
                        }

                        client.to[client.th * -613960017] = var6.ac * 1503385865;
                        client.tx[-613960017 * client.th] = -1707820073 * var6.ae;
                        client.tq[client.th * -613960017] = 0;
                        client.td[-613960017 * client.th] = null;
                        client.ta[-613960017 * client.th] = -2041095673 * var6.am;
                        client.th += -2137825201;
                     }

                     return;
                  }

                  return;
               }
            }

         }
      } catch (RuntimeException var14) {
         throw vk.ae(var14, "aw.ir(" + ')');
      }
   }
}
