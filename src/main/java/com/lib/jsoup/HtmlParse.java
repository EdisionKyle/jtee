package com.lib.jsoup;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
/**
 * 防止XSS攻击，可使用jsoup HTML Cleaner 方法进行清除
 * @author Administrator
 */
public class HtmlParse {

	@Test
	public void AnalysisHTMLByString() {
		String html = "<p><a href=\"a.html\">a</p><p> 文本</p>";
		Document doc = Jsoup.parse(html);
		Elements ele = doc.getElementsByTag("p");
		for (Element e : ele) {
			System.out.println(e.text());
		}
	}

	@Test
	public void AnlysisHTMLByFile() throws IOException {
		File file = new File("F:\\space-git\\jtee\\src\\main\\webapp\\jsoup.html");
		Document doc = Jsoup.parse(file, "UTF-8");
		Elements eles = doc.getElementsByTag("a");
		for (Element e : eles) {
			System.out.println(e.text());
			System.out.println(e.attr("href"));
		}
		Element ele = doc.getElementById("btn");
		System.out.println(ele.html());
		System.out.println(doc.title());
	}

	@Test
	public void AnlysisHTMLByURL() throws Exception {

		Document doc = Jsoup.connect("http://www.cnblogs.com/rhythmK/").get();

		// 获取A标签个数
		System.out.println("共有超链接：" + doc.getElementsByTag("a").size());

		System.out.println("获取指定ID:" + doc.getElementById("navigator").html());
		System.out.println("导航开始...");
		Elements eles = doc.select("#navigator");
		for (Element ele : eles) {
			System.out.println(ele.html());
		}
	}

}
