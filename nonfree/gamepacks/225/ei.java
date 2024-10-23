import java.awt.Font;
import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ei {
   public static final int ao = 28;
   static final String ae = "2";
   boolean[] ag;
   Map am;
   /** @deprecated */
   @Deprecated
   String[] ax;
   static final int ac = 2;
   long af;
   boolean aq;
   static final int ab = 1170;
   public static final int az = 32;
   static Font bd;
   static boolean ev;

   public static oj ac(int var0, int var1) {
      try {
         oj[] var2 = new oj[]{oj.ag, oj.am, oj.ac, oj.ae};
         oj[] var3 = var2;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            oj var5 = var3[var4];
            if (var0 == var5.aq * -528818889) {
               if (var1 <= 1490460123) {
                  throw new IllegalStateException();
               }

               return var5;
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "ei.ac(" + ')');
      }
   }

   void ar(int var1) {
      try {
         ud var2 = this.at(false, 23297698);
         boolean var23 = false;

         label333: {
            label332: {
               label331: {
                  label338: {
                     try {
                        var23 = true;
                        byte[] var3 = new byte[(int)var2.ax(1577091935)];

                        int var5;
                        for(int var4 = 0; var4 < var3.length; var4 += var5) {
                           var5 = var2.aq(var3, var4, var3.length - var4, (byte)0);
                           if (var5 == -1) {
                              throw new EOFException();
                           }
                        }

                        vf var32 = new vf(var3);
                        if (var32.at.length - var32.au * -1027766515 < 1) {
                           if (var1 != 1998721527) {
                              throw new IllegalStateException();
                           }

                           var23 = false;
                           break label333;
                        }

                        int var6 = var32.cv(952452697);
                        if (var6 >= 0) {
                           if (var1 != 1998721527) {
                              throw new IllegalStateException();
                           }

                           if (var6 <= 2) {
                              int var7;
                              int var8;
                              int var9;
                              int var10;
                              if (var6 >= 2) {
                                 var7 = var32.ct(-1738038512);

                                 for(var8 = 0; var8 < var7; ++var8) {
                                    if (var1 != 1998721527) {
                                       throw new IllegalStateException();
                                    }

                                    var9 = var32.ct(-1433697458);
                                    var10 = var32.cv(952452697);
                                    ux var11 = (ux)ox.ac(ux.ax(418421508), var10, 1554523660);
                                    Object var12 = var11.at(var32, -1237041641);
                                    if (var9 >= 0) {
                                       if (var1 != 1998721527) {
                                          throw new IllegalStateException();
                                       }

                                       if (var9 < this.ag.length) {
                                          if (var1 != 1998721527) {
                                             throw new IllegalStateException();
                                          }

                                          if (this.ag[var9]) {
                                             if (var1 != 1998721527) {
                                                throw new IllegalStateException();
                                             }

                                             this.am.put(var9, var12);
                                          }
                                       }
                                    }
                                 }

                                 var23 = false;
                                 break label338;
                              }

                              var7 = var32.ct(-1998018739);

                              for(var8 = 0; var8 < var7; ++var8) {
                                 var9 = var32.ct(-2134196623);
                                 var10 = var32.cz(-1734056172);
                                 if (var9 >= 0) {
                                    if (var1 != 1998721527) {
                                       throw new IllegalStateException();
                                    }

                                    if (var9 < this.ag.length && this.ag[var9]) {
                                       if (var1 != 1998721527) {
                                          throw new IllegalStateException();
                                       }

                                       this.am.put(var9, var10);
                                    }
                                 }
                              }

                              var8 = var32.ct(-1772420513);

                              for(var9 = 0; var9 < var8; ++var9) {
                                 if (var1 != 1998721527) {
                                    throw new IllegalStateException();
                                 }

                                 var32.ct(-1903566001);
                                 var32.cs(-1579983402);
                              }

                              var23 = false;
                              break label338;
                           }

                           if (var1 != 1998721527) {
                              throw new IllegalStateException();
                           }

                           var23 = false;
                        } else {
                           var23 = false;
                        }
                     } catch (Exception var29) {
                        var23 = false;
                        break label331;
                     } finally {
                        if (var23) {
                           try {
                              var2.ag((byte)-30);
                           } catch (Exception var24) {
                           }

                        }
                     }

                     try {
                        var2.ag((byte)-45);
                     } catch (Exception var28) {
                     }

                     return;
                  }

                  try {
                     var2.ag((byte)-16);
                  } catch (Exception var27) {
                  }
                  break label332;
               }

               try {
                  var2.ag((byte)-58);
               } catch (Exception var26) {
               }
            }

            this.aq = false;
            return;
         }

         try {
            var2.ag((byte)-23);
         } catch (Exception var25) {
         }

      } catch (RuntimeException var31) {
         throw vk.ae(var31, "ei.ar(" + ')');
      }
   }

   /** @deprecated */
   @Deprecated
   String aq(int var1, byte var2) {
      try {
         return this.ax[var1];
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ei.aq(" + ')');
      }
   }

   int az(int var1) {
      Object var2 = this.am.get(var1);
      return var2 instanceof Integer ? (Integer)var2 : -1;
   }

   String am(int var1, byte var2) {
      try {
         Object var3 = this.am.get(var1);
         return var3 instanceof String ? (String)var3 : "";
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ei.am(" + ')');
      }
   }

   /** @deprecated */
   @Deprecated
   void ax(int var1, String var2, byte var3) {
      try {
         this.ax[var1] = var2;
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ei.ax(" + ')');
      }
   }

   void bb() {
      if (this.aq && this.af * -669490880088972507L < hf.ac(-1598214665) - 60000L) {
         this.au(921781230);
      }

   }

   void ba() {
      ud var1 = this.at(true, -539732541);
      boolean var17 = false;

      label128: {
         label127: {
            try {
               var17 = true;
               int var2 = 3;
               int var3 = 0;
               Iterator var4 = this.am.entrySet().iterator();

               while(var4.hasNext()) {
                  Entry var5 = (Entry)var4.next();
                  int var6 = (Integer)var5.getKey();
                  if (this.ag[var6]) {
                     Object var7 = var5.getValue();
                     var2 += 3;
                     if (var7 instanceof Integer) {
                        var2 += 4;
                     } else if (var7 instanceof String) {
                        var2 += uo.be((String)var7, 713566626);
                     }

                     ++var3;
                  }
               }

               vf var23 = new vf(var2);
               var23.bu(2, (byte)-48);
               var23.br(var3, 1625888552);
               Iterator var24 = this.am.entrySet().iterator();

               while(var24.hasNext()) {
                  Entry var25 = (Entry)var24.next();
                  int var26 = (Integer)var25.getKey();
                  if (this.ag[var26]) {
                     var23.br(var26, 1625888552);
                     Object var8 = var25.getValue();
                     ux var9 = ux.aq(var8.getClass(), -809248768);
                     var23.bu(-266704093 * var9.ax, (byte)53);
                     ux.af(var8, var23, 1546122059);
                  }
               }

               var1.ae(var23.at, 0, var23.au * -1027766515, 959317576);
               var17 = false;
               break label127;
            } catch (Exception var21) {
               var17 = false;
            } finally {
               if (var17) {
                  try {
                     var1.ag((byte)-28);
                  } catch (Exception var18) {
                  }

               }
            }

            try {
               var1.ag((byte)-71);
            } catch (Exception var19) {
            }
            break label128;
         }

         try {
            var1.ag((byte)-105);
         } catch (Exception var20) {
         }
      }

      this.aq = false;
      this.af = hf.ac(-1598214665) * 1409314726347178157L;
   }

   void aa(int var1, String var2) {
      this.am.put(var1, var2);
   }

   void au(int var1) {
      try {
         ud var2 = this.at(true, -403363419);
         boolean var19 = false;

         label174: {
            label173: {
               try {
                  var19 = true;
                  int var3 = 3;
                  int var4 = 0;
                  Iterator var5 = this.am.entrySet().iterator();

                  while(var5.hasNext()) {
                     if (var1 <= 844691753) {
                        return;
                     }

                     Entry var6 = (Entry)var5.next();
                     int var7 = (Integer)var6.getKey();
                     if (this.ag[var7]) {
                        if (var1 <= 844691753) {
                           throw new IllegalStateException();
                        }

                        Object var8 = var6.getValue();
                        var3 += 3;
                        if (var8 instanceof Integer) {
                           if (var1 <= 844691753) {
                              throw new IllegalStateException();
                           }

                           var3 += 4;
                        } else if (var8 instanceof String) {
                           if (var1 <= 844691753) {
                              return;
                           }

                           var3 += uo.be((String)var8, 377774510);
                        }

                        ++var4;
                     }
                  }

                  vf var26 = new vf(var3);
                  var26.bu(2, (byte)-63);
                  var26.br(var4, 1625888552);
                  Iterator var27 = this.am.entrySet().iterator();

                  while(var27.hasNext()) {
                     Entry var28 = (Entry)var27.next();
                     int var29 = (Integer)var28.getKey();
                     if (this.ag[var29]) {
                        if (var1 <= 844691753) {
                           throw new IllegalStateException();
                        }

                        var26.br(var29, 1625888552);
                        Object var9 = var28.getValue();
                        ux var10 = ux.aq(var9.getClass(), -200880612);
                        var26.bu(-266704093 * var10.ax, (byte)0);
                        ux.af(var9, var26, 57278149);
                     }
                  }

                  var2.ae(var26.at, 0, var26.au * -1027766515, 1376352998);
                  var19 = false;
                  break label173;
               } catch (Exception var23) {
                  var19 = false;
               } finally {
                  if (var19) {
                     try {
                        var2.ag((byte)-47);
                     } catch (Exception var20) {
                     }

                  }
               }

               try {
                  var2.ag((byte)-86);
               } catch (Exception var21) {
               }
               break label174;
            }

            try {
               var2.ag((byte)-48);
            } catch (Exception var22) {
            }
         }

         this.aq = false;
         this.af = hf.ac(-1598214665) * 1409314726347178157L;
      } catch (RuntimeException var25) {
         throw vk.ae(var25, "ei.au(" + ')');
      }
   }

   void ag(int var1, String var2, int var3) {
      try {
         this.am.put(var1, var2);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ei.ag(" + ')');
      }
   }

   void al(int var1) {
      try {
         if (this.aq) {
            if (var1 != 981958628) {
               throw new IllegalStateException();
            }

            if (this.af * -669490880088972507L < hf.ac(-1598214665) - 60000L) {
               this.au(1565218499);
            }
         }

      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ei.al(" + ')');
      }
   }

   boolean ad(byte var1) {
      try {
         return this.aq;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "ei.ad(" + ')');
      }
   }

   void ah(int var1, int var2) {
      this.am.put(var1, var2);
      if (this.ag[var1]) {
         this.aq = true;
      }

   }

   void ap(int var1, int var2) {
      this.am.put(var1, var2);
      if (this.ag[var1]) {
         this.aq = true;
      }

   }

   void ab(int var1, int var2) {
      this.am.put(var1, var2);
      if (this.ag[var1]) {
         this.aq = true;
      }

   }

   int ae(int var1, byte var2) {
      try {
         Object var3 = this.am.get(var1);
         if (var3 instanceof Integer) {
            if (var2 <= 1) {
               throw new IllegalStateException();
            } else {
               return (Integer)var3;
            }
         } else {
            return -1;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ei.ae(" + ')');
      }
   }

   void bj() {
      ud var1 = this.at(true, 46040769);
      boolean var17 = false;

      label128: {
         label127: {
            try {
               var17 = true;
               int var2 = 3;
               int var3 = 0;
               Iterator var4 = this.am.entrySet().iterator();

               while(var4.hasNext()) {
                  Entry var5 = (Entry)var4.next();
                  int var6 = (Integer)var5.getKey();
                  if (this.ag[var6]) {
                     Object var7 = var5.getValue();
                     var2 += 3;
                     if (var7 instanceof Integer) {
                        var2 += 4;
                     } else if (var7 instanceof String) {
                        var2 += uo.be((String)var7, 639727454);
                     }

                     ++var3;
                  }
               }

               vf var23 = new vf(var2);
               var23.bu(2, (byte)15);
               var23.br(var3, 1625888552);
               Iterator var24 = this.am.entrySet().iterator();

               while(var24.hasNext()) {
                  Entry var25 = (Entry)var24.next();
                  int var26 = (Integer)var25.getKey();
                  if (this.ag[var26]) {
                     var23.br(var26, 1625888552);
                     Object var8 = var25.getValue();
                     ux var9 = ux.aq(var8.getClass(), -527667806);
                     var23.bu(-266704093 * var9.ax, (byte)-42);
                     ux.af(var8, var23, 1358980636);
                  }
               }

               var1.ae(var23.at, 0, var23.au * -1027766515, 1111436679);
               var17 = false;
               break label127;
            } catch (Exception var21) {
               var17 = false;
            } finally {
               if (var17) {
                  try {
                     var1.ag((byte)-19);
                  } catch (Exception var18) {
                  }

               }
            }

            try {
               var1.ag((byte)-66);
            } catch (Exception var19) {
            }
            break label128;
         }

         try {
            var1.ag((byte)-91);
         } catch (Exception var20) {
         }
      }

      this.aq = false;
      this.af = hf.ac(-1598214665) * 1409314726347178157L;
   }

   void as(int var1, String var2) {
      this.am.put(var1, var2);
   }

   ei() {
      try {
         super();
         this.aq = false;
         int var1 = ch.ec.cj(19, (byte)94);
         this.am = new HashMap();
         this.ag = new boolean[var1];

         int var2;
         for(var2 = 0; var2 < var1; ++var2) {
            he var3 = ea.ae(var2, 844691753);
            this.ag[var2] = var3.ag;
         }

         var2 = 0;
         if (ch.ec.ad(15, 2144621165)) {
            var2 = ch.ec.cj(15, (byte)69);
         }

         this.ax = new String[var2];
         this.ar(1998721527);
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ei.<init>(" + ')');
      }
   }

   void bi() {
      if (this.aq && this.af * -669490880088972507L < hf.ac(-1598214665) - 60000L) {
         this.au(1079911015);
      }

   }

   void ay(int var1, String var2) {
      this.am.put(var1, var2);
   }

   void aj(int var1, String var2) {
      this.am.put(var1, var2);
   }

   String av(int var1) {
      Object var2 = this.am.get(var1);
      return var2 instanceof String ? (String)var2 : "";
   }

   String aw(int var1) {
      Object var2 = this.am.get(var1);
      return var2 instanceof String ? (String)var2 : "";
   }

   String an(int var1) {
      Object var2 = this.am.get(var1);
      return var2 instanceof String ? (String)var2 : "";
   }

   /** @deprecated */
   @Deprecated
   void ak(int var1, String var2) {
      this.ax[var1] = var2;
   }

   /** @deprecated */
   @Deprecated
   void bn(int var1, String var2) {
      this.ax[var1] = var2;
   }

   /** @deprecated */
   @Deprecated
   void bh(int var1, String var2) {
      this.ax[var1] = var2;
   }

   /** @deprecated */
   @Deprecated
   void bd(int var1, String var2) {
      this.ax[var1] = var2;
   }

   /** @deprecated */
   @Deprecated
   String bx(int var1) {
      return this.ax[var1];
   }

   void bf() {
      int var1;
      for(var1 = 0; var1 < this.ag.length; ++var1) {
         if (!this.ag[var1]) {
            this.am.remove(var1);
         }
      }

      for(var1 = 0; var1 < this.ax.length; ++var1) {
         this.ax[var1] = null;
      }

   }

   void bm() {
      int var1;
      for(var1 = 0; var1 < this.ag.length; ++var1) {
         if (!this.ag[var1]) {
            this.am.remove(var1);
         }
      }

      for(var1 = 0; var1 < this.ax.length; ++var1) {
         this.ax[var1] = null;
      }

   }

   ud bs(boolean var1) {
      return oh.ae("2", mw.cm.af, var1, (byte)66);
   }

   ud bw(boolean var1) {
      return oh.ae("2", mw.cm.af, var1, (byte)55);
   }

   ud at(boolean var1, int var2) {
      try {
         return oh.ae("2", mw.cm.af, var1, (byte)111);
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ei.at(" + ')');
      }
   }

   void ai(int var1, String var2) {
      this.am.put(var1, var2);
   }

   void ao(int var1, String var2) {
      this.am.put(var1, var2);
   }

   void by() {
      ud var1 = this.at(false, -238154768);
      boolean var21 = false;

      label253: {
         label254: {
            label247: {
               label246: {
                  try {
                     var21 = true;
                     byte[] var2 = new byte[(int)var1.ax(389351333)];

                     int var4;
                     for(int var3 = 0; var3 < var2.length; var3 += var4) {
                        var4 = var1.aq(var2, var3, var2.length - var3, (byte)0);
                        if (var4 == -1) {
                           throw new EOFException();
                        }
                     }

                     vf var29 = new vf(var2);
                     if (var29.at.length - var29.au * -1027766515 < 1) {
                        var21 = false;
                        break label247;
                     }

                     int var5 = var29.cv(952452697);
                     if (var5 < 0) {
                        var21 = false;
                        break label254;
                     }

                     if (var5 > 2) {
                        var21 = false;
                        break label254;
                     }

                     int var6;
                     int var7;
                     int var8;
                     int var9;
                     if (var5 >= 2) {
                        var6 = var29.ct(-1459804260);

                        for(var7 = 0; var7 < var6; ++var7) {
                           var8 = var29.ct(-1999395470);
                           var9 = var29.cv(952452697);
                           ux var10 = (ux)ox.ac(ux.ax(-69682922), var9, 1545672375);
                           Object var11 = var10.at(var29, -941454638);
                           if (var8 >= 0 && var8 < this.ag.length && this.ag[var8]) {
                              this.am.put(var8, var11);
                           }
                        }

                        var21 = false;
                     } else {
                        var6 = var29.ct(-1698632004);

                        for(var7 = 0; var7 < var6; ++var7) {
                           var8 = var29.ct(-2139589282);
                           var9 = var29.cz(-1734056172);
                           if (var8 >= 0 && var8 < this.ag.length && this.ag[var8]) {
                              this.am.put(var8, var9);
                           }
                        }

                        var7 = var29.ct(-1959559337);

                        for(var8 = 0; var8 < var7; ++var8) {
                           var29.ct(-1798782018);
                           var29.cs(2022590028);
                        }

                        var21 = false;
                     }
                  } catch (Exception var27) {
                     var21 = false;
                     break label246;
                  } finally {
                     if (var21) {
                        try {
                           var1.ag((byte)-42);
                        } catch (Exception var22) {
                        }

                     }
                  }

                  try {
                     var1.ag((byte)-45);
                  } catch (Exception var25) {
                  }
                  break label253;
               }

               try {
                  var1.ag((byte)-1);
               } catch (Exception var24) {
               }
               break label253;
            }

            try {
               var1.ag((byte)-25);
            } catch (Exception var23) {
            }

            return;
         }

         try {
            var1.ag((byte)-70);
         } catch (Exception var26) {
         }

         return;
      }

      this.aq = false;
   }

   void ac(int var1, int var2, int var3) {
      try {
         this.am.put(var1, var2);
         if (this.ag[var1]) {
            if (var3 <= -1212696832) {
               throw new IllegalStateException();
            }

            this.aq = true;
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ei.ac(" + ')');
      }
   }

   void af(int var1) {
      try {
         int var2;
         for(var2 = 0; var2 < this.ag.length; ++var2) {
            if (var1 == -1451562680) {
               throw new IllegalStateException();
            }

            if (!this.ag[var2]) {
               if (var1 == -1451562680) {
                  return;
               }

               this.am.remove(var2);
            }
         }

         for(var2 = 0; var2 < this.ax.length; ++var2) {
            if (var1 == -1451562680) {
               return;
            }

            this.ax[var2] = null;
         }

      } catch (RuntimeException var3) {
         throw vk.ae(var3, "ei.af(" + ')');
      }
   }

   void bg() {
      if (this.aq && this.af * -669490880088972507L < hf.ac(-1598214665) - 60000L) {
         this.au(1946726819);
      }

   }

   boolean bl() {
      return this.aq;
   }

   boolean bz() {
      return this.aq;
   }

   void bp() {
      ud var1 = this.at(false, -369270767);
      boolean var21 = false;

      label253: {
         label254: {
            label247: {
               label246: {
                  try {
                     var21 = true;
                     byte[] var2 = new byte[(int)var1.ax(1530228721)];

                     int var4;
                     for(int var3 = 0; var3 < var2.length; var3 += var4) {
                        var4 = var1.aq(var2, var3, var2.length - var3, (byte)0);
                        if (var4 == -1) {
                           throw new EOFException();
                        }
                     }

                     vf var29 = new vf(var2);
                     if (var29.at.length - var29.au * -1027766515 < 1) {
                        var21 = false;
                        break label247;
                     }

                     int var5 = var29.cv(952452697);
                     if (var5 < 0) {
                        var21 = false;
                        break label254;
                     }

                     if (var5 > 2) {
                        var21 = false;
                        break label254;
                     }

                     int var6;
                     int var7;
                     int var8;
                     int var9;
                     if (var5 >= 2) {
                        var6 = var29.ct(-1796317468);

                        for(var7 = 0; var7 < var6; ++var7) {
                           var8 = var29.ct(-1432239384);
                           var9 = var29.cv(952452697);
                           ux var10 = (ux)ox.ac(ux.ax(1064120596), var9, 1480005235);
                           Object var11 = var10.at(var29, -1578066607);
                           if (var8 >= 0 && var8 < this.ag.length && this.ag[var8]) {
                              this.am.put(var8, var11);
                           }
                        }

                        var21 = false;
                     } else {
                        var6 = var29.ct(-1426698302);

                        for(var7 = 0; var7 < var6; ++var7) {
                           var8 = var29.ct(-1917459786);
                           var9 = var29.cz(-1734056172);
                           if (var8 >= 0 && var8 < this.ag.length && this.ag[var8]) {
                              this.am.put(var8, var9);
                           }
                        }

                        var7 = var29.ct(-1420117363);

                        for(var8 = 0; var8 < var7; ++var8) {
                           var29.ct(-2143241315);
                           var29.cs(-697799812);
                        }

                        var21 = false;
                     }
                  } catch (Exception var27) {
                     var21 = false;
                     break label246;
                  } finally {
                     if (var21) {
                        try {
                           var1.ag((byte)-20);
                        } catch (Exception var22) {
                        }

                     }
                  }

                  try {
                     var1.ag((byte)-114);
                  } catch (Exception var25) {
                  }
                  break label253;
               }

               try {
                  var1.ag((byte)-45);
               } catch (Exception var24) {
               }
               break label253;
            }

            try {
               var1.ag((byte)-10);
            } catch (Exception var23) {
            }

            return;
         }

         try {
            var1.ag((byte)-76);
         } catch (Exception var26) {
         }

         return;
      }

      this.aq = false;
   }
}
