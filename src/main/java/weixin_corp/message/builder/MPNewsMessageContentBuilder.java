package weixin_corp.message.builder;

import java.util.ArrayList;
import java.util.List;

import weixin_corp.message.MPNewsArticle;

public class MPNewsMessageContentBuilder implements IMessageContentBuilder{
	
	private final String msgType="mpnews";
	
	private List<MPNewsArticle> articles=new ArrayList<>();

	@Override
	public String getMsgType() {
		// TODO Auto-generated method stub
		return this.msgType;
	}

	
	public void addArticle(MPNewsArticle article) {
		this.articles.add(article);
	}


	public List<MPNewsArticle> getArticles() {
		return articles;
	}
	
	
}
