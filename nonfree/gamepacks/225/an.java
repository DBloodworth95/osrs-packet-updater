import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

public class an extends bz {
   byte[] am;
   SourceDataLine ae;
   int ag;
   AudioFormat ac;

   protected void ab() {
      if (null != this.ae) {
         this.ae.close();
         this.ae = null;
      }

   }

   protected void ad() {
      int var1 = 256;
      if (aq) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.ap[var2];
         if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.am[2 * var2] = (byte)(var3 >> 8);
         this.am[2 * var2 + 1] = (byte)(var3 >> 16);
      }

      this.ae.write(this.am, 0, var1 << 1);
   }

   public void ae(int var1, int var2) throws LineUnavailableException {
      try {
         try {
            Info var10000 = new Info;
            AudioFormat var10003 = this.ac;
            byte var10005;
            if (aq) {
               if (var2 >= -101840701) {
                  throw new IllegalStateException();
               }

               var10005 = 2;
            } else {
               var10005 = 1;
            }

            var10000.<init>(SourceDataLine.class, var10003, var1 << var10005);
            Info var3 = var10000;
            this.ae = (SourceDataLine)AudioSystem.getLine(var3);
            this.ae.open();
            this.ae.start();
            this.ag = var1 * -740488523;
         } catch (LineUnavailableException var4) {
            if (bp.ae(var1, (short)-18159) != 1) {
               this.ae(at.ax(var1, 1885288890), -1554768890);
            } else {
               this.ae = null;
               throw var4;
            }
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "an.ae(" + ')');
      }
   }

   protected int ag(int var1) {
      try {
         int var10000 = 1227953053 * this.ag;
         int var10001 = this.ae.available();
         byte var10002;
         if (aq) {
            if (var1 >= 1767411997) {
               throw new IllegalStateException();
            }

            var10002 = 2;
         } else {
            var10002 = 1;
         }

         return var10000 - (var10001 >> var10002);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "an.ag(" + ')');
      }
   }

   protected void ah() {
      int var1 = 256;
      if (aq) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.ap[var2];
         if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.am[2 * var2] = (byte)(var3 >> 8);
         this.am[2 * var2 + 1] = (byte)(var3 >> 16);
      }

      this.ae.write(this.am, 0, var1 << 1);
   }

   protected void ax(int var1) {
      try {
         if (null != this.ae) {
            if (var1 >= 15136590) {
               throw new IllegalStateException();
            }

            this.ae.close();
            this.ae = null;
         }

      } catch (RuntimeException var2) {
         throw vk.ae(var2, "an.ax(" + ')');
      }
   }

   protected void aq(byte var1) {
      try {
         this.ae.flush();
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "an.aq(" + ')');
      }
   }

   public void af() {
      this.ac = new AudioFormat((float)(ax * -1578400357), 16, aq ? 2 : 1, true, false);
      this.am = new byte[-1614124541 << (aq ? 2 : 1)];
   }

   public void at(int var1) throws LineUnavailableException {
      try {
         Info var2 = new Info(SourceDataLine.class, this.ac, var1 << (aq ? 2 : 1));
         this.ae = (SourceDataLine)AudioSystem.getLine(var2);
         this.ae.open();
         this.ae.start();
         this.ag = var1 * 1907818132;
      } catch (LineUnavailableException var3) {
         if (bp.ae(var1, (short)7773) != 1) {
            this.ae(at.ax(var1, 1741132797), -1471196755);
         } else {
            this.ae = null;
            throw var3;
         }
      }
   }

   public void au(int var1) throws LineUnavailableException {
      try {
         Info var2 = new Info(SourceDataLine.class, this.ac, var1 << (aq ? 2 : 1));
         this.ae = (SourceDataLine)AudioSystem.getLine(var2);
         this.ae.open();
         this.ae.start();
         this.ag = var1 * -740488523;
      } catch (LineUnavailableException var3) {
         if (bp.ae(var1, (short)-2969) != 1) {
            this.ae(at.ax(var1, 1066220505), -2011238112);
         } else {
            this.ae = null;
            throw var3;
         }
      }
   }

   protected int ar() {
      return 1227953053 * this.ag - (this.ae.available() >> (aq ? 2 : 1));
   }

   protected int al() {
      return 1227953053 * this.ag - (this.ae.available() >> (aq ? 2 : 1));
   }

   protected void ap() {
      int var1 = 256;
      if (aq) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.ap[var2];
         if ((var3 + 8388608 & 262870347) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.am[2 * var2] = (byte)(var3 >> 8);
         this.am[2 * var2 + 1] = (byte)(var3 >> 16);
      }

      this.ae.write(this.am, 0, var1 << 1);
   }

   protected void am() {
      int var1 = 256;
      if (aq) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.ap[var2];
         if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.am[2 * var2] = (byte)(var3 >> 8);
         this.am[2 * var2 + 1] = (byte)(var3 >> 16);
      }

      this.ae.write(this.am, 0, var1 << 1);
   }

   protected void ao() {
      this.ae.flush();
   }

   an() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "an.<init>(" + ')');
      }
   }

   protected void az() {
      if (null != this.ae) {
         this.ae.close();
         this.ae = null;
      }

   }

   protected void aa() {
      this.ae.flush();
   }

   protected void ai() {
      this.ae.flush();
   }

   public void ac(int var1) {
      try {
         AudioFormat var10001 = new AudioFormat;
         float var10003 = (float)(ax * -1578400357);
         byte var10005;
         if (aq) {
            if (var1 != 553204875) {
               throw new IllegalStateException();
            }

            var10005 = 2;
         } else {
            var10005 = 1;
         }

         var10001.<init>(var10003, 16, var10005, true, false);
         this.ac = var10001;
         byte var10002;
         if (aq) {
            if (var1 != 553204875) {
               return;
            }

            var10002 = 2;
         } else {
            var10002 = 1;
         }

         this.am = new byte[256 << var10002];
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "an.ac(" + ')');
      }
   }
}
