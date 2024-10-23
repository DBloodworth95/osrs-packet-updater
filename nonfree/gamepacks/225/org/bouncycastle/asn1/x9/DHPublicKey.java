package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;

public class DHPublicKey extends ASN1Object {
   ASN1Integer y;

   public BigInteger getY() {
      return this.y.getPositiveValue();
   }

   public static DHPublicKey getInstance(Object var0) {
      if (var0 != null && !(var0 instanceof DHPublicKey)) {
         if (var0 instanceof ASN1Integer) {
            return new DHPublicKey((ASN1Integer)var0);
         } else {
            throw new IllegalArgumentException("Invalid DHPublicKey: " + var0.getClass().getName());
         }
      } else {
         return (DHPublicKey)var0;
      }
   }

   DHPublicKey(ASN1Integer var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("'y' cannot be null");
      } else {
         this.y = var1;
      }
   }

   public DHPublicKey(BigInteger var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("'y' cannot be null");
      } else {
         this.y = new ASN1Integer(var1);
      }
   }

   public ASN1Primitive toASN1Primitive() {
      return this.y;
   }

   public static DHPublicKey getInstance(ASN1TaggedObject var0, boolean var1) {
      return getInstance(ASN1Integer.getInstance(var0, var1));
   }
}
