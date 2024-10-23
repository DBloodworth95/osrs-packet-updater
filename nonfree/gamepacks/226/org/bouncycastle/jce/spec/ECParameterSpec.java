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

   public int hashCode() {
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

   public BigInteger getH() {
      return this.h;
   }

   public BigInteger getN() {
      return this.n;
   }

   public ECPoint getG() {
      return this.G;
   }

   public byte[] getSeed() {
      return this.seed;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof ECParameterSpec)) {
         return false;
      } else {
         ECParameterSpec var2 = (ECParameterSpec)var1;
         return this.getCurve().equals(var2.getCurve()) && this.getG().equals(var2.getG());
      }
   }

   public ECParameterSpec(ECCurve var1, ECPoint var2, BigInteger var3) {
      this.curve = var1;
      this.G = var2.normalize();
      this.n = var3;
      this.h = BigInteger.valueOf(1L);
      this.seed = null;
   }

   public boolean gj(Object var1) {
      if (!(var1 instanceof ECParameterSpec)) {
         return false;
      } else {
         ECParameterSpec var2 = (ECParameterSpec)var1;
         return this.getCurve().equals(var2.getCurve()) && this.getG().equals(var2.getG());
      }
   }

   public int ams() {
      return this.getCurve().hashCode() ^ this.getG().hashCode();
   }

   public int amf() {
      return this.getCurve().hashCode() ^ this.getG().hashCode();
   }

   public int amb() {
      return this.getCurve().hashCode() ^ this.getG().hashCode();
   }

   public int amg() {
      return this.getCurve().hashCode() ^ this.getG().hashCode();
   }

   public int aml() {
      return this.getCurve().hashCode() ^ this.getG().hashCode();
   }
}
