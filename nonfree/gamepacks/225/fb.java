public class fb {
   public fb ae;
   static final int sr = 100;
   qf[] ax;
   boolean ar;
   final qf[] am;
   qf[] aq;
   float[][] ag;
   boolean at;
   qf au;
   static of fj;
   qf al;
   float[][] ad;
   public final int ac;
   float[][] ap;
   float[][] ah;
   public static final int av = 21;
   qf af;

   qf bh() {
      if (this.at) {
         this.au.au(this.aq((byte)27), 1218100430);
         if (null != this.ae) {
            this.au.ah(this.ae.af(-343463375), -2015504260);
         }

         this.at = false;
      }

      return this.au;
   }

   void ac(int var1) {
      try {
         this.ad = new float[this.am.length][3];
         this.ah = new float[this.am.length][3];
         this.ap = new float[this.am.length][3];
         qf var2 = gw.ae(239016875);

         for(int var3 = 0; var3 < this.am.length; ++var3) {
            if (var1 >= -2062421968) {
               throw new IllegalStateException();
            }

            qf var4 = this.ae(var3, 1790433551);
            var2.au(var4, 1218100430);
            var2.ai((byte)-62);
            this.ad[var3] = var2.aq((byte)-5);
            this.ah[var3][0] = var4.ax[12];
            this.ah[var3][1] = var4.ax[13];
            this.ah[var3][2] = var4.ax[14];
            this.ap[var3] = var4.aw(-1345800832);
         }

         var2.ag(931156681);
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "fb.ac(" + ')');
      }
   }

   void ah() {
      this.ad = new float[this.am.length][3];
      this.ah = new float[this.am.length][3];
      this.ap = new float[this.am.length][3];
      qf var1 = gw.ae(246047006);

      for(int var2 = 0; var2 < this.am.length; ++var2) {
         qf var3 = this.ae(var2, -1766087263);
         var1.au(var3, 1218100430);
         var1.ai((byte)57);
         this.ad[var2] = var1.aq((byte)6);
         this.ah[var2][0] = var3.ax[12];
         this.ah[var2][1] = var3.ax[13];
         this.ah[var2][2] = var3.ax[14];
         this.ap[var2] = var3.aw(-1139138271);
      }

      var1.ag(1392145723);
   }

   qf ag(int var1, int var2) {
      try {
         if (this.ax[var1] == null) {
            this.ax[var1] = new qf(this.ae(var1, -1932221259));
            if (this.ae != null) {
               if (var2 != 1282771416) {
                  throw new IllegalStateException();
               }

               this.ax[var1].ah(this.ae.ag(var1, 1282771416), -2043149059);
            } else {
               this.ax[var1].ah(qf.aq, -1976836882);
            }
         }

         return this.ax[var1];
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "fb.ag(" + ')');
      }
   }

   qf am(int var1, int var2) {
      try {
         if (null == this.aq[var1]) {
            if (var2 <= -1730942168) {
               throw new IllegalStateException();
            }

            this.aq[var1] = new qf(this.ag(var1, 1282771416));
            this.aq[var1].ai((byte)2);
         }

         return this.aq[var1];
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "fb.am(" + ')');
      }
   }

   float[] bx(int var1) {
      return this.ad[var1];
   }

   qf aq(byte var1) {
      try {
         return this.af;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "fb.aq(" + ')');
      }
   }

   public fb(int var1, vf var2, boolean var3) {
      try {
         super();
         this.af = new qf();
         this.at = true;
         this.au = new qf();
         this.ar = true;
         this.al = new qf();
         this.ac = var2.cq(1008437560) * 1929269921;
         this.am = new qf[var1];
         this.ax = new qf[this.am.length];
         this.aq = new qf[this.am.length];
         this.ag = new float[this.am.length][3];

         for(int var4 = 0; var4 < this.am.length; ++var4) {
            this.am[var4] = new qf(var2, var3);
            this.ag[var4][0] = var2.cr(-1935627220);
            this.ag[var4][1] = var2.cr(-1935627220);
            this.ag[var4][2] = var2.cr(-1935627220);
         }

         this.ac(-2126074356);
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "fb.<init>(" + ')');
      }
   }

   public qf at(int var1, byte var2) {
      try {
         if (this.ar) {
            if (var2 >= 14) {
               throw new IllegalStateException();
            }

            this.al.au(this.am(var1, 780352272), 1218100430);
            this.al.ah(this.af(-42227819), -2030585948);
            this.ar = false;
         }

         return this.al;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "fb.at(" + ')');
      }
   }

   qf af(int var1) {
      try {
         if (this.at) {
            if (var1 >= 545514586) {
               throw new IllegalStateException();
            }

            this.au.au(this.aq((byte)35), 1218100430);
            if (null != this.ae) {
               if (var1 >= 545514586) {
                  throw new IllegalStateException();
               }

               this.au.ah(this.ae.af(-39007607), -2060578435);
            }

            this.at = false;
         }

         return this.au;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "fb.af(" + ')');
      }
   }

   float[] ar(int var1, byte var2) {
      try {
         return this.ah[var1];
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "fb.ar(" + ')');
      }
   }

   qf ae(int var1, int var2) {
      try {
         return this.am[var1];
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "fb.ae(" + ')');
      }
   }

   void ad() {
      this.ad = new float[this.am.length][3];
      this.ah = new float[this.am.length][3];
      this.ap = new float[this.am.length][3];
      qf var1 = gw.ae(-730025896);

      for(int var2 = 0; var2 < this.am.length; ++var2) {
         qf var3 = this.ae(var2, -2060094663);
         var1.au(var3, 1218100430);
         var1.ai((byte)-52);
         this.ad[var2] = var1.aq((byte)24);
         this.ah[var2][0] = var3.ax[12];
         this.ah[var2][1] = var3.ax[13];
         this.ah[var2][2] = var3.ax[14];
         this.ap[var2] = var3.aw(-1475201393);
      }

      var1.ag(1329050654);
   }

   void as(qf var1) {
      this.af.au(var1, 1218100430);
      this.at = true;
      this.ar = true;
   }

   void ao(qf var1) {
      this.af.au(var1, 1218100430);
      this.at = true;
      this.ar = true;
   }

   void ab() {
      this.ad = new float[this.am.length][3];
      this.ah = new float[this.am.length][3];
      this.ap = new float[this.am.length][3];
      qf var1 = gw.ae(1342580776);

      for(int var2 = 0; var2 < this.am.length; ++var2) {
         qf var3 = this.ae(var2, -696472774);
         var1.au(var3, 1218100430);
         var1.ai((byte)-35);
         this.ad[var2] = var1.aq((byte)6);
         this.ah[var2][0] = var3.ax[12];
         this.ah[var2][1] = var3.ax[13];
         this.ah[var2][2] = var3.ax[14];
         this.ap[var2] = var3.aw(-1672340572);
      }

      var1.ag(1160700803);
   }

   void ap() {
      this.ad = new float[this.am.length][3];
      this.ah = new float[this.am.length][3];
      this.ap = new float[this.am.length][3];
      qf var1 = gw.ae(-510480247);

      for(int var2 = 0; var2 < this.am.length; ++var2) {
         qf var3 = this.ae(var2, -2012738163);
         var1.au(var3, 1218100430);
         var1.ai((byte)-40);
         this.ad[var2] = var1.aq((byte)-62);
         this.ah[var2][0] = var3.ax[12];
         this.ah[var2][1] = var3.ax[13];
         this.ah[var2][2] = var3.ax[14];
         this.ap[var2] = var3.aw(-765240423);
      }

      var1.ag(1948973623);
   }

   qf aa(int var1) {
      if (this.ax[var1] == null) {
         this.ax[var1] = new qf(this.ae(var1, 1830430111));
         if (this.ae != null) {
            this.ax[var1].ah(this.ae.ag(var1, 1282771416), -2009001662);
         } else {
            this.ax[var1].ah(qf.aq, -2134443891);
         }
      }

      return this.ax[var1];
   }

   qf ai(int var1) {
      if (this.ax[var1] == null) {
         this.ax[var1] = new qf(this.ae(var1, 1236510956));
         if (this.ae != null) {
            this.ax[var1].ah(this.ae.ag(var1, 1282771416), -2058058252);
         } else {
            this.ax[var1].ah(qf.aq, -2017297834);
         }
      }

      return this.ax[var1];
   }

   float[] bs(int var1) {
      return this.ah[var1];
   }

   float[] al(int var1, int var2) {
      try {
         return this.ap[var1];
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "fb.al(" + ')');
      }
   }

   void ay(qf var1) {
      this.af.au(var1, 1218100430);
      this.at = true;
      this.ar = true;
   }

   void aj(qf var1) {
      this.af.au(var1, 1218100430);
      this.at = true;
      this.ar = true;
   }

   qf av() {
      return this.af;
   }

   qf aw() {
      return this.af;
   }

   qf an() {
      return this.af;
   }

   float[] bw(int var1) {
      return this.ap[var1];
   }

   qf bn() {
      return this.af;
   }

   qf ak() {
      return this.af;
   }

   public qf bd(int var1) {
      if (this.ar) {
         this.al.au(this.am(var1, -1200504800), 1218100430);
         this.al.ah(this.af(-2058587547), -2086256159);
         this.ar = false;
      }

      return this.al;
   }

   float[] ba(int var1) {
      return this.ap[var1];
   }

   float[] bf(int var1) {
      return this.ad[var1];
   }

   float[] bm(int var1) {
      return this.ad[var1];
   }

   void ax(qf var1, int var2) {
      try {
         this.af.au(var1, 1218100430);
         this.at = true;
         this.ar = true;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "fb.ax(" + ')');
      }
   }

   void az() {
      this.ad = new float[this.am.length][3];
      this.ah = new float[this.am.length][3];
      this.ap = new float[this.am.length][3];
      qf var1 = gw.ae(-99461042);

      for(int var2 = 0; var2 < this.am.length; ++var2) {
         qf var3 = this.ae(var2, -1236290170);
         var1.au(var3, 1218100430);
         var1.ai((byte)-15);
         this.ad[var2] = var1.aq((byte)-11);
         this.ah[var2][0] = var3.ax[12];
         this.ah[var2][1] = var3.ax[13];
         this.ah[var2][2] = var3.ax[14];
         this.ap[var2] = var3.aw(-2017994690);
      }

      var1.ag(1557706302);
   }

   float[] au(int var1, int var2) {
      try {
         return this.ad[var1];
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "fb.au(" + ')');
      }
   }

   static void ml(short var0) {
      try {
         if (client.od) {
            ny var1 = ir.ep.ae(-1659872565 * bp.og, 1157608211 * client.oj, 1569081104);
            if (null != var1) {
               if (var0 >= 321) {
                  return;
               }

               if (var1.fk != null) {
                  if (var0 >= 321) {
                     throw new IllegalStateException();
                  }

                  do var2 = new do();
                  var2.ag = var1;
                  var2.ac = var1.fk;
                  ij.ac(var2, -1964962609);
               }
            }

            client.ob = -215919553;
            client.od = false;
            dc.ni(var1, 667850230);
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "fb.ml(" + ')');
      }
   }
}
