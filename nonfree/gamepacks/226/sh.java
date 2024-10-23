import java.io.IOException;
import java.net.Socket;

public class sh extends sw {
   Socket ap;
   sm aw;
   sn ak;
   static final int au = -306674912;
   static final int ae = 10;

   public int ak(byte var1) throws IOException {
      try {
         return this.aw.aw(1414762953);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "sh.ak(" + ')');
      }
   }

   public boolean aw(int var1, byte var2) throws IOException {
      try {
         return this.aw.ap(var1, 344978588);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "sh.aw(" + ')');
      }
   }

   public int au() throws IOException {
      return this.aw.aw(1856889937);
   }

   public void ad() {
      this.ak.ak(-82129405);

      try {
         this.ap.close();
      } catch (IOException var2) {
      }

      this.aw.ai((byte)0);
   }

   public int ai(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         return this.aw.aj(var1, var2, var3, 2040884566);
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "sh.ai(" + ')');
      }
   }

   public int ab(byte[] var1, int var2, int var3) throws IOException {
      return this.aw.aj(var1, var2, var3, 2091351754);
   }

   public void as(int var1) {
      try {
         this.ak.ak(-82129405);

         try {
            this.ap.close();
         } catch (IOException var3) {
         }

         this.aw.ai((byte)0);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "sh.as(" + ')');
      }
   }

   protected void finalize() {
      try {
         this.as(-1410947176);
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "sh.finalize(" + ')');
      }
   }

   protected void ph() {
      this.as(1674655095);
   }

   public boolean ae(int var1) throws IOException {
      return this.aw.ap(var1, 344978588);
   }

   public boolean am(int var1) throws IOException {
      return this.aw.ap(var1, 344978588);
   }

   public boolean at(int var1) throws IOException {
      return this.aw.ap(var1, 344978588);
   }

   public void az() {
      this.ak.ak(-82129405);

      try {
         this.ap.close();
      } catch (IOException var2) {
      }

      this.aw.ai((byte)0);
   }

   public int an() throws IOException {
      return this.aw.ak(1477006988);
   }

   public int aj(byte var1) throws IOException {
      try {
         return this.aw.ak(1477006988);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "sh.aj(" + ')');
      }
   }

   public int af() throws IOException {
      return this.aw.ak(1477006988);
   }

   public int ar(byte[] var1, int var2, int var3) throws IOException {
      return this.aw.aj(var1, var2, var3, 1839981884);
   }

   public sh(Socket var1, int var2, int var3) throws IOException {
      try {
         super();
         this.ap = var1;
         this.ap.setSoTimeout(30000);
         this.ap.setTcpNoDelay(true);
         this.ap.setReceiveBufferSize(65536);
         this.ap.setSendBufferSize(65536);
         this.aw = new sm(this.ap.getInputStream(), var2);
         this.ak = new sn(this.ap.getOutputStream(), var3);
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "sh.<init>(" + ')');
      }
   }

   public void ay(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         this.ak.aw(var1, var2, var3, -768318470);
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "sh.ay(" + ')');
      }
   }

   public void ag() {
      this.ak.ak(-82129405);

      try {
         this.ap.close();
      } catch (IOException var2) {
      }

      this.aw.ai((byte)0);
   }

   public int ao() throws IOException {
      return this.aw.ak(1477006988);
   }

   public void ac(byte[] var1, int var2, int var3) throws IOException {
      this.ak.aw(var1, var2, var3, 1710535566);
   }
}
