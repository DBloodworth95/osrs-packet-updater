import java.util.Iterator;

public class ob implements ps {
   public static final ob ax = new ob("game5", "Game 5", 4);
   public static final ob ac = new ob("runescape", "RuneScape", 0);
   public static final ob ag = new ob("game3", "Game 3", 2);
   public static final ob am = new ob("game4", "Game 4", 3);
   final int at;
   static final int ny = 2000;
   public final String af;
   public static final ob ae = new ob("stellardawn", "Stellar Dawn", 1);
   static final int au = 4;
   public static final ob aq = new ob("oldscape", "RuneScape 2007", 5);
   static final int bl = 52;

   public int ac(int var1) {
      try {
         return this.at * -648630575;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ob.ac(" + ')');
      }
   }

   ob(String var1, String var2, int var3) {
      try {
         super();
         this.af = var1;
         this.at = var3 * 1596353073;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ob.<init>(" + ')');
      }
   }

   public int ae() {
      return this.at * -454517270;
   }

   public int ag() {
      return this.at * -648630575;
   }

   public int am() {
      return this.at * -648630575;
   }

   static final void ic(int var0) {
      try {
         int var1 = client.jl.at * -396152079;
         int[] var2 = client.jl.au;
         Iterator var3 = client.ju.iterator();

         while(var3.hasNext()) {
            if (var0 != -698538677) {
               throw new IllegalStateException();
            }

            dd var4 = (dd)var3.next();

            for(int var5 = 0; var5 < var1; ++var5) {
               di var6 = var4.ad[var2[var5]];
               if (var6 != null) {
                  if (var0 != -698538677) {
                     return;
                  }

                  qv.jr(var4, var6, 1, (byte)-51);
               }
            }
         }

      } catch (RuntimeException var7) {
         throw vk.ae(var7, "ob.ic(" + ')');
      }
   }
}
