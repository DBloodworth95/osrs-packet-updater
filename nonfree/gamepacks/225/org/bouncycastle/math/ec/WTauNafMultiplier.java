package org.bouncycastle.math.ec;

import java.math.BigInteger;

public class WTauNafMultiplier extends AbstractECMultiplier {
   static final String PRECOMP_NAME = "bc_wtnaf";

   public ECPoint multiplyPositive(ECPoint var1, BigInteger var2) {
      if (!(var1 instanceof ECPoint$AbstractF2m)) {
         throw new IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
      } else {
         ECPoint$AbstractF2m var3 = (ECPoint$AbstractF2m)var1;
         ECCurve$AbstractF2m var4 = (ECCurve$AbstractF2m)var3.getCurve();
         int var5 = var4.getFieldSize();
         byte var6 = var4.getA().toBigInteger().byteValue();
         byte var7 = Tnaf.getMu(var6);
         BigInteger[] var8 = var4.getSi();
         ZTauElement var9 = Tnaf.partModReduction(var2, var5, var6, var8, var7, (byte)10);
         return this.multiplyWTnaf(var3, var9, var4.getPreCompInfo(var3, "bc_wtnaf"), var6, var7);
      }
   }

   ECPoint$AbstractF2m multiplyWTnaf(ECPoint$AbstractF2m var1, ZTauElement var2, PreCompInfo var3, byte var4, byte var5) {
      ZTauElement[] var6 = var4 == 0 ? Tnaf.alpha0 : Tnaf.alpha1;
      BigInteger var7 = Tnaf.getTw(var5, 4);
      byte[] var8 = Tnaf.tauAdicWNaf(var5, var2, (byte)4, BigInteger.valueOf(16L), var7, var6);
      return multiplyFromWTnaf(var1, var8, var3);
   }

   static ECPoint$AbstractF2m multiplyFromWTnaf(ECPoint$AbstractF2m var0, byte[] var1, PreCompInfo var2) {
      ECCurve$AbstractF2m var3 = (ECCurve$AbstractF2m)var0.getCurve();
      byte var4 = var3.getA().toBigInteger().byteValue();
      ECPoint$AbstractF2m[] var5;
      if (var2 != null && var2 instanceof WTauNafPreCompInfo) {
         var5 = ((WTauNafPreCompInfo)var2).getPreComp();
      } else {
         var5 = Tnaf.getPreComp(var0, var4);
         WTauNafPreCompInfo var6 = new WTauNafPreCompInfo();
         var6.setPreComp(var5);
         var3.setPreCompInfo(var0, "bc_wtnaf", var6);
      }

      ECPoint$AbstractF2m[] var12 = new ECPoint$AbstractF2m[var5.length];

      for(int var7 = 0; var7 < var5.length; ++var7) {
         var12[var7] = (ECPoint$AbstractF2m)var5[var7].negate();
      }

      ECPoint$AbstractF2m var13 = (ECPoint$AbstractF2m)var0.getCurve().getInfinity();
      int var8 = 0;

      for(int var9 = var1.length - 1; var9 >= 0; --var9) {
         ++var8;
         byte var10 = var1[var9];
         if (var10 != 0) {
            var13 = var13.tauPow(var8);
            var8 = 0;
            ECPoint$AbstractF2m var11 = var10 > 0 ? var5[var10 >>> 1] : var12[-var10 >>> 1];
            var13 = (ECPoint$AbstractF2m)var13.add(var11);
         }
      }

      if (var8 > 0) {
         var13 = var13.tauPow(var8);
      }

      return var13;
   }
}
