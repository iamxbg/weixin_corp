package weixin_corp.message.type;

import java.util.HashMap;
import java.util.Map;

import weixin_corp.message.BaseMessage;
import weixin_corp.message.IWeiXinMessage;

public class ImageMessage extends BaseMessage implements IWeiXinMessage{

	static final String MSG_TYPE="image";
	private Map<String, String> image=new HashMap<>();
	private int safe=0;
	
	public ImageMessage(String touser, String toparty, String totag, int agentid,String media_id,int safe) {
		super(touser, toparty, totag, agentid);
		image.put("media_id", media_id);
		super.msgtype=MSG_TYPE;
		this.safe=safe;
	}

	public Map<String, String> getImage() {
		return image;
	}

	public void setImage(Map<String, String> image) {
		this.image = image;
	}

	public int getSafe() {
		return safe;
	}

	public void setSafe(int safe) {
		this.safe = safe;
	}
	
	
}
