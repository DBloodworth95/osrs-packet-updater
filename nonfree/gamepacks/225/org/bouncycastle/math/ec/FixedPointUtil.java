package org.bouncycastle.math.ec;

import java.math.BigInteger;

public class FixedPointUtil {
   public static final String PRECOMP_NAME = "bc_fixed_point";

   public static int getCombSize(ECCurve var0) {
      BigInteger var1 = var0.getOrder();
      return var1 == null ? var0.getFieldSize() + 1 : var1.bitLength();
   }

   public static FixedPointPreCompInfo getFixedPointPreCompInfo(PreCompInfo var0) {
      return var0 != null && var0 instanceof FixedPointPreCompInfo ? (FixedPointPreCompInfo)var0 : new FixedPointPreCompInfo();
   }

   public static FixedPointPreCompInfo precompute(ECPoint var0, int var1) {
      ECCurve var2 = var0.getCurve();
      int var3 = 1 << var1;
      FixedPointPreCompInfo var4 = getFixedPointPreCompInfo(var2.getPreCompInfo(var0, "bc_fixed_point"));
      ECPoint[] var5 = var4.getPreComp();
      if (var5 == null || var5.length < var3) {
         int var6 = getCombSize(var2);
         int var7 = (var6 + var1 - 1) / var1;
         ECPoint[] var8 = new ECPoint[var1];
         var8[0] = var0;

         int var9;
         for(var9 = 1; var9 < var1; ++var9) {
            var8[var9] = var8[var9 - 1].timesPow2(var7);
         }

         var2.normalizeAll(var8);
         var5 = new ECPoint[var3];
         var5[0] = var2.getInfinity();

         for(var9 = var1 - 1; var9 >= 0; --var9) {
            ECPoint var10 = var8[var9];
            int var11 = 1 << var9;

            for(int var12 = var11; var12 < var3; var12 += var11 << 1) {
               var5[var12] = var5[var12 - var11].add(var10);
            }
         }

         var2.normalizeAll(var5);
         var4.setPreComp(var5);
         var4.setWidth(var1);
         var2.setPreCompInfo(var0, "bc_fixed_point", var4);
      }

      return var4;
   }
}
