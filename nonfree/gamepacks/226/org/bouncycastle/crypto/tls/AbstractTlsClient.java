package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public abstract class AbstractTlsClient extends AbstractTlsPeer implements TlsClient {
   public int selectedCipherSuite;
   public TlsClientContext context;
   public Vector supportedSignatureAlgorithms;
   public int[] namedCurves;
   public TlsCipherFactory cipherFactory;
   public short[] serverECPointFormats;
   public short[] clientECPointFormats;
   public short selectedCompressionMethod;

   public AbstractTlsClient(TlsCipherFactory var1) {
      this.cipherFactory = var1;
   }

   public void checkForUnexpectedServerExtension(Hashtable var1, Integer var2) throws IOException {
      byte[] var3 = TlsUtils.getExtensionData(var1, var2);
      if (var3 != null && !this.allowUnexpectedServerExtension(var2, var3)) {
         throw new TlsFatalAlert((short)47);
      }
   }

   public boolean allowUnexpectedServerExtension(Integer var1, byte[] var2) throws IOException {
      switch(var1) {
      case 10:
         TlsECCUtils.readSupportedEllipticCurvesExtension(var2);
         return true;
      default:
         return false;
      }
   }

   public void notifyNewSessionTicket(NewSessionTicket var1) throws IOException {
   }

   public void notifyServerVersion(ProtocolVersion var1) throws IOException {
      if (!this.getMinimumVersion().isEqualOrEarlierVersionOf(var1)) {
         throw new TlsFatalAlert((short)70);
      }
   }

   public TlsSession getSessionToResume() {
      return null;
   }

   public ProtocolVersion getClientHelloRecordLayerVersion() {
      return this.getClientVersion();
   }

   public ProtocolVersion getClientVersion() {
      return ProtocolVersion.TLSv12;
   }

   public boolean isFallback() {
      return false;
   }

   public TlsCipher getCipher() throws IOException {
      int var1 = TlsUtils.getEncryptionAlgorithm(this.selectedCipherSuite);
      int var2 = TlsUtils.getMACAlgorithm(this.selectedCipherSuite);
      return this.cipherFactory.createCipher(this.context, var1, var2);
   }

   public ProtocolVersion getMinimumVersion() {
      return ProtocolVersion.TLSv10;
   }

   public AbstractTlsClient() {
      this(new DefaultTlsCipherFactory());
   }

   public short[] getCompressionMethods() {
      return new short[]{0};
   }

   public void notifySessionID(byte[] var1) {
   }

   public void notifySelectedCipherSuite(int var1) {
      this.selectedCipherSuite = var1;
   }

   public void init(TlsClientContext var1) {
      this.context = var1;
   }

   public void processServerExtensions(Hashtable var1) throws IOException {
      if (var1 != null) {
         this.checkForUnexpectedServerExtension(var1, TlsUtils.EXT_signature_algorithms);
         this.checkForUnexpectedServerExtension(var1, TlsECCUtils.EXT_elliptic_curves);
         if (TlsECCUtils.isECCCipherSuite(this.selectedCipherSuite)) {
            this.serverECPointFormats = TlsECCUtils.getSupportedPointFormatsExtension(var1);
         } else {
            this.checkForUnexpectedServerExtension(var1, TlsECCUtils.EXT_ec_point_formats);
         }

         this.checkForUnexpectedServerExtension(var1, TlsExtensionsUtils.EXT_padding);
      }

   }

   public void processServerSupplementalData(Vector var1) throws IOException {
      if (var1 != null) {
         throw new TlsFatalAlert((short)10);
      }
   }

   public Vector getClientSupplementalData() throws IOException {
      return null;
   }

   public TlsCompression getCompression() throws IOException {
      switch(this.selectedCompressionMethod) {
      case 0:
         return new TlsNullCompression();
      default:
         throw new TlsFatalAlert((short)80);
      }
   }

   public Hashtable getClientExtensions() throws IOException {
      Hashtable var1 = null;
      ProtocolVersion var2 = this.context.getClientVersion();
      if (TlsUtils.isSignatureAlgorithmsExtensionAllowed(var2)) {
         this.supportedSignatureAlgorithms = TlsUtils.getDefaultSupportedSignatureAlgorithms();
         var1 = TlsExtensionsUtils.ensureExtensionsInitialised(var1);
         TlsUtils.addSignatureAlgorithmsExtension(var1, this.supportedSignatureAlgorithms);
      }

      if (TlsECCUtils.containsECCCipherSuites(this.getCipherSuites())) {
         this.namedCurves = new int[]{23, 24};
         this.clientECPointFormats = new short[]{0, 1, 2};
         var1 = TlsExtensionsUtils.ensureExtensionsInitialised(var1);
         TlsECCUtils.addSupportedEllipticCurvesExtension(var1, this.namedCurves);
         TlsECCUtils.addSupportedPointFormatsExtension(var1, this.clientECPointFormats);
      }

      return var1;
   }

   public void notifySelectedCompressionMethod(short var1) {
      this.selectedCompressionMethod = var1;
   }

   public Hashtable ap() throws IOException {
      Hashtable var1 = null;
      ProtocolVersion var2 = this.context.getClientVersion();
      if (TlsUtils.isSignatureAlgorithmsExtensionAllowed(var2)) {
         this.supportedSignatureAlgorithms = TlsUtils.getDefaultSupportedSignatureAlgorithms();
         var1 = TlsExtensionsUtils.ensureExtensionsInitialised(var1);
         TlsUtils.addSignatureAlgorithmsExtension(var1, this.supportedSignatureAlgorithms);
      }

      if (TlsECCUtils.containsECCCipherSuites(this.getCipherSuites())) {
         this.namedCurves = new int[]{23, 24};
         this.clientECPointFormats = new short[]{0, 1, 2};
         var1 = TlsExtensionsUtils.ensureExtensionsInitialised(var1);
         TlsECCUtils.addSupportedEllipticCurvesExtension(var1, this.namedCurves);
         TlsECCUtils.addSupportedPointFormatsExtension(var1, this.clientECPointFormats);
      }

      return var1;
   }

   public Hashtable aw() throws IOException {
      Hashtable var1 = null;
      ProtocolVersion var2 = this.context.getClientVersion();
      if (TlsUtils.isSignatureAlgorithmsExtensionAllowed(var2)) {
         this.supportedSignatureAlgorithms = TlsUtils.getDefaultSupportedSignatureAlgorithms();
         var1 = TlsExtensionsUtils.ensureExtensionsInitialised(var1);
         TlsUtils.addSignatureAlgorithmsExtension(var1, this.supportedSignatureAlgorithms);
      }

      if (TlsECCUtils.containsECCCipherSuites(this.getCipherSuites())) {
         this.namedCurves = new int[]{23, 24};
         this.clientECPointFormats = new short[]{0, 1, 2};
         var1 = TlsExtensionsUtils.ensureExtensionsInitialised(var1);
         TlsECCUtils.addSupportedEllipticCurvesExtension(var1, this.namedCurves);
         TlsECCUtils.addSupportedPointFormatsExtension(var1, this.clientECPointFormats);
      }

      return var1;
   }
}
