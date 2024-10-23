import java.util.Comparator;

public abstract class se implements Comparator {
   Comparator ae;
   public static final int am = 1400;

   final void ad(Comparator var1) {
      if (null == this.ae) {
         this.ae = var1;
      } else if (this.ae instanceof se) {
         ((se)this.ae).au(var1, 2124883057);
      }

   }

   final void au(Comparator var1, int var2) {
      try {
         if (null == this.ae) {
            this.ae = var1;
         } else if (this.ae instanceof se) {
            if (var2 <= 1664878975) {
               throw new IllegalStateException();
            }

            ((se)this.ae).au(var1, 1923642812);
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "se.au(" + ')');
      }
   }

   final void al(Comparator var1) {
      if (null == this.ae) {
         this.ae = var1;
      } else if (this.ae instanceof se) {
         ((se)this.ae).au(var1, 2007252766);
      }

   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "se.equals(" + ')');
      }
   }

   public boolean gn(Object var1) {
      return super.equals(var1);
   }

   public boolean gg(Object var1) {
      return super.equals(var1);
   }

   protected final int ah(ss var1, ss var2) {
      return this.ae == null ? 0 : this.ae.compare(var1, var2);
   }

   protected final int ar(ss var1, ss var2, byte var3) {
      try {
         if (this.ae == null) {
            if (var3 == 33) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            return this.ae.compare(var1, var2);
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "se.ar(" + ')');
      }
   }

   protected se() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "se.<init>(" + ')');
      }
   }

   public static vv ag(po var0, int var1, int var2, int var3) {
      try {
         if (!tb.au(var0, var1, var2, (short)180)) {
            if (var3 != -605515595) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            vv var5 = new vv();
            var5.aq = vp.ae * -1267556917;
            var5.af = -1551354163 * vp.ag;
            var5.am = rg.am[0];
            var5.ax = dp.ax[0];
            var5.ae = pp.aq[0];
            var5.ag = kj.af[0];
            int var6 = var5.ae * var5.ag;
            byte[] var7 = nq.au[0];
            var5.ac = new int[var6];

            for(int var8 = 0; var8 < var6; ++var8) {
               if (var3 != -605515595) {
                  throw new IllegalStateException();
               }

               var5.ac[var8] = vp.at[var7[var8] & 255];
            }

            fx.al((byte)16);
            return var5;
         }
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "se.ag(" + ')');
      }
   }
}
