package weixin_corp.message.builder;

public class TextMessageContentBuilder implements IMessageContentBuilder{

	private final String msgType="text";
	
	private String content;
	
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

	
}
