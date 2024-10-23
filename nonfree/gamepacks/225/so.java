import java.io.IOException;
import java.net.Socket;

public class so extends sk {
   sm ag;
   sg ae;
   Socket ac;

   public int ao(byte[] var1, int var2, int var3) throws IOException {
      return this.ae.am(var1, var2, var3, -1975153875);
   }

   public boolean ae(int var1, int var2) throws IOException {
      try {
         return this.ae.ac(var1, 1218348313);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "so.ae(" + ')');
      }
   }

   public int ag(int var1) throws IOException {
      try {
         return this.ae.ae(78129653);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "so.ag(" + ')');
      }
   }

   public int am(int var1) throws IOException {
      try {
         return this.ae.ag(526151610);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "so.am(" + ')');
      }
   }

   public int as(byte[] var1, int var2, int var3) throws IOException {
      return this.ae.am(var1, var2, var3, -2007714863);
   }

   public void aq(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         this.ag.ae(var1, var2, var3, 829733649);
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "so.aq(" + ')');
      }
   }

   public int ax(byte[] var1, int var2, int var3, byte var4) throws IOException {
      try {
         return this.ae.am(var1, var2, var3, -2018351623);
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "so.ax(" + ')');
      }
   }

   protected void finalize() {
      try {
         this.af(2011680949);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "so.finalize(" + ')');
      }
   }

   protected void qa() {
      this.af(2011680949);
   }

   so(Socket var1, int var2, int var3) throws IOException {
      try {
         super();
         this.ac = var1;
         this.ac.setSoTimeout(30000);
         this.ac.setTcpNoDelay(true);
         this.ac.setReceiveBufferSize(65536);
         this.ac.setSendBufferSize(65536);
         this.ae = new sg(this.ac.getInputStream(), var2);
         this.ag = new sm(this.ac.getOutputStream(), var3);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "so.<init>(" + ')');
      }
   }

   protected void qh() {
      this.af(2011680949);
   }

   public int aa() throws IOException {
      return this.ae.ag(526151610);
   }

   public boolean ar(int var1) throws IOException {
      return this.ae.ac(var1, 976381730);
   }

   public void bx() {
      this.ag.ag(208401353);

      try {
         this.ac.close();
      } catch (IOException var2) {
      }

      this.ae.ax(-661985529);
   }

   public boolean ad(int var1) throws IOException {
      return this.ae.ac(var1, 633811294);
   }

   public int ah() throws IOException {
      return this.ae.ae(1797049486);
   }

   public int ap() throws IOException {
      return this.ae.ae(1476089810);
   }

   public void af(int var1) {
      try {
         this.ag.ag(-815794567);

         try {
            this.ac.close();
         } catch (IOException var3) {
         }

         this.ae.ax(-1761422191);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "so.af(" + ')');
      }
   }

   public int az() throws IOException {
      return this.ae.ae(756868719);
   }

   public void aw(byte[] var1, int var2, int var3) throws IOException {
      this.ag.ae(var1, var2, var3, -196131171);
   }

   public int ai() throws IOException {
      return this.ae.ag(526151610);
   }

   public boolean au(int var1) throws IOException {
      return this.ae.ac(var1, 1690346891);
   }

   public int ay(byte[] var1, int var2, int var3) throws IOException {
      return this.ae.am(var1, var2, var3, -1920704873);
   }

   public int ab() throws IOException {
      return this.ae.ae(1388185063);
   }

   public void aj(byte[] var1, int var2, int var3) throws IOException {
      this.ag.ae(var1, var2, var3, -194146132);
   }

   public void av(byte[] var1, int var2, int var3) throws IOException {
      this.ag.ae(var1, var2, var3, 184742406);
   }

   public boolean al(int var1) throws IOException {
      return this.ae.ac(var1, 471116823);
   }

   public void an(byte[] var1, int var2, int var3) throws IOException {
      this.ag.ae(var1, var2, var3, 1449409253);
   }

   public void ak(byte[] var1, int var2, int var3) throws IOException {
      this.ag.ae(var1, var2, var3, 188807954);
   }

   public void bn() {
      this.ag.ag(-2034632266);

      try {
         this.ac.close();
      } catch (IOException var2) {
      }

      this.ae.ax(-473928603);
   }

   public void bh() {
      this.ag.ag(1384862767);

      try {
         this.ac.close();
      } catch (IOException var2) {
      }

      this.ae.ax(-1018493429);
   }

   public void bd() {
      this.ag.ag(-1920357154);

      try {
         this.ac.close();
      } catch (IOException var2) {
      }

      this.ae.ax(-297165468);
   }

   protected void qj() {
      this.af(2011680949);
   }
}
