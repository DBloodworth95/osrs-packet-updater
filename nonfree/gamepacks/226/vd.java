import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class vd extends tp {
   static final int ap = 0;
   public static final int aw = 0;
   public static final int ar = 11;
   List ai;
   ui[] aj;

   public vd(pe var1, int var2) {
      try {
         super();
         byte[] var3 = var1.bm(var2, 0, 864500564);
         this.ap(new vl(var3), (byte)-95);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "vd.<init>(" + ')');
      }
   }

   public vd(pe var1, int var2, int var3) {
      try {
         super();
         byte[] var4 = var1.bm(var2, var3 + 1, 1203893609);
         this.ap(new vl(var4), (byte)-72);
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "vd.<init>(" + ')');
      }
   }

   void ap(vl var1, byte var2) {
      try {
         int var3 = var1.dg(-431457556);
         this.aj = new ui[var3];
         this.ai = new ArrayList(var3);

         for(int var4 = 0; var4 < var3; ++var4) {
            if (var2 >= 4) {
               return;
            }

            this.aj[var4] = (ui)gu.ap(ui.ap((byte)32), var1.cy((short)-1410), -1875781163);
            int var5 = var1.dg(-431457556);
            HashMap var6 = new HashMap(var5);

            while(var5-- > 0) {
               if (var2 >= 4) {
                  throw new IllegalStateException();
               }

               Object var7 = this.aj[var4].ay(var1, (byte)1);
               int var8 = var1.dg(-431457556);
               ArrayList var9 = new ArrayList();

               while(var8-- > 0) {
                  int var10 = var1.dg(-431457556);
                  var9.add(var10);
               }

               var6.put(var7, var9);
            }

            this.ai.add(var4, var6);
         }

      } catch (RuntimeException var11) {
         throw tm.aw(var11, "vd.ap(" + ')');
      }
   }

   public List aw(Object var1, int var2, int var3) {
      try {
         if (var2 < 0) {
            var2 = 0;
         }

         Map var4 = (Map)this.ai.get(var2);
         return (List)var4.get(var1);
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "vd.aw(" + ')');
      }
   }

   void ak(vl var1) {
      int var2 = var1.dg(-431457556);
      this.aj = new ui[var2];
      this.ai = new ArrayList(var2);

      for(int var3 = 0; var3 < var2; ++var3) {
         this.aj[var3] = (ui)gu.ap(ui.ap((byte)58), var1.cy((short)-8108), -1875781163);
         int var4 = var1.dg(-431457556);
         HashMap var5 = new HashMap(var4);

         while(var4-- > 0) {
            Object var6 = this.aj[var3].ay(var1, (byte)1);
            int var7 = var1.dg(-431457556);
            ArrayList var8 = new ArrayList();

            while(var7-- > 0) {
               int var9 = var1.dg(-431457556);
               var8.add(var9);
            }

            var5.put(var6, var8);
         }

         this.ai.add(var3, var5);
      }

   }

   void aj(vl var1) {
      int var2 = var1.dg(-431457556);
      this.aj = new ui[var2];
      this.ai = new ArrayList(var2);

      for(int var3 = 0; var3 < var2; ++var3) {
         this.aj[var3] = (ui)gu.ap(ui.ap((byte)60), var1.cy((short)-28459), -1875781163);
         int var4 = var1.dg(-431457556);
         HashMap var5 = new HashMap(var4);

         while(var4-- > 0) {
            Object var6 = this.aj[var3].ay(var1, (byte)1);
            int var7 = var1.dg(-431457556);
            ArrayList var8 = new ArrayList();

            while(var7-- > 0) {
               int var9 = var1.dg(-431457556);
               var8.add(var9);
            }

            var5.put(var6, var8);
         }

         this.ai.add(var3, var5);
      }

   }

   void ai(vl var1) {
      int var2 = var1.dg(-431457556);
      this.aj = new ui[var2];
      this.ai = new ArrayList(var2);

      for(int var3 = 0; var3 < var2; ++var3) {
         this.aj[var3] = (ui)gu.ap(ui.ap((byte)97), var1.cy((short)-4593), -1875781163);
         int var4 = var1.dg(-431457556);
         HashMap var5 = new HashMap(var4);

         while(var4-- > 0) {
            Object var6 = this.aj[var3].ay(var1, (byte)1);
            int var7 = var1.dg(-431457556);
            ArrayList var8 = new ArrayList();

            while(var7-- > 0) {
               int var9 = var1.dg(-431457556);
               var8.add(var9);
            }

            var5.put(var6, var8);
         }

         this.ai.add(var3, var5);
      }

   }

   public List ay(Object var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      Map var3 = (Map)this.ai.get(var2);
      return (List)var3.get(var1);
   }

   public List as(Object var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      Map var3 = (Map)this.ai.get(var2);
      return (List)var3.get(var1);
   }
}
