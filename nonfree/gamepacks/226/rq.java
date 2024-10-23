import java.util.Iterator;

public class rq extends ra {
   static final int aw = 5000000;

   public boolean ap(int var1) {
      try {
         Iterator var2 = mp.ay.iterator();

         while(var2.hasNext()) {
            if (var1 != 343486624) {
               throw new IllegalStateException();
            }

            no var3 = (no)var2.next();
            if (var3 != null) {
               if (var1 != 343486624) {
                  throw new IllegalStateException();
               }

               if (!var3.ae) {
                  if (var1 != 343486624) {
                     throw new IllegalStateException();
                  }

                  if (var3.au == null) {
                     if (var1 != 343486624) {
                        throw new IllegalStateException();
                     }
                  } else {
                     try {
                        var3.au.ai((byte)1);
                        var3.au.ap(0, (short)-11747);
                        if (null != var3.ao) {
                           if (var1 != 343486624) {
                              throw new IllegalStateException();
                           }

                           var3.au.an(var3.ao, var3.ay, -1356460749);
                        }

                        var3.ao = null;
                        var3.an = null;
                        var3.ap = null;
                        var3.ae = true;
                     } catch (Exception var5) {
                        rl.ap((String)null, var5, (byte)-68);
                        this.au(var5.getMessage(), 634133961);
                        return true;
                     }
                  }
               }
            }
         }

         this.as = true;
         return true;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "rq.ap(" + ')');
      }
   }

   public rq(ra var1) {
      try {
         super(var1);
         this.ai = "StartSongTask";
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "rq.<init>(" + ')');
      }
   }

   public boolean ak() {
      Iterator var1 = mp.ay.iterator();

      while(var1.hasNext()) {
         no var2 = (no)var1.next();
         if (var2 != null && !var2.ae && var2.au != null) {
            try {
               var2.au.ai((byte)1);
               var2.au.ap(0, (short)-32075);
               if (null != var2.ao) {
                  var2.au.an(var2.ao, var2.ay, 1925997876);
               }

               var2.ao = null;
               var2.an = null;
               var2.ap = null;
               var2.ae = true;
            } catch (Exception var4) {
               rl.ap((String)null, var4, (byte)-12);
               this.au(var4.getMessage(), 634133961);
               return true;
            }
         }
      }

      this.as = true;
      return true;
   }

   public boolean aj() {
      Iterator var1 = mp.ay.iterator();

      while(var1.hasNext()) {
         no var2 = (no)var1.next();
         if (var2 != null && !var2.ae && var2.au != null) {
            try {
               var2.au.ai((byte)1);
               var2.au.ap(0, (short)-27129);
               if (null != var2.ao) {
                  var2.au.an(var2.ao, var2.ay, -718908423);
               }

               var2.ao = null;
               var2.an = null;
               var2.ap = null;
               var2.ae = true;
            } catch (Exception var4) {
               rl.ap((String)null, var4, (byte)-59);
               this.au(var4.getMessage(), 634133961);
               return true;
            }
         }
      }

      this.as = true;
      return true;
   }

   static final void jf(int var0) {
      try {
         ec.jv(false, (byte)57);
         client.ib = 0;
         boolean var1 = true;

         int var2;
         for(var2 = 0; var2 < oy.jw.length; ++var2) {
            if (var0 >= 881951061) {
               throw new IllegalStateException();
            }

            if (gn.jd[var2] != -1) {
               if (var0 >= 881951061) {
                  return;
               }

               if (oy.jw[var2] == null) {
                  if (var0 >= 881951061) {
                     throw new IllegalStateException();
                  }

                  oy.jw[var2] = he.fo.bm(gn.jd[var2], 0, 1952920953);
                  if (oy.jw[var2] == null) {
                     var1 = false;
                     client.ib += 697717719;
                  }
               }
            }

            if (iw.ju[var2] != -1) {
               if (var0 >= 881951061) {
                  throw new IllegalStateException();
               }

               if (null == ai.jm[var2]) {
                  if (var0 >= 881951061) {
                     return;
                  }

                  ai.jm[var2] = he.fo.bo(iw.ju[var2], 0, fj.jg[var2], (byte)14);
                  if (ai.jm[var2] == null) {
                     if (var0 >= 881951061) {
                        throw new IllegalStateException();
                     }

                     var1 = false;
                     client.ib += 697717719;
                  }
               }
            }
         }

         if (!var1) {
            if (var0 >= 881951061) {
               throw new IllegalStateException();
            } else {
               client.is = 2114410947;
            }
         } else {
            client.ie = 0;
            var1 = true;

            int var4;
            int var5;
            for(var2 = 0; var2 < oy.jw.length; ++var2) {
               byte[] var3 = ai.jm[var2];
               if (null != var3) {
                  if (var0 >= 881951061) {
                     return;
                  }

                  var4 = (kk.jj[var2] >> 8) * 64 - hx.jf.as * -2014668603;
                  var5 = 64 * (kk.jj[var2] & 255) - hx.jf.ae * 1601580509;
                  if (client.ja) {
                     if (var0 >= 881951061) {
                        return;
                     }

                     var4 = 10;
                     var5 = 10;
                  }

                  var1 &= dh.ae(var3, var4, var5, (byte)-16);
               }
            }

            if (!var1) {
               if (var0 >= 881951061) {
                  throw new IllegalStateException();
               } else {
                  client.is = -66145402;
               }
            } else {
               if (0 != client.is * 47800043) {
                  if (var0 >= 881951061) {
                     return;
                  }

                  ir.iq(og.af + eh.as + eh.aj + 100 + "%" + eh.ai, true, (byte)-1);
               }

               fx.hf(-1634262154);
               hx.jf.aw.ap();

               for(var2 = 0; var2 < 4; ++var2) {
                  if (var0 >= 881951061) {
                     throw new IllegalStateException();
                  }

                  hx.jf.ak[var2].ap(-1906568538);
               }

               int var17;
               for(var2 = 0; var2 < 4; ++var2) {
                  if (var0 >= 881951061) {
                     throw new IllegalStateException();
                  }

                  for(var17 = 0; var17 < 104; ++var17) {
                     if (var0 >= 881951061) {
                        throw new IllegalStateException();
                     }

                     for(var4 = 0; var4 < 104; ++var4) {
                        hx.jf.au[var2][var17][var4] = 0;
                     }
                  }
               }

               fx.hf(865118498);
               ei.ap((byte)81);
               var2 = oy.jw.length;
               lm.ap(-1736328679);
               ec.jv(true, (byte)95);
               int var19;
               if (!client.ja) {
                  if (var0 >= 881951061) {
                     return;
                  }

                  byte[] var6;
                  for(var17 = 0; var17 < var2; ++var17) {
                     if (var0 >= 881951061) {
                        throw new IllegalStateException();
                     }

                     var4 = (kk.jj[var17] >> 8) * 64 - -2014668603 * hx.jf.as;
                     var5 = 64 * (kk.jj[var17] & 255) - hx.jf.ae * 1601580509;
                     var6 = oy.jw[var17];
                     if (null != var6) {
                        if (var0 >= 881951061) {
                           throw new IllegalStateException();
                        }

                        fx.hf(-575879188);
                        aw.aj(hx.jf, var6, var4, var5, 969190824 * na.ik - 48, fj.ig * -579599976 - 48, (byte)94);
                     }
                  }

                  for(var17 = 0; var17 < var2; ++var17) {
                     if (var0 >= 881951061) {
                        throw new IllegalStateException();
                     }

                     var4 = 64 * (kk.jj[var17] >> 8) - -2014668603 * hx.jf.as;
                     var5 = 64 * (kk.jj[var17] & 255) - 1601580509 * hx.jf.ae;
                     var6 = oy.jw[var17];
                     if (null == var6) {
                        if (var0 >= 881951061) {
                           throw new IllegalStateException();
                        }

                        if (fj.ig * -1683062733 < 800) {
                           if (var0 >= 881951061) {
                              throw new IllegalStateException();
                           }

                           fx.hf(-582173127);
                           dr.ak(hx.jf, var4, var5, 64, 64, 2126754606);
                        }
                     }
                  }

                  ec.jv(true, (byte)6);

                  for(var17 = 0; var17 < var2; ++var17) {
                     byte[] var18 = ai.jm[var17];
                     if (null != var18) {
                        if (var0 >= 881951061) {
                           throw new IllegalStateException();
                        }

                        var5 = 64 * (kk.jj[var17] >> 8) - hx.jf.as * -2014668603;
                        var19 = 64 * (kk.jj[var17] & 255) - 1601580509 * hx.jf.ae;
                        fx.hf(-1888420411);
                        as.am(hx.jf, var18, var5, var19, -751194841);
                     }
                  }
               }

               int var7;
               int var8;
               int var9;
               if (client.ja) {
                  if (var0 >= 881951061) {
                     throw new IllegalStateException();
                  }

                  int var10;
                  int var11;
                  int var12;
                  for(var17 = 0; var17 < 4; ++var17) {
                     if (var0 >= 881951061) {
                        throw new IllegalStateException();
                     }

                     fx.hf(287762206);

                     for(var4 = 0; var4 < 13; ++var4) {
                        for(var5 = 0; var5 < 13; ++var5) {
                           if (var0 >= 881951061) {
                              return;
                           }

                           boolean var20 = false;
                           var7 = client.jo[var17][var4][var5];
                           if (-1 != var7) {
                              if (var0 >= 881951061) {
                                 throw new IllegalStateException();
                              }

                              var8 = var7 >> 24 & 3;
                              var9 = var7 >> 1 & 3;
                              var10 = var7 >> 14 & 1023;
                              var11 = var7 >> 3 & 2047;
                              var12 = var11 / 8 + (var10 / 8 << 8);

                              for(int var13 = 0; var13 < kk.jj.length; ++var13) {
                                 if (var0 >= 881951061) {
                                    return;
                                 }

                                 if (kk.jj[var13] == var12) {
                                    if (var0 >= 881951061) {
                                       return;
                                    }

                                    if (oy.jw[var13] != null) {
                                       if (var0 >= 881951061) {
                                          throw new IllegalStateException();
                                       }

                                       int var14 = 8 * (var10 - var4);
                                       int var15 = 8 * (var11 - var5);
                                       rm.ai(hx.jf, oy.jw[var13], var17, var4 * 8, 8 * var5, var8, 8 * (var10 & 7), 8 * (var11 & 7), var9, var14, var15, 728392059);
                                       var20 = true;
                                       break;
                                    }
                                 }
                              }
                           }

                           if (!var20) {
                              if (var0 >= 881951061) {
                                 return;
                              }

                              fm.ay(hx.jf.at, var17, var4 * 8, 8 * var5, 692898383);
                           }
                        }
                     }
                  }

                  for(var17 = 0; var17 < 13; ++var17) {
                     for(var4 = 0; var4 < 13; ++var4) {
                        var5 = client.jo[0][var17][var4];
                        if (-1 == var5) {
                           dr.ak(hx.jf, 8 * var17, var4 * 8, 8, 8, 2129246771);
                        }
                     }
                  }

                  ec.jv(true, (byte)52);

                  for(var17 = 0; var17 < 4; ++var17) {
                     if (var0 >= 881951061) {
                        throw new IllegalStateException();
                     }

                     fx.hf(-1810973806);

                     for(var4 = 0; var4 < 13; ++var4) {
                        if (var0 >= 881951061) {
                           return;
                        }

                        for(var5 = 0; var5 < 13; ++var5) {
                           if (var0 >= 881951061) {
                              throw new IllegalStateException();
                           }

                           var19 = client.jo[var17][var4][var5];
                           if (-1 != var19) {
                              var7 = var19 >> 24 & 3;
                              var8 = var19 >> 1 & 3;
                              var9 = var19 >> 14 & 1023;
                              var10 = var19 >> 3 & 2047;
                              var11 = var10 / 8 + (var9 / 8 << 8);

                              for(var12 = 0; var12 < kk.jj.length; ++var12) {
                                 if (var0 >= 881951061) {
                                    throw new IllegalStateException();
                                 }

                                 if (kk.jj[var12] == var11) {
                                    if (var0 >= 881951061) {
                                       throw new IllegalStateException();
                                    }

                                    if (ai.jm[var12] != null) {
                                       if (var0 >= 881951061) {
                                          throw new IllegalStateException();
                                       }

                                       dg.at(hx.jf, ai.jm[var12], var17, var4 * 8, 8 * var5, var7, 8 * (var9 & 7), 8 * (var10 & 7), var8);
                                       break;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               ec.jv(true, (byte)70);
               fx.hf(-2106604433);
               tm.an(hx.jf, (byte)1);
               ec.jv(true, (byte)76);
               var17 = -213423439 * dg.ap;
               if (var17 > hx.jf.aj * 86027145) {
                  if (var0 >= 881951061) {
                     throw new IllegalStateException();
                  }

                  var17 = 86027145 * hx.jf.aj;
               }

               if (var17 < 86027145 * hx.jf.aj - 1) {
                  if (var0 >= 881951061) {
                     throw new IllegalStateException();
                  }

                  var17 = 86027145 * hx.jf.aj - 1;
               }

               if (client.cl) {
                  if (var0 >= 881951061) {
                     throw new IllegalStateException();
                  }

                  hx.jf.aw.aw(-213423439 * dg.ap);
               } else {
                  hx.jf.aw.aw(0);
               }

               for(var4 = 0; var4 < 104; ++var4) {
                  for(var5 = 0; var5 < 104; ++var5) {
                     pw.kl(hx.jf, var4, var5, (byte)-114);
                  }
               }

               fx.hf(-225799651);
               dw.ki(603461933);
               ir.ai.aj();
               me var21;
               if (dd.bl.bo(1601143776)) {
                  if (var0 >= 881951061) {
                     throw new IllegalStateException();
                  }

                  var21 = ef.ap(mm.bl, client.in.ai, (byte)16);
                  var21.ak.bw(1057001181, (byte)26);
                  client.in.ak(var21, (short)486);
               }

               if (!client.ja) {
                  if (var0 >= 881951061) {
                     throw new IllegalStateException();
                  }

                  var4 = (-952592971 * na.ik - 6) / 8;
                  var5 = (6 + -952592971 * na.ik) / 8;
                  var19 = (fj.ig * -1683062733 - 6) / 8;
                  var7 = (6 + -1683062733 * fj.ig) / 8;

                  for(var8 = var4 - 1; var8 <= 1 + var5; ++var8) {
                     if (var0 >= 881951061) {
                        throw new IllegalStateException();
                     }

                     for(var9 = var19 - 1; var9 <= var7 + 1; ++var9) {
                        if (var0 >= 881951061) {
                           throw new IllegalStateException();
                        }

                        if (var8 >= var4) {
                           if (var0 >= 881951061) {
                              throw new IllegalStateException();
                           }

                           if (var8 <= var5) {
                              if (var0 >= 881951061) {
                                 throw new IllegalStateException();
                              }

                              if (var9 >= var19) {
                                 if (var0 >= 881951061) {
                                    throw new IllegalStateException();
                                 }

                                 if (var9 <= var7) {
                                    if (var0 >= 881951061) {
                                       throw new IllegalStateException();
                                    }
                                    continue;
                                 }
                              }
                           }
                        }

                        he.fo.ce("m" + var8 + "_" + var9, (byte)40);
                        he.fo.ce("l" + var8 + "_" + var9, (byte)12);
                     }
                  }
               }

               fx.hf(-688756443);
               db.aw((byte)42);
               var21 = ef.ap(mm.bj, client.in.ai, (byte)91);
               client.in.ak(var21, (short)486);
               gw.bp((byte)1);
               client.dd = false;
            }
         }
      } catch (RuntimeException var16) {
         throw tm.aw(var16, "rq.jf(" + ')');
      }
   }
}
