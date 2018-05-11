package weixin_corp.service;

import java.io.IOException;
import java.util.Date;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.SerializableEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.Message;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

import weixin_corp.message.IWeiXinMessage;
import weixin_corp.message.MessageResponse;

@Service
public class PushMessageService implements IPushMessageService{
	
	//in real-production environment,using pooled client!
	private HttpClient client=HttpClients.createDefault();
	
	private ObjectMapper mapper=new ObjectMapper();
	
	
	private static Logger logger=LogManager.getLogger(); 
	

	@Override
	public MessageResponse push(final String url, IWeiXinMessage message) throws ClientProtocolException, IOException {
		// TODO Auto-generated method stub
		
		
		logger.info("PUSH MESSAGE :"+message.getMsgtype());

		HttpPost request=new HttpPost(url);

		HttpEntity entity=new SerializableEntity(message);
			
		request.setEntity(entity);
		
		MessageResponse result=client.execute(request, new ResponseHandler<MessageResponse>() {

			@Override
			public MessageResponse handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
				// TODO Auto-generated method stub
				
				if(response.getStatusLine().getStatusCode()!=200) {
					logger.error("PUSH ERROR RESPONSE:"+response.getStatusLine().getStatusCode()+" : "+response.getStatusLine().getReasonPhrase());
					//throw exception
					return null;
				}else {
					
					System.out.println("PuSH message OIK");
					JsonParser parser=new JsonFactory(new ObjectMapper()).createJsonParser(EntityUtils.toString(response.getEntity()));
					
					return parser.readValueAs(MessageResponse.class);
					
					//JsonFactory jf=new JsonFactory(new ObjectMapper());
						
				}
				
			}
		});
		
		return result;
	}
	
	//push message with pool
	
	
	
	
}
