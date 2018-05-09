package weixin_corp.util;

import java.util.Map;

import weixin_corp.entity.AccessToken;

public interface AccessTokenManager {

	
	AccessToken getAccessToken(int appId);
	
	SecretManager getSecretManager();
}
