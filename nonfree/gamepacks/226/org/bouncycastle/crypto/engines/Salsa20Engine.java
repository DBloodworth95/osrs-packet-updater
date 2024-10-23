package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.MaxBytesExceededException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.SkippingStreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Strings;

public class Salsa20Engine implements SkippingStreamCipher {
   boolean initialised;
   static final int STATE_SIZE = 16;
   static final int[] TAU_SIGMA = Pack.littleEndianToInt(Strings.toByteArray("expand 16-byte kexpand 32-byte k"), 0, 8);
   /** @deprecated */
   public static final byte[] sigma = Strings.toByteArray("expand 32-byte k");
   int cW2;
   public int rounds;
   public int[] engineState;
   int index;
   public int[] x;
   byte[] keyStream;
   /** @deprecated */
   public static final byte[] tau = Strings.toByteArray("expand 16-byte k");
   int cW0;
   int cW1;
   public static final int DEFAULT_ROUNDS = 20;

   public void advanceCounter() {
      if (++this.engineState[8] == 0) {
         int var10002 = this.engineState[9]++;
      }

   }

   public void resetCounter() {
      this.engineState[8] = this.engineState[9] = 0;
   }

   public Salsa20Engine(int var1) {
      this.index = 0;
      this.engineState = new int[16];
      this.x = new int[16];
      this.keyStream = new byte[64];
      this.initialised = false;
      if (var1 > 0 && (var1 & 1) == 0) {
         this.rounds = var1;
      } else {
         throw new IllegalArgumentException("'rounds' must be a positive, even number");
      }
   }

   boolean limitExceeded() {
      if (++this.cW0 == 0 && ++this.cW1 == 0) {
         return (++this.cW2 & 32) != 0;
      } else {
         return false;
      }
   }

   public long skip(long var1) {
      long var3;
      long var5;
      if (var1 >= 0L) {
         var3 = var1;
         if (var1 >= 64L) {
            var5 = var1 / 64L;
            this.advanceCounter(var5);
            var3 = var1 - var5 * 64L;
         }

         int var7 = this.index;
         this.index = this.index + (int)var3 & 63;
         if (this.index < var7) {
            this.advanceCounter();
         }
      } else {
         var3 = -var1;
         if (var3 >= 64L) {
            var5 = var3 / 64L;
            this.retreatCounter(var5);
            var3 -= var5 * 64L;
         }

         for(var5 = 0L; var5 < var3; ++var5) {
            if (this.index == 0) {
               this.retreatCounter();
            }

            this.index = this.index - 1 & 63;
         }
      }

      this.generateKeyStream(this.keyStream);
      return var1;
   }

   public String getAlgorithmName() {
      String var1 = "Salsa20";
      if (this.rounds != 20) {
         var1 = var1 + "/" + this.rounds;
      }

      return var1;
   }

   public int getNonceSize() {
      return 8;
   }

   public void advanceCounter(long var1) {
      int var3 = (int)(var1 >>> 32);
      int var4 = (int)var1;
      int[] var10000;
      if (var3 > 0) {
         var10000 = this.engineState;
         var10000[9] += var3;
      }

      int var5 = this.engineState[8];
      var10000 = this.engineState;
      var10000[8] += var4;
      if (var5 != 0 && this.engineState[8] < var5) {
         int var10002 = this.engineState[9]++;
      }

   }

   public Salsa20Engine() {
      this(20);
   }

   public void retreatCounter(long var1) {
      int var3 = (int)(var1 >>> 32);
      int var4 = (int)var1;
      int[] var10000;
      if (var3 != 0) {
         if (((long)this.engineState[9] & 4294967295L) < ((long)var3 & 4294967295L)) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
         }

         var10000 = this.engineState;
         var10000[9] -= var3;
      }

      if (((long)this.engineState[8] & 4294967295L) >= ((long)var4 & 4294967295L)) {
         var10000 = this.engineState;
         var10000[8] -= var4;
      } else {
         if (this.engineState[9] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
         }

         int var10002 = this.engineState[9]--;
         var10000 = this.engineState;
         var10000[8] -= var4;
      }

   }

   public void retreatCounter() {
      if (this.engineState[8] == 0 && this.engineState[9] == 0) {
         throw new IllegalStateException("attempt to reduce counter past zero.");
      } else {
         if (--this.engineState[8] == -1) {
            int var10002 = this.engineState[9]--;
         }

      }
   }

   public int processBytes(byte[] var1, int var2, int var3, byte[] var4, int var5) {
      if (!this.initialised) {
         throw new IllegalStateException(this.getAlgorithmName() + " not initialised");
      } else if (var2 + var3 > var1.length) {
         throw new DataLengthException("input buffer too short");
      } else if (var5 + var3 > var4.length) {
         throw new OutputLengthException("output buffer too short");
      } else if (this.limitExceeded(var3)) {
         throw new MaxBytesExceededException("2^70 byte limit per IV would be exceeded; Change IV");
      } else {
         for(int var6 = 0; var6 < var3; ++var6) {
            var4[var6 + var5] = (byte)(this.keyStream[this.index] ^ var1[var6 + var2]);
            this.index = this.index + 1 & 63;
            if (this.index == 0) {
               this.advanceCounter();
               this.generateKeyStream(this.keyStream);
            }
         }

         return var3;
      }
   }

   public long getCounter() {
      return (long)this.engineState[9] << 32 | (long)this.engineState[8] & 4294967295L;
   }

   public long seekTo(long var1) {
      this.reset();
      return this.skip(var1);
   }

   public long getPosition() {
      return this.getCounter() * 64L + (long)this.index;
   }

   public void reset() {
      this.index = 0;
      this.resetLimitCounter();
      this.resetCounter();
      this.generateKeyStream(this.keyStream);
   }

   public void packTauOrSigma(int var1, int[] var2, int var3) {
      int var4 = (var1 - 16) / 4;
      var2[var3] = TAU_SIGMA[var4];
      var2[var3 + 1] = TAU_SIGMA[var4 + 1];
      var2[var3 + 2] = TAU_SIGMA[var4 + 2];
      var2[var3 + 3] = TAU_SIGMA[var4 + 3];
   }

   void resetLimitCounter() {
      this.cW0 = 0;
      this.cW1 = 0;
      this.cW2 = 0;
   }

   public void init(boolean var1, CipherParameters var2) {
      if (!(var2 instanceof ParametersWithIV)) {
         throw new IllegalArgumentException(this.getAlgorithmName() + " Init parameters must include an IV");
      } else {
         ParametersWithIV var3 = (ParametersWithIV)var2;
         byte[] var4 = var3.getIV();
         if (var4 != null && var4.length == this.getNonceSize()) {
            CipherParameters var5 = var3.getParameters();
            if (var5 == null) {
               if (!this.initialised) {
                  throw new IllegalStateException(this.getAlgorithmName() + " KeyParameter can not be null for first initialisation");
               }

               this.setKey((byte[])null, var4);
            } else {
               if (!(var5 instanceof KeyParameter)) {
                  throw new IllegalArgumentException(this.getAlgorithmName() + " Init parameters must contain a KeyParameter (or null for re-init)");
               }

               this.setKey(((KeyParameter)var5).getKey(), var4);
            }

            this.reset();
            this.initialised = true;
         } else {
            throw new IllegalArgumentException(this.getAlgorithmName() + " requires exactly " + this.getNonceSize() + " bytes of IV");
         }
      }
   }

   public void generateKeyStream(byte[] var1) {
      salsaCore(this.rounds, this.engineState, this.x);
      Pack.intToLittleEndian(this.x, var1, 0);
   }

   public static void salsaCore(int var0, int[] var1, int[] var2) {
      if (var1.length != 16) {
         throw new IllegalArgumentException();
      } else if (var2.length != 16) {
         throw new IllegalArgumentException();
      } else if (var0 % 2 != 0) {
         throw new IllegalArgumentException("Number of rounds must be even");
      } else {
         int var3 = var1[0];
         int var4 = var1[1];
         int var5 = var1[2];
         int var6 = var1[3];
         int var7 = var1[4];
         int var8 = var1[5];
         int var9 = var1[6];
         int var10 = var1[7];
         int var11 = var1[8];
         int var12 = var1[9];
         int var13 = var1[10];
         int var14 = var1[11];
         int var15 = var1[12];
         int var16 = var1[13];
         int var17 = var1[14];
         int var18 = var1[15];

         for(int var19 = var0; var19 > 0; var19 -= 2) {
            var7 ^= rotl(var3 + var15, 7);
            var11 ^= rotl(var7 + var3, 9);
            var15 ^= rotl(var11 + var7, 13);
            var3 ^= rotl(var15 + var11, 18);
            var12 ^= rotl(var8 + var4, 7);
            var16 ^= rotl(var12 + var8, 9);
            var4 ^= rotl(var16 + var12, 13);
            var8 ^= rotl(var4 + var16, 18);
            var17 ^= rotl(var13 + var9, 7);
            var5 ^= rotl(var17 + var13, 9);
            var9 ^= rotl(var5 + var17, 13);
            var13 ^= rotl(var9 + var5, 18);
            var6 ^= rotl(var18 + var14, 7);
            var10 ^= rotl(var6 + var18, 9);
            var14 ^= rotl(var10 + var6, 13);
            var18 ^= rotl(var14 + var10, 18);
            var4 ^= rotl(var3 + var6, 7);
            var5 ^= rotl(var4 + var3, 9);
            var6 ^= rotl(var5 + var4, 13);
            var3 ^= rotl(var6 + var5, 18);
            var9 ^= rotl(var8 + var7, 7);
            var10 ^= rotl(var9 + var8, 9);
            var7 ^= rotl(var10 + var9, 13);
            var8 ^= rotl(var7 + var10, 18);
            var14 ^= rotl(var13 + var12, 7);
            var11 ^= rotl(var14 + var13, 9);
            var12 ^= rotl(var11 + var14, 13);
            var13 ^= rotl(var12 + var11, 18);
            var15 ^= rotl(var18 + var17, 7);
            var16 ^= rotl(var15 + var18, 9);
            var17 ^= rotl(var16 + var15, 13);
            var18 ^= rotl(var17 + var16, 18);
         }

         var2[0] = var3 + var1[0];
         var2[1] = var4 + var1[1];
         var2[2] = var5 + var1[2];
         var2[3] = var6 + var1[3];
         var2[4] = var7 + var1[4];
         var2[5] = var8 + var1[5];
         var2[6] = var9 + var1[6];
         var2[7] = var10 + var1[7];
         var2[8] = var11 + var1[8];
         var2[9] = var12 + var1[9];
         var2[10] = var13 + var1[10];
         var2[11] = var14 + var1[11];
         var2[12] = var15 + var1[12];
         var2[13] = var16 + var1[13];
         var2[14] = var17 + var1[14];
         var2[15] = var18 + var1[15];
      }
   }

   public byte returnByte(byte var1) {
      if (this.limitExceeded()) {
         throw new MaxBytesExceededException("2^70 byte limit per IV; Change IV");
      } else {
         byte var2 = (byte)(this.keyStream[this.index] ^ var1);
         this.index = this.index + 1 & 63;
         if (this.index == 0) {
            this.advanceCounter();
            this.generateKeyStream(this.keyStream);
         }

         return var2;
      }
   }

   public static int rotl(int var0, int var1) {
      return var0 << var1 | var0 >>> -var1;
   }

   public void setKey(byte[] var1, byte[] var2) {
      if (var1 != null) {
         if (var1.length != 16 && var1.length != 32) {
            throw new IllegalArgumentException(this.getAlgorithmName() + " requires 128 bit or 256 bit key");
         }

         int var3 = (var1.length - 16) / 4;
         this.engineState[0] = TAU_SIGMA[var3];
         this.engineState[5] = TAU_SIGMA[var3 + 1];
         this.engineState[10] = TAU_SIGMA[var3 + 2];
         this.engineState[15] = TAU_SIGMA[var3 + 3];
         Pack.littleEndianToInt(var1, 0, this.engineState, 1, 4);
         Pack.littleEndianToInt(var1, var1.length - 16, this.engineState, 11, 4);
      }

      Pack.littleEndianToInt(var2, 0, this.engineState, 6, 2);
   }

   boolean limitExceeded(int var1) {
      this.cW0 += var1;
      if (this.cW0 < var1 && this.cW0 >= 0 && ++this.cW1 == 0) {
         return (++this.cW2 & 32) != 0;
      } else {
         return false;
      }
   }
}
