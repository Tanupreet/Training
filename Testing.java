package com.tanu;
//import java.*;
import java.lang.ArithmeticException;
public class Testing {

	public String getMessage()
	{
		return System.out.toString();
	}
	boolean CheckEven(int n) 
	{
		//throw new NullPointerException("abc");
		if(n == 0)
			
			return true;
		if((n % 2)== 0)
		return true;
		else 
			return false;
		
	}
	int sum(int a,int b)
	{
		return a+b;

	}
	public int div(int i, int j) throws ArithmeticException
	{
	//wait(1);
		if( i/j ==0)
		throw new ArithmeticException("div by 0 warning");
		
		else
			return i/j;
		
		
	}
	
}
