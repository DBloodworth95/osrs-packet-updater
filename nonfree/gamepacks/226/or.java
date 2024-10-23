import java.util.zip.CRC32;

public class or extends pe {
   int ao;
   boolean az;
   sl ay;
   sl as;
   int ae;
   static final int aw = 200;
   boolean at;
   volatile boolean[] au;
   static CRC32 an = new CRC32();
   int af;
   static final int ak = 0;
   int ar;
   boolean ab;
   volatile int am;
   pk ag;

   void av(int var1) {
      if (null != this.ay && this.au != null && this.au[var1]) {
         sl var2 = this.ay;
         byte[] var4 = null;
         synchronized(ol.ap) {
            for(op var6 = (op)ol.ap.as(); null != var6; var6 = (op)ol.ap.am()) {
               if ((long)var1 == var6.ht && var2 == var6.ak && 797413466 * var6.ap == 0) {
                  var4 = var6.aw;
                  break;
               }
            }
         }

         if (null != var4) {
            this.ae(var2, var1, var4, true, (byte)51);
         } else {
            byte[] var5 = var2.ap(var1, -1776249852);
            this.ae(var2, var1, var5, true, (byte)38);
         }
      } else {
         this.ag.ay(this, 1980365426 * this.ae, var1, this.al[var1], (byte)2, true, 1473483156);
      }

   }

   public boolean ap(int var1) {
      try {
         boolean var10000;
         if (this.am * -84195103 == 1) {
            if (var1 <= -1450976103) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "or.ap(" + ')');
      }
   }

   public int aw(int var1) {
      try {
         label47: {
            if (1 != -84195103 * this.am) {
               if (var1 >= -1538783571) {
                  throw new IllegalStateException();
               }

               if (!this.ab) {
                  break label47;
               }

               if (var1 >= -1538783571) {
                  throw new IllegalStateException();
               }

               if (2 != -84195103 * this.am) {
                  break label47;
               }

               if (var1 >= -1538783571) {
                  throw new IllegalStateException();
               }
            }

            return 100;
         }

         if (this.bx != null) {
            if (var1 >= -1538783571) {
               throw new IllegalStateException();
            } else {
               return 99;
            }
         } else {
            int var2 = this.ag.ae(oz.ap.al * -1308770465, -181318597 * this.ae, -986766796);
            if (var2 >= 100) {
               if (var1 >= -1538783571) {
                  throw new IllegalStateException();
               }

               var2 = 99;
            }

            return var2;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "or.aw(" + ')');
      }
   }

   void ak(int var1, int var2) {
      try {
         this.ag.as(this.ae * -181318597, var1, 1045199720);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "or.ak(" + ')');
      }
   }

   void aj(int var1, int var2) {
      try {
         if (null != this.ay) {
            if (var2 != 1703992490) {
               return;
            }

            if (this.au != null && this.au[var1]) {
               if (var2 != 1703992490) {
                  throw new IllegalStateException();
               }

               sl var3 = this.ay;
               byte[] var5 = null;
               synchronized(ol.ap) {
                  for(op var7 = (op)ol.ap.as(); null != var7; var7 = (op)ol.ap.am()) {
                     if (var2 != 1703992490) {
                        throw new IllegalStateException();
                     }

                     if ((long)var1 == var7.ht && var3 == var7.ak && -29242609 * var7.ap == 0) {
                        var5 = var7.aw;
                        break;
                     }
                  }
               }

               if (null != var5) {
                  if (var2 != 1703992490) {
                     return;
                  }

                  this.ae(var3, var1, var5, true, (byte)-26);
               } else {
                  byte[] var6 = var3.ap(var1, -1776249852);
                  this.ae(var3, var1, var6, true, (byte)84);
               }

               return;
            }
         }

         this.ag.ay(this, -181318597 * this.ae, var1, this.al[var1], (byte)2, true, 1473483156);
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "or.aj(" + ')');
      }
   }

   void ai(byte var1) {
      try {
         this.am = 1309668930;
         this.av = new int[0];
         this.al = new int[0];
         this.aa = new int[0];
         this.ah = new int[0];
         this.bh = new int[0][];
         this.bx = new Object[0];
         this.bk = new Object[0][];
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "or.ai(" + ')');
      }
   }

   void ay(int var1, int var2, int var3) {
      try {
         this.ao = -1394185847 * var1;
         this.af = var2 * -1976425153;
         if (null != this.as) {
            if (var3 == 2136515690) {
               throw new IllegalStateException();
            }

            dp.aw(-181318597 * this.ae, this.as, this, -1766982012);
         } else {
            this.ag.ay(this, oz.ap.al * -1308770465, this.ae * -181318597, 493673657 * this.ao, (byte)0, true, 1473483156);
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "or.ay(" + ')');
      }
   }

   public boolean bc(int var1) {
      return this.au[var1];
   }

   public void ae(sl var1, int var2, byte[] var3, boolean var4, byte var5) {
      try {
         int var6;
         if (this.as == var1) {
            if (var5 == 1) {
               throw new IllegalStateException();
            } else if (this.am * -84195103 == 1) {
               if (var5 == 1) {
                  throw new IllegalStateException();
               } else {
                  throw new RuntimeException();
               }
            } else if (var3 == null) {
               if (var5 == 1) {
                  throw new IllegalStateException();
               } else {
                  this.ag.ay(this, -1308770465 * oz.ap.al, this.ae * -181318597, 493673657 * this.ao, (byte)0, true, 1473483156);
               }
            } else {
               an.reset();
               an.update(var3, 0, var3.length);
               var6 = (int)an.getValue();
               if (493673657 * this.ao != var6) {
                  if (var5 == 1) {
                     throw new IllegalStateException();
                  } else {
                     this.ag.ay(this, -1308770465 * oz.ap.al, this.ae * -181318597, this.ao * 493673657, (byte)0, true, 1473483156);
                  }
               } else {
                  vl var11 = new vl(mp.cx(var3, 31873403));
                  int var8 = var11.cy((short)-17725);
                  if (5 != var8) {
                     if (var5 == 1) {
                        throw new IllegalStateException();
                     }

                     if (var8 != 6) {
                        if (var5 == 1) {
                           return;
                        }

                        throw new RuntimeException(var8 + "," + -181318597 * this.ae + "," + var2);
                     }
                  }

                  int var9 = 0;
                  if (var8 >= 6) {
                     var9 = var11.ch(1203709469);
                  }

                  if (-1414640961 * this.af != var9) {
                     if (var5 == 1) {
                        throw new IllegalStateException();
                     } else {
                        this.ag.ay(this, -1308770465 * oz.ap.al, this.ae * -181318597, this.ao * 493673657, (byte)0, true, 1473483156);
                     }
                  } else {
                     this.bs(var3, (byte)10);
                     this.am(535255491);
                  }
               }
            }
         } else {
            if (!var4) {
               if (var5 == 1) {
                  return;
               }

               if (var2 == this.ar * 1208672547) {
                  if (var5 == 1) {
                     throw new IllegalStateException();
                  }

                  this.am = 654834465;
               }
            }

            if (var3 != null) {
               if (var5 == 1) {
                  throw new IllegalStateException();
               }

               if (var3.length > 2) {
                  an.reset();
                  an.update(var3, 0, var3.length - 2);
                  var6 = (int)an.getValue();
                  int var7 = (var3[var3.length - 1] & 255) + ((var3[var3.length - 2] & 255) << 8);
                  if (var6 == this.al[var2]) {
                     if (var5 == 1) {
                        return;
                     }

                     if (var7 == this.aa[var2]) {
                        this.au[var2] = true;
                        if (var4) {
                           if (var5 == 1) {
                              return;
                           }

                           this.bx[var2] = ke.ap(var3, false, -732909265);
                        }

                        return;
                     }

                     if (var5 == 1) {
                        throw new IllegalStateException();
                     }
                  }

                  this.au[var2] = false;
                  if (!this.at) {
                     if (var5 == 1) {
                        return;
                     }

                     if (!var4) {
                        return;
                     }

                     if (var5 == 1) {
                        throw new IllegalStateException();
                     }
                  }

                  this.ag.ay(this, this.ae * -181318597, var2, this.al[var2], (byte)2, var4, 1473483156);
                  return;
               }

               if (var5 == 1) {
                  throw new IllegalStateException();
               }
            }

            this.au[var2] = false;
            if (!this.at) {
               if (var5 == 1) {
                  throw new IllegalStateException();
               }

               if (!var4) {
                  return;
               }

               if (var5 == 1) {
                  throw new IllegalStateException();
               }
            }

            this.ag.ay(this, this.ae * -181318597, var2, this.al[var2], (byte)2, var4, 1473483156);
         }
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "or.ae(" + ')');
      }
   }

   void am(int var1) {
      try {
         this.au = new boolean[this.bx.length];

         int var2;
         for(var2 = 0; var2 < this.au.length; ++var2) {
            if (var1 <= -619268770) {
               return;
            }

            this.au[var2] = false;
         }

         if (this.ay == null) {
            if (var1 <= -619268770) {
               throw new IllegalStateException();
            } else {
               this.am = 654834465;
            }
         } else {
            this.ar = -1645368971;

            for(var2 = 0; var2 < this.au.length; ++var2) {
               if (var1 <= -619268770) {
                  throw new IllegalStateException();
               }

               if (this.ah[var2] > 0) {
                  if (var1 <= -619268770) {
                     throw new IllegalStateException();
                  }

                  sl var3 = this.ay;
                  op var5 = new op();
                  var5.ap = 715768815;
                  var5.ht = (long)var2;
                  var5.ak = var3;
                  var5.aj = this;
                  synchronized(ol.ap) {
                     ol.ap.aw(var5);
                  }

                  ll.ak(658162232);
                  this.ar = var2 * 1645368971;
               }
            }

            if (this.ar * 1208672547 == -1) {
               if (var1 <= -619268770) {
                  throw new IllegalStateException();
               }

               this.am = 654834465;
            }

         }
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "or.am(" + ')');
      }
   }

   int at(int var1, byte var2) {
      try {
         if (null != this.bx[var1]) {
            if (var2 <= -1) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else if (this.au[var1]) {
            if (var2 <= -1) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else {
            return this.ag.ae(-181318597 * this.ae, var1, -558014950);
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "or.at(" + ')');
      }
   }

   public boolean au(int var1, int var2) {
      try {
         return this.au[var1];
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "or.au(" + ')');
      }
   }

   void aq() {
      this.am = 1309668930;
      this.av = new int[0];
      this.al = new int[0];
      this.aa = new int[0];
      this.ah = new int[0];
      this.bh = new int[0][];
      this.bx = new Object[0];
      this.bk = new Object[0][];
   }

   public int ao(int var1) {
      try {
         int var2 = 0;
         int var3 = 0;

         int var4;
         for(var4 = 0; var4 < this.bx.length; ++var4) {
            if (var1 == 706234479) {
               throw new IllegalStateException();
            }

            if (this.ah[var4] > 0) {
               if (var1 == 706234479) {
                  throw new IllegalStateException();
               }

               var2 += 100;
               var3 += this.at(var4, (byte)104);
            }
         }

         if (0 == var2) {
            if (var1 == 706234479) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else {
            var4 = 100 * var3 / var2;
            return var4;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "or.ao(" + ')');
      }
   }

   public boolean af() {
      return this.am * -84195103 == 1;
   }

   public boolean ar() {
      return this.am * -84195103 == 1;
   }

   public int ab() {
      if (1 == 1820098396 * this.am || this.ab && 2 == -84195103 * this.am) {
         return 100;
      } else if (this.bx != null) {
         return 83267345;
      } else {
         int var1 = this.ag.ae(oz.ap.al * 2012109278, -181318597 * this.ae, -1835238244);
         if (var1 >= 100) {
            var1 = -476620371;
         }

         return var1;
      }
   }

   public or(sl var1, sl var2, pk var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
      try {
         super(var5, var6);
         this.am = 0;
         this.at = false;
         this.ar = -1645368971;
         this.ab = false;
         this.az = false;
         this.ay = var1;
         this.as = var2;
         this.ae = 841460979 * var4;
         this.at = var7;
         this.ab = var8;
         this.az = var9;
         this.ag = var3;
         this.ag.aj(this, this.ae * -181318597, 1734803559);
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "or.<init>(" + ')');
      }
   }

   void bx() {
      this.au = new boolean[this.bx.length];

      int var1;
      for(var1 = 0; var1 < this.au.length; ++var1) {
         this.au[var1] = false;
      }

      if (this.ay == null) {
         this.am = 654834465;
      } else {
         this.ar = -1645368971;

         for(var1 = 0; var1 < this.au.length; ++var1) {
            if (this.ah[var1] > 0) {
               sl var2 = this.ay;
               op var4 = new op();
               var4.ap = 715768815;
               var4.ht = (long)var1;
               var4.ak = var2;
               var4.aj = this;
               synchronized(ol.ap) {
                  ol.ap.aw(var4);
               }

               ll.ak(1180516364);
               this.ar = var1 * 1645368971;
            }
         }

         if (this.ar * 1208672547 == -1) {
            this.am = 654834465;
         }

      }
   }

   void ad(int var1) {
      if (null != this.ay && this.au != null && this.au[var1]) {
         sl var2 = this.ay;
         byte[] var4 = null;
         synchronized(ol.ap) {
            for(op var6 = (op)ol.ap.as(); null != var6; var6 = (op)ol.ap.am()) {
               if ((long)var1 == var6.ht && var2 == var6.ak && -29242609 * var6.ap == 0) {
                  var4 = var6.aw;
                  break;
               }
            }
         }

         if (null != var4) {
            this.ae(var2, var1, var4, true, (byte)13);
         } else {
            byte[] var5 = var2.ap(var1, -1776249852);
            this.ae(var2, var1, var5, true, (byte)17);
         }
      } else {
         this.ag.ay(this, -181318597 * this.ae, var1, this.al[var1], (byte)2, true, 1473483156);
      }

   }

   void aa() {
      this.am = 1309668930;
      this.av = new int[0];
      this.al = new int[0];
      this.aa = new int[0];
      this.ah = new int[0];
      this.bh = new int[0][];
      this.bx = new Object[0];
      this.bk = new Object[0][];
   }

   int bq(int var1) {
      if (null != this.bx[var1]) {
         return -5551161;
      } else {
         return this.au[var1] ? 100 : this.ag.ae(1625557628 * this.ae, var1, -1831729163);
      }
   }

   void ax() {
      this.am = 1309668930;
      this.av = new int[0];
      this.al = new int[0];
      this.aa = new int[0];
      this.ah = new int[0];
      this.bh = new int[0][];
      this.bx = new Object[0];
      this.bk = new Object[0][];
   }

   void bj(int var1, byte[] var2, boolean var3, boolean var4) {
      if (var3) {
         if (1 == -84195103 * this.am) {
            throw new RuntimeException();
         }

         if (null != this.as) {
            jx.ap(-181318597 * this.ae, var2, this.as, -1869380515);
         }

         this.bs(var2, (byte)-62);
         this.am(774642463);
      } else {
         var2[var2.length - 2] = (byte)(this.aa[var1] >> 8);
         var2[var2.length - 1] = (byte)this.aa[var1];
         if (this.ay != null) {
            jx.ap(var1, var2, this.ay, -1728883044);
            this.au[var1] = true;
         }

         if (var4) {
            this.bx[var1] = ke.ap(var2, false, 337605055);
         }
      }

   }

   void al() {
      this.am = 1309668930;
      this.av = new int[0];
      this.al = new int[0];
      this.aa = new int[0];
      this.ah = new int[0];
      this.bh = new int[0][];
      this.bx = new Object[0];
      this.bk = new Object[0][];
   }

   void ah(int var1, int var2) {
      this.ao = -1394185847 * var1;
      this.af = var2 * -1976425153;
      if (null != this.as) {
         dp.aw(-181318597 * this.ae, this.as, this, -932933828);
      } else {
         this.ag.ay(this, oz.ap.al * -1308770465, this.ae * -181318597, 493673657 * this.ao, (byte)0, true, 1473483156);
      }

   }

   void bb() {
      this.au = new boolean[this.bx.length];

      int var1;
      for(var1 = 0; var1 < this.au.length; ++var1) {
         this.au[var1] = false;
      }

      if (this.ay == null) {
         this.am = 654834465;
      } else {
         this.ar = -1645368971;

         for(var1 = 0; var1 < this.au.length; ++var1) {
            if (this.ah[var1] > 0) {
               sl var2 = this.ay;
               op var4 = new op();
               var4.ap = 248511708;
               var4.ht = (long)var1;
               var4.ak = var2;
               var4.aj = this;
               synchronized(ol.ap) {
                  ol.ap.aw(var4);
               }

               ll.ak(764263987);
               this.ar = var1 * 351601137;
            }
         }

         if (this.ar * -1235068982 == -1) {
            this.am = 1367724810;
         }

      }
   }

   void bh(int var1, int var2) {
      this.ao = -1394185847 * var1;
      this.af = var2 * -1976425153;
      if (null != this.as) {
         dp.aw(-181318597 * this.ae, this.as, this, -902206318);
      } else {
         this.ag.ay(this, oz.ap.al * -1308770465, this.ae * -181318597, 493673657 * this.ao, (byte)0, true, 1473483156);
      }

   }

   public boolean an(int var1, int var2) {
      try {
         boolean var10000;
         if (this.be(var1, 1279082648) != null) {
            if (var2 == 1319030000) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "or.an(" + ')');
      }
   }

   public void bv(sl var1, int var2, byte[] var3, boolean var4) {
      int var5;
      if (this.as == var1) {
         if (this.am * -84195103 == 1) {
            throw new RuntimeException();
         }

         if (var3 == null) {
            this.ag.ay(this, -1308770465 * oz.ap.al, this.ae * -181318597, 493673657 * this.ao, (byte)0, true, 1473483156);
            return;
         }

         an.reset();
         an.update(var3, 0, var3.length);
         var5 = (int)an.getValue();
         if (493673657 * this.ao != var5) {
            this.ag.ay(this, -1308770465 * oz.ap.al, this.ae * -181318597, this.ao * 493673657, (byte)0, true, 1473483156);
            return;
         }

         vl var6 = new vl(mp.cx(var3, 31873403));
         int var7 = var6.cy((short)-8715);
         if (5 != var7 && var7 != 6) {
            throw new RuntimeException(var7 + "," + -181318597 * this.ae + "," + var2);
         }

         int var8 = 0;
         if (var7 >= 6) {
            var8 = var6.ch(1203709469);
         }

         if (-1414640961 * this.af != var8) {
            this.ag.ay(this, -1308770465 * oz.ap.al, this.ae * -181318597, this.ao * 493673657, (byte)0, true, 1473483156);
            return;
         }

         this.bs(var3, (byte)74);
         this.am(183780928);
      } else {
         if (!var4 && var2 == this.ar * 1208672547) {
            this.am = 654834465;
         }

         if (var3 == null || var3.length <= 2) {
            this.au[var2] = false;
            if (this.at || var4) {
               this.ag.ay(this, this.ae * -181318597, var2, this.al[var2], (byte)2, var4, 1473483156);
            }

            return;
         }

         an.reset();
         an.update(var3, 0, var3.length - 2);
         var5 = (int)an.getValue();
         int var9 = (var3[var3.length - 1] & 255) + ((var3[var3.length - 2] & 255) << 8);
         if (var5 != this.al[var2] || var9 != this.aa[var2]) {
            this.au[var2] = false;
            if (this.at || var4) {
               this.ag.ay(this, this.ae * -181318597, var2, this.al[var2], (byte)2, var4, 1473483156);
            }

            return;
         }

         this.au[var2] = true;
         if (var4) {
            this.bx[var2] = ke.ap(var3, false, -1347926637);
         }
      }

   }

   public boolean bz(int var1) {
      return this.au[var1];
   }

   void bk() {
      this.au = new boolean[this.bx.length];

      int var1;
      for(var1 = 0; var1 < this.au.length; ++var1) {
         this.au[var1] = false;
      }

      if (this.ay == null) {
         this.am = 654834465;
      } else {
         this.ar = -1645368971;

         for(var1 = 0; var1 < this.au.length; ++var1) {
            if (this.ah[var1] > 0) {
               sl var2 = this.ay;
               op var4 = new op();
               var4.ap = 715768815;
               var4.ht = (long)var1;
               var4.ak = var2;
               var4.aj = this;
               synchronized(ol.ap) {
                  ol.ap.aw(var4);
               }

               ll.ak(1262942926);
               this.ar = var1 * 1645368971;
            }
         }

         if (this.ar * 1208672547 == -1) {
            this.am = 654834465;
         }

      }
   }

   void ac(int var1) {
      if (null != this.ay && this.au != null && this.au[var1]) {
         sl var2 = this.ay;
         byte[] var4 = null;
         synchronized(ol.ap) {
            for(op var6 = (op)ol.ap.as(); null != var6; var6 = (op)ol.ap.am()) {
               if ((long)var1 == var6.ht && var2 == var6.ak && -29242609 * var6.ap == 0) {
                  var4 = var6.aw;
                  break;
               }
            }
         }

         if (null != var4) {
            this.ae(var2, var1, var4, true, (byte)-70);
         } else {
            byte[] var5 = var2.ap(var1, -1776249852);
            this.ae(var2, var1, var5, true, (byte)-66);
         }
      } else {
         this.ag.ay(this, -181318597 * this.ae, var1, this.al[var1], (byte)2, true, 1473483156);
      }

   }

   public boolean bt(int var1) {
      return this.be(var1, 1495399228) != null;
   }

   int bp(int var1) {
      if (null != this.bx[var1]) {
         return 100;
      } else {
         return this.au[var1] ? 1462747702 : this.ag.ae(-181318597 * this.ae, var1, 775233756);
      }
   }

   public int az() {
      if (1 == -84195103 * this.am || this.ab && 2 == -84195103 * this.am) {
         return 100;
      } else if (this.bx != null) {
         return 99;
      } else {
         int var1 = this.ag.ae(oz.ap.al * -1308770465, -181318597 * this.ae, -300869728);
         if (var1 >= 100) {
            var1 = 99;
         }

         return var1;
      }
   }

   public static pu ie(int var0) {
      try {
         return client.qb;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "or.ie(" + ')');
      }
   }

   public boolean by(int var1) {
      return this.au[var1];
   }

   public boolean br(int var1) {
      return this.be(var1, 2117191991) != null;
   }

   public boolean bn(int var1) {
      return this.be(var1, 1234516464) != null;
   }

   public boolean bu(int var1) {
      return this.be(var1, 1599866719) != null;
   }

   void as(int var1, byte[] var2, boolean var3, boolean var4, byte var5) {
      try {
         if (var3) {
            if (var5 <= 0) {
               return;
            }

            if (1 == -84195103 * this.am) {
               if (var5 <= 0) {
                  return;
               }

               throw new RuntimeException();
            }

            if (null != this.as) {
               if (var5 <= 0) {
                  return;
               }

               jx.ap(-181318597 * this.ae, var2, this.as, -1932597069);
            }

            this.bs(var2, (byte)-85);
            this.am(1638417851);
         } else {
            var2[var2.length - 2] = (byte)(this.aa[var1] >> 8);
            var2[var2.length - 1] = (byte)this.aa[var1];
            if (this.ay != null) {
               if (var5 <= 0) {
                  throw new IllegalStateException();
               }

               jx.ap(var1, var2, this.ay, -1880017708);
               this.au[var1] = true;
            }

            if (var4) {
               if (var5 <= 0) {
                  throw new IllegalStateException();
               }

               this.bx[var1] = ke.ap(var2, false, -988798547);
            }
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "or.as(" + ')');
      }
   }

   void ag(int var1) {
      this.ag.as(this.ae * -181318597, var1, 1088978110);
   }
}
