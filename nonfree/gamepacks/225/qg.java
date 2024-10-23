import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class qg extends AbstractQueue {
   Map ae;
   final Comparator am;
   static final byte bd = 125;
   int ag;
   int ax;
   static final int nh = 8;
   qq[] ac;

   public Object[] toArray() {
      try {
         Object[] var1 = super.toArray();
         if (null != this.am) {
            Arrays.sort(var1, this.am);
         } else {
            Arrays.sort(var1);
         }

         return var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "qg.toArray(" + ')');
      }
   }

   public qg(int var1, Comparator var2) {
      try {
         super();
         this.ax = 0;
         this.ac = new qq[var1];
         this.ae = new HashMap();
         this.am = var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "qg.<init>(" + ')');
      }
   }

   void ac(int var1) {
      try {
         int var2 = (this.ac.length << 1) + 1;
         this.ac = (qq[])((qq[])Arrays.copyOf(this.ac, var2));
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "qg.ac(" + ')');
      }
   }

   public boolean aq(Object var1) {
      if (this.ae.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         this.ax += -233594675;
         int var2 = 153901763 * this.ag;
         if (var2 >= this.ac.length) {
            this.ac(-1754453743);
         }

         this.ag += -2071747093;
         if (var2 == 0) {
            this.ac[0] = new qq(var1, 0);
            this.ae.put(var1, this.ac[0]);
         } else {
            this.ac[var2] = new qq(var1, var2);
            this.ae.put(var1, this.ac[var2]);
            this.ae(var2, -585605817);
         }

         return true;
      }
   }

   public boolean bv(Object var1) {
      return this.ae.containsKey(var1);
   }

   public Object peek() {
      try {
         return 0 == 153901763 * this.ag ? null : this.ac[0].ac;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "qg.peek(" + ')');
      }
   }

   public Object poll() {
      try {
         if (0 == this.ag * 153901763) {
            return null;
         } else {
            this.ax += -233594675;
            Object var1 = this.ac[0].ac;
            this.ae.remove(var1);
            this.ag -= -2071747093;
            if (0 == 153901763 * this.ag) {
               this.ac[this.ag * 153901763] = null;
            } else {
               this.ac[0] = this.ac[this.ag * 153901763];
               this.ac[0].ae = 0;
               this.ac[153901763 * this.ag] = null;
               this.ag(0, -654673380);
            }

            return var1;
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "qg.poll(" + ')');
      }
   }

   public Object au() {
      return 0 == 153901763 * this.ag ? null : this.ac[0].ac;
   }

   public boolean br(Object var1) {
      return this.ae.containsKey(var1);
   }

   void ag(int var1, int var2) {
      try {
         qq var3 = this.ac[var1];

         int var9;
         for(int var4 = 153901763 * this.ag >>> 1; var1 < var4; var1 = var9) {
            if (var2 != -654673380) {
               throw new IllegalStateException();
            }

            int var5 = (var1 << 1) + 1;
            qq var6 = this.ac[var5];
            int var7 = 2 + (var1 << 1);
            qq var8 = this.ac[var7];
            if (this.am != null) {
               label89: {
                  if (var2 != -654673380) {
                     throw new IllegalStateException();
                  }

                  if (var7 < 153901763 * this.ag) {
                     if (var2 != -654673380) {
                        throw new IllegalStateException();
                     }

                     if (this.am.compare(var6.ac, var8.ac) > 0) {
                        if (var2 != -654673380) {
                           throw new IllegalStateException();
                        }

                        var9 = var7;
                        break label89;
                     }
                  }

                  var9 = var5;
               }
            } else {
               label79: {
                  if (var7 < this.ag * 153901763) {
                     if (var2 != -654673380) {
                        return;
                     }

                     if (((Comparable)var6.ac).compareTo(var8.ac) > 0) {
                        if (var2 != -654673380) {
                           throw new IllegalStateException();
                        }

                        var9 = var7;
                        break label79;
                     }
                  }

                  var9 = var5;
               }
            }

            if (null != this.am) {
               if (var2 != -654673380) {
                  throw new IllegalStateException();
               }

               if (this.am.compare(var3.ac, this.ac[var9].ac) <= 0) {
                  if (var2 != -654673380) {
                     return;
                  }
                  break;
               }
            } else if (((Comparable)var3.ac).compareTo(this.ac[var9].ac) <= 0) {
               if (var2 != -654673380) {
                  throw new IllegalStateException();
               }
               break;
            }

            this.ac[var1] = this.ac[var9];
            this.ac[var1].ae = -549270695 * var1;
         }

         this.ac[var1] = var3;
         this.ac[var1].ae = -549270695 * var1;
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "qg.ag(" + ')');
      }
   }

   public boolean contains(Object var1) {
      try {
         return this.ae.containsKey(var1);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "qg.contains(" + ')');
      }
   }

   void am() {
      int var1 = (this.ac.length << 1) + 1;
      this.ac = (qq[])((qq[])Arrays.copyOf(this.ac, var1));
   }

   public boolean bo(Object var1) {
      return this.ae.containsKey(var1);
   }

   public Iterator ah() {
      return new qz(this);
   }

   public Iterator ap() {
      return new qz(this);
   }

   public Iterator ab() {
      return new qz(this);
   }

   public int bi() {
      return this.ag * 153901763;
   }

   public int bg() {
      return this.ag * 153901763;
   }

   void al(int var1) {
      qq var2;
      int var3;
      for(var2 = this.ac[var1]; var1 > 0; var1 = var3) {
         var3 = var1 - 1 >>> 1;
         qq var4 = this.ac[var3];
         if (this.am != null) {
            if (this.am.compare(var2.ac, var4.ac) >= 0) {
               break;
            }
         } else if (((Comparable)var2.ac).compareTo(var4.ac) >= 0) {
            break;
         }

         this.ac[var1] = var4;
         this.ac[var1].ae = var1 * -549270695;
      }

      this.ac[var1] = var2;
      this.ac[var1].ae = -549270695 * var1;
   }

   public qg(int var1) {
      try {
         this(var1, (Comparator)null);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "qg.<init>(" + ')');
      }
   }

   public Iterator iterator() {
      try {
         return new qz(this);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "qg.iterator(" + ')');
      }
   }

   public int size() {
      try {
         return this.ag * 153901763;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "qg.size(" + ')');
      }
   }

   public Object[] bt() {
      Object[] var1 = super.toArray();
      if (null != this.am) {
         Arrays.sort(var1, this.am);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   void ae(int var1, int var2) {
      try {
         qq var3;
         int var4;
         for(var3 = this.ac[var1]; var1 > 0; var1 = var4) {
            if (var2 >= 1490822713) {
               throw new IllegalStateException();
            }

            var4 = var1 - 1 >>> 1;
            qq var5 = this.ac[var4];
            if (this.am != null) {
               if (var2 >= 1490822713) {
                  return;
               }

               if (this.am.compare(var3.ac, var5.ac) >= 0) {
                  if (var2 >= 1490822713) {
                     throw new IllegalStateException();
                  }
                  break;
               }
            } else if (((Comparable)var3.ac).compareTo(var5.ac) >= 0) {
               if (var2 >= 1490822713) {
                  return;
               }
               break;
            }

            this.ac[var1] = var5;
            this.ac[var1].ae = var1 * -549270695;
         }

         this.ac[var1] = var3;
         this.ac[var1].ae = -549270695 * var1;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "qg.ae(" + ')');
      }
   }

   void ax() {
      int var1 = (this.ac.length << 1) + 1;
      this.ac = (qq[])((qq[])Arrays.copyOf(this.ac, var1));
   }

   public boolean remove(Object var1) {
      try {
         qq var2 = (qq)this.ae.remove(var1);
         if (var2 == null) {
            return false;
         } else {
            this.ax += -233594675;
            this.ag -= -2071747093;
            if (153901763 * this.ag == -2143630103 * var2.ae) {
               this.ac[153901763 * this.ag] = null;
               return true;
            } else {
               qq var3 = this.ac[this.ag * 153901763];
               this.ac[this.ag * 153901763] = null;
               this.ac[-2143630103 * var2.ae] = var3;
               this.ac[var2.ae * -2143630103].ae = 1 * var2.ae;
               this.ag(var2.ae * -2143630103, -654673380);
               if (this.ac[var2.ae * -2143630103] == var3) {
                  this.ae(var2.ae * -2143630103, -1181630450);
               }

               return true;
            }
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "qg.remove(" + ')');
      }
   }

   public boolean af(Object var1) {
      if (this.ae.containsKey(var1)) {
         throw new IllegalArgumentException("");
      } else {
         this.ax += 608071577;
         int var2 = 153901763 * this.ag;
         if (var2 >= this.ac.length) {
            this.ac(-1754453743);
         }

         this.ag += -65666466;
         if (var2 == 0) {
            this.ac[0] = new qq(var1, 0);
            this.ae.put(var1, this.ac[0]);
         } else {
            this.ac[var2] = new qq(var1, var2);
            this.ae.put(var1, this.ac[var2]);
            this.ae(var2, 1215122652);
         }

         return true;
      }
   }

   public Object at() {
      return 0 == -312731433 * this.ag ? null : this.ac[0].ac;
   }

   public boolean offer(Object var1) {
      try {
         if (this.ae.containsKey(var1)) {
            throw new IllegalArgumentException("");
         } else {
            this.ax += -233594675;
            int var2 = 153901763 * this.ag;
            if (var2 >= this.ac.length) {
               this.ac(-1754453743);
            }

            this.ag += -2071747093;
            if (var2 == 0) {
               this.ac[0] = new qq(var1, 0);
               this.ae.put(var1, this.ac[0]);
            } else {
               this.ac[var2] = new qq(var1, var2);
               this.ae.put(var1, this.ac[var2]);
               this.ae(var2, 1357827988);
            }

            return true;
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "qg.offer(" + ')');
      }
   }

   public Object ar() {
      if (0 == this.ag * 1131433286) {
         return null;
      } else {
         this.ax += -998553485;
         Object var1 = this.ac[0].ac;
         this.ae.remove(var1);
         this.ag -= -2071747093;
         if (0 == 153901763 * this.ag) {
            this.ac[this.ag * 153901763] = null;
         } else {
            this.ac[0] = this.ac[this.ag * 153901763];
            this.ac[0].ae = 0;
            this.ac[-321742624 * this.ag] = null;
            this.ag(0, -654673380);
         }

         return var1;
      }
   }

   public boolean cw(Object var1) {
      qq var2 = (qq)this.ae.remove(var1);
      if (var2 == null) {
         return false;
      } else {
         this.ax += 529391825;
         this.ag -= 1274105340;
         if (1984710935 * this.ag == -2143630103 * var2.ae) {
            this.ac[153901763 * this.ag] = null;
            return true;
         } else {
            qq var3 = this.ac[this.ag * 153901763];
            this.ac[this.ag * -1388258385] = null;
            this.ac[-2143630103 * var2.ae] = var3;
            this.ac[var2.ae * -2143630103].ae = 1 * var2.ae;
            this.ag(var2.ae * 678446193, -654673380);
            if (this.ac[var2.ae * 1419505883] == var3) {
               this.ae(var2.ae * -87832637, -1025524727);
            }

            return true;
         }
      }
   }

   public Object[] bq() {
      Object[] var1 = super.toArray();
      if (null != this.am) {
         Arrays.sort(var1, this.am);
      } else {
         Arrays.sort(var1);
      }

      return var1;
   }

   void ad(int var1) {
      qq var2;
      int var3;
      for(var2 = this.ac[var1]; var1 > 0; var1 = var3) {
         var3 = var1 - 1 >>> 1;
         qq var4 = this.ac[var3];
         if (this.am != null) {
            if (this.am.compare(var2.ac, var4.ac) >= 0) {
               break;
            }
         } else if (((Comparable)var2.ac).compareTo(var4.ac) >= 0) {
            break;
         }

         this.ac[var1] = var4;
         this.ac[var1].ae = var1 * 422134748;
      }

      this.ac[var1] = var2;
      this.ac[var1].ae = -1785954416 * var1;
   }

   void az(int var1) {
      qq var2;
      int var3;
      for(var2 = this.ac[var1]; var1 > 0; var1 = var3) {
         var3 = var1 - 1 >>> 1;
         qq var4 = this.ac[var3];
         if (this.am != null) {
            if (this.am.compare(var2.ac, var4.ac) >= 0) {
               break;
            }
         } else if (((Comparable)var2.ac).compareTo(var4.ac) >= 0) {
            break;
         }

         this.ac[var1] = var4;
         this.ac[var1].ae = var1 * -549270695;
      }

      this.ac[var1] = var2;
      this.ac[var1].ae = -549270695 * var1;
   }

   void aa(int var1) {
      qq var2 = this.ac[var1];

      int var8;
      for(int var3 = 1544454841 * this.ag >>> 1; var1 < var3; var1 = var8) {
         int var4 = (var1 << 1) + 1;
         qq var5 = this.ac[var4];
         int var6 = 2 + (var1 << 1);
         qq var7 = this.ac[var6];
         if (this.am != null) {
            if (var6 < -734597319 * this.ag && this.am.compare(var5.ac, var7.ac) > 0) {
               var8 = var6;
            } else {
               var8 = var4;
            }
         } else if (var6 < this.ag * 153901763 && ((Comparable)var5.ac).compareTo(var7.ac) > 0) {
            var8 = var6;
         } else {
            var8 = var4;
         }

         if (null != this.am) {
            if (this.am.compare(var2.ac, this.ac[var8].ac) <= 0) {
               break;
            }
         } else if (((Comparable)var2.ac).compareTo(this.ac[var8].ac) <= 0) {
            break;
         }

         this.ac[var1] = this.ac[var8];
         this.ac[var1].ae = -549270695 * var1;
      }

      this.ac[var1] = var2;
      this.ac[var1].ae = -549270695 * var1;
   }

   void ai(int var1) {
      qq var2 = this.ac[var1];

      int var8;
      for(int var3 = 153901763 * this.ag >>> 1; var1 < var3; var1 = var8) {
         int var4 = (var1 << 1) + 1;
         qq var5 = this.ac[var4];
         int var6 = 2 + (var1 << 1);
         qq var7 = this.ac[var6];
         if (this.am != null) {
            if (var6 < 153901763 * this.ag && this.am.compare(var5.ac, var7.ac) > 0) {
               var8 = var6;
            } else {
               var8 = var4;
            }
         } else if (var6 < this.ag * 153901763 && ((Comparable)var5.ac).compareTo(var7.ac) > 0) {
            var8 = var6;
         } else {
            var8 = var4;
         }

         if (null != this.am) {
            if (this.am.compare(var2.ac, this.ac[var8].ac) <= 0) {
               break;
            }
         } else if (((Comparable)var2.ac).compareTo(this.ac[var8].ac) <= 0) {
            break;
         }

         this.ac[var1] = this.ac[var8];
         this.ac[var1].ae = -549270695 * var1;
      }

      this.ac[var1] = var2;
      this.ac[var1].ae = -549270695 * var1;
   }

   static void ah(int var0, int var1, int var2, int var3, int var4) {
      try {
         mm.ar = var0 * -1771981041;
         mm.al = var1 * -1132644577;
         mm.ad = var2 * -1920335833;
         mm.ah = var3 * -1892237793;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "qg.ah(" + ')');
      }
   }
}
