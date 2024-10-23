import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class di {
   static final int aw = 10;
   final Map ag;
   int an;
   boolean ay;
   boolean as;
   boolean ae;
   int am;
   double at;
   int au;
   static final int ap = 11;
   int ao;
   int af;
   boolean ai;
   int ab;
   int az;
   String ar;
   static pe ak;
   static int uj;

   int ce() {
      return -1302559305 * this.am;
   }

   di(vl var1) {
      try {
         super();
         this.ay = false;
         this.ae = false;
         this.at = 0.8D;
         this.au = -1342066809;
         this.an = 87433065;
         this.ao = -1777764443;
         this.af = -1039915731;
         this.ar = null;
         this.ab = 1904926949;
         this.az = -300392157;
         this.ag = new LinkedHashMap();
         if (var1 != null && null != var1.ae) {
            int var2 = var1.cy((short)-7065);
            if (var2 >= 0 && var2 <= 11) {
               if (var1.cy((short)-22023) == 1) {
                  this.ai = true;
               }

               if (var2 > 1) {
                  this.as = var1.cy((short)-1934) == 1;
               }

               if (var2 > 3) {
                  this.ab = var1.cy((short)-32692) * 1904926949;
               }

               if (var2 > 2) {
                  int var3 = var1.cy((short)-7943);

                  for(int var4 = 0; var4 < var3; ++var4) {
                     int var5 = var1.ch(1203709469);
                     int var6 = var1.ch(1203709469);
                     this.ag.put(var5, var6);
                  }
               }

               if (var2 > 4) {
                  this.ar = var1.cm(-371531710);
               }

               if (var2 > 5) {
                  this.ay = var1.cj((byte)0);
               }

               if (var2 > 6) {
                  this.at = (double)var1.cy((short)-356) / 100.0D;
                  this.au = var1.cy((short)-6527) * -2107323143;
                  this.an = var1.cy((short)-30402) * 1522527255;
                  this.ao = var1.cy((short)-22847) * -1028557349;
               }

               if (var2 > 7) {
                  this.af = var1.cy((short)-897) * 1039915731;
               }

               if (var2 > 8) {
                  this.ae = var1.cy((short)-2740) == 1;
               }

               if (var2 > 9) {
                  this.am = var1.ch(1203709469) * 805988359;
               }

               if (var2 > 10) {
                  this.az = var1.cy((short)-20397) * -1386405221;
               }
            } else {
               this.ap(true, (byte)-46);
            }
         } else {
            this.ap(true, (byte)-34);
         }

      } catch (RuntimeException var7) {
         throw tm.aw(var7, "di.<init>(" + ')');
      }
   }

   void ap(boolean var1, byte var2) {
      try {
         ;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "di.ap(" + ')');
      }
   }

   vl aw(short var1) {
      try {
         vl var2 = new vl(418, true);
         var2.bo(11, 893075226);
         byte var10001;
         if (this.ai) {
            if (var1 != 4100) {
               throw new IllegalStateException();
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         var2.bo(var10001, -830179609);
         if (this.as) {
            if (var1 != 4100) {
               throw new IllegalStateException();
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         var2.bo(var10001, 1815985243);
         var2.bo(922082541 * this.ab, -1027240238);
         var2.bo(this.ag.size(), -832008449);
         Iterator var3 = this.ag.entrySet().iterator();

         while(var3.hasNext()) {
            Entry var4 = (Entry)var3.next();
            var2.bw((Integer)var4.getKey(), (byte)122);
            var2.bw((Integer)var4.getValue(), (byte)21);
         }

         var2.be(null != this.ar ? this.ar : "", (byte)22);
         var2.bg(this.ay, 1445337563);
         var2.bo((int)(this.at * 100.0D), -575156359);
         var2.bo(this.au * -1209911991, -1301557022);
         var2.bo(-1600648281 * this.an, -668622060);
         var2.bo(-739279277 * this.ao, -2069889713);
         var2.bo(this.af * -1839100581, 300803742);
         var2.bo(this.ae ? 1 : 0, 1612218573);
         var2.bw(this.am * -1302559305, (byte)94);
         var2.bo(-138087533 * this.az, -724416451);
         return var2;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "di.aw(" + ')');
      }
   }

   void aj(boolean var1, int var2) {
      try {
         this.ai = var1;
         ok.ak(1940829516);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "di.aj(" + ')');
      }
   }

   boolean ai(int var1) {
      try {
         return this.ai;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "di.ai(" + ')');
      }
   }

   void er(String var1, int var2) {
      int var3 = this.bb(var1, 1708681972);
      if (this.ag.size() >= 10 && !this.ag.containsKey(var3)) {
         Iterator var4 = this.ag.entrySet().iterator();
         var4.next();
         var4.remove();
      }

      this.ag.put(var3, var2);
      ok.ak(1955922352);
   }

   void cf(boolean var1) {
      this.ae = var1;
      ok.ak(2025650544);
   }

   void ae(boolean var1, int var2) {
      try {
         this.as = var1;
         ok.ak(2020600027);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "di.ae(" + ')');
      }
   }

   boolean cb() {
      return this.as;
   }

   void at(boolean var1, int var2) {
      try {
         this.ae = var1;
         ok.ak(1997524574);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "di.at(" + ')');
      }
   }

   int dn() {
      return 712865077 * this.af;
   }

   int eu() {
      return this.az * 1760760812;
   }

   void ao(int var1, int var2) {
      try {
         this.am = 805988359 * var1;
         ok.ak(1982172237);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "di.ao(" + ')');
      }
   }

   int dm() {
      return -1600648281 * this.an;
   }

   void ar(double var1) {
      try {
         this.at = var1;
         ok.ak(1947953444);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "di.ar(" + ')');
      }
   }

   double ab(byte var1) {
      try {
         return this.at;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "di.ab(" + ')');
      }
   }

   void bh(int var1, byte var2) {
      try {
         this.ab = var1 * 1904926949;
         ok.ak(1893395944);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "di.bh(" + ')');
      }
   }

   int ag(byte var1) {
      try {
         return -1209911991 * this.au;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "di.ag(" + ')');
      }
   }

   void ad(int var1, byte var2) {
      try {
         this.an = var1 * 1522527255;
         ok.ak(2127081346);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "di.ad(" + ')');
      }
   }

   int ac(int var1) {
      try {
         return -1600648281 * this.an;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "di.ac(" + ')');
      }
   }

   void cr(int var1) {
      this.au = var1 * -2107323143;
      ok.ak(1950405790);
   }

   int ax(int var1) {
      try {
         return this.ao * -739279277;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "di.ax(" + ')');
      }
   }

   void dq(int var1) {
      this.au = var1 * -2107323143;
      ok.ak(1972287115);
   }

   String al(int var1) {
      try {
         return this.ar;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "di.al(" + ')');
      }
   }

   void aa(int var1, int var2) {
      try {
         this.af = 1039915731 * var1;
         ok.ak(1939986138);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "di.aa(" + ')');
      }
   }

   void bq(int var1, int var2) {
      try {
         this.az = var1 * -1386405221;
         ne.gz((byte)0);
         ok.ak(2017134066);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "di.bq(" + ')');
      }
   }

   void ay(boolean var1, int var2) {
      try {
         this.ay = var1;
         ok.ak(1919284372);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "di.ay(" + ')');
      }
   }

   int bj(int var1) {
      try {
         return 922082541 * this.ab;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "di.bj(" + ')');
      }
   }

   void bv(String var1, int var2, int var3) {
      try {
         int var4 = this.bb(var1, 2012135686);
         if (this.ag.size() >= 10) {
            if (var3 != -1863408886) {
               throw new IllegalStateException();
            }

            if (!this.ag.containsKey(var4)) {
               if (var3 != -1863408886) {
                  throw new IllegalStateException();
               }

               Iterator var5 = this.ag.entrySet().iterator();
               var5.next();
               var5.remove();
            }
         }

         this.ag.put(var4, var2);
         ok.ak(1972657359);
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "di.bv(" + ')');
      }
   }

   boolean bx(String var1, int var2) {
      try {
         int var3 = this.bb(var1, 2011691921);
         return this.ag.containsKey(var3);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "di.bx(" + ')');
      }
   }

   int bk(String var1, byte var2) {
      try {
         int var3 = this.bb(var1, 1702869376);
         return !this.ag.containsKey(var3) ? 0 : (Integer)this.ag.get(var3);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "di.bk(" + ')');
      }
   }

   int bb(String var1, int var2) {
      try {
         return ok.at(var1.toLowerCase(), (byte)-48);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "di.bb(" + ')');
      }
   }

   di() {
      try {
         super();
         this.ay = false;
         this.ae = false;
         this.at = 0.8D;
         this.au = -1342066809;
         this.an = 87433065;
         this.ao = -1777764443;
         this.af = -1039915731;
         this.ar = null;
         this.ab = 1904926949;
         this.az = -300392157;
         this.ag = new LinkedHashMap();
         this.ap(true, (byte)-8);
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "di.<init>(" + ')');
      }
   }

   int ez() {
      return 922082541 * this.ab;
   }

   void bz(boolean var1) {
   }

   void ei(int var1) {
      this.az = var1 * -1386405221;
      ne.gz((byte)0);
      ok.ak(1999974511);
   }

   void by(boolean var1) {
   }

   vl br() {
      vl var1 = new vl(418, true);
      var1.bo(11, 18354108);
      var1.bo(this.ai ? 1 : 0, -1070421603);
      var1.bo(this.as ? 1 : 0, 1670485332);
      var1.bo(922082541 * this.ab, -1663895868);
      var1.bo(this.ag.size(), -82950432);
      Iterator var2 = this.ag.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.bw((Integer)var3.getKey(), (byte)17);
         var1.bw((Integer)var3.getValue(), (byte)75);
      }

      var1.be(null != this.ar ? this.ar : "", (byte)80);
      var1.bg(this.ay, 1445337563);
      var1.bo((int)(this.at * 100.0D), 476588314);
      var1.bo(this.au * -1209911991, -1122852701);
      var1.bo(-1600648281 * this.an, -1593822024);
      var1.bo(-739279277 * this.ao, -321008163);
      var1.bo(this.af * -1839100581, 353128638);
      var1.bo(this.ae ? 1 : 0, 115415920);
      var1.bw(this.am * -1302559305, (byte)27);
      var1.bo(-138087533 * this.az, -1800409015);
      return var1;
   }

   vl bn() {
      vl var1 = new vl(418, true);
      var1.bo(11, 1340686384);
      var1.bo(this.ai ? 1 : 0, 146546547);
      var1.bo(this.as ? 1 : 0, 1755074582);
      var1.bo(922082541 * this.ab, -1929044073);
      var1.bo(this.ag.size(), -1527434837);
      Iterator var2 = this.ag.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.bw((Integer)var3.getKey(), (byte)94);
         var1.bw((Integer)var3.getValue(), (byte)100);
      }

      var1.be(null != this.ar ? this.ar : "", (byte)79);
      var1.bg(this.ay, 1445337563);
      var1.bo((int)(this.at * 100.0D), -672633877);
      var1.bo(this.au * -1209911991, 1469025902);
      var1.bo(-1600648281 * this.an, -1765514451);
      var1.bo(-739279277 * this.ao, 435552901);
      var1.bo(this.af * -1839100581, -1619717577);
      var1.bo(this.ae ? 1 : 0, 485539195);
      var1.bw(this.am * -1302559305, (byte)24);
      var1.bo(-138087533 * this.az, 40068669);
      return var1;
   }

   vl bu() {
      vl var1 = new vl(418, true);
      var1.bo(11, -86577639);
      var1.bo(this.ai ? 1 : 0, 1444660552);
      var1.bo(this.as ? 1 : 0, -1985495215);
      var1.bo(922082541 * this.ab, -1750718353);
      var1.bo(this.ag.size(), -652681456);
      Iterator var2 = this.ag.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.bw((Integer)var3.getKey(), (byte)81);
         var1.bw((Integer)var3.getValue(), (byte)126);
      }

      var1.be(null != this.ar ? this.ar : "", (byte)117);
      var1.bg(this.ay, 1445337563);
      var1.bo((int)(this.at * 100.0D), -664383561);
      var1.bo(this.au * -1209911991, -397733392);
      var1.bo(-1600648281 * this.an, 1821313649);
      var1.bo(-739279277 * this.ao, -1593220249);
      var1.bo(this.af * -1839100581, 572705013);
      var1.bo(this.ae ? 1 : 0, -1183338276);
      var1.bw(this.am * -1302559305, (byte)93);
      var1.bo(-138087533 * this.az, -1799771498);
      return var1;
   }

   vl bt() {
      vl var1 = new vl(418, true);
      var1.bo(11, 447469240);
      var1.bo(this.ai ? 1 : 0, -97087110);
      var1.bo(this.as ? 1 : 0, -1439015180);
      var1.bo(922082541 * this.ab, 1228621082);
      var1.bo(this.ag.size(), -1831065110);
      Iterator var2 = this.ag.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         var1.bw((Integer)var3.getKey(), (byte)106);
         var1.bw((Integer)var3.getValue(), (byte)123);
      }

      var1.be(null != this.ar ? this.ar : "", (byte)8);
      var1.bg(this.ay, 1445337563);
      var1.bo((int)(this.at * 100.0D), -997259698);
      var1.bo(this.au * -1209911991, 1972159721);
      var1.bo(-1600648281 * this.an, 494064431);
      var1.bo(-739279277 * this.ao, 1135638228);
      var1.bo(this.af * -1839100581, 1724466319);
      var1.bo(this.ae ? 1 : 0, 1763484392);
      var1.bw(this.am * -1302559305, (byte)64);
      var1.bo(-138087533 * this.az, 1740324648);
      return var1;
   }

   static void bs() {
      un var0 = null;

      try {
         var0 = rr.ak("", lu.cn.as, true, (byte)-69);
         vl var1 = io.vx.aw((short)4100);
         var0.aw(var1.ae, 0, var1.am * 809290736, -701218401);
      } catch (Exception var3) {
      }

      try {
         if (null != var0) {
            var0.aj(true, (byte)54);
         }
      } catch (Exception var2) {
      }

   }

   void bm(boolean var1) {
      this.ai = var1;
      ok.ak(2103511651);
   }

   double ct() {
      return this.at;
   }

   void cq(boolean var1) {
      this.as = var1;
      ok.ak(2073070882);
   }

   void bc(boolean var1) {
   }

   boolean bw() {
      return this.ai;
   }

   void bi(boolean var1) {
      this.ay = var1;
      ok.ak(1926736700);
   }

   void bf(boolean var1) {
      this.ay = var1;
      ok.ak(1991732514);
   }

   boolean as(int var1) {
      try {
         return this.ay;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "di.as(" + ')');
      }
   }

   boolean bl() {
      return this.ay;
   }

   boolean be() {
      return this.ay;
   }

   int ey() {
      return 922082541 * this.ab;
   }

   int bp(byte var1) {
      try {
         return this.az * -138087533;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "di.bp(" + ')');
      }
   }

   boolean cd() {
      return this.as;
   }

   boolean ci() {
      return this.as;
   }

   boolean an(int var1) {
      try {
         return this.ae;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "di.an(" + ')');
      }
   }

   int dv() {
      return this.ao * -739279277;
   }

   void aq(String var1, int var2) {
      try {
         this.ar = var1;
         ok.ak(1956779899);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "di.aq(" + ')');
      }
   }

   void cl(boolean var1) {
      this.ae = var1;
      ok.ak(1946958591);
   }

   void cp() {
      this.at(!this.ae, 483628345);
   }

   void cv() {
      this.at(!this.ae, 1425800587);
   }

   boolean cy() {
      return this.ae;
   }

   int cu() {
      return -1302559305 * this.am;
   }

   boolean ba() {
      return this.ai;
   }

   int cg() {
      return -1302559305 * this.am;
   }

   void ch(double var1) {
      this.at = var1;
      ok.ak(2122429520);
   }

   void cz(double var1) {
      this.at = var1;
      ok.ak(1984704943);
   }

   int dd() {
      return -1209911991 * this.au;
   }

   double cw() {
      return this.at;
   }

   double cc() {
      return this.at;
   }

   double cj() {
      return this.at;
   }

   double cm() {
      return this.at;
   }

   boolean bd() {
      return this.ai;
   }

   void ca(int var1) {
      this.au = var1 * -2107323143;
      ok.ak(2098412608);
   }

   void cs(int var1) {
      this.au = var1 * 1423057729;
      ok.ak(1874470319);
   }

   void az(int var1, int var2) {
      try {
         this.au = var1 * -2107323143;
         ok.ak(2052671517);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "di.az(" + ')');
      }
   }

   int ah(int var1) {
      try {
         return -1839100581 * this.af;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "di.ah(" + ')');
      }
   }

   void dg(int var1) {
      this.an = var1 * 1522527255;
      ok.ak(2124752494);
   }

   void dh(int var1) {
      this.an = var1 * 1522527255;
      ok.ak(2032480823);
   }

   int dc() {
      return -1209911991 * this.au;
   }

   int da() {
      return -1209911991 * this.au;
   }

   boolean am(int var1) {
      try {
         return this.as;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "di.am(" + ')');
      }
   }

   void av(int var1, int var2) {
      try {
         this.ao = var1 * -1028557349;
         ok.ak(2105633478);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "di.av(" + ')');
      }
   }

   void du(int var1) {
      this.an = var1 * 1522527255;
      ok.ak(1911938822);
   }

   void df(int var1) {
      this.an = var1 * -1796779661;
      ok.ak(1948951232);
   }

   void au(int var1) {
      try {
         boolean var10001;
         if (!this.ae) {
            if (var1 == 305188491) {
               return;
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.at(var10001, 1828090202);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "di.au(" + ')');
      }
   }

   int dk() {
      return 908406635 * this.an;
   }

   int dl() {
      return -1600648281 * this.an;
   }

   int eg() {
      return -1839100581 * this.af;
   }

   int dt() {
      return -1600648281 * this.an;
   }

   void dx(int var1) {
      this.ao = var1 * 828591272;
      ok.ak(1945901358);
   }

   void dp(String var1) {
      this.ar = var1;
      ok.ak(1905774238);
   }

   int db() {
      return this.ao * 1344322306;
   }

   void ds(int var1) {
      this.ao = var1 * -1028557349;
      ok.ak(2066136466);
   }

   void dj(String var1) {
      this.ar = var1;
      ok.ak(1895924402);
   }

   void bo(boolean var1) {
      this.ai = var1;
      ok.ak(2081487716);
   }

   void dy(String var1) {
      this.ar = var1;
      ok.ak(2028275529);
   }

   void do(String var1) {
      this.ar = var1;
      ok.ak(1934489144);
   }

   String dw() {
      return this.ar;
   }

   void de(int var1) {
      this.af = 1039915731 * var1;
      ok.ak(1941516591);
   }

   void dz(int var1) {
      this.af = 1039915731 * var1;
      ok.ak(2011924663);
   }

   int di() {
      return -550308492 * this.af;
   }

   void cn(boolean var1) {
      this.ae = var1;
      ok.ak(2126866474);
   }

   boolean bg() {
      return this.ay;
   }

   void ev(int var1) {
      this.ab = var1 * 1904926949;
      ok.ak(2100282891);
   }

   void cx(double var1) {
      this.at = var1;
      ok.ak(1999196131);
   }

   void co(boolean var1) {
      this.ae = var1;
      ok.ak(1874074305);
   }

   int ep(String var1) {
      return ok.at(var1.toLowerCase(), (byte)-48);
   }

   int ec() {
      return 33611768 * this.ab;
   }

   void ek(String var1, int var2) {
      int var3 = this.bb(var1, 1879580449);
      if (this.ag.size() >= 10 && !this.ag.containsKey(var3)) {
         Iterator var4 = this.ag.entrySet().iterator();
         var4.next();
         var4.remove();
      }

      this.ag.put(var3, var2);
      ok.ak(1878099652);
   }

   int af(int var1) {
      try {
         return -1302559305 * this.am;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "di.af(" + ')');
      }
   }

   void en(String var1, int var2) {
      int var3 = this.bb(var1, 2079476239);
      if (this.ag.size() >= 10 && !this.ag.containsKey(var3)) {
         Iterator var4 = this.ag.entrySet().iterator();
         var4.next();
         var4.remove();
      }

      this.ag.put(var3, var2);
      ok.ak(1937598204);
   }

   boolean ef(String var1) {
      int var2 = this.bb(var1, 1892250173);
      return this.ag.containsKey(var2);
   }

   int em(String var1) {
      int var2 = this.bb(var1, 2142474244);
      return !this.ag.containsKey(var2) ? 0 : (Integer)this.ag.get(var2);
   }

   int el(String var1) {
      int var2 = this.bb(var1, 1738966219);
      return !this.ag.containsKey(var2) ? 0 : (Integer)this.ag.get(var2);
   }

   int ed(String var1) {
      int var2 = this.bb(var1, 1790772755);
      return !this.ag.containsKey(var2) ? 0 : (Integer)this.ag.get(var2);
   }

   void eh(int var1) {
      this.ab = var1 * 1904926949;
      ok.ak(1912534694);
   }

   int ex(String var1) {
      return ok.at(var1.toLowerCase(), (byte)-107);
   }

   int ej(String var1) {
      return ok.at(var1.toLowerCase(), (byte)-114);
   }

   void ck(int var1) {
      this.au = var1 * -2107323143;
      ok.ak(2063737827);
   }

   void ew(int var1) {
      this.az = var1 * -1386405221;
      ne.gz((byte)0);
      ok.ak(2030531508);
   }

   int dr() {
      return -1209911991 * this.au;
   }

   static boolean jj(int var0) {
      try {
         boolean var10000;
         if ((client.ni * -852470597 & 8) != 0) {
            if (var0 != 1143643618) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "di.jj(" + ')');
      }
   }

   public static int ay(int var0, int var1) {
      try {
         --var0;
         var0 |= var0 >>> 1;
         var0 |= var0 >>> 2;
         var0 |= var0 >>> 4;
         var0 |= var0 >>> 8;
         var0 |= var0 >>> 16;
         return var0 + 1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "di.ay(" + ')');
      }
   }
}
