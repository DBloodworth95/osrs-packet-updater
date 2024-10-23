public class pj {
   public int ak;
   public int aw;
   public int ai;
   public int aj;
   static final int bx = 1076101504;
   public int ay;
   byte ap;
   static final int cb = 100;

   public int am() {
      return this.ap & 7;
   }

   public pj(vl var1, boolean var2) {
      try {
         super();
         this.ap = var1.cu((byte)13);
         this.aw = var1.ce(1202369981) * 2057743675;
         this.ak = var1.ch(1203709469) * -1183504461;
         this.aj = var1.ch(1203709469) * 30552473;
         this.ai = var1.ch(1203709469) * 1422171145;
         this.ay = var1.ch(1203709469) * 915562125;
         if (var2) {
            int var4 = 0;
            boolean var5 = false;

            while(true) {
               int var6 = var1.cy((short)-1045);
               if (var6 == 255) {
                  Integer var3 = var5 ? var4 : null;
                  this.ap(var3, (short)20781);
                  break;
               }

               if (var6 != 0) {
                  throw new IllegalStateException("");
               }

               while(true) {
                  int var7 = var1.cy((short)-17443);
                  if (255 == var7) {
                     break;
                  }

                  var1.am -= -725588083;
                  if (var1.ce(1184058707) != 0) {
                     throw new IllegalStateException("");
                  }

                  if (var5) {
                     throw new IllegalStateException("");
                  }

                  var4 = var1.ch(1203709469);
                  var5 = true;
               }
            }
         }

      } catch (RuntimeException var8) {
         throw tm.aw(var8, "pj.<init>(" + ')');
      }
   }

   void ap(Integer var1, short var2) {
      try {
         ;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "pj.ap(" + ')');
      }
   }

   void ao(int var1) {
      this.ap &= -8;
      this.ap = (byte)(this.ap | var1 & 7);
   }

   public int aw(int var1) {
      try {
         return this.ap & 7;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "pj.aw(" + ')');
      }
   }

   void aj(int var1, byte var2) {
      try {
         this.ap &= -8;
         this.ap = (byte)(this.ap | var1 & 7);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "pj.aj(" + ')');
      }
   }

   void ai(int var1, int var2) {
      try {
         this.ap &= -9;
         if (var1 == 1) {
            if (var2 <= -828946148) {
               throw new IllegalStateException();
            }

            this.ap = (byte)(this.ap | 8);
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "pj.ai(" + ')');
      }
   }

   void ay(Integer var1) {
   }

   public pj() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "pj.<init>(" + ')');
      }
   }

   public int au() {
      return (this.ap & 8) == 8 ? 1 : 0;
   }

   void as(Integer var1) {
   }

   public int at() {
      return (this.ap & 8) == 8 ? 1 : 0;
   }

   void ag(int var1) {
      this.ap = (byte)(this.ap & -1736681872);
      if (var1 == 1) {
         this.ap = (byte)(this.ap | 8);
      }

   }

   public int an() {
      return (this.ap & 8) == 8 ? 1 : 0;
   }

   void af(int var1) {
      this.ap &= -8;
      this.ap = (byte)(this.ap | var1 & 7);
   }

   static void ap(int var0, byte var1) {
      try {
         sc.aw = -1882587237 * var0;
         qp.ap = new qp[var0];
         qp.ak = 0;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "pj.ap(" + ')');
      }
   }

   void ar(int var1) {
      this.ap = (byte)(this.ap & 669708116);
      this.ap = (byte)(this.ap | var1 & 7);
   }

   void ab(int var1) {
      this.ap &= -8;
      this.ap = (byte)(this.ap | var1 & 7);
   }

   void az(int var1) {
      this.ap &= -9;
      if (var1 == 1) {
         this.ap = (byte)(this.ap | 8);
      }

   }

   public int ae() {
      return this.ap & 7;
   }

   public int ak(byte var1) {
      try {
         return (this.ap & 8) == 8 ? 1 : 0;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "pj.ak(" + ')');
      }
   }

   static int ay(long var0) {
      try {
         return (int)(var0 >>> 14 & 3L);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "pj.ay(" + ')');
      }
   }
}
