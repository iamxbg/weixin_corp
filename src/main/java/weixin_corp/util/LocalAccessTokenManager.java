package weixin_corp.util;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.codec.Charsets;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import weixin_corp.entity.AccessToken;

/**
 * 
 * 
 * @author m
 *
 *	Request AcessToken with corpId & appSecret (which means must can get corpId ,appSecret in application.)
 *	
 */


@Component
public class LocalAccessTokenManager extends AbstractAccessTokenManager{

	@Override
	AccessToken requestAccessToken(int appId) {
		
		// TODO Auto-generated method stub
		Map<String, String> params=new HashMap<String, String>();
		
		params.put("ID", secretManager.getCorpId());
		params.put("SECRECT", secretManager.getSecret(appId));
	
	String requestUri=RequestUriUtil.replaceUpperCaseParamHolders(super.DEFAULT_URI_TEMPLATE, params);
	
		try {
			
			HttpClients.createDefault().execute(new HttpGet(requestUri), new ResponseHandler<String>() {

				@Override
				public String handleResponse(HttpResponse response)
						throws ClientProtocolException, IOException {
					// TODO Auto-generated method stub
					
					if(response.getStatusLine().getStatusCode()!=200) {
						//log error,throws error and capture ???
					}else {
						String accessTokenStr=EntityUtils.toString(response.getEntity(), Charsets.UTF_8);
						//parse accessToken to Object
						
						//save in accessTokenMap
						
						
					}
					
					return null;
				}
				
			});
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			// convert exception to custom-define Exception.
		}
		return null;
		
	}

	@Override
	public AccessTokenManager createAccessTokenManager() {
		// TODO Auto-generated method stub
		return new LocalAccessTokenManager();
	}

	@Override
	public SecretManager getSecretManager() {
		// TODO Auto-generated method stub
		return super.secretManager;
	}








	

	
}
