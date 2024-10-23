package org.bouncycastle.crypto.tls;

import java.io.IOException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.engines.ChaCha7539Engine;
import org.bouncycastle.crypto.macs.Poly1305;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

public class Chacha20Poly1305 implements TlsCipher {
   public ChaCha7539Engine encryptCipher;
   public TlsContext context;
   static final byte[] ZEROES = new byte[15];
   public ChaCha7539Engine decryptCipher;
   public byte[] encryptIV;
   public byte[] decryptIV;

   public byte[] decodeCiphertext(long var1, short var3, byte[] var4, int var5, int var6) throws IOException {
      if (this.getPlaintextLimit(var6) < 0) {
         throw new TlsFatalAlert((short)50);
      } else {
         KeyParameter var7 = this.initRecord(this.decryptCipher, false, var1, this.decryptIV);
         int var8 = var6 - 16;
         byte[] var9 = this.getAdditionalData(var1, var3, var8);
         byte[] var10 = this.calculateRecordMAC(var7, var9, var4, var5, var8);
         byte[] var11 = Arrays.copyOfRange(var4, var5 + var8, var5 + var6);
         if (!Arrays.constantTimeAreEqual(var10, var11)) {
            throw new TlsFatalAlert((short)20);
         } else {
            byte[] var12 = new byte[var8];
            this.decryptCipher.processBytes(var4, var5, var8, var12, 0);
            return var12;
         }
      }
   }

   public byte[] encodePlaintext(long var1, short var3, byte[] var4, int var5, int var6) throws IOException {
      KeyParameter var7 = this.initRecord(this.encryptCipher, true, var1, this.encryptIV);
      byte[] var8 = new byte[var6 + 16];
      this.encryptCipher.processBytes(var4, var5, var6, var8, 0);
      byte[] var9 = this.getAdditionalData(var1, var3, var6);
      byte[] var10 = this.calculateRecordMAC(var7, var9, var8, 0, var6);
      System.arraycopy(var10, 0, var8, var6, var10.length);
      return var8;
   }

   public int getPlaintextLimit(int var1) {
      return var1 - 16;
   }

   public KeyParameter initRecord(StreamCipher var1, boolean var2, long var3, byte[] var5) {
      byte[] var6 = this.calculateNonce(var3, var5);
      var1.init(var2, new ParametersWithIV((CipherParameters)null, var6));
      return this.generateRecordMACKey(var1);
   }

   public byte[] getAdditionalData(long var1, short var3, int var4) throws IOException {
      byte[] var5 = new byte[13];
      TlsUtils.writeUint64(var1, var5, 0);
      TlsUtils.writeUint8((short)var3, var5, 8);
      TlsUtils.writeVersion(this.context.getServerVersion(), var5, 9);
      TlsUtils.writeUint16(var4, var5, 11);
      return var5;
   }

   public KeyParameter generateRecordMACKey(StreamCipher var1) {
      byte[] var2 = new byte[64];
      var1.processBytes(var2, 0, var2.length, var2, 0);
      KeyParameter var3 = new KeyParameter(var2, 0, 32);
      Arrays.fill((byte[])var2, (byte)0);
      return var3;
   }

   public byte[] calculateRecordMAC(KeyParameter var1, byte[] var2, byte[] var3, int var4, int var5) {
      Poly1305 var6 = new Poly1305();
      var6.init(var1);
      this.updateRecordMACText(var6, var2, 0, var2.length);
      this.updateRecordMACText(var6, var3, var4, var5);
      this.updateRecordMACLength(var6, var2.length);
      this.updateRecordMACLength(var6, var5);
      byte[] var7 = new byte[var6.getMacSize()];
      var6.doFinal(var7, 0);
      return var7;
   }

   public void updateRecordMACLength(Mac var1, int var2) {
      byte[] var3 = Pack.longToLittleEndian((long)var2 & 4294967295L);
      var1.update(var3, 0, var3.length);
   }

   public void updateRecordMACText(Mac var1, byte[] var2, int var3, int var4) {
      var1.update(var2, var3, var4);
      int var5 = var4 % 16;
      if (var5 != 0) {
         var1.update(ZEROES, 0, 16 - var5);
      }

   }

   public byte[] calculateNonce(long var1, byte[] var3) {
      byte[] var4 = new byte[12];
      TlsUtils.writeUint64(var1, var4, 4);

      for(int var5 = 0; var5 < 12; ++var5) {
         var4[var5] ^= var3[var5];
      }

      return var4;
   }

   public Chacha20Poly1305(TlsContext var1) throws IOException {
      if (!TlsUtils.isTLSv12(var1)) {
         throw new TlsFatalAlert((short)80);
      } else {
         this.context = var1;
         byte var2 = 32;
         byte var3 = 12;
         int var4 = 2 * var2 + 2 * var3;
         byte[] var5 = TlsUtils.calculateKeyBlock(var1, var4);
         byte var6 = 0;
         KeyParameter var7 = new KeyParameter(var5, var6, var2);
         int var13 = var6 + var2;
         KeyParameter var8 = new KeyParameter(var5, var13, var2);
         var13 += var2;
         byte[] var9 = Arrays.copyOfRange(var5, var13, var13 + var3);
         var13 += var3;
         byte[] var10 = Arrays.copyOfRange(var5, var13, var13 + var3);
         var13 += var3;
         if (var13 != var4) {
            throw new TlsFatalAlert((short)80);
         } else {
            this.encryptCipher = new ChaCha7539Engine();
            this.decryptCipher = new ChaCha7539Engine();
            KeyParameter var11;
            KeyParameter var12;
            if (var1.isServer()) {
               var11 = var8;
               var12 = var7;
               this.encryptIV = var10;
               this.decryptIV = var9;
            } else {
               var11 = var7;
               var12 = var8;
               this.encryptIV = var9;
               this.decryptIV = var10;
            }

            this.encryptCipher.init(true, new ParametersWithIV(var11, this.encryptIV));
            this.decryptCipher.init(false, new ParametersWithIV(var12, this.decryptIV));
         }
      }
   }
}
