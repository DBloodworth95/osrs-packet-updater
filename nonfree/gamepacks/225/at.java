import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class at {
   final vf ag;
   Future ae;
   static int[] jf;
   final am am;
   ExecutorService ac;
   static vt az;
   static int tu;
   static ny ow;

   public boolean aq() {
      return this.ae.isDone();
   }

   public boolean ac(byte var1) {
      try {
         return this.ae.isDone();
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "at.ac(" + ')');
      }
   }

   public void ae(int var1) {
      try {
         this.ac.shutdown();
         this.ac = null;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "at.ae(" + ')');
      }
   }

   public static int ax(int var0, int var1) {
      try {
         --var0;
         var0 |= var0 >>> 1;
         var0 |= var0 >>> 2;
         var0 |= var0 >>> 4;
         var0 |= var0 >>> 8;
         var0 |= var0 >>> 16;
         return var0 + 1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "at.ax(" + ')');
      }
   }

   void am(int var1) {
      try {
         this.ae = this.ac.submit(new ae(this, this.ag, this.am));
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "at.am(" + ')');
      }
   }

   public boolean ax() {
      return this.ae.isDone();
   }

   public at(vf var1, am var2) {
      try {
         super();
         this.ac = Executors.newSingleThreadExecutor();
         this.ag = var1;
         this.am = var2;
         this.am(1981636544);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "at.<init>(" + ')');
      }
   }

   public vf af() {
      try {
         return (vf)this.ae.get();
      } catch (Exception var2) {
         return null;
      }
   }

   void at() {
      this.ae = this.ac.submit(new ae(this, this.ag, this.am));
   }

   static void jf(int var0) {
      try {
         Iterator var1 = client.ju.iterator();

         while(var1.hasNext()) {
            dd var2 = (dd)var1.next();

            for(int var3 = 0; var3 < var2.aa * -557899353; ++var3) {
               int var4 = var2.ai[var3];
               su var5 = var2.az[var4];
               if (var5 != null) {
                  var5.az(88744644);
               }
            }
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "at.jf(" + ')');
      }
   }

   static final void og(int var0) {
      try {
         Iterator var1 = client.ju.iterator();

         while(var1.hasNext()) {
            dd var2 = (dd)var1.next();

            for(int var3 = 0; var3 < -396152079 * client.jl.at; ++var3) {
               di var4 = du.js.ad[client.jl.au[var3]];
               if (null != var4) {
                  if (var0 == 2091634730) {
                     throw new IllegalStateException();
                  }

                  var4.ay((byte)37);
               }
            }
         }

      } catch (RuntimeException var5) {
         throw vk.ae(var5, "at.og(" + ')');
      }
   }

   static int ae(int var0, int var1, int var2) {
      try {
         de var3 = (de)de.ac.ac((long)var0);
         if (var3 == null) {
            if (var2 == 857211399) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            if (var1 >= 0) {
               if (var2 == 857211399) {
                  throw new IllegalStateException();
               }

               if (var1 < var3.ag.length) {
                  return var3.ag[var1];
               }

               if (var2 == 857211399) {
                  throw new IllegalStateException();
               }
            }

            return 0;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "at.ae(" + ')');
      }
   }

   static final void jq(dd var0, byte var1) {
      try {
         for(df var2 = (df)var0.ay.af(); var2 != null; var2 = (df)var0.ay.au()) {
            if (var1 >= 71) {
               throw new IllegalStateException();
            }

            if (var0.am * 97097587 == var2.ae * -1819729721 && 1472813913 * client.do <= -1343734409 * var2.al) {
               if (client.do * 1472813913 >= var2.ar * -1554518213) {
                  ea var3;
                  int var4;
                  di var6;
                  if (!var2.az) {
                     if (var1 >= 71) {
                        throw new IllegalStateException();
                     }

                     if (0 != var2.ap * -538558605) {
                        if (var1 >= 71) {
                           throw new IllegalStateException();
                        }

                        if (var2.ap * -538558605 > 0) {
                           if (var1 >= 71) {
                              throw new IllegalStateException();
                           }

                           var3 = gs.jj.ah[var2.ap * -538558605 - 1];
                           if (null != var3) {
                              if (var1 >= 71) {
                                 throw new IllegalStateException();
                              }

                              if (0 <= var3.bf * -1125889549) {
                                 if (var1 >= 71) {
                                    throw new IllegalStateException();
                                 }

                                 if (var3.bf * -1125889549 < 13312 && 0 <= var3.bm * -1650600853) {
                                    if (var1 >= 71) {
                                       throw new IllegalStateException();
                                    }

                                    if (var3.bm * -1650600853 < 13312) {
                                       var2.ag = var3.bf * 2019734147;
                                       var2.am = var3.bm * -1621810449;
                                       var2.ac(-928823359 * var2.af, 1485013559 * var2.at, 1640014625 * var2.au, 1472813913 * client.do, 131339123);
                                    }
                                 }
                              }
                           }
                        } else {
                           var4 = -(var2.ap * -538558605) - 1;
                           if (var4 == client.mf * -797776089) {
                              if (var1 >= 71) {
                                 throw new IllegalStateException();
                              }

                              var6 = qm.mm;
                           } else {
                              var6 = gs.jj.ad[var4];
                           }

                           if (null != var6) {
                              if (var1 >= 71) {
                                 return;
                              }

                              if (0 <= -1125889549 * var6.bf) {
                                 if (var1 >= 71) {
                                    throw new IllegalStateException();
                                 }

                                 if (var6.bf * -1125889549 < 13312) {
                                    if (var1 >= 71) {
                                       throw new IllegalStateException();
                                    }

                                    if (0 <= -1650600853 * var6.bm) {
                                       if (var1 >= 71) {
                                          throw new IllegalStateException();
                                       }

                                       if (-1650600853 * var6.bm < 13312) {
                                          var2.ag = 2019734147 * var6.bf;
                                          var2.am = -1621810449 * var6.bm;
                                          var2.ac(var2.af * -928823359, var2.at * 1485013559, 1640014625 * var2.au, client.do * 1472813913, -315207459);
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }

                  if (var2.ab * 620638805 > 0) {
                     if (var1 >= 71) {
                        throw new IllegalStateException();
                     }

                     var3 = var0.ah[var2.ab * 620638805 - 1];
                     if (null != var3) {
                        if (var1 >= 71) {
                           throw new IllegalStateException();
                        }

                        if (0 <= -1125889549 * var3.bf) {
                           if (var1 >= 71) {
                              return;
                           }

                           if (-1125889549 * var3.bf < 13312 && 0 <= var3.bm * -1650600853) {
                              if (var1 >= 71) {
                                 return;
                              }

                              if (-1650600853 * var3.bm < 13312) {
                                 var2.ac(-1125889549 * var3.bf, var3.bm * -1650600853, he.ki(var0, -1125889549 * var3.bf, -1650600853 * var3.bm, var2.ae * -1819729721, 1364598893) - var2.aq * -1445481407, 1472813913 * client.do, 746354526);
                              }
                           }
                        }
                     }
                  }

                  if (620638805 * var2.ab < 0) {
                     var4 = -(620638805 * var2.ab) - 1;
                     if (client.mf * -797776089 == var4) {
                        if (var1 >= 71) {
                           throw new IllegalStateException();
                        }

                        var6 = qm.mm;
                     } else {
                        var6 = var0.ad[var4];
                     }

                     if (null != var6 && 0 <= var6.bf * -1125889549 && -1125889549 * var6.bf < 13312) {
                        if (var1 >= 71) {
                           throw new IllegalStateException();
                        }

                        if (0 <= var6.bm * -1650600853) {
                           if (var1 >= 71) {
                              throw new IllegalStateException();
                           }

                           if (-1650600853 * var6.bm < 13312) {
                              if (var1 >= 71) {
                                 throw new IllegalStateException();
                              }

                              var2.ac(-1125889549 * var6.bf, var6.bm * -1650600853, he.ki(var0, -1125889549 * var6.bf, var6.bm * -1650600853, var2.ae * -1819729721, 1364598893) - var2.aq * -1445481407, 1472813913 * client.do, 680598165);
                           }
                        }
                     }
                  }

                  var2.ae(-766676153 * client.jd, (byte)40);
                  var0.ae.az(var0.am * 97097587, (int)var2.aa, (int)var2.ai, (int)var2.ao, 60, var2, var2.an * -1523857173, -1L, false);
               }
            } else {
               var2.jb();
            }
         }

      } catch (RuntimeException var5) {
         throw vk.ae(var5, "at.jq(" + ')');
      }
   }

   static void cm(int var0, nm var1, boolean var2, int var3) {
      try {
         ky var4 = fd.hc((byte)119).bf(var0, -1835480815);
         int var5 = qm.mm.av * 1019353099;
         int var6 = (-1125889549 * qm.mm.bf >> 7) + 2072219689 * du.js.af;
         int var7 = (qm.mm.bm * -1650600853 >> 7) + du.js.at * 1001606641;
         nm var8 = new nm(var5, var6, var7);
         fd.hc((byte)114).ai(var4, var8, var1, var2, (byte)7);
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "at.cm(" + ')');
      }
   }

   static final void kn(int var0, int var1, int var2, int var3, int var4) {
      try {
         cb.ku(-1353836401);
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "at.kn(" + ')');
      }
   }

   public vf ag(int var1) {
      try {
         try {
            return (vf)this.ae.get();
         } catch (Exception var3) {
            return null;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "at.ag(" + ')');
      }
   }

   public static int am(CharSequence var0, int var1, int var2) {
      try {
         return fc.ax(var0, var1, true, (byte)36);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "at.am(" + ')');
      }
   }
}
