package weixin_corp.message;

abstract class BaseMessage {
		
	private String touser;
	private String toparty;
	private String totag;
	String msgtype;
	private int agentid;

	
	public BaseMessage(String touser, String toparty, String totag, int agentid) {
		this.touser = touser;
		this.toparty = toparty;
		this.totag = totag;
		this.agentid = agentid;
	}



	public String getTouser() {
		return touser;
	}



	public void setTouser(String touser) {
		this.touser = touser;
	}



	public String getToparty() {
		return toparty;
	}



	public void setToparty(String toparty) {
		this.toparty = toparty;
	}



	public String getTotag() {
		return totag;
	}



	public void setTotag(String totag) {
		this.totag = totag;
	}



	public String getMsgtype() {
		return msgtype;
	}
	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}
	public int getAgentid() {
		return agentid;
	}
	public void setAgentid(int agentid) {
		this.agentid = agentid;
	}

	
	
	
}
