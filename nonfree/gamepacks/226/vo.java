public class vo implements ph {
   static final vo aq = new vo(4194304);
   public static final vo aw = new vo(2);
   public static final vo ak = new vo(4);
   public static final vo bj = new vo(134217728);
   static final vo as = new vo(64, true);
   static final vo ay = new vo(32);
   static final vo ag = new vo(131072);
   static final vo ae = new vo(128);
   public static final vo am = new vo(256, true);
   static final vo an = new vo(2048);
   public static final vo au = new vo(1024);
   public static final vo aj = new vo(8);
   static final vo ao = new vo(4096);
   static final vo af = new vo(8192);
   static final vo bv = new vo(268435456);
   static final vo ax = new vo(2097152);
   public static final vo az = new vo(65536);
   static final vo at = new vo(512);
   static final vo ad = new vo(262144);
   public static final vo ap = new vo(1);
   static final vo av = new vo(1048576);
   static final vo ar = new vo(16384);
   static final vo ab = new vo(32768);
   static final vo al = new vo(8388608);
   static final vo aa = new vo(16777216);
   public static final vo ah = new vo(33554432);
   static final vo bh = new vo(67108864, true);
   static final vo ai = new vo(16);
   static final vo ac = new vo(524288);
   public static final vo bx = new vo(536870912, true);
   public static final vo bk = new vo(1073741824, true);
   static final vo bb = new vo(Integer.MIN_VALUE);
   final int bq;
   static final int cg = 30;

   vo(int var1, boolean var2) {
      try {
         super();
         this.bq = 1270487313 * var1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "vo.<init>(" + ')');
      }
   }

   public int aw(int var1) {
      try {
         return this.bq * -1246758927;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vo.aw(" + ')');
      }
   }

   vo(int var1) {
      try {
         this(var1, false);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "vo.<init>(" + ')');
      }
   }

   public int as() {
      return this.bq * 1301334098;
   }
}
