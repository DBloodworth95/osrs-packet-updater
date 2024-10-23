import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

class ao extends SSLSocket {
   Certificate[] ap;
   // $FF: synthetic field
   final TlsClientProtocol val$tlsClientProtocol;
   // $FF: synthetic field
   final String val$host;
   // $FF: synthetic field
   final ab this$0;

   public void be(boolean var1) {
   }

   public void bl(boolean var1) {
   }

   public OutputStream getOutputStream() throws IOException {
      try {
         return this.val$tlsClientProtocol.getOutputStream();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ao.getOutputStream(" + ')');
      }
   }

   public synchronized void close() throws IOException {
      try {
         this.val$tlsClientProtocol.close();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ao.close(" + ')');
      }
   }

   public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ao.addHandshakeCompletedListener(" + ')');
      }
   }

   public boolean getEnableSessionCreation() {
      try {
         return false;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ao.getEnableSessionCreation(" + ')');
      }
   }

   public String[] getEnabledCipherSuites() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ao.getEnabledCipherSuites(" + ')');
      }
   }

   public String[] getEnabledProtocols() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ao.getEnabledProtocols(" + ')');
      }
   }

   public boolean getNeedClientAuth() {
      try {
         return false;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ao.getNeedClientAuth(" + ')');
      }
   }

   public SSLSession getSession() {
      try {
         return new ag(this);
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ao.getSession(" + ')');
      }
   }

   public boolean bb() {
      return false;
   }

   public String[] getSupportedCipherSuites() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ao.getSupportedCipherSuites(" + ')');
      }
   }

   public void setEnabledCipherSuites(String[] var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ao.setEnabledCipherSuites(" + ')');
      }
   }

   public boolean getWantClientAuth() {
      try {
         return false;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ao.getWantClientAuth(" + ')');
      }
   }

   public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ao.removeHandshakeCompletedListener(" + ')');
      }
   }

   public void bm(String[] var1) {
   }

   public String[] ar() {
      return null;
   }

   public InputStream ap() throws IOException {
      return this.val$tlsClientProtocol.getInputStream();
   }

   public void setNeedClientAuth(boolean var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ao.setNeedClientAuth(" + ')');
      }
   }

   public void setUseClientMode(boolean var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ao.setUseClientMode(" + ')');
      }
   }

   public void bd(String[] var1) {
   }

   public String[] getSupportedProtocols() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ao.getSupportedProtocols(" + ')');
      }
   }

   public String[] az() {
      return null;
   }

   public InputStream aw() throws IOException {
      return this.val$tlsClientProtocol.getInputStream();
   }

   public InputStream ak() throws IOException {
      return this.val$tlsClientProtocol.getInputStream();
   }

   public InputStream aj() throws IOException {
      return this.val$tlsClientProtocol.getInputStream();
   }

   public String[] ag() {
      return null;
   }

   public OutputStream ay() throws IOException {
      return this.val$tlsClientProtocol.getOutputStream();
   }

   public OutputStream as() throws IOException {
      return this.val$tlsClientProtocol.getOutputStream();
   }

   public boolean bx() {
      return false;
   }

   public void startHandshake() throws IOException {
      try {
         this.val$tlsClientProtocol.connect(new af(this));
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ao.startHandshake(" + ')');
      }
   }

   public synchronized void at() throws IOException {
      this.val$tlsClientProtocol.close();
   }

   public void au(HandshakeCompletedListener var1) {
   }

   public void setEnableSessionCreation(boolean var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ao.setEnableSessionCreation(" + ')');
      }
   }

   public boolean ao() {
      return false;
   }

   public String[] af() {
      return null;
   }

   public boolean an() {
      return false;
   }

   public String[] ab() {
      return null;
   }

   public InputStream getInputStream() throws IOException {
      try {
         return this.val$tlsClientProtocol.getInputStream();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ao.getInputStream(" + ')');
      }
   }

   public void bs(String[] var1) {
   }

   public String[] ad() {
      return null;
   }

   ao(ab var1, TlsClientProtocol var2, String var3) {
      this.this$0 = var1;
      this.val$tlsClientProtocol = var2;
      this.val$host = var3;
   }

   public SSLSession av() {
      return new ag(this);
   }

   public String[] bh() {
      return null;
   }

   public SSLSession aq() {
      return new ag(this);
   }

   public SSLSession ax() {
      return new ag(this);
   }

   public String[] aa() {
      return null;
   }

   public String[] ah() {
      return null;
   }

   public SSLSession al() {
      return new ag(this);
   }

   public void bg(boolean var1) {
   }

   public boolean bq() {
      return false;
   }

   public void setEnabledProtocols(String[] var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ao.setEnabledProtocols(" + ')');
      }
   }

   public boolean bk() {
      return false;
   }

   public void setWantClientAuth(boolean var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ao.setWantClientAuth(" + ')');
      }
   }

   public boolean bv() {
      return false;
   }

   public void bp(HandshakeCompletedListener var1) {
   }

   public void bz(HandshakeCompletedListener var1) {
   }

   public void bc(HandshakeCompletedListener var1) {
   }

   public void by(boolean var1) {
   }

   public OutputStream ai() throws IOException {
      return this.val$tlsClientProtocol.getOutputStream();
   }

   public void bn(boolean var1) {
   }

   public void bu(boolean var1) {
   }

   public void br(boolean var1) {
   }

   public boolean getUseClientMode() {
      try {
         return false;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ao.getUseClientMode(" + ')');
      }
   }

   public boolean bj() {
      return false;
   }

   public void bo(String[] var1) {
   }

   public void bw(boolean var1) {
   }

   public void ba(boolean var1) {
   }

   public boolean ac() {
      return false;
   }

   public void bi(boolean var1) {
   }

   public void bf(boolean var1) {
   }

   public void bt(String[] var1) {
   }

   public synchronized void am() throws IOException {
      this.val$tlsClientProtocol.close();
   }

   public synchronized void ae() throws IOException {
      this.val$tlsClientProtocol.close();
   }

   public void cq() throws IOException {
      this.val$tlsClientProtocol.connect(new af(this));
   }

   public void cb() throws IOException {
      this.val$tlsClientProtocol.connect(new af(this));
   }
}
