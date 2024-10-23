import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;

class ag implements SSLSession {
   // $FF: synthetic field
   final ao this$1;

   public String bq() {
      throw new UnsupportedOperationException();
   }

   public int getApplicationBufferSize() {
      try {
         return 0;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ag.getApplicationBufferSize(" + ')');
      }
   }

   public Certificate[] aq() throws SSLPeerUnverifiedException {
      return this.this$1.ap;
   }

   public Principal bb() throws SSLPeerUnverifiedException {
      return null;
   }

   public byte[] getId() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ag.getId(" + ')');
      }
   }

   public long getLastAccessedTime() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ag.getLastAccessedTime(" + ')');
      }
   }

   public void bf(String var1, Object var2) {
      throw new UnsupportedOperationException();
   }

   public String[] bt() {
      throw new UnsupportedOperationException();
   }

   public int getPacketBufferSize() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ag.getPacketBufferSize(" + ')');
      }
   }

   public byte[] ae() {
      throw new UnsupportedOperationException();
   }

   public long an() {
      throw new UnsupportedOperationException();
   }

   public String getPeerHost() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ag.getPeerHost(" + ')');
      }
   }

   public int getPeerPort() {
      try {
         return 0;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ag.getPeerPort(" + ')');
      }
   }

   public void bm() {
      throw new UnsupportedOperationException();
   }

   public Object bn(String var1) {
      throw new UnsupportedOperationException();
   }

   public SSLSessionContext getSessionContext() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ag.getSessionContext(" + ')');
      }
   }

   public Object getValue(String var1) {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ag.getValue(" + ')');
      }
   }

   public String[] getValueNames() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ag.getValueNames(" + ')');
      }
   }

   public void invalidate() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ag.invalidate(" + ')');
      }
   }

   public boolean isValid() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ag.isValid(" + ')');
      }
   }

   public void putValue(String var1, Object var2) {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ag.putValue(" + ')');
      }
   }

   public void removeValue(String var1) {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ag.removeValue(" + ')');
      }
   }

   public int ap() {
      return 0;
   }

   public String aw() {
      throw new UnsupportedOperationException();
   }

   public String ak() {
      throw new UnsupportedOperationException();
   }

   public long aj() {
      throw new UnsupportedOperationException();
   }

   public long ai() {
      throw new UnsupportedOperationException();
   }

   public byte[] ay() {
      throw new UnsupportedOperationException();
   }

   public byte[] as() {
      throw new UnsupportedOperationException();
   }

   public void be(String var1) {
      throw new UnsupportedOperationException();
   }

   public byte[] am() {
      throw new UnsupportedOperationException();
   }

   public long at() {
      throw new UnsupportedOperationException();
   }

   public long au() {
      throw new UnsupportedOperationException();
   }

   public SSLSessionContext bz() {
      throw new UnsupportedOperationException();
   }

   public Certificate[] af() {
      throw new UnsupportedOperationException();
   }

   public Principal getLocalPrincipal() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ag.getLocalPrincipal(" + ')');
      }
   }

   public Certificate[] ar() {
      throw new UnsupportedOperationException();
   }

   public Principal ab() {
      throw new UnsupportedOperationException();
   }

   public Principal az() {
      throw new UnsupportedOperationException();
   }

   public long getCreationTime() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ag.getCreationTime(" + ')');
      }
   }

   public int ad() {
      throw new UnsupportedOperationException();
   }

   public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ag.getPeerCertificateChain(" + ')');
      }
   }

   public X509Certificate[] av() throws SSLPeerUnverifiedException {
      return null;
   }

   public X509Certificate[] ax() throws SSLPeerUnverifiedException {
      return null;
   }

   public Certificate[] al() throws SSLPeerUnverifiedException {
      return this.this$1.ap;
   }

   public String getProtocol() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ag.getProtocol(" + ')');
      }
   }

   public Certificate[] aa() throws SSLPeerUnverifiedException {
      return this.this$1.ap;
   }

   public Certificate[] ah() throws SSLPeerUnverifiedException {
      return this.this$1.ap;
   }

   public String bh() {
      throw new UnsupportedOperationException();
   }

   public String bj() {
      throw new UnsupportedOperationException();
   }

   public int bv() {
      return 0;
   }

   public int bx() {
      return 0;
   }

   public Principal bk() throws SSLPeerUnverifiedException {
      return null;
   }

   ag(ao var1) {
      this.this$1 = var1;
   }

   public Principal ag() {
      throw new UnsupportedOperationException();
   }

   public SSLSessionContext bp() {
      throw new UnsupportedOperationException();
   }

   public Object bu(String var1) {
      throw new UnsupportedOperationException();
   }

   public boolean bi() {
      throw new UnsupportedOperationException();
   }

   public Object by(String var1) {
      throw new UnsupportedOperationException();
   }

   public boolean bw() {
      throw new UnsupportedOperationException();
   }

   public Object br(String var1) {
      throw new UnsupportedOperationException();
   }

   public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
      try {
         return null;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ag.getPeerPrincipal(" + ')');
      }
   }

   public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
      try {
         return this.this$1.ap;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ag.getPeerCertificates(" + ')');
      }
   }

   public void bs() {
      throw new UnsupportedOperationException();
   }

   public Certificate[] getLocalCertificates() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ag.getLocalCertificates(" + ')');
      }
   }

   public void bo() {
      throw new UnsupportedOperationException();
   }

   public void bd() {
      throw new UnsupportedOperationException();
   }

   public boolean ba() {
      throw new UnsupportedOperationException();
   }

   public String getCipherSuite() {
      try {
         throw new UnsupportedOperationException();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ag.getCipherSuite(" + ')');
      }
   }

   public void bg(String var1, Object var2) {
      throw new UnsupportedOperationException();
   }

   public int ac() {
      throw new UnsupportedOperationException();
   }

   public SSLSessionContext bc() {
      throw new UnsupportedOperationException();
   }

   public long ao() {
      throw new UnsupportedOperationException();
   }

   public void bl(String var1) {
      throw new UnsupportedOperationException();
   }

   public void cq(String var1) {
      throw new UnsupportedOperationException();
   }
}
