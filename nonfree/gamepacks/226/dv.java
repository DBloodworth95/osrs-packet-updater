import java.io.File;
import java.io.RandomAccessFile;

public final class dv extends dw {
   int at;
   ne aw;
   int ak;
   int ae;
   int ao;
   String[] ay;
   wx ap;
   boolean aq;
   jy ab;
   int ac;
   int au;
   dn bv;
   int af;
   int al;
   static final int ai = 3;
   int az;
   int ag;
   int ad;
   int ar;
   boolean av;
   int ax;
   sg bh;
   int aj;
   static final int ej = 23;
   sg ah;
   int am;
   sg bj;
   int aa;
   final int bx;
   int as;

   final void cu(int var1, int var2, kk var3) {
      if (this.de * 1832573076 < 9) {
         this.de += 1710537150;
      }

      for(int var4 = -1746074449 * this.de; var4 > 0; --var4) {
         this.dz[var4] = this.dz[var4 - 1];
         this.di[var4] = this.di[var4 - 1];
         this.dn[var4] = this.dn[var4 - 1];
      }

      this.dz[0] = var1;
      this.di[0] = var2;
      this.dn[0] = var3;
   }

   final void af(vl var1, short var2) {
      try {
         var1.am = 0;
         byte var3 = var1.cu((byte)13);
         boolean var4 = true;
         this.ak = var1.cu((byte)13) * -2061616799;
         this.aj = var1.cu((byte)13) * -2025537043;
         int var5 = -1;
         this.ax = 0;
         int[] var6 = new int[12];

         int var8;
         int var9;
         int var10;
         for(int var7 = 0; var7 < var6.length; ++var7) {
            if (var2 >= 2047) {
               throw new IllegalStateException();
            }

            var8 = var1.cy((short)-18141);
            if (var8 == 0) {
               if (var2 >= 2047) {
                  throw new IllegalStateException();
               }

               var6[var7] = 0;
            } else {
               var9 = var1.cy((short)-29452);
               var6[var7] = var9 + (var8 << 8);
               if (0 == var7) {
                  if (var2 >= 2047) {
                     return;
                  }

                  if (var6[0] == 65535) {
                     var5 = var1.ce(735112545);
                     break;
                  }
               }

               if (this.bv(var6[var7], (short)21286)) {
                  if (var2 >= 2047) {
                     return;
                  }

                  var10 = this.bx(var6[var7], (byte)-12).cy * 1995955561;
                  if (var10 != 0) {
                     if (var2 >= 2047) {
                        return;
                     }

                     this.ax = -1481608475 * var10;
                  }
               }
            }
         }

         int[] var31 = new int[12];

         for(var8 = 0; var8 < var31.length; ++var8) {
            if (var2 >= 2047) {
               return;
            }

            var9 = var1.cy((short)-28468);
            if (var9 == 0) {
               if (var2 >= 2047) {
                  throw new IllegalStateException();
               }

               var31[var8] = 0;
            } else {
               var10 = var1.cy((short)-20086);
               var31[var8] = var10 + (var9 << 8);
            }
         }

         int[] var32 = new int[5];

         for(var9 = 0; var9 < var32.length; ++var9) {
            if (var2 >= 2047) {
               return;
            }

            label404: {
               var10 = var1.cy((short)-12469);
               if (var10 >= 0) {
                  if (var2 >= 2047) {
                     return;
                  }

                  if (var10 < ht.an[var9].length) {
                     break label404;
                  }

                  if (var2 >= 2047) {
                     throw new IllegalStateException();
                  }
               }

               var10 = 0;
            }

            var32[var9] = var10;
         }

         this.bc = var1.ce(1290980891) * 879580379;
         if (65535 == 1825212243 * this.bc) {
            if (var2 >= 2047) {
               return;
            }

            this.bc = -879580379;
         }

         this.by = var1.ce(657828981) * -1379807281;
         if (-488843473 * this.by == 65535) {
            if (var2 >= 2047) {
               throw new IllegalStateException();
            }

            this.by = 1379807281;
         }

         this.br = this.by * 1147683435;
         this.bn = var1.ce(1994376835) * 2018035535;
         if (65535 == this.bn * 230944687) {
            if (var2 >= 2047) {
               return;
            }

            this.bn = -2018035535;
         }

         this.bu = var1.ce(1896650354) * -1858507535;
         if (this.bu * -1120140271 == 65535) {
            if (var2 >= 2047) {
               throw new IllegalStateException();
            }

            this.bu = 1858507535;
         }

         this.bt = var1.ce(10623857) * -295220955;
         if (this.bt * 1607314093 == 65535) {
            if (var2 >= 2047) {
               throw new IllegalStateException();
            }

            this.bt = 295220955;
         }

         this.bs = var1.ce(1357649850) * 85069143;
         if (this.bs * 1711353447 == 65535) {
            this.bs = -85069143;
         }

         this.bm = var1.ce(1195031031) * 37310571;
         if (65535 == -424879037 * this.bm) {
            if (var2 >= 2047) {
               throw new IllegalStateException();
            }

            this.bm = -37310571;
         }

         this.ap = new wx(var1.cw(1955177257), ll.co);
         this.ab(-1136478946);
         this.ad((byte)-122);
         this.ax(974408712);
         if (this == nw.mc) {
            if (var2 >= 2047) {
               throw new IllegalStateException();
            }

            mh.aw = this.ap.ap(579611021);
         }

         this.as = var1.cy((short)-18651) * -1624628687;
         this.ae = var1.ce(2110362341) * 1082264187;
         boolean var10001;
         if (var1.cy((short)-4576) == 1) {
            if (var2 >= 2047) {
               return;
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.aq = var10001;
         if (0 == client.ci * -959285439) {
            if (var2 >= 2047) {
               throw new IllegalStateException();
            }

            if (client.pw * 1797447449 >= 2) {
               if (var2 >= 2047) {
                  throw new IllegalStateException();
               }

               this.aq = false;
            }
         }

         gz[] var33 = null;
         boolean var34 = false;
         int var11 = var1.ce(567873779);
         boolean var10000;
         if (1 == (var11 >> 15 & 1)) {
            if (var2 >= 2047) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         var34 = var10000;
         int var12;
         if (var11 > 0) {
            if (var2 >= 2047) {
               return;
            }

            if (var11 != 32768) {
               if (var2 >= 2047) {
                  return;
               }

               var33 = new gz[12];

               for(var12 = 0; var12 < var33.length; ++var12) {
                  if (var2 >= 2047) {
                     throw new IllegalStateException();
                  }

                  int var13 = var11 >> 12 - var12 & 1;
                  if (1 == var13) {
                     if (var2 >= 2047) {
                        throw new IllegalStateException();
                     }

                     int var17 = var6[var12] - this.bx * -887329531;
                     int var18 = var1.cy((short)-18387);
                     boolean var19 = 0 != (var18 & 1);
                     if (0 != (var18 & 2)) {
                        if (var2 >= 2047) {
                           throw new IllegalStateException();
                        }

                        var10000 = true;
                     } else {
                        var10000 = false;
                     }

                     boolean var20 = var10000;
                     boolean var21 = 0 != (var18 & 4);
                     if (0 != (var18 & 8)) {
                        if (var2 >= 2047) {
                           throw new IllegalStateException();
                        }

                        var10000 = true;
                     } else {
                        var10000 = false;
                     }

                     boolean var22 = var10000;
                     gz var23 = new gz(var17);
                     int var24;
                     int[] var25;
                     boolean var26;
                     int var27;
                     short var28;
                     if (var19) {
                        if (var2 >= 2047) {
                           throw new IllegalStateException();
                        }

                        label368: {
                           var24 = var1.cy((short)-23155);
                           var25 = new int[]{var24 & 15, var24 >> 4 & 15};
                           if (var23.ai != null) {
                              if (var2 >= 2047) {
                                 throw new IllegalStateException();
                              }

                              if (var25.length == var23.ai.length) {
                                 var10000 = true;
                                 break label368;
                              }
                           }

                           var10000 = false;
                        }

                        var26 = var10000;

                        for(var27 = 0; var27 < 2; ++var27) {
                           if (var2 >= 2047) {
                              throw new IllegalStateException();
                           }

                           if (var25[var27] != 15) {
                              if (var2 >= 2047) {
                                 return;
                              }

                              var28 = (short)var1.ce(414430247);
                              if (var26) {
                                 if (var2 >= 2047) {
                                    throw new IllegalStateException();
                                 }

                                 var23.ai[var25[var27]] = var28;
                              }
                           }
                        }
                     }

                     if (var20) {
                        label353: {
                           var24 = var1.cy((short)-22233);
                           var25 = new int[]{var24 & 15, var24 >> 4 & 15};
                           if (var23.ay != null) {
                              if (var2 >= 2047) {
                                 return;
                              }

                              if (var25.length == var23.ay.length) {
                                 var10000 = true;
                                 break label353;
                              }
                           }

                           var10000 = false;
                        }

                        var26 = var10000;

                        for(var27 = 0; var27 < 2; ++var27) {
                           if (15 != var25[var27]) {
                              if (var2 >= 2047) {
                                 throw new IllegalStateException();
                              }

                              var28 = (short)var1.ce(904457580);
                              if (var26) {
                                 if (var2 >= 2047) {
                                    throw new IllegalStateException();
                                 }

                                 var23.ay[var25[var27]] = var28;
                              }
                           }
                        }
                     }

                     if (var21) {
                        if (var2 >= 2047) {
                           return;
                        }

                        var23.as = var1.ce(816718529) * 1512320823;
                        var23.ae = var1.ce(1509689570) * 1385907173;
                     }

                     if (var22) {
                        if (var2 >= 2047) {
                           throw new IllegalStateException();
                        }

                        var23.am = var1.ce(48042525) * -597114803;
                        var23.at = var1.ce(1045508988) * -1296343471;
                     }

                     var33[var12] = var23;
                  }
               }
            }
         }

         for(var12 = 0; var12 < 3; ++var12) {
            this.ay[var12] = var1.cw(1894297430);
         }

         byte var30 = var1.cu((byte)13);
         if (this.aw == null) {
            if (var2 >= 2047) {
               throw new IllegalStateException();
            }

            this.aw = new ne();
         }

         this.aw.ap(var31, var6, var33, var34, var32, var3, var5, var30, 873908372);
      } catch (RuntimeException var29) {
         throw tm.aw(var29, "dv.af(" + ')');
      }
   }

   boolean ar(short var1) {
      try {
         if (sg.ap == this.ah) {
            if (var1 >= 7975) {
               throw new IllegalStateException();
            }

            this.az((byte)111);
         }

         boolean var10000;
         if (this.ah == sg.aw) {
            if (var1 >= 7975) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dv.ar(" + ')');
      }
   }

   void ab(int var1) {
      try {
         this.ah = sg.ap;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dv.ab(" + ')');
      }
   }

   void az(byte var1) {
      try {
         sg var10001;
         if (dk.vt.ax(this.ap, 245279052)) {
            if (var1 <= 2) {
               throw new IllegalStateException();
            }

            var10001 = sg.aw;
         } else {
            var10001 = sg.ak;
         }

         this.ah = var10001;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dv.az(" + ')');
      }
   }

   boolean ag(int var1) {
      try {
         if (sg.ap == this.bh) {
            if (var1 <= 1872360375) {
               throw new IllegalStateException();
            }

            this.ac(-1575103421);
         }

         return this.bh == sg.aw;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dv.ag(" + ')');
      }
   }

   void ad(byte var1) {
      try {
         this.bh = sg.ap;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dv.ad(" + ')');
      }
   }

   void ac(int var1) {
      try {
         sg var10001;
         label24: {
            if (null != do.sb) {
               if (var1 == 1944174912) {
                  throw new IllegalStateException();
               }

               if (do.sb.bp(this.ap, -1910430321)) {
                  if (var1 == 1944174912) {
                     throw new IllegalStateException();
                  }

                  var10001 = sg.aw;
                  break label24;
               }
            }

            var10001 = sg.ak;
         }

         this.bh = var10001;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dv.ac(" + ')');
      }
   }

   void av(int var1) {
      try {
         for(int var2 = 0; var2 < 4; ++var2) {
            if (var1 >= -626398704) {
               throw new IllegalStateException();
            }

            if (null != client.sc[var2] && client.sc[var2].ak((String)this.ap.ap(-1945481241), (byte)11) != -1 && 2 != var2) {
               if (var1 >= -626398704) {
                  return;
               }

               this.bj = sg.aw;
               return;
            }
         }

         this.bj = sg.ak;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "dv.av(" + ')');
      }
   }

   void ax(int var1) {
      try {
         this.bj = sg.ap;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dv.ax(" + ')');
      }
   }

   boolean aq(byte var1) {
      try {
         if (sg.ap == this.bj) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            this.av(-1268331932);
         }

         boolean var10000;
         if (this.bj == sg.aw) {
            if (var1 != 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dv.aq(" + ')');
      }
   }

   final boolean cz() {
      return this.aw != null;
   }

   protected final jy ao() {
      if (null == this.aw) {
         return null;
      } else {
         iu var1 = -1489920319 * this.cs != -1 && 0 == this.dq * -965286275 ? ng.ap(this.cs * -1489920319, (short)-14308) : null;
         iu var2 = this.cj * -1311335863 == -1 || this.av || 1825212243 * this.bc == -1311335863 * this.cj && var1 != null ? null : ng.ap(this.cj * -1311335863, (short)-19766);
         jy var3 = this.aw.at(var1, 860313855 * this.cr, var2, -1495720647 * this.cm, -1597865318);
         if (var3 == null) {
            return null;
         } else {
            var3.am();
            this.dt = var3.ez * 1753096633;
            int var4 = var3.an;
            if (!this.av) {
               var3 = this.da(var3, (byte)-78);
            }

            if (!this.av && this.ab != null) {
               if (client.dt * -330508271 >= this.au * 732108505) {
                  this.ab = null;
               }

               if (client.dt * -330508271 >= this.at * -1581699801 && -330508271 * client.dt < 732108505 * this.au) {
                  jy var5 = this.ab;
                  var5.bj(784064637 * this.ao - -1517174943 * this.bk, this.af * -1278368565 - this.am * 1220789259, 414024507 * this.ar - 669935203 * this.bb);
                  if (512 == 1155547371 * this.dy) {
                     var5.al();
                     var5.al();
                     var5.al();
                  } else if (this.dy * 1155547371 == 1024) {
                     var5.al();
                     var5.al();
                  } else if (this.dy * 1155547371 == 1536) {
                     var5.al();
                  }

                  jy[] var6 = new jy[]{var3, var5};
                  var3 = new jy(var6, 2);
                  if (1155547371 * this.dy == 512) {
                     var5.al();
                  } else if (this.dy * 1155547371 == 1024) {
                     var5.al();
                     var5.al();
                  } else if (1536 == this.dy * 1155547371) {
                     var5.al();
                     var5.al();
                     var5.al();
                  }

                  var5.bj(-1517174943 * this.bk - 784064637 * this.ao, 1220789259 * this.am - this.af * -1278368565, 669935203 * this.bb - 414024507 * this.ar);
               }
            }

            var3.bb = true;
            if (this.dp != 0 && -330508271 * client.dt >= -1276576339 * this.dx && -330508271 * client.dt < this.ds * -991193773) {
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

   final void aa(dn var1, int var2, int var3, kk var4, byte var5) {
      try {
         if (-1489920319 * this.cs != -1) {
            if (var5 != 5) {
               throw new IllegalStateException();
            }

            if (ng.ap(-1489920319 * this.cs, (short)15165).bj * 805033701 == 1) {
               if (var5 != 5) {
                  return;
               }

               this.cs = -364114241;
            }
         }

         this.dr(2111354740);
         if (var2 >= 0) {
            if (var5 != 5) {
               throw new IllegalStateException();
            }

            if (var2 < 104) {
               if (var5 != 5) {
                  return;
               }

               if (var3 >= 0) {
                  if (var5 != 5) {
                     throw new IllegalStateException();
                  }

                  if (var3 < 104) {
                     if (this.dz[0] >= 0) {
                        if (var5 != 5) {
                           throw new IllegalStateException();
                        }

                        if (this.dz[0] < 104 && this.di[0] >= 0) {
                           if (this.di[0] < 104) {
                              if (kk.aj == var4) {
                                 if (var5 != 5) {
                                    throw new IllegalStateException();
                                 }

                                 hg.kw(var1, this, var2, var3, kk.aj, -63278733);
                              }

                              this.bh(var2, var3, var4, (byte)-98);
                              return;
                           }

                           if (var5 != 5) {
                              throw new IllegalStateException();
                           }
                        }
                     }

                     this.ah(var2, var3, (byte)-63);
                     return;
                  }

                  if (var5 != 5) {
                     throw new IllegalStateException();
                  }
               }
            }
         }

         this.ah(var2, var3, (byte)-14);
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "dv.aa(" + ')');
      }
   }

   boolean bb() {
      if (sg.ap == this.ah) {
         this.az((byte)20);
      }

      return this.ah == sg.aw;
   }

   final void bh(int var1, int var2, kk var3, byte var4) {
      try {
         if (this.de * -1746074449 < 9) {
            if (var4 >= 1) {
               throw new IllegalStateException();
            }

            this.de += -1724067249;
         }

         for(int var5 = -1746074449 * this.de; var5 > 0; --var5) {
            this.dz[var5] = this.dz[var5 - 1];
            this.di[var5] = this.di[var5 - 1];
            this.dn[var5] = this.dn[var5 - 1];
         }

         this.dz[0] = var1;
         this.di[0] = var2;
         this.dn[0] = var3;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "dv.bh(" + ')');
      }
   }

   ip bx(int var1, byte var2) {
      try {
         return qg.aw(var1 - this.bx * -887329531, 649869579);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "dv.bx(" + ')');
      }
   }

   boolean bv(int var1, short var2) {
      try {
         boolean var10000;
         if (var1 >= this.bx * -887329531) {
            if (var2 <= 2000) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "dv.bv(" + ')');
      }
   }

   void ah(int var1, int var2, byte var3) {
      try {
         this.de = 0;
         this.ev = 0;
         this.eg = 0;
         this.dz[0] = var1;
         this.di[0] = var2;
         int var4 = this.al((byte)44);
         this.bk = this.dz[0] * 1183993984 + var4 * 591996992;
         this.bb = var4 * -2133667136 + this.di[0] * 27633024;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "dv.ah(" + ')');
      }
   }

   protected final jy au(int var1) {
      try {
         if (null == this.aw) {
            if (var1 != 1885718735) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            iu var10000;
            if (-1489920319 * this.cs != -1 && 0 == this.dq * -965286275) {
               if (var1 != 1885718735) {
                  throw new IllegalStateException();
               }

               var10000 = ng.ap(this.cs * -1489920319, (short)5245);
            } else {
               var10000 = null;
            }

            iu var2;
            label173: {
               label172: {
                  var2 = var10000;
                  if (this.cj * -1311335863 != -1) {
                     if (var1 != 1885718735) {
                        throw new IllegalStateException();
                     }

                     if (!this.av) {
                        if (var1 != 1885718735) {
                           throw new IllegalStateException();
                        }

                        if (1825212243 * this.bc != -1311335863 * this.cj) {
                           break label172;
                        }

                        if (var2 == null) {
                           if (var1 != 1885718735) {
                              throw new IllegalStateException();
                           }
                           break label172;
                        }
                     }
                  }

                  var10000 = null;
                  break label173;
               }

               var10000 = ng.ap(this.cj * -1311335863, (short)-19510);
            }

            iu var3 = var10000;
            jy var4 = this.aw.at(var2, 860313855 * this.cr, var3, -1495720647 * this.cm, 196311391);
            if (var4 == null) {
               if (var1 != 1885718735) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               var4.am();
               this.dt = var4.ez * 1753096633;
               int var5 = var4.an;
               if (!this.av) {
                  if (var1 != 1885718735) {
                     throw new IllegalStateException();
                  }

                  var4 = this.da(var4, (byte)-56);
               }

               if (!this.av) {
                  if (var1 != 1885718735) {
                     throw new IllegalStateException();
                  }

                  if (this.ab != null) {
                     if (var1 != 1885718735) {
                        throw new IllegalStateException();
                     }

                     if (client.dt * -330508271 >= this.au * 732108505) {
                        if (var1 != 1885718735) {
                           throw new IllegalStateException();
                        }

                        this.ab = null;
                     }

                     if (client.dt * -330508271 >= this.at * -1581699801) {
                        if (var1 != 1885718735) {
                           throw new IllegalStateException();
                        }

                        if (-330508271 * client.dt < 732108505 * this.au) {
                           if (var1 != 1885718735) {
                              throw new IllegalStateException();
                           }

                           jy var6 = this.ab;
                           var6.bj(784064637 * this.ao - -1517174943 * this.bk, this.af * -1278368565 - this.am * 1220789259, 414024507 * this.ar - 669935203 * this.bb);
                           if (512 == 1155547371 * this.dy) {
                              var6.al();
                              var6.al();
                              var6.al();
                           } else if (this.dy * 1155547371 == 1024) {
                              if (var1 != 1885718735) {
                                 throw new IllegalStateException();
                              }

                              var6.al();
                              var6.al();
                           } else if (this.dy * 1155547371 == 1536) {
                              if (var1 != 1885718735) {
                                 throw new IllegalStateException();
                              }

                              var6.al();
                           }

                           jy[] var7 = new jy[]{var4, var6};
                           var4 = new jy(var7, 2);
                           if (1155547371 * this.dy == 512) {
                              if (var1 != 1885718735) {
                                 throw new IllegalStateException();
                              }

                              var6.al();
                           } else if (this.dy * 1155547371 == 1024) {
                              if (var1 != 1885718735) {
                                 throw new IllegalStateException();
                              }

                              var6.al();
                              var6.al();
                           } else if (1536 == this.dy * 1155547371) {
                              if (var1 != 1885718735) {
                                 throw new IllegalStateException();
                              }

                              var6.al();
                              var6.al();
                              var6.al();
                           }

                           var6.bj(-1517174943 * this.bk - 784064637 * this.ao, 1220789259 * this.am - this.af * -1278368565, 669935203 * this.bb - 414024507 * this.ar);
                        }
                     }
                  }
               }

               var4.bb = true;
               if (this.dp != 0 && -330508271 * client.dt >= -1276576339 * this.dx) {
                  if (var1 != 1885718735) {
                     throw new IllegalStateException();
                  }

                  if (-330508271 * client.dt < this.ds * -991193773) {
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

               var4.cs = 0;
               return var4;
            }
         }
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "dv.au(" + ')');
      }
   }

   void cf(int var1, int var2) {
      this.de = 0;
      this.ev = 0;
      this.eg = 0;
      this.dz[0] = var1;
      this.di[0] = var2;
      int var3 = this.al((byte)24);
      this.bk = this.dz[0] * 1519224632 + var3 * -1262866161;
      this.bb = var3 * 1510724455 + this.di[0] * 1417764957;
   }

   final void bk(vl var1) {
      var1.am = 0;
      byte var2 = var1.cu((byte)13);
      boolean var3 = true;
      this.ak = var1.cu((byte)13) * -2061616799;
      this.aj = var1.cu((byte)13) * -2025537043;
      int var4 = -1;
      this.ax = 0;
      int[] var5 = new int[12];

      int var7;
      int var8;
      int var9;
      for(int var6 = 0; var6 < var5.length; ++var6) {
         var7 = var1.cy((short)-8220);
         if (var7 == 0) {
            var5[var6] = 0;
         } else {
            var8 = var1.cy((short)-20510);
            var5[var6] = var8 + (var7 << 8);
            if (0 == var6 && var5[0] == 65535) {
               var4 = var1.ce(1604738138);
               break;
            }

            if (this.bv(var5[var6], (short)21380)) {
               var9 = this.bx(var5[var6], (byte)-95).cy * 1995955561;
               if (var9 != 0) {
                  this.ax = -1481608475 * var9;
               }
            }
         }
      }

      int[] var29 = new int[12];

      for(var7 = 0; var7 < var29.length; ++var7) {
         var8 = var1.cy((short)-9795);
         if (var8 == 0) {
            var29[var7] = 0;
         } else {
            var9 = var1.cy((short)-7677);
            var29[var7] = var9 + (var8 << 8);
         }
      }

      int[] var30 = new int[5];

      for(var8 = 0; var8 < var30.length; ++var8) {
         var9 = var1.cy((short)-5518);
         if (var9 < 0 || var9 >= ht.an[var8].length) {
            var9 = 0;
         }

         var30[var8] = var9;
      }

      this.bc = var1.ce(1633255104) * 879580379;
      if (65535 == 1825212243 * this.bc) {
         this.bc = -879580379;
      }

      this.by = var1.ce(666125186) * -1379807281;
      if (-488843473 * this.by == 65535) {
         this.by = 1379807281;
      }

      this.br = this.by * 1147683435;
      this.bn = var1.ce(271635775) * 2018035535;
      if (65535 == this.bn * 230944687) {
         this.bn = -2018035535;
      }

      this.bu = var1.ce(1070650926) * -1858507535;
      if (this.bu * -1120140271 == 65535) {
         this.bu = 1858507535;
      }

      this.bt = var1.ce(757959788) * -295220955;
      if (this.bt * 1607314093 == 65535) {
         this.bt = 295220955;
      }

      this.bs = var1.ce(1890325379) * 85069143;
      if (this.bs * 1711353447 == 65535) {
         this.bs = -85069143;
      }

      this.bm = var1.ce(1380868648) * 37310571;
      if (65535 == -424879037 * this.bm) {
         this.bm = -37310571;
      }

      this.ap = new wx(var1.cw(2115341337), ll.co);
      this.ab(-1136478946);
      this.ad((byte)-5);
      this.ax(175215523);
      if (this == nw.mc) {
         mh.aw = this.ap.ap(-1996213206);
      }

      this.as = var1.cy((short)-13566) * -1624628687;
      this.ae = var1.ce(146953906) * 1082264187;
      this.aq = var1.cy((short)-5677) == 1;
      if (0 == client.ci * -959285439 && client.pw * 1797447449 >= 2) {
         this.aq = false;
      }

      gz[] var31 = null;
      boolean var32 = false;
      int var10 = var1.ce(748845787);
      var32 = 1 == (var10 >> 15 & 1);
      int var11;
      if (var10 > 0 && var10 != 32768) {
         var31 = new gz[12];

         for(var11 = 0; var11 < var31.length; ++var11) {
            int var12 = var10 >> 12 - var11 & 1;
            if (1 == var12) {
               int var16 = var5[var11] - this.bx * -887329531;
               int var17 = var1.cy((short)-16656);
               boolean var18 = 0 != (var17 & 1);
               boolean var19 = 0 != (var17 & 2);
               boolean var20 = 0 != (var17 & 4);
               boolean var21 = 0 != (var17 & 8);
               gz var22 = new gz(var16);
               int var23;
               int[] var24;
               boolean var25;
               int var26;
               short var27;
               if (var18) {
                  var23 = var1.cy((short)-8005);
                  var24 = new int[]{var23 & 15, var23 >> 4 & 15};
                  var25 = var22.ai != null && var24.length == var22.ai.length;

                  for(var26 = 0; var26 < 2; ++var26) {
                     if (var24[var26] != 15) {
                        var27 = (short)var1.ce(1592745016);
                        if (var25) {
                           var22.ai[var24[var26]] = var27;
                        }
                     }
                  }
               }

               if (var19) {
                  var23 = var1.cy((short)-14615);
                  var24 = new int[]{var23 & 15, var23 >> 4 & 15};
                  var25 = var22.ay != null && var24.length == var22.ay.length;

                  for(var26 = 0; var26 < 2; ++var26) {
                     if (15 != var24[var26]) {
                        var27 = (short)var1.ce(903460766);
                        if (var25) {
                           var22.ay[var24[var26]] = var27;
                        }
                     }
                  }
               }

               if (var20) {
                  var22.as = var1.ce(958562255) * 1512320823;
                  var22.ae = var1.ce(2018315859) * 1385907173;
               }

               if (var21) {
                  var22.am = var1.ce(194701458) * -597114803;
                  var22.at = var1.ce(1488498497) * -1296343471;
               }

               var31[var11] = var22;
            }
         }
      }

      for(var11 = 0; var11 < 3; ++var11) {
         this.ay[var11] = var1.cw(2029372741);
      }

      byte var28 = var1.cu((byte)13);
      if (this.aw == null) {
         this.aw = new ne();
      }

      this.aw.ap(var29, var5, var31, var32, var30, var2, var4, var28, 2146702331);
   }

   final boolean bj(int var1) {
      try {
         return this.aw != null;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dv.bj(" + ')');
      }
   }

   boolean bq() {
      if (sg.ap == this.ah) {
         this.az((byte)85);
      }

      return this.ah == sg.aw;
   }

   void cv(int var1, int var2) {
      this.de = 0;
      this.ev = 0;
      this.eg = 0;
      this.dz[0] = var1;
      this.di[0] = var2;
      int var3 = this.al((byte)-43);
      this.bk = this.dz[0] * 1183993984 + var3 * 591996992;
      this.bb = var3 * -2133667136 + this.di[0] * 27633024;
   }

   boolean bz() {
      if (sg.ap == this.ah) {
         this.az((byte)59);
      }

      return this.ah == sg.aw;
   }

   int al(byte var1) {
      try {
         if (this.aw != null) {
            if (var1 == 1) {
               throw new IllegalStateException();
            }

            if (-1 != 1076989835 * this.aw.ay) {
               if (var1 == 1) {
                  throw new IllegalStateException();
               }

               return sd.ap(this.aw.ay * 1076989835, -29153550).ae * 255989129;
            }
         }

         return 1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dv.al(" + ')');
      }
   }

   void by() {
      this.ah = sg.ap;
   }

   void br() {
      this.ah = sg.ap;
   }

   ip cj(int var1) {
      return qg.aw(var1 - this.bx * -845165442, 649869579);
   }

   void bu() {
      this.ah = dk.vt.ax(this.ap, -1102473463) ? sg.aw : sg.ak;
   }

   void bt() {
      this.bh = sg.ap;
   }

   void ba() {
      for(int var1 = 0; var1 < 4; ++var1) {
         if (null != client.sc[var1] && client.sc[var1].ak((String)this.ap.ap(-1139493966), (byte)123) != -1 && 2 != var1) {
            this.bj = sg.aw;
            return;
         }
      }

      this.bj = sg.ak;
   }

   void bm() {
      this.bh = sg.ap;
   }

   void bo() {
      this.bh = null != do.sb && do.sb.bp(this.ap, -1495156591) ? sg.aw : sg.ak;
   }

   void bd() {
      this.bh = null != do.sb && do.sb.bp(this.ap, 1977847916) ? sg.aw : sg.ak;
   }

   void cl(int var1, int var2) {
      this.de = 0;
      this.ev = 0;
      this.eg = 0;
      this.dz[0] = var1;
      this.di[0] = var2;
      int var3 = this.al((byte)45);
      this.bk = this.dz[0] * 1183993984 + var3 * 591996992;
      this.bb = var3 * -2133667136 + this.di[0] * 27633024;
   }

   void bw() {
      for(int var1 = 0; var1 < 4; ++var1) {
         if (null != client.sc[var1] && client.sc[var1].ak((String)this.ap.ap(-479664849), (byte)16) != -1 && 2 != var1) {
            this.bj = sg.aw;
            return;
         }
      }

      this.bj = sg.ak;
   }

   void bi() {
      for(int var1 = 0; var1 < 4; ++var1) {
         if (null != client.sc[var1] && client.sc[var1].ak((String)this.ap.ap(-1513146248), (byte)122) != -1 && 2 != var1) {
            this.bj = sg.aw;
            return;
         }
      }

      this.bj = sg.ak;
   }

   void bf() {
      this.bj = sg.ap;
   }

   void bg() {
      this.bj = sg.ap;
   }

   void bl() {
      this.bj = sg.ap;
   }

   final boolean cg() {
      return this.aw != null;
   }

   boolean cq() {
      if (sg.ap == this.bj) {
         this.av(-1806373461);
      }

      return this.bj == sg.aw;
   }

   boolean cb() {
      if (sg.ap == this.bj) {
         this.av(-1432568101);
      }

      return this.bj == sg.aw;
   }

   int cd() {
      return this.aw != null && -1 != 1029743212 * this.aw.ay ? sd.ap(this.aw.ay * 1059030930, 1871924833).ae * 2133342864 : 1;
   }

   int ci() {
      return this.aw != null && -1 != 1076989835 * this.aw.ay ? sd.ap(this.aw.ay * 1076989835, -1866943072).ae * 255989129 : 1;
   }

   final void cn(dn var1, int var2, int var3, kk var4) {
      if (-1489920319 * this.cs != -1 && ng.ap(-1489920319 * this.cs, (short)3896).bj * 805033701 == 1) {
         this.cs = -364114241;
      }

      this.dr(2111354740);
      if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         if (this.dz[0] >= 0 && this.dz[0] < 104 && this.di[0] >= 0 && this.di[0] < 104) {
            if (kk.aj == var4) {
               hg.kw(var1, this, var2, var3, kk.aj, 1790376115);
            }

            this.bh(var2, var3, var4, (byte)-20);
         } else {
            this.ah(var2, var3, (byte)-121);
         }
      } else {
         this.ah(var2, var3, (byte)-10);
      }

   }

   void bs() {
      this.bh = sg.ap;
   }

   boolean be() {
      if (sg.ap == this.bj) {
         this.av(-980966991);
      }

      return this.bj == sg.aw;
   }

   protected final jy an() {
      if (null == this.aw) {
         return null;
      } else {
         iu var1 = -1489920319 * this.cs != -1 && 0 == this.dq * -965286275 ? ng.ap(this.cs * -1489920319, (short)12331) : null;
         iu var2 = this.cj * -1311335863 == -1 || this.av || 1825212243 * this.bc == -1311335863 * this.cj && var1 != null ? null : ng.ap(this.cj * -1311335863, (short)-20958);
         jy var3 = this.aw.at(var1, 860313855 * this.cr, var2, -1495720647 * this.cm, -1850836295);
         if (var3 == null) {
            return null;
         } else {
            var3.am();
            this.dt = var3.ez * 1753096633;
            int var4 = var3.an;
            if (!this.av) {
               var3 = this.da(var3, (byte)-23);
            }

            if (!this.av && this.ab != null) {
               if (client.dt * -330508271 >= this.au * 732108505) {
                  this.ab = null;
               }

               if (client.dt * -330508271 >= this.at * -1581699801 && -330508271 * client.dt < 732108505 * this.au) {
                  jy var5 = this.ab;
                  var5.bj(784064637 * this.ao - -1517174943 * this.bk, this.af * -1278368565 - this.am * 1220789259, 414024507 * this.ar - 669935203 * this.bb);
                  if (512 == 1155547371 * this.dy) {
                     var5.al();
                     var5.al();
                     var5.al();
                  } else if (this.dy * 1155547371 == 1024) {
                     var5.al();
                     var5.al();
                  } else if (this.dy * 1155547371 == 1536) {
                     var5.al();
                  }

                  jy[] var6 = new jy[]{var3, var5};
                  var3 = new jy(var6, 2);
                  if (1155547371 * this.dy == 512) {
                     var5.al();
                  } else if (this.dy * 1155547371 == 1024) {
                     var5.al();
                     var5.al();
                  } else if (1536 == this.dy * 1155547371) {
                     var5.al();
                     var5.al();
                     var5.al();
                  }

                  var5.bj(-1517174943 * this.bk - 784064637 * this.ao, 1220789259 * this.am - this.af * -1278368565, 669935203 * this.bb - 414024507 * this.ar);
               }
            }

            var3.bb = true;
            if (this.dp != 0 && -330508271 * client.dt >= -1276576339 * this.dx && -330508271 * client.dt < this.ds * -991193773) {
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

   void cp(int var1, int var2) {
      this.de = 0;
      this.ev = 0;
      this.eg = 0;
      this.dz[0] = var1;
      this.di[0] = var2;
      int var3 = this.al((byte)19);
      this.bk = this.dz[0] * 1183993984 + var3 * 591996992;
      this.bb = var3 * -2133667136 + this.di[0] * 27633024;
   }

   void bc() {
      this.ah = sg.ap;
   }

   final void cy(int var1, int var2, kk var3) {
      if (this.de * -1746074449 < 9) {
         this.de += -1724067249;
      }

      for(int var4 = -1746074449 * this.de; var4 > 0; --var4) {
         this.dz[var4] = this.dz[var4 - 1];
         this.di[var4] = this.di[var4 - 1];
         this.dn[var4] = this.dn[var4 - 1];
      }

      this.dz[0] = var1;
      this.di[0] = var2;
      this.dn[0] = var3;
   }

   final void co(dn var1, int var2, int var3, kk var4) {
      if (-1489920319 * this.cs != -1 && ng.ap(-1489920319 * this.cs, (short)9408).bj * 907804124 == 1) {
         this.cs = -364114241;
      }

      this.dr(2111354740);
      if (var2 >= 0 && var2 < -203350251 && var3 >= 0 && var3 < -2071540844) {
         if (this.dz[0] >= 0 && this.dz[0] < -108345725 && this.di[0] >= 0 && this.di[0] < -383295710) {
            if (kk.aj == var4) {
               hg.kw(var1, this, var2, var3, kk.aj, 748493849);
            }

            this.bh(var2, var3, var4, (byte)-61);
         } else {
            this.ah(var2, var3, (byte)-61);
         }
      } else {
         this.ah(var2, var3, (byte)-75);
      }

   }

   final void ce(int var1, int var2, kk var3) {
      if (this.de * -1746074449 < 9) {
         this.de += -1724067249;
      }

      for(int var4 = -1746074449 * this.de; var4 > 0; --var4) {
         this.dz[var4] = this.dz[var4 - 1];
         this.di[var4] = this.di[var4 - 1];
         this.dn[var4] = this.dn[var4 - 1];
      }

      this.dz[0] = var1;
      this.di[0] = var2;
      this.dn[0] = var3;
   }

   boolean ct(int var1) {
      return var1 >= this.bx * -887329531;
   }

   final boolean cx() {
      return this.aw != null;
   }

   boolean bp() {
      if (sg.ap == this.ah) {
         this.az((byte)65);
      }

      return this.ah == sg.aw;
   }

   final boolean ch() {
      return this.aw != null;
   }

   void bn() {
      this.ah = sg.ap;
   }

   boolean cc(int var1) {
      return var1 >= this.bx * -2077085829;
   }

   dv() {
      try {
         super();
         this.ak = 2061616799;
         this.aj = 2025537043;
         this.ay = new String[3];

         for(int var1 = 0; var1 < 3; ++var1) {
            this.ay[var1] = "";
         }

         this.as = 0;
         this.ae = 0;
         this.at = 0;
         this.au = 0;
         this.av = false;
         this.ax = 0;
         this.aq = false;
         this.ah = sg.ap;
         this.bh = sg.ap;
         this.bj = sg.ap;
         this.bv = hx.jf;
         this.bx = (-1964001905 * vw.ap < 224 ? 512 : 2048) * 863000525;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "dv.<init>(" + ')');
      }
   }

   ip cm(int var1) {
      return qg.aw(var1 - this.bx * -887329531, 649869579);
   }

   ip cw(int var1) {
      return qg.aw(var1 - this.bx * -1838578890, 649869579);
   }

   static File aw(String var0, int var1) {
      try {
         if (!if.ap) {
            if (var1 <= -1144955652) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException("");
            }
         } else {
            File var2 = (File)if.ak.get(var0);
            if (var2 != null) {
               if (var1 <= -1144955652) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               File var3 = new File(ac.aw, var0);
               RandomAccessFile var4 = null;

               try {
                  File var5 = new File(var3.getParent());
                  if (!var5.exists()) {
                     if (var1 <= -1144955652) {
                        throw new IllegalStateException();
                     } else {
                        throw new RuntimeException("");
                     }
                  } else {
                     var4 = new RandomAccessFile(var3, "rw");
                     int var6 = var4.read();
                     var4.seek(0L);
                     var4.write(var6);
                     var4.seek(0L);
                     var4.close();
                     if.ak.put(var0, var3);
                     return var3;
                  }
               } catch (Exception var8) {
                  try {
                     if (null != var4) {
                        if (var1 <= -1144955652) {
                           throw new IllegalStateException();
                        }

                        var4.close();
                        var4 = null;
                     }
                  } catch (Exception var7) {
                  }

                  throw new RuntimeException();
               }
            }
         }
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "dv.aw(" + ')');
      }
   }
}
