package com.loner.mail;

public class MailSenderTest {

	public static void main(String[] args) {
		// 这个类主要是设置邮件
		MailSenderInfo mailInfo = new MailSenderInfo();
		mailInfo.setMailServerHost("smtp.163.com");
		mailInfo.setMailServerPort("25");
		mailInfo.setValidate(true);
		mailInfo.setUserName("tianpc0318@163.com");
		mailInfo.setPassword("iltianpc04059988");// 您的邮箱密码
		mailInfo.setFromAddress("tianpc0318@163.com");
		mailInfo.setToAddress("tianpc0318@163.com");
		mailInfo.setSubject("设置邮箱标题");
		mailInfo.setContent("设置邮箱内容");

		MailSenderInfo mailInfo1 = new MailSenderInfo();
		mailInfo1.setMailServerHost("smtp.163.com");
		mailInfo1.setMailServerPort("25");
		mailInfo1.setValidate(true);
		mailInfo1.setUserName("tianpc0318@163.com");
		mailInfo1.setPassword("iltianpc04059988");// 您的邮箱密码
		mailInfo1.setFromAddress("tianpc0318@163.com");
		mailInfo1.setToAddress("tianpc0318@163.com");
		mailInfo1.setSubject("设置邮箱标题");
		mailInfo1
				.setContent("<font color='#ff0000' size='4'>测试格式化内容测试<a href='http://www.baidu.com'>格式化内容</a>测试格<em>式化</em>内容</font><img src='http://www.google.cn/intl/zh-CN/images/logo_cn.gif'></img>");
		// 这个类主要来发送邮件
		SimpleMailSender sms = new SimpleMailSender();
		sms.sendTextMail(mailInfo);// 发送文本格式
		sms.sendHtmlMail(mailInfo1);// 发送html格式
	}

}