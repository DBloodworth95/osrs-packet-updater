import java.util.Comparator;

public class cc implements Comparator {
   public static final String kj = "Date not valid.";
   static final int at = 5;
   static int af;
   static final int au = 256;
   public static final int ab = 18;
   boolean ac;
   static vt ap;

   static int as(int var0, dt var1, boolean var2, int var3) {
      try {
         ny var10000;
         ny var4;
         if (var0 != 1927) {
            if (var3 <= 1382213151) {
               throw new IllegalStateException();
            }

            if (2927 != var0) {
               int var10;
               if (var0 == 1928) {
                  if (var3 <= 1382213151) {
                     throw new IllegalStateException();
                  }

                  if (var2) {
                     if (var3 <= 1382213151) {
                        throw new IllegalStateException();
                     }

                     var10000 = cs.ab;
                  } else {
                     var10000 = ry.ap;
                  }

                  var4 = var10000;
                  var10 = cs.at[(au -= -1856457959) * 844691753];
                  if (var10 >= 1) {
                     if (var3 <= 1382213151) {
                        throw new IllegalStateException();
                     }

                     if (var10 <= 10) {
                        ev var11 = new ev(var10, -1565465557 * var4.bh, -1614754997 * var4.bd, var4.gz * 1679475031);
                        cs.aw.add(var11);
                        return 1;
                     }

                     if (var3 <= 1382213151) {
                        throw new IllegalStateException();
                     }
                  }

                  throw new RuntimeException();
               }

               if (2928 == var0) {
                  if (var3 <= 1382213151) {
                     throw new IllegalStateException();
                  }

                  au -= -1274406581;
                  int var9 = cs.at[844691753 * mp.au];
                  var10 = cs.at[mp.au * 844691753 + 1];
                  int var6 = cs.at[mp.au * 844691753 + 2];
                  if (var6 >= 1) {
                     if (var6 <= 10) {
                        ev var7 = new ev(var6, var9, var10, ir.ep.ac(var9, -2093759727).gz * 1679475031);
                        cs.aw.add(var7);
                        return 1;
                     }

                     if (var3 <= 1382213151) {
                        throw new IllegalStateException();
                     }
                  }

                  throw new RuntimeException();
               }

               return 2;
            }

            if (var3 <= 1382213151) {
               throw new IllegalStateException();
            }
         }

         if (1265042229 * cs.an >= 10) {
            if (var3 <= 1382213151) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException();
            }
         } else {
            if (var0 >= 2000) {
               if (var3 <= 1382213151) {
                  throw new IllegalStateException();
               }

               var4 = ir.ep.ac(cs.at[(au -= -1856457959) * 844691753], -1886168644);
            } else {
               if (var2) {
                  if (var3 <= 1382213151) {
                     throw new IllegalStateException();
                  }

                  var10000 = cs.ab;
               } else {
                  var10000 = ry.ap;
               }

               var4 = var10000;
            }

            if (null == var4.gd) {
               return 0;
            } else {
               do var5 = new do();
               var5.ag = var4;
               var5.ac = var4.gd;
               var5.ad = 2070201279 + cs.an * 1895875467;
               client.qw.ae(var5);
               return 1;
            }
         }
      } catch (RuntimeException var8) {
         throw vk.ae(var8, "cc.as(" + ')');
      }
   }

   int ac(pv var1, pv var2, int var3) {
      try {
         if (var1.ac * 227775 == var2.ac * 227775) {
            if (var3 <= 1857701171) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else {
            if (this.ac) {
               if (var3 <= 1857701171) {
                  throw new IllegalStateException();
               }

               if (var1.ac * 227775 == client.cn * 914504241) {
                  if (var3 <= 1857701171) {
                     throw new IllegalStateException();
                  }

                  return -1;
               }

               if (227775 * var2.ac == 914504241 * client.cn) {
                  if (var3 <= 1857701171) {
                     throw new IllegalStateException();
                  }

                  return 1;
               }
            }

            byte var10000;
            if (var1.ac * 227775 < var2.ac * 227775) {
               if (var3 <= 1857701171) {
                  throw new IllegalStateException();
               }

               var10000 = -1;
            } else {
               var10000 = 1;
            }

            return var10000;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "cc.ac(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ac((pv)var1, (pv)var2, 2061096132);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "cc.compare(" + ')');
      }
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "cc.equals(" + ')');
      }
   }

   int ae(pv var1, pv var2) {
      if (var1.ac * 227775 == var2.ac * 227775) {
         return 0;
      } else {
         if (this.ac) {
            if (var1.ac * 227775 == client.cn * 914504241) {
               return -1;
            }

            if (227775 * var2.ac == 914504241 * client.cn) {
               return 1;
            }
         }

         return var1.ac * 227775 < var2.ac * 227775 ? -1 : 1;
      }
   }

   int ag(pv var1, pv var2) {
      if (var1.ac * -1554164129 == var2.ac * 227775) {
         return 0;
      } else {
         if (this.ac) {
            if (var1.ac * 227775 == client.cn * 914504241) {
               return -1;
            }

            if (227775 * var2.ac == 531323713 * client.cn) {
               return 1;
            }
         }

         return var1.ac * 227775 < var2.ac * 227775 ? -1 : 1;
      }
   }

   cc() {
      try {
         super();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "cc.<init>(" + ')');
      }
   }

   public int ax(Object var1, Object var2) {
      return this.ac((pv)var1, (pv)var2, 1981632295);
   }

   int am(pv var1, pv var2) {
      if (var1.ac * 227775 == var2.ac * 227775) {
         return 0;
      } else {
         if (this.ac) {
            if (var1.ac * 227775 == client.cn * 914504241) {
               return -1;
            }

            if (227775 * var2.ac == 914504241 * client.cn) {
               return 1;
            }
         }

         return var1.ac * 227775 < var2.ac * 227775 ? -1 : 1;
      }
   }

   public int af(Object var1, Object var2) {
      return this.ac((pv)var1, (pv)var2, 1861167943);
   }

   public boolean gn(Object var1) {
      return super.equals(var1);
   }

   public int aq(Object var1, Object var2) {
      return this.ac((pv)var1, (pv)var2, 2053135119);
   }

   public boolean gg(Object var1) {
      return super.equals(var1);
   }

   static final void ny(int var0, int var1) {
      try {
         var0 = Math.min(Math.max(var0, 0), 127);
         re.vt.aj(var0, 235315216);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "cc.ny(" + ')');
      }
   }
}
