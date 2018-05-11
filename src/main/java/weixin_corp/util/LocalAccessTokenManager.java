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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

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
	
	
	private static Logger log=LogManager.getLogger();
	
	@Autowired
	public LocalAccessTokenManager(SecretManager sManager) {
		// TODO Auto-generated constructor stub
		super.secretManager=sManager;
	}

	@Override
	public  AccessToken requestNewAccessToken(int appId) {
		
		log.debug("REQUEST NEW ACCESSTOKEN FOR APPID="+appId);
		System.out.println("REQUEST NEW ACCESSTOKEN FOR APPID="+appId );
		
		// TODO Auto-generated method stub
		Map<String, String> params=new HashMap<String, String>();
		
		assert secretManager!=null;

		
		params.put("ID", secretManager.getCorpId());
		params.put("SECRECT", secretManager.getSecret(appId));
	
		String requestUri=RequestUriUtil.replaceUpperCaseParamHolders(super.DEFAULT_URI_TEMPLATE, params);
	
		try {
			
			System.out.println("获取AccessToken的URL:"+requestUri);
			
			AccessToken token=HttpClients.createDefault().execute(new HttpGet(requestUri), new ResponseHandler<AccessToken>() {

				@Override
				public AccessToken handleResponse(HttpResponse response) throws IOException{
					// TODO Auto-generated method stub
					
					if(response.getStatusLine().getStatusCode()!=200) {
						
						log.debug("REQUEST TOKEN ERROR! "
									+response.getStatusLine().getStatusCode()+" ->"
									+response.getStatusLine().getReasonPhrase());
						
						System.out.println("REQUEST ERROR!");
					}else {
						System.out.println("OK");
					
						String accessTokenStr=EntityUtils.toString(response.getEntity(), Charsets.UTF_8);
						
						log.debug("GET NEW ACCESSTOKE:"+accessTokenStr);
						
						
						//ObjectMapper mapper=new ObjectMapper();		
						
						//AccessToken token=mapper.reader().readValue(accessTokenStr);
						
						JsonParser parser=new JsonFactory(new ObjectMapper()).createJsonParser(accessTokenStr);
						
						AccessToken token= parser.readValueAs(AccessToken.class);
						
						accessTokenMap.put(appId, token);
						
						return token;
						
					}
					return null;
					
					
				}
				
			});
			
			
			return token;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			// convert exception to custom-define Exception.
		}
		System.out.println("ERROR nULL");
		return null;

		
	}

	@Override
	public AccessTokenManager createAccessTokenManager(SecretManager manager) {
		// TODO Auto-generated method stub
		return new LocalAccessTokenManager(manager);
	}

	@Autowired
	@Override
	public SecretManager getSecretManager() {
		// TODO Auto-generated method stub
		return super.secretManager;
	}


}
