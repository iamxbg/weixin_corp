package weixin_corp.util;

import java.util.Map;


public class RequestUriUtil {

	public static String replaceUpperCaseParamHolders(String uriTemplate,Map<String, String> params) {
		
		for(String key:params.keySet()) {
			if(!uriTemplate.contains(key.toUpperCase())) {
				//log error
			}
			uriTemplate.replace(key.toUpperCase(), params.get(key));
		}
		
		return uriTemplate;
	}
	
}
