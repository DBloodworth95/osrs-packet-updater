import java.awt.Image;
import java.net.URL;

public class gz extends fm {
   // $FF: synthetic field
   final fz this$0;
   int ac;
   static final int aq = 3;
   static qu iw;
   static int jx;
   static final int ag = 1;
   static Image bw;

   static ks lf(int var0, int var1, int var2) {
      try {
         client.wn.ac = 863373761 * var0;
         client.wn.ae = -1962514161 * var1;
         client.wn.ag = -1242577219;
         client.wn.am = -742410521;
         return client.wn;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "gz.lf(" + ')');
      }
   }

   gz(fz var1) {
      try {
         this.this$0 = var1;
         super();
         this.ac = 128513623;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "gz.<init>(" + ')');
      }
   }

   void ae(go var1, byte var2) {
      try {
         var1.ah(-1884706151 * this.ac, -154063545);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "gz.ae(" + ')');
      }
   }

   void ag(vf var1) {
      this.ac = var1.ct(-1403907592) * -128513623;
   }

   void am(vf var1) {
      this.ac = var1.ct(-1650344387) * -128513623;
   }

   void ax(vf var1) {
      this.ac = var1.ct(-1657494769) * -128513623;
   }

   void aq(go var1) {
      var1.ah(-1884706151 * this.ac, -909430690);
   }

   void af(go var1) {
      var1.ah(1662420250 * this.ac, -537126060);
   }

   void at(go var1) {
      var1.ah(-1884706151 * this.ac, -354174930);
   }

   void au(go var1) {
      var1.ah(-1884706151 * this.ac, 17338680);
   }

   static boolean kr(di var0, int var1) {
      try {
         if (0 == client.np * 1716697315) {
            if (var1 >= 1957211467) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (var0 != qm.mm) {
            if (var1 >= 1957211467) {
               throw new IllegalStateException();
            } else {
               boolean var10000;
               label84: {
                  if (!dj.jc((byte)33)) {
                     if (!fd.jl(-1811137681) || !var0.aa((short)255)) {
                        var10000 = false;
                        break label84;
                     }

                     if (var1 >= 1957211467) {
                        throw new IllegalStateException();
                     }
                  }

                  var10000 = true;
               }

               boolean var2 = var10000;
               if (!var2) {
                  if (var1 >= 1957211467) {
                     throw new IllegalStateException();
                  }

                  if ((client.np * 1716697315 & 2) != 0) {
                     if (var1 >= 1957211467) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  boolean var3 = var10000;
                  if (var3 && var0.as(-999234676)) {
                     if (var1 >= 1957211467) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  var2 = var10000;
               }

               return var2;
            }
         } else {
            return ly.jd(-1172208687);
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "gz.kr(" + ')');
      }
   }

   void ac(vf var1, byte var2) {
      try {
         this.ac = var1.ct(-1712114404) * -128513623;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "gz.ac(" + ')');
      }
   }

   static boolean ac(int var0) {
      try {
         try {
            if (null == hl.ar) {
               hl.ar = ao.ir.ax(new URL(ke.co), -1377908475);
            } else if (hl.ar.ac(-342876042)) {
               byte[] var1 = hl.ar.ae(1516593414);
               vf var2 = new vf(var1);
               var2.cz(-1734056172);
               aq = var2.ct(-1840907551) * -642267367;
               br.ax = new cr[cr.aq * -571562711];

               for(int var3 = 0; var3 < -571562711 * cr.aq; ++var3) {
                  if (var0 >= 1186223598) {
                     throw new IllegalStateException();
                  }

                  cr var4 = br.ax[var3] = new cr();
                  var4.al = var2.ct(-1450159178) * 1776651257;
                  var4.ad = var2.cz(-1734056172) * -1502242057;
                  var4.ap = var2.cs(1260600921);
                  var4.ab = var2.cs(-612485605);
                  var4.az = var2.cv(952452697) * 1498656131;
                  var4.ah = var2.cq(1074299290) * 1896407397;
                  var4.aa = var3 * 891467767;
               }

               client.ag(br.ax, 0, br.ax.length - 1, cr.au, cr.at, -1635008324);
               hl.ar = null;
               return true;
            }
         } catch (Exception var5) {
            var5.printStackTrace();
            hl.ar = null;
         }

         return false;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "gz.ac(" + ')');
      }
   }
}
