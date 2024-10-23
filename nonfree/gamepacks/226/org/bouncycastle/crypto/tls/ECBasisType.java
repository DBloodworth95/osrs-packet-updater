package org.bouncycastle.crypto.tls;

public class ECBasisType {
   public static final short ec_basis_trinomial = 1;
   public static final short ec_basis_pentanomial = 2;

   public static boolean isValid(short var0) {
      return var0 >= 1 && var0 <= 2;
   }
}
