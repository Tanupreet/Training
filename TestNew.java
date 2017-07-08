package com.tanu;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;

public class TestNew {
	Testing t;

	@BeforeClass
	public static void testEx() {
		System.out.println("111");

	}

	@Before
	public void setUp() {
		System.out.println("Setting up");
		t = new Testing();
		// System.out.println("hh");
	}

	@Test
	public void testAssertions() {
		// test data
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";

		int val1 = 5;
		int val2 = 6;

		String[] expectedArray = { "one", "two", "three" };
		String[] resultArray = { "one", "two", "three" };

		// Check that two objects are equal
		assertEquals(str1, str2);

		// Check that a condition is true
		assertTrue(val1 < val2);

		// Check that a condition is false
		assertFalse(val1 > val2);

		// Check that an object isn't null
		assertNotNull(str1);

		// Check that an object is null
		assertNull(str3);

		// Check if two object references point to the same object
		assertSame(str4, str5);

		// Check if two object references not point to the same object
		assertNotSame(str1, str3);

		// Check whether two arrays are equal to each other.
		assertArrayEquals(expectedArray, resultArray);
	}

	@Test
	public void testFirst() {
		Assert.assertEquals(String.class, t.getMessage().getClass());
	}

	@Test(expected = ArithmeticException.class)
	public void testException() {
		t.div(5, 0);
	}

	@After
	public void tearDown() {
		System.out.println("releasing");
		t = null;
	}

	@Ignore
	public void testAbc() {
		System.out.println("abc");
	}

	@Test(timeout = 10)
	public void testCheckEven() {
		System.out.println("jj");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("5555");

	}
}
