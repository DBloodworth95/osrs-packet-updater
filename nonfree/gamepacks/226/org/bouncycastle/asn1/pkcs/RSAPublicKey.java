package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

public class RSAPublicKey extends ASN1Object {
   BigInteger publicExponent;
   BigInteger modulus;

   public RSAPublicKey(BigInteger var1, BigInteger var2) {
      this.modulus = var1;
      this.publicExponent = var2;
   }

   public static RSAPublicKey getInstance(ASN1TaggedObject var0, boolean var1) {
      return getInstance(ASN1Sequence.getInstance(var0, var1));
   }

   public static RSAPublicKey getInstance(Object var0) {
      if (var0 instanceof RSAPublicKey) {
         return (RSAPublicKey)var0;
      } else {
         return var0 != null ? new RSAPublicKey(ASN1Sequence.getInstance(var0)) : null;
      }
   }

   RSAPublicKey(ASN1Sequence var1) {
      if (var1.size() != 2) {
         throw new IllegalArgumentException("Bad sequence size: " + var1.size());
      } else {
         Enumeration var2 = var1.getObjects();
         this.modulus = ASN1Integer.getInstance(var2.nextElement()).getPositiveValue();
         this.publicExponent = ASN1Integer.getInstance(var2.nextElement()).getPositiveValue();
      }
   }

   public BigInteger getModulus() {
      return this.modulus;
   }

   public BigInteger getPublicExponent() {
      return this.publicExponent;
   }

   public ASN1Primitive toASN1Primitive() {
      ASN1EncodableVector var1 = new ASN1EncodableVector();
      var1.add(new ASN1Integer(this.getModulus()));
      var1.add(new ASN1Integer(this.getPublicExponent()));
      return new DERSequence(var1);
   }
}
