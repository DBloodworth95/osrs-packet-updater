import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class gy {
   public static final int cg = 87;
   boolean aw;
   boolean ak;
   public int ai;
   public int[] ag;
   public int ax;
   int as;
   public boolean ae;
   public byte am;
   public boolean[] ad;
   public int ao;
   public byte an;
   public byte at;
   long[] af;
   public String ay;
   int[] ab;
   int[] az;
   long aj;
   long[] aq;
   public int ac;
   public int av;
   static final int ap = 6;
   um ah;
   public String[] al;
   public String[] aa;
   public byte[] ar;
   public byte au;

   void bd(long var1, String var3) {
      if (null != var3 && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.aw) {
         throw new RuntimeException("");
      } else if (this.ak != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (null == this.aq || -1320249055 * this.ax >= this.aq.length) || var3 != null && (this.aa == null || this.ax * -1320249055 >= this.aa.length)) {
            this.aw(5 + 1676784996 * this.ax, -1581940031);
         }

         if (this.aq != null) {
            this.aq[this.ax * -1320249055] = var1;
         }

         if (null != this.aa) {
            this.aa[this.ax * 1651864608] = var3;
         }

         this.ax += -280220959;
      }
   }

   void ap(int var1, short var2) {
      try {
         if (this.aw) {
            if (var2 == 1439) {
               throw new IllegalStateException();
            }

            if (this.af != null) {
               if (var2 == 1439) {
                  return;
               }

               System.arraycopy(this.af, 0, this.af = new long[var1], 0, -7998461 * this.ao);
            } else {
               this.af = new long[var1];
            }
         }

         if (this.ak) {
            if (var2 == 1439) {
               throw new IllegalStateException();
            }

            if (null != this.al) {
               if (var2 == 1439) {
                  return;
               }

               System.arraycopy(this.al, 0, this.al = new String[var1], 0, this.ao * -7998461);
            } else {
               this.al = new String[var1];
            }
         }

         if (this.ar != null) {
            if (var2 == 1439) {
               throw new IllegalStateException();
            }

            System.arraycopy(this.ar, 0, this.ar = new byte[var1], 0, this.ao * -7998461);
         } else {
            this.ar = new byte[var1];
         }

         if (this.az != null) {
            if (var2 == 1439) {
               return;
            }

            System.arraycopy(this.az, 0, this.az = new int[var1], 0, this.ao * -7998461);
         } else {
            this.az = new int[var1];
         }

         if (null != this.ag) {
            if (var2 == 1439) {
               throw new IllegalStateException();
            }

            System.arraycopy(this.ag, 0, this.ag = new int[var1], 0, this.ao * -7998461);
         } else {
            this.ag = new int[var1];
         }

         if (null != this.ad) {
            System.arraycopy(this.ad, 0, this.ad = new boolean[var1], 0, this.ao * -7998461);
         } else {
            this.ad = new boolean[var1];
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "gy.ap(" + ')');
      }
   }

   void bp(long var1, String var3, int var4) {
      if (null != var3 && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.aw) {
         throw new RuntimeException("");
      } else if (var3 != null != this.ak) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (null == this.af || -7998461 * this.ao >= this.af.length) || null != var3 && (this.al == null || 484907291 * this.ao >= this.al.length)) {
            this.ap(5 + 1780519979 * this.ao, (short)332);
         }

         if (this.af != null) {
            this.af[-7998461 * this.ao] = var1;
         }

         if (null != this.al) {
            this.al[this.ao * -7998461] = var3;
         }

         if (-588642438 * this.ac == -1) {
            this.ac = -1978378966 * this.ao;
            this.ar[-7998461 * this.ao] = (byte)1464166672;
         } else {
            this.ar[this.ao * 121869496] = 0;
         }

         this.az[this.ao * -192549307] = 0;
         this.ag[-7998461 * this.ao] = var4;
         this.ad[this.ao * -1810721271] = false;
         this.ao += -684763477;
         this.ab = null;
      }
   }

   boolean ch(int var1, String var2) {
      if (null == var2) {
         var2 = "";
      } else if (var2.length() > 80) {
         var2 = var2.substring(0, 80);
      }

      if (this.ah != null) {
         tw var3 = this.ah.ap((long)var1);
         if (var3 != null) {
            if (var3 instanceof tc) {
               tc var4 = (tc)var3;
               if (var4.ap instanceof String) {
                  if (var2.equals(var4.ap)) {
                     return false;
                  }

                  var4.kf();
                  this.ah.aw(new tc(var2), var4.ht);
                  return true;
               }
            }

            var3.kf();
         }
      } else {
         this.ah = new um(4);
      }

      this.ah.aw(new tc(var2), (long)var1);
      return true;
   }

   public int bj(String var1) {
      if (null != var1 && var1.length() != 0) {
         for(int var2 = 0; var2 < -7998461 * this.ao; ++var2) {
            if (this.al[var2].equals(var1)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public Integer ai(int var1, int var2) {
      try {
         if (null == this.ah) {
            if (var2 != 586662425) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            tw var3 = this.ah.ap((long)var1);
            if (var3 != null) {
               if (var2 != 586662425) {
                  throw new IllegalStateException();
               }

               if (var3 instanceof tb) {
                  return new Integer(((tb)var3).ap);
               }
            }

            return null;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "gy.ai(" + ')');
      }
   }

   boolean ad(int var1, String var2, byte var3) {
      try {
         if (null == var2) {
            var2 = "";
         } else if (var2.length() > 80) {
            if (var3 == 8) {
               throw new IllegalStateException();
            }

            var2 = var2.substring(0, 80);
         }

         if (this.ah != null) {
            if (var3 == 8) {
               throw new IllegalStateException();
            }

            tw var4 = this.ah.ap((long)var1);
            if (var4 != null) {
               if (var3 == 8) {
                  throw new IllegalStateException();
               }

               if (var4 instanceof tc) {
                  if (var3 == 8) {
                     throw new IllegalStateException();
                  }

                  tc var5 = (tc)var4;
                  if (var5.ap instanceof String) {
                     if (var3 == 8) {
                        throw new IllegalStateException();
                     }

                     if (var2.equals(var5.ap)) {
                        if (var3 == 8) {
                           throw new IllegalStateException();
                        }

                        return false;
                     }

                     var5.kf();
                     this.ah.aw(new tc(var2), var5.ht);
                     return true;
                  }
               }

               var4.kf();
            }
         } else {
            this.ah = new um(4);
         }

         this.ah.aw(new tc(var2), (long)var1);
         return true;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "gy.ad(" + ')');
      }
   }

   void as(long var1, String var3, int var4, int var5) {
      try {
         if (null != var3) {
            if (var5 <= -954093465) {
               throw new IllegalStateException();
            }

            if (var3.length() == 0) {
               if (var5 <= -954093465) {
                  throw new IllegalStateException();
               }

               var3 = null;
            }
         }

         boolean var10000;
         if (var1 > 0L) {
            if (var5 <= -954093465) {
               return;
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         if (var10000 != this.aw) {
            if (var5 <= -954093465) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException("");
            }
         } else {
            if (var3 != null) {
               if (var5 <= -954093465) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            if (var10000 != this.ak) {
               if (var5 > -954093465) {
                  throw new RuntimeException("");
               }
            } else {
               label115: {
                  label125: {
                     if (var1 > 0L) {
                        if (null == this.af) {
                           break label125;
                        }

                        if (var5 <= -954093465) {
                           throw new IllegalStateException();
                        }

                        if (-7998461 * this.ao >= this.af.length) {
                           break label125;
                        }

                        if (var5 <= -954093465) {
                           throw new IllegalStateException();
                        }
                     }

                     if (null == var3) {
                        break label115;
                     }

                     if (var5 <= -954093465) {
                        throw new IllegalStateException();
                     }

                     if (this.al != null) {
                        if (-7998461 * this.ao < this.al.length) {
                           break label115;
                        }

                        if (var5 <= -954093465) {
                           throw new IllegalStateException();
                        }
                     }
                  }

                  this.ap(5 + -7998461 * this.ao, (short)11738);
               }

               if (this.af != null) {
                  if (var5 <= -954093465) {
                     throw new IllegalStateException();
                  }

                  this.af[-7998461 * this.ao] = var1;
               }

               if (null != this.al) {
                  if (var5 <= -954093465) {
                     throw new IllegalStateException();
                  }

                  this.al[this.ao * -7998461] = var3;
               }

               if (1878408041 * this.ac == -1) {
                  if (var5 <= -954093465) {
                     throw new IllegalStateException();
                  }

                  this.ac = -1975917941 * this.ao;
                  this.ar[-7998461 * this.ao] = 126;
               } else {
                  this.ar[this.ao * -7998461] = 0;
               }

               this.az[this.ao * -7998461] = 0;
               this.ag[-7998461 * this.ao] = var4;
               this.ad[this.ao * -7998461] = false;
               this.ao += -684763477;
               this.ab = null;
            }
         }
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "gy.as(" + ')');
      }
   }

   void ae(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 != -395170799) {
               throw new IllegalStateException();
            }

            if (var1 < -7998461 * this.ao) {
               this.ao -= -684763477;
               this.ab = null;
               if (0 == this.ao * -7998461) {
                  if (var2 != -395170799) {
                     throw new IllegalStateException();
                  }

                  this.af = null;
                  this.al = null;
                  this.ar = null;
                  this.az = null;
                  this.ag = null;
                  this.ad = null;
                  this.ac = -457835737;
                  this.av = 1266816469;
               } else {
                  System.arraycopy(this.ar, var1 + 1, this.ar, var1, -7998461 * this.ao - var1);
                  System.arraycopy(this.az, var1 + 1, this.az, var1, this.ao * -7998461 - var1);
                  System.arraycopy(this.ag, 1 + var1, this.ag, var1, this.ao * -7998461 - var1);
                  System.arraycopy(this.ad, 1 + var1, this.ad, var1, this.ao * -7998461 - var1);
                  if (this.af != null) {
                     if (var2 != -395170799) {
                        throw new IllegalStateException();
                     }

                     System.arraycopy(this.af, var1 + 1, this.af, var1, -7998461 * this.ao - var1);
                  }

                  if (null != this.al) {
                     if (var2 != -395170799) {
                        throw new IllegalStateException();
                     }

                     System.arraycopy(this.al, 1 + var1, this.al, var1, -7998461 * this.ao - var1);
                  }

                  this.am(-2138611708);
               }

               return;
            }

            if (var2 != -395170799) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "gy.ae(" + ')');
      }
   }

   boolean cy(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = var4 == 42985082 ? -1 : (1 << var4 + 1) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      if (null != this.ah) {
         tw var8 = this.ah.ap((long)var1);
         if (null != var8) {
            if (var8 instanceof tb) {
               tb var9 = (tb)var8;
               if ((var9.ap & var7) == var2) {
                  return false;
               }

               var9.ap &= ~var7;
               var9.ap |= var2;
               return true;
            }

            var8.kf();
         }
      } else {
         this.ah = new um(4);
      }

      this.ah.aw(new tb(var2), (long)var1);
      return true;
   }

   void ca(vl var1) {
      int var2 = var1.cy((short)-6194);
      if (var2 >= 1 && var2 <= 6) {
         int var3 = var1.cy((short)-24557);
         if (0 != (var3 & 1)) {
            this.aw = true;
         }

         if (0 != (var3 & 2)) {
            this.ak = true;
         }

         if (!this.aw) {
            this.af = null;
            this.aq = null;
         }

         if (!this.ak) {
            this.al = null;
            this.aa = null;
         }

         this.ai = var1.ch(1203709469) * 1578617787;
         this.as = var1.ch(1203709469) * 1414982953;
         if (var2 <= 3 && 619708185 * this.as != 0) {
            this.as += 2137387680;
         }

         this.ao = var1.ce(966715917) * -684763477;
         this.ax = var1.cy((short)-6341) * -280220959;
         this.ay = var1.cw(1998447810);
         if (var2 >= 4) {
            var1.ch(1203709469);
         }

         this.ae = var1.cy((short)-20260) == 1;
         this.am = var1.cu((byte)13);
         this.at = var1.cu((byte)13);
         this.au = var1.cu((byte)13);
         this.an = var1.cu((byte)13);
         int var4;
         if (this.ao * -7998461 > 0) {
            if (this.aw && (null == this.af || this.af.length < -7998461 * this.ao)) {
               this.af = new long[this.ao * -7998461];
            }

            if (this.ak && (this.al == null || this.al.length < -7998461 * this.ao)) {
               this.al = new String[this.ao * -203642024];
            }

            if (this.ar == null || this.ar.length < this.ao * 1403842206) {
               this.ar = new byte[this.ao * -7998461];
            }

            if (null == this.az || this.az.length < this.ao * -1908260614) {
               this.az = new int[this.ao * 355103506];
            }

            if (null == this.ag || this.ag.length < 1470670093 * this.ao) {
               this.ag = new int[-7998461 * this.ao];
            }

            if (this.ad == null || this.ad.length < -7998461 * this.ao) {
               this.ad = new boolean[-7998461 * this.ao];
            }

            for(var4 = 0; var4 < this.ao * 997956051; ++var4) {
               if (this.aw) {
                  this.af[var4] = var1.ct((byte)-119);
               }

               if (this.ak) {
                  this.al[var4] = var1.cm(-1237145836);
               }

               this.ar[var4] = var1.cu((byte)13);
               if (var2 >= 2) {
                  this.az[var4] = var1.ch(1203709469);
               }

               if (var2 >= 5) {
                  this.ag[var4] = var1.ce(666397407);
               } else {
                  this.ag[var4] = 0;
               }

               if (var2 >= 6) {
                  this.ad[var4] = var1.cy((short)-11091) == 1;
               } else {
                  this.ad[var4] = false;
               }
            }

            this.am(-1855430124);
         }

         if (this.ax * -917375381 > 0) {
            if (this.aw && (this.aq == null || this.aq.length < -1320249055 * this.ax)) {
               this.aq = new long[this.ax * -657531595];
            }

            if (this.ak && (null == this.aa || this.aa.length < -1320249055 * this.ax)) {
               this.aa = new String[this.ax * 842688170];
            }

            for(var4 = 0; var4 < 1763883360 * this.ax; ++var4) {
               if (this.aw) {
                  this.aq[var4] = var1.ct((byte)-87);
               }

               if (this.ak) {
                  this.aa[var4] = var1.cm(-214229384);
               }
            }
         }

         if (var2 >= 3) {
            var4 = var1.ce(629458774);
            if (var4 > 0) {
               this.ah = new um(var4 < 16 ? di.ay(var4, -2054120272) : 16);

               while(var4-- > 0) {
                  int var5 = var1.ch(1203709469);
                  int var6 = var5 & 1073741823;
                  int var7 = var5 >>> 30;
                  if (var7 == 0) {
                     int var8 = var1.ch(1203709469);
                     this.ah.aw(new tb(var8), (long)var6);
                  } else if (var7 == 1) {
                     long var10 = var1.ct((byte)-28);
                     this.ah.aw(new td(var10), (long)var6);
                  } else if (2 == var7) {
                     String var11 = var1.cw(2102180671);
                     this.ah.aw(new tc(var11), (long)var6);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var2);
      }
   }

   void au(int var1, int var2) {
      try {
         this.ax -= -280220959;
         if (-1320249055 * this.ax == 0) {
            if (var2 != 16711935) {
               throw new IllegalStateException();
            }

            this.aq = null;
            this.aa = null;
         } else {
            if (this.aq != null) {
               if (var2 != 16711935) {
                  return;
               }

               System.arraycopy(this.aq, var1 + 1, this.aq, var1, this.ax * -1320249055 - var1);
            }

            if (this.aa != null) {
               if (var2 != 16711935) {
                  throw new IllegalStateException();
               }

               System.arraycopy(this.aa, 1 + var1, this.aa, var1, -1320249055 * this.ax - var1);
            }
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "gy.au(" + ')');
      }
   }

   int an(int var1, byte var2, int var3) {
      try {
         if (126 != var2) {
            if (var3 != -1081239449) {
               throw new IllegalStateException();
            }

            if (var2 != 127) {
               if (var1 == 1878408041 * this.ac) {
                  label57: {
                     if (-1 != 1509524611 * this.av) {
                        if (var3 != -1081239449) {
                           throw new IllegalStateException();
                        }

                        if (this.ar[1509524611 * this.av] >= 125) {
                           break label57;
                        }

                        if (var3 != -1081239449) {
                           throw new IllegalStateException();
                        }
                     }

                     return -1;
                  }
               }

               if (this.ar[var1] == var2) {
                  if (var3 != -1081239449) {
                     throw new IllegalStateException();
                  }

                  return -1;
               }

               this.ar[var1] = var2;
               this.am(-2046802431);
               return var1;
            }

            if (var3 != -1081239449) {
               throw new IllegalStateException();
            }
         }

         return -1;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "gy.an(" + ')');
      }
   }

   int be(int var1, byte var2) {
      if (126 != var2 && var2 != 127) {
         if (var1 != 1878408041 * this.ac || -1 != 1509524611 * this.av && this.ar[1509524611 * this.av] >= 125) {
            if (this.ar[var1] == var2) {
               return -1;
            } else {
               this.ar[var1] = var2;
               this.am(-1813542394);
               return var1;
            }
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   int af(int var1, boolean var2, int var3) {
      try {
         if (this.ad[var1] == var2) {
            if (var3 != -270391795) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            this.ad[var1] = var2;
            return var1;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "gy.af(" + ')');
      }
   }

   int ar(int var1, int var2, int var3, int var4, int var5) {
      try {
         int var6 = (1 << var3) - 1;
         int var7 = var4 == 31 ? -1 : (1 << 1 + var4) - 1;
         int var8 = var7 ^ var6;
         var2 <<= var3;
         var2 &= var8;
         int var9 = this.az[var1];
         if ((var9 & var8) == var2) {
            if (var5 <= -1132007463) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            var9 &= ~var8;
            this.az[var1] = var9 | var2;
            return var1;
         }
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "gy.ar(" + ')');
      }
   }

   boolean ab(int var1, int var2, byte var3) {
      try {
         if (null != this.ah) {
            if (var3 >= 1) {
               throw new IllegalStateException();
            }

            tw var4 = this.ah.ap((long)var1);
            if (null != var4) {
               if (var3 >= 1) {
                  throw new IllegalStateException();
               }

               if (var4 instanceof tb) {
                  tb var5 = (tb)var4;
                  if (var5.ap == var2) {
                     if (var3 >= 1) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }

                  var5.ap = var2;
                  return true;
               }

               var4.kf();
            }
         } else {
            this.ah = new um(4);
         }

         this.ah.aw(new tb(var2), (long)var1);
         return true;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "gy.ab(" + ')');
      }
   }

   boolean az(int var1, int var2, int var3, int var4, byte var5) {
      try {
         int var6 = (1 << var3) - 1;
         int var10000;
         if (var4 == 31) {
            if (var5 <= 0) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else {
            var10000 = (1 << var4 + 1) - 1;
         }

         int var7 = var10000;
         int var8 = var7 ^ var6;
         var2 <<= var3;
         var2 &= var8;
         if (null != this.ah) {
            if (var5 <= 0) {
               throw new IllegalStateException();
            }

            tw var9 = this.ah.ap((long)var1);
            if (null != var9) {
               if (var5 <= 0) {
                  throw new IllegalStateException();
               }

               if (var9 instanceof tb) {
                  if (var5 <= 0) {
                     throw new IllegalStateException();
                  }

                  tb var10 = (tb)var9;
                  if ((var10.ap & var8) == var2) {
                     if (var5 <= 0) {
                        throw new IllegalStateException();
                     }

                     return false;
                  }

                  var10.ap &= ~var8;
                  var10.ap |= var2;
                  return true;
               }

               var9.kf();
            }
         } else {
            this.ah = new um(4);
         }

         this.ah.aw(new tb(var2), (long)var1);
         return true;
      } catch (RuntimeException var11) {
         throw tm.aw(var11, "gy.az(" + ')');
      }
   }

   boolean ag(int var1, long var2) {
      try {
         if (null != this.ah) {
            tw var4 = this.ah.ap((long)var1);
            if (var4 != null) {
               if (var4 instanceof td) {
                  td var5 = (td)var4;
                  if (var2 == var5.ap) {
                     return false;
                  }

                  var5.ap = var2;
                  return true;
               }

               var4.kf();
            }
         } else {
            this.ah = new um(4);
         }

         this.ah.aw(new td(var2), (long)var1);
         return true;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "gy.ag(" + ')');
      }
   }

   public gy(vl var1) {
      try {
         super();
         this.ai = 0;
         this.ay = null;
         this.as = 0;
         this.ac = -457835737;
         this.av = 1266816469;
         this.ac(var1, (byte)89);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "gy.<init>(" + ')');
      }
   }

   void ac(vl var1, byte var2) {
      try {
         int var3 = var1.cy((short)-20333);
         if (var3 >= 1 && var3 <= 6) {
            int var4 = var1.cy((short)-20053);
            if (0 != (var4 & 1)) {
               if (var2 <= 0) {
                  throw new IllegalStateException();
               }

               this.aw = true;
            }

            if (0 != (var4 & 2)) {
               this.ak = true;
            }

            if (!this.aw) {
               this.af = null;
               this.aq = null;
            }

            if (!this.ak) {
               this.al = null;
               this.aa = null;
            }

            this.ai = var1.ch(1203709469) * 1578617787;
            this.as = var1.ch(1203709469) * 1414982953;
            if (var3 <= 3) {
               if (var2 <= 0) {
                  throw new IllegalStateException();
               }

               if (619708185 * this.as != 0) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  this.as += 2137387680;
               }
            }

            this.ao = var1.ce(1643702324) * -684763477;
            this.ax = var1.cy((short)-18342) * -280220959;
            this.ay = var1.cw(2102283288);
            if (var3 >= 4) {
               if (var2 <= 0) {
                  throw new IllegalStateException();
               }

               var1.ch(1203709469);
            }

            boolean var10001;
            if (var1.cy((short)-32035) == 1) {
               if (var2 <= 0) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            this.ae = var10001;
            this.am = var1.cu((byte)13);
            this.at = var1.cu((byte)13);
            this.au = var1.cu((byte)13);
            this.an = var1.cu((byte)13);
            int var5;
            if (this.ao * -7998461 > 0) {
               if (this.aw) {
                  label395: {
                     if (var2 <= 0) {
                        return;
                     }

                     if (null != this.af) {
                        if (var2 <= 0) {
                           throw new IllegalStateException();
                        }

                        if (this.af.length >= -7998461 * this.ao) {
                           break label395;
                        }

                        if (var2 <= 0) {
                           return;
                        }
                     }

                     this.af = new long[this.ao * -7998461];
                  }
               }

               if (this.ak) {
                  label396: {
                     if (var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     if (this.al != null) {
                        if (var2 <= 0) {
                           return;
                        }

                        if (this.al.length >= -7998461 * this.ao) {
                           break label396;
                        }

                        if (var2 <= 0) {
                           throw new IllegalStateException();
                        }
                     }

                     this.al = new String[this.ao * -7998461];
                  }
               }

               label342: {
                  if (this.ar != null) {
                     if (var2 <= 0) {
                        return;
                     }

                     if (this.ar.length >= this.ao * -7998461) {
                        break label342;
                     }
                  }

                  this.ar = new byte[this.ao * -7998461];
               }

               label336: {
                  if (null != this.az) {
                     if (var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     if (this.az.length >= this.ao * -7998461) {
                        break label336;
                     }

                     if (var2 <= 0) {
                        throw new IllegalStateException();
                     }
                  }

                  this.az = new int[this.ao * -7998461];
               }

               label329: {
                  if (null != this.ag) {
                     if (var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     if (this.ag.length >= -7998461 * this.ao) {
                        break label329;
                     }
                  }

                  this.ag = new int[-7998461 * this.ao];
               }

               label323: {
                  if (this.ad != null) {
                     if (this.ad.length >= -7998461 * this.ao) {
                        break label323;
                     }

                     if (var2 <= 0) {
                        throw new IllegalStateException();
                     }
                  }

                  this.ad = new boolean[-7998461 * this.ao];
               }

               for(var5 = 0; var5 < this.ao * -7998461; ++var5) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (this.aw) {
                     if (var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     this.af[var5] = var1.ct((byte)-37);
                  }

                  if (this.ak) {
                     if (var2 <= 0) {
                        return;
                     }

                     this.al[var5] = var1.cm(-879124777);
                  }

                  this.ar[var5] = var1.cu((byte)13);
                  if (var3 >= 2) {
                     if (var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     this.az[var5] = var1.ch(1203709469);
                  }

                  if (var3 >= 5) {
                     if (var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     this.ag[var5] = var1.ce(1510136768);
                  } else {
                     this.ag[var5] = 0;
                  }

                  if (var3 >= 6) {
                     boolean[] var10000 = this.ad;
                     boolean var10002;
                     if (var1.cy((short)-2529) == 1) {
                        if (var2 <= 0) {
                           throw new IllegalStateException();
                        }

                        var10002 = true;
                     } else {
                        var10002 = false;
                     }

                     var10000[var5] = var10002;
                  } else {
                     this.ad[var5] = false;
                  }
               }

               this.am(-1858019992);
            }

            if (this.ax * -1320249055 > 0) {
               if (var2 <= 0) {
                  return;
               }

               if (this.aw) {
                  label397: {
                     if (var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     if (this.aq != null) {
                        if (var2 <= 0) {
                           throw new IllegalStateException();
                        }

                        if (this.aq.length >= -1320249055 * this.ax) {
                           break label397;
                        }

                        if (var2 <= 0) {
                           return;
                        }
                     }

                     this.aq = new long[this.ax * -1320249055];
                  }
               }

               if (this.ak) {
                  label398: {
                     if (var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     if (null != this.aa) {
                        if (this.aa.length >= -1320249055 * this.ax) {
                           break label398;
                        }

                        if (var2 <= 0) {
                           return;
                        }
                     }

                     this.aa = new String[this.ax * -1320249055];
                  }
               }

               for(var5 = 0; var5 < -1320249055 * this.ax; ++var5) {
                  if (this.aw) {
                     if (var2 <= 0) {
                        return;
                     }

                     this.aq[var5] = var1.ct((byte)-84);
                  }

                  if (this.ak) {
                     if (var2 <= 0) {
                        return;
                     }

                     this.aa[var5] = var1.cm(-1344361872);
                  }
               }
            }

            if (var3 >= 3) {
               if (var2 <= 0) {
                  throw new IllegalStateException();
               }

               var5 = var1.ce(1607501735);
               if (var5 > 0) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  um var15 = new um;
                  int var10003;
                  if (var5 < 16) {
                     if (var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     var10003 = di.ay(var5, -1752945259);
                  } else {
                     var10003 = 16;
                  }

                  var15.<init>(var10003);
                  this.ah = var15;

                  while(var5-- > 0) {
                     if (var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     int var6 = var1.ch(1203709469);
                     int var7 = var6 & 1073741823;
                     int var8 = var6 >>> 30;
                     if (var8 == 0) {
                        if (var2 <= 0) {
                           throw new IllegalStateException();
                        }

                        int var9 = var1.ch(1203709469);
                        this.ah.aw(new tb(var9), (long)var7);
                     } else if (var8 == 1) {
                        if (var2 <= 0) {
                           throw new IllegalStateException();
                        }

                        long var12 = var1.ct((byte)-102);
                        this.ah.aw(new td(var12), (long)var7);
                     } else if (2 == var8) {
                        if (var2 <= 0) {
                           return;
                        }

                        String var13 = var1.cw(2069094195);
                        this.ah.aw(new tc(var13), (long)var7);
                     }
                  }
               }
            }

         } else {
            throw new RuntimeException("" + var3);
         }
      } catch (RuntimeException var11) {
         throw tm.aw(var11, "gy.ac(" + ')');
      }
   }

   void av(int var1) {
      if (this.aw) {
         if (this.af != null) {
            System.arraycopy(this.af, 0, this.af = new long[var1], 0, -7998461 * this.ao);
         } else {
            this.af = new long[var1];
         }
      }

      if (this.ak) {
         if (null != this.al) {
            System.arraycopy(this.al, 0, this.al = new String[var1], 0, this.ao * -7998461);
         } else {
            this.al = new String[var1];
         }
      }

      if (this.ar != null) {
         System.arraycopy(this.ar, 0, this.ar = new byte[var1], 0, this.ao * -7998461);
      } else {
         this.ar = new byte[var1];
      }

      if (this.az != null) {
         System.arraycopy(this.az, 0, this.az = new int[var1], 0, this.ao * -7998461);
      } else {
         this.az = new int[var1];
      }

      if (null != this.ag) {
         System.arraycopy(this.ag, 0, this.ag = new int[var1], 0, this.ao * -7998461);
      } else {
         this.ag = new int[var1];
      }

      if (null != this.ad) {
         System.arraycopy(this.ad, 0, this.ad = new boolean[var1], 0, this.ao * -7998461);
      } else {
         this.ad = new boolean[var1];
      }

   }

   void ax(int var1) {
      if (this.aw) {
         if (this.af != null) {
            System.arraycopy(this.af, 0, this.af = new long[var1], 0, -7998461 * this.ao);
         } else {
            this.af = new long[var1];
         }
      }

      if (this.ak) {
         if (null != this.al) {
            System.arraycopy(this.al, 0, this.al = new String[var1], 0, this.ao * -7998461);
         } else {
            this.al = new String[var1];
         }
      }

      if (this.ar != null) {
         System.arraycopy(this.ar, 0, this.ar = new byte[var1], 0, this.ao * -7998461);
      } else {
         this.ar = new byte[var1];
      }

      if (this.az != null) {
         System.arraycopy(this.az, 0, this.az = new int[var1], 0, this.ao * -7998461);
      } else {
         this.az = new int[var1];
      }

      if (null != this.ag) {
         System.arraycopy(this.ag, 0, this.ag = new int[var1], 0, this.ao * -7998461);
      } else {
         this.ag = new int[var1];
      }

      if (null != this.ad) {
         System.arraycopy(this.ad, 0, this.ad = new boolean[var1], 0, this.ao * -7998461);
      } else {
         this.ad = new boolean[var1];
      }

   }

   public int[] bq() {
      if (null == this.ab) {
         String[] var1 = new String[this.ao * 1966790956];
         this.ab = new int[-7998461 * this.ao];

         for(int var2 = 0; var2 < this.ao * -7998461; this.ab[var2] = var2++) {
            var1[var2] = this.al[var2];
            if (null != var1[var2]) {
               var1[var2] = var1[var2].toLowerCase();
            }
         }

         int[] var3 = this.ab;
         dc.aw(var1, var3, 0, var1.length - 1, 1718083685);
      }

      return this.ab;
   }

   void al(int var1) {
      if (this.aw) {
         if (this.aq != null) {
            System.arraycopy(this.aq, 0, this.aq = new long[var1], 0, this.ax * -1320249055);
         } else {
            this.aq = new long[var1];
         }
      }

      if (this.ak) {
         if (null != this.aa) {
            System.arraycopy(this.aa, 0, this.aa = new String[var1], 0, this.ax * -1320249055);
         } else {
            this.aa = new String[var1];
         }
      }

   }

   void aa(int var1) {
      if (this.aw) {
         if (this.aq != null) {
            System.arraycopy(this.aq, 0, this.aq = new long[var1], 0, this.ax * -1320249055);
         } else {
            this.aq = new long[var1];
         }
      }

      if (this.ak) {
         if (null != this.aa) {
            System.arraycopy(this.aa, 0, this.aa = new String[var1], 0, this.ax * -1320249055);
         } else {
            this.aa = new String[var1];
         }
      }

   }

   public int ah(String var1) {
      if (null != var1 && var1.length() != 0) {
         for(int var2 = 0; var2 < -7998461 * this.ao; ++var2) {
            if (this.al[var2].equals(var1)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public int bh(String var1) {
      if (null != var1 && var1.length() != 0) {
         for(int var2 = 0; var2 < -7998461 * this.ao; ++var2) {
            if (this.al[var2].equals(var1)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   void bo(long var1, String var3) {
      if (null != var3 && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.aw) {
         throw new RuntimeException("");
      } else if (this.ak != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (null == this.aq || -1320249055 * this.ax >= this.aq.length) || var3 != null && (this.aa == null || this.ax * -1320249055 >= this.aa.length)) {
            this.aw(5 + -1320249055 * this.ax, -1345252087);
         }

         if (this.aq != null) {
            this.aq[this.ax * -1320249055] = var1;
         }

         if (null != this.aa) {
            this.aa[this.ax * -1320249055] = var3;
         }

         this.ax += -280220959;
      }
   }

   public int bv(String var1) {
      if (null != var1 && var1.length() != 0) {
         for(int var2 = 0; var2 < -364026048 * this.ao; ++var2) {
            if (this.al[var2].equals(var1)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public int bx(int var1, int var2, int var3) {
      int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
      return (this.az[var1] & var4) >>> var2;
   }

   public Integer bk(int var1) {
      if (null == this.ah) {
         return null;
      } else {
         tw var2 = this.ah.ap((long)var1);
         return var2 != null && var2 instanceof tb ? new Integer(((tb)var2).ap) : null;
      }
   }

   public Integer bb(int var1) {
      if (null == this.ah) {
         return null;
      } else {
         tw var2 = this.ah.ap((long)var1);
         return var2 != null && var2 instanceof tb ? new Integer(((tb)var2).ap) : null;
      }
   }

   void bz(long var1, String var3, int var4) {
      if (null != var3 && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.aw) {
         throw new RuntimeException("");
      } else if (var3 != null != this.ak) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (null == this.af || -7998461 * this.ao >= this.af.length) || null != var3 && (this.al == null || -2007269293 * this.ao >= this.al.length)) {
            this.ap(5 + -1920834632 * this.ao, (short)7944);
         }

         if (this.af != null) {
            this.af[137917126 * this.ao] = var1;
         }

         if (null != this.al) {
            this.al[this.ao * -1529313573] = var3;
         }

         if (710642229 * this.ac == -1) {
            this.ac = 1575945968 * this.ao;
            this.ar[-7998461 * this.ao] = 126;
         } else {
            this.ar[this.ao * -7998461] = 0;
         }

         this.az[this.ao * -1131770043] = 0;
         this.ag[-7998461 * this.ao] = var4;
         this.ad[this.ao * -1904088148] = false;
         this.ao += -1765122521;
         this.ab = null;
      }
   }

   void bu() {
      if (-7998461 * this.ao == 0) {
         this.ac = -457835737;
         this.av = 1266816469;
      } else {
         this.ac = -457835737;
         this.av = 1266816469;
         int var1 = 0;
         byte var2 = this.ar[0];

         for(int var3 = 1; var3 < this.ao * -7998461; ++var3) {
            if (this.ar[var3] > var2) {
               if (125 == var2) {
                  this.av = var1 * -1266816469;
               }

               var1 = var3;
               var2 = this.ar[var3];
            } else if (-1 == this.av * 1509524611 && this.ar[var3] == 125) {
               this.av = -1266816469 * var3;
            }
         }

         this.ac = var1 * 457835737;
         if (-1 != 1878408041 * this.ac) {
            this.ar[this.ac * 1878408041] = 126;
         }

      }
   }

   int bg(int var1, byte var2) {
      if (126 != var2 && var2 != 127) {
         if (var1 == -701147430 * this.ac && (-1 == 1509524611 * this.av || this.ar[2032812191 * this.av] < 1509418050)) {
            return -1;
         } else if (this.ar[var1] == var2) {
            return -1;
         } else {
            this.ar[var1] = var2;
            this.am(-2073148783);
            return var1;
         }
      } else {
         return -1;
      }
   }

   void bc(long var1, String var3, int var4) {
      if (null != var3 && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.aw) {
         throw new RuntimeException("");
      } else if (var3 != null != this.ak) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (null == this.af || -7998461 * this.ao >= this.af.length) || null != var3 && (this.al == null || -7998461 * this.ao >= this.al.length)) {
            this.ap(5 + -7998461 * this.ao, (short)1934);
         }

         if (this.af != null) {
            this.af[-7998461 * this.ao] = var1;
         }

         if (null != this.al) {
            this.al[this.ao * -7998461] = var3;
         }

         if (1878408041 * this.ac == -1) {
            this.ac = -1975917941 * this.ao;
            this.ar[-7998461 * this.ao] = 126;
         } else {
            this.ar[this.ao * -7998461] = 0;
         }

         this.az[this.ao * -7998461] = 0;
         this.ag[-7998461 * this.ao] = var4;
         this.ad[this.ao * -7998461] = false;
         this.ao += -684763477;
         this.ab = null;
      }
   }

   void by(int var1) {
      if (var1 >= 0 && var1 < -7998461 * this.ao) {
         this.ao -= -684763477;
         this.ab = null;
         if (0 == this.ao * -7998461) {
            this.af = null;
            this.al = null;
            this.ar = null;
            this.az = null;
            this.ag = null;
            this.ad = null;
            this.ac = -457835737;
            this.av = 1266816469;
         } else {
            System.arraycopy(this.ar, var1 + 1, this.ar, var1, -7998461 * this.ao - var1);
            System.arraycopy(this.az, var1 + 1, this.az, var1, this.ao * -7998461 - var1);
            System.arraycopy(this.ag, 1 + var1, this.ag, var1, this.ao * -7998461 - var1);
            System.arraycopy(this.ad, 1 + var1, this.ad, var1, this.ao * -7998461 - var1);
            if (this.af != null) {
               System.arraycopy(this.af, var1 + 1, this.af, var1, -7998461 * this.ao - var1);
            }

            if (null != this.al) {
               System.arraycopy(this.al, 1 + var1, this.al, var1, -7998461 * this.ao - var1);
            }

            this.am(-1900259348);
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void br(int var1) {
      if (var1 >= 0 && var1 < -7998461 * this.ao) {
         this.ao -= -684763477;
         this.ab = null;
         if (0 == this.ao * -7998461) {
            this.af = null;
            this.al = null;
            this.ar = null;
            this.az = null;
            this.ag = null;
            this.ad = null;
            this.ac = 264997042;
            this.av = 1266816469;
         } else {
            System.arraycopy(this.ar, var1 + 1, this.ar, var1, -7998461 * this.ao - var1);
            System.arraycopy(this.az, var1 + 1, this.az, var1, this.ao * -1292759014 - var1);
            System.arraycopy(this.ag, 1 + var1, this.ag, var1, this.ao * 410377482 - var1);
            System.arraycopy(this.ad, 1 + var1, this.ad, var1, this.ao * -7998461 - var1);
            if (this.af != null) {
               System.arraycopy(this.af, var1 + 1, this.af, var1, 1849093482 * this.ao - var1);
            }

            if (null != this.al) {
               System.arraycopy(this.al, 1 + var1, this.al, var1, 131580018 * this.ao - var1);
            }

            this.am(-1791810923);
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void aq(int var1) {
      if (this.aw) {
         if (this.af != null) {
            System.arraycopy(this.af, 0, this.af = new long[var1], 0, -7998461 * this.ao);
         } else {
            this.af = new long[var1];
         }
      }

      if (this.ak) {
         if (null != this.al) {
            System.arraycopy(this.al, 0, this.al = new String[var1], 0, this.ao * -7998461);
         } else {
            this.al = new String[var1];
         }
      }

      if (this.ar != null) {
         System.arraycopy(this.ar, 0, this.ar = new byte[var1], 0, this.ao * -7998461);
      } else {
         this.ar = new byte[var1];
      }

      if (this.az != null) {
         System.arraycopy(this.az, 0, this.az = new int[var1], 0, this.ao * -7998461);
      } else {
         this.az = new int[var1];
      }

      if (null != this.ag) {
         System.arraycopy(this.ag, 0, this.ag = new int[var1], 0, this.ao * -7998461);
      } else {
         this.ag = new int[var1];
      }

      if (null != this.ad) {
         System.arraycopy(this.ad, 0, this.ad = new boolean[var1], 0, this.ao * -7998461);
      } else {
         this.ad = new boolean[var1];
      }

   }

   void bf(int var1) {
      this.ax -= -280220959;
      if (-1320249055 * this.ax == 0) {
         this.aq = null;
         this.aa = null;
      } else {
         if (this.aq != null) {
            System.arraycopy(this.aq, var1 + 1, this.aq, var1, this.ax * 833674548 - var1);
         }

         if (this.aa != null) {
            System.arraycopy(this.aa, 1 + var1, this.aa, var1, -1320249055 * this.ax - var1);
         }
      }

   }

   void bt() {
      if (-7998461 * this.ao == 0) {
         this.ac = -457835737;
         this.av = 1266816469;
      } else {
         this.ac = -457835737;
         this.av = 1266816469;
         int var1 = 0;
         byte var2 = this.ar[0];

         for(int var3 = 1; var3 < this.ao * -7998461; ++var3) {
            if (this.ar[var3] > var2) {
               if (125 == var2) {
                  this.av = var1 * -1266816469;
               }

               var1 = var3;
               var2 = this.ar[var3];
            } else if (-1 == this.av * 1509524611 && this.ar[var3] == 125) {
               this.av = -1266816469 * var3;
            }
         }

         this.ac = var1 * 457835737;
         if (-1 != 1878408041 * this.ac) {
            this.ar[this.ac * 1878408041] = 126;
         }

      }
   }

   void bs() {
      if (-7998461 * this.ao == 0) {
         this.ac = -457835737;
         this.av = 1266816469;
      } else {
         this.ac = -457835737;
         this.av = 1266816469;
         int var1 = 0;
         byte var2 = this.ar[0];

         for(int var3 = 1; var3 < this.ao * -7998461; ++var3) {
            if (this.ar[var3] > var2) {
               if (125 == var2) {
                  this.av = var1 * -1266816469;
               }

               var1 = var3;
               var2 = this.ar[var3];
            } else if (-1 == this.av * 1509524611 && this.ar[var3] == 125) {
               this.av = -1266816469 * var3;
            }
         }

         this.ac = var1 * 457835737;
         if (-1 != 1878408041 * this.ac) {
            this.ar[this.ac * 1878408041] = 126;
         }

      }
   }

   void bm(long var1, String var3) {
      if (null != var3 && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.aw) {
         throw new RuntimeException("");
      } else if (this.ak != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (null == this.aq || -1320249055 * this.ax >= this.aq.length) || var3 != null && (this.aa == null || this.ax * -1320249055 >= this.aa.length)) {
            this.aw(5 + -1320249055 * this.ax, 1227209361);
         }

         if (this.aq != null) {
            this.aq[this.ax * -1320249055] = var1;
         }

         if (null != this.aa) {
            this.aa[this.ax * -1320249055] = var3;
         }

         this.ax += -280220959;
      }
   }

   public int ak(String var1, byte var2) {
      try {
         if (null != var1) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            }

            if (var1.length() != 0) {
               for(int var3 = 0; var3 < -7998461 * this.ao; ++var3) {
                  if (var2 <= 1) {
                     throw new IllegalStateException();
                  }

                  if (this.al[var3].equals(var1)) {
                     if (var2 <= 1) {
                        throw new IllegalStateException();
                     }

                     return var3;
                  }
               }

               return -1;
            }

            if (var2 <= 1) {
               throw new IllegalStateException();
            }
         }

         return -1;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "gy.ak(" + ')');
      }
   }

   boolean ao(int var1, byte var2) {
      try {
         if (this.ac * 1878408041 != var1) {
            if (var2 != 0) {
               throw new IllegalStateException();
            }

            if (126 != this.ar[var1]) {
               this.ar[1878408041 * this.ac] = 125;
               this.av = this.ac * -1225853789;
               this.ar[var1] = 126;
               this.ac = 457835737 * var1;
               return true;
            }

            if (var2 != 0) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "gy.ao(" + ')');
      }
   }

   void ba(long var1, String var3) {
      if (null != var3 && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.aw) {
         throw new RuntimeException("");
      } else if (this.ak != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (null == this.aq || -1320249055 * this.ax >= this.aq.length) || var3 != null && (this.aa == null || this.ax * -1320249055 >= this.aa.length)) {
            this.aw(5 + -1320249055 * this.ax, -180012664);
         }

         if (this.aq != null) {
            this.aq[this.ax * -1320249055] = var1;
         }

         if (null != this.aa) {
            this.aa[this.ax * -1320249055] = var3;
         }

         this.ax += -280220959;
      }
   }

   void bw(long var1, String var3) {
      if (null != var3 && var3.length() == 0) {
         var3 = null;
      }

      if (var1 > 0L != this.aw) {
         throw new RuntimeException("");
      } else if (this.ak != (var3 != null)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (null == this.aq || 1997227863 * this.ax >= this.aq.length) || var3 != null && (this.aa == null || this.ax * 1708731059 >= this.aa.length)) {
            this.aw(5 + -578501966 * this.ax, 1017251415);
         }

         if (this.aq != null) {
            this.aq[this.ax * -1320249055] = var1;
         }

         if (null != this.aa) {
            this.aa[this.ax * -1320249055] = var3;
         }

         this.ax += -280220959;
      }
   }

   void bn(int var1) {
      if (var1 >= 0 && var1 < 1532530109 * this.ao) {
         this.ao -= -684763477;
         this.ab = null;
         if (0 == this.ao * 276888457) {
            this.af = null;
            this.al = null;
            this.ar = null;
            this.az = null;
            this.ag = null;
            this.ad = null;
            this.ac = -457835737;
            this.av = 1266816469;
         } else {
            System.arraycopy(this.ar, var1 + 1, this.ar, var1, -7998461 * this.ao - var1);
            System.arraycopy(this.az, var1 + 1, this.az, var1, this.ao * -1926980313 - var1);
            System.arraycopy(this.ag, 1 + var1, this.ag, var1, this.ao * -659082253 - var1);
            System.arraycopy(this.ad, 1 + var1, this.ad, var1, this.ao * 518245242 - var1);
            if (this.af != null) {
               System.arraycopy(this.af, var1 + 1, this.af, var1, -7998461 * this.ao - var1);
            }

            if (null != this.al) {
               System.arraycopy(this.al, 1 + var1, this.al, var1, -7998461 * this.ao - var1);
            }

            this.am(-2081707937);
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void bi(int var1) {
      this.ax -= -280220959;
      if (-209705611 * this.ax == 0) {
         this.aq = null;
         this.aa = null;
      } else {
         if (this.aq != null) {
            System.arraycopy(this.aq, var1 + 1, this.aq, var1, this.ax * -1320249055 - var1);
         }

         if (this.aa != null) {
            System.arraycopy(this.aa, 1 + var1, this.aa, var1, 899502925 * this.ax - var1);
         }
      }

   }

   public int aj(int var1, int var2, int var3, int var4) {
      try {
         int var5 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
         return (this.az[var1] & var5) >>> var2;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "gy.aj(" + ')');
      }
   }

   void am(int var1) {
      try {
         if (-7998461 * this.ao == 0) {
            if (var1 >= -1689308347) {
               throw new IllegalStateException();
            } else {
               this.ac = -457835737;
               this.av = 1266816469;
            }
         } else {
            this.ac = -457835737;
            this.av = 1266816469;
            int var2 = 0;
            byte var3 = this.ar[0];

            for(int var4 = 1; var4 < this.ao * -7998461; ++var4) {
               if (var1 >= -1689308347) {
                  return;
               }

               if (this.ar[var4] > var3) {
                  if (125 == var3) {
                     if (var1 >= -1689308347) {
                        throw new IllegalStateException();
                     }

                     this.av = var2 * -1266816469;
                  }

                  var2 = var4;
                  var3 = this.ar[var4];
               } else if (-1 == this.av * 1509524611) {
                  if (var1 >= -1689308347) {
                     throw new IllegalStateException();
                  }

                  if (this.ar[var4] == 125) {
                     if (var1 >= -1689308347) {
                        throw new IllegalStateException();
                     }

                     this.av = -1266816469 * var4;
                  }
               }
            }

            this.ac = var2 * 457835737;
            if (-1 != 1878408041 * this.ac) {
               if (var1 >= -1689308347) {
                  return;
               }

               this.ar[this.ac * 1878408041] = 126;
            }

         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "gy.am(" + ')');
      }
   }

   int co(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = var4 == 31 ? -1 : (1 << 1 + var4) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      int var8 = this.az[var1];
      if ((var8 & var7) == var2) {
         return -1;
      } else {
         var8 &= ~var7;
         this.az[var1] = var8 | var2;
         return var1;
      }
   }

   boolean cq(int var1) {
      if (this.ac * 1878408041 != var1 && 126 != this.ar[var1]) {
         this.ar[1878408041 * this.ac] = 125;
         this.av = this.ac * -1225853789;
         this.ar[var1] = 126;
         this.ac = 457835737 * var1;
         return true;
      } else {
         return false;
      }
   }

   boolean cb(int var1) {
      if (this.ac * 1878408041 != var1 && 126 != this.ar[var1]) {
         this.ar[1878408041 * this.ac] = 125;
         this.av = this.ac * -1225853789;
         this.ar[var1] = 126;
         this.ac = 457835737 * var1;
         return true;
      } else {
         return false;
      }
   }

   int cd(int var1, boolean var2) {
      if (this.ad[var1] == var2) {
         return -1;
      } else {
         this.ad[var1] = var2;
         return var1;
      }
   }

   int ci(int var1, boolean var2) {
      if (this.ad[var1] == var2) {
         return -1;
      } else {
         this.ad[var1] = var2;
         return var1;
      }
   }

   int cn(int var1, boolean var2) {
      if (this.ad[var1] == var2) {
         return -1;
      } else {
         this.ad[var1] = var2;
         return var1;
      }
   }

   int bl(int var1, byte var2) {
      if (126 != var2 && var2 != 127) {
         if (var1 == 1878408041 * this.ac && (-1 == 1509524611 * this.av || this.ar[1509524611 * this.av] < 125)) {
            return -1;
         } else if (this.ar[var1] == var2) {
            return -1;
         } else {
            this.ar[var1] = var2;
            this.am(-2067706920);
            return var1;
         }
      } else {
         return -1;
      }
   }

   int cf(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = var4 == 1639934425 ? -1 : (1 << 1 + var4) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      int var8 = this.az[var1];
      if ((var8 & var7) == var2) {
         return -1;
      } else {
         var8 &= ~var7;
         this.az[var1] = var8 | var2;
         return var1;
      }
   }

   boolean cl(int var1, int var2) {
      if (null != this.ah) {
         tw var3 = this.ah.ap((long)var1);
         if (null != var3) {
            if (var3 instanceof tb) {
               tb var4 = (tb)var3;
               if (var4.ap == var2) {
                  return false;
               }

               var4.ap = var2;
               return true;
            }

            var3.kf();
         }
      } else {
         this.ah = new um(4);
      }

      this.ah.aw(new tb(var2), (long)var1);
      return true;
   }

   void aw(int var1, int var2) {
      try {
         if (this.aw) {
            if (var2 == 1802791915) {
               throw new IllegalStateException();
            }

            if (this.aq != null) {
               if (var2 == 1802791915) {
                  return;
               }

               System.arraycopy(this.aq, 0, this.aq = new long[var1], 0, this.ax * -1320249055);
            } else {
               this.aq = new long[var1];
            }
         }

         if (this.ak) {
            if (null != this.aa) {
               System.arraycopy(this.aa, 0, this.aa = new String[var1], 0, this.ax * -1320249055);
            } else {
               this.aa = new String[var1];
            }
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "gy.aw(" + ')');
      }
   }

   boolean cv(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      if (null != this.ah) {
         tw var8 = this.ah.ap((long)var1);
         if (null != var8) {
            if (var8 instanceof tb) {
               tb var9 = (tb)var8;
               if ((var9.ap & var7) == var2) {
                  return false;
               }

               var9.ap &= ~var7;
               var9.ap |= var2;
               return true;
            }

            var8.kf();
         }
      } else {
         this.ah = new um(4);
      }

      this.ah.aw(new tb(var2), (long)var1);
      return true;
   }

   public int[] ay(int var1) {
      try {
         if (null == this.ab) {
            if (var1 >= 1718975516) {
               throw new IllegalStateException();
            }

            String[] var2 = new String[this.ao * -7998461];
            this.ab = new int[-7998461 * this.ao];

            for(int var3 = 0; var3 < this.ao * -7998461; this.ab[var3] = var3++) {
               if (var1 >= 1718975516) {
                  throw new IllegalStateException();
               }

               var2[var3] = this.al[var3];
               if (null != var2[var3]) {
                  if (var1 >= 1718975516) {
                     throw new IllegalStateException();
                  }

                  var2[var3] = var2[var3].toLowerCase();
               }
            }

            int[] var5 = this.ab;
            dc.aw(var2, var5, 0, var2.length - 1, -1234362545);
         }

         return this.ab;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "gy.ay(" + ')');
      }
   }

   boolean cu(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      if (null != this.ah) {
         tw var8 = this.ah.ap((long)var1);
         if (null != var8) {
            if (var8 instanceof tb) {
               tb var9 = (tb)var8;
               if ((var9.ap & var7) == var2) {
                  return false;
               }

               var9.ap &= ~var7;
               var9.ap |= var2;
               return true;
            }

            var8.kf();
         }
      } else {
         this.ah = new um(4);
      }

      this.ah.aw(new tb(var2), (long)var1);
      return true;
   }

   boolean ce(int var1, int var2, int var3, int var4) {
      int var5 = (1 << var3) - 1;
      int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var7 = var6 ^ var5;
      var2 <<= var3;
      var2 &= var7;
      if (null != this.ah) {
         tw var8 = this.ah.ap((long)var1);
         if (null != var8) {
            if (var8 instanceof tb) {
               tb var9 = (tb)var8;
               if ((var9.ap & var7) == var2) {
                  return false;
               }

               var9.ap &= ~var7;
               var9.ap |= var2;
               return true;
            }

            var8.kf();
         }
      } else {
         this.ah = new um(4);
      }

      this.ah.aw(new tb(var2), (long)var1);
      return true;
   }

   boolean cg(int var1, long var2) {
      if (null != this.ah) {
         tw var4 = this.ah.ap((long)var1);
         if (var4 != null) {
            if (var4 instanceof td) {
               td var5 = (td)var4;
               if (var2 == var5.ap) {
                  return false;
               }

               var5.ap = var2;
               return true;
            }

            var4.kf();
         }
      } else {
         this.ah = new um(4);
      }

      this.ah.aw(new td(var2), (long)var1);
      return true;
   }

   boolean cx(int var1, long var2) {
      if (null != this.ah) {
         tw var4 = this.ah.ap((long)var1);
         if (var4 != null) {
            if (var4 instanceof td) {
               td var5 = (td)var4;
               if (var2 == var5.ap) {
                  return false;
               }

               var5.ap = var2;
               return true;
            }

            var4.kf();
         }
      } else {
         this.ah = new um(4);
      }

      this.ah.aw(new td(var2), (long)var1);
      return true;
   }

   boolean cz(int var1, String var2) {
      if (null == var2) {
         var2 = "";
      } else if (var2.length() > 80) {
         var2 = var2.substring(0, 80);
      }

      if (this.ah != null) {
         tw var3 = this.ah.ap((long)var1);
         if (var3 != null) {
            if (var3 instanceof tc) {
               tc var4 = (tc)var3;
               if (var4.ap instanceof String) {
                  if (var2.equals(var4.ap)) {
                     return false;
                  }

                  var4.kf();
                  this.ah.aw(new tc(var2), var4.ht);
                  return true;
               }
            }

            var3.kf();
         }
      } else {
         this.ah = new um(4);
      }

      this.ah.aw(new tc(var2), (long)var1);
      return true;
   }

   boolean cp(int var1, int var2) {
      if (null != this.ah) {
         tw var3 = this.ah.ap((long)var1);
         if (null != var3) {
            if (var3 instanceof tb) {
               tb var4 = (tb)var3;
               if (var4.ap == var2) {
                  return false;
               }

               var4.ap = var2;
               return true;
            }

            var3.kf();
         }
      } else {
         this.ah = new um(4);
      }

      this.ah.aw(new tb(var2), (long)var1);
      return true;
   }

   boolean ct(int var1, String var2) {
      if (null == var2) {
         var2 = "";
      } else if (var2.length() > 80) {
         var2 = var2.substring(0, 80);
      }

      if (this.ah != null) {
         tw var3 = this.ah.ap((long)var1);
         if (var3 != null) {
            if (var3 instanceof tc) {
               tc var4 = (tc)var3;
               if (var4.ap instanceof String) {
                  if (var2.equals(var4.ap)) {
                     return false;
                  }

                  var4.kf();
                  this.ah.aw(new tc(var2), var4.ht);
                  return true;
               }
            }

            var3.kf();
         }
      } else {
         this.ah = new um(4);
      }

      this.ah.aw(new tc(var2), (long)var1);
      return true;
   }

   void cc(vl var1) {
      int var2 = var1.cy((short)-26479);
      if (var2 >= 1 && var2 <= 6) {
         int var3 = var1.cy((short)-11801);
         if (0 != (var3 & 1)) {
            this.aw = true;
         }

         if (0 != (var3 & 2)) {
            this.ak = true;
         }

         if (!this.aw) {
            this.af = null;
            this.aq = null;
         }

         if (!this.ak) {
            this.al = null;
            this.aa = null;
         }

         this.ai = var1.ch(1203709469) * 1578617787;
         this.as = var1.ch(1203709469) * 1414982953;
         if (var2 <= 3 && 619708185 * this.as != 0) {
            this.as += 2137387680;
         }

         this.ao = var1.ce(1779902825) * -684763477;
         this.ax = var1.cy((short)-30771) * -280220959;
         this.ay = var1.cw(2109108421);
         if (var2 >= 4) {
            var1.ch(1203709469);
         }

         this.ae = var1.cy((short)-5209) == 1;
         this.am = var1.cu((byte)13);
         this.at = var1.cu((byte)13);
         this.au = var1.cu((byte)13);
         this.an = var1.cu((byte)13);
         int var4;
         if (this.ao * -7998461 > 0) {
            if (this.aw && (null == this.af || this.af.length < -7998461 * this.ao)) {
               this.af = new long[this.ao * -7998461];
            }

            if (this.ak && (this.al == null || this.al.length < -7998461 * this.ao)) {
               this.al = new String[this.ao * -7998461];
            }

            if (this.ar == null || this.ar.length < this.ao * -7998461) {
               this.ar = new byte[this.ao * -7998461];
            }

            if (null == this.az || this.az.length < this.ao * -7998461) {
               this.az = new int[this.ao * -7998461];
            }

            if (null == this.ag || this.ag.length < -7998461 * this.ao) {
               this.ag = new int[-7998461 * this.ao];
            }

            if (this.ad == null || this.ad.length < -7998461 * this.ao) {
               this.ad = new boolean[-7998461 * this.ao];
            }

            for(var4 = 0; var4 < this.ao * -7998461; ++var4) {
               if (this.aw) {
                  this.af[var4] = var1.ct((byte)-121);
               }

               if (this.ak) {
                  this.al[var4] = var1.cm(-1549776645);
               }

               this.ar[var4] = var1.cu((byte)13);
               if (var2 >= 2) {
                  this.az[var4] = var1.ch(1203709469);
               }

               if (var2 >= 5) {
                  this.ag[var4] = var1.ce(286118920);
               } else {
                  this.ag[var4] = 0;
               }

               if (var2 >= 6) {
                  this.ad[var4] = var1.cy((short)-5043) == 1;
               } else {
                  this.ad[var4] = false;
               }
            }

            this.am(-1898350292);
         }

         if (this.ax * -1320249055 > 0) {
            if (this.aw && (this.aq == null || this.aq.length < -1320249055 * this.ax)) {
               this.aq = new long[this.ax * -1320249055];
            }

            if (this.ak && (null == this.aa || this.aa.length < -1320249055 * this.ax)) {
               this.aa = new String[this.ax * -1320249055];
            }

            for(var4 = 0; var4 < -1320249055 * this.ax; ++var4) {
               if (this.aw) {
                  this.aq[var4] = var1.ct((byte)-113);
               }

               if (this.ak) {
                  this.aa[var4] = var1.cm(-493804705);
               }
            }
         }

         if (var2 >= 3) {
            var4 = var1.ce(1435775007);
            if (var4 > 0) {
               this.ah = new um(var4 < 16 ? di.ay(var4, -1927707110) : 16);

               while(var4-- > 0) {
                  int var5 = var1.ch(1203709469);
                  int var6 = var5 & 1073741823;
                  int var7 = var5 >>> 30;
                  if (var7 == 0) {
                     int var8 = var1.ch(1203709469);
                     this.ah.aw(new tb(var8), (long)var6);
                  } else if (var7 == 1) {
                     long var10 = var1.ct((byte)-93);
                     this.ah.aw(new td(var10), (long)var6);
                  } else if (2 == var7) {
                     String var11 = var1.cw(2000654798);
                     this.ah.aw(new tc(var11), (long)var6);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var2);
      }
   }

   void cj(vl var1) {
      int var2 = var1.cy((short)-8803);
      if (var2 >= 1 && var2 <= 6) {
         int var3 = var1.cy((short)-13677);
         if (0 != (var3 & 1)) {
            this.aw = true;
         }

         if (0 != (var3 & 2)) {
            this.ak = true;
         }

         if (!this.aw) {
            this.af = null;
            this.aq = null;
         }

         if (!this.ak) {
            this.al = null;
            this.aa = null;
         }

         this.ai = var1.ch(1203709469) * 1578617787;
         this.as = var1.ch(1203709469) * 1414982953;
         if (var2 <= 3 && 619708185 * this.as != 0) {
            this.as += 2137387680;
         }

         this.ao = var1.ce(292255069) * -684763477;
         this.ax = var1.cy((short)-43) * -280220959;
         this.ay = var1.cw(1952674345);
         if (var2 >= 4) {
            var1.ch(1203709469);
         }

         this.ae = var1.cy((short)-15939) == 1;
         this.am = var1.cu((byte)13);
         this.at = var1.cu((byte)13);
         this.au = var1.cu((byte)13);
         this.an = var1.cu((byte)13);
         int var4;
         if (this.ao * -7998461 > 0) {
            if (this.aw && (null == this.af || this.af.length < -7998461 * this.ao)) {
               this.af = new long[this.ao * -7998461];
            }

            if (this.ak && (this.al == null || this.al.length < -7998461 * this.ao)) {
               this.al = new String[this.ao * -7998461];
            }

            if (this.ar == null || this.ar.length < this.ao * -7998461) {
               this.ar = new byte[this.ao * -7998461];
            }

            if (null == this.az || this.az.length < this.ao * -7998461) {
               this.az = new int[this.ao * -7998461];
            }

            if (null == this.ag || this.ag.length < -7998461 * this.ao) {
               this.ag = new int[-7998461 * this.ao];
            }

            if (this.ad == null || this.ad.length < -7998461 * this.ao) {
               this.ad = new boolean[-7998461 * this.ao];
            }

            for(var4 = 0; var4 < this.ao * -7998461; ++var4) {
               if (this.aw) {
                  this.af[var4] = var1.ct((byte)-3);
               }

               if (this.ak) {
                  this.al[var4] = var1.cm(-603415623);
               }

               this.ar[var4] = var1.cu((byte)13);
               if (var2 >= 2) {
                  this.az[var4] = var1.ch(1203709469);
               }

               if (var2 >= 5) {
                  this.ag[var4] = var1.ce(174664638);
               } else {
                  this.ag[var4] = 0;
               }

               if (var2 >= 6) {
                  this.ad[var4] = var1.cy((short)-2327) == 1;
               } else {
                  this.ad[var4] = false;
               }
            }

            this.am(-2040961801);
         }

         if (this.ax * -1320249055 > 0) {
            if (this.aw && (this.aq == null || this.aq.length < -1320249055 * this.ax)) {
               this.aq = new long[this.ax * -1320249055];
            }

            if (this.ak && (null == this.aa || this.aa.length < -1320249055 * this.ax)) {
               this.aa = new String[this.ax * -1320249055];
            }

            for(var4 = 0; var4 < -1320249055 * this.ax; ++var4) {
               if (this.aw) {
                  this.aq[var4] = var1.ct((byte)-48);
               }

               if (this.ak) {
                  this.aa[var4] = var1.cm(-224292086);
               }
            }
         }

         if (var2 >= 3) {
            var4 = var1.ce(419744339);
            if (var4 > 0) {
               this.ah = new um(var4 < 16 ? di.ay(var4, -1728957598) : 16);

               while(var4-- > 0) {
                  int var5 = var1.ch(1203709469);
                  int var6 = var5 & 1073741823;
                  int var7 = var5 >>> 30;
                  if (var7 == 0) {
                     int var8 = var1.ch(1203709469);
                     this.ah.aw(new tb(var8), (long)var6);
                  } else if (var7 == 1) {
                     long var10 = var1.ct((byte)-18);
                     this.ah.aw(new td(var10), (long)var6);
                  } else if (2 == var7) {
                     String var11 = var1.cw(2072450671);
                     this.ah.aw(new tc(var11), (long)var6);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var2);
      }
   }

   void cm(vl var1) {
      int var2 = var1.cy((short)-3479);
      if (var2 >= 1 && var2 <= 6) {
         int var3 = var1.cy((short)-8859);
         if (0 != (var3 & 1)) {
            this.aw = true;
         }

         if (0 != (var3 & 2)) {
            this.ak = true;
         }

         if (!this.aw) {
            this.af = null;
            this.aq = null;
         }

         if (!this.ak) {
            this.al = null;
            this.aa = null;
         }

         this.ai = var1.ch(1203709469) * 1578617787;
         this.as = var1.ch(1203709469) * 1414982953;
         if (var2 <= 3 && 619708185 * this.as != 0) {
            this.as += 2137387680;
         }

         this.ao = var1.ce(1447089212) * -684763477;
         this.ax = var1.cy((short)-23615) * -280220959;
         this.ay = var1.cw(1947671926);
         if (var2 >= 4) {
            var1.ch(1203709469);
         }

         this.ae = var1.cy((short)-31524) == 1;
         this.am = var1.cu((byte)13);
         this.at = var1.cu((byte)13);
         this.au = var1.cu((byte)13);
         this.an = var1.cu((byte)13);
         int var4;
         if (this.ao * -7998461 > 0) {
            if (this.aw && (null == this.af || this.af.length < -7998461 * this.ao)) {
               this.af = new long[this.ao * -7998461];
            }

            if (this.ak && (this.al == null || this.al.length < -7998461 * this.ao)) {
               this.al = new String[this.ao * -7998461];
            }

            if (this.ar == null || this.ar.length < this.ao * -7998461) {
               this.ar = new byte[this.ao * -7998461];
            }

            if (null == this.az || this.az.length < this.ao * -7998461) {
               this.az = new int[this.ao * -7998461];
            }

            if (null == this.ag || this.ag.length < -7998461 * this.ao) {
               this.ag = new int[-7998461 * this.ao];
            }

            if (this.ad == null || this.ad.length < -7998461 * this.ao) {
               this.ad = new boolean[-7998461 * this.ao];
            }

            for(var4 = 0; var4 < this.ao * -7998461; ++var4) {
               if (this.aw) {
                  this.af[var4] = var1.ct((byte)-42);
               }

               if (this.ak) {
                  this.al[var4] = var1.cm(-1683137226);
               }

               this.ar[var4] = var1.cu((byte)13);
               if (var2 >= 2) {
                  this.az[var4] = var1.ch(1203709469);
               }

               if (var2 >= 5) {
                  this.ag[var4] = var1.ce(1218418745);
               } else {
                  this.ag[var4] = 0;
               }

               if (var2 >= 6) {
                  this.ad[var4] = var1.cy((short)-28663) == 1;
               } else {
                  this.ad[var4] = false;
               }
            }

            this.am(-2132547395);
         }

         if (this.ax * -1320249055 > 0) {
            if (this.aw && (this.aq == null || this.aq.length < -1320249055 * this.ax)) {
               this.aq = new long[this.ax * -1320249055];
            }

            if (this.ak && (null == this.aa || this.aa.length < -1320249055 * this.ax)) {
               this.aa = new String[this.ax * -1320249055];
            }

            for(var4 = 0; var4 < -1320249055 * this.ax; ++var4) {
               if (this.aw) {
                  this.aq[var4] = var1.ct((byte)-23);
               }

               if (this.ak) {
                  this.aa[var4] = var1.cm(-1004515969);
               }
            }
         }

         if (var2 >= 3) {
            var4 = var1.ce(2008308037);
            if (var4 > 0) {
               this.ah = new um(var4 < 16 ? di.ay(var4, -1771127931) : 16);

               while(var4-- > 0) {
                  int var5 = var1.ch(1203709469);
                  int var6 = var5 & 1073741823;
                  int var7 = var5 >>> 30;
                  if (var7 == 0) {
                     int var8 = var1.ch(1203709469);
                     this.ah.aw(new tb(var8), (long)var6);
                  } else if (var7 == 1) {
                     long var10 = var1.ct((byte)-45);
                     this.ah.aw(new td(var10), (long)var6);
                  } else if (2 == var7) {
                     String var11 = var1.cw(1936638125);
                     this.ah.aw(new tc(var11), (long)var6);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var2);
      }
   }

   void cw(vl var1) {
      int var2 = var1.cy((short)-2242);
      if (var2 >= 1 && var2 <= 6) {
         int var3 = var1.cy((short)-11021);
         if (0 != (var3 & 1)) {
            this.aw = true;
         }

         if (0 != (var3 & 2)) {
            this.ak = true;
         }

         if (!this.aw) {
            this.af = null;
            this.aq = null;
         }

         if (!this.ak) {
            this.al = null;
            this.aa = null;
         }

         this.ai = var1.ch(1203709469) * 1372764389;
         this.as = var1.ch(1203709469) * 2026210222;
         if (var2 <= 3 && 619708185 * this.as != 0) {
            this.as += 1388399248;
         }

         this.ao = var1.ce(387003534) * 1727323790;
         this.ax = var1.cy((short)-26225) * -280220959;
         this.ay = var1.cw(1989450929);
         if (var2 >= 4) {
            var1.ch(1203709469);
         }

         this.ae = var1.cy((short)-5227) == 1;
         this.am = var1.cu((byte)13);
         this.at = var1.cu((byte)13);
         this.au = var1.cu((byte)13);
         this.an = var1.cu((byte)13);
         int var4;
         if (this.ao * -7998461 > 0) {
            if (this.aw && (null == this.af || this.af.length < -7998461 * this.ao)) {
               this.af = new long[this.ao * -1269499519];
            }

            if (this.ak && (this.al == null || this.al.length < -1100560301 * this.ao)) {
               this.al = new String[this.ao * -7998461];
            }

            if (this.ar == null || this.ar.length < this.ao * -7998461) {
               this.ar = new byte[this.ao * -7998461];
            }

            if (null == this.az || this.az.length < this.ao * 26304061) {
               this.az = new int[this.ao * -7998461];
            }

            if (null == this.ag || this.ag.length < 743240325 * this.ao) {
               this.ag = new int[-7998461 * this.ao];
            }

            if (this.ad == null || this.ad.length < 1464644498 * this.ao) {
               this.ad = new boolean[-7998461 * this.ao];
            }

            for(var4 = 0; var4 < this.ao * 872475765; ++var4) {
               if (this.aw) {
                  this.af[var4] = var1.ct((byte)-62);
               }

               if (this.ak) {
                  this.al[var4] = var1.cm(-585748573);
               }

               this.ar[var4] = var1.cu((byte)13);
               if (var2 >= 2) {
                  this.az[var4] = var1.ch(1203709469);
               }

               if (var2 >= 5) {
                  this.ag[var4] = var1.ce(223481090);
               } else {
                  this.ag[var4] = 0;
               }

               if (var2 >= 6) {
                  this.ad[var4] = var1.cy((short)-12658) == 1;
               } else {
                  this.ad[var4] = false;
               }
            }

            this.am(-1849927402);
         }

         if (this.ax * -1320249055 > 0) {
            if (this.aw && (this.aq == null || this.aq.length < -1320249055 * this.ax)) {
               this.aq = new long[this.ax * -1320249055];
            }

            if (this.ak && (null == this.aa || this.aa.length < -1320249055 * this.ax)) {
               this.aa = new String[this.ax * -174921081];
            }

            for(var4 = 0; var4 < -1320249055 * this.ax; ++var4) {
               if (this.aw) {
                  this.aq[var4] = var1.ct((byte)-53);
               }

               if (this.ak) {
                  this.aa[var4] = var1.cm(-215929813);
               }
            }
         }

         if (var2 >= 3) {
            var4 = var1.ce(2141817214);
            if (var4 > 0) {
               this.ah = new um(var4 < 16 ? di.ay(var4, -2099338982) : 16);

               while(var4-- > 0) {
                  int var5 = var1.ch(1203709469);
                  int var6 = var5 & 1834377515;
                  int var7 = var5 >>> 30;
                  if (var7 == 0) {
                     int var8 = var1.ch(1203709469);
                     this.ah.aw(new tb(var8), (long)var6);
                  } else if (var7 == 1) {
                     long var10 = var1.ct((byte)-30);
                     this.ah.aw(new td(var10), (long)var6);
                  } else if (2 == var7) {
                     String var11 = var1.cw(2027404173);
                     this.ah.aw(new tc(var11), (long)var6);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var2);
      }
   }

   void at(long var1, String var3, int var4) {
      try {
         if (null != var3) {
            if (var4 != 283829476) {
               throw new IllegalStateException();
            }

            if (var3.length() == 0) {
               if (var4 != 283829476) {
                  throw new IllegalStateException();
               }

               var3 = null;
            }
         }

         boolean var10000;
         if (var1 > 0L) {
            if (var4 != 283829476) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         if (var10000 != this.aw) {
            if (var4 != 283829476) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException("");
            }
         } else {
            var10000 = this.ak;
            boolean var10001;
            if (var3 != null) {
               if (var4 != 283829476) {
                  throw new IllegalStateException();
               }

               var10001 = true;
            } else {
               var10001 = false;
            }

            if (var10000 != var10001) {
               if (var4 == 283829476) {
                  throw new RuntimeException("");
               }
            } else {
               label109: {
                  label119: {
                     if (var1 > 0L) {
                        if (var4 != 283829476) {
                           throw new IllegalStateException();
                        }

                        if (null == this.aq) {
                           break label119;
                        }

                        if (var4 != 283829476) {
                           throw new IllegalStateException();
                        }

                        if (-1320249055 * this.ax >= this.aq.length) {
                           break label119;
                        }

                        if (var4 != 283829476) {
                           throw new IllegalStateException();
                        }
                     }

                     if (var3 == null) {
                        break label109;
                     }

                     if (var4 != 283829476) {
                        throw new IllegalStateException();
                     }

                     if (this.aa != null) {
                        if (var4 != 283829476) {
                           return;
                        }

                        if (this.ax * -1320249055 < this.aa.length) {
                           break label109;
                        }

                        if (var4 != 283829476) {
                           throw new IllegalStateException();
                        }
                     }
                  }

                  this.aw(5 + -1320249055 * this.ax, -796487229);
               }

               if (this.aq != null) {
                  if (var4 != 283829476) {
                     throw new IllegalStateException();
                  }

                  this.aq[this.ax * -1320249055] = var1;
               }

               if (null != this.aa) {
                  if (var4 != 283829476) {
                     throw new IllegalStateException();
                  }

                  this.aa[this.ax * -1320249055] = var3;
               }

               this.ax += -280220959;
            }
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "gy.at(" + ')');
      }
   }

   public static void ak(vm var0, byte var1) {
      try {
         br var2 = (br)by.ap.ai();
         if (var2 != null) {
            int var3 = -1689308347 * var0.am;
            var0.bw(var2.ap * 2051507171, (byte)59);

            for(int var4 = 0; var4 < var2.aw * -50998507; ++var4) {
               if (var1 >= 27) {
                  throw new IllegalStateException();
               }

               if (var2.aj[var4] != 0) {
                  if (var1 >= 27) {
                     throw new IllegalStateException();
                  }

                  var0.bo(var2.aj[var4], 1170631888);
               } else {
                  try {
                     int var5 = var2.ak[var4];
                     Field var6;
                     int var7;
                     if (var5 == 0) {
                        var6 = var2.ai[var4];
                        var7 = var6.getInt((Object)null);
                        var0.bo(0, -1289305795);
                        var0.bw(var7, (byte)66);
                     } else if (1 == var5) {
                        if (var1 >= 27) {
                           return;
                        }

                        var6 = var2.ai[var4];
                        var6.setInt((Object)null, var2.ay[var4]);
                        var0.bo(0, 694701530);
                     } else if (var5 == 2) {
                        if (var1 >= 27) {
                           throw new IllegalStateException();
                        }

                        var6 = var2.ai[var4];
                        var7 = var6.getModifiers();
                        var0.bo(0, 1902056708);
                        var0.bw(var7, (byte)36);
                     }

                     Method var24;
                     if (3 != var5) {
                        if (4 == var5) {
                           if (var1 >= 27) {
                              throw new IllegalStateException();
                           }

                           var24 = var2.as[var4];
                           var7 = var24.getModifiers();
                           var0.bo(0, 1276291310);
                           var0.bw(var7, (byte)48);
                        }
                     } else {
                        if (var1 >= 27) {
                           return;
                        }

                        var24 = var2.as[var4];
                        byte[][] var25 = var2.ae[var4];
                        Object[] var8 = new Object[var25.length];

                        for(int var9 = 0; var9 < var25.length; ++var9) {
                           ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var25[var9]));
                           var8[var9] = var10.readObject();
                        }

                        Object var26 = var24.invoke((Object)null, var8);
                        if (var26 == null) {
                           if (var1 >= 27) {
                              throw new IllegalStateException();
                           }

                           var0.bo(0, -63881166);
                        } else if (var26 instanceof Number) {
                           if (var1 >= 27) {
                              return;
                           }

                           var0.bo(1, 491130826);
                           var0.bf(((Number)var26).longValue());
                        } else if (var26 instanceof String) {
                           var0.bo(2, 1056765792);
                           var0.be((String)var26, (byte)37);
                        } else {
                           var0.bo(4, -1614454544);
                        }
                     }
                  } catch (ClassNotFoundException var11) {
                     var0.bo(-10, 1401595442);
                  } catch (InvalidClassException var12) {
                     var0.bo(-11, -271662206);
                  } catch (StreamCorruptedException var13) {
                     var0.bo(-12, -1988541933);
                  } catch (OptionalDataException var14) {
                     var0.bo(-13, 1800810944);
                  } catch (IllegalAccessException var15) {
                     var0.bo(-14, -1762607134);
                  } catch (IllegalArgumentException var16) {
                     var0.bo(-15, 1535608543);
                  } catch (InvocationTargetException var17) {
                     var0.bo(-16, 1799081804);
                  } catch (SecurityException var18) {
                     var0.bo(-17, 1302553782);
                  } catch (IOException var19) {
                     var0.bo(-18, 1494041570);
                  } catch (NullPointerException var20) {
                     var0.bo(-19, 807757562);
                  } catch (Exception var21) {
                     var0.bo(-20, -1782811976);
                  } catch (Throwable var22) {
                     var0.bo(-21, 1008837861);
                  }
               }
            }

            var0.dt(var3, -121992435);
            var2.kf();
         }
      } catch (RuntimeException var23) {
         throw tm.aw(var23, "gy.ak(" + ')');
      }
   }
}
