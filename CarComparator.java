package com.tanu;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

	public int compare(Car arg0, Car arg1){
	
		return arg0.getColor().compareTo(arg1.getColor());
	}
}
