import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ae {
   ExecutorService ap;
   public static final int as = -1;
   final vl ak;
   final aj aj;
   Future aw;
   public static int[] ay;

   public vl ak(short var1) {
      try {
         try {
            return (vl)this.aw.get();
         } catch (Exception var3) {
            return null;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "ae.ak(" + ')');
      }
   }

   public boolean ap(byte var1) {
      try {
         return this.aw.isDone();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ae.ap(" + ')');
      }
   }

   public void aw(byte var1) {
      try {
         this.ap.shutdown();
         this.ap = null;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ae.aw(" + ')');
      }
   }

   void an() {
      this.aw = this.ap.submit(new aw(this, this.ak, this.aj));
   }

   static void aj(int var0) {
      try {
         try {
            File var1 = new File(hd.aq, "random.dat");
            int var3;
            if (var1.exists()) {
               if (var0 <= 989671036) {
                  return;
               }

               iq.an = new uj(new un(var1, "rw", 25L), 24, 0);
            } else {
               label52:
               for(int var2 = 0; var2 < hp.ag.length; ++var2) {
                  if (var0 <= 989671036) {
                     throw new IllegalStateException();
                  }

                  for(var3 = 0; var3 < gl.az.length; ++var3) {
                     File var4 = new File(gl.az[var3] + hp.ag[var2] + File.separatorChar + "random.dat");
                     if (var4.exists()) {
                        if (var0 <= 989671036) {
                           return;
                        }

                        iq.an = new uj(new un(var4, "rw", 25L), 24, 0);
                        break label52;
                     }
                  }
               }
            }

            if (iq.an == null) {
               if (var0 <= 989671036) {
                  throw new IllegalStateException();
               }

               RandomAccessFile var7 = new RandomAccessFile(var1, "rw");
               var3 = var7.read();
               var7.seek(0L);
               var7.write(var3);
               var7.seek(0L);
               var7.close();
               iq.an = new uj(new un(var1, "rw", 25L), 24, 0);
            }
         } catch (IOException var5) {
         }

      } catch (RuntimeException var6) {
         throw tm.aw(var6, "ae.aj(" + ')');
      }
   }

   public boolean ai() {
      return this.aw.isDone();
   }

   public boolean ay() {
      return this.aw.isDone();
   }

   public ae(vl var1, aj var2) {
      try {
         super();
         this.ap = Executors.newSingleThreadExecutor();
         this.ak = var1;
         this.aj = var2;
         this.aj((byte)-50);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ae.<init>(" + ')');
      }
   }

   public void ae() {
      this.ap.shutdown();
      this.ap = null;
   }

   public vl am() {
      try {
         return (vl)this.aw.get();
      } catch (Exception var2) {
         return null;
      }
   }

   public vl at() {
      try {
         return (vl)this.aw.get();
      } catch (Exception var2) {
         return null;
      }
   }

   public vl au() {
      try {
         return (vl)this.aw.get();
      } catch (Exception var2) {
         return null;
      }
   }

   void aj(byte var1) {
      try {
         this.aw = this.ap.submit(new aw(this, this.ak, this.aj));
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ae.aj(" + ')');
      }
   }

   void ao() {
      this.aw = this.ap.submit(new aw(this, this.ak, this.aj));
   }

   public void as() {
      this.ap.shutdown();
      this.ap = null;
   }
}
