package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;

public class ServerDHParams {
   public DHPublicKeyParameters publicKey;

   public void encode(OutputStream var1) throws IOException {
      DHParameters var2 = this.publicKey.getParameters();
      BigInteger var3 = this.publicKey.getY();
      TlsDHUtils.writeDHParameter(var2.getP(), var1);
      TlsDHUtils.writeDHParameter(var2.getG(), var1);
      TlsDHUtils.writeDHParameter(var3, var1);
   }

   public static ServerDHParams parse(InputStream var0) throws IOException {
      BigInteger var1 = TlsDHUtils.readDHParameter(var0);
      BigInteger var2 = TlsDHUtils.readDHParameter(var0);
      BigInteger var3 = TlsDHUtils.readDHParameter(var0);
      return new ServerDHParams(TlsDHUtils.validateDHPublicKey(new DHPublicKeyParameters(var3, new DHParameters(var1, var2))));
   }

   public DHPublicKeyParameters getPublicKey() {
      return this.publicKey;
   }

   public ServerDHParams(DHPublicKeyParameters var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("'publicKey' cannot be null");
      } else {
         this.publicKey = var1;
      }
   }
}
