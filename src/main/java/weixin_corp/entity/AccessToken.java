package weixin_corp.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccessToken {
		
		
		private int appId;
		private String appSecrect;
		private String corpId;
		private Date acquiredTime;
		@JsonProperty("expires_in")
		private long expiresIn;
		@JsonProperty("access_token")
		private String accessToken;
		@JsonProperty
		private int errcode;
		@JsonProperty
		private String errmsg;
		public int getAppId() {
			return appId;
		}
		public void setAppId(int appId) {
			this.appId = appId;
		}
		public String getAppSecrect() {
			return appSecrect;
		}
		public void setAppSecrect(String appSecrect) {
			this.appSecrect = appSecrect;
		}
		public String getCorpId() {
			return corpId;
		}
		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}
		public Date getAcquiredTime() {
			return acquiredTime;
		}
		public void setAcquiredTime(Date acquiredTime) {
			this.acquiredTime = acquiredTime;
		}
		public long getExpiresIn() {
			return expiresIn;
		}
		public void setExpiresIn(long expiresIn) {
			this.expiresIn = expiresIn;
		}
		public String getAccessToken() {
			return accessToken;
		}
		public void setAccessToken(String accessToken) {
			this.accessToken = accessToken;
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
		

		
		
		
		
		
}
