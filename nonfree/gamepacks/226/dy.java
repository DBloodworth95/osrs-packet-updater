import java.util.HashMap;
import java.util.Iterator;

public class dy implements Iterable {
   sx ay;
   final um aw;
   dn ap;
   final HashMap aj;
   int ak;
   static final int bz = 9;
   sf as;
   final HashMap ai;
   static final String hn = "jagex.disableBouncyCastle";

   sx bv(int var1) {
      sx var2 = (sx)this.aj.get(var1);
      return var2 != null ? var2 : this.ay;
   }

   dn ap(int var1, int var2, int var3, int var4) {
      try {
         this.ap = this.aw(-1, var1, var2, var3, im.ap, 941942769);
         return this.ap;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "dy.ap(" + ')');
      }
   }

   public dn ad() {
      return this.ap;
   }

   public Iterator bq() {
      return this.aw.iterator();
   }

   public dn aj(int var1) {
      try {
         return this.ap;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dy.aj(" + ')');
      }
   }

   int ai(int var1) {
      try {
         return this.ak * 884311629;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dy.ai(" + ')');
      }
   }

   void ay(sx var1, sf var2, int var3) {
      try {
         this.ay = var1;
         this.as = var2;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "dy.ay(" + ')');
      }
   }

   void as(int var1, sx var2, sf var3, byte var4) {
      try {
         this.aj.put(var1, var2);
         this.ai.put(var1, var3);
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "dy.as(" + ')');
      }
   }

   public dn ag() {
      return this.ap;
   }

   sx am(int var1, byte var2) {
      try {
         sx var3 = (sx)this.aj.get(var1);
         sx var10000;
         if (var3 != null) {
            if (var2 != 7) {
               throw new IllegalStateException();
            }

            var10000 = var3;
         } else {
            var10000 = this.ay;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "dy.am(" + ')');
      }
   }

   sf at(int var1, byte var2) {
      try {
         sf var3 = (sf)this.ai.get(var1);
         sf var10000;
         if (var3 != null) {
            if (var2 == 57) {
               throw new IllegalStateException();
            }

            var10000 = var3;
         } else {
            var10000 = this.as;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "dy.at(" + ')');
      }
   }

   public Iterator iterator() {
      try {
         return this.aw.iterator();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "dy.iterator(" + ')');
      }
   }

   void au(int var1) {
      try {
         this.aw.ak();
         this.ak = 0;
         this.aj.clear();
         this.ai.clear();
         this.ay = sx.aw;
         this.as = sf.aw;
         if (this.ap != null) {
            this.ap.ap((short)-8454);
            this.aw.aw(this.ap, -1L);
            this.ak = -1933106555;
         }

      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dy.au(" + ')');
      }
   }

   dn an(int var1, int var2, int var3) {
      this.ap = this.aw(-1, var1, var2, var3, im.ap, -1207969688);
      return this.ap;
   }

   dn ao(int var1, int var2, int var3) {
      this.ap = this.aw(-1, var1, var2, var3, im.ap, 437373684);
      return this.ap;
   }

   sf bb(int var1) {
      sf var2 = (sf)this.ai.get(var1);
      return var2 != null ? var2 : this.as;
   }

   int ax() {
      return this.ak * 884311629;
   }

   dn ab(int var1, int var2, int var3, int var4, im var5) {
      dn var6 = new dn(var1, var2, var3, var4, var5);
      this.aw.aw(var6, (long)var1);
      this.ak += 598188240;
      return var6;
   }

   void az(dn var1) {
      if (null != var1) {
         this.aj.remove(-1447360644 * var1.ap);
         this.ai.remove(var1.ap * -1948824391);
         var1.kf();
         this.ak -= -1933106555;
      }

   }

   dn aw(int var1, int var2, int var3, int var4, im var5, int var6) {
      try {
         dn var7 = new dn(var1, var2, var3, var4, var5);
         this.aw.aw(var7, (long)var1);
         this.ak += -1933106555;
         return var7;
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "dy.aw(" + ')');
      }
   }

   public Iterator bp() {
      return this.aw.iterator();
   }

   dy() {
      try {
         super();
         this.aw = new um(16);
         this.ak = 0;
         this.aj = new HashMap(16);
         this.ai = new HashMap(16);
         this.ay = sx.aw;
         this.as = sf.aw;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "dy.<init>(" + ')');
      }
   }

   int av() {
      return this.ak * 884311629;
   }

   dn af(int var1, int var2, int var3, int var4, im var5) {
      dn var6 = new dn(var1, var2, var3, var4, var5);
      this.aw.aw(var6, (long)var1);
      this.ak += -1933106555;
      return var6;
   }

   void aq(int var1, sx var2, sf var3) {
      this.aj.put(var1, var2);
      this.ai.put(var1, var3);
   }

   void al(int var1, sx var2, sf var3) {
      this.aj.put(var1, var2);
      this.ai.put(var1, var3);
   }

   void aa(int var1, sx var2, sf var3) {
      this.aj.put(var1, var2);
      this.ai.put(var1, var3);
   }

   void ah(int var1) {
      this.aj.remove(var1);
      this.ai.remove(var1);
   }

   void bh(int var1) {
      this.aj.remove(var1);
      this.ai.remove(var1);
   }

   dn ar(int var1, int var2, int var3, int var4, im var5) {
      dn var6 = new dn(var1, var2, var3, var4, var5);
      this.aw.aw(var6, (long)var1);
      this.ak += 159032018;
      return var6;
   }

   sx bj(int var1) {
      sx var2 = (sx)this.aj.get(var1);
      return var2 != null ? var2 : this.ay;
   }

   sf bx(int var1) {
      sf var2 = (sf)this.ai.get(var1);
      return var2 != null ? var2 : this.as;
   }

   sf bk(int var1) {
      sf var2 = (sf)this.ai.get(var1);
      return var2 != null ? var2 : this.as;
   }

   int ac() {
      return this.ak * 884311629;
   }

   public Iterator bz() {
      return this.aw.iterator();
   }

   static int aw(byte var0) {
      try {
         return bv.du.length;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "dy.aw(" + ')');
      }
   }

   void ak(dn var1, int var2) {
      try {
         if (null != var1) {
            if (var2 <= 761304653) {
               throw new IllegalStateException();
            }

            this.aj.remove(-1948824391 * var1.ap);
            this.ai.remove(var1.ap * -1948824391);
            var1.kf();
            this.ak -= -1933106555;
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "dy.ak(" + ')');
      }
   }

   void ae(int var1, byte var2) {
      try {
         this.aj.remove(var1);
         this.ai.remove(var1);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "dy.ae(" + ')');
      }
   }
}
