package org.bouncycastle.math.ec.custom.djb;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

public class Curve25519Field {
   static final int P7 = Integer.MAX_VALUE;
   static final long M = 4294967295L;
   static final int[] P = new int[]{-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
   static final int[] PExt = new int[]{361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};
   static final int PInv = 19;

   public static void reduce(int[] var0, int[] var1) {
      int var2 = var0[7];
      Nat.shiftUpBit(8, var0, 8, var2, var1, 0);
      int var3 = Nat256.mulByWordAddTo(19, var0, var1) << 1;
      int var4 = var1[7];
      var3 += (var4 >>> 31) - (var2 >>> 31);
      var4 &= Integer.MAX_VALUE;
      var4 += Nat.addWordTo(7, var3 * 19, var1);
      var1[7] = var4;
      if (Nat256.gte(var1, P)) {
         subPFrom(var1);
      }

   }

   public static void add(int[] var0, int[] var1, int[] var2) {
      Nat256.add(var0, var1, var2);
      if (Nat256.gte(var2, P)) {
         subPFrom(var2);
      }

   }

   public static void addExt(int[] var0, int[] var1, int[] var2) {
      Nat.add(16, var0, var1, var2);
      if (Nat.gte(16, var2, PExt)) {
         subPExtFrom(var2);
      }

   }

   public static void subtractExt(int[] var0, int[] var1, int[] var2) {
      int var3 = Nat.sub(16, var0, var1, var2);
      if (var3 != 0) {
         addPExtTo(var2);
      }

   }

   public static void half(int[] var0, int[] var1) {
      if ((var0[0] & 1) == 0) {
         Nat.shiftDownBit(8, var0, 0, var1);
      } else {
         Nat256.add(var0, P, var1);
         Nat.shiftDownBit(8, var1, 0);
      }

   }

   public static void addOne(int[] var0, int[] var1) {
      Nat.inc(8, var0, var1);
      if (Nat256.gte(var1, P)) {
         subPFrom(var1);
      }

   }

   public static void multiplyAddToExt(int[] var0, int[] var1, int[] var2) {
      Nat256.mulAddTo(var0, var1, var2);
      if (Nat.gte(16, var2, PExt)) {
         subPExtFrom(var2);
      }

   }

   public static void negate(int[] var0, int[] var1) {
      if (Nat256.isZero(var0)) {
         Nat256.zero(var1);
      } else {
         Nat256.sub(P, var0, var1);
      }

   }

   static int subPFrom(int[] var0) {
      long var1 = ((long)var0[0] & 4294967295L) + 19L;
      var0[0] = (int)var1;
      var1 >>= 32;
      if (var1 != 0L) {
         var1 = (long)Nat.incAt(7, var0, 1);
      }

      var1 += ((long)var0[7] & 4294967295L) - 2147483648L;
      var0[7] = (int)var1;
      var1 >>= 32;
      return (int)var1;
   }

   public static void reduce27(int var0, int[] var1) {
      int var2 = var1[7];
      int var3 = var0 << 1 | var2 >>> 31;
      var2 &= Integer.MAX_VALUE;
      var2 += Nat.addWordTo(7, var3 * 19, var1);
      var1[7] = var2;
      if (Nat256.gte(var1, P)) {
         subPFrom(var1);
      }

   }

   public static void square(int[] var0, int[] var1) {
      int[] var2 = Nat256.createExt();
      Nat256.square(var0, var2);
      reduce(var2, var1);
   }

   public static void squareN(int[] var0, int var1, int[] var2) {
      int[] var3 = Nat256.createExt();
      Nat256.square(var0, var3);
      reduce(var3, var2);

      while(true) {
         --var1;
         if (var1 <= 0) {
            return;
         }

         Nat256.square(var2, var3);
         reduce(var3, var2);
      }
   }

   public static void subtract(int[] var0, int[] var1, int[] var2) {
      int var3 = Nat256.sub(var0, var1, var2);
      if (var3 != 0) {
         addPTo(var2);
      }

   }

   public static int[] fromBigInteger(BigInteger var0) {
      int[] var1 = Nat256.fromBigInteger(var0);

      while(Nat256.gte(var1, P)) {
         Nat256.subFrom(P, var1);
      }

      return var1;
   }

   public static void twice(int[] var0, int[] var1) {
      Nat.shiftUpBit(8, var0, 0, var1);
      if (Nat256.gte(var1, P)) {
         subPFrom(var1);
      }

   }

   static int addPTo(int[] var0) {
      long var1 = ((long)var0[0] & 4294967295L) - 19L;
      var0[0] = (int)var1;
      var1 >>= 32;
      if (var1 != 0L) {
         var1 = (long)Nat.decAt(7, var0, 1);
      }

      var1 += ((long)var0[7] & 4294967295L) + 2147483648L;
      var0[7] = (int)var1;
      var1 >>= 32;
      return (int)var1;
   }

   static int addPExtTo(int[] var0) {
      long var1 = ((long)var0[0] & 4294967295L) + ((long)PExt[0] & 4294967295L);
      var0[0] = (int)var1;
      var1 >>= 32;
      if (var1 != 0L) {
         var1 = (long)Nat.incAt(8, var0, 1);
      }

      var1 += ((long)var0[8] & 4294967295L) - 19L;
      var0[8] = (int)var1;
      var1 >>= 32;
      if (var1 != 0L) {
         var1 = (long)Nat.decAt(15, var0, 9);
      }

      var1 += ((long)var0[15] & 4294967295L) + ((long)(PExt[15] + 1) & 4294967295L);
      var0[15] = (int)var1;
      var1 >>= 32;
      return (int)var1;
   }

   public static void multiply(int[] var0, int[] var1, int[] var2) {
      int[] var3 = Nat256.createExt();
      Nat256.mul(var0, var1, var3);
      reduce(var3, var2);
   }

   static int subPExtFrom(int[] var0) {
      long var1 = ((long)var0[0] & 4294967295L) - ((long)PExt[0] & 4294967295L);
      var0[0] = (int)var1;
      var1 >>= 32;
      if (var1 != 0L) {
         var1 = (long)Nat.decAt(8, var0, 1);
      }

      var1 += ((long)var0[8] & 4294967295L) + 19L;
      var0[8] = (int)var1;
      var1 >>= 32;
      if (var1 != 0L) {
         var1 = (long)Nat.incAt(15, var0, 9);
      }

      var1 += ((long)var0[15] & 4294967295L) - ((long)(PExt[15] + 1) & 4294967295L);
      var0[15] = (int)var1;
      var1 >>= 32;
      return (int)var1;
   }
}
