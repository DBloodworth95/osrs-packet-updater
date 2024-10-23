public class dx implements Runnable {
   int ak;
   Object aw;
   boolean ap;
   int[] aj;
   int[] ai;
   long[] ay;
   public static final int bx = 29;

   static fl ak(int var0, int var1) {
      try {
         fl var2 = (fl)gu.ap(tm.ap(324075856), var0, -1875781163);
         if (var2 == null) {
            var2 = fl.ap;
         }

         return var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "dx.ak(" + ')');
      }
   }

   dx() {
      try {
         super();
         this.ap = true;
         this.aw = new Object();
         this.ak = 0;
         this.aj = new int[500];
         this.ai = new int[500];
         this.ay = new long[500];
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "dx.<init>(" + ')');
      }
   }

   public void dk() {
      for(; this.ap; ct.ap(50L)) {
         synchronized(this.aw) {
            if (-92678711 * this.ak < 500) {
               this.aj[this.ak * 4858105] = bc.au * 665066090;
               this.ai[-24194532 * this.ak] = -1159272925 * bc.an;
               this.ay[this.ak * 1616947183] = -4674151039641362503L * bc.ao;
               this.ak += -1953241321;
            }
         }
      }

   }

   static final void jb(int var0, int var1, boolean var2, int var3) {
      try {
         if (var2) {
            if (var3 <= 797753073) {
               throw new IllegalStateException();
            }

            if (na.ik * -952592971 == var0) {
               if (var3 <= 797753073) {
                  throw new IllegalStateException();
               }

               if (-1683062733 * fj.ig == var1) {
                  if (var3 <= 797753073) {
                     throw new IllegalStateException();
                  }

                  return;
               }
            }
         }

         na.ik = var0 * -38178659;
         fj.ig = var1 * -235898117;
         ea.gv(25, 2027013533);
         client.dd = true;
         ir.iq(og.af, true, (byte)-57);
         int var4 = -2014668603 * hx.jf.as;
         int var5 = hx.jf.ae * 1601580509;
         hx.jf.as = 1252601960 * (var0 - 6);
         hx.jf.ae = (var1 - 6) * -1697868888;
         int var6 = -2014668603 * hx.jf.as - var4;
         int var7 = hx.jf.ae * 1601580509 - var5;
         int var8 = var6 * 128;
         int var9 = var7 * 128;

         int var10;
         int var12;
         int[] var10000;
         for(var10 = 0; var10 < 65536; ++var10) {
            ev var11 = hx.jf.ao[var10];
            if (null != var11) {
               if (var3 <= 797753073) {
                  return;
               }

               for(var12 = 0; var12 < 10; ++var12) {
                  if (var3 <= 797753073) {
                     throw new IllegalStateException();
                  }

                  var10000 = var11.dz;
                  var10000[var12] -= var6;
                  var10000 = var11.di;
                  var10000[var12] -= var7;
               }

               var11.bk -= -124967775 * var8;
               var11.bb -= 1443056459 * var9;
               var11.dr -= -2135793303 * var6;
               var11.dg -= var7 * -1241751523;
               var11.dh -= var6 * 516018399;
               var11.df -= var7 * 1075800973;
            }
         }

         for(var10 = 0; var10 < 2048; ++var10) {
            dv var22 = hx.jf.an[var10];
            if (var22 != null) {
               for(var12 = 0; var12 < 10; ++var12) {
                  var10000 = var22.dz;
                  var10000[var12] -= var6;
                  var10000 = var22.di;
                  var10000[var12] -= var7;
               }

               var22.bk -= -124967775 * var8;
               var22.bb -= var9 * 1443056459;
               var22.dr -= var6 * -2135793303;
               var22.dg -= -1241751523 * var7;
               var22.dh -= 516018399 * var6;
               var22.df -= 1075800973 * var7;
            }
         }

         for(var10 = 0; var10 < 2048; ++var10) {
            so var23 = hx.jf.ab[var10];
            if (null != var23) {
               if (var3 <= 797753073) {
                  return;
               }

               var23.ab(-var8, -var9, 636015096);
            }
         }

         byte var24 = 0;
         byte var25 = 104;
         byte var26 = 1;
         if (var6 < 0) {
            if (var3 <= 797753073) {
               throw new IllegalStateException();
            }

            var24 = 103;
            var25 = -1;
            var26 = -1;
         }

         byte var13 = 0;
         byte var14 = 104;
         byte var15 = 1;
         if (var7 < 0) {
            if (var3 <= 797753073) {
               throw new IllegalStateException();
            }

            var13 = 103;
            var14 = -1;
            var15 = -1;
         }

         int var17;
         for(int var16 = var24; var16 != var25; var16 += var26) {
            if (var3 <= 797753073) {
               throw new IllegalStateException();
            }

            for(var17 = var13; var17 != var14; var17 += var15) {
               if (var3 <= 797753073) {
                  return;
               }

               int var18 = var6 + var16;
               int var19 = var7 + var17;

               for(int var20 = 0; var20 < 4; ++var20) {
                  if (0 <= var18) {
                     if (var3 <= 797753073) {
                        throw new IllegalStateException();
                     }

                     if (var18 < 104) {
                        if (var3 <= 797753073) {
                           throw new IllegalStateException();
                        }

                        if (0 <= var19) {
                           if (var3 <= 797753073) {
                              throw new IllegalStateException();
                           }

                           if (var19 < 104) {
                              hx.jf.ad[var20][var16][var17] = hx.jf.ad[var20][var18][var19];
                              continue;
                           }
                        }
                     }
                  }

                  hx.jf.ad[var20][var16][var17] = null;
               }
            }
         }

         for(do var27 = (do)hx.jf.ac.as(); null != var27; var27 = (do)hx.jf.ac.am()) {
            if (var3 <= 797753073) {
               throw new IllegalStateException();
            }

            var27.ak -= var6 * -2058535873;
            var27.aj -= 305671123 * var7;
            if (var27.ak * -440355905 >= 0) {
               if (var3 <= 797753073) {
                  throw new IllegalStateException();
               }

               if (104 > -440355905 * var27.ak) {
                  if (var3 <= 797753073) {
                     throw new IllegalStateException();
                  }

                  if (1462658139 * var27.aj >= 0) {
                     if (var3 <= 797753073) {
                        return;
                     }

                     if (104 > var27.aj * 1462658139) {
                        continue;
                     }

                     if (var3 <= 797753073) {
                        throw new IllegalStateException();
                     }
                  }
               }
            }

            var27.kf();
         }

         if (0 != 1767526859 * client.sa) {
            client.sa -= var6 * -1569109021;
            client.tt -= var7 * 989016015;
         }

         client.ty = 0;
         client.to = false;
         ad.kw -= -2128937647 * (var6 << 7);
         oo.kv -= -2068675377 * (var7 << 7);
         sl.lg -= -963513131 * (var6 << 7);
         ly.ls -= (var7 << 7) * -1538412565;
         client.sm = 1823659459;
         hx.jf.ax.ap();
         hx.jf.av.ap();

         for(var17 = 0; var17 < 4; ++var17) {
            if (var3 <= 797753073) {
               throw new IllegalStateException();
            }

            hx.jf.ak[var17].ap(-1946629551);
         }

      } catch (RuntimeException var21) {
         throw tm.aw(var21, "dx.jb(" + ')');
      }
   }

   public void run() {
      try {
         for(; this.ap; ct.ap(50L)) {
            synchronized(this.aw) {
               if (-92678711 * this.ak < 500) {
                  this.aj[this.ak * -92678711] = bc.au * 56923103;
                  this.ai[-92678711 * this.ak] = -1159272925 * bc.an;
                  this.ay[this.ak * -92678711] = -4674151039641362503L * bc.ao;
                  this.ak += 35935353;
               }
            }
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "dx.run(" + ')');
      }
   }

   public static String aj(CharSequence var0, ur var1, byte var2) {
      try {
         if (null == var0) {
            if (var2 != 14) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var3 = 0;

            int var4;
            for(var4 = var0.length(); var3 < var4; ++var3) {
               if (var2 != 14) {
                  throw new IllegalStateException();
               }

               if (!je.ak(var0.charAt(var3), -1501189999)) {
                  break;
               }

               if (var2 != 14) {
                  throw new IllegalStateException();
               }
            }

            while(var4 > var3) {
               if (var2 != 14) {
                  throw new IllegalStateException();
               }

               if (!je.ak(var0.charAt(var4 - 1), -1813702174)) {
                  break;
               }

               --var4;
            }

            int var5 = var4 - var3;
            if (var5 >= 1) {
               if (var2 != 14) {
                  throw new IllegalStateException();
               }

               if (var5 <= ke.ap(var1, (byte)0)) {
                  StringBuilder var6 = new StringBuilder(var5);

                  for(int var7 = var3; var7 < var4; ++var7) {
                     if (var2 != 14) {
                        throw new IllegalStateException();
                     }

                     char var8 = var0.charAt(var7);
                     if (!nt.aw(var8, -629903058)) {
                        if (var2 != 14) {
                           throw new IllegalStateException();
                        }
                     } else {
                        char var9;
                        switch(var8) {
                        case ' ':
                        case '-':
                        case '_':
                        case ' ':
                           var9 = '_';
                           break;
                        case '#':
                        case '[':
                        case ']':
                           var9 = var8;
                           break;
                        case 'À':
                        case 'Á':
                        case 'Â':
                        case 'Ã':
                        case 'Ä':
                        case 'à':
                        case 'á':
                        case 'â':
                        case 'ã':
                        case 'ä':
                           var9 = 'a';
                           break;
                        case 'Ç':
                        case 'ç':
                           var9 = 'c';
                           break;
                        case 'È':
                        case 'É':
                        case 'Ê':
                        case 'Ë':
                        case 'è':
                        case 'é':
                        case 'ê':
                        case 'ë':
                           var9 = 'e';
                           break;
                        case 'Í':
                        case 'Î':
                        case 'Ï':
                        case 'í':
                        case 'î':
                        case 'ï':
                           var9 = 'i';
                           break;
                        case 'Ñ':
                        case 'ñ':
                           var9 = 'n';
                           break;
                        case 'Ò':
                        case 'Ó':
                        case 'Ô':
                        case 'Õ':
                        case 'Ö':
                        case 'ò':
                        case 'ó':
                        case 'ô':
                        case 'õ':
                        case 'ö':
                           var9 = 'o';
                           break;
                        case 'Ù':
                        case 'Ú':
                        case 'Û':
                        case 'Ü':
                        case 'ù':
                        case 'ú':
                        case 'û':
                        case 'ü':
                           var9 = 'u';
                           break;
                        case 'ß':
                           var9 = 'b';
                           break;
                        case 'ÿ':
                        case 'Ÿ':
                           var9 = 'y';
                           break;
                        default:
                           var9 = Character.toLowerCase(var8);
                        }

                        if (0 == var9) {
                           if (var2 != 14) {
                              throw new IllegalStateException();
                           }
                        } else {
                           var6.append(var9);
                        }
                     }
                  }

                  if (var6.length() == 0) {
                     if (var2 != 14) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }

                  return var6.toString();
               }

               if (var2 != 14) {
                  throw new IllegalStateException();
               }
            }

            return null;
         }
      } catch (RuntimeException var11) {
         throw tm.aw(var11, "dx.aj(" + ')');
      }
   }
}
