package weixin_corp.message.builder;

public class ImageMessageContentBuilder implements IMessageContentBuilder {

	private final String msgType="image";
	
	private String mediaId;
	
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
	
	

	
}
