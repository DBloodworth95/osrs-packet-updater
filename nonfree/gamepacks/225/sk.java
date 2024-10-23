import java.io.IOException;
import java.net.Socket;

public abstract class sk {
   static int au;

   public abstract void ak(byte[] var1, int var2, int var3) throws IOException;

   public abstract void bh();

   public abstract void av(byte[] var1, int var2, int var3) throws IOException;

   public abstract int am(int var1) throws IOException;

   public abstract int ax(byte[] var1, int var2, int var3, byte var4) throws IOException;

   public abstract void bx();

   public abstract void af(int var1);

   public static sk at(Socket var0, int var1, int var2) throws IOException {
      return new so(var0, var1, var2);
   }

   public abstract boolean au(int var1) throws IOException;

   public abstract boolean ar(int var1) throws IOException;

   public abstract boolean al(int var1) throws IOException;

   public abstract boolean ad(int var1) throws IOException;

   public abstract int ab() throws IOException;

   public abstract int ap() throws IOException;

   public abstract boolean ae(int var1, int var2) throws IOException;

   public abstract int az() throws IOException;

   public abstract int ao(byte[] var1, int var2, int var3) throws IOException;

   public abstract int ah() throws IOException;

   public abstract void an(byte[] var1, int var2, int var3) throws IOException;

   public abstract int as(byte[] var1, int var2, int var3) throws IOException;

   public abstract int ay(byte[] var1, int var2, int var3) throws IOException;

   public abstract void aj(byte[] var1, int var2, int var3) throws IOException;

   public abstract int aa() throws IOException;

   public abstract void aw(byte[] var1, int var2, int var3) throws IOException;

   sk() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "sk.<init>(" + ')');
      }
   }

   public abstract void aq(byte[] var1, int var2, int var3, int var4) throws IOException;

   public abstract void bn();

   public abstract int ai() throws IOException;

   public abstract void bd();

   public abstract int ag(int var1) throws IOException;
}
