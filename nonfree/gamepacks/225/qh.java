public class qh {
   public qd ac;
   static int gf;
   public qv ag;
   public qv ae;
   static final int bx = 4;

   public int amd() {
      boolean var1 = true;
      byte var2 = 1;
      int var3 = 31 * var2 + this.ac.hashCode();
      var3 = 31 * var3 + this.ae.hashCode();
      var3 = var3 * 31 + this.ag.hashCode();
      return var3;
   }

   public void ac(byte var1) {
      try {
         this.ac.ae(1741523789);
         this.ae.am((short)-21813);
         this.ag.am((short)-15147);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "qh.ac(" + ')');
      }
   }

   public String toString() {
      try {
         return "[" + this.ac.toString() + "|" + this.ae.toString() + "|" + this.ag.toString() + "]";
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "qh.toString(" + ')');
      }
   }

   public int amy() {
      int var1 = 1541937254;
      byte var2 = 1;
      int var3 = 887125120 * var2 + this.ac.hashCode();
      var3 = -2015250010 * var3 + this.ae.hashCode();
      var3 = var3 * 117375465 + this.ag.hashCode();
      return var3;
   }

   public int hashCode() {
      try {
         boolean var1 = true;
         byte var2 = 1;
         int var4 = 31 * var2 + this.ac.hashCode();
         var4 = 31 * var4 + this.ae.hashCode();
         var4 = var4 * 31 + this.ag.hashCode();
         return var4;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "qh.hashCode(" + ')');
      }
   }

   public boolean gn(Object var1) {
      if (var1 == null) {
         return false;
      } else if (var1 == this) {
         return true;
      } else if (!(var1 instanceof qh)) {
         return false;
      } else {
         qh var2 = (qh)var1;
         return this.ac.equals(var2.ac) && this.ae.af(var2.ae, (byte)50) && this.ag.af(var2.ag, (byte)50);
      }
   }

   public boolean gg(Object var1) {
      if (var1 == null) {
         return false;
      } else if (var1 == this) {
         return true;
      } else if (!(var1 instanceof qh)) {
         return false;
      } else {
         qh var2 = (qh)var1;
         return this.ac.equals(var2.ac) && this.ae.af(var2.ae, (byte)50) && this.ag.af(var2.ag, (byte)50);
      }
   }

   public String aml() {
      return "[" + this.ac.toString() + "|" + this.ae.toString() + "|" + this.ag.toString() + "]";
   }

   public void ag() {
      this.ac.ae(2050095456);
      this.ae.am((short)-5531);
      this.ag.am((short)-20228);
   }

   public qh() {
      try {
         super();
         this.ac = gd.ac(582344675);
         this.ae = qy.ae((byte)1);
         this.ag = ks.ag(1.0F, 1.0F, 1.0F, 1762342465);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "qh.<init>(" + ')');
      }
   }

   public String amp() {
      return "[" + this.ac.toString() + "|" + this.ae.toString() + "|" + this.ag.toString() + "]";
   }

   public String ame() {
      return "[" + this.ac.toString() + "|" + this.ae.toString() + "|" + this.ag.toString() + "]";
   }

   public void ae() {
      this.ac.ae(352612736);
      this.ae.am((short)-18110);
      this.ag.am((short)-32198);
   }

   public boolean equals(Object var1) {
      try {
         if (var1 == null) {
            return false;
         } else if (var1 == this) {
            return true;
         } else if (!(var1 instanceof qh)) {
            return false;
         } else {
            qh var2 = (qh)var1;
            return this.ac.equals(var2.ac) && this.ae.af(var2.ae, (byte)50) && this.ag.af(var2.ag, (byte)50);
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "qh.equals(" + ')');
      }
   }

   public static mq ac(int var0, String var1, px var2, int var3, byte var4) {
      try {
         mq var5 = fs.ac(mz.co, client.ia.ax, (byte)-127);
         var5.ag.bu(0, (byte)-91);
         int var6 = var5.ag.au * -1027766515;
         var5.ag.bu(var0, (byte)-11);
         String var7 = var1.toLowerCase();
         int var8 = 0;
         byte[] var9 = null;
         if (var7.startsWith(ok.hn)) {
            if (var4 >= 2) {
               throw new IllegalStateException();
            }

            var8 = 0;
            var1 = var1.substring(ok.hn.length());
         } else if (var7.startsWith(ok.hb)) {
            if (var4 >= 2) {
               throw new IllegalStateException();
            }

            var8 = 1;
            var1 = var1.substring(ok.hb.length());
         } else if (var7.startsWith(ok.hq)) {
            var8 = 2;
            var1 = var1.substring(ok.hq.length());
         } else if (var7.startsWith(ok.hm)) {
            var8 = 3;
            var1 = var1.substring(ok.hm.length());
         } else if (var7.startsWith(ok.hz)) {
            if (var4 >= 2) {
               throw new IllegalStateException();
            }

            var8 = 4;
            var1 = var1.substring(ok.hz.length());
         } else if (var7.startsWith(ok.hu)) {
            var8 = 5;
            var1 = var1.substring(ok.hu.length());
         } else if (var7.startsWith(ok.ht)) {
            var8 = 6;
            var1 = var1.substring(ok.ht.length());
         } else if (var7.startsWith(ok.hh)) {
            var8 = 7;
            var1 = var1.substring(ok.hh.length());
         } else if (var7.startsWith(ok.hv)) {
            if (var4 >= 2) {
               throw new IllegalStateException();
            }

            var8 = 8;
            var1 = var1.substring(ok.hv.length());
         } else if (var7.startsWith(ok.hl)) {
            var8 = 9;
            var1 = var1.substring(ok.hl.length());
         } else if (var7.startsWith(ok.ha)) {
            if (var4 >= 2) {
               throw new IllegalStateException();
            }

            var8 = 10;
            var1 = var1.substring(ok.ha.length());
         } else if (var7.startsWith(ok.hx)) {
            var8 = 11;
            var1 = var1.substring(ok.hx.length());
         } else if (var7.startsWith(ok.ho)) {
            if (var4 >= 2) {
               throw new IllegalStateException();
            }

            var8 = 12;
            var1 = var1.substring(ok.ho.length());
         } else if (var7.startsWith(ok.hs)) {
            if (var4 >= 2) {
               throw new IllegalStateException();
            }

            var9 = dx.ae(var7, 1118002659);
            if (var9 != null) {
               if (var4 >= 2) {
                  throw new IllegalStateException();
               }

               var8 = 12 + var9.length;
               var1 = var1.substring(ok.hs.length() + var9.length + 1);
            }
         }

         var7 = var1.toLowerCase();
         byte var10 = 0;
         if (var7.startsWith(ok.ie)) {
            if (var4 >= 2) {
               throw new IllegalStateException();
            }

            var10 = 1;
            var1 = var1.substring(ok.ie.length());
         } else if (var7.startsWith(ok.id)) {
            if (var4 >= 2) {
               throw new IllegalStateException();
            }

            var10 = 2;
            var1 = var1.substring(ok.id.length());
         } else if (var7.startsWith(ok.is)) {
            if (var4 >= 2) {
               throw new IllegalStateException();
            }

            var10 = 3;
            var1 = var1.substring(ok.is.length());
         } else if (var7.startsWith(ok.ia)) {
            if (var4 >= 2) {
               throw new IllegalStateException();
            }

            var10 = 4;
            var1 = var1.substring(ok.ia.length());
         } else if (var7.startsWith(ok.if)) {
            if (var4 >= 2) {
               throw new IllegalStateException();
            }

            var10 = 5;
            var1 = var1.substring(ok.if.length());
         }

         var5.ag.bu(var8, (byte)33);
         var5.ag.bu(var10, (byte)3);
         if (null != var9) {
            if (var4 >= 2) {
               throw new IllegalStateException();
            }

            for(int var11 = 0; var11 < var9.length; ++var11) {
               var5.ag.bu(var9[var11], (byte)62);
            }
         }

         lc.ae(var5.ag, var1, 582770794);
         if (var0 == oi.am.ac(-350930589)) {
            if (var4 >= 2) {
               throw new IllegalStateException();
            }

            var5.ag.bu(var3, (byte)-7);
         }

         var5.ag.ci(var5.ag.au * -1027766515 - var6, (byte)16);
         return var5;
      } catch (RuntimeException var12) {
         throw vk.ae(var12, "qh.ac(" + ')');
      }
   }
}
