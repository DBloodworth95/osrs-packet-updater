public class fw {
   float[][] af;
   static final int bo = 1;
   float[][] ak;
   boolean ae;
   qs[] ai;
   qs[] ay;
   float[][] ao;
   static final int ar = 4;
   qs am;
   final qs[] aj;
   qs au;
   qs as;
   public final int ap;
   boolean at;
   static final int cc = 88;
   static int js;
   static int cj;
   public fw aw;
   float[][] an;

   qs bh() {
      return this.as;
   }

   void ap(byte var1) {
      try {
         this.an = new float[this.aj.length][3];
         this.ao = new float[this.aj.length][3];
         this.af = new float[this.aj.length][3];
         qs var2 = gu.aw(-1079631336);

         for(int var3 = 0; var3 < this.aj.length; ++var3) {
            if (var1 != 7) {
               throw new IllegalStateException();
            }

            qs var4 = this.aw(var3, (byte)-36);
            var2.am(var4, -1650103875);
            var2.ag((byte)100);
            this.an[var3] = var2.ay((byte)-9);
            this.ao[var3][0] = var4.ai[12];
            this.ao[var3][1] = var4.ai[13];
            this.ao[var3][2] = var4.ai[14];
            this.af[var3] = var4.aa(-2048300447);
         }

         var2.ak((byte)-18);
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "fw.ap(" + ')');
      }
   }

   qs aw(int var1, byte var2) {
      try {
         return this.aj[var1];
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "fw.aw(" + ')');
      }
   }

   qs ak(int var1, byte var2) {
      try {
         if (null == this.ai[var1]) {
            if (var2 == 5) {
               throw new IllegalStateException();
            }

            this.ai[var1] = new qs(this.aw(var1, (byte)-114));
            if (this.aw != null) {
               if (var2 == 5) {
                  throw new IllegalStateException();
               }

               this.ai[var1].ao(this.aw.ak(var1, (byte)16), 1292400146);
            } else {
               this.ai[var1].ao(qs.ay, -133975982);
            }
         }

         return this.ai[var1];
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "fw.ak(" + ')');
      }
   }

   qs aj(int var1, byte var2) {
      try {
         if (this.ay[var1] == null) {
            if (var2 == 3) {
               throw new IllegalStateException();
            }

            this.ay[var1] = new qs(this.ak(var1, (byte)109));
            this.ay[var1].ag((byte)100);
         }

         return this.ay[var1];
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "fw.aj(" + ')');
      }
   }

   void ai(qs var1, int var2) {
      try {
         this.as.am(var1, -1650103875);
         this.ae = true;
         this.at = true;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "fw.ai(" + ')');
      }
   }

   qs ay(byte var1) {
      try {
         return this.as;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "fw.ay(" + ')');
      }
   }

   qs as(byte var1) {
      try {
         if (this.ae) {
            this.am.am(this.ay((byte)-124), -1650103875);
            if (this.aw != null) {
               if (var1 == 1) {
                  throw new IllegalStateException();
               }

               this.am.ao(this.aw.as((byte)52), 1712802673);
            }

            this.ae = false;
         }

         return this.am;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "fw.as(" + ')');
      }
   }

   public qs ae(int var1, int var2) {
      try {
         if (this.at) {
            if (var2 <= 65536) {
               throw new IllegalStateException();
            }

            this.au.am(this.aj(var1, (byte)-55), -1650103875);
            this.au.ao(this.as((byte)-27), 1520842083);
            this.at = false;
         }

         return this.au;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "fw.ae(" + ')');
      }
   }

   float[] am(int var1, int var2) {
      try {
         return this.an[var1];
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "fw.am(" + ')');
      }
   }

   float[] at(int var1, int var2) {
      try {
         return this.ao[var1];
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "fw.at(" + ')');
      }
   }

   qs bx() {
      return this.as;
   }

   void al(qs var1) {
      this.as.am(var1, -1650103875);
      this.ae = true;
      this.at = true;
   }

   qs ao(int var1) {
      return this.aj[var1];
   }

   qs af(int var1) {
      return this.aj[var1];
   }

   qs ar(int var1) {
      return this.aj[var1];
   }

   qs ab(int var1) {
      return this.aj[var1];
   }

   float[] bn(int var1) {
      return this.af[var1];
   }

   float[] au(int var1, int var2) {
      try {
         return this.af[var1];
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "fw.au(" + ')');
      }
   }

   qs ad(int var1) {
      if (null == this.ai[var1]) {
         this.ai[var1] = new qs(this.aw(var1, (byte)-42));
         if (this.aw != null) {
            this.ai[var1].ao(this.aw.ak(var1, (byte)92), 235357124);
         } else {
            this.ai[var1].ao(qs.ay, 1331920039);
         }
      }

      return this.ai[var1];
   }

   qs ag(int var1) {
      if (null == this.ai[var1]) {
         this.ai[var1] = new qs(this.aw(var1, (byte)-80));
         if (this.aw != null) {
            this.ai[var1].ao(this.aw.ak(var1, (byte)-92), 2073914857);
         } else {
            this.ai[var1].ao(qs.ay, 1546417153);
         }
      }

      return this.ai[var1];
   }

   qs av(int var1) {
      if (this.ay[var1] == null) {
         this.ay[var1] = new qs(this.ak(var1, (byte)-21));
         this.ay[var1].ag((byte)100);
      }

      return this.ay[var1];
   }

   qs ax(int var1) {
      if (this.ay[var1] == null) {
         this.ay[var1] = new qs(this.ak(var1, (byte)-44));
         this.ay[var1].ag((byte)100);
      }

      return this.ay[var1];
   }

   qs aq(int var1) {
      if (this.ay[var1] == null) {
         this.ay[var1] = new qs(this.ak(var1, (byte)39));
         this.ay[var1].ag((byte)100);
      }

      return this.ay[var1];
   }

   float[] bu(int var1) {
      return this.af[var1];
   }

   void aa(qs var1) {
      this.as.am(var1, -1650103875);
      this.ae = true;
      this.at = true;
   }

   void ah(qs var1) {
      this.as.am(var1, -1650103875);
      this.ae = true;
      this.at = true;
   }

   qs bj() {
      return this.as;
   }

   float[] bc(int var1) {
      return this.ao[var1];
   }

   qs bv() {
      return this.as;
   }

   float[] by(int var1) {
      return this.af[var1];
   }

   qs bk() {
      if (this.ae) {
         this.am.am(this.ay((byte)-4), -1650103875);
         if (this.aw != null) {
            this.am.ao(this.aw.as((byte)-10), 771726395);
         }

         this.ae = false;
      }

      return this.am;
   }

   public qs bb(int var1) {
      if (this.at) {
         this.au.am(this.aj(var1, (byte)-13), -1650103875);
         this.au.ao(this.as((byte)-83), 590662630);
         this.at = false;
      }

      return this.au;
   }

   float[] bq(int var1) {
      return this.an[var1];
   }

   public fw(int var1, vl var2, boolean var3) {
      try {
         super();
         this.as = new qs();
         this.ae = true;
         this.am = new qs();
         this.at = true;
         this.au = new qs();
         this.ap = var2.cg(-1039125031) * 1186710879;
         this.aj = new qs[var1];
         this.ai = new qs[this.aj.length];
         this.ay = new qs[this.aj.length];
         this.ak = new float[this.aj.length][3];

         for(int var4 = 0; var4 < this.aj.length; ++var4) {
            this.aj[var4] = new qs(var2, var3);
            this.ak[var4][0] = var2.cc(14751905);
            this.ak[var4][1] = var2.cc(2036165888);
            this.ak[var4][2] = var2.cc(698788687);
         }

         this.ap((byte)7);
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "fw.<init>(" + ')');
      }
   }

   float[] bz(int var1) {
      return this.ao[var1];
   }

   qs ac(int var1) {
      if (null == this.ai[var1]) {
         this.ai[var1] = new qs(this.aw(var1, (byte)-14));
         if (this.aw != null) {
            this.ai[var1].ao(this.aw.ak(var1, (byte)-76), -115811324);
         } else {
            this.ai[var1].ao(qs.ay, 1914997657);
         }
      }

      return this.ai[var1];
   }

   qs az(int var1) {
      if (null == this.ai[var1]) {
         this.ai[var1] = new qs(this.aw(var1, (byte)-111));
         if (this.aw != null) {
            this.ai[var1].ao(this.aw.ak(var1, (byte)95), 1978310971);
         } else {
            this.ai[var1].ao(qs.ay, 1609125620);
         }
      }

      return this.ai[var1];
   }

   float[] br(int var1) {
      return this.af[var1];
   }

   float[] bp(int var1) {
      return this.an[var1];
   }

   void an() {
      this.an = new float[this.aj.length][3];
      this.ao = new float[this.aj.length][3];
      this.af = new float[this.aj.length][3];
      qs var1 = gu.aw(-1932419739);

      for(int var2 = 0; var2 < this.aj.length; ++var2) {
         qs var3 = this.aw(var2, (byte)-114);
         var1.am(var3, -1650103875);
         var1.ag((byte)100);
         this.an[var2] = var1.ay((byte)-78);
         this.ao[var2][0] = var3.ai[12];
         this.ao[var2][1] = var3.ai[13];
         this.ao[var2][2] = var3.ai[14];
         this.af[var2] = var3.aa(1770042106);
      }

      var1.ak((byte)-98);
   }

   public static void ap(pe var0, byte var1) {
      try {
         hg.ap = var0;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "fw.ap(" + ')');
      }
   }
}
