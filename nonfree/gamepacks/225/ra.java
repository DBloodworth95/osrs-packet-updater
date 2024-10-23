import java.util.Iterator;

public class ra extends ri {
   po ac;
   po ae;
   po at;

   public boolean ac(int var1) {
      try {
         int var2 = 0;
         Iterator var3 = mm.aq.iterator();

         while(true) {
            while(var3.hasNext()) {
               if (var1 != -1411718299) {
                  throw new IllegalStateException();
               }

               ns var4 = (ns)var3.next();
               if (null != var4) {
                  if (var1 != -1411718299) {
                     throw new IllegalStateException();
                  }

                  if (var4.al.bb * 1813270399 > 1) {
                     if (var1 != -1411718299) {
                        throw new IllegalStateException();
                     }

                     if (var4.al.ab(-1925109314)) {
                        if (var1 != -1411718299) {
                           throw new IllegalStateException();
                        }

                        this.al("Attempted to load patches of already loading midiplayer!", -65735155);
                        return true;
                     }
                  }
               }

               if (var4 != null) {
                  if (var1 != -1411718299) {
                     throw new IllegalStateException();
                  }

                  if (!var4.af) {
                     try {
                        if (var4.ac != null) {
                           if (var1 != -1411718299) {
                              throw new IllegalStateException();
                           }

                           if (1710436281 * var4.ae != -1) {
                              if (1578912913 * var4.ag != -1) {
                                 if (null == var4.ah) {
                                    if (var1 != -1411718299) {
                                       throw new IllegalStateException();
                                    }

                                    var4.ah = nk.ac(var4.ac, 1710436281 * var4.ae, 1578912913 * var4.ag);
                                    if (null == var4.ah) {
                                       if (var1 != -1411718299) {
                                          throw new IllegalStateException();
                                       }
                                       continue;
                                    }
                                 }

                                 if (var4.ad == null) {
                                    if (var1 != -1411718299) {
                                       throw new IllegalStateException();
                                    }

                                    var4.ad = new bo(this.at, this.ae);
                                 }

                                 if (var4.al.ag(var4.ah, this.ac, var4.ad, -384564894)) {
                                    ++var2;
                                    var4.af = true;
                                    var4.al.am((byte)-73);
                                 }
                                 continue;
                              }

                              if (var1 != -1411718299) {
                                 throw new IllegalStateException();
                              }
                           }
                        }

                        ++var2;
                        continue;
                     } catch (Exception var6) {
                        gc.ac((String)null, var6, (byte)-117);
                        this.al(var6.getMessage(), -65735155);
                        return true;
                     }
                  }

                  if (var1 != -1411718299) {
                     throw new IllegalStateException();
                  }
               }

               ++var2;
            }

            if (var2 == mm.aq.size()) {
               if (var1 != -1411718299) {
                  throw new IllegalStateException();
               }

               return true;
            }

            return false;
         }
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "ra.ac(" + ')');
      }
   }

   public boolean ag() {
      int var1 = 0;
      Iterator var2 = mm.aq.iterator();

      while(true) {
         while(var2.hasNext()) {
            ns var3 = (ns)var2.next();
            if (null != var3 && var3.al.bb * 1813270399 > 1 && var3.al.ab(168972720)) {
               this.al("Attempted to load patches of already loading midiplayer!", -65735155);
               return true;
            }

            if (var3 != null && !var3.af) {
               try {
                  if (var3.ac != null && 1710436281 * var3.ae != -1 && 1578912913 * var3.ag != -1) {
                     if (null == var3.ah) {
                        var3.ah = nk.ac(var3.ac, 1710436281 * var3.ae, 1578912913 * var3.ag);
                        if (null == var3.ah) {
                           continue;
                        }
                     }

                     if (var3.ad == null) {
                        var3.ad = new bo(this.at, this.ae);
                     }

                     if (var3.al.ag(var3.ah, this.ac, var3.ad, 632367465)) {
                        ++var1;
                        var3.af = true;
                        var3.al.am((byte)-124);
                     }
                  } else {
                     ++var1;
                  }
               } catch (Exception var5) {
                  gc.ac((String)null, var5, (byte)-64);
                  this.al(var5.getMessage(), -65735155);
                  return true;
               }
            } else {
               ++var1;
            }
         }

         if (var1 == mm.aq.size()) {
            return true;
         }

         return false;
      }
   }

   public ra(ri var1, po var2, po var3, po var4) {
      try {
         super(var1);
         this.ac = var2;
         this.ae = var3;
         this.at = var4;
         this.ax = "LoadSongTask";
      } catch (RuntimeException var5) {
         throw vk.ae(var5, "ra.<init>(" + ')');
      }
   }

   public static void ac(oc var0, byte var1) {
      try {
         ot.ac = var0;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ra.ac(" + ')');
      }
   }
}
