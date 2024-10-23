package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.endo.GLVEndomorphism;

public class GLVMultiplier extends AbstractECMultiplier {
   public final ECCurve curve;
   public final GLVEndomorphism glvEndomorphism;

   public GLVMultiplier(ECCurve var1, GLVEndomorphism var2) {
      if (var1 != null && var1.getOrder() != null) {
         this.curve = var1;
         this.glvEndomorphism = var2;
      } else {
         throw new IllegalArgumentException("Need curve with known group order");
      }
   }

   public ECPoint multiplyPositive(ECPoint var1, BigInteger var2) {
      if (!this.curve.equals(var1.getCurve())) {
         throw new IllegalStateException();
      } else {
         BigInteger var3 = var1.getCurve().getOrder();
         BigInteger[] var4 = this.glvEndomorphism.decomposeScalar(var2.mod(var3));
         BigInteger var5 = var4[0];
         BigInteger var6 = var4[1];
         ECPointMap var7 = this.glvEndomorphism.getPointMap();
         return this.glvEndomorphism.hasEfficientPointMap() ? ECAlgorithms.implShamirsTrickWNaf(var1, var5, var7, var6) : ECAlgorithms.implShamirsTrickWNaf(var1, var5, var7.map(var1), var6);
      }
   }
}
