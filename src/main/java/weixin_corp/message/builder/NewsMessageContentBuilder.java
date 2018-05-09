package weixin_corp.message.builder;

import java.util.ArrayList;
import java.util.List;

import weixin_corp.message.NewsArticle;

public class NewsMessageContentBuilder implements IMessageContentBuilder{

	private final String msgType="news";
	
	private List<NewsArticle> articles=new ArrayList<>();
	
	@Override
	public String getMsgType() {
		// TODO Auto-generated method stub
		return msgType;
	}
	
	public void addArticle(NewsArticle article) {
		articles.add(article);
	}

	public List<NewsArticle> getArticles() {
		return articles;
	}
	
	

}
