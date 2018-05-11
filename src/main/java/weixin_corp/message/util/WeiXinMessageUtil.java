package weixin_corp.message.util;

import java.util.ArrayList;
import java.util.List;

public class WeiXinMessageUtil {
	
	public static String parseListToStr(List<String> list) {
		
		String result="";
		
		assert list != null;
		StringBuilder sb=new StringBuilder();
			for(String s:list) {
				System.out.println(">>> "+s);
				sb=sb.append(s);
				sb=sb.append("|");
			}
			//System.out.print(sb.toString()+" "+sb.length());
			
			if(sb.length()>0) {
				result= sb.replace(sb.length()-1, sb.length(), "").toString();
			}
			
			System.out.println("result:"+result);
			return result;
			
			
			
			
			
		
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
