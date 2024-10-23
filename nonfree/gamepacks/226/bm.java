import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class bm {
   bg ar;
   int bb;
   protected int[] af;
   long az;
   int ab;
   int ag;
   static final int an = 16384;
   boolean ah;
   long av;
   int ad;
   int ax;
   int aq;
   int al;
   long aa;
   int ac;
   public static be ao;
   bg[] bq;
   bg[] bp;
   static ng od;
   static final int br = 13;

   protected void ai(byte var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bm.ai(" + ')');
      }
   }

   public final synchronized void aq(bg var1, byte var2) {
      try {
         this.ar = var1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "bm.aq(" + ')');
      }
   }

   public final synchronized void al(byte var1) {
      try {
         if (this.af == null) {
            if (var1 < 5) {
               ;
            }
         } else {
            long var2 = ck.ap(-1373104542);

            try {
               if (this.av * -5222918417860129227L != 0L) {
                  if (var1 >= 5) {
                     throw new IllegalStateException();
                  }

                  if (var2 < -5222918417860129227L * this.av) {
                     if (var1 >= 5) {
                        throw new IllegalStateException();
                     }

                     return;
                  }

                  this.aw(this.ag * -1085729113, -226168878);
                  this.av = 0L;
                  this.ah = true;
               }

               int var4 = this.ak((byte)78);
               if (-628727583 * this.al - var4 > this.ax * -1549083179) {
                  if (var1 >= 5) {
                     throw new IllegalStateException();
                  }

                  this.ax = -1967164547 * (this.al * -628727583 - var4);
               }

               int var5 = this.ad * 904133821 + this.ac * 1174494273;
               if (256 + var5 > 16384) {
                  if (var1 >= 5) {
                     throw new IllegalStateException();
                  }

                  var5 = 16128;
               }

               if (256 + var5 > this.ag * -1085729113) {
                  if (var1 >= 5) {
                     throw new IllegalStateException();
                  }

                  this.ag += -54240256;
                  if (this.ag * -1085729113 > 16384) {
                     this.ag = -867844096;
                  }

                  this.ai((byte)61);
                  this.aw(this.ag * -1085729113, -145621942);
                  var4 = 0;
                  this.ah = true;
                  if (256 + var5 > this.ag * -1085729113) {
                     if (var1 >= 5) {
                        throw new IllegalStateException();
                     }

                     var5 = this.ag * -1085729113 - 256;
                     this.ac = (var5 - 904133821 * this.ad) * 1199092673;
                  }
               }

               while(var4 < var5) {
                  if (var1 >= 5) {
                     throw new IllegalStateException();
                  }

                  this.bv(this.af, 256);
                  this.aj();
                  var4 += 256;
               }

               if (var2 > this.aa * -779758542634195683L) {
                  if (var1 >= 5) {
                     return;
                  }

                  if (!this.ah) {
                     if (0 == -1549083179 * this.ax) {
                        if (var1 >= 5) {
                           throw new IllegalStateException();
                        }

                        if (708124981 * this.aq == 0) {
                           if (var1 >= 5) {
                              throw new IllegalStateException();
                           }

                           this.ai((byte)91);
                           this.av = 5550205381700441117L * (2000L + var2);
                           return;
                        }
                     }

                     this.ac = Math.min(708124981 * this.aq, this.ax * -1549083179) * 1199092673;
                     this.aq = -12321247 * this.ax;
                  } else {
                     this.ah = false;
                  }

                  this.ax = 0;
                  this.aa = (2000L + var2) * 2681668578896872757L;
               }

               this.al = -679025887 * var4;
            } catch (Exception var7) {
               this.ai((byte)102);
               this.av = 5550205381700441117L * (2000L + var2);
            }

            try {
               if (var2 > 500000L + 4554423640830226331L * this.az) {
                  if (var1 >= 5) {
                     throw new IllegalStateException();
                  }

                  var2 = this.az * 4554423640830226331L;
               }

               while(var2 > 5000L + 4554423640830226331L * this.az) {
                  if (var1 >= 5) {
                     throw new IllegalStateException();
                  }

                  this.bj(256, (byte)1);
                  this.az += 7733016067621658259L * (long)(256000 / (du.ai * -336955471));
               }
            } catch (Exception var6) {
               this.az = 7733016067621658259L * var2;
            }

         }
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "bm.al(" + ')');
      }
   }

   public final void aa(int var1) {
      try {
         this.ah = true;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bm.aa(" + ')');
      }
   }

   protected void aw(int var1, int var2) throws Exception {
      try {
         ;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "bm.aw(" + ')');
      }
   }

   protected int at() throws Exception {
      return this.ag * -1085729113;
   }

   final void bj(int var1, byte var2) {
      try {
         this.bb -= var1 * 1256111015;
         if (372128791 * this.bb < 0) {
            if (var2 != 1) {
               throw new IllegalStateException();
            }

            this.bb = 0;
         }

         if (null != this.ar) {
            this.ar.au(var1);
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "bm.bj(" + ')');
      }
   }

   final void bv(int[] var1, int var2) {
      int var3 = var2;
      if (vi.ay) {
         var3 = var2 << 1;
      }

      rb.at(var1, 0, var3);
      this.bb -= var2 * 1256111015;
      if (null != this.ar && this.bb * 372128791 <= 0) {
         this.bb += (du.ai * -336955471 >> 4) * 1256111015;
         mz.bx(this.ar, 954200168);
         this.bk(this.ar, this.ar.bt(), -1982858633);
         int var4 = 0;
         int var5 = 255;

         int var6;
         bg var10;
         label137:
         for(var6 = 7; 0 != var5; --var6) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if ((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  bg var11 = this.bq[var7];

                  label131:
                  while(true) {
                     while(true) {
                        if (var11 == null) {
                           break label131;
                        }

                        cy var12 = var11.ag;
                        if (null != var12 && var12.ay > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.ab;
                        } else {
                           var11.ad = true;
                           int var13 = var11.ae();
                           var4 += var13;
                           if (var12 != null) {
                              var12.ay += var13;
                           }

                           if (var4 >= 1123588325 * this.ab) {
                              break label137;
                           }

                           bg var14 = var11.ay();
                           if (var14 != null) {
                              for(int var15 = var11.az; var14 != null; var14 = var11.as()) {
                                 this.bk(var14, var15 * var14.bt() >> 8, -1419854205);
                              }
                           }

                           bg var18 = var11.ab;
                           var11.ab = null;
                           if (null == var10) {
                              this.bq[var7] = var18;
                           } else {
                              var10.ab = var18;
                           }

                           if (null == var18) {
                              this.bp[var7] = var10;
                           }

                           var11 = var18;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            bg var16 = this.bq[var6];
            bg[] var17 = this.bq;
            this.bp[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.ab;
               var16.ab = null;
            }
         }
      }

      if (this.bb * 372128791 < 0) {
         this.bb = 0;
      }

      if (null != this.ar) {
         this.ar.am(var1, 0, var2);
      }

      this.az = ck.ap(-1281538528) * 7733016067621658259L;
   }

   final void bk(bg var1, int var2, int var3) {
      try {
         int var4 = var2 >> 5;
         bg var5 = this.bp[var4];
         if (var5 == null) {
            if (var3 >= -866740689) {
               return;
            }

            this.bq[var4] = var1;
         } else {
            var5.ab = var1;
         }

         this.bp[var4] = var1;
         var1.az = var2;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "bm.bk(" + ')');
      }
   }

   protected bm() {
      try {
         super();
         this.ab = -777216608;
         this.az = ck.ap(-870783361) * 7733016067621658259L;
         this.av = 0L;
         this.ax = 0;
         this.aq = 0;
         this.al = 0;
         this.aa = 0L;
         this.ah = true;
         this.bb = 0;
         this.bq = new bg[8];
         this.bp = new bg[8];
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "bm.<init>(" + ')');
      }
   }

   public static final bm bb(io var0, int var1, int var2) {
      if (du.ai * 1141755837 == 0) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < 256) {
            var2 = 1684650721;
         }

         try {
            bm var3 = ao.ap(-1887389425);
            var3.af = new int[(vi.ay ? 2 : 1) * 256];
            var3.ad = -891718830 * var2;
            var3.ap((byte)14);
            var3.ag = -1069600489 * (1024 + (var2 & -1223358190));
            if (-1085729113 * var3.ag > 16384) {
               var3.ag = -1979517667;
            }

            var3.aw(var3.ag * -1085729113, -1878597086);
            if (2027059844 * rd.am > 0 && null == un.at) {
               un.at = new bd();
               as.ae = Executors.newScheduledThreadPool(1);
               as.ae.scheduleAtFixedRate(un.at, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (un.at != null) {
               if (un.at.ap[var1] != null) {
                  throw new IllegalArgumentException();
               }

               un.at.ap[var1] = var3;
            }

            return var3;
         } catch (Throwable var4) {
            return new bm();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   protected void ap(byte var1) throws Exception {
      try {
         ;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bm.ap(" + ')');
      }
   }

   protected void aj() throws Exception {
      try {
         ;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "bm.aj(" + ')');
      }
   }

   public final synchronized void bm() {
      if (un.at != null) {
         boolean var1 = true;

         for(int var2 = 0; var2 < 2; ++var2) {
            if (this == un.at.ap[var2]) {
               un.at.ap[var2] = null;
            }

            if (null != un.at.ap[var2]) {
               var1 = false;
            }
         }

         if (var1) {
            as.ae.shutdownNow();
            as.ae = null;
            un.at = null;
         }
      }

      this.ai((byte)82);
      this.af = null;
   }

   protected void ay(int var1) throws Exception {
      try {
         ;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bm.ay(" + ')');
      }
   }

   public final synchronized void by(bg var1) {
      this.ar = var1;
   }

   protected void ae(int var1) throws Exception {
   }

   protected int am() throws Exception {
      return this.ag * -1085729113;
   }

   public final synchronized void bu() {
      if (this.af != null) {
         long var1 = ck.ap(-658014351);

         try {
            if (this.av * -5222918417860129227L != 0L) {
               if (var1 < -5222918417860129227L * this.av) {
                  return;
               }

               this.aw(this.ag * -1085729113, 1933940284);
               this.av = 0L;
               this.ah = true;
            }

            int var3 = this.ak((byte)42);
            if (-628727583 * this.al - var3 > this.ax * -1549083179) {
               this.ax = -1967164547 * (this.al * -628727583 - var3);
            }

            int var4 = this.ad * 904133821 + this.ac * 1174494273;
            if (256 + var4 > 16384) {
               var4 = 16128;
            }

            if (256 + var4 > this.ag * -1085729113) {
               this.ag += -54240256;
               if (this.ag * -1085729113 > 16384) {
                  this.ag = -867844096;
               }

               this.ai((byte)49);
               this.aw(this.ag * -1085729113, 339512043);
               var3 = 0;
               this.ah = true;
               if (256 + var4 > this.ag * -1085729113) {
                  var4 = this.ag * -1085729113 - 256;
                  this.ac = (var4 - 904133821 * this.ad) * 1199092673;
               }
            }

            while(var3 < var4) {
               this.bv(this.af, 256);
               this.aj();
               var3 += 256;
            }

            if (var1 > this.aa * -779758542634195683L) {
               if (!this.ah) {
                  if (0 == -1549083179 * this.ax && 708124981 * this.aq == 0) {
                     this.ai((byte)87);
                     this.av = 5550205381700441117L * (2000L + var1);
                     return;
                  }

                  this.ac = Math.min(708124981 * this.aq, this.ax * -1549083179) * 1199092673;
                  this.aq = -12321247 * this.ax;
               } else {
                  this.ah = false;
               }

               this.ax = 0;
               this.aa = (2000L + var1) * 2681668578896872757L;
            }

            this.al = -679025887 * var3;
         } catch (Exception var6) {
            this.ai((byte)92);
            this.av = 5550205381700441117L * (2000L + var1);
         }

         try {
            if (var1 > 500000L + 4554423640830226331L * this.az) {
               var1 = this.az * 4554423640830226331L;
            }

            while(var1 > 5000L + 4554423640830226331L * this.az) {
               this.bj(256, (byte)1);
               this.az += 7733016067621658259L * (long)(256000 / (du.ai * -336955471));
            }
         } catch (Exception var5) {
            this.az = 7733016067621658259L * var1;
         }

      }
   }

   protected int au() throws Exception {
      return this.ag * -1085729113;
   }

   protected void ad() {
   }

   protected void ao() throws Exception {
   }

   public final synchronized void bh(int var1) {
      try {
         if (un.at != null) {
            boolean var2 = true;

            for(int var3 = 0; var3 < 2; ++var3) {
               if (var1 >= -1441237162) {
                  throw new IllegalStateException();
               }

               if (this == un.at.ap[var3]) {
                  if (var1 >= -1441237162) {
                     throw new IllegalStateException();
                  }

                  un.at.ap[var3] = null;
               }

               if (null != un.at.ap[var3]) {
                  if (var1 >= -1441237162) {
                     throw new IllegalStateException();
                  }

                  var2 = false;
               }
            }

            if (var2) {
               if (var1 >= -1441237162) {
                  return;
               }

               as.ae.shutdownNow();
               as.ae = null;
               un.at = null;
            }
         }

         this.ai((byte)63);
         this.af = null;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "bm.bh(" + ')');
      }
   }

   protected int ak(byte var1) throws Exception {
      try {
         return this.ag * -1085729113;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bm.ak(" + ')');
      }
   }

   protected void ab() throws Exception {
   }

   protected void af() throws Exception {
   }

   protected void ag() {
   }

   final void bw(int var1) {
      this.bb -= var1 * 1256111015;
      if (372128791 * this.bb < 0) {
         this.bb = 0;
      }

      if (null != this.ar) {
         this.ar.au(var1);
      }

   }

   protected void ac() throws Exception {
   }

   protected void av() throws Exception {
   }

   protected int an() throws Exception {
      return this.ag * -395170799;
   }

   public static final bm bq(io var0, int var1, int var2) {
      if (du.ai * -336955471 == 0) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < 256) {
            var2 = 256;
         }

         try {
            bm var3 = ao.ap(-1930506180);
            var3.af = new int[(vi.ay ? 2 : 1) * 256];
            var3.ad = -2134188395 * var2;
            var3.ap((byte)-82);
            var3.ag = -1069600489 * (1024 + (var2 & -1024));
            if (-1085729113 * var3.ag > 16384) {
               var3.ag = -867844096;
            }

            var3.aw(var3.ag * -1085729113, -361692980);
            if (1834009785 * rd.am > 0 && null == un.at) {
               un.at = new bd();
               as.ae = Executors.newScheduledThreadPool(1);
               as.ae.scheduleAtFixedRate(un.at, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (un.at != null) {
               if (un.at.ap[var1] != null) {
                  throw new IllegalArgumentException();
               }

               un.at.ap[var1] = var3;
            }

            return var3;
         } catch (Throwable var4) {
            return new bm();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public static final bm bp(io var0, int var1, int var2) {
      if (du.ai * -336955471 == 0) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < 256) {
            var2 = -1775819047;
         }

         try {
            bm var3 = ao.ap(1149385218);
            var3.af = new int[(vi.ay ? 2 : 1) * -1609801949];
            var3.ad = 653857597 * var2;
            var3.ap((byte)-56);
            var3.ag = -1069600489 * (1024 + (var2 & -978631476));
            if (477517233 * var3.ag > 16384) {
               var3.ag = 2026494984;
            }

            var3.aw(var3.ag * -1316587106, -1011696421);
            if (-1250721525 * rd.am > 0 && null == un.at) {
               un.at = new bd();
               as.ae = Executors.newScheduledThreadPool(1);
               as.ae.scheduleAtFixedRate(un.at, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (un.at != null) {
               if (un.at.ap[var1] != null) {
                  throw new IllegalArgumentException();
               }

               un.at.ap[var1] = var3;
            }

            return var3;
         } catch (Throwable var4) {
            return new bm();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public final synchronized void bz(bg var1) {
      this.ar = var1;
   }

   public final synchronized void bc(bg var1) {
      this.ar = var1;
   }

   static final void cb(bg var0) {
      var0.ad = false;
      if (var0.ag != null) {
         var0.ag.ay = 0;
      }

      for(bg var1 = var0.ay(); null != var1; var1 = var0.as()) {
         mz.bx(var1, 1451160271);
      }

   }

   public final synchronized void br() {
      if (this.af != null) {
         long var1 = ck.ap(-918837473);

         try {
            if (this.av * -5222918417860129227L != 0L) {
               if (var1 < -5222918417860129227L * this.av) {
                  return;
               }

               this.aw(this.ag * 906982694, 1816581545);
               this.av = 0L;
               this.ah = true;
            }

            int var3 = this.ak((byte)35);
            if (-1708174104 * this.al - var3 > this.ax * 1027042384) {
               this.ax = -1075962158 * (this.al * -393082048 - var3);
            }

            int var4 = this.ad * 686172015 + this.ac * -1033067445;
            if (1109212005 + var4 > 16384) {
               var4 = 1722184634;
            }

            if (350765432 + var4 > this.ag * -1085729113) {
               this.ag += -54240256;
               if (this.ag * -1085729113 > 831105175) {
                  this.ag = -729902981;
               }

               this.ai((byte)81);
               this.aw(this.ag * -484335146, -1087961183);
               var3 = 0;
               this.ah = true;
               if (1437585427 + var4 > this.ag * 674436273) {
                  var4 = this.ag * -1085729113 - 1337899711;
                  this.ac = (var4 - 1907213746 * this.ad) * -1076149531;
               }
            }

            while(var3 < var4) {
               this.bv(this.af, 256);
               this.aj();
               var3 += 256;
            }

            if (var1 > this.aa * -779758542634195683L) {
               if (!this.ah) {
                  if (0 == -1549083179 * this.ax && 708124981 * this.aq == 0) {
                     this.ai((byte)66);
                     this.av = 5550205381700441117L * (2000L + var1);
                     return;
                  }

                  this.ac = Math.min(708124981 * this.aq, this.ax * -567988417) * 1199092673;
                  this.aq = -12321247 * this.ax;
               } else {
                  this.ah = false;
               }

               this.ax = 0;
               this.aa = (2000L + var1) * 2681668578896872757L;
            }

            this.al = -1152356227 * var3;
         } catch (Exception var6) {
            this.ai((byte)59);
            this.av = 5550205381700441117L * (2000L + var1);
         }

         try {
            if (var1 > 500000L + 4554423640830226331L * this.az) {
               var1 = this.az * 4554423640830226331L;
            }

            while(var1 > 5000L + 4554423640830226331L * this.az) {
               this.bj(-1747174590, (byte)1);
               this.az += 7733016067621658259L * (long)(256000 / (du.ai * -192626508));
            }
         } catch (Exception var5) {
            this.az = 7733016067621658259L * var1;
         }

      }
   }

   protected void az() throws Exception {
   }

   public final synchronized void bn() {
      if (this.af != null) {
         long var1 = ck.ap(-1832506144);

         try {
            if (this.av * -5222918417860129227L != 0L) {
               if (var1 < -5222918417860129227L * this.av) {
                  return;
               }

               this.aw(this.ag * 152774374, 1089177037);
               this.av = 0L;
               this.ah = true;
            }

            int var3 = this.ak((byte)36);
            if (-1531847576 * this.al - var3 > this.ax * -1804942308) {
               this.ax = 704775490 * (this.al * -628727583 - var3);
            }

            int var4 = this.ad * 904133821 + this.ac * -1885687082;
            if (256 + var4 > 16384) {
               var4 = 16128;
            }

            if (-1133512244 + var4 > this.ag * 2122912784) {
               this.ag += -54240256;
               if (this.ag * -1085729113 > 2107695685) {
                  this.ag = -867844096;
               }

               this.ai((byte)33);
               this.aw(this.ag * -1085729113, -438081975);
               var3 = 0;
               this.ah = true;
               if (1108096140 + var4 > this.ag * 31140783) {
                  var4 = this.ag * -1085729113 - 256;
                  this.ac = (var4 - -365280810 * this.ad) * 784897576;
               }
            }

            while(var3 < var4) {
               this.bv(this.af, -35234735);
               this.aj();
               var3 += 256;
            }

            if (var1 > this.aa * -779758542634195683L) {
               if (!this.ah) {
                  if (0 == -2089887036 * this.ax && 863393008 * this.aq == 0) {
                     this.ai((byte)58);
                     this.av = 5550205381700441117L * (2000L + var1);
                     return;
                  }

                  this.ac = Math.min(-162110505 * this.aq, this.ax * -1549083179) * 1199092673;
                  this.aq = -1175260417 * this.ax;
               } else {
                  this.ah = false;
               }

               this.ax = 0;
               this.aa = (2000L + var1) * 2681668578896872757L;
            }

            this.al = 2121999184 * var3;
         } catch (Exception var6) {
            this.ai((byte)77);
            this.av = 5550205381700441117L * (2000L + var1);
         }

         try {
            if (var1 > 500000L + 4554423640830226331L * this.az) {
               var1 = this.az * 4554423640830226331L;
            }

            while(var1 > 5000L + 4554423640830226331L * this.az) {
               this.bj(1540431802, (byte)1);
               this.az += 7733016067621658259L * (long)(848831305 / (du.ai * -1263468902));
            }
         } catch (Exception var5) {
            this.az = 7733016067621658259L * var1;
         }

      }
   }

   public final void bt() {
      this.ah = true;
   }

   public final synchronized void bs() {
      if (un.at != null) {
         boolean var1 = true;

         for(int var2 = 0; var2 < 2; ++var2) {
            if (this == un.at.ap[var2]) {
               un.at.ap[var2] = null;
            }

            if (null != un.at.ap[var2]) {
               var1 = false;
            }
         }

         if (var1) {
            as.ae.shutdownNow();
            as.ae = null;
            un.at = null;
         }
      }

      this.ai((byte)75);
      this.af = null;
   }

   protected void as() throws Exception {
   }

   public final synchronized void bo() {
      if (un.at != null) {
         boolean var1 = true;

         for(int var2 = 0; var2 < 2; ++var2) {
            if (this == un.at.ap[var2]) {
               un.at.ap[var2] = null;
            }

            if (null != un.at.ap[var2]) {
               var1 = false;
            }
         }

         if (var1) {
            as.ae.shutdownNow();
            as.ae = null;
            un.at = null;
         }
      }

      this.ai((byte)103);
      this.af = null;
   }

   final void bd(int var1) {
      this.bb -= var1 * 1256111015;
      if (-1413414261 * this.bb < 0) {
         this.bb = 0;
      }

      if (null != this.ar) {
         this.ar.au(var1);
      }

   }

   final void ba(int var1) {
      this.bb -= var1 * 1256111015;
      if (372128791 * this.bb < 0) {
         this.bb = 0;
      }

      if (null != this.ar) {
         this.ar.au(var1);
      }

   }

   public final synchronized void ah(int var1) {
      try {
         this.ah = true;

         try {
            this.ay(-1701757798);
         } catch (Exception var3) {
            this.ai((byte)62);
            this.av = (ck.ap(-1341347212) + 2000L) * 5550205381700441117L;
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "bm.ah(" + ')');
      }
   }

   final void bi(int[] var1, int var2) {
      int var3 = var2;
      if (vi.ay) {
         var3 = var2 << 1;
      }

      rb.at(var1, 0, var3);
      this.bb -= var2 * 1256111015;
      if (null != this.ar && this.bb * 372128791 <= 0) {
         this.bb += (du.ai * -336955471 >> 4) * 1256111015;
         mz.bx(this.ar, 1407256538);
         this.bk(this.ar, this.ar.bt(), -1088895891);
         int var4 = 0;
         int var5 = 255;

         int var6;
         bg var10;
         label140:
         for(var6 = 7; 0 != var5; --var6) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if ((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  bg var11 = this.bq[var7];

                  label134:
                  while(true) {
                     while(true) {
                        if (var11 == null) {
                           break label134;
                        }

                        cy var12 = var11.ag;
                        if (null != var12 && var12.ay > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.ab;
                        } else {
                           var11.ad = true;
                           int var13 = var11.ae();
                           var4 += var13;
                           if (var12 != null) {
                              var12.ay += var13;
                           }

                           if (var4 >= 1150848531 * this.ab) {
                              break label140;
                           }

                           bg var14 = var11.ay();
                           if (var14 != null) {
                              for(int var15 = var11.az; var14 != null; var14 = var11.as()) {
                                 this.bk(var14, var15 * var14.bt() >> 8, -1271133765);
                              }
                           }

                           bg var18 = var11.ab;
                           var11.ab = null;
                           if (null == var10) {
                              this.bq[var7] = var18;
                           } else {
                              var10.ab = var18;
                           }

                           if (null == var18) {
                              this.bp[var7] = var10;
                           }

                           var11 = var18;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            bg var16 = this.bq[var6];
            bg[] var17 = this.bq;
            this.bp[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.ab;
               var16.ab = null;
            }
         }
      }

      if (this.bb * -70835166 < 0) {
         this.bb = 0;
      }

      if (null != this.ar) {
         this.ar.am(var1, 0, var2);
      }

      this.az = ck.ap(-1851861534) * 7733016067621658259L;
   }

   final void bf(int[] var1, int var2) {
      int var3 = var2;
      if (vi.ay) {
         var3 = var2 << 1;
      }

      rb.at(var1, 0, var3);
      this.bb -= var2 * 1256111015;
      if (null != this.ar && this.bb * 372128791 <= 0) {
         this.bb += (du.ai * -336955471 >> 4) * 1256111015;
         mz.bx(this.ar, 787468995);
         this.bk(this.ar, this.ar.bt(), -1678023172);
         int var4 = 0;
         int var5 = 255;

         int var6;
         bg var10;
         label139:
         for(var6 = 7; 0 != var5; --var6) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if ((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  bg var11 = this.bq[var7];

                  label133:
                  while(true) {
                     while(true) {
                        if (var11 == null) {
                           break label133;
                        }

                        cy var12 = var11.ag;
                        if (null != var12 && var12.ay > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.ab;
                        } else {
                           var11.ad = true;
                           int var13 = var11.ae();
                           var4 += var13;
                           if (var12 != null) {
                              var12.ay += var13;
                           }

                           if (var4 >= 1123588325 * this.ab) {
                              break label139;
                           }

                           bg var14 = var11.ay();
                           if (var14 != null) {
                              for(int var15 = var11.az; var14 != null; var14 = var11.as()) {
                                 this.bk(var14, var15 * var14.bt() >> 8, -1530925147);
                              }
                           }

                           bg var18 = var11.ab;
                           var11.ab = null;
                           if (null == var10) {
                              this.bq[var7] = var18;
                           } else {
                              var10.ab = var18;
                           }

                           if (null == var18) {
                              this.bp[var7] = var10;
                           }

                           var11 = var18;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            bg var16 = this.bq[var6];
            bg[] var17 = this.bq;
            this.bp[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.ab;
               var16.ab = null;
            }
         }
      }

      if (this.bb * 372128791 < 0) {
         this.bb = 0;
      }

      if (null != this.ar) {
         this.ar.am(var1, 0, var2);
      }

      this.az = ck.ap(-764403397) * 7733016067621658259L;
   }

   final void cd(bg var1, int var2) {
      int var3 = var2 >> 5;
      bg var4 = this.bp[var3];
      if (var4 == null) {
         this.bq[var3] = var1;
      } else {
         var4.ab = var1;
      }

      this.bp[var3] = var1;
      var1.az = var2;
   }

   final void bl(int[] var1, int var2) {
      int var3 = var2;
      if (vi.ay) {
         var3 = var2 << 1;
      }

      rb.at(var1, 0, var3);
      this.bb -= var2 * 1256111015;
      if (null != this.ar && this.bb * 372128791 <= 0) {
         this.bb += (du.ai * -336955471 >> 4) * 1256111015;
         mz.bx(this.ar, 2105228793);
         this.bk(this.ar, this.ar.bt(), -1583040264);
         int var4 = 0;
         int var5 = 255;

         int var6;
         bg var10;
         label135:
         for(var6 = 7; 0 != var5; --var6) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) {
               if ((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  bg var11 = this.bq[var7];

                  label129:
                  while(true) {
                     while(true) {
                        if (var11 == null) {
                           break label129;
                        }

                        cy var12 = var11.ag;
                        if (null != var12 && var12.ay > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.ab;
                        } else {
                           var11.ad = true;
                           int var13 = var11.ae();
                           var4 += var13;
                           if (var12 != null) {
                              var12.ay += var13;
                           }

                           if (var4 >= 1123588325 * this.ab) {
                              break label135;
                           }

                           bg var14 = var11.ay();
                           if (var14 != null) {
                              for(int var15 = var11.az; var14 != null; var14 = var11.as()) {
                                 this.bk(var14, var15 * var14.bt() >> 8, -2121971523);
                              }
                           }

                           bg var18 = var11.ab;
                           var11.ab = null;
                           if (null == var10) {
                              this.bq[var7] = var18;
                           } else {
                              var10.ab = var18;
                           }

                           if (null == var18) {
                              this.bp[var7] = var10;
                           }

                           var11 = var18;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            bg var16 = this.bq[var6];
            bg[] var17 = this.bq;
            this.bp[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.ab;
               var16.ab = null;
            }
         }
      }

      if (this.bb * 372128791 < 0) {
         this.bb = 0;
      }

      if (null != this.ar) {
         this.ar.am(var1, 0, var2);
      }

      this.az = ck.ap(-900760330) * 7733016067621658259L;
   }

   static final void be(bg var0) {
      var0.ad = false;
      if (var0.ag != null) {
         var0.ag.ay = 0;
      }

      for(bg var1 = var0.ay(); null != var1; var1 = var0.as()) {
         mz.bx(var1, 1577792694);
      }

   }

   static final void cq(bg var0) {
      var0.ad = false;
      if (var0.ag != null) {
         var0.ag.ay = 0;
      }

      for(bg var1 = var0.ay(); null != var1; var1 = var0.as()) {
         mz.bx(var1, 1134404687);
      }

   }

   static void ga(int var0) {
      try {
         client.dh = true;
         if (null != tm.qz) {
            if (var0 <= 824757750) {
               throw new IllegalStateException();
            }

            if (tm.qz.an(1330898974)) {
               if (var0 <= 824757750) {
                  throw new IllegalStateException();
               }

               tm.qz.am(-829605311);
            }
         }

         ft.hd((byte)-41);
         pn.gk(916703209);
         if (rr.db != null) {
            if (var0 <= 824757750) {
               throw new IllegalStateException();
            }

            rr.db.ap = false;
         }

         rr.db = null;
         client.in.ai(1073142363);
         if (null != client.ap) {
            if (var0 <= 824757750) {
               return;
            }

            try {
               client.ap.ap((byte)49);
            } catch (Exception var3) {
            }
         }

         client.ap = null;
         dn.ho((byte)87);
         gh.gf((byte)-118);
         client.jv.au(-1315769487);
         ch.wx = null;
         gg.aj(0, 0, -286318413);
         hr.ae(437181528);
         client.tz = false;
         lm.ap(-2064837175);
         if (null != dr.te) {
            if (var0 <= 824757750) {
               return;
            }

            dr.te.bh(-2070897576);
         }

         oc.vv.at((byte)-96);
         fn.aj(921431381);
         if (null != kd.ic) {
            if (var0 <= 824757750) {
               return;
            }

            kd.ic.ay((byte)1);
         }

         ar.as(1408456774);
         iq.ao = null;
         iq.af = null;
         et.ar = null;
         bd.ak(-2134066588);
         hc.vp = null;
         client.wt.clear();
         client.wu = 0;
         oc.vv = new pk();
         kd.ic = new ej(dd.bl.gi, 226);

         try {
            do.ap("oldschool", ft.hc, hb.cd.ai, 0, 23, 1501453131);
         } catch (IOException var2) {
            throw new RuntimeException(var2);
         }

         hc.vp = new sl(255, iq.ao, iq.af, 500000);
         client.ap = new io();
         dd.bl.aq((byte)77);
         qr.gq(dj.aw, (byte)18);
         ea.gv(0, 2027013533);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "bm.ga(" + ')');
      }
   }

   final void bg(int[] var1, int var2) {
      int var3 = var2;
      if (vi.ay) {
         var3 = var2 << 1;
      }

      rb.at(var1, 0, var3);
      this.bb -= var2 * 1256111015;
      if (null != this.ar && this.bb * 372128791 <= 0) {
         this.bb += (du.ai * 1180247587 >> 4) * 1602781232;
         mz.bx(this.ar, 1653247028);
         this.bk(this.ar, this.ar.bt(), -1040411793);
         int var4 = 0;
         int var5 = 255;

         int var6;
         bg var10;
         label140:
         for(var6 = 7; 0 != var5; --var6) {
            int var7;
            int var8;
            if (var6 < 0) {
               var7 = var6 & 3;
               var8 = -(var6 >> 2);
            } else {
               var7 = var6;
               var8 = 0;
            }

            for(int var9 = var5 >>> var7 & -1606884021; var9 != 0; var9 >>>= 4) {
               if ((var9 & 1) != 0) {
                  var5 &= ~(1 << var7);
                  var10 = null;
                  bg var11 = this.bq[var7];

                  label134:
                  while(true) {
                     while(true) {
                        if (var11 == null) {
                           break label134;
                        }

                        cy var12 = var11.ag;
                        if (null != var12 && var12.ay > var8) {
                           var5 |= 1 << var7;
                           var10 = var11;
                           var11 = var11.ab;
                        } else {
                           var11.ad = true;
                           int var13 = var11.ae();
                           var4 += var13;
                           if (var12 != null) {
                              var12.ay += var13;
                           }

                           if (var4 >= 1123588325 * this.ab) {
                              break label140;
                           }

                           bg var14 = var11.ay();
                           if (var14 != null) {
                              for(int var15 = var11.az; var14 != null; var14 = var11.as()) {
                                 this.bk(var14, var15 * var14.bt() >> 8, -1138369004);
                              }
                           }

                           bg var18 = var11.ab;
                           var11.ab = null;
                           if (null == var10) {
                              this.bq[var7] = var18;
                           } else {
                              var10.ab = var18;
                           }

                           if (null == var18) {
                              this.bp[var7] = var10;
                           }

                           var11 = var18;
                        }
                     }
                  }
               }

               var7 += 4;
               ++var8;
            }
         }

         for(var6 = 0; var6 < 8; ++var6) {
            bg var16 = this.bq[var6];
            bg[] var17 = this.bq;
            this.bp[var6] = null;

            for(var17[var6] = null; var16 != null; var16 = var10) {
               var10 = var16.ab;
               var16.ab = null;
            }
         }
      }

      if (this.bb * -692162575 < 0) {
         this.bb = 0;
      }

      if (null != this.ar) {
         this.ar.am(var1, 0, var2);
      }

      this.az = ck.ap(-556508001) * 7733016067621658259L;
   }

   static final void hs(int var0) {
      try {
         in.hh(-1065479945 * ee.uu, at.ur * 1044660289, -1960251493 * rr.uh, 1463567568);
         fl.hb(di.uj * -1888397375, pc.un * -1987291449, (byte)65);
         if (ee.uu * -1065479945 == -678007887 * ad.kw && 1044660289 * at.ur == in.ks * 2138486231) {
            if (var0 >= 1305256916) {
               throw new IllegalStateException();
            }

            if (oo.kv * -892337617 == -1960251493 * rr.uh) {
               if (var0 >= 1305256916) {
                  throw new IllegalStateException();
               }

               if (di.uj * -1888397375 == -887244477 * mj.kz) {
                  if (var0 >= 1305256916) {
                     return;
                  }

                  if (pc.un * -1987291449 == pg.kc * 1625945013) {
                     if (var0 >= 1305256916) {
                        throw new IllegalStateException();
                     }

                     client.uv = false;
                     client.to = false;
                     client.uw = false;
                     client.ug = false;
                     cx.uc = 0;
                     pg.ul = 0;
                     hi.us = 0;
                     fq.uy = 0;
                     oh.up = 0;
                     av.uq = 0;
                     ce.ti = 0;
                     gw.ta = 0;
                     et.tu = 0;
                     mb.tr = 0;
                     client.um = null;
                     client.ut = null;
                     client.ud = null;
                  }
               }
            }
         }

      } catch (RuntimeException var1) {
         throw tm.aw(var1, "bm.hs(" + ')');
      }
   }

   protected void ar() throws Exception {
   }

   public static byte ap(char var0, byte var1) {
      try {
         byte var2;
         label230: {
            if (var0 > 0) {
               if (var1 == 8) {
                  throw new IllegalStateException();
               }

               if (var0 < 128) {
                  break label230;
               }

               if (var1 == 8) {
                  throw new IllegalStateException();
               }
            }

            if (var0 < 160 || var0 > 255) {
               if (var0 == 8364) {
                  if (var1 == 8) {
                     throw new IllegalStateException();
                  }

                  var2 = -128;
                  return var2;
               } else if (var0 == 8218) {
                  var2 = -126;
                  return var2;
               } else if (402 == var0) {
                  var2 = -125;
                  return var2;
               } else if (8222 == var0) {
                  if (var1 == 8) {
                     throw new IllegalStateException();
                  }

                  var2 = -124;
                  return var2;
               } else if (8230 == var0) {
                  var2 = -123;
                  return var2;
               } else if (8224 == var0) {
                  var2 = -122;
                  return var2;
               } else if (8225 == var0) {
                  if (var1 == 8) {
                     throw new IllegalStateException();
                  }

                  var2 = -121;
                  return var2;
               } else if (710 == var0) {
                  if (var1 == 8) {
                     throw new IllegalStateException();
                  }

                  var2 = -120;
                  return var2;
               } else if (var0 == 8240) {
                  if (var1 == 8) {
                     throw new IllegalStateException();
                  }

                  var2 = -119;
                  return var2;
               } else if (var0 == 352) {
                  if (var1 == 8) {
                     throw new IllegalStateException();
                  }

                  var2 = -118;
                  return var2;
               } else if (8249 == var0) {
                  if (var1 == 8) {
                     throw new IllegalStateException();
                  }

                  var2 = -117;
                  return var2;
               } else if (var0 == 338) {
                  if (var1 == 8) {
                     throw new IllegalStateException();
                  }

                  var2 = -116;
                  return var2;
               } else if (381 == var0) {
                  if (var1 == 8) {
                     throw new IllegalStateException();
                  }

                  var2 = -114;
                  return var2;
               } else if (var0 == 8216) {
                  if (var1 == 8) {
                     throw new IllegalStateException();
                  }

                  var2 = -111;
                  return var2;
               } else if (var0 == 8217) {
                  if (var1 == 8) {
                     throw new IllegalStateException();
                  }

                  var2 = -110;
                  return var2;
               } else if (8220 == var0) {
                  if (var1 == 8) {
                     throw new IllegalStateException();
                  }

                  var2 = -109;
                  return var2;
               } else if (var0 == 8221) {
                  if (var1 == 8) {
                     throw new IllegalStateException();
                  }

                  var2 = -108;
                  return var2;
               } else if (8226 == var0) {
                  if (var1 == 8) {
                     throw new IllegalStateException();
                  }

                  var2 = -107;
                  return var2;
               } else if (var0 == 8211) {
                  if (var1 == 8) {
                     throw new IllegalStateException();
                  }

                  var2 = -106;
                  return var2;
               } else if (8212 == var0) {
                  if (var1 == 8) {
                     throw new IllegalStateException();
                  }

                  var2 = -105;
                  return var2;
               } else if (var0 == 732) {
                  if (var1 == 8) {
                     throw new IllegalStateException();
                  }

                  var2 = -104;
                  return var2;
               } else if (var0 == 8482) {
                  if (var1 == 8) {
                     throw new IllegalStateException();
                  }

                  var2 = -103;
                  return var2;
               } else if (var0 == 353) {
                  if (var1 == 8) {
                     throw new IllegalStateException();
                  }

                  var2 = -102;
                  return var2;
               } else if (var0 == 8250) {
                  if (var1 == 8) {
                     throw new IllegalStateException();
                  }

                  var2 = -101;
                  return var2;
               } else if (339 == var0) {
                  if (var1 == 8) {
                     throw new IllegalStateException();
                  }

                  var2 = -100;
                  return var2;
               } else if (382 == var0) {
                  if (var1 == 8) {
                     throw new IllegalStateException();
                  }

                  var2 = -98;
                  return var2;
               } else {
                  if (var0 == 376) {
                     if (var1 == 8) {
                        throw new IllegalStateException();
                     }

                     var2 = -97;
                  } else {
                     var2 = 63;
                  }

                  return var2;
               }
            }
         }

         var2 = (byte)var0;
         return var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "bm.ap(" + ')');
      }
   }

   static final void kr(dn var0, do var1, int var2) {
      try {
         ji var3 = var0.aw;
         long var4 = 0L;
         int var6 = -1;
         int var7 = 0;
         int var8 = 0;
         if (var1.aw * 1704766835 == 0) {
            var4 = var3.bx(var1.ap * 1321466283, var1.ak * -440355905, var1.aj * 1462658139);
         }

         if (var1.aw * 1704766835 == 1) {
            if (var2 <= -1983354926) {
               throw new IllegalStateException();
            }

            var4 = var3.bk(var1.ap * 1321466283, var1.ak * -440355905, var1.aj * 1462658139);
         }

         if (2 == var1.aw * 1704766835) {
            var4 = var3.bb(1321466283 * var1.ap, -440355905 * var1.ak, 1462658139 * var1.aj);
         }

         if (1704766835 * var1.aw == 3) {
            if (var2 <= -1983354926) {
               return;
            }

            var4 = var3.bq(var1.ap * 1321466283, var1.ak * -440355905, var1.aj * 1462658139);
         }

         if (0L != var4) {
            if (var2 <= -1983354926) {
               throw new IllegalStateException();
            }

            int var9 = var3.bp(var1.ap * 1321466283, var1.ak * -440355905, 1462658139 * var1.aj, var4);
            var6 = la.ae(var4);
            var7 = var9 & 31;
            var8 = var9 >> 6 & 3;
         }

         var1.ai = var6 * 336107701;
         var1.as = 1163215241 * var7;
         var1.ay = 1684929735 * var8;
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "bm.kr(" + ')');
      }
   }

   public static void ap(pe var0, int var1) {
      try {
         hq.ap = var0;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bm.ap(" + ')');
      }
   }
}
