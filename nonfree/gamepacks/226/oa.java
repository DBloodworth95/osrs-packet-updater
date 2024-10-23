import java.nio.ByteBuffer;

public class oa extends oe {
   public static final String ka = "Date not valid.";
   public static final int aj = 100;
   static final int ct = 106;
   ByteBuffer ap;

   byte[] ak(int var1) {
      try {
         byte[] var2 = new byte[this.ap.capacity()];
         this.ap.position(0);
         this.ap.get(var2);
         return var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "oa.ak(" + ')');
      }
   }

   void af(byte[] var1) {
      this.ap = ByteBuffer.allocateDirect(var1.length);
      this.ap.position(0);
      this.ap.put(var1);
   }

   void aj(byte[] var1, int var2) {
      try {
         this.ap = ByteBuffer.allocateDirect(var1.length);
         this.ap.position(0);
         this.ap.put(var1);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "oa.aj(" + ')');
      }
   }

   byte[] ae() {
      byte[] var1 = new byte[this.ap.capacity()];
      this.ap.position(0);
      this.ap.get(var1);
      return var1;
   }

   byte[] au() {
      byte[] var1 = new byte[this.ap.capacity()];
      this.ap.position(0);
      this.ap.get(var1);
      return var1;
   }

   byte[] at() {
      byte[] var1 = new byte[this.ap.capacity()];
      this.ap.position(0);
      this.ap.get(var1);
      return var1;
   }

   oa() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "oa.<init>(" + ')');
      }
   }

   void an(byte[] var1) {
      this.ap = ByteBuffer.allocateDirect(var1.length);
      this.ap.position(0);
      this.ap.put(var1);
   }

   void ao(byte[] var1) {
      this.ap = ByteBuffer.allocateDirect(var1.length);
      this.ap.position(0);
      this.ap.put(var1);
   }

   static int ao(int var0, da var1, boolean var2, int var3) {
      try {
         ng var4;
         if (var0 >= 2000) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var0 -= 1000;
            var4 = qk.ek.ap(cm.ae[(dp.am -= -1450976103) * -158156887], -460424238);
         } else {
            ng var10000;
            if (var2) {
               if (var3 == -1847216422) {
                  throw new IllegalStateException();
               }

               var10000 = vx.ar;
            } else {
               var10000 = ac.af;
            }

            var4 = var10000;
         }

         String var5 = cm.at[(ih.au -= 746573637) * -114988147];
         int[] var6 = null;
         if (var5.length() > 0) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            if (var5.charAt(var5.length() - 1) == 'Y') {
               if (var3 == -1847216422) {
                  throw new IllegalStateException();
               }

               int var7 = cm.ae[(dp.am -= -1450976103) * -158156887];
               if (var7 > 0) {
                  if (var3 == -1847216422) {
                     throw new IllegalStateException();
                  }

                  for(var6 = new int[var7]; var7-- > 0; var6[var7] = cm.ae[(dp.am -= -1450976103) * -158156887]) {
                     if (var3 == -1847216422) {
                        throw new IllegalStateException();
                     }
                  }
               }

               var5 = var5.substring(0, var5.length() - 1);
            }
         }

         Object[] var11 = new Object[var5.length() + 1];

         int var8;
         for(var8 = var11.length - 1; var8 >= 1; --var8) {
            if (var5.charAt(var8 - 1) == 's') {
               if (var3 == -1847216422) {
                  throw new IllegalStateException();
               }

               var11[var8] = cm.at[(ih.au -= 746573637) * -114988147];
            } else {
               var11[var8] = new Integer(cm.ae[(dp.am -= -1450976103) * -158156887]);
            }
         }

         var8 = cm.ae[(dp.am -= -1450976103) * -158156887];
         if (var8 != -1) {
            var11[0] = new Integer(var8);
         } else {
            var11 = null;
         }

         if (1400 == var0) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.et = var11;
         } else if (var0 == 1401) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.fa = var11;
         } else if (1402 == var0) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.fo = var11;
         } else if (var0 == 1403) {
            var4.fj = var11;
         } else if (var0 == 1404) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.fp = var11;
         } else if (1405 == var0) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.fh = var11;
         } else if (var0 == 1406) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.fn = var11;
         } else if (var0 == 1407) {
            var4.fd = var11;
            var4.fm = var6;
         } else if (var0 == 1408) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.fe = var11;
         } else if (var0 == 1409) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.ft = var11;
         } else if (var0 == 1410) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.fv = var11;
         } else if (1411 == var0) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.fu = var11;
         } else if (var0 == 1412) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.fw = var11;
         } else if (var0 == 1414) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.fg = var11;
            var4.fc = var6;
         } else if (var0 == 1415) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.fb = var11;
            var4.fr = var6;
         } else if (var0 == 1416) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.fl = var11;
         } else if (1417 == var0) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.fx = var11;
         } else if (var0 == 1418) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.fq = var11;
         } else if (1419 == var0) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.fk = var11;
         } else if (1420 == var0) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.fy = var11;
         } else if (1421 == var0) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.fi = var11;
         } else if (1422 == var0) {
            var4.gb = var11;
         } else if (var0 == 1423) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.gn = var11;
         } else if (var0 == 1424) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.gd = var11;
         } else if (1425 == var0) {
            var4.gc = var11;
         } else if (var0 == 1426) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.ga = var11;
         } else if (1427 == var0) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.gy = var11;
         } else if (var0 == 1428) {
            var4.gp = var11;
         } else if (1429 == var0) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.gl = var11;
         } else if (var0 == 1430) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.fs = var11;
         } else if (var0 == 1431) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.fz = var11;
         } else if (var0 == 1434) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.gf = var11;
         } else if (var0 == 1435) {
            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            var4.ff = var11;
         } else {
            if (var0 < 1436) {
               return 2;
            }

            if (var3 == -1847216422) {
               throw new IllegalStateException();
            }

            if (var0 > 1439) {
               return 2;
            }

            na var9 = var4.bs(1374945159);
            if (null != var9) {
               if (var3 == -1847216422) {
                  throw new IllegalStateException();
               }

               if (1436 == var0) {
                  var9.ai = var11;
               } else if (1437 == var0) {
                  if (var3 == -1847216422) {
                     throw new IllegalStateException();
                  }

                  var9.ay = var11;
               } else if (var0 == 1438) {
                  var9.as = var11;
               } else if (var0 == 1439) {
                  if (var3 == -1847216422) {
                     throw new IllegalStateException();
                  }

                  var9.aj = var11;
               }
            }
         }

         var4.ee = true;
         return 1;
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "oa.ao(" + ')');
      }
   }

   void ar(byte[] var1) {
      this.ap = ByteBuffer.allocateDirect(var1.length);
      this.ap.position(0);
      this.ap.put(var1);
   }

   byte[] am() {
      byte[] var1 = new byte[this.ap.capacity()];
      this.ap.position(0);
      this.ap.get(var1);
      return var1;
   }

   static int by(int var0, da var1, boolean var2, int var3) {
      try {
         if (var0 == 5000) {
            if (var3 >= 2141597357) {
               throw new IllegalStateException();
            } else {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = -851081673 * client.rr;
               return 1;
            }
         } else if (var0 == 5001) {
            if (var3 >= 2141597357) {
               throw new IllegalStateException();
            } else {
               dp.am -= -57961013;
               client.rr = -1848701049 * cm.ae[dp.am * -158156887];
               ok.sj = vi.ap(cm.ae[-158156887 * dp.am + 1], -635947258);
               if (ok.sj == null) {
                  if (var3 >= 2141597357) {
                     throw new IllegalStateException();
                  }

                  ok.sj = wl.aw;
               }

               client.ss = -1586022387 * cm.ae[dp.am * -158156887 + 2];
               me var15 = ef.ap(mm.cx, client.in.ai, (byte)117);
               var15.ak.bo(-851081673 * client.rr, -1282749914);
               var15.ak.bo(ok.sj.aj * -692350423, -647342288);
               var15.ak.bo(client.ss * 1464063685, -1377358549);
               client.in.ak(var15, (short)486);
               return 1;
            }
         } else {
            me var7;
            String var9;
            int var10;
            int var12;
            if (var0 == 5002) {
               if (var3 >= 2141597357) {
                  throw new IllegalStateException();
               } else {
                  var9 = cm.at[(ih.au -= 746573637) * -114988147];
                  dp.am -= 1393015090;
                  var10 = cm.ae[-158156887 * dp.am];
                  var12 = cm.ae[dp.am * -158156887 + 1];
                  var7 = ef.ap(mm.bv, client.in.ai, (byte)9);
                  var7.ak.bo(ct.bl(var9, 49855108) + 2, 841946746);
                  var7.ak.be(var9, (byte)38);
                  var7.ak.bo(var10 - 1, 1449390165);
                  var7.ak.bo(var12, -414690998);
                  client.in.ak(var7, (short)486);
                  return 1;
               }
            } else {
               int var4;
               ce var6;
               String[] var10000;
               int[] var16;
               int var10001;
               byte var17;
               String var10002;
               if (5003 == var0) {
                  if (var3 >= 2141597357) {
                     throw new IllegalStateException();
                  } else {
                     dp.am -= 1393015090;
                     var4 = cm.ae[dp.am * -158156887];
                     var10 = cm.ae[1 + -158156887 * dp.am];
                     var6 = il.aj(var4, var10, -1123538803);
                     if (null != var6) {
                        if (var3 >= 2141597357) {
                           throw new IllegalStateException();
                        }

                        cm.ae[(dp.am += -1450976103) * -158156887 - 1] = -511622767 * var6.ap;
                        cm.ae[(dp.am += -1450976103) * -158156887 - 1] = -1891269393 * var6.aw;
                        var10000 = cm.at;
                        var10001 = (ih.au += 746573637) * -114988147 - 1;
                        if (null != var6.aj) {
                           if (var3 >= 2141597357) {
                              throw new IllegalStateException();
                           }

                           var10002 = var6.aj;
                        } else {
                           var10002 = "";
                        }

                        var10000[var10001] = var10002;
                        var10000 = cm.at;
                        var10001 = (ih.au += 746573637) * -114988147 - 1;
                        if (var6.ae != null) {
                           if (var3 >= 2141597357) {
                              throw new IllegalStateException();
                           }

                           var10002 = var6.ae;
                        } else {
                           var10002 = "";
                        }

                        var10000[var10001] = var10002;
                        var10000 = cm.at;
                        var10001 = (ih.au += 746573637) * -114988147 - 1;
                        if (null != var6.am) {
                           if (var3 >= 2141597357) {
                              throw new IllegalStateException();
                           }

                           var10002 = var6.am;
                        } else {
                           var10002 = "";
                        }

                        var10000[var10001] = var10002;
                        var16 = cm.ae;
                        var10001 = (dp.am += -1450976103) * -158156887 - 1;
                        if (var6.ak(-1773894804)) {
                           if (var3 >= 2141597357) {
                              throw new IllegalStateException();
                           }

                           var17 = 1;
                        } else if (var6.ay((byte)2)) {
                           if (var3 >= 2141597357) {
                              throw new IllegalStateException();
                           }

                           var17 = 2;
                        } else {
                           var17 = 0;
                        }

                        var16[var10001] = var17;
                     } else {
                        cm.ae[(dp.am += -1450976103) * -158156887 - 1] = -1;
                        cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 0;
                        cm.at[(ih.au += 746573637) * -114988147 - 1] = "";
                        cm.at[(ih.au += 746573637) * -114988147 - 1] = "";
                        cm.at[(ih.au += 746573637) * -114988147 - 1] = "";
                        cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 0;
                     }

                     return 1;
                  }
               } else {
                  ce var5;
                  if (5004 == var0) {
                     if (var3 >= 2141597357) {
                        throw new IllegalStateException();
                     } else {
                        var4 = cm.ae[(dp.am -= -1450976103) * -158156887];
                        var5 = client.ai(var4, 84584003);
                        if (var5 != null) {
                           if (var3 >= 2141597357) {
                              throw new IllegalStateException();
                           }

                           cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var5.ak * 1147765991;
                           cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var5.aw * -1891269393;
                           var10000 = cm.at;
                           var10001 = (ih.au += 746573637) * -114988147 - 1;
                           if (var5.aj != null) {
                              if (var3 >= 2141597357) {
                                 throw new IllegalStateException();
                              }

                              var10002 = var5.aj;
                           } else {
                              var10002 = "";
                           }

                           var10000[var10001] = var10002;
                           var10000 = cm.at;
                           var10001 = (ih.au += 746573637) * -114988147 - 1;
                           if (var5.ae != null) {
                              if (var3 >= 2141597357) {
                                 throw new IllegalStateException();
                              }

                              var10002 = var5.ae;
                           } else {
                              var10002 = "";
                           }

                           var10000[var10001] = var10002;
                           var10000 = cm.at;
                           var10001 = (ih.au += 746573637) * -114988147 - 1;
                           if (var5.am != null) {
                              if (var3 >= 2141597357) {
                                 throw new IllegalStateException();
                              }

                              var10002 = var5.am;
                           } else {
                              var10002 = "";
                           }

                           var10000[var10001] = var10002;
                           var16 = cm.ae;
                           var10001 = (dp.am += -1450976103) * -158156887 - 1;
                           if (var5.ak(-31076317)) {
                              if (var3 >= 2141597357) {
                                 throw new IllegalStateException();
                              }

                              var17 = 1;
                           } else if (var5.ay((byte)2)) {
                              if (var3 >= 2141597357) {
                                 throw new IllegalStateException();
                              }

                              var17 = 2;
                           } else {
                              var17 = 0;
                           }

                           var16[var10001] = var17;
                        } else {
                           cm.ae[(dp.am += -1450976103) * -158156887 - 1] = -1;
                           cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 0;
                           cm.at[(ih.au += 746573637) * -114988147 - 1] = "";
                           cm.at[(ih.au += 746573637) * -114988147 - 1] = "";
                           cm.at[(ih.au += 746573637) * -114988147 - 1] = "";
                           cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 0;
                        }

                        return 1;
                     }
                  } else if (5005 == var0) {
                     if (var3 >= 2141597357) {
                        throw new IllegalStateException();
                     } else {
                        if (null == ok.sj) {
                           cm.ae[(dp.am += -1450976103) * -158156887 - 1] = -1;
                        } else {
                           cm.ae[(dp.am += -1450976103) * -158156887 - 1] = -692350423 * ok.sj.aj;
                        }

                        return 1;
                     }
                  } else {
                     me var13;
                     if (var0 == 5008) {
                        if (var3 >= 2141597357) {
                           throw new IllegalStateException();
                        } else {
                           var9 = cm.at[(ih.au -= 746573637) * -114988147];
                           var10 = cm.ae[(dp.am -= -1450976103) * -158156887];
                           var13 = av.ap(var10, var9, lc.cp, -1, 1831877112);
                           client.in.ak(var13, (short)486);
                           return 1;
                        }
                     } else if (var0 == 5009) {
                        if (var3 >= 2141597357) {
                           throw new IllegalStateException();
                        } else {
                           ih.au -= 1493147274;
                           var9 = cm.at[-114988147 * ih.au];
                           String var11 = cm.at[-114988147 * ih.au + 1];
                           var13 = ef.ap(mm.cp, client.in.ai, (byte)121);
                           var13.ak.bd(0, (byte)43);
                           int var14 = -1689308347 * var13.ak.am;
                           var13.ak.be(var9, (byte)121);
                           ix.aw(var13.ak, var11, -667515978);
                           var13.ak.cf(-1689308347 * var13.ak.am - var14, -1203716224);
                           client.in.ak(var13, (short)486);
                           return 1;
                        }
                     } else if (5010 == var0) {
                        if (var3 >= 2141597357) {
                           throw new IllegalStateException();
                        } else {
                           var9 = cm.at[(ih.au -= 746573637) * -114988147];
                           dp.am -= 1393015090;
                           var10 = cm.ae[dp.am * -158156887];
                           var12 = cm.ae[1 + dp.am * -158156887];
                           var7 = av.ap(var10, var9, lc.cp, var12, 1481916636);
                           client.in.ak(var7, (short)486);
                           return 1;
                        }
                     } else if (5015 == var0) {
                        if (var3 >= 2141597357) {
                           throw new IllegalStateException();
                        } else {
                           label454: {
                              if (null != nw.mc) {
                                 if (var3 >= 2141597357) {
                                    throw new IllegalStateException();
                                 }

                                 if (nw.mc.ap != null) {
                                    if (var3 >= 2141597357) {
                                       throw new IllegalStateException();
                                    }

                                    var9 = nw.mc.ap.ap(-2079032093);
                                    break label454;
                                 }
                              }

                              var9 = "";
                           }

                           cm.at[(ih.au += 746573637) * -114988147 - 1] = var9;
                           return 1;
                        }
                     } else if (var0 == 5016) {
                        cm.ae[(dp.am += -1450976103) * -158156887 - 1] = client.ss * 1464063685;
                        return 1;
                     } else if (5017 == var0) {
                        if (var3 >= 2141597357) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cm.ae[(dp.am -= -1450976103) * -158156887];
                           cm.ae[(dp.am += -1450976103) * -158156887 - 1] = gq.ay(var4, 609989432);
                           return 1;
                        }
                     } else if (5018 == var0) {
                        if (var3 >= 2141597357) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cm.ae[(dp.am -= -1450976103) * -158156887];
                           cm.ae[(dp.am += -1450976103) * -158156887 - 1] = ib.am(var4, 1195419660);
                           return 1;
                        }
                     } else if (var0 == 5019) {
                        if (var3 >= 2141597357) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cm.ae[(dp.am -= -1450976103) * -158156887];
                           cm.ae[(dp.am += -1450976103) * -158156887 - 1] = uk.ae(var4, (byte)-23);
                           return 1;
                        }
                     } else if (var0 == 5020) {
                        if (var3 >= 2141597357) {
                           throw new IllegalStateException();
                        } else {
                           var9 = cm.at[(ih.au -= 746573637) * -114988147];
                           ac.hz(var9, (byte)-5);
                           return 1;
                        }
                     } else if (var0 == 5021) {
                        if (var3 >= 2141597357) {
                           throw new IllegalStateException();
                        } else {
                           client.st = cm.at[(ih.au -= 746573637) * -114988147].toLowerCase().trim();
                           return 1;
                        }
                     } else if (5022 == var0) {
                        if (var3 >= 2141597357) {
                           throw new IllegalStateException();
                        } else {
                           cm.at[(ih.au += 746573637) * -114988147 - 1] = client.st;
                           return 1;
                        }
                     } else if (var0 == 5023) {
                        var9 = cm.at[(ih.au -= 746573637) * -114988147];
                        System.out.println(var9);
                        return 1;
                     } else if (5030 == var0) {
                        if (var3 >= 2141597357) {
                           throw new IllegalStateException();
                        } else {
                           dp.am -= 1393015090;
                           var4 = cm.ae[dp.am * -158156887];
                           var10 = cm.ae[dp.am * -158156887 + 1];
                           var6 = il.aj(var4, var10, -136846538);
                           if (var6 != null) {
                              if (var3 >= 2141597357) {
                                 throw new IllegalStateException();
                              }

                              cm.ae[(dp.am += -1450976103) * -158156887 - 1] = -511622767 * var6.ap;
                              cm.ae[(dp.am += -1450976103) * -158156887 - 1] = -1891269393 * var6.aw;
                              var10000 = cm.at;
                              var10001 = (ih.au += 746573637) * -114988147 - 1;
                              if (var6.aj != null) {
                                 if (var3 >= 2141597357) {
                                    throw new IllegalStateException();
                                 }

                                 var10002 = var6.aj;
                              } else {
                                 var10002 = "";
                              }

                              var10000[var10001] = var10002;
                              var10000 = cm.at;
                              var10001 = (ih.au += 746573637) * -114988147 - 1;
                              if (null != var6.ae) {
                                 if (var3 >= 2141597357) {
                                    throw new IllegalStateException();
                                 }

                                 var10002 = var6.ae;
                              } else {
                                 var10002 = "";
                              }

                              var10000[var10001] = var10002;
                              var10000 = cm.at;
                              var10001 = (ih.au += 746573637) * -114988147 - 1;
                              if (null != var6.am) {
                                 if (var3 >= 2141597357) {
                                    throw new IllegalStateException();
                                 }

                                 var10002 = var6.am;
                              } else {
                                 var10002 = "";
                              }

                              var10000[var10001] = var10002;
                              var16 = cm.ae;
                              var10001 = (dp.am += -1450976103) * -158156887 - 1;
                              int var18;
                              if (var6.ak(-305717892)) {
                                 if (var3 >= 2141597357) {
                                    throw new IllegalStateException();
                                 }

                                 var18 = 1;
                              } else {
                                 var18 = var6.ay((byte)2) ? 2 : 0;
                              }

                              var16[var10001] = var18;
                              cm.at[(ih.au += 746573637) * -114988147 - 1] = "";
                              cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 0;
                           } else {
                              cm.ae[(dp.am += -1450976103) * -158156887 - 1] = -1;
                              cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 0;
                              cm.at[(ih.au += 746573637) * -114988147 - 1] = "";
                              cm.at[(ih.au += 746573637) * -114988147 - 1] = "";
                              cm.at[(ih.au += 746573637) * -114988147 - 1] = "";
                              cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 0;
                              cm.at[(ih.au += 746573637) * -114988147 - 1] = "";
                              cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 0;
                           }

                           return 1;
                        }
                     } else if (var0 == 5031) {
                        if (var3 >= 2141597357) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cm.ae[(dp.am -= -1450976103) * -158156887];
                           var5 = client.ai(var4, -851855825);
                           if (var5 != null) {
                              cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var5.ak * 1147765991;
                              cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var5.aw * -1891269393;
                              var10000 = cm.at;
                              var10001 = (ih.au += 746573637) * -114988147 - 1;
                              if (var5.aj != null) {
                                 if (var3 >= 2141597357) {
                                    throw new IllegalStateException();
                                 }

                                 var10002 = var5.aj;
                              } else {
                                 var10002 = "";
                              }

                              var10000[var10001] = var10002;
                              var10000 = cm.at;
                              var10001 = (ih.au += 746573637) * -114988147 - 1;
                              if (null != var5.ae) {
                                 if (var3 >= 2141597357) {
                                    throw new IllegalStateException();
                                 }

                                 var10002 = var5.ae;
                              } else {
                                 var10002 = "";
                              }

                              var10000[var10001] = var10002;
                              var10000 = cm.at;
                              var10001 = (ih.au += 746573637) * -114988147 - 1;
                              if (null != var5.am) {
                                 if (var3 >= 2141597357) {
                                    throw new IllegalStateException();
                                 }

                                 var10002 = var5.am;
                              } else {
                                 var10002 = "";
                              }

                              var10000[var10001] = var10002;
                              var16 = cm.ae;
                              var10001 = (dp.am += -1450976103) * -158156887 - 1;
                              if (var5.ak(-1998472274)) {
                                 var17 = 1;
                              } else if (var5.ay((byte)2)) {
                                 if (var3 >= 2141597357) {
                                    throw new IllegalStateException();
                                 }

                                 var17 = 2;
                              } else {
                                 var17 = 0;
                              }

                              var16[var10001] = var17;
                              cm.at[(ih.au += 746573637) * -114988147 - 1] = "";
                              cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 0;
                           } else {
                              cm.ae[(dp.am += -1450976103) * -158156887 - 1] = -1;
                              cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 0;
                              cm.at[(ih.au += 746573637) * -114988147 - 1] = "";
                              cm.at[(ih.au += 746573637) * -114988147 - 1] = "";
                              cm.at[(ih.au += 746573637) * -114988147 - 1] = "";
                              cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 0;
                              cm.at[(ih.au += 746573637) * -114988147 - 1] = "";
                              cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 0;
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
         throw tm.aw(var8, "oa.by(" + ')');
      }
   }

   public static byte[] aw(Object var0, boolean var1, int var2) {
      try {
         if (null == var0) {
            if (var2 == -2101128755) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else if (var0 instanceof byte[]) {
            if (var2 == -2101128755) {
               throw new IllegalStateException();
            } else {
               byte[] var8 = (byte[])((byte[])var0);
               if (var1) {
                  if (var2 == -2101128755) {
                     throw new IllegalStateException();
                  } else {
                     int var5 = var8.length;
                     byte[] var6 = new byte[var5];
                     System.arraycopy(var8, 0, var6, 0, var5);
                     return var6;
                  }
               } else {
                  return var8;
               }
            }
         } else if (var0 instanceof oe) {
            if (var2 == -2101128755) {
               throw new IllegalStateException();
            } else {
               oe var3 = (oe)var0;
               return var3.ak(-1554576635);
            }
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "oa.aw(" + ')');
      }
   }
}
