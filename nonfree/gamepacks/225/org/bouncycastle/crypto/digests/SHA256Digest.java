package org.bouncycastle.crypto.digests;

import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

public class SHA256Digest extends GeneralDigest implements EncodableDigest {
   int H3;
   int H1;
   int H2;
   int H5;
   int xOff;
   int H4;
   int H8;
   int H7;
   int H6;
   int[] X = new int[64];
   static final int DIGEST_LENGTH = 32;
   static final int[] K = new int[]{1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

   public void reset(Memoable var1) {
      SHA256Digest var2 = (SHA256Digest)var1;
      this.copyIn(var2);
   }

   public SHA256Digest(SHA256Digest var1) {
      super((GeneralDigest)var1);
      this.copyIn(var1);
   }

   void copyIn(SHA256Digest var1) {
      super.copyIn(var1);
      this.H1 = var1.H1;
      this.H2 = var1.H2;
      this.H3 = var1.H3;
      this.H4 = var1.H4;
      this.H5 = var1.H5;
      this.H6 = var1.H6;
      this.H7 = var1.H7;
      this.H8 = var1.H8;
      System.arraycopy(var1.X, 0, this.X, 0, var1.X.length);
      this.xOff = var1.xOff;
   }

   public void processWord(byte[] var1, int var2) {
      int var3 = var1[var2] << 24;
      ++var2;
      var3 |= (var1[var2] & 255) << 16;
      ++var2;
      var3 |= (var1[var2] & 255) << 8;
      ++var2;
      var3 |= var1[var2] & 255;
      this.X[this.xOff] = var3;
      if (++this.xOff == 16) {
         this.processBlock();
      }

   }

   public String getAlgorithmName() {
      return "SHA-256";
   }

   public int getDigestSize() {
      return 32;
   }

   int Sum1(int var1) {
      return (var1 >>> 6 | var1 << 26) ^ (var1 >>> 11 | var1 << 21) ^ (var1 >>> 25 | var1 << 7);
   }

   public void processLength(long var1) {
      if (this.xOff > 14) {
         this.processBlock();
      }

      this.X[14] = (int)(var1 >>> 32);
      this.X[15] = (int)(var1 & -1L);
   }

   public int doFinal(byte[] var1, int var2) {
      this.finish();
      Pack.intToBigEndian(this.H1, var1, var2);
      Pack.intToBigEndian(this.H2, var1, var2 + 4);
      Pack.intToBigEndian(this.H3, var1, var2 + 8);
      Pack.intToBigEndian(this.H4, var1, var2 + 12);
      Pack.intToBigEndian(this.H5, var1, var2 + 16);
      Pack.intToBigEndian(this.H6, var1, var2 + 20);
      Pack.intToBigEndian(this.H7, var1, var2 + 24);
      Pack.intToBigEndian(this.H8, var1, var2 + 28);
      this.reset();
      return 32;
   }

   public void reset() {
      super.reset();
      this.H1 = 1779033703;
      this.H2 = -1150833019;
      this.H3 = 1013904242;
      this.H4 = -1521486534;
      this.H5 = 1359893119;
      this.H6 = -1694144372;
      this.H7 = 528734635;
      this.H8 = 1541459225;
      this.xOff = 0;

      for(int var1 = 0; var1 != this.X.length; ++var1) {
         this.X[var1] = 0;
      }

   }

   public void processBlock() {
      int var1;
      for(var1 = 16; var1 <= 63; ++var1) {
         this.X[var1] = this.Theta1(this.X[var1 - 2]) + this.X[var1 - 7] + this.Theta0(this.X[var1 - 15]) + this.X[var1 - 16];
      }

      var1 = this.H1;
      int var2 = this.H2;
      int var3 = this.H3;
      int var4 = this.H4;
      int var5 = this.H5;
      int var6 = this.H6;
      int var7 = this.H7;
      int var8 = this.H8;
      int var9 = 0;

      int var10;
      for(var10 = 0; var10 < 8; ++var10) {
         var8 += this.Sum1(var5) + this.Ch(var5, var6, var7) + K[var9] + this.X[var9];
         var4 += var8;
         var8 += this.Sum0(var1) + this.Maj(var1, var2, var3);
         ++var9;
         var7 += this.Sum1(var4) + this.Ch(var4, var5, var6) + K[var9] + this.X[var9];
         var3 += var7;
         var7 += this.Sum0(var8) + this.Maj(var8, var1, var2);
         ++var9;
         var6 += this.Sum1(var3) + this.Ch(var3, var4, var5) + K[var9] + this.X[var9];
         var2 += var6;
         var6 += this.Sum0(var7) + this.Maj(var7, var8, var1);
         ++var9;
         var5 += this.Sum1(var2) + this.Ch(var2, var3, var4) + K[var9] + this.X[var9];
         var1 += var5;
         var5 += this.Sum0(var6) + this.Maj(var6, var7, var8);
         ++var9;
         var4 += this.Sum1(var1) + this.Ch(var1, var2, var3) + K[var9] + this.X[var9];
         var8 += var4;
         var4 += this.Sum0(var5) + this.Maj(var5, var6, var7);
         ++var9;
         var3 += this.Sum1(var8) + this.Ch(var8, var1, var2) + K[var9] + this.X[var9];
         var7 += var3;
         var3 += this.Sum0(var4) + this.Maj(var4, var5, var6);
         ++var9;
         var2 += this.Sum1(var7) + this.Ch(var7, var8, var1) + K[var9] + this.X[var9];
         var6 += var2;
         var2 += this.Sum0(var3) + this.Maj(var3, var4, var5);
         ++var9;
         var1 += this.Sum1(var6) + this.Ch(var6, var7, var8) + K[var9] + this.X[var9];
         var5 += var1;
         var1 += this.Sum0(var2) + this.Maj(var2, var3, var4);
         ++var9;
      }

      this.H1 += var1;
      this.H2 += var2;
      this.H3 += var3;
      this.H4 += var4;
      this.H5 += var5;
      this.H6 += var6;
      this.H7 += var7;
      this.H8 += var8;
      this.xOff = 0;

      for(var10 = 0; var10 < 16; ++var10) {
         this.X[var10] = 0;
      }

   }

   int Ch(int var1, int var2, int var3) {
      return var1 & var2 ^ ~var1 & var3;
   }

   int Maj(int var1, int var2, int var3) {
      return var1 & var2 ^ var1 & var3 ^ var2 & var3;
   }

   int Sum0(int var1) {
      return (var1 >>> 2 | var1 << 30) ^ (var1 >>> 13 | var1 << 19) ^ (var1 >>> 22 | var1 << 10);
   }

   public SHA256Digest(byte[] var1) {
      super(var1);
      this.H1 = Pack.bigEndianToInt(var1, 16);
      this.H2 = Pack.bigEndianToInt(var1, 20);
      this.H3 = Pack.bigEndianToInt(var1, 24);
      this.H4 = Pack.bigEndianToInt(var1, 28);
      this.H5 = Pack.bigEndianToInt(var1, 32);
      this.H6 = Pack.bigEndianToInt(var1, 36);
      this.H7 = Pack.bigEndianToInt(var1, 40);
      this.H8 = Pack.bigEndianToInt(var1, 44);
      this.xOff = Pack.bigEndianToInt(var1, 48);

      for(int var2 = 0; var2 != this.xOff; ++var2) {
         this.X[var2] = Pack.bigEndianToInt(var1, 52 + var2 * 4);
      }

   }

   public Memoable copy() {
      return new SHA256Digest(this);
   }

   int Theta1(int var1) {
      return (var1 >>> 17 | var1 << 15) ^ (var1 >>> 19 | var1 << 13) ^ var1 >>> 10;
   }

   int Theta0(int var1) {
      return (var1 >>> 7 | var1 << 25) ^ (var1 >>> 18 | var1 << 14) ^ var1 >>> 3;
   }

   public byte[] getEncodedState() {
      byte[] var1 = new byte[52 + this.xOff * 4];
      super.populateState(var1);
      Pack.intToBigEndian(this.H1, var1, 16);
      Pack.intToBigEndian(this.H2, var1, 20);
      Pack.intToBigEndian(this.H3, var1, 24);
      Pack.intToBigEndian(this.H4, var1, 28);
      Pack.intToBigEndian(this.H5, var1, 32);
      Pack.intToBigEndian(this.H6, var1, 36);
      Pack.intToBigEndian(this.H7, var1, 40);
      Pack.intToBigEndian(this.H8, var1, 44);
      Pack.intToBigEndian(this.xOff, var1, 48);

      for(int var2 = 0; var2 != this.xOff; ++var2) {
         Pack.intToBigEndian(this.X[var2], var1, 52 + var2 * 4);
      }

      return var1;
   }

   public SHA256Digest() {
      this.reset();
   }
}
