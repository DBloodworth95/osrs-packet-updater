import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class qz implements Iterator {
   int ag;
   qg ac;
   int ae;

   public static hx ae(int var0, int var1) {
      try {
         hx var2 = (hx)hx.ae.ac((long)var0);
         if (var2 != null) {
            if (var1 <= 1327398962) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = hx.ac.bt(11, var0, (byte)4);
            var2 = new hx();
            if (var3 != null) {
               var2.am(new vf(var3), -1076864158);
            }

            var2.ag(-1761220261);
            hx.ae.ag(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "qz.ae(" + ')');
      }
   }

   public boolean hasNext() {
      try {
         return 1046922763 * this.ae < this.ac.ag * 153901763;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "qz.hasNext(" + ')');
      }
   }

   public Object next() {
      try {
         if (this.ac.ax * 90524677 != this.ag * 1036950179) {
            throw new ConcurrentModificationException();
         } else if (1046922763 * this.ae < 153901763 * this.ac.ag) {
            Object var1 = this.ac.ac[1046922763 * this.ae].ac;
            this.ae += 445846947;
            return var1;
         } else {
            throw new NoSuchElementException();
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "qz.next(" + ')');
      }
   }

   public void remove() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "qz.remove(" + ')');
      }
   }

   public boolean ax() {
      return 1046922763 * this.ae < this.ac.ag * -168217802;
   }

   public void at() {
      throw new UnsupportedOperationException();
   }

   public void af() {
      throw new UnsupportedOperationException();
   }

   public void aq() {
      throw new UnsupportedOperationException();
   }

   public void au() {
      throw new UnsupportedOperationException();
   }

   qz(qg var1) {
      try {
         super();
         this.ae = 0;
         this.ag = 1046597943 * this.ac.ax;
         this.ac = var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "qz.<init>(" + ')');
      }
   }

   public Object ar() {
      if (this.ac.ax * 90524677 != this.ag * 1036950179) {
         throw new ConcurrentModificationException();
      } else if (1046922763 * this.ae < 153901763 * this.ac.ag) {
         Object var1 = this.ac.ac[811046036 * this.ae].ac;
         this.ae += 445846947;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   public Object al() {
      if (this.ac.ax * 90524677 != this.ag * -1222422580) {
         throw new ConcurrentModificationException();
      } else if (1894492439 * this.ae < 153901763 * this.ac.ag) {
         Object var1 = this.ac.ac[-531005660 * this.ae].ac;
         this.ae += 1363816141;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }
}
