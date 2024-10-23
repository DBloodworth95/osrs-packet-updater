public class ro {
   public static final int ax = 5000;
   public static final int ae = 1;
   static final int aw = 26;
   public static final int ac = 0;

   ro() throws Throwable {
      try {
         super();
         throw new Error();
      } catch (RuntimeException var1) {
         throw vk.ae(var1, "ro.<init>(" + ')');
      }
   }

   static int bz(int var0, dt var1, boolean var2, int var3) {
      try {
         if (var0 == 6200) {
            mp.au -= 582051378;
            client.uz = (short)hj.bg(cs.at[mp.au * 844691753], 2087493349);
            if (client.uz <= 0) {
               if (var3 != 1298032495) {
                  throw new IllegalStateException();
               }

               client.uz = 256;
            }

            client.uk = (short)hj.bg(cs.at[1 + 844691753 * mp.au], 2062928822);
            if (client.uk <= 0) {
               if (var3 != 1298032495) {
                  throw new IllegalStateException();
               }

               client.uk = 256;
            }

            return 1;
         } else if (var0 == 6201) {
            mp.au -= 582051378;
            client.vm = (short)cs.at[844691753 * mp.au];
            if (client.vm <= 0) {
               client.vm = 256;
            }

            client.vk = (short)cs.at[1 + 844691753 * mp.au];
            if (client.vk <= 0) {
               if (var3 != 1298032495) {
                  throw new IllegalStateException();
               }

               client.vk = 320;
            }

            return 1;
         } else if (6202 == var0) {
            if (var3 != 1298032495) {
               throw new IllegalStateException();
            } else {
               mp.au -= 1164102756;
               client.vc = (short)cs.at[844691753 * mp.au];
               if (client.vc <= 0) {
                  if (var3 != 1298032495) {
                     throw new IllegalStateException();
                  }

                  client.vc = 1;
               }

               client.va = (short)cs.at[mp.au * 844691753 + 1];
               if (client.va <= 0) {
                  client.va = 32767;
               } else if (client.va < client.vc) {
                  if (var3 != 1298032495) {
                     throw new IllegalStateException();
                  }

                  client.va = client.vc;
               }

               client.vf = (short)cs.at[2 + mp.au * 844691753];
               if (client.vf <= 0) {
                  if (var3 != 1298032495) {
                     throw new IllegalStateException();
                  }

                  client.vf = 1;
               }

               client.vh = (short)cs.at[3 + mp.au * 844691753];
               if (client.vh <= 0) {
                  if (var3 != 1298032495) {
                     throw new IllegalStateException();
                  }

                  client.vh = 32767;
               } else if (client.vh < client.vf) {
                  if (var3 != 1298032495) {
                     throw new IllegalStateException();
                  }

                  client.vh = client.vf;
               }

               return 1;
            }
         } else if (6203 == var0) {
            if (var3 != 1298032495) {
               throw new IllegalStateException();
            } else {
               if (client.pb != null) {
                  if (var3 != 1298032495) {
                     throw new IllegalStateException();
                  }

                  hw.ja(0, 0, -1339552805 * client.pb.bu, 1036386215 * client.pb.br, false, 781811094);
                  cs.at[(mp.au += -1856457959) * 844691753 - 1] = client.vb * -249064015;
                  cs.at[(mp.au += -1856457959) * 844691753 - 1] = -1451243729 * client.vg;
               } else {
                  cs.at[(mp.au += -1856457959) * 844691753 - 1] = -1;
                  cs.at[(mp.au += -1856457959) * 844691753 - 1] = -1;
               }

               return 1;
            }
         } else if (6204 == var0) {
            if (var3 != 1298032495) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = client.vm;
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = client.vk;
               return 1;
            }
         } else if (6205 == var0) {
            if (var3 != 1298032495) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = db.bl(client.uz, 912619882);
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = db.bl(client.uk, 1847394752);
               return 1;
            }
         } else if (6220 == var0) {
            if (var3 != 1298032495) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
               return 1;
            }
         } else if (var0 == 6221) {
            cs.at[(mp.au += -1856457959) * 844691753 - 1] = 0;
            return 1;
         } else if (6222 == var0) {
            if (var3 != 1298032495) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = -1991951399 * fa.aj;
               return 1;
            }
         } else if (6223 == var0) {
            if (var3 != 1298032495) {
               throw new IllegalStateException();
            } else {
               cs.at[(mp.au += -1856457959) * 844691753 - 1] = 608173899 * en.av;
               return 1;
            }
         } else {
            return 2;
         }
      } catch (RuntimeException var4) {
         throw vk.ae(var4, "ro.bz(" + ')');
      }
   }
}
