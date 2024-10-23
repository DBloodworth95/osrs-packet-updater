package org.bouncycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x500.X500Name;

public class CertificateRequest {
   public short[] certificateTypes;
   public Vector supportedSignatureAlgorithms;
   public Vector certificateAuthorities;

   public Vector getCertificateAuthorities() {
      return this.certificateAuthorities;
   }

   public short[] getCertificateTypes() {
      return this.certificateTypes;
   }

   public Vector getSupportedSignatureAlgorithms() {
      return this.supportedSignatureAlgorithms;
   }

   public void encode(OutputStream var1) throws IOException {
      if (this.certificateTypes != null && this.certificateTypes.length != 0) {
         TlsUtils.writeUint8ArrayWithUint8Length(this.certificateTypes, var1);
      } else {
         TlsUtils.writeUint8((int)0, var1);
      }

      if (this.supportedSignatureAlgorithms != null) {
         TlsUtils.encodeSupportedSignatureAlgorithms(this.supportedSignatureAlgorithms, false, var1);
      }

      if (this.certificateAuthorities != null && !this.certificateAuthorities.isEmpty()) {
         Vector var2 = new Vector(this.certificateAuthorities.size());
         int var3 = 0;

         int var4;
         for(var4 = 0; var4 < this.certificateAuthorities.size(); ++var4) {
            X500Name var5 = (X500Name)this.certificateAuthorities.elementAt(var4);
            byte[] var6 = var5.getEncoded("DER");
            var2.addElement(var6);
            var3 += var6.length + 2;
         }

         TlsUtils.checkUint16(var3);
         TlsUtils.writeUint16(var3, var1);

         for(var4 = 0; var4 < var2.size(); ++var4) {
            byte[] var7 = (byte[])((byte[])var2.elementAt(var4));
            TlsUtils.writeOpaque16(var7, var1);
         }
      } else {
         TlsUtils.writeUint16(0, var1);
      }

   }

   public static CertificateRequest parse(TlsContext var0, InputStream var1) throws IOException {
      short var2 = TlsUtils.readUint8(var1);
      short[] var3 = new short[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = TlsUtils.readUint8(var1);
      }

      Vector var10 = null;
      if (TlsUtils.isTLSv12(var0)) {
         var10 = TlsUtils.parseSupportedSignatureAlgorithms(false, var1);
      }

      Vector var5 = new Vector();
      byte[] var6 = TlsUtils.readOpaque16(var1);
      ByteArrayInputStream var7 = new ByteArrayInputStream(var6);

      while(var7.available() > 0) {
         byte[] var8 = TlsUtils.readOpaque16(var7);
         ASN1Primitive var9 = TlsUtils.readDERObject(var8);
         var5.addElement(X500Name.getInstance(var9));
      }

      return new CertificateRequest(var3, var10, var5);
   }

   public CertificateRequest(short[] var1, Vector var2, Vector var3) {
      this.certificateTypes = var1;
      this.supportedSignatureAlgorithms = var2;
      this.certificateAuthorities = var3;
   }
}
