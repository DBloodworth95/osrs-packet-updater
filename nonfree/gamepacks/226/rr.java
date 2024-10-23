import java.io.File;
import java.io.IOException;

public class rr extends sz {
   static final int as = 5;
   public static final int aw = 100;
   static final int ap = 400;
   final ur ai;
   static final int ak = 1;
   public static final int dg = 112;
   static final int bb = 38;
   static int uh;
   static dx db;

   se aj() {
      return new sr();
   }

   se ap(int var1) {
      try {
         return new sr();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "rr.ap(" + ')');
      }
   }

   se[] aw(int var1, int var2) {
      try {
         return new sr[var1];
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "rr.aw(" + ')');
      }
   }

   se[] am(int var1) {
      return new sr[var1];
   }

   public static un ak(String var0, String var1, boolean var2, byte var3) {
      try {
         File var4 = new File(iq.ai, "preferences" + var0 + ".dat");
         if (var4.exists()) {
            if (var3 >= 9) {
               throw new IllegalStateException();
            }

            try {
               un var12 = new un(var4, "rw", 10000L);
               return var12;
            } catch (IOException var10) {
            }
         }

         String var5 = "";
         if (hl.ab * -1954269699 == 33) {
            if (var3 >= 9) {
               throw new IllegalStateException();
            }

            var5 = "_rc";
         } else if (34 == hl.ab * -1954269699) {
            if (var3 >= 9) {
               throw new IllegalStateException();
            }

            var5 = "_wip";
         }

         File var6 = new File(hd.aq, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
         un var7;
         if (!var2) {
            if (var3 >= 9) {
               throw new IllegalStateException();
            }

            if (var6.exists()) {
               if (var3 >= 9) {
                  throw new IllegalStateException();
               }

               try {
                  var7 = new un(var6, "rw", 10000L);
                  return var7;
               } catch (IOException var9) {
               }
            }
         }

         try {
            var7 = new un(var4, "rw", 10000L);
            return var7;
         } catch (IOException var8) {
            throw new RuntimeException();
         }
      } catch (RuntimeException var11) {
         throw tm.aw(var11, "rr.ak(" + ')');
      }
   }

   public void ak(vl var1, int var2, int var3) {
      try {
         while(var1.am * -1689308347 < var2) {
            int var4 = var1.cy((short)-10376);
            if (4 == var4) {
               wx var11 = new wx(var1.cw(1985230586), this.ai);
               if (!var11.ak(-835172399)) {
                  throw new IllegalStateException();
               }

               boolean var12 = false;
               dk.vt.ac(var11.ap(-1146140221), var12, (byte)-46);
            } else {
               boolean var10000;
               if (0 != (var4 & 1)) {
                  if (var3 >= -1043700393) {
                     return;
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               boolean var5 = var10000;
               wx var6 = new wx(var1.cw(2144509412), this.ai);
               wx var7 = new wx(var1.cw(2107543170), this.ai);
               var1.cw(2141043180);
               if (!var6.ak(-669195907)) {
                  if (var3 >= -1043700393) {
                     return;
                  }

                  throw new IllegalStateException();
               }

               sr var8 = (sr)this.bc(var6, (byte)-30);
               if (var5) {
                  sr var9 = (sr)this.bc(var7, (byte)7);
                  if (var9 != null && var9 != var8) {
                     if (null != var8) {
                        if (var3 >= -1043700393) {
                           throw new IllegalStateException();
                        }

                        this.bn(var9, -1936730839);
                     } else {
                        var8 = var9;
                     }
                  }
               }

               if (null != var8) {
                  if (var3 >= -1043700393) {
                     throw new IllegalStateException();
                  }

                  this.bo(var8, var6, var7, -1571468601);
               } else if (this.bb((byte)-72) < 400) {
                  if (var3 >= -1043700393) {
                     throw new IllegalStateException();
                  }

                  int var13 = this.bb((byte)93);
                  var8 = (sr)this.bt(var6, var7, (short)9773);
                  var8.ap = var13 * -517969133;
               }
            }
         }

      } catch (RuntimeException var10) {
         throw tm.aw(var10, "rr.ak(" + ')');
      }
   }

   se ay() {
      return new sr();
   }

   se as() {
      return new sr();
   }

   se[] ae(int var1) {
      return new sr[var1];
   }

   public rr(ur var1) {
      try {
         super(400);
         this.ai = var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "rr.<init>(" + ')');
      }
   }

   public void at(vl var1, int var2) {
      while(var1.am * -1689308347 < var2) {
         int var3 = var1.cy((short)-27428);
         if (4 == var3) {
            wx var9 = new wx(var1.cw(2084059137), this.ai);
            if (!var9.ak(-2306218)) {
               throw new IllegalStateException();
            }

            boolean var10 = false;
            dk.vt.ac(var9.ap(533158487), var10, (byte)-42);
         } else {
            boolean var4 = 0 != (var3 & 1);
            wx var5 = new wx(var1.cw(2052080870), this.ai);
            wx var6 = new wx(var1.cw(2081960062), this.ai);
            var1.cw(2109162579);
            if (!var5.ak(-166278887)) {
               throw new IllegalStateException();
            }

            sr var7 = (sr)this.bc(var5, (byte)-84);
            if (var4) {
               sr var8 = (sr)this.bc(var6, (byte)-59);
               if (var8 != null && var8 != var7) {
                  if (null != var7) {
                     this.bn(var8, -1583543233);
                  } else {
                     var7 = var8;
                  }
               }
            }

            if (null != var7) {
               this.bo(var7, var5, var6, -1571468601);
            } else if (this.bb((byte)-84) < 400) {
               int var11 = this.bb((byte)22);
               var7 = (sr)this.bt(var5, var6, (short)18032);
               var7.ap = var11 * -517969133;
            }
         }
      }

   }

   public void au(vl var1, int var2) {
      while(var1.am * 1675570223 < var2) {
         int var3 = var1.cy((short)-13944);
         if (4 == var3) {
            wx var9 = new wx(var1.cw(2108243429), this.ai);
            if (!var9.ak(-1432657475)) {
               throw new IllegalStateException();
            }

            boolean var10 = false;
            dk.vt.ac(var9.ap(9892855), var10, (byte)3);
         } else {
            boolean var4 = 0 != (var3 & 1);
            wx var5 = new wx(var1.cw(1982002065), this.ai);
            wx var6 = new wx(var1.cw(1974037057), this.ai);
            var1.cw(2122203135);
            if (!var5.ak(-487425827)) {
               throw new IllegalStateException();
            }

            sr var7 = (sr)this.bc(var5, (byte)-9);
            if (var4) {
               sr var8 = (sr)this.bc(var6, (byte)27);
               if (var8 != null && var8 != var7) {
                  if (null != var7) {
                     this.bn(var8, -2123207908);
                  } else {
                     var7 = var8;
                  }
               }
            }

            if (null != var7) {
               this.bo(var7, var5, var6, -1571468601);
            } else if (this.bb((byte)-12) < 400) {
               int var11 = this.bb((byte)13);
               var7 = (sr)this.bt(var5, var6, (short)7854);
               var7.ap = var11 * -1159593700;
            }
         }
      }

   }

   public void an(vl var1, int var2) {
      while(var1.am * 394520064 < var2) {
         int var3 = var1.cy((short)-24823);
         if (4 == var3) {
            wx var9 = new wx(var1.cw(2012110036), this.ai);
            if (!var9.ak(-1225540616)) {
               throw new IllegalStateException();
            }

            boolean var10 = false;
            dk.vt.ac(var9.ap(-1484198502), var10, (byte)13);
         } else {
            boolean var4 = 0 != (var3 & 1);
            wx var5 = new wx(var1.cw(2120109689), this.ai);
            wx var6 = new wx(var1.cw(1890536792), this.ai);
            var1.cw(1990821931);
            if (!var5.ak(-2048168084)) {
               throw new IllegalStateException();
            }

            sr var7 = (sr)this.bc(var5, (byte)11);
            if (var4) {
               sr var8 = (sr)this.bc(var6, (byte)-54);
               if (var8 != null && var8 != var7) {
                  if (null != var7) {
                     this.bn(var8, -1720972153);
                  } else {
                     var7 = var8;
                  }
               }
            }

            if (null != var7) {
               this.bo(var7, var5, var6, -1571468601);
            } else if (this.bb((byte)-31) < 400) {
               int var11 = this.bb((byte)-51);
               var7 = (sr)this.bt(var5, var6, (short)7886);
               var7.ap = var11 * -517969133;
            }
         }
      }

   }

   public void ao(vl var1, int var2) {
      while(var1.am * -1689308347 < var2) {
         int var3 = var1.cy((short)-24228);
         if (4 == var3) {
            wx var9 = new wx(var1.cw(1905682296), this.ai);
            if (!var9.ak(-1432327323)) {
               throw new IllegalStateException();
            }

            boolean var10 = false;
            dk.vt.ac(var9.ap(-1593807876), var10, (byte)-17);
         } else {
            boolean var4 = 0 != (var3 & 1);
            wx var5 = new wx(var1.cw(2002671955), this.ai);
            wx var6 = new wx(var1.cw(1969392492), this.ai);
            var1.cw(2139886387);
            if (!var5.ak(-100207831)) {
               throw new IllegalStateException();
            }

            sr var7 = (sr)this.bc(var5, (byte)-73);
            if (var4) {
               sr var8 = (sr)this.bc(var6, (byte)-12);
               if (var8 != null && var8 != var7) {
                  if (null != var7) {
                     this.bn(var8, -2136460602);
                  } else {
                     var7 = var8;
                  }
               }
            }

            if (null != var7) {
               this.bo(var7, var5, var6, -1571468601);
            } else if (this.bb((byte)82) < 400) {
               int var11 = this.bb((byte)-27);
               var7 = (sr)this.bt(var5, var6, (short)27886);
               var7.ap = var11 * -517969133;
            }
         }
      }

   }

   se ai() {
      return new sr();
   }

   static byte[] aw(String var0, byte var1) {
      try {
         boolean var2 = true;
         boolean var3 = true;
         int var4 = og.ih.length();
         int var5 = 0;
         byte[] var6 = new byte[8];

         while(true) {
            int var7 = var4 + var5;
            if (var7 >= var0.length()) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               return null;
            }

            char var8 = var0.charAt(var7);
            if (var8 == ':') {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               if (0 == var5) {
                  return null;
               }

               byte[] var10 = new byte[var5];
               System.arraycopy(var6, 0, var10, 0, var5);
               return var10;
            }

            if (var6.length == var5) {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               return null;
            }

            if (var8 >= '0' && var8 <= '9') {
               if (var1 >= 1) {
                  throw new IllegalStateException();
               }

               var8 = (char)(var8 - 48);
            } else {
               label80: {
                  if (var8 >= 'a') {
                     if (var1 >= 1) {
                        throw new IllegalStateException();
                     }

                     if (var8 <= 'z') {
                        if (var1 >= 1) {
                           throw new IllegalStateException();
                        }

                        var8 = (char)(var8 - 87);
                        break label80;
                     }
                  }

                  return null;
               }
            }

            var6[var5++] = (byte)var8;
         }
      } catch (RuntimeException var9) {
         throw tm.aw(var9, "rr.aw(" + ')');
      }
   }
}
