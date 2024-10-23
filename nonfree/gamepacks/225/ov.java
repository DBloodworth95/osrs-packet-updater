import java.nio.ByteBuffer;

public class ov extends oe {
   ByteBuffer ac;
   static go az;

   byte[] at() {
      byte[] var1 = new byte[this.ac.capacity()];
      this.ac.position(0);
      this.ac.get(var1);
      return var1;
   }

   byte[] ae(int var1) {
      try {
         byte[] var2 = new byte[this.ac.capacity()];
         this.ac.position(0);
         this.ac.get(var2);
         return var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ov.ae(" + ')');
      }
   }

   public void ag(byte[] var1, byte var2) {
      try {
         this.ac = ByteBuffer.allocateDirect(var1.length);
         this.ac.position(0);
         this.ac.put(var1);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ov.ag(" + ')');
      }
   }

   byte[] aq() {
      byte[] var1 = new byte[this.ac.capacity()];
      this.ac.position(0);
      this.ac.get(var1);
      return var1;
   }

   byte[] af() {
      byte[] var1 = new byte[this.ac.capacity()];
      this.ac.position(0);
      this.ac.get(var1);
      return var1;
   }

   public ov() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ov.<init>(" + ')');
      }
   }

   byte[] au() {
      byte[] var1 = new byte[this.ac.capacity()];
      this.ac.position(0);
      this.ac.get(var1);
      return var1;
   }

   public void ar(byte[] var1) {
      this.ac = ByteBuffer.allocateDirect(var1.length);
      this.ac.position(0);
      this.ac.put(var1);
   }

   public void ah(byte[] var1) {
      this.ac = ByteBuffer.allocateDirect(var1.length);
      this.ac.position(0);
      this.ac.put(var1);
   }

   public void ad(byte[] var1) {
      this.ac = ByteBuffer.allocateDirect(var1.length);
      this.ac.position(0);
      this.ac.put(var1);
   }

   public void al(byte[] var1) {
      this.ac = ByteBuffer.allocateDirect(var1.length);
      this.ac.position(0);
      this.ac.put(var1);
   }
}
