package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CertificateStatusRequest {
   public short statusType;
   public Object request;

   public static boolean isCorrectType(short var0, Object var1) {
      switch(var0) {
      case 1:
         return var1 instanceof OCSPStatusRequest;
      default:
         throw new IllegalArgumentException("'statusType' is an unsupported value");
      }
   }

   public short getStatusType() {
      return this.statusType;
   }

   public static CertificateStatusRequest parse(InputStream var0) throws IOException {
      short var1 = TlsUtils.readUint8(var0);
      switch(var1) {
      case 1:
         OCSPStatusRequest var2 = OCSPStatusRequest.parse(var0);
         return new CertificateStatusRequest(var1, var2);
      default:
         throw new TlsFatalAlert((short)50);
      }
   }

   public OCSPStatusRequest getOCSPStatusRequest() {
      if (!isCorrectType((short)1, this.request)) {
         throw new IllegalStateException("'request' is not an OCSPStatusRequest");
      } else {
         return (OCSPStatusRequest)this.request;
      }
   }

   public CertificateStatusRequest(short var1, Object var2) {
      if (!isCorrectType(var1, var2)) {
         throw new IllegalArgumentException("'request' is not an instance of the correct type");
      } else {
         this.statusType = var1;
         this.request = var2;
      }
   }

   public void encode(OutputStream var1) throws IOException {
      TlsUtils.writeUint8(this.statusType, var1);
      switch(this.statusType) {
      case 1:
         ((OCSPStatusRequest)this.request).encode(var1);
         return;
      default:
         throw new TlsFatalAlert((short)80);
      }
   }

   public Object getRequest() {
      return this.request;
   }
}
