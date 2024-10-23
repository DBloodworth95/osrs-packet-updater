public class ia extends ie {
   long ap;

   public int ae(int var1, int var2) {
      long var3 = (long)var2 * 1000000L;
      long var5 = this.ap * 7611630663651066017L - System.nanoTime();
      if (var5 < var3) {
         var5 = var3;
      }

      ct.ap(var5 / 1000000L);
      long var7 = System.nanoTime();

      int var9;
      for(var9 = 0; var9 < 10 && (var9 < 1 || this.ap * 7611630663651066017L < var7); this.ap += (long)var1 * 6150547023426148928L) {
         ++var9;
      }

      if (this.ap * 7611630663651066017L < var7) {
         this.ap = -7650928527976602783L * var7;
      }

      return var9;
   }

   public void ap(int var1) {
      try {
         this.ap = System.nanoTime() * -7650928527976602783L;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ia.ap(" + ')');
      }
   }

   public int aw(int var1, int var2, byte var3) {
      try {
         long var4 = (long)var2 * 1000000L;
         long var6 = this.ap * 7611630663651066017L - System.nanoTime();
         if (var6 < var4) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            var6 = var4;
         }

         ct.ap(var6 / 1000000L);
         long var8 = System.nanoTime();

         int var10;
         for(var10 = 0; var10 < 10; this.ap += (long)var1 * 6150547023426148928L) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            if (var10 >= 1) {
               if (var3 == 0) {
                  throw new IllegalStateException();
               }

               if (this.ap * 7611630663651066017L >= var8) {
                  break;
               }

               if (var3 == 0) {
                  throw new IllegalStateException();
               }
            }

            ++var10;
         }

         if (this.ap * 7611630663651066017L < var8) {
            if (var3 == 0) {
               throw new IllegalStateException();
            }

            this.ap = -7650928527976602783L * var8;
         }

         return var10;
      } catch (RuntimeException var11) {
         throw tm.aw(var11, "ia.aw(" + ')');
      }
   }

   public void ak() {
      this.ap = System.nanoTime() * -7650928527976602783L;
   }

   public void aj() {
      this.ap = System.nanoTime() * -7650928527976602783L;
   }

   public void ai() {
      this.ap = System.nanoTime() * -7650928527976602783L;
   }

   ia() {
      try {
         super();
         this.ap = System.nanoTime() * -7650928527976602783L;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ia.<init>(" + ')');
      }
   }

   public int as(int var1, int var2) {
      long var3 = (long)var2 * 1000000L;
      long var5 = this.ap * 7611630663651066017L - System.nanoTime();
      if (var5 < var3) {
         var5 = var3;
      }

      ct.ap(var5 / 1000000L);
      long var7 = System.nanoTime();

      int var9;
      for(var9 = 0; var9 < 10 && (var9 < 1 || this.ap * 7611630663651066017L < var7); this.ap += (long)var1 * 6150547023426148928L) {
         ++var9;
      }

      if (this.ap * 7611630663651066017L < var7) {
         this.ap = -7650928527976602783L * var7;
      }

      return var9;
   }

   public void ay() {
      this.ap = System.nanoTime() * -7650928527976602783L;
   }

   public int am(int var1, int var2) {
      long var3 = (long)var2 * 1000000L;
      long var5 = this.ap * 7611630663651066017L - System.nanoTime();
      if (var5 < var3) {
         var5 = var3;
      }

      ct.ap(var5 / 1000000L);
      long var7 = System.nanoTime();

      int var9;
      for(var9 = 0; var9 < 10 && (var9 < 1 || this.ap * 7611630663651066017L < var7); this.ap += (long)var1 * 6150547023426148928L) {
         ++var9;
      }

      if (this.ap * 7611630663651066017L < var7) {
         this.ap = -7650928527976602783L * var7;
      }

      return var9;
   }
}
