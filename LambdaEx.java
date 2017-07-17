package com.tanu.project;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaEx {

	public static void main(String args[])
	{
		
		
		List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		
		num.forEach(new Consumer<Integer>() {
			
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
		/*num.forEach((value)->System.out.println(value));*/
		
		num.forEach(System.out::println);
	}
}
