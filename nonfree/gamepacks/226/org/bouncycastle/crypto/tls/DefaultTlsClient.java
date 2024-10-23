package org.bouncycastle.crypto.tls;

import java.io.IOException;
import org.bouncycastle.crypto.params.DHParameters;

public abstract class DefaultTlsClient extends AbstractTlsClient {
   public int[] getCipherSuites() {
      return new int[]{49195, 49187, 49161, 49199, 49191, 49171, 162, 64, 50, 158, 103, 51, 156, 60, 47};
   }

   public DefaultTlsClient(TlsCipherFactory var1) {
      super(var1);
   }

   public TlsKeyExchange createDHEKeyExchange(int var1) {
      return new TlsDHEKeyExchange(var1, this.supportedSignatureAlgorithms, (DHParameters)null);
   }

   public TlsKeyExchange getKeyExchange() throws IOException {
      int var1 = TlsUtils.getKeyExchangeAlgorithm(this.selectedCipherSuite);
      switch(var1) {
      case 1:
         return this.createRSAKeyExchange();
      case 2:
      case 4:
      case 6:
      case 8:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      default:
         throw new TlsFatalAlert((short)80);
      case 3:
      case 5:
         return this.createDHEKeyExchange(var1);
      case 7:
      case 9:
         return this.createDHKeyExchange(var1);
      case 16:
      case 18:
      case 20:
         return this.createECDHKeyExchange(var1);
      case 17:
      case 19:
         return this.createECDHEKeyExchange(var1);
      }
   }

   public TlsKeyExchange createDHKeyExchange(int var1) {
      return new TlsDHKeyExchange(var1, this.supportedSignatureAlgorithms, (DHParameters)null);
   }

   public TlsKeyExchange createECDHEKeyExchange(int var1) {
      return new TlsECDHEKeyExchange(var1, this.supportedSignatureAlgorithms, this.namedCurves, this.clientECPointFormats, this.serverECPointFormats);
   }

   public TlsKeyExchange createECDHKeyExchange(int var1) {
      return new TlsECDHKeyExchange(var1, this.supportedSignatureAlgorithms, this.namedCurves, this.clientECPointFormats, this.serverECPointFormats);
   }

   public DefaultTlsClient() {
   }

   public TlsKeyExchange createRSAKeyExchange() {
      return new TlsRSAKeyExchange(this.supportedSignatureAlgorithms);
   }
}
