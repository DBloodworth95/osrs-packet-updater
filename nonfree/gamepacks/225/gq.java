public class gq extends fm {
   static final int bu = 1;
   long ae;
   // $FF: synthetic field
   final fz this$0;
   static final int ai = 202;
   static vt ah;
   int ac;

   static final int ad(int var0) {
      try {
         return -50258285 * jy.ae;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "gq.ad(" + ')');
      }
   }

   public static String af(byte[] var0, int var1, int var2, int var3) {
      try {
         char[] var4 = new char[var2];
         int var5 = 0;

         for(int var6 = 0; var6 < var2; ++var6) {
            int var7 = var0[var6 + var1] & 255;
            if (var7 == 0) {
               if (var3 >= 2107281437) {
                  throw new IllegalStateException();
               }
            } else {
               if (var7 >= 128) {
                  if (var3 >= 2107281437) {
                     throw new IllegalStateException();
                  }

                  if (var7 < 160) {
                     if (var3 >= 2107281437) {
                        throw new IllegalStateException();
                     }

                     char var8 = qt.ac[var7 - 128];
                     if (var8 == 0) {
                        if (var3 >= 2107281437) {
                           throw new IllegalStateException();
                        }

                        var8 = '?';
                     }

                     var7 = var8;
                  }
               }

               var4[var5++] = (char)var7;
            }
         }

         return new String(var4, 0, var5);
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "gq.af(" + ')');
      }
   }

   void ae(go var1, byte var2) {
      try {
         var1.ai(this.ac * 592349069, this.ae * 9117999941181852329L);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "gq.ae(" + ')');
      }
   }

   void ag(vf var1) {
      this.ac = var1.cz(-1734056172) * -362933435;
      this.ae = var1.cw(1292443203) * 2285915948400572825L;
   }

   gq(fz var1) {
      try {
         this.this$0 = var1;
         super();
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "gq.<init>(" + ')');
      }
   }

   void ax(vf var1) {
      this.ac = var1.cz(-1734056172) * -362933435;
      this.ae = var1.cw(1645147001) * 2285915948400572825L;
   }

   void aq(go var1) {
      var1.ai(this.ac * 592349069, this.ae * 9117999941181852329L);
   }

   void af(go var1) {
      var1.ai(this.ac * 592349069, this.ae * 9117999941181852329L);
   }

   void au(go var1) {
      var1.ai(this.ac * 592349069, this.ae * 9117999941181852329L);
   }

   void at(go var1) {
      var1.ai(this.ac * 592349069, this.ae * 9117999941181852329L);
   }

   void ac(vf var1, byte var2) {
      try {
         this.ac = var1.cz(-1734056172) * -362933435;
         this.ae = var1.cw(1796137156) * 2285915948400572825L;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "gq.ac(" + ')');
      }
   }

   void am(vf var1) {
      this.ac = var1.cz(-1734056172) * -269632196;
      this.ae = var1.cw(148674084) * 2285915948400572825L;
   }

   static void ls(dd var0, va var1, boolean var2, byte var3) {
      try {
         int var4 = var1.cv(952452697);
         if (var4 < var0.aa * -557899353) {
            throw new RuntimeException("dang");
         } else if (var4 > -557899353 * var0.aa) {
            if (var3 <= 5) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException("dang!");
            }
         } else {
            var0.aa = 0;

            int var5;
            int var6;
            label136:
            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 <= 5) {
                  throw new IllegalStateException();
               }

               var6 = var0.ai[var5];
               su var7 = var0.az[var6];
               boolean var10000;
               if (var1.cv(952452697) == 1) {
                  if (var3 <= 5) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var8 = var10000;
               if (!var8) {
                  if (var3 <= 5) {
                     return;
                  }

                  client.ju.ag(var7.ar, 613246029);
                  var0.az[var6] = null;
               } else {
                  var0.ai[(var0.aa += -1035504105) * -557899353 - 1] = var6;
                  byte var10001;
                  if (var2) {
                     if (var3 <= 5) {
                        throw new IllegalStateException();
                     }

                     var10001 = var1.cg((short)-13380);
                  } else {
                     var10001 = 1;
                  }

                  var7.ae = var10001 * 121666799;
                  byte var9 = var1.cg((short)-4848);
                  byte var10 = var1.cg((short)972);
                  var7.ag = var1.ct(-2078590818) * 1375652431;
                  byte var12 = (byte)var1.cv(952452697);
                  kk[] var13 = kk.ad;

                  for(int var14 = 0; var14 < var13.length; ++var14) {
                     if (var3 <= 5) {
                        throw new IllegalStateException();
                     }

                     kk var15 = var13[var14];
                     if (var15.ar == var12) {
                        if (var3 <= 5) {
                           throw new IllegalStateException();
                        }

                        int var28 = 187174063 * var7.ag;
                        int var16 = 1295026153 * var7.au;
                        int var17 = var28 - var16 & 2047;
                        kb var18 = kb.ae;
                        if (var17 > 1024) {
                           if (var3 <= 5) {
                              throw new IllegalStateException();
                           }

                           var17 = 2048 - var17;
                           var18 = kb.ac;
                        }

                        ka var27 = new ka(var18, var17);
                        int var29 = Math.min(var27.ac(-1996420004), 128);
                        var7.am = 1566086405 * (var29 / (client.ry * 521636781));
                        var7.ax = 1050246589 * (var29 % (client.ry * 521636781));
                        if (0 == var9) {
                           if (var3 <= 5) {
                              return;
                           }

                           if (var10 == 0) {
                              continue label136;
                           }

                           if (var3 <= 5) {
                              return;
                           }
                        }

                        var7.ah(var9 + var7.ad[0], var10 + var7.ah[0], var15, -236634947);
                        continue label136;
                     }
                  }

                  throw new RuntimeException("Could not find MoveSpeed with ID " + var12);
               }
            }

            while(var1.ad(-735417501 * client.ia.at, 958328218) >= 10) {
               var5 = var1.ct(-1886750124);
               var0.ai[(var0.aa += -1035504105) * -557899353 - 1] = var5;
               var6 = var1.cv(952452697);
               int var20 = var1.cv(952452697);
               int var21 = var6 * 8;
               int var22 = 8 * var20;
               dd var23 = client.ju.ae(var5, var21, var22, re.vt.ba((byte)10), in.ae, 2072934554);
               su var11 = new su(var5, var23);
               var0.az[var5] = var11;
               int var24 = var1.cv(952452697);
               int var26 = var1.cv(952452697);
               var11.ap(var24, var26, 1522724135);
               var11.au = var1.ct(-1804858432) * -1251819431;
               var1.ct(-1647193475);
            }

         }
      } catch (RuntimeException var19) {
         throw vk.ae(var19, "gq.ls(" + ')');
      }
   }
}
