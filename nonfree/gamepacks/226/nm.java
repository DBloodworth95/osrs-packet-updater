import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class nm {
   pe aj;
   pe aw;
   pe ak;
   rs ao;
   pe ap;
   public ng[][] ay;
   mi at;
   mi am;
   pe ai;
   mi au;
   mi an;
   Map ae;
   rs af;

   public void aj(int var1, byte var2) {
      try {
         if (-1 == var1) {
            if (var2 <= 4) {
               throw new IllegalStateException();
            }
         } else if (!gh.as[var1]) {
            if (var2 <= 4) {
               throw new IllegalStateException();
            }
         } else {
            this.ap.ci(var1, (byte)-101);
            if (null != this.ay[var1]) {
               for(int var3 = 0; var3 < this.ay[var1].length; ++var3) {
                  if (var2 <= 4) {
                     return;
                  }

                  if (this.ay[var1][var3] != null) {
                     this.ay[var1][var3] = null;
                  }
               }

               this.ay[var1] = null;
               gh.as[var1] = false;
            }
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "nm.aj(" + ')');
      }
   }

   static ke ks(int var0, int var1, int var2) {
      try {
         client.wv.ap = var0 * -1059692199;
         client.wv.aw = var1 * 1414276359;
         client.wv.ak = -1210338049;
         client.wv.aj = -1221407581;
         return client.wv;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "nm.ks(" + ')');
      }
   }

   public ng aw(int var1, int var2, byte var3) {
      try {
         ng var4 = this.ap(var1, 1177440336);
         if (-1 == var2) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               return var4;
            }
         } else {
            if (null != var4) {
               if (var3 == 1) {
                  throw new IllegalStateException();
               }

               if (null != var4.gu) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  }

                  if (var2 < var4.gu.length) {
                     return var4.gu[var2];
                  }

                  if (var3 == 1) {
                     throw new IllegalStateException();
                  }
               }
            }

            return null;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "nm.aw(" + ')');
      }
   }

   public boolean ak(int var1, int var2) {
      try {
         if (gh.as[var1]) {
            if (var2 == -1754515453) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else if (!this.ap.bw(var1, 1665166579)) {
            if (var2 == -1754515453) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            int var3 = this.ap.cq(var1, 1387988906);
            if (0 == var3) {
               if (var2 == -1754515453) {
                  throw new IllegalStateException();
               } else {
                  gh.as[var1] = true;
                  return true;
               }
            } else {
               if (null == this.ay[var1]) {
                  if (var2 == -1754515453) {
                     throw new IllegalStateException();
                  }

                  this.ay[var1] = new ng[var3];
               }

               for(int var4 = 0; var4 < var3; ++var4) {
                  if (var2 == -1754515453) {
                     throw new IllegalStateException();
                  }

                  if (null == this.ay[var1][var4]) {
                     if (var2 == -1754515453) {
                        throw new IllegalStateException();
                     }

                     byte[] var5 = this.ap.bm(var1, var4, 818706799);
                     if (var5 != null) {
                        if (var2 == -1754515453) {
                           throw new IllegalStateException();
                        }

                        this.ay[var1][var4] = new ng();
                        this.ay[var1][var4].bj = ((var1 << 16) + var4) * 1577362265;
                        if (-1 == var5[0]) {
                           this.ay[var1][var4].aj(new vl(var5), -867941240);
                        } else {
                           this.ay[var1][var4].ak(new vl(var5), 1240155534);
                        }

                        if (null != this.aw) {
                           if (var2 == -1754515453) {
                              throw new IllegalStateException();
                           }

                           byte[] var6 = this.aw.bm(var1, var4, 1106665244);
                           if (var6 != null) {
                              if (var2 == -1754515453) {
                                 throw new IllegalStateException();
                              }

                              if (var6.length > 0) {
                                 if (var2 == -1754515453) {
                                    throw new IllegalStateException();
                                 }

                                 this.ay[var1][var4].ai(new vl(var6), (byte)-123);
                                 this.ae.put(this.ay[var1][var4].bx, var1);
                              }
                           }
                        }
                     }
                  }
               }

               gh.as[var1] = true;
               return true;
            }
         }
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "nm.ak(" + ')');
      }
   }

   public ng au(int var1, int var2) {
      ng var3 = this.ap(var1, -965624971);
      if (-1 == var2) {
         return var3;
      } else {
         return null != var3 && null != var3.gu && var2 < var3.gu.length ? var3.gu[var2] : null;
      }
   }

   public void ai(int var1) {
      try {
         this.am.aj();
         this.at.aj();
         this.au.aj();
         this.an.aj();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "nm.ai(" + ')');
      }
   }

   public nm(pe var1, pe var2, pe var3, pe var4, pe var5) {
      try {
         super();
         this.ae = new HashMap();
         this.am = new mi(200);
         this.at = new mi(50);
         this.au = new mi(20);
         this.an = new mi(8);
         this.ao = new rs(10, rm.ap);
         this.af = new rs(10, rm.ap);
         int var6 = 0;
         if (null != var1) {
            this.ap = var1;
            this.ak = var2;
            this.aj = var3;
            this.ai = var4;
            this.aw = var5;
            var6 = this.ap.cb(-1359030950);
         }

         this.ay = new ng[var6][];
         gh.as = new boolean[var6];
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "nm.<init>(" + ')');
      }
   }

   public ng as(int var1) {
      int var2 = var1 >> 16;
      int var3 = var1 & -1556526360;
      if (this.ay[var2] == null || null == this.ay[var2][var3]) {
         boolean var4 = this.ak(var2, 1506463172);
         if (!var4) {
            return null;
         }
      }

      return this.ay[var2][var3];
   }

   public ng ae(int var1) {
      int var2 = var1 >> 16;
      int var3 = var1 & '\uffff';
      if (this.ay[var2] == null || null == this.ay[var2][var3]) {
         boolean var4 = this.ak(var2, 496084692);
         if (!var4) {
            return null;
         }
      }

      return this.ay[var2][var3];
   }

   public ng am(int var1) {
      int var2 = var1 >> 16;
      int var3 = var1 & '\uffff';
      if (this.ay[var2] == null || null == this.ay[var2][var3]) {
         boolean var4 = this.ak(var2, 1584245123);
         if (!var4) {
            return null;
         }
      }

      return this.ay[var2][var3];
   }

   public ng at(int var1) {
      int var2 = var1 >> 16;
      int var3 = var1 & '\uffff';
      if (this.ay[var2] == null || null == this.ay[var2][var3]) {
         boolean var4 = this.ak(var2, 96769292);
         if (!var4) {
            return null;
         }
      }

      return this.ay[var2][var3];
   }

   public void ab() {
      this.am.aj();
      this.at.aj();
      this.au.aj();
      this.an.aj();
   }

   public ng an(int var1, int var2) {
      ng var3 = this.ap(var1, 1692390607);
      if (-1 == var2) {
         return var3;
      } else {
         return null != var3 && null != var3.gu && var2 < var3.gu.length ? var3.gu[var2] : null;
      }
   }

   public boolean ao(int var1) {
      if (gh.as[var1]) {
         return true;
      } else if (!this.ap.bw(var1, 1647858644)) {
         return false;
      } else {
         int var2 = this.ap.cq(var1, 634204324);
         if (0 == var2) {
            gh.as[var1] = true;
            return true;
         } else {
            if (null == this.ay[var1]) {
               this.ay[var1] = new ng[var2];
            }

            for(int var3 = 0; var3 < var2; ++var3) {
               if (null == this.ay[var1][var3]) {
                  byte[] var4 = this.ap.bm(var1, var3, 869095459);
                  if (var4 != null) {
                     this.ay[var1][var3] = new ng();
                     this.ay[var1][var3].bj = ((var1 << 16) + var3) * -173116609;
                     if (-1 == var4[0]) {
                        this.ay[var1][var3].aj(new vl(var4), -867941240);
                     } else {
                        this.ay[var1][var3].ak(new vl(var4), 759617132);
                     }

                     if (null != this.aw) {
                        byte[] var5 = this.aw.bm(var1, var3, 2003779066);
                        if (var5 != null && var5.length > 0) {
                           this.ay[var1][var3].ai(new vl(var5), (byte)-36);
                           this.ae.put(this.ay[var1][var3].bx, var1);
                        }
                     }
                  }
               }
            }

            gh.as[var1] = true;
            return true;
         }
      }
   }

   public boolean af(int var1) {
      if (gh.as[var1]) {
         return true;
      } else if (!this.ap.bw(var1, 1163833035)) {
         return false;
      } else {
         int var2 = this.ap.cq(var1, 605192969);
         if (0 == var2) {
            gh.as[var1] = true;
            return true;
         } else {
            if (null == this.ay[var1]) {
               this.ay[var1] = new ng[var2];
            }

            for(int var3 = 0; var3 < var2; ++var3) {
               if (null == this.ay[var1][var3]) {
                  byte[] var4 = this.ap.bm(var1, var3, 2070023664);
                  if (var4 != null) {
                     this.ay[var1][var3] = new ng();
                     this.ay[var1][var3].bj = ((var1 << 16) + var3) * 1577362265;
                     if (-1 == var4[0]) {
                        this.ay[var1][var3].aj(new vl(var4), -867941240);
                     } else {
                        this.ay[var1][var3].ak(new vl(var4), 1621178640);
                     }

                     if (null != this.aw) {
                        byte[] var5 = this.aw.bm(var1, var3, 1913628393);
                        if (var5 != null && var5.length > 0) {
                           this.ay[var1][var3].ai(new vl(var5), (byte)-38);
                           this.ae.put(this.ay[var1][var3].bx, var1);
                        }
                     }
                  }
               }
            }

            gh.as[var1] = true;
            return true;
         }
      }
   }

   public void ar(int var1) {
      if (-1 != var1) {
         if (gh.as[var1]) {
            this.ap.ci(var1, (byte)-67);
            if (null != this.ay[var1]) {
               for(int var2 = 0; var2 < this.ay[var1].length; ++var2) {
                  if (this.ay[var1][var2] != null) {
                     this.ay[var1][var2] = null;
                  }
               }

               this.ay[var1] = null;
               gh.as[var1] = false;
            }
         }
      }
   }

   public ng ay(int var1) {
      int var2 = var1 >> 16;
      int var3 = var1 & '\uffff';
      if (this.ay[var2] == null || null == this.ay[var2][var3]) {
         boolean var4 = this.ak(var2, 1830041693);
         if (!var4) {
            return null;
         }
      }

      return this.ay[var2][var3];
   }

   static final void na(byte var0) {
      try {
         Iterator var1 = client.jv.iterator();

         while(var1.hasNext()) {
            if (var0 <= 1) {
               throw new IllegalStateException();
            }

            dn var2 = (dn)var1.next();

            for(int var3 = 0; var3 < client.jp.ae * -562349667; ++var3) {
               dv var4 = hx.jf.an[client.jp.am[var3]];
               if (var4 != null) {
                  if (var0 <= 1) {
                     throw new IllegalStateException();
                  }

                  var4.ad((byte)-72);
               }
            }
         }

      } catch (RuntimeException var5) {
         throw tm.aw(var5, "nm.na(" + ')');
      }
   }

   static int bg(int var0, da var1, boolean var2, int var3) {
      try {
         if (7108 == var0) {
            if (var3 == -319717457) {
               throw new IllegalStateException();
            } else {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = cj.kp(1455819180) ? 1 : 0;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "nm.bg(" + ')');
      }
   }

   public ng ap(int var1, int var2) {
      try {
         int var3 = var1 >> 16;
         int var4 = var1 & '\uffff';
         if (this.ay[var3] != null) {
            if (var2 == -1004904576) {
               throw new IllegalStateException();
            }

            if (null != this.ay[var3][var4]) {
               return this.ay[var3][var4];
            }
         }

         boolean var5 = this.ak(var3, -1742213091);
         if (!var5) {
            if (var2 == -1004904576) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return this.ay[var3][var4];
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "nm.ap(" + ')');
      }
   }
}
