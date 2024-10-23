package org.bouncycastle.asn1.pkcs;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class PrivateKeyInfo extends ASN1Object {
   AlgorithmIdentifier algId;
   ASN1OctetString privKey;
   ASN1Set attributes;

   /** @deprecated */
   public AlgorithmIdentifier getAlgorithmId() {
      return this.algId;
   }

   public static PrivateKeyInfo getInstance(Object var0) {
      if (var0 instanceof PrivateKeyInfo) {
         return (PrivateKeyInfo)var0;
      } else {
         return var0 != null ? new PrivateKeyInfo(ASN1Sequence.getInstance(var0)) : null;
      }
   }

   /** @deprecated */
   public ASN1Primitive getPrivateKey() {
      try {
         return this.parsePrivateKey().toASN1Primitive();
      } catch (IOException var2) {
         throw new IllegalStateException("unable to parse private key");
      }
   }

   public PrivateKeyInfo(AlgorithmIdentifier var1, ASN1Encodable var2, ASN1Set var3) throws IOException {
      this.privKey = new DEROctetString(var2.toASN1Primitive().getEncoded("DER"));
      this.algId = var1;
      this.attributes = var3;
   }

   /** @deprecated */
   public PrivateKeyInfo(ASN1Sequence var1) {
      Enumeration var2 = var1.getObjects();
      BigInteger var3 = ((ASN1Integer)var2.nextElement()).getValue();
      if (var3.intValue() != 0) {
         throw new IllegalArgumentException("wrong version for private key info");
      } else {
         this.algId = AlgorithmIdentifier.getInstance(var2.nextElement());
         this.privKey = ASN1OctetString.getInstance(var2.nextElement());
         if (var2.hasMoreElements()) {
            this.attributes = ASN1Set.getInstance((ASN1TaggedObject)var2.nextElement(), false);
         }

      }
   }

   public AlgorithmIdentifier getPrivateKeyAlgorithm() {
      return this.algId;
   }

   public PrivateKeyInfo(AlgorithmIdentifier var1, ASN1Encodable var2) throws IOException {
      this(var1, var2, (ASN1Set)null);
   }

   public ASN1Encodable parsePrivateKey() throws IOException {
      return ASN1Primitive.fromByteArray(this.privKey.getOctets());
   }

   public static PrivateKeyInfo getInstance(ASN1TaggedObject var0, boolean var1) {
      return getInstance(ASN1Sequence.getInstance(var0, var1));
   }

   public ASN1Set getAttributes() {
      return this.attributes;
   }

   public ASN1Primitive toASN1Primitive() {
      ASN1EncodableVector var1 = new ASN1EncodableVector();
      var1.add(new ASN1Integer(0L));
      var1.add(this.algId);
      var1.add(this.privKey);
      if (this.attributes != null) {
         var1.add(new DERTaggedObject(false, 0, this.attributes));
      }

      return new DERSequence(var1);
   }
}
