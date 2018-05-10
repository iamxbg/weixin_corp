package weixin_corp.message.util;

public class FileMessageContentBuilder implements IMessageContentBuilder{

	private final String msgType="file";
	
	private String mediaId;
	
	private int safe=0;
	
	@Override
	public String getMsgType() {
		// TODO Auto-generated method stub
		return this.msgType;
	}

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public int getSafe() {
		return safe;
	}

	public void setSafe(int safe) {
		this.safe = safe;
	}

	
	
}
