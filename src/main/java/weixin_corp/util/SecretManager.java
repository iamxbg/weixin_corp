package weixin_corp.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class SecretManager {
	
	private String corpId;
	private  Map<Integer, String> secretMap=new HashMap<Integer, String>();
	
	
	//to-do
	public  void loadSecrets() {
		//dynamic get secrets
	}

	public  String getSecret(int appId) {
		return secretMap.get(appId);
	}


	public String getCorpId() {
		return corpId;
	}


	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}
	
	
	
}
