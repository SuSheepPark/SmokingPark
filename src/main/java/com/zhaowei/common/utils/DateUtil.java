/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: DateUtil.java 
 * @Prject: zhaowei.common
 * @Package: com.zhaowei.common.utils 
 * @Description: TODO
 * @author: zw   
 * @date: 2019年9月5日 下午4:28:51 
 * @version: V1.0   
 */
package com.zhaowei.common.utils;

import java.util.Calendar;
import java.util.Date;

/** 
 * @ClassName: DateUtil 
 * @Description: TODO
 * @author: zw
 * @date: 2019年9月5日 下午4:28:51  
 */
public class DateUtil {

	/*
	 * 方法1：(5分) 返回给定日期的月初 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	 * 则返回的结果为2019-05-01 00:00:00
	 */
	public static Date getDateByInitMonth(Date src) {
		Calendar c = Calendar.getInstance();
		c.setTime(src);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}
	  public static Date getDateByFullMonth(Date src) {
		  Calendar c = Calendar.getInstance();
		  c.setTime(src);
		  c.add(Calendar.MONTH, 1);
		  Date date = getDateByInitMonth(c.getTime());
		  c.setTime(date);
		  c.add(Calendar.SECOND, -1);
		  return c.getTime(); 
	  }
}
