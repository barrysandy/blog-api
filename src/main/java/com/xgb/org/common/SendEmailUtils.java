package com.xgb.org.common;

import java.util.List;

import com.xgb.org.common.mail.MailInfo;
import com.xgb.org.common.mail.MailSender;


public class SendEmailUtils {
	
	/**
	 * 发送邮件（群发）
	 * @param email 邮件发送to的集合
	 * @param title 邮件标题
	 * @param content 邮件内容
	 * @return
	 */
	public static String sendEmial(List<String> email,String title,String content) {
		MailSender mailSender = MailSender.getInstance();
		try {
			for (int i = 0; i < email.size(); i++) {
				MailInfo mailInfo = mailSender.getMailInfo(email.get(i),title,content);
				mailSender.sendHtmlMail(mailInfo, 3);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return "FIAL";
		}
		return null;
	}
	
	/**
	 * 发送邮件（单发）
	 * @param email 邮件发送to的账号
	 * @param title 邮件标题
	 * @param content 邮件内容
	 * @return
	 */
	public static String sendEmial(String email,String title,String content) {
		MailSender mailSender = MailSender.getInstance();
		try {
			MailInfo mailInfo = mailSender.getMailInfo(email,title,content);
			mailSender.sendHtmlMail(mailInfo, 3);
			
		} catch (Exception e) {
			e.printStackTrace();
			return "FIAL";
		}
		return null;
	}
}
