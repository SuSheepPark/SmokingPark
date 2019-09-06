/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: RandomUtilTest.java 
 * @Prject: zhaowei.common
 * @Package: com.zhaowei.common.utils 
 * @Description: TODO
 * @author: zw   
 * @date: 2019年9月6日 下午4:29:03 
 * @version: V1.0   
 */
package com.zhaowei.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * @ClassName: RandomUtilTest 
 * @Description: TODO
 * @author: zw
 * @date: 2019年9月6日 下午4:29:03  
 */
public class RandomUtilTest {

	/**
	 * Test method for {@link com.zhaowei.common.utils.RandomUtil#random(int, int)}.
	 */
	@Test
	public void testRandom() {
		for(int i=0;i<10;i++) {
			RandomUtil.random(1, 3);
		}
	
	}

	/**
	 * Test method for {@link com.zhaowei.common.utils.RandomUtil#subRandom(int, int, int)}.
	 */
	@Test
	public void testSubRandom() {
		int[] subRandom = RandomUtil.subRandom(1, 100, 10);
		for (int i : subRandom) {
			System.out.println(i+"  ");
		}
	}

	/**
	 * Test method for {@link com.zhaowei.common.utils.RandomUtil#randomCharacter()}.
	 */
	@Test
	public void testRandomCharacter() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.zhaowei.common.utils.RandomUtil#randomString(int)}.
	 */
	@Test
	public void testRandomString() {
		fail("Not yet implemented");
	}

}
