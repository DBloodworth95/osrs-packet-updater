import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public final class jl {
   public static final int bw = 131072;
   int ac;
   int ag;
   int ae;
   int am;
   boolean aq;
   int ax;
   int af;

   jl(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      try {
         super();
         this.aq = true;
         this.ac = var1 * -1429864179;
         this.ae = var2 * 1617332289;
         this.ag = var3 * 1959770353;
         this.am = 117215155 * var4;
         this.ax = 171979989 * var5;
         this.af = -701728833 * var6;
         this.aq = var7;
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "jl.<init>(" + ')');
      }
   }

   static long ac(int var0) {
      try {
         try {
            URL var1 = new URL(ng.of("services", false, (byte)-105) + "m=accountappeal/login.ws");
            URLConnection var2 = var1.openConnection();
            var2.setRequestProperty("connection", "close");
            var2.setDoInput(true);
            var2.setDoOutput(true);
            var2.setConnectTimeout(5000);
            OutputStreamWriter var3 = new OutputStreamWriter(var2.getOutputStream());
            var3.write("data1=req");
            var3.flush();
            InputStream var4 = var2.getInputStream();
            vf var5 = new vf(new byte[1000]);

            do {
               int var6 = var4.read(var5.at, var5.au * -1027766515, 1000 - var5.au * -1027766515);
               if (var6 == -1) {
                  if (var0 != -403784714) {
                     throw new IllegalStateException();
                  } else {
                     var5.au = 0;
                     long var10 = var5.cw(505426381);
                     return var10;
                  }
               }

               var5.au += var6 * -1864458299;
            } while(var5.au * -1027766515 < 1000);

            if (var0 != -403784714) {
               throw new IllegalStateException();
            } else {
               return 0L;
            }
         } catch (Exception var8) {
            return 0L;
         }
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "jl.ac(" + ')');
      }
   }
}
