package weixin_corp.message;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageResponse {
	
	@JsonProperty
	private int errcode;
	@JsonProperty
	private String errmsg;
	@JsonProperty
	private String invaliduser;
	@JsonProperty
	private String invalidparty;
	@JsonProperty
	private String invalidtag;
	
	
	public MessageResponse() {
		// TODO Auto-generated constructor stub
	}


	public int getErrcode() {
		return errcode;
	}


	public void setErrcode(int errcode) {
		this.errcode = errcode;
	}


	public String getErrmsg() {
		return errmsg;
	}


	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}


	public String getInvaliduser() {
		return invaliduser;
	}


	public void setInvaliduser(String invaliduser) {
		this.invaliduser = invaliduser;
	}


	public String getInvalidparty() {
		return invalidparty;
	}


	public void setInvalidparty(String invalidparty) {
		this.invalidparty = invalidparty;
	}


	public String getInvalidtag() {
		return invalidtag;
	}


	public void setInvalidtag(String invalidtag) {
		this.invalidtag = invalidtag;
	}
	
	
	
	
}
