package org.bouncycastle.math.ec;

import java.math.BigInteger;

public class ECPoint$Fp extends ECPoint$AbstractFp {
   public ECPoint twicePlus(ECPoint var1) {
      if (this == var1) {
         return this.threeTimes();
      } else if (this.isInfinity()) {
         return var1;
      } else if (var1.isInfinity()) {
         return this.twice();
      } else {
         ECFieldElement var2 = this.y;
         if (var2.isZero()) {
            return var1;
         } else {
            ECCurve var3 = this.getCurve();
            int var4 = var3.getCoordinateSystem();
            switch(var4) {
            case 0:
               ECFieldElement var5 = this.x;
               ECFieldElement var6 = var1.x;
               ECFieldElement var7 = var1.y;
               ECFieldElement var8 = var6.subtract(var5);
               ECFieldElement var9 = var7.subtract(var2);
               if (var8.isZero()) {
                  if (var9.isZero()) {
                     return this.threeTimes();
                  }

                  return this;
               } else {
                  ECFieldElement var10 = var8.square();
                  ECFieldElement var11 = var9.square();
                  ECFieldElement var12 = var10.multiply(this.two(var5).add(var6)).subtract(var11);
                  if (var12.isZero()) {
                     return var3.getInfinity();
                  }

                  ECFieldElement var13 = var12.multiply(var8);
                  ECFieldElement var14 = var13.invert();
                  ECFieldElement var15 = var12.multiply(var14).multiply(var9);
                  ECFieldElement var16 = this.two(var2).multiply(var10).multiply(var8).multiply(var14).subtract(var15);
                  ECFieldElement var17 = var16.subtract(var15).multiply(var15.add(var16)).add(var6);
                  ECFieldElement var18 = var5.subtract(var17).multiply(var16).subtract(var2);
                  return new ECPoint$Fp(var3, var17, var18, this.withCompression);
               }
            case 4:
               return this.twiceJacobianModified(false).add(var1);
            default:
               return this.twice().add(var1);
            }
         }
      }
   }

   /** @deprecated */
   public ECPoint$Fp(ECCurve var1, ECFieldElement var2, ECFieldElement var3, boolean var4) {
      super(var1, var2, var3);
      if (var2 == null != (var3 == null)) {
         throw new IllegalArgumentException("Exactly one of the field elements is null");
      } else {
         this.withCompression = var4;
      }
   }

   ECPoint$Fp(ECCurve var1, ECFieldElement var2, ECFieldElement var3, ECFieldElement[] var4, boolean var5) {
      super(var1, var2, var3, var4);
      this.withCompression = var5;
   }

   public ECPoint threeTimes() {
      if (this.isInfinity()) {
         return this;
      } else {
         ECFieldElement var1 = this.y;
         if (var1.isZero()) {
            return this;
         } else {
            ECCurve var2 = this.getCurve();
            int var3 = var2.getCoordinateSystem();
            switch(var3) {
            case 0:
               ECFieldElement var4 = this.x;
               ECFieldElement var5 = this.two(var1);
               ECFieldElement var6 = var5.square();
               ECFieldElement var7 = this.three(var4.square()).add(this.getCurve().getA());
               ECFieldElement var8 = var7.square();
               ECFieldElement var9 = this.three(var4).multiply(var6).subtract(var8);
               if (var9.isZero()) {
                  return this.getCurve().getInfinity();
               }

               ECFieldElement var10 = var9.multiply(var5);
               ECFieldElement var11 = var10.invert();
               ECFieldElement var12 = var9.multiply(var11).multiply(var7);
               ECFieldElement var13 = var6.square().multiply(var11).subtract(var12);
               ECFieldElement var14 = var13.subtract(var12).multiply(var12.add(var13)).add(var4);
               ECFieldElement var15 = var4.subtract(var14).multiply(var13).subtract(var1);
               return new ECPoint$Fp(var2, var14, var15, this.withCompression);
            case 4:
               return this.twiceJacobianModified(false).add(this);
            default:
               return this.twice().add(this);
            }
         }
      }
   }

   public ECPoint$Fp twiceJacobianModified(boolean var1) {
      ECFieldElement var2 = this.x;
      ECFieldElement var3 = this.y;
      ECFieldElement var4 = this.zs[0];
      ECFieldElement var5 = this.getJacobianModifiedW();
      ECFieldElement var6 = var2.square();
      ECFieldElement var7 = this.three(var6).add(var5);
      ECFieldElement var8 = this.two(var3);
      ECFieldElement var9 = var8.multiply(var3);
      ECFieldElement var10 = this.two(var2.multiply(var9));
      ECFieldElement var11 = var7.square().subtract(this.two(var10));
      ECFieldElement var12 = var9.square();
      ECFieldElement var13 = this.two(var12);
      ECFieldElement var14 = var7.multiply(var10.subtract(var11)).subtract(var13);
      ECFieldElement var15 = var1 ? this.two(var13.multiply(var5)) : null;
      ECFieldElement var16 = var4.isOne() ? var8 : var8.multiply(var4);
      return new ECPoint$Fp(this.getCurve(), var11, var14, new ECFieldElement[]{var16, var15}, this.withCompression);
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
         int var3 = var2.getCoordinateSystem();
         ECFieldElement var4 = this.x;
         ECFieldElement var5 = this.y;
         ECFieldElement var6 = var1.x;
         ECFieldElement var7 = var1.y;
         ECFieldElement var8;
         ECFieldElement var9;
         boolean var10;
         ECFieldElement var11;
         ECFieldElement var12;
         ECFieldElement var13;
         ECFieldElement var14;
         ECFieldElement var15;
         ECFieldElement var16;
         ECFieldElement var17;
         ECFieldElement var18;
         ECFieldElement var19;
         ECFieldElement var20;
         ECFieldElement var21;
         ECFieldElement var22;
         ECFieldElement var23;
         ECFieldElement var24;
         ECFieldElement var25;
         switch(var3) {
         case 0:
            var8 = var6.subtract(var4);
            var9 = var7.subtract(var5);
            if (var8.isZero()) {
               if (var9.isZero()) {
                  return this.twice();
               }

               return var2.getInfinity();
            }

            ECFieldElement var27 = var9.divide(var8);
            var11 = var27.square().subtract(var4).subtract(var6);
            var12 = var27.multiply(var4.subtract(var11)).subtract(var5);
            return new ECPoint$Fp(var2, var11, var12, this.withCompression);
         case 1:
            var8 = this.zs[0];
            var9 = var1.zs[0];
            var10 = var8.isOne();
            boolean var28 = var9.isOne();
            var12 = var10 ? var7 : var7.multiply(var8);
            var13 = var28 ? var5 : var5.multiply(var9);
            var14 = var12.subtract(var13);
            var15 = var10 ? var6 : var6.multiply(var8);
            var16 = var28 ? var4 : var4.multiply(var9);
            var17 = var15.subtract(var16);
            if (var17.isZero()) {
               if (var14.isZero()) {
                  return this.twice();
               }

               return var2.getInfinity();
            }

            var18 = var10 ? var9 : (var28 ? var8 : var8.multiply(var9));
            var19 = var17.square();
            var20 = var19.multiply(var17);
            var21 = var19.multiply(var16);
            var22 = var14.square().multiply(var18).subtract(var20).subtract(this.two(var21));
            var23 = var17.multiply(var22);
            var24 = var21.subtract(var22).multiplyMinusProduct(var14, var13, var20);
            var25 = var20.multiply(var18);
            return new ECPoint$Fp(var2, var23, var24, new ECFieldElement[]{var25}, this.withCompression);
         case 2:
         case 4:
            var8 = this.zs[0];
            var9 = var1.zs[0];
            var10 = var8.isOne();
            var14 = null;
            if (!var10 && var8.equals(var9)) {
               var15 = var4.subtract(var6);
               var16 = var5.subtract(var7);
               if (var15.isZero()) {
                  if (var16.isZero()) {
                     return this.twice();
                  }

                  return var2.getInfinity();
               }

               var17 = var15.square();
               var18 = var4.multiply(var17);
               var19 = var6.multiply(var17);
               var20 = var18.subtract(var19).multiply(var5);
               var11 = var16.square().subtract(var18).subtract(var19);
               var12 = var18.subtract(var11).multiply(var16).subtract(var20);
               var13 = var15.multiply(var8);
            } else {
               if (var10) {
                  var16 = var6;
                  var17 = var7;
               } else {
                  var15 = var8.square();
                  var16 = var15.multiply(var6);
                  var18 = var15.multiply(var8);
                  var17 = var18.multiply(var7);
               }

               boolean var30 = var9.isOne();
               if (var30) {
                  var20 = var4;
                  var21 = var5;
               } else {
                  var19 = var9.square();
                  var20 = var19.multiply(var4);
                  var22 = var19.multiply(var9);
                  var21 = var22.multiply(var5);
               }

               var22 = var20.subtract(var16);
               var23 = var21.subtract(var17);
               if (var22.isZero()) {
                  if (var23.isZero()) {
                     return this.twice();
                  }

                  return var2.getInfinity();
               }

               var24 = var22.square();
               var25 = var24.multiply(var22);
               ECFieldElement var26 = var24.multiply(var20);
               var11 = var23.square().add(var25).subtract(this.two(var26));
               var12 = var26.subtract(var11).multiplyMinusProduct(var23, var25, var21);
               var13 = var22;
               if (!var10) {
                  var13 = var22.multiply(var8);
               }

               if (!var30) {
                  var13 = var13.multiply(var9);
               }

               if (var13 == var22) {
                  var14 = var24;
               }
            }

            ECFieldElement[] var29;
            if (var3 == 4) {
               var16 = this.calculateJacobianModifiedW(var13, var14);
               var29 = new ECFieldElement[]{var13, var16};
            } else {
               var29 = new ECFieldElement[]{var13};
            }

            return new ECPoint$Fp(var2, var11, var12, var29, this.withCompression);
         case 3:
         default:
            throw new IllegalStateException("unsupported coordinate system");
         }
      }
   }

   public ECPoint twice() {
      if (this.isInfinity()) {
         return this;
      } else {
         ECCurve var1 = this.getCurve();
         ECFieldElement var2 = this.y;
         if (var2.isZero()) {
            return var1.getInfinity();
         } else {
            int var3 = var1.getCoordinateSystem();
            ECFieldElement var4 = this.x;
            ECFieldElement var5;
            boolean var6;
            ECFieldElement var7;
            ECFieldElement var8;
            ECFieldElement var9;
            ECFieldElement var10;
            ECFieldElement var11;
            ECFieldElement var12;
            ECFieldElement var13;
            ECFieldElement var14;
            ECFieldElement var15;
            switch(var3) {
            case 0:
               var5 = var4.square();
               ECFieldElement var19 = this.three(var5).add(this.getCurve().getA()).divide(this.two(var2));
               var7 = var19.square().subtract(this.two(var4));
               var8 = var19.multiply(var4.subtract(var7)).subtract(var2);
               return new ECPoint$Fp(var1, var7, var8, this.withCompression);
            case 1:
               var5 = this.zs[0];
               var6 = var5.isOne();
               var7 = var1.getA();
               if (!var7.isZero() && !var6) {
                  var7 = var7.multiply(var5.square());
               }

               var7 = var7.add(this.three(var4.square()));
               var8 = var6 ? var2 : var2.multiply(var5);
               var9 = var6 ? var2.square() : var8.multiply(var2);
               var10 = var4.multiply(var9);
               var11 = this.four(var10);
               var12 = var7.square().subtract(this.two(var11));
               var13 = this.two(var8);
               var14 = var12.multiply(var13);
               var15 = this.two(var9);
               ECFieldElement var16 = var11.subtract(var12).multiply(var7).subtract(this.two(var15.square()));
               ECFieldElement var17 = var6 ? this.two(var15) : var13.square();
               ECFieldElement var18 = this.two(var17).multiply(var8);
               return new ECPoint$Fp(var1, var14, var16, new ECFieldElement[]{var18}, this.withCompression);
            case 2:
               var5 = this.zs[0];
               var6 = var5.isOne();
               var7 = var2.square();
               var8 = var7.square();
               var9 = var1.getA();
               var10 = var9.negate();
               if (var10.toBigInteger().equals(BigInteger.valueOf(3L))) {
                  var13 = var6 ? var5 : var5.square();
                  var11 = this.three(var4.add(var13).multiply(var4.subtract(var13)));
                  var12 = this.four(var7.multiply(var4));
               } else {
                  var13 = var4.square();
                  var11 = this.three(var13);
                  if (var6) {
                     var11 = var11.add(var9);
                  } else if (!var9.isZero()) {
                     var14 = var5.square();
                     var15 = var14.square();
                     if (var10.bitLength() < var9.bitLength()) {
                        var11 = var11.subtract(var15.multiply(var10));
                     } else {
                        var11 = var11.add(var15.multiply(var9));
                     }
                  }

                  var12 = this.four(var4.multiply(var7));
               }

               var13 = var11.square().subtract(this.two(var12));
               var14 = var12.subtract(var13).multiply(var11).subtract(this.eight(var8));
               var15 = this.two(var2);
               if (!var6) {
                  var15 = var15.multiply(var5);
               }

               return new ECPoint$Fp(var1, var13, var14, new ECFieldElement[]{var15}, this.withCompression);
            case 3:
            default:
               throw new IllegalStateException("unsupported coordinate system");
            case 4:
               return this.twiceJacobianModified(true);
            }
         }
      }
   }

   /** @deprecated */
   public ECPoint$Fp(ECCurve var1, ECFieldElement var2, ECFieldElement var3) {
      this(var1, var2, var3, false);
   }

   public ECPoint timesPow2(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("'e' cannot be negative");
      } else if (var1 != 0 && !this.isInfinity()) {
         if (var1 == 1) {
            return this.twice();
         } else {
            ECCurve var2 = this.getCurve();
            ECFieldElement var3 = this.y;
            if (var3.isZero()) {
               return var2.getInfinity();
            } else {
               int var4 = var2.getCoordinateSystem();
               ECFieldElement var5 = var2.getA();
               ECFieldElement var6 = this.x;
               ECFieldElement var7 = this.zs.length < 1 ? var2.fromBigInteger(ECConstants.ONE) : this.zs[0];
               ECFieldElement var8;
               if (!var7.isOne()) {
                  switch(var4) {
                  case 0:
                     break;
                  case 1:
                     var8 = var7.square();
                     var6 = var6.multiply(var7);
                     var3 = var3.multiply(var8);
                     var5 = this.calculateJacobianModifiedW(var7, var8);
                     break;
                  case 2:
                     var5 = this.calculateJacobianModifiedW(var7, (ECFieldElement)null);
                     break;
                  case 3:
                  default:
                     throw new IllegalStateException("unsupported coordinate system");
                  case 4:
                     var5 = this.getJacobianModifiedW();
                  }
               }

               ECFieldElement var9;
               ECFieldElement var10;
               for(int var16 = 0; var16 < var1; ++var16) {
                  if (var3.isZero()) {
                     return var2.getInfinity();
                  }

                  var9 = var6.square();
                  var10 = this.three(var9);
                  ECFieldElement var11 = this.two(var3);
                  ECFieldElement var12 = var11.multiply(var3);
                  ECFieldElement var13 = this.two(var6.multiply(var12));
                  ECFieldElement var14 = var12.square();
                  ECFieldElement var15 = this.two(var14);
                  if (!var5.isZero()) {
                     var10 = var10.add(var5);
                     var5 = this.two(var15.multiply(var5));
                  }

                  var6 = var10.square().subtract(this.two(var13));
                  var3 = var10.multiply(var13.subtract(var6)).subtract(var15);
                  var7 = var7.isOne() ? var11 : var11.multiply(var7);
               }

               switch(var4) {
               case 0:
                  var8 = var7.invert();
                  var9 = var8.square();
                  var10 = var9.multiply(var8);
                  return new ECPoint$Fp(var2, var6.multiply(var9), var3.multiply(var10), this.withCompression);
               case 1:
                  var6 = var6.multiply(var7);
                  var7 = var7.multiply(var7.square());
                  return new ECPoint$Fp(var2, var6, var3, new ECFieldElement[]{var7}, this.withCompression);
               case 2:
                  return new ECPoint$Fp(var2, var6, var3, new ECFieldElement[]{var7}, this.withCompression);
               case 3:
               default:
                  throw new IllegalStateException("unsupported coordinate system");
               case 4:
                  return new ECPoint$Fp(var2, var6, var3, new ECFieldElement[]{var7, var5}, this.withCompression);
               }
            }
         }
      } else {
         return this;
      }
   }

   public ECPoint negate() {
      if (this.isInfinity()) {
         return this;
      } else {
         ECCurve var1 = this.getCurve();
         int var2 = var1.getCoordinateSystem();
         return 0 != var2 ? new ECPoint$Fp(var1, this.x, this.y.negate(), this.zs, this.withCompression) : new ECPoint$Fp(var1, this.x, this.y.negate(), this.withCompression);
      }
   }

   public ECFieldElement two(ECFieldElement var1) {
      return var1.add(var1);
   }

   public ECFieldElement three(ECFieldElement var1) {
      return this.two(var1).add(var1);
   }

   public ECFieldElement four(ECFieldElement var1) {
      return this.two(this.two(var1));
   }

   public ECFieldElement eight(ECFieldElement var1) {
      return this.four(this.two(var1));
   }

   public ECFieldElement doubleProductFromSquares(ECFieldElement var1, ECFieldElement var2, ECFieldElement var3, ECFieldElement var4) {
      return var1.add(var2).square().subtract(var3).subtract(var4);
   }

   public ECFieldElement getZCoord(int var1) {
      return var1 == 1 && 4 == this.getCurveCoordinateSystem() ? this.getJacobianModifiedW() : super.getZCoord(var1);
   }

   public ECFieldElement calculateJacobianModifiedW(ECFieldElement var1, ECFieldElement var2) {
      ECFieldElement var3 = this.getCurve().getA();
      if (!var3.isZero() && !var1.isOne()) {
         if (var2 == null) {
            var2 = var1.square();
         }

         ECFieldElement var4 = var2.square();
         ECFieldElement var5 = var3.negate();
         if (var5.bitLength() < var3.bitLength()) {
            var4 = var4.multiply(var5).negate();
         } else {
            var4 = var4.multiply(var3);
         }

         return var4;
      } else {
         return var3;
      }
   }

   public ECFieldElement getJacobianModifiedW() {
      ECFieldElement var1 = this.zs[1];
      if (var1 == null) {
         this.zs[1] = var1 = this.calculateJacobianModifiedW(this.zs[0], (ECFieldElement)null);
      }

      return var1;
   }

   public ECPoint detach() {
      return new ECPoint$Fp((ECCurve)null, this.getAffineXCoord(), this.getAffineYCoord());
   }
}
