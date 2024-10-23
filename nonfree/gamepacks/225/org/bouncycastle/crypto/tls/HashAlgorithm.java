package org.bouncycastle.crypto.tls;

public class HashAlgorithm {
   public static final short sha224 = 3;
   public static final short md5 = 1;
   public static final short none = 0;
   public static final short sha1 = 2;
   public static final short sha256 = 4;
   public static final short sha384 = 5;
   public static final short sha512 = 6;

   public static boolean isPrivate(short var0) {
      return 224 <= var0 && var0 <= 255;
   }

   public static String getName(short var0) {
      switch(var0) {
      case 0:
         return "none";
      case 1:
         return "md5";
      case 2:
         return "sha1";
      case 3:
         return "sha224";
      case 4:
         return "sha256";
      case 5:
         return "sha384";
      case 6:
         return "sha512";
      default:
         return "UNKNOWN";
      }
   }

   public static String getText(short var0) {
      return getName(var0) + "(" + var0 + ")";
   }
}
