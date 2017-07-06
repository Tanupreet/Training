package com.tanu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestCollection  {
	
	
	public static void main(String args[]) 
	{
HashMap<Person, Car> arrayList=new HashMap<Person, Car>();
Car c=new Car("A1","White","Audi");
arrayList.put(new Person("Tanu",23), new Car("A1","White","Audi"));
arrayList.put(new Person("Rahul",22), new Car("A2","White","Audi"));
arrayList.put(new Person("Vibhor",23), new Car("A3","White","Audi"));
arrayList.put(new Person("Rohan",25), new Car("A4","White","Audi"));
arrayList.put(new Person("Prashant",25), new Car("A5","White","Audi"));
//arrayList.add(new Car("A2","Red","Audi"));
//arrayList.add(new Car("A3","Black","Audi"));
//arrayList.add(new Car("A4","Blue","Audi"));
//arrayList.add(new Car("A4","Blue","Audi"));
//arrayList.add(new Car("A4","Blue","Audi"));
//arrayList.add(c);
//arrayList.add(c);



/*
Collections.sort(linkedList, new Comparator<Car>()
{
public int compare(Car arg0, Car arg1) {
	return arg1.getColor().compareTo(arg0.getColor());
}
	});
	*/
for(Map.Entry<Person, Car> car:arrayList.entrySet())
{
	System.out.println(car.hashCode());
	System.out.println("Key: " +car.getKey() + " Value "+car.getValue());
}
	}
}
	

