import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

public class bo {
   po ae;
   static final int ad = 6;
   uu ag;
   static final int cl = 10;
   static int uo;
   po ac;
   public static final int af = 4;
   public static final int al = 256;
   static final int bd = 2;
   static final int ay = 23;

   public bg ai(int var1) {
      return this.ag(var1, (int[])null, -947062615);
   }

   public bg ao(int var1) {
      return this.ag(var1, (int[])null, -1969288477);
   }

   ch ae(int var1, int var2, byte var3) {
      try {
         long var4 = this.aq(var1, var2, true, (byte)0);
         ch var6 = (ch)this.ag.ac(var4);
         if (null != var6) {
            return var6;
         } else {
            cf var7 = cf.aq(this.ae, var1, var2);
            if (var7 == null) {
               if (var3 != 25) {
                  throw new IllegalStateException();
               } else {
                  return new ch();
               }
            } else {
               ch var8 = new ch(var7);
               this.ag.ag(var8, var4);
               return var8;
            }
         }
      } catch (RuntimeException var9) {
         throw vk.ae(var9, "bo.ae(" + ')');
      }
   }

   public ch am(int var1, int var2) {
      try {
         if (this.ae.cx(973162733) == 1) {
            if (var2 <= 804688151) {
               throw new IllegalStateException();
            } else {
               return this.ae(0, var1, (byte)25);
            }
         } else if (this.ae.cj(var1, (byte)56) == 1) {
            if (var2 <= 804688151) {
               throw new IllegalStateException();
            } else {
               return this.ae(var1, 0, (byte)25);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "bo.am(" + ')');
      }
   }

   public bo(po var1, po var2) {
      try {
         super();
         new uu(256);
         this.ag = new uu(256);
         this.ac = var1;
         this.ae = var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "bo.<init>(" + ')');
      }
   }

   public bg ax(int var1, int var2) {
      try {
         return this.ag(var1, (int[])null, -1029713700);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "bo.ax(" + ')');
      }
   }

   bg ac(int var1, int var2, int[] var3, int var4) {
      try {
         long var5 = this.aq(var1, var2, false, (byte)0);
         ch var7 = (ch)this.ag.ac(var5);
         if (null != var7) {
            if (var4 == -1204999172) {
               throw new IllegalStateException();
            } else {
               return var7.ag(1521744040);
            }
         } else {
            if (var3 != null) {
               if (var4 == -1204999172) {
                  throw new IllegalStateException();
               }

               if (var3[0] <= 0) {
                  if (var4 == -1204999172) {
                     throw new IllegalStateException();
                  }

                  return null;
               }
            }

            bi var8 = bi.ac(this.ac, var1, var2);
            if (null == var8) {
               if (var4 == -1204999172) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               bg var9 = var8.ae();
               this.ag.ag(new ch(var9), var5);
               if (var3 != null) {
                  if (var4 == -1204999172) {
                     throw new IllegalStateException();
                  }

                  var3[0] -= var9.ae.length;
               }

               return var9;
            }
         }
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "bo.ac(" + ')');
      }
   }

   bg af(int var1, int var2, int[] var3) {
      long var4 = this.aq(var1, var2, false, (byte)0);
      ch var6 = (ch)this.ag.ac(var4);
      if (null != var6) {
         return var6.ag(725531748);
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         bi var7 = bi.ac(this.ac, var1, var2);
         if (null == var7) {
            return null;
         } else {
            bg var8 = var7.ae();
            this.ag.ag(new ch(var8), var4);
            if (var3 != null) {
               var3[0] -= var8.ae.length;
            }

            return var8;
         }
      }
   }

   static final int mp(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8, int var9) {
      try {
         if (client.nr) {
            if (var9 == 346625934) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            int var11 = var2;
            if (var2 >= 2000) {
               if (var9 == 346625934) {
                  throw new IllegalStateException();
               }

               var11 = var2 - 2000;
            }

            boolean var10000;
            label139: {
               if (ds.ms * -809297581 != var8) {
                  if (var9 == 346625934) {
                     throw new IllegalStateException();
                  }

                  if (-1 != var8) {
                     var10000 = false;
                     break label139;
                  }

                  if (var9 == 346625934) {
                     throw new IllegalStateException();
                  }
               }

               var10000 = true;
            }

            boolean var12 = var10000;
            boolean var13;
            if (!var12) {
               if (var9 == 346625934) {
                  throw new IllegalStateException();
               }

               label129: {
                  if (2 != var11) {
                     if (var9 == 346625934) {
                        throw new IllegalStateException();
                     }

                     if (8 != var11) {
                        if (var9 == 346625934) {
                           throw new IllegalStateException();
                        }

                        if (var11 != 25) {
                           if (var9 == 346625934) {
                              throw new IllegalStateException();
                           }

                           if (var11 != 17) {
                              if (var9 == 346625934) {
                                 throw new IllegalStateException();
                              }

                              if (25 != var11) {
                                 var10000 = false;
                                 break label129;
                              }

                              if (var9 == 346625934) {
                                 throw new IllegalStateException();
                              }
                           }
                        }
                     }
                  }

                  var10000 = true;
               }

               var13 = var10000;
               var12 = var13;
            }

            label116: {
               if (!var12) {
                  if (var9 == 346625934) {
                     throw new IllegalStateException();
                  }

                  if (!ux.ac(var11, 1949465708)) {
                     var10000 = false;
                     break label116;
                  }

                  if (var9 == 346625934) {
                     throw new IllegalStateException();
                  }
               }

               var10000 = true;
            }

            var13 = var10000;
            if (!var13) {
               if (var9 == 346625934) {
                  throw new IllegalStateException();
               }

               label106: {
                  if (1002 != var11) {
                     if (var9 == 346625934) {
                        throw new IllegalStateException();
                     }

                     if (var11 != 1003) {
                        if (var9 == 346625934) {
                           throw new IllegalStateException();
                        }

                        if (1004 != var11) {
                           var10000 = false;
                           break label106;
                        }

                        if (var9 == 346625934) {
                           throw new IllegalStateException();
                        }
                     }
                  }

                  var10000 = true;
               }

               boolean var14 = var10000;
               var13 = var14;
            }

            if (!var13) {
               if (var9 == 346625934) {
                  throw new IllegalStateException();
               } else {
                  return -1;
               }
            } else {
               return client.nn.ad(var0, var1, var2, var3, var4, var5, var6, var7, var8, (byte)57);
            }
         }
      } catch (RuntimeException var15) {
         throw vk.ae(var15, "bo.mp(" + ')');
      }
   }

   ch au(int var1, int var2) {
      long var3 = this.aq(var1, var2, true, (byte)0);
      ch var5 = (ch)this.ag.ac(var3);
      if (null != var5) {
         return var5;
      } else {
         cf var6 = cf.aq(this.ae, var1, var2);
         if (var6 == null) {
            return new ch();
         } else {
            ch var7 = new ch(var6);
            this.ag.ag(var7, var3);
            return var7;
         }
      }
   }

   bg ap(int var1, int[] var2) {
      if (this.ac.cx(-1395268485) == 1) {
         return this.ac(0, var1, var2, -1983276880);
      } else if (this.ac.cj(var1, (byte)17) == 1) {
         return this.ac(var1, 0, var2, 520684759);
      } else {
         throw new RuntimeException();
      }
   }

   bg al(int var1, int[] var2) {
      if (this.ac.cx(-2053659091) == 1) {
         return this.ac(0, var1, var2, 188032381);
      } else if (this.ac.cj(var1, (byte)56) == 1) {
         return this.ac(var1, 0, var2, -900900317);
      } else {
         throw new RuntimeException();
      }
   }

   bg ag(int var1, int[] var2, int var3) {
      try {
         if (this.ac.cx(-1870507617) == 1) {
            if (var3 >= 1326491164) {
               throw new IllegalStateException();
            } else {
               return this.ac(0, var1, var2, -443149635);
            }
         } else if (this.ac.cj(var1, (byte)61) == 1) {
            if (var3 >= 1326491164) {
               throw new IllegalStateException();
            } else {
               return this.ac(var1, 0, var2, 1374558109);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "bo.ag(" + ')');
      }
   }

   bg ah(int var1, int[] var2) {
      if (this.ac.cx(1426325248) == 1) {
         return this.ac(0, var1, var2, 167307509);
      } else if (this.ac.cj(var1, (byte)38) == 1) {
         return this.ac(var1, 0, var2, -371460202);
      } else {
         throw new RuntimeException();
      }
   }

   bg at(int var1, int var2, int[] var3) {
      long var4 = this.aq(var1, var2, false, (byte)0);
      ch var6 = (ch)this.ag.ac(var4);
      if (null != var6) {
         return var6.ag(-306176052);
      } else if (var3 != null && var3[0] <= 0) {
         return null;
      } else {
         bi var7 = bi.ac(this.ac, var1, var2);
         if (null == var7) {
            return null;
         } else {
            bg var8 = var7.ae();
            this.ag.ag(new ch(var8), var4);
            if (var3 != null) {
               var3[0] -= var8.ae.length;
            }

            return var8;
         }
      }
   }

   public ch ab(int var1) {
      if (this.ae.cx(-1548648282) == 1) {
         return this.ae(0, var1, (byte)25);
      } else if (this.ae.cj(var1, (byte)86) == 1) {
         return this.ae(var1, 0, (byte)25);
      } else {
         throw new RuntimeException();
      }
   }

   public ch az(int var1) {
      if (this.ae.cx(-388682) == 1) {
         return this.ae(0, var1, (byte)25);
      } else if (this.ae.cj(var1, (byte)40) == 1) {
         return this.ae(var1, 0, (byte)25);
      } else {
         throw new RuntimeException();
      }
   }

   public bg aa(int var1) {
      return this.ag(var1, (int[])null, 1157921674);
   }

   ch ar(int var1, int var2) {
      long var3 = this.aq(var1, var2, true, (byte)0);
      ch var5 = (ch)this.ag.ac(var3);
      if (null != var5) {
         return var5;
      } else {
         cf var6 = cf.aq(this.ae, var1, var2);
         if (var6 == null) {
            return new ch();
         } else {
            ch var7 = new ch(var6);
            this.ag.ag(var7, var3);
            return var7;
         }
      }
   }

   bg ad(int var1, int[] var2) {
      if (this.ac.cx(-1168690328) == 1) {
         return this.ac(0, var1, var2, 165636724);
      } else if (this.ac.cj(var1, (byte)83) == 1) {
         return this.ac(var1, 0, var2, -692241639);
      } else {
         throw new RuntimeException();
      }
   }

   public bg as(int var1) {
      return this.ag(var1, (int[])null, 1246787877);
   }

   long aq(int var1, int var2, boolean var3, byte var4) {
      try {
         int var5 = var2 ^ (var1 << 4 & '\uffff' | var1 >> 12);
         var5 |= var1 << 16;
         return var3 ? (long)var5 ^ 4294967296L : (long)var5;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "bo.aq(" + ')');
      }
   }

   static final void oh(String var0, byte var1) {
      try {
         if (null == gt.sc) {
            if (var1 == 1) {
               throw new IllegalStateException();
            }
         } else {
            mq var2 = fs.ac(mz.cy, client.ia.ax, (byte)-57);
            var2.ag.bu(uo.be(var0, -2097576543), (byte)100);
            var2.ag.bc(var0, -1786332408);
            client.ia.ag(var2, -337088143);
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "bo.oh(" + ')');
      }
   }

   static final void oz(int var0, int var1, boolean var2, int var3) {
      try {
         if (null == client.sl[var0]) {
            if (var3 != -1035236496) {
               ;
            }
         } else {
            if (var1 >= 0) {
               if (var3 == -1035236496) {
                  return;
               }

               if (var1 < client.sl[var0].am(1623920550)) {
                  fy var4 = (fy)client.sl[var0].ag.get(var1);
                  mq var5 = fs.ac(mz.bm, client.ia.ax, (byte)-37);
                  var5.ag.bu(4 + uo.be(var4.ag.ac((byte)100), 1243556020), (byte)95);
                  var5.ag.bu(var0, (byte)4);
                  var5.ag.br(var1, 1625888552);
                  var5.ag.bk(var2, -1796906390);
                  var5.ag.bc(var4.ag.ac((byte)100), -827196417);
                  client.ia.ag(var5, -1954876980);
                  return;
               }

               if (var3 == -1035236496) {
                  return;
               }
            }

         }
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "bo.oz(" + ')');
      }
   }

   public static void ar(byte var0) {
      try {
         mm.af.clear();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "bo.ar(" + ')');
      }
   }

   static void ae(String var0, boolean var1, String var2, boolean var3, int var4) {
      try {
         if (var1) {
            if (var4 >= -360595484) {
               return;
            }

            if (!var3 && Desktop.isDesktopSupported()) {
               if (var4 >= -360595484) {
                  return;
               }

               if (Desktop.getDesktop().isSupported(Action.BROWSE)) {
                  try {
                     Desktop.getDesktop().browse(new URI(var0));
                     return;
                  } catch (Exception var6) {
                  }
               }
            }

            if (bm.ae.startsWith("win") && !var3) {
               fe.ag(var0, 0, "openjs", (short)148);
               return;
            }

            if (bm.ae.startsWith("mac")) {
               if (var4 >= -360595484) {
                  throw new IllegalStateException();
               }

               fe.ag(var0, 1, var2, (short)148);
               return;
            }

            fe.ag(var0, 2, "openjs", (short)148);
         } else {
            fe.ag(var0, 3, "openjs", (short)148);
         }

      } catch (RuntimeException var7) {
         throw vk.ae(var7, "bo.ae(" + ')');
      }
   }
}
