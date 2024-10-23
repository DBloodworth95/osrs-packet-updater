package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.field.FiniteFields;

public abstract class ECCurve$AbstractFp extends ECCurve {
   public ECCurve$AbstractFp(BigInteger var1) {
      super(FiniteFields.getPrimeField(var1));
   }

   public boolean isValidFieldElement(BigInteger var1) {
      return var1 != null && var1.signum() >= 0 && var1.compareTo(this.getField().getCharacteristic()) < 0;
   }

   public ECPoint decompressPoint(int var1, BigInteger var2) {
      ECFieldElement var3 = this.fromBigInteger(var2);
      ECFieldElement var4 = var3.square().add(this.a).multiply(var3).add(this.b);
      ECFieldElement var5 = var4.sqrt();
      if (var5 == null) {
         throw new IllegalArgumentException("Invalid point compression");
      } else {
         if (var5.testBitZero() != (var1 == 1)) {
            var5 = var5.negate();
         }

         return this.createRawPoint(var3, var5, true);
      }
   }
}
