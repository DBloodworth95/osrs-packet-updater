package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

public class DSAParameters implements CipherParameters {
   BigInteger g;
   BigInteger q;
   BigInteger p;
   DSAValidationParameters validation;

   public int amd() {
      return this.getP().hashCode() ^ this.getQ().hashCode() ^ this.getG().hashCode();
   }

   public DSAParameters(BigInteger var1, BigInteger var2, BigInteger var3) {
      this.g = var3;
      this.p = var1;
      this.q = var2;
   }

   public BigInteger getP() {
      return this.p;
   }

   public BigInteger getG() {
      return this.g;
   }

   public DSAParameters(BigInteger var1, BigInteger var2, BigInteger var3, DSAValidationParameters var4) {
      this.g = var3;
      this.p = var1;
      this.q = var2;
      this.validation = var4;
   }

   public DSAValidationParameters getValidationParameters() {
      return this.validation;
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

   public boolean gn(Object var1) {
      if (!(var1 instanceof DSAParameters)) {
         return false;
      } else {
         DSAParameters var2 = (DSAParameters)var1;
         return var2.getP().equals(this.p) && var2.getQ().equals(this.q) && var2.getG().equals(this.g);
      }
   }

   public boolean gg(Object var1) {
      if (!(var1 instanceof DSAParameters)) {
         return false;
      } else {
         DSAParameters var2 = (DSAParameters)var1;
         return var2.getP().equals(this.p) && var2.getQ().equals(this.q) && var2.getG().equals(this.g);
      }
   }

   public int amy() {
      return this.getP().hashCode() ^ this.getQ().hashCode() ^ this.getG().hashCode();
   }

   public BigInteger getQ() {
      return this.q;
   }
}
