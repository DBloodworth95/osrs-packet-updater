public class dk extends ju {
   final dd ac;
   final int ae;
   if at;
   final int am;
   final int ag;
   final int aq;
   final int ax;
   final int af;
   int au;
   int ar;
   static int tf;

   protected final jm ah() {
      id var1 = kf.ae(this.ae * 1229616605, (byte)11);
      if (null != var1.bz) {
         var1 = var1.ad(-1534987154);
      }

      if (null == var1) {
         return null;
      } else {
         int var2;
         int var3;
         if (1 != this.am * -229054585 && this.am * -229054585 != 3) {
            var2 = -1298730649 * var1.aa;
            var3 = -1257293157 * var1.ai;
         } else {
            var2 = -1257293157 * var1.ai;
            var3 = var1.aa * -1298730649;
         }

         int var4 = (var2 >> 1) + 378589425 * this.aq;
         int var5 = (1 + var2 >> 1) + this.aq * 378589425;
         int var6 = (var3 >> 1) + this.af * -1588561167;
         int var7 = -1588561167 * this.af + (1 + var3 >> 1);
         int[][] var8 = this.ac.ar[-279200905 * this.ax];
         int var9 = var8[var5][var7] + var8[var5][var6] + var8[var4][var6] + var8[var4][var7] >> 2;
         int var10 = (378589425 * this.aq << 7) + (var2 << 6);
         int var11 = (var3 << 6) + (-1588561167 * this.af << 7);
         if (null != this.at) {
            int var12 = 1472813913 * client.do - -1815809313 * this.ar;
            if (var12 > 100 && this.at.ao * -1317182493 > 0) {
               var12 = 100;
            }

            if (!this.at.ad(-1687025656)) {
               label71: {
                  do {
                     while(true) {
                        if (var12 <= this.at.aa[this.au * -1034526735]) {
                           break label71;
                        }

                        var12 -= this.at.aa[this.au * -1034526735];
                        this.au += -321998575;
                        if (this.au * -1034526735 >= this.at.ab.length) {
                           this.au -= this.at.ao * 537761043;
                           break;
                        }

                        dq.ix(this.at, this.au * -1034526735, var10, var11, false, -537992194);
                     }
                  } while(-1034526735 * this.au >= 0 && this.au * -1034526735 < this.at.ab.length);

                  this.at = null;
               }
            } else {
               int var13 = this.at.ah(-581863565);
               this.au += -321998575 * var12;
               var12 = 0;
               if (-1034526735 * this.au >= var13) {
                  this.au = -321998575 * (var13 - -1317182493 * this.at.ao);
                  if (-1034526735 * this.au < 0 || -1034526735 * this.au > var13) {
                     this.at = null;
                  }
               }

               if (this.at != null) {
                  aw.ir(this.at, -1034526735 * this.au, var10, var11, false, 645815569);
               }
            }

            this.ar = -1749333729 * (1472813913 * client.do - var12);
         }

         return var1.ar(this.ag * 1106917505, this.am * -229054585, var8, var10, var9, var11, this.at, this.au * -1034526735, (byte)-20);
      }
   }

   dk(dd var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, ju var10) {
      try {
         super();
         this.ac = var1;
         this.ae = var2 * -1984198027;
         this.ag = var3 * 710805377;
         this.am = 1532243511 * var4;
         this.ax = -1882878393 * var5;
         this.aq = 1250172945 * var6;
         this.af = 1363752465 * var7;
         if (-1 != var8) {
            this.at = ds.ae(var8, -683358200);
            this.au = 0;
            this.ar = 1165062343 * client.do - -1749333729;
            if (this.at.bx * -124286531 == 0 && var10 instanceof dk) {
               dk var11 = (dk)var10;
               if (var11.at == this.at) {
                  this.au = 1 * var11.au;
                  this.ar = var11.ar * 1;
                  return;
               }
            }

            if (var9 && -1 != this.at.ao * -1317182493) {
               if (!this.at.ad(-1626862383)) {
                  this.au = (int)(Math.random() * (double)this.at.ab.length) * -321998575;
                  this.ar -= (int)(Math.random() * (double)this.at.aa[-1034526735 * this.au]) * -1749333729;
               } else {
                  this.au = (int)(Math.random() * (double)this.at.ah(-1577130529)) * -321998575;
               }
            }
         }

      } catch (RuntimeException var12) {
         throw vk.ae(var12, "dk.<init>(" + ')');
      }
   }

   static int bp(int var0, dt var1, boolean var2, short var3) {
      try {
         if (var0 == 5000) {
            if (var3 == 211) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = client.rz * 777193457;
               return 1;
            }
         } else if (5001 == var0) {
            if (var3 == 211) {
               throw new IllegalStateException();
            } else {
               mp.au -= -1274406581;
               client.rz = -242939631 * cs.at[mp.au * 844691753];
               gb.rm = dl.ac(cs.at[1 + 844691753 * mp.au], (byte)63);
               if (null == gb.rm) {
                  if (var3 == 211) {
                     throw new IllegalStateException();
                  }

                  gb.rm = ve.ae;
               }

               client.sd = 1669673427 * cs.at[mp.au * 844691753 + 2];
               mq var15 = fs.ac(mz.ce, client.ia.ax, (byte)-106);
               var15.ag.bu(777193457 * client.rz, (byte)98);
               var15.ag.bu(gb.rm.am * 52166545, (byte)18);
               var15.ag.bu(client.sd * -1761391013, (byte)83);
               client.ia.ag(var15, -1000578318);
               return 1;
            }
         } else {
            mq var7;
            String var9;
            int var10;
            int var12;
            if (5002 == var0) {
               if (var3 == 211) {
                  throw new IllegalStateException();
               } else {
                  var9 = cs.ar[(rt.al -= -1975882559) * -515103935];
                  mp.au -= 582051378;
                  var10 = cs.at[mp.au * 844691753];
                  var12 = cs.at[844691753 * mp.au + 1];
                  var7 = fs.ac(mz.bq, client.ia.ax, (byte)-30);
                  var7.ag.bu(uo.be(var9, -1729755732) + 2, (byte)-16);
                  var7.ag.bc(var9, -103816174);
                  var7.ag.bu(var10 - 1, (byte)28);
                  var7.ag.bu(var12, (byte)56);
                  client.ia.ag(var7, -726418301);
                  return 1;
               }
            } else {
               int var4;
               ct var6;
               String[] var10000;
               int[] var16;
               int var10001;
               byte var17;
               String var10002;
               if (5003 == var0) {
                  if (var3 == 211) {
                     throw new IllegalStateException();
                  } else {
                     mp.au -= 582051378;
                     var4 = cs.at[mp.au * 844691753];
                     var10 = cs.at[1 + mp.au * 844691753];
                     var6 = dh.am(var4, var10, (byte)-123);
                     if (var6 != null) {
                        cs.at[(mp.au += -1856457959) * 844691753 - 1] = var6.ac * -1313413877;
                        cs.at[(mp.au += -1856457959) * 844691753 - 1] = -1094423695 * var6.ae;
                        var10000 = cs.ar;
                        var10001 = (rt.al += -1975882559) * -515103935 - 1;
                        if (null != var6.am) {
                           if (var3 == 211) {
                              throw new IllegalStateException();
                           }

                           var10002 = var6.am;
                        } else {
                           var10002 = "";
                        }

                        var10000[var10001] = var10002;
                        var10000 = cs.ar;
                        var10001 = (rt.al += -1975882559) * -515103935 - 1;
                        if (var6.at != null) {
                           if (var3 == 211) {
                              throw new IllegalStateException();
                           }

                           var10002 = var6.at;
                        } else {
                           var10002 = "";
                        }

                        var10000[var10001] = var10002;
                        var10000 = cs.ar;
                        var10001 = (rt.al += -1975882559) * -515103935 - 1;
                        if (null != var6.au) {
                           if (var3 == 211) {
                              throw new IllegalStateException();
                           }

                           var10002 = var6.au;
                        } else {
                           var10002 = "";
                        }

                        var10000[var10001] = var10002;
                        var16 = cs.at;
                        var10001 = (mp.au += -1856457959) * 844691753 - 1;
                        if (var6.ag(-382112490)) {
                           if (var3 == 211) {
                              throw new IllegalStateException();
                           }

                           var17 = 1;
                        } else if (var6.aq(-589484696)) {
                           if (var3 == 211) {
                              throw new IllegalStateException();
                           }

                           var17 = 2;
                        } else {
                           var17 = 0;
                        }

                        var16[var10001] = var17;
                     } else {
                        cs.at[(mp.au += -1856457959) * 844691753 - 1] = -1;
                        cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
                        cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
                        cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
                        cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
                        cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
                     }

                     return 1;
                  }
               } else {
                  ct var5;
                  if (var0 == 5004) {
                     if (var3 == 211) {
                        throw new IllegalStateException();
                     } else {
                        var4 = cs.at[(mp.au -= -1856457959) * 844691753];
                        var5 = cq.ax(var4, (byte)1);
                        if (var5 != null) {
                           if (var3 == 211) {
                              throw new IllegalStateException();
                           }

                           cs.at[(mp.au += -1856457959) * 844691753 - 1] = var5.ag * 864676807;
                           cs.at[(mp.au += -1856457959) * 844691753 - 1] = var5.ae * -1094423695;
                           var10000 = cs.ar;
                           var10001 = (rt.al += -1975882559) * -515103935 - 1;
                           if (null != var5.am) {
                              if (var3 == 211) {
                                 throw new IllegalStateException();
                              }

                              var10002 = var5.am;
                           } else {
                              var10002 = "";
                           }

                           var10000[var10001] = var10002;
                           var10000 = cs.ar;
                           var10001 = (rt.al += -1975882559) * -515103935 - 1;
                           if (var5.at != null) {
                              if (var3 == 211) {
                                 throw new IllegalStateException();
                              }

                              var10002 = var5.at;
                           } else {
                              var10002 = "";
                           }

                           var10000[var10001] = var10002;
                           var10000 = cs.ar;
                           var10001 = (rt.al += -1975882559) * -515103935 - 1;
                           if (null != var5.au) {
                              if (var3 == 211) {
                                 throw new IllegalStateException();
                              }

                              var10002 = var5.au;
                           } else {
                              var10002 = "";
                           }

                           var10000[var10001] = var10002;
                           var16 = cs.at;
                           var10001 = (mp.au += -1856457959) * 844691753 - 1;
                           if (var5.ag(275227828)) {
                              if (var3 == 211) {
                                 throw new IllegalStateException();
                              }

                              var17 = 1;
                           } else if (var5.aq(777925226)) {
                              if (var3 == 211) {
                                 throw new IllegalStateException();
                              }

                              var17 = 2;
                           } else {
                              var17 = 0;
                           }

                           var16[var10001] = var17;
                        } else {
                           cs.at[(mp.au += -1856457959) * 844691753 - 1] = -1;
                           cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
                           cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
                           cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
                           cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
                           cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
                        }

                        return 1;
                     }
                  } else if (5005 == var0) {
                     if (var3 == 211) {
                        throw new IllegalStateException();
                     } else {
                        if (null == gb.rm) {
                           if (var3 == 211) {
                              throw new IllegalStateException();
                           }

                           cs.at[(mp.au += -1856457959) * 844691753 - 1] = -1;
                        } else {
                           cs.at[(mp.au += -1856457959) * 844691753 - 1] = gb.rm.am * 52166545;
                        }

                        return 1;
                     }
                  } else {
                     mq var13;
                     if (5008 == var0) {
                        if (var3 == 211) {
                           throw new IllegalStateException();
                        } else {
                           var9 = cs.ar[(rt.al -= -1975882559) * -515103935];
                           var10 = cs.at[(mp.au -= -1856457959) * 844691753];
                           var13 = qh.ac(var10, var9, dn.cy, -1, (byte)-118);
                           client.ia.ag(var13, 1754822187);
                           return 1;
                        }
                     } else if (var0 == 5009) {
                        if (var3 == 211) {
                           throw new IllegalStateException();
                        } else {
                           rt.al -= 343202178;
                           var9 = cs.ar[-515103935 * rt.al];
                           String var11 = cs.ar[rt.al * -515103935 + 1];
                           var13 = fs.ac(mz.bh, client.ia.ax, (byte)-101);
                           var13.ag.br(0, 1625888552);
                           int var14 = -1027766515 * var13.ag.au;
                           var13.ag.bc(var9, -1879825985);
                           lc.ae(var13.ag, var11, 1937703142);
                           var13.ag.cx(-1027766515 * var13.ag.au - var14, (byte)40);
                           client.ia.ag(var13, 1870805212);
                           return 1;
                        }
                     } else if (5010 == var0) {
                        var9 = cs.ar[(rt.al -= -1975882559) * -515103935];
                        mp.au -= 582051378;
                        var10 = cs.at[mp.au * 844691753];
                        var12 = cs.at[844691753 * mp.au + 1];
                        var7 = qh.ac(var10, var9, dn.cy, var12, (byte)-37);
                        client.ia.ag(var7, 2020701093);
                        return 1;
                     } else if (var0 == 5015) {
                        if (var3 == 211) {
                           throw new IllegalStateException();
                        } else {
                           label451: {
                              if (qm.mm != null) {
                                 if (var3 == 211) {
                                    throw new IllegalStateException();
                                 }

                                 if (qm.mm.ac != null) {
                                    var9 = qm.mm.ac.ac((byte)100);
                                    break label451;
                                 }
                              }

                              var9 = "";
                           }

                           cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var9;
                           return 1;
                        }
                     } else if (var0 == 5016) {
                        if (var3 == 211) {
                           throw new IllegalStateException();
                        } else {
                           cs.at[(mp.au += -1856457959) * 844691753 - 1] = -1761391013 * client.sd;
                           return 1;
                        }
                     } else if (5017 == var0) {
                        if (var3 == 211) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cs.at[(mp.au -= -1856457959) * 844691753];
                           cs.at[(mp.au += -1856457959) * 844691753 - 1] = hf.aq(var4, (byte)47);
                           return 1;
                        }
                     } else if (5018 == var0) {
                        if (var3 == 211) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cs.at[(mp.au -= -1856457959) * 844691753];
                           cs.at[(mp.au += -1856457959) * 844691753 - 1] = go.au(var4, (byte)-41);
                           return 1;
                        }
                     } else if (5019 == var0) {
                        if (var3 == 211) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cs.at[(mp.au -= -1856457959) * 844691753];
                           cs.at[(mp.au += -1856457959) * 844691753 - 1] = cw.at(var4, (byte)-106);
                           return 1;
                        }
                     } else if (5020 == var0) {
                        if (var3 == 211) {
                           throw new IllegalStateException();
                        } else {
                           var9 = cs.ar[(rt.al -= -1975882559) * -515103935];
                           gh.iy(var9, -246189887);
                           return 1;
                        }
                     } else if (5021 == var0) {
                        if (var3 == 211) {
                           throw new IllegalStateException();
                        } else {
                           client.sp = cs.ar[(rt.al -= -1975882559) * -515103935].toLowerCase().trim();
                           return 1;
                        }
                     } else if (var0 == 5022) {
                        if (var3 == 211) {
                           throw new IllegalStateException();
                        } else {
                           cs.ar[(rt.al += -1975882559) * -515103935 - 1] = client.sp;
                           return 1;
                        }
                     } else if (var0 == 5023) {
                        if (var3 == 211) {
                           throw new IllegalStateException();
                        } else {
                           var9 = cs.ar[(rt.al -= -1975882559) * -515103935];
                           System.out.println(var9);
                           return 1;
                        }
                     } else if (5030 == var0) {
                        if (var3 == 211) {
                           throw new IllegalStateException();
                        } else {
                           mp.au -= 582051378;
                           var4 = cs.at[844691753 * mp.au];
                           var10 = cs.at[1 + mp.au * 844691753];
                           var6 = dh.am(var4, var10, (byte)-17);
                           if (null != var6) {
                              if (var3 == 211) {
                                 throw new IllegalStateException();
                              }

                              cs.at[(mp.au += -1856457959) * 844691753 - 1] = -1313413877 * var6.ac;
                              cs.at[(mp.au += -1856457959) * 844691753 - 1] = -1094423695 * var6.ae;
                              cs.ar[(rt.al += -1975882559) * -515103935 - 1] = null != var6.am ? var6.am : "";
                              var10000 = cs.ar;
                              var10001 = (rt.al += -1975882559) * -515103935 - 1;
                              if (null != var6.at) {
                                 if (var3 == 211) {
                                    throw new IllegalStateException();
                                 }

                                 var10002 = var6.at;
                              } else {
                                 var10002 = "";
                              }

                              var10000[var10001] = var10002;
                              var10000 = cs.ar;
                              var10001 = (rt.al += -1975882559) * -515103935 - 1;
                              if (var6.au != null) {
                                 if (var3 == 211) {
                                    throw new IllegalStateException();
                                 }

                                 var10002 = var6.au;
                              } else {
                                 var10002 = "";
                              }

                              var10000[var10001] = var10002;
                              var16 = cs.at;
                              var10001 = (mp.au += -1856457959) * 844691753 - 1;
                              if (var6.ag(2142270793)) {
                                 if (var3 == 211) {
                                    throw new IllegalStateException();
                                 }

                                 var17 = 1;
                              } else if (var6.aq(-234389634)) {
                                 if (var3 == 211) {
                                    throw new IllegalStateException();
                                 }

                                 var17 = 2;
                              } else {
                                 var17 = 0;
                              }

                              var16[var10001] = var17;
                              cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
                              cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
                           } else {
                              cs.at[(mp.au += -1856457959) * 844691753 - 1] = -1;
                              cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
                              cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
                              cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
                              cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
                              cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
                              cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
                              cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
                           }

                           return 1;
                        }
                     } else if (var0 == 5031) {
                        if (var3 == 211) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cs.at[(mp.au -= -1856457959) * 844691753];
                           var5 = cq.ax(var4, (byte)1);
                           if (var5 != null) {
                              if (var3 == 211) {
                                 throw new IllegalStateException();
                              }

                              cs.at[(mp.au += -1856457959) * 844691753 - 1] = 864676807 * var5.ag;
                              cs.at[(mp.au += -1856457959) * 844691753 - 1] = var5.ae * -1094423695;
                              var10000 = cs.ar;
                              var10001 = (rt.al += -1975882559) * -515103935 - 1;
                              if (var5.am != null) {
                                 if (var3 == 211) {
                                    throw new IllegalStateException();
                                 }

                                 var10002 = var5.am;
                              } else {
                                 var10002 = "";
                              }

                              var10000[var10001] = var10002;
                              cs.ar[(rt.al += -1975882559) * -515103935 - 1] = null != var5.at ? var5.at : "";
                              var10000 = cs.ar;
                              var10001 = (rt.al += -1975882559) * -515103935 - 1;
                              if (null != var5.au) {
                                 if (var3 == 211) {
                                    throw new IllegalStateException();
                                 }

                                 var10002 = var5.au;
                              } else {
                                 var10002 = "";
                              }

                              var10000[var10001] = var10002;
                              var16 = cs.at;
                              var10001 = (mp.au += -1856457959) * 844691753 - 1;
                              if (var5.ag(-490450863)) {
                                 var17 = 1;
                              } else if (var5.aq(1710868292)) {
                                 if (var3 == 211) {
                                    throw new IllegalStateException();
                                 }

                                 var17 = 2;
                              } else {
                                 var17 = 0;
                              }

                              var16[var10001] = var17;
                              cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
                              cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
                           } else {
                              cs.at[(mp.au += -1856457959) * 844691753 - 1] = -1;
                              cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
                              cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
                              cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
                              cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
                              cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
                              cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
                              cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
                           }

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
         throw vk.ae(var8, "dk.bp(" + ')');
      }
   }

   protected final jm ad(byte var1) {
      try {
         id var2 = kf.ae(this.ae * 1229616605, (byte)23);
         if (null != var2.bz) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            var2 = var2.ad(756364333);
         }

         if (null == var2) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var3;
            int var4;
            label133: {
               if (1 != this.am * -229054585) {
                  if (this.am * -229054585 != 3) {
                     var3 = -1298730649 * var2.aa;
                     var4 = -1257293157 * var2.ai;
                     break label133;
                  }

                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }
               }

               var3 = -1257293157 * var2.ai;
               var4 = var2.aa * -1298730649;
            }

            int var5 = (var3 >> 1) + 378589425 * this.aq;
            int var6 = (1 + var3 >> 1) + this.aq * 378589425;
            int var7 = (var4 >> 1) + this.af * -1588561167;
            int var8 = -1588561167 * this.af + (1 + var4 >> 1);
            int[][] var9 = this.ac.ar[-279200905 * this.ax];
            int var10 = var9[var6][var8] + var9[var6][var7] + var9[var5][var7] + var9[var5][var8] >> 2;
            int var11 = (378589425 * this.aq << 7) + (var3 << 6);
            int var12 = (var4 << 6) + (-1588561167 * this.af << 7);
            if (null != this.at) {
               if (var1 >= 0) {
                  throw new IllegalStateException();
               }

               int var13 = 1472813913 * client.do - -1815809313 * this.ar;
               if (var13 > 100) {
                  if (var1 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (this.at.ao * -1317182493 > 0) {
                     if (var1 >= 0) {
                        throw new IllegalStateException();
                     }

                     var13 = 100;
                  }
               }

               if (!this.at.ad(-2128751638)) {
                  label112: {
                     label111:
                     while(true) {
                        while(true) {
                           if (var13 <= this.at.aa[this.au * -1034526735]) {
                              break label112;
                           }

                           var13 -= this.at.aa[this.au * -1034526735];
                           this.au += -321998575;
                           if (this.au * -1034526735 >= this.at.ab.length) {
                              if (var1 >= 0) {
                                 throw new IllegalStateException();
                              }

                              this.au -= this.at.ao * 537761043;
                              if (-1034526735 * this.au < 0) {
                                 break label111;
                              }

                              if (var1 >= 0) {
                                 throw new IllegalStateException();
                              }

                              if (this.au * -1034526735 >= this.at.ab.length) {
                                 if (var1 >= 0) {
                                    throw new IllegalStateException();
                                 }
                                 break label111;
                              }
                           } else {
                              dq.ix(this.at, this.au * -1034526735, var11, var12, false, -489807377);
                           }
                        }
                     }

                     this.at = null;
                  }
               } else {
                  int var14 = this.at.ah(-1208969343);
                  this.au += -321998575 * var13;
                  var13 = 0;
                  if (-1034526735 * this.au >= var14) {
                     label119: {
                        this.au = -321998575 * (var14 - -1317182493 * this.at.ao);
                        if (-1034526735 * this.au >= 0) {
                           if (var1 >= 0) {
                              throw new IllegalStateException();
                           }

                           if (-1034526735 * this.au <= var14) {
                              break label119;
                           }

                           if (var1 >= 0) {
                              throw new IllegalStateException();
                           }
                        }

                        this.at = null;
                     }
                  }

                  if (this.at != null) {
                     if (var1 >= 0) {
                        throw new IllegalStateException();
                     }

                     aw.ir(this.at, -1034526735 * this.au, var11, var12, false, 1077228509);
                  }
               }

               this.ar = -1749333729 * (1472813913 * client.do - var13);
            }

            return var2.ar(this.ag * 1106917505, this.am * -229054585, var9, var11, var10, var12, this.at, this.au * -1034526735, (byte)-25);
         }
      } catch (RuntimeException var15) {
         throw vk.ae(var15, "dk.ad(" + ')');
      }
   }

   protected final jm ab() {
      id var1 = kf.ae(this.ae * 1229616605, (byte)75);
      if (null != var1.bz) {
         var1 = var1.ad(586884540);
      }

      if (null == var1) {
         return null;
      } else {
         int var2;
         int var3;
         if (1 != this.am * -229054585 && this.am * -229054585 != 3) {
            var2 = -1298730649 * var1.aa;
            var3 = -1257293157 * var1.ai;
         } else {
            var2 = -1257293157 * var1.ai;
            var3 = var1.aa * -1298730649;
         }

         int var4 = (var2 >> 1) + 378589425 * this.aq;
         int var5 = (1 + var2 >> 1) + this.aq * 378589425;
         int var6 = (var3 >> 1) + this.af * -1588561167;
         int var7 = -1588561167 * this.af + (1 + var3 >> 1);
         int[][] var8 = this.ac.ar[-279200905 * this.ax];
         int var9 = var8[var5][var7] + var8[var5][var6] + var8[var4][var6] + var8[var4][var7] >> 2;
         int var10 = (378589425 * this.aq << 7) + (var2 << 6);
         int var11 = (var3 << 6) + (-1588561167 * this.af << 7);
         if (null != this.at) {
            int var12 = 1472813913 * client.do - -1815809313 * this.ar;
            if (var12 > 100 && this.at.ao * -1317182493 > 0) {
               var12 = 100;
            }

            if (!this.at.ad(-1436500056)) {
               label73: {
                  do {
                     while(true) {
                        if (var12 <= this.at.aa[this.au * -1034526735]) {
                           break label73;
                        }

                        var12 -= this.at.aa[this.au * -1034526735];
                        this.au += -321998575;
                        if (this.au * -1034526735 >= this.at.ab.length) {
                           this.au -= this.at.ao * 537761043;
                           break;
                        }

                        dq.ix(this.at, this.au * -1034526735, var10, var11, false, -758354960);
                     }
                  } while(-1034526735 * this.au >= 0 && this.au * -1034526735 < this.at.ab.length);

                  this.at = null;
               }
            } else {
               int var13 = this.at.ah(-2041228490);
               this.au += -321998575 * var12;
               var12 = 0;
               if (-1034526735 * this.au >= var13) {
                  this.au = -321998575 * (var13 - -1317182493 * this.at.ao);
                  if (-1034526735 * this.au < 0 || -1034526735 * this.au > var13) {
                     this.at = null;
                  }
               }

               if (this.at != null) {
                  aw.ir(this.at, -1034526735 * this.au, var10, var11, false, -1370160422);
               }
            }

            this.ar = -1749333729 * (1472813913 * client.do - var12);
         }

         return var1.ar(this.ag * 1106917505, this.am * -229054585, var8, var10, var9, var11, this.at, this.au * -1034526735, (byte)-50);
      }
   }

   static float ac(fr var0, float var1, short var2) {
      try {
         if (null != var0) {
            if (var2 <= 185) {
               throw new IllegalStateException();
            }

            if (var0.au((byte)71) != 0) {
               if (var1 < (float)(var0.ax[0].ac * -1487779715)) {
                  if (var2 <= 185) {
                     throw new IllegalStateException();
                  }

                  if (var0.ag == fk.ac) {
                     if (var2 <= 185) {
                        throw new IllegalStateException();
                     }

                     return var0.ax[0].ae;
                  }

                  return et.am(var0, var1, true, (byte)-106);
               }

               if (var1 > (float)(var0.ax[var0.au((byte)90) - 1].ac * -1487779715)) {
                  if (var2 <= 185) {
                     throw new IllegalStateException();
                  }

                  if (var0.am == fk.ac) {
                     if (var2 <= 185) {
                        throw new IllegalStateException();
                     }

                     return var0.ax[var0.au((byte)19) - 1].ae;
                  }

                  return et.am(var0, var1, false, (byte)-86);
               }

               if (var0.ae) {
                  return var0.ax[0].ae;
               }

               fe var3 = var0.at(var1, 1777514058);
               boolean var4 = false;
               boolean var5 = false;
               if (null != var3) {
                  if (var2 <= 185) {
                     throw new IllegalStateException();
                  }

                  label295: {
                     if (0.0F == var3.ax) {
                        if (var2 <= 185) {
                           throw new IllegalStateException();
                        }

                        if (0.0F == var3.aq) {
                           var4 = true;
                           break label295;
                        }
                     }

                     if (Float.MAX_VALUE == var3.ax) {
                        if (var2 <= 185) {
                           throw new IllegalStateException();
                        }

                        if (Float.MAX_VALUE == var3.aq) {
                           if (var2 <= 185) {
                              throw new IllegalStateException();
                           }

                           var5 = true;
                           break label295;
                        }
                     }

                     if (var3.af != null) {
                        if (var2 <= 185) {
                           throw new IllegalStateException();
                        }

                        if (var0.aa) {
                           if (var2 <= 185) {
                              throw new IllegalStateException();
                           }

                           float var6 = (float)(var3.ac * -1487779715);
                           float var10 = var3.ae;
                           float var7 = var6 + var3.ax * 0.33333334F;
                           float var11 = var10 + var3.aq * 0.33333334F;
                           float var9 = (float)(var3.af.ac * -1487779715);
                           float var13 = var3.af.ae;
                           float var8 = var9 - var3.af.ag * 0.33333334F;
                           float var12 = var13 - var3.af.am * 0.33333334F;
                           float var16;
                           float var17;
                           float var18;
                           float var19;
                           float var20;
                           if (var0.ac) {
                              if (var2 <= 185) {
                                 throw new IllegalStateException();
                              }

                              var16 = var11;
                              var17 = var12;
                              if (var0 == null) {
                                 if (var2 <= 185) {
                                    throw new IllegalStateException();
                                 }
                              } else {
                                 var18 = var9 - var6;
                                 if (0.0F != var18) {
                                    boolean var10001;
                                    float[] var25;
                                    label253: {
                                       var19 = var7 - var6;
                                       var20 = var8 - var6;
                                       var25 = new float[]{var19 / var18, var20 / var18};
                                       if (0.33333334F == var25[0]) {
                                          if (var2 <= 185) {
                                             throw new IllegalStateException();
                                          }

                                          if (0.6666667F == var25[1]) {
                                             var10001 = true;
                                             break label253;
                                          }
                                       }

                                       var10001 = false;
                                    }

                                    var0.aq = var10001;
                                    float var22 = var25[0];
                                    float var23 = var25[1];
                                    if (var25[0] < 0.0F) {
                                       if (var2 <= 185) {
                                          throw new IllegalStateException();
                                       }

                                       var25[0] = 0.0F;
                                    }

                                    if (var25[1] > 1.0F) {
                                       if (var2 <= 185) {
                                          throw new IllegalStateException();
                                       }

                                       var25[1] = 1.0F;
                                    }

                                    label244: {
                                       if (!(var25[0] > 1.0F)) {
                                          if (var2 <= 185) {
                                             throw new IllegalStateException();
                                          }

                                          if (!(var25[1] < -1.0F)) {
                                             break label244;
                                          }

                                          if (var2 <= 185) {
                                             throw new IllegalStateException();
                                          }
                                       }

                                       lj.aq(var25, (byte)1);
                                    }

                                    float var10000;
                                    if (var22 != var25[0]) {
                                       if (var2 <= 185) {
                                          throw new IllegalStateException();
                                       }

                                       var10000 = var6 + var18 * var25[0];
                                       if (0.0F != var22) {
                                          if (var2 <= 185) {
                                             throw new IllegalStateException();
                                          }

                                          var16 = var10 + (var11 - var10) * var25[0] / var22;
                                       }
                                    }

                                    if (var25[1] != var23) {
                                       if (var2 <= 185) {
                                          throw new IllegalStateException();
                                       }

                                       var10000 = var6 + var25[1] * var18;
                                       if (1.0F != var23) {
                                          var17 = var13 - (1.0F - var25[1]) * (var13 - var12) / (1.0F - var23);
                                       }
                                    }

                                    var0.af = var6;
                                    var0.at = var9;
                                    ao.af(0.0F, var25[0], var25[1], 1.0F, var0, 1889687141);
                                    fc.at(var10, var16, var17, var13, var0, (short)160);
                                 }
                              }
                           } else if (var0 == null) {
                              if (var2 <= 185) {
                                 throw new IllegalStateException();
                              }
                           } else {
                              var0.af = var6;
                              float var14 = var9 - var6;
                              float var15 = var13 - var10;
                              var16 = var7 - var6;
                              var17 = 0.0F;
                              var18 = 0.0F;
                              if (var16 != 0.0F) {
                                 if (var2 <= 185) {
                                    throw new IllegalStateException();
                                 }

                                 var17 = (var11 - var10) / var16;
                              }

                              var16 = var9 - var8;
                              if (var16 != 0.0F) {
                                 var18 = (var13 - var12) / var16;
                              }

                              var19 = 1.0F / (var14 * var14);
                              var20 = var17 * var14;
                              float var21 = var18 * var14;
                              var0.au = (var20 + var21 - var15 - var15) * var19 / var14;
                              var0.ar = var19 * (var15 + var15 + var15 - var20 - var20 - var21);
                              var0.al = var17;
                              var0.ad = var10;
                           }

                           var0.aa = false;
                        }
                     } else {
                        var4 = true;
                     }
                  }

                  if (var4) {
                     if (var2 <= 185) {
                        throw new IllegalStateException();
                     }

                     return var3.ae;
                  }

                  if (var5) {
                     if (var2 <= 185) {
                        throw new IllegalStateException();
                     }

                     if ((float)(var3.ac * -1487779715) != var1) {
                        if (var2 <= 185) {
                           throw new IllegalStateException();
                        }

                        if (null != var3.af) {
                           return var3.af.ae;
                        }

                        if (var2 <= 185) {
                           throw new IllegalStateException();
                        }
                     }

                     return var3.ae;
                  }

                  if (var0.ac) {
                     if (var2 <= 185) {
                        throw new IllegalStateException();
                     }

                     return nd.ae(var0, var1, (byte)-32);
                  }

                  return dl.ag(var0, var1, 1227919828);
               }

               return 0.0F;
            }

            if (var2 <= 185) {
               throw new IllegalStateException();
            }
         }

         return 0.0F;
      } catch (RuntimeException var24) {
         throw vk.ae(var24, "dk.ac(" + ')');
      }
   }

   protected final jm ap() {
      id var1 = kf.ae(this.ae * 1229616605, (byte)37);
      if (null != var1.bz) {
         var1 = var1.ad(506431900);
      }

      if (null == var1) {
         return null;
      } else {
         int var2;
         int var3;
         if (1 != this.am * -229054585 && this.am * -229054585 != 3) {
            var2 = -1298730649 * var1.aa;
            var3 = -1257293157 * var1.ai;
         } else {
            var2 = -1257293157 * var1.ai;
            var3 = var1.aa * -1298730649;
         }

         int var4 = (var2 >> 1) + 378589425 * this.aq;
         int var5 = (1 + var2 >> 1) + this.aq * 378589425;
         int var6 = (var3 >> 1) + this.af * -1588561167;
         int var7 = -1588561167 * this.af + (1 + var3 >> 1);
         int[][] var8 = this.ac.ar[-279200905 * this.ax];
         int var9 = var8[var5][var7] + var8[var5][var6] + var8[var4][var6] + var8[var4][var7] >> 2;
         int var10 = (378589425 * this.aq << 7) + (var2 << 6);
         int var11 = (var3 << 6) + (-1588561167 * this.af << 7);
         if (null != this.at) {
            int var12 = 1472813913 * client.do - -1815809313 * this.ar;
            if (var12 > 100 && this.at.ao * -1317182493 > 0) {
               var12 = 100;
            }

            if (!this.at.ad(-1528842687)) {
               label76: {
                  do {
                     while(true) {
                        if (var12 <= this.at.aa[this.au * -1034526735]) {
                           break label76;
                        }

                        var12 -= this.at.aa[this.au * -1034526735];
                        this.au += -321998575;
                        if (this.au * -1034526735 >= this.at.ab.length) {
                           this.au -= this.at.ao * 537761043;
                           break;
                        }

                        dq.ix(this.at, this.au * -1034526735, var10, var11, false, -514825503);
                     }
                  } while(-1034526735 * this.au >= 0 && this.au * -1034526735 < this.at.ab.length);

                  this.at = null;
               }
            } else {
               int var13 = this.at.ah(-225730524);
               this.au += -321998575 * var12;
               var12 = 0;
               if (-1034526735 * this.au >= var13) {
                  this.au = -321998575 * (var13 - -1317182493 * this.at.ao);
                  if (-1034526735 * this.au < 0 || -1034526735 * this.au > var13) {
                     this.at = null;
                  }
               }

               if (this.at != null) {
                  aw.ir(this.at, -1034526735 * this.au, var10, var11, false, 61898356);
               }
            }

            this.ar = -1749333729 * (1472813913 * client.do - var12);
         }

         return var1.ar(this.ag * 1106917505, this.am * -229054585, var8, var10, var9, var11, this.at, this.au * -1034526735, (byte)-51);
      }
   }
}
