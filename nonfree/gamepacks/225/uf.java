import java.util.Iterator;

public class uf extends sa implements mu {
   final int am;
   final mh ag;
   final po ae;
   static final int bn = 3;
   static String hc;

   protected sz ax(int var1) {
      synchronized(this.ag) {
         sx var2 = (sx)this.ag.ac((long)var1);
         if (var2 == null) {
            var2 = this.aa(var1, (byte)4);
            this.ag.am(var2, (long)var1);
         }

         return var2;
      }
   }

   public Iterator ap() {
      return new ul(this);
   }

   sx aa(int var1, byte var2) {
      try {
         byte[] var3 = this.ae.bt(this.am * 1446631929, var1, (byte)13);
         sx var4 = new sx(var1);
         if (var3 != null) {
            if (var2 != 4) {
               throw new IllegalStateException();
            }

            var4.ax(new vf(var3), -609977713);
         }

         return var4;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "uf.aa(" + ')');
      }
   }

   sx ay(int var1) {
      byte[] var2 = this.ae.bt(this.am * 1446631929, var1, (byte)-78);
      sx var3 = new sx(var1);
      if (var2 != null) {
         var3.ax(new vf(var2), -609977713);
      }

      return var3;
   }

   public Iterator iterator() {
      try {
         return new ul(this);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "uf.iterator(" + ')');
      }
   }

   public Iterator ah() {
      return new ul(this);
   }

   public uf(ob var1, int var2, px var3, po var4) {
      try {
         super(var1, var3, null != var4 ? var4.cj(var2, (byte)55) : 0);
         this.ag = new mh(64);
         this.ae = var4;
         this.am = var2 * 234723401;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "uf.<init>(" + ')');
      }
   }

   public Iterator ab() {
      return new ul(this);
   }

   sx ao(int var1) {
      byte[] var2 = this.ae.bt(this.am * 1446631929, var1, (byte)104);
      sx var3 = new sx(var1);
      if (var2 != null) {
         var3.ax(new vf(var2), -609977713);
      }

      return var3;
   }

   protected sz aq(int var1) {
      synchronized(this.ag) {
         sx var2 = (sx)this.ag.ac((long)var1);
         if (var2 == null) {
            var2 = this.aa(var1, (byte)4);
            this.ag.am(var2, (long)var1);
         }

         return var2;
      }
   }

   public void ai(int var1) {
      try {
         synchronized(this.ag) {
            this.ag.af();
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "uf.ai(" + ')');
      }
   }

   sx as(int var1) {
      byte[] var2 = this.ae.bt(this.am * 1446631929, var1, (byte)53);
      sx var3 = new sx(var1);
      if (var2 != null) {
         var3.ax(new vf(var2), -609977713);
      }

      return var3;
   }

   protected sz ac(int var1, byte var2) {
      try {
         synchronized(this.ag) {
            sx var3 = (sx)this.ag.ac((long)var1);
            if (var3 == null) {
               if (var2 != 16) {
                  throw new IllegalStateException();
               }

               var3 = this.aa(var1, (byte)4);
               this.ag.am(var3, (long)var1);
            }

            return var3;
         }
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "uf.ac(" + ')');
      }
   }

   sx aj(int var1) {
      byte[] var2 = this.ae.bt(this.am * 1446631929, var1, (byte)-17);
      sx var3 = new sx(var1);
      if (var2 != null) {
         var3.ax(new vf(var2), -609977713);
      }

      return var3;
   }

   public void av() {
      synchronized(this.ag) {
         this.ag.af();
      }
   }
}
