package org.bouncycastle.util;

import java.security.PrivilegedAction;

final class Strings$1 implements PrivilegedAction {
   public String run() {
      return System.getProperty("line.separator");
   }
}
