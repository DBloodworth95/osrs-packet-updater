import java.util.Collection;
import java.util.Iterator;

public class ps implements Iterable, Collection {
   tw ap = new tw();
   tw aw;

   public void cm() {
      this.ap();
   }

   public void ap() {
      while(this.ap.hf != this.ap) {
         this.ap.hf.kf();
      }

   }

   public void aw(tw var1) {
      if (var1.hn != null) {
         var1.kf();
      }

      var1.hn = this.ap.hn;
      var1.hf = this.ap;
      var1.hn.hf = var1;
      var1.hf.hn = var1;
   }

   public void ak(tw var1) {
      if (var1.hn != null) {
         var1.kf();
      }

      var1.hn = this.ap;
      var1.hf = this.ap.hf;
      var1.hn.hf = var1;
      var1.hf.hn = var1;
   }

   public boolean cf(Object var1) {
      throw new RuntimeException();
   }

   public boolean addAll(Collection var1) {
      throw new RuntimeException();
   }

   tw[] bm() {
      tw[] var1 = new tw[this.ae()];
      int var2 = 0;

      for(tw var3 = this.ap.hf; var3 != this.ap; var3 = var3.hf) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public tw as() {
      tw var1 = this.aw;
      if (var1 == this.ap) {
         this.aw = null;
         return null;
      } else {
         this.aw = var1.hf;
         return var1;
      }
   }

   int ae() {
      int var1 = 0;

      for(tw var2 = this.ap.hf; var2 != this.ap; var2 = var2.hf) {
         ++var1;
      }

      return var1;
   }

   public boolean am() {
      return this.ap.hf == this.ap;
   }

   tw[] at() {
      tw[] var1 = new tw[this.ae()];
      int var2 = 0;

      for(tw var3 = this.ap.hf; var3 != this.ap; var3 = var3.hf) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public Iterator iterator() {
      return new pz(this);
   }

   public int size() {
      return this.ae();
   }

   public boolean isEmpty() {
      return this.am();
   }

   public boolean ct(Collection var1) {
      throw new RuntimeException();
   }

   public Object[] toArray() {
      return this.at();
   }

   public Object[] cb(Object[] var1) {
      int var2 = 0;

      for(tw var3 = this.ap.hf; var3 != this.ap; var3 = var3.hf) {
         var1[var2++] = var3;
      }

      return var1;
   }

   boolean au(tw var1) {
      this.aw(var1);
      return true;
   }

   public boolean gj(Object var1) {
      return super.equals(var1);
   }

   public boolean containsAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean bt() {
      return this.ap.hf == this.ap;
   }

   public boolean removeAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean retainAll(Collection var1) {
      throw new RuntimeException();
   }

   public void clear() {
      this.ap();
   }

   public boolean add(Object var1) {
      return this.au((tw)var1);
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ps.equals(" + ')');
      }
   }

   public int hashCode() {
      try {
         return super.hashCode();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ps.hashCode(" + ')');
      }
   }

   public void af() {
      while(this.ap.hf != this.ap) {
         this.ap.hf.kf();
      }

   }

   public Iterator bq() {
      return new pz(this);
   }

   public Iterator bp() {
      return new pz(this);
   }

   public Iterator bz() {
      return new pz(this);
   }

   public int ams() {
      return super.hashCode();
   }

   public int amf() {
      return super.hashCode();
   }

   public ps() {
      this.ap.hf = this.ap;
      this.ap.hn = this.ap;
   }

   public boolean bi(Object var1) {
      throw new RuntimeException();
   }

   public int aml() {
      return super.hashCode();
   }

   public boolean co(Object var1) {
      throw new RuntimeException();
   }

   public void an() {
      while(this.ap.hf != this.ap) {
         this.ap.hf.kf();
      }

   }

   public tw ai() {
      return this.ay((tw)null);
   }

   public boolean ch(Collection var1) {
      throw new RuntimeException();
   }

   tw bk(tw var1) {
      tw var2;
      if (var1 == null) {
         var2 = this.ap.hf;
      } else {
         var2 = var1;
      }

      if (var2 == this.ap) {
         this.aw = null;
         return null;
      } else {
         this.aw = var2.hf;
         return var2;
      }
   }

   public void az(tw var1) {
      if (var1.hn != null) {
         var1.kf();
      }

      var1.hn = this.ap;
      var1.hf = this.ap.hf;
      var1.hn.hf = var1;
      var1.hf.hn = var1;
   }

   public void ag(tw var1) {
      if (var1.hn != null) {
         var1.kf();
      }

      var1.hn = this.ap;
      var1.hf = this.ap.hf;
      var1.hn.hf = var1;
      var1.hf.hn = var1;
   }

   public void ad(tw var1) {
      if (var1.hn != null) {
         var1.kf();
      }

      var1.hn = this.ap;
      var1.hf = this.ap.hf;
      var1.hn.hf = var1;
      var1.hf.hn = var1;
   }

   public static void ac(tw var0, tw var1) {
      if (var0.hn != null) {
         var0.kf();
      }

      var0.hn = var1;
      var0.hf = var1.hf;
      var0.hn.hf = var0;
      var0.hf.hn = var0;
   }

   public static void av(tw var0, tw var1) {
      if (var0.hn != null) {
         var0.kf();
      }

      var0.hn = var1;
      var0.hf = var1.hf;
      var0.hn.hf = var0;
      var0.hf.hn = var0;
   }

   public static void ax(tw var0, tw var1) {
      if (var0.hn != null) {
         var0.kf();
      }

      var0.hn = var1;
      var0.hf = var1.hf;
      var0.hn.hf = var0;
      var0.hf.hn = var0;
   }

   public boolean cy(Collection var1) {
      throw new RuntimeException();
   }

   public boolean contains(Object var1) {
      throw new RuntimeException();
   }

   public tw aa() {
      return this.ay((tw)null);
   }

   public static void aj(tw var0, tw var1) {
      if (var0.hn != null) {
         var0.kf();
      }

      var0.hn = var1;
      var0.hf = var1.hf;
      var0.hn.hf = var0;
      var0.hf.hn = var0;
   }

   public tw bh() {
      return this.ay((tw)null);
   }

   tw bj(tw var1) {
      tw var2;
      if (var1 == null) {
         var2 = this.ap.hf;
      } else {
         var2 = var1;
      }

      if (var2 == this.ap) {
         this.aw = null;
         return null;
      } else {
         this.aw = var2.hf;
         return var2;
      }
   }

   public Object[] cq(Object[] var1) {
      int var2 = 0;

      for(tw var3 = this.ap.hf; var3 != this.ap; var3 = var3.hf) {
         var1[var2++] = var3;
      }

      return var1;
   }

   tw bx(tw var1) {
      tw var2;
      if (var1 == null) {
         var2 = this.ap.hf;
      } else {
         var2 = var1;
      }

      if (var2 == this.ap) {
         this.aw = null;
         return null;
      } else {
         this.aw = var2.hf;
         return var2;
      }
   }

   public boolean cw(Object var1) {
      return this.au((tw)var1);
   }

   public tw bb() {
      tw var1 = this.aw;
      if (var1 == this.ap) {
         this.aw = null;
         return null;
      } else {
         this.aw = var1.hf;
         return var1;
      }
   }

   int bc() {
      int var1 = 0;

      for(tw var2 = this.ap.hf; var2 != this.ap; var2 = var2.hf) {
         ++var1;
      }

      return var1;
   }

   public boolean remove(Object var1) {
      throw new RuntimeException();
   }

   int br() {
      int var1 = 0;

      for(tw var2 = this.ap.hf; var2 != this.ap; var2 = var2.hf) {
         ++var1;
      }

      return var1;
   }

   int bn() {
      int var1 = 0;

      for(tw var2 = this.ap.hf; var2 != this.ap; var2 = var2.hf) {
         ++var1;
      }

      return var1;
   }

   public boolean bu() {
      return this.ap.hf == this.ap;
   }

   public void ab(tw var1) {
      if (var1.hn != null) {
         var1.kf();
      }

      var1.hn = this.ap.hn;
      var1.hf = this.ap;
      var1.hn.hf = var1;
      var1.hf.hn = var1;
   }

   public boolean bs() {
      return this.ap.hf == this.ap;
   }

   public int amb() {
      return super.hashCode();
   }

   public void ao() {
      while(this.ap.hf != this.ap) {
         this.ap.hf.kf();
      }

   }

   tw ay(tw var1) {
      tw var2;
      if (var1 == null) {
         var2 = this.ap.hf;
      } else {
         var2 = var1;
      }

      if (var2 == this.ap) {
         this.aw = null;
         return null;
      } else {
         this.aw = var2.hf;
         return var2;
      }
   }

   public int ba() {
      return this.ae();
   }

   public boolean bw() {
      return this.am();
   }

   int by() {
      int var1 = 0;

      for(tw var2 = this.ap.hf; var2 != this.ap; var2 = var2.hf) {
         ++var1;
      }

      return var1;
   }

   public boolean bf(Object var1) {
      throw new RuntimeException();
   }

   public Object[] bg() {
      return this.at();
   }

   public Object[] bl() {
      return this.at();
   }

   public Object[] be(Object[] var1) {
      int var2 = 0;

      for(tw var3 = this.ap.hf; var3 != this.ap; var3 = var3.hf) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public int amg() {
      return super.hashCode();
   }

   public Object[] toArray(Object[] var1) {
      int var2 = 0;

      for(tw var3 = this.ap.hf; var3 != this.ap; var3 = var3.hf) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public tw al() {
      return this.ay((tw)null);
   }

   boolean ci(tw var1) {
      this.aw(var1);
      return true;
   }

   public boolean cn(Object var1) {
      throw new RuntimeException();
   }

   public int bd() {
      return this.ae();
   }

   public int bo() {
      return this.ae();
   }

   public void ar(tw var1) {
      if (var1.hn != null) {
         var1.kf();
      }

      var1.hn = this.ap.hn;
      var1.hf = this.ap;
      var1.hn.hf = var1;
      var1.hf.hn = var1;
   }

   public boolean cp(Collection var1) {
      throw new RuntimeException();
   }

   public boolean cv(Collection var1) {
      throw new RuntimeException();
   }

   public boolean cl(Object var1) {
      throw new RuntimeException();
   }

   public boolean cu(Collection var1) {
      throw new RuntimeException();
   }

   public boolean ce(Collection var1) {
      throw new RuntimeException();
   }

   public boolean cg(Collection var1) {
      throw new RuntimeException();
   }

   public boolean cz(Collection var1) {
      throw new RuntimeException();
   }

   public tw ah() {
      return this.ay((tw)null);
   }

   public static void aq(tw var0, tw var1) {
      if (var0.hn != null) {
         var0.kf();
      }

      var0.hn = var1;
      var0.hf = var1.hf;
      var0.hn.hf = var0;
      var0.hf.hn = var0;
   }

   boolean cd(tw var1) {
      this.aw(var1);
      return true;
   }

   public void cc() {
      this.ap();
   }

   public void cj() {
      this.ap();
   }

   tw bv(tw var1) {
      tw var2;
      if (var1 == null) {
         var2 = this.ap.hf;
      } else {
         var2 = var1;
      }

      if (var2 == this.ap) {
         this.aw = null;
         return null;
      } else {
         this.aw = var2.hf;
         return var2;
      }
   }

   public boolean cx(Collection var1) {
      throw new RuntimeException();
   }

   public boolean ca(Object var1) {
      return this.au((tw)var1);
   }
}
