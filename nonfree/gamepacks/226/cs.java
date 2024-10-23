import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class cs {
   static final String ak = "passwordchoice.ws";
   static final int aj = 1000;
   static final int rq = 100;
   static final BigInteger ay = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
   static final BigInteger ai = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
   static final int as = 2;
   static final int ae = 3;
   public static short[] ao;
   static final int bx = 1;
   public static final int dh = 105;
   static final String aw = "services";
   public static final int bn = 49;

   static long aj() {
      try {
         URL var0 = new URL(el.ov("services", false, -1927815904) + "m=accountappeal/login.ws");
         URLConnection var1 = var0.openConnection();
         var1.setRequestProperty("connection", "close");
         var1.setDoInput(true);
         var1.setDoOutput(true);
         var1.setConnectTimeout(549155910);
         OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
         var2.write("data1=req");
         var2.flush();
         InputStream var3 = var1.getInputStream();
         vl var4 = new vl(new byte[1000]);

         do {
            int var5 = var3.read(var4.ae, -1689308347 * var4.am, -44417658 - var4.am * -685091619);
            if (-1 == var5) {
               var4.am = 0;
               long var8 = var4.ct((byte)-50);
               return var8;
            }

            var4.am += var5 * 706206623;
         } while(-1689308347 * var4.am < 805847099);

         return 0L;
      } catch (Exception var7) {
         return 0L;
      }
   }

   static boolean ae(String var0) {
      if (null == var0) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var2) {
            return false;
         }
      }
   }

   static final int ai(long var0, String var2) {
      Random var3 = new Random();
      vl var4 = new vl(128);
      vl var5 = new vl(128);
      int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0};
      var4.bo(10, 1712103889);

      int var7;
      for(var7 = 0; var7 < 4; ++var7) {
         var4.bw(var3.nextInt(), (byte)103);
      }

      var4.bw(var6[0], (byte)84);
      var4.bw(var6[1], (byte)92);
      var4.bf(var0);
      var4.bf(0L);

      for(var7 = 0; var7 < 4; ++var7) {
         var4.bw(var3.nextInt(), (byte)59);
      }

      var4.dm(ai, ay, 1960772609);
      var5.bo(10, 448970162);

      for(var7 = 0; var7 < 3; ++var7) {
         var5.bw(var3.nextInt(), (byte)62);
      }

      var5.bf(var3.nextLong());
      var5.bi(var3.nextLong());
      if (null != client.hz) {
         var5.ci(client.hz, 0, client.hz.length, -1695521102);
      } else {
         byte[] var20 = aw.ai((byte)0);
         var5.ci(var20, 0, var20.length, -1662794874);
      }

      var5.bf(var3.nextLong());
      var5.dm(ai, ay, 192965021);
      var7 = ct.bl(var2, -314260322);
      if (var7 % 8 != 0) {
         var7 += 8 - var7 % 8;
      }

      vl var8 = new vl(var7);
      var8.be(var2, (byte)104);
      var8.am = var7 * -725588083;
      var8.df(var6, -1158423638);
      vl var9 = new vl(-1689308347 * var5.am + 5 + var4.am * -1689308347 + -1689308347 * var8.am);
      var9.bo(2, -121128448);
      var9.bo(var4.am * -1689308347, -1338716305);
      var9.ci(var4.ae, 0, -1689308347 * var4.am, -2135624204);
      var9.bo(var5.am * -1689308347, 1613220899);
      var9.ci(var5.ae, 0, -1689308347 * var5.am, -1134125917);
      var9.bd(var8.am * -1689308347, (byte)-109);
      var9.ci(var8.ae, 0, -1689308347 * var8.am, -2067551262);
      byte[] var11 = var9.ae;
      int var13 = var11.length;
      StringBuilder var14 = new StringBuilder();

      int var17;
      for(int var15 = 0; var15 < var13 + 0; var15 += 3) {
         int var16 = var11[var15] & 255;
         var14.append(qn.ap[var16 >>> 2]);
         if (var15 < var13 - 1) {
            var17 = var11[var15 + 1] & 255;
            var14.append(qn.ap[(var16 & 3) << 4 | var17 >>> 4]);
            if (var15 < var13 - 2) {
               int var18 = var11[var15 + 2] & 255;
               var14.append(qn.ap[(var17 & 15) << 2 | var18 >>> 6]).append(qn.ap[var18 & 63]);
            } else {
               var14.append(qn.ap[(var17 & 15) << 2]).append("=");
            }
         } else {
            var14.append(qn.ap[(var16 & 3) << 4]).append("==");
         }
      }

      String var12 = var14.toString();
      var12 = var12;

      try {
         URL var21 = new URL(el.ov("services", false, -1925351988) + "m=accountappeal/login.ws");
         URLConnection var22 = var21.openConnection();
         var22.setDoInput(true);
         var22.setDoOutput(true);
         var22.setConnectTimeout(5000);
         OutputStreamWriter var23 = new OutputStreamWriter(var22.getOutputStream());
         var23.write("data2=" + qo.ap(var12, -841723601) + "&dest=" + qo.ap("passwordchoice.ws", 1272130981));
         var23.flush();
         InputStream var24 = var22.getInputStream();
         var9 = new vl(new byte[1000]);

         do {
            var17 = var24.read(var9.ae, var9.am * -1689308347, 1000 - -1689308347 * var9.am);
            if (var17 == -1) {
               var23.close();
               var24.close();
               String var25 = new String(var9.ae);
               if (var25.startsWith("OFFLINE")) {
                  return 4;
               } else if (var25.startsWith("WRONG")) {
                  return 7;
               } else if (var25.startsWith("RELOAD")) {
                  return 3;
               } else if (var25.startsWith("Not permitted for social network accounts.")) {
                  return 6;
               } else {
                  var9.du(var6, (byte)45);

                  while(var9.am * -1689308347 > 0 && var9.ae[var9.am * -1689308347 - 1] == 0) {
                     var9.am -= -725588083;
                  }

                  var25 = new String(var9.ae, 0, -1689308347 * var9.am);
                  if (ej.ak(var25, -1808347812)) {
                     pc.ap(var25, true, false, (byte)42);
                     return 2;
                  } else {
                     return 5;
                  }
               }
            }

            var9.am += var17 * -725588083;
         } while(-1689308347 * var9.am < 1000);

         return 5;
      } catch (Throwable var19) {
         var19.printStackTrace();
         return 5;
      }
   }

   static boolean ay(String var0) {
      if (null == var0) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var2) {
            return false;
         }
      }
   }

   static boolean as(String var0) {
      if (null == var0) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var2) {
            return false;
         }
      }
   }

   cs() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "cs.<init>(" + ')');
      }
   }
}
