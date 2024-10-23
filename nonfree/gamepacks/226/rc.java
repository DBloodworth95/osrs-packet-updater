import java.util.Iterator;

public class rc extends ra {
   pe aw;
   pe ae;
   pe ap;
   static or fw;

   public rc(ra var1, pe var2, pe var3, pe var4) {
      try {
         super(var1);
         this.ap = var2;
         this.aw = var3;
         this.ae = var4;
         this.ai = "LoadSongTask";
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "rc.<init>(" + ')');
      }
   }

   public boolean aj() {
      int var1 = 0;
      Iterator var2 = mp.ay.iterator();

      while(true) {
         while(var2.hasNext()) {
            no var3 = (no)var2.next();
            if (var3 != null && var3.au.bn * 1630423797 > 1 && var3.au.ar(-679976900)) {
               this.au("Attempted to load patches of already loading midiplayer!", 634133961);
               return true;
            }

            if (var3 != null && !var3.as) {
               try {
                  if (var3.ap != null && -1 != -893316127 * var3.aw && -1 != var3.ak * 380940733) {
                     if (var3.ao == null) {
                        var3.ao = nv.ap(var3.ap, var3.aw * -893316127, 380940733 * var3.ak);
                        if (null == var3.ao) {
                           continue;
                        }
                     }

                     if (var3.an == null) {
                        var3.an = new ba(this.ae, this.aw);
                     }

                     if (var3.au.ak(var3.ao, this.ap, var3.an, 1516519213)) {
                        ++var1;
                        var3.as = true;
                        var3.au.aj((byte)63);
                     }
                  } else {
                     ++var1;
                  }
               } catch (Exception var5) {
                  rl.ap((String)null, var5, (byte)-94);
                  this.au(var5.getMessage(), 634133961);
                  return true;
               }
            } else {
               ++var1;
            }
         }

         if (var1 == mp.ay.size()) {
            return true;
         }

         return false;
      }
   }

   public boolean ak() {
      int var1 = 0;
      Iterator var2 = mp.ay.iterator();

      while(true) {
         while(var2.hasNext()) {
            no var3 = (no)var2.next();
            if (var3 != null && var3.au.bn * -1890660369 > 1 && var3.au.ar(-89251414)) {
               this.au("Attempted to load patches of already loading midiplayer!", 634133961);
               return true;
            }

            if (var3 != null && !var3.as) {
               try {
                  if (var3.ap != null && -1 != -893316127 * var3.aw && -1 != var3.ak * -720151872) {
                     if (var3.ao == null) {
                        var3.ao = nv.ap(var3.ap, var3.aw * -893316127, 380940733 * var3.ak);
                        if (null == var3.ao) {
                           continue;
                        }
                     }

                     if (var3.an == null) {
                        var3.an = new ba(this.ae, this.aw);
                     }

                     if (var3.au.ak(var3.ao, this.ap, var3.an, -333113509)) {
                        ++var1;
                        var3.as = true;
                        var3.au.aj((byte)72);
                     }
                  } else {
                     ++var1;
                  }
               } catch (Exception var5) {
                  rl.ap((String)null, var5, (byte)-8);
                  this.au(var5.getMessage(), 634133961);
                  return true;
               }
            } else {
               ++var1;
            }
         }

         if (var1 == mp.ay.size()) {
            return true;
         }

         return false;
      }
   }

   public boolean ap(int var1) {
      try {
         int var2 = 0;
         Iterator var3 = mp.ay.iterator();

         while(true) {
            while(var3.hasNext()) {
               if (var1 != 343486624) {
                  throw new IllegalStateException();
               }

               no var4 = (no)var3.next();
               if (var4 != null && var4.au.bn * 1630423797 > 1) {
                  if (var1 != 343486624) {
                     throw new IllegalStateException();
                  }

                  if (var4.au.ar(2093251940)) {
                     if (var1 != 343486624) {
                        throw new IllegalStateException();
                     }

                     this.au("Attempted to load patches of already loading midiplayer!", 634133961);
                     return true;
                  }
               }

               if (var4 != null) {
                  if (!var4.as) {
                     try {
                        if (var4.ap != null) {
                           if (var1 != 343486624) {
                              throw new IllegalStateException();
                           }

                           if (-1 != -893316127 * var4.aw) {
                              if (var1 != 343486624) {
                                 throw new IllegalStateException();
                              }

                              if (-1 != var4.ak * 380940733) {
                                 if (var4.ao == null) {
                                    if (var1 != 343486624) {
                                       throw new IllegalStateException();
                                    }

                                    var4.ao = nv.ap(var4.ap, var4.aw * -893316127, 380940733 * var4.ak);
                                    if (null == var4.ao) {
                                       if (var1 != 343486624) {
                                          throw new IllegalStateException();
                                       }
                                       continue;
                                    }
                                 }

                                 if (var4.an == null) {
                                    if (var1 != 343486624) {
                                       throw new IllegalStateException();
                                    }

                                    var4.an = new ba(this.ae, this.aw);
                                 }

                                 if (var4.au.ak(var4.ao, this.ap, var4.an, -619528733)) {
                                    ++var2;
                                    var4.as = true;
                                    var4.au.aj((byte)107);
                                 }
                                 continue;
                              }

                              if (var1 != 343486624) {
                                 throw new IllegalStateException();
                              }
                           }
                        }

                        ++var2;
                        continue;
                     } catch (Exception var6) {
                        rl.ap((String)null, var6, (byte)-127);
                        this.au(var6.getMessage(), 634133961);
                        return true;
                     }
                  }

                  if (var1 != 343486624) {
                     throw new IllegalStateException();
                  }
               }

               ++var2;
            }

            if (var2 == mp.ay.size()) {
               if (var1 != 343486624) {
                  throw new IllegalStateException();
               }

               return true;
            }

            return false;
         }
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "rc.ap(" + ')');
      }
   }
}
