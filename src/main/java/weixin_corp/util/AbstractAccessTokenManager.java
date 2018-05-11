package weixin_corp.util;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import weixin_corp.entity.AccessToken;

abstract class AbstractAccessTokenManager implements AccessTokenManager{

	private static Logger log=LogManager.getLogger();
	
	Map<Integer, AccessToken> accessTokenMap=new HashMap<>();
	
	SecretManager secretManager;

	
	String DEFAULT_URI_TEMPLATE="https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=ID&corpsecret=SECRECT";
	
	@Override
	public  AccessToken getAccessToken(int appId) {
			
			//if access-token exists & not expired , return access_token directly.
			if(accessTokenMap.size()>0 && accessTokenMap.containsKey(appId) 
					//check if expired
					&& (accessTokenMap.get(appId).getAcquiredTime().getTime()+accessTokenMap.get(appId).getExpiresIn())<new Date().getTime()) {
				
				System.out.println("use existing token");
				
				log.debug("TOKEN EXISTS AND NOT DISPIRED, DIRECTLY REUTRN !");
				
				
				
				return accessTokenMap.get(appId);
			
			//get new access_token ,save in AccessTokenManager and return
			}else {
				
				System.out.println("request new token");
				
				return this.requestNewAccessToken(appId);
			}


	}
	
	public abstract AccessTokenManager createAccessTokenManager(SecretManager sManager) ;


	
}
