import java.util.Arrays;

public class kh implements bx {
   int at = 0;
   char[] ae = new char[128];
   int[] ag = new int[128];
   public int[] am = new int[128];
   int au = 0;
   int[] aq = new int[128];
   int af = 0;
   boolean[] al = new boolean[112];
   boolean[] ah = new boolean[112];
   int ar = 0;
   public int ax = 0;
   boolean[] ad = new boolean[112];
   static final int ac = 128;
   public char ap;
   public int ab;

   public final boolean aj() {
      if (this.ar * 706555067 == -1367415837 * this.at) {
         return false;
      } else {
         this.ab = this.ag[this.at * 330021868] * -528084561;
         this.ap = this.ae[this.at * -1367415837];
         this.at = (1 + 1125567169 * this.at & 127) * -946243125;
         return true;
      }
   }

   public boolean ac(int var1, int var2) {
      try {
         this.ah(var1, 2084513655);
         this.al[var1] = true;
         this.ad[var1] = true;
         this.ah[var1] = false;
         if (-1512297219 * this.ax < 128) {
            if (var2 == -826751702) {
               throw new IllegalStateException();
            }

            this.am[(this.ax += 1913540693) * -1512297219 - 1] = var1;
         }

         return true;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "kh.ac(" + ')');
      }
   }

   public boolean ae(int var1, int var2) {
      try {
         this.al[var1] = false;
         this.ad[var1] = false;
         this.ah[var1] = true;
         if (686608497 * this.af < 128) {
            if (var2 == 467058705) {
               throw new IllegalStateException();
            }

            this.aq[(this.af += -1347096431) * 686608497 - 1] = var1;
         }

         return true;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "kh.ae(" + ')');
      }
   }

   public boolean ag(char var1, int var2) {
      try {
         int var3 = 1 + 1760161195 * this.au & 127;
         if (this.at * -1367415837 != var3) {
            if (var2 >= 16711680) {
               throw new IllegalStateException();
            }

            this.ag[1760161195 * this.au] = -1;
            this.ae[this.au * 1760161195] = var1;
            this.au = var3 * 1010410755;
         }

         return false;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "kh.ag(" + ')');
      }
   }

   public boolean aq(int var1) {
      this.ah(var1, 2084513655);
      this.al[var1] = true;
      this.ad[var1] = true;
      this.ah[var1] = false;
      if (-1512297219 * this.ax < 128) {
         this.am[(this.ax += 1913540693) * -1512297219 - 1] = var1;
      }

      return true;
   }

   public boolean bf(int var1) {
      return var1 >= 0 && var1 < -115723741 ? this.ah[var1] : false;
   }

   public void ap(int var1) {
      try {
         this.at = 958050457 * this.ar;
         this.ar = -29032191 * this.au;
         this.ax = 0;
         this.af = 0;
         Arrays.fill(this.ad, false);
         Arrays.fill(this.ah, false);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "kh.ap(" + ')');
      }
   }

   public final boolean ab(byte var1) {
      try {
         if (this.ar * 915423915 == -1367415837 * this.at) {
            if (var1 >= 90) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            this.ab = this.ag[this.at * -1367415837] * -528084561;
            this.ap = this.ae[this.at * -1367415837];
            this.at = (1 + -1367415837 * this.at & 127) * -946243125;
            return true;
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "kh.ab(" + ')');
      }
   }

   public boolean az(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 == -700722345) {
               throw new IllegalStateException();
            }

            if (var1 < 112) {
               return this.ad[var1];
            }

            if (var2 == -700722345) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "kh.az(" + ')');
      }
   }

   public boolean aa(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 != 1770128204) {
               throw new IllegalStateException();
            }

            if (var1 < 112) {
               return this.al[var1];
            }

            if (var2 != 1770128204) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "kh.aa(" + ')');
      }
   }

   public boolean ai(int var1, byte var2) {
      try {
         if (var1 >= 0) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }

            if (var1 < 112) {
               return this.ah[var1];
            }

            if (var2 == 0) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "kh.ai(" + ')');
      }
   }

   public int[] ao(int var1) {
      try {
         int[] var2 = new int[this.ax * -1512297219];

         for(int var3 = 0; var3 < -1512297219 * this.ax; ++var3) {
            var2[var3] = this.am[var3];
         }

         return var2;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "kh.ao(" + ')');
      }
   }

   public boolean an(int var1) {
      return var1 >= 0 && var1 < 112 ? this.ad[var1] : false;
   }

   public boolean ax(int var1) {
      this.ah(var1, 2084513655);
      this.al[var1] = true;
      this.ad[var1] = true;
      this.ah[var1] = false;
      if (-702856776 * this.ax < 128) {
         this.am[(this.ax += 1118045297) * -1512297219 - 1] = var1;
      }

      return true;
   }

   public final boolean av() {
      if (this.ar * 915423915 == -1367415837 * this.at) {
         return false;
      } else {
         this.ab = this.ag[this.at * -1367415837] * -528084561;
         this.ap = this.ae[this.at * -1367415837];
         this.at = (1 + -1367415837 * this.at & 127) * -946243125;
         return true;
      }
   }

   public boolean au(int var1) {
      this.al[var1] = false;
      this.ad[var1] = false;
      this.ah[var1] = true;
      if (1025915714 * this.af < 128) {
         this.aq[(this.af += 1194625088) * 686608497 - 1] = var1;
      }

      return true;
   }

   public final boolean aw() {
      if (this.ar * 915423915 == -1367415837 * this.at) {
         return false;
      } else {
         this.ab = this.ag[this.at * 167286611] * -1561649659;
         this.ap = this.ae[this.at * 1589394064];
         this.at = (1 + 250736047 * this.at & 1360692393) * 798838574;
         return true;
      }
   }

   void ah(int var1, int var2) {
      try {
         int var3 = 1760161195 * this.au + 1 & 127;
         if (var3 != this.at * -1367415837) {
            this.ag[this.au * 1760161195] = var1;
            this.ae[1760161195 * this.au] = 0;
            this.au = 1010410755 * var3;
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "kh.ah(" + ')');
      }
   }

   public boolean ar(char var1) {
      int var2 = 1 + -1442033633 * this.au & 127;
      if (this.at * -1367415837 != var2) {
         this.ag[1760161195 * this.au] = -1;
         this.ae[this.au * -1600453613] = var1;
         this.au = var2 * 418205169;
      }

      return false;
   }

   public boolean al(boolean var1) {
      return false;
   }

   public boolean ad(boolean var1) {
      return false;
   }

   public void ay() {
      this.at = -237862774 * this.ar;
      this.ar = -29032191 * this.au;
      this.ax = 0;
      this.af = 0;
      Arrays.fill(this.ad, false);
      Arrays.fill(this.ah, false);
   }

   public boolean am(boolean var1, int var2) {
      try {
         return false;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "kh.am(" + ')');
      }
   }

   public int[] bj() {
      int[] var1 = new int[this.af * 686608497];

      for(int var2 = 0; var2 < this.af * 686608497; ++var2) {
         var1[var2] = this.aq[var2];
      }

      return var1;
   }

   public boolean at(int var1) {
      this.ah(var1, 2084513655);
      this.al[var1] = true;
      this.ad[var1] = true;
      this.ah[var1] = false;
      if (-1512297219 * this.ax < 128) {
         this.am[(this.ax += 1913540693) * -1512297219 - 1] = var1;
      }

      return true;
   }

   public boolean ak(int var1) {
      return var1 >= 0 && var1 < 112 ? this.ad[var1] : false;
   }

   public boolean bn(int var1) {
      return var1 >= 0 && var1 < 112 ? this.al[var1] : false;
   }

   public boolean bh(int var1) {
      return var1 >= 0 && var1 < -2024033023 ? this.al[var1] : false;
   }

   public boolean bd(int var1) {
      return var1 >= 0 && var1 < -1013046141 ? this.al[var1] : false;
   }

   public boolean bx(int var1) {
      return var1 >= 0 && var1 < 112 ? this.ah[var1] : false;
   }

   public int[] as(int var1) {
      try {
         int[] var2 = new int[this.af * 686608497];

         for(int var3 = 0; var3 < this.af * 686608497; ++var3) {
            if (var1 >= 1931189352) {
               throw new IllegalStateException();
            }

            var2[var3] = this.aq[var3];
         }

         return var2;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "kh.as(" + ')');
      }
   }

   public int[] bm() {
      int[] var1 = new int[this.ax * -1512297219];

      for(int var2 = 0; var2 < -1512297219 * this.ax; ++var2) {
         var1[var2] = this.am[var2];
      }

      return var1;
   }

   public int[] bs() {
      int[] var1 = new int[this.af * 686608497];

      for(int var2 = 0; var2 < this.af * 686608497; ++var2) {
         var1[var2] = this.aq[var2];
      }

      return var1;
   }

   public int[] bw() {
      int[] var1 = new int[this.af * 686608497];

      for(int var2 = 0; var2 < this.af * 686608497; ++var2) {
         var1[var2] = this.aq[var2];
      }

      return var1;
   }

   public int[] ba() {
      int[] var1 = new int[this.af * 686608497];

      for(int var2 = 0; var2 < this.af * 686608497; ++var2) {
         var1[var2] = this.aq[var2];
      }

      return var1;
   }

   public boolean af(int var1) {
      this.ah(var1, 2084513655);
      this.al[var1] = true;
      this.ad[var1] = true;
      this.ah[var1] = false;
      if (257512581 * this.ax < 812253658) {
         this.am[(this.ax += 1913540693) * -242633379 - 1] = var1;
      }

      return true;
   }

   static void ag(int var0, String var1, String var2, String var3, byte var4) {
      try {
         dl var5 = (dl)eo.ac.get(var0);
         if (null == var5) {
            var5 = new dl();
            eo.ac.put(var0, var5);
         }

         ct var6 = var5.ac(var0, var1, var2, var3, 1356260064);
         eo.ae.ae(var6, (long)(-1313413877 * var6.ac));
         eo.ag.ae(var6);
         client.qr = 775405337 * client.pf;
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "kh.ag(" + ')');
      }
   }
}
