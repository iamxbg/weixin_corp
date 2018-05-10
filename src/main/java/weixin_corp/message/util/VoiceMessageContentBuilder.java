package weixin_corp.message.util;

public class VoiceMessageContentBuilder implements IMessageContentBuilder{

	private final String msgType="voice";
	
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
