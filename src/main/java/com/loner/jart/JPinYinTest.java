package com.loner.jart;

import com.github.stuxuhai.jpinyin.ChineseHelper;
import com.github.stuxuhai.jpinyin.PinyinFormat;
import com.github.stuxuhai.jpinyin.PinyinHelper;

public class JPinYinTest {

	public static void main(String[] args) throws Exception {
		String words = "中国民族共和国的首都是北京";
		System.out.println(PinyinHelper.convertToPinyinString(words, "", PinyinFormat.WITHOUT_TONE));
		System.out.println(PinyinHelper.getShortPinyin(words));
		System.out.println(PinyinHelper.hasMultiPinyin('好'));
		System.out.println(ChineseHelper.convertToSimplifiedChinese("動"));
		System.out.println(ChineseHelper.convertToTraditionalChinese("没问题"));
	}

}
