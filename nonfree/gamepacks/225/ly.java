import java.util.ArrayList;
import java.util.Iterator;

public abstract class ly {
   public final nm at;
   int au;
   public final nm af;
   int ar;
   public static final int ay = 3;

   abstract int az();

   boolean aj(byte var1) {
      try {
         boolean var10000;
         if (this.ae(-1570517373) >= 0) {
            if (var1 == 2) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ly.aj(" + ')');
      }
   }

   abstract int ao();

   abstract ls ag(byte var1);

   abstract int am(int var1);

   abstract int ax(int var1);

   public abstract int ar();

   boolean av(int var1, int var2, int var3) {
      try {
         if (!this.aj((byte)-21)) {
            if (var3 >= -2030938549) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            hf var4 = fq.ac(this.ae(-1570517373), 465273129);
            int var5 = this.am(-288166594);
            int var6 = this.ax(1390628388);
            switch(var4.ay.am * -1047412351) {
            case 0:
               if (var1 < 546900797 * this.au) {
                  return false;
               }

               if (var3 >= -2030938549) {
                  throw new IllegalStateException();
               }

               if (var1 >= var5 + 546900797 * this.au) {
                  if (var3 >= -2030938549) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
               break;
            case 1:
               if (var1 <= 546900797 * this.au - var5) {
                  return false;
               }

               if (var3 >= -2030938549) {
                  throw new IllegalStateException();
               }

               if (var1 > this.au * 546900797) {
                  if (var3 >= -2030938549) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
               break;
            case 2:
               if (var1 < 546900797 * this.au - var5 / 2) {
                  return false;
               }

               if (var3 >= -2030938549) {
                  throw new IllegalStateException();
               }

               if (var1 > var5 / 2 + this.au * 546900797) {
                  if (var3 >= -2030938549) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            }

            switch(-569774967 * var4.aj.am) {
            case 0:
               if (var2 < this.ar * -2045810419 - var6 / 2) {
                  return false;
               }

               if (var3 >= -2030938549) {
                  throw new IllegalStateException();
               }

               if (var2 > var6 / 2 + this.ar * -2045810419) {
                  if (var3 >= -2030938549) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
               break;
            case 1:
               if (var2 <= this.ar * -2045810419 - var6) {
                  return false;
               }

               if (var3 >= -2030938549) {
                  throw new IllegalStateException();
               }

               if (var2 > this.ar * -2045810419) {
                  if (var3 >= -2030938549) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
               break;
            case 2:
               if (var2 < this.ar * -2045810419) {
                  return false;
               }

               if (var3 >= -2030938549) {
                  throw new IllegalStateException();
               }

               if (var2 >= var6 + this.ar * -2045810419) {
                  if (var3 >= -2030938549) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            }

            return true;
         }
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "ly.av(" + ')');
      }
   }

   boolean aw(int var1, int var2, byte var3) {
      try {
         ls var4 = this.ag((byte)43);
         if (null == var4) {
            if (var3 == 0) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            if (var1 >= 546900797 * this.au - var4.ae * -226092551 / 2) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               if (var1 <= var4.ae * -226092551 / 2 + 546900797 * this.au) {
                  if (var2 >= this.ar * -2045810419) {
                     if (var3 == 0) {
                        throw new IllegalStateException();
                     }

                     if (var2 <= -736001327 * var4.ag + -2045810419 * this.ar) {
                        return true;
                     }
                  }

                  return false;
               }

               if (var3 == 0) {
                  throw new IllegalStateException();
               }
            }

            return false;
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ly.aw(" + ')');
      }
   }

   public abstract int au();

   static boolean jd(int var0) {
      try {
         boolean var10000;
         if ((1716697315 * client.np & 8) != 0) {
            if (var0 == -1626550895) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ly.jd(" + ')');
      }
   }

   public abstract int al();

   public abstract int ad();

   abstract ls ah();

   abstract ls ap();

   abstract int ab();

   boolean bm(int var1, int var2) {
      ls var3 = this.ag((byte)41);
      if (null == var3) {
         return false;
      } else if (var1 >= 546900797 * this.au - var3.ae * -226092551 / 2 && var1 <= var3.ae * -226092551 / 2 + 546900797 * this.au) {
         return var2 >= this.ar * -2045810419 && var2 <= -736001327 * var3.ag + -2045810419 * this.ar;
      } else {
         return false;
      }
   }

   abstract int aa();

   ly(nm var1, nm var2) {
      try {
         super();
         this.at = var1;
         this.af = var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ly.<init>(" + ')');
      }
   }

   public abstract int ae(int var1);

   abstract int ai();

   boolean an(int var1, int var2) {
      if (this.av(var1, var2, -2114557917)) {
         return true;
      } else {
         return this.aw(var1, var2, (byte)-18);
      }
   }

   boolean ak(int var1, int var2) {
      if (this.av(var1, var2, -2062974475)) {
         return true;
      } else {
         return this.aw(var1, var2, (byte)44);
      }
   }

   abstract int as();

   boolean bh() {
      return this.ae(-1570517373) >= 0;
   }

   boolean bd() {
      return this.ae(-1570517373) >= 0;
   }

   boolean bx() {
      return this.ae(-1570517373) >= 0;
   }

   boolean bf() {
      return this.ae(-1570517373) >= 0;
   }

   boolean bn(int var1, int var2) {
      if (this.av(var1, var2, -2142269273)) {
         return true;
      } else {
         return this.aw(var1, var2, (byte)60);
      }
   }

   public static void ac(po var0, int var1) {
      try {
         hx.ac = var0;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ly.ac(" + ')');
      }
   }

   boolean ay(int var1, int var2, int var3) {
      try {
         if (this.av(var1, var2, -2039535952)) {
            if (var3 >= -194028009) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else if (this.aw(var1, var2, (byte)-10)) {
            if (var3 >= -194028009) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ly.ay(" + ')');
      }
   }

   public static void ax(int var0, int var1, byte var2) {
      try {
         qg.ah(var0, var1, 0, 0, -1059025896);
         mm.af.clear();
         mm.at.clear();
         if (!mm.aq.isEmpty()) {
            label64: {
               if (var2 != 64) {
                  throw new IllegalStateException();
               }

               if (var0 == 0) {
                  if (var2 != 64) {
                     throw new IllegalStateException();
                  }

                  if (0 == var1) {
                     break label64;
                  }

                  if (var2 != 64) {
                     throw new IllegalStateException();
                  }
               }

               mm.at.add(new rh((ri)null, mm.ar * -1049602065));
               mm.at.add(new rc((ri)null, 0, false, mm.al * -161512225));
               ArrayList var4 = new ArrayList();
               Iterator var5 = mm.aq.iterator();

               while(var5.hasNext()) {
                  if (var2 != 64) {
                     throw new IllegalStateException();
                  }

                  ns var6 = (ns)var5.next();
                  var4.add(var6);
               }

               mm.at.add(new rl((ri)null, var4));
               return;
            }
         }

         cy.ab(1870578311);
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "ly.ax(" + ')');
      }
   }
}
