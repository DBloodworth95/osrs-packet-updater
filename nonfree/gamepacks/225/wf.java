public class wf implements Comparable {
   String ae;
   String ac;
   static final int al = 8;

   public String af() {
      return this.ac;
   }

   public wf(String var1, ub var2) {
      try {
         super();
         this.ac = var1;
         String var4;
         if (var1 == null) {
            var4 = null;
         } else {
            int var5 = 0;

            int var6;
            for(var6 = var1.length(); var5 < var6 && me.ag(var1.charAt(var5), -2098954033); ++var5) {
            }

            while(var6 > var5 && me.ag(var1.charAt(var6 - 1), -2098954033)) {
               --var6;
            }

            int var7 = var6 - var5;
            if (var7 >= 1 && var7 <= da.ac(var2, -420474398)) {
               StringBuilder var8 = new StringBuilder(var7);

               for(int var9 = var5; var9 < var6; ++var9) {
                  char var10 = var1.charAt(var9);
                  if (hj.ae(var10, (byte)-57)) {
                     char var11 = kj.am(var10, -1995944079);
                     if (0 != var11) {
                        var8.append(var11);
                     }
                  }
               }

               if (var8.length() == 0) {
                  var4 = null;
               } else {
                  var4 = var8.toString();
               }
            } else {
               var4 = null;
            }
         }

         this.ae = var4;
      } catch (RuntimeException var12) {
         throw vk.ae(var12, "wf.<init>(" + ')');
      }
   }

   public String ac(byte var1) {
      try {
         return this.ac;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "wf.ac(" + ')');
      }
   }

   public String ae(int var1) {
      try {
         return this.ae;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "wf.ae(" + ')');
      }
   }

   public boolean ap() {
      return this.ae != null;
   }

   public boolean equals(Object var1) {
      try {
         if (var1 instanceof wf) {
            wf var2 = (wf)var1;
            if (null == this.ae) {
               return var2.ae == null;
            } else if (var2.ae == null) {
               return false;
            } else {
               return this.hashCode() != var2.hashCode() ? false : this.ae.equals(var2.ae);
            }
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "wf.equals(" + ')');
      }
   }

   public int hashCode() {
      try {
         return null == this.ae ? 0 : this.ae.hashCode();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "wf.hashCode(" + ')');
      }
   }

   public int amy() {
      return null == this.ae ? 0 : this.ae.hashCode();
   }

   public int ax(wf var1, int var2) {
      try {
         if (null == this.ae) {
            if (var2 >= 229464746) {
               throw new IllegalStateException();
            } else if (var1.ae == null) {
               if (var2 >= 229464746) {
                  throw new IllegalStateException();
               } else {
                  return 0;
               }
            } else {
               return 1;
            }
         } else if (null == var1.ae) {
            if (var2 >= 229464746) {
               throw new IllegalStateException();
            } else {
               return -1;
            }
         } else {
            return this.ae.compareTo(var1.ae);
         }
      } catch (RuntimeException var3) {
         throw vk.ae(var3, "wf.ax(" + ')');
      }
   }

   public String amp() {
      return this.ac((byte)100);
   }

   public boolean gn(Object var1) {
      if (var1 instanceof wf) {
         wf var2 = (wf)var1;
         if (null == this.ae) {
            return var2.ae == null;
         } else if (var2.ae == null) {
            return false;
         } else {
            return this.hashCode() != var2.hashCode() ? false : this.ae.equals(var2.ae);
         }
      } else {
         return false;
      }
   }

   public boolean gg(Object var1) {
      if (var1 instanceof wf) {
         wf var2 = (wf)var1;
         if (null == this.ae) {
            return var2.ae == null;
         } else if (var2.ae == null) {
            return false;
         } else {
            return this.hashCode() != var2.hashCode() ? false : this.ae.equals(var2.ae);
         }
      } else {
         return false;
      }
   }

   public int compareTo(Object var1) {
      try {
         return this.ax((wf)var1, -813911392);
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "wf.compareTo(" + ')');
      }
   }

   public int amd() {
      return null == this.ae ? 0 : this.ae.hashCode();
   }

   public String aml() {
      return this.ac((byte)100);
   }

   public String ad() {
      return this.ae;
   }

   public String ame() {
      return this.ac((byte)100);
   }

   public int am(Object var1) {
      return this.ax((wf)var1, -1342313323);
   }

   public String aq() {
      return this.ac;
   }

   public wf(String var1) {
      try {
         super();
         this.ac = var1;
         ub var4 = ub.ac;
         String var3;
         if (var1 == null) {
            var3 = null;
         } else {
            int var5 = 0;

            int var6;
            for(var6 = var1.length(); var5 < var6 && me.ag(var1.charAt(var5), -2098954033); ++var5) {
            }

            while(var6 > var5 && me.ag(var1.charAt(var6 - 1), -2098954033)) {
               --var6;
            }

            int var7 = var6 - var5;
            if (var7 >= 1 && var7 <= da.ac(var4, -1003319598)) {
               StringBuilder var8 = new StringBuilder(var7);

               for(int var9 = var5; var9 < var6; ++var9) {
                  char var10 = var1.charAt(var9);
                  if (hj.ae(var10, (byte)-102)) {
                     char var11 = kj.am(var10, -2019953575);
                     if (var11 != 0) {
                        var8.append(var11);
                     }
                  }
               }

               if (var8.length() == 0) {
                  var3 = null;
               } else {
                  var3 = var8.toString();
               }
            } else {
               var3 = null;
            }
         }

         this.ae = var3;
      } catch (RuntimeException var12) {
         throw vk.ae(var12, "wf.<init>(" + ')');
      }
   }

   public String at() {
      return this.ac;
   }

   public String au() {
      return this.ac;
   }

   public String ar() {
      return this.ac;
   }

   public String al() {
      return this.ac;
   }

   public boolean ag(int var1) {
      try {
         boolean var10000;
         if (this.ae != null) {
            if (var1 == 1320710738) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw vk.ae(var2, "wf.ag(" + ')');
      }
   }

   public boolean ah() {
      return this.ae != null;
   }

   public String toString() {
      try {
         return this.ac((byte)100);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "wf.toString(" + ')');
      }
   }

   public int ab(wf var1) {
      if (null == this.ae) {
         return var1.ae == null ? 0 : 1;
      } else {
         return null == var1.ae ? -1 : this.ae.compareTo(var1.ae);
      }
   }
}
