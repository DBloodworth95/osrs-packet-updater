package org.bouncycastle.math.ec.custom.sec;

import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.ECPoint$AbstractFp;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

public class SecP256K1Point extends ECPoint$AbstractFp {
   /** @deprecated */
   public SecP256K1Point(ECCurve var1, ECFieldElement var2, ECFieldElement var3) {
      this(var1, var2, var3, false);
   }

   public ECPoint threeTimes() {
      return (ECPoint)(!this.isInfinity() && !this.y.isZero() ? this.twice().add(this) : this);
   }

   SecP256K1Point(ECCurve var1, ECFieldElement var2, ECFieldElement var3, ECFieldElement[] var4, boolean var5) {
      super(var1, var2, var3, var4);
      this.withCompression = var5;
   }

   public ECPoint detach() {
      return new SecP256K1Point((ECCurve)null, this.getAffineXCoord(), this.getAffineYCoord());
   }

   public ECPoint add(ECPoint var1) {
      if (this.isInfinity()) {
         return var1;
      } else if (var1.isInfinity()) {
         return this;
      } else if (this == var1) {
         return this.twice();
      } else {
         ECCurve var2 = this.getCurve();
         SecP256K1FieldElement var3 = (SecP256K1FieldElement)this.x;
         SecP256K1FieldElement var4 = (SecP256K1FieldElement)this.y;
         SecP256K1FieldElement var5 = (SecP256K1FieldElement)var1.getXCoord();
         SecP256K1FieldElement var6 = (SecP256K1FieldElement)var1.getYCoord();
         SecP256K1FieldElement var7 = (SecP256K1FieldElement)this.zs[0];
         SecP256K1FieldElement var8 = (SecP256K1FieldElement)var1.getZCoord(0);
         int[] var10 = Nat256.createExt();
         int[] var11 = Nat256.create();
         int[] var12 = Nat256.create();
         int[] var13 = Nat256.create();
         boolean var14 = var7.isOne();
         int[] var15;
         int[] var16;
         if (var14) {
            var15 = var5.x;
            var16 = var6.x;
         } else {
            var16 = var12;
            SecP256K1Field.square(var7.x, var12);
            var15 = var11;
            SecP256K1Field.multiply(var12, var5.x, var11);
            SecP256K1Field.multiply(var12, var7.x, var12);
            SecP256K1Field.multiply(var12, var6.x, var12);
         }

         boolean var17 = var8.isOne();
         int[] var18;
         int[] var19;
         if (var17) {
            var18 = var3.x;
            var19 = var4.x;
         } else {
            var19 = var13;
            SecP256K1Field.square(var8.x, var13);
            var18 = var10;
            SecP256K1Field.multiply(var13, var3.x, var10);
            SecP256K1Field.multiply(var13, var8.x, var13);
            SecP256K1Field.multiply(var13, var4.x, var13);
         }

         int[] var20 = Nat256.create();
         SecP256K1Field.subtract(var18, var15, var20);
         SecP256K1Field.subtract(var19, var16, var11);
         if (Nat256.isZero(var20)) {
            return Nat256.isZero(var11) ? this.twice() : var2.getInfinity();
         } else {
            SecP256K1Field.square(var20, var12);
            int[] var23 = Nat256.create();
            SecP256K1Field.multiply(var12, var20, var23);
            SecP256K1Field.multiply(var12, var18, var12);
            SecP256K1Field.negate(var23, var23);
            Nat256.mul(var19, var23, var10);
            int var9 = Nat256.addBothTo(var12, var12, var23);
            SecP256K1Field.reduce32(var9, var23);
            SecP256K1FieldElement var25 = new SecP256K1FieldElement(var13);
            SecP256K1Field.square(var11, var25.x);
            SecP256K1Field.subtract(var25.x, var23, var25.x);
            SecP256K1FieldElement var26 = new SecP256K1FieldElement(var23);
            SecP256K1Field.subtract(var12, var25.x, var26.x);
            SecP256K1Field.multiplyAddToExt(var26.x, var11, var10);
            SecP256K1Field.reduce(var10, var26.x);
            SecP256K1FieldElement var27 = new SecP256K1FieldElement(var20);
            if (!var14) {
               SecP256K1Field.multiply(var27.x, var7.x, var27.x);
            }

            if (!var17) {
               SecP256K1Field.multiply(var27.x, var8.x, var27.x);
            }

            ECFieldElement[] var28 = new ECFieldElement[]{var27};
            return new SecP256K1Point(var2, var25, var26, var28, this.withCompression);
         }
      }
   }

   public ECPoint twice() {
      if (this.isInfinity()) {
         return this;
      } else {
         ECCurve var1 = this.getCurve();
         SecP256K1FieldElement var2 = (SecP256K1FieldElement)this.y;
         if (var2.isZero()) {
            return var1.getInfinity();
         } else {
            SecP256K1FieldElement var3 = (SecP256K1FieldElement)this.x;
            SecP256K1FieldElement var4 = (SecP256K1FieldElement)this.zs[0];
            int[] var6 = Nat256.create();
            SecP256K1Field.square(var2.x, var6);
            int[] var7 = Nat256.create();
            SecP256K1Field.square(var6, var7);
            int[] var8 = Nat256.create();
            SecP256K1Field.square(var3.x, var8);
            int var5 = Nat256.addBothTo(var8, var8, var8);
            SecP256K1Field.reduce32(var5, var8);
            SecP256K1Field.multiply(var6, var3.x, var6);
            var5 = Nat.shiftUpBits(8, var6, 2, 0);
            SecP256K1Field.reduce32(var5, var6);
            int[] var10 = Nat256.create();
            var5 = Nat.shiftUpBits(8, var7, 3, 0, var10);
            SecP256K1Field.reduce32(var5, var10);
            SecP256K1FieldElement var11 = new SecP256K1FieldElement(var7);
            SecP256K1Field.square(var8, var11.x);
            SecP256K1Field.subtract(var11.x, var6, var11.x);
            SecP256K1Field.subtract(var11.x, var6, var11.x);
            SecP256K1FieldElement var12 = new SecP256K1FieldElement(var6);
            SecP256K1Field.subtract(var6, var11.x, var12.x);
            SecP256K1Field.multiply(var12.x, var8, var12.x);
            SecP256K1Field.subtract(var12.x, var10, var12.x);
            SecP256K1FieldElement var13 = new SecP256K1FieldElement(var8);
            SecP256K1Field.twice(var2.x, var13.x);
            if (!var4.isOne()) {
               SecP256K1Field.multiply(var13.x, var4.x, var13.x);
            }

            return new SecP256K1Point(var1, var11, var12, new ECFieldElement[]{var13}, this.withCompression);
         }
      }
   }

   public ECPoint twicePlus(ECPoint var1) {
      if (this == var1) {
         return this.threeTimes();
      } else if (this.isInfinity()) {
         return var1;
      } else if (var1.isInfinity()) {
         return this.twice();
      } else {
         ECFieldElement var2 = this.y;
         return var2.isZero() ? var1 : this.twice().add(var1);
      }
   }

   /** @deprecated */
   public SecP256K1Point(ECCurve var1, ECFieldElement var2, ECFieldElement var3, boolean var4) {
      super(var1, var2, var3);
      if (var2 == null != (var3 == null)) {
         throw new IllegalArgumentException("Exactly one of the field elements is null");
      } else {
         this.withCompression = var4;
      }
   }

   public ECPoint negate() {
      return this.isInfinity() ? this : new SecP256K1Point(this.curve, this.x, this.y.negate(), this.zs, this.withCompression);
   }
}
