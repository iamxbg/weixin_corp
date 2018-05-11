package weixin_corp.message.type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import weixin_corp.message.BaseMessage;
import weixin_corp.message.IWeiXinMessage;
import weixin_corp.message.NewsArticle;


public class NewsMessage extends BaseMessage implements IWeiXinMessage{

	static final String MSG_TYPE="news";
	private List<NewsArticle> articles=new ArrayList<>();
	
	public NewsMessage(String touser, String toparty, String totag, int agentid,List<NewsArticle> articles ) {
		super(touser, toparty, totag, agentid);
		this.articles=articles;
		super.msgtype=MSG_TYPE;
	}

	public List<NewsArticle> getArticles() {
		return articles;
	}

	public void setArticles(List<NewsArticle> articles) {
		this.articles = articles;
	}
	
	
	
}
