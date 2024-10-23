package org.bouncycastle.math.ec.endo;

import org.bouncycastle.math.ec.ECPointMap;

public interface ECEndomorphism {
   boolean hasEfficientPointMap();

   ECPointMap getPointMap();
}
