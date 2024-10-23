public class gw extends fm {
   static final float en = 200.0F;
   String ae;
   long ac;
   // $FF: synthetic field
   final fz this$0;
   static final int al = 70;

   public static String ah(char var0, int var1, byte var2) {
      try {
         char[] var3 = new char[var1];

         for(int var4 = 0; var4 < var1; ++var4) {
            if (var2 <= 104) {
               throw new IllegalStateException();
            }

            var3[var4] = var0;
         }

         return new String(var3);
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "gw.ah(" + ')');
      }
   }

   static void mh(int var0, String var1, int var2) {
      try {
         int var3 = -396152079 * client.jl.at;
         int[] var4 = client.jl.au;
         boolean var5 = false;
         wf var6 = new wf(var1, bd.cj);

         for(int var7 = 0; var7 < var3; ++var7) {
            di var8 = qm.mm.bd.ad[var4[var7]];
            if (null != var8) {
               if (var2 != -1296225271) {
                  throw new IllegalStateException();
               }

               if (qm.mm != var8 && var8.ac != null) {
                  if (var2 != -1296225271) {
                     throw new IllegalStateException();
                  }

                  if (var8.ac.equals(var6)) {
                     if (var2 != -1296225271) {
                        return;
                     }

                     mq var9;
                     if (1 == var0) {
                        var9 = fs.ac(mz.cm, client.ia.ax, (byte)-30);
                        var9.ag.ds(var4[var7], -77929123);
                        var9.ag.bu(0, (byte)68);
                        client.ia.ag(var9, 1029626834);
                     } else if (var0 == 4) {
                        if (var2 != -1296225271) {
                           throw new IllegalStateException();
                        }

                        var9 = fs.ac(mz.dx, client.ia.ax, (byte)-127);
                        var9.ag.br(var4[var7], 1625888552);
                        var9.ag.dq(0, -928391609);
                        client.ia.ag(var9, 2046456442);
                     } else if (var0 == 6) {
                        if (var2 != -1296225271) {
                           throw new IllegalStateException();
                        }

                        var9 = fs.ac(mz.an, client.ia.ax, (byte)-116);
                        var9.ag.du(var4[var7], -1860700726);
                        var9.ag.dh(0, 1129525719);
                        client.ia.ag(var9, -1331128829);
                     } else if (7 == var0) {
                        if (var2 != -1296225271) {
                           throw new IllegalStateException();
                        }

                        var9 = fs.ac(mz.ap, client.ia.ax, (byte)-79);
                        var9.ag.bu(0, (byte)-5);
                        var9.ag.du(var4[var7], -1000805124);
                        client.ia.ag(var9, -196882452);
                     }

                     var5 = true;
                     break;
                  }
               }
            }
         }

         if (!var5) {
            if (var2 != -1296225271) {
               throw new IllegalStateException();
            }

            ho.ae(4, "", ok.gj + var1, (byte)38);
         }

      } catch (RuntimeException var10) {
         throw vk.ae(var10, "gw.mh(" + ')');
      }
   }

   void ae(go var1, byte var2) {
      try {
         var1.ar(-295294778959019417L * this.ac, this.ae, 1304503354);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "gw.ae(" + ')');
      }
   }

   void ag(vf var1) {
      if (var1.cv(952452697) != 255) {
         var1.au -= -1864458299;
         this.ac = var1.cw(1314732654) * -965199577029985961L;
      }

      this.ae = var1.ca(-1858669723);
   }

   void am(vf var1) {
      if (var1.cv(952452697) != 255) {
         var1.au -= -1864458299;
         this.ac = var1.cw(1729056978) * -965199577029985961L;
      }

      this.ae = var1.ca(-1401128351);
   }

   void ax(vf var1) {
      if (var1.cv(952452697) != 255) {
         var1.au -= -1864458299;
         this.ac = var1.cw(937373376) * -965199577029985961L;
      }

      this.ae = var1.ca(855642600);
   }

   gw(fz var1) {
      try {
         this.this$0 = var1;
         super();
         this.ac = 965199577029985961L;
         this.ae = null;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "gw.<init>(" + ')');
      }
   }

   void af(go var1) {
      var1.ar(-295294778959019417L * this.ac, this.ae, -637131363);
   }

   void at(go var1) {
      var1.ar(-295294778959019417L * this.ac, this.ae, -39299420);
   }

   void au(go var1) {
      var1.ar(-295294778959019417L * this.ac, this.ae, 1324450210);
   }

   static void ha(mq var0, int var1) {
      try {
         var0.ag.bv(406759643 * nv.fq.bs, 962774926);
         var0.ag.bv(406759643 * ch.ec.bs, 513057138);
         var0.ag.em(ak.eq.bs * 406759643, 65535);
         var0.ag.em(406759643 * nu.ft.bs, 65535);
         var0.ag.em(406759643 * qy.ff.bs, 65535);
         var0.ag.bv(406759643 * hi.fg.bs, 376836609);
         var0.ag.el(406759643 * cg.fo.bs, -801649274);
         var0.ag.bv(nc.fr.bs * 406759643, 1732932472);
         var0.ag.el(406759643 * mk.et.bs, 1655935105);
         var0.ag.el(dr.fk.bs * 406759643, 1418134078);
         var0.ag.el(0, 1869097561);
         var0.ag.em(jc.ej.bs * 406759643, 65535);
         var0.ag.el(406759643 * ry.fh.bs, -1318779625);
         var0.ag.em(dp.fn.bs * 406759643, 65535);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "gw.ha(" + ')');
      }
   }

   static void nk(boolean var0, byte var1) {
      try {
         client.nz = var0;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "gw.nk(" + ')');
      }
   }

   void ac(vf var1, byte var2) {
      try {
         if (var1.cv(952452697) != 255) {
            if (var2 <= 59) {
               throw new IllegalStateException();
            }

            var1.au -= -1864458299;
            this.ac = var1.cw(2122204402) * -965199577029985961L;
         }

         this.ae = var1.ca(55082894);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "gw.ac(" + ')');
      }
   }

   public static qf ae(int var0) {
      try {
         synchronized(qf.ae) {
            if (378295407 * qf.am == 0) {
               if (var0 <= -777644377) {
                  throw new IllegalStateException();
               } else {
                  return new qf();
               }
            } else {
               qf.ae[(qf.am -= -436761969) * 378295407].af((short)31378);
               return qf.ae[378295407 * qf.am];
            }
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "gw.ae(" + ')');
      }
   }

   void aq(go var1) {
      var1.ar(-295294778959019417L * this.ac, this.ae, -1408525804);
   }

   static boolean ox(ny var0, int var1) {
      try {
         return var0.bq;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "gw.ox(" + ')');
      }
   }
}
