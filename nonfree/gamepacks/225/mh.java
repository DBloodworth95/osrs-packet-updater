public final class mh {
   ui ag;
   int ae;
   pq am;
   int ac;
   mo ax;

   public Object at(long var1) {
      mb var3 = (mb)this.ag.ac(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.ac();
         if (var4 == null) {
            var3.jb();
            var3.jz();
            this.ae += var3.ae;
            return null;
         } else {
            if (var3.ae()) {
               mc var5 = new mc(var4, var3.ae);
               this.ag.ae(var5, var3.hk);
               this.am.ae(var5);
               var5.ef = 0L;
               var3.jb();
               var3.jz();
            } else {
               this.am.ae(var3);
               var3.ef = 0L;
            }

            return var4;
         }
      }
   }

   public mh(int var1, int var2) {
      this.am = new pq();
      this.ac = var1;
      this.ae = var1;

      int var3;
      for(var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
      }

      this.ag = new ui(var3);
   }

   public Object ac(long var1) {
      mb var3 = (mb)this.ag.ac(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.ac();
         if (var4 == null) {
            var3.jb();
            var3.jz();
            this.ae += var3.ae;
            return null;
         } else {
            if (var3.ae()) {
               mc var5 = new mc(var4, var3.ae);
               this.ag.ae(var5, var3.hk);
               this.am.ae(var5);
               var5.ef = 0L;
               var3.jb();
               var3.jz();
            } else {
               this.am.ae(var3);
               var3.ef = 0L;
            }

            return var4;
         }
      }
   }

   public void ax(Object var1, long var2, int var4) {
      if (var4 > this.ac) {
         throw new IllegalStateException();
      } else {
         this.ae(var2);
         this.ae -= var4;

         while(this.ae < 0) {
            mb var5 = (mb)this.am.am();
            if (var5 == null) {
               throw new RuntimeException("");
            }

            if (!var5.ae()) {
            }

            this.ag(var5);
            if (this.ax != null) {
               this.ax.ac(var5.ac());
            }
         }

         mc var6 = new mc(var1, var4);
         this.ag.ae(var6, var2);
         this.am.ae(var6);
         var6.ef = 0L;
      }
   }

   public void ab(Object var1, long var2, int var4) {
      if (var4 > this.ac) {
         throw new IllegalStateException();
      } else {
         this.ae(var2);
         this.ae -= var4;

         while(this.ae < 0) {
            mb var5 = (mb)this.am.am();
            if (var5 == null) {
               throw new RuntimeException("");
            }

            if (!var5.ae()) {
            }

            this.ag(var5);
            if (this.ax != null) {
               this.ax.ac(var5.ac());
            }
         }

         mc var6 = new mc(var1, var4);
         this.ag.ae(var6, var2);
         this.am.ae(var6);
         var6.ef = 0L;
      }
   }

   public void am(Object var1, long var2) {
      this.ax(var1, var2, 1);
   }

   public void ao() {
      this.am.ac();
      this.ag.ag();
      this.ae = this.ac;
   }

   public void aq(int var1) {
      for(mb var2 = (mb)this.am.ax(); var2 != null; var2 = (mb)this.am.af()) {
         if (var2.ae()) {
            if (var2.ac() == null) {
               var2.jb();
               var2.jz();
               this.ae += var2.ae;
            }
         } else if (++var2.ef > (long)var1) {
            md var3 = new md(var2.ac(), var2.ae);
            this.ag.ae(var3, var2.hk);
            pq.ag(var3, var2);
            var2.jb();
            var2.jz();
         }
      }

   }

   public void af() {
      this.am.ac();
      this.ag.ag();
      this.ae = this.ac;
   }

   public void as() {
      this.am.ac();
      this.ag.ag();
      this.ae = this.ac;
   }

   public Object au(long var1) {
      mb var3 = (mb)this.ag.ac(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.ac();
         if (var4 == null) {
            var3.jb();
            var3.jz();
            this.ae += var3.ae;
            return null;
         } else {
            if (var3.ae()) {
               mc var5 = new mc(var4, var3.ae);
               this.ag.ae(var5, var3.hk);
               this.am.ae(var5);
               var5.ef = 0L;
               var3.jb();
               var3.jz();
            } else {
               this.am.ae(var3);
               var3.ef = 0L;
            }

            return var4;
         }
      }
   }

   public mh(int var1) {
      this(var1, var1);
   }

   public void al(Object var1, long var2) {
      this.ax(var1, var2, 1);
   }

   public void ad(Object var1, long var2) {
      this.ax(var1, var2, 1);
   }

   public void ah(Object var1, long var2) {
      this.ax(var1, var2, 1);
   }

   void ar(mb var1) {
      if (var1 != null) {
         var1.jb();
         var1.jz();
         this.ae += var1.ae;
      }

   }

   public void ap(Object var1, long var2, int var4) {
      if (var4 > this.ac) {
         throw new IllegalStateException();
      } else {
         this.ae(var2);
         this.ae -= var4;

         while(this.ae < 0) {
            mb var5 = (mb)this.am.am();
            if (var5 == null) {
               throw new RuntimeException("");
            }

            if (!var5.ae()) {
            }

            this.ag(var5);
            if (this.ax != null) {
               this.ax.ac(var5.ac());
            }
         }

         mc var6 = new mc(var1, var4);
         this.ag.ae(var6, var2);
         this.am.ae(var6);
         var6.ef = 0L;
      }
   }

   public void az(int var1) {
      for(mb var2 = (mb)this.am.ax(); var2 != null; var2 = (mb)this.am.af()) {
         if (var2.ae()) {
            if (var2.ac() == null) {
               var2.jb();
               var2.jz();
               this.ae += var2.ae;
            }
         } else if (++var2.ef > (long)var1) {
            md var3 = new md(var2.ac(), var2.ae);
            this.ag.ae(var3, var2.hk);
            pq.ag(var3, var2);
            var2.jb();
            var2.jz();
         }
      }

   }

   public void aa(int var1) {
      for(mb var2 = (mb)this.am.ax(); var2 != null; var2 = (mb)this.am.af()) {
         if (var2.ae()) {
            if (var2.ac() == null) {
               var2.jb();
               var2.jz();
               this.ae += var2.ae;
            }
         } else if (++var2.ef > (long)var1) {
            md var3 = new md(var2.ac(), var2.ae);
            this.ag.ae(var3, var2.hk);
            pq.ag(var3, var2);
            var2.jb();
            var2.jz();
         }
      }

   }

   public void ai(int var1) {
      for(mb var2 = (mb)this.am.ax(); var2 != null; var2 = (mb)this.am.af()) {
         if (var2.ae()) {
            if (var2.ac() == null) {
               var2.jb();
               var2.jz();
               this.ae += var2.ae;
            }
         } else if (++var2.ef > (long)var1) {
            md var3 = new md(var2.ac(), var2.ae);
            this.ag.ae(var3, var2.hk);
            pq.ag(var3, var2);
            var2.jb();
            var2.jz();
         }
      }

   }

   void ae(long var1) {
      mb var3 = (mb)this.ag.ac(var1);
      this.ag(var3);
   }

   public void aj() {
      this.am.ac();
      this.ag.ag();
      this.ae = this.ac;
   }

   public void ay() {
      this.am.ac();
      this.ag.ag();
      this.ae = this.ac;
   }

   void ag(mb var1) {
      if (var1 != null) {
         var1.jb();
         var1.jz();
         this.ae += var1.ae;
      }

   }

   public void av() {
      this.am.ac();
      this.ag.ag();
      this.ae = this.ac;
   }
}
