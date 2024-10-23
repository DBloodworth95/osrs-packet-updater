public abstract class sa extends lj implements vn {
   public Object ar(int var1) {
      sz var2 = this.ac(var1, (byte)16);
      return var2 != null && var2.aq(1924665804) ? var2.af(-1168353405) : null;
   }

   protected sa(ob var1, px var2, int var3) {
      try {
         super(var1, var2, var3);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "sa.<init>(" + ')');
      }
   }

   public int ae(int var1) {
      try {
         return 935359149 * this.ac;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "sa.ae(" + ')');
      }
   }

   public vu am(vf var1, int var2) {
      try {
         int var3 = var1.ct(-1756560510);
         sz var4 = this.ac(var3, (byte)16);
         vu var5 = new vu(var3);
         Class var6 = var4.ac.aq;
         if (Integer.class == var6) {
            var5.ae = var1.cz(-1734056172);
         } else if (Long.class == var6) {
            if (var2 == 115042309) {
               throw new IllegalStateException();
            }

            var5.ae = var1.cw(1694207030);
         } else if (String.class == var6) {
            var5.ae = var1.cp(-1147019783);
         } else {
            if (!vb.class.isAssignableFrom(var6)) {
               throw new IllegalStateException();
            }

            if (var2 == 115042309) {
               throw new IllegalStateException();
            }

            try {
               vb var7 = (vb)var6.newInstance();
               var7.ac(var1, (byte)-85);
               var5.ae = var7;
            } catch (InstantiationException var8) {
            } catch (IllegalAccessException var9) {
            }
         }

         return var5;
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "sa.am(" + ')');
      }
   }

   public Object ag(int var1, int var2) {
      try {
         sz var3 = this.ac(var1, (byte)16);
         if (var3 != null) {
            if (var2 == 1171636073) {
               throw new IllegalStateException();
            }

            if (var3.aq(708987122)) {
               return var3.af(224182011);
            }

            if (var2 == 1171636073) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "sa.ag(" + ')');
      }
   }

   protected abstract sz ax(int var1);

   protected abstract sz aq(int var1);

   public int af() {
      return 935359149 * this.ac;
   }

   public Object al(int var1) {
      sz var2 = this.ac(var1, (byte)16);
      return var2 != null && var2.aq(844318872) ? var2.af(-1162294471) : null;
   }

   public int au() {
      return 412870122 * this.ac;
   }

   public int at() {
      return -1518263487 * this.ac;
   }

   public Object ad(int var1) {
      sz var2 = this.ac(var1, (byte)16);
      return var2 != null && var2.aq(-556438102) ? var2.af(518877935) : null;
   }

   protected abstract sz ac(int var1, byte var2);

   public vu az(vf var1) {
      int var2 = var1.ct(-1618364170);
      sz var3 = this.ac(var2, (byte)16);
      vu var4 = new vu(var2);
      Class var5 = var3.ac.aq;
      if (Integer.class == var5) {
         var4.ae = var1.cz(-1734056172);
      } else if (Long.class == var5) {
         var4.ae = var1.cw(272460872);
      } else if (String.class == var5) {
         var4.ae = var1.cp(-1147019783);
      } else {
         if (!vb.class.isAssignableFrom(var5)) {
            throw new IllegalStateException();
         }

         try {
            vb var6 = (vb)var5.newInstance();
            var6.ac(var1, (byte)-28);
            var4.ae = var6;
         } catch (InstantiationException var7) {
         } catch (IllegalAccessException var8) {
         }
      }

      return var4;
   }
}
