package weixin_corp.message;

import weixin_corp.message.util.FileMessageContentBuilder;
import weixin_corp.message.util.IMessageContentBuilder;
import weixin_corp.message.util.ImageMessageContentBuilder;
import weixin_corp.message.util.MPNewsMessageContentBuilder;
import weixin_corp.message.util.NewsMessageContentBuilder;
import weixin_corp.message.util.TextCardMessageContentBuilder;
import weixin_corp.message.util.TextMessageContentBuilder;
import weixin_corp.message.util.VideoMessageContentBuilder;

import static weixin_corp.message.WeiXinMessageUtil.*;

import weixin_corp.message.type.FileMessage;
import weixin_corp.message.type.ImageMessage;
import weixin_corp.message.type.MPNewsMessage;
import weixin_corp.message.type.NewsMessage;
import weixin_corp.message.type.TextMessage;
import weixin_corp.message.type.TextcardMessage;
import weixin_corp.message.type.VideoMessage;

public  class  WeiXinMessageFactory {

	
	 public  static <T extends IMessageContentBuilder>  IWeiXinMessage createWeiXinMessage(WeiXinMessageAppInfo info,T builder){
		switch(builder.getMsgType()) {
		 case "text":
			 	return buildTextMessage(info, builder);
		 case "image":
				return buildImageMessage(info, builder);
		 case "voice":
			 	return buildVoiceMessage(info, builder);
		 case "video":
			 	return buildVideoMessage(info, builder);
		 case "file":
			 	return buildFileMessage(info, builder);
		 case "textcard":
			 	return buildTextcardMessage(info, builder);
		 case "news":
			 	return buildNewsMesssage(info, builder);
		 case "mpnews":
			 	return buildMPNewsMessage(info, builder);
		default:
			return null;
		}
	}
	
	
	
	/**
	 * build text message 
	 * @param info
	 * @param builder
	 * @return
	 */
	private static IWeiXinMessage buildTextMessage(WeiXinMessageAppInfo info,IMessageContentBuilder builder) {
		assert builder.getMsgType() == "text";
		TextMessageContentBuilder b=(TextMessageContentBuilder)builder;
		TextMessage message=new TextMessage(
				parseListToStr(info.getToUser())
				, parseListToStr(info.getToParty())
				, parseListToStr(info.getToTag())
				, info.getAgentId()
				, b.getContent()
				, b.getSafe());

		return message;
		
	}
	
	/**
	 * build image message 
	 * @param info
	 * @param builder
	 * @return
	 */
	private static IWeiXinMessage buildImageMessage(WeiXinMessageAppInfo info,IMessageContentBuilder builder) {
		assert builder.getMsgType() == "image";
		ImageMessageContentBuilder b=(ImageMessageContentBuilder)builder;
		ImageMessage message=new ImageMessage(parseListToStr(info.getToUser())
				, parseListToStr(info.getToParty())
				, parseListToStr(info.getToTag())
				, info.getAgentId()
				, b.getMediaId()
				, b.getSafe());
		
		return message;
		
	}
	
	/**
	 * build voice message
	 * @param info
	 * @param builder
	 * @return
	 */
	private static IWeiXinMessage buildVoiceMessage(WeiXinMessageAppInfo info,IMessageContentBuilder builder) {
		assert builder.getMsgType() == "voice";
		VideoMessageContentBuilder b=(VideoMessageContentBuilder)builder;
		
		VideoMessage message=new VideoMessage(parseListToStr(info.getToUser())
				, parseListToStr(info.getToParty())
				, parseListToStr(info.getToTag())
				, info.getAgentId()
				, b.getMediaId()
				, b.getTitle()
				, b.getDescription()
				, b.getSafe());

		return message;
	}
	
	/**
	 * build video message
	 * @param info
	 * @param builder
	 * @return
	 */
	private static IWeiXinMessage buildVideoMessage(WeiXinMessageAppInfo info,IMessageContentBuilder builder) {
		assert builder.getMsgType() == "video";
		VideoMessageContentBuilder b=(VideoMessageContentBuilder)builder;

		VideoMessage message=new VideoMessage(parseListToStr(info.getToUser())
				, parseListToStr(info.getToParty())
				, parseListToStr(info.getToTag())
				, info.getAgentId()
				, b.getMediaId()
				, b.getTitle()
				, b.getDescription()
				, b.getSafe());
		
		return message;
	}
	
	/**
	 * build file message
	 * @param info
	 * @param builder
	 * @return
	 */
	private static IWeiXinMessage buildFileMessage(WeiXinMessageAppInfo info,IMessageContentBuilder builder) {
		assert builder.getMsgType() == "file";
		FileMessageContentBuilder b=(FileMessageContentBuilder)builder;

		FileMessage message=new FileMessage(parseListToStr(info.getToUser())
				, parseListToStr(info.getToParty())
				, parseListToStr(info.getToTag())
				, info.getAgentId()
				, b.getMediaId()
				, b.getSafe());
		
		
		return message;
		
	}
	
	/**
	 * build textcard message
	 * @param info
	 * @param builder
	 * @return
	 */
	private static IWeiXinMessage buildTextcardMessage(WeiXinMessageAppInfo info,IMessageContentBuilder builder){
		assert builder.getMsgType() == "textcard";
		TextCardMessageContentBuilder b=(TextCardMessageContentBuilder)builder;

		TextcardMessage message=new TextcardMessage(parseListToStr(info.getToUser())
				, parseListToStr(info.getToParty())
				, parseListToStr(info.getToTag())
				, info.getAgentId()
				, b.getTitle()
				, b.getDescription()
				, b.getUrl()
				, b.getBtntxt());
		
		return message;
		
	}
	
	/**
	 * build news message
	 * @param info
	 * @param builder
	 * @return
	 */
	private static IWeiXinMessage buildNewsMesssage(WeiXinMessageAppInfo info,IMessageContentBuilder builder){
		assert builder.getMsgType() == "news";
		NewsMessageContentBuilder b=(NewsMessageContentBuilder)builder;

		NewsMessage message=new NewsMessage(parseListToStr(info.getToUser())
				, parseListToStr(info.getToParty())
				, parseListToStr(info.getToTag())
				, info.getAgentId()
				, b.getArticles());
		
		return message;
	}
	
	/**
	 * build MPNews messaeg
	 * @param info
	 * @param builder
	 * @return
	 */
	private static IWeiXinMessage buildMPNewsMessage(WeiXinMessageAppInfo info,IMessageContentBuilder builder){
		assert builder.getMsgType() == "npnews";
		MPNewsMessageContentBuilder b=(MPNewsMessageContentBuilder)builder;

		
		MPNewsMessage message=new MPNewsMessage(parseListToStr(info.getToUser())
				, parseListToStr(info.getToParty())
				, parseListToStr(info.getToTag())
				, info.getAgentId()
				, b.getSafe()
				, b.getArticles());
		
		return message;
		
	}

}
