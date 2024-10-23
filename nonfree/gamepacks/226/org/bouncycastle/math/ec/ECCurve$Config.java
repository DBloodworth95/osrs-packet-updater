package org.bouncycastle.math.ec;

import org.bouncycastle.math.ec.endo.ECEndomorphism;

public class ECCurve$Config {
   // $FF: synthetic field
   final ECCurve this$0;
   public int coord;
   public ECMultiplier multiplier;
   public ECEndomorphism endomorphism;

   public ECCurve create() {
      if (!this.this$0.supportsCoordinateSystem(this.coord)) {
         throw new IllegalStateException("unsupported coordinate system");
      } else {
         ECCurve var1 = this.this$0.cloneCurve();
         if (var1 == this.this$0) {
            throw new IllegalStateException("implementation returned current curve");
         } else {
            synchronized(var1) {
               var1.coord = this.coord;
               var1.endomorphism = this.endomorphism;
               var1.multiplier = this.multiplier;
               return var1;
            }
         }
      }
   }

   public ECCurve$Config setCoordinateSystem(int var1) {
      this.coord = var1;
      return this;
   }

   public ECCurve$Config setEndomorphism(ECEndomorphism var1) {
      this.endomorphism = var1;
      return this;
   }

   public ECCurve$Config setMultiplier(ECMultiplier var1) {
      this.multiplier = var1;
      return this;
   }

   ECCurve$Config(ECCurve var1, int var2, ECEndomorphism var3, ECMultiplier var4) {
      this.this$0 = var1;
      this.coord = var2;
      this.endomorphism = var3;
      this.multiplier = var4;
   }
}
