package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

public class DSAParameters implements CipherParameters {
   BigInteger q;
   DSAValidationParameters validation;
   BigInteger p;
   BigInteger g;

   public DSAValidationParameters getValidationParameters() {
      return this.validation;
   }

   public DSAParameters(BigInteger var1, BigInteger var2, BigInteger var3, DSAValidationParameters var4) {
      this.g = var3;
      this.p = var1;
      this.q = var2;
      this.validation = var4;
   }

   public BigInteger getP() {
      return this.p;
   }

   public BigInteger getQ() {
      return this.q;
   }

   public BigInteger getG() {
      return this.g;
   }

   public int amb() {
      return this.getP().hashCode() ^ this.getQ().hashCode() ^ this.getG().hashCode();
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof DSAParameters)) {
         return false;
      } else {
         DSAParameters var2 = (DSAParameters)var1;
         return var2.getP().equals(this.p) && var2.getQ().equals(this.q) && var2.getG().equals(this.g);
      }
   }

   public int hashCode() {
      return this.getP().hashCode() ^ this.getQ().hashCode() ^ this.getG().hashCode();
   }

   public boolean gj(Object var1) {
      if (!(var1 instanceof DSAParameters)) {
         return false;
      } else {
         DSAParameters var2 = (DSAParameters)var1;
         return var2.getP().equals(this.p) && var2.getQ().equals(this.q) && var2.getG().equals(this.g);
      }
   }

   public int ams() {
      return this.getP().hashCode() ^ this.getQ().hashCode() ^ this.getG().hashCode();
   }

   public int amf() {
      return this.getP().hashCode() ^ this.getQ().hashCode() ^ this.getG().hashCode();
   }

   public DSAParameters(BigInteger var1, BigInteger var2, BigInteger var3) {
      this.g = var3;
      this.p = var1;
      this.q = var2;
   }

   public int amg() {
      return this.getP().hashCode() ^ this.getQ().hashCode() ^ this.getG().hashCode();
   }

   public int aml() {
      return this.getP().hashCode() ^ this.getQ().hashCode() ^ this.getG().hashCode();
   }
}
