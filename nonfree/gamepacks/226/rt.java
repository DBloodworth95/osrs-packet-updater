public class rt extends ra {
   int aw;
   no ap;

   public boolean aj() {
      if (null != this.ap && this.ap.au != null) {
         this.ap.am = true;

         try {
            if (this.ap.ai > 0.0F && this.ap.au.af(939588722)) {
               float var1 = this.aw * -1730206093 == 0 ? (float)(this.aw * -1537753890) : (float)(this.ap.aj * 287947354) / (float)(this.aw * -538584665);
               no var10000 = this.ap;
               var10000.ai -= var1 == 0.0F ? (float)(this.ap.aj * 1286577357) : var1;
               if (this.ap.ai < 0.0F) {
                  this.ap.ai = 0.0F;
               }

               this.ap.au.ap((int)this.ap.ai, (short)-7860);
               return false;
            }
         } catch (Exception var2) {
            this.au(var2.getMessage(), 634133961);
            return true;
         }

         this.ap.am = false;
         return true;
      } else {
         return true;
      }
   }

   public rt(ra var1, int var2, boolean var3, int var4) {
      try {
         super(var1);
         this.ap = null;
         this.aw = 0;
         this.ai = "FadeOutTask";
         if (var2 >= 0) {
            if (var3 && var2 < mp.ai.size()) {
               this.ap = (no)mp.ai.get(var2);
            } else if (!var3 && var2 < mp.ay.size()) {
               this.ap = (no)mp.ay.get(var2);
            }

            this.aw = var4 * -1816072517;
         }
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "rt.<init>(" + ')');
      }
   }

   static fp ap(int var0, byte var1) {
      try {
         fp[] var2 = new fp[]{fp.ap, fp.aw, fp.ak, fp.aj, fp.ai};
         fp var3 = (fp)gu.ap(var2, var0, -1875781163);
         if (null == var3) {
            if (var1 == 0) {
               throw new IllegalStateException();
            }

            var3 = fp.ap;
         }

         return var3;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "rt.ap(" + ')');
      }
   }

   public boolean ak() {
      if (null != this.ap && this.ap.au != null) {
         this.ap.am = true;

         try {
            if (this.ap.ai > 0.0F && this.ap.au.af(-76603572)) {
               float var1 = this.aw * -1730206093 == 0 ? (float)(this.aw * -235507725) : (float)(this.ap.aj * 1286577357) / (float)(this.aw * -1028117276);
               no var10000 = this.ap;
               var10000.ai -= var1 == 0.0F ? (float)(this.ap.aj * 444319165) : var1;
               if (this.ap.ai < 0.0F) {
                  this.ap.ai = 0.0F;
               }

               this.ap.au.ap((int)this.ap.ai, (short)926);
               return false;
            }
         } catch (Exception var2) {
            this.au(var2.getMessage(), 634133961);
            return true;
         }

         this.ap.am = false;
         return true;
      } else {
         return true;
      }
   }

   public static byte[] aw(int var0, boolean var1, int var2) {
      try {
         synchronized(ru.ai) {
            byte[] var4;
            label169: {
               if (100 != var0) {
                  if (var2 <= -806605719) {
                     throw new IllegalStateException();
                  }

                  if (var0 >= 100) {
                     break label169;
                  }

                  if (var2 <= -806605719) {
                     throw new IllegalStateException();
                  }

                  if (!var1) {
                     break label169;
                  }

                  if (var2 <= -806605719) {
                     throw new IllegalStateException();
                  }
               }

               if (ru.ay * -927879311 > 0) {
                  if (var2 <= -806605719) {
                     throw new IllegalStateException();
                  }

                  var4 = ru.af[(ru.ay -= -675860079) * -927879311];
                  ru.af[ru.ay * -927879311] = null;
                  return var4;
               }
            }

            label177: {
               if (var0 != 5000) {
                  if (var2 <= -806605719) {
                     throw new IllegalStateException();
                  }

                  if (var0 >= 5000 || !var1) {
                     break label177;
                  }

                  if (var2 <= -806605719) {
                     throw new IllegalStateException();
                  }
               }

               if (-440753185 * ru.as > 0) {
                  var4 = ru.ar[(ru.as -= -2145462241) * -440753185];
                  ru.ar[ru.as * -440753185] = null;
                  return var4;
               }
            }

            label187: {
               if (10000 != var0) {
                  if (var2 <= -806605719) {
                     throw new IllegalStateException();
                  }

                  if (var0 >= 10000) {
                     break label187;
                  }

                  if (var2 <= -806605719) {
                     throw new IllegalStateException();
                  }

                  if (!var1) {
                     break label187;
                  }

                  if (var2 <= -806605719) {
                     throw new IllegalStateException();
                  }
               }

               if (ru.ae * -578695597 > 0) {
                  if (var2 <= -806605719) {
                     throw new IllegalStateException();
                  }

                  var4 = ru.ab[(ru.ae -= 1057203675) * -578695597];
                  ru.ab[-578695597 * ru.ae] = null;
                  return var4;
               }
            }

            label197: {
               if (var0 != 30000) {
                  if (var2 <= -806605719) {
                     throw new IllegalStateException();
                  }

                  if (var0 >= 30000) {
                     break label197;
                  }

                  if (var2 <= -806605719) {
                     throw new IllegalStateException();
                  }

                  if (!var1) {
                     break label197;
                  }

                  if (var2 <= -806605719) {
                     throw new IllegalStateException();
                  }
               }

               if (2134664353 * ru.am > 0) {
                  if (var2 <= -806605719) {
                     throw new IllegalStateException();
                  }

                  var4 = ru.az[(ru.am -= 888307553) * 2134664353];
                  ru.az[2134664353 * ru.am] = null;
                  return var4;
               }
            }

            int var9;
            if (null != ru.ac) {
               if (var2 <= -806605719) {
                  throw new IllegalStateException();
               }

               for(var9 = 0; var9 < vn.ag.length; ++var9) {
                  if (var2 <= -806605719) {
                     throw new IllegalStateException();
                  }

                  if (var0 != vn.ag[var9]) {
                     if (var2 <= -806605719) {
                        throw new IllegalStateException();
                     }

                     if (var0 >= vn.ag[var9]) {
                        continue;
                     }

                     if (var2 <= -806605719) {
                        throw new IllegalStateException();
                     }

                     if (!var1) {
                        continue;
                     }

                     if (var2 <= -806605719) {
                        throw new IllegalStateException();
                     }
                  }

                  if (av.ad[var9] > 0) {
                     if (var2 <= -806605719) {
                        throw new IllegalStateException();
                     }

                     byte[] var5 = ru.ac[var9][--av.ad[var9]];
                     ru.ac[var9][av.ad[var9]] = null;
                     return var5;
                  }
               }
            }

            if (var1) {
               if (var2 <= -806605719) {
                  throw new IllegalStateException();
               }

               if (null != vn.ag) {
                  for(var9 = 0; var9 < vn.ag.length; ++var9) {
                     if (var2 <= -806605719) {
                        throw new IllegalStateException();
                     }

                     if (var0 <= vn.ag[var9]) {
                        if (var2 <= -806605719) {
                           throw new IllegalStateException();
                        }

                        if (av.ad[var9] < ru.ac[var9].length) {
                           if (var2 <= -806605719) {
                              throw new IllegalStateException();
                           }

                           return new byte[vn.ag[var9]];
                        }
                     }
                  }
               }
            }
         }

         return new byte[var0];
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "rt.aw(" + ')');
      }
   }

   public boolean ap(int var1) {
      try {
         if (null != this.ap) {
            if (var1 != 343486624) {
               throw new IllegalStateException();
            }

            if (this.ap.au != null) {
               this.ap.am = true;

               try {
                  if (this.ap.ai > 0.0F) {
                     if (var1 != 343486624) {
                        throw new IllegalStateException();
                     }

                     if (this.ap.au.af(2135450188)) {
                        if (var1 != 343486624) {
                           throw new IllegalStateException();
                        }

                        float var10000;
                        if (this.aw * -1730206093 == 0) {
                           if (var1 != 343486624) {
                              throw new IllegalStateException();
                           }

                           var10000 = (float)(this.aw * -1730206093);
                        } else {
                           var10000 = (float)(this.ap.aj * 1286577357) / (float)(this.aw * -1730206093);
                        }

                        float var2 = var10000;
                        no var5 = this.ap;
                        float var10001 = var5.ai;
                        float var10002;
                        if (var2 == 0.0F) {
                           if (var1 != 343486624) {
                              throw new IllegalStateException();
                           }

                           var10002 = (float)(this.ap.aj * 1286577357);
                        } else {
                           var10002 = var2;
                        }

                        var5.ai = var10001 - var10002;
                        if (this.ap.ai < 0.0F) {
                           this.ap.ai = 0.0F;
                        }

                        this.ap.au.ap((int)this.ap.ai, (short)-31804);
                        return false;
                     }
                  }
               } catch (Exception var3) {
                  this.au(var3.getMessage(), 634133961);
                  return true;
               }

               this.ap.am = false;
               return true;
            }

            if (var1 != 343486624) {
               throw new IllegalStateException();
            }
         }

         return true;
      } catch (RuntimeException var4) {
         throw tm.aw(var4, "rt.ap(" + ')');
      }
   }
}
