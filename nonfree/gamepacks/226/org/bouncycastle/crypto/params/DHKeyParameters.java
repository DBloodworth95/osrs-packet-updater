package org.bouncycastle.crypto.params;

public class DHKeyParameters extends AsymmetricKeyParameter {
   DHParameters params;

   public int amg() {
      int var1 = this.isPrivate() ? 0 : 1;
      if (this.params != null) {
         var1 ^= this.params.hashCode();
      }

      return var1;
   }

   public DHParameters getParameters() {
      return this.params;
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof DHKeyParameters)) {
         return false;
      } else {
         DHKeyParameters var2 = (DHKeyParameters)var1;
         if (this.params == null) {
            return var2.getParameters() == null;
         } else {
            return this.params.equals(var2.getParameters());
         }
      }
   }

   public int hashCode() {
      int var1 = this.isPrivate() ? 0 : 1;
      if (this.params != null) {
         var1 ^= this.params.hashCode();
      }

      return var1;
   }

   public int amf() {
      int var1 = this.isPrivate() ? 0 : 1;
      if (this.params != null) {
         var1 ^= this.params.hashCode();
      }

      return var1;
   }

   public int ams() {
      int var1 = this.isPrivate() ? 0 : 1;
      if (this.params != null) {
         var1 ^= this.params.hashCode();
      }

      return var1;
   }

   public boolean gj(Object var1) {
      if (!(var1 instanceof DHKeyParameters)) {
         return false;
      } else {
         DHKeyParameters var2 = (DHKeyParameters)var1;
         if (this.params == null) {
            return var2.getParameters() == null;
         } else {
            return this.params.equals(var2.getParameters());
         }
      }
   }

   public int amb() {
      int var1 = this.isPrivate() ? 0 : 1;
      if (this.params != null) {
         var1 ^= this.params.hashCode();
      }

      return var1;
   }

   public DHKeyParameters(boolean var1, DHParameters var2) {
      super(var1);
      this.params = var2;
   }

   public int aml() {
      int var1 = this.isPrivate() ? 0 : 1;
      if (this.params != null) {
         var1 ^= this.params.hashCode();
      }

      return var1;
   }
}
