import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class uh implements ug {
   Map ac;
   final vn ae;
   public static final int ar = 12;

   public void am(int var1, Object var2) {
      if (this.ac == null) {
         this.ac = new HashMap();
         this.ac.put(var1, new vu(var1, var2));
      } else {
         vu var3 = (vu)this.ac.get(var1);
         if (var3 == null) {
            this.ac.put(var1, new vu(var1, var2));
         } else {
            var3.ae = var2;
         }
      }

   }

   public void ax(int var1, Object var2) {
      if (this.ac == null) {
         this.ac = new HashMap();
         this.ac.put(var1, new vu(var1, var2));
      } else {
         vu var3 = (vu)this.ac.get(var1);
         if (var3 == null) {
            this.ac.put(var1, new vu(var1, var2));
         } else {
            var3.ae = var2;
         }
      }

   }

   public void ae(int var1, Object var2, int var3) {
      try {
         if (this.ac == null) {
            this.ac = new HashMap();
            this.ac.put(var1, new vu(var1, var2));
         } else {
            vu var4 = (vu)this.ac.get(var1);
            if (var4 == null) {
               if (var3 != 804122963) {
                  return;
               }

               this.ac.put(var1, new vu(var1, var2));
            } else {
               var4.ae = var2;
            }
         }

      } catch (RuntimeException var5) {
         throw vk.ae(var5, "uh.ae(" + ')');
      }
   }

   public int ac(int var1, int var2) {
      try {
         if (null != this.ac) {
            if (var2 == 566208533) {
               throw new IllegalStateException();
            }

            vu var3 = (vu)this.ac.get(var1);
            if (null != var3) {
               if (var2 == 566208533) {
                  throw new IllegalStateException();
               }

               return (Integer)var3.ae;
            }
         }

         return (Integer)this.ae.ag(var1, -427155111);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "uh.ac(" + ')');
      }
   }

   public Iterator ah() {
      return null == this.ac ? Collections.emptyList().iterator() : this.ac.values().iterator();
   }

   public Iterator ap() {
      return null == this.ac ? Collections.emptyList().iterator() : this.ac.values().iterator();
   }

   public Iterator ab() {
      return null == this.ac ? Collections.emptyList().iterator() : this.ac.values().iterator();
   }

   public int ag(int var1) {
      if (null != this.ac) {
         vu var2 = (vu)this.ac.get(var1);
         if (null != var2) {
            return (Integer)var2.ae;
         }
      }

      return (Integer)this.ae.ag(var1, -1721688226);
   }

   public Iterator iterator() {
      try {
         return null == this.ac ? Collections.emptyList().iterator() : this.ac.values().iterator();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "uh.iterator(" + ')');
      }
   }

   public uh(vn var1) {
      try {
         super();
         this.ae = var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "uh.<init>(" + ')');
      }
   }
}
