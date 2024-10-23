public class ed extends se {
   static final int ar = 9;
   public static final int bd = 27;
   public static final int ay = 39;
   public static final String jm = "";
   final boolean ac;

   public static byte[] ax(CharSequence var0, int var1) {
      try {
         int var2 = var0.length();
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < var2; ++var4) {
            if (var1 != -1528057279) {
               throw new IllegalStateException();
            }

            char var5;
            label210: {
               var5 = var0.charAt(var4);
               if (var5 > 0) {
                  if (var1 != -1528057279) {
                     throw new IllegalStateException();
                  }

                  if (var5 < 128) {
                     break label210;
                  }

                  if (var1 != -1528057279) {
                     throw new IllegalStateException();
                  }
               }

               if (var5 >= 160) {
                  if (var1 != -1528057279) {
                     throw new IllegalStateException();
                  }

                  if (var5 <= 255) {
                     if (var1 != -1528057279) {
                        throw new IllegalStateException();
                     }
                     break label210;
                  }
               }

               if (var5 == 8364) {
                  var3[var4] = -128;
               } else if (8218 == var5) {
                  if (var1 != -1528057279) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -126;
               } else if (var5 == 402) {
                  if (var1 != -1528057279) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -125;
               } else if (var5 == 8222) {
                  if (var1 != -1528057279) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -124;
               } else if (8230 == var5) {
                  if (var1 != -1528057279) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -123;
               } else if (var5 == 8224) {
                  if (var1 != -1528057279) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -122;
               } else if (8225 == var5) {
                  if (var1 != -1528057279) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -121;
               } else if (var5 == 710) {
                  var3[var4] = -120;
               } else if (var5 == 8240) {
                  if (var1 != -1528057279) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -119;
               } else if (352 == var5) {
                  var3[var4] = -118;
               } else if (8249 == var5) {
                  if (var1 != -1528057279) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -117;
               } else if (338 == var5) {
                  var3[var4] = -116;
               } else if (var5 == 381) {
                  if (var1 != -1528057279) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -114;
               } else if (8216 == var5) {
                  if (var1 != -1528057279) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -111;
               } else if (var5 == 8217) {
                  var3[var4] = -110;
               } else if (8220 == var5) {
                  var3[var4] = -109;
               } else if (var5 == 8221) {
                  if (var1 != -1528057279) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -108;
               } else if (var5 == 8226) {
                  if (var1 != -1528057279) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -107;
               } else if (8211 == var5) {
                  var3[var4] = -106;
               } else if (8212 == var5) {
                  if (var1 != -1528057279) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -105;
               } else if (732 == var5) {
                  var3[var4] = -104;
               } else if (8482 == var5) {
                  if (var1 != -1528057279) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -103;
               } else if (353 == var5) {
                  if (var1 != -1528057279) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -102;
               } else if (8250 == var5) {
                  if (var1 != -1528057279) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -101;
               } else if (339 == var5) {
                  var3[var4] = -100;
               } else if (var5 == 382) {
                  var3[var4] = -98;
               } else if (var5 == 376) {
                  if (var1 != -1528057279) {
                     throw new IllegalStateException();
                  }

                  var3[var4] = -97;
               } else {
                  var3[var4] = 63;
               }
               continue;
            }

            var3[var4] = (byte)var5;
         }

         return var3;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ed.ax(" + ')');
      }
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.ac((sq)var1, (sq)var2, 1786812741);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ed.compare(" + ')');
      }
   }

   public int af(Object var1, Object var2) {
      return this.ac((sq)var1, (sq)var2, 524256957);
   }

   public int ax(Object var1, Object var2) {
      return this.ac((sq)var1, (sq)var2, -66072511);
   }

   public int aq(Object var1, Object var2) {
      return this.ac((sq)var1, (sq)var2, 267083960);
   }

   public ed(boolean var1) {
      try {
         super();
         this.ac = var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ed.<init>(" + ')');
      }
   }

   int ae(sq var1, sq var2) {
      if (var1.ax * -1744892407 != 0) {
         if (-1744892407 * var2.ax == 0) {
            return this.ac ? -1 : 1;
         }
      } else if (0 != var2.ax * -1744892407) {
         return this.ac ? 1 : -1;
      }

      return this.ar(var1, var2, (byte)51);
   }

   int ag(sq var1, sq var2) {
      if (var1.ax * -1744892407 != 0) {
         if (-1744892407 * var2.ax == 0) {
            return this.ac ? -1 : 1;
         }
      } else if (0 != var2.ax * -1744892407) {
         return this.ac ? 1 : -1;
      }

      return this.ar(var1, var2, (byte)-45);
   }

   int am(sq var1, sq var2) {
      if (var1.ax * -1744892407 != 0) {
         if (-1744892407 * var2.ax == 0) {
            return this.ac ? -1 : 1;
         }
      } else if (0 != var2.ax * -1744892407) {
         return this.ac ? 1 : -1;
      }

      return this.ar(var1, var2, (byte)-109);
   }

   static final void nd(int var0, byte var1) {
      try {
         var0 = Math.max(Math.min(var0, 100), 0);
         var0 = 100 - var0;
         float var2 = (float)var0 / 200.0F + 0.5F;
         fe.nr((double)var2);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ed.nd(" + ')');
      }
   }

   int ac(sq var1, sq var2, int var3) {
      try {
         byte var10000;
         if (var1.ax * -1744892407 != 0) {
            if (var3 == -1343984963) {
               throw new IllegalStateException();
            }

            if (-1744892407 * var2.ax == 0) {
               if (var3 == -1343984963) {
                  throw new IllegalStateException();
               }

               if (this.ac) {
                  if (var3 == -1343984963) {
                     throw new IllegalStateException();
                  }

                  var10000 = -1;
               } else {
                  var10000 = 1;
               }

               return var10000;
            }
         } else if (0 != var2.ax * -1744892407) {
            if (var3 == -1343984963) {
               throw new IllegalStateException();
            }

            if (this.ac) {
               if (var3 == -1343984963) {
                  throw new IllegalStateException();
               }

               var10000 = 1;
            } else {
               var10000 = -1;
            }

            return var10000;
         }

         return this.ar(var1, var2, (byte)-43);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ed.ac(" + ')');
      }
   }
}
