package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import org.bouncycastle.util.Arrays$Iterator;
import org.bouncycastle.util.Iterable;

public abstract class ASN1Sequence extends ASN1Primitive implements Iterable {
   public Vector seq = new Vector();

   public int size() {
      return this.seq.size();
   }

   public ASN1Encodable getObjectAt(int var1) {
      return (ASN1Encodable)this.seq.elementAt(var1);
   }

   public ASN1Sequence() {
   }

   ASN1Primitive toDERObject() {
      DERSequence var1 = new DERSequence();
      var1.seq = this.seq;
      return var1;
   }

   public ASN1Sequence(ASN1EncodableVector var1) {
      for(int var2 = 0; var2 != var1.size(); ++var2) {
         this.seq.addElement(var1.get(var2));
      }

   }

   public ASN1Sequence(ASN1Encodable[] var1) {
      for(int var2 = 0; var2 != var1.length; ++var2) {
         this.seq.addElement(var1[var2]);
      }

   }

   public ASN1Sequence(ASN1Encodable var1) {
      this.seq.addElement(var1);
   }

   public Enumeration getObjects() {
      return this.seq.elements();
   }

   public static ASN1Sequence getInstance(ASN1TaggedObject var0, boolean var1) {
      if (var1) {
         if (!var0.isExplicit()) {
            throw new IllegalArgumentException("object implicit - explicit expected.");
         } else {
            return getInstance(var0.getObject().toASN1Primitive());
         }
      } else if (var0.isExplicit()) {
         return (ASN1Sequence)(var0 instanceof BERTaggedObject ? new BERSequence(var0.getObject()) : new DLSequence(var0.getObject()));
      } else if (var0.getObject() instanceof ASN1Sequence) {
         return (ASN1Sequence)var0.getObject();
      } else {
         throw new IllegalArgumentException("unknown object in getInstance: " + var0.getClass().getName());
      }
   }

   public ASN1SequenceParser parser() {
      return new ASN1Sequence$1(this, this);
   }

   boolean asn1Equals(ASN1Primitive var1) {
      if (!(var1 instanceof ASN1Sequence)) {
         return false;
      } else {
         ASN1Sequence var2 = (ASN1Sequence)var1;
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

   public Iterator ap() {
      return new Arrays$Iterator(this.toArray());
   }

   ASN1Encodable getNext(Enumeration var1) {
      ASN1Encodable var2 = (ASN1Encodable)var1.nextElement();
      return var2;
   }

   boolean isConstructed() {
      return true;
   }

   ASN1Primitive toDLObject() {
      DLSequence var1 = new DLSequence();
      var1.seq = this.seq;
      return var1;
   }

   public static ASN1Sequence getInstance(Object var0) {
      if (var0 != null && !(var0 instanceof ASN1Sequence)) {
         if (var0 instanceof ASN1SequenceParser) {
            return getInstance(((ASN1SequenceParser)var0).toASN1Primitive());
         } else if (var0 instanceof byte[]) {
            try {
               return getInstance(fromByteArray((byte[])((byte[])var0)));
            } catch (IOException var2) {
               throw new IllegalArgumentException("failed to construct sequence from byte[]: " + var2.getMessage());
            }
         } else {
            if (var0 instanceof ASN1Encodable) {
               ASN1Primitive var1 = ((ASN1Encodable)var0).toASN1Primitive();
               if (var1 instanceof ASN1Sequence) {
                  return (ASN1Sequence)var1;
               }
            }

            throw new IllegalArgumentException("unknown object in getInstance: " + var0.getClass().getName());
         }
      } else {
         return (ASN1Sequence)var0;
      }
   }

   abstract void encode(ASN1OutputStream var1) throws IOException;

   public String toString() {
      return this.seq.toString();
   }

   public Iterator iterator() {
      return new Arrays$Iterator(this.toArray());
   }

   public Iterator ah() {
      return new Arrays$Iterator(this.toArray());
   }

   public ASN1Encodable[] toArray() {
      ASN1Encodable[] var1 = new ASN1Encodable[this.size()];

      for(int var2 = 0; var2 != this.size(); ++var2) {
         var1[var2] = this.getObjectAt(var2);
      }

      return var1;
   }

   public Iterator ab() {
      return new Arrays$Iterator(this.toArray());
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

   public String aml() {
      return this.seq.toString();
   }

   public String amp() {
      return this.seq.toString();
   }

   public String ame() {
      return this.seq.toString();
   }
}
