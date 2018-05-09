package weixin_corp.message.builder;

public class TextCardMessageContentBuilder implements IMessageContentBuilder{
	
	private final String msgType="textcard";
	
	private String title;
	
	private String description;
	
	private String url;
	
	private String btntxt;
	
	

	@Override
	public String getMsgType() {
		// TODO Auto-generated method stub
		return this.msgType;
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



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public String getBtntxt() {
		return btntxt;
	}



	public void setBtntxt(String btntxt) {
		this.btntxt = btntxt;
	}
	
	

}
