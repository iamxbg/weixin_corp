package weixin_corp.message.util;

import java.util.ArrayList;
import java.util.List;

public class WeiXinMessageUtil {
	
	public static String parseListToStr(List<String> list) {
		
		assert list != null;
		StringBuilder sb=new StringBuilder();
			for(String s:list) {
				sb.append(s).append("|");
			}
		return sb.replace(sb.length()-1, sb.length(), "").toString();
		
	}
	
	
	public static List<String> parseStrToList(String str) {
		
		assert str!=null;
		
		List<String> result=new ArrayList<>();
		
		if(str.length()!=0) { 
			for(String s:str.split("|"))
				result.add(s);
	
		}
			
		return result;
		
	}
}
