package weixin_corp.message;

public class MPNewsArticle {
	
	private String title;
	private String thumb_media_id;
	private String author;
	private String content_source_url;
	private String content;
	private String digest;
	
	public MPNewsArticle(String title,String thumb_media_id,String author,String content_source_url,String content,String digest) {
		// TODO Auto-generated constructor stub
		this.title=title;
		this.thumb_media_id=thumb_media_id;
		this.author=author;
		this.content_source_url=content_source_url;
		this.content=content;
		this.digest=digest;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getThumb_media_id() {
		return thumb_media_id;
	}

	public void setThumb_media_id(String thumb_media_id) {
		this.thumb_media_id = thumb_media_id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent_source_url() {
		return content_source_url;
	}

	public void setContent_source_url(String content_source_url) {
		this.content_source_url = content_source_url;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDigest() {
		return digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}
	
	
}
