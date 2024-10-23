import java.util.Iterator;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class az implements ThreadFactory {
   final AtomicInteger aw;
   // $FF: synthetic field
   final ar this$0;
   final ThreadGroup ap;
   static final String he = "JX_REFRESH_TOKEN";
   static final int av = 33554432;

   public Thread newThread(Runnable var1) {
      try {
         Thread var2 = new Thread(this.ap, var1, this.this$0.aw + "-rest-request-" + this.aw.getAndIncrement(), 0L);
         var2.setDaemon(true);
         var2.setPriority(5);
         return var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "az.newThread(" + ')');
      }
   }

   public Thread ap(Runnable var1) {
      Thread var2 = new Thread(this.ap, var1, this.this$0.aw + "-rest-request-" + this.aw.getAndIncrement(), 0L);
      var2.setDaemon(true);
      var2.setPriority(5);
      return var2;
   }

   az(ar var1) {
      try {
         this.this$0 = var1;
         super();
         this.aw = new AtomicInteger(1);
         SecurityManager var2 = System.getSecurityManager();
         this.ap = null != var2 ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "az.<init>(" + ')');
      }
   }

   public Thread aw(Runnable var1) {
      Thread var2 = new Thread(this.ap, var1, this.this$0.aw + "-rest-request-" + this.aw.getAndIncrement(), 0L);
      var2.setDaemon(true);
      var2.setPriority(5);
      return var2;
   }

   static void ay(short var0) {
      try {
         da.ap.aj();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "az.ay(" + ')');
      }
   }

   public static void ak(int var0, int var1) {
      try {
         if (!mp.ay.isEmpty()) {
            Iterator var2 = mp.ay.iterator();

            while(var2.hasNext()) {
               if (var1 != -1330856186) {
                  throw new IllegalStateException();
               }

               no var3 = (no)var2.next();
               if (null == var3) {
                  if (var1 != -1330856186) {
                     throw new IllegalStateException();
                  }
               } else {
                  var3.aj = var0 * 1205448709;
               }
            }

            no var5 = (no)mp.ay.get(0);
            if (var5 != null) {
               if (var1 != -1330856186) {
                  throw new IllegalStateException();
               }

               if (var5.au != null) {
                  if (var1 != -1330856186) {
                     throw new IllegalStateException();
                  }

                  if (var5.au.af(925342469)) {
                     if (var1 != -1330856186) {
                        throw new IllegalStateException();
                     }

                     if (!var5.am) {
                        if (var1 != -1330856186) {
                           throw new IllegalStateException();
                        }

                        var5.au.ap(var0, (short)-3022);
                        var5.ai = (float)var0;
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "az.ak(" + ')');
      }
   }

   public static void ap(byte var0) {
      try {
         by.ap = new ps();
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "az.ap(" + ')');
      }
   }
}
