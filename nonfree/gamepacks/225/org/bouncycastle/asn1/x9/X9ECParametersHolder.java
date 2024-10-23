package org.bouncycastle.asn1.x9;

public abstract class X9ECParametersHolder {
   X9ECParameters params;

   public synchronized X9ECParameters getParameters() {
      if (this.params == null) {
         this.params = this.createParameters();
      }

      return this.params;
   }

   public abstract X9ECParameters createParameters();
}
