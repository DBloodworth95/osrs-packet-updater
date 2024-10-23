package org.bouncycastle.asn1.x509;

import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;

public class SubjectPublicKeyInfo extends ASN1Object {
   DERBitString keyData;
   AlgorithmIdentifier algId;

   public static SubjectPublicKeyInfo getInstance(Object var0) {
      if (var0 instanceof SubjectPublicKeyInfo) {
         return (SubjectPublicKeyInfo)var0;
      } else {
         return var0 != null ? new SubjectPublicKeyInfo(ASN1Sequence.getInstance(var0)) : null;
      }
   }

   public SubjectPublicKeyInfo(AlgorithmIdentifier var1, ASN1Encodable var2) throws IOException {
      this.keyData = new DERBitString(var2);
      this.algId = var1;
   }

   /** @deprecated */
   public AlgorithmIdentifier getAlgorithmId() {
      return this.algId;
   }

   public SubjectPublicKeyInfo(AlgorithmIdentifier var1, byte[] var2) {
      this.keyData = new DERBitString(var2);
      this.algId = var1;
   }

   public ASN1Primitive toASN1Primitive() {
      ASN1EncodableVector var1 = new ASN1EncodableVector();
      var1.add(this.algId);
      var1.add(this.keyData);
      return new DERSequence(var1);
   }

   public AlgorithmIdentifier getAlgorithm() {
      return this.algId;
   }

   /** @deprecated */
   public SubjectPublicKeyInfo(ASN1Sequence var1) {
      if (var1.size() != 2) {
         throw new IllegalArgumentException("Bad sequence size: " + var1.size());
      } else {
         Enumeration var2 = var1.getObjects();
         this.algId = AlgorithmIdentifier.getInstance(var2.nextElement());
         this.keyData = DERBitString.getInstance(var2.nextElement());
      }
   }

   public static SubjectPublicKeyInfo getInstance(ASN1TaggedObject var0, boolean var1) {
      return getInstance(ASN1Sequence.getInstance(var0, var1));
   }

   /** @deprecated */
   public ASN1Primitive getPublicKey() throws IOException {
      ASN1InputStream var1 = new ASN1InputStream(this.keyData.getOctets());
      return var1.readObject();
   }

   public DERBitString getPublicKeyData() {
      return this.keyData;
   }

   public ASN1Primitive parsePublicKey() throws IOException {
      ASN1InputStream var1 = new ASN1InputStream(this.keyData.getOctets());
      return var1.readObject();
   }
}
