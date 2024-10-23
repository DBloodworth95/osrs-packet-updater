import java.util.zip.Inflater;

public class vs {
   Inflater ac;

   public vs() {
      try {
         this(-1, 1000000, 1000000);
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "vs.<init>(" + ')');
      }
   }

   vs(int var1, int var2, int var3) {
      try {
         super();
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "vs.<init>(" + ')');
      }
   }

   public void ae(vf var1, byte[] var2) {
      if (993673460 == var1.at[var1.au * -383414420] && var1.at[var1.au * -562097902 + 1] == 492828547) {
         if (null == this.ac) {
            this.ac = new Inflater(true);
         }

         try {
            this.ac.setInput(var1.at, 10 + var1.au * -658559452, var1.at.length - (var1.au * -1027766515 + 10 + 8));
            this.ac.inflate(var2);
         } catch (Exception var4) {
            this.ac.reset();
            throw new RuntimeException("");
         }

         this.ac.reset();
      } else {
         throw new RuntimeException("");
      }
   }

   public void ac(vf var1, byte[] var2, int var3) {
      try {
         if (31 == var1.at[var1.au * -1027766515]) {
            if (var3 >= 24166233) {
               throw new IllegalStateException();
            }

            if (var1.at[var1.au * -1027766515 + 1] == -117) {
               if (null == this.ac) {
                  if (var3 >= 24166233) {
                     return;
                  }

                  this.ac = new Inflater(true);
               }

               try {
                  this.ac.setInput(var1.at, 10 + var1.au * -1027766515, var1.at.length - (var1.au * -1027766515 + 10 + 8));
                  this.ac.inflate(var2);
               } catch (Exception var5) {
                  this.ac.reset();
                  throw new RuntimeException("");
               }

               this.ac.reset();
               return;
            }

            if (var3 >= 24166233) {
               throw new IllegalStateException();
            }
         }

         throw new RuntimeException("");
      } catch (RuntimeException var6) {
         throw vk.ae(var6, "vs.ac(" + ')');
      }
   }

   public void ag(vf var1, byte[] var2) {
      if (31 == var1.at[var1.au * -1980840909] && var1.at[var1.au * -1027766515 + 1] == -117) {
         if (null == this.ac) {
            this.ac = new Inflater(true);
         }

         try {
            this.ac.setInput(var1.at, 10 + var1.au * 1437253873, var1.at.length - (var1.au * -1027766515 + 10 + 8));
            this.ac.inflate(var2);
         } catch (Exception var4) {
            this.ac.reset();
            throw new RuntimeException("");
         }

         this.ac.reset();
      } else {
         throw new RuntimeException("");
      }
   }

   public void am(vf var1, byte[] var2) {
      if (31 == var1.at[var1.au * -1027766515] && var1.at[var1.au * -1027766515 + 1] == -117) {
         if (null == this.ac) {
            this.ac = new Inflater(true);
         }

         try {
            this.ac.setInput(var1.at, 10 + var1.au * -1027766515, var1.at.length - (var1.au * -1027766515 + 10 + 8));
            this.ac.inflate(var2);
         } catch (Exception var4) {
            this.ac.reset();
            throw new RuntimeException("");
         }

         this.ac.reset();
      } else {
         throw new RuntimeException("");
      }
   }
}
