import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class lq extends kp {
   List ab;
   HashSet ar;
   static final int nv = 1;
   HashSet af;

   void cj(vl var1, vl var2, int var3, boolean var4) {
      this.ap(var1, var3, 1977584076);
      int var5 = var2.ce(466084027);
      this.af = new HashSet(var5);

      int var6;
      for(var6 = 0; var6 < var5; ++var6) {
         kw var7 = new kw();

         try {
            var7.ap(var2, (byte)118);
         } catch (IllegalStateException var11) {
            continue;
         }

         this.af.add(var7);
      }

      var6 = var2.ce(958659029);
      this.ar = new HashSet(var6);

      for(int var12 = 0; var12 < var6; ++var12) {
         lf var8 = new lf();

         try {
            var8.ap(var2, 1169108373);
         } catch (IllegalStateException var10) {
            continue;
         }

         this.ar.add(var8);
      }

      this.cc(var2, var4, (byte)96);
   }

   void ct(vl var1, vl var2, int var3, boolean var4, byte var5) {
      try {
         this.ap(var1, var3, 422849717);
         int var6 = var2.ce(925846153);
         this.af = new HashSet(var6);

         int var7;
         for(var7 = 0; var7 < var6; ++var7) {
            if (var5 <= 1) {
               return;
            }

            kw var8 = new kw();

            try {
               var8.ap(var2, (byte)101);
            } catch (IllegalStateException var12) {
               continue;
            }

            this.af.add(var8);
         }

         var7 = var2.ce(1450519016);
         this.ar = new HashSet(var7);

         for(int var14 = 0; var14 < var7; ++var14) {
            lf var9 = new lf();

            try {
               var9.ap(var2, 1031275840);
            } catch (IllegalStateException var11) {
               continue;
            }

            this.ar.add(var9);
         }

         this.cc(var2, var4, (byte)90);
      } catch (RuntimeException var13) {
         throw tm.aw(var13, "lq.ct(" + ')');
      }
   }

   void cc(vl var1, boolean var2, byte var3) {
      try {
         this.ab = new LinkedList();
         int var4 = var1.ce(1799506867);

         for(int var5 = 0; var5 < var4; ++var5) {
            if (var3 <= 1) {
               throw new IllegalStateException();
            }

            int var6 = var1.dr(502659);
            nn var7 = new nn(var1.ch(1203709469));
            boolean var10000;
            if (var1.cy((short)-26183) == 1) {
               if (var3 <= 1) {
                  throw new IllegalStateException();
               }

               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var8 = var10000;
            if (!var2) {
               if (var3 <= 1) {
                  return;
               }

               if (var8) {
                  continue;
               }

               if (var3 <= 1) {
                  throw new IllegalStateException();
               }
            }

            this.ab.add(new lh((nn)null, var7, var6, (lp)null));
         }

      } catch (RuntimeException var9) {
         throw tm.aw(var9, "lq.cc(" + ')');
      }
   }

   void cw(vl var1, boolean var2) {
      this.ab = new LinkedList();
      int var3 = var1.ce(1585037793);

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var1.dr(502659);
         nn var6 = new nn(var1.ch(1203709469));
         boolean var7 = var1.cy((short)-3406) == 1;
         if (var2 || !var7) {
            this.ab.add(new lh((nn)null, var6, var5, (lp)null));
         }
      }

   }

   void cm(vl var1, vl var2, int var3, boolean var4) {
      this.ap(var1, var3, 913411740);
      int var5 = var2.ce(2067949950);
      this.af = new HashSet(var5);

      int var6;
      for(var6 = 0; var6 < var5; ++var6) {
         kw var7 = new kw();

         try {
            var7.ap(var2, (byte)114);
         } catch (IllegalStateException var11) {
            continue;
         }

         this.af.add(var7);
      }

      var6 = var2.ce(1594259133);
      this.ar = new HashSet(var6);

      for(int var12 = 0; var12 < var6; ++var12) {
         lf var8 = new lf();

         try {
            var8.ap(var2, -685823141);
         } catch (IllegalStateException var10) {
            continue;
         }

         this.ar.add(var8);
      }

      this.cc(var2, var4, (byte)103);
   }

   lq() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "lq.<init>(" + ')');
      }
   }
}
