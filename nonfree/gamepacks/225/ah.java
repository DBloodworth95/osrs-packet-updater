import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

class ah extends SSLSocket {
   // $FF: synthetic field
   final az this$0;
   // $FF: synthetic field
   final TlsClientProtocol val$tlsClientProtocol;
   // $FF: synthetic field
   final String val$host;
   Certificate[] ac;

   public InputStream ac() throws IOException {
      return this.val$tlsClientProtocol.getInputStream();
   }

   public InputStream getInputStream() throws IOException {
      try {
         return this.val$tlsClientProtocol.getInputStream();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ah.getInputStream(" + ')');
      }
   }

   public String[] bd() {
      return null;
   }

   public String[] getSupportedCipherSuites() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ah.getSupportedCipherSuites(" + ')');
      }
   }

   public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ah.addHandshakeCompletedListener(" + ')');
      }
   }

   public void ah(HandshakeCompletedListener var1) {
   }

   public String[] ay() {
      return null;
   }

   public String[] getEnabledProtocols() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ah.getEnabledProtocols(" + ')');
      }
   }

   public boolean getNeedClientAuth() {
      try {
         return false;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ah.getNeedClientAuth(" + ')');
      }
   }

   public SSLSession getSession() {
      try {
         return new ai(this);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ah.getSession(" + ')');
      }
   }

   public String[] bx() {
      return null;
   }

   public OutputStream getOutputStream() throws IOException {
      try {
         return this.val$tlsClientProtocol.getOutputStream();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ah.getOutputStream(" + ')');
      }
   }

   public boolean getUseClientMode() {
      try {
         return false;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ah.getUseClientMode(" + ')');
      }
   }

   public boolean getWantClientAuth() {
      try {
         return false;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ah.getWantClientAuth(" + ')');
      }
   }

   ah(az var1, TlsClientProtocol var2, String var3) {
      this.this$0 = var1;
      this.val$tlsClientProtocol = var2;
      this.val$host = var3;
   }

   public synchronized void close() throws IOException {
      try {
         this.val$tlsClientProtocol.close();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ah.close(" + ')');
      }
   }

   public void setEnabledCipherSuites(String[] var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ah.setEnabledCipherSuites(" + ')');
      }
   }

   public void bc(boolean var1) {
   }

   public void setNeedClientAuth(boolean var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ah.setNeedClientAuth(" + ')');
      }
   }

   public SSLSession ak() {
      return new ai(this);
   }

   public void setWantClientAuth(boolean var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ah.setWantClientAuth(" + ')');
      }
   }

   public boolean ab() {
      return false;
   }

   public void bu(String[] var1) {
   }

   public InputStream ae() throws IOException {
      return this.val$tlsClientProtocol.getInputStream();
   }

   public String[] getEnabledCipherSuites() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ah.getEnabledCipherSuites(" + ')');
      }
   }

   public synchronized void af() throws IOException {
      this.val$tlsClientProtocol.close();
   }

   public InputStream ax() throws IOException {
      return this.val$tlsClientProtocol.getInputStream();
   }

   public OutputStream aq() throws IOException {
      return this.val$tlsClientProtocol.getOutputStream();
   }

   public boolean getEnableSessionCreation() {
      try {
         return false;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ah.getEnableSessionCreation(" + ')');
      }
   }

   public void setEnableSessionCreation(boolean var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ah.setEnableSessionCreation(" + ')');
      }
   }

   public void setUseClientMode(boolean var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ah.setUseClientMode(" + ')');
      }
   }

   public synchronized void ar() throws IOException {
      this.val$tlsClientProtocol.close();
   }

   public void al(HandshakeCompletedListener var1) {
   }

   public void ad(HandshakeCompletedListener var1) {
   }

   public InputStream am() throws IOException {
      return this.val$tlsClientProtocol.getInputStream();
   }

   public String[] getSupportedProtocols() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ah.getSupportedProtocols(" + ')');
      }
   }

   public synchronized void at() throws IOException {
      this.val$tlsClientProtocol.close();
   }

   public void bi(HandshakeCompletedListener var1) {
   }

   public String[] aa() {
      return null;
   }

   public String[] ai() {
      return null;
   }

   public String[] ao() {
      return null;
   }

   public String[] as() {
      return null;
   }

   public String[] az() {
      return null;
   }

   public boolean aj() {
      return false;
   }

   public boolean av() {
      return false;
   }

   public boolean aw() {
      return false;
   }

   public SSLSession an() {
      return new ai(this);
   }

   public boolean ap() {
      return false;
   }

   public SSLSession bn() {
      return new ai(this);
   }

   public String[] bh() {
      return null;
   }

   public synchronized void au() throws IOException {
      this.val$tlsClientProtocol.close();
   }

   public void ch() throws IOException {
      this.val$tlsClientProtocol.connect(new ap(this));
   }

   public String[] bf() {
      return null;
   }

   public String[] bm() {
      return null;
   }

   public String[] bs() {
      return null;
   }

   public boolean bw() {
      return false;
   }

   public boolean ba() {
      return false;
   }

   public boolean bj() {
      return false;
   }

   public boolean bp() {
      return false;
   }

   public void by(HandshakeCompletedListener var1) {
   }

   public void bb(HandshakeCompletedListener var1) {
   }

   public void be(boolean var1) {
   }

   public void bg(boolean var1) {
   }

   public void bl(boolean var1) {
   }

   public void bz(String[] var1) {
   }

   public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ah.removeHandshakeCompletedListener(" + ')');
      }
   }

   public void br(String[] var1) {
   }

   public void bo(String[] var1) {
   }

   public void bv(String[] var1) {
   }

   public void bt(boolean var1) {
   }

   public void bq(boolean var1) {
   }

   public void bk(boolean var1) {
   }

   public void startHandshake() throws IOException {
      try {
         this.val$tlsClientProtocol.connect(new ap(this));
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ah.startHandshake(" + ')');
      }
   }

   public void cf() throws IOException {
      this.val$tlsClientProtocol.connect(new ap(this));
   }

   public void cn() throws IOException {
      this.val$tlsClientProtocol.connect(new ap(this));
   }

   public void setEnabledProtocols(String[] var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ah.setEnabledProtocols(" + ')');
      }
   }

   public InputStream ag() throws IOException {
      return this.val$tlsClientProtocol.getInputStream();
   }
}
