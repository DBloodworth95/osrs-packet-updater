import java.util.zip.CRC32;

public class of extends po {
   int ah;
   boolean aa;
   static final int ag = 0;
   int ab;
   sl aq;
   sl af;
   static final int ac = 200;
   volatile int au;
   boolean ar;
   volatile boolean[] al;
   static CRC32 ad = new CRC32();
   int at;
   int ap;
   static final int ae = 200;
   boolean az;
   static final int ax = 2;
   py ai;

   void bp() {
      this.al = new boolean[this.bx.length];

      int var1;
      for(var1 = 0; var1 < this.al.length; ++var1) {
         this.al[var1] = false;
      }

      if (null == this.aq) {
         this.au = -1583830743;
      } else {
         this.ab = 1064650893;

         for(var1 = 0; var1 < this.al.length; ++var1) {
            if (this.ak[var1] > 0) {
               el.ae(var1, this.aq, this, (byte)1);
               this.ab = -1064650893 * var1;
            }
         }

         if (-1 == this.ab * 962479547) {
            this.au = -1583830743;
         }

      }
   }

   public boolean ac(byte var1) {
      try {
         boolean var10000;
         if (1 == this.au * 347865881) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "of.ac(" + ')');
      }
   }

   void af(int var1, byte[] var2, boolean var3, boolean var4, int var5) {
      try {
         if (var3) {
            if (var5 == 1001317441) {
               return;
            }

            if (this.au * 347865881 == 1) {
               if (var5 == 1001317441) {
                  throw new IllegalStateException();
               }

               throw new RuntimeException();
            }

            if (this.af != null) {
               if (var5 == 1001317441) {
                  return;
               }

               jj.ac(-93970877 * this.at, var2, this.af, 1820837923);
            }

            this.bv(var2, 1881248472);
            this.au((byte)24);
         } else {
            var2[var2.length - 2] = (byte)(this.an[var1] >> 8);
            var2[var2.length - 1] = (byte)this.an[var1];
            if (this.aq != null) {
               if (var5 == 1001317441) {
                  return;
               }

               jj.ac(var1, var2, this.aq, 1716451415);
               this.al[var1] = true;
            }

            if (var4) {
               if (var5 == 1001317441) {
                  throw new IllegalStateException();
               }

               Object[] var6 = this.bx;
               Object var8;
               if (null == var2) {
                  if (var5 == 1001317441) {
                     throw new IllegalStateException();
                  }

                  var8 = null;
               } else if (var2.length > 136) {
                  ov var9 = new ov();
                  var9.ag(var2, (byte)10);
                  var8 = var9;
               } else {
                  var8 = var2;
               }

               var6[var1] = var8;
            }
         }

      } catch (RuntimeException var10) {
         throw vk.ae(var10, "of.af(" + ')');
      }
   }

   void ag(int var1, int var2) {
      try {
         this.ai.af(this.at * -93970877, var1, -2124436262);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "of.ag(" + ')');
      }
   }

   void am(int var1, int var2) {
      try {
         if (this.aq != null) {
            if (var2 >= 567396428) {
               throw new IllegalStateException();
            }

            if (null != this.al) {
               if (var2 >= 567396428) {
                  throw new IllegalStateException();
               }

               if (this.al[var1]) {
                  if (var2 >= 567396428) {
                     throw new IllegalStateException();
                  }

                  as.ag(var1, this.aq, this, -1327203562);
                  return;
               }
            }
         }

         this.ai.aq(this, -93970877 * this.at, var1, this.aw[var1], (byte)2, true, (byte)42);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "of.am(" + ')');
      }
   }

   int ar(int var1, int var2) {
      try {
         if (null != this.bx[var1]) {
            if (var2 != -828917415) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else if (this.al[var1]) {
            if (var2 != -828917415) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else {
            return this.ai.at(this.at * -93970877, var1, 489617895);
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "of.ar(" + ')');
      }
   }

   public boolean ap() {
      return 1 == this.au * 347865881;
   }

   public void at(sl var1, int var2, byte[] var3, boolean var4, int var5) {
      try {
         int var6;
         if (var1 == this.af) {
            if (this.au * 347865881 == 1) {
               throw new RuntimeException();
            } else if (var3 == null) {
               this.ai.aq(this, oy.ac.aw * 1664878975, -93970877 * this.at, -729879015 * this.ah, (byte)0, true, (byte)56);
            } else {
               ad.reset();
               ad.update(var3, 0, var3.length);
               var6 = (int)ad.getValue();
               if (-729879015 * this.ah != var6) {
                  if (var5 <= 1582745440) {
                     throw new IllegalStateException();
                  } else {
                     this.ai.aq(this, oy.ac.aw * 1664878975, -93970877 * this.at, -729879015 * this.ah, (byte)0, true, (byte)109);
                  }
               } else {
                  vf var13 = new vf(jc.ca(var3, 1114068733));
                  int var14 = var13.cv(952452697);
                  if (5 != var14 && var14 != 6) {
                     if (var5 > 1582745440) {
                        throw new RuntimeException(var14 + "," + this.at * -93970877 + "," + var2);
                     }
                  } else {
                     int var9 = 0;
                     if (var14 >= 6) {
                        if (var5 <= 1582745440) {
                           throw new IllegalStateException();
                        }

                        var9 = var13.cz(-1734056172);
                     }

                     if (this.ap * 291833841 != var9) {
                        this.ai.aq(this, oy.ac.aw * 1664878975, this.at * -93970877, this.ah * -729879015, (byte)0, true, (byte)73);
                     } else {
                        this.bv(var3, 1145586574);
                        this.au((byte)-109);
                     }
                  }
               }
            }
         } else {
            if (!var4) {
               if (var5 <= 1582745440) {
                  throw new IllegalStateException();
               }

               if (this.ab * 962479547 == var2) {
                  if (var5 <= 1582745440) {
                     throw new IllegalStateException();
                  }

                  this.au = -1583830743;
               }
            }

            if (null != var3) {
               if (var5 <= 1582745440) {
                  throw new IllegalStateException();
               }

               if (var3.length > 2) {
                  ad.reset();
                  ad.update(var3, 0, var3.length - 2);
                  var6 = (int)ad.getValue();
                  int var7 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
                  if (var6 == this.aw[var2]) {
                     if (var5 <= 1582745440) {
                        return;
                     }

                     if (this.an[var2] == var7) {
                        this.al[var2] = true;
                        if (var4) {
                           if (var5 <= 1582745440) {
                              return;
                           }

                           Object[] var8 = this.bx;
                           Object var10;
                           if (null == var3) {
                              var10 = null;
                           } else if (var3.length > 136) {
                              if (var5 <= 1582745440) {
                                 throw new IllegalStateException();
                              }

                              ov var11 = new ov();
                              var11.ag(var3, (byte)-70);
                              var10 = var11;
                           } else {
                              var10 = var3;
                           }

                           var8[var2] = var10;
                        }

                        return;
                     }
                  }

                  this.al[var2] = false;
                  if (this.ar || var4) {
                     this.ai.aq(this, -93970877 * this.at, var2, this.aw[var2], (byte)2, var4, (byte)81);
                  }

                  return;
               }

               if (var5 <= 1582745440) {
                  throw new IllegalStateException();
               }
            }

            this.al[var2] = false;
            if (!this.ar) {
               if (var5 <= 1582745440) {
                  throw new IllegalStateException();
               }

               if (!var4) {
                  return;
               }

               if (var5 <= 1582745440) {
                  throw new IllegalStateException();
               }
            }

            this.ai.aq(this, this.at * -93970877, var2, this.aw[var2], (byte)2, var4, (byte)116);
         }
      } catch (RuntimeException var12) {
         throw vk.ae(var12, "of.at(" + ')');
      }
   }

   void au(byte var1) {
      try {
         this.al = new boolean[this.bx.length];

         int var2;
         for(var2 = 0; var2 < this.al.length; ++var2) {
            if (var1 == 3) {
               throw new IllegalStateException();
            }

            this.al[var2] = false;
         }

         if (null == this.aq) {
            if (var1 == 3) {
               throw new IllegalStateException();
            } else {
               this.au = -1583830743;
            }
         } else {
            this.ab = 1064650893;

            for(var2 = 0; var2 < this.al.length; ++var2) {
               if (var1 == 3) {
                  throw new IllegalStateException();
               }

               if (this.ak[var2] > 0) {
                  if (var1 == 3) {
                     return;
                  }

                  el.ae(var2, this.aq, this, (byte)1);
                  this.ab = -1064650893 * var2;
               }
            }

            if (-1 == this.ab * 962479547) {
               if (var1 == 3) {
                  return;
               }

               this.au = -1583830743;
            }

         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "of.au(" + ')');
      }
   }

   void ay(int var1) {
      this.ai.af(this.at * -93970877, var1, -1865916497);
   }

   public boolean al(int var1, int var2) {
      try {
         return this.al[var1];
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "of.al(" + ')');
      }
   }

   public boolean ad(int var1, int var2) {
      try {
         boolean var10000;
         if (this.cm(var1, 2121053325) != null) {
            if (var2 != 2144621165) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "of.ad(" + ')');
      }
   }

   public int ah(int var1) {
      try {
         int var2 = 0;
         int var3 = 0;

         int var4;
         for(var4 = 0; var4 < this.bx.length; ++var4) {
            if (var1 != 1712367457) {
               throw new IllegalStateException();
            }

            if (this.ak[var4] > 0) {
               if (var1 != 1712367457) {
                  throw new IllegalStateException();
               }

               var2 += 100;
               var3 += this.ar(var4, -828917415);
            }
         }

         if (0 == var2) {
            return 100;
         } else {
            var4 = var3 * 100 / var2;
            return var4;
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "of.ah(" + ')');
      }
   }

   void aw(int var1) {
      if (this.aq != null && null != this.al && this.al[var1]) {
         as.ag(var1, this.aq, this, -1906580218);
      } else {
         this.ai.aq(this, -93970877 * this.at, var1, this.aw[var1], (byte)2, true, (byte)95);
      }

   }

   int bb(int var1) {
      if (null != this.bx[var1]) {
         return 131966226;
      } else {
         return this.al[var1] ? 1409481824 : this.ai.at(this.at * -93970877, var1, 489617895);
      }
   }

   void as(int var1) {
      this.ai.af(this.at * -93970877, var1, -839914500);
   }

   public boolean az() {
      return 1 == this.au * 347865881;
   }

   void ak() {
      this.au = 1127305810;
      this.ay = new int[0];
      this.aw = new int[0];
      this.an = new int[0];
      this.ak = new int[0];
      this.bn = new int[0][];
      this.bx = new Object[0];
      this.bf = new Object[0][];
   }

   public int ai() {
      if (1 == this.au * 347865881 || this.az && this.au * 347865881 == 2) {
         return 100;
      } else if (null != this.bx) {
         return -1341253743;
      } else {
         int var1 = this.ai.at(oy.ac.aw * 1664878975, -93970877 * this.at, 489617895);
         if (var1 >= -1029838551) {
            var1 = 758557217;
         }

         return var1;
      }
   }

   public int ao() {
      if (1 == this.au * 347865881 || this.az && this.au * 347865881 == 2) {
         return 100;
      } else if (null != this.bx) {
         return 99;
      } else {
         int var1 = this.ai.at(oy.ac.aw * 1664878975, -93970877 * this.at, 489617895);
         if (var1 >= 100) {
            var1 = 99;
         }

         return var1;
      }
   }

   public int bo() {
      int var1 = 0;
      int var2 = 0;

      int var3;
      for(var3 = 0; var3 < this.bx.length; ++var3) {
         if (this.ak[var3] > 0) {
            var1 += 100;
            var2 += this.ar(var3, -828917415);
         }
      }

      if (0 == var1) {
         return 100;
      } else {
         var3 = var2 * 100 / var1;
         return var3;
      }
   }

   void aq(int var1, int var2, int var3) {
      try {
         this.ah = var1 * 1806339625;
         this.ap = var2 * 372443409;
         if (null != this.af) {
            if (var3 <= -917888260) {
               throw new IllegalStateException();
            }

            as.ag(this.at * -93970877, this.af, this, -433417067);
         } else {
            this.ai.aq(this, 1664878975 * oy.ac.aw, this.at * -93970877, this.ah * -729879015, (byte)0, true, (byte)100);
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "of.aq(" + ')');
      }
   }

   void aj(int var1) {
      this.ai.af(this.at * -93970877, var1, -1586045202);
   }

   public int aa() {
      if (1 != this.au * -1914924282 && (!this.az || this.au * 1822448235 != 2)) {
         if (null != this.bx) {
            return 99;
         } else {
            int var1 = this.ai.at(oy.ac.aw * 1048289621, -93970877 * this.at, 489617895);
            if (var1 >= 100) {
               var1 = 1017852728;
            }

            return var1;
         }
      } else {
         return 100;
      }
   }

   void bw() {
      this.al = new boolean[this.bx.length];

      int var1;
      for(var1 = 0; var1 < this.al.length; ++var1) {
         this.al[var1] = false;
      }

      if (null == this.aq) {
         this.au = -1583830743;
      } else {
         this.ab = 1064650893;

         for(var1 = 0; var1 < this.al.length; ++var1) {
            if (this.ak[var1] > 0) {
               el.ae(var1, this.aq, this, (byte)1);
               this.ab = -1064650893 * var1;
            }
         }

         if (-1 == this.ab * 962479547) {
            this.au = -1583830743;
         }

      }
   }

   void an() {
      this.au = 1127305810;
      this.ay = new int[0];
      this.aw = new int[0];
      this.an = new int[0];
      this.ak = new int[0];
      this.bn = new int[0][];
      this.bx = new Object[0];
      this.bf = new Object[0][];
   }

   public int ae(int var1) {
      try {
         label47: {
            if (1 != this.au * 347865881) {
               if (var1 != 825679276) {
                  throw new IllegalStateException();
               }

               if (!this.az) {
                  break label47;
               }

               if (var1 != 825679276) {
                  throw new IllegalStateException();
               }

               if (this.au * 347865881 != 2) {
                  break label47;
               }

               if (var1 != 825679276) {
                  throw new IllegalStateException();
               }
            }

            return 100;
         }

         if (null != this.bx) {
            if (var1 != 825679276) {
               throw new IllegalStateException();
            } else {
               return 99;
            }
         } else {
            int var2 = this.ai.at(oy.ac.aw * 1664878975, -93970877 * this.at, 489617895);
            if (var2 >= 100) {
               if (var1 != 825679276) {
                  throw new IllegalStateException();
               }

               var2 = 99;
            }

            return var2;
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "of.ae(" + ')');
      }
   }

   void bn(int var1, int var2) {
      this.ah = var1 * 1806339625;
      this.ap = var2 * 372443409;
      if (null != this.af) {
         as.ag(this.at * -93970877, this.af, this, -2018210866);
      } else {
         this.ai.aq(this, 1664878975 * oy.ac.aw, this.at * -93970877, this.ah * -729879015, (byte)0, true, (byte)112);
      }

   }

   void bh(int var1, int var2) {
      this.ah = var1 * 1806339625;
      this.ap = var2 * 762794962;
      if (null != this.af) {
         as.ag(this.at * -93970877, this.af, this, -543475958);
      } else {
         this.ai.aq(this, -1040815858 * oy.ac.aw, this.at * -1784244858, this.ah * -729879015, (byte)0, true, (byte)92);
      }

   }

   void bd(int var1, int var2) {
      this.ah = var1 * 1806339625;
      this.ap = var2 * 372443409;
      if (null != this.af) {
         as.ag(this.at * -93970877, this.af, this, -286578328);
      } else {
         this.ai.aq(this, 1664878975 * oy.ac.aw, this.at * -93970877, this.ah * -729879015, (byte)0, true, (byte)85);
      }

   }

   void bx(int var1, byte[] var2, boolean var3, boolean var4) {
      if (var3) {
         if (this.au * 347865881 == 1) {
            throw new RuntimeException();
         }

         if (this.af != null) {
            jj.ac(-1622150153 * this.at, var2, this.af, 1978600370);
         }

         this.bv(var2, 1891550265);
         this.au((byte)-38);
      } else {
         var2[var2.length - 2] = (byte)(this.an[var1] >> 8);
         var2[var2.length - 1] = (byte)this.an[var1];
         if (this.aq != null) {
            jj.ac(var1, var2, this.aq, 1809324684);
            this.al[var1] = true;
         }

         if (var4) {
            Object[] var5 = this.bx;
            Object var7;
            if (null == var2) {
               var7 = null;
            } else if (var2.length > 136) {
               ov var8 = new ov();
               var8.ag(var2, (byte)18);
               var7 = var8;
            } else {
               var7 = var2;
            }

            var5[var1] = var7;
         }
      }

   }

   void ax(int var1) {
      try {
         this.au = 1127305810;
         this.ay = new int[0];
         this.aw = new int[0];
         this.an = new int[0];
         this.ak = new int[0];
         this.bn = new int[0][];
         this.bx = new Object[0];
         this.bf = new Object[0][];
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "of.ax(" + ')');
      }
   }

   public void bm(sl var1, int var2, byte[] var3, boolean var4) {
      int var5;
      if (var1 == this.af) {
         if (this.au * 347865881 == 1) {
            throw new RuntimeException();
         }

         if (var3 == null) {
            this.ai.aq(this, oy.ac.aw * 1664878975, -93970877 * this.at, -729879015 * this.ah, (byte)0, true, (byte)97);
            return;
         }

         ad.reset();
         ad.update(var3, 0, var3.length);
         var5 = (int)ad.getValue();
         if (-729879015 * this.ah != var5) {
            this.ai.aq(this, oy.ac.aw * 1664878975, -93970877 * this.at, -729879015 * this.ah, (byte)0, true, (byte)21);
            return;
         }

         vf var11 = new vf(jc.ca(var3, 17331815));
         int var12 = var11.cv(952452697);
         if (5 != var12 && var12 != 6) {
            throw new RuntimeException(var12 + "," + this.at * -93970877 + "," + var2);
         }

         int var8 = 0;
         if (var12 >= 6) {
            var8 = var11.cz(-1734056172);
         }

         if (this.ap * 291833841 != var8) {
            this.ai.aq(this, oy.ac.aw * 1664878975, this.at * -93970877, this.ah * -729879015, (byte)0, true, (byte)73);
            return;
         }

         this.bv(var3, 1229099225);
         this.au((byte)-70);
      } else {
         if (!var4 && this.ab * 962479547 == var2) {
            this.au = -1583830743;
         }

         if (null == var3 || var3.length <= 2) {
            this.al[var2] = false;
            if (this.ar || var4) {
               this.ai.aq(this, this.at * -93970877, var2, this.aw[var2], (byte)2, var4, (byte)37);
            }

            return;
         }

         ad.reset();
         ad.update(var3, 0, var3.length - 2);
         var5 = (int)ad.getValue();
         int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
         if (var5 != this.aw[var2] || this.an[var2] != var6) {
            this.al[var2] = false;
            if (this.ar || var4) {
               this.ai.aq(this, -93970877 * this.at, var2, this.aw[var2], (byte)2, var4, (byte)96);
            }

            return;
         }

         this.al[var2] = true;
         if (var4) {
            Object[] var7 = this.bx;
            Object var9;
            if (null == var3) {
               var9 = null;
            } else if (var3.length > 136) {
               ov var10 = new ov();
               var10.ag(var3, (byte)23);
               var9 = var10;
            } else {
               var9 = var3;
            }

            var7[var2] = var9;
         }
      }

   }

   void bs() {
      this.al = new boolean[this.bx.length];

      int var1;
      for(var1 = 0; var1 < this.al.length; ++var1) {
         this.al[var1] = false;
      }

      if (null == this.aq) {
         this.au = -1583830743;
      } else {
         this.ab = 1064650893;

         for(var1 = 0; var1 < this.al.length; ++var1) {
            if (this.ak[var1] > 0) {
               el.ae(var1, this.aq, this, (byte)1);
               this.ab = 1408109857 * var1;
            }
         }

         if (-1 == this.ab * 962479547) {
            this.au = -1583830743;
         }

      }
   }

   void bf(int var1, byte[] var2, boolean var3, boolean var4) {
      if (var3) {
         if (this.au * 347865881 == 1) {
            throw new RuntimeException();
         }

         if (this.af != null) {
            jj.ac(-93970877 * this.at, var2, this.af, 1482401642);
         }

         this.bv(var2, 1678545116);
         this.au((byte)-31);
      } else {
         var2[var2.length - 2] = (byte)(this.an[var1] >> 8);
         var2[var2.length - 1] = (byte)this.an[var1];
         if (this.aq != null) {
            jj.ac(var1, var2, this.aq, 1601339909);
            this.al[var1] = true;
         }

         if (var4) {
            Object[] var5 = this.bx;
            Object var7;
            if (null == var2) {
               var7 = null;
            } else if (var2.length > 136) {
               ov var8 = new ov();
               var8.ag(var2, (byte)-56);
               var7 = var8;
            } else {
               var7 = var2;
            }

            var5[var1] = var7;
         }
      }

   }

   void ba() {
      this.al = new boolean[this.bx.length];

      int var1;
      for(var1 = 0; var1 < this.al.length; ++var1) {
         this.al[var1] = false;
      }

      if (null == this.aq) {
         this.au = -878069980;
      } else {
         this.ab = 1064650893;

         for(var1 = 0; var1 < this.al.length; ++var1) {
            if (this.ak[var1] > 0) {
               el.ae(var1, this.aq, this, (byte)1);
               this.ab = 726163861 * var1;
            }
         }

         if (-1 == this.ab * 1444143840) {
            this.au = -1583830743;
         }

      }
   }

   void bj() {
      this.al = new boolean[this.bx.length];

      int var1;
      for(var1 = 0; var1 < this.al.length; ++var1) {
         this.al[var1] = false;
      }

      if (null == this.aq) {
         this.au = -1583830743;
      } else {
         this.ab = 1064650893;

         for(var1 = 0; var1 < this.al.length; ++var1) {
            if (this.ak[var1] > 0) {
               el.ae(var1, this.aq, this, (byte)1);
               this.ab = -1064650893 * var1;
            }
         }

         if (-1 == this.ab * 962479547) {
            this.au = -1583830743;
         }

      }
   }

   public of(sl var1, sl var2, py var3, int var4, boolean var5, boolean var6, boolean var7, boolean var8, boolean var9) {
      try {
         super(var5, var6);
         this.au = 0;
         this.ar = false;
         this.ab = 1064650893;
         this.az = false;
         this.aa = false;
         this.aq = var1;
         this.af = var2;
         this.at = -326328725 * var4;
         this.ar = var7;
         this.az = var8;
         this.aa = var9;
         this.ai = var3;
         this.ai.am(this, -93970877 * this.at, 2052758475);
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "of.<init>(" + ')');
      }
   }

   int by(int var1) {
      if (null != this.bx[var1]) {
         return 100;
      } else {
         return this.al[var1] ? 5116305 : this.ai.at(this.at * 949147791, var1, 489617895);
      }
   }

   public boolean ab() {
      return 1 == this.au * 347865881;
   }

   int bi(int var1) {
      if (null != this.bx[var1]) {
         return 100;
      } else {
         return this.al[var1] ? 100 : this.ai.at(this.at * -93970877, var1, 489617895);
      }
   }

   int bg(int var1) {
      if (null != this.bx[var1]) {
         return 100;
      } else {
         return this.al[var1] ? 100 : this.ai.at(this.at * -93970877, var1, 489617895);
      }
   }

   public boolean bl(int var1) {
      return this.al[var1];
   }

   public boolean bz(int var1) {
      return this.al[var1];
   }

   public boolean bu(int var1) {
      return this.cm(var1, 1479319189) != null;
   }

   public boolean br(int var1) {
      return this.cm(var1, -1928914870) != null;
   }

   void av(int var1) {
      if (this.aq != null && null != this.al && this.al[var1]) {
         as.ag(var1, this.aq, this, -727843108);
      } else {
         this.ai.aq(this, -93970877 * this.at, var1, this.aw[var1], (byte)2, true, (byte)100);
      }

   }

   static final void ab(String var0, byte var1) {
      try {
         mq var2 = fs.ac(mz.cb, client.ia.ax, (byte)-91);
         var2.ag.bu(uo.be(var0, -1684251177), (byte)58);
         var2.ag.bc(var0, -1569705711);
         client.ia.ag(var2, -722414406);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "of.ab(" + ')');
      }
   }

   public static int ac(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6, byte var7) {
      try {
         float var8 = 0.0F;

         for(int var9 = 0; var9 < 1 + var1; ++var9) {
            if (var7 == 1) {
               throw new IllegalStateException();
            }

            var8 += Math.abs(var0[var9]);
         }

         float var23 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * ft.am;
         if (var8 <= var23) {
            if (var7 == 1) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            float[] var10 = new float[1 + var1];

            int var11;
            for(var11 = 0; var11 < 1 + var1; ++var11) {
               if (var7 == 1) {
                  throw new IllegalStateException();
               }

               var10[var11] = 1.0F / var8 * var0[var11];
            }

            while(Math.abs(var10[var1]) < var23) {
               if (var7 == 1) {
                  throw new IllegalStateException();
               }

               --var1;
            }

            var11 = 0;
            if (0 == var1) {
               if (var7 == 1) {
                  throw new IllegalStateException();
               } else {
                  return var11;
               }
            } else if (var1 == 1) {
               var6[0] = -var10[0] / var10[1];
               boolean var10000;
               if (var3) {
                  if (var7 == 1) {
                     throw new IllegalStateException();
                  }

                  if (var2 < var23 + var6[0]) {
                     if (var7 == 1) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }
               } else if (var2 < var6[0] - var23) {
                  if (var7 == 1) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var24 = var10000;
               if (var5) {
                  if (var7 == 1) {
                     throw new IllegalStateException();
                  }

                  if (var4 > var6[0] - var23) {
                     if (var7 == 1) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }
               } else if (var4 > var23 + var6[0]) {
                  if (var7 == 1) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               byte var28;
               label254: {
                  boolean var25 = var10000;
                  if (var24) {
                     if (var7 == 1) {
                        throw new IllegalStateException();
                     }

                     if (var25) {
                        if (var7 == 1) {
                           throw new IllegalStateException();
                        }

                        var28 = 1;
                        break label254;
                     }
                  }

                  var28 = 0;
               }

               byte var26 = var28;
               if (var26 > 0) {
                  if (var7 == 1) {
                     throw new IllegalStateException();
                  }

                  if (var3) {
                     if (var7 == 1) {
                        throw new IllegalStateException();
                     }

                     if (var6[0] < var2) {
                        if (var7 == 1) {
                           throw new IllegalStateException();
                        }

                        var6[0] = var2;
                        return var26;
                     }
                  }

                  if (var5) {
                     if (var7 == 1) {
                        throw new IllegalStateException();
                     }

                     if (var6[0] > var4) {
                        if (var7 == 1) {
                           throw new IllegalStateException();
                        }

                        var6[0] = var4;
                     }
                  }
               }

               return var26;
            } else {
               qo var12 = new qo(var10, var1);
               float[] var13 = new float[var1 + 1];

               for(int var14 = 1; var14 <= var1; ++var14) {
                  if (var7 == 1) {
                     throw new IllegalStateException();
                  }

                  var13[var14 - 1] = (float)var14 * var10[var14];
               }

               float[] var27 = new float[var1 + 1];
               int var15 = ac(var13, var1 - 1, var2, false, var4, false, var27, (byte)-68);
               if (var15 == -1) {
                  if (var7 == 1) {
                     throw new IllegalStateException();
                  } else {
                     return 0;
                  }
               } else {
                  boolean var16 = false;
                  float var18 = 0.0F;
                  float var19 = 0.0F;
                  float var20 = 0.0F;

                  for(int var21 = 0; var21 <= var15; ++var21) {
                     if (var7 == 1) {
                        throw new IllegalStateException();
                     }

                     if (var11 > var1) {
                        if (var7 == 1) {
                           throw new IllegalStateException();
                        }

                        return var11;
                     }

                     float var17;
                     if (0 == var21) {
                        if (var7 == 1) {
                           throw new IllegalStateException();
                        }

                        var17 = var2;
                        var19 = oy.ae(var10, var1, var2, (byte)-75);
                        if (Math.abs(var19) <= var23 && var3) {
                           if (var7 == 1) {
                              throw new IllegalStateException();
                           }

                           var6[var11++] = var2;
                        }
                     } else {
                        var17 = var20;
                        var19 = var18;
                     }

                     if (var21 == var15) {
                        if (var7 == 1) {
                           throw new IllegalStateException();
                        }

                        var20 = var4;
                        var16 = false;
                     } else {
                        var20 = var27[var21];
                     }

                     var18 = oy.ae(var10, var1, var20, (byte)20);
                     if (var16) {
                        if (var7 == 1) {
                           throw new IllegalStateException();
                        }

                        var16 = false;
                     } else if (Math.abs(var18) < var23) {
                        if (var21 == var15) {
                           if (var7 == 1) {
                              throw new IllegalStateException();
                           }

                           if (!var5) {
                              continue;
                           }
                        }

                        var6[var11++] = var20;
                        var16 = true;
                     } else {
                        label320: {
                           if (var19 < 0.0F) {
                              if (var7 == 1) {
                                 throw new IllegalStateException();
                              }

                              if (var18 > 0.0F) {
                                 break label320;
                              }

                              if (var7 == 1) {
                                 throw new IllegalStateException();
                              }
                           }

                           if (!(var19 > 0.0F) || !(var18 < 0.0F)) {
                              continue;
                           }

                           if (var7 == 1) {
                              throw new IllegalStateException();
                           }
                        }

                        var6[var11++] = lp.ag(var12, var17, var20, 0.0F, (byte)54);
                        if (var11 > 1) {
                           if (var7 == 1) {
                              throw new IllegalStateException();
                           }

                           if (var6[var11 - 2] >= var6[var11 - 1] - var23) {
                              if (var7 == 1) {
                                 throw new IllegalStateException();
                              }

                              var6[var11 - 2] = (var6[var11 - 2] + var6[var11 - 1]) * 0.5F;
                              --var11;
                           }
                        }
                     }
                  }

                  return var11;
               }
            }
         }
      } catch (RuntimeException var22) {
         throw vk.ae(var22, "of.ac(" + ')');
      }
   }
}
