package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {
   Hashtable getClientExtensions() throws IOException;

   TlsSession getSessionToResume();

   int[] getCipherSuites();

   ProtocolVersion getClientVersion();

   boolean isFallback();

   Vector getClientSupplementalData() throws IOException;

   short[] getCompressionMethods();

   TlsAuthentication ak() throws IOException;

   void init(TlsClientContext var1);

   void notifySessionID(byte[] var1);

   void notifySelectedCipherSuite(int var1);

   void notifySelectedCompressionMethod(short var1);

   void processServerExtensions(Hashtable var1) throws IOException;

   void processServerSupplementalData(Vector var1) throws IOException;

   TlsKeyExchange getKeyExchange() throws IOException;

   ProtocolVersion getClientHelloRecordLayerVersion();

   void notifyServerVersion(ProtocolVersion var1) throws IOException;

   Hashtable ap() throws IOException;

   TlsAuthentication getAuthentication() throws IOException;

   Hashtable aw() throws IOException;

   void notifyNewSessionTicket(NewSessionTicket var1) throws IOException;
}
