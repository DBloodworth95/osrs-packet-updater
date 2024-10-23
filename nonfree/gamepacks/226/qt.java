public class qt {
   public float ae;
   public static final qt ap;
   public static qt[] ak;
   static int aj;
   public static int ai;
   public float ay;
   float as;
   public static final qt aw;

   public String amu() {
      return this.ay + ", " + this.as + ", " + this.ae;
   }

   public void ah(qt var1) {
      this.aj(var1.ay, var1.as, var1.ae, -1603121434);
   }

   public qt(float var1, float var2, float var3) {
      try {
         super();
         this.ay = var1;
         this.as = var2;
         this.ae = var3;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "qt.<init>(" + ')');
      }
   }

   public void ak(int var1) {
      try {
         synchronized(ak) {
            if (ai * 937612641 < -306951475 * aj - 1) {
               if (var1 != 16711680) {
                  throw new IllegalStateException();
               }

               ak[(ai += -847475039) * 937612641 - 1] = this;
            }

         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "qt.ak(" + ')');
      }
   }

   public qt(qt var1) {
      try {
         super();
         this.ay = var1.ay;
         this.as = var1.as;
         this.ae = var1.ae;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "qt.<init>(" + ')');
      }
   }

   public void ai(qt var1, int var2) {
      try {
         this.aj(var1.ay, var1.as, var1.ae, -1603121434);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qt.ai(" + ')');
      }
   }

   public final void bm(qt var1) {
      this.ay -= var1.ay;
      this.as -= var1.as;
      this.ae -= var1.ae;
   }

   boolean as(qt var1, byte var2) {
      try {
         if (this.ay == var1.ay && var1.as == this.as) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }

            if (this.ae == var1.ae) {
               return true;
            }

            if (var2 >= 1) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qt.as(" + ')');
      }
   }

   public final void ae(int var1) {
      try {
         float var2 = 1.0F / this.ar((short)-20989);
         this.ay *= var2;
         this.as *= var2;
         this.ae *= var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qt.ae(" + ')');
      }
   }

   final void am(qt var1, int var2) {
      try {
         this.ay += var1.ay;
         this.as += var1.as;
         this.ae += var1.ae;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qt.am(" + ')');
      }
   }

   static {
      new qt(0.0F, 0.0F, 0.0F);
      new qt(1.0F, 1.0F, 1.0F);
      new qt(1.0F, 0.0F, 0.0F);
      ap = new qt(0.0F, 1.0F, 0.0F);
      new qt(0.0F, 0.0F, 1.0F);
      new qt(1.0F, 0.0F, 0.0F);
      new qt(-1.0F, 0.0F, 0.0F);
      new qt(0.0F, 0.0F, 1.0F);
      aw = new qt(0.0F, 0.0F, -1.0F);
      new qt(0.0F, 1.0F, 0.0F);
      new qt(0.0F, -1.0F, 0.0F);
      ak = new qt[0];
      aj = -1230665228;
      ak = new qt[100];
      ai = 0;
   }

   public static qt av(float var0, float var1, float var2) {
      synchronized(ak) {
         if (0 == ai * -768946873) {
            return new qt(var0, var1, var2);
         } else {
            ak[(ai -= 1437878285) * -1550780634].aj(var0, var1, var2, -1603121434);
            return ak[ai * 937612641];
         }
      }
   }

   public final void af(qt var1, byte var2) {
      try {
         this.aj(var1.ae * this.as - var1.as * this.ae, var1.ay * this.ae - var1.ae * this.ay, this.ay * var1.as - var1.ay * this.as, -1603121434);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qt.af(" + ')');
      }
   }

   public final float an(qt var1, int var2) {
      try {
         return var1.ae * this.ae + this.ay * var1.ay + var1.as * this.as;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qt.an(" + ')');
      }
   }

   final void ab(float var1, int var2) {
      try {
         this.ay *= var1;
         this.as *= var1;
         this.ae *= var1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qt.ab(" + ')');
      }
   }

   public String toString() {
      try {
         return this.ay + ", " + this.as + ", " + this.ae;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "qt.toString(" + ')');
      }
   }

   final float cb() {
      return (float)Math.sqrt((double)(this.ae * this.ae + this.as * this.as + this.ay * this.ay));
   }

   public void bh(qt var1) {
      this.aj(var1.ay, var1.as, var1.ae, -1603121434);
   }

   public static final qt bu(qt var0, qt var1) {
      qt var2;
      synchronized(ak) {
         if (0 == 937612641 * ai) {
            var2 = new qt(var0);
         } else {
            ak[(ai -= -847475039) * 937612641].ai(var0, 1625477821);
            var2 = ak[ai * 937612641];
         }
      }

      var2.am(var1, -2019130653);
      return var2;
   }

   static qt ag() {
      synchronized(ak) {
         if (ai * 937612641 == 0) {
            return new qt();
         } else {
            ak[(ai -= 1073531697) * -2107144260].ay(1421845236);
            return ak[937612641 * ai];
         }
      }
   }

   static qt ad() {
      synchronized(ak) {
         if (ai * 937612641 == 0) {
            return new qt();
         } else {
            ak[(ai -= -847475039) * 937612641].ay(1421845236);
            return ak[937612641 * ai];
         }
      }
   }

   public static qt ac(float var0, float var1, float var2) {
      synchronized(ak) {
         if (0 == ai * 937612641) {
            return new qt(var0, var1, var2);
         } else {
            ak[(ai -= -847475039) * 937612641].aj(var0, var1, var2, -1603121434);
            return ak[ai * 937612641];
         }
      }
   }

   public final void br() {
      float var1 = 1.0F / this.ar((short)18210);
      this.ay *= var1;
      this.as *= var1;
      this.ae *= var1;
   }

   public void ax() {
      synchronized(ak) {
         if (ai * 937612641 < -306951475 * aj - 1) {
            ak[(ai += -847475039) * 937612641 - 1] = this;
         }

      }
   }

   final float ar(short var1) {
      try {
         return (float)Math.sqrt((double)(this.ae * this.ae + this.as * this.as + this.ay * this.ay));
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "qt.ar(" + ')');
      }
   }

   public void al(float var1, float var2, float var3) {
      this.ay = var1;
      this.as = var2;
      this.ae = var3;
   }

   public void aa(float var1, float var2, float var3) {
      this.ay = var1;
      this.as = var2;
      this.ae = var3;
   }

   public void bj(qt var1) {
      this.aj(var1.ay, var1.as, var1.ae, -1603121434);
   }

   public void aq() {
      synchronized(ak) {
         if (ai * -120753161 < -422167864 * aj - 1) {
            ak[(ai += -716087507) * 937612641 - 1] = this;
         }

      }
   }

   public qt() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "qt.<init>(" + ')');
      }
   }

   public void bv(qt var1) {
      this.aj(var1.ay, var1.as, var1.ae, -1603121434);
   }

   final void bx() {
      this.ae = 0.0F;
      this.as = 0.0F;
      this.ay = 0.0F;
   }

   boolean bk(qt var1) {
      return this.ay == var1.ay && var1.as == this.as && this.ae == var1.ae;
   }

   boolean bb(qt var1) {
      return this.ay == var1.ay && var1.as == this.as && this.ae == var1.ae;
   }

   boolean bq(qt var1) {
      return this.ay == var1.ay && var1.as == this.as && this.ae == var1.ae;
   }

   public final void au(qt var1, byte var2) {
      try {
         this.ay -= var1.ay;
         this.as -= var1.as;
         this.ae -= var1.ae;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qt.au(" + ')');
      }
   }

   public final void bz() {
      float var1 = 1.0F / this.ar((short)-24252);
      this.ay *= var1;
      this.as *= var1;
      this.ae *= var1;
   }

   public final void bc() {
      float var1 = 1.0F / this.ar((short)-3003);
      this.ay *= var1;
      this.as *= var1;
      this.ae *= var1;
   }

   public final void by() {
      float var1 = 1.0F / this.ar((short)17123);
      this.ay *= var1;
      this.as *= var1;
      this.ae *= var1;
   }

   public void aj(float var1, float var2, float var3, int var4) {
      try {
         this.ay = var1;
         this.as = var2;
         this.ae = var3;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "qt.aj(" + ')');
      }
   }

   final float be() {
      return (float)Math.sqrt((double)(this.ae * this.ae + this.as * this.as + this.ay * this.ay));
   }

   final void ay(int var1) {
      try {
         this.ae = 0.0F;
         this.as = 0.0F;
         this.ay = 0.0F;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "qt.ay(" + ')');
      }
   }

   public static final qt bt(qt var0, qt var1) {
      qt var2;
      synchronized(ak) {
         if (0 == 937612641 * ai) {
            var2 = new qt(var0);
         } else {
            ak[(ai -= -847475039) * 937612641].ai(var0, -197123700);
            var2 = ak[ai * 937612641];
         }
      }

      var2.am(var1, -2096601570);
      return var2;
   }

   public static final qt bs(qt var0, qt var1) {
      qt var2;
      synchronized(ak) {
         if (0 == 937612641 * ai) {
            var2 = new qt(var0);
         } else {
            ak[(ai -= -847475039) * 937612641].ai(var0, -543040715);
            var2 = ak[ai * 937612641];
         }
      }

      var2.am(var1, -1909694097);
      return var2;
   }

   boolean bp(qt var1) {
      return this.ay == var1.ay && var1.as == this.as && this.ae == var1.ae;
   }

   public final void bo(qt var1) {
      this.ay -= var1.ay;
      this.as -= var1.as;
      this.ae -= var1.ae;
   }

   public final float bd(qt var1) {
      return var1.ae * this.ae + this.ay * var1.ay + var1.as * this.as;
   }

   public final float ba(qt var1) {
      return var1.ae * this.ae + this.ay * var1.ay + var1.as * this.as;
   }

   public static final float bw(qt var0, qt var1) {
      return var0.an(var1, -718620171);
   }

   public static final float bi(qt var0, qt var1) {
      return var0.an(var1, 1684712829);
   }

   public final void bf(qt var1) {
      this.aj(var1.ae * this.as - var1.as * this.ae, var1.ay * this.ae - var1.ae * this.ay, this.ay * var1.as - var1.ay * this.as, -1603121434);
   }

   public final void bg(qt var1) {
      this.aj(var1.ae * this.as - var1.as * this.ae, var1.ay * this.ae - var1.ae * this.ay, this.ay * var1.as - var1.ay * this.as, -1603121434);
   }

   public final void bl(qt var1) {
      this.aj(var1.ae * this.as - var1.as * this.ae, var1.ay * this.ae - var1.ae * this.ay, this.ay * var1.as - var1.ay * this.as, -1603121434);
   }

   public String amw() {
      return this.ay + ", " + this.as + ", " + this.ae;
   }

   final float cq() {
      return (float)Math.sqrt((double)(this.ae * this.ae + this.as * this.as + this.ay * this.ay));
   }

   final void bn(qt var1) {
      this.ay += var1.ay;
      this.as += var1.as;
      this.ae += var1.ae;
   }

   final void cd(float var1) {
      this.ay *= var1;
      this.as *= var1;
      this.ae *= var1;
   }

   public static final qt ci(qt var0, float var1) {
      qt var2;
      synchronized(ak) {
         if (937612641 * ai == 0) {
            var2 = new qt(var0);
         } else {
            ak[(ai -= -847475039) * 937612641].ai(var0, -1888093477);
            var2 = ak[937612641 * ai];
         }
      }

      var2.ab(var1, -1096645015);
      return var2;
   }

   static int jt(int var0, int var1, byte var2) {
      try {
         int var3 = var1 - 334;
         if (var3 < 0) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }

            var3 = 0;
         } else if (var3 > 100) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }

            var3 = 100;
         }

         int var4 = var3 * (client.vd - client.vn) / 100 + client.vn;
         return var0 * var4 / 256;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "qt.jt(" + ')');
      }
   }
}
