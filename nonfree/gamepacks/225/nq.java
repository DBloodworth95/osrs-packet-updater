public class nq extends bk {
   bb ag;
   pk ae;
   ms ac;
   public static byte[][] au;

   protected void bu(int var1) {
      this.ag.al(var1);

      for(nb var3 = (nb)this.ae.af(); var3 != null; var3 = (nb)this.ae.au()) {
         if (!this.ac.ch(var3, (byte)38)) {
            int var2 = var1;

            do {
               if (var2 <= 601813091 * var3.as) {
                  this.ae(var3, var2, (byte)77);
                  var3.as -= var2 * -1003286197;
                  break;
               }

               this.ae(var3, var3.as * 601813091, (byte)126);
               var2 -= var3.as * 601813091;
            } while(!this.ac.cf(var3, (int[])null, 0, var2, -1507742168));
         }
      }

   }

   protected bk aq() {
      try {
         nb var1 = (nb)this.ae.af();
         if (null == var1) {
            return null;
         } else {
            return (bk)(var1.ao != null ? var1.ao : this.af());
         }
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "nq.aq(" + ')');
      }
   }

   protected bk af() {
      try {
         nb var1;
         do {
            var1 = (nb)this.ae.au();
            if (null == var1) {
               return null;
            }
         } while(null == var1.ao);

         return var1.ao;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "nq.af(" + ')');
      }
   }

   void ag(nb var1, int[] var2, int var3, int var4, int var5) {
      if ((this.ac.as[var1.ac * 1383258553] & 4) != 0 && var1.ab * -1783172009 < 0) {
         int var6 = this.ac.an[1383258553 * var1.ac] / (-1578400357 * bz.ax);

         while(true) {
            int var7 = (1048575 + var6 - var1.aj * 1429130885) / var6;
            if (var7 > var4) {
               var1.aj += 229046861 * var6 * var4;
               break;
            }

            var1.ao.au(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.aj += 229046861 * (var7 * var6 - 1048576);
            int var8 = bz.ax * -1578400357 / 100;
            int var9 = 262144 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            bq var10 = var1.ao;
            if (this.ac.av[var1.ac * 1383258553] == 0) {
               var1.ao = bq.am(var1.ag, var10.aw(), var10.ab(), var10.az());
            } else {
               var1.ao = bq.am(var1.ag, var10.aw(), 0, var10.az());
               this.ac.as(var1, var1.ae.am[var1.aq * 528717609] < 0, -877906758);
               var1.ao.as(var8, var10.ab());
            }

            if (var1.ae.am[528717609 * var1.aq] < 0) {
               var1.ao.ar(-1);
            }

            var10.aj(var8);
            var10.au(var2, var3, var5 - var3);
            if (var10.bb()) {
               this.ag.ac(var10);
            }
         }
      }

      var1.ao.au(var2, var3, var4);
   }

   void ac(nb var1, int[] var2, int var3, int var4, int var5, int var6) {
      try {
         if ((this.ac.as[var1.ac * 1383258553] & 4) != 0) {
            if (var6 >= 384337611) {
               throw new IllegalStateException();
            }

            if (var1.ab * -1783172009 < 0) {
               if (var6 >= 384337611) {
                  throw new IllegalStateException();
               }

               int var7 = this.ac.an[1383258553 * var1.ac] / (-1578400357 * bz.ax);

               while(true) {
                  int var8 = (1048575 + var7 - var1.aj * 1429130885) / var7;
                  if (var8 > var4) {
                     if (var6 >= 384337611) {
                        return;
                     }

                     var1.aj += 229046861 * var7 * var4;
                     break;
                  }

                  var1.ao.au(var2, var3, var8);
                  var3 += var8;
                  var4 -= var8;
                  var1.aj += 229046861 * (var8 * var7 - 1048576);
                  int var9 = bz.ax * -1578400357 / 100;
                  int var10 = 262144 / var7;
                  if (var10 < var9) {
                     if (var6 >= 384337611) {
                        return;
                     }

                     var9 = var10;
                  }

                  bq var11 = var1.ao;
                  if (this.ac.av[var1.ac * 1383258553] == 0) {
                     if (var6 >= 384337611) {
                        throw new IllegalStateException();
                     }

                     var1.ao = bq.am(var1.ag, var11.aw(), var11.ab(), var11.az());
                  } else {
                     var1.ao = bq.am(var1.ag, var11.aw(), 0, var11.az());
                     ms var10000 = this.ac;
                     boolean var10002;
                     if (var1.ae.am[var1.aq * 528717609] < 0) {
                        if (var6 >= 384337611) {
                           throw new IllegalStateException();
                        }

                        var10002 = true;
                     } else {
                        var10002 = false;
                     }

                     var10000.as(var1, var10002, -1342462424);
                     var1.ao.as(var9, var11.ab());
                  }

                  if (var1.ae.am[528717609 * var1.aq] < 0) {
                     if (var6 >= 384337611) {
                        throw new IllegalStateException();
                     }

                     var1.ao.ar(-1);
                  }

                  var11.aj(var9);
                  var11.au(var2, var3, var5 - var3);
                  if (var11.bb()) {
                     if (var6 >= 384337611) {
                        throw new IllegalStateException();
                     }

                     this.ag.ac(var11);
                  }
               }
            }
         }

         var1.ao.au(var2, var3, var4);
      } catch (RuntimeException var12) {
         throw vk.ae(var12, "nq.ac(" + ')');
      }
   }

   protected void al(int var1) {
      try {
         this.ag.al(var1);

         for(nb var3 = (nb)this.ae.af(); var3 != null; var3 = (nb)this.ae.au()) {
            if (!this.ac.ch(var3, (byte)1)) {
               int var2 = var1;

               do {
                  if (var2 <= 601813091 * var3.as) {
                     this.ae(var3, var2, (byte)20);
                     var3.as -= var2 * -1003286197;
                     break;
                  }

                  this.ae(var3, var3.as * 601813091, (byte)42);
                  var2 -= var3.as * 601813091;
               } while(!this.ac.cf(var3, (int[])null, 0, var2, 472340663));
            }
         }

      } catch (RuntimeException var4) {
         throw vk.ae(var4, "nq.al(" + ')');
      }
   }

   protected bk bh() {
      nb var1 = (nb)this.ae.af();
      if (null == var1) {
         return null;
      } else {
         return (bk)(var1.ao != null ? var1.ao : this.af());
      }
   }

   nq(ms var1) {
      try {
         super();
         this.ae = new pk();
         this.ag = new bb();
         this.ac = var1;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "nq.<init>(" + ')');
      }
   }

   protected void bl(int var1) {
      this.ag.al(var1);

      for(nb var3 = (nb)this.ae.af(); var3 != null; var3 = (nb)this.ae.au()) {
         if (!this.ac.ch(var3, (byte)-6)) {
            int var2 = var1;

            do {
               if (var2 <= 601813091 * var3.as) {
                  this.ae(var3, var2, (byte)7);
                  var3.as -= var2 * -1003286197;
                  break;
               }

               this.ae(var3, var3.as * 601813091, (byte)121);
               var2 -= var3.as * 601813091;
            } while(!this.ac.cf(var3, (int[])null, 0, var2, -969085080));
         }
      }

   }

   protected bk ak() {
      nb var1 = (nb)this.ae.af();
      if (null == var1) {
         return null;
      } else {
         return (bk)(var1.ao != null ? var1.ao : this.af());
      }
   }

   void am(nb var1, int[] var2, int var3, int var4, int var5) {
      if ((this.ac.as[var1.ac * 1383258553] & 4) != 0 && var1.ab * -1783172009 < 0) {
         int var6 = this.ac.an[1383258553 * var1.ac] / (-1578400357 * bz.ax);

         while(true) {
            int var7 = (1048575 + var6 - var1.aj * 1429130885) / var6;
            if (var7 > var4) {
               var1.aj += 229046861 * var6 * var4;
               break;
            }

            var1.ao.au(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.aj += 229046861 * (var7 * var6 - 1048576);
            int var8 = bz.ax * -1578400357 / 100;
            int var9 = 262144 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            bq var10 = var1.ao;
            if (this.ac.av[var1.ac * 1383258553] == 0) {
               var1.ao = bq.am(var1.ag, var10.aw(), var10.ab(), var10.az());
            } else {
               var1.ao = bq.am(var1.ag, var10.aw(), 0, var10.az());
               this.ac.as(var1, var1.ae.am[var1.aq * 528717609] < 0, -1083234618);
               var1.ao.as(var8, var10.ab());
            }

            if (var1.ae.am[528717609 * var1.aq] < 0) {
               var1.ao.ar(-1);
            }

            var10.aj(var8);
            var10.au(var2, var3, var5 - var3);
            if (var10.bb()) {
               this.ag.ac(var10);
            }
         }
      }

      var1.ao.au(var2, var3, var4);
   }

   protected int at() {
      try {
         return 0;
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "nq.at(" + ')');
      }
   }

   protected bk bd() {
      nb var1 = (nb)this.ae.af();
      if (null == var1) {
         return null;
      } else {
         return (bk)(var1.ao != null ? var1.ao : this.af());
      }
   }

   protected bk bx() {
      nb var1 = (nb)this.ae.af();
      if (null == var1) {
         return null;
      } else {
         return (bk)(var1.ao != null ? var1.ao : this.af());
      }
   }

   protected bk bf() {
      nb var1;
      do {
         var1 = (nb)this.ae.au();
         if (null == var1) {
            return null;
         }
      } while(null == var1.ao);

      return var1.ao;
   }

   protected int bm() {
      return 0;
   }

   protected void bs(int[] var1, int var2, int var3) {
      this.ag.au(var1, var2, var3);

      for(nb var6 = (nb)this.ae.af(); null != var6; var6 = (nb)this.ae.au()) {
         if (!this.ac.ch(var6, (byte)-44)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.as * 601813091) {
                  this.ac(var6, var1, var4, var5, var5 + var4, -1726966213);
                  var6.as -= var5 * -1003286197;
                  break;
               }

               this.ac(var6, var1, var4, var6.as * 601813091, var4 + var5, -1191759446);
               var4 += 601813091 * var6.as;
               var5 -= var6.as * 601813091;
            } while(!this.ac.cf(var6, var1, var4, var5, -57772407));
         }
      }

   }

   protected void bw(int[] var1, int var2, int var3) {
      this.ag.au(var1, var2, var3);

      for(nb var6 = (nb)this.ae.af(); null != var6; var6 = (nb)this.ae.au()) {
         if (!this.ac.ch(var6, (byte)14)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.as * 601813091) {
                  this.ac(var6, var1, var4, var5, var5 + var4, 327910106);
                  var6.as -= var5 * -1003286197;
                  break;
               }

               this.ac(var6, var1, var4, var6.as * 601813091, var4 + var5, -1794069189);
               var4 += 601813091 * var6.as;
               var5 -= var6.as * 601813091;
            } while(!this.ac.cf(var6, var1, var4, var5, -1940406927));
         }
      }

   }

   protected void ba(int[] var1, int var2, int var3) {
      this.ag.au(var1, var2, var3);

      for(nb var6 = (nb)this.ae.af(); null != var6; var6 = (nb)this.ae.au()) {
         if (!this.ac.ch(var6, (byte)-93)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.as * 892314346) {
                  this.ac(var6, var1, var4, var5, var5 + var4, -1457079076);
                  var6.as -= var5 * -1688157057;
                  break;
               }

               this.ac(var6, var1, var4, var6.as * 601813091, var4 + var5, -1576956570);
               var4 += 601813091 * var6.as;
               var5 -= var6.as * 601813091;
            } while(!this.ac.cf(var6, var1, var4, var5, 416119144));
         }
      }

   }

   protected void bj(int[] var1, int var2, int var3) {
      this.ag.au(var1, var2, var3);

      for(nb var6 = (nb)this.ae.af(); null != var6; var6 = (nb)this.ae.au()) {
         if (!this.ac.ch(var6, (byte)-103)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.as * 601813091) {
                  this.ac(var6, var1, var4, var5, var5 + var4, 163171371);
                  var6.as -= var5 * -1003286197;
                  break;
               }

               this.ac(var6, var1, var4, var6.as * 601813091, var4 + var5, -151734520);
               var4 += 601813091 * var6.as;
               var5 -= var6.as * 601813091;
            } while(!this.ac.cf(var6, var1, var4, var5, -52922132));
         }
      }

   }

   protected bk an() {
      nb var1 = (nb)this.ae.af();
      if (null == var1) {
         return null;
      } else {
         return (bk)(var1.ao != null ? var1.ao : this.af());
      }
   }

   void ae(nb var1, int var2, byte var3) {
      try {
         if (0 != (this.ac.as[var1.ac * 1383258553] & 4)) {
            if (var3 <= 0) {
               throw new IllegalStateException();
            }

            if (var1.ab * -1783172009 < 0) {
               if (var3 <= 0) {
                  return;
               }

               int var4 = this.ac.an[1383258553 * var1.ac] / (bz.ax * -1578400357);
               int var5 = (var4 + 1048575 - var1.aj * 1429130885) / var4;
               var1.aj = (var2 * var4 + var1.aj * 1429130885 & 1048575) * 229046861;
               if (var5 <= var2) {
                  if (var3 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (this.ac.av[var1.ac * 1383258553] == 0) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     }

                     var1.ao = bq.am(var1.ag, var1.ao.aw(), var1.ao.ab(), var1.ao.az());
                  } else {
                     var1.ao = bq.am(var1.ag, var1.ao.aw(), 0, var1.ao.az());
                     ms var10000 = this.ac;
                     boolean var10002;
                     if (var1.ae.am[var1.aq * 528717609] < 0) {
                        if (var3 <= 0) {
                           throw new IllegalStateException();
                        }

                        var10002 = true;
                     } else {
                        var10002 = false;
                     }

                     var10000.as(var1, var10002, 586187569);
                  }

                  if (var1.ae.am[528717609 * var1.aq] < 0) {
                     if (var3 <= 0) {
                        throw new IllegalStateException();
                     }

                     var1.ao.ar(-1);
                  }

                  var2 = 1429130885 * var1.aj / var4;
               }
            }
         }

         var1.ao.al(var2);
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "nq.ae(" + ')');
      }
   }

   protected void bz(int var1) {
      this.ag.al(var1);

      for(nb var3 = (nb)this.ae.af(); var3 != null; var3 = (nb)this.ae.au()) {
         if (!this.ac.ch(var3, (byte)-54)) {
            int var2 = var1;

            do {
               if (var2 <= 601813091 * var3.as) {
                  this.ae(var3, var2, (byte)105);
                  var3.as -= var2 * -54159305;
                  break;
               }

               this.ae(var3, var3.as * 601813091, (byte)115);
               var2 -= var3.as * 601813091;
            } while(!this.ac.cf(var3, (int[])null, 0, var2, -904492355));
         }
      }

   }

   protected void bp(int[] var1, int var2, int var3) {
      this.ag.au(var1, var2, var3);

      for(nb var6 = (nb)this.ae.af(); null != var6; var6 = (nb)this.ae.au()) {
         if (!this.ac.ch(var6, (byte)-38)) {
            int var4 = var2;
            int var5 = var3;

            do {
               if (var5 <= var6.as * 601813091) {
                  this.ac(var6, var1, var4, var5, var5 + var4, -972802584);
                  var6.as -= var5 * -1003286197;
                  break;
               }

               this.ac(var6, var1, var4, var6.as * 601813091, var4 + var5, -495340890);
               var4 += 601813091 * var6.as;
               var5 -= var6.as * 601813091;
            } while(!this.ac.cf(var6, var1, var4, var5, 950268512));
         }
      }

   }

   protected void au(int[] var1, int var2, int var3) {
      try {
         this.ag.au(var1, var2, var3);

         for(nb var6 = (nb)this.ae.af(); null != var6; var6 = (nb)this.ae.au()) {
            if (!this.ac.ch(var6, (byte)24)) {
               int var4 = var2;
               int var5 = var3;

               do {
                  if (var5 <= var6.as * 601813091) {
                     this.ac(var6, var1, var4, var5, var5 + var4, -320277527);
                     var6.as -= var5 * -1003286197;
                     break;
                  }

                  this.ac(var6, var1, var4, var6.as * 601813091, var4 + var5, -405409005);
                  var4 += 601813091 * var6.as;
                  var5 -= var6.as * 601813091;
               } while(!this.ac.cf(var6, var1, var4, var5, -1791416500));
            }
         }

      } catch (RuntimeException var7) {
         throw vk.ae(var7, "nq.au(" + ')');
      }
   }

   protected bk bn() {
      nb var1 = (nb)this.ae.af();
      if (null == var1) {
         return null;
      } else {
         return (bk)(var1.ao != null ? var1.ao : this.af());
      }
   }

   void ax(nb var1, int[] var2, int var3, int var4, int var5) {
      if ((this.ac.as[var1.ac * 1383258553] & 4) != 0 && var1.ab * -1783172009 < 0) {
         int var6 = this.ac.an[1383258553 * var1.ac] / (-1578400357 * bz.ax);

         while(true) {
            int var7 = (1048575 + var6 - var1.aj * 1429130885) / var6;
            if (var7 > var4) {
               var1.aj += 229046861 * var6 * var4;
               break;
            }

            var1.ao.au(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.aj += 229046861 * (var7 * var6 - 1048576);
            int var8 = bz.ax * -1578400357 / 100;
            int var9 = 262144 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            bq var10 = var1.ao;
            if (this.ac.av[var1.ac * 1383258553] == 0) {
               var1.ao = bq.am(var1.ag, var10.aw(), var10.ab(), var10.az());
            } else {
               var1.ao = bq.am(var1.ag, var10.aw(), 0, var10.az());
               this.ac.as(var1, var1.ae.am[var1.aq * 528717609] < 0, -820019094);
               var1.ao.as(var8, var10.ab());
            }

            if (var1.ae.am[528717609 * var1.aq] < 0) {
               var1.ao.ar(-1);
            }

            var10.aj(var8);
            var10.au(var2, var3, var5 - var3);
            if (var10.bb()) {
               this.ag.ac(var10);
            }
         }
      }

      var1.ao.au(var2, var3, var4);
   }

   void ar(nb var1, int[] var2, int var3, int var4, int var5) {
      if ((this.ac.as[var1.ac * 1383258553] & 4) != 0 && var1.ab * -1783172009 < 0) {
         int var6 = this.ac.an[1383258553 * var1.ac] / (-1578400357 * bz.ax);

         while(true) {
            int var7 = (1048575 + var6 - var1.aj * 1429130885) / var6;
            if (var7 > var4) {
               var1.aj += 229046861 * var6 * var4;
               break;
            }

            var1.ao.au(var2, var3, var7);
            var3 += var7;
            var4 -= var7;
            var1.aj += 229046861 * (var7 * var6 - 1048576);
            int var8 = bz.ax * -1578400357 / 100;
            int var9 = 262144 / var6;
            if (var9 < var8) {
               var8 = var9;
            }

            bq var10 = var1.ao;
            if (this.ac.av[var1.ac * 1383258553] == 0) {
               var1.ao = bq.am(var1.ag, var10.aw(), var10.ab(), var10.az());
            } else {
               var1.ao = bq.am(var1.ag, var10.aw(), 0, var10.az());
               this.ac.as(var1, var1.ae.am[var1.aq * 528717609] < 0, 1881267447);
               var1.ao.as(var8, var10.ab());
            }

            if (var1.ae.am[528717609 * var1.aq] < 0) {
               var1.ao.ar(-1);
            }

            var10.aj(var8);
            var10.au(var2, var3, var5 - var3);
            if (var10.bb()) {
               this.ag.ac(var10);
            }
         }
      }

      var1.ao.au(var2, var3, var4);
   }

   void ad(nb var1, int var2) {
      if (0 != (this.ac.as[var1.ac * 1383258553] & 4) && var1.ab * -1783172009 < 0) {
         int var3 = this.ac.an[1383258553 * var1.ac] / (bz.ax * -1578400357);
         int var4 = (var3 + 1048575 - var1.aj * 1429130885) / var3;
         var1.aj = (var2 * var3 + var1.aj * 1429130885 & 1048575) * 229046861;
         if (var4 <= var2) {
            if (this.ac.av[var1.ac * 1383258553] == 0) {
               var1.ao = bq.am(var1.ag, var1.ao.aw(), var1.ao.ab(), var1.ao.az());
            } else {
               var1.ao = bq.am(var1.ag, var1.ao.aw(), 0, var1.ao.az());
               this.ac.as(var1, var1.ae.am[var1.aq * 528717609] < 0, 107538284);
            }

            if (var1.ae.am[528717609 * var1.aq] < 0) {
               var1.ao.ar(-1);
            }

            var2 = 1429130885 * var1.aj / var3;
         }
      }

      var1.ao.al(var2);
   }

   void ah(nb var1, int var2) {
      if (0 != (this.ac.as[var1.ac * 1383258553] & 4) && var1.ab * -1783172009 < 0) {
         int var3 = this.ac.an[1383258553 * var1.ac] / (bz.ax * -1578400357);
         int var4 = (var3 + 1048575 - var1.aj * 1429130885) / var3;
         var1.aj = (var2 * var3 + var1.aj * 1429130885 & 1048575) * 229046861;
         if (var4 <= var2) {
            if (this.ac.av[var1.ac * 1383258553] == 0) {
               var1.ao = bq.am(var1.ag, var1.ao.aw(), var1.ao.ab(), var1.ao.az());
            } else {
               var1.ao = bq.am(var1.ag, var1.ao.aw(), 0, var1.ao.az());
               this.ac.as(var1, var1.ae.am[var1.aq * 528717609] < 0, -597791804);
            }

            if (var1.ae.am[528717609 * var1.aq] < 0) {
               var1.ao.ar(-1);
            }

            var2 = 1429130885 * var1.aj / var3;
         }
      }

      var1.ao.al(var2);
   }
}
