import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class fr extends tp {
   int ap;
   public fv[][] aw;
   fv[][] ak;
   int ai;
   public jt aj;
   boolean ay;
   Future am;
   static int gy;
   List at;
   static String cy;
   static int as;
   static final int ah = 0;
   static final int ad = 0;

   public boolean ak(int var1) {
      try {
         if (this.am == null) {
            if (var1 >= -1546638972) {
               throw new IllegalStateException();
            }

            if (this.at == null) {
               if (var1 >= -1546638972) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         if (null != this.am) {
            if (var1 >= -1546638972) {
               throw new IllegalStateException();
            }

            if (!this.am.isDone()) {
               if (var1 >= -1546638972) {
                  throw new IllegalStateException();
               }

               return false;
            }

            this.am = null;
         }

         boolean var2 = true;

         for(int var3 = 0; var3 < this.at.size(); ++var3) {
            if (var1 >= -1546638972) {
               throw new IllegalStateException();
            }

            if (!((Future)this.at.get(var3)).isDone()) {
               if (var1 >= -1546638972) {
                  throw new IllegalStateException();
               }

               var2 = false;
            } else {
               this.at.remove(var3);
               --var3;
            }
         }

         if (!var2) {
            return false;
         } else {
            this.at = null;
            return true;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "fr.ak(" + ')');
      }
   }

   void aw(vl var1, int var2, byte var3) {
      try {
         var1.ce(161396639);
         var1.ce(865045828);
         this.ai = var1.cy((short)-1430) * 1656125507;
         int var4 = var1.ce(1547260218);
         this.ak = new fv[this.aj.aw(669227290).aw(1298895339)][];
         this.aw = new fv[this.aj.ap((byte)-83)][];
         fh[] var5 = new fh[var4];

         int var6;
         int var8;
         int var10;
         for(var6 = 0; var6 < var4; ++var6) {
            if (var3 != 7) {
               throw new IllegalStateException();
            }

            fl var7 = dx.ak(var1.cy((short)-18044), -1219590039);
            var8 = var1.ck((byte)1);
            var10 = var1.cy((short)-17305);
            fn var11 = (fn)gu.ap(ui.ap(-158156887), var10, -1875781163);
            if (null == var11) {
               if (var3 != 7) {
                  throw new IllegalStateException();
               }

               var11 = fn.ap;
            }

            fv var12 = new fv();
            var12.ap(var1, var2, 1283905719);
            var5[var6] = new fh(this, var12, var7, var11, var8);
            int var13 = var7.aj((byte)2);
            fv[][] var14;
            if (var7 == fl.aw) {
               if (var3 != 7) {
                  throw new IllegalStateException();
               }

               var14 = this.ak;
            } else {
               var14 = this.aw;
            }

            if (null == var14[var8]) {
               if (var3 != 7) {
                  throw new IllegalStateException();
               }

               var14[var8] = new fv[var13];
            }

            if (var7 == fl.ai) {
               this.ay = true;
            }
         }

         var6 = var4 / (as * 1130801815);
         int var16 = var4 % (1130801815 * as);
         int var9 = 0;
         var10 = 0;

         while(true) {
            if (var10 < 1130801815 * as) {
               if (var3 != 7) {
                  throw new IllegalStateException();
               }

               var8 = var9;
               var9 += var6;
               if (var16 > 0) {
                  if (var3 != 7) {
                     return;
                  }

                  ++var9;
                  --var16;
               }

               if (var8 != var9) {
                  this.at.add(vu.ae.submit(new fd(this, var8, var9, var5)));
                  ++var10;
                  continue;
               }

               if (var3 != 7) {
                  return;
               }
            }

            return;
         }
      } catch (RuntimeException var15) {
         throw tm.aw(var15, "fr.aw(" + ')');
      }
   }

   void bb(qs var1, int var2, fw var3, int var4) {
      float[] var5 = var3.au(this.ai * 2049414251, -1889118924);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.ak[var2]) {
         fv var9 = this.ak[var2][6];
         fv var10 = this.ak[var2][7];
         fv var11 = this.ak[var2][8];
         if (null != var9) {
            var6 = var9.ak(var4, -1930475116);
         }

         if (var10 != null) {
            var7 = var10.ak(var4, -2084443264);
         }

         if (null != var11) {
            var8 = var11.ak(var4, -767747588);
         }
      }

      qs var12 = gu.aw(-1494719301);
      var12.au(var6, var7, var8, 1328947399);
      var1.ao(var12, 611431093);
      var12.ak((byte)-6);
   }

   public int aj(int var1) {
      try {
         return this.ai * 2049414251;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "fr.aj(" + ')');
      }
   }

   static void lr(int var0, int var1, int var2, int var3, String var4, byte var5) {
      try {
         int var6 = var0 >>> 16;
         int var7 = var0 & '\uffff';
         ng var8 = qk.ek.aw(var1, var2, (byte)19);
         if (var8 == null) {
            if (var5 != -1) {
               throw new IllegalStateException();
            }
         } else {
            if (null != var8.ft) {
               if (var5 != -1) {
                  throw new IllegalStateException();
               }

               dt var9 = new dt();
               var9.ak = var8;
               var9.ay = var7 * -289928617;
               var9.as = 920667555 * var6;
               var9.au = var4;
               var9.ap = var8.ft;
               sr.ap(var9, -1847427752);
            }

            boolean var12 = true;
            if (542190393 * var8.bq > 0) {
               if (var5 != -1) {
                  throw new IllegalStateException();
               }

               var12 = ko.nn(var8, (byte)-68);
            }

            if (!var12) {
               if (var5 != -1) {
                  throw new IllegalStateException();
               }
            } else if (!tk.ap(gr.oa(var8, 1252944238), var7 - 1, -1410873744)) {
               if (var5 == -1) {
                  ;
               }
            } else {
               me var10;
               if (var0 == 1) {
                  var10 = ef.ap(mm.af, client.in.ai, (byte)80);
                  var10.ak.bw(var1, (byte)105);
                  var10.ak.bd(var2, (byte)74);
                  var10.ak.bd(var3, (byte)-1);
                  client.in.ak(var10, (short)486);
               }

               if (2 == var0) {
                  if (var5 != -1) {
                     throw new IllegalStateException();
                  }

                  var10 = ef.ap(mm.ay, client.in.ai, (byte)60);
                  var10.ak.bw(var1, (byte)89);
                  var10.ak.bd(var2, (byte)2);
                  var10.ak.bd(var3, (byte)25);
                  client.in.ak(var10, (short)486);
               }

               if (var0 == 3) {
                  if (var5 != -1) {
                     throw new IllegalStateException();
                  }

                  var10 = ef.ap(mm.ad, client.in.ai, (byte)106);
                  var10.ak.bw(var1, (byte)100);
                  var10.ak.bd(var2, (byte)-8);
                  var10.ak.bd(var3, (byte)81);
                  client.in.ak(var10, (short)486);
               }

               if (var0 == 4) {
                  if (var5 != -1) {
                     throw new IllegalStateException();
                  }

                  var10 = ef.ap(mm.cs, client.in.ai, (byte)105);
                  var10.ak.bw(var1, (byte)100);
                  var10.ak.bd(var2, (byte)-70);
                  var10.ak.bd(var3, (byte)-19);
                  client.in.ak(var10, (short)486);
               }

               if (var0 == 5) {
                  if (var5 != -1) {
                     return;
                  }

                  var10 = ef.ap(mm.bs, client.in.ai, (byte)74);
                  var10.ak.bw(var1, (byte)121);
                  var10.ak.bd(var2, (byte)27);
                  var10.ak.bd(var3, (byte)13);
                  client.in.ak(var10, (short)486);
               }

               if (6 == var0) {
                  var10 = ef.ap(mm.cn, client.in.ai, (byte)2);
                  var10.ak.bw(var1, (byte)124);
                  var10.ak.bd(var2, (byte)58);
                  var10.ak.bd(var3, (byte)-75);
                  client.in.ak(var10, (short)486);
               }

               if (7 == var0) {
                  if (var5 != -1) {
                     throw new IllegalStateException();
                  }

                  var10 = ef.ap(mm.bw, client.in.ai, (byte)78);
                  var10.ak.bw(var1, (byte)60);
                  var10.ak.bd(var2, (byte)45);
                  var10.ak.bd(var3, (byte)-31);
                  client.in.ak(var10, (short)486);
               }

               if (8 == var0) {
                  if (var5 != -1) {
                     throw new IllegalStateException();
                  }

                  var10 = ef.ap(mm.al, client.in.ai, (byte)66);
                  var10.ak.bw(var1, (byte)12);
                  var10.ak.bd(var2, (byte)21);
                  var10.ak.bd(var3, (byte)77);
                  client.in.ak(var10, (short)486);
               }

               if (9 == var0) {
                  if (var5 != -1) {
                     return;
                  }

                  var10 = ef.ap(mm.dd, client.in.ai, (byte)75);
                  var10.ak.bw(var1, (byte)80);
                  var10.ak.bd(var2, (byte)-40);
                  var10.ak.bd(var3, (byte)-43);
                  client.in.ak(var10, (short)486);
               }

               if (10 == var0) {
                  if (var5 != -1) {
                     throw new IllegalStateException();
                  }

                  var10 = ef.ap(mm.db, client.in.ai, (byte)7);
                  var10.ak.bw(var1, (byte)84);
                  var10.ak.bd(var2, (byte)-32);
                  var10.ak.bd(var3, (byte)-22);
                  client.in.ak(var10, (short)486);
               }

               if (var6 != 0) {
                  if (var5 != -1) {
                     throw new IllegalStateException();
                  }

                  var10 = ef.ap(mm.bp, client.in.ai, (byte)47);
                  var10.ak.bw(var1, (byte)46);
                  var10.ak.bd(var2, (byte)-79);
                  var10.ak.bd(var3, (byte)57);
                  var10.ak.bo(var7, -952848343);
                  var10.ak.bo(var6 - 1, -12416842);
                  client.in.ak(var10, (short)486);
               }

            }
         }
      } catch (RuntimeException var11) {
         throw tm.aw(var11, "fr.lr(" + ')');
      }
   }

   public void ay(int var1, fw var2, int var3, int var4, int var5) {
      try {
         qs var6 = gu.aw(-2049808184);
         this.as(var6, var3, var2, var1, (byte)-117);
         this.am(var6, var3, var2, var1, -2080080538);
         this.ae(var6, var3, var2, var1, 1031033139);
         var2.ai(var6, 326549326);
         var6.ak((byte)-57);
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "fr.ay(" + ')');
      }
   }

   void as(qs var1, int var2, fw var3, int var4, byte var5) {
      try {
         float[] var6 = var3.am(2049414251 * this.ai, -2131036687);
         float var7 = var6[0];
         float var8 = var6[1];
         float var9 = var6[2];
         if (null != this.ak[var2]) {
            if (var5 >= -15) {
               throw new IllegalStateException();
            }

            fv var10 = this.ak[var2][0];
            fv var11 = this.ak[var2][1];
            fv var12 = this.ak[var2][2];
            if (null != var10) {
               if (var5 >= -15) {
                  throw new IllegalStateException();
               }

               var7 = var10.ak(var4, -661339316);
            }

            if (null != var11) {
               if (var5 >= -15) {
                  throw new IllegalStateException();
               }

               var8 = var11.ak(var4, -1677425864);
            }

            if (null != var12) {
               if (var5 >= -15) {
                  throw new IllegalStateException();
               }

               var9 = var12.ak(var4, 147425193);
            }
         }

         qp var16 = jb.aw((byte)-67);
         var16.ai(1.0F, 0.0F, 0.0F, var7, (byte)-58);
         qp var17 = jb.aw((byte)-94);
         var17.ai(0.0F, 1.0F, 0.0F, var8, (byte)-15);
         qp var18 = jb.aw((byte)-39);
         var18.ai(0.0F, 0.0F, 1.0F, var9, (byte)-3);
         qp var13 = jb.aw((byte)-41);
         var13.ae(var18, (byte)119);
         var13.ae(var16, (byte)80);
         var13.ae(var17, (byte)89);
         qs var14 = gu.aw(-771902386);
         var14.ar(var13, 1589462474);
         var1.ao(var14, -300252970);
         var16.ak(1938996484);
         var17.ak(2133516669);
         var18.ak(2131021597);
         var13.ak(990747597);
         var14.ak((byte)-25);
      } catch (RuntimeException var15) {
         throw tm.aw(var15, "fr.as(" + ')');
      }
   }

   void ae(qs var1, int var2, fw var3, int var4, int var5) {
      try {
         float[] var6 = var3.at(this.ai * 2049414251, -2142082017);
         float var7 = var6[0];
         float var8 = var6[1];
         float var9 = var6[2];
         if (null != this.ak[var2]) {
            if (var5 <= -1112428616) {
               return;
            }

            fv var10 = this.ak[var2][3];
            fv var11 = this.ak[var2][4];
            fv var12 = this.ak[var2][5];
            if (null != var10) {
               if (var5 <= -1112428616) {
                  return;
               }

               var7 = var10.ak(var4, -1005046413);
            }

            if (var11 != null) {
               if (var5 <= -1112428616) {
                  throw new IllegalStateException();
               }

               var8 = var11.ak(var4, -532476069);
            }

            if (null != var12) {
               if (var5 <= -1112428616) {
                  return;
               }

               var9 = var12.ak(var4, -2102808394);
            }
         }

         var1.ai[12] = var7;
         var1.ai[13] = var8;
         var1.ai[14] = var9;
      } catch (RuntimeException var13) {
         throw tm.aw(var13, "fr.ae(" + ')');
      }
   }

   void bp(qs var1, int var2, fw var3, int var4) {
      float[] var5 = var3.au(this.ai * 1181093952, -1984751757);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.ak[var2]) {
         fv var9 = this.ak[var2][6];
         fv var10 = this.ak[var2][7];
         fv var11 = this.ak[var2][8];
         if (null != var9) {
            var6 = var9.ak(var4, -1810250318);
         }

         if (var10 != null) {
            var7 = var10.ak(var4, -1895616542);
         }

         if (null != var11) {
            var8 = var11.ak(var4, -285092566);
         }
      }

      qs var12 = gu.aw(-449158480);
      var12.au(var6, var7, var8, 1313180917);
      var1.ao(var12, 1899718378);
      var12.ak((byte)-103);
   }

   public static fr at(pe var0, pe var1, int var2, boolean var3) {
      boolean var4 = true;
      byte[] var5 = var0.bg(var2 >> 16 & '\uffff', var2 & '\uffff', 1822592901);
      if (var5 == null) {
         var4 = false;
         return null;
      } else {
         int var6 = (var5[1] & 255) << 8 | var5[2] & 255;
         byte[] var7;
         if (var3) {
            var7 = var1.bg(0, var6, 43336912);
         } else {
            var7 = var1.bg(var6, 0, 185402135);
         }

         if (null == var7) {
            var4 = false;
         }

         if (!var4) {
            return null;
         } else {
            if (vu.ae == null) {
               as = Runtime.getRuntime().availableProcessors() * -1050446553;
               vu.ae = new ThreadPoolExecutor(0, as * 1130801815, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100 + 1411031804 * as), new fg());
            }

            try {
               return new fr(var0, var1, var2, var3);
            } catch (Exception var9) {
               return null;
            }
         }
      }
   }

   public static fr au(pe var0, pe var1, int var2, boolean var3) {
      boolean var4 = true;
      byte[] var5 = var0.bg(var2 >> 16 & '\uffff', var2 & '\uffff', -262749539);
      if (var5 == null) {
         var4 = false;
         return null;
      } else {
         int var6 = (var5[1] & 255) << 8 | var5[2] & 255;
         byte[] var7;
         if (var3) {
            var7 = var1.bg(0, var6, 1807605837);
         } else {
            var7 = var1.bg(var6, 0, 1335438803);
         }

         if (null == var7) {
            var4 = false;
         }

         if (!var4) {
            return null;
         } else {
            if (vu.ae == null) {
               as = Runtime.getRuntime().availableProcessors() * -1050446553;
               vu.ae = new ThreadPoolExecutor(0, as * 1130801815, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100 + 1411031804 * as), new fg());
            }

            try {
               return new fr(var0, var1, var2, var3);
            } catch (Exception var9) {
               return null;
            }
         }
      }
   }

   public static fr an(pe var0, pe var1, int var2, boolean var3) {
      boolean var4 = true;
      byte[] var5 = var0.bg(var2 >> 16 & 1347259589, var2 & '\uffff', 1590031583);
      if (var5 == null) {
         var4 = false;
         return null;
      } else {
         int var6 = (var5[1] & 255) << 8 | var5[2] & 255;
         byte[] var7;
         if (var3) {
            var7 = var1.bg(0, var6, 1576794918);
         } else {
            var7 = var1.bg(var6, 0, 1811536539);
         }

         if (null == var7) {
            var4 = false;
         }

         if (!var4) {
            return null;
         } else {
            if (vu.ae == null) {
               as = Runtime.getRuntime().availableProcessors() * -1050446553;
               vu.ae = new ThreadPoolExecutor(0, as * 1600685994, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(-768691130 + 1411031804 * as), new fg());
            }

            try {
               return new fr(var0, var1, var2, var3);
            } catch (Exception var9) {
               return null;
            }
         }
      }
   }

   void ao(vl var1, int var2) {
      var1.ce(1716628070);
      var1.ce(1149911949);
      this.ai = var1.cy((short)-410) * 1656125507;
      int var3 = var1.ce(1823090045);
      this.ak = new fv[this.aj.aw(669227290).aw(1298895339)][];
      this.aw = new fv[this.aj.ap((byte)14)][];
      fh[] var4 = new fh[var3];

      int var5;
      int var7;
      int var9;
      for(var5 = 0; var5 < var3; ++var5) {
         fl var6 = dx.ak(var1.cy((short)-1326), -1228895717);
         var7 = var1.ck((byte)1);
         var9 = var1.cy((short)-26335);
         fn var10 = (fn)gu.ap(ui.ap(-158156887), var9, -1875781163);
         if (null == var10) {
            var10 = fn.ap;
         }

         fv var11 = new fv();
         var11.ap(var1, var2, -1804175502);
         var4[var5] = new fh(this, var11, var6, var10, var7);
         int var12 = var6.aj((byte)107);
         fv[][] var13;
         if (var6 == fl.aw) {
            var13 = this.ak;
         } else {
            var13 = this.aw;
         }

         if (null == var13[var7]) {
            var13[var7] = new fv[var12];
         }

         if (var6 == fl.ai) {
            this.ay = true;
         }
      }

      var5 = var3 / (as * 804310577);
      int var14 = var3 % (1469045638 * as);
      int var8 = 0;

      for(var9 = 0; var9 < 2068499247 * as; ++var9) {
         var7 = var8;
         var8 += var5;
         if (var14 > 0) {
            ++var8;
            --var14;
         }

         if (var7 == var8) {
            break;
         }

         this.at.add(vu.ae.submit(new fd(this, var7, var8, var4)));
      }

   }

   static void mf(ng var0, int var1, int var2, boolean var3, int var4) {
      try {
         int var5 = var0.bo * 2013768333;
         int var6 = -1662542495 * var0.bd;
         if (0 == var0.bc * 945605287) {
            if (var4 != 760262054) {
               throw new IllegalStateException();
            }

            var0.bo = 1810750741 * var0.bu;
         } else if (var0.bc * 945605287 == 1) {
            if (var4 != 760262054) {
               throw new IllegalStateException();
            }

            var0.bo = 2058168389 * (var1 - var0.bu * 1248179857);
         } else if (2 == var0.bc * 945605287) {
            if (var4 != 760262054) {
               throw new IllegalStateException();
            }

            var0.bo = (var0.bu * 1248179857 * var1 >> 14) * 2058168389;
         }

         if (var0.by * -1413589627 == 0) {
            var0.bd = -1896427703 * var0.bt;
         } else if (1 == var0.by * -1413589627) {
            var0.bd = (var2 - var0.bt * 260263849) * -1094859103;
         } else if (-1413589627 * var0.by == 2) {
            if (var4 != 760262054) {
               throw new IllegalStateException();
            }

            var0.bd = (var2 * var0.bt * 260263849 >> 14) * -1094859103;
         }

         if (4 == 945605287 * var0.bc) {
            if (var4 != 760262054) {
               throw new IllegalStateException();
            }

            var0.bo = 2058168389 * (var0.ba * -119188655 * -1662542495 * var0.bd / (1660101529 * var0.bw));
         }

         if (-1413589627 * var0.by == 4) {
            if (var4 != 760262054) {
               return;
            }

            var0.bd = -1094859103 * (var0.bw * 1660101529 * 2013768333 * var0.bo / (var0.ba * -119188655));
         }

         if (542190393 * var0.bq == 1337) {
            if (var4 != 760262054) {
               return;
            }

            client.pl = var0;
         }

         if (-1973680119 * var0.bk == 12) {
            if (var4 != 760262054) {
               throw new IllegalStateException();
            }

            var0.bn(-1919645375).as(var0.bo * 2013768333, var0.bd * -1662542495, 1570527280);
         }

         if (var3) {
            if (var4 != 760262054) {
               return;
            }

            if (null != var0.gy) {
               if (var4 != 760262054) {
                  throw new IllegalStateException();
               }

               if (var5 == 2013768333 * var0.bo) {
                  if (var4 != 760262054) {
                     throw new IllegalStateException();
                  }

                  if (var6 == -1662542495 * var0.bd) {
                     return;
                  }

                  if (var4 != 760262054) {
                     throw new IllegalStateException();
                  }
               }

               dt var7 = new dt();
               var7.ak = var0;
               var7.ap = var0.gy;
               client.qb.aw(var7);
            }
         }

      } catch (RuntimeException var8) {
         throw tm.aw(var8, "fr.mf(" + ')');
      }
   }

   public boolean ar() {
      if (this.am == null && this.at == null) {
         return true;
      } else {
         if (null != this.am) {
            if (!this.am.isDone()) {
               return false;
            }

            this.am = null;
         }

         boolean var1 = true;

         for(int var2 = 0; var2 < this.at.size(); ++var2) {
            if (!((Future)this.at.get(var2)).isDone()) {
               var1 = false;
            } else {
               this.at.remove(var2);
               --var2;
            }
         }

         if (!var1) {
            return false;
         } else {
            this.at = null;
            return true;
         }
      }
   }

   public boolean ab() {
      if (this.am == null && this.at == null) {
         return true;
      } else {
         if (null != this.am) {
            if (!this.am.isDone()) {
               return false;
            }

            this.am = null;
         }

         boolean var1 = true;

         for(int var2 = 0; var2 < this.at.size(); ++var2) {
            if (!((Future)this.at.get(var2)).isDone()) {
               var1 = false;
            } else {
               this.at.remove(var2);
               --var2;
            }
         }

         if (!var1) {
            return false;
         } else {
            this.at = null;
            return true;
         }
      }
   }

   public boolean af() {
      if (this.am == null && this.at == null) {
         return true;
      } else {
         if (null != this.am) {
            if (!this.am.isDone()) {
               return false;
            }

            this.am = null;
         }

         boolean var1 = true;

         for(int var2 = 0; var2 < this.at.size(); ++var2) {
            if (!((Future)this.at.get(var2)).isDone()) {
               var1 = false;
            } else {
               this.at.remove(var2);
               --var2;
            }
         }

         if (!var1) {
            return false;
         } else {
            this.at = null;
            return true;
         }
      }
   }

   fr(pe var1, pe var2, int var3, boolean var4) {
      try {
         super();
         this.aw = (fv[][])null;
         this.ak = (fv[][])null;
         this.ai = 0;
         this.ap = var3 * -1405027685;
         byte[] var5 = var1.bm(this.ap * -1191093357 >> 16 & '\uffff', this.ap * -1191093357 & '\uffff', 1318364656);
         vl var6 = new vl(var5);
         int var7 = var6.cy((short)-30786);
         int var8 = var6.ce(1779457198);
         byte[] var9;
         if (var4) {
            var9 = var2.bg(0, var8, -520390708);
         } else {
            var9 = var2.bg(var8, 0, -1197861683);
         }

         this.aj = new jt(var8, var9);
         this.at = new ArrayList();
         this.am = vu.ae.submit(new fb(this, var6, var7));
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "fr.<init>(" + ')');
      }
   }

   public int ad() {
      return this.ai * 2049414251;
   }

   public int ac() {
      return this.ai * 751749937;
   }

   public boolean av() {
      return this.ay;
   }

   void bv(qs var1, int var2, fw var3, int var4) {
      float[] var5 = var3.am(1525157815 * this.ai, -2132582338);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.ak[var2]) {
         fv var9 = this.ak[var2][0];
         fv var10 = this.ak[var2][1];
         fv var11 = this.ak[var2][2];
         if (null != var9) {
            var6 = var9.ak(var4, -24167860);
         }

         if (null != var10) {
            var7 = var10.ak(var4, -506643152);
         }

         if (null != var11) {
            var8 = var11.ak(var4, -502985901);
         }
      }

      qp var14 = jb.aw((byte)-55);
      var14.ai(1.0F, 0.0F, 0.0F, var6, (byte)-81);
      qp var15 = jb.aw((byte)-34);
      var15.ai(0.0F, 1.0F, 0.0F, var7, (byte)-98);
      qp var16 = jb.aw((byte)-64);
      var16.ai(0.0F, 0.0F, 1.0F, var8, (byte)-124);
      qp var12 = jb.aw((byte)-21);
      var12.ae(var16, (byte)58);
      var12.ae(var14, (byte)54);
      var12.ae(var15, (byte)123);
      qs var13 = gu.aw(-1314196314);
      var13.ar(var12, 1589462474);
      var1.ao(var13, 1627408670);
      var14.ak(1350878987);
      var15.ak(1631586614);
      var16.ak(1633867402);
      var12.ak(1399783011);
      var13.ak((byte)-2);
   }

   public void aq(int var1, fw var2, int var3, int var4) {
      qs var5 = gu.aw(445549231);
      this.as(var5, var3, var2, var1, (byte)-56);
      this.am(var5, var3, var2, var1, 1382316134);
      this.ae(var5, var3, var2, var1, 2128069799);
      var2.ai(var5, -1518865383);
      var5.ak((byte)-62);
   }

   public static void ap(int var0) {
      try {
         hr.ap.aj();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "fr.ap(" + ')');
      }
   }

   public void aa(int var1, fw var2, int var3, int var4) {
      qs var5 = gu.aw(-387925190);
      this.as(var5, var3, var2, var1, (byte)-110);
      this.am(var5, var3, var2, var1, 9522961);
      this.ae(var5, var3, var2, var1, 890186054);
      var2.ai(var5, -91528912);
      var5.ak((byte)-102);
   }

   public boolean az() {
      if (this.am == null && this.at == null) {
         return true;
      } else {
         if (null != this.am) {
            if (!this.am.isDone()) {
               return false;
            }

            this.am = null;
         }

         boolean var1 = true;

         for(int var2 = 0; var2 < this.at.size(); ++var2) {
            if (!((Future)this.at.get(var2)).isDone()) {
               var1 = false;
            } else {
               this.at.remove(var2);
               --var2;
            }
         }

         if (!var1) {
            return false;
         } else {
            this.at = null;
            return true;
         }
      }
   }

   void bh(qs var1, int var2, fw var3, int var4) {
      float[] var5 = var3.am(2049414251 * this.ai, -2142859312);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.ak[var2]) {
         fv var9 = this.ak[var2][0];
         fv var10 = this.ak[var2][1];
         fv var11 = this.ak[var2][2];
         if (null != var9) {
            var6 = var9.ak(var4, -1573471853);
         }

         if (null != var10) {
            var7 = var10.ak(var4, 422571109);
         }

         if (null != var11) {
            var8 = var11.ak(var4, -627369309);
         }
      }

      qp var14 = jb.aw((byte)-115);
      var14.ai(1.0F, 0.0F, 0.0F, var6, (byte)-121);
      qp var15 = jb.aw((byte)-35);
      var15.ai(0.0F, 1.0F, 0.0F, var7, (byte)-125);
      qp var16 = jb.aw((byte)-73);
      var16.ai(0.0F, 0.0F, 1.0F, var8, (byte)-112);
      qp var12 = jb.aw((byte)-4);
      var12.ae(var16, (byte)94);
      var12.ae(var14, (byte)44);
      var12.ae(var15, (byte)69);
      qs var13 = gu.aw(-2107778124);
      var13.ar(var12, 1589462474);
      var1.ao(var13, 1259438089);
      var14.ak(2102274344);
      var15.ak(960708001);
      var16.ak(1862233982);
      var12.ak(879522303);
      var13.ak((byte)-104);
   }

   void bj(qs var1, int var2, fw var3, int var4) {
      float[] var5 = var3.am(2049414251 * this.ai, -2146219859);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.ak[var2]) {
         fv var9 = this.ak[var2][0];
         fv var10 = this.ak[var2][1];
         fv var11 = this.ak[var2][2];
         if (null != var9) {
            var6 = var9.ak(var4, -1820007988);
         }

         if (null != var10) {
            var7 = var10.ak(var4, 316638453);
         }

         if (null != var11) {
            var8 = var11.ak(var4, 658133845);
         }
      }

      qp var14 = jb.aw((byte)-106);
      var14.ai(1.0F, 0.0F, 0.0F, var6, (byte)-37);
      qp var15 = jb.aw((byte)-94);
      var15.ai(0.0F, 1.0F, 0.0F, var7, (byte)-111);
      qp var16 = jb.aw((byte)-79);
      var16.ai(0.0F, 0.0F, 1.0F, var8, (byte)-107);
      qp var12 = jb.aw((byte)-5);
      var12.ae(var16, (byte)50);
      var12.ae(var14, (byte)117);
      var12.ae(var15, (byte)54);
      qs var13 = gu.aw(-1759048820);
      var13.ar(var12, 1589462474);
      var1.ao(var13, 812146161);
      var14.ak(1338930708);
      var15.ak(1817349391);
      var16.ak(1588997313);
      var12.ak(1271588564);
      var13.ak((byte)-42);
   }

   public void ax(int var1, fw var2, int var3, int var4) {
      qs var5 = gu.aw(2041150016);
      this.as(var5, var3, var2, var1, (byte)-49);
      this.am(var5, var3, var2, var1, 354523761);
      this.ae(var5, var3, var2, var1, 65567814);
      var2.ai(var5, 1744788238);
      var5.ak((byte)-85);
   }

   void ah(qs var1, int var2, fw var3, int var4) {
      float[] var5 = var3.am(2049414251 * this.ai, -2127579153);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.ak[var2]) {
         fv var9 = this.ak[var2][0];
         fv var10 = this.ak[var2][1];
         fv var11 = this.ak[var2][2];
         if (null != var9) {
            var6 = var9.ak(var4, -1476745569);
         }

         if (null != var10) {
            var7 = var10.ak(var4, -326085541);
         }

         if (null != var11) {
            var8 = var11.ak(var4, 733712655);
         }
      }

      qp var14 = jb.aw((byte)-120);
      var14.ai(1.0F, 0.0F, 0.0F, var6, (byte)-71);
      qp var15 = jb.aw((byte)-89);
      var15.ai(0.0F, 1.0F, 0.0F, var7, (byte)-115);
      qp var16 = jb.aw((byte)-7);
      var16.ai(0.0F, 0.0F, 1.0F, var8, (byte)-114);
      qp var12 = jb.aw((byte)-61);
      var12.ae(var16, (byte)56);
      var12.ae(var14, (byte)109);
      var12.ae(var15, (byte)101);
      qs var13 = gu.aw(-1502207398);
      var13.ar(var12, 1589462474);
      var1.ao(var13, 28013665);
      var14.ak(588266517);
      var15.ak(1524892749);
      var16.ak(1067206734);
      var12.ak(1959138162);
      var13.ak((byte)-103);
   }

   void bk(qs var1, int var2, fw var3, int var4) {
      float[] var5 = var3.at(this.ai * -988892211, -2142082017);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.ak[var2]) {
         fv var9 = this.ak[var2][3];
         fv var10 = this.ak[var2][4];
         fv var11 = this.ak[var2][5];
         if (null != var9) {
            var6 = var9.ak(var4, -443240640);
         }

         if (var10 != null) {
            var7 = var10.ak(var4, -1602825311);
         }

         if (null != var11) {
            var8 = var11.ak(var4, -1841966814);
         }
      }

      var1.ai[12] = var6;
      var1.ai[13] = var7;
      var1.ai[14] = var8;
   }

   void bq(qs var1, int var2, fw var3, int var4) {
      float[] var5 = var3.au(this.ai * -1045190695, -1604905874);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.ak[var2]) {
         fv var9 = this.ak[var2][6];
         fv var10 = this.ak[var2][7];
         fv var11 = this.ak[var2][8];
         if (null != var9) {
            var6 = var9.ak(var4, 777401353);
         }

         if (var10 != null) {
            var7 = var10.ak(var4, -826199500);
         }

         if (null != var11) {
            var8 = var11.ak(var4, -193243914);
         }
      }

      qs var12 = gu.aw(-1292911292);
      var12.au(var6, var7, var8, 808252261);
      var1.ao(var12, 2019745882);
      var12.ak((byte)-78);
   }

   void bx(qs var1, int var2, fw var3, int var4) {
      float[] var5 = var3.at(this.ai * 686136119, -2142082017);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.ak[var2]) {
         fv var9 = this.ak[var2][3];
         fv var10 = this.ak[var2][4];
         fv var11 = this.ak[var2][5];
         if (null != var9) {
            var6 = var9.ak(var4, 602145472);
         }

         if (var10 != null) {
            var7 = var10.ak(var4, -138619064);
         }

         if (null != var11) {
            var8 = var11.ak(var4, -657330351);
         }
      }

      var1.ai[12] = var6;
      var1.ai[13] = var7;
      var1.ai[14] = var8;
   }

   public boolean ai(byte var1) {
      try {
         return this.ay;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "fr.ai(" + ')');
      }
   }

   public int ag() {
      return this.ai * 2049414251;
   }

   void am(qs var1, int var2, fw var3, int var4, int var5) {
      try {
         float[] var6 = var3.au(this.ai * 2049414251, -1743433841);
         float var7 = var6[0];
         float var8 = var6[1];
         float var9 = var6[2];
         if (null != this.ak[var2]) {
            if (var5 >= 1757539349) {
               throw new IllegalStateException();
            }

            fv var10 = this.ak[var2][6];
            fv var11 = this.ak[var2][7];
            fv var12 = this.ak[var2][8];
            if (null != var10) {
               if (var5 >= 1757539349) {
                  throw new IllegalStateException();
               }

               var7 = var10.ak(var4, 217535808);
            }

            if (var11 != null) {
               if (var5 >= 1757539349) {
                  throw new IllegalStateException();
               }

               var8 = var11.ak(var4, 777405972);
            }

            if (null != var12) {
               if (var5 >= 1757539349) {
                  return;
               }

               var9 = var12.ak(var4, 463650080);
            }
         }

         qs var14 = gu.aw(-1147728024);
         var14.au(var7, var8, var9, 1082028716);
         var1.ao(var14, 1791353168);
         var14.ak((byte)-128);
      } catch (RuntimeException var13) {
         throw tm.aw(var13, "fr.am(" + ')');
      }
   }

   public void al(int var1, fw var2, int var3, int var4) {
      qs var5 = gu.aw(-1818109104);
      this.as(var5, var3, var2, var1, (byte)-39);
      this.am(var5, var3, var2, var1, -1948811433);
      this.ae(var5, var3, var2, var1, 64895229);
      var2.ai(var5, -1706094999);
      var5.ak((byte)-10);
   }
}
