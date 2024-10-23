package com.jagex.oldscape.pub;

public interface OAuthApi {
   void qv(RefreshAccessTokenRequester var1);

   void setRefreshTokenRequester(RefreshAccessTokenRequester var1);

   boolean isOnLoginScreen();

   long getAccountHash();

   void setClient(int var1);

   void qy(int var1);

   boolean qo();

   void qr(OtlTokenRequester var1);

   boolean qx();

   void qd(RefreshAccessTokenRequester var1);

   long qz();

   boolean qp();

   void setOtlTokenRequester(OtlTokenRequester var1);

   void qf(RefreshAccessTokenRequester var1);

   long qq();

   void qs(int var1);

   long qg();
}
