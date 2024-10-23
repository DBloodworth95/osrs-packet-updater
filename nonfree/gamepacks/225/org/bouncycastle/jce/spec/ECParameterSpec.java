package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

public class ECParameterSpec implements AlgorithmParameterSpec {
   ECPoint G;
   ECCurve curve;
   byte[] seed;
   BigInteger n;
   BigInteger h;

   public int amd() {
      return this.getCurve().hashCode() ^ this.getG().hashCode();
   }

   public ECParameterSpec(ECCurve var1, ECPoint var2, BigInteger var3, BigInteger var4) {
      this.curve = var1;
      this.G = var2.normalize();
      this.n = var3;
      this.h = var4;
      this.seed = null;
   }

   public ECParameterSpec(ECCurve var1, ECPoint var2, BigInteger var3, BigInteger var4, byte[] var5) {
      this.curve = var1;
      this.G = var2.normalize();
      this.n = var3;
      this.h = var4;
      this.seed = var5;
   }

   public ECCurve getCurve() {
      return this.curve;
   }

   public ECPoint getG() {
      return this.G;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof ECParameterSpec)) {
         return false;
      } else {
         ECParameterSpec var2 = (ECParameterSpec)var1;
         return this.getCurve().equals(var2.getCurve()) && this.getG().equals(var2.getG());
      }
   }

   public BigInteger getH() {
      return this.h;
   }

   public byte[] getSeed() {
      return this.seed;
   }

   public ECParameterSpec(ECCurve var1, ECPoint var2, BigInteger var3) {
      this.curve = var1;
      this.G = var2.normalize();
      this.n = var3;
      this.h = BigInteger.valueOf(1L);
      this.seed = null;
   }

   public int hashCode() {
      return this.getCurve().hashCode() ^ this.getG().hashCode();
   }

   public boolean gn(Object var1) {
      if (!(var1 instanceof ECParameterSpec)) {
         return false;
      } else {
         ECParameterSpec var2 = (ECParameterSpec)var1;
         return this.getCurve().equals(var2.getCurve()) && this.getG().equals(var2.getG());
      }
   }

   public boolean gg(Object var1) {
      if (!(var1 instanceof ECParameterSpec)) {
         return false;
      } else {
         ECParameterSpec var2 = (ECParameterSpec)var1;
         return this.getCurve().equals(var2.getCurve()) && this.getG().equals(var2.getG());
      }
   }

   public int amy() {
      return this.getCurve().hashCode() ^ this.getG().hashCode();
   }

   public BigInteger getN() {
      return this.n;
   }
}
