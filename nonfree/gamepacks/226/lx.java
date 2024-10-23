public abstract class lx {
   public final nn ae;
   public final nn as;
   int am;
   int at;

   boolean ab(byte var1) {
      try {
         return this.aw(110899325) >= 0;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "lx.ab(" + ')');
      }
   }

   boolean ar(int var1, int var2, byte var3) {
      try {
         if (this.az(var1, var2, -607271768)) {
            if (var3 == 100) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else if (this.ag(var1, var2, (byte)73)) {
            if (var3 == 100) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "lx.ar(" + ')');
      }
   }

   public abstract int aw(int var1);

   abstract lp ak(short var1);

   public abstract int ae();

   abstract int ai(int var1);

   public abstract int as();

   boolean az(int var1, int var2, int var3) {
      try {
         if (!this.ab((byte)-115)) {
            if (var3 >= 925837298) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            hc var4 = ar.aw(this.aw(1891564004), 1712115726);
            int var5 = this.aj(-2116199203);
            int var6 = this.ai(1767515);
            switch(var4.av.aj * -1050399395) {
            case 0:
               if (var1 >= this.am * 1255984963) {
                  if (var3 >= 925837298) {
                     throw new IllegalStateException();
                  }

                  if (var1 < var5 + 1255984963 * this.am) {
                     break;
                  }
               }

               return false;
            case 1:
               if (var1 <= this.am * 1255984963 - var5) {
                  return false;
               }

               if (var3 >= 925837298) {
                  throw new IllegalStateException();
               }

               if (var1 > this.am * 1255984963) {
                  return false;
               }
               break;
            case 2:
               if (var1 < 1255984963 * this.am - var5 / 2) {
                  return false;
               }

               if (var1 > this.am * 1255984963 + var5 / 2) {
                  if (var3 >= 925837298) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
            }

            switch(-375458665 * var4.ax.aj) {
            case 0:
               if (var2 <= this.at * 105958947 - var6) {
                  return false;
               }

               if (var3 >= 925837298) {
                  throw new IllegalStateException();
               }

               if (var2 > this.at * 105958947) {
                  if (var3 >= 925837298) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
               break;
            case 1:
               if (var2 < 105958947 * this.at - var6 / 2) {
                  return false;
               }

               if (var3 >= 925837298) {
                  throw new IllegalStateException();
               }

               if (var2 > this.at * 105958947 + var6 / 2) {
                  if (var3 >= 925837298) {
                     throw new IllegalStateException();
                  }

                  return false;
               }
               break;
            case 2:
               if (var2 < this.at * 105958947) {
                  return false;
               }

               if (var3 >= 925837298) {
                  throw new IllegalStateException();
               }

               if (var2 >= 105958947 * this.at + var6) {
                  return false;
               }
            }

            return true;
         }
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "lx.az(" + ')');
      }
   }

   abstract int ao();

   boolean al() {
      return this.aw(-2073837294) >= 0;
   }

   boolean ax() {
      return this.aw(2132703708) >= 0;
   }

   abstract lp am();

   abstract lp at();

   abstract lp au();

   abstract int an();

   boolean aq() {
      return this.aw(-1424590578) >= 0;
   }

   abstract int af();

   boolean ad(int var1, int var2) {
      if (this.az(var1, var2, 74492848)) {
         return true;
      } else {
         return this.ag(var1, var2, (byte)70);
      }
   }

   boolean ac(int var1, int var2) {
      if (this.az(var1, var2, 629758909)) {
         return true;
      } else {
         return this.ag(var1, var2, (byte)119);
      }
   }

   boolean av() {
      return this.aw(-1062903337) >= 0;
   }

   lx(nn var1, nn var2) {
      try {
         super();
         this.ae = var1;
         this.as = var2;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "lx.<init>(" + ')');
      }
   }

   boolean bh(int var1, int var2) {
      lp var3 = this.ak((short)3125);
      if (null == var3) {
         return false;
      } else if (var1 >= 1255984963 * this.am - -1550855137 * var3.aw / 2 && var1 <= -1550855137 * var3.aw / 2 + 1255984963 * this.am) {
         return var2 >= 105958947 * this.at && var2 <= var3.ak * 874402339 + this.at * 105958947;
      } else {
         return false;
      }
   }

   boolean ag(int var1, int var2, byte var3) {
      try {
         lp var4 = this.ak((short)3125);
         if (null == var4) {
            if (var3 <= 58) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if (var1 >= 1255984963 * this.am - -1550855137 * var4.aw / 2 && var1 <= -1550855137 * var4.aw / 2 + 1255984963 * this.am) {
            if (var2 >= 105958947 * this.at) {
               if (var3 <= 58) {
                  throw new IllegalStateException();
               }

               if (var2 <= var4.ak * 874402339 + this.at * 105958947) {
                  return true;
               }

               if (var3 <= 58) {
                  throw new IllegalStateException();
               }
            }

            return false;
         } else {
            return false;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "lx.ag(" + ')');
      }
   }

   boolean aa(int var1, int var2) {
      if (!this.ab((byte)-52)) {
         return false;
      } else {
         hc var3 = ar.aw(this.aw(1396677897), 1695376873);
         int var4 = this.aj(-2131995965);
         int var5 = this.ai(1111633668);
         switch(var3.av.aj * -1050399395) {
         case 0:
            if (var1 < this.am * 1255984963 || var1 >= var4 + 1255984963 * this.am) {
               return false;
            }
            break;
         case 1:
            if (var1 <= this.am * 1255984963 - var4 || var1 > this.am * 1255984963) {
               return false;
            }
            break;
         case 2:
            if (var1 < 1255984963 * this.am - var4 / 2 || var1 > this.am * 1255984963 + var4 / 2) {
               return false;
            }
         }

         switch(-375458665 * var3.ax.aj) {
         case 0:
            if (var2 > this.at * 105958947 - var5 && var2 <= this.at * 105958947) {
               break;
            }

            return false;
         case 1:
            if (var2 >= 105958947 * this.at - var5 / 2 && var2 <= this.at * 105958947 + var5 / 2) {
               break;
            }

            return false;
         case 2:
            if (var2 < this.at * 105958947 || var2 >= 105958947 * this.at + var5) {
               return false;
            }
         }

         return true;
      }
   }

   boolean ah(int var1, int var2) {
      lp var3 = this.ak((short)3125);
      if (null == var3) {
         return false;
      } else if (var1 >= 1255984963 * this.am - -1550855137 * var3.aw / 2 && var1 <= -1550855137 * var3.aw / 2 + 1255984963 * this.am) {
         return var2 >= 105958947 * this.at && var2 <= var3.ak * 874402339 + this.at * 105958947;
      } else {
         return false;
      }
   }

   abstract int aj(int var1);

   boolean bj(int var1, int var2) {
      lp var3 = this.ak((short)3125);
      if (null == var3) {
         return false;
      } else if (var1 >= 1255984963 * this.am - -1550855137 * var3.aw / 2 && var1 <= -1550855137 * var3.aw / 2 + 1255984963 * this.am) {
         return var2 >= 105958947 * this.at && var2 <= var3.ak * 874402339 + this.at * 105958947;
      } else {
         return false;
      }
   }

   boolean bv(int var1, int var2) {
      lp var3 = this.ak((short)3125);
      if (null == var3) {
         return false;
      } else if (var1 >= -390666220 * this.am - -1933976513 * var3.aw / 2 && var1 <= 1014847360 * var3.aw / 2 + 815206892 * this.am) {
         return var2 >= 105958947 * this.at && var2 <= var3.ak * 874402339 + this.at * 105958947;
      } else {
         return false;
      }
   }

   static void kt(dn var0, vm var1, int var2, int var3) {
      try {
         int var4 = var1.cy((short)-12677);
         if (var4 < var0.az * -1234749921) {
            if (var3 == -508399420) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException("dang");
            }
         } else if (var4 > -1234749921 * var0.az) {
            if (var3 == -508399420) {
               throw new IllegalStateException();
            } else {
               throw new RuntimeException("dang!");
            }
         } else {
            var0.az = 0;
            kt var5 = new kt();

            int var6;
            int var7;
            int var9;
            int var13;
            int var14;
            for(var6 = 0; var6 < var4; ++var6) {
               if (var3 == -508399420) {
                  throw new IllegalStateException();
               }

               var7 = var0.ag[var6];
               so var8 = var0.ab[var7];
               var9 = var1.cy((short)-12090);
               if (0 == var9) {
                  if (var3 == -508399420) {
                     return;
                  }

                  client.jv.ak(var8.ak, 1742557413);
                  var0.ab[var7] = null;
               } else {
                  var0.ag[(var0.az += -1907440161) * -1234749921 - 1] = var7;
                  byte var10;
                  int var12;
                  if (var2 < 3) {
                     if (var3 == -508399420) {
                        throw new IllegalStateException();
                     }

                     var8.aw = (1 == var2 ? 1 : var1.cu((byte)13)) * 692837687;
                     var10 = var1.cu((byte)13);
                     byte var18 = var1.cu((byte)13);
                     var12 = var1.ce(1028644239);
                     bd.ap((byte)var1.cy((short)-18878), -882697113);
                     var5.am(var10, var18, -1760661332);
                     var5.at(var12, (byte)91);
                     if (var5.ap(227427987) == 0) {
                        if (var3 == -508399420) {
                           throw new IllegalStateException();
                        }

                        if (var5.ak(-488158644) == 0) {
                           continue;
                        }
                     }

                     var8.az(var5, -2009040930);
                  } else if (var2 == 3 && 1 != var9) {
                     if (var3 == -508399420) {
                        throw new IllegalStateException();
                     }

                     var5.as(var8.ar((byte)-88), 1443175737);
                     var10 = var1.cu((byte)13);
                     if (var10 == 0) {
                        if (var3 == -508399420) {
                           throw new IllegalStateException();
                        }
                     } else {
                        int var11 = tk.aw((vl)var1, (byte)var10, 0, (byte)0);
                        var12 = tk.aw((vl)var1, (byte)var10, 2, (byte)0);
                        var13 = tk.aw((vl)var1, (byte)var10, 4, (byte)0);
                        var14 = tk.aw((vl)var1, (byte)var10, 6, (byte)0);
                        var5.ao(var11, var12, var13, var14, 1271978253);
                     }

                     if (var9 == 2) {
                        if (var3 == -508399420) {
                           return;
                        }

                        var8.az(var5, -2009040930);
                     } else {
                        var8.ag(var5, -262959930);
                     }
                  }
               }
            }

            while(var1.an(1771183759 * client.in.ae, -1399651225) >= 10) {
               var6 = var1.ce(666092019);
               var0.ag[(var0.az += -1907440161) * -1234749921 - 1] = var6;
               var7 = var1.cy((short)-6809);
               int var16 = var1.cy((short)133);
               var9 = 8 * var7;
               int var17 = var16 * 8;
               dn var19 = client.jv.aw(var6, var9, var17, io.vx.bp((byte)-118), im.aw, -451988235);
               so var20 = new so(var6, var19);
               var0.ab[var6] = var20;
               if (var2 < 3) {
                  if (var3 == -508399420) {
                     throw new IllegalStateException();
                  }

                  var13 = var1.cy((short)-27382);
                  var14 = var1.cy((short)-21924);
                  var20.aj.am(var13, var14, -1760661332);
                  var20.aj.at(var1.ce(645466681), (byte)84);
                  var1.ce(460011684);
               } else if (var2 == 3) {
                  var20.aw = var1.cu((byte)13) * 692837687;
                  jr.ap(var1, var20.aj, 0, 0, -638484385);
                  var20.az(var20.aj, -2009040930);
               }
            }

            if (var3 == -508399420) {
               throw new IllegalStateException();
            }
         }
      } catch (RuntimeException var15) {
         throw tm.aw(var15, "lx.kt(" + ')');
      }
   }

   static int ay(CharSequence var0, int var1, boolean var2, int var3) {
      try {
         if (var1 >= 2) {
            if (var3 == -1745125834) {
               throw new IllegalStateException();
            }

            if (var1 <= 36) {
               boolean var4 = false;
               boolean var5 = false;
               int var6 = 0;
               int var7 = var0.length();
               int var8 = 0;

               while(true) {
                  if (var8 >= var7) {
                     if (!var5) {
                        if (var3 == -1745125834) {
                           throw new IllegalStateException();
                        }

                        throw new NumberFormatException();
                     }

                     return var6;
                  }

                  if (var3 == -1745125834) {
                     throw new IllegalStateException();
                  }

                  label141: {
                     char var9 = var0.charAt(var8);
                     if (0 == var8) {
                        if (var9 == '-') {
                           var4 = true;
                           break label141;
                        }

                        if (var9 == '+') {
                           if (var3 == -1745125834) {
                              throw new IllegalStateException();
                           }

                           if (var2) {
                              if (var3 == -1745125834) {
                                 throw new IllegalStateException();
                              }
                              break label141;
                           }
                        }
                     }

                     int var12;
                     label142: {
                        if (var9 >= '0') {
                           if (var3 == -1745125834) {
                              throw new IllegalStateException();
                           }

                           if (var9 <= '9') {
                              if (var3 == -1745125834) {
                                 throw new IllegalStateException();
                              }

                              var12 = var9 - 48;
                              break label142;
                           }
                        }

                        if (var9 >= 'A') {
                           if (var3 == -1745125834) {
                              throw new IllegalStateException();
                           }

                           if (var9 <= 'Z') {
                              if (var3 == -1745125834) {
                                 throw new IllegalStateException();
                              }

                              var12 = var9 - 55;
                              break label142;
                           }
                        }

                        if (var9 < 'a') {
                           break;
                        }

                        if (var3 == -1745125834) {
                           throw new IllegalStateException();
                        }

                        if (var9 > 'z') {
                           break;
                        }

                        if (var3 == -1745125834) {
                           throw new IllegalStateException();
                        }

                        var12 = var9 - 87;
                     }

                     if (var12 >= var1) {
                        if (var3 == -1745125834) {
                           throw new IllegalStateException();
                        }

                        throw new NumberFormatException();
                     }

                     if (var4) {
                        var12 = -var12;
                     }

                     int var10 = var6 * var1 + var12;
                     if (var10 / var1 != var6) {
                        if (var3 == -1745125834) {
                           throw new IllegalStateException();
                        }

                        throw new NumberFormatException();
                     }

                     var6 = var10;
                     var5 = true;
                  }

                  ++var8;
               }

               throw new NumberFormatException();
            }

            if (var3 == -1745125834) {
               throw new IllegalStateException();
            }
         }

         throw new IllegalArgumentException("" + var1);
      } catch (RuntimeException var11) {
         throw tm.aw(var11, "lx.ay(" + ')');
      }
   }
}
