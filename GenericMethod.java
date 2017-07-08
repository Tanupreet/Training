package com.tanu;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {
	public static <T> void fill(List<T> list, T val) {
		for (int i = 0; i < list.size(); i++)
			list.set(i, val);
	}
}

class GenericMeth{
	public static void main(String args[])
	{
		List<Integer>intList= new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);intList.add(10);
		System.out.println("The list is"+ intList);
		GenericMethod.fill(intList,100);
		System.out.println("The list after calling utilites.fill  is:"+intList);
	}
}