package org.bouncycastle.util;

import java.util.ArrayList;

class Strings$StringListImpl extends ArrayList implements StringList {
   public String[] toStringArray(int var1, int var2) {
      String[] var3 = new String[var2 - var1];

      for(int var4 = var1; var4 != this.size() && var4 != var2; ++var4) {
         var3[var4 - var1] = (String)this.get(var4);
      }

      return var3;
   }

   public boolean add(String var1) {
      return super.add(var1);
   }

   public void add(int var1, String var2) {
      super.add(var1, var2);
   }

   public String[] toStringArray() {
      String[] var1 = new String[this.size()];

      for(int var2 = 0; var2 != var1.length; ++var2) {
         var1[var2] = (String)this.get(var2);
      }

      return var1;
   }

   public String set(int var1, String var2) {
      return (String)super.set(var1, var2);
   }

   Strings$StringListImpl() {
   }

   // $FF: synthetic method
   Strings$StringListImpl(Strings$1 var1) {
      this();
   }
}
