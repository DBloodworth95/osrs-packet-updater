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

public class az extends SSLSocketFactory {
   public static az ae;
   SecureRandom ac;

   public az() {
      try {
         super();
         this.ac = new SecureRandom();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "az.<init>(" + ')');
      }
   }

   public Socket ay(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
      return null;
   }

   public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
      try {
         if (var1 == null) {
            var1 = new Socket();
         }

         if (!var1.isConnected()) {
            var1.connect(new InetSocketAddress(var2, var3));
         }

         TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.ac);
         return this.ae(var2, var5, -832765734);
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "az.createSocket(" + ')');
      }
   }

   public Socket ao(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
      return null;
   }

   public String[] getSupportedCipherSuites() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "az.getSupportedCipherSuites(" + ')');
      }
   }

   public Socket createSocket(InetAddress var1, int var2) throws IOException {
      try {
         return null;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "az.createSocket(" + ')');
      }
   }

   public String[] au() {
      return null;
   }

   public Socket aj(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
      return null;
   }

   public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
      try {
         return null;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "az.createSocket(" + ')');
      }
   }

   public Socket createSocket(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
      try {
         return null;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "az.createSocket(" + ')');
      }
   }

   static {
      if (Security.getProvider("BC") == null) {
         Security.addProvider(new BouncyCastleProvider());
      }

   }

   static az ag() {
      if (null == ae) {
         ae = new az();
      }

      return ae;
   }

   static az am() {
      if (null == ae) {
         ae = new az();
      }

      return ae;
   }

   static az ax() {
      if (null == ae) {
         ae = new az();
      }

      return ae;
   }

   static az aq() {
      if (null == ae) {
         ae = new az();
      }

      return ae;
   }

   public Socket af(Socket var1, String var2, int var3, boolean var4) throws IOException {
      if (var1 == null) {
         var1 = new Socket();
      }

      if (!var1.isConnected()) {
         var1.connect(new InetSocketAddress(var2, var3));
      }

      TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.ac);
      return this.ae(var2, var5, -799993097);
   }

   SSLSocket ae(String var1, TlsClientProtocol var2, int var3) {
      try {
         return new ah(this, var2, var1);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "az.ae(" + ')');
      }
   }

   public Socket az(InetAddress var1, int var2) throws IOException {
      return null;
   }

   public String[] getDefaultCipherSuites() {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "az.getDefaultCipherSuites(" + ')');
      }
   }

   public String[] al() {
      return null;
   }

   public String[] ar() {
      return null;
   }

   static az ac(short var0) {
      try {
         if (null == ae) {
            if (var0 == 1536) {
               throw new IllegalStateException();
            }

            ae = new az();
         }

         return ae;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "az.ac(" + ')');
      }
   }

   public Socket ap(String var1, int var2) throws IOException, UnknownHostException {
      return null;
   }

   public Socket ab(String var1, int var2) throws IOException, UnknownHostException {
      return null;
   }

   public String[] at() {
      return null;
   }

   public Socket aa(InetAddress var1, int var2) throws IOException {
      return null;
   }

   public Socket ai(InetAddress var1, int var2) throws IOException {
      return null;
   }

   public String[] ad() {
      return null;
   }

   public Socket as(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
      return null;
   }

   public Socket createSocket(String var1, int var2) throws IOException, UnknownHostException {
      try {
         return null;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "az.createSocket(" + ')');
      }
   }

   public Socket ah(String var1, int var2) throws IOException, UnknownHostException {
      return null;
   }

   SSLSocket av(String var1, TlsClientProtocol var2) {
      return new ah(this, var2, var1);
   }

   SSLSocket aw(String var1, TlsClientProtocol var2) {
      return new ah(this, var2, var1);
   }
}
