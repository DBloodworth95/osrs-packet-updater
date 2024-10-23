package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class ElGamalPublicKeyParameters extends ElGamalKeyParameters {
   BigInteger y;

   public int amf() {
      return this.y.hashCode() ^ super.hashCode();
   }

   public BigInteger getY() {
      return this.y;
   }

   public int hashCode() {
      return this.y.hashCode() ^ super.hashCode();
   }

   public ElGamalPublicKeyParameters(BigInteger var1, ElGamalParameters var2) {
      super(false, var2);
      this.y = var1;
   }

   public boolean gj(Object var1) {
      if (!(var1 instanceof ElGamalPublicKeyParameters)) {
         return false;
      } else {
         ElGamalPublicKeyParameters var2 = (ElGamalPublicKeyParameters)var1;
         return var2.getY().equals(this.y) && super.equals(var1);
      }
   }

   public int ams() {
      return this.y.hashCode() ^ super.hashCode();
   }

   public int amg() {
      return this.y.hashCode() ^ super.hashCode();
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof ElGamalPublicKeyParameters)) {
         return false;
      } else {
         ElGamalPublicKeyParameters var2 = (ElGamalPublicKeyParameters)var1;
         return var2.getY().equals(this.y) && super.equals(var1);
      }
   }

   public int amb() {
      return this.y.hashCode() ^ super.hashCode();
   }

   public int aml() {
      return this.y.hashCode() ^ super.hashCode();
   }
}
