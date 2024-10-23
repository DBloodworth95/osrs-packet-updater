package org.bouncycastle.math.ec;

public class ScaleXPointMap implements ECPointMap {
   public final ECFieldElement scale;

   public ECPoint map(ECPoint var1) {
      return var1.scaleX(this.scale);
   }

   public ScaleXPointMap(ECFieldElement var1) {
      this.scale = var1;
   }
}
