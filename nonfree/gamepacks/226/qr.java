import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class qr extends AbstractQueue {
   Map aw;
   final Comparator aj;
   int ak;
   qx[] ap;
   int ai;
   public static final int au = 32768;
   public static final int at = 12;

   void ar(int var1) {
      qx var2;
      int var3;
      for(var2 = this.ap[var1]; var1 > 0; var1 = var3) {
         var3 = var1 - 1 >>> 1;
         qx var4 = this.ap[var3];
         if (null != this.aj) {
            if (this.aj.compare(var2.ap, var4.ap) >= 0) {
               break;
            }
         } else if (((Comparable)var2.ap).compareTo(var4.ap) >= 0) {
            break;
         }

         this.ap[var1] = var4;
         this.ap[var1].aw = -2063281119 * var1;
      }

      this.ap[var1] = var2;
      this.ap[var1].aw = var1 * -2063281119;
   }

   static void gq(dj var0, byte var1) {
      try {
         if (client.ei == var0) {
            if (var1 == 0) {
               throw new IllegalStateException();
            }
         } else {
            client.ei = var0;
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "qr.gq(" + ')');
      }
   }

   void ap(byte var1) {
      try {
         int var2 = (this.ap.length << 1) + 1;
         this.ap = (qx[])((qx[])Arrays.copyOf(this.ap, var2));
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qr.ap(" + ')');
      }
   }

   public int size() {
      try {
         return this.ak * -1757030441;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "qr.size(" + ')');
      }
   }

   public qr(int var1) {
      try {
         this(var1, (Comparator)null);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "qr.<init>(" + ')');
      }
   }

   void az(int var1) {
      qx var2 = this.ap[var1];

      int var8;
      for(int var3 = this.ak * -1757030441 >>> 1; var1 < var3; var1 = var8) {
         int var4 = 1 + (var1 << 1);
         qx var5 = this.ap[var4];
         int var6 = (var1 << 1) + 2;
         qx var7 = this.ap[var6];
         if (this.aj != null) {
            if (var6 < -1292075383 * this.ak && this.aj.compare(var5.ap, var7.ap) > 0) {
               var8 = var6;
            } else {
               var8 = var4;
            }
         } else if (var6 < 1124335155 * this.ak && ((Comparable)var5.ap).compareTo(var7.ap) > 0) {
            var8 = var6;
         } else {
            var8 = var4;
         }

         if (this.aj != null) {
            if (this.aj.compare(var2.ap, this.ap[var8].ap) <= 0) {
               break;
            }
         } else if (((Comparable)var2.ap).compareTo(this.ap[var8].ap) <= 0) {
            break;
         }

         this.ap[var1] = this.ap[var8];
         this.ap[var1].aw = var1 * -1604074117;
      }

      this.ap[var1] = var2;
      this.ap[var1].aw = var1 * -2063281119;
   }

   public Object poll() {
      try {
         if (0 == -1757030441 * this.ak) {
            return null;
         } else {
            this.ai += 1857606751;
            Object var1 = this.ap[0].ap;
            this.aw.remove(var1);
            this.ak -= -143914009;
            if (0 == -1757030441 * this.ak) {
               this.ap[this.ak * -1757030441] = null;
            } else {
               this.ap[0] = this.ap[-1757030441 * this.ak];
               this.ap[0].aw = 0;
               this.ap[-1757030441 * this.ak] = null;
               this.ak(0, (byte)32);
            }

            return var1;
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "qr.poll(" + ')');
      }
   }

   public boolean remove(Object var1) {
      try {
         qx var2 = (qx)this.aw.remove(var1);
         if (null == var2) {
            return false;
         } else {
            this.ai += 1857606751;
            this.ak -= -143914009;
            if (-505434143 * var2.aw == -1757030441 * this.ak) {
               this.ap[this.ak * -1757030441] = null;
               return true;
            } else {
               qx var3 = this.ap[-1757030441 * this.ak];
               this.ap[-1757030441 * this.ak] = null;
               this.ap[-505434143 * var2.aw] = var3;
               this.ap[-505434143 * var2.aw].aw = var2.aw * 1;
               this.ak(var2.aw * -505434143, (byte)41);
               if (var3 == this.ap[var2.aw * -505434143]) {
                  this.aw(var2.aw * -505434143, (byte)-69);
               }

               return true;
            }
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "qr.remove(" + ')');
      }
   }

   void aw(int var1, byte var2) {
      try {
         qx var3;
         int var4;
         for(var3 = this.ap[var1]; var1 > 0; var1 = var4) {
            if (var2 >= 1) {
               throw new IllegalStateException();
            }

            var4 = var1 - 1 >>> 1;
            qx var5 = this.ap[var4];
            if (null != this.aj) {
               if (var2 >= 1) {
                  throw new IllegalStateException();
               }

               if (this.aj.compare(var3.ap, var5.ap) >= 0) {
                  if (var2 >= 1) {
                     throw new IllegalStateException();
                  }
                  break;
               }
            } else if (((Comparable)var3.ap).compareTo(var5.ap) >= 0) {
               if (var2 >= 1) {
                  throw new IllegalStateException();
               }
               break;
            }

            this.ap[var1] = var5;
            this.ap[var1].aw = -2063281119 * var1;
         }

         this.ap[var1] = var3;
         this.ap[var1].aw = var1 * -2063281119;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "qr.aw(" + ')');
      }
   }

   void ak(int var1, byte var2) {
      try {
         qx var3 = this.ap[var1];

         int var9;
         for(int var4 = this.ak * -1757030441 >>> 1; var1 < var4; var1 = var9) {
            if (var2 <= -1) {
               return;
            }

            int var5 = 1 + (var1 << 1);
            qx var6 = this.ap[var5];
            int var7 = (var1 << 1) + 2;
            qx var8 = this.ap[var7];
            if (this.aj != null) {
               label89: {
                  if (var2 <= -1) {
                     return;
                  }

                  if (var7 < -1757030441 * this.ak) {
                     if (var2 <= -1) {
                        return;
                     }

                     if (this.aj.compare(var6.ap, var8.ap) > 0) {
                        if (var2 <= -1) {
                           return;
                        }

                        var9 = var7;
                        break label89;
                     }
                  }

                  var9 = var5;
               }
            } else {
               label73: {
                  if (var7 < -1757030441 * this.ak) {
                     if (var2 <= -1) {
                        throw new IllegalStateException();
                     }

                     if (((Comparable)var6.ap).compareTo(var8.ap) > 0) {
                        if (var2 <= -1) {
                           throw new IllegalStateException();
                        }

                        var9 = var7;
                        break label73;
                     }
                  }

                  var9 = var5;
               }
            }

            if (this.aj != null) {
               if (var2 <= -1) {
                  return;
               }

               if (this.aj.compare(var3.ap, this.ap[var9].ap) <= 0) {
                  break;
               }
            } else if (((Comparable)var3.ap).compareTo(this.ap[var9].ap) <= 0) {
               if (var2 <= -1) {
                  throw new IllegalStateException();
               }
               break;
            }

            this.ap[var1] = this.ap[var9];
            this.ap[var1].aw = var1 * -2063281119;
         }

         this.ap[var1] = var3;
         this.ap[var1].aw = var1 * -2063281119;
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "qr.ak(" + ')');
      }
   }

   public boolean contains(Object var1) {
      try {
         return this.aw.containsKey(var1);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "qr.contains(" + ')');
      }
   }

   public Object[] toArray() {
      try {
         Object[] var1 = super.toArray();
         if (this.aj != null) {
            Arrays.sort(var1, this.aj);
         } else {
            Arrays.sort(var1);
         }

         return var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "qr.toArray(" + ')');
      }
   }

   public Iterator iterator() {
      try {
         return new qz(this);
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "qr.iterator(" + ')');
      }
   }

   public int ba() {
      return this.ak * -1757030441;
   }

   public Object an() {
      return 0 == -1525097500 * this.ak ? null : this.ap[0].ap;
   }

   public Iterator bz() {
      return new qz(this);
   }

   public Object[] bg() {
      Object[] var1 = super.toArray();
      if (this.aj != null) {
         Arrays.sort(var1, this.aj);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   public boolean offer(Object var1) {
      try {
         if (this.aw.containsKey(var1)) {
            throw new IllegalArgumentException("");
         } else {
            this.ai += 1857606751;
            int var2 = -1757030441 * this.ak;
            if (var2 >= this.ap.length) {
               this.ap((byte)71);
            }

            this.ak += -143914009;
            if (0 == var2) {
               this.ap[0] = new qx(var1, 0);
               this.aw.put(var1, this.ap[0]);
            } else {
               this.ap[var2] = new qx(var1, var2);
               this.aw.put(var1, this.ap[var2]);
               this.aw(var2, (byte)-95);
            }

            return true;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qr.offer(" + ')');
      }
   }

   public Object at() {
      return 0 == -1757030441 * this.ak ? null : this.ap[0].ap;
   }

   public boolean bi(Object var1) {
      return this.aw.containsKey(var1);
   }

   public boolean bf(Object var1) {
      return this.aw.containsKey(var1);
   }

   public Iterator bp() {
      return new qz(this);
   }

   public Object[] bl() {
      Object[] var1 = super.toArray();
      if (this.aj != null) {
         Arrays.sort(var1, this.aj);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   public boolean cn(Object var1) {
      qx var2 = (qx)this.aw.remove(var1);
      if (null == var2) {
         return false;
      } else {
         this.ai += 1522576664;
         this.ak -= -954013279;
         if (-1480563602 * var2.aw == -1757030441 * this.ak) {
            this.ap[this.ak * -1757030441] = null;
            return true;
         } else {
            qx var3 = this.ap[934914738 * this.ak];
            this.ap[-1757030441 * this.ak] = null;
            this.ap[-505434143 * var2.aw] = var3;
            this.ap[1332902347 * var2.aw].aw = var2.aw * 1;
            this.ak(var2.aw * -505434143, (byte)46);
            if (var3 == this.ap[var2.aw * -505434143]) {
               this.aw(var2.aw * -174305534, (byte)-109);
            }

            return true;
         }
      }
   }

   public boolean co(Object var1) {
      qx var2 = (qx)this.aw.remove(var1);
      if (null == var2) {
         return false;
      } else {
         this.ai += 1708220201;
         this.ak -= 2130151973;
         if (-505434143 * var2.aw == -1757030441 * this.ak) {
            this.ap[this.ak * -637128966] = null;
            return true;
         } else {
            qx var3 = this.ap[804868230 * this.ak];
            this.ap[1264853762 * this.ak] = null;
            this.ap[1231716002 * var2.aw] = var3;
            this.ap[-505434143 * var2.aw].aw = var2.aw * 1;
            this.ak(var2.aw * -505434143, (byte)25);
            if (var3 == this.ap[var2.aw * 1906167224]) {
               this.aw(var2.aw * 2023078453, (byte)-116);
            }

            return true;
         }
      }
   }

   public boolean cf(Object var1) {
      qx var2 = (qx)this.aw.remove(var1);
      if (null == var2) {
         return false;
      } else {
         this.ai += 1857606751;
         this.ak -= -143914009;
         if (-505434143 * var2.aw == -1757030441 * this.ak) {
            this.ap[this.ak * -1757030441] = null;
            return true;
         } else {
            qx var3 = this.ap[-1757030441 * this.ak];
            this.ap[-1757030441 * this.ak] = null;
            this.ap[-505434143 * var2.aw] = var3;
            this.ap[-505434143 * var2.aw].aw = var2.aw * 1;
            this.ak(var2.aw * -505434143, (byte)81);
            if (var3 == this.ap[var2.aw * -505434143]) {
               this.aw(var2.aw * -505434143, (byte)-13);
            }

            return true;
         }
      }
   }

   public boolean cl(Object var1) {
      qx var2 = (qx)this.aw.remove(var1);
      if (null == var2) {
         return false;
      } else {
         this.ai += -1879141201;
         this.ak -= -1553143874;
         if (-2036934150 * var2.aw == -1757030441 * this.ak) {
            this.ap[this.ak * -1757030441] = null;
            return true;
         } else {
            qx var3 = this.ap[-1757030441 * this.ak];
            this.ap[-1059283131 * this.ak] = null;
            this.ap[-505434143 * var2.aw] = var3;
            this.ap[168128906 * var2.aw].aw = var2.aw * 1;
            this.ak(var2.aw * -505434143, (byte)74);
            if (var3 == this.ap[var2.aw * -505434143]) {
               this.aw(var2.aw * -505434143, (byte)-76);
            }

            return true;
         }
      }
   }

   void aj() {
      int var1 = (this.ap.length << 1) + 1;
      this.ap = (qx[])((qx[])Arrays.copyOf(this.ap, var1));
   }

   void ai() {
      int var1 = (this.ap.length << 1) + 1;
      this.ap = (qx[])((qx[])Arrays.copyOf(this.ap, var1));
   }

   void ay() {
      int var1 = (this.ap.length << 1) + 1;
      this.ap = (qx[])((qx[])Arrays.copyOf(this.ap, var1));
   }

   void as() {
      int var1 = (this.ap.length << 1) + 1;
      this.ap = (qx[])((qx[])Arrays.copyOf(this.ap, var1));
   }

   public Iterator bq() {
      return new qz(this);
   }

   public boolean am(Object var1) {
      if (this.aw.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         this.ai += -2075313294;
         int var2 = 1319436383 * this.ak;
         if (var2 >= this.ap.length) {
            this.ap((byte)93);
         }

         this.ak += -1104632913;
         if (0 == var2) {
            this.ap[0] = new qx(var1, 0);
            this.aw.put(var1, this.ap[0]);
         } else {
            this.ap[var2] = new qx(var1, var2);
            this.aw.put(var1, this.ap[var2]);
            this.aw(var2, (byte)-108);
         }

         return true;
      }
   }

   public int bd() {
      return this.ak * -1757030441;
   }

   public Object au() {
      return 0 == -1757030441 * this.ak ? null : this.ap[0].ap;
   }

   public int bo() {
      return this.ak * -1757030441;
   }

   public Object ao() {
      if (0 == -1757030441 * this.ak) {
         return null;
      } else {
         this.ai += 1857606751;
         Object var1 = this.ap[0].ap;
         this.aw.remove(var1);
         this.ak -= -143914009;
         if (0 == -1757030441 * this.ak) {
            this.ap[this.ak * -1757030441] = null;
         } else {
            this.ap[0] = this.ap[-1757030441 * this.ak];
            this.ap[0].aw = 0;
            this.ap[-1757030441 * this.ak] = null;
            this.ak(0, (byte)71);
         }

         return var1;
      }
   }

   void af(int var1) {
      qx var2;
      int var3;
      for(var2 = this.ap[var1]; var1 > 0; var1 = var3) {
         var3 = var1 - 1 >>> 1;
         qx var4 = this.ap[var3];
         if (null != this.aj) {
            if (this.aj.compare(var2.ap, var4.ap) >= 0) {
               break;
            }
         } else if (((Comparable)var2.ap).compareTo(var4.ap) >= 0) {
            break;
         }

         this.ap[var1] = var4;
         this.ap[var1].aw = -2063281119 * var1;
      }

      this.ap[var1] = var2;
      this.ap[var1].aw = var1 * -2063281119;
   }

   public Object peek() {
      try {
         return 0 == -1757030441 * this.ak ? null : this.ap[0].ap;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "qr.peek(" + ')');
      }
   }

   void ab(int var1) {
      qx var2 = this.ap[var1];

      int var8;
      for(int var3 = this.ak * -1757030441 >>> 1; var1 < var3; var1 = var8) {
         int var4 = 1 + (var1 << 1);
         qx var5 = this.ap[var4];
         int var6 = (var1 << 1) + 2;
         qx var7 = this.ap[var6];
         if (this.aj != null) {
            if (var6 < -910258654 * this.ak && this.aj.compare(var5.ap, var7.ap) > 0) {
               var8 = var6;
            } else {
               var8 = var4;
            }
         } else if (var6 < 1830169615 * this.ak && ((Comparable)var5.ap).compareTo(var7.ap) > 0) {
            var8 = var6;
         } else {
            var8 = var4;
         }

         if (this.aj != null) {
            if (this.aj.compare(var2.ap, this.ap[var8].ap) <= 0) {
               break;
            }
         } else if (((Comparable)var2.ap).compareTo(this.ap[var8].ap) <= 0) {
            break;
         }

         this.ap[var1] = this.ap[var8];
         this.ap[var1].aw = var1 * 869419600;
      }

      this.ap[var1] = var2;
      this.ap[var1].aw = var1 * -2063281119;
   }

   void ag(int var1) {
      qx var2 = this.ap[var1];

      int var8;
      for(int var3 = this.ak * -1757030441 >>> 1; var1 < var3; var1 = var8) {
         int var4 = 1 + (var1 << 1);
         qx var5 = this.ap[var4];
         int var6 = (var1 << 1) + 2;
         qx var7 = this.ap[var6];
         if (this.aj != null) {
            if (var6 < -1757030441 * this.ak && this.aj.compare(var5.ap, var7.ap) > 0) {
               var8 = var6;
            } else {
               var8 = var4;
            }
         } else if (var6 < -1757030441 * this.ak && ((Comparable)var5.ap).compareTo(var7.ap) > 0) {
            var8 = var6;
         } else {
            var8 = var4;
         }

         if (this.aj != null) {
            if (this.aj.compare(var2.ap, this.ap[var8].ap) <= 0) {
               break;
            }
         } else if (((Comparable)var2.ap).compareTo(this.ap[var8].ap) <= 0) {
            break;
         }

         this.ap[var1] = this.ap[var8];
         this.ap[var1].aw = var1 * -2063281119;
      }

      this.ap[var1] = var2;
      this.ap[var1].aw = var1 * -2063281119;
   }

   public qr(int var1, Comparator var2) {
      try {
         super();
         this.ai = 0;
         this.ap = new qx[var1];
         this.aw = new HashMap();
         this.aj = var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "qr.<init>(" + ')');
      }
   }

   public boolean ae(Object var1) {
      if (this.aw.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         this.ai += 1857606751;
         int var2 = -1757030441 * this.ak;
         if (var2 >= this.ap.length) {
            this.ap((byte)45);
         }

         this.ak += -143914009;
         if (0 == var2) {
            this.ap[0] = new qx(var1, 0);
            this.aw.put(var1, this.ap[0]);
         } else {
            this.ap[var2] = new qx(var1, var2);
            this.aw.put(var1, this.ap[var2]);
            this.aw(var2, (byte)-78);
         }

         return true;
      }
   }
}
