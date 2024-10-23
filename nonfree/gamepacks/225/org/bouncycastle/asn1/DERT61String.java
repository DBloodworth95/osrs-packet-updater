package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class DERT61String extends ASN1Primitive implements ASN1String {
   byte[] string;

   boolean asn1Equals(ASN1Primitive var1) {
      return !(var1 instanceof DERT61String) ? false : Arrays.areEqual(this.string, ((DERT61String)var1).string);
   }

   public static DERT61String getInstance(ASN1TaggedObject var0, boolean var1) {
      ASN1Primitive var2 = var0.getObject();
      return !var1 && !(var2 instanceof DERT61String) ? new DERT61String(ASN1OctetString.getInstance(var2).getOctets()) : getInstance(var2);
   }

   public DERT61String(byte[] var1) {
      this.string = Arrays.clone(var1);
   }

   void encode(ASN1OutputStream var1) throws IOException {
      var1.writeEncoded(20, this.string);
   }

   public String getString() {
      return Strings.fromByteArray(this.string);
   }

   public String aml() {
      return this.getString();
   }

   public static DERT61String getInstance(Object var0) {
      if (var0 != null && !(var0 instanceof DERT61String)) {
         if (var0 instanceof byte[]) {
            try {
               return (DERT61String)fromByteArray((byte[])((byte[])var0));
            } catch (Exception var2) {
               throw new IllegalArgumentException("encoding error in getInstance: " + var2.toString());
            }
         } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + var0.getClass().getName());
         }
      } else {
         return (DERT61String)var0;
      }
   }

   int encodedLength() {
      return 1 + StreamUtil.calculateBodyLength(this.string.length) + this.string.length;
   }

   boolean isConstructed() {
      return false;
   }

   public byte[] getOctets() {
      return Arrays.clone(this.string);
   }

   public String toString() {
      return this.getString();
   }

   public int hashCode() {
      return Arrays.hashCode(this.string);
   }

   public int amy() {
      return Arrays.hashCode(this.string);
   }

   public DERT61String(String var1) {
      this.string = Strings.toByteArray(var1);
   }

   public int amd() {
      return Arrays.hashCode(this.string);
   }

   public String amp() {
      return this.getString();
   }

   public String ame() {
      return this.getString();
   }
}
