package org.bouncycastle.util;

public interface Memoable {
   void reset(Memoable var1);

   Memoable copy();
}
