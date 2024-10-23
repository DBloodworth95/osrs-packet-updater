package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

public abstract class AbstractTlsKeyExchange implements TlsKeyExchange {
   public int keyExchange;
   public Vector supportedSignatureAlgorithms;
   public TlsContext context;

   public AbstractTlsKeyExchange(int var1, Vector var2) {
      this.keyExchange = var1;
      this.supportedSignatureAlgorithms = var2;
   }

   public DigitallySigned parseSignature(InputStream var1) throws IOException {
      DigitallySigned var2 = DigitallySigned.parse(this.context, var1);
      SignatureAndHashAlgorithm var3 = var2.getAlgorithm();
      if (var3 != null) {
         TlsUtils.verifySupportedSignatureAlgorithm(this.supportedSignatureAlgorithms, var3);
      }

      return var2;
   }

   public void init(TlsContext var1) {
      this.context = var1;
      ProtocolVersion var2 = var1.getClientVersion();
      if (TlsUtils.isSignatureAlgorithmsExtensionAllowed(var2)) {
         if (this.supportedSignatureAlgorithms == null) {
            switch(this.keyExchange) {
            case 1:
            case 5:
            case 9:
            case 15:
            case 18:
            case 19:
            case 23:
               this.supportedSignatureAlgorithms = TlsUtils.getDefaultRSASignatureAlgorithms();
               break;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
            case 11:
            case 12:
            case 20:
            default:
               throw new IllegalStateException("unsupported key exchange algorithm");
            case 3:
            case 7:
            case 22:
               this.supportedSignatureAlgorithms = TlsUtils.getDefaultDSSSignatureAlgorithms();
            case 13:
            case 14:
            case 21:
            case 24:
               break;
            case 16:
            case 17:
               this.supportedSignatureAlgorithms = TlsUtils.getDefaultECDSASignatureAlgorithms();
            }
         }
      } else if (this.supportedSignatureAlgorithms != null) {
         throw new IllegalStateException("supported_signature_algorithms not allowed for " + var2);
      }

   }

   public void processServerCertificate(Certificate var1) throws IOException {
      if (this.supportedSignatureAlgorithms == null) {
      }

   }

   public void skipServerKeyExchange() throws IOException {
      if (this.requiresServerKeyExchange()) {
         throw new TlsFatalAlert((short)10);
      }
   }

   public boolean requiresServerKeyExchange() {
      return false;
   }

   public byte[] generateServerKeyExchange() throws IOException {
      if (this.requiresServerKeyExchange()) {
         throw new TlsFatalAlert((short)80);
      } else {
         return null;
      }
   }

   public void skipClientCredentials() throws IOException {
   }

   public void processServerKeyExchange(InputStream var1) throws IOException {
      if (!this.requiresServerKeyExchange()) {
         throw new TlsFatalAlert((short)10);
      }
   }

   public void processServerCredentials(TlsCredentials var1) throws IOException {
      this.processServerCertificate(var1.getCertificate());
   }

   public void processClientCertificate(Certificate var1) throws IOException {
   }

   public void processClientKeyExchange(InputStream var1) throws IOException {
      throw new TlsFatalAlert((short)80);
   }
}
