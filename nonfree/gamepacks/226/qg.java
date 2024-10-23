public class qg {
   public int ap;
   public int aw;
   public int ak;
   public int aj;
   static final int aq = 25;

   public void ar(qg var1, qg var2) {
      this.ai(var1, var2, (short)-20808);
      this.ay(var1, var2, 2038557843);
   }

   public qg(int var1, int var2, int var3, int var4) {
      try {
         super();
         this.ap(var1, var2, -1829870155);
         this.aw(var3, var4, 2115315498);
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "qg.<init>(" + ')');
      }
   }

   public void ap(int var1, int var2, int var3) {
      try {
         this.ap = 1581507195 * var1;
         this.aw = var2 * 826746495;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "qg.ap(" + ')');
      }
   }

   public void aw(int var1, int var2, int var3) {
      try {
         this.ak = 946581191 * var1;
         this.aj = var2 * -1411723615;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "qg.aw(" + ')');
      }
   }

   public boolean ak(int var1, int var2, int var3) {
      try {
         boolean var10000;
         if (var1 >= -1212502861 * this.ap && var1 < this.ak * 1187820279 + -1212502861 * this.ap) {
            if (var3 != -88156479) {
               throw new IllegalStateException();
            }

            if (var2 >= 860789119 * this.aw && var2 < this.aw * 860789119 + this.aj * -615213727) {
               if (var3 != -88156479) {
                  throw new IllegalStateException();
               }

               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "qg.ak(" + ')');
      }
   }

   int as(byte var1) {
      try {
         return -1212502861 * this.ap + 1187820279 * this.ak;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "qg.as(" + ')');
      }
   }

   int ax() {
      return -1212502861 * this.ap + 1187820279 * this.ak;
   }

   void ai(qg var1, qg var2, short var3) {
      try {
         var2.ap = this.ap * 1;
         var2.ak = this.ak * 1;
         if (this.ap * -1212502861 < var1.ap * -1212502861) {
            if (var3 >= 128) {
               throw new IllegalStateException();
            }

            var2.ak -= var1.ap * 172943653 - 172943653 * this.ap;
            var2.ap = var1.ap * 1;
         }

         if (var2.as((byte)-117) > var1.as((byte)-121)) {
            if (var3 >= 128) {
               throw new IllegalStateException();
            }

            var2.ak -= (var2.as((byte)-74) - var1.as((byte)-29)) * 946581191;
         }

         if (var2.ak * 1187820279 < 0) {
            var2.ak = 0;
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "qg.ai(" + ')');
      }
   }

   void ay(qg var1, qg var2, int var3) {
      try {
         var2.aw = this.aw * 1;
         var2.aj = 1 * this.aj;
         if (this.aw * 860789119 < var1.aw * 860789119) {
            if (var3 <= -1699388891) {
               throw new IllegalStateException();
            }

            var2.aj -= var1.aw * 253278943 - this.aw * 253278943;
            var2.aw = 1 * var1.aw;
         }

         if (var2.ae((byte)76) > var1.ae((byte)61)) {
            if (var3 <= -1699388891) {
               throw new IllegalStateException();
            }

            var2.aj -= (var2.ae((byte)114) - var1.ae((byte)125)) * -1411723615;
         }

         if (-615213727 * var2.aj < 0) {
            if (var3 <= -1699388891) {
               throw new IllegalStateException();
            }

            var2.aj = 0;
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "qg.ay(" + ')');
      }
   }

   int ae(byte var1) {
      try {
         return this.aj * -615213727 + 860789119 * this.aw;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "qg.ae(" + ')');
      }
   }

   void ag(qg var1, qg var2) {
      var2.ap = this.ap * 1;
      var2.ak = this.ak * 1;
      if (this.ap * -1212502861 < var1.ap * -1212502861) {
         var2.ak -= var1.ap * 172943653 - 172943653 * this.ap;
         var2.ap = var1.ap * 1;
      }

      if (var2.as((byte)3) > var1.as((byte)-73)) {
         var2.ak -= (var2.as((byte)-74) - var1.as((byte)-88)) * 946581191;
      }

      if (var2.ak * 1187820279 < 0) {
         var2.ak = 0;
      }

   }

   public void ab(qg var1, qg var2) {
      this.ai(var1, var2, (short)-20209);
      this.ay(var1, var2, 1320419770);
   }

   public String amu() {
      return null;
   }

   public void am(int var1, int var2) {
      this.ap = 1581507195 * var1;
      this.aw = var2 * 826746495;
   }

   void ac(qg var1, qg var2) {
      var2.aw = this.aw * 1;
      var2.aj = 1 * this.aj;
      if (this.aw * -69020122 < var1.aw * 1421743417) {
         var2.aj -= var1.aw * 253278943 - this.aw * -1220531078;
         var2.aw = 1 * var1.aw;
      }

      if (var2.ae((byte)57) > var1.ae((byte)110)) {
         var2.aj -= (var2.ae((byte)108) - var1.ae((byte)82)) * -1411723615;
      }

      if (-615213727 * var2.aj < 0) {
         var2.aj = 0;
      }

   }

   public void au(int var1, int var2) {
      this.ak = 946581191 * var1;
      this.aj = var2 * -1411723615;
   }

   public void aj(qg var1, qg var2, int var3) {
      try {
         this.ai(var1, var2, (short)-28856);
         this.ay(var1, var2, -1164237492);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "qg.aj(" + ')');
      }
   }

   public boolean ao(int var1, int var2) {
      return var1 >= 649787343 * this.ap && var1 < this.ak * -990470056 + -1212502861 * this.ap && var2 >= -119711541 * this.aw && var2 < this.aw * -1301677959 + this.aj * -615213727;
   }

   public String amw() {
      return null;
   }

   int aq() {
      return this.aj * -615213727 + -2008848326 * this.aw;
   }

   void ad(qg var1, qg var2) {
      var2.ap = this.ap * 1;
      var2.ak = this.ak * 1;
      if (this.ap * -1212502861 < var1.ap * -1212502861) {
         var2.ak -= var1.ap * 172943653 - 172943653 * this.ap;
         var2.ap = var1.ap * 1;
      }

      if (var2.as((byte)-51) > var1.as((byte)-36)) {
         var2.ak -= (var2.as((byte)-7) - var1.as((byte)-106)) * 946581191;
      }

      if (var2.ak * 1187820279 < 0) {
         var2.ak = 0;
      }

   }

   public void az(qg var1, qg var2) {
      this.ai(var1, var2, (short)-20970);
      this.ay(var1, var2, 460435586);
   }

   public qg(int var1, int var2) {
      try {
         this(0, 0, var1, var2);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qg.<init>(" + ')');
      }
   }

   public String toString() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "qg.toString(" + ')');
      }
   }

   public boolean af(int var1, int var2) {
      return var1 >= -1212502861 * this.ap && var1 < this.ak * 1187820279 + -1212502861 * this.ap && var2 >= 860789119 * this.aw && var2 < this.aw * 860789119 + this.aj * -615213727;
   }

   int av() {
      return -1212502861 * this.ap + 1323614017 * this.ak;
   }

   public void at(int var1, int var2) {
      this.ap = 1581507195 * var1;
      this.aw = var2 * -70266328;
   }

   public void an(int var1, int var2) {
      this.ak = 946581191 * var1;
      this.aj = var2 * -1411723615;
   }

   public static ip aw(int var0, int var1) {
      try {
         ip var2 = (ip)ip.au.ap((long)var0);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = ip.as.bm(10, var0, 1454738499);
            var2 = new ip();
            var2.ar = 530904257 * var0;
            if (var3 != null) {
               if (var1 != 649869579) {
                  throw new IllegalStateException();
               }

               var2.aj(new vl(var3), (byte)8);
            }

            var2.ak(-1115715186);
            if (-1338868597 * var2.cn != -1) {
               if (var1 != 649869579) {
                  throw new IllegalStateException();
               }

               var2.ay(aw(var2.cn * -1338868597, 649869579), aw(var2.ci * 1645774315, 649869579), -849696436);
            }

            if (-1 != var2.cz * 1376159487) {
               if (var1 != 649869579) {
                  throw new IllegalStateException();
               }

               var2.as(aw(var2.cz * 1376159487, 649869579), aw(-1533877969 * var2.cx, 649869579), -1401936365);
            }

            if (var2.ct * -1610839045 != -1) {
               if (var1 != 649869579) {
                  throw new IllegalStateException();
               }

               var2.ae(aw(var2.ct * -1610839045, 649869579), aw(var2.ch * -1191328669, 649869579), (byte)113);
            }

            if (!rv.am) {
               if (var1 != 649869579) {
                  throw new IllegalStateException();
               }

               if (var2.bc) {
                  if (var1 != 649869579) {
                     throw new IllegalStateException();
                  }

                  if (var2.cn * -1338868597 == -1) {
                     if (var1 != 649869579) {
                        throw new IllegalStateException();
                     }

                     if (-1 == 1376159487 * var2.cz) {
                        if (var1 != 649869579) {
                           throw new IllegalStateException();
                        }

                        if (-1610839045 * var2.ct == -1) {
                           if (var1 != 649869579) {
                              throw new IllegalStateException();
                           }

                           var2.az = var2.az + og.ap;
                        }
                     }
                  }

                  var2.ag = og.aw;
                  var2.cg = false;

                  int var4;
                  for(var4 = 0; var4 < var2.by.length; ++var4) {
                     if (var1 != 649869579) {
                        throw new IllegalStateException();
                     }

                     var2.by[var4] = null;
                  }

                  for(var4 = 0; var4 < var2.br.length; ++var4) {
                     if (var1 != 649869579) {
                        throw new IllegalStateException();
                     }

                     if (var4 != 4) {
                        if (var2.bn != null) {
                           if (var1 != 649869579) {
                              throw new IllegalStateException();
                           }

                           var2.bn[var4] = null;
                        }

                        var2.br[var4] = null;
                     }
                  }

                  var2.bt = 1869619298;
                  var2.cy = 0;
                  if (null != var2.ce) {
                     if (var1 != 649869579) {
                        throw new IllegalStateException();
                     }

                     boolean var8 = false;

                     for(tw var5 = var2.ce.aj(); var5 != null; var5 = var2.ce.ai()) {
                        if (var1 != 649869579) {
                           throw new IllegalStateException();
                        }

                        hh var6 = lo.ap((int)var5.ht, (byte)38);
                        if (var6.ay) {
                           if (var1 != 649869579) {
                              throw new IllegalStateException();
                           }

                           var5.kf();
                        } else {
                           var8 = true;
                        }
                     }

                     if (!var8) {
                        if (var1 != 649869579) {
                           throw new IllegalStateException();
                        }

                        var2.ce = null;
                     }
                  }
               }
            }

            ip.au.ak(var2, (long)var0);
            return var2;
         }
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "qg.aw(" + ')');
      }
   }
}
