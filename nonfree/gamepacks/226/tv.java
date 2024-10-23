public abstract class tv implements lz {
   ui ap;
   static final int ak = 6;
   static final int ao = 7;

   boolean au() {
      return null != this.ap;
   }

   public void ay(vl var1, int var2) {
      try {
         while(true) {
            int var3 = var1.cy((short)-16694);
            if (0 == var3) {
               if (var2 <= -48697786) {
                  return;
               }

               return;
            }

            tj var4 = (tj)gu.ap(qh.ap((byte)1), var3, -1875781163);
            if (null != var4) {
               if (var2 <= -48697786) {
                  throw new IllegalStateException();
               }

               switch(2049297215 * var4.ai) {
               case 0:
                  int var6 = var1.cy((short)-20345);
                  this.ap = iq.aw(var6, (byte)-113);
                  if (this.ap != null) {
                     break;
                  }

                  if (var2 <= -48697786) {
                     throw new IllegalStateException();
                  }

                  throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var6);
               case 1:
                  om[] var5 = new om[]{om.ap, om.ak, om.aj, om.aw};
                  gu.ap(var5, var1.cy((short)-29612), -1875781163);
                  break;
               case 2:
               default:
                  throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
               case 3:
                  var1.ca(-833924001);
               }
            } else {
               this.ap(var1, var3, -1750278900);
            }
         }
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "tv.ay(" + ')');
      }
   }

   abstract void ap(vl var1, int var2, int var3);

   Object ae(int var1) {
      try {
         if (this.ap == ui.ap) {
            if (var1 != -1606353224) {
               throw new IllegalStateException();
            } else {
               return 0;
            }
         } else if (ui.aw == this.ap) {
            if (var1 != -1606353224) {
               throw new IllegalStateException();
            } else {
               return -1L;
            }
         } else {
            return ui.ak == this.ap ? "" : null;
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "tv.ae(" + ')');
      }
   }

   abstract void aw(vl var1, int var2);

   public void am(vl var1) {
      while(true) {
         int var2 = var1.cy((short)-24722);
         if (0 == var2) {
            return;
         }

         tj var3 = (tj)gu.ap(qh.ap((byte)1), var2, -1875781163);
         if (null != var3) {
            switch(2049297215 * var3.ai) {
            case 0:
               int var5 = var1.cy((short)-25032);
               this.ap = iq.aw(var5, (byte)-119);
               if (this.ap != null) {
                  break;
               }

               throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
            case 1:
               om[] var4 = new om[]{om.ap, om.ak, om.aj, om.aw};
               gu.ap(var4, var1.cy((short)-16869), -1875781163);
               break;
            case 2:
            default:
               throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
            case 3:
               var1.ca(-317526943);
            }
         } else {
            this.ap(var1, var2, -2008343542);
         }
      }
   }

   public void at(vl var1) {
      while(true) {
         int var2 = var1.cy((short)-27117);
         if (0 == var2) {
            return;
         }

         tj var3 = (tj)gu.ap(qh.ap((byte)1), var2, -1875781163);
         if (null != var3) {
            switch(2049297215 * var3.ai) {
            case 0:
               int var5 = var1.cy((short)-19087);
               this.ap = iq.aw(var5, (byte)-111);
               if (this.ap != null) {
                  break;
               }

               throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
            case 1:
               om[] var4 = new om[]{om.ap, om.ak, om.aj, om.aw};
               gu.ap(var4, var1.cy((short)-22058), -1875781163);
               break;
            case 2:
            default:
               throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3);
            case 3:
               var1.ca(801409977);
            }
         } else {
            this.ap(var1, var2, -2139344180);
         }
      }
   }

   abstract void ai(vl var1, int var2);

   tv(int var1) {
      try {
         super();
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "tv.<init>(" + ')');
      }
   }

   abstract void aj(vl var1, int var2);

   abstract void ak(vl var1, int var2);

   boolean as(int var1) {
      try {
         boolean var10000;
         if (null != this.ap) {
            if (var1 >= 927683942) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "tv.as(" + ')');
      }
   }

   boolean an() {
      return null != this.ap;
   }

   Object ao() {
      if (this.ap == ui.ap) {
         return 0;
      } else if (ui.aw == this.ap) {
         return -1L;
      } else {
         return ui.ak == this.ap ? "" : null;
      }
   }
}
