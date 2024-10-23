import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class pt {
   public static final int aq = 8;
   public static Comparator aj;
   public static Comparator ak;
   static final int av = 21;
   public static Comparator ai;
   static final int af = 16;
   public final List ap;
   public static Comparator aw = new pc();

   static {
      new pr();
      ak = new pp();
      aj = new pq();
      ai = new pw();
   }

   public void ap(Comparator var1, boolean var2, int var3) {
      try {
         if (var2) {
            if (var3 == -1698896929) {
               throw new IllegalStateException();
            }

            Collections.sort(this.ap, var1);
         } else {
            Collections.sort(this.ap, Collections.reverseOrder(var1));
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "pt.ap(" + ')');
      }
   }

   public void ak(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.ap, var1);
      } else {
         Collections.sort(this.ap, Collections.reverseOrder(var1));
      }

   }

   public void aw(Comparator var1, boolean var2) {
      if (var2) {
         Collections.sort(this.ap, var1);
      } else {
         Collections.sort(this.ap, Collections.reverseOrder(var1));
      }

   }

   public pt(vl var1, boolean var2) {
      try {
         super();
         int var3 = var1.ce(616982317);
         boolean var4 = var1.cy((short)-21939) == 1;
         byte var5;
         if (var4) {
            var5 = 1;
         } else {
            var5 = 0;
         }

         int var6 = var1.ce(899126816);
         this.ap = new ArrayList(var6);

         for(int var7 = 0; var7 < var6; ++var7) {
            this.ap.add(new pv(var1, var5, var3));
         }

      } catch (RuntimeException var8) {
         throw tm.aw(var8, "pt.<init>(" + ')');
      }
   }
}
