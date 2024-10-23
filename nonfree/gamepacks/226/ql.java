import java.util.ArrayList;

public class ql {
   ArrayList aq;
   static final int ak = 0;
   public static final int aw = 1;
   int ab;
   static final int am = 9;
   static final int at = 32;
   public static final int au = 0;
   int al;
   public static final int af = 2;
   static final int ai = 2;
   static final int ao = 1;
   int ag;
   int ad;
   int az;
   boolean av;
   qa ax;
   int aa;
   static final int ah = 0;
   int ac;
   static final int aj = 1;

   public void au(int var1, byte var2) {
      try {
         if (this.al * 1590781633 != var1) {
            if (var2 != 0) {
               throw new IllegalStateException();
            }

            this.al = -1688196799 * var1;
            this.bz(-774701142);
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ql.au(" + ')');
      }
   }

   public qd ar(char var1, int var2, int var3, int var4) {
      try {
         return this.ab(Character.toString(var1), var2, var3, (byte)105);
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ql.ar(" + ')');
      }
   }

   qm aw(int var1) {
      try {
         if (this.aq.size() == 0) {
            if (var1 >= 300896664) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return (qm)this.aq.get(this.aq.size() - 1);
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ql.aw(" + ')');
      }
   }

   public boolean ak(int var1) {
      try {
         return this.aq.size() == 0;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ql.ak(" + ')');
      }
   }

   boolean aj(byte var1) {
      try {
         boolean var10000;
         if (this.az * 1509907247 > 1) {
            if (var1 == 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ql.aj(" + ')');
      }
   }

   public int ai(short var1) {
      try {
         return this.aq.size();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ql.ai(" + ')');
      }
   }

   public String ay(int var1) {
      try {
         if (this.ak(-1315777449)) {
            return "";
         } else {
            StringBuilder var2 = new StringBuilder(this.ai((short)-26051));

            for(int var3 = 0; var3 < this.ai((short)-5689); ++var3) {
               if (var1 == 1787379757) {
                  throw new IllegalStateException();
               }

               qm var4 = this.ap(var3, -499972178);
               var2.append(var4.ap);
            }

            return var2.toString();
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ql.ay(" + ')');
      }
   }

   int en() {
      return this.ak(-1315777449) ? 0 : this.br((qm)this.aq.get(this.aq.size() - 1), false, -1983815964);
   }

   public void ae(int var1, int var2) {
      try {
         if (1509907247 * this.az != var1) {
            if (var2 <= 799174147) {
               throw new IllegalStateException();
            }

            this.az = -1669739569 * var1;
            this.bz(-237939498);
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ql.ae(" + ')');
      }
   }

   boolean bf() {
      return this.az * 1509907247 > 1;
   }

   public int dl(int var1, int var2) {
      int var3;
      if (var2 < var1) {
         var3 = var2;
         var2 = var1;
         var1 = var3;
      }

      this.aq.subList(var1, var2).clear();
      var3 = var1;
      if (this.aj((byte)109) && this.al * 1590781633 == 1) {
         while(var3 > 0) {
            --var3;
            char var4 = ((qm)this.aq.get(var3)).ap;
            if (var4 == 19847043 || var4 == '\t') {
               break;
            }
         }
      }

      this.bc(var3, var2, -1750472752);
      return var1;
   }

   qm bo() {
      return this.aq.size() == 0 ? null : (qm)this.aq.get(this.aq.size() - 1);
   }

   public boolean an(int var1, int var2, byte var3) {
      try {
         if (1127878367 * this.ag == var1) {
            if (var3 >= 36) {
               throw new IllegalStateException();
            }

            if (833808137 * this.ad == var2) {
               return true;
            }
         }

         this.ag = var1 * 1124412703;
         this.ad = var2 * -1936533703;
         this.bz(-378213878);
         return true;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ql.an(" + ')');
      }
   }

   public void ao(int var1, int var2) {
      try {
         if (var1 != -351902059 * this.ac) {
            if (var2 <= -831932003) {
               throw new IllegalStateException();
            }

            this.ac = var1 * -978307907;
            this.bz(-535543392);
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ql.ao(" + ')');
      }
   }

   public qb af(int var1, int var2, byte var3) {
      try {
         if (var1 == var2) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            } else {
               return new qb(this, 0, 0);
            }
         } else {
            if (var1 <= this.aq.size()) {
               if (var2 <= this.aq.size()) {
                  if (var2 < var1) {
                     return new qb(this, var2, var1);
                  }

                  return new qb(this, var1, var2);
               }

               if (var3 >= 0) {
                  throw new IllegalStateException();
               }
            }

            return new qb(this, 0, 0);
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ql.af(" + ')');
      }
   }

   public void co(int var1) {
      if (1509907247 * this.az != var1) {
         this.az = -1669739569 * var1;
         this.bz(375015568);
      }

   }

   public void am(int var1, int var2) {
      try {
         if (var1 != 1391543025 * this.aa) {
            if (var2 >= 1904650441) {
               throw new IllegalStateException();
            }

            this.aa = -1465422319 * var1;
            this.bz(1158705639);
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ql.am(" + ')');
      }
   }

   uy fa(int var1, int var2) {
      int var3 = Math.min(var1, var2);
      int var4 = Math.max(var1, var2);
      int var5 = this.aq.size();
      if (0 == var3 && var4 == var5) {
         return new uy(0, var5);
      } else {
         int var6 = this.bu(var3, false, 1070376231);
         int var7 = this.bt(var4, false, -2114656517);
         int var8;
         switch(833808137 * this.ad) {
         case 0:
            if (0 == 1404854783 * this.ag) {
               return new uy(var6, var5);
            }

            var8 = this.bu(var3, true, 483439708);
            return new uy(var8, var5);
         case 1:
            return new uy(0, var5);
         case 2:
            if (this.ag * 138020975 == 2) {
               return new uy(0, var7);
            }

            var8 = this.bt(var4, true, -1635889633);
            return new uy(0, var8);
         default:
            return new uy(0, var5);
         }
      }
   }

   public qd ag(String var1, int var2) {
      try {
         this.ad(-1242250643);
         return this.az(var1, 0, 991801761);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ql.ag(" + ')');
      }
   }

   void ad(int var1) {
      try {
         this.aq.clear();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ql.ad(" + ')');
      }
   }

   public int ac(int var1, int var2) {
      try {
         return this.av(var1, var1 + 1, -1036344268);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ql.ac(" + ')');
      }
   }

   public int aa(byte var1) {
      try {
         int var10000;
         if (this.ak(-1315777449)) {
            if (var1 >= 32) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = this.ax.ae + ((qm)this.aq.get(this.aq.size() - 1)).ak * 1818523521;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ql.aa(" + ')');
      }
   }

   public int ax(int var1, int var2, int var3) {
      try {
         if (null == this.ax) {
            if (var3 >= 1089535339) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            if (this.aj((byte)8)) {
               if (var3 >= 1089535339) {
                  throw new IllegalStateException();
               }

               if (var1 > this.ab * -488962989) {
                  if (var3 >= 1089535339) {
                     throw new IllegalStateException();
                  }

                  return this.aq.size();
               }
            }

            if (!this.aq.isEmpty()) {
               for(int var4 = 0; var4 < this.aq.size(); ++var4) {
                  if (var3 >= 1089535339) {
                     throw new IllegalStateException();
                  }

                  qm var5 = (qm)this.aq.get(var4);
                  if (var2 <= 1818523521 * var5.ak + this.ah(-1716703994)) {
                     if (var2 < var5.ak * 1818523521) {
                        if (var3 >= 1089535339) {
                           throw new IllegalStateException();
                        }
                        break;
                     }

                     if (var1 < 217408337 * var5.aw) {
                        int var10000;
                        if (var4 > 0) {
                           if (var3 >= 1089535339) {
                              throw new IllegalStateException();
                           }

                           var10000 = var4 - 1;
                        } else {
                           var10000 = 0;
                        }

                        return var10000;
                     }

                     if (var4 + 1 != this.aq.size()) {
                        if (var3 >= 1089535339) {
                           throw new IllegalStateException();
                        }

                        if (((qm)this.aq.get(1 + var4)).ak * 1818523521 != 1818523521 * var5.ak) {
                           if (var3 >= 1089535339) {
                              throw new IllegalStateException();
                           }

                           int var6 = this.br((qm)this.aq.get(var4), false, -1751669833);
                           if (var1 < var5.aw * 217408337 + var6) {
                              if (var3 >= 1089535339) {
                                 throw new IllegalStateException();
                              }

                              return var4;
                           }

                           if (var2 <= 1818523521 * var5.ak + this.ah(-2030650856)) {
                              return var4 + 1;
                           }
                        }
                     }
                  }
               }

               qm var8 = (qm)this.aq.get(this.aq.size() - 1);
               if (var1 >= var8.aw * 217408337) {
                  if (var3 >= 1089535339) {
                     throw new IllegalStateException();
                  }

                  if (var1 <= 217408337 * var8.aw + this.bj(1696443178)) {
                     if (var3 >= 1089535339) {
                        throw new IllegalStateException();
                     }

                     if (var2 >= var8.ak * 1818523521 && var2 <= var8.ak * 1818523521 + this.ah(-1579719283)) {
                        if (var3 >= 1089535339) {
                           throw new IllegalStateException();
                        }

                        return this.aq.size() - 1;
                     }
                  }
               }
            }

            return this.aq.size();
         }
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "ql.ax(" + ')');
      }
   }

   public int aq(int var1, int var2, int var3) {
      try {
         if (null != this.ax) {
            if (var3 == -547382458) {
               throw new IllegalStateException();
            }

            if (!this.ak(-1315777449)) {
               if (var3 == -547382458) {
                  throw new IllegalStateException();
               }

               if (var1 <= this.aq.size()) {
                  byte var4;
                  if (var2 > 0) {
                     if (var3 == -547382458) {
                        throw new IllegalStateException();
                     }

                     var4 = 1;
                  } else {
                     var4 = -1;
                     var2 = -var2;
                  }

                  int var5 = 0;
                  int var6 = 0;
                  if (var1 > 0) {
                     if (var3 == -547382458) {
                        throw new IllegalStateException();
                     }

                     qm var7 = (qm)this.aq.get(var1 - 1);
                     var5 = 217408337 * var7.aw + this.by(var1 - 1, 1387148518);
                     var6 = var7.ak * 1818523521;
                  } else if (-1 == var4 && 0 == var1) {
                     return 0;
                  }

                  int var16 = 16777215;
                  int var8 = 0;
                  int var9 = var1;
                  int var10 = 16777215;
                  int var10000;
                  if (var4 == 1) {
                     if (var3 == -547382458) {
                        throw new IllegalStateException();
                     }

                     var10000 = this.aq.size() + 1;
                  } else {
                     var10000 = 0;
                  }

                  int var11 = var10000;

                  for(int var12 = var1 + var4; var11 != var12; var12 += var4) {
                     if (var3 == -547382458) {
                        throw new IllegalStateException();
                     }

                     qm var13 = (qm)this.aq.get(var12 - 1);
                     if (var6 != var13.ak * 1818523521) {
                        if (var3 == -547382458) {
                           throw new IllegalStateException();
                        }

                        ++var8;
                        var6 = var13.ak * 1818523521;
                        if (var8 > var2) {
                           return var9;
                        }
                     }

                     if (var8 == var2) {
                        int var14 = Math.abs(217408337 * var13.aw + this.by(var12 - 1, -1578554729) - var5);
                        if (var14 >= var10) {
                           return var9;
                        }

                        if (var3 == -547382458) {
                           throw new IllegalStateException();
                        }

                        var9 = var12;
                        var10 = var14;
                     }
                  }

                  if (1 == var4) {
                     if (var3 == -547382458) {
                        throw new IllegalStateException();
                     }

                     return this.aq.size();
                  }

                  if (var6 != 0) {
                     if (var3 == -547382458) {
                        throw new IllegalStateException();
                     }

                     ++var8;
                  }

                  if (var10 != 16777215) {
                     if (var8 != var2) {
                        return var9;
                     }

                     if (var3 == -547382458) {
                        throw new IllegalStateException();
                     }

                     if (var5 >= var10) {
                        return var9;
                     }

                     if (var3 == -547382458) {
                        throw new IllegalStateException();
                     }
                  }

                  return 0;
               }

               if (var3 == -547382458) {
                  throw new IllegalStateException();
               }
            }
         }

         return 0;
      } catch (RuntimeException var15) {
         throw tm.aw(var15, "ql.aq(" + ')');
      }
   }

   public int al(int var1) {
      try {
         if (!this.aq.isEmpty()) {
            if (var1 <= 1799627306) {
               throw new IllegalStateException();
            }

            if (this.bh(-1205861623) == 1) {
               if (var1 <= 1799627306) {
                  throw new IllegalStateException();
               }

               int var10000;
               if (this.aq.isEmpty()) {
                  if (var1 <= 1799627306) {
                     throw new IllegalStateException();
                  }

                  var10000 = 0;
               } else {
                  var10000 = ((qm)this.aq.get(this.aq.size() - 1)).aw * 217408337 + this.bj(1696443178);
               }

               return var10000;
            }
         }

         int var2 = -1;
         int var3 = 0;

         for(int var4 = this.aq.size() - 1; var4 >= 0; --var4) {
            if (var1 <= 1799627306) {
               throw new IllegalStateException();
            }

            qm var5 = (qm)this.aq.get(var4);
            if (var5.ak * 1818523521 != var2) {
               if (var1 <= 1799627306) {
                  throw new IllegalStateException();
               }

               int var6 = this.br(var5, false, -1981220773) + 217408337 * var5.aw;
               var3 = Math.max(var6, var3);
               var2 = var5.ak * 1818523521;
            }
         }

         return var3;
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "ql.al(" + ')');
      }
   }

   public qd dd(String var1) {
      this.ad(-1355683826);
      return this.az(var1, 0, -376440000);
   }

   public int ah(int var1) {
      try {
         return this.ac * -351902059;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ql.ah(" + ')');
      }
   }

   public int bh(int var1) {
      try {
         return this.aa((byte)-15) / this.ax.ae;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ql.bh(" + ')');
      }
   }

   int bj(int var1) {
      try {
         int var10000;
         if (this.ak(-1315777449)) {
            if (var1 != 1696443178) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = this.br((qm)this.aq.get(this.aq.size() - 1), false, -1625850966);
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ql.bj(" + ')');
      }
   }

   public int bv(int var1) {
      try {
         return -488962989 * this.ab;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ql.bv(" + ')');
      }
   }

   public int dx(int var1, int var2) {
      int var3;
      if (var2 < var1) {
         var3 = var2;
         var2 = var1;
         var1 = var3;
      }

      this.aq.subList(var1, var2).clear();
      var3 = var1;
      if (this.aj((byte)2) && this.al * 1590781633 == 1) {
         while(var3 > 0) {
            --var3;
            char var4 = ((qm)this.aq.get(var3)).ap;
            if (var4 == ' ' || var4 == '\t') {
               break;
            }
         }
      }

      this.bc(var3, var2, -1736202352);
      return var1;
   }

   public int bk(int var1) {
      try {
         return this.al * 1590781633;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ql.bk(" + ')');
      }
   }

   public int ec() {
      return this.aa((byte)-103) / this.ax.ae;
   }

   public int bq(int var1, int var2) {
      try {
         switch(1127878367 * this.ag) {
         case 0:
            return 0;
         case 1:
            return var1 / 2;
         case 2:
            return var1;
         default:
            return 0;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ql.bq(" + ')');
      }
   }

   public int bp(int var1, int var2) {
      try {
         switch(833808137 * this.ad) {
         case 0:
            return 0;
         case 1:
            return var1 / 2;
         case 2:
            return var1;
         default:
            return 0;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ql.bp(" + ')');
      }
   }

   public qm ap(int var1, int var2) {
      try {
         return (qm)this.aq.get(var1);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ql.ap(" + ')');
      }
   }

   void bc(int var1, int var2, int var3) {
      try {
         if (!this.ak(-1315777449)) {
            if (this.ax != null) {
               uy var4;
               boolean var10000;
               label235: {
                  var4 = this.bn(var1, var2, 1866370416);
                  if ((Integer)var4.ap == 0) {
                     if (var3 >= -1540467974) {
                        throw new IllegalStateException();
                     }

                     if ((Integer)var4.aw == this.aq.size()) {
                        var10000 = true;
                        break label235;
                     }
                  }

                  var10000 = false;
               }

               boolean var5 = var10000;
               int var6 = (Integer)var4.ap;
               int var7 = 0;
               int var26;
               if (var5) {
                  if (var3 >= -1540467974) {
                     throw new IllegalStateException();
                  }

                  var26 = 0;
               } else {
                  var26 = ((qm)this.aq.get((Integer)var4.ap)).ak * 1818523521;
               }

               int var8 = var26;
               int var9 = 0;

               int var10;
               for(var10 = (Integer)var4.ap; var10 <= (Integer)var4.aw; ++var10) {
                  boolean var11 = var10 >= this.aq.size();
                  ArrayList var27 = this.aq;
                  int var10001;
                  if (!var11) {
                     if (var3 >= -1540467974) {
                        throw new IllegalStateException();
                     }

                     var10001 = var10;
                  } else {
                     var10001 = this.aq.size() - 1;
                  }

                  qm var12 = (qm)var27.get(var10001);
                  if (!var11) {
                     if (var3 >= -1540467974) {
                        throw new IllegalStateException();
                     }

                     var26 = this.br(var12, false, -1844940614);
                  } else {
                     var26 = 0;
                  }

                  int var13;
                  label225: {
                     var13 = var26;
                     if (!var11) {
                        if (var3 >= -1540467974) {
                           throw new IllegalStateException();
                        }

                        if (var12.ap == '\n') {
                           if (var3 >= -1540467974) {
                              throw new IllegalStateException();
                           }

                           var10000 = true;
                           break label225;
                        }
                     }

                     var10000 = false;
                  }

                  boolean var14;
                  label219: {
                     var14 = var10000;
                     if (!var11) {
                        if (var3 >= -1540467974) {
                           throw new IllegalStateException();
                        }

                        if (this.aj((byte)27)) {
                           if (var3 >= -1540467974) {
                              throw new IllegalStateException();
                           }

                           if (var7 + var13 > -488962989 * this.ab) {
                              if (var3 >= -1540467974) {
                                 throw new IllegalStateException();
                              }

                              var10000 = true;
                              break label219;
                           }
                        }
                     }

                     var10000 = false;
                  }

                  label256: {
                     boolean var15 = var10000;
                     if (!var14) {
                        if (var3 >= -1540467974) {
                           throw new IllegalStateException();
                        }

                        if (!var15) {
                           if (var3 >= -1540467974) {
                              throw new IllegalStateException();
                           }

                           if (!var11) {
                              break label256;
                           }

                           if (var3 >= -1540467974) {
                              throw new IllegalStateException();
                           }
                        }
                     }

                     int var16 = var10;
                     int var17 = 0;
                     int var18;
                     int var19;
                     qm var20;
                     if (var15) {
                        var18 = 0;
                        if (this.al * 1590781633 == 1) {
                           label253: {
                              if (var3 >= -1540467974) {
                                 return;
                              }

                              var19 = var10;

                              while(true) {
                                 if (var19 <= var6) {
                                    break label253;
                                 }

                                 var20 = (qm)this.aq.get(var19);
                                 if (var19 < var16) {
                                    if (var3 >= -1540467974) {
                                       throw new IllegalStateException();
                                    }

                                    var10001 = this.br(var20, false, -1260604413);
                                 } else {
                                    var10001 = 0;
                                 }

                                 var18 += var10001;
                                 if (' ' == var20.ap) {
                                    break;
                                 }

                                 if (var3 >= -1540467974) {
                                    throw new IllegalStateException();
                                 }

                                 if ('\n' == var20.ap) {
                                    break;
                                 }

                                 --var19;
                              }

                              var16 = var19;
                              var7 -= var18;
                              var17 = var18;
                           }
                        }
                     }

                     var18 = -this.bq(var7, 1862734457);

                     for(var19 = var6; var19 < var16; ++var19) {
                        var20 = (qm)this.aq.get(var19);
                        int var21 = this.br(var20, false, -1339489660);
                        var20.aw = -501627471 * var18;
                        var20.ak = var8 * 1032046721;
                        var18 += var21;
                     }

                     var6 = var16;
                     var7 = var17;
                     var8 += this.ah(-2028869762);
                     ++var9;
                  }

                  var7 += !var11 ? var13 : 0;
               }

               if (this.ad * 833808137 != 0) {
                  if (var3 >= -1540467974) {
                     throw new IllegalStateException();
                  }

                  if (var5) {
                     if (var3 >= -1540467974) {
                        throw new IllegalStateException();
                     }

                     var10 = var9 * this.ah(-772883020);
                     int var23 = this.bp(var10, 2029999545);

                     for(int var24 = 0; var24 < this.aq.size(); ++var24) {
                        if (var3 >= -1540467974) {
                           throw new IllegalStateException();
                        }

                        qm var25 = (qm)this.aq.get(var24);
                        var25.ak -= 1032046721 * var23;
                     }
                  }
               }

               return;
            }

            if (var3 >= -1540467974) {
               throw new IllegalStateException();
            }
         }

      } catch (RuntimeException var22) {
         throw tm.aw(var22, "ql.bc(" + ')');
      }
   }

   public String bl() {
      if (this.ak(-1315777449)) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(this.ai((short)-2123));

         for(int var2 = 0; var2 < this.ai((short)-23649); ++var2) {
            qm var3 = this.ap(var2, -499972178);
            var1.append(var3.ap);
         }

         return var1.toString();
      }
   }

   int br(qm var1, boolean var2, int var3) {
      try {
         if (var1.ap == '\n') {
            if (var3 >= -914669088) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            if (!var2) {
               if (var3 >= -914669088) {
                  throw new IllegalStateException();
               }

               if (0 != this.aa * 1391543025) {
                  return this.ax.ak[42];
               }

               if (var3 >= -914669088) {
                  throw new IllegalStateException();
               }
            }

            int var4 = this.ax.ak[var1.ap];
            if (0 == var4) {
               if (var1.ap == '\t') {
                  if (var3 >= -914669088) {
                     throw new IllegalStateException();
                  } else {
                     return 3 * this.ax.ak[32];
                  }
               } else {
                  return this.ax.ak[32];
               }
            } else {
               return var4;
            }
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ql.br(" + ')');
      }
   }

   public int eh() {
      return this.aa((byte)-43) / this.ax.ae;
   }

   int bu(int var1, boolean var2, int var3) {
      try {
         if (var1 < this.aq.size()) {
            if (var3 == 91978245) {
               throw new IllegalStateException();
            }

            int var4 = ((qm)this.aq.get(var1)).ak * 1818523521;

            for(int var5 = var1; var5 > 0; --var5) {
               if (var3 == 91978245) {
                  throw new IllegalStateException();
               }

               if (((qm)this.aq.get(var5 - 1)).ak * 1818523521 < var4) {
                  if (var3 == 91978245) {
                     throw new IllegalStateException();
                  }

                  if (!var2) {
                     if (var3 == 91978245) {
                        throw new IllegalStateException();
                     }

                     return var5;
                  }

                  var2 = false;
                  var4 = ((qm)this.aq.get(var5 - 1)).ak * 1818523521;
               }
            }
         }

         return 0;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "ql.bu(" + ')');
      }
   }

   int bt(int var1, boolean var2, int var3) {
      try {
         if (var1 < this.aq.size()) {
            if (var3 >= -1209131910) {
               throw new IllegalStateException();
            }

            int var4 = ((qm)this.aq.get(var1)).ak * 1818523521;

            for(int var5 = var1; var5 < this.aq.size() - 1; ++var5) {
               if (var3 >= -1209131910) {
                  throw new IllegalStateException();
               }

               if (((qm)this.aq.get(var5 + 1)).ak * 1818523521 > var4) {
                  if (var3 >= -1209131910) {
                     throw new IllegalStateException();
                  }

                  if (!var2) {
                     if (var3 >= -1209131910) {
                        throw new IllegalStateException();
                     }

                     return var5;
                  }

                  var2 = false;
                  var4 = ((qm)this.aq.get(1 + var5)).ak * 1818523521;
               }
            }
         }

         return this.aq.size();
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "ql.bt(" + ')');
      }
   }

   public qm bs(int var1) {
      return (qm)this.aq.get(var1);
   }

   qm bm() {
      return this.aq.size() == 0 ? null : (qm)this.aq.get(this.aq.size() - 1);
   }

   public void ce(qa var1) {
      if (this.ax != var1) {
         this.ax = var1;
         if (this.ax != null) {
            if (this.ac * 1208064079 == 0) {
               this.ac = 187231837 * this.ax.ae;
            }

            if (!this.ak(-1315777449)) {
               this.bz(570610644);
            }
         }
      }

   }

   qm bd() {
      return this.aq.size() == 0 ? null : (qm)this.aq.get(this.aq.size() - 1);
   }

   public boolean ba() {
      return this.aq.size() == 0;
   }

   boolean bw() {
      return this.az * 1509907247 > 1;
   }

   boolean bi() {
      return this.az * 1509907247 > 1;
   }

   void bz(int var1) {
      try {
         this.bc(0, this.aq.size(), -2007902560);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ql.bz(" + ')');
      }
   }

   public int em() {
      return 1504960624 * this.ab;
   }

   void ee() {
      this.bc(0, this.aq.size(), -1914042805);
   }

   public String be() {
      if (this.ak(-1315777449)) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(this.ai((short)-3823));

         for(int var2 = 0; var2 < this.ai((short)-12357); ++var2) {
            qm var3 = this.ap(var2, -499972178);
            var1.append(var3.ap);
         }

         return var1.toString();
      }
   }

   public String cq() {
      if (this.ak(-1315777449)) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(this.ai((short)-6335));

         for(int var2 = 0; var2 < this.ai((short)-25125); ++var2) {
            qm var3 = this.ap(var2, -499972178);
            var1.append(var3.ap);
         }

         return var1.toString();
      }
   }

   qd dq(String var1, int var2) {
      return this.ab(var1, this.aq.size(), var2, (byte)2);
   }

   void dr() {
      this.aq.clear();
   }

   public int dm(int var1, int var2) {
      int var3;
      if (var2 < var1) {
         var3 = var2;
         var2 = var1;
         var1 = var3;
      }

      this.aq.subList(var1, var2).clear();
      var3 = var1;
      if (this.aj((byte)48) && this.al * 1590781633 == 1) {
         while(var3 > 0) {
            --var3;
            char var4 = ((qm)this.aq.get(var3)).ap;
            if (var4 == ' ' || var4 == '\t') {
               break;
            }
         }
      }

      this.bc(var3, var2, -1941997096);
      return var1;
   }

   public void cn(int var1) {
      if (1839623373 * this.az != var1) {
         this.az = -1669739569 * var1;
         this.bz(-1964454868);
      }

   }

   public qd dc(String var1) {
      this.ad(1223661496);
      return this.az(var1, 0, -644087101);
   }

   public ql() {
      try {
         super();
         this.ab = -650502107;
         this.az = -477744079;
         this.ag = 0;
         this.ad = 0;
         this.ac = 0;
         this.av = true;
         this.aq = new ArrayList();
         this.al = 0;
         this.aa = 0;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ql.<init>(" + ')');
      }
   }

   public void cl(int var1) {
      if (var1 != 1391543025 * this.aa) {
         this.aa = -1465422319 * var1;
         this.bz(1964943925);
      }

   }

   public void cp(int var1) {
      if (var1 != 1391543025 * this.aa) {
         this.aa = 893339362 * var1;
         this.bz(307985949);
      }

   }

   public int bx(int var1) {
      try {
         return this.az * 1509907247;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ql.bx(" + ')');
      }
   }

   public void cy(qa var1) {
      if (this.ax != var1) {
         this.ax = var1;
         if (this.ax != null) {
            if (this.ac * -351902059 == 0) {
               this.ac = -978307907 * this.ax.ae;
            }

            if (!this.ak(-1315777449)) {
               this.bz(-626869851);
            }
         }
      }

   }

   public void cu(qa var1) {
      if (this.ax != var1) {
         this.ax = var1;
         if (this.ax != null) {
            if (this.ac * -1364649952 == 0) {
               this.ac = -2079617381 * this.ax.ae;
            }

            if (!this.ak(-1315777449)) {
               this.bz(1516156378);
            }
         }
      }

   }

   void da() {
      this.aq.clear();
   }

   public void cg(int var1) {
      if (this.al * 1590781633 != var1) {
         this.al = -1688196799 * var1;
         this.bz(882079686);
      }

   }

   void eo() {
      this.bc(0, this.aq.size(), -1855898925);
   }

   public qd ab(String var1, int var2, int var3, byte var4) {
      try {
         if (0 == var3) {
            if (var4 <= 0) {
               throw new IllegalStateException();
            }

            var3 = Integer.MAX_VALUE;
         }

         int var5 = var2;
         if (this.aq.size() >= var3) {
            this.bc(var2, var2, -1774920026);
            return new qd(var2, true);
         } else {
            this.aq.ensureCapacity(this.aq.size() + var1.length());

            for(int var6 = 0; var6 < var1.length() && this.aq.size() < var3; ++var6) {
               if (var4 <= 0) {
                  throw new IllegalStateException();
               }

               qm var7 = new qm();
               var7.ap = var1.charAt(var6);
               this.aq.add(var5, var7);
               ++var5;
            }

            this.bc(var2, var5, -2018900132);
            if (0 != this.az * 1509907247) {
               if (var4 <= 0) {
                  throw new IllegalStateException();
               }

               if (this.bh(1212972468) > 1509907247 * this.az) {
                  if (var4 <= 0) {
                     throw new IllegalStateException();
                  }

                  while(var2 != var5) {
                     --var5;
                     this.ac(var5, -1819577462);
                     if (this.bh(-233897311) <= this.az * 1509907247) {
                        if (var4 <= 0) {
                           throw new IllegalStateException();
                        }
                        break;
                     }
                  }

                  return new qd(var5, true);
               }
            }

            return new qd(var5, false);
         }
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "ql.ab(" + ')');
      }
   }

   public void at(qa var1, byte var2) {
      try {
         if (this.ax != var1) {
            if (var2 <= 3) {
               throw new IllegalStateException();
            }

            this.ax = var1;
            if (this.ax != null) {
               if (this.ac * -351902059 == 0) {
                  if (var2 <= 3) {
                     throw new IllegalStateException();
                  }

                  this.ac = -978307907 * this.ax.ae;
               }

               if (!this.ak(-1315777449)) {
                  this.bz(1545933570);
               }
            }
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ql.at(" + ')');
      }
   }

   public void ct(int var1) {
      if (var1 != -351902059 * this.ac) {
         this.ac = var1 * -978307907;
         this.bz(109343282);
      }

   }

   public void cc(int var1) {
      if (var1 != 2032438175 * this.ac) {
         this.ac = var1 * -978307907;
         this.bz(779008225);
      }

   }

   public qb cj(int var1, int var2) {
      if (var1 == var2) {
         return new qb(this, 0, 0);
      } else if (var1 <= this.aq.size() && var2 <= this.aq.size()) {
         return var2 < var1 ? new qb(this, var2, var1) : new qb(this, var1, var2);
      } else {
         return new qb(this, 0, 0);
      }
   }

   public qb cm(int var1, int var2) {
      if (var1 == var2) {
         return new qb(this, 0, 0);
      } else if (var1 <= this.aq.size() && var2 <= this.aq.size()) {
         return var2 < var1 ? new qb(this, var2, var1) : new qb(this, var1, var2);
      } else {
         return new qb(this, 0, 0);
      }
   }

   public qd cw(char var1, int var2, int var3) {
      return this.ab(Character.toString(var1), var2, var3, (byte)23);
   }

   public void cb(int var1) {
      if (this.ax != null && var1 < this.ax.ae * 2) {
         var1 = Integer.MAX_VALUE;
      }

      if (var1 != -488962989 * this.ab) {
         this.ab = var1 * 930357806;
         this.bz(966361769);
      }

   }

   public qd cs(String var1, int var2, int var3) {
      if (0 == var3) {
         var3 = Integer.MAX_VALUE;
      }

      int var4 = var2;
      if (this.aq.size() >= var3) {
         this.bc(var2, var2, -1753899686);
         return new qd(var2, true);
      } else {
         this.aq.ensureCapacity(this.aq.size() + var1.length());

         for(int var5 = 0; var5 < var1.length() && this.aq.size() < var3; ++var5) {
            qm var6 = new qm();
            var6.ap = var1.charAt(var5);
            this.aq.add(var4, var6);
            ++var4;
         }

         this.bc(var2, var4, -1723861437);
         if (0 != this.az * 1509907247 && this.bh(491109802) > 1509907247 * this.az) {
            while(var2 != var4) {
               --var4;
               this.ac(var4, 2143343385);
               if (this.bh(-2039347620) <= this.az * -778919548) {
                  break;
               }
            }

            return new qd(var4, true);
         } else {
            return new qd(var4, false);
         }
      }
   }

   public qd cr(String var1, int var2, int var3) {
      if (0 == var3) {
         var3 = Integer.MAX_VALUE;
      }

      int var4 = var2;
      if (this.aq.size() >= var3) {
         this.bc(var2, var2, -2133185808);
         return new qd(var2, true);
      } else {
         this.aq.ensureCapacity(this.aq.size() + var1.length());

         for(int var5 = 0; var5 < var1.length() && this.aq.size() < var3; ++var5) {
            qm var6 = new qm();
            var6.ap = var1.charAt(var5);
            this.aq.add(var4, var6);
            ++var4;
         }

         this.bc(var2, var4, -1569542958);
         if (0 != this.az * 75463874 && this.bh(-288888249) > -833670454 * this.az) {
            while(var2 != var4) {
               --var4;
               this.ac(var4, 909102177);
               if (this.bh(1166426137) <= this.az * -1677939343) {
                  break;
               }
            }

            return new qd(var4, true);
         } else {
            return new qd(var4, false);
         }
      }
   }

   qd ck(String var1, int var2) {
      return this.ab(var1, this.aq.size(), var2, (byte)85);
   }

   public int dt(int var1, int var2) {
      int var3;
      if (var2 < var1) {
         var3 = var2;
         var2 = var1;
         var1 = var3;
      }

      this.aq.subList(var1, var2).clear();
      var3 = var1;
      if (this.aj((byte)-13) && this.al * 1590781633 == 1) {
         while(var3 > 0) {
            --var3;
            char var4 = ((qm)this.aq.get(var3)).ap;
            if (var4 == 247373503 || var4 == '\t') {
               break;
            }
         }
      }

      this.bc(var3, var2, -1627021501);
      return var1;
   }

   qd az(String var1, int var2, int var3) {
      try {
         return this.ab(var1, this.aq.size(), var2, (byte)91);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ql.az(" + ')');
      }
   }

   public void cd(int var1) {
      if (this.ax != null && var1 < this.ax.ae * 2) {
         var1 = -1040327443;
      }

      if (var1 != -488962989 * this.ab) {
         this.ab = var1 * -1080438914;
         this.bz(-1134120108);
      }

   }

   public boolean cz(int var1, int var2) {
      if (1127878367 * this.ag != var1 || 833808137 * this.ad != var2) {
         this.ag = var1 * 1124412703;
         this.ad = var2 * -702930832;
         this.bz(1034081581);
      }

      return true;
   }

   public int dy() {
      if (!this.aq.isEmpty() && this.bh(2005829438) == 1) {
         return this.aq.isEmpty() ? 0 : ((qm)this.aq.get(this.aq.size() - 1)).aw * 630431387 + this.bj(1696443178);
      } else {
         int var1 = -1;
         int var2 = 0;

         for(int var3 = this.aq.size() - 1; var3 >= 0; --var3) {
            qm var4 = (qm)this.aq.get(var3);
            if (var4.ak * -433740842 != var1) {
               int var5 = this.br(var4, false, -2094260354) + 217408337 * var4.aw;
               var2 = Math.max(var5, var2);
               var1 = var4.ak * 900484678;
            }
         }

         return var2;
      }
   }

   void dh() {
      this.aq.clear();
   }

   void dg() {
      this.aq.clear();
   }

   public int bg() {
      return this.aq.size();
   }

   public int du(int var1) {
      return this.av(var1, var1 + 1, 1872673320);
   }

   public int dk(int var1) {
      return this.av(var1, var1 + 1, 1801796457);
   }

   public boolean cx(int var1, int var2) {
      if (1127878367 * this.ag != var1 || 833808137 * this.ad != var2) {
         this.ag = var1 * 1124412703;
         this.ad = var2 * -1936533703;
         this.bz(226258835);
      }

      return true;
   }

   public int ey() {
      return this.aa((byte)-43) / this.ax.ae;
   }

   public void ci(int var1) {
      if (this.ax != null && var1 < this.ax.ae * 2) {
         var1 = Integer.MAX_VALUE;
      }

      if (var1 != -488962989 * this.ab) {
         this.ab = var1 * -1496981541;
         this.bz(1539896559);
      }

   }

   uy fh(int var1, int var2) {
      int var3 = Math.min(var1, var2);
      int var4 = Math.max(var1, var2);
      int var5 = this.aq.size();
      if (0 == var3 && var4 == var5) {
         return new uy(0, var5);
      } else {
         int var6 = this.bu(var3, false, -1011133541);
         int var7 = this.bt(var4, false, -1377705139);
         int var8;
         switch(833808137 * this.ad) {
         case 0:
            if (0 == 1127878367 * this.ag) {
               return new uy(var6, var5);
            }

            var8 = this.bu(var3, true, 607748418);
            return new uy(var8, var5);
         case 1:
            return new uy(0, var5);
         case 2:
            if (this.ag * 1127878367 == 2) {
               return new uy(0, var7);
            }

            var8 = this.bt(var4, true, -1276069023);
            return new uy(0, var8);
         default:
            return new uy(0, var5);
         }
      }
   }

   public int ds(int var1, int var2) {
      int var3;
      if (var2 < var1) {
         var3 = var2;
         var2 = var1;
         var1 = var3;
      }

      this.aq.subList(var1, var2).clear();
      var3 = var1;
      if (this.aj((byte)1) && this.al * 1964007339 == 1) {
         while(var3 > 0) {
            --var3;
            char var4 = ((qm)this.aq.get(var3)).ap;
            if (var4 == 1442228342 || var4 == '\t') {
               break;
            }
         }
      }

      this.bc(var3, var2, -1561101023);
      return var1;
   }

   public int db(int var1, int var2) {
      if (null == this.ax) {
         return 0;
      } else if (this.aj((byte)-60) && var1 > this.ab * -488962989) {
         return this.aq.size();
      } else {
         if (!this.aq.isEmpty()) {
            for(int var3 = 0; var3 < this.aq.size(); ++var3) {
               qm var4 = (qm)this.aq.get(var3);
               if (var2 <= 1818523521 * var4.ak + this.ah(-1941568858)) {
                  if (var2 < var4.ak * 1818523521) {
                     break;
                  }

                  if (var1 < 217408337 * var4.aw) {
                     return var3 > 0 ? var3 - 1 : 0;
                  }

                  if (var3 + 1 != this.aq.size() && ((qm)this.aq.get(1 + var3)).ak * 1818523521 != 1818523521 * var4.ak) {
                     int var5 = this.br((qm)this.aq.get(var3), false, -1918031666);
                     if (var1 < var4.aw * 217408337 + var5) {
                        return var3;
                     }

                     if (var2 <= 1818523521 * var4.ak + this.ah(-574902604)) {
                        return var3 + 1;
                     }
                  }
               }
            }

            qm var6 = (qm)this.aq.get(this.aq.size() - 1);
            if (var1 >= var6.aw * 217408337 && var1 <= 217408337 * var6.aw + this.bj(1696443178) && var2 >= var6.ak * 1818523521 && var2 <= var6.ak * 1818523521 + this.ah(-1108954456)) {
               return this.aq.size() - 1;
            }
         }

         return this.aq.size();
      }
   }

   public int dv(int var1, int var2) {
      if (null == this.ax) {
         return 0;
      } else if (this.aj((byte)56) && var1 > this.ab * -488962989) {
         return this.aq.size();
      } else {
         if (!this.aq.isEmpty()) {
            for(int var3 = 0; var3 < this.aq.size(); ++var3) {
               qm var4 = (qm)this.aq.get(var3);
               if (var2 <= 1818523521 * var4.ak + this.ah(-1322122114)) {
                  if (var2 < var4.ak * 1818523521) {
                     break;
                  }

                  if (var1 < 217408337 * var4.aw) {
                     return var3 > 0 ? var3 - 1 : 0;
                  }

                  if (var3 + 1 != this.aq.size() && ((qm)this.aq.get(1 + var3)).ak * 1818523521 != 1818523521 * var4.ak) {
                     int var5 = this.br((qm)this.aq.get(var3), false, -1035820521);
                     if (var1 < var4.aw * 217408337 + var5) {
                        return var3;
                     }

                     if (var2 <= 1818523521 * var4.ak + this.ah(-2014210312)) {
                        return var3 + 1;
                     }
                  }
               }
            }

            qm var6 = (qm)this.aq.get(this.aq.size() - 1);
            if (var1 >= var6.aw * 217408337 && var1 <= 217408337 * var6.aw + this.bj(1696443178) && var2 >= var6.ak * 1818523521 && var2 <= var6.ak * 1818523521 + this.ah(-1685648281)) {
               return this.aq.size() - 1;
            }
         }

         return this.aq.size();
      }
   }

   public int dj(int var1, int var2) {
      if (null != this.ax && !this.ak(-1315777449) && var1 <= this.aq.size()) {
         byte var3;
         if (var2 > 0) {
            var3 = 1;
         } else {
            var3 = -1;
            var2 = -var2;
         }

         int var4 = 0;
         int var5 = 0;
         if (var1 > 0) {
            qm var6 = (qm)this.aq.get(var1 - 1);
            var4 = 217408337 * var6.aw + this.by(var1 - 1, 131925361);
            var5 = var6.ak * 1818523521;
         } else if (-1 == var3 && 0 == var1) {
            return 0;
         }

         int var14 = 16777215;
         int var7 = 0;
         int var8 = var1;
         int var9 = 16777215;
         int var10 = var3 == 1 ? this.aq.size() + 1 : 0;

         for(int var11 = var1 + var3; var10 != var11; var11 += var3) {
            qm var12 = (qm)this.aq.get(var11 - 1);
            if (var5 != var12.ak * 1818523521) {
               ++var7;
               var5 = var12.ak * 1818523521;
               if (var7 > var2) {
                  return var8;
               }
            }

            if (var7 == var2) {
               int var13 = Math.abs(217408337 * var12.aw + this.by(var11 - 1, 210581975) - var4);
               if (var13 >= var9) {
                  return var8;
               }

               var8 = var11;
               var9 = var13;
            }
         }

         if (1 == var3) {
            return this.aq.size();
         } else {
            if (var5 != 0) {
               ++var7;
            }

            return var9 != 16777215 && (var7 != var2 || var4 >= var9) ? var8 : 0;
         }
      } else {
         return 0;
      }
   }

   public int dp(int var1, int var2) {
      if (null != this.ax && !this.ak(-1315777449) && var1 <= this.aq.size()) {
         byte var3;
         if (var2 > 0) {
            var3 = 1;
         } else {
            var3 = -1;
            var2 = -var2;
         }

         int var4 = 0;
         int var5 = 0;
         if (var1 > 0) {
            qm var6 = (qm)this.aq.get(var1 - 1);
            var4 = 217408337 * var6.aw + this.by(var1 - 1, 834344142);
            var5 = var6.ak * 1818523521;
         } else if (-1 == var3 && 0 == var1) {
            return 0;
         }

         int var14 = 16777215;
         int var7 = 0;
         int var8 = var1;
         int var9 = 16777215;
         int var10 = var3 == 1 ? this.aq.size() + 1 : 0;

         for(int var11 = var1 + var3; var10 != var11; var11 += var3) {
            qm var12 = (qm)this.aq.get(var11 - 1);
            if (var5 != var12.ak * 1818523521) {
               ++var7;
               var5 = var12.ak * 1818523521;
               if (var7 > var2) {
                  return var8;
               }
            }

            if (var7 == var2) {
               int var13 = Math.abs(217408337 * var12.aw + this.by(var11 - 1, -1738921502) - var4);
               if (var13 >= var9) {
                  return var8;
               }

               var8 = var11;
               var9 = var13;
            }
         }

         if (1 == var3) {
            return this.aq.size();
         } else {
            if (var5 != 0) {
               ++var7;
            }

            return var9 != 16777215 && (var7 != var2 || var4 >= var9) ? var8 : 0;
         }
      } else {
         return 0;
      }
   }

   public void as(int var1, int var2) {
      try {
         if (this.ax != null) {
            if (var2 == 2013768333) {
               throw new IllegalStateException();
            }

            if (var1 < this.ax.ae * 2) {
               if (var2 == 2013768333) {
                  throw new IllegalStateException();
               }

               var1 = Integer.MAX_VALUE;
            }
         }

         if (var1 != -488962989 * this.ab) {
            this.ab = var1 * -1496981541;
            this.bz(715310296);
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ql.as(" + ')');
      }
   }

   public int do() {
      if (!this.aq.isEmpty() && this.bh(-1365311911) == 1) {
         return this.aq.isEmpty() ? 0 : ((qm)this.aq.get(this.aq.size() - 1)).aw * 217408337 + this.bj(1696443178);
      } else {
         int var1 = -1;
         int var2 = 0;

         for(int var3 = this.aq.size() - 1; var3 >= 0; --var3) {
            qm var4 = (qm)this.aq.get(var3);
            if (var4.ak * 609321640 != var1) {
               int var5 = this.br(var4, false, -1480063907) + -599322086 * var4.aw;
               var2 = Math.max(var5, var2);
               var1 = var4.ak * 1818523521;
            }
         }

         return var2;
      }
   }

   public int dw() {
      if (!this.aq.isEmpty() && this.bh(-625580538) == 1) {
         return this.aq.isEmpty() ? 0 : ((qm)this.aq.get(this.aq.size() - 1)).aw * -607802822 + this.bj(1696443178);
      } else {
         int var1 = -1;
         int var2 = 0;

         for(int var3 = this.aq.size() - 1; var3 >= 0; --var3) {
            qm var4 = (qm)this.aq.get(var3);
            if (var4.ak * -2093121099 != var1) {
               int var5 = this.br(var4, false, -931247197) + 92916341 * var4.aw;
               var2 = Math.max(var5, var2);
               var1 = var4.ak * 1818523521;
            }
         }

         return var2;
      }
   }

   public int de() {
      return this.ak(-1315777449) ? 0 : this.ax.ae + ((qm)this.aq.get(this.aq.size() - 1)).ak * 1818523521;
   }

   public int dz() {
      return this.ak(-1315777449) ? 0 : this.ax.ae + ((qm)this.aq.get(this.aq.size() - 1)).ak * -1260774517;
   }

   public int di() {
      return this.ak(-1315777449) ? 0 : this.ax.ae + ((qm)this.aq.get(this.aq.size() - 1)).ak * 1818523521;
   }

   public int dn() {
      return this.ak(-1315777449) ? 0 : this.ax.ae + ((qm)this.aq.get(this.aq.size() - 1)).ak * 1818523521;
   }

   public int eg() {
      return this.ac * -1686030371;
   }

   public int ev() {
      return this.ac * -2109684359;
   }

   public int bb(int var1) {
      try {
         return 1391543025 * this.aa;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ql.bb(" + ')');
      }
   }

   public int ez() {
      return this.aa((byte)-64) / this.ax.ae;
   }

   public void cv(qa var1) {
      if (this.ax != var1) {
         this.ax = var1;
         if (this.ax != null) {
            if (this.ac * -351902059 == 0) {
               this.ac = 2026265169 * this.ax.ae;
            }

            if (!this.ak(-1315777449)) {
               this.bz(-1311332915);
            }
         }
      }

   }

   public qd ca(char var1, int var2, int var3) {
      return this.ab(Character.toString(var1), var2, var3, (byte)85);
   }

   int ek() {
      return this.ak(-1315777449) ? 0 : this.br((qm)this.aq.get(this.aq.size() - 1), false, -1801147798);
   }

   public boolean ch(int var1, int var2) {
      if (1127878367 * this.ag != var1 || 833808137 * this.ad != var2) {
         this.ag = var1 * 1124412703;
         this.ad = var2 * -1936533703;
         this.bz(2000847750);
      }

      return true;
   }

   public int av(int var1, int var2, int var3) {
      try {
         int var4;
         if (var2 < var1) {
            if (var3 == 277081426) {
               throw new IllegalStateException();
            }

            var4 = var2;
            var2 = var1;
            var1 = var4;
         }

         this.aq.subList(var1, var2).clear();
         var4 = var1;
         if (this.aj((byte)-18)) {
            if (var3 == 277081426) {
               throw new IllegalStateException();
            }

            if (this.al * 1590781633 == 1) {
               if (var3 == 277081426) {
                  throw new IllegalStateException();
               }

               while(var4 > 0) {
                  if (var3 == 277081426) {
                     throw new IllegalStateException();
                  }

                  --var4;
                  char var5 = ((qm)this.aq.get(var4)).ap;
                  if (var5 == ' ') {
                     break;
                  }

                  if (var3 == 277081426) {
                     throw new IllegalStateException();
                  }

                  if (var5 == '\t') {
                     if (var3 == 277081426) {
                        throw new IllegalStateException();
                     }
                     break;
                  }
               }
            }
         }

         this.bc(var4, var2, -2058611926);
         return var1;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "ql.av(" + ')');
      }
   }

   int ef() {
      return this.ak(-1315777449) ? 0 : this.br((qm)this.aq.get(this.aq.size() - 1), false, -1340781513);
   }

   int by(int var1, int var2) {
      try {
         int var10000;
         if (var1 < this.aq.size()) {
            if (var2 == 151015740) {
               throw new IllegalStateException();
            }

            var10000 = this.br((qm)this.aq.get(var1), false, -2132040376);
         } else {
            var10000 = 0;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ql.by(" + ')');
      }
   }

   public int el() {
      return -488962989 * this.ab;
   }

   public int ed() {
      return -328780430 * this.ab;
   }

   public int ep() {
      return this.az * -113709752;
   }

   public int ex() {
      return this.az * 1509907247;
   }

   public int ej() {
      return this.az * 1509907247;
   }

   public int ei() {
      return this.al * 1590781633;
   }

   public int ew(int var1) {
      switch(-1541500494 * this.ag) {
      case 0:
         return 0;
      case 1:
         return var1 / 2;
      case 2:
         return var1;
      default:
         return 0;
      }
   }

   public int eu(int var1) {
      switch(1127878367 * this.ag) {
      case 0:
         return 0;
      case 1:
         return var1 / 2;
      case 2:
         return var1;
      default:
         return 0;
      }
   }

   public int eq(int var1) {
      switch(1127878367 * this.ag) {
      case 0:
         return 0;
      case 1:
         return var1 / 2;
      case 2:
         return var1;
      default:
         return 0;
      }
   }

   public int eb(int var1) {
      switch(833808137 * this.ad) {
      case 0:
         return 0;
      case 1:
         return var1 / 2;
      case 2:
         return var1;
      default:
         return 0;
      }
   }

   void es() {
      this.bc(0, this.aq.size(), -2144385822);
   }

   uy bn(int var1, int var2, int var3) {
      try {
         int var4 = Math.min(var1, var2);
         int var5 = Math.max(var1, var2);
         int var6 = this.aq.size();
         if (0 == var4) {
            if (var3 <= 803241565) {
               throw new IllegalStateException();
            }

            if (var5 == var6) {
               if (var3 <= 803241565) {
                  throw new IllegalStateException();
               }

               return new uy(0, var6);
            }
         }

         int var7 = this.bu(var4, false, 534280745);
         int var8 = this.bt(var5, false, -1821531790);
         int var9;
         switch(833808137 * this.ad) {
         case 0:
            if (0 == 1127878367 * this.ag) {
               if (var3 <= 803241565) {
                  throw new IllegalStateException();
               }

               return new uy(var7, var6);
            }

            var9 = this.bu(var4, true, 179319204);
            return new uy(var9, var6);
         case 1:
            return new uy(0, var6);
         case 2:
            if (this.ag * 1127878367 == 2) {
               return new uy(0, var8);
            }

            var9 = this.bt(var5, true, -1311011987);
            return new uy(0, var9);
         default:
            return new uy(0, var6);
         }
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "ql.bn(" + ')');
      }
   }

   void df() {
      this.aq.clear();
   }

   void ea(int var1, int var2) {
      if (!this.ak(-1315777449) && this.ax != null) {
         uy var3 = this.bn(var1, var2, 840683566);
         boolean var4 = (Integer)var3.ap == 0 && (Integer)var3.aw == this.aq.size();
         int var5 = (Integer)var3.ap;
         int var6 = 0;
         int var7 = var4 ? 0 : ((qm)this.aq.get((Integer)var3.ap)).ak * 1818523521;
         int var8 = 0;

         int var9;
         for(var9 = (Integer)var3.ap; var9 <= (Integer)var3.aw; ++var9) {
            boolean var10 = var9 >= this.aq.size();
            qm var11 = (qm)this.aq.get(!var10 ? var9 : this.aq.size() - 1);
            int var12 = !var10 ? this.br(var11, false, -1606206807) : 0;
            boolean var13 = !var10 && var11.ap == '\n';
            boolean var14 = !var10 && this.aj((byte)-43) && var6 + var12 > -488962989 * this.ab;
            if (var13 || var14 || var10) {
               int var15 = var9;
               int var16 = 0;
               int var17;
               int var18;
               qm var19;
               if (var14) {
                  var17 = 0;
                  if (this.al * 1590781633 == 1) {
                     for(var18 = var9; var18 > var5; --var18) {
                        var19 = (qm)this.aq.get(var18);
                        var17 += var18 < var15 ? this.br(var19, false, -1763455469) : 0;
                        if (2123347355 == var19.ap || '\n' == var19.ap) {
                           var15 = var18;
                           var6 -= var17;
                           var16 = var17;
                           break;
                        }
                     }
                  }
               }

               var17 = -this.bq(var6, 1977994154);

               for(var18 = var5; var18 < var15; ++var18) {
                  var19 = (qm)this.aq.get(var18);
                  int var20 = this.br(var19, false, -1807871896);
                  var19.aw = -1522127802 * var17;
                  var19.ak = var7 * 1032046721;
                  var17 += var20;
               }

               var5 = var15;
               var6 = var16;
               var7 += this.ah(-1175675550);
               ++var8;
            }

            var6 += !var10 ? var12 : 0;
         }

         if (this.ad * -405995982 != 0 && var4) {
            var9 = var8 * this.ah(-453647001);
            int var21 = this.bp(var9, 1450995377);

            for(int var22 = 0; var22 < this.aq.size(); ++var22) {
               qm var23 = (qm)this.aq.get(var22);
               var23.ak -= 1032046721 * var21;
            }
         }

      }
   }

   int et(int var1) {
      return var1 < this.aq.size() ? this.br((qm)this.aq.get(var1), false, -1614910929) : 0;
   }

   int fu(qm var1, boolean var2) {
      if (var1.ap == '\n') {
         return 0;
      } else if (!var2 && 0 != this.aa * 1391543025) {
         return this.ax.ak[42];
      } else {
         int var3 = this.ax.ak[var1.ap];
         if (0 == var3) {
            return var1.ap == '\t' ? 3 * this.ax.ak[32] : this.ax.ak[32];
         } else {
            return var3;
         }
      }
   }

   int fo(qm var1, boolean var2) {
      if (var1.ap == '\n') {
         return 0;
      } else if (!var2 && 0 != this.aa * 1391543025) {
         return this.ax.ak[42];
      } else {
         int var3 = this.ax.ak[var1.ap];
         if (0 == var3) {
            return var1.ap == '\t' ? 3 * this.ax.ak[32] : this.ax.ak[32];
         } else {
            return var3;
         }
      }
   }

   public void cf(int var1) {
      if (1509907247 * this.az != var1) {
         this.az = -1669739569 * var1;
         this.bz(-1216888769);
      }

   }

   int er() {
      return this.ak(-1315777449) ? 0 : this.br((qm)this.aq.get(this.aq.size() - 1), false, -1309870654);
   }

   uy fw(int var1, int var2) {
      int var3 = Math.min(var1, var2);
      int var4 = Math.max(var1, var2);
      int var5 = this.aq.size();
      if (0 == var3 && var4 == var5) {
         return new uy(0, var5);
      } else {
         int var6 = this.bu(var3, false, 1450797063);
         int var7 = this.bt(var4, false, -1534803002);
         int var8;
         switch(833808137 * this.ad) {
         case 0:
            if (0 == 1127878367 * this.ag) {
               return new uy(var6, var5);
            }

            var8 = this.bu(var3, true, 1146551677);
            return new uy(var8, var5);
         case 1:
            return new uy(0, var5);
         case 2:
            if (this.ag * 1127878367 == 2) {
               return new uy(0, var7);
            }

            var8 = this.bt(var4, true, -1756202092);
            return new uy(0, var8);
         default:
            return new uy(0, var5);
         }
      }
   }

   uy fp(int var1, int var2) {
      int var3 = Math.min(var1, var2);
      int var4 = Math.max(var1, var2);
      int var5 = this.aq.size();
      if (0 == var3 && var4 == var5) {
         return new uy(0, var5);
      } else {
         int var6 = this.bu(var3, false, -1604722967);
         int var7 = this.bt(var4, false, -1734716913);
         int var8;
         switch(833808137 * this.ad) {
         case 0:
            if (0 == 1127878367 * this.ag) {
               return new uy(var6, var5);
            }

            var8 = this.bu(var3, true, 1613313790);
            return new uy(var8, var5);
         case 1:
            return new uy(0, var5);
         case 2:
            if (this.ag * -552953953 == 2) {
               return new uy(0, var7);
            }

            var8 = this.bt(var4, true, -2045022259);
            return new uy(0, var8);
         default:
            return new uy(0, var5);
         }
      }
   }

   uy fj(int var1, int var2) {
      int var3 = Math.min(var1, var2);
      int var4 = Math.max(var1, var2);
      int var5 = this.aq.size();
      if (0 == var3 && var4 == var5) {
         return new uy(0, var5);
      } else {
         int var6 = this.bu(var3, false, 180198748);
         int var7 = this.bt(var4, false, -1751726493);
         int var8;
         switch(833808137 * this.ad) {
         case 0:
            if (0 == 1127878367 * this.ag) {
               return new uy(var6, var5);
            }

            var8 = this.bu(var3, true, 1068987533);
            return new uy(var8, var5);
         case 1:
            return new uy(0, var5);
         case 2:
            if (this.ag * 1127878367 == 2) {
               return new uy(0, var7);
            }

            var8 = this.bt(var4, true, -1391635554);
            return new uy(0, var8);
         default:
            return new uy(0, var5);
         }
      }
   }

   int fv(int var1, boolean var2) {
      if (var1 < this.aq.size()) {
         int var3 = ((qm)this.aq.get(var1)).ak * 1818523521;

         for(int var4 = var1; var4 < this.aq.size() - 1; ++var4) {
            if (((qm)this.aq.get(var4 + 1)).ak * 1818523521 > var3) {
               if (!var2) {
                  return var4;
               }

               var2 = false;
               var3 = ((qm)this.aq.get(1 + var4)).ak * 1818523521;
            }
         }
      }

      return this.aq.size();
   }

   int fl(int var1, boolean var2) {
      if (var1 < this.aq.size()) {
         int var3 = ((qm)this.aq.get(var1)).ak * -1443805849;

         for(int var4 = var1; var4 < this.aq.size() - 1; ++var4) {
            if (((qm)this.aq.get(var4 + 1)).ak * 1422430154 > var3) {
               if (!var2) {
                  return var4;
               }

               var2 = false;
               var3 = ((qm)this.aq.get(1 + var4)).ak * 616004527;
            }
         }
      }

      return this.aq.size();
   }

   int fn(int var1, boolean var2) {
      if (var1 < this.aq.size()) {
         int var3 = ((qm)this.aq.get(var1)).ak * 1818523521;

         for(int var4 = var1; var4 < this.aq.size() - 1; ++var4) {
            if (((qm)this.aq.get(var4 + 1)).ak * 1818523521 > var3) {
               if (!var2) {
                  return var4;
               }

               var2 = false;
               var3 = ((qm)this.aq.get(1 + var4)).ak * 1818523521;
            }
         }
      }

      return this.aq.size();
   }

   int fd(int var1, boolean var2) {
      if (var1 < this.aq.size()) {
         int var3 = ((qm)this.aq.get(var1)).ak * 1818523521;

         for(int var4 = var1; var4 < this.aq.size() - 1; ++var4) {
            if (((qm)this.aq.get(var4 + 1)).ak * 1818523521 > var3) {
               if (!var2) {
                  return var4;
               }

               var2 = false;
               var3 = ((qm)this.aq.get(1 + var4)).ak * 1818523521;
            }
         }
      }

      return this.aq.size();
   }
}
