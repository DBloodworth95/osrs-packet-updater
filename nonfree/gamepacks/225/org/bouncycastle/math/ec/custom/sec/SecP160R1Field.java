package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat160;

public class SecP160R1Field {
   static final int[] PExtInv = new int[]{-1, -1073741826, -1, -1, -1, 1, 1};
   static final int[] P = new int[]{Integer.MAX_VALUE, -1, -1, -1, -1};
   static final int[] PExt = new int[]{1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};
   static final int PExt9 = -1;
   static final int P4 = -1;
   static final int PInv = -2147483647;
   static final long M = 4294967295L;

   public static void add(int[] var0, int[] var1, int[] var2) {
      int var3 = Nat160.add(var0, var1, var2);
      if (var3 != 0 || var2[4] == -1 && Nat160.gte(var2, P)) {
         Nat.addWordTo(5, -2147483647, var2);
      }

   }

   public static void addExt(int[] var0, int[] var1, int[] var2) {
      int var3 = Nat.add(10, var0, var1, var2);
      if ((var3 != 0 || var2[9] == -1 && Nat.gte(10, var2, PExt)) && Nat.addTo(PExtInv.length, PExtInv, var2) != 0) {
         Nat.incAt(10, var2, PExtInv.length);
      }

   }

   public static void squareN(int[] var0, int var1, int[] var2) {
      int[] var3 = Nat160.createExt();
      Nat160.square(var0, var3);
      reduce(var3, var2);

      while(true) {
         --var1;
         if (var1 <= 0) {
            return;
         }

         Nat160.square(var2, var3);
         reduce(var3, var2);
      }
   }

   public static int[] fromBigInteger(BigInteger var0) {
      int[] var1 = Nat160.fromBigInteger(var0);
      if (var1[4] == -1 && Nat160.gte(var1, P)) {
         Nat160.subFrom(P, var1);
      }

      return var1;
   }

   public static void square(int[] var0, int[] var1) {
      int[] var2 = Nat160.createExt();
      Nat160.square(var0, var2);
      reduce(var2, var1);
   }

   public static void multiply(int[] var0, int[] var1, int[] var2) {
      int[] var3 = Nat160.createExt();
      Nat160.mul(var0, var1, var3);
      reduce(var3, var2);
   }

   public static void multiplyAddToExt(int[] var0, int[] var1, int[] var2) {
      int var3 = Nat160.mulAddTo(var0, var1, var2);
      if ((var3 != 0 || var2[9] == -1 && Nat.gte(10, var2, PExt)) && Nat.addTo(PExtInv.length, PExtInv, var2) != 0) {
         Nat.incAt(10, var2, PExtInv.length);
      }

   }

   public static void negate(int[] var0, int[] var1) {
      if (Nat160.isZero(var0)) {
         Nat160.zero(var1);
      } else {
         Nat160.sub(P, var0, var1);
      }

   }

   public static void reduce(int[] var0, int[] var1) {
      long var2 = (long)var0[5] & 4294967295L;
      long var4 = (long)var0[6] & 4294967295L;
      long var6 = (long)var0[7] & 4294967295L;
      long var8 = (long)var0[8] & 4294967295L;
      long var10 = (long)var0[9] & 4294967295L;
      long var12 = 0L;
      var12 += ((long)var0[0] & 4294967295L) + var2 + (var2 << 31);
      var1[0] = (int)var12;
      var12 >>>= 32;
      var12 += ((long)var0[1] & 4294967295L) + var4 + (var4 << 31);
      var1[1] = (int)var12;
      var12 >>>= 32;
      var12 += ((long)var0[2] & 4294967295L) + var6 + (var6 << 31);
      var1[2] = (int)var12;
      var12 >>>= 32;
      var12 += ((long)var0[3] & 4294967295L) + var8 + (var8 << 31);
      var1[3] = (int)var12;
      var12 >>>= 32;
      var12 += ((long)var0[4] & 4294967295L) + var10 + (var10 << 31);
      var1[4] = (int)var12;
      var12 >>>= 32;
      reduce32((int)var12, var1);
   }

   public static void addOne(int[] var0, int[] var1) {
      int var2 = Nat.inc(5, var0, var1);
      if (var2 != 0 || var1[4] == -1 && Nat160.gte(var1, P)) {
         Nat.addWordTo(5, -2147483647, var1);
      }

   }

   public static void reduce32(int var0, int[] var1) {
      if (var0 != 0 && Nat160.mulWordsAdd(-2147483647, var0, var1, 0) != 0 || var1[4] == -1 && Nat160.gte(var1, P)) {
         Nat.addWordTo(5, -2147483647, var1);
      }

   }

   public static void subtract(int[] var0, int[] var1, int[] var2) {
      int var3 = Nat160.sub(var0, var1, var2);
      if (var3 != 0) {
         Nat.subWordFrom(5, -2147483647, var2);
      }

   }

   public static void subtractExt(int[] var0, int[] var1, int[] var2) {
      int var3 = Nat.sub(10, var0, var1, var2);
      if (var3 != 0 && Nat.subFrom(PExtInv.length, PExtInv, var2) != 0) {
         Nat.decAt(10, var2, PExtInv.length);
      }

   }

   public static void twice(int[] var0, int[] var1) {
      int var2 = Nat.shiftUpBit(5, var0, 0, var1);
      if (var2 != 0 || var1[4] == -1 && Nat160.gte(var1, P)) {
         Nat.addWordTo(5, -2147483647, var1);
      }

   }

   public static void half(int[] var0, int[] var1) {
      if ((var0[0] & 1) == 0) {
         Nat.shiftDownBit(5, var0, 0, var1);
      } else {
         int var2 = Nat160.add(var0, P, var1);
         Nat.shiftDownBit(5, var1, var2);
      }

   }
}
