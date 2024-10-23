import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class te implements tg {
   final Map ap;

   public tz as() {
      return null;
   }

   public tz ap(int var1) {
      try {
         return null;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "te.ap(" + ')');
      }
   }

   public byte[] aw(byte var1) throws UnsupportedEncodingException {
      try {
         return this.au(-1915596610).getBytes("UTF-8");
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "te.aw(" + ')');
      }
   }

   public String au(int var1) throws UnsupportedEncodingException {
      try {
         StringBuilder var2 = new StringBuilder();
         Iterator var3 = this.ap.entrySet().iterator();

         while(var3.hasNext()) {
            if (var1 >= -1777604946) {
               throw new IllegalStateException();
            }

            Entry var4 = (Entry)var3.next();
            String var5 = URLEncoder.encode((String)var4.getKey(), "UTF-8");
            String var6 = URLEncoder.encode((String)var4.getValue(), "UTF-8");
            var2.append(var5).append("=").append(var6).append("&");
         }

         if (var2.length() == 0) {
            if (var1 >= -1777604946) {
               throw new IllegalStateException();
            } else {
               return "";
            }
         } else {
            var2.deleteCharAt(var2.length() - 1);
            var2.insert(0, "?");
            return var2.toString();
         }
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "te.au(" + ')');
      }
   }

   public String ao() throws UnsupportedEncodingException {
      StringBuilder var1 = new StringBuilder();
      Iterator var2 = this.ap.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         String var4 = URLEncoder.encode((String)var3.getKey(), "UTF-8");
         String var5 = URLEncoder.encode((String)var3.getValue(), "UTF-8");
         var1.append(var4).append("=").append(var5).append("&");
      }

      if (var1.length() == 0) {
         return "";
      } else {
         var1.deleteCharAt(var1.length() - 1);
         var1.insert(0, "?");
         return var1.toString();
      }
   }

   public tz aj() {
      return null;
   }

   public tz ai() {
      return null;
   }

   public tz ak() {
      return null;
   }

   public tz ae() {
      return null;
   }

   public byte[] am() throws UnsupportedEncodingException {
      return this.au(-2096449684).getBytes("UTF-8");
   }

   public tz ay() {
      return null;
   }

   public byte[] at() throws UnsupportedEncodingException {
      return this.au(-2110347157).getBytes("UTF-8");
   }

   public String an() throws UnsupportedEncodingException {
      StringBuilder var1 = new StringBuilder();
      Iterator var2 = this.ap.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         String var4 = URLEncoder.encode((String)var3.getKey(), "UTF-8");
         String var5 = URLEncoder.encode((String)var3.getValue(), "UTF-8");
         var1.append(var4).append("=").append(var5).append("&");
      }

      if (var1.length() == 0) {
         return "";
      } else {
         var1.deleteCharAt(var1.length() - 1);
         var1.insert(0, "?");
         return var1.toString();
      }
   }

   public te(Map var1) {
      try {
         super();
         this.ap = var1;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "te.<init>(" + ')');
      }
   }

   static int bj(int var0, da var1, boolean var2, int var3) {
      try {
         int var4;
         int var5;
         int var7;
         if (3400 == var0) {
            if (var3 <= 879852689) {
               throw new IllegalStateException();
            } else {
               dp.am -= 1393015090;
               var4 = cm.ae[dp.am * -158156887];
               var5 = cm.ae[-158156887 * dp.am + 1];
               he var12 = ir.ap(var4, -1700593888);
               if ('s' != var12.aj && var3 <= 879852689) {
                  throw new IllegalStateException();
               } else {
                  for(var7 = 0; var7 < var12.as * -1449640067; ++var7) {
                     if (var3 <= 879852689) {
                        throw new IllegalStateException();
                     }

                     if (var12.ae[var7] == var5) {
                        if (var3 <= 879852689) {
                           throw new IllegalStateException();
                        }

                        cm.at[(ih.au += 746573637) * -114988147 - 1] = var12.at[var7];
                        var12 = null;
                        break;
                     }
                  }

                  if (var12 != null) {
                     if (var3 <= 879852689) {
                        throw new IllegalStateException();
                     }

                     cm.at[(ih.au += 746573637) * -114988147 - 1] = var12.ai;
                  }

                  return 1;
               }
            }
         } else if (3408 != var0) {
            if (var0 == 3411) {
               if (var3 <= 879852689) {
                  throw new IllegalStateException();
               } else {
                  var4 = cm.ae[(dp.am -= -1450976103) * -158156887];
                  he var11 = ir.ap(var4, -1700593888);
                  cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var11.aj((byte)-44);
                  return 1;
               }
            } else {
               return 2;
            }
         } else {
            dp.am -= -1508937116;
            var4 = cm.ae[dp.am * -158156887];
            var5 = cm.ae[dp.am * -158156887 + 1];
            int var6 = cm.ae[2 + -158156887 * dp.am];
            var7 = cm.ae[-158156887 * dp.am + 3];
            he var8 = ir.ap(var6, -1700593888);
            if (var8.ak == var4) {
               if (var3 <= 879852689) {
                  throw new IllegalStateException();
               }

               if (var8.aj == var5) {
                  for(int var9 = 0; var9 < var8.as * -1449640067; ++var9) {
                     if (var3 <= 879852689) {
                        throw new IllegalStateException();
                     }

                     if (var8.ae[var9] == var7) {
                        if (var3 <= 879852689) {
                           throw new IllegalStateException();
                        }

                        if (var5 == 115) {
                           cm.at[(ih.au += 746573637) * -114988147 - 1] = var8.at[var9];
                        } else {
                           cm.ae[(dp.am += -1450976103) * -158156887 - 1] = var8.am[var9];
                        }

                        var8 = null;
                        break;
                     }
                  }

                  if (var8 != null) {
                     if (var3 <= 879852689) {
                        throw new IllegalStateException();
                     }

                     if (var5 == 115) {
                        if (var3 <= 879852689) {
                           throw new IllegalStateException();
                        }

                        cm.at[(ih.au += 746573637) * -114988147 - 1] = var8.ai;
                     } else {
                        cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 584945685 * var8.ay;
                     }
                  }

                  return 1;
               }

               if (var3 <= 879852689) {
                  throw new IllegalStateException();
               }
            }

            if (115 == var5) {
               cm.at[(ih.au += 746573637) * -114988147 - 1] = og.au;
            } else {
               cm.ae[(dp.am += -1450976103) * -158156887 - 1] = 0;
            }

            return 1;
         }
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "te.bj(" + ')');
      }
   }
}
