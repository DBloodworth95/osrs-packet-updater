package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

public class SHA512Digest extends LongDigest {
   static final int DIGEST_LENGTH = 64;

   public SHA512Digest() {
   }

   public void reset() {
      super.reset();
      this.H1 = 7640891576956012808L;
      this.H2 = -4942790177534073029L;
      this.H3 = 4354685564936845355L;
      this.H4 = -6534734903238641935L;
      this.H5 = 5840696475078001361L;
      this.H6 = -7276294671716946913L;
      this.H7 = 2270897969802886507L;
      this.H8 = 6620516959819538809L;
   }

   public SHA512Digest(byte[] var1) {
      this.restoreState(var1);
   }

   public String getAlgorithmName() {
      return "SHA-512";
   }

   public int getDigestSize() {
      return 64;
   }

   public int doFinal(byte[] var1, int var2) {
      this.finish();
      Pack.longToBigEndian(this.H1, var1, var2);
      Pack.longToBigEndian(this.H2, var1, var2 + 8);
      Pack.longToBigEndian(this.H3, var1, var2 + 16);
      Pack.longToBigEndian(this.H4, var1, var2 + 24);
      Pack.longToBigEndian(this.H5, var1, var2 + 32);
      Pack.longToBigEndian(this.H6, var1, var2 + 40);
      Pack.longToBigEndian(this.H7, var1, var2 + 48);
      Pack.longToBigEndian(this.H8, var1, var2 + 56);
      this.reset();
      return 64;
   }

   public byte[] getEncodedState() {
      byte[] var1 = new byte[this.getEncodedStateSize()];
      super.populateState(var1);
      return var1;
   }

   public Memoable copy() {
      return new SHA512Digest(this);
   }

   public void reset(Memoable var1) {
      SHA512Digest var2 = (SHA512Digest)var1;
      this.copyIn(var2);
   }

   public SHA512Digest(SHA512Digest var1) {
      super(var1);
   }
}
