package org.bouncycastle.asn1;

import java.io.InputStream;

abstract class LimitedInputStream extends InputStream {
   public final InputStream _in;
   int _limit;

   int getRemaining() {
      return this._limit;
   }

   public void setParentEofDetect(boolean var1) {
      if (this._in instanceof IndefiniteLengthInputStream) {
         ((IndefiniteLengthInputStream)this._in).setEofOn00(var1);
      }

   }

   LimitedInputStream(InputStream var1, int var2) {
      this._in = var1;
      this._limit = var2;
   }
}
