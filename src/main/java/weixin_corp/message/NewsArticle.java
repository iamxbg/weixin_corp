package weixin_corp.message;

public class NewsArticle {
	
	private String title;
	private String description;
	private String url;
	private String picUrl;
	private String btxtxt;
	
	
	public NewsArticle(String title, String description, String url, String picUrl, String btxtxt) {
		super();
		this.title = title;
		this.description = description;
		this.url = url;
		this.picUrl = picUrl;
		this.btxtxt = btxtxt;
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
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getBtxtxt() {
		return btxtxt;
	}
	public void setBtxtxt(String btxtxt) {
		this.btxtxt = btxtxt;
	}
	

}
