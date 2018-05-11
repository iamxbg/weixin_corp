package weixin_corp.util;

import java.util.Map;

import weixin_corp.entity.AccessToken;

public interface AccessTokenManager {

	
	public AccessToken getAccessToken(int appId);
	
	/**
	 * request a new access token with appID
	 * @param appId
	 * @return
	 */
	public AccessToken requestNewAccessToken(int appId) ;
	
	SecretManager getSecretManager();
}
