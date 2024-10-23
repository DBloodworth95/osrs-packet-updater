package org.bouncycastle.math.ec.endo;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPointMap;
import org.bouncycastle.math.ec.ScaleXPointMap;

public class GLVTypeBEndomorphism implements GLVEndomorphism {
   public final GLVTypeBParameters parameters;
   public final ECCurve curve;
   public final ECPointMap pointMap;

   public boolean hasEfficientPointMap() {
      return true;
   }

   public ECPointMap getPointMap() {
      return this.pointMap;
   }

   public GLVTypeBEndomorphism(ECCurve var1, GLVTypeBParameters var2) {
      this.curve = var1;
      this.parameters = var2;
      this.pointMap = new ScaleXPointMap(var1.fromBigInteger(var2.getBeta()));
   }

   public BigInteger[] decomposeScalar(BigInteger var1) {
      int var2 = this.parameters.getBits();
      BigInteger var3 = this.calculateB(var1, this.parameters.getG1(), var2);
      BigInteger var4 = this.calculateB(var1, this.parameters.getG2(), var2);
      GLVTypeBParameters var5 = this.parameters;
      BigInteger var6 = var1.subtract(var3.multiply(var5.getV1A()).add(var4.multiply(var5.getV2A())));
      BigInteger var7 = var3.multiply(var5.getV1B()).add(var4.multiply(var5.getV2B())).negate();
      return new BigInteger[]{var6, var7};
   }

   public BigInteger calculateB(BigInteger var1, BigInteger var2, int var3) {
      boolean var4 = var2.signum() < 0;
      BigInteger var5 = var1.multiply(var2.abs());
      boolean var6 = var5.testBit(var3 - 1);
      var5 = var5.shiftRight(var3);
      if (var6) {
         var5 = var5.add(ECConstants.ONE);
      }

      return var4 ? var5.negate() : var5;
   }
}
