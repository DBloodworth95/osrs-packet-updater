package org.bouncycastle.crypto;

import java.security.SecureRandom;

public class KeyGenerationParameters {
   SecureRandom random;
   int strength;

   public int getStrength() {
      return this.strength;
   }

   public KeyGenerationParameters(SecureRandom var1, int var2) {
      this.random = var1;
      this.strength = var2;
   }

   public SecureRandom getRandom() {
      return this.random;
   }
}
