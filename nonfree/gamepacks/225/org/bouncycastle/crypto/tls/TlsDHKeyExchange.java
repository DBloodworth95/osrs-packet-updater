package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Vector;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.util.PublicKeyFactory;

public class TlsDHKeyExchange extends AbstractTlsKeyExchange {
   public TlsAgreementCredentials agreementCredentials;
   public TlsSigner tlsSigner;
   public AsymmetricKeyParameter serverPublicKey;
   public DHParameters dhParameters;
   public DHPrivateKeyParameters dhAgreePrivateKey;
   public DHPublicKeyParameters dhAgreePublicKey;

   public int getMinimumPrimeBits() {
      return 1024;
   }

   public void init(TlsContext var1) {
      super.init(var1);
      if (this.tlsSigner != null) {
         this.tlsSigner.init(var1);
      }

   }

   public void skipServerCredentials() throws IOException {
      throw new TlsFatalAlert((short)10);
   }

   public void processServerCertificate(Certificate var1) throws IOException {
      if (var1.isEmpty()) {
         throw new TlsFatalAlert((short)42);
      } else {
         org.bouncycastle.asn1.x509.Certificate var2 = var1.getCertificateAt(0);
         SubjectPublicKeyInfo var3 = var2.getSubjectPublicKeyInfo();

         try {
            this.serverPublicKey = PublicKeyFactory.createKey(var3);
         } catch (RuntimeException var6) {
            throw new TlsFatalAlert((short)43, var6);
         }

         if (this.tlsSigner == null) {
            try {
               this.dhAgreePublicKey = TlsDHUtils.validateDHPublicKey((DHPublicKeyParameters)this.serverPublicKey);
               this.dhParameters = this.validateDHParameters(this.dhAgreePublicKey.getParameters());
            } catch (ClassCastException var5) {
               throw new TlsFatalAlert((short)46, var5);
            }

            TlsUtils.validateKeyUsage(var2, 8);
         } else {
            if (!this.tlsSigner.isValidPublicKey(this.serverPublicKey)) {
               throw new TlsFatalAlert((short)46);
            }

            TlsUtils.validateKeyUsage(var2, 128);
         }

         super.processServerCertificate(var1);
      }
   }

   public void processClientCredentials(TlsCredentials var1) throws IOException {
      if (var1 instanceof TlsAgreementCredentials) {
         this.agreementCredentials = (TlsAgreementCredentials)var1;
      } else if (!(var1 instanceof TlsSignerCredentials)) {
         throw new TlsFatalAlert((short)80);
      }

   }

   public void validateCertificateRequest(CertificateRequest var1) throws IOException {
      short[] var2 = var1.getCertificateTypes();
      int var3 = 0;

      while(var3 < var2.length) {
         switch(var2[var3]) {
         case 1:
         case 2:
         case 3:
         case 4:
         case 64:
            ++var3;
            break;
         default:
            throw new TlsFatalAlert((short)47);
         }
      }

   }

   public boolean requiresServerKeyExchange() {
      switch(this.keyExchange) {
      case 3:
      case 5:
      case 11:
         return true;
      default:
         return false;
      }
   }

   public void generateClientKeyExchange(OutputStream var1) throws IOException {
      if (this.agreementCredentials == null) {
         this.dhAgreePrivateKey = TlsDHUtils.generateEphemeralClientKeyExchange(this.context.getSecureRandom(), this.dhParameters, var1);
      }

   }

   public void processClientCertificate(Certificate var1) throws IOException {
   }

   public void processClientKeyExchange(InputStream var1) throws IOException {
      if (this.dhAgreePublicKey == null) {
         BigInteger var2 = TlsDHUtils.readDHParameter(var1);
         this.dhAgreePublicKey = TlsDHUtils.validateDHPublicKey(new DHPublicKeyParameters(var2, this.dhParameters));
      }
   }

   public byte[] generatePremasterSecret() throws IOException {
      if (this.agreementCredentials != null) {
         return this.agreementCredentials.generateAgreement(this.dhAgreePublicKey);
      } else if (this.dhAgreePrivateKey != null) {
         return TlsDHUtils.calculateDHBasicAgreement(this.dhAgreePublicKey, this.dhAgreePrivateKey);
      } else {
         throw new TlsFatalAlert((short)80);
      }
   }

   public TlsDHKeyExchange(int var1, Vector var2, DHParameters var3) {
      super(var1, var2);
      switch(var1) {
      case 3:
         this.tlsSigner = new TlsDSSSigner();
         break;
      case 4:
      case 6:
      case 8:
      default:
         throw new IllegalArgumentException("unsupported key exchange algorithm");
      case 5:
         this.tlsSigner = new TlsRSASigner();
         break;
      case 7:
      case 9:
         this.tlsSigner = null;
      }

      this.dhParameters = var3;
   }

   public DHParameters validateDHParameters(DHParameters var1) throws IOException {
      if (var1.getP().bitLength() < this.getMinimumPrimeBits()) {
         throw new TlsFatalAlert((short)71);
      } else {
         return TlsDHUtils.validateDHParameters(var1);
      }
   }
}
