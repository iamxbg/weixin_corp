package weixin_corp.message.type;

import java.util.ArrayList;
import java.util.List;

import weixin_corp.message.BaseMessage;
import weixin_corp.message.IWeiXinMessage;
import weixin_corp.message.MPNewsArticle;

public class MPNewsMessage extends BaseMessage implements IWeiXinMessage{
	
	static final String MSG_TYPE="mpnews";
	private List<MPNewsArticle> articles=new ArrayList<>();
	private int safe;
	
	public MPNewsMessage(String touser, String toparty, String totag, int agentid,int safe,List<MPNewsArticle>  articles) {
		super(touser, toparty, totag, agentid);
		this.articles=articles;
		super.msgtype=MSG_TYPE;
		this.safe=safe;
	}

	public List<MPNewsArticle> getArticles() {
		return articles;
	}

	public void setArticles(List<MPNewsArticle> articles) {
		this.articles = articles;
	}

	public int getSafe() {
		return safe;
	}

	public void setSafe(int safe) {
		this.safe = safe;
	}
	
	
}
