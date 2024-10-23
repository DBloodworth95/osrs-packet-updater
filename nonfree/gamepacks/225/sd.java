public class sd extends sf {
   final ub ag;
   public static final int ae = 200;
   static final int ac = 400;
   int am;
   public pw ax;
   static String gt;

   ss[] ax(int var1) {
      return new sr[var1];
   }

   public boolean ah(wf var1, boolean var2) {
      sr var3 = (sr)this.bw(var1, (byte)-8);
      if (null == var3) {
         return false;
      } else {
         return !var2 || var3.ax * -1744892407 != 0;
      }
   }

   ss ac(int var1) {
      try {
         return new sr();
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "sd.ac(" + ')');
      }
   }

   public boolean ag(wf var1, boolean var2, byte var3) {
      try {
         sr var4 = (sr)this.bw(var1, (byte)-72);
         if (null == var4) {
            if (var3 <= 4) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            if (var2) {
               if (var3 <= 4) {
                  throw new IllegalStateException();
               }

               if (var4.ax * -1744892407 == 0) {
                  return false;
               }
            }

            return true;
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "sd.ag(" + ')');
      }
   }

   public void au(vf var1, int var2, int var3) {
      try {
         while(var1.au * -1027766515 < var2) {
            if (var3 == -79167835) {
               return;
            }

            boolean var10000;
            if (var1.cv(952452697) == 1) {
               if (var3 == -79167835) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var4 = var10000;
            wf var5 = new wf(var1.cs(1367689668), this.ag);
            wf var6 = new wf(var1.cs(-601583823), this.ag);
            int var7 = var1.ct(-1319510016);
            int var8 = var1.cv(952452697);
            int var9 = var1.cv(952452697);
            if (0 != (var9 & 2)) {
               if (var3 == -79167835) {
                  return;
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var10 = var10000;
            if (0 != (var9 & 1)) {
               if (var3 == -79167835) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var11 = var10000;
            if (var7 > 0) {
               if (var3 == -79167835) {
                  throw new IllegalStateException();
               }

               var1.cs(1175483211);
               var1.cv(952452697);
               var1.cz(-1734056172);
            }

            var1.cs(495258928);
            if (var5 != null) {
               if (var3 == -79167835) {
                  throw new IllegalStateException();
               }

               if (var5.ag(-685366372)) {
                  sr var12 = (sr)this.ba(var5, -628761525);
                  if (var4) {
                     if (var3 == -79167835) {
                        throw new IllegalStateException();
                     }

                     sr var13 = (sr)this.ba(var6, 1964596886);
                     if (null != var13) {
                        if (var3 == -79167835) {
                           throw new IllegalStateException();
                        }

                        if (var12 != var13) {
                           if (var3 == -79167835) {
                              throw new IllegalStateException();
                           }

                           if (null != var12) {
                              if (var3 == -79167835) {
                                 throw new IllegalStateException();
                              }

                              this.by(var13, (byte)84);
                           } else {
                              var12 = var13;
                           }
                        }
                     }
                  }

                  if (var12 != null) {
                     if (var3 == -79167835) {
                        throw new IllegalStateException();
                     }

                     this.bz(var12, var5, var6, -45265996);
                     if (-1744892407 * var12.ax != var7) {
                        if (var3 == -79167835) {
                           return;
                        }

                        boolean var16 = true;

                        for(sj var14 = (sj)this.ax.ae(); null != var14; var14 = (sj)this.ax.ag()) {
                           if (var14.ae.equals(var5)) {
                              if (var3 == -79167835) {
                                 throw new IllegalStateException();
                              }

                              if (0 != var7) {
                                 if (var3 == -79167835) {
                                    throw new IllegalStateException();
                                 }

                                 if (0 == var14.ag) {
                                    if (var3 == -79167835) {
                                       throw new IllegalStateException();
                                    }

                                    var14.ac();
                                    var16 = false;
                                    continue;
                                 }
                              }

                              if (var7 == 0) {
                                 if (var3 == -79167835) {
                                    throw new IllegalStateException();
                                 }

                                 if (0 != var14.ag) {
                                    if (var3 == -79167835) {
                                       throw new IllegalStateException();
                                    }

                                    var14.ac();
                                    var16 = false;
                                 }
                              }
                           }
                        }

                        if (var16) {
                           this.ax.ac(new sj(var5, var7));
                        }
                     }
                  } else {
                     if (this.bf(1363647746) >= 400) {
                        continue;
                     }

                     var12 = (sr)this.bi(var5, var6, 1984681959);
                  }

                  if (var7 != var12.ax * -1744892407) {
                     if (var3 == -79167835) {
                        throw new IllegalStateException();
                     }

                     var12.aq = ((this.am += -1111717085) * 1599011979 - 1) * -1560980049;
                     if (-1 == var12.ax * -1744892407) {
                        if (var3 == -79167835) {
                           throw new IllegalStateException();
                        }

                        if (var7 == 0) {
                           if (var3 == -79167835) {
                              return;
                           }

                           var12.aq = -(1 * var12.aq);
                        }
                     }

                     var12.ax = 1476321337 * var7;
                  }

                  var12.af = var8 * 1260124039;
                  var12.ac = var10;
                  var12.ae = var11;
                  continue;
               }
            }

            throw new IllegalStateException();
         }

         this.bl((byte)1);
      } catch (RuntimeException var15) {
         throw vk.ae(var15, "sd.au(" + ')');
      }
   }

   ss am() {
      return new sr();
   }

   public boolean ar(wf var1, boolean var2) {
      sr var3 = (sr)this.bw(var1, (byte)-109);
      if (null == var3) {
         return false;
      } else {
         return !var2 || var3.ax * 1568912365 != 0;
      }
   }

   ss[] aq(int var1) {
      return new sr[var1];
   }

   ss[] af(int var1) {
      return new sr[var1];
   }

   ss[] at(int var1) {
      return new sr[var1];
   }

   public void aa(vf var1, int var2) {
      while(true) {
         if (var1.au * -1027766515 < var2) {
            boolean var3 = var1.cv(952452697) == 1;
            wf var4 = new wf(var1.cs(-736717884), this.ag);
            wf var5 = new wf(var1.cs(1784796600), this.ag);
            int var6 = var1.ct(-1946035260);
            int var7 = var1.cv(952452697);
            int var8 = var1.cv(952452697);
            boolean var9 = 0 != (var8 & 2);
            boolean var10 = 0 != (var8 & 1);
            if (var6 > 0) {
               var1.cs(-270595190);
               var1.cv(952452697);
               var1.cz(-1734056172);
            }

            var1.cs(-1658524267);
            if (var4 != null && var4.ag(1899601391)) {
               sr var11 = (sr)this.ba(var4, 706792234);
               if (var3) {
                  sr var12 = (sr)this.ba(var5, -65327789);
                  if (null != var12 && var11 != var12) {
                     if (null != var11) {
                        this.by(var12, (byte)95);
                     } else {
                        var11 = var12;
                     }
                  }
               }

               if (var11 != null) {
                  this.bz(var11, var4, var5, 866407315);
                  if (-1744892407 * var11.ax != var6) {
                     boolean var14 = true;

                     for(sj var13 = (sj)this.ax.ae(); null != var13; var13 = (sj)this.ax.ag()) {
                        if (var13.ae.equals(var4)) {
                           if (0 != var6 && 0 == var13.ag) {
                              var13.ac();
                              var14 = false;
                           } else if (var6 == 0 && 0 != var13.ag) {
                              var13.ac();
                              var14 = false;
                           }
                        }
                     }

                     if (var14) {
                        this.ax.ac(new sj(var4, var6));
                     }
                  }
               } else {
                  if (this.bf(1363647746) >= 400) {
                     continue;
                  }

                  var11 = (sr)this.bi(var4, var5, 2023284731);
               }

               if (var6 != var11.ax * -1744892407) {
                  var11.aq = ((this.am += -1111717085) * 1599011979 - 1) * -1560980049;
                  if (-1 == var11.ax * -1744892407 && var6 == 0) {
                     var11.aq = -(1 * var11.aq);
                  }

                  var11.ax = 1476321337 * var6;
               }

               var11.af = var7 * 1260124039;
               var11.ac = var9;
               var11.ae = var10;
               continue;
            }

            throw new IllegalStateException();
         }

         this.bl((byte)1);
         return;
      }
   }

   public boolean al(wf var1, boolean var2) {
      sr var3 = (sr)this.bw(var1, (byte)-36);
      if (null == var3) {
         return false;
      } else {
         return !var2 || var3.ax * -1744892407 != 0;
      }
   }

   public boolean ad(wf var1, boolean var2) {
      sr var3 = (sr)this.bw(var1, (byte)-107);
      if (null == var3) {
         return false;
      } else {
         return !var2 || var3.ax * -1744892407 != 0;
      }
   }

   public sd(ub var1) {
      try {
         super(400);
         this.am = -1111717085;
         this.ax = new pw();
         this.ag = var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "sd.<init>(" + ')');
      }
   }

   public void ap(vf var1, int var2) {
      while(true) {
         if (var1.au * -1027766515 < var2) {
            boolean var3 = var1.cv(952452697) == 1;
            wf var4 = new wf(var1.cs(1248060618), this.ag);
            wf var5 = new wf(var1.cs(566208238), this.ag);
            int var6 = var1.ct(-2030937199);
            int var7 = var1.cv(952452697);
            int var8 = var1.cv(952452697);
            boolean var9 = 0 != (var8 & 2);
            boolean var10 = 0 != (var8 & 1);
            if (var6 > 0) {
               var1.cs(1944199680);
               var1.cv(952452697);
               var1.cz(-1734056172);
            }

            var1.cs(1691340648);
            if (var4 != null && var4.ag(-2082059675)) {
               sr var11 = (sr)this.ba(var4, -244695011);
               if (var3) {
                  sr var12 = (sr)this.ba(var5, 1081764062);
                  if (null != var12 && var11 != var12) {
                     if (null != var11) {
                        this.by(var12, (byte)106);
                     } else {
                        var11 = var12;
                     }
                  }
               }

               if (var11 != null) {
                  this.bz(var11, var4, var5, -1848321763);
                  if (-1744892407 * var11.ax != var6) {
                     boolean var14 = true;

                     for(sj var13 = (sj)this.ax.ae(); null != var13; var13 = (sj)this.ax.ag()) {
                        if (var13.ae.equals(var4)) {
                           if (0 != var6 && 0 == var13.ag) {
                              var13.ac();
                              var14 = false;
                           } else if (var6 == 0 && 0 != var13.ag) {
                              var13.ac();
                              var14 = false;
                           }
                        }
                     }

                     if (var14) {
                        this.ax.ac(new sj(var4, var6));
                     }
                  }
               } else {
                  if (this.bf(1363647746) >= 400) {
                     continue;
                  }

                  var11 = (sr)this.bi(var4, var5, 2024533075);
               }

               if (var6 != var11.ax * -1744892407) {
                  var11.aq = ((this.am += -1111717085) * 1599011979 - 1) * -1560980049;
                  if (-1 == var11.ax * -1744892407 && var6 == 0) {
                     var11.aq = -(1 * var11.aq);
                  }

                  var11.ax = 1476321337 * var6;
               }

               var11.af = var7 * 1260124039;
               var11.ac = var9;
               var11.ae = var10;
               continue;
            }

            throw new IllegalStateException();
         }

         this.bl((byte)1);
         return;
      }
   }

   ss[] ae(int var1, int var2) {
      try {
         return new sr[var1];
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "sd.ae(" + ')');
      }
   }

   public void az(vf var1, int var2) {
      while(true) {
         if (var1.au * -1027766515 < var2) {
            boolean var3 = var1.cv(952452697) == 1;
            wf var4 = new wf(var1.cs(-366281224), this.ag);
            wf var5 = new wf(var1.cs(710260698), this.ag);
            int var6 = var1.ct(-1782462161);
            int var7 = var1.cv(952452697);
            int var8 = var1.cv(952452697);
            boolean var9 = 0 != (var8 & 2);
            boolean var10 = 0 != (var8 & 1);
            if (var6 > 0) {
               var1.cs(446564262);
               var1.cv(952452697);
               var1.cz(-1734056172);
            }

            var1.cs(1927409244);
            if (var4 != null && var4.ag(1732049280)) {
               sr var11 = (sr)this.ba(var4, 1446399953);
               if (var3) {
                  sr var12 = (sr)this.ba(var5, 544253975);
                  if (null != var12 && var11 != var12) {
                     if (null != var11) {
                        this.by(var12, (byte)93);
                     } else {
                        var11 = var12;
                     }
                  }
               }

               if (var11 != null) {
                  this.bz(var11, var4, var5, -313376397);
                  if (685425567 * var11.ax != var6) {
                     boolean var14 = true;

                     for(sj var13 = (sj)this.ax.ae(); null != var13; var13 = (sj)this.ax.ag()) {
                        if (var13.ae.equals(var4)) {
                           if (0 != var6 && 0 == var13.ag) {
                              var13.ac();
                              var14 = false;
                           } else if (var6 == 0 && 0 != var13.ag) {
                              var13.ac();
                              var14 = false;
                           }
                        }
                     }

                     if (var14) {
                        this.ax.ac(new sj(var4, var6));
                     }
                  }
               } else {
                  if (this.bf(1363647746) >= 400) {
                     continue;
                  }

                  var11 = (sr)this.bi(var4, var5, 2094203954);
               }

               if (var6 != var11.ax * -912201431) {
                  var11.aq = ((this.am += -1564749255) * 287384418 - 1) * -1560980049;
                  if (-1 == var11.ax * -165778068 && var6 == 0) {
                     var11.aq = -(1 * var11.aq);
                  }

                  var11.ax = 1008843095 * var6;
               }

               var11.af = var7 * -531686660;
               var11.ac = var9;
               var11.ae = var10;
               continue;
            }

            throw new IllegalStateException();
         }

         this.bl((byte)1);
         return;
      }
   }

   public void ab(vf var1, int var2) {
      while(true) {
         if (var1.au * -1027766515 < var2) {
            boolean var3 = var1.cv(952452697) == 1;
            wf var4 = new wf(var1.cs(-1924588872), this.ag);
            wf var5 = new wf(var1.cs(4771052), this.ag);
            int var6 = var1.ct(-2099661637);
            int var7 = var1.cv(952452697);
            int var8 = var1.cv(952452697);
            boolean var9 = 0 != (var8 & 2);
            boolean var10 = 0 != (var8 & 1);
            if (var6 > 0) {
               var1.cs(-155337063);
               var1.cv(952452697);
               var1.cz(-1734056172);
            }

            var1.cs(-1311016594);
            if (var4 != null && var4.ag(-1114139046)) {
               sr var11 = (sr)this.ba(var4, -333743791);
               if (var3) {
                  sr var12 = (sr)this.ba(var5, 1920083776);
                  if (null != var12 && var11 != var12) {
                     if (null != var11) {
                        this.by(var12, (byte)102);
                     } else {
                        var11 = var12;
                     }
                  }
               }

               if (var11 != null) {
                  this.bz(var11, var4, var5, 1139104870);
                  if (-1744892407 * var11.ax != var6) {
                     boolean var14 = true;

                     for(sj var13 = (sj)this.ax.ae(); null != var13; var13 = (sj)this.ax.ag()) {
                        if (var13.ae.equals(var4)) {
                           if (0 != var6 && 0 == var13.ag) {
                              var13.ac();
                              var14 = false;
                           } else if (var6 == 0 && 0 != var13.ag) {
                              var13.ac();
                              var14 = false;
                           }
                        }
                     }

                     if (var14) {
                        this.ax.ac(new sj(var4, var6));
                     }
                  }
               } else {
                  if (this.bf(1363647746) >= 400) {
                     continue;
                  }

                  var11 = (sr)this.bi(var4, var5, 2106562238);
               }

               if (var6 != var11.ax * -446955963) {
                  var11.aq = ((this.am += -246365041) * 909863585 - 1) * -1560980049;
                  if (-1 == var11.ax * 1334246961 && var6 == 0) {
                     var11.aq = -(1 * var11.aq);
                  }

                  var11.ax = -1124961715 * var6;
               }

               var11.af = var7 * -1107795715;
               var11.ac = var9;
               var11.ae = var10;
               continue;
            }

            throw new IllegalStateException();
         }

         this.bl((byte)1);
         return;
      }
   }
}
