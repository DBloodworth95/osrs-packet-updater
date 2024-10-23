package org.bouncycastle.math.ec;

import java.math.BigInteger;
import java.util.Hashtable;
import org.bouncycastle.math.ec.endo.ECEndomorphism;
import org.bouncycastle.math.ec.endo.GLVEndomorphism;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Integers;

public abstract class ECCurve {
   public BigInteger order;
   public ECEndomorphism endomorphism = null;
   public static final int COORD_JACOBIAN = 2;
   public static final int COORD_JACOBIAN_CHUDNOVSKY = 3;
   public static final int COORD_JACOBIAN_MODIFIED = 4;
   public static final int COORD_LAMBDA_AFFINE = 5;
   public static final int COORD_HOMOGENEOUS = 1;
   public static final int COORD_SKEWED = 7;
   public static final int COORD_LAMBDA_PROJECTIVE = 6;
   public ECFieldElement a;
   public ECFieldElement b;
   public BigInteger cofactor;
   public static final int COORD_AFFINE = 0;
   public int coord = 0;
   public FiniteField field;
   public ECMultiplier multiplier = null;

   public void normalizeAll(ECPoint[] var1) {
      this.normalizeAll(var1, 0, var1.length, (ECFieldElement)null);
   }

   public ECCurve(FiniteField var1) {
      this.field = var1;
   }

   public abstract int getFieldSize();

   public boolean gg(Object var1) {
      return this == var1 || var1 instanceof ECCurve && this.equals((ECCurve)var1);
   }

   public abstract ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, boolean var3);

   public synchronized ECCurve$Config configure() {
      return new ECCurve$Config(this, this.coord, this.endomorphism, this.multiplier);
   }

   public int amy() {
      return this.getField().hashCode() ^ Integers.rotateLeft(this.getA().toBigInteger().hashCode(), 8) ^ Integers.rotateLeft(this.getB().toBigInteger().hashCode(), 16);
   }

   public PreCompInfo getPreCompInfo(ECPoint var1, String var2) {
      this.checkPoint(var1);
      synchronized(var1) {
         Hashtable var4 = var1.preCompTable;
         return var4 == null ? null : (PreCompInfo)var4.get(var2);
      }
   }

   /** @deprecated */
   public ECPoint validatePoint(BigInteger var1, BigInteger var2, boolean var3) {
      ECPoint var4 = this.createPoint(var1, var2, var3);
      if (!var4.isValid()) {
         throw new IllegalArgumentException("Invalid point coordinates");
      } else {
         return var4;
      }
   }

   /** @deprecated */
   public ECPoint createPoint(BigInteger var1, BigInteger var2, boolean var3) {
      return this.createRawPoint(this.fromBigInteger(var1), this.fromBigInteger(var2), var3);
   }

   public abstract ECCurve cloneCurve();

   public static int[] getAllCoordinateSystems() {
      return new int[]{0, 1, 2, 3, 4, 5, 6, 7};
   }

   public ECFieldElement getA() {
      return this.a;
   }

   public ECMultiplier createDefaultMultiplier() {
      return (ECMultiplier)(this.endomorphism instanceof GLVEndomorphism ? new GLVMultiplier(this, (GLVEndomorphism)this.endomorphism) : new WNafL2RMultiplier());
   }

   public boolean supportsCoordinateSystem(int var1) {
      return var1 == 0;
   }

   public ECPoint validatePoint(BigInteger var1, BigInteger var2) {
      ECPoint var3 = this.createPoint(var1, var2);
      if (!var3.isValid()) {
         throw new IllegalArgumentException("Invalid point coordinates");
      } else {
         return var3;
      }
   }

   public FiniteField getField() {
      return this.field;
   }

   public ECPoint importPoint(ECPoint var1) {
      if (this == var1.getCurve()) {
         return var1;
      } else if (var1.isInfinity()) {
         return this.getInfinity();
      } else {
         var1 = var1.normalize();
         return this.validatePoint(var1.getXCoord().toBigInteger(), var1.getYCoord().toBigInteger(), var1.withCompression);
      }
   }

   public ECPoint createPoint(BigInteger var1, BigInteger var2) {
      return this.createPoint(var1, var2, false);
   }

   public void normalizeAll(ECPoint[] var1, int var2, int var3, ECFieldElement var4) {
      this.checkPoints(var1, var2, var3);
      switch(this.getCoordinateSystem()) {
      case 0:
      case 5:
         if (var4 != null) {
            throw new IllegalArgumentException("'iso' not valid for affine coordinates");
         }

         return;
      default:
         ECFieldElement[] var5 = new ECFieldElement[var3];
         int[] var6 = new int[var3];
         int var7 = 0;
         int var8 = 0;

         for(; var8 < var3; ++var8) {
            ECPoint var9 = var1[var2 + var8];
            if (null != var9 && (var4 != null || !var9.isNormalized())) {
               var5[var7] = var9.getZCoord(0);
               var6[var7++] = var2 + var8;
            }
         }

         if (var7 != 0) {
            ECAlgorithms.montgomeryTrick(var5, 0, var7, var4);

            for(var8 = 0; var8 < var7; ++var8) {
               int var10 = var6[var8];
               var1[var10] = var1[var10].normalize(var5[var8]);
            }

         }
      }
   }

   public abstract ECPoint getInfinity();

   public void checkPoint(ECPoint var1) {
      if (null == var1 || this != var1.getCurve()) {
         throw new IllegalArgumentException("'point' must be non-null and on this curve");
      }
   }

   public abstract boolean isValidFieldElement(BigInteger var1);

   public ECFieldElement getB() {
      return this.b;
   }

   public BigInteger getOrder() {
      return this.order;
   }

   public BigInteger getCofactor() {
      return this.cofactor;
   }

   public int getCoordinateSystem() {
      return this.coord;
   }

   public abstract ECPoint decompressPoint(int var1, BigInteger var2);

   public abstract ECPoint createRawPoint(ECFieldElement var1, ECFieldElement var2, ECFieldElement[] var3, boolean var4);

   public synchronized ECMultiplier getMultiplier() {
      if (this.multiplier == null) {
         this.multiplier = this.createDefaultMultiplier();
      }

      return this.multiplier;
   }

   public ECPoint decodePoint(byte[] var1) {
      ECPoint var2 = null;
      int var3 = (this.getFieldSize() + 7) / 8;
      byte var4 = var1[0];
      BigInteger var5;
      BigInteger var6;
      switch(var4) {
      case 0:
         if (var1.length != 1) {
            throw new IllegalArgumentException("Incorrect length for infinity encoding");
         }

         var2 = this.getInfinity();
         break;
      case 1:
      case 5:
      default:
         throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(var4, 16));
      case 2:
      case 3:
         if (var1.length != var3 + 1) {
            throw new IllegalArgumentException("Incorrect length for compressed encoding");
         }

         int var7 = var4 & 1;
         var6 = BigIntegers.fromUnsignedByteArray(var1, 1, var3);
         var2 = this.decompressPoint(var7, var6);
         if (!var2.satisfiesCofactor()) {
            throw new IllegalArgumentException("Invalid point");
         }
         break;
      case 4:
         if (var1.length != 2 * var3 + 1) {
            throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
         }

         var5 = BigIntegers.fromUnsignedByteArray(var1, 1, var3);
         var6 = BigIntegers.fromUnsignedByteArray(var1, 1 + var3, var3);
         var2 = this.validatePoint(var5, var6);
         break;
      case 6:
      case 7:
         if (var1.length != 2 * var3 + 1) {
            throw new IllegalArgumentException("Incorrect length for hybrid encoding");
         }

         var5 = BigIntegers.fromUnsignedByteArray(var1, 1, var3);
         var6 = BigIntegers.fromUnsignedByteArray(var1, 1 + var3, var3);
         if (var6.testBit(0) != (var4 == 7)) {
            throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
         }

         var2 = this.validatePoint(var5, var6);
      }

      if (var4 != 0 && var2.isInfinity()) {
         throw new IllegalArgumentException("Invalid infinity encoding");
      } else {
         return var2;
      }
   }

   public void setPreCompInfo(ECPoint var1, String var2, PreCompInfo var3) {
      this.checkPoint(var1);
      synchronized(var1) {
         Hashtable var5 = var1.preCompTable;
         if (null == var5) {
            var1.preCompTable = var5 = new Hashtable(4);
         }

         var5.put(var2, var3);
      }
   }

   public void checkPoints(ECPoint[] var1) {
      this.checkPoints(var1, 0, var1.length);
   }

   public void checkPoints(ECPoint[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new IllegalArgumentException("'points' cannot be null");
      } else if (var2 >= 0 && var3 >= 0 && var2 <= var1.length - var3) {
         for(int var4 = 0; var4 < var3; ++var4) {
            ECPoint var5 = var1[var2 + var4];
            if (null != var5 && this != var5.getCurve()) {
               throw new IllegalArgumentException("'points' entries must be null or on this curve");
            }
         }

      } else {
         throw new IllegalArgumentException("invalid range specified for 'points'");
      }
   }

   public boolean equals(ECCurve var1) {
      return this == var1 || null != var1 && this.getField().equals(var1.getField()) && this.getA().toBigInteger().equals(var1.getA().toBigInteger()) && this.getB().toBigInteger().equals(var1.getB().toBigInteger());
   }

   public boolean equals(Object var1) {
      return this == var1 || var1 instanceof ECCurve && this.equals((ECCurve)var1);
   }

   public int hashCode() {
      return this.getField().hashCode() ^ Integers.rotateLeft(this.getA().toBigInteger().hashCode(), 8) ^ Integers.rotateLeft(this.getB().toBigInteger().hashCode(), 16);
   }

   public boolean gn(Object var1) {
      return this == var1 || var1 instanceof ECCurve && this.equals((ECCurve)var1);
   }

   public ECEndomorphism getEndomorphism() {
      return this.endomorphism;
   }

   public abstract ECFieldElement fromBigInteger(BigInteger var1);

   public int amd() {
      return this.getField().hashCode() ^ Integers.rotateLeft(this.getA().toBigInteger().hashCode(), 8) ^ Integers.rotateLeft(this.getB().toBigInteger().hashCode(), 16);
   }
}
