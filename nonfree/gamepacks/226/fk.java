import java.io.File;

public class fk extends fq {
   int ap;
   public static final int ay = 5;
   // $FF: synthetic field
   final fz this$0;
   boolean aw;
   static File aj;

   void ap(vl var1, int var2) {
      try {
         this.ap = var1.ce(1747929361) * -1566661035;
         boolean var10001;
         if (var1.cy((short)-16814) == 1) {
            if (var2 >= -1711321264) {
               throw new IllegalStateException();
            }

            var10001 = true;
         } else {
            var10001 = false;
         }

         this.aw = var10001;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "fk.ap(" + ')');
      }
   }

   void ak(vl var1) {
      this.ap = var1.ce(1380294614) * -1566661035;
      this.aw = var1.cy((short)-27773) == 1;
   }

   void aw(gy var1, int var2) {
      try {
         var1.af(this.ap * 225519357, this.aw, -270391795);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "fk.aw(" + ')');
      }
   }

   void ay(gy var1) {
      var1.af(this.ap * 225519357, this.aw, -270391795);
   }

   void aj(vl var1) {
      this.ap = var1.ce(1226345539) * -1566661035;
      this.aw = var1.cy((short)-24634) == 1;
   }

   void ai(gy var1) {
      var1.af(this.ap * 225519357, this.aw, -270391795);
   }

   fk(fz var1) {
      try {
         this.this$0 = var1;
         super();
         this.ap = 1566661035;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "fk.<init>(" + ')');
      }
   }

   static final void ne(int var0) {
      try {
         client.qt = client.pb * 1336316011;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "fk.ne(" + ')');
      }
   }
}
