import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tq extends to implements em {
   String cj;
   static final int ac = 9;
   int br;
   static final int aq = 0;
   static final int av = 25;
   static final int bf = 4;
   public int bs;
   boolean bw;
   int ba;
   static final int ax = 4;
   int be;
   int by;
   int bb;
   int cn;
   int bk;
   int bj;
   int bu;
   int bg;
   String bo;
   String bv;
   String bt;
   String bq;
   boolean bi;
   int bl;
   int bc;
   int bp;
   String ch;
   String cf;
   int[] cu;
   int cm;
   static final int am = 3;
   String cx;

   public void ax(vf var1) {
      var1.bu(9, (byte)-23);
      var1.bu(this.bs * 1616682233, (byte)68);
      var1.bu(this.bw ? 1 : 0, (byte)-94);
      var1.br(this.ba * -1949441307, 1625888552);
      var1.bu(1769428713 * this.bj, (byte)-49);
      var1.bu(this.bp * 373119321, (byte)20);
      var1.bu(this.by * -183899291, (byte)87);
      var1.bu(this.bb * -16770381, (byte)36);
      var1.bu(this.bi ? 1 : 0, (byte)56);
      var1.br(this.bg * 207390371, 1625888552);
      var1.bu(1709552185 * this.bl, (byte)-13);
      var1.bo(-803732151 * this.bu, 11981928);
      var1.br(this.br * 1470888797, 1625888552);
      var1.ch(this.bo, 1636334574);
      var1.ch(this.bv, 1636334574);
      var1.ch(this.bt, 1636334574);
      var1.ch(this.bq, 1636334574);
      var1.bu(this.be * -1111471375, (byte)94);
      var1.br(704870187 * this.bk, 1625888552);
      var1.ch(this.ch, 1636334574);
      var1.ch(this.cf, 1636334574);
      var1.bu(1982836533 * this.bc, (byte)-88);
      var1.bu(-451292239 * this.cn, (byte)-102);

      for(int var2 = 0; var2 < this.cu.length; ++var2) {
         var1.bv(this.cu[var2], 2042008912);
      }

      var1.bv(1280989209 * this.cm, 1581357305);
      var1.ch(this.cj, 1636334574);
      var1.ch(this.cx, 1636334574);
   }

   public void ac(vf var1, byte var2) {
      try {
         var1.bu(9, (byte)27);
         var1.bu(this.bs * 1616682233, (byte)-8);
         byte var10001;
         if (this.bw) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         var1.bu(var10001, (byte)75);
         var1.br(this.ba * -1949441307, 1625888552);
         var1.bu(1769428713 * this.bj, (byte)32);
         var1.bu(this.bp * 373119321, (byte)84);
         var1.bu(this.by * -183899291, (byte)-23);
         var1.bu(this.bb * -16770381, (byte)75);
         if (this.bi) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            var10001 = 1;
         } else {
            var10001 = 0;
         }

         var1.bu(var10001, (byte)-35);
         var1.br(this.bg * 207390371, 1625888552);
         var1.bu(1709552185 * this.bl, (byte)-79);
         var1.bo(-803732151 * this.bu, 234286198);
         var1.br(this.br * 1470888797, 1625888552);
         var1.ch(this.bo, 1636334574);
         var1.ch(this.bv, 1636334574);
         var1.ch(this.bt, 1636334574);
         var1.ch(this.bq, 1636334574);
         var1.bu(this.be * -1111471375, (byte)25);
         var1.br(704870187 * this.bk, 1625888552);
         var1.ch(this.ch, 1636334574);
         var1.ch(this.cf, 1636334574);
         var1.bu(1982836533 * this.bc, (byte)13);
         var1.bu(-451292239 * this.cn, (byte)12);

         for(int var3 = 0; var3 < this.cu.length; ++var3) {
            if (var2 == 1) {
               throw new IllegalStateException();
            }

            var1.bv(this.cu[var3], 414146577);
         }

         var1.bv(1280989209 * this.cm, 2127763230);
         var1.ch(this.cj, 1636334574);
         var1.ch(this.cx, 1636334574);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "tq.ac(" + ')');
      }
   }

   public int ae(int var1) {
      try {
         byte var2 = 39;
         int var4 = var2 + me.cn(this.bo, -1782097420);
         var4 += me.cn(this.bv, 1247287467);
         var4 += me.cn(this.bt, -1035100591);
         var4 += me.cn(this.bq, -834624598);
         var4 += me.cn(this.ch, -1039511286);
         var4 += me.cn(this.cf, -471640593);
         var4 += me.cn(this.cj, 268455187);
         var4 += me.cn(this.cx, 1242540710);
         return var4;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "tq.ae(" + ')');
      }
   }

   public String ag(int var1, int var2) {
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
               if (var2 != 361208752) {
                  throw new IllegalStateException();
               }

               var7.append(var8 + "\n");
            }

            if (var1 == 1) {
               if (var2 != 361208752) {
                  throw new IllegalStateException();
               }

               var4 = var7.substring(var7.indexOf("\n"), var7.length()).trim();
            } else if (2 == var1) {
               if (var2 != 361208752) {
                  throw new IllegalStateException();
               }

               int var9 = var7.indexOf("UUID: ") + 36;
               var4 = var7.substring(var7.indexOf("UUID: "), var9).replace("UUID: ", "");
            } else if (var1 == 3) {
               if (var2 != 361208752) {
                  throw new IllegalStateException();
               }

               if (var7.length() == 33) {
                  if (var2 != 361208752) {
                     throw new IllegalStateException();
                  }

                  var7 = new StringBuilder(var7.substring(0, var7.length() - 1));
               }

               if (var7.length() == 32) {
                  if (var2 != 361208752) {
                     throw new IllegalStateException();
                  }

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
               if (var5 != null) {
                  if (var2 != 361208752) {
                     throw new IllegalStateException();
                  }

                  var5.close();
               }
            } catch (IOException var18) {
            }

         }

         return var4;
      } catch (RuntimeException var21) {
         throw vk.ae(var21, "tq.ag(" + ')');
      }
   }

   tq(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26, String var27) {
      try {
         super();
         this.cu = new int[3];
         this.bs = 1882285385 * var1;
         this.bw = var2;
         this.ba = -924316947 * var3;
         this.bj = -853483175 * var4;
         this.bp = var5 * 1876123369;
         this.by = -1963569555 * var6;
         this.bb = var7 * 1292248187;
         this.bi = var8;
         this.bg = -213951221 * var9;
         this.bl = -52257783 * var10;
         this.bu = var11 * 184024313;
         this.br = 1089679605 * var12;
         this.bo = var13;
         this.bv = var14;
         this.bt = var15;
         this.bq = var16;
         this.bk = 1836814211 * var17;
         this.be = var18 * 676292113;
         this.bc = var19 * 178678557;
         this.cn = -1040280239 * var20;
         this.ch = var21;
         this.cf = var22;
         this.cu = var23;
         this.cm = -1605139415 * var24;
         this.cj = var25;
         this.cx = var26;
      } catch (RuntimeException var28) {
         throw vk.ae(var28, "tq.<init>(" + ')');
      }
   }

   public void am(vf var1) {
      var1.bu(9, (byte)10);
      var1.bu(this.bs * 493839224, (byte)-1);
      var1.bu(this.bw ? 1 : 0, (byte)1);
      var1.br(this.ba * -1949441307, 1625888552);
      var1.bu(820151867 * this.bj, (byte)46);
      var1.bu(this.bp * 373119321, (byte)38);
      var1.bu(this.by * -183899291, (byte)-25);
      var1.bu(this.bb * 419489791, (byte)99);
      var1.bu(this.bi ? 1 : 0, (byte)-13);
      var1.br(this.bg * -1011632264, 1625888552);
      var1.bu(1709552185 * this.bl, (byte)-63);
      var1.bo(1398669544 * this.bu, -1537341358);
      var1.br(this.br * 1470888797, 1625888552);
      var1.ch(this.bo, 1636334574);
      var1.ch(this.bv, 1636334574);
      var1.ch(this.bt, 1636334574);
      var1.ch(this.bq, 1636334574);
      var1.bu(this.be * -1111471375, (byte)-45);
      var1.br(704870187 * this.bk, 1625888552);
      var1.ch(this.ch, 1636334574);
      var1.ch(this.cf, 1636334574);
      var1.bu(921730005 * this.bc, (byte)-69);
      var1.bu(-940443803 * this.cn, (byte)17);

      for(int var2 = 0; var2 < this.cu.length; ++var2) {
         var1.bv(this.cu[var2], 2035072907);
      }

      var1.bv(-1113918105 * this.cm, 1015193019);
      var1.ch(this.cj, 1636334574);
      var1.ch(this.cx, 1636334574);
   }

   public int aq() {
      byte var1 = 39;
      int var2 = var1 + me.cn(this.bo, -853623986);
      var2 += me.cn(this.bv, 334244747);
      var2 += me.cn(this.bt, -2097453034);
      var2 += me.cn(this.bq, 616245496);
      var2 += me.cn(this.ch, -592256564);
      var2 += me.cn(this.cf, 2063131387);
      var2 += me.cn(this.cj, 1239543915);
      var2 += me.cn(this.cx, -581356703);
      return var2;
   }

   public String af(int var1) {
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
         } else if (2 == var1) {
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
            if (var4 != null) {
               var4.close();
            }
         } catch (IOException var16) {
         }

      }

      return var3;
   }
}
