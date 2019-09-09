/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: WeekTestTest.java 
 * @Prject: zhaowei.common
 * @Package: com.zhaowei.common.utils 
 * @Description: TODO
 * @author: zw   
 * @date: 2019年9月7日 下午4:59:36 
 * @version: V1.0   
 */
package com.zhaowei.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * @ClassName: WeekTestTest 
 * @Description: TODO
 * @author: zw
 * @date: 2019年9月7日 下午4:59:36  
 */
public class WeekTestTest {

	/**
	 * Test method for {@link com.zhaowei.common.utils.WeekTest#checkCellphone(java.lang.String)}.
	 */
	@Test
	public void testCheckCellphone() {
		
		boolean checkCellphone = WeekTest.checkCellphone("1391238");
		if(checkCellphone) {
			System.out.println("验证成功");
		}else {
			System.out.println("验证失败");
		}
	}
	@Test
	public void testcheckCellemail() {
		boolean checkCellemail = WeekTest.checkCellemail("1540476506@qcom");
		if(checkCellemail) {
			System.out.println("验证成功");
		}else {
			System.out.println("验证失败");
		}
	}
	
}
