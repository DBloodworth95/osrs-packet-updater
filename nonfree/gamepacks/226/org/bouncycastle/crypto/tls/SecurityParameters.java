package org.bouncycastle.crypto.tls;

import org.bouncycastle.util.Arrays;

public class SecurityParameters {
   int verifyDataLength = -1;
   int cipherSuite = -1;
   boolean extendedMasterSecret = false;
   int prfAlgorithm = -1;
   int entity = -1;
   short maxFragmentLength = -1;
   byte[] clientRandom = null;
   byte[] serverRandom = null;
   byte[] sessionHash = null;
   byte[] pskIdentity = null;
   byte[] srpIdentity = null;
   short compressionAlgorithm = 0;
   boolean truncatedHMac = false;
   boolean encryptThenMAC = false;
   byte[] masterSecret = null;

   void clear() {
      if (this.masterSecret != null) {
         Arrays.fill((byte[])this.masterSecret, (byte)0);
         this.masterSecret = null;
      }

   }

   public byte[] getSRPIdentity() {
      return this.srpIdentity;
   }

   public byte[] getPSKIdentity() {
      return this.pskIdentity;
   }

   public int getCipherSuite() {
      return this.cipherSuite;
   }

   public int getEntity() {
      return this.entity;
   }

   public int getPrfAlgorithm() {
      return this.prfAlgorithm;
   }

   public byte[] getMasterSecret() {
      return this.masterSecret;
   }

   public short getCompressionAlgorithm() {
      return this.compressionAlgorithm;
   }

   public byte[] getClientRandom() {
      return this.clientRandom;
   }

   public byte[] getServerRandom() {
      return this.serverRandom;
   }

   public byte[] getSessionHash() {
      return this.sessionHash;
   }

   /** @deprecated */
   public byte[] getPskIdentity() {
      return this.pskIdentity;
   }

   public int getVerifyDataLength() {
      return this.verifyDataLength;
   }
}
