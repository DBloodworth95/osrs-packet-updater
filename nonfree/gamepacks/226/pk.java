import java.io.IOException;
import java.util.zip.CRC32;

public class pk {
   vl aa;
   static final int br = 57;
   static final int ak = 2;
   static final int aj = 3;
   sw ay;
   int an;
   static final int aw = 1;
   ud am;
   int as;
   ud au;
   long ae;
   pm ao;
   ud ab;
   int ar;
   ud af;
   int az;
   static final int ap = 0;
   pg ad;
   int at;
   vl av;
   int ax;
   CRC32 al;
   boolean ag;
   or[] ah;
   int bh;
   int bj;
   byte bv;
   public int bx;
   public int bk;
   vl ac;

   void ac(or var1, int var2, int var3, int var4, byte var5, boolean var6) {
      long var7 = (long)((var2 << 16) + var3);
      pg var9 = (pg)this.am.ap(var7);
      if (var9 == null) {
         var9 = (pg)this.au.ap(var7);
         if (null == var9) {
            var9 = (pg)this.af.ap(var7);
            if (null != var9) {
               if (var6) {
                  var9.kg();
                  this.am.ak(var9, var7);
                  this.ar -= 743957505;
                  this.at += 1452459101;
               }

            } else {
               if (!var6) {
                  var9 = (pg)this.ab.ap(var7);
                  if (null != var9) {
                     return;
                  }
               }

               var9 = new pg();
               var9.ap = var1;
               var9.aw = -1540418348 * var4;
               var9.ak = var5;
               if (var6) {
                  this.am.ak(var9, var7);
                  this.at += -269574407;
               } else {
                  this.ao.ap(var9);
                  this.af.ak(var9, var7);
                  this.ar += -247110448;
               }

            }
         }
      }
   }

   public boolean ap(int var1) {
      try {
         long var2 = ck.ap(-1089555375);
         int var4 = (int)(var2 - -8413539928166424643L * this.ae);
         this.ae = var2 * -5064212142047521899L;
         if (var4 > 200) {
            if (var1 != -1956858846) {
               throw new IllegalStateException();
            }

            var4 = 200;
         }

         this.as += var4 * 1502696997;
         if (-326104939 * this.az == 0) {
            if (var1 != -1956858846) {
               throw new IllegalStateException();
            }

            if (this.an * 537068201 == 0) {
               if (var1 != -1956858846) {
                  throw new IllegalStateException();
               }

               if (1325717689 * this.ar == 0) {
                  if (var1 != -1956858846) {
                     throw new IllegalStateException();
                  }

                  if (this.at * 966864885 == 0) {
                     if (var1 != -1956858846) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }
               }
            }
         }

         if (this.ay == null) {
            if (var1 != -1956858846) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            try {
               if (-85142099 * this.as > 30000) {
                  throw new IOException();
               } else {
                  pg var5;
                  vl var6;
                  while(this.an * 537068201 < 200) {
                     if (var1 != -1956858846) {
                        throw new IllegalStateException();
                     }

                     if (this.at * 966864885 <= 0) {
                        break;
                     }

                     var5 = (pg)this.am.aj();
                     var6 = new vl(4);
                     var6.bo(1, -1213144852);
                     var6.ba((int)var5.ht, -752661657);
                     this.ay.ay(var6.ae, 0, 4, 1775988785);
                     this.au.ak(var5, var5.ht);
                     this.at -= 1452459101;
                     this.an += 1088602521;
                  }

                  while(this.az * -326104939 < 200) {
                     if (var1 != -1956858846) {
                        throw new IllegalStateException();
                     }

                     if (this.ar * 1325717689 <= 0) {
                        break;
                     }

                     var5 = (pg)this.ao.ak();
                     var6 = new vl(4);
                     var6.bo(0, -1055151315);
                     var6.ba((int)var5.ht, -1723095722);
                     this.ay.ay(var6.ae, 0, 4, 1921758454);
                     var5.kg();
                     this.ab.ak(var5, var5.ht);
                     this.ar -= 537636233;
                     this.az += -157908291;
                  }

                  int var21 = 0;

                  while(true) {
                     label292: {
                        if (var21 < 100) {
                           int var22 = this.ay.ak((byte)4);
                           if (var22 < 0) {
                              throw new IOException();
                           }

                           if (var22 == 0) {
                              if (var1 != -1956858846) {
                                 throw new IllegalStateException();
                              }
                           } else {
                              this.as = 0;
                              byte var7 = 0;
                              if (this.ad == null) {
                                 if (var1 != -1956858846) {
                                    throw new IllegalStateException();
                                 }

                                 var7 = 8;
                              } else if (this.ax * -322852667 == 0) {
                                 if (var1 != -1956858846) {
                                    throw new IllegalStateException();
                                 }

                                 var7 = 1;
                              }

                              int var8;
                              int var9;
                              int var10;
                              byte[] var10000;
                              int var10001;
                              vl var24;
                              if (var7 > 0) {
                                 if (var1 != -1956858846) {
                                    throw new IllegalStateException();
                                 }

                                 var8 = var7 - this.ac.am * -1689308347;
                                 if (var8 > var22) {
                                    if (var1 != -1956858846) {
                                       throw new IllegalStateException();
                                    }

                                    var8 = var22;
                                 }

                                 this.ay.ai(this.ac.ae, this.ac.am * -1689308347, var8, -201594401);
                                 if (0 != this.bv) {
                                    if (var1 != -1956858846) {
                                       throw new IllegalStateException();
                                    }

                                    for(var9 = 0; var9 < var8; ++var9) {
                                       if (var1 != -1956858846) {
                                          throw new IllegalStateException();
                                       }

                                       var10000 = this.ac.ae;
                                       var10001 = this.ac.am * -1689308347 + var9;
                                       var10000[var10001] ^= this.bv;
                                    }
                                 }

                                 var24 = this.ac;
                                 var24.am += -725588083 * var8;
                                 if (-1689308347 * this.ac.am >= var7) {
                                    if (this.ad == null) {
                                       if (var1 != -1956858846) {
                                          throw new IllegalStateException();
                                       }

                                       this.ac.am = 0;
                                       var9 = this.ac.cy((short)-30805);
                                       var10 = this.ac.ce(1769626936);
                                       int var11 = this.ac.cy((short)-27702);
                                       int var12 = this.ac.ch(1203709469);
                                       long var13 = (long)((var9 << 16) + var10);
                                       pg var15 = (pg)this.au.ap(var13);
                                       this.ag = true;
                                       if (var15 == null) {
                                          if (var1 != -1956858846) {
                                             throw new IllegalStateException();
                                          }

                                          var15 = (pg)this.ab.ap(var13);
                                          this.ag = false;
                                       }

                                       if (var15 == null) {
                                          if (var1 != -1956858846) {
                                             throw new IllegalStateException();
                                          }

                                          throw new IOException();
                                       }

                                       byte var25;
                                       if (0 == var11) {
                                          if (var1 != -1956858846) {
                                             throw new IllegalStateException();
                                          }

                                          var25 = 5;
                                       } else {
                                          var25 = 9;
                                       }

                                       byte var16 = var25;
                                       this.ad = var15;
                                       this.av = new vl(var12 + var16 + this.ad.ak);
                                       this.av.bo(var11, 218726925);
                                       this.av.bw(var12, (byte)107);
                                       this.ax = 1423749224;
                                       this.ac.am = 0;
                                    } else if (0 == -322852667 * this.ax) {
                                       if (var1 != -1956858846) {
                                          throw new IllegalStateException();
                                       }

                                       if (-1 == this.ac.ae[0]) {
                                          if (var1 != -1956858846) {
                                             throw new IllegalStateException();
                                          }

                                          this.ax = 714839565;
                                          this.ac.am = 0;
                                       } else {
                                          this.ad = null;
                                       }
                                    }
                                    break label292;
                                 }
                              } else {
                                 var8 = this.av.ae.length - this.ad.ak;
                                 var9 = 512 - -322852667 * this.ax;
                                 if (var9 > var8 - this.av.am * -1689308347) {
                                    var9 = var8 - -1689308347 * this.av.am;
                                 }

                                 if (var9 > var22) {
                                    if (var1 != -1956858846) {
                                       throw new IllegalStateException();
                                    }

                                    var9 = var22;
                                 }

                                 this.ay.ai(this.av.ae, -1689308347 * this.av.am, var9, 5547737);
                                 if (0 != this.bv) {
                                    for(var10 = 0; var10 < var9; ++var10) {
                                       if (var1 != -1956858846) {
                                          throw new IllegalStateException();
                                       }

                                       var10000 = this.av.ae;
                                       var10001 = var10 + this.av.am * -1689308347;
                                       var10000[var10001] ^= this.bv;
                                    }
                                 }

                                 var24 = this.av;
                                 var24.am += var9 * -725588083;
                                 this.ax += var9 * 714839565;
                                 if (var8 == this.av.am * -1689308347) {
                                    if (var1 != -1956858846) {
                                       throw new IllegalStateException();
                                    }

                                    if (this.ad.ht == 16711935L) {
                                       if (var1 != -1956858846) {
                                          throw new IllegalStateException();
                                       }

                                       this.aa = this.av;

                                       for(var10 = 0; var10 < 256; ++var10) {
                                          if (var1 != -1956858846) {
                                             throw new IllegalStateException();
                                          }

                                          or var23 = this.ah[var10];
                                          if (var23 != null) {
                                             if (var1 != -1956858846) {
                                                throw new IllegalStateException();
                                             }

                                             this.ai(var23, var10, -2119927791);
                                          }
                                       }
                                    } else {
                                       this.al.reset();
                                       this.al.update(this.av.ae, 0, var8);
                                       var10 = (int)this.al.getValue();
                                       if (-543781559 * this.ad.aw != var10) {
                                          if (var1 != -1956858846) {
                                             throw new IllegalStateException();
                                          }

                                          try {
                                             this.ay.as(313902642);
                                          } catch (Exception var18) {
                                          }

                                          this.bx += -486596035;
                                          this.ay = null;
                                          this.bv = (byte)((int)(Math.random() * 255.0D + 1.0D));
                                          return false;
                                       }

                                       this.bx = 0;
                                       this.bk = 0;
                                       or var26 = this.ad.ap;
                                       var10001 = (int)(this.ad.ht & 65535L);
                                       byte[] var10002 = this.av.ae;
                                       boolean var10003;
                                       if (16711680L == (this.ad.ht & 16711680L)) {
                                          if (var1 != -1956858846) {
                                             throw new IllegalStateException();
                                          }

                                          var10003 = true;
                                       } else {
                                          var10003 = false;
                                       }

                                       var26.as(var10001, var10002, var10003, this.ag, (byte)46);
                                    }

                                    this.ad.kf();
                                    if (this.ag) {
                                       if (var1 != -1956858846) {
                                          throw new IllegalStateException();
                                       }

                                       this.an -= 1088602521;
                                    } else {
                                       this.az -= -157908291;
                                    }

                                    this.ax = 0;
                                    this.ad = null;
                                    this.av = null;
                                    break label292;
                                 }

                                 if (512 == this.ax * -322852667) {
                                    if (var1 != -1956858846) {
                                       throw new IllegalStateException();
                                    }

                                    this.ax = 0;
                                    break label292;
                                 }
                              }
                           }
                        }

                        return true;
                     }

                     ++var21;
                  }
               }
            } catch (IOException var19) {
               try {
                  this.ay.as(203990566);
               } catch (Exception var17) {
               }

               this.bk += -1867083085;
               this.ay = null;
               return false;
            }
         }
      } catch (RuntimeException var20) {
         throw tm.aw(var20, "pk.ap(" + ')');
      }
   }

   public void aw(boolean var1, int var2) {
      try {
         if (this.ay == null) {
            if (var2 >= 424628563) {
               throw new IllegalStateException();
            }
         } else {
            try {
               vl var3 = new vl(4);
               byte var10001;
               if (var1) {
                  if (var2 >= 424628563) {
                     throw new IllegalStateException();
                  }

                  var10001 = 2;
               } else {
                  var10001 = 3;
               }

               var3.bo(var10001, -1703093490);
               var3.ba(0, -822434909);
               this.ay.ay(var3.ae, 0, 4, -1986768072);
            } catch (IOException var6) {
               try {
                  this.ay.as(1153465800);
               } catch (Exception var5) {
               }

               this.bk += -1867083085;
               this.ay = null;
            }

         }
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "pk.aw(" + ')');
      }
   }

   public void ak(sw var1, boolean var2, int var3) {
      try {
         if (null != this.ay) {
            if (var3 <= -1766941957) {
               throw new IllegalStateException();
            }

            try {
               this.ay.as(-1837027418);
            } catch (Exception var8) {
            }

            this.ay = null;
         }

         this.ay = var1;
         this.aw(var2, -361567652);
         this.ac.am = 0;
         this.ad = null;
         this.av = null;
         this.ax = 0;

         while(true) {
            pg var4 = (pg)this.au.aj();
            if (null == var4) {
               while(true) {
                  var4 = (pg)this.ab.aj();
                  if (null == var4) {
                     if (var3 <= -1766941957) {
                        throw new IllegalStateException();
                     } else {
                        if (this.bv != 0) {
                           if (var3 <= -1766941957) {
                              return;
                           }

                           try {
                              vl var10 = new vl(4);
                              var10.bo(4, -160213556);
                              var10.bo(this.bv, -1942055402);
                              var10.bd(0, (byte)-56);
                              this.ay.ay(var10.ae, 0, 4, 981414745);
                           } catch (IOException var7) {
                              try {
                                 this.ay.as(-1776592594);
                              } catch (Exception var6) {
                              }

                              this.bk += -1867083085;
                              this.ay = null;
                           }
                        }

                        this.as = 0;
                        this.ae = ck.ap(-555590533) * -5064212142047521899L;
                        return;
                     }
                  }

                  this.ao.aw(var4);
                  this.af.ak(var4, var4.ht);
                  this.ar += 537636233;
                  this.az -= -157908291;
               }
            }

            this.am.ak(var4, var4.ht);
            this.at += 1452459101;
            this.an -= 1088602521;
         }
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "pk.ak(" + ')');
      }
   }

   void aj(or var1, int var2, int var3) {
      try {
         if (var1.ab && !var1.az) {
            if (var3 != 1734803559) {
               throw new IllegalStateException();
            }

            if (var2 <= 136156211 * this.bh) {
               if (var3 != 1734803559) {
                  throw new IllegalStateException();
               }

               throw new RuntimeException("");
            }

            if (var2 < this.bj * 1382275455) {
               this.bj = -1770920321 * var2;
            }
         } else {
            if (var2 >= 1382275455 * this.bj) {
               if (var3 != 1734803559) {
                  throw new IllegalStateException();
               }

               throw new RuntimeException("");
            }

            if (var2 > 136156211 * this.bh) {
               this.bh = var2 * -1377859845;
            }
         }

         if (null != this.aa) {
            if (var3 == 1734803559) {
               this.ai(var1, var2, -1621475102);
            }
         } else {
            this.ay((or)null, -1308770465 * oz.ap.al, 255, 0, (byte)0, true, 1473483156);
            this.ah[var2] = var1;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "pk.aj(" + ')');
      }
   }

   void ai(or var1, int var2, int var3) {
      try {
         this.aa.am = var2 * -1509737368 + 667026881;
         if (-1689308347 * this.aa.am >= this.aa.ae.length) {
            if (var3 >= -1599719295) {
               throw new IllegalStateException();
            } else if (var1.ab) {
               if (var3 >= -1599719295) {
                  throw new IllegalStateException();
               } else {
                  var1.ai((byte)1);
               }
            } else {
               throw new RuntimeException("");
            }
         } else {
            int var4 = this.aa.ch(1203709469);
            int var5 = this.aa.ch(1203709469);
            var1.ay(var4, var5, -113045218);
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "pk.ai(" + ')');
      }
   }

   void ay(or var1, int var2, int var3, int var4, byte var5, boolean var6, int var7) {
      try {
         long var8 = (long)((var2 << 16) + var3);
         pg var10 = (pg)this.am.ap(var8);
         if (var10 != null) {
            if (var7 == 1473483156) {
               ;
            }
         } else {
            var10 = (pg)this.au.ap(var8);
            if (null == var10) {
               var10 = (pg)this.af.ap(var8);
               if (null != var10) {
                  if (var7 == 1473483156) {
                     if (var6) {
                        if (var7 != 1473483156) {
                           throw new IllegalStateException();
                        }

                        var10.kg();
                        this.am.ak(var10, var8);
                        this.ar -= 537636233;
                        this.at += 1452459101;
                     }

                  }
               } else {
                  if (!var6) {
                     if (var7 != 1473483156) {
                        throw new IllegalStateException();
                     }

                     var10 = (pg)this.ab.ap(var8);
                     if (null != var10) {
                        if (var7 != 1473483156) {
                           throw new IllegalStateException();
                        }

                        return;
                     }
                  }

                  var10 = new pg();
                  var10.ap = var1;
                  var10.aw = -609225479 * var4;
                  var10.ak = var5;
                  if (var6) {
                     if (var7 != 1473483156) {
                        throw new IllegalStateException();
                     }

                     this.am.ak(var10, var8);
                     this.at += 1452459101;
                  } else {
                     this.ao.ap(var10);
                     this.af.ak(var10, var8);
                     this.ar += 537636233;
                  }

               }
            }
         }
      } catch (RuntimeException var11) {
         throw tm.aw(var11, "pk.ay(" + ')');
      }
   }

   void as(int var1, int var2, int var3) {
      try {
         long var4 = (long)((var1 << 16) + var2);
         pg var6 = (pg)this.af.ap(var4);
         if (var6 == null) {
            if (var3 != 1073759661) {
               ;
            }
         } else {
            this.ao.aw(var6);
         }
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "pk.as(" + ')');
      }
   }

   void ad(or var1, int var2) {
      this.aa.am = var2 * -1509737368 + 1347921067;
      if (-1689308347 * this.aa.am >= this.aa.ae.length) {
         if (var1.ab) {
            var1.ai((byte)1);
         } else {
            throw new RuntimeException("");
         }
      } else {
         int var3 = this.aa.ch(1203709469);
         int var4 = this.aa.ch(1203709469);
         var1.ay(var3, var4, -29009961);
      }
   }

   static int al(int var0, da var1, boolean var2, int var3) {
      try {
         ng var4 = qk.ek.ap(cm.ae[(dp.am -= -1450976103) * -158156887], -384417172);
         if (2800 == var0) {
            if (var3 != -1212502861) {
               throw new IllegalStateException();
            } else {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = db.aw(gr.oa(var4, 1217983930), (byte)2);
               return 1;
            }
         } else if (var0 == 2801) {
            if (var3 != -1212502861) {
               throw new IllegalStateException();
            } else {
               int var5 = cm.ae[(dp.am -= -1450976103) * -158156887];
               --var5;
               if (var4.ej != null) {
                  if (var3 != -1212502861) {
                     throw new IllegalStateException();
                  }

                  if (var5 < var4.ej.length) {
                     if (var3 != -1212502861) {
                        throw new IllegalStateException();
                     }

                     if (var4.ej[var5] != null) {
                        cm.at[(ih.au += 746573637) * -114988147 - 1] = var4.ej[var5];
                        return 1;
                     }

                     if (var3 != -1212502861) {
                        throw new IllegalStateException();
                     }
                  }
               }

               cm.at[(ih.au += 746573637) * -114988147 - 1] = "";
               return 1;
            }
         } else if (2802 == var0) {
            if (var3 != -1212502861) {
               throw new IllegalStateException();
            } else {
               if (null == var4.ex) {
                  if (var3 != -1212502861) {
                     throw new IllegalStateException();
                  }

                  cm.at[(ih.au += 746573637) * -114988147 - 1] = "";
               } else {
                  cm.at[(ih.au += 746573637) * -114988147 - 1] = var4.ex;
               }

               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "pk.al(" + ')');
      }
   }

   public void at(byte var1) {
      try {
         if (null != this.ay) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            try {
               this.ay.as(-254188746);
            } catch (Exception var3) {
            }

            this.ay = null;
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "pk.at(" + ')');
      }
   }

   public void ar(sw var1, boolean var2) {
      if (null != this.ay) {
         try {
            this.ay.as(-299174339);
         } catch (Exception var7) {
         }

         this.ay = null;
      }

      this.ay = var1;
      this.aw(var2, -1190495447);
      this.ac.am = 0;
      this.ad = null;
      this.av = null;
      this.ax = 0;

      while(true) {
         pg var3 = (pg)this.au.aj();
         if (null == var3) {
            while(true) {
               var3 = (pg)this.ab.aj();
               if (null == var3) {
                  if (this.bv != 0) {
                     try {
                        vl var8 = new vl(4);
                        var8.bo(4, 1830427237);
                        var8.bo(this.bv, -735086811);
                        var8.bd(0, (byte)-31);
                        this.ay.ay(var8.ae, 0, 4, -1367701187);
                     } catch (IOException var6) {
                        try {
                           this.ay.as(1538561519);
                        } catch (Exception var5) {
                        }

                        this.bk += -1261223475;
                        this.ay = null;
                     }
                  }

                  this.as = 0;
                  this.ae = ck.ap(-1217015931) * -5064212142047521899L;
                  return;
               }

               this.ao.aw(var3);
               this.af.ak(var3, var3.ht);
               this.ar += 1335433353;
               this.az -= -157908291;
            }
         }

         this.am.ak(var3, var3.ht);
         this.at += 1452459101;
         this.an -= 1088602521;
      }
   }

   public boolean an() {
      long var1 = ck.ap(-941531754);
      int var3 = (int)(var1 - -8413539928166424643L * this.ae);
      this.ae = var1 * -5064212142047521899L;
      if (var3 > 200) {
         var3 = 200;
      }

      this.as += var3 * 1449156932;
      if (-326104939 * this.az == 0 && this.an * 537068201 == 0 && -1858716122 * this.ar == 0 && this.at * 966864885 == 0) {
         return true;
      } else if (this.ay == null) {
         return false;
      } else {
         try {
            if (1314803258 * this.as > 434475788) {
               throw new IOException();
            } else {
               pg var4;
               vl var5;
               while(this.an * 537068201 < -2065086578 && this.at * 2053406258 > 0) {
                  var4 = (pg)this.am.aj();
                  var5 = new vl(4);
                  var5.bo(1, 120833936);
                  var5.ba((int)var4.ht, -1617108429);
                  this.ay.ay(var5.ae, 0, 4, -1393554736);
                  this.au.ak(var4, var4.ht);
                  this.at -= -1612361011;
                  this.an += 1088602521;
               }

               while(this.az * 860906914 < -1678658390 && this.ar * 1325717689 > 0) {
                  var4 = (pg)this.ao.ak();
                  var5 = new vl(4);
                  var5.bo(0, -1792053872);
                  var5.ba((int)var4.ht, 97436566);
                  this.ay.ay(var5.ae, 0, 4, -795651239);
                  var4.kg();
                  this.ab.ak(var4, var4.ht);
                  this.ar -= 1596462279;
                  this.az += 671208650;
               }

               for(int var19 = 0; var19 < 100; ++var19) {
                  int var20 = this.ay.ak((byte)4);
                  if (var20 < 0) {
                     throw new IOException();
                  }

                  if (var20 == 0) {
                     break;
                  }

                  this.as = 0;
                  byte var6 = 0;
                  if (this.ad == null) {
                     var6 = 8;
                  } else if (this.ax * -681709780 == 0) {
                     var6 = 1;
                  }

                  int var7;
                  int var8;
                  int var9;
                  byte[] var10000;
                  int var10001;
                  vl var22;
                  if (var6 > 0) {
                     var7 = var6 - this.ac.am * -1795884775;
                     if (var7 > var20) {
                        var7 = var20;
                     }

                     this.ay.ai(this.ac.ae, this.ac.am * 1970698647, var7, 1474186846);
                     if (0 != this.bv) {
                        for(var8 = 0; var8 < var7; ++var8) {
                           var10000 = this.ac.ae;
                           var10001 = this.ac.am * -1689308347 + var8;
                           var10000[var10001] ^= this.bv;
                        }
                     }

                     var22 = this.ac;
                     var22.am += -341524995 * var7;
                     if (-1689308347 * this.ac.am < var6) {
                        break;
                     }

                     if (this.ad == null) {
                        this.ac.am = 0;
                        var8 = this.ac.cy((short)-26667);
                        var9 = this.ac.ce(1838002174);
                        int var10 = this.ac.cy((short)-27777);
                        int var11 = this.ac.ch(1203709469);
                        long var12 = (long)((var8 << 16) + var9);
                        pg var14 = (pg)this.au.ap(var12);
                        this.ag = true;
                        if (var14 == null) {
                           var14 = (pg)this.ab.ap(var12);
                           this.ag = false;
                        }

                        if (var14 == null) {
                           throw new IOException();
                        }

                        int var15 = 0 == var10 ? 5 : 9;
                        this.ad = var14;
                        this.av = new vl(var11 + var15 + this.ad.ak);
                        this.av.bo(var10, -744546639);
                        this.av.bw(var11, (byte)50);
                        this.ax = 1423749224;
                        this.ac.am = 0;
                     } else if (0 == -322852667 * this.ax) {
                        if (-1 == this.ac.ae[0]) {
                           this.ax = 714839565;
                           this.ac.am = 0;
                        } else {
                           this.ad = null;
                        }
                     }
                  } else {
                     var7 = this.av.ae.length - this.ad.ak;
                     var8 = -1734282700 - -322852667 * this.ax;
                     if (var8 > var7 - this.av.am * -1689308347) {
                        var8 = var7 - 90528487 * this.av.am;
                     }

                     if (var8 > var20) {
                        var8 = var20;
                     }

                     this.ay.ai(this.av.ae, -1544943655 * this.av.am, var8, -1373666639);
                     if (0 != this.bv) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10000 = this.av.ae;
                           var10001 = var9 + this.av.am * -1689308347;
                           var10000[var10001] ^= this.bv;
                        }
                     }

                     var22 = this.av;
                     var22.am += var8 * -725588083;
                     this.ax += var8 * 714839565;
                     if (var7 == this.av.am * -1689308347) {
                        if (this.ad.ht == 16711935L) {
                           this.aa = this.av;

                           for(var9 = 0; var9 < -828964229; ++var9) {
                              or var21 = this.ah[var9];
                              if (var21 != null) {
                                 this.ai(var21, var9, -1749355941);
                              }
                           }
                        } else {
                           this.al.reset();
                           this.al.update(this.av.ae, 0, var7);
                           var9 = (int)this.al.getValue();
                           if (-906730911 * this.ad.aw != var9) {
                              try {
                                 this.ay.as(1280254851);
                              } catch (Exception var17) {
                              }

                              this.bx += -486596035;
                              this.ay = null;
                              this.bv = (byte)((int)(Math.random() * 255.0D + 1.0D));
                              return false;
                           }

                           this.bx = 0;
                           this.bk = 0;
                           this.ad.ap.as((int)(this.ad.ht & 65535L), this.av.ae, 16711680L == (this.ad.ht & 16711680L), this.ag, (byte)3);
                        }

                        this.ad.kf();
                        if (this.ag) {
                           this.an -= 702500871;
                        } else {
                           this.az -= -1895368445;
                        }

                        this.ax = 0;
                        this.ad = null;
                        this.av = null;
                     } else {
                        if (1316848454 != this.ax * -322852667) {
                           break;
                        }

                        this.ax = 0;
                     }
                  }
               }

               return true;
            }
         } catch (IOException var18) {
            try {
               this.ay.as(-980509270);
            } catch (Exception var16) {
            }

            this.bk += -264212953;
            this.ay = null;
            return false;
         }
      }
   }

   public void ao(boolean var1) {
      if (this.ay != null) {
         try {
            vl var2 = new vl(4);
            var2.bo(var1 ? 2 : 3, -96073157);
            var2.ba(0, 217782087);
            this.ay.ay(var2.ae, 0, 4, -1354781961);
         } catch (IOException var5) {
            try {
               this.ay.as(-1662877129);
            } catch (Exception var4) {
            }

            this.bk += -1867083085;
            this.ay = null;
         }

      }
   }

   public void af(boolean var1) {
      if (this.ay != null) {
         try {
            vl var2 = new vl(4);
            var2.bo(var1 ? 2 : 3, 1579995359);
            var2.ba(0, 33085845);
            this.ay.ay(var2.ae, 0, 4, 1612926355);
         } catch (IOException var5) {
            try {
               this.ay.as(488896677);
            } catch (Exception var4) {
            }

            this.bk += 282130734;
            this.ay = null;
         }

      }
   }

   void av(or var1, int var2, int var3, int var4, byte var5, boolean var6) {
      long var7 = (long)((var2 << 16) + var3);
      pg var9 = (pg)this.am.ap(var7);
      if (var9 == null) {
         var9 = (pg)this.au.ap(var7);
         if (null == var9) {
            var9 = (pg)this.af.ap(var7);
            if (null != var9) {
               if (var6) {
                  var9.kg();
                  this.am.ak(var9, var7);
                  this.ar -= 537636233;
                  this.at += -149765933;
               }

            } else {
               if (!var6) {
                  var9 = (pg)this.ab.ap(var7);
                  if (null != var9) {
                     return;
                  }
               }

               var9 = new pg();
               var9.ap = var1;
               var9.aw = -609225479 * var4;
               var9.ak = var5;
               if (var6) {
                  this.am.ak(var9, var7);
                  this.at += -178312067;
               } else {
                  this.ao.ap(var9);
                  this.af.ak(var9, var7);
                  this.ar += -526108346;
               }

            }
         }
      }
   }

   public void ab(sw var1, boolean var2) {
      if (null != this.ay) {
         try {
            this.ay.as(-783288137);
         } catch (Exception var7) {
         }

         this.ay = null;
      }

      this.ay = var1;
      this.aw(var2, -720581073);
      this.ac.am = 0;
      this.ad = null;
      this.av = null;
      this.ax = 0;

      while(true) {
         pg var3 = (pg)this.au.aj();
         if (null == var3) {
            while(true) {
               var3 = (pg)this.ab.aj();
               if (null == var3) {
                  if (this.bv != 0) {
                     try {
                        vl var8 = new vl(4);
                        var8.bo(4, 311760421);
                        var8.bo(this.bv, -1749561008);
                        var8.bd(0, (byte)2);
                        this.ay.ay(var8.ae, 0, 4, 276484331);
                     } catch (IOException var6) {
                        try {
                           this.ay.as(-1437397299);
                        } catch (Exception var5) {
                        }

                        this.bk += -1867083085;
                        this.ay = null;
                     }
                  }

                  this.as = 0;
                  this.ae = ck.ap(-1685090798) * -5064212142047521899L;
                  return;
               }

               this.ao.aw(var3);
               this.af.ak(var3, var3.ht);
               this.ar += 537636233;
               this.az -= -157908291;
            }
         }

         this.am.ak(var3, var3.ht);
         this.at += 1452459101;
         this.an -= 1088602521;
      }
   }

   void az(or var1, int var2) {
      if (var1.ab && !var1.az) {
         if (var2 <= 136156211 * this.bh) {
            throw new RuntimeException("");
         }

         if (var2 < this.bj * -630965435) {
            this.bj = -1770920321 * var2;
         }
      } else {
         if (var2 >= 425177675 * this.bj) {
            throw new RuntimeException("");
         }

         if (var2 > 136156211 * this.bh) {
            this.bh = var2 * 288042957;
         }
      }

      if (null != this.aa) {
         this.ai(var1, var2, -1821607144);
      } else {
         this.ay((or)null, -1308770465 * oz.ap.al, -351461715, 0, (byte)0, true, 1473483156);
         this.ah[var2] = var1;
      }
   }

   void ag(or var1, int var2) {
      if (var1.ab && !var1.az) {
         if (var2 <= 136156211 * this.bh) {
            throw new RuntimeException("");
         }

         if (var2 < this.bj * 1382275455) {
            this.bj = -1770920321 * var2;
         }
      } else {
         if (var2 >= 1382275455 * this.bj) {
            throw new RuntimeException("");
         }

         if (var2 > 136156211 * this.bh) {
            this.bh = var2 * -1377859845;
         }
      }

      if (null != this.aa) {
         this.ai(var1, var2, -1692776962);
      } else {
         this.ay((or)null, -1308770465 * oz.ap.al, 255, 0, (byte)0, true, 1473483156);
         this.ah[var2] = var1;
      }
   }

   void aq(int var1, int var2) {
      long var3 = (long)((var1 << 16) + var2);
      pg var5 = (pg)this.af.ap(var3);
      if (var5 != null) {
         this.ao.aw(var5);
      }
   }

   public int bh(boolean var1, boolean var2) {
      int var3 = 0;
      if (var1) {
         var3 += 966864885 * this.at + this.an * 537068201;
      }

      if (var2) {
         var3 += -326104939 * this.az + 1325717689 * this.ar;
      }

      return var3;
   }

   int ae(int var1, int var2, int var3) {
      try {
         long var4 = (long)((var1 << 16) + var2);
         if (this.ad != null) {
            if (var3 == -2008106708) {
               throw new IllegalStateException();
            }

            if (this.ad.ht == var4) {
               return 1 + this.av.am * 262198191 / (this.av.ae.length - this.ad.ak);
            }
         }

         return 0;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "pk.ae(" + ')');
      }
   }

   void ax(or var1, int var2, int var3, int var4, byte var5, boolean var6) {
      long var7 = (long)((var2 << 16) + var3);
      pg var9 = (pg)this.am.ap(var7);
      if (var9 == null) {
         var9 = (pg)this.au.ap(var7);
         if (null == var9) {
            var9 = (pg)this.af.ap(var7);
            if (null != var9) {
               if (var6) {
                  var9.kg();
                  this.am.ak(var9, var7);
                  this.ar -= 677196613;
                  this.at += 1615299452;
               }

            } else {
               if (!var6) {
                  var9 = (pg)this.ab.ap(var7);
                  if (null != var9) {
                     return;
                  }
               }

               var9 = new pg();
               var9.ap = var1;
               var9.aw = -337662112 * var4;
               var9.ak = var5;
               if (var6) {
                  this.am.ak(var9, var7);
                  this.at += -1678521507;
               } else {
                  this.ao.ap(var9);
                  this.af.ak(var9, var7);
                  this.ar += 537636233;
               }

            }
         }
      }
   }

   public pk() {
      try {
         super();
         this.as = 0;
         this.am = new ud(4096);
         this.at = 0;
         this.au = new ud(32);
         this.an = 0;
         this.ao = new pm();
         this.af = new ud(4096);
         this.ar = 0;
         this.ab = new ud(4096);
         this.az = 0;
         this.ac = new vl(8);
         this.ax = 0;
         this.al = new CRC32();
         this.ah = new or[256];
         this.bh = 1377859845;
         this.bj = -613115775;
         this.bv = 0;
         this.bx = 0;
         this.bk = 0;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "pk.<init>(" + ')');
      }
   }

   void al(int var1, int var2) {
      long var3 = (long)((var1 << 16) + var2);
      pg var5 = (pg)this.af.ap(var3);
      if (var5 != null) {
         this.ao.aw(var5);
      }
   }

   void aa(int var1, int var2) {
      long var3 = (long)((var1 << 16) + var2);
      pg var5 = (pg)this.af.ap(var3);
      if (var5 != null) {
         this.ao.aw(var5);
      }
   }

   int ah(int var1, int var2) {
      long var3 = (long)((var1 << 16) + var2);
      return this.ad != null && this.ad.ht == var3 ? 1 + this.av.am * 262198191 / (this.av.ae.length - this.ad.ak) : 0;
   }

   public int am(boolean var1, boolean var2, byte var3) {
      try {
         int var4 = 0;
         if (var1) {
            if (var3 == 8) {
               throw new IllegalStateException();
            }

            var4 += 966864885 * this.at + this.an * 537068201;
         }

         if (var2) {
            if (var3 == 8) {
               throw new IllegalStateException();
            }

            var4 += -326104939 * this.az + 1325717689 * this.ar;
         }

         return var4;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "pk.am(" + ')');
      }
   }

   public int bj(boolean var1, boolean var2) {
      int var3 = 0;
      if (var1) {
         var3 += 966864885 * this.at + this.an * 537068201;
      }

      if (var2) {
         var3 += -326104939 * this.az + 1325717689 * this.ar;
      }

      return var3;
   }

   public int bv(boolean var1, boolean var2) {
      int var3 = 0;
      if (var1) {
         var3 += 966864885 * this.at + this.an * 537068201;
      }

      if (var2) {
         var3 += -326104939 * this.az + 1325717689 * this.ar;
      }

      return var3;
   }

   public int bx(boolean var1, boolean var2) {
      int var3 = 0;
      if (var1) {
         var3 += -2141786652 * this.at + this.an * 1868558153;
      }

      if (var2) {
         var3 += -326104939 * this.az + 1325717689 * this.ar;
      }

      return var3;
   }

   public void bk() {
      if (null != this.ay) {
         try {
            this.ay.as(-1214087286);
         } catch (Exception var2) {
         }

         this.ay = null;
      }

   }

   public boolean au() {
      long var1 = ck.ap(-1303800817);
      int var3 = (int)(var1 - -8413539928166424643L * this.ae);
      this.ae = var1 * -5064212142047521899L;
      if (var3 > 1258679070) {
         var3 = -1858452443;
      }

      this.as += var3 * 1502696997;
      if (1998616214 * this.az == 0 && this.an * 537068201 == 0 && 1817945791 * this.ar == 0 && this.at * 966864885 == 0) {
         return true;
      } else if (this.ay == null) {
         return false;
      } else {
         try {
            if (478325414 * this.as > 30000) {
               throw new IOException();
            } else {
               pg var4;
               vl var5;
               while(this.an * 1837843312 < 1422178967 && this.at * -1545731114 > 0) {
                  var4 = (pg)this.am.aj();
                  var5 = new vl(4);
                  var5.bo(1, -1960653842);
                  var5.ba((int)var4.ht, -957507678);
                  this.ay.ay(var5.ae, 0, 4, 1457214877);
                  this.au.ak(var4, var4.ht);
                  this.at -= 1452459101;
                  this.an += -1386083601;
               }

               while(this.az * -326104939 < 847459770 && this.ar * 1175669733 > 0) {
                  var4 = (pg)this.ao.ak();
                  var5 = new vl(4);
                  var5.bo(0, 818136316);
                  var5.ba((int)var4.ht, 61546758);
                  this.ay.ay(var5.ae, 0, 4, 1981488831);
                  var4.kg();
                  this.ab.ak(var4, var4.ht);
                  this.ar -= -1146308599;
                  this.az += 1116372112;
               }

               for(int var19 = 0; var19 < -1934938673; ++var19) {
                  int var20 = this.ay.ak((byte)4);
                  if (var20 < 0) {
                     throw new IOException();
                  }

                  if (var20 == 0) {
                     break;
                  }

                  this.as = 0;
                  byte var6 = 0;
                  if (this.ad == null) {
                     var6 = 8;
                  } else if (this.ax * -322852667 == 0) {
                     var6 = 1;
                  }

                  int var7;
                  int var8;
                  int var9;
                  byte[] var10000;
                  int var10001;
                  vl var22;
                  if (var6 > 0) {
                     var7 = var6 - this.ac.am * -1689308347;
                     if (var7 > var20) {
                        var7 = var20;
                     }

                     this.ay.ai(this.ac.ae, this.ac.am * 1802457656, var7, 744788523);
                     if (0 != this.bv) {
                        for(var8 = 0; var8 < var7; ++var8) {
                           var10000 = this.ac.ae;
                           var10001 = this.ac.am * -1689308347 + var8;
                           var10000[var10001] ^= this.bv;
                        }
                     }

                     var22 = this.ac;
                     var22.am += 1466081240 * var7;
                     if (1988075191 * this.ac.am < var6) {
                        break;
                     }

                     if (this.ad == null) {
                        this.ac.am = 0;
                        var8 = this.ac.cy((short)-7580);
                        var9 = this.ac.ce(1416284865);
                        int var10 = this.ac.cy((short)-11906);
                        int var11 = this.ac.ch(1203709469);
                        long var12 = (long)((var8 << 16) + var9);
                        pg var14 = (pg)this.au.ap(var12);
                        this.ag = true;
                        if (var14 == null) {
                           var14 = (pg)this.ab.ap(var12);
                           this.ag = false;
                        }

                        if (var14 == null) {
                           throw new IOException();
                        }

                        int var15 = 0 == var10 ? 5 : 9;
                        this.ad = var14;
                        this.av = new vl(var11 + var15 + this.ad.ak);
                        this.av.bo(var10, 27213197);
                        this.av.bw(var11, (byte)61);
                        this.ax = 1423749224;
                        this.ac.am = 0;
                     } else if (0 == -252204823 * this.ax) {
                        if (-1 == this.ac.ae[0]) {
                           this.ax = -1695014501;
                           this.ac.am = 0;
                        } else {
                           this.ad = null;
                        }
                     }
                  } else {
                     var7 = this.av.ae.length - this.ad.ak;
                     var8 = 1298718982 - -2031394245 * this.ax;
                     if (var8 > var7 - this.av.am * -1689308347) {
                        var8 = var7 - -351890 * this.av.am;
                     }

                     if (var8 > var20) {
                        var8 = var20;
                     }

                     this.ay.ai(this.av.ae, -1689308347 * this.av.am, var8, -1234188705);
                     if (0 != this.bv) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           var10000 = this.av.ae;
                           var10001 = var9 + this.av.am * -1689308347;
                           var10000[var10001] ^= this.bv;
                        }
                     }

                     var22 = this.av;
                     var22.am += var8 * -725588083;
                     this.ax += var8 * 714839565;
                     if (var7 == this.av.am * -362187536) {
                        if (this.ad.ht == 16711935L) {
                           this.aa = this.av;

                           for(var9 = 0; var9 < 256; ++var9) {
                              or var21 = this.ah[var9];
                              if (var21 != null) {
                                 this.ai(var21, var9, -1944167948);
                              }
                           }
                        } else {
                           this.al.reset();
                           this.al.update(this.av.ae, 0, var7);
                           var9 = (int)this.al.getValue();
                           if (-543781559 * this.ad.aw != var9) {
                              try {
                                 this.ay.as(-215997554);
                              } catch (Exception var17) {
                              }

                              this.bx += -1210422534;
                              this.ay = null;
                              this.bv = (byte)((int)(Math.random() * 255.0D + 1.0D));
                              return false;
                           }

                           this.bx = 0;
                           this.bk = 0;
                           this.ad.ap.as((int)(this.ad.ht & 65535L), this.av.ae, 16711680L == (this.ad.ht & 16711680L), this.ag, (byte)111);
                        }

                        this.ad.kf();
                        if (this.ag) {
                           this.an -= 952202699;
                        } else {
                           this.az -= -157908291;
                        }

                        this.ax = 0;
                        this.ad = null;
                        this.av = null;
                     } else {
                        if (1388085608 != this.ax * -322852667) {
                           break;
                        }

                        this.ax = 0;
                     }
                  }
               }

               return true;
            }
         } catch (IOException var18) {
            try {
               this.ay.as(1687008116);
            } catch (Exception var16) {
            }

            this.bk += -464782815;
            this.ay = null;
            return false;
         }
      }
   }
}
