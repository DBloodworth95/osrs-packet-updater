package com.jagex.oldscape.pub;

public interface RefreshAccessTokenResponse {
   String getRefreshToken();

   String getAccessToken();

   boolean isSuccess();
}
