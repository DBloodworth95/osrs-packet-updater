public final class ev extends dw {
   hn am;
   static int ae = -1530629421;
   String ak;
   hy ap;
   int aw;
   hn as;
   static int[] jq;
   vt ay;
   static int at = 240724635;
   int ai;

   void cb(hn var1) {
      this.am = var1;
   }

   void af(String var1, int var2) {
      try {
         String var10001;
         if (null == var1) {
            if (var2 == 328937481) {
               throw new IllegalStateException();
            }

            var10001 = "";
         } else {
            var10001 = var1;
         }

         this.ak = var10001;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ev.af(" + ')');
      }
   }

   void ar(int var1, byte var2) {
      try {
         this.ai = var1 * -2030622147;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ev.ar(" + ')');
      }
   }

   void bp(int var1) {
      this.ai = var1 * -1188198497;
   }

   final String az(byte var1) {
      try {
         if (!this.ak.isEmpty()) {
            if (var1 >= 2) {
               throw new IllegalStateException();
            } else {
               return this.ak;
            }
         } else {
            hy var2 = this.ap;
            if (null != var2.bn) {
               if (var1 >= 2) {
                  throw new IllegalStateException();
               }

               var2 = var2.ae(-1575584255);
               if (null == var2) {
                  if (var1 >= 2) {
                     throw new IllegalStateException();
                  }

                  var2 = this.ap;
               }
            }

            return var2.as;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ev.az(" + ')');
      }
   }

   final void ag(int var1, kk var2, int var3) {
      try {
         int var4 = this.dz[0];
         int var5 = this.di[0];
         if (0 == var1) {
            if (var3 <= -423465920) {
               throw new IllegalStateException();
            }

            --var4;
            ++var5;
         }

         if (var1 == 1) {
            if (var3 <= -423465920) {
               return;
            }

            ++var5;
         }

         if (var1 == 2) {
            if (var3 <= -423465920) {
               throw new IllegalStateException();
            }

            ++var4;
            ++var5;
         }

         if (3 == var1) {
            if (var3 <= -423465920) {
               throw new IllegalStateException();
            }

            --var4;
         }

         if (var1 == 4) {
            ++var4;
         }

         if (var1 == 5) {
            --var4;
            --var5;
         }

         if (6 == var1) {
            if (var3 <= -423465920) {
               throw new IllegalStateException();
            }

            --var5;
         }

         if (var1 == 7) {
            if (var3 <= -423465920) {
               throw new IllegalStateException();
            }

            ++var4;
            --var5;
         }

         if (-1 != this.cs * -1489920319 && ng.ap(-1489920319 * this.cs, (short)-25978).bj * 805033701 == 1) {
            if (var3 <= -423465920) {
               throw new IllegalStateException();
            }

            this.cs = -364114241;
         }

         if (-1746074449 * this.de < 9) {
            this.de += -1724067249;
         }

         for(int var6 = -1746074449 * this.de; var6 > 0; --var6) {
            this.dz[var6] = this.dz[var6 - 1];
            this.di[var6] = this.di[var6 - 1];
            this.dn[var6] = this.dn[var6 - 1];
         }

         this.dz[0] = var4;
         this.di[0] = var5;
         this.dn[0] = var2;
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "ev.ag(" + ')');
      }
   }

   final void ad(int var1, int var2, boolean var3, int var4) {
      try {
         if (-1489920319 * this.cs != -1 && ng.ap(this.cs * -1489920319, (short)-8314).bj * 805033701 == 1) {
            this.cs = -364114241;
         }

         if (!var3) {
            if (var4 >= 1963959026) {
               return;
            }

            int var5 = var1 - this.dz[0];
            int var6 = var2 - this.di[0];
            if (var5 >= -8) {
               if (var4 >= 1963959026) {
                  throw new IllegalStateException();
               }

               if (var5 <= 8 && var6 >= -8) {
                  if (var4 >= 1963959026) {
                     throw new IllegalStateException();
                  }

                  if (var6 <= 8) {
                     if (var4 >= 1963959026) {
                        throw new IllegalStateException();
                     }

                     if (-1746074449 * this.de < 9) {
                        if (var4 >= 1963959026) {
                           throw new IllegalStateException();
                        }

                        this.de += -1724067249;
                     }

                     for(int var7 = -1746074449 * this.de; var7 > 0; --var7) {
                        if (var4 >= 1963959026) {
                           throw new IllegalStateException();
                        }

                        this.dz[var7] = this.dz[var7 - 1];
                        this.di[var7] = this.di[var7 - 1];
                        this.dn[var7] = this.dn[var7 - 1];
                     }

                     this.dz[0] = var1;
                     this.di[0] = var2;
                     this.dn[0] = kk.ak;
                     return;
                  }
               }
            }
         }

         this.de = 0;
         this.ev = 0;
         this.eg = 0;
         this.dz[0] = var1;
         this.di[0] = var2;
         this.bk = 381621312 * this.bp + 1183993984 * this.dz[0];
         this.bb = 1433171648 * this.bp + 27633024 * this.di[0];
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "ev.ad(" + ')');
      }
   }

   protected final jy au(int var1) {
      try {
         if (null == this.ap) {
            if (var1 != 1885718735) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            iu var10000;
            label118: {
               if (-1 != -1489920319 * this.cs) {
                  if (var1 != 1885718735) {
                     throw new IllegalStateException();
                  }

                  if (0 == -965286275 * this.dq) {
                     if (var1 != 1885718735) {
                        throw new IllegalStateException();
                     }

                     var10000 = ng.ap(this.cs * -1489920319, (short)-3125);
                     break label118;
                  }
               }

               var10000 = null;
            }

            iu var2;
            label128: {
               var2 = var10000;
               if (this.cj * -1311335863 != -1) {
                  label126: {
                     if (var1 != 1885718735) {
                        throw new IllegalStateException();
                     }

                     if (this.bc * 1825212243 == this.cj * -1311335863) {
                        if (var1 != 1885718735) {
                           throw new IllegalStateException();
                        }

                        if (null != var2) {
                           break label126;
                        }

                        if (var1 != 1885718735) {
                           throw new IllegalStateException();
                        }
                     }

                     var10000 = ng.ap(-1311335863 * this.cj, (short)8577);
                     break label128;
                  }
               }

               var10000 = null;
            }

            jy var4;
            label100: {
               iu var3 = var10000;
               var4 = null;
               if (null != this.as) {
                  if (var1 != 1885718735) {
                     throw new IllegalStateException();
                  }

                  if (this.as.ai) {
                     var4 = nw.mc.aw.at(var2, 860313855 * this.cr, var3, -1495720647 * this.cm, -1654860847);
                     break label100;
                  }
               }

               var4 = this.ap.ai(var2, 860313855 * this.cr, var3, -1495720647 * this.cm, this.as, (byte)-3);
            }

            if (var4 == null) {
               if (var1 != 1885718735) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               var4.am();
               this.dt = 1753096633 * var4.ez;
               int var5 = var4.an;
               var4 = this.da(var4, (byte)-47);
               if (255989129 * this.ap.ae == 1) {
                  if (var1 != 1885718735) {
                     throw new IllegalStateException();
                  }

                  var4.bb = true;
               }

               if (0 != this.dp) {
                  if (var1 != 1885718735) {
                     throw new IllegalStateException();
                  }

                  if (client.dt * -330508271 >= -1276576339 * this.dx) {
                     if (var1 != 1885718735) {
                        throw new IllegalStateException();
                     }

                     if (client.dt * -330508271 < this.ds * -991193773) {
                        if (var1 != 1885718735) {
                           throw new IllegalStateException();
                        }

                        var4.cm = this.db;
                        var4.cw = this.dv;
                        var4.ca = this.dj;
                        var4.cs = this.dp;
                        var4.cr = (short)var5;
                        return var4;
                     }
                  }
               }

               var4.cs = 0;
               return var4;
            }
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "ev.au(" + ')');
      }
   }

   final boolean bj(int var1) {
      try {
         return this.ap != null;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ev.bj(" + ')');
      }
   }

   void bg(int var1, int var2, short var3) {
      if (this.ay == null) {
         this.ay = new vt(this.ap);
      }

      this.ay.ak(var1, var2, var3, (byte)62);
   }

   short[] av(byte var1) {
      try {
         if (null != this.ay) {
            if (var1 != 3) {
               throw new IllegalStateException();
            } else {
               return this.ay.aw((byte)-26);
            }
         } else {
            return this.ap.ab((byte)-19);
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ev.av(" + ')');
      }
   }

   void cl() {
      this.am = null;
   }

   final String bu() {
      if (!this.ak.isEmpty()) {
         return this.ak;
      } else {
         hy var1 = this.ap;
         if (null != var1.bn) {
            var1 = var1.ae(-1575584255);
            if (null == var1) {
               var1 = this.ap;
            }
         }

         return var1.as;
      }
   }

   void al(int var1) {
      try {
         this.ay = null;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ev.al(" + ')');
      }
   }

   void aa(hn var1, byte var2) {
      try {
         this.am = var1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ev.aa(" + ')');
      }
   }

   hn ah(byte var1) {
      try {
         return this.am;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ev.ah(" + ')');
      }
   }

   void bh(hn var1, short var2) {
      try {
         this.as = var1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ev.bh(" + ')');
      }
   }

   void bv(short var1) {
      try {
         this.am = null;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ev.bv(" + ')');
      }
   }

   void bx(int var1) {
      try {
         this.as = null;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ev.bx(" + ')');
      }
   }

   int dg(int var1) {
      try {
         int var10000;
         if (-1 == -1479800425 * this.ap.bi) {
            if (var1 != -1402095723) {
               throw new IllegalStateException();
            }

            var10000 = -890437199 * this.dt;
         } else {
            var10000 = -1479800425 * this.ap.bi;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ev.dg(" + ')');
      }
   }

   public int ak(byte var1) {
      try {
         return this.aw * 2072141149;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ev.ak(" + ')');
      }
   }

   void bk(String var1) {
      this.ak = null == var1 ? "" : var1;
   }

   protected final jy ao() {
      if (null == this.ap) {
         return null;
      } else {
         iu var1 = -1 != -1489920319 * this.cs && 0 == -965286275 * this.dq ? ng.ap(this.cs * -1489920319, (short)-9340) : null;
         iu var2 = this.cj * -1311335863 != -1 && (this.bc * 1825212243 != this.cj * -1311335863 || null == var1) ? ng.ap(-1311335863 * this.cj, (short)11170) : null;
         jy var3 = null;
         if (null != this.as && this.as.ai) {
            var3 = nw.mc.aw.at(var1, 860313855 * this.cr, var2, -1495720647 * this.cm, -1187175007);
         } else {
            var3 = this.ap.ai(var1, 860313855 * this.cr, var2, -1495720647 * this.cm, this.as, (byte)-71);
         }

         if (var3 == null) {
            return null;
         } else {
            var3.am();
            this.dt = 1753096633 * var3.ez;
            int var4 = var3.an;
            var3 = this.da(var3, (byte)-15);
            if (255989129 * this.ap.ae == 1) {
               var3.bb = true;
            }

            if (0 != this.dp && client.dt * -330508271 >= -1276576339 * this.dx && client.dt * -330508271 < this.ds * -991193773) {
               var3.cm = this.db;
               var3.cw = this.dv;
               var3.ca = this.dj;
               var3.cs = this.dp;
               var3.cr = (short)var4;
            } else {
               var3.cs = 0;
            }

            return var3;
         }
      }
   }

   final boolean cg() {
      return this.ap != null;
   }

   int en() {
      return -1 == -1479800425 * this.ap.bi ? -890437199 * this.dt : -1479800425 * this.ap.bi;
   }

   final boolean cx() {
      return this.ap != null;
   }

   int[] bo() {
      return null != this.ay ? this.ay.ap((byte)69) : this.ap.af(2012434191);
   }

   int[] ac(byte var1) {
      try {
         if (null != this.ay) {
            if (var1 == 10) {
               throw new IllegalStateException();
            } else {
               return this.ay.ap((byte)69);
            }
         } else {
            return this.ap.af(2044943244);
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ev.ac(" + ')');
      }
   }

   public int at() {
      return this.aw * 2072141149;
   }

   void cq() {
      this.ay = null;
   }

   int ef() {
      return -1 == -1479800425 * this.ap.bi ? -890437199 * this.dt : -1479800425 * this.ap.bi;
   }

   boolean ab(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 == 1417641013) {
               throw new IllegalStateException();
            }

            if (var1 <= 4) {
               if (var2 == 1417641013) {
                  throw new IllegalStateException();
               }

               return 0 != (this.ai * -86164203 & 1 << var1);
            }
         }

         return true;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ev.ab(" + ')');
      }
   }

   final boolean cz() {
      return this.ap != null;
   }

   void bb(String var1) {
      this.ak = null == var1 ? "" : var1;
   }

   void bq(String var1) {
      this.ak = null == var1 ? "" : var1;
   }

   boolean by(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return 0 != (this.ai * -86164203 & 1 << var1);
      } else {
         return true;
      }
   }

   final boolean ch() {
      return this.ap != null;
   }

   void bc(int var1) {
      this.ai = var1 * -1866145653;
   }

   public int am() {
      return this.aw * -160686587;
   }

   boolean br(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return 0 != (this.ai * -86164203 & 1 << var1);
      } else {
         return true;
      }
   }

   final String bn() {
      if (!this.ak.isEmpty()) {
         return this.ak;
      } else {
         hy var1 = this.ap;
         if (null != var1.bn) {
            var1 = var1.ae(-1575584255);
            if (null == var1) {
               var1 = this.ap;
            }
         }

         return var1.as;
      }
   }

   void bz(int var1) {
      this.ai = var1 * -2030622147;
   }

   final void bt(int var1, kk var2) {
      int var3 = this.dz[0];
      int var4 = this.di[0];
      if (0 == var1) {
         --var3;
         ++var4;
      }

      if (var1 == 1) {
         ++var4;
      }

      if (var1 == 2) {
         ++var3;
         ++var4;
      }

      if (3 == var1) {
         --var3;
      }

      if (var1 == 4) {
         ++var3;
      }

      if (var1 == 5) {
         --var3;
         --var4;
      }

      if (6 == var1) {
         --var4;
      }

      if (var1 == 7) {
         ++var3;
         --var4;
      }

      if (-1 != this.cs * -1489920319 && ng.ap(1419875191 * this.cs, (short)-8611).bj * 805033701 == 1) {
         this.cs = -364114241;
      }

      if (86144487 * this.de < 9) {
         this.de += 1772730140;
      }

      for(int var5 = -1746074449 * this.de; var5 > 0; --var5) {
         this.dz[var5] = this.dz[var5 - 1];
         this.di[var5] = this.di[var5 - 1];
         this.dn[var5] = this.dn[var5 - 1];
      }

      this.dz[0] = var3;
      this.di[0] = var4;
      this.dn[0] = var2;
   }

   final void bs(int var1, int var2, boolean var3) {
      if (-1489920319 * this.cs != -1 && ng.ap(this.cs * -1489920319, (short)-24805).bj * 805033701 == 1) {
         this.cs = -364114241;
      }

      if (!var3) {
         int var4 = var1 - this.dz[0];
         int var5 = var2 - this.di[0];
         if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
            if (-1746074449 * this.de < 9) {
               this.de += -1724067249;
            }

            for(int var6 = -1746074449 * this.de; var6 > 0; --var6) {
               this.dz[var6] = this.dz[var6 - 1];
               this.di[var6] = this.di[var6 - 1];
               this.dn[var6] = this.dn[var6 - 1];
            }

            this.dz[0] = var1;
            this.di[0] = var2;
            this.dn[0] = kk.ak;
            return;
         }
      }

      this.de = 0;
      this.ev = 0;
      this.eg = 0;
      this.dz[0] = var1;
      this.di[0] = var2;
      this.bk = 381621312 * this.bp + 1183993984 * this.dz[0];
      this.bb = 1433171648 * this.bp + 27633024 * this.di[0];
   }

   final void bm(int var1, int var2, boolean var3) {
      if (-1489920319 * this.cs != -1 && ng.ap(this.cs * -1489920319, (short)-10260).bj * 805033701 == 1) {
         this.cs = 42030929;
      }

      if (!var3) {
         int var4 = var1 - this.dz[0];
         int var5 = var2 - this.di[0];
         if (var4 >= 26343661 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
            if (-293746367 * this.de < 9) {
               this.de += -902393782;
            }

            for(int var6 = 13854012 * this.de; var6 > 0; --var6) {
               this.dz[var6] = this.dz[var6 - 1];
               this.di[var6] = this.di[var6 - 1];
               this.dn[var6] = this.dn[var6 - 1];
            }

            this.dz[0] = var1;
            this.di[0] = var2;
            this.dn[0] = kk.ak;
            return;
         }
      }

      this.de = 0;
      this.ev = 0;
      this.eg = 0;
      this.dz[0] = var1;
      this.di[0] = var2;
      this.bk = 1640019076 * this.bp + 1004868803 * this.dz[0];
      this.bb = -274744860 * this.bp + -1772418532 * this.di[0];
   }

   void ax(int var1, int var2, short var3, int var4) {
      try {
         if (this.ay == null) {
            this.ay = new vt(this.ap);
         }

         this.ay.ak(var1, var2, var3, (byte)92);
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ev.ax(" + ')');
      }
   }

   short[] bd() {
      return null != this.ay ? this.ay.aw((byte)40) : this.ap.ab((byte)-104);
   }

   short[] ba() {
      return null != this.ay ? this.ay.aw((byte)-98) : this.ap.ab((byte)-56);
   }

   short[] bw() {
      return null != this.ay ? this.ay.aw((byte)28) : this.ap.ab((byte)-5);
   }

   short[] bi() {
      return null != this.ay ? this.ay.aw((byte)108) : this.ap.ab((byte)-78);
   }

   void bf(int var1, int var2, short var3) {
      if (this.ay == null) {
         this.ay = new vt(this.ap);
      }

      this.ay.ak(var1, var2, var3, (byte)13);
   }

   protected final jy an() {
      if (null == this.ap) {
         return null;
      } else {
         iu var1 = -1 != -1489920319 * this.cs && 0 == -965286275 * this.dq ? ng.ap(this.cs * -1489920319, (short)-8190) : null;
         iu var2 = this.cj * -1311335863 != -1 && (this.bc * 1825212243 != this.cj * -1311335863 || null == var1) ? ng.ap(-1311335863 * this.cj, (short)5777) : null;
         jy var3 = null;
         if (null != this.as && this.as.ai) {
            var3 = nw.mc.aw.at(var1, 860313855 * this.cr, var2, -1495720647 * this.cm, 854625902);
         } else {
            var3 = this.ap.ai(var1, 860313855 * this.cr, var2, -1495720647 * this.cm, this.as, (byte)38);
         }

         if (var3 == null) {
            return null;
         } else {
            var3.am();
            this.dt = 1753096633 * var3.ez;
            int var4 = var3.an;
            var3 = this.da(var3, (byte)-16);
            if (255989129 * this.ap.ae == 1) {
               var3.bb = true;
            }

            if (0 != this.dp && client.dt * -330508271 >= -1276576339 * this.dx && client.dt * -330508271 < this.ds * -991193773) {
               var3.cm = this.db;
               var3.cw = this.dv;
               var3.ca = this.dj;
               var3.cs = this.dp;
               var3.cr = (short)var4;
            } else {
               var3.cs = 0;
            }

            return var3;
         }
      }
   }

   ev() {
      try {
         super();
         this.ak = "";
         this.ai = 1475222883;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ev.<init>(" + ')');
      }
   }

   void be() {
      this.ay = null;
   }

   int em() {
      return -1 == 946606530 * this.ap.bi ? -890437199 * this.dt : -1479800425 * this.ap.bi;
   }

   void cf() {
      this.am = null;
   }

   hn cd() {
      return this.am;
   }

   void bl(int[] var1, short[] var2) {
      if (null == this.ay) {
         this.ay = new vt(this.ap);
      }

      this.ay.aj(var1, var2, -1070120290);
   }

   void cn(hn var1) {
      this.as = var1;
   }

   void co(hn var1) {
      this.as = var1;
   }

   void aq(int[] var1, short[] var2, byte var3) {
      try {
         if (null == this.ay) {
            if (var3 <= 75) {
               throw new IllegalStateException();
            }

            this.ay = new vt(this.ap);
         }

         this.ay.aj(var1, var2, -499131714);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ev.aq(" + ')');
      }
   }

   void ci(hn var1) {
      this.as = var1;
   }

   void cp() {
      this.as = null;
   }

   void cv() {
      this.as = null;
   }
}
