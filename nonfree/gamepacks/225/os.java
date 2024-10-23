import java.util.Calendar;
import java.util.TimeZone;

public class os {
   public static Calendar ag;
   public static final String[][] ac = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}};
   public static final String[] ae = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
   static final int at = 2;

   os() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "os.<init>(" + ')');
      }
   }

   static {
      Calendar.getInstance();
      ag = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
   }

   static int bw(int var0, dt var1, boolean var2, byte var3) {
      try {
         int var5;
         int var11;
         if (4000 == var0) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               mp.au -= 582051378;
               var11 = cs.at[844691753 * mp.au];
               var5 = cs.at[844691753 * mp.au + 1];
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = var11 + var5;
               return 1;
            }
         } else if (4001 == var0) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               mp.au -= 582051378;
               var11 = cs.at[844691753 * mp.au];
               var5 = cs.at[1 + mp.au * 844691753];
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = var11 - var5;
               return 1;
            }
         } else if (var0 == 4002) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               mp.au -= 582051378;
               var11 = cs.at[844691753 * mp.au];
               var5 = cs.at[1 + mp.au * 844691753];
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = var5 * var11;
               return 1;
            }
         } else if (4003 == var0) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               mp.au -= 582051378;
               var11 = cs.at[mp.au * 844691753];
               var5 = cs.at[844691753 * mp.au + 1];
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = var11 / var5;
               return 1;
            }
         } else if (4004 == var0) {
            if (var3 == 1) {
               throw new IllegalStateException();
            } else {
               var11 = cs.at[(mp.au -= -1856457959) * 844691753];
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = (int)(Math.random() * (double)var11);
               return 1;
            }
         } else if (var0 == 4005) {
            var11 = cs.at[(mp.au -= -1856457959) * 844691753];
            cs.at[(mp.au += -1856457959) * 844691753 - 1] = (int)(Math.random() * (double)(1 + var11));
            return 1;
         } else {
            int var6;
            int var7;
            int var8;
            if (4006 == var0) {
               if (var3 == 1) {
                  throw new IllegalStateException();
               } else {
                  mp.au -= -692355203;
                  var11 = cs.at[844691753 * mp.au];
                  var5 = cs.at[1 + 844691753 * mp.au];
                  var6 = cs.at[mp.au * 844691753 + 2];
                  var7 = cs.at[3 + mp.au * 844691753];
                  var8 = cs.at[844691753 * mp.au + 4];
                  cs.at[(mp.au += -1856457959) * 844691753 - 1] = var11 + (var8 - var6) * (var5 - var11) / (var7 - var6);
                  return 1;
               }
            } else if (4007 == var0) {
               mp.au -= 582051378;
               var11 = cs.at[844691753 * mp.au];
               var5 = cs.at[844691753 * mp.au + 1];
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = var5 * var11 / 100 + var11;
               return 1;
            } else if (var0 == 4008) {
               if (var3 == 1) {
                  throw new IllegalStateException();
               } else {
                  mp.au -= 582051378;
                  var11 = cs.at[mp.au * 844691753];
                  var5 = cs.at[1 + 844691753 * mp.au];
                  cs.at[(mp.au += -1856457959) * 844691753 - 1] = var11 | 1 << var5;
                  return 1;
               }
            } else if (var0 == 4009) {
               if (var3 == 1) {
                  throw new IllegalStateException();
               } else {
                  mp.au -= 582051378;
                  var11 = cs.at[mp.au * 844691753];
                  var5 = cs.at[mp.au * 844691753 + 1];
                  cs.at[(mp.au += -1856457959) * 844691753 - 1] = var11 & -1 - (1 << var5);
                  return 1;
               }
            } else if (4010 == var0) {
               if (var3 == 1) {
                  throw new IllegalStateException();
               } else {
                  mp.au -= 582051378;
                  var11 = cs.at[844691753 * mp.au];
                  var5 = cs.at[mp.au * 844691753 + 1];
                  cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0 != (var11 & 1 << var5) ? 1 : 0;
                  return 1;
               }
            } else if (4011 == var0) {
               if (var3 == 1) {
                  throw new IllegalStateException();
               } else {
                  mp.au -= 582051378;
                  var11 = cs.at[844691753 * mp.au];
                  var5 = cs.at[1 + mp.au * 844691753];
                  cs.at[(mp.au += -1856457959) * 844691753 - 1] = var11 % var5;
                  return 1;
               }
            } else if (4012 == var0) {
               if (var3 == 1) {
                  throw new IllegalStateException();
               } else {
                  mp.au -= 582051378;
                  var11 = cs.at[844691753 * mp.au];
                  var5 = cs.at[mp.au * 844691753 + 1];
                  if (0 == var11) {
                     if (var3 == 1) {
                        throw new IllegalStateException();
                     }

                     cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
                  } else {
                     cs.at[(mp.au += -1856457959) * 844691753 - 1] = (int)Math.pow((double)var11, (double)var5);
                  }

                  return 1;
               }
            } else if (4013 == var0) {
               mp.au -= 582051378;
               var11 = cs.at[mp.au * 844691753];
               var5 = cs.at[1 + 844691753 * mp.au];
               if (0 == var11) {
                  cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
                  return 1;
               } else {
                  switch(var5) {
                  case 0:
                     cs.at[(mp.au += -1856457959) * 844691753 - 1] = Integer.MAX_VALUE;
                     break;
                  case 1:
                     cs.at[(mp.au += -1856457959) * 844691753 - 1] = var11;
                     break;
                  case 2:
                     cs.at[(mp.au += -1856457959) * 844691753 - 1] = (int)Math.sqrt((double)var11);
                     break;
                  case 3:
                     cs.at[(mp.au += -1856457959) * 844691753 - 1] = (int)Math.cbrt((double)var11);
                     break;
                  case 4:
                     cs.at[(mp.au += -1856457959) * 844691753 - 1] = (int)Math.sqrt(Math.sqrt((double)var11));
                     break;
                  default:
                     cs.at[(mp.au += -1856457959) * 844691753 - 1] = (int)Math.pow((double)var11, 1.0D / (double)var5);
                  }

                  return 1;
               }
            } else if (var0 == 4014) {
               if (var3 == 1) {
                  throw new IllegalStateException();
               } else {
                  mp.au -= 582051378;
                  var11 = cs.at[844691753 * mp.au];
                  var5 = cs.at[1 + 844691753 * mp.au];
                  cs.at[(mp.au += -1856457959) * 844691753 - 1] = var11 & var5;
                  return 1;
               }
            } else if (var0 == 4015) {
               if (var3 == 1) {
                  throw new IllegalStateException();
               } else {
                  mp.au -= 582051378;
                  var11 = cs.at[mp.au * 844691753];
                  var5 = cs.at[844691753 * mp.au + 1];
                  cs.at[(mp.au += -1856457959) * 844691753 - 1] = var11 | var5;
                  return 1;
               }
            } else {
               int[] var10000;
               int var10001;
               int var10002;
               if (var0 == 4016) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     mp.au -= 582051378;
                     var11 = cs.at[844691753 * mp.au];
                     var5 = cs.at[1 + mp.au * 844691753];
                     var10000 = cs.at;
                     var10001 = (mp.au += -1856457959) * 844691753 - 1;
                     if (var11 < var5) {
                        if (var3 == 1) {
                           throw new IllegalStateException();
                        }

                        var10002 = var11;
                     } else {
                        var10002 = var5;
                     }

                     var10000[var10001] = var10002;
                     return 1;
                  }
               } else if (var0 == 4017) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     mp.au -= 582051378;
                     var11 = cs.at[mp.au * 844691753];
                     var5 = cs.at[844691753 * mp.au + 1];
                     var10000 = cs.at;
                     var10001 = (mp.au += -1856457959) * 844691753 - 1;
                     if (var11 > var5) {
                        if (var3 == 1) {
                           throw new IllegalStateException();
                        }

                        var10002 = var11;
                     } else {
                        var10002 = var5;
                     }

                     var10000[var10001] = var10002;
                     return 1;
                  }
               } else if (4018 == var0) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     mp.au -= -1274406581;
                     long var12 = (long)cs.at[mp.au * 844691753];
                     long var13 = (long)cs.at[1 + mp.au * 844691753];
                     long var14 = (long)cs.at[2 + mp.au * 844691753];
                     cs.at[(mp.au += -1856457959) * 844691753 - 1] = (int)(var14 * var12 / var13);
                     return 1;
                  }
               } else if (4025 == var0) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     var11 = bp.ae(cs.at[(mp.au -= -1856457959) * 844691753], (short)-11338);
                     cs.at[(mp.au += -1856457959) * 844691753 - 1] = var11;
                     return 1;
                  }
               } else if (var0 == 4026) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     mp.au -= 582051378;
                     var11 = cs.at[mp.au * 844691753];
                     var5 = cs.at[1 + mp.au * 844691753];
                     cs.at[(mp.au += -1856457959) * 844691753 - 1] = var11 ^ 1 << var5;
                     return 1;
                  }
               } else if (4027 == var0) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     mp.au -= -1274406581;
                     var11 = cs.at[mp.au * 844691753];
                     var5 = cs.at[844691753 * mp.au + 1];
                     var6 = cs.at[2 + 844691753 * mp.au];
                     cs.at[(mp.au += -1856457959) * 844691753 - 1] = af.am(var11, var5, var6, (byte)1);
                     return 1;
                  }
               } else if (4028 == var0) {
                  mp.au -= -1274406581;
                  var11 = cs.at[mp.au * 844691753];
                  var5 = cs.at[mp.au * 844691753 + 1];
                  var6 = cs.at[844691753 * mp.au + 2];
                  cs.at[(mp.au += -1856457959) * 844691753 - 1] = hm.ag(var11, var5, var6, (short)29029);
                  return 1;
               } else if (var0 == 4029) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     mp.au -= -1274406581;
                     var11 = cs.at[mp.au * 844691753];
                     var5 = cs.at[1 + mp.au * 844691753];
                     var6 = cs.at[844691753 * mp.au + 2];
                     var7 = 31 - var6;
                     cs.at[(mp.au += -1856457959) * 844691753 - 1] = var11 << var7 >>> var7 + var5;
                     return 1;
                  }
               } else if (4030 == var0) {
                  mp.au -= 1164102756;
                  var11 = cs.at[844691753 * mp.au];
                  var5 = cs.at[844691753 * mp.au + 1];
                  var6 = cs.at[2 + 844691753 * mp.au];
                  var7 = cs.at[844691753 * mp.au + 3];
                  var11 = hm.ag(var11, var6, var7, (short)28625);
                  var8 = ng.ac(var7 - var6 + 1, -2012418261);
                  if (var5 > var8) {
                     if (var3 == 1) {
                        throw new IllegalStateException();
                     }

                     var5 = var8;
                  }

                  cs.at[(mp.au += -1856457959) * 844691753 - 1] = var11 | var5 << var6;
                  return 1;
               } else if (var0 == 4032) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     cs.at[844691753 * mp.au - 1] = pc.ag(cs.at[844691753 * mp.au - 1], (byte)-26);
                     return 1;
                  }
               } else if (4033 == var0) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     cs.at[844691753 * mp.au - 1] = bp.am(cs.at[mp.au * 844691753 - 1], 1398786244);
                     return 1;
                  }
               } else if (4034 == var0) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     mp.au -= 582051378;
                     var11 = cs.at[mp.au * 844691753];
                     var5 = cs.at[1 + mp.au * 844691753];
                     var6 = tk.ae(var11, var5, 126458384);
                     cs.at[(mp.au += -1856457959) * 844691753 - 1] = var6;
                     return 1;
                  }
               } else if (var0 == 4035) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     cs.at[mp.au * 844691753 - 1] = Math.abs(cs.at[844691753 * mp.au - 1]);
                     return 1;
                  }
               } else if (var0 == 4036) {
                  if (var3 == 1) {
                     throw new IllegalStateException();
                  } else {
                     String var4 = cs.ar[(rt.al -= -1975882559) * -515103935];
                     var5 = -1;
                     if (ii.ae(var4, -134663116)) {
                        var5 = ir.ag(var4, 1473180947);
                     }

                     cs.at[(mp.au += -1856457959) * 844691753 - 1] = var5;
                     return 1;
                  }
               } else {
                  return 2;
               }
            }
         }
      } catch (RuntimeException var10) {
         throw vk.ae(var10, "os.bw(" + ')');
      }
   }
}
