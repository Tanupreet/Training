package com.tanu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TestCollection  {
	
	
	public static void main(String args[]) 
	{
Set<Car> arrayList=new HashSet<Car>();
Car c=new Car("A1","White","Audi");
arrayList.add(new Car("A1","White","Audi"));
arrayList.add(new Car("A2","Red","Audi"));
arrayList.add(new Car("A3","Black","Audi"));
arrayList.add(new Car("A4","Blue","Audi"));
arrayList.add(new Car("A4","Blue","Audi"));
arrayList.add(new Car("A4","Blue","Audi"));
arrayList.add(c);
arrayList.add(c);



/*
Collections.sort(linkedList, new Comparator<Car>()
{
public int compare(Car arg0, Car arg1) {
	return arg1.getColor().compareTo(arg0.getColor());
}
	});
	*/
for(Car car: arrayList)
{
	System.out.println(car.hashCode());
	System.out.println("Model " +car.getModel() + " Color "+car.getColor()+" Brand "+car.getCompany());
}

	}
}
	

