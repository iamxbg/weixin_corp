package weixin_corp.message;

import java.util.HashMap;
import java.util.Map;

import weixin_corp.message.util.TextCardMessageContentBuilder;

public class TextcardMessage extends BaseMessage implements IWeiXinMessage{

	static final String MSG_TYPE="textcard";
	private Map<String, String> textcard=new HashMap<>();
	
	public TextcardMessage(String touser, String toparty, String totag, int agentid,String title,String description,String url,String btntxt) {
		super(touser, toparty, totag, agentid);
		textcard.put("title", title);
		textcard.put("description", description);
		textcard.put("url", url);
		textcard.put("btntxt", btntxt);
		super.msgtype=MSG_TYPE;
	}

	public Map<String, String> getTextcard() {
		return textcard;
	}

	public void setTextcard(Map<String, String> textcard) {
		this.textcard = textcard;
	}
	
	
}
