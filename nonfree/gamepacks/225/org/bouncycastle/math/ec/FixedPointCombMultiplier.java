package org.bouncycastle.math.ec;

import java.math.BigInteger;

public class FixedPointCombMultiplier extends AbstractECMultiplier {
   public ECPoint multiplyPositive(ECPoint var1, BigInteger var2) {
      ECCurve var3 = var1.getCurve();
      int var4 = FixedPointUtil.getCombSize(var3);
      if (var2.bitLength() > var4) {
         throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
      } else {
         int var5 = this.getWidthForCombSize(var4);
         FixedPointPreCompInfo var6 = FixedPointUtil.precompute(var1, var5);
         ECPoint[] var7 = var6.getPreComp();
         int var8 = var6.getWidth();
         int var9 = (var4 + var8 - 1) / var8;
         ECPoint var10 = var3.getInfinity();
         int var11 = var9 * var8 - 1;

         for(int var12 = 0; var12 < var9; ++var12) {
            int var13 = 0;

            for(int var14 = var11 - var12; var14 >= 0; var14 -= var9) {
               var13 <<= 1;
               if (var2.testBit(var14)) {
                  var13 |= 1;
               }
            }

            var10 = var10.twicePlus(var7[var13]);
         }

         return var10;
      }
   }

   public int getWidthForCombSize(int var1) {
      return var1 > 257 ? 6 : 5;
   }
}
