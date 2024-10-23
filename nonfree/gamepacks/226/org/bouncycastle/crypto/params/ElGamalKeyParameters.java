package org.bouncycastle.crypto.params;

public class ElGamalKeyParameters extends AsymmetricKeyParameter {
   ElGamalParameters params;

   public int ams() {
      return this.params != null ? this.params.hashCode() : 0;
   }

   public ElGamalParameters getParameters() {
      return this.params;
   }

   public int hashCode() {
      return this.params != null ? this.params.hashCode() : 0;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof ElGamalKeyParameters)) {
         return false;
      } else {
         ElGamalKeyParameters var2 = (ElGamalKeyParameters)var1;
         if (this.params == null) {
            return var2.getParameters() == null;
         } else {
            return this.params.equals(var2.getParameters());
         }
      }
   }

   public ElGamalKeyParameters(boolean var1, ElGamalParameters var2) {
      super(var1);
      this.params = var2;
   }

   public boolean gj(Object var1) {
      if (!(var1 instanceof ElGamalKeyParameters)) {
         return false;
      } else {
         ElGamalKeyParameters var2 = (ElGamalKeyParameters)var1;
         if (this.params == null) {
            return var2.getParameters() == null;
         } else {
            return this.params.equals(var2.getParameters());
         }
      }
   }

   public int amf() {
      return this.params != null ? this.params.hashCode() : 0;
   }

   public int amb() {
      return this.params != null ? this.params.hashCode() : 0;
   }

   public int amg() {
      return this.params != null ? this.params.hashCode() : 0;
   }

   public int aml() {
      return this.params != null ? this.params.hashCode() : 0;
   }
}
