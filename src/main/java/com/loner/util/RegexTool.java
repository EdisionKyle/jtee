package com.loner.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTool {

	/**
	 * 
	 * @param phoneNum
	 *            传入的参数仅仅是一个电话号码时，调用此方法
	 * @return 如果匹配正确，return true , else return else
	 */
	// 如果传进来的是电话号码，则对电话号码进行正则匹配
	public static boolean regexPhoneNumber(String phoneNum) {

		// 电话号码匹配结果
		boolean isPhoneNum_matcher = phoneNum.matches("1[358]\\d{9}");
		// 如果isPhoneNum_matcher is true , 则return true , else return false
		if (isPhoneNum_matcher)
			return true;
		return false;
	}

	/**
	 * 
	 * @param email
	 *            传入的参数仅仅是一个邮箱地址时，调用此方法
	 * @return 如果匹配正确，return true , else return false
	 */
	// 如果传进来的是邮箱地址，则对邮箱进行正则匹配
	public static boolean regexEmailAddress(String email) {

		// 邮箱匹配结果
		boolean isEmail_matcher = email
				.matches("[a-zA-Z_0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,3}");
		// 如果isEmail_matcher value is true , 则 return true , else return false
		if (isEmail_matcher)
			return true;

		return false;
	}

	/**
	 * 
	 * @param phoneNum
	 *            传入的电话号码
	 * @param email
	 *            传入的邮箱地址
	 * @return 如果匹配正确，return true , else return false
	 */
	public static boolean regexEmailAddressAndPhoneNum(String phoneNum,
			String email) {

		// 电话号码匹配结果
		boolean isPhoneNum_matcher = phoneNum.matches("1[358]\\d{9}");
		// 邮箱匹配结果
		boolean isEmail_matcher = email
				.matches("[a-zA-Z_0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,3}");

		// matcher value is true , 则 return true , else return false
		if (isEmail_matcher && isPhoneNum_matcher) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param qqNum
	 *            传入的QQ
	 * @return 如果匹配正确，return true， else return false
	 */
	public static boolean regexQQNumber(String qqNum) {

		// QQ号匹配结果
		boolean isQQNum_matcher = qqNum.matches("[1-9]\\d{2,11}");

		if (isQQNum_matcher)
			return true;
		return false;
	}

	/**
	 * 
	 * @param pwd
	 *            传入的是 密码
	 * @return 如果匹配正确，满足密码规则，return true， else return false
	 */
	public static boolean regexPassWord(String pwd) {

		// 密码匹配结果
		boolean isPassWord_matcher = pwd.matches("[0-9a-zA-Z_@$@]{6,12}");

		if (isPassWord_matcher)
			return true;

		return false;
	}

	public static void main(String[] args) {
		System.out.println(RegexTool.regexQQNumber("582209063"));
		Pattern pattern = Pattern.compile("bank*com");
		Matcher matcher = pattern.matcher("bankChinacom");
		System.out.println(matcher.matches());
	}

}
