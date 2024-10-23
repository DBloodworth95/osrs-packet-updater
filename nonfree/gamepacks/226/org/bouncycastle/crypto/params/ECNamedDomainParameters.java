package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

public class ECNamedDomainParameters extends ECDomainParameters {
   ASN1ObjectIdentifier name;

   public ASN1ObjectIdentifier getName() {
      return this.name;
   }

   public ECNamedDomainParameters(ASN1ObjectIdentifier var1, ECCurve var2, ECPoint var3, BigInteger var4, BigInteger var5) {
      this(var1, var2, var3, var4, var5, (byte[])null);
   }

   public ECNamedDomainParameters(ASN1ObjectIdentifier var1, ECCurve var2, ECPoint var3, BigInteger var4, BigInteger var5, byte[] var6) {
      super(var2, var3, var4, var5, var6);
      this.name = var1;
   }

   public ECNamedDomainParameters(ASN1ObjectIdentifier var1, ECCurve var2, ECPoint var3, BigInteger var4) {
      this(var1, var2, var3, var4, (BigInteger)null, (byte[])null);
   }
}
