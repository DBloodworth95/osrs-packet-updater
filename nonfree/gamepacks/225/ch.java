public class ch extends to {
   static final int ay = 21;
   static qy be;
   bt ac;
   public static final int ap = 12;
   static int cd;
   static int uy;
   static of ec;
   public static final double ag = 325.94932345220167D;
   public static final int ad = 1792;
   static final int aq = 600;

   public boolean ax() {
      return this.ac == null;
   }

   public static uj ac(int var0, int var1) {
      try {
         uj var2 = (uj)uj.ae.ac((long)var0);
         if (null != var2) {
            if (var1 != -44265172) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            byte[] var3 = uj.ac.bt(38, var0, (byte)11);
            var2 = new uj();
            if (var3 != null) {
               var2.ae(new vf(var3), -1027346321);
            }

            var2.ax((byte)-53);
            uj.ae.ag(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ch.ac(" + ')');
      }
   }

   public ch(bg var1) {
      try {
         super();
         this.ac = new bt((cf)null, var1);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ch.<init>(" + ')');
      }
   }

   public boolean ac(int var1) {
      try {
         boolean var10000;
         if (this.ac == null) {
            if (var1 != -1724018812) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ch.ac(" + ')');
      }
   }

   public bg ae(int var1) {
      try {
         if (null != this.ac) {
            if (var1 <= -1483692847) {
               throw new IllegalStateException();
            }

            if (this.ac.ag.tryLock()) {
               if (var1 <= -1483692847) {
                  throw new IllegalStateException();
               }

               bg var2;
               try {
                  var2 = this.am((short)16981);
               } finally {
                  this.ac.ag.unlock();
               }

               return var2;
            }
         }

         return null;
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "ch.ae(" + ')');
      }
   }

   public bg ag(int var1) {
      try {
         if (this.ac != null) {
            this.ac.ag.lock();

            bg var2;
            try {
               var2 = this.am((short)2188);
            } finally {
               this.ac.ag.unlock();
            }

            return var2;
         } else {
            return null;
         }
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "ch.ag(" + ')');
      }
   }

   public bg al() {
      if (this.ac != null) {
         this.ac.ag.lock();

         bg var1;
         try {
            var1 = this.am((short)25430);
         } finally {
            this.ac.ag.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   ch(cf var1) {
      try {
         super();
         if (null != var1) {
            this.ac = new bt(var1, (bg)null);
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ch.<init>(" + ')');
      }
   }

   public bg af() {
      if (null != this.ac && this.ac.ag.tryLock()) {
         bg var1;
         try {
            var1 = this.am((short)15184);
         } finally {
            this.ac.ag.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   bg ah() {
      if (this.ac.ae == null) {
         this.ac.ae = this.ac.ac.af((int[])null);
         this.ac.ac = null;
      }

      return this.ac.ae;
   }

   public ch() {
      try {
         super();
         this.ac = null;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ch.<init>(" + ')');
      }
   }

   public bg au() {
      if (null != this.ac && this.ac.ag.tryLock()) {
         bg var1;
         try {
            var1 = this.am((short)9926);
         } finally {
            this.ac.ag.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   public bg ar() {
      if (this.ac != null) {
         this.ac.ag.lock();

         bg var1;
         try {
            var1 = this.am((short)4033);
         } finally {
            this.ac.ag.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   bg am(short var1) {
      try {
         if (this.ac.ae == null) {
            if (var1 <= 1144) {
               throw new IllegalStateException();
            }

            this.ac.ae = this.ac.ac.af((int[])null);
            this.ac.ac = null;
         }

         return this.ac.ae;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ch.am(" + ')');
      }
   }

   public bg ad() {
      if (this.ac != null) {
         this.ac.ag.lock();

         bg var1;
         try {
            var1 = this.am((short)29531);
         } finally {
            this.ac.ag.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   public bg at() {
      if (null != this.ac && this.ac.ag.tryLock()) {
         bg var1;
         try {
            var1 = this.am((short)16129);
         } finally {
            this.ac.ag.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   static final void ie(int var0, byte var1) {
      try {
         bz.hs(1412334955);
         switch(var0) {
         case 1:
            cw.ao(24, 2047854572);
            dp.aa(ok.jt, ok.je, ok.jw, (byte)-15);
            break;
         case 2:
            cw.ao(24, 638913862);
            dp.aa(ok.jv, ok.jf, ok.jr, (byte)34);
         }

      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ch.ie(" + ')');
      }
   }

   static lc ac(byte[] var0, int var1) {
      try {
         if (null == var0) {
            if (var1 != -775651959) {
               throw new IllegalStateException();
            } else {
               return new lc();
            }
         } else {
            return new lc(ez.ac(var0, 35301021).ac);
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ch.ac(" + ')');
      }
   }

   public boolean aq() {
      return this.ac == null;
   }
}
