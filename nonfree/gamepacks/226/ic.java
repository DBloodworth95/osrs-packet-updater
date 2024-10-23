import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

public class ic {
   int an;
   static final int aw = 0;
   static final int ak = 1;
   static final int am = 7;
   String ar;
   it at;
   ik au;
   public static final int ap = -1;
   String ao;
   String af;
   ei ab;
   static final int ay = 4;
   int az;
   static final int tl = 512;

   public String af(int var1) {
      try {
         return this.au.ap(1030966088);
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ic.af(" + ')');
      }
   }

   public String bi() {
      return this.au.as;
   }

   public ic(ic var1) {
      try {
         super();
         this.an = 148077623;
         this.az = 0;
         if (null != var1) {
            this.at = var1.at;
            this.au = var1.au;
            this.an = var1.an * 1;
            this.ao = var1.ao;
            this.af = var1.af;
            this.ar = var1.ar;
            this.ab = null;
            this.az = 1 * var1.az;
         }
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ic.<init>(" + ')');
      }
   }

   public boolean aw(String var1, String var2, ex var3, int var4) {
      try {
         if (var1 != null) {
            if (var4 == 1127478189) {
               throw new IllegalStateException();
            }

            if (!var1.isEmpty()) {
               if (null == var3) {
                  if (var4 == 1127478189) {
                     throw new IllegalStateException();
                  }

                  return false;
               }

               this.ar((short)23876);

               try {
                  this.ao = var1;
                  this.ab = var3.ai(new URL(this.ao), (short)326);
                  this.an = 0;
               } catch (MalformedURLException var6) {
                  this.ar((short)8544);
                  this.an = -592310492;
                  return false;
               }

               if (!var2.isEmpty()) {
                  this.ar = var2;
               }

               return true;
            }

            if (var4 == 1127478189) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var7) {
         throw tm.aw(var7, "ic.aw(" + ')');
      }
   }

   public void ak(String var1, String var2, String var3, int var4) {
      try {
         this.at = qf.ap(1853385141);
         this.af = var1;
         this.at.aj(this.af, var2, var3, 1058759662);
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ic.ak(" + ')');
      }
   }

   void ar(short var1) {
      try {
         this.ab = null;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ic.ar(" + ')');
      }
   }

   public int ai(int var1) {
      try {
         return this.an * -1016658311;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ic.ai(" + ')');
      }
   }

   public boolean ay(byte var1) {
      try {
         boolean var10000;
         if (null != this.au) {
            if (var1 <= 0) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ic.ay(" + ')');
      }
   }

   public int as(String var1, byte var2) {
      try {
         return this.au.am.containsKey(var1) ? (Integer)this.au.am.get(var1) : -1;
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ic.as(" + ')');
      }
   }

   public String ae(String var1, int var2) {
      try {
         Object var10000;
         if (this.au.at.containsKey(var1)) {
            if (var2 >= -1875781163) {
               throw new IllegalStateException();
            }

            var10000 = this.au.at.get(var1);
         } else {
            var10000 = null;
         }

         return (String)((String)var10000);
      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ic.ae(" + ')');
      }
   }

   void ci() {
      Iterator var1 = this.au.ai.iterator();

      ix var2;
      do {
         if (!var1.hasNext()) {
            var1 = this.au.ai.iterator();

            while(var1.hasNext()) {
               var2 = (ix)var1.next();
               if (null != var2.ap) {
                  byte[] var3 = var2.ap.aw((byte)12);
                  if (var3 != null && var3.length > 0) {
                     this.an = -296155246;
                     return;
                  }
               }
            }

            this.ar((short)30065);
            this.an = -740388115;
            return;
         }

         var2 = (ix)var1.next();
      } while(null == var2.ap || var2.ap.ap(1210667653));

   }

   public ArrayList am(int var1) {
      try {
         return this.au.ai;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ic.am(" + ')');
      }
   }

   public boolean by() {
      return null != this.au;
   }

   public boolean cn(String var1, ex var2) {
      try {
         JSONObject var3 = (new ts(var1.getBytes())).ao(-1056125876);

         try {
            this.az = var3.getInt("version") * 1779077551;
         } catch (Exception var5) {
            this.ar((short)29356);
            this.an = -888465738;
            return false;
         }

         if (!this.au.aj(var3, this.az * -659724977, var2, -1357281095)) {
            this.an = -888465738;
         }

         this.an = (this.au.ai.size() > 0 ? 1 : 2) * -148077623;
      } catch (UnsupportedEncodingException var6) {
         this.an = -888465738;
      }

      return -1016658311 * this.an < 3;
   }

   public void bh(String var1, String var2, String var3) {
      this.at = qf.ap(1853385141);
      this.af = var1;
      this.at.aj(this.af, var2, var3, 1901365120);
   }

   public String bn(String var1) {
      return (String)((String)(this.au.at.containsKey(var1) ? this.au.at.get(var1) : null));
   }

   public void aj(ex var1, byte var2) {
      try {
         switch(-1016658311 * this.an) {
         case 0:
            this.ab(var1, -923157843);
            break;
         case 1:
            this.az((byte)-107);
            break;
         default:
            return;
         }

      } catch (RuntimeException var3) {
         throw tm.aw(var3, "ic.aj(" + ')');
      }
   }

   void ab(ex var1, int var2) {
      try {
         if (null != this.ab) {
            if (var2 <= -1794226235) {
               return;
            }

            if (this.ab.ap(1556134306)) {
               byte[] var3 = this.ab.aw((byte)12);
               if (var3 == null) {
                  this.ar((short)26121);
                  this.an = -592310492;
                  return;
               }

               try {
                  ts var4 = new ts(var3);
                  JSONObject var5 = var4.ao(668721055);
                  if (var5 == null) {
                     if (var2 <= -1794226235) {
                        throw new IllegalStateException();
                     }

                     return;
                  }

                  try {
                     this.az = var5.getInt("version") * 1779077551;
                  } catch (Exception var7) {
                     this.ar((short)21751);
                     this.an = -888465738;
                     return;
                  }

                  if (this.az * -659724977 < 2) {
                     if (!this.au.aj(var5, this.az * -659724977, var1, -1957963474)) {
                        if (var2 <= -1794226235) {
                           return;
                        }

                        this.an = -888465738;
                     }
                  } else if (this.az * -659724977 == 2) {
                     if (var2 <= -1794226235) {
                        throw new IllegalStateException();
                     }

                     ib var6 = av.ap(-1351450781);
                     var6.aw(var5, this.az * -659724977, var1, -2121827703);
                     this.au = var6.ai(this.ar, (byte)0);
                     if (null != this.au) {
                        if (var2 <= -1794226235) {
                           throw new IllegalStateException();
                        }

                        this.az((byte)-32);
                        this.an = -148077623;
                     } else {
                        this.an = -1036543361;
                     }
                  }
               } catch (UnsupportedEncodingException var8) {
                  this.ar((short)8458);
                  this.an = -888465738;
                  return;
               }

               if (null != this.au) {
                  if (var2 <= -1794226235) {
                     throw new IllegalStateException();
                  }

                  byte var10001;
                  if (this.au.ai.size() > 0) {
                     if (var2 <= -1794226235) {
                        throw new IllegalStateException();
                     }

                     var10001 = 1;
                  } else {
                     var10001 = 2;
                  }

                  this.an = var10001 * -148077623;
               }

               this.ab = null;
               return;
            }
         }

      } catch (RuntimeException var9) {
         throw tm.aw(var9, "ic.ab(" + ')');
      }
   }

   void cb(ex var1) {
      if (null != this.ab && this.ab.ap(1441761530)) {
         byte[] var2 = this.ab.aw((byte)12);
         if (var2 == null) {
            this.ar((short)18987);
            this.an = -592310492;
         } else {
            try {
               ts var3 = new ts(var2);
               JSONObject var4 = var3.ao(-776495446);
               if (var4 == null) {
                  return;
               }

               try {
                  this.az = var4.getInt("version") * 1779077551;
               } catch (Exception var6) {
                  this.ar((short)17445);
                  this.an = -888465738;
                  return;
               }

               if (this.az * -659724977 < 2) {
                  if (!this.au.aj(var4, this.az * -659724977, var1, -1402781794)) {
                     this.an = -888465738;
                  }
               } else if (this.az * -659724977 == 2) {
                  ib var5 = av.ap(-2104480032);
                  var5.aw(var4, this.az * -659724977, var1, -2121827703);
                  this.au = var5.ai(this.ar, (byte)0);
                  if (null != this.au) {
                     this.az((byte)-60);
                     this.an = -148077623;
                  } else {
                     this.an = -1036543361;
                  }
               }
            } catch (UnsupportedEncodingException var7) {
               this.ar((short)26905);
               this.an = -888465738;
               return;
            }

            if (null != this.au) {
               this.an = (this.au.ai.size() > 0 ? 1 : 2) * -148077623;
            }

            this.ab = null;
         }
      }
   }

   public boolean ag(String var1, ex var2, int var3) {
      try {
         try {
            JSONObject var4 = (new ts(var1.getBytes())).ao(-325236247);

            try {
               this.az = var4.getInt("version") * 1779077551;
            } catch (Exception var6) {
               this.ar((short)20311);
               this.an = -888465738;
               return false;
            }

            if (!this.au.aj(var4, this.az * -659724977, var2, -1174620663)) {
               if (var3 <= -1396102180) {
                  throw new IllegalStateException();
               }

               this.an = -888465738;
            }

            byte var10001;
            if (this.au.ai.size() > 0) {
               if (var3 <= -1396102180) {
                  throw new IllegalStateException();
               }

               var10001 = 1;
            } else {
               var10001 = 2;
            }

            this.an = var10001 * -148077623;
         } catch (UnsupportedEncodingException var7) {
            this.an = -888465738;
         }

         boolean var10000;
         if (-1016658311 * this.an < 3) {
            if (var3 <= -1396102180) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var8) {
         throw tm.aw(var8, "ic.ag(" + ')');
      }
   }

   public void bj(ex var1) {
      switch(-1312330454 * this.an) {
      case 0:
         this.ab(var1, -503721814);
         break;
      case 1:
         this.az((byte)-77);
         break;
      default:
         return;
      }

   }

   public it ac() {
      return this.at;
   }

   public boolean av(String var1, String var2, ex var3) {
      if (var1 != null && !var1.isEmpty()) {
         if (null == var3) {
            return false;
         } else {
            this.ar((short)426);

            try {
               this.ao = var1;
               this.ab = var3.ai(new URL(this.ao), (short)326);
               this.an = 0;
            } catch (MalformedURLException var5) {
               this.ar((short)995);
               this.an = -592310492;
               return false;
            }

            if (!var2.isEmpty()) {
               this.ar = var2;
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public boolean ax(String var1, String var2, ex var3) {
      if (var1 != null && !var1.isEmpty()) {
         if (null == var3) {
            return false;
         } else {
            this.ar((short)1504);

            try {
               this.ao = var1;
               this.ab = var3.ai(new URL(this.ao), (short)326);
               this.an = 0;
            } catch (MalformedURLException var5) {
               this.ar((short)9237);
               this.an = -592310492;
               return false;
            }

            if (!var2.isEmpty()) {
               this.ar = var2;
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public void aq(String var1, String var2, String var3) {
      this.at = qf.ap(1853385141);
      this.af = var1;
      this.at.aj(this.af, var2, var3, 1335169543);
   }

   public void al(String var1, String var2, String var3) {
      this.at = qf.ap(1853385141);
      this.af = var1;
      this.at.aj(this.af, var2, var3, 496439579);
   }

   public void aa(String var1, String var2, String var3) {
      this.at = qf.ap(1853385141);
      this.af = var1;
      this.at.aj(this.af, var2, var3, -1322497868);
   }

   public void ah(String var1, String var2, String var3) {
      this.at = qf.ap(1853385141);
      this.af = var1;
      this.at.aj(this.af, var2, var3, -2111837033);
   }

   public String bf() {
      return this.au.as;
   }

   public ic() {
      try {
         super();
         this.an = 148077623;
         this.az = 0;
      } catch (RuntimeException var1) {
         throw tm.aw(var1, "ic.<init>(" + ')');
      }
   }

   public void bv(ex var1) {
      switch(-1016658311 * this.an) {
      case 0:
         this.ab(var1, -956031836);
         break;
      case 1:
         this.az((byte)-25);
         break;
      default:
         return;
      }

   }

   public void bx(ex var1) {
      switch(-1016658311 * this.an) {
      case 0:
         this.ab(var1, -1258146895);
         break;
      case 1:
         this.az((byte)-16);
         break;
      default:
         return;
      }

   }

   public int bk() {
      return this.an * -1016658311;
   }

   public int bb() {
      return this.an * 2007210827;
   }

   public int bq() {
      return this.an * -1016658311;
   }

   public int bp() {
      return this.an * -1016658311;
   }

   public boolean bz() {
      return null != this.au;
   }

   public boolean bc() {
      return null != this.au;
   }

   void cd() {
      Iterator var1 = this.au.ai.iterator();

      ix var2;
      do {
         if (!var1.hasNext()) {
            var1 = this.au.ai.iterator();

            while(var1.hasNext()) {
               var2 = (ix)var1.next();
               if (null != var2.ap) {
                  byte[] var3 = var2.ap.aw((byte)12);
                  if (var3 != null && var3.length > 0) {
                     this.an = 1920083356;
                     return;
                  }
               }
            }

            this.ar((short)23285);
            this.an = -740388115;
            return;
         }

         var2 = (ix)var1.next();
      } while(null == var2.ap || var2.ap.ap(1967558339));

   }

   public int br(String var1) {
      return this.au.am.containsKey(var1) ? (Integer)this.au.am.get(var1) : -1;
   }

   public ArrayList at(int var1) {
      try {
         return this.au.ay;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ic.at(" + ')');
      }
   }

   public String bu(String var1) {
      return (String)((String)(this.au.at.containsKey(var1) ? this.au.at.get(var1) : null));
   }

   public ArrayList bt() {
      return this.au.ai;
   }

   public ArrayList bs() {
      return this.au.ai;
   }

   public ArrayList bm() {
      return this.au.ay;
   }

   public ArrayList bo() {
      return this.au.ay;
   }

   public ArrayList bd() {
      return this.au.ay;
   }

   public ArrayList ba() {
      return this.au.aj;
   }

   public ArrayList bw() {
      return this.au.aj;
   }

   public it ap(int var1) {
      try {
         return this.at;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ic.ap(" + ')');
      }
   }

   public ArrayList au(byte var1) {
      try {
         return this.au.aj;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ic.au(" + ')');
      }
   }

   public float[] bg() {
      return this.au.ae;
   }

   public float[] bl() {
      return this.au.ae;
   }

   public float[] be() {
      return this.au.ae;
   }

   void cq() {
      this.ab = null;
   }

   static final int ar(int var0, int var1, int var2, int var3, int var4) {
      try {
         int var5 = 65536 - jm.ai[var2 * 1024 / var3] >> 1;
         return ((65536 - var5) * var0 >> 16) + (var1 * var5 >> 16);
      } catch (RuntimeException var6) {
         throw tm.aw(var6, "ic.ar(" + ')');
      }
   }

   void az(byte var1) {
      try {
         Iterator var2 = this.au.ai.iterator();

         ix var3;
         while(var2.hasNext()) {
            if (var1 >= 3) {
               throw new IllegalStateException();
            }

            var3 = (ix)var2.next();
            if (null != var3.ap) {
               if (var1 >= 3) {
                  throw new IllegalStateException();
               }

               if (!var3.ap.ap(-1712646151)) {
                  if (var1 >= 3) {
                     throw new IllegalStateException();
                  }

                  return;
               }
            }
         }

         var2 = this.au.ai.iterator();

         while(var2.hasNext()) {
            if (var1 >= 3) {
               throw new IllegalStateException();
            }

            var3 = (ix)var2.next();
            if (null != var3.ap) {
               if (var1 >= 3) {
                  return;
               }

               byte[] var4 = var3.ap.aw((byte)12);
               if (var4 != null) {
                  if (var1 >= 3) {
                     throw new IllegalStateException();
                  }

                  if (var4.length > 0) {
                     if (var1 >= 3) {
                        return;
                     }

                     this.an = -296155246;
                     return;
                  }
               }
            }
         }

         this.ar((short)14786);
         this.an = -740388115;
      } catch (RuntimeException var5) {
         throw tm.aw(var5, "ic.az(" + ')');
      }
   }

   public boolean co(String var1, ex var2) {
      try {
         JSONObject var3 = (new ts(var1.getBytes())).ao(-1625190823);

         try {
            this.az = var3.getInt("version") * 1779077551;
         } catch (Exception var5) {
            this.ar((short)7139);
            this.an = 432729360;
            return false;
         }

         if (!this.au.aj(var3, this.az * 220800140, var2, -887810460)) {
            this.an = -888465738;
         }

         this.an = (this.au.ai.size() > 0 ? 1 : 2) * 836869674;
      } catch (UnsupportedEncodingException var6) {
         this.an = 162768503;
      }

      return -1016658311 * this.an < 3;
   }

   public String an(byte var1) {
      try {
         return this.au.as;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ic.an(" + ')');
      }
   }

   public float[] ao(byte var1) {
      try {
         return this.au.ae;
      } catch (RuntimeException var2) {
         throw tm.aw(var2, "ic.ao(" + ')');
      }
   }

   public it ad() {
      return this.at;
   }
}
