import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class fo extends tr {
   int ac;
   List ar;
   public fr[][] ae;
   public jg am;
   fr[][] ag;
   int ax;
   Future au;
   boolean aq;
   public static final int af = 9;
   static int at;

   public void ao(int var1, fb var2, int var3, int var4) {
      qf var5 = gw.ae(-79652492);
      this.af(var5, var3, var2, var1, (byte)34);
      this.au(var5, var3, var2, var1, 1792962072);
      this.at(var5, var3, var2, var1, -1024987418);
      var2.ax(var5, 406460502);
      var5.ag(1781024812);
   }

   public boolean ax(int var1) {
      try {
         return this.aq;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "fo.ax(" + ')');
      }
   }

   public boolean ag(int var1) {
      try {
         if (null == this.au) {
            if (var1 >= -1303909846) {
               throw new IllegalStateException();
            }

            if (null == this.ar) {
               if (var1 >= -1303909846) {
                  throw new IllegalStateException();
               }

               return true;
            }
         }

         if (null != this.au) {
            if (var1 >= -1303909846) {
               throw new IllegalStateException();
            }

            if (!this.au.isDone()) {
               if (var1 >= -1303909846) {
                  throw new IllegalStateException();
               }

               return false;
            }

            this.au = null;
         }

         boolean var2 = true;

         for(int var3 = 0; var3 < this.ar.size(); ++var3) {
            if (var1 >= -1303909846) {
               throw new IllegalStateException();
            }

            if (!((Future)this.ar.get(var3)).isDone()) {
               if (var1 >= -1303909846) {
                  throw new IllegalStateException();
               }

               var2 = false;
            } else {
               this.ar.remove(var3);
               --var3;
            }
         }

         if (!var2) {
            if (var1 >= -1303909846) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            this.ar = null;
            return true;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "fo.ag(" + ')');
      }
   }

   public int am(byte var1) {
      try {
         return this.ax * -272291257;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "fo.am(" + ')');
      }
   }

   public void ai(int var1, fb var2, int var3, int var4) {
      qf var5 = gw.ae(1657417487);
      this.af(var5, var3, var2, var1, (byte)87);
      this.au(var5, var3, var2, var1, 1753017933);
      this.at(var5, var3, var2, var1, -1727540369);
      var2.ax(var5, -124860329);
      var5.ag(631549929);
   }

   public void aq(int var1, fb var2, int var3, int var4, byte var5) {
      try {
         qf var6 = gw.ae(2013029794);
         this.af(var6, var3, var2, var1, (byte)-8);
         this.au(var6, var3, var2, var1, 1597728924);
         this.at(var6, var3, var2, var1, -1831320952);
         var2.ax(var6, -1688333975);
         var6.ag(1152413539);
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "fo.aq(" + ')');
      }
   }

   void af(qf var1, int var2, fb var3, int var4, byte var5) {
      try {
         float[] var6 = var3.au(-272291257 * this.ax, 5452961);
         float var7 = var6[0];
         float var8 = var6[1];
         float var9 = var6[2];
         if (null != this.ag[var2]) {
            if (var5 == 0) {
               return;
            }

            fr var10 = this.ag[var2][0];
            fr var11 = this.ag[var2][1];
            fr var12 = this.ag[var2][2];
            if (var10 != null) {
               var7 = var10.ag(var4, 234934281);
            }

            if (null != var11) {
               var8 = var11.ag(var4, -1640010381);
            }

            if (var12 != null) {
               if (var5 == 0) {
                  throw new IllegalStateException();
               }

               var9 = var12.ag(var4, -384751937);
            }
         }

         qd var16 = gd.ac(-782050681);
         var16.am(1.0F, 0.0F, 0.0F, var7, 544928109);
         qd var17 = gd.ac(835263978);
         var17.am(0.0F, 1.0F, 0.0F, var8, 116427707);
         qd var18 = gd.ac(1230296329);
         var18.am(0.0F, 0.0F, 1.0F, var9, -1908423100);
         qd var13 = gd.ac(1550542325);
         var13.af(var18, (byte)34);
         var13.af(var16, (byte)8);
         var13.af(var17, (byte)17);
         qf var14 = gw.ae(391759037);
         var14.ab(var13, 299886161);
         var1.ah(var14, -2073192583);
         var16.ae(1056974395);
         var17.ae(522617775);
         var18.ae(-2057514100);
         var13.ae(810396203);
         var14.ag(769044848);
      } catch (RuntimeException var15) {
         throw vk.ae(var15, "fo.af(" + ')');
      }
   }

   void at(qf var1, int var2, fb var3, int var4, int var5) {
      try {
         float[] var6 = var3.ar(-272291257 * this.ax, (byte)2);
         float var7 = var6[0];
         float var8 = var6[1];
         float var9 = var6[2];
         if (null != this.ag[var2]) {
            if (var5 <= -1864458299) {
               return;
            }

            fr var10 = this.ag[var2][3];
            fr var11 = this.ag[var2][4];
            fr var12 = this.ag[var2][5];
            if (var10 != null) {
               if (var5 <= -1864458299) {
                  throw new IllegalStateException();
               }

               var7 = var10.ag(var4, 308346562);
            }

            if (null != var11) {
               if (var5 <= -1864458299) {
                  throw new IllegalStateException();
               }

               var8 = var11.ag(var4, -621335206);
            }

            if (var12 != null) {
               if (var5 <= -1864458299) {
                  throw new IllegalStateException();
               }

               var9 = var12.ag(var4, 1091503548);
            }
         }

         var1.ax[12] = var7;
         var1.ax[13] = var8;
         var1.ax[14] = var9;
      } catch (RuntimeException var13) {
         throw vk.ae(var13, "fo.at(" + ')');
      }
   }

   void au(qf var1, int var2, fb var3, int var4, int var5) {
      try {
         float[] var6 = var3.al(this.ax * -272291257, 1003006583);
         float var7 = var6[0];
         float var8 = var6[1];
         float var9 = var6[2];
         if (this.ag[var2] != null) {
            if (var5 <= 1526497093) {
               throw new IllegalStateException();
            }

            fr var10 = this.ag[var2][6];
            fr var11 = this.ag[var2][7];
            fr var12 = this.ag[var2][8];
            if (var10 != null) {
               if (var5 <= 1526497093) {
                  throw new IllegalStateException();
               }

               var7 = var10.ag(var4, -935232089);
            }

            if (null != var11) {
               var8 = var11.ag(var4, 1458477595);
            }

            if (null != var12) {
               if (var5 <= 1526497093) {
                  throw new IllegalStateException();
               }

               var9 = var12.ag(var4, 992618291);
            }
         }

         qf var14 = gw.ae(-483434053);
         var14.al(var7, var8, var9, 767874989);
         var1.ah(var14, -2039374834);
         var14.ag(637150444);
      } catch (RuntimeException var13) {
         throw vk.ae(var13, "fo.au(" + ')');
      }
   }

   public void aa(int var1, fb var2, int var3, int var4) {
      qf var5 = gw.ae(1631437204);
      this.af(var5, var3, var2, var1, (byte)18);
      this.au(var5, var3, var2, var1, 1791843847);
      this.at(var5, var3, var2, var1, -1660053034);
      var2.ax(var5, 798277698);
      var5.ag(654541486);
   }

   public static fo al(po var0, po var1, int var2, boolean var3) {
      boolean var4 = true;
      byte[] var5 = var0.cf(var2 >> 16 & '\uffff', var2 & '\uffff', (byte)1);
      if (var5 == null) {
         var4 = false;
         return null;
      } else {
         int var6 = (var5[1] & 255) << 8 | var5[2] & 255;
         byte[] var7;
         if (var3) {
            var7 = var1.cf(0, var6, (byte)1);
         } else {
            var7 = var1.cf(var6, 0, (byte)1);
         }

         if (var7 == null) {
            var4 = false;
         }

         if (!var4) {
            return null;
         } else {
            if (null == tc.at) {
               af = Runtime.getRuntime().availableProcessors() * -2051265879;
               tc.at = new ThreadPoolExecutor(0, cc.af * 2126273862, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(-1533903634 + 746500936 * cc.af), new fq());
            }

            try {
               return new fo(var0, var1, var2, var3);
            } catch (Exception var9) {
               return null;
            }
         }
      }
   }

   void ad(vf var1, int var2) {
      var1.ct(-1435811194);
      var1.ct(-1887681544);
      this.ax = var1.cv(952452697) * -1517330569;
      int var3 = var1.ct(-2121024726);
      this.ag = new fr[this.am.ae(1192273691).ae((byte)1)][];
      this.ae = new fr[this.am.ac(-1633498611)][];
      fp[] var4 = new fp[var3];

      int var5;
      int var7;
      int var16;
      for(var5 = 0; var5 < var3; ++var5) {
         var7 = var1.cv(952452697);
         fg[] var8 = new fg[]{fg.ac, fg.ae, fg.ag, fg.am, fg.ax, fg.aq};
         fg var9 = (fg)ox.ac(var8, var7, 1316992599);
         if (null == var9) {
            var9 = fg.ac;
         }

         var16 = var1.ce(917432253);
         fu var10 = ft.aq(var1.cv(952452697), (byte)-52);
         fr var11 = new fr();
         var11.ac(var1, var2, 1640644039);
         var4[var5] = new fp(this, var11, var9, var10, var16);
         int var12 = var9.ax(1896788057);
         fr[][] var13;
         if (fg.ae == var9) {
            var13 = this.ag;
         } else {
            var13 = this.ae;
         }

         if (var13[var16] == null) {
            var13[var16] = new fr[var12];
         }

         if (fg.ax == var9) {
            this.aq = true;
         }
      }

      var5 = var3 / (cc.af * -77588071);
      int var6 = var3 % (cc.af * -1398157711);
      int var15 = 0;

      for(var16 = 0; var16 < 1895287633 * cc.af; ++var16) {
         var7 = var15;
         var15 += var5;
         if (var6 > 0) {
            ++var15;
            --var6;
         }

         if (var15 == var7) {
            break;
         }

         this.ar.add(tc.at.submit(new fj(this, var7, var15, var4)));
      }

   }

   public void as(int var1, fb var2, int var3, int var4) {
      qf var5 = gw.ae(1120117931);
      this.af(var5, var3, var2, var1, (byte)-31);
      this.au(var5, var3, var2, var1, 2125307224);
      this.at(var5, var3, var2, var1, -1098503120);
      var2.ax(var5, -1969480498);
      var5.ag(316028566);
   }

   public int ap() {
      return this.ax * -272291257;
   }

   public int ab() {
      return this.ax * -272291257;
   }

   static Object cx(int var0, int var1) {
      try {
         return kg.cj((ux)ox.ac(ux.ax(2071348894), var0, 1321413456), -1960008918);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "fo.cx(" + ')');
      }
   }

   public int ah() {
      return this.ax * 913159905;
   }

   void aw(qf var1, int var2, fb var3, int var4) {
      float[] var5 = var3.au(-272291257 * this.ax, 5452961);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.ag[var2]) {
         fr var9 = this.ag[var2][0];
         fr var10 = this.ag[var2][1];
         fr var11 = this.ag[var2][2];
         if (var9 != null) {
            var6 = var9.ag(var4, -763581755);
         }

         if (null != var10) {
            var7 = var10.ag(var4, -1277227066);
         }

         if (var11 != null) {
            var8 = var11.ag(var4, 354059409);
         }
      }

      qd var14 = gd.ac(-1442361155);
      var14.am(1.0F, 0.0F, 0.0F, var6, -1640622627);
      qd var15 = gd.ac(694018940);
      var15.am(0.0F, 1.0F, 0.0F, var7, 980109);
      qd var16 = gd.ac(-1219021045);
      var16.am(0.0F, 0.0F, 1.0F, var8, -1643042170);
      qd var12 = gd.ac(-894511791);
      var12.af(var16, (byte)11);
      var12.af(var14, (byte)29);
      var12.af(var15, (byte)22);
      qf var13 = gw.ae(968121120);
      var13.ab(var12, -1154227706);
      var1.ah(var13, -2055005647);
      var14.ae(-992901623);
      var15.ae(-1054553357);
      var16.ae(1160392239);
      var12.ae(1652631150);
      var13.ag(1463950412);
   }

   public static fo ar(po var0, po var1, int var2, boolean var3) {
      boolean var4 = true;
      byte[] var5 = var0.cf(var2 >> 16 & 1836244173, var2 & '\uffff', (byte)1);
      if (var5 == null) {
         var4 = false;
         return null;
      } else {
         int var6 = (var5[1] & 255) << 8 | var5[2] & 639330937;
         byte[] var7;
         if (var3) {
            var7 = var1.cf(0, var6, (byte)1);
         } else {
            var7 = var1.cf(var6, 0, (byte)1);
         }

         if (var7 == null) {
            var4 = false;
         }

         if (!var4) {
            return null;
         } else {
            if (null == tc.at) {
               af = Runtime.getRuntime().availableProcessors() * -1656349453;
               tc.at = new ThreadPoolExecutor(0, cc.af * -1222302404, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100 + 831127492 * cc.af), new fq());
            }

            try {
               return new fo(var0, var1, var2, var3);
            } catch (Exception var9) {
               return null;
            }
         }
      }
   }

   public boolean az() {
      return this.aq;
   }

   fo(po var1, po var2, int var3, boolean var4) {
      try {
         super();
         this.ae = (fr[][])null;
         this.ag = (fr[][])null;
         this.ax = 0;
         this.ac = 1706888147 * var3;
         byte[] var5 = var1.bt(this.ac * 1761379419 >> 16 & '\uffff', 1761379419 * this.ac & '\uffff', (byte)-86);
         vf var6 = new vf(var5);
         int var7 = var6.cv(952452697);
         int var8 = var6.ct(-1494247745);
         byte[] var9;
         if (var4) {
            var9 = var2.cf(0, var8, (byte)1);
         } else {
            var9 = var2.cf(var8, 0, (byte)1);
         }

         this.am = new jg(var8, var9);
         this.ar = new ArrayList();
         this.au = tc.at.submit(new fh(this, var6, var7));
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "fo.<init>(" + ')');
      }
   }

   void aj(qf var1, int var2, fb var3, int var4) {
      float[] var5 = var3.au(-272291257 * this.ax, 5452961);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.ag[var2]) {
         fr var9 = this.ag[var2][0];
         fr var10 = this.ag[var2][1];
         fr var11 = this.ag[var2][2];
         if (var9 != null) {
            var6 = var9.ag(var4, -320433047);
         }

         if (null != var10) {
            var7 = var10.ag(var4, -343948362);
         }

         if (var11 != null) {
            var8 = var11.ag(var4, -458503035);
         }
      }

      qd var14 = gd.ac(82584982);
      var14.am(1.0F, 0.0F, 0.0F, var6, -808620039);
      qd var15 = gd.ac(-1762813118);
      var15.am(0.0F, 1.0F, 0.0F, var7, 1207536021);
      qd var16 = gd.ac(293701009);
      var16.am(0.0F, 0.0F, 1.0F, var8, -1228500155);
      qd var12 = gd.ac(-338379086);
      var12.af(var16, (byte)90);
      var12.af(var14, (byte)43);
      var12.af(var15, (byte)49);
      qf var13 = gw.ae(1090754759);
      var13.ab(var12, 73318226);
      var1.ah(var13, -2118125443);
      var14.ae(2029734058);
      var15.ae(588837395);
      var16.ae(545897678);
      var12.ae(822505044);
      var13.ag(2014210076);
   }

   void av(qf var1, int var2, fb var3, int var4) {
      float[] var5 = var3.au(-897401825 * this.ax, 5452961);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.ag[var2]) {
         fr var9 = this.ag[var2][0];
         fr var10 = this.ag[var2][1];
         fr var11 = this.ag[var2][2];
         if (var9 != null) {
            var6 = var9.ag(var4, -1500775516);
         }

         if (null != var10) {
            var7 = var10.ag(var4, 968401378);
         }

         if (var11 != null) {
            var8 = var11.ag(var4, 514370122);
         }
      }

      qd var14 = gd.ac(1130647696);
      var14.am(1.0F, 0.0F, 0.0F, var6, -1718380279);
      qd var15 = gd.ac(1931758562);
      var15.am(0.0F, 1.0F, 0.0F, var7, 1102003840);
      qd var16 = gd.ac(-1664850826);
      var16.am(0.0F, 0.0F, 1.0F, var8, -570975446);
      qd var12 = gd.ac(1935613537);
      var12.af(var16, (byte)58);
      var12.af(var14, (byte)117);
      var12.af(var15, (byte)18);
      qf var13 = gw.ae(238624039);
      var13.ab(var12, -1290600015);
      var1.ah(var13, -2088630164);
      var14.ae(1579900624);
      var15.ae(651510262);
      var16.ae(-21528612);
      var12.ae(-1330680302);
      var13.ag(1637354596);
   }

   void ae(vf var1, int var2, int var3) {
      try {
         var1.ct(-1625052727);
         var1.ct(-1684156343);
         this.ax = var1.cv(952452697) * -1517330569;
         int var4 = var1.ct(-1444461893);
         this.ag = new fr[this.am.ae(333832686).ae((byte)1)][];
         this.ae = new fr[this.am.ac(-357610485)][];
         fp[] var5 = new fp[var4];

         int var6;
         int var8;
         int var18;
         for(var6 = 0; var6 < var4; ++var6) {
            var8 = var1.cv(952452697);
            fg[] var9 = new fg[]{fg.ac, fg.ae, fg.ag, fg.am, fg.ax, fg.aq};
            fg var10 = (fg)ox.ac(var9, var8, 1362876103);
            if (null == var10) {
               if (var3 >= 705410557) {
                  return;
               }

               var10 = fg.ac;
            }

            var18 = var1.ce(87968831);
            fu var11 = ft.aq(var1.cv(952452697), (byte)-109);
            fr var12 = new fr();
            var12.ac(var1, var2, -1566665919);
            var5[var6] = new fp(this, var12, var10, var11, var18);
            int var13 = var10.ax(-499919281);
            fr[][] var14;
            if (fg.ae == var10) {
               if (var3 >= 705410557) {
                  throw new IllegalStateException();
               }

               var14 = this.ag;
            } else {
               var14 = this.ae;
            }

            if (var14[var18] == null) {
               if (var3 >= 705410557) {
                  throw new IllegalStateException();
               }

               var14[var18] = new fr[var13];
            }

            if (fg.ax == var10) {
               if (var3 >= 705410557) {
                  throw new IllegalStateException();
               }

               this.aq = true;
            }
         }

         var6 = var4 / (cc.af * -77588071);
         int var7 = var4 % (cc.af * -77588071);
         int var17 = 0;

         for(var18 = 0; var18 < -77588071 * cc.af; ++var18) {
            var8 = var17;
            var17 += var6;
            if (var7 > 0) {
               if (var3 >= 705410557) {
                  throw new IllegalStateException();
               }

               ++var17;
               --var7;
            }

            if (var17 == var8) {
               if (var3 >= 705410557) {
                  return;
               }
               break;
            }

            this.ar.add(tc.at.submit(new fj(this, var8, var17, var5)));
         }

      } catch (RuntimeException var15) {
         throw vk.ae(var15, "fo.ae(" + ')');
      }
   }

   void an(qf var1, int var2, fb var3, int var4) {
      float[] var5 = var3.ar(-272291257 * this.ax, (byte)2);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.ag[var2]) {
         fr var9 = this.ag[var2][3];
         fr var10 = this.ag[var2][4];
         fr var11 = this.ag[var2][5];
         if (var9 != null) {
            var6 = var9.ag(var4, 88974022);
         }

         if (null != var10) {
            var7 = var10.ag(var4, -488012581);
         }

         if (var11 != null) {
            var8 = var11.ag(var4, -800829427);
         }
      }

      var1.ax[12] = var6;
      var1.ax[13] = var7;
      var1.ax[14] = var8;
   }

   void ak(qf var1, int var2, fb var3, int var4) {
      float[] var5 = var3.ar(657304108 * this.ax, (byte)2);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.ag[var2]) {
         fr var9 = this.ag[var2][3];
         fr var10 = this.ag[var2][4];
         fr var11 = this.ag[var2][5];
         if (var9 != null) {
            var6 = var9.ag(var4, 1267166075);
         }

         if (null != var10) {
            var7 = var10.ag(var4, 427500293);
         }

         if (var11 != null) {
            var8 = var11.ag(var4, 215557525);
         }
      }

      var1.ax[12] = var6;
      var1.ax[13] = var7;
      var1.ax[14] = var8;
   }

   void bn(qf var1, int var2, fb var3, int var4) {
      float[] var5 = var3.al(this.ax * -272291257, 1003006583);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.ag[var2] != null) {
         fr var9 = this.ag[var2][6];
         fr var10 = this.ag[var2][7];
         fr var11 = this.ag[var2][8];
         if (var9 != null) {
            var6 = var9.ag(var4, 453044056);
         }

         if (null != var10) {
            var7 = var10.ag(var4, 1379578291);
         }

         if (null != var11) {
            var8 = var11.ag(var4, 1405637489);
         }
      }

      qf var12 = gw.ae(464996141);
      var12.al(var6, var7, var8, 1932358667);
      var1.ah(var12, -2145286628);
      var12.ag(1984054781);
   }

   void bh(qf var1, int var2, fb var3, int var4) {
      float[] var5 = var3.al(this.ax * -272291257, 1003006583);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.ag[var2] != null) {
         fr var9 = this.ag[var2][6];
         fr var10 = this.ag[var2][7];
         fr var11 = this.ag[var2][8];
         if (var9 != null) {
            var6 = var9.ag(var4, -821087026);
         }

         if (null != var10) {
            var7 = var10.ag(var4, 865291288);
         }

         if (null != var11) {
            var8 = var11.ag(var4, 149114975);
         }
      }

      qf var12 = gw.ae(1239817992);
      var12.al(var6, var7, var8, 1596829459);
      var1.ah(var12, -2112736812);
      var12.ag(437523599);
   }

   void bd(qf var1, int var2, fb var3, int var4) {
      float[] var5 = var3.al(this.ax * -272291257, 1003006583);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.ag[var2] != null) {
         fr var9 = this.ag[var2][6];
         fr var10 = this.ag[var2][7];
         fr var11 = this.ag[var2][8];
         if (var9 != null) {
            var6 = var9.ag(var4, 1617219838);
         }

         if (null != var10) {
            var7 = var10.ag(var4, 1013238131);
         }

         if (null != var11) {
            var8 = var11.ag(var4, 849027661);
         }
      }

      qf var12 = gw.ae(-605427895);
      var12.al(var6, var7, var8, 522758730);
      var1.ah(var12, -2125647024);
      var12.ag(653623829);
   }

   static final void os(dj var0, boolean var1, int var2) {
      try {
         int var3 = -1883588565 * var0.ac;
         int var4 = (int)var0.hk;
         var0.jb();
         if (var1) {
            if (var2 != 1775184496) {
               throw new IllegalStateException();
            }

            ir.ep.am(var3, (byte)127);
         }

         for(th var5 = (th)client.rh.am(); var5 != null; var5 = (th)client.rh.ax()) {
            if (var2 != 1775184496) {
               throw new IllegalStateException();
            }

            if ((long)var3 == (var5.hk >> 48 & 65535L)) {
               if (var2 != 1775184496) {
                  throw new IllegalStateException();
               }

               var5.jb();
            }
         }

         ny var7 = ir.ep.ac(var4, -1486822940);
         if (null != var7) {
            dc.ni(var7, 667850230);
         }

         if (250910895 * client.ok != -1) {
            if (var2 != 1775184496) {
               throw new IllegalStateException();
            }

            fd.nh(client.ok * 250910895, 1, 1907706354);
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "fo.os(" + ')');
      }
   }

   void ay(qf var1, int var2, fb var3, int var4) {
      float[] var5 = var3.au(-272291257 * this.ax, 5452961);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (null != this.ag[var2]) {
         fr var9 = this.ag[var2][0];
         fr var10 = this.ag[var2][1];
         fr var11 = this.ag[var2][2];
         if (var9 != null) {
            var6 = var9.ag(var4, 49392068);
         }

         if (null != var10) {
            var7 = var10.ag(var4, 1395436127);
         }

         if (var11 != null) {
            var8 = var11.ag(var4, -55995818);
         }
      }

      qd var14 = gd.ac(-1102957890);
      var14.am(1.0F, 0.0F, 0.0F, var6, -758757646);
      qd var15 = gd.ac(-1603616553);
      var15.am(0.0F, 1.0F, 0.0F, var7, -1778456563);
      qd var16 = gd.ac(1456016581);
      var16.am(0.0F, 0.0F, 1.0F, var8, -2027369242);
      qd var12 = gd.ac(-363811401);
      var12.af(var16, (byte)44);
      var12.af(var14, (byte)119);
      var12.af(var15, (byte)96);
      qf var13 = gw.ae(-115036053);
      var13.ab(var12, 992107330);
      var1.ah(var13, -2077531867);
      var14.ae(-1205330420);
      var15.ae(355994746);
      var16.ae(-776404651);
      var12.ae(-124466689);
      var13.ag(1312777228);
   }

   public static long ac(CharSequence var0, int var1) {
      try {
         long var2 = 0L;
         int var4 = var0.length();

         for(int var5 = 0; var5 < var4; ++var5) {
            if (var1 >= 739574681) {
               throw new IllegalStateException();
            }

            label93: {
               var2 *= 37L;
               char var6 = var0.charAt(var5);
               if (var6 >= 'A') {
                  if (var1 >= 739574681) {
                     throw new IllegalStateException();
                  }

                  if (var6 <= 'Z') {
                     if (var1 >= 739574681) {
                        throw new IllegalStateException();
                     }

                     var2 += (long)(1 + var6 - 65);
                     break label93;
                  }
               }

               if (var6 >= 'a' && var6 <= 'z') {
                  if (var1 >= 739574681) {
                     throw new IllegalStateException();
                  }

                  var2 += (long)(var6 + 1 - 97);
               } else if (var6 >= '0') {
                  if (var1 >= 739574681) {
                     throw new IllegalStateException();
                  }

                  if (var6 <= '9') {
                     if (var1 >= 739574681) {
                        throw new IllegalStateException();
                     }

                     var2 += (long)(27 + var6 - 48);
                  }
               }
            }

            if (var2 >= 177917621779460413L) {
               if (var1 >= 739574681) {
                  throw new IllegalStateException();
               }
               break;
            }
         }

         while(var2 % 37L == 0L) {
            if (var1 >= 739574681) {
               throw new IllegalStateException();
            }

            if (0L == var2) {
               break;
            }

            if (var1 >= 739574681) {
               throw new IllegalStateException();
            }

            var2 /= 37L;
         }

         return var2;
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "fo.ac(" + ')');
      }
   }
}
