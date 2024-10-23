public class fl implements ph {
   public static final int ar = 13;
   static final fl aw = new fl(1, 1, (String)null, 9);
   static final fl ay = new fl(5, 5, (String)null, 3);
   static final fl aj = new fl(3, 3, (String)null, 6);
   static final fl ai = new fl(4, 4, (String)null, 1);
   static final fl ak = new fl(2, 2, (String)null, 3);
   final int as;
   final int ae;
   final int am;
   public static final int al = 6;
   static final fl ap = new fl(0, 0, (String)null, 0);

   int aj(byte var1) {
      try {
         return this.am * 1212886699;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "fl.aj(" + ')');
      }
   }

   public int as() {
      return this.ae * -906869062;
   }

   fl(int var1, int var2, String var3, int var4) {
      try {
         super();
         this.as = -400756505 * var1;
         this.ae = -29616511 * var2;
         this.am = 1661688835 * var4;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "fl.<init>(" + ')');
      }
   }

   public int aw(int var1) {
      try {
         return this.ae * 555624833;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "fl.aw(" + ')');
      }
   }

   static void aj(int var0, int var1, int var2, ir var3, int var4, byte var5) {
      try {
         cj var6;
         int var7;
         int var8;
         label52: {
            var6 = new cj();
            var6.aw = var0 * -668218351;
            var6.ak = -1473989760 * var1;
            var6.aj = var2 * -644723072;
            var7 = -347110081 * var3.az;
            var8 = var3.ag * -109800991;
            if (var4 != 1) {
               if (var5 == 32) {
                  throw new IllegalStateException();
               }

               if (var4 != 3) {
                  break label52;
               }

               if (var5 == 32) {
                  return;
               }
            }

            var7 = var3.ag * -109800991;
            var8 = var3.az * -347110081;
         }

         var6.ai = -566519936 * (var7 + var1);
         var6.ay = 1080386944 * (var8 + var2);
         var6.am = var3.ba * -1695880035;
         var6.as = -255266176 * var3.bw;
         var6.ae = Math.max(2028073344 * var3.bi - 128, 0) * 175437675;
         var6.au = -1907782311 * var3.bf;
         var6.an = var3.bg * -1796828161;
         var6.ao = var3.bl;
         if (null != var3.bm) {
            if (var5 == 32) {
               throw new IllegalStateException();
            }

            var6.ab = var3;
            var6.ak(-259924495);
         }

         cj.ap.aw(var6);
         if (null != var6.ao) {
            if (var5 == 32) {
               throw new IllegalStateException();
            }

            var6.af = (var6.au * 1844002325 + (int)(Math.random() * (double)(var6.an * 1572506639 - var6.au * 1844002325))) * 571427153;
         }

      } catch (RuntimeException var9) {
         throw tm.aw(var9, "fl.aj(" + ')');
      }
   }

   static fl[] ay() {
      return new fl[]{ap, aw, ak, aj, ai, ay};
   }

   static fl[] ae() {
      return new fl[]{ap, aw, ak, aj, ai, ay};
   }

   static fl[] ai() {
      return new fl[]{ap, aw, ak, aj, ai, ay};
   }

   static final void hb(int var0, int var1, byte var2) {
      try {
         if (var0 < 128) {
            if (var2 <= 27) {
               return;
            }

            var0 = 128;
         } else if (var0 > 383) {
            var0 = 383;
         }

         if (-887244477 * mj.kz < var0) {
            if (var2 <= 27) {
               throw new IllegalStateException();
            }

            mj.kz += (oh.up * -688398997 * (var0 - mj.kz * -887244477) / 1000 + 107343017 * fq.uy) * 1819843435;
            if (mj.kz * -887244477 > var0) {
               if (var2 <= 27) {
                  throw new IllegalStateException();
               }

               mj.kz = var0 * 1819843435;
            }
         } else if (-887244477 * mj.kz > var0) {
            if (var2 <= 27) {
               throw new IllegalStateException();
            }

            mj.kz -= (fq.uy * 107343017 + oh.up * -688398997 * (mj.kz * -887244477 - var0) / 1000) * 1819843435;
            if (mj.kz * -887244477 < var0) {
               mj.kz = 1819843435 * var0;
            }
         }

         var1 &= 2047;
         int var3 = var1 - pg.kc * 1625945013;
         if (var3 > 1024) {
            if (var2 <= 27) {
               return;
            }

            var3 -= 2048;
         } else if (var3 < -1024) {
            if (var2 <= 27) {
               return;
            }

            var3 += 2048;
         }

         if (var3 > 0) {
            if (var2 <= 27) {
               return;
            }

            pg.kc += (-688398997 * oh.up * var3 / 1000 + fq.uy * 107343017) * -583425379;
            pg.kc = (1625945013 * pg.kc & 2047) * -583425379;
         } else if (var3 < 0) {
            if (var2 <= 27) {
               throw new IllegalStateException();
            }

            pg.kc -= -583425379 * (fq.uy * 107343017 + -688398997 * oh.up * -var3 / 1000);
            pg.kc = (1625945013 * pg.kc & 2047) * -583425379;
         }

         int var4 = var1 - pg.kc * 1625945013;
         if (var4 > 1024) {
            var4 -= 2048;
         } else if (var4 < -1024) {
            if (var2 <= 27) {
               throw new IllegalStateException();
            }

            var4 += 2048;
         }

         label123: {
            if (var4 < 0) {
               if (var2 <= 27) {
                  throw new IllegalStateException();
               }

               if (var3 > 0) {
                  break label123;
               }

               if (var2 <= 27) {
                  throw new IllegalStateException();
               }
            }

            if (var4 <= 0) {
               return;
            }

            if (var2 <= 27) {
               throw new IllegalStateException();
            }

            if (var3 >= 0) {
               return;
            }

            if (var2 <= 27) {
               throw new IllegalStateException();
            }
         }

         pg.kc = -583425379 * var1;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "fl.hb(" + ')');
      }
   }

   static void ai(int var0, int var1) {
      try {
         dk var2 = (dk)dk.ap.ap((long)var0);
         if (null == var2) {
            if (var1 == -1711312059) {
               throw new IllegalStateException();
            }
         } else {
            for(int var3 = 0; var3 < var2.aw.length; ++var3) {
               if (var1 == -1711312059) {
                  throw new IllegalStateException();
               }

               var2.aw[var3] = -1;
               var2.ak[var3] = 0;
            }

         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "fl.ai(" + ')');
      }
   }

   static void lw(int var0, String var1, int var2) {
      try {
         int var3 = client.jp.ae * -562349667;
         int[] var4 = client.jp.am;
         boolean var5 = false;
         wx var6 = new wx(var1, ll.co);

         for(int var7 = 0; var7 < var3; ++var7) {
            if (var2 == -1294909909) {
               throw new IllegalStateException();
            }

            dv var8 = nw.mc.bv.an[var4[var7]];
            if (null != var8) {
               if (var2 == -1294909909) {
                  throw new IllegalStateException();
               }

               if (nw.mc != var8) {
                  if (var2 == -1294909909) {
                     throw new IllegalStateException();
                  }

                  if (var8.ap != null && var8.ap.equals(var6)) {
                     me var9;
                     if (var0 == 1) {
                        if (var2 == -1294909909) {
                           return;
                        }

                        var9 = ef.ap(mm.ab, client.in.ai, (byte)62);
                        var9.ak.dn(var4[var7], 1988453409);
                        var9.ak.dv(0, (byte)-36);
                        client.in.ak(var9, (short)486);
                     } else if (4 == var0) {
                        if (var2 == -1294909909) {
                           return;
                        }

                        var9 = ef.ap(mm.ds, client.in.ai, (byte)21);
                        var9.ak.dv(0, (byte)-11);
                        var9.ak.dn(var4[var7], 323044566);
                        client.in.ak(var9, (short)486);
                     } else if (var0 == 6) {
                        if (var2 == -1294909909) {
                           throw new IllegalStateException();
                        }

                        var9 = ef.ap(mm.bo, client.in.ai, (byte)30);
                        var9.ak.bd(var4[var7], (byte)13);
                        var9.ak.ds(0, -960880352);
                        client.in.ak(var9, (short)486);
                     } else if (7 == var0) {
                        if (var2 == -1294909909) {
                           return;
                        }

                        var9 = ef.ap(mm.aj, client.in.ai, (byte)63);
                        var9.ak.dz(var4[var7], -361398533);
                        var9.ak.dv(0, (byte)-40);
                        client.in.ak(var9, (short)486);
                     }

                     var5 = true;
                     break;
                  }
               }
            }
         }

         if (!var5) {
            if (var2 == -1294909909) {
               throw new IllegalStateException();
            }

            qc.aw(4, "", og.gg + var1, (byte)78);
         }

      } catch (RuntimeException var10) {
         throw tm.aw(var10, "fl.lw(" + ')');
      }
   }
}
