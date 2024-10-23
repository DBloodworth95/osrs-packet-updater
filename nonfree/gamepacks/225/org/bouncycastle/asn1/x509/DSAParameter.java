package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

public class DSAParameter extends ASN1Object {
   ASN1Integer q;
   ASN1Integer p;
   ASN1Integer g;

   public BigInteger getP() {
      return this.p.getPositiveValue();
   }

   public static DSAParameter getInstance(Object var0) {
      if (var0 instanceof DSAParameter) {
         return (DSAParameter)var0;
      } else {
         return var0 != null ? new DSAParameter(ASN1Sequence.getInstance(var0)) : null;
      }
   }

   public BigInteger getG() {
      return this.g.getPositiveValue();
   }

   DSAParameter(ASN1Sequence var1) {
      if (var1.size() != 3) {
         throw new IllegalArgumentException("Bad sequence size: " + var1.size());
      } else {
         Enumeration var2 = var1.getObjects();
         this.p = ASN1Integer.getInstance(var2.nextElement());
         this.q = ASN1Integer.getInstance(var2.nextElement());
         this.g = ASN1Integer.getInstance(var2.nextElement());
      }
   }

   public DSAParameter(BigInteger var1, BigInteger var2, BigInteger var3) {
      this.p = new ASN1Integer(var1);
      this.q = new ASN1Integer(var2);
      this.g = new ASN1Integer(var3);
   }

   public BigInteger getQ() {
      return this.q.getPositiveValue();
   }

   public static DSAParameter getInstance(ASN1TaggedObject var0, boolean var1) {
      return getInstance(ASN1Sequence.getInstance(var0, var1));
   }

   public ASN1Primitive toASN1Primitive() {
      ASN1EncodableVector var1 = new ASN1EncodableVector();
      var1.add(this.p);
      var1.add(this.q);
      var1.add(this.g);
      return new DERSequence(var1);
   }
}
