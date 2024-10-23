import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class iu extends tp {
   int ao;
   static final int aw = 0;
   static final int ak = 1;
   public static mi ae = new mi(64);
   public static mi am = new mi(100);
   public int ag;
   public int au;
   public Map an;
   public static mi at = new mi(100);
   int af;
   public int[] ar;
   public int al;
   public int[] az;
   static boolean ap = false;
   int[] ad;
   boolean[] ac;
   public boolean av;
   public int ax;
   int[] ab;
   public int bv;
   public int aa;
   public boolean ah;
   public int bh;
   public int aq;
   public int bj;

   public jy bq(jy var1, int var2, iu var3, int var4) {
      if (ap && !this.au((byte)120) && !var3.au((byte)68)) {
         return this.am(var1, var2, var3, var4, 2052181429);
      } else {
         jy var5 = var1.ai(false);
         boolean var6 = false;
         ja var7 = null;
         jt var8 = null;
         fr var9;
         if (this.au((byte)109)) {
            var9 = this.ar(1806450519);
            if (var9 == null) {
               return var5;
            }

            if (var3.au((byte)86) && null == this.ac) {
               var5.az(var9, var2);
               return var5;
            }

            var8 = var9.aj;
            var5.av(var8, var9, var2, this.ac, false, !var3.au((byte)35));
         } else {
            var2 = this.ar[var2];
            var7 = ht.ao(var2 >> 16, (byte)2);
            var2 &= 65535;
            if (null == var7) {
               return var3.ai(var1, var4, (byte)32);
            }

            if (!var3.au((byte)114) && (null == this.ad || -1 == var4)) {
               var5.ab(var7, var2);
               return var5;
            }

            if (null == this.ad || -1 == var4) {
               var5.ab(var7, var2);
               return var5;
            }

            var6 = var3.au((byte)84);
            if (!var6) {
               var5.ax(var7, var2, this.ad, false);
            }
         }

         if (var3.au((byte)36)) {
            var9 = var3.ar(1960074058);
            if (null == var9) {
               return var5;
            }

            if (null == var8) {
               var8 = var9.aj;
            }

            var5.av(var8, var9, var4, this.ac, true, true);
         } else {
            var4 = var3.ar[var4];
            ja var10 = ht.ao(var4 >> 16, (byte)2);
            var4 &= 1260107761;
            if (var10 == null) {
               return this.ai(var1, var2, (byte)32);
            }

            var5.ax(var10, var4, this.ad, true);
         }

         if (var6 && null != var7) {
            var5.ax(var7, var2, this.ad, false);
         }

         var5.ar();
         return var5;
      }
   }

   void aw(vl var1, byte var2) {
      try {
         while(true) {
            int var3 = var1.cy((short)-16501);
            if (var3 == 0) {
               if (var2 != 32) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.ak(var1, var3, -233487200);
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "iu.aw(" + ')');
      }
   }

   fr bi() {
      if (this.au((byte)68)) {
         int var2 = this.au * 1773066635;
         fr var1;
         if (fu.af(var2, (byte)4) != 0) {
            var1 = null;
         } else {
            fr var4 = (fr)at.ap((long)var2);
            fr var3;
            if (null != var4) {
               var3 = var4;
            } else {
               var4 = lt.ap(id.ay, id.as, var2, false, (byte)0);
               if (var4 != null) {
                  at.ak(var4, (long)var2);
               }

               var3 = var4;
            }

            var1 = var3;
         }

         return var1;
      } else {
         return null;
      }
   }

   static ih bl(vl var0) {
      if (null != var0) {
         boolean var1 = false;
         int var2 = -1;
         boolean var3 = false;
         boolean var4 = false;
         boolean var5 = false;
         int var6 = var0.ce(1525746545);
         if (vw.ap * -1964001905 >= 226) {
            var2 = var0.cy((short)-4670);
         }

         int var7 = var0.cy((short)-28066);
         int var8 = var0.cy((short)-31331);
         int var9 = var0.cy((short)-12978);
         if (var6 >= 1 && var7 >= 1 && var8 >= 0 && var9 >= 0) {
            return new ih(var6, var2, var7, var8, var9);
         }
      }

      return null;
   }

   fr ar(int var1) {
      try {
         if (this.au((byte)97)) {
            if (var1 <= 73162165) {
               throw new IllegalStateException();
            } else {
               int var3 = this.au * 1773066635;
               fr var2;
               if (fu.af(var3, (byte)4) != 0) {
                  if (var1 <= 73162165) {
                     throw new IllegalStateException();
                  }

                  var2 = null;
               } else {
                  fr var5 = (fr)at.ap((long)var3);
                  fr var4;
                  if (null != var5) {
                     if (var1 <= 73162165) {
                        throw new IllegalStateException();
                     }

                     var4 = var5;
                  } else {
                     var5 = lt.ap(id.ay, id.as, var3, false, (byte)0);
                     if (var5 != null) {
                        if (var1 <= 73162165) {
                           throw new IllegalStateException();
                        }

                        at.ak(var5, (long)var3);
                     }

                     var4 = var5;
                  }

                  var2 = var4;
               }

               return var2;
            }
         } else {
            return null;
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "iu.ar(" + ')');
      }
   }

   public jy at(jy var1, int var2, int var3) {
      try {
         if (!this.au((byte)43)) {
            if (var3 <= -930362073) {
               throw new IllegalStateException();
            } else {
               int var4 = this.ar[var2];
               ja var5 = ht.ao(var4 >> 16, (byte)2);
               var4 &= 65535;
               if (var5 == null) {
                  return var1.ai(true);
               } else {
                  ja var6 = null;
                  int var7 = 0;
                  if (null != this.ab && var2 < this.ab.length) {
                     var7 = this.ab[var2];
                     var6 = ht.ao(var7 >> 16, (byte)2);
                     var7 &= 65535;
                  }

                  boolean var10001;
                  jy var8;
                  if (null != var6) {
                     if (var3 <= -930362073) {
                        throw new IllegalStateException();
                     }

                     if (var7 != 65535) {
                        if (!var5.aw(var4, -740907386)) {
                           if (var3 <= -930362073) {
                              throw new IllegalStateException();
                           }

                           var10001 = true;
                        } else {
                           var10001 = false;
                        }

                        boolean var10002;
                        if (!var6.aw(var7, -722546341)) {
                           if (var3 <= -930362073) {
                              throw new IllegalStateException();
                           }

                           var10002 = true;
                        } else {
                           var10002 = false;
                        }

                        var8 = var1.ai(var10001 & var10002);
                        var8.ab(var5, var4);
                        var8.ab(var6, var7);
                        return var8;
                     }

                     if (var3 <= -930362073) {
                        throw new IllegalStateException();
                     }
                  }

                  if (!var5.aw(var4, 534683872)) {
                     if (var3 <= -930362073) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  var8 = var1.ai(var10001);
                  var8.ab(var5, var4);
                  return var8;
               }
            }
         } else {
            return this.ai(var1, var2, (byte)32);
         }
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "iu.at(" + ')');
      }
   }

   jy as(jy var1, int var2, byte var3) {
      try {
         boolean var10001;
         if (!this.au((byte)111)) {
            if (var3 == 4) {
               throw new IllegalStateException();
            } else {
               var2 = this.ar[var2];
               ja var9 = ht.ao(var2 >> 16, (byte)2);
               var2 &= 65535;
               if (null == var9) {
                  if (var3 == 4) {
                     throw new IllegalStateException();
                  } else {
                     return var1.ay(true);
                  }
               } else {
                  if (!var9.aw(var2, -796402051)) {
                     if (var3 == 4) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  jy var10 = var1.ay(var10001);
                  var10.ab(var9, var2);
                  return var10;
               }
            }
         } else {
            int var5 = 1773066635 * this.au;
            fr var4;
            if (fu.af(var5, (byte)4) != 0) {
               if (var3 == 4) {
                  throw new IllegalStateException();
               }

               var4 = null;
            } else {
               fr var7 = (fr)at.ap((long)var5);
               fr var6;
               if (null != var7) {
                  if (var3 == 4) {
                     throw new IllegalStateException();
                  }

                  var6 = var7;
               } else {
                  var7 = lt.ap(id.ay, id.as, var5, false, (byte)0);
                  if (var7 != null) {
                     if (var3 == 4) {
                        throw new IllegalStateException();
                     }

                     at.ak(var7, (long)var5);
                  }

                  var6 = var7;
               }

               var4 = var6;
            }

            if (null == var4) {
               if (var3 == 4) {
                  throw new IllegalStateException();
               } else {
                  return var1.ay(true);
               }
            } else {
               if (!var4.ai((byte)-95)) {
                  if (var3 == 4) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               jy var11 = var1.ay(var10001);
               var11.az(var4, var2);
               return var11;
            }
         }
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "iu.as(" + ')');
      }
   }

   public jy ae(jy var1, int var2, iu var3, int var4, int var5) {
      try {
         if (ap) {
            if (var5 == 1671204863) {
               throw new IllegalStateException();
            }

            if (!this.au((byte)114)) {
               if (var5 == 1671204863) {
                  throw new IllegalStateException();
               }

               if (!var3.au((byte)38)) {
                  if (var5 == 1671204863) {
                     throw new IllegalStateException();
                  }

                  return this.am(var1, var2, var3, var4, -1505426327);
               }
            }
         }

         jy var6 = var1.ai(false);
         boolean var7 = false;
         ja var8 = null;
         jt var9 = null;
         fr var10;
         if (this.au((byte)75)) {
            if (var5 == 1671204863) {
               throw new IllegalStateException();
            }

            var10 = this.ar(529797865);
            if (var10 == null) {
               if (var5 == 1671204863) {
                  throw new IllegalStateException();
               }

               return var6;
            }

            if (var3.au((byte)74)) {
               if (var5 == 1671204863) {
                  throw new IllegalStateException();
               }

               if (null == this.ac) {
                  if (var5 == 1671204863) {
                     throw new IllegalStateException();
                  }

                  var6.az(var10, var2);
                  return var6;
               }
            }

            var9 = var10.aj;
            boolean[] var10004 = this.ac;
            boolean var10006;
            if (!var3.au((byte)123)) {
               if (var5 == 1671204863) {
                  throw new IllegalStateException();
               }

               var10006 = true;
            } else {
               var10006 = false;
            }

            var6.av(var9, var10, var2, var10004, false, var10006);
         } else {
            label184: {
               var2 = this.ar[var2];
               var8 = ht.ao(var2 >> 16, (byte)2);
               var2 &= 65535;
               if (null == var8) {
                  if (var5 == 1671204863) {
                     throw new IllegalStateException();
                  }

                  return var3.ai(var1, var4, (byte)32);
               }

               label181: {
                  if (!var3.au((byte)125)) {
                     if (null == this.ad) {
                        break label181;
                     }

                     if (-1 == var4) {
                        if (var5 == 1671204863) {
                           throw new IllegalStateException();
                        }
                        break label181;
                     }
                  }

                  if (null != this.ad) {
                     if (var5 == 1671204863) {
                        throw new IllegalStateException();
                     }

                     if (-1 != var4) {
                        var7 = var3.au((byte)92);
                        if (!var7) {
                           if (var5 == 1671204863) {
                              throw new IllegalStateException();
                           }

                           var6.ax(var8, var2, this.ad, false);
                        }
                        break label184;
                     }

                     if (var5 == 1671204863) {
                        throw new IllegalStateException();
                     }
                  }

                  var6.ab(var8, var2);
                  return var6;
               }

               var6.ab(var8, var2);
               return var6;
            }
         }

         if (var3.au((byte)99)) {
            if (var5 == 1671204863) {
               throw new IllegalStateException();
            }

            var10 = var3.ar(1955041283);
            if (null == var10) {
               if (var5 == 1671204863) {
                  throw new IllegalStateException();
               }

               return var6;
            }

            if (null == var9) {
               if (var5 == 1671204863) {
                  throw new IllegalStateException();
               }

               var9 = var10.aj;
            }

            var6.av(var9, var10, var4, this.ac, true, true);
         } else {
            var4 = var3.ar[var4];
            ja var12 = ht.ao(var4 >> 16, (byte)2);
            var4 &= 65535;
            if (var12 == null) {
               if (var5 == 1671204863) {
                  throw new IllegalStateException();
               }

               return this.ai(var1, var2, (byte)32);
            }

            var6.ax(var12, var4, this.ad, true);
         }

         if (var7) {
            if (var5 == 1671204863) {
               throw new IllegalStateException();
            }

            if (null != var8) {
               if (var5 == 1671204863) {
                  throw new IllegalStateException();
               }

               var6.ax(var8, var2, this.ad, false);
            }
         }

         var6.ar();
         return var6;
      } catch (RuntimeException var11) {
         throw tm.aw(var11, "iu.ae(" + ')');
      }
   }

   jy am(jy var1, int var2, iu var3, int var4, int var5) {
      try {
         var2 = this.ar[var2];
         ja var6 = ht.ao(var2 >> 16, (byte)2);
         var2 &= 65535;
         if (null == var6) {
            if (var5 == 1852782314) {
               throw new IllegalStateException();
            } else {
               return var3.ai(var1, var4, (byte)32);
            }
         } else {
            var4 = var3.ar[var4];
            ja var7 = ht.ao(var4 >> 16, (byte)2);
            var4 &= 65535;
            boolean var10001;
            jy var8;
            if (null == var7) {
               if (var5 == 1852782314) {
                  throw new IllegalStateException();
               } else {
                  if (!var6.aw(var2, 782771821)) {
                     if (var5 == 1852782314) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  var8 = var1.ai(var10001);
                  var8.ab(var6, var2);
                  return var8;
               }
            } else {
               if (!var6.aw(var2, -1421704331)) {
                  if (var5 == 1852782314) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               boolean var10002;
               if (!var7.aw(var4, -52378574)) {
                  if (var5 == 1852782314) {
                     throw new IllegalStateException();
                  }

                  var10002 = true;
               } else {
                  var10002 = false;
               }

               var8 = var1.ai(var10001 & var10002);
               var8.ac(var6, var2, var7, var4, this.ad);
               return var8;
            }
         }
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "iu.am(" + ')');
      }
   }

   public boolean br() {
      return this.au * 1773066635 >= 0;
   }

   public boolean au(byte var1) {
      try {
         boolean var10000;
         if (this.au * 1773066635 >= 0) {
            if (var1 <= 31) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "iu.au(" + ')');
      }
   }

   public int an(byte var1) {
      try {
         return -1218449545 * this.af - this.ao * 1657458627;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "iu.an(" + ')');
      }
   }

   void aj(byte var1) {
      try {
         if (-1 == this.bh * -1111773607) {
            label56: {
               if (var1 == 2) {
                  throw new IllegalStateException();
               }

               if (this.ad == null) {
                  if (var1 == 2) {
                     throw new IllegalStateException();
                  }

                  if (null == this.ac) {
                     this.bh = 0;
                     break label56;
                  }

                  if (var1 == 2) {
                     throw new IllegalStateException();
                  }
               }

               this.bh = 1164014546;
            }
         }

         if (-1 == 805033701 * this.bj) {
            if (var1 == 2) {
               throw new IllegalStateException();
            }

            if (null == this.ad) {
               if (var1 == 2) {
                  return;
               }

               if (this.ac == null) {
                  this.bj = 0;
                  return;
               }

               if (var1 == 2) {
                  throw new IllegalStateException();
               }
            }

            this.bj = -861540902;
         }

      } catch (RuntimeException var2) {
         throw tm.aw(var2, "iu.aj(" + ')');
      }
   }

   public static iu az(int var0) {
      iu var1 = (iu)ae.ap((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = uq.ai.bm(12, var0, 1233098775);
         var1 = new iu();
         if (var2 != null) {
            var1.aw(new vl(var2), (byte)32);
         }

         var1.aj((byte)52);
         ae.ak(var1, (long)var0);
         return var1;
      }
   }

   public static iu ag(int var0) {
      iu var1 = (iu)ae.ap((long)var0);
      if (null != var1) {
         return var1;
      } else {
         byte[] var2 = uq.ai.bm(12, var0, 757977537);
         var1 = new iu();
         if (var2 != null) {
            var1.aw(new vl(var2), (byte)32);
         }

         var1.aj((byte)-64);
         ae.ak(var1, (long)var0);
         return var1;
      }
   }

   void ad(vl var1) {
      while(true) {
         int var2 = var1.cy((short)-31522);
         if (var2 == 0) {
            return;
         }

         this.ak(var1, var2, -501314118);
      }
   }

   void ac(vl var1) {
      while(true) {
         int var2 = var1.cy((short)-17040);
         if (var2 == 0) {
            return;
         }

         this.ak(var1, var2, -126100514);
      }
   }

   void av(vl var1) {
      while(true) {
         int var2 = var1.cy((short)-32129);
         if (var2 == 0) {
            return;
         }

         this.ak(var1, var2, 24099507);
      }
   }

   void ax(vl var1) {
      while(true) {
         int var2 = var1.cy((short)-17840);
         if (var2 == 0) {
            return;
         }

         this.ak(var1, var2, -211570440);
      }
   }

   jy ay(jy var1, int var2, int var3, byte var4) {
      try {
         if (!this.au((byte)114)) {
            if (var4 >= 0) {
               throw new IllegalStateException();
            } else {
               var2 = this.ar[var2];
               ja var10 = ht.ao(var2 >> 16, (byte)2);
               var2 &= 65535;
               if (var10 == null) {
                  if (var4 >= 0) {
                     throw new IllegalStateException();
                  } else {
                     return var1.ai(true);
                  }
               } else {
                  jy var11 = var1.ai(!var10.aw(var2, 755008747));
                  var3 &= 3;
                  if (1 == var3) {
                     var11.ah();
                  } else if (2 == var3) {
                     if (var4 >= 0) {
                        throw new IllegalStateException();
                     }

                     var11.aa();
                  } else if (3 == var3) {
                     var11.al();
                  }

                  var11.ab(var10, var2);
                  if (1 == var3) {
                     if (var4 >= 0) {
                        throw new IllegalStateException();
                     }

                     var11.al();
                  } else if (2 == var3) {
                     var11.aa();
                  } else if (var3 == 3) {
                     if (var4 >= 0) {
                        throw new IllegalStateException();
                     }

                     var11.ah();
                  }

                  return var11;
               }
            }
         } else {
            int var6 = this.au * 1773066635;
            fr var5;
            if (fu.af(var6, (byte)4) != 0) {
               if (var4 >= 0) {
                  throw new IllegalStateException();
               }

               var5 = null;
            } else {
               fr var8 = (fr)at.ap((long)var6);
               fr var7;
               if (var8 != null) {
                  if (var4 >= 0) {
                     throw new IllegalStateException();
                  }

                  var7 = var8;
               } else {
                  var8 = lt.ap(id.ay, id.as, var6, false, (byte)0);
                  if (var8 != null) {
                     if (var4 >= 0) {
                        throw new IllegalStateException();
                     }

                     at.ak(var8, (long)var6);
                  }

                  var7 = var8;
               }

               var5 = var7;
            }

            if (null == var5) {
               if (var4 >= 0) {
                  throw new IllegalStateException();
               } else {
                  return var1.ai(true);
               }
            } else {
               boolean var10001;
               if (!var5.ai((byte)-77)) {
                  if (var4 >= 0) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               jy var12 = var1.ai(var10001);
               var3 &= 3;
               if (var3 == 1) {
                  if (var4 >= 0) {
                     throw new IllegalStateException();
                  }

                  var12.ah();
               } else if (var3 == 2) {
                  if (var4 >= 0) {
                     throw new IllegalStateException();
                  }

                  var12.aa();
               } else if (var3 == 3) {
                  if (var4 >= 0) {
                     throw new IllegalStateException();
                  }

                  var12.al();
               }

               var12.az(var5, var2);
               if (var3 == 1) {
                  if (var4 >= 0) {
                     throw new IllegalStateException();
                  }

                  var12.al();
               } else if (var3 == 2) {
                  var12.aa();
               } else if (var3 == 3) {
                  if (var4 >= 0) {
                     throw new IllegalStateException();
                  }

                  var12.ah();
               }

               return var12;
            }
         }
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "iu.ay(" + ')');
      }
   }

   void al(vl var1, int var2) {
      int var3;
      int var4;
      if (1 == var2) {
         var3 = var1.ce(968135634);
         this.az = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.az[var4] = var1.ce(2077236140);
         }

         this.ar = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ar[var4] = var1.ce(62088631);
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.ar[var4] += var1.ce(740928544) << 16;
         }
      } else if (2 == var2) {
         this.ag = var1.ce(733005481) * 102325687;
      } else if (var2 == 3) {
         var3 = var1.cy((short)-7352);
         this.ad = new int[1 + var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ad[var4] = var1.cy((short)-371);
         }

         this.ad[var3] = 9999999;
      } else if (var2 == 4) {
         this.av = true;
      } else if (5 == var2) {
         this.ax = var1.cy((short)-5914) * 1350539065;
      } else if (var2 == 6) {
         this.aq = var1.ce(114484227) * -490768043;
      } else if (var2 == 7) {
         this.al = var1.ce(1410598484) * 1575782029;
      } else if (var2 == 8) {
         this.aa = var1.cy((short)-8847) * 111165331;
         this.ah = true;
      } else if (9 == var2) {
         this.bh = var1.cy((short)-26857) * 582007273;
      } else if (10 == var2) {
         this.bj = var1.cy((short)-18373) * -430770451;
      } else if (var2 == 11) {
         this.bv = var1.cy((short)-15527) * 525506903;
      } else if (var2 == 12) {
         var3 = var1.cy((short)-8699);
         this.ab = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ab[var4] = var1.ce(925770194);
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.ab[var4] += var1.ce(962958913) << 16;
         }
      } else if (var2 == 13) {
         if (-1964001905 * vw.ap >= 226) {
            this.au = var1.ch(1203709469) * -706935261;
         } else {
            var3 = var1.cy((short)-14686);
            if (null == this.an) {
               this.an = new HashMap();
            }

            for(var4 = 0; var4 < var3; ++var4) {
               ih var5 = if.ab(var1, (byte)84);
               if (null != var5) {
                  if (!this.an.containsKey(var4)) {
                     this.an.put(var4, new ArrayList());
                  }

                  ((ArrayList)this.an.get(var4)).add(var5);
               }
            }
         }
      } else {
         ih var6;
         int var7;
         if (14 == var2) {
            if (-1964001905 * vw.ap >= 226) {
               var3 = var1.ce(763343335);
               if (null == this.an) {
                  this.an = new HashMap();
               }

               for(var4 = 0; var4 < var3; ++var4) {
                  var7 = var1.ce(510458261);
                  var6 = if.ab(var1, (byte)17);
                  if (null != var6) {
                     if (!this.an.containsKey(var7)) {
                        this.an.put(var7, new ArrayList());
                     }

                     ((ArrayList)this.an.get(var7)).add(var6);
                  }
               }
            } else {
               this.au = var1.ch(1203709469) * -706935261;
            }
         } else if (15 == var2) {
            if (-1964001905 * vw.ap >= 226) {
               this.ao = var1.ce(1391249728) * 1840453867;
               this.af = var1.ce(1342217833) * -266233273;
            } else {
               var3 = var1.ce(912086320);
               if (null == this.an) {
                  this.an = new HashMap();
               }

               for(var4 = 0; var4 < var3; ++var4) {
                  var7 = var1.ce(518007569);
                  var6 = if.ab(var1, (byte)28);
                  if (var6 != null) {
                     if (!this.an.containsKey(var7)) {
                        this.an.put(var7, new ArrayList());
                     }

                     ((ArrayList)this.an.get(var7)).add(var6);
                  }
               }
            }
         } else if (16 == var2) {
            if (vw.ap * -1964001905 < 226) {
               this.ao = var1.ce(533059682) * 1840453867;
               this.af = var1.ce(472138959) * -266233273;
            }
         } else if (var2 == 17) {
            this.ac = new boolean[256];

            for(var3 = 0; var3 < this.ac.length; ++var3) {
               this.ac[var3] = false;
            }

            var3 = var1.cy((short)-15282);

            for(var4 = 0; var4 < var3; ++var4) {
               this.ac[var1.cy((short)-23554)] = true;
            }
         }
      }

   }

   public jy aa(jy var1, int var2) {
      if (!this.au((byte)87)) {
         var2 = this.ar[var2];
         ja var7 = ht.ao(var2 >> 16, (byte)2);
         var2 &= 1148482489;
         if (null == var7) {
            return var1.ai(true);
         } else {
            jy var8 = var1.ai(!var7.aw(var2, -566532898));
            var8.ab(var7, var2);
            return var8;
         }
      } else {
         int var4 = this.au * 1773066635;
         fr var3;
         if (fu.af(var4, (byte)4) != 0) {
            var3 = null;
         } else {
            fr var6 = (fr)at.ap((long)var4);
            fr var5;
            if (null != var6) {
               var5 = var6;
            } else {
               var6 = lt.ap(id.ay, id.as, var4, false, (byte)0);
               if (var6 != null) {
                  at.ak(var6, (long)var4);
               }

               var5 = var6;
            }

            var3 = var5;
         }

         if (var3 == null) {
            return var1.ai(true);
         } else {
            jy var9 = var1.ai(!var3.ai((byte)-56));
            var9.az(var3, var2);
            return var9;
         }
      }
   }

   jy ah(jy var1, int var2, int var3) {
      if (!this.au((byte)48)) {
         var2 = this.ar[var2];
         ja var8 = ht.ao(var2 >> 16, (byte)2);
         var2 &= 65535;
         if (var8 == null) {
            return var1.ai(true);
         } else {
            jy var9 = var1.ai(!var8.aw(var2, -30752425));
            var3 &= 3;
            if (1 == var3) {
               var9.ah();
            } else if (2 == var3) {
               var9.aa();
            } else if (3 == var3) {
               var9.al();
            }

            var9.ab(var8, var2);
            if (1 == var3) {
               var9.al();
            } else if (2 == var3) {
               var9.aa();
            } else if (var3 == 3) {
               var9.ah();
            }

            return var9;
         }
      } else {
         int var5 = this.au * 1773066635;
         fr var4;
         if (fu.af(var5, (byte)4) != 0) {
            var4 = null;
         } else {
            fr var7 = (fr)at.ap((long)var5);
            fr var6;
            if (var7 != null) {
               var6 = var7;
            } else {
               var7 = lt.ap(id.ay, id.as, var5, false, (byte)0);
               if (var7 != null) {
                  at.ak(var7, (long)var5);
               }

               var6 = var7;
            }

            var4 = var6;
         }

         if (null == var4) {
            return var1.ai(true);
         } else {
            jy var10 = var1.ai(!var4.ai((byte)-6));
            var3 &= 3;
            if (var3 == 1) {
               var10.ah();
            } else if (var3 == 2) {
               var10.aa();
            } else if (var3 == 3) {
               var10.al();
            }

            var10.az(var4, var2);
            if (var3 == 1) {
               var10.al();
            } else if (var3 == 2) {
               var10.aa();
            } else if (var3 == 3) {
               var10.ah();
            }

            return var10;
         }
      }
   }

   jy bh(jy var1, int var2, int var3) {
      if (!this.au((byte)122)) {
         var2 = this.ar[var2];
         ja var8 = ht.ao(var2 >> 16, (byte)2);
         var2 &= 65535;
         if (var8 == null) {
            return var1.ai(true);
         } else {
            jy var9 = var1.ai(!var8.aw(var2, 1074204518));
            var3 &= 3;
            if (1 == var3) {
               var9.ah();
            } else if (2 == var3) {
               var9.aa();
            } else if (3 == var3) {
               var9.al();
            }

            var9.ab(var8, var2);
            if (1 == var3) {
               var9.al();
            } else if (2 == var3) {
               var9.aa();
            } else if (var3 == 3) {
               var9.ah();
            }

            return var9;
         }
      } else {
         int var5 = this.au * 1773066635;
         fr var4;
         if (fu.af(var5, (byte)4) != 0) {
            var4 = null;
         } else {
            fr var7 = (fr)at.ap((long)var5);
            fr var6;
            if (var7 != null) {
               var6 = var7;
            } else {
               var7 = lt.ap(id.ay, id.as, var5, false, (byte)0);
               if (var7 != null) {
                  at.ak(var7, (long)var5);
               }

               var6 = var7;
            }

            var4 = var6;
         }

         if (null == var4) {
            return var1.ai(true);
         } else {
            jy var10 = var1.ai(!var4.ai((byte)-47));
            var3 &= 3;
            if (var3 == 1) {
               var10.ah();
            } else if (var3 == 2) {
               var10.aa();
            } else if (var3 == 3) {
               var10.al();
            }

            var10.az(var4, var2);
            if (var3 == 1) {
               var10.al();
            } else if (var3 == 2) {
               var10.aa();
            } else if (var3 == 3) {
               var10.ah();
            }

            return var10;
         }
      }
   }

   jy bj(jy var1, int var2, int var3) {
      if (!this.au((byte)119)) {
         var2 = this.ar[var2];
         ja var8 = ht.ao(var2 >> 16, (byte)2);
         var2 &= 687327141;
         if (var8 == null) {
            return var1.ai(true);
         } else {
            jy var9 = var1.ai(!var8.aw(var2, 659086115));
            var3 &= 3;
            if (1 == var3) {
               var9.ah();
            } else if (2 == var3) {
               var9.aa();
            } else if (3 == var3) {
               var9.al();
            }

            var9.ab(var8, var2);
            if (1 == var3) {
               var9.al();
            } else if (2 == var3) {
               var9.aa();
            } else if (var3 == 3) {
               var9.ah();
            }

            return var9;
         }
      } else {
         int var5 = this.au * -614007297;
         fr var4;
         if (fu.af(var5, (byte)4) != 0) {
            var4 = null;
         } else {
            fr var7 = (fr)at.ap((long)var5);
            fr var6;
            if (var7 != null) {
               var6 = var7;
            } else {
               var7 = lt.ap(id.ay, id.as, var5, false, (byte)0);
               if (var7 != null) {
                  at.ak(var7, (long)var5);
               }

               var6 = var7;
            }

            var4 = var6;
         }

         if (null == var4) {
            return var1.ai(true);
         } else {
            jy var10 = var1.ai(!var4.ai((byte)-82));
            var3 &= 3;
            if (var3 == 1) {
               var10.ah();
            } else if (var3 == 2) {
               var10.aa();
            } else if (var3 == 3) {
               var10.al();
            }

            var10.az(var4, var2);
            if (var3 == 1) {
               var10.al();
            } else if (var3 == 2) {
               var10.aa();
            } else if (var3 == 3) {
               var10.ah();
            }

            return var10;
         }
      }
   }

   jy bv(jy var1, int var2, int var3) {
      if (!this.au((byte)65)) {
         var2 = this.ar[var2];
         ja var8 = ht.ao(var2 >> 16, (byte)2);
         var2 &= 65535;
         if (var8 == null) {
            return var1.ai(true);
         } else {
            jy var9 = var1.ai(!var8.aw(var2, -1871158891));
            var3 &= 3;
            if (1 == var3) {
               var9.ah();
            } else if (2 == var3) {
               var9.aa();
            } else if (3 == var3) {
               var9.al();
            }

            var9.ab(var8, var2);
            if (1 == var3) {
               var9.al();
            } else if (2 == var3) {
               var9.aa();
            } else if (var3 == 3) {
               var9.ah();
            }

            return var9;
         }
      } else {
         int var5 = this.au * 1773066635;
         fr var4;
         if (fu.af(var5, (byte)4) != 0) {
            var4 = null;
         } else {
            fr var7 = (fr)at.ap((long)var5);
            fr var6;
            if (var7 != null) {
               var6 = var7;
            } else {
               var7 = lt.ap(id.ay, id.as, var5, false, (byte)0);
               if (var7 != null) {
                  at.ak(var7, (long)var5);
               }

               var6 = var7;
            }

            var4 = var6;
         }

         if (null == var4) {
            return var1.ai(true);
         } else {
            jy var10 = var1.ai(!var4.ai((byte)-36));
            var3 &= 3;
            if (var3 == 1) {
               var10.ah();
            } else if (var3 == 2) {
               var10.aa();
            } else if (var3 == 3) {
               var10.al();
            }

            var10.az(var4, var2);
            if (var3 == 1) {
               var10.al();
            } else if (var3 == 2) {
               var10.aa();
            } else if (var3 == 3) {
               var10.ah();
            }

            return var10;
         }
      }
   }

   void aq(vl var1, int var2) {
      int var3;
      int var4;
      if (1 == var2) {
         var3 = var1.ce(169301558);
         this.az = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.az[var4] = var1.ce(134718455);
         }

         this.ar = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ar[var4] = var1.ce(2029580345);
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.ar[var4] += var1.ce(1886754968) << 16;
         }
      } else if (2 == var2) {
         this.ag = var1.ce(43362539) * 102325687;
      } else if (var2 == 3) {
         var3 = var1.cy((short)-24709);
         this.ad = new int[1 + var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ad[var4] = var1.cy((short)-13381);
         }

         this.ad[var3] = 9999999;
      } else if (var2 == 4) {
         this.av = true;
      } else if (5 == var2) {
         this.ax = var1.cy((short)-3692) * 625022570;
      } else if (var2 == 6) {
         this.aq = var1.ce(824136739) * -1675935551;
      } else if (var2 == 7) {
         this.al = var1.ce(1671975059) * 1575782029;
      } else if (var2 == 8) {
         this.aa = var1.cy((short)-30855) * -738424469;
         this.ah = true;
      } else if (9 == var2) {
         this.bh = var1.cy((short)-8984) * 582007273;
      } else if (10 == var2) {
         this.bj = var1.cy((short)-971) * 1017723484;
      } else if (var2 == 11) {
         this.bv = var1.cy((short)-30919) * 525506903;
      } else if (var2 == 12) {
         var3 = var1.cy((short)-5527);
         this.ab = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.ab[var4] = var1.ce(1844919460);
         }

         for(var4 = 0; var4 < var3; ++var4) {
            this.ab[var4] += var1.ce(742035149) << 16;
         }
      } else if (var2 == 13) {
         if (291338557 * vw.ap >= 226) {
            this.au = var1.ch(1203709469) * 93315382;
         } else {
            var3 = var1.cy((short)-25785);
            if (null == this.an) {
               this.an = new HashMap();
            }

            for(var4 = 0; var4 < var3; ++var4) {
               ih var5 = if.ab(var1, (byte)28);
               if (null != var5) {
                  if (!this.an.containsKey(var4)) {
                     this.an.put(var4, new ArrayList());
                  }

                  ((ArrayList)this.an.get(var4)).add(var5);
               }
            }
         }
      } else {
         ih var6;
         int var7;
         if (14 == var2) {
            if (-1917082151 * vw.ap >= 2006261453) {
               var3 = var1.ce(83070167);
               if (null == this.an) {
                  this.an = new HashMap();
               }

               for(var4 = 0; var4 < var3; ++var4) {
                  var7 = var1.ce(485782226);
                  var6 = if.ab(var1, (byte)112);
                  if (null != var6) {
                     if (!this.an.containsKey(var7)) {
                        this.an.put(var7, new ArrayList());
                     }

                     ((ArrayList)this.an.get(var7)).add(var6);
                  }
               }
            } else {
               this.au = var1.ch(1203709469) * 348769187;
            }
         } else if (15 == var2) {
            if (-1964001905 * vw.ap >= 226) {
               this.ao = var1.ce(119174930) * 1840453867;
               this.af = var1.ce(1447231304) * -266233273;
            } else {
               var3 = var1.ce(610574226);
               if (null == this.an) {
                  this.an = new HashMap();
               }

               for(var4 = 0; var4 < var3; ++var4) {
                  var7 = var1.ce(1589715428);
                  var6 = if.ab(var1, (byte)67);
                  if (var6 != null) {
                     if (!this.an.containsKey(var7)) {
                        this.an.put(var7, new ArrayList());
                     }

                     ((ArrayList)this.an.get(var7)).add(var6);
                  }
               }
            }
         } else if (16 == var2) {
            if (vw.ap * -1964001905 < -2062065514) {
               this.ao = var1.ce(1655044120) * -274842109;
               this.af = var1.ce(500735001) * 1263293662;
            }
         } else if (var2 == 17) {
            this.ac = new boolean[256];

            for(var3 = 0; var3 < this.ac.length; ++var3) {
               this.ac[var3] = false;
            }

            var3 = var1.cy((short)-20500);

            for(var4 = 0; var4 < var3; ++var4) {
               this.ac[var1.cy((short)-910)] = true;
            }
         }
      }

   }

   public jy bk(jy var1, int var2, iu var3, int var4) {
      if (ap && !this.au((byte)82) && !var3.au((byte)115)) {
         return this.am(var1, var2, var3, var4, -934599038);
      } else {
         jy var5 = var1.ai(false);
         boolean var6 = false;
         ja var7 = null;
         jt var8 = null;
         fr var9;
         if (this.au((byte)89)) {
            var9 = this.ar(431571180);
            if (var9 == null) {
               return var5;
            }

            if (var3.au((byte)34) && null == this.ac) {
               var5.az(var9, var2);
               return var5;
            }

            var8 = var9.aj;
            var5.av(var8, var9, var2, this.ac, false, !var3.au((byte)49));
         } else {
            var2 = this.ar[var2];
            var7 = ht.ao(var2 >> 16, (byte)2);
            var2 &= 65535;
            if (null == var7) {
               return var3.ai(var1, var4, (byte)32);
            }

            if (!var3.au((byte)81) && (null == this.ad || -1 == var4)) {
               var5.ab(var7, var2);
               return var5;
            }

            if (null == this.ad || -1 == var4) {
               var5.ab(var7, var2);
               return var5;
            }

            var6 = var3.au((byte)91);
            if (!var6) {
               var5.ax(var7, var2, this.ad, false);
            }
         }

         if (var3.au((byte)54)) {
            var9 = var3.ar(925674900);
            if (null == var9) {
               return var5;
            }

            if (null == var8) {
               var8 = var9.aj;
            }

            var5.av(var8, var9, var4, this.ac, true, true);
         } else {
            var4 = var3.ar[var4];
            ja var10 = ht.ao(var4 >> 16, (byte)2);
            var4 &= -932474437;
            if (var10 == null) {
               return this.ai(var1, var2, (byte)32);
            }

            var5.ax(var10, var4, this.ad, true);
         }

         if (var6 && null != var7) {
            var5.ax(var7, var2, this.ad, false);
         }

         var5.ar();
         return var5;
      }
   }

   static ds[] ap(int var0) {
      try {
         return new ds[]{ds.aj, ds.ap, ds.ai, ds.ak, ds.aw};
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "iu.ap(" + ')');
      }
   }

   public jy bb(jy var1, int var2, iu var3, int var4) {
      if (ap && !this.au((byte)112) && !var3.au((byte)48)) {
         return this.am(var1, var2, var3, var4, 1013073680);
      } else {
         jy var5 = var1.ai(false);
         boolean var6 = false;
         ja var7 = null;
         jt var8 = null;
         fr var9;
         if (this.au((byte)41)) {
            var9 = this.ar(1092082572);
            if (var9 == null) {
               return var5;
            }

            if (var3.au((byte)105) && null == this.ac) {
               var5.az(var9, var2);
               return var5;
            }

            var8 = var9.aj;
            var5.av(var8, var9, var2, this.ac, false, !var3.au((byte)85));
         } else {
            var2 = this.ar[var2];
            var7 = ht.ao(var2 >> 16, (byte)2);
            var2 &= 65535;
            if (null == var7) {
               return var3.ai(var1, var4, (byte)32);
            }

            if (!var3.au((byte)76) && (null == this.ad || -1 == var4)) {
               var5.ab(var7, var2);
               return var5;
            }

            if (null == this.ad || -1 == var4) {
               var5.ab(var7, var2);
               return var5;
            }

            var6 = var3.au((byte)43);
            if (!var6) {
               var5.ax(var7, var2, this.ad, false);
            }
         }

         if (var3.au((byte)41)) {
            var9 = var3.ar(1806079958);
            if (null == var9) {
               return var5;
            }

            if (null == var8) {
               var8 = var9.aj;
            }

            var5.av(var8, var9, var4, this.ac, true, true);
         } else {
            var4 = var3.ar[var4];
            ja var10 = ht.ao(var4 >> 16, (byte)2);
            var4 &= 65535;
            if (var10 == null) {
               return this.ai(var1, var2, (byte)32);
            }

            var5.ax(var10, var4, this.ad, true);
         }

         if (var6 && null != var7) {
            var5.ax(var7, var2, this.ad, false);
         }

         var5.ar();
         return var5;
      }
   }

   iu() {
      try {
         super();
         this.au = 706935261;
         this.ao = 0;
         this.af = 0;
         this.ag = -102325687;
         this.av = false;
         this.ax = -1837239267;
         this.aq = 490768043;
         this.al = -1575782029;
         this.aa = -1879534119;
         this.ah = false;
         this.bh = -582007273;
         this.bj = 430770451;
         this.bv = 1051013806;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "iu.<init>(" + ')');
      }
   }

   jy bz(jy var1, int var2, iu var3, int var4) {
      var2 = this.ar[var2];
      ja var5 = ht.ao(var2 >> 16, (byte)2);
      var2 &= -1508173772;
      if (null == var5) {
         return var3.ai(var1, var4, (byte)32);
      } else {
         var4 = var3.ar[var4];
         ja var6 = ht.ao(var4 >> 16, (byte)2);
         var4 &= 65535;
         jy var7;
         if (null == var6) {
            var7 = var1.ai(!var5.aw(var2, -1482977860));
            var7.ab(var5, var2);
            return var7;
         } else {
            var7 = var1.ai(!var5.aw(var2, -796665295) & !var6.aw(var4, 914895251));
            var7.ac(var5, var2, var6, var4, this.ad);
            return var7;
         }
      }
   }

   jy bc(jy var1, int var2, iu var3, int var4) {
      var2 = this.ar[var2];
      ja var5 = ht.ao(var2 >> 16, (byte)2);
      var2 &= 65535;
      if (null == var5) {
         return var3.ai(var1, var4, (byte)32);
      } else {
         var4 = var3.ar[var4];
         ja var6 = ht.ao(var4 >> 16, (byte)2);
         var4 &= 65535;
         jy var7;
         if (null == var6) {
            var7 = var1.ai(!var5.aw(var2, -1342348281));
            var7.ab(var5, var2);
            return var7;
         } else {
            var7 = var1.ai(!var5.aw(var2, -637533238) & !var6.aw(var4, 1290149881));
            var7.ac(var5, var2, var6, var4, this.ad);
            return var7;
         }
      }
   }

   jy by(jy var1, int var2, iu var3, int var4) {
      var2 = this.ar[var2];
      ja var5 = ht.ao(var2 >> 16, (byte)2);
      var2 &= 65535;
      if (null == var5) {
         return var3.ai(var1, var4, (byte)32);
      } else {
         var4 = var3.ar[var4];
         ja var6 = ht.ao(var4 >> 16, (byte)2);
         var4 &= 65535;
         jy var7;
         if (null == var6) {
            var7 = var1.ai(!var5.aw(var2, -31405410));
            var7.ab(var5, var2);
            return var7;
         } else {
            var7 = var1.ai(!var5.aw(var2, -1402427991) & !var6.aw(var4, 1484073825));
            var7.ac(var5, var2, var6, var4, this.ad);
            return var7;
         }
      }
   }

   void ak(vl var1, int var2, int var3) {
      try {
         int var4;
         int var5;
         if (1 == var2) {
            if (var3 == 1301465989) {
               return;
            }

            var4 = var1.ce(353818548);
            this.az = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 == 1301465989) {
                  throw new IllegalStateException();
               }

               this.az[var5] = var1.ce(157359825);
            }

            this.ar = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 == 1301465989) {
                  return;
               }

               this.ar[var5] = var1.ce(1094906508);
            }

            for(var5 = 0; var5 < var4; ++var5) {
               this.ar[var5] += var1.ce(496649341) << 16;
            }
         } else if (2 == var2) {
            this.ag = var1.ce(50053454) * 102325687;
         } else if (var2 == 3) {
            if (var3 == 1301465989) {
               return;
            }

            var4 = var1.cy((short)-30750);
            this.ad = new int[1 + var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 == 1301465989) {
                  return;
               }

               this.ad[var5] = var1.cy((short)-21604);
            }

            this.ad[var4] = 9999999;
         } else if (var2 == 4) {
            this.av = true;
         } else if (5 == var2) {
            if (var3 == 1301465989) {
               throw new IllegalStateException();
            }

            this.ax = var1.cy((short)-18727) * 1350539065;
         } else if (var2 == 6) {
            this.aq = var1.ce(1108432102) * -490768043;
         } else if (var2 == 7) {
            if (var3 == 1301465989) {
               throw new IllegalStateException();
            }

            this.al = var1.ce(357676554) * 1575782029;
         } else if (var2 == 8) {
            if (var3 == 1301465989) {
               throw new IllegalStateException();
            }

            this.aa = var1.cy((short)-25053) * 111165331;
            this.ah = true;
         } else if (9 == var2) {
            this.bh = var1.cy((short)-28331) * 582007273;
         } else if (10 == var2) {
            if (var3 == 1301465989) {
               throw new IllegalStateException();
            }

            this.bj = var1.cy((short)-18305) * -430770451;
         } else if (var2 == 11) {
            this.bv = var1.cy((short)-7189) * 525506903;
         } else if (var2 == 12) {
            if (var3 == 1301465989) {
               throw new IllegalStateException();
            }

            var4 = var1.cy((short)-4979);
            this.ab = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 == 1301465989) {
                  return;
               }

               this.ab[var5] = var1.ce(1699100435);
            }

            for(var5 = 0; var5 < var4; ++var5) {
               if (var3 == 1301465989) {
                  throw new IllegalStateException();
               }

               this.ab[var5] += var1.ce(99829316) << 16;
            }
         } else if (var2 == 13) {
            if (-1964001905 * vw.ap >= 226) {
               if (var3 == 1301465989) {
                  return;
               }

               this.au = var1.ch(1203709469) * -706935261;
            } else {
               var4 = var1.cy((short)-19461);
               if (null == this.an) {
                  if (var3 == 1301465989) {
                     throw new IllegalStateException();
                  }

                  this.an = new HashMap();
               }

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 == 1301465989) {
                     throw new IllegalStateException();
                  }

                  ih var6 = if.ab(var1, (byte)69);
                  if (null == var6) {
                     if (var3 == 1301465989) {
                        throw new IllegalStateException();
                     }
                  } else {
                     if (!this.an.containsKey(var5)) {
                        if (var3 == 1301465989) {
                           throw new IllegalStateException();
                        }

                        this.an.put(var5, new ArrayList());
                     }

                     ((ArrayList)this.an.get(var5)).add(var6);
                  }
               }
            }
         } else {
            ih var7;
            int var9;
            if (14 == var2) {
               if (-1964001905 * vw.ap >= 226) {
                  if (var3 == 1301465989) {
                     return;
                  }

                  var4 = var1.ce(1216335788);
                  if (null == this.an) {
                     if (var3 == 1301465989) {
                        throw new IllegalStateException();
                     }

                     this.an = new HashMap();
                  }

                  for(var5 = 0; var5 < var4; ++var5) {
                     if (var3 == 1301465989) {
                        return;
                     }

                     var9 = var1.ce(1341130592);
                     var7 = if.ab(var1, (byte)20);
                     if (null == var7) {
                        if (var3 == 1301465989) {
                           throw new IllegalStateException();
                        }
                     } else {
                        if (!this.an.containsKey(var9)) {
                           if (var3 == 1301465989) {
                              throw new IllegalStateException();
                           }

                           this.an.put(var9, new ArrayList());
                        }

                        ((ArrayList)this.an.get(var9)).add(var7);
                     }
                  }
               } else {
                  this.au = var1.ch(1203709469) * -706935261;
               }
            } else if (15 == var2) {
               if (var3 == 1301465989) {
                  return;
               }

               if (-1964001905 * vw.ap >= 226) {
                  this.ao = var1.ce(1637213413) * 1840453867;
                  this.af = var1.ce(905486233) * -266233273;
               } else {
                  var4 = var1.ce(549019474);
                  if (null == this.an) {
                     this.an = new HashMap();
                  }

                  for(var5 = 0; var5 < var4; ++var5) {
                     if (var3 == 1301465989) {
                        throw new IllegalStateException();
                     }

                     var9 = var1.ce(46199690);
                     var7 = if.ab(var1, (byte)84);
                     if (var7 == null) {
                        if (var3 == 1301465989) {
                           throw new IllegalStateException();
                        }
                     } else {
                        if (!this.an.containsKey(var9)) {
                           if (var3 == 1301465989) {
                              throw new IllegalStateException();
                           }

                           this.an.put(var9, new ArrayList());
                        }

                        ((ArrayList)this.an.get(var9)).add(var7);
                     }
                  }
               }
            } else if (16 == var2) {
               if (var3 == 1301465989) {
                  throw new IllegalStateException();
               }

               if (vw.ap * -1964001905 < 226) {
                  this.ao = var1.ce(830634577) * 1840453867;
                  this.af = var1.ce(784262245) * -266233273;
               }
            } else if (var2 == 17) {
               if (var3 == 1301465989) {
                  return;
               }

               this.ac = new boolean[256];

               for(var4 = 0; var4 < this.ac.length; ++var4) {
                  if (var3 == 1301465989) {
                     throw new IllegalStateException();
                  }

                  this.ac[var4] = false;
               }

               var4 = var1.cy((short)-28933);

               for(var5 = 0; var5 < var4; ++var5) {
                  if (var3 == 1301465989) {
                     throw new IllegalStateException();
                  }

                  this.ac[var1.cy((short)-27619)] = true;
               }
            }
         }

      } catch (RuntimeException var8) {
         throw tm.aw(var8, "iu.ak(" + ')');
      }
   }

   public boolean bn() {
      return this.au * 1773066635 >= 0;
   }

   public jy bp(jy var1, int var2, iu var3, int var4) {
      if (ap && !this.au((byte)124) && !var3.au((byte)46)) {
         return this.am(var1, var2, var3, var4, 417876673);
      } else {
         jy var5 = var1.ai(false);
         boolean var6 = false;
         ja var7 = null;
         jt var8 = null;
         fr var9;
         if (this.au((byte)35)) {
            var9 = this.ar(1131023831);
            if (var9 == null) {
               return var5;
            }

            if (var3.au((byte)33) && null == this.ac) {
               var5.az(var9, var2);
               return var5;
            }

            var8 = var9.aj;
            var5.av(var8, var9, var2, this.ac, false, !var3.au((byte)48));
         } else {
            var2 = this.ar[var2];
            var7 = ht.ao(var2 >> 16, (byte)2);
            var2 &= 65535;
            if (null == var7) {
               return var3.ai(var1, var4, (byte)32);
            }

            if (!var3.au((byte)96) && (null == this.ad || -1 == var4)) {
               var5.ab(var7, var2);
               return var5;
            }

            if (null == this.ad || -1 == var4) {
               var5.ab(var7, var2);
               return var5;
            }

            var6 = var3.au((byte)107);
            if (!var6) {
               var5.ax(var7, var2, this.ad, false);
            }
         }

         if (var3.au((byte)66)) {
            var9 = var3.ar(1819075243);
            if (null == var9) {
               return var5;
            }

            if (null == var8) {
               var8 = var9.aj;
            }

            var5.av(var8, var9, var4, this.ac, true, true);
         } else {
            var4 = var3.ar[var4];
            ja var10 = ht.ao(var4 >> 16, (byte)2);
            var4 &= 1449743550;
            if (var10 == null) {
               return this.ai(var1, var2, (byte)32);
            }

            var5.ax(var10, var4, this.ad, true);
         }

         if (var6 && null != var7) {
            var5.ax(var7, var2, this.ad, false);
         }

         var5.ar();
         return var5;
      }
   }

   public boolean bt() {
      return this.au * 1773066635 >= 0;
   }

   public int bs() {
      return -768229572 * this.af - this.ao * 1657458627;
   }

   static ja bm(int var0) {
      ja var1 = (ja)am.ap((long)var0);
      if (null != var1) {
         return var1;
      } else {
         var1 = qb.ap(id.ay, id.as, var0, false, -1873063381);
         if (null != var1) {
            am.ak(var1, (long)var0);
         }

         return var1;
      }
   }

   static ja bo(int var0) {
      ja var1 = (ja)am.ap((long)var0);
      if (null != var1) {
         return var1;
      } else {
         var1 = qb.ap(id.ay, id.as, var0, false, -1873063381);
         if (null != var1) {
            am.ak(var1, (long)var0);
         }

         return var1;
      }
   }

   jy bx(jy var1, int var2) {
      if (!this.au((byte)116)) {
         var2 = this.ar[var2];
         ja var7 = ht.ao(var2 >> 16, (byte)2);
         var2 &= 65535;
         if (null == var7) {
            return var1.ay(true);
         } else {
            jy var8 = var1.ay(!var7.aw(var2, 1980539904));
            var8.ab(var7, var2);
            return var8;
         }
      } else {
         int var4 = 1773066635 * this.au;
         fr var3;
         if (fu.af(var4, (byte)4) != 0) {
            var3 = null;
         } else {
            fr var6 = (fr)at.ap((long)var4);
            fr var5;
            if (null != var6) {
               var5 = var6;
            } else {
               var6 = lt.ap(id.ay, id.as, var4, false, (byte)0);
               if (var6 != null) {
                  at.ak(var6, (long)var4);
               }

               var5 = var6;
            }

            var3 = var5;
         }

         if (null == var3) {
            return var1.ay(true);
         } else {
            jy var9 = var1.ay(!var3.ai((byte)-68));
            var9.az(var3, var2);
            return var9;
         }
      }
   }

   public static int ba(int var0) {
      fr var2 = (fr)at.ap((long)var0);
      fr var1;
      if (null != var2) {
         var1 = var2;
      } else {
         var2 = lt.ap(id.ay, id.as, var0, false, (byte)0);
         if (var2 != null) {
            at.ak(var2, (long)var0);
         }

         var1 = var2;
      }

      if (null == var1) {
         return 2;
      } else {
         return var1.ak(-1690951601) ? 0 : 1;
      }
   }

   static int ap(int var0, byte var1) {
      try {
         return bv.du[var0];
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "iu.ap(" + ')');
      }
   }

   fr bw() {
      if (this.au((byte)63)) {
         int var2 = this.au * 1773066635;
         fr var1;
         if (fu.af(var2, (byte)4) != 0) {
            var1 = null;
         } else {
            fr var4 = (fr)at.ap((long)var2);
            fr var3;
            if (null != var4) {
               var3 = var4;
            } else {
               var4 = lt.ap(id.ay, id.as, var2, false, (byte)0);
               if (var4 != null) {
                  at.ak(var4, (long)var2);
               }

               var3 = var4;
            }

            var1 = var3;
         }

         return var1;
      } else {
         return null;
      }
   }

   fr bf() {
      if (this.au((byte)109)) {
         int var2 = this.au * 1773066635;
         fr var1;
         if (fu.af(var2, (byte)4) != 0) {
            var1 = null;
         } else {
            fr var4 = (fr)at.ap((long)var2);
            fr var3;
            if (null != var4) {
               var3 = var4;
            } else {
               var4 = lt.ap(id.ay, id.as, var2, false, (byte)0);
               if (var4 != null) {
                  at.ak(var4, (long)var2);
               }

               var3 = var4;
            }

            var1 = var3;
         }

         return var1;
      } else {
         return null;
      }
   }

   static ih bg(vl var0) {
      if (null != var0) {
         boolean var1 = false;
         int var2 = -1;
         boolean var3 = false;
         boolean var4 = false;
         boolean var5 = false;
         int var6 = var0.ce(1484929055);
         if (vw.ap * -1964001905 >= 226) {
            var2 = var0.cy((short)-3803);
         }

         int var7 = var0.cy((short)-27081);
         int var8 = var0.cy((short)-6165);
         int var9 = var0.cy((short)-22020);
         if (var6 >= 1 && var7 >= 1 && var8 >= 0 && var9 >= 0) {
            return new ih(var6, var2, var7, var8, var9);
         }
      }

      return null;
   }

   public static int bd(int var0) {
      fr var2 = (fr)at.ap((long)var0);
      fr var1;
      if (null != var2) {
         var1 = var2;
      } else {
         var2 = lt.ap(id.ay, id.as, var0, false, (byte)0);
         if (var2 != null) {
            at.ak(var2, (long)var0);
         }

         var1 = var2;
      }

      if (null == var1) {
         return 2;
      } else {
         return var1.ak(-1609436424) ? 0 : 1;
      }
   }

   static ih be(vl var0) {
      if (null != var0) {
         boolean var1 = false;
         int var2 = -1;
         boolean var3 = false;
         boolean var4 = false;
         boolean var5 = false;
         int var6 = var0.ce(349796292);
         if (vw.ap * 1134511270 >= 1525760970) {
            var2 = var0.cy((short)-14549);
         }

         int var7 = var0.cy((short)-13964);
         int var8 = var0.cy((short)-7788);
         int var9 = var0.cy((short)-7491);
         if (var6 >= 1 && var7 >= 1 && var8 >= 0 && var9 >= 0) {
            return new ih(var6, var2, var7, var8, var9);
         }
      }

      return null;
   }

   public boolean bu() {
      return this.au * 1773066635 >= 0;
   }

   public jy ai(jy var1, int var2, byte var3) {
      try {
         boolean var10001;
         if (!this.au((byte)39)) {
            if (var3 != 32) {
               throw new IllegalStateException();
            } else {
               var2 = this.ar[var2];
               ja var9 = ht.ao(var2 >> 16, (byte)2);
               var2 &= 65535;
               if (null == var9) {
                  if (var3 != 32) {
                     throw new IllegalStateException();
                  } else {
                     return var1.ai(true);
                  }
               } else {
                  if (!var9.aw(var2, -366797285)) {
                     if (var3 != 32) {
                        throw new IllegalStateException();
                     }

                     var10001 = true;
                  } else {
                     var10001 = false;
                  }

                  jy var10 = var1.ai(var10001);
                  var10.ab(var9, var2);
                  return var10;
               }
            }
         } else {
            int var5 = this.au * 1773066635;
            fr var4;
            if (fu.af(var5, (byte)4) != 0) {
               var4 = null;
            } else {
               fr var7 = (fr)at.ap((long)var5);
               fr var6;
               if (null != var7) {
                  if (var3 != 32) {
                     throw new IllegalStateException();
                  }

                  var6 = var7;
               } else {
                  var7 = lt.ap(id.ay, id.as, var5, false, (byte)0);
                  if (var7 != null) {
                     if (var3 != 32) {
                        throw new IllegalStateException();
                     }

                     at.ak(var7, (long)var5);
                  }

                  var6 = var7;
               }

               var4 = var6;
            }

            if (var4 == null) {
               if (var3 != 32) {
                  throw new IllegalStateException();
               } else {
                  return var1.ai(true);
               }
            } else {
               if (!var4.ai((byte)-43)) {
                  if (var3 != 32) {
                     throw new IllegalStateException();
                  }

                  var10001 = true;
               } else {
                  var10001 = false;
               }

               jy var11 = var1.ai(var10001);
               var11.az(var4, var2);
               return var11;
            }
         }
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "iu.ai(" + ')');
      }
   }
}
