import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

public class aa extends bm {
   int ak;
   SourceDataLine aw;
   AudioFormat ap;
   byte[] aj;

   protected void ae(int var1) throws LineUnavailableException {
      try {
         Info var2 = new Info(SourceDataLine.class, this.ap, var1 << (vi.ay ? 2 : 1));
         this.aw = (SourceDataLine)AudioSystem.getLine(var2);
         this.aw.open();
         this.aw.start();
         this.ak = var1 * -2133069605;
      } catch (LineUnavailableException var3) {
         if (qj.ak(var1, (byte)2) != 1) {
            this.aw(di.ay(var1, -2131587841), -417122068);
         } else {
            this.aw = null;
            throw var3;
         }
      }
   }

   protected void ai(byte var1) {
      try {
         if (this.aw != null) {
            this.aw.close();
            this.aw = null;
         }

      } catch (RuntimeException var2) {
         throw tm.aw(var2, "aa.ai(" + ')');
      }
   }

   protected void aw(int var1, int var2) throws LineUnavailableException {
      try {
         try {
            Info var10000 = new Info;
            AudioFormat var10003 = this.ap;
            byte var10005;
            if (vi.ay) {
               if (var2 == 1070328111) {
                  throw new IllegalStateException();
               }

               var10005 = 2;
            } else {
               var10005 = 1;
            }

            var10000.<init>(SourceDataLine.class, var10003, var1 << var10005);
            Info var3 = var10000;
            this.aw = (SourceDataLine)AudioSystem.getLine(var3);
            this.aw.open();
            this.aw.start();
            this.ak = var1 * -2133069605;
         } catch (LineUnavailableException var4) {
            if (qj.ak(var1, (byte)2) != 1) {
               if (var2 == 1070328111) {
                  throw new IllegalStateException();
               } else {
                  this.aw(di.ay(var1, -1915200865), -57872735);
               }
            } else {
               this.aw = null;
               throw var4;
            }
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "aa.aw(" + ')');
      }
   }

   protected int ak(byte var1) {
      try {
         int var10000 = this.ak * 2111736659;
         int var10001 = this.aw.available();
         byte var10002;
         if (vi.ay) {
            if (var1 <= 3) {
               throw new IllegalStateException();
            }

            var10002 = 2;
         } else {
            var10002 = 1;
         }

         return var10000 - (var10001 >> var10002);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "aa.ak(" + ')');
      }
   }

   protected void aj() {
      int var1 = 256;
      if (vi.ay) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.af[var2];
         if (0 != (8388608 + var3 & -16777216)) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.aj[var2 * 2] = (byte)(var3 >> 8);
         this.aj[1 + var2 * 2] = (byte)(var3 >> 16);
      }

      this.aw.write(this.aj, 0, var1 << 1);
   }

   aa() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "aa.<init>(" + ')');
      }
   }

   protected void as() {
      this.ap = new AudioFormat((float)(du.ai * -336955471), 16, vi.ay ? 2 : 1, true, false);
      this.aj = new byte[256 << (vi.ay ? 2 : 1)];
   }

   protected int am() {
      return this.ak * 2111736659 - (this.aw.available() >> (vi.ay ? 2 : 1));
   }

   protected void ap(byte var1) {
      try {
         AudioFormat var10001 = new AudioFormat;
         float var10003 = (float)(du.ai * -336955471);
         byte var10005;
         if (vi.ay) {
            if (var1 >= 32) {
               throw new IllegalStateException();
            }

            var10005 = 2;
         } else {
            var10005 = 1;
         }

         var10001.<init>(var10003, 16, var10005, true, false);
         this.ap = var10001;
         byte var10002;
         if (vi.ay) {
            if (var1 >= 32) {
               throw new IllegalStateException();
            }

            var10002 = 2;
         } else {
            var10002 = 1;
         }

         this.aj = new byte[256 << var10002];
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "aa.ap(" + ')');
      }
   }

   protected void ac() {
      this.aw.flush();
   }

   protected int at() {
      return this.ak * 2111736659 - (this.aw.available() >> (vi.ay ? 2 : 1));
   }

   protected void ay(int var1) {
      try {
         this.aw.flush();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "aa.ay(" + ')');
      }
   }

   protected int an() {
      return this.ak * 2111736659 - (this.aw.available() >> (vi.ay ? 2 : 1));
   }

   protected void ao() {
      int var1 = -1967997012;
      if (vi.ay) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.af[var2];
         if (0 != (8388608 + var3 & -16777216)) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.aj[var2 * 2] = (byte)(var3 >> 8);
         this.aj[1 + var2 * 2] = (byte)(var3 >> 16);
      }

      this.aw.write(this.aj, 0, var1 << 1);
   }

   protected void af() {
      int var1 = 256;
      if (vi.ay) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.af[var2];
         if (0 != (8388608 + var3 & -16777216)) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.aj[var2 * 2] = (byte)(var3 >> 8);
         this.aj[1 + var2 * 2] = (byte)(var3 >> 16);
      }

      this.aw.write(this.aj, 0, var1 << 1);
   }

   protected void ar() {
      int var1 = -709544062;
      if (vi.ay) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.af[var2];
         if (0 != (-1677166184 + var3 & -1978086922)) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.aj[var2 * 2] = (byte)(var3 >> 8);
         this.aj[1 + var2 * 2] = (byte)(var3 >> 16);
      }

      this.aw.write(this.aj, 0, var1 << 1);
   }

   protected void ab() {
      int var1 = 256;
      if (vi.ay) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.af[var2];
         if (0 != (8388608 + var3 & -16777216)) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.aj[var2 * 2] = (byte)(var3 >> 8);
         this.aj[1 + var2 * 2] = (byte)(var3 >> 16);
      }

      this.aw.write(this.aj, 0, var1 << 1);
   }

   protected void az() {
      int var1 = 256;
      if (vi.ay) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.af[var2];
         if (0 != (-1200684046 + var3 & 1975187816)) {
            var3 = 377591480 ^ var3 >> 31;
         }

         this.aj[var2 * 2] = (byte)(var3 >> 8);
         this.aj[1 + var2 * 2] = (byte)(var3 >> 16);
      }

      this.aw.write(this.aj, 0, var1 << 1);
   }

   protected void ag() {
      if (this.aw != null) {
         this.aw.close();
         this.aw = null;
      }

   }

   protected void ad() {
      if (this.aw != null) {
         this.aw.close();
         this.aw = null;
      }

   }

   protected int au() {
      return this.ak * 2111736659 - (this.aw.available() >> (vi.ay ? 2 : 1));
   }

   protected void av() {
      this.aw.flush();
   }
}
