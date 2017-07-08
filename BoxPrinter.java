package com.tanu;

import java.util.ArrayList;
import java.util.Collection;

public class BoxPrinter<T,S> {
	private T val;
	private S val1;
	public BoxPrinter(T arg,S arg1)
	{
		val=arg;
		val1=arg1;
	}
	public String toString(){
		return "["+val  + "\t" + val1+"]";
	}
}
class BoxPrinterTest{
	public static void main(String args[]) {
		Car car=new Car("a","a","a");
		BoxPrinter<Integer,Integer> value1=new BoxPrinter<Integer, Integer>(new Integer(10), new Integer(20));
		System.out.println(value1);
	
		BoxPrinter<String, String> value2=new BoxPrinter<String, String>("Hello","Hi");
		System.out.println(value2);
		
		BoxPrinter<Car,Car> value3=new BoxPrinter<Car,Car>(car,car);
		System.out.println(value3);
	}
	
}
