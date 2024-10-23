package org.bouncycastle.math.ec;

public class ECPoint$F2m extends ECPoint$AbstractF2m {
   public ECPoint detach() {
      return new ECPoint$F2m((ECCurve)null, this.getAffineXCoord(), this.getAffineYCoord());
   }

   public ECFieldElement getYCoord() {
      int var1 = this.getCurveCoordinateSystem();
      switch(var1) {
      case 5:
      case 6:
         ECFieldElement var2 = this.x;
         ECFieldElement var3 = this.y;
         if (!this.isInfinity() && !var2.isZero()) {
            ECFieldElement var4 = var3.add(var2).multiply(var2);
            if (6 == var1) {
               ECFieldElement var5 = this.zs[0];
               if (!var5.isOne()) {
                  var4 = var4.divide(var5);
               }
            }

            return var4;
         }

         return var3;
      default:
         return this.y;
      }
   }

   ECPoint$F2m(ECCurve var1, ECFieldElement var2, ECFieldElement var3, ECFieldElement[] var4, boolean var5) {
      super(var1, var2, var3, var4);
      this.withCompression = var5;
   }

   public ECPoint add(ECPoint var1) {
      if (this.isInfinity()) {
         return var1;
      } else if (var1.isInfinity()) {
         return this;
      } else {
         ECCurve var2 = this.getCurve();
         int var3 = var2.getCoordinateSystem();
         ECFieldElement var4 = this.x;
         ECFieldElement var5 = var1.x;
         ECFieldElement var6;
         ECFieldElement var7;
         ECFieldElement var8;
         ECFieldElement var9;
         boolean var10;
         ECFieldElement var11;
         ECFieldElement var12;
         ECFieldElement var14;
         ECFieldElement var15;
         ECFieldElement var16;
         ECFieldElement var17;
         ECFieldElement var18;
         ECFieldElement var19;
         ECFieldElement var20;
         ECFieldElement var22;
         ECFieldElement var23;
         ECFieldElement var24;
         ECFieldElement var25;
         ECFieldElement var28;
         switch(var3) {
         case 0:
            var6 = this.y;
            var7 = var1.y;
            var8 = var4.add(var5);
            var9 = var6.add(var7);
            if (var8.isZero()) {
               if (var9.isZero()) {
                  return this.twice();
               }

               return var2.getInfinity();
            }

            ECFieldElement var26 = var9.divide(var8);
            var11 = var26.square().add(var26).add(var8).add(var2.getA());
            var12 = var26.multiply(var4.add(var11)).add(var11).add(var6);
            return new ECPoint$F2m(var2, var11, var12, this.withCompression);
         case 1:
            var6 = this.y;
            var7 = this.zs[0];
            var8 = var1.y;
            var9 = var1.zs[0];
            var10 = var9.isOne();
            var11 = var7.multiply(var8);
            var12 = var10 ? var6 : var6.multiply(var9);
            ECFieldElement var27 = var11.add(var12);
            var14 = var7.multiply(var5);
            var15 = var10 ? var4 : var4.multiply(var9);
            var16 = var14.add(var15);
            if (var16.isZero()) {
               if (var27.isZero()) {
                  return this.twice();
               }

               return var2.getInfinity();
            }

            var17 = var16.square();
            var18 = var17.multiply(var16);
            var19 = var10 ? var7 : var7.multiply(var9);
            var20 = var27.add(var16);
            var28 = var20.multiplyPlusProduct(var27, var17, var2.getA()).multiply(var19).add(var18);
            var22 = var16.multiply(var28);
            var23 = var10 ? var17 : var17.multiply(var9);
            var24 = var27.multiplyPlusProduct(var4, var16, var6).multiplyPlusProduct(var23, var20, var28);
            var25 = var18.multiply(var19);
            return new ECPoint$F2m(var2, var22, var24, new ECFieldElement[]{var25}, this.withCompression);
         case 6:
            if (var4.isZero()) {
               if (var5.isZero()) {
                  return var2.getInfinity();
               }

               return var1.add(this);
            } else {
               var6 = this.y;
               var7 = this.zs[0];
               var8 = var1.y;
               var9 = var1.zs[0];
               var10 = var7.isOne();
               var11 = var5;
               var12 = var8;
               if (!var10) {
                  var11 = var5.multiply(var7);
                  var12 = var8.multiply(var7);
               }

               boolean var13 = var9.isOne();
               var14 = var4;
               var15 = var6;
               if (!var13) {
                  var14 = var4.multiply(var9);
                  var15 = var6.multiply(var9);
               }

               var16 = var15.add(var12);
               var17 = var14.add(var11);
               if (var17.isZero()) {
                  if (var16.isZero()) {
                     return this.twice();
                  }

                  return var2.getInfinity();
               } else {
                  if (var5.isZero()) {
                     ECPoint var21 = this.normalize();
                     var4 = var21.getXCoord();
                     var22 = var21.getYCoord();
                     var24 = var22.add(var8).divide(var4);
                     var18 = var24.square().add(var24).add(var4).add(var2.getA());
                     if (var18.isZero()) {
                        return new ECPoint$F2m(var2, var18, var2.getB().sqrt(), this.withCompression);
                     }

                     var25 = var24.multiply(var4.add(var18)).add(var18).add(var22);
                     var19 = var25.divide(var18).add(var18);
                     var20 = var2.fromBigInteger(ECConstants.ONE);
                  } else {
                     var17 = var17.square();
                     var28 = var16.multiply(var14);
                     var22 = var16.multiply(var11);
                     var18 = var28.multiply(var22);
                     if (var18.isZero()) {
                        return new ECPoint$F2m(var2, var18, var2.getB().sqrt(), this.withCompression);
                     }

                     var23 = var16.multiply(var17);
                     if (!var13) {
                        var23 = var23.multiply(var9);
                     }

                     var19 = var22.add(var17).squarePlusProduct(var23, var6.add(var7));
                     var20 = var23;
                     if (!var10) {
                        var20 = var23.multiply(var7);
                     }
                  }

                  return new ECPoint$F2m(var2, var18, var19, new ECFieldElement[]{var20}, this.withCompression);
               }
            }
         default:
            throw new IllegalStateException("unsupported coordinate system");
         }
      }
   }

   /** @deprecated */
   public ECPoint$F2m(ECCurve var1, ECFieldElement var2, ECFieldElement var3, boolean var4) {
      super(var1, var2, var3);
      if (var2 == null != (var3 == null)) {
         throw new IllegalArgumentException("Exactly one of the field elements is null");
      } else {
         if (var2 != null) {
            ECFieldElement$F2m.checkFieldElements(this.x, this.y);
            if (var1 != null) {
               ECFieldElement$F2m.checkFieldElements(this.x, this.curve.getA());
            }
         }

         this.withCompression = var4;
      }
   }

   public boolean getCompressionYTilde() {
      ECFieldElement var1 = this.getRawXCoord();
      if (var1.isZero()) {
         return false;
      } else {
         ECFieldElement var2 = this.getRawYCoord();
         switch(this.getCurveCoordinateSystem()) {
         case 5:
         case 6:
            return var2.testBitZero() != var1.testBitZero();
         default:
            return var2.divide(var1).testBitZero();
         }
      }
   }

   /** @deprecated */
   public ECPoint$F2m(ECCurve var1, ECFieldElement var2, ECFieldElement var3) {
      this(var1, var2, var3, false);
   }

   public ECPoint twice() {
      if (this.isInfinity()) {
         return this;
      } else {
         ECCurve var1 = this.getCurve();
         ECFieldElement var2 = this.x;
         if (var2.isZero()) {
            return var1.getInfinity();
         } else {
            int var3 = var1.getCoordinateSystem();
            ECFieldElement var4;
            ECFieldElement var5;
            boolean var6;
            ECFieldElement var7;
            ECFieldElement var8;
            ECFieldElement var9;
            ECFieldElement var10;
            ECFieldElement var12;
            ECFieldElement var13;
            ECFieldElement var14;
            ECFieldElement var15;
            ECFieldElement var16;
            ECFieldElement var17;
            switch(var3) {
            case 0:
               var4 = this.y;
               var5 = var4.divide(var2).add(var2);
               ECFieldElement var18 = var5.square().add(var5).add(var1.getA());
               var7 = var2.squarePlusProduct(var18, var5.addOne());
               return new ECPoint$F2m(var1, var18, var7, this.withCompression);
            case 1:
               var4 = this.y;
               var5 = this.zs[0];
               var6 = var5.isOne();
               var7 = var6 ? var2 : var2.multiply(var5);
               var8 = var6 ? var4 : var4.multiply(var5);
               var9 = var2.square();
               var10 = var9.add(var8);
               var12 = var7.square();
               var13 = var10.add(var7);
               var14 = var13.multiplyPlusProduct(var10, var12, var1.getA());
               var15 = var7.multiply(var14);
               var16 = var9.square().multiplyPlusProduct(var7, var14, var13);
               var17 = var7.multiply(var12);
               return new ECPoint$F2m(var1, var15, var16, new ECFieldElement[]{var17}, this.withCompression);
            case 6:
               var4 = this.y;
               var5 = this.zs[0];
               var6 = var5.isOne();
               var7 = var6 ? var4 : var4.multiply(var5);
               var8 = var6 ? var5 : var5.square();
               var9 = var1.getA();
               var10 = var6 ? var9 : var9.multiply(var8);
               ECFieldElement var11 = var4.square().add(var7).add(var10);
               if (var11.isZero()) {
                  return new ECPoint$F2m(var1, var11, var1.getB().sqrt(), this.withCompression);
               }

               var12 = var11.square();
               var13 = var6 ? var11 : var11.multiply(var8);
               var14 = var1.getB();
               if (var14.bitLength() < var1.getFieldSize() >> 1) {
                  var16 = var4.add(var2).square();
                  if (var14.isOne()) {
                     var17 = var10.add(var8).square();
                  } else {
                     var17 = var10.squarePlusProduct(var14, var8.square());
                  }

                  var15 = var16.add(var11).add(var8).multiply(var16).add(var17).add(var12);
                  if (var9.isZero()) {
                     var15 = var15.add(var13);
                  } else if (!var9.isOne()) {
                     var15 = var15.add(var9.addOne().multiply(var13));
                  }
               } else {
                  var16 = var6 ? var2 : var2.multiply(var5);
                  var15 = var16.squarePlusProduct(var11, var7).add(var12).add(var13);
               }

               return new ECPoint$F2m(var1, var12, var15, new ECFieldElement[]{var13}, this.withCompression);
            default:
               throw new IllegalStateException("unsupported coordinate system");
            }
         }
      }
   }

   public ECPoint twicePlus(ECPoint var1) {
      if (this.isInfinity()) {
         return var1;
      } else if (var1.isInfinity()) {
         return this.twice();
      } else {
         ECCurve var2 = this.getCurve();
         ECFieldElement var3 = this.x;
         if (var3.isZero()) {
            return var1;
         } else {
            int var4 = var2.getCoordinateSystem();
            switch(var4) {
            case 6:
               ECFieldElement var5 = var1.x;
               ECFieldElement var6 = var1.zs[0];
               if (!var5.isZero() && var6.isOne()) {
                  ECFieldElement var7 = this.y;
                  ECFieldElement var8 = this.zs[0];
                  ECFieldElement var9 = var1.y;
                  ECFieldElement var10 = var3.square();
                  ECFieldElement var11 = var7.square();
                  ECFieldElement var12 = var8.square();
                  ECFieldElement var13 = var7.multiply(var8);
                  ECFieldElement var14 = var2.getA().multiply(var12).add(var11).add(var13);
                  ECFieldElement var15 = var9.addOne();
                  ECFieldElement var16 = var2.getA().add(var15).multiply(var12).add(var11).multiplyPlusProduct(var14, var10, var12);
                  ECFieldElement var17 = var5.multiply(var12);
                  ECFieldElement var18 = var17.add(var14).square();
                  if (var18.isZero()) {
                     if (var16.isZero()) {
                        return var1.twice();
                     }

                     return var2.getInfinity();
                  }

                  if (var16.isZero()) {
                     return new ECPoint$F2m(var2, var16, var2.getB().sqrt(), this.withCompression);
                  }

                  ECFieldElement var19 = var16.square().multiply(var17);
                  ECFieldElement var20 = var16.multiply(var18).multiply(var12);
                  ECFieldElement var21 = var16.add(var18).square().multiplyPlusProduct(var14, var15, var20);
                  return new ECPoint$F2m(var2, var19, var21, new ECFieldElement[]{var20}, this.withCompression);
               }

               return this.twice().add(var1);
            default:
               return this.twice().add(var1);
            }
         }
      }
   }

   public ECPoint negate() {
      if (this.isInfinity()) {
         return this;
      } else {
         ECFieldElement var1 = this.x;
         if (var1.isZero()) {
            return this;
         } else {
            ECFieldElement var2;
            ECFieldElement var3;
            switch(this.getCurveCoordinateSystem()) {
            case 0:
               var2 = this.y;
               return new ECPoint$F2m(this.curve, var1, var2.add(var1), this.withCompression);
            case 1:
               var2 = this.y;
               var3 = this.zs[0];
               return new ECPoint$F2m(this.curve, var1, var2.add(var1), new ECFieldElement[]{var3}, this.withCompression);
            case 2:
            case 3:
            case 4:
            default:
               throw new IllegalStateException("unsupported coordinate system");
            case 5:
               var2 = this.y;
               return new ECPoint$F2m(this.curve, var1, var2.addOne(), this.withCompression);
            case 6:
               var2 = this.y;
               var3 = this.zs[0];
               return new ECPoint$F2m(this.curve, var1, var2.add(var3), new ECFieldElement[]{var3}, this.withCompression);
            }
         }
      }
   }
}
