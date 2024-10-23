import java.util.Collection;
import java.util.Iterator;

public class pr implements Iterable, Collection {
   to ac = new to();
   to ae;

   int at() {
      int var1 = 0;

      for(to var2 = this.ac.hy; var2 != this.ac; var2 = var2.hy) {
         ++var1;
      }

      return var1;
   }

   public void ac() {
      while(this.ac.hy != this.ac) {
         this.ac.hy.jb();
      }

   }

   boolean al(to var1) {
      this.ae(var1);
      return true;
   }

   public void ag(to var1) {
      if (var1.hd != null) {
         var1.jb();
      }

      var1.hd = this.ac;
      var1.hy = this.ac.hy;
      var1.hd.hy = var1;
      var1.hy.hd = var1;
   }

   public boolean isEmpty() {
      return this.au();
   }

   public void cg() {
      this.ac();
   }

   to aq(to var1) {
      to var2;
      if (var1 == null) {
         var2 = this.ac.hy;
      } else {
         var2 = var1;
      }

      if (var2 == this.ac) {
         this.ae = null;
         return null;
      } else {
         this.ae = var2.hy;
         return var2;
      }
   }

   public void az() {
      while(this.ac.hy != this.ac) {
         this.ac.hy.jb();
      }

   }

   public boolean bv(Object var1) {
      throw new RuntimeException();
   }

   public boolean au() {
      return this.ac.hy == this.ac;
   }

   to[] ar() {
      to[] var1 = new to[this.at()];
      int var2 = 0;

      for(to var3 = this.ac.hy; var3 != this.ac; var3 = var3.hy) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public void ao(to var1) {
      if (var1.hd != null) {
         var1.jb();
      }

      var1.hd = this.ac;
      var1.hy = this.ac.hy;
      var1.hd.hy = var1;
      var1.hy.hd = var1;
   }

   boolean be(to var1) {
      this.ae(var1);
      return true;
   }

   public boolean cu(Collection var1) {
      throw new RuntimeException();
   }

   public boolean contains(Object var1) {
      throw new RuntimeException();
   }

   public boolean cq(Object var1) {
      return this.al((to)var1);
   }

   public Object[] toArray(Object[] var1) {
      int var2 = 0;

      for(to var3 = this.ac.hy; var3 != this.ac; var3 = var3.hy) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public boolean bu() {
      return this.au();
   }

   public boolean remove(Object var1) {
      throw new RuntimeException();
   }

   public boolean containsAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean addAll(Collection var1) {
      throw new RuntimeException();
   }

   public int size() {
      return this.at();
   }

   public boolean retainAll(Collection var1) {
      throw new RuntimeException();
   }

   public void clear() {
      this.ac();
   }

   public boolean add(Object var1) {
      return this.al((to)var1);
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "pr.equals(" + ')');
      }
   }

   public void ad() {
      while(this.ac.hy != this.ac) {
         this.ac.hy.jb();
      }

   }

   public boolean gn(Object var1) {
      return super.equals(var1);
   }

   public to af() {
      to var1 = this.ae;
      if (var1 == this.ac) {
         this.ae = null;
         return null;
      } else {
         this.ae = var1.hy;
         return var1;
      }
   }

   public Iterator ah() {
      return new pa(this);
   }

   public Iterator ap() {
      return new pa(this);
   }

   to ak(to var1) {
      to var2;
      if (var1 == null) {
         var2 = this.ac.hy;
      } else {
         var2 = var1;
      }

      if (var2 == this.ac) {
         this.ae = null;
         return null;
      } else {
         this.ae = var2.hy;
         return var2;
      }
   }

   public static void am(to var0, to var1) {
      if (var0.hd != null) {
         var0.jb();
      }

      var0.hd = var1;
      var0.hy = var1.hy;
      var0.hd.hy = var0;
      var0.hy.hd = var0;
   }

   public int amd() {
      return super.hashCode();
   }

   public Object[] bt() {
      return this.ar();
   }

   public boolean bw() {
      return this.ac.hy == this.ac;
   }

   public void aa(to var1) {
      if (var1.hd != null) {
         var1.jb();
      }

      var1.hd = this.ac.hd;
      var1.hy = this.ac;
      var1.hd.hy = var1;
      var1.hy.hd = var1;
   }

   public void ai(to var1) {
      if (var1.hd != null) {
         var1.jb();
      }

      var1.hd = this.ac.hd;
      var1.hy = this.ac;
      var1.hd.hy = var1;
      var1.hy.hd = var1;
   }

   public pr() {
      this.ac.hy = this.ac;
      this.ac.hd = this.ac;
   }

   public void as(to var1) {
      if (var1.hd != null) {
         var1.jb();
      }

      var1.hd = this.ac;
      var1.hy = this.ac.hy;
      var1.hd.hy = var1;
      var1.hy.hd = var1;
   }

   public static void ay(to var0, to var1) {
      if (var0.hd != null) {
         var0.jb();
      }

      var0.hd = var1;
      var0.hy = var1.hy;
      var0.hd.hy = var0;
      var0.hy.hd = var0;
   }

   public static void aj(to var0, to var1) {
      if (var0.hd != null) {
         var0.jb();
      }

      var0.hd = var1;
      var0.hy = var1.hy;
      var0.hd.hy = var0;
      var0.hy.hd = var0;
   }

   public to av() {
      return this.aq((to)null);
   }

   public to aw() {
      return this.aq((to)null);
   }

   public boolean cw(Object var1) {
      throw new RuntimeException();
   }

   public Iterator iterator() {
      return new pa(this);
   }

   public to bn() {
      to var1 = this.ae;
      if (var1 == this.ac) {
         this.ae = null;
         return null;
      } else {
         this.ae = var1.hy;
         return var1;
      }
   }

   public to bh() {
      to var1 = this.ae;
      if (var1 == this.ac) {
         this.ae = null;
         return null;
      } else {
         this.ae = var1.hy;
         return var1;
      }
   }

   public to bd() {
      to var1 = this.ae;
      if (var1 == this.ac) {
         this.ae = null;
         return null;
      } else {
         this.ae = var1.hy;
         return var1;
      }
   }

   int bx() {
      int var1 = 0;

      for(to var2 = this.ac.hy; var2 != this.ac; var2 = var2.hy) {
         ++var1;
      }

      return var1;
   }

   int bf() {
      int var1 = 0;

      for(to var2 = this.ac.hy; var2 != this.ac; var2 = var2.hy) {
         ++var1;
      }

      return var1;
   }

   int bm() {
      int var1 = 0;

      for(to var2 = this.ac.hy; var2 != this.ac; var2 = var2.hy) {
         ++var1;
      }

      return var1;
   }

   public boolean bs() {
      return this.ac.hy == this.ac;
   }

   to an(to var1) {
      to var2;
      if (var1 == null) {
         var2 = this.ac.hy;
      } else {
         var2 = var1;
      }

      if (var2 == this.ac) {
         this.ae = null;
         return null;
      } else {
         this.ae = var2.hy;
         return var2;
      }
   }

   public boolean br(Object var1) {
      throw new RuntimeException();
   }

   to[] bj() {
      to[] var1 = new to[this.at()];
      int var2 = 0;

      for(to var3 = this.ac.hy; var3 != this.ac; var3 = var3.hy) {
         var1[var2++] = var3;
      }

      return var1;
   }

   to[] bp() {
      to[] var1 = new to[this.at()];
      int var2 = 0;

      for(to var3 = this.ac.hy; var3 != this.ac; var3 = var3.hy) {
         var1[var2++] = var3;
      }

      return var1;
   }

   to[] by() {
      to[] var1 = new to[this.at()];
      int var2 = 0;

      for(to var3 = this.ac.hy; var3 != this.ac; var3 = var3.hy) {
         var1[var2++] = var3;
      }

      return var1;
   }

   to[] bb() {
      to[] var1 = new to[this.at()];
      int var2 = 0;

      for(to var3 = this.ac.hy; var3 != this.ac; var3 = var3.hy) {
         var1[var2++] = var3;
      }

      return var1;
   }

   public int bi() {
      return this.at();
   }

   public int bg() {
      return this.at();
   }

   public boolean bl() {
      return this.au();
   }

   public boolean bz() {
      return this.au();
   }

   public boolean gg(Object var1) {
      return super.equals(var1);
   }

   public int hashCode() {
      try {
         return super.hashCode();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "pr.hashCode(" + ')');
      }
   }

   public boolean bo(Object var1) {
      throw new RuntimeException();
   }

   boolean ch(to var1) {
      this.ae(var1);
      return true;
   }

   public Iterator ab() {
      return new pa(this);
   }

   public Object[] bq() {
      return this.ar();
   }

   boolean bk(to var1) {
      this.ae(var1);
      return true;
   }

   public boolean cf(Collection var1) {
      throw new RuntimeException();
   }

   boolean bc(to var1) {
      this.ae(var1);
      return true;
   }

   boolean cn(to var1) {
      this.ae(var1);
      return true;
   }

   public to ax() {
      return this.aq((to)null);
   }

   public boolean ba() {
      return this.ac.hy == this.ac;
   }

   public int amy() {
      return super.hashCode();
   }

   public boolean cm(Collection var1) {
      throw new RuntimeException();
   }

   public boolean cj(Collection var1) {
      throw new RuntimeException();
   }

   public boolean cx(Collection var1) {
      throw new RuntimeException();
   }

   public boolean ci(Collection var1) {
      throw new RuntimeException();
   }

   public boolean cy(Collection var1) {
      throw new RuntimeException();
   }

   public boolean co(Collection var1) {
      throw new RuntimeException();
   }

   public boolean cv(Collection var1) {
      throw new RuntimeException();
   }

   public boolean removeAll(Collection var1) {
      throw new RuntimeException();
   }

   public Object[] toArray() {
      return this.ar();
   }

   public void ct() {
      this.ac();
   }

   public boolean cc(Object var1) {
      return this.al((to)var1);
   }

   public boolean cz(Object var1) {
      return this.al((to)var1);
   }

   public void ae(to var1) {
      if (var1.hd != null) {
         var1.jb();
      }

      var1.hd = this.ac.hd;
      var1.hy = this.ac;
      var1.hd.hy = var1;
      var1.hy.hd = var1;
   }
}
