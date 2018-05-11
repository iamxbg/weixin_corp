package weixin_corp.util;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class SecretManager implements InitializingBean{
	
	private String corpId;
	private  Map<Integer, String> secretMap=new HashMap<Integer, String>();
	
	
	//to-do
	public  void loadSecrets() {
		//dynamic get secrets
		
		corpId="ww354bd2f251102a27";
		
		//写死的微信phonebook的id,先做测试,appId定位0
		//String corpsecret="z3NLjjSYEXetfIiU3nfzqfkevmPHpm0RP1cHE5rHlV8";
		//自定义应用的secret

		String appSecret="UdLIdxvI0lkziVKS0y3jYhJqXeLEzuCztHbo4Ahp2jA";

		secretMap.put(0, appSecret);
		
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

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		loadSecrets();

	}
	
	
	
}
