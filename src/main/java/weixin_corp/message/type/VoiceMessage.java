package weixin_corp.message.type;

import java.util.HashMap;
import java.util.Map;

import weixin_corp.message.BaseMessage;
import weixin_corp.message.IWeiXinMessage;

public class VoiceMessage extends BaseMessage  implements IWeiXinMessage{
	
	static final String MSG_TYPE="voice";
	private Map<String, String> voice=new HashMap<>();
	
	public VoiceMessage(String touser, String toparty, String totag, int agentid,String media_id) {
		super(touser, toparty, totag, agentid);
		voice.put("media_id", media_id);
		super.msgtype=MSG_TYPE;
	}

	public Map<String, String> getVoice() {
		return voice;
	}

	public void setVoice(Map<String, String> voice) {
		this.voice = voice;
	}
	
	
	
}
