public abstract class pe {
   int[][] bh;
   int[] aa;
   int[] ax;
   we aq;
   public int bq;
   int[] av;
   int[] ah;
   static wq bb = new wq();
   int[][] bj;
   we[] bv;
   Object[] bx;
   Object[][] bk;
   static int bc = 0;
   boolean bz;
   boolean bp;
   int ac;
   int[] al;

   public boolean bw(int var1, int var2) {
      try {
         if (null != this.bx[var1]) {
            if (var2 <= 531875994) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            this.aj(var1, 1703992490);
            if (this.bx[var1] != null) {
               if (var2 <= 531875994) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else {
               return false;
            }
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "pe.bw(" + ')');
      }
   }

   public void cd(byte var1) {
      try {
         for(int var2 = 0; var2 < this.bx.length; ++var2) {
            if (var1 != 75) {
               throw new IllegalStateException();
            }

            this.bx[var2] = null;
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "pe.cd(" + ')');
      }
   }

   public boolean dc(int var1) {
      if (1 == this.bk.length) {
         return this.bd(0, var1, -2094056493);
      } else if (this.bk[var1].length == 1) {
         return this.bd(var1, 0, -2094056493);
      } else {
         throw new RuntimeException();
      }
   }

   public int em(String var1) {
      var1 = var1.toLowerCase();
      return this.aq.ap(la.am(var1, 242602398), (byte)103);
   }

   public int el(String var1) {
      var1 = var1.toLowerCase();
      return this.aq.ap(la.am(var1, 242602398), (byte)103);
   }

   public int dy() {
      return this.bk.length;
   }

   public boolean ba(int var1, int var2) {
      try {
         if (1 == this.bk.length) {
            return this.bd(0, var1, -2094056493);
         } else if (this.bk[var1].length == 1) {
            if (var2 >= -861344601) {
               throw new IllegalStateException();
            } else {
               return this.bd(var1, 0, -2094056493);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "pe.ba(" + ')');
      }
   }

   public byte[] bo(int var1, int var2, int[] var3, byte var4) {
      try {
         if (var1 >= 0) {
            if (var4 != 14) {
               throw new IllegalStateException();
            }

            if (var1 < this.bk.length) {
               if (var4 != 14) {
                  throw new IllegalStateException();
               }

               if (null != this.bk[var1]) {
                  if (var4 != 14) {
                     throw new IllegalStateException();
                  }

                  if (var2 >= 0) {
                     if (var4 != 14) {
                        throw new IllegalStateException();
                     }

                     if (var2 < this.bk[var1].length) {
                        if (this.bk[var1][var2] == null) {
                           boolean var5 = this.co(var1, var3, -409074574);
                           if (!var5) {
                              if (var4 != 14) {
                                 throw new IllegalStateException();
                              }

                              this.aj(var1, 1703992490);
                              var5 = this.co(var1, var3, -1112451648);
                              if (!var5) {
                                 if (var4 != 14) {
                                    throw new IllegalStateException();
                                 }

                                 return null;
                              }
                           }
                        }

                        byte[] var7 = oa.aw(this.bk[var1][var2], false, 1036440399);
                        if (this.bz) {
                           if (var4 != 14) {
                              throw new IllegalStateException();
                           }

                           this.bk[var1][var2] = null;
                        }

                        return var7;
                     }

                     if (var4 != 14) {
                        throw new IllegalStateException();
                     }
                  }
               }
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "pe.bo(" + ')');
      }
   }

   public boolean bi(byte var1) {
      try {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.av.length; ++var3) {
            if (var1 <= 4) {
               throw new IllegalStateException();
            }

            int var4 = this.av[var3];
            if (this.bx[var4] == null) {
               if (var1 <= 4) {
                  throw new IllegalStateException();
               }

               this.aj(var4, 1703992490);
               if (null == this.bx[var4]) {
                  if (var1 <= 4) {
                     throw new IllegalStateException();
                  }

                  var2 = false;
               }
            }
         }

         return var2;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "pe.bi(" + ')');
      }
   }

   int at(int var1, byte var2) {
      try {
         return null != this.bx[var1] ? 100 : 0;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "pe.at(" + ')');
      }
   }

   boolean co(int var1, int[] var2, int var3) {
      try {
         if (null == this.bx[var1]) {
            if (var3 == -1934022711) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            int var4 = this.ah[var1];
            int[] var5 = this.bh[var1];
            Object[] var6 = this.bk[var1];
            boolean var7 = true;

            for(int var8 = 0; var8 < var4; ++var8) {
               if (var3 == -1934022711) {
                  throw new IllegalStateException();
               }

               if (null == var6[var5[var8]]) {
                  var7 = false;
                  break;
               }
            }

            if (var7) {
               return true;
            } else {
               byte[] var21;
               label187: {
                  label186: {
                     if (var2 != null) {
                        if (var3 == -1934022711) {
                           throw new IllegalStateException();
                        }

                        if (var2[0] != 0) {
                           break label186;
                        }

                        if (var3 == -1934022711) {
                           throw new IllegalStateException();
                        }

                        if (var2[1] != 0) {
                           break label186;
                        }

                        if (var3 == -1934022711) {
                           throw new IllegalStateException();
                        }

                        if (0 != var2[2]) {
                           break label186;
                        }

                        if (var3 == -1934022711) {
                           throw new IllegalStateException();
                        }

                        if (0 != var2[3]) {
                           if (var3 == -1934022711) {
                              throw new IllegalStateException();
                           }
                           break label186;
                        }
                     }

                     var21 = oa.aw(this.bx[var1], false, -815646972);
                     break label187;
                  }

                  var21 = oa.aw(this.bx[var1], true, -142329302);
                  vl var9 = new vl(var21);
                  var9.dl(var2, 5, var9.ae.length, (short)-11183);
               }

               int var14;
               int var17;
               int var18;
               byte[] var22;
               try {
                  var22 = mp.cx(var21, 31873403);
               } catch (RuntimeException var19) {
                  StringBuilder var10000 = (new StringBuilder()).append("");
                  boolean var10001;
                  if (var2 != null) {
                     if (var3 == -1934022711) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  String var12 = var10000.append(var10001).append(",").append(var1).append(",").append(var21.length).append(",").toString();
                  var14 = var21.length;
                  int var13 = hx.bs(var21, 0, var14, 1026322554);
                  String var16 = var12 + var13 + ",";
                  var18 = var21.length - 2;
                  var17 = hx.bs(var21, 0, var18, 641446855);
                  throw tm.aw(var19, var16 + var17 + "," + this.al[var1] + "," + -417265355 * this.bq);
               }

               if (this.bp) {
                  if (var3 == -1934022711) {
                     throw new IllegalStateException();
                  }

                  this.bx[var1] = null;
               }

               if (var4 > 1) {
                  if (var3 == -1934022711) {
                     throw new IllegalStateException();
                  }

                  int var10 = var22.length;
                  --var10;
                  int var11 = var22[var10] & 255;
                  var10 -= 4 * var4 * var11;
                  vl var23 = new vl(var22);
                  int[] var24 = new int[var4];
                  var23.am = var10 * -725588083;

                  int var15;
                  int var26;
                  for(var14 = 0; var14 < var11; ++var14) {
                     if (var3 == -1934022711) {
                        throw new IllegalStateException();
                     }

                     var15 = 0;

                     for(var26 = 0; var26 < var4; ++var26) {
                        if (var3 == -1934022711) {
                           throw new IllegalStateException();
                        }

                        var15 += var23.ch(1203709469);
                        var24[var26] += var15;
                     }
                  }

                  byte[][] var25 = new byte[var4][];

                  for(var15 = 0; var15 < var4; ++var15) {
                     if (var3 == -1934022711) {
                        throw new IllegalStateException();
                     }

                     var25[var15] = new byte[var24[var15]];
                     var24[var15] = 0;
                  }

                  var23.am = var10 * -725588083;
                  var15 = 0;

                  for(var26 = 0; var26 < var11; ++var26) {
                     if (var3 == -1934022711) {
                        throw new IllegalStateException();
                     }

                     var17 = 0;

                     for(var18 = 0; var18 < var4; ++var18) {
                        if (var3 == -1934022711) {
                           throw new IllegalStateException();
                        }

                        var17 += var23.ch(1203709469);
                        System.arraycopy(var22, var15, var25[var18], var24[var18], var17);
                        var24[var18] += var17;
                        var15 += var17;
                     }
                  }

                  for(var26 = 0; var26 < var4; ++var26) {
                     if (var3 == -1934022711) {
                        throw new IllegalStateException();
                     }

                     if (!this.bz) {
                        var6[var5[var26]] = ke.ap(var25[var26], false, -884077764);
                     } else {
                        var6[var5[var26]] = var25[var26];
                     }
                  }
               } else if (!this.bz) {
                  if (var3 == -1934022711) {
                     throw new IllegalStateException();
                  }

                  var6[var5[0]] = ke.ap(var22, false, -496454888);
               } else {
                  var6[var5[0]] = var22;
               }

               return true;
            }
         }
      } catch (RuntimeException var20) {
         throw tm.aw(var20, "pe.co(" + ')');
      }
   }

   public byte[] bg(int var1, int var2, int var3) {
      try {
         if (var1 >= 0) {
            if (var3 <= -1351854164) {
               throw new IllegalStateException();
            }

            if (var1 < this.bk.length) {
               if (var3 <= -1351854164) {
                  throw new IllegalStateException();
               }

               if (this.bk[var1] != null) {
                  if (var3 <= -1351854164) {
                     throw new IllegalStateException();
                  }

                  if (var2 >= 0) {
                     if (var2 < this.bk[var1].length) {
                        if (this.bk[var1][var2] == null) {
                           if (var3 <= -1351854164) {
                              throw new IllegalStateException();
                           }

                           boolean var4 = this.co(var1, (int[])null, -999933762);
                           if (!var4) {
                              if (var3 <= -1351854164) {
                                 throw new IllegalStateException();
                              }

                              this.aj(var1, 1703992490);
                              var4 = this.co(var1, (int[])null, -681838430);
                              if (!var4) {
                                 if (var3 <= -1351854164) {
                                    throw new IllegalStateException();
                                 }

                                 return null;
                              }
                           }
                        }

                        byte[] var6 = oa.aw(this.bk[var1][var2], false, 1487764363);
                        return var6;
                     }

                     if (var3 <= -1351854164) {
                        throw new IllegalStateException();
                     }
                  }
               }
            }
         }

         return null;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "pe.bg(" + ')');
      }
   }

   void cc(byte[] var1) {
      int var3 = var1.length;
      int var2 = hx.bs(var1, 0, var3, 1218884831);
      this.bq = 2133704989 * var2;
      vl var4 = new vl(mp.cx(var1, 31873403));
      int var5 = var4.cy((short)-2639);
      if (var5 >= 5 && var5 <= 7) {
         if (var5 >= 6) {
            var4.ch(1203709469);
         }

         int var6 = var4.cy((short)-17632);
         if (var5 >= 7) {
            this.ac = var4.da(661190311) * -502664173;
         } else {
            this.ac = var4.ce(989585137) * 1309144583;
         }

         int var7 = 0;
         int var8 = -1;
         this.av = new int[this.ac * -683245757];
         int var9;
         if (var5 >= 7) {
            for(var9 = 0; var9 < this.ac * -116132325; ++var9) {
               this.av[var9] = var7 += var4.da(1339312613);
               if (this.av[var9] > var8) {
                  var8 = this.av[var9];
               }
            }
         } else {
            for(var9 = 0; var9 < this.ac * -116132325; ++var9) {
               this.av[var9] = var7 += var4.ce(1743000242);
               if (this.av[var9] > var8) {
                  var8 = this.av[var9];
               }
            }
         }

         this.al = new int[var8 + 1];
         this.aa = new int[1 + var8];
         this.ah = new int[1 + var8];
         this.bh = new int[1 + var8][];
         this.bx = new Object[var8 + 1];
         this.bk = new Object[var8 + 1][];
         if (0 != var6) {
            this.ax = new int[var8 + 1];

            for(var9 = 0; var9 < -116132325 * this.ac; ++var9) {
               this.ax[this.av[var9]] = var4.ch(1203709469);
            }

            this.aq = new we(this.ax);
         }

         for(var9 = 0; var9 < 505720803 * this.ac; ++var9) {
            this.al[this.av[var9]] = var4.ch(1203709469);
         }

         for(var9 = 0; var9 < -120054580 * this.ac; ++var9) {
            this.aa[this.av[var9]] = var4.ch(1203709469);
         }

         for(var9 = 0; var9 < this.ac * 487996478; ++var9) {
            this.ah[this.av[var9]] = var4.ce(7859571);
         }

         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         if (var5 >= 7) {
            for(var9 = 0; var9 < this.ac * -1369375555; ++var9) {
               var10 = this.av[var9];
               var11 = this.ah[var10];
               var7 = 0;
               var12 = -1;
               this.bh[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.bh[var10][var13] = var7 += var4.da(-715534529);
                  if (var14 > var12) {
                     var12 = var14;
                  }
               }

               this.bk[var10] = new Object[var12 + 1];
            }
         } else {
            for(var9 = 0; var9 < 1685252807 * this.ac; ++var9) {
               var10 = this.av[var9];
               var11 = this.ah[var10];
               var7 = 0;
               var12 = -1;
               this.bh[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.bh[var10][var13] = var7 += var4.ce(361716420);
                  if (var14 > var12) {
                     var12 = var14;
                  }
               }

               this.bk[var10] = new Object[var12 + 1];
            }
         }

         if (var6 != 0) {
            this.bj = new int[var8 + 1][];
            this.bv = new we[1 + var8];

            for(var9 = 0; var9 < -116132325 * this.ac; ++var9) {
               var10 = this.av[var9];
               var11 = this.ah[var10];
               this.bj[var10] = new int[this.bk[var10].length];

               for(var12 = 0; var12 < var11; ++var12) {
                  this.bj[var10][this.bh[var10][var12]] = var4.ch(1203709469);
               }

               this.bv[var10] = new we(this.bj[var10]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void aj(int var1, int var2) {
      try {
         ;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "pe.aj(" + ')');
      }
   }

   public int[] be(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 <= 913798729) {
               throw new IllegalStateException();
            }

            if (var1 < this.bh.length) {
               return this.bh[var1];
            }
         }

         return null;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "pe.be(" + ')');
      }
   }

   public int cq(int var1, int var2) {
      try {
         if (null != this.bk) {
            if (var2 <= 329263488) {
               throw new IllegalStateException();
            }

            if (var1 < this.bk.length) {
               if (var2 <= 329263488) {
                  throw new IllegalStateException();
               }

               if (this.bk[var1] != null) {
                  return this.bk[var1].length;
               }

               if (var2 <= 329263488) {
                  throw new IllegalStateException();
               }
            }
         }

         return 0;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "pe.cq(" + ')');
      }
   }

   public byte[] ei(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.aq.ap(la.am(var1, 242602398), (byte)103);
      int var4 = this.bv[var3].ap(la.am(var2, 242602398), (byte)103);
      return this.bm(var3, var4, 1575811016);
   }

   public void ez() {
      for(int var1 = 0; var1 < this.bk.length; ++var1) {
         if (null != this.bk[var1]) {
            for(int var2 = 0; var2 < this.bk[var1].length; ++var2) {
               this.bk[var1][var2] = null;
            }
         }
      }

   }

   public void ci(int var1, byte var2) {
      try {
         for(int var3 = 0; var3 < this.bk[var1].length; ++var3) {
            this.bk[var1][var3] = null;
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "pe.ci(" + ')');
      }
   }

   public void cn(int var1) {
      try {
         for(int var2 = 0; var2 < this.bk.length; ++var2) {
            if (var1 <= 6710886) {
               return;
            }

            if (null != this.bk[var2]) {
               for(int var3 = 0; var3 < this.bk[var2].length; ++var3) {
                  if (var1 <= 6710886) {
                     throw new IllegalStateException();
                  }

                  this.bk[var2][var3] = null;
               }
            }
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "pe.cn(" + ')');
      }
   }

   public byte[] bm(int var1, int var2, int var3) {
      try {
         return this.bo(var1, var2, (int[])null, (byte)14);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "pe.bm(" + ')');
      }
   }

   public int cf(String var1, byte var2) {
      try {
         var1 = var1.toLowerCase();
         return this.aq.ap(la.am(var1, 242602398), (byte)103);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "pe.cf(" + ')');
      }
   }

   public byte[] cs(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.bk.length && null != this.bk[var1] && var2 >= 0 && var2 < this.bk[var1].length) {
         if (this.bk[var1][var2] == null) {
            boolean var4 = this.co(var1, var3, -1573704627);
            if (!var4) {
               this.aj(var1, 1703992490);
               var4 = this.co(var1, var3, -454848006);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = oa.aw(this.bk[var1][var2], false, -1435054300);
         if (this.bz) {
            this.bk[var1][var2] = null;
         }

         return var5;
      } else {
         return null;
      }
   }

   public boolean cp(String var1, String var2, int var3) {
      try {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = this.aq.ap(la.am(var1, 242602398), (byte)103);
         if (var4 < 0) {
            if (var3 != -637561867) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            int var5 = this.bv[var4].ap(la.am(var2, 242602398), (byte)103);
            if (var5 < 0) {
               if (var3 != -637561867) {
                  throw new IllegalStateException();
               } else {
                  return false;
               }
            } else {
               return true;
            }
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "pe.cp(" + ')');
      }
   }

   public byte[] cv(String var1, String var2, int var3) {
      try {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = this.aq.ap(la.am(var1, 242602398), (byte)103);
         int var5 = this.bv[var4].ap(la.am(var2, 242602398), (byte)103);
         return this.bm(var4, var5, 1558450455);
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "pe.cv(" + ')');
      }
   }

   public boolean cy(String var1, String var2, int var3) {
      try {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = this.aq.ap(la.am(var1, 242602398), (byte)103);
         int var5 = this.bv[var4].ap(la.am(var2, 242602398), (byte)103);
         return this.bd(var4, var5, -2094056493);
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "pe.cy(" + ')');
      }
   }

   public boolean cu(String var1, short var2) {
      try {
         var1 = var1.toLowerCase();
         int var3 = this.aq.ap(la.am(var1, 242602398), (byte)103);
         return this.bw(var3, 1171613771);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "pe.cu(" + ')');
      }
   }

   public void ce(String var1, byte var2) {
      try {
         var1 = var1.toLowerCase();
         int var3 = this.aq.ap(la.am(var1, 242602398), (byte)103);
         if (var3 >= 0) {
            this.ak(var3, -1326361047);
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "pe.ce(" + ')');
      }
   }

   public int cg(String var1, int var2) {
      try {
         var1 = var1.toLowerCase();
         int var3 = this.aq.ap(la.am(var1, 242602398), (byte)103);
         return this.at(var3, (byte)20);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "pe.cg(" + ')');
      }
   }

   void ag(int var1) {
   }

   public byte[] du(int var1, int var2) {
      if (var1 >= 0 && var1 < this.bk.length && this.bk[var1] != null && var2 >= 0 && var2 < this.bk[var1].length) {
         if (this.bk[var1][var2] == null) {
            boolean var3 = this.co(var1, (int[])null, 2020597948);
            if (!var3) {
               this.aj(var1, 1703992490);
               var3 = this.co(var1, (int[])null, 1035043534);
               if (!var3) {
                  return null;
               }
            }
         }

         byte[] var4 = oa.aw(this.bk[var1][var2], false, -1267608560);
         return var4;
      } else {
         return null;
      }
   }

   void ac(int var1) {
   }

   void av(int var1) {
   }

   int bq(int var1) {
      return null != this.bx[var1] ? 100 : 0;
   }

   public int[] ds(int var1) {
      return var1 >= 0 && var1 < this.bh.length ? this.bh[var1] : null;
   }

   void cz(byte[] var1) {
      int var3 = var1.length;
      int var2 = hx.bs(var1, 0, var3, 699752118);
      this.bq = 2133704989 * var2;
      vl var4 = new vl(mp.cx(var1, 31873403));
      int var5 = var4.cy((short)-16045);
      if (var5 >= 5 && var5 <= 7) {
         if (var5 >= 6) {
            var4.ch(1203709469);
         }

         int var6 = var4.cy((short)-3059);
         if (var5 >= 7) {
            this.ac = var4.da(1868042043) * -502664173;
         } else {
            this.ac = var4.ce(1365951460) * -502664173;
         }

         int var7 = 0;
         int var8 = -1;
         this.av = new int[this.ac * -116132325];
         int var9;
         if (var5 >= 7) {
            for(var9 = 0; var9 < this.ac * -116132325; ++var9) {
               this.av[var9] = var7 += var4.da(-622581698);
               if (this.av[var9] > var8) {
                  var8 = this.av[var9];
               }
            }
         } else {
            for(var9 = 0; var9 < this.ac * -116132325; ++var9) {
               this.av[var9] = var7 += var4.ce(2138054471);
               if (this.av[var9] > var8) {
                  var8 = this.av[var9];
               }
            }
         }

         this.al = new int[var8 + 1];
         this.aa = new int[1 + var8];
         this.ah = new int[1 + var8];
         this.bh = new int[1 + var8][];
         this.bx = new Object[var8 + 1];
         this.bk = new Object[var8 + 1][];
         if (0 != var6) {
            this.ax = new int[var8 + 1];

            for(var9 = 0; var9 < -103904760 * this.ac; ++var9) {
               this.ax[this.av[var9]] = var4.ch(1203709469);
            }

            this.aq = new we(this.ax);
         }

         for(var9 = 0; var9 < -116132325 * this.ac; ++var9) {
            this.al[this.av[var9]] = var4.ch(1203709469);
         }

         for(var9 = 0; var9 < -116132325 * this.ac; ++var9) {
            this.aa[this.av[var9]] = var4.ch(1203709469);
         }

         for(var9 = 0; var9 < this.ac * -116132325; ++var9) {
            this.ah[this.av[var9]] = var4.ce(1126360543);
         }

         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         if (var5 >= 7) {
            for(var9 = 0; var9 < this.ac * -116132325; ++var9) {
               var10 = this.av[var9];
               var11 = this.ah[var10];
               var7 = 0;
               var12 = -1;
               this.bh[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.bh[var10][var13] = var7 += var4.da(-1499846139);
                  if (var14 > var12) {
                     var12 = var14;
                  }
               }

               this.bk[var10] = new Object[var12 + 1];
            }
         } else {
            for(var9 = 0; var9 < 1091108920 * this.ac; ++var9) {
               var10 = this.av[var9];
               var11 = this.ah[var10];
               var7 = 0;
               var12 = -1;
               this.bh[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.bh[var10][var13] = var7 += var4.ce(1501903522);
                  if (var14 > var12) {
                     var12 = var14;
                  }
               }

               this.bk[var10] = new Object[var12 + 1];
            }
         }

         if (var6 != 0) {
            this.bj = new int[var8 + 1][];
            this.bv = new we[1 + var8];

            for(var9 = 0; var9 < -116132325 * this.ac; ++var9) {
               var10 = this.av[var9];
               var11 = this.ah[var10];
               this.bj[var10] = new int[this.bk[var10].length];

               for(var12 = 0; var12 < var11; ++var12) {
                  this.bj[var10][this.bh[var10][var12]] = var4.ch(1203709469);
               }

               this.bv[var10] = new we(this.bj[var10]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void ch(byte[] var1) {
      int var3 = var1.length;
      int var2 = hx.bs(var1, 0, var3, 1969749440);
      this.bq = 2133704989 * var2;
      vl var4 = new vl(mp.cx(var1, 31873403));
      int var5 = var4.cy((short)-23032);
      if (var5 >= 5 && var5 <= 7) {
         if (var5 >= 6) {
            var4.ch(1203709469);
         }

         int var6 = var4.cy((short)-22624);
         if (var5 >= 7) {
            this.ac = var4.da(-350821284) * -502664173;
         } else {
            this.ac = var4.ce(1535376458) * 1867484297;
         }

         int var7 = 0;
         int var8 = -1;
         this.av = new int[this.ac * -1742416625];
         int var9;
         if (var5 >= 7) {
            for(var9 = 0; var9 < this.ac * -116132325; ++var9) {
               this.av[var9] = var7 += var4.da(-1507374004);
               if (this.av[var9] > var8) {
                  var8 = this.av[var9];
               }
            }
         } else {
            for(var9 = 0; var9 < this.ac * -116132325; ++var9) {
               this.av[var9] = var7 += var4.ce(764074841);
               if (this.av[var9] > var8) {
                  var8 = this.av[var9];
               }
            }
         }

         this.al = new int[var8 + 1];
         this.aa = new int[1 + var8];
         this.ah = new int[1 + var8];
         this.bh = new int[1 + var8][];
         this.bx = new Object[var8 + 1];
         this.bk = new Object[var8 + 1][];
         if (0 != var6) {
            this.ax = new int[var8 + 1];

            for(var9 = 0; var9 < -116132325 * this.ac; ++var9) {
               this.ax[this.av[var9]] = var4.ch(1203709469);
            }

            this.aq = new we(this.ax);
         }

         for(var9 = 0; var9 < -300850874 * this.ac; ++var9) {
            this.al[this.av[var9]] = var4.ch(1203709469);
         }

         for(var9 = 0; var9 < -2100498290 * this.ac; ++var9) {
            this.aa[this.av[var9]] = var4.ch(1203709469);
         }

         for(var9 = 0; var9 < this.ac * -1369795640; ++var9) {
            this.ah[this.av[var9]] = var4.ce(852278390);
         }

         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         if (var5 >= 7) {
            for(var9 = 0; var9 < this.ac * -887640717; ++var9) {
               var10 = this.av[var9];
               var11 = this.ah[var10];
               var7 = 0;
               var12 = -1;
               this.bh[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.bh[var10][var13] = var7 += var4.da(-1889406998);
                  if (var14 > var12) {
                     var12 = var14;
                  }
               }

               this.bk[var10] = new Object[var12 + 1];
            }
         } else {
            for(var9 = 0; var9 < -116132325 * this.ac; ++var9) {
               var10 = this.av[var9];
               var11 = this.ah[var10];
               var7 = 0;
               var12 = -1;
               this.bh[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.bh[var10][var13] = var7 += var4.ce(1864644095);
                  if (var14 > var12) {
                     var12 = var14;
                  }
               }

               this.bk[var10] = new Object[var12 + 1];
            }
         }

         if (var6 != 0) {
            this.bj = new int[var8 + 1][];
            this.bv = new we[1 + var8];

            for(var9 = 0; var9 < -116132325 * this.ac; ++var9) {
               var10 = this.av[var9];
               var11 = this.ah[var10];
               this.bj[var10] = new int[this.bk[var10].length];

               for(var12 = 0; var12 < var11; ++var12) {
                  this.bj[var10][this.bh[var10][var12]] = var4.ch(1203709469);
               }

               this.bv[var10] = new we(this.bj[var10]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void ct(byte[] var1) {
      int var3 = var1.length;
      int var2 = hx.bs(var1, 0, var3, 1181570906);
      this.bq = -683931383 * var2;
      vl var4 = new vl(mp.cx(var1, 31873403));
      int var5 = var4.cy((short)-9275);
      if (var5 >= 5 && var5 <= 7) {
         if (var5 >= 6) {
            var4.ch(1203709469);
         }

         int var6 = var4.cy((short)-8003);
         if (var5 >= 7) {
            this.ac = var4.da(-1165119313) * -502664173;
         } else {
            this.ac = var4.ce(1090027331) * 1235618028;
         }

         int var7 = 0;
         int var8 = -1;
         this.av = new int[this.ac * -116132325];
         int var9;
         if (var5 >= 7) {
            for(var9 = 0; var9 < this.ac * -917641622; ++var9) {
               this.av[var9] = var7 += var4.da(-377777673);
               if (this.av[var9] > var8) {
                  var8 = this.av[var9];
               }
            }
         } else {
            for(var9 = 0; var9 < this.ac * -392961138; ++var9) {
               this.av[var9] = var7 += var4.ce(197704769);
               if (this.av[var9] > var8) {
                  var8 = this.av[var9];
               }
            }
         }

         this.al = new int[var8 + 1];
         this.aa = new int[1 + var8];
         this.ah = new int[1 + var8];
         this.bh = new int[1 + var8][];
         this.bx = new Object[var8 + 1];
         this.bk = new Object[var8 + 1][];
         if (0 != var6) {
            this.ax = new int[var8 + 1];

            for(var9 = 0; var9 < -1988337073 * this.ac; ++var9) {
               this.ax[this.av[var9]] = var4.ch(1203709469);
            }

            this.aq = new we(this.ax);
         }

         for(var9 = 0; var9 < -116132325 * this.ac; ++var9) {
            this.al[this.av[var9]] = var4.ch(1203709469);
         }

         for(var9 = 0; var9 < -116132325 * this.ac; ++var9) {
            this.aa[this.av[var9]] = var4.ch(1203709469);
         }

         for(var9 = 0; var9 < this.ac * -337298456; ++var9) {
            this.ah[this.av[var9]] = var4.ce(1464383665);
         }

         int var10;
         int var11;
         int var12;
         int var13;
         int var14;
         if (var5 >= 7) {
            for(var9 = 0; var9 < this.ac * -116132325; ++var9) {
               var10 = this.av[var9];
               var11 = this.ah[var10];
               var7 = 0;
               var12 = -1;
               this.bh[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.bh[var10][var13] = var7 += var4.da(811414071);
                  if (var14 > var12) {
                     var12 = var14;
                  }
               }

               this.bk[var10] = new Object[var12 + 1];
            }
         } else {
            for(var9 = 0; var9 < -116132325 * this.ac; ++var9) {
               var10 = this.av[var9];
               var11 = this.ah[var10];
               var7 = 0;
               var12 = -1;
               this.bh[var10] = new int[var11];

               for(var13 = 0; var13 < var11; ++var13) {
                  var14 = this.bh[var10][var13] = var7 += var4.ce(1151717436);
                  if (var14 > var12) {
                     var12 = var14;
                  }
               }

               this.bk[var10] = new Object[var12 + 1];
            }
         }

         if (var6 != 0) {
            this.bj = new int[var8 + 1][];
            this.bv = new we[1 + var8];

            for(var9 = 0; var9 < 1611921024 * this.ac; ++var9) {
               var10 = this.av[var9];
               var11 = this.ah[var10];
               this.bj[var10] = new int[this.bk[var10].length];

               for(var12 = 0; var12 < var11; ++var12) {
                  this.bj[var10][this.bh[var10][var12]] = var4.ch(1203709469);
               }

               this.bv[var10] = new we(this.bj[var10]);
            }
         }

      } else {
         throw new RuntimeException("");
      }
   }

   int bp(int var1) {
      return null != this.bx[var1] ? 1746655602 : 0;
   }

   public boolean bd(int var1, int var2, int var3) {
      try {
         if (var1 >= 0) {
            if (var3 != -2094056493) {
               throw new IllegalStateException();
            }

            if (var1 < this.bk.length) {
               if (var3 != -2094056493) {
                  throw new IllegalStateException();
               }

               if (this.bk[var1] != null) {
                  if (var3 != -2094056493) {
                     throw new IllegalStateException();
                  }

                  if (var2 >= 0) {
                     if (var3 != -2094056493) {
                        throw new IllegalStateException();
                     }

                     if (var2 < this.bk[var1].length) {
                        if (this.bk[var1][var2] != null) {
                           if (var3 != -2094056493) {
                              throw new IllegalStateException();
                           }

                           return true;
                        }

                        if (null != this.bx[var1]) {
                           if (var3 != -2094056493) {
                              throw new IllegalStateException();
                           }

                           return true;
                        }

                        this.aj(var1, 1703992490);
                        if (null != this.bx[var1]) {
                           if (var3 != -2094056493) {
                              throw new IllegalStateException();
                           }

                           return true;
                        }

                        return false;
                     }

                     if (var3 != -2094056493) {
                        throw new IllegalStateException();
                     }
                  }
               }
            }
         }

         return false;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "pe.bd(" + ')');
      }
   }

   public byte[] cm(int var1, int var2) {
      return this.bo(var1, var2, (int[])null, (byte)14);
   }

   public byte[] cw(int var1, int var2) {
      return this.bo(var1, var2, (int[])null, (byte)14);
   }

   public byte[] ca(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.bk.length && null != this.bk[var1] && var2 >= 0 && var2 < this.bk[var1].length) {
         if (this.bk[var1][var2] == null) {
            boolean var4 = this.co(var1, var3, 1654081048);
            if (!var4) {
               this.aj(var1, 1703992490);
               var4 = this.co(var1, var3, -223864610);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = oa.aw(this.bk[var1][var2], false, -1286864324);
         if (this.bz) {
            this.bk[var1][var2] = null;
         }

         return var5;
      } else {
         return null;
      }
   }

   boolean er(int var1, int[] var2) {
      if (null == this.bx[var1]) {
         return false;
      } else {
         int var3 = this.ah[var1];
         int[] var4 = this.bh[var1];
         Object[] var5 = this.bk[var1];
         boolean var6 = true;

         for(int var7 = 0; var7 < var3; ++var7) {
            if (null == var5[var4[var7]]) {
               var6 = false;
               break;
            }
         }

         if (var6) {
            return true;
         } else {
            byte[] var19;
            if (var2 != null && (var2[0] != 0 || var2[1] != 0 || 0 != var2[2] || 0 != var2[3])) {
               var19 = oa.aw(this.bx[var1], true, 1236175762);
               vl var8 = new vl(var19);
               var8.dl(var2, 5, var8.ae.length, (short)11051);
            } else {
               var19 = oa.aw(this.bx[var1], false, 531940162);
            }

            int var13;
            int var16;
            int var17;
            byte[] var20;
            try {
               var20 = mp.cx(var19, 31873403);
            } catch (RuntimeException var18) {
               String var11 = "" + (var2 != null) + "," + var1 + "," + var19.length + ",";
               var13 = var19.length;
               int var12 = hx.bs(var19, 0, var13, -90613649);
               String var15 = var11 + var12 + ",";
               var17 = var19.length - 2;
               var16 = hx.bs(var19, 0, var17, 1205909185);
               throw tm.aw(var18, var15 + var16 + "," + this.al[var1] + "," + -417265355 * this.bq);
            }

            if (this.bp) {
               this.bx[var1] = null;
            }

            if (var3 > 1) {
               int var9 = var20.length;
               --var9;
               int var10 = var20[var9] & -1100142219;
               var9 -= 4 * var3 * var10;
               vl var21 = new vl(var20);
               int[] var22 = new int[var3];
               var21.am = var9 * -725588083;

               int var14;
               int var24;
               for(var13 = 0; var13 < var10; ++var13) {
                  var14 = 0;

                  for(var24 = 0; var24 < var3; ++var24) {
                     var14 += var21.ch(1203709469);
                     var22[var24] += var14;
                  }
               }

               byte[][] var23 = new byte[var3][];

               for(var14 = 0; var14 < var3; ++var14) {
                  var23[var14] = new byte[var22[var14]];
                  var22[var14] = 0;
               }

               var21.am = var9 * 1845525580;
               var14 = 0;

               for(var24 = 0; var24 < var10; ++var24) {
                  var16 = 0;

                  for(var17 = 0; var17 < var3; ++var17) {
                     var16 += var21.ch(1203709469);
                     System.arraycopy(var20, var14, var23[var17], var22[var17], var16);
                     var22[var17] += var16;
                     var14 += var16;
                  }
               }

               for(var24 = 0; var24 < var3; ++var24) {
                  if (!this.bz) {
                     var5[var4[var24]] = ke.ap(var23[var24], false, -1340885628);
                  } else {
                     var5[var4[var24]] = var23[var24];
                  }
               }
            } else if (!this.bz) {
               var5[var4[0]] = ke.ap(var20, false, 1306793625);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   public byte[] cr(int var1, int var2, int[] var3) {
      if (var1 >= 0 && var1 < this.bk.length && null != this.bk[var1] && var2 >= 0 && var2 < this.bk[var1].length) {
         if (this.bk[var1][var2] == null) {
            boolean var4 = this.co(var1, var3, 174725772);
            if (!var4) {
               this.aj(var1, 1703992490);
               var4 = this.co(var1, var3, -1392008731);
               if (!var4) {
                  return null;
               }
            }
         }

         byte[] var5 = oa.aw(this.bk[var1][var2], false, 1129886367);
         if (this.bz) {
            this.bk[var1][var2] = null;
         }

         return var5;
      } else {
         return null;
      }
   }

   public boolean ck(int var1, int var2) {
      if (var1 >= 0 && var1 < this.bk.length && this.bk[var1] != null && var2 >= 0 && var2 < this.bk[var1].length) {
         if (this.bk[var1][var2] != null) {
            return true;
         } else if (null != this.bx[var1]) {
            return true;
         } else {
            this.aj(var1, 1703992490);
            return null != this.bx[var1];
         }
      } else {
         return false;
      }
   }

   public int dj(int var1) {
      return null != this.bk && var1 < this.bk.length && this.bk[var1] != null ? this.bk[var1].length : 0;
   }

   public boolean dd(int var1, int var2) {
      if (var1 >= 0 && var1 < this.bk.length && this.bk[var1] != null && var2 >= 0 && var2 < this.bk[var1].length) {
         if (this.bk[var1][var2] != null) {
            return true;
         } else if (null != this.bx[var1]) {
            return true;
         } else {
            this.aj(var1, 1703992490);
            return null != this.bx[var1];
         }
      } else {
         return false;
      }
   }

   void ad(int var1) {
   }

   boolean ek(int var1, int[] var2) {
      if (null == this.bx[var1]) {
         return false;
      } else {
         int var3 = this.ah[var1];
         int[] var4 = this.bh[var1];
         Object[] var5 = this.bk[var1];
         boolean var6 = true;

         for(int var7 = 0; var7 < var3; ++var7) {
            if (null == var5[var4[var7]]) {
               var6 = false;
               break;
            }
         }

         if (var6) {
            return true;
         } else {
            byte[] var19;
            if (var2 != null && (var2[0] != 0 || var2[1] != 0 || 0 != var2[2] || 0 != var2[3])) {
               var19 = oa.aw(this.bx[var1], true, 1969604801);
               vl var8 = new vl(var19);
               var8.dl(var2, 5, var8.ae.length, (short)31410);
            } else {
               var19 = oa.aw(this.bx[var1], false, -612739719);
            }

            int var13;
            int var16;
            int var17;
            byte[] var20;
            try {
               var20 = mp.cx(var19, 31873403);
            } catch (RuntimeException var18) {
               String var11 = "" + (var2 != null) + "," + var1 + "," + var19.length + ",";
               var13 = var19.length;
               int var12 = hx.bs(var19, 0, var13, 1161995532);
               String var15 = var11 + var12 + ",";
               var17 = var19.length - 2;
               var16 = hx.bs(var19, 0, var17, 697006350);
               throw tm.aw(var18, var15 + var16 + "," + this.al[var1] + "," + -739772375 * this.bq);
            }

            if (this.bp) {
               this.bx[var1] = null;
            }

            if (var3 > 1) {
               int var9 = var20.length;
               --var9;
               int var10 = var20[var9] & -616159350;
               var9 -= 4 * var3 * var10;
               vl var21 = new vl(var20);
               int[] var22 = new int[var3];
               var21.am = var9 * -661739667;

               int var14;
               int var24;
               for(var13 = 0; var13 < var10; ++var13) {
                  var14 = 0;

                  for(var24 = 0; var24 < var3; ++var24) {
                     var14 += var21.ch(1203709469);
                     var22[var24] += var14;
                  }
               }

               byte[][] var23 = new byte[var3][];

               for(var14 = 0; var14 < var3; ++var14) {
                  var23[var14] = new byte[var22[var14]];
                  var22[var14] = 0;
               }

               var21.am = var9 * -725588083;
               var14 = 0;

               for(var24 = 0; var24 < var10; ++var24) {
                  var16 = 0;

                  for(var17 = 0; var17 < var3; ++var17) {
                     var16 += var21.ch(1203709469);
                     System.arraycopy(var20, var14, var23[var17], var22[var17], var16);
                     var22[var17] += var16;
                     var14 += var16;
                  }
               }

               for(var24 = 0; var24 < var3; ++var24) {
                  if (!this.bz) {
                     var5[var4[var24]] = ke.ap(var23[var24], false, -7541217);
                  } else {
                     var5[var4[var24]] = var23[var24];
                  }
               }
            } else if (!this.bz) {
               var5[var4[0]] = ke.ap(var20, false, -387575145);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   public boolean dr(int var1) {
      if (null != this.bx[var1]) {
         return true;
      } else {
         this.aj(var1, 1703992490);
         return this.bx[var1] != null;
      }
   }

   public boolean dh(int var1) {
      if (null != this.bx[var1]) {
         return true;
      } else {
         this.aj(var1, 1703992490);
         return this.bx[var1] != null;
      }
   }

   public boolean dg(int var1) {
      if (null != this.bx[var1]) {
         return true;
      } else {
         this.aj(var1, 1703992490);
         return this.bx[var1] != null;
      }
   }

   public byte[] df(int var1) {
      if (this.bk.length == 1) {
         return this.bm(0, var1, 1044591842);
      } else if (this.bk[var1].length == 1) {
         return this.bm(var1, 0, 1987415238);
      } else {
         throw new RuntimeException();
      }
   }

   public int ef(String var1) {
      var1 = var1.toLowerCase();
      return this.aq.ap(la.am(var1, 242602398), (byte)103);
   }

   public byte[] dk(int var1) {
      if (this.bk.length == 1) {
         return this.bg(0, var1, -1129910704);
      } else if (1 == this.bk[var1].length) {
         return this.bg(var1, 0, 1548816705);
      } else {
         throw new RuntimeException();
      }
   }

   public byte[] dl(int var1) {
      if (this.bk.length == 1) {
         return this.bg(0, var1, -1071782574);
      } else if (1 == this.bk[var1].length) {
         return this.bg(var1, 0, 757087434);
      } else {
         throw new RuntimeException();
      }
   }

   public byte[] dm(int var1) {
      if (this.bk.length == 1) {
         return this.bg(0, var1, -583305663);
      } else if (1 == this.bk[var1].length) {
         return this.bg(var1, 0, -746373659);
      } else {
         throw new RuntimeException();
      }
   }

   public int[] dt(int var1) {
      return var1 >= 0 && var1 < this.bh.length ? this.bh[var1] : null;
   }

   public int[] dx(int var1) {
      return var1 >= 0 && var1 < this.bh.length ? this.bh[var1] : null;
   }

   void ak(int var1, int var2) {
      try {
         ;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "pe.ak(" + ')');
      }
   }

   public int db(int var1) {
      return null != this.bk && var1 < this.bk.length && this.bk[var1] != null ? this.bk[var1].length : 0;
   }

   public int dv(int var1) {
      return null != this.bk && var1 < this.bk.length && this.bk[var1] != null ? this.bk[var1].length : 0;
   }

   public byte[] bl(int var1, int var2) {
      try {
         if (this.bk.length == 1) {
            if (var2 != 1948346911) {
               throw new IllegalStateException();
            } else {
               return this.bg(0, var1, 1930795664);
            }
         } else if (1 == this.bk[var1].length) {
            if (var2 != 1948346911) {
               throw new IllegalStateException();
            } else {
               return this.bg(var1, 0, 139719799);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "pe.bl(" + ')');
      }
   }

   public int dp() {
      return this.bk.length;
   }

   public int cb(int var1) {
      try {
         return this.bk.length;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "pe.cb(" + ')');
      }
   }

   public void do() {
      for(int var1 = 0; var1 < this.bx.length; ++var1) {
         this.bx[var1] = null;
      }

   }

   public void dw() {
      for(int var1 = 0; var1 < this.bx.length; ++var1) {
         this.bx[var1] = null;
      }

   }

   public void de() {
      for(int var1 = 0; var1 < this.bx.length; ++var1) {
         this.bx[var1] = null;
      }

   }

   public void dz() {
      for(int var1 = 0; var1 < this.bx.length; ++var1) {
         this.bx[var1] = null;
      }

   }

   public byte[] bf(int var1, int var2) {
      try {
         if (this.bk.length == 1) {
            if (var2 <= -1792841095) {
               throw new IllegalStateException();
            } else {
               return this.bm(0, var1, 2018747203);
            }
         } else if (this.bk[var1].length == 1) {
            if (var2 <= -1792841095) {
               throw new IllegalStateException();
            } else {
               return this.bm(var1, 0, 1296087924);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "pe.bf(" + ')');
      }
   }

   public byte[] cj(int var1, int var2) {
      return this.bo(var1, var2, (int[])null, (byte)14);
   }

   public void eg(int var1) {
      for(int var2 = 0; var2 < this.bk[var1].length; ++var2) {
         this.bk[var1][var2] = null;
      }

   }

   public void ev() {
      for(int var1 = 0; var1 < this.bk.length; ++var1) {
         if (null != this.bk[var1]) {
            for(int var2 = 0; var2 < this.bk[var1].length; ++var2) {
               this.bk[var1][var2] = null;
            }
         }
      }

   }

   public void eh() {
      for(int var1 = 0; var1 < this.bk.length; ++var1) {
         if (null != this.bk[var1]) {
            for(int var2 = 0; var2 < this.bk[var1].length; ++var2) {
               this.bk[var1][var2] = null;
            }
         }
      }

   }

   public boolean ed(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.aq.ap(la.am(var1, 242602398), (byte)103);
      if (var3 < 0) {
         return false;
      } else {
         int var4 = this.bv[var3].ap(la.am(var2, 242602398), (byte)103);
         return var4 >= 0;
      }
   }

   public void ey() {
      for(int var1 = 0; var1 < this.bk.length; ++var1) {
         if (null != this.bk[var1]) {
            for(int var2 = 0; var2 < this.bk[var1].length; ++var2) {
               this.bk[var1][var2] = null;
            }
         }
      }

   }

   public boolean dq(int var1, int var2) {
      if (var1 >= 0 && var1 < this.bk.length && this.bk[var1] != null && var2 >= 0 && var2 < this.bk[var1].length) {
         if (this.bk[var1][var2] != null) {
            return true;
         } else if (null != this.bx[var1]) {
            return true;
         } else {
            this.aj(var1, 1703992490);
            return null != this.bx[var1];
         }
      } else {
         return false;
      }
   }

   void bs(byte[] var1, byte var2) {
      try {
         int var4 = var1.length;
         int var3 = hx.bs(var1, 0, var4, 1490279327);
         this.bq = 2133704989 * var3;
         vl var5 = new vl(mp.cx(var1, 31873403));
         int var6 = var5.cy((short)-9655);
         if (var6 >= 5) {
            if (var6 <= 7) {
               if (var6 >= 6) {
                  if (var2 == -1) {
                     return;
                  }

                  var5.ch(1203709469);
               }

               int var7 = var5.cy((short)-27925);
               if (var6 >= 7) {
                  if (var2 == -1) {
                     throw new IllegalStateException();
                  }

                  this.ac = var5.da(1824215543) * -502664173;
               } else {
                  this.ac = var5.ce(1559284408) * -502664173;
               }

               int var8 = 0;
               int var9 = -1;
               this.av = new int[this.ac * -116132325];
               int var10;
               if (var6 >= 7) {
                  if (var2 == -1) {
                     return;
                  }

                  for(var10 = 0; var10 < this.ac * -116132325; ++var10) {
                     this.av[var10] = var8 += var5.da(600644902);
                     if (this.av[var10] > var9) {
                        if (var2 == -1) {
                           throw new IllegalStateException();
                        }

                        var9 = this.av[var10];
                     }
                  }
               } else {
                  for(var10 = 0; var10 < this.ac * -116132325; ++var10) {
                     if (var2 == -1) {
                        return;
                     }

                     this.av[var10] = var8 += var5.ce(936983651);
                     if (this.av[var10] > var9) {
                        if (var2 == -1) {
                           throw new IllegalStateException();
                        }

                        var9 = this.av[var10];
                     }
                  }
               }

               this.al = new int[var9 + 1];
               this.aa = new int[1 + var9];
               this.ah = new int[1 + var9];
               this.bh = new int[1 + var9][];
               this.bx = new Object[var9 + 1];
               this.bk = new Object[var9 + 1][];
               if (0 != var7) {
                  if (var2 == -1) {
                     throw new IllegalStateException();
                  }

                  this.ax = new int[var9 + 1];

                  for(var10 = 0; var10 < -116132325 * this.ac; ++var10) {
                     if (var2 == -1) {
                        throw new IllegalStateException();
                     }

                     this.ax[this.av[var10]] = var5.ch(1203709469);
                  }

                  this.aq = new we(this.ax);
               }

               for(var10 = 0; var10 < -116132325 * this.ac; ++var10) {
                  if (var2 == -1) {
                     throw new IllegalStateException();
                  }

                  this.al[this.av[var10]] = var5.ch(1203709469);
               }

               for(var10 = 0; var10 < -116132325 * this.ac; ++var10) {
                  if (var2 == -1) {
                     throw new IllegalStateException();
                  }

                  this.aa[this.av[var10]] = var5.ch(1203709469);
               }

               for(var10 = 0; var10 < this.ac * -116132325; ++var10) {
                  if (var2 == -1) {
                     throw new IllegalStateException();
                  }

                  this.ah[this.av[var10]] = var5.ce(970482432);
               }

               int var11;
               int var12;
               int var13;
               int var14;
               int var15;
               if (var6 >= 7) {
                  if (var2 == -1) {
                     throw new IllegalStateException();
                  }

                  for(var10 = 0; var10 < this.ac * -116132325; ++var10) {
                     if (var2 == -1) {
                        throw new IllegalStateException();
                     }

                     var11 = this.av[var10];
                     var12 = this.ah[var11];
                     var8 = 0;
                     var13 = -1;
                     this.bh[var11] = new int[var12];

                     for(var14 = 0; var14 < var12; ++var14) {
                        var15 = this.bh[var11][var14] = var8 += var5.da(-138831236);
                        if (var15 > var13) {
                           if (var2 == -1) {
                              throw new IllegalStateException();
                           }

                           var13 = var15;
                        }
                     }

                     this.bk[var11] = new Object[var13 + 1];
                  }
               } else {
                  for(var10 = 0; var10 < -116132325 * this.ac; ++var10) {
                     var11 = this.av[var10];
                     var12 = this.ah[var11];
                     var8 = 0;
                     var13 = -1;
                     this.bh[var11] = new int[var12];

                     for(var14 = 0; var14 < var12; ++var14) {
                        if (var2 == -1) {
                           throw new IllegalStateException();
                        }

                        var15 = this.bh[var11][var14] = var8 += var5.ce(791909072);
                        if (var15 > var13) {
                           var13 = var15;
                        }
                     }

                     this.bk[var11] = new Object[var13 + 1];
                  }
               }

               if (var7 != 0) {
                  if (var2 == -1) {
                     throw new IllegalStateException();
                  }

                  this.bj = new int[var9 + 1][];
                  this.bv = new we[1 + var9];

                  for(var10 = 0; var10 < -116132325 * this.ac; ++var10) {
                     if (var2 == -1) {
                        return;
                     }

                     var11 = this.av[var10];
                     var12 = this.ah[var11];
                     this.bj[var11] = new int[this.bk[var11].length];

                     for(var13 = 0; var13 < var12; ++var13) {
                        if (var2 == -1) {
                           throw new IllegalStateException();
                        }

                        this.bj[var11][this.bh[var11][var13]] = var5.ch(1203709469);
                     }

                     this.bv[var11] = new we(this.bj[var11]);
                  }
               }

               return;
            }

            if (var2 == -1) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var16) {
         throw tm.aw(var16, "pe.bs(" + ')');
      }
   }

   boolean ec(int var1, int[] var2) {
      if (null == this.bx[var1]) {
         return false;
      } else {
         int var3 = this.ah[var1];
         int[] var4 = this.bh[var1];
         Object[] var5 = this.bk[var1];
         boolean var6 = true;

         for(int var7 = 0; var7 < var3; ++var7) {
            if (null == var5[var4[var7]]) {
               var6 = false;
               break;
            }
         }

         if (var6) {
            return true;
         } else {
            byte[] var19;
            if (var2 != null && (var2[0] != 0 || var2[1] != 0 || 0 != var2[2] || 0 != var2[3])) {
               var19 = oa.aw(this.bx[var1], true, -1628773126);
               vl var8 = new vl(var19);
               var8.dl(var2, 5, var8.ae.length, (short)9254);
            } else {
               var19 = oa.aw(this.bx[var1], false, -1712283523);
            }

            int var13;
            int var16;
            int var17;
            byte[] var20;
            try {
               var20 = mp.cx(var19, 31873403);
            } catch (RuntimeException var18) {
               String var11 = "" + (var2 != null) + "," + var1 + "," + var19.length + ",";
               var13 = var19.length;
               int var12 = hx.bs(var19, 0, var13, -161899886);
               String var15 = var11 + var12 + ",";
               var17 = var19.length - 2;
               var16 = hx.bs(var19, 0, var17, 2123132551);
               throw tm.aw(var18, var15 + var16 + "," + this.al[var1] + "," + -417265355 * this.bq);
            }

            if (this.bp) {
               this.bx[var1] = null;
            }

            if (var3 > 1) {
               int var9 = var20.length;
               --var9;
               int var10 = var20[var9] & 255;
               var9 -= 4 * var3 * var10;
               vl var21 = new vl(var20);
               int[] var22 = new int[var3];
               var21.am = var9 * -725588083;

               int var14;
               int var24;
               for(var13 = 0; var13 < var10; ++var13) {
                  var14 = 0;

                  for(var24 = 0; var24 < var3; ++var24) {
                     var14 += var21.ch(1203709469);
                     var22[var24] += var14;
                  }
               }

               byte[][] var23 = new byte[var3][];

               for(var14 = 0; var14 < var3; ++var14) {
                  var23[var14] = new byte[var22[var14]];
                  var22[var14] = 0;
               }

               var21.am = var9 * -725588083;
               var14 = 0;

               for(var24 = 0; var24 < var10; ++var24) {
                  var16 = 0;

                  for(var17 = 0; var17 < var3; ++var17) {
                     var16 += var21.ch(1203709469);
                     System.arraycopy(var20, var14, var23[var17], var22[var17], var16);
                     var22[var17] += var16;
                     var14 += var16;
                  }
               }

               for(var24 = 0; var24 < var3; ++var24) {
                  if (!this.bz) {
                     var5[var4[var24]] = ke.ap(var23[var24], false, -1741993064);
                  } else {
                     var5[var4[var24]] = var23[var24];
                  }
               }
            } else if (!this.bz) {
               var5[var4[0]] = ke.ap(var20, false, 1194147222);
            } else {
               var5[var4[0]] = var20;
            }

            return true;
         }
      }
   }

   public int en(String var1) {
      var1 = var1.toLowerCase();
      return this.aq.ap(la.am(var1, 242602398), (byte)103);
   }

   public byte[] ej(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.aq.ap(la.am(var1, 242602398), (byte)103);
      int var4 = this.bv[var3].ap(la.am(var2, 242602398), (byte)103);
      return this.bm(var3, var4, 1296756796);
   }

   public void dn(int var1) {
      for(int var2 = 0; var2 < this.bk[var1].length; ++var2) {
         this.bk[var1][var2] = null;
      }

   }

   pe(boolean var1, boolean var2) {
      try {
         super();
         this.bp = var1;
         this.bz = var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "pe.<init>(" + ')');
      }
   }

   public void di(int var1) {
      for(int var2 = 0; var2 < this.bk[var1].length; ++var2) {
         this.bk[var1][var2] = null;
      }

   }

   public boolean ep(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.aq.ap(la.am(var1, 242602398), (byte)103);
      if (var3 < 0) {
         return false;
      } else {
         int var4 = this.bv[var3].ap(la.am(var2, 242602398), (byte)103);
         return var4 >= 0;
      }
   }

   public boolean ex(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.aq.ap(la.am(var1, 242602398), (byte)103);
      if (var3 < 0) {
         return false;
      } else {
         int var4 = this.bv[var3].ap(la.am(var2, 242602398), (byte)103);
         return var4 >= 0;
      }
   }

   public boolean da(int var1) {
      if (1 == this.bk.length) {
         return this.bd(0, var1, -2094056493);
      } else if (this.bk[var1].length == 1) {
         return this.bd(var1, 0, -2094056493);
      } else {
         throw new RuntimeException();
      }
   }

   public int cl(int var1, String var2, short var3) {
      try {
         var2 = var2.toLowerCase();
         return this.bv[var1].ap(la.am(var2, 242602398), (byte)103);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "pe.cl(" + ')');
      }
   }

   public byte[] ew(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.aq.ap(la.am(var1, 242602398), (byte)103);
      int var4 = this.bv[var3].ap(la.am(var2, 242602398), (byte)103);
      return this.bm(var3, var4, 864206858);
   }

   public boolean eu(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.aq.ap(la.am(var1, 242602398), (byte)103);
      int var4 = this.bv[var3].ap(la.am(var2, 242602398), (byte)103);
      return this.bd(var3, var4, -2094056493);
   }

   public boolean eq(String var1, String var2) {
      var1 = var1.toLowerCase();
      var2 = var2.toLowerCase();
      int var3 = this.aq.ap(la.am(var1, 242602398), (byte)103);
      int var4 = this.bv[var3].ap(la.am(var2, 242602398), (byte)103);
      return this.bd(var3, var4, -2094056493);
   }

   public boolean eb(String var1) {
      var1 = var1.toLowerCase();
      int var2 = this.aq.ap(la.am(var1, 242602398), (byte)103);
      return this.bw(var2, 2134093299);
   }

   static final byte[] es(byte[] var0) {
      vl var1 = new vl(var0);
      int var2 = var1.cy((short)-10494);
      int var3 = var1.ch(1203709469);
      if (var3 >= 0 && (0 == bc * 46685563 || var3 <= bc * 46685563)) {
         if (0 == var2) {
            byte[] var6 = new byte[var3];
            var1.cr(var6, 0, var3, (byte)75);
            return var6;
         } else {
            int var4 = var1.ch(1203709469);
            if (var4 >= 0 && (46685563 * bc == 0 || var4 <= 1813344299 * bc)) {
               byte[] var5 = new byte[var4];
               if (1 == var2) {
                  vh.ap(var5, var4, var0, var3, 9);
               } else {
                  bb.ap(var1, var5, (byte)46);
               }

               return var5;
            } else {
               throw new RuntimeException();
            }
         }
      } else {
         throw new RuntimeException();
      }
   }

   static final byte[] eo(byte[] var0) {
      vl var1 = new vl(var0);
      int var2 = var1.cy((short)-30345);
      int var3 = var1.ch(1203709469);
      if (var3 < 0 || 0 != bc * 46685563 && var3 > bc * 740121830) {
         throw new RuntimeException();
      } else if (0 == var2) {
         byte[] var6 = new byte[var3];
         var1.cr(var6, 0, var3, (byte)47);
         return var6;
      } else {
         int var4 = var1.ch(1203709469);
         if (var4 >= 0 && (46685563 * bc == 0 || var4 <= -979091645 * bc)) {
            byte[] var5 = new byte[var4];
            if (1 == var2) {
               vh.ap(var5, var4, var0, var3, 9);
            } else {
               bb.ap(var1, var5, (byte)116);
            }

            return var5;
         } else {
            throw new RuntimeException();
         }
      }
   }
}
