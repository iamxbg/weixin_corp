package weixin_corp.message.util;

public class ImageMessageContentBuilder implements IMessageContentBuilder {

	private final String msgType="image";
	
	private String mediaId;
	
	private int safe=0;
	
	@Override
	public String getMsgType() {
		// TODO Auto-generated method stub
		return msgType;
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
