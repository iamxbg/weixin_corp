package weixin_corp.message;

import java.util.HashMap;
import java.util.Map;

public class TextMessage extends BaseMessage implements IWeiXinMessage{

	static final String MSG_TYPE="text";
	private Map<String, String> text=new HashMap<>();
	private int safe=0;
	
	
	public TextMessage(String touser, String toparty, String totag, int agentid,String value,int safe) {
		super(touser, toparty, totag, agentid);
		this.text.put("content", value);
		super.msgtype=MSG_TYPE;
		this.safe=safe;
	}

	public Map<String, String> getText() {
		return text;
	}

	public void setText(Map<String, String> text) {
		this.text = text;
	}

	public int getSafe() {
		return safe;
	}

	public void setSafe(int safe) {
		this.safe = safe;
	}


}
