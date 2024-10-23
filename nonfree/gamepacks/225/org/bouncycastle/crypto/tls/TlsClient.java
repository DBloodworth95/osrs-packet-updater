package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public interface TlsClient extends TlsPeer {
   Hashtable ac() throws IOException;

   void notifyNewSessionTicket(NewSessionTicket var1) throws IOException;

   ProtocolVersion getClientHelloRecordLayerVersion();

   ProtocolVersion getClientVersion();

   TlsAuthentication ae() throws IOException;

   int[] getCipherSuites();

   short[] getCompressionMethods();

   void notifySelectedCipherSuite(int var1);

   void notifyServerVersion(ProtocolVersion var1) throws IOException;

   boolean isFallback();

   void init(TlsClientContext var1);

   void notifySelectedCompressionMethod(short var1);

   void processServerExtensions(Hashtable var1) throws IOException;

   void processServerSupplementalData(Vector var1) throws IOException;

   TlsKeyExchange getKeyExchange() throws IOException;

   TlsAuthentication getAuthentication() throws IOException;

   Vector getClientSupplementalData() throws IOException;

   Hashtable getClientExtensions() throws IOException;

   TlsSession getSessionToResume();

   TlsAuthentication ag() throws IOException;

   void notifySessionID(byte[] var1);
}
