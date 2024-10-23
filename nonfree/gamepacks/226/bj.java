import java.util.Arrays;

public class bj {
   static final int aj = 3;
   static final int aw = 1;
   static final int tv = 1024;
   public static final int ap = 0;
   int[] as;
   int[] ae;
   public static final int da = 103;
   public static final int ad = 35;
   static final int bx = 4;
   public static final int ag = 16;
   static final int ai = 4;

   boolean bs(int var1) {
      if (var1 >= 0 && var1 < 4) {
         return true;
      } else {
         System.out.println("Invalid mode: " + var1);
         return false;
      }
   }

   public void ap(int var1, int var2, byte var3) {
      try {
         if (this.am(var1, (short)-3694)) {
            if (var3 <= 20) {
               throw new IllegalStateException();
            }

            if (this.au(var2, -693952680)) {
               if (var3 <= 20) {
                  throw new IllegalStateException();
               }

               this.as[var1] = var2;
            }
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "bj.ap(" + ')');
      }
   }

   public boolean ay(char var1, byte var2) {
      try {
         boolean var10000;
         if (this.at(var1, -1147560933)) {
            label40: {
               if (this.ae[var1] != 1) {
                  if (var2 <= 124) {
                     throw new IllegalStateException();
                  }

                  if (3 != this.ae[var1]) {
                     break label40;
                  }

                  if (var2 <= 124) {
                     throw new IllegalStateException();
                  }
               }

               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "bj.ay(" + ')');
      }
   }

   public int ak(int var1, byte var2) {
      try {
         if (this.am(var1, (short)14539)) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            } else {
               return this.as[var1];
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "bj.ak(" + ')');
      }
   }

   public boolean bz(int var1) {
      return this.am(var1, (short)29600) && (this.as[var1] == 2 || this.as[var1] == 3);
   }

   public boolean ai(int var1, byte var2) {
      try {
         boolean var10000;
         label39: {
            if (this.am(var1, (short)2441)) {
               if (var2 == 32) {
                  throw new IllegalStateException();
               }

               if (this.as[var1] == 1) {
                  break label39;
               }

               if (var2 == 32) {
                  throw new IllegalStateException();
               }

               if (this.as[var1] == 3) {
                  if (var2 == 32) {
                     throw new IllegalStateException();
                  }
                  break label39;
               }
            }

            var10000 = false;
            return var10000;
         }

         var10000 = true;
         return var10000;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "bj.ai(" + ')');
      }
   }

   public void aw(char var1, int var2, short var3) {
      try {
         if (this.at(var1, -1147560933) && this.au(var2, -1447261537)) {
            if (var3 <= 6803) {
               throw new IllegalStateException();
            }

            this.ae[var1] = var2;
         }

      } catch (RuntimeException var4) {
         throw tm.aw(var4, "bj.aw(" + ')');
      }
   }

   public bj() {
      try {
         super();
         this.as = new int[112];
         this.ae = new int[192];
         Arrays.fill(this.as, 3);
         Arrays.fill(this.ae, 3);
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "bj.<init>(" + ')');
      }
   }

   public boolean ae(char var1, byte var2) {
      try {
         boolean var10000;
         label36: {
            if (this.at(var1, -1147560933)) {
               if (var2 <= 64) {
                  throw new IllegalStateException();
               }

               if (2 == this.ae[var1]) {
                  break label36;
               }

               if (this.ae[var1] == 3) {
                  if (var2 <= 64) {
                     throw new IllegalStateException();
                  }
                  break label36;
               }
            }

            var10000 = false;
            return var10000;
         }

         var10000 = true;
         return var10000;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "bj.ae(" + ')');
      }
   }

   boolean am(int var1, short var2) {
      try {
         if (var1 >= 0) {
            if (var2 == 16128) {
               throw new IllegalStateException();
            }

            if (var1 < 112) {
               return true;
            }

            if (var2 == 16128) {
               throw new IllegalStateException();
            }
         }

         System.out.println("Invalid keycode: " + var1);
         return false;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "bj.am(" + ')');
      }
   }

   boolean at(char var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 != -1147560933) {
               throw new IllegalStateException();
            }

            if (var1 < 192) {
               return true;
            }

            if (var2 != -1147560933) {
               throw new IllegalStateException();
            }
         }

         System.out.println("Invalid keychar: " + var1);
         return false;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "bj.at(" + ')');
      }
   }

   boolean au(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 == -910776713) {
               throw new IllegalStateException();
            }

            if (var1 < 4) {
               return true;
            }

            if (var2 == -910776713) {
               throw new IllegalStateException();
            }
         }

         System.out.println("Invalid mode: " + var1);
         return false;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "bj.au(" + ')');
      }
   }

   public int ax(char var1) {
      return this.at(var1, -1147560933) ? this.ae[var1] : 0;
   }

   public boolean bq(char var1) {
      return this.at(var1, -1147560933) && (this.ae[var1] == 1 || 3 == this.ae[var1]);
   }

   public void af(int var1, int var2) {
      if (this.am(var1, (short)-1616) && this.au(var2, -1900855912)) {
         this.as[var1] = var2;
      }

   }

   public void ag(char var1, int var2) {
      if (this.at(var1, -1147560933) && this.au(var2, -1305019557)) {
         this.ae[var1] = var2;
      }

   }

   boolean bu(char var1) {
      if (var1 >= 0 && var1 < 192) {
         return true;
      } else {
         System.out.println("Invalid keychar: " + var1);
         return false;
      }
   }

   public void az(char var1, int var2) {
      if (this.at(var1, -1147560933) && this.au(var2, -1092274118)) {
         this.ae[var1] = var2;
      }

   }

   public int av(int var1) {
      return this.am(var1, (short)9254) ? this.as[var1] : 0;
   }

   public int ad(int var1) {
      return this.am(var1, (short)-17718) ? this.as[var1] : 0;
   }

   public int ac(int var1) {
      return this.am(var1, (short)-14243) ? this.as[var1] : 0;
   }

   public void ao(int var1, int var2) {
      if (this.am(var1, (short)3278) && this.au(var2, -1966629305)) {
         this.as[var1] = var2;
      }

   }

   public void an(int var1, int var2) {
      if (this.am(var1, (short)-19088) && this.au(var2, 143482079)) {
         this.as[var1] = var2;
      }

   }

   boolean bd(int var1) {
      if (var1 >= 0 && var1 < 4) {
         return true;
      } else {
         System.out.println("Invalid mode: " + var1);
         return false;
      }
   }

   public int al(char var1) {
      return this.at(var1, -1147560933) ? this.ae[var1] : 0;
   }

   public int aa(char var1) {
      return this.at(var1, -1147560933) ? this.ae[var1] : 0;
   }

   public boolean ah(int var1) {
      return this.am(var1, (short)6610) && (this.as[var1] == 1 || this.as[var1] == 3);
   }

   public boolean bh(int var1) {
      return this.am(var1, (short)-23339) && (this.as[var1] == 1 || this.as[var1] == 3);
   }

   public boolean bj(int var1) {
      return this.am(var1, (short)-1750) && (this.as[var1] == 1 || this.as[var1] == 3);
   }

   public boolean bv(int var1) {
      return this.am(var1, (short)24666) && (this.as[var1] == 1 || this.as[var1] == 3);
   }

   public boolean bx(char var1) {
      return this.at(var1, -1147560933) && (this.ae[var1] == 1 || 3 == this.ae[var1]);
   }

   public boolean bk(char var1) {
      return this.at(var1, -1147560933) && (this.ae[var1] == 1 || 3 == this.ae[var1]);
   }

   public boolean bb(char var1) {
      return this.at(var1, -1147560933) && (this.ae[var1] == 1 || 3 == this.ae[var1]);
   }

   public void ar(int var1, int var2) {
      if (this.am(var1, (short)-18204) && this.au(var2, 1919121388)) {
         this.as[var1] = var2;
      }

   }

   public boolean bp(int var1) {
      return this.am(var1, (short)-905) && (this.as[var1] == 2 || this.as[var1] == 3);
   }

   public int aq(char var1) {
      return this.at(var1, -1147560933) ? this.ae[var1] : 0;
   }

   public boolean as(int var1, int var2) {
      try {
         boolean var10000;
         if (this.am(var1, (short)2494)) {
            label39: {
               if (var2 >= 1028319366) {
                  throw new IllegalStateException();
               }

               if (this.as[var1] != 2) {
                  if (var2 >= 1028319366) {
                     throw new IllegalStateException();
                  }

                  if (this.as[var1] != 3) {
                     break label39;
                  }
               }

               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "bj.as(" + ')');
      }
   }

   public boolean by(char var1) {
      return this.at(var1, -1147560933) && (2 == this.ae[var1] || this.ae[var1] == 3);
   }

   public boolean br(char var1) {
      return this.at(var1, -1147560933) && (2 == this.ae[var1] || this.ae[var1] == 3);
   }

   boolean bn(int var1) {
      if (var1 >= 0 && var1 < 112) {
         return true;
      } else {
         System.out.println("Invalid keycode: " + var1);
         return false;
      }
   }

   public boolean bc(char var1) {
      return this.at(var1, -1147560933) && (2 == this.ae[var1] || this.ae[var1] == 3);
   }

   boolean bt(char var1) {
      if (var1 >= 0 && var1 < 192) {
         return true;
      } else {
         System.out.println("Invalid keychar: " + var1);
         return false;
      }
   }

   public int aj(char var1, int var2) {
      try {
         if (this.at(var1, -1147560933)) {
            if (var2 == -1845497191) {
               throw new IllegalStateException();
            } else {
               return this.ae[var1];
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "bj.aj(" + ')');
      }
   }

   boolean bm(int var1) {
      if (var1 >= 0 && var1 < 4) {
         return true;
      } else {
         System.out.println("Invalid mode: " + var1);
         return false;
      }
   }

   boolean bo(int var1) {
      if (var1 >= 0 && var1 < 4) {
         return true;
      } else {
         System.out.println("Invalid mode: " + var1);
         return false;
      }
   }

   public void ab(char var1, int var2) {
      if (this.at(var1, -1147560933) && this.au(var2, 878449995)) {
         this.ae[var1] = var2;
      }

   }

   public static int aj(CharSequence var0, int var1) {
      try {
         return lx.ay(var0, 10, true, 1112315754);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "bj.aj(" + ')');
      }
   }
}
