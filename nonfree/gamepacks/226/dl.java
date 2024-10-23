import java.util.Arrays;
import java.util.List;

public class dl {
   static final int aw = 2;
   static final int bj = 29;
   static final int ay = 6;
   static final int ae = 8;
   static final int au = 11;
   static final int am = 9;
   static final int at = 10;
   static final int as = 7;
   static final int ar = 15;
   static final int ad = 19;
   static final int aj = 4;
   static final int bk = 45;
   static final int bh = 1076101432;
   static List wh;
   static final int aq = 25;

   static char aw(char var0, pn var1, byte var2) {
      try {
         if (var0 >= 192) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            if (var0 <= 255) {
               if (var2 == 1) {
                  throw new IllegalStateException();
               }

               if (var0 >= 192) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 198) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     return 'A';
                  }
               }

               if (199 == var0) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  return 'C';
               }

               if (var0 >= 200) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 203) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     return 'E';
                  }
               }

               if (var0 >= 204 && var0 <= 207) {
                  return 'I';
               }

               if (209 == var0 && pn.ay != var1) {
                  return 'N';
               }

               if (var0 >= 210 && var0 <= 214) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  return 'O';
               }

               if (var0 >= 217) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 220) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     return 'U';
                  }
               }

               if (221 == var0) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  return 'Y';
               }

               if (var0 == 223) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  return 's';
               }

               if (var0 >= 224) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 230) {
                     return 'a';
                  }
               }

               if (var0 == 231) {
                  return 'c';
               }

               if (var0 >= 232) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 235) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     return 'e';
                  }
               }

               if (var0 >= 236) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 239) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     return 'i';
                  }
               }

               if (241 == var0) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  if (var1 != pn.ay) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     return 'n';
                  }
               }

               if (var0 >= 242) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 246) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     return 'o';
                  }
               }

               if (var0 >= 249) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 252) {
                     if (var2 == 1) {
                        throw new IllegalStateException();
                     }

                     return 'u';
                  }
               }

               if (253 == var0) {
                  return 'y';
               }

               if (var2 == 1) {
                  throw new IllegalStateException();
               }

               if (255 == var0) {
                  if (var2 == 1) {
                     throw new IllegalStateException();
                  }

                  return 'y';
               }
            }
         }

         if (338 == var0) {
            return 'O';
         } else if (339 == var0) {
            return 'o';
         } else if (376 == var0) {
            if (var2 == 1) {
               throw new IllegalStateException();
            } else {
               return 'Y';
            }
         } else {
            return var0;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "dl.aw(" + ')');
      }
   }

   static void ja(dn var0, byte var1) {
      try {
         int var2 = 1587254913 * var0.ai / 8;
         int var3 = -1000264093 * var0.ay / 8;
         boolean var4 = false;
         ec.jv(false, (byte)8);
         var4 = true;

         int var5;
         for(var5 = 0; var5 < nt.ji.length; ++var5) {
            if (var1 == -1) {
               return;
            }

            if (hg.jx[var5] != -1 && nt.ji[var5] == null) {
               if (var1 == -1) {
                  return;
               }

               nt.ji[var5] = he.fo.bm(hg.jx[var5], 0, 1517903491);
               if (null == nt.ji[var5]) {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  var4 = false;
               }
            }

            if (-1 != jc.jl[var5]) {
               if (var1 == -1) {
                  return;
               }

               if (null == ma.jc[var5]) {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  ma.jc[var5] = he.fo.bo(jc.jl[var5], 0, nt.jt[var5], (byte)14);
                  if (null == ma.jc[var5]) {
                     if (var1 == -1) {
                        throw new IllegalStateException();
                     }

                     var4 = false;
                  }
               }
            }
         }

         if (!var4) {
            if (var1 == -1) {
               throw new IllegalStateException();
            }
         } else {
            ec.jv(false, (byte)-49);
            var4 = true;

            for(var5 = 0; var5 < nt.ji.length; ++var5) {
               if (var1 == -1) {
                  throw new IllegalStateException();
               }

               byte[] var6 = ma.jc[var5];
               if (null != var6) {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  byte var7 = 10;
                  byte var8 = 10;
                  var4 &= dh.ae(var6, var7, var8, (byte)-121);
               }
            }

            if (var4) {
               int var19;
               for(var5 = 0; var5 < 4; ++var5) {
                  for(var19 = 0; var19 < var0.au[var5].length; ++var19) {
                     if (var1 == -1) {
                        throw new IllegalStateException();
                     }

                     Arrays.fill(var0.au[var5][var19], (byte)0);
                  }
               }

               fx.hf(-1109164411);
               ei.ap((byte)23);
               lm.ap(-1948145278);
               ec.jv(true, (byte)73);

               int var9;
               int var10;
               int var11;
               int var12;
               int var13;
               int var14;
               int var20;
               for(var5 = 0; var5 < 4; ++var5) {
                  if (var1 == -1) {
                     return;
                  }

                  fx.hf(-2008667962);

                  for(var19 = 0; var19 < var2; ++var19) {
                     if (var1 == -1) {
                        throw new IllegalStateException();
                     }

                     for(var20 = 0; var20 < var3; ++var20) {
                        if (var1 == -1) {
                           throw new IllegalStateException();
                        }

                        boolean var21 = false;
                        var9 = client.jb[var5][var19][var20];
                        if (var9 != -1) {
                           if (var1 == -1) {
                              return;
                           }

                           var10 = var9 >> 24 & 3;
                           var11 = var9 >> 1 & 3;
                           var12 = var9 >> 14 & 1023;
                           var13 = var9 >> 3 & 2047;
                           var14 = var13 / 8 + (var12 / 8 << 8);

                           for(int var15 = 0; var15 < ev.jq.length; ++var15) {
                              if (var1 == -1) {
                                 throw new IllegalStateException();
                              }

                              if (var14 == ev.jq[var15]) {
                                 if (var1 == -1) {
                                    throw new IllegalStateException();
                                 }

                                 if (null != nt.ji[var15]) {
                                    int var16 = 8 * (var12 - var19);
                                    int var17 = 8 * (var13 - var20);
                                    rm.ai(var0, nt.ji[var15], var5, 8 * var19, 8 * var20, var10, (var12 & 7) * 8, (var13 & 7) * 8, var11, var16, var17, 728392059);
                                    var21 = true;
                                    break;
                                 }
                              }
                           }
                        }

                        if (!var21) {
                           if (var1 == -1) {
                              return;
                           }

                           fm.ay(var0.at, var5, 8 * var19, var20 * 8, 257737328);
                        }
                     }
                  }
               }

               for(var5 = 0; var5 < 13; ++var5) {
                  if (var1 == -1) {
                     throw new IllegalStateException();
                  }

                  for(var19 = 0; var19 < 13; ++var19) {
                     if (var1 == -1) {
                        throw new IllegalStateException();
                     }

                     var20 = client.jb[0][var5][var19];
                     if (-1 == var20) {
                        if (var1 == -1) {
                           throw new IllegalStateException();
                        }

                        dr.ak(var0, var5 * 8, 8 * var19, 8, 8, 2094338839);
                     }
                  }
               }

               ec.jv(true, (byte)39);

               for(var5 = 0; var5 < 4; ++var5) {
                  if (var1 == -1) {
                     return;
                  }

                  fx.hf(-708527175);

                  for(var19 = 0; var19 < var2; ++var19) {
                     if (var1 == -1) {
                        throw new IllegalStateException();
                     }

                     for(var20 = 0; var20 < var3; ++var20) {
                        if (var1 == -1) {
                           return;
                        }

                        int var22 = client.jb[var5][var19][var20];
                        if (var22 != -1) {
                           if (var1 == -1) {
                              throw new IllegalStateException();
                           }

                           var9 = var22 >> 24 & 3;
                           var10 = var22 >> 1 & 3;
                           var11 = var22 >> 14 & 1023;
                           var12 = var22 >> 3 & 2047;
                           var13 = var12 / 8 + (var11 / 8 << 8);

                           for(var14 = 0; var14 < ev.jq.length; ++var14) {
                              if (var1 == -1) {
                                 throw new IllegalStateException();
                              }

                              if (ev.jq[var14] == var13) {
                                 if (var1 == -1) {
                                    throw new IllegalStateException();
                                 }

                                 if (null != ma.jc[var14]) {
                                    dg.at(var0, ma.jc[var14], var5, var19 * 8, 8 * var20, var9, (var11 & 7) * 8, 8 * (var12 & 7), var10);
                                    break;
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               ec.jv(true, (byte)-76);
               fx.hf(397341414);
               tm.an(var0, (byte)1);
               ec.jv(true, (byte)-84);
               ir.ai.aj();
               fx.hf(-1855007333);
               db.aw((byte)42);
               client.dc = false;
            }
         }
      } catch (RuntimeException var18) {
         throw tm.aw(var18, "dl.ja(" + ')');
      }
   }

   static final dm nw(int var0, int var1, int var2, int var3) {
      try {
         dm var4 = new dm();
         var4.ap = -1153218621 * var1;
         var4.aw = var2 * -1627634225;
         client.om.ak(var4, (long)var0);
         ho.mk(var1, -775701184);
         ng var5 = qk.ek.ap(var0, 2115633066);
         ek.mp(var5, 1407678749);
         if (client.pe != null) {
            ek.mp(client.pe, 1630560385);
            client.pe = null;
         }

         ba.mo(qk.ek.ay[var0 >> 16], var5, false, (byte)-25);
         ch.ci(var1, -264692879);
         if (1832668233 * client.og != -1) {
            si.my(1832668233 * client.og, 1, (short)13753);
         }

         return var4;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "dl.nw(" + ')');
      }
   }

   dl() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "dl.<init>(" + ')');
      }
   }
}
