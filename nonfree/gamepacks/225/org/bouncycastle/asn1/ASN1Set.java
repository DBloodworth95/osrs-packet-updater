package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import org.bouncycastle.util.Arrays$Iterator;
import org.bouncycastle.util.Iterable;

public abstract class ASN1Set extends ASN1Primitive implements Iterable {
   Vector set = new Vector();
   boolean isSorted = false;

   public Iterator iterator() {
      return new Arrays$Iterator(this.toArray());
   }

   public static ASN1Set getInstance(ASN1TaggedObject var0, boolean var1) {
      if (var1) {
         if (!var0.isExplicit()) {
            throw new IllegalArgumentException("object implicit - explicit expected.");
         } else {
            return (ASN1Set)var0.getObject();
         }
      } else if (var0.isExplicit()) {
         return (ASN1Set)(var0 instanceof BERTaggedObject ? new BERSet(var0.getObject()) : new DLSet(var0.getObject()));
      } else if (var0.getObject() instanceof ASN1Set) {
         return (ASN1Set)var0.getObject();
      } else if (var0.getObject() instanceof ASN1Sequence) {
         ASN1Sequence var2 = (ASN1Sequence)var0.getObject();
         return (ASN1Set)(var0 instanceof BERTaggedObject ? new BERSet(var2.toArray()) : new DLSet(var2.toArray()));
      } else {
         throw new IllegalArgumentException("unknown object in getInstance: " + var0.getClass().getName());
      }
   }

   public ASN1Set() {
   }

   public ASN1Set(ASN1Encodable var1) {
      this.set.addElement(var1);
   }

   public ASN1Set(ASN1EncodableVector var1, boolean var2) {
      for(int var3 = 0; var3 != var1.size(); ++var3) {
         this.set.addElement(var1.get(var3));
      }

      if (var2) {
         this.sort();
      }

   }

   public ASN1Set(ASN1Encodable[] var1, boolean var2) {
      for(int var3 = 0; var3 != var1.length; ++var3) {
         this.set.addElement(var1[var3]);
      }

      if (var2) {
         this.sort();
      }

   }

   public Enumeration getObjects() {
      return this.set.elements();
   }

   public ASN1Encodable getObjectAt(int var1) {
      return (ASN1Encodable)this.set.elementAt(var1);
   }

   public int size() {
      return this.set.size();
   }

   public Iterator ab() {
      return new Arrays$Iterator(this.toArray());
   }

   ASN1Primitive toDERObject() {
      if (this.isSorted) {
         DERSet var3 = new DERSet();
         var3.set = this.set;
         return var3;
      } else {
         Vector var1 = new Vector();

         for(int var2 = 0; var2 != this.set.size(); ++var2) {
            var1.addElement(this.set.elementAt(var2));
         }

         DERSet var4 = new DERSet();
         var4.set = var1;
         var4.sort();
         return var4;
      }
   }

   public int hashCode() {
      Enumeration var1 = this.getObjects();

      int var2;
      ASN1Encodable var3;
      for(var2 = this.size(); var1.hasMoreElements(); var2 ^= var3.hashCode()) {
         var3 = this.getNext(var1);
         var2 *= 17;
      }

      return var2;
   }

   ASN1Primitive toDLObject() {
      DLSet var1 = new DLSet();
      var1.set = this.set;
      return var1;
   }

   public ASN1Encodable[] toArray() {
      ASN1Encodable[] var1 = new ASN1Encodable[this.size()];

      for(int var2 = 0; var2 != this.size(); ++var2) {
         var1[var2] = this.getObjectAt(var2);
      }

      return var1;
   }

   boolean asn1Equals(ASN1Primitive var1) {
      if (!(var1 instanceof ASN1Set)) {
         return false;
      } else {
         ASN1Set var2 = (ASN1Set)var1;
         if (this.size() != var2.size()) {
            return false;
         } else {
            Enumeration var3 = this.getObjects();
            Enumeration var4 = var2.getObjects();

            ASN1Primitive var7;
            ASN1Primitive var8;
            do {
               if (!var3.hasMoreElements()) {
                  return true;
               }

               ASN1Encodable var5 = this.getNext(var3);
               ASN1Encodable var6 = this.getNext(var4);
               var7 = var5.toASN1Primitive();
               var8 = var6.toASN1Primitive();
            } while(var7 == var8 || var7.equals(var8));

            return false;
         }
      }
   }

   public String aml() {
      return this.set.toString();
   }

   boolean lessThanOrEqual(byte[] var1, byte[] var2) {
      int var3 = Math.min(var1.length, var2.length);

      for(int var4 = 0; var4 != var3; ++var4) {
         if (var1[var4] != var2[var4]) {
            return (var1[var4] & 255) < (var2[var4] & 255);
         }
      }

      return var3 == var1.length;
   }

   byte[] getDEREncoded(ASN1Encodable var1) {
      try {
         return var1.toASN1Primitive().getEncoded("DER");
      } catch (IOException var3) {
         throw new IllegalArgumentException("cannot encode object added to SET");
      }
   }

   public void sort() {
      if (!this.isSorted) {
         this.isSorted = true;
         if (this.set.size() > 1) {
            boolean var1 = true;

            int var4;
            for(int var2 = this.set.size() - 1; var1; var2 = var4) {
               int var3 = 0;
               var4 = 0;
               byte[] var5 = this.getDEREncoded((ASN1Encodable)this.set.elementAt(0));

               for(var1 = false; var3 != var2; ++var3) {
                  byte[] var6 = this.getDEREncoded((ASN1Encodable)this.set.elementAt(var3 + 1));
                  if (this.lessThanOrEqual(var5, var6)) {
                     var5 = var6;
                  } else {
                     Object var7 = this.set.elementAt(var3);
                     this.set.setElementAt(this.set.elementAt(var3 + 1), var3);
                     this.set.setElementAt(var7, var3 + 1);
                     var1 = true;
                     var4 = var3;
                  }
               }
            }
         }
      }

   }

   public static ASN1Set getInstance(Object var0) {
      if (var0 != null && !(var0 instanceof ASN1Set)) {
         if (var0 instanceof ASN1SetParser) {
            return getInstance(((ASN1SetParser)var0).toASN1Primitive());
         } else if (var0 instanceof byte[]) {
            try {
               return getInstance(ASN1Primitive.fromByteArray((byte[])((byte[])var0)));
            } catch (IOException var2) {
               throw new IllegalArgumentException("failed to construct set from byte[]: " + var2.getMessage());
            }
         } else {
            if (var0 instanceof ASN1Encodable) {
               ASN1Primitive var1 = ((ASN1Encodable)var0).toASN1Primitive();
               if (var1 instanceof ASN1Set) {
                  return (ASN1Set)var1;
               }
            }

            throw new IllegalArgumentException("unknown object in getInstance: " + var0.getClass().getName());
         }
      } else {
         return (ASN1Set)var0;
      }
   }

   abstract void encode(ASN1OutputStream var1) throws IOException;

   public String toString() {
      return this.set.toString();
   }

   public String amp() {
      return this.set.toString();
   }

   public Iterator ah() {
      return new Arrays$Iterator(this.toArray());
   }

   public Iterator ap() {
      return new Arrays$Iterator(this.toArray());
   }

   boolean isConstructed() {
      return true;
   }

   public int amy() {
      Enumeration var1 = this.getObjects();

      int var2;
      ASN1Encodable var3;
      for(var2 = this.size(); var1.hasMoreElements(); var2 ^= var3.hashCode()) {
         var3 = this.getNext(var1);
         var2 *= 17;
      }

      return var2;
   }

   public int amd() {
      Enumeration var1 = this.getObjects();

      int var2;
      ASN1Encodable var3;
      for(var2 = this.size(); var1.hasMoreElements(); var2 ^= var3.hashCode()) {
         var3 = this.getNext(var1);
         var2 *= 17;
      }

      return var2;
   }

   public ASN1SetParser parser() {
      return new ASN1Set$1(this, this);
   }

   ASN1Encodable getNext(Enumeration var1) {
      ASN1Encodable var2 = (ASN1Encodable)var1.nextElement();
      return (ASN1Encodable)(var2 == null ? DERNull.INSTANCE : var2);
   }

   public String ame() {
      return this.set.toString();
   }
}
