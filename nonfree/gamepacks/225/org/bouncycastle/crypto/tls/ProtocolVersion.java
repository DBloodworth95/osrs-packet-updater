package org.bouncycastle.crypto.tls;

import java.io.IOException;
import org.bouncycastle.util.Strings;

public final class ProtocolVersion {
   String name;
   public static final ProtocolVersion TLSv10 = new ProtocolVersion(769, "TLS 1.0");
   public static final ProtocolVersion DTLSv10 = new ProtocolVersion(65279, "DTLS 1.0");
   public static final ProtocolVersion TLSv12 = new ProtocolVersion(771, "TLS 1.2");
   public static final ProtocolVersion SSLv3 = new ProtocolVersion(768, "SSL 3.0");
   public static final ProtocolVersion DTLSv12 = new ProtocolVersion(65277, "DTLS 1.2");
   int version;
   public static final ProtocolVersion TLSv11 = new ProtocolVersion(770, "TLS 1.1");

   public static ProtocolVersion get(int var0, int var1) throws IOException {
      switch(var0) {
      case 3:
         switch(var1) {
         case 0:
            return SSLv3;
         case 1:
            return TLSv10;
         case 2:
            return TLSv11;
         case 3:
            return TLSv12;
         default:
            return getUnknownVersion(var0, var1, "TLS");
         }
      case 254:
         switch(var1) {
         case 253:
            return DTLSv12;
         case 254:
            throw new TlsFatalAlert((short)47);
         case 255:
            return DTLSv10;
         default:
            return getUnknownVersion(var0, var1, "DTLS");
         }
      default:
         throw new TlsFatalAlert((short)47);
      }
   }

   public int getFullVersion() {
      return this.version;
   }

   public boolean gg(Object var1) {
      return this == var1 || var1 instanceof ProtocolVersion && this.equals((ProtocolVersion)var1);
   }

   public int getMinorVersion() {
      return this.version & 255;
   }

   public boolean isDTLS() {
      return this.getMajorVersion() == 254;
   }

   public boolean isSSL() {
      return this == SSLv3;
   }

   public int amd() {
      return this.version;
   }

   public ProtocolVersion getEquivalentTLSVersion() {
      if (!this.isDTLS()) {
         return this;
      } else {
         return this == DTLSv10 ? TLSv11 : TLSv12;
      }
   }

   public boolean isEqualOrEarlierVersionOf(ProtocolVersion var1) {
      if (this.getMajorVersion() != var1.getMajorVersion()) {
         return false;
      } else {
         int var2 = var1.getMinorVersion() - this.getMinorVersion();
         return this.isDTLS() ? var2 <= 0 : var2 >= 0;
      }
   }

   public boolean isLaterVersionOf(ProtocolVersion var1) {
      if (this.getMajorVersion() != var1.getMajorVersion()) {
         return false;
      } else {
         int var2 = var1.getMinorVersion() - this.getMinorVersion();
         return this.isDTLS() ? var2 > 0 : var2 < 0;
      }
   }

   public int getMajorVersion() {
      return this.version >> 8;
   }

   public boolean equals(ProtocolVersion var1) {
      return var1 != null && this.version == var1.version;
   }

   public boolean isTLS() {
      return this.getMajorVersion() == 3;
   }

   public int hashCode() {
      return this.version;
   }

   public boolean equals(Object var1) {
      return this == var1 || var1 instanceof ProtocolVersion && this.equals((ProtocolVersion)var1);
   }

   static ProtocolVersion getUnknownVersion(int var0, int var1, String var2) throws IOException {
      TlsUtils.checkUint8(var0);
      TlsUtils.checkUint8(var1);
      int var3 = var0 << 8 | var1;
      String var4 = Strings.toUpperCase(Integer.toHexString(65536 | var3).substring(1));
      return new ProtocolVersion(var3, var2 + " 0x" + var4);
   }

   public String aml() {
      return this.name;
   }

   public String ame() {
      return this.name;
   }

   public int amy() {
      return this.version;
   }

   ProtocolVersion(int var1, String var2) {
      this.version = var1 & '\uffff';
      this.name = var2;
   }

   public boolean gn(Object var1) {
      return this == var1 || var1 instanceof ProtocolVersion && this.equals((ProtocolVersion)var1);
   }

   public String amp() {
      return this.name;
   }

   public String toString() {
      return this.name;
   }
}
