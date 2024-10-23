package org.bouncycastle.crypto.tls;

import java.io.IOException;

public class TlsFatalAlert extends IOException {
   static final long serialVersionUID = 3584313123679111168L;
   public short alertDescription;
   public Throwable alertCause;

   public short getAlertDescription() {
      return this.alertDescription;
   }

   public TlsFatalAlert(short var1, Throwable var2) {
      super(AlertDescription.getText(var1));
      this.alertDescription = var1;
      this.alertCause = var2;
   }

   public TlsFatalAlert(short var1) {
      this(var1, (Throwable)null);
   }

   public Throwable getCause() {
      return this.alertCause;
   }
}
