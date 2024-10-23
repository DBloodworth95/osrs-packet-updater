import java.util.Arrays;

public class nr {
   int[] ae;
   gv[] au;
   int[] ag;
   public int am;
   public int ax;
   public int aq;
   long af;
   long at;
   final int aa;
   boolean ar;
   public static short[] al;
   public static ml ai = new ml(260);
   public static final int az = 2048;
   int[] ac;
   public static ry ao;
   public static int as;

   public void an(int[] var1, int[] var2, int[] var3, int var4, int var5) {
      if (var1 == null) {
         var1 = this.ag(var4, (byte)-24);
      }

      if (var2 == null) {
         var2 = this.ag(var4, (byte)-89);
      }

      this.ac = var1;
      this.ae = var2;
      this.ag = var3;
      this.ax = var4 * -1019059423;
      this.aq = var5 * 588858273;
      this.at((byte)-56);
   }

   hr cc(int var1) {
      return il.ac(var1 - 256, (byte)-123);
   }

   int cp(int var1) {
      return -2023519509 * this.aa + (var1 - 512);
   }

   public jm bo(if var1, int var2, if var3, int var4) {
      if (-1 != this.aq * 2077442871) {
         return gt.ac(1435839096 * this.aq, (byte)-81).ax(var1, var2, var3, var4, (hp)null, 995731441);
      } else {
         long var5 = this.af * 971960971779926143L;
         int[] var7 = this.ae;
         if (null != var1 && (var1.aw * -1326457921 >= 0 || var1.an * -815731495 >= 0)) {
            var7 = new int[12];
            System.arraycopy(this.ae, 0, var7, 0, var7.length);
            if (-1326457921 * var1.aw >= 0) {
               var5 ^= (long)(-978747314 * var1.aw - this.ae[708097342 * ii.aq.az]) << 580597297;
               var7[-1224926442 * ii.aq.az] = this.ay(var1.aw * -2020564487, -1687899735);
            }

            if (var1.an * -478805227 >= 0) {
               var5 ^= (long)(537213430 * var1.an - this.ae[ii.am.az * 541927411]) << 92532735;
               var7[541927411 * ii.am.az] = this.ay(var1.an * -815731495, 691767168);
            }
         }

         jm var8 = (jm)ai.ac(var5);
         if (var8 == null) {
            boolean var9 = false;

            int var11;
            for(int var10 = 0; var10 < 12; ++var10) {
               var11 = var7[var10];
               if (this.aa(var11, -246196412)) {
                  hr var12 = this.ai(var11, -319355472);
                  if (null != var12 && !var12.ax(-1143972755)) {
                     var9 = true;
                  }
               }

               if (this.ao(var11, 1043235106) && !this.as(var11, (short)13910).ad(this.ax * 1911521620, (byte)16)) {
                  var9 = true;
               }
            }

            if (var9) {
               if (-1L != this.at * -6368619070362511553L) {
                  var8 = (jm)ai.ac(this.at * -6368619070362511553L);
               }

               if (var8 == null) {
                  return null;
               }
            }

            if (null == var8) {
               jv[] var19 = new jv[12];
               var11 = 0;

               int var13;
               for(int var20 = 0; var20 < 12; ++var20) {
                  var13 = var7[var20];
                  jv var15;
                  if (this.aa(var13, -246196412)) {
                     hr var14 = this.ai(var13, 356248993);
                     var15 = null;
                     if (null != var14) {
                        var15 = var14.aq((byte)75);
                     }

                     if (null != var15) {
                        var19[var11++] = var15;
                     }
                  }

                  if (this.ao(var13, 1043235106)) {
                     is var22 = this.as(var13, (short)1794);
                     var15 = var22.ah(this.ax * -336424548, 823823971);
                     if (null != var15) {
                        if (this.au != null) {
                           gv var16 = this.au[var20];
                           if (null != var16) {
                              int var17;
                              if (var16.ag != null && var22.ao != null && var22.as.length == var16.ag.length) {
                                 for(var17 = 0; var17 < var22.ao.length; ++var17) {
                                    var15.ao(var22.as[var17], var16.ag[var17]);
                                 }
                              }

                              if (var16.am != null && var22.ay != null && var22.aj.length == var16.am.length) {
                                 for(var17 = 0; var17 < var22.ay.length; ++var17) {
                                    var15.as(var22.aj[var17], var16.am[var17]);
                                 }
                              }
                           }
                        }

                        var19[var11++] = var15;
                     }
                  }
               }

               jv var21 = new jv(var19, var11);

               for(var13 = 0; var13 < 5; ++var13) {
                  if (this.ag[var13] < jx.ad[var13].length) {
                     var21.ao(al[var13], jx.ad[var13][this.ag[var13]]);
                  }

                  if (this.ag[var13] < al.ap[var13].length) {
                     var21.ao(jq.ah[var13], al.ap[var13][this.ag[var13]]);
                  }
               }

               var8 = var21.bn(64, 850, -30, -50, -30);
               ai.ag(var8, var5);
               this.at = -5100801540163381057L * var5;
            }
         }

         jm var18;
         if (null == var1 && null == var3) {
            var18 = var8.ax(true);
         } else if (null != var1 && null != var3) {
            var18 = var1.au(var8, var2, var3, var4, -2141585645);
         } else if (var1 != null) {
            var18 = var1.aq(var8, var2, 181956277);
         } else {
            var18 = var3.aq(var8, var4, 181956277);
         }

         return var18;
      }
   }

   int[] ag(int var1, byte var2) {
      try {
         int[] var3 = new int[12];

         for(int var4 = 0; var4 < 7; ++var4) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            for(int var5 = 0; var5 < -2082710201 * hr.ag; ++var5) {
               if (var2 >= 0) {
                  throw new IllegalStateException();
               }

               hr var6 = il.ac(var5, (byte)-89);
               if (null != var6) {
                  if (var2 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (!var6.ad) {
                     if (var2 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (var6.am(var4, var1, 791459334)) {
                        if (var2 >= 0) {
                           throw new IllegalStateException();
                        }

                        if (hz.ar == null) {
                           if (var2 >= 0) {
                              throw new IllegalStateException();
                           }

                           hz.ac((byte)-70);
                        }

                        int var8 = hz.ar[var4];
                        var3[var8] = 256 + var5;
                        break;
                     }
                  }
               }
            }
         }

         return var3;
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "nr.ag(" + ')');
      }
   }

   public void cy(int var1, int var2) {
      this.ag[var1] = var2;
      this.ad(119580921);
   }

   public void bs(int var1, boolean var2) {
      int var3 = this.ag[var1];
      boolean var4;
      if (!var2) {
         do {
            --var3;
            if (var3 < 0) {
               var3 = jx.ad[var1].length - 1;
            }

            if (var1 == 4 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      } else {
         do {
            ++var3;
            if (var3 >= jx.ad[var1].length) {
               var3 = 0;
            }

            if (4 == var1 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      }

      this.ag[var1] = var3;
      this.at((byte)-100);
   }

   public int bc() {
      long var1 = 971960971779926143L * this.af;
      if (this.aq * 1186943313 != -1) {
         var1 = -65536L | (long)(-1873534529 * this.aq);
      }

      Integer var3 = (Integer)ao.ae(var1, 1744951189);
      if (null == var3) {
         var3 = (as += 1579046813) * 108724484 - 1;
         ao.ag(var1, var3, (short)-22952);
         as = 1579046813 * (65788877 * as % '\uffff');
      }

      return var3;
   }

   public void af(vf var1, byte var2) {
      try {
         var1.bu(this.ax * 2024464609, (byte)-68);

         int var3;
         for(var3 = 0; var3 < 7; ++var3) {
            int[] var4 = this.ae;
            if (hz.ar == null) {
               if (var2 == 10) {
                  throw new IllegalStateException();
               }

               hz.ac((byte)-70);
            }

            int var5 = hz.ar[var3];
            int var6 = var4[var5];
            if (vc.ac * -95704915 >= 224) {
               if (var2 == 10) {
                  throw new IllegalStateException();
               }

               if (var6 == 0) {
                  if (var2 == 10) {
                     return;
                  }

                  var1.br(-1, 1625888552);
               } else {
                  var1.br(var6 - 256, 1625888552);
               }
            } else if (var6 == 0) {
               if (var2 == 10) {
                  throw new IllegalStateException();
               }

               var1.bu(-1, (byte)-75);
            } else {
               var1.bu(var6 - 256, (byte)-43);
            }
         }

         for(var3 = 0; var3 < 5; ++var3) {
            if (var2 == 10) {
               return;
            }

            var1.bu(this.ag[var3], (byte)4);
         }

      } catch (RuntimeException var7) {
         throw vk.ae(var7, "nr.af(" + ')');
      }
   }

   void at(byte var1) {
      try {
         long var2 = 971960971779926143L * this.af;
         long[] var4 = vf.ad;
         this.af = -5984274429364623231L;

         int var5;
         for(var5 = 0; var5 < 12; ++var5) {
            this.af = 5984274429364623231L * (this.af * 971960971779926143L >>> 8 ^ var4[(int)((this.af * 971960971779926143L ^ (long)(this.ae[var5] >> 24)) & 255L)]);
            this.af = (this.af * 971960971779926143L >>> 8 ^ var4[(int)((971960971779926143L * this.af ^ (long)(this.ae[var5] >> 16)) & 255L)]) * 5984274429364623231L;
            this.af = (971960971779926143L * this.af >>> 8 ^ var4[(int)((this.af * 971960971779926143L ^ (long)(this.ae[var5] >> 8)) & 255L)]) * 5984274429364623231L;
            this.af = 5984274429364623231L * (971960971779926143L * this.af >>> 8 ^ var4[(int)((this.af * 971960971779926143L ^ (long)this.ae[var5]) & 255L)]);
         }

         if (null != this.au) {
            for(var5 = 0; var5 < this.au.length; ++var5) {
               if (var1 >= 6) {
                  return;
               }

               if (this.au[var5] != null) {
                  int var6;
                  if (this.au[var5].ag != null) {
                     if (var1 >= 6) {
                        return;
                     }

                     for(var6 = 0; var6 < this.au[var5].ag.length; ++var6) {
                        if (var1 >= 6) {
                           return;
                        }

                        this.af = 5984274429364623231L * (this.af * 971960971779926143L >>> 8 ^ var4[(int)((this.af * 971960971779926143L ^ (long)(this.au[var5].ag[var6] >> 8)) & 255L)]);
                        this.af = (971960971779926143L * this.af >>> 8 ^ var4[(int)((this.af * 971960971779926143L ^ (long)this.au[var5].ag[var6]) & 255L)]) * 5984274429364623231L;
                     }
                  }

                  if (null != this.au[var5].am) {
                     if (var1 >= 6) {
                        throw new IllegalStateException();
                     }

                     for(var6 = 0; var6 < this.au[var5].am.length; ++var6) {
                        if (var1 >= 6) {
                           throw new IllegalStateException();
                        }

                        this.af = (971960971779926143L * this.af >>> 8 ^ var4[(int)((this.af * 971960971779926143L ^ (long)(this.au[var5].am[var6] >> 8)) & 255L)]) * 5984274429364623231L;
                        this.af = 5984274429364623231L * (this.af * 971960971779926143L >>> 8 ^ var4[(int)((this.af * 971960971779926143L ^ (long)this.au[var5].am[var6]) & 255L)]);
                     }
                  }
               }
            }
         }

         for(var5 = 0; var5 < 5; ++var5) {
            if (var1 >= 6) {
               throw new IllegalStateException();
            }

            this.af = 5984274429364623231L * (this.af * 971960971779926143L >>> 8 ^ var4[(int)((971960971779926143L * this.af ^ (long)this.ag[var5]) & 255L)]);
         }

         label129: {
            this.af = (this.af * 971960971779926143L >>> 8 ^ var4[(int)((this.af * 971960971779926143L ^ (long)(2024464609 * this.ax)) & 255L)]) * 5984274429364623231L;
            if (var2 != 0L) {
               if (var2 != 971960971779926143L * this.af) {
                  break label129;
               }

               if (var1 >= 6) {
                  throw new IllegalStateException();
               }
            }

            if (!this.ar) {
               return;
            }

            if (var1 >= 6) {
               throw new IllegalStateException();
            }
         }

         ai.ae(var2);
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "nr.at(" + ')');
      }
   }

   public jm au(if var1, int var2, if var3, int var4, int var5) {
      try {
         if (-1 != this.aq * 1618042977) {
            if (var5 <= -510225392) {
               throw new IllegalStateException();
            } else {
               return gt.ac(1618042977 * this.aq, (byte)-128).ax(var1, var2, var3, var4, (hp)null, 220269434);
            }
         } else {
            long var6 = this.af * 971960971779926143L;
            int[] var8 = this.ae;
            if (null != var1) {
               label315: {
                  if (var5 <= -510225392) {
                     throw new IllegalStateException();
                  }

                  if (var1.aw * -1326457921 < 0) {
                     if (var5 <= -510225392) {
                        throw new IllegalStateException();
                     }

                     if (var1.an * -815731495 < 0) {
                        break label315;
                     }

                     if (var5 <= -510225392) {
                        throw new IllegalStateException();
                     }
                  }

                  var8 = new int[12];
                  System.arraycopy(this.ae, 0, var8, 0, var8.length);
                  if (-1326457921 * var1.aw >= 0) {
                     if (var5 <= -510225392) {
                        throw new IllegalStateException();
                     }

                     var6 ^= (long)(-1326457921 * var1.aw - this.ae[541927411 * ii.aq.az]) << 40;
                     var8[541927411 * ii.aq.az] = this.ay(var1.aw * -1326457921, -933331327);
                  }

                  if (var1.an * -815731495 >= 0) {
                     if (var5 <= -510225392) {
                        throw new IllegalStateException();
                     }

                     var6 ^= (long)(-815731495 * var1.an - this.ae[ii.am.az * 541927411]) << 48;
                     var8[541927411 * ii.am.az] = this.ay(var1.an * -815731495, 408966340);
                  }
               }
            }

            jm var9 = (jm)ai.ac(var6);
            if (var9 == null) {
               boolean var10 = false;

               int var12;
               for(int var11 = 0; var11 < 12; ++var11) {
                  if (var5 <= -510225392) {
                     throw new IllegalStateException();
                  }

                  var12 = var8[var11];
                  if (this.aa(var12, -246196412)) {
                     hr var13 = this.ai(var12, 374022250);
                     if (null != var13) {
                        if (var5 <= -510225392) {
                           throw new IllegalStateException();
                        }

                        if (!var13.ax(-1152299255)) {
                           var10 = true;
                        }
                     }
                  }

                  if (this.ao(var12, 1043235106) && !this.as(var12, (short)-25210).ad(this.ax * 2024464609, (byte)16)) {
                     if (var5 <= -510225392) {
                        throw new IllegalStateException();
                     }

                     var10 = true;
                  }
               }

               if (var10) {
                  if (-1L != this.at * -6368619070362511553L) {
                     if (var5 <= -510225392) {
                        throw new IllegalStateException();
                     }

                     var9 = (jm)ai.ac(this.at * -6368619070362511553L);
                  }

                  if (var9 == null) {
                     if (var5 <= -510225392) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }
               }

               if (null == var9) {
                  if (var5 <= -510225392) {
                     throw new IllegalStateException();
                  }

                  jv[] var21 = new jv[12];
                  var12 = 0;
                  int var22 = 0;

                  while(true) {
                     int var14;
                     if (var22 >= 12) {
                        jv var23 = new jv(var21, var12);

                        for(var14 = 0; var14 < 5; ++var14) {
                           if (var5 <= -510225392) {
                              throw new IllegalStateException();
                           }

                           if (this.ag[var14] < jx.ad[var14].length) {
                              if (var5 <= -510225392) {
                                 throw new IllegalStateException();
                              }

                              var23.ao(al[var14], jx.ad[var14][this.ag[var14]]);
                           }

                           if (this.ag[var14] < al.ap[var14].length) {
                              if (var5 <= -510225392) {
                                 throw new IllegalStateException();
                              }

                              var23.ao(jq.ah[var14], al.ap[var14][this.ag[var14]]);
                           }
                        }

                        var9 = var23.bn(64, 850, -30, -50, -30);
                        ai.ag(var9, var6);
                        this.at = -5100801540163381057L * var6;
                        break;
                     }

                     if (var5 <= -510225392) {
                        throw new IllegalStateException();
                     }

                     var14 = var8[var22];
                     jv var16;
                     if (this.aa(var14, -246196412)) {
                        hr var15 = this.ai(var14, 193639090);
                        var16 = null;
                        if (null != var15) {
                           if (var5 <= -510225392) {
                              throw new IllegalStateException();
                           }

                           var16 = var15.aq((byte)-18);
                        }

                        if (null != var16) {
                           if (var5 <= -510225392) {
                              throw new IllegalStateException();
                           }

                           var21[var12++] = var16;
                        }
                     }

                     if (this.ao(var14, 1043235106)) {
                        if (var5 <= -510225392) {
                           throw new IllegalStateException();
                        }

                        is var24 = this.as(var14, (short)-14762);
                        var16 = var24.ah(this.ax * 2024464609, 85772641);
                        if (null != var16) {
                           if (this.au != null) {
                              gv var17 = this.au[var22];
                              if (null != var17) {
                                 if (var5 <= -510225392) {
                                    throw new IllegalStateException();
                                 }

                                 int var18;
                                 if (var17.ag != null) {
                                    if (var5 <= -510225392) {
                                       throw new IllegalStateException();
                                    }

                                    if (var24.ao != null) {
                                       if (var5 <= -510225392) {
                                          throw new IllegalStateException();
                                       }

                                       if (var24.as.length == var17.ag.length) {
                                          if (var5 <= -510225392) {
                                             throw new IllegalStateException();
                                          }

                                          for(var18 = 0; var18 < var24.ao.length; ++var18) {
                                             var16.ao(var24.as[var18], var17.ag[var18]);
                                          }
                                       }
                                    }
                                 }

                                 if (var17.am != null && var24.ay != null) {
                                    if (var5 <= -510225392) {
                                       throw new IllegalStateException();
                                    }

                                    if (var24.aj.length == var17.am.length) {
                                       if (var5 <= -510225392) {
                                          throw new IllegalStateException();
                                       }

                                       for(var18 = 0; var18 < var24.ay.length; ++var18) {
                                          var16.as(var24.aj[var18], var17.am[var18]);
                                       }
                                    }
                                 }
                              }
                           }

                           var21[var12++] = var16;
                        }
                     }

                     ++var22;
                  }
               }
            }

            jm var20;
            if (null == var1) {
               if (var5 <= -510225392) {
                  throw new IllegalStateException();
               }

               if (null == var3) {
                  if (var5 <= -510225392) {
                     throw new IllegalStateException();
                  }

                  var20 = var9.ax(true);
                  return var20;
               }
            }

            if (null != var1) {
               if (var5 <= -510225392) {
                  throw new IllegalStateException();
               }

               if (null != var3) {
                  if (var5 <= -510225392) {
                     throw new IllegalStateException();
                  }

                  var20 = var1.au(var9, var2, var3, var4, 1657765057);
                  return var20;
               }
            }

            if (var1 != null) {
               var20 = var1.aq(var9, var2, 181956277);
            } else {
               var20 = var3.aq(var9, var4, 181956277);
            }

            return var20;
         }
      } catch (RuntimeException var19) {
         throw vk.ae(var19, "nr.au(" + ')');
      }
   }

   jv ar(int var1) {
      try {
         if (-1 != 1618042977 * this.aq) {
            if (var1 == -819890558) {
               throw new IllegalStateException();
            } else {
               return gt.ac(this.aq * 1618042977, (byte)-38).aq((hp)null, 485730990);
            }
         } else {
            boolean var2 = false;

            int var4;
            for(int var3 = 0; var3 < 12; ++var3) {
               var4 = this.ae[var3];
               if (this.aa(var4, -246196412)) {
                  if (var1 == -819890558) {
                     throw new IllegalStateException();
                  }

                  hr var5 = this.ai(var4, 421387587);
                  if (var5 != null) {
                     if (var1 == -819890558) {
                        throw new IllegalStateException();
                     }

                     if (!var5.af(-861896719)) {
                        if (var1 == -819890558) {
                           throw new IllegalStateException();
                        }

                        var2 = true;
                     }
                  }
               }

               if (this.ao(var4, 1043235106)) {
                  if (var1 == -819890558) {
                     throw new IllegalStateException();
                  }

                  if (!this.as(var4, (short)-19228).ap(2024464609 * this.ax, -1792716689)) {
                     if (var1 == -819890558) {
                        throw new IllegalStateException();
                     }

                     var2 = true;
                  }
               }
            }

            if (var2) {
               if (var1 == -819890558) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               jv[] var10 = new jv[12];
               var4 = 0;

               int var6;
               for(int var11 = 0; var11 < 12; ++var11) {
                  if (var1 == -819890558) {
                     throw new IllegalStateException();
                  }

                  var6 = this.ae[var11];
                  if (this.aa(var6, -246196412)) {
                     if (var1 == -819890558) {
                        throw new IllegalStateException();
                     }

                     hr var7 = this.ai(var6, 1004153490);
                     jv var8 = null;
                     if (null != var7) {
                        if (var1 == -819890558) {
                           throw new IllegalStateException();
                        }

                        var8 = var7.at(-862604109);
                     }

                     if (null != var8) {
                        if (var1 == -819890558) {
                           throw new IllegalStateException();
                        }

                        var10[var4++] = var8;
                     }
                  }

                  if (this.ao(var6, 1043235106)) {
                     if (var1 == -819890558) {
                        throw new IllegalStateException();
                     }

                     jv var13 = this.as(var6, (short)-2282).ab(this.ax * 2024464609, (byte)-17);
                     if (var13 != null) {
                        if (var1 == -819890558) {
                           throw new IllegalStateException();
                        }

                        var10[var4++] = var13;
                     }
                  }
               }

               jv var12 = new jv(var10, var4);

               for(var6 = 0; var6 < 5; ++var6) {
                  if (var1 == -819890558) {
                     throw new IllegalStateException();
                  }

                  if (this.ag[var6] < jx.ad[var6].length) {
                     var12.ao(al[var6], jx.ad[var6][this.ag[var6]]);
                  }

                  if (this.ag[var6] < al.ap[var6].length) {
                     if (var1 == -819890558) {
                        throw new IllegalStateException();
                     }

                     var12.ao(jq.ah[var6], al.ap[var6][this.ag[var6]]);
                  }
               }

               return var12;
            }
         }
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "nr.ar(" + ')');
      }
   }

   public int al(byte var1) {
      try {
         long var2 = 971960971779926143L * this.af;
         if (this.aq * 1618042977 != -1) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            }

            var2 = -65536L | (long)(1618042977 * this.aq);
         }

         Integer var4 = (Integer)ao.ae(var2, 1744951189);
         if (null == var4) {
            if (var1 >= 1) {
               throw new IllegalStateException();
            }

            var4 = (as += 1579046813) * -1717967179 - 1;
            ao.ag(var2, var4, (short)-5047);
            as = 1579046813 * (-1717967179 * as % '\uffff');
         }

         return var4;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "nr.al(" + ')');
      }
   }

   void ad(int var1) {
      try {
         this.ae(this.ac, this.ae, this.ag, 2024464609 * this.ax, this.aq * 1618042977, (byte)-128);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "nr.ad(" + ')');
      }
   }

   public void ah(int var1, int var2, int var3) {
      try {
         boolean var10000;
         if (var2 != this.ax * 2024464609) {
            if (var3 != -2030636546) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var4 = var10000;
         this.ax = var2 * -1019059423;
         if (var4) {
            int var5;
            int var6;
            if (var1 == 2024464609 * this.ax) {
               if (var3 != -2030636546) {
                  throw new IllegalStateException();
               }

               for(var5 = 0; var5 < 7; ++var5) {
                  if (var3 != -2030636546) {
                     return;
                  }

                  if (null == hz.ar) {
                     if (var3 != -2030636546) {
                        return;
                     }

                     hz.ac((byte)-78);
                  }

                  var6 = hz.ar[var5];
                  if (this.ae[var6] > 0) {
                     if (var3 != -2030636546) {
                        return;
                     }

                     if (this.ae[var6] < -2023519509 * this.aa) {
                        if (var3 != -2030636546) {
                           throw new IllegalStateException();
                        }

                        this.ae[var6] = this.ac[var6];
                     }
                  }
               }
            } else {
               label153: {
                  if (this.ae[0] >= this.aa * -2023519509) {
                     if (var3 != -2030636546) {
                        throw new IllegalStateException();
                     }

                     if (!this.ap((byte)-43)) {
                        break label153;
                     }

                     if (var3 != -2030636546) {
                        throw new IllegalStateException();
                     }
                  }

                  this.ae[541927411 * ii.ad.az] = 1;
               }

               for(var5 = 0; var5 < 7; ++var5) {
                  if (var3 != -2030636546) {
                     throw new IllegalStateException();
                  }

                  if (null == hz.ar) {
                     if (var3 != -2030636546) {
                        throw new IllegalStateException();
                     }

                     hz.ac((byte)-56);
                  }

                  var6 = hz.ar[var5];
                  if (this.ae[var6] > 0 && this.ae[var6] < -2023519509 * this.aa) {
                     if (var3 != -2030636546) {
                        throw new IllegalStateException();
                     }

                     int[] var8 = this.ae;

                     for(int var9 = 0; var9 < -2082710201 * hr.ag; ++var9) {
                        if (var3 != -2030636546) {
                           throw new IllegalStateException();
                        }

                        hr var10 = il.ac(var9, (byte)-1);
                        if (var10 != null) {
                           if (var3 != -2030636546) {
                              throw new IllegalStateException();
                           }

                           if (!var10.ad) {
                              if (var3 != -2030636546) {
                                 throw new IllegalStateException();
                              }

                              if (var10.am(var5, var2, -560651389)) {
                                 if (var3 != -2030636546) {
                                    throw new IllegalStateException();
                                 }

                                 if (hz.ar == null) {
                                    if (var3 != -2030636546) {
                                       throw new IllegalStateException();
                                    }

                                    hz.ac((byte)-90);
                                 }

                                 int var12 = hz.ar[var5];
                                 var8[var12] = 256 + var9;
                                 break;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         this.ad(119580921);
      } catch (RuntimeException var13) {
         throw vk.ae(var13, "nr.ah(" + ')');
      }
   }

   boolean ap(byte var1) {
      try {
         if (!this.ao(this.ae[0], 1043235106)) {
            return false;
         } else {
            is var2 = this.as(this.ae[0], (short)25364);
            boolean var10000;
            if (541927411 * ii.ad.az != 1668381135 * var2.bw && var2.ba * 1198528189 != 541927411 * ii.ad.az) {
               if (var1 == 10) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            return var10000;
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "nr.ap(" + ')');
      }
   }

   public void ab(int var1, int var2, int var3) {
      try {
         this.ag[var1] = var2;
         this.ad(119580921);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "nr.ab(" + ')');
      }
   }

   public void az(int var1, int var2) {
      try {
         is var3 = dh.ac(var1, 2131574843);
         this.ae[311933229 * var3.bs] = var1 + -2023519509 * this.aa;
         if (1668381135 * var3.bw != -1) {
            this.ae[var3.bw * 1668381135] = 0;
         }

         if (1198528189 * var3.ba != -1) {
            if (var2 == 1460748198) {
               return;
            }

            this.ae[1198528189 * var3.ba] = 0;
         }

         this.ad(119580921);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "nr.az(" + ')');
      }
   }

   boolean aa(int var1, int var2) {
      try {
         boolean var10000;
         if (var1 >= 256) {
            if (var2 != -246196412) {
               throw new IllegalStateException();
            }

            if (var1 < this.aa * -2023519509) {
               if (var2 != -246196412) {
                  throw new IllegalStateException();
               }

               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "nr.aa(" + ')');
      }
   }

   hr ai(int var1, int var2) {
      try {
         return il.ac(var1 - 256, (byte)-120);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "nr.ai(" + ')');
      }
   }

   boolean ao(int var1, int var2) {
      try {
         boolean var10000;
         if (var1 >= -2023519509 * this.aa) {
            if (var2 != 1043235106) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "nr.ao(" + ')');
      }
   }

   is as(int var1, short var2) {
      try {
         return dh.ac(var1 - -2023519509 * this.aa, 2090272132);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "nr.as(" + ')');
      }
   }

   public int be() {
      long var1 = 971960971779926143L * this.af;
      if (this.aq * -2023596342 != -1) {
         var1 = -65536L | (long)(-599838854 * this.aq);
      }

      Integer var3 = (Integer)ao.ae(var1, 1744951189);
      if (null == var3) {
         var3 = (as += 1833006659) * -1744964339 - 1;
         ao.ag(var1, var3, (short)-31872);
         as = 1579046813 * (-1717967179 * as % -1535630755);
      }

      return var3;
   }

   static {
      ao = new ry(16, rd.ac);
      as = 0;
   }

   public void aj(int[] var1, int[] var2, gv[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
      this.au = var3;
      this.ar = var4;
      this.am = 1908042749 * var8;
      this.ae(var1, var2, var5, var6, var7, (byte)-117);
   }

   public void bd(int var1, boolean var2) {
      int[] var3 = this.ae;
      if (null == hz.ar) {
         hz.ac((byte)-120);
      }

      int var4 = hz.ar[var1];
      int var5 = var3[var4];
      if (0 != var5) {
         var5 -= 256;

         hr var6;
         do {
            if (!var2) {
               --var5;
               if (var5 < 0) {
                  var5 = hr.ag * -2082710201 - 1;
               }
            } else {
               ++var5;
               if (var5 >= hr.ag * -2082710201) {
                  var5 = 0;
               }
            }

            var6 = il.ac(var5, (byte)-126);
         } while(null == var6 || var6.ad || !var6.am(var1, 2024464609 * this.ax, -361031232));

         int[] var8 = this.ae;
         if (hz.ar == null) {
            hz.ac((byte)-56);
         }

         int var7 = hz.ar[var1];
         var8[var7] = 256 + var5;
         this.at((byte)-64);
      }
   }

   public void aw(int[] var1, int[] var2, int[] var3, int var4, int var5) {
      if (var1 == null) {
         var1 = this.ag(var4, (byte)-124);
      }

      if (var2 == null) {
         var2 = this.ag(var4, (byte)-43);
      }

      this.ac = var1;
      this.ae = var2;
      this.ag = var3;
      this.ax = var4 * -1019059423;
      this.aq = var5 * 588858273;
      this.at((byte)-104);
   }

   void bu() {
      long var1 = 971960971779926143L * this.af;
      long[] var3 = vf.ad;
      this.af = -5984274429364623231L;

      int var4;
      for(var4 = 0; var4 < 12; ++var4) {
         this.af = 5984274429364623231L * (this.af * 971960971779926143L >>> 8 ^ var3[(int)((this.af * 971960971779926143L ^ (long)(this.ae[var4] >> 24)) & 255L)]);
         this.af = (this.af * 971960971779926143L >>> 8 ^ var3[(int)((971960971779926143L * this.af ^ (long)(this.ae[var4] >> 16)) & 255L)]) * 5984274429364623231L;
         this.af = (971960971779926143L * this.af >>> 8 ^ var3[(int)((this.af * 971960971779926143L ^ (long)(this.ae[var4] >> 8)) & 255L)]) * 5984274429364623231L;
         this.af = 5984274429364623231L * (971960971779926143L * this.af >>> 8 ^ var3[(int)((this.af * 971960971779926143L ^ (long)this.ae[var4]) & 255L)]);
      }

      if (null != this.au) {
         for(var4 = 0; var4 < this.au.length; ++var4) {
            if (this.au[var4] != null) {
               int var5;
               if (this.au[var4].ag != null) {
                  for(var5 = 0; var5 < this.au[var4].ag.length; ++var5) {
                     this.af = 5984274429364623231L * (this.af * 971960971779926143L >>> 8 ^ var3[(int)((this.af * 971960971779926143L ^ (long)(this.au[var4].ag[var5] >> 8)) & 255L)]);
                     this.af = (971960971779926143L * this.af >>> 8 ^ var3[(int)((this.af * 971960971779926143L ^ (long)this.au[var4].ag[var5]) & 255L)]) * 5984274429364623231L;
                  }
               }

               if (null != this.au[var4].am) {
                  for(var5 = 0; var5 < this.au[var4].am.length; ++var5) {
                     this.af = (971960971779926143L * this.af >>> 8 ^ var3[(int)((this.af * 971960971779926143L ^ (long)(this.au[var4].am[var5] >> 8)) & 255L)]) * 5984274429364623231L;
                     this.af = 5984274429364623231L * (this.af * 971960971779926143L >>> 8 ^ var3[(int)((this.af * 971960971779926143L ^ (long)this.au[var4].am[var5]) & 255L)]);
                  }
               }
            }
         }
      }

      for(var4 = 0; var4 < 5; ++var4) {
         this.af = 5984274429364623231L * (this.af * 971960971779926143L >>> 8 ^ var3[(int)((971960971779926143L * this.af ^ (long)this.ag[var4]) & 255L)]);
      }

      this.af = (this.af * 971960971779926143L >>> 8 ^ var3[(int)((this.af * 971960971779926143L ^ (long)(-1538428958 * this.ax)) & 255L)]) * 5984274429364623231L;
      if (var1 != 0L && var1 != 971960971779926143L * this.af || this.ar) {
         ai.ae(var1);
      }

   }

   int[] ak(int var1) {
      int[] var2 = new int[12];

      for(int var3 = 0; var3 < 7; ++var3) {
         for(int var4 = 0; var4 < -2082710201 * hr.ag; ++var4) {
            hr var5 = il.ac(var4, (byte)-13);
            if (null != var5 && !var5.ad && var5.am(var3, var1, 1021996180)) {
               if (hz.ar == null) {
                  hz.ac((byte)-75);
               }

               int var7 = hz.ar[var3];
               var2[var7] = 256 + var4;
               break;
            }
         }
      }

      return var2;
   }

   public void bn(int var1, boolean var2) {
      int[] var3 = this.ae;
      if (null == hz.ar) {
         hz.ac((byte)-48);
      }

      int var4 = hz.ar[var1];
      int var5 = var3[var4];
      if (0 != var5) {
         var5 -= 256;

         hr var6;
         do {
            if (!var2) {
               --var5;
               if (var5 < 0) {
                  var5 = hr.ag * -2082710201 - 1;
               }
            } else {
               ++var5;
               if (var5 >= hr.ag * -2082710201) {
                  var5 = 0;
               }
            }

            var6 = il.ac(var5, (byte)-62);
         } while(null == var6 || var6.ad || !var6.am(var1, 2024464609 * this.ax, 92824351));

         int[] var8 = this.ae;
         if (hz.ar == null) {
            hz.ac((byte)-97);
         }

         int var7 = hz.ar[var1];
         var8[var7] = 256 + var5;
         this.at((byte)-40);
      }
   }

   public void am(int var1, boolean var2, int var3) {
      try {
         int[] var4 = this.ae;
         if (null == hz.ar) {
            if (var3 == 185688482) {
               throw new IllegalStateException();
            }

            hz.ac((byte)-103);
         }

         int var5 = hz.ar[var1];
         int var6 = var4[var5];
         if (0 == var6) {
            if (var3 == 185688482) {
               throw new IllegalStateException();
            }
         } else {
            var6 -= 256;

            while(true) {
               if (!var2) {
                  --var6;
                  if (var6 < 0) {
                     if (var3 == 185688482) {
                        throw new IllegalStateException();
                     }

                     var6 = hr.ag * -2082710201 - 1;
                  }
               } else {
                  ++var6;
                  if (var6 >= hr.ag * -2082710201) {
                     if (var3 == 185688482) {
                        return;
                     }

                     var6 = 0;
                  }
               }

               hr var7 = il.ac(var6, (byte)-115);
               if (null != var7 && !var7.ad) {
                  if (var3 == 185688482) {
                     throw new IllegalStateException();
                  }

                  if (var7.am(var1, 2024464609 * this.ax, -1775033109)) {
                     if (var3 == 185688482) {
                        return;
                     }

                     int[] var10 = this.ae;
                     if (hz.ar == null) {
                        if (var3 == 185688482) {
                           return;
                        }

                        hz.ac((byte)-118);
                     }

                     int var8 = hz.ar[var1];
                     var10[var8] = 256 + var6;
                     this.at((byte)-87);
                     return;
                  }
               }
            }
         }
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "nr.am(" + ')');
      }
   }

   int ay(int var1, int var2) {
      try {
         return -2023519509 * this.aa + (var1 - 512);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "nr.ay(" + ')');
      }
   }

   public void bx(int var1, boolean var2) {
      int var3 = this.ag[var1];
      boolean var4;
      if (!var2) {
         do {
            --var3;
            if (var3 < 0) {
               var3 = jx.ad[var1].length - 1;
            }

            if (var1 == 4 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      } else {
         do {
            ++var3;
            if (var3 >= jx.ad[var1].length) {
               var3 = 0;
            }

            if (4 == var1 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      }

      this.ag[var1] = var3;
      this.at((byte)-34);
   }

   public void bf(int var1, boolean var2) {
      int var3 = this.ag[var1];
      boolean var4;
      if (!var2) {
         do {
            --var3;
            if (var3 < 0) {
               var3 = jx.ad[var1].length - 1;
            }

            if (var1 == 4 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      } else {
         do {
            ++var3;
            if (var3 >= jx.ad[var1].length) {
               var3 = 0;
            }

            if (4 == var1 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      }

      this.ag[var1] = var3;
      this.at((byte)-23);
   }

   public void bm(int var1, boolean var2) {
      int var3 = this.ag[var1];
      boolean var4;
      if (!var2) {
         do {
            --var3;
            if (var3 < 0) {
               var3 = jx.ad[var1].length - 1;
            }

            if (var1 == 4 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      } else {
         do {
            ++var3;
            if (var3 >= jx.ad[var1].length) {
               var3 = 0;
            }

            if (4 == var1 && var3 >= 8) {
               var4 = false;
            } else {
               var4 = true;
            }
         } while(!var4);
      }

      this.ag[var1] = var3;
      this.at((byte)-44);
   }

   nr(nr var1) {
      try {
         super();
         this.am = -1908042749;
         this.ax = 0;
         this.ar = false;
         this.aa = (vc.ac * -95704915 < 224 ? 512 : 2048) * -1861366333;
         int[] var2 = Arrays.copyOf(var1.ae, var1.ae.length);
         int[] var3 = Arrays.copyOf(var1.ac, var1.ac.length);
         gv[] var4 = (gv[])(null != var1.au ? (gv[])Arrays.copyOf(var1.au, var1.au.length) : null);
         int[] var5 = Arrays.copyOf(var1.ag, var1.ag.length);
         this.ac(var3, var2, var4, false, var5, 2024464609 * var1.ax, 1618042977 * var1.aq, var1.am * 1161513301, -2041257898);
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "nr.<init>(" + ')');
      }
   }

   public void bw(int var1) {
      if (var1 != 2024464609 * this.ax) {
         this.ae((int[])null, (int[])null, this.ag, var1, -1, (byte)-107);
      }
   }

   public void ac(int[] var1, int[] var2, gv[] var3, boolean var4, int[] var5, int var6, int var7, int var8, int var9) {
      try {
         this.au = var3;
         this.ar = var4;
         this.am = 1908042749 * var8;
         this.ae(var1, var2, var5, var6, var7, (byte)-125);
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "nr.ac(" + ')');
      }
   }

   public void bj(int var1) {
      if (var1 != -1559596387 * this.ax) {
         this.ae((int[])null, (int[])null, this.ag, var1, -1, (byte)-113);
      }
   }

   public void ae(int[] var1, int[] var2, int[] var3, int var4, int var5, byte var6) {
      try {
         if (var1 == null) {
            if (var6 >= -106) {
               throw new IllegalStateException();
            }

            var1 = this.ag(var4, (byte)-68);
         }

         if (var2 == null) {
            if (var6 >= -106) {
               return;
            }

            var2 = this.ag(var4, (byte)-80);
         }

         this.ac = var1;
         this.ae = var2;
         this.ag = var3;
         this.ax = var4 * -1019059423;
         this.aq = var5 * 588858273;
         this.at((byte)-124);
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "nr.ae(" + ')');
      }
   }

   public void by(vf var1) {
      var1.bu(this.ax * 2024464609, (byte)15);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         int[] var3 = this.ae;
         if (hz.ar == null) {
            hz.ac((byte)-103);
         }

         int var4 = hz.ar[var2];
         int var5 = var3[var4];
         if (vc.ac * -95704915 >= 224) {
            if (var5 == 0) {
               var1.br(-1, 1625888552);
            } else {
               var1.br(var5 - 256, 1625888552);
            }
         } else if (var5 == 0) {
            var1.bu(-1, (byte)27);
         } else {
            var1.bu(var5 - 256, (byte)-58);
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var1.bu(this.ag[var2], (byte)-12);
      }

   }

   public void aq(int var1, int var2) {
      try {
         if (var1 == 2024464609 * this.ax) {
            if (var2 >= 844691753) {
               throw new IllegalStateException();
            }
         } else {
            this.ae((int[])null, (int[])null, this.ag, var1, -1, (byte)-107);
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "nr.aq(" + ')');
      }
   }

   public void bi(vf var1) {
      var1.bu(this.ax * 2024464609, (byte)-51);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         int[] var3 = this.ae;
         if (hz.ar == null) {
            hz.ac((byte)-58);
         }

         int var4 = hz.ar[var2];
         int var5 = var3[var4];
         if (vc.ac * -95704915 >= 224) {
            if (var5 == 0) {
               var1.br(-1, 1625888552);
            } else {
               var1.br(var5 - 256, 1625888552);
            }
         } else if (var5 == 0) {
            var1.bu(-1, (byte)62);
         } else {
            var1.bu(var5 - 256, (byte)33);
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var1.bu(this.ag[var2], (byte)7);
      }

   }

   public void bg(vf var1) {
      var1.bu(this.ax * 2024464609, (byte)8);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         int[] var3 = this.ae;
         if (hz.ar == null) {
            hz.ac((byte)-72);
         }

         int var4 = hz.ar[var2];
         int var5 = var3[var4];
         if (vc.ac * -95704915 >= 224) {
            if (var5 == 0) {
               var1.br(-1, 1625888552);
            } else {
               var1.br(var5 - 256, 1625888552);
            }
         } else if (var5 == 0) {
            var1.bu(-1, (byte)-54);
         } else {
            var1.bu(var5 - 256, (byte)10);
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var1.bu(this.ag[var2], (byte)40);
      }

   }

   public void bl(vf var1) {
      var1.bu(this.ax * 2024464609, (byte)1);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         int[] var3 = this.ae;
         if (hz.ar == null) {
            hz.ac((byte)-34);
         }

         int var4 = hz.ar[var2];
         int var5 = var3[var4];
         if (vc.ac * -95704915 >= 224) {
            if (var5 == 0) {
               var1.br(-1, 1625888552);
            } else {
               var1.br(var5 - 256, 1625888552);
            }
         } else if (var5 == 0) {
            var1.bu(-1, (byte)-36);
         } else {
            var1.bu(var5 - 256, (byte)-17);
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var1.bu(this.ag[var2], (byte)-28);
      }

   }

   void bz() {
      long var1 = 971960971779926143L * this.af;
      long[] var3 = vf.ad;
      this.af = -5984274429364623231L;

      int var4;
      for(var4 = 0; var4 < 12; ++var4) {
         this.af = 5984274429364623231L * (this.af * 971960971779926143L >>> 8 ^ var3[(int)((this.af * 971960971779926143L ^ (long)(this.ae[var4] >> 24)) & 255L)]);
         this.af = (this.af * 971960971779926143L >>> 8 ^ var3[(int)((971960971779926143L * this.af ^ (long)(this.ae[var4] >> 16)) & 255L)]) * 5984274429364623231L;
         this.af = (971960971779926143L * this.af >>> 8 ^ var3[(int)((this.af * 971960971779926143L ^ (long)(this.ae[var4] >> 8)) & 255L)]) * 5984274429364623231L;
         this.af = 5984274429364623231L * (971960971779926143L * this.af >>> 8 ^ var3[(int)((this.af * 971960971779926143L ^ (long)this.ae[var4]) & 255L)]);
      }

      if (null != this.au) {
         for(var4 = 0; var4 < this.au.length; ++var4) {
            if (this.au[var4] != null) {
               int var5;
               if (this.au[var4].ag != null) {
                  for(var5 = 0; var5 < this.au[var4].ag.length; ++var5) {
                     this.af = 5984274429364623231L * (this.af * 971960971779926143L >>> 8 ^ var3[(int)((this.af * 971960971779926143L ^ (long)(this.au[var4].ag[var5] >> 8)) & 255L)]);
                     this.af = (971960971779926143L * this.af >>> 8 ^ var3[(int)((this.af * 971960971779926143L ^ (long)this.au[var4].ag[var5]) & 255L)]) * 5984274429364623231L;
                  }
               }

               if (null != this.au[var4].am) {
                  for(var5 = 0; var5 < this.au[var4].am.length; ++var5) {
                     this.af = (971960971779926143L * this.af >>> 8 ^ var3[(int)((this.af * 971960971779926143L ^ (long)(this.au[var4].am[var5] >> 8)) & 255L)]) * 5984274429364623231L;
                     this.af = 5984274429364623231L * (this.af * 971960971779926143L >>> 8 ^ var3[(int)((this.af * 971960971779926143L ^ (long)this.au[var4].am[var5]) & 255L)]);
                  }
               }
            }
         }
      }

      for(var4 = 0; var4 < 5; ++var4) {
         this.af = 5984274429364623231L * (this.af * 971960971779926143L >>> 8 ^ var3[(int)((971960971779926143L * this.af ^ (long)this.ag[var4]) & 255L)]);
      }

      this.af = (this.af * 971960971779926143L >>> 8 ^ var3[(int)((this.af * 971960971779926143L ^ (long)(-357163692 * this.ax)) & 255L)]) * 5984274429364623231L;
      if (var1 != 0L && var1 != 971960971779926143L * this.af || this.ar) {
         ai.ae(var1);
      }

   }

   public void cv(int var1) {
      is var2 = dh.ac(var1, 2058010280);
      this.ae[311933229 * var2.bs] = var1 + -2023519509 * this.aa;
      if (1668381135 * var2.bw != -1) {
         this.ae[var2.bw * 1668381135] = 0;
      }

      if (1198528189 * var2.ba != -1) {
         this.ae[1198528189 * var2.ba] = 0;
      }

      this.ad(119580921);
   }

   void br() {
      long var1 = 971960971779926143L * this.af;
      long[] var3 = vf.ad;
      this.af = -5984274429364623231L;

      int var4;
      for(var4 = 0; var4 < 12; ++var4) {
         this.af = 5984274429364623231L * (this.af * 971960971779926143L >>> 8 ^ var3[(int)((this.af * 971960971779926143L ^ (long)(this.ae[var4] >> 24)) & 255L)]);
         this.af = (this.af * 971960971779926143L >>> 8 ^ var3[(int)((971960971779926143L * this.af ^ (long)(this.ae[var4] >> 16)) & 255L)]) * 5984274429364623231L;
         this.af = (971960971779926143L * this.af >>> 8 ^ var3[(int)((this.af * 971960971779926143L ^ (long)(this.ae[var4] >> 8)) & 255L)]) * 5984274429364623231L;
         this.af = 5984274429364623231L * (971960971779926143L * this.af >>> 8 ^ var3[(int)((this.af * 971960971779926143L ^ (long)this.ae[var4]) & 255L)]);
      }

      if (null != this.au) {
         for(var4 = 0; var4 < this.au.length; ++var4) {
            if (this.au[var4] != null) {
               int var5;
               if (this.au[var4].ag != null) {
                  for(var5 = 0; var5 < this.au[var4].ag.length; ++var5) {
                     this.af = 5984274429364623231L * (this.af * 971960971779926143L >>> 8 ^ var3[(int)((this.af * 971960971779926143L ^ (long)(this.au[var4].ag[var5] >> 8)) & 255L)]);
                     this.af = (971960971779926143L * this.af >>> 8 ^ var3[(int)((this.af * 971960971779926143L ^ (long)this.au[var4].ag[var5]) & 255L)]) * 5984274429364623231L;
                  }
               }

               if (null != this.au[var4].am) {
                  for(var5 = 0; var5 < this.au[var4].am.length; ++var5) {
                     this.af = (971960971779926143L * this.af >>> 8 ^ var3[(int)((this.af * 971960971779926143L ^ (long)(this.au[var4].am[var5] >> 8)) & 255L)]) * 5984274429364623231L;
                     this.af = 5984274429364623231L * (this.af * 971960971779926143L >>> 8 ^ var3[(int)((this.af * 971960971779926143L ^ (long)this.au[var4].am[var5]) & 255L)]);
                  }
               }
            }
         }
      }

      for(var4 = 0; var4 < 5; ++var4) {
         this.af = 5984274429364623231L * (this.af * 971960971779926143L >>> 8 ^ var3[(int)((971960971779926143L * this.af ^ (long)this.ag[var4]) & 255L)]);
      }

      this.af = (this.af * 971960971779926143L >>> 8 ^ var3[(int)((this.af * 971960971779926143L ^ (long)(2024464609 * this.ax)) & 255L)]) * 5984274429364623231L;
      if (var1 != 0L && var1 != 971960971779926143L * this.af || this.ar) {
         ai.ae(var1);
      }

   }

   public void bb(vf var1) {
      var1.bu(this.ax * 2024464609, (byte)-1);

      int var2;
      for(var2 = 0; var2 < 7; ++var2) {
         int[] var3 = this.ae;
         if (hz.ar == null) {
            hz.ac((byte)-15);
         }

         int var4 = hz.ar[var2];
         int var5 = var3[var4];
         if (vc.ac * -757804222 >= -1240573835) {
            if (var5 == 0) {
               var1.br(-1, 1625888552);
            } else {
               var1.br(var5 - -321534057, 1625888552);
            }
         } else if (var5 == 0) {
            var1.bu(-1, (byte)-68);
         } else {
            var1.bu(var5 - 1173375394, (byte)25);
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         var1.bu(this.ag[var2], (byte)21);
      }

   }

   public jm bv(if var1, int var2, if var3, int var4) {
      if (-1 != this.aq * 1618042977) {
         return gt.ac(1618042977 * this.aq, (byte)-13).ax(var1, var2, var3, var4, (hp)null, -1231747507);
      } else {
         long var5 = this.af * 971960971779926143L;
         int[] var7 = this.ae;
         if (null != var1 && (var1.aw * -1326457921 >= 0 || var1.an * -815731495 >= 0)) {
            var7 = new int[12];
            System.arraycopy(this.ae, 0, var7, 0, var7.length);
            if (-1326457921 * var1.aw >= 0) {
               var5 ^= (long)(-1326457921 * var1.aw - this.ae[541927411 * ii.aq.az]) << 40;
               var7[541927411 * ii.aq.az] = this.ay(var1.aw * -1326457921, -366269928);
            }

            if (var1.an * -815731495 >= 0) {
               var5 ^= (long)(-815731495 * var1.an - this.ae[ii.am.az * 541927411]) << 48;
               var7[541927411 * ii.am.az] = this.ay(var1.an * -815731495, -1404775428);
            }
         }

         jm var8 = (jm)ai.ac(var5);
         if (var8 == null) {
            boolean var9 = false;

            int var11;
            for(int var10 = 0; var10 < 12; ++var10) {
               var11 = var7[var10];
               if (this.aa(var11, -246196412)) {
                  hr var12 = this.ai(var11, 1704093937);
                  if (null != var12 && !var12.ax(1728597648)) {
                     var9 = true;
                  }
               }

               if (this.ao(var11, 1043235106) && !this.as(var11, (short)3323).ad(this.ax * 2024464609, (byte)16)) {
                  var9 = true;
               }
            }

            if (var9) {
               if (-1L != this.at * -6368619070362511553L) {
                  var8 = (jm)ai.ac(this.at * -6368619070362511553L);
               }

               if (var8 == null) {
                  return null;
               }
            }

            if (null == var8) {
               jv[] var19 = new jv[12];
               var11 = 0;

               int var13;
               for(int var20 = 0; var20 < 12; ++var20) {
                  var13 = var7[var20];
                  jv var15;
                  if (this.aa(var13, -246196412)) {
                     hr var14 = this.ai(var13, 175797999);
                     var15 = null;
                     if (null != var14) {
                        var15 = var14.aq((byte)-47);
                     }

                     if (null != var15) {
                        var19[var11++] = var15;
                     }
                  }

                  if (this.ao(var13, 1043235106)) {
                     is var22 = this.as(var13, (short)2002);
                     var15 = var22.ah(this.ax * 2024464609, -1546063953);
                     if (null != var15) {
                        if (this.au != null) {
                           gv var16 = this.au[var20];
                           if (null != var16) {
                              int var17;
                              if (var16.ag != null && var22.ao != null && var22.as.length == var16.ag.length) {
                                 for(var17 = 0; var17 < var22.ao.length; ++var17) {
                                    var15.ao(var22.as[var17], var16.ag[var17]);
                                 }
                              }

                              if (var16.am != null && var22.ay != null && var22.aj.length == var16.am.length) {
                                 for(var17 = 0; var17 < var22.ay.length; ++var17) {
                                    var15.as(var22.aj[var17], var16.am[var17]);
                                 }
                              }
                           }
                        }

                        var19[var11++] = var15;
                     }
                  }
               }

               jv var21 = new jv(var19, var11);

               for(var13 = 0; var13 < 5; ++var13) {
                  if (this.ag[var13] < jx.ad[var13].length) {
                     var21.ao(al[var13], jx.ad[var13][this.ag[var13]]);
                  }

                  if (this.ag[var13] < al.ap[var13].length) {
                     var21.ao(jq.ah[var13], al.ap[var13][this.ag[var13]]);
                  }
               }

               var8 = var21.bn(64, 850, -30, -50, -30);
               ai.ag(var8, var5);
               this.at = -5100801540163381057L * var5;
            }
         }

         jm var18;
         if (null == var1 && null == var3) {
            var18 = var8.ax(true);
         } else if (null != var1 && null != var3) {
            var18 = var1.au(var8, var2, var3, var4, 885978794);
         } else if (var1 != null) {
            var18 = var1.aq(var8, var2, 181956277);
         } else {
            var18 = var3.aq(var8, var4, 181956277);
         }

         return var18;
      }
   }

   jv bt() {
      if (-1 != 1618042977 * this.aq) {
         return gt.ac(this.aq * 1618042977, (byte)-9).aq((hp)null, 485730990);
      } else {
         boolean var1 = false;

         int var3;
         for(int var2 = 0; var2 < 12; ++var2) {
            var3 = this.ae[var2];
            if (this.aa(var3, -246196412)) {
               hr var4 = this.ai(var3, 295589700);
               if (var4 != null && !var4.af(-902831064)) {
                  var1 = true;
               }
            }

            if (this.ao(var3, 1043235106) && !this.as(var3, (short)-11290).ap(2024464609 * this.ax, -2092120874)) {
               var1 = true;
            }
         }

         if (var1) {
            return null;
         } else {
            jv[] var8 = new jv[12];
            var3 = 0;

            int var5;
            for(int var9 = 0; var9 < 12; ++var9) {
               var5 = this.ae[var9];
               if (this.aa(var5, -246196412)) {
                  hr var6 = this.ai(var5, 121539098);
                  jv var7 = null;
                  if (null != var6) {
                     var7 = var6.at(-1471399864);
                  }

                  if (null != var7) {
                     var8[var3++] = var7;
                  }
               }

               if (this.ao(var5, 1043235106)) {
                  jv var11 = this.as(var5, (short)-10641).ab(this.ax * 2024464609, (byte)-37);
                  if (var11 != null) {
                     var8[var3++] = var11;
                  }
               }
            }

            jv var10 = new jv(var8, var3);

            for(var5 = 0; var5 < 5; ++var5) {
               if (this.ag[var5] < jx.ad[var5].length) {
                  var10.ao(al[var5], jx.ad[var5][this.ag[var5]]);
               }

               if (this.ag[var5] < al.ap[var5].length) {
                  var10.ao(jq.ah[var5], al.ap[var5][this.ag[var5]]);
               }
            }

            return var10;
         }
      }
   }

   jv bq() {
      if (-1 != 1618042977 * this.aq) {
         return gt.ac(this.aq * 115106476, (byte)-6).aq((hp)null, 485730990);
      } else {
         boolean var1 = false;

         int var3;
         for(int var2 = 0; var2 < 12; ++var2) {
            var3 = this.ae[var2];
            if (this.aa(var3, -246196412)) {
               hr var4 = this.ai(var3, 932622783);
               if (var4 != null && !var4.af(423252829)) {
                  var1 = true;
               }
            }

            if (this.ao(var3, 1043235106) && !this.as(var3, (short)16751).ap(-1402084088 * this.ax, -1817171354)) {
               var1 = true;
            }
         }

         if (var1) {
            return null;
         } else {
            jv[] var8 = new jv[12];
            var3 = 0;

            int var5;
            for(int var9 = 0; var9 < 12; ++var9) {
               var5 = this.ae[var9];
               if (this.aa(var5, -246196412)) {
                  hr var6 = this.ai(var5, 989507077);
                  jv var7 = null;
                  if (null != var6) {
                     var7 = var6.at(383856287);
                  }

                  if (null != var7) {
                     var8[var3++] = var7;
                  }
               }

               if (this.ao(var5, 1043235106)) {
                  jv var11 = this.as(var5, (short)-5958).ab(this.ax * 2024464609, (byte)-87);
                  if (var11 != null) {
                     var8[var3++] = var11;
                  }
               }
            }

            jv var10 = new jv(var8, var3);

            for(var5 = 0; var5 < 5; ++var5) {
               if (this.ag[var5] < jx.ad[var5].length) {
                  var10.ao(al[var5], jx.ad[var5][this.ag[var5]]);
               }

               if (this.ag[var5] < al.ap[var5].length) {
                  var10.ao(jq.ah[var5], al.ap[var5][this.ag[var5]]);
               }
            }

            return var10;
         }
      }
   }

   public int bk() {
      long var1 = 971960971779926143L * this.af;
      if (this.aq * -1450855072 != -1) {
         var1 = -65536L | (long)(-1349022401 * this.aq);
      }

      Integer var3 = (Integer)ao.ae(var1, 1744951189);
      if (null == var3) {
         var3 = (as += -1841769507) * -1717967179 - 1;
         ao.ag(var1, var3, (short)-4692);
         as = 1579046813 * (-1717967179 * as % '\uffff');
      }

      return var3;
   }

   boolean cw(int var1) {
      return var1 >= -2023519509 * this.aa;
   }

   public void ax(int var1, boolean var2, int var3) {
      try {
         int var4 = this.ag[var1];
         boolean var5;
         if (!var2) {
            if (var3 <= 1014601869) {
               return;
            }

            do {
               --var4;
               if (var4 < 0) {
                  if (var3 <= 1014601869) {
                     return;
                  }

                  var4 = jx.ad[var1].length - 1;
               }

               if (var1 == 4) {
                  if (var3 <= 1014601869) {
                     return;
                  }

                  if (var4 >= 8) {
                     var5 = false;
                     continue;
                  }
               }

               var5 = true;
            } while(!var5);

            if (var3 <= 1014601869) {
               throw new IllegalStateException();
            }
         } else {
            while(true) {
               ++var4;
               if (var4 >= jx.ad[var1].length) {
                  var4 = 0;
               }

               label76: {
                  if (4 == var1) {
                     if (var3 <= 1014601869) {
                        throw new IllegalStateException();
                     }

                     if (var4 >= 8) {
                        var5 = false;
                        break label76;
                     }
                  }

                  var5 = true;
               }

               if (var5) {
                  if (var3 <= 1014601869) {
                     throw new IllegalStateException();
                  }
                  break;
               }
            }
         }

         this.ag[var1] = var4;
         this.at((byte)-64);
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "nr.ax(" + ')');
      }
   }

   boolean cg(int var1) {
      return var1 >= 256 && var1 < this.aa * -2023519509;
   }

   void ch() {
      this.ae(this.ac, this.ae, this.ag, 2024464609 * this.ax, this.aq * 1618042977, (byte)-107);
   }

   public void cf(int var1, int var2) {
      boolean var3 = var2 != this.ax * -1227040149;
      this.ax = var2 * -968788651;
      if (var3) {
         int var4;
         int var5;
         if (var1 == -1377684075 * this.ax) {
            for(var4 = 0; var4 < 7; ++var4) {
               if (null == hz.ar) {
                  hz.ac((byte)-116);
               }

               var5 = hz.ar[var4];
               if (this.ae[var5] > 0 && this.ae[var5] < -1471575149 * this.aa) {
                  this.ae[var5] = this.ac[var5];
               }
            }
         } else {
            if (this.ae[0] < this.aa * -2023519509 || this.ap((byte)6)) {
               this.ae[1262242507 * ii.ad.az] = 1;
            }

            for(var4 = 0; var4 < 7; ++var4) {
               if (null == hz.ar) {
                  hz.ac((byte)-89);
               }

               var5 = hz.ar[var4];
               if (this.ae[var5] > 0 && this.ae[var5] < 1510849300 * this.aa) {
                  int[] var7 = this.ae;

                  for(int var8 = 0; var8 < -2082710201 * hr.ag; ++var8) {
                     hr var9 = il.ac(var8, (byte)-93);
                     if (var9 != null && !var9.ad && var9.am(var4, var2, 177765229)) {
                        if (hz.ar == null) {
                           hz.ac((byte)-55);
                        }

                        int var11 = hz.ar[var4];
                        var7[var11] = 801480923 + var8;
                        break;
                     }
                  }
               }
            }
         }
      }

      this.ad(119580921);
   }

   public void av(int[] var1, int[] var2, int[] var3, int var4, int var5) {
      if (var1 == null) {
         var1 = this.ag(var4, (byte)-2);
      }

      if (var2 == null) {
         var2 = this.ag(var4, (byte)-89);
      }

      this.ac = var1;
      this.ae = var2;
      this.ag = var3;
      this.ax = var4 * -1019059423;
      this.aq = var5 * 588858273;
      this.at((byte)-80);
   }

   boolean cm() {
      if (!this.ao(this.ae[0], 1043235106)) {
         return false;
      } else {
         is var1 = this.as(this.ae[0], (short)-13800);
         return 541927411 * ii.ad.az != 1668381135 * var1.bw && var1.ba * 1198528189 != 541927411 * ii.ad.az;
      }
   }

   boolean cj() {
      if (!this.ao(this.ae[0], 1043235106)) {
         return false;
      } else {
         is var1 = this.as(this.ae[0], (short)2644);
         return 541927411 * ii.ad.az != 1668381135 * var1.bw && var1.ba * 1198528189 != 541927411 * ii.ad.az;
      }
   }

   public void cx(int var1, int var2) {
      this.ag[var1] = var2;
      this.ad(119580921);
   }

   public void ci(int var1, int var2) {
      this.ag[var1] = var2;
      this.ad(119580921);
   }

   public void bp(int var1) {
      if (var1 != 2024464609 * this.ax) {
         this.ae((int[])null, (int[])null, this.ag, var1, -1, (byte)-109);
      }
   }

   public void co(int var1, int var2) {
      this.ag[var1] = var2;
      this.ad(119580921);
   }

   public void ba(int var1) {
      if (var1 != 2024464609 * this.ax) {
         this.ae((int[])null, (int[])null, this.ag, var1, -1, (byte)-119);
      }
   }

   public nr() {
      try {
         super();
         this.am = -1908042749;
         this.ax = 0;
         this.ar = false;
         this.aa = -1861366333 * (vc.ac * -95704915 < 224 ? 512 : 2048);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "nr.<init>(" + ')');
      }
   }

   boolean ct(int var1) {
      return var1 >= 256 && var1 < this.aa * -2023519509;
   }

   hr cq(int var1) {
      return il.ac(var1 - 256, (byte)-18);
   }

   public int cn() {
      long var1 = 971960971779926143L * this.af;
      if (this.aq * 1618042977 != -1) {
         var1 = -65536L | (long)(1618042977 * this.aq);
      }

      Integer var3 = (Integer)ao.ae(var1, 1744951189);
      if (null == var3) {
         var3 = (as += 1579046813) * -1717967179 - 1;
         ao.ag(var1, var3, (short)-28572);
         as = 1579046813 * (-1717967179 * as % -415244522);
      }

      return var3;
   }

   boolean cu() {
      if (!this.ao(this.ae[0], 1043235106)) {
         return false;
      } else {
         is var1 = this.as(this.ae[0], (short)16380);
         return 541927411 * ii.ad.az != 1668381135 * var1.bw && var1.ba * 1198528189 != 541927411 * ii.ad.az;
      }
   }

   public void bh(int var1, boolean var2) {
      int[] var3 = this.ae;
      if (null == hz.ar) {
         hz.ac((byte)-96);
      }

      int var4 = hz.ar[var1];
      int var5 = var3[var4];
      if (0 != var5) {
         var5 -= 256;

         hr var6;
         do {
            if (!var2) {
               --var5;
               if (var5 < 0) {
                  var5 = hr.ag * 922536311 - 1;
               }
            } else {
               ++var5;
               if (var5 >= hr.ag * -2082710201) {
                  var5 = 0;
               }
            }

            var6 = il.ac(var5, (byte)-52);
         } while(null == var6 || var6.ad || !var6.am(var1, 1964815067 * this.ax, -1026344335));

         int[] var8 = this.ae;
         if (hz.ar == null) {
            hz.ac((byte)-4);
         }

         int var7 = hz.ar[var1];
         var8[var7] = -138382647 + var5;
         this.at((byte)-98);
      }
   }

   is cr(int var1) {
      return dh.ac(var1 - -2023519509 * this.aa, 2135415530);
   }

   is cl(int var1) {
      return dh.ac(var1 - -2023519509 * this.aa, 2101788370);
   }

   int ca(int var1) {
      return -2023519509 * this.aa + (var1 - 512);
   }

   int cs(int var1) {
      return 350861216 * this.aa + (var1 - 512);
   }

   boolean cz(int var1) {
      return var1 >= -359062514 * this.aa;
   }
}
