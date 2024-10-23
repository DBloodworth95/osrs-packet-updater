package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;

public class ECDomainParameters implements ECConstants {
   ECPoint G;
   byte[] seed;
   ECCurve curve;
   BigInteger n;
   BigInteger h;

   public ECDomainParameters(ECCurve var1, ECPoint var2, BigInteger var3) {
      this(var1, var2, var3, ONE, (byte[])null);
   }

   public ECDomainParameters(ECCurve var1, ECPoint var2, BigInteger var3, BigInteger var4) {
      this(var1, var2, var3, var4, (byte[])null);
   }

   public ECDomainParameters(ECCurve var1, ECPoint var2, BigInteger var3, BigInteger var4, byte[] var5) {
      this.curve = var1;
      this.G = var2.normalize();
      this.n = var3;
      this.h = var4;
      this.seed = var5;
   }

   public byte[] getSeed() {
      return Arrays.clone(this.seed);
   }

   public ECPoint getG() {
      return this.G;
   }

   public BigInteger getN() {
      return this.n;
   }

   public BigInteger getH() {
      return this.h;
   }

   public ECCurve getCurve() {
      return this.curve;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof ECDomainParameters)) {
         return false;
      } else {
         ECDomainParameters var2 = (ECDomainParameters)var1;
         return this.curve.equals(var2.curve) && this.G.equals(var2.G) && this.n.equals(var2.n) && this.h.equals(var2.h);
      }
   }

   public int amg() {
      int var1 = this.curve.hashCode();
      var1 *= 37;
      var1 ^= this.G.hashCode();
      var1 *= 37;
      var1 ^= this.n.hashCode();
      var1 *= 37;
      var1 ^= this.h.hashCode();
      return var1;
   }

   public boolean gj(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof ECDomainParameters)) {
         return false;
      } else {
         ECDomainParameters var2 = (ECDomainParameters)var1;
         return this.curve.equals(var2.curve) && this.G.equals(var2.G) && this.n.equals(var2.n) && this.h.equals(var2.h);
      }
   }

   public int ams() {
      int var1 = this.curve.hashCode();
      var1 *= 37;
      var1 ^= this.G.hashCode();
      var1 *= 37;
      var1 ^= this.n.hashCode();
      var1 *= 37;
      var1 ^= this.h.hashCode();
      return var1;
   }

   public int amf() {
      int var1 = this.curve.hashCode();
      var1 *= 37;
      var1 ^= this.G.hashCode();
      var1 *= 385052893;
      var1 ^= this.n.hashCode();
      var1 *= -1554791823;
      var1 ^= this.h.hashCode();
      return var1;
   }

   public int amb() {
      int var1 = this.curve.hashCode();
      var1 *= 37;
      var1 ^= this.G.hashCode();
      var1 *= 37;
      var1 ^= this.n.hashCode();
      var1 *= 37;
      var1 ^= this.h.hashCode();
      return var1;
   }

   public int hashCode() {
      int var1 = this.curve.hashCode();
      var1 *= 37;
      var1 ^= this.G.hashCode();
      var1 *= 37;
      var1 ^= this.n.hashCode();
      var1 *= 37;
      var1 ^= this.h.hashCode();
      return var1;
   }

   public int aml() {
      int var1 = this.curve.hashCode();
      var1 *= 171146971;
      var1 ^= this.G.hashCode();
      var1 *= -1373403944;
      var1 ^= this.n.hashCode();
      var1 *= 37;
      var1 ^= this.h.hashCode();
      return var1;
   }
}
