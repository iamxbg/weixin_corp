package weixin_corp.service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.http.client.ClientProtocolException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.concurrent.FailureCallback;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.SuccessCallback;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

import weixin_corp.config.RootConfig;
import weixin_corp.entity.AccessToken;
import weixin_corp.message.IWeiXinMessage;
import weixin_corp.message.MessageResponse;
import weixin_corp.message.WeiXinMessageAppInfo;
import weixin_corp.message.WeiXinMessageFactory;
import weixin_corp.message.util.IMessageContentBuilder;
import weixin_corp.message.util.TextCardMessageContentBuilder;
import weixin_corp.message.util.TextMessageContentBuilder;
import weixin_corp.util.AccessTokenManager;
import weixin_corp.util.RequestUriUtil;

@ContextConfiguration(classes= {RootConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class PushMessageServiceTest {

	@Autowired
	private PushMessageService service;
	
	private final String access_token="";
	
	private final int appId=0; //phonebook app id
	
	
	@Resource(name="localAccessTokenManager")
	private AccessTokenManager manager;
	
	@SuppressWarnings("unchecked")
	@Test
	public void testPushMessage_Raw() throws IOException {
		
		int agentId=1000002;

		WeiXinMessageAppInfo info=new WeiXinMessageAppInfo();
			info.setAgentId(agentId);
			info.setMsgType("text");
			info.setToParty("");
			info.setToTag("");
			info.setToUser("WangTianYou");
			
		TextMessageContentBuilder builder=new TextMessageContentBuilder();
			builder.setContent("Hello Friday!");
			builder.setSafe(1);
		IWeiXinMessage message=WeiXinMessageFactory.createWeiXinMessage(info, builder);
		
		
		JsonGenerator generator=new JsonFactory(new ObjectMapper()).createGenerator(System.out);
			
		generator.writeObject(message);
		
		
		try {
			int appid=0;	//phone-book app id
			
			AccessToken t=manager.getAccessToken(appid);
			
			System.out.println("AccessTOKEN:"+t.getAccessToken());
			
			//String access_token="2wj-tD4OhZNt6iTNKGR68oYCZJHwYNP_GIa7_9dAc1A3YrU3hDZuoW6Ndj8ZSp4KFGgXimS2Ga2PaVOtxHDr-8KIRxqiPhrpzIDTAga-UCgxhuz6F1p2nv32Q2qg8i9Q1E1Jhrtsw24IKXQU4cj-WbPs6Rb9BcZo-pSVkndt0wLgd5-og_tF-hMbYMYqbTT3_5dB5qXQjRoXuMZQFci-tA";
			
			String url="https://qyapi.weixin.qq.com/cgi-bin/message/send?access_token="+t.getAccessToken();
			
			MessageResponse response=service.push(url, message);

			if(response!=null) {
				System.out.println("RESPONSE:"+response.getErrmsg());
			}else {
				System.out.println("NO RESPONE");
			}
			
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
