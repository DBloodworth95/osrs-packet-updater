package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;

public class X9IntegerConverter {
   public int getByteLength(ECFieldElement var1) {
      return (var1.getFieldSize() + 7) / 8;
   }

   public int getByteLength(ECCurve var1) {
      return (var1.getFieldSize() + 7) / 8;
   }

   public byte[] integerToBytes(BigInteger var1, int var2) {
      byte[] var3 = var1.toByteArray();
      byte[] var4;
      if (var2 < var3.length) {
         var4 = new byte[var2];
         System.arraycopy(var3, var3.length - var4.length, var4, 0, var4.length);
         return var4;
      } else if (var2 > var3.length) {
         var4 = new byte[var2];
         System.arraycopy(var3, 0, var4, var4.length - var3.length, var3.length);
         return var4;
      } else {
         return var3;
      }
   }
}
