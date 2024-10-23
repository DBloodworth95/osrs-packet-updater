package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class DHPrivateKeyParameters extends DHKeyParameters {
   BigInteger x;

   public int aml() {
      return this.x.hashCode() ^ super.hashCode();
   }

   public BigInteger getX() {
      return this.x;
   }

   public int hashCode() {
      return this.x.hashCode() ^ super.hashCode();
   }

   public DHPrivateKeyParameters(BigInteger var1, DHParameters var2) {
      super(true, var2);
      this.x = var1;
   }

   public int amb() {
      return this.x.hashCode() ^ super.hashCode();
   }

   public int ams() {
      return this.x.hashCode() ^ super.hashCode();
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof DHPrivateKeyParameters)) {
         return false;
      } else {
         DHPrivateKeyParameters var2 = (DHPrivateKeyParameters)var1;
         return var2.getX().equals(this.x) && super.equals(var1);
      }
   }

   public boolean gj(Object var1) {
      if (!(var1 instanceof DHPrivateKeyParameters)) {
         return false;
      } else {
         DHPrivateKeyParameters var2 = (DHPrivateKeyParameters)var1;
         return var2.getX().equals(this.x) && super.equals(var1);
      }
   }

   public int amg() {
      return this.x.hashCode() ^ super.hashCode();
   }

   public int amf() {
      return this.x.hashCode() ^ super.hashCode();
   }
}
