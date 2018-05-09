package weixin_corp.util;

import org.springframework.stereotype.Component;

import weixin_corp.entity.AccessToken;

/**
 * 
 * @author m
 *
 *	this class is used when can't get corpId & corpSecret in app directly.
 *	Must request for access-token from another place.
 *	May using OAuth2.0 or openId tech ???
 *
 */
@Component
public class RemoteAccessTokenManager extends AbstractAccessTokenManager{

	
	
	@Deprecated
	@Override
	public SecretManager getSecretManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccessTokenManager createAccessTokenManager() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	@Override
	AccessToken requestAccessToken(int appId) {
		// TODO Auto-generated method stub
		return null;
	}

}
