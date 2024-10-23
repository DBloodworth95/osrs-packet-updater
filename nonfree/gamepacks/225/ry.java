import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class ry {
   final long ax;
   final Map ae;
   final qg ag;
   final qg am;
   final Comparator ac;
   final rd aq;
   static ny ap;
   final int af;
   static of fh;

   boolean ac(byte var1) {
      try {
         boolean var10000;
         if (this.af * 1990340893 != -1) {
            if (var1 >= 8) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ry.ac(" + ')');
      }
   }

   ry(long var1, int var3, rd var4) {
      try {
         super();
         this.ac = new rp(this);
         this.ax = 7611953416602639655L * var1;
         this.af = var3 * 1847597365;
         this.aq = var4;
         if (-1 == this.af * 1990340893) {
            this.ae = new HashMap(64);
            this.ag = new qg(64, this.ac);
            this.am = null;
         } else {
            if (this.aq == null) {
               throw new IllegalArgumentException("");
            }

            this.ae = new HashMap(this.af * 1990340893);
            this.ag = new qg(1990340893 * this.af, this.ac);
            this.am = new qg(this.af * 1990340893);
         }

      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ry.<init>(" + ')');
      }
   }

   public void ab() {
      synchronized(this) {
         this.ae.clear();
         this.ag.clear();
         if (this.ac((byte)-49)) {
            this.am.clear();
         }

      }
   }

   public Object ae(Object var1, int var2) {
      try {
         synchronized(this) {
            if (-1L != this.ax * 4586683207018070679L) {
               if (var2 != 1744951189) {
                  throw new IllegalStateException();
               }

               this.ax(-2111114095);
            }

            rt var4 = (rt)this.ae.get(var1);
            if (var4 == null) {
               if (var2 != 1744951189) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               this.am(var4, false, 1300193670);
               return var4.ac;
            }
         }
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "ry.ae(" + ')');
      }
   }

   public Object ag(Object var1, Object var2, short var3) {
      try {
         synchronized(this) {
            if (this.ax * 4586683207018070679L != -1L) {
               if (var3 >= 180) {
                  throw new IllegalStateException();
               }

               this.ax(-1778982807);
            }

            rt var5 = (rt)this.ae.get(var1);
            if (null != var5) {
               if (var3 >= 180) {
                  throw new IllegalStateException();
               } else {
                  Object var10 = var5.ac;
                  var5.ac = var2;
                  this.am(var5, false, 2066547475);
                  return var10;
               }
            } else {
               rt var6;
               if (this.ac((byte)-18) && this.ae.size() == this.af * 1990340893) {
                  if (var3 >= 180) {
                     throw new IllegalStateException();
                  }

                  var6 = (rt)this.am.remove();
                  this.ae.remove(var6.ae);
                  this.ag.remove(var6);
               }

               var6 = new rt(var2, var1);
               this.ae.put(var1, var6);
               this.am(var6, true, 1588790767);
               return null;
            }
         }
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "ry.ag(" + ')');
      }
   }

   public Object ad(Object var1, Object var2) {
      synchronized(this) {
         if (this.ax * 4586683207018070679L != -1L) {
            this.ax(-1707898611);
         }

         rt var4 = (rt)this.ae.get(var1);
         if (null != var4) {
            Object var8 = var4.ac;
            var4.ac = var2;
            this.am(var4, false, 1158937144);
            return var8;
         } else {
            rt var5;
            if (this.ac((byte)0) && this.ae.size() == this.af * -1065772427) {
               var5 = (rt)this.am.remove();
               this.ae.remove(var5.ae);
               this.ag.remove(var5);
            }

            var5 = new rt(var2, var1);
            this.ae.put(var1, var5);
            this.am(var5, true, 1484450347);
            return null;
         }
      }
   }

   boolean af() {
      return this.af * -1986371527 != -1;
   }

   public void aq(short var1) {
      try {
         synchronized(this) {
            this.ae.clear();
            this.ag.clear();
            if (this.ac((byte)-21)) {
               this.am.clear();
            }

         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ry.aq(" + ')');
      }
   }

   public ry(int var1, rd var2) {
      try {
         this(-1L, var1, var2);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ry.<init>(" + ')');
      }
   }

   boolean at() {
      return this.af * 1990340893 != -1;
   }

   void am(rt var1, boolean var2, int var3) {
      try {
         if (!var2) {
            if (var3 <= 1120734884) {
               throw new IllegalStateException();
            }

            this.ag.remove(var1);
            if (this.ac((byte)-114)) {
               if (var3 <= 1120734884) {
                  throw new IllegalStateException();
               }

               if (!this.am.remove(var1)) {
                  if (var3 <= 1120734884) {
                     throw new IllegalStateException();
                  }

                  throw new IllegalStateException("");
               }
            }
         }

         var1.ag = System.currentTimeMillis() * 7448020991326094353L;
         if (this.ac((byte)-36)) {
            if (var3 <= 1120734884) {
               throw new IllegalStateException();
            }

            switch(-1028909953 * this.aq.ag) {
            case 0:
               var1.am += 2442460859405976389L;
               break;
            case 1:
               var1.am = var1.ag * 6283890071191973877L;
            }

            this.am.add(var1);
         }

         this.ag.add(var1);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ry.am(" + ')');
      }
   }

   public Object ar(Object var1) {
      synchronized(this) {
         if (-1L != this.ax * 4586683207018070679L) {
            this.ax(-1708948304);
         }

         rt var3 = (rt)this.ae.get(var1);
         if (var3 == null) {
            return null;
         } else {
            this.am(var3, false, 1921508468);
            return var3.ac;
         }
      }
   }

   public Object au(Object var1) {
      synchronized(this) {
         if (-1L != this.ax * 4586683207018070679L) {
            this.ax(-1755622704);
         }

         rt var3 = (rt)this.ae.get(var1);
         if (var3 == null) {
            return null;
         } else {
            this.am(var3, false, 1824386723);
            return var3.ac;
         }
      }
   }

   public Object al(Object var1) {
      synchronized(this) {
         if (-1L != this.ax * 4586683207018070679L) {
            this.ax(-1966049534);
         }

         rt var3 = (rt)this.ae.get(var1);
         if (var3 == null) {
            return null;
         } else {
            this.am(var3, false, 1229877903);
            return var3.ac;
         }
      }
   }

   void ah(rt var1, boolean var2) {
      if (!var2) {
         this.ag.remove(var1);
         if (this.ac((byte)-90) && !this.am.remove(var1)) {
            throw new IllegalStateException("");
         }
      }

      var1.ag = System.currentTimeMillis() * 7448020991326094353L;
      if (this.ac((byte)-99)) {
         switch(-1028909953 * this.aq.ag) {
         case 0:
            var1.am += 2442460859405976389L;
            break;
         case 1:
            var1.am = var1.ag * 6283890071191973877L;
         }

         this.am.add(var1);
      }

      this.ag.add(var1);
   }

   void ap() {
      if (-1L == this.ax * 4586683207018070679L) {
         throw new IllegalStateException("");
      } else {
         long var1 = System.currentTimeMillis() - 4586683207018070679L * this.ax;

         while(!this.ag.isEmpty()) {
            rt var3 = (rt)this.ag.peek();
            if (var3.ag * -7450097952003953423L >= var1) {
               return;
            }

            this.ae.remove(var3.ae);
            this.ag.remove(var3);
            if (this.ac((byte)-74)) {
               this.am.remove(var3);
            }
         }

      }
   }

   void ax(int var1) {
      try {
         if (-1L == this.ax * 4586683207018070679L) {
            if (var1 >= -1664658127) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException("");
            }
         } else {
            long var2 = System.currentTimeMillis() - 4586683207018070679L * this.ax;

            while(!this.ag.isEmpty()) {
               if (var1 >= -1664658127) {
                  throw new IllegalStateException();
               }

               rt var4 = (rt)this.ag.peek();
               if (var4.ag * -7450097952003953423L >= var2) {
                  return;
               }

               if (var1 >= -1664658127) {
                  throw new IllegalStateException();
               }

               this.ae.remove(var4.ae);
               this.ag.remove(var4);
               if (this.ac((byte)-57)) {
                  if (var1 >= -1664658127) {
                     throw new IllegalStateException();
                  }

                  this.am.remove(var4);
               }
            }

         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ry.ax(" + ')');
      }
   }

   public void az() {
      synchronized(this) {
         this.ae.clear();
         this.ag.clear();
         if (this.ac((byte)-120)) {
            this.am.clear();
         }

      }
   }

   public void aa() {
      synchronized(this) {
         this.ae.clear();
         this.ag.clear();
         if (this.ac((byte)-90)) {
            this.am.clear();
         }

      }
   }

   public void ai() {
      synchronized(this) {
         this.ae.clear();
         this.ag.clear();
         if (this.ac((byte)-78)) {
            this.am.clear();
         }

      }
   }

   static void hp(int var0, int var1) {
      try {
         if (-941305067 * client.dt == var0) {
            if (var1 > 844691753) {
               ;
            }
         } else {
            if (30 == client.dt * -941305067) {
               if (var1 <= 844691753) {
                  return;
               }

               client.se.ab(-1908121980);
            }

            if (0 == client.dt * -941305067) {
               if (var1 <= 844691753) {
                  throw new IllegalStateException();
               }

               ae.be.bi((byte)6);
            }

            label155: {
               if (var0 != 20) {
                  if (var1 <= 844691753) {
                     return;
                  }

                  if (var0 != 40 && 45 != var0) {
                     if (var1 <= 844691753) {
                        throw new IllegalStateException();
                     }

                     if (var0 != 50) {
                        break label155;
                     }

                     if (var1 <= 844691753) {
                        throw new IllegalStateException();
                     }
                  }
               }

               gu.pg(cw.ac, -2024378921);
               client.fy = 0;
               client.fz = 0;
               client.ip.ag(var0, 349635744);
               if (20 != var0) {
                  if (var1 <= 844691753) {
                     throw new IllegalStateException();
                  }

                  gs.iz(false, (byte)1);
               }
            }

            if (var0 != 20) {
               if (var1 <= 844691753) {
                  throw new IllegalStateException();
               }

               if (var0 != 40) {
                  if (var1 <= 844691753) {
                     throw new IllegalStateException();
                  }

                  if (bf.if != null) {
                     if (var1 <= 844691753) {
                        throw new IllegalStateException();
                     }

                     bf.if.af(2011680949);
                     bf.if = null;
                  }
               }
            }

            if (-941305067 * client.dt == 25) {
               if (var1 <= 844691753) {
                  throw new IllegalStateException();
               }

               client.ic = 0;
               client.iu = 0;
               client.iq = 1076187413;
               client.im = 0;
               client.in = 2134157011;
            }

            label164: {
               if (5 != var0) {
                  if (10 != var0) {
                     if (20 == var0) {
                        if (var1 <= 844691753) {
                           return;
                        }

                        int var5 = -941305067 * client.dt == 11 ? 4 : 0;
                        de.ae(ip.fp, cq.fb, fl.fc, false, var5, (byte)-67);
                     } else if (var0 == 11) {
                        if (var1 <= 844691753) {
                           throw new IllegalStateException();
                        }

                        de.ae(ip.fp, cq.fb, fl.fc, false, 4, (byte)-73);
                     } else if (50 == var0) {
                        dp.aa("", "Updating date of birth...", "", (byte)-23);
                        de.ae(ip.fp, cq.fb, fl.fc, false, 7, (byte)-121);
                     } else if (0 != var0) {
                        if (var1 <= 844691753) {
                           return;
                        }

                        gn.am(1948231486);
                     }
                     break label164;
                  }

                  if (var1 <= 844691753) {
                     throw new IllegalStateException();
                  }
               }

               boolean var10000;
               if (re.vt.bn(863651433) >= -1888871377 * client.ct) {
                  if (var1 <= 844691753) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var2 = var10000;
               byte var6;
               if (var2) {
                  if (var1 <= 844691753) {
                     throw new IllegalStateException();
                  }

                  var6 = 0;
               } else {
                  var6 = 12;
               }

               byte var3 = var6;
               de.ae(ip.fp, cq.fb, fl.fc, true, var3, (byte)-20);
            }

            client.dt = var0 * 1934615613;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ry.hp(" + ')');
      }
   }
}
