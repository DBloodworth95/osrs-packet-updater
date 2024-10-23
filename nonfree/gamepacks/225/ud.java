import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public final class ud {
   final long ae;
   RandomAccessFile ac;
   long ag;

   public ud(File var1, String var2, long var3) throws IOException {
      try {
         super();
         if (-1L == var3) {
            var3 = Long.MAX_VALUE;
         }

         if (var1.length() > var3) {
            var1.delete();
         }

         this.ac = new RandomAccessFile(var1, var2);
         this.ae = -8094624617882124197L * var3;
         this.ag = 0L;
         int var5 = this.ac.read();
         if (var5 != -1 && !var2.equals("r")) {
            this.ac.seek(0L);
            this.ac.write(var5);
         }

         this.ac.seek(0L);
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ud.<init>(" + ')');
      }
   }

   final void ac(long var1) throws IOException {
      try {
         this.ac.seek(var1);
         this.ag = 6369313450042263395L * var1;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ud.ac(" + ')');
      }
   }

   public final void ar(byte[] var1, int var2, int var3) throws IOException {
      if ((long)var3 + this.ag * -7936305649839852981L > this.ae * -5694585900024713261L) {
         this.ac.seek(this.ae * -5694585900024713261L);
         this.ac.write(1);
         throw new EOFException();
      } else {
         this.ac.write(var1, var2, var3);
         this.ag += (long)var3 * 6369313450042263395L;
      }
   }

   public final void ag(byte var1) throws IOException {
      try {
         this.am(false, (byte)-5);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ud.ag(" + ')');
      }
   }

   public final void am(boolean var1, byte var2) throws IOException {
      try {
         if (this.ac != null) {
            if (var2 >= -1) {
               throw new IllegalStateException();
            }

            if (var1) {
               if (var2 >= -1) {
                  throw new IllegalStateException();
               }

               try {
                  this.ac.getFD().sync();
               } catch (SyncFailedException var4) {
               }
            }

            this.ac.close();
            this.ac = null;
         }

      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ud.am(" + ')');
      }
   }

   public final long ax(int var1) throws IOException {
      try {
         return this.ac.length();
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ud.ax(" + ')');
      }
   }

   public final int aq(byte[] var1, int var2, int var3, byte var4) throws IOException {
      try {
         int var5 = this.ac.read(var1, var2, var3);
         if (var5 > 0) {
            if (var4 != 0) {
               throw new IllegalStateException();
            }

            this.ag += 6369313450042263395L * (long)var5;
         }

         return var5;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ud.aq(" + ')');
      }
   }

   protected void finalize() throws Throwable {
      try {
         if (null != this.ac) {
            System.out.println("");
            this.ag((byte)-25);
         }

      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ud.finalize(" + ')');
      }
   }

   protected void qa() throws Throwable {
      if (null != this.ac) {
         System.out.println("");
         this.ag((byte)-128);
      }

   }

   protected void qh() throws Throwable {
      if (null != this.ac) {
         System.out.println("");
         this.ag((byte)-36);
      }

   }

   public final void ad() throws IOException {
      this.am(false, (byte)-16);
   }

   public final void ae(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if ((long)var3 + this.ag * -7936305649839852981L > this.ae * -5694585900024713261L) {
            this.ac.seek(this.ae * -5694585900024713261L);
            this.ac.write(1);
            throw new EOFException();
         } else {
            this.ac.write(var1, var2, var3);
            this.ag += (long)var3 * 6369313450042263395L;
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ud.ae(" + ')');
      }
   }

   public final void ap() throws IOException {
      this.am(false, (byte)-39);
   }

   public final void au(byte[] var1, int var2, int var3) throws IOException {
      if ((long)var3 + this.ag * -7936305649839852981L > this.ae * -5694585900024713261L) {
         this.ac.seek(this.ae * -5694585900024713261L);
         this.ac.write(1);
         throw new EOFException();
      } else {
         this.ac.write(var1, var2, var3);
         this.ag += (long)var3 * 6369313450042263395L;
      }
   }

   public final int ai(byte[] var1, int var2, int var3) throws IOException {
      int var4 = this.ac.read(var1, var2, var3);
      if (var4 > 0) {
         this.ag += 6369313450042263395L * (long)var4;
      }

      return var4;
   }

   public final void al() throws IOException {
      this.am(false, (byte)-86);
   }

   public final void ah() throws IOException {
      this.am(false, (byte)-77);
   }

   protected void qj() throws Throwable {
      if (null != this.ac) {
         System.out.println("");
         this.ag((byte)-25);
      }

   }

   public final void at(byte[] var1, int var2, int var3) throws IOException {
      if ((long)var3 + this.ag * -7936305649839852981L > this.ae * -5694585900024713261L) {
         this.ac.seek(this.ae * -5694585900024713261L);
         this.ac.write(1);
         throw new EOFException();
      } else {
         this.ac.write(var1, var2, var3);
         this.ag += (long)var3 * 6369313450042263395L;
      }
   }

   public final void ab(boolean var1) throws IOException {
      if (this.ac != null) {
         if (var1) {
            try {
               this.ac.getFD().sync();
            } catch (SyncFailedException var3) {
            }
         }

         this.ac.close();
         this.ac = null;
      }

   }

   public final void az(boolean var1) throws IOException {
      if (this.ac != null) {
         if (var1) {
            try {
               this.ac.getFD().sync();
            } catch (SyncFailedException var3) {
            }
         }

         this.ac.close();
         this.ac = null;
      }

   }

   public final int aa(byte[] var1, int var2, int var3) throws IOException {
      int var4 = this.ac.read(var1, var2, var3);
      if (var4 > 0) {
         this.ag += 6369313450042263395L * (long)var4;
      }

      return var4;
   }

   final void af(long var1) throws IOException {
      this.ac.seek(var1);
      this.ag = 6369313450042263395L * var1;
   }

   public final int ao(byte[] var1, int var2, int var3) throws IOException {
      int var4 = this.ac.read(var1, var2, var3);
      if (var4 > 0) {
         this.ag += 6369313450042263395L * (long)var4;
      }

      return var4;
   }

   public final int as(byte[] var1, int var2, int var3) throws IOException {
      int var4 = this.ac.read(var1, var2, var3);
      if (var4 > 0) {
         this.ag += 6369313450042263395L * (long)var4;
      }

      return var4;
   }
}
