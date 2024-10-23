import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ab {
   final ThreadFactory ag;
   static final String au = "main_file_cache.idx255";
   final int ac;
   final ThreadPoolExecutor am;
   static final int bp = 51;
   static final int br = 1007;
   final String ae;
   static final int by = 13;

   final ThreadPoolExecutor aq(int var1) {
      return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(2057071518 * this.ac), this.ag);
   }

   final ThreadPoolExecutor ac(int var1, int var2) {
      try {
         return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(-1404055227 * this.ac), this.ag);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ab.ac(" + ')');
      }
   }

   public ao ae(al var1, byte var2) {
      try {
         if (this.am.getQueue().remainingCapacity() <= 0) {
            if (var2 != 5) {
               throw new IllegalStateException();
            } else {
               System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.am.getCorePoolSize() + " Queue capacity " + this.ac * -1404055227);
               return new ao("Queue full");
            }
         } else {
            ao var3 = new ao(this.am.submit(new as(this, var1)));
            return var3;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ab.ae(" + ')');
      }
   }

   public final void ag(int var1) {
      try {
         try {
            this.am.shutdown();
         } catch (Exception var3) {
            System.err.println("Error shutting down RestRequestService\r\n" + var3);
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ab.ag(" + ')');
      }
   }

   final ThreadPoolExecutor am(int var1) {
      return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(-1404055227 * this.ac), this.ag);
   }

   public final void al() {
      try {
         this.am.shutdown();
      } catch (Exception var2) {
         System.err.println("Error shutting down RestRequestService\r\n" + var2);
      }

   }

   public ao af(al var1) {
      if (this.am.getQueue().remainingCapacity() <= 0) {
         System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.am.getCorePoolSize() + " Queue capacity " + this.ac * -1404055227);
         return new ao("Queue full");
      } else {
         ao var2 = new ao(this.am.submit(new as(this, var1)));
         return var2;
      }
   }

   final ThreadPoolExecutor ax(int var1) {
      return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(-1404055227 * this.ac), this.ag);
   }

   public ao at(al var1) {
      if (this.am.getQueue().remainingCapacity() <= 0) {
         System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.am.getCorePoolSize() + " Queue capacity " + this.ac * 1311631703);
         return new ao("Queue full");
      } else {
         ao var2 = new ao(this.am.submit(new as(this, var1)));
         return var2;
      }
   }

   public ao au(al var1) {
      if (this.am.getQueue().remainingCapacity() <= 0) {
         System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.am.getCorePoolSize() + " Queue capacity " + this.ac * -1404055227);
         return new ao("Queue full");
      } else {
         ao var2 = new ao(this.am.submit(new as(this, var1)));
         return var2;
      }
   }

   public ab(String var1, int var2, int var3) {
      try {
         super();
         this.ae = var1;
         this.ac = 986847629 * var2;
         this.ag = new aa(this);
         this.am = this.ac(var3, -516769860);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ab.<init>(" + ')');
      }
   }

   public final void ar() {
      try {
         this.am.shutdown();
      } catch (Exception var2) {
         System.err.println("Error shutting down RestRequestService\r\n" + var2);
      }

   }

   static void pb(int var0, int var1) {
      try {
         client.lz = var0 * 372850215;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ab.pb(" + ')');
      }
   }

   static void am(int var0) {
      try {
         ud var1 = null;

         try {
            var1 = oh.ae("", mw.cm.af, true, (byte)125);
            vf var2 = re.vt.ae(-575897557);
            var1.ae(var2.at, 0, var2.au * -1027766515, 1173471924);
         } catch (Exception var4) {
         }

         try {
            if (var1 != null) {
               var1.am(true, (byte)-69);
            }
         } catch (Exception var3) {
         }

      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ab.am(" + ')');
      }
   }

   public static int ac(byte var0) {
      try {
         return -1277639787 * jy.ap;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ab.ac(" + ')');
      }
   }
}
