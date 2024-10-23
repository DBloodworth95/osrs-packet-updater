package org.bouncycastle.asn1.x500;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.style.BCStyle;

public class X500Name extends ASN1Object implements ASN1Choice {
   boolean isHashCodeCalculated;
   static X500NameStyle defaultStyle;
   int hashCodeValue;
   X500NameStyle style;
   RDN[] rdns;

   public RDN[] getRDNs(ASN1ObjectIdentifier var1) {
      RDN[] var2 = new RDN[this.rdns.length];
      int var3 = 0;

      for(int var4 = 0; var4 != this.rdns.length; ++var4) {
         RDN var5 = this.rdns[var4];
         if (var5.isMultiValued()) {
            AttributeTypeAndValue[] var6 = var5.getTypesAndValues();

            for(int var7 = 0; var7 != var6.length; ++var7) {
               if (var6[var7].getType().equals(var1)) {
                  var2[var3++] = var5;
                  break;
               }
            }
         } else if (var5.getFirst().getType().equals(var1)) {
            var2[var3++] = var5;
         }
      }

      RDN[] var8 = new RDN[var3];
      System.arraycopy(var2, 0, var8, 0, var8.length);
      return var8;
   }

   public static X500Name getInstance(ASN1TaggedObject var0, boolean var1) {
      return getInstance(ASN1Sequence.getInstance(var0, true));
   }

   public static X500Name getInstance(Object var0) {
      if (var0 instanceof X500Name) {
         return (X500Name)var0;
      } else {
         return var0 != null ? new X500Name(ASN1Sequence.getInstance(var0)) : null;
      }
   }

   public static X500Name getInstance(X500NameStyle var0, Object var1) {
      if (var1 instanceof X500Name) {
         return new X500Name(var0, (X500Name)var1);
      } else {
         return var1 != null ? new X500Name(var0, ASN1Sequence.getInstance(var1)) : null;
      }
   }

   public int amg() {
      if (this.isHashCodeCalculated) {
         return this.hashCodeValue;
      } else {
         this.isHashCodeCalculated = true;
         this.hashCodeValue = this.style.calculateHashCode(this);
         return this.hashCodeValue;
      }
   }

   X500Name(X500NameStyle var1, ASN1Sequence var2) {
      this.style = var1;
      this.rdns = new RDN[var2.size()];
      int var3 = 0;

      for(Enumeration var4 = var2.getObjects(); var4.hasMoreElements(); this.rdns[var3++] = RDN.getInstance(var4.nextElement())) {
      }

   }

   X500Name(ASN1Sequence var1) {
      this(defaultStyle, var1);
   }

   /** @deprecated */
   public X500Name(X500NameStyle var1, X500Name var2) {
      this.rdns = var2.rdns;
      this.style = var1;
   }

   public X500Name(String var1) {
      this(defaultStyle, var1);
   }

   public RDN[] getRDNs() {
      RDN[] var1 = new RDN[this.rdns.length];
      System.arraycopy(this.rdns, 0, var1, 0, var1.length);
      return var1;
   }

   public X500Name(X500NameStyle var1, String var2) {
      this(var1.fromString(var2));
      this.style = var1;
   }

   public ASN1ObjectIdentifier[] getAttributeTypes() {
      int var1 = 0;

      for(int var2 = 0; var2 != this.rdns.length; ++var2) {
         RDN var3 = this.rdns[var2];
         var1 += var3.size();
      }

      ASN1ObjectIdentifier[] var7 = new ASN1ObjectIdentifier[var1];
      var1 = 0;

      for(int var8 = 0; var8 != this.rdns.length; ++var8) {
         RDN var4 = this.rdns[var8];
         if (var4.isMultiValued()) {
            AttributeTypeAndValue[] var5 = var4.getTypesAndValues();

            for(int var6 = 0; var6 != var5.length; ++var6) {
               var7[var1++] = var5[var6].getType();
            }
         } else if (var4.size() != 0) {
            var7[var1++] = var4.getFirst().getType();
         }
      }

      return var7;
   }

   public int amf() {
      if (this.isHashCodeCalculated) {
         return this.hashCodeValue;
      } else {
         this.isHashCodeCalculated = true;
         this.hashCodeValue = this.style.calculateHashCode(this);
         return this.hashCodeValue;
      }
   }

   public X500Name(X500NameStyle var1, RDN[] var2) {
      this.rdns = var2;
      this.style = var1;
   }

   public int hashCode() {
      if (this.isHashCodeCalculated) {
         return this.hashCodeValue;
      } else {
         this.isHashCodeCalculated = true;
         this.hashCodeValue = this.style.calculateHashCode(this);
         return this.hashCodeValue;
      }
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof X500Name) && !(var1 instanceof ASN1Sequence)) {
         return false;
      } else {
         ASN1Primitive var2 = ((ASN1Encodable)var1).toASN1Primitive();
         if (this.toASN1Primitive().equals(var2)) {
            return true;
         } else {
            try {
               return this.style.areEqual(this, new X500Name(ASN1Sequence.getInstance(((ASN1Encodable)var1).toASN1Primitive())));
            } catch (Exception var4) {
               return false;
            }
         }
      }
   }

   public String toString() {
      return this.style.toString(this);
   }

   public X500Name(RDN[] var1) {
      this(defaultStyle, var1);
   }

   public static X500NameStyle getDefaultStyle() {
      return defaultStyle;
   }

   public static void setDefaultStyle(X500NameStyle var0) {
      if (var0 == null) {
         throw new NullPointerException("cannot set style to null");
      } else {
         defaultStyle = var0;
      }
   }

   public boolean gj(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof X500Name) && !(var1 instanceof ASN1Sequence)) {
         return false;
      } else {
         ASN1Primitive var2 = ((ASN1Encodable)var1).toASN1Primitive();
         if (this.toASN1Primitive().equals(var2)) {
            return true;
         } else {
            try {
               return this.style.areEqual(this, new X500Name(ASN1Sequence.getInstance(((ASN1Encodable)var1).toASN1Primitive())));
            } catch (Exception var4) {
               return false;
            }
         }
      }
   }

   public int ams() {
      if (this.isHashCodeCalculated) {
         return this.hashCodeValue;
      } else {
         this.isHashCodeCalculated = true;
         this.hashCodeValue = this.style.calculateHashCode(this);
         return this.hashCodeValue;
      }
   }

   static {
      defaultStyle = BCStyle.INSTANCE;
   }

   public int amb() {
      if (this.isHashCodeCalculated) {
         return this.hashCodeValue;
      } else {
         this.isHashCodeCalculated = true;
         this.hashCodeValue = this.style.calculateHashCode(this);
         return this.hashCodeValue;
      }
   }

   public ASN1Primitive toASN1Primitive() {
      return new DERSequence(this.rdns);
   }

   public int aml() {
      if (this.isHashCodeCalculated) {
         return this.hashCodeValue;
      } else {
         this.isHashCodeCalculated = true;
         this.hashCodeValue = this.style.calculateHashCode(this);
         return this.hashCodeValue;
      }
   }

   public String amw() {
      return this.style.toString(this);
   }

   public String amu() {
      return this.style.toString(this);
   }
}
