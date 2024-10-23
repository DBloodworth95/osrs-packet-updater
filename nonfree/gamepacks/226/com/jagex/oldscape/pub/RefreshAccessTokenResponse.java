package com.jagex.oldscape.pub;

public interface RefreshAccessTokenResponse {
   String getAccessToken();

   String getRefreshToken();

   boolean isSuccess();
}
