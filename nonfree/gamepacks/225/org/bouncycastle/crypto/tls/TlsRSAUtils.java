package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.Arrays;

public class TlsRSAUtils {
   public static byte[] generateEncryptedPreMasterSecret(TlsContext var0, RSAKeyParameters var1, OutputStream var2) throws IOException {
      byte[] var3 = new byte[48];
      var0.getSecureRandom().nextBytes(var3);
      TlsUtils.writeVersion(var0.getClientVersion(), var3, 0);
      PKCS1Encoding var4 = new PKCS1Encoding(new RSABlindedEngine());
      var4.init(true, new ParametersWithRandom(var1, var0.getSecureRandom()));

      try {
         byte[] var5 = var4.processBlock(var3, 0, var3.length);
         if (TlsUtils.isSSL(var0)) {
            var2.write(var5);
         } else {
            TlsUtils.writeOpaque16(var5, var2);
         }

         return var3;
      } catch (InvalidCipherTextException var6) {
         throw new TlsFatalAlert((short)80, var6);
      }
   }

   public static byte[] safeDecryptPreMasterSecret(TlsContext var0, RSAKeyParameters var1, byte[] var2) {
      ProtocolVersion var3 = var0.getClientVersion();
      boolean var4 = false;
      byte[] var5 = new byte[48];
      var0.getSecureRandom().nextBytes(var5);
      byte[] var6 = Arrays.clone(var5);

      try {
         PKCS1Encoding var7 = new PKCS1Encoding(new RSABlindedEngine(), var5);
         var7.init(false, new ParametersWithRandom(var1, var0.getSecureRandom()));
         var6 = var7.processBlock(var2, 0, var2.length);
      } catch (Exception var10) {
      }

      if (!var4 || !var3.isEqualOrEarlierVersionOf(ProtocolVersion.TLSv10)) {
         int var11 = var3.getMajorVersion() ^ var6[0] & 255 | var3.getMinorVersion() ^ var6[1] & 255;
         var11 |= var11 >> 1;
         var11 |= var11 >> 2;
         var11 |= var11 >> 4;
         int var8 = ~((var11 & 1) - 1);

         for(int var9 = 0; var9 < 48; ++var9) {
            var6[var9] = (byte)(var6[var9] & ~var8 | var5[var9] & var8);
         }
      }

      return var6;
   }
}
