package org.bouncycastle.crypto.tls;

public class NameType {
   public static final short host_name = 0;

   public static boolean isValid(short var0) {
      return var0 == 0;
   }
}
