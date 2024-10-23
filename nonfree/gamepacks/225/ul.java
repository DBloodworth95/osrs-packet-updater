import java.io.IOException;
import java.util.Iterator;

class ul implements Iterator {
   // $FF: synthetic field
   final uf this$0;
   static vv[] ku;
   int ac;

   public void at() {
      throw new UnsupportedOperationException();
   }

   public boolean hasNext() {
      try {
         return -1331799763 * this.ac < this.this$0.ae(1714079205);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ul.hasNext(" + ')');
      }
   }

   static void mc(int var0, int var1, int var2) {
      try {
         mq var3 = fs.ac(mz.dq, client.ia.ax, (byte)-26);
         var3.ag.du(var1, -1185194381);
         var3.ag.em(var0, 65535);
         client.ia.ag(var3, 1798187306);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ul.mc(" + ')');
      }
   }

   public void remove() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ul.remove(" + ')');
      }
   }

   public Object next() {
      try {
         int var1 = (this.ac += -1254465883) * -1331799763 - 1;
         sx var2 = (sx)this.this$0.ag.ac((long)var1);
         return var2 != null ? var2 : this.this$0.aa(var1, (byte)4);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ul.next(" + ')');
      }
   }

   public void aq() {
      throw new UnsupportedOperationException();
   }

   public void af() {
      throw new UnsupportedOperationException();
   }

   static du ag(int var0) {
      try {
         ud var1 = null;
         du var2 = new du();

         try {
            var1 = oh.ae("", mw.cm.af, false, (byte)73);
            byte[] var3 = new byte[(int)var1.ax(1318096253)];

            int var5;
            for(int var4 = 0; var4 < var3.length; var4 += var5) {
               var5 = var1.aq(var3, var4, var3.length - var4, (byte)0);
               if (var5 == -1) {
                  if (var0 <= 949312407) {
                     throw new IllegalStateException();
                  }

                  throw new IOException();
               }
            }

            var2 = new du(new vf(var3));
         } catch (Exception var7) {
         }

         try {
            if (null != var1) {
               if (var0 <= 949312407) {
                  throw new IllegalStateException();
               }

               var1.ag((byte)-97);
            }
         } catch (Exception var6) {
         }

         return var2;
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "ul.ag(" + ')');
      }
   }

   public void au() {
      throw new UnsupportedOperationException();
   }

   ul(uf var1) {
      this.this$0 = var1;
   }

   public Object al() {
      int var1 = (this.ac += -1254465883) * -1331799763 - 1;
      sx var2 = (sx)this.this$0.ag.ac((long)var1);
      return var2 != null ? var2 : this.this$0.aa(var1, (byte)4);
   }

   public boolean ax() {
      return -1331799763 * this.ac < this.this$0.ae(1218908263);
   }

   public Object ar() {
      int var1 = (this.ac += -1254465883) * -1331799763 - 1;
      sx var2 = (sx)this.this$0.ag.ac((long)var1);
      return var2 != null ? var2 : this.this$0.aa(var1, (byte)4);
   }
}
