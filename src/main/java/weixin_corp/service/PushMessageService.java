package weixin_corp.service;

import java.io.IOException;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

import com.fasterxml.jackson.databind.ObjectMapper;

import weixin_corp.message.IWeiXinMessage;

@Service
public class PushMessageService implements IPushMessageService{
	
	//in real-production environment,using pooled client!
	private HttpClient client=HttpClients.createDefault();
	
	private ObjectMapper mapper=new ObjectMapper();

	@Override
	public ListenableFuture<Map<String, Object>> push(final String url, IWeiXinMessage message) throws ClientProtocolException, IOException {
		// TODO Auto-generated method stub

		HttpPost request=new HttpPost(url);
		
		Map<String, Object> result=client.execute(request, new ResponseHandler<Map<String, Object>>() {

			@Override
			public Map<String, Object> handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
				// TODO Auto-generated method stub
				return null;
			}
		});
		
		return null;
	}
	
	//push message with pool
	
	
	
	
}
