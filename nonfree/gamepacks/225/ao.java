import java.security.SecureRandom;
import java.util.concurrent.Future;

public class ao {
   public static final int af = 16;
   String ae;
   static SecureRandom hq;
   static en ir;
   static final int wy = 14;
   static int la;
   static final int au = 4;
   public static final int aj = 4;
   static final int ci = 36;
   Future ac;

   public final String au() {
      return this.ae;
   }

   public final boolean az() {
      return this.ag((byte)-115) ? true : this.ac.isDone();
   }

   void ac(String var1, int var2) {
      try {
         if (null == var1) {
            if (var2 == 1433756115) {
               return;
            }

            var1 = "";
         }

         this.ae = var1;
         if (this.ac != null) {
            this.ac.cancel(true);
            this.ac = null;
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ao.ac(" + ')');
      }
   }

   public final boolean ap() {
      return this.ag((byte)-46) ? true : this.ac.isDone();
   }

   public boolean ag(byte var1) {
      try {
         boolean var10000;
         if (this.ae == null) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            if (null != this.ac) {
               var10000 = false;
               return var10000;
            }

            if (var1 >= 0) {
               throw new IllegalStateException();
            }
         }

         var10000 = true;
         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ao.ag(" + ')');
      }
   }

   public final boolean am(int var1) {
      try {
         if (this.ag((byte)-85)) {
            if (var1 >= -1015541307) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            return this.ac.isDone();
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ao.am(" + ')');
      }
   }

   public final ay ax(int var1) {
      try {
         if (this.ag((byte)-103)) {
            return new ay(this.ae);
         } else if (!this.am(-1634348793)) {
            if (var1 <= -1102946608) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            try {
               return (ay)this.ac.get();
            } catch (Exception var4) {
               String var3 = "Error retrieving REST request reply";
               System.err.println(var3 + "\r\n" + var4);
               this.ac(var3, 1479568883);
               return new ay(var3);
            }
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ao.ax(" + ')');
      }
   }

   void aq(String var1) {
      if (null == var1) {
         var1 = "";
      }

      this.ae = var1;
      if (this.ac != null) {
         this.ac.cancel(true);
         this.ac = null;
      }

   }

   public boolean ad() {
      return this.ae != null || null == this.ac;
   }

   void at(String var1) {
      if (null == var1) {
         var1 = "";
      }

      this.ae = var1;
      if (this.ac != null) {
         this.ac.cancel(true);
         this.ac = null;
      }

   }

   public final ay ao() {
      if (this.ag((byte)-63)) {
         return new ay(this.ae);
      } else if (!this.am(-1720157400)) {
         return null;
      } else {
         try {
            return (ay)this.ac.get();
         } catch (Exception var3) {
            String var2 = "Error retrieving REST request reply";
            System.err.println(var2 + "\r\n" + var3);
            this.ac(var2, -863642492);
            return new ay(var2);
         }
      }
   }

   public final String ar() {
      return this.ae;
   }

   static void mv(ny[] var0, ny var1, boolean var2, int var3) {
      try {
         int var4 = 0 != 1096441855 * var1.bc ? 1096441855 * var1.bc : -1339552805 * var1.bu;
         int var10000;
         if (2090701815 * var1.cn != 0) {
            if (var3 != 392960591) {
               throw new IllegalStateException();
            }

            var10000 = var1.cn * 2090701815;
         } else {
            var10000 = 1036386215 * var1.br;
         }

         int var5 = var10000;
         oz.ms(var0, -1565465557 * var1.bh, var4, var5, var2, 1810122310);
         if (var1.gr != null) {
            if (var3 != 392960591) {
               return;
            }

            oz.ms(var1.gr, var1.bh * -1565465557, var4, var5, var2, 1289857244);
         }

         dj var6 = (dj)client.ol.ac((long)(var1.bh * -1565465557));
         if (var6 != null) {
            ak.mm(-1883588565 * var6.ac, var4, var5, var2, 2045319622);
         }

         if (var1.bs * 571012371 == 1337 && var3 != 392960591) {
            throw new IllegalStateException();
         }
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "ao.mv(" + ')');
      }
   }

   public final String al() {
      return this.ae;
   }

   public boolean ah() {
      return this.ae != null || null == this.ac;
   }

   public final String ae(int var1) {
      try {
         return this.ae;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ao.ae(" + ')');
      }
   }

   ao(String var1) {
      try {
         super();
         this.ac(var1, 825099075);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ao.<init>(" + ')');
      }
   }

   static void af(float var0, float var1, float var2, float var3, fr var4, int var5) {
      try {
         float var6 = var1 - var0;
         float var7 = var2 - var1;
         float var8 = var3 - var2;
         float var9 = var7 - var6;
         var4.ad = var8 - var7 - var9;
         var4.al = var9 + var9 + var9;
         var4.ar = var6 + var6 + var6;
         var4.au = var0;
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "ao.af(" + ')');
      }
   }

   public final ay aa() {
      if (this.ag((byte)-94)) {
         return new ay(this.ae);
      } else if (!this.am(-1223290143)) {
         return null;
      } else {
         try {
            return (ay)this.ac.get();
         } catch (Exception var3) {
            String var2 = "Error retrieving REST request reply";
            System.err.println(var2 + "\r\n" + var3);
            this.ac(var2, -1402991567);
            return new ay(var2);
         }
      }
   }

   public final ay ai() {
      if (this.ag((byte)-92)) {
         return new ay(this.ae);
      } else if (!this.am(-1713888551)) {
         return null;
      } else {
         try {
            return (ay)this.ac.get();
         } catch (Exception var3) {
            String var2 = "Error retrieving REST request reply";
            System.err.println(var2 + "\r\n" + var3);
            this.ac(var2, -1796538396);
            return new ay(var2);
         }
      }
   }

   void af(String var1) {
      if (null == var1) {
         var1 = "";
      }

      this.ae = var1;
      if (this.ac != null) {
         this.ac.cancel(true);
         this.ac = null;
      }

   }

   public final ay as() {
      if (this.ag((byte)-73)) {
         return new ay(this.ae);
      } else if (!this.am(-1990805339)) {
         return null;
      } else {
         try {
            return (ay)this.ac.get();
         } catch (Exception var3) {
            String var2 = "Error retrieving REST request reply";
            System.err.println(var2 + "\r\n" + var3);
            this.ac(var2, 1372562309);
            return new ay(var2);
         }
      }
   }

   public final boolean ab() {
      return this.ag((byte)-45) ? true : this.ac.isDone();
   }

   ao(Future var1) {
      try {
         super();
         this.ac = var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ao.<init>(" + ')');
      }
   }
}
