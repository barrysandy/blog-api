package com.xgb.org.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * StringUtils
 * <p>Title: StringUtils 工具类</p>
 * <p>Description: </p>
 *  	
 * @author XuGongBin
 * @version 1.0.0
 * @date 2018/7/16 16:20
 */
public class StringUtils {

	/**
	 * 获取UUID
	 * 经过字符串处理的UUID（替换"-"为""）
	 * @return
	 */
	public static String getUUID() {
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		return uuid;
	}
	
	
	/**
	 * 去掉字符串的第一个‘[’ 和最后一个 ‘]’
	 * 
	 * @param str
	 * @return 返回去掉后的字符串
	 */
	public static String removeBracket(String str) {
		if (str != null && !"".equals(str)) {
			StringBuffer sb = new StringBuffer(str);
			if ("[".equals(String.valueOf(sb.charAt(0)))) {
				sb = sb.deleteCharAt(0);
				if ("]".equals(String.valueOf(sb.charAt(sb.length() - 1)))) {
					sb = sb.deleteCharAt(sb.length() - 1);
				}
			}
			return sb.toString();
		}
		return str;
	}
	
	/**
	 * 替换文字颜色
	 * 
	 * @param str
	 * @param changeStr
	 * @param color
	 * @return 设置后的文字
	 */
	public static String setStrColor(String str,String changeStr,String color) {
		if (str != null && !"".equals(str) && changeStr != null && !"".equals(changeStr) && color != null && !"".equals(color)) {
			str = str.replaceAll("(?i)" + changeStr, "<span style='color: "+color+";'>" + changeStr + "</span>");
		}
		return str;
	}
	
	
	/**
	 * 获取A~Z的随机字符
	 * 
	 * @param digit
	 *            字符位数 int类型
	 * @param caseWrite
	 *            是否忽略大小写 true 忽略 false 不忽略
	 * @return 返回随机A~Z的特点位数的字符
	 */
	public static String getRandomStrATOZ(int digit, boolean caseWrite) {
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < digit; ++i) {
			int number = random.nextInt(2);
			if (caseWrite) {
				number = random.nextInt(1);
			}
			long result = 0;
			switch (number) {
			case 0:
				/* A-Z 的 ASCII 码值[65,90] */
				result = Math.round(Math.random() * 25 + 65);
				sb.append(String.valueOf((char) result));
				break;
			case 1:
				/* a-z 的 ASCII 码值[97,122] */
				result = Math.round(Math.random() * 25 + 97);
				sb.append(String.valueOf((char) result));
				break;
			}
		}
		return sb.toString();
	}

	/**
	 * 生成不重复的digit位随机数
	 * @param digit 位数
	 * @return String
	 */
	public static String getGenerateRandNumber(int digit) {
		if (digit <= 0) {
			return "0";
		}
		StringBuffer randBuffer = new StringBuffer();
		String scopeStr = "0123456789";
		Random random = new Random();
		for (int i = 0; i < digit; i++) {
			int num = random.nextInt(scopeStr.length());
			randBuffer.append(scopeStr.charAt(num));
			// 将每次获取到的随机数从scopeStr中移除
			scopeStr = scopeStr.replace(String.valueOf(scopeStr.charAt(num)), "");
		}
		return randBuffer.toString();
	}
	
	/**
	 * 从一段字符串中获取其中的图片路径
	 * @param text
	 * @return 获得图片字符集合
	 */
	public static List<String> getListImg(String text) {
		String regex = "\"(.*?)\"";
		List<String> list = new ArrayList<String>();
		Pattern pattern = Pattern.compile(regex, Pattern.DOTALL);
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			list.add(matcher.group());
		}
		return list;
	}
	
}
