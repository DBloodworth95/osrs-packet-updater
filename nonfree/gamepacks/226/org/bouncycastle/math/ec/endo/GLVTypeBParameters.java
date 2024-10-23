package org.bouncycastle.math.ec.endo;

import java.math.BigInteger;

public class GLVTypeBParameters {
   public final BigInteger v2B;
   public final BigInteger lambda;
   public final BigInteger v1A;
   public final BigInteger v1B;
   public final BigInteger v2A;
   public final BigInteger g1;
   public final BigInteger g2;
   public final BigInteger beta;
   public final int bits;

   public BigInteger getV2A() {
      return this.v2A;
   }

   public GLVTypeBParameters(BigInteger var1, BigInteger var2, BigInteger[] var3, BigInteger[] var4, BigInteger var5, BigInteger var6, int var7) {
      checkVector(var3, "v1");
      checkVector(var4, "v2");
      this.beta = var1;
      this.lambda = var2;
      this.v1A = var3[0];
      this.v1B = var3[1];
      this.v2A = var4[0];
      this.v2B = var4[1];
      this.g1 = var5;
      this.g2 = var6;
      this.bits = var7;
   }

   public BigInteger getBeta() {
      return this.beta;
   }

   public BigInteger getG2() {
      return this.g2;
   }

   /** @deprecated */
   public BigInteger[] getV1() {
      return new BigInteger[]{this.v1A, this.v1B};
   }

   static void checkVector(BigInteger[] var0, String var1) {
      if (var0 == null || var0.length != 2 || var0[0] == null || var0[1] == null) {
         throw new IllegalArgumentException("'" + var1 + "' must consist of exactly 2 (non-null) values");
      }
   }

   public BigInteger getV1A() {
      return this.v1A;
   }

   public BigInteger getLambda() {
      return this.lambda;
   }

   public BigInteger getV1B() {
      return this.v1B;
   }

   public BigInteger getV2B() {
      return this.v2B;
   }

   public BigInteger getG1() {
      return this.g1;
   }

   /** @deprecated */
   public BigInteger[] getV2() {
      return new BigInteger[]{this.v2A, this.v2B};
   }

   public int getBits() {
      return this.bits;
   }
}
