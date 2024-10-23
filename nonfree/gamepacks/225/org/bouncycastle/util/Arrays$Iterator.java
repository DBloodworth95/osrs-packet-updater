package org.bouncycastle.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Arrays$Iterator implements Iterator {
   final Object[] dataArray;
   int position = 0;

   public boolean ax() {
      return this.position < this.dataArray.length;
   }

   public boolean hasNext() {
      return this.position < this.dataArray.length;
   }

   public void remove() {
      throw new UnsupportedOperationException("Cannot remove element from an Array.");
   }

   public Object ar() {
      if (this.position == this.dataArray.length) {
         throw new NoSuchElementException("Out of elements: " + this.position);
      } else {
         return this.dataArray[this.position++];
      }
   }

   public Object next() {
      if (this.position == this.dataArray.length) {
         throw new NoSuchElementException("Out of elements: " + this.position);
      } else {
         return this.dataArray[this.position++];
      }
   }

   public void aq() {
      throw new UnsupportedOperationException("Cannot remove element from an Array.");
   }

   public void af() {
      throw new UnsupportedOperationException("Cannot remove element from an Array.");
   }

   public void at() {
      throw new UnsupportedOperationException("Cannot remove element from an Array.");
   }

   public void au() {
      throw new UnsupportedOperationException("Cannot remove element from an Array.");
   }

   public Arrays$Iterator(Object[] var1) {
      this.dataArray = var1;
   }

   public Object al() {
      if (this.position == this.dataArray.length) {
         throw new NoSuchElementException("Out of elements: " + this.position);
      } else {
         return this.dataArray[this.position++];
      }
   }
}
