import java.util.LinkedList;

public abstract class lk {
   short[][][] af;
   int ay;
   int at;
   static final int bv = 3;
   int as;
   short[][][] ao;
   int au;
   int an;
   int ae;
   int am;
   byte[][][] ar;
   byte[][][] ab;
   lr[][][][] az;
   boolean ag;
   boolean ad;
   int ai;
   static boolean dk;

   void av(int var1, int var2, vl var3, short var4) {
      try {
         int var5 = var3.cy((short)-17673);
         if (0 == var5) {
            if (var4 == 132) {
               ;
            }
         } else {
            if ((var5 & 1) != 0) {
               if (var4 != 132) {
                  throw new IllegalStateException();
               }

               this.ax(var1, var2, var3, var5, -1452229835);
            } else {
               this.aq(var1, var2, var3, var5, 593874839);
            }

         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "lk.av(" + ')');
      }
   }

   void ad(pe var1, int var2) {
      try {
         if (this.ag(-1359252323)) {
            if (var2 >= 16711935) {
               throw new IllegalStateException();
            }
         } else {
            byte[] var3 = var1.bm(-1259217325 * this.au, 159462891 * this.an, 1017738354);
            if (var3 != null) {
               this.aw(new vl(var3), 506593636);
               this.ag = true;
               this.ad = true;
            }

         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "lk.ad(" + ')');
      }
   }

   void bx(int var1, int var2, vl var3) {
      int var4 = var3.cy((short)-12081);
      if (0 != var4) {
         if ((var4 & 1) != 0) {
            this.ax(var1, var2, var3, var4, -1608989257);
         } else {
            this.aq(var1, var2, var3, var4, 399457558);
         }

      }
   }

   int al(byte var1) {
      try {
         return -675862191 * this.as;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "lk.al(" + ')');
      }
   }

   boolean ah() {
      return this.ag && this.ad;
   }

   static final void mb(ng var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      try {
         if (client.kk) {
            if (var7 == 980355100) {
               throw new IllegalStateException();
            }

            client.kq = -209120480;
         } else {
            client.kq = 0;
         }

         int var8;
         label152: {
            client.kk = false;
            if (-1161885443 * bc.at != 1) {
               if (fq.ez) {
                  break label152;
               }

               if (var7 == 980355100) {
                  throw new IllegalStateException();
               }

               if (-1161885443 * bc.at != 4) {
                  break label152;
               }

               if (var7 == 980355100) {
                  return;
               }
            }

            if (var5 >= var1 && var5 < var1 + 16) {
               if (var7 == 980355100) {
                  throw new IllegalStateException();
               }

               if (var6 >= var2) {
                  if (var7 == 980355100) {
                     throw new IllegalStateException();
                  }

                  if (var6 < var2 + 16) {
                     if (var7 == 980355100) {
                        throw new IllegalStateException();
                     }

                     var0.bl -= -1288451444;
                     ek.mp(var0, 1588787899);
                     break label152;
                  }
               }
            }

            if (var5 >= var1 && var5 < var1 + 16) {
               if (var7 == 980355100) {
                  throw new IllegalStateException();
               }

               if (var6 >= var2 + var3 - 16) {
                  if (var7 == 980355100) {
                     throw new IllegalStateException();
                  }

                  if (var6 < var3 + var2) {
                     if (var7 == 980355100) {
                        throw new IllegalStateException();
                     }

                     var0.bl += -1288451444;
                     ek.mp(var0, 1436516022);
                     break label152;
                  }
               }
            }

            if (var5 >= var1 - client.kq * -833516631) {
               if (var7 == 980355100) {
                  throw new IllegalStateException();
               }

               if (var5 < 16 + var1 + -833516631 * client.kq && var6 >= var2 + 16) {
                  if (var7 == 980355100) {
                     return;
                  }

                  if (var6 < var3 + var2 - 16) {
                     if (var7 == 980355100) {
                        throw new IllegalStateException();
                     }

                     var8 = var3 * (var3 - 32) / var4;
                     if (var8 < 8) {
                        var8 = 8;
                     }

                     int var9 = var6 - var2 - 16 - var8 / 2;
                     int var10 = var3 - 32 - var8;
                     var0.bl = var9 * (var4 - var3) / var10 * -322112861;
                     ek.mp(var0, 1393728535);
                     client.kk = true;
                  }
               }
            }
         }

         if (-229300643 * client.qm != 0) {
            if (var7 == 980355100) {
               throw new IllegalStateException();
            }

            var8 = 2013768333 * var0.bo;
            if (var5 >= var1 - var8) {
               if (var7 == 980355100) {
                  throw new IllegalStateException();
               }

               if (var6 >= var2) {
                  if (var7 == 980355100) {
                     throw new IllegalStateException();
                  }

                  if (var5 < var1 + 16) {
                     if (var7 == 980355100) {
                        throw new IllegalStateException();
                     }

                     if (var6 <= var3 + var2) {
                        if (var7 == 980355100) {
                           return;
                        }

                        var0.bl += 1385845931 * client.qm;
                        ek.mp(var0, 1790530719);
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var11) {
         throw tm.aw(var11, "lk.mb(" + ')');
      }
   }

   void aq(int var1, int var2, vl var3, int var4, int var5) {
      try {
         int var6 = 1 + ((var4 & 24) >> 3);
         boolean var10000;
         if (0 != (var4 & 2)) {
            if (var5 >= 795476794) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var7 = var10000;
         if (0 != (var4 & 4)) {
            if (var5 >= 795476794) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var8 = var10000;
         this.ao[0][var1][var2] = (short)var3.ce(993931228);
         int var9;
         int var10;
         int var12;
         if (var7) {
            if (var5 >= 795476794) {
               throw new IllegalStateException();
            }

            var9 = var3.cy((short)-21792);

            for(var10 = 0; var10 < var9; ++var10) {
               if (var5 >= 795476794) {
                  throw new IllegalStateException();
               }

               int var11 = var3.ce(131704128);
               if (0 != var11) {
                  if (var5 >= 795476794) {
                     throw new IllegalStateException();
                  }

                  this.af[var10][var1][var2] = (short)var11;
                  var12 = var3.cy((short)-10217);
                  this.ar[var10][var1][var2] = (byte)(var12 >> 2);
                  this.ab[var10][var1][var2] = (byte)(var12 & 3);
               }
            }
         }

         if (var8) {
            if (var5 >= 795476794) {
               throw new IllegalStateException();
            }

            for(var9 = 0; var9 < var6; ++var9) {
               if (var5 >= 795476794) {
                  throw new IllegalStateException();
               }

               var10 = var3.cy((short)-2681);
               if (var10 != 0) {
                  lr[] var16 = this.az[var9][var1][var2] = new lr[var10];

                  for(var12 = 0; var12 < var10; ++var12) {
                     if (var5 >= 795476794) {
                        throw new IllegalStateException();
                     }

                     int var13 = var3.dr(502659);
                     int var14 = var3.cy((short)-29335);
                     var16[var12] = new lr(var13, var14 >> 2, var14 & 3);
                  }
               }
            }
         }

      } catch (RuntimeException var15) {
         throw tm.aw(var15, "lk.aq(" + ')');
      }
   }

   int bz() {
      return this.ae * 987678719;
   }

   int bp() {
      return this.ae * 1766338761;
   }

   int aa(byte var1) {
      try {
         return this.ae * -1304526755;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "lk.aa(" + ')');
      }
   }

   abstract void ay(vl var1);

   abstract void as(vl var1);

   abstract void aw(vl var1, int var2);

   boolean bh() {
      return this.ag && this.ad;
   }

   void bj(pe var1) {
      if (!this.ag(-2004127421)) {
         byte[] var2 = var1.bm(-1259217325 * this.au, -511384332 * this.an, 1816692888);
         if (var2 != null) {
            this.aw(new vl(var2), 518363451);
            this.ag = true;
            this.ad = true;
         }

      }
   }

   void bv(int var1, int var2, vl var3) {
      int var4 = var3.cy((short)-12218);
      if (0 != var4) {
         if ((var4 & 1) != 0) {
            this.ax(var1, var2, var3, var4, -1739913013);
         } else {
            this.aq(var1, var2, var3, var4, -542454718);
         }

      }
   }

   boolean ag(int var1) {
      try {
         boolean var10000;
         if (this.ag) {
            if (var1 >= 253350130) {
               throw new IllegalStateException();
            }

            if (this.ad) {
               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "lk.ag(" + ')');
      }
   }

   void bk(int var1, int var2, vl var3, int var4) {
      boolean var5 = 0 != (var4 & 2);
      if (var5) {
         this.af[0][var1][var2] = (short)var3.ce(434120709);
      }

      this.ao[0][var1][var2] = (short)var3.ce(1635247896);
   }

   int bb() {
      return -675862191 * this.as;
   }

   int bq() {
      return this.ae * 1810930273;
   }

   int by() {
      return this.ae * -361459900;
   }

   void ax(int var1, int var2, vl var3, int var4, int var5) {
      try {
         boolean var6 = 0 != (var4 & 2);
         if (var6) {
            if (var5 >= -1406397244) {
               return;
            }

            this.af[0][var1][var2] = (short)var3.ce(1779716349);
         }

         this.ao[0][var1][var2] = (short)var3.ce(1425126553);
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "lk.ax(" + ')');
      }
   }

   int bc() {
      return this.ae * -1304526755;
   }

   void ac(byte var1) {
      try {
         this.ao = (short[][][])null;
         this.af = (short[][][])null;
         this.ar = (byte[][][])null;
         this.ab = (byte[][][])null;
         this.az = (lr[][][][])null;
         this.ag = false;
         this.ad = false;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "lk.ac(" + ')');
      }
   }

   static int ar(int var0, da var1, boolean var2, int var3) {
      try {
         ng var10000;
         if (var2) {
            if (var3 <= 493825099) {
               throw new IllegalStateException();
            }

            var10000 = vx.ar;
         } else {
            var10000 = ac.af;
         }

         ng var4 = var10000;
         if (1600 == var0) {
            cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 336181451 * var4.bg;
            return 1;
         } else if (var0 == 1601) {
            if (var3 <= 493825099) {
               throw new IllegalStateException();
            } else {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = -291221237 * var4.bl;
               return 1;
            }
         } else {
            nz var10;
            if (1602 == var0) {
               if (12 == -1973680119 * var4.bk) {
                  if (var3 <= 493825099) {
                     throw new IllegalStateException();
                  }

                  var10 = var4.bn(-1919645375);
                  if (var10 != null) {
                     if (var3 <= 493825099) {
                        throw new IllegalStateException();
                     }

                     cm.at[(ih.au += 746573637) * -114988147 - 1] = var10.bg(-1429138349).ay(-1112287638);
                     return 1;
                  }
               }

               cm.at[(ih.au += 746573637) * -114988147 - 1] = var4.dx;
               return 1;
            } else if (1603 == var0) {
               if (var3 <= 493825099) {
                  throw new IllegalStateException();
               } else {
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var4.be * -1378813425;
                  return 1;
               }
            } else if (var0 == 1604) {
               if (var3 <= 493825099) {
                  throw new IllegalStateException();
               } else {
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 1283703355 * var4.cq;
                  return 1;
               }
            } else if (var0 == 1605) {
               if (var3 <= 493825099) {
                  throw new IllegalStateException();
               } else {
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = -893848959 * var4.dh;
                  return 1;
               }
            } else if (var0 == 1606) {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var4.dc * 1427564929;
               return 1;
            } else if (1607 == var0) {
               if (var3 <= 493825099) {
                  throw new IllegalStateException();
               } else {
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = -1507254525 * var4.dr;
                  return 1;
               }
            } else if (1608 == var0) {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = -1468148137 * var4.da;
               return 1;
            } else if (1609 == var0) {
               if (var3 <= 493825099) {
                  throw new IllegalStateException();
               } else {
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 1531197233 * var4.cl;
                  return 1;
               }
            } else if (var0 == 1610) {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var4.cp * -821846975;
               return 1;
            } else if (var0 == 1611) {
               if (var3 <= 493825099) {
                  throw new IllegalStateException();
               } else {
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 530370357 * var4.cb;
                  return 1;
               }
            } else if (var0 == 1612) {
               if (var3 <= 493825099) {
                  throw new IllegalStateException();
               } else {
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 1613644311 * var4.cd;
                  return 1;
               }
            } else if (1613 == var0) {
               if (var3 <= 493825099) {
                  throw new IllegalStateException();
               } else {
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var4.cf.aw(1837624059);
                  return 1;
               }
            } else if (var0 == 1614) {
               if (var3 <= 493825099) {
                  throw new IllegalStateException();
               } else {
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var4.dl ? 1 : 0;
                  return 1;
               }
            } else {
               ny var5;
               int[] var11;
               int var10001;
               int var10002;
               if (1617 == var0) {
                  var5 = var4.bu((byte)22);
                  var11 = cm.ae;
                  var10001 = (dp.am += -1450976103) * -158156887 - 1;
                  if (null != var5) {
                     if (var3 <= 493825099) {
                        throw new IllegalStateException();
                     }

                     var10002 = var5.ap * 1282670187;
                  } else {
                     var10002 = 0;
                  }

                  var11[var10001] = var10002;
               }

               if (1618 == var0) {
                  if (var3 <= 493825099) {
                     throw new IllegalStateException();
                  } else {
                     var5 = var4.bu((byte)-31);
                     var11 = cm.ae;
                     var10001 = (dp.am += -1450976103) * -158156887 - 1;
                     if (var5 != null) {
                        if (var3 <= 493825099) {
                           throw new IllegalStateException();
                        }

                        var10002 = var5.aw * -1451237455;
                     } else {
                        var10002 = 0;
                     }

                     var11[var10001] = var10002;
                     return 1;
                  }
               } else {
                  String[] var13;
                  String var14;
                  if (1619 == var0) {
                     var10 = var4.bn(-1919645375);
                     var13 = cm.at;
                     var10001 = (ih.au += 746573637) * -114988147 - 1;
                     if (null != var10) {
                        if (var3 <= 493825099) {
                           throw new IllegalStateException();
                        }

                        var14 = var10.bl(-2036150367).ay(664788125);
                     } else {
                        var14 = "";
                     }

                     var13[var10001] = var14;
                     return 1;
                  } else if (var0 == 1620) {
                     if (var3 <= 493825099) {
                        throw new IllegalStateException();
                     } else {
                        var5 = var4.bu((byte)74);
                        var11 = cm.ae;
                        var10001 = (dp.am += -1450976103) * -158156887 - 1;
                        if (null != var5) {
                           if (var3 <= 493825099) {
                              throw new IllegalStateException();
                           }

                           var10002 = -1714296733 * var5.ak;
                        } else {
                           var10002 = 0;
                        }

                        var11[var10001] = var10002;
                        return 1;
                     }
                  } else if (var0 == 1621) {
                     if (var3 <= 493825099) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bn(-1919645375);
                        var11 = cm.ae;
                        var10001 = (dp.am += -1450976103) * -158156887 - 1;
                        if (var10 != null) {
                           if (var3 <= 493825099) {
                              throw new IllegalStateException();
                           }

                           var10002 = var10.cp((byte)-27);
                        } else {
                           var10002 = 0;
                        }

                        var11[var10001] = var10002;
                        return 1;
                     }
                  } else if (1622 == var0) {
                     if (var3 <= 493825099) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bn(-1919645375);
                        var11 = cm.ae;
                        var10001 = (dp.am += -1450976103) * -158156887 - 1;
                        if (var10 != null) {
                           if (var3 <= 493825099) {
                              throw new IllegalStateException();
                           }

                           var10002 = var10.cv(-1894876028);
                        } else {
                           var10002 = 0;
                        }

                        var11[var10001] = var10002;
                        return 1;
                     }
                  } else if (1623 == var0) {
                     var10 = var4.bn(-1919645375);
                     var11 = cm.ae;
                     var10001 = (dp.am += -1450976103) * -158156887 - 1;
                     if (var10 != null) {
                        if (var3 <= 493825099) {
                           throw new IllegalStateException();
                        }

                        var10002 = var10.cy((short)158);
                     } else {
                        var10002 = 0;
                     }

                     var11[var10001] = var10002;
                     return 1;
                  } else if (1624 == var0) {
                     if (var3 <= 493825099) {
                        throw new IllegalStateException();
                     } else {
                        byte var15;
                        label434: {
                           var10 = var4.bn(-1919645375);
                           var11 = cm.ae;
                           var10001 = (dp.am += -1450976103) * -158156887 - 1;
                           if (null != var10) {
                              if (var3 <= 493825099) {
                                 throw new IllegalStateException();
                              }

                              if (var10.cq((byte)26)) {
                                 if (var3 <= 493825099) {
                                    throw new IllegalStateException();
                                 }

                                 var15 = 1;
                                 break label434;
                              }
                           }

                           var15 = 0;
                        }

                        var11[var10001] = var15;
                        return 1;
                     }
                  } else if (var0 == 1625) {
                     if (var3 <= 493825099) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bn(-1919645375);
                        cm.ae[(dp.am += -1450976103) * -158156887 - 1] = null != var10 && var10.cb(129301400) ? 1 : 0;
                        return 1;
                     }
                  } else if (1626 == var0) {
                     if (var3 <= 493825099) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bn(-1919645375);
                        var13 = cm.at;
                        var10001 = (ih.au += 746573637) * -114988147 - 1;
                        if (var10 != null) {
                           if (var3 <= 493825099) {
                              throw new IllegalStateException();
                           }

                           var14 = var10.be(-1170792501).ap(1636553700);
                        } else {
                           var14 = "";
                        }

                        var13[var10001] = var14;
                        return 1;
                     }
                  } else if (var0 == 1627) {
                     if (var3 <= 493825099) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bn(-1919645375);
                        int var12;
                        if (var10 != null) {
                           if (var3 <= 493825099) {
                              throw new IllegalStateException();
                           }

                           var12 = var10.cn((byte)13);
                        } else {
                           var12 = 0;
                        }

                        int var6 = var12;
                        if (var10 != null) {
                           if (var3 <= 493825099) {
                              throw new IllegalStateException();
                           }

                           var12 = var10.ci(-2142134601);
                        } else {
                           var12 = 0;
                        }

                        int var7 = var12;
                        cm.ae[(dp.am += -1450976103) * -158156887 - 1] = Math.min(var6, var7);
                        cm.ae[(dp.am += -1450976103) * -158156887 - 1] = Math.max(var6, var7);
                        return 1;
                     }
                  } else if (var0 == 1628) {
                     if (var3 <= 493825099) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bn(-1919645375);
                        var11 = cm.ae;
                        var10001 = (dp.am += -1450976103) * -158156887 - 1;
                        if (null != var10) {
                           if (var3 <= 493825099) {
                              throw new IllegalStateException();
                           }

                           var10002 = var10.ci(-1066459287);
                        } else {
                           var10002 = 0;
                        }

                        var11[var10001] = var10002;
                        return 1;
                     }
                  } else if (1629 == var0) {
                     var10 = var4.bn(-1919645375);
                     var11 = cm.ae;
                     var10001 = (dp.am += -1450976103) * -158156887 - 1;
                     if (null != var10) {
                        if (var3 <= 493825099) {
                           throw new IllegalStateException();
                        }

                        var10002 = var10.ce(-1464938968);
                     } else {
                        var10002 = 0;
                     }

                     var11[var10001] = var10002;
                     return 1;
                  } else if (var0 == 1630) {
                     if (var3 <= 493825099) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bn(-1919645375);
                        var11 = cm.ae;
                        var10001 = (dp.am += -1450976103) * -158156887 - 1;
                        if (null != var10) {
                           if (var3 <= 493825099) {
                              throw new IllegalStateException();
                           }

                           var10002 = var10.cu((byte)-103);
                        } else {
                           var10002 = 0;
                        }

                        var11[var10001] = var10002;
                        return 1;
                     }
                  } else if (1631 == var0) {
                     var10 = var4.bn(-1919645375);
                     var11 = cm.ae;
                     var10001 = (dp.am += -1450976103) * -158156887 - 1;
                     if (var10 != null) {
                        if (var3 <= 493825099) {
                           throw new IllegalStateException();
                        }

                        var10002 = var10.cg(-1195847563);
                     } else {
                        var10002 = 0;
                     }

                     var11[var10001] = var10002;
                     return 1;
                  } else if (var0 == 1632) {
                     if (var3 <= 493825099) {
                        throw new IllegalStateException();
                     } else {
                        var10 = var4.bn(-1919645375);
                        var11 = cm.ae;
                        var10001 = (dp.am += -1450976103) * -158156887 - 1;
                        if (var10 != null) {
                           if (var3 <= 493825099) {
                              throw new IllegalStateException();
                           }

                           var10002 = var10.cx(1744670016);
                        } else {
                           var10002 = 0;
                        }

                        var11[var10001] = var10002;
                        return 1;
                     }
                  } else {
                     bj var9;
                     if (1633 == var0) {
                        if (var3 <= 493825099) {
                           throw new IllegalStateException();
                        } else {
                           var9 = var4.bt(-740681971);
                           var11 = cm.ae;
                           var10001 = -158156887 * dp.am - 1;
                           if (var9 != null) {
                              if (var3 <= 493825099) {
                                 throw new IllegalStateException();
                              }

                              var10002 = var9.ak(cm.ae[-158156887 * dp.am - 1], (byte)61);
                           } else {
                              var10002 = 0;
                           }

                           var11[var10001] = var10002;
                           return 1;
                        }
                     } else if (var0 == 1634) {
                        if (var3 <= 493825099) {
                           throw new IllegalStateException();
                        } else {
                           var9 = var4.bt(1130249010);
                           var11 = cm.ae;
                           var10001 = -158156887 * dp.am - 1;
                           if (null != var9) {
                              if (var3 <= 493825099) {
                                 throw new IllegalStateException();
                              }

                              var10002 = var9.aj((char)cm.ae[-158156887 * dp.am - 1], -611571839);
                           } else {
                              var10002 = 0;
                           }

                           var11[var10001] = var10002;
                           return 1;
                        }
                     } else {
                        return 2;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "lk.ar(" + ')');
      }
   }

   public static void ap(nu var0, byte var1) {
      try {
         oh.ap = var0;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "lk.ap(" + ')');
      }
   }

   lk() {
      try {
         super();
         this.au = -729683419;
         this.an = -1702513347;
         new LinkedList();
         this.ag = false;
         this.ad = false;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "lk.<init>(" + ')');
      }
   }

   public static void aw(int var0, int var1, byte var2) {
      try {
         hg var4 = (hg)hg.aw.ap((long)var0);
         hg var3;
         if (var4 != null) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            var3 = var4;
         } else {
            byte[] var5 = hg.ap.bm(14, var0, 1821924455);
            var4 = new hg();
            if (var5 != null) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               var4.aw(new vl(var5), -872050265);
            }

            hg.aw.ak(var4, (long)var0);
            var3 = var4;
         }

         int var6;
         int var8;
         int var10;
         label46: {
            var10 = var3.ak * 201276445;
            var6 = var3.aj * 346325327;
            int var7 = -1432610793 * var3.ai;
            var8 = nb.ap[var7 - var6];
            if (var1 >= 0) {
               if (var2 >= 0) {
                  return;
               }

               if (var1 <= var8) {
                  break label46;
               }

               if (var2 >= 0) {
                  return;
               }
            }

            var1 = 0;
         }

         var8 <<= var6;
         nb.aj[var10] = nb.aj[var10] & ~var8 | var1 << var6 & var8;
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "lk.aw(" + ')');
      }
   }
}
