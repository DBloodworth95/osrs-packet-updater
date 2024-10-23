package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;

public class SSL3Mac implements Mac {
   static final byte IPAD_BYTE = 54;
   int padLength;
   static final byte[] IPAD = genPad((byte)54, 48);
   static final byte[] OPAD = genPad((byte)92, 48);
   Digest digest;
   byte[] secret;
   static final byte OPAD_BYTE = 92;

   public void update(byte[] var1, int var2, int var3) {
      this.digest.update(var1, var2, var3);
   }

   public String getAlgorithmName() {
      return this.digest.getAlgorithmName() + "/SSL3MAC";
   }

   public Digest getUnderlyingDigest() {
      return this.digest;
   }

   public SSL3Mac(Digest var1) {
      this.digest = var1;
      if (var1.getDigestSize() == 20) {
         this.padLength = 40;
      } else {
         this.padLength = 48;
      }

   }

   public int getMacSize() {
      return this.digest.getDigestSize();
   }

   public void update(byte var1) {
      this.digest.update(var1);
   }

   static byte[] genPad(byte var0, int var1) {
      byte[] var2 = new byte[var1];
      Arrays.fill(var2, var0);
      return var2;
   }

   public int doFinal(byte[] var1, int var2) {
      byte[] var3 = new byte[this.digest.getDigestSize()];
      this.digest.doFinal(var3, 0);
      this.digest.update(this.secret, 0, this.secret.length);
      this.digest.update(OPAD, 0, this.padLength);
      this.digest.update(var3, 0, var3.length);
      int var4 = this.digest.doFinal(var1, var2);
      this.reset();
      return var4;
   }

   public void reset() {
      this.digest.reset();
      this.digest.update(this.secret, 0, this.secret.length);
      this.digest.update(IPAD, 0, this.padLength);
   }

   public void init(CipherParameters var1) {
      this.secret = Arrays.clone(((KeyParameter)var1).getKey());
      this.reset();
   }
}
