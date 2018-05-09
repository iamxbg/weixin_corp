package weixin_corp.message;

import java.util.List;
import java.util.Map;

public  class WeiXinMessage {

		private List<String> toUser;
		private List<String> toParty;
		private List<String> toTag;
		private String msgType;
		private String agentId;
		private int safe;
		private Map<String, Object> content;

		protected WeiXinMessage(List<String> toUser, List<String> toParty, List<String> toTag, String msgType,String agentId,Map<String, Object> content,int safe) {
			super();
			this.toUser = toUser;
			this.toParty = toParty;
			this.toTag = toTag;
			this.msgType = msgType;
			this.agentId=agentId;
			this.safe=safe;
			this.content=content;
		}
		

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

		public String getMsgType() {
			return msgType;
		}

		public void setMsgType(String msgType) {
			this.msgType = msgType;
		}

		public Map<String, Object> getContent() {
			return content;
		}

		public void setContent(Map<String, Object> content) {
			this.content = content;
		}

		public String getAgentId() {
			return agentId;
		}

		public void setAgentId(String agentId) {
			this.agentId = agentId;
		}

		public int getSafe() {
			return safe;
		}

		public void setSafe(int safe) {
			this.safe = safe;
		}
		
		
		
}
