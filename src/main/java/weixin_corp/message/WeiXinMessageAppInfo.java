package weixin_corp.message;

import java.util.List;

public class WeiXinMessageAppInfo {
	
	private List<String> toUser;
	private List<String> toParty;
	private List<String> toTag;
	private int safe;
	private String agentId;
	private String msgType;
	
	public List<String> getToUser() {
		return toUser;
	}
	public void setToUser(List<String> toUser) {
		this.toUser = toUser;
	}
	public List<String> getToParty() {
		return toParty;
	}
	public void setToParty(List<String> toParty) {
		this.toParty = toParty;
	}
	public List<String> getToTag() {
		return toTag;
	}
	public void setToTag(List<String> toTag) {
		this.toTag = toTag;
	}
	public int getSafe() {
		return safe;
	}
	public void setSafe(int safe) {
		this.safe = safe;
	}
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getMsgType() {
		return msgType;
	}

	
	
}
