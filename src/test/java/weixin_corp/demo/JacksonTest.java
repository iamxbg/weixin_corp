package weixin_corp.demo;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.ObjectMapper;

import weixin_corp.config.RootConfig;
import weixin_corp.message.IWeiXinMessage;
import weixin_corp.message.NewsArticle;
import weixin_corp.message.NewsMessage;
import weixin_corp.message.WeiXinMessageAppInfo;
import weixin_corp.message.WeiXinMessageFactory;
import weixin_corp.message.util.NewsMessageContentBuilder;
import weixin_corp.message.util.TextMessageContentBuilder;

@ContextConfiguration(classes= {RootConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class JacksonTest {

	
	@Test
	public void testParseTestMessageToJSONStr() {
		
		WeiXinMessageAppInfo info=new WeiXinMessageAppInfo();
				info.setAgentId(3);
				info.setToParty("MusicBand","ComicFans");
				info.setToTag("comic","music");
				info.setToUser("wilson","billy","jack");
		
			TextMessageContentBuilder builder=new TextMessageContentBuilder();
			builder.setContent("Hello world!");
			//builder.
		
	//	WeiXinMessage msg=WeiXinMessageFactory.createWeiXinMessage(info, builder);
		
		NewsMessageContentBuilder builder1=new NewsMessageContentBuilder();
		
			builder1.addArticle(new NewsArticle("李嘉诚正式退休", "工作78年的香港“超人”李嘉诚正式交棒，称退休后如常上班", "https://www.thepaper.cn/newsDetail_forward_2120027", "http://image.thepaper.cn/www/image/7/640/423.jpg", "按钮"));
			builder1.addArticle(new NewsArticle("钢铁侠战甲被盗", "钢铁侠战甲被盗 价值32万美元人间蒸发", "http://tech.ifeng.com/a/20180510/44987653_0.shtml", "http://p0.ifengimg.com/pmop/2018/0510/192B0AD0FF1E6ECA8B75D5C0F523A10792EB8499_size43_w640_h476.jpeg", "按钮"));
		
		NewsMessage msg1=(NewsMessage) WeiXinMessageFactory.createWeiXinMessage(info, builder1);
		
		
		ObjectMapper mapper=new ObjectMapper();
		System.out.println("can-serialize:"+mapper.canSerialize(IWeiXinMessage.class));
		System.out.println("can-serialize"+NewsMessage.class.getSimpleName()+"? :"+mapper.canSerialize(NewsMessage.class));
		
	try {
		ObjectCodec codec=new ObjectMapper();
			
		JsonFactory jf=new JsonFactory(codec);
		JsonGenerator generator=	jf.createGenerator(System.out);
		
		//generator.writeObject(msg);
		
		//generator.writeObject();
		
		generator.writeObject(msg1);


	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
				
	}
}
