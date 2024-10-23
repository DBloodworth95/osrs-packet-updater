public class jk implements kn {
   int aj;
   int ak;
   ju[] ap;
   pe as;
   double ai;
   int ay;
   pu aw;
   static final int af = 8192;
   static final int bc = 50;

   public void aw(double var1) {
      try {
         this.ai = var1;
         this.as(-1363109012);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "jk.aw(" + ')');
      }
   }

   public int ap(int var1) {
      try {
         if (0 == this.ap.length) {
            if (var1 <= -1607440853) {
               throw new IllegalStateException();
            } else {
               return 100;
            }
         } else {
            int var2 = 0;
            int var3 = 0;
            ju[] var4 = this.ap;

            for(int var5 = 0; var5 < var4.length; ++var5) {
               if (var1 <= -1607440853) {
                  throw new IllegalStateException();
               }

               ju var6 = var4[var5];
               if (var6 != null) {
                  if (var1 <= -1607440853) {
                     throw new IllegalStateException();
                  }

                  if (null == var6.as) {
                     if (var1 <= -1607440853) {
                        throw new IllegalStateException();
                     }
                  } else {
                     var2 += var6.as.length;
                     int[] var7 = var6.as;

                     for(int var8 = 0; var8 < var7.length; ++var8) {
                        if (var1 <= -1607440853) {
                           throw new IllegalStateException();
                        }

                        int var9 = var7[var8];
                        if (this.as.ba(var9, -934931343)) {
                           if (var1 <= -1607440853) {
                              throw new IllegalStateException();
                           }

                           ++var3;
                        }
                     }
                  }
               }
            }

            if (0 == var2) {
               if (var1 <= -1607440853) {
                  throw new IllegalStateException();
               } else {
                  return 0;
               }
            } else {
               return 100 * var3 / var2;
            }
         }
      } catch (RuntimeException var10) {
         throw tm.aw(var10, "jk.ap(" + ')');
      }
   }

   public int[] ak(int var1, byte var2) {
      try {
         ju var3 = this.ap[var1];
         if (var3 != null) {
            if (var2 == 0) {
               throw new IllegalStateException();
            }

            if (var3.ao != null) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               this.aw.ak(var3);
               var3.af = true;
               return var3.ao;
            }

            boolean var4 = var3.ap(this.ai, this.ay * 1823634949, this.as);
            if (var4) {
               if (var2 == 0) {
                  throw new IllegalStateException();
               }

               if (0 == this.aj * -402202875) {
                  if (var2 == 0) {
                     throw new IllegalStateException();
                  }

                  ju var5 = (ju)this.aw.ay();
                  var5.aw();
               } else {
                  this.aj -= 665064909;
               }

               this.aw.ak(var3);
               var3.af = true;
               return var3.ao;
            }
         }

         return null;
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "jk.ak(" + ')');
      }
   }

   public boolean ad(int var1) {
      return this.ay * 1823634949 == -692053664;
   }

   public jk(pe var1, pe var2, int var3, double var4, int var6) {
      try {
         super();
         this.aw = new pu();
         this.aj = 0;
         this.ai = 1.0D;
         this.ay = -2114754944;
         this.as = var2;
         this.ak = var3 * -1610294887;
         this.aj = this.ak * 734545493;
         this.ai = var4;
         this.ay = -654055731 * var6;
         int[] var7 = var1.be(0, 1449417263);
         if (var7 != null) {
            int var8 = var7.length;
            this.ap = new ju[var1.cq(0, 1919168695)];

            for(int var9 = 0; var9 < var8; ++var9) {
               vl var10 = new vl(var1.bm(0, var7[var9], 1685933503));
               this.ap[var7[var9]] = new ju(var10);
            }
         } else {
            this.ap = new ju[0];
         }

      } catch (RuntimeException var11) {
         throw tm.aw(var11, "jk.<init>(" + ')');
      }
   }

   public int[] bj(int var1) {
      ju var2 = this.ap[var1];
      if (var2 != null) {
         if (var2.ao != null) {
            this.aw.ak(var2);
            var2.af = true;
            return var2.ao;
         }

         boolean var3 = var2.ap(this.ai, this.ay * 1823634949, this.as);
         if (var3) {
            if (0 == this.aj * -402202875) {
               ju var4 = (ju)this.aw.ay();
               var4.aw();
            } else {
               this.aj -= 665064909;
            }

            this.aw.ak(var2);
            var2.af = true;
            return var2.ao;
         }
      }

      return null;
   }

   public boolean ay(int var1, byte var2) {
      try {
         boolean var10000;
         if (this.ay * 1823634949 == 64) {
            if (var2 != 23) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "jk.ay(" + ')');
      }
   }

   public void as(int var1) {
      try {
         for(int var2 = 0; var2 < this.ap.length; ++var2) {
            if (null != this.ap[var2]) {
               if (var1 == 1287627034) {
                  throw new IllegalStateException();
               }

               this.ap[var2].aw();
            }
         }

         this.aw = new pu();
         this.aj = 734545493 * this.ak;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "jk.as(" + ')');
      }
   }

   public void ae(int var1, byte var2) {
      try {
         for(int var3 = 0; var3 < this.ap.length; ++var3) {
            if (var2 != 62) {
               return;
            }

            ju var4 = this.ap[var3];
            if (null != var4) {
               if (var2 != 62) {
                  throw new IllegalStateException();
               }

               if (0 != var4.au) {
                  if (var2 != 62) {
                     throw new IllegalStateException();
                  }

                  if (var4.af) {
                     if (var2 != 62) {
                        throw new IllegalStateException();
                     }

                     var4.ak(var1);
                     var4.af = false;
                  }
               }
            }
         }

      } catch (RuntimeException var5) {
         throw tm.aw(var5, "jk.ae(" + ')');
      }
   }

   public int am() {
      if (0 == this.ap.length) {
         return 100;
      } else {
         int var1 = 0;
         int var2 = 0;
         ju[] var3 = this.ap;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            ju var5 = var3[var4];
            if (var5 != null && null != var5.as) {
               var1 += var5.as.length;
               int[] var6 = var5.as;

               for(int var7 = 0; var7 < var6.length; ++var7) {
                  int var8 = var6[var7];
                  if (this.as.ba(var8, -1596251296)) {
                     ++var2;
                  }
               }
            }
         }

         if (0 == var1) {
            return 0;
         } else {
            return 100 * var2 / var1;
         }
      }
   }

   public void at(double var1) {
      this.ai = var1;
      this.as(1000867070);
   }

   public void au(double var1) {
      this.ai = var1;
      this.as(1306814593);
   }

   public void an(double var1) {
      this.ai = var1;
      this.as(-711459009);
   }

   public int ao(int var1) {
      return this.ap[var1] != null ? this.ap[var1].ai : 0;
   }

   public void al(int var1) {
      for(int var2 = 0; var2 < this.ap.length; ++var2) {
         ju var3 = this.ap[var2];
         if (null != var3 && 0 != var3.au && var3.af) {
            var3.ak(var1);
            var3.af = false;
         }
      }

   }

   public int ar(int var1) {
      return this.ap[var1] != null ? this.ap[var1].ai : 0;
   }

   public boolean ab(int var1) {
      return this.ap[var1].ay;
   }

   public boolean az(int var1) {
      return this.ap[var1].ay;
   }

   public boolean ag(int var1) {
      return this.ap[var1].ay;
   }

   public int aj(int var1, byte var2) {
      try {
         if (this.ap[var1] != null) {
            if (var2 >= 4) {
               throw new IllegalStateException();
            } else {
               return this.ap[var1].ai;
            }
         } else {
            return 0;
         }
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "jk.aj(" + ')');
      }
   }

   public void ac() {
      for(int var1 = 0; var1 < this.ap.length; ++var1) {
         if (null != this.ap[var1]) {
            this.ap[var1].aw();
         }
      }

      this.aw = new pu();
      this.aj = 734545493 * this.ak;
   }

   public void av() {
      for(int var1 = 0; var1 < this.ap.length; ++var1) {
         if (null != this.ap[var1]) {
            this.ap[var1].aw();
         }
      }

      this.aw = new pu();
      this.aj = 734545493 * this.ak;
   }

   public void ax(int var1) {
      for(int var2 = 0; var2 < this.ap.length; ++var2) {
         ju var3 = this.ap[var2];
         if (null != var3 && 0 != var3.au && var3.af) {
            var3.ak(var1);
            var3.af = false;
         }
      }

   }

   public void aq(int var1) {
      for(int var2 = 0; var2 < this.ap.length; ++var2) {
         ju var3 = this.ap[var2];
         if (null != var3 && 0 != var3.au && var3.af) {
            var3.ak(var1);
            var3.af = false;
         }
      }

   }

   public boolean ai(int var1, byte var2) {
      try {
         return this.ap[var1].ay;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "jk.ai(" + ')');
      }
   }

   public int af(int var1) {
      return this.ap[var1] != null ? this.ap[var1].ai : 0;
   }

   public int[] ah(int var1) {
      ju var2 = this.ap[var1];
      if (var2 != null) {
         if (var2.ao != null) {
            this.aw.ak(var2);
            var2.af = true;
            return var2.ao;
         }

         boolean var3 = var2.ap(this.ai, this.ay * 1823634949, this.as);
         if (var3) {
            if (0 == this.aj * -402202875) {
               ju var4 = (ju)this.aw.ay();
               var4.aw();
            } else {
               this.aj -= 665064909;
            }

            this.aw.ak(var2);
            var2.af = true;
            return var2.ao;
         }
      }

      return null;
   }

   public int[] bh(int var1) {
      ju var2 = this.ap[var1];
      if (var2 != null) {
         if (var2.ao != null) {
            this.aw.ak(var2);
            var2.af = true;
            return var2.ao;
         }

         boolean var3 = var2.ap(this.ai, this.ay * 1823634949, this.as);
         if (var3) {
            if (0 == this.aj * -402202875) {
               ju var4 = (ju)this.aw.ay();
               var4.aw();
            } else {
               this.aj -= 665064909;
            }

            this.aw.ak(var2);
            var2.af = true;
            return var2.ao;
         }
      }

      return null;
   }

   public int[] aa(int var1) {
      ju var2 = this.ap[var1];
      if (var2 != null) {
         if (var2.ao != null) {
            this.aw.ak(var2);
            var2.af = true;
            return var2.ao;
         }

         boolean var3 = var2.ap(this.ai, this.ay * 1823634949, this.as);
         if (var3) {
            if (0 == this.aj * -402202875) {
               ju var4 = (ju)this.aw.ay();
               var4.aw();
            } else {
               this.aj -= 665064909;
            }

            this.aw.ak(var2);
            var2.af = true;
            return var2.ao;
         }
      }

      return null;
   }
}
