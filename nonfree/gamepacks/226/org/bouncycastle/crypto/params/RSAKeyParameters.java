package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class RSAKeyParameters extends AsymmetricKeyParameter {
   BigInteger exponent;
   BigInteger modulus;
   static final BigInteger ONE = BigInteger.valueOf(1L);

   public RSAKeyParameters(boolean var1, BigInteger var2, BigInteger var3) {
      super(var1);
      if (!var1 && (var3.intValue() & 1) == 0) {
         throw new IllegalArgumentException("RSA publicExponent is even");
      } else {
         this.modulus = this.validate(var2);
         this.exponent = var3;
      }
   }

   BigInteger validate(BigInteger var1) {
      if ((var1.intValue() & 1) == 0) {
         throw new IllegalArgumentException("RSA modulus is even");
      } else if (!var1.gcd(new BigInteger("1451887755777639901511587432083070202422614380984889313550570919659315177065956574359078912654149167643992684236991305777574330831666511589145701059710742276692757882915756220901998212975756543223550490431013061082131040808010565293748926901442915057819663730454818359472391642885328171302299245556663073719855")).equals(ONE)) {
         throw new IllegalArgumentException("RSA modulus has a small prime factor");
      } else {
         return var1;
      }
   }

   public BigInteger getModulus() {
      return this.modulus;
   }

   public BigInteger getExponent() {
      return this.exponent;
   }
}
