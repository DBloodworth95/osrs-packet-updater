package org.bouncycastle.jcajce.provider.config;

import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;

public interface ProvConf {
   ECParameterSpec getEcImplicitlyCa();

   DHParameterSpec getDHDefaultParameters(int var1);

   Set getAcceptableNamedCurves();

   Map getAdditionalECParameters();
}
