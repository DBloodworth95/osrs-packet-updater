package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.ocsp.OCSPResponse;

public class CertificateStatus {
   public short statusType;
   public Object response;

   public Object getResponse() {
      return this.response;
   }

   public short getStatusType() {
      return this.statusType;
   }

   public void encode(OutputStream var1) throws IOException {
      TlsUtils.writeUint8(this.statusType, var1);
      switch(this.statusType) {
      case 1:
         byte[] var2 = ((OCSPResponse)this.response).getEncoded("DER");
         TlsUtils.writeOpaque24(var2, var1);
         return;
      default:
         throw new TlsFatalAlert((short)80);
      }
   }

   public OCSPResponse getOCSPResponse() {
      if (!isCorrectType((short)1, this.response)) {
         throw new IllegalStateException("'response' is not an OCSPResponse");
      } else {
         return (OCSPResponse)this.response;
      }
   }

   public CertificateStatus(short var1, Object var2) {
      if (!isCorrectType(var1, var2)) {
         throw new IllegalArgumentException("'response' is not an instance of the correct type");
      } else {
         this.statusType = var1;
         this.response = var2;
      }
   }

   public static CertificateStatus parse(InputStream var0) throws IOException {
      short var1 = TlsUtils.readUint8(var0);
      switch(var1) {
      case 1:
         byte[] var3 = TlsUtils.readOpaque24(var0);
         OCSPResponse var2 = OCSPResponse.getInstance(TlsUtils.readDERObject(var3));
         return new CertificateStatus(var1, var2);
      default:
         throw new TlsFatalAlert((short)50);
      }
   }

   public static boolean isCorrectType(short var0, Object var1) {
      switch(var0) {
      case 1:
         return var1 instanceof OCSPResponse;
      default:
         throw new IllegalArgumentException("'statusType' is an unsupported value");
      }
   }
}
