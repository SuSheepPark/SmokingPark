/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: FileUtilTest.java 
 * @Prject: zhaowei.common
 * @Package: com.zhaowei.common.utils 
 * @Description: TODO
 * @author: zw   
 * @date: 2019年9月6日 上午9:46:26 
 * @version: V1.0   
 */
package com.zhaowei.common.utils;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

/** 
 * @ClassName: FileUtilTest 
 * @Description: TODO
 * @author: zw
 * @date: 2019年9月6日 上午9:46:26  
 */
public class FileUtilTest {

	/**
	 * Test method for {@link com.zhaowei.common.utils.FileUtil#getExtendName(java.lang.String)}.
	 */
	@Test
	public void testGetExtendName() {
		String str = "tgg.doc";
		String string = FileUtil.getExtendName(str);
		System.out.println(string);
		
	}

	/**
	 * Test method for {@link com.zhaowei.common.utils.FileUtil#getTempDirectory()}.
	 */
	@Test
	public void testGetTempDirectory() {
		File file = FileUtil.getTempDirectory();
		System.out.println(file);

	}

	/**
	 * Test method for {@link com.zhaowei.common.utils.FileUtil#getUserDirectory()}.
	 */
	@Test
	public void testGetUserDirectory() {
		File file = FileUtil.getTempDirectory();
		System.out.println(file);

	}

}
