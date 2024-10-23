import java.util.concurrent.Callable;

public class fh implements Callable {
   final fv ap;
   static vv[] kf;
   final fn ak;
   final int aj;
   // $FF: synthetic field
   final fr this$0;
   final fl aw;

   static void kg(int var0, int var1, int var2, int var3, int var4, byte var5) {
      try {
         pu var6 = nq.jn.ad[var0][var1][var2];
         if (var6 != null) {
            if (var5 <= 0) {
               return;
            }

            for(ec var7 = (ec)var6.as(); null != var7; var7 = (ec)var6.am()) {
               if (var5 <= 0) {
                  return;
               }

               if ((var3 & 32767) == var7.ap * 1119456901) {
                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (var7.aw * -1423952523 == var4) {
                     var7.kf();
                     break;
                  }
               }
            }

            if (var6.as() == null) {
               if (var5 <= 0) {
                  throw new IllegalStateException();
               }

               nq.jn.ad[var0][var1][var2] = null;
            }

            pl.ke(var0, var1, var2, 1971252821);
         }

      } catch (RuntimeException var8) {
         throw tm.aw(var8, "fh.kg(" + ')');
      }
   }

   public Object call() {
      try {
         this.ap.aw(2060306768);
         fv[][] var1;
         if (this.aw == fl.aw) {
            var1 = this.this$0.ak;
         } else {
            var1 = this.this$0.aw;
         }

         var1[-1200861523 * this.aj][this.ak.ak(975980670)] = this.ap;
         return null;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "fh.call(" + ')');
      }
   }

   public Object ap() {
      this.ap.aw(1814648145);
      fv[][] var1;
      if (this.aw == fl.aw) {
         var1 = this.this$0.ak;
      } else {
         var1 = this.this$0.aw;
      }

      var1[-878289694 * this.aj][this.ak.ak(1915353660)] = this.ap;
      return null;
   }

   public Object aw() {
      this.ap.aw(2030578869);
      fv[][] var1;
      if (this.aw == fl.aw) {
         var1 = this.this$0.ak;
      } else {
         var1 = this.this$0.aw;
      }

      var1[-1200861523 * this.aj][this.ak.ak(1321312358)] = this.ap;
      return null;
   }

   public Object ak() {
      this.ap.aw(1921038102);
      fv[][] var1;
      if (this.aw == fl.aw) {
         var1 = this.this$0.ak;
      } else {
         var1 = this.this$0.aw;
      }

      var1[-1200861523 * this.aj][this.ak.ak(1061201548)] = this.ap;
      return null;
   }

   public Object aj() {
      this.ap.aw(2016406004);
      fv[][] var1;
      if (this.aw == fl.aw) {
         var1 = this.this$0.ak;
      } else {
         var1 = this.this$0.aw;
      }

      var1[-1200861523 * this.aj][this.ak.ak(764012509)] = this.ap;
      return null;
   }

   fh(fr var1, fv var2, fl var3, fn var4, int var5) {
      try {
         this.this$0 = var1;
         super();
         this.ap = var2;
         this.aw = var3;
         this.ak = var4;
         this.aj = 1546929445 * var5;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "fh.<init>(" + ')');
      }
   }

   static int bm(int var0, da var1, boolean var2, byte var3) {
      try {
         if (var0 == 6200) {
            dp.am -= 1393015090;
            client.uk = (short)cb.bt(cm.ae[-158156887 * dp.am], 803797261);
            if (client.uk <= 0) {
               if (var3 >= 3) {
                  throw new IllegalStateException();
               }

               client.uk = 256;
            }

            client.vb = (short)cb.bt(cm.ae[dp.am * -158156887 + 1], -207320382);
            if (client.vb <= 0) {
               client.vb = 256;
            }

            return 1;
         } else if (var0 == 6201) {
            if (var3 >= 3) {
               throw new IllegalStateException();
            } else {
               dp.am -= 1393015090;
               client.vn = (short)cm.ae[dp.am * -158156887];
               if (client.vn <= 0) {
                  client.vn = 256;
               }

               client.vd = (short)cm.ae[dp.am * -158156887 + 1];
               if (client.vd <= 0) {
                  if (var3 >= 3) {
                     throw new IllegalStateException();
                  }

                  client.vd = 320;
               }

               return 1;
            }
         } else if (var0 == 6202) {
            if (var3 >= 3) {
               throw new IllegalStateException();
            } else {
               dp.am -= -1508937116;
               client.vf = (short)cm.ae[-158156887 * dp.am];
               if (client.vf <= 0) {
                  if (var3 >= 3) {
                     throw new IllegalStateException();
                  }

                  client.vf = 1;
               }

               client.vi = (short)cm.ae[1 + -158156887 * dp.am];
               if (client.vi <= 0) {
                  if (var3 >= 3) {
                     throw new IllegalStateException();
                  }

                  client.vi = 32767;
               } else if (client.vi < client.vf) {
                  if (var3 >= 3) {
                     throw new IllegalStateException();
                  }

                  client.vi = client.vf;
               }

               client.vy = (short)cm.ae[2 + -158156887 * dp.am];
               if (client.vy <= 0) {
                  if (var3 >= 3) {
                     throw new IllegalStateException();
                  }

                  client.vy = 1;
               }

               client.vo = (short)cm.ae[-158156887 * dp.am + 3];
               if (client.vo <= 0) {
                  if (var3 >= 3) {
                     throw new IllegalStateException();
                  }

                  client.vo = 32767;
               } else if (client.vo < client.vy) {
                  if (var3 >= 3) {
                     throw new IllegalStateException();
                  }

                  client.vo = client.vy;
               }

               return 1;
            }
         } else if (6203 == var0) {
            if (var3 >= 3) {
               throw new IllegalStateException();
            } else {
               if (null != client.pl) {
                  eq.if(0, 0, 2013768333 * client.pl.bo, -1662542495 * client.pl.bd, false, 65280);
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = client.vw * -1725432169;
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = -1477308191 * client.vm;
               } else {
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = -1;
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = -1;
               }

               return 1;
            }
         } else if (var0 == 6204) {
            if (var3 >= 3) {
               throw new IllegalStateException();
            } else {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = client.vn;
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = client.vd;
               return 1;
            }
         } else if (6205 == var0) {
            cm.ae[(dp.am += -1450976103) * -158156887 - 1] = po.bs(client.uk, 1156462877);
            cm.ae[(dp.am += -1450976103) * -158156887 - 1] = po.bs(client.vb, 1156462877);
            return 1;
         } else if (var0 == 6220) {
            cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 0;
            return 1;
         } else if (6221 == var0) {
            if (var3 >= 3) {
               throw new IllegalStateException();
            } else {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 0;
               return 1;
            }
         } else if (6222 == var0) {
            if (var3 >= 3) {
               throw new IllegalStateException();
            } else {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = ac.ax * 1816225167;
               return 1;
            }
         } else if (6223 == var0) {
            if (var3 >= 3) {
               throw new IllegalStateException();
            } else {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = ki.aq * -121992435;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "fh.bm(" + ')');
      }
   }
}
