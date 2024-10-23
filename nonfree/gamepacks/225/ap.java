import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

class ap extends DefaultTlsClient {
   // $FF: synthetic field
   final ah this$1;

   public TlsAuthentication getAuthentication() throws IOException {
      try {
         return new ad(this);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ap.getAuthentication(" + ')');
      }
   }

   public Hashtable getClientExtensions() throws IOException {
      try {
         Hashtable var1 = super.getClientExtensions();
         if (null == var1) {
            var1 = new Hashtable();
         }

         byte[] var2 = this.this$1.val$host.getBytes();
         ByteArrayOutputStream var3 = new ByteArrayOutputStream();
         DataOutputStream var4 = new DataOutputStream(var3);
         var4.writeShort(3 + var2.length);
         var4.writeByte(0);
         var4.writeShort(var2.length);
         var4.write(var2);
         var4.close();
         var1.put(0, var3.toByteArray());
         return var1;
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ap.getClientExtensions(" + ')');
      }
   }

   ap(ah var1) {
      this.this$1 = var1;
   }

   public Hashtable ac() throws IOException {
      Hashtable var1 = super.getClientExtensions();
      if (null == var1) {
         var1 = new Hashtable();
      }

      byte[] var2 = this.this$1.val$host.getBytes();
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      DataOutputStream var4 = new DataOutputStream(var3);
      var4.writeShort(3 + var2.length);
      var4.writeByte(0);
      var4.writeShort(var2.length);
      var4.write(var2);
      var4.close();
      var1.put(0, var3.toByteArray());
      return var1;
   }

   public TlsAuthentication ae() throws IOException {
      return new ad(this);
   }

   public TlsAuthentication ag() throws IOException {
      return new ad(this);
   }
}
