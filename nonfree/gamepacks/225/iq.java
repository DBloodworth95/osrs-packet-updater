public abstract class iq {
   static final int ag = 1;
   static final int bb = 14;
   String am;
   // $FF: synthetic field
   final iy this$0;
   public static final int ae = 0;
   static final int ak = 26;

   public abstract int am();

   public String al() {
      return this.am;
   }

   public abstract int ac(byte var1);

   public String aq(int var1) {
      try {
         return null;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "iq.aq(" + ')');
      }
   }

   public String at() {
      return null;
   }

   public abstract int ag();

   public String au(byte var1) {
      try {
         return this.am;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "iq.au(" + ')');
      }
   }

   public int ax() {
      return -1;
   }

   public String af() {
      return null;
   }

   iq(iy var1, String var2) {
      try {
         this.this$0 = var1;
         super();
         this.am = var2;
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "iq.<init>(" + ')');
      }
   }

   public String ar() {
      return this.am;
   }

   public int ae(int var1) {
      try {
         return -1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "iq.ae(" + ')');
      }
   }

   static final boolean at(byte[] var0, int var1, int var2, int var3) {
      try {
         boolean var4 = true;
         vf var5 = new vf(var0);
         int var6 = -1;

         label116:
         do {
            label114:
            while(true) {
               int var7 = var5.df(-1054010182);
               if (var7 == 0) {
                  if (var3 == -117593501) {
                     throw new IllegalStateException();
                  }

                  return var4;
               }

               var6 += var7;
               int var8 = 0;
               boolean var9 = false;

               while(true) {
                  int var10;
                  while(!var9) {
                     var10 = var5.ck((byte)32);
                     if (0 == var10) {
                        if (var3 == -117593501) {
                           throw new IllegalStateException();
                        }
                        continue label114;
                     }

                     var8 += var10 - 1;
                     int var11 = var8 & 63;
                     int var12 = var8 >> 6 & 63;
                     int var13 = var5.cv(952452697) >> 2;
                     int var14 = var12 + var1;
                     int var15 = var11 + var2;
                     if (var14 > 0) {
                        if (var3 == -117593501) {
                           throw new IllegalStateException();
                        }

                        if (var15 > 0 && var14 < 103 && var15 < 103) {
                           if (var3 == -117593501) {
                              throw new IllegalStateException();
                           }

                           id var16 = kf.ae(var6, (byte)37);
                           if (var13 == 22) {
                              if (var3 == -117593501) {
                                 throw new IllegalStateException();
                              }

                              if (client.ci) {
                                 if (var3 == -117593501) {
                                    throw new IllegalStateException();
                                 }

                                 if (0 == -1478169491 * var16.ay) {
                                    if (var3 == -117593501) {
                                       throw new IllegalStateException();
                                    }

                                    if (1 != 891389023 * var16.ao && !var16.bi) {
                                       continue;
                                    }
                                 }
                              }
                           }

                           if (!var16.af(-1994687654)) {
                              if (var3 == -117593501) {
                                 throw new IllegalStateException();
                              }

                              client.im += -261387265;
                              var4 = false;
                           }

                           var9 = true;
                        }
                     }
                  }

                  var10 = var5.ck((byte)0);
                  if (var10 == 0) {
                     continue label116;
                  }

                  var5.cv(952452697);
               }
            }
         } while(var3 != -117593501);

         throw new IllegalStateException();
      } catch (RuntimeException var17) {
         throw vk.ae(var17, "iq.at(" + ')');
      }
   }
}
