package weixin_corp.message.builder;

public class FileMessageContentBuilder implements IMessageContentBuilder{

	private final String msgType="file";
	
	private String mediaId;
	
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

	
	
}
