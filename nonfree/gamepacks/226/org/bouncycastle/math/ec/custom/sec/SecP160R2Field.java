package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat160;

public class SecP160R2Field {
   static final int[] PExtInv = new int[]{-457489321, -42779, -2, -1, -1, 42777, 2};
   static final int[] PExt = new int[]{457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};
   static final int[] P = new int[]{-21389, -2, -1, -1, -1};
   static final int P4 = -1;
   static final int PExt9 = -1;
   static final int PInv33 = 21389;

   public static void addExt(int[] var0, int[] var1, int[] var2) {
      int var3 = Nat.add(10, var0, var1, var2);
      if ((var3 != 0 || var2[9] == -1 && Nat.gte(10, var2, PExt)) && Nat.addTo(PExtInv.length, PExtInv, var2) != 0) {
         Nat.incAt(10, var2, PExtInv.length);
      }

   }

   public static void add(int[] var0, int[] var1, int[] var2) {
      int var3 = Nat160.add(var0, var1, var2);
      if (var3 != 0 || var2[4] == -1 && Nat160.gte(var2, P)) {
         Nat.add33To(5, 21389, var2);
      }

   }

   public static int[] fromBigInteger(BigInteger var0) {
      int[] var1 = Nat160.fromBigInteger(var0);
      if (var1[4] == -1 && Nat160.gte(var1, P)) {
         Nat160.subFrom(P, var1);
      }

      return var1;
   }

   public static void multiplyAddToExt(int[] var0, int[] var1, int[] var2) {
      int var3 = Nat160.mulAddTo(var0, var1, var2);
      if ((var3 != 0 || var2[9] == -1 && Nat.gte(10, var2, PExt)) && Nat.addTo(PExtInv.length, PExtInv, var2) != 0) {
         Nat.incAt(10, var2, PExtInv.length);
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

   public static void multiply(int[] var0, int[] var1, int[] var2) {
      int[] var3 = Nat160.createExt();
      Nat160.mul(var0, var1, var3);
      reduce(var3, var2);
   }

   public static void square(int[] var0, int[] var1) {
      int[] var2 = Nat160.createExt();
      Nat160.square(var0, var2);
      reduce(var2, var1);
   }

   public static void negate(int[] var0, int[] var1) {
      if (Nat160.isZero(var0)) {
         Nat160.zero(var1);
      } else {
         Nat160.sub(P, var0, var1);
      }

   }

   public static void reduce(int[] var0, int[] var1) {
      long var2 = Nat160.mul33Add(21389, var0, 5, var0, 0, var1, 0);
      int var4 = Nat160.mul33DWordAdd(21389, var2, var1, 0);
      if (var4 != 0 || var1[4] == -1 && Nat160.gte(var1, P)) {
         Nat.add33To(5, 21389, var1);
      }

   }

   public static void subtractExt(int[] var0, int[] var1, int[] var2) {
      int var3 = Nat.sub(10, var0, var1, var2);
      if (var3 != 0 && Nat.subFrom(PExtInv.length, PExtInv, var2) != 0) {
         Nat.decAt(10, var2, PExtInv.length);
      }

   }

   public static void reduce32(int var0, int[] var1) {
      if (var0 != 0 && Nat160.mul33WordAdd(21389, var0, var1, 0) != 0 || var1[4] == -1 && Nat160.gte(var1, P)) {
         Nat.add33To(5, 21389, var1);
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

   public static void subtract(int[] var0, int[] var1, int[] var2) {
      int var3 = Nat160.sub(var0, var1, var2);
      if (var3 != 0) {
         Nat.sub33From(5, 21389, var2);
      }

   }

   public static void addOne(int[] var0, int[] var1) {
      int var2 = Nat.inc(5, var0, var1);
      if (var2 != 0 || var1[4] == -1 && Nat160.gte(var1, P)) {
         Nat.add33To(5, 21389, var1);
      }

   }

   public static void twice(int[] var0, int[] var1) {
      int var2 = Nat.shiftUpBit(5, var0, 0, var1);
      if (var2 != 0 || var1[4] == -1 && Nat160.gte(var1, P)) {
         Nat.add33To(5, 21389, var1);
      }

   }
}
