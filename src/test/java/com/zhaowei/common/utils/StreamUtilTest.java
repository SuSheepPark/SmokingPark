/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StreamUtilTest.java 
 * @Prject: zhaowei.common
 * @Package: com.zhaowei.common.utils 
 * @Description: TODO
 * @author: zw   
 * @date: 2019年9月6日 上午10:53:47 
 * @version: V1.0   
 */
package com.zhaowei.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

/** 
 * @ClassName: StreamUtilTest 
 * @Description: TODO
 * @author: zw
 * @date: 2019年9月6日 上午10:53:47  
 */
public class StreamUtilTest {

	/**
	 * Test method for {@link com.zhaowei.common.utils.StreamUtil#closeAll(java.lang.AutoCloseable[])}.
	 */
	@Test
	public void testCloseAll() {
		
	}

	/**
	 * Test method for {@link com.zhaowei.common.utils.StreamUtil#readTextFile(java.io.InputStream)}.
	 * @throws FileNotFoundException 
	 */
	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException {
		
		String readTextFile = StreamUtil.readTextFile(new FileInputStream("F:/zhaowei.txt"));
		
		System.out.println(readTextFile);
	}

	/**
	 * Test method for {@link com.zhaowei.common.utils.StreamUtil#readTextFile(java.io.File)}.
	 */
	@Test
	public void testReadTextFileFile() {
		String file = StreamUtil.readTextFile(new File("F:/zhaowei.txt"));
		System.out.println(file);

	}

}
