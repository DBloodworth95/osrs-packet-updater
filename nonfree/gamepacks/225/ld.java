import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class ld {
   int aq;
   static final int ag = 37748736;
   HashMap ah;
   List ad;
   int af;
   kv at;
   int al;
   int ar;
   static final int ac = -3355444;
   static mh ax = new mh(37748736, 256);
   LinkedList au;
   final HashMap ap;

   void du(hf var1, int var2, int var3, int var4, int var5) {
      vv var6 = var1.ax(false, -1214182025);
      if (null != var6) {
         var6.ah(var2 - var6.ae / 2, var3 - var6.ag / 2);
         if (var4 % var5 < var5 / 2) {
            vr.fk(var2, var3, 15, 16776960, 128);
            vr.fk(var2, var3, 7, 16777215, 256);
         }

      }
   }

   public static void bl() {
      ax.aq(5);
   }

   void ax(kv var1, List var2, byte var3) {
      try {
         this.ah.clear();
         this.at = var1;
         this.ar(var2, 1140645796);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ld.ax(" + ')');
      }
   }

   void aw(int var1, int var2, HashSet var3, int var4, byte var5) {
      try {
         float var6 = (float)var4 / 64.0F;
         float var7 = var6 / 2.0F;
         Iterator var8 = this.ah.entrySet().iterator();

         while(var8.hasNext()) {
            if (var5 != 69) {
               throw new IllegalStateException();
            }

            Entry var9 = (Entry)var8.next();
            nm var10 = (nm)var9.getKey();
            int var11 = (int)((float)(-1763049545 * var10.ae) * var6 + (float)var1 - var7);
            int var12 = (int)((float)(var4 + var2) - var6 * (float)(1162074139 * var10.ag) - var7);
            ly var13 = (ly)var9.getValue();
            if (var13 != null) {
               if (var5 != 69) {
                  throw new IllegalStateException();
               }

               if (var13.aj((byte)23)) {
                  if (var5 != 69) {
                     throw new IllegalStateException();
                  }

                  var13.au = var11 * 1227596821;
                  var13.ar = 1550355909 * var12;
                  hf var14 = fq.ac(var13.ae(-1570517373), 268837884);
                  if (!var3.contains(var14.af(21334365))) {
                     if (var5 != 69) {
                        return;
                     }

                     this.bn(var13, var11, var12, var6, -1421588499);
                  }
               }
            }
         }

      } catch (RuntimeException var15) {
         throw vk.ae(var15, "ld.aw(" + ')');
      }
   }

   void af(int var1, int var2, int var3, int var4, la var5, byte var6) {
      try {
         for(int var7 = var1; var7 < var3 + var1; ++var7) {
            if (var6 >= 1) {
               throw new IllegalStateException();
            }

            label72:
            for(int var8 = var2; var8 < var2 + var4; ++var8) {
               for(int var9 = 0; var9 < 1716288713 * var5.ar; ++var9) {
                  if (var6 >= 1) {
                     return;
                  }

                  lp[] var10 = var5.aa[var9][var7][var8];
                  if (var10 != null) {
                     if (var6 >= 1) {
                        throw new IllegalStateException();
                     }

                     if (0 == var10.length) {
                        if (var6 >= 1) {
                           throw new IllegalStateException();
                        }
                     } else {
                        lp[] var11 = var10;

                        for(int var12 = 0; var12 < var11.length; ++var12) {
                           lp var13 = var11[var12];
                           id var14 = kf.ae(var13.ac * -1585924473, (byte)68);
                           if (pg.bs(var14, 1835504734)) {
                              this.at(var14, var9, var7, var8, var5, -2083809634);
                              continue label72;
                           }

                           if (var6 >= 1) {
                              throw new IllegalStateException();
                           }
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var15) {
         throw vk.ae(var15, "ld.af(" + ')');
      }
   }

   void at(id var1, int var2, int var3, int var4, la var5, int var6) {
      try {
         nm var7 = new nm(var2, var3 + this.aq * 1792572352, 1558809920 * this.af + var4);
         nm var8 = null;
         if (this.at != null) {
            if (var6 >= -1728356285) {
               throw new IllegalStateException();
            }

            var8 = new nm(var2 + 620960221 * this.at.au, var3 + this.at.ax * -1409288128, -52398912 * this.at.aq + var4);
         } else {
            lu var9 = (lu)var5;
            var8 = new nm(var2 + var9.au * 620960221, var3 + -1409288128 * var9.ax + var9.ag(2126778162) * 8, var4 + var9.aq * -52398912 + var9.am(-140532769) * 8);
         }

         hf var10;
         Object var12;
         if (var1.bz != null) {
            if (var6 >= -1728356285) {
               return;
            }

            var12 = new kw(var8, var7, var1.au * -1484588863, this);
         } else {
            var10 = fq.ac(var1.bx * 946905713, -1460492125);
            var12 = new ll(var8, var7, var10.ax * 1901462683, this.ba(var10, -353943545));
         }

         var10 = fq.ac(((ly)var12).ae(-1570517373), 779481533);
         if (var10.ad) {
            if (var6 >= -1728356285) {
               throw new IllegalStateException();
            }

            this.ah.put(new nm(0, var3, var4), var12);
         }

      } catch (RuntimeException var11) {
         throw vk.ae(var11, "ld.at(" + ')');
      }
   }

   void au(int var1) {
      try {
         Iterator var2 = this.ah.values().iterator();

         while(var2.hasNext()) {
            if (var1 >= -1705055392) {
               throw new IllegalStateException();
            }

            ly var3 = (ly)var2.next();
            if (var3 instanceof kw) {
               if (var1 >= -1705055392) {
                  throw new IllegalStateException();
               }

               ((kw)var3).ac(902953011);
            }
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ld.au(" + ')');
      }
   }

   int eh(vv var1, hq var2) {
      switch(var2.am * -569774967) {
      case 0:
         return -var1.ag / 2;
      case 1:
         return 0;
      default:
         return -var1.ag;
      }
   }

   ls bw(int var1, byte var2) {
      try {
         hf var3 = fq.ac(var1, -1997805791);
         return this.ba(var3, -784012739);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ld.bw(" + ')');
      }
   }

   boolean ad(po var1, int var2) {
      try {
         this.ah.clear();
         if (this.at != null) {
            if (var2 >= 431266312) {
               throw new IllegalStateException();
            } else {
               this.at.ay(var1, (byte)14);
               if (this.at.as((byte)38)) {
                  if (var2 >= 431266312) {
                     throw new IllegalStateException();
                  } else {
                     this.af(0, 0, 64, 64, this.at, (byte)-125);
                     return true;
                  }
               } else {
                  return false;
               }
            }
         } else {
            boolean var3 = true;

            Iterator var4;
            lu var5;
            for(var4 = this.au.iterator(); var4.hasNext(); var3 &= var5.as((byte)41)) {
               if (var2 >= 431266312) {
                  throw new IllegalStateException();
               }

               var5 = (lu)var4.next();
               var5.ay(var1, (byte)14);
            }

            if (var3) {
               var4 = this.au.iterator();

               while(var4.hasNext()) {
                  if (var2 >= 431266312) {
                     throw new IllegalStateException();
                  }

                  var5 = (lu)var4.next();
                  this.af(var5.ax(-1141491411) * 8, var5.aq(-1465792122) * 8, 8, 8, var5, (byte)-80);
               }
            }

            return var3;
         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ld.ad(" + ')');
      }
   }

   void ah(int var1, lo var2, vt[] var3, po var4, po var5, double var6) {
      try {
         this.al = var1 * 417095467;
         if (null != this.at || !this.au.isEmpty()) {
            int var9 = 1303077359 * this.aq;
            int var10 = 628336181 * this.af;
            mh var11 = ax;
            long var12 = (long)(var1 << 16 | var9 << 8 | var10);
            vv var8 = (vv)var11.ac(var12);
            if (var8 == null) {
               if (jw.aq() != var6) {
                  jw.ag(var6);
               }

               boolean var17 = true;
               var17 &= this.ad(var4, -2032861805);
               int var13;
               if (this.at != null) {
                  var13 = this.at.al * 254431501;
               } else {
                  var13 = ((la)this.au.getFirst()).al * 254431501;
               }

               var17 &= var5.bc(var13, -1072797286);
               if (var17) {
                  byte[] var18 = var5.ch(var13, (byte)21);
                  lc var14 = ch.ac(var18, -775651959);
                  vv var15 = new vv(-1797660480 * this.al, -1797660480 * this.al);
                  var15.am();
                  if (null != this.at) {
                     this.az(var2, var3, var14, -1646001847);
                  } else {
                     this.aa(var2, var3, var14, (byte)18);
                  }

                  kb.ac(var15, 1303077359 * this.aq, this.af * 628336181, this.al * 1179871107, 1481455206);
                  this.al(-1193256134);
               }
            }
         }
      } catch (RuntimeException var16) {
         throw vk.ae(var16, "ld.ah(" + ')');
      }
   }

   void ap(int var1, int var2, int var3, HashSet var4, int var5) {
      try {
         if (null == var4) {
            if (var5 == 8396929) {
               return;
            }

            var4 = new HashSet();
         }

         this.aw(var1, var2, var4, var3, (byte)69);
         this.bx(var1, var2, var4, var3, (byte)112);
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ld.ap(" + ')');
      }
   }

   void bq(int var1, int var2, int var3) {
      int var5 = this.aq * -1103323983;
      int var6 = this.af * 628336181;
      int var7 = 1817936824 * this.al;
      mh var8 = ax;
      long var9 = (long)(var7 << 16 | var5 << 8 | var6);
      vv var4 = (vv)var8.ac(var9);
      if (null != var4) {
         if (var3 == this.al * -904112865) {
            var4.al(var1, var2);
         } else {
            var4.bw(var1, var2, var3, var3);
         }

      }
   }

   void az(lo var1, vt[] var2, lc var3, int var4) {
      try {
         int var5;
         int var6;
         for(var5 = 0; var5 < 64; ++var5) {
            for(var6 = 0; var6 < 64; ++var6) {
               if (var4 != -1646001847) {
                  throw new IllegalStateException();
               }

               this.ao(var5, var6, this.at, var1, var3, -1494869343);
               this.as(var5, var6, this.at, var1, (byte)3);
            }
         }

         for(var5 = 0; var5 < 64; ++var5) {
            if (var4 != -1646001847) {
               throw new IllegalStateException();
            }

            for(var6 = 0; var6 < 64; ++var6) {
               if (var4 != -1646001847) {
                  throw new IllegalStateException();
               }

               this.ai(var5, var6, this.at, var1, var2, -565831480);
            }
         }

      } catch (RuntimeException var7) {
         throw vk.ae(var7, "ld.az(" + ')');
      }
   }

   void ef(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      Iterator var6 = this.ad.iterator();

      while(var6.hasNext()) {
         ly var7 = (ly)var6.next();
         if (var7.aj((byte)-66)) {
            int var8 = var7.af.ae * -1763049545 % 64;
            int var9 = var7.af.ag * 1162074139 % 64;
            var7.au = (int)((float)var1 + (float)var8 * var5) * 1227596821;
            var7.ar = (int)((float)var2 + var5 * (float)(63 - var9)) * 1550355909;
            if (!var3.contains(var7.ae(-1570517373))) {
               this.bn(var7, var7.au * 546900797, -2045810419 * var7.ar, var5, 1434752764);
            }
         }
      }

   }

   void ai(int var1, int var2, la var3, lo var4, vt[] var5, int var6) {
      try {
         this.av(var1, var2, var3, (byte)-88);
         this.aj(var1, var2, var3, var5, -1730188085);
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "ld.ai(" + ')');
      }
   }

   void ao(int var1, int var2, la var3, lo var4, lc var5, int var6) {
      try {
         int var7 = var3.ah[0][var1][var2] - 1;
         int var8 = var3.ap[0][var1][var2] - 1;
         if (var7 == -1) {
            if (var6 >= -1071986692) {
               throw new IllegalStateException();
            }

            if (-1 == var8) {
               if (var6 >= -1071986692) {
                  return;
               }

               vr.fr(1179871107 * this.al * var1, this.al * 1179871107 * (63 - var2), 1179871107 * this.al, this.al * 1179871107, this.ar * 2033490009);
            }
         }

         int var9 = 16711935;
         int var10;
         if (-1 != var8) {
            int var11 = this.ar * 2033490009;
            ia var13 = (ia)ia.ae.ac((long)var8);
            ia var12;
            if (var13 != null) {
               if (var6 >= -1071986692) {
                  throw new IllegalStateException();
               }

               var12 = var13;
            } else {
               byte[] var14 = ia.ac.bt(4, var8, (byte)-12);
               var13 = new ia();
               if (null != var14) {
                  if (var6 >= -1071986692) {
                     throw new IllegalStateException();
                  }

                  var13.ae(new vf(var14), var8, (byte)0);
               }

               var13.ac(248692713);
               ia.ae.ag(var13, (long)var8);
               var12 = var13;
            }

            if (null == var12) {
               var10 = var11;
            } else {
               int var15;
               byte var16;
               int var19;
               int var20;
               if (-1193926069 * var12.aq >= 0) {
                  if (var6 >= -1071986692) {
                     return;
                  }

                  var19 = eq.ac(var12.ar * -336599249, 1303900443 * var12.al, -1167656883 * var12.ad, -1068959007);
                  var16 = 96;
                  if (var19 == -2) {
                     if (var6 >= -1071986692) {
                        throw new IllegalStateException();
                     }

                     var15 = 12345678;
                  } else if (-1 == var19) {
                     if (var6 >= -1071986692) {
                        throw new IllegalStateException();
                     }

                     if (var16 < 0) {
                        if (var6 >= -1071986692) {
                           throw new IllegalStateException();
                        }

                        var16 = 0;
                     } else if (var16 > 127) {
                        if (var6 >= -1071986692) {
                           throw new IllegalStateException();
                        }

                        var16 = 127;
                     }

                     var20 = 127 - var16;
                     var15 = var20;
                  } else {
                     var20 = var16 * (var19 & 127) / 128;
                     if (var20 < 2) {
                        if (var6 >= -1071986692) {
                           throw new IllegalStateException();
                        }

                        var20 = 2;
                     } else if (var20 > 126) {
                        if (var6 >= -1071986692) {
                           throw new IllegalStateException();
                        }

                        var20 = 126;
                     }

                     var15 = var20 + (var19 & 'ﾀ');
                  }

                  var10 = jw.ac[var15] | -16777216;
               } else if (633794047 * var12.am >= 0) {
                  if (var6 >= -1071986692) {
                     throw new IllegalStateException();
                  }

                  var15 = jw.af.af.am(633794047 * var12.am, -2104811945);
                  var16 = 96;
                  if (var15 == -2) {
                     if (var6 >= -1071986692) {
                        throw new IllegalStateException();
                     }

                     var19 = 12345678;
                  } else if (-1 == var15) {
                     if (var6 >= -1071986692) {
                        return;
                     }

                     if (var16 < 0) {
                        if (var6 >= -1071986692) {
                           return;
                        }

                        var16 = 0;
                     } else if (var16 > 127) {
                        if (var6 >= -1071986692) {
                           throw new IllegalStateException();
                        }

                        var16 = 127;
                     }

                     var20 = 127 - var16;
                     var19 = var20;
                  } else {
                     var20 = (var15 & 127) * var16 / 128;
                     if (var20 < 2) {
                        if (var6 >= -1071986692) {
                           return;
                        }

                        var20 = 2;
                     } else if (var20 > 126) {
                        if (var6 >= -1071986692) {
                           throw new IllegalStateException();
                        }

                        var20 = 126;
                     }

                     var19 = var20 + (var15 & 'ﾀ');
                  }

                  var10 = jw.ac[var19] | -16777216;
               } else if (16711935 == var12.ag * 1679504163) {
                  if (var6 >= -1071986692) {
                     throw new IllegalStateException();
                  }

                  var10 = var11;
               } else {
                  var19 = eq.ac(-204798379 * var12.af, 1155509615 * var12.at, 1570391835 * var12.au, 1725519448);
                  var16 = 96;
                  if (-2 == var19) {
                     if (var6 >= -1071986692) {
                        throw new IllegalStateException();
                     }

                     var15 = 12345678;
                  } else if (var19 == -1) {
                     if (var6 >= -1071986692) {
                        throw new IllegalStateException();
                     }

                     if (var16 < 0) {
                        if (var6 >= -1071986692) {
                           throw new IllegalStateException();
                        }

                        var16 = 0;
                     } else if (var16 > 127) {
                        if (var6 >= -1071986692) {
                           throw new IllegalStateException();
                        }

                        var16 = 127;
                     }

                     var20 = 127 - var16;
                     var15 = var20;
                  } else {
                     var20 = (var19 & 127) * var16 / 128;
                     if (var20 < 2) {
                        if (var6 >= -1071986692) {
                           return;
                        }

                        var20 = 2;
                     } else if (var20 > 126) {
                        var20 = 126;
                     }

                     var15 = (var19 & 'ﾀ') + var20;
                  }

                  var10 = jw.ac[var15] | -16777216;
               }
            }

            var9 = var10;
         }

         if (var8 > -1) {
            if (var6 >= -1071986692) {
               throw new IllegalStateException();
            }

            if (0 == var3.ab[0][var1][var2]) {
               if (var6 >= -1071986692) {
                  return;
               }

               vr.fr(var1 * 1179871107 * this.al, 1179871107 * this.al * (63 - var2), this.al * 1179871107, 1179871107 * this.al, var9);
               return;
            }
         }

         var10 = this.ay(var1, var2, var3, var5, 2116059415);
         if (-1 == var8) {
            vr.fr(var1 * 1179871107 * this.al, 1179871107 * this.al * (63 - var2), this.al * 1179871107, this.al * 1179871107, var10);
         } else {
            var4.ac(var1 * this.al * 1179871107, (63 - var2) * this.al * 1179871107, var10, var9, 1179871107 * this.al, this.al * 1179871107, var3.ab[0][var1][var2], var3.az[0][var1][var2], (byte)4);
         }
      } catch (RuntimeException var18) {
         throw vk.ae(var18, "ld.ao(" + ')');
      }
   }

   void as(int var1, int var2, la var3, lo var4, byte var5) {
      try {
         for(int var6 = 1; var6 < var3.ar * 1716288713; ++var6) {
            if (var5 != 3) {
               throw new IllegalStateException();
            }

            int var7 = var3.ap[var6][var1][var2] - 1;
            if (var7 > -1) {
               if (var5 != 3) {
                  throw new IllegalStateException();
               }

               int var9 = this.ar * 2033490009;
               ia var11 = (ia)ia.ae.ac((long)var7);
               ia var10;
               if (var11 != null) {
                  if (var5 != 3) {
                     return;
                  }

                  var10 = var11;
               } else {
                  byte[] var12 = ia.ac.bt(4, var7, (byte)-65);
                  var11 = new ia();
                  if (var12 != null) {
                     if (var5 != 3) {
                        return;
                     }

                     var11.ae(new vf(var12), var7, (byte)0);
                  }

                  var11.ac(1927240822);
                  ia.ae.ag(var11, (long)var7);
                  var10 = var11;
               }

               int var8;
               if (null == var10) {
                  if (var5 != 3) {
                     throw new IllegalStateException();
                  }

                  var8 = var9;
               } else {
                  int var13;
                  byte var14;
                  int var17;
                  int var18;
                  if (var10.aq * -1193926069 >= 0) {
                     if (var5 != 3) {
                        throw new IllegalStateException();
                     }

                     var17 = eq.ac(-336599249 * var10.ar, var10.al * 1303900443, -1167656883 * var10.ad, 1812835981);
                     var14 = 96;
                     if (var17 == -2) {
                        if (var5 != 3) {
                           throw new IllegalStateException();
                        }

                        var13 = 12345678;
                     } else if (-1 == var17) {
                        if (var5 != 3) {
                           throw new IllegalStateException();
                        }

                        if (var14 < 0) {
                           if (var5 != 3) {
                              return;
                           }

                           var14 = 0;
                        } else if (var14 > 127) {
                           if (var5 != 3) {
                              throw new IllegalStateException();
                           }

                           var14 = 127;
                        }

                        var18 = 127 - var14;
                        var13 = var18;
                     } else {
                        var18 = (var17 & 127) * var14 / 128;
                        if (var18 < 2) {
                           if (var5 != 3) {
                              return;
                           }

                           var18 = 2;
                        } else if (var18 > 126) {
                           var18 = 126;
                        }

                        var13 = var18 + (var17 & 'ﾀ');
                     }

                     var8 = jw.ac[var13] | -16777216;
                  } else if (var10.am * 633794047 >= 0) {
                     if (var5 != 3) {
                        return;
                     }

                     var13 = jw.af.af.am(var10.am * 633794047, -2145688537);
                     var14 = 96;
                     if (var13 == -2) {
                        if (var5 != 3) {
                           throw new IllegalStateException();
                        }

                        var17 = 12345678;
                     } else if (-1 == var13) {
                        if (var5 != 3) {
                           throw new IllegalStateException();
                        }

                        if (var14 < 0) {
                           if (var5 != 3) {
                              return;
                           }

                           var14 = 0;
                        } else if (var14 > 127) {
                           if (var5 != 3) {
                              return;
                           }

                           var14 = 127;
                        }

                        var18 = 127 - var14;
                        var17 = var18;
                     } else {
                        var18 = var14 * (var13 & 127) / 128;
                        if (var18 < 2) {
                           if (var5 != 3) {
                              return;
                           }

                           var18 = 2;
                        } else if (var18 > 126) {
                           if (var5 != 3) {
                              throw new IllegalStateException();
                           }

                           var18 = 126;
                        }

                        var17 = (var13 & 'ﾀ') + var18;
                     }

                     var8 = jw.ac[var17] | -16777216;
                  } else if (var10.ag * 1679504163 == 16711935) {
                     if (var5 != 3) {
                        throw new IllegalStateException();
                     }

                     var8 = var9;
                  } else {
                     var17 = eq.ac(var10.af * -204798379, 1155509615 * var10.at, var10.au * 1570391835, 797352946);
                     var14 = 96;
                     if (var17 == -2) {
                        if (var5 != 3) {
                           throw new IllegalStateException();
                        }

                        var13 = 12345678;
                     } else if (-1 == var17) {
                        if (var5 != 3) {
                           throw new IllegalStateException();
                        }

                        if (var14 < 0) {
                           if (var5 != 3) {
                              return;
                           }

                           var14 = 0;
                        } else if (var14 > 127) {
                           var14 = 127;
                        }

                        var18 = 127 - var14;
                        var13 = var18;
                     } else {
                        var18 = var14 * (var17 & 127) / 128;
                        if (var18 < 2) {
                           var18 = 2;
                        } else if (var18 > 126) {
                           if (var5 != 3) {
                              throw new IllegalStateException();
                           }

                           var18 = 126;
                        }

                        var13 = var18 + (var17 & 'ﾀ');
                     }

                     var8 = jw.ac[var13] | -16777216;
                  }
               }

               if (var3.ab[var6][var1][var2] == 0) {
                  vr.fr(var1 * this.al * 1179871107, 1179871107 * this.al * (63 - var2), 1179871107 * this.al, this.al * 1179871107, var8);
               } else {
                  var4.ac(1179871107 * this.al * var1, this.al * 1179871107 * (63 - var2), 0, var8, this.al * 1179871107, this.al * 1179871107, var3.ab[var6][var1][var2], var3.az[var6][var1][var2], (byte)4);
               }
            }
         }

      } catch (RuntimeException var16) {
         throw vk.ae(var16, "ld.as(" + ')');
      }
   }

   int ay(int var1, int var2, la var3, lc var4, int var5) {
      try {
         if (0 == var3.ah[0][var1][var2]) {
            if (var5 <= 2050742731) {
               throw new IllegalStateException();
            } else {
               return this.ar * 2033490009;
            }
         } else {
            return var4.ae(var1, var2, (byte)-107);
         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ld.ay(" + ')');
      }
   }

   void aq(HashSet var1, List var2, int var3) {
      try {
         this.ah.clear();
         Iterator var4 = var1.iterator();

         while(var4.hasNext()) {
            if (var3 != -321671293) {
               throw new IllegalStateException();
            }

            lu var5 = (lu)var4.next();
            if (var5.ak(1673230467) == 1303077359 * this.aq) {
               if (var3 != -321671293) {
                  return;
               }

               if (var5.bn((byte)-56) == this.af * 628336181) {
                  if (var3 != -321671293) {
                     throw new IllegalStateException();
                  }

                  this.au.add(var5);
               }
            }
         }

         this.ar(var2, 494596212);
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ld.aq(" + ')');
      }
   }

   void av(int var1, int var2, la var3, byte var4) {
      try {
         for(int var5 = 0; var5 < 1716288713 * var3.ar; ++var5) {
            if (var4 >= 0) {
               throw new IllegalStateException();
            }

            lp[] var6 = var3.aa[var5][var1][var2];
            if (var6 != null) {
               if (var4 >= 0) {
                  throw new IllegalStateException();
               }

               if (0 == var6.length) {
                  if (var4 >= 0) {
                     throw new IllegalStateException();
                  }
               } else {
                  lp[] var7 = var6;

                  for(int var8 = 0; var8 < var7.length; ++var8) {
                     if (var4 >= 0) {
                        return;
                     }

                     lp var9 = var7[var8];
                     if (dn.ax(var9.ae * 909933211, 1676603046)) {
                        id var10 = kf.ae(var9.ac * -1585924473, (byte)127);
                        int var11 = -1478169491 * var10.ay != 0 ? -3407872 : -3355444;
                        if (-1959052989 * om.ac.aw == var9.ae * 909933211) {
                           this.by(var1, var2, var9.ag * 428020261, var11, (byte)-74);
                        }

                        if (var9.ae * 909933211 == -1959052989 * om.ag.aw) {
                           if (var4 >= 0) {
                              throw new IllegalStateException();
                           }

                           this.by(var1, var2, var9.ag * 428020261, -3355444, (byte)29);
                           this.by(var1, var2, 1 + var9.ag * 428020261, var11, (byte)-62);
                        }

                        if (om.am.aw * -1959052989 == var9.ae * 909933211) {
                           if (var4 >= 0) {
                              throw new IllegalStateException();
                           }

                           if (0 == 428020261 * var9.ag) {
                              if (var4 >= 0) {
                                 throw new IllegalStateException();
                              }

                              vr.fn(this.al * 1179871107 * var1, (63 - var2) * this.al * 1179871107, 1, var11);
                           }

                           if (var9.ag * 428020261 == 1) {
                              if (var4 >= 0) {
                                 throw new IllegalStateException();
                              }

                              vr.fn(var1 * this.al * 1179871107 + this.al * 1179871107 - 1, (63 - var2) * 1179871107 * this.al, 1, var11);
                           }

                           if (2 == 428020261 * var9.ag) {
                              if (var4 >= 0) {
                                 throw new IllegalStateException();
                              }

                              vr.fn(this.al * 1179871107 + 1179871107 * this.al * var1 - 1, 1179871107 * this.al + (63 - var2) * 1179871107 * this.al - 1, 1, var11);
                           }

                           if (3 == 428020261 * var9.ag) {
                              if (var4 >= 0) {
                                 throw new IllegalStateException();
                              }

                              vr.fn(var1 * this.al * 1179871107, this.al * 1179871107 + this.al * 1179871107 * (63 - var2) - 1, 1, var11);
                           }
                        }

                        if (var9.ae * 909933211 == om.ax.aw * -1959052989) {
                           if (var4 >= 0) {
                              throw new IllegalStateException();
                           }

                           int var12 = 428020261 * var9.ag % 2;
                           int var13;
                           if (var12 == 0) {
                              if (var4 >= 0) {
                                 throw new IllegalStateException();
                              }

                              for(var13 = 0; var13 < this.al * 1179871107; ++var13) {
                                 if (var4 >= 0) {
                                    throw new IllegalStateException();
                                 }

                                 vr.fn(1179871107 * this.al * var1 + var13, (64 - var2) * this.al * 1179871107 - 1 - var13, 1, var11);
                              }
                           } else {
                              for(var13 = 0; var13 < this.al * 1179871107; ++var13) {
                                 if (var4 >= 0) {
                                    throw new IllegalStateException();
                                 }

                                 vr.fn(var1 * this.al * 1179871107 + var13, var13 + (63 - var2) * this.al * 1179871107, 1, var11);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var14) {
         throw vk.ae(var14, "ld.av(" + ')');
      }
   }

   void cp(int var1, int var2, int var3, HashSet var4) {
      if (null == var4) {
         var4 = new HashSet();
      }

      this.aw(var1, var2, var4, var3, (byte)69);
      this.bx(var1, var2, var4, var3, (byte)45);
   }

   void an(HashSet var1, int var2, int var3, int var4) {
      try {
         Iterator var5 = this.ad.iterator();

         while(var5.hasNext()) {
            if (var4 != -998595859) {
               return;
            }

            ly var6 = (ly)var5.next();
            if (!var6.aj((byte)-20)) {
               if (var4 != -998595859) {
                  throw new IllegalStateException();
               }
            } else {
               hf var7 = fq.ac(var6.ae(-1570517373), 1775137876);
               if (null != var7) {
                  if (var4 != -998595859) {
                     throw new IllegalStateException();
                  }

                  if (var1.contains(var7.af(493803019))) {
                     if (var4 != -998595859) {
                        return;
                     }

                     this.ak(var7, var6.au * 546900797, -2045810419 * var6.ar, var2, var3, (byte)-25);
                  }
               }
            }
         }

      } catch (RuntimeException var8) {
         throw vk.ae(var8, "ld.an(" + ')');
      }
   }

   void ak(hf var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         vv var7 = var1.ax(false, -1795018008);
         if (null == var7) {
            if (var6 >= 0) {
               throw new IllegalStateException();
            }
         } else {
            var7.ah(var2 - var7.ae / 2, var3 - var7.ag / 2);
            if (var4 % var5 < var5 / 2) {
               if (var6 >= 0) {
                  throw new IllegalStateException();
               }

               vr.fk(var2, var3, 15, 16776960, 128);
               vr.fk(var2, var3, 7, 16777215, 256);
            }

         }
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "ld.ak(" + ')');
      }
   }

   void bn(ly var1, int var2, int var3, float var4, int var5) {
      try {
         hf var6 = fq.ac(var1.ae(-1570517373), -910374377);
         this.bh(var6, var2, var3, 1571344644);
         this.bd(var1, var6, var2, var3, var4, 1804421718);
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "ld.bn(" + ')');
      }
   }

   void cb(int var1, int var2, int var3, HashSet var4) {
      if (null == var4) {
         var4 = new HashSet();
      }

      this.aw(var1, var2, var4, var3, (byte)69);
      this.bx(var1, var2, var4, var3, (byte)115);
   }

   void bd(ly var1, hf var2, int var3, int var4, float var5, int var6) {
      try {
         ls var7 = var1.ag((byte)-4);
         if (null == var7) {
            if (var6 <= 1687068862) {
               throw new IllegalStateException();
            }
         } else if (!var7.am.ae(var5, -1425298382)) {
            if (var6 <= 1687068862) {
               throw new IllegalStateException();
            }
         } else {
            qu var8 = (qu)this.ap.get(var7.am);
            var8.aj(var7.ac, var3 - -226092551 * var7.ae / 2, var4, -226092551 * var7.ae, var7.ag * -736001327, -16777216 | 253024691 * var2.au, 0, 1, 0, var8.at / 2);
         }
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "ld.bd(" + ')');
      }
   }

   void bx(int var1, int var2, HashSet var3, int var4, byte var5) {
      try {
         float var6 = (float)var4 / 64.0F;
         Iterator var7 = this.ad.iterator();

         while(var7.hasNext()) {
            if (var5 <= 10) {
               throw new IllegalStateException();
            }

            ly var8 = (ly)var7.next();
            if (var8.aj((byte)-67)) {
               int var9 = var8.af.ae * -1763049545 % 64;
               int var10 = var8.af.ag * 1162074139 % 64;
               var8.au = (int)((float)var1 + (float)var9 * var6) * 1227596821;
               var8.ar = (int)((float)var2 + var6 * (float)(63 - var10)) * 1550355909;
               if (!var3.contains(var8.ae(-1570517373))) {
                  this.bn(var8, var8.au * 546900797, -2045810419 * var8.ar, var6, 1093724357);
               }
            }
         }

      } catch (RuntimeException var11) {
         throw vk.ae(var11, "ld.bx(" + ')');
      }
   }

   int bf(vv var1, hg var2, int var3) {
      try {
         switch(var2.am * -1047412351) {
         case 1:
            return 0;
         case 2:
            return -var1.ae / 2;
         default:
            return -var1.ae;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ld.bf(" + ')');
      }
   }

   void bt(int var1, int var2, int var3) {
      int var5 = this.aq * -130042409;
      int var6 = this.af * 628336181;
      int var7 = 1179871107 * this.al;
      mh var8 = ax;
      long var9 = (long)(var7 << 16 | var5 << 8 | var6);
      vv var4 = (vv)var8.ac(var9);
      if (null != var4) {
         if (var3 == this.al * -1521815646) {
            var4.al(var1, var2);
         } else {
            var4.bw(var1, var2, var3, var3);
         }

      }
   }

   int bm(vv var1, hq var2, int var3) {
      try {
         switch(var2.am * -569774967) {
         case 0:
            return -var1.ag / 2;
         case 1:
            return 0;
         default:
            return -var1.ag;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ld.bm(" + ')');
      }
   }

   ls ba(hf var1, int var2) {
      try {
         if (var1.at != null) {
            if (var2 >= 1993952423) {
               throw new IllegalStateException();
            }

            if (null != this.ap) {
               if (var2 >= 1993952423) {
                  throw new IllegalStateException();
               }

               if (this.ap.get(ko.ac) != null) {
                  int var4 = var1.ar * -1285016691;
                  ko[] var5 = ko.ac(1682309618);
                  int var6 = 0;

                  ko var3;
                  while(true) {
                     if (var6 >= var5.length) {
                        var3 = null;
                        break;
                     }

                     if (var2 >= 1993952423) {
                        throw new IllegalStateException();
                     }

                     ko var7 = var5[var6];
                     if (var4 == -1237526349 * var7.ax) {
                        if (var2 >= 1993952423) {
                           throw new IllegalStateException();
                        }

                        var3 = var7;
                        break;
                     }

                     ++var6;
                  }

                  if (null == var3) {
                     if (var2 >= 1993952423) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }

                  qu var16 = (qu)this.ap.get(var3);
                  if (null == var16) {
                     if (var2 >= 1993952423) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }

                  int var17 = var16.ab(var1.at, 1000000);
                  String[] var8 = new String[var17];
                  var16.ah(var1.at, (int[])null, var8);
                  int var9 = var16.at * var8.length / 2;
                  int var10 = 0;
                  String[] var11 = var8;

                  for(int var12 = 0; var12 < var11.length; ++var12) {
                     if (var2 >= 1993952423) {
                        throw new IllegalStateException();
                     }

                     String var13 = var11[var12];
                     int var14 = var16.ad(var13);
                     if (var14 > var10) {
                        if (var2 >= 1993952423) {
                           throw new IllegalStateException();
                        }

                        var10 = var14;
                     }
                  }

                  return new ls(var1.at, var10, var9, var3);
               }
            }
         }

         return null;
      } catch (RuntimeException var15) {
         throw vk.ae(var15, "ld.ba(" + ')');
      }
   }

   List bj(int var1, int var2, int var3, int var4, int var5, byte var6) {
      try {
         LinkedList var7 = new LinkedList();
         if (var4 >= var1) {
            if (var6 != 1) {
               throw new IllegalStateException();
            }

            if (var5 >= var2) {
               if (var4 < var3 + var1) {
                  if (var6 != 1) {
                     throw new IllegalStateException();
                  }

                  if (var5 < var3 + var2) {
                     Iterator var8 = this.ah.values().iterator();

                     ly var9;
                     while(var8.hasNext()) {
                        if (var6 != 1) {
                           throw new IllegalStateException();
                        }

                        var9 = (ly)var8.next();
                        if (var9.aj((byte)-48)) {
                           if (var6 != 1) {
                              throw new IllegalStateException();
                           }

                           if (var9.ay(var4, var5, -576384506)) {
                              if (var6 != 1) {
                                 throw new IllegalStateException();
                              }

                              var7.add(var9);
                           }
                        }
                     }

                     var8 = this.ad.iterator();

                     while(var8.hasNext()) {
                        if (var6 != 1) {
                           throw new IllegalStateException();
                        }

                        var9 = (ly)var8.next();
                        if (var9.aj((byte)69)) {
                           if (var6 != 1) {
                              throw new IllegalStateException();
                           }

                           if (var9.ay(var4, var5, -2107652235)) {
                              var7.add(var9);
                           }
                        }
                     }

                     return var7;
                  }

                  if (var6 != 1) {
                     throw new IllegalStateException();
                  }
               }

               return var7;
            }

            if (var6 != 1) {
               throw new IllegalStateException();
            }
         }

         return var7;
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "ld.bj(" + ')');
      }
   }

   List bp(int var1) {
      try {
         LinkedList var2 = new LinkedList();
         var2.addAll(this.ad);
         var2.addAll(this.ah.values());
         return var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ld.bp(" + ')');
      }
   }

   void ch(HashSet var1, List var2) {
      this.ah.clear();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         lu var4 = (lu)var3.next();
         if (var4.ak(1743792991) == 888659920 * this.aq && var4.bn((byte)-65) == this.af * 1287036411) {
            this.au.add(var4);
         }
      }

      this.ar(var2, 1253709758);
   }

   static void bb(vv var0, int var1, int var2, int var3) {
      mh var4 = ax;
      long var6 = (long)(var3 << 16 | var1 << 8 | var2);
      var4.ax(var0, var6, 4 * var0.ac.length);
   }

   void al(int var1) {
      try {
         if (null != this.at) {
            this.at.aj(-1087124654);
         } else {
            Iterator var2 = this.au.iterator();

            while(var2.hasNext()) {
               if (var1 == 1860751979) {
                  throw new IllegalStateException();
               }

               lu var3 = (lu)var2.next();
               var3.aj(-1087124654);
            }
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ld.al(" + ')');
      }
   }

   public static void bg() {
      ax.af();
   }

   public static void bu() {
      ax.aq(5);
   }

   public static void bz() {
      ax.aq(5);
   }

   void dq(int var1, int var2, la var3) {
      for(int var4 = 0; var4 < 1716288713 * var3.ar; ++var4) {
         lp[] var5 = var3.aa[var4][var1][var2];
         if (var5 != null && 0 != var5.length) {
            lp[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               lp var8 = var6[var7];
               if (dn.ax(var8.ae * 909933211, 674093321)) {
                  id var9 = kf.ae(var8.ac * -1585924473, (byte)12);
                  int var10 = -1478169491 * var9.ay != 0 ? -3407872 : -3355444;
                  if (-1959052989 * om.ac.aw == var8.ae * 909933211) {
                     this.by(var1, var2, var8.ag * 428020261, var10, (byte)45);
                  }

                  if (var8.ae * 909933211 == -1959052989 * om.ag.aw) {
                     this.by(var1, var2, var8.ag * 428020261, -3355444, (byte)10);
                     this.by(var1, var2, 1 + var8.ag * 428020261, var10, (byte)62);
                  }

                  if (om.am.aw * -1959052989 == var8.ae * 909933211) {
                     if (0 == 428020261 * var8.ag) {
                        vr.fn(this.al * 1179871107 * var1, (63 - var2) * this.al * 1179871107, 1, var10);
                     }

                     if (var8.ag * 428020261 == 1) {
                        vr.fn(var1 * this.al * 1179871107 + this.al * 1179871107 - 1, (63 - var2) * 1179871107 * this.al, 1, var10);
                     }

                     if (2 == 428020261 * var8.ag) {
                        vr.fn(this.al * 1179871107 + 1179871107 * this.al * var1 - 1, 1179871107 * this.al + (63 - var2) * 1179871107 * this.al - 1, 1, var10);
                     }

                     if (3 == 428020261 * var8.ag) {
                        vr.fn(var1 * this.al * 1179871107, this.al * 1179871107 + this.al * 1179871107 * (63 - var2) - 1, 1, var10);
                     }
                  }

                  if (var8.ae * 909933211 == om.ax.aw * -1959052989) {
                     int var11 = 428020261 * var8.ag % 2;
                     int var12;
                     if (var11 == 0) {
                        for(var12 = 0; var12 < this.al * 1179871107; ++var12) {
                           vr.fn(1179871107 * this.al * var1 + var12, (64 - var2) * this.al * 1179871107 - 1 - var12, 1, var10);
                        }
                     } else {
                        for(var12 = 0; var12 < this.al * 1179871107; ++var12) {
                           vr.fn(var1 * this.al * 1179871107 + var12, var12 + (63 - var2) * this.al * 1179871107, 1, var10);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   void aa(lo var1, vt[] var2, lc var3, byte var4) {
      try {
         Iterator var5 = this.au.iterator();

         lu var6;
         int var7;
         int var8;
         while(var5.hasNext()) {
            if (var4 <= 2) {
               throw new IllegalStateException();
            }

            var6 = (lu)var5.next();

            for(var7 = var6.ax(509040759) * 8; var7 < var6.ax(67283934) * 8 + 8; ++var7) {
               if (var4 <= 2) {
                  throw new IllegalStateException();
               }

               for(var8 = var6.aq(-679907333) * 8; var8 < var6.aq(-2140515748) * 8 + 8; ++var8) {
                  if (var4 <= 2) {
                     throw new IllegalStateException();
                  }

                  this.ao(var7, var8, var6, var1, var3, -1701657106);
                  this.as(var7, var8, var6, var1, (byte)3);
               }
            }
         }

         var5 = this.au.iterator();

         while(var5.hasNext()) {
            if (var4 <= 2) {
               throw new IllegalStateException();
            }

            var6 = (lu)var5.next();

            for(var7 = var6.ax(-1087720365) * 8; var7 < var6.ax(967072323) * 8 + 8; ++var7) {
               if (var4 <= 2) {
                  return;
               }

               for(var8 = var6.aq(-641367720) * 8; var8 < var6.aq(-2010946236) * 8 + 8; ++var8) {
                  this.ai(var7, var8, var6, var1, var2, 841913752);
               }
            }
         }

      } catch (RuntimeException var9) {
         throw vk.ae(var9, "ld.aa(" + ')');
      }
   }

   void ce(HashSet var1, int var2, int var3) {
      Iterator var4 = this.ah.values().iterator();

      while(var4.hasNext()) {
         ly var5 = (ly)var4.next();
         if (var5.aj((byte)-110)) {
            int var6 = var5.ae(-1570517373);
            if (var1.contains(var6)) {
               hf var7 = fq.ac(var6, 528680800);
               this.ak(var7, 546900797 * var5.au, 1000396105 * var5.ar, var2, var3, (byte)-65);
            }
         }
      }

      this.an(var1, var2, var3, -998595859);
   }

   void bv(int var1, int var2, int var3) {
      int var5 = this.aq * 1303077359;
      int var6 = this.af * 628336181;
      int var7 = 1179871107 * this.al;
      mh var8 = ax;
      long var9 = (long)(var7 << 16 | var5 << 8 | var6);
      vv var4 = (vv)var8.ac(var9);
      if (null != var4) {
         if (var3 == this.al * -1797660480) {
            var4.al(var1, var2);
         } else {
            var4.bw(var1, var2, var3, var3);
         }

      }
   }

   void dr(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      float var6 = var5 / 2.0F;
      Iterator var7 = this.ah.entrySet().iterator();

      while(var7.hasNext()) {
         Entry var8 = (Entry)var7.next();
         nm var9 = (nm)var8.getKey();
         int var10 = (int)((float)(-1763049545 * var9.ae) * var5 + (float)var1 - var6);
         int var11 = (int)((float)(var4 + var2) - var5 * (float)(-266585456 * var9.ag) - var6);
         ly var12 = (ly)var8.getValue();
         if (var12 != null && var12.aj((byte)-20)) {
            var12.au = var10 * -184261105;
            var12.ar = 896793634 * var11;
            hf var13 = fq.ac(var12.ae(-1570517373), -1550157680);
            if (!var3.contains(var13.af(75591015))) {
               this.bn(var12, var10, var11, var5, -2099572552);
            }
         }
      }

   }

   static boolean eo(id var0) {
      if (var0.bz != null) {
         int[] var1 = var0.bz;

         for(int var2 = 0; var2 < var1.length; ++var2) {
            int var3 = var1[var2];
            id var4 = kf.ae(var3, (byte)116);
            if (var4.bx * 946905713 != -1) {
               return true;
            }
         }
      } else if (-1 != var0.bx * 946905713) {
         return true;
      }

      return false;
   }

   void bk(kv var1, List var2) {
      this.ah.clear();
      this.at = var1;
      this.ar(var2, -102549427);
   }

   void be(kv var1, List var2) {
      this.ah.clear();
      this.at = var1;
      this.ar(var2, 1867222388);
   }

   void bc(kv var1, List var2) {
      this.ah.clear();
      this.at = var1;
      this.ar(var2, 1585458541);
   }

   void cn(HashSet var1, List var2) {
      this.ah.clear();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         lu var4 = (lu)var3.next();
         if (var4.ak(1664596046) == 1303077359 * this.aq && var4.bn((byte)-7) == this.af * 1382873023) {
            this.au.add(var4);
         }
      }

      this.ar(var2, 1041478227);
   }

   void ab(HashSet var1, int var2, int var3, byte var4) {
      try {
         Iterator var5 = this.ah.values().iterator();

         while(var5.hasNext()) {
            if (var4 <= 8) {
               return;
            }

            ly var6 = (ly)var5.next();
            if (!var6.aj((byte)-37)) {
               if (var4 <= 8) {
                  throw new IllegalStateException();
               }
            } else {
               int var7 = var6.ae(-1570517373);
               if (var1.contains(var7)) {
                  if (var4 <= 8) {
                     return;
                  }

                  hf var8 = fq.ac(var7, 1966800471);
                  this.ak(var8, 546900797 * var6.au, -2045810419 * var6.ar, var2, var3, (byte)-84);
               }
            }
         }

         this.an(var1, var2, var3, -998595859);
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "ld.ab(" + ')');
      }
   }

   void cf(int var1, int var2, int var3, int var4, la var5) {
      for(int var6 = var1; var6 < var3 + var1; ++var6) {
         label52:
         for(int var7 = var2; var7 < var2 + var4; ++var7) {
            for(int var8 = 0; var8 < -902968388 * var5.ar; ++var8) {
               lp[] var9 = var5.aa[var8][var6][var7];
               if (var9 != null && 0 != var9.length) {
                  lp[] var10 = var9;

                  for(int var11 = 0; var11 < var10.length; ++var11) {
                     lp var12 = var10[var11];
                     id var13 = kf.ae(var12.ac * -1585924473, (byte)34);
                     if (pg.bs(var13, -1945368689)) {
                        this.at(var13, var8, var6, var7, var5, -2076626742);
                        continue label52;
                     }
                  }
               }
            }
         }
      }

   }

   void cu(int var1, int var2, int var3, int var4, la var5) {
      for(int var6 = var1; var6 < var3 + var1; ++var6) {
         label52:
         for(int var7 = var2; var7 < var2 + var4; ++var7) {
            for(int var8 = 0; var8 < 1716288713 * var5.ar; ++var8) {
               lp[] var9 = var5.aa[var8][var6][var7];
               if (var9 != null && 0 != var9.length) {
                  lp[] var10 = var9;

                  for(int var11 = 0; var11 < var10.length; ++var11) {
                     lp var12 = var10[var11];
                     id var13 = kf.ae(var12.ac * -1585924473, (byte)9);
                     if (pg.bs(var13, -477998883)) {
                        this.at(var13, var8, var6, var7, var5, -2139086936);
                        continue label52;
                     }
                  }
               }
            }
         }
      }

   }

   void cm(id var1, int var2, int var3, int var4, la var5) {
      nm var6 = new nm(var2, var3 + this.aq * 1792572352, 1558809920 * this.af + var4);
      nm var7 = null;
      if (this.at != null) {
         var7 = new nm(var2 + 620960221 * this.at.au, var3 + this.at.ax * -504453631, -52398912 * this.at.aq + var4);
      } else {
         lu var8 = (lu)var5;
         var7 = new nm(var2 + var8.au * 2080875896, var3 + -1409288128 * var8.ax + var8.ag(2068553938) * 8, var4 + var8.aq * 2106430610 + var8.am(-96643325) * 8);
      }

      hf var9;
      Object var10;
      if (var1.bz != null) {
         var10 = new kw(var7, var6, var1.au * -1484588863, this);
      } else {
         var9 = fq.ac(var1.bx * 946905713, -1395944228);
         var10 = new ll(var7, var6, var9.ax * 1901462683, this.ba(var9, 1709095275));
      }

      var9 = fq.ac(((ly)var10).ae(-1570517373), -973247424);
      if (var9.ad) {
         this.ah.put(new nm(0, var3, var4), var10);
      }

   }

   void cj(id var1, int var2, int var3, int var4, la var5) {
      nm var6 = new nm(var2, var3 + this.aq * 1792572352, 134819648 * this.af + var4);
      nm var7 = null;
      if (this.at != null) {
         var7 = new nm(var2 + 620960221 * this.at.au, var3 + this.at.ax * -1409288128, 1297684895 * this.at.aq + var4);
      } else {
         lu var8 = (lu)var5;
         var7 = new nm(var2 + var8.au * -348646090, var3 + -663603096 * var8.ax + var8.ag(2010680404) * 8, var4 + var8.aq * -52398912 + var8.am(-2094288283) * 8);
      }

      hf var9;
      Object var10;
      if (var1.bz != null) {
         var10 = new kw(var7, var6, var1.au * -1484588863, this);
      } else {
         var9 = fq.ac(var1.bx * 946905713, 1193442019);
         var10 = new ll(var7, var6, var9.ax * 386822197, this.ba(var9, -46125606));
      }

      var9 = fq.ac(((ly)var10).ae(-1570517373), -1281948706);
      if (var9.ad) {
         this.ah.put(new nm(0, var3, var4), var10);
      }

   }

   void cx(id var1, int var2, int var3, int var4, la var5) {
      nm var6 = new nm(var2, var3 + this.aq * 1792572352, 1558809920 * this.af + var4);
      nm var7 = null;
      if (this.at != null) {
         var7 = new nm(var2 + 620960221 * this.at.au, var3 + this.at.ax * -1409288128, -52398912 * this.at.aq + var4);
      } else {
         lu var8 = (lu)var5;
         var7 = new nm(var2 + var8.au * 620960221, var3 + -1409288128 * var8.ax + var8.ag(2001677650) * 8, var4 + var8.aq * -52398912 + var8.am(-789898365) * 8);
      }

      hf var9;
      Object var10;
      if (var1.bz != null) {
         var10 = new kw(var7, var6, var1.au * -1484588863, this);
      } else {
         var9 = fq.ac(var1.bx * 946905713, -445821936);
         var10 = new ll(var7, var6, var9.ax * 1901462683, this.ba(var9, -452663561));
      }

      var9 = fq.ac(((ly)var10).ae(-1570517373), -399115680);
      if (var9.ad) {
         this.ah.put(new nm(0, var3, var4), var10);
      }

   }

   void ci() {
      Iterator var1 = this.ah.values().iterator();

      while(var1.hasNext()) {
         ly var2 = (ly)var1.next();
         if (var2 instanceof kw) {
            ((kw)var2).ac(-1579510859);
         }
      }

   }

   void cy(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         ll var3 = (ll)var2.next();
         if (fq.ac(var3.ac * -1149945240, 895636908).ad && -1393900892 * var3.af.ae >> 6 == this.aq * 1989911295 && 628336181 * this.af == 1001131927 * var3.af.ag >> 6) {
            ll var4 = new ll(var3.af, var3.af, var3.ac * 174500191, this.bw(1314680731 * var3.ac, (byte)0));
            this.ad.add(var4);
         }
      }

   }

   void co(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         ll var3 = (ll)var2.next();
         if (fq.ac(var3.ac * 1314680731, 1760219894).ad && -1763049545 * var3.af.ae >> 6 == this.aq * 1303077359 && -545247000 * this.af == 1162074139 * var3.af.ag >> 6) {
            ll var4 = new ll(var3.af, var3.af, var3.ac * 1314680731, this.bw(1314680731 * var3.ac, (byte)0));
            this.ad.add(var4);
         }
      }

   }

   void cv(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         ll var3 = (ll)var2.next();
         if (fq.ac(var3.ac * 1564089703, -560121998).ad && -1763049545 * var3.af.ae >> 6 == this.aq * 1303077359 && 628336181 * this.af == -854359695 * var3.af.ag >> 6) {
            ll var4 = new ll(var3.af, var3.af, var3.ac * 1314680731, this.bw(-863953698 * var3.ac, (byte)0));
            this.ad.add(var4);
         }
      }

   }

   void cg(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         ll var3 = (ll)var2.next();
         if (fq.ac(var3.ac * -354364367, 225266470).ad && -1763049545 * var3.af.ae >> 6 == this.aq * 1455500180 && 1644704979 * this.af == 1162074139 * var3.af.ag >> 6) {
            ll var4 = new ll(var3.af, var3.af, var3.ac * 1314680731, this.bw(1314680731 * var3.ac, (byte)0));
            this.ad.add(var4);
         }
      }

   }

   void ct() {
      if (null != this.at) {
         this.at.aj(-1087124654);
      } else {
         Iterator var1 = this.au.iterator();

         while(var1.hasNext()) {
            lu var2 = (lu)var1.next();
            var2.aj(-1087124654);
         }
      }

   }

   boolean cq(po var1) {
      this.ah.clear();
      if (this.at != null) {
         this.at.ay(var1, (byte)14);
         if (this.at.as((byte)14)) {
            this.af(0, 0, 64, 64, this.at, (byte)-58);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var2 = true;

         Iterator var3;
         lu var4;
         for(var3 = this.au.iterator(); var3.hasNext(); var2 &= var4.as((byte)118)) {
            var4 = (lu)var3.next();
            var4.ay(var1, (byte)14);
         }

         if (var2) {
            var3 = this.au.iterator();

            while(var3.hasNext()) {
               var4 = (lu)var3.next();
               this.af(var4.ax(-273791809) * 8, var4.aq(-540734942) * 8, 8, 8, var4, (byte)-96);
            }
         }

         return var2;
      }
   }

   void ea(ly var1, int var2, int var3, float var4) {
      hf var5 = fq.ac(var1.ae(-1570517373), -2047255612);
      this.bh(var5, var2, var3, 1554747472);
      this.bd(var1, var5, var2, var3, var4, 1890663584);
   }

   boolean cz(po var1) {
      this.ah.clear();
      if (this.at != null) {
         this.at.ay(var1, (byte)14);
         if (this.at.as((byte)126)) {
            this.af(0, 0, 64, 64, this.at, (byte)-84);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var2 = true;

         Iterator var3;
         lu var4;
         for(var3 = this.au.iterator(); var3.hasNext(); var2 &= var4.as((byte)52)) {
            var4 = (lu)var3.next();
            var4.ay(var1, (byte)14);
         }

         if (var2) {
            var3 = this.au.iterator();

            while(var3.hasNext()) {
               var4 = (lu)var3.next();
               this.af(var4.ax(-1234722423) * 8, var4.aq(232223661) * 8, 8, 8, var4, (byte)-85);
            }
         }

         return var2;
      }
   }

   void aj(int var1, int var2, la var3, vt[] var4, int var5) {
      try {
         for(int var6 = 0; var6 < 1716288713 * var3.ar; ++var6) {
            if (var5 == -1302669048) {
               throw new IllegalStateException();
            }

            lp[] var7 = var3.aa[var6][var1][var2];
            if (var7 != null) {
               if (var5 == -1302669048) {
                  throw new IllegalStateException();
               }

               if (0 == var7.length) {
                  if (var5 == -1302669048) {
                     throw new IllegalStateException();
                  }
               } else {
                  lp[] var8 = var7;

                  for(int var9 = 0; var9 < var8.length; ++var9) {
                     if (var5 == -1302669048) {
                        return;
                     }

                     lp var10 = var8[var9];
                     int var12 = 909933211 * var10.ae;
                     boolean var10000;
                     if (var12 >= -1959052989 * om.ay.aw && var12 <= om.aj.aw * -1959052989) {
                        if (var5 == -1302669048) {
                           throw new IllegalStateException();
                        }

                        var10000 = true;
                     } else {
                        var10000 = false;
                     }

                     boolean var11 = var10000;
                     if (!var11) {
                        if (var5 == -1302669048) {
                           throw new IllegalStateException();
                        }

                        if (!hv.aq(909933211 * var10.ae, (byte)73)) {
                           continue;
                        }

                        if (var5 == -1302669048) {
                           throw new IllegalStateException();
                        }
                     }

                     id var13 = kf.ae(-1585924473 * var10.ac, (byte)23);
                     if (-1 != -708111757 * var13.bf) {
                        if (-708111757 * var13.bf != 46) {
                           if (52 != var13.bf * -708111757) {
                              var4[-708111757 * var13.bf].ax(var1 * this.al * 1179871107, (63 - var2) * this.al * 1179871107, -1935225082 * this.al, this.al * -1935225082);
                              continue;
                           }

                           if (var5 == -1302669048) {
                              throw new IllegalStateException();
                           }
                        }

                        var4[-708111757 * var13.bf].ax(1179871107 * this.al * var1, 1179871107 * this.al * (63 - var2), -1935225082 * this.al + 1, this.al * -1935225082 + 1);
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var14) {
         throw vk.ae(var14, "ld.aj(" + ')');
      }
   }

   void cd(HashSet var1, int var2, int var3) {
      Iterator var4 = this.ah.values().iterator();

      while(var4.hasNext()) {
         ly var5 = (ly)var4.next();
         if (var5.aj((byte)-76)) {
            int var6 = var5.ae(-1570517373);
            if (var1.contains(var6)) {
               hf var7 = fq.ac(var6, -319293030);
               this.ak(var7, 546900797 * var5.au, -2045810419 * var5.ar, var2, var3, (byte)-45);
            }
         }
      }

      this.an(var1, var2, var3, -998595859);
   }

   void cl(int var1, lo var2, vt[] var3, po var4, po var5, double var6) {
      this.al = var1 * -55794787;
      if (null != this.at || !this.au.isEmpty()) {
         int var9 = 1303077359 * this.aq;
         int var10 = -1153611356 * this.af;
         mh var11 = ax;
         long var12 = (long)(var1 << 16 | var9 << 8 | var10);
         vv var8 = (vv)var11.ac(var12);
         if (var8 == null) {
            if (jw.aq() != var6) {
               jw.ag(var6);
            }

            boolean var16 = true;
            var16 &= this.ad(var4, -1587979579);
            int var13;
            if (this.at != null) {
               var13 = this.at.al * 749150343;
            } else {
               var13 = ((la)this.au.getFirst()).al * 254431501;
            }

            var16 &= var5.bc(var13, -13125099);
            if (var16) {
               byte[] var17 = var5.ch(var13, (byte)-37);
               lc var14 = ch.ac(var17, -775651959);
               vv var15 = new vv(563637979 * this.al, 1891439738 * this.al);
               var15.am();
               if (null != this.at) {
                  this.az(var2, var3, var14, -1646001847);
               } else {
                  this.aa(var2, var3, var14, (byte)96);
               }

               kb.ac(var15, -1684307163 * this.aq, this.af * 314015494, this.al * -378635072, 1804542232);
               this.al(2023419);
            }
         }
      }
   }

   void dm(int var1, int var2, la var3, vt[] var4) {
      for(int var5 = 0; var5 < 1716288713 * var3.ar; ++var5) {
         lp[] var6 = var3.aa[var5][var1][var2];
         if (var6 != null && 0 != var6.length) {
            lp[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               lp var9 = var7[var8];
               int var11 = 909933211 * var9.ae;
               boolean var10 = var11 >= 959315317 * om.ay.aw && var11 <= om.aj.aw * 103951875;
               if (var10 || hv.aq(909933211 * var9.ae, (byte)-26)) {
                  id var12 = kf.ae(1885498632 * var9.ac, (byte)53);
                  if (-1 != 670451081 * var12.bf) {
                     if (-708111757 * var12.bf != 46 && 1402802041 != var12.bf * 2013160341) {
                        var4[-805302347 * var12.bf].ax(var1 * this.al * 518405176, (-905464858 - var2) * this.al * 1343964831, 936494408 * this.al, this.al * 2142276413);
                     } else {
                        var4[664528235 * var12.bf].ax(-1180865294 * this.al * var1, -1945876841 * this.al * (63 - var2), -1935225082 * this.al + 1, this.al * 2107795542 + 1);
                     }
                  }
               }
            }
         }
      }

   }

   void cs(int var1, int var2, int var3, HashSet var4) {
      if (null == var4) {
         var4 = new HashSet();
      }

      this.aw(var1, var2, var4, var3, (byte)69);
      this.bx(var1, var2, var4, var3, (byte)67);
   }

   int dw(int var1, int var2, la var3, lc var4) {
      return 0 == var3.ah[0][var1][var2] ? this.ar * 2033490009 : var4.ae(var1, var2, (byte)-51);
   }

   void cw(int var1, lo var2, vt[] var3, po var4, po var5, double var6) {
      this.al = var1 * 417095467;
      if (null != this.at || !this.au.isEmpty()) {
         int var9 = 1303077359 * this.aq;
         int var10 = 628336181 * this.af;
         mh var11 = ax;
         long var12 = (long)(var1 << 16 | var9 << 8 | var10);
         vv var8 = (vv)var11.ac(var12);
         if (var8 == null) {
            if (jw.aq() != var6) {
               jw.ag(var6);
            }

            boolean var16 = true;
            var16 &= this.ad(var4, -127251236);
            int var13;
            if (this.at != null) {
               var13 = this.at.al * 254431501;
            } else {
               var13 = ((la)this.au.getFirst()).al * 254431501;
            }

            var16 &= var5.bc(var13, -152802022);
            if (var16) {
               byte[] var17 = var5.ch(var13, (byte)91);
               lc var14 = ch.ac(var17, -775651959);
               vv var15 = new vv(-1797660480 * this.al, -1797660480 * this.al);
               var15.am();
               if (null != this.at) {
                  this.az(var2, var3, var14, -1646001847);
               } else {
                  this.aa(var2, var3, var14, (byte)46);
               }

               kb.ac(var15, 1303077359 * this.aq, this.af * 628336181, this.al * 1179871107, 287146179);
               this.al(157064088);
            }
         }
      }
   }

   void by(int var1, int var2, int var3, int var4, byte var5) {
      try {
         var3 %= 4;
         if (var3 == 0) {
            if (var5 == 1) {
               throw new IllegalStateException();
            }

            vr.fo(var1 * 1179871107 * this.al, 1179871107 * this.al * (63 - var2), this.al * 1179871107, var4);
         }

         if (var3 == 1) {
            vr.fn(var1 * this.al * 1179871107, 1179871107 * this.al * (63 - var2), this.al * 1179871107, var4);
         }

         if (var3 == 2) {
            if (var5 == 1) {
               throw new IllegalStateException();
            }

            vr.fo(this.al * 1179871107 + this.al * 1179871107 * var1 - 1, (63 - var2) * this.al * 1179871107, 1179871107 * this.al, var4);
         }

         if (3 == var3) {
            vr.fn(1179871107 * this.al * var1, this.al * 1179871107 * (63 - var2) + 1179871107 * this.al - 1, this.al * 1179871107, var4);
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ld.by(" + ')');
      }
   }

   void ca(int var1, int var2, int var3, HashSet var4) {
      if (null == var4) {
         var4 = new HashSet();
      }

      this.aw(var1, var2, var4, var3, (byte)69);
      this.bx(var1, var2, var4, var3, (byte)51);
   }

   void ar(List var1, int var2) {
      try {
         Iterator var3 = var1.iterator();

         while(var3.hasNext()) {
            if (var2 >= 1904224533) {
               return;
            }

            ll var4 = (ll)var3.next();
            if (!fq.ac(var4.ac * 1314680731, -843054537).ad) {
               if (var2 >= 1904224533) {
                  throw new IllegalStateException();
               }
            } else if (-1763049545 * var4.af.ae >> 6 == this.aq * 1303077359) {
               if (var2 >= 1904224533) {
                  throw new IllegalStateException();
               }

               if (628336181 * this.af == 1162074139 * var4.af.ag >> 6) {
                  ll var5 = new ll(var4.af, var4.af, var4.ac * 1314680731, this.bw(1314680731 * var4.ac, (byte)0));
                  this.ad.add(var5);
               }
            }
         }

      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ld.ar(" + ')');
      }
   }

   void dp(lo var1, vt[] var2, lc var3) {
      int var4;
      int var5;
      for(var4 = 0; var4 < 1178838547; ++var4) {
         for(var5 = 0; var5 < 460878922; ++var5) {
            this.ao(var4, var5, this.at, var1, var3, -1438455474);
            this.as(var4, var5, this.at, var1, (byte)3);
         }
      }

      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < -833247179; ++var5) {
            this.ai(var4, var5, this.at, var1, var2, -628405520);
         }
      }

   }

   boolean cc(po var1) {
      this.ah.clear();
      if (this.at != null) {
         this.at.ay(var1, (byte)14);
         if (this.at.as((byte)125)) {
            this.af(0, 0, 64, 64, this.at, (byte)-29);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var2 = true;

         Iterator var3;
         lu var4;
         for(var3 = this.au.iterator(); var3.hasNext(); var2 &= var4.as((byte)29)) {
            var4 = (lu)var3.next();
            var4.ay(var1, (byte)14);
         }

         if (var2) {
            var3 = this.au.iterator();

            while(var3.hasNext()) {
               var4 = (lu)var3.next();
               this.af(var4.ax(651703781) * 8, var4.aq(-654538764) * 8, 8, 8, var4, (byte)-96);
            }
         }

         return var2;
      }
   }

   void dv(lo var1, vt[] var2, lc var3) {
      Iterator var4 = this.au.iterator();

      lu var5;
      int var6;
      int var7;
      while(var4.hasNext()) {
         var5 = (lu)var4.next();

         for(var6 = var5.ax(-714371114) * 8; var6 < var5.ax(-1185936644) * 8 + 8; ++var6) {
            for(var7 = var5.aq(351380546) * 8; var7 < var5.aq(-1517887868) * 8 + 8; ++var7) {
               this.ao(var6, var7, var5, var1, var3, -1100863466);
               this.as(var6, var7, var5, var1, (byte)3);
            }
         }
      }

      var4 = this.au.iterator();

      while(var4.hasNext()) {
         var5 = (lu)var4.next();

         for(var6 = var5.ax(1693226680) * 8; var6 < var5.ax(-736182277) * 8 + 8; ++var6) {
            for(var7 = var5.aq(-1305631907) * 8; var7 < var5.aq(-149333765) * 8 + 8; ++var7) {
               this.ai(var6, var7, var5, var1, var2, 1495618847);
            }
         }
      }

   }

   void dt(lo var1, vt[] var2, lc var3) {
      Iterator var4 = this.au.iterator();

      lu var5;
      int var6;
      int var7;
      while(var4.hasNext()) {
         var5 = (lu)var4.next();

         for(var6 = var5.ax(-534997157) * 8; var6 < var5.ax(-565861529) * 8 + 8; ++var6) {
            for(var7 = var5.aq(327609356) * 8; var7 < var5.aq(-1288082042) * 8 + 8; ++var7) {
               this.ao(var6, var7, var5, var1, var3, -2092703109);
               this.as(var6, var7, var5, var1, (byte)3);
            }
         }
      }

      var4 = this.au.iterator();

      while(var4.hasNext()) {
         var5 = (lu)var4.next();

         for(var6 = var5.ax(-1019719927) * 8; var6 < var5.ax(-805786577) * 8 + 8; ++var6) {
            for(var7 = var5.aq(-1043795257) * 8; var7 < var5.aq(-1277586236) * 8 + 8; ++var7) {
               this.ai(var6, var7, var5, var1, var2, 902959986);
            }
         }
      }

   }

   void dk(int var1, int var2, la var3, lo var4, vt[] var5) {
      this.av(var1, var2, var3, (byte)-85);
      this.aj(var1, var2, var3, var5, 2013092152);
   }

   void dl(int var1, int var2, la var3, lo var4, vt[] var5) {
      this.av(var1, var2, var3, (byte)-63);
      this.aj(var1, var2, var3, var5, -1772813323);
   }

   void db(int var1, int var2, la var3, lo var4, vt[] var5) {
      this.av(var1, var2, var3, (byte)-82);
      this.aj(var1, var2, var3, var5, -900537752);
   }

   void dc(int var1, int var2, la var3, lo var4) {
      for(int var5 = 1; var5 < var3.ar * 1716288713; ++var5) {
         int var6 = var3.ap[var5][var1][var2] - 1;
         if (var6 > -1) {
            int var8 = this.ar * 2033490009;
            ia var10 = (ia)ia.ae.ac((long)var6);
            ia var9;
            if (var10 != null) {
               var9 = var10;
            } else {
               byte[] var11 = ia.ac.bt(4, var6, (byte)14);
               var10 = new ia();
               if (var11 != null) {
                  var10.ae(new vf(var11), var6, (byte)0);
               }

               var10.ac(580216259);
               ia.ae.ag(var10, (long)var6);
               var9 = var10;
            }

            int var7;
            if (null == var9) {
               var7 = var8;
            } else {
               int var12;
               byte var13;
               int var15;
               int var16;
               if (var9.aq * -1193926069 >= 0) {
                  var15 = eq.ac(-336599249 * var9.ar, var9.al * 1303900443, -1167656883 * var9.ad, -1603779059);
                  var13 = 96;
                  if (var15 == -2) {
                     var12 = 12345678;
                  } else if (-1 == var15) {
                     if (var13 < 0) {
                        var13 = 0;
                     } else if (var13 > 127) {
                        var13 = 127;
                     }

                     var16 = 127 - var13;
                     var12 = var16;
                  } else {
                     var16 = (var15 & 127) * var13 / 128;
                     if (var16 < 2) {
                        var16 = 2;
                     } else if (var16 > 126) {
                        var16 = 126;
                     }

                     var12 = var16 + (var15 & 'ﾀ');
                  }

                  var7 = jw.ac[var12] | -16777216;
               } else if (var9.am * 633794047 >= 0) {
                  var12 = jw.af.af.am(var9.am * 633794047, -2138657830);
                  var13 = 96;
                  if (var12 == -2) {
                     var15 = 12345678;
                  } else if (-1 == var12) {
                     if (var13 < 0) {
                        var13 = 0;
                     } else if (var13 > 127) {
                        var13 = 127;
                     }

                     var16 = 127 - var13;
                     var15 = var16;
                  } else {
                     var16 = var13 * (var12 & 127) / 128;
                     if (var16 < 2) {
                        var16 = 2;
                     } else if (var16 > 126) {
                        var16 = 126;
                     }

                     var15 = (var12 & 'ﾀ') + var16;
                  }

                  var7 = jw.ac[var15] | -16777216;
               } else if (var9.ag * 1679504163 == 16711935) {
                  var7 = var8;
               } else {
                  var15 = eq.ac(var9.af * -204798379, 1155509615 * var9.at, var9.au * 1570391835, 363591436);
                  var13 = 96;
                  if (var15 == -2) {
                     var12 = 12345678;
                  } else if (-1 == var15) {
                     if (var13 < 0) {
                        var13 = 0;
                     } else if (var13 > 127) {
                        var13 = 127;
                     }

                     var16 = 127 - var13;
                     var12 = var16;
                  } else {
                     var16 = var13 * (var15 & 127) / 128;
                     if (var16 < 2) {
                        var16 = 2;
                     } else if (var16 > 126) {
                        var16 = 126;
                     }

                     var12 = var16 + (var15 & 'ﾀ');
                  }

                  var7 = jw.ac[var12] | -16777216;
               }
            }

            if (var3.ab[var5][var1][var2] == 0) {
               vr.fr(var1 * this.al * 1179871107, 1179871107 * this.al * (63 - var2), 1179871107 * this.al, this.al * 1179871107, var7);
            } else {
               var4.ac(1179871107 * this.al * var1, this.al * 1179871107 * (63 - var2), 0, var7, this.al * 1179871107, this.al * 1179871107, var3.ab[var5][var1][var2], var3.az[var5][var1][var2], (byte)4);
            }
         }
      }

   }

   static void bi(vv var0, int var1, int var2, int var3) {
      mh var4 = ax;
      long var6 = (long)(var3 << 16 | var1 << 8 | var2);
      var4.ax(var0, var6, 4 * var0.ac.length);
   }

   int de(int var1, int var2, la var3, lc var4) {
      return 0 == var3.ah[0][var1][var2] ? this.ar * -616068281 : var4.ae(var1, var2, (byte)1);
   }

   int dx(int var1, int var2, la var3, lc var4) {
      return 0 == var3.ah[0][var1][var2] ? this.ar * 2033490009 : var4.ae(var1, var2, (byte)-11);
   }

   int dj(int var1, int var2, la var3, lc var4) {
      return 0 == var3.ah[0][var1][var2] ? this.ar * 2033490009 : var4.ae(var1, var2, (byte)-34);
   }

   void ev(ly var1, hf var2, int var3, int var4, float var5) {
      ls var6 = var1.ag((byte)-33);
      if (null != var6) {
         if (var6.am.ae(var5, 725353469)) {
            qu var7 = (qu)this.ap.get(var6.am);
            var7.aj(var6.ac, var3 - -226092551 * var6.ae / 2, var4, -226092551 * var6.ae, var6.ag * -1251074858, -1980212011 | 253024691 * var2.au, 0, 1, 0, var7.at / 2);
         }
      }
   }

   void dg(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      float var6 = var5 / 2.0F;
      Iterator var7 = this.ah.entrySet().iterator();

      while(var7.hasNext()) {
         Entry var8 = (Entry)var7.next();
         nm var9 = (nm)var8.getKey();
         int var10 = (int)((float)(-1763049545 * var9.ae) * var5 + (float)var1 - var6);
         int var11 = (int)((float)(var4 + var2) - var5 * (float)(1162074139 * var9.ag) - var6);
         ly var12 = (ly)var8.getValue();
         if (var12 != null && var12.aj((byte)18)) {
            var12.au = var10 * 1227596821;
            var12.ar = 1550355909 * var11;
            hf var13 = fq.ac(var12.ae(-1570517373), 711291889);
            if (!var3.contains(var13.af(423981527))) {
               this.bn(var12, var10, var11, var5, 1366644226);
            }
         }
      }

   }

   void bh(hf var1, int var2, int var3, int var4) {
      try {
         vv var5 = var1.ax(false, 251410253);
         if (var5 != null) {
            int var6 = this.bf(var5, var1.ay, 1646952437);
            int var7 = this.bm(var5, var1.aj, -248686533);
            var5.ah(var2 + var6, var7 + var3);
         }

      } catch (RuntimeException var8) {
         throw vk.ae(var8, "ld.bh(" + ')');
      }
   }

   void dh(int var1, int var2, la var3, vt[] var4) {
      for(int var5 = 0; var5 < 1716288713 * var3.ar; ++var5) {
         lp[] var6 = var3.aa[var5][var1][var2];
         if (var6 != null && 0 != var6.length) {
            lp[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               lp var9 = var7[var8];
               int var11 = 909933211 * var9.ae;
               boolean var10 = var11 >= -1959052989 * om.ay.aw && var11 <= om.aj.aw * -1959052989;
               if (var10 || hv.aq(909933211 * var9.ae, (byte)-29)) {
                  id var12 = kf.ae(-1585924473 * var9.ac, (byte)24);
                  if (-1 != -708111757 * var12.bf) {
                     if (-708111757 * var12.bf != 46 && 52 != var12.bf * -708111757) {
                        var4[-708111757 * var12.bf].ax(var1 * this.al * 1179871107, (63 - var2) * this.al * 1179871107, -1935225082 * this.al, this.al * -1935225082);
                     } else {
                        var4[-708111757 * var12.bf].ax(1179871107 * this.al * var1, 1179871107 * this.al * (63 - var2), -1935225082 * this.al + 1, this.al * -1935225082 + 1);
                     }
                  }
               }
            }
         }
      }

   }

   void di(int var1, int var2, la var3) {
      for(int var4 = 0; var4 < -1809361526 * var3.ar; ++var4) {
         lp[] var5 = var3.aa[var4][var1][var2];
         if (var5 != null && 0 != var5.length) {
            lp[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               lp var8 = var6[var7];
               if (dn.ax(var8.ae * 909933211, 1353926986)) {
                  id var9 = kf.ae(var8.ac * -2116834775, (byte)25);
                  int var10 = -1478169491 * var9.ay != 0 ? 997911037 : 868961856;
                  if (-1959052989 * om.ac.aw == var8.ae * 530726609) {
                     this.by(var1, var2, var8.ag * 164424226, var10, (byte)-49);
                  }

                  if (var8.ae * -575351316 == -1959052989 * om.ag.aw) {
                     this.by(var1, var2, var8.ag * 879128647, -1666216756, (byte)26);
                     this.by(var1, var2, 1 + var8.ag * 428020261, var10, (byte)-23);
                  }

                  if (om.am.aw * -1959052989 == var8.ae * -249574659) {
                     if (0 == 428020261 * var8.ag) {
                        vr.fn(this.al * 1179871107 * var1, (-1062051712 - var2) * this.al * 1179871107, 1, var10);
                     }

                     if (var8.ag * 428020261 == 1) {
                        vr.fn(var1 * this.al * -1845791614 + this.al * 1179871107 - 1, (63 - var2) * 1638123746 * this.al, 1, var10);
                     }

                     if (2 == -1281989746 * var8.ag) {
                        vr.fn(this.al * -1172371067 + 1179871107 * this.al * var1 - 1, 1179871107 * this.al + (647605551 - var2) * 1179871107 * this.al - 1, 1, var10);
                     }

                     if (3 == 213694113 * var8.ag) {
                        vr.fn(var1 * this.al * 119822668, this.al * 971086750 + this.al * 558006359 * (-852038526 - var2) - 1, 1, var10);
                     }
                  }

                  if (var8.ae * 909933211 == om.ax.aw * -1959052989) {
                     int var11 = 428020261 * var8.ag % 2;
                     int var12;
                     if (var11 == 0) {
                        for(var12 = 0; var12 < this.al * -1255132841; ++var12) {
                           vr.fn(1179871107 * this.al * var1 + var12, (942661933 - var2) * this.al * 1179871107 - 1 - var12, 1, var10);
                        }
                     } else {
                        for(var12 = 0; var12 < this.al * -854739188; ++var12) {
                           vr.fn(var1 * this.al * 1179871107 + var12, var12 + (63 - var2) * this.al * 1179871107, 1, var10);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   void da(int var1, int var2, la var3) {
      for(int var4 = 0; var4 < 1716288713 * var3.ar; ++var4) {
         lp[] var5 = var3.aa[var4][var1][var2];
         if (var5 != null && 0 != var5.length) {
            lp[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               lp var8 = var6[var7];
               if (dn.ax(var8.ae * 909933211, 1003746281)) {
                  id var9 = kf.ae(var8.ac * -1585924473, (byte)67);
                  int var10 = -1478169491 * var9.ay != 0 ? -3407872 : -3355444;
                  if (-1959052989 * om.ac.aw == var8.ae * 909933211) {
                     this.by(var1, var2, var8.ag * 428020261, var10, (byte)55);
                  }

                  if (var8.ae * 909933211 == -1959052989 * om.ag.aw) {
                     this.by(var1, var2, var8.ag * 428020261, -3355444, (byte)-11);
                     this.by(var1, var2, 1 + var8.ag * 428020261, var10, (byte)-83);
                  }

                  if (om.am.aw * -1959052989 == var8.ae * 909933211) {
                     if (0 == 428020261 * var8.ag) {
                        vr.fn(this.al * 1179871107 * var1, (63 - var2) * this.al * 1179871107, 1, var10);
                     }

                     if (var8.ag * 428020261 == 1) {
                        vr.fn(var1 * this.al * 1179871107 + this.al * 1179871107 - 1, (63 - var2) * 1179871107 * this.al, 1, var10);
                     }

                     if (2 == 428020261 * var8.ag) {
                        vr.fn(this.al * 1179871107 + 1179871107 * this.al * var1 - 1, 1179871107 * this.al + (63 - var2) * 1179871107 * this.al - 1, 1, var10);
                     }

                     if (3 == 428020261 * var8.ag) {
                        vr.fn(var1 * this.al * 1179871107, this.al * 1179871107 + this.al * 1179871107 * (63 - var2) - 1, 1, var10);
                     }
                  }

                  if (var8.ae * 909933211 == om.ax.aw * -1959052989) {
                     int var11 = 428020261 * var8.ag % 2;
                     int var12;
                     if (var11 == 0) {
                        for(var12 = 0; var12 < this.al * 1179871107; ++var12) {
                           vr.fn(1179871107 * this.al * var1 + var12, (64 - var2) * this.al * 1179871107 - 1 - var12, 1, var10);
                        }
                     } else {
                        for(var12 = 0; var12 < this.al * 1179871107; ++var12) {
                           vr.fn(var1 * this.al * 1179871107 + var12, var12 + (63 - var2) * this.al * 1179871107, 1, var10);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   void dz(int var1, int var2, la var3) {
      for(int var4 = 0; var4 < 1716288713 * var3.ar; ++var4) {
         lp[] var5 = var3.aa[var4][var1][var2];
         if (var5 != null && 0 != var5.length) {
            lp[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               lp var8 = var6[var7];
               if (dn.ax(var8.ae * 909933211, 1465785174)) {
                  id var9 = kf.ae(var8.ac * -1585924473, (byte)106);
                  int var10 = -1478169491 * var9.ay != 0 ? -3407872 : -3355444;
                  if (-1959052989 * om.ac.aw == var8.ae * 909933211) {
                     this.by(var1, var2, var8.ag * 428020261, var10, (byte)-69);
                  }

                  if (var8.ae * 909933211 == -1959052989 * om.ag.aw) {
                     this.by(var1, var2, var8.ag * 428020261, -3355444, (byte)-7);
                     this.by(var1, var2, 1 + var8.ag * 428020261, var10, (byte)-51);
                  }

                  if (om.am.aw * -1959052989 == var8.ae * 909933211) {
                     if (0 == 428020261 * var8.ag) {
                        vr.fn(this.al * 1179871107 * var1, (63 - var2) * this.al * 1179871107, 1, var10);
                     }

                     if (var8.ag * 428020261 == 1) {
                        vr.fn(var1 * this.al * 1179871107 + this.al * 1179871107 - 1, (63 - var2) * 1179871107 * this.al, 1, var10);
                     }

                     if (2 == 428020261 * var8.ag) {
                        vr.fn(this.al * 1179871107 + 1179871107 * this.al * var1 - 1, 1179871107 * this.al + (63 - var2) * 1179871107 * this.al - 1, 1, var10);
                     }

                     if (3 == 428020261 * var8.ag) {
                        vr.fn(var1 * this.al * 1179871107, this.al * 1179871107 + this.al * 1179871107 * (63 - var2) - 1, 1, var10);
                     }
                  }

                  if (var8.ae * 909933211 == om.ax.aw * -1959052989) {
                     int var11 = 428020261 * var8.ag % 2;
                     int var12;
                     if (var11 == 0) {
                        for(var12 = 0; var12 < this.al * 1179871107; ++var12) {
                           vr.fn(1179871107 * this.al * var1 + var12, (64 - var2) * this.al * 1179871107 - 1 - var12, 1, var10);
                        }
                     } else {
                        for(var12 = 0; var12 < this.al * 1179871107; ++var12) {
                           vr.fn(var1 * this.al * 1179871107 + var12, var12 + (63 - var2) * this.al * 1179871107, 1, var10);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   void df(lo var1, vt[] var2, lc var3) {
      Iterator var4 = this.au.iterator();

      lu var5;
      int var6;
      int var7;
      while(var4.hasNext()) {
         var5 = (lu)var4.next();

         for(var6 = var5.ax(-1436487892) * 8; var6 < var5.ax(-1282683539) * 8 + 8; ++var6) {
            for(var7 = var5.aq(-63056925) * 8; var7 < var5.aq(-922703178) * 8 + 8; ++var7) {
               this.ao(var6, var7, var5, var1, var3, -1437621711);
               this.as(var6, var7, var5, var1, (byte)3);
            }
         }
      }

      var4 = this.au.iterator();

      while(var4.hasNext()) {
         var5 = (lu)var4.next();

         for(var6 = var5.ax(358595931) * 8; var6 < var5.ax(694673965) * 8 + 8; ++var6) {
            for(var7 = var5.aq(-1138303957) * 8; var7 < var5.aq(-1615046976) * 8 + 8; ++var7) {
               this.ai(var6, var7, var5, var1, var2, -1038434280);
            }
         }
      }

   }

   ld(int var1, int var2, int var3, HashMap var4) {
      try {
         super();
         this.aq = 979758351 * var1;
         this.af = var2 * 1650654237;
         this.au = new LinkedList();
         this.ad = new LinkedList();
         this.ah = new HashMap();
         this.ar = 189870057 * (var3 | -16777216);
         this.ap = var4;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ld.<init>(" + ')');
      }
   }

   void dy(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      float var6 = var5 / 2.0F;
      Iterator var7 = this.ah.entrySet().iterator();

      while(var7.hasNext()) {
         Entry var8 = (Entry)var7.next();
         nm var9 = (nm)var8.getKey();
         int var10 = (int)((float)(-1763049545 * var9.ae) * var5 + (float)var1 - var6);
         int var11 = (int)((float)(var4 + var2) - var5 * (float)(1162074139 * var9.ag) - var6);
         ly var12 = (ly)var8.getValue();
         if (var12 != null && var12.aj((byte)-67)) {
            var12.au = var10 * 1227596821;
            var12.ar = 1550355909 * var11;
            hf var13 = fq.ac(var12.ae(-1570517373), 1232147936);
            if (!var3.contains(var13.af(802419585))) {
               this.bn(var12, var10, var11, var5, -1950125993);
            }
         }
      }

   }

   void am(int var1, int var2, int var3, int var4) {
      try {
         int var6 = this.aq * 1303077359;
         int var7 = this.af * 628336181;
         int var8 = 1179871107 * this.al;
         mh var9 = ax;
         long var10 = (long)(var8 << 16 | var6 << 8 | var7);
         vv var5 = (vv)var9.ac(var10);
         if (null != var5) {
            if (var3 == this.al * -1797660480) {
               var5.al(var1, var2);
            } else {
               var5.bw(var1, var2, var3, var3);
            }

         }
      } catch (RuntimeException var12) {
         throw vk.ae(var12, "ld.am(" + ')');
      }
   }

   void dn(HashSet var1, int var2, int var3) {
      Iterator var4 = this.ad.iterator();

      while(var4.hasNext()) {
         ly var5 = (ly)var4.next();
         if (var5.aj((byte)42)) {
            hf var6 = fq.ac(var5.ae(-1570517373), -172417144);
            if (null != var6 && var1.contains(var6.af(839226962))) {
               this.ak(var6, var5.au * 546900797, -2045810419 * var5.ar, var2, var3, (byte)-12);
            }
         }
      }

   }

   void ez(ly var1, int var2, int var3, float var4) {
      hf var5 = fq.ac(var1.ae(-1570517373), -923287836);
      this.bh(var5, var2, var3, 2068217462);
      this.bd(var1, var5, var2, var3, var4, 1879953411);
   }

   void dd(hf var1, int var2, int var3, int var4, int var5) {
      vv var6 = var1.ax(false, -813098064);
      if (null != var6) {
         var6.ah(var2 - var6.ae / 2, var3 - var6.ag / 2);
         if (var4 % var5 < var5 / 2) {
            vr.fk(var2, var3, 15, 16776960, -295111304);
            vr.fk(var2, var3, 7, 16777215, 256);
         }

      }
   }

   void eg(ly var1, int var2, int var3, float var4) {
      hf var5 = fq.ac(var1.ae(-1570517373), 1649454129);
      this.bh(var5, var2, var3, 1551648554);
      this.bd(var1, var5, var2, var3, var4, 2087582035);
   }

   ls el(int var1) {
      hf var2 = fq.ac(var1, 881683268);
      return this.ba(var2, 661176320);
   }

   void bo(int var1, int var2, int var3) {
      int var5 = this.aq * 1303077359;
      int var6 = this.af * 628336181;
      int var7 = 1179871107 * this.al;
      mh var8 = ax;
      long var9 = (long)(var7 << 16 | var5 << 8 | var6);
      vv var4 = (vv)var8.ac(var9);
      if (null != var4) {
         if (var3 == this.al * -1797660480) {
            var4.al(var1, var2);
         } else {
            var4.bw(var1, var2, var3, var3);
         }

      }
   }

   List en(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var6 = new LinkedList();
      if (var4 >= var1 && var5 >= var2) {
         if (var4 < var3 + var1 && var5 < var3 + var2) {
            Iterator var7 = this.ah.values().iterator();

            ly var8;
            while(var7.hasNext()) {
               var8 = (ly)var7.next();
               if (var8.aj((byte)-73) && var8.ay(var4, var5, -1515036387)) {
                  var6.add(var8);
               }
            }

            var7 = this.ad.iterator();

            while(var7.hasNext()) {
               var8 = (ly)var7.next();
               if (var8.aj((byte)-46) && var8.ay(var4, var5, -1270464915)) {
                  var6.add(var8);
               }
            }

            return var6;
         } else {
            return var6;
         }
      } else {
         return var6;
      }
   }

   void cr(int var1, lo var2, vt[] var3, po var4, po var5, double var6) {
      this.al = var1 * 417095467;
      if (null != this.at || !this.au.isEmpty()) {
         int var9 = -1100381312 * this.aq;
         int var10 = 628336181 * this.af;
         mh var11 = ax;
         long var12 = (long)(var1 << 16 | var9 << 8 | var10);
         vv var8 = (vv)var11.ac(var12);
         if (var8 == null) {
            if (jw.aq() != var6) {
               jw.ag(var6);
            }

            boolean var16 = true;
            var16 &= this.ad(var4, -1868531152);
            int var13;
            if (this.at != null) {
               var13 = this.at.al * 254431501;
            } else {
               var13 = ((la)this.au.getFirst()).al * -1279064229;
            }

            var16 &= var5.bc(var13, 1551990574);
            if (var16) {
               byte[] var17 = var5.ch(var13, (byte)-52);
               lc var14 = ch.ac(var17, -775651959);
               vv var15 = new vv(456931887 * this.al, 1310698185 * this.al);
               var15.am();
               if (null != this.at) {
                  this.az(var2, var3, var14, -1646001847);
               } else {
                  this.aa(var2, var3, var14, (byte)3);
               }

               kb.ac(var15, 1303077359 * this.aq, this.af * 628336181, this.al * -454702083, 520362009);
               this.al(-128585200);
            }
         }
      }
   }

   int ew(vv var1, hg var2) {
      switch(var2.am * -1047412351) {
      case 1:
         return 0;
      case 2:
         return -var1.ae / 2;
      default:
         return -var1.ae;
      }
   }

   int ep(vv var1, hg var2) {
      switch(var2.am * -1047412351) {
      case 1:
         return 0;
      case 2:
         return -var1.ae / 2;
      default:
         return -var1.ae;
      }
   }

   int ex(vv var1, hq var2) {
      switch(var2.am * -569774967) {
      case 0:
         return -var1.ag / 2;
      case 1:
         return 0;
      default:
         return -var1.ag;
      }
   }

   public static void br() {
      ax.aq(5);
   }

   static boolean eu(id var0) {
      if (var0.bz != null) {
         int[] var1 = var0.bz;

         for(int var2 = 0; var2 < var1.length; ++var2) {
            int var3 = var1[var2];
            id var4 = kf.ae(var3, (byte)9);
            if (var4.bx * 946905713 != -1) {
               return true;
            }
         }
      } else if (-1 != var0.bx * 946905713) {
         return true;
      }

      return false;
   }

   static boolean ei(id var0) {
      if (var0.bz != null) {
         int[] var1 = var0.bz;

         for(int var2 = 0; var2 < var1.length; ++var2) {
            int var3 = var1[var2];
            id var4 = kf.ae(var3, (byte)108);
            if (var4.bx * 946905713 != -1) {
               return true;
            }
         }
      } else if (-1 != var0.bx * -1854967635) {
         return true;
      }

      return false;
   }

   void ck(lo var1, vt[] var2, lc var3) {
      int var4;
      int var5;
      for(var4 = 0; var4 < 2050140161; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.ao(var4, var5, this.at, var1, var3, -1716948358);
            this.as(var4, var5, this.at, var1, (byte)3);
         }
      }

      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < -110261220; ++var5) {
            this.ai(var4, var5, this.at, var1, var2, -2141073809);
         }
      }

   }

   void ds(HashSet var1, int var2, int var3) {
      Iterator var4 = this.ad.iterator();

      while(var4.hasNext()) {
         ly var5 = (ly)var4.next();
         if (var5.aj((byte)25)) {
            hf var6 = fq.ac(var5.ae(-1570517373), 184847016);
            if (null != var6 && var1.contains(var6.af(1212310141))) {
               this.ak(var6, var5.au * 546900797, -2045810419 * var5.ar, var2, var3, (byte)-69);
            }
         }
      }

   }

   ls em(hf var1) {
      if (var1.at != null && null != this.ap && this.ap.get(ko.ac) != null) {
         int var3 = var1.ar * -1285016691;
         ko[] var4 = ko.ac(245295070);
         int var5 = 0;

         ko var2;
         while(true) {
            if (var5 >= var4.length) {
               var2 = null;
               break;
            }

            ko var6 = var4[var5];
            if (var3 == -1237526349 * var6.ax) {
               var2 = var6;
               break;
            }

            ++var5;
         }

         if (null == var2) {
            return null;
         } else {
            qu var14 = (qu)this.ap.get(var2);
            if (null == var14) {
               return null;
            } else {
               int var15 = var14.ab(var1.at, 1000000);
               String[] var7 = new String[var15];
               var14.ah(var1.at, (int[])null, var7);
               int var8 = var14.at * var7.length / 2;
               int var9 = 0;
               String[] var10 = var7;

               for(int var11 = 0; var11 < var10.length; ++var11) {
                  String var12 = var10[var11];
                  int var13 = var14.ad(var12);
                  if (var13 > var9) {
                     var9 = var13;
                  }
               }

               return new ls(var1.at, var9, var8, var2);
            }
         }
      } else {
         return null;
      }
   }

   int do(int var1, int var2, la var3, lc var4) {
      return 0 == var3.ah[0][var1][var2] ? this.ar * 2033490009 : var4.ae(var1, var2, (byte)-49);
   }

   List eb() {
      LinkedList var1 = new LinkedList();
      var1.addAll(this.ad);
      var1.addAll(this.ah.values());
      return var1;
   }

   List ek() {
      LinkedList var1 = new LinkedList();
      var1.addAll(this.ad);
      var1.addAll(this.ah.values());
      return var1;
   }

   void es(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if (var3 == 0) {
         vr.fo(var1 * 1179871107 * this.al, 1179871107 * this.al * (63 - var2), this.al * 1179871107, var4);
      }

      if (var3 == 1) {
         vr.fn(var1 * this.al * 1179871107, 1179871107 * this.al * (63 - var2), this.al * 1179871107, var4);
      }

      if (var3 == 2) {
         vr.fo(this.al * 1179871107 + this.al * 1179871107 * var1 - 1, (63 - var2) * this.al * 1179871107, 1179871107 * this.al, var4);
      }

      if (3 == var3) {
         vr.fn(1179871107 * this.al * var1, this.al * 1179871107 * (63 - var2) + 1179871107 * this.al - 1, this.al * 1179871107, var4);
      }

   }

   void ey(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if (var3 == 0) {
         vr.fo(var1 * -996390460 * this.al, 1179871107 * this.al * (63 - var2), this.al * -1062958624, var4);
      }

      if (var3 == 1) {
         vr.fn(var1 * this.al * -559395252, -1083626296 * this.al * (63 - var2), this.al * 1179871107, var4);
      }

      if (var3 == 2) {
         vr.fo(this.al * 700178617 + this.al * 1179871107 * var1 - 1, (63 - var2) * this.al * -334876816, -1803279286 * this.al, var4);
      }

      if (3 == var3) {
         vr.fn(-1840977932 * this.al * var1, this.al * 1778293183 * (224009767 - var2) + 1179871107 * this.al - 1, this.al * 1179871107, var4);
      }

   }

   void er(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if (var3 == 0) {
         vr.fo(var1 * 1179871107 * this.al, 954560574 * this.al * (63 - var2), this.al * 1179871107, var4);
      }

      if (var3 == 1) {
         vr.fn(var1 * this.al * -1262795568, 1179871107 * this.al * (1909945193 - var2), this.al * -1762145363, var4);
      }

      if (var3 == 2) {
         vr.fo(this.al * 1179871107 + this.al * -1606708029 * var1 - 1, (63 - var2) * this.al * 1779390889, 1179871107 * this.al, var4);
      }

      if (3 == var3) {
         vr.fn(1179871107 * this.al * var1, this.al * -1198808689 * (63 - var2) + -76437173 * this.al - 1, this.al * 967356099, var4);
      }

   }
}
