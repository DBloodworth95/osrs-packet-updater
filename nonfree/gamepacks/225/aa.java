import java.io.File;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class aa implements ThreadFactory {
   // $FF: synthetic field
   final ab this$0;
   final ThreadGroup ac;
   final AtomicInteger ae;
   static po ag;
   static final int dc = 128;
   public static final int ap = 46;
   static iw qc;
   static final long ah = -3932672073523589310L;

   public Thread ae(Runnable var1) {
      Thread var2 = new Thread(this.ac, var1, this.this$0.ae + "-rest-request-" + this.ae.getAndIncrement(), 0L);
      var2.setDaemon(true);
      var2.setPriority(5);
      return var2;
   }

   public Thread newThread(Runnable var1) {
      try {
         Thread var2 = new Thread(this.ac, var1, this.this$0.ae + "-rest-request-" + this.ae.getAndIncrement(), 0L);
         var2.setDaemon(true);
         var2.setPriority(5);
         return var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "aa.newThread(" + ')');
      }
   }

   public Thread ac(Runnable var1) {
      Thread var2 = new Thread(this.ac, var1, this.this$0.ae + "-rest-request-" + this.ae.getAndIncrement(), 0L);
      var2.setDaemon(true);
      var2.setPriority(5);
      return var2;
   }

   static String am(vf var0, int var1, short var2) {
      try {
         try {
            int var3 = var0.ck((byte)42);
            if (var3 > var1) {
               if (var2 == 4032) {
                  throw new IllegalStateException();
               }

               var3 = var1;
            }

            byte[] var4 = new byte[var3];
            var0.au += ot.ac.ae(var0.at, var0.au * -1027766515, var4, 0, var3, (byte)42) * -1864458299;
            String var5 = gq.af(var4, 0, var3, -1395495649);
            return var5;
         } catch (Exception var6) {
            return "Cabbage";
         }
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "aa.am(" + ')');
      }
   }

   public Thread ag(Runnable var1) {
      Thread var2 = new Thread(this.ac, var1, this.this$0.ae + "-rest-request-" + this.ae.getAndIncrement(), 0L);
      var2.setDaemon(true);
      var2.setPriority(5);
      return var2;
   }

   aa(ab var1) {
      try {
         this.this$0 = var1;
         super();
         this.ae = new AtomicInteger(1);
         SecurityManager var2 = System.getSecurityManager();
         this.ac = null != var2 ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "aa.<init>(" + ')');
      }
   }

   static void ac(File var0, int var1) {
      try {
         iv.ae = var0;
         if (!iv.ae.exists()) {
            throw new RuntimeException("");
         } else {
            iv.ac = true;
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "aa.ac(" + ')');
      }
   }
}
