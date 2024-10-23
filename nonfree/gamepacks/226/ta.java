import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ta extends tw implements ep {
   String bi;
   String bw;
   static final int ak = 2;
   static final int ai = 4;
   String cd;
   static final int an = 6;
   static final int ag = 20;
   static final int aw = 1;
   public int bq;
   static final int bj = 1;
   int bz;
   int bc;
   int by;
   int br;
   String cf;
   String co;
   int bt;
   int bs;
   int bo;
   int bd;
   String bf;
   static final int ay = 0;
   int bl;
   boolean bp;
   int bg;
   static final int ap = 9;
   int be;
   int cq;
   String cb;
   int bn;
   int[] ci;
   int cn;
   boolean bu;
   String ba;

   public String ak(int var1, int var2) {
      try {
         String var3 = "";
         String var4 = "12345678-0000-0000-0000-123456789012";
         switch(var1) {
         case 1:
            var3 = "wmic csproduct get UUID";
            break;
         case 2:
            var3 = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'";
            break;
         case 3:
            var3 = "cat /etc/machine-id";
            break;
         default:
            return "Unknown";
         }

         BufferedReader var5 = null;

         try {
            Process var6 = Runtime.getRuntime().exec(var3);
            var5 = new BufferedReader(new InputStreamReader(var6.getInputStream()));
            StringBuilder var7 = new StringBuilder();

            String var8;
            while((var8 = var5.readLine()) != null) {
               if (var2 == -1060833275) {
                  throw new IllegalStateException();
               }

               var7.append(var8 + "\n");
            }

            if (var1 == 1) {
               if (var2 == -1060833275) {
                  throw new IllegalStateException();
               }

               var4 = var7.substring(var7.indexOf("\n"), var7.length()).trim();
            } else if (var1 == 2) {
               if (var2 == -1060833275) {
                  throw new IllegalStateException();
               }

               int var9 = var7.indexOf("UUID: ") + 36;
               var4 = var7.substring(var7.indexOf("UUID: "), var9).replace("UUID: ", "");
            } else if (var1 == 3) {
               if (var2 == -1060833275) {
                  throw new IllegalStateException();
               }

               if (var7.length() == 33) {
                  var7 = new StringBuilder(var7.substring(0, var7.length() - 1));
               }

               if (var7.length() == 32) {
                  var7.insert(20, "-");
                  var7.insert(16, "-");
                  var7.insert(12, "-");
                  var7.insert(8, "-");
                  var4 = var7.toString();
               } else {
                  var4 = "12345678-0000-0000-0000-123456789012";
               }
            }
         } catch (Exception var19) {
         } finally {
            try {
               if (null != var5) {
                  if (var2 == -1060833275) {
                     throw new IllegalStateException();
                  }

                  var5.close();
               }
            } catch (IOException var18) {
            }

         }

         return var4;
      } catch (RuntimeException var21) {
         throw tm.aw(var21, "ta.ak(" + ')');
      }
   }

   public void ap(vl var1, int var2) {
      try {
         var1.bo(9, 1646594641);
         var1.bo(1430234553 * this.bq, -1139692042);
         byte var10001;
         if (this.bp) {
            if (var2 == -824216516) {
               throw new IllegalStateException();
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         var1.bo(var10001, 1091788141);
         var1.bd(-596935477 * this.bz, (byte)94);
         var1.bo(this.bc * -443160691, 1590681538);
         var1.bo(this.by * -376390449, 569776924);
         var1.bo(this.br * -2029836205, -924569988);
         var1.bo(this.bn * -382502433, 1499570398);
         var1.bo(this.bu ? 1 : 0, 748708822);
         var1.bd(this.bt * -1408403749, (byte)-67);
         var1.bo(1936177929 * this.bs, -1999699963);
         var1.ba(this.bo * 2020129975, -968320475);
         var1.bd(1593485507 * this.bd, (byte)41);
         var1.cb(this.ba, 2108562660);
         var1.cb(this.bw, 2108562660);
         var1.cb(this.bi, 2108562660);
         var1.cb(this.bf, 2108562660);
         var1.bo(this.bl * -946019221, -1280491619);
         var1.bd(this.bg * 1142850139, (byte)57);
         var1.cb(this.cb, 2108562660);
         var1.cb(this.cd, 2108562660);
         var1.bo(-1165834429 * this.be, -967864297);
         var1.bo(this.cq * 668273757, -1272118517);

         for(int var3 = 0; var3 < this.ci.length; ++var3) {
            var1.bw(this.ci[var3], (byte)80);
         }

         var1.bw(-2058509767 * this.cn, (byte)99);
         var1.cb(this.co, 2108562660);
         var1.cb(this.cf, 2108562660);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ta.ap(" + ')');
      }
   }

   public int aw(int var1) {
      try {
         byte var2 = 39;
         String var5 = this.ba;
         int var4 = var5.length() + 2;
         int var10 = var2 + var4;
         var10 += dp.cq(this.bw, -787808958);
         var10 += dp.cq(this.bi, 887700242);
         var10 += dp.cq(this.bf, 1709398942);
         var10 += dp.cq(this.cb, 257707333);
         var10 += dp.cq(this.cd, -640656715);
         String var8 = this.co;
         int var7 = var8.length() + 2;
         var10 += var7;
         var10 += dp.cq(this.cf, 139165840);
         return var10;
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "ta.aw(" + ')');
      }
   }

   public int ay() {
      byte var1 = 39;
      String var4 = this.ba;
      int var3 = var4.length() + 2;
      int var8 = var1 + var3;
      var8 += dp.cq(this.bw, 1897121495);
      var8 += dp.cq(this.bi, -1142443951);
      var8 += dp.cq(this.bf, -1786970532);
      var8 += dp.cq(this.cb, -1056262306);
      var8 += dp.cq(this.cd, -436004195);
      String var7 = this.co;
      int var6 = var7.length() + 2;
      var8 += var6;
      var8 += dp.cq(this.cf, 959038002);
      return var8;
   }

   public void aj(vl var1) {
      var1.bo(9, 945327945);
      var1.bo(1430234553 * this.bq, -1480967248);
      var1.bo(this.bp ? 1 : 0, 1551242131);
      var1.bd(-596935477 * this.bz, (byte)1);
      var1.bo(this.bc * -443160691, -29940010);
      var1.bo(this.by * -376390449, -849721113);
      var1.bo(this.br * -2029836205, -2059972676);
      var1.bo(this.bn * -382502433, -1797944899);
      var1.bo(this.bu ? 1 : 0, -993005330);
      var1.bd(this.bt * -1408403749, (byte)105);
      var1.bo(1936177929 * this.bs, 1885234785);
      var1.ba(this.bo * 2020129975, -1427230626);
      var1.bd(1593485507 * this.bd, (byte)-19);
      var1.cb(this.ba, 2108562660);
      var1.cb(this.bw, 2108562660);
      var1.cb(this.bi, 2108562660);
      var1.cb(this.bf, 2108562660);
      var1.bo(this.bl * -946019221, -760402494);
      var1.bd(this.bg * 1142850139, (byte)-66);
      var1.cb(this.cb, 2108562660);
      var1.cb(this.cd, 2108562660);
      var1.bo(-1165834429 * this.be, 1867779507);
      var1.bo(this.cq * 668273757, 1420061899);

      for(int var2 = 0; var2 < this.ci.length; ++var2) {
         var1.bw(this.ci[var2], (byte)32);
      }

      var1.bw(-2058509767 * this.cn, (byte)28);
      var1.cb(this.co, 2108562660);
      var1.cb(this.cf, 2108562660);
   }

   public int ai() {
      byte var1 = 39;
      String var4 = this.ba;
      int var3 = var4.length() + 2;
      int var8 = var1 + var3;
      var8 += dp.cq(this.bw, -1157914236);
      var8 += dp.cq(this.bi, 1885352639);
      var8 += dp.cq(this.bf, 390387717);
      var8 += dp.cq(this.cb, 1490291565);
      var8 += dp.cq(this.cd, -931423744);
      String var7 = this.co;
      int var6 = var7.length() + 2;
      var8 += var6;
      var8 += dp.cq(this.cf, 1756476227);
      return var8;
   }

   public int as() {
      byte var1 = 39;
      String var4 = this.ba;
      int var3 = var4.length() + 2;
      int var8 = var1 + var3;
      var8 += dp.cq(this.bw, 329938612);
      var8 += dp.cq(this.bi, -286573842);
      var8 += dp.cq(this.bf, -1932012903);
      var8 += dp.cq(this.cb, 1414499414);
      var8 += dp.cq(this.cd, 700490737);
      String var7 = this.co;
      int var6 = var7.length() + 2;
      var8 += var6;
      var8 += dp.cq(this.cf, 770336547);
      return var8;
   }

   ta(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26, String var27) {
      try {
         super();
         this.ci = new int[3];
         this.bq = 1100664969 * var1;
         this.bp = var2;
         this.bz = var3 * -1826748189;
         this.bc = -1279937723 * var4;
         this.by = -806434257 * var5;
         this.br = var6 * -1068672037;
         this.bn = var7 * 2134868511;
         this.bu = var8;
         this.bt = var9 * -1309698733;
         this.bs = var10 * -1051442375;
         this.bo = 418046215 * var11;
         this.bd = var12 * -554481685;
         this.ba = var13;
         this.bw = var14;
         this.bi = var15;
         this.bf = var16;
         this.bg = var17 * -644424237;
         this.bl = var18 * -157374397;
         this.be = var19 * 1939438955;
         this.cq = 1099769845 * var20;
         this.cb = var21;
         this.cd = var22;
         this.ci = var23;
         this.cn = var24 * 360688649;
         this.co = var25;
         this.cf = var26;
      } catch (RuntimeException var28) {
         throw tm.aw(var28, "ta.<init>(" + ')');
      }
   }

   public String ae(int var1) {
      String var2 = "";
      String var3 = "12345678-0000-0000-0000-123456789012";
      switch(var1) {
      case 1:
         var2 = "wmic csproduct get UUID";
         break;
      case 2:
         var2 = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'";
         break;
      case 3:
         var2 = "cat /etc/machine-id";
         break;
      default:
         return "Unknown";
      }

      BufferedReader var4 = null;

      try {
         Process var5 = Runtime.getRuntime().exec(var2);
         var4 = new BufferedReader(new InputStreamReader(var5.getInputStream()));
         StringBuilder var6 = new StringBuilder();

         String var7;
         while((var7 = var4.readLine()) != null) {
            var6.append(var7 + "\n");
         }

         if (var1 == 1) {
            var3 = var6.substring(var6.indexOf("\n"), var6.length()).trim();
         } else if (var1 == 2) {
            int var8 = var6.indexOf("UUID: ") + 36;
            var3 = var6.substring(var6.indexOf("UUID: "), var8).replace("UUID: ", "");
         } else if (var1 == 3) {
            if (var6.length() == 33) {
               var6 = new StringBuilder(var6.substring(0, var6.length() - 1));
            }

            if (var6.length() == 1185579593) {
               var6.insert(20, "-");
               var6.insert(16, "-");
               var6.insert(12, "-");
               var6.insert(8, "-");
               var3 = var6.toString();
            } else {
               var3 = "12345678-0000-0000-0000-123456789012";
            }
         }
      } catch (Exception var17) {
      } finally {
         try {
            if (null != var4) {
               var4.close();
            }
         } catch (IOException var16) {
         }

      }

      return var3;
   }

   public String am(int var1) {
      String var2 = "";
      String var3 = "12345678-0000-0000-0000-123456789012";
      switch(var1) {
      case 1:
         var2 = "wmic csproduct get UUID";
         break;
      case 2:
         var2 = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'";
         break;
      case 3:
         var2 = "cat /etc/machine-id";
         break;
      default:
         return "Unknown";
      }

      BufferedReader var4 = null;

      try {
         Process var5 = Runtime.getRuntime().exec(var2);
         var4 = new BufferedReader(new InputStreamReader(var5.getInputStream()));
         StringBuilder var6 = new StringBuilder();

         String var7;
         while((var7 = var4.readLine()) != null) {
            var6.append(var7 + "\n");
         }

         if (var1 == 1) {
            var3 = var6.substring(var6.indexOf("\n"), var6.length()).trim();
         } else if (var1 == 2) {
            int var8 = var6.indexOf("UUID: ") + 36;
            var3 = var6.substring(var6.indexOf("UUID: "), var8).replace("UUID: ", "");
         } else if (var1 == 3) {
            if (var6.length() == 33) {
               var6 = new StringBuilder(var6.substring(0, var6.length() - 1));
            }

            if (var6.length() == 32) {
               var6.insert(20, "-");
               var6.insert(16, "-");
               var6.insert(12, "-");
               var6.insert(8, "-");
               var3 = var6.toString();
            } else {
               var3 = "12345678-0000-0000-0000-123456789012";
            }
         }
      } catch (Exception var17) {
      } finally {
         try {
            if (null != var4) {
               var4.close();
            }
         } catch (IOException var16) {
         }

      }

      return var3;
   }
}
