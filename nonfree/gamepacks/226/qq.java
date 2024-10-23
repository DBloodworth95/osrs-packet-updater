public class qq {
   static vc[] kg;

   qq() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "qq.<init>(" + ')');
      }
   }

   public static int aj(CharSequence var0, CharSequence var1, pn var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;

      int var9;
      int var10;
      int var11;
      while(var5 - var7 < var3 || var6 - var8 < var4) {
         if (var5 - var7 >= var3) {
            return -1;
         }

         if (var6 - var8 >= var4) {
            return 1;
         }

         if (var7 != 0) {
            var9 = var7;
            boolean var14 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         if (var8 != 0) {
            var10 = var8;
            boolean var15 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         if (198 == var9) {
            var11 = -1264140335;
         } else if (var9 == -756806296) {
            var11 = 1429573674;
         } else if (223 == var9) {
            var11 = 478763513;
         } else if (var9 == 670937680) {
            var11 = 69;
         } else if (81491093 == var9) {
            var11 = 101;
         } else {
            var11 = 0;
         }

         var7 = var11;
         int var12;
         if (var10 == 198) {
            var12 = 69;
         } else if (var10 == 230) {
            var12 = 101;
         } else if (223 == var10) {
            var12 = 115;
         } else if (var10 == 999182377) {
            var12 = -671126011;
         } else if (var10 == 339) {
            var12 = -1062905461;
         } else {
            var12 = 0;
         }

         var8 = var12;
         char var16 = dl.aw((char)var9, var2, (byte)58);
         char var17 = dl.aw((char)var10, var2, (byte)-13);
         if (var17 != var16 && Character.toUpperCase(var16) != Character.toUpperCase(var17)) {
            var16 = Character.toLowerCase(var16);
            var17 = Character.toLowerCase(var17);
            if (var16 != var17) {
               return ry.ak(var16, var2, (short)21714) - ry.ak(var17, var2, (short)4948);
            }
         }
      }

      var9 = Math.min(var3, var4);

      char var19;
      for(var10 = 0; var10 < var9; ++var10) {
         if (var2 == pn.ak) {
            var5 = var3 - 1 - var10;
            var6 = var4 - 1 - var10;
         } else {
            var6 = var10;
            var5 = var10;
         }

         char var18 = var0.charAt(var5);
         var19 = var1.charAt(var6);
         if (var19 != var18 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
            var18 = Character.toLowerCase(var18);
            var19 = Character.toLowerCase(var19);
            if (var18 != var19) {
               return ry.ak(var18, var2, (short)5970) - ry.ak(var19, var2, (short)11042);
            }
         }
      }

      var10 = var3 - var4;
      if (var10 != 0) {
         return var10;
      } else {
         for(var11 = 0; var11 < var9; ++var11) {
            var19 = var0.charAt(var11);
            char var13 = var1.charAt(var11);
            if (var13 != var19) {
               return ry.ak(var19, var2, (short)11089) - ry.ak(var13, var2, (short)31698);
            }
         }

         return 0;
      }
   }

   static char ai(char var0, pn var1) {
      if (var0 >= 192 && var0 <= 255) {
         if (var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if (199 == var0) {
            return 'C';
         }

         if (var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if (var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if (209 == var0 && pn.ay != var1) {
            return 'N';
         }

         if (var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if (var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if (221 == var0) {
            return 'Y';
         }

         if (var0 == 223) {
            return 's';
         }

         if (var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if (var0 == 231) {
            return 'c';
         }

         if (var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if (var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if (241 == var0 && var1 != pn.ay) {
            return 'n';
         }

         if (var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if (var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if (253 == var0 || 255 == var0) {
            return 'y';
         }
      }

      if (338 == var0) {
         return 'O';
      } else if (339 == var0) {
         return 'o';
      } else if (376 == var0) {
         return 'Y';
      } else {
         return var0;
      }
   }

   static int ay(char var0, pn var1) {
      int var2 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = 1 + (var0 << 4);
      }

      if (241 == var0 && var1 == pn.ay) {
         var2 = -1088500837;
      }

      return var2;
   }

   static final void kq(dn var0, boolean var1, vm var2, int var3, byte var4) {
      try {
         client.ns = 0;
         client.hh = 0;
         var2.ae(527445275);
         int var5 = var2.am(8, -2095465762);
         int var6;
         if (var5 < var0.af * 2099244795) {
            if (var4 != 7) {
               throw new IllegalStateException();
            }

            for(var6 = var5; var6 < 2099244795 * var0.af; ++var6) {
               if (var4 != 7) {
                  return;
               }

               client.nw[(client.ns += -1720090443) * 39021981 - 1] = var0.ar[var6];
            }
         }

         if (var5 > var0.af * 2099244795) {
            throw new RuntimeException("");
         } else {
            var0.af = 0;

            int var7;
            int var11;
            int var12;
            for(var6 = 0; var6 < var5; ++var6) {
               var7 = var0.ar[var6];
               ev var8 = var0.ao[var7];
               int var9 = var2.am(1, -2062410884);
               if (0 == var9) {
                  var0.ar[(var0.af += -960697293) * 2099244795 - 1] = var7;
                  var8.dm = client.dt * -110921253;
               } else {
                  int var10 = var2.am(2, -1499410778);
                  if (0 == var10) {
                     if (var4 != 7) {
                        throw new IllegalStateException();
                     }

                     var0.ar[(var0.af += -960697293) * 2099244795 - 1] = var7;
                     var8.dm = -110921253 * client.dt;
                     client.hb[(client.hh += 172220651) * 169854915 - 1] = var7;
                  } else if (var10 == 1) {
                     if (var4 != 7) {
                        throw new IllegalStateException();
                     }

                     var0.ar[(var0.af += -960697293) * 2099244795 - 1] = var7;
                     var8.dm = -110921253 * client.dt;
                     var11 = var2.am(3, -2041101182);
                     var8.ag(var11, kk.ak, 134462349);
                     var12 = var2.am(1, -1657490678);
                     if (var12 == 1) {
                        if (var4 != 7) {
                           throw new IllegalStateException();
                        }

                        client.hb[(client.hh += 172220651) * 169854915 - 1] = var7;
                     }
                  } else if (var10 == 2) {
                     if (var4 != 7) {
                        throw new IllegalStateException();
                     }

                     var0.ar[(var0.af += -960697293) * 2099244795 - 1] = var7;
                     var8.dm = -110921253 * client.dt;
                     if (var2.am(1, -1482175533) == 1) {
                        if (var4 != 7) {
                           throw new IllegalStateException();
                        }

                        var11 = var2.am(3, -1509740737);
                        var8.ag(var11, kk.aj, 1329403852);
                        var12 = var2.am(3, -1779985941);
                        var8.ag(var12, kk.aj, 60715331);
                     } else {
                        var11 = var2.am(3, -2135727987);
                        var8.ag(var11, kk.aw, -226210647);
                     }

                     var11 = var2.am(1, -1665739827);
                     if (var11 == 1) {
                        if (var4 != 7) {
                           throw new IllegalStateException();
                        }

                        client.hb[(client.hh += 172220651) * 169854915 - 1] = var7;
                     }
                  } else if (3 == var10) {
                     if (var4 != 7) {
                        throw new IllegalStateException();
                     }

                     client.nw[(client.ns += -1720090443) * 39021981 - 1] = var7;
                  }
               }
            }

            while(true) {
               byte var18 = 16;
               var6 = 1 << var18;
               if (var2.au(client.in.ae * 1771183759, 190181275) < var18 + 12) {
                  if (var4 != 7) {
                     throw new IllegalStateException();
                  }
                  break;
               }

               var7 = var2.am(var18, -1473845653);
               if (var6 - 1 == var7) {
                  if (var4 != 7) {
                     return;
                  }
                  break;
               }

               int var19 = -1103350111 * hr.jy;
               boolean var20 = false;
               if (var0.ao[var7] == null) {
                  if (var4 != 7) {
                     throw new IllegalStateException();
                  }

                  var0.ao[var7] = new ev();
                  var20 = true;
               }

               ev var21 = var0.ao[var7];
               var21.aw = -1040261387 * var19;
               var0.ar[(var0.af += -960697293) * 2099244795 - 1] = var7;
               var21.dm = client.dt * -110921253;
               int var13;
               int var14;
               boolean var10000;
               if (4 == var3) {
                  if (var4 != 7) {
                     throw new IllegalStateException();
                  }

                  var21.ap = sd.ap(var2.am(14, -2084037170), 1460341640);
                  if (var1) {
                     if (var4 != 7) {
                        throw new IllegalStateException();
                     }

                     var13 = var2.am(8, -1798486646);
                     if (var13 > 127) {
                        if (var4 != 7) {
                           return;
                        }

                        var13 -= 256;
                     }
                  } else {
                     var13 = var2.am(5, -1585593441);
                     if (var13 > 15) {
                        var13 -= 32;
                     }
                  }

                  if (var1) {
                     var12 = var2.am(8, -2103112169);
                     if (var12 > 127) {
                        if (var4 != 7) {
                           throw new IllegalStateException();
                        }

                        var12 -= 256;
                     }
                  } else {
                     var12 = var2.am(5, -1584741837);
                     if (var12 > 15) {
                        var12 -= 32;
                     }
                  }

                  var14 = var2.am(1, -1609515130);
                  if (var14 == 1) {
                     if (var4 != 7) {
                        throw new IllegalStateException();
                     }

                     client.hb[(client.hh += 172220651) * 169854915 - 1] = var7;
                  }

                  var11 = var2.am(1, -1878537700);
                  int var15 = client.ny[var2.am(3, -1994358996)];
                  if (var20) {
                     if (var4 != 7) {
                        return;
                     }

                     var21.dy = (var21.bq = var15 * -1623858287) * 819872787;
                  }

                  if (var2.am(1, -1832710633) == 1) {
                     if (var4 != 7) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  boolean var16 = var10000;
                  if (var16) {
                     if (var4 != 7) {
                        throw new IllegalStateException();
                     }

                     var2.am(32, -1937252376);
                  }
               } else if (var3 == 5) {
                  if (var1) {
                     if (var4 != 7) {
                        return;
                     }

                     var12 = var2.am(8, -1677245949);
                     if (var12 > 127) {
                        if (var4 != 7) {
                           return;
                        }

                        var12 -= 256;
                     }
                  } else {
                     var12 = var2.am(6, -1810860069);
                     if (var12 > 31) {
                        if (var4 != 7) {
                           throw new IllegalStateException();
                        }

                        var12 -= 64;
                     }
                  }

                  if (var1) {
                     if (var4 != 7) {
                        return;
                     }

                     var13 = var2.am(8, -2004540696);
                     if (var13 > 127) {
                        if (var4 != 7) {
                           return;
                        }

                        var13 -= 256;
                     }
                  } else {
                     var13 = var2.am(6, -2062218865);
                     if (var13 > 31) {
                        var13 -= 64;
                     }
                  }

                  var14 = client.ny[var2.am(3, -1928493703)];
                  if (var20) {
                     var21.dy = (var21.bq = -1623858287 * var14) * 819872787;
                  }

                  if (var2.am(1, -2109834236) == 1) {
                     if (var4 != 7) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  boolean var22 = var10000;
                  if (var22) {
                     var2.am(32, -1482399794);
                  }

                  int var23 = var2.am(1, -1929567226);
                  if (var23 == 1) {
                     if (var4 != 7) {
                        return;
                     }

                     client.hb[(client.hh += 172220651) * 169854915 - 1] = var7;
                  }

                  var21.ap = sd.ap(var2.am(14, -1866274507), -1233984541);
                  var11 = var2.am(1, -2004140723);
               } else {
                  var11 = 0;
                  var12 = 0;
                  var13 = 0;
               }

               mn.kd(var21, -419349839);
               if (0 == 657193545 * var21.dw) {
                  if (var4 != 7) {
                     throw new IllegalStateException();
                  }

                  var21.bq = 0;
               }

               int var10001;
               int var10002;
               boolean var10003;
               if (-1964001905 * vw.ap >= 222) {
                  if (var4 != 7) {
                     throw new IllegalStateException();
                  }

                  var10001 = var12 + -1487645105 * ge.nh;
                  var10002 = kz.nf * 819800615 + var13;
                  if (1 == var11) {
                     if (var4 != 7) {
                        return;
                     }

                     var10003 = true;
                  } else {
                     var10003 = false;
                  }

                  var21.ad(var10001, var10002, var10003, -2033412316);
               } else {
                  var10001 = nw.mc.dz[0] + var12;
                  var10002 = nw.mc.di[0] + var13;
                  if (var11 == 1) {
                     if (var4 != 7) {
                        return;
                     }

                     var10003 = true;
                  } else {
                     var10003 = false;
                  }

                  var21.ad(var10001, var10002, var10003, -2080991692);
               }
            }

            var2.at(-969019247);
            ne.kx(var0, var2, -1860926341);

            for(var5 = 0; var5 < 39021981 * client.ns; ++var5) {
               if (var4 != 7) {
                  throw new IllegalStateException();
               }

               var6 = client.nw[var5];
               if (-330508271 * client.dt != 878282627 * var0.ao[var6].dm) {
                  if (var4 != 7) {
                     return;
                  }

                  var0.ao[var6].ap = null;
                  var0.ao[var6] = null;
               }
            }

            if (var2.am * -1689308347 != 1771183759 * client.in.ae) {
               throw new RuntimeException(-1689308347 * var2.am + eh.aw + 1771183759 * client.in.ae);
            } else {
               for(var5 = 0; var5 < 2099244795 * var0.af; ++var5) {
                  if (var4 != 7) {
                     throw new IllegalStateException();
                  }

                  if (null == var0.ao[var0.ar[var5]]) {
                     if (var4 != 7) {
                        throw new IllegalStateException();
                     }

                     throw new RuntimeException(var5 + eh.aw + var0.af * 2099244795);
                  }
               }

            }
         }
      } catch (RuntimeException var17) {
         throw tm.aw(var17, "qq.kq(" + ')');
      }
   }
}
