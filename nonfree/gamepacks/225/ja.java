public class ja extends jx {
   float[] ae;
   static final int av = 512;
   qf ac;

   void ax(ju var1, int var2, int var3, int var4, int var5, long var6) {
      var1.jh(var2, this.ac, var3, var4, var5, var6);
   }

   ja(qf var1) {
      try {
         super();
         this.ae = new float[3];
         this.ac = var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ja.<init>(" + ')');
      }
   }

   void ae(jh var1, jl var2, int var3, int var4, int var5, int var6) {
      try {
         int var7;
         int var8 = var7 = var4 << 7;
         int var9;
         int var10 = var9 = var5 << 7;
         int var11;
         int var12 = var11 = var8 + 128;
         int var13;
         int var14 = var13 = 128 + var10;
         int var15 = var1.af[var3][var4][var5];
         int var16 = var1.af[var3][var4 + 1][var5];
         int var17 = var1.af[var3][1 + var4][1 + var5];
         int var18 = var1.af[var3][var4][1 + var5];
         this.ac.as((float)var8, (float)var15, (float)var10, this.ae, 1855652676);
         var8 = (int)this.ae[0];
         var15 = (int)this.ae[1];
         var10 = (int)this.ae[2] | 1;
         this.ac.as((float)var12, (float)var16, (float)var9, this.ae, -1784994107);
         var12 = (int)this.ae[0];
         var16 = (int)this.ae[1];
         var9 = (int)this.ae[2] | 1;
         this.ac.as((float)var11, (float)var17, (float)var14, this.ae, 214464963);
         var11 = (int)this.ae[0];
         var17 = (int)this.ae[1];
         var14 = (int)this.ae[2] | 1;
         this.ac.as((float)var7, (float)var18, (float)var13, this.ae, -610805956);
         var7 = (int)this.ae[0];
         var18 = (int)this.ae[1];
         var13 = (int)this.ae[2] | 1;
         this.au(var1, var2, var4, var5, var8, var12, var11, var7, var15, var16, var17, var18, var10, var9, var14, var13, -80858100);
      } catch (RuntimeException var19) {
         throw vk.ae(var19, "ja.ae(" + ')');
      }
   }

   void ag(jh var1, jb var2, int var3, int var4, int var5) {
      try {
         int var6 = var2.ac.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            if (var5 >= -480883950) {
               return;
            }

            int var8 = var2.ac[var7];
            int var9 = var2.ae[var7];
            int var10 = var2.ag[var7];
            this.ac.as((float)var8, (float)var9, (float)var10, this.ae, 372229274);
            var8 = (int)this.ae[0];
            var9 = (int)this.ae[1];
            var10 = (int)this.ae[2];
            if (var2.ar != null) {
               if (var5 >= -480883950) {
                  throw new IllegalStateException();
               }

               jb.ao[var7] = var8;
               jb.as[var7] = var9;
               jb.ay[var7] = var10;
            }

            var10 |= 1;
            jb.az[var7] = jw.af() + var8 * jw.ah() / var10;
            jb.aa[var7] = jw.at() + var9 * jw.ah() / var10;
            jb.ai[var7] = fq.aq(var10, 1363996801);
         }

         this.ar(var1, var2, var3, var4, (byte)7);
      } catch (RuntimeException var11) {
         throw vk.ae(var11, "ja.ag(" + ')');
      }
   }

   void am(ju var1, int var2, int var3, int var4, int var5, long var6) {
      var1.jh(var2, this.ac, var3, var4, var5, var6);
   }

   void af(jh var1, jl var2, int var3, int var4, int var5) {
      int var6;
      int var7 = var6 = var4 << 7;
      int var8;
      int var9 = var8 = var5 << 7;
      int var10;
      int var11 = var10 = var7 + 128;
      int var12;
      int var13 = var12 = 128 + var9;
      int var14 = var1.af[var3][var4][var5];
      int var15 = var1.af[var3][var4 + 1][var5];
      int var16 = var1.af[var3][1 + var4][1 + var5];
      int var17 = var1.af[var3][var4][1 + var5];
      this.ac.as((float)var7, (float)var14, (float)var9, this.ae, 119269590);
      var7 = (int)this.ae[0];
      var14 = (int)this.ae[1];
      var9 = (int)this.ae[2] | 1;
      this.ac.as((float)var11, (float)var15, (float)var8, this.ae, -759157304);
      var11 = (int)this.ae[0];
      var15 = (int)this.ae[1];
      var8 = (int)this.ae[2] | 1;
      this.ac.as((float)var10, (float)var16, (float)var13, this.ae, -359745324);
      var10 = (int)this.ae[0];
      var16 = (int)this.ae[1];
      var13 = (int)this.ae[2] | 1;
      this.ac.as((float)var6, (float)var17, (float)var12, this.ae, 588348675);
      var6 = (int)this.ae[0];
      var17 = (int)this.ae[1];
      var12 = (int)this.ae[2] | 1;
      this.au(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var17, var9, var8, var13, var12, 975118989);
   }

   void aq(ju var1, int var2, int var3, int var4, int var5, long var6) {
      var1.jh(var2, this.ac, var3, var4, var5, var6);
   }

   public static void ac(int var0) {
      try {
         hb.ac.am();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ja.ac(" + ')');
      }
   }

   void at(jh var1, jb var2, int var3, int var4) {
      int var5 = var2.ac.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         int var7 = var2.ac[var6];
         int var8 = var2.ae[var6];
         int var9 = var2.ag[var6];
         this.ac.as((float)var7, (float)var8, (float)var9, this.ae, -230931019);
         var7 = (int)this.ae[0];
         var8 = (int)this.ae[1];
         var9 = (int)this.ae[2];
         if (var2.ar != null) {
            jb.ao[var6] = var7;
            jb.as[var6] = var8;
            jb.ay[var6] = var9;
         }

         var9 |= 1;
         jb.az[var6] = jw.af() + var7 * jw.ah() / var9;
         jb.aa[var6] = jw.at() + var8 * jw.ah() / var9;
         jb.ai[var6] = fq.aq(var9, 2086814792);
      }

      this.ar(var1, var2, var3, var4, (byte)24);
   }

   static int bx(int var0, dt var1, boolean var2, int var3) {
      try {
         if (var0 == 3600) {
            if (var3 == 125772335) {
               throw new IllegalStateException();
            } else {
               if (-564322901 * qv.vj.af == 0) {
                  if (var3 == 125772335) {
                     throw new IllegalStateException();
                  }

                  cs.at[(mp.au += -1856457959) * 844691753 - 1] = -2;
               } else if (-564322901 * qv.vj.af == 1) {
                  if (var3 == 125772335) {
                     throw new IllegalStateException();
                  }

                  cs.at[(mp.au += -1856457959) * 844691753 - 1] = -1;
               } else {
                  cs.at[(mp.au += -1856457959) * 844691753 - 1] = qv.vj.ax.bf(1363647746);
               }

               return 1;
            }
         } else {
            int var10;
            if (3601 == var0) {
               if (var3 == 125772335) {
                  throw new IllegalStateException();
               } else {
                  var10 = cs.at[(mp.au -= -1856457959) * 844691753];
                  if (qv.vj.ac(-1896211312)) {
                     if (var3 == 125772335) {
                        throw new IllegalStateException();
                     }

                     if (var10 >= 0 && var10 < qv.vj.ax.bf(1363647746)) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        }

                        sr var9 = (sr)qv.vj.ax.bg(var10, 133317792);
                        cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var9.bd(-1727449361);
                        cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var9.bx(-431400089);
                        return 1;
                     }
                  }

                  cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
                  cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
                  return 1;
               }
            } else if (var0 == 3602) {
               if (var3 == 125772335) {
                  throw new IllegalStateException();
               } else {
                  var10 = cs.at[(mp.au -= -1856457959) * 844691753];
                  if (qv.vj.ac(-1514111937)) {
                     if (var3 == 125772335) {
                        throw new IllegalStateException();
                     }

                     if (var10 >= 0) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        }

                        if (var10 < qv.vj.ax.bf(1363647746)) {
                           if (var3 == 125772335) {
                              throw new IllegalStateException();
                           }

                           cs.at[(mp.au += -1856457959) * 844691753 - 1] = ((sq)qv.vj.ax.bg(var10, 2028865220)).ax * -1744892407;
                           return 1;
                        }
                     }
                  }

                  cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
                  return 1;
               }
            } else if (3603 == var0) {
               if (var3 == 125772335) {
                  throw new IllegalStateException();
               } else {
                  var10 = cs.at[(mp.au -= -1856457959) * 844691753];
                  if (qv.vj.ac(-2134829306)) {
                     if (var3 == 125772335) {
                        throw new IllegalStateException();
                     }

                     if (var10 >= 0) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        }

                        if (var10 < qv.vj.ax.bf(1363647746)) {
                           if (var3 == 125772335) {
                              throw new IllegalStateException();
                           }

                           cs.at[(mp.au += -1856457959) * 844691753 - 1] = ((sq)qv.vj.ax.bg(var10, -744886890)).af * -1054597577;
                           return 1;
                        }
                     }
                  }

                  cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
                  return 1;
               }
            } else {
               String var11;
               if (var0 == 3604) {
                  if (var3 == 125772335) {
                     throw new IllegalStateException();
                  } else {
                     var11 = cs.ar[(rt.al -= -1975882559) * -515103935];
                     int var8 = cs.at[(mp.au -= -1856457959) * 844691753];
                     ey.ao(var11, var8, -1904455651);
                     return 1;
                  }
               } else if (3605 == var0) {
                  if (var3 == 125772335) {
                     throw new IllegalStateException();
                  } else {
                     var11 = cs.ar[(rt.al -= -1975882559) * -515103935];
                     qv.vj.at(var11, 185178241);
                     return 1;
                  }
               } else if (var0 == 3606) {
                  var11 = cs.ar[(rt.al -= -1975882559) * -515103935];
                  qv.vj.aa(var11, (short)5661);
                  return 1;
               } else if (3607 == var0) {
                  var11 = cs.ar[(rt.al -= -1975882559) * -515103935];
                  qv.vj.ah(var11, 213108422);
                  return 1;
               } else if (3608 == var0) {
                  if (var3 == 125772335) {
                     throw new IllegalStateException();
                  } else {
                     var11 = cs.ar[(rt.al -= -1975882559) * -515103935];
                     boolean var7 = true;
                     qv.vj.ai(var11, var7, 2065106791);
                     return 1;
                  }
               } else {
                  int[] var14;
                  int var10001;
                  byte var10002;
                  if (3609 == var0) {
                     if (var3 == 125772335) {
                        throw new IllegalStateException();
                     } else {
                        var11 = cs.ar[(rt.al -= -1975882559) * -515103935];
                        var11 = gl.pj(var11, -1466726814);
                        var14 = cs.at;
                        var10001 = (mp.au += -1856457959) * 844691753 - 1;
                        if (qv.vj.aq(new wf(var11, bd.cj), false, -1289431622)) {
                           if (var3 == 125772335) {
                              throw new IllegalStateException();
                           }

                           var10002 = 1;
                        } else {
                           var10002 = 0;
                        }

                        var14[var10001] = var10002;
                        return 1;
                     }
                  } else if (var0 == 3611) {
                     if (var3 == 125772335) {
                        throw new IllegalStateException();
                     } else {
                        if (gt.sc != null) {
                           if (var3 == 125772335) {
                              throw new IllegalStateException();
                           }

                           cs.ar[(rt.al += -1975882559) * -515103935 - 1] = gt.sc.am;
                        } else {
                           cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
                        }

                        return 1;
                     }
                  } else if (var0 == 3612) {
                     if (var3 == 125772335) {
                        throw new IllegalStateException();
                     } else {
                        if (null != gt.sc) {
                           if (var3 == 125772335) {
                              throw new IllegalStateException();
                           }

                           cs.at[(mp.au += -1856457959) * 844691753 - 1] = gt.sc.bf(1363647746);
                        } else {
                           cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
                        }

                        return 1;
                     }
                  } else if (var0 == 3613) {
                     if (var3 == 125772335) {
                        throw new IllegalStateException();
                     } else {
                        var10 = cs.at[(mp.au -= -1856457959) * 844691753];
                        if (null != gt.sc) {
                           if (var3 == 125772335) {
                              throw new IllegalStateException();
                           }

                           if (var10 < gt.sc.bf(1363647746)) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              cs.ar[(rt.al += -1975882559) * -515103935 - 1] = gt.sc.bg(var10, -462723860).bh((byte)-12).ac((byte)100);
                              return 1;
                           }
                        }

                        cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
                        return 1;
                     }
                  } else if (3614 == var0) {
                     if (var3 == 125772335) {
                        throw new IllegalStateException();
                     } else {
                        var10 = cs.at[(mp.au -= -1856457959) * 844691753];
                        if (gt.sc != null) {
                           if (var3 == 125772335) {
                              throw new IllegalStateException();
                           }

                           if (var10 < gt.sc.bf(1363647746)) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              cs.at[(mp.au += -1856457959) * 844691753 - 1] = ((sq)gt.sc.bg(var10, -251046169)).bz(1364974980);
                              return 1;
                           }
                        }

                        cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
                        return 1;
                     }
                  } else if (var0 == 3615) {
                     if (var3 == 125772335) {
                        throw new IllegalStateException();
                     } else {
                        var10 = cs.at[(mp.au -= -1856457959) * 844691753];
                        if (null != gt.sc) {
                           if (var3 == 125772335) {
                              throw new IllegalStateException();
                           }

                           if (var10 < gt.sc.bf(1363647746)) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              cs.at[(mp.au += -1856457959) * 844691753 - 1] = ((sq)gt.sc.bg(var10, -455075912)).af * -1054597577;
                              return 1;
                           }
                        }

                        cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
                        return 1;
                     }
                  } else if (3616 == var0) {
                     if (var3 == 125772335) {
                        throw new IllegalStateException();
                     } else {
                        var14 = cs.at;
                        var10001 = (mp.au += -1856457959) * 844691753 - 1;
                        byte var13;
                        if (gt.sc != null) {
                           if (var3 == 125772335) {
                              throw new IllegalStateException();
                           }

                           var13 = gt.sc.aq;
                        } else {
                           var13 = 0;
                        }

                        var14[var10001] = var13;
                        return 1;
                     }
                  } else if (var0 == 3617) {
                     var11 = cs.ar[(rt.al -= -1975882559) * -515103935];
                     bo.oh(var11, (byte)-114);
                     return 1;
                  } else if (var0 == 3618) {
                     var14 = cs.at;
                     var10001 = (mp.au += -1856457959) * 844691753 - 1;
                     int var12;
                     if (gt.sc != null) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        }

                        var12 = gt.sc.af * -622758261;
                     } else {
                        var12 = 0;
                     }

                     var14[var10001] = var12;
                     return 1;
                  } else if (3619 == var0) {
                     if (var3 == 125772335) {
                        throw new IllegalStateException();
                     } else {
                        var11 = cs.ar[(rt.al -= -1975882559) * -515103935];
                        oz.ou(var11, -353475483);
                        return 1;
                     }
                  } else if (var0 == 3620) {
                     if (var3 == 125772335) {
                        throw new IllegalStateException();
                     } else {
                        qy.op(-2120265875);
                        return 1;
                     }
                  } else if (3621 == var0) {
                     if (var3 == 125772335) {
                        throw new IllegalStateException();
                     } else {
                        if (!qv.vj.ac(-1962638413)) {
                           if (var3 == 125772335) {
                              throw new IllegalStateException();
                           }

                           cs.at[(mp.au += -1856457959) * 844691753 - 1] = -1;
                        } else {
                           cs.at[(mp.au += -1856457959) * 844691753 - 1] = qv.vj.aq.bf(1363647746);
                        }

                        return 1;
                     }
                  } else if (var0 == 3622) {
                     if (var3 == 125772335) {
                        throw new IllegalStateException();
                     } else {
                        var10 = cs.at[(mp.au -= -1856457959) * 844691753];
                        if (qv.vj.ac(-884516943) && var10 >= 0) {
                           if (var3 == 125772335) {
                              throw new IllegalStateException();
                           }

                           if (var10 < qv.vj.aq.bf(1363647746)) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              st var5 = (st)qv.vj.aq.bg(var10, 830334777);
                              cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var5.bd(2029384475);
                              cs.ar[(rt.al += -1975882559) * -515103935 - 1] = var5.bx(986255808);
                              return 1;
                           }
                        }

                        cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
                        cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
                        return 1;
                     }
                  } else if (var0 == 3623) {
                     if (var3 == 125772335) {
                        throw new IllegalStateException();
                     } else {
                        var11 = cs.ar[(rt.al -= -1975882559) * -515103935];
                        var11 = gl.pj(var11, 1254132466);
                        var14 = cs.at;
                        var10001 = (mp.au += -1856457959) * 844691753 - 1;
                        if (qv.vj.af(new wf(var11, bd.cj), (byte)2)) {
                           if (var3 == 125772335) {
                              throw new IllegalStateException();
                           }

                           var10002 = 1;
                        } else {
                           var10002 = 0;
                        }

                        var14[var10001] = var10002;
                        return 1;
                     }
                  } else if (3624 == var0) {
                     if (var3 == 125772335) {
                        throw new IllegalStateException();
                     } else {
                        var10 = cs.at[(mp.au -= -1856457959) * 844691753];
                        if (gt.sc != null && var10 < gt.sc.bf(1363647746)) {
                           if (var3 == 125772335) {
                              throw new IllegalStateException();
                           }

                           if (gt.sc.bg(var10, 58245548).bh((byte)-51).equals(qm.mm.ac)) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              cs.at[(mp.au += -1856457959) * 844691753 - 1] = 1;
                              return 1;
                           }
                        }

                        cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
                        return 1;
                     }
                  } else if (3625 == var0) {
                     if (null != gt.sc) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        }

                        if (gt.sc.ax != null) {
                           cs.ar[(rt.al += -1975882559) * -515103935 - 1] = gt.sc.ax;
                           return 1;
                        }
                     }

                     cs.ar[(rt.al += -1975882559) * -515103935 - 1] = "";
                     return 1;
                  } else if (3626 == var0) {
                     if (var3 == 125772335) {
                        throw new IllegalStateException();
                     } else {
                        var10 = cs.at[(mp.au -= -1856457959) * 844691753];
                        if (null != gt.sc) {
                           if (var3 == 125772335) {
                              throw new IllegalStateException();
                           }

                           if (var10 < gt.sc.bf(1363647746) && ((sh)gt.sc.bg(var10, 233351804)).ag((byte)102)) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              cs.at[(mp.au += -1856457959) * 844691753 - 1] = 1;
                              return 1;
                           }
                        }

                        cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
                        return 1;
                     }
                  } else if (var0 == 3627) {
                     if (var3 == 125772335) {
                        throw new IllegalStateException();
                     } else {
                        var10 = cs.at[(mp.au -= -1856457959) * 844691753];
                        if (gt.sc != null) {
                           if (var3 == 125772335) {
                              throw new IllegalStateException();
                           }

                           if (var10 < gt.sc.bf(1363647746)) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              if (((sh)gt.sc.bg(var10, 1671646292)).at(-138616888)) {
                                 if (var3 == 125772335) {
                                    throw new IllegalStateException();
                                 }

                                 cs.at[(mp.au += -1856457959) * 844691753 - 1] = 1;
                                 return 1;
                              }
                           }
                        }

                        cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
                        return 1;
                     }
                  } else if (var0 == 3628) {
                     if (var3 == 125772335) {
                        throw new IllegalStateException();
                     } else {
                        qv.vj.ax.bq((short)-9720);
                        return 1;
                     }
                  } else {
                     boolean var4;
                     boolean var10000;
                     if (3629 == var0) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        } else {
                           if (cs.at[(mp.au -= -1856457959) * 844691753] == 1) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              var10000 = true;
                           } else {
                              var10000 = false;
                           }

                           var4 = var10000;
                           qv.vj.ax.bk(new vq(var4), -1078229185);
                           return 1;
                        }
                     } else if (3630 == var0) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        } else {
                           if (cs.at[(mp.au -= -1856457959) * 844691753] == 1) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              var10000 = true;
                           } else {
                              var10000 = false;
                           }

                           var4 = var10000;
                           qv.vj.ax.bk(new vj(var4), -1135889057);
                           return 1;
                        }
                     } else if (var0 == 3631) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cs.at[(mp.au -= -1856457959) * 844691753] == 1;
                           qv.vj.ax.bk(new ee(var4), -1030112478);
                           return 1;
                        }
                     } else if (var0 == 3632) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cs.at[(mp.au -= -1856457959) * 844691753] == 1;
                           qv.vj.ax.bk(new es(var4), -351655868);
                           return 1;
                        }
                     } else if (var0 == 3633) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cs.at[(mp.au -= -1856457959) * 844691753] == 1;
                           qv.vj.ax.bk(new ed(var4), -1301865763);
                           return 1;
                        }
                     } else if (3634 == var0) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cs.at[(mp.au -= -1856457959) * 844691753] == 1;
                           qv.vj.ax.bk(new et(var4), -1396212083);
                           return 1;
                        }
                     } else if (3635 == var0) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        } else {
                           if (cs.at[(mp.au -= -1856457959) * 844691753] == 1) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              var10000 = true;
                           } else {
                              var10000 = false;
                           }

                           var4 = var10000;
                           qv.vj.ax.bk(new er(var4), 600830256);
                           return 1;
                        }
                     } else if (var0 == 3636) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        } else {
                           if (cs.at[(mp.au -= -1856457959) * 844691753] == 1) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              var10000 = true;
                           } else {
                              var10000 = false;
                           }

                           var4 = var10000;
                           qv.vj.ax.bk(new ey(var4), -1632652604);
                           return 1;
                        }
                     } else if (3637 == var0) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        } else {
                           if (cs.at[(mp.au -= -1856457959) * 844691753] == 1) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              var10000 = true;
                           } else {
                              var10000 = false;
                           }

                           var4 = var10000;
                           qv.vj.ax.bk(new eq(var4), 506302204);
                           return 1;
                        }
                     } else if (var0 == 3638) {
                        if (cs.at[(mp.au -= -1856457959) * 844691753] == 1) {
                           if (var3 == 125772335) {
                              throw new IllegalStateException();
                           }

                           var10000 = true;
                        } else {
                           var10000 = false;
                        }

                        var4 = var10000;
                        qv.vj.ax.bk(new ej(var4), 1283711050);
                        return 1;
                     } else if (3639 == var0) {
                        qv.vj.ax.bl((byte)1);
                        return 1;
                     } else if (3640 == var0) {
                        qv.vj.aq.bq((short)-17364);
                        return 1;
                     } else if (3641 == var0) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        } else {
                           if (cs.at[(mp.au -= -1856457959) * 844691753] == 1) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              var10000 = true;
                           } else {
                              var10000 = false;
                           }

                           var4 = var10000;
                           qv.vj.aq.bk(new vq(var4), -1716787998);
                           return 1;
                        }
                     } else if (3642 == var0) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        } else {
                           if (cs.at[(mp.au -= -1856457959) * 844691753] == 1) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              var10000 = true;
                           } else {
                              var10000 = false;
                           }

                           var4 = var10000;
                           qv.vj.aq.bk(new vj(var4), 1007017825);
                           return 1;
                        }
                     } else if (var0 == 3643) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        } else {
                           qv.vj.aq.bl((byte)1);
                           return 1;
                        }
                     } else if (3644 == var0) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        } else {
                           if (gt.sc != null) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              gt.sc.bq((short)-9430);
                           }

                           return 1;
                        }
                     } else if (var0 == 3645) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        } else {
                           if (cs.at[(mp.au -= -1856457959) * 844691753] == 1) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              var10000 = true;
                           } else {
                              var10000 = false;
                           }

                           var4 = var10000;
                           if (null != gt.sc) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              gt.sc.bk(new vq(var4), 679814597);
                           }

                           return 1;
                        }
                     } else if (3646 == var0) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        } else {
                           if (cs.at[(mp.au -= -1856457959) * 844691753] == 1) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              var10000 = true;
                           } else {
                              var10000 = false;
                           }

                           var4 = var10000;
                           if (gt.sc != null) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              gt.sc.bk(new vj(var4), -523791817);
                           }

                           return 1;
                        }
                     } else if (var0 == 3647) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        } else {
                           if (cs.at[(mp.au -= -1856457959) * 844691753] == 1) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              var10000 = true;
                           } else {
                              var10000 = false;
                           }

                           var4 = var10000;
                           if (null != gt.sc) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              gt.sc.bk(new ee(var4), 906691174);
                           }

                           return 1;
                        }
                     } else if (var0 == 3648) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        } else {
                           if (cs.at[(mp.au -= -1856457959) * 844691753] == 1) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              var10000 = true;
                           } else {
                              var10000 = false;
                           }

                           var4 = var10000;
                           if (gt.sc != null) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              gt.sc.bk(new es(var4), 1766322943);
                           }

                           return 1;
                        }
                     } else if (3649 == var0) {
                        if (cs.at[(mp.au -= -1856457959) * 844691753] == 1) {
                           if (var3 == 125772335) {
                              throw new IllegalStateException();
                           }

                           var10000 = true;
                        } else {
                           var10000 = false;
                        }

                        var4 = var10000;
                        if (gt.sc != null) {
                           gt.sc.bk(new ed(var4), -803336722);
                        }

                        return 1;
                     } else if (var0 == 3650) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        } else {
                           if (cs.at[(mp.au -= -1856457959) * 844691753] == 1) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              var10000 = true;
                           } else {
                              var10000 = false;
                           }

                           var4 = var10000;
                           if (null != gt.sc) {
                              gt.sc.bk(new et(var4), 14217981);
                           }

                           return 1;
                        }
                     } else if (3651 == var0) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        } else {
                           var4 = cs.at[(mp.au -= -1856457959) * 844691753] == 1;
                           if (gt.sc != null) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              gt.sc.bk(new er(var4), -1892885634);
                           }

                           return 1;
                        }
                     } else if (3652 == var0) {
                        if (cs.at[(mp.au -= -1856457959) * 844691753] == 1) {
                           if (var3 == 125772335) {
                              throw new IllegalStateException();
                           }

                           var10000 = true;
                        } else {
                           var10000 = false;
                        }

                        var4 = var10000;
                        if (null != gt.sc) {
                           gt.sc.bk(new ey(var4), 1147812499);
                        }

                        return 1;
                     } else if (var0 == 3653) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        } else {
                           if (cs.at[(mp.au -= -1856457959) * 844691753] == 1) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              var10000 = true;
                           } else {
                              var10000 = false;
                           }

                           var4 = var10000;
                           if (null != gt.sc) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              gt.sc.bk(new eq(var4), -1361222463);
                           }

                           return 1;
                        }
                     } else if (var0 == 3654) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        } else {
                           if (cs.at[(mp.au -= -1856457959) * 844691753] == 1) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              var10000 = true;
                           } else {
                              var10000 = false;
                           }

                           var4 = var10000;
                           if (null != gt.sc) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              gt.sc.bk(new ej(var4), -1274684839);
                           }

                           return 1;
                        }
                     } else if (3655 == var0) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        } else {
                           if (null != gt.sc) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              gt.sc.bl((byte)1);
                           }

                           return 1;
                        }
                     } else if (3656 == var0) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        } else {
                           if (cs.at[(mp.au -= -1856457959) * 844691753] == 1) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              var10000 = true;
                           } else {
                              var10000 = false;
                           }

                           var4 = var10000;
                           qv.vj.ax.bk(new ec(var4), 521947514);
                           return 1;
                        }
                     } else if (3657 == var0) {
                        if (var3 == 125772335) {
                           throw new IllegalStateException();
                        } else {
                           if (cs.at[(mp.au -= -1856457959) * 844691753] == 1) {
                              if (var3 == 125772335) {
                                 throw new IllegalStateException();
                              }

                              var10000 = true;
                           } else {
                              var10000 = false;
                           }

                           var4 = var10000;
                           if (gt.sc != null) {
                              gt.sc.bk(new ec(var4), 1619852579);
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
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ja.bx(" + ')');
      }
   }

   void ac(ju var1, int var2, int var3, int var4, int var5, long var6) {
      try {
         var1.jh(var2, this.ac, var3, var4, var5, var6);
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "ja.ac(" + ')');
      }
   }
}
