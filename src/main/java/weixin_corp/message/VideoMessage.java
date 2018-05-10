package weixin_corp.message;

import java.util.HashMap;
import java.util.Map;

public class VideoMessage extends BaseMessage implements IWeiXinMessage{
	
	static final String MSG_TYPE="video";
	private Map<String, String> video=new HashMap<>();
	private int safe=0;
	
	public VideoMessage(String touser, String toparty, String totag, int agentid,String media_id,String title,String description,int safe) {
		super(touser, toparty, totag, agentid);
		video.put("media_id", media_id);
		video.put("title", title);
		video.put("description", description);
		super.msgtype=MSG_TYPE;
		this.safe=safe;
	}

	public Map<String, String> getVideo() {
		return video;
	}

	public void setVideo(Map<String, String> video) {
		this.video = video;
	}

	public int getSafe() {
		return safe;
	}

	public void setSafe(int safe) {
		this.safe = safe;
	}
	
	
}
