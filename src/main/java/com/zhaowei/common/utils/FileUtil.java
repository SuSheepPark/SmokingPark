/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: FileUtil.java 
 * @Prject: zhaowei.common
 * @Package: com.zhaowei.common.utils 
 * @Description: TODO
 * @author: zw   
 * @date: 2019年9月5日 下午4:29:17 
 * @version: V1.0   
 */
package com.zhaowei.common.utils;

import java.io.File;

/** 
 * @ClassName: FileUtil 
 * @Description: TODO
 * @author: zw
 * @date: 2019年9月5日 下午4:29:17  
 */
public class FileUtil {
	
	/*
	 * 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(3分)
	 */
	/// String str="aaa.jpg"
	public static String getExtendName(String fileName) {
		if (null!=fileName && fileName.length()>0) 
			return fileName.substring(fileName.lastIndexOf("."));
		return null;
	}

	/*
	 * 方法2：返回操作系统临时目录(5分)
	 */
	public static File getTempDirectory() {
		String path = System.getProperty("java.io.tmpdir");
		return new File(path);
	}

	/*
	 * 方法3：返回操作系统用户目录(5分) 例如Linux系统是在/home/{用户账号名}，Windows系统是在C:\Users\{用户账号名}>
	 */
	public static File getUserDirectory() {

		String path = System.getProperty("user.home");
		return new File(path);
	}

}
