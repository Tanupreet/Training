package com.tanu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExTest {
	public static void main(String args[]) {
		try {
			doCal();
		} catch (MyRuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void doCal() throws MyRuntimeException {
		// try
		// {
		int a[] = new int[2];
		if (3 > a.length)
			throw new MyRuntimeException("not valid");
		System.out.println("Access element three" + a[3]);
		// } catch (MyRuntimeException e)
		{
			System.out.println("warning!!!");// TODO Auto-generated catch block
		}
	}

}
