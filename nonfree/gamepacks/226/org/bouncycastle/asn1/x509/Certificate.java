package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.x500.X500Name;

public class Certificate extends ASN1Object {
   AlgorithmIdentifier sigAlgId;
   TBSCertificate tbsCert;
   DERBitString sig;
   ASN1Sequence seq;

   public X500Name getIssuer() {
      return this.tbsCert.getIssuer();
   }

   public X500Name getSubject() {
      return this.tbsCert.getSubject();
   }

   Certificate(ASN1Sequence var1) {
      this.seq = var1;
      if (var1.size() == 3) {
         this.tbsCert = TBSCertificate.getInstance(var1.getObjectAt(0));
         this.sigAlgId = AlgorithmIdentifier.getInstance(var1.getObjectAt(1));
         this.sig = DERBitString.getInstance(var1.getObjectAt(2));
      } else {
         throw new IllegalArgumentException("sequence wrong size for a certificate");
      }
   }

   public static Certificate getInstance(ASN1TaggedObject var0, boolean var1) {
      return getInstance(ASN1Sequence.getInstance(var0, var1));
   }

   public ASN1Integer getVersion() {
      return this.tbsCert.getVersion();
   }

   public int getVersionNumber() {
      return this.tbsCert.getVersionNumber();
   }

   public ASN1Integer getSerialNumber() {
      return this.tbsCert.getSerialNumber();
   }

   public TBSCertificate getTBSCertificate() {
      return this.tbsCert;
   }

   public Time getStartDate() {
      return this.tbsCert.getStartDate();
   }

   public Time getEndDate() {
      return this.tbsCert.getEndDate();
   }

   public DERBitString getSignature() {
      return this.sig;
   }

   public static Certificate getInstance(Object var0) {
      if (var0 instanceof Certificate) {
         return (Certificate)var0;
      } else {
         return var0 != null ? new Certificate(ASN1Sequence.getInstance(var0)) : null;
      }
   }

   public AlgorithmIdentifier getSignatureAlgorithm() {
      return this.sigAlgId;
   }

   public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
      return this.tbsCert.getSubjectPublicKeyInfo();
   }

   public ASN1Primitive toASN1Primitive() {
      return this.seq;
   }
}
