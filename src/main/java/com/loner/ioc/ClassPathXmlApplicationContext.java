package com.loner.ioc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * IOC容器实现
 * 
 * @author Administrator
 *
 */
public class ClassPathXmlApplicationContext implements BeanFactory {

	private Map<String, Object> beans = new HashMap<String, Object>();

	@SuppressWarnings("unchecked")
	public ClassPathXmlApplicationContext(String fileName) throws Exception {
		SAXReader reader = new SAXReader();
		Document document = reader.read(this.getClass().getClassLoader()
				.getResourceAsStream(fileName));
		List<Element> elements = document.selectNodes("/beans/bean");
		for (Element e : elements) {
			String id = e.attributeValue("id");
			String value = e.attributeValue("class");
			Object o = Class.forName(value).newInstance();
			beans.put(id, o);
		}
	}

	@Override
	public Object getBean(String id) {
		return beans.get(id);
	}

}
