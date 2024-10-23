import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public final class un {
   long ak;
   RandomAccessFile ap;
   static gy ab;
   static bd at;
   final long aw;

   public final void ak(int var1) throws IOException {
      try {
         this.aj(false, (byte)50);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "un.ak(" + ')');
      }
   }

   final void ap(long var1) throws IOException {
      try {
         this.ap.seek(var1);
         this.ak = 1479213839509687935L * var1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "un.ap(" + ')');
      }
   }

   public final void aw(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         if ((long)var3 + 2548150475102663039L * this.ak > -743394540507510341L * this.aw) {
            this.ap.seek(-743394540507510341L * this.aw);
            this.ap.write(1);
            throw new EOFException();
         } else {
            this.ap.write(var1, var2, var3);
            this.ak += 1479213839509687935L * (long)var3;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "un.aw(" + ')');
      }
   }

   public un(File var1, String var2, long var3) throws IOException {
      try {
         super();
         if (-1L == var3) {
            var3 = Long.MAX_VALUE;
         }

         if (var1.length() > var3) {
            var1.delete();
         }

         this.ap = new RandomAccessFile(var1, var2);
         this.aw = 3213316191059743603L * var3;
         this.ak = 0L;
         int var5 = this.ap.read();
         if (var5 != -1 && !var2.equals("r")) {
            this.ap.seek(0L);
            this.ap.write(var5);
         }

         this.ap.seek(0L);
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "un.<init>(" + ')');
      }
   }

   public final int ad(byte[] var1, int var2, int var3) throws IOException {
      int var4 = this.ap.read(var1, var2, var3);
      if (var4 > 0) {
         this.ak += (long)var4 * 1479213839509687935L;
      }

      return var4;
   }

   public final long ai(byte var1) throws IOException {
      try {
         return this.ap.length();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "un.ai(" + ')');
      }
   }

   public final int ay(byte[] var1, int var2, int var3, int var4) throws IOException {
      try {
         int var5 = this.ap.read(var1, var2, var3);
         if (var5 > 0) {
            this.ak += (long)var5 * 1479213839509687935L;
         }

         return var5;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "un.ay(" + ')');
      }
   }

   protected void finalize() throws Throwable {
      try {
         if (this.ap != null) {
            System.out.println("");
            this.ak(348234576);
         }

      } catch (RuntimeException var1) {
         throw tm.aw(var1, "un.finalize(" + ')');
      }
   }

   public final void at(byte[] var1, int var2, int var3) throws IOException {
      if ((long)var3 + 2548150475102663039L * this.ak > -743394540507510341L * this.aw) {
         this.ap.seek(-743394540507510341L * this.aw);
         this.ap.write(1);
         throw new EOFException();
      } else {
         this.ap.write(var1, var2, var3);
         this.ak += 1479213839509687935L * (long)var3;
      }
   }

   public final void an() throws IOException {
      this.aj(false, (byte)21);
   }

   final void ae(long var1) throws IOException {
      this.ap.seek(var1);
      this.ak = 1479213839509687935L * var1;
   }

   final void am(long var1) throws IOException {
      this.ap.seek(var1);
      this.ak = 1479213839509687935L * var1;
   }

   public final void ao() throws IOException {
      this.aj(false, (byte)73);
   }

   public final void au(byte[] var1, int var2, int var3) throws IOException {
      if ((long)var3 + 2548150475102663039L * this.ak > -743394540507510341L * this.aw) {
         this.ap.seek(-743394540507510341L * this.aw);
         this.ap.write(1);
         throw new EOFException();
      } else {
         this.ap.write(var1, var2, var3);
         this.ak += 1479213839509687935L * (long)var3;
      }
   }

   final void as(long var1) throws IOException {
      this.ap.seek(var1);
      this.ak = 1479213839509687935L * var1;
   }

   public final void aj(boolean var1, byte var2) throws IOException {
      try {
         if (null != this.ap) {
            if (var2 <= 8) {
               throw new IllegalStateException();
            }

            if (var1) {
               if (var2 <= 8) {
                  return;
               }

               try {
                  this.ap.getFD().sync();
               } catch (SyncFailedException var4) {
               }
            }

            this.ap.close();
            this.ap = null;
         }

      } catch (RuntimeException var5) {
         throw tm.aw(var5, "un.aj(" + ')');
      }
   }

   public final void af() throws IOException {
      this.aj(false, (byte)20);
   }

   public final void ar(boolean var1) throws IOException {
      if (null != this.ap) {
         if (var1) {
            try {
               this.ap.getFD().sync();
            } catch (SyncFailedException var3) {
            }
         }

         this.ap.close();
         this.ap = null;
      }

   }

   public final void ab(boolean var1) throws IOException {
      if (null != this.ap) {
         if (var1) {
            try {
               this.ap.getFD().sync();
            } catch (SyncFailedException var3) {
            }
         }

         this.ap.close();
         this.ap = null;
      }

   }

   public final long az() throws IOException {
      return this.ap.length();
   }

   public final long ag() throws IOException {
      return this.ap.length();
   }

   protected void ph() throws Throwable {
      if (this.ap != null) {
         System.out.println("");
         this.ak(379059950);
      }

   }

   public final int ac(byte[] var1, int var2, int var3) throws IOException {
      int var4 = this.ap.read(var1, var2, var3);
      if (var4 > 0) {
         this.ak += (long)var4 * 1479213839509687935L;
      }

      return var4;
   }
}
