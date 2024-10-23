import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.security.Security;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.bouncycastle.crypto.tls.TlsClientProtocol;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class ab extends SSLSocketFactory {
   public static ab aw;
   SecureRandom ap;

   public Socket createSocket(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
      try {
         return null;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ab.createSocket(" + ')');
      }
   }

   public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
      try {
         if (var1 == null) {
            var1 = new Socket();
         }

         if (!var1.isConnected()) {
            var1.connect(new InetSocketAddress(var2, var3));
         }

         TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.ap);
         return this.ap(var2, var5, 49273);
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "ab.createSocket(" + ')');
      }
   }

   public String[] getDefaultCipherSuites() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ab.getDefaultCipherSuites(" + ')');
      }
   }

   public String[] getSupportedCipherSuites() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ab.getSupportedCipherSuites(" + ')');
      }
   }

   public Socket createSocket(String var1, int var2) throws IOException, UnknownHostException {
      try {
         return null;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ab.createSocket(" + ')');
      }
   }

   public Socket ak(Socket var1, String var2, int var3, boolean var4) throws IOException {
      if (var1 == null) {
         var1 = new Socket();
      }

      if (!var1.isConnected()) {
         var1.connect(new InetSocketAddress(var2, var3));
      }

      TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.ap);
      return this.ap(var2, var5, 49273);
   }

   public Socket createSocket(InetAddress var1, int var2) throws IOException {
      try {
         return null;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ab.createSocket(" + ')');
      }
   }

   public Socket aw(Socket var1, String var2, int var3, boolean var4) throws IOException {
      if (var1 == null) {
         var1 = new Socket();
      }

      if (!var1.isConnected()) {
         var1.connect(new InetSocketAddress(var2, var3));
      }

      TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.ap);
      return this.ap(var2, var5, 49273);
   }

   public Socket ar(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
      return null;
   }

   static {
      if (Security.getProvider("BC") == null) {
         Security.addProvider(new BouncyCastleProvider());
      }

   }

   public String[] ay() {
      return null;
   }

   public String[] ai() {
      return null;
   }

   SSLSocket ap(String var1, TlsClientProtocol var2, int var3) {
      try {
         return new ao(this, var2, var1);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ab.ap(" + ')');
      }
   }

   public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
      try {
         return null;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ab.createSocket(" + ')');
      }
   }

   public ab() {
      try {
         super();
         this.ap = new SecureRandom();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ab.<init>(" + ')');
      }
   }

   public String[] as() {
      return null;
   }

   public String[] ae() {
      return null;
   }

   public Socket am(String var1, int var2) throws IOException, UnknownHostException {
      return null;
   }

   public Socket at(InetAddress var1, int var2) throws IOException {
      return null;
   }

   public Socket au(InetAddress var1, int var2) throws IOException {
      return null;
   }

   public Socket an(InetAddress var1, int var2) throws IOException {
      return null;
   }

   public Socket ao(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
      return null;
   }

   public Socket af(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
      return null;
   }

   public Socket aj(Socket var1, String var2, int var3, boolean var4) throws IOException {
      if (var1 == null) {
         var1 = new Socket();
      }

      if (!var1.isConnected()) {
         var1.connect(new InetSocketAddress(var2, var3));
      }

      TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.ap);
      return this.ap(var2, var5, 49273);
   }

   public Socket ab(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
      return null;
   }

   SSLSocket az(String var1, TlsClientProtocol var2) {
      return new ao(this, var2, var1);
   }
}
