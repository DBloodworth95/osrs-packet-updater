import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class sf {
   HashMap ah;
   int ar;
   ss[] al;
   HashMap ad;
   Comparator ap;
   final int au;
   public static final int cv = 84;

   final void dl(ss var1, wf var2, wf var3) {
      this.br(var1, 1411561885);
      var1.bf(var2, var3, (byte)66);
      this.bv(var1, -1811919916);
   }

   public void bx(int var1) {
      try {
         this.ar = 0;
         Arrays.fill(this.al, (Object)null);
         this.ad.clear();
         this.ah.clear();
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "sf.bx(" + ')');
      }
   }

   final void bo(ss var1, byte var2) {
      try {
         this.al[(this.ar += -1954245729) * 1323812959 - 1] = var1;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "sf.bo(" + ')');
      }
   }

   public boolean bm(int var1) {
      try {
         boolean var10000;
         if (1323812959 * this.ar == 1991364691 * this.au) {
            if (var1 == 1421161944) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "sf.bm(" + ')');
      }
   }

   public final void da() {
      this.ap = null;
   }

   public ss bw(wf var1, byte var2) {
      try {
         ss var3 = this.ba(var1, 64999200);
         if (null != var3) {
            if (var2 >= -1) {
               throw new IllegalStateException();
            } else {
               return var3;
            }
         } else {
            return this.bj(var1, -314301981);
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "sf.bw(" + ')');
      }
   }

   ss ba(wf var1, int var2) {
      try {
         return !var1.ag(1578171906) ? null : (ss)this.ad.get(var1);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "sf.ba(" + ')');
      }
   }

   ss cd(wf var1) {
      return this.bi(var1, (wf)null, 2065383868);
   }

   public final boolean bp(wf var1, byte var2) {
      try {
         ss var3 = this.ba(var1, 1737249375);
         if (var3 == null) {
            if (var2 == 1) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            this.by(var3, (byte)101);
            return true;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "sf.bp(" + ')');
      }
   }

   final void by(ss var1, byte var2) {
      try {
         int var3 = this.bu(var1, 1917623707);
         if (var3 == -1) {
            if (var2 <= 82) {
               throw new IllegalStateException();
            }
         } else {
            this.bt(var3, 1522545690);
            this.br(var1, 1178567633);
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "sf.by(" + ')');
      }
   }

   ss bb(wf var1, byte var2) {
      try {
         return this.bi(var1, (wf)null, 2143582393);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "sf.bb(" + ')');
      }
   }

   final int bu(ss var1, int var2) {
      try {
         for(int var3 = 0; var3 < 1323812959 * this.ar; ++var3) {
            if (var2 <= 1731939984) {
               throw new IllegalStateException();
            }

            if (this.al[var3] == var1) {
               if (var2 <= 1731939984) {
                  throw new IllegalStateException();
               }

               return var3;
            }
         }

         return -1;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "sf.bu(" + ')');
      }
   }

   public final ss bg(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var1 < 1323812959 * this.ar) {
               return this.al[var1];
            }

            if (var2 <= -1079591489) {
               throw new IllegalStateException();
            }
         }

         throw new ArrayIndexOutOfBoundsException(var1);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "sf.bg(" + ')');
      }
   }

   public final void bl(byte var1) {
      try {
         if (null == this.ap) {
            Arrays.sort(this.al, 0, 1323812959 * this.ar);
         } else {
            Arrays.sort(this.al, 0, 1323812959 * this.ar, this.ap);
         }

      } catch (RuntimeException var2) {
         throw vk.ae(var2, "sf.bl(" + ')');
      }
   }

   final void bz(ss var1, wf var2, wf var3, int var4) {
      try {
         this.br(var1, 1265674547);
         var1.bf(var2, var3, (byte)111);
         this.bv(var1, 987449873);
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "sf.bz(" + ')');
      }
   }

   ss cv(wf var1) {
      return !var1.ag(-1690434853) ? null : (ss)this.ad.get(var1);
   }

   final void br(ss var1, int var2) {
      try {
         if (this.ad.remove(var1.ag) == null) {
            throw new IllegalStateException();
         } else {
            if (var1.am != null) {
               if (var2 <= 232010328) {
                  throw new IllegalStateException();
               }

               this.ah.remove(var1.am);
            }

         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "sf.br(" + ')');
      }
   }

   sf(int var1) {
      try {
         super();
         this.ar = 0;
         this.ap = null;
         this.au = 1238168539 * var1;
         this.al = this.ae(var1, -1325336376);
         this.ad = new HashMap(var1 / 8);
         this.ah = new HashMap(var1 / 8);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "sf.<init>(" + ')');
      }
   }

   final void bv(ss var1, int var2) {
      try {
         this.ad.put(var1.ag, var1);
         if (null != var1.am) {
            if (var2 >= 1180005663) {
               throw new IllegalStateException();
            }

            ss var3 = (ss)this.ah.put(var1.am, var1);
            if (var3 != null) {
               if (var2 >= 1180005663) {
                  throw new IllegalStateException();
               }

               if (var1 != var3) {
                  if (var2 >= 1180005663) {
                     throw new IllegalStateException();
                  }

                  var3.am = null;
               }
            }
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "sf.bv(" + ')');
      }
   }

   final void bt(int var1, int var2) {
      try {
         this.ar -= -1954245729;
         if (var1 < 1323812959 * this.ar) {
            if (var2 == -1025469386) {
               throw new IllegalStateException();
            }

            System.arraycopy(this.al, 1 + var1, this.al, var1, 1323812959 * this.ar - var1);
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "sf.bt(" + ')');
      }
   }

   final void dh(int var1) {
      this.ar -= -1954245729;
      if (var1 < 1323812959 * this.ar) {
         System.arraycopy(this.al, 1 + var1, this.al, var1, 1323812959 * this.ar - var1);
      }

   }

   public final void bq(short var1) {
      try {
         this.ap = null;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "sf.bq(" + ')');
      }
   }

   final void de(ss var1) {
      this.al[(this.ar += -1954245729) * 1323812959 - 1] = var1;
   }

   public final void bk(Comparator var1, int var2) {
      try {
         if (this.ap == null) {
            if (var2 == 1202403421) {
               throw new IllegalStateException();
            }

            this.ap = var1;
         } else if (this.ap instanceof se) {
            ((se)this.ap).au(var1, 2007183439);
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "sf.bk(" + ')');
      }
   }

   abstract ss am();

   final void dm(int var1) {
      this.ar -= 139907689;
      if (var1 < 2111223835 * this.ar) {
         System.arraycopy(this.al, 1 + var1, this.al, var1, 1323812959 * this.ar - var1);
      }

   }

   abstract ss[] aq(int var1);

   public int bf(int var1) {
      try {
         return 1323812959 * this.ar;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "sf.bf(" + ')');
      }
   }

   public final ss dv(int var1) {
      if (var1 >= 0 && var1 < 1323812959 * this.ar) {
         return this.al[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   abstract ss ac(int var1);

   public void bc() {
      this.ar = 0;
      Arrays.fill(this.al, (Object)null);
      this.ad.clear();
      this.ah.clear();
   }

   public int cn() {
      return 1323812959 * this.ar;
   }

   public int ch() {
      return 1323812959 * this.ar;
   }

   public boolean cf() {
      return 1323812959 * this.ar == 1991364691 * this.au;
   }

   public boolean cu() {
      return 466867373 * this.ar == -1414782660 * this.au;
   }

   public boolean cm() {
      return 1323812959 * this.ar == 1991364691 * this.au;
   }

   public final void dr(Comparator var1) {
      if (this.ap == null) {
         this.ap = var1;
      } else if (this.ap instanceof se) {
         ((se)this.ap).au(var1, 1695507547);
      }

   }

   public boolean cj() {
      return 1323812959 * this.ar == 1991364691 * this.au;
   }

   public ss ci(wf var1) {
      ss var2 = this.ba(var1, 1527181221);
      return null != var2 ? var2 : this.bj(var1, -1684482128);
   }

   public ss cy(wf var1) {
      ss var2 = this.ba(var1, 1456305283);
      return null != var2 ? var2 : this.bj(var1, -777038802);
   }

   ss co(wf var1) {
      return !var1.ag(846345445) ? null : (ss)this.ad.get(var1);
   }

   ss bj(wf var1, int var2) {
      try {
         if (!var1.ag(620528978)) {
            if (var2 == -1473486717) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return (ss)this.ah.get(var1);
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "sf.bj(" + ')');
      }
   }

   public final ss df(int var1) {
      if (var1 >= 0 && var1 < 1323812959 * this.ar) {
         return this.al[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   ss ct(wf var1) {
      return !var1.ag(-1479939278) ? null : (ss)this.ah.get(var1);
   }

   ss cq(wf var1) {
      return !var1.ag(-1514992835) ? null : (ss)this.ah.get(var1);
   }

   ss cc(wf var1) {
      return !var1.ag(-2126302392) ? null : (ss)this.ah.get(var1);
   }

   abstract ss[] ae(int var1, int var2);

   final void cw(ss var1) {
      int var2 = this.bu(var1, 1837550121);
      if (var2 != -1) {
         this.bt(var2, -425753646);
         this.br(var1, 953478640);
      }
   }

   final void cr(ss var1) {
      int var2 = this.bu(var1, 1917099052);
      if (var2 != -1) {
         this.bt(var2, -1611593239);
         this.br(var1, 1591721645);
      }
   }

   ss cl(wf var1) {
      return this.bi(var1, (wf)null, 2102727738);
   }

   ss ca(wf var1) {
      return this.bi(var1, (wf)null, 2095758573);
   }

   ss cs(wf var1) {
      return this.bi(var1, (wf)null, 2092742280);
   }

   abstract ss[] at(int var1);

   ss cb(wf var1) {
      return this.bi(var1, (wf)null, 2019054642);
   }

   final void cz(ss var1) {
      int var2 = this.bu(var1, 1956116208);
      if (var2 != -1) {
         this.bt(var2, -1678074470);
         this.br(var1, 1265684155);
      }
   }

   ss ce(wf var1, wf var2) {
      if (this.ba(var1, 2057842787) != null) {
         throw new IllegalStateException();
      } else {
         ss var3 = this.ac(-683181214);
         var3.bf(var1, var2, (byte)25);
         this.bo(var3, (byte)20);
         this.bv(var3, -903130231);
         return var3;
      }
   }

   ss ck(wf var1, wf var2) {
      if (this.ba(var1, -283065211) != null) {
         throw new IllegalStateException();
      } else {
         ss var3 = this.ac(-1289300178);
         var3.bf(var1, var2, (byte)125);
         this.bo(var3, (byte)-9);
         this.bv(var3, -737617244);
         return var3;
      }
   }

   ss dp(wf var1, wf var2) {
      if (this.ba(var1, 761997856) != null) {
         throw new IllegalStateException();
      } else {
         ss var3 = this.ac(-1190816435);
         var3.bf(var1, var2, (byte)111);
         this.bo(var3, (byte)-6);
         this.bv(var3, 148182898);
         return var3;
      }
   }

   abstract ss[] af(int var1);

   final void do(int var1) {
      this.ar -= 2045408262;
      if (var1 < -243238464 * this.ar) {
         System.arraycopy(this.al, 1 + var1, this.al, var1, 1323812959 * this.ar - var1);
      }

   }

   public final void dt() {
      if (null == this.ap) {
         Arrays.sort(this.al, 0, 1323812959 * this.ar);
      } else {
         Arrays.sort(this.al, 0, 1323812959 * this.ar, this.ap);
      }

   }

   public boolean cx(wf var1) {
      if (!var1.ag(2132046920)) {
         return false;
      } else {
         return this.ad.containsKey(var1) ? true : this.ah.containsKey(var1);
      }
   }

   ss cg(wf var1) {
      return !var1.ag(688598981) ? null : (ss)this.ad.get(var1);
   }

   final int db(ss var1) {
      for(int var2 = 0; var2 < 1323812959 * this.ar; ++var2) {
         if (this.al[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   final void dc(ss var1) {
      if (this.ad.remove(var1.ag) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.am != null) {
            this.ah.remove(var1.am);
         }

      }
   }

   final void dx(ss var1) {
      this.ad.put(var1.ag, var1);
      if (null != var1.am) {
         ss var2 = (ss)this.ah.put(var1.am, var1);
         if (var2 != null && var1 != var2) {
            var2.am = null;
         }
      }

   }

   public void be() {
      this.ar = 0;
      Arrays.fill(this.al, (Object)null);
      this.ad.clear();
      this.ah.clear();
   }

   ss bi(wf var1, wf var2, int var3) {
      try {
         if (this.ba(var1, 1662717140) != null) {
            if (var3 <= 1970060024) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException();
            }
         } else {
            ss var4 = this.ac(-1113906309);
            var4.bf(var1, var2, (byte)41);
            this.bo(var4, (byte)-53);
            this.bv(var4, -132115528);
            return var4;
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "sf.bi(" + ')');
      }
   }

   final void dj(ss var1) {
      this.ad.put(var1.ag, var1);
      if (null != var1.am) {
         ss var2 = (ss)this.ah.put(var1.am, var1);
         if (var2 != null && var1 != var2) {
            var2.am = null;
         }
      }

   }

   public final void dk() {
      if (null == this.ap) {
         Arrays.sort(this.al, 0, 1323812959 * this.ar);
      } else {
         Arrays.sort(this.al, 0, 1323812959 * this.ar, this.ap);
      }

   }

   abstract ss[] ax(int var1);

   ss cp(wf var1) {
      return this.bi(var1, (wf)null, 2073248127);
   }

   public final void dq() {
      this.ap = null;
   }

   public final void di() {
      this.ap = null;
   }

   final void dw(ss var1) {
      if (this.ad.remove(var1.ag) == null) {
         throw new IllegalStateException();
      } else {
         if (var1.am != null) {
            this.ah.remove(var1.am);
         }

      }
   }

   public final void dz(Comparator var1) {
      if (this.ap == null) {
         this.ap = var1;
      } else if (this.ap instanceof se) {
         ((se)this.ap).au(var1, 1771200206);
      }

   }

   public final void dg(Comparator var1) {
      if (this.ap == null) {
         this.ap = var1;
      } else if (this.ap instanceof se) {
         ((se)this.ap).au(var1, 1866164098);
      }

   }

   public boolean bs(wf var1, short var2) {
      try {
         if (!var1.ag(1418707489)) {
            return false;
         } else if (this.ad.containsKey(var1)) {
            if (var2 != 128) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            return this.ah.containsKey(var1);
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "sf.bs(" + ')');
      }
   }
}
