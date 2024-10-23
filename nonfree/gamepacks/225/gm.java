import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class gm extends to {
   public byte at;
   boolean ae;
   public List ag;
   int[] am;
   public long ax;
   boolean ac;
   public byte af;
   public String aq;

   public int aa(String var1) {
      if (!this.ae) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for(int var2 = 0; var2 < this.ag.size(); ++var2) {
            if (((fy)this.ag.get(var2)).ag.ac((byte)100).equalsIgnoreCase(var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   public int[] ac(int var1) {
      try {
         if (this.am == null) {
            String[] var2 = new String[this.ag.size()];
            this.am = new int[this.ag.size()];

            for(int var3 = 0; var3 < this.ag.size(); this.am[var3] = var3++) {
               if (var1 != 1750247817) {
                  throw new IllegalStateException();
               }

               var2[var3] = ((fy)this.ag.get(var3)).ag.ae(33043466);
            }

            fn.ae(var2, this.am, (byte)-16);
         }

         return this.am;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "gm.ac(" + ')');
      }
   }

   void ae(fy var1, byte var2) {
      try {
         this.ag.add(var1);
         this.am = null;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "gm.ae(" + ')');
      }
   }

   void ag(int var1, int var2) {
      try {
         this.ag.remove(var1);
         this.am = null;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "gm.ag(" + ')');
      }
   }

   public int am(int var1) {
      try {
         return this.ag.size();
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "gm.am(" + ')');
      }
   }

   public int ax(String var1, int var2) {
      try {
         if (!this.ae) {
            if (var2 <= -1108868929) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException("Displaynames not available");
            }
         } else {
            for(int var3 = 0; var3 < this.ag.size(); ++var3) {
               if (var2 <= -1108868929) {
                  throw new IllegalStateException();
               }

               if (((fy)this.ag.get(var3)).ag.ac((byte)100).equalsIgnoreCase(var1)) {
                  if (var2 <= -1108868929) {
                     throw new IllegalStateException();
                  }

                  return var3;
               }
            }

            return -1;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "gm.ax(" + ')');
      }
   }

   public static byte[] ac(int var0, boolean var1, int var2) {
      try {
         synchronized(rv.ax) {
            byte[] var4;
            label151: {
               if (var0 != 100) {
                  if (var2 >= -1769310369) {
                     throw new IllegalStateException();
                  }

                  if (var0 >= 100) {
                     break label151;
                  }

                  if (var2 >= -1769310369) {
                     throw new IllegalStateException();
                  }

                  if (!var1) {
                     break label151;
                  }

                  if (var2 >= -1769310369) {
                     throw new IllegalStateException();
                  }
               }

               if (rv.aq * -145793157 > 0) {
                  if (var2 >= -1769310369) {
                     throw new IllegalStateException();
                  }

                  var4 = rv.ap[(rv.aq -= 729130931) * -145793157];
                  rv.ap[-145793157 * rv.aq] = null;
                  return var4;
               }
            }

            label160: {
               if (5000 != var0) {
                  if (var2 >= -1769310369) {
                     throw new IllegalStateException();
                  }

                  if (var0 >= 5000) {
                     break label160;
                  }

                  if (var2 >= -1769310369) {
                     throw new IllegalStateException();
                  }

                  if (!var1) {
                     break label160;
                  }

                  if (var2 >= -1769310369) {
                     throw new IllegalStateException();
                  }
               }

               if (rv.af * 616356373 > 0) {
                  if (var2 >= -1769310369) {
                     throw new IllegalStateException();
                  }

                  var4 = rv.ab[(rv.af -= -884005571) * 616356373];
                  rv.ab[rv.af * 616356373] = null;
                  return var4;
               }
            }

            label170: {
               if (var0 != 10000) {
                  if (var2 >= -1769310369) {
                     throw new IllegalStateException();
                  }

                  if (var0 >= 10000) {
                     break label170;
                  }

                  if (var2 >= -1769310369) {
                     throw new IllegalStateException();
                  }

                  if (!var1) {
                     break label170;
                  }

                  if (var2 >= -1769310369) {
                     throw new IllegalStateException();
                  }
               }

               if (rv.at * -1967111483 > 0) {
                  var4 = rv.az[(rv.at -= -1696338931) * -1967111483];
                  rv.az[rv.at * -1967111483] = null;
                  return var4;
               }
            }

            label179: {
               if (30000 != var0) {
                  if (var2 >= -1769310369) {
                     throw new IllegalStateException();
                  }

                  if (var0 >= 30000 || !var1) {
                     break label179;
                  }

                  if (var2 >= -1769310369) {
                     throw new IllegalStateException();
                  }
               }

               if (-1928887871 * rv.au > 0) {
                  if (var2 >= -1769310369) {
                     throw new IllegalStateException();
                  }

                  var4 = rv.aa[(rv.au -= 14650945) * -1928887871];
                  rv.aa[-1928887871 * rv.au] = null;
                  return var4;
               }
            }

            int var9;
            if (null != qt.as) {
               for(var9 = 0; var9 < ns.ai.length; ++var9) {
                  if (var2 >= -1769310369) {
                     throw new IllegalStateException();
                  }

                  if (var0 != ns.ai[var9]) {
                     if (var2 >= -1769310369) {
                        throw new IllegalStateException();
                     }

                     if (var0 >= ns.ai[var9]) {
                        continue;
                     }

                     if (var2 >= -1769310369) {
                        throw new IllegalStateException();
                     }

                     if (!var1) {
                        continue;
                     }

                     if (var2 >= -1769310369) {
                        throw new IllegalStateException();
                     }
                  }

                  if (ge.ao[var9] > 0) {
                     if (var2 >= -1769310369) {
                        throw new IllegalStateException();
                     }

                     byte[] var5 = qt.as[var9][--ge.ao[var9]];
                     qt.as[var9][ge.ao[var9]] = null;
                     return var5;
                  }
               }
            }

            if (var1) {
               if (var2 >= -1769310369) {
                  throw new IllegalStateException();
               }

               if (ns.ai != null) {
                  for(var9 = 0; var9 < ns.ai.length; ++var9) {
                     if (var2 >= -1769310369) {
                        throw new IllegalStateException();
                     }

                     if (var0 <= ns.ai[var9]) {
                        if (var2 >= -1769310369) {
                           throw new IllegalStateException();
                        }

                        if (ge.ao[var9] < qt.as[var9].length) {
                           return new byte[ns.ai[var9]];
                        }
                     }
                  }
               }
            }
         }

         return new byte[var0];
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "gm.ac(" + ')');
      }
   }

   static {
      new BitSet(65536);
   }

   public int[] af() {
      if (this.am == null) {
         String[] var1 = new String[this.ag.size()];
         this.am = new int[this.ag.size()];

         for(int var2 = 0; var2 < this.ag.size(); this.am[var2] = var2++) {
            var1[var2] = ((fy)this.ag.get(var2)).ag.ae(376856916);
         }

         fn.ae(var1, this.am, (byte)23);
      }

      return this.am;
   }

   public int[] at() {
      if (this.am == null) {
         String[] var1 = new String[this.ag.size()];
         this.am = new int[this.ag.size()];

         for(int var2 = 0; var2 < this.ag.size(); this.am[var2] = var2++) {
            var1[var2] = ((fy)this.ag.get(var2)).ag.ae(1199738791);
         }

         fn.ae(var1, this.am, (byte)92);
      }

      return this.am;
   }

   public int ap() {
      return this.ag.size();
   }

   void ar(fy var1) {
      this.ag.add(var1);
      this.am = null;
   }

   void al(int var1) {
      this.ag.remove(var1);
      this.am = null;
   }

   void ad(int var1) {
      this.ag.remove(var1);
      this.am = null;
   }

   void au(fy var1) {
      this.ag.add(var1);
      this.am = null;
   }

   void aq(vf var1, int var2) {
      try {
         int var3 = var1.cv(952452697);
         if ((var3 & 1) != 0) {
            if (var2 >= 1140956880) {
               throw new IllegalStateException();
            }

            this.ac = true;
         }

         if ((var3 & 2) != 0) {
            if (var2 >= 1140956880) {
               throw new IllegalStateException();
            }

            this.ae = true;
         }

         int var4 = 2;
         if (0 != (var3 & 4)) {
            if (var2 >= 1140956880) {
               throw new IllegalStateException();
            }

            var4 = var1.cv(952452697);
         }

         this.hk = var1.cw(1517437982);
         this.ax = var1.cw(226879456) * -7715408303829853865L;
         this.aq = var1.cs(974030836);
         var1.cl((byte)3);
         this.at = var1.cg((short)-6752);
         this.af = var1.cg((short)7865);
         int var5 = var1.ct(-2144053296);
         if (var5 > 0) {
            if (var2 >= 1140956880) {
               throw new IllegalStateException();
            }

            this.ag = new ArrayList(var5);

            for(int var6 = 0; var6 < var5; ++var6) {
               if (var2 >= 1140956880) {
                  throw new IllegalStateException();
               }

               fy var7 = new fy();
               if (this.ac) {
                  if (var2 >= 1140956880) {
                     throw new IllegalStateException();
                  }

                  var1.cw(1729661254);
               }

               if (this.ae) {
                  if (var2 >= 1140956880) {
                     return;
                  }

                  var7.ag = new wf(var1.cs(-914949870));
               }

               var7.ac = var1.cg((short)7824);
               var7.ae = var1.ct(-1668114022) * -1773229525;
               if (var4 >= 3) {
                  var1.cl((byte)74);
               }

               this.ag.add(var6, var7);
            }
         }

      } catch (RuntimeException var8) {
         throw vk.ae(var8, "gm.aq(" + ')');
      }
   }

   void ah(int var1) {
      this.ag.remove(var1);
      this.am = null;
   }

   public int az(String var1) {
      if (!this.ae) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for(int var2 = 0; var2 < this.ag.size(); ++var2) {
            if (((fy)this.ag.get(var2)).ag.ac((byte)100).equalsIgnoreCase(var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   public gm(vf var1) {
      try {
         super();
         this.ae = true;
         this.aq = null;
         this.aq(var1, -571778818);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "gm.<init>(" + ')');
      }
   }

   public int ai(String var1) {
      if (!this.ae) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for(int var2 = 0; var2 < this.ag.size(); ++var2) {
            if (((fy)this.ag.get(var2)).ag.ac((byte)100).equalsIgnoreCase(var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   void ao(vf var1) {
      int var2 = var1.cv(952452697);
      if ((var2 & 1) != 0) {
         this.ac = true;
      }

      if ((var2 & 2) != 0) {
         this.ae = true;
      }

      int var3 = 2;
      if (0 != (var2 & 4)) {
         var3 = var1.cv(952452697);
      }

      this.hk = var1.cw(249943784);
      this.ax = var1.cw(1244564191) * -7715408303829853865L;
      this.aq = var1.cs(-2003649746);
      var1.cl((byte)33);
      this.at = var1.cg((short)15034);
      this.af = var1.cg((short)-6549);
      int var4 = var1.ct(-1548134877);
      if (var4 > 0) {
         this.ag = new ArrayList(var4);

         for(int var5 = 0; var5 < var4; ++var5) {
            fy var6 = new fy();
            if (this.ac) {
               var1.cw(700812060);
            }

            if (this.ae) {
               var6.ag = new wf(var1.cs(-1749805166));
            }

            var6.ac = var1.cg((short)-11889);
            var6.ae = var1.ct(-1449027314) * -1773229525;
            if (var3 >= 3) {
               var1.cl((byte)-93);
            }

            this.ag.add(var5, var6);
         }
      }

   }

   static final int ag(int var0, int var1, int var2, int var3, int var4) {
      try {
         return var2 * var1 + var0 * var3 >> 16;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "gm.ag(" + ')');
      }
   }

   public int ab() {
      return this.ag.size();
   }
}
