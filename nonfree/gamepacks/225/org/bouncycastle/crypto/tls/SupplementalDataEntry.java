package org.bouncycastle.crypto.tls;

public class SupplementalDataEntry {
   public byte[] data;
   public int dataType;

   public int getDataType() {
      return this.dataType;
   }

   public SupplementalDataEntry(int var1, byte[] var2) {
      this.dataType = var1;
      this.data = var2;
   }

   public byte[] getData() {
      return this.data;
   }
}
