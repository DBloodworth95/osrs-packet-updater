public class hj extends tp {
   int ai;
   int ao;
   public static mi ak = new mi(64);
   public static mi aj = new mi(30);
   static final int ag = 18;
   int ay;
   public int as;
   short[] ae;
   short[] am;
   public static final int aq = 21;
   short[] at;
   int an;
   short[] au;
   int af;
   int ar;
   int ab;
   public static pe ap;
   public static pe aw;

   void ak(vl var1, int var2, int var3) {
      try {
         if (var2 == 1) {
            if (var3 == 562853029) {
               return;
            }

            this.ay = var1.ce(1728054053) * -1820462083;
         } else if (2 == var2) {
            this.as = var1.ce(705868160) * 1853839067;
         } else if (4 == var2) {
            this.an = var1.ce(1028571984) * 1149056751;
         } else if (5 == var2) {
            if (var3 == 562853029) {
               throw new IllegalStateException();
            }

            this.ao = var1.ce(1552558408) * -947588521;
         } else if (var2 == 6) {
            if (var3 == 562853029) {
               throw new IllegalStateException();
            }

            this.af = var1.ce(1018355483) * 299150947;
         } else if (var2 == 7) {
            if (var3 == 562853029) {
               throw new IllegalStateException();
            }

            this.ar = var1.cy((short)-14268) * 143257609;
         } else if (8 == var2) {
            if (var3 == 562853029) {
               throw new IllegalStateException();
            }

            this.ab = var1.cy((short)-29435) * 1592669447;
         } else {
            int var4;
            int var5;
            if (var2 == 40) {
               var4 = var1.cy((short)-21824);
               this.ae = new short[var4];
               this.am = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 == 562853029) {
                     return;
                  }

                  this.ae[var5] = (short)var1.ce(986958992);
                  this.am[var5] = (short)var1.ce(2121702374);
               }
            } else if (var2 == 41) {
               if (var3 == 562853029) {
                  return;
               }

               var4 = var1.cy((short)-27624);
               this.at = new short[var4];
               this.au = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 == 562853029) {
                     throw new IllegalStateException();
                  }

                  this.at[var5] = (short)var1.ce(1901656866);
                  this.au[var5] = (short)var1.ce(1244331633);
               }
            }
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "hj.ak(" + ')');
      }
   }

   void aw(vl var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cy((short)-5692);
            if (var3 == 0) {
               if (var2 == 708404729) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.ak(var1, var3, -620810195);
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "hj.aw(" + ')');
      }
   }

   public final jy ar(int var1) {
      jy var2 = this.ai((byte)1);
      if (null == var2) {
         return null;
      } else {
         jy var3;
         if (-347425453 * this.as != -1 && -1 != var1) {
            var3 = ng.ap(this.as * -449098916, (short)-7350).as(var2, var1, (byte)-74);
         } else {
            var3 = var2.ay(true);
         }

         if (128 != -441272305 * this.an || 128 != 1871393537 * this.ao) {
            var3.bv(this.an * -1457546702, -1944876718 * this.ao, 897381211 * this.an);
         }

         if (-1809196283 * this.af != 0) {
            if (-768000321 == this.af * -378948700) {
               var3.al();
            }

            if (594888510 == -1888275526 * this.af) {
               var3.al();
               var3.al();
            }

            if (270 == -1587629104 * this.af) {
               var3.al();
               var3.al();
               var3.al();
            }
         }

         return var3;
      }
   }

   void ae(vl var1) {
      while(true) {
         int var2 = var1.cy((short)-15282);
         if (var2 == 0) {
            return;
         }

         this.ak(var1, var2, -1383562594);
      }
   }

   public final jy ai(byte var1) {
      try {
         jy var2 = (jy)aj.ap((long)(this.ai * 1082979423));
         if (var2 == null) {
            if (var1 != 1) {
               throw new IllegalStateException();
            }

            jj var3 = jj.ap(aw, this.ay * -901643947, 0);
            if (var3 == null) {
               if (var1 != 1) {
                  throw new IllegalStateException();
               }

               return null;
            }

            int var4;
            if (null != this.ae) {
               if (var1 != 1) {
                  throw new IllegalStateException();
               }

               for(var4 = 0; var4 < this.ae.length; ++var4) {
                  if (var1 != 1) {
                     throw new IllegalStateException();
                  }

                  var3.ac(this.ae[var4], this.am[var4]);
               }
            }

            if (null != this.at) {
               if (var1 != 1) {
                  throw new IllegalStateException();
               }

               for(var4 = 0; var4 < this.at.length; ++var4) {
                  if (var1 != 1) {
                     throw new IllegalStateException();
                  }

                  var3.av(this.at[var4], this.au[var4]);
               }
            }

            var2 = var3.bj(this.ar * 1057267257 + 64, -1537660745 * this.ab + 850, -30, -50, -30);
            aj.ak(var2, (long)(1082979423 * this.ai));
         }

         return var2;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "hj.ai(" + ')');
      }
   }

   public static hj ay(int var0) {
      hj var1 = (hj)ak.ap((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = ap.bm(13, var0, 1767348056);
         var1 = new hj();
         var1.ai = var0 * -786536545;
         if (var2 != null) {
            var1.aw(new vl(var2), -702225841);
         }

         ak.ak(var1, (long)var0);
         return var1;
      }
   }

   void as(vl var1) {
      while(true) {
         int var2 = var1.cy((short)-27814);
         if (var2 == 0) {
            return;
         }

         this.ak(var1, var2, 985136897);
      }
   }

   public final jy az(int var1) {
      jy var2 = this.ai((byte)1);
      if (null == var2) {
         return null;
      } else {
         jy var3;
         if (-347425453 * this.as != -1 && -1 != var1) {
            var3 = ng.ap(this.as * 1606050741, (short)-8234).as(var2, var1, (byte)31);
         } else {
            var3 = var2.ay(true);
         }

         if (128 != -441272305 * this.an || -1142994487 != 1449567322 * this.ao) {
            var3.bv(this.an * -441272305, 2045253991 * this.ao, -441272305 * this.an);
         }

         if (148256114 * this.af != 0) {
            if (-1510110139 == this.af * -948850283) {
               var3.al();
            }

            if (180 == -1313755259 * this.af) {
               var3.al();
               var3.al();
            }

            if (270 == 1835059129 * this.af) {
               var3.al();
               var3.al();
               var3.al();
            }
         }

         return var3;
      }
   }

   void am(vl var1) {
      while(true) {
         int var2 = var1.cy((short)-1931);
         if (var2 == 0) {
            return;
         }

         this.ak(var1, var2, 356531586);
      }
   }

   void at(vl var1) {
      while(true) {
         int var2 = var1.cy((short)-13995);
         if (var2 == 0) {
            return;
         }

         this.ak(var1, var2, 495670544);
      }
   }

   void au(vl var1) {
      while(true) {
         int var2 = var1.cy((short)-5585);
         if (var2 == 0) {
            return;
         }

         this.ak(var1, var2, -5251709);
      }
   }

   void an(vl var1, int var2) {
      if (var2 == 1) {
         this.ay = var1.ce(466684190) * -1820462083;
      } else if (2 == var2) {
         this.as = var1.ce(1582879068) * 1853839067;
      } else if (4 == var2) {
         this.an = var1.ce(1637099627) * 1149056751;
      } else if (5 == var2) {
         this.ao = var1.ce(1475926848) * -947588521;
      } else if (var2 == 6) {
         this.af = var1.ce(1227525372) * 299150947;
      } else if (var2 == 7) {
         this.ar = var1.cy((short)-26620) * 143257609;
      } else if (8 == var2) {
         this.ab = var1.cy((short)-30515) * 1592669447;
      } else {
         int var3;
         int var4;
         if (var2 == 40) {
            var3 = var1.cy((short)-11781);
            this.ae = new short[var3];
            this.am = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.ae[var4] = (short)var1.ce(501604025);
               this.am[var4] = (short)var1.ce(167924832);
            }
         } else if (var2 == 41) {
            var3 = var1.cy((short)-9413);
            this.at = new short[var3];
            this.au = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.at[var4] = (short)var1.ce(1062575083);
               this.au[var4] = (short)var1.ce(1571663094);
            }
         }
      }

   }

   void ao(vl var1, int var2) {
      if (var2 == 1) {
         this.ay = var1.ce(819965694) * -1820462083;
      } else if (2 == var2) {
         this.as = var1.ce(1586374985) * 1853839067;
      } else if (4 == var2) {
         this.an = var1.ce(1952975759) * 1149056751;
      } else if (5 == var2) {
         this.ao = var1.ce(2068764955) * -947588521;
      } else if (var2 == 6) {
         this.af = var1.ce(690772788) * 299150947;
      } else if (var2 == 7) {
         this.ar = var1.cy((short)-31162) * 143257609;
      } else if (8 == var2) {
         this.ab = var1.cy((short)-10829) * 1592669447;
      } else {
         int var3;
         int var4;
         if (var2 == 40) {
            var3 = var1.cy((short)-25667);
            this.ae = new short[var3];
            this.am = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.ae[var4] = (short)var1.ce(297067175);
               this.am[var4] = (short)var1.ce(126176393);
            }
         } else if (var2 == 41) {
            var3 = var1.cy((short)-21490);
            this.at = new short[var3];
            this.au = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.at[var4] = (short)var1.ce(778403047);
               this.au[var4] = (short)var1.ce(1739793419);
            }
         }
      }

   }

   void af(vl var1, int var2) {
      if (var2 == 1) {
         this.ay = var1.ce(1398886217) * -1820462083;
      } else if (2 == var2) {
         this.as = var1.ce(2104862896) * 1853839067;
      } else if (4 == var2) {
         this.an = var1.ce(104788865) * 1149056751;
      } else if (5 == var2) {
         this.ao = var1.ce(1060252972) * -947588521;
      } else if (var2 == 6) {
         this.af = var1.ce(1320839670) * 299150947;
      } else if (var2 == 7) {
         this.ar = var1.cy((short)-23942) * 143257609;
      } else if (8 == var2) {
         this.ab = var1.cy((short)-7586) * 1592669447;
      } else {
         int var3;
         int var4;
         if (var2 == 40) {
            var3 = var1.cy((short)-3185);
            this.ae = new short[var3];
            this.am = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.ae[var4] = (short)var1.ce(1820929220);
               this.am[var4] = (short)var1.ce(1951251919);
            }
         } else if (var2 == 41) {
            var3 = var1.cy((short)-25476);
            this.at = new short[var3];
            this.au = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.at[var4] = (short)var1.ce(2097545822);
               this.au[var4] = (short)var1.ce(785990966);
            }
         }
      }

   }

   public final jy aj(int var1, int var2) {
      try {
         jy var3 = this.ai((byte)1);
         if (null == var3) {
            if (var2 <= -965919800) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            jy var4;
            if (-347425453 * this.as != -1 && -1 != var1) {
               var4 = ng.ap(this.as * -347425453, (short)-12551).as(var3, var1, (byte)59);
            } else {
               var4 = var3.ay(true);
            }

            label68: {
               if (128 == -441272305 * this.an) {
                  if (var2 <= -965919800) {
                     throw new IllegalStateException();
                  }

                  if (128 == 2045253991 * this.ao) {
                     break label68;
                  }

                  if (var2 <= -965919800) {
                     throw new IllegalStateException();
                  }
               }

               var4.bv(this.an * -441272305, 2045253991 * this.ao, -441272305 * this.an);
            }

            if (-372292789 * this.af != 0) {
               if (var2 <= -965919800) {
                  throw new IllegalStateException();
               }

               if (90 == this.af * -372292789) {
                  if (var2 <= -965919800) {
                     throw new IllegalStateException();
                  }

                  var4.al();
               }

               if (180 == -372292789 * this.af) {
                  if (var2 <= -965919800) {
                     throw new IllegalStateException();
                  }

                  var4.al();
                  var4.al();
               }

               if (270 == -372292789 * this.af) {
                  if (var2 <= -965919800) {
                     throw new IllegalStateException();
                  }

                  var4.al();
                  var4.al();
                  var4.al();
               }
            }

            return var4;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "hj.aj(" + ')');
      }
   }

   public final jy ab(int var1) {
      jy var2 = this.ai((byte)1);
      if (null == var2) {
         return null;
      } else {
         jy var3;
         if (-1316601967 * this.as != -1 && -1 != var1) {
            var3 = ng.ap(this.as * 230580722, (short)-32431).as(var2, var1, (byte)-53);
         } else {
            var3 = var2.ay(true);
         }

         if (1246070905 != 2064442992 * this.an || 118061856 != 1651256118 * this.ao) {
            var3.bv(this.an * -441272305, -537969307 * this.ao, -441272305 * this.an);
         }

         if (-1517283574 * this.af != 0) {
            if (-196219347 == this.af * -372292789) {
               var3.al();
            }

            if (180 == -777354407 * this.af) {
               var3.al();
               var3.al();
            }

            if (270 == -372292789 * this.af) {
               var3.al();
               var3.al();
               var3.al();
            }
         }

         return var3;
      }
   }

   public final jy ag() {
      jy var1 = (jy)aj.ap((long)(this.ai * 1082979423));
      if (var1 == null) {
         jj var2 = jj.ap(aw, this.ay * -901643947, 0);
         if (var2 == null) {
            return null;
         }

         int var3;
         if (null != this.ae) {
            for(var3 = 0; var3 < this.ae.length; ++var3) {
               var2.ac(this.ae[var3], this.am[var3]);
            }
         }

         if (null != this.at) {
            for(var3 = 0; var3 < this.at.length; ++var3) {
               var2.av(this.at[var3], this.au[var3]);
            }
         }

         var1 = var2.bj(this.ar * 1057267257 + 64, -1537660745 * this.ab + 850, -30, -50, -30);
         aj.ak(var1, (long)(1082979423 * this.ai));
      }

      return var1;
   }

   public final jy ac() {
      jy var1 = (jy)aj.ap((long)(this.ai * -932524576));
      if (var1 == null) {
         jj var2 = jj.ap(aw, this.ay * -959120172, 0);
         if (var2 == null) {
            return null;
         }

         int var3;
         if (null != this.ae) {
            for(var3 = 0; var3 < this.ae.length; ++var3) {
               var2.ac(this.ae[var3], this.am[var3]);
            }
         }

         if (null != this.at) {
            for(var3 = 0; var3 < this.at.length; ++var3) {
               var2.av(this.at[var3], this.au[var3]);
            }
         }

         var1 = var2.bj(this.ar * 1057267257 + 64, -1537660745 * this.ab + -154387666, -1783182677, -50, -30);
         aj.ak(var1, (long)(1082979423 * this.ai));
      }

      return var1;
   }

   public final jy ad() {
      jy var1 = (jy)aj.ap((long)(this.ai * 1082979423));
      if (var1 == null) {
         jj var2 = jj.ap(aw, this.ay * -901643947, 0);
         if (var2 == null) {
            return null;
         }

         int var3;
         if (null != this.ae) {
            for(var3 = 0; var3 < this.ae.length; ++var3) {
               var2.ac(this.ae[var3], this.am[var3]);
            }
         }

         if (null != this.at) {
            for(var3 = 0; var3 < this.at.length; ++var3) {
               var2.av(this.at[var3], this.au[var3]);
            }
         }

         var1 = var2.bj(this.ar * -1245105644 + 64, -1537660745 * this.ab + 850, 841789577, 1128860296, -30);
         aj.ak(var1, (long)(-1658653446 * this.ai));
      }

      return var1;
   }

   hj() {
      try {
         super();
         this.as = -1853839067;
         this.an = 1050376064;
         this.ao = -1032246400;
         this.af = 0;
         this.ar = 0;
         this.ab = 0;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "hj.<init>(" + ')');
      }
   }

   public static boolean an(char var0, int var1) {
      try {
         boolean var10000;
         if (var0 >= '0' && var0 <= '9') {
            if (var1 >= 614930171) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "hj.an(" + ')');
      }
   }
}
