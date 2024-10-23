package org.bouncycastle.math.field;

import java.math.BigInteger;
import org.bouncycastle.util.Integers;

class GenericPolynomialExtField implements PolynomialExtensionField {
   public final Polynomial minimalPolynomial;
   public final FiniteField subfield;

   public int amy() {
      return this.subfield.hashCode() ^ Integers.rotateLeft(this.minimalPolynomial.hashCode(), 16);
   }

   public int hashCode() {
      return this.subfield.hashCode() ^ Integers.rotateLeft(this.minimalPolynomial.hashCode(), 16);
   }

   public int getDimension() {
      return this.subfield.getDimension() * this.minimalPolynomial.getDegree();
   }

   public FiniteField getSubfield() {
      return this.subfield;
   }

   public Polynomial getMinimalPolynomial() {
      return this.minimalPolynomial;
   }

   GenericPolynomialExtField(FiniteField var1, Polynomial var2) {
      this.subfield = var1;
      this.minimalPolynomial = var2;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof GenericPolynomialExtField)) {
         return false;
      } else {
         GenericPolynomialExtField var2 = (GenericPolynomialExtField)var1;
         return this.subfield.equals(var2.subfield) && this.minimalPolynomial.equals(var2.minimalPolynomial);
      }
   }

   public int getDegree() {
      return this.minimalPolynomial.getDegree();
   }

   public boolean gn(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof GenericPolynomialExtField)) {
         return false;
      } else {
         GenericPolynomialExtField var2 = (GenericPolynomialExtField)var1;
         return this.subfield.equals(var2.subfield) && this.minimalPolynomial.equals(var2.minimalPolynomial);
      }
   }

   public boolean gg(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof GenericPolynomialExtField)) {
         return false;
      } else {
         GenericPolynomialExtField var2 = (GenericPolynomialExtField)var1;
         return this.subfield.equals(var2.subfield) && this.minimalPolynomial.equals(var2.minimalPolynomial);
      }
   }

   public BigInteger getCharacteristic() {
      return this.subfield.getCharacteristic();
   }

   public int amd() {
      return this.subfield.hashCode() ^ Integers.rotateLeft(this.minimalPolynomial.hashCode(), 16);
   }
}
