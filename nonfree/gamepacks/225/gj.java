public class gj {
   public static int ar;
   public long ae;
   pr ag;
   static final int ax = 2;
   static final int aq = 3;
   long ac;
   public static final int bu = 68;

   static char ae(char var0, px var1, byte var2) {
      try {
         if (var0 >= 192) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            }

            if (var0 <= 255) {
               if (var2 <= 0) {
                  throw new IllegalStateException();
               }

               if (var0 >= 192) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 198) {
                     if (var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     return 'A';
                  }
               }

               if (var0 == 199) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  return 'C';
               }

               if (var0 >= 200) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 203) {
                     return 'E';
                  }
               }

               if (var0 >= 204 && var0 <= 207) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  return 'I';
               }

               if (var0 == 209 && px.aq != var1) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  return 'N';
               }

               if (var0 >= 210 && var0 <= 214) {
                  return 'O';
               }

               if (var0 >= 217) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 220) {
                     if (var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     return 'U';
                  }
               }

               if (221 == var0) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  return 'Y';
               }

               if (223 == var0) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  return 's';
               }

               if (var0 >= 224 && var0 <= 230) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  return 'a';
               }

               if (var0 == 231) {
                  return 'c';
               }

               if (var0 >= 232 && var0 <= 235) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  return 'e';
               }

               if (var0 >= 236 && var0 <= 239) {
                  return 'i';
               }

               if (var0 == 241 && px.aq != var1) {
                  return 'n';
               }

               if (var0 >= 242) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 246) {
                     if (var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     return 'o';
                  }
               }

               if (var0 >= 249) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  if (var0 <= 252) {
                     if (var2 <= 0) {
                        throw new IllegalStateException();
                     }

                     return 'u';
                  }
               }

               if (253 == var0) {
                  return 'y';
               }

               if (var2 <= 0) {
                  throw new IllegalStateException();
               }

               if (var0 == 255) {
                  if (var2 <= 0) {
                     throw new IllegalStateException();
                  }

                  return 'y';
               }
            }
         }

         if (var0 == 338) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            } else {
               return 'O';
            }
         } else if (var0 == 339) {
            return 'o';
         } else if (376 == var0) {
            if (var2 <= 0) {
               throw new IllegalStateException();
            } else {
               return 'Y';
            }
         } else {
            return var0;
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "gj.ae(" + ')');
      }
   }

   void ac(vf var1, int var2) {
      try {
         this.ac = var1.cw(615077395) * -5456162713184050863L;
         this.ae = var1.cw(1192609587) * -4924369022104718295L;

         for(int var3 = var1.cv(952452697); 0 != var3; var3 = var1.cv(952452697)) {
            if (var2 == -115113616) {
               return;
            }

            Object var4;
            if (var3 == 1) {
               if (var2 == -115113616) {
                  throw new IllegalStateException();
               }

               var4 = new gs(this);
            } else if (4 == var3) {
               if (var2 == -115113616) {
                  throw new IllegalStateException();
               }

               var4 = new gr(this);
            } else if (var3 == 3) {
               if (var2 == -115113616) {
                  throw new IllegalStateException();
               }

               var4 = new gl(this);
            } else if (var3 == 2) {
               var4 = new ga(this);
            } else {
               if (5 != var3) {
                  throw new RuntimeException("");
               }

               if (var2 == -115113616) {
                  return;
               }

               var4 = new gp(this);
            }

            ((gu)var4).ac(var1, (byte)0);
            this.ag.ae((to)var4);
         }

      } catch (RuntimeException var5) {
         throw vk.ae(var5, "gj.ac(" + ')');
      }
   }

   void ag(vf var1) {
      this.ac = var1.cw(742085425) * -5456162713184050863L;
      this.ae = var1.cw(1239028250) * -4924369022104718295L;

      for(int var2 = var1.cv(952452697); 0 != var2; var2 = var1.cv(952452697)) {
         Object var3;
         if (var2 == 1) {
            var3 = new gs(this);
         } else if (4 == var2) {
            var3 = new gr(this);
         } else if (var2 == 3) {
            var3 = new gl(this);
         } else if (var2 == 2) {
            var3 = new ga(this);
         } else {
            if (5 != var2) {
               throw new RuntimeException("");
            }

            var3 = new gp(this);
         }

         ((gu)var3).ac(var1, (byte)0);
         this.ag.ae((to)var3);
      }

   }

   public void ae(gm var1, int var2) {
      try {
         if (var1.hk == -8778605944052578383L * this.ac) {
            if (var2 == -131115841) {
               throw new IllegalStateException();
            }

            if (3924644622254876697L * this.ae == 713846940201558631L * var1.ax) {
               for(gu var3 = (gu)this.ag.ax(); null != var3; var3 = (gu)this.ag.af()) {
                  var3.ae(var1, -1593238865);
               }

               var1.ax += -7715408303829853865L;
               return;
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "gj.ae(" + ')');
      }
   }

   void am(vf var1) {
      this.ac = var1.cw(1230261414) * -5456162713184050863L;
      this.ae = var1.cw(481275994) * -4924369022104718295L;

      for(int var2 = var1.cv(952452697); 0 != var2; var2 = var1.cv(952452697)) {
         Object var3;
         if (var2 == 1) {
            var3 = new gs(this);
         } else if (4 == var2) {
            var3 = new gr(this);
         } else if (var2 == 3) {
            var3 = new gl(this);
         } else if (var2 == 2) {
            var3 = new ga(this);
         } else {
            if (5 != var2) {
               throw new RuntimeException("");
            }

            var3 = new gp(this);
         }

         ((gu)var3).ac(var1, (byte)0);
         this.ag.ae((to)var3);
      }

   }

   public void ax(gm var1) {
      if (var1.hk == -8778605944052578383L * this.ac && 3924644622254876697L * this.ae == 713846940201558631L * var1.ax) {
         for(gu var2 = (gu)this.ag.ax(); null != var2; var2 = (gu)this.ag.af()) {
            var2.ae(var1, 156233443);
         }

         var1.ax += -7715408303829853865L;
      } else {
         throw new RuntimeException("");
      }
   }

   public gj(vf var1) {
      try {
         super();
         this.ae = 4924369022104718295L;
         this.ag = new pr();
         this.ac(var1, 556675772);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "gj.<init>(" + ')');
      }
   }

   public void aq(gm var1) {
      if (var1.hk == -8778605944052578383L * this.ac && 3924644622254876697L * this.ae == 713846940201558631L * var1.ax) {
         for(gu var2 = (gu)this.ag.ax(); null != var2; var2 = (gu)this.ag.af()) {
            var2.ae(var1, -404425770);
         }

         var1.ax += -7715408303829853865L;
      } else {
         throw new RuntimeException("");
      }
   }
}
