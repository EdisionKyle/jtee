/**
 *  工程名：jtee
 *  文件名：ColorEnum.java
 *  包名：com.loner.base
 *  创建时间：2016年11月10日 下午2:16:03
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 */
package com.loner.base;
/**
 *  类名：ColorEnum
 *  修改记录：// 修改历史记录，包括修改日期、修改者及修改内容
 *  创建时间：2016年11月10日 下午2:16:03
 *  Copyright (C) 2016, tianpc0318@163.com All Rights Reserved.
 *
 *  @version V1.0
 *  @author pengcheng.tian
 */
public class ColorEnum {
	// 定义 RSS(Really Simple Syndication) 种子的枚举类型
	public enum NewsRSSFeedEnum {
		// 雅虎头条新闻 RSS 种子
		A0("雅虎头条新闻", "http://rss.news.yahoo.com/rss/topstories"),

		// CBS 头条新闻 RSS 种子
		A1("CBS头条新闻", "http://feeds.cbsnews.com/CBSNewsMain?format=xml"),

		// 洛杉矶时报头条新闻 RSS 种子
		A2("洛杉矶时报头条新闻", "http://feeds.latimes.com/latimes/news?format=xml");

		private String rss_name;
		// 枚举对象的 RSS 地址的属性
		private String rss_url;

		// 枚举对象构造函数
		private NewsRSSFeedEnum(String rss_name, String rss_url) {
			this.rss_name = rss_name;
			this.rss_url = rss_url;
		}

		public String getRssName() {
			return this.rss_name;
		}

		// 枚举对象获取 RSS 地址的方法
		public String getRssURL() {
			return this.rss_url;
		}

		// 通过value获取对应的枚举对象
		public static String getExamType(String value) {
			for (NewsRSSFeedEnum examType : NewsRSSFeedEnum.values()) {
				if (examType.getRssName().equals(value)) {
					return examType.getRssURL();
				}
			}
			return null;
		}
		
	}

	public static void main(String[] args) {
		System.out.println(ColorEnum.NewsRSSFeedEnum.A0.getRssURL());
		System.out.println(ColorEnum.NewsRSSFeedEnum.getExamType("CBS头条新闻"));
	}
}
