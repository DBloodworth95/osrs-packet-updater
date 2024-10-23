package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat192;

public class SecP192K1Field {
   static final int PInv33 = 4553;
   static final int[] PExt = new int[]{20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};
   static final int[] PExtInv = new int[]{-20729809, -9107, -2, -1, -1, -1, 9105, 2};
   static final int P5 = -1;
   static final int PExt11 = -1;
   static final int[] P = new int[]{-4553, -2, -1, -1, -1, -1};

   public static void multiply(int[] var0, int[] var1, int[] var2) {
      int[] var3 = Nat192.createExt();
      Nat192.mul(var0, var1, var3);
      reduce(var3, var2);
   }

   public static void add(int[] var0, int[] var1, int[] var2) {
      int var3 = Nat192.add(var0, var1, var2);
      if (var3 != 0 || var2[5] == -1 && Nat192.gte(var2, P)) {
         Nat.add33To(6, 4553, var2);
      }

   }

   public static int[] fromBigInteger(BigInteger var0) {
      int[] var1 = Nat192.fromBigInteger(var0);
      if (var1[5] == -1 && Nat192.gte(var1, P)) {
         Nat192.subFrom(P, var1);
      }

      return var1;
   }

   public static void addOne(int[] var0, int[] var1) {
      int var2 = Nat.inc(6, var0, var1);
      if (var2 != 0 || var1[5] == -1 && Nat192.gte(var1, P)) {
         Nat.add33To(6, 4553, var1);
      }

   }

   public static void subtractExt(int[] var0, int[] var1, int[] var2) {
      int var3 = Nat.sub(12, var0, var1, var2);
      if (var3 != 0 && Nat.subFrom(PExtInv.length, PExtInv, var2) != 0) {
         Nat.decAt(12, var2, PExtInv.length);
      }

   }

   public static void half(int[] var0, int[] var1) {
      if ((var0[0] & 1) == 0) {
         Nat.shiftDownBit(6, var0, 0, var1);
      } else {
         int var2 = Nat192.add(var0, P, var1);
         Nat.shiftDownBit(6, var1, var2);
      }

   }

   public static void reduce32(int var0, int[] var1) {
      if (var0 != 0 && Nat192.mul33WordAdd(4553, var0, var1, 0) != 0 || var1[5] == -1 && Nat192.gte(var1, P)) {
         Nat.add33To(6, 4553, var1);
      }

   }

   public static void multiplyAddToExt(int[] var0, int[] var1, int[] var2) {
      int var3 = Nat192.mulAddTo(var0, var1, var2);
      if ((var3 != 0 || var2[11] == -1 && Nat.gte(12, var2, PExt)) && Nat.addTo(PExtInv.length, PExtInv, var2) != 0) {
         Nat.incAt(12, var2, PExtInv.length);
      }

   }

   public static void reduce(int[] var0, int[] var1) {
      long var2 = Nat192.mul33Add(4553, var0, 6, var0, 0, var1, 0);
      int var4 = Nat192.mul33DWordAdd(4553, var2, var1, 0);
      if (var4 != 0 || var1[5] == -1 && Nat192.gte(var1, P)) {
         Nat.add33To(6, 4553, var1);
      }

   }

   public static void negate(int[] var0, int[] var1) {
      if (Nat192.isZero(var0)) {
         Nat192.zero(var1);
      } else {
         Nat192.sub(P, var0, var1);
      }

   }

   public static void square(int[] var0, int[] var1) {
      int[] var2 = Nat192.createExt();
      Nat192.square(var0, var2);
      reduce(var2, var1);
   }

   public static void squareN(int[] var0, int var1, int[] var2) {
      int[] var3 = Nat192.createExt();
      Nat192.square(var0, var3);
      reduce(var3, var2);

      while(true) {
         --var1;
         if (var1 <= 0) {
            return;
         }

         Nat192.square(var2, var3);
         reduce(var3, var2);
      }
   }

   public static void subtract(int[] var0, int[] var1, int[] var2) {
      int var3 = Nat192.sub(var0, var1, var2);
      if (var3 != 0) {
         Nat.sub33From(6, 4553, var2);
      }

   }

   public static void twice(int[] var0, int[] var1) {
      int var2 = Nat.shiftUpBit(6, var0, 0, var1);
      if (var2 != 0 || var1[5] == -1 && Nat192.gte(var1, P)) {
         Nat.add33To(6, 4553, var1);
      }

   }

   public static void addExt(int[] var0, int[] var1, int[] var2) {
      int var3 = Nat.add(12, var0, var1, var2);
      if ((var3 != 0 || var2[11] == -1 && Nat.gte(12, var2, PExt)) && Nat.addTo(PExtInv.length, PExtInv, var2) != 0) {
         Nat.incAt(12, var2, PExtInv.length);
      }

   }
}
