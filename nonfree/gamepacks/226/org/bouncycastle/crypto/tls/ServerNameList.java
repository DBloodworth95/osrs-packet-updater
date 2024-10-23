package org.bouncycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

public class ServerNameList {
   public Vector serverNameList;

   static short[] checkNameType(short[] var0, short var1) {
      return NameType.isValid(var1) && !Arrays.contains(var0, var1) ? Arrays.append(var0, var1) : null;
   }

   public ServerNameList(Vector var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("'serverNameList' must not be null");
      } else {
         this.serverNameList = var1;
      }
   }

   public void encode(OutputStream var1) throws IOException {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      short[] var3 = new short[0];

      for(int var4 = 0; var4 < this.serverNameList.size(); ++var4) {
         ServerName var5 = (ServerName)this.serverNameList.elementAt(var4);
         var3 = checkNameType(var3, var5.getNameType());
         if (var3 == null) {
            throw new TlsFatalAlert((short)80);
         }

         var5.encode(var2);
      }

      TlsUtils.checkUint16(var2.size());
      TlsUtils.writeUint16(var2.size(), var1);
      Streams.writeBufTo(var2, var1);
   }

   public Vector getServerNameList() {
      return this.serverNameList;
   }

   public static ServerNameList parse(InputStream var0) throws IOException {
      int var1 = TlsUtils.readUint16(var0);
      if (var1 < 1) {
         throw new TlsFatalAlert((short)50);
      } else {
         byte[] var2 = TlsUtils.readFully(var1, var0);
         ByteArrayInputStream var3 = new ByteArrayInputStream(var2);
         short[] var4 = new short[0];
         Vector var5 = new Vector();

         while(var3.available() > 0) {
            ServerName var6 = ServerName.parse(var3);
            var4 = checkNameType(var4, var6.getNameType());
            if (var4 == null) {
               throw new TlsFatalAlert((short)47);
            }

            var5.addElement(var6);
         }

         return new ServerNameList(var5);
      }
   }
}
