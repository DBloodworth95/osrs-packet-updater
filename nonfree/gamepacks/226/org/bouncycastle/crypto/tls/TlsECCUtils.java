package org.bouncycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Hashtable;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.agreement.ECDHBasicAgreement;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.crypto.generators.ECKeyPairGenerator;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECKeyGenerationParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECCurve$F2m;
import org.bouncycastle.math.ec.ECCurve$Fp;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.field.PolynomialExtensionField;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Integers;

public class TlsECCUtils {
   public static final Integer EXT_elliptic_curves = Integers.valueOf(10);
   public static final Integer EXT_ec_point_formats = Integers.valueOf(11);
   static final String[] CURVE_NAMES = new String[]{"sect163k1", "sect163r1", "sect163r2", "sect193r1", "sect193r2", "sect233k1", "sect233r1", "sect239k1", "sect283k1", "sect283r1", "sect409k1", "sect409r1", "sect571k1", "sect571r1", "secp160k1", "secp160r1", "secp160r2", "secp192k1", "secp192r1", "secp224k1", "secp224r1", "secp256k1", "secp256r1", "secp384r1", "secp521r1", "brainpoolP256r1", "brainpoolP384r1", "brainpoolP512r1"};

   public static void addSupportedEllipticCurvesExtension(Hashtable var0, int[] var1) throws IOException {
      var0.put(EXT_elliptic_curves, createSupportedEllipticCurvesExtension(var1));
   }

   public static ECDomainParameters getParametersForNamedCurve(int var0) {
      String var1 = getNameOfNamedCurve(var0);
      if (var1 == null) {
         return null;
      } else {
         X9ECParameters var2 = CustomNamedCurves.getByName(var1);
         if (var2 == null) {
            var2 = ECNamedCurveTable.getByName(var1);
            if (var2 == null) {
               return null;
            }
         }

         return new ECDomainParameters(var2.getCurve(), var2.getG(), var2.getN(), var2.getH(), var2.getSeed());
      }
   }

   public static short[] getSupportedPointFormatsExtension(Hashtable var0) throws IOException {
      byte[] var1 = TlsUtils.getExtensionData(var0, EXT_ec_point_formats);
      return var1 == null ? null : readSupportedPointFormatsExtension(var1);
   }

   public static int[] getSupportedEllipticCurvesExtension(Hashtable var0) throws IOException {
      byte[] var1 = TlsUtils.getExtensionData(var0, EXT_elliptic_curves);
      return var1 == null ? null : readSupportedEllipticCurvesExtension(var1);
   }

   public static byte[] createSupportedPointFormatsExtension(short[] var0) throws IOException {
      if (var0 == null || !Arrays.contains((short[])var0, (short)0)) {
         var0 = Arrays.append((short[])var0, (short)0);
      }

      return TlsUtils.encodeUint8ArrayWithUint8Length(var0);
   }

   public static int[] readSupportedEllipticCurvesExtension(byte[] var0) throws IOException {
      if (var0 == null) {
         throw new IllegalArgumentException("'extensionData' cannot be null");
      } else {
         ByteArrayInputStream var1 = new ByteArrayInputStream(var0);
         int var2 = TlsUtils.readUint16(var1);
         if (var2 >= 2 && (var2 & 1) == 0) {
            int[] var3 = TlsUtils.readUint16Array(var2 / 2, var1);
            TlsProtocol.assertEmpty(var1);
            return var3;
         } else {
            throw new TlsFatalAlert((short)50);
         }
      }
   }

   public static BigInteger deserializeECFieldElement(int var0, byte[] var1) throws IOException {
      int var2 = (var0 + 7) / 8;
      if (var1.length != var2) {
         throw new TlsFatalAlert((short)50);
      } else {
         return new BigInteger(1, var1);
      }
   }

   public static short[] readSupportedPointFormatsExtension(byte[] var0) throws IOException {
      if (var0 == null) {
         throw new IllegalArgumentException("'extensionData' cannot be null");
      } else {
         ByteArrayInputStream var1 = new ByteArrayInputStream(var0);
         short var2 = TlsUtils.readUint8(var1);
         if (var2 < 1) {
            throw new TlsFatalAlert((short)50);
         } else {
            short[] var3 = TlsUtils.readUint8Array(var2, var1);
            TlsProtocol.assertEmpty(var1);
            if (!Arrays.contains((short[])var3, (short)0)) {
               throw new TlsFatalAlert((short)47);
            } else {
               return var3;
            }
         }
      }
   }

   public static String getNameOfNamedCurve(int var0) {
      return isSupportedNamedCurve(var0) ? CURVE_NAMES[var0 - 1] : null;
   }

   static void checkNamedCurve(int[] var0, int var1) throws IOException {
      if (var0 != null && !Arrays.contains(var0, var1)) {
         throw new TlsFatalAlert((short)47);
      }
   }

   public static boolean hasAnySupportedNamedCurves() {
      return CURVE_NAMES.length > 0;
   }

   public static boolean containsECCCipherSuites(int[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         if (isECCCipherSuite(var0[var1])) {
            return true;
         }
      }

      return false;
   }

   public static boolean isECCCipherSuite(int var0) {
      switch(var0) {
      case 49153:
      case 49154:
      case 49155:
      case 49156:
      case 49157:
      case 49158:
      case 49159:
      case 49160:
      case 49161:
      case 49162:
      case 49163:
      case 49164:
      case 49165:
      case 49166:
      case 49167:
      case 49168:
      case 49169:
      case 49170:
      case 49171:
      case 49172:
      case 49173:
      case 49174:
      case 49175:
      case 49176:
      case 49177:
      case 49187:
      case 49188:
      case 49189:
      case 49190:
      case 49191:
      case 49192:
      case 49193:
      case 49194:
      case 49195:
      case 49196:
      case 49197:
      case 49198:
      case 49199:
      case 49200:
      case 49201:
      case 49202:
      case 49203:
      case 49204:
      case 49205:
      case 49206:
      case 49207:
      case 49208:
      case 49209:
      case 49210:
      case 49211:
      case 49266:
      case 49267:
      case 49268:
      case 49269:
      case 49270:
      case 49271:
      case 49272:
      case 49273:
      case 49286:
      case 49287:
      case 49288:
      case 49289:
      case 49290:
      case 49291:
      case 49292:
      case 49293:
      case 49306:
      case 49307:
      case 49324:
      case 49325:
      case 49326:
      case 49327:
      case 52392:
      case 52393:
      case 52396:
      case 65282:
      case 65283:
      case 65284:
      case 65285:
      case 65300:
      case 65301:
         return true;
      default:
         return false;
      }
   }

   public static boolean areOnSameCurve(ECDomainParameters var0, ECDomainParameters var1) {
      return var0 != null && var0.equals(var1);
   }

   public static boolean isSupportedNamedCurve(int var0) {
      return var0 > 0 && var0 <= CURVE_NAMES.length;
   }

   public static boolean isCompressionPreferred(short[] var0, short var1) {
      if (var0 == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < var0.length; ++var2) {
            short var3 = var0[var2];
            if (var3 == 0) {
               return false;
            }

            if (var3 == var1) {
               return true;
            }
         }

         return false;
      }
   }

   public static void writeECFieldElement(ECFieldElement var0, OutputStream var1) throws IOException {
      TlsUtils.writeOpaque8(var0.getEncoded(), var1);
   }

   public static void writeExplicitECParameters(short[] var0, ECDomainParameters var1, OutputStream var2) throws IOException {
      ECCurve var3 = var1.getCurve();
      if (ECAlgorithms.isFpCurve(var3)) {
         TlsUtils.writeUint8((short)1, var2);
         writeECParameter(var3.getField().getCharacteristic(), var2);
      } else {
         if (!ECAlgorithms.isF2mCurve(var3)) {
            throw new IllegalArgumentException("'ecParameters' not a known curve type");
         }

         PolynomialExtensionField var4 = (PolynomialExtensionField)var3.getField();
         int[] var5 = var4.getMinimalPolynomial().getExponentsPresent();
         TlsUtils.writeUint8((short)2, var2);
         int var6 = var5[var5.length - 1];
         TlsUtils.checkUint16(var6);
         TlsUtils.writeUint16(var6, var2);
         if (var5.length == 3) {
            TlsUtils.writeUint8((short)1, var2);
            writeECExponent(var5[1], var2);
         } else {
            if (var5.length != 5) {
               throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            }

            TlsUtils.writeUint8((short)2, var2);
            writeECExponent(var5[1], var2);
            writeECExponent(var5[2], var2);
            writeECExponent(var5[3], var2);
         }
      }

      writeECFieldElement(var3.getA(), var2);
      writeECFieldElement(var3.getB(), var2);
      TlsUtils.writeOpaque8(serializeECPoint(var0, var1.getG()), var2);
      writeECParameter(var1.getN(), var2);
      writeECParameter(var1.getH(), var2);
   }

   public static byte[] serializeECPublicKey(short[] var0, ECPublicKeyParameters var1) throws IOException {
      return serializeECPoint(var0, var1.getQ());
   }

   public static byte[] serializeECPoint(short[] var0, ECPoint var1) throws IOException {
      ECCurve var2 = var1.getCurve();
      boolean var3 = false;
      if (ECAlgorithms.isFpCurve(var2)) {
         var3 = isCompressionPreferred(var0, (short)1);
      } else if (ECAlgorithms.isF2mCurve(var2)) {
         var3 = isCompressionPreferred(var0, (short)2);
      }

      return var1.getEncoded(var3);
   }

   public static byte[] createSupportedEllipticCurvesExtension(int[] var0) throws IOException {
      if (var0 != null && var0.length >= 1) {
         return TlsUtils.encodeUint16ArrayWithUint16Length(var0);
      } else {
         throw new TlsFatalAlert((short)80);
      }
   }

   public static void addSupportedPointFormatsExtension(Hashtable var0, short[] var1) throws IOException {
      var0.put(EXT_ec_point_formats, createSupportedPointFormatsExtension(var1));
   }

   public static byte[] calculateECDHBasicAgreement(ECPublicKeyParameters var0, ECPrivateKeyParameters var1) {
      ECDHBasicAgreement var2 = new ECDHBasicAgreement();
      var2.init(var1);
      BigInteger var3 = var2.calculateAgreement(var0);
      return BigIntegers.asUnsignedByteArray(var2.getFieldSize(), var3);
   }

   public static AsymmetricCipherKeyPair generateECKeyPair(SecureRandom var0, ECDomainParameters var1) {
      ECKeyPairGenerator var2 = new ECKeyPairGenerator();
      var2.init(new ECKeyGenerationParameters(var1, var0));
      return var2.generateKeyPair();
   }

   public static ECPoint deserializeECPoint(short[] var0, ECCurve var1, byte[] var2) throws IOException {
      if (var2 != null && var2.length >= 1) {
         byte var3;
         switch(var2[0]) {
         case 0:
         case 1:
         case 5:
         case 6:
         case 7:
         default:
            throw new TlsFatalAlert((short)47);
         case 2:
         case 3:
            if (ECAlgorithms.isF2mCurve(var1)) {
               var3 = 2;
            } else {
               if (!ECAlgorithms.isFpCurve(var1)) {
                  throw new TlsFatalAlert((short)47);
               }

               var3 = 1;
            }
            break;
         case 4:
            var3 = 0;
         }

         if (var3 == 0 || var0 != null && Arrays.contains((short[])var0, (short)var3)) {
            return var1.decodePoint(var2);
         } else {
            throw new TlsFatalAlert((short)47);
         }
      } else {
         throw new TlsFatalAlert((short)47);
      }
   }

   static ECPrivateKeyParameters generateEphemeralServerKeyExchange(SecureRandom var0, int[] var1, short[] var2, OutputStream var3) throws IOException {
      int var4 = -1;
      if (var1 == null) {
         var4 = 23;
      } else {
         for(int var5 = 0; var5 < var1.length; ++var5) {
            int var6 = var1[var5];
            if (NamedCurve.isValid(var6) && isSupportedNamedCurve(var6)) {
               var4 = var6;
               break;
            }
         }
      }

      ECDomainParameters var7 = null;
      if (var4 >= 0) {
         var7 = getParametersForNamedCurve(var4);
      } else if (Arrays.contains((int[])var1, (int)65281)) {
         var7 = getParametersForNamedCurve(23);
      } else if (Arrays.contains((int[])var1, (int)65282)) {
         var7 = getParametersForNamedCurve(10);
      }

      if (var7 == null) {
         throw new TlsFatalAlert((short)80);
      } else {
         if (var4 < 0) {
            writeExplicitECParameters(var2, var7, var3);
         } else {
            writeNamedECParameters(var4, var3);
         }

         return generateEphemeralClientKeyExchange(var0, var2, var7, var3);
      }
   }

   public static ECPublicKeyParameters validateECPublicKey(ECPublicKeyParameters var0) throws IOException {
      return var0;
   }

   public static BigInteger readECFieldElement(int var0, InputStream var1) throws IOException {
      return deserializeECFieldElement(var0, TlsUtils.readOpaque8(var1));
   }

   public static ECPrivateKeyParameters generateEphemeralClientKeyExchange(SecureRandom var0, short[] var1, ECDomainParameters var2, OutputStream var3) throws IOException {
      AsymmetricCipherKeyPair var4 = generateECKeyPair(var0, var2);
      ECPublicKeyParameters var5 = (ECPublicKeyParameters)var4.getPublic();
      writeECPoint(var1, var5.getQ(), var3);
      return (ECPrivateKeyParameters)var4.getPrivate();
   }

   public static BigInteger readECParameter(InputStream var0) throws IOException {
      return new BigInteger(1, TlsUtils.readOpaque8(var0));
   }

   public static int readECExponent(int var0, InputStream var1) throws IOException {
      BigInteger var2 = readECParameter(var1);
      if (var2.bitLength() < 32) {
         int var3 = var2.intValue();
         if (var3 > 0 && var3 < var0) {
            return var3;
         }
      }

      throw new TlsFatalAlert((short)47);
   }

   public static ECDomainParameters readECParameters(int[] var0, short[] var1, InputStream var2) throws IOException {
      try {
         short var3 = TlsUtils.readUint8(var2);
         int var4;
         BigInteger var9;
         switch(var3) {
         case 1:
            checkNamedCurve(var0, 65281);
            BigInteger var17 = readECParameter(var2);
            BigInteger var18 = readECFieldElement(var17.bitLength(), var2);
            BigInteger var19 = readECFieldElement(var17.bitLength(), var2);
            byte[] var20 = TlsUtils.readOpaque8(var2);
            BigInteger var21 = readECParameter(var2);
            var9 = readECParameter(var2);
            ECCurve$Fp var22 = new ECCurve$Fp(var17, var18, var19, var21, var9);
            ECPoint var23 = deserializeECPoint(var1, var22, var20);
            return new ECDomainParameters(var22, var23, var21, var9);
         case 2:
            checkNamedCurve(var0, 65282);
            var4 = TlsUtils.readUint16(var2);
            short var5 = TlsUtils.readUint8(var2);
            if (!ECBasisType.isValid(var5)) {
               throw new TlsFatalAlert((short)47);
            }

            int var6 = readECExponent(var4, var2);
            int var7 = -1;
            int var8 = -1;
            if (var5 == 2) {
               var7 = readECExponent(var4, var2);
               var8 = readECExponent(var4, var2);
            }

            var9 = readECFieldElement(var4, var2);
            BigInteger var10 = readECFieldElement(var4, var2);
            byte[] var11 = TlsUtils.readOpaque8(var2);
            BigInteger var12 = readECParameter(var2);
            BigInteger var13 = readECParameter(var2);
            ECCurve$F2m var14 = var5 == 2 ? new ECCurve$F2m(var4, var6, var7, var8, var9, var10, var12, var13) : new ECCurve$F2m(var4, var6, var9, var10, var12, var13);
            ECPoint var15 = deserializeECPoint(var1, var14, var11);
            return new ECDomainParameters(var14, var15, var12, var13);
         case 3:
            var4 = TlsUtils.readUint16(var2);
            if (!NamedCurve.refersToASpecificNamedCurve(var4)) {
               throw new TlsFatalAlert((short)47);
            }

            checkNamedCurve(var0, var4);
            return getParametersForNamedCurve(var4);
         default:
            throw new TlsFatalAlert((short)47);
         }
      } catch (RuntimeException var16) {
         throw new TlsFatalAlert((short)47, var16);
      }
   }

   public static void writeECExponent(int var0, OutputStream var1) throws IOException {
      BigInteger var2 = BigInteger.valueOf((long)var0);
      writeECParameter(var2, var1);
   }

   public static ECPublicKeyParameters deserializeECPublicKey(short[] var0, ECDomainParameters var1, byte[] var2) throws IOException {
      try {
         ECPoint var3 = deserializeECPoint(var0, var1.getCurve(), var2);
         return new ECPublicKeyParameters(var3, var1);
      } catch (RuntimeException var4) {
         throw new TlsFatalAlert((short)47, var4);
      }
   }

   public static void writeECFieldElement(int var0, BigInteger var1, OutputStream var2) throws IOException {
      TlsUtils.writeOpaque8(serializeECFieldElement(var0, var1), var2);
   }

   public static void writeECParameter(BigInteger var0, OutputStream var1) throws IOException {
      TlsUtils.writeOpaque8(BigIntegers.asUnsignedByteArray(var0), var1);
   }

   public static byte[] serializeECFieldElement(int var0, BigInteger var1) throws IOException {
      return BigIntegers.asUnsignedByteArray((var0 + 7) / 8, var1);
   }

   public static void writeECPoint(short[] var0, ECPoint var1, OutputStream var2) throws IOException {
      TlsUtils.writeOpaque8(serializeECPoint(var0, var1), var2);
   }

   public static void writeNamedECParameters(int var0, OutputStream var1) throws IOException {
      if (!NamedCurve.refersToASpecificNamedCurve(var0)) {
         throw new TlsFatalAlert((short)80);
      } else {
         TlsUtils.writeUint8((short)3, var1);
         TlsUtils.checkUint16(var0);
         TlsUtils.writeUint16(var0, var1);
      }
   }
}
