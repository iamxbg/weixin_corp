package weixin_corp.message.util;

public class VideoMessageContentBuilder implements IMessageContentBuilder{
	
	private final String msgType="video";
	private String mediaId;
	private String title;
	private String description;
	private int safe=0;

	@Override
	public String getMsgType() {
		// TODO Auto-generated method stub
		return msgType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
