public abstract class tl extends la implements vj {
   public static int[] ai;

   public Object ar(int var1) {
      tv var2 = this.ap(var1, (byte)24);
      return var2 != null && var2.as(-1480903491) ? var2.ae(-1606353224) : null;
   }

   protected tl(oy var1, pn var2, int var3) {
      try {
         super(var1, var2, var3);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "tl.<init>(" + ')');
      }
   }

   public int at() {
      return this.ap * 1445047783;
   }

   protected abstract tv ap(int var1, byte var2);

   public va aj(vl var1, int var2) {
      try {
         int var3 = var1.ce(665117658);
         tv var4 = this.ap(var3, (byte)-3);
         va var5 = new va(var3);
         Class var6 = var4.ap.ay;
         if (Integer.class == var6) {
            var5.aw = var1.ch(1203709469);
         } else if (Long.class == var6) {
            if (var2 == 1496765350) {
               throw new IllegalStateException();
            }

            var5.aw = var1.ct((byte)-121);
         } else if (String.class == var6) {
            if (var2 == 1496765350) {
               throw new IllegalStateException();
            }

            var5.aw = var1.ca(-1320290011);
         } else {
            if (!vs.class.isAssignableFrom(var6)) {
               throw new IllegalStateException();
            }

            if (var2 == 1496765350) {
               throw new IllegalStateException();
            }

            try {
               vs var7 = (vs)var6.newInstance();
               var7.ap(var1, -1921657632);
               var5.aw = var7;
            } catch (InstantiationException var8) {
            } catch (IllegalAccessException var9) {
            }
         }

         return var5;
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "tl.aj(" + ')');
      }
   }

   protected abstract tv ai(int var1);

   public Object ak(int var1, byte var2) {
      try {
         tv var3 = this.ap(var1, (byte)-99);
         if (var3 != null) {
            if (var2 == 29) {
               throw new IllegalStateException();
            }

            if (var3.as(-1935826085)) {
               return var3.ae(-1606353224);
            }

            if (var2 == 29) {
               throw new IllegalStateException();
            }
         }

         return null;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "tl.ak(" + ')');
      }
   }

   protected abstract tv as(int var1);

   protected abstract tv am(int var1);

   protected abstract tv ay(int var1);

   public int aw(byte var1) {
      try {
         return this.ap * 1445047783;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "tl.aw(" + ')');
      }
   }

   public int au() {
      return this.ap * 1445047783;
   }

   public int an() {
      return this.ap * 1445047783;
   }

   public Object ao(int var1) {
      tv var2 = this.ap(var1, (byte)-69);
      return var2 != null && var2.as(-1819057543) ? var2.ae(-1606353224) : null;
   }

   public Object af(int var1) {
      tv var2 = this.ap(var1, (byte)-12);
      return var2 != null && var2.as(431211705) ? var2.ae(-1606353224) : null;
   }

   protected abstract tv ae(int var1);

   public va ab(vl var1) {
      int var2 = var1.ce(1107689410);
      tv var3 = this.ap(var2, (byte)35);
      va var4 = new va(var2);
      Class var5 = var3.ap.ay;
      if (Integer.class == var5) {
         var4.aw = var1.ch(1203709469);
      } else if (Long.class == var5) {
         var4.aw = var1.ct((byte)-82);
      } else if (String.class == var5) {
         var4.aw = var1.ca(288619564);
      } else {
         if (!vs.class.isAssignableFrom(var5)) {
            throw new IllegalStateException();
         }

         try {
            vs var6 = (vs)var5.newInstance();
            var6.ap(var1, -1967281836);
            var4.aw = var6;
         } catch (InstantiationException var7) {
         } catch (IllegalAccessException var8) {
         }
      }

      return var4;
   }

   public va az(vl var1) {
      int var2 = var1.ce(1747757815);
      tv var3 = this.ap(var2, (byte)-62);
      va var4 = new va(var2);
      Class var5 = var3.ap.ay;
      if (Integer.class == var5) {
         var4.aw = var1.ch(1203709469);
      } else if (Long.class == var5) {
         var4.aw = var1.ct((byte)-28);
      } else if (String.class == var5) {
         var4.aw = var1.ca(-166599139);
      } else {
         if (!vs.class.isAssignableFrom(var5)) {
            throw new IllegalStateException();
         }

         try {
            vs var6 = (vs)var5.newInstance();
            var6.ap(var1, -2002351304);
            var4.aw = var6;
         } catch (InstantiationException var7) {
         } catch (IllegalAccessException var8) {
         }
      }

      return var4;
   }
}
