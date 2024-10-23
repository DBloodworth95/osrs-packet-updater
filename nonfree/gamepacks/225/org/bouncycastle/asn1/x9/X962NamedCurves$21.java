package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.util.encoders.Hex;

final class X962NamedCurves$21 extends X9ECParametersHolder {
   public X9ECParameters createParameters() {
      BigInteger var1 = new BigInteger("01AF286BCA1AF286BCA1AF286BCA1AF286BCA1AF286BC9FB8F6B85C556892C20A7EB964FE7719E74F490758D3B", 16);
      BigInteger var2 = BigInteger.valueOf(76L);
      ECCurve$F2m var3 = new ECCurve$F2m(359, 68, new BigInteger("5667676A654B20754F356EA92017D946567C46675556F19556A04616B567D223A5E05656FB549016A96656A557", 16), new BigInteger("2472E2D0197C49363F1FE7F5B6DB075D52B6947D135D8CA445805D39BC345626089687742B6329E70680231988", 16), var1, var2);
      return new X9ECParameters(var3, new X9ECPoint(var3, Hex.decode("033C258EF3047767E7EDE0F1FDAA79DAEE3841366A132E163ACED4ED2401DF9C6BDCDE98E8E707C07A2239B1B097")), var1, var2, (byte[])null);
   }
}
