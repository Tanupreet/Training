package com.tanu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExTest {
public static void main(String args[])
{
	try{
		doCal();
}catch(Exception e){System.out.println("hacked");
	}
}
	

public static void doCal()
	{
	try
		{
		int a[]=new int[2];
		System.out.println("Access element three"+a[2]);
		} catch (Exception e) 
			{
			System.out.println("warning!!!");// TODO Auto-generated catch block
			};
	}


}

