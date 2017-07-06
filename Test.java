package com.tanu;
//import java.util.Comparator;

public class Test  {
public static void  main(String args[])
{
	Car c1=new Car("AS","Red","Audi");
	Car c2=new Car("AS","Red","Audi");
	
	System.out.println(new CarComparator().compare(c1,c2));
//	CarComparator comp;
//	System.out.println();
}
}
