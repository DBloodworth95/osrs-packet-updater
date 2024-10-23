package org.bouncycastle.crypto.modes.gcm;

import java.util.Vector;
import org.bouncycastle.util.Arrays;

public class Tables1kGCMExponentiator implements GCMExponentiator {
   Vector lookupPowX2;

   void ensureAvailable(int var1) {
      int var2 = this.lookupPowX2.size();
      if (var2 <= var1) {
         int[] var3 = (int[])((int[])this.lookupPowX2.elementAt(var2 - 1));

         do {
            var3 = Arrays.clone(var3);
            GCMUtil.multiply(var3, var3);
            this.lookupPowX2.addElement(var3);
            ++var2;
         } while(var2 <= var1);
      }

   }

   public void init(byte[] var1) {
      int[] var2 = GCMUtil.asInts(var1);
      if (this.lookupPowX2 == null || !Arrays.areEqual(var2, (int[])((int[])this.lookupPowX2.elementAt(0)))) {
         this.lookupPowX2 = new Vector(8);
         this.lookupPowX2.addElement(var2);
      }
   }

   public void exponentiateX(long var1, byte[] var3) {
      int[] var4 = GCMUtil.oneAsInts();

      for(int var5 = 0; var1 > 0L; var1 >>>= 1) {
         if ((var1 & 1L) != 0L) {
            this.ensureAvailable(var5);
            GCMUtil.multiply(var4, (int[])((int[])this.lookupPowX2.elementAt(var5)));
         }

         ++var5;
      }

      GCMUtil.asBytes(var4, var3);
   }
}
