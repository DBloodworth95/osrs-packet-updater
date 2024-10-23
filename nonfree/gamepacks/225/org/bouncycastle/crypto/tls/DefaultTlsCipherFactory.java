package org.bouncycastle.crypto.tls;

import java.io.IOException;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.engines.CamelliaEngine;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.RC4Engine;
import org.bouncycastle.crypto.engines.SEEDEngine;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CCMBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.modes.OCBBlockCipher;

public class DefaultTlsCipherFactory extends AbstractTlsCipherFactory {
   public AEADBlockCipher createAEADBlockCipher_AES_GCM() {
      return new GCMBlockCipher(this.createAESEngine());
   }

   public BlockCipher createCamelliaEngine() {
      return new CamelliaEngine();
   }

   public TlsBlockCipher createAESCipher(TlsContext var1, int var2, int var3) throws IOException {
      return new TlsBlockCipher(var1, this.createAESBlockCipher(), this.createAESBlockCipher(), this.createHMACDigest(var3), this.createHMACDigest(var3), var2);
   }

   public TlsCipher createChaCha20Poly1305(TlsContext var1) throws IOException {
      return new Chacha20Poly1305(var1);
   }

   public TlsAEADCipher createCipher_AES_CCM(TlsContext var1, int var2, int var3) throws IOException {
      return new TlsAEADCipher(var1, this.createAEADBlockCipher_AES_CCM(), this.createAEADBlockCipher_AES_CCM(), var2, var3);
   }

   public TlsAEADCipher createCipher_AES_GCM(TlsContext var1, int var2, int var3) throws IOException {
      return new TlsAEADCipher(var1, this.createAEADBlockCipher_AES_GCM(), this.createAEADBlockCipher_AES_GCM(), var2, var3);
   }

   public TlsAEADCipher createCipher_AES_OCB(TlsContext var1, int var2, int var3) throws IOException {
      return new TlsAEADCipher(var1, this.createAEADBlockCipher_AES_OCB(), this.createAEADBlockCipher_AES_OCB(), var2, var3, 2);
   }

   public TlsBlockCipher createCamelliaCipher(TlsContext var1, int var2, int var3) throws IOException {
      return new TlsBlockCipher(var1, this.createCamelliaBlockCipher(), this.createCamelliaBlockCipher(), this.createHMACDigest(var3), this.createHMACDigest(var3), var2);
   }

   public TlsBlockCipher createDESedeCipher(TlsContext var1, int var2) throws IOException {
      return new TlsBlockCipher(var1, this.createDESedeBlockCipher(), this.createDESedeBlockCipher(), this.createHMACDigest(var2), this.createHMACDigest(var2), 24);
   }

   public TlsAEADCipher createCipher_Camellia_GCM(TlsContext var1, int var2, int var3) throws IOException {
      return new TlsAEADCipher(var1, this.createAEADBlockCipher_Camellia_GCM(), this.createAEADBlockCipher_Camellia_GCM(), var2, var3);
   }

   public TlsStreamCipher createRC4Cipher(TlsContext var1, int var2, int var3) throws IOException {
      return new TlsStreamCipher(var1, this.createRC4StreamCipher(), this.createRC4StreamCipher(), this.createHMACDigest(var3), this.createHMACDigest(var3), var2, false);
   }

   public TlsBlockCipher createSEEDCipher(TlsContext var1, int var2) throws IOException {
      return new TlsBlockCipher(var1, this.createSEEDBlockCipher(), this.createSEEDBlockCipher(), this.createHMACDigest(var2), this.createHMACDigest(var2), 16);
   }

   public BlockCipher createAESEngine() {
      return new AESEngine();
   }

   public BlockCipher createAESBlockCipher() {
      return new CBCBlockCipher(this.createAESEngine());
   }

   public TlsNullCipher createNullCipher(TlsContext var1, int var2) throws IOException {
      return new TlsNullCipher(var1, this.createHMACDigest(var2), this.createHMACDigest(var2));
   }

   public AEADBlockCipher createAEADBlockCipher_AES_CCM() {
      return new CCMBlockCipher(this.createAESEngine());
   }

   public TlsCipher createCipher(TlsContext var1, int var2, int var3) throws IOException {
      switch(var2) {
      case 0:
         return this.createNullCipher(var1, var3);
      case 2:
         return this.createRC4Cipher(var1, 16, var3);
      case 7:
         return this.createDESedeCipher(var1, var3);
      case 8:
         return this.createAESCipher(var1, 16, var3);
      case 9:
         return this.createAESCipher(var1, 32, var3);
      case 10:
         return this.createCipher_AES_GCM(var1, 16, 16);
      case 11:
         return this.createCipher_AES_GCM(var1, 32, 16);
      case 12:
         return this.createCamelliaCipher(var1, 16, var3);
      case 13:
         return this.createCamelliaCipher(var1, 32, var3);
      case 14:
         return this.createSEEDCipher(var1, var3);
      case 15:
         return this.createCipher_AES_CCM(var1, 16, 16);
      case 16:
         return this.createCipher_AES_CCM(var1, 16, 8);
      case 17:
         return this.createCipher_AES_CCM(var1, 32, 16);
      case 18:
         return this.createCipher_AES_CCM(var1, 32, 8);
      case 19:
         return this.createCipher_Camellia_GCM(var1, 16, 16);
      case 20:
         return this.createCipher_Camellia_GCM(var1, 32, 16);
      case 102:
         return this.createChaCha20Poly1305(var1);
      case 103:
         return this.createCipher_AES_OCB(var1, 16, 12);
      case 104:
         return this.createCipher_AES_OCB(var1, 32, 12);
      default:
         throw new TlsFatalAlert((short)80);
      }
   }

   public AEADBlockCipher createAEADBlockCipher_AES_OCB() {
      return new OCBBlockCipher(this.createAESEngine(), this.createAESEngine());
   }

   public AEADBlockCipher createAEADBlockCipher_Camellia_GCM() {
      return new GCMBlockCipher(this.createCamelliaEngine());
   }

   public BlockCipher createCamelliaBlockCipher() {
      return new CBCBlockCipher(this.createCamelliaEngine());
   }

   public BlockCipher createDESedeBlockCipher() {
      return new CBCBlockCipher(new DESedeEngine());
   }

   public StreamCipher createRC4StreamCipher() {
      return new RC4Engine();
   }

   public BlockCipher createSEEDBlockCipher() {
      return new CBCBlockCipher(new SEEDEngine());
   }

   public Digest createHMACDigest(int var1) throws IOException {
      switch(var1) {
      case 0:
         return null;
      case 1:
         return TlsUtils.createHash((short)1);
      case 2:
         return TlsUtils.createHash((short)2);
      case 3:
         return TlsUtils.createHash((short)4);
      case 4:
         return TlsUtils.createHash((short)5);
      case 5:
         return TlsUtils.createHash((short)6);
      default:
         throw new TlsFatalAlert((short)80);
      }
   }
}
