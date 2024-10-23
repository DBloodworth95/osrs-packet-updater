package org.bouncycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Primitive;

public class Certificate {
   public org.bouncycastle.asn1.x509.Certificate[] certificateList;
   public static final Certificate EMPTY_CHAIN = new Certificate(new org.bouncycastle.asn1.x509.Certificate[0]);

   public Certificate(org.bouncycastle.asn1.x509.Certificate[] var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("'certificateList' cannot be null");
      } else {
         this.certificateList = var1;
      }
   }

   public org.bouncycastle.asn1.x509.Certificate[] getCertificateList() {
      return this.cloneCertificateList();
   }

   public org.bouncycastle.asn1.x509.Certificate getCertificateAt(int var1) {
      return this.certificateList[var1];
   }

   public int getLength() {
      return this.certificateList.length;
   }

   public void encode(OutputStream var1) throws IOException {
      Vector var2 = new Vector(this.certificateList.length);
      int var3 = 0;

      int var4;
      byte[] var5;
      for(var4 = 0; var4 < this.certificateList.length; ++var4) {
         var5 = this.certificateList[var4].getEncoded("DER");
         var2.addElement(var5);
         var3 += var5.length + 3;
      }

      TlsUtils.checkUint24(var3);
      TlsUtils.writeUint24(var3, var1);

      for(var4 = 0; var4 < var2.size(); ++var4) {
         var5 = (byte[])((byte[])var2.elementAt(var4));
         TlsUtils.writeOpaque24(var5, var1);
      }

   }

   public boolean isEmpty() {
      return this.certificateList.length == 0;
   }

   public static Certificate parse(InputStream var0) throws IOException {
      int var1 = TlsUtils.readUint24(var0);
      if (var1 == 0) {
         return EMPTY_CHAIN;
      } else {
         byte[] var2 = TlsUtils.readFully(var1, var0);
         ByteArrayInputStream var3 = new ByteArrayInputStream(var2);
         Vector var4 = new Vector();

         while(var3.available() > 0) {
            byte[] var5 = TlsUtils.readOpaque24(var3);
            ASN1Primitive var6 = TlsUtils.readDERObject(var5);
            var4.addElement(org.bouncycastle.asn1.x509.Certificate.getInstance(var6));
         }

         org.bouncycastle.asn1.x509.Certificate[] var7 = new org.bouncycastle.asn1.x509.Certificate[var4.size()];

         for(int var8 = 0; var8 < var4.size(); ++var8) {
            var7[var8] = (org.bouncycastle.asn1.x509.Certificate)var4.elementAt(var8);
         }

         return new Certificate(var7);
      }
   }

   public org.bouncycastle.asn1.x509.Certificate[] cloneCertificateList() {
      org.bouncycastle.asn1.x509.Certificate[] var1 = new org.bouncycastle.asn1.x509.Certificate[this.certificateList.length];
      System.arraycopy(this.certificateList, 0, var1, 0, var1.length);
      return var1;
   }
}
