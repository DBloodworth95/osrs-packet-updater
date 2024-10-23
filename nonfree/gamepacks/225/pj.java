public class pj {
   public int ae;
   public int aq;
   byte ac;
   public int am;
   public int ax;
   public int ag;
   public static final int bw = 38;

   static final void lm(dd var0, va var1, byte var2) {
      try {
         var1.at(1996200897);
         int var3 = var1.au(8, (byte)-18);
         int var4;
         if (var3 < var0.ap * -514517369) {
            for(var4 = var3; var4 < var0.ap * -514517369; ++var4) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               client.nv[(client.ns += -1219110563) * 640762613 - 1] = var0.ab[var4];
            }
         }

         if (var3 > -514517369 * var0.ap) {
            if (var2 != 0) {
               throw new RuntimeException("");
            }
         } else {
            var0.ap = 0;

            for(var4 = 0; var4 < var3; ++var4) {
               int var5 = var0.ab[var4];
               ea var6 = var0.ah[var5];
               int var7 = var1.au(1, (byte)113);
               if (var7 == 0) {
                  if (var2 == 0) {
                     throw new IllegalStateException();
                  }

                  var0.ab[(var0.ap += -1716007113) * -514517369 - 1] = var5;
                  var6.dj = client.do * 837308975;
               } else {
                  int var8 = var1.au(2, (byte)-53);
                  if (0 == var8) {
                     if (var2 == 0) {
                        return;
                     }

                     var0.ab[(var0.ap += -1716007113) * -514517369 - 1] = var5;
                     var6.dj = 837308975 * client.do;
                     client.ho[(client.hx += -248649147) * 1014601869 - 1] = var5;
                  } else {
                     int var9;
                     int var10;
                     if (1 == var8) {
                        var0.ab[(var0.ap += -1716007113) * -514517369 - 1] = var5;
                        var6.dj = 837308975 * client.do;
                        var9 = var1.au(3, (byte)89);
                        var6.as(var9, kk.ag, 1164691915);
                        var10 = var1.au(1, (byte)-72);
                        if (1 == var10) {
                           client.ho[(client.hx += -248649147) * 1014601869 - 1] = var5;
                        }
                     } else if (var8 == 2) {
                        if (var2 == 0) {
                           throw new IllegalStateException();
                        }

                        var0.ab[(var0.ap += -1716007113) * -514517369 - 1] = var5;
                        var6.dj = client.do * 837308975;
                        if (var1.au(1, (byte)-11) == 1) {
                           if (var2 == 0) {
                              throw new IllegalStateException();
                           }

                           var9 = var1.au(3, (byte)-46);
                           var6.as(var9, kk.am, 1164691915);
                           var10 = var1.au(3, (byte)-34);
                           var6.as(var10, kk.am, 1164691915);
                        } else {
                           var9 = var1.au(3, (byte)19);
                           var6.as(var9, kk.ae, 1164691915);
                        }

                        var9 = var1.au(1, (byte)94);
                        if (1 == var9) {
                           if (var2 == 0) {
                              return;
                           }

                           client.ho[(client.hx += -248649147) * 1014601869 - 1] = var5;
                        }
                     } else if (3 == var8) {
                        client.nv[(client.ns += -1219110563) * 640762613 - 1] = var5;
                     }
                  }
               }
            }

         }
      } catch (RuntimeException var11) {
         throw vk.ae(var11, "pj.lm(" + ')');
      }
   }

   void ad(int var1) {
      this.ac &= -8;
      this.ac = (byte)(this.ac | var1 & 7);
   }

   void ab(int var1) {
      this.ac &= -9;
      if (1 == var1) {
         this.ac = (byte)(this.ac | 8);
      }

   }

   public int ag(byte var1) {
      try {
         return this.ac & 7;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "pj.ag(" + ')');
      }
   }

   void ah(int var1) {
      this.ac &= -8;
      this.ac = (byte)(this.ac | var1 & 7);
   }

   void ax(int var1, byte var2) {
      try {
         this.ac &= -8;
         this.ac = (byte)(this.ac | var1 & 7);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "pj.ax(" + ')');
      }
   }

   void aq(int var1, int var2) {
      try {
         this.ac &= -9;
         if (1 == var1) {
            if (var2 == 678232241) {
               throw new IllegalStateException();
            }

            this.ac = (byte)(this.ac | 8);
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "pj.aq(" + ')');
      }
   }

   static Integer af(vf var0) {
      int var1 = 0;
      boolean var2 = false;

      while(true) {
         int var3 = var0.cv(952452697);
         if (var3 == 255) {
            return var2 ? var1 : null;
         }

         if (var3 != 0) {
            throw new IllegalStateException("");
         }

         while(true) {
            int var4 = var0.cv(952452697);
            if (var4 == 255) {
               break;
            }

            var0.au -= -905108122;
            if (var0.ct(-1990635608) != 0) {
               throw new IllegalStateException("");
            }

            if (var2) {
               throw new IllegalStateException("");
            }

            var1 = var0.cz(-1734056172);
            var2 = true;
         }
      }
   }

   public int at() {
      return this.ac & 7;
   }

   public int au() {
      return this.ac & 7;
   }

   public int ar() {
      return 8 == (this.ac & 8) ? 1 : 0;
   }

   public int al() {
      return 8 == (this.ac & 8) ? 1 : 0;
   }

   void ae(Integer var1, int var2) {
      try {
         ;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "pj.ae(" + ')');
      }
   }

   public pj(vf var1, boolean var2) {
      try {
         super();
         this.ac = var1.cg((short)3080);
         this.ae = var1.ct(-1728572166) * -1056701537;
         this.ag = var1.cz(-1734056172) * -1426870601;
         this.am = var1.cz(-1734056172) * -1335702911;
         this.ax = var1.cz(-1734056172) * 1955674099;
         this.aq = var1.cz(-1734056172) * 969236925;
         if (var2) {
            this.ae(cp.ac(var1, -1548039830), -1077271310);
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "pj.<init>(" + ')');
      }
   }

   void ap(int var1) {
      this.ac &= -9;
      if (1 == var1) {
         this.ac = (byte)(this.ac | 8);
      }

   }

   public int am(byte var1) {
      try {
         byte var10000;
         if (8 == (this.ac & 8)) {
            if (var1 == 0) {
               throw new IllegalStateException();
            }

            var10000 = 1;
         } else {
            var10000 = 0;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "pj.am(" + ')');
      }
   }

   public pj() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "pj.<init>(" + ')');
      }
   }

   static final void ip(int var0) {
      try {
         if (eg.ts != null) {
            if (var0 != 814269094) {
               return;
            }

            eg.ts.aj((byte)-18);
         }

      } catch (RuntimeException var1) {
         throw vk.ae(var1, "pj.ip(" + ')');
      }
   }
}
