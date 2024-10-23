package org.bouncycastle.crypto.modes.gcm;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

public class Tables8kGCMMultiplier implements GCMMultiplier {
   byte[] H;
   int[][][] M;

   public void init(byte[] var1) {
      if (this.M == null) {
         this.M = new int[32][16][4];
      } else if (Arrays.areEqual(this.H, var1)) {
         return;
      }

      this.H = Arrays.clone(var1);
      GCMUtil.asInts(var1, this.M[1][8]);

      int var2;
      for(var2 = 4; var2 >= 1; var2 >>= 1) {
         GCMUtil.multiplyP(this.M[1][var2 + var2], this.M[1][var2]);
      }

      GCMUtil.multiplyP(this.M[1][1], this.M[0][8]);

      for(var2 = 4; var2 >= 1; var2 >>= 1) {
         GCMUtil.multiplyP(this.M[0][var2 + var2], this.M[0][var2]);
      }

      var2 = 0;

      while(true) {
         int var3;
         do {
            for(var3 = 2; var3 < 16; var3 += var3) {
               for(int var4 = 1; var4 < var3; ++var4) {
                  GCMUtil.xor(this.M[var2][var3], this.M[var2][var4], this.M[var2][var3 + var4]);
               }
            }

            ++var2;
            if (var2 == 32) {
               return;
            }
         } while(var2 <= 1);

         for(var3 = 8; var3 > 0; var3 >>= 1) {
            GCMUtil.multiplyP8(this.M[var2 - 2][var3], this.M[var2][var3]);
         }
      }
   }

   public void multiplyH(byte[] var1) {
      int[] var2 = new int[4];

      for(int var3 = 15; var3 >= 0; --var3) {
         int[] var4 = this.M[var3 + var3][var1[var3] & 15];
         var2[0] ^= var4[0];
         var2[1] ^= var4[1];
         var2[2] ^= var4[2];
         var2[3] ^= var4[3];
         var4 = this.M[var3 + var3 + 1][(var1[var3] & 240) >>> 4];
         var2[0] ^= var4[0];
         var2[1] ^= var4[1];
         var2[2] ^= var4[2];
         var2[3] ^= var4[3];
      }

      Pack.intToBigEndian(var2, var1, 0);
   }
}
