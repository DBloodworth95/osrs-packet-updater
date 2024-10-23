public class gl extends fq {
   static String[] az;
   // $FF: synthetic field
   final fz this$0;
   byte aw;
   byte aj;
   byte ai;
   byte ak;
   boolean ap;
   static or fc;
   static int af;
   static final int ag = 202;

   void ak(vl var1) {
      this.ap = var1.cy((short)-26006) == 1;
      this.aw = var1.cu((byte)13);
      this.ak = var1.cu((byte)13);
      this.aj = var1.cu((byte)13);
      this.ai = var1.cu((byte)13);
   }

   void ap(vl var1, int var2) {
      try {
         boolean var10001;
         if (var1.cy((short)-27481) == 1) {
            if (var2 >= -1711321264) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.ap = var10001;
         this.aw = var1.cu((byte)13);
         this.ak = var1.cu((byte)13);
         this.aj = var1.cu((byte)13);
         this.ai = var1.cu((byte)13);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "gl.ap(" + ')');
      }
   }

   gl(fz var1) {
      try {
         this.this$0 = var1;
         super();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "gl.<init>(" + ')');
      }
   }

   void aw(gy var1, int var2) {
      try {
         var1.ae = this.ap;
         var1.am = this.aw;
         var1.at = this.ak;
         var1.au = this.aj;
         var1.an = this.ai;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "gl.aw(" + ')');
      }
   }

   void aj(vl var1) {
      this.ap = var1.cy((short)-16126) == 1;
      this.aw = var1.cu((byte)13);
      this.ak = var1.cu((byte)13);
      this.aj = var1.cu((byte)13);
      this.ai = var1.cu((byte)13);
   }

   void ai(gy var1) {
      var1.ae = this.ap;
      var1.am = this.aw;
      var1.at = this.ak;
      var1.au = this.aj;
      var1.an = this.ai;
   }

   void ay(gy var1) {
      var1.ae = this.ap;
      var1.am = this.aw;
      var1.at = this.ak;
      var1.au = this.aj;
      var1.an = this.ai;
   }

   public static void as(byte var0) {
      try {
         hv.aw.aj();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "gl.as(" + ')');
      }
   }
}
