package weixin_corp.message.util;

public class TextMessageContentBuilder implements IMessageContentBuilder{

	private final String msgType="text";
	
	private String content;
	
	private int safe=0;
	
	@Override
	public String getMsgType() {
		// TODO Auto-generated method stub
		return msgType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getSafe() {
		return safe;
	}

	public void setSafe(int safe) {
		this.safe = safe;
	}

	
}
