package com.seventeen.config;

/*
 * 
 * 项目配置文件
 * 主要为项目中所用的http请求所需的url地址
 * 
 * **/

public class AppConfigInterface {
	// EVent 超值体验数据
	public static final String EVENT_EXPERCE = "https://api.108tian.com/mobile/v3/EventList?&cityId=%d&page=%d&step=20&theme=4";
	// EVent 体育运动数据
	public static final String EVENT_SPORTS = "https://api.108tian.com/mobile/v3/EventList?&cityId=%d&page=%d&step=20&theme=2";
	// EVent 旅游户外数据
	public static final String EVENT_TRVAEL = "https://api.108tian.com/mobile/v3/EventList?&cityId=%d&page=%d&step=20&theme=1";
	// Event活动——生活聚会数据
	public static final String EVENT_LIFEPARTY = "https://api.108tian.com/mobile/v3/EventList?&cityId=%d&page=%d&step=20&theme=3";
	// index广告条数据
	public final static String INDEX_BANNER = "https://api.108tian.com/mobile/v3/Home?cityId=%d&page=%d";
	// index ListView数据
	public final static String INDEX_LISTVIEW = "https://api.108tian.com/mobile/v3/RecommendDetailList?&cityId=%d&page=%d&step=%d";
	// 购买页面链接
	public final static String PURCHARSE = "https://api.108tian.com/mobile/v3/EventDetail?id=";

}
