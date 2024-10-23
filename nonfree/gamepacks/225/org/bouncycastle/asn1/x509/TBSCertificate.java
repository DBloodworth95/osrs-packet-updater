package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.x500.X500Name;

public class TBSCertificate extends ASN1Object {
   DERBitString subjectUniqueId;
   Extensions extensions;
   ASN1Integer version;
   AlgorithmIdentifier signature;
   ASN1Sequence seq;
   Time startDate;
   Time endDate;
   X500Name subject;
   SubjectPublicKeyInfo subjectPublicKeyInfo;
   DERBitString issuerUniqueId;
   ASN1Integer serialNumber;
   X500Name issuer;

   public Time getEndDate() {
      return this.endDate;
   }

   public static TBSCertificate getInstance(Object var0) {
      if (var0 instanceof TBSCertificate) {
         return (TBSCertificate)var0;
      } else {
         return var0 != null ? new TBSCertificate(ASN1Sequence.getInstance(var0)) : null;
      }
   }

   public Extensions getExtensions() {
      return this.extensions;
   }

   public int getVersionNumber() {
      return this.version.getValue().intValue() + 1;
   }

   TBSCertificate(ASN1Sequence var1) {
      byte var2 = 0;
      this.seq = var1;
      if (var1.getObjectAt(0) instanceof ASN1TaggedObject) {
         this.version = ASN1Integer.getInstance((ASN1TaggedObject)var1.getObjectAt(0), true);
      } else {
         var2 = -1;
         this.version = new ASN1Integer(0L);
      }

      this.serialNumber = ASN1Integer.getInstance(var1.getObjectAt(var2 + 1));
      this.signature = AlgorithmIdentifier.getInstance(var1.getObjectAt(var2 + 2));
      this.issuer = X500Name.getInstance(var1.getObjectAt(var2 + 3));
      ASN1Sequence var3 = (ASN1Sequence)var1.getObjectAt(var2 + 4);
      this.startDate = Time.getInstance(var3.getObjectAt(0));
      this.endDate = Time.getInstance(var3.getObjectAt(1));
      this.subject = X500Name.getInstance(var1.getObjectAt(var2 + 5));
      this.subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(var1.getObjectAt(var2 + 6));

      for(int var4 = var1.size() - (var2 + 6) - 1; var4 > 0; --var4) {
         ASN1TaggedObject var5 = (ASN1TaggedObject)var1.getObjectAt(var2 + 6 + var4);
         switch(var5.getTagNo()) {
         case 1:
            this.issuerUniqueId = DERBitString.getInstance(var5, false);
            break;
         case 2:
            this.subjectUniqueId = DERBitString.getInstance(var5, false);
            break;
         case 3:
            this.extensions = Extensions.getInstance(ASN1Sequence.getInstance(var5, true));
         }
      }

   }

   public ASN1Integer getSerialNumber() {
      return this.serialNumber;
   }

   public ASN1Integer getVersion() {
      return this.version;
   }

   public static TBSCertificate getInstance(ASN1TaggedObject var0, boolean var1) {
      return getInstance(ASN1Sequence.getInstance(var0, var1));
   }

   public AlgorithmIdentifier getSignature() {
      return this.signature;
   }

   public X500Name getIssuer() {
      return this.issuer;
   }

   public Time getStartDate() {
      return this.startDate;
   }

   public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
      return this.subjectPublicKeyInfo;
   }

   public DERBitString getIssuerUniqueId() {
      return this.issuerUniqueId;
   }

   public DERBitString getSubjectUniqueId() {
      return this.subjectUniqueId;
   }

   public X500Name getSubject() {
      return this.subject;
   }

   public ASN1Primitive toASN1Primitive() {
      return this.seq;
   }
}
