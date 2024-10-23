public class gs extends gu {
   static dd jj;
   // $FF: synthetic field
   final gj this$0;
   byte ag;
   int ae;
   String ac;
   public static final int bn = 1024;
   public static final int al = 256;
   static li ay;

   public static String ad(String var0, int var1) {
      try {
         int var2 = var0.length();
         char[] var3 = new char[var2];
         byte var4 = 2;

         for(int var5 = 0; var5 < var2; ++var5) {
            if (var1 != 2058281313) {
               throw new IllegalStateException();
            }

            char var6 = var0.charAt(var5);
            if (var4 == 0) {
               var6 = Character.toLowerCase(var6);
            } else {
               label90: {
                  if (2 != var4) {
                     if (var1 != 2058281313) {
                        throw new IllegalStateException();
                     }

                     if (!Character.isUpperCase(var6)) {
                        break label90;
                     }

                     if (var1 != 2058281313) {
                        throw new IllegalStateException();
                     }
                  }

                  var6 = kj.am(var6, (byte)-80);
               }
            }

            if (Character.isLetter(var6)) {
               if (var1 != 2058281313) {
                  throw new IllegalStateException();
               }

               var4 = 0;
            } else {
               label91: {
                  if ('.' != var6) {
                     if (var1 != 2058281313) {
                        throw new IllegalStateException();
                     }

                     if ('?' != var6) {
                        if (var1 != 2058281313) {
                           throw new IllegalStateException();
                        }

                        if (var6 != '!') {
                           if (Character.isSpaceChar(var6)) {
                              if (var1 != 2058281313) {
                                 throw new IllegalStateException();
                              }

                              if (var4 != 2) {
                                 if (var1 != 2058281313) {
                                    throw new IllegalStateException();
                                 }

                                 var4 = 1;
                              }
                           } else {
                              var4 = 1;
                           }
                           break label91;
                        }
                     }
                  }

                  var4 = 2;
               }
            }

            var3[var5] = var6;
         }

         return new String(var3);
      } catch (RuntimeException var7) {
         throw vk.ae(var7, "gs.ad(" + ')');
      }
   }

   void ac(vf var1, byte var2) {
      try {
         if (var1.cv(952452697) != 255) {
            if (var2 != 0) {
               return;
            }

            var1.au -= -1864458299;
            var1.cw(1991892425);
         }

         this.ac = var1.ca(-1610363009);
         this.ae = var1.ct(-1867239747) * -1758486225;
         this.ag = var1.cg((short)7428);
         var1.cw(1252610456);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "gs.ac(" + ')');
      }
   }

   void ag(gm var1) {
      fy var2 = new fy();
      var2.ag = new wf(this.ac);
      var2.ae = 1299247076 * this.ae;
      var2.ac = this.ag;
      var1.ae(var2, (byte)9);
   }

   gs(gj var1) {
      try {
         this.this$0 = var1;
         super();
         this.ac = null;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "gs.<init>(" + ')');
      }
   }

   void am(gm var1) {
      fy var2 = new fy();
      var2.ag = new wf(this.ac);
      var2.ae = -588238907 * this.ae;
      var2.ac = this.ag;
      var1.ae(var2, (byte)9);
   }

   void ax(gm var1) {
      fy var2 = new fy();
      var2.ag = new wf(this.ac);
      var2.ae = -588238907 * this.ae;
      var2.ac = this.ag;
      var1.ae(var2, (byte)9);
   }

   static final void iz(boolean var0, byte var1) {
      try {
         fv var10000;
         if (var0) {
            if (var1 != 1) {
               throw new IllegalStateException();
            }

            if (dp.ck) {
               if (var1 != 1) {
                  throw new IllegalStateException();
               }

               var10000 = fv.ae;
            } else {
               var10000 = fv.am;
            }

            client.fl = var10000;
         } else {
            if (re.vt.bf(dp.cj, 1711665822)) {
               if (var1 != 1) {
                  throw new IllegalStateException();
               }

               var10000 = fv.ac;
            } else {
               var10000 = fv.ag;
            }

            client.fl = var10000;
         }

      } catch (RuntimeException var2) {
         throw vk.ae(var2, "gs.iz(" + ')');
      }
   }

   void af(gm var1) {
      fy var2 = new fy();
      var2.ag = new wf(this.ac);
      var2.ae = 1515288096 * this.ae;
      var2.ac = this.ag;
      var1.ae(var2, (byte)9);
   }

   void at(vf var1) {
      if (var1.cv(952452697) != 255) {
         var1.au -= -1864458299;
         var1.cw(1385147504);
      }

      this.ac = var1.ca(-1917455866);
      this.ae = var1.ct(-1885914806) * -1758486225;
      this.ag = var1.cg((short)-10371);
      var1.cw(1999970639);
   }

   void ae(gm var1, int var2) {
      try {
         fy var3 = new fy();
         var3.ag = new wf(this.ac);
         var3.ae = -588238907 * this.ae;
         var3.ac = this.ag;
         var1.ae(var3, (byte)9);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "gs.ae(" + ')');
      }
   }

   void aq(gm var1) {
      fy var2 = new fy();
      var2.ag = new wf(this.ac);
      var2.ae = -588238907 * this.ae;
      var2.ac = this.ag;
      var1.ae(var2, (byte)9);
   }
}
