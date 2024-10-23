package org.bouncycastle.util;

public interface StringList extends Iterable {
   int size();

   int bg();

   String[] toStringArray(int var1, int var2);

   String[] toStringArray();

   String get(int var1);

   int bi();

   boolean add(String var1);
}
