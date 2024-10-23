package org.bouncycastle.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Arrays$Iterator implements Iterator {
   final Object[] dataArray;
   int position = 0;

   public boolean hasNext() {
      return this.position < this.dataArray.length;
   }

   public Arrays$Iterator(Object[] var1) {
      this.dataArray = var1;
   }

   public Object next() {
      if (this.position == this.dataArray.length) {
         throw new NoSuchElementException("Out of elements: " + this.position);
      } else {
         return this.dataArray[this.position++];
      }
   }

   public void remove() {
      throw new UnsupportedOperationException("Cannot remove element from an Array.");
   }

   public Object at() {
      if (this.position == this.dataArray.length) {
         throw new NoSuchElementException("Out of elements: " + this.position);
      } else {
         return this.dataArray[this.position++];
      }
   }

   public Object au() {
      if (this.position == this.dataArray.length) {
         throw new NoSuchElementException("Out of elements: " + this.position);
      } else {
         return this.dataArray[this.position++];
      }
   }

   public Object an() {
      if (this.position == this.dataArray.length) {
         throw new NoSuchElementException("Out of elements: " + this.position);
      } else {
         return this.dataArray[this.position++];
      }
   }

   public boolean af() {
      return this.position < this.dataArray.length;
   }

   public boolean ao() {
      return this.position < this.dataArray.length;
   }

   public void ar() {
      throw new UnsupportedOperationException("Cannot remove element from an Array.");
   }

   public void ab() {
      throw new UnsupportedOperationException("Cannot remove element from an Array.");
   }

   public void az() {
      throw new UnsupportedOperationException("Cannot remove element from an Array.");
   }
}
