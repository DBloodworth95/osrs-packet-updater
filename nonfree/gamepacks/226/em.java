import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class em {
   static final int al = 1;
   boolean[] ak;
   Map aj;
   /** @deprecated */
   @Deprecated
   String[] ai;
   boolean ay;
   long as;
   static final String aw = "2";
   static final int ca = 30;
   static final int ap = 0;

   void ax(int var1, String var2) {
      this.aj.put(var1, var2);
   }

   void bp() {
      if (this.ay && this.as * -374131008840126959L < ck.ap(-2126909445) - 60000L) {
         this.am(-618058301);
      }

   }

   un bx(boolean var1) {
      return rr.ak("2", lu.cn.as, var1, (byte)-47);
   }

   /** @deprecated */
   @Deprecated
   String ay(int var1, int var2) {
      try {
         return this.ai[var1];
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "em.ay(" + ')');
      }
   }

   void au(int var1) {
      try {
         if (this.ay) {
            if (var1 != 1489115595) {
               throw new IllegalStateException();
            }

            if (this.as * -374131008840126959L < ck.ap(-1336379138) - 60000L) {
               if (var1 != 1489115595) {
                  throw new IllegalStateException();
               }

               this.am(-911466856);
            }
         }

      } catch (RuntimeException var2) {
         throw tm.aw(var2, "em.au(" + ')');
      }
   }

   /** @deprecated */
   @Deprecated
   void ai(int var1, String var2, int var3) {
      try {
         this.ai[var1] = var2;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "em.ai(" + ')');
      }
   }

   void am(int var1) {
      try {
         un var2 = this.ae(true, 1117172637);
         boolean var19 = false;

         label173: {
            label172: {
               try {
                  var19 = true;
                  int var3 = 3;
                  int var4 = 0;
                  Iterator var5 = this.aj.entrySet().iterator();

                  while(var5.hasNext()) {
                     Entry var6 = (Entry)var5.next();
                     int var7 = (Integer)var6.getKey();
                     if (this.ak[var7]) {
                        if (var1 == -1126623833) {
                           return;
                        }

                        Object var8 = var6.getValue();
                        var3 += 3;
                        if (var8 instanceof Integer) {
                           if (var1 == -1126623833) {
                              return;
                           }

                           var3 += 4;
                        } else if (var8 instanceof String) {
                           if (var1 == -1126623833) {
                              throw new IllegalStateException();
                           }

                           var3 += ct.bl((String)var8, 984314712);
                        }

                        ++var4;
                     }
                  }

                  vl var26 = new vl(var3);
                  var26.bo(2, 222010525);
                  var26.bd(var4, (byte)-14);
                  Iterator var27 = this.aj.entrySet().iterator();

                  while(var27.hasNext()) {
                     if (var1 == -1126623833) {
                        throw new IllegalStateException();
                     }

                     Entry var28 = (Entry)var27.next();
                     int var29 = (Integer)var28.getKey();
                     if (this.ak[var29]) {
                        if (var1 == -1126623833) {
                           throw new IllegalStateException();
                        }

                        var26.bd(var29, (byte)-30);
                        Object var9 = var28.getValue();
                        ui var10 = ui.ak(var9.getClass(), 53039308);
                        var26.bo(var10.ai * -561719529, 1773062433);
                        ui.aj(var9, var26, -671038062);
                     }
                  }

                  var2.aw(var26.ae, 0, var26.am * -1689308347, 1818649889);
                  var19 = false;
                  break label172;
               } catch (Exception var23) {
                  var19 = false;
               } finally {
                  if (var19) {
                     try {
                        var2.ak(456684033);
                     } catch (Exception var20) {
                     }

                  }
               }

               try {
                  var2.ak(1772953101);
               } catch (Exception var21) {
               }
               break label173;
            }

            try {
               var2.ak(-1870560372);
            } catch (Exception var22) {
            }
         }

         this.ay = false;
         this.as = ck.ap(-1862024060) * 6037837368328749809L;
      } catch (RuntimeException var25) {
         throw tm.aw(var25, "em.am(" + ')');
      }
   }

   void as(int var1) {
      try {
         int var2;
         for(var2 = 0; var2 < this.ak.length; ++var2) {
            if (var1 != 1337875578) {
               throw new IllegalStateException();
            }

            if (!this.ak[var2]) {
               if (var1 != 1337875578) {
                  throw new IllegalStateException();
               }

               this.aj.remove(var2);
            }
         }

         for(var2 = 0; var2 < this.ai.length; ++var2) {
            if (var1 != 1337875578) {
               return;
            }

            this.ai[var2] = null;
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "em.as(" + ')');
      }
   }

   un ae(boolean var1, int var2) {
      try {
         return rr.ak("2", lu.cn.as, var1, (byte)-29);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "em.ae(" + ')');
      }
   }

   boolean bc() {
      return this.ay;
   }

   /** @deprecated */
   @Deprecated
   void al(int var1, String var2) {
      this.ai[var1] = var2;
   }

   void av(int var1, String var2) {
      this.aj.put(var1, var2);
   }

   boolean an(int var1) {
      try {
         return this.ay;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "em.an(" + ')');
      }
   }

   void ao(int var1, int var2) {
      this.aj.put(var1, var2);
      if (this.ak[var1]) {
         this.ay = true;
      }

   }

   void af(int var1, int var2) {
      this.aj.put(var1, var2);
      if (this.ak[var1]) {
         this.ay = true;
      }

   }

   void ar(int var1, int var2) {
      this.aj.put(var1, var2);
      if (this.ak[var1]) {
         this.ay = true;
      }

   }

   un bv(boolean var1) {
      return rr.ak("2", lu.cn.as, var1, (byte)-94);
   }

   int az(int var1) {
      Object var2 = this.aj.get(var1);
      return var2 instanceof Integer ? (Integer)var2 : -1;
   }

   int ag(int var1) {
      Object var2 = this.aj.get(var1);
      return var2 instanceof Integer ? (Integer)var2 : -1;
   }

   void ad(int var1, String var2) {
      this.aj.put(var1, var2);
   }

   void ac(int var1, String var2) {
      this.aj.put(var1, var2);
   }

   int aw(int var1, int var2) {
      try {
         Object var3 = this.aj.get(var1);
         return var3 instanceof Integer ? (Integer)var3 : -1;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "em.aw(" + ')');
      }
   }

   String aj(int var1, int var2) {
      try {
         Object var3 = this.aj.get(var1);
         if (var3 instanceof String) {
            if (var2 != 1490075636) {
               throw new IllegalStateException();
            } else {
               return (String)var3;
            }
         } else {
            return "";
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "em.aj(" + ')');
      }
   }

   /** @deprecated */
   @Deprecated
   void aq(int var1, String var2) {
      this.ai[var1] = var2;
   }

   int ab(int var1) {
      Object var2 = this.aj.get(var1);
      return var2 instanceof Integer ? (Integer)var2 : -1;
   }

   /** @deprecated */
   @Deprecated
   String aa(int var1) {
      return this.ai[var1];
   }

   void ah() {
      int var1;
      for(var1 = 0; var1 < this.ak.length; ++var1) {
         if (!this.ak[var1]) {
            this.aj.remove(var1);
         }
      }

      for(var1 = 0; var1 < this.ai.length; ++var1) {
         this.ai[var1] = null;
      }

   }

   void at(int var1) {
      try {
         un var2 = this.ae(false, 1117172637);
         boolean var23 = false;

         label351: {
            label356: {
               label357: {
                  label348: {
                     try {
                        var23 = true;
                        byte[] var3 = new byte[(int)var2.ai((byte)0)];

                        int var5;
                        for(int var4 = 0; var4 < var3.length; var4 += var5) {
                           if (var1 <= -966138669) {
                              throw new IllegalStateException();
                           }

                           var5 = var2.ay(var3, var4, var3.length - var4, -1354047542);
                           if (-1 == var5) {
                              if (var1 <= -966138669) {
                                 return;
                              }

                              throw new EOFException();
                           }
                        }

                        vl var32 = new vl(var3);
                        if (var32.ae.length - -1689308347 * var32.am >= 1) {
                           int var6 = var32.cy((short)-15139);
                           if (var6 >= 0) {
                              if (var1 <= -966138669) {
                                 throw new IllegalStateException();
                              }

                              if (var6 <= 2) {
                                 int var7;
                                 int var8;
                                 int var9;
                                 int var10;
                                 if (var6 >= 2) {
                                    if (var1 <= -966138669) {
                                       throw new IllegalStateException();
                                    }

                                    var7 = var32.ce(1258347533);

                                    for(var8 = 0; var8 < var7; ++var8) {
                                       if (var1 <= -966138669) {
                                          throw new IllegalStateException();
                                       }

                                       var9 = var32.ce(1277395003);
                                       var10 = var32.cy((short)-9652);
                                       ui var11 = (ui)gu.ap(ui.ap((byte)3), var10, -1875781163);
                                       Object var12 = var11.ay(var32, (byte)1);
                                       if (var9 >= 0 && var9 < this.ak.length) {
                                          if (var1 <= -966138669) {
                                             throw new IllegalStateException();
                                          }

                                          if (this.ak[var9]) {
                                             if (var1 <= -966138669) {
                                                throw new IllegalStateException();
                                             }

                                             this.aj.put(var9, var12);
                                          }
                                       }
                                    }

                                    var23 = false;
                                    break label356;
                                 }

                                 var7 = var32.ce(701116441);

                                 for(var8 = 0; var8 < var7; ++var8) {
                                    if (var1 <= -966138669) {
                                       throw new IllegalStateException();
                                    }

                                    var9 = var32.ce(867437225);
                                    var10 = var32.ch(1203709469);
                                    if (var9 >= 0) {
                                       if (var1 <= -966138669) {
                                          throw new IllegalStateException();
                                       }

                                       if (var9 < this.ak.length && this.ak[var9]) {
                                          if (var1 <= -966138669) {
                                             throw new IllegalStateException();
                                          }

                                          this.aj.put(var9, var10);
                                       }
                                    }
                                 }

                                 var8 = var32.ce(58257462);

                                 for(var9 = 0; var9 < var8; ++var9) {
                                    var32.ce(904489546);
                                    var32.cw(2073019282);
                                 }

                                 var23 = false;
                                 break label356;
                              }

                              if (var1 <= -966138669) {
                                 throw new IllegalStateException();
                              }

                              var23 = false;
                           } else {
                              var23 = false;
                           }
                           break label357;
                        }

                        if (var1 <= -966138669) {
                           throw new IllegalStateException();
                        }

                        var23 = false;
                        break label348;
                     } catch (Exception var29) {
                        var23 = false;
                     } finally {
                        if (var23) {
                           try {
                              var2.ak(1273669307);
                           } catch (Exception var24) {
                           }

                        }
                     }

                     try {
                        var2.ak(-1132826528);
                     } catch (Exception var26) {
                     }
                     break label351;
                  }

                  try {
                     var2.ak(-971273238);
                  } catch (Exception var25) {
                  }

                  return;
               }

               try {
                  var2.ak(-477042649);
               } catch (Exception var28) {
               }

               return;
            }

            try {
               var2.ak(1574936939);
            } catch (Exception var27) {
            }
         }

         this.ay = false;
      } catch (RuntimeException var31) {
         throw tm.aw(var31, "em.at(" + ')');
      }
   }

   void bj() {
      int var1;
      for(var1 = 0; var1 < this.ak.length; ++var1) {
         if (!this.ak[var1]) {
            this.aj.remove(var1);
         }
      }

      for(var1 = 0; var1 < this.ai.length; ++var1) {
         this.ai[var1] = null;
      }

   }

   void ap(int var1, int var2, int var3) {
      try {
         this.aj.put(var1, var2);
         if (this.ak[var1]) {
            if (var3 != -96873113) {
               throw new IllegalStateException();
            }

            this.ay = true;
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "em.ap(" + ')');
      }
   }

   em() {
      try {
         super();
         this.ay = false;
         int var1 = cl.ea.cq(19, 1187116097);
         this.aj = new HashMap();
         this.ak = new boolean[var1];

         int var2;
         for(var2 = 0; var2 < var1; ++var2) {
            hq var4 = (hq)hq.aw.ap((long)var2);
            hq var3;
            if (var4 != null) {
               var3 = var4;
            } else {
               byte[] var5 = hq.ap.bm(19, var2, 842337863);
               var4 = new hq();
               if (var5 != null) {
                  var4.aw(new vl(var5), (byte)-5);
               }

               hq.aw.ak(var4, (long)var2);
               var3 = var4;
            }

            this.ak[var2] = var3.ak;
         }

         var2 = 0;
         if (cl.ea.an(15, 1643321149)) {
            var2 = cl.ea.cq(15, 2043586230);
         }

         this.ai = new String[var2];
         this.at(780843614);
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "em.<init>(" + ')');
      }
   }

   void bk() {
      un var1 = this.ae(true, 1117172637);
      boolean var17 = false;

      label128: {
         label127: {
            try {
               var17 = true;
               int var2 = 3;
               int var3 = 0;
               Iterator var4 = this.aj.entrySet().iterator();

               while(var4.hasNext()) {
                  Entry var5 = (Entry)var4.next();
                  int var6 = (Integer)var5.getKey();
                  if (this.ak[var6]) {
                     Object var7 = var5.getValue();
                     var2 += 3;
                     if (var7 instanceof Integer) {
                        var2 += 4;
                     } else if (var7 instanceof String) {
                        var2 += ct.bl((String)var7, -619823404);
                     }

                     ++var3;
                  }
               }

               vl var23 = new vl(var2);
               var23.bo(2, 1033473173);
               var23.bd(var3, (byte)21);
               Iterator var24 = this.aj.entrySet().iterator();

               while(var24.hasNext()) {
                  Entry var25 = (Entry)var24.next();
                  int var26 = (Integer)var25.getKey();
                  if (this.ak[var26]) {
                     var23.bd(var26, (byte)56);
                     Object var8 = var25.getValue();
                     ui var9 = ui.ak(var8.getClass(), 373778096);
                     var23.bo(var9.ai * -561719529, -897415151);
                     ui.aj(var8, var23, -1408901367);
                  }
               }

               var1.aw(var23.ae, 0, var23.am * -1689308347, -495827770);
               var17 = false;
               break label127;
            } catch (Exception var21) {
               var17 = false;
            } finally {
               if (var17) {
                  try {
                     var1.ak(543758184);
                  } catch (Exception var18) {
                  }

               }
            }

            try {
               var1.ak(-400752022);
            } catch (Exception var19) {
            }
            break label128;
         }

         try {
            var1.ak(1575539579);
         } catch (Exception var20) {
         }
      }

      this.ay = false;
      this.as = ck.ap(-1437505298) * 6037837368328749809L;
   }

   void bb() {
      un var1 = this.ae(true, 1117172637);
      boolean var17 = false;

      label128: {
         label127: {
            try {
               var17 = true;
               int var2 = 3;
               int var3 = 0;
               Iterator var4 = this.aj.entrySet().iterator();

               while(var4.hasNext()) {
                  Entry var5 = (Entry)var4.next();
                  int var6 = (Integer)var5.getKey();
                  if (this.ak[var6]) {
                     Object var7 = var5.getValue();
                     var2 += 3;
                     if (var7 instanceof Integer) {
                        var2 += 4;
                     } else if (var7 instanceof String) {
                        var2 += ct.bl((String)var7, -1235055844);
                     }

                     ++var3;
                  }
               }

               vl var23 = new vl(var2);
               var23.bo(2, -1253001101);
               var23.bd(var3, (byte)-14);
               Iterator var24 = this.aj.entrySet().iterator();

               while(var24.hasNext()) {
                  Entry var25 = (Entry)var24.next();
                  int var26 = (Integer)var25.getKey();
                  if (this.ak[var26]) {
                     var23.bd(var26, (byte)-4);
                     Object var8 = var25.getValue();
                     ui var9 = ui.ak(var8.getClass(), 1777079284);
                     var23.bo(var9.ai * 648574241, 1070970574);
                     ui.aj(var8, var23, 2060241329);
                  }
               }

               var1.aw(var23.ae, 0, var23.am * 31646731, -1233826372);
               var17 = false;
               break label127;
            } catch (Exception var21) {
               var17 = false;
            } finally {
               if (var17) {
                  try {
                     var1.ak(-550304910);
                  } catch (Exception var18) {
                  }

               }
            }

            try {
               var1.ak(1437714057);
            } catch (Exception var19) {
            }
            break label128;
         }

         try {
            var1.ak(-1783473521);
         } catch (Exception var20) {
         }
      }

      this.ay = false;
      this.as = ck.ap(-2060810015) * 6037837368328749809L;
   }

   void bq() {
      un var1 = this.ae(false, 1117172637);
      boolean var21 = false;

      label253: {
         label254: {
            label247: {
               label246: {
                  try {
                     var21 = true;
                     byte[] var2 = new byte[(int)var1.ai((byte)0)];

                     int var4;
                     for(int var3 = 0; var3 < var2.length; var3 += var4) {
                        var4 = var1.ay(var2, var3, var2.length - var3, 1203491534);
                        if (-1 == var4) {
                           throw new EOFException();
                        }
                     }

                     vl var29 = new vl(var2);
                     if (var29.ae.length - -1689308347 * var29.am < 1) {
                        var21 = false;
                        break label247;
                     }

                     int var5 = var29.cy((short)-7040);
                     if (var5 < 0) {
                        var21 = false;
                        break label254;
                     }

                     if (var5 > 2) {
                        var21 = false;
                        break label254;
                     }

                     int var6;
                     int var7;
                     int var8;
                     int var9;
                     if (var5 >= 2) {
                        var6 = var29.ce(1818620231);

                        for(var7 = 0; var7 < var6; ++var7) {
                           var8 = var29.ce(1266000148);
                           var9 = var29.cy((short)-21781);
                           ui var10 = (ui)gu.ap(ui.ap((byte)29), var9, -1875781163);
                           Object var11 = var10.ay(var29, (byte)1);
                           if (var8 >= 0 && var8 < this.ak.length && this.ak[var8]) {
                              this.aj.put(var8, var11);
                           }
                        }

                        var21 = false;
                     } else {
                        var6 = var29.ce(1081900184);

                        for(var7 = 0; var7 < var6; ++var7) {
                           var8 = var29.ce(1542699975);
                           var9 = var29.ch(1203709469);
                           if (var8 >= 0 && var8 < this.ak.length && this.ak[var8]) {
                              this.aj.put(var8, var9);
                           }
                        }

                        var7 = var29.ce(1228277878);

                        for(var8 = 0; var8 < var7; ++var8) {
                           var29.ce(138397983);
                           var29.cw(1939742054);
                        }

                        var21 = false;
                     }
                  } catch (Exception var27) {
                     var21 = false;
                     break label246;
                  } finally {
                     if (var21) {
                        try {
                           var1.ak(-1195230726);
                        } catch (Exception var22) {
                        }

                     }
                  }

                  try {
                     var1.ak(-302895482);
                  } catch (Exception var25) {
                  }
                  break label253;
               }

               try {
                  var1.ak(1813266359);
               } catch (Exception var24) {
               }
               break label253;
            }

            try {
               var1.ak(347094103);
            } catch (Exception var23) {
            }

            return;
         }

         try {
            var1.ak(-2020819284);
         } catch (Exception var26) {
         }

         return;
      }

      this.ay = false;
   }

   boolean bn() {
      return this.ay;
   }

   void bz() {
      if (this.ay && this.as * -374131008840126959L < ck.ap(-1611059944) - 60000L) {
         this.am(-419127453);
      }

   }

   void bh() {
      int var1;
      for(var1 = 0; var1 < this.ak.length; ++var1) {
         if (!this.ak[var1]) {
            this.aj.remove(var1);
         }
      }

      for(var1 = 0; var1 < this.ai.length; ++var1) {
         this.ai[var1] = null;
      }

   }

   boolean by() {
      return this.ay;
   }

   boolean br() {
      return this.ay;
   }

   void ak(int var1, String var2, int var3) {
      try {
         this.aj.put(var1, var2);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "em.ak(" + ')');
      }
   }
}
