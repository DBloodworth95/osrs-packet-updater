import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

public class av {
   final Map ak;
   final String aw;
   final int ap;
   final String aj;
   public static int[] ad;
   static int uq;

   public Map ae() {
      return this.ak;
   }

   static ib ap(int var0) {
      try {
         return ib.aj;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "av.ap(" + ')');
      }
   }

   av(HttpURLConnection var1) throws IOException {
      try {
         super();
         this.ap = var1.getResponseCode() * 1940748661;
         this.aw = var1.getResponseMessage();
         this.ak = var1.getHeaderFields();
         StringBuilder var2 = new StringBuilder();
         InputStream var3 = 188403421 * this.ap >= 300 ? var1.getErrorStream() : var1.getInputStream();
         if (var3 != null) {
            InputStreamReader var4 = new InputStreamReader(var3);
            BufferedReader var5 = new BufferedReader(var4);

            String var6;
            while((var6 = var5.readLine()) != null) {
               var2.append(var6);
            }

            var3.close();
         }

         this.aj = var2.toString();
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "av.<init>(" + ')');
      }
   }

   public String aw(int var1) {
      try {
         return this.aw;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "av.aw(" + ')');
      }
   }

   public int ai() {
      return this.ap * 188403421;
   }

   public int ap(int var1) {
      try {
         return this.ap * 188403421;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "av.ap(" + ')');
      }
   }

   static final int nf(int var0) {
      try {
         float var1 = 200.0F * ((float)io.vx.ab((byte)-65) - 0.5F);
         return 100 - Math.round(var1);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "av.nf(" + ')');
      }
   }

   public int ay() {
      return this.ap * 188403421;
   }

   public String as() {
      return this.aw;
   }

   public Map ak(int var1) {
      try {
         return this.ak;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "av.ak(" + ')');
      }
   }

   public Map am() {
      return this.ak;
   }

   public Map at() {
      return this.ak;
   }

   public String au() {
      return this.aj;
   }

   public String an() {
      return this.aj;
   }

   public String aj(byte var1) {
      try {
         return this.aj;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "av.aj(" + ')');
      }
   }

   av(String var1) {
      try {
         super();
         this.ap = -1089616176;
         this.aw = var1;
         this.ak = null;
         this.aj = "";
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "av.<init>(" + ')');
      }
   }

   public static me ap(int var0, String var1, pn var2, int var3, int var4) {
      try {
         me var5 = ef.ap(mm.da, client.in.ai, (byte)35);
         var5.ak.bo(0, 339074641);
         int var6 = -1689308347 * var5.ak.am;
         var5.ak.bo(var0, -281576981);
         String var7 = var1.toLowerCase();
         int var8 = 0;
         byte[] var9 = null;
         if (var7.startsWith(og.hk)) {
            if (var4 <= 1167868573) {
               throw new IllegalStateException();
            }

            var8 = 0;
            var1 = var1.substring(og.hk.length());
         } else if (var7.startsWith(og.hm)) {
            if (var4 <= 1167868573) {
               throw new IllegalStateException();
            }

            var8 = 1;
            var1 = var1.substring(og.hm.length());
         } else if (var7.startsWith(og.hl)) {
            if (var4 <= 1167868573) {
               throw new IllegalStateException();
            }

            var8 = 2;
            var1 = var1.substring(og.hl.length());
         } else if (var7.startsWith(og.hx)) {
            if (var4 <= 1167868573) {
               throw new IllegalStateException();
            }

            var8 = 3;
            var1 = var1.substring(og.hx.length());
         } else if (var7.startsWith(og.hj)) {
            if (var4 <= 1167868573) {
               throw new IllegalStateException();
            }

            var8 = 4;
            var1 = var1.substring(og.hj.length());
         } else if (var7.startsWith(og.hv)) {
            if (var4 <= 1167868573) {
               throw new IllegalStateException();
            }

            var8 = 5;
            var1 = var1.substring(og.hv.length());
         } else if (var7.startsWith(og.hz)) {
            if (var4 <= 1167868573) {
               throw new IllegalStateException();
            }

            var8 = 6;
            var1 = var1.substring(og.hz.length());
         } else if (var7.startsWith(og.hp)) {
            if (var4 <= 1167868573) {
               throw new IllegalStateException();
            }

            var8 = 7;
            var1 = var1.substring(og.hp.length());
         } else if (var7.startsWith(og.hg)) {
            var8 = 8;
            var1 = var1.substring(og.hg.length());
         } else if (var7.startsWith(og.hs)) {
            if (var4 <= 1167868573) {
               throw new IllegalStateException();
            }

            var8 = 9;
            var1 = var1.substring(og.hs.length());
         } else if (var7.startsWith(og.hh)) {
            if (var4 <= 1167868573) {
               throw new IllegalStateException();
            }

            var8 = 10;
            var1 = var1.substring(og.hh.length());
         } else if (var7.startsWith(og.hb)) {
            if (var4 <= 1167868573) {
               throw new IllegalStateException();
            }

            var8 = 11;
            var1 = var1.substring(og.hb.length());
         } else if (var7.startsWith(og.hw)) {
            if (var4 <= 1167868573) {
               throw new IllegalStateException();
            }

            var8 = 12;
            var1 = var1.substring(og.hw.length());
         } else if (var7.startsWith(og.ih)) {
            if (var4 <= 1167868573) {
               throw new IllegalStateException();
            }

            var9 = rr.aw(var7, (byte)-116);
            if (var9 != null) {
               var8 = 12 + var9.length;
               var1 = var1.substring(og.ih.length() + var9.length + 1);
            }
         }

         var7 = var1.toLowerCase();
         byte var10 = 0;
         if (var7.startsWith(og.ir)) {
            if (var4 <= 1167868573) {
               throw new IllegalStateException();
            }

            var10 = 1;
            var1 = var1.substring(og.ir.length());
         } else if (var7.startsWith(og.ip)) {
            if (var4 <= 1167868573) {
               throw new IllegalStateException();
            }

            var10 = 2;
            var1 = var1.substring(og.ip.length());
         } else if (var7.startsWith(og.in)) {
            if (var4 <= 1167868573) {
               throw new IllegalStateException();
            }

            var10 = 3;
            var1 = var1.substring(og.in.length());
         } else if (var7.startsWith(og.iu)) {
            if (var4 <= 1167868573) {
               throw new IllegalStateException();
            }

            var10 = 4;
            var1 = var1.substring(og.iu.length());
         } else if (var7.startsWith(og.ii)) {
            if (var4 <= 1167868573) {
               throw new IllegalStateException();
            }

            var10 = 5;
            var1 = var1.substring(og.ii.length());
         }

         var5.ak.bo(var8, -1401471921);
         var5.ak.bo(var10, -917765546);
         if (var9 != null) {
            if (var4 <= 1167868573) {
               throw new IllegalStateException();
            }

            for(int var11 = 0; var11 < var9.length; ++var11) {
               var5.ak.bo(var9[var11], -160957399);
            }
         }

         ix.aw(var5.ak, var1, -1446114678);
         if (var0 == od.aj.aw(1837624059)) {
            if (var4 <= 1167868573) {
               throw new IllegalStateException();
            }

            var5.ak.bo(var3, 344484470);
         }

         var5.ak.cl(-1689308347 * var5.ak.am - var6, -590817277);
         return var5;
      } catch (RuntimeException var12) {
         throw tm.aw(var12, "av.ap(" + ')');
      }
   }
}
