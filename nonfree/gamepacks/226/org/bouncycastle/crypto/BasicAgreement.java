package org.bouncycastle.crypto;

import java.math.BigInteger;

public interface BasicAgreement {
   BigInteger calculateAgreement(CipherParameters var1);

   int getFieldSize();

   void init(CipherParameters var1);
}
