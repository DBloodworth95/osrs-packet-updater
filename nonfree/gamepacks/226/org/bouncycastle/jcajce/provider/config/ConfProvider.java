package org.bouncycastle.jcajce.provider.config;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.util.AsymKeyInfoConverter;

public interface ConfProvider {
   String THREAD_LOCAL_DH_DEFAULT_PARAMS = "threadLocalDhDefaultParams";
   String EC_IMPLICITLY_CA = "ecImplicitlyCa";
   String THREAD_LOCAL_EC_IMPLICITLY_CA = "threadLocalEcImplicitlyCa";
   String DH_DEFAULT_PARAMS = "DhDefaultParams";
   String ACCEPTABLE_EC_CURVES = "acceptableEcCurves";
   String ADDITIONAL_EC_PARAMETERS = "additionalEcParameters";

   boolean hasAlgorithm(String var1, String var2);

   void addAlgorithm(String var1, String var2);

   void addAlgorithm(String var1, ASN1ObjectIdentifier var2, String var3);

   void setParameter(String var1, Object var2);

   void addKeyInfoConverter(ASN1ObjectIdentifier var1, AsymKeyInfoConverter var2);
}
