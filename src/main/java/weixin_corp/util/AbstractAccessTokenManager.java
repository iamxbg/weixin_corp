package weixin_corp.util;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

import weixin_corp.entity.AccessToken;

abstract class AbstractAccessTokenManager implements AccessTokenManager{

	
	private Map<Integer, AccessToken> accessTokenMap=new HashMap<>();
	@Autowired
	SecretManager secretManager;
	
	private AccessTokenManager manager=null;
	
	String DEFAULT_URI_TEMPLATE="https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=ID&corpsecret=SECRECT";
	
	@Override
	public  AccessToken getAccessToken(int appId) {
		if(manager==null) {
			this.manager=createAccessTokenManager();
		}else {
			
			//if access-token exists & not expired , return access_token directly.
			if(accessTokenMap.size()>0 && accessTokenMap.containsKey(appId) 
					//check if expired
					&& (accessTokenMap.get(appId).getAcquiredTime().getTime()+accessTokenMap.get(appId).getExpiresIn())<new Date().getTime()) {
				
				return accessTokenMap.get(appId);
			
			//get new access_token ,save in AccessTokenManager and return
			}else {

				
			}
			
			
			
		}
		
			
			return manager.getAccessToken(appId);
	}
	
	public abstract AccessTokenManager createAccessTokenManager() ;

	abstract AccessToken requestAccessToken(int appId) ;
	
	
	
	
}
