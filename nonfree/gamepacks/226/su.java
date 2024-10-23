public class su extends tn {
   public int ap;
   public wx aw;
   static int ps;
   public short ak;

   static final int ab(int var0, int var1, short var2) {
      try {
         int var3 = ej.az(var0 - 1, var1 - 1, -1884967028) + ej.az(1 + var0, var1 - 1, -1497317246) + ej.az(var0 - 1, 1 + var1, 849221323) + ej.az(1 + var0, 1 + var1, 1335530593);
         int var4 = ej.az(var0 - 1, var1, -504419817) + ej.az(var0 + 1, var1, -925640005) + ej.az(var0, var1 - 1, 1584585200) + ej.az(var0, 1 + var1, 355537853);
         int var5 = ej.az(var0, var1, 275869362);
         return var5 / 4 + var3 / 16 + var4 / 8;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "su.ab(" + ')');
      }
   }

   su(wx var1, int var2) {
      try {
         super();
         this.ap = (int)(ck.ap(-734440520) / 1000L) * -1521126341;
         this.aw = var1;
         this.ak = (short)var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "su.<init>(" + ')');
      }
   }
}
