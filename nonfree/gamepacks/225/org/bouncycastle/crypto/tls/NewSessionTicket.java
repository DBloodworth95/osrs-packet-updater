package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class NewSessionTicket {
   public byte[] ticket;
   public long ticketLifetimeHint;

   public void encode(OutputStream var1) throws IOException {
      TlsUtils.writeUint32(this.ticketLifetimeHint, var1);
      TlsUtils.writeOpaque16(this.ticket, var1);
   }

   public long getTicketLifetimeHint() {
      return this.ticketLifetimeHint;
   }

   public NewSessionTicket(long var1, byte[] var3) {
      this.ticketLifetimeHint = var1;
      this.ticket = var3;
   }

   public byte[] getTicket() {
      return this.ticket;
   }

   public static NewSessionTicket parse(InputStream var0) throws IOException {
      long var1 = TlsUtils.readUint32(var0);
      byte[] var3 = TlsUtils.readOpaque16(var0);
      return new NewSessionTicket(var1, var3);
   }
}
