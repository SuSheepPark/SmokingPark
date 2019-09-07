/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StringUtilTest.java 
 * @Prject: zhaowei.common
 * @Package: com.zhaowei.common.utils 
 * @Description: TODO
 * @author: zw   
 * @date: 2019年9月7日 下午3:49:58 
 * @version: V1.0   
 */
package com.zhaowei.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * @ClassName: StringUtilTest 
 * @Description: TODO
 * @author: zw
 * @date: 2019年9月7日 下午3:49:58  
 */
public class StringUtilTest {

	/**
	 * Test method for {@link com.zhaowei.common.utils.StringUtil#hasLength(java.lang.String)}.
	 */
	@Test
	public void testHasLength() {
		boolean hasLength = StringUtil.hasLength("");
		System.out.println(hasLength);
	}

	/**
	 * Test method for {@link com.zhaowei.common.utils.StringUtil#hasText(java.lang.String)}.
	 */
	@Test
	public void testHasText() {
		boolean hasText = StringUtil.hasText("");
		System.out.println(hasText);
	}

	/**
	 * Test method for {@link com.zhaowei.common.utils.StringUtil#randomChineseString(int)}.
	 */
	@Test
	public void testRandomChineseStringInt() {
		String randomChineseString = StringUtil.randomChineseString(150);
		System.out.println(randomChineseString);
	}

	/**
	 * Test method for {@link com.zhaowei.common.utils.StringUtil#randomChineseString()}.
	 */
	@Test
	public void testRandomChineseString() {
	}

	/**
	 * Test method for {@link com.zhaowei.common.utils.StringUtil#generateChineseName()}.
	 */
	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 150; i++) {
			String generateChineseName = StringUtil.generateChineseName();
			System.out.println(generateChineseName);
		}
	}

}
