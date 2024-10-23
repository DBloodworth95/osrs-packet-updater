package org.bouncycastle.crypto.tls;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.util.PublicKeyFactory;

public class TlsECDHKeyExchange extends AbstractTlsKeyExchange {
   public ECPublicKeyParameters ecAgreePublicKey;
   public int[] namedCurves;
   public TlsSigner tlsSigner;
   public short[] serverECPointFormats;
   public AsymmetricKeyParameter serverPublicKey;
   public TlsAgreementCredentials agreementCredentials;
   public ECPrivateKeyParameters ecAgreePrivateKey;
   public short[] clientECPointFormats;

   public void init(TlsContext var1) {
      super.init(var1);
      if (this.tlsSigner != null) {
         this.tlsSigner.init(var1);
      }

   }

   public void processServerKeyExchange(InputStream var1) throws IOException {
      if (!this.requiresServerKeyExchange()) {
         throw new TlsFatalAlert((short)10);
      } else {
         ECDomainParameters var2 = TlsECCUtils.readECParameters(this.namedCurves, this.clientECPointFormats, var1);
         byte[] var3 = TlsUtils.readOpaque8(var1);
         this.ecAgreePublicKey = TlsECCUtils.validateECPublicKey(TlsECCUtils.deserializeECPublicKey(this.clientECPointFormats, var2, var3));
      }
   }

   public void skipServerCredentials() throws IOException {
      if (this.keyExchange != 20) {
         throw new TlsFatalAlert((short)10);
      }
   }

   public void processServerCertificate(Certificate var1) throws IOException {
      if (this.keyExchange == 20) {
         throw new TlsFatalAlert((short)10);
      } else if (var1.isEmpty()) {
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
               this.ecAgreePublicKey = TlsECCUtils.validateECPublicKey((ECPublicKeyParameters)this.serverPublicKey);
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

   public boolean requiresServerKeyExchange() {
      switch(this.keyExchange) {
      case 17:
      case 19:
      case 20:
         return true;
      case 18:
      default:
         return false;
      }
   }

   public byte[] generateServerKeyExchange() throws IOException {
      if (!this.requiresServerKeyExchange()) {
         return null;
      } else {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         this.ecAgreePrivateKey = TlsECCUtils.generateEphemeralServerKeyExchange(this.context.getSecureRandom(), this.namedCurves, this.clientECPointFormats, var1);
         return var1.toByteArray();
      }
   }

   public void processClientKeyExchange(InputStream var1) throws IOException {
      if (this.ecAgreePublicKey == null) {
         byte[] var2 = TlsUtils.readOpaque8(var1);
         ECDomainParameters var3 = this.ecAgreePrivateKey.getParameters();
         this.ecAgreePublicKey = TlsECCUtils.validateECPublicKey(TlsECCUtils.deserializeECPublicKey(this.serverECPointFormats, var3, var2));
      }
   }

   public void validateCertificateRequest(CertificateRequest var1) throws IOException {
      short[] var2 = var1.getCertificateTypes();
      int var3 = 0;

      while(var3 < var2.length) {
         switch(var2[var3]) {
         case 1:
         case 2:
         case 64:
         case 65:
         case 66:
            ++var3;
            break;
         default:
            throw new TlsFatalAlert((short)47);
         }
      }

   }

   public void processClientCredentials(TlsCredentials var1) throws IOException {
      if (this.keyExchange == 20) {
         throw new TlsFatalAlert((short)80);
      } else {
         if (var1 instanceof TlsAgreementCredentials) {
            this.agreementCredentials = (TlsAgreementCredentials)var1;
         } else if (!(var1 instanceof TlsSignerCredentials)) {
            throw new TlsFatalAlert((short)80);
         }

      }
   }

   public void generateClientKeyExchange(OutputStream var1) throws IOException {
      if (this.agreementCredentials == null) {
         this.ecAgreePrivateKey = TlsECCUtils.generateEphemeralClientKeyExchange(this.context.getSecureRandom(), this.serverECPointFormats, this.ecAgreePublicKey.getParameters(), var1);
      }

   }

   public void processClientCertificate(Certificate var1) throws IOException {
      if (this.keyExchange == 20) {
         throw new TlsFatalAlert((short)10);
      }
   }

   public byte[] generatePremasterSecret() throws IOException {
      if (this.agreementCredentials != null) {
         return this.agreementCredentials.generateAgreement(this.ecAgreePublicKey);
      } else if (this.ecAgreePrivateKey != null) {
         return TlsECCUtils.calculateECDHBasicAgreement(this.ecAgreePublicKey, this.ecAgreePrivateKey);
      } else {
         throw new TlsFatalAlert((short)80);
      }
   }

   public TlsECDHKeyExchange(int var1, Vector var2, int[] var3, short[] var4, short[] var5) {
      super(var1, var2);
      switch(var1) {
      case 16:
      case 18:
      case 20:
         this.tlsSigner = null;
         break;
      case 17:
         this.tlsSigner = new TlsECDSASigner();
         break;
      case 19:
         this.tlsSigner = new TlsRSASigner();
         break;
      default:
         throw new IllegalArgumentException("unsupported key exchange algorithm");
      }

      this.namedCurves = var3;
      this.clientECPointFormats = var4;
      this.serverECPointFormats = var5;
   }
}
