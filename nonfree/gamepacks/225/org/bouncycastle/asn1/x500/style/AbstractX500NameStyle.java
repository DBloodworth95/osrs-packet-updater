package org.bouncycastle.asn1.x500.style;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;

public abstract class AbstractX500NameStyle implements X500NameStyle {
   public ASN1Encodable stringToValue(ASN1ObjectIdentifier var1, String var2) {
      if (var2.length() != 0 && var2.charAt(0) == '#') {
         try {
            return IETFUtils.valueFromHexString(var2, 1);
         } catch (IOException var4) {
            throw new ASN1ParsingException("can't recode value for oid " + var1.getId());
         }
      } else {
         if (var2.length() != 0 && var2.charAt(0) == '\\') {
            var2 = var2.substring(1);
         }

         return this.encodeStringValue(var1, var2);
      }
   }

   boolean foundMatch(boolean var1, RDN var2, RDN[] var3) {
      int var4;
      if (var1) {
         for(var4 = var3.length - 1; var4 >= 0; --var4) {
            if (var3[var4] != null && this.rdnAreEqual(var2, var3[var4])) {
               var3[var4] = null;
               return true;
            }
         }
      } else {
         for(var4 = 0; var4 != var3.length; ++var4) {
            if (var3[var4] != null && this.rdnAreEqual(var2, var3[var4])) {
               var3[var4] = null;
               return true;
            }
         }
      }

      return false;
   }

   int calcHashCode(ASN1Encodable var1) {
      String var2 = IETFUtils.valueToString(var1);
      var2 = IETFUtils.canonicalize(var2);
      return var2.hashCode();
   }

   public int calculateHashCode(X500Name var1) {
      int var2 = 0;
      RDN[] var3 = var1.getRDNs();

      for(int var4 = 0; var4 != var3.length; ++var4) {
         if (var3[var4].isMultiValued()) {
            AttributeTypeAndValue[] var5 = var3[var4].getTypesAndValues();

            for(int var6 = 0; var6 != var5.length; ++var6) {
               var2 ^= var5[var6].getType().hashCode();
               var2 ^= this.calcHashCode(var5[var6].getValue());
            }
         } else {
            var2 ^= var3[var4].getFirst().getType().hashCode();
            var2 ^= this.calcHashCode(var3[var4].getFirst().getValue());
         }
      }

      return var2;
   }

   public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier var1, String var2) {
      return new DERUTF8String(var2);
   }

   public boolean areEqual(X500Name var1, X500Name var2) {
      RDN[] var3 = var1.getRDNs();
      RDN[] var4 = var2.getRDNs();
      if (var3.length != var4.length) {
         return false;
      } else {
         boolean var5 = false;
         if (var3[0].getFirst() != null && var4[0].getFirst() != null) {
            var5 = !var3[0].getFirst().getType().equals(var4[0].getFirst().getType());
         }

         for(int var6 = 0; var6 != var3.length; ++var6) {
            if (!this.foundMatch(var5, var3[var6], var4)) {
               return false;
            }
         }

         return true;
      }
   }

   public static Hashtable copyHashTable(Hashtable var0) {
      Hashtable var1 = new Hashtable();
      Enumeration var2 = var0.keys();

      while(var2.hasMoreElements()) {
         Object var3 = var2.nextElement();
         var1.put(var3, var0.get(var3));
      }

      return var1;
   }

   public boolean rdnAreEqual(RDN var1, RDN var2) {
      return IETFUtils.rDNAreEqual(var1, var2);
   }
}
