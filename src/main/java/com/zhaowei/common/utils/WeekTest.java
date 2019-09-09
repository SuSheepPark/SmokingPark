/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: WeekTest.java 
 * @Prject: zhaowei.common
 * @Package: com.zhaowei.common.utils 
 * @Description: TODO
 * @author: zw   
 * @date: 2019年9月7日 下午4:31:04 
 * @version: V1.0   
 */
package com.zhaowei.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** 
 * @ClassName: WeekTest 
 * @Description: TODO
 * @author: zw
 * @date: 2019年9月7日 下午4:31:04  
 */
public class WeekTest {

	/**
	 * 
	 * @Title: toHtml   
	 * @Description: 传来的字符转成 html 文本，遇到“\n”符时，要用<p></p>将这一段
		字符包起来。 
	 * @return
	 * @return: String
	 */	
	
	public static String toHtml(String src) {
		String str = src.replaceAll(System.getProperty("line.separator"), "|")	;
		String[] split = str.split("\\|");
		String newStr="";
		for (String string2 : split) {
			newStr+="<p>"+string2+"</p>";
		}
		return newStr;
	}
	
	
	//手机号验证
	public static boolean checkCellphone(String str) {
		String refgExp = "^[1](39|37|18)[0-9]{8}$";
		Pattern p = Pattern.compile(refgExp);
		Matcher m = p.matcher(str);
		return m.matches();
	    }
	//邮箱验证
	public static boolean checkCellemail(String str) {
		String refgExp = "^\\w+@[a-z0-9]+\\.[a-z]{2,4}$";
		Pattern p = Pattern.compile(refgExp);
		Matcher m = p.matcher(str);
		return m.matches();
		}
}
	

