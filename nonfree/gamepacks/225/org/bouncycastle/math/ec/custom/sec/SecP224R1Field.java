package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat224;

public class SecP224R1Field {
   static final int[] PExt = new int[]{1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};
   static final int[] P = new int[]{1, 0, 0, -1, -1, -1, -1};
   static final int[] PExtInv = new int[]{-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};
   static final int PExt13 = -1;
   static final int P6 = -1;
   static final long M = 4294967295L;

   static void addPInvTo(int[] var0) {
      long var1 = ((long)var0[0] & 4294967295L) - 1L;
      var0[0] = (int)var1;
      var1 >>= 32;
      if (var1 != 0L) {
         var1 += (long)var0[1] & 4294967295L;
         var0[1] = (int)var1;
         var1 >>= 32;
         var1 += (long)var0[2] & 4294967295L;
         var0[2] = (int)var1;
         var1 >>= 32;
      }

      var1 += ((long)var0[3] & 4294967295L) + 1L;
      var0[3] = (int)var1;
      var1 >>= 32;
      if (var1 != 0L) {
         Nat.incAt(7, var0, 4);
      }

   }

   public static void addExt(int[] var0, int[] var1, int[] var2) {
      int var3 = Nat.add(14, var0, var1, var2);
      if ((var3 != 0 || var2[13] == -1 && Nat.gte(14, var2, PExt)) && Nat.addTo(PExtInv.length, PExtInv, var2) != 0) {
         Nat.incAt(14, var2, PExtInv.length);
      }

   }

   public static void multiplyAddToExt(int[] var0, int[] var1, int[] var2) {
      int var3 = Nat224.mulAddTo(var0, var1, var2);
      if ((var3 != 0 || var2[13] == -1 && Nat.gte(14, var2, PExt)) && Nat.addTo(PExtInv.length, PExtInv, var2) != 0) {
         Nat.incAt(14, var2, PExtInv.length);
      }

   }

   public static int[] fromBigInteger(BigInteger var0) {
      int[] var1 = Nat224.fromBigInteger(var0);
      if (var1[6] == -1 && Nat224.gte(var1, P)) {
         Nat224.subFrom(P, var1);
      }

      return var1;
   }

   public static void half(int[] var0, int[] var1) {
      if ((var0[0] & 1) == 0) {
         Nat.shiftDownBit(7, var0, 0, var1);
      } else {
         int var2 = Nat224.add(var0, P, var1);
         Nat.shiftDownBit(7, var1, var2);
      }

   }

   public static void multiply(int[] var0, int[] var1, int[] var2) {
      int[] var3 = Nat224.createExt();
      Nat224.mul(var0, var1, var3);
      reduce(var3, var2);
   }

   public static void reduce32(int var0, int[] var1) {
      long var2 = 0L;
      if (var0 != 0) {
         long var4 = (long)var0 & 4294967295L;
         var2 += ((long)var1[0] & 4294967295L) - var4;
         var1[0] = (int)var2;
         var2 >>= 32;
         if (var2 != 0L) {
            var2 += (long)var1[1] & 4294967295L;
            var1[1] = (int)var2;
            var2 >>= 32;
            var2 += (long)var1[2] & 4294967295L;
            var1[2] = (int)var2;
            var2 >>= 32;
         }

         var2 += ((long)var1[3] & 4294967295L) + var4;
         var1[3] = (int)var2;
         var2 >>= 32;
      }

      if (var2 != 0L && Nat.incAt(7, var1, 4) != 0 || var1[6] == -1 && Nat224.gte(var1, P)) {
         addPInvTo(var1);
      }

   }

   public static void negate(int[] var0, int[] var1) {
      if (Nat224.isZero(var0)) {
         Nat224.zero(var1);
      } else {
         Nat224.sub(P, var0, var1);
      }

   }

   public static void reduce(int[] var0, int[] var1) {
      long var2 = (long)var0[10] & 4294967295L;
      long var4 = (long)var0[11] & 4294967295L;
      long var6 = (long)var0[12] & 4294967295L;
      long var8 = (long)var0[13] & 4294967295L;
      long var12 = ((long)var0[7] & 4294967295L) + var4 - 1L;
      long var14 = ((long)var0[8] & 4294967295L) + var6;
      long var16 = ((long)var0[9] & 4294967295L) + var8;
      long var18 = 0L;
      var18 += ((long)var0[0] & 4294967295L) - var12;
      long var20 = var18 & 4294967295L;
      var18 >>= 32;
      var18 += ((long)var0[1] & 4294967295L) - var14;
      var1[1] = (int)var18;
      var18 >>= 32;
      var18 += ((long)var0[2] & 4294967295L) - var16;
      var1[2] = (int)var18;
      var18 >>= 32;
      var18 += ((long)var0[3] & 4294967295L) + var12 - var2;
      long var22 = var18 & 4294967295L;
      var18 >>= 32;
      var18 += ((long)var0[4] & 4294967295L) + var14 - var4;
      var1[4] = (int)var18;
      var18 >>= 32;
      var18 += ((long)var0[5] & 4294967295L) + var16 - var6;
      var1[5] = (int)var18;
      var18 >>= 32;
      var18 += ((long)var0[6] & 4294967295L) + var2 - var8;
      var1[6] = (int)var18;
      var18 >>= 32;
      ++var18;
      var22 += var18;
      var20 -= var18;
      var1[0] = (int)var20;
      var18 = var20 >> 32;
      if (var18 != 0L) {
         var18 += (long)var1[1] & 4294967295L;
         var1[1] = (int)var18;
         var18 >>= 32;
         var18 += (long)var1[2] & 4294967295L;
         var1[2] = (int)var18;
         var22 += var18 >> 32;
      }

      var1[3] = (int)var22;
      var18 = var22 >> 32;
      if (var18 != 0L && Nat.incAt(7, var1, 4) != 0 || var1[6] == -1 && Nat224.gte(var1, P)) {
         addPInvTo(var1);
      }

   }

   public static void square(int[] var0, int[] var1) {
      int[] var2 = Nat224.createExt();
      Nat224.square(var0, var2);
      reduce(var2, var1);
   }

   public static void squareN(int[] var0, int var1, int[] var2) {
      int[] var3 = Nat224.createExt();
      Nat224.square(var0, var3);
      reduce(var3, var2);

      while(true) {
         --var1;
         if (var1 <= 0) {
            return;
         }

         Nat224.square(var2, var3);
         reduce(var3, var2);
      }
   }

   public static void subtract(int[] var0, int[] var1, int[] var2) {
      int var3 = Nat224.sub(var0, var1, var2);
      if (var3 != 0) {
         subPInvFrom(var2);
      }

   }

   public static void subtractExt(int[] var0, int[] var1, int[] var2) {
      int var3 = Nat.sub(14, var0, var1, var2);
      if (var3 != 0 && Nat.subFrom(PExtInv.length, PExtInv, var2) != 0) {
         Nat.decAt(14, var2, PExtInv.length);
      }

   }

   public static void twice(int[] var0, int[] var1) {
      int var2 = Nat.shiftUpBit(7, var0, 0, var1);
      if (var2 != 0 || var1[6] == -1 && Nat224.gte(var1, P)) {
         addPInvTo(var1);
      }

   }

   public static void addOne(int[] var0, int[] var1) {
      int var2 = Nat.inc(7, var0, var1);
      if (var2 != 0 || var1[6] == -1 && Nat224.gte(var1, P)) {
         addPInvTo(var1);
      }

   }

   static void subPInvFrom(int[] var0) {
      long var1 = ((long)var0[0] & 4294967295L) + 1L;
      var0[0] = (int)var1;
      var1 >>= 32;
      if (var1 != 0L) {
         var1 += (long)var0[1] & 4294967295L;
         var0[1] = (int)var1;
         var1 >>= 32;
         var1 += (long)var0[2] & 4294967295L;
         var0[2] = (int)var1;
         var1 >>= 32;
      }

      var1 += ((long)var0[3] & 4294967295L) - 1L;
      var0[3] = (int)var1;
      var1 >>= 32;
      if (var1 != 0L) {
         Nat.decAt(7, var0, 4);
      }

   }

   public static void add(int[] var0, int[] var1, int[] var2) {
      int var3 = Nat224.add(var0, var1, var2);
      if (var3 != 0 || var2[6] == -1 && Nat224.gte(var2, P)) {
         addPInvTo(var2);
      }

   }
}
