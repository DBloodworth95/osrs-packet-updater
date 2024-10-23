package org.bouncycastle.math.field;

import java.math.BigInteger;

public interface FiniteField {
   int getDimension();

   BigInteger getCharacteristic();
}
