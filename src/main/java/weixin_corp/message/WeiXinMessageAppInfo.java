package weixin_corp.message;

import java.util.ArrayList;
import java.util.List;

public class WeiXinMessageAppInfo {
	
	private List<String> toUser=new ArrayList<>();
	private List<String> toParty=new ArrayList<>();
	private List<String> toTag=new ArrayList<>();
	private int safe;
	private int agentId;
	private String msgType;
	
	
	
	public List<String> getToUser() {
		return toUser;
	}
	public void setToUser(String... toUser) {
		for(String user:toUser)
		this.toUser.add(user);
	}
	public List<String> getToParty() {
		return toParty;
	}
	public void setToParty(String... toParty) {
		for(String party:toParty)
		this.toParty.add(party);
	}
	public List<String> getToTag() {
		return toTag;
	}
	public void setToTag(String... toTag) {
		for(String tag:toTag)
		this.toTag.add(tag);
	}
	public int getSafe() {
		return safe;
	}
	public void setSafe(int safe) {
		this.safe = safe;
	}

	public String getMsgType() {
		return msgType;
	}
	public int getAgentId() {
		return agentId;
	}
	
	public void setToParty(List<String> toParty) {
		this.toParty = toParty;
	}
	public void setToUser(List<String> toUser) {
		this.toUser = toUser;
	}
	public void setToTag(List<String> toTag) {
		this.toTag = toTag;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	
	
}
