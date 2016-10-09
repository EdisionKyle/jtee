package com.loner.mail;

public class MultiMails {

/*	javamail发送邮件(html格式，多接收人，带多个附件)
	java文件 ：第一个类MailSenderInfo

*//**
 * 发送邮件需要使用的基本信息
 *//*   
import java.util.Properties;   
public class MailSenderInfo {   
    // 发送邮件的服务器的IP和端口
    private String mailServerHost;   
    private String mailServerPort = "25";   
    // 邮件发送者的地址
    private String fromAddress;   
    // 邮件接收者的地址
    private String[] toAddress;   
    // 登陆邮件发送服务器的用户名和密码
    private String userName;   
    private String password;   
    // 是否需要身份验证
    private boolean validate = false;   
    // 邮件主题
    private String subject;   
    // 邮件的文本内容
    private String content;   
    // 邮件附件的文件名
    private String[] attachFileNames;     
    *//**
	 * 获得邮件会话属性
	 *//*   
    public Properties getProperties(){   
      Properties p = new Properties();   
      p.put("mail.smtp.host", this.mailServerHost);   
      p.put("mail.smtp.port", this.mailServerPort);   
      p.put("mail.smtp.auth", validate ? "true" : "false");   
      return p;   
    }   
    public String getMailServerHost() {   
      return mailServerHost;   
    }   
    public void setMailServerHost(String mailServerHost) {   
      this.mailServerHost = mailServerHost;   
    }  
    public String getMailServerPort() {   
      return mailServerPort;   
    }  
    public void setMailServerPort(String mailServerPort) {   
      this.mailServerPort = mailServerPort;   
    }  
    public boolean isValidate() {   
      return validate;   
    }  
    public void setValidate(boolean validate) {   
      this.validate = validate;   
    }  
    public String[] getAttachFileNames() {   
      return attachFileNames;   
    }  
    public void setAttachFileNames(String[] fileNames) {   
      this.attachFileNames = fileNames;   
    }  
    public String getFromAddress() {   
      return fromAddress;   
    }   
    public void setFromAddress(String fromAddress) {   
      this.fromAddress = fromAddress;   
    }  
    public String getPassword() {   
      return password;   
    }  
    public void setPassword(String password) {   
      this.password = password;   
    }  
      
    public String getUserName() {   
      return userName;   
    }  
    public void setUserName(String userName) {   
      this.userName = userName;   
    }  
    public String getSubject() {   
      return subject;   
    }  
    public void setSubject(String subject) {   
      this.subject = subject;   
    }  
    public String getContent() {   
      return content;   
    }  
    public void setContent(String textContent) {   
      this.content = textContent;   
    }
public String[] getToAddress() {
   return toAddress;
}
public void setToAddress(String[] toAddress) {
   this.toAddress = toAddress;
}   
}  
第二个类：MyAuthenticator

import javax.mail.*;  

public class MyAuthenticator extends Authenticator{  
    String userName=null;  
    String password=null;  
       
    public MyAuthenticator(){  
    }  
    public MyAuthenticator(String username, String password) {   
        this.userName = username;   
        this.password = password;   
    }   
    protected PasswordAuthentication getPasswordAuthentication(){  
        return new PasswordAuthentication(userName, password);  
    }  
}

第三个类：SimpleMailSender.

import java.util.Date;   
import java.util.Properties;  

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Address;   
import javax.mail.BodyPart;   
import javax.mail.Message;   
import javax.mail.MessagingException;   
import javax.mail.Multipart;   
import javax.mail.Session;   
import javax.mail.Transport;   
import javax.mail.internet.InternetAddress;   
import javax.mail.internet.MimeBodyPart;   
import javax.mail.internet.MimeMessage;   
import javax.mail.internet.MimeMultipart;   

*//**
 * 简单邮件（不带附件的邮件）发送器
 *//*   
public class SimpleMailSender {   
*//**
 * 以文本格式发送邮件
 * 
 * @param mailInfo
 *            待发送的邮件的信息
 *//*   
    public boolean sendTextMail(MailSenderInfo mailInfo) {   
      // 判断是否需要身份认证
      MyAuthenticator authenticator = null;   
      Properties pro = mailInfo.getProperties();  
      if (mailInfo.isValidate()) {   
      // 如果需要身份认证，则创建一个密码验证器
        authenticator = new MyAuthenticator(mailInfo.getUserName(), mailInfo.getPassword());   
      }  
      // 根据邮件会话属性和密码验证器构造一个发送邮件的session
      Session sendMailSession = Session.getDefaultInstance(pro,authenticator);   
      try {   
      // 根据session创建一个邮件消息
      Message mailMessage = new MimeMessage(sendMailSession);   
      // 创建邮件发送者地址
      Address from = new InternetAddress(mailInfo.getFromAddress());   
      // 设置邮件消息的发送者
      mailMessage.setFrom(from);   
      // 创建邮件的接收者地址，并设置到邮件消息中
     // Address to = new InternetAddress(mailInfo.getToAddress());
      // mailMessage.setRecipient(Message.RecipientType.TO,to);
      // 创建邮件的接收地址（数组）
      String[] to=mailInfo.getToAddress();
      InternetAddress[] sendTo = new InternetAddress[to.length];
      for (int i = 0; i < to.length; i++)
      {
      System.out.println("发送到:" + to[i]);
      sendTo[i] = new InternetAddress(to[i]);
      }
      mailMessage.setRecipients(javax.mail.internet.MimeMessage.RecipientType.TO, sendTo);
      // 设置邮件消息的主题
      mailMessage.setSubject(mailInfo.getSubject());   
      // 设置邮件消息发送的时间
      mailMessage.setSentDate(new Date());   
      // 设置邮件消息的主要内容
      String mailContent = mailInfo.getContent();   
      mailMessage.setText(mailContent);   
      // 发送邮件
      Transport.send(mailMessage);  
      return true;   
      } catch (MessagingException ex) {   
          ex.printStackTrace();   
      }   
      return false;   
    }   
      
    *//**
	 * 以HTML格式发送给多人邮件 (可带多个附件)
	 * 
	 * @param mailInfo
	 *            待发送的邮件信息
	 *//*   
    public static boolean sendHtmlMail(MailSenderInfo mailInfo){   
      // 判断是否需要身份认证
      MyAuthenticator authenticator = null;  
      Properties pro = mailInfo.getProperties();  
      // 如果需要身份认证，则创建一个密码验证器
      if (mailInfo.isValidate()) {   
        authenticator = new MyAuthenticator(mailInfo.getUserName(), mailInfo.getPassword());  
      }   
      // 根据邮件会话属性和密码验证器构造一个发送邮件的session
      Session sendMailSession = Session.getDefaultInstance(pro,authenticator);   
      try {   
      // 根据session创建一个邮件消息
      Message mailMessage = new MimeMessage(sendMailSession);   
      // 创建邮件发送者地址
      Address from = new InternetAddress(mailInfo.getFromAddress());   
      // 设置邮件消息的发送者
      mailMessage.setFrom(from);   
      
		 * // 创建邮件的接收者地址，并设置到邮件消息中 ----此可发送给一人 Address to = new
		 * InternetAddress(mailInfo.getToAddress()); //
		 * Message.RecipientType.TO属性表示接收者的类型为TO
		 * mailMessage.setRecipient(Message.RecipientType.TO,to);
		 
      // 创建邮件的接收地址（数组）
      String[] to=mailInfo.getToAddress();
      InternetAddress[] sendTo = new InternetAddress[to.length];
      for (int i = 0; i < to.length; i++)
      {
      System.out.println("发送到:" + to[i]);
      sendTo[i] = new InternetAddress(to[i]);
      }
      mailMessage.setRecipients(javax.mail.internet.MimeMessage.RecipientType.TO, sendTo);
      // 设置邮件消息的主题
      mailMessage.setSubject(mailInfo.getSubject());   
      // 设置邮件消息发送的时间
      mailMessage.setSentDate(new Date());   
      // MiniMultipart类是一个容器类，包含MimeBodyPart类型的对象
      Multipart mainPart = new MimeMultipart();   
      // 创建一个包含HTML内容的MimeBodyPart
      BodyPart html = new MimeBodyPart();   
      // 设置HTML内容 建立第一部分： 文本正文
      html.setContent(mailInfo.getContent(), "text/html; charset=utf-8");   
      mainPart.addBodyPart(html);
      // 将MiniMultipart对象设置为邮件内容 建立第二部分：附件
      mailMessage.setContent(mainPart);
      if(mailInfo.getAttachFileNames().length>0){
       for(int i=0;i<mailInfo.getAttachFileNames().length;i++){
      if (!mailInfo.getAttachFileNames()[i].equals("")) {
          // 建立第二部分：附件
          html = new MimeBodyPart();
          // 获得附件
          DataSource source = new FileDataSource(mailInfo.getAttachFileNames()[i]);
          // 设置附件的数据处理器
          html.setDataHandler(new DataHandler(source));
          // 设置附件文件名
          html.setFileName(mailInfo.getAttachFileNames()[i]);
          // 加入第二部分
          mainPart.addBodyPart(html);   
      }
       }
      }

      // 发送邮件
      Transport.send(mailMessage);   
      return true;   
      } catch (MessagingException ex) {   
          ex.printStackTrace();   
      }   
      return false;   
    }   
}

测试类

public class MailTest {
public static void main(String[] args){  
        // 这个类主要是设置邮件
     MailSenderInfo mailInfo = new MailSenderInfo();   
     mailInfo.setMailServerHost("smtp.sina.com");   
     mailInfo.setMailServerPort("25");   
     mailInfo.setValidate(true);   
     mailInfo.setUserName("c365_026@sina.com");   
     mailInfo.setPassword("123160");// 您的邮箱密码
     mailInfo.setFromAddress("c365_026@sina.com");
     mailInfo.setToAddress(new String[]{"zuoshi3434o1@163.com","zuosrtrtrtao2@163.com","unselfis34h2008@yahoo.cn"});
     mailInfo.setAttachFileNames(new String[]{"c:\\email.txt","c:\\emai.txt"});
     mailInfo.setSubject("主题12");   
     mailInfo.setContent("<font style='BACKGROUND-COLOR: #666699' color='#ff0000' size='5'>测试格式化内容测试<a href='http://www.baidu.com'>格式化内容</a>测试格<em>式化</em>内容</font><img src='http://www.google.cn/intl/zh-CN/images/logo_cn.gif'></img>");   
        // 这个类主要来发送邮件
     SimpleMailSender sms = new SimpleMailSender();  
         // sms.sendTextMail(mailInfo);//发送文体格式
         sms.sendHtmlMail(mailInfo);// 发送html格式
   }

}*/

}
