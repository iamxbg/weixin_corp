package weixin_corp.entity;

import java.util.Date;

public class AccessToken {
	
		private int appId;
		private String appSecrect;
		private String corpId;
		private Date acquiredTime;
		private long expiresIn;
		private String value;
		

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

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
		
		
		
		
		
		
}
