package com.loner.inteview;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ComparableTest {

	public static void main(String[] args) {
		Weather w0 = new Weather("milesloner", 50, "深圳福田");
		Weather w1 = new Weather("tianpc", 28, "深圳南山");
		Weather w2 = new Weather("梦话", 21, "广州海珠");
		Weather w3 = new Weather("西游", 23, "梅州五华");
		Weather w4 = new Weather("梦幻", 40, "佛山三乡");
		Set<Weather> list = new LinkedHashSet<Weather>();
		list.add(w0);
		list.add(w1);
		list.add(w2);
		list.add(w3);
		list.add(w4);
		Iterator<Weather> it = list.iterator();
		while (it.hasNext()) {
			Weather w = it.next();
			System.out.println(w);
		}
	}

}
