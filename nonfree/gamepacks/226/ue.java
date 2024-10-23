import java.util.Iterator;

public class ue extends tl implements le {
   final int aj;
   static vv[] kn;
   final ml ak;
   public static final int ay = 8;
   final pe aw;

   public Iterator bz() {
      return new ux(this);
   }

   public ue(oy var1, int var2, pn var3, pe var4) {
      try {
         super(var1, var3, var4 != null ? var4.cq(var2, 429730592) : 0);
         this.ak = new ml(64);
         this.aw = var4;
         this.aj = var2 * -1986276045;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ue.<init>(" + ')');
      }
   }

   tq ag(int var1, int var2) {
      try {
         byte[] var3 = this.aw.bm(this.aj * 1498689019, var1, 2090637656);
         tq var4 = new tq(var1);
         if (var3 != null) {
            if (var2 <= -1450976103) {
               throw new IllegalStateException();
            }

            var4.ay(new vl(var3), 534052529);
         }

         return var4;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ue.ag(" + ')');
      }
   }

   public void ad(int var1) {
      try {
         synchronized(this.ak) {
            this.ak.as();
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ue.ad(" + ')');
      }
   }

   public Iterator iterator() {
      try {
         return new ux(this);
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ue.iterator(" + ')');
      }
   }

   public Iterator bq() {
      return new ux(this);
   }

   public Iterator bp() {
      return new ux(this);
   }

   protected tv am(int var1) {
      synchronized(this.ak) {
         tq var2 = (tq)this.ak.ap((long)var1);
         if (var2 == null) {
            var2 = this.ag(var1, -1247643026);
            this.ak.aj(var2, (long)var1);
         }

         return var2;
      }
   }

   protected tv ai(int var1) {
      synchronized(this.ak) {
         tq var2 = (tq)this.ak.ap((long)var1);
         if (var2 == null) {
            var2 = this.ag(var1, -599080982);
            this.ak.aj(var2, (long)var1);
         }

         return var2;
      }
   }

   protected tv ay(int var1) {
      synchronized(this.ak) {
         tq var2 = (tq)this.ak.ap((long)var1);
         if (var2 == null) {
            var2 = this.ag(var1, 1679330850);
            this.ak.aj(var2, (long)var1);
         }

         return var2;
      }
   }

   protected tv as(int var1) {
      synchronized(this.ak) {
         tq var2 = (tq)this.ak.ap((long)var1);
         if (var2 == null) {
            var2 = this.ag(var1, 692417048);
            this.ak.aj(var2, (long)var1);
         }

         return var2;
      }
   }

   protected tv ae(int var1) {
      synchronized(this.ak) {
         tq var2 = (tq)this.ak.ap((long)var1);
         if (var2 == null) {
            var2 = this.ag(var1, 1348515066);
            this.ak.aj(var2, (long)var1);
         }

         return var2;
      }
   }

   protected tv ap(int var1, byte var2) {
      try {
         synchronized(this.ak) {
            tq var3 = (tq)this.ak.ap((long)var1);
            if (var3 == null) {
               if (var2 == -9) {
                  throw new IllegalStateException();
               }

               var3 = this.ag(var1, 157929333);
               this.ak.aj(var3, (long)var1);
            }

            return var3;
         }
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "ue.ap(" + ')');
      }
   }
}
