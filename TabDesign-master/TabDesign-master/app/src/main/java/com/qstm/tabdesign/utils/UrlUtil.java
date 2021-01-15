package com.qstm.tabdesign.utils;


public class UrlUtil {
    //获取频道的网络接口
    public static String channelUrl = "http://apis.baidu.com/showapi_open_bus/channel_news/channel_news";
    //获取频道对应新闻的网络接口
    /*
    get 请求参数
    *channelId 新闻频道id，必须精确匹配
     channelName 新闻频道名称，可模糊匹配
     title 新闻标题，模糊匹配
     page 页数，默认1。每页最多20条记录
    *needContent 是否需要返回正文，1为需要，其他为不需要
    *needHtml 是否需要返回正文的html格式，1为需要，其他为不需要
     */
    public static String newsUrl = "http://apis.baidu.com/showapi_open_bus/channel_news/search_news";

}