package weixin_corp.service;

import java.io.IOException;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.springframework.util.concurrent.ListenableFuture;

import weixin_corp.message.IWeiXinMessage;
import weixin_corp.message.MessageResponse;

public interface IPushMessageService {
	
	MessageResponse push(String url,IWeiXinMessage message) throws ClientProtocolException, IOException;
}
