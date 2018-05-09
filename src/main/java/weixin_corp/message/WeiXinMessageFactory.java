package weixin_corp.message;

import weixin_corp.message.builder.FileMessageContentBuilder;
import weixin_corp.message.builder.IMessageContentBuilder;
import weixin_corp.message.builder.ImageMessageContentBuilder;
import weixin_corp.message.builder.MPNewsMessageContentBuilder;
import weixin_corp.message.builder.NewsMessageContentBuilder;
import weixin_corp.message.builder.TextCardMessageContentBuilder;
import weixin_corp.message.builder.TextMessageContentBuilder;
import weixin_corp.message.builder.VideoMessageContentBuilder;

public class WeiXinMessageFactory {

	
	public static WeiXinMessage createWeiXinMessage(WeiXinMessageAppInfo info,IMessageContentBuilder builder){
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
	private static WeiXinMessage buildTextMessage(WeiXinMessageAppInfo info,IMessageContentBuilder builder) {
		assert builder.getMsgType() == "text";
		TextMessageContentBuilder b=(TextMessageContentBuilder)builder;
		WeiXinMessage msg=buildBase(info);
		msg.setMsgType(b.getMsgType());
		msg.getContent().put("content", b.getContent());
		return msg;
		
	}
	
	/**
	 * build image message 
	 * @param info
	 * @param builder
	 * @return
	 */
	private static WeiXinMessage buildImageMessage(WeiXinMessageAppInfo info,IMessageContentBuilder builder) {
		assert builder.getMsgType() == "image";
		ImageMessageContentBuilder b=(ImageMessageContentBuilder)builder;
		WeiXinMessage msg=buildBase(info);
		msg.setMsgType(b.getMsgType());
		msg.getContent().put("media_id", b.getMediaId());
		return msg;
		
	}
	
	/**
	 * build voice message
	 * @param info
	 * @param builder
	 * @return
	 */
	private static WeiXinMessage buildVoiceMessage(WeiXinMessageAppInfo info,IMessageContentBuilder builder) {
		assert builder.getMsgType() == "voice";
		VideoMessageContentBuilder b=(VideoMessageContentBuilder)builder;
		WeiXinMessage msg=buildBase(info);
		msg.setMsgType(b.getMsgType());
		msg.getContent().put("media_id", b.getMediaId());

		return msg;
	}
	
	/**
	 * build video message
	 * @param info
	 * @param builder
	 * @return
	 */
	private static WeiXinMessage buildVideoMessage(WeiXinMessageAppInfo info,IMessageContentBuilder builder) {
		assert builder.getMsgType() == "video";
		WeiXinMessage msg=buildBase(info);
		VideoMessageContentBuilder b=(VideoMessageContentBuilder)builder;
		msg.setMsgType(builder.getMsgType());
		msg.getContent().put("media_id", b.getMediaId());
		msg.getContent().put("title", b.getTitle());
		msg.getContent().put("description", b.getDescription());
		return msg;
	}
	
	/**
	 * build file message
	 * @param info
	 * @param builder
	 * @return
	 */
	private static WeiXinMessage buildFileMessage(WeiXinMessageAppInfo info,IMessageContentBuilder builder) {
		assert builder.getMsgType() == "file";
		FileMessageContentBuilder b=(FileMessageContentBuilder)builder;
		WeiXinMessage msg=buildBase(info);
		msg.setMsgType(b.getMsgType());
		msg.getContent().put("media_id", b.getMediaId());
		return msg;
		
	}
	
	/**
	 * build textcard message
	 * @param info
	 * @param builder
	 * @return
	 */
	private static WeiXinMessage buildTextcardMessage(WeiXinMessageAppInfo info,IMessageContentBuilder builder){
		assert builder.getMsgType() == "textcard";
		TextCardMessageContentBuilder b=(TextCardMessageContentBuilder)builder;
		WeiXinMessage msg=buildBase(info);
		msg.setMsgType(b.getMsgType());
		msg.getContent().put("title", b.getTitle());
		msg.getContent().put("description", b.getDescription());
		msg.getContent().put("url", b.getUrl());
		msg.getContent().put("btntxt", b.getBtntxt());
		return msg;
		
	}
	
	/**
	 * build news message
	 * @param info
	 * @param builder
	 * @return
	 */
	private static WeiXinMessage buildNewsMesssage(WeiXinMessageAppInfo info,IMessageContentBuilder builder){
		assert builder.getMsgType() == "news";
		NewsMessageContentBuilder b=(NewsMessageContentBuilder)builder;
		WeiXinMessage msg=buildBase(info);
		
		msg.setMsgType(builder.getMsgType());
		msg.getContent().put("articles", b.getArticles());
		return msg;
	}
	
	/**
	 * build MPNews messaeg
	 * @param info
	 * @param builder
	 * @return
	 */
	private static WeiXinMessage buildMPNewsMessage(WeiXinMessageAppInfo info,IMessageContentBuilder builder){
		assert builder.getMsgType() == "npnews";
		MPNewsMessageContentBuilder b=(MPNewsMessageContentBuilder)builder;
		WeiXinMessage msg=buildBase(info);
		msg.setMsgType(b.getMsgType());
		msg.getContent().put("articles", b.getArticles());
		return msg;
		
	}
	
	/**
	 * build Base INFO
	 * @param info
	 * @return
	 */
	private static WeiXinMessage buildBase(WeiXinMessageAppInfo info) {
		return new WeiXinMessage(info.getToUser(), info.getToParty(), info.getToTag(), info.getMsgType(), info.getAgentId(), null, info.getSafe());
	}
}
