public final class ka {
   public jv as;
   int ap;
   int ak;
   int aj;
   int ai;
   public jv ay;
   int aw;
   public long ae;
   int am;

   public static int ap(CharSequence var0, CharSequence var1, pn var2, byte var3) {
      try {
         int var4 = var0.length();
         int var5 = var1.length();
         int var6 = 0;
         int var7 = 0;
         byte var8 = 0;
         byte var9 = 0;

         while(true) {
            if (var6 - var8 >= var4) {
               if (var3 <= 36) {
                  throw new IllegalStateException();
               }

               if (var7 - var9 >= var5) {
                  if (var3 <= 36) {
                     throw new IllegalStateException();
                  }

                  int var18 = Math.min(var4, var5);

                  int var19;
                  char var22;
                  for(var19 = 0; var19 < var18; ++var19) {
                     if (var3 <= 36) {
                        throw new IllegalStateException();
                     }

                     if (var2 == pn.ak) {
                        if (var3 <= 36) {
                           throw new IllegalStateException();
                        }

                        var6 = var4 - 1 - var19;
                        var7 = var5 - 1 - var19;
                     } else {
                        var7 = var19;
                        var6 = var19;
                     }

                     char var20 = var0.charAt(var6);
                     var22 = var1.charAt(var7);
                     if (var22 != var20 && Character.toUpperCase(var20) != Character.toUpperCase(var22)) {
                        if (var3 <= 36) {
                           throw new IllegalStateException();
                        }

                        var20 = Character.toLowerCase(var20);
                        var22 = Character.toLowerCase(var22);
                        if (var20 != var22) {
                           if (var3 <= 36) {
                              throw new IllegalStateException();
                           }

                           return ry.ak(var20, var2, (short)30349) - ry.ak(var22, var2, (short)6113);
                        }
                     }
                  }

                  var19 = var4 - var5;
                  if (var19 != 0) {
                     return var19;
                  }

                  for(int var21 = 0; var21 < var18; ++var21) {
                     var22 = var0.charAt(var21);
                     char var14 = var1.charAt(var21);
                     if (var14 != var22) {
                        if (var3 <= 36) {
                           throw new IllegalStateException();
                        }

                        return ry.ak(var22, var2, (short)31070) - ry.ak(var14, var2, (short)7459);
                     }
                  }

                  return 0;
               }
            }

            if (var6 - var8 >= var4) {
               if (var3 <= 36) {
                  throw new IllegalStateException();
               }

               return -1;
            }

            if (var7 - var9 >= var5) {
               return 1;
            }

            char var10;
            if (var8 != 0) {
               if (var3 <= 36) {
                  throw new IllegalStateException();
               }

               var10 = (char)var8;
               boolean var16 = false;
            } else {
               var10 = var0.charAt(var6++);
            }

            char var11;
            if (var9 != 0) {
               if (var3 <= 36) {
                  throw new IllegalStateException();
               }

               var11 = (char)var9;
               boolean var17 = false;
            } else {
               var11 = var1.charAt(var7++);
            }

            byte var12;
            if (198 == var10) {
               if (var3 <= 36) {
                  throw new IllegalStateException();
               }

               var12 = 69;
            } else if (var10 == 230) {
               var12 = 101;
            } else if (223 == var10) {
               if (var3 <= 36) {
                  throw new IllegalStateException();
               }

               var12 = 115;
            } else if (var10 == 338) {
               if (var3 <= 36) {
                  throw new IllegalStateException();
               }

               var12 = 69;
            } else if (339 == var10) {
               if (var3 <= 36) {
                  throw new IllegalStateException();
               }

               var12 = 101;
            } else {
               var12 = 0;
            }

            var8 = var12;
            byte var13;
            if (var11 == 198) {
               if (var3 <= 36) {
                  throw new IllegalStateException();
               }

               var13 = 69;
            } else if (var11 == 230) {
               if (var3 <= 36) {
                  throw new IllegalStateException();
               }

               var13 = 101;
            } else if (223 == var11) {
               if (var3 <= 36) {
                  throw new IllegalStateException();
               }

               var13 = 115;
            } else if (var11 == 338) {
               if (var3 <= 36) {
                  throw new IllegalStateException();
               }

               var13 = 69;
            } else if (var11 == 339) {
               if (var3 <= 36) {
                  throw new IllegalStateException();
               }

               var13 = 101;
            } else {
               var13 = 0;
            }

            var9 = var13;
            var10 = dl.aw(var10, var2, (byte)-5);
            var11 = dl.aw(var11, var2, (byte)2);
            if (var11 != var10) {
               if (var3 <= 36) {
                  throw new IllegalStateException();
               }

               if (Character.toUpperCase(var10) != Character.toUpperCase(var11)) {
                  if (var3 <= 36) {
                     throw new IllegalStateException();
                  }

                  var10 = Character.toLowerCase(var10);
                  var11 = Character.toLowerCase(var11);
                  if (var10 != var11) {
                     if (var3 <= 36) {
                        throw new IllegalStateException();
                     }

                     return ry.ak(var10, var2, (short)13310) - ry.ak(var11, var2, (short)27314);
                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw tm.aw(var15, "ka.ap(" + ')');
      }
   }

   ka() {
      try {
         super();
         this.ae = 0L;
         this.am = 0;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ka.<init>(" + ')');
      }
   }

   static int aw(pe var0, byte var1) {
      try {
         int var2 = dq.dp.length + dq.dy.length;
         String[] var3 = dq.do;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            if (var1 >= 0) {
               throw new IllegalStateException();
            }

            String var5 = var3[var4];
            if (var0.cf(var5, (byte)90) != -1) {
               ++var2;
            }
         }

         return var2;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "ka.aw(" + ')');
      }
   }
}
