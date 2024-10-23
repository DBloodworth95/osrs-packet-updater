package org.bouncycastle.asn1;

public class OIDTokenizer {
   String oid;
   int index;

   public boolean hasMoreTokens() {
      return this.index != -1;
   }

   public OIDTokenizer(String var1) {
      this.oid = var1;
      this.index = 0;
   }

   public String nextToken() {
      if (this.index == -1) {
         return null;
      } else {
         int var2 = this.oid.indexOf(46, this.index);
         String var1;
         if (var2 == -1) {
            var1 = this.oid.substring(this.index);
            this.index = -1;
            return var1;
         } else {
            var1 = this.oid.substring(this.index, var2);
            this.index = var2 + 1;
            return var1;
         }
      }
   }
}
