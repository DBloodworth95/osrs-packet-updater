public class fy extends fq {
   byte aw;
   public static final int ae = 7;
   // $FF: synthetic field
   final fz this$0;
   int ap;
   public static final int ay = 512;
   static final int az = 19;

   void aw(gy var1, int var2) {
      try {
         var1.an(this.ap * 531673615, this.aw, -1081239449);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "fy.aw(" + ')');
      }
   }

   void ap(vl var1, int var2) {
      try {
         this.ap = var1.ce(1036168229) * -1878131473;
         this.aw = var1.cu((byte)13);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "fy.ap(" + ')');
      }
   }

   void aj(vl var1) {
      this.ap = var1.ce(1299712738) * -1878131473;
      this.aw = var1.cu((byte)13);
   }

   void ak(vl var1) {
      this.ap = var1.ce(1388156534) * -1878131473;
      this.aw = var1.cu((byte)13);
   }

   void ai(gy var1) {
      var1.an(this.ap * -362966124, this.aw, -1081239449);
   }

   fy(fz var1) {
      try {
         this.this$0 = var1;
         super();
         this.ap = 1878131473;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "fy.<init>(" + ')');
      }
   }

   void ay(gy var1) {
      var1.an(this.ap * 531673615, this.aw, -1081239449);
   }

   static void os(byte[] var0, int var1, int var2) {
      try {
         if (null == client.hz) {
            client.hz = new byte[24];
         }

         rb.ap(var0, var1, client.hz, 0, 24);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "fy.os(" + ')');
      }
   }
}
