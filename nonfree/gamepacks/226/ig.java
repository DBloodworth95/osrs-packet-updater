public class ig {
   public int as;
   static final int aw = 1;
   public String aj;
   public int ay;
   public float[] ai;
   static final int ak = 2;
   public int ae;
   static final int ap = 0;
   // $FF: synthetic field
   final ik this$0;
   static final String hu = "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play";
   static final int ah = 28;

   static da ak(int var0, int var1, int var2) {
      try {
         da var3 = (da)da.ap.ap((long)(var0 << 16));
         if (null != var3) {
            if (var2 <= 1283703355) {
               throw new IllegalStateException();
            } else {
               return var3;
            }
         } else {
            String var4 = String.valueOf(var0);
            int var5 = aw.fl.cf(var4, (byte)113);
            if (-1 == var5) {
               return null;
            } else {
               byte[] var6 = aw.fl.bf(var5, 1370706350);
               if (null != var6) {
                  if (var2 <= 1283703355) {
                     throw new IllegalStateException();
                  }

                  if (var6.length <= 1) {
                     if (var2 <= 1283703355) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }

                  var3 = dm.aj(var6, 1816210683);
                  if (null != var3) {
                     if (var2 <= 1283703355) {
                        throw new IllegalStateException();
                     }

                     da.ap.ak(var3, (long)(var0 << 16));
                     return var3;
                  }
               }

               return null;
            }
         }
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "ig.ak(" + ')');
      }
   }

   ig(ik var1) {
      try {
         this.this$0 = var1;
         super();
         this.ai = new float[4];
         this.ay = -1198962889;
         this.as = 1623718193;
         this.ae = 0;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ig.<init>(" + ')');
      }
   }
}
