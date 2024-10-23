public class cb extends tw {
   static final int ao = 10;
   bi ap;
   public static pe aw;
   static final String ak = "_";

   public boolean as() {
      return this.ap == null;
   }

   static int bt(int var0, int var1) {
      try {
         return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "cb.bt(" + ')');
      }
   }

   public cb(bt var1) {
      try {
         super();
         this.ap = new bi((cd)null, var1);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "cb.<init>(" + ')');
      }
   }

   public boolean ap(int var1) {
      try {
         boolean var10000;
         if (this.ap == null) {
            if (var1 != 1329688603) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "cb.ap(" + ')');
      }
   }

   public bt aw(int var1) {
      try {
         if (null != this.ap) {
            if (var1 == -10278448) {
               throw new IllegalStateException();
            }

            if (this.ap.ak.tryLock()) {
               if (var1 == -10278448) {
                  throw new IllegalStateException();
               }

               bt var2;
               try {
                  var2 = this.aj(80838377);
               } finally {
                  this.ap.ak.unlock();
               }

               return var2;
            }
         }

         return null;
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "cb.aw(" + ')');
      }
   }

   public bt ao() {
      if (this.ap != null) {
         this.ap.ak.lock();

         bt var1;
         try {
            var1 = this.aj(1463741703);
         } finally {
            this.ap.ak.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   bt aj(int var1) {
      try {
         if (null == this.ap.aw) {
            if (var1 == 403513814) {
               throw new IllegalStateException();
            }

            this.ap.aw = this.ap.ap.as((int[])null);
            this.ap.ap = null;
         }

         return this.ap.aw;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "cb.aj(" + ')');
      }
   }

   public boolean ai() {
      return this.ap == null;
   }

   public boolean ay() {
      return this.ap == null;
   }

   cb(cd var1) {
      try {
         super();
         if (null != var1) {
            this.ap = new bi(var1, (bt)null);
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "cb.<init>(" + ')');
      }
   }

   public cb() {
      try {
         super();
         this.ap = null;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "cb.<init>(" + ')');
      }
   }

   public static boolean am(pe var0, int var1, int var2, int var3) {
      try {
         byte[] var4 = var0.bm(var1, var2, 2141072034);
         if (null == var4) {
            if (var3 <= -451139158) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            gw.au(var4, 1724035439);
            return true;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "cb.am(" + ')');
      }
   }

   public bt af() {
      if (this.ap != null) {
         this.ap.ak.lock();

         bt var1;
         try {
            var1 = this.aj(-2021730027);
         } finally {
            this.ap.ak.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   public bt au() {
      if (null != this.ap && this.ap.ak.tryLock()) {
         bt var1;
         try {
            var1 = this.aj(1911279054);
         } finally {
            this.ap.ak.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   public bt an() {
      if (null != this.ap && this.ap.ak.tryLock()) {
         bt var1;
         try {
            var1 = this.aj(467598409);
         } finally {
            this.ap.ak.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   static final void mx(int var0, int var1) {
      try {
         if (!qk.ek.ak(var0, 1303180882)) {
            if (var1 <= -1241751523) {
               throw new IllegalStateException();
            }
         } else {
            et.np(qk.ek.ay[var0], -1, (byte)45);
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "cb.mx(" + ')');
      }
   }

   public boolean am() {
      return this.ap == null;
   }

   bt ar() {
      if (null == this.ap.aw) {
         this.ap.aw = this.ap.ap.as((int[])null);
         this.ap.ap = null;
      }

      return this.ap.aw;
   }

   bt ab() {
      if (null == this.ap.aw) {
         this.ap.aw = this.ap.ap.as((int[])null);
         this.ap.ap = null;
      }

      return this.ap.aw;
   }

   public boolean ae() {
      return this.ap == null;
   }

   bt ag() {
      if (null == this.ap.aw) {
         this.ap.aw = this.ap.ap.as((int[])null);
         this.ap.ap = null;
      }

      return this.ap.aw;
   }

   bt ad() {
      if (null == this.ap.aw) {
         this.ap.aw = this.ap.ap.as((int[])null);
         this.ap.ap = null;
      }

      return this.ap.aw;
   }

   bt az() {
      if (null == this.ap.aw) {
         this.ap.aw = this.ap.ap.as((int[])null);
         this.ap.ap = null;
      }

      return this.ap.aw;
   }

   public bt at() {
      if (null != this.ap && this.ap.ak.tryLock()) {
         bt var1;
         try {
            var1 = this.aj(-1128796432);
         } finally {
            this.ap.ak.unlock();
         }

         return var1;
      } else {
         return null;
      }
   }

   public bt ak(int var1) {
      try {
         if (this.ap != null) {
            if (var1 != 490766395) {
               throw new IllegalStateException();
            } else {
               this.ap.ak.lock();

               bt var2;
               try {
                  var2 = this.aj(-631945268);
               } finally {
                  this.ap.ak.unlock();
               }

               return var2;
            }
         } else {
            return null;
         }
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "cb.ak(" + ')');
      }
   }
}
