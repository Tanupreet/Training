package com.tanu;

import junit.framework.TestCase;

public class TestNew extends TestCase {
	Testing t;

	public void setUp()

	{
		t=new Testing();
		//System.out.println("hh");
	}
	
	public void testCheckEven(){
		assertTrue(t.CheckEven(16));
	}
	public void testCheckEvenNegative(){
		assertTrue(!t.CheckEven(1));
	}
	public void testSum(){
		assertTrue(t.sum(2,3)==5);
	}
}
