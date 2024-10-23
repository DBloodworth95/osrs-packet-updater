package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;

class RSACoreEngine {
   RSAKeyParameters key;
   boolean forEncryption;

   public int getOutputBlockSize() {
      int var1 = this.key.getModulus().bitLength();
      return this.forEncryption ? (var1 + 7) / 8 : (var1 + 7) / 8 - 1;
   }

   public void init(boolean var1, CipherParameters var2) {
      if (var2 instanceof ParametersWithRandom) {
         ParametersWithRandom var3 = (ParametersWithRandom)var2;
         this.key = (RSAKeyParameters)var3.getParameters();
      } else {
         this.key = (RSAKeyParameters)var2;
      }

      this.forEncryption = var1;
   }

   public int getInputBlockSize() {
      int var1 = this.key.getModulus().bitLength();
      return this.forEncryption ? (var1 + 7) / 8 - 1 : (var1 + 7) / 8;
   }

   public BigInteger convertInput(byte[] var1, int var2, int var3) {
      if (var3 > this.getInputBlockSize() + 1) {
         throw new DataLengthException("input too large for RSA cipher.");
      } else if (var3 == this.getInputBlockSize() + 1 && !this.forEncryption) {
         throw new DataLengthException("input too large for RSA cipher.");
      } else {
         byte[] var4;
         if (var2 == 0 && var3 == var1.length) {
            var4 = var1;
         } else {
            var4 = new byte[var3];
            System.arraycopy(var1, var2, var4, 0, var3);
         }

         BigInteger var5 = new BigInteger(1, var4);
         if (var5.compareTo(this.key.getModulus()) >= 0) {
            throw new DataLengthException("input too large for RSA cipher.");
         } else {
            return var5;
         }
      }
   }

   public byte[] convertOutput(BigInteger var1) {
      byte[] var2 = var1.toByteArray();
      byte[] var3;
      if (this.forEncryption) {
         if (var2[0] == 0 && var2.length > this.getOutputBlockSize()) {
            var3 = new byte[var2.length - 1];
            System.arraycopy(var2, 1, var3, 0, var3.length);
            return var3;
         }

         if (var2.length < this.getOutputBlockSize()) {
            var3 = new byte[this.getOutputBlockSize()];
            System.arraycopy(var2, 0, var3, var3.length - var2.length, var2.length);
            return var3;
         }
      } else if (var2[0] == 0) {
         var3 = new byte[var2.length - 1];
         System.arraycopy(var2, 1, var3, 0, var3.length);
         return var3;
      }

      return var2;
   }

   public BigInteger processBlock(BigInteger var1) {
      if (this.key instanceof RSAPrivateCrtKeyParameters) {
         RSAPrivateCrtKeyParameters var2 = (RSAPrivateCrtKeyParameters)this.key;
         BigInteger var3 = var2.getP();
         BigInteger var4 = var2.getQ();
         BigInteger var5 = var2.getDP();
         BigInteger var6 = var2.getDQ();
         BigInteger var7 = var2.getQInv();
         BigInteger var8 = var1.remainder(var3).modPow(var5, var3);
         BigInteger var9 = var1.remainder(var4).modPow(var6, var4);
         BigInteger var10 = var8.subtract(var9);
         var10 = var10.multiply(var7);
         var10 = var10.mod(var3);
         BigInteger var11 = var10.multiply(var4);
         var11 = var11.add(var9);
         return var11;
      } else {
         return var1.modPow(this.key.getExponent(), this.key.getModulus());
      }
   }
}
