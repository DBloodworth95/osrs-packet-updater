import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class sz {
   static vc ar;
   int at;
   se[] au;
   HashMap an;
   HashMap ao;
   final int am;
   Comparator af;

   se cx(wx var1) {
      return !var1.ak(-335540796) ? null : (se)this.ao.get(var1);
   }

   public se cv(wx var1) {
      se var2 = this.bc(var1, (byte)9);
      return null != var2 ? var2 : this.by(var1, -1869288288);
   }

   public int bb(byte var1) {
      try {
         return 40009885 * this.at;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "sz.bb(" + ')');
      }
   }

   public boolean bq(byte var1) {
      try {
         boolean var10000;
         if (this.am * -1108690839 == 40009885 * this.at) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "sz.bq(" + ')');
      }
   }

   public boolean bp(wx var1, int var2) {
      try {
         if (!var1.ak(-1285001513)) {
            if (var2 == -2137273536) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (this.an.containsKey(var1)) {
            if (var2 == -2137273536) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            return this.ao.containsKey(var1);
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "sz.bp(" + ')');
      }
   }

   public se bz(wx var1, int var2) {
      try {
         se var3 = this.bc(var1, (byte)-66);
         if (null != var3) {
            if (var2 != -1235505935) {
               throw new IllegalStateException();
            } else {
               return var3;
            }
         } else {
            return this.by(var1, -2002683332);
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "sz.bz(" + ')');
      }
   }

   se bc(wx var1, byte var2) {
      try {
         return !var1.ak(-1215402649) ? null : (se)this.an.get(var1);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "sz.bc(" + ')');
      }
   }

   se by(wx var1, int var2) {
      try {
         return !var1.ak(-443834652) ? null : (se)this.ao.get(var1);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "sz.by(" + ')');
      }
   }

   public final boolean br(wx var1, int var2) {
      try {
         se var3 = this.bc(var1, (byte)-1);
         if (null == var3) {
            if (var2 >= 885036904) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            this.bn(var3, -1888513803);
            return true;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "sz.br(" + ')');
      }
   }

   final void bn(se var1, int var2) {
      try {
         int var3 = this.bd(var1, (byte)0);
         if (-1 == var3) {
            if (var2 < -1521104462) {
               ;
            }
         } else {
            this.bf(var3, (byte)81);
            this.ba(var1, (byte)13);
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "sz.bn(" + ')');
      }
   }

   se bu(wx var1, int var2) {
      try {
         return this.bt(var1, (wx)null, (short)23543);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "sz.bu(" + ')');
      }
   }

   se bt(wx var1, wx var2, short var3) {
      try {
         if (this.bc(var1, (byte)-93) != null) {
            if (var3 <= 4011) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException();
            }
         } else {
            se var4 = this.ap(-807171089);
            var4.bj(var1, var2, -1161676396);
            this.bw(var4, 654321447);
            this.bi(var4, (byte)1);
            return var4;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "sz.bt(" + ')');
      }
   }

   public final se bs(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 == -1657352077) {
               throw new IllegalStateException();
            }

            if (var1 < this.at * 40009885) {
               return this.au[var1];
            }

            if (var2 == -1657352077) {
               throw new IllegalStateException();
            }
         }

         throw new ArrayIndexOutOfBoundsException(var1);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "sz.bs(" + ')');
      }
   }

   public final void bm(byte var1) {
      try {
         if (this.af == null) {
            Arrays.sort(this.au, 0, 40009885 * this.at);
         } else {
            Arrays.sort(this.au, 0, 40009885 * this.at, this.af);
         }

      } catch (RuntimeException var2) {
         throw tm.aw(var2, "sz.bm(" + ')');
      }
   }

   final void bo(se var1, wx var2, wx var3, int var4) {
      try {
         this.ba(var1, (byte)-60);
         var1.bj(var2, var3, -1161676396);
         this.bi(var1, (byte)1);
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "sz.bo(" + ')');
      }
   }

   final int bd(se var1, byte var2) {
      try {
         for(int var3 = 0; var3 < 40009885 * this.at; ++var3) {
            if (var2 != 0) {
               throw new IllegalStateException();
            }

            if (var1 == this.au[var3]) {
               if (var2 != 0) {
                  throw new IllegalStateException();
               }

               return var3;
            }
         }

         return -1;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "sz.bd(" + ')');
      }
   }

   final void dh(se var1, wx var2, wx var3) {
      this.ba(var1, (byte)-22);
      var1.bj(var2, var3, -1161676396);
      this.bi(var1, (byte)1);
   }

   final void bw(se var1, int var2) {
      try {
         this.au[(this.at += -810023499) * 40009885 - 1] = var1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "sz.bw(" + ')');
      }
   }

   final void bi(se var1, byte var2) {
      try {
         this.an.put(var1.ak, var1);
         if (var1.aj != null) {
            if (var2 != 1) {
               return;
            }

            se var3 = (se)this.ao.put(var1.aj, var1);
            if (var3 != null) {
               if (var2 != 1) {
                  throw new IllegalStateException();
               }

               if (var3 != var1) {
                  if (var2 != 1) {
                     return;
                  }

                  var3.aj = null;
               }
            }
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "sz.bi(" + ')');
      }
   }

   public se cy(wx var1) {
      se var2 = this.bc(var1, (byte)58);
      return null != var2 ? var2 : this.by(var1, -2016998507);
   }

   public se cu(wx var1) {
      se var2 = this.bc(var1, (byte)80);
      return null != var2 ? var2 : this.by(var1, -1941043655);
   }

   final void dg(se var1, wx var2, wx var3) {
      this.ba(var1, (byte)-5);
      var1.bj(var2, var3, -1161676396);
      this.bi(var1, (byte)1);
   }

   public final boolean cj(wx var1) {
      se var2 = this.bc(var1, (byte)-3);
      if (null == var2) {
         return false;
      } else {
         this.bn(var2, -1897871173);
         return true;
      }
   }

   public final void bl(Comparator var1, byte var2) {
      try {
         if (this.af == null) {
            this.af = var1;
         } else if (this.af instanceof si) {
            if (var2 != 2) {
               throw new IllegalStateException();
            }

            ((si)this.af).au(var1, 1121308511);
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "sz.bl(" + ')');
      }
   }

   abstract se[] aw(int var1, int var2);

   abstract se ai();

   abstract se ay();

   public final se dc(int var1) {
      if (var1 >= 0 && var1 < this.at * 40009885) {
         return this.au[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   abstract se[] ae(int var1);

   public void bk(int var1) {
      try {
         this.at = 0;
         Arrays.fill(this.au, (Object)null);
         this.an.clear();
         this.ao.clear();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "sz.bk(" + ')');
      }
   }

   public void be() {
      this.at = 0;
      Arrays.fill(this.au, (Object)null);
      this.an.clear();
      this.ao.clear();
   }

   public int ci() {
      return 40009885 * this.at;
   }

   public int cb() {
      return 40009885 * this.at;
   }

   public int cd() {
      return 40009885 * this.at;
   }

   final void dx(se var1) {
      this.au[(this.at += -810023499) * 40009885 - 1] = var1;
   }

   public boolean cn() {
      return this.am * -1108690839 == 40009885 * this.at;
   }

   public final boolean cc(wx var1) {
      se var2 = this.bc(var1, (byte)56);
      if (null == var2) {
         return false;
      } else {
         this.bn(var2, -1756853768);
         return true;
      }
   }

   public boolean cf() {
      return this.am * -1108690839 == 40009885 * this.at;
   }

   public boolean cl(wx var1) {
      if (!var1.ak(-1450300163)) {
         return false;
      } else {
         return this.an.containsKey(var1) ? true : this.ao.containsKey(var1);
      }
   }

   sz(int var1) {
      try {
         super();
         this.at = 0;
         this.af = null;
         this.am = var1 * -1464969255;
         this.au = this.aw(var1, 1608525822);
         this.an = new HashMap(var1 / 8);
         this.ao = new HashMap(var1 / 8);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "sz.<init>(" + ')');
      }
   }

   se ch(wx var1) {
      return !var1.ak(-1648742954) ? null : (se)this.ao.get(var1);
   }

   final void bf(int var1, byte var2) {
      try {
         this.at -= -810023499;
         if (var1 < this.at * 40009885) {
            System.arraycopy(this.au, 1 + var1, this.au, var1, this.at * 40009885 - var1);
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "sz.bf(" + ')');
      }
   }

   public final se dr(int var1) {
      if (var1 >= 0 && var1 < this.at * -586355605) {
         return this.au[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   se ce(wx var1) {
      return !var1.ak(-1318418805) ? null : (se)this.an.get(var1);
   }

   se cg(wx var1) {
      return !var1.ak(37703491) ? null : (se)this.an.get(var1);
   }

   final void ba(se var1, byte var2) {
      try {
         if (this.an.remove(var1.ak) == null) {
            if (var2 == -104) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException();
            }
         } else {
            if (var1.aj != null) {
               if (var2 == -104) {
                  throw new IllegalStateException();
               }

               this.ao.remove(var1.aj);
            }

         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "sz.ba(" + ')');
      }
   }

   abstract se as();

   public final void dy() {
      this.af = null;
   }

   public final boolean ct(wx var1) {
      se var2 = this.bc(var1, (byte)-36);
      if (null == var2) {
         return false;
      } else {
         this.bn(var2, -1867473015);
         return true;
      }
   }

   final void dj(int var1) {
      this.at -= 1043177555;
      if (var1 < this.at * 40009885) {
         System.arraycopy(this.au, 1 + var1, this.au, var1, this.at * 40009885 - var1);
      }

   }

   final void dv(se var1) {
      this.an.put(var1.ak, var1);
      if (var1.aj != null) {
         se var2 = (se)this.ao.put(var1.aj, var1);
         if (var2 != null && var2 != var1) {
            var2.aj = null;
         }
      }

   }

   final void cm(se var1) {
      int var2 = this.bd(var1, (byte)0);
      if (-1 != var2) {
         this.bf(var2, (byte)56);
         this.ba(var1, (byte)-42);
      }
   }

   final void cw(se var1) {
      int var2 = this.bd(var1, (byte)0);
      if (-1 != var2) {
         this.bf(var2, (byte)-10);
         this.ba(var1, (byte)-61);
      }
   }

   se ca(wx var1) {
      return this.bt(var1, (wx)null, (short)17548);
   }

   se cs(wx var1) {
      return this.bt(var1, (wx)null, (short)8633);
   }

   se cr(wx var1) {
      return this.bt(var1, (wx)null, (short)8291);
   }

   se ck(wx var1, wx var2) {
      if (this.bc(var1, (byte)-65) != null) {
         throw new IllegalStateException();
      } else {
         se var3 = this.ap(-807171089);
         var3.bj(var1, var2, -1161676396);
         this.bw(var3, 654321447);
         this.bi(var3, (byte)1);
         return var3;
      }
   }

   se dq(wx var1, wx var2) {
      if (this.bc(var1, (byte)4) != null) {
         throw new IllegalStateException();
      } else {
         se var3 = this.ap(-807171089);
         var3.bj(var1, var2, -1161676396);
         this.bw(var3, 654321447);
         this.bi(var3, (byte)1);
         return var3;
      }
   }

   se dd(wx var1, wx var2) {
      if (this.bc(var1, (byte)10) != null) {
         throw new IllegalStateException();
      } else {
         se var3 = this.ap(-807171089);
         var3.bj(var1, var2, -1161676396);
         this.bw(var3, 654321447);
         this.bi(var3, (byte)1);
         return var3;
      }
   }

   static final void nz(int var0) {
      try {
         client.qp = client.pb * -1849223181;
         ie.sy = true;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "sz.nz(" + ')');
      }
   }

   public final se da(int var1) {
      if (var1 >= 0 && var1 < this.at * -2100155569) {
         return this.au[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   public final void do(Comparator var1) {
      if (this.af == null) {
         this.af = var1;
      } else if (this.af instanceof si) {
         ((si)this.af).au(var1, 51742715);
      }

   }

   public boolean co() {
      return this.am * -12926377 == 40009885 * this.at;
   }

   final int dk(se var1) {
      for(int var2 = 0; var2 < 1363376859 * this.at; ++var2) {
         if (var1 == this.au[var2]) {
            return var2;
         }
      }

      return -1;
   }

   final void df(se var1, wx var2, wx var3) {
      this.ba(var1, (byte)-6);
      var1.bj(var2, var3, -1161676396);
      this.bi(var1, (byte)1);
   }

   final int du(se var1) {
      for(int var2 = 0; var2 < 40009885 * this.at; ++var2) {
         if (var1 == this.au[var2]) {
            return var2;
         }
      }

      return -1;
   }

   abstract se ap(int var1);

   final void dl(se var1) {
      if (this.an.remove(var1.ak) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.aj != null) {
            this.ao.remove(var1.aj);
         }

      }
   }

   final void dm(se var1) {
      if (this.an.remove(var1.ak) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.aj != null) {
            this.ao.remove(var1.aj);
         }

      }
   }

   final void dt(se var1) {
      this.au[(this.at += -810023499) * 40009885 - 1] = var1;
   }

   public boolean cp(wx var1) {
      if (!var1.ak(-1106872008)) {
         return false;
      } else {
         return this.an.containsKey(var1) ? true : this.ao.containsKey(var1);
      }
   }

   final void ds(se var1) {
      this.au[(this.at += -810023499) * 40009885 - 1] = var1;
   }

   final void db(se var1) {
      this.an.put(var1.ak, var1);
      if (var1.aj != null) {
         se var2 = (se)this.ao.put(var1.aj, var1);
         if (var2 != null && var2 != var1) {
            var2.aj = null;
         }
      }

   }

   public void cq() {
      this.at = 0;
      Arrays.fill(this.au, (Object)null);
      this.an.clear();
      this.ao.clear();
   }

   public final void bg(byte var1) {
      try {
         this.af = null;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "sz.bg(" + ')');
      }
   }

   final void dp(int var1) {
      this.at -= -829501427;
      if (var1 < this.at * 40009885) {
         System.arraycopy(this.au, 1 + var1, this.au, var1, this.at * 40009885 - var1);
      }

   }

   abstract se[] am(int var1);

   se cz(wx var1) {
      return !var1.ak(-1435870009) ? null : (se)this.ao.get(var1);
   }

   public final void dw(Comparator var1) {
      if (this.af == null) {
         this.af = var1;
      } else if (this.af instanceof si) {
         ((si)this.af).au(var1, -463279595);
      }

   }

   abstract se aj();
}
