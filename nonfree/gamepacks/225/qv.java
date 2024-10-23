public class qv {
   float am;
   static int ae;
   static int ag;
   float ax;
   float aq;
   static qv[] ac;
   public static cl vj;
   static sk ey;
   static final int aa = 17;

   public String amp() {
      return this.am + ", " + this.ax + ", " + this.aq;
   }

   qv() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "qv.<init>(" + ')');
      }
   }

   public qv(float var1, float var2, float var3) {
      try {
         super();
         this.am = var1;
         this.ax = var2;
         this.aq = var3;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "qv.<init>(" + ')');
      }
   }

   final float at(byte var1) {
      try {
         return (float)Math.sqrt((double)(this.aq * this.aq + this.am * this.am + this.ax * this.ax));
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "qv.at(" + ')');
      }
   }

   boolean af(qv var1, byte var2) {
      try {
         if (var1.am == this.am) {
            if (var2 != 50) {
               throw new IllegalStateException();
            }

            if (var1.ax == this.ax) {
               if (this.aq == var1.aq) {
                  return true;
               }

               if (var2 != 50) {
                  throw new IllegalStateException();
               }
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "qv.af(" + ')');
      }
   }

   final float av() {
      return (float)Math.sqrt((double)(this.aq * this.aq + this.am * this.am + this.ax * this.ax));
   }

   static qv ad() {
      synchronized(ac) {
         if (ag * -1166807659 == 0) {
            return new qv();
         } else {
            ac[(ag -= -412944963) * -1166807659].aq((short)255);
            return ac[ag * -1166807659];
         }
      }
   }

   public String toString() {
      try {
         return this.am + ", " + this.ax + ", " + this.aq;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "qv.toString(" + ')');
      }
   }

   static {
      new qv(0.0F, 0.0F, 0.0F);
      new qv(1.0F, 1.0F, 1.0F);
      new qv(1.0F, 0.0F, 0.0F);
      new qv(0.0F, 1.0F, 0.0F);
      new qv(0.0F, 0.0F, 1.0F);
      ac = new qv[0];
      ki.ac(100, -2040669873);
   }

   public String aml() {
      return this.am + ", " + this.ax + ", " + this.aq;
   }

   public void ax(float var1, float var2, float var3, int var4) {
      try {
         this.am = var1;
         this.ax = var2;
         this.aq = var3;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "qv.ax(" + ')');
      }
   }

   public String ame() {
      return this.am + ", " + this.ax + ", " + this.aq;
   }

   boolean ay(qv var1) {
      return var1.am == this.am && var1.ax == this.ax && this.aq == var1.aq;
   }

   static void ar(int var0) {
      ae = var0 * -1006152333;
      ac = new qv[var0];
      ag = 0;
   }

   static qv al() {
      synchronized(ac) {
         if (ag * -1166807659 == 0) {
            return new qv();
         } else {
            ac[(ag -= -412944963) * -1166807659].aq((short)255);
            return ac[ag * -1166807659];
         }
      }
   }

   static void au(int var0) {
      ae = var0 * -1006152333;
      ac = new qv[var0];
      ag = 0;
   }

   void am(short var1) {
      try {
         synchronized(ac) {
            if (ag * -1166807659 < 576444347 * ae - 1) {
               if (var1 >= 1000) {
                  throw new IllegalStateException();
               }

               ac[(ag += -412944963) * -1166807659 - 1] = this;
            }

         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "qv.am(" + ')');
      }
   }

   static qv ap(float var0, float var1, float var2) {
      synchronized(ac) {
         if (-1166807659 * ag == 0) {
            return new qv(var0, var1, var2);
         } else {
            ac[(ag -= -412944963) * -1166807659].ax(var0, var1, var2, -1394689078);
            return ac[-1166807659 * ag];
         }
      }
   }

   void ab() {
      synchronized(ac) {
         if (ag * -1166807659 < 576444347 * ae - 1) {
            ac[(ag += -412944963) * -1166807659 - 1] = this;
         }

      }
   }

   static qv ah(float var0, float var1, float var2) {
      synchronized(ac) {
         if (408385159 * ag == 0) {
            return new qv(var0, var1, var2);
         } else {
            ac[(ag -= 341148356) * -1166807659].ax(var0, var1, var2, -1394689078);
            return ac[-1166807659 * ag];
         }
      }
   }

   void aa() {
      synchronized(ac) {
         if (ag * 54747127 < 576444347 * ae - 1) {
            ac[(ag += 970828597) * -303469919 - 1] = this;
         }

      }
   }

   public void ai(float var1, float var2, float var3) {
      this.am = var1;
      this.ax = var2;
      this.aq = var3;
   }

   final void ao() {
      this.aq = 0.0F;
      this.ax = 0.0F;
      this.am = 0.0F;
   }

   boolean as(qv var1) {
      return var1.am == this.am && var1.ax == this.ax && this.aq == var1.aq;
   }

   void az() {
      synchronized(ac) {
         if (ag * -1166807659 < -308348728 * ae - 1) {
            ac[(ag += -884112147) * 2052673092 - 1] = this;
         }

      }
   }

   final float aj() {
      return (float)Math.sqrt((double)(this.aq * this.aq + this.am * this.am + this.ax * this.ax));
   }

   final void aq(short var1) {
      try {
         this.aq = 0.0F;
         this.ax = 0.0F;
         this.am = 0.0F;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "qv.aq(" + ')');
      }
   }

   final float aw() {
      return (float)Math.sqrt((double)(this.aq * this.aq + this.am * this.am + this.ax * this.ax));
   }

   final float an() {
      return (float)Math.sqrt((double)(this.aq * this.aq + this.am * this.am + this.ax * this.ax));
   }

   static final void jr(dd var0, dy var1, int var2, byte var3) {
      try {
         int var4;
         int var5;
         int var6;
         int var8;
         if var15;
         if var16;
         if (var1.dw * 971681271 >= client.do * 1472813913) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            var4 = Math.max(1, var1.dw * 971681271 - 1472813913 * client.do);
            var5 = -1322514048 * var1.dk + -923602880 * var1.bw;
            var6 = var1.db * -1505418112 + -923602880 * var1.bw;
            var1.bf += -391022789 * ((var5 - -1125889549 * var1.bf) / var4);
            var1.bm += -1439811517 * ((var6 - var1.bm * -1650600853) / var4);
            var1.eg = 0;
            var1.dg = var1.dx * 1423679635;
         } else {
            int var7;
            int var9;
            int var10;
            if (-1776272851 * var1.de >= client.do * 1472813913) {
               if (var3 >= 0) {
                  return;
               }

               boolean var10000;
               label1051: {
                  if (client.do * 1472813913 != var1.de * -1776272851) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (var1.cd * 1036457443 != -1) {
                        if (var3 >= 0) {
                           throw new IllegalStateException();
                        }

                        if (var1.dp * 1972322021 == 0) {
                           var10000 = false;
                           break label1051;
                        }
                     }
                  }

                  var10000 = true;
               }

               boolean var14 = var10000;
               if (!var14) {
                  label1171: {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     var15 = ds.ae(1036457443 * var1.cd, -683358200);
                     if (null != var15) {
                        if (var3 >= 0) {
                           return;
                        }

                        if (!var15.ad(-1784677445)) {
                           if (612738273 * var1.ck + 1 > var15.aa[var1.ce * 1256288093]) {
                              if (var3 >= 0) {
                                 return;
                              }

                              var10000 = true;
                           } else {
                              var10000 = false;
                           }

                           var14 = var10000;
                           break label1171;
                        }

                        if (var3 >= 0) {
                           return;
                        }
                     }

                     var14 = true;
                  }
               }

               if (var14) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  var5 = -1776272851 * var1.de - 971681271 * var1.dw;
                  var6 = client.do * 1472813913 - var1.dw * 971681271;
                  var7 = var1.bw * -923602880 + var1.dk * -1322514048;
                  var8 = -1505418112 * var1.db + -923602880 * var1.bw;
                  var9 = var1.dl * -634643584 + var1.bw * -923602880;
                  var10 = var1.bw * -923602880 + var1.dc * -162432384;
                  var1.bf = ((var5 - var6) * var7 + var6 * var9) / var5 * -391022789;
                  var1.bm = (var6 * var10 + (var5 - var6) * var8) / var5 * -1439811517;
               }

               var1.eg = 0;
               var1.dg = 1423679635 * var1.dx;
               var1.bs = 239451237 * var1.dg;
            } else {
               var1.ca = 1516667225 * var1.bj;
               if (0 == var1.ds * 166438615) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  var1.eg = 0;
               } else {
                  label1139: {
                     if (var1.cd * 1036457443 != -1) {
                        if (var3 >= 0) {
                           throw new IllegalStateException();
                        }

                        if (var1.dp * 1972322021 == 0) {
                           if (var3 >= 0) {
                              throw new IllegalStateException();
                           }

                           var16 = ds.ae(1036457443 * var1.cd, -683358200);
                           if (1437743483 * var1.ea > 0 && 1890691075 * var16.bh == 0) {
                              if (var3 >= 0) {
                                 return;
                              }

                              var1.eg += 299963163;
                              break label1139;
                           }

                           if (var1.ea * 1437743483 <= 0) {
                              if (var3 >= 0) {
                                 throw new IllegalStateException();
                              }

                              if (var16.bd * 761270303 == 0) {
                                 if (var3 >= 0) {
                                    throw new IllegalStateException();
                                 }

                                 var1.eg += 299963163;
                                 break label1139;
                              }
                           }
                        }
                     }

                     var4 = -1125889549 * var1.bf;
                     var5 = -1650600853 * var1.bm;
                     var6 = var1.dn[166438615 * var1.ds - 1] * 128 + -923602880 * var1.bw;
                     var7 = 128 * var1.du[var1.ds * 166438615 - 1] + var1.bw * -923602880;
                     if (var4 < var6) {
                        if (var3 >= 0) {
                           throw new IllegalStateException();
                        }

                        if (var5 < var7) {
                           if (var3 >= 0) {
                              throw new IllegalStateException();
                           }

                           var1.dg = -2035715840;
                        } else if (var5 > var7) {
                           if (var3 >= 0) {
                              throw new IllegalStateException();
                           }

                           var1.dg = 1444965120;
                        } else {
                           var1.dg = 1852108288;
                        }
                     } else if (var4 > var6) {
                        if (var3 >= 0) {
                           throw new IllegalStateException();
                        }

                        if (var5 < var7) {
                           if (var3 >= 0) {
                              return;
                           }

                           var1.dg = -1221429504;
                        } else if (var5 > var7) {
                           var1.dg = -407143168;
                        } else {
                           var1.dg = -814286336;
                        }
                     } else if (var5 < var7) {
                        if (var3 >= 0) {
                           throw new IllegalStateException();
                        }

                        var1.dg = -1628572672;
                     } else if (var5 > var7) {
                        if (var3 >= 0) {
                           throw new IllegalStateException();
                        }

                        var1.dg = 0;
                     }

                     kk var20 = var1.dd[var1.ds * 166438615 - 1];
                     if (var6 - var4 <= 256) {
                        if (var3 >= 0) {
                           return;
                        }

                        if (var6 - var4 >= -256 && var7 - var5 <= 256) {
                           if (var3 >= 0) {
                              return;
                           }

                           if (var7 - var5 >= -256) {
                              var9 = var1.dg * 1822086613 - 898237617 * var1.bs & 2047;
                              if (var9 > 1024) {
                                 if (var3 >= 0) {
                                    return;
                                 }

                                 var9 -= 2048;
                              }

                              label1143: {
                                 var10 = 1834502147 * var1.bi;
                                 if (var9 >= -256) {
                                    if (var3 >= 0) {
                                       throw new IllegalStateException();
                                    }

                                    if (var9 <= 256) {
                                       var10 = var1.bb * -1191497365;
                                       break label1143;
                                    }
                                 }

                                 if (var9 >= 256) {
                                    if (var3 >= 0) {
                                       throw new IllegalStateException();
                                    }

                                    if (var9 < 768) {
                                       if (var3 >= 0) {
                                          throw new IllegalStateException();
                                       }

                                       var10 = var1.bl * 1796812871;
                                       break label1143;
                                    }
                                 }

                                 if (var9 >= -768 && var9 <= -256) {
                                    if (var3 >= 0) {
                                       throw new IllegalStateException();
                                    }

                                    var10 = -1938792471 * var1.bg;
                                 }
                              }

                              if (var10 == -1) {
                                 if (var3 >= 0) {
                                    throw new IllegalStateException();
                                 }

                                 var10 = -1191497365 * var1.bb;
                              }

                              var1.ca = var10 * 1278306061;
                              int var11 = 4;
                              boolean var12 = true;
                              if (var1 instanceof ea) {
                                 if (var3 >= 0) {
                                    throw new IllegalStateException();
                                 }

                                 var12 = ((ea)var1).ac.bz;
                              }

                              if (var12) {
                                 if (var3 >= 0) {
                                    throw new IllegalStateException();
                                 }

                                 if (898237617 * var1.bs != 1822086613 * var1.dg && -1 == 1608353943 * var1.cq) {
                                    if (var3 >= 0) {
                                       return;
                                    }

                                    if (0 != var1.dy * -695206717) {
                                       if (var3 >= 0) {
                                          throw new IllegalStateException();
                                       }

                                       var11 = 2;
                                    }
                                 }

                                 if (166438615 * var1.ds > 2) {
                                    if (var3 >= 0) {
                                       return;
                                    }

                                    var11 = 6;
                                 }

                                 if (166438615 * var1.ds > 3) {
                                    if (var3 >= 0) {
                                       return;
                                    }

                                    var11 = 8;
                                 }

                                 if (-631828717 * var1.eg > 0 && 166438615 * var1.ds > 1) {
                                    var11 = 8;
                                    var1.eg -= 299963163;
                                 }
                              } else {
                                 if (var1.ds * 166438615 > 1) {
                                    if (var3 >= 0) {
                                       throw new IllegalStateException();
                                    }

                                    var11 = 6;
                                 }

                                 if (166438615 * var1.ds > 2) {
                                    if (var3 >= 0) {
                                       throw new IllegalStateException();
                                    }

                                    var11 = 8;
                                 }

                                 if (-631828717 * var1.eg > 0) {
                                    if (var3 >= 0) {
                                       throw new IllegalStateException();
                                    }

                                    if (var1.ds * 166438615 > 1) {
                                       if (var3 >= 0) {
                                          throw new IllegalStateException();
                                       }

                                       var11 = 8;
                                       var1.eg -= 299963163;
                                    }
                                 }
                              }

                              if (var20 == kk.am) {
                                 if (var3 >= 0) {
                                    return;
                                 }

                                 var11 <<= 1;
                              } else if (var20 == kk.ae) {
                                 if (var3 >= 0) {
                                    throw new IllegalStateException();
                                 }

                                 var11 >>= 1;
                              }

                              if (var11 >= 8) {
                                 label1147: {
                                    if (var3 >= 0) {
                                       throw new IllegalStateException();
                                    }

                                    if (var1.bb * -1191497365 == -1002586171 * var1.ca) {
                                       if (var3 >= 0) {
                                          return;
                                       }

                                       if (-1 != var1.bz * -1399093363) {
                                          if (var3 >= 0) {
                                             throw new IllegalStateException();
                                          }

                                          var1.ca = var1.bz * 627875113;
                                          break label1147;
                                       }
                                    }

                                    if (1834502147 * var1.bi == var1.ca * -1002586171) {
                                       if (var3 >= 0) {
                                          throw new IllegalStateException();
                                       }

                                       if (-1 != -567359311 * var1.bu) {
                                          if (var3 >= 0) {
                                             throw new IllegalStateException();
                                          }

                                          var1.ca = var1.bu * 285239293;
                                          break label1147;
                                       }
                                    }

                                    if (var1.bg * -1938792471 == var1.ca * -1002586171) {
                                       if (var3 >= 0) {
                                          return;
                                       }

                                       if (var1.br * -5540665 != -1) {
                                          if (var3 >= 0) {
                                             return;
                                          }

                                          var1.ca = var1.br * 1707605787;
                                          break label1147;
                                       }
                                    }

                                    if (var1.bl * 1796812871 == -1002586171 * var1.ca) {
                                       if (var3 >= 0) {
                                          return;
                                       }

                                       if (-537618993 * var1.bo != -1) {
                                          var1.ca = var1.bo * -397351805;
                                       }
                                    }
                                 }
                              } else if (var11 <= 2) {
                                 label1173: {
                                    if (var3 >= 0) {
                                       throw new IllegalStateException();
                                    }

                                    if (var1.bb * -1191497365 == var1.ca * -1002586171) {
                                       if (var3 >= 0) {
                                          throw new IllegalStateException();
                                       }

                                       if (-1 != var1.bv * -1057053467) {
                                          if (var3 >= 0) {
                                             throw new IllegalStateException();
                                          }

                                          var1.ca = var1.bv * -853835103;
                                          break label1173;
                                       }
                                    }

                                    if (-1002586171 * var1.ca == var1.bi * 1834502147) {
                                       if (var3 >= 0) {
                                          return;
                                       }

                                       if (var1.bt * -1911661983 != -1) {
                                          if (var3 >= 0) {
                                             throw new IllegalStateException();
                                          }

                                          var1.ca = 363372013 * var1.bt;
                                          break label1173;
                                       }
                                    }

                                    if (-1938792471 * var1.bg == -1002586171 * var1.ca) {
                                       if (var3 >= 0) {
                                          throw new IllegalStateException();
                                       }

                                       if (1986001845 * var1.bq != -1) {
                                          if (var3 >= 0) {
                                             return;
                                          }

                                          var1.ca = var1.bq * -1966433487;
                                          break label1173;
                                       }
                                    }

                                    if (-1002586171 * var1.ca == 1796812871 * var1.bl) {
                                       if (var3 >= 0) {
                                          return;
                                       }

                                       if (-1 != -511505321 * var1.bk) {
                                          if (var3 >= 0) {
                                             return;
                                          }

                                          var1.ca = 1581621611 * var1.bk;
                                       }
                                    }
                                 }
                              }

                              label1148: {
                                 if (var6 == var4) {
                                    if (var3 >= 0) {
                                       throw new IllegalStateException();
                                    }

                                    if (var5 == var7) {
                                       break label1148;
                                    }

                                    if (var3 >= 0) {
                                       throw new IllegalStateException();
                                    }
                                 }

                                 if (var4 < var6) {
                                    if (var3 >= 0) {
                                       throw new IllegalStateException();
                                    }

                                    var1.bf += -391022789 * var11;
                                    if (-1125889549 * var1.bf > var6) {
                                       if (var3 >= 0) {
                                          throw new IllegalStateException();
                                       }

                                       var1.bf = var6 * -391022789;
                                    }
                                 } else if (var4 > var6) {
                                    if (var3 >= 0) {
                                       throw new IllegalStateException();
                                    }

                                    var1.bf -= var11 * -391022789;
                                    if (var1.bf * -1125889549 < var6) {
                                       if (var3 >= 0) {
                                          throw new IllegalStateException();
                                       }

                                       var1.bf = -391022789 * var6;
                                    }
                                 }

                                 if (var5 < var7) {
                                    var1.bm += -1439811517 * var11;
                                    if (var1.bm * -1650600853 > var7) {
                                       if (var3 >= 0) {
                                          throw new IllegalStateException();
                                       }

                                       var1.bm = -1439811517 * var7;
                                    }
                                 } else if (var5 > var7) {
                                    if (var3 >= 0) {
                                       throw new IllegalStateException();
                                    }

                                    var1.bm -= var11 * -1439811517;
                                    if (-1650600853 * var1.bm < var7) {
                                       if (var3 >= 0) {
                                          throw new IllegalStateException();
                                       }

                                       var1.bm = var7 * -1439811517;
                                    }
                                 }
                              }

                              if (-1125889549 * var1.bf == var6 && var7 == -1650600853 * var1.bm) {
                                 if (var3 >= 0) {
                                    throw new IllegalStateException();
                                 }

                                 var1.ds -= -178475801;
                                 if (var1.ea * 1437743483 > 0) {
                                    if (var3 >= 0) {
                                       throw new IllegalStateException();
                                    }

                                    var1.ea -= 540458419;
                                 }
                              }
                              break label1139;
                           }

                           if (var3 >= 0) {
                              throw new IllegalStateException();
                           }
                        }
                     }

                     var1.bf = -391022789 * var6;
                     var1.bm = var7 * -1439811517;
                     var1.ds -= -178475801;
                     if (var1.ea * 1437743483 > 0) {
                        var1.ea -= 540458419;
                     }
                  }
               }
            }
         }

         label1033: {
            if (var1.bf * -1125889549 >= 128) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               if (13184 > var1.bf * -1125889549) {
                  if (var3 >= 0) {
                     return;
                  }

                  if (-1650600853 * var1.bm >= 128) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (13184 > -1650600853 * var1.bm) {
                        break label1033;
                     }
                  }
               }
            }

            var1.cd = 46082101;
            var1.dw = 0;
            var1.de = 0;
            var1.df(-197001658);
            var1.bf = 1488690560 * var1.dn[0] + var1.bw * 1508581056;
            var1.bm = 387719552 * var1.du[0] + var1.bw * 1738727616;
            var1.cp((byte)-50);
         }

         if (qm.mm == var1) {
            label1150: {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               if (-1125889549 * var1.bf >= 1536) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (11776 > -1125889549 * var1.bf && -1650600853 * var1.bm >= 1536) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (11776 > -1650600853 * var1.bm) {
                        break label1150;
                     }

                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }
                  }
               }

               var1.cd = 46082101;
               var1.dw = 0;
               var1.de = 0;
               var1.df(-35528258);
               var1.bf = 1508581056 * var1.bw + 1488690560 * var1.dn[0];
               var1.bm = 387719552 * var1.du[0] + 1738727616 * var1.bw;
               var1.cp((byte)-42);
            }
         }

         fz.jt(var0, var1, -1058692196);
         var1.an = false;
         int var10001;
         int var10002;
         int var10003;
         boolean var10004;
         if (var1.ca * -1002586171 != -1) {
            var16 = ds.ae(var1.ca * -1002586171, -683358200);
            if (var16 != null) {
               label1153: {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (!var16.ad(-1822192516)) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (null != var16.ab) {
                        var1.cp += 117484167;
                        if (var1.cs * -427295501 < var16.ab.length) {
                           if (var3 >= 0) {
                              return;
                           }

                           if (var1.cp * 139459383 > var16.aa[-427295501 * var1.cs]) {
                              if (var3 >= 0) {
                                 return;
                              }

                              var1.cp = 117484167;
                              var1.cs += -65962949;
                              var10001 = -427295501 * var1.cs;
                              var10002 = -1125889549 * var1.bf;
                              var10003 = var1.bm * -1650600853;
                              if (qm.mm == var1) {
                                 if (var3 >= 0) {
                                    return;
                                 }

                                 var10004 = true;
                              } else {
                                 var10004 = false;
                              }

                              dq.ix(var16, var10001, var10002, var10003, var10004, -1608836683);
                           }
                        }

                        if (-427295501 * var1.cs < var16.ab.length) {
                           break label1153;
                        }

                        if (var3 >= 0) {
                           throw new IllegalStateException();
                        }

                        if (var16.ao * -1317182493 > 0) {
                           label1156: {
                              if (var3 >= 0) {
                                 return;
                              }

                              var1.cs -= -1168443055 * var16.ao;
                              if (var16.bn) {
                                 if (var3 >= 0) {
                                    return;
                                 }

                                 var1.cb += 826823503;
                              }

                              if (-427295501 * var1.cs >= 0) {
                                 if (var3 >= 0) {
                                    return;
                                 }

                                 if (-427295501 * var1.cs < var16.ab.length) {
                                    if (var3 >= 0) {
                                       return;
                                    }

                                    if (!var16.bn) {
                                       break label1156;
                                    }

                                    if (var3 >= 0) {
                                       throw new IllegalStateException();
                                    }

                                    if (1263592367 * var1.cb < -1967207071 * var16.ak) {
                                       break label1156;
                                    }

                                    if (var3 >= 0) {
                                       throw new IllegalStateException();
                                    }
                                 }
                              }

                              var1.cp = 0;
                              var1.cs = 0;
                              var1.cb = 0;
                           }
                        } else {
                           var1.cp = 0;
                           var1.cs = 0;
                        }

                        var10001 = -427295501 * var1.cs;
                        var10002 = -1125889549 * var1.bf;
                        var10003 = -1650600853 * var1.bm;
                        if (var1 == qm.mm) {
                           if (var3 >= 0) {
                              throw new IllegalStateException();
                           }

                           var10004 = true;
                        } else {
                           var10004 = false;
                        }

                        dq.ix(var16, var10001, var10002, var10003, var10004, -1643070544);
                        break label1153;
                     }
                  }

                  if (var16.ad(-2126095899)) {
                     var1.cs += -65962949;
                     var5 = var16.ah(-1867690040);
                     if (var1.cs * -427295501 < var5) {
                        if (var3 >= 0) {
                           return;
                        }

                        var10001 = -427295501 * var1.cs;
                        var10002 = var1.bf * -1125889549;
                        var10003 = -1650600853 * var1.bm;
                        if (qm.mm == var1) {
                           if (var3 >= 0) {
                              return;
                           }

                           var10004 = true;
                        } else {
                           var10004 = false;
                        }

                        aw.ir(var16, var10001, var10002, var10003, var10004, -2096371572);
                     } else {
                        if (-1317182493 * var16.ao > 0) {
                           label1160: {
                              if (var3 >= 0) {
                                 throw new IllegalStateException();
                              }

                              var1.cs -= -1168443055 * var16.ao;
                              if (var16.bn) {
                                 if (var3 >= 0) {
                                    throw new IllegalStateException();
                                 }

                                 var1.cb += 826823503;
                              }

                              if (-427295501 * var1.cs >= 0) {
                                 if (var3 >= 0) {
                                    return;
                                 }

                                 if (var1.cs * -427295501 < var5) {
                                    if (var3 >= 0) {
                                       return;
                                    }

                                    if (!var16.bn || 1263592367 * var1.cb < -1967207071 * var16.ak) {
                                       break label1160;
                                    }

                                    if (var3 >= 0) {
                                       throw new IllegalStateException();
                                    }
                                 }
                              }

                              var1.cs = 0;
                              var1.cp = 0;
                              var1.cb = 0;
                           }
                        } else {
                           var1.cp = 0;
                           var1.cs = 0;
                        }

                        var10001 = var1.cs * -427295501;
                        var10002 = -1125889549 * var1.bf;
                        var10003 = -1650600853 * var1.bm;
                        if (var1 == qm.mm) {
                           if (var3 >= 0) {
                              throw new IllegalStateException();
                           }

                           var10004 = true;
                        } else {
                           var10004 = false;
                        }

                        aw.ir(var16, var10001, var10002, var10003, var10004, -1741577065);
                     }
                  } else {
                     var1.ca = -1278306061;
                  }
               }
            } else {
               var1.ca = -1278306061;
            }
         }

         us var17 = new us(var1.dp(-1368487073));

         for(sc var18 = (sc)var17.ae(); var18 != null; var18 = (sc)var17.next()) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            if (-1 != -1229069603 * var18.ac) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               if (client.do * 1472813913 < 811756247 * var18.am) {
                  if (var3 >= 0) {
                     return;
                  }
               } else {
                  var6 = he.ae(var18.ac * -1229069603, (byte)-47).af * -617652759;
                  if (-1 == var6) {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     var18.jb();
                     var1.dt -= 484971093;
                  } else {
                     var18.ae = Math.max(var18.ae * 757511083, 0) * 825143043;
                     if var19 = ds.ae(var6, -683358200);
                     if (var19.ab != null) {
                        if (var3 >= 0) {
                           return;
                        }

                        if (!var19.ad(-1527877288)) {
                           if (var3 >= 0) {
                              throw new IllegalStateException();
                           }

                           var18.ag += -1801409699;
                           if (757511083 * var18.ae < var19.ab.length && var18.ag * -479461131 > var19.aa[757511083 * var18.ae]) {
                              if (var3 >= 0) {
                                 throw new IllegalStateException();
                              }

                              var18.ag = -1801409699;
                              var18.ae += 825143043;
                              var10001 = 757511083 * var18.ae;
                              var10002 = var1.bf * -1125889549;
                              var10003 = -1650600853 * var1.bm;
                              if (qm.mm == var1) {
                                 if (var3 >= 0) {
                                    throw new IllegalStateException();
                                 }

                                 var10004 = true;
                              } else {
                                 var10004 = false;
                              }

                              dq.ix(var19, var10001, var10002, var10003, var10004, -831052122);
                           }

                           if (var18.ae * 757511083 >= var19.ab.length) {
                              if (var3 >= 0) {
                                 throw new IllegalStateException();
                              }

                              var18.jb();
                              var1.dt -= 484971093;
                           }
                           continue;
                        }
                     }

                     if (var19.ad(-1588993437)) {
                        var18.ae += 825143043;
                        var8 = var19.ah(-1884303546);
                        if (var18.ae * 757511083 < var8) {
                           aw.ir(var19, 757511083 * var18.ae, var1.bf * -1125889549, var1.bm * -1650600853, var1 == qm.mm, -1290946161);
                        } else {
                           var18.jb();
                           var1.dt -= 484971093;
                        }
                     } else {
                        var18.jb();
                        var1.dt -= 484971093;
                     }
                  }
               }
            }
         }

         if (var1.cd * 1036457443 != -1) {
            if (var3 >= 0) {
               return;
            }

            if (1972322021 * var1.dp <= 1) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               var15 = ds.ae(1036457443 * var1.cd, -683358200);
               if (1 == var15.bh * 1890691075 && 1437743483 * var1.ea > 0) {
                  if (var3 >= 0) {
                     throw new IllegalStateException();
                  }

                  if (971681271 * var1.dw <= 1472813913 * client.do && -1776272851 * var1.de < 1472813913 * client.do) {
                     if (var3 >= 0) {
                        return;
                     }

                     var1.dp = -1278914835;
                     return;
                  }
               }
            }
         }

         if (1036457443 * var1.cd != -1) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            if (0 == var1.dp * 1972322021) {
               if (var3 >= 0) {
                  throw new IllegalStateException();
               }

               var15 = ds.ae(1036457443 * var1.cd, -683358200);
               if (null != var15) {
                  label1166: {
                     if (var3 >= 0) {
                        throw new IllegalStateException();
                     }

                     if (!var15.ad(-1737284566)) {
                        if (var3 >= 0) {
                           throw new IllegalStateException();
                        }

                        if (null != var15.ab) {
                           if (var3 >= 0) {
                              return;
                           }

                           var1.ck += -685859039;
                           if (var1.ce * 1256288093 < var15.ab.length) {
                              if (var3 >= 0) {
                                 return;
                              }

                              if (var1.ck * 612738273 > var15.aa[1256288093 * var1.ce]) {
                                 if (var3 >= 0) {
                                    throw new IllegalStateException();
                                 }

                                 var1.ck = -685859039;
                                 var1.ce += -428385035;
                                 dq.ix(var15, 1256288093 * var1.ce, -1125889549 * var1.bf, -1650600853 * var1.bm, qm.mm == var1, -519540775);
                              }
                           }

                           if (1256288093 * var1.ce >= var15.ab.length) {
                              if (var3 >= 0) {
                                 throw new IllegalStateException();
                              }

                              var1.ce -= var15.ao * 1298869311;
                              var1.df += 1255127717;
                              if (1977720109 * var1.df >= -1967207071 * var15.ak) {
                                 if (var3 >= 0) {
                                    throw new IllegalStateException();
                                 }

                                 var1.cd = 46082101;
                              } else {
                                 label1181: {
                                    if (var1.ce * 1256288093 >= 0) {
                                       if (1256288093 * var1.ce < var15.ab.length) {
                                          dq.ix(var15, var1.ce * 1256288093, var1.bf * -1125889549, var1.bm * -1650600853, qm.mm == var1, -563083228);
                                          break label1181;
                                       }

                                       if (var3 >= 0) {
                                          return;
                                       }
                                    }

                                    var1.cd = 46082101;
                                 }
                              }
                           }

                           var1.an = var15.aj;
                           break label1166;
                        }
                     }

                     if (var15.ad(-1595093977)) {
                        if (var3 >= 0) {
                           throw new IllegalStateException();
                        }

                        var1.ce += -428385035;
                        var6 = var15.ah(-76244627);
                        if (var1.ce * 1256288093 < var6) {
                           if (var3 >= 0) {
                              throw new IllegalStateException();
                           }

                           aw.ir(var15, var1.ce * 1256288093, -1125889549 * var1.bf, var1.bm * -1650600853, qm.mm == var1, 1344847934);
                        } else {
                           var1.ce -= var15.ao * 1298869311;
                           var1.df += 1255127717;
                           if (1977720109 * var1.df >= -1967207071 * var15.ak) {
                              if (var3 >= 0) {
                                 throw new IllegalStateException();
                              }

                              var1.cd = 46082101;
                           } else {
                              label925: {
                                 if (1256288093 * var1.ce >= 0) {
                                    if (var3 >= 0) {
                                       throw new IllegalStateException();
                                    }

                                    if (var1.ce * 1256288093 < var6) {
                                       aw.ir(var15, var1.ce * 1256288093, var1.bf * -1125889549, -1650600853 * var1.bm, var1 == qm.mm, 532677380);
                                       break label925;
                                    }
                                 }

                                 var1.cd = 46082101;
                              }
                           }
                        }
                     } else {
                        var1.cd = 46082101;
                     }
                  }
               } else {
                  var1.cd = 46082101;
               }
            }
         }

         if (var1.dp * 1972322021 > 0) {
            if (var3 >= 0) {
               throw new IllegalStateException();
            }

            var1.dp -= -1278914835;
         }

      } catch (RuntimeException var13) {
         throw vk.ae(var13, "qv.jr(" + ')');
      }
   }
}
