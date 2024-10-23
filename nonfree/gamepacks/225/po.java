public abstract class po {
   Object[] bx;
   int[] ay;
   int[] aw;
   wq av;
   int[] ak;
   int[] aj;
   int[] an;
   int[][] bn;
   int[][] bh;
   int as;
   wq[] bd;
   Object[][] bf;
   static vs bm = new vs();
   public int bs;
   boolean bw;
   boolean ba;
   static int bj = 0;

   public void co(byte var1) {
      try {
         for(int var2 = 0; var2 < this.bf.length; ++var2) {
            if (var1 >= 91) {
               throw new IllegalStateException();
            }

            if (null != this.bf[var2]) {
               if (var1 >= 91) {
                  throw new IllegalStateException();
               }

               for(int var3 = 0; var3 < this.bf[var2].length; ++var3) {
                  if (var1 >= 91) {
                     throw new IllegalStateException();
                  }

                  this.bf[var2][var3] = null;
               }
            }
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "po.co(" + ')');
      }
   }

   void bv(byte[] var1, int var2) {
      try {
         this.bs = dm.bl(var1, var1.length, 537493253) * 2024084307;
         vf var3 = new vf(jc.ca(var1, 1054705409));
         int var4 = var3.cv(952452697);
         if (var4 >= 5) {
            if (var2 <= 1145062404) {
               throw new IllegalStateException();
            }

            if (var4 <= 7) {
               if (var4 >= 6) {
                  if (var2 <= 1145062404) {
                     throw new IllegalStateException();
                  }

                  var3.cz(-1734056172);
               }

               int var5 = var3.cv(952452697);
               if (var4 >= 7) {
                  if (var2 <= 1145062404) {
                     throw new IllegalStateException();
                  }

                  this.as = var3.dv(1527345429) * 1258403281;
               } else {
                  this.as = var3.ct(-2137561449) * 1258403281;
               }

               int var6 = 0;
               int var7 = -1;
               this.ay = new int[this.as * -1177631951];
               int var8;
               if (var4 >= 7) {
                  if (var2 <= 1145062404) {
                     throw new IllegalStateException();
                  }

                  for(var8 = 0; var8 < -1177631951 * this.as; ++var8) {
                     if (var2 <= 1145062404) {
                        throw new IllegalStateException();
                     }

                     this.ay[var8] = var6 += var3.dv(55966584);
                     if (this.ay[var8] > var7) {
                        if (var2 <= 1145062404) {
                           throw new IllegalStateException();
                        }

                        var7 = this.ay[var8];
                     }
                  }
               } else {
                  for(var8 = 0; var8 < -1177631951 * this.as; ++var8) {
                     if (var2 <= 1145062404) {
                        throw new IllegalStateException();
                     }

                     this.ay[var8] = var6 += var3.ct(-1842916748);
                     if (this.ay[var8] > var7) {
                        if (var2 <= 1145062404) {
                           throw new IllegalStateException();
                        }

                        var7 = this.ay[var8];
                     }
                  }
               }

               this.aw = new int[1 + var7];
               this.an = new int[var7 + 1];
               this.ak = new int[var7 + 1];
               this.bn = new int[var7 + 1][];
               this.bx = new Object[var7 + 1];
               this.bf = new Object[1 + var7][];
               if (0 != var5) {
                  if (var2 <= 1145062404) {
                     throw new IllegalStateException();
                  }

                  this.aj = new int[var7 + 1];

                  for(var8 = 0; var8 < this.as * -1177631951; ++var8) {
                     if (var2 <= 1145062404) {
                        throw new IllegalStateException();
                     }

                     this.aj[this.ay[var8]] = var3.cz(-1734056172);
                  }

                  this.av = new wq(this.aj);
               }

               for(var8 = 0; var8 < -1177631951 * this.as; ++var8) {
                  if (var2 <= 1145062404) {
                     return;
                  }

                  this.aw[this.ay[var8]] = var3.cz(-1734056172);
               }

               for(var8 = 0; var8 < this.as * -1177631951; ++var8) {
                  if (var2 <= 1145062404) {
                     throw new IllegalStateException();
                  }

                  this.an[this.ay[var8]] = var3.cz(-1734056172);
               }

               for(var8 = 0; var8 < this.as * -1177631951; ++var8) {
                  if (var2 <= 1145062404) {
                     throw new IllegalStateException();
                  }

                  this.ak[this.ay[var8]] = var3.ct(-1507339636);
               }

               int var9;
               int var10;
               int var11;
               int var12;
               int var13;
               if (var4 >= 7) {
                  if (var2 <= 1145062404) {
                     throw new IllegalStateException();
                  }

                  for(var8 = 0; var8 < -1177631951 * this.as; ++var8) {
                     if (var2 <= 1145062404) {
                        return;
                     }

                     var9 = this.ay[var8];
                     var10 = this.ak[var9];
                     var6 = 0;
                     var11 = -1;
                     this.bn[var9] = new int[var10];

                     for(var12 = 0; var12 < var10; ++var12) {
                        if (var2 <= 1145062404) {
                           throw new IllegalStateException();
                        }

                        var13 = this.bn[var9][var12] = var6 += var3.dv(-1680334060);
                        if (var13 > var11) {
                           if (var2 <= 1145062404) {
                              throw new IllegalStateException();
                           }

                           var11 = var13;
                        }
                     }

                     this.bf[var9] = new Object[var11 + 1];
                  }
               } else {
                  for(var8 = 0; var8 < this.as * -1177631951; ++var8) {
                     if (var2 <= 1145062404) {
                        throw new IllegalStateException();
                     }

                     var9 = this.ay[var8];
                     var10 = this.ak[var9];
                     var6 = 0;
                     var11 = -1;
                     this.bn[var9] = new int[var10];

                     for(var12 = 0; var12 < var10; ++var12) {
                        if (var2 <= 1145062404) {
                           return;
                        }

                        var13 = this.bn[var9][var12] = var6 += var3.ct(-1343869746);
                        if (var13 > var11) {
                           if (var2 <= 1145062404) {
                              throw new IllegalStateException();
                           }

                           var11 = var13;
                        }
                     }

                     this.bf[var9] = new Object[var11 + 1];
                  }
               }

               if (var5 != 0) {
                  this.bh = new int[var7 + 1][];
                  this.bd = new wq[1 + var7];

                  for(var8 = 0; var8 < this.as * -1177631951; ++var8) {
                     if (var2 <= 1145062404) {
                        throw new IllegalStateException();
                     }

                     var9 = this.ay[var8];
                     var10 = this.ak[var9];
                     this.bh[var9] = new int[this.bf[var9].length];

                     for(var11 = 0; var11 < var10; ++var11) {
                        this.bh[var9][this.bn[var9][var11]] = var3.cz(-1734056172);
                     }

                     this.bd[var9] = new wq(this.bh[var9]);
                  }
               }

               return;
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var14) {
         throw vk.ae(var14, "po.bv(" + ')');
      }
   }

   void ag(int var1, int var2) {
      try {
         ;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "po.ag(" + ')');
      }
   }

   public byte[] bt(int var1, int var2, byte var3) {
      try {
         return this.bq(var1, var2, (int[])null, -340654635);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "po.bt(" + ')');
      }
   }

   public void cr(String var1, byte var2) {
      try {
         var1 = var1.toLowerCase();
         int var3 = this.av.ac(pm.af(var1, (byte)-74), 672732075);
         if (var3 < 0) {
            if (var2 != 64) {
               throw new IllegalStateException();
            }
         } else {
            this.ag(var3, -1085256964);
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "po.cr(" + ')');
      }
   }

   public boolean bk(int var1, int var2, byte var3) {
      try {
         if (var1 >= 0 && var1 < this.bf.length) {
            if (var3 <= 0) {
               throw new IllegalStateException();
            }

            if (this.bf[var1] != null) {
               if (var3 <= 0) {
                  throw new IllegalStateException();
               }

               if (var2 >= 0) {
                  if (var2 < this.bf[var1].length) {
                     if (this.bf[var1][var2] != null) {
                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }

                        return true;
                     }

                     if (this.bx[var1] != null) {
                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }

                        return true;
                     }

                     this.am(var1, -60358686);
                     if (this.bx[var1] != null) {
                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }

                        return true;
                     }

                     return false;
                  }

                  if (var3 <= 0) {
                     throw new IllegalStateException();
                  }
               }
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "po.bk(" + ')');
      }
   }

   public boolean be(int var1, int var2) {
      try {
         if (1 == this.bf.length) {
            if (var2 == 1298819341) {
               throw new IllegalStateException();
            } else {
               return this.bk(0, var1, (byte)17);
            }
         } else if (this.bf[var1].length == 1) {
            return this.bk(var1, 0, (byte)23);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "po.be(" + ')');
      }
   }

   public boolean bc(int var1, int var2) {
      try {
         if (null != this.bx[var1]) {
            if (var2 <= -1260450999) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            this.am(var1, -785706487);
            if (this.bx[var1] != null) {
               if (var2 <= -1260450999) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else {
               return false;
            }
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "po.bc(" + ')');
      }
   }

   public byte[] em(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.av.ac(pm.af(var1, (byte)-14), -1044244078);
      int var4 = this.bd[var3].ac(pm.af(var2, (byte)-25), 2062472413);
      return this.bt(var3, var4, (byte)-21);
   }

   int ar(int var1, int var2) {
      try {
         if (this.bx[var1] != null) {
            if (var2 != -828917415) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "po.ar(" + ')');
      }
   }

   public byte[] ch(int var1, byte var2) {
      try {
         if (this.bf.length == 1) {
            if (var2 == 16) {
               throw new IllegalStateException();
            } else {
               return this.bt(0, var1, (byte)17);
            }
         } else if (this.bf[var1].length == 1) {
            if (var2 == 16) {
               throw new IllegalStateException();
            } else {
               return this.bt(var1, 0, (byte)22);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "po.ch(" + ')');
      }
   }

   public byte[] cf(int var1, int var2, byte var3) {
      try {
         if (var1 >= 0) {
            if (var3 != 1) {
               throw new IllegalStateException();
            }

            if (var1 < this.bf.length) {
               if (var3 != 1) {
                  throw new IllegalStateException();
               }

               if (null != this.bf[var1]) {
                  if (var3 != 1) {
                     throw new IllegalStateException();
                  }

                  if (var2 >= 0) {
                     if (var3 != 1) {
                        throw new IllegalStateException();
                     }

                     if (var2 < this.bf[var1].length) {
                        if (null == this.bf[var1][var2]) {
                           if (var3 != 1) {
                              throw new IllegalStateException();
                           }

                           boolean var4 = this.cv(var1, (int[])null, 92071051);
                           if (!var4) {
                              if (var3 != 1) {
                                 throw new IllegalStateException();
                              }

                              this.am(var1, 49591265);
                              var4 = this.cv(var1, (int[])null, 1152239011);
                              if (!var4) {
                                 if (var3 != 1) {
                                    throw new IllegalStateException();
                                 }

                                 return null;
                              }
                           }
                        }

                        byte[] var6 = no.ac(this.bf[var1][var2], false, 392506714);
                        return var6;
                     }
                  }
               }
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "po.cf(" + ')');
      }
   }

   public boolean eb(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.av.ac(pm.af(var1, (byte)-91), -129621802);
      int var4 = this.bd[var3].ac(pm.af(var2, (byte)-53), 1989541101);
      return this.bk(var3, var4, (byte)47);
   }

   void am(int var1, int var2) {
      try {
         ;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "po.am(" + ')');
      }
   }

   public boolean dl(int var1, int var2) {
      if (var1 >= 0 && var1 < this.bf.length && this.bf[var1] != null && var2 >= 0 && var2 < this.bf[var1].length) {
         if (this.bf[var1][var2] != null) {
            return true;
         } else if (this.bx[var1] != null) {
            return true;
         } else {
            this.am(var1, -1840169183);
            return this.bx[var1] != null;
         }
      } else {
         return false;
      }
   }

   public int cj(int var1, byte var2) {
      try {
         if (null != this.bf) {
            if (var2 <= 8) {
               throw new IllegalStateException();
            }

            if (var1 < this.bf.length) {
               if (this.bf[var1] != null) {
                  return this.bf[var1].length;
               }

               if (var2 <= 8) {
                  throw new IllegalStateException();
               }
            }
         }

         return 0;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "po.cj(" + ')');
      }
   }

   public int cx(int var1) {
      try {
         return this.bf.length;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "po.cx(" + ')');
      }
   }

   void as(int var1) {
   }

   public void ev() {
      for(int var1 = 0; var1 < this.bf.length; ++var1) {
         if (null != this.bf[var1]) {
            for(int var2 = 0; var2 < this.bf[var1].length; ++var2) {
               this.bf[var1][var2] = null;
            }
         }
      }

   }

   public void cy(int var1, byte var2) {
      try {
         for(int var3 = 0; var3 < this.bf[var1].length; ++var3) {
            if (var2 != 16) {
               throw new IllegalStateException();
            }

            this.bf[var1][var3] = null;
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "po.cy(" + ')');
      }
   }

   boolean cv(int var1, int[] var2, int var3) {
      try {
         if (null == this.bx[var1]) {
            if (var3 == 1824038057) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            int var4 = this.ak[var1];
            int[] var5 = this.bn[var1];
            Object[] var6 = this.bf[var1];
            boolean var7 = true;

            for(int var8 = 0; var8 < var4; ++var8) {
               if (var3 == 1824038057) {
                  throw new IllegalStateException();
               }

               if (var6[var5[var8]] == null) {
                  if (var3 == 1824038057) {
                     throw new IllegalStateException();
                  }

                  var7 = false;
                  break;
               }
            }

            if (var7) {
               if (var3 == 1824038057) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else {
               byte[] var24;
               label239: {
                  if (var2 != null) {
                     label236: {
                        if (var3 == 1824038057) {
                           throw new IllegalStateException();
                        }

                        if (0 == var2[0]) {
                           if (var3 == 1824038057) {
                              throw new IllegalStateException();
                           }

                           if (var2[1] == 0) {
                              if (var3 == 1824038057) {
                                 throw new IllegalStateException();
                              }

                              if (0 == var2[2]) {
                                 if (var2[3] == 0) {
                                    break label236;
                                 }

                                 if (var3 == 1824038057) {
                                    throw new IllegalStateException();
                                 }
                              }
                           }
                        }

                        var24 = no.ac(this.bx[var1], true, -424824478);
                        vf var9 = new vf(var24);
                        var9.de(var2, 5, var9.at.length, 1752147932);
                        break label239;
                     }
                  }

                  var24 = no.ac(this.bx[var1], false, 1455574243);
               }

               byte[] var25;
               try {
                  var25 = jc.ca(var24, -942967065);
               } catch (RuntimeException var22) {
                  throw vk.ae(var22, "" + (null != var2) + "," + var1 + "," + var24.length + "," + dm.bl(var24, var24.length, 537493253) + "," + dm.bl(var24, var24.length - 2, 537493253) + "," + this.aw[var1] + "," + this.bs * 406759643);
               }

               if (this.bw) {
                  this.bx[var1] = null;
               }

               int var11;
               if (var4 > 1) {
                  if (var3 == 1824038057) {
                     throw new IllegalStateException();
                  }

                  int var10 = var25.length;
                  --var10;
                  var11 = var25[var10] & 255;
                  var10 -= 4 * var4 * var11;
                  vf var12 = new vf(var25);
                  int[] var13 = new int[var4];
                  var12.au = -1864458299 * var10;

                  int var15;
                  int var16;
                  for(int var14 = 0; var14 < var11; ++var14) {
                     if (var3 == 1824038057) {
                        throw new IllegalStateException();
                     }

                     var15 = 0;

                     for(var16 = 0; var16 < var4; ++var16) {
                        if (var3 == 1824038057) {
                           throw new IllegalStateException();
                        }

                        var15 += var12.cz(-1734056172);
                        var13[var16] += var15;
                     }
                  }

                  byte[][] var28 = new byte[var4][];

                  for(var15 = 0; var15 < var4; ++var15) {
                     if (var3 == 1824038057) {
                        throw new IllegalStateException();
                     }

                     var28[var15] = new byte[var13[var15]];
                     var13[var15] = 0;
                  }

                  var12.au = var10 * -1864458299;
                  var15 = 0;

                  int var18;
                  for(var16 = 0; var16 < var11; ++var16) {
                     int var17 = 0;

                     for(var18 = 0; var18 < var4; ++var18) {
                        var17 += var12.cz(-1734056172);
                        System.arraycopy(var25, var15, var28[var18], var13[var18], var17);
                        var13[var18] += var17;
                        var15 += var17;
                     }
                  }

                  for(var16 = 0; var16 < var4; ++var16) {
                     if (var3 == 1824038057) {
                        throw new IllegalStateException();
                     }

                     if (!this.ba) {
                        if (var3 == 1824038057) {
                           throw new IllegalStateException();
                        }

                        var18 = var5[var16];
                        byte[] var20 = var28[var16];
                        Object var19;
                        if (null == var20) {
                           if (var3 == 1824038057) {
                              throw new IllegalStateException();
                           }

                           var19 = null;
                        } else if (var20.length > 136) {
                           if (var3 == 1824038057) {
                              throw new IllegalStateException();
                           }

                           ov var21 = new ov();
                           var21.ag(var20, (byte)35);
                           var19 = var21;
                        } else {
                           var19 = var20;
                        }

                        var6[var18] = var19;
                     } else {
                        var6[var5[var16]] = var28[var16];
                     }
                  }
               } else if (!this.ba) {
                  if (var3 == 1824038057) {
                     throw new IllegalStateException();
                  }

                  var11 = var5[0];
                  Object var26;
                  if (null == var25) {
                     if (var3 == 1824038057) {
                        throw new IllegalStateException();
                     }

                     var26 = null;
                  } else if (var25.length > 136) {
                     if (var3 == 1824038057) {
                        throw new IllegalStateException();
                     }

                     ov var27 = new ov();
                     var27.ag(var25, (byte)71);
                     var26 = var27;
                  } else {
                     var26 = var25;
                  }

                  var6[var11] = var26;
               } else {
                  var6[var5[0]] = var25;
               }

               return true;
            }
         }
      } catch (RuntimeException var23) {
         throw vk.ae(var23, "po.cv(" + ')');
      }
   }

   public int cg(String var1, short var2) {
      try {
         var1 = var1.toLowerCase();
         return this.av.ac(pm.af(var1, (byte)-6), -84461742);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "po.cg(" + ')');
      }
   }

   public int[] dr(int var1) {
      return var1 >= 0 && var1 < this.bn.length ? this.bn[var1] : null;
   }

   public boolean cq(String var1, String var2, int var3) {
      try {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = this.av.ac(pm.af(var1, (byte)-120), -2015799829);
         if (var4 < 0) {
            if (var3 <= -394742794) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            int var5 = this.bd[var4].ac(pm.af(var2, (byte)-122), -604311408);
            if (var5 < 0) {
               if (var3 <= -394742794) {
                  throw new IllegalStateException();
               } else {
                  return false;
               }
            } else {
               return true;
            }
         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "po.cq(" + ')');
      }
   }

   public byte[] cc(String var1, String var2, int var3) {
      try {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = this.av.ac(pm.af(var1, (byte)-109), -956450268);
         int var5 = this.bd[var4].ac(pm.af(var2, (byte)-29), 447607422);
         return this.bt(var4, var5, (byte)-31);
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "po.cc(" + ')');
      }
   }

   public boolean cz(String var1, String var2, int var3) {
      try {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = this.av.ac(pm.af(var1, (byte)-107), 1997529980);
         int var5 = this.bd[var4].ac(pm.af(var2, (byte)-64), -856792020);
         return this.bk(var4, var5, (byte)23);
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "po.cz(" + ')');
      }
   }

   public boolean cw(String var1, byte var2) {
      try {
         var1 = var1.toLowerCase();
         int var3 = this.av.ac(pm.af(var1, (byte)-21), 417190211);
         return this.bc(var3, 1406935180);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "po.cw(" + ')');
      }
   }

   public byte[] di(int var1) {
      if (this.bf.length == 1) {
         return this.bt(0, var1, (byte)-19);
      } else if (this.bf[var1].length == 1) {
         return this.bt(var1, 0, (byte)-88);
      } else {
         throw new RuntimeException();
      }
   }

   public int cl(String var1, byte var2) {
      try {
         var1 = var1.toLowerCase();
         int var3 = this.av.ac(pm.af(var1, (byte)-34), -36008279);
         return this.ar(var3, -828917415);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "po.cl(" + ')');
      }
   }

   public boolean cn(int var1) {
      try {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.ay.length; ++var3) {
            int var4 = this.ay[var3];
            if (null == this.bx[var4]) {
               if (var1 == 853168593) {
                  throw new IllegalStateException();
               }

               this.am(var4, -1873246166);
               if (null == this.bx[var4]) {
                  if (var1 == 853168593) {
                     throw new IllegalStateException();
                  }

                  var2 = false;
               }
            }
         }

         return var2;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "po.cn(" + ')');
      }
   }

   void ay(int var1) {
   }

   public int ct(int var1, String var2, int var3) {
      try {
         var2 = var2.toLowerCase();
         return this.bd[var1].ac(pm.af(var2, (byte)-21), -1224923377);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "po.ct(" + ')');
      }
   }

   void av(int var1) {
   }

   void aw(int var1) {
   }

   int by(int var1) {
      return this.bx[var1] != null ? 100 : 0;
   }

   int bb(int var1) {
      return this.bx[var1] != null ? 100 : 0;
   }

   po(boolean var1, boolean var2) {
      try {
         super();
         this.bw = var1;
         this.ba = var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "po.<init>(" + ')');
      }
   }

   public int eu(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.bd[var1].ac(pm.af(var2, (byte)-70), -1103864250);
   }

   public int[] cm(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 == 965626186) {
               throw new IllegalStateException();
            }

            if (var1 < this.bn.length) {
               return this.bn[var1];
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "po.cm(" + ')');
      }
   }

   void cp(byte[] var1) {
      this.bs = dm.bl(var1, var1.length, 537493253) * 2024084307;
      vf var2 = new vf(jc.ca(var1, 1275549448));
      int var3 = var2.cv(952452697);
      if (var3 >= 5 && var3 <= 7) {
         if (var3 >= 6) {
            var2.cz(-1734056172);
         }

         int var4 = var2.cv(952452697);
         if (var3 >= 7) {
            this.as = var2.dv(-284941311) * 1258403281;
         } else {
            this.as = var2.ct(-2114235389) * 806457446;
         }

         int var5 = 0;
         int var6 = -1;
         this.ay = new int[this.as * -1177631951];
         int var7;
         if (var3 >= 7) {
            for(var7 = 0; var7 < -1177631951 * this.as; ++var7) {
               this.ay[var7] = var5 += var2.dv(-55348491);
               if (this.ay[var7] > var6) {
                  var6 = this.ay[var7];
               }
            }
         } else {
            for(var7 = 0; var7 < 1449557588 * this.as; ++var7) {
               this.ay[var7] = var5 += var2.ct(-1466598317);
               if (this.ay[var7] > var6) {
                  var6 = this.ay[var7];
               }
            }
         }

         this.aw = new int[1 + var6];
         this.an = new int[var6 + 1];
         this.ak = new int[var6 + 1];
         this.bn = new int[var6 + 1][];
         this.bx = new Object[var6 + 1];
         this.bf = new Object[1 + var6][];
         if (0 != var4) {
            this.aj = new int[var6 + 1];

            for(var7 = 0; var7 < this.as * -1352763189; ++var7) {
               this.aj[this.ay[var7]] = var2.cz(-1734056172);
            }

            this.av = new wq(this.aj);
         }

         for(var7 = 0; var7 < -1177631951 * this.as; ++var7) {
            this.aw[this.ay[var7]] = var2.cz(-1734056172);
         }

         for(var7 = 0; var7 < this.as * 93013511; ++var7) {
            this.an[this.ay[var7]] = var2.cz(-1734056172);
         }

         for(var7 = 0; var7 < this.as * -1177631951; ++var7) {
            this.ak[this.ay[var7]] = var2.ct(-1869826583);
         }

         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         if (var3 >= 7) {
            for(var7 = 0; var7 < 524201380 * this.as; ++var7) {
               var8 = this.ay[var7];
               var9 = this.ak[var8];
               var5 = 0;
               var10 = -1;
               this.bn[var8] = new int[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  var12 = this.bn[var8][var11] = var5 += var2.dv(18756996);
                  if (var12 > var10) {
                     var10 = var12;
                  }
               }

               this.bf[var8] = new Object[var10 + 1];
            }
         } else {
            for(var7 = 0; var7 < this.as * -1570497956; ++var7) {
               var8 = this.ay[var7];
               var9 = this.ak[var8];
               var5 = 0;
               var10 = -1;
               this.bn[var8] = new int[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  var12 = this.bn[var8][var11] = var5 += var2.ct(-1514203870);
                  if (var12 > var10) {
                     var10 = var12;
                  }
               }

               this.bf[var8] = new Object[var10 + 1];
            }
         }

         if (var4 != 0) {
            this.bh = new int[var6 + 1][];
            this.bd = new wq[1 + var6];

            for(var7 = 0; var7 < this.as * 338201739; ++var7) {
               var8 = this.ay[var7];
               var9 = this.ak[var8];
               this.bh[var8] = new int[this.bf[var8].length];

               for(var10 = 0; var10 < var9; ++var10) {
                  this.bh[var8][this.bn[var8][var10]] = var2.cz(-1734056172);
               }

               this.bd[var8] = new wq(this.bh[var8]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void cb(byte[] var1) {
      this.bs = dm.bl(var1, var1.length, 537493253) * 2024084307;
      vf var2 = new vf(jc.ca(var1, -354316390));
      int var3 = var2.cv(952452697);
      if (var3 >= 5 && var3 <= 7) {
         if (var3 >= 6) {
            var2.cz(-1734056172);
         }

         int var4 = var2.cv(952452697);
         if (var3 >= 7) {
            this.as = var2.dv(-304982032) * 1258403281;
         } else {
            this.as = var2.ct(-1677598277) * 1258403281;
         }

         int var5 = 0;
         int var6 = -1;
         this.ay = new int[this.as * -1177631951];
         int var7;
         if (var3 >= 7) {
            for(var7 = 0; var7 < -1177631951 * this.as; ++var7) {
               this.ay[var7] = var5 += var2.dv(-1863042009);
               if (this.ay[var7] > var6) {
                  var6 = this.ay[var7];
               }
            }
         } else {
            for(var7 = 0; var7 < 816296680 * this.as; ++var7) {
               this.ay[var7] = var5 += var2.ct(-1678015225);
               if (this.ay[var7] > var6) {
                  var6 = this.ay[var7];
               }
            }
         }

         this.aw = new int[1 + var6];
         this.an = new int[var6 + 1];
         this.ak = new int[var6 + 1];
         this.bn = new int[var6 + 1][];
         this.bx = new Object[var6 + 1];
         this.bf = new Object[1 + var6][];
         if (0 != var4) {
            this.aj = new int[var6 + 1];

            for(var7 = 0; var7 < this.as * -1177631951; ++var7) {
               this.aj[this.ay[var7]] = var2.cz(-1734056172);
            }

            this.av = new wq(this.aj);
         }

         for(var7 = 0; var7 < -1177631951 * this.as; ++var7) {
            this.aw[this.ay[var7]] = var2.cz(-1734056172);
         }

         for(var7 = 0; var7 < this.as * -353834765; ++var7) {
            this.an[this.ay[var7]] = var2.cz(-1734056172);
         }

         for(var7 = 0; var7 < this.as * -1183670559; ++var7) {
            this.ak[this.ay[var7]] = var2.ct(-1566143916);
         }

         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         if (var3 >= 7) {
            for(var7 = 0; var7 < 1978272961 * this.as; ++var7) {
               var8 = this.ay[var7];
               var9 = this.ak[var8];
               var5 = 0;
               var10 = -1;
               this.bn[var8] = new int[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  var12 = this.bn[var8][var11] = var5 += var2.dv(-1957613043);
                  if (var12 > var10) {
                     var10 = var12;
                  }
               }

               this.bf[var8] = new Object[var10 + 1];
            }
         } else {
            for(var7 = 0; var7 < this.as * -449567580; ++var7) {
               var8 = this.ay[var7];
               var9 = this.ak[var8];
               var5 = 0;
               var10 = -1;
               this.bn[var8] = new int[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  var12 = this.bn[var8][var11] = var5 += var2.ct(-1737917238);
                  if (var12 > var10) {
                     var10 = var12;
                  }
               }

               this.bf[var8] = new Object[var10 + 1];
            }
         }

         if (var4 != 0) {
            this.bh = new int[var6 + 1][];
            this.bd = new wq[1 + var6];

            for(var7 = 0; var7 < this.as * -1177631951; ++var7) {
               var8 = this.ay[var7];
               var9 = this.ak[var8];
               this.bh[var8] = new int[this.bf[var8].length];

               for(var10 = 0; var10 < var9; ++var10) {
                  this.bh[var8][this.bn[var8][var10]] = var2.cz(-1734056172);
               }

               this.bd[var8] = new wq(this.bh[var8]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   public byte[] cu(int var1, int var2) {
      try {
         if (1 == this.bf.length) {
            if (var2 != -366068094) {
               throw new IllegalStateException();
            } else {
               return this.cf(0, var1, (byte)1);
            }
         } else if (this.bf[var1].length == 1) {
            if (var2 != -366068094) {
               throw new IllegalStateException();
            } else {
               return this.cf(var1, 0, (byte)1);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "po.cu(" + ')');
      }
   }

   public byte[] ce(int var1, int var2) {
      return this.bq(var1, var2, (int[])null, -1561120127);
   }

   public byte[] ck(int var1, int var2) {
      return this.bq(var1, var2, (int[])null, -1927338880);
   }

   public byte[] dz(int var1) {
      if (1 == this.bf.length) {
         return this.cf(0, var1, (byte)1);
      } else if (this.bf[var1].length == 1) {
         return this.cf(var1, 0, (byte)1);
      } else {
         throw new RuntimeException();
      }
   }

   public boolean db(int var1, int var2) {
      if (var1 >= 0 && var1 < this.bf.length && this.bf[var1] != null && var2 >= 0 && var2 < this.bf[var1].length) {
         if (this.bf[var1][var2] != null) {
            return true;
         } else if (this.bx[var1] != null) {
            return true;
         } else {
            this.am(var1, -717821107);
            return this.bx[var1] != null;
         }
      } else {
         return false;
      }
   }

   public byte[] dv(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.bf.length && this.bf[var1] != null && var2 >= 0 && var2 < this.bf[var1].length) {
         if (null == this.bf[var1][var2]) {
            boolean var4 = this.cv(var1, var3, -776895265);
            if (!var4) {
               this.am(var1, -269171442);
               var4 = this.cv(var1, var3, -510765199);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = no.ac(this.bf[var1][var2], false, -2071471230);
         if (this.ba) {
            this.bf[var1][var2] = null;
         }

         return var5;
      } else {
         return null;
      }
   }

   public byte[] dt(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.bf.length && this.bf[var1] != null && var2 >= 0 && var2 < this.bf[var1].length) {
         if (null == this.bf[var1][var2]) {
            boolean var4 = this.cv(var1, var3, -1373837519);
            if (!var4) {
               this.am(var1, -630680672);
               var4 = this.cv(var1, var3, 1755066237);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = no.ac(this.bf[var1][var2], false, -5803498);
         if (this.ba) {
            this.bf[var1][var2] = null;
         }

         return var5;
      } else {
         return null;
      }
   }

   public boolean dk(int var1, int var2) {
      if (var1 >= 0 && var1 < this.bf.length && this.bf[var1] != null && var2 >= 0 && var2 < this.bf[var1].length) {
         if (this.bf[var1][var2] != null) {
            return true;
         } else if (this.bx[var1] != null) {
            return true;
         } else {
            this.am(var1, -1425988530);
            return this.bx[var1] != null;
         }
      } else {
         return false;
      }
   }

   public int ds(int var1) {
      return null != this.bf && var1 < this.bf.length && this.bf[var1] != null ? this.bf[var1].length : 0;
   }

   void cs(byte[] var1) {
      this.bs = dm.bl(var1, var1.length, 537493253) * 2024084307;
      vf var2 = new vf(jc.ca(var1, 383839483));
      int var3 = var2.cv(952452697);
      if (var3 >= 5 && var3 <= 7) {
         if (var3 >= 6) {
            var2.cz(-1734056172);
         }

         int var4 = var2.cv(952452697);
         if (var3 >= 7) {
            this.as = var2.dv(-549871841) * 1258403281;
         } else {
            this.as = var2.ct(-1357989807) * 1258403281;
         }

         int var5 = 0;
         int var6 = -1;
         this.ay = new int[this.as * -1177631951];
         int var7;
         if (var3 >= 7) {
            for(var7 = 0; var7 < -1177631951 * this.as; ++var7) {
               this.ay[var7] = var5 += var2.dv(-1121472473);
               if (this.ay[var7] > var6) {
                  var6 = this.ay[var7];
               }
            }
         } else {
            for(var7 = 0; var7 < -1177631951 * this.as; ++var7) {
               this.ay[var7] = var5 += var2.ct(-1411843283);
               if (this.ay[var7] > var6) {
                  var6 = this.ay[var7];
               }
            }
         }

         this.aw = new int[1 + var6];
         this.an = new int[var6 + 1];
         this.ak = new int[var6 + 1];
         this.bn = new int[var6 + 1][];
         this.bx = new Object[var6 + 1];
         this.bf = new Object[1 + var6][];
         if (0 != var4) {
            this.aj = new int[var6 + 1];

            for(var7 = 0; var7 < this.as * -1177631951; ++var7) {
               this.aj[this.ay[var7]] = var2.cz(-1734056172);
            }

            this.av = new wq(this.aj);
         }

         for(var7 = 0; var7 < -1177631951 * this.as; ++var7) {
            this.aw[this.ay[var7]] = var2.cz(-1734056172);
         }

         for(var7 = 0; var7 < this.as * -1177631951; ++var7) {
            this.an[this.ay[var7]] = var2.cz(-1734056172);
         }

         for(var7 = 0; var7 < this.as * -1177631951; ++var7) {
            this.ak[this.ay[var7]] = var2.ct(-1720006625);
         }

         int var8;
         int var9;
         int var10;
         int var11;
         int var12;
         if (var3 >= 7) {
            for(var7 = 0; var7 < -1177631951 * this.as; ++var7) {
               var8 = this.ay[var7];
               var9 = this.ak[var8];
               var5 = 0;
               var10 = -1;
               this.bn[var8] = new int[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  var12 = this.bn[var8][var11] = var5 += var2.dv(-175764745);
                  if (var12 > var10) {
                     var10 = var12;
                  }
               }

               this.bf[var8] = new Object[var10 + 1];
            }
         } else {
            for(var7 = 0; var7 < this.as * -1177631951; ++var7) {
               var8 = this.ay[var7];
               var9 = this.ak[var8];
               var5 = 0;
               var10 = -1;
               this.bn[var8] = new int[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  var12 = this.bn[var8][var11] = var5 += var2.ct(-1412447508);
                  if (var12 > var10) {
                     var10 = var12;
                  }
               }

               this.bf[var8] = new Object[var10 + 1];
            }
         }

         if (var4 != 0) {
            this.bh = new int[var6 + 1][];
            this.bd = new wq[1 + var6];

            for(var7 = 0; var7 < this.as * -1177631951; ++var7) {
               var8 = this.ay[var7];
               var9 = this.ak[var8];
               this.bh[var8] = new int[this.bf[var8].length];

               for(var10 = 0; var10 < var9; ++var10) {
                  this.bh[var8][this.bn[var8][var10]] = var2.cz(-1734056172);
               }

               this.bd[var8] = new wq(this.bh[var8]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   public boolean dw(int var1) {
      if (1 == this.bf.length) {
         return this.bk(0, var1, (byte)10);
      } else if (this.bf[var1].length == 1) {
         return this.bk(var1, 0, (byte)73);
      } else {
         throw new RuntimeException();
      }
   }

   void aj(int var1) {
   }

   public boolean de(int var1) {
      if (1 == this.bf.length) {
         return this.bk(0, var1, (byte)70);
      } else if (this.bf[var1].length == 1) {
         return this.bk(var1, 0, (byte)112);
      } else {
         throw new RuntimeException();
      }
   }

   public byte[] df(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.bf.length && this.bf[var1] != null && var2 >= 0 && var2 < this.bf[var1].length) {
         if (null == this.bf[var1][var2]) {
            boolean var4 = this.cv(var1, var3, -814186123);
            if (!var4) {
               this.am(var1, -1814240717);
               var4 = this.cv(var1, var3, 1181148596);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = no.ac(this.bf[var1][var2], false, -872804341);
         if (this.ba) {
            this.bf[var1][var2] = null;
         }

         return var5;
      } else {
         return null;
      }
   }

   public boolean dj(int var1) {
      if (null != this.bx[var1]) {
         return true;
      } else {
         this.am(var1, -874028305);
         return this.bx[var1] != null;
      }
   }

   public boolean do(int var1) {
      if (null != this.bx[var1]) {
         return true;
      } else {
         this.am(var1, -776461682);
         return this.bx[var1] != null;
      }
   }

   public boolean dh() {
      boolean var1 = true;

      for(int var2 = 0; var2 < this.ay.length; ++var2) {
         int var3 = this.ay[var2];
         if (null == this.bx[var3]) {
            this.am(var3, -1068971165);
            if (null == this.bx[var3]) {
               var1 = false;
            }
         }
      }

      return var1;
   }

   public boolean dm() {
      boolean var1 = true;

      for(int var2 = 0; var2 < this.ay.length; ++var2) {
         int var3 = this.ay[var2];
         if (null == this.bx[var3]) {
            this.am(var3, 184958949);
            if (null == this.bx[var3]) {
               var1 = false;
            }
         }
      }

      return var1;
   }

   public boolean dq() {
      boolean var1 = true;

      for(int var2 = 0; var2 < this.ay.length; ++var2) {
         int var3 = this.ay[var2];
         if (null == this.bx[var3]) {
            this.am(var3, 210977054);
            if (null == this.bx[var3]) {
               var1 = false;
            }
         }
      }

      return var1;
   }

   public byte[] cd(int var1, int var2) {
      return this.bq(var1, var2, (int[])null, -1200087900);
   }

   public byte[] da(int var1, int var2) {
      if (var1 >= 0 && var1 < this.bf.length && null != this.bf[var1] && var2 >= 0 && var2 < this.bf[var1].length) {
         if (null == this.bf[var1][var2]) {
            boolean var3 = this.cv(var1, (int[])null, -726225285);
            if (!var3) {
               this.am(var1, -1628159414);
               var3 = this.cv(var1, (int[])null, 374434771);
               if (!var3) {
                  return null;
               }
            }
         }

         byte[] var4 = no.ac(this.bf[var1][var2], false, 239442370);
         return var4;
      } else {
         return null;
      }
   }

   public boolean dx(int var1) {
      if (null != this.bx[var1]) {
         return true;
      } else {
         this.am(var1, -1665765339);
         return this.bx[var1] != null;
      }
   }

   public byte[] dg(int var1) {
      if (1 == this.bf.length) {
         return this.cf(0, var1, (byte)1);
      } else if (this.bf[var1].length == 1) {
         return this.cf(var1, 0, (byte)1);
      } else {
         throw new RuntimeException();
      }
   }

   public byte[] bq(int var1, int var2, int[] var3, int var4) {
      try {
         if (var1 >= 0) {
            if (var4 >= 1498673861) {
               throw new IllegalStateException();
            }

            if (var1 < this.bf.length) {
               if (var4 >= 1498673861) {
                  throw new IllegalStateException();
               }

               if (this.bf[var1] != null) {
                  if (var4 >= 1498673861) {
                     throw new IllegalStateException();
                  }

                  if (var2 >= 0) {
                     if (var4 >= 1498673861) {
                        throw new IllegalStateException();
                     }

                     if (var2 < this.bf[var1].length) {
                        if (null == this.bf[var1][var2]) {
                           if (var4 >= 1498673861) {
                              throw new IllegalStateException();
                           }

                           boolean var5 = this.cv(var1, var3, -1189176792);
                           if (!var5) {
                              this.am(var1, 509466096);
                              var5 = this.cv(var1, var3, -185887211);
                              if (!var5) {
                                 if (var4 >= 1498673861) {
                                    throw new IllegalStateException();
                                 }

                                 return null;
                              }
                           }
                        }

                        byte[] var7 = no.ac(this.bf[var1][var2], false, 1487021364);
                        if (this.ba) {
                           if (var4 >= 1498673861) {
                              throw new IllegalStateException();
                           }

                           this.bf[var1][var2] = null;
                        }

                        return var7;
                     }

                     if (var4 >= 1498673861) {
                        throw new IllegalStateException();
                     }
                  }
               }
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "po.bq(" + ')');
      }
   }

   public int[] dy(int var1) {
      return var1 >= 0 && var1 < this.bn.length ? this.bn[var1] : null;
   }

   public void ci(int var1) {
      try {
         for(int var2 = 0; var2 < this.bx.length; ++var2) {
            if (var1 >= -1650439436) {
               throw new IllegalStateException();
            }

            this.bx[var2] = null;
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "po.ci(" + ')');
      }
   }

   public byte[] dp(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.bf.length && this.bf[var1] != null && var2 >= 0 && var2 < this.bf[var1].length) {
         if (null == this.bf[var1][var2]) {
            boolean var4 = this.cv(var1, var3, 1820337815);
            if (!var4) {
               this.am(var1, 303169831);
               var4 = this.cv(var1, var3, -618891805);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = no.ac(this.bf[var1][var2], false, -1019058090);
         if (this.ba) {
            this.bf[var1][var2] = null;
         }

         return var5;
      } else {
         return null;
      }
   }

   public void ez() {
      for(int var1 = 0; var1 < this.bf.length; ++var1) {
         if (null != this.bf[var1]) {
            for(int var2 = 0; var2 < this.bf[var1].length; ++var2) {
               this.bf[var1][var2] = null;
            }
         }
      }

   }

   public int dd() {
      return this.bf.length;
   }

   public void eg() {
      for(int var1 = 0; var1 < this.bx.length; ++var1) {
         this.bx[var1] = null;
      }

   }

   public void ea() {
      for(int var1 = 0; var1 < this.bf.length; ++var1) {
         if (null != this.bf[var1]) {
            for(int var2 = 0; var2 < this.bf[var1].length; ++var2) {
               this.bf[var1][var2] = null;
            }
         }
      }

   }

   int bg(int var1) {
      return this.bx[var1] != null ? 100 : 0;
   }

   boolean ef(int var1, int[] var2) {
      if (null == this.bx[var1]) {
         return false;
      } else {
         int var3 = this.ak[var1];
         int[] var4 = this.bn[var1];
         Object[] var5 = this.bf[var1];
         boolean var6 = true;

         for(int var7 = 0; var7 < var3; ++var7) {
            if (var5[var4[var7]] == null) {
               var6 = false;
               break;
            }
         }

         if (var6) {
            return true;
         } else {
            byte[] var22;
            if (var2 != null && (0 != var2[0] || var2[1] != 0 || 0 != var2[2] || var2[3] != 0)) {
               var22 = no.ac(this.bx[var1], true, 45165428);
               vf var8 = new vf(var22);
               var8.de(var2, 5, var8.at.length, 455839952);
            } else {
               var22 = no.ac(this.bx[var1], false, 495001908);
            }

            byte[] var23;
            try {
               var23 = jc.ca(var22, -584924566);
            } catch (RuntimeException var21) {
               throw vk.ae(var21, "" + (null != var2) + "," + var1 + "," + var22.length + "," + dm.bl(var22, var22.length, 537493253) + "," + dm.bl(var22, var22.length - 2, 537493253) + "," + this.aw[var1] + "," + this.bs * 406759643);
            }

            if (this.bw) {
               this.bx[var1] = null;
            }

            int var10;
            if (var3 > 1) {
               int var9 = var23.length;
               --var9;
               var10 = var23[var9] & 255;
               var9 -= 4 * var3 * var10;
               vf var11 = new vf(var23);
               int[] var12 = new int[var3];
               var11.au = -1864458299 * var9;

               int var14;
               int var15;
               for(int var13 = 0; var13 < var10; ++var13) {
                  var14 = 0;

                  for(var15 = 0; var15 < var3; ++var15) {
                     var14 += var11.cz(-1734056172);
                     var12[var15] += var14;
                  }
               }

               byte[][] var26 = new byte[var3][];

               for(var14 = 0; var14 < var3; ++var14) {
                  var26[var14] = new byte[var12[var14]];
                  var12[var14] = 0;
               }

               var11.au = var9 * -1864458299;
               var14 = 0;

               int var17;
               for(var15 = 0; var15 < var10; ++var15) {
                  int var16 = 0;

                  for(var17 = 0; var17 < var3; ++var17) {
                     var16 += var11.cz(-1734056172);
                     System.arraycopy(var23, var14, var26[var17], var12[var17], var16);
                     var12[var17] += var16;
                     var14 += var16;
                  }
               }

               for(var15 = 0; var15 < var3; ++var15) {
                  if (!this.ba) {
                     var17 = var4[var15];
                     byte[] var19 = var26[var15];
                     Object var18;
                     if (null == var19) {
                        var18 = null;
                     } else if (var19.length > 136) {
                        ov var20 = new ov();
                        var20.ag(var19, (byte)-8);
                        var18 = var20;
                     } else {
                        var18 = var19;
                     }

                     var5[var17] = var18;
                  } else {
                     var5[var4[var15]] = var26[var15];
                  }
               }
            } else if (!this.ba) {
               var10 = var4[0];
               Object var24;
               if (null == var23) {
                  var24 = null;
               } else if (var23.length > 136) {
                  ov var25 = new ov();
                  var25.ag(var23, (byte)-3);
                  var24 = var25;
               } else {
                  var24 = var23;
               }

               var5[var10] = var24;
            } else {
               var5[var4[0]] = var23;
            }

            return true;
         }
      }
   }

   static final byte[] ed(byte[] var0) {
      vf var1 = new vf(var0);
      int var2 = var1.cv(952452697);
      int var3 = var1.cz(-1734056172);
      if (var3 < 0 || bj * -1855317615 != 0 && var3 > 1734020839 * bj) {
         throw new RuntimeException();
      } else if (0 == var2) {
         byte[] var6 = new byte[var3];
         var1.cd(var6, 0, var3, (byte)-95);
         return var6;
      } else {
         int var4 = var1.cz(-1734056172);
         if (var4 >= 0 && (-1575719400 * bj == 0 || var4 <= -1855317615 * bj)) {
            byte[] var5 = new byte[var4];
            if (var2 == 1) {
               vi.ac(var5, var4, var0, var3, 9);
            } else {
               bm.ac(var1, var5, -456869376);
            }

            return var5;
         } else {
            throw new RuntimeException();
         }
      }
   }

   boolean ew(int var1, int[] var2) {
      if (null == this.bx[var1]) {
         return false;
      } else {
         int var3 = this.ak[var1];
         int[] var4 = this.bn[var1];
         Object[] var5 = this.bf[var1];
         boolean var6 = true;

         for(int var7 = 0; var7 < var3; ++var7) {
            if (var5[var4[var7]] == null) {
               var6 = false;
               break;
            }
         }

         if (var6) {
            return true;
         } else {
            byte[] var22;
            if (var2 != null && (0 != var2[0] || var2[1] != 0 || 0 != var2[2] || var2[3] != 0)) {
               var22 = no.ac(this.bx[var1], true, -1501463697);
               vf var8 = new vf(var22);
               var8.de(var2, 5, var8.at.length, -126451325);
            } else {
               var22 = no.ac(this.bx[var1], false, 1250761773);
            }

            byte[] var23;
            try {
               var23 = jc.ca(var22, 1971996547);
            } catch (RuntimeException var21) {
               throw vk.ae(var21, "" + (null != var2) + "," + var1 + "," + var22.length + "," + dm.bl(var22, var22.length, 537493253) + "," + dm.bl(var22, var22.length - 2, 537493253) + "," + this.aw[var1] + "," + this.bs * 406759643);
            }

            if (this.bw) {
               this.bx[var1] = null;
            }

            int var10;
            if (var3 > 1) {
               int var9 = var23.length;
               --var9;
               var10 = var23[var9] & 255;
               var9 -= 4 * var3 * var10;
               vf var11 = new vf(var23);
               int[] var12 = new int[var3];
               var11.au = -1864458299 * var9;

               int var14;
               int var15;
               for(int var13 = 0; var13 < var10; ++var13) {
                  var14 = 0;

                  for(var15 = 0; var15 < var3; ++var15) {
                     var14 += var11.cz(-1734056172);
                     var12[var15] += var14;
                  }
               }

               byte[][] var26 = new byte[var3][];

               for(var14 = 0; var14 < var3; ++var14) {
                  var26[var14] = new byte[var12[var14]];
                  var12[var14] = 0;
               }

               var11.au = var9 * -1864458299;
               var14 = 0;

               int var17;
               for(var15 = 0; var15 < var10; ++var15) {
                  int var16 = 0;

                  for(var17 = 0; var17 < var3; ++var17) {
                     var16 += var11.cz(-1734056172);
                     System.arraycopy(var23, var14, var26[var17], var12[var17], var16);
                     var12[var17] += var16;
                     var14 += var16;
                  }
               }

               for(var15 = 0; var15 < var3; ++var15) {
                  if (!this.ba) {
                     var17 = var4[var15];
                     byte[] var19 = var26[var15];
                     Object var18;
                     if (null == var19) {
                        var18 = null;
                     } else if (var19.length > 136) {
                        ov var20 = new ov();
                        var20.ag(var19, (byte)77);
                        var18 = var20;
                     } else {
                        var18 = var19;
                     }

                     var5[var17] = var18;
                  } else {
                     var5[var4[var15]] = var26[var15];
                  }
               }
            } else if (!this.ba) {
               var10 = var4[0];
               Object var24;
               if (null == var23) {
                  var24 = null;
               } else if (var23.length > 136) {
                  ov var25 = new ov();
                  var25.ag(var23, (byte)30);
                  var24 = var25;
               } else {
                  var24 = var23;
               }

               var5[var10] = var24;
            } else {
               var5[var4[0]] = var23;
            }

            return true;
         }
      }
   }

   boolean ep(int var1, int[] var2) {
      if (null == this.bx[var1]) {
         return false;
      } else {
         int var3 = this.ak[var1];
         int[] var4 = this.bn[var1];
         Object[] var5 = this.bf[var1];
         boolean var6 = true;

         for(int var7 = 0; var7 < var3; ++var7) {
            if (var5[var4[var7]] == null) {
               var6 = false;
               break;
            }
         }

         if (var6) {
            return true;
         } else {
            byte[] var22;
            if (var2 != null && (0 != var2[0] || var2[1] != 0 || 0 != var2[2] || var2[3] != 0)) {
               var22 = no.ac(this.bx[var1], true, 680060690);
               vf var8 = new vf(var22);
               var8.de(var2, 5, var8.at.length, 572648216);
            } else {
               var22 = no.ac(this.bx[var1], false, -547939560);
            }

            byte[] var23;
            try {
               var23 = jc.ca(var22, 1699780969);
            } catch (RuntimeException var21) {
               throw vk.ae(var21, "" + (null != var2) + "," + var1 + "," + var22.length + "," + dm.bl(var22, var22.length, 537493253) + "," + dm.bl(var22, var22.length - 2, 537493253) + "," + this.aw[var1] + "," + this.bs * 406759643);
            }

            if (this.bw) {
               this.bx[var1] = null;
            }

            int var10;
            if (var3 > 1) {
               int var9 = var23.length;
               --var9;
               var10 = var23[var9] & 255;
               var9 -= 4 * var3 * var10;
               vf var11 = new vf(var23);
               int[] var12 = new int[var3];
               var11.au = -1864458299 * var9;

               int var14;
               int var15;
               for(int var13 = 0; var13 < var10; ++var13) {
                  var14 = 0;

                  for(var15 = 0; var15 < var3; ++var15) {
                     var14 += var11.cz(-1734056172);
                     var12[var15] += var14;
                  }
               }

               byte[][] var26 = new byte[var3][];

               for(var14 = 0; var14 < var3; ++var14) {
                  var26[var14] = new byte[var12[var14]];
                  var12[var14] = 0;
               }

               var11.au = var9 * -1864458299;
               var14 = 0;

               int var17;
               for(var15 = 0; var15 < var10; ++var15) {
                  int var16 = 0;

                  for(var17 = 0; var17 < var3; ++var17) {
                     var16 += var11.cz(-1734056172);
                     System.arraycopy(var23, var14, var26[var17], var12[var17], var16);
                     var12[var17] += var16;
                     var14 += var16;
                  }
               }

               for(var15 = 0; var15 < var3; ++var15) {
                  if (!this.ba) {
                     var17 = var4[var15];
                     byte[] var19 = var26[var15];
                     Object var18;
                     if (null == var19) {
                        var18 = null;
                     } else if (var19.length > 1377408829) {
                        ov var20 = new ov();
                        var20.ag(var19, (byte)49);
                        var18 = var20;
                     } else {
                        var18 = var19;
                     }

                     var5[var17] = var18;
                  } else {
                     var5[var4[var15]] = var26[var15];
                  }
               }
            } else if (!this.ba) {
               var10 = var4[0];
               Object var24;
               if (null == var23) {
                  var24 = null;
               } else if (var23.length > 136) {
                  ov var25 = new ov();
                  var25.ag(var23, (byte)-89);
                  var24 = var25;
               } else {
                  var24 = var23;
               }

               var5[var10] = var24;
            } else {
               var5[var4[0]] = var23;
            }

            return true;
         }
      }
   }

   public int ex(String var1) {
      var1 = var1.toLowerCase();
      return this.av.ac(pm.af(var1, (byte)-41), 269711438);
   }

   public int eh(String var1) {
      var1 = var1.toLowerCase();
      return this.av.ac(pm.af(var1, (byte)-33), 864251852);
   }

   public int du() {
      return this.bf.length;
   }

   public int ei(int var1, String var2) {
      var2 = var2.toLowerCase();
      return this.bd[var1].ac(pm.af(var2, (byte)-73), -1518202926);
   }

   public boolean dc(int var1) {
      if (1 == this.bf.length) {
         return this.bk(0, var1, (byte)17);
      } else if (this.bf[var1].length == 1) {
         return this.bk(var1, 0, (byte)78);
      } else {
         throw new RuntimeException();
      }
   }

   public byte[] el(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.av.ac(pm.af(var1, (byte)-33), -2127742061);
      int var4 = this.bd[var3].ac(pm.af(var2, (byte)-26), 1559435117);
      return this.bt(var3, var4, (byte)42);
   }

   static final byte[] eq(byte[] var0) {
      vf var1 = new vf(var0);
      int var2 = var1.cv(952452697);
      int var3 = var1.cz(-1734056172);
      if (var3 < 0 || bj * 1369965018 != 0 && var3 > -1855317615 * bj) {
         throw new RuntimeException();
      } else if (0 == var2) {
         byte[] var6 = new byte[var3];
         var1.cd(var6, 0, var3, (byte)-110);
         return var6;
      } else {
         int var4 = var1.cz(-1734056172);
         if (var4 >= 0 && (-1855317615 * bj == 0 || var4 <= -1518795269 * bj)) {
            byte[] var5 = new byte[var4];
            if (var2 == 1) {
               vi.ac(var5, var4, var0, var3, 9);
            } else {
               bm.ac(var1, var5, -611578134);
            }

            return var5;
         } else {
            throw new RuntimeException();
         }
      }
   }

   public byte[] en(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.av.ac(pm.af(var1, (byte)-77), 353356895);
      int var4 = this.bd[var3].ac(pm.af(var2, (byte)-80), -828424193);
      return this.bt(var3, var4, (byte)15);
   }

   public int dn(int var1) {
      return null != this.bf && var1 < this.bf.length && this.bf[var1] != null ? this.bf[var1].length : 0;
   }

   public boolean ek(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.av.ac(pm.af(var1, (byte)-59), 1701858060);
      int var4 = this.bd[var3].ac(pm.af(var2, (byte)-27), 583680029);
      return this.bk(var3, var4, (byte)89);
   }

   public boolean es(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.av.ac(pm.af(var1, (byte)-103), 1229291744);
      return this.bc(var2, -446097180);
   }

   public void ey(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.av.ac(pm.af(var1, (byte)-55), -1020144775);
      if (var2 >= 0) {
         this.ag(var2, -15722792);
      }
   }

   public void er(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.av.ac(pm.af(var1, (byte)-109), 1075752329);
      if (var2 >= 0) {
         this.ag(var2, -1106279129);
      }
   }

   public boolean eo(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.av.ac(pm.af(var1, (byte)-122), -1692288211);
      if (var3 < 0) {
         return false;
      } else {
         int var4 = this.bd[var3].ac(pm.af(var2, (byte)-18), 435560427);
         return var4 >= 0;
      }
   }

   static final byte[] ee(byte[] var0) {
      vf var1 = new vf(var0);
      int var2 = var1.cv(952452697);
      int var3 = var1.cz(-1734056172);
      if (var3 >= 0 && (bj * -1855317615 == 0 || var3 <= -1855317615 * bj)) {
         if (0 == var2) {
            byte[] var6 = new byte[var3];
            var1.cd(var6, 0, var3, (byte)-10);
            return var6;
         } else {
            int var4 = var1.cz(-1734056172);
            if (var4 < 0 || -1855317615 * bj != 0 && var4 > -1855317615 * bj) {
               throw new RuntimeException();
            } else {
               byte[] var5 = new byte[var4];
               if (var2 == 1) {
                  vi.ac(var5, var4, var0, var3, 9);
               } else {
                  bm.ac(var1, var5, -31424782);
               }

               return var5;
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   int bi(int var1) {
      return this.bx[var1] != null ? 100 : 0;
   }
}
