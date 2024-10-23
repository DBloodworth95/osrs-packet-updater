public abstract class lj implements mu {
   protected int ac;
   public static vw bi;
   static final String hi = "game-session/v1/tokens";

   protected lj(ob var1, px var2, int var3) {
      try {
         super();
         this.ac = -1744322267 * var3;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "lj.<init>(" + ')');
      }
   }

   public static mj[] ac(int var0) {
      try {
         return new mj[]{mj.ac, mj.ae, mj.ag, mj.am, mj.ax, mj.aq, mj.af, mj.at, mj.au, mj.ar, mj.al, mj.ad, mj.ah, mj.ap, mj.ab, mj.az, mj.aa, mj.ai, mj.ao, mj.as, mj.ay, mj.aj, mj.av, mj.aw, mj.an, mj.ak, mj.bn, mj.bh, mj.bd, mj.bx, mj.bf, mj.bm, mj.bs, mj.bw, mj.ba, mj.bj, mj.bp, mj.by, mj.bb, mj.bi, mj.bg, mj.bl, mj.bz, mj.bu, mj.br, mj.bo, mj.bv, mj.bt, mj.bq, mj.bk, mj.be, mj.bc, mj.cn, mj.ch, mj.cf, mj.cu, mj.cm, mj.cj, mj.cx, mj.ci, mj.cy, mj.co, mj.cv, mj.cg, mj.ct, mj.cq, mj.cc, mj.cz, mj.cw, mj.cr, mj.cl, mj.ca, mj.cs, mj.cp, mj.cb, mj.cd, mj.ce, mj.ck, mj.dp, mj.df, mj.dv, mj.dt, mj.dk, mj.dl, mj.db, mj.dc, mj.dw, mj.de, mj.dx, mj.dj, mj.do, mj.dh, mj.dm, mj.dq, mj.di, mj.da, mj.dz, mj.dg, mj.dr, mj.dy, mj.ds, mj.dn, mj.du, mj.dd, mj.eg, mj.ea, mj.ez, mj.ev, mj.ef, mj.ew, mj.ep, mj.ex, mj.eh, mj.eu, mj.ei, mj.eo, mj.el, mj.em, mj.en, mj.eb, mj.ek, mj.es, mj.ey, mj.er, mj.ed, mj.ee, mj.eq, mj.ej, mj.ec, mj.et, mj.fv, mj.ff, mj.fe, mj.ft, mj.fb, mj.fk, mj.fp};
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "lj.ac(" + ')');
      }
   }

   static void aq(float[] var0, byte var1) {
      try {
         var0[1] = 1.0F - var0[1];
         if (var0[0] < 0.0F) {
            if (var1 != 1) {
               throw new IllegalStateException();
            }

            var0[0] = 0.0F;
         }

         if (var0[1] < 0.0F) {
            var0[1] = 0.0F;
         }

         label41: {
            if (!(var0[0] > 1.0F)) {
               if (var1 != 1) {
                  return;
               }

               if (!(var0[1] > 1.0F)) {
                  break label41;
               }

               if (var1 != 1) {
                  throw new IllegalStateException();
               }
            }

            float var2 = var0[0] * (var0[0] - 2.0F + var0[1]) + var0[1] * (var0[1] - 2.0F) + 1.0F;
            if (ft.am + var2 > 0.0F) {
               if (var1 != 1) {
                  throw new IllegalStateException();
               }

               gg.ax(var0, -2113900874);
            }
         }

         var0[1] = 1.0F - var0[1];
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "lj.aq(" + ')');
      }
   }

   static void pk(byte var0) {
      try {
         for(int var1 = 0; var1 < client.wo.size(); ++var1) {
            if (var0 >= 0) {
               throw new IllegalStateException();
            }

            int var3 = (Integer)client.wo.get(var1);
            fo var4 = ba.ai(var3, -1648382594);
            byte var2;
            if (null == var4) {
               if (var0 >= 0) {
                  throw new IllegalStateException();
               }

               var2 = 2;
            } else {
               byte var10000;
               if (var4.ag(-1818801014)) {
                  if (var0 >= 0) {
                     throw new IllegalStateException();
                  }

                  var10000 = 0;
               } else {
                  var10000 = 1;
               }

               var2 = var10000;
            }

            if (var2 != 2) {
               if (var0 >= 0) {
                  return;
               }

               client.wo.remove(var1);
               --var1;
            }
         }

      } catch (RuntimeException var5) {
         throw vk.ae(var5, "lj.pk(" + ')');
      }
   }

   static int oq(ny var0, byte var1) {
      try {
         th var2 = (th)client.rh.ac(((long)(-1565465557 * var0.bh) << 32) + (long)(var0.bd * -1614754997));
         if (null != var2) {
            if (var1 == 0) {
               throw new IllegalStateException();
            } else {
               return var2.ac;
            }
         } else {
            return var0.dd * -2124213689;
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "lj.oq(" + ')');
      }
   }
}
