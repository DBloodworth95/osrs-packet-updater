import java.io.IOException;
import java.util.Arrays;

public class bh {
   int[] at;
   public static final int ag = 2;
   static int tw;
   static final int am = 3;
   int[] af;
   static final int ax = 4;
   static final int ae = 1;

   boolean bi(int var1) {
      if (var1 >= 0 && var1 < 4) {
         return true;
      } else {
         System.out.println("Invalid mode: " + var1);
         return false;
      }
   }

   public void ac(int var1, int var2, byte var3) {
      try {
         if (this.au(var1, (byte)-110) && this.al(var2, -1723718049)) {
            if (var3 == 5) {
               throw new IllegalStateException();
            }

            this.af[var1] = var2;
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "bh.ac(" + ')');
      }
   }

   public void ae(char var1, int var2, int var3) {
      try {
         if (this.ar(var1, 245544950) && this.al(var2, -1723718049)) {
            if (var3 != -513476203) {
               throw new IllegalStateException();
            }

            this.at[var1] = var2;
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "bh.ae(" + ')');
      }
   }

   public int ag(int var1, int var2) {
      try {
         if (this.au(var1, (byte)-23)) {
            if (var2 != -2138005081) {
               throw new IllegalStateException();
            } else {
               return this.af[var1];
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "bh.ag(" + ')');
      }
   }

   boolean al(int var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var1 < 4) {
               return true;
            }

            if (var2 != -1723718049) {
               throw new IllegalStateException();
            }
         }

         System.out.println("Invalid mode: " + var1);
         return false;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "bh.al(" + ')');
      }
   }

   public boolean ax(int var1, int var2) {
      try {
         boolean var10000;
         if (this.au(var1, (byte)-122)) {
            label36: {
               if (1 != this.af[var1]) {
                  if (3 != this.af[var1]) {
                     break label36;
                  }

                  if (var2 >= -432000419) {
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
         throw vk.ae(var3, "bh.ax(" + ')');
      }
   }

   public int ao(int var1) {
      return this.au(var1, (byte)-116) ? this.af[var1] : 0;
   }

   public boolean af(int var1, int var2) {
      try {
         boolean var10000;
         if (this.au(var1, (byte)-29)) {
            label39: {
               if (var2 == -604114995) {
                  throw new IllegalStateException();
               }

               if (2 != this.af[var1]) {
                  if (3 != this.af[var1]) {
                     break label39;
                  }

                  if (var2 == -604114995) {
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
         throw vk.ae(var3, "bh.af(" + ')');
      }
   }

   public boolean aq(char var1, int var2) {
      try {
         boolean var10000;
         if (this.ar(var1, -1549177301)) {
            label43: {
               if (var2 == -1794550415) {
                  throw new IllegalStateException();
               }

               if (this.at[var1] != 1) {
                  if (var2 == -1794550415) {
                     throw new IllegalStateException();
                  }

                  if (3 != this.at[var1]) {
                     break label43;
                  }

                  if (var2 == -1794550415) {
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
         throw vk.ae(var3, "bh.aq(" + ')');
      }
   }

   public void ap(char var1, int var2) {
      if (this.ar(var1, 974740401) && this.al(var2, -1723718049)) {
         this.at[var1] = var2;
      }

   }

   boolean bj(char var1) {
      if (var1 >= 0 && var1 < 192) {
         return true;
      } else {
         System.out.println("Invalid keychar: " + var1);
         return false;
      }
   }

   public int az(int var1) {
      return this.au(var1, (byte)-84) ? this.af[var1] : 0;
   }

   public void ad(int var1, int var2) {
      if (this.au(var1, (byte)-106) && this.al(var2, -1723718049)) {
         this.af[var1] = var2;
      }

   }

   public void ah(int var1, int var2) {
      if (this.au(var1, (byte)-61) && this.al(var2, -1723718049)) {
         this.af[var1] = var2;
      }

   }

   public int am(char var1, int var2) {
      try {
         if (this.ar(var1, -1578284710)) {
            if (var2 <= 657150283) {
               throw new IllegalStateException();
            } else {
               return this.at[var1];
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "bh.am(" + ')');
      }
   }

   public int ab(int var1) {
      return this.au(var1, (byte)-8) ? this.af[var1] : 0;
   }

   public bh() {
      try {
         super();
         this.af = new int[112];
         this.at = new int[192];
         Arrays.fill(this.af, 3);
         Arrays.fill(this.at, 3);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "bh.<init>(" + ')');
      }
   }

   public int aa(int var1) {
      return this.au(var1, (byte)-89) ? this.af[var1] : 0;
   }

   boolean bs(int var1) {
      if (var1 >= 0 && var1 < 112) {
         return true;
      } else {
         System.out.println("Invalid keycode: " + var1);
         return false;
      }
   }

   public boolean ak(char var1) {
      return this.ar(var1, -423598288) && (this.at[var1] == 1 || 3 == this.at[var1]);
   }

   public int as(char var1) {
      return this.ar(var1, -491782508) ? this.at[var1] : 0;
   }

   public int ay(char var1) {
      return this.ar(var1, -732702998) ? this.at[var1] : 0;
   }

   boolean bb(char var1) {
      if (var1 >= 0 && var1 < 192) {
         return true;
      } else {
         System.out.println("Invalid keychar: " + var1);
         return false;
      }
   }

   public boolean av(int var1) {
      return this.au(var1, (byte)-109) && (1 == this.af[var1] || 3 == this.af[var1]);
   }

   boolean by(char var1) {
      if (var1 >= 0 && var1 < 1644784952) {
         return true;
      } else {
         System.out.println("Invalid keychar: " + var1);
         return false;
      }
   }

   public boolean an(int var1) {
      return this.au(var1, (byte)-116) && (1 == this.af[var1] || 3 == this.af[var1]);
   }

   public boolean bn(int var1) {
      return this.au(var1, (byte)-43) && (2 == this.af[var1] || 3 == this.af[var1]);
   }

   public boolean at(char var1, byte var2) {
      try {
         boolean var10000;
         if (this.ar(var1, -1859923705)) {
            label43: {
               if (var2 != 1) {
                  throw new IllegalStateException();
               }

               if (this.at[var1] != 2) {
                  if (var2 != 1) {
                     throw new IllegalStateException();
                  }

                  if (this.at[var1] != 3) {
                     break label43;
                  }

                  if (var2 != 1) {
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
         throw vk.ae(var3, "bh.at(" + ')');
      }
   }

   public boolean bh(int var1) {
      return this.au(var1, (byte)-48) && (2 == this.af[var1] || 3 == this.af[var1]);
   }

   public boolean bd(char var1) {
      return this.ar(var1, -1881908252) && (this.at[var1] == 2 || this.at[var1] == 3);
   }

   public boolean bx(char var1) {
      return this.ar(var1, 955326284) && (this.at[var1] == 2 || this.at[var1] == 3);
   }

   public boolean bf(char var1) {
      return this.ar(var1, 618471813) && (this.at[var1] == 2 || this.at[var1] == 3);
   }

   boolean bm(int var1) {
      if (var1 >= 0 && var1 < 112) {
         return true;
      } else {
         System.out.println("Invalid keycode: " + var1);
         return false;
      }
   }

   boolean ar(char var1, int var2) {
      try {
         if (var1 >= 0) {
            if (var2 >= 1447764407) {
               throw new IllegalStateException();
            }

            if (var1 < 192) {
               return true;
            }

            if (var2 >= 1447764407) {
               throw new IllegalStateException();
            }
         }

         System.out.println("Invalid keychar: " + var1);
         return false;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "bh.ar(" + ')');
      }
   }

   boolean bw(int var1) {
      if (var1 >= 0 && var1 < 112) {
         return true;
      } else {
         System.out.println("Invalid keycode: " + var1);
         return false;
      }
   }

   boolean ba(int var1) {
      if (var1 >= 0 && var1 < 112) {
         return true;
      } else {
         System.out.println("Invalid keycode: " + var1);
         return false;
      }
   }

   public int ai(int var1) {
      return this.au(var1, (byte)-27) ? this.af[var1] : 0;
   }

   boolean bp(char var1) {
      if (var1 >= 0 && var1 < 192) {
         return true;
      } else {
         System.out.println("Invalid keychar: " + var1);
         return false;
      }
   }

   public int aj(char var1) {
      return this.ar(var1, -1485614881) ? this.at[var1] : 0;
   }

   boolean au(int var1, byte var2) {
      try {
         if (var1 >= 0) {
            if (var2 >= 0) {
               throw new IllegalStateException();
            }

            if (var1 < 112) {
               return true;
            }

            if (var2 >= 0) {
               throw new IllegalStateException();
            }
         }

         System.out.println("Invalid keycode: " + var1);
         return false;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "bh.au(" + ')');
      }
   }

   public boolean aw(int var1) {
      return this.au(var1, (byte)-65) && (1 == this.af[var1] || 3 == this.af[var1]);
   }

   boolean bg(int var1) {
      if (var1 >= 0 && var1 < 4) {
         return true;
      } else {
         System.out.println("Invalid mode: " + var1);
         return false;
      }
   }

   boolean bl(int var1) {
      if (var1 >= 0 && var1 < 4) {
         return true;
      } else {
         System.out.println("Invalid mode: " + var1);
         return false;
      }
   }

   static void pp(vf var0, int var1) {
      try {
         if (client.hh != null) {
            if (var1 != 15728880) {
               throw new IllegalStateException();
            } else {
               var0.cu(client.hh, 0, client.hh.length, -1465672467);
            }
         } else {
            byte[] var3 = new byte[24];

            try {
               il.ad.ae(0L);
               il.ad.am(var3, -704458584);

               int var4;
               for(var4 = 0; var4 < 24; ++var4) {
                  if (var1 != 15728880) {
                     throw new IllegalStateException();
                  }

                  if (var3[var4] != 0) {
                     if (var1 != 15728880) {
                        return;
                     }
                     break;
                  }
               }

               if (var4 >= 24) {
                  if (var1 != 15728880) {
                     throw new IllegalStateException();
                  }

                  throw new IOException();
               }
            } catch (Exception var6) {
               for(int var5 = 0; var5 < 24; ++var5) {
                  if (var1 != 15728880) {
                     throw new IllegalStateException();
                  }

                  var3[var5] = -1;
               }
            }

            var0.cu(var3, 0, var3.length, -1335695468);
         }
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "bh.pp(" + ')');
      }
   }

   static int ae(ui var0, int var1, int var2, int var3) {
      try {
         if (null == var0) {
            if (var3 <= -1561000850) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            th var4 = (th)var0.ac((long)var1);
            if (null == var4) {
               if (var3 <= -1561000850) {
                  throw new IllegalStateException();
               } else {
                  return var2;
               }
            } else {
               return var4.ac;
            }
         }
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "bh.ae(" + ')');
      }
   }
}
