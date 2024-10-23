import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class uv extends tr {
   public static final int ag = 0;
   static final String hg = "JX_DISPLAY_NAME";
   ux[] am;
   List ax;
   static final int ac = 0;

   public uv(po var1, int var2, int var3) {
      try {
         super();
         byte[] var4 = var1.bt(var2, var3 + 1, (byte)-97);
         this.ac(new vf(var4), 1940228773);
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "uv.<init>(" + ')');
      }
   }

   public uv(po var1, int var2) {
      try {
         super();
         byte[] var3 = var1.bt(var2, 0, (byte)-76);
         this.ac(new vf(var3), 257419623);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "uv.<init>(" + ')');
      }
   }

   void ac(vf var1, int var2) {
      try {
         int var3 = var1.dl(-1294228671);
         this.am = new ux[var3];
         this.ax = new ArrayList(var3);

         for(int var4 = 0; var4 < var3; ++var4) {
            if (var2 == -283787746) {
               throw new IllegalStateException();
            }

            this.am[var4] = (ux)ox.ac(ux.ax(-616009013), var1.cv(952452697), 1704029644);
            int var5 = var1.dl(-1933268106);
            HashMap var6 = new HashMap(var5);

            while(var5-- > 0) {
               if (var2 == -283787746) {
                  throw new IllegalStateException();
               }

               Object var7 = this.am[var4].at(var1, -956522265);
               int var8 = var1.dl(-688976884);
               ArrayList var9 = new ArrayList();

               while(var8-- > 0) {
                  if (var2 == -283787746) {
                     throw new IllegalStateException();
                  }

                  int var10 = var1.dl(-1734556908);
                  var9.add(var10);
               }

               var6.put(var7, var9);
            }

            this.ax.add(var4, var6);
         }

      } catch (RuntimeException var11) {
         throw vk.ae(var11, "uv.ac(" + ')');
      }
   }

   void ag(vf var1) {
      int var2 = var1.dl(-752051412);
      this.am = new ux[var2];
      this.ax = new ArrayList(var2);

      for(int var3 = 0; var3 < var2; ++var3) {
         this.am[var3] = (ux)ox.ac(ux.ax(1772865422), var1.cv(952452697), 1418044002);
         int var4 = var1.dl(-961826489);
         HashMap var5 = new HashMap(var4);

         while(var4-- > 0) {
            Object var6 = this.am[var3].at(var1, 840421778);
            int var7 = var1.dl(-1562679862);
            ArrayList var8 = new ArrayList();

            while(var7-- > 0) {
               int var9 = var1.dl(-845595615);
               var8.add(var9);
            }

            var5.put(var6, var8);
         }

         this.ax.add(var3, var5);
      }

   }

   public List aq(Object var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      Map var3 = (Map)this.ax.get(var2);
      return (List)var3.get(var1);
   }

   void am(vf var1) {
      int var2 = var1.dl(-1935300915);
      this.am = new ux[var2];
      this.ax = new ArrayList(var2);

      for(int var3 = 0; var3 < var2; ++var3) {
         this.am[var3] = (ux)ox.ac(ux.ax(1579248889), var1.cv(952452697), 317683779);
         int var4 = var1.dl(-1645419047);
         HashMap var5 = new HashMap(var4);

         while(var4-- > 0) {
            Object var6 = this.am[var3].at(var1, -10319167);
            int var7 = var1.dl(-1922337118);
            ArrayList var8 = new ArrayList();

            while(var7-- > 0) {
               int var9 = var1.dl(-887374982);
               var8.add(var9);
            }

            var5.put(var6, var8);
         }

         this.ax.add(var3, var5);
      }

   }

   public List ae(Object var1, int var2, byte var3) {
      try {
         if (var2 < 0) {
            if (var3 >= 4) {
               throw new IllegalStateException();
            }

            var2 = 0;
         }

         Map var4 = (Map)this.ax.get(var2);
         return (List)var4.get(var1);
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "uv.ae(" + ')');
      }
   }

   public List ax(Object var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      Map var3 = (Map)this.ax.get(var2);
      return (List)var3.get(var1);
   }
}
