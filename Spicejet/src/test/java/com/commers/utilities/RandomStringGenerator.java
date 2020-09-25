package com.commers.utilities;

import org.apache.commons.lang.RandomStringUtils;

public class RandomStringGenerator {
	
	public static String s1()
	{
		String dummy1 = RandomStringUtils.randomAlphabetic(10);
		return dummy1;
				
	}
	
	public static String s2()
	{
		String dummy2 = RandomStringUtils.randomAlphabetic(50);
		return dummy2;
	}
	public static String num1()
	{
		String num = RandomStringUtils.randomNumeric(10);
		return "+91" + num;
	}
	
	

}
