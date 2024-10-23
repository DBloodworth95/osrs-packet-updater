package org.bouncycastle.crypto.tls;

import org.bouncycastle.util.Arrays;

public class SecurityParameters {
   boolean truncatedHMac = false;
   int cipherSuite = -1;
   short maxFragmentLength = -1;
   int prfAlgorithm = -1;
   int verifyDataLength = -1;
   byte[] masterSecret = null;
   boolean encryptThenMAC = false;
   byte[] serverRandom = null;
   byte[] sessionHash = null;
   byte[] pskIdentity = null;
   byte[] srpIdentity = null;
   int entity = -1;
   short compressionAlgorithm = 0;
   byte[] clientRandom = null;
   boolean extendedMasterSecret = false;

   public int getCipherSuite() {
      return this.cipherSuite;
   }

   void clear() {
      if (this.masterSecret != null) {
         Arrays.fill((byte[])this.masterSecret, (byte)0);
         this.masterSecret = null;
      }

   }

   public byte[] getServerRandom() {
      return this.serverRandom;
   }

   public int getPrfAlgorithm() {
      return this.prfAlgorithm;
   }

   public short getCompressionAlgorithm() {
      return this.compressionAlgorithm;
   }

   public int getVerifyDataLength() {
      return this.verifyDataLength;
   }

   public byte[] getMasterSecret() {
      return this.masterSecret;
   }

   public byte[] getClientRandom() {
      return this.clientRandom;
   }

   public int getEntity() {
      return this.entity;
   }

   public byte[] getSessionHash() {
      return this.sessionHash;
   }

   /** @deprecated */
   public byte[] getPskIdentity() {
      return this.pskIdentity;
   }

   public byte[] getPSKIdentity() {
      return this.pskIdentity;
   }

   public byte[] getSRPIdentity() {
      return this.srpIdentity;
   }
}
