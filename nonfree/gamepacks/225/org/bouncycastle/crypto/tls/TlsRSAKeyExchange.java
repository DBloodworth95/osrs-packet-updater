package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.util.PublicKeyFactory;
import org.bouncycastle.util.io.Streams;

public class TlsRSAKeyExchange extends AbstractTlsKeyExchange {
   public RSAKeyParameters rsaServerPublicKey = null;
   public AsymmetricKeyParameter serverPublicKey = null;
   public TlsEncryptionCredentials serverCredentials = null;
   public byte[] premasterSecret;

   public void processServerCertificate(Certificate var1) throws IOException {
      if (var1.isEmpty()) {
         throw new TlsFatalAlert((short)42);
      } else {
         org.bouncycastle.asn1.x509.Certificate var2 = var1.getCertificateAt(0);
         SubjectPublicKeyInfo var3 = var2.getSubjectPublicKeyInfo();

         try {
            this.serverPublicKey = PublicKeyFactory.createKey(var3);
         } catch (RuntimeException var5) {
            throw new TlsFatalAlert((short)43, var5);
         }

         if (this.serverPublicKey.isPrivate()) {
            throw new TlsFatalAlert((short)80);
         } else {
            this.rsaServerPublicKey = this.validateRSAPublicKey((RSAKeyParameters)this.serverPublicKey);
            TlsUtils.validateKeyUsage(var2, 32);
            super.processServerCertificate(var1);
         }
      }
   }

   public void generateClientKeyExchange(OutputStream var1) throws IOException {
      this.premasterSecret = TlsRSAUtils.generateEncryptedPreMasterSecret(this.context, this.rsaServerPublicKey, var1);
   }

   public void processServerCredentials(TlsCredentials var1) throws IOException {
      if (!(var1 instanceof TlsEncryptionCredentials)) {
         throw new TlsFatalAlert((short)80);
      } else {
         this.processServerCertificate(var1.getCertificate());
         this.serverCredentials = (TlsEncryptionCredentials)var1;
      }
   }

   public void skipServerCredentials() throws IOException {
      throw new TlsFatalAlert((short)10);
   }

   public void validateCertificateRequest(CertificateRequest var1) throws IOException {
      short[] var2 = var1.getCertificateTypes();
      int var3 = 0;

      while(var3 < var2.length) {
         switch(var2[var3]) {
         case 1:
         case 2:
         case 64:
            ++var3;
            break;
         default:
            throw new TlsFatalAlert((short)47);
         }
      }

   }

   public void processClientCredentials(TlsCredentials var1) throws IOException {
      if (!(var1 instanceof TlsSignerCredentials)) {
         throw new TlsFatalAlert((short)80);
      }
   }

   public TlsRSAKeyExchange(Vector var1) {
      super(1, var1);
   }

   public void processClientKeyExchange(InputStream var1) throws IOException {
      byte[] var2;
      if (TlsUtils.isSSL(this.context)) {
         var2 = Streams.readAll(var1);
      } else {
         var2 = TlsUtils.readOpaque16(var1);
      }

      this.premasterSecret = this.serverCredentials.decryptPreMasterSecret(var2);
   }

   public byte[] generatePremasterSecret() throws IOException {
      if (this.premasterSecret == null) {
         throw new TlsFatalAlert((short)80);
      } else {
         byte[] var1 = this.premasterSecret;
         this.premasterSecret = null;
         return var1;
      }
   }

   public RSAKeyParameters validateRSAPublicKey(RSAKeyParameters var1) throws IOException {
      if (!var1.getExponent().isProbablePrime(2)) {
         throw new TlsFatalAlert((short)47);
      } else {
         return var1;
      }
   }
}
