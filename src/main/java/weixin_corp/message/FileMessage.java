package weixin_corp.message;

import java.util.HashMap;
import java.util.Map;

public class FileMessage extends BaseMessage implements IWeiXinMessage{

	static final String MSG_TYPE="file";
	private Map<String, String> file=new HashMap<>();
	private int safe=0;
	
	public FileMessage(String touser, String toparty, String totag, int agentid,String media_id,int safe) {
		super(touser, toparty, totag, agentid);
		file.put("media_id", media_id);
		super.msgtype=MSG_TYPE;
		this.safe=safe;
	}

	public Map<String, String> getFile() {
		return file;
	}

	public void setFile(Map<String, String> file) {
		this.file = file;
	}

	public int getSafe() {
		return safe;
	}

	public void setSafe(int safe) {
		this.safe = safe;
	}
	
	
}
