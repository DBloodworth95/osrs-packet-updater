import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

class ad implements TlsAuthentication {
   // $FF: synthetic field
   final ap this$2;

   public TlsCredentials ax(CertificateRequest var1) throws IOException {
      return null;
   }

   public void ae(Certificate var1) throws IOException {
      try {
         CertificateFactory var2 = CertificateFactory.getInstance("X.509");
         LinkedList var3 = new LinkedList();
         org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

         for(int var5 = 0; var5 < var4.length; ++var5) {
            org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
            var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
         }

         this.this$2.this$1.ac = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
      } catch (CertificateException var7) {
         throw new IOException(var7);
      }
   }

   public void notifyServerCertificate(Certificate var1) throws IOException {
      try {
         try {
            CertificateFactory var2 = CertificateFactory.getInstance("X.509");
            LinkedList var3 = new LinkedList();
            org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

            for(int var5 = 0; var5 < var4.length; ++var5) {
               org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
               var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
            }

            this.this$2.this$1.ac = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
         } catch (CertificateException var7) {
            throw new IOException(var7);
         }
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "ad.notifyServerCertificate(" + ')');
      }
   }

   public void ac(Certificate var1) throws IOException {
      try {
         CertificateFactory var2 = CertificateFactory.getInstance("X.509");
         LinkedList var3 = new LinkedList();
         org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

         for(int var5 = 0; var5 < var4.length; ++var5) {
            org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
            var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
         }

         this.this$2.this$1.ac = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
      } catch (CertificateException var7) {
         throw new IOException(var7);
      }
   }

   public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
      try {
         return null;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ad.getClientCredentials(" + ')');
      }
   }

   public void ag(Certificate var1) throws IOException {
      try {
         CertificateFactory var2 = CertificateFactory.getInstance("X.509");
         LinkedList var3 = new LinkedList();
         org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

         for(int var5 = 0; var5 < var4.length; ++var5) {
            org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
            var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
         }

         this.this$2.this$1.ac = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
      } catch (CertificateException var7) {
         throw new IOException(var7);
      }
   }

   public TlsCredentials am(CertificateRequest var1) throws IOException {
      return null;
   }

   ad(ap var1) {
      this.this$2 = var1;
   }
}
