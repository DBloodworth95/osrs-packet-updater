package org.bouncycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.util.Integers;

public class TlsExtensionsUtils {
   public static final Integer EXT_status_request = Integers.valueOf(5);
   public static final Integer EXT_extended_master_secret = Integers.valueOf(23);
   public static final Integer EXT_encrypt_then_mac = Integers.valueOf(22);
   public static final Integer EXT_truncated_hmac = Integers.valueOf(4);
   public static final Integer EXT_padding = Integers.valueOf(21);
   public static final Integer EXT_server_name = Integers.valueOf(0);
   public static final Integer EXT_heartbeat = Integers.valueOf(15);
   public static final Integer EXT_max_fragment_length = Integers.valueOf(1);

   public static ServerNameList getServerNameExtension(Hashtable var0) throws IOException {
      byte[] var1 = TlsUtils.getExtensionData(var0, EXT_server_name);
      return var1 == null ? null : readServerNameExtension(var1);
   }

   public static void addPaddingExtension(Hashtable var0, int var1) throws IOException {
      var0.put(EXT_padding, createPaddingExtension(var1));
   }

   public static void addEncryptThenMACExtension(Hashtable var0) {
      var0.put(EXT_encrypt_then_mac, createEncryptThenMACExtension());
   }

   public static Hashtable ensureExtensionsInitialised(Hashtable var0) {
      return var0 == null ? new Hashtable() : var0;
   }

   public static boolean hasEncryptThenMACExtension(Hashtable var0) throws IOException {
      byte[] var1 = TlsUtils.getExtensionData(var0, EXT_encrypt_then_mac);
      return var1 == null ? false : readEncryptThenMACExtension(var1);
   }

   public static void addMaxFragmentLengthExtension(Hashtable var0, short var1) throws IOException {
      var0.put(EXT_max_fragment_length, createMaxFragmentLengthExtension(var1));
   }

   public static int getPaddingExtension(Hashtable var0) throws IOException {
      byte[] var1 = TlsUtils.getExtensionData(var0, EXT_padding);
      return var1 == null ? -1 : readPaddingExtension(var1);
   }

   public static short readMaxFragmentLengthExtension(byte[] var0) throws IOException {
      if (var0 == null) {
         throw new IllegalArgumentException("'extensionData' cannot be null");
      } else if (var0.length != 1) {
         throw new TlsFatalAlert((short)50);
      } else {
         return TlsUtils.readUint8(var0, 0);
      }
   }

   public static void addStatusRequestExtension(Hashtable var0, CertificateStatusRequest var1) throws IOException {
      var0.put(EXT_status_request, createStatusRequestExtension(var1));
   }

   public static void addTruncatedHMacExtension(Hashtable var0) {
      var0.put(EXT_truncated_hmac, createTruncatedHMacExtension());
   }

   public static HeartbeatExtension getHeartbeatExtension(Hashtable var0) throws IOException {
      byte[] var1 = TlsUtils.getExtensionData(var0, EXT_heartbeat);
      return var1 == null ? null : readHeartbeatExtension(var1);
   }

   public static byte[] createEmptyExtensionData() {
      return TlsUtils.EMPTY_BYTES;
   }

   public static byte[] createEncryptThenMACExtension() {
      return createEmptyExtensionData();
   }

   public static short getMaxFragmentLengthExtension(Hashtable var0) throws IOException {
      byte[] var1 = TlsUtils.getExtensionData(var0, EXT_max_fragment_length);
      return var1 == null ? -1 : readMaxFragmentLengthExtension(var1);
   }

   public static CertificateStatusRequest getStatusRequestExtension(Hashtable var0) throws IOException {
      byte[] var1 = TlsUtils.getExtensionData(var0, EXT_status_request);
      return var1 == null ? null : readStatusRequestExtension(var1);
   }

   public static byte[] createTruncatedHMacExtension() {
      return createEmptyExtensionData();
   }

   public static boolean hasExtendedMasterSecretExtension(Hashtable var0) throws IOException {
      byte[] var1 = TlsUtils.getExtensionData(var0, EXT_extended_master_secret);
      return var1 == null ? false : readExtendedMasterSecretExtension(var1);
   }

   public static boolean hasTruncatedHMacExtension(Hashtable var0) throws IOException {
      byte[] var1 = TlsUtils.getExtensionData(var0, EXT_truncated_hmac);
      return var1 == null ? false : readTruncatedHMacExtension(var1);
   }

   public static void addServerNameExtension(Hashtable var0, ServerNameList var1) throws IOException {
      var0.put(EXT_server_name, createServerNameExtension(var1));
   }

   public static byte[] createExtendedMasterSecretExtension() {
      return createEmptyExtensionData();
   }

   public static byte[] createHeartbeatExtension(HeartbeatExtension var0) throws IOException {
      if (var0 == null) {
         throw new TlsFatalAlert((short)80);
      } else {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         var0.encode(var1);
         return var1.toByteArray();
      }
   }

   public static byte[] createMaxFragmentLengthExtension(short var0) throws IOException {
      TlsUtils.checkUint8(var0);
      byte[] var1 = new byte[1];
      TlsUtils.writeUint8((short)var0, var1, 0);
      return var1;
   }

   public static byte[] createPaddingExtension(int var0) throws IOException {
      TlsUtils.checkUint16(var0);
      return new byte[var0];
   }

   public static byte[] createServerNameExtension(ServerNameList var0) throws IOException {
      if (var0 == null) {
         throw new TlsFatalAlert((short)80);
      } else {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         var0.encode(var1);
         return var1.toByteArray();
      }
   }

   public static byte[] createStatusRequestExtension(CertificateStatusRequest var0) throws IOException {
      if (var0 == null) {
         throw new TlsFatalAlert((short)80);
      } else {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         var0.encode(var1);
         return var1.toByteArray();
      }
   }

   public static void addHeartbeatExtension(Hashtable var0, HeartbeatExtension var1) throws IOException {
      var0.put(EXT_heartbeat, createHeartbeatExtension(var1));
   }

   static boolean readEmptyExtensionData(byte[] var0) throws IOException {
      if (var0 == null) {
         throw new IllegalArgumentException("'extensionData' cannot be null");
      } else if (var0.length != 0) {
         throw new TlsFatalAlert((short)47);
      } else {
         return true;
      }
   }

   public static boolean readEncryptThenMACExtension(byte[] var0) throws IOException {
      return readEmptyExtensionData(var0);
   }

   public static boolean readTruncatedHMacExtension(byte[] var0) throws IOException {
      return readEmptyExtensionData(var0);
   }

   public static HeartbeatExtension readHeartbeatExtension(byte[] var0) throws IOException {
      if (var0 == null) {
         throw new IllegalArgumentException("'extensionData' cannot be null");
      } else {
         ByteArrayInputStream var1 = new ByteArrayInputStream(var0);
         HeartbeatExtension var2 = HeartbeatExtension.parse(var1);
         TlsProtocol.assertEmpty(var1);
         return var2;
      }
   }

   public static void addExtendedMasterSecretExtension(Hashtable var0) {
      var0.put(EXT_extended_master_secret, createExtendedMasterSecretExtension());
   }

   public static int readPaddingExtension(byte[] var0) throws IOException {
      if (var0 == null) {
         throw new IllegalArgumentException("'extensionData' cannot be null");
      } else {
         for(int var1 = 0; var1 < var0.length; ++var1) {
            if (var0[var1] != 0) {
               throw new TlsFatalAlert((short)47);
            }
         }

         return var0.length;
      }
   }

   public static ServerNameList readServerNameExtension(byte[] var0) throws IOException {
      if (var0 == null) {
         throw new IllegalArgumentException("'extensionData' cannot be null");
      } else {
         ByteArrayInputStream var1 = new ByteArrayInputStream(var0);
         ServerNameList var2 = ServerNameList.parse(var1);
         TlsProtocol.assertEmpty(var1);
         return var2;
      }
   }

   public static CertificateStatusRequest readStatusRequestExtension(byte[] var0) throws IOException {
      if (var0 == null) {
         throw new IllegalArgumentException("'extensionData' cannot be null");
      } else {
         ByteArrayInputStream var1 = new ByteArrayInputStream(var0);
         CertificateStatusRequest var2 = CertificateStatusRequest.parse(var1);
         TlsProtocol.assertEmpty(var1);
         return var2;
      }
   }

   public static boolean readExtendedMasterSecretExtension(byte[] var0) throws IOException {
      return readEmptyExtensionData(var0);
   }
}
