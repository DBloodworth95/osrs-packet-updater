package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;

public class ECDomainParameters implements ECConstants {
   byte[] seed;
   ECCurve curve;
   ECPoint G;
   BigInteger n;
   BigInteger h;

   public int amy() {
      int var1 = this.curve.hashCode();
      var1 *= 37;
      var1 ^= this.G.hashCode();
      var1 *= 37;
      var1 ^= this.n.hashCode();
      var1 *= 37;
      var1 ^= this.h.hashCode();
      return var1;
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

   public ECCurve getCurve() {
      return this.curve;
   }

   public boolean gg(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof ECDomainParameters)) {
         return false;
      } else {
         ECDomainParameters var2 = (ECDomainParameters)var1;
         return this.curve.equals(var2.curve) && this.G.equals(var2.G) && this.n.equals(var2.n) && this.h.equals(var2.h);
      }
   }

   public ECDomainParameters(ECCurve var1, ECPoint var2, BigInteger var3) {
      this(var1, var2, var3, ONE, (byte[])null);
   }

   public BigInteger getH() {
      return this.h;
   }

   public byte[] getSeed() {
      return Arrays.clone(this.seed);
   }

   public ECPoint getG() {
      return this.G;
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

   public boolean gn(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof ECDomainParameters)) {
         return false;
      } else {
         ECDomainParameters var2 = (ECDomainParameters)var1;
         return this.curve.equals(var2.curve) && this.G.equals(var2.G) && this.n.equals(var2.n) && this.h.equals(var2.h);
      }
   }

   public BigInteger getN() {
      return this.n;
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

   public int amd() {
      int var1 = this.curve.hashCode();
      var1 *= 37;
      var1 ^= this.G.hashCode();
      var1 *= 37;
      var1 ^= this.n.hashCode();
      var1 *= 37;
      var1 ^= this.h.hashCode();
      return var1;
   }
}
